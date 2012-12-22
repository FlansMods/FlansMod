package co.uk.flansmods.common;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
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
import co.uk.flansmods.common.network.PacketFlak;
import co.uk.flansmods.common.network.PacketPlaySound;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;

public class EntityBullet extends Entity implements IEntityAdditionalSpawnData
{
	public Entity owner;
	private int ticksInAir;
	public BulletType type;
	public int damage;
	public boolean shotgun = false;

	public EntityBullet(World world)
	{
		super(world);
		ticksInAir = 0;
		setSize(0.5F, 0.5F);
	}

	// Standard handheld gun bullet creation method.
	public EntityBullet(World world, EntityLiving shooter, float spread, int gunDamage, BulletType type1)
	{
		this(world, shooter, spread, gunDamage, type1, 3.0F, false);
	}

	// Custom speed handheld gun bullet creation method
	public EntityBullet(World world, EntityLiving shooter, float spread, int gunDamage, BulletType type1, float speed, boolean shot)
	{
		super(world);
		type = type1;
		ticksInAir = 0;
		owner = shooter;
		damage = gunDamage;
		setSize(0.5F, 0.5F);
		setLocationAndAngles(shooter.posX, shooter.posY + (double) shooter.getEyeHeight(), shooter.posZ, shooter.rotationYaw, shooter.rotationPitch);
		posX -= MathHelper.cos((rotationYaw / 180F) * 3.141593F) * 0.16F;
		posY -= 0.10000000149011612D;
		posZ -= MathHelper.sin((rotationYaw / 180F) * 3.141593F) * 0.16F;
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = -MathHelper.sin((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		motionZ = MathHelper.cos((rotationYaw / 180F) * 3.141593F) * MathHelper.cos((rotationPitch / 180F) * 3.141593F);
		motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
		shotgun = shot;
		setArrowHeading(motionX, motionY, motionZ, spread, speed);
	}

	// Machinegun bullet constructor
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLiving shooter, float spread, int gunDamage, BulletType type1)
	{
		this(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, 3.0F);
	}

	// Custom bullet speed constructor
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLiving shooter, float spread, int gunDamage, BulletType type1, float speed)
	{
		super(world);
		type = type1;
		ticksInAir = 0;
		owner = shooter;
		damage = gunDamage;
		setSize(0.5F, 0.5F);
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

	// Bomb constructor
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, double motX, double motY, double motZ, EntityLiving shooter, int gunDamage, BulletType type1)
	{
		super(world);
		type = type1;
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
		d += rand.nextGaussian() * 0.0074999998323619366D * (double) spread;
		d1 += rand.nextGaussian() * 0.0074999998323619366D * (double) spread;
		d2 += rand.nextGaussian() * 0.0074999998323619366D * (double) spread;
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
		if (prevRotationPitch == 0.0F && prevRotationYaw == 0.0F)
		{
			float f = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
			prevRotationYaw = rotationYaw = (float) ((Math.atan2(motionX, motionZ) * 180D) / 3.1415927410125732D);
			prevRotationPitch = rotationPitch = (float) ((Math.atan2(motionY, f) * 180D) / 3.1415927410125732D);
		}
		int xTile = MathHelper.floor_double(posX);
		int yTile = MathHelper.floor_double(posY);
		int zTile = MathHelper.floor_double(posZ);
		int blockID = worldObj.getBlockId(xTile, yTile, zTile);
		if (blockID > 0)
		{
			Block.blocksList[blockID].setBlockBoundsBasedOnState(worldObj, xTile, yTile, zTile);
			AxisAlignedBB axisalignedbb = Block.blocksList[blockID].getCollisionBoundingBoxFromPool(worldObj, xTile, yTile, zTile);
			if (axisalignedbb != null && axisalignedbb.isVecInside(Vec3.createVectorHelper(posX, posY, posZ)))
			{
				if (type.breaksGlass && (blockID == Block.glass.blockID || blockID == Block.thinGlass.blockID || blockID == Block.glowStone.blockID))
				{
					worldObj.setBlockWithNotify(xTile, yTile, zTile, 0);
					PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, Block.glass.stepSound.getBreakSound(), true));
				}
				if (!type.penetrates)
					setDead();
			}
		}
		ticksInAir++;
		if (ticksInAir > type.fuse && type.fuse > 0 && !isDead)
		{
			setDead();
		}
		Vec3 vec3d = Vec3.createVectorHelper(posX, posY, posZ);
		Vec3 vec3d1 = Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ);
		MovingObjectPosition movingobjectposition = worldObj.rayTraceBlocks_do_do(vec3d, vec3d1, false, true);
		vec3d = Vec3.createVectorHelper(posX, posY, posZ);
		vec3d1 = Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ);
		if (movingobjectposition != null)
		{
			vec3d1 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
		}
		Entity entity = null;
		List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.addCoord(motionX, motionY, motionZ).expand((double) type.hitBoxSize, (double) type.hitBoxSize, (double) type.hitBoxSize));
		double d = 0.0D;
		for (int l = 0; l < list.size(); l++)
		{
			Entity entity1 = (Entity) list.get(l);
			if (!entity1.canBeCollidedWith() || isPartOfOwner(entity1) && ticksInAir < 20)
			{
				continue;
			}
			float f5 = 0.3F;
			AxisAlignedBB axisalignedbb1 = entity1.boundingBox.expand(f5, f5, f5);
			MovingObjectPosition movingobjectposition1 = axisalignedbb1.calculateIntercept(vec3d, vec3d1);
			if (movingobjectposition1 == null)
			{
				continue;
			}
			double d1 = vec3d.distanceTo(movingobjectposition1.hitVec);
			if (d1 < d || d == 0.0D)
			{
				entity = entity1;
				d = d1;
			}
		}

		if (entity != null && !(entity instanceof EntityBullet))
		{
			movingobjectposition = new MovingObjectPosition(entity);
		}
		if (movingobjectposition != null)
		{
			if (type.explodeOnImpact && ticksInAir > 2)
			{
				if (movingobjectposition.entityHit == null || !isPartOfOwner(movingobjectposition.entityHit))
					setDead();
			} else
			{
				if (movingobjectposition.entityHit != null && !isPartOfOwner(movingobjectposition.entityHit))
				{
					// float f1 = MathHelper.sqrt_double(motionX * motionX +
					// motionY * motionY + motionZ * motionZ);
					int j1 = 1; // = (int)Math.ceil((double)f1 * 2D);
					j1 *= damage;
					j1 *= type.damage;
					DamageSource damagesource = null;
					if (owner == null)
					{
						damagesource = DamageSource.generic;
					} else
					{
						damagesource = getBulletDamage();
					}
					if (movingobjectposition.entityHit.attackEntityFrom(damagesource, j1))
					{
						if (movingobjectposition.entityHit instanceof EntityLiving)
						{
							((EntityLiving) movingobjectposition.entityHit).arrowHitTimer++;
							if (shotgun)
								((EntityLiving) movingobjectposition.entityHit).hurtResistantTime = ((EntityLiving) movingobjectposition.entityHit).maxHurtResistantTime / 2;
						}
						PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
					}
					if (type.penetrates)
					{
						motionX *= 0.8D;
						motionY *= 0.8D;
						motionZ *= 0.8D;
					} else
					{
						setPosition(movingobjectposition.entityHit.posX, movingobjectposition.entityHit.posY, movingobjectposition.entityHit.posZ);
						setDead();
					}
				} else
				{
					xTile = movingobjectposition.blockX;
					yTile = movingobjectposition.blockY;
					zTile = movingobjectposition.blockZ;
					blockID = worldObj.getBlockId(xTile, yTile, zTile);
					boolean killBullet = true;
					if (type.breaksGlass && (blockID == Block.glass.blockID || blockID == Block.thinGlass.blockID || blockID == Block.glowStone.blockID))
					{
						worldObj.setBlockWithNotify(xTile, yTile, zTile, 0);
						PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, Block.glass.stepSound.getBreakSound(), true));
						if (type.penetrates)
							killBullet = false;
					}
					if (killBullet)
					{
						setPosition(xTile, yTile, zTile);
						setDead();
					}
				}
			}
		}
		posX += motionX;
		posY += motionY;
		posZ += motionZ;
		float f3 = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
		rotationYaw = (float) ((Math.atan2(motionX, motionZ) * 180D) / 3.1415927410125732D);
		for (rotationPitch = (float) ((Math.atan2(motionY, f3) * 180D) / 3.1415927410125732D); rotationPitch - prevRotationPitch < -180F; prevRotationPitch -= 360F)
		{
		}
		for (; rotationPitch - prevRotationPitch >= 180F; prevRotationPitch += 360F)
		{
		}
		for (; rotationYaw - prevRotationYaw < -180F; prevRotationYaw -= 360F)
		{
		}
		for (; rotationYaw - prevRotationYaw >= 180F; prevRotationYaw += 360F)
		{
		}
		rotationPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * 0.2F;
		rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw) * 0.2F;
		float f4 = 0.99F;
		float f6 = 0.02F;
		if (isInWater())
		{
			for (int k1 = 0; k1 < 4; k1++)
			{
				float f7 = 0.25F;
				worldObj.spawnParticle("bubble", posX - motionX * (double) f7, posY - motionY * (double) f7, posZ - motionZ * (double) f7, motionX, motionY, motionZ);
			}

			f4 = 0.8F;
		}
		motionX *= f4;
		motionY *= f4;
		motionZ *= f4;
		motionY -= f6 * type.fallSpeed * 0.25F;
		setPosition(posX, posY, posZ);
		if (type.smokeTrail)
		{
			double dX = (posX - prevPosX) / 10;
			double dY = (posY - prevPosY) / 10;
			double dZ = (posZ - prevPosZ) / 10;
			for (int i = 0; i < 10; i++)
			{
				worldObj.spawnParticle("smoke", prevPosX + dX * (double) i, prevPosY + dY * (double) i, prevPosZ + dZ * (double) i, 0, 0, 0);
			}
		}
	}

	private DamageSource getBulletDamage()
	{
		return (new EntityDamageSourceIndirect(type.shortName, this, owner)).setProjectile();
	}

	private boolean isPartOfOwner(Entity entity)
	{
		if(owner == null)
			return false;
		if (entity == owner || entity == owner.riddenByEntity || entity == owner.ridingEntity)
			return true;
		if (owner instanceof EntityPlayer)
		{
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
							worldObj.setBlockWithNotify(i, j, k, Block.fire.blockID);
						}
					}
				}
			}
		}
		//Send flak packet
		if(type.flak > 0)
			PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 200, dimension, PacketFlak.buildFlakPacket(posX, posY, posZ, type.flak));
		// Drop item on hitting if bullet requires it
		if (type.dropItemOnHit != null && worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
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
