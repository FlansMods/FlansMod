package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

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
	/** For homing missiles */
	public Entity lockedOnTo;
	
	public float penetratingPower;

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
				if((type.lockOnToMechas && entity instanceof EntityMecha) || (type.lockOnToVehicles && entity instanceof EntityVehicle) || (type.lockOnToPlanes && entity instanceof EntityPlane) || (type.lockOnToPlayers && entity instanceof EntityPlayer) || (type.lockOnToLivings && entity instanceof EntityLivingBase))
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
		
		//Create a list for all bullet hits
		ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
		
		Vector3f origin = new Vector3f(posX, posY, posZ);
		Vector3f motion = new Vector3f(motionX, motionY, motionZ);
		
		float speed = motion.length();
		
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
					int snapshotToTry = pingOfShooter / 50;
					if(snapshotToTry >= data.snapshots.length)
						snapshotToTry = data.snapshots.length - 1;
					
					PlayerSnapshot snapshot = data.snapshots[snapshotToTry];
					if(snapshot == null)
						snapshot = data.snapshots[0];
					
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
					MovingObjectPosition mop = player.boundingBox.calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ));
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
				if(entity != this && entity != owner && !entity.isDead && (entity instanceof EntityLivingBase || entity instanceof EntityAAGun || entity instanceof EntityGrenade))
				{
					MovingObjectPosition mop = entity.boundingBox.calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ));
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
					DriveableHit driveableHit = (DriveableHit)bulletHit;
					penetratingPower = driveableHit.driveable.bulletHit(this, driveableHit, penetratingPower);
					if(FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * driveableHit.intersectTime, posY + motionY * driveableHit.intersectTime, posZ + motionZ * driveableHit.intersectTime), 1000, 0F, 0F, 1F));

				}
				else if(bulletHit instanceof PlayerBulletHit)
				{
					PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
					penetratingPower = playerHit.hitbox.hitByBullet(this, penetratingPower);
					if(FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * playerHit.intersectTime, posY + motionY * playerHit.intersectTime, posZ + motionZ * playerHit.intersectTime), 1000, 1F, 0F, 0F));
				}
				else if(bulletHit instanceof EntityHit)
				{
					EntityHit entityHit = (EntityHit)bulletHit;
					if(entityHit.entity.attackEntityFrom(getBulletDamage(false), damage * type.damageVsLiving) && entityHit.entity instanceof EntityLivingBase)
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
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * entityHit.intersectTime, posY + motionY * entityHit.intersectTime, posZ + motionZ * entityHit.intersectTime), 1000, 1F, 1F, 0F));
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
					
					//penetratingPower -= block.getBlockHardness(worldObj, zTile, zTile, zTile);
					setPosition(hit.hitVec.xCoord, hit.hitVec.yCoord, hit.hitVec.zCoord);
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
		float drag = 0.99F;
		float gravity = 0.02F;
		//If the bullet is in water, spawn particles and increase the drag
		if (isInWater())
		{
			for(int i = 0; i < 4; i++)
			{
				float bubbleMotion = 0.25F;
				worldObj.spawnParticle("bubble", posX - motionX * bubbleMotion, posY - motionY * bubbleMotion, posZ - motionZ * bubbleMotion, motionX, motionY, motionZ);
			}
			drag = 0.8F;
		}
		motionX *= drag;
		motionY *= drag;
		motionZ *= drag;
		motionY -= gravity * type.fallSpeed;
		
		//Apply homing action
		if(lockedOnTo != null)
		{
			double dX = lockedOnTo.posX - posX;
			double dY = lockedOnTo.posY - posY;
			double dZ = lockedOnTo.posZ - posZ;
			double dXYZ = Math.sqrt(dX * dX + dY * dY + dZ * dZ);	
			
			Vector3f relPosVec = new Vector3f(lockedOnTo.posX - posX, lockedOnTo.posY - posY, lockedOnTo.posZ - posZ);
			float angle = Math.abs(Vector3f.angle(motion, relPosVec));
			
			double lockOnPull = angle / 2F * type.lockOnForce;
			
			motionX += lockOnPull * dX / dXYZ;
			motionY += lockOnPull * dY / dXYZ;
			motionZ += lockOnPull * dZ / dXYZ;
		}
		
		
		//Apply motion
		posX += motionX;
		posY += motionY;
		posZ += motionZ;
		setPosition(posX, posY, posZ);
		
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
		for (int i = 0; i < 10; i++)
		{
			EntityFX particle = FlansModClient.getParticle(type.trailParticleType, worldObj, prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread);
			if(particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
				particle.renderDistanceWeight = 100D;
			//worldObj.spawnEntityInWorld(particle);
		}
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
		if (isDead)
			return;
		super.setDead();
		if(worldObj.isRemote)
			return;
		if(type.explosionRadius > 0)
		{
	        if(owner instanceof EntityPlayer)
	        	new FlansModExplosion(worldObj, this, (EntityPlayer)owner, firedFrom, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions);
	        else worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions);
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

	@Override
	public void writeEntityToNBT(NBTTagCompound tag)
	{
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
		
		if (ownerName != null && !ownerName.equals("null"))
			owner = FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().func_152612_a(ownerName);
	}

	@Override
	public float getShadowSize()
	{
		return type.hitBoxSize;
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
