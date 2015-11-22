package com.flansmod.common.guns;

import io.netty.buffer.ByteBuf;

import org.lwjgl.input.Mouse;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
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
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketAAGunAngles;
import com.flansmod.common.network.PacketMGFire;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;

public class EntityAAGun extends Entity implements IEntityAdditionalSpawnData
{
	private int sUpdateTime;
	private double sPosX;
	private double sPosY;
	private double sPosZ;
	private double sYaw;
	private double sPitch;
	private double field_9388_j;
	private double field_9387_k;
	private double field_9386_l;

	private int health;
	private int shootDelay;
	/** Gun angles */
	public float gunYaw, gunPitch;
	/** Prev gun angles */
	public float prevGunYaw, prevGunPitch;
	public float barrelRecoil[];
	public AAGunType type;
	public Entity towedByEntity;
	public ItemStack[] ammo; // One per barrel
	public int reloadTimer;
	public int currentBarrel; // For cycling through firing each barrel
	public boolean mouseHeld;
	public boolean wasShooting;
	
	//Sentry stuff
	/** Stops the sentry shooting whoever placed it or their teammates */
	public EntityPlayer placer = null;
	/** For getting the placer after a reload */
	public String placerName = null;
	/** The sentry's current target */
	public Entity target = null;
	/** How often to check for new targets */
	public static final float targetAcquireInterval = 10;
	
	public int ticksSinceUsed = 0;

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

	public EntityAAGun(World world, AAGunType type1, double d, double d1, double d2, EntityPlayer p)
	{
		this(world);
		placer = p;
		placerName = p.getCommandSenderName();
		type = type1;
		initType();
		setPosition(d, d1, d2);
	}

	@Override
	public void setPosition(double d, double d1, double d2)
	{
		posX = d;
		posY = d1;
		posZ = d2;
		float f = width / 2.0F;
		float f1 = height;
		boundingBox.setBounds(d - f, (d1 - yOffset) + ySize, d2 - f, d + f, (d1 - yOffset) + ySize + f1, d2 + f);
	}
	
	@Override
    public void setPositionAndRotation2(double d, double d1, double d2, float f, float f1, int i)
    {
		sPosX = d;
		sPosY = d1;
		sPosZ = d2;
		sYaw = f;
		sPitch = f1;
		sUpdateTime = i;
    }

	public void initType()
	{
		health = type.health;
		barrelRecoil = new float[type.numBarrels];
		ammo = new ItemStack[type.numBarrels];
	}

	@Override
	protected void entityInit()
	{
	}
	
