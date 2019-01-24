package com.flansmod.common.guns;

import com.flansmod.common.types.InfoType;

public class FireableGun{

	private Float spread;
	private InfoType gun;
	private Float damage;
	
	public FireableGun(InfoType gun,Float damage,Float spread) {
		this.gun = gun;
		this.damage = damage;
		this.spread = spread;
	}
	
	public Float getGunSpread() {
		return spread;
	}
	
	public String getShortName() {
		return gun.shortName;
	}
	
	public InfoType getInfoType() {
		return gun;
	}
	public Float getDamage() {
		return damage;
	}
}
