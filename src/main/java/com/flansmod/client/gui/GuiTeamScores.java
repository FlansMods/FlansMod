package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.teams.Team;

public class GuiTeamScores extends GuiScreen 
{
	public static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/teamsScores.png");
	public static final ResourceLocation texture2 = new ResourceLocation("flansmod", "gui/teamsScores2.png");
	
	@Override
	public void drawScreen(int i, int j, float f)
	{
		PacketTeamInfo teamInfo = FlansModClient.teamInfo;
		if(teamInfo == null || teamInfo.gametype == null || teamInfo.gametype.equals("") || teamInfo.teamData == null || teamInfo.teamData.length < 1)
		{
			mc.displayGuiScreen(null);
			return;
		}
		
		if(teamInfo.sortedByTeam)
		{
			renderTwoTeamGUI(teamInfo);
		}
		else renderDMGUI(teamInfo);
	}
	
	public void renderTwoTeamGUI(PacketTeamInfo teamInfo)
	{
		long newTime = mc.theWorld.getWorldInfo().getWorldTime();
		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int k = scaledresolution.getScaledWidth();
		int l = scaledresolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);

		mc.renderEngine.bindTexture(texture2);
		
		int guiHeight = 68 + 9 * teamInfo.numLines;

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int m = k / 2 - 156;
		int n = l / 2 - guiHeight / 2 ;
		//Like draw texturedModalRect, but with custom image size
		//func_146110_a(m, n, 100, 0, 312, 180, 512, 256);
		
		func_146110_a(m, n, 100, 0, 312, 66, 512, 256);
		for(int p = 0; p < teamInfo.numLines; p++)
			func_146110_a(m, n + 66 + 9 * p, 100, 71, 312, 9, 512, 256);
		func_146110_a(m, n + 66 + teamInfo.numLines * 9, 100, 168, 312, 12, 512, 256);
		
		if(teamInfo.showZombieScore)
		{
			func_146110_a(m + 103, n + 51, 412, 0, 29, 11, 512, 256);
			func_146110_a(m + 254, n + 51, 412, 0, 29, 11, 512, 256);
		}
		
		//No idea why this works, but it makes the text bind its texture correctly
		//mc.renderEngine.bindTexture("/terrain.png");
		//TODO : Investiagate this

		drawString(fontRendererObj, teamInfo.map, m + 6, n + 6, 0xffffff);
		drawString(fontRendererObj, teamInfo.gametype, m + 312 - 6 - fontRendererObj.getStringWidth(teamInfo.gametype), n + 6, 0xffffff);
		
		if(teamInfo.roundOver())
		{
			Team winners = teamInfo.getWinner();
			//Time limit was hit
			if(winners == null)
			{
				drawString(fontRendererObj, "Time Ran Out!", m + 10, n + 20, 0xffffff);
			}
			else
			{
				drawString(fontRendererObj, winners.name + " Won!", m + 10, n + 20, 0xffffff);
			}
		}
		else
		{
			int secondsLeft = teamInfo.timeLeft / 20;
			int minutesLeft = secondsLeft / 60;
			secondsLeft = secondsLeft % 60;
			drawString(fontRendererObj, "Time Left : " + minutesLeft + ":" + (secondsLeft < 10 ? "0" + secondsLeft : secondsLeft), m + 10, n + 20, 0xffffff);
			drawString(fontRendererObj, "Score Limit : " + teamInfo.scoreLimit, m + 302 - fontRendererObj.getStringWidth("Score Limit : " + teamInfo.scoreLimit), n + 20, 0xffffff);
		}
		
		for(int i = 0; i < 2; i++)
		{
			fontRendererObj.drawString("\u00a7" + teamInfo.teamData[i].team.textColour + teamInfo.teamData[i].team.name, m + 10 + 151 * i, n + 39, 0xffffff);
			fontRendererObj.drawString("\u00a7" + teamInfo.teamData[i].team.textColour + teamInfo.teamData[i].score, m + 133 + 151 * i, n + 39, 0xffffff);
			for(int j = 0; j < teamInfo.teamData[i].numPlayers; j++)
			{
				drawString(fontRendererObj, teamInfo.teamData[i].playerData[j].username, m + 12 + 151 * i, n + 67 + 9 * j, 0xffffff);
				drawCenteredString(fontRendererObj, "" + teamInfo.teamData[i].playerData[j].score, m + 111 + 151 * i, n + 67 + 9 * j, 0xffffff);
				drawCenteredString(fontRendererObj, "" + (teamInfo.showZombieScore ? teamInfo.teamData[i].playerData[j].zombieScore : teamInfo.teamData[i].playerData[j].kills), m + 127 + 151 * i, n + 67 + 9 * j, 0xffffff);
				drawCenteredString(fontRendererObj, "" + teamInfo.teamData[i].playerData[j].deaths, m + 143 + 151 * i, n + 67 + 9 * j, 0xffffff);
			}
		}
		
