package co.uk.flansmods.common.guns;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumGameType;
import net.minecraft.world.World;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.network.PacketFlak;
import co.uk.flansmods.common.network.PacketPlaySound;
import co.uk.flansmods.common.teams.TeamsManager;
import co.uk.flansmods.common.vector.Vector3f;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;

public class EntityBullet extends Entity implements IEntityAdditionalSpawnData
{
	private static int bulletLife = 600; //Kill bullets after 30 seconds
	public Entity owner;
	private int ticksInAir;
	public BulletType type;
	public InfoType firedFrom;
	public int damage;
	public boolean shotgun = false;

	public EntityBullet(World world)
	{
		super(world);
		ticksInAir = 0;
		setSize(0.5F, 0.5F);
	}
	
	/** Private partial constructor to avoid repeated code */
	private EntityBullet(World world, EntityLivingBase shooter, int gunDamage, BulletType bulletType, InfoType shotFrom)
	{
		this(world);
		owner = shooter;
		type = bulletType;
		firedFrom = shotFrom;
		damage = gunDamage;
	}

	/** Method called by ItemGun for creating bullets from a hand held weapon */
	public EntityBullet(World world, EntityLivingBase shooter, float spread, int gunDamage, BulletType type1, float speed, boolean shot, InfoType shotFrom)
	{
		this(world, Vec3.createVectorHelper(shooter.posX, shooter.posY + shooter.getEyeHeight(), shooter.posZ), shooter.rotationYaw, shooter.rotationPitch, shooter, spread, gunDamage, type1, speed, shotFrom);
		shotgun = shot;
	}

