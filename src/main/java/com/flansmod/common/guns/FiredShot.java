package com.flansmod.common.guns;

import com.flansmod.common.types.InfoType;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;

public class FiredShot {

	private InfoType weapon;
	private BulletType bullet;
	
	public FiredShot(InfoType weapon, BulletType bullet) {
		this.weapon = weapon;
		this.bullet = bullet;
	}
	
	public InfoType getInfoType() {
		return this.weapon;
	}
	
	public BulletType getBulletType() {
		return this.bullet;
	}
	
	public DamageSource getDamageSource() {
		return getDamageSource(false);
	}
	
	public DamageSource getDamageSource(Boolean headshot) {
		return DamageSource.GENERIC;
	}
}