	@Override
    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) 
	{
		
	}
	
	@Override
	public void applyEntityCollision(Entity entity)
	{
		//if(entity != riddenByEntity)
			//super.applyEntityCollision(entity);
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
	public boolean attackEntityFrom(DamageSource damagesource, float i)
	{
		if (damagesource.damageType.equals("player"))
		{
			Entity player = damagesource.getEntity();
			if (player == riddenByEntity)
			{
				
			} else if(riddenByEntity != null)
			{
				return riddenByEntity.attackEntityFrom(damagesource, i);
			} else if(TeamsManager.canBreakGuns)
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
		
		prevGunYaw = gunYaw;
		prevGunPitch = gunPitch;
		
		ticksSinceUsed++;
		if(TeamsManager.aaLife > 0 && ticksSinceUsed > TeamsManager.aaLife * 20)
		{
			setDead();
		}

		if (riddenByEntity != null)
		{
			ticksSinceUsed = 0;
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
		
		// Sentry stuff
		if(isSentry())
		{
			if(target != null && target.isDead)
				target = null;
			//Find a new target if we don't currently have one
			if(target == null && ticksExisted % targetAcquireInterval == 0)
			{
				target = getValidTarget();
			}
			if(target != null)
			{
				double dX = target.posX - posX;
				double dY = target.posY - (posY + 1.5F);
				double dZ = target.posZ - posZ;
				
				double distanceToTarget = Math.sqrt(dX * dX + dY * dY + dZ * dZ);

				if(distanceToTarget > type.targetRange)
					target = null;
				else
				{
					float newYaw = 180F + (float)Math.atan2(dZ, dX) * 180F / 3.14159F;
					float newPitch = -(float)Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180F / 3.14159F;
					
					float turnSpeed = 0.25F;
					
					gunYaw += (newYaw - gunYaw) * turnSpeed;
					gunPitch += (newPitch - gunPitch) * turnSpeed;
				}
			}
		}
			
		// apply gravity

		if (!onGround && !worldObj.isRemote)
			motionY -= 9.8D / 400D;

		// update motion
		motionX *= 0.5;
		motionZ *= 0.5;
		moveEntity(motionX, motionY, motionZ);
		
		if (worldObj.isRemote && riddenByEntity != null && riddenByEntity == FMLClientHandler.instance().getClient().thePlayer)
		{
			checkForShooting();
		}

		if (worldObj.isRemote)
		{
			if (sUpdateTime > 0)
			{
				double d1 = posX + (sPosX - posX) / sUpdateTime;
				double d5 = posY + (sPosY - posY) / sUpdateTime;
				double d9 = posZ + (sPosZ - posZ) / sUpdateTime;
				double d12;
				for (d12 = sYaw - rotationYaw; d12 < -180D; d12 += 360D)
				{
				}
				for (; d12 >= 180D; d12 -= 360D)
				{
				}
				rotationYaw += d12 / sUpdateTime;
				rotationPitch += (sPitch - rotationPitch) / sUpdateTime;
				sUpdateTime--;
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
		//If it is 0 or less, go ahead and reload
		else
		{
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
						if (!((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
							((EntityPlayer) riddenByEntity).inventory.decrStackSize(slot, 1);
						reloadTimer = type.reloadTime;
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.reloadSound, true);
					}
				}
			}
		}

		
		if(!worldObj.isRemote && reloadTimer <= 0 && shootDelay <= 0)
		{
			if(mouseHeld && riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
			{
				EntityPlayer player = (EntityPlayer)riddenByEntity;
				for(int j = 0; j < type.numBarrels; j++)
				{
					if(shootDelay <= 0 && ammo[j] != null && (!type.fireAlternately || type.fireAlternately && currentBarrel == j))
					{
						// Fire
						BulletType bullet = BulletType.getBullet(ammo[j].getItem());
						if (!((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
							ammo[j].damageItem(1, player);
						shootDelay = type.shootDelay;
						barrelRecoil[j] = type.recoil;
						worldObj.spawnEntityInWorld(((ItemBullet)ammo[j].getItem()).getEntity(worldObj, rotate(type.barrelX[currentBarrel] / 16D - type.barrelZ[currentBarrel] / 16D, type.barrelY[currentBarrel] / 16D, type.barrelX[currentBarrel] / 16D + type.barrelZ[currentBarrel] / 16D).addVector(posX, posY, posZ), gunYaw + 90F, gunPitch, player, type.accuracy, type.damage, ammo[j].getItemDamage(), type));
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.shootSound, true);
					}
				}
				currentBarrel = (currentBarrel + 1) % type.numBarrels;
			}
			else if(target != null)
			{
				for(int j = 0; j < type.numBarrels; j++)
				{
					int ammoSlot = j;
					if(type.shareAmmo)
						ammoSlot = 0;
					if(shootDelay <= 0 && ammo[ammoSlot] != null && (!type.fireAlternately || type.fireAlternately && currentBarrel == ammoSlot))
					{
						// Fire
						BulletType bullet = BulletType.getBullet(ammo[ammoSlot].getItem());
						ammo[ammoSlot].setItemDamage(ammo[ammoSlot].getItemDamage() + 1);
						shootDelay = type.shootDelay;
						barrelRecoil[ammoSlot] = type.recoil;
						worldObj.spawnEntityInWorld(((ItemBullet)ammo[ammoSlot].getItem()).getEntity(worldObj, rotate(type.barrelX[currentBarrel] / 16D - type.barrelZ[currentBarrel] / 16D, type.barrelY[currentBarrel] / 16D, type.barrelX[currentBarrel] / 16D + type.barrelZ[currentBarrel] / 16D).addVector(posX, posY + 1.5F, posZ), gunYaw + 90F, gunPitch, placer, type.accuracy, type.damage, ammo[ammoSlot].getItemDamage(), type));
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.shootSound, true);
					}
				}
				currentBarrel = (currentBarrel + 1) % type.numBarrels;
			}
		}
		if(!worldObj.isRemote)
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketAAGunAngles(this), posX, posY, posZ, 50F, dimension);
		}
	}
	
	public boolean isSentry()
	{
		return type.targetMobs || type.targetPlayers;
	}
	
	public Entity getValidTarget()
	{
		if(worldObj.isRemote)
			return null;
		if(placer == null && placerName != null)
			placer = worldObj.getPlayerEntityByName(placerName);
		for(Object obj : worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(type.targetRange, type.targetRange, type.targetRange)))
		{
			Entity candidateEntity = (Entity)obj;
			
			if((type.targetMobs && candidateEntity instanceof EntityMob) || (type.targetPlayers && candidateEntity instanceof EntityPlayer))
			{
				//Check that this entity is actually in range and visible
				if(candidateEntity.getDistanceToEntity(this) < type.targetRange)
				{
					if(candidateEntity instanceof EntityPlayer)
					{
						if(candidateEntity == placer || candidateEntity.getCommandSenderName().equals(placerName))
							continue;
						if(TeamsManager.enabled && TeamsManager.getInstance().currentRound != null && placer != null)
						{
							PlayerData placerData = PlayerHandler.getPlayerData(placer, worldObj.isRemote ? Side.CLIENT : Side.SERVER);
							PlayerData candidateData = PlayerHandler.getPlayerData((EntityPlayer)candidateEntity, worldObj.isRemote ? Side.CLIENT : Side.SERVER);
							if(candidateData.team == Team.spectators || candidateData.team == null)
								continue;
							if(!TeamsManager.getInstance().currentRound.gametype.playerCanAttack((EntityPlayerMP)placer, placerData.team, (EntityPlayerMP)candidateEntity, candidateData.team))
								continue;
						}
					}
					return candidateEntity;
				}
			}
		}
		return null;
	}
	
	@SideOnly(Side.CLIENT)
	private void checkForShooting()
	{
		//Send a packet!
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

	@Override
	public void setDead()
	{
		super.setDead();
		// Drop gun
		if(worldObj.isRemote)
			return;
		dropItem(type.getItem(), 1);
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
				nbttagcompound.setTag("Ammo " + i, ammo[i].writeToNBT(new NBTTagCompound()));
		}
		nbttagcompound.setString("Placer", placer.getCommandSenderName());
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
		placerName = nbttagcompound.getString("Placer");
	}

	@Override
	public float getShadowSize()
	{
		return 0.0F;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) //interact : change back when Forge updates
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
				entityplayer.mountEntity(null);
				return true;
			}
			if(!isSentry())
				entityplayer.mountEntity(this);
			for (int i = 0; i < (type.shareAmmo ? 1 : type.numBarrels); i++)
			{
				if (ammo[i] == null)
				{
					int slot = findAmmo(entityplayer);
					if (slot >= 0)
					{
						ammo[i] = entityplayer.inventory.getStackInSlot(slot).copy();
						ammo[i].stackSize = 1;
						if(!entityplayer.capabilities.isCreativeMode)
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
	public void writeSpawnData(ByteBuf data)
	{
		ByteBufUtils.writeUTF8String(data, type.shortName);
	}

	@Override
	public void readSpawnData(ByteBuf data) 
	{
		try
		{
			type = AAGunType.getAAGun(ByteBufUtils.readUTF8String(data));
			initType();
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retreive AA gun type from server.");
			super.setDead();
			e.printStackTrace();
		}
	}
	
	@Override
    public boolean canRiderInteract()
    {
        return false;
    }
	
	@Override
    public ItemStack getPickedResult(MovingObjectPosition target)
    {
		ItemStack stack = new ItemStack(type.item, 1, 0);
		return stack;
    }
}