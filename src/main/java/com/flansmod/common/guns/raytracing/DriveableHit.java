package com.flansmod.common.guns.raytracing;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;

public class DriveableHit extends BulletHit 
{
	public EntityDriveable driveable;
	public EnumDriveablePart part;
	
	public DriveableHit(EntityDriveable d, EnumDriveablePart p, float f) 
	{
		super(f);
		part = p;
		driveable = d;
	}

}
