package co.uk.flansmods.common.driveables;

import co.uk.flansmods.common.EntityBullet;
import co.uk.flansmods.common.vector.Vector3f;
import net.minecraft.nbt.NBTTagCompound;

public class DriveablePart 
{
	public EnumDriveablePart type;
	public CollisionBox box;
	public int maxHealth;
	public int health;
	public boolean onFire;
	
	public DriveablePart(EnumDriveablePart e, CollisionBox b)
	{
		type = e;
		box = b;
		health = maxHealth = b == null ? 0 : b.health;
	}
	
	public void update(EntityDriveable driveable)
	{
		if(onFire)
			health--;
		if(health <= 0)
		{
		}
	}
	
	public void writeToNBT(NBTTagCompound tags)
	{
		tags.setInteger(type.getName() + "_Health", health);
		tags.setBoolean(type.getName() + "_Fire", onFire);
	}
	
	public void readFromNBT(NBTTagCompound tags)
	{
		health = tags.getInteger(type.getName() + "_Health");
		onFire = tags.getBoolean(type.getName() + "_Fire");
	}
	
	/** Called by bullets that may have hit the plane 
	 * @return Whether the bullet should consider itself to have hit something (which would mean destroying the bullet unless it penetrates) */
	public boolean rayTrace(EntityBullet bullet, Vector3f origin, Vector3f motion)
	{
		if(box == null)
			return false;
		//Complicated. Will explain later. Someone remind me.
		boolean enteringX = coordIsEntering(origin.x, origin.x + motion.x, (float)box.x / 16F, (float)(box.x + box.w) / 16F);
		boolean enteringY = coordIsEntering(origin.y, origin.y + motion.y, (float)box.y / 16F, (float)(box.y + box.h) / 16F);
		boolean enteringZ = coordIsEntering(origin.z, origin.z + motion.z, (float)box.z / 16F, (float)(box.z + box.d) / 16F);
		boolean inX = coordIsIn(origin.x, origin.x + motion.x, (float)box.x / 16F, (float)(box.x + box.w) / 16F);
		boolean inY = coordIsIn(origin.y, origin.y + motion.y, (float)box.y / 16F, (float)(box.y + box.h) / 16F);
		boolean inZ = coordIsIn(origin.z, origin.z + motion.z, (float)box.z / 16F, (float)(box.z + box.d) / 16F);
		boolean hit = (enteringX && inY && inZ) || (inX && enteringY && inZ) || (inX && inY && enteringZ);
		//If the bullet hits, perform damage code here, and then tell the bullet that it hit
		if(hit)
		{
			health -= bullet.damage * bullet.type.damage;
			if(bullet.type.fire > 0)
				onFire = true;
		}
		return hit;
	}
	
	/** Ray traces a single co-ordinate 
	 * But only returns true once upon entering the box, and not while in or exiting
	 * @param start The start of the ray in this co-ordinate 
	 * @param end The end of the ray in this co-ordinate
	 * @param min The start of the box in this co-ordinate
	 * @param max The end of the box in this co-ordinate 
	 * @return true if the ray hits in this co-ordinate */
	private boolean coordIsEntering(float start, float end, float min, float max)
	{
		//Check to see if ray entered from the left hand side
		if(start < min && end >= min)
			return true;
		//Check to see if ray entered from the right hand side
		if(start > max && end <= max)
			return true;
		return false;	
	}
	
	/** Ray traces a single co-ordinate 
	 * Returns true if the ray is in the bounds at some point along its length
	 * @param start The start of the ray in this co-ordinate 
	 * @param end The end of the ray in this co-ordinate
	 * @param min The start of the box in this co-ordinate
	 * @param max The end of the box in this co-ordinate 
	 * @return true if the ray hits in this co-ordinate */
	private boolean coordIsIn(float start, float end, float min, float max)
	{
		//Check to see if the start point is in
		if(start >= min && start <= max)
			return true;
		//Check to see if the end point is in
		if(end >= min && end <= max)
			return true;
		return false;	
	}
}
