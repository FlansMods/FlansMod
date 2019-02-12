package com.flansmod.common.guns;

import java.util.Optional;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;

public class FiredShot {

	private FireableGun weapon;
	private BulletType bullet;
	private Optional<EntityPlayerMP> player;
	private Optional<? extends Entity> shooter;
	
	public FiredShot(FireableGun weapon, BulletType bullet) {
		this.weapon = weapon;
		this.bullet = bullet;
		this.player = Optional.empty();
		this.shooter = this.player;
	}
	
	public FiredShot(FireableGun weapon, BulletType bullet, EntityPlayerMP player)
	{
		this(weapon,bullet, player, player);
	}
	
	public FiredShot(FireableGun weapon, BulletType bullet, Entity shooter)
	{
		this(weapon, bullet, shooter, null);
	}
	
	public FiredShot(FireableGun weapon, BulletType bullet, Entity shooter, @Nullable EntityPlayerMP player)
	{
		this.weapon = weapon;
		this.bullet = bullet;
		this.player = Optional.ofNullable(player);
		this.shooter = Optional.of(shooter);
	}
	
	public FireableGun getFireableGun() {
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
			return new EntityDamageSourceGun(weapon.getShortName(), player.get(), player.get(), weapon.getInfoType(), headshot);
		}
		return DamageSource.GENERIC;
	}
	
	@Deprecated
	public EntityPlayer getPlayerOrNull() {
		return player.orElse(null);
	}
	
	public Optional<EntityPlayerMP> getPlayerOptional()
	{
		return this.player;
	}
	
	public Optional<? extends Entity> getShooterOptional()
	{
		return this.shooter;
	}
}
