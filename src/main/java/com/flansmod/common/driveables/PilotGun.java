package com.flansmod.common.driveables;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.vector.Vector3f;

public class PilotGun 
{
	public Vector3f position;
	public EnumDriveablePart driveablePart;
	public GunType type;
	/** Auto assigned by the driveable type for ammo handling */
	public int gunID;
	
	public PilotGun(String[] split)
	{
		position = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
		driveablePart = EnumDriveablePart.getPart(split[4]);
		type = GunType.getGun(split[5]);
	}
}
