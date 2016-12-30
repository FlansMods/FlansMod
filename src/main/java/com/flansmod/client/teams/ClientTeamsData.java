package com.flansmod.client.teams;

import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;

import com.flansmod.client.gui.teams.GuiMissionResults;
import com.flansmod.common.teams.LoadoutPool;
import com.flansmod.common.teams.PlayerRankData;

public class ClientTeamsData 
{
	public static PlayerRankData theRankData = null;
	public static LoadoutPool currentPool = null;
	
	public static void HandleRankUpdate(int pendingXP, int resultantXP, int resultantLevel) 
	{
		if(theRankData == null) return;
		
		theRankData.pendingXP = pendingXP;
		
		FMLClientHandler.instance().getClient().displayGuiScreen(new GuiMissionResults());
		
		theRankData.pendingXP = 0;
		theRankData.currentLevel = resultantLevel;
		theRankData.currentXP = resultantXP;
	}
	
	
}
