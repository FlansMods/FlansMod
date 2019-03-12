package com.flansmod.common.network;

import java.util.ArrayList;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.PlayerRankData;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.teams.TeamsManagerRanked;

public class PacketTeamInfo extends PacketBase
{
	public String mapShortName;
	public String map;
	public String gametype;
	public boolean showZombieScore;
	public int numTeams;
	public TeamData[] teamData;
	public boolean sortedByTeam;
	public int timeLeft;
	public int scoreLimit;
	
	public int numLines;
	
	public static class TeamData
	{
		public Team team;
		public int score;
		public int numPlayers;
		public PlayerScoreData[] playerData;
		public boolean winner;
	}
	
	public static class PlayerScoreData
	{
		public int level;
		public String username;
		public int score;
		public int kills;
		public int deaths;
		public TeamData team;
		public PlayerClass playerClass;
		public int zombieScore;
	}
	
	public static PlayerScoreData getPlayerScoreData(String username)
	{
		if(FlansModClient.teamInfo.teamData == null)
			return null;
		for(TeamData team : FlansModClient.teamInfo.teamData)
		{
			if(team == null || team.playerData == null)
				return null;
			for(PlayerScoreData player : team.playerData)
			{
				if(player != null && player.username != null && player.username.equals(username))
					return player;
			}
		}
		return null;
	}
	
