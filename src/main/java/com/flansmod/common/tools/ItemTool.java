package com.flansmod.common.tools;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.DriveableType.ShootParticle;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.vector.Vector3f;

public class ItemTool extends ItemFood 
{
	public ToolType type;
	
    private static final String CHAR_LIST = 
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int RANDOM_STRING_LENGTH = 10;


	public ItemTool(ToolType t)
	{
		super(t.foodness, false);
		maxStackSize = 1;
		type = t;
		type.item = this;
		setMaxDamage(type.toolLife);
		setRegistryName(type.shortName);
		if(type.foodness == 0)
		{
			setCreativeTab(FlansMod.tabFlanParts);
			if(type.remote)
				setCreativeTab(FlansMod.tabFlanGuns);
			if(type.healDriveables)
				setCreativeTab(FlansMod.tabFlanDriveables);
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<String> lines, ITooltipFlag b)
	{
		if(!type.packName.isEmpty())
		{
			lines.add(type.packName);
		}
		if(type.description != null)
		{
            Collections.addAll(lines, type.description.split("_"));
		}
		if(stack.stackTagCompound != null)
		{
			lines.add(stack.stackTagCompound.getString("key"));
		}
	}

	public void onCreated(ItemStack itemStack, World world, EntityPlayer player)
	{
	    itemStack.stackTagCompound = new NBTTagCompound();
	    itemStack.stackTagCompound.setString("key", generateRandomString());
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityplayer, EnumHand hand)
	{
		ItemStack itemstack = entityplayer.getHeldItem(hand);
		if(type.foodness > 0)
			return super.onItemRightClick(world, entityplayer, hand);
		
		else if(type.parachute)
		{
			if(EntityParachute.canUseParachute(entityplayer))
			{
				EntityParachute parachute = new EntityParachute(world, type, entityplayer);
				world.spawnEntity(parachute);
				entityplayer.startRiding(parachute);
			}
			
			//If not in creative and the tool should decay, damage it
			if(!entityplayer.capabilities.isCreativeMode && type.toolLife > 0)
				itemstack.setItemDamage(itemstack.getItemDamage() + 1);
			//If the tool is damagable and is destroyed upon being used up, then destroy it
			if(type.toolLife > 0 && type.destroyOnEmpty && itemstack.getItemDamage() == itemstack.getMaxDamage())
				itemstack.setCount(itemstack.getCount() - 1);
			//Our work here is done. Let's be off
			return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
		}
		else if(type.remote)
		{
			PlayerData data = PlayerHandler.getPlayerData(entityplayer, world.isRemote ? Side.CLIENT : Side.SERVER);
			Iterator<EntityGrenade> i = data.remoteExplosives.iterator();
			while (i.hasNext())
			{
				EntityGrenade grenade = i.next();
				if(grenade.isDead)
				{
					i.remove();
				}
			}
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
					itemstack.setCount(itemstack.getCount() - 1);
				//Our work here is done. Let's be off
				return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
			}
		}
		else
		{
			
			//Raytracing
			float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F);
			float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F);
			float cosPitch = -MathHelper.cos(entityplayer.rotationPitch * 0.01745329F);
			float sinPitch = MathHelper.sin(entityplayer.rotationPitch * 0.01745329F);
			double length = 5D;
			Vec3d posVec = new Vec3d(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.getYOffset(), entityplayer.posZ);
			Vec3d lookVec = posVec.add(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
			
			if(world.isRemote && FlansMod.DEBUG)
			{
				world.spawnEntity(new EntityDebugVector(world, new Vector3f(posVec), new Vector3f(posVec.subtract(lookVec)), 100));
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
									itemstack.setCount(itemstack.getCount() - 1);
								//Our work here is done. Let's be off
								return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
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
				List list = world.getEntitiesWithinAABB(EntityLivingBase.class, new AxisAlignedBB(
						Math.min(posVec.x, lookVec.x), Math.min(posVec.y, lookVec.y), Math.min(posVec.z, lookVec.z),
						Math.max(posVec.x, lookVec.x), Math.max(posVec.y, lookVec.y), Math.max(posVec.z, lookVec.z)));
				for(Object aList : list)
				{
					if(!(aList instanceof EntityLivingBase))
						continue;
					EntityLivingBase checkEntity = (EntityLivingBase)aList;
					//Don't check the player using it
					if(checkEntity == entityplayer)
						continue;
					//Do a more accurate ray trace on this entity
					RayTraceResult hit = checkEntity.getEntityBoundingBox().calculateIntercept(posVec, lookVec);
					//If it hit, heal it
					if(hit != null)
						hitLiving = checkEntity;
				}
				//Now heal whatever it was we just decided to heal
				if(hitLiving != null)
				{
					//If its finished, don't use it
					if(itemstack.getItemDamage() >= itemstack.getMaxDamage() && type.toolLife > 0)
						return new ActionResult<>(EnumActionResult.FAIL, itemstack);
					
					hitLiving.heal(type.healAmount);
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(hitLiving.posX, hitLiving.posY, hitLiving.posZ, 5, "heart"), new NetworkRegistry.TargetPoint(hitLiving.dimension, hitLiving.posX, hitLiving.posY, hitLiving.posZ, 50F));
					
					//If not in creative and the tool should decay, damage it
					if(!entityplayer.capabilities.isCreativeMode && type.toolLife > 0)
						itemstack.setItemDamage(itemstack.getItemDamage() + 1);
					//If the tool is damagable and is destroyed upon being used up, then destroy it
					if(type.toolLife > 0 && type.destroyOnEmpty && itemstack.getItemDamage() >= itemstack.getMaxDamage())
						itemstack.setCount(itemstack.getCount() - 1);
					
					return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
				}
			}

			if(!world.isRemote && type.key)
			{
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
							if (part.owner.locked)
							{
								if(itemstack.stackTagCompound == null)
								{
								    itemstack.stackTagCompound = new NBTTagCompound();
								    itemstack.stackTagCompound.setString("key", generateRandomString());
								}
								part.owner.unlock(itemstack.stackTagCompound.getString("key"), entityplayer);
								return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
							}
							else if (!part.owner.locked)
							{
								if(itemstack.stackTagCompound == null)
								{
								    itemstack.stackTagCompound = new NBTTagCompound();
								    itemstack.stackTagCompound.setString("key", generateRandomString());
								}
								part.owner.lock(itemstack.stackTagCompound.getString("key"), entityplayer);
								return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
							}
						}
					}
				}
	        }
		}
		return new ActionResult<>(EnumActionResult.FAIL, itemstack);
	}
	
    public String generateRandomString()
    {
        
        StringBuffer randStr = new StringBuffer();
        for(int i=0; i<RANDOM_STRING_LENGTH; i++)
        {
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }
     
    /**
     * This method generates random numbers
     * @return int
     */
    private int getRandomNumber()
    {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1)
        {
            return randomInt;
        }
        else
        {
            return randomInt - 1;
        }
    }
	
	@Override
	public String toString()
	{
		return type == null ? getTranslationKey() : type.name;
	}
	
	@Override
	public InfoType getInfoType()
	{
		return type;
	}
}
