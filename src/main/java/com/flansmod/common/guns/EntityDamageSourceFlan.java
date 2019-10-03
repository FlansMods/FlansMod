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
	private boolean headshot;
	/**
	 * @param s        Name of the damage source (Usually the shortName of the gun)
	 * @param entity   The Entity causing the damage (e.g. Grenade). Can be the same as 'player'
	 * @param player   The Player responsible for the damage
	 * @param wep      The InfoType of weapon used
	 */	
	public EntityDamageSourceFlan(String s, Entity entity, EntityPlayer player, InfoType wep)
	{
		this(s, entity, player, wep, false);
	}
	
	/**
	 * @param s        Name of the damage source (Usually the shortName of the gun)
	 * @param entity   The Entity causing the damage (e.g. Grenade). Can be the same as 'player'
	 * @param player   The Player responsible for the damage
	 * @param wep      The InfoType of weapon used
	 * @param headshot True if this was a headshot, false if not
	 */
	public EntityDamageSourceFlan(String s, Entity entity, EntityPlayer player, InfoType wep, boolean headshot)
	{
		super(s, entity, player);
		weapon = wep;
		shooter = player;
		this.headshot = headshot;
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
	
	/**
	 * @return The weapon (InfoType) used to cause this damage
	 */
	public InfoType getWeapon()
	{
		return weapon;
	}
	
	/**
	 * @return The Player responsible for this damage
	 */
	public EntityPlayer getCausedPlayer()
	{
		return shooter;
	}
	
	/**
	 * @return True if this is a headshot, false if not
	 */
	public boolean isHeadshot()
	{
		return headshot;
	}
}
