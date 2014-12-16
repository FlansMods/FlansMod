package com.flansmod.common.guns;

import java.util.List;

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
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

public class EntityGrenade extends EntityShootable implements IEntityAdditionalSpawnData
{
	public GrenadeType type;
	/** The entity that threw them */
	public EntityLivingBase thrower;
	/** This is to avoid players grenades teamkilling after they switch team */
	public Team teamOfThrower;
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
	/** For deployable bags */
	public int numUsesRemaining = 0;
	
	public EntityGrenade(World w) 
	{
		super(w);
	}
	
	public EntityGrenade(World w, GrenadeType g, EntityLivingBase t) 
	{
		this(w);
		setPosition(t.posX, t.posY + t.getEyeHeight(), t.posZ);
		type = g;
		numUsesRemaining = type.numUses;
		thrower = t;
		if(thrower instanceof EntityPlayer && PlayerHandler.getPlayerData((EntityPlayer)thrower) != null)
		{
			teamOfThrower = PlayerHandler.getPlayerData((EntityPlayer)thrower).team;
		}
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
		if(type.throwSound != null)
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.throwSound, true);
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
			{			
				double dX = (posX - prevPosX) / 10;
				double dY = (posY - prevPosY) / 10;
				double dZ = (posZ - prevPosZ) / 10;
				for (int i = 0; i < 10; i++)
				{
					EntityFX particle = FlansModClient.getParticle(type.trailParticleType, worldObj, prevPosX + dX * i, prevPosY + dY * i, prevPosZ + dZ * i);
					if(particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
						particle.renderDistanceWeight = 100D;
					//worldObj.spawnEntityInWorld(particle);
				}
			}
			

		}
		
