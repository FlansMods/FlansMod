package com.flansmod.common.guns;

import java.util.List;
import java.util.UUID;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.raytracing.FlansModRaytracer;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BulletHit;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

import io.netty.buffer.ByteBuf;

public class EntityBullet extends EntityShootable implements IEntityAdditionalSpawnData
{
	private static int bulletLife = 600; //Kill bullets after 30 seconds
	public Entity owner;
	private int ticksInAir;

	private FiredShot shot;
			
	public BulletType type;
	/** What type of weapon did this come from? For death messages */
	public InfoType firedFrom;
	/** The amount of damage the gun imparted upon the bullet. Multiplied by the bullet damage to get total damage */
	public float damage;
	public boolean shotgun = false;
	/** If this is non-zero, then the player raytrace code will look back in time to when the player thinks their bullet should have hit */
	public int pingOfShooter = 0;
	/** Avoids the fact that using the entity random to calculate spread direction always results in the same direction */
	public static Random bulletRandom = new Random();
	/** Stop repeat detonations */
	public boolean detonated = false;
	/** For homing missiles */
	public Entity lockedOnTo;
	
	private float currentPenetratingPower;

	@SideOnly(Side.CLIENT)
	private boolean playedFlybySound;
	
	/**
	 * These values are used to store the UUIDs until the next entity update is performed. This prevents issues caused by the loading order
	 */
	private UUID playeruuid;
	private UUID shooteruuid;
	private boolean checkforuuids;
	
	//public double distanceToEntity = 0;
	public double prevDistanceToEntity = 0;
	public int cnt;
	//public Vector3f firstVector = new Vector3f(motionX, motionY, motionZ);
	public boolean toggleLock = false;
	//public Vector3f prevPos;
	public double lockedOnToSpeed = 0;
	public double thisSpeed = 0;
	public int closeCount = 0;
	public int soundTime = 0;
	public float speedA;

	public int impactX;
	public int impactY;
	public int impactZ;

	public boolean isFirstPositionSetting = false;
	public boolean isPositionUpper = true;

	public static boolean hitCrossHair;

	public float penetratingPower;

	public int submunitionDelay = 20;
	public boolean hasSetSubDelay = false;
	
	public boolean hasSetVLSDelay = false;
	public int VLSDelay = 0;
	
	public Vector3f lookVector;
	public Vector3f initialPos;
	public boolean hasSetLook = false;
	

	public EntityBullet(World world)
	{
		super(world);
		ticksInAir = 0;
		setSize(0.5F, 0.5F);
	}
	
	public EntityBullet(World world, FiredShot shot, Vec3d origin, Vec3d direction)
	{
		this(world);
		ticksInAir = 0;
		this.shot = shot;
		this.dataManager.set(BULLET_TYPE, shot.getBulletType().shortName);
		
		setPosition(origin.x, origin.y, origin.z);
		motionX = direction.x;
		motionY = direction.y;
		motionZ = direction.z;
		setArrowHeading(motionX, motionY, motionZ, shot.getFireableGun().getGunSpread() * shot.getBulletType().bulletSpread, shot.getFireableGun().getBulletSpeed());
		
		currentPenetratingPower = shot.getBulletType().penetratingPower;
	}

	@Override
	protected void entityInit()
	{
		this.dataManager.register(BULLET_TYPE, null);
	}
	
