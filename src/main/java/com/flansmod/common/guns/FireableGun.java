package com.flansmod.common.guns;

import com.flansmod.common.types.InfoType;

public class FireableGun
{

	private Float spread;
	private Float bulletSpeed;
	private InfoType type;
	private Float damage;
	
	public FireableGun(InfoType type, Float damage, Float spread, Float bulletSpeed)
	{
		this.type = type;
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
		return type.shortName;
	}
	
	public InfoType getInfoType()
	{
		return type;
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
