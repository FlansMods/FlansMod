package com.flansmod.common.driveables;

import net.minecraft.nbt.NBTTagCompound;

import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.vector.Vector3f;

public class DriveablePart 
{
	public EnumDriveablePart type;
	public CollisionBox box;
	public int maxHealth;
	public int health;
	public int fireTime;
	public boolean onFire;
	/** Keeps track of whether death code has been called or not */
	public boolean dead;
	
	public DriveablePart(EnumDriveablePart e, CollisionBox b)
	{
		type = e;
		box = b;
		health = maxHealth = b == null ? 0 : b.health;
	}
	
	public void update(EntityDriveable driveable)
	{
		if(fireTime > 0)
			fireTime--;
		if(fireTime == 0)
			onFire = false;
		if(onFire)
			health--;
		if(health <= 0 && maxHealth > 0)
		{
			dead = true;
		}
	}
	
	public void writeToNBT(NBTTagCompound tags)
	{
		tags.setInteger(type.getShortName() + "_Health", health);
		tags.setBoolean(type.getShortName() + "_Fire", onFire);
	}
	
	public void readFromNBT(NBTTagCompound tags)
	{
		if(!tags.hasKey(type.getShortName() + "_Health"))
		{
			health = maxHealth;
			onFire = false;
			return;
		}
		health = tags.getInteger(type.getShortName() + "_Health");
		onFire = tags.getBoolean(type.getShortName() + "_Fire");
	}
	
	/** Called when a corner of this part hits the ground.
	 * @return The amount of damage to do to the block */
	public float smashIntoGround(EntityDriveable driveable, float damage)
	{
		//In these cases, there was no collision, so don't damage this or the block
		if(box == null || dead)
			return 0;
		if(!driveable.canHitPart(type))
			return 0;
		//This part is immortal. Smash that block into oblivion
		if(maxHealth == 0)
			return damage;
		//As standard, take half damage and return the other half
		health -= (int)(damage / 2F);
		return damage / 2F;
	}
		
	/** Called by bullets that may have hit the plane 
	 * @return A bullet hit if it hit. Otherwise null */
	public DriveableHit rayTrace(EntityDriveable driveable, Vector3f origin, Vector3f motion)
	{
		if(box == null || health <= 0 || dead)
			return null;
		if(!driveable.canHitPart(type))
			return null;

		//Complicated. Will explain later. Someone remind me.
		/*
		boolean enteringX = coordIsEntering(origin.x, origin.x + motion.x, box.x / 16F, (box.x + box.w) / 16F);
		boolean enteringY = coordIsEntering(origin.y, origin.y + motion.y, box.y / 16F, (box.y + box.h) / 16F);
		boolean enteringZ = coordIsEntering(origin.z, origin.z + motion.z, box.z / 16F, (box.z + box.d) / 16F);
		boolean inX = coordIsIn(origin.x, origin.x + motion.x, box.x / 16F, (box.x + box.w) / 16F);
		boolean inY = coordIsIn(origin.y, origin.y + motion.y, box.y / 16F, (box.y + box.h) / 16F);
		boolean inZ = coordIsIn(origin.z, origin.z + motion.z, box.z / 16F, (box.z + box.d) / 16F);
		boolean hit = (enteringX && inY && inZ) || (inX && enteringY && inZ) || (inX && inY && enteringZ);
		*/
				
		//We now have an AABB starting at box(x, y, z) and with dimensions box(w, h, d) and our ray in the same coordinate system
		//We are looking for a point at which the ray enters the box, so we need only consider faces that the ray can see. Partition the space into 3 areas in each axis
		
		//X - axis and faces x = box.x and x = box.x + box.w
		if(motion.x != 0F)
		{
			if(origin.x < box.x) //Check face x = o.x
			{
				float intersectTime = (box.x - origin.x) / motion.x;
				float intersectY = origin.y + motion.y * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectY >= box.y && intersectY <= box.y + box.h && intersectZ >= box.z && intersectZ <= box.z + box.d)
					return new DriveableHit(driveable, type, intersectTime);
			}
			else if(origin.x > box.x + box.w) //Check face x = o.x + d.x
			{
				float intersectTime = (box.x + box.w - origin.x) / motion.x;
				float intersectY = origin.y + motion.y * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectY >= box.y && intersectY <= box.y + box.h && intersectZ >= box.z && intersectZ <= box.z + box.d)
					return new DriveableHit(driveable, type, intersectTime);
			}
		}
		
		//Z - axis and faces z = box.z and z = box.z + box.d
		if(motion.z != 0F)
		{
			if(origin.z < box.z) //Check face z = box.z
			{
				float intersectTime = (box.z - origin.z) / motion.z;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectY = origin.y + motion.y * intersectTime;
				if(intersectX >= box.x && intersectX <= box.x + box.w && intersectY >= box.y && intersectY <= box.y + box.h)
					return new DriveableHit(driveable, type, intersectTime);
			}
			else if(origin.z > box.z + box.d) //Check face z = box.z + box.d
			{
				float intersectTime = (box.z + box.d - origin.z) / motion.z;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectY = origin.y + motion.y * intersectTime;
				if(intersectX >= box.x && intersectX <= box.x + box.w && intersectY >= box.y && intersectY <= box.y + box.h)
					return new DriveableHit(driveable, type, intersectTime);
			}
		}
		
		//Y - axis and faces y = box.y and y = box.y + box.h
		if(motion.y != 0F)
		{
			if(origin.y < box.y) //Check face y = o.y
			{
				float intersectTime = (box.y - origin.y) / motion.y;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectX >= box.x && intersectX <= box.x + box.w && intersectZ >= box.z && intersectZ <= box.z + box.d)
					return new DriveableHit(driveable, type, intersectTime);
			}
			else if(origin.y > box.y + box.h) //Check face x = box.y + box.h
			{
				float intersectTime = (box.y + box.h - origin.y) / motion.y;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectX >= box.x && intersectX <= box.x + box.w && intersectZ >= box.z && intersectZ <= box.z + box.d)
					return new DriveableHit(driveable, type, intersectTime);
			}
		}

		return null;
	}
	
	/** Called when the bullet decided that it hit this driveable part */
	public void hitByBullet(EntityBullet bullet)
	{
		//Perform damage code
		if(bullet != null)
		{
			health -= bullet.damage * bullet.type.damageVsDriveable;
			if(bullet.type.setEntitiesOnFire)
			{
				fireTime = 20;
				onFire = true;
			}
		}
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
		//Check to see if the start and end points are either side of the interval
		if(start < min && end > max)
			return true;
		if(end < min && start > max)
			return true;
		return false;	
	}

	public boolean attack(float damage, boolean fireDamage) 
	{
		health -= damage;
		if(fireDamage)
		{				
			fireTime = 20;
			onFire = true;
		}
		return health <= 0;
	}
}
