package co.uk.flansmods.common.driveables;

import co.uk.flansmods.common.vector.Vector3f;

public class CollisionPoint
{	
	public int posX;
	public int posY;
	public int posZ;
	public float strength;
	public EnumDriveablePart part;
		
	public CollisionPoint(int x, int y, int z, String s, float str)
    {
		posX = x;
		posY = y;
		posZ = z;
		part = EnumDriveablePart.getPart(s);
		strength = str;
    }
	
	public Vector3f getLocalVector()
	{
		return new Vector3f(posX / 16F, posY / 16F, posZ / 16F);
	}
}