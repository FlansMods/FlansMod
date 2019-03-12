package com.flansmod.client.gui.teams;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.LoadoutPool;
import com.flansmod.common.teams.PlayerRankData;
import com.flansmod.common.teams.RewardBox;

public class GuiLandingPage extends GuiTeamsBase
{
	/**
	 * The background image
	 */
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/LandingPage.png");
	
	private static final int WIDTH = 256, HEIGHT = 215;
	
	public GuiLandingPage()
	{
		super();
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
		
		ScaledResolution scaledresolution = new ScaledResolution(mc);
		int w = scaledresolution.getScaledWidth();
		int h = scaledresolution.getScaledHeight();
		guiOriginX = w / 2 - WIDTH / 2;
		guiOriginY = h / 2 - HEIGHT / 2;
		
		PlayerRankData data = ClientTeamsData.theRankData;
		LoadoutPool pool = ClientTeamsData.currentPool;
		
		if(data == null || pool == null)
		{
			FlansMod.log.warn("Problem in landing page!");
			mc.displayGuiScreen(null);
			return;
		}
		
		for(int i = 0; i < 5; i++)
		{
			if(data.currentLevel >= pool.slotUnlockLevels[i])
			{
				buttonList.add(
						new GuiButton(i, width / 2 - WIDTH / 2 + 12 + 49 * i, height / 2 - HEIGHT / 2 + 117, 36, 20, "Edit"));
			}
		}
		
		buttonList.add(new GuiButton(5, width / 2 - WIDTH / 2 + 202, height / 2 - HEIGHT / 2 + 162, 47, 20, "Play >>"));
		
		for(int i = 0; i < 3; i++)
		{
			int numBoxes = data.GetNumOfUnopenedBoxes(pool.rewardBoxes[i]);
			
			GuiButton button = new GuiButton(6 + i, width / 2 - WIDTH / 2 + 9 + 65 * i, height / 2 - HEIGHT / 2 + 187, 59, 20, "Open");
			button.enabled = numBoxes > 0;
			buttonList.add(button);
		}
	}
	
	@Override
	protected void actionPerformed(GuiButton button)
	{
		if(button.id >= 0 && button.id < 5)
		{
			ClientTeamsData.OpenEditLoadoutPage(button.id);
		}
		
		if(button.id == 5)
		{
			//Play - go to team select
			ClientTeamsData.OpenTeamSelectPage();
		}
		
		if(button.id >= 6 && button.id < 6 + 3)
		{
			ClientTeamsData.OpenRewardBox(button.id - 6);
		}
	}
	
	@Override
	public void drawScreen(int i, int j, float f)
	{
		ScaledResolution scaledresolution = new ScaledResolution(mc);
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
			FlansMod.log.warn("Problem in landing page!");
			mc.displayGuiScreen(null);
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
		
		drawModalRectWithCustomSizedTexture(guiOriginX + 106, guiOriginY + 146, 259, 164, (int)(92.0f * XPProgress), 16, textureX, textureY);
		
		// Draw text
		drawCenteredString(fontRenderer, ClientTeamsData.motd, guiOriginX + 128, guiOriginY + 12, 0xffffff);
		
		drawString(fontRenderer, mc.player.getName(), guiOriginX + 30, guiOriginY + 150, 0xffffff);
		drawCenteredString(fontRenderer, "Rank " + data.currentLevel, guiOriginX + 154, guiOriginY + 150, 0xffffff);
		
		// Draw rank icon
		DrawRankIcon(data.currentLevel, 0, 9, 146, false);
		
		// Draw loadout panels
		for(int n = 0; n < 5; n++)
		{
			DrawLoadoutPanel(pool, data, guiOriginX + 7 + 49 * n, guiOriginY + 28, n);
		}
		
		// Draw reward box panels
		for(int n = 0; n < 3; n++)
		{
			DrawRewardBoxPanel(pool, data, guiOriginX + 7 + 65 * n, guiOriginY + 166, n);
		}
		
		super.drawScreen(i, j, f);
	}
	
	private void DrawRewardBoxPanel(LoadoutPool pool, PlayerRankData data, int x, int y, int index)
	{
		RewardBox box = pool.rewardBoxes[index];
		drawSlotInventory(new ItemStack(box.getItem()), x + 3, y + 3);
		drawCenteredString(fontRenderer, "x " + data.GetNumOfUnopenedBoxes(box), x + 33, y + 7, 0xffffff);
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
