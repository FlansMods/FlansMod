package com.flansmod.apocalypse.common.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.network.PacketDriveableDamage;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;

public class EntityAIMecha extends EntityMecha 
{
	private Entity target;
	private float targetingRange = 20F;
	private int targetAcquireInterval = 40;
	
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
		
		//float targetHeight = getBiomeHeight(worldObj.getBiomeGenForCoords(new BlockPos((int)(posX + motionX * lookAheadDist), (int)(posY + motionY * lookAheadDist), (int)(posZ + motionZ * lookAheadDist))));
		//float currentTargetHeight = getBiomeHeight(worldObj.getBiomeGenForCoords(new BlockPos((int)(posX), (int)(posY), (int)(posZ))));

		//flapsPitchLeft = flapsPitchRight += (Math.max(currentTargetHeight, targetHeight) - (float)posY) * 0.1F;
		
		
		
		super.onUpdate();
	}
	
	@Override
	public boolean interactFirst(EntityPlayer entityplayer)
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
			for(Object obj : worldObj.getEntitiesWithinAABBExcludingEntity(this, getEntityBoundingBox().expand(targetingRange, targetingRange, targetingRange)))
			{
				double distToPotentialTarget = this.getDistanceSqToEntity((Entity)obj);
				if(isBetterTarget(target, distToCurrentTarget, (Entity)obj, distToPotentialTarget))
				{
					target = (Entity)obj;
					distToCurrentTarget = distToPotentialTarget;
				}
			}
		}
				
		//And if we have line of sight, shoot it
		if(target != null)
		{
			Vec3 rightArmOrigin = getMechaType().rightArmOrigin.toVec3().addVector(posX, posY, posZ);
			Vec3 targetOrigin = new Vec3(target.posX, target.posY + target.getEyeHeight(), target.posZ);
			
			double dX = targetOrigin.xCoord - rightArmOrigin.xCoord;
			double dY = targetOrigin.yCoord - rightArmOrigin.yCoord;
			double dZ = targetOrigin.zCoord - rightArmOrigin.zCoord;

			axes.setAngles((float)Math.atan2(dZ, dX) * 180F / 3.14159F, 0F, 0F);
			if(seats != null && seats[0] != null)
			{
				seats[0].looking.setAngles(0F, -(float)Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180F / 3.14159F, 0F);
				seats[0].prevLooking.setAngles(0F, -(float)Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180F / 3.14159F, 0F);
			}
			
			MovingObjectPosition hit = worldObj.rayTraceBlocks(rightArmOrigin, targetOrigin, false);
			
			if(worldObj.isRemote)
			{
				worldObj.spawnEntityInWorld(new EntityDebugVector(worldObj, new Vector3f(rightArmOrigin), new Vector3f(dX, dY, dZ), 2));
			}
			{
				double blockHitX = hit == null ? 0 : hit.hitVec.xCoord - rightArmOrigin.xCoord; 
				double blockHitY = hit == null ? 0 : hit.hitVec.yCoord - rightArmOrigin.yCoord; 
				double blockHitZ = hit == null ? 0 : hit.hitVec.zCoord - rightArmOrigin.zCoord; 
				
				//If the target is nearer than the block hit or there was no block
				if(hit == null || hit.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK || dX * dX + dY * dY + dZ * dZ < blockHitX * blockHitX + blockHitY * blockHitY + blockHitZ * blockHitZ)
				{
					useItem(false);
					useItem(true);
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
							legAxes.rotateGlobalYaw(Math.min(angleBetween, type.rotateSpeed)*signBetween);
						}
						
						intent.scale((type.moveSpeed * data.engine.engineSpeed * speedMultiplier())*(4.3F/20F));
						
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
		if(worldObj.isRemote || isDead)
			return true;

		MechaType type = getMechaType();

		if(damagesource.damageType.equals("player") && damagesource.getEntity().onGround && (seats[0] == null || seats[0].riddenByEntity == null))
		{
			return false;
		}
		else return super.attackEntityFrom(damagesource, i);
	}
}
