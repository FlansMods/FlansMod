package com.flansmod.common.guns;

import java.util.Optional;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;

public class FiredShot {

	private FireableGun weapon;
	private BulletType bullet;
	private Optional<EntityPlayer> player;
	
	public FiredShot(FireableGun weapon, BulletType bullet) {
		this.weapon = weapon;
		this.bullet = bullet;
		this.player = Optional.empty();
	}
	
	public FireableGun getInfoType() {
		return this.weapon;
	}
	
	public BulletType getBulletType() {
		return this.bullet;
	}
	
	public DamageSource getDamageSource() {
		return getDamageSource(false);
	}
	
	public DamageSource getDamageSource(Boolean headshot) {
		if (player.isPresent()) {
			return new EntityDamageSourceGun(weapon.shortName, player.get(), player.get(), weapon, headshot);
		}
		return DamageSource.GENERIC;
	}
	
	public EntityPlayer getPlayerOrNull() {
		return player.orElse(null);
	}
}
