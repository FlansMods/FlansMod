package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;

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
	public Vec3 getSpawnPoint(EntityPlayerMP player) 
	{
		if(teamsManager.currentRound == null)
			return null;
		PlayerData data = getPlayerData(player);
		List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
		if(data.newTeam == null)
			return null;
		
		//Check each team's spawnpoints
		if(data.newTeam == Team.spectators)
		{
			ArrayList<ITeamBase> bases = teamsManager.currentRound.map.getBasesPerTeam(teamsManager.currentRound.getTeamID(data.newTeam));
			for (ITeamBase base : bases) {
				if (base.getMap() != teamsManager.currentRound.map)
					continue;
				for (int i = 0; i < base.getObjects().size(); i++) {
					if (base.getObjects().get(i).isSpawnPoint())
						validSpawnPoints.add(base.getObjects().get(i));
				}
			}
		}
		else
		{
			for(int k = 2; k < 4; k++)
			{
				ArrayList<ITeamBase> bases = teamsManager.currentRound.map.getBasesPerTeam(k);
				for (ITeamBase base : bases) {
					if (base.getMap() != teamsManager.currentRound.map)
						continue;
					for (int i = 0; i < base.getObjects().size(); i++) {
						if (base.getObjects().get(i).isSpawnPoint())
							validSpawnPoints.add(base.getObjects().get(i));
					}
				}
			}
		}
		if(validSpawnPoints.size() > 0)
		{
			ITeamObject spawnPoint = validSpawnPoints.get(rand.nextInt(validSpawnPoints.size()));
			return Vec3.createVectorHelper(spawnPoint.getPosX(), spawnPoint.getPosY(), spawnPoint.getPosZ());
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
