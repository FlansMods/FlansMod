package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.ContainerDriveableInventory;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.network.PacketDriveableGUI;

public class GuiDriveableInventory extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/planeInventory.png");

	public ContainerDriveableInventory container;
	public InventoryPlayer inventory;
	public World world;
	public int scroll;
	public int numItems;
	public int maxScroll;
	public EntityDriveable driveable;
	public int screen; //0 = Guns, 1 = Bombs, 2 = Cargo
	
    public GuiDriveableInventory(InventoryPlayer inventoryplayer, World world1, EntityDriveable entPlane, int i)
    {
        super(new ContainerDriveableInventory(inventoryplayer, world1, entPlane, i));
		driveable = entPlane;
		inventory = inventoryplayer;
		world = world1;
		container = (ContainerDriveableInventory)inventorySlots;
		ySize = 180;
		screen = i;
		maxScroll = container.maxScroll;
		numItems = container.numItems;
    }
	
    @Override
	protected void drawGuiContainerForegroundLayer(int x, int y)
    {
		String title = " - Guns";
		if(screen == 1) title = " - " + driveable.getBombInventoryName();
		if(screen == 2) title = " - Cargo";
		if(screen == 3) title = " - " + driveable.getMissileInventoryName();
        fontRendererObj.drawString(driveable.getDriveableType().name + title, 6, 6, 0x404040);
        fontRendererObj.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);

		RenderHelper.enableGUIStandardItemLighting();
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
		if(screen == 0)
		{
			int slotsDone = 0;
			for(int i = 0; i < driveable.getDriveableType().seats.length; i++)
			{
				if(slotsDone >= 3 + scroll)
					continue;
				if(driveable.getDriveableType().seats[i].gunType != null)
				{
					if(slotsDone >= scroll)
					{
						fontRendererObj.drawString(driveable.getDriveableType().seats[i].gunName, 53, 29 + 19 * (slotsDone - scroll), 0x000000);
						drawStack(new ItemStack(driveable.getDriveableType().seats[i].gunType.getItem()), 10, 25 + 19 * (slotsDone - scroll));
					}
					slotsDone++;
				}
			}
			for(int i = 0; i < driveable.getDriveableType().pilotGuns.size(); i++)
			{
				if(slotsDone >= 3 + scroll)
					continue;
				if(driveable.getDriveableType().pilotGuns.get(i).type != null)
				{
					if(slotsDone >= scroll)
					{
						fontRendererObj.drawString("Driver's gun " + (i + 1), 53, 29 + 19 * (slotsDone - scroll), 0x000000);
						drawStack(new ItemStack(driveable.getDriveableType().pilotGuns.get(i).type.getItem()), 10, 25 + 19 * (slotsDone - scroll));
					}
					slotsDone++;
				}
			}
		}
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
    }
	
	private void drawStack(ItemStack itemstack, int i, int j)
    {
		itemRender.renderItemIntoGUI(fontRendererObj, mc.renderEngine, itemstack, i, j);
		itemRender.renderItemOverlayIntoGUI(fontRendererObj, mc.renderEngine, itemstack, i, j);
    }
	
	private static String getGunSlotName(int i)
	{
		switch(i)
		{
			case 0 : return "Left Nose Gun";
			case 1 : return "Right Nose Gun";
			case 2 : return "Left Wing Gun";
			case 3 : return "Right Wing Gun";
			case 4 : return "Tail Gun";
			case 5 : return "Left Bay Gun";
			case 6 : return "Right Bay Gun";
			case 7 : return "Dorsal Gun";
		}		
		return "Not a Gun";
	}

    @Override
	protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        mc.renderEngine.bindTexture(texture);
        
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		switch(screen)
		{
			case 0 : 
			{
				for(int n = 0; n < (numItems > 3 ? 3 : numItems); n++)
				{
					drawTexturedModalRect(j + 9, k + 24 + 19 * n, 176, 0, 37, 18);
				}
				break;
			}
			case 1 :
			case 2 :
			case 3 : 
			{
				int m = ((numItems + 7) / 8);
				for(int row = 0; row < (m > 3 ? 3 : m); row++)
				{
					drawTexturedModalRect(j + 9, k + 24 + 19 * row, 7, 97, 18 * ((row + scroll + 1) * 8 <= numItems ? 8 : numItems % 8), 18);
				}
				break;
			}
		}
		if(scroll == 0)
			drawTexturedModalRect(j + 161, k + 41, 176, 18, 10, 10);
		if(scroll == maxScroll)
			drawTexturedModalRect(j + 161, k + 53, 176, 28, 10, 10);
    }
	
	@Override
	protected void mouseClicked(int i, int j, int k)
    {
        super.mouseClicked(i, j, k);
		int m = i - (width - xSize) / 2;
		int n = j - (height - ySize) / 2;
		if(scroll > 0 && m > 161 && m < 171 && n > 41 && n < 51)
		{
			scroll--;
			container.updateScroll(scroll);
		}
		if(scroll < maxScroll && m > 161 && m < 171 && n > 53 && n < 63)
		{
			scroll++;
			container.updateScroll(scroll);
		}
		if(m > 161 && m < 171 && n > 5 && n < 15)
		{
			if(driveable instanceof EntityMecha)
			{
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
				(inventory.player).openGui(FlansMod.INSTANCE, 10, world, driveable.chunkCoordX, driveable.chunkCoordY, driveable.chunkCoordZ);
			}
			else
			 mc.displayGuiScreen(new GuiDriveableMenu(inventory, world, driveable));
		}
    }
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
