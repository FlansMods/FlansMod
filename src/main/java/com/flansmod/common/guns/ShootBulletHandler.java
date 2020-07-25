package com.flansmod.common.guns;

/**
 * Functional interface to add effects when a bullet is fired. This is used to reduce the ammo, apply knockback, drop empty shells, etc.
 */
public interface ShootBulletHandler {
	
	/**
	 * Static instance of ShootBulletHandler, does nothing
	 */
	public static ShootBulletHandler instance = isExtraBullet -> {};
	
	/**
	 * @param isExtraBullet is true whenever the current bullet is not the last one to be shot in this batch
	 */
	public void shooting(Boolean isExtraBullet);

}
