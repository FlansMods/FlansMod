package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.ContainerDriveableMenu;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.network.PacketDriveableGUI;

public class GuiDriveableMenu extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/planeMenu.png");
	
	public World world;
	public InventoryPlayer inventory;
	public EntityDriveable entity;
	
    public GuiDriveableMenu(InventoryPlayer inventoryplayer, World world1, EntityDriveable entPlane)
    {
        super(new ContainerDriveableMenu(inventoryplayer, world1));
		entity = entPlane;
		ySize = 180;
		world = world1;
		inventory = inventoryplayer;
    }
	
    @Override
	public void initGui()
	{
		super.initGui();
		DriveableType type = entity.getDriveableType();
		//Cargo button
		GuiButton cargoButton = new GuiButton(0, width / 2 - 60, height / 2 - 71, 58, 20, "Cargo");
		cargoButton.enabled = type.numCargoSlots > 0;
		buttonList.add(cargoButton);
		
		//Gun button
		GuiButton gunsButton = new GuiButton(1, width / 2 + 2, height / 2 - 71, 58, 20, "Guns");
		gunsButton.enabled = type.ammoSlots() > 0;
		buttonList.add(gunsButton);
		
		//Fuel button
		GuiButton fuelButton = new GuiButton(2, width / 2 -60, height / 2 - 49, 58, 20, "Fuel");
		fuelButton.enabled = type.fuelTankSize > 0;
		buttonList.add(fuelButton);
		
		//Missile / Shell Button
		GuiButton missileButton = new GuiButton(3, width / 2 + 2, height / 2 - 49, 58, 20, entity.getMissileInventoryName());
		missileButton.enabled = type.numMissileSlots > 0;
		buttonList.add(missileButton);
		
		//Mine / Bomb Button
		GuiButton bombButton = new GuiButton(5, width / 2 + 2, height / 2 - 27, 58, 20, entity.getBombInventoryName());
		bombButton.enabled = type.numBombSlots > 0;
		buttonList.add(bombButton);
		
		//Repair button
		buttonList.add(new GuiButton(4, width / 2 - 60, height / 2 - 27, 58, 20, "Repair"));
	}
	
	@Override
	protected void actionPerformed(GuiButton button)
    {
		//Replace with a packet requesting the GUI from the server
		if(button.id == 0) //Cargo
        {
			FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(3));
			//inventory.player.openGui(FlansMod.INSTANCE, 9, world, entity.chunkCoordX, entity.chunkCoordY, entity.chunkCoordZ);
        }
        if(button.id == 1) //Guns
        {
        	FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(0));
        	//inventory.player.openGui(FlansMod.INSTANCE, 6, world, entity.chunkCoordX, entity.chunkCoordY, entity.chunkCoordZ);
        }
        if(button.id == 2) //Fuel
        {
        	FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(2));
        	//inventory.player.openGui(FlansMod.INSTANCE, 8, world, entity.chunkCoordX, entity.chunkCoordY, entity.chunkCoordZ);
        } 
        if(button.id == 3) //Missiles
        {
        	FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(5));
        	//inventory.player.openGui(FlansMod.INSTANCE, 12, world, entity.chunkCoordX, entity.chunkCoordY, entity.chunkCoordZ);
        }
		if(button.id == 4) //Repair
		{
			//No server side required. No interactive slots in this one
			inventory.player.openGui(FlansMod.INSTANCE, 1, world, entity.chunkCoordX, entity.chunkCoordY, entity.chunkCoordZ);
		}
        if(button.id == 5) //Bombs
        {
        	FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(1));
        	//inventory.player.openGui(FlansMod.INSTANCE, 7, world, entity.chunkCoordX, entity.chunkCoordY, entity.chunkCoordZ);
        }

    }

    @Override
	protected void drawGuiContainerForegroundLayer(int i, int j)
    {
        fontRendererObj.drawString(entity.getDriveableType().name, 6, 6, 0x404040);
        fontRendererObj.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

    @Override
	protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(texture);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
    }
}
