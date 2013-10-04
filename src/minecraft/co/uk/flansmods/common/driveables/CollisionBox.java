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
		return new Vector3f(x / 16F + w / 32F, y / 16F + h / 32F, z / 16F + d / 32F);
	}
}