	public void setArrowHeading(double d, double d1, double d2, float spread, float speed)
	{
		spread /= 5F;
		float f2 = MathHelper.sqrt(d * d + d1 * d1 + d2 * d2);
		d /= f2;
		d1 /= f2;
		d2 /= f2;
		d *= speed;
		d1 *= speed;
		d2 *= speed;
		d += rand.nextGaussian() * 0.005D * spread * speed;
		d1 += rand.nextGaussian() * 0.005D * spread * speed;
		d2 += rand.nextGaussian() * 0.005D * spread * speed;
		motionX = d;
		motionY = d1;
		motionZ = d2;
		float f3 = MathHelper.sqrt(d * d + d2 * d2);
		prevRotationYaw = rotationYaw = (float)((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
		prevRotationPitch = rotationPitch = (float)((Math.atan2(d1, f3) * 180D) / 3.1415927410125732D);
		
		getLockOnTarget();
	}
	
	/**
	 * Find the entity nearest to the missile's trajectory, anglewise
	 */
	private void getLockOnTarget()
	{
		BulletType type = shot.getBulletType();
		
		if(type.lockOnToPlanes || type.lockOnToVehicles || type.lockOnToMechas || type.lockOnToLivings || type.lockOnToPlayers)
		{
			Vector3f motionVec = new Vector3f(motionX, motionY, motionZ);
			Entity closestEntity = null;
			float closestAngle = type.maxLockOnAngle * 3.14159265F / 180F;
			
			for(Object obj : world.loadedEntityList)
			{
				Entity entity = (Entity)obj;
				String etype = entity.getEntityData().getString("EntityType");
				if((type.lockOnToMechas && entity instanceof EntityMecha)
						|| (type.lockOnToVehicles && entity instanceof EntityVehicle)
						|| (type.lockOnToVehicles	&& etype.equals("Vehicle"))		// for vehicle of other Mod
						|| (type.lockOnToPlanes	&& entity instanceof EntityPlane)	
						|| (type.lockOnToPlanes	&& etype.equals("Plane"))			// for plane of other Mod
						|| (type.lockOnToPlayers && entity instanceof EntityPlayer)
						|| (type.lockOnToLivings && entity instanceof EntityLivingBase))
				{
					Vector3f relPosVec = new Vector3f(entity.posX - posX, entity.posY - posY, entity.posZ - posZ);
					float angle = Math.abs(Vector3f.angle(motionVec, relPosVec));
					if(angle < closestAngle)
					{
						closestEntity = entity;
						closestAngle = angle;
					}
				}
			}

			if(closestEntity != null)
				lockedOnTo = closestEntity;
		}
	}
	
	@Override
	public void setVelocity(double d, double d1, double d2)
	{
		motionX = d;
		motionY = d1;
		motionZ = d2;
		if(prevRotationPitch == 0.0F && prevRotationYaw == 0.0F)
		{
			float f = MathHelper.sqrt(d * d + d2 * d2);
			prevRotationYaw = rotationYaw = (float)((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
			prevRotationPitch = rotationPitch = (float)((Math.atan2(d1, f) * 180D) / 3.1415927410125732D);
			setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
		}
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		try
		{
			if(type==null)
			{
				FlansMod.log("EntityBullet.onUpdate() Error: BulletType is null ("+this+")");
				setDead();
				return;
			}


			if(type.despawnTime > 0 && ticksExisted > type.despawnTime)
			{
				detonated = true;
				setDead();
				return;
			}

			if(!hasSetSubDelay && type.hasSubmunitions)
			{
				setSubmunitionDelay();
			}
			else if(type.hasSubmunitions)
			{
				submunitionDelay --;
			}
			
			if(!hasSetVLSDelay && type.VLS)
			{
				VLSDelay = type.VLSTime;
				hasSetVLSDelay = true;
			}
			
			if(VLSDelay > 0)
				VLSDelay--;
			
			if(!hasSetLook && owner != null)
			{
				lookVector = new Vector3f((float)owner.getLookVec().xCoord, (float)owner.getLookVec().yCoord,(float)owner.getLookVec().zCoord);
				initialPos = new Vector3f(owner.posX, owner.posY, owner.posZ);
				hasSetLook = true;
			}

		

			if(soundTime > 0)
				soundTime--;

			if(owner != null)
			{
				double rangeX = owner.posX - this.posX;
				double rangeY = owner.posY - this.posY;
				double rangeZ = owner.posZ - this.posZ;
				double range = Math.sqrt((rangeX * rangeX) + (rangeY * rangeY) + (rangeZ * rangeZ));

				if(type.maxRange != -1 && type.maxRange < range)
				{
					if(ticksExisted > type.fuse && type.fuse > 0)
						detonate();
					setDead();
				}
			}
		
			//This checks if the shooter and/or player can be found. If they are loaded/online they will be included in the FiredShot data, if not this data will be deleted/ignored
			if (checkforuuids)
			{
				EntityPlayerMP player = null;
				Entity shooter = null;
				
				if (playeruuid != null)
				{
				for (Entity entity : world.loadedEntityList)
				{
					if (entity.getUniqueID().equals(playeruuid) && entity instanceof EntityPlayerMP)
					{
						player = (EntityPlayerMP)entity;
						break;
					}
				}
				playeruuid = null;
			}
			
			if (shooteruuid != null)
			{
				if (player != null && shooteruuid.equals(player.getUniqueID()))
				{
					shooter = player;
				}
				else
				{
					for (Entity entity : world.loadedEntityList)
					{
						if (entity.getUniqueID().equals(shooteruuid))
						{
							shooter = entity;
							break;
						}
					}
				}
				shooteruuid = null;
			}
			
			if (shooter != null)
			{
				shot = new FiredShot(shot.getFireableGun(), shot.getBulletType(), shooter, player);
			}
			
			checkforuuids = false;
			}
			
			BulletType type = this.getFiredShot().getBulletType();
			
			// Movement dampening variables
			float drag = 0.99F;
			float gravity = 0.02F;
			// If the bullet is in water, spawn particles and increase the drag
			if(isInWater())
			{
				if (world.isRemote)
				{
					for(int i = 0; i < 4; i++)
					{
						float bubbleMotion = 0.25F;
						world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, posX - motionX * bubbleMotion,
							posY - motionY * bubbleMotion, posZ - motionZ * bubbleMotion, motionX, motionY, motionZ);
					}
				}
				drag = 0.8F;
			}
			
			motionX *= drag;
			motionY *= drag;
			motionZ *= drag;
			motionY -= gravity * type.fallSpeed;
			
			// Apply motion
			this.setPosition(posX + motionX, posY + motionY, posZ + motionZ);
			
			// Recalculate the angles from the new motion
			float motionXZ = MathHelper.sqrt(motionX * motionX + motionZ * motionZ);
			rotationYaw = (float)((Math.atan2(motionX, motionZ) * 180D) / 3.1415927410125732D);
			rotationPitch = (float)((Math.atan2(motionY, motionXZ) * 180D) / 3.1415927410125732D);
			// Reset the range of the angles
			for(; rotationPitch - prevRotationPitch < -180F; prevRotationPitch -= 360F)
			{
			}
			for(; rotationPitch - prevRotationPitch >= 180F; prevRotationPitch += 360F)
			{
			}
			for(; rotationYaw - prevRotationYaw < -180F; prevRotationYaw -= 360F)
			{
			}
			for(; rotationYaw - prevRotationYaw >= 180F; prevRotationYaw += 360F)
			{
			}
			rotationPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * 0.2F;
			rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw) * 0.2F;
			
			
			if(world.isRemote)
			{
				onUpdateClient();
				return;
			}
			
			
			if(FlansMod.DEBUG)
				world.spawnEntity(new EntityDebugVector(world, new Vector3f(posX, posY, posZ),
						new Vector3f(motionX, motionY, motionZ), 20));
			
			// Check the fuse to see if the bullet should explode
			ticksInAir++;
			if(ticksInAir > type.fuse && type.fuse > 0 && !isDead)
			{
				setDead();
			}
			
			if(ticksExisted > bulletLife)
			{
				setDead();
			}
			
			if(isDead)
				return;
			
			//Detonation conditions
			if(!worldObj.isRemote)
			{
				if(ticksExisted > type.fuse && type.fuse > 0)
					detonate();
				//If this grenade has a proximity trigger, check for living entities within it's range
				if(type.livingProximityTrigger > 0 || type.driveableProximityTrigger > 0)
				{
					float checkRadius = Math.max(type.livingProximityTrigger, type.driveableProximityTrigger);
					List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(checkRadius, checkRadius, checkRadius));
					for(Object obj : list)
					{
						if(obj == owner && ticksExisted < 10)
							continue;
						if(obj instanceof EntityLivingBase && getDistanceToEntity((Entity)obj) < type.livingProximityTrigger)
						{
							//If we are in a gametype and both thrower and triggerer are playing, check for friendly fire
							if(TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && obj instanceof EntityPlayerMP && owner instanceof EntityPlayer)
							{
								if(!TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj, new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)owner, type, false)))
									continue;
							}
							if(type.damageToTriggerer > 0)
								((EntityLivingBase)obj).attackEntityFrom(getBulletDamage(false), type.damageToTriggerer);
							FlansMod.proxy.spawnParticle("redstone", posX, posY, posZ, 0,0,0);

							detonate();
							break;
						}
						if(obj instanceof EntityDriveable && getDistanceToEntity((Entity)obj) < type.driveableProximityTrigger)
						{
							/**
							if(TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && ((EntityDriveable)obj).seats[0].riddenByEntity instanceof EntityPlayerMP && owner instanceof EntityPlayer)
							{
								EntityPlayerMP player = (EntityPlayerMP)((EntityDriveable)obj).seats[0].riddenByEntity;
								if(!TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj, new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)owner, type, false)))
									continue;
							}
							*/
							if(type.damageToTriggerer > 0)
								((EntityDriveable)obj).attackEntityFrom(getBulletDamage(false), type.damageToTriggerer);
							detonate();
							break;
						}
					}
				}
			}
			//Create a list for all bullet hits
			ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

