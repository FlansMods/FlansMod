package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;

import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;

public class GametypeDM extends Gametype 
{
	public int scoreLimit = 25;
	public int newRoundTimer = 0;
	public int time;

	public GametypeDM() 
	{
		super("Deathmatch", "DM", 2);
	}

	@Override
	public void initGametype() 
	{
		startNewRound();
	}

	@Override
	public void teamsSet()
	{	
		startNewRound();
	}
	
	@Override
	public void startNewRound() 
	{
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

	@Override
	public void stopGametype() 
	{
		resetScores();
	}

	@Override
	public void tick() 
	{
		newRoundTimer--;
		if(newRoundTimer == 0)
		{
			if(TeamsManager.useRotation)
			{
				TeamsManager.getInstance().switchToNextGametype();
				return;
			}
			startNewRound();
		}
		if(teamsManager.teams != null)
		{
			for(Team team : teamsManager.teams)
			{
				if(team == null)
					continue;
				for(String name : team.members)
				{
					PlayerData data = PlayerHandler.getPlayerData(name);
					if(data.score >= scoreLimit && newRoundTimer < 0)
					{
						TeamsManager.messageAll(name + "\u00a7f won!");
						newRoundTimer = 200;
						TeamsManager.messageAll("\u00a7fThe next round will start in 10 seconds");
						time = -300;
					}
				}
			}
		}
		time++;
	}

	@Override
	public void playerJoined(EntityPlayerMP player) 
	{
		sendTeamsMenuToPlayer(player);
	}
	
	@Override
	public boolean playerChoseTeam(EntityPlayerMP player, Team team, Team previousTeam) 
	{
		//if(teamsManager.teams == null || teamsManager.teams[0] == null || teamsManager.teams[1] == null)
		//	return false;
		if(previousTeam != null && previousTeam != Team.spectators && previousTeam != team && isAValidTeam(previousTeam, true))
		{
			getPlayerData(player).deaths++;
			getPlayerData(player).score--;
			getPlayerData(player).playerClass = null;
			getPlayerData(player).newPlayerClass = null;
		}
		
		sendClassMenuToPlayer(player);
		if(team != previousTeam)
			teamsManager.forceRespawn(player);
		return true;
	}

	@Override
	public boolean playerChoseClass(EntityPlayerMP player, PlayerClass playerClass) 
	{
		Team team = getPlayerData(player).team;
		if(!team.classes.contains(playerClass))
			return false;
		getPlayerData(player).newPlayerClass = playerClass;
		if(getPlayerData(player).playerClass == null)
		{
			teamsManager.resetInventory(player);
		}
		else
		{
			player.addChatMessage(new ChatComponentText("You will respawn with the " + playerClass.name.toLowerCase() + " class")); 
		}
		return true;
	}

	@Override
	public void playerQuit(EntityPlayerMP player) 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public boolean playerAttacked(EntityPlayerMP player, DamageSource source) 
	{
		if(getPlayerData(player) == null || getPlayerData(player).team == null)
			return false;
		//Players may not fight between rounds
		if(newRoundTimer > 0)
		{
			return false;
		}
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
	public void baseAttacked(ITeamBase base, DamageSource source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void objectAttacked(ITeamObject object, DamageSource source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baseClickedByPlayer(ITeamBase base, EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vec3 getSpawnPoint(EntityPlayerMP player) 
	{
		List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
		PlayerData data = getPlayerData(player);
		if(data != null)
		{
			if(data.team == null)
			{
				
			}
			else if(data.team == Team.spectators)
			{
				for(int j = 0; j < data.team.bases.size(); j++)
				{
					ITeamBase base = data.team.bases.get(j);
					if(base.getMap() != teamsManager.currentMap)
						continue;
					for(int i = 0; i < base.getObjects().size(); i++)
					{
						if(base.getObjects().get(i).isSpawnPoint())
							validSpawnPoints.add(base.getObjects().get(i));
					}
				}
			}
			else
			{
				for(Team team : teamsManager.teams)
				{
					for(int j = 0; j < data.team.bases.size(); j++)
					{
						ITeamBase base = data.team.bases.get(j);
						if(base.getMap() != teamsManager.currentMap)
							continue;
						for(int i = 0; i < base.getObjects().size(); i++)
						{
							if(base.getObjects().get(i).isSpawnPoint())
								validSpawnPoints.add(base.getObjects().get(i));
						}
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
}