		/*
		drawString(fontRendererObj, "Name", m + 8, n + 14, 0xffffff);
		drawString(fontRendererObj, "Score", m + 100, n + 14, 0xffffff);
		drawString(fontRendererObj, "Kills", m + 150, n + 14, 0xffffff);
		drawString(fontRendererObj, "Deaths", m + 200, n + 14, 0xffffff);
		int line = 0;
		if(teamInfo.sortedByTeam)
		{
			for(int p = 0; p < teamInfo.numTeams; p++)
			{
				if(teamInfo.teamData[p] == null || teamInfo.teamData[p].team == null)
					continue;
				drawString(fontRendererObj, "\u00a7" + teamInfo.teamData[p].team.textColour + teamInfo.teamData[p].team.name, m + 8, n + 25 + 9 * line, 0xffffff);
				drawString(fontRendererObj, "" + teamInfo.teamData[p].score, m + 100, n + 25 + 9 * line, 0xffffff);
				line++;
				for(int q = 0; q < teamInfo.teamData[p].numPlayers; q++)
				{
					drawString(fontRendererObj, teamInfo.teamData[p].playerData[q].username, m + 8, n + 25 + 9 * line, 0xffffff);
					drawString(fontRendererObj, "" + teamInfo.teamData[p].playerData[q].score, m + 100, n + 25 + 9 * line, 0xffffff);
					drawString(fontRendererObj, "" + teamInfo.teamData[p].playerData[q].kills, m + 150, n + 25 + 9 * line, 0xffffff);
					drawString(fontRendererObj, "" + teamInfo.teamData[p].playerData[q].deaths, m + 200, n + 25 + 9 * line, 0xffffff);
					line++;
				}
			}
		}
		else
		{
			for(int q = 0; q < teamInfo.teamData[0].numPlayers; q++)
			{
				drawString(fontRendererObj, teamInfo.teamData[0].playerData[q].username, m + 8, n + 25 + 9 * line, 0xffffff);
				drawString(fontRendererObj, "" + teamInfo.teamData[0].playerData[q].score, m + 100, n + 25 + 9 * line, 0xffffff);
				drawString(fontRendererObj, "" + teamInfo.teamData[0].playerData[q].kills, m + 150, n + 25 + 9 * line, 0xffffff);
				drawString(fontRendererObj, "" + teamInfo.teamData[0].playerData[q].deaths, m + 200, n + 25 + 9 * line, 0xffffff);
				line++;
			}
		}
		*/
		GL11.glDisable(3042 /*GL_BLEND*/);
	}
	
	public void renderDMGUI(PacketTeamInfo teamInfo)
	{
		long newTime = mc.theWorld.getWorldInfo().getWorldTime();
		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int k = scaledresolution.getScaledWidth();
		int l = scaledresolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);

		mc.renderEngine.bindTexture(texture);

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int guiHeight = 34 + 9 * teamInfo.numLines;
		int m = k / 2 - 128;
		int n = l / 2 - guiHeight / 2;
		drawTexturedModalRect(m, n, 0, 45, 256, 24);
		for(int p = 0; p < teamInfo.numLines; p++)
			drawTexturedModalRect(m, n + 24 + 9 * p, 0, 71, 256, 9);
		drawTexturedModalRect(m, l / 2 + guiHeight / 2 - 10, 0, 87, 256, 10);
		
		//No idea why this works, but it makes the text bind its texture correctly
		//mc.renderEngine.bindTexture("/terrain.png");
		//TODO : Investiagate this

		drawCenteredString(fontRendererObj, teamInfo.gametype, k / 2, n + 4, 0xffffff);
		drawString(fontRendererObj, "Name", m + 8, n + 14, 0xffffff);
		drawString(fontRendererObj, "Score", m + 100, n + 14, 0xffffff);
		drawString(fontRendererObj, "Kills", m + 150, n + 14, 0xffffff);
		drawString(fontRendererObj, "Deaths", m + 200, n + 14, 0xffffff);
		int line = 0;
		if(teamInfo.sortedByTeam)
		{
			for(int p = 0; p < teamInfo.numTeams; p++)
			{
				if(teamInfo.teamData[p] == null || teamInfo.teamData[p].team == null)
					continue;
				drawString(fontRendererObj, "\u00a7" + teamInfo.teamData[p].team.textColour + teamInfo.teamData[p].team.name, m + 8, n + 25 + 9 * line, 0xffffff);
				drawString(fontRendererObj, "" + teamInfo.teamData[p].score, m + 100, n + 25 + 9 * line, 0xffffff);
				line++;
				for(int q = 0; q < teamInfo.teamData[p].numPlayers; q++)
				{
					drawString(fontRendererObj, teamInfo.teamData[p].playerData[q].username, m + 8, n + 25 + 9 * line, 0xffffff);
					drawString(fontRendererObj, "" + teamInfo.teamData[p].playerData[q].score, m + 100, n + 25 + 9 * line, 0xffffff);
					drawString(fontRendererObj, "" + teamInfo.teamData[p].playerData[q].kills, m + 150, n + 25 + 9 * line, 0xffffff);
					drawString(fontRendererObj, "" + teamInfo.teamData[p].playerData[q].deaths, m + 200, n + 25 + 9 * line, 0xffffff);
					line++;
				}
			}
		}
		else
		{
			for(int q = 0; q < teamInfo.teamData[0].numPlayers; q++)
			{
				drawString(fontRendererObj, teamInfo.teamData[0].playerData[q].username, m + 8, n + 25 + 9 * line, 0xffffff);
				drawString(fontRendererObj, "" + teamInfo.teamData[0].playerData[q].score, m + 100, n + 25 + 9 * line, 0xffffff);
				drawString(fontRendererObj, "" + teamInfo.teamData[0].playerData[q].kills, m + 150, n + 25 + 9 * line, 0xffffff);
				drawString(fontRendererObj, "" + teamInfo.teamData[0].playerData[q].deaths, m + 200, n + 25 + 9 * line, 0xffffff);
				line++;
			}
		}
		GL11.glDisable(3042 /*GL_BLEND*/);
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
