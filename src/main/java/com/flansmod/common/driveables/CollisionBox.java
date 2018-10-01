package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;

public class CollisionBox
{
	/**
	 * The origin in model co-ordinates
	 */
	public float x, y, z;
	/**
	 * The dimensions in model co-ordinates
	 */
	public float w, h, d;
	/**
	 * The health of the part this box is attached to
	 */
	public int health;
	/**
	 * The part this box is attached to
	 */
	public EnumDriveablePart part;
	
	public CollisionBox(int health, int x, int y, int z, int w, int h, int d)
	{
		this.health = health;
		this.x = x / 16F;
		this.y = y / 16F;
		this.z = z / 16F;
		this.w = w / 16F;
		this.h = h / 16F;
		this.d = d / 16F;
	}
	
	/**
	 * @return The centre (in global co-ordinates)
	 */
	public Vector3f getCentre()
	{
		return new Vector3f(x + w / 2F, y + h / 2F, z + d / 2F);
	}
}
