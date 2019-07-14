package com.flansmod.common.driveables;

import java.util.ArrayList;

import net.minecraft.nbt.NBTTagCompound;

import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.collisions.CollisionShapeBox;
import com.flansmod.common.driveables.collisions.CollisionTest;
import com.flansmod.common.driveables.collisions.RidingEntityPosition;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.network.PacketParticle;
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
	public EntityDriveable owner;
	
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
		this.owner = driveable;
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
				float intersectTime = (box.y - origin.y);
				float intersectX = origin.x * intersectTime;
				float intersectZ = origin.z * intersectTime;
				if(intersectX >= box.x && intersectX <= box.x + box.w && intersectZ >= box.z && intersectZ <= box.z + box.d)
					return new DriveableHit(driveable, type, intersectTime);
			}
			else if(origin.y > box.y + box.h) //Check face x = box.y + box.h
			{
				float intersectTime = (box.y + box.h - origin.y);
				float intersectX = origin.x * intersectTime;
				float intersectZ = origin.z * intersectTime;
				if(intersectX >= box.x && intersectX <= box.x + box.w && intersectZ >= box.z && intersectZ <= box.z + box.d)
					return new DriveableHit(driveable, type, intersectTime);
			}
		}

		return null;
	}
	
	
	public RidingEntityPosition rayTraceRider(EntityDriveable driveable, CollisionTest tester)
	{
		if(box == null || health <= 0 || dead)
			return null;
		if(!driveable.canHitPart(type))
			return null;
		
		double distance = 10;
		Vector3f collisionPoint = new Vector3f(0,0,0);
		int surface = 0;
		
		Vector3f pos = new Vector3f(driveable.posX, driveable.posY, driveable.posZ);
		
		RotatedAxes shift = driveable.axes;

		//Define box verticies, where z > 0 is right. See shapeboxes in the toolbox for a visual reference
		Vector3f p1 = shift.findLocalVectorGlobally(new Vector3f(box.x + box.w, box.y + box.h, box.z)); //Front upper left
		Vector3f p2 = shift.findLocalVectorGlobally(new Vector3f(box.x + box.w, box.y + box.h, box.z + box.d)); //Front upper right
		Vector3f p3 = shift.findLocalVectorGlobally(new Vector3f(box.x, box.y + box.h, box.z + box.d)); //Rear upper right
		Vector3f p4 = shift.findLocalVectorGlobally(new Vector3f(box.x, box.y+ box.h, box.z)); //Rear upper left
		Vector3f p5 = shift.findLocalVectorGlobally(new Vector3f(box.x + box.w, box.y, box.z)); //Front lower left
		Vector3f p6 = shift.findLocalVectorGlobally(new Vector3f(box.x + box.w, box.y, box.z + box.d)); //Front lower right
		Vector3f p7 = shift.findLocalVectorGlobally(new Vector3f(box.x, box.y, box.z + box.d)); //Rear lower right
		Vector3f p8 = shift.findLocalVectorGlobally(new Vector3f(box.x, box.y, box.z)); //Rear lower left
		
		if(type == EnumDriveablePart.turret && driveable.seats[0] != null)
		{
			//Define box verticies, where z > 0 is right. See shapeboxes in the toolbox for a visual reference
			p1 = driveable.getPositionOnTurret(new Vector3f(box.x + box.w, box.y + box.h, box.z), false); //Front upper left
			p2 = driveable.getPositionOnTurret(new Vector3f(box.x + box.w, box.y + box.h, box.z + box.d), false); //Front upper right
			p3 = driveable.getPositionOnTurret(new Vector3f(box.x, box.y + box.h, box.z + box.d), false); //Rear upper right
			p4 = driveable.getPositionOnTurret(new Vector3f(box.x, box.y+ box.h, box.z), false); //Rear upper left
			p5 = driveable.getPositionOnTurret(new Vector3f(box.x + box.w, box.y, box.z), false); //Front lower left
			p6 = driveable.getPositionOnTurret(new Vector3f(box.x + box.w, box.y, box.z + box.d), false); //Front lower right
			p7 = driveable.getPositionOnTurret(new Vector3f(box.x, box.y, box.z + box.d), false); //Rear lower right
			p8 = driveable.getPositionOnTurret(new Vector3f(box.x, box.y, box.z), false); //Rear lower left
		}
		
		//Check top face
		double topFaceDist = 100;

		tester.checkTriangle(tester, p3, p2, p1);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			collisionPoint = tester.intersectionPoint;
			surface = 1;
			tester.part = type;
		}
			
		tester.checkTriangle(tester, p4, p3, p1);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			collisionPoint = tester.intersectionPoint;
			surface = 1;
			tester.part = type;
		}
		
		if(tester.didCollide){
			tester.isOnTop = true;
			topFaceDist = tester.nearestDistance;
		}
		
		
		//Check front face
		tester.checkTriangle(tester, p1, p2, p6);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 2;
			tester.part = type;
		}
		tester.checkTriangle(tester, p1, p6, p5);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 2;
			tester.part = type;
		}
		
		//Check rear face
		tester.checkTriangle(tester, p3, p4, p8);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 3;
			tester.part = type;
		}
		tester.checkTriangle(tester, p4, p8, p7);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 3;
			tester.part = type;
		}
		
		//Check Left Face
		tester.checkTriangle(tester, p4, p1, p5);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 4;
			tester.part = type;
		}
		tester.checkTriangle(tester, p1, p5, p8);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 4;
			tester.part = type;
		}
		
		//Check right face
		tester.checkTriangle(tester, p2, p3, p7);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 5;
			tester.part = type;
		}
		tester.checkTriangle(tester, p3, p7, p6);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 5;
			tester.part = type;
		}
		
		if(tester.nearestDistance < topFaceDist) tester.isOnTop = false;
		
		if(surface == 1) tester.isOnTop = true;
		/*
		Vector3f.add(p1, pos, p1);
		Vector3f.add(p2, pos, p2);
		Vector3f.add(p3, pos, p3);
		Vector3f.add(p4, pos, p4);
		Vector3f.add(p5, pos, p5);
		Vector3f.add(p6, pos, p6);
		Vector3f.add(p7, pos, p7);
		Vector3f.add(p8, pos, p8);
		
		boolean muff = false;
		String wank = "crit";
		
		if(muff)
		{
			driveable.worldObj.spawnParticle(wank, p1.x,p1.y,p1.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p2.x,p2.y,p2.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p3.x,p3.y,p3.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p4.x,p4.y,p4.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p5.x,p5.y,p5.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p6.x,p6.y,p6.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p7.x,p7.y,p7.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p8.x,p8.y,p8.z, 0,0,0);
		}
		**/
		
		if(tester.didCollide)
		{
			return new RidingEntityPosition(collisionPoint.x, collisionPoint.y, collisionPoint.z, 1, distance, type);
		}
		return null;
	}
	
	/** Called when the bullet decided that it hit this driveable part */
	public void hitByBullet(EntityBullet bullet, DriveableHit hit)
	{
		//Perform damage code
		if(bullet != null)
		{
			if(hit.driveable instanceof EntityPlane)
			{
				health -= bullet.damage * bullet.type.damageVsPlanes;
			}
			else
			{
				health -= bullet.damage * bullet.type.damageVsVehicles;
			}
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
		if(health<0)
		{
			health = 0;
		}
		return health <= 0;
	}
}
