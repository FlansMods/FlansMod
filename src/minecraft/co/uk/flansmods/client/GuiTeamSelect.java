package co.uk.flansmods.client;

import co.uk.flansmods.client.network.PacketTeamSelect;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.ItemStack;
import net.minecraft.src.RenderItem;

public class GuiTeamSelect extends GuiScreen 
{
	private static RenderItem itemRenderer = new RenderItem();
	private boolean classMenu;
	private Team[] teamChoices;
	private PlayerClass[] classChoices;
	
	public GuiTeamSelect(Team[] teams)
	{
		classMenu = false;
		teamChoices = teams;
		width = 176;
		height = 29 + 22 * teams.length;
	}
	
	public GuiTeamSelect(PlayerClass[] classes)
	{
		classMenu = true;
		classChoices = classes;
		width = 176;
		height = 29 + 22 * classes.length;
	}
		
	public void initGui()
	{
		super.initGui();
		if(classMenu)
		{
			for(int i = 0; i < classChoices.length; i++)
			{
				controlList.add(new GuiButton(i, 8, height - 24 - 22 * i, 67, 18, classChoices[i].name));
			}
		}
		else
		{
			for(int i = 0; i < teamChoices.length; i++)
			{
				controlList.add(new GuiButton(i, 8, height - 24 - 22 * i, 67, 18, "\u00a7" + teamChoices[i].textColour + teamChoices[i].name));
			}
		}
	}
	
	public void drawScreen(int i, int j, float f)
	{
		//TODO : Draw the inventory BG and slots for the class menu
	}
	
	protected void actionPerformed(GuiButton button)
    {
		if(classMenu)
			PacketDispatcher.sendPacketToServer(PacketTeamSelect.buildSelectionPacket(classChoices[button.id].shortName, true));
		else
			PacketDispatcher.sendPacketToServer(PacketTeamSelect.buildSelectionPacket(teamChoices[button.id].shortName, false));
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
