package co.uk.flansmods.common.teams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.Vec3;
import co.uk.flansmods.common.FlansModPlayerData;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.network.PacketTeamSelect;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

public abstract class Gametype {
	
	public static List<Gametype> gametypes = new ArrayList<Gametype>();
	public static TeamsManager teamsManager = TeamsManager.getInstance();
	public static Random rand = new Random();
	
	public static Gametype getGametype(String type)
	{
		for(Gametype gametype : gametypes)
		{
			if(gametype.shortName.equals(type))
				return gametype;
		}
		return null;
	}
	
	public String name;
	public String shortName;
	public int numTeamsRequired;
	
	public Gametype(String s, String s1, int numTeams)
	{
		name = s;
		shortName = s1;
		numTeamsRequired = numTeams;
		gametypes.add(this);
	}
	
	public EntityPlayerMP getPlayer(String username)
	{
		return MinecraftServer.getServerConfigurationManager(FMLCommonHandler.instance().getMinecraftServerInstance()).getPlayerForUsername(username);
	}
	
	public static FlansModPlayerData getPlayerData(EntityPlayerMP player)
	{
		return FlansModPlayerHandler.getPlayerData(player);
	}
	
	public static void sendPacketToPlayer(Packet packet, EntityPlayerMP player)
	{
		PacketDispatcher.sendPacketToPlayer(packet, (Player)player);
	}
	
	public static void sendTeamsMenuToPlayer(EntityPlayerMP player)
	{
		if(teamsManager.teams == null)
			return;
		Team[] availableTeams = new Team[teamsManager.teams.length + 1];
		for(int i = 0; i < teamsManager.teams.length; i++)
		{
			availableTeams[i] = teamsManager.teams[i];
		}
		availableTeams[teamsManager.teams.length] = Team.spectators;
		
		getPlayerData(player).team = Team.spectators;
		sendPacketToPlayer(PacketTeamSelect.buildTeamChoicesPacket(availableTeams), player);
	}
	
	public static void sendClassMenuToPlayer(EntityPlayerMP player)
	{
		Team team = getPlayerData(player).team;
		if(team == null)
			sendTeamsMenuToPlayer(player);
		else if(team != Team.spectators && team.classes.size() > 0)
		{
			sendPacketToPlayer(PacketTeamSelect.buildClassChoicesPacket(team.classes.toArray(new PlayerClass[team.classes.size()])), player);
		}
	}
	
	public static String[] getPlayerNames()
	{
		return MinecraftServer.getServer().getAllUsernames();
	}
	
	public static List<EntityPlayer> getPlayers()
	{
		return MinecraftServer.getServer().getConfigurationManager().playerEntityList;
	}
	
	public static void showTeamsMenuToAll(boolean spectatorsValid)
	{
		for(EntityPlayer player : getPlayers())
		{
			if(getPlayerData((EntityPlayerMP)player) == null)
			{
				continue;
			}
			if(getPlayerData((EntityPlayerMP)player).team == null || !isAValidTeam(getPlayerData((EntityPlayerMP)player).team, spectatorsValid))
			{
				sendTeamsMenuToPlayer((EntityPlayerMP)player);
			}			
			else if(getPlayerData((EntityPlayerMP)player).playerClass == null)
			{
				sendClassMenuToPlayer((EntityPlayerMP)player);
			}
		}
	}
	
	public static boolean isAValidTeam(Team team, boolean spectatorsValid)
	{
		if(teamsManager.teams == null)
			return false;
		if(team == Team.spectators && spectatorsValid)
			return true;
		for(Team t : teamsManager.teams)
		{
			if(t == team)
				return true;
		}
		return false;
	}
	
	public static void resetScores()
	{
		if(teamsManager.teams != null)
			for(Team team : teamsManager.teams)
				if(team != null)
					team.score = 0;
		for(EntityPlayer player : getPlayers())
		{
			getPlayerData((EntityPlayerMP)player).resetScore();
		}
	}
	
	public static void respawnAll()
	{
		for(EntityPlayer player : getPlayers())
		{
			TeamsManager.getInstance().forceRespawn((EntityPlayerMP)player);
		}
	}
	
	public static void givePoints(EntityPlayerMP player, int points)
	{
		FlansModPlayerData data = getPlayerData(player);
		data.score += points;
		if(data.team != null)
			data.team.score += points;
	}
	
	public static EntityPlayerMP getPlayerFromDamageSource(DamageSource source)
	{
		EntityPlayerMP attacker = null;
		if(source instanceof EntityDamageSource)
		{
			if(((EntityDamageSource)source).getEntity() instanceof EntityPlayerMP)
				attacker = (EntityPlayerMP)((EntityDamageSource)source).getEntity();
		}
		if(source instanceof EntityDamageSourceIndirect)
		{
			if(((EntityDamageSourceIndirect)source).getSourceOfDamage() instanceof EntityPlayerMP)
				attacker = (EntityPlayerMP)((EntityDamageSourceIndirect)source).getSourceOfDamage(); 
		}
		return attacker;
	}

	public abstract void teamsSet();
	
	public abstract void initGametype();
	
	public void startNewRound()
	{
		FlansModPlayerHandler.roundEnded();
		for(ITeamBase base : teamsManager.bases)
		{
			base.startRound();
		}
		respawnAll();
		for(EntityPlayer player : getPlayers())
		{
			getPlayerData((EntityPlayerMP)player).newPlayerClass = getPlayerData((EntityPlayerMP)player).playerClass = null;
			if(getPlayerData((EntityPlayerMP)player).team != null)
				getPlayerData((EntityPlayerMP)player).team.removePlayer(player);
		}
		resetScores();
		TeamsManager.messageAll("\u00a7fA new round has started!");
		if(teamsManager.teams != null)
		{
			for(Team team : teamsManager.teams)
				if(team == null)
					return;
			showTeamsMenuToAll(false);
		}
	}
	
	public void stopGametype()
	{
		FlansModPlayerHandler.roundEnded();
	}
	
	public abstract void tick();
	
	public abstract void playerJoined(EntityPlayerMP player);
	
	public abstract void playerRespawned(EntityPlayerMP player);
	
	public abstract void playerQuit(EntityPlayerMP player);
	
	//Return false if the player may not choose that team
	public abstract boolean playerChoseTeam(EntityPlayerMP player, Team team, Team previousTeam);
	
	//Return false if the player may not choose that class
	public abstract boolean playerChoseClass(EntityPlayerMP player, PlayerClass playerClass);
	
	//Return true if damage should be dealt.
	public abstract boolean playerAttacked(EntityPlayerMP player, DamageSource source);
	
	public abstract void playerKilled(EntityPlayerMP player, DamageSource source);
	
	public abstract void baseAttacked(ITeamBase base, DamageSource source);
	
	public abstract void objectAttacked(ITeamObject object, DamageSource source);

	public abstract void baseClickedByPlayer(ITeamBase base, EntityPlayerMP player);
	
	public abstract void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player);
	
	public abstract Vec3 getSpawnPoint(EntityPlayerMP player);
	
	//Return whether or not the variable exists
	public abstract boolean setVariable(String variable, String value);
	
	public abstract void readFromNBT(NBTTagCompound tags);
	
	public abstract void saveToNBT(NBTTagCompound tags);
	
	public abstract boolean sortScoreboardByTeam();
}
