package co.uk.flansmods.common.guns;

import java.util.List;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.teams.Team;
import co.uk.flansmods.common.teams.TeamsManager;
import co.uk.flansmods.common.vector.Vector3f;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGrenade extends Entity implements IEntityAdditionalSpawnData
{
	public GrenadeType type;
	public EntityLivingBase thrower;
	/** Yeah, I want my grenades to have fancy physics */
	public RotatedAxes axes = new RotatedAxes();
	public Vector3f angularVelocity = new Vector3f(0F, 0F, 0F);
	public float prevRotationRoll = 0F;
	/** Set to the smoke amount when the grenade detonates and decremented every tick after that */
	public int smokeTime = 0;
	/** Set to true when smoke grenade detonates */
	public boolean smoking = false;
	/** Set to true when a sticky grenade sticks. Impedes further movement */
	public boolean stuck = false;
	/** Stores the position of the block this grenade is stuck to. Used to determine when to unstick */
	public int stuckToX, stuckToY, stuckToZ;
	/** Stop repeat detonations */
	public boolean detonated = false;
	
	public EntityGrenade(World w) 
	{
		super(w);
	}
	
	public EntityGrenade(World w, GrenadeType g, EntityLivingBase t) 
	{
		this(w);
		setPosition(t.posX, t.posY + t.getEyeHeight(), t.posZ);
		type = g;
		thrower = t;
		setSize(g.hitBoxSize, g.hitBoxSize);
		//Set the grenade to be facing the way the player is looking
		axes.setAngles(t.rotationYaw + 90F, g.spinWhenThrown ? t.rotationPitch : 0F, 0F);
		rotationYaw = prevRotationYaw = g.spinWhenThrown ? t.rotationYaw + 90F : 0F;
		rotationPitch = prevRotationPitch = t.rotationPitch;
		//Give the grenade velocity in the direction the player is looking
		float speed = 0.5F * type.throwSpeed;
		motionX = axes.getXAxis().x * speed;
		motionY = axes.getXAxis().y * speed;
		motionZ = axes.getXAxis().z * speed;
		if(type.spinWhenThrown)
			angularVelocity = new Vector3f(0F, 0F, 10F);
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		//Quiet despawning
		if(type.despawnTime > 0 && ticksExisted > type.despawnTime)
		{
			detonated = true;
			setDead();
			return;
		}
		
		//Visuals
		if(worldObj.isRemote)
		{
			if(type.trailParticles)
				worldObj.spawnParticle(type.trailParticleType, posX, posY, posZ, 0F, 0F, 0F);
			
			//Smoke
			if(!smoking)
			{
				for(int i = 0; i < 20; i++)
					worldObj.spawnParticle(type.trailParticleType, posX + rand.nextGaussian(), posY + rand.nextGaussian(), posZ + rand.nextGaussian(), 0F, 0F, 0F);
				smokeTime--;
				if(smokeTime == 0)
					setDead();
			}
		}
		
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
					if(obj == thrower && ticksExisted < 10)
						continue;
					if(obj instanceof EntityLivingBase && getDistanceToEntity((Entity)obj) < type.livingProximityTrigger)
					{
						//If we are in a gametype and both thrower and triggerer are playing, check for friendly fire
						if(TeamsManager.getInstance() != null && TeamsManager.getInstance().currentGametype != null && obj instanceof EntityPlayerMP && thrower instanceof EntityPlayer)
						{
							if(!TeamsManager.getInstance().currentGametype.playerAttacked((EntityPlayerMP)obj, new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)thrower, type)))
								continue;
						}
						detonate();
						break;
					}
					if(obj instanceof EntityDriveable && getDistanceToEntity((Entity)obj) < type.driveableProximityTrigger)
					{
						detonate();
						break;
					}
				}
			}
		}

		//If the block we were stuck to is gone, unstick
		if(stuck && worldObj.isAirBlock(stuckToX, stuckToY, stuckToZ))
			stuck = false;
		
		//Physics and motion (Don't move if stuck)
		if(!stuck)
		{
			prevRotationYaw = axes.getYaw();
			prevRotationPitch = axes.getPitch();
			prevRotationRoll = axes.getRoll();
			if(angularVelocity.lengthSquared() > 0.00000001F)
				axes.rotateLocal(angularVelocity.length(), angularVelocity.normalise(null));

			Vector3f posVec = new Vector3f(posX, posY, posZ);
			Vector3f motVec = new Vector3f(motionX, motionY, motionZ);
			Vector3f nextPosVec = Vector3f.add(posVec, motVec, null);
			
			//Raytrace the motion of this grenade
			MovingObjectPosition hit = worldObj.clip(posVec.toVec3(), nextPosVec.toVec3());
			//If we hit block
			if(hit != null && hit.typeOfHit == EnumMovingObjectType.TILE)
			{
				//Get the blockID and block material
				int blockID = worldObj.getBlockId(hit.blockX, hit.blockY, hit.blockZ);
				Material mat = worldObj.getBlockMaterial(hit.blockX, hit.blockY, hit.blockZ);
				
				//If this grenade detonates on impact, do so
				if(type.detonateOnImpact)
					detonate();
				
				//If we hit glass and can break it, do so
				else if(type.breaksGlass && mat == Material.glass)
				{
					if(FlansMod.canBreakGlass)
					{
						worldObj.setBlockToAir(hit.blockX, hit.blockY, hit.blockZ);
						FlansMod.proxy.playBlockBreakSound(hit.blockX, hit.blockY, hit.blockZ, blockID);
					}
				}
				
				//If this grenade does not penetrate blocks, hit the block instead
				//The grenade cannot bounce if it detonated on impact, so hence the "else" condition
				else if(!type.penetratesBlocks)
				{				
					Vector3f hitVec = new Vector3f(hit.hitVec);
					//Motion of the grenade pre-hit
					Vector3f preHitMotVec = Vector3f.sub(hitVec, posVec, null);
					//Motion of the grenade post-hit
					Vector3f postHitMotVec = Vector3f.sub(motVec, preHitMotVec, null);
					
					//Reflect postHitMotVec based on side hit
					int sideHit = hit.sideHit;
					switch(sideHit)
					{
					case 0 : case 1 : postHitMotVec.setY(-postHitMotVec.getY()); break;
					case 4 : case 5 : postHitMotVec.setX(-postHitMotVec.getX()); break;
					case 2 : case 3 : postHitMotVec.setZ(-postHitMotVec.getZ()); break;
					}
					
					//Calculate the time interval spent post reflection
					float lambda = Math.abs(motVec.lengthSquared()) < 0.00000001F ? 1F : postHitMotVec.length() / motVec.length();
					//Scale the post hit motion by the bounciness of the grenade
					postHitMotVec.scale(type.bounciness / 2);
					
					//Move the grenade along the new path including reflection
					posX += preHitMotVec.x + postHitMotVec.x;
					posY += preHitMotVec.y + postHitMotVec.y;
					posZ += preHitMotVec.z + postHitMotVec.z;
					
					//Set the motion
					motionX = postHitMotVec.x / lambda;
					motionY = postHitMotVec.y / lambda;
					motionZ = postHitMotVec.z / lambda;
					
					//Reset the motion vector
					motVec = new Vector3f(motionX, motionY, motionZ);
					
					//Give it a random spin
					float randomSpinner = 90F;
					Vector3f.add(angularVelocity, new Vector3f(rand.nextGaussian() * randomSpinner, rand.nextGaussian() * randomSpinner, rand.nextGaussian() * randomSpinner), angularVelocity);
					//Slow the spin based on the motion
					angularVelocity.scale(motVec.lengthSquared());
					
					//Play the bounce sound
					if(motVec.lengthSquared() > 0.01D)
						playSound(type.bounceSound, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
					
					//If this grenade is sticky, stick it to the block
					if(type.sticky)
					{
						//Move the grenade to the point of contact
						posX = hitVec.x;
						posY = hitVec.y;
						posZ = hitVec.z;
						//Stop all motion of the grenade
						motionX = motionY = motionZ = 0;
						angularVelocity.set(0F, 0F, 0F);
						
						float yaw = axes.getYaw();
						
						switch(hit.sideHit)
						{
						case 0 : axes.setAngles(yaw, 180F, 0F); break;
						case 1 : axes.setAngles(yaw, 0F, 0F); break;
						case 2 : axes.setAngles(270F, 90F, 0F); axes.rotateLocalYaw(yaw); break;
						case 3 : axes.setAngles(90F, 90F, 0F); axes.rotateLocalYaw(yaw); break;
						case 4 : axes.setAngles(180F, 90F, 0F); axes.rotateLocalYaw(yaw); break;
						case 5 : axes.setAngles(0F, 90F, 0F); axes.rotateLocalYaw(yaw); break;
						}

						//Set the stuck flag on
						stuck = true;
						stuckToX = hit.blockX;
						stuckToY = hit.blockY;
						stuckToZ = hit.blockZ;
					}
				}
			}
			//We didn't hit a block, continue as normal
			else
			{
				posX += motionX;
				posY += motionY;
				posZ += motionZ;
			}
	
			//Update the grenade position
			setPosition(posX, posY, posZ);
		}
		
		//If throwing this grenade at an entity should hurt them, this bit checks for entities in the way and does so
		//(Don't attack entities when stuck to stuff)
		if(type.hitEntityDamage > 0 && !stuck)
		{
			Vector3f motVec = new Vector3f(motionX, motionY, motionZ);
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox);
			for(Object obj : list)
			{
				if(obj == thrower && ticksExisted < 10 || motVec.lengthSquared() < 0.01D)
					continue;
				if(obj instanceof EntityLivingBase)
				{
					((EntityLivingBase)obj).attackEntityFrom(getGrenadeDamage(), type.hitEntityDamage * motVec.lengthSquared() * 3);
				}
			}
		}
	
		//Apply gravity
		motionY -= 9.81D / 400D * type.fallSpeed;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float f)
	{
		if(type.detonateWhenShot)
			detonate();
		return type.detonateWhenShot;
	}
	
	public void detonate()
	{
		//Do not detonate before grenade is primed
		if(ticksExisted < type.primeDelay)
			return;
		
		//Stop repeat detonations
		if(detonated)
			return;
		detonated = true;
		
		//Play detonate sound
		playSound(type.detonateSound, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
		
		//Explode
		if(!worldObj.isRemote && type.explosionRadius > 0.1F)
		{
	        if((thrower instanceof EntityPlayer))
	        	new FlansModExplosion(worldObj, this, (EntityPlayer)thrower, type, posX, posY, posZ, type.explosionRadius, FlansMod.explosions && type.explosionBreaksBlocks);
	        else worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, FlansMod.explosions && type.explosionBreaksBlocks);
		}
		
		//Make fire
		if(type.fireRadius > 0.1F)
		{
			for(float i = -type.fireRadius; i < type.fireRadius; i++)
			{
				for(float j = -type.fireRadius; j < type.fireRadius; j++)
				{
					for(float k = -type.fireRadius; k < type.fireRadius; k++)
					{
						int x = MathHelper.floor_float(i);
						int y = MathHelper.floor_float(j);
						int z = MathHelper.floor_float(k);
						if(worldObj.getBlockId(x, y, z) == 0)
						{
							worldObj.setBlock(x, y, z, Block.fire.blockID);
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
		
		//Start smoke counter
		if(type.smokeTime > 0)
		{
			smoking = true;
			smokeTime = type.smokeTime;
		}
		else
		{
			setDead();
		}
	}
	
	@Override
	public void setPositionAndRotation2(double x, double y, double z, float yaw, float pitch, int i)
	{
		
	}
	
	private DamageSource getGrenadeDamage()
	{
		if(thrower instanceof EntityPlayer)
			return (new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)thrower, type)).setProjectile();
		else return (new EntityDamageSourceIndirect(type.shortName, this, thrower)).setProjectile();
	}

	@Override
	protected void entityInit() 
	{

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags) 
	{
		type = GrenadeType.getGrenade(tags.getString("Type"));
		thrower = worldObj.getPlayerEntityByName(tags.getString("Thrower"));
		rotationYaw = tags.getFloat("RotationYaw");
		rotationPitch = tags.getFloat("RotationPitch");
		axes.setAngles(rotationYaw, rotationPitch, 0F);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags) 
	{
		tags.setString("Type", type.shortName);
		if(thrower != null)
			tags.setString("Thrower", thrower.getEntityName());
		tags.setFloat("RotationYaw", axes.getYaw());
		tags.setFloat("RotationPitch", axes.getPitch());
	}

	@Override
	public void writeSpawnData(ByteArrayDataOutput data) 
	{
		data.writeUTF(type.shortName);
		data.writeInt(thrower == null ? 0 : thrower.entityId);
		data.writeFloat(axes.getYaw());
		data.writeFloat(axes.getPitch());
	}

	@Override
	public void readSpawnData(ByteArrayDataInput data) 
	{
		type = GrenadeType.getGrenade(data.readUTF());
		thrower = (EntityLivingBase)worldObj.getEntityByID(data.readInt());
		setRotation(data.readFloat(), data.readFloat());
		prevRotationYaw = rotationYaw;
		prevRotationPitch = rotationPitch;
		axes.setAngles(rotationYaw, rotationPitch, 0F);
		if(type.spinWhenThrown)
			angularVelocity = new Vector3f(0F, 0F, 10F);
	}

}
