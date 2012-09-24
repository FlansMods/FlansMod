package co.uk.flansmods.client;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.network.PacketTeamSelect;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.ItemStack;
import net.minecraft.src.RenderEngine;
import net.minecraft.src.RenderItem;

public class GuiTeamSelect extends GuiScreen 
{
	private static RenderItem itemRenderer = new RenderItem();
	private boolean classMenu;
	//This is static so that players may switch teams whenever they wish. 
	//This is updated because the server forces players to pick teams when the teams change
	private static Team[] teamChoices;
	private PlayerClass[] classChoices;
	
	private int guiHeight;
	
	//For changing team when you want to, as opposed to when the server forces you to.
	public GuiTeamSelect()
	{
		classMenu = false;
		guiHeight = 29 + 24 * teamChoices.length;
	}
	
	public GuiTeamSelect(Team[] teams)
	{
		classMenu = false;
		teamChoices = teams;
		guiHeight = 29 + 24 * teams.length;
	}
	
	public GuiTeamSelect(PlayerClass[] classes)
	{
		classMenu = true;
		classChoices = classes;
		guiHeight = 29 + 24 * classes.length;
	}
		
	public void initGui()
	{
		super.initGui();
		if(classMenu)
		{
			for(int i = 0; i < classChoices.length; i++)
			{
				if(classChoices[i] != null)
					controlList.add(new GuiButton(i, width / 2 - 79, height / 2 - guiHeight / 2 + 24 + 24 * i, 67, 20, classChoices[i].name));
			}
		}
		else
		{
			for(int i = 0; i < teamChoices.length; i++)
			{
				if(teamChoices[i] != null)
					controlList.add(new GuiButton(i, width / 2 - 78, height / 2 - guiHeight / 2 + 24 + 24 * i, 154, 20, "\u00a7" + teamChoices[i].textColour + teamChoices[i].name));
			}
		}
	}
	
	public void drawScreen(int i, int j, float f)
	{
		
		//TODO : Draw the inventory BG and slots for the class menu
		int texID = mc.renderEngine.getTexture("/gui/teams.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(texID);
		drawTexturedModalRect(width / 2 - 88, height / 2 - guiHeight / 2, 0, 0, 176, 22);
		drawTexturedModalRect(width / 2 - 88, height / 2 + guiHeight / 2 - 6, 0, 73, 176, 7);
		if(classMenu)
		{
			for(int n = 0; n < classChoices.length; n++)
			{
				drawTexturedModalRect(width / 2 - 88, height / 2 - guiHeight / 2 + 22 + 24 * n, 0, 23, 176, 24);		
			}
		}
		else
		{
			for(int n = 0; n < teamChoices.length; n++)
			{
				drawTexturedModalRect(width / 2 - 88, height / 2 - guiHeight / 2 + 22 + 24 * n, 0, 48, 176, 24);		
			}
		}
		super.drawScreen(i, j, f);
	}
	
	protected void actionPerformed(GuiButton button)
    {
		if(classMenu)
			PacketDispatcher.sendPacketToServer(PacketTeamSelect.buildSelectionPacket(classChoices[button.id].shortName, true));
		else
			PacketDispatcher.sendPacketToServer(PacketTeamSelect.buildSelectionPacket(teamChoices[button.id].shortName, false));
		Minecraft.getMinecraft().displayGuiScreen(null);
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
