package com.flansmod.common.guns;

import com.flansmod.common.PlayerHandler;
import com.flansmod.common.types.InfoType;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class EntityDamageSourceFlan extends EntityDamageSourceIndirect{
	
	private InfoType weapon;
	private EntityPlayer shooter;
	
	public EntityDamageSourceFlan(String s, Entity entity, EntityPlayer player, InfoType wep)
	{
		super(s, entity, player);
		weapon = wep;
		shooter = player;
	}
	
	@Override
	public ITextComponent getDeathMessage(EntityLivingBase living)
	{
		if(!(living instanceof EntityPlayer) || shooter == null || PlayerHandler.getPlayerData(shooter) == null)
		{
			return super.getDeathMessage(living);
		}

		return new TextComponentString("#flansmod");
	}
	
	public InfoType getWeapon()
	{
		return weapon;
	}
	
	public EntityPlayer getCausedPlayer()
	{
		return shooter;
	}
}
