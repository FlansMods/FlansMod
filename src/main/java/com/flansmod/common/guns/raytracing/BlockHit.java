package com.flansmod.common.guns.raytracing;

import net.minecraft.util.MovingObjectPosition;

public class BlockHit extends BulletHit 
{
	public MovingObjectPosition raytraceResult;
	
	public BlockHit(MovingObjectPosition mop, float f) 
	{
		super(f);
		raytraceResult = mop;
	}

}
