package flan.server;

import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.src.AxisAlignedBB;
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

public class EntityAAGun extends Entity
{
	private int field_9394_d;
	private double field_9393_e;
	private double field_9392_f;
	private double field_9391_g;
	private double field_9390_h;
	private double field_9389_i;
	private double field_9388_j;
	private double field_9387_k;
	private double field_9386_l;

	private int health;
	private int shootDelay;
	public float gunYaw;
	public float gunPitch;
	public float barrelRecoil[];
	public AAGunType type;
	public Entity towedByEntity;
	public ItemStack[] ammo; // One per barrel
	public int reloadTimer;
	public int currentBarrel; // For cycling through firing each barrel

	public EntityAAGun(World world)
	{
		super(world);
		preventEntitySpawning = true;
		setSize(2.0F, 2.0F);
		yOffset = 0F;
		gunYaw = 0;
		gunPitch = 0;
		shootDelay = 0;
	}

	public EntityAAGun(World world, AAGunType type1, double d, double d1, double d2)
	{
		this(world);
		type = type1;
		initType();
		setPosition(d, d1, d2);
	}

	public void setPosition(double d, double d1, double d2)
	{
		posX = d;
		posY = d1;
		posZ = d2;
		float f = width / 2.0F;
		float f1 = height;
		boundingBox.setBounds(d - (double) f, (d1 - (double) yOffset) + (double) ySize, d2 - (double) f, d + (double) f, (d1 - (double) yOffset) + (double) ySize + (double) f1, d2 + (double) f);
	}

	public void initType()
	{
		health = type.health;
		barrelRecoil = new float[type.numBarrels];
		ammo = new ItemStack[type.numBarrels];
	}

	protected void entityInit()
	{
	}

	public AxisAlignedBB getCollisionBox(Entity entity)
	{
		return entity.boundingBox;
	}

	public AxisAlignedBB getBoundingBox()
	{
		return boundingBox;
	}

	public boolean canBePushed()
	{
		return false;
	}

	public double getMountedYOffset()
	{
		return 0D;
	}

