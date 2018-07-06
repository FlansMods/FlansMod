package com.flansmod.common.damages;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public class DamageKnockDown extends DamageSource {
	public String vehicleName;
	public EntityLivingBase driver = null;
	
	public DamageKnockDown(String vehicleName) {
		super("knock_down");
		
		this.vehicleName = vehicleName;
	}
	public DamageKnockDown(String vehicleName, EntityLivingBase driver) {
		this(vehicleName);
		
		this.driver = driver;
	}
	
	public ITextComponent getDeathMessage(EntityLivingBase entityLivingBaseIn) {
		return driver == null ? new TextComponentTranslation("death.attack." + damageType, new Object[] {entityLivingBaseIn.getDisplayName(), new TextComponentTranslation("item." + vehicleName + ".name")}) : new TextComponentTranslation("death.attack." + damageType + ".player", new Object[] {entityLivingBaseIn.getDisplayName(), new TextComponentTranslation("item." + vehicleName + ".name"), driver.getDisplayName()});
	}
}
