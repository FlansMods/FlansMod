package co.uk.flansmods.common;

import org.lwjgl.input.Mouse;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumGameType;
import net.minecraft.world.World;

import co.uk.flansmods.client.model.ModelAAGun;
import co.uk.flansmods.common.network.PacketMGFire;
import co.uk.flansmods.common.network.PacketPlaySound;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityAAGun extends Entity implements IEntityAdditionalSpawnData
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
	public boolean mouseHeld;
	public boolean wasShooting;

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

	@Override
	public AxisAlignedBB getCollisionBox(Entity entity)
	{
		return entity.boundingBox;
	}

	@Override
	public AxisAlignedBB getBoundingBox()
	{
		return boundingBox;
	}

	@Override
	public boolean canBePushed()
	{
		return false;
	}

	@Override
	public double getMountedYOffset()
	{
		return 0D;
	}
	
	public void setMouseHeld(boolean held)
	{
		mouseHeld = held;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, int i)
	{
		if (damagesource.damageType.equals("player"))
		{
			Entity player = ((EntityDamageSource) damagesource).getEntity();
			if (player == riddenByEntity)
			{

			} else if(riddenByEntity != null)
			{
				return riddenByEntity.attackEntityFrom(damagesource, i);
			} else if(FlansMod.canBreakGuns)
			{
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

	@Override
	public boolean canBeCollidedWith()
	{
		return !isDead;
	}

	@Override
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
		
		if (worldObj.isRemote && riddenByEntity != null && riddenByEntity == FMLClientHandler.instance().getClient().thePlayer)
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
		

		
		if (!worldObj.isRemote && mouseHeld && riddenByEntity != null && riddenByEntity instanceof EntityPlayer && reloadTimer <= 0 && shootDelay <= 0)
		{
			EntityPlayer player = (EntityPlayer)riddenByEntity;
			for (int j = 0; j < type.numBarrels; j++)
			{
				if (shootDelay <= 0 && ammo[j] != null && (!type.fireAlternately || type.fireAlternately && currentBarrel == j))
				{
					// Fire
					BulletType bullet = BulletType.getBullet(ammo[j].itemID);
					if (worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
						ammo[j].damageItem(1, player);
					shootDelay = type.shootDelay;
					barrelRecoil[j] = type.recoil;
					worldObj.spawnEntityInWorld(new EntityBullet(worldObj, rotate(type.barrelX[currentBarrel] / 16D - type.barrelZ[currentBarrel] / 16D, type.barrelY[currentBarrel] / 16D, type.barrelX[currentBarrel] / 16D + type.barrelZ[currentBarrel] / 16D).addVector(posX, posY, posZ), gunYaw + 90F, gunPitch, player, type.accuracy, type.damage, bullet));
					PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.shootSound));
				}
			}
			currentBarrel = (currentBarrel + 1) % type.numBarrels;
		}
	}

	@Override
	public void setDead()
	{
		super.setDead();
		// Drop gun
		if(worldObj.isRemote)
			return;
		dropItem(type.getItem().shiftedIndex, 1);
		// Drop ammo boxes
		for (ItemStack stack : ammo)
		{
			if (stack != null)
				entityDropItem(stack, 0.5F);
		}
	}

	@Override
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

	@Override
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

	@Override
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

	@Override
	public float getShadowSize()
	{
		return 0.0F;
	}

	@Override
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

	@Override
	public void writeSpawnData(ByteArrayDataOutput data) {
		// TODO Auto-generated method stub
		data.writeUTF(type.shortName);
	}

	@Override
	public void readSpawnData(ByteArrayDataInput data) {
		// TODO Auto-generated method stub
		try
		{
			type = AAGunType.getAAGun(data.readUTF());
			initType();
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retreive AA gun type from server.");
			super.setDead();
			e.printStackTrace();
		}
	}
}