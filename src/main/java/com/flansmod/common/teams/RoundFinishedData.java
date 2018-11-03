package com.flansmod.common.teams;

import io.netty.buffer.ByteBuf;

import com.flansmod.common.network.PacketBase;

public class RoundFinishedData
{
	public class VotingOption
	{
		public String mapName;
		public String gametype;
		public String[] teamNames;
		public int numVotes;
		
		public VotingOption(String s, String s1, String s2, String s3)
		{
			gametype = s;
			mapName = s1;
			teamNames = new String[2];
			teamNames[0] = s2;
			teamNames[1] = s3;
			numVotes = 0;
		}
	}
	
	public int scoresTime = 0;
	public int rankUpdateTime = 0;
	public int votingTime = 0;
	
	public boolean votingEnabled = false;
	public VotingOption[] votingOptions = new VotingOption[0];
	
	public int pendingXP = 0;
	public int resultantXP = 0;
	public int resultantLevel = 0;
	
	public RoundFinishedData()
	{
	}
	
	public RoundFinishedData(RoundFinishedData other)
	{
		scoresTime = other.scoresTime;
		rankUpdateTime = other.rankUpdateTime;
		votingTime = other.votingTime;
		votingEnabled = other.votingEnabled;
		votingOptions = other.votingOptions;
	}
	
	public void ReadInitialData(ByteBuf data)
	{
		// Timers 
		scoresTime = data.readInt();
		rankUpdateTime = data.readInt();
		votingTime = data.readInt();
		
		// Voting
		votingEnabled = data.readBoolean();
		if(votingEnabled)
		{
			int numOptions = data.readByte();
			votingOptions = new VotingOption[numOptions];
			for(int i = 0; i < numOptions; i++)
			{
				votingOptions[i] = new VotingOption(PacketBase.readUTF(data), PacketBase.readUTF(data), PacketBase.readUTF(data), PacketBase.readUTF(data));
			}
		}
		
		// Ranks
		pendingXP = data.readInt();
		resultantXP = data.readInt();
		resultantLevel = data.readInt();
	}
	
	public void WriteInitialData(ByteBuf data)
	{
		// Timers
		data.writeInt(scoresTime);
		data.writeInt(rankUpdateTime);
		data.writeInt(votingTime);
		
		// Voting
		data.writeBoolean(votingEnabled);
		if(votingEnabled)
		{
			data.writeByte(votingOptions.length);
			for(VotingOption votingOption : votingOptions)
			{
				PacketBase.writeUTF(data, votingOption.gametype);
				PacketBase.writeUTF(data, votingOption.mapName);
				PacketBase.writeUTF(data, votingOption.teamNames[0]);
				PacketBase.writeUTF(data, votingOption.teamNames[1]);
			}
		}
		
		// Ranks
		data.writeInt(pendingXP);
		data.writeInt(resultantXP);
		data.writeInt(resultantLevel);
	}
	
	public void ReadNumVotesUpdate(ByteBuf data)
	{
		int numOptions = data.readByte();
		votingOptions = new VotingOption[numOptions];
		
		for(int i = 0; i < numOptions; i++)
		{
			votingOptions[i] = new VotingOption("", "", "", "");
			votingOptions[i].numVotes = data.readInt();
		}
	}
	
	public void WriteNumVotesUpdate(ByteBuf data)
	{
		data.writeByte(votingOptions.length);
		
		for(VotingOption votingOption : votingOptions)
		{
			data.writeInt(votingOption.numVotes);
		}
	}
	
	public void FillVoteOptions(TeamsRound[] rounds)
	{
		votingOptions = new VotingOption[rounds.length];
		for(int i = 0; i < rounds.length; i++)
		{
			votingOptions[i] = new VotingOption(rounds[i].gametype.name,
					rounds[i].map.name,
					rounds[i].teams[0].textColour + rounds[i].teams[0].shortName,
					rounds[i].teams[1].textColour + rounds[i].teams[1].shortName);
		}
	}
}
