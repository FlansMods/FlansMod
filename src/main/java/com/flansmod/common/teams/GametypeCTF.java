package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;

import com.flansmod.common.PlayerData;

public class GametypeCTF extends Gametype 
{
	public boolean friendlyFire = false;
	public boolean autoBalance = true;
	public int time;
	public int autoBalanceInterval = 1200;
	public int flagReturnTime = 60;

	public GametypeCTF() 
	{
		super("Capture the Flag", "CTF", 2);
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
	
	/*
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
	 */
	



	@Override
	public void playerQuit(EntityPlayerMP player) 
	{

	}
	
	@Override
	public boolean playerCanAttack(EntityPlayerMP attacker, Team attackerTeam, EntityPlayerMP victim, Team victimTeam) {
		return attackerTeam != victimTeam || friendlyFire;
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
	public void playerKilled(EntityPlayerMP player, DamageSource source) 
	{
		EntityPlayerMP attacker = getPlayerFromDamageSource(source);
		if(attacker != null)
		{
			//Killed self. Lose a point
			if(attacker == player)
				getPlayerData(player).score--;
			//Killed someone else. Get points
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
		
		if(player.riddenByEntity instanceof EntityFlag)
		{
			Team flagTeam = teamsManager.getTeam(((EntityFlag)player.riddenByEntity).getBase().getOwnerID());
			player.riddenByEntity.mountEntity(null);
			TeamsManager.messageAll("\u00a7f" + player.getCommandSenderName() + " dropped the \u00a7" + flagTeam.textColour + flagTeam.name + "\u00a7f flag");
		}
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
		if(base instanceof EntityFlagpole && ((EntityFlag)base.getFlag()).isHome)
			objectClickedByPlayer(base.getFlag(), player);
	}

	@Override
	public void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player)
	{
		if(teamsManager.currentRound == null)
			return;
		if(object instanceof EntityFlag)
		{
			EntityFlag flag = (EntityFlag)object;
			//Flag belongs to some team other than spectators
			if(flag.getBase().getOwnerID() > 1)
			{
				//Get the player's team and teamID
				Team playerTeam = getPlayerData(player).team;
				PlayerData playerData = getPlayerData(player);
				Team flagTeam = teamsManager.getTeam(flag.getBase().getOwnerID());
				
				//Make sure they are in the game and on the right map
				if(playerTeam != null && playerTeam != Team.spectators && flag.getBase().getMap() == teamsManager.currentRound.map)
				{
					//If the player is clicking their own flag
					if(playerTeam == flagTeam)
					{
						//They found it on the floor and are returning it
						if(flag.ridingEntity == null && !flag.isHome)
						{
							flag.reset();
							playerData.score += 2;
							TeamsManager.messageAll("\u00a7f" + player.getCommandSenderName() + " returned the \u00a7" + flagTeam.textColour + flagTeam.name + "\u00a7f flag");		
						}
						
						//TODO : Move to be a proximity thing?
						//They have another flag in hand
						else if(player.riddenByEntity instanceof EntityFlag)
						{
							//Get the other flag and its team
							EntityFlag otherFlag = (EntityFlag)player.riddenByEntity;
							Team otherFlagTeam = teamsManager.getTeam(otherFlag.getBase().getOwnerID());
							
							if(otherFlagTeam != null && otherFlagTeam != Team.spectators && otherFlagTeam != flagTeam && flag.isHome)
							{
								playerTeam.score++;
								playerData.score += 10;
								otherFlag.reset();
								TeamsManager.messageAll("\u00a7f" + player.getCommandSenderName() + " captured the \u00a7" + otherFlagTeam.textColour + otherFlagTeam.name + "\u00a7f flag");
							}
						}
					}
					//If the player is clicking the other team flag
					else
					{
						if(flag.ridingEntity == player)
						{
							flag.mountEntity(null);
							TeamsManager.messageAll("\u00a7f" + player.getCommandSenderName() + " dropped the \u00a7" + flagTeam.textColour + flagTeam.name + "\u00a7f flag");
						}
						else if(flag.ridingEntity == null)
						{
							if(flag.isHome)
								playerData.score += 3;
							flag.mountEntity(player);
							TeamsManager.messageAll("\u00a7f" + player.getCommandSenderName() + " picked up the \u00a7" + flagTeam.textColour + flagTeam.name + "\u00a7f flag");
							flag.isHome = false;
						}
						
					}
				}
			}
		}
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
		
		ArrayList<ITeamBase> bases = teamsManager.currentRound.map.getBasesPerTeam(teamsManager.currentRound.getTeamID(data.newTeam));
		for (ITeamBase base : bases) {
			if (base.getMap() != teamsManager.currentRound.map)
				continue;
			for (int i = 0; i < base.getObjects().size(); i++) {
				if (base.getObjects().get(i).isSpawnPoint())
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
		if(variable.toLowerCase().equals("flagtime"))
		{
			flagReturnTime = Integer.parseInt(value);
			return true;
		}
		return false;
	}

	@Override
	public void readFromNBT(NBTTagCompound tags) 
	{
		friendlyFire = tags.getBoolean("CTFFriendlyFire");
		autoBalance = tags.getBoolean("CTFAutoBalance");
		flagReturnTime = tags.getInteger("CTFFlagTime");
	}

	@Override
	public void saveToNBT(NBTTagCompound tags) 
	{
		tags.setBoolean("CTFFriendlyFire", friendlyFire);
		tags.setBoolean("CTFAutoBalance", autoBalance);
		tags.setInteger("CTFFlagTime", flagReturnTime);
	}
	
	@Override
	public boolean sortScoreboardByTeam()
	{
		return true;
	}
	
	@Override
	public boolean teamHasWon(Team team) 
	{
		return teamsManager.currentRound != null && team.score == teamsManager.currentRound.scoreLimit;
	}
}
