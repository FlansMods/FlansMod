package co.uk.flansmods.common.teams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import co.uk.flansmods.common.FlansModPlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;

public class GametypeConquest extends Gametype {
	
	public boolean friendlyFire = false;
	public boolean autoBalance = true;
	//public int scoreLimit = 50;
	public int newRoundTimer = 0;
	public int time;
	public int autoBalanceInterval = 1200;
	public int baseRange = 5;
	public int captureTimerLimit = 400;
	public HashMap<Integer, Integer> captureTimers = new HashMap<Integer, Integer>();

	public GametypeConquest() 
	{
		super("Conquest", "CON", 2);
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
		teamsManager.messageAll("\u00a7fA new round has started!");
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
			startNewRound();
		if(teamsManager.teams != null)
		{
			for(int i = 0; i < 2; i++)
			{
				Team team = teamsManager.teams[i];
				if(team != null && team.bases.size() == 0 && newRoundTimer < 0)
				{
					boolean teamHasPlayersAlive = false;
					for(String username : team.members)
					{
						EntityPlayer player = getPlayer(username);
						if(player != null && !player.isDead)
							teamHasPlayersAlive = true;
					}
					if(!teamHasPlayersAlive)
					{
						Team winners = teamsManager.teams[1 - i];
						teamsManager.messageAll("\u00a7" + winners.textColour + winners.name + "\u00a7f won!");
						newRoundTimer = 200;
						teamsManager.messageAll("\u00a7fThe next round will start in 10 seconds");
						time = -300;
					}

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
		for(ITeamBase base : teamsManager.bases)
		{
			Team baseTeam = base.getOwner();
			if(baseTeam == null || baseTeam == Team.spectators)
				continue;
			int captureTimer = captureTimers.containsKey(Integer.valueOf(base.getID())) ? captureTimers.get(Integer.valueOf(base.getID())) : 0;
			List playersNearBase = base.getWorld().getEntitiesWithinAABB(EntityPlayerMP.class, AxisAlignedBB.getBoundingBox(base.getPosX() - baseRange, base.getPosY() - baseRange, base.getPosZ() - baseRange, base.getPosX() + baseRange, base.getPosY() + baseRange, base.getPosZ() + baseRange));
			List<EntityPlayerMP> enemiesNearBase = new ArrayList<EntityPlayerMP>();
			for(Object obj : playersNearBase)
			{
				EntityPlayerMP player = (EntityPlayerMP)obj;
				if(getPlayerData(player) == null)
					continue;
				Team playerTeam = getPlayerData(player).team;
				if(playerTeam != baseTeam && playerTeam != Team.spectators && playerTeam != null && !player.isDead)
				{
					enemiesNearBase.add(player);
				}
				if(playerTeam == baseTeam)
				{
					enemiesNearBase = new ArrayList<EntityPlayerMP>();
					break;
				}
			}
			if(enemiesNearBase.size() == 0)
			{
				captureTimer = 0;
			}
			else captureTimer += enemiesNearBase.size();
			if(captureTimer >= captureTimerLimit)
			{
				Team newTeam = getPlayerData(enemiesNearBase.get(0)).team;
				base.captureBase(newTeam);
				for(ITeamObject object : base.getObjects())
				{
					object.onBaseCapture(newTeam);
				}
				for(EntityPlayerMP player : enemiesNearBase)
				{
					getPlayerData(player).score += 5;
				}
				captureTimer = 0;
			}
			
			captureTimers.put(Integer.valueOf(base.getID()), Integer.valueOf(captureTimer));
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
		//if(teamsManager.teams == null || teamsManager.teams[0] == null || teamsManager.teams[1] == null)
		//	return false;
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
			player.sendChatToPlayer("You will respawn with the " + playerClass.name.toLowerCase() + " class"); 
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
			//Spectators may not attack players
			if(getPlayerData(attacker).team == Team.spectators)
				return false;
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
			if(attacker == player)
				getPlayerData(player).score--;
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
		FlansModPlayerData data = getPlayerData(player);
		List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
		if(data.team == null)
			return null;
		for(ITeamBase base : data.team.bases)
		{
			for(ITeamObject object : base.getObjects())
			{
				if(object.isSpawnPoint())
					validSpawnPoints.add(object);
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
		if(variable.toLowerCase().equals("capturetime"))
		{
			captureTimerLimit = Integer.parseInt(value) * 20;
			if(captureTimerLimit <= 0)
				captureTimerLimit = 400;
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
		friendlyFire = tags.getBoolean("FriendlyFire");
		autoBalance = tags.getBoolean("AutoBalance");
		captureTimerLimit = tags.getInteger("CaptureTime");
		if(captureTimerLimit <= 0)
			captureTimerLimit = 400;
	}

	@Override
	public void saveToNBT(NBTTagCompound tags) 
	{
		tags.setBoolean("FriendlyFire", friendlyFire);
		tags.setBoolean("AutoBalance", autoBalance);
		tags.setInteger("CaptureTime", captureTimerLimit);
	}
	
	@Override
	public boolean sortScoreboardByTeam()
	{
		return true;
	}
}
