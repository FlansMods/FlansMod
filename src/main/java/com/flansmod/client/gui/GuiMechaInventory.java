package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.RenderMecha;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.mechas.ContainerMechaInventory;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.MechaType;

public class GuiMechaInventory extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/mechaInventory.png");
	private static final RenderMecha mechaRenderer;
	static
	{
		mechaRenderer = new RenderMecha();
		mechaRenderer.setRenderManager(RenderManager.instance);
	}
	
	public ContainerMechaInventory container;
	public InventoryPlayer inventory;
	public World world;
	public int scroll;
	public int numItems;
	public int maxScroll;
	public EntityMecha mecha;
	private int anim = 0;
	private long lastTime;
	
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
    public void drawScreen(int i, int j, float f)
    {
    	super.drawScreen(i, j, f);

		
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y)
    {
        fontRendererObj.drawString(mecha.getMechaType().name, 9, 9, 0x404040);
        fontRendererObj.drawString("Inventory", 181, (ySize - 96) + 2, 0x404040);
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
			drawTexturedModalRect(j + 185, k + 24 + 19 * row, 181, 97, 18 * ((row + scroll + 1) * 8 <= numItems ? 8 : numItems % 8), 18);
		}
		if(scroll == 0)
			drawTexturedModalRect(j + 336, k + 41, 350, 0, 10, 10);
		if(scroll == maxScroll)
			drawTexturedModalRect(j + 336, k + 53, 350, 10, 10, 10);
	
		long newTime = mc.theWorld.getWorldInfo().getWorldTime();
		if(newTime > lastTime)
		{
			lastTime = newTime;
			if(newTime % 5 == 0)
				anim++;
		}
		int fuelTankSize = mecha.getMechaType().fuelTankSize;
		float fuelInTank = mecha.driveableData.fuelInTank;
		if(fuelInTank < fuelTankSize / 8 && (anim % 4) > 1)
			drawTexturedModalRect(width / 2 - 14, height / 2 - 59, 360, 0, 6, 6);
		if(fuelInTank > 0)
			drawTexturedModalRect(width / 2 - 18, height / 2 + 45 - (int)((94 * fuelInTank) / fuelTankSize), 350, 20, 15, (int)((94 * fuelInTank) / fuelTankSize));
		
        MechaType type = mecha.getMechaType();
		//Render rotating mecha model
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glTranslatef(j + 92, k + 105, 100);
		GL11.glScalef(-50F / type.cameraDistance, 50F / type.cameraDistance, 50F / type.cameraDistance);
		GL11.glRotatef(180F, 0F, 0F, 1F);
		GL11.glRotatef(30F, 1F, 0F, 0F);
		GL11.glRotatef(FlansMod.ticker, 0F, 1F, 0F);
		mc.renderEngine.bindTexture(FlansModResourceHandler.getTexture(type));
		mechaRenderer.render(mecha, 0, 0, 0, 0F, 0F);
		//type.model.render(type);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glPopMatrix();
	}
	
	@Override
    public void drawTexturedModalRect(int par1, int par2, int par3, int par4, int par5, int par6)
    {
        float f = 1F / 512F;
        float f1 = 1F / 256F;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((double)(par1), (double)(par2 + par6), (double)this.zLevel, (double)((float)(par3) * f), (double)((float)(par4 + par6) * f1));
        tessellator.addVertexWithUV((double)(par1 + par5), (double)(par2 + par6), (double)this.zLevel, (double)((float)(par3 + par5) * f), (double)((float)(par4 + par6) * f1));
        tessellator.addVertexWithUV((double)(par1 + par5), (double)(par2), (double)this.zLevel, (double)((float)(par3 + par5) * f), (double)((float)(par4) * f1));
        tessellator.addVertexWithUV((double)(par1), (double)(par2), (double)this.zLevel, (double)((float)(par3) * f), (double)((float)(par4) * f1));
        tessellator.draw();
    }

    @Override
	public void initGui()
	{
		super.initGui();
		buttonList.add(new GuiButton(0, width / 2 - 166, height / 2 + 63, 93, 20, "Passenger Guns"));
		buttonList.add(new GuiButton(1, width / 2 - 68, height / 2 + 63, 68, 20, "Repair"));
	}
	
    @Override
    protected void actionPerformed(GuiButton button)
    {
    	if(button.id == 0)
    	{
    		inventory.player.openGui(FlansMod.INSTANCE, 6, world, mecha.chunkCoordX, mecha.chunkCoordY, mecha.chunkCoordZ);
    	}
    	if(button.id == 1)
    	{
			inventory.player.openGui(FlansMod.INSTANCE, 1, world, mecha.chunkCoordX, mecha.chunkCoordY, mecha.chunkCoordZ);
    	}
    }
    
	@Override
	protected void mouseClicked(int i, int j, int k)
	{
		super.mouseClicked(i, j, k);
		int m = i - (width - xSize) / 2;
		int n = j - (height - ySize) / 2;
		if(scroll > 0 && m > 336 && m < 346 && n > 41 && n < 51)
		{
			scroll--;
			container.updateScroll(scroll);
		}
		if(scroll < maxScroll && m > 336 & m < 346 && n > 53 && n < 63)
		{
			scroll++;
			container.updateScroll(scroll);
		}
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
