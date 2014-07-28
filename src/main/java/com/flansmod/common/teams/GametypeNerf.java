package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;

import com.flansmod.common.PlayerData;
import com.flansmod.common.guns.EntityDamageSourceGun;

public class GametypeNerf extends Gametype {

	public boolean friendlyFire = false;
	public boolean autoBalance = true;
	public int scoreLimit = 25;
	public int newRoundTimer = 0;
	public int time;
	public int autoBalanceInterval = 1200;

	public GametypeNerf() 
	{
		super("Nerf Team Deathmatch", "Nerf", 2);
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
	public void stopGametype() 
	{
		super.stopGametype();
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
				if(team != null && team.score >= scoreLimit && newRoundTimer < 0)
				{
					TeamsManager.messageAll("\u00a7" + team.textColour + team.name + "\u00a7f won!");
					newRoundTimer = 200;
					TeamsManager.messageAll("\u00a7fThe next round will start in 10 seconds");
					time = -300;
				}
			}
		}
		time++;
		if(autoBalance && time % autoBalanceInterval == autoBalanceInterval - 200 && needAutobalance())
		{
			TeamsManager.messageAll("\u00a7fAutobalancing teams...");
		}
		if(autoBalance && time % autoBalanceInterval == 0 && needAutobalance())
		{
			autobalance();
		}
	}
	
	public boolean needAutobalance()
	{
		if(teamsManager.teams == null || teamsManager.teams[0] == null || teamsManager.teams[1] == null)
			return false;
		int membersTeamA = teamsManager.teams[0].members.size();
		int membersTeamB = teamsManager.teams[1].members.size();
		if(Math.abs(membersTeamA - membersTeamB) > 1)
			return true;
		return false;
	}
	
	public void autobalance()
	{
		if(teamsManager.teams == null || teamsManager.teams[0] == null || teamsManager.teams[1] == null)
			return;
		int membersTeamA = teamsManager.teams[0].members.size();
		int membersTeamB = teamsManager.teams[1].members.size();
		if(membersTeamA - membersTeamB > 1)
		{
			for(int i = 0; i < (membersTeamA - membersTeamB) / 2; i++)
			{
				//My goodness this is convoluted...
				sendClassMenuToPlayer(getPlayer(teamsManager.teams[1].addPlayer(teamsManager.teams[0].removeWorstPlayer())));
			}
		}
		if(membersTeamB - membersTeamA > 1)
		{
			for(int i = 0; i < (membersTeamB - membersTeamA) / 2; i++)
			{
				sendClassMenuToPlayer(getPlayer(teamsManager.teams[0].addPlayer(teamsManager.teams[1].removeWorstPlayer())));
			}
		}
	}

	@Override
	public void playerJoined(EntityPlayerMP player) 
	{
		sendTeamsMenuToPlayer(player);
	}
	
	@Override
	public boolean playerChoseTeam(EntityPlayerMP player, Team team, Team previousTeam) 
	{
		if(teamsManager.teams == null || teamsManager.teams[0] == null || teamsManager.teams[1] == null)
			return false;
		if(autoBalance)
		{
			int membersOnTeamTheyWantToJoin = team.members.size();
			int membersOnBothTeams = teamsManager.teams[0].members.size() + teamsManager.teams[1].members.size();
			int membersOnTeamTheyDontWantToJoin = membersOnBothTeams - membersOnTeamTheyWantToJoin;
			if(membersOnTeamTheyWantToJoin > membersOnTeamTheyDontWantToJoin)
				return false;
		}
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
	public void playerQuit(EntityPlayerMP player) {
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
		//If the player is out, they cannot take damage
		if(getPlayerData(player).out == true)
			return false;
		//Players may not attack spectators
		if(getPlayerData(player).team == Team.spectators)
			return false;
		EntityPlayerMP attacker = getPlayerFromDamageSource(source);
		if(attacker != null)
		{
			if(getPlayerData(attacker) == null || getPlayerData(attacker).team == null)
				return false;
			//Spectators may not attack players
			if(getPlayerData(attacker).team == Team.spectators)
				return false;
			//Check for friendly fire
			if(getPlayerData(player).team == getPlayerData(attacker).team && !friendlyFire)
				return false;
			//If the attacker is out, they cannot kill people
			if(getPlayerData(attacker).out == true)
				return false;
			//If they are using weapons and get a hit, then they get a point and that person is dead
			if(source instanceof EntityDamageSourceGun)
			{
				getPlayerData(player).out = true;
				givePoints(attacker, 1);
				getPlayerData(attacker).kills++;
				getPlayerData(player).deaths++;
				player.addChatMessage(new ChatComponentText("You are hit. Go back to base to respawn"));
				attacker.addChatMessage(new ChatComponentText("You hit " + player.getCommandSenderName() + ". They are out until they return to base"));
			}
		}
		return false;
	}

	@Override
	public void playerKilled(EntityPlayerMP player, DamageSource source) 
	{
		//Not possible
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
	public void baseClickedByPlayer(ITeamBase base, EntityPlayerMP player) 
	{
		if(getPlayerData(player).out)
		{
			getPlayerData(player).out = false;
			player.addChatMessage(new ChatComponentText("You are back in the game!"));
		}
	}

	@Override
	public void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player) 
	{
		if(getPlayerData(player).out)
		{
			getPlayerData(player).out = false;
			player.addChatMessage(new ChatComponentText("You are back in the game!"));
		}
	}

	@Override
	public Vec3 getSpawnPoint(EntityPlayerMP player) 
	{
		PlayerData data = getPlayerData(player);
		List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
		if(data.team == null)
			return null;
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

}
