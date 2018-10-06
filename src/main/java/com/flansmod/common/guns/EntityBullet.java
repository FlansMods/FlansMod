package com.flansmod.common.guns;

import java.util.List;
import java.util.Random;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.FlansModExplosion;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.raytracing.FlansModRaytracer;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BlockHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BulletHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.DriveableHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.EntityHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.PlayerBulletHit;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

import static com.flansmod.common.util.BlockUtil.destroyBlock;

public class EntityBullet extends EntityShootable implements IEntityAdditionalSpawnData
{
	private static int bulletLife = 600; // Kill bullets after 30 seconds
	public EntityLivingBase owner;
	private int ticksInAir;
	public BulletType type;
	/**
	 * What type of weapon did this come from? For death messages
	 */
	public InfoType firedFrom;
	/**
	 * The amount of damage the gun imparted upon the bullet. Multiplied by the
	 * bullet damage to get total damage
	 */
	public float damage;
	public boolean shotgun = false;
	/**
	 * If this is non-zero, then the player raytrace code will look back in time
	 * to when the player thinks their bullet should have hit
	 */
	public int pingOfShooter = 0;
	/**
	 * Avoids the fact that using the entity random to calculate spread
	 * direction always results in the same direction
	 */
	public static Random bulletRandom = new Random();
	/**
	 * For homing missiles
	 */
	public Entity lockedOnTo;
	
	public float penetratingPower;
	
	private float yOffset;
	
	@SideOnly(Side.CLIENT)
	private boolean playedFlybySound;
	
	public EntityBullet(World world)
	{
		super(world);
		ticksInAir = 0;
		setSize(0.5F, 0.5F);
	}
	
	/**
	 * Private partial constructor to avoid repeated code. All constructors go
	 * through this one
	 */
	private EntityBullet(World world, EntityLivingBase shooter, float gunDamage, BulletType bulletType,
						 InfoType shotFrom)
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
	
	/**
	 * Method called by ItemGun for creating bullets from a hand held weapon
	 */
	public EntityBullet(World world, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1,
						float speed, boolean shot, InfoType shotFrom)
	{
		this(world, new Vec3d(shooter.posX, shooter.posY + shooter.getEyeHeight(), shooter.posZ), shooter.rotationYaw,
				shooter.rotationPitch, shooter, spread, gunDamage, type1, speed, shotFrom);
		shotgun = shot;
	}
	
	/**
	 * More generalised bullet constructor
	 */
	public EntityBullet(World world, Vec3d origin, float yaw, float pitch, EntityLivingBase shooter, float spread,
						float gunDamage, BulletType type1, float speed, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		setLocationAndAngles(origin.x, origin.y, origin.z, yaw, pitch);
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = -MathHelper.sin((rotationYaw / 180F) * 3.14159265F)
				* MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
		motionZ = MathHelper.cos((rotationYaw / 180F) * 3.14159265F)
				* MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
		motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
		setArrowHeading(motionX, motionY, motionZ, spread / 2F, speed);
	}
	
	/**  */
	public EntityBullet(World world, Vector3f origin, Vector3f direction, EntityLivingBase shooter, float spread,
						float gunDamage, BulletType type1, float speed, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		damage = gunDamage;
		setPosition(origin.x, origin.y, origin.z);
		motionX = direction.x;
		motionY = direction.y;
		motionZ = direction.z;
		setArrowHeading(motionX, motionY, motionZ, spread, speed);
	}
	
