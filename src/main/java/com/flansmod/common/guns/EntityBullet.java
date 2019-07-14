package com.flansmod.common.guns;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderHandEvent;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.raytracing.BlockHit;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.guns.raytracing.EntityHit;
import com.flansmod.common.guns.raytracing.EnumHitboxType;
import com.flansmod.common.guns.raytracing.PlayerBulletHit;
import com.flansmod.common.guns.raytracing.PlayerHitbox;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityBullet extends EntityShootable implements IEntityAdditionalSpawnData
{
	private static int bulletLife = 600; //Kill bullets after 30 seconds
	public Entity owner;
	private int ticksInAir;
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

	/** Private partial constructor to avoid repeated code. All constructors go through this one */
	private EntityBullet(World world, EntityLivingBase shooter, float gunDamage, BulletType bulletType, InfoType shotFrom)
	{
		this(world);
		owner = shooter;
		if(shooter instanceof EntityPlayerMP)
		pingOfShooter = ((EntityPlayerMP)shooter).ping;
		type = bulletType;
		firedFrom = shotFrom;
		damage = gunDamage;
		penetratingPower = type.penetratingPower;
		setSize(bulletType.hitBoxSize, bulletType.hitBoxSize);
	}

	/** Method called by ItemGun for creating bullets from a hand held weapon */
	public EntityBullet(World world, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, boolean shot, InfoType shotFrom)
	{
		this(world, Vec3.createVectorHelper(shooter.posX, shooter.posY + shooter.getEyeHeight(), shooter.posZ), shooter.rotationYaw, shooter.rotationPitch, shooter, spread, gunDamage, type1, speed, shotFrom);
		shotgun = shot;
	}

	/** Machinegun / AAGun bullet constructor */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, InfoType shotFrom)
	{
		this(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, 3.0F, shotFrom);
	}

	/** More generalised bullet constructor */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = -MathHelper.sin((rotationYaw / 180F) * 3.14159265F) * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
		motionZ = MathHelper.cos((rotationYaw / 180F) * 3.14159265F) * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
		motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
		setArrowHeading(motionX, motionY, motionZ, spread / 2F, speed);
	}

	/**  */
	public EntityBullet(World world, Vector3f origin, Vector3f direction, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		damage = gunDamage;
		setPosition(origin.x, origin.y, origin.z);
		motionX = direction.x;
		motionY = direction.y;
		motionZ = direction.z;
		setArrowHeading(motionX, motionY, motionZ, spread, speed);
	}

	/** Bomb constructor. Inherits the motion and rotation of the plane */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, double motX, double motY, double motZ, EntityLivingBase shooter, float gunDamage, BulletType type1, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = motX;
		motionY = motY;
		motionZ = motZ;
	}

	@Override
	protected void entityInit()
	{
	}

	public void setArrowHeading(double d, double d1, double d2, float spread, float speed)
	{
		float f2 = MathHelper.sqrt_double(d * d + d1 * d1 + d2 * d2);
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
		float f3 = MathHelper.sqrt_double(d * d + d2 * d2);
		prevRotationYaw = rotationYaw = (float) ((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
		prevRotationPitch = rotationPitch = (float) ((Math.atan2(d1, f3) * 180D) / 3.1415927410125732D);

		getLockOnTarget();
	}

	/** Find the entity nearest to the missile's trajectory, anglewise */
	private void getLockOnTarget()
	{
		if(type.lockOnToPlanes || type.lockOnToVehicles || type.lockOnToMechas || type.lockOnToLivings || type.lockOnToPlayers)
		{
			Vector3f motionVec = new Vector3f(motionX, motionY, motionZ);
			Entity closestEntity = null;
			float closestAngle = type.maxLockOnAngle * 3.14159265F / 180F;

			for(Object obj : worldObj.loadedEntityList)
			{
				Entity entity = (Entity)obj;
				String etype = entity.getEntityData().getString("EntityType");
				if( (type.lockOnToMechas	&& entity instanceof EntityMecha)	||
					(type.lockOnToVehicles	&& entity instanceof EntityVehicle) ||
					(type.lockOnToVehicles	&& etype.equals("Vehicle"))			|| // for vehicle of other Mod
					(type.lockOnToPlanes	&& entity instanceof EntityPlane)	||
					(type.lockOnToPlanes	&& etype.equals("Plane"))			|| // for plane of other Mod
					(type.lockOnToPlayers	&& entity instanceof EntityPlayer)	||
					(type.lockOnToLivings	&& entity instanceof EntityLivingBase))
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
		if (prevRotationPitch == 0.0F && prevRotationYaw == 0.0F)
		{
			float f = MathHelper.sqrt_double(d * d + d2 * d2);
			prevRotationYaw = rotationYaw = (float) ((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
			prevRotationPitch = rotationPitch = (float) ((Math.atan2(d1, f) * 180D) / 3.1415927410125732D);
			setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
		}
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();

		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
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
		} else if(type.hasSubmunitions){
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
		else
		{
			this.setDead();
		}


		//Check the fuse to see if the bullet should explode
		ticksInAir++;
		if (ticksInAir > type.fuse && type.fuse > 0 && !isDead)
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
		float hitBoxSize = type.hitBoxSize >= 0? type.hitBoxSize: 0;

		float speed = motion.length();

		speedA = speed;

		if(type.hasSubmunitions)
		{
			if(submunitionDelay < 0)
			{
				DeploySubmunitions();
				submunitionDelay = 9001;
			}
		}

		//Iterate over all entities
		for(int i = 0; i < worldObj.loadedEntityList.size(); i++)
		{
			Object obj = worldObj.loadedEntityList.get(i);
			//Get driveables
			if(obj instanceof EntityDriveable)
			{
				EntityDriveable driveable = (EntityDriveable)obj;

				if(driveable.isDead() || driveable.isPartOfThis(owner))
					continue;

				//If this bullet is within the driveable's detection range
				if(getDistanceToEntity(driveable) <= driveable.getDriveableType().bulletDetectionRadius + speed)
				{
					//Raytrace the bullet
					ArrayList<BulletHit> driveableHits = driveable.attackFromBullet(origin, motion);
					hits.addAll(driveableHits);
				}
			}
			//Get players
			else if(obj instanceof EntityPlayer)
			{
				EntityPlayer player = (EntityPlayer)obj;
				PlayerData data = PlayerHandler.getPlayerData(player);
				boolean shouldDoNormalHitDetect = false;
				if(data != null)
				{
					if(player.isDead || data.team == Team.spectators)
					{
						continue;
					}
					if(player == owner && ticksInAir < 20)
						continue;
					int snapshotToTry = TeamsManager.bulletSnapshotMin;
					if(TeamsManager.bulletSnapshotDivisor > 0)
					{
						snapshotToTry += pingOfShooter / TeamsManager.bulletSnapshotDivisor;
					}
					if(snapshotToTry >= data.snapshots.length)
						snapshotToTry = data.snapshots.length - 1;
					PlayerSnapshot snapshot;
					if(data.snapshots[snapshotToTry] != null){
						snapshot = data.snapshots[snapshotToTry];
					} else {
						snapshot = data.snapshots[0];
					}

					//DEBUG
					//snapshot = new PlayerSnapshot(player);

					//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
					if(snapshot == null)
						shouldDoNormalHitDetect = true;
					else
					{
						//Raytrace
						ArrayList<BulletHit> playerHits = snapshot.raytrace(origin, motion);
						hits.addAll(playerHits);
					}
				}

				//If we couldn't get a snapshot, use normal entity hitbox calculations
				if(data == null || shouldDoNormalHitDetect)
				{
					MovingObjectPosition mop = player.boundingBox.expand(hitBoxSize, hitBoxSize, hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ));
					if(mop != null)
					{
						Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - posX, mop.hitVec.yCoord - posY, mop.hitVec.zCoord - posZ);
						float hitLambda = 1F;
						if(motion.x != 0F)
							hitLambda = hitPoint.x / motion.x;
						else if(motion.y != 0F)
							hitLambda = hitPoint.y / motion.y;
						else if(motion.z != 0F)
							hitLambda = hitPoint.z / motion.z;
						if(hitLambda < 0)
							hitLambda = -hitLambda;

						hits.add(new PlayerBulletHit(new PlayerHitbox(player, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
					}
				}
			}
			else
			{
				Entity entity = (Entity)obj;
				if(entity != this && entity != owner && !entity.isDead && !(entity instanceof EntityItem) && !(entity instanceof EntityXPOrb) && !(entity instanceof EntityArrow) &&
					(entity.getClass().toString().indexOf("flansmod.")<0 || entity instanceof EntityAAGun || entity instanceof EntityGrenade))
				{
					AxisAlignedBB bb = entity.boundingBox.addCoord(
							-(entity.posX-entity.prevPosX)*2,
							-(entity.posY-entity.prevPosY)*2,
							-(entity.posZ-entity.prevPosZ)*2);
					MovingObjectPosition mop = bb.expand(hitBoxSize, hitBoxSize, hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ));
					if(mop != null)
					{
						Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - posX, mop.hitVec.yCoord - posY, mop.hitVec.zCoord - posZ);
						float hitLambda = 1F;
						if(motion.x != 0F)
							hitLambda = hitPoint.x / motion.x;
						else if(motion.y != 0F)
							hitLambda = hitPoint.y / motion.y;
						else if(motion.z != 0F)
							hitLambda = hitPoint.z / motion.z;
						if(hitLambda < 0)
							hitLambda = -hitLambda;

						hits.add(new EntityHit(entity, hitLambda));
					}
				}
			}
		}

		//Ray trace the bullet by comparing its next position to its current position
		Vec3 posVec = Vec3.createVectorHelper(posX, posY, posZ);
		Vec3 nextPosVec = Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ);
		MovingObjectPosition hit = worldObj.func_147447_a(posVec, nextPosVec, false, true, true);

		posVec = Vec3.createVectorHelper(posX, posY, posZ);

		if(hit != null)
		{
			//Calculate the lambda value of the intercept
			Vec3 hitVec = posVec.subtract(hit.hitVec);
			float lambda = 1;
			//Try each co-ordinate one at a time.
			if(motionX != 0)
				lambda = (float)(hitVec.xCoord / motionX);
			else if(motionY != 0)
				lambda = (float)(hitVec.yCoord / motionY);
			else if(motionZ != 0)
				lambda = (float)(hitVec.zCoord / motionZ);

			if(lambda < 0)
				lambda = -lambda;
			hits.add(new BlockHit(hit, lambda));
		}

		//We hit something
		if(!hits.isEmpty())
		{
			//Sort the hits according to the intercept position
			Collections.sort(hits);

			for(BulletHit bulletHit : hits)
			{
				if(bulletHit instanceof DriveableHit)
				{
					if(type.entityHitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					if(worldObj.isRemote){
						if(owner instanceof EntityPlayer){
							if(FlansMod.proxy.isThePlayer((EntityPlayer)owner)){
							    	hitCrossHair = true;
							}
						}
					}
					DriveableHit driveableHit = (DriveableHit)bulletHit;
					driveableHit.driveable.lastAtkEntity = owner;
					penetratingPower = driveableHit.driveable.bulletHit(this, driveableHit, penetratingPower);


					if(type.canSpotEntityDriveable)
						driveableHit.driveable.setEntityMarker(200);
					//driveableHit.driveable.isShowedPosition = true;
					//driveableHit.driveable.tickCount = 200;
					if(FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * driveableHit.intersectTime, posY + motionY * driveableHit.intersectTime, posZ + motionZ * driveableHit.intersectTime), 1000, 0F, 0F, 1F));

				}
				else if(bulletHit instanceof PlayerBulletHit)
				{
					if(type.entityHitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					if(worldObj.isRemote){
						if(owner instanceof EntityPlayer){
							if(FlansMod.proxy.isThePlayer((EntityPlayer)owner)){
							    	hitCrossHair = true;
							}
						}
					}
					PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
					penetratingPower = playerHit.hitbox.hitByBullet(this, penetratingPower);
					if(FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * playerHit.intersectTime, posY + motionY * playerHit.intersectTime, posZ + motionZ * playerHit.intersectTime), 1000, 1F, 0F, 0F));
				}
				else if(bulletHit instanceof EntityHit)
				{
					if(type.entityHitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					if(worldObj.isRemote){
						if(owner instanceof EntityPlayer){
							if(FlansMod.proxy.isThePlayer((EntityPlayer)owner)){
							    	hitCrossHair = true;
							}
						}
					}
					EntityHit entityHit = (EntityHit)bulletHit;
					float d = damage;
					if(entityHit.entity instanceof EntityLivingBase)
					{
						d *= type.damageVsLiving;
						if(entityHit.entity != owner)
						FlansMod.proxy.spawnParticle("reddust", entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 0,0,0);

					}
					else
					{
						d *= type.damageVsEntity;
					}
					if(entityHit.entity.attackEntityFrom(getBulletDamage(false), d) && entityHit.entity instanceof EntityLivingBase)
					{
						EntityLivingBase living = (EntityLivingBase)entityHit.entity;
						for(PotionEffect effect : type.hitEffects)
						{
							living.addPotionEffect(new PotionEffect(effect));
						}
						//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
						living.arrowHitTimer++;
						living.hurtResistantTime = living.maxHurtResistantTime / 2;
					}
					if(type.setEntitiesOnFire)
						entityHit.entity.setFire(20);
					penetratingPower -= 1F;
					if(FlansMod.DEBUG)
					{
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * entityHit.intersectTime, posY + motionY * entityHit.intersectTime, posZ + motionZ * entityHit.intersectTime), 1000, 1F, 1F, 0F));
						FlansMod.log(entityHit.entity.toString() + ": d=" + d + ": damage=" + damage + ": type.damageVsEntity=" + type.damageVsEntity);
					}
				}
				else if(bulletHit instanceof BlockHit)
				{
					BlockHit blockHit = (BlockHit)bulletHit;
					MovingObjectPosition raytraceResult = blockHit.raytraceResult;
					//If the hit wasn't an entity hit, then it must've been a block hit
					int xTile = raytraceResult.blockX;
					int yTile = raytraceResult.blockY;
					int zTile = raytraceResult.blockZ;
					if(FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord), 1000, 0F, 1F, 0F));

					Block block = worldObj.getBlock(xTile, yTile, zTile);
					Material mat = block.getMaterial();
					//If the bullet breaks glass, and can do so according to FlansMod, do so.
					if(type.breaksGlass && mat == Material.glass)
					{
						if(TeamsManager.canBreakGlass)
						{
							worldObj.setBlockToAir(xTile, yTile, zTile);
							FlansMod.proxy.playBlockBreakSound(xTile, yTile, zTile, block);
						}
					}

					if(worldObj.isRemote)
					{
						if (block.getMaterial() != Material.air && this.type.explosionRadius<=0)
						{
							int num = 2 + this.rand.nextInt(3);
							for(int i=0; i<num; i++)
							{
								FlansMod.proxy.spawnParticle(
									"blockcrack_" + Block.getIdFromBlock(block) + "_" + this.worldObj.getBlockMetadata(xTile, yTile, zTile),
									raytraceResult.hitVec.xCoord + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width,
									raytraceResult.hitVec.yCoord + 0.1D,
									raytraceResult.hitVec.zCoord + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width,
									-this.motionX * 4.0D,
									1.5D,
									-this.motionZ * 4.0D);
								FlansMod.proxy.spawnParticle("explode", raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord,0,0,0);
							}
						}
					}

					//penetratingPower -= block.getBlockHardness(worldObj, zTile, zTile, zTile);
					setPosition(hit.hitVec.xCoord, hit.hitVec.yCoord, hit.hitVec.zCoord);
					//play sound when bullet hits block
					if(type.hitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					setDead();
					break;
				}
				if(penetratingPower <= 0F || (type.explodeOnImpact && ticksInAir > 1))
				{
					setPosition(posX + motionX * bulletHit.intersectTime, posY + motionY * bulletHit.intersectTime, posZ + motionZ * bulletHit.intersectTime);
					setDead();
					break;
				}

			}

		}
		//Otherwise, do a standard check for uninteresting entities
		/*
		else
		{
			//Iterate over entities close to the bullet to see if any of them have been hit and hit them
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.addCoord(motionX, motionY, motionZ).expand(type.hitBoxSize, type.hitBoxSize, type.hitBoxSize));
			for (int l = 0; l < list.size(); l++)
			{
				Entity checkEntity = (Entity) list.get(l);
				//Driveable collisions are handled earlier
				if(checkEntity instanceof EntityDriveable)
					continue;

				if(checkEntity instanceof EntityPlayer)
					continue;

				//Stop the bullet hitting stuff that can't be collided with or the person shooting immediately after firing it
				if((!checkEntity.canBeCollidedWith() || isPartOfOwner(checkEntity)) && ticksInAir < 20)
				{
					continue;
				}


				//Calculate the hit damage
				float hitDamage = damage * type.damageVsLiving;
				//Create a damage source object
				DamageSource damagesource = owner == null ? DamageSource.generic : getBulletDamage(false);

				//When the damage is 0 (such as with Nerf guns) the entityHurt Forge hook is not called, so this hacky thing is here
				if(hitDamage == 0 && checkEntity instanceof EntityPlayerMP && TeamsManager.getInstance().currentRound != null)
					TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)checkEntity, damagesource);

				//Attack the entity!
				if(checkEntity.attackEntityFrom(damagesource, hitDamage))
				{
					//If the attack was allowed and the entity is alive, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
					if (checkEntity instanceof EntityLivingBase)
					{
						((EntityLivingBase) checkEntity).arrowHitTimer++;
						((EntityLivingBase) checkEntity).hurtResistantTime = ((EntityLivingBase) checkEntity).maxHurtResistantTime / 2;
					}
					//Yuck.
					//PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
				}
				//Unless the bullet penetrates, kill it
				if(type.penetratingPower > 0)
				{
					setPosition(checkEntity.posX, checkEntity.posY, checkEntity.posZ);
					setDead();
					break;
				}
			}
		}
		*/

		//Movement dampening variables
		float drag = type.dragInAir;
		float gravity = 0.02F;
		//If the bullet is in water, spawn particles and increase the drag
		if (isInWater())
		{
			for(int i = 0; i < 4; i++)
			{
				float bubbleMotion = 0.25F;
				worldObj.spawnParticle("bubble", posX - motionX * bubbleMotion, posY - motionY * bubbleMotion, posZ - motionZ * bubbleMotion, motionX, motionY + 0.1F, motionZ);
			}
			drag = type.dragInWater;
		}
		if(!isInWater() || !type.torpedo){
		motionX *= drag;
		motionY *= drag;
		motionZ *= drag;
		motionY -= gravity * type.fallSpeed;
		}

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
		}

		//System.out.println((int)posX+","+(int)posY+","+(int)posZ);

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

		if(type.shootForSettingPos && this.isFirstPositionSetting && this.isPositionUpper){
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
		if(type.shootForSettingPos && this.isFirstPositionSetting && !this.isPositionUpper){
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

		//Temporary fire glitch fix
		if(worldObj.isRemote)
			extinguish();
	}

	@SideOnly(Side.CLIENT)
	private void spawnParticles()
	{
		double dX = (posX - prevPosX) / 10;
		double dY = (posY - prevPosY) / 10;
		double dZ = (posZ - prevPosZ) / 10;

		float spread = 0.1F;
		if(VLSDelay > 0 && type.boostPhaseParticle != null){
			for (int i = 0; i < 10; i++)
			{			
				FlansMod.proxy.spawnParticle(type.boostPhaseParticle,
						prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
						0,0,0);
			}
		} else if (!type.VLS ||(VLSDelay <= 0)){
			for (int i = 0; i < 10; i++)
			{
				//EntityFX particle = FlansModClient.getParticle("flansmod.rocketexhaust", worldObj, prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread);
				//if(particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
					//particle.renderDistanceWeight = 100D;
				//worldObj.spawnEntityInWorld(particle);
				FlansMod.proxy.spawnParticle(type.trailParticleType,
						prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
						0,0,0);
			}
			
		}
		//FlansMod.proxy.spawnParticle("explode", prevPosX + dX, prevPosY + dY, prevPosZ + dZ, motionX + (float)Math.random()*1 - 0.5, motionY + (float)Math.random()*1 - 0.5, motionZ +(float)Math.random()*1 - 0.5);

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
		if(type == null)
		{
			FlansMod.log("EntityBullet.writeEntityToNBT() Error: BulletType is null ("+this+")");
			setDead();
			return;
		}
		tag.setString("type", type.shortName);
		if (owner == null)
			tag.setString("owner", "null");
		else
			tag.setString("owner", owner.getCommandSenderName());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound tag)
	{
		String typeString = tag.getString("type");
		String ownerName = tag.getString("owner");

		if (typeString != null)
			type = BulletType.getBullet(typeString);

		if(type == null)
		{
//			FlansMod.log("EntityBullet.readEntityFromNBT() Error: BulletType is null ("+this+")");
			this.isDead = true;
			return;
		}

		if(type.despawnTime <= 0)
		{
			this.isDead = true;
		}

		if (ownerName != null && !ownerName.equals("null"))
			owner = FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().func_152612_a(ownerName);
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
			FlansMod.log("Failed to read bullet owner from server.");
			super.setDead();
			e.printStackTrace();
		}
	}

	@Override
    public boolean isBurning()
    {
    	return false;
    }
}
