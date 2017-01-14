package com.flansmod.client.gui.teams;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.teams.LoadoutPool;
import com.flansmod.common.teams.PlayerRankData;
import com.flansmod.common.teams.TeamsManagerRanked;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class GuiLandingPage extends GuiTeamsBase 
{
	/** The background image */
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/LandingPage.png");
	
	private static final int WIDTH = 256, HEIGHT = 209;
	
	public GuiLandingPage()
	{
		super();
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
		
		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int w = scaledresolution.getScaledWidth();
		int h = scaledresolution.getScaledHeight();
		guiOriginX = w / 2 - WIDTH / 2;
		guiOriginY = h / 2 - HEIGHT / 2;
		
		PlayerRankData data = ClientTeamsData.theRankData;
		LoadoutPool pool = ClientTeamsData.currentPool;
		
		if(data == null || pool == null)
		{
			FlansMod.log("Problem in landing page!");
			return;
		}
		
		for(int i = 0; i < 5; i++)
		{
			if(data.currentLevel >= pool.slotUnlockLevels[i])
			{
				buttonList.add(
				 new GuiButton(i, width / 2 - WIDTH / 2 + 12 + 49 * i, height / 2 - HEIGHT / 2 + 135, 36, 20, "Edit"));
			}
		}
		
		buttonList.add(new GuiButton(5, width / 2 - WIDTH / 2 + 202, height / 2 - HEIGHT / 2 + 162, 47, 20, "Play >>"));
	}
	
	@Override
	protected void actionPerformed(GuiButton button)
	{
		if (button.id >= 0 && button.id < 5)
		{
			TeamsManagerRanked.OpenEditLoadoutPage(button.id);
		}
		
		if(button.id == 5)
		{
			//Play - go to team select
			TeamsManagerRanked.OpenTeamSelectPage();
		}
	}
		
	@Override
	public void drawScreen(int i, int j, float f)
	{
		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int w = scaledresolution.getScaledWidth();
		int h = scaledresolution.getScaledHeight();
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		guiOriginX = w / 2 - WIDTH / 2;
		guiOriginY = h / 2 - HEIGHT / 2;
		
		//Bind the background texture
		mc.renderEngine.bindTexture(texture);
		
		int textureX = 512;
		int textureY = 256;
		PlayerRankData data = ClientTeamsData.theRankData;
		LoadoutPool pool = ClientTeamsData.currentPool;
		
		if(data == null || pool == null)
		{
			FlansMod.log("Problem in landing page!");
			return;
		}
		
		//Draw the background
		drawModalRectWithCustomSizedTexture(guiOriginX, guiOriginY, 0, 0, WIDTH, HEIGHT, textureX, textureY);
		
		int XPForNextLevel = pool.GetXPForLevel(data.currentLevel + 1);
		float XPProgress = 0.0f;
		if(XPForNextLevel > 0)
		{
			XPProgress = (float)data.currentXP / (float)XPForNextLevel;
		}
		else
		{
			XPProgress = 1.0f;
		}
		
		drawModalRectWithCustomSizedTexture(guiOriginX + 106, guiOriginY + 164, 259, 164, (int)(92.0f * XPProgress), 16, textureX, textureY);
		
		// Draw text
		drawCenteredString(fontRendererObj, "Welcome to the Official Modern Server", guiOriginX + 128, guiOriginY + 12, 0xffffff);
		
		drawString(fontRendererObj, mc.thePlayer.getName(), guiOriginX + 30, guiOriginY + 168, 0xffffff);
		drawCenteredString(fontRendererObj, "Rank " + data.currentLevel, guiOriginX + 154, guiOriginY + 168, 0xffffff);
		
		// Draw rank icon
		DrawRankIcon(data.currentLevel, 0, 9, 164, false);
		
		// Draw loadout panels
		for(int n = 0; n < 5; n++)
		{
			DrawLoadoutPanel(pool, data, guiOriginX + 7 + 49 * n, guiOriginY + 28, n);
		}
		
		super.drawScreen(i, j, f);
	}	
}
