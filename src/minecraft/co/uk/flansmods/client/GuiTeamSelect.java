package co.uk.flansmods.client;

import co.uk.flansmods.common.teams.Team;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.ItemStack;
import net.minecraft.src.RenderItem;

public class GuiTeamSelect extends GuiScreen 
{
	private static RenderItem itemRenderer = new RenderItem();
	private Team[] teamChoices;
	
	public GuiTeamSelect(Team[] teams)
	{
		teamChoices = teams;
		width = 176;
		height = 29 + 22 * teams.length;
	}
	
	public void initGui()
	{
		super.initGui();
		for(int i = 0; i < teamChoices.length; i++)
		{
			controlList.add(new GuiButton(i, 8, height - 24 - 22 * i, 67, 18, "\u00a7" + teamChoices[i].textColour + teamChoices[i].name));
		}
	}
	
	public void drawScreen(int i, int j, float f)
	{
	}
	
	private void drawSlotInventory(ItemStack itemstack, int i, int j)
	{
		itemRenderer.renderItemIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
	}
	
	public boolean doesGuiPauseGame()
	{
		return false;
	}
	
	protected void keyTyped(char c, int i)
	{
		if (i == 1 || i == mc.gameSettings.keyBindInventory.keyCode)
		{
			mc.thePlayer.closeScreen();
		}
	}

}
