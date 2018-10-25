package com.flansmod.common.guns;

import java.util.List;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.FlansModExplosion;
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

import static com.flansmod.common.util.BlockUtil.destroyBlock;

public class EntityGrenade extends EntityShootable implements IEntityAdditionalSpawnData
{
	public GrenadeType type;
	/**
	 * The entity that threw them
	 */
	public EntityLivingBase thrower;
	/**
	 * This is to avoid players grenades teamkilling after they switch team
	 */
	public Team teamOfThrower;
	/**
	 * Yeah, I want my grenades to have fancy physics
	 */
	public RotatedAxes axes = new RotatedAxes();
	public Vector3f angularVelocity = new Vector3f(0F, 0F, 0F);
	public float prevRotationRoll = 0F;
	/**
	 * Set to the smoke amount when the grenade detonates and decremented every tick after that
	 */
	public int smokeTime = 0;
	/**
	 * Set to true when smoke grenade detonates
	 */
	public boolean smoking = false;
	/**
	 * Set to true when a sticky grenade sticks. Impedes further movement
	 */
	public boolean stuck = false;
	/**
	 * Stores the position of the block this grenade is stuck to. Used to determine when to unstick
	 */
	public int stuckToX, stuckToY, stuckToZ;
	/**
	 * Stop repeat detonations
	 */
	public boolean detonated = false;
	/**
	 * For deployable bags
	 */
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
		if(type == null || (type.despawnTime > 0 && ticksExisted > type.despawnTime))
		{
			detonated = true;
			setDead();
			return;
		}
		
		//Visuals
		if(world.isRemote)
		{
			if(type.trailParticles)
			{
				double dX = (posX - prevPosX) / 10;
				double dY = (posY - prevPosY) / 10;
				double dZ = (posZ - prevPosZ) / 10;
				for(int i = 0; i < 10; i++)
				{
					Particle particle = FlansModClient.getParticle(type.trailParticleType, world, prevPosX + dX * i, prevPosY + dY * i, prevPosZ + dZ * i);
					// TODO: [1.12] Particles
					//if(particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
					//	particle.renderDistanceWeight = 100D;
					//world.spawnEntity(particle);
				}
			}
			
			
		}
		
