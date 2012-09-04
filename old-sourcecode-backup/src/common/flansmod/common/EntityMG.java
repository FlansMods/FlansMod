package flansmod.common;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityDamageSource;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumGameType;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

import org.lwjgl.input.Mouse;

public class EntityMG extends Entity
{
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
		prevPosX = (double)x + 0.5D;
		prevPosY = (double)y;
		prevPosZ = (double)z + 0.5D;
		setPosition((double)x + 0.5D, (double)y, (double)z + 0.5D);
		direction = dir;
		rotationYaw = 0;
		rotationPitch = -60;
		type = gunType;
		ignoreFrustumCheck = true;
		mgs.add(this);
	}
		
	public boolean canBeCollidedWith()
    {
        return !isDead;
    }
	
	public void onUpdate()
	{
		super.onUpdate();
		if(worldObj.getBlockId(blockX, blockY - 1, blockZ) == 0)
		{
			setDead();
		}
		prevRotationYaw = rotationYaw;
		prevRotationPitch = rotationPitch;
		if(gunner != null)
		{
			rotationYaw = gunner.rotationYaw - direction * 90;
			for(; rotationYaw < -180; rotationYaw += 360) {}
			for(; rotationYaw > 180; rotationYaw -= 360) {}
			rotationPitch = gunner.rotationPitch;
			//Keep it within reasonable angles
			if(rotationYaw > type.sideViewLimit)
				prevRotationYaw = rotationYaw = type.sideViewLimit;
			if(rotationYaw < - type.sideViewLimit)
				prevRotationYaw = rotationYaw = - type.sideViewLimit;
			
			//Keep user standing behind the gun
			float angle = (float)direction * 90F + rotationYaw;
			double dX = (double)(type.standBackDist * Math.sin(angle * 3.1415926535F / 180F));
 			double dZ = - (double)(type.standBackDist * Math.cos(angle * 3.1415926535F / 180F));
            gunner.setPosition((double)(blockX + 0.5D + dX), blockY + gunner.getYOffset() - 0.5D, (double)(blockZ + 0.5D + dZ));
			//gunner.setPosition((double)(blockX + (direction == 1 ? 1 : 0) - (direction == 3 ? 1 : 0)) + 0.5D, blockY + gunner.getYOffset() - 0.5D, (double)(blockZ - (direction == 0 ? 1 : 0) + (direction == 2 ? 1 : 0)) + 0.5D);
		}
		else
		{
			rotationPitch--;
		}
			
		if(rotationPitch < type.topViewLimit)
			rotationPitch = type.topViewLimit;
		if(rotationPitch > type.bottomViewLimit)
			rotationPitch = type.bottomViewLimit;
		
		//Decrement the reload timer and reload
		if(reloadTimer > 0)
			reloadTimer--;
		if(ammo != null && ammo.getItemDamage() == ammo.getMaxDamage())
		{
			ammo = null;
			//Scrap metal output?
		}
		if(ammo == null && gunner != null)
		{
			int slot = findAmmo(gunner);
			if(slot >= 0)
			{
				ammo = gunner.inventory.getStackInSlot(slot);
				if(worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
					gunner.inventory.setInventorySlotContents(slot, null);
				reloadTimer = type.reloadTime;
				worldObj.playSoundAtEntity(this, type.reloadSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
			}
		}
		if(gunner != null && type.mode == 1 && Mouse.isButtonDown(0))
		{
			//Check for ammo / reloading
			if(ammo == null || reloadTimer > 0 || FlansMod.shootTime > 0)
			{
				return;
			}
			//Fire
			BulletType bullet = BulletType.getBullet(ammo.itemID);
			if(worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
				ammo.damageItem(1, gunner);
			FlansMod.shootTime = type.shootDelay;
			if(!worldObj.isRemote)
			{
				worldObj.spawnEntityInWorld(new EntityBullet(worldObj, Vec3.createVectorHelper(blockX + 0.5D, blockY + type.pivotHeight, blockZ + 0.5D), (direction * 90F + rotationYaw), rotationPitch, gunner, type.accuracy, type.damage, bullet));
				if(soundDelay <= 0)
				{
					float distortion = type.distortSound ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1F;
					worldObj.playSoundAtEntity(this, type.shootSound, 1.0F, distortion);
					soundDelay = type.shootSoundLength;
				}
			}
		}
		if(soundDelay > 0)
			soundDelay--;
	}	
	
	public boolean attackEntityFrom(DamageSource damagesource, int i)
    {
		if(damagesource.damageType.equals("player"))
		{
			Entity player = ((EntityDamageSource)damagesource).getEntity();
			if(player == gunner)
			{
				//Player left clicked on the gun
				if(type.mode == 1)
					return true;
				//Check for ammo / reloading
				if(ammo == null || reloadTimer > 0 || FlansMod.shootTime > 0)
				{
					return true;
				}
				//Fire
				BulletType bullet = BulletType.getBullet(ammo.itemID);
				if(worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
					ammo.damageItem(1, (EntityLiving)player);
				FlansMod.shootTime = type.shootDelay;
				if(!worldObj.isRemote)
				{
					worldObj.spawnEntityInWorld(new EntityBullet(worldObj, (EntityLiving)player, type.accuracy, type.damage, bullet, type.speed, false));
					if(soundDelay <= 0)
					{
						float distortion = type.distortSound ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1F;
						worldObj.playSoundAtEntity(this, type.shootSound, 1.0F, distortion);
						soundDelay = type.shootSoundLength;
					}
				}
			}
			else
			{
				//Break gun
				setDead();
			}
		}	
		return true;
	}
	
	public boolean interact(EntityPlayer entityplayer)
    {
		//Player right clicked on gun
		//Mount gun
        if(gunner != null && (gunner instanceof EntityPlayer) && gunner != entityplayer)
        {
            return true;
        }
        if(!worldObj.isRemote)
        {
			if(gunner == entityplayer)
			{
				getBase(gunner).mountingGun = null;
				gunner = null;
				return true;
			}
			if(getBase(entityplayer).mountingGun != null)
				return true;
            gunner = entityplayer;
			getBase(gunner).mountingGun = this;
			if(ammo == null)
			{
				int slot = findAmmo(entityplayer);
				if(slot >= 0)
				{
					ammo = entityplayer.inventory.getStackInSlot(slot);
					entityplayer.inventory.setInventorySlotContents(slot, null);
					reloadTimer = type.reloadTime;
					worldObj.playSoundAtEntity(this, type.reloadSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
				}
			}
        }
        return true;
    }
	
	private PlayerBaseFlan getBase(EntityPlayer player)
	{
		return ((PlayerBaseFlan)(FlansMod.papi.getPlayerBase("Flan")));
	}
	
	public int findAmmo(EntityPlayer player)
	{
		for(int i = 0; i < player.inventory.getSizeInventory(); i++)
		{
			ItemStack stack = player.inventory.getStackInSlot(i);
			if(type.isAmmo(stack))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void setDead()
	{
		super.setDead();
		//Drop gun
		dropItem(type.getItem().shiftedIndex, 1);
		//Drop ammo box
		if(ammo != null)
			entityDropItem(ammo, 0.5F);
		if(gunner != null)
			getBase(gunner).mountingGun = null;
	}
	
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
		nbttagcompound.setString("Type", type.shortName);
		if(ammo != null)
		{
			nbttagcompound.setShort("AmmoID", (short)ammo.itemID);
			nbttagcompound.setShort("AmmoDamage", (short)ammo.getItemDamage());
		}
		nbttagcompound.setInteger("BlockX", blockX);
 		nbttagcompound.setInteger("BlockY", blockY);
 		nbttagcompound.setInteger("BlockZ", blockZ);
 		nbttagcompound.setByte("Dir", (byte)direction);
   }

    protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
		type = GunType.getGun(nbttagcompound.getString("Type"));
		blockX = nbttagcompound.getInteger("BlockX");
		blockY = nbttagcompound.getInteger("BlockY");
		blockZ = nbttagcompound.getInteger("BlockZ");
		direction = nbttagcompound.getByte("Dir");
		int ammoID = nbttagcompound.getShort("AmmoID");
 		int ammoDamage = nbttagcompound.getShort("AmmoDamage");
		if(ammoID > 0)
		{
			ammo = new ItemStack(ammoID, 1, ammoDamage);
		}
    }
	
	protected void entityInit() {}
	
	public int blockX, blockY, blockZ;
	public int direction;
	public GunType type;
	public ItemStack ammo;
	public int reloadTimer;
	public int soundDelay;
	public static List<EntityMG> mgs = new ArrayList<EntityMG>();
	public EntityPlayer gunner;
}
