package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.common.PlayerData;
import com.flansmod.common.types.InfoType;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;

public class GametypeZombies extends Gametype 
{
	public boolean friendlyFire = false;
	public int humanPrepTime = 30 * 20;
	
	public GametypeZombies() 
	{
		super("Zombies", "ZOM", 2);
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
		//Human prep time nearly over
		if(teamsManager.roundTimeLeft + humanPrepTime - 200 == teamsManager.currentRound.timeLimit * 20 * 60)
		{
			teamsManager.messageAll("\u00a7cThe \u00a74zombies \u00a7care upon us! 10 seconds to \u00a74infection\u00a7c!");
		}
		
		//Human prep time over
		if(teamsManager.roundTimeLeft + humanPrepTime == teamsManager.currentRound.timeLimit * 20 * 60)
		{
			teamsManager.messageAll("\u00a7cThe \u00a74zombie plague \u00a7cis here!");
			//Pick a random zombie
			zombifySomeone();
		}
		
		//Do a periodic check for a lack of zombies
		if(teamsManager.roundTimeLeft + humanPrepTime < teamsManager.currentRound.timeLimit * 20 * 60 && teamsManager.roundTimeLeft % 200 == 0 && teamsManager.currentRound.teams[1].members.size() == 0)
			zombifySomeone();
	}
	
	public void zombifySomeone()
	{
		if(teamsManager.currentRound.teams[0].members.size() > 0)
		{
			EntityPlayer zombifiedPlayer = teamsManager.getPlayer(teamsManager.currentRound.teams[0].members.get(rand.nextInt(teamsManager.currentRound.teams[0].members.size())));
			teamsManager.messageAll("\u00a74" + zombifiedPlayer.getCommandSenderName() + "\u00a7c was infected with the \u00a74zombie plague\u00a7c!");
			zombifiedPlayer.attackEntityFrom(DamageSource.generic, 1000000000F);
		}
	}
	
	public Team[] getTeamsCanSpawnAs(TeamsRound currentRound, EntityPlayer player)
	{
		if(teamsManager.roundTimeLeft + humanPrepTime > teamsManager.currentRound.timeLimit * 20 * 60)
			return new Team[] { currentRound.teams[0] };
		return new Team[] { currentRound.teams[1] };
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
	public boolean playerCanAttack(EntityPlayerMP attacker, Team attackerTeam, EntityPlayerMP victim, Team victimTeam) {
		return attackerTeam != victimTeam || friendlyFire;
	}

	@Override
	public void playerKilled(EntityPlayerMP player, DamageSource source) 
	{
		PlayerData playerData = getPlayerData(player);
		EntityPlayerMP attacker = getPlayerFromDamageSource(source);
		if(attacker != null)
		{
			PlayerData attackerData = getPlayerData(attacker);
			
			//They killed themself. Oh noes. Do nothing
			if(attacker == player)
			{
				//playerData.score--;
			}
			
			//They teamkilled. +1 to hunters. -1 to zombies.
			else if(attackerData.team == playerData.team)
			{
				if(isHuman(attackerData.team))
					attackerData.score += 1;
				else attackerData.zombieScore--;
			}
			//They killed an enemy. +1 point to them and their team
			else 
			{	
				if(isHuman(attackerData.team))
					attackerData.score++;
				else if(isZombie(attackerData.team))
					attackerData.zombieScore++;
				attackerData.kills++;
			}
		}
		else
		{
			//playerData.score--;
		}
		playerData.deaths++;
		//We're outside the human prep time. Switch to zombie
		if(teamsManager.roundTimeLeft + humanPrepTime <= teamsManager.currentRound.timeLimit * 20 * 60)
		{
			if(playerData.team != null)
				playerData.team.removePlayer(player);
			playerData.team = playerData.newTeam = teamsManager.currentRound.teams[1];
			playerData.team.addPlayer(player);
			teamsManager.sendClassMenuToPlayer(player);
		}
	}
	
	@Override
	public boolean teamHasWon(Team team) 
	{
		//Humans win if there are some left at the end of the round
		if(isHuman(team))
			return teamsManager.roundTimeLeft == 1 && team.members.size() > 0;
		//Zombies win if all the humans are dead
		else if(isZombie(team))
			return teamsManager.roundTimeLeft + humanPrepTime <= teamsManager.currentRound.timeLimit * 20 * 60 && teamsManager.currentRound.teams[0].members.size() == 0;
		return false;
	}
	
	/** The human team is team 0. Check to see if a team is the human team */
	public boolean isHuman(Team team)
	{
		return team == teamsManager.currentRound.teams[0];
	}
	
	/** The zombie team is team 1. Check to see if a team is the zombie team */
	public boolean isZombie(Team team)
	{
		return team == teamsManager.currentRound.teams[1];
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
			ArrayList<ITeamBase> bases = teamsManager.currentRound.map.getBasesPerTeam(1);
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
	public boolean showZombieScore()
	{
		return true;
	}
	
	//Zombies can't loot
	public boolean playerCanLoot(ItemStack stack, InfoType infoType, EntityPlayer player, Team playerTeam) 
	{ 
		return playerTeam != teamsManager.currentRound.teams[1]; 
	}

	@Override
	public void readFromNBT(NBTTagCompound tags) 
	{
		humanPrepTime = tags.getInteger("ZOMPrepTime");
	}

	@Override
	public void saveToNBT(NBTTagCompound tags) 
	{
		tags.setInteger("ZOMPrepTime", humanPrepTime);
	}
	

	@Override
	public boolean setVariable(String variable, String value) 
	{
		if(variable.toLowerCase().equals("humanpreptime"))
		{
			humanPrepTime = Integer.parseInt(value) * 20;
			return true;
		}
		return false;
	}
}
