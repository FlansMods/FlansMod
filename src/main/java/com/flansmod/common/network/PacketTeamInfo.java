package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import java.util.ArrayList;
import java.util.Collections;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketTeamInfo extends PacketBase 
{			
	public static String map;
	public static String gametype;
	public static int numTeams;
	public static TeamData[] teamData;
	public static boolean sortedByTeam;
	
	public static int numLines;

	public static class TeamData
	{
		public Team team;
		public int score;
		public int numPlayers;
		public PlayerScoreData[] playerData;
	}
	
	public static class PlayerScoreData
	{
		public String username;
		public int score;
		public int kills;
		public int deaths;
		public TeamData team;
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
		if(TeamsManager.getInstance().currentGametype == null)
    	{
			writeUTF(data, "No Gametype");
    		data.writeInt(0);
    	}
    	else
    	{
    		writeUTF(data, TeamsManager.getInstance().currentGametype.name);
    		writeUTF(data, TeamsManager.getInstance().currentMap.name);
    		if(TeamsManager.getInstance().currentGametype.sortScoreboardByTeam())
    		{
    			data.writeBoolean(true);
	        	if(TeamsManager.getInstance().teams == null)
	        	{
	        		data.writeInt(0);
	        	}
	        	else
	        	{
		        	data.writeInt(TeamsManager.getInstance().teams.length);
		        	for(int i = 0; i < TeamsManager.getInstance().teams.length; i++)
		        	{
		        		Team team = TeamsManager.getInstance().teams[i];
		        		if(team == null)
		        		{
		        			writeUTF(data, "none");
		        			continue;
		        		}
		        		writeUTF(data, team.shortName);
		        		data.writeInt(team.score);
		        		team.sortPlayers();
		        		data.writeInt(team.members.size());
		        		for(int j = 0; j < team.members.size(); j++)
		        		{
		        			String username = team.members.get(j);
		        			PlayerData playerData = PlayerHandler.getPlayerData(username, Side.SERVER);
		        			writeUTF(data, username);
		        			if(playerData == null)
		        			{
		        				data.writeInt(0);
		        				data.writeInt(0);
		        				data.writeInt(0);
		        			}
		        			else
		        			{
			        			data.writeInt(playerData.score);
			        			data.writeInt(playerData.kills);
			        			data.writeInt(playerData.deaths);
		        			}
		        		}
		        	}
	        	}
    		}
    		else
    		{
    			data.writeBoolean(false);
    			ArrayList<String> playerNames = new ArrayList<String>();
    			for(int i = 0; i < TeamsManager.getInstance().teams.length; i++)
	        	{
	        		Team team = TeamsManager.getInstance().teams[i];
	        		if(team == null || team.members == null)
	        		{
	        			continue;
	        		}
	        		playerNames.addAll(team.members);
	        	}
    			
    			Collections.sort(playerNames, new Team.ComparatorScore());
        		data.writeInt(playerNames.size());
        		for(int j = 0; j < playerNames.size(); j++)
        		{
        			String username = playerNames.get(j);
        			PlayerData playerData = PlayerHandler.getPlayerData(username, Side.SERVER);
        			writeUTF(data, username);
        			if(playerData == null)
        			{
        				data.writeInt(0);
        				data.writeInt(0);
        				data.writeInt(0);
        			}
        			else
        			{
	        			data.writeInt(playerData.score);
	        			data.writeInt(playerData.kills);
	        			data.writeInt(playerData.deaths);
        			}
        		}
	        	
    		}
    	}
    	
    	data.writeBoolean(TeamsManager.canBreakGlass);
    	data.writeBoolean(TeamsManager.vehiclesNeedFuel);
    	data.writeBoolean(TeamsManager.driveablesBreakBlocks);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		gametype = readUTF(data);
		if(gametype.equals("No Gametype"))
		{
			numTeams = 0;
			teamData = new TeamData[0];
		}
		else
		{
			map = readUTF(data);
			sortedByTeam = data.readBoolean();
			if(sortedByTeam)
			{
				numLines = numTeams = data.readInt();
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
					teamData[i].numPlayers = data.readInt();
					teamData[i].playerData = new PlayerScoreData[teamData[i].numPlayers];
					numLines += teamData[i].numPlayers;
					for(int j = 0; j < teamData[i].numPlayers; j++)
					{
						teamData[i].playerData[j] = new PlayerScoreData();
						teamData[i].playerData[j].team = teamData[i];
						teamData[i].playerData[j].username = readUTF(data);
						teamData[i].playerData[j].score = data.readInt();
						teamData[i].playerData[j].kills = data.readInt();
						teamData[i].playerData[j].deaths = data.readInt();
					}
				}
			}
			else
			{
				numLines = 0;
				teamData = new TeamData[] { new TeamData() };
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
					teamData[0].playerData[j].score = data.readInt();
					teamData[0].playerData[j].kills = data.readInt();
					teamData[0].playerData[j].deaths = data.readInt();
				}
			}
		}
		TeamsManager.canBreakGlass = data.readBoolean();
		TeamsManager.vehiclesNeedFuel = data.readBoolean();
		TeamsManager.driveablesBreakBlocks = data.readBoolean();
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
}
