package com.flansmod.client.teams;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.FMLClientHandler;

import com.flansmod.client.gui.teams.GuiEditLoadout;
import com.flansmod.client.gui.teams.GuiLandingPage;
import com.flansmod.client.gui.teams.GuiMissionResults;
import com.flansmod.client.gui.teams.GuiOpenRewardBox;
import com.flansmod.client.gui.teams.GuiTeamScores;
import com.flansmod.client.gui.teams.GuiTeamSelect;
import com.flansmod.client.gui.teams.GuiVoting;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.network.PacketOpenRewardBox;
import com.flansmod.common.teams.LoadoutPool;
import com.flansmod.common.teams.PlayerRankData;
import com.flansmod.common.teams.RewardBoxInstance;
import com.flansmod.common.teams.RoundFinishedData;

public class ClientTeamsData
{
	public enum RoundFinishedStage
	{
		NOT_FINISHED,
		
		SCORES,
		RANK_UPDATE,
		VOTING,
	}
	
	public static PlayerRankData theRankData = null;
	public static LoadoutPool currentPool = null;
	
	public static RoundFinishedData roundFinishedData;
	
	public static int timeLeftInStage = 0;
	public static int timeLeftTotal = 0;
	public static RoundFinishedStage stage = RoundFinishedStage.NOT_FINISHED;
	public static String motd = "";
	
	public static void Tick()
	{
		timeLeftTotal--;
		timeLeftInStage--;
		
		switch(stage)
		{
			case NOT_FINISHED:
				break;
			case RANK_UPDATE:
			{
				if(StageFinished())
				{
					if(roundFinishedData.votingEnabled)
					{
						timeLeftInStage = roundFinishedData.votingTime;
						SwitchTo(RoundFinishedStage.VOTING);
					}
					else
					{
						SwitchTo(RoundFinishedStage.NOT_FINISHED);
					}
				}
				break;
			}
			case SCORES:
			{
				if(StageFinished())
				{
					timeLeftInStage = roundFinishedData.rankUpdateTime;
					SwitchTo(RoundFinishedStage.RANK_UPDATE);
				}
				break;
			}
			case VOTING:
			{
				if(StageFinished())
				{
					SwitchTo(RoundFinishedStage.NOT_FINISHED);
				}
				break;
			}
			default:
				break;
		}
		
		if(stage != RoundFinishedStage.NOT_FINISHED && Minecraft.getMinecraft().currentScreen == null)
		{
			OpenMenu();
		}
	}
	
	private static boolean StageFinished()
	{
		return timeLeftInStage <= 0;
	}
	
	private static void SwitchTo(RoundFinishedStage s)
	{
		stage = s;
		OpenMenu();
	}
	
	private static void OpenMenu()
	{
		switch(stage)
		{
			case NOT_FINISHED:
				if((Minecraft.getMinecraft().currentScreen instanceof GuiVoting)
						|| (Minecraft.getMinecraft().currentScreen instanceof GuiTeamScores)
						|| (Minecraft.getMinecraft().currentScreen instanceof GuiMissionResults))
				{
					Minecraft.getMinecraft().displayGuiScreen(null);
				}
				break;
			case RANK_UPDATE:
				Minecraft.getMinecraft().displayGuiScreen(new GuiMissionResults());
				break;
			case SCORES:
				Minecraft.getMinecraft().displayGuiScreen(new GuiTeamScores());
				break;
			case VOTING:
				Minecraft.getMinecraft().displayGuiScreen(new GuiVoting());
				break;
			default:
				break;
			
		}
	}
	
	public static void SetRoundFinishedData(RoundFinishedData data)
	{
		roundFinishedData = data;
		
		if(theRankData == null)
		{
			FlansMod.Assert(false, "Rank data null");
			return;
		}
		
		theRankData.pendingXP = roundFinishedData.pendingXP;
	}
	
	public static void StartTimers()
	{
		FlansMod.log.info("Starting round finished timers. Scores:" + roundFinishedData.scoresTime +
				" RankUpdate:" + roundFinishedData.rankUpdateTime +
				" Voting:" + roundFinishedData.votingTime);
		
		timeLeftInStage = roundFinishedData.scoresTime;
		timeLeftTotal = roundFinishedData.scoresTime + roundFinishedData.rankUpdateTime + roundFinishedData.votingTime;
		SwitchTo(RoundFinishedStage.SCORES);
	}
	
	public static void UpdateNumVotes(RoundFinishedData data)
	{
		if(roundFinishedData == null || roundFinishedData.votingOptions == null)
		{
			return;
		}
		for(int i = 0; i < data.votingOptions.length; i++)
		{
			if(i < roundFinishedData.votingOptions.length)
			{
				roundFinishedData.votingOptions[i].numVotes = data.votingOptions[i].numVotes;
			}
			else
			{
				FlansMod.Assert(false, "Voting options mismatch");
			}
		}
		
	}
	
	public static void UnlockReward(int boxHash, int unlockHash)
	{
		Paintjob paintjob = Paintjob.GetPaintjob(unlockHash);
		if(paintjob == null)
		{
			FlansMod.Assert(false, "Null paintjob unlock!");
			return;
		}
		
		boolean found = false;
		for(RewardBoxInstance instance : theRankData.rewardBoxData)
		{
			if(!instance.opened
					&& instance.unlockHash == 0
					&& instance.boxHash == boxHash)
			{
				found = true;
				instance.opened = true;
				instance.unlockHash = unlockHash;
				break;
			}
		}
		
		if(!found)
		{
			FlansMod.Assert(false, "Never had this reward box!");
			return;
		}
		
		if(Minecraft.getMinecraft().currentScreen instanceof GuiOpenRewardBox)
		{
			((GuiOpenRewardBox)Minecraft.getMinecraft().currentScreen).SetTarget(paintjob);
		}
	}
	
	public static void OpenLandingPage()
	{
		FMLClientHandler.instance().getClient().displayGuiScreen(new GuiLandingPage());
	}
	
	public static void OpenEditLoadoutPage(int loadout)
	{
		FMLClientHandler.instance().getClient().displayGuiScreen(new GuiEditLoadout(loadout));
	}
	
	public static void OpenTeamSelectPage()
	{
		FMLClientHandler.instance().getClient().displayGuiScreen(new GuiTeamSelect());
	}
	
	public static void OpenRewardBox(int i)
	{
		FlansMod.getPacketHandler().sendToServer(new PacketOpenRewardBox(currentPool.rewardBoxes[i]));
		FMLClientHandler.instance().getClient().displayGuiScreen(new GuiOpenRewardBox(currentPool.rewardBoxes[i]));
	}
	
	public static void AddRewardBox(int boxHash)
	{
		theRankData.AddRewardBoxInstance(RewardBoxInstance.CreateClientRewardBoxInstance(boxHash, 0));
	}
}
