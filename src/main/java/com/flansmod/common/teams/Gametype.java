package com.flansmod.common.teams;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.Vec3;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.types.InfoType;

public abstract class Gametype 
{
	public static HashMap<String, Gametype> gametypes = new HashMap<String, Gametype>();
	public static TeamsManager teamsManager = TeamsManager.getInstance();
	public static Random rand = new Random();
	
	public static Gametype getGametype(String type)
	{
		return gametypes.get(type);
	}
	
	public String name;
	public String shortName;
	public int numTeamsRequired;
	
	public Gametype(String s, String s1, int numTeams)
	{
		name = s;
		shortName = s1;
		numTeamsRequired = numTeams;
		gametypes.put(shortName, this);
	}
	
	/** Called when a round starts */
	public abstract void roundStart();
	
	/** Called when a round ends. (The point at which scoreboards are displayed) */
	public abstract void roundEnd();
	
	/** Called when the scoreboards and voting are finished */
	public abstract void roundCleanup();
	
	public abstract boolean teamHasWon(Team team);
	
	public void tick() {}
	
	public Team[] getTeamsCanSpawnAs(TeamsRound currentRound, EntityPlayer player)
	{
		return currentRound.teams;
	}
	
	public void playerJoined(EntityPlayerMP player) {}
	
	public void playerRespawned(EntityPlayerMP player) {}
	
	public void playerQuit(EntityPlayerMP player) {}
		
	//Return true if damage should be dealt.
	public boolean playerAttacked(EntityPlayerMP player, DamageSource source) { return true; }
	
	public void playerKilled(EntityPlayerMP player, DamageSource source) {}
	
	public void baseAttacked(ITeamBase base, DamageSource source) {}
	
	public void objectAttacked(ITeamObject object, DamageSource source) {}

	public void baseClickedByPlayer(ITeamBase base, EntityPlayerMP player) {}
	
	public void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player) {}
	
	public boolean playerCanLoot(ItemStack stack, InfoType infoType, EntityPlayer player, Team playerTeam) { return true; }
	
	public abstract Vec3 getSpawnPoint(EntityPlayerMP player);
	
	//Return whether or not the variable exists
	public boolean setVariable(String variable, String value) { return false; }
	
	public abstract void readFromNBT(NBTTagCompound tags);
	
	public abstract void saveToNBT(NBTTagCompound tags);
	
	public boolean sortScoreboardByTeam() { return true; }
	
	public boolean showZombieScore() { return false; }

	/** Whether "attacker" can attack "victim" */
	public boolean playerCanAttack(EntityPlayerMP attacker, Team attackerTeam, EntityPlayerMP victim, Team victimTeam) { return true; }

	/** Called when any entity is killed. This allows one to track mob deaths too */
	public void entityKilled(Entity entity, DamageSource source) {}

	public void playerChoseTeam(EntityPlayerMP player, Team team, Team newTeam) {}
		
	public void playerChoseNewClass(EntityPlayerMP player, PlayerClass playerClass) {}
	
	public void playerDefected(EntityPlayerMP player, Team team, Team newTeam) {}
	
	public void playerEnteredTheGame(EntityPlayerMP player, Team team, PlayerClass playerClass) {}
	
	//--------------------------------------
	// Helper methods - Do not override
	//--------------------------------------
	
	public EntityPlayerMP getPlayer(String username)
	{
		return MinecraftServer.getServer().getConfigurationManager().func_152612_a(username);
	}
	
	public static PlayerData getPlayerData(EntityPlayerMP player)
	{
		return PlayerHandler.getPlayerData(player);
	}
	
	public static void sendPacketToPlayer(PacketBase packet, EntityPlayerMP player)
	{
		FlansMod.getPacketHandler().sendTo(packet, player);
	}
		
	public static String[] getPlayerNames()
	{
		return MinecraftServer.getServer().getAllUsernames();
	}
	
	public static List<EntityPlayer> getPlayers()
	{
		return MinecraftServer.getServer().getConfigurationManager().playerEntityList;
	}
						
	public static void givePoints(EntityPlayerMP player, int points)
	{
		PlayerData data = getPlayerData(player);
		data.score += points;
		if(data.team != null)
			data.team.score += points;
	}
	
	public static EntityPlayerMP getPlayerFromDamageSource(DamageSource source)
	{
		EntityPlayerMP attacker = null;
		if(source instanceof EntityDamageSource)
		{
			if(source.getEntity() instanceof EntityPlayerMP)
				attacker = (EntityPlayerMP) source.getEntity();
		}
		if(source instanceof EntityDamageSourceIndirect)
		{
			if(source.getSourceOfDamage() instanceof EntityPlayerMP)
				attacker = (EntityPlayerMP) source.getSourceOfDamage();
		}
		return attacker;
	}
	
	public boolean shouldAutobalance() { return true; }
}