			Vector3f origin = new Vector3f(posX, posY, posZ);
			Vector3f motion = new Vector3f(motionX, motionY, motionZ);
			
			if(!world.isRemote)
			{
				Entity ignore = shot.getPlayerOptional().isPresent() ? shot.getPlayerOptional().get() : shot.getShooterOptional().orElse(null);
				Integer ping = 0;
				if (shot.getPlayerOptional().isPresent())
					ping = shot.getPlayerOptional().get().ping;
				
				List<BulletHit> hits = FlansModRaytracer.Raytrace(world, ignore, ticksInAir > 20, this, origin, motion, ping, 0f);
				
				// We hit something
				if(!hits.isEmpty())
				{
					for(BulletHit bulletHit : hits)
					{
						Vector3f hitPos = new Vector3f(origin.x + motion.x * bulletHit.intersectTime,
								origin.y + motion.y * bulletHit.intersectTime,
								origin.z + motion.z * bulletHit.intersectTime);

						currentPenetratingPower = ShotHandler.OnHit(world, hitPos, motion, shot, bulletHit, currentPenetratingPower);
						if (currentPenetratingPower <= 0f)
						{
							ShotHandler.onDetonate(world, shot, hitPos);
							setDead();
							break;
						}
					}
				}
			}
				
			//TODO Client homing fix
			// Apply homing action
			if(lockedOnTo != null)
			{

				if(lockedOnTo instanceof EntityDriveable)
				{
					EntityDriveable entDriveable = (EntityDriveable) lockedOnTo;
					// entPlane.isLockedOn = true;
					if(entDriveable.getDriveableType().lockedOnSound != null && soundTime <= 0 && !this.worldObj.isRemote)
					{
						PacketPlaySound.sendSoundPacket(lockedOnTo.posX, lockedOnTo.posY, lockedOnTo.posZ,
								entDriveable.getDriveableType().lockedOnSoundRange, dimension, entDriveable.getDriveableType().lockedOnSound, false);
						soundTime = entDriveable.getDriveableType().soundTime;
					}
				}
				else
				{
					lockedOnTo.getEntityData().setBoolean("Tracking", true);
				}

				if(this.ticksExisted > type.tickStartHoming)
				{
					double dX = lockedOnTo.posX - posX;
					double dY;
					if(type.isDoTopAttack && Math.abs(lockedOnTo.posX - this.posX) > 2 && Math.abs(lockedOnTo.posZ - this.posZ) > 2)
						dY = lockedOnTo.posY + 30 - posY;
					else dY = lockedOnTo.posY - posY;
					double dZ = lockedOnTo.posZ - posZ;
					double dXYZ;
					if(!type.isDoTopAttack)
						dXYZ = getDistanceToEntity(lockedOnTo);
					else dXYZ = Math.sqrt(dX * dX + dY * dY + dZ * dZ);

					if(owner != null && type.enableSACLOS)
					{
						double dXp = lockedOnTo.posX - owner.posX;
						double dYp = lockedOnTo.posY - owner.posY;
						double dZp = lockedOnTo.posZ - owner.posZ;
						Vec3 playerVec = owner.getLookVec();
						Vector3f playerVec3f = new Vector3f(playerVec.xCoord, playerVec.yCoord, playerVec.zCoord);
						double angles = Math.abs(Vector3f.angle(playerVec3f, new Vector3f(dXp, dYp, dZp)));
						if(angles > Math.toRadians(type.maxDegreeOfSACLOS))
						{
							lockedOnTo = null;
						}
					}

					if(this.toggleLock)
					{
						//prevDistanceToEntity = dXYZ;
						if(dXYZ > type.maxRangeOfMissile)
							lockedOnTo = null;
						toggleLock = false;
					}

					// Vector3f lockedOnToVector = new Vector3f(dX,dY,dZ);

					double dmotion = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);

					Vector3f motionVector = new Vector3f(dX * dmotion / dXYZ, dY * dmotion / dXYZ, dZ * dmotion / dXYZ);

					double angle = Math.abs(Vector3f.angle(motion, motionVector));

					if(angle > Math.toRadians(type.maxDegreeOfMissile))
					{
						lockedOnTo = null;
					}
					else
					{
						motionX = motionVector.x;
						motionY = motionVector.y;
						motionZ = motionVector.z;
					}

					if(this.ticksExisted > 4 && dXYZ > prevDistanceToEntity)
					{
						closeCount++;
						if(closeCount > 15)
						{
							lockedOnTo = null;
						}
					}
					else
					{
						if(closeCount > 0)
							closeCount--;
					}
					prevDistanceToEntity = dXYZ;
				}

