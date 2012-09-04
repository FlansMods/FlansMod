package flan.server;

public class CollisionBox
{
	public CollisionBox(int x, int y, int z, int p)
	{
		this(x, y, z, p, 1);
	}
	
	public CollisionBox(int x, int y, int z, int p, int s)
    {
		posX = x;
		posY = y;
		posZ = z;
		strength = s;
		part = p;
    }
	
	public EntityCollisionBox makeEntity(EntityDriveable plane)
	{
		EntityCollisionBox ent = new EntityCollisionBox(plane, posX, posY, posZ, strength, part);
		plane.worldObj.spawnEntityInWorld(ent);
		return ent;		
	}
		
	public int posX;
	public int posY;
	public int posZ;
	public int strength;
	public int part; //0 = body, 1 = leftWing, 2 = rightWing, 3 = tail
}