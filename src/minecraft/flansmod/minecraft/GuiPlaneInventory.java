package flansmod.minecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiContainer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.RenderHelper;
import net.minecraft.src.World;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import flansmod.common.ContainerPlaneInventory;
import flansmod.common.EntityDriveable;
import flansmod.common.EntityPlane;

public class GuiPlaneInventory extends GuiContainer
{
    public GuiPlaneInventory(InventoryPlayer inventoryplayer, World world1, EntityDriveable entPlane, int i)
    {
        super(new ContainerPlaneInventory(inventoryplayer, world1, entPlane, i));
		plane = entPlane;
		inventory = inventoryplayer;
		world = world1;
		container = (ContainerPlaneInventory)inventorySlots;
		ySize = 180;
		screen = i;
		maxScroll = container.maxScroll;
		numItems = container.numItems;
    }
	
    protected void drawGuiContainerForegroundLayer()
    {
		String wololo = " - Guns";
		if(screen == 1) wololo = (plane instanceof EntityPlane ? " - Bombs" : " - Shells");
		if(screen == 2) wololo = " - Cargo";
        fontRenderer.drawString(plane.superType.name + wololo, 6, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);

		RenderHelper.enableGUIStandardItemLighting();
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
		if(screen == 0)
		{
			int slotsDone = 0;
			for(int i = 0; i < plane.superData.guns.length; i++)
			{
				if(slotsDone >= 3 + scroll)
					continue;
				if(plane.superData.guns[i] != null)
				{
					if(slotsDone >= scroll)
					{
						fontRenderer.drawString(getGunSlotName(i), 53, 29 + 19 * (slotsDone - scroll), 0x000000);
						drawStack(new ItemStack(plane.superData.guns[i].getItem()), 10, 25 + 19 * (slotsDone - scroll));
					}
					slotsDone++;
				}
			}
			if(slotsDone == 0)
			{
				fontRenderer.drawString("Add guns in the crafting", 10, 29, 0x000000);
				fontRenderer.drawString("table", 10, 39, 0x000000);
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
        itemRenderer.renderItemIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
        itemRenderer.renderItemOverlayIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
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

    protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
    {
        int i = mc.renderEngine.getTexture("/gui/planeInventory.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
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
			{
				int m = (int)((numItems + 7) / 8);
				for(int row = 0; row < (m > 3 ? 3 : m); row++)
				{
					drawTexturedModalRect(j + 9, k + 24 + 19 * row, 7, 97, 18 * ((row + scroll + 1) * 8 < numItems ? 8 : numItems % 8), 18);
				}
				break;
			}
		}
		if(scroll == 0)
			drawTexturedModalRect(j + 161, k + 41, 176, 18, 10, 10);
		if(scroll == maxScroll)
			drawTexturedModalRect(j + 161, k + 53, 176, 28, 10, 10);
    }
	
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
			 mc.displayGuiScreen(new GuiPlaneMenu(inventory, world, plane));
	}

	public ContainerPlaneInventory container;
	public InventoryPlayer inventory;
	public World world;
	public int scroll;
	public int numItems;
	public int maxScroll;
	public EntityDriveable plane;
	public int screen; //0 = Guns, 1 = Bombs, 2 = Cargo
}
