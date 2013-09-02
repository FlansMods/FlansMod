package co.uk.flansmods.common;

import java.util.List;

import co.uk.flansmods.client.debug.EntityDebugAABB;
import co.uk.flansmods.client.debug.EntityDebugVector;
import co.uk.flansmods.common.driveables.DriveableData;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.guns.EntityGrenade;
import co.uk.flansmods.common.network.PacketFlak;
import co.uk.flansmods.common.teams.TeamsManager;
import co.uk.flansmods.common.vector.Vector3f;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemTool extends Item 
{
	public ToolType type;

    public ItemTool(int i, ToolType t)
    {
        super(i);
        maxStackSize = 1;
		type = t;
		type.item = this;
		setMaxDamage(type.toolLife);
		setCreativeTab(FlansMod.tabFlanParts);
    }
    
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips) 
	{
		
	}
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }
    
	@Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
		if(type.parachute)
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
		
		if(type.remote)
		{
			FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(entityplayer, world.isRemote ? Side.CLIENT : Side.SERVER);
			//If we have some remote explosives out there
			if(data.remoteExplosives.size() > 0)
			{
				//Detonate it
				data.remoteExplosives.get(0).detonate();
				//Remove it from the list to detonate
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
		
    	//Raytracing
        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F);
        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F);
        float cosPitch = -MathHelper.cos(entityplayer.rotationPitch * 0.01745329F);
        float sinPitch = MathHelper.sin(entityplayer.rotationPitch * 0.01745329F);
        double length = -5D;
        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - (double)entityplayer.yOffset, entityplayer.posZ);        
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
					DriveablePart part = driveable.raytraceParts(new Vector3f(posVec), new Vector3f(lookVec.subtract(posVec)));
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
			for (int l = 0; l < list.size(); l++)
			{
				if(!(list.get(l) instanceof EntityLivingBase))
					continue;
				EntityLivingBase checkEntity = (EntityLivingBase)list.get(l);
				//Don't check the player using it
				if(checkEntity == entityplayer)
					continue;
				//Do a more accurate ray trace on this entity
				MovingObjectPosition hit = checkEntity.boundingBox.calculateIntercept(posVec, lookVec);
				//If it hit, heal it
				if(hit != null)
					hitLiving = checkEntity;
			}
	        //Now heal whatever it was we just decided to heal
	        if(hitLiving != null)
	        {        		
	        	hitLiving.heal(type.healAmount);
	        	PacketDispatcher.sendPacketToAllAround(hitLiving.posX, hitLiving.posY, hitLiving.posZ, 50F, hitLiving.dimension, PacketFlak.buildFlakPacket(hitLiving.posX, hitLiving.posY, hitLiving.posZ, 5, "heart"));
	        	
				//If not in creative and the tool should decay, damage it
				if(!entityplayer.capabilities.isCreativeMode && type.toolLife > 0)
					itemstack.setItemDamage(itemstack.getItemDamage() + 1);
				//If the tool is damagable and is destroyed upon being used up, then destroy it
				if(type.toolLife > 0 && type.destroyOnEmpty && itemstack.getItemDamage() == itemstack.getMaxDamage())
					itemstack.stackSize--;
	        }
        }
        return itemstack;
    }
}
