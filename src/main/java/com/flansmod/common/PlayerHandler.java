package com.flansmod.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.relauncher.Side;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.teams.TeamsManager;

public class PlayerHandler
{
	public static Map<String, PlayerData> serverSideData = new HashMap<String, PlayerData>();
	public static Map<String, PlayerData> clientSideData = new HashMap<String, PlayerData>();
	public static ArrayList<String> clientsToRemoveAfterThisRound = new ArrayList<String>();
	
	public PlayerHandler()
	{
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this); 
	}

	@SubscribeEvent
	public void onEntityHurt(LivingAttackEvent event)
	{
		EntityLivingBase entity = event.entityLiving;
		if(event instanceof LivingAttackEvent && (entity.ridingEntity instanceof EntityDriveable || entity.ridingEntity instanceof EntitySeat))
		{
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void onEntityKilled(LivingDeathEvent event) 
	{
		EntityLivingBase entity = event.entityLiving;
		if(entity instanceof EntityPlayer)
		{
			getPlayerData((EntityPlayer)entity).playerKilled();
		}
	}
		
	public void serverTick()
	{
		for(WorldServer world : MinecraftServer.getServer().worldServers)
		{
			for(Object player : world.playerEntities)
			{
				getPlayerData((EntityPlayer)player).tick((EntityPlayer)player);
			}
		}
	}
	
	public void clientTick()
	{
		if(Minecraft.getMinecraft().theWorld != null)
		{
			for(Object player : Minecraft.getMinecraft().theWorld.playerEntities)
			{
				getPlayerData((EntityPlayer)player).tick((EntityPlayer)player);
			}	
		}
	}
	
	public static PlayerData getPlayerData(EntityPlayer player)
	{
		if(player == null)
			return null;
		return getPlayerData(player.getCommandSenderName(), player.worldObj.isRemote ? Side.CLIENT : Side.SERVER);
	}
	
	public static PlayerData getPlayerData(String username)
	{
		return getPlayerData(username, Side.SERVER);
	}

	public static PlayerData getPlayerData(EntityPlayer player, Side side)
	{
		if(player == null)
			return null;
		return getPlayerData(player.getCommandSenderName(), side);
	}
	
	public static PlayerData getPlayerData(String username, Side side)
	{
		if(side.isClient())
		{
			if(!clientSideData.containsKey(username))
				clientSideData.put(username, new PlayerData(username));
		}
		else
		{
			if(!serverSideData.containsKey(username))
				serverSideData.put(username, new PlayerData(username));
		}
		return side.isClient() ? clientSideData.get(username) : serverSideData.get(username);
	}

	@SubscribeEvent
	public void onPlayerEvent(PlayerEvent event) 
	{
		if(event instanceof PlayerLoggedInEvent)
		{
			EntityPlayer player = event.player;
			String username = player.getCommandSenderName();
			if(!serverSideData.containsKey(username))
				serverSideData.put(username, new PlayerData(username));
			if(clientsToRemoveAfterThisRound.contains(username))
				clientsToRemoveAfterThisRound.remove(username);
		}
		else if(event instanceof PlayerLoggedOutEvent)
		{
			EntityPlayer player = event.player;
			String username = player.getCommandSenderName();
			if(TeamsManager.getInstance().currentRound == null)
				serverSideData.remove(username);
			else clientsToRemoveAfterThisRound.add(username);
		}
		else if(event instanceof PlayerRespawnEvent)
		{
			EntityPlayer player = event.player;
			String username = player.getCommandSenderName();
			if(!serverSideData.containsKey(username))
				serverSideData.put(username, new PlayerData(username));
		}
	}
	
	/** Called by teams manager to remove lingering player data */
	public static void roundEnded()
	{
		for(String username : clientsToRemoveAfterThisRound)
		{
			serverSideData.remove(username);
		}
	}
}
