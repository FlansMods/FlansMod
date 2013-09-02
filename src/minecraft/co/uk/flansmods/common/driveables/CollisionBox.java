package co.uk.flansmods.common.driveables;

import co.uk.flansmods.common.vector.Vector3f;

public class CollisionBox 
{
	/** The origin in model co-ordinates */
	public int x, y, z;
	/** The dimensions in model co-ordinates */
	public int w, h, d;
	/** The health of the part this box is attached to */
	public int health;
	/** The part this box is attached to */
	public EnumDriveablePart part;
	
	public CollisionBox(int health, int x, int y, int z, int w, int h, int d)
	{
		this.health = health;
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
		this.h = h;
		this.d = d;
	}
	
	/** @return The centre (in global co-ordinates) */
	public Vector3f getCentre()
	{
		return new Vector3f((float)x / 16F + (float)w / 32F, (float)y / 16F + (float)h / 32F, (float)z / 16F + (float)d / 32F);
	}
}
