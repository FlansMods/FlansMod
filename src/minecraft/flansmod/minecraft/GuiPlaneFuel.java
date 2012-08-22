package flansmod.minecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiContainer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.World;

import org.lwjgl.opengl.GL11;

import flansmod.common.ContainerPlaneMenu;
import flansmod.common.EntityDriveable;

public class GuiPlaneFuel extends GuiContainer
{
    public GuiPlaneFuel(InventoryPlayer inventoryplayer, World world1, EntityDriveable entPlane)
    {
        super(new ContainerPlaneMenu(inventoryplayer, world1, true, entPlane));
		plane = entPlane;
		ySize = 161;
		world = world1;
		inventory = inventoryplayer;
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString(plane.superType.name + " - Fuel", 6, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
    {
		long newTime = mc.theWorld.getWorldInfo().getWorldTime();
		if(newTime > lastTime)
		{
			lastTime = newTime;
			if(newTime % 5 == 0)
				anim++;
		}
        int i = mc.renderEngine.getTexture("/gui/planeFuel.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		int fuelTankSize = plane.superType.tankSize;
		int fuelInTank = plane.superData.fuelInTank;
		if(plane.fuelling)
			drawTexturedModalRect(j + 15, k + 44, 176 + 15 * (anim % 4), 0, 15, 16);
		if(fuelInTank < fuelTankSize / 8 && (anim % 4) > 1)
			drawTexturedModalRect(j + 16, k + 25, 176, 16, 6, 6);
		if(fuelInTank > 0)
			drawTexturedModalRect(j + 26, k + 21, 0, 161, (129 * fuelInTank) / fuelTankSize, 15);
    }
	
	protected void mouseClicked(int i, int j, int k)
    {
        super.mouseClicked(i, j, k);
		int m = i - (width - xSize) / 2;
		int n = j - (height - ySize) / 2;
		if(m > 161 && m < 171 && n > 5 && n < 15)
			 mc.displayGuiScreen(new GuiPlaneMenu(inventory, world, plane));
	}

	public World world;
	public InventoryPlayer inventory;
	public EntityDriveable plane;
	private int anim = 0;
	private long lastTime;
}
