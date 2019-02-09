package com.flansmod.common.driveables;

import java.util.ArrayList;
import java.util.List;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.api.IControllable;
import com.flansmod.api.IExplodeable;
import com.flansmod.client.EntityCamera;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableType.ParticleEmitter;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.InventoryHelper;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.ShotData;
import com.flansmod.common.guns.ShotData.InstantShotData;
import com.flansmod.common.guns.ShotData.SpawnEntityShotData;
import com.flansmod.common.guns.raytracing.FlansModRaytracer;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BulletHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.DriveableHit;
import com.flansmod.common.network.PacketDriveableDamage;
import com.flansmod.common.network.PacketDriveableKeyHeld;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.parts.EnumPartCategory;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;

import static com.flansmod.common.util.BlockUtil.destroyBlock;

public abstract class EntityDriveable extends Entity implements IControllable, IExplodeable, IEntityAdditionalSpawnData
{
	public boolean syncFromServer = true;
	/**
	 * Ticks since last server update. Use to smoothly transition to new position
	 */
	public int serverPositionTransitionTicker;
	/**
	 * Server side position, as synced by PacketVehicleControl packets
	 */
	public double serverPosX, serverPosY, serverPosZ;
	/**
	 * Server side rotation, as synced by PacketVehicleControl packets
	 */
	public double serverYaw, serverPitch, serverRoll;
	
	/**
	 * The driveable data which contains the inventory, the engine and the fuel
	 */
	public DriveableData driveableData;
	/**
	 * The shortName of the driveable type, used to obtain said type
	 */
	public String driveableType;
	
	/**
	 * The throttle, in the range -1, 1 is multiplied by the maxThrottle (or maxNegativeThrottle) from the plane type to
	 * obtain the thrust
	 */
	public float throttle;
	/**
	 * The wheels on this plane
	 */
	public EntityWheel[] wheels;
	
	public boolean fuelling;
	/**
	 * Extra prevRotation field for smoothness in all 3 rotational axes
	 */
	public float prevRotationRoll;
	/**
	 * Angular velocity
	 */
	public Vector3f angularVelocity = new Vector3f(0F, 0F, 0F);
	
	/**
	 * Whether each mouse button is held
	 */
	public boolean leftMouseHeld = false, rightMouseHeld = false;
	
	/**
	 * Shoot delay variables
	 */
	public float shootDelayPrimary, shootDelaySecondary;
	/**
	 * Minigun speed variables
	 */
	public float minigunSpeedPrimary, minigunSpeedSecondary;
	/**
	 * Current gun variables for alternating weapons.
	 */
	public int currentGunPrimary, currentGunSecondary;
	
	/**
	 * Angle of harvester aesthetic piece
	 */
	public float harvesterAngle;
	
	public RotatedAxes prevAxes;
	public RotatedAxes axes;
	
	private EntitySeat[] seats;
	/**
	 * Until this is true, just look for seat and wheel connections
	 */
	protected boolean readyForUpdates = false;
	
	private float yOffset;
	
	public EntityLivingBase camera;
	
	private int[] emitterTimers;
	
	public int animCount = 0;
	public int animFrame = 0;
	
	public EntityDriveable(World world)
	{
		super(world);
		axes = new RotatedAxes();
		prevAxes = new RotatedAxes();
		preventEntitySpawning = true;
		setSize(1F, 1F);
		yOffset = 6F / 16F;
		ignoreFrustumCheck = true;
	}
	
	public EntityDriveable(World world, DriveableType t, DriveableData d)
	{
		this(world);
		driveableType = t.shortName;
		driveableData = d;
	}
	
