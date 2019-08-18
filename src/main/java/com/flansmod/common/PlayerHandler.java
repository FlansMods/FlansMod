package com.flansmod.common;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityDamageSourceGun;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.network.PacketRequestDebug;
import com.flansmod.common.teams.TeamsManager;

public class PlayerHandler
{
	public static Map<String, PlayerData> serverSideData = new HashMap<>();
	public static Map<String, PlayerData> clientSideData = new HashMap<>();
	public static ArrayList<String> clientsToRemoveAfterThisRound = new ArrayList<>();
	public static Field floatingTickCount = null;
	
	public PlayerHandler()
	{
		MinecraftForge.EVENT_BUS.register(this);
		
		try
		{
			floatingTickCount = ReflectionHelper.findField(NetHandlerPlayServer.class, "floatingTickCount", "field_147365_f");
		}
		catch(Exception e)
		{
			FlansMod.log.error("Couldn't find floatingTickCount field.", e);
		}
	}
	
	@SubscribeEvent
	public void onEntityHurt(LivingAttackEvent event)
	{
		EntityLivingBase entity = event.getEntityLiving();
		if(event instanceof LivingAttackEvent && (entity.getRidingEntity() instanceof EntityDriveable || entity.getRidingEntity() instanceof EntitySeat))
		{
			//TODO Set Drivable damage
			event.setCanceled(true);
		}
	}

	@SubscribeEvent
	public void onLivingHurtEvent(LivingHurtEvent event)
	{
		float damage = event.ammount;
		if(damage > 0 && event.source instanceof EntityDamageSourceGun)
		{
			EntityDamageSourceGun source = (EntityDamageSourceGun)event.source;
			
			ShootableType shootableType = null;
			Entity damageSouceEntity = source.getDamageSourceEntity();
			if(damageSouceEntity instanceof EntityBullet)
			{
				shootableType = ((EntityBullet)damageSouceEntity).type;
			}
			if(damageSouceEntity instanceof EntityGrenade)
			{
				shootableType = ((EntityGrenade)damageSouceEntity).type;
			}
			if(shootableType!=null && shootableType.ignoreArmorProbability > 0 && rand.nextFloat() < shootableType.ignoreArmorProbability)
			{
				EntityLivingBase entity = event.entityLiving;
				float f1 = damage;
				damage = Math.max(damage - entity.getAbsorptionAmount(), 0.0F);
				entity.setAbsorptionAmount(entity.getAbsorptionAmount() - (f1 - damage));
				
				damage *= shootableType.ignoreArmorDamageFactor;

				if (damage != 0.0F)
				{
					float health = entity.getHealth();
					entity.setHealth(health - damage);
					entity.func_110142_aN().func_94547_a(source, health, damage);
					entity.setAbsorptionAmount(entity.getAbsorptionAmount() - damage);
					
//					FlansMod.log("Ignore armor damage = " + damage);
				}

				event.setCanceled(true);
			}
		}
	}
	
	@SubscribeEvent
	public void onEntityKilled(LivingDeathEvent event)
	{
		EntityLivingBase entity = event.getEntityLiving();
		if(entity instanceof EntityPlayer)
		{
			getPlayerData((EntityPlayer)entity).playerKilled();
		}
	}
	
	public void serverTick()
	{
		if(FMLCommonHandler.instance().getMinecraftServerInstance() == null)
		{
			FlansMod.log.warn("Receiving server ticks when server is null");
			return;
		}
		for(WorldServer world : FMLCommonHandler.instance().getMinecraftServerInstance().worlds)
		{
			for(Object player : world.playerEntities)
			{
				getPlayerData((EntityPlayer)player).tick((EntityPlayer)player);
			}
		}
	}
	
	public void clientTick()
	{
		if(Minecraft.getMinecraft().world != null)
		{
			for(Object player : Minecraft.getMinecraft().world.playerEntities)
			{
				getPlayerData((EntityPlayer)player).tick((EntityPlayer)player);
			}
		}
	}
	
	public static PlayerData getPlayerData(EntityPlayer player)
	{
		if(player == null)
			return null;
		return getPlayerData(player.getName(), player.world.isRemote ? Side.CLIENT : Side.SERVER);
	}
	
	public static PlayerData getPlayerData(String username)
	{
		return getPlayerData(username, Side.SERVER);
	}
	
	public static PlayerData getPlayerData(EntityPlayer player, Side side)
	{
		if(player == null)
			return null;
		return getPlayerData(player.getName(), side);
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
		// TODO FM+
			if(event.player instanceof EntityPlayerMP)
			{
				FlansMod.packetHandler.sendTo(new PacketRequestDebug(false), (EntityPlayerMP)event.player);
			}
			
			EntityPlayer player = event.player;
			String username = player.getName();
			
			PlayerData data = new PlayerData(username);
			data.ReadFromFile();
			
			if(!serverSideData.containsKey(username))
				serverSideData.put(username, data);
			clientsToRemoveAfterThisRound.remove(username);
		}
		else if(event instanceof PlayerLoggedOutEvent)
		{
			EntityPlayer player = event.player;
			String username = player.getName();
			
			clientsToRemoveAfterThisRound.add(username);
			
			if(TeamsManager.getInstance().currentRound == null)
			{
				roundEnded();
			}
		}
		else if(event instanceof PlayerRespawnEvent)
		{
			EntityPlayer player = event.player;
			String username = player.getName();
			if(!serverSideData.containsKey(username))
				serverSideData.put(username, new PlayerData(username));
		}
	}
	
	/**
	 * Called by teams manager to remove lingering player data
	 */
	public static void roundEnded()
	{
		for(String username : clientsToRemoveAfterThisRound)
		{
			PlayerData data = serverSideData.get(username);
			if(data != null)
			{
				data.WriteToFile();
			}
			serverSideData.remove(username);
		}
	}
}