				if(lockedOnTo instanceof EntityDriveable)
				{
					EntityDriveable plane = (EntityDriveable) lockedOnTo;

					if(plane.varFlare || plane.ticksFlareUsing > 0)// && !type.enableSACLOS)
					{
						lockedOnTo = null;
					}
				}
				else if(lockedOnTo != null && lockedOnTo.getEntityData().getBoolean("FlareUsing"))
				{
					lockedOnTo = null;
				}
				motionZ += lockOnPull * dZ / dXYZ;
			}

			if(owner != null && type.shootForSettingPos && !this.isFirstPositionSetting)
			{
				if(this.owner instanceof EntityPlayer)
				{
					EntityPlayer entP = (EntityPlayer)this.owner;
					if(entP.getCurrentEquippedItem() != null)
					if(entP.getCurrentEquippedItem().getItem() instanceof ItemGun){
						ItemGun itemGun = (ItemGun) entP.getCurrentEquippedItem().getItem();
						this.impactX = itemGun.impactX;
						this.impactY = itemGun.impactY;
						this.impactZ = itemGun.impactZ;
					}

				}
				this.isFirstPositionSetting = true;
			}

			if(type.shootForSettingPos && this.isFirstPositionSetting && this.isPositionUpper)
			{
				double motionXa = this.motionX;
				double motionYa = this.motionY;
				double motionZa = this.motionZ;
				double motiona = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
				this.motionX = 0;
				this.motionY = motiona;
				this.motionZ = 0;

				if(this.posY - type.shootForSettingPosHeight > owner.posY){
					this.isPositionUpper = false;
				}
			}
			if(type.shootForSettingPos && this.isFirstPositionSetting && !this.isPositionUpper)
			{
				double rootx = this.impactX - this.posX;
				double rootz = this.impactZ - this.posZ;
				double roota = Math.sqrt((rootx * rootx) + (rootz * rootz));
				double motionXa = this.motionX;
				double motionYa = this.motionY;
				double motionZa = this.motionZ;
				double motiona = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
				this.motionX = rootx * motiona / roota;
				this.motionZ = rootz * motiona / roota;
				if(Math.abs(this.impactX - this.posX) < 1 && Math.abs(this.impactZ - this.posZ) < 1){
					double motionXab = this.motionX;
					double motionYab = this.motionY;
					double motionZab = this.motionZ;
					double motionab = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
					this.motionX = 0;
					this.motionY = -motionab;
					this.motionZ = 0;
				}
			}
			
			this.renderDistanceWeight = 256D;
			if(owner != null && type.manualGuidance && VLSDelay <= 0 && lockedOnTo == null)
			{

				this.renderDistanceWeight = 256D;
				/**
				boolean beamRider = true;
				if(!beamRider)
				{
					this.rotationYaw = owner.rotationYaw;
					this.rotationPitch = owner.rotationPitch;
					double dist = MathHelper.sqrt_double( motionX*motionX + motionY*motionY + motionZ*motionZ );
					final float PI = (float) Math.PI;
					motionX = dist * -MathHelper.sin((rotationYaw   / 180F) * PI) * MathHelper.cos((rotationPitch / 180F) * PI)*1.02;
					motionZ = dist *  MathHelper.cos((rotationYaw   / 180F) * PI) * MathHelper.cos((rotationPitch / 180F) * PI)*1.02;
					motionY = dist * -MathHelper.sin((rotationPitch / 180F) * PI)*1.02;
				} else 
				*/

					Vector3f lookVec;
					Vector3f origin2;
					lookVec = new Vector3f((float)owner.getLookVec().xCoord, (float)owner.getLookVec().yCoord,(float)owner.getLookVec().zCoord);
					origin2 = new Vector3f(owner.posX, owner.posY, owner.posZ);

					if(type.fixedDirection)
					{
						lookVec = lookVector;
						origin2 = initialPos;	
					}
					float x = (float)(posX - origin2.x);
					float y = (float)(posY - origin2.y);
					float z = (float)(posZ - origin2.z);
					
					float d = (float)Math.sqrt((x*x) + (y*y) + (z*z));
					d = d+type.turnRadius;
					
					lookVec.normalise();
					
					Vector3f targetPoint = new Vector3f(origin2.x + (lookVec.x*d), origin2.y + (lookVec.y*d), origin2.z + (lookVec.z*d));
					//FlansMod.proxy.spawnParticle("explode", targetPoint.x,targetPoint.y,targetPoint.z, 0,0,0);
					//double dX = owner.posX - this.posX;
					//double dY = owner.posY - this.posY;
					//double dZ = owner.posZ - this.posZ;
					//targetPoint = new Vector3f(owner.posX, owner.posY, owner.posZ);
					
					Vector3f diff = Vector3f.sub(targetPoint, new Vector3f(posX, posY, posZ), null);

					float speed2 = type.trackPhaseSpeed;
					float turnSpeed = type.trackPhaseTurn;
					diff.normalise();
					turnSpeed = 0.1F;
					Vector3f targetSpeed = new Vector3f(diff.x * speed2, diff.y * speed2, diff.z * speed2);
					
					this.motionX += (targetSpeed.x - motionX) * turnSpeed;
					this.motionY += (targetSpeed.y - motionY) * turnSpeed;
					this.motionZ += (targetSpeed.z - motionZ) * turnSpeed;
					
					//this.rotationYaw = owner.rotationYaw;
					//this.rotationPitch = owner.rotationPitch;
			}
			
			
			if(type.torpedo)
			{
				if(isInWater()){
					Vector3f motion2 = new Vector3f(motionX, motionY, motionZ);
					float length = motion.length();
					motion.normalise();
					motionY *= 0.3F;
					motionX = motion.x * 1;
					motionZ = motion.z * 1;
				}
			}

				
			//Apply motion
			//posX += motionX;
			//posY += motionY;
			//posZ += motionZ;
			setPosition(posX + motionX, posY + motionY, posZ + motionZ);

			//Recalculate the angles from the new motion
			float motionXZ = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
			rotationYaw = (float) ((Math.atan2(motionX, motionZ) * 180D) / 3.1415927410125732D);
			rotationPitch = (float) ((Math.atan2(motionY, motionXZ) * 180D) / 3.1415927410125732D);
			//Reset the range of the angles
			for (; rotationPitch - prevRotationPitch < -180F; prevRotationPitch -= 360F){}
			for (; rotationPitch - prevRotationPitch >= 180F; prevRotationPitch += 360F){}
			for (; rotationYaw - prevRotationYaw < -180F; prevRotationYaw -= 360F){}
			for (; rotationYaw - prevRotationYaw >= 180F; prevRotationYaw += 360F){}
			rotationPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * 0.2F;
			rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw) * 0.2F;

			//Particles
			if (type.trailParticles && worldObj.isRemote && ticksInAir > 1)
			{
				spawnParticles();
			}
			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			super.setDead();
		}
	}
	
	@SideOnly(Side.CLIENT)
	private void onUpdateClient()
	{
		// Particles
		if(shot.getBulletType().trailParticles)
		{
			spawnParticles();
		}
		
		if(getDistanceSq(Minecraft.getMinecraft().player) < 5 && !playedFlybySound)
		{
			playedFlybySound = true;
			FMLClientHandler.instance().getClient().getSoundHandler()
					.playSound(new PositionedSoundRecord(FlansModResourceHandler.getSoundEvent("bulletFlyby"), SoundCategory.HOSTILE, 10F,
							1.0F / (rand.nextFloat() * 0.4F + 0.8F), (float)posX, (float)posY, (float)posZ));
		}
	}
	
	@SideOnly(Side.CLIENT)
	private void spawnParticles()
	{
		double dX = (posX - prevPosX) / 10;
		double dY = (posY - prevPosY) / 10;
		double dZ = (posZ - prevPosZ) / 10;

		float spread = 0.1F;
		if(VLSDelay > 0 && type.boostPhaseParticle != null)
		{
			for(int i = 0; i < 10; i++)
			{
				Particle particle = FlansModClient.getParticle(type.boostPhaseParticle, world,
						prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread,
						prevPosZ + dZ * i + rand.nextGaussian() * spread);
				// TODO: [1.12] once again, render distance
				
				//if (particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
				//	particle.renderDistanceWeight = 100D;
				world.spawnEntity(particle);
			}
		}
		else if (!type.VLS ||(VLSDelay <= 0))
		{
			for (int i = 0; i < 10; i++)
			{
					//particle.renderDistanceWeight = 100D;
				//worldObj.spawnEntityInWorld(particle);
				FlansMod.proxy.spawnParticle(shot.getBulletType().trailParticleType,
						prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
						0,0,0);
			}
		}
	}


	@SideOnly(Side.CLIENT)
	private void spawnHitParticles(double x, double y, double z)
	{
		FlansMod.proxy.spawnParticle("explode", x,y,z, 0,0,0);

	}

	public DamageSource getBulletDamage(boolean headshot)
	{
		if(owner instanceof EntityPlayer)
			return (new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)owner, firedFrom, headshot)).setProjectile();
		else return (new EntityDamageSourceIndirect(type.shortName, this, owner)).setProjectile();
	}

	private boolean isPartOfOwner(Entity entity) {
		if (owner == null)
			return false;
		if (entity == owner || entity == owner.riddenByEntity || entity == owner.ridingEntity)
			return true;
		if (owner instanceof EntityPlayer) {
			if (PlayerHandler.getPlayerData((EntityPlayer) owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER) == null)
				return false;
			EntityMG mg = PlayerHandler.getPlayerData((EntityPlayer) owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER).mountingGun;
			if (mg != null && mg == entity) {
				return true;
			}
		}
		return owner.ridingEntity instanceof EntitySeat && (((EntitySeat) owner.ridingEntity).driveable == null || ((EntitySeat) owner.ridingEntity).driveable.isPartOfThis(entity));
	}
	
	@Override
	public void setDead()
	{
		try
		{
			if (isDead)
			return;

		super.setDead();

			if(worldObj.isRemote)
				return;

//			FlansMod.log("EntityBullet.setDead() "+type.shortName + " : "+this);

			if(type.explosionRadius > 0)
			{
		        if(owner instanceof EntityPlayer)
				{
			        new FlansModExplosion(worldObj, this, (EntityPlayer)owner, type, posX, posY, posZ,
				        type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks,
				        type.explosionDamageVsLiving, type.explosionDamageVsPlayer, type.explosionDamageVsPlane, type.explosionDamageVsVehicle, type.smokeParticleCount, type.debrisParticleCount);
				}
		        else
				{
					worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions);
				}
			}
			if(type.fireRadius > 0)
			{
				for(float i = -type.fireRadius; i < type.fireRadius; i++)
				{
					for(float k = -type.fireRadius; k < type.fireRadius; k++)
					{
						for(int j = -1; j < 1; j++)
						{
							if (worldObj.getBlock((int)(posX + i), (int)(posY + j), (int)(posZ + k)).getMaterial() == Material.air)
							{
								worldObj.setBlock((int)(posX + i), (int)(posY + j), (int)(posZ + k), Blocks.fire);
							}
						}
					}
				}
			}
			//Send flak packet
			if(type.flak > 0)
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
			// Drop item on hitting if bullet requires it
			if (type.dropItemOnHit != null)
			{
				String itemName = type.dropItemOnHit;
				int damage = 0;
				if (itemName.contains("."))
				{
					damage = Integer.parseInt(itemName.split("\\.")[1]);
					itemName = itemName.split("\\.")[0];
				}
				ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
				entityDropItem(dropStack, 1.0F);
			}
		}
		catch(Exception e)
		{
//			FlansMod.log("EntityBullet.setDead() Error ("+this+")");
			if(FlansMod.printStackTrace)
			{
				e.printStackTrace();
			}
		}
	}
	
	public float moveToTarget(float current, float target, float speed)
	{	

		float pitchToMove = (float)((Math.sqrt(target*target)) - Math.sqrt((current*current)));
		for(; pitchToMove > 180F; pitchToMove -= 360F) {}
		for(; pitchToMove <= -180F; pitchToMove += 360F) {}
		
		float signDeltaY = 0;
		if(pitchToMove > speed){
			signDeltaY = 1;
		} else if(pitchToMove < -speed){
			signDeltaY = -1;
		} else {
			signDeltaY = 0;
			return target;
		}
		
		
		if(current > target)
		{
			current = current - speed;
		}
		
		else if(current < target)
		{
			current = current + speed;
		}
		
		
		
		return current;
	}



	public void detonate()
	{
		//Do not detonate before grenade is primed
		if(ticksExisted < type.primeDelay)
			return;

		/*if(lockedOnTo != null)
		if(lockedOnTo instanceof EntityDriveable){
			EntityDriveable entPlane = (EntityDriveable)lockedOnTo;
			entPlane.isLockedOn = false;
		}*/

		//Stop repeat detonations
		if(detonated)
			return;
		detonated = true;

		//Play detonate sound
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.detonateSound, true);

		//Explode
		if(!worldObj.isRemote && type.explosionRadius > 0.1F)
		{
	        if((owner instanceof EntityPlayer))
	        {
	        	new FlansModExplosion(worldObj, this, (EntityPlayer)owner, type, posX, posY, posZ,
		        		type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks,
		        		type.explosionDamageVsLiving, type.explosionDamageVsPlayer, type.explosionDamageVsPlane, type.explosionDamageVsVehicle, type.smokeParticleCount, type.debrisParticleCount);
	        	isDead = true;
	        }
	        else
	        {
	        	worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks);
	        	isDead = true;
	        }
		}

		//Make fire
		if(!worldObj.isRemote && type.fireRadius > 0.1F)
		{
			for(float i = -type.fireRadius; i < type.fireRadius; i++)
			{
				for(float j = -type.fireRadius; j < type.fireRadius; j++)
				{
					for(float k = -type.fireRadius; k < type.fireRadius; k++)
					{
						int x = MathHelper.floor_double(i + posX);
						int y = MathHelper.floor_double(j + posY);
						int z = MathHelper.floor_double(k + posZ);
						if(i * i + j * j + k * k <= type.fireRadius * type.fireRadius && worldObj.getBlock(x, y, z) == Blocks.air && rand.nextBoolean())
						{
							worldObj.setBlock(x, y, z, Blocks.fire, 0, 3);
						}
					}
				}
			}
		}

		//Make explosion particles
		for(int i = 0; i < type.explodeParticles; i++)
		{
			worldObj.spawnParticle(type.explodeParticleType, posX, posY, posZ, rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian());
		}

		//Drop item upon detonation, after explosions and whatnot
		if(!worldObj.isRemote && type.dropItemOnDetonate != null)
		{
			String itemName = type.dropItemOnDetonate;
			int damage = 0;
			if (itemName.contains("."))
			{
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
			entityDropItem(dropStack, 1.0F);
		}
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound tag)
	{
		tag.setString("type", shot.getBulletType().shortName);
		FireableGun gun = shot.getFireableGun();
		//this data will only be present and saved on the server side
		if (gun != null)
		{
			NBTTagCompound fireablegun = new NBTTagCompound();
			fireablegun.setInteger("infotype", gun.getInfoType().shortName.hashCode());
			fireablegun.setFloat("spread", gun.getGunSpread());
			fireablegun.setFloat("speed", gun.getBulletSpeed());
			fireablegun.setFloat("damage", gun.getDamage());
			fireablegun.setFloat("vehicledamage", gun.getDamageAgainstVehicles());
			tag.setTag("fireablegun",fireablegun);
		
			shot.getPlayerOptional().ifPresent((EntityPlayerMP player) -> 
			{
				
				NBTTagCompound compound = NBTUtil.createUUIDTag(player.getUniqueID());
				tag.setTag("player", compound);
			});
			
			shot.getShooterOptional().ifPresent((Entity shooter) -> 
			{
				NBTTagCompound compound = NBTUtil.createUUIDTag(shooter.getUniqueID());
				tag.setTag("shooter", compound);
			});
			
		}
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound tag)
	{
		FireableGun fireablegun = null;
		String shortName = tag.getString("type");
		BulletType type = BulletType.getBullet(shortName);
		this.dataManager.set(BULLET_TYPE, shortName);
		
		if (tag.hasKey("fireablegun"))
		{
			NBTTagCompound gun = tag.getCompoundTag("fireablegun");
			fireablegun = new FireableGun(InfoType.getType(gun.getInteger("infotype")), gun.getFloat("damage"), gun.getFloat("vehicledamage"), gun.getFloat("spread"), gun.getFloat("speed"));
		}
		
		if (tag.hasKey("player"))
		{
			playeruuid = NBTUtil.getUUIDFromTag(tag.getCompoundTag("player"));
			checkforuuids = true;
		}

		if (tag.hasKey("shooter"))
		{
			shooteruuid = NBTUtil.getUUIDFromTag(tag.getCompoundTag("shooter"));
			checkforuuids = true;
		}
		
		shot = new FiredShot(fireablegun, type);
	}

	@Override
	public float getShadowSize()
	{
		return type.hitBoxSize;
	}

	public void setSubmunitionDelay()
	{
		submunitionDelay = type.subMunitionTimer;
		hasSetSubDelay = true;
	}

	public void DeploySubmunitions()
	{
		ItemShootable itemShootable = (ItemShootable)GameRegistry.findItem(FlansMod.MODID, type.submunition);
		ShootableType shootType = itemShootable.type;
		World world = worldObj;
		EntityLivingBase entityplayer = (EntityLivingBase)owner;
		for(int sm = 0; sm < type.numSubmunitions; sm++)
		{
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(motionX, motionY, motionZ),
					entityplayer,
					type.submunitionSpread,
					damage,
					speedA,
					0,
					firedFrom));
		}

		if(type.destroyOnDeploySubmunition)
		{
			detonate();
		}
	}

	public int getBrightnessForRender(float par1)
	{
		if(type.hasLight)
		{
			return 15728880;
		}
		else
		{
			int i = MathHelper.floor_double(this.posX);
			int j = MathHelper.floor_double(this.posZ);

			if (this.worldObj.blockExists(i, 0, j))
			{
				double d0 = (this.boundingBox.maxY - this.boundingBox.minY) * 0.66D;
				int k = MathHelper.floor_double(this.posY - (double)this.yOffset + d0);
				return this.worldObj.getLightBrightnessForSkyBlocks(i, k, j, 0);
			}
			else
			{
				return 0;
			}
		}
	}

	@Override
	public void writeSpawnData(ByteBuf data)
	{
		data.writeDouble(motionX);
		data.writeDouble(motionY);
		data.writeDouble(motionZ);
		data.writeInt(impactX);
		data.writeInt(impactY);
		data.writeInt(impactZ);
		data.writeInt(lockedOnTo == null ? -1 : lockedOnTo.getEntityId());
		ByteBufUtils.writeUTF8String(data, type.shortName);
		if (owner == null)
			ByteBufUtils.writeUTF8String(data, "null");
		else
			ByteBufUtils.writeUTF8String(data, owner.getCommandSenderName());
	}
	
	@Override
	public void readSpawnData(ByteBuf data)
	{
		try
		{
			motionX = data.readDouble();
			motionY = data.readDouble();
			motionZ = data.readDouble();
			impactX = data.readInt();
			impactY = data.readInt();
			impactZ = data.readInt();
			int lockedOnToID = data.readInt();
			if(lockedOnToID != -1)
				lockedOnTo = worldObj.getEntityByID(lockedOnToID);
			type = BulletType.getBullet(ByteBufUtils.readUTF8String(data));
			penetratingPower = type.penetratingPower;
			String name = ByteBufUtils.readUTF8String(data);
			for(Object obj : worldObj.loadedEntityList)
			{
				if(((Entity)obj).getCommandSenderName().equals(name))
					owner = (EntityPlayer)obj;
			}
		}
		catch(Exception e)
		{
			FlansMod.log.error("Failed to read bullet owner from server.");
			super.setDead();
			FlansMod.log.throwing(e);
		}
	}
	
	@Override
	public boolean isBurning()
	{
		return false;
	}
	
	@Override
	public boolean canBePushed()
	{
		return false;
	}
	
	public FiredShot getFiredShot()
	{
		if (shot == null)
		{
			//we dont have this object, therefore we are on the client side and need to construct it
			shot = new FiredShot(null, BulletType.getBullet(this.dataManager.get(BULLET_TYPE)));
		}
		return shot;
	}
}
