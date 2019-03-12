package com.flansmod.common.teams;

import net.minecraft.nbt.NBTTagCompound;

/**
 * This represents a round in the teams mod
 * It designates the map, gametype and teams to be played that round
 * A list of valid rounds is kept by the TeamsManager and then either
 * players vote on which rounds to play or there is a rotation
 */
public class TeamsRound implements Comparable<TeamsRound>
{
	public Gametype gametype;
	public TeamsMap map;
	/**
	 * The teams available. This does not include spectators
	 */
	public Team[] teams;
	/**
	 * The round length in minutes
	 */
	public int timeLimit;
	/**
	 * The round score limit
	 */
	public int scoreLimit;
	/**
	 * 0 is almost never picked, 1 is always always picked. Used to pick vote options
	 */
	public float popularity;
	/**
	 * Number of rounds since it was offered as an option in the vote. Used to pick vote options
	 */
	public int roundsSincePlayed;
	
	public TeamsRound(TeamsMap map2, Gametype gametype2, Team[] teams2, int timeLimit, int scoreLimit)
	{
		map = map2;
		gametype = gametype2;
		teams = teams2;
		this.timeLimit = timeLimit;
		this.scoreLimit = scoreLimit;
		popularity = 0.5F;
	}
	
	public TeamsRound(NBTTagCompound tags)
	{
		map = TeamsManager.getInstance().maps.get(tags.getString("Map"));
		gametype = Gametype.getGametype(tags.getString("Gametype"));
		timeLimit = tags.getInteger("TimeLimit");
		scoreLimit = tags.getInteger("ScoreLimit");
		
		teams = new Team[tags.getInteger("NumTeams")];
		for(int i = 0; i < teams.length; i++)
		{
			teams[i] = Team.getTeam(tags.getString("Team_" + i));
			if(teams[i] == null)
			{
				teams[i] = Team.teams.get(0);
			}
			
		}
		
		popularity = tags.getFloat("Pop");
	}
	
	public void writeToNBT(NBTTagCompound tags)
	{
		tags.setString("Map", map.shortName);
		tags.setString("Gametype", gametype.shortName);
		tags.setInteger("TimeLimit", timeLimit);
		tags.setInteger("ScoreLimit", scoreLimit);
		
		tags.setInteger("NumTeams", teams.length);
		for(int i = 0; i < teams.length; i++)
		{
			tags.setString("Team_" + i, teams[i].shortName);
		}
		
		tags.setFloat("Pop", popularity);
	}
	
	public int getTeamID(Team team)
	{
		if(team == Team.spectators)
			return 1;
		if(team == teams[0])
			return 2;
		if(team == teams[1])
			return 3;
		return 0;
	}
	
	public Team getTeam(int id)
	{
		switch(id)
		{
			case 0: return null;
			case 1: return Team.spectators;
			default: return teams[id - 2];
		}
	}
	
	/**
	 * In two team gametypes, returns the opposite team
	 */
	public Team getOtherTeam(Team team)
	{
		if(team == Team.spectators || team == null || teams.length != 2)
			return team;
		if(team == teams[0])
			return teams[1];
		return teams[0];
	}
	
	public float getWeight()
	{
		return popularity * 4F + roundsSincePlayed;
	}
	
	@Override
	public int compareTo(TeamsRound o)
	{
		return Float.compare(o.getWeight(), getWeight());
	}
}
