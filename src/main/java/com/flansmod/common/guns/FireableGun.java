package com.flansmod.common.guns;

import com.flansmod.common.types.InfoType;

/**
 * Class used for storing the properties of a gun
 */
public class FireableGun
{

	/**
	 * Spread of the bullets shot with this gun
	 */
	private Float spread;
	
	/**
	 * Speed a bullet fired from this gun will travel at. (0 means instant/raytraced)
	 */
	private Float bulletSpeed;
	
	/**
	 * The InfoType of this gun
	 */
	private InfoType type;
	
	/**
	 * the damage this gun will cause
	 */
	private float damage;
	
	/**
	 * the damage against vehicles
	 */
	private float vehicledamage;
	/**
	 * @param type        InfoType of the gun
	 * @param damage      Damage of the gun
	 * @param spread      Bullet spread of the gun
	 * @param bulletSpeed Bullet speed of the gun (0 means instant/raytraced)
	 */
	public FireableGun(InfoType type, float damage, float spread, float bulletSpeed)
	{
		this(type, damage, damage, spread, bulletSpeed);
	}
	
	/**
	 * @param type          InfoType of the gun
	 * @param damage        Damage of the gun
	 * @param vehicledamage	Damage of the gun against vehicles
	 * @param spread        Bullet spread of the gun
	 * @param bulletSpeed   Bullet speed of the gun (0 means instant/raytraced)
	 */
	public FireableGun(InfoType type, float damage, float vehicledamage, float spread, float bulletSpeed)
	{
		this.type = type;
		this.damage = damage;
		this.spread = spread;
		this.bulletSpeed = bulletSpeed;
		this.vehicledamage = vehicledamage;
	}
	
	/**
	 * @return the bullet spread of this gun
	 */
	public Float getGunSpread()
	{
		return spread;
	}
	
	/**
	 * @return the shortName of the InfoType of this gun
	 */
	public String getShortName()
	{
		return type.shortName;
	}
	
	/**
	 * @return the InfoType of this gun
	 */
	public InfoType getInfoType()
	{
		return type;
	}
	
	/**
	 * @return the damage this gun will cause
	 */
	public Float getDamage()
	{
		return damage;
	}
	
	/**
	 * @return the speed a bullet fired from this gun will travel at. (0 means instant/raytraced)
	 */
	public Float getBulletSpeed()
	{
		return this.bulletSpeed;
	}
	
	/**
	 * @return the damage this gun will cause against vehicles
	 */
	public Float getDamageAgainstVehicles()
	{
		return this.vehicledamage;
	}
}
