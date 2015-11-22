package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.netty.buffer.ByteBuf;

import org.lwjgl.input.Mouse;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketMGFire;
import com.flansmod.common.network.PacketMGMount;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;

public class EntityMG extends Entity implements IEntityAdditionalSpawnData
{
	public int blockX, blockY, blockZ;
	public int direction;
	public GunType type;
	public ItemStack ammo;
	public int reloadTimer;
	public int soundDelay;
	public int shootDelay;
	public static List<EntityMG> mgs = new ArrayList<EntityMG>();
	public EntityPlayer gunner;
	//Server side
	public boolean isShooting;
	//Client side
	public boolean wasShooting = false;
	
	public int ticksSinceUsed = 0;
	
	public EntityMG(World world)
	{
		super(world);
		setSize(1.0F, 1.0F);
		ignoreFrustumCheck = true;
	}

	public EntityMG(World world, int x, int y, int z, int dir, GunType gunType)
	{
		super(world);
		setSize(1.0F, 1.0F);
		blockX = x;
		blockY = y;
		blockZ = z;
		prevPosX = x + 0.5D;
		prevPosY = y;
		prevPosZ = z + 0.5D;
		setPosition(x + 0.5D, y, z + 0.5D);
		direction = dir;
		rotationYaw = 0;
		rotationPitch = -60;
		type = gunType;
		ignoreFrustumCheck = true;
		mgs.add(this);
	}

	@Override
	public boolean canBeCollidedWith()
	{
		return !isDead;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		ticksSinceUsed++;
		if(TeamsManager.mgLife > 0 && ticksSinceUsed > TeamsManager.mgLife * 20)
		{
			setDead();
		}
		if (worldObj.getBlock(blockX, blockY - 1, blockZ) == null)
		{
			if(!worldObj.isRemote)
			{
				setDead();
			}
		}
		prevRotationYaw = rotationYaw;
		prevRotationPitch = rotationPitch;
		if (gunner != null)
		{
			ticksSinceUsed = 0;
			rotationYaw = gunner.rotationYaw - direction * 90;
			for (; rotationYaw < -180; rotationYaw += 360)
			{
			}
			for (; rotationYaw > 180; rotationYaw -= 360)
			{
			}
			rotationPitch = gunner.rotationPitch;
			// Keep it within reasonable angles
			if (rotationYaw > type.sideViewLimit)
				prevRotationYaw = rotationYaw = type.sideViewLimit;
			if (rotationYaw < -type.sideViewLimit)
				prevRotationYaw = rotationYaw = -type.sideViewLimit;

			// Keep user standing behind the gun
			float angle = direction * 90F + rotationYaw;
			double dX = (type.standBackDist * Math.sin(angle * 3.1415926535F / 180F));
			double dZ = -(type.standBackDist * Math.cos(angle * 3.1415926535F / 180F));
			gunner.setPosition((blockX + 0.5D + dX), blockY + gunner.getYOffset() - 0.5D, (blockZ + 0.5D + dZ));
			// gunner.setPosition((double)(blockX + (direction == 1 ? 1 : 0) -
			// (direction == 3 ? 1 : 0)) + 0.5D, blockY + gunner.getYOffset() -
			// 0.5D, (double)(blockZ - (direction == 0 ? 1 : 0) + (direction ==
			// 2 ? 1 : 0)) + 0.5D);
		} else
		{
			rotationPitch--;
		}

		if (rotationPitch < type.topViewLimit)
			rotationPitch = type.topViewLimit;
		if (rotationPitch > type.bottomViewLimit)
			rotationPitch = type.bottomViewLimit;
		
		if(shootDelay > 0)
			shootDelay--;

		// Decrement the reload timer and reload
		if (reloadTimer > 0)
			reloadTimer--;
		if (ammo != null && ammo.getItemDamage() == ammo.getMaxDamage())
		{
			ammo = null;
			// Scrap metal output?
		}
		if (ammo == null && gunner != null)
		{
			int slot = findAmmo(gunner);
			if (slot >= 0)
			{
				ammo = gunner.inventory.getStackInSlot(slot);
				if (!gunner.capabilities.isCreativeMode)
					gunner.inventory.setInventorySlotContents(slot, null);
				reloadTimer = type.reloadTime;
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.reloadSound, false);
			}
		}
		if (worldObj.isRemote && gunner != null && gunner == FMLClientHandler.instance().getClient().thePlayer && type.mode == EnumFireMode.FULLAUTO)
		{
			//Send a packet!
			checkForShooting();
		}
		if(!worldObj.isRemote && isShooting)
		{
			if(gunner == null || gunner.isDead)
				isShooting = false;
			// Check for ammo / reloading
			if (ammo == null || reloadTimer > 0 || shootDelay > 0)
			{
				return;
			}
			// Fire
			BulletType bullet = BulletType.getBullet(ammo.getItem());
			if (gunner != null && !gunner.capabilities.isCreativeMode)
				ammo.damageItem(1, gunner);
			shootDelay = type.shootDelay;
			worldObj.spawnEntityInWorld(((ItemBullet)ammo.getItem()).getEntity(worldObj, Vec3.createVectorHelper(blockX + 0.5D, blockY + type.pivotHeight, blockZ + 0.5D), (direction * 90F + rotationYaw), rotationPitch, gunner, type.bulletSpread, type.damage, ammo.getItemDamage(), type));
			if (soundDelay <= 0)
			{
				soundDelay = type.shootSoundLength;
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.shootSound, type.distortSound);
			}
		}
		if (soundDelay > 0)
			soundDelay--;
	}
	
	@SideOnly(Side.CLIENT)
	private void checkForShooting()
	{
		if(Mouse.isButtonDown(0) && !wasShooting && !FlansMod.proxy.isScreenOpen())
		{
			FlansMod.getPacketHandler().sendToServer(new PacketMGFire(true));
			wasShooting = true;
		}
		else if(!Mouse.isButtonDown(0) && wasShooting)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketMGFire(false));
			wasShooting = false;
		}
	}
	
	//Server side setter to be called upon receiving a packet
	public void mouseHeld(boolean held)
	{
		isShooting = held;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
	{
		if (damagesource.damageType.equals("player"))
		{
			Entity player = damagesource.getEntity();
			if (player == gunner)
			{
				// Player left clicked on the gun
				if (type.mode == EnumFireMode.FULLAUTO)
					return true;
				// Check for ammo / reloading
				if (ammo == null || reloadTimer > 0 || shootDelay > 0)
				{
					return true;
				}
				// Fire
				BulletType bullet = BulletType.getBullet(ammo.getItem());
				if (gunner != null && !gunner.capabilities.isCreativeMode)
					ammo.damageItem(1, (EntityLiving) player);
				shootDelay = type.shootDelay;
				if (!worldObj.isRemote)
				{
					worldObj.spawnEntityInWorld(((ItemBullet)ammo.getItem()).getEntity(worldObj, (EntityLivingBase) player, type.bulletSpread, type.damage, type.bulletSpeed, false, ammo.getItemDamage(), type));
				}
				if (soundDelay <= 0)
				{
					float distortion = type.distortSound ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1F;
					//worldObj.playSoundAtEntity(this, type.shootSound, 1.0F, distortion);
					PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.shootSound, type.distortSound);

					soundDelay = type.shootSoundLength;
				}
			} else if(gunner != null)
			{
				return gunner.attackEntityFrom(damagesource, i);
			} else if(TeamsManager.canBreakGuns)
			{
				setDead();
			}
		}
		return true;
	}

	@Override
	public boolean interactFirst(EntityPlayer player) //interact : change back when Forge updates
	{
		// Player right clicked on gun
		// Mount gun
		if (gunner != null && (gunner instanceof EntityPlayer) && gunner != player)
		{
			return true;
		}
		if (!worldObj.isRemote)
		{
			//If this is the player currently using this MG, dismount
			if(gunner == player)
			{
				mountGun(player, false);
				FlansMod.getPacketHandler().sendToAllAround(new PacketMGMount(player, this, false), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
				return true;
			}
			
			//If this person is already mounting a gun, dismount it first
			if(PlayerHandler.getPlayerData(player).mountingGun != null && !PlayerHandler.getPlayerData(player).mountingGun.isDead)
			{
				PlayerHandler.getPlayerData(player).mountingGun.mountGun(player, false);
				return true;
			}
			
			//Spectators can't mount guns
			if(TeamsManager.instance.currentRound != null && PlayerHandler.getPlayerData(player).team == Team.spectators)
				return true;

			//None of the above applied, so mount the gun
			mountGun(player, true);
			FlansMod.getPacketHandler().sendToAllAround(new PacketMGMount(player, this, true), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
			if (ammo == null)
			{
				int slot = findAmmo(player);
				if (slot >= 0)
				{
					ammo = player.inventory.getStackInSlot(slot);
					player.inventory.setInventorySlotContents(slot, null);
					reloadTimer = type.reloadTime;
					worldObj.playSoundAtEntity(this, type.reloadSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
				}
			}
			
		}
		return true;
	}
	
	public void mountGun(EntityPlayer player, boolean mounting)
	{
		if(player == null)
			return;
		Side side = worldObj.isRemote ? Side.CLIENT : Side.SERVER;
		if(PlayerHandler.getPlayerData(player, side) == null)
			return;
		if(mounting)
		{
			gunner = player;
			PlayerHandler.getPlayerData(player, side).mountingGun = this;
		}
		else
		{
			PlayerHandler.getPlayerData(player, side).mountingGun = null;
			gunner = null;
		}
	}
	
	public int findAmmo(EntityPlayer player)
	{
		for (int i = 0; i < player.inventory.getSizeInventory(); i++)
		{
			ItemStack stack = player.inventory.getStackInSlot(i);
			if (type.isAmmo(stack))
			{
				return i;
			}
		}
		return -1;
	}

	@Override
	public void setDead()
	{
		// Drop gun
		if(!worldObj.isRemote)
		{
			if(TeamsManager.weaponDrops == 2)
			{
				EntityGunItem gunEntity = new EntityGunItem(worldObj, posX, posY, posZ, new ItemStack(type.getItem()), Arrays.asList(ammo));
				worldObj.spawnEntityInWorld(gunEntity);
			}
			else if(TeamsManager.weaponDrops == 1)
			{
				dropItem(type.getItem(), 1);
				// Drop ammo box
				if (ammo != null)
					entityDropItem(ammo, 0.5F);
			}
		}
		if (gunner != null && PlayerHandler.getPlayerData(gunner) != null)
			PlayerHandler.getPlayerData(gunner).mountingGun = null;
		
		super.setDead();
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		nbttagcompound.setString("Type", type.shortName);
		if (ammo != null)
		{
			nbttagcompound.setTag("Ammo", ammo.writeToNBT(new NBTTagCompound()));
		}
		nbttagcompound.setInteger("BlockX", blockX);
		nbttagcompound.setInteger("BlockY", blockY);
		nbttagcompound.setInteger("BlockZ", blockZ);
		nbttagcompound.setByte("Dir", (byte) direction);
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		type = GunType.getGun(nbttagcompound.getString("Type"));
		blockX = nbttagcompound.getInteger("BlockX");
		blockY = nbttagcompound.getInteger("BlockY");
		blockZ = nbttagcompound.getInteger("BlockZ");
		direction = nbttagcompound.getByte("Dir");
		ammo = ItemStack.loadItemStackFromNBT(nbttagcompound.getCompoundTag("Ammo"));
	}

	@Override
	protected void entityInit()
	{
	}
	
	@Override
	public void writeSpawnData(ByteBuf data) 
	{
		ByteBufUtils.writeUTF8String(data, type.shortName);
		data.writeInt(direction);
		data.writeInt(blockX);
		data.writeInt(blockY);
		data.writeInt(blockZ);
		ByteBufUtils.writeItemStack(data, ammo);
	}

	@Override
	public void readSpawnData(ByteBuf data) 
	{
		try
		{
			type = GunType.getGun(ByteBufUtils.readUTF8String(data));
			direction = data.readInt();
			blockX = data.readInt();
			blockY = data.readInt();
			blockZ = data.readInt();
			ammo = ByteBufUtils.readItemStack(data);
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retreive gun type from server.");
			super.setDead();
			e.printStackTrace();
		}
	}
	
	@Override
    public ItemStack getPickedResult(MovingObjectPosition target)
    {
		ItemStack stack = new ItemStack(type.item, 1, 0);
		return stack;
    }
}