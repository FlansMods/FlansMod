package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import com.flansmod.common.PlayerData;

public class GametypeTDM extends Gametype
{
	public boolean friendlyFire = false;
	public boolean autoBalance = true;
	public int scoreLimit = 25;
	public int newRoundTimer = 0;
	public int time;
	public int autoBalanceInterval = 1200;
	
	public GametypeTDM()
	{
		super("Team Deathmatch", "TDM", 2);
	}
	
	@Override
	public void roundStart()
	{
		
	}
	
	@Override
	public void roundEnd()
	{
		
	}
	
	@Override
	public void roundCleanup()
	{
		
	}
	
	@Override
	public void tick()
	{
	}
	
	@Override
	public void playerJoined(EntityPlayerMP player)
	{
	}
	
	@Override
	public void playerQuit(EntityPlayerMP player)
	{
	}
	
	@Override
	public boolean playerAttacked(EntityPlayerMP player, DamageSource source)
	{
		if(getPlayerData(player) == null || getPlayerData(player).team == null)
			return false;
		EntityPlayerMP attacker = getPlayerFromDamageSource(source);
		if(attacker != null)
		{
			if(getPlayerData(attacker) == null || getPlayerData(attacker).team == null)
				return false;
			//Check for friendly fire
			if(getPlayerData(player).team == getPlayerData(attacker).team)
				return friendlyFire;
		}
		//Players may not attack spectators
		if(getPlayerData(player).team == Team.spectators)
			return false;
		return true;
	}
	
	@Override
	public boolean playerCanAttack(EntityPlayerMP attacker, Team attackerTeam, EntityPlayerMP victim, Team victimTeam)
	{
		return attackerTeam != victimTeam || friendlyFire;
	}
	
	@Override
	public void playerKilled(EntityPlayerMP player, DamageSource source)
	{
		EntityPlayerMP attacker = getPlayerFromDamageSource(source);
		if(attacker != null)
		{
			//They killed themself. -1 point.
			if(attacker == player)
				getPlayerData(player).score--;
				//They teamkilled. -1 point.
			else if(getPlayerData(attacker).team == getPlayerData(player).team)
			{
				getPlayerData(attacker).score--;
			}
			//They killed an enemy. +1 point to them and their team
			else
			{
				givePoints(attacker, 1);
				getPlayerData(attacker).kills++;
			}
		}
		else
		{
			getPlayerData(player).score--;
		}
		getPlayerData(player).deaths++;
	}
	
	@Override
	public void baseAttacked(ITeamBase base, DamageSource source)
	{
	
	}
	
	@Override
	public void objectAttacked(ITeamObject object, DamageSource source)
	{
	
	}
	
	@Override
	public void baseClickedByPlayer(ITeamBase base, EntityPlayerMP player)
	{
	
	}
	
	@Override
	public void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player)
	{
	
	}
	
	@Override
	public Vec3d getSpawnPoint(EntityPlayerMP player)
	{
		if(teamsManager.currentRound == null)
			return null;
		PlayerData data = getPlayerData(player);
		List<BlockPos> validSpawnPoints = new ArrayList<>();
		if(data.newTeam == null)
			return null;
		
		teamsManager.currentRound.map.getValidSpawnPoints(teamsManager.currentRound.getTeamID(data.newTeam), validSpawnPoints);
		
		if(validSpawnPoints.size() > 0)
		{
			BlockPos spawnPoint = validSpawnPoints.get(rand.nextInt(validSpawnPoints.size()));
			return new Vec3d(spawnPoint.getX() + 0.5D, spawnPoint.getY(), spawnPoint.getZ() + 0.5D);
		}
		
		return null;
	}
	
	@Override
	public void playerRespawned(EntityPlayerMP player)
	{
		
	}
	
	@Override
	public boolean setVariable(String variable, String value)
	{
		if(variable.toLowerCase().equals("scorelimit"))
		{
			scoreLimit = Integer.parseInt(value);
			return true;
		}
		if(variable.toLowerCase().equals("friendlyfire"))
		{
			friendlyFire = Boolean.parseBoolean(value);
			return true;
		}
		if(variable.toLowerCase().equals("autobalance"))
		{
			autoBalance = Boolean.parseBoolean(value);
			return true;
		}
		return false;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tags)
	{
		scoreLimit = tags.getInteger("TDMScoreLimit");
		friendlyFire = tags.getBoolean("TDMFriendlyFire");
		autoBalance = tags.getBoolean("TDMAutoBalance");
	}
	
	@Override
	public void saveToNBT(NBTTagCompound tags)
	{
		tags.setInteger("TDMScoreLimit", scoreLimit);
		tags.setBoolean("TDMFriendlyFire", friendlyFire);
		tags.setBoolean("TDMAutoBalance", autoBalance);
	}
	
	@Override
	public boolean sortScoreboardByTeam()
	{
		return true;
	}
	
	@Override
	public boolean teamHasWon(Team team)
	{
		return teamsManager.currentRound != null && team != null && team.score == teamsManager.currentRound.scoreLimit;
	}
}
