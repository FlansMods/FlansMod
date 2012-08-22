package flansmod.minecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiContainer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

import org.lwjgl.opengl.GL11;

import flansmod.common.ContainerVehicleCrafting;

public class GuiVehicleCrafting extends GuiContainer
{
    public GuiVehicleCrafting(InventoryPlayer inventoryplayer, World world, int i, int j, int k)
    {
        super(new ContainerVehicleCrafting(inventoryplayer, world, i, j, k));
		ySize = 184;
    }

    public void onGuiClosed()
    {
        super.onGuiClosed();
        inventorySlots.onCraftGuiClosed(mc.thePlayer);
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString("Vehicle Crafting", 6, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
        fontRenderer.drawString("Blueprints", 108, 6, 0x101080);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
    {
        int i = mc.renderEngine.getTexture("/gui/vehicleCrafting.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		if(blueStart == 0)
			drawTexturedModalRect(j + 124, k + 38, 176, 0, 10, 10);
		if(blueStart > ClientProxy.vehicleBlueprintsUnlocked.size() - 4)
			drawTexturedModalRect(j + 136, k + 38, 186, 0, 10, 10);
		for(int n = 0; n < (ClientProxy.vehicleBlueprintsUnlocked.size() < 3 ? ClientProxy.vehicleBlueprintsUnlocked.size() : 3); n++)
		{
			drawStack(new ItemStack(ClientProxy.vehicleBlueprintsUnlocked.get(n + blueStart).itemID, 1, 1), j + 109 + n * 18, k + 18);
		}
    }
	
	protected void mouseClicked(int i, int j, int k)
    {
        super.mouseClicked(i, j, k);
		int m = i - (width - xSize) / 2;
		int n = j - (height - ySize) / 2;
		if(blueStart > 0 && m > 125 && m < 135 && n > 39 && n < 49)
			blueStart--;
		if(blueStart < ClientProxy.vehicleBlueprintsUnlocked.size() - 3 && m > 136 && m < 146 && n > 39 && n < 49)
			blueStart++;
		//Blueprint slots
		for(int p = 0; p < 3; p++)
		{
			if(p + blueStart < ClientProxy.vehicleBlueprintsUnlocked.size() && m > 108 + 18 * p && m < 126 + 18 * p && n > 18 && n < 36)
				((ContainerVehicleCrafting)inventorySlots).clickedBlueprint(p + blueStart);
		}
	}

	private void drawStack(ItemStack itemstack, int i, int j)
    {
        itemRenderer.renderItemIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
        itemRenderer.renderItemOverlayIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
    }
	
	private static int blueStart = 0;
}
