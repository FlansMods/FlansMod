package com.flansmod.common.eventhandlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityDamageSourceFlan;
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
		if (event.getEntity().world.isRemote)
			return;
		
		if (event.getSource() instanceof EntityDamageSourceFlan && event.getEntity() instanceof EntityPlayer)
		{
			EntityDamageSourceFlan source = (EntityDamageSourceFlan) event.getSource();
			EntityPlayer died = (EntityPlayer) event.getEntity();
			
			Team killedTeam = PlayerHandler.getPlayerData(died).team;
			Team killerTeam = PlayerHandler.getPlayerData(source.getCausedPlayer()).team;
			
			FlansMod.getPacketHandler().sendToDimension(new PacketKillMessage(source.isHeadshot(), source.getWeapon(), (killedTeam == null ? "f" : killedTeam.textColour) + died.getName(), (killerTeam == null ? "f" : killerTeam.textColour) + source.getCausedPlayer().getName()), died.dimension);
		}
	}
}
