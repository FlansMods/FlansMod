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
	private static final DataParameter<String> BULLET_TYPE = EntityDataManager.createKey(EntityBullet.class, DataSerializers.STRING);
	
	private static int bulletLife = 600; // Kill bullets after 30 seconds
	public int ticksInAir;
	
	private FiredShot shot;
	/**
	 * For homing missiles
	 */
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

	public EntityBullet(World world)
	{
		super(world);
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
				if((type.lockOnToMechas && entity instanceof EntityMecha)
						|| (type.lockOnToVehicles && entity instanceof EntityVehicle)
						|| (type.lockOnToPlanes && entity instanceof EntityPlane)
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
				double dX = lockedOnTo.posX - posX;
				double dY = lockedOnTo.posY - posY;
				double dZ = lockedOnTo.posZ - posZ;
				double dXYZ = dX * dX + dY * dY + dZ * dZ;
				
				Vector3f relPosVec = new Vector3f(dX, dY, dZ);
				float angle = Math.abs(Vector3f.angle(motion, relPosVec));
				
				double lockOnPull = (angle) * type.lockOnForce;
				
				lockOnPull = lockOnPull * lockOnPull;
				
				motionX *= 0.95f;
				motionY *= 0.95f;
				motionZ *= 0.95f;
				
				motionX += lockOnPull * dX / dXYZ;
				motionY += lockOnPull * dY / dXYZ;
				motionZ += lockOnPull * dZ / dXYZ;
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
		for(int i = 0; i < 10; i++)
		{
			Particle particle = FlansModClient.getParticle(shot.getBulletType().trailParticleType, world,
					prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread,
					prevPosZ + dZ * i + rand.nextGaussian() * spread);
			// TODO: [1.12] once again, render distance
			
			//if (particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
			//	particle.renderDistanceWeight = 100D;
			// world.spawnEntity(particle);
		}
	}
	
	@Override
	public void setDead()
	{
		if(isDead)
			return;
		super.setDead();
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
	public void writeSpawnData(ByteBuf data)
	{
		data.writeDouble(motionX);
		data.writeDouble(motionY);
		data.writeDouble(motionZ);
	}
	
	@Override
	public void readSpawnData(ByteBuf data)
	{
		try
		{
			motionX = data.readDouble();
			motionY = data.readDouble();
			motionZ = data.readDouble();
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
