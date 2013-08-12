package co.uk.flansmods.common.driveables;

public class CollisionPoint
{
	public int posX;
	public int posY;
	public int posZ;
	public int strength;
	public EnumDriveablePart part;
		
	public CollisionPoint(int x, int y, int z, String s, int str)
    {
		posX = x;
		posY = y;
		posZ = z;
		part = EnumDriveablePart.getPart(s);
		strength = str;
    }
}