package com.flansmod.common.eventhandlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.teams.Team;

public class PlayerDeathEventListener
{
	public PlayerDeathEventListener()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@EventHandler
	@SubscribeEvent
	public void PlayerDied(LivingDeathEvent event)
	{
		if((event.getSource().getDamageType().equalsIgnoreCase("explosion") &&
				((event.getSource().getTrueSource() instanceof EntityGrenade) || (event.getSource().getTrueSource() instanceof EntityBullet)))
				&& event.getEntityLiving() instanceof EntityPlayer)
		{
			boolean isGrenade;
			if(event.getSource().getTrueSource() instanceof EntityGrenade)
			{
				isGrenade = true;
				EntityGrenade Grenade = (EntityGrenade)event.getSource().getTrueSource();
			}
			else
			{
				isGrenade = false;
				EntityBullet Grenade = (EntityBullet)event.getSource().getTrueSource();
			}
			EntityPlayer killer = null;
			EntityPlayer killed = (EntityPlayer)event.getEntityLiving();
			Team killerTeam = null;
			Team killedTeam = null;
			if(isGrenade)
			{
				killer = (EntityPlayer)((EntityGrenade)event.getSource().getTrueSource()).thrower;
			}
			else
			{
				killer = (EntityPlayer)((EntityBullet)event.getSource().getTrueSource()).owner;
			}
			killerTeam = PlayerHandler.getPlayerData(killer).team;
			killedTeam = PlayerHandler.getPlayerData(killed).team;
			if(event.getEntityLiving() instanceof EntityPlayer && !isGrenade)
			{
				FlansMod.getPacketHandler().sendToDimension(
						new PacketKillMessage(false, ((EntityBullet)event.getSource().getTrueSource()).type,
								(killedTeam == null ? "f" : killedTeam.textColour) + event.getEntity().getDisplayName().getFormattedText(),
								(killerTeam == null ? "f" : killedTeam.textColour) + event.getSource().getTrueSource().getDisplayName().getFormattedText()),
						event.getEntityLiving().dimension);
			}
			if(event.getEntityLiving() instanceof EntityPlayer && isGrenade)
			{
				FlansMod.getPacketHandler().sendToDimension(
						new PacketKillMessage(false, ((EntityGrenade)event.getSource().getTrueSource()).type,
								(killedTeam == null ? "f" : killedTeam.textColour) + event.getEntity().getDisplayName().getFormattedText(),
								(killerTeam == null ? "f" : killedTeam.textColour) + event.getSource().getTrueSource().getDisplayName().getFormattedText()),
						event.getEntityLiving().dimension);
			}
		}
	}
}