		//Smoke
		if(smoking)
		{
			//Send flak packet to spawn particles
			FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 50, type.smokeParticleType), posX, posY, posZ, 30, dimension);
			//
			List list = worldObj.getEntitiesWithinAABB(EntityLivingBase.class, boundingBox.expand(type.smokeRadius, type.smokeRadius, type.smokeRadius));
			for(Object obj : list)
			{
				EntityLivingBase entity = ((EntityLivingBase)obj);
				if(entity.getDistanceToEntity(this) < type.smokeRadius)
				{
					//Do some checks first
					boolean smokeThem = true;
					for(int i = 0; i < 5; i++)
					{
						//If any currently equipped item has smoke protection (gas masks), stop the effects
						ItemStack stack = entity.getEquipmentInSlot(i);
						if(stack != null && stack.getItem() instanceof ItemTeamArmour)
						{
							if(((ItemTeamArmour)stack.getItem()).type.smokeProtection)
								smokeThem = false;
						}
					}
					
					if(smokeThem)
						for(PotionEffect effect : type.smokeEffects)
							entity.addPotionEffect(new PotionEffect(effect));
				}
			}
			
			smokeTime--;
			if(smokeTime == 0)
				setDead();
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
						if(TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && obj instanceof EntityPlayerMP && thrower instanceof EntityPlayer)
						{
							if(!TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj, new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)thrower, type, false)))
								continue;
						}
						if(type.damageToTriggerer > 0)
							((EntityLivingBase)obj).attackEntityFrom(getGrenadeDamage(), type.damageToTriggerer);
						detonate();
						break;
					}
					if(obj instanceof EntityDriveable && getDistanceToEntity((Entity)obj) < type.driveableProximityTrigger)
					{
						if(type.damageToTriggerer > 0)
							((EntityDriveable)obj).attackEntityFrom(getGrenadeDamage(), type.damageToTriggerer);
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
		if(!stuck && !type.stickToThrower)
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
			MovingObjectPosition hit = worldObj.rayTraceBlocks(posVec.toVec3(), nextPosVec.toVec3());
			//If we hit block
			if(hit != null && hit.typeOfHit == MovingObjectType.BLOCK)
			{
				//Get the blockID and block material
				Block block = worldObj.getBlock(hit.blockX, hit.blockY, hit.blockZ);
				Material mat = block.getMaterial();
				
				//If this grenade detonates on impact, do so
				if(type.explodeOnImpact)
					detonate();
				
				//If we hit glass and can break it, do so
				else if(type.breaksGlass && mat == Material.glass && TeamsManager.canBreakGlass)
				{
					worldObj.setBlockToAir(hit.blockX, hit.blockY, hit.blockZ);
					FlansMod.proxy.playBlockBreakSound(hit.blockX, hit.blockY, hit.blockZ, block);
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
		
		if(type.stickToThrower)
		{
			if(thrower == null || thrower.isDead)
				setDead();
			else setPosition(thrower.posX, thrower.posY, thrower.posZ);
		}
		
		//If throwing this grenade at an entity should hurt them, this bit checks for entities in the way and does so
		//(Don't attack entities when stuck to stuff)
		if(type.damageVsLiving > 0 && !stuck)
		{
			Vector3f motVec = new Vector3f(motionX, motionY, motionZ);
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox);
			for(Object obj : list)
			{
				if(obj == thrower && ticksExisted < 10 || motVec.lengthSquared() < 0.01D)
					continue;
				if(obj instanceof EntityLivingBase)
					((EntityLivingBase)obj).attackEntityFrom(getGrenadeDamage(), type.damageVsLiving * motVec.lengthSquared() * 3);
			}
		}
	
		//Apply gravity
		motionY -= 9.81D / 400D * type.fallSpeed;
		
		//Temporary fire glitch fix
		if(worldObj.isRemote)
			extinguish();
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
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.detonateSound, true);
		
		//Explode
		if(!worldObj.isRemote && type.explosionRadius > 0.1F)
		{
	        if((thrower instanceof EntityPlayer))
	        	new FlansModExplosion(worldObj, this, (EntityPlayer)thrower, type, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks);
	        else worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks);
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
			return (new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)thrower, type, false)).setProjectile();
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
		if(type == null)
			setDead();
		else
		{
			tags.setString("Type", type.shortName);
			if(thrower != null)
				tags.setString("Thrower", thrower.getCommandSenderName());
			tags.setFloat("RotationYaw", axes.getYaw());
			tags.setFloat("RotationPitch", axes.getPitch());
		}
	}

	@Override
	public void writeSpawnData(ByteBuf data) 
	{
		ByteBufUtils.writeUTF8String(data, type.shortName);
		data.writeInt(thrower == null ? 0 : thrower.getEntityId());
		data.writeFloat(axes.getYaw());
		data.writeFloat(axes.getPitch());
	}

	@Override
	public void readSpawnData(ByteBuf data) 
	{
		type = GrenadeType.getGrenade(ByteBufUtils.readUTF8String(data));
		thrower = (EntityLivingBase)worldObj.getEntityByID(data.readInt());
		setRotation(data.readFloat(), data.readFloat());
		prevRotationYaw = rotationYaw;
		prevRotationPitch = rotationPitch;
		axes.setAngles(rotationYaw, rotationPitch, 0F);
		if(type.spinWhenThrown)
			angularVelocity = new Vector3f(0F, 0F, 10F);
	}

	@Override
    public boolean isBurning()
    {
    	return false;
    }
	
	@Override
	public boolean canBeCollidedWith()
	{
		return !isDead && type.isDeployableBag;
	}
	
	@Override
	public boolean interactFirst(EntityPlayer player)
	{
		// Player right clicked on grenade
		//For deployable bags, give player rewards
		if(type.isDeployableBag && !worldObj.isRemote)
		{
			boolean used = false;
			//Handle healing
			if(type.healAmount > 0 && player.getHealth() < player.getMaxHealth())
			{
				player.heal(type.healAmount);
	        	FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 5, "heart"), new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 50F));
	        	used = true;
			}
			//Handle potion effects
			for(PotionEffect effect : type.potionEffects)
			{
				player.addPotionEffect(new PotionEffect(effect));
				used = true;
			}
			//Handle ammo
			if(type.numClips > 0 && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
			{
				GunType gun = ((ItemGun)player.getCurrentEquippedItem().getItem()).type;
				if(gun.ammo.size() > 0)
				{
					ShootableType bulletToGive = gun.ammo.get(0);
					int numToGive = Math.min(bulletToGive.maxStackSize, type.numClips * gun.numAmmoItemsInGun);
					if(player.inventory.addItemStackToInventory(new ItemStack(bulletToGive.item, numToGive)))
					{
						used = true;
					}
				}
			}
			//If the bag is all used up, get rid of it
			if(used)
			{
				numUsesRemaining--;
				if(numUsesRemaining <= 0)
					setDead();
			}
		}
		return true;
	}
}
