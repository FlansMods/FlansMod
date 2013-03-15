package co.uk.flansmods.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.network.PacketTeamSelect;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;
import co.uk.flansmods.common.teams.TeamsManager;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.PacketDispatcher;

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
		if(teamChoices == null)
		{
			FMLClientHandler.instance().getClient().displayGuiScreen(null);
			return;		
		}
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
					buttonList.add(new GuiButton(i, width / 2 - 128 + 9, height / 2 - guiHeight / 2 + 24 + 24 * i, 73, 20, classChoices[i].name));
			}
		}
		else
		{
			if(teamChoices == null)
			{
				FMLClientHandler.instance().getClient().displayGuiScreen(null);
				return;		
			}
			for(int i = 0; i < teamChoices.length; i++)
			{
				if(teamChoices[i] != null)
					buttonList.add(new GuiButton(i, width / 2 - 128 + 10, height / 2 - guiHeight / 2 + 24 + 24 * i, 236, 20, "\u00a7" + teamChoices[i].textColour + teamChoices[i].name));
			}
		}
	}
	
	public void drawScreen(int i, int j, float f)
	{
		//TODO : Draw the inventory BG and slots for the class menu
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.func_98187_b("/gui/teams.png");
		drawTexturedModalRect(width / 2 - 128, height / 2 - guiHeight / 2, 0, 0, 256, 22);
		drawTexturedModalRect(width / 2 - 128, height / 2 + guiHeight / 2 - 6, 0, 73, 256, 7);
		if(classMenu)
		{
			for(int n = 0; n < classChoices.length; n++)
			{
				drawTexturedModalRect(width / 2 - 128, height / 2 - guiHeight / 2 + 22 + 24 * n, 0, 23, 256, 24);		
			}
		}
		else
		{
			for(int n = 0; n < teamChoices.length; n++)
			{
				drawTexturedModalRect(width / 2 - 128, height / 2 - guiHeight / 2 + 22 + 24 * n, 0, 48, 256, 24);		
			}
		}
		fontRenderer.drawStringWithShadow(classMenu ? "Choose a Class" : "Choose a Team", width / 2 - 120, height / 2 - guiHeight / 2 + 8, 0xffffff);

		super.drawScreen(i, j, f);
		if(classMenu)
		{
			for(int n = 0; n < classChoices.length; n++)
			{
				for(int m = 0; m < classChoices[n].startingItems.size(); m++)
				{
					drawSlotInventory(classChoices[n].startingItems.get(m), width / 2 - 128 + 85 + 18 * m, height / 2 - guiHeight / 2 + 26 + 24 * n);
				}
			}
		}
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
	    	if(classMenu)
	    	{
	    		if(classChoices != null && classChoices.length > 0)
	    			PacketDispatcher.sendPacketToServer(PacketTeamSelect.buildSelectionPacket(classChoices[0].shortName, true));
	    	}
	    	else PacketDispatcher.sendPacketToServer(PacketTeamSelect.buildSelectionPacket(Team.spectators.shortName, false));
		}
	}
	
    public void onGuiClosed() 
    {

    }

}
