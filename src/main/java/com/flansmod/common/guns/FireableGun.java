package com.flansmod.common.guns;

public class FireableGun
{

	private Float spread;
	private Float bulletSpeed;
	private GunType gun;
	private Float damage;
	
	public FireableGun(GunType gun, Float damage, Float spread, Float bulletSpeed)
	{
		this.gun = gun;
		this.damage = damage;
		this.spread = spread;
		this.bulletSpeed = bulletSpeed;
	}
	
	public Float getGunSpread()
	{
		return spread;
	}
	
	public String getShortName()
	{
		return gun.shortName;
	}
	
	public GunType getGunType()
	{
		return gun;
	}
	
	public Float getDamage()
	{
		return damage;
	}
	
	public Float getBulletSpeed()
	{
		return this.bulletSpeed;
	}
	
}
