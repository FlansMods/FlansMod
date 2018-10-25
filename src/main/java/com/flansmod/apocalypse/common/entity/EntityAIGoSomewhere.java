package com.flansmod.apocalypse.common.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class EntityAIGoSomewhere extends EntityAIBase
{
	private EntityCreature theEntityCreature;
	protected double speed;
	private double directionX, directionZ;
	private double randPosX;
	private double randPosY;
	private double randPosZ;
	private static final String __OBFID = "CL_00001604";

	public EntityAIGoSomewhere(EntityCreature creature, double speed, double dirX, double dirZ)
	{
		this.theEntityCreature = creature;
		this.speed = speed;

		this.directionX = dirX;
		this.directionZ = dirZ;

		this.setMutexBits(1);
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	public boolean shouldExecute()
	{
		{
			Vec3d Vec3d = RandomPositionGenerator.findRandomTargetBlockTowards(this.theEntityCreature, 5, 4, new Vec3d(theEntityCreature.posX + directionX, theEntityCreature.posY, theEntityCreature.posZ + directionZ));

			if(Vec3d == null)
			{
				return false;
			}
			else
			{
				this.randPosX = Vec3d.x;
				this.randPosY = Vec3d.y;
				this.randPosZ = Vec3d.z;
				return true;
			}
		}
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	public void startExecuting()
	{
		this.theEntityCreature.getNavigator().tryMoveToXYZ(this.randPosX, this.randPosY, this.randPosZ, this.speed);
	}

	/**
	 * Returns whether an in-progress EntityAIBase should continue executing
	 */
	public boolean continueExecuting()
	{
		return !this.theEntityCreature.getNavigator().noPath();
	}
}