	protected void initType(DriveableType type, boolean firstSpawn, boolean clientSide)
	{
		seats = new EntitySeat[type.numPassengers + 1];
		wheels = new EntityWheel[type.wheelPositions.length];
		if(!clientSide && firstSpawn)
		{
			for(int i = 0; i < type.numPassengers + 1; i++)
			{
				seats[i] = new EntitySeat(world, this, i);
				world.spawnEntity(seats[i]);
				seats[i].startRiding(this);
			}
			
			for(int i = 0; i < wheels.length; i++)
			{
				wheels[i] = new EntityWheel(world, this, i);
				world.spawnEntity(wheels[i]);
				wheels[i].startRiding(this);
			}
		}
		stepHeight = type.wheelStepHeight;
		yOffset = type.yOffset;
		
		emitterTimers = new int[type.emitters.size()];
		for(int i = 0; i < type.emitters.size(); i++)
		{
			emitterTimers[i] = rand.nextInt(type.emitters.get(i).emitRate);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean isInRangeToRender3d(double x, double y, double z)
	{
		double dX = this.posX - x;
		double dY = this.posY - y;
		double dZ = this.posZ - z;
		double distSq = dX * dX + dY * dY + dZ * dZ;
		double maxDist = 200.0D * getRenderDistanceWeight();
		return distSq < maxDist * maxDist;
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound tag)
	{
		driveableData.writeToNBT(tag);
		tag.setString("Type", driveableType);
		tag.setFloat("RotationYaw", axes.getYaw());
		tag.setFloat("RotationPitch", axes.getPitch());
		tag.setFloat("RotationRoll", axes.getRoll());
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound tag)
	{
		driveableType = tag.getString("Type");
		driveableData = new DriveableData(tag);
		initType(DriveableType.getDriveable(driveableType), false, false);
		
		prevRotationYaw = tag.getFloat("RotationYaw");
		prevRotationPitch = tag.getFloat("RotationPitch");
		prevRotationRoll = tag.getFloat("RotationRoll");
		axes = new RotatedAxes(prevRotationYaw, prevRotationPitch, prevRotationRoll);
	}
	
	@Override
	public void writeSpawnData(ByteBuf data)
	{
		ByteBufUtils.writeUTF8String(data, driveableType);
		
		NBTTagCompound tag = new NBTTagCompound();
		driveableData.writeToNBT(tag);
		ByteBufUtils.writeTag(data, tag);
		
		data.writeFloat(axes.getYaw());
		data.writeFloat(axes.getPitch());
		data.writeFloat(axes.getRoll());
		
		// Write damage
		for(EnumDriveablePart ep : EnumDriveablePart.values())
		{
			DriveablePart part = getDriveableData().parts.get(ep);
			data.writeShort((short)part.health);
			data.writeBoolean(part.onFire);
		}
	}
	
	@Override
	public void readSpawnData(ByteBuf data)
	{
		try
		{
			driveableType = ByteBufUtils.readUTF8String(data);
			driveableData = new DriveableData(ByteBufUtils.readTag(data));
			initType(getDriveableType(), false, true);
			
			axes.setAngles(data.readFloat(), data.readFloat(), data.readFloat());
			prevRotationYaw = axes.getYaw();
			prevRotationPitch = axes.getPitch();
			prevRotationRoll = axes.getRoll();
			
			// Read damage
			for(EnumDriveablePart ep : EnumDriveablePart.values())
			{
				DriveablePart part = getDriveableData().parts.get(ep);
				part.health = data.readShort();
				part.onFire = data.readBoolean();
			}
			
		}
		catch(Exception e)
		{
			FlansMod.log.error("Failed to retrieve plane type from server.");
			super.setDead();
			FlansMod.log.throwing(e);
		}
		
		camera = new EntityCamera(world, this);
		world.spawnEntity(camera);
	}
	
	/**
	 * Called with the movement of the mouse. Used in controlling vehicles if need be.
	 *
	 * @param deltaY
	 * @param deltaX
	 * @return if mouse movement was handled.
	 */
	@Override
	public abstract void onMouseMoved(int deltaX, int deltaY);
	
	@Override
	@SideOnly(Side.CLIENT)
	public EntityLivingBase getCamera()
	{
		return camera;
	}
	
	protected boolean canSit(int seat)
	{
		return getDriveableType().numPassengers >= seat && seats[seat].getControllingPassenger() == null;
	}
	
	@Override
	protected boolean canTriggerWalking()
	{
		return false;
	}
	
	@Override
	protected void entityInit()
	{
	}
	
	@Override
	public AxisAlignedBB getCollisionBox(Entity entity)
	{
		return null;
	}
	
	@Override
	public boolean canBePushed()
	{
		return false;
	}
	
	@Override
	public double getMountedYOffset()
	{
		return -0.3D;
	}
	
	@Override
	public double getYOffset()
	{
		return yOffset;
	}
	
	/**
	 * Pass generic damage to the core
	 */
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
	{
		return world.isRemote || isDead || attackPart(EnumDriveablePart.core, damagesource, i);
	}
	
	@Override
	public void setDead()
	{
		super.setDead();
		
		if(world.isRemote)
			camera.setDead();
		
		for(EntitySeat seat : seats)
		{
			if(seat != null)
				seat.reallySetDead();
		}
		for(EntityWheel wheel : wheels)
		{
			if(wheel != null)
				wheel.reallySetDead();
		}
	}
	
	@SideOnly(Side.CLIENT)
	private void reportVehicleError()
	{
		FlansMod.log.warn("Vehicle error in " + this);
		FlansModClient.numVehicleExceptions++;
	}
	
	@Override
	public boolean canBeCollidedWith()
	{
		return !isDead;
	}
	
	@Override
	public void applyEntityCollision(Entity entity)
	{
		if(!isPartOfThis(entity))
			super.applyEntityCollision(entity);
	}
	
	@Override
	public void setPositionAndRotationDirect(double d, double d1, double d2, float f, float f1, int i, boolean b)
	{
		if(ticksExisted > 1)
			return;
		if(!(getControllingPassenger() instanceof EntityPlayer) || !FlansMod.proxy.isThePlayer(
				(EntityPlayer)getControllingPassenger()))
		{
			if(syncFromServer)
			{
				serverPositionTransitionTicker = i + 5;
			}
			else
			{
				double var10 = d - posX;
				double var12 = d1 - posY;
				double var14 = d2 - posZ;
				double var16 = var10 * var10 + var12 * var12 + var14 * var14;
				
				if(var16 <= 1.0D)
				{
					return;
				}
				
				serverPositionTransitionTicker = 3;
			}
			serverPosX = d;
			serverPosY = d1;
			serverPosZ = d2;
			serverYaw = f;
			serverPitch = f1;
		}
	}
	
	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll,
											 double motX, double motY, double motZ, float velYaw, float velPitch,
											 float velRoll, float throttle, float steeringYaw)
	{
		if(world.isRemote)
		{
			serverPosX = x;
			serverPosY = y;
			serverPosZ = z;
			serverYaw = yaw;
			serverPitch = pitch;
			serverRoll = roll;
			serverPositionTransitionTicker = 5;
		}
		else
		{
			setPosition(x, y, z);
			prevRotationYaw = yaw;
			prevRotationPitch = pitch;
			prevRotationRoll = roll;
			setRotation(yaw, pitch, roll);
		}
		// Set the motions regardless of side.
		motionX = motX;
		motionY = motY;
		motionZ = motZ;
		angularVelocity = new Vector3f(velYaw, velPitch, velRoll);
		this.throttle = throttle;
	}
	
	
	@Override
	public void setVelocity(double d, double d1, double d2)
	{
		motionX = d;
		motionY = d1;
		motionZ = d2;
	}
	
	@Override
	public boolean pressKey(int key, EntityPlayer player)
	{
		if(!world.isRemote && key == 9 && getDriveableType().modePrimary == EnumFireMode.SEMIAUTO) // Primary
		{
			shoot(false);
			return true;
		}
		else if(!world.isRemote && key == 8 && getDriveableType().modeSecondary == EnumFireMode.SEMIAUTO) // Secondary
		{
			shoot(true);
			return true;
		}
		return false;
	}
	
	@Override
	public void updateKeyHeldState(int key, boolean held)
	{
		if(world.isRemote)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketDriveableKeyHeld(key, held));
		}
		switch(key)
		{
			case 9:
				leftMouseHeld = held;
				break;
			case 8:
				rightMouseHeld = held;
				break;
		}
	}
	
	/**
	 * Shoot method called by pressing / holding shoot buttons
	 */
	public void shoot(boolean secondary)
	{
		DriveableType type = getDriveableType();
		if(seats[0] == null || !(seats[0].getControllingPassenger() instanceof EntityLivingBase))
			return;
		// Check shoot delay
		while(getShootDelay(secondary) <= 0.0f)
		{
			// We can shoot, so grab the available shoot points and the weaponType
			ArrayList<DriveablePosition> shootPoints = type.shootPoints(secondary);
			EnumWeaponType weaponType = type.weaponType(secondary);
			// If there are no shoot points, return
			if(shootPoints.isEmpty())
				return;
			// For alternating guns, move on to the next one
			int currentGun = getCurrentGun(secondary);
			if(type.alternate(secondary))
			{
				currentGun = (currentGun + 1) % shootPoints.size();
				setCurrentGun(currentGun, secondary);
				shootEach(type, shootPoints.get(currentGun), currentGun, secondary, weaponType);
			}
			else
			{
				for(int i = 0; i < shootPoints.size(); i++)
				{
					shootEach(type, shootPoints.get(i), i, secondary, weaponType);
				}
			}
		}
	}
	
	private boolean driverIsCreative()
	{
		EntityPlayer driver = getDriver();
		return driver != null && driver.capabilities.isCreativeMode;
	}
	
	public EntityPlayer getDriver()
	{
		if(seats != null && seats[0] != null && seats[0].getControllingPassenger() instanceof EntityPlayer)
		{
			return ((EntityPlayer)seats[0].getControllingPassenger());
		}
		else
		{
			return null;
		}
	}
	
	private void shootEach(DriveableType type, DriveablePosition shootPoint, int currentGun, boolean secondary,
						   EnumWeaponType weaponType)
	{
		// Rotate the gun vector to global axes
		Vector3f gunVec = getOrigin(shootPoint);
		Vector3f globalGunVec = Vector3f.add(new Vector3f(posX, posY, posZ), gunVec, null);
		Vector3f lookVector = getLookVector(shootPoint);
		
		// If its a pilot gun, then it is using a gun type, so do the following
		if(shootPoint instanceof PilotGun)
		{
			PilotGun pilotGun = (PilotGun)shootPoint;
			// Get the gun from the plane type and the ammo from the data
			GunType gunType = pilotGun.type;
			ItemStack shootableStack = driveableData.ammo[getDriveableType().numPassengerGunners + currentGun];
			EntityPlayer driver = getDriver();
			
			if(shootableStack == null || !(shootableStack.getItem() instanceof ItemShootable))
			{
				shootDelayPrimary = shootDelaySecondary = 1;
				return;
			}
			
			// For each 
			ItemShootable shootableItem = (ItemShootable)shootableStack.getItem();
			ShootableType shootableType = shootableItem.type;
			
			float spread = 0.005f * gunType.bulletSpread * shootableType.bulletSpread;
			
			lookVector.x += (float)world.rand.nextGaussian() * spread;
			lookVector.y += (float)world.rand.nextGaussian() * spread;
			lookVector.z += (float)world.rand.nextGaussian() * spread;
			
			lookVector.scale(500.0f);
			
			// Instant bullets. Do a raytrace
			if(gunType.bulletSpeed == 0.0f)
			{
				for(int i = 0; i < gunType.numBullets * shootableType.numBullets; i++)
				{
					List<BulletHit> hits = FlansModRaytracer.Raytrace(world, driver, false, null, globalGunVec,
							lookVector, 0);
					Vector3f hitPos = Vector3f.add(globalGunVec, lookVector, null);
					BulletHit firstHit = null;
					if(!hits.isEmpty())
					{
						firstHit = hits.get(0);
						hitPos = Vector3f.add(globalGunVec, (Vector3f)lookVector.scale(firstHit.intersectTime), null);
					}
					
					if(FlansMod.DEBUG && world.isRemote)
					{
						world.spawnEntity(new EntityDebugDot(world, globalGunVec, 100, 1.0f, 1.0f, 1.0f));
					}
					
					if(driver != null)
					{
						ShotData shotData = new InstantShotData(-1, EnumHand.MAIN_HAND, type, shootableType, driver,
								globalGunVec, firstHit, hitPos, gunType.damage,
								i < gunType.numBullets * shootableType.numBullets - 1, false);
						((ItemGun)gunType.item).handleDriveableShotData(shootableStack, -1, world, this, false,
								shotData);
					}
				}
			}
			else // Spawn an entity
			{
				if(driver != null)
				{
					ShotData shotData = new SpawnEntityShotData(-1, EnumHand.MAIN_HAND, type, shootableType, driver,
							lookVector);
					((ItemGun)gunType.item).handleDriveableShotData(shootableStack, -1, world, this, false, shotData);
				}
			}
			
			// Reset the shoot delay
			setShootDelay(type.shootDelay(secondary), secondary);
		}
		else // One of the other modes
		{
			switch(weaponType)
			{
				case BOMB:
				{
					if(TeamsManager.bombsEnabled)
					{
						int slot = -1;
						for(int i = driveableData.getBombInventoryStart();
							i < driveableData.getBombInventoryStart() + type.numBombSlots; i++)
						{
							ItemStack bomb = driveableData.getStackInSlot(i);
							if(bomb != null && bomb.getItem() instanceof ItemBullet && type.isValidAmmo(
									((ItemBullet)bomb.getItem()).type, weaponType))
							{
								slot = i;
							}
						}
						
						if(slot != -1)
						{
							int damageMultiplier =
									secondary ? type.damageModifierSecondary : type.damageModifierPrimary;
							
							ItemStack bulletStack = driveableData.getStackInSlot(slot);
							ItemBullet bulletItem = (ItemBullet)bulletStack.getItem();
							EntityShootable bulletEntity = bulletItem.getEntity(world,
									new Vec3d(globalGunVec.x, globalGunVec.y, globalGunVec.z),
									axes.getYaw(),
									axes.getPitch(),
									motionX,
									motionY,
									motionZ,
									(EntityLivingBase)seats[0].getControllingPassenger(),
									damageMultiplier,
									type);
							
							world.spawnEntity(bulletEntity);
							
							if(type.shootSound(secondary) != null)
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension,
										type.shootSound(secondary), false);
							if(!driverIsCreative())
							{
								bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
								if(bulletStack.getItemDamage() == bulletStack.getMaxDamage())
								{
									bulletStack.setItemDamage(0);
									bulletStack.setCount(bulletStack.getCount() - 1);
									if(bulletStack.getCount() == 0)
										bulletStack = ItemStack.EMPTY.copy();
								}
								driveableData.setInventorySlotContents(slot, bulletStack);
							}
							setShootDelay(type.shootDelay(secondary), secondary);
						}
						else
						{
							shootDelayPrimary = shootDelaySecondary = 1;
						}
					}
					break;
				}
				case MISSILE: // These two are actually almost identical
				case SHELL:
				{
					if(TeamsManager.shellsEnabled)
					{
						int slot = -1;
						for(int i = driveableData.getMissileInventoryStart();
							i < driveableData.getMissileInventoryStart() + type.numMissileSlots; i++)
						{
							ItemStack shell = driveableData.getStackInSlot(i);
							if(shell != null && shell.getItem() instanceof ItemBullet && type.isValidAmmo(
									((ItemBullet)shell.getItem()).type, weaponType))
							{
								slot = i;
							}
						}
						
						if(slot != -1)
						{
							int spread = 0;
							int damageMultiplier =
									secondary ? type.damageModifierSecondary : type.damageModifierPrimary;
							float shellSpeed = 3F;
							
							ItemStack bulletStack = driveableData.getStackInSlot(slot);
							ItemBullet bulletItem = (ItemBullet)bulletStack.getItem();
							EntityShootable bulletEntity = bulletItem.getEntity(world,
									globalGunVec,
									lookVector,
									(EntityLivingBase)seats[0].getControllingPassenger(),
									spread,
									damageMultiplier,
									shellSpeed,
									type);
							
							world.spawnEntity(bulletEntity);
							
							if(type.shootSound(secondary) != null)
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension,
										type.shootSound(secondary), false);
							if(!driverIsCreative())
							{
								bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
								if(bulletStack.getItemDamage() == bulletStack.getMaxDamage())
								{
									bulletStack.setItemDamage(0);
									bulletStack.setCount(bulletStack.getCount() - 1);
									if(bulletStack.getCount() == 0)
										bulletStack = ItemStack.EMPTY.copy();
								}
								driveableData.setInventorySlotContents(slot, bulletStack);
							}
							setShootDelay(type.shootDelay(secondary), secondary);
						}
						else
						{
							shootDelayPrimary = shootDelaySecondary = 1;
						}
					}
					break;
				}
				case GUN: // Handled above
					break;
				case MINE:
					break;
				case NONE:
					break;
			}
		}
	}
	
	public Vector3f getOrigin(DriveablePosition dp)
	{
		// Rotate the gun vector to global axes
		Vector3f localGunVec = new Vector3f(dp.position);
		
		if(dp.part == EnumDriveablePart.turret)
		{
			// Untranslate by the turret origin, to get the rotation about the right point
			Vector3f.sub(localGunVec, getDriveableType().turretOrigin, localGunVec);
			// Rotate by the turret angles
			localGunVec = seats[0].looking.findLocalVectorGlobally(localGunVec);
			// Translate by the turret origin
			Vector3f.add(localGunVec, getDriveableType().turretOrigin, localGunVec);
		}
		
		return rotate(localGunVec);
	}
	
	public Vector3f getLookVector(DriveablePosition dp)
	{
		return axes.getXAxis();
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		DriveableType type = getDriveableType();
		
		// Do a full check of our passengers for wheels or seats
		for(Entity passenger : getPassengers())
		{
			if(passenger instanceof EntitySeat)
			{
				EntitySeat seat = (EntitySeat)passenger;
				if(seat.getExpectedSeatID() >= 0 && seats[seat.getExpectedSeatID()] == null)
				{
					seats[seat.getExpectedSeatID()] = seat;
				}
			}
			else if(passenger instanceof EntityWheel)
			{
				EntityWheel wheel = (EntityWheel)passenger;
				if(wheel.getExpectedWheelID() >= 0 && wheels[wheel.getExpectedWheelID()] == null)
				{
					wheels[wheel.getExpectedWheelID()] = wheel;
				}
			}
			else
			{
				FlansMod.log.warn("Entity " + passenger + " is riding a driveable core entity.");
			}
		}
		
		readyForUpdates = true;
		for(int i = 0; i < type.numPassengers; i++)
		{
			if(seats[i] == null)
			{
				readyForUpdates = false;
			}
		}
		for(int i = 0; i < type.wheelPositions.length; i++)
		{
			if(wheels[i] == null)
			{
				readyForUpdates = false;
			}
		}
		
		if(!readyForUpdates)
		{
			if(!world.isRemote)
			{
				// Well heck, if it's bork, let's make new ones
				initType(type, true, false);
			}
			// If we end up stuck like this on a client, handle updates from server
			if(world.isRemote)
			{
				// The driveable is currently moving towards its server position. Continue doing so.
				if(serverPositionTransitionTicker > 0)
				{
					moveTowardServerPosition();
				}
				// If the driveable is at its server position and does not have the next update, it should just simulate
				// itself as a server side driveable would, so continue
			}
			
			return;
		}
		
		// Harvest stuff
		// Aesthetics
		if(hasEnoughFuel())
		{
			harvesterAngle += throttle / 5F;
		}
		// Actual harvesting
		if(type.harvestBlocks && type.health.get(EnumDriveablePart.harvester) != null)
		{
			CollisionBox box = type.health.get(EnumDriveablePart.harvester);
			for(float x = box.x; x <= box.x + box.w; x++)
			{
				for(float y = box.y; y <= box.y + box.h; y++)
				{
					for(float z = box.z; z <= box.z + box.d; z++)
					{
						Vector3f v = axes.findLocalVectorGlobally(new Vector3f(x, y, z));
						
						int blockX = (int)Math.round(posX + v.x);
						int blockY = (int)Math.round(posY + v.y);
						int blockZ = (int)Math.round(posZ + v.z);
						IBlockState block = world.getBlockState(new BlockPos(blockX, blockY, blockZ));
						
						boolean cancelled = false;
						if(getDriver() != null)
						{
							int eventOutcome = ForgeHooks.onBlockBreakEvent(world,
									driverIsCreative() ? GameType.CREATIVE : getDriver().capabilities.allowEdit
											? GameType.SURVIVAL : GameType.ADVENTURE,
									(EntityPlayerMP)getDriver(), new BlockPos(blockX, blockY, blockZ));
							cancelled = eventOutcome == -1;
						}
						if(!cancelled)
						{
							if(type.materialsHarvested.contains(block.getMaterial()) && block.getBlockHardness(world,
									new BlockPos(blockX, blockY, blockZ)) >= 0F)
							{
								// Add the item stack to mecha inventory
								NonNullList<ItemStack> stacks = NonNullList.create();
								block.getBlock().getDrops(stacks, world, new BlockPos(blockX, blockY, blockZ),
										world.getBlockState(new BlockPos(blockX, blockY, blockZ)), 0);
								for(ItemStack stack : stacks)
								{
									if(!InventoryHelper.addItemStackToInventory(driveableData, stack,
											driverIsCreative()) && !world.isRemote && world.getGameRules().getBoolean(
											"doTileDrops"))
									{
										world.spawnEntity(
												new EntityItem(world, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F,
														stack));
									}
								}
								// Destroy block
								if(!world.isRemote)
								{
									WorldServer worldServer = (WorldServer)world;
									BlockPos pos = new BlockPos(blockX, blockY, blockZ);
									destroyBlock(worldServer, pos, getDriver(), false);
								}
							}
						}
					}
				}
			}
		}
		
		
		for(DriveablePart part : getDriveableData().parts.values())
		{
			if(part.box != null)
			{
				
				part.update(this);
				// Client side particles
				if(world.isRemote)
				{
					if(part.onFire)
					{
						// Pick a random position within the bounding box and spawn a flame there
						Vector3f pos = getRandPosInBoundingBox(part);
						world.spawnParticle(EnumParticleTypes.FLAME, posX + pos.x, posY + pos.y, posZ + pos.z, 0, 0, 0);
					}
					if(part.health > 0 && part.health < part.maxHealth / 2)
					{
						Vector3f pos = getRandPosInBoundingBox(part);
						world.spawnParticle(
								part.health < part.maxHealth / 4 ?
										EnumParticleTypes.SMOKE_LARGE :
										EnumParticleTypes.SMOKE_NORMAL, posX + pos.x, posY + pos.y, posZ + pos.z, 0, 0,
								0);
					}
				}
				// Server side fire handling
				if(part.onFire)
				{
					// Rain can put out fire
					if(world.isRaining() && rand.nextInt(40) == 0)
						part.onFire = false;
					// Also water blocks
					// Get the centre point of the part
					Vector3f pos = axes.findLocalVectorGlobally(
							new Vector3f(part.box.x + part.box.w / 2F, part.box.y + part.box.h / 2F,
									part.box.z + part.box.d / 2F));
					if(world.getBlockState(new BlockPos(MathHelper.floor(posX + pos.x), MathHelper.floor(posY + pos.y),
							MathHelper.floor(posZ + pos.z))).getMaterial() == Material.WATER)
					{
						part.onFire = false;
					}
				}
				else
				{
					Vector3f pos = getPartLocalVectorGlobally(part);
					if(world.getBlockState(new BlockPos(MathHelper.floor(posX + pos.x), MathHelper.floor(posY + pos.y),
							MathHelper.floor(posZ + pos.z))).getMaterial() == Material.LAVA)
					{
						part.onFire = true;
					}
				}
			}
		}
		
		for(int i = 0; i < type.emitters.size(); i++)
		{
			ParticleEmitter emitter = type.emitters.get(i);
			emitterTimers[i]--;
			boolean canEmit = false;
			DriveablePart part = getDriveableData().parts.get(EnumDriveablePart.getPart(emitter.part));
			float healthPercentage = (float)part.health / (float)part.maxHealth;
			if(isPartIntact(EnumDriveablePart.getPart(
					emitter.part)) && healthPercentage >= emitter.minHealth && healthPercentage <= emitter.maxHealth)
			{
				canEmit = true;
			}
			if(emitterTimers[i] <= 0)
			{
				if(throttle >= emitter.minThrottle && throttle <= emitter.maxThrottle && canEmit)
				{
					// Emit!
					Vector3f velocity = new Vector3f(0, 0, 0);
					Vector3f pos = new Vector3f(0, 0, 0);
					if(seats != null && seats[0] != null)
					{
						if(EnumDriveablePart.getPart(
								emitter.part) != EnumDriveablePart.turret && EnumDriveablePart.getPart(
								emitter.part) != EnumDriveablePart.head)
						{
							Vector3f localPosition = new Vector3f(
									emitter.origin.x + rand.nextFloat() * emitter.extents.x - emitter.extents.x * 0.5f,
									emitter.origin.y + rand.nextFloat() * emitter.extents.y - emitter.extents.y * 0.5f,
									emitter.origin.z + rand.nextFloat() * emitter.extents.z - emitter.extents.z * 0.5f);
							
							pos = axes.findLocalVectorGlobally(localPosition);
							velocity = axes.findLocalVectorGlobally(emitter.velocity);
						}
						else if(EnumDriveablePart.getPart(
								emitter.part) == EnumDriveablePart.turret || EnumDriveablePart.getPart(
								emitter.part) != EnumDriveablePart.head)
						{
							
							Vector3f localPosition2 = new Vector3f(
									emitter.origin.x + rand.nextFloat() * emitter.extents.x - emitter.extents.x * 0.5f,
									emitter.origin.y + rand.nextFloat() * emitter.extents.y - emitter.extents.y * 0.5f,
									emitter.origin.z + rand.nextFloat() * emitter.extents.z - emitter.extents.z * 0.5f);
							
							RotatedAxes yawOnlyLooking = new RotatedAxes(seats[0].looking.getYaw() + axes.getYaw(),
									axes.getPitch(), axes.getRoll());
							
							pos = yawOnlyLooking.findLocalVectorGlobally(localPosition2);
							velocity = yawOnlyLooking.findLocalVectorGlobally(emitter.velocity);
						}
						world.spawnParticle(emitter.effectType,
								posX + pos.x, posY + pos.y, posZ + pos.z, velocity.x, velocity.y, velocity.z);
					}
				}
				emitterTimers[i] = emitter.emitRate;
			}
		}
		
		checkParts();
		
		prevRotationYaw = axes.getYaw();
		prevRotationPitch = axes.getPitch();
		prevRotationRoll = axes.getRoll();
		prevAxes = axes.clone();
		
		boolean canThrust = driverIsCreative() || driveableData.fuelInTank > 0;
		
		// If there's no player in the driveable or it cannot thrust, slow the plane and turn off mouse held actions
		if((getDriver() == null) ||
				!canThrust && getDriveableType().maxThrottle != 0 && getDriveableType().maxNegativeThrottle != 0)
		{
			throttle *= 0.98F;
			rightMouseHeld = leftMouseHeld = false;
		}
		else if(getDriver() != null && getDriver() == getControllingPassenger())
		{
			reportVehicleError();
		}
		
		// Check if shooting
		if(shootDelayPrimary > 0)
			shootDelayPrimary--;
		if(shootDelaySecondary > 0)
			shootDelaySecondary--;
		if(!world.isRemote)
		{
			if(leftMouseHeld && getDriveableType().modePrimary == EnumFireMode.FULLAUTO)
				shoot(false);
			if(rightMouseHeld && getDriveableType().modeSecondary == EnumFireMode.FULLAUTO)
				shoot(true);
			minigunSpeedPrimary *= 0.9F;
			minigunSpeedSecondary *= 0.9F;
			if(leftMouseHeld && getDriveableType().modePrimary == EnumFireMode.MINIGUN)
			{
				minigunSpeedPrimary += 0.1F;
				if(minigunSpeedPrimary > 1F)
					shoot(false);
			}
			if(rightMouseHeld && getDriveableType().modeSecondary == EnumFireMode.MINIGUN)
			{
				minigunSpeedSecondary += 0.1F;
				if(minigunSpeedSecondary > 1F)
					shoot(true);
			}
		}
		
		// Handle fuel
		
		int fuelMultiplier = 2;
		
		// The tank is currently full, so do nothing
		if(getDriveableData().fuelInTank >= type.fuelTankSize)
			return;
		
		// Look through the entire inventory for fuel cans, buildcraft fuel buckets and RedstoneFlux power sources
		for(int i = 0; i < getDriveableData().getSizeInventory(); i++)
		{
			ItemStack stack = getDriveableData().getStackInSlot(i);
			if(stack == null || stack.isEmpty())
				continue;
			Item item = stack.getItem();
			// Check for Flan's Mod fuel items
			if(item instanceof ItemPart)
			{
				PartType part = ((ItemPart)item).type;
				// Check it is a fuel item
				if(part.category == EnumPartCategory.FUEL)
				{
					// Put 2 points of fuel
					getDriveableData().fuelInTank += fuelMultiplier;
					
					// Damage the fuel item to indicate being used up
					int damage = stack.getItemDamage();
					stack.setItemDamage(damage + 1);
					
					// If we have finished this fuel item
					if(damage >= stack.getMaxDamage())
					{
						// Reset the damage to 0
						stack.setItemDamage(0);
						// Consume one item
						stack.setCount(stack.getCount() - 1);
						// If we consumed the last one, destroy the stack
						if(stack.getCount() <= 0)
							getDriveableData().setInventorySlotContents(i, ItemStack.EMPTY.copy());
					}
					
					// We found a fuel item and consumed some, so we are done
					break;
				}
				
				// Check for Buildcraft oil and fuel buckets
				else if(FlansMod.hooks.BuildCraftLoaded && stack.isItemEqual(
						FlansMod.hooks.BuildCraftOilBucket) &&
						getDriveableData().fuelInTank + 1000 * fuelMultiplier <= type.fuelTankSize)
				{
					getDriveableData().fuelInTank += 1000 * fuelMultiplier;
					getDriveableData().setInventorySlotContents(i, new ItemStack(Items.BUCKET));
				}
				else if(FlansMod.hooks.BuildCraftLoaded && stack.isItemEqual(
						FlansMod.hooks.BuildCraftFuelBucket) &&
						getDriveableData().fuelInTank + 2000 * fuelMultiplier <= type.fuelTankSize)
				{
					getDriveableData().fuelInTank += 2000 * fuelMultiplier;
					getDriveableData().setInventorySlotContents(i, new ItemStack(Items.BUCKET));
				}
			}
		}
	}
	
	private Vector3f getRandPosInBoundingBox(DriveablePart part)
	{
		// Pick a random position within the bounding box and spawn a flame there
		return axes.findLocalVectorGlobally(
				new Vector3f(part.box.x + rand.nextFloat() * part.box.w,
						part.box.y + rand.nextFloat() * part.box.h,
						part.box.z + rand.nextFloat() * part.box.d));
	}
	
	protected void moveTowardServerPosition()
	{
		double x = posX + (serverPosX - posX) / serverPositionTransitionTicker;
		double y = posY + (serverPosY - posY) / serverPositionTransitionTicker;
		double z = posZ + (serverPosZ - posZ) / serverPositionTransitionTicker;
		double dYaw = MathHelper.wrapDegrees(serverYaw - axes.getYaw());
		double dPitch = MathHelper.wrapDegrees(serverPitch - axes.getPitch());
		double dRoll = MathHelper.wrapDegrees(serverRoll - axes.getRoll());
		rotationYaw = (float)(axes.getYaw() + dYaw / serverPositionTransitionTicker);
		rotationPitch = (float)(axes.getPitch() + dPitch / serverPositionTransitionTicker);
		float rotationRoll = (float)(axes.getRoll() + dRoll / serverPositionTransitionTicker);
		--serverPositionTransitionTicker;
		setPosition(x, y, z);
		setRotation(rotationYaw, rotationPitch, rotationRoll);
	}
	
	public void checkForCollisions()
	{
		boolean crashInWater = false;
		double speed = getSpeedXYZ();
		for(DriveablePosition p : getDriveableType().collisionPoints)
		{
			if(driveableData.parts.get(p.part).dead)
				continue;
			Vector3f lastRelPos = prevAxes.findLocalVectorGlobally(p.position);
			Vec3d lastPos = new Vec3d(prevPosX + lastRelPos.x, prevPosY + lastRelPos.y, prevPosZ + lastRelPos.z);
			
			Vector3f currentRelPos = axes.findLocalVectorGlobally(p.position);
			Vec3d currentPos = new Vec3d(posX + currentRelPos.x, posY + currentRelPos.y, posZ + currentRelPos.z);
			
			if(FlansMod.DEBUG && world.isRemote)
			{
				world.spawnEntity(new EntityDebugVector(world, new Vector3f(lastPos),
						Vector3f.sub(currentRelPos, lastRelPos, null), 10, 1F, 0F, 0F));
			}
			
			RayTraceResult hit = world.rayTraceBlocks(lastPos, currentPos, crashInWater);
			if(hit != null && hit.typeOfHit == Type.BLOCK)
			{
				BlockPos pos = hit.getBlockPos();
				IBlockState state = world.getBlockState(pos);
				
				float blockHardness = state.getBlockHardness(world, pos);
				
				// Attack the part
				if(!attackPart(p.part, DamageSource.IN_WALL,
						blockHardness * blockHardness * (float)speed) && TeamsManager.driveablesBreakBlocks)
				{
					// And if it didn't die from the attack, break the block
					// TODO: [1.12] Heck
					// playAuxSFXAtEntity(null, 2001, pos, Block.getStateId(state));
					
					if(!world.isRemote)
					{
						WorldServer worldServer = (WorldServer)world;
						destroyBlock(worldServer, pos, getDriver(), true);
					}
				}
				else
				{
					// The part died!
					world.createExplosion(this, currentPos.x, currentPos.y, currentPos.z, 1F, false);
				}
			}
			
		}
	}
	
	@Override
	public void fall(float distance, float damageMultiplier)
	{
		if(distance <= 0)
			return;
		int i = MathHelper.ceil(distance - 10F);
		
		if(i > 0)
			attackPart(EnumDriveablePart.core, DamageSource.FALL, damageMultiplier * i / 5);
	}
	
	/**
	 * Attack a certain part of a driveable and return whether it broke or not
	 */
	public boolean attackPart(EnumDriveablePart ep, DamageSource source, float damage)
	{
		DriveablePart part = driveableData.parts.get(ep);
		return part.attack(damage, source.isFireDamage());
	}
	
	/**
	 * Takes a vector (such as the origin of a seat / gun) and translates it from local coordinates to global
	 * coordinates
	 */
	public Vector3f rotate(Vector3f inVec)
	{
		return axes.findLocalVectorGlobally(inVec);
	}
	
	/**
	 * Takes a vector (such as the origin of a seat / gun) and translates it from local coordinates to global
	 * coordinates
	 */
	public Vector3f rotate(Vec3d inVec)
	{
		return rotate(inVec.x, inVec.y, inVec.z);
	}
	
	/**
	 * Takes a vector (such as the origin of a seat / gun) and translates it from local coordinates to global
	 * coordinates
	 */
	public Vector3f rotate(double x, double y, double z)
	{
		return rotate(new Vector3f((float)x, (float)y, (float)z));
	}
	
	/**
	 * Rotate the plane locally by some angle about the yaw axis
	 */
	public void rotateYaw(float rotateBy)
	{
		if(Math.abs(rotateBy) < 0.01F)
			return;
		axes.rotateLocalYaw(rotateBy);
		updatePrevAngles();
	}
	
	/**
	 * Rotate the plane locally by some angle about the pitch axis
	 */
	public void rotatePitch(float rotateBy)
	{
		if(Math.abs(rotateBy) < 0.01F)
			return;
		axes.rotateLocalPitch(rotateBy);
		updatePrevAngles();
	}
	
	/**
	 * Rotate the plane locally by some angle about the roll axis
	 */
	public void rotateRoll(float rotateBy)
	{
		if(Math.abs(rotateBy) < 0.01F)
			return;
		axes.rotateLocalRoll(rotateBy);
		updatePrevAngles();
	}
	
	public void updatePrevAngles()
	{
		// Correct angles that crossed the +/- 180 line, so that rendering doesnt make them swing 360 degrees in one tick.
		double dYaw = axes.getYaw() - prevRotationYaw;
		if(dYaw > 180)
			prevRotationYaw += 360F;
		if(dYaw < -180)
			prevRotationYaw -= 360F;
		
		double dPitch = axes.getPitch() - prevRotationPitch;
		if(dPitch > 180)
			prevRotationPitch += 360F;
		if(dPitch < -180)
			prevRotationPitch -= 360F;
		
		double dRoll = axes.getRoll() - prevRotationRoll;
		if(dRoll > 180)
			prevRotationRoll += 360F;
		if(dRoll < -180)
			prevRotationRoll -= 360F;
	}
	
	public void setRotation(float rotYaw, float rotPitch, float rotRoll)
	{
		axes.setAngles(rotYaw, rotPitch, rotRoll);
	}
	
	// Used to stop self collision
	public boolean isPartOfThis(Entity entity)
	{
		for(EntitySeat seat : seats)
		{
			if(seat == null)
				continue;
			if(entity == seat)
				return true;
			if(seat.getControllingPassenger() == entity)
				return true;
		}
		for(EntityWheel wheel : wheels)
		{
			if(entity == wheel)
				return true;
		}
		return entity == this;
	}
	
	public DriveableType getDriveableType()
	{
		return DriveableType.getDriveable(driveableType);
	}
	
	public DriveableData getDriveableData()
	{
		return driveableData;
	}
	
	@Override
	public boolean isDead()
	{
		return isDead;
	}
	
	@Override
	public Entity getControllingEntity()
	{
		return seats[0].getControllingEntity();
	}
	
	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		ItemStack stack = new ItemStack(getDriveableType().item, 1, 0);
		NBTTagCompound tags = new NBTTagCompound();
		stack.setTagCompound(tags);
		driveableData.writeToNBT(tags);
		return stack;
	}
	
	
	public boolean hasFuel()
	{
		if(getDriver() == null)
			return false;
		return driverIsCreative() || driveableData.fuelInTank > 0;
	}
	
	public boolean hasEnoughFuel()
	{
		if(getDriver() == null)
			return false;
		return driverIsCreative() || driveableData.fuelInTank > driveableData.engine.fuelConsumption * throttle;
		
	}
	
	public double getSpeedXYZ()
	{
		return Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
	}
	
	public double getSpeedXZ()
	{
		return Math.sqrt(motionX * motionX + motionZ * motionZ);
	}
	
	/**
	 * To be overridden by vehicles to get alternate collision system
	 */
	public boolean landVehicle()
	{
		return false;
	}
	
	/**
	 * Overridden by planes for wheel parts
	 */
	public boolean gearDown()
	{
		return true;
	}
	
	/**
	 * Whether or not the plane is on the ground
	 */
	public boolean onGround()
	{
		// TODO: Replace with proper check based on wheels
		return onGround;
	}
	
	/**
	 * Attack method called by bullets hitting the plane. Does advanced raytracing to detect which part of the plane is
	 * hit
	 */
	public ArrayList<BulletHit> attackFromBullet(Vector3f origin, Vector3f motion)
	{
		// Make an array to contain the hits
		ArrayList<BulletHit> hits = new ArrayList<>();
		// Get the position of the bullet origin, relative to the centre of the plane, and then rotate the vectors onto local co-ordinates
		Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)posX, (float)posY, (float)posZ), null);
		Vector3f rotatedPosVector = axes.findGlobalVectorLocally(relativePosVector);
		Vector3f rotatedMotVector = axes.findGlobalVectorLocally(motion);
		// Check each part
		for(DriveablePart part : getDriveableData().parts.values())
		{
			// Ray trace the bullet
			DriveableHit hit = part.rayTrace(this, rotatedPosVector, rotatedMotVector);
			if(hit != null)
				hits.add(hit);
		}
		return hits;
	}
	
	/**
	 * Called if the bullet actually hit the part returned by the raytrace
	 *
	 * @param penetratingPower
	 */
	public float bulletHit(BulletType bulletType, float damage, DriveableHit hit, float penetratingPower)
	{
		DriveablePart part = getDriveableData().parts.get(hit.part);
		part.hitByBullet(bulletType, damage);
		
		// This is server side bsns
		if(!world.isRemote)
		{
			checkParts();
			// If it hit, send a damage update packet
			FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), posX, posY, posZ, 100,
					dimension);
		}
		
		return penetratingPower - 5F;
	}
	
	/**
	 * A simple raytracer for the driveable. Called by tools
	 */
	public DriveablePart raytraceParts(Vector3f origin, Vector3f motion)
	{
		// Get the position of the bullet origin, relative to the centre of the plane, and then rotate the vectors onto local co-ordinates
		Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)posX, (float)posY, (float)posZ), null);
		Vector3f rotatedPosVector = axes.findGlobalVectorLocally(relativePosVector);
		Vector3f rotatedMotVector = axes.findGlobalVectorLocally(motion);
		// Check each part
		for(DriveablePart part : getDriveableData().parts.values())
		{
			// Ray trace the bullet
			if(part.rayTrace(this, rotatedPosVector, rotatedMotVector) != null)
			{
				return part;
			}
		}
		return null;
	}
	
	/**
	 * For overriding for toggles such as gear up / down on planes
	 */
	public boolean canHitPart(EnumDriveablePart part)
	{
		return true;
	}
	
	/**
	 * Internal method for checking that all parts are ok, destroying broken ones, dropping items and making sure that
	 * child parts are destroyed when their parents are
	 */
	public void checkParts()
	{
		for(DriveablePart part : getDriveableData().parts.values())
		{
			if(part != null && !part.dead && part.health <= 0 && part.maxHealth > 0)
			{
				killPart(part);
			}
		}
		
		// If the core was destroyed, kill the driveable
		if(getDriveableData().parts.get(EnumDriveablePart.core).dead)
		{
			if(!world.isRemote)
			{
				for(DriveablePart part : driveableData.parts.values())
				{
					if(part.health > 0 && !part.dead)
						killPart(part);
				}
			}
			setDead();
		}
		
	}
	
	/**
	 * Internal method for killing driveable parts
	 */
	private void killPart(DriveablePart part)
	{
		if(part.dead)
			return;
		part.health = 0;
		part.dead = true;
		
		// Drop items
		DriveableType type = getDriveableType();
		if(!world.isRemote)
		{
			Vector3f pos = new Vector3f(0, 0, 0);
			
			// Get the midpoint of the part
			if(part.box != null)
				pos = getPartLocalVectorGlobally(part);
			
			ArrayList<ItemStack> drops = type.getItemsRequired(part, getDriveableData().engine);
			if(drops != null)
			{
				// Drop each item stack
				for(ItemStack stack : drops)
				{
					world.spawnEntity(new EntityItem(world, posX + pos.x, posY + pos.y, posZ + pos.z, stack.copy()));
				}
			}
			dropItemsOnPartDeath(pos, part);
			
			// Inventory is in the core, so drop it if the core is broken
			if(part.type == EnumDriveablePart.core)
			{
				for(int i = 0; i < getDriveableData().getSizeInventory(); i++)
				{
					ItemStack stack = getDriveableData().getStackInSlot(i);
					if(stack != null && !stack.isEmpty())
					{
						world.spawnEntity(new EntityItem(world, posX + rand.nextGaussian(), posY + rand.nextGaussian(),
								posZ + rand.nextGaussian(), stack));
					}
				}
			}
		}
		
		// Kill all child parts to stop things floating unconnected
		for(EnumDriveablePart child : part.type.getChildren())
		{
			killPart(getDriveableData().parts.get(child));
		}
	}
	
	private Vector3f getPartLocalVectorGlobally(DriveablePart part)
	{
		return axes.findLocalVectorGlobally(new Vector3f(
				part.box.x / 16F + part.box.w / 32F,
				part.box.y / 16F + part.box.h / 32F,
				part.box.z / 16F + part.box.d / 32F));
	}
	
	/**
	 * Method for planes, vehicles and whatnot to drop their own specific items if they wish
	 */
	protected abstract void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part);
	
	@Override
	public float getPlayerRoll()
	{
		return axes.getRoll();
	}
	
	@Override
	public float getPrevPlayerRoll()
	{
		return prevAxes.getRoll();
	}
	
	@Override
	public void explode()
	{
		
	}
	
	@Override
	public float getCameraDistance()
	{
		return getDriveableType().cameraDistance;
	}
	
	public boolean isPartIntact(EnumDriveablePart part)
	{
		DriveablePart thisPart = getDriveableData().parts.get(part);
		return thisPart.maxHealth == 0 || thisPart.health > 0;
	}
	
	public abstract boolean hasMouseControlMode();
	
	public abstract String getBombInventoryName();
	
	public abstract String getMissileInventoryName();
	
	public boolean rotateWithTurret(Seat seat)
	{
		return seat.part == EnumDriveablePart.turret;
	}
	
	@Override
	public String getName()
	{
		return getDriveableType().name;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean showInventory(int seat)
	{
		return seat != 0 || !FlansModClient.controlModeMouse;
	}
	
	public float getShootDelay(boolean secondary)
	{
		return secondary ? shootDelaySecondary : shootDelayPrimary;
	}
	
	public float getMinigunSpeed(boolean secondary)
	{
		return secondary ? minigunSpeedSecondary : minigunSpeedPrimary;
	}
	
	public int getCurrentGun(boolean secondary)
	{
		return secondary ? currentGunSecondary : currentGunPrimary;
	}
	
	public void setShootDelay(float f, boolean secondary)
	{
		if(secondary)
			shootDelaySecondary = f;
		else shootDelayPrimary = f;
	}
	
	public void setMinigunSpeed(float f, boolean secondary)
	{
		if(secondary)
			minigunSpeedSecondary = f;
		else minigunSpeedPrimary = f;
	}
	
	public void setCurrentGun(int i, boolean secondary)
	{
		if(secondary)
			currentGunSecondary = i;
		else currentGunPrimary = i;
	}
	
	
	@Override
	protected boolean canFitPassenger(Entity passenger)
	{
		if(passenger instanceof EntitySeat || passenger instanceof EntityWheel)
		{
			return getPassengers().size() <
					getDriveableType().numPassengers + getDriveableType().wheelPositions.length + 1;
		}
		return false;
	}
	
	@Override
	public void updatePassenger(Entity passenger)
	{
		// They can handle themselves, but maybe the code should be moved to here
	}
	
	@Override
	public void removePassenger(Entity passenger)
	{
		super.removePassenger(passenger);
	}
	
	public EntitySeat getSeat(EntityLivingBase passenger)
	{
		for(EntitySeat seat : seats)
		{
			if(seat.getControllingEntity() == passenger)
			{
				return seat;
			}
		}
		return null;
	}
	
	@Override
	protected void addPassenger(Entity passenger)
	{
		super.addPassenger(passenger);
		if(world.isRemote)
		{
			// We need to do some handling to work out which seat to get into. Or not?
		}
	}
	
	public void registerSeat(EntitySeat seat)
	{
		seats[seat.getExpectedSeatID()] = seat;
	}
	
	public void registerWheel(EntityWheel wheel)
	{
		wheels[wheel.getExpectedWheelID()] = wheel;
	}
	
	public EntitySeat[] getSeats()
	{
		return seats;
	}
	
	public EntitySeat getSeat(int id)
	{
		if(seats[id] == null)
		{
			for(Entity passenger : getPassengers())
			{
				if(passenger instanceof EntitySeat)
				{
					EntitySeat seat = (EntitySeat)passenger;
					if(seat.getExpectedSeatID() == id)
					{
						seats[id] = seat;
						seats[id].driveable = this;
						break;
					}
				}
			}
		}
		
		return seats[id];
	}
	
	public EntityWheel getWheel(int id)
	{
		if(wheels[id] == null)
		{
			for(Entity passenger : getPassengers())
			{
				if(passenger instanceof EntityWheel)
				{
					EntityWheel wheel = (EntityWheel)passenger;
					if(wheel.getExpectedWheelID() == id)
					{
						wheels[id] = wheel;
						break;
					}
				}
			}
		}
		
		return wheels[id];
	}
}
