package co.uk.flansmods.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import org.lwjgl.input.Mouse;

import co.uk.flansmods.common.network.PacketMGFire;
import co.uk.flansmods.common.network.PacketMGMount;
import co.uk.flansmods.common.network.PacketPlaySound;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;

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
		prevPosX = (double) x + 0.5D;
		prevPosY = (double) y;
		prevPosZ = (double) z + 0.5D;
		setPosition((double) x + 0.5D, (double) y, (double) z + 0.5D);
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
		if (worldObj.getBlockId(blockX, blockY - 1, blockZ) == 0)
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
			float angle = (float) direction * 90F + rotationYaw;
			double dX = (double) (type.standBackDist * Math.sin(angle * 3.1415926535F / 180F));
			double dZ = -(double) (type.standBackDist * Math.cos(angle * 3.1415926535F / 180F));
			gunner.setPosition((double) (blockX + 0.5D + dX), blockY + gunner.getYOffset() - 0.5D, (double) (blockZ + 0.5D + dZ));
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
				PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.reloadSound));
			}
		}
		if (worldObj.isRemote && gunner != null && gunner == FMLClientHandler.instance().getClient().thePlayer && type.mode == 1)
		{
			//Send a packet!
			if(Mouse.isButtonDown(0) && !wasShooting)
			{
				PacketDispatcher.sendPacketToServer(PacketMGFire.buildMGFirePacket(true));
				wasShooting = true;
			}
			else if(!Mouse.isButtonDown(0) && wasShooting)
			{
				PacketDispatcher.sendPacketToServer(PacketMGFire.buildMGFirePacket(false));
				wasShooting = false;
			}
		}
		//if(!worldObj.isRemote)
			//System.out.println(isShooting);
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
			BulletType bullet = BulletType.getBullet(ammo.itemID);
			if (gunner != null && !gunner.capabilities.isCreativeMode)
				ammo.damageItem(1, gunner);
			shootDelay = type.shootDelay;
			worldObj.spawnEntityInWorld(new EntityBullet(worldObj, Vec3.createVectorHelper(blockX + 0.5D, blockY + type.pivotHeight, blockZ + 0.5D), (direction * 90F + rotationYaw), rotationPitch, gunner, type.accuracy, type.damage, bullet, type));
			if (soundDelay <= 0)
			{
				soundDelay = type.shootSoundLength;
				PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.shootSound, type.distortSound));
			}
		}
		if (soundDelay > 0)
			soundDelay--;
	}
	
	//Server side setter to be called upon receiving a packet
	public void mouseHeld(boolean held)
	{
		isShooting = held;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, int i)
	{
		if (damagesource.damageType.equals("player"))
		{
			Entity player = ((EntityDamageSource) damagesource).getEntity();
			if (player == gunner)
			{
				// Player left clicked on the gun
				if (type.mode == 1)
					return true;
				// Check for ammo / reloading
				if (ammo == null || reloadTimer > 0 || shootDelay > 0)
				{
					return true;
				}
				// Fire
				BulletType bullet = BulletType.getBullet(ammo.itemID);
				if (gunner != null && !((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
					ammo.damageItem(1, (EntityLiving) player);
				shootDelay = type.shootDelay;
				if (!worldObj.isRemote)
				{
					worldObj.spawnEntityInWorld(new EntityBullet(worldObj, (EntityLiving) player, type.accuracy, type.damage, bullet, type.speed, false, type));
				}
				if (soundDelay <= 0)
				{
					float distortion = type.distortSound ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1F;
					worldObj.playSoundAtEntity(this, type.shootSound, 1.0F, distortion);
					soundDelay = type.shootSoundLength;
				}
			} else if(gunner != null)
			{
				return gunner.attackEntityFrom(damagesource, i);
			} else if(FlansMod.canBreakGuns)
			{
				setDead();
			}
		}
		return true;
	}

	@Override
	public boolean interact(EntityPlayer player)
	{
		// Player right clicked on gun
		// Mount gun
		if (gunner != null && (gunner instanceof EntityPlayer) && gunner != player)
		{
			return true;
		}
		if (!worldObj.isRemote)
		{
			if (gunner == player)
			{
				mountGun(player, false);
				PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 100, dimension, PacketMGMount.buildMGPacket(player, this, false));
				return true;
			}
			if (FlansModPlayerHandler.getPlayerData(player).mountingGun != null && !FlansModPlayerHandler.getPlayerData(player).mountingGun.isDead)
			{
				return true;
			}

			mountGun(player, true);
			PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 100, dimension, PacketMGMount.buildMGPacket(player, this, true));
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
		Side side = worldObj.isRemote ? Side.CLIENT : Side.SERVER;
		if(mounting)
		{
			gunner = player;
			FlansModPlayerHandler.getPlayerData(gunner, side).mountingGun = this;
		}
		else
		{
			FlansModPlayerHandler.getPlayerData(gunner, side).mountingGun = null;
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
			dropItem(type.getItem().shiftedIndex, 1);
			// Drop ammo box
			if (ammo != null)
				entityDropItem(ammo, 0.5F);
		}
		if (gunner != null)
			FlansModPlayerHandler.getPlayerData(gunner).mountingGun = null;
		
		super.setDead();
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		nbttagcompound.setString("Type", type.shortName);
		if (ammo != null)
		{
			nbttagcompound.setShort("AmmoID", (short) ammo.itemID);
			nbttagcompound.setShort("AmmoDamage", (short) ammo.getItemDamage());
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
		int ammoID = nbttagcompound.getShort("AmmoID");
		int ammoDamage = nbttagcompound.getShort("AmmoDamage");
		if (ammoID > 0)
		{
			ammo = new ItemStack(ammoID, 1, ammoDamage);
		}
	}

	@Override
	protected void entityInit()
	{
	}
	
	@Override
	public void writeSpawnData(ByteArrayDataOutput data) {
		// TODO Auto-generated method stub
		data.writeUTF(type.shortName);
		data.writeInt(direction);
		data.writeInt(blockX);
		data.writeInt(blockY);
		data.writeInt(blockZ);
	}

	@Override
	public void readSpawnData(ByteArrayDataInput data) {
		// TODO Auto-generated method stub
		try
		{
			type = GunType.getGun(data.readUTF());
			direction = data.readInt();
			blockX = data.readInt();
			blockY = data.readInt();
			blockZ = data.readInt();
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retreive gun type from server.");
			super.setDead();
			e.printStackTrace();
		}
	}
}