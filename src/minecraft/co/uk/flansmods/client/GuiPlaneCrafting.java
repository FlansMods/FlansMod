package co.uk.flansmods.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.ContainerPlaneCrafting;


public class GuiPlaneCrafting extends GuiContainer
{
	private static final ResourceLocation bigTexture = new ResourceLocation("flansmod", "gui/planeCraftingLarge.png");
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/planeCrafting.png");
	
    public GuiPlaneCrafting(InventoryPlayer inventoryplayer, World world, int i, int j, int k, boolean bigger)
    {
        super(new ContainerPlaneCrafting(inventoryplayer, world, i, j, k, bigger));
		big = bigger;
		ySize = big ? 238 : 202;
    }

    public void onGuiClosed()
    {
        super.onGuiClosed();
        inventorySlots.onContainerClosed(mc.thePlayer);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int i, int j)
    {
        fontRenderer.drawString((big ? "Large" : "Small") + " Plane Crafting", 6, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
        fontRenderer.drawString("Blueprints", 108, 6 + (big ? 18 : 0), 0x101080);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.func_110577_a(big ? bigTexture : texture);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		if(blueStart == 0)
			drawTexturedModalRect(j + 124, k + 38 + (big ? 18 : 0), 176, 0, 10, 10);
		if(blueStart > FlansModClient.blueprintsUnlocked.size() - 4)
			drawTexturedModalRect(j + 136, k + 38 + (big ? 18 : 0), 186, 0, 10, 10);
		for(int n = 0; n < (FlansModClient.blueprintsUnlocked.size() < 3 ? FlansModClient.blueprintsUnlocked.size() : 3); n++)
		{
			drawStack(new ItemStack(FlansModClient.blueprintsUnlocked.get(n + blueStart).itemID, 1, 1), j + 109 + n * 18, k + 18 + (big ? 18 : 0));
		}
    }
	
	protected void mouseClicked(int i, int j, int k)
    {
        super.mouseClicked(i, j, k);
		int m = i - (width - xSize) / 2;
		int n = j - (height - ySize) / 2;
		if(blueStart > 0 && m > 125 && m < 135 && n > 39 + (big ? 18 : 0) && n < 49 + (big ? 18 : 0))
			blueStart--;
		if(blueStart < FlansModClient.blueprintsUnlocked.size() - 3 && m > 136 && m < 146 && n > 39 + (big ? 18 : 0) && n < 49 + (big ? 18 : 0))
			blueStart++;
		//Blueprint slots
		for(int p = 0; p < 3; p++)
		{
			if(p + blueStart < FlansModClient.blueprintsUnlocked.size() && m > 108 + 18 * p && m < 126 + 18 * p && n > 18 + (big ? 18 : 0) && n < 36 + (big ? 18 : 0))
				((ContainerPlaneCrafting)inventorySlots).clickedBlueprint(p + blueStart);
		}
	}

	private void drawStack(ItemStack itemstack, int i, int j)
    {
        itemRenderer.renderItemIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
        itemRenderer.renderItemOverlayIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
    }
	
	private static int blueStart = 0;
	private boolean big;
}
