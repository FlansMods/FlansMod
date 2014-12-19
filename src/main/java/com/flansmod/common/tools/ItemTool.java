package com.flansmod.common.tools;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.vector.Vector3f;

public class ItemTool extends ItemFood 
{
	public ToolType type;

    public ItemTool(ToolType t)
    {
    	super(t.foodness, false);
        maxStackSize = 1;
		type = t;
		type.item = this;
		setMaxDamage(type.toolLife);
		if(type.foodness == 0)
		{
			setCreativeTab(FlansMod.tabFlanParts);
			if(type.remote)
				setCreativeTab(FlansMod.tabFlanGuns);
			if(type.healDriveables)
				setCreativeTab(FlansMod.tabFlanDriveables);
		}
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
    }
    
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		if(type.description != null)
		{
            Collections.addAll(lines, type.description.split("_"));
		}
	}
    
    @Override
	@SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }
    
	@Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
		if(type.foodness > 0)
			super.onItemRightClick(itemstack, world, entityplayer);
		
		else if(type.parachute)
		{
			//Create a parachute, spawn it and put the player in it
			if(!world.isRemote)
			{
				EntityParachute parachute = new EntityParachute(world, type, entityplayer);
				world.spawnEntityInWorld(parachute);
				entityplayer.mountEntity(parachute);
			}
			
			//If not in creative and the tool should decay, damage it
			if(!entityplayer.capabilities.isCreativeMode && type.toolLife > 0)
				itemstack.setItemDamage(itemstack.getItemDamage() + 1);
			//If the tool is damagable and is destroyed upon being used up, then destroy it
			if(type.toolLife > 0 && type.destroyOnEmpty && itemstack.getItemDamage() == itemstack.getMaxDamage())
				itemstack.stackSize--;
			//Our work here is done. Let's be off
			return itemstack;
		}
		
		else if(type.remote)
		{
			PlayerData data = PlayerHandler.getPlayerData(entityplayer, world.isRemote ? Side.CLIENT : Side.SERVER);
			//If we have some remote explosives out there
			if(data.remoteExplosives.size() > 0)
			{
				//Detonate it
				data.remoteExplosives.get(0).detonate();
				//Remove it from the list to detonate
				if(data.remoteExplosives.get(0).detonated)
					data.remoteExplosives.remove(0);
				
				//If not in creative and the tool should decay, damage it
				if(!entityplayer.capabilities.isCreativeMode && type.toolLife > 0)
					itemstack.setItemDamage(itemstack.getItemDamage() + 1);
				//If the tool is damagable and is destroyed upon being used up, then destroy it
				if(type.toolLife > 0 && type.destroyOnEmpty && itemstack.getItemDamage() == itemstack.getMaxDamage())
					itemstack.stackSize--;
				//Our work here is done. Let's be off
				return itemstack;
			}
		}
		else
		{
		
	    	//Raytracing
	        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F);
	        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F);
	        float cosPitch = -MathHelper.cos(entityplayer.rotationPitch * 0.01745329F);
	        float sinPitch = MathHelper.sin(entityplayer.rotationPitch * 0.01745329F);
	        double length = -5D;
	        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);        
	        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
	        
	        if(world.isRemote && FlansMod.DEBUG)
	        {
	        	world.spawnEntityInWorld(new EntityDebugVector(world, new Vector3f(posVec), new Vector3f(posVec.subtract(lookVec)), 100));
	        }
	        
	        if(type.healDriveables)
	        {
				//Iterate over all EntityDriveables
				for(int i = 0; i < world.loadedEntityList.size(); i++)
				{
					Object obj = world.loadedEntityList.get(i);
					if(obj instanceof EntityDriveable)
					{
						EntityDriveable driveable = (EntityDriveable)obj;
						//Raytrace
						DriveablePart part = driveable.raytraceParts(new Vector3f(posVec), Vector3f.sub(new Vector3f(lookVec), new Vector3f(posVec), null));
						//If we hit something that is healable
						if(part != null && part.maxHealth > 0)
						{
							//If its broken and the tool is inifinite or has durability left
							if(part.health < part.maxHealth && (type.toolLife == 0 || itemstack.getItemDamage() < itemstack.getMaxDamage()))
							{
								//Heal it
								part.health += type.healAmount;
								//If it is over full health, cap it
								if(part.health > part.maxHealth)
									part.health = part.maxHealth;
								//If not in creative and the tool should decay, damage it
								if(!entityplayer.capabilities.isCreativeMode && type.toolLife > 0)
									itemstack.setItemDamage(itemstack.getItemDamage() + 1);
								//If the tool is damagable and is destroyed upon being used up, then destroy it
								if(type.toolLife > 0 && type.destroyOnEmpty && itemstack.getItemDamage() == itemstack.getMaxDamage())
									itemstack.stackSize--;
								//Our work here is done. Let's be off
								return itemstack;
							}
						}
					}
				}
	        }
	
	        if(!world.isRemote && type.healPlayers)
	        {
	        	//By default, heal the player
		        EntityLivingBase hitLiving = entityplayer;
		        
				//Iterate over entities within range of the ray
				List list = world.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(
						Math.min(posVec.xCoord, lookVec.xCoord), Math.min(posVec.yCoord, lookVec.yCoord), Math.min(posVec.zCoord, lookVec.zCoord), 
						Math.max(posVec.xCoord, lookVec.xCoord), Math.max(posVec.yCoord, lookVec.yCoord), Math.max(posVec.zCoord, lookVec.zCoord)));
				for (Object aList : list) {
					if (!(aList instanceof EntityLivingBase))
						continue;
					EntityLivingBase checkEntity = (EntityLivingBase) aList;
					//Don't check the player using it
					if (checkEntity == entityplayer)
						continue;
					//Do a more accurate ray trace on this entity
					MovingObjectPosition hit = checkEntity.boundingBox.calculateIntercept(posVec, lookVec);
					//If it hit, heal it
					if (hit != null)
						hitLiving = checkEntity;
				}
		        //Now heal whatever it was we just decided to heal
		        if(hitLiving != null)
		        {        		
		        	//If its finished, don't use it
		        	if(itemstack.getItemDamage() >= itemstack.getMaxDamage() && type.toolLife > 0)
		        		return itemstack;
		        	
		        	hitLiving.heal(type.healAmount);
		        	FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(hitLiving.posX, hitLiving.posY, hitLiving.posZ, 5, "heart"), new NetworkRegistry.TargetPoint(hitLiving.dimension, hitLiving.posX, hitLiving.posY, hitLiving.posZ, 50F));
		        	
					//If not in creative and the tool should decay, damage it
					if(!entityplayer.capabilities.isCreativeMode && type.toolLife > 0)
						itemstack.setItemDamage(itemstack.getItemDamage() + 1);
					//If the tool is damagable and is destroyed upon being used up, then destroy it
					if(type.toolLife > 0 && type.destroyOnEmpty && itemstack.getItemDamage() >= itemstack.getMaxDamage())
						itemstack.stackSize--;
		        }
	        }
		}
        return itemstack;
    }
	
	@Override
	public String toString()
	{
		return type == null ? getUnlocalizedName() : type.name;
	}
}
