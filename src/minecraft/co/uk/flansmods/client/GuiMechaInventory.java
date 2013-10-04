package co.uk.flansmods.client;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import co.uk.flansmods.common.driveables.mechas.ContainerMechaInventory;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiMechaInventory extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/mechaInventory.png");

	public ContainerMechaInventory container;
	public InventoryPlayer inventory;
	public World world;
	public int scroll;
	public int numItems;
	public int maxScroll;
	public EntityMecha mecha;
	
    public GuiMechaInventory(InventoryPlayer inventoryplayer, World world1, EntityMecha entMecha)
    {
        super(new ContainerMechaInventory(inventoryplayer, world1, entMecha));
		mecha = entMecha;
		inventory = inventoryplayer;
		world = world1;
		container = (ContainerMechaInventory)inventorySlots;
		ySize = 180;
		xSize = 350;
		maxScroll = container.maxScroll;
		numItems = container.numItems;
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y)
    {
        fontRenderer.drawString(mecha.getMechaType().name, 6, 6, 0x404040);
        fontRenderer.drawString("Inventory", 181, (ySize - 96) + 2, 0x404040);
    }
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
	{
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        mc.renderEngine.bindTexture(texture);

        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		int numRows = ((numItems + 7) / 8);
		for(int row = 0; row < (numRows > 3 ? 3 : numRows); row++)
		{
			drawTexturedModalRect(j + 184, k + 24 + 19 * row, 182, 97, 18 * ((row + scroll + 1) * 8 < numItems ? 8 : numItems % 8), 18);
		}
		if(scroll == 0)
			drawTexturedModalRect(j + 336, k + 41, 351, 0, 10, 10);
		if(scroll == maxScroll)
			drawTexturedModalRect(j + 336, k + 53, 351, 10, 10, 10);
	}
	
	@Override
    public void drawTexturedModalRect(int par1, int par2, int par3, int par4, int par5, int par6)
    {
        float f = 1F / 512F;
        float f1 = 1F / 256F;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((double)(par1 + 0), (double)(par2 + par6), (double)this.zLevel, (double)((float)(par3 + 0) * f), (double)((float)(par4 + par6) * f1));
        tessellator.addVertexWithUV((double)(par1 + par5), (double)(par2 + par6), (double)this.zLevel, (double)((float)(par3 + par5) * f), (double)((float)(par4 + par6) * f1));
        tessellator.addVertexWithUV((double)(par1 + par5), (double)(par2 + 0), (double)this.zLevel, (double)((float)(par3 + par5) * f), (double)((float)(par4 + 0) * f1));
        tessellator.addVertexWithUV((double)(par1 + 0), (double)(par2 + 0), (double)this.zLevel, (double)((float)(par3 + 0) * f), (double)((float)(par4 + 0) * f1));
        tessellator.draw();
    }

}
