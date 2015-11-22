package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import com.flansmod.common.driveables.ContainerDriveableMenu;
import com.flansmod.common.driveables.EntityDriveable;


public class GuiDriveableFuel extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/planeFuel.png");

    public GuiDriveableFuel(InventoryPlayer inventoryplayer, World world1, EntityDriveable entPlane)
    {
        super(new ContainerDriveableMenu(inventoryplayer, world1, true, entPlane));
		plane = entPlane;
		ySize = 161;
		world = world1;
		inventory = inventoryplayer;
    }

    @Override
	protected void drawGuiContainerForegroundLayer(int i, int j)
    {
        fontRendererObj.drawString(plane.getDriveableType().name + " - Fuel", 6, 6, 0x404040);
        fontRendererObj.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

    @Override
	protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
    {
		long newTime = mc.theWorld.getWorldInfo().getWorldTime();
		if(newTime > lastTime)
		{
			lastTime = newTime;
			if(newTime % 5 == 0)
				anim++;
		}
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        mc.renderEngine.bindTexture(texture);

        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		int fuelTankSize = plane.getDriveableType().fuelTankSize;
		float fuelInTank = plane.driveableData.fuelInTank;
		if(plane.fuelling)
			drawTexturedModalRect(j + 15, k + 44, 176 + 15 * (anim % 4), 0, 15, 16);
		if(fuelInTank < fuelTankSize / 8 && (anim % 4) > 1)
			drawTexturedModalRect(j + 16, k + 25, 176, 16, 6, 6);
		if(fuelInTank > 0)
			drawTexturedModalRect(j + 26, k + 21, 0, 161, (int)((129 * fuelInTank) / fuelTankSize), 15);
    }
	
	@Override
	protected void mouseClicked(int i, int j, int k)
    {
        super.mouseClicked(i, j, k);
		int m = i - (width - xSize) / 2;
		int n = j - (height - ySize) / 2;
		if(m > 161 && m < 171 && n > 5 && n < 15)
		{
			 mc.displayGuiScreen(new GuiDriveableMenu(inventory, world, plane));
		}
	}

	public World world;
	public InventoryPlayer inventory;
	public EntityDriveable plane;
	private int anim = 0;
	private long lastTime;
}
