package com.flansmod.common.driveables;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.vector.Vector3f;

public class PilotGun extends DriveablePosition
{
	/**
	 * The gun type used by this pilot gun
	 */
	public GunType type;
	
	public PilotGun(String[] split)
	{
		super(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.getPart(split[4]));
		type = GunType.getGun(split[5]);
	}
}