	/** Machinegun / AAGun bullet constructor */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, int gunDamage, BulletType type1, InfoType shotFrom)
	{
		this(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, 3.0F, shotFrom);
	}

	/** More generalised bullet constructor */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, int gunDamage, BulletType type1, float speed, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		damage = gunDamage;
		setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
		posX -= MathHelper.cos((rotationYaw / 180F) * 3.141593F) * 0.16F;
		posY -= 0.10000000149011612D;
		posZ -= MathHelper.sin((rotationYaw / 180F) * 3.141593F) * 0.16F;
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = -MathHelper.sin((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		motionZ = MathHelper.cos((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
		setArrowHeading(motionX, motionY, motionZ, spread, speed);
	}
	
	/**  */
	public EntityBullet(World world, Vector3f origin, Vector3f direction, EntityLivingBase shooter, float spread, int gunDamage, BulletType type1, float speed, InfoType shotFrom)
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
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, double motX, double motY, double motZ, EntityLivingBase shooter, int gunDamage, BulletType type1, InfoType shotFrom)
	{
		super(world);
		type = type1;
		firedFrom = shotFrom;
		ticksInAir = 0;
		owner = shooter;
		damage = gunDamage;
		setSize(0.5F, 0.5F);
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
		d += rand.nextGaussian() * 0.005D * (double) spread;
		d1 += rand.nextGaussian() * 0.005D * (double) spread;
		d2 += rand.nextGaussian() * 0.005D * (double) spread;
		d *= speed;
		d1 *= speed;
		d2 *= speed;
		motionX = d;
		motionY = d1;
		motionZ = d2;
		float f3 = MathHelper.sqrt_double(d * d + d2 * d2);
		prevRotationYaw = rotationYaw = (float) ((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
		prevRotationPitch = rotationPitch = (float) ((Math.atan2(d1, f3) * 180D) / 3.1415927410125732D);
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
			prevRotationPitch = rotationPitch;
			prevRotationYaw = rotationYaw;
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
		
		//Iterate over all EntityDriveables
		for(int i = 0; i < worldObj.loadedEntityList.size(); i++)
		{
			Object obj = worldObj.loadedEntityList.get(i);
			if(obj instanceof EntityDriveable)
			{
				EntityDriveable driveable = (EntityDriveable)obj;
				//If this bullet is within the driveable's detection range
				if(getDistanceToEntity(driveable) <= driveable.getDriveableType().bulletDetectionRadius)
				{
					//Raytrace the bullet and if it hits, kill the bullet
					if(driveable.attackFromBullet(this, new Vector3f((float)posX, (float)posY, (float)posZ), new Vector3f((float)motionX, (float)motionY, (float)motionZ)))
					{
						if(!type.penetratesEntities)
							setDead();
					}
				}
			}
		}
		
		//Ray trace the bullet by comparing its next position to its current position
		Vec3 posVec = Vec3.createVectorHelper(posX, posY, posZ);
		Vec3 nextPosVec = Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ);
		MovingObjectPosition hit = worldObj.rayTraceBlocks_do_do(posVec, nextPosVec, false, true);
		
		//Reset the position vectors since the ray tracer messes them up
		posVec = Vec3.createVectorHelper(posX, posY, posZ);
		nextPosVec = Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ);
		
		//If there is something in the way of the bullet's motion, put the bullet at that position next tick
		if(hit != null && !(hit.entityHit == null ? type.penetratesBlocks : type.penetratesEntities))
		{
			nextPosVec = Vec3.createVectorHelper(hit.hitVec.xCoord, hit.hitVec.yCoord, hit.hitVec.zCoord);
		}
		//If we hit something
		if (!isDead && hit != null)
		{
			//If the bullet should explode on impact and the hit is not the shooter, explode!
			if (type.explodeOnImpact && ticksInAir > 5 && (hit.entityHit == null || !isPartOfOwner(hit.entityHit)))
				setDead();
			else
			{
				//If we hit a valid entity
				if(hit.entityHit != null && !isPartOfOwner(hit.entityHit))
				{
					//Calculate the hit damage
					int hitDamage = damage * type.damage;
					//Create a damage source object
					DamageSource damagesource = owner == null ? DamageSource.generic : getBulletDamage();

					//When the damage is 0 (such as with Nerf guns) the entityHurt Forge hook is not called, so this hacky thing is here
					if(hitDamage == 0 && hit.entityHit instanceof EntityPlayerMP && TeamsManager.getInstance().currentGametype != null)
						TeamsManager.getInstance().currentGametype.playerAttacked((EntityPlayerMP)hit.entityHit, damagesource);
					
					//Attack the entity!
					if(hit.entityHit.attackEntityFrom(damagesource, hitDamage))
					{
						//If the attack was allowed and the entity is alive, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
						if (hit.entityHit instanceof EntityLivingBase)
						{
							((EntityLivingBase) hit.entityHit).arrowHitTimer++;
							((EntityLivingBase) hit.entityHit).hurtResistantTime = ((EntityLivingBase) hit.entityHit).maxHurtResistantTime / 2;
						}
						//Yuck.
						//PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
					}
					//Unless the bullet penetrates, kill it
					if(!type.penetratesEntities)
					{
						setPosition(hit.entityHit.posX, hit.entityHit.posY, hit.entityHit.posZ);
						setDead();
					}
				} 
				//If the hit wasn't an entity hit, then it must've been a block hit
				if(hit.entityHit == null)
				{
					int xTile = hit.blockX;
					int yTile = hit.blockY;
					int zTile = hit.blockZ;
					int blockID = worldObj.getBlockId(xTile, yTile, zTile);
					//If the bullet breaks glass, and can do so according to FlansMod, do so.
					if(type.breaksGlass && FlansMod.canBreakGlass && (blockID == Block.glass.blockID || blockID == Block.thinGlass.blockID || blockID == Block.glowStone.blockID))
					{
						worldObj.setBlock(xTile, yTile, zTile, 0, 0, 5);
						PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, Block.glass.stepSound.getBreakSound(), true));
					}
					if(!type.penetratesBlocks)
					{
						setPosition(hit.hitVec.xCoord, hit.hitVec.yCoord, hit.hitVec.zCoord);
						setDead();
					}
				}
			}
		}
		//If the bullet was not stopped by a block
		if(!isDead)
		{
			//Iterate over entities close to the bullet to see if any of them have been hit and hit them
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.addCoord(motionX, motionY, motionZ).expand((double) type.hitBoxSize, (double) type.hitBoxSize, (double) type.hitBoxSize));
			for (int l = 0; l < list.size(); l++)
			{
				Entity checkEntity = (Entity) list.get(l);
				//Stop the bullet hitting stuff that can't be collided with or the person shooting immediately after firing it
				if (!checkEntity.canBeCollidedWith() || isPartOfOwner(checkEntity) && ticksInAir < 20)
				{
					continue;
				}
				//Calculate the hit damage
				int hitDamage = damage * type.damage;
				//Create a damage source object
				DamageSource damagesource = owner == null ? DamageSource.generic : getBulletDamage();
	
				//When the damage is 0 (such as with Nerf guns) the entityHurt Forge hook is not called, so this hacky thing is here
				if(hitDamage == 0 && checkEntity instanceof EntityPlayerMP && TeamsManager.getInstance().currentGametype != null)
					TeamsManager.getInstance().currentGametype.playerAttacked((EntityPlayerMP)checkEntity, damagesource);
				
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
				if(!type.penetratesEntities)
				{
					setPosition(checkEntity.posX, checkEntity.posY, checkEntity.posZ);
					setDead();
					break;
				}
			}
		}
	
		//Apply motion
		posX += motionX;
		posY += motionY;
		posZ += motionZ;
		
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
		
		//Movement dampening variables
		float drag = 0.99F;
		float gravity = 0.02F;
		//If the bullet is in water, spawn particles and increase the drag
		if (isInWater())
		{
			for(int i = 0; i < 4; i++)
			{
				float bubbleMotion = 0.25F;
				worldObj.spawnParticle("bubble", posX - motionX * (double) bubbleMotion, posY - motionY * (double) bubbleMotion, posZ - motionZ * (double) bubbleMotion, motionX, motionY, motionZ);
			}
			drag = 0.8F;
		}
		motionX *= drag;
		motionY *= drag;
		motionZ *= drag;
		motionY -= gravity * type.fallSpeed;
		setPosition(posX, posY, posZ);
		
		//Particles 
		if (type.smokeTrail)
		{
			double dX = (posX - prevPosX) / 10;
			double dY = (posY - prevPosY) / 10;
			double dZ = (posZ - prevPosZ) / 10;
			for (int i = 0; i < 10; i++)
			{
				worldObj.spawnParticle(type.trailParticles, prevPosX + dX * (double) i, prevPosY + dY * (double) i, prevPosZ + dZ * (double) i, 0, 0, 0);
			}
		}
	}

	private DamageSource getBulletDamage()
	{
		if(owner instanceof EntityPlayer)
			return (new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)owner, firedFrom)).setProjectile();
		else return (new EntityDamageSourceIndirect(type.shortName, this, owner)).setProjectile();
	}

	private boolean isPartOfOwner(Entity entity)
	{
		if(owner == null)
			return false;
		if (entity == owner || entity == owner.riddenByEntity || entity == owner.ridingEntity)
			return true;
		if (owner instanceof EntityPlayer)
		{
			if(FlansModPlayerHandler.getPlayerData((EntityPlayer)owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER) == null)
				return false;
			EntityMG mg = FlansModPlayerHandler.getPlayerData((EntityPlayer)owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER).mountingGun;
			if (mg != null && mg == entity)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public void setDead()
	{
		if (isDead || worldObj.isRemote)
			return;
		super.setDead();
		if (type.explosion > 0)
		{
			worldObj.createExplosion(owner, posX, posY, posZ, type.explosion, FlansMod.explosions);
		}
		if (type.fire > 0)
		{
			for (int i = (int) posX - type.fire; i < (int) posX + type.fire; i++)
			{
				for (int k = (int) posZ - type.fire; k < (int) posZ + type.fire; k++)
				{
					for (int j = (int) posY - 1; j < (int) posY + 1; j++)
					{
						if (worldObj.getBlockMaterial(i, j, k) == Material.air)
						{
							worldObj.setBlock(i, j, k, Block.fire.blockID, 0, 5);
						}
					}
				}
			}
		}
		//Send flak packet
		if(type.flak > 0)
			PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 200, dimension, PacketFlak.buildFlakPacket(posX, posY, posZ, type.flak, type.flakParticles));
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
			tag.setString("owner", owner.getEntityName());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound tag)
	{
		String typeString = tag.getString("type");
		String ownerName = tag.getString("owner");
		
		if (typeString != null)
			type = BulletType.getBullet(typeString);
		
		if (ownerName != null && !ownerName.equals("null"))
			owner = FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().getPlayerForUsername(ownerName);
	}

	@Override
	public float getShadowSize()
	{
		return type.hitBoxSize;
	}
	
	@Override
	public void writeSpawnData(ByteArrayDataOutput data) {
		// TODO Auto-generated method stub
		data.writeUTF(type.shortName);
		
		if (owner == null)
			data.writeUTF("null");
		else
			data.writeUTF(owner.getEntityName());
	}

	@Override
	public void readSpawnData(ByteArrayDataInput data) {
		// TODO Auto-generated method stub
		try
		{
			type = BulletType.getBullet(data.readUTF());
			String name = data.readUTF();
			for(Object obj : worldObj.playerEntities)
			{
				if(((EntityPlayer)obj).username.equals(name))
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
}