	public PacketTeamInfo()
	{
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeBoolean(TeamsManager.canBreakGlass);
		data.writeBoolean(TeamsManager.vehiclesNeedFuel);
		data.writeBoolean(TeamsManager.driveablesBreakBlocks);
		
		if(TeamsManager.getInstance().currentRound == null)
		{
			writeUTF(data, "No Gametype");
			data.writeInt(0);
		}
		else
		{
			writeUTF(data, TeamsManager.getInstance().currentRound.gametype.name);
			data.writeBoolean(TeamsManager.getInstance().currentRound.gametype.showZombieScore());
			writeUTF(data, TeamsManager.getInstance().currentRound.map.name);
			writeUTF(data, TeamsManager.getInstance().currentRound.map.shortName);
			data.writeInt(TeamsManager.getInstance().roundTimeLeft);
			data.writeInt(TeamsManager.getInstance().currentRound.scoreLimit);
			
			if(TeamsManager.getInstance().currentRound.gametype.sortScoreboardByTeam())
			{
				data.writeBoolean(true);
				if(TeamsManager.getInstance().currentRound.teams == null)
				{
					data.writeInt(0);
				}
				else
				{
					data.writeInt(TeamsManager.getInstance().currentRound.teams.length);
					for(int i = 0; i < TeamsManager.getInstance().currentRound.teams.length; i++)
					{
						Team team = TeamsManager.getInstance().currentRound.teams[i];
						if(team == null)
						{
							writeUTF(data, "none");
							continue;
						}
						writeUTF(data, team.shortName);
						data.writeInt(team.score);
						data.writeBoolean(TeamsManager.getInstance().currentRound.gametype.teamHasWon(team));
						team.sortPlayers();
						data.writeInt(team.members.size());
						for(int j = 0; j < team.members.size(); j++)
						{
							String username = team.members.get(j);
							PlayerData playerData = PlayerHandler.getPlayerData(username, Side.SERVER);
							writeUTF(data, username);
							PlayerRankData rankData = TeamsManagerRanked.GetRankData(TeamsManager.getPlayer(username));
							if(rankData == null)
							{
								data.writeInt(0);
							}
							else
							{
								data.writeInt(rankData.currentLevel);
							}
							
							if(playerData == null)
							{
								data.writeInt(0);
								data.writeInt(0);
								data.writeInt(0);
								writeUTF(data, "");
							}
							else
							{
								data.writeInt(playerData.score);
								data.writeInt(playerData.zombieScore);
								data.writeInt(playerData.kills);
								data.writeInt(playerData.deaths);
								writeUTF(data, playerData.playerClass.GetShortName());
							}
						}
					}
				}
			}
			else
			{
				data.writeBoolean(false);
				ArrayList<String> playerNames = new ArrayList<>();
				for(int i = 0; i < TeamsManager.getInstance().currentRound.teams.length; i++)
				{
					Team team = TeamsManager.getInstance().currentRound.teams[i];
					if(team == null || team.members == null)
					{
						continue;
					}
					playerNames.addAll(team.members);
				}
				
				playerNames.sort(new Team.ComparatorScore());
				data.writeInt(playerNames.size());
				for(String username : playerNames)
				{
					PlayerData playerData = PlayerHandler.getPlayerData(username, Side.SERVER);
					writeUTF(data, username);
					PlayerRankData rankData = TeamsManagerRanked.GetRankData(TeamsManager.getPlayer(username));
					if(rankData == null)
					{
						data.writeInt(0);
					}
					else
					{
						data.writeInt(rankData.currentLevel);
					}
					if(playerData == null)
					{
						data.writeInt(0);
						data.writeInt(0);
						data.writeInt(0);
						writeUTF(data, "");
					}
					else
					{
						data.writeInt(playerData.score);
						data.writeInt(playerData.kills);
						data.writeInt(playerData.deaths);
						writeUTF(data, playerData.playerClass.GetShortName());
					}
				}
				
			}
		}
		
		
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		try
		{
			TeamsManager.canBreakGlass = data.readBoolean();
			TeamsManager.vehiclesNeedFuel = data.readBoolean();
			TeamsManager.driveablesBreakBlocks = data.readBoolean();
			gametype = readUTF(data);
			if(gametype.equals("No Gametype"))
			{
				numTeams = 0;
				teamData = new TeamData[0];
			}
			else
			{
				showZombieScore = data.readBoolean();
				map = readUTF(data);
				mapShortName = readUTF(data);
				timeLeft = data.readInt();
				scoreLimit = data.readInt();
				sortedByTeam = data.readBoolean();
				if(sortedByTeam)
				{
					numTeams = data.readInt();
					numLines = 1;
					if(numTeams == 0)
						return;
					teamData = new TeamData[numTeams];
					for(int i = 0; i < numTeams; i++)
					{
						teamData[i] = new TeamData();
						String teamName = readUTF(data);
						if(teamName.equals("none"))
							continue;
						teamData[i].team = Team.getTeam(teamName);
						teamData[i].score = data.readInt();
						teamData[i].winner = data.readBoolean();
						teamData[i].numPlayers = data.readInt();
						teamData[i].playerData = new PlayerScoreData[teamData[i].numPlayers];
						if(teamData[i].numPlayers > numLines)
							numLines = teamData[i].numPlayers;
						for(int j = 0; j < teamData[i].numPlayers; j++)
						{
							teamData[i].playerData[j] = new PlayerScoreData();
							teamData[i].playerData[j].team = teamData[i];
							teamData[i].playerData[j].username = readUTF(data);
							teamData[i].playerData[j].level = data.readInt();
							teamData[i].playerData[j].score = data.readInt();
							teamData[i].playerData[j].zombieScore = data.readInt();
							teamData[i].playerData[j].kills = data.readInt();
							teamData[i].playerData[j].deaths = data.readInt();
							teamData[i].playerData[j].playerClass = PlayerClass.getClass(readUTF(data));
						}
					}
				}
				else
				{
					numLines = 0;
					teamData = new TeamData[]{new TeamData()};
					teamData[0].team = null;
					teamData[0].score = 0;
					teamData[0].numPlayers = data.readInt();
					teamData[0].playerData = new PlayerScoreData[teamData[0].numPlayers];
					numLines += teamData[0].numPlayers;
					for(int j = 0; j < teamData[0].numPlayers; j++)
					{
						teamData[0].playerData[j] = new PlayerScoreData();
						teamData[0].playerData[j].team = teamData[0];
						teamData[0].playerData[j].username = readUTF(data);
						teamData[0].playerData[j].level = data.readInt();
						teamData[0].playerData[j].score = data.readInt();
						teamData[0].playerData[j].kills = data.readInt();
						teamData[0].playerData[j].deaths = data.readInt();
						teamData[0].playerData[j].playerClass = PlayerClass.getClass(readUTF(data));
					}
				}
			}
		}
		catch(Exception e)
		{
			FlansMod.Assert(false, "Messed up in teams packet");
			FlansMod.log.throwing(e);
			teamData = new TeamData[]{new TeamData()};
		}
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansModClient.teamInfo = this;
	}
	
	public Team getTeam(int spawnerTeamID)
	{
		switch(spawnerTeamID)
		{
			case 0: return null;
			case 1: return Team.spectators;
			default: return teamData.length > spawnerTeamID - 2 && teamData[spawnerTeamID - 2] != null ? teamData[spawnerTeamID - 2].team : null;
		}
	}
	
	public Team getTeam(EntityPlayer player)
	{
		for(TeamData aTeamData : teamData)
		{
			for(int j = 0; j < aTeamData.playerData.length; j++)
			{
				if(aTeamData.playerData[j].username.equals(player.getDisplayNameString()))
				{
					return aTeamData.team;
				}
			}
		}
		return null;
	}
	
	public boolean roundOver()
	{
		if(timeLeft == 0)
			return true;
		for(TeamData aTeamData : teamData)
		{
			if(aTeamData.score == scoreLimit)
				return true;
		}
		return false;
	}
	
	public Team getWinner()
	{
		for(TeamData aTeamData : teamData)
		{
			if(aTeamData.winner)
				return aTeamData.team;
		}
		return null;
	}
}
