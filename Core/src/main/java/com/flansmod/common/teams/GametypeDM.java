package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import com.flansmod.common.PlayerData;

public class GametypeDM extends Gametype
{
	public int scoreLimit = 25;
	public int newRoundTimer = 0;
	public int time;
	
	public GametypeDM()
	{
		super("Free For All", "DM", 2);
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
			//Spectators may not attack players
			if(getPlayerData(attacker).team == Team.spectators)
				return false;
		}
		//Players may not attack spectators
		if(getPlayerData(player).team == Team.spectators)
			return false;
		return true;
	}
	
	@Override
	public void playerKilled(EntityPlayerMP player, DamageSource source)
	{
		EntityPlayerMP attacker = getPlayerFromDamageSource(source);
		if(attacker != null)
		{
			if(attacker == player)
				getPlayerData(player).score--;
			else
			{
				getPlayerData(attacker).score++;
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
		
		if(data.newTeam == Team.spectators)
		{
			teamsManager.currentRound.map.getValidSpawnPoints(teamsManager.currentRound.getTeamID(data.newTeam), validSpawnPoints);
		}
		else
		{
			for(int k = 2; k < 4; k++)
			{
				teamsManager.currentRound.map.getValidSpawnPoints(teamsManager.currentRound.getTeamID(data.newTeam), validSpawnPoints);
			}
		}
		
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
		return false;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tags)
	{
		scoreLimit = tags.getInteger("DMScoreLimit");
	}
	
	@Override
	public void saveToNBT(NBTTagCompound tags)
	{
		tags.setInteger("DMScoreLimit", scoreLimit);
	}
	
	
	@Override
	public boolean sortScoreboardByTeam()
	{
		return false;
	}
	
	public boolean shouldAutobalance()
	{
		return false;
	}
	
	@Override
	public boolean teamHasWon(Team team)
	{
		return false;
	}
}
