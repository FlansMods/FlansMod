package co.uk.flansmods.client;

import java.io.DataInputStream;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.teams.Team;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;

public class GuiTeamScores extends GuiScreen 
{
	//Store the client side teams data statically in the Gui. Seems untidy, but its the only place its going to be used...
	public static String gametype;
	public static int numTeams;
	public static TeamData[] teamData;
	public static boolean sortedByTeam;
	
	//Number of lines (for rendering)
	public static int numLines;

	private static class TeamData
	{
		public Team team;
		public int score;
		public int numPlayers;
		public PlayerData[] playerData;
	}
	
	public static class PlayerData
	{
		public String username;
		public int score;
		public int kills;
		public int deaths;
	}
	
	public static PlayerData getPlayerData(String username)
	{
		for(TeamData team : teamData)
		{
			if(team == null || team.playerData == null)
				return null;
			for(PlayerData player : team.playerData)
			{
				if(player != null && player.username != null && player.username.equals(username))
					return player;
			}
		}
		return null;
	}
	
	//Move the packet interpretation here for simplicity
	public static void interpret(DataInputStream stream)
	{
		try
		{
			gametype = stream.readUTF();
			sortedByTeam = stream.readBoolean();
			if(sortedByTeam)
			{
				numLines = numTeams = stream.readInt();
				if(numTeams == 0)
					return;
				teamData = new TeamData[numTeams];
				for(int i = 0; i < numTeams; i++)
				{
					teamData[i] = new TeamData();
					String teamName = stream.readUTF();
					if(teamName.equals("none"))
						continue;
					teamData[i].team = Team.getTeam(teamName);
					teamData[i].score = stream.readInt();
					teamData[i].numPlayers = stream.readInt();
					teamData[i].playerData = new PlayerData[teamData[i].numPlayers];
					numLines += teamData[i].numPlayers;
					for(int j = 0; j < teamData[i].numPlayers; j++)
					{
						teamData[i].playerData[j] = new PlayerData();
						teamData[i].playerData[j].username = stream.readUTF();
						teamData[i].playerData[j].score = stream.readInt();
						teamData[i].playerData[j].kills = stream.readInt();
						teamData[i].playerData[j].deaths = stream.readInt();
					}
				}
			}
			else
			{
				numLines = 0;
				teamData = new TeamData[] { new TeamData() };
				teamData[0].team = null;
				teamData[0].score = 0;
				teamData[0].numPlayers = stream.readInt();
				teamData[0].playerData = new PlayerData[teamData[0].numPlayers];
				numLines += teamData[0].numPlayers;
				for(int j = 0; j < teamData[0].numPlayers; j++)
				{
					teamData[0].playerData[j] = new PlayerData();
					teamData[0].playerData[j].username = stream.readUTF();
					teamData[0].playerData[j].score = stream.readInt();
					teamData[0].playerData[j].kills = stream.readInt();
					teamData[0].playerData[j].deaths = stream.readInt();
				}
			}
		}
        catch(Exception e)
        {
        	FlansMod.log("Error reading team info packet");
        	e.printStackTrace();
        }
	}
	
	public void drawScreen(int i, int j, float f)
	{
		long newTime = mc.theWorld.getWorldInfo().getWorldTime();
		ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
		int k = scaledresolution.getScaledWidth();
		int l = scaledresolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);
		GL11.glBindTexture(3553 /*GL_TEXTURE_2D*/, mc.renderEngine.getTexture("/gui/teamsScores.png"));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int guiHeight = 34 + 9 * numLines;
		int m = k / 2 - 128;
		int n = l / 2 - guiHeight / 2;
		drawTexturedModalRect(m, n, 0, 45, 256, 24);
		for(int p = 0; p < numLines; p++)
			drawTexturedModalRect(m, n + 24 + 9 * p, 0, 71, 256, 9);
		drawTexturedModalRect(m, l / 2 + guiHeight / 2 - 10, 0, 87, 256, 10);
		
		//No idea why this works, but it makes the text bind its texture correctly
		mc.renderEngine.bindTexture("/terrain.png");
		
		drawCenteredString(fontRenderer, gametype, k / 2, n + 4, 0xffffff);
		drawString(fontRenderer, "Name", m + 8, n + 14, 0xffffff);
		drawString(fontRenderer, "Score", m + 100, n + 14, 0xffffff);
		drawString(fontRenderer, "Kills", m + 150, n + 14, 0xffffff);
		drawString(fontRenderer, "Deaths", m + 200, n + 14, 0xffffff);
		int line = 0;
		if(sortedByTeam)
		{
			for(int p = 0; p < numTeams; p++)
			{
				if(teamData[p] == null || teamData[p].team == null)
					continue;
				drawString(fontRenderer, "\u00a7" + teamData[p].team.textColour + teamData[p].team.name, m + 8, n + 25 + 9 * line, 0xffffff);
				drawString(fontRenderer, "" + teamData[p].team.score, m + 100, n + 25 + 9 * line, 0xffffff);
				line++;
				for(int q = 0; q < teamData[p].numPlayers; q++)
				{
					drawString(fontRenderer, teamData[p].playerData[q].username, m + 8, n + 25 + 9 * line, 0xffffff);
					drawString(fontRenderer, "" + teamData[p].playerData[q].score, m + 100, n + 25 + 9 * line, 0xffffff);
					drawString(fontRenderer, "" + teamData[p].playerData[q].kills, m + 150, n + 25 + 9 * line, 0xffffff);
					drawString(fontRenderer, "" + teamData[p].playerData[q].deaths, m + 200, n + 25 + 9 * line, 0xffffff);
					line++;
				}
			}
		}
		else
		{
			for(int q = 0; q < teamData[0].numPlayers; q++)
			{
				drawString(fontRenderer, teamData[0].playerData[q].username, m + 8, n + 25 + 9 * line, 0xffffff);
				drawString(fontRenderer, "" + teamData[0].playerData[q].score, m + 100, n + 25 + 9 * line, 0xffffff);
				drawString(fontRenderer, "" + teamData[0].playerData[q].kills, m + 150, n + 25 + 9 * line, 0xffffff);
				drawString(fontRenderer, "" + teamData[0].playerData[q].deaths, m + 200, n + 25 + 9 * line, 0xffffff);
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