		//Smoke
		if(smoking)
		{
			//Send flak packet to spawn particles
			FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 50, type.smokeParticleType), posX, posY, posZ, 30, dimension);
			//
			List list = world.getEntitiesWithinAABB(EntityLivingBase.class, getEntityBoundingBox().expand(type.smokeRadius, type.smokeRadius, type.smokeRadius));
			for(Object obj : list)
			{
				EntityLivingBase entity = ((EntityLivingBase)obj);
				if(entity.getDistanceSq(this) < type.smokeRadius * type.smokeRadius)
				{
					//Do some checks first
					boolean smokeThem = true;
					for(int i = 0; i < EntityEquipmentSlot.values().length; i++)
					{
						//If any currently equipped item has smoke protection (gas masks), stop the effects
						ItemStack stack = entity.getItemStackFromSlot(EntityEquipmentSlot.values()[i]);
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
		if(!world.isRemote)
		{
			if(ticksExisted > type.fuse && type.fuse > 0)
				detonate();
			//If this grenade has a proximity trigger, check for living entities within it's range
			if(type.livingProximityTrigger > 0 || type.driveableProximityTrigger > 0)
			{
				float checkRadius = Math.max(type.livingProximityTrigger, type.driveableProximityTrigger);
				List list = world.getEntitiesWithinAABBExcludingEntity(this, getEntityBoundingBox().expand(checkRadius, checkRadius, checkRadius));
				for(Object obj : list)
				{
					if(obj == thrower && ticksExisted < 10)
						continue;
					if(obj instanceof EntityLivingBase && getDistanceSq((Entity)obj) < type.livingProximityTrigger * type.livingProximityTrigger)
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
					if(obj instanceof EntityDriveable && getDistanceSq((Entity)obj) < type.driveableProximityTrigger * type.driveableProximityTrigger)
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
		if(stuck && world.isAirBlock(new BlockPos(stuckToX, stuckToY, stuckToZ)))
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
			RayTraceResult hit = world.rayTraceBlocks(posVec.toVec3(), nextPosVec.toVec3());
			//If we hit block
			if(hit != null && hit.typeOfHit == RayTraceResult.Type.BLOCK)
			{
				//Get the blockID and block material
				Block block = world.getBlockState(hit.getBlockPos()).getBlock();
				Material mat = world.getBlockState(hit.getBlockPos()).getMaterial();
				
				//If this grenade detonates on impact, do so
				if(type.explodeOnImpact)
					detonate();
					
					//If we hit glass and can break it, do so
				else if(type.breaksGlass && mat == Material.GLASS && TeamsManager.canBreakGlass)
				{
					if(!world.isRemote)
					{
						WorldServer worldServer = (WorldServer)world;
						destroyBlock(worldServer, hit.getBlockPos(), thrower, false);
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
					EnumFacing sideHit = hit.sideHit;
					switch(sideHit)
					{
						case UP:
						case DOWN:
							postHitMotVec.setY(-postHitMotVec.getY());
							break;
						case EAST:
						case WEST:
							postHitMotVec.setX(-postHitMotVec.getX());
							break;
						case NORTH:
						case SOUTH:
							postHitMotVec.setZ(-postHitMotVec.getZ());
							break;
						//TODO : Check the compass directions are correct
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
						playSound(FlansModResourceHandler.getSoundEvent(type.bounceSound), 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
					
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
							case DOWN:
								axes.setAngles(yaw, 180F, 0F);
								break;
							case UP:
								axes.setAngles(yaw, 0F, 0F);
								break;
							case NORTH:
								axes.setAngles(270F, 90F, 0F);
								axes.rotateLocalYaw(yaw);
								break;
							case SOUTH:
								axes.setAngles(90F, 90F, 0F);
								axes.rotateLocalYaw(yaw);
								break;
							case WEST:
								axes.setAngles(180F, 90F, 0F);
								axes.rotateLocalYaw(yaw);
								break;
							case EAST:
								axes.setAngles(0F, 90F, 0F);
								axes.rotateLocalYaw(yaw);
								break;
						}
						
						//Set the stuck flag on
						stuck = true;
						stuckToX = hit.getBlockPos().getX();
						stuckToY = hit.getBlockPos().getY();
						stuckToZ = hit.getBlockPos().getZ();
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
			List list = world.getEntitiesWithinAABBExcludingEntity(this, getEntityBoundingBox());
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
		if(world.isRemote)
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
		if(!world.isRemote && type.explosionRadius > 0.1F)
		{
			new FlansModExplosion(world, this, thrower, type, posX, posY, posZ, type.explosionRadius, type.fireRadius > 0, type.smokeRadius > 0, type.explosionBreaksBlocks);
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
						int x = MathHelper.floor(i + posX);
						int y = MathHelper.floor(j + posY);
						int z = MathHelper.floor(k + posZ);
						if(i * i + j * j + k * k <= type.fireRadius * type.fireRadius && world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR && rand.nextBoolean())
						{
							/*
							 if(!world.getBlockState(new BlockPos(x + 1, y, z)).getBlock(). || !world.isAirBlock(new BlockPos(x - 1, y, z)) 
							 
							|| !world.isAirBlock(new BlockPos(x, y + 1, z)) || !world.isAirBlock(new BlockPos(x, y - 1, z))
							|| !world.isAirBlock(new BlockPos(x, y, z + 1)) || !world.isAirBlock(new BlockPos(x, y, z - 1))) 
							*/
							{
								world.setBlockState(new BlockPos(x, y, z), Blocks.FIRE.getDefaultState(), 2);
								world.scheduleUpdate(new BlockPos(x, y, z), Blocks.FIRE, 0);
							}
						}
					}
				}
			}
		}
		
		//Make explosion particles
		if(world.isRemote)
		{
			for(int i = 0; i < type.explodeParticles; i++)
			{
				world.spawnParticle(FlansModClient.getParticleType(type.explodeParticleType), posX, posY, posZ, rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian());
			}
		}
		
		//Drop item upon detonation, after explosions and whatnot
		if(!world.isRemote && type.dropItemOnDetonate != null)
		{
			String itemName = type.dropItemOnDetonate;
			int damage = 0;
			if(itemName.contains("."))
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
	public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int i, boolean b)
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
		thrower = world.getPlayerEntityByName(tags.getString("Thrower"));
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
				tags.setString("Thrower", thrower.getName());
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
		thrower = (EntityLivingBase)world.getEntityByID(data.readInt());
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
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
	{
		// Player right clicked on grenade
		//For deployable bags, give player rewards
		if(type.isDeployableBag && !world.isRemote)
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
			if(type.numClips > 0 && player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemGun)
			{
				GunType gun = ((ItemGun)player.getHeldItemMainhand().getItem()).GetType();
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
