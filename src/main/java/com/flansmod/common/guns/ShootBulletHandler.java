package com.flansmod.common.guns;

public interface ShootBulletHandler {
	
	/**
	 * Static instance of ShootBulletHandler, does nothing
	 */
	public static ShootBulletHandler instance = (Boolean isExtraBullet) -> {};
	
	/**
	 * @param isExtraBullet is true whenever the current bullet is not the last one to be shot in this batch
	 */
	public void shooting(Boolean isExtraBullet);

}