	/**
	 * Bomb constructor. Inherits the motion and rotation of the plane
	 */
	public EntityBullet(World world, Vec3d origin, float yaw, float pitch, double motX, double motY, double motZ,
						EntityLivingBase shooter, float gunDamage, BulletType type1, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		setLocationAndAngles(origin.x, origin.y, origin.z, yaw, pitch);
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
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox()
	{
		return getEntityBoundingBox();
	}
	
	//@Override
	//public AxisAlignedBB getCollisionBox(Entity entity) 
	//{
	//	return null;
	//}
	
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
		if(type.lockOnToPlanes || type.lockOnToVehicles || type.lockOnToMechas || type.lockOnToLivings
				|| type.lockOnToPlayers)
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
	
	/**
	 * Static method so we can handle this without creating a bullet entity. Just pass in a null bullet
	 */
	public static boolean OnHit(World world, Vector3f origin, Vector3f hit, Entity shooter, InfoType shotFrom, ShootableType shootableType, EntityBullet bullet, float damage, BulletHit bulletHit)
	{
		if(!(shootableType instanceof BulletType))
		{
			FlansMod.log.warn("Tried to fire grenade instantly");
			return true;
		}
		if(world == null || origin == null || hit == null || shooter == null || shotFrom == null || shootableType == null)
		{
			//FlansMod.log("Something was null");
			return true;
		}
		
		BulletType bulletType = (BulletType)shootableType;
		
		float penetratingPower = bullet == null ? bulletType.penetratingPower : bullet.penetratingPower;
		
		DamageSource source = bullet == null ? GetBulletDamage(shotFrom, bulletType, shooter, false) : bullet.getBulletDamage(false);
		
		if(bulletHit instanceof DriveableHit)
		{
			DriveableHit driveableHit = (DriveableHit)bulletHit;
			penetratingPower = driveableHit.driveable.bulletHit(bulletType, damage, driveableHit, penetratingPower);
			if(FlansMod.DEBUG && world.isRemote)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 0F, 0F, 1F));
			
		}
		else if(bulletHit instanceof PlayerBulletHit)
		{
			PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
			penetratingPower = playerHit.hitbox.hitByBullet(source, shooter, shotFrom, bulletType, damage, penetratingPower);
			if(FlansMod.DEBUG && world.isRemote)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 1F, 0F, 0F));
		}
		else if(bulletHit instanceof EntityHit)
		{
			EntityHit entityHit = (EntityHit)bulletHit;
			
			if(entityHit.entity != null)
			{
				if(entityHit.entity.attackEntityFrom(source, damage * bulletType.damageVsLiving) && entityHit.entity instanceof EntityLivingBase)
				{
					EntityLivingBase living = (EntityLivingBase)entityHit.entity;
					for(PotionEffect effect : bulletType.hitEffects)
					{
						living.addPotionEffect(new PotionEffect(effect));
					}
					//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
					living.hurtResistantTime = 0;
				}
				if(bulletType.setEntitiesOnFire)
					entityHit.entity.setFire(20);
				penetratingPower -= 1F;
				if(FlansMod.DEBUG && world.isRemote)
					world.spawnEntity(new EntityDebugDot(world, hit, 1000, 1F, 1F, 0F));
			}
		}
		else if(bulletHit instanceof BlockHit)
		{
			BlockHit blockHit = (BlockHit)bulletHit;
			RayTraceResult raytraceResult = blockHit.raytraceResult;
			//If the hit wasn't an entity hit, then it must've been a block hit
			BlockPos pos = raytraceResult.getBlockPos();
			if(FlansMod.DEBUG && world.isRemote)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 0F, 1F, 0F));
			
			Block block = world.getBlockState(pos).getBlock();
			Material mat = world.getBlockState(pos).getMaterial();
			//If the bullet breaks glass, and can do so according to FlansMod, do so.
			if(bulletType.breaksGlass && mat == Material.GLASS && !world.isRemote)
			{
				if(TeamsManager.canBreakGlass)
				{
					WorldServer worldServer = (WorldServer)world;
					destroyBlock(worldServer, pos, shooter, false);
				}
			}
			
			//penetratingPower -= block.getBlockHardness(world, zTile, zTile, zTile);
			if(bullet != null)
				bullet.setPosition(blockHit.raytraceResult.hitVec.x, blockHit.raytraceResult.hitVec.y, blockHit.raytraceResult.hitVec.z);
			//play sound when bullet hits block
			if(!world.isRemote && shooter != null && bulletType.hitSound != null)
				PacketPlaySound.sendSoundPacket(hit.x, hit.y, hit.z, bulletType.hitSoundRange, shooter.dimension, bulletType.hitSound, true);
			if(bullet != null) bullet.penetratingPower = penetratingPower;
			return true;
		}
		if(penetratingPower <= 0F || (bulletType.explodeOnImpact && (bullet == null || bullet.ticksInAir > 1)))
		{
			if(bullet != null)
			{
				bullet.setPosition(hit.x, hit.y, hit.z);
				bullet.penetratingPower = penetratingPower;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if(FlansMod.DEBUG && world.isRemote)
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
		
		if(world.isRemote)
			onUpdateClient();
		
		Vector3f origin = new Vector3f(posX, posY, posZ);
		Vector3f motion = new Vector3f(motionX, motionY, motionZ);
		
		if(!world.isRemote)
		{
			List<BulletHit> hits = FlansModRaytracer.Raytrace(world, owner, ticksInAir > 20, this, origin, motion,
					pingOfShooter);
			
			// We hit something
			if(!hits.isEmpty())
			{
				for(BulletHit bulletHit : hits)
				{
					Vector3f hitPos = new Vector3f(origin.x + motion.x * bulletHit.intersectTime,
							origin.y + motion.y * bulletHit.intersectTime,
							origin.z + motion.z * bulletHit.intersectTime);
					
					if(EntityBullet.OnHit(world, origin, hitPos, owner, firedFrom, type, this, damage, bulletHit))
					{
						setDead();
						break;
					}
				}
			}
		}
		
		// Movement dampening variables
		float drag = 0.99F;
		float gravity = 0.02F;
		// If the bullet is in water, spawn particles and increase the drag
		if(isInWater())
		{
			for(int i = 0; i < 4; i++)
			{
				float bubbleMotion = 0.25F;
				world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, posX - motionX * bubbleMotion,
						posY - motionY * bubbleMotion, posZ - motionZ * bubbleMotion, motionX, motionY, motionZ);
			}
			drag = 0.8F;
		}
		motionX *= drag;
		motionY *= drag;
		motionZ *= drag;
		motionY -= gravity * type.fallSpeed;
		
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
		
		// Apply motion
		posX += motionX;
		posY += motionY;
		posZ += motionZ;
		setPosition(posX, posY, posZ);
		
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
		
		// Particles
		if(type.trailParticles && world.isRemote && ticksInAir > 1)
		{
			spawnParticles();
		}
		
		// Temporary fire glitch fix
		if(world.isRemote)
			extinguish();
	}
	
	@SideOnly(Side.CLIENT)
	private void onUpdateClient()
	{
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
			Particle particle = FlansModClient.getParticle(type.trailParticleType, world,
					prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread,
					prevPosZ + dZ * i + rand.nextGaussian() * spread);
			// TODO: [1.12] once again, render distance
			
			//if (particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
			//	particle.renderDistanceWeight = 100D;
			// world.spawnEntity(particle);
		}
	}
	
	public DamageSource getBulletDamage(boolean headshot)
	{
		if(owner instanceof EntityPlayer)
			return (new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)owner, firedFrom, headshot))
					.setProjectile();
		else
			return (new EntityDamageSourceIndirect(type.shortName, this, owner)).setProjectile();
	}
	
	public static DamageSource GetBulletDamage(InfoType firedFrom, BulletType type, Entity owner, boolean headshot)
	{
		if(owner instanceof EntityPlayer)
			return (new EntityDamageSourceGun(type.shortName, owner, (EntityPlayer)owner, firedFrom, headshot))
					.setProjectile();
		else
			return (new EntityDamageSourceIndirect(type.shortName, owner, owner)).setProjectile();
	}
	
	private boolean isPartOfOwner(Entity entity)
	{
		if(owner == null)
			return false;
		if(entity == owner || entity == owner.getControllingPassenger() || entity == owner.getRidingEntity())
			return true;
		if(owner instanceof EntityPlayer)
		{
			if(PlayerHandler.getPlayerData((EntityPlayer)owner,
					world.isRemote ? Side.CLIENT : Side.SERVER) == null)
				return false;
			EntityMG mg = PlayerHandler.getPlayerData((EntityPlayer)owner,
					world.isRemote ? Side.CLIENT : Side.SERVER).mountingGun;
			if(mg != null && mg == entity)
			{
				return true;
			}
		}
		return owner.getRidingEntity() instanceof EntitySeat && (((EntitySeat)owner.getRidingEntity()).driveable == null
				|| ((EntitySeat)owner.getRidingEntity()).driveable.isPartOfThis(entity));
	}
	
	@Override
	public void setDead()
	{
		if(isDead)
			return;
		super.setDead();
		
		OnDetonate(world, new Vector3f(posX, posY, posZ), owner, this, firedFrom, type);
	}
	
	public static void OnDetonate(World world, Vector3f detonatePos, EntityLivingBase owner, EntityBullet bullet, InfoType shotFrom, BulletType bulletType)
	{
		if(world.isRemote)
			return;
		if(bulletType.explosionRadius > 0)
		{
			new FlansModExplosion(world, bullet, owner, bulletType,
					detonatePos.x, detonatePos.y, detonatePos.z, bulletType.explosionRadius, bulletType.fireRadius > 0, bulletType.flak > 0, bulletType.explosionBreaksBlocks);
		}
		if(bulletType.fireRadius > 0)
		{
			for(float i = -bulletType.fireRadius; i < bulletType.fireRadius; i++)
			{
				for(float k = -bulletType.fireRadius; k < bulletType.fireRadius; k++)
				{
					for(int j = -1; j < 1; j++)
					{
						if(world.getBlockState(new BlockPos((int)(detonatePos.x + i), (int)(detonatePos.y + j), (int)(detonatePos.z + k))).getMaterial() == Material.AIR)
						{
							world.setBlockState(new BlockPos((int)(detonatePos.x + i), (int)(detonatePos.y + j), (int)(detonatePos.z + k)), Blocks.FIRE.getDefaultState(), 2);
						}
					}
				}
			}
		}
		// Send flak packet
		if(bulletType.flak > 0 && owner != null)
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(detonatePos.x, detonatePos.y, detonatePos.z, bulletType.flak, bulletType.flakParticles), detonatePos.x, detonatePos.y, detonatePos.z, 200, owner.dimension);
		}
		// Drop item on hitting if bullet requires it
		if(bulletType.dropItemOnHit != null)
		{
			String itemName = bulletType.dropItemOnHit;
			int damage = 0;
			if(itemName.contains("."))
			{
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
			
			if(dropStack != null && !dropStack.isEmpty())
			{
				EntityItem entityitem = new EntityItem(world, detonatePos.x, detonatePos.y, detonatePos.z, dropStack);
				entityitem.setDefaultPickupDelay();
				world.spawnEntity(entityitem);
			}
		}
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound tag)
	{
		tag.setString("type", type.shortName);
		if(owner == null)
			tag.setString("owner", "null");
		else
			tag.setString("owner", owner.getName());
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound tag)
	{
		
		
		String typeString = tag.getString("type");
		String ownerName = tag.getString("owner");
		
		if(typeString != null)
			type = BulletType.getBullet(typeString);
		
		if(ownerName != null && !ownerName.equals("null"))
			owner = FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayerByUsername(ownerName);
	}
	
	public int getBrightnessForRender(float par1)
	{
		if(type.hasLight)
		{
			return 15728880;
		}
		else
		{
			int i = MathHelper.floor(this.posX);
			int j = MathHelper.floor(this.posZ);
			
			if(!world.isAirBlock(new BlockPos(i, 0, j)))
			{
				double d0 = (getCollisionBoundingBox().maxY - getCollisionBoundingBox().minY) * 0.66D;
				int k = MathHelper.floor(this.posY - (double)this.yOffset + d0);
				return this.world.getLightFromNeighborsFor(EnumSkyBlock.SKY, new BlockPos(i, k, j));
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
		if(owner == null)
			ByteBufUtils.writeUTF8String(data, "null");
		else
			ByteBufUtils.writeUTF8String(data, owner.getName());
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
				lockedOnTo = world.getEntityByID(lockedOnToID);
			type = BulletType.getBullet(ByteBufUtils.readUTF8String(data));
			penetratingPower = type.penetratingPower;
			String name = ByteBufUtils.readUTF8String(data);
			for(Object obj : world.loadedEntityList)
			{
				if(obj != null && ((Entity)obj).getName().equals(name))
				{
					owner = (EntityLivingBase)obj;
					break;
				}
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
	
	
}
