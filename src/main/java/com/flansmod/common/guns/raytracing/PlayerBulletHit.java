package com.flansmod.common.guns.raytracing;

/** Raytracing will return a load of these objects containing hit data. These will then be compared against each other and against any block hits
 * The hit that occurs first along the path of the bullet is the one that is acted upon. Unless the bullet has penetration of course */
public class PlayerBulletHit extends BulletHit
{
	/** The hitbox hit */
	public PlayerHitbox hitbox;
	
	public PlayerBulletHit(PlayerHitbox box, float f)
	{
		super(f);
		hitbox = box;
	}
}
