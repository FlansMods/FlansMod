package com.flansmod.client.gui;

import java.io.DataInputStream;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.network.PacketTeamInfo.PlayerScoreData;
import com.flansmod.common.network.PacketTeamInfo.TeamData;
import com.flansmod.common.teams.Team;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

public class GuiTeamScores extends GuiScreen 
{
	public static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/teamsScores.png");
	
	@Override
	public void drawScreen(int i, int j, float f)
	{
		PacketTeamInfo teamInfo = FlansModClient.teamInfo;
		if(teamInfo == null || teamInfo.gametype == null || teamInfo.gametype.equals("") || teamInfo.teamData == null || teamInfo.teamData.length < 1)
		{
			mc.displayGuiScreen(null);
			return;
		}
		
		long newTime = mc.theWorld.getWorldInfo().getWorldTime();
		ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
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
