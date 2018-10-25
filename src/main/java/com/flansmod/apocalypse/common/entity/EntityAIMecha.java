package com.flansmod.apocalypse.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.vector.Vector3f;

public class EntityAIMecha extends EntityMecha
{
	private Entity target;
	private float targetingRange = 20F;
	private int targetAcquireInterval = 40;
	
	private boolean usingLeft = false;
	
	public EntityAIMecha(World world)
	{
		super(world);
	}
	
	public EntityAIMecha(World world, double x, double y, double z, MechaType type, DriveableData data, NBTTagCompound tags)
	{
		super(world, x, y, z, type, data, tags);
	}
	
	public void onUpdate()
	{
		throttle = 1F;

		//float lookAheadDist = 20F;
		
		//float targetHeight = getBiomeHeight(world.getBiomeGenForCoords(new BlockPos((int)(posX + motionX * lookAheadDist), (int)(posY + motionY * lookAheadDist), (int)(posZ + motionZ * lookAheadDist))));
		//float currentTargetHeight = getBiomeHeight(world.getBiomeGenForCoords(new BlockPos((int)(posX), (int)(posY), (int)(posZ))));

		//flapsPitchLeft = flapsPitchRight += (Math.max(currentTargetHeight, targetHeight) - (float)posY) * 0.1F;
		
		
		super.onUpdate();
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer entityplayer, EnumHand hand)
	{
		return false;
	}
	
	@Override
	protected void moveAI(Vector3f actualMotion)
	{
		MechaType type = getMechaType();
		DriveableData data = getDriveableData();
		
		//Acquire target
		if(target == null && (this.ticksExisted + this.getEntityId()) % targetAcquireInterval == 0)
		{
			double distToCurrentTarget = 999D;
			for(Object obj : world.getEntitiesWithinAABBExcludingEntity(this, getEntityBoundingBox().expand(targetingRange, targetingRange, targetingRange)))
			{
				double distToPotentialTarget = this.getDistanceSq((Entity)obj);
				if(isBetterTarget(target, distToCurrentTarget, (Entity)obj, distToPotentialTarget))
				{
					target = (Entity)obj;
					distToCurrentTarget = distToPotentialTarget;
				}
			}
		}

		//And if we have line of sight, shoot it
		if(!world.isRemote && target != null)
		{
			Vec3d rightArmOrigin = usingLeft ? axes.findLocalVectorGlobally(getMechaType().leftArmOrigin).toVec3().add(posX, posY, posZ) : axes.findLocalVectorGlobally(getMechaType().rightArmOrigin).toVec3().add(posX, posY, posZ);
			Vec3d targetOrigin = new Vec3d(target.posX, target.posY + target.getEyeHeight() / 2D, target.posZ);
			
			double dX = targetOrigin.x - rightArmOrigin.x;
			double dY = targetOrigin.y - rightArmOrigin.y;
			double dZ = targetOrigin.z - rightArmOrigin.z;

			axes.setAngles((float)Math.atan2(dZ, dX) * 180F / 3.14159F, 0F, 0F);
			if(getSeat(0) != null)
			{
				getSeat(0).looking.setAngles(0F, -(float)Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180F / 3.14159F, 0F);
				getSeat(0).prevLooking.setAngles(0F, -(float)Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180F / 3.14159F, 0F);
			}
			
			RayTraceResult hit = world.rayTraceBlocks(rightArmOrigin, targetOrigin, false);
			
			if(world.isRemote)
			{
				//world.spawnEntity(new EntityDebugVector(world, new Vector3f(rightArmOrigin), new Vector3f(dX, dY, dZ), 2));
			}
			{
				double blockHitX = hit == null ? 0 : hit.hitVec.x - rightArmOrigin.x;
				double blockHitY = hit == null ? 0 : hit.hitVec.y - rightArmOrigin.y;
				double blockHitZ = hit == null ? 0 : hit.hitVec.z - rightArmOrigin.z;
				
				//If the target is nearer than the block hit or there was no block
				if(hit == null || hit.typeOfHit != RayTraceResult.Type.BLOCK || dX * dX + dY * dY + dZ * dZ < blockHitX * blockHitX + blockHitY * blockHitY + blockHitZ * blockHitZ)
				{
					useItem(usingLeft);
					if(rand.nextInt(5) == 0)
						usingLeft = !usingLeft;
				}
				//Otherwise, move closer
				else
				{
					//If we have a target, move towards it and look at it
					moveX = (float)(target.posX - posX);
					moveZ = (float)(target.posZ - posZ);
					
					float mag = (float)Math.sqrt(moveX * moveX + moveZ * moveZ);
					
					Vector3f intent = new Vector3f(moveX, 0, moveZ);
					
					if(Math.abs(intent.lengthSquared()) > 0.1)
					{
						intent.normalise();
						
						++legSwing;

						//intent = axes.findLocalVectorGlobally(intent);

						Vector3f intentOnLegAxes = legAxes.findGlobalVectorLocally(intent);
						float intentAngle = (float)Math.atan2(intent.z, intent.x) * 180F / 3.14159265F;
						float angleBetween = intentAngle - legAxes.getYaw();
						if(angleBetween > 180F) angleBetween -= 360F;
						if(angleBetween < -180F) angleBetween += 360F;

						float signBetween = Math.signum(angleBetween);
						angleBetween = Math.abs(angleBetween);
						
						if(angleBetween > 0.1)
						{
							legAxes.rotateGlobalYaw(Math.min(angleBetween, type.rotateSpeed) * signBetween);
						}
						
						intent.scale((type.moveSpeed * data.engine.engineSpeed * speedMultiplier()) * (4.3F / 20F));
						
						if(isPartIntact(EnumDriveablePart.hips))
						{
							//Move!
							Vector3f.add(actualMotion, intent, actualMotion);
						}
					}
				}
			}
		}
		
		
	}
	
	@Override
	protected boolean creative()
	{
		return false;
	}
	
	private boolean isBetterTarget(Entity currentTarget, double distToCurrentTarget, Entity potentialTarget, double distToPotentialTarget)
	{
		if(potentialTarget instanceof EntityPlayer && distToPotentialTarget < distToCurrentTarget && distToPotentialTarget < targetingRange * targetingRange)
			return true;
		return false;
	}
	
	@Override
	public boolean hasFuel()
	{
		return true;
	}

	@Override
	public boolean hasEnoughFuel()
	{
		return true;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
	{
		if(world.isRemote || isDead)
			return true;

		MechaType type = getMechaType();

		if(damagesource.damageType.equals("player") && damagesource.getTrueSource().onGround && (getSeat(0) == null || getSeat(0).getControllingPassenger() == null))
		{
			return false;
		}
		else return super.attackEntityFrom(damagesource, i);
	}
}
