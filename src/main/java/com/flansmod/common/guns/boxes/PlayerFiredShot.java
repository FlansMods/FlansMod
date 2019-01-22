package com.flansmod.common.guns.boxes;

import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityDamageSourceGun;
import com.flansmod.common.guns.FiredShot;
import com.flansmod.common.types.InfoType;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;

public class PlayerFiredShot extends FiredShot{

	private EntityPlayer player;
	
	public PlayerFiredShot(InfoType weapon, BulletType bullet, EntityPlayer player) {
		super(weapon, bullet);
		this.player = player;
	}
	
	public DamageSource getDamageSource(Boolean headshot) {
		return new EntityDamageSourceGun(getInfoType().shortName, this, player, getInfoType(), headshot);
	}
}
