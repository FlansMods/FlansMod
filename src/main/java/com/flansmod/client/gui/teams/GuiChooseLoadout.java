package com.flansmod.client.gui.teams;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;

import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.LoadoutPool;
import com.flansmod.common.teams.PlayerRankData;
import com.flansmod.common.teams.TeamsManagerRanked;

public class GuiChooseLoadout extends GuiTeamsBase
{
	/**
	 * The background image
	 */
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/LandingPage.png");
	
	public GuiChooseLoadout()
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
		guiOriginX = w / 2 - 128;
		guiOriginY = h / 2 - 99;
		
		PlayerRankData data = ClientTeamsData.theRankData;
		LoadoutPool pool = ClientTeamsData.currentPool;
		
		if(data == null || pool == null)
		{
			FlansMod.log.warn("Problem in choose loadout page!");
			return;
		}
		
		for(int i = 0; i < 5; i++)
		{
			if(data.currentLevel >= pool.slotUnlockLevels[i])
			{
				buttonList.add(
						new GuiButton(i, width / 2 - 128 + 12 + 49 * i, height / 2 - 99 + 117, 36, 20, "Select"));
			}
		}
		
		buttonList.add(new GuiButton(5, width / 2 - 128 + 7, height / 2 - 99 + 144, 88, 20, "<< Change Team"));
	}
	
	@Override
	protected void actionPerformed(GuiButton button)
	{
		if(button.id >= 0 && button.id < 5)
		{
			TeamsManagerRanked.ChooseLoadout(button.id);
			FMLClientHandler.instance().getClient().displayGuiScreen(null);
		}
		
		if(button.id == 5)
		{
			//Go back to team select
			ClientTeamsData.OpenTeamSelectPage();
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
		guiOriginX = w / 2 - 128;
		guiOriginY = h / 2 - 99;
		
		//Bind the background texture
		mc.renderEngine.bindTexture(texture);
		
		int textureX = 512;
		int textureY = 256;
		PlayerRankData data = ClientTeamsData.theRankData;
		LoadoutPool pool = ClientTeamsData.currentPool;
		
		if(data == null || pool == null)
		{
			FlansMod.log.warn("Problem in choose loadout page!");
			return;
		}
		
		//Draw the background
		drawModalRectWithCustomSizedTexture(guiOriginX, guiOriginY, 0, 0, 256, 143, textureX, textureY);
		drawModalRectWithCustomSizedTexture(guiOriginX, guiOriginY + 143, 256, 180, 256, 76, textureX, textureY);
		
		// Draw text
		drawCenteredString(fontRenderer, "Choose a loadout", guiOriginX + 128, guiOriginY + 12, 0xffffff);
		
		// Draw loadout panels
		for(int n = 0; n < 5; n++)
		{
			DrawLoadoutPanel(pool, data, guiOriginX + 7 + 49 * n, guiOriginY + 28, n);
		}
		
		super.drawScreen(i, j, f);
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
