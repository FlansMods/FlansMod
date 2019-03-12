package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;

/**
 * Defines a position on a driveable in local co-ordinates, with a note of the part this is attached to for damage handling
 */
public class DriveablePosition
{
	/**
	 * The position
	 */
	public Vector3f position;
	/**
	 * The part this is attached to
	 */
	public EnumDriveablePart part;
	
	public DriveablePosition(Vector3f v, EnumDriveablePart p)
	{
		position = v;
		part = p;
	}
	
	public DriveablePosition(String[] split)
	{
		this(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.getPart(split[4]));
	}
}
