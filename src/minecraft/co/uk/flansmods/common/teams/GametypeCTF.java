package co.uk.flansmods.common.teams;

import java.util.ArrayList;
import java.util.List;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerData;
import co.uk.flansmods.common.network.PacketTeamSelect;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.Vec3;

public class GametypeCTF extends Gametype 
{
	public boolean friendlyFire = false;
	public boolean autoBalance = true;
	public int scoreLimit = 5;
	public int newRoundTimer = 0;
	public int time;
	public int autoBalanceInterval = 1200;

	public GametypeCTF() 
	{
		super("Capture the Flag", "CTF", 2);
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
		teamsManager.messageAll("\u00a7fA new round has started!");
		//Check that all the required teams exist and then send out team selection menus
		if(teamsManager.teams != null)
		{
			for(Team team : teamsManager.teams)
			{
				if(team == null)
					return;
			}
			showTeamsMenuToAll(false);
		}
		//Reset all flags to their poles
		for(ITeamBase base : teamsManager.bases)
		{
			if(base.getMap() != null && base.getMap().shortName.equals(teamsManager.currentMap))
			{
				if(base.getFlag() != null)
					base.getFlag().onBaseSet(base.getOwner());
			}
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
			if(FlansMod.useRotation)
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
					teamsManager.messageAll("\u00a7" + team.textColour + team.name + "\u00a7f won!");
					newRoundTimer = 200;
					teamsManager.messageAll("\u00a7fThe next round will start in 10 seconds");
					time = -300;
				}
			}
		}
		time++;
		if(autoBalance && time % autoBalanceInterval == autoBalanceInterval - 200 && needAutobalance())
		{
			teamsManager.messageAll("\u00a7fAutobalancing teams...");
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
		
		sendClassMenuToPlayer((EntityPlayerMP)player);
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
			player.addChatMessage("You will respawn with the " + playerClass.name.toLowerCase() + " class"); 
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
		EntityPlayerMP attacker = getPlayerFromDamageSource(source);
		if(attacker != null)
		{
			if(getPlayerData(attacker) == null || getPlayerData(attacker).team == null)
				return false;
			//Spectators may not attack players
			if(getPlayerData(attacker).team == Team.spectators)
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
		
		for(Team team : teamsManager.teams)
		{
			for(ITeamBase base : team.bases)
			{
				ITeamObject obj = base.getFlag();
			}
		}
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
		if(object instanceof EntityFlag)
		{
			EntityFlag flag = (EntityFlag)object;
			if(flag.getBase().getOwner() != null && flag.getBase().getOwner() != Team.spectators)
			{
				Team team = getPlayerData(player).team;
				if(team != null && team != Team.spectators)
				{
					//If the player is clicking their own flag
					if(team == flag.getBase().getOwner())
					{
						if(flag.ridingEntity == null && !flag.isHome)
						{
							flag.reset();
							teamsManager.messageAll("\u00a7f" + player.username + " returned the \u00a7" + flag.getBase().getOwner().textColour + flag.getBase().getOwner().name + "\u00a7f flag");		
						}
						//If player has the other flag
						else if(player.riddenByEntity instanceof EntityFlag)
						{
							EntityFlag otherFlag = (EntityFlag)player.riddenByEntity;
							if(otherFlag.getBase().getOwner() != null && otherFlag.getBase().getOwner() != team && otherFlag.getBase().getOwner() != Team.spectators && flag.isHome && newRoundTimer <= 0)
							{
								team.score++;
								
								otherFlag.reset();
								teamsManager.messageAll("\u00a7f" + player.username + " captured the \u00a7" + otherFlag.getBase().getOwner().textColour + otherFlag.getBase().getOwner().name + "\u00a7f flag");
							}
						}
					}
					//If the player is clicking the other team flag
					else
					{
						if(flag.ridingEntity == player)
						{
							flag.mountEntity(null);
							teamsManager.messageAll("\u00a7f" + player.username + " dropped the \u00a7" + flag.getBase().getOwner().textColour + flag.getBase().getOwner().name + "\u00a7f flag");
						}
						else if(flag.ridingEntity == null)
						{
							flag.mountEntity(player);
							teamsManager.messageAll("\u00a7f" + player.username + " picked up the \u00a7" + flag.getBase().getOwner().textColour + flag.getBase().getOwner().name + "\u00a7f flag");
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
		FlansModPlayerData data = getPlayerData(player);
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
		scoreLimit = tags.getInteger("CTFScoreLimit");
		friendlyFire = tags.getBoolean("CTFFriendlyFire");
		autoBalance = tags.getBoolean("CTFAutoBalance");
	}

	@Override
	public void saveToNBT(NBTTagCompound tags) 
	{
		tags.setInteger("CTFScoreLimit", scoreLimit);
		tags.setBoolean("CTFFriendlyFire", friendlyFire);
		tags.setBoolean("CTFAutoBalance", autoBalance);
	}
	
	@Override
	public boolean sortScoreboardByTeam()
	{
		return true;
	}
}