	public boolean attackEntityFrom(DamageSource damagesource, int i)
	{
		if (damagesource.damageType.equals("player"))
		{
			Entity player = ((EntityDamageSource) damagesource).getEntity();
			if (player == riddenByEntity)
			{
				// Player left clicked on the gun
				// Check for ammo / reloading
				if (reloadTimer > 0 || FlansMod.shootTime > 0)
				{
					return true;
				}
				for (int j = 0; j < type.numBarrels; j++)
				{
					if (FlansMod.shootTime <= 0 && ammo[j] != null && (!type.fireAlternately || type.fireAlternately && currentBarrel == j))
					{
						// Fire
						BulletType bullet = BulletType.getBullet(ammo[j].itemID);
						if (worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
							ammo[j].damageItem(1, (EntityLiving) player);
						FlansMod.shootTime = type.shootDelay;
						barrelRecoil[j] = type.recoil;
						if (!worldObj.isRemote)
						{
							FlansMod.proxy.spawnAAGun(worldObj, posX, posY, posZ, type, gunYaw, gunPitch, rand, bullet, this, player);
						}
					}
				}
				currentBarrel = (currentBarrel + 1) % type.numBarrels;
			} else
			{
				// Break gun
				setDead();
			}
		} else
		{
			setBeenAttacked();
			health -= i;
			if (!worldObj.isRemote && health <= 0)
				setDead();
		}
		return true;
	}

	public Vec3 rotate(double x, double y, double z)
	{
		double cosYaw = Math.cos(180F - gunYaw * 3.14159265F / 180F);
		double sinYaw = Math.sin(180F - gunYaw * 3.14159265F / 180F);
		double cosPitch = Math.cos(gunPitch * 3.14159265F / 180F);
		double sinPitch = Math.sin(gunPitch * 3.14159265F / 180F);

		double newX = x * cosYaw + (y * sinPitch + z * cosPitch) * sinYaw;
		double newY = y * cosPitch - z * sinPitch;
		double newZ = -x * sinYaw + (y * sinPitch + z * cosPitch) * cosYaw;

		return Vec3.createVectorHelper(newX, newY, newZ);
	}

	public boolean canBeCollidedWith()
	{
		return !isDead;
	}

	public void onUpdate()
	{
		super.onUpdate();
		if (riddenByEntity != null)
		{
			gunYaw = riddenByEntity.rotationYaw - 90;
			gunPitch = riddenByEntity.rotationPitch;
		}

		if (gunPitch > type.bottomViewLimit)
			gunPitch = type.bottomViewLimit;
		if (gunPitch < -type.topViewLimit)
			gunPitch = -type.topViewLimit;

		for (int i = 0; i < type.numBarrels; i++)
			barrelRecoil[i] *= 0.9F;

		if (shootDelay > 0)
			shootDelay--;

		// apply gravity

		if (!onGround)
			motionY -= 9.8D / 400D;

		// update motion
		motionX *= 0.5;
		motionZ *= 0.5;
		moveEntity(motionX, motionY, motionZ);

		if (worldObj.isRemote)
		{
			if (field_9394_d > 0)
			{
				double d1 = posX + (field_9393_e - posX) / (double) field_9394_d;
				double d5 = posY + (field_9392_f - posY) / (double) field_9394_d;
				double d9 = posZ + (field_9391_g - posZ) / (double) field_9394_d;
				double d12;
				for (d12 = field_9390_h - (double) rotationYaw; d12 < -180D; d12 += 360D)
				{
				}
				for (; d12 >= 180D; d12 -= 360D)
				{
				}
				rotationYaw += d12 / (double) field_9394_d;
				rotationPitch += (field_9389_i - (double) rotationPitch) / (double) field_9394_d;
				field_9394_d--;
				setPosition(d1, d5, d9);
				setRotation(rotationYaw, rotationPitch);
			}
			return;
		}

		if (riddenByEntity != null && riddenByEntity.isDead)
		{
			riddenByEntity = null;
		}

		// Decrement the reload timer and reload
		if (reloadTimer > 0)
			reloadTimer--;
		for (int i = 0; i < type.numBarrels; i++)
		{
			if (ammo[i] != null && ammo[i].getItemDamage() == ammo[i].getMaxDamage())
			{
				ammo[i] = null;
				// Scrap metal output?
			}
			if (ammo[i] == null && riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
			{
				int slot = findAmmo(((EntityPlayer) riddenByEntity));
				if (slot >= 0)
				{
					ammo[i] = ((EntityPlayer) riddenByEntity).inventory.getStackInSlot(slot);
					if (worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
						((EntityPlayer) riddenByEntity).inventory.decrStackSize(slot, 1);
					reloadTimer = type.reloadTime;
					worldObj.playSoundAtEntity(this, type.reloadSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
				}
			}
		}
	}

	public void setDead()
	{
		super.setDead();
		// Drop gun
		dropItem(type.getItem().shiftedIndex, 1);
		// Drop ammo boxes
		for (ItemStack stack : ammo)
		{
			if (stack != null)
				entityDropItem(stack, 0.5F);
		}
	}

	public void updateRiderPosition()
	{
		if (riddenByEntity == null)
		{
			return;
		}
		double x = type.gunnerX / 16D;
		double y = type.gunnerY / 16D;
		double z = type.gunnerZ / 16D;

		double cosYaw = Math.cos((-gunYaw / 180D) * 3.1415926535897931D);
		double sinYaw = Math.sin((-gunYaw / 180D) * 3.1415926535897931D);
		double cosPitch = Math.cos((gunPitch / 180D) * 3.1415926535897931D);
		double sinPitch = Math.sin((gunPitch / 180D) * 3.1415926535897931D);

		double x2 = x * cosYaw + z * sinYaw;
		double z2 = -x * sinYaw + z * cosYaw;

		riddenByEntity.setPosition(posX + x2, posY + y, posZ + z2);
		return;
	}

	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		nbttagcompound.setString("Type", type.shortName);
		nbttagcompound.setInteger("Health", health);
		nbttagcompound.setFloat("RotationYaw", rotationYaw);
		nbttagcompound.setFloat("RotationPitch", rotationPitch);
		for (int i = 0; i < type.numBarrels; i++)
		{
			if (ammo[i] != null)
				nbttagcompound.setCompoundTag("Ammo " + i, ammo[i].writeToNBT(new NBTTagCompound()));
		}
	}

	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		type = AAGunType.getAAGun(nbttagcompound.getString("Type"));
		initType();
		health = nbttagcompound.getInteger("Health");
		rotationYaw = nbttagcompound.getFloat("RotationYaw");
		rotationPitch = nbttagcompound.getFloat("RotationPitch");
		for (int i = 0; i < type.numBarrels; i++)
		{
			ammo[i] = ItemStack.loadItemStackFromNBT(nbttagcompound.getCompoundTag("Ammo " + i));
		}
	}

	public float getShadowSize()
	{
		return 0.0F;
	}

	public boolean interact(EntityPlayer entityplayer)
	{
		// Player right clicked on gun
		// Mount gun
		if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer)
		{
			return true;
		}
		if (!worldObj.isRemote)
		{
			if (riddenByEntity == entityplayer)
			{
				entityplayer.mountEntity(this);
				return true;
			}
			entityplayer.mountEntity(this);
			for (int i = 0; i < type.numBarrels; i++)
			{
				if (ammo[i] == null)
				{
					int slot = findAmmo(entityplayer);
					if (slot >= 0)
					{
						ammo[i] = entityplayer.inventory.getStackInSlot(slot);
						entityplayer.inventory.decrStackSize(slot, 1);
						reloadTimer = type.reloadTime;
						worldObj.playSoundAtEntity(this, type.reloadSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
					}
				}
			}
		}
		return true;
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
}