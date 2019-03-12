package com.flansmod.common.driveables;

import com.flansmod.common.parts.PartType;
import com.flansmod.common.vector.Vector3f;

public class Propeller
{
	/**
	 * For crafting and plane destruction
	 */
	public PartType itemType;
	/**
	 * For rendering propellers. Refers to the position in the propellerModel array
	 */
	public int ID;
	/**
	 * Position of the propeller on the plane in model co-ordinates for thrust calculations
	 */
	public int x, y, z;
	/**
	 * Part of the plane it is connected to, for partial plane destruction purposes
	 */
	public EnumDriveablePart planePart;
	
	public Propeller(int i, int x, int y, int z, EnumDriveablePart part, PartType type)
	{
		ID = i;
		this.x = x;
		this.y = y;
		this.z = z;
		planePart = part;
		itemType = type;
	}
	
	public Vector3f getPosition()
	{
		return new Vector3f(x / 16F, y / 16F, z / 16F);
	}
}
