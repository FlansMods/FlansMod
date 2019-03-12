package com.flansmod.client.gui;

import java.io.IOException;
import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.network.PacketDriveableGUI;

public class GuiDriveableRepair extends GuiScreen
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/repair.png");
	
	/**
	 * The player using this GUI
	 */
	private EntityPlayer driver;
	/**
	 * The driveable (s)he is driving
	 */
	private EntityDriveable driving;
	/**
	 * The list of parts that are actually damageable
	 */
	private ArrayList<DriveablePart> partsToDraw = new ArrayList<>();
	
	/**
	 * Item renderer
	 */
	private static RenderItem itemRenderer;
	/**
	 * Gui origin
	 */
	private int guiOriginX, guiOriginY;
	
	public GuiDriveableRepair(EntityPlayer player)
	{
		super();
		driver = player;
		driving = ((EntitySeat)player.getRidingEntity()).driveable;
		for(DriveablePart part : driving.getDriveableData().parts.values())
		{
			//Check to see if the part is actually damageable
			if(part.maxHealth > 0)
			{
				//Add it to the list of parts to draw
				partsToDraw.add(part);
			}
		}
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
		for(int i = 0; i < partsToDraw.size(); i++)
		{
			buttonList.add(new GuiButton(i, 0, 0, 55, 20, "Repair"));
		}
		itemRenderer = mc.getRenderItem();
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		FlansMod.proxy.repairDriveable(driver, driving, partsToDraw.get(button.id));
	}

	private void updateButtons()
	{
		int y = 43;
		for(int i = 0; i < partsToDraw.size(); i++)
		{
			DriveablePart part = partsToDraw.get(i);
			GuiButton button = buttonList.get(i);
			button.visible = part.health <= 0;
			button.x = guiOriginX + 9;
			button.y = guiOriginY + y;
			y += part.health <= 0 ? 40 : 20;
		}
	}

	@Override
	public void drawScreen(int i, int j, float f)
	{
		int guiWidth = 202;
		//Work out the guiHeight by adding what is necessary for each part
		int guiHeight = 31;
		for(DriveablePart part : partsToDraw)
		{
			//Add to the GUI height depending on whether we need a repair button or not
			guiHeight += part.health <= 0 ? 40 : 20;
		}
		//Update the buttons
		updateButtons();

		//Standard GUI render stuff
		ScaledResolution scaledresolution = new ScaledResolution(mc);
		int w = scaledresolution.getScaledWidth();
		int h = scaledresolution.getScaledHeight();
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);
		
		//Bind the background texture
		mc.renderEngine.bindTexture(texture);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		//Calculate the gui origin
		guiOriginX = w / 2 - guiWidth / 2;
		guiOriginY = h / 2 - guiHeight / 2;
		
		//Render the header
		drawTexturedModalRect(guiOriginX, guiOriginY, 0, 0, 202, 23);
		//Render the footer
		drawTexturedModalRect(guiOriginX, guiOriginY + guiHeight - 8, 0, 65, 202, 8);
		//Render the title
		drawString(fontRenderer, driving.getDriveableType().name + " - Repair", guiOriginX + 7, guiOriginY + 7, 0xffffff);
		
		//Render each part
		//Where to start rendering from. Updated with each part
		int y = 23;
		for(DriveablePart part : partsToDraw)
		{
			boolean broken = part.health <= 0;
			//Render the background for this section
			mc.renderEngine.bindTexture(texture);
			drawTexturedModalRect(guiOriginX, guiOriginY + y, 0, 24, 202, broken ? 40 : 20);
			
			//Render the damage bar
			float percentHealth = (float)part.health / (float)part.maxHealth;
			GL11.glColor3f(1 - percentHealth, percentHealth, 0F);
			drawTexturedModalRect(guiOriginX + 121, guiOriginY + y + 2, 0, 73, (int)(70 * percentHealth), 16);
			
			//Write the part name and percent health
			drawString(fontRenderer, part.type.getName(), guiOriginX + 10, guiOriginY + y + 6, 0xffffff);
			drawCenteredString(fontRenderer, (int)(percentHealth * 100F) + "%", guiOriginX + 158, guiOriginY + y + 6, 0xffffff);
			
			//If the part is damaged, draw the parts required to fix it
			if(broken)
			{
				//Create a temporary copy of the player inventory in order to work out whether the player has each of the itemstacks required
				InventoryPlayer temporaryInventory = new InventoryPlayer(null);
				temporaryInventory.copyInventory(driver.inventory);
				
				ArrayList<ItemStack> stacksNeeded = driving.getDriveableType().getItemsRequired(part, driving.getDriveableData().engine);
				//Draw the stacks that should be in each slot
				for(int n = 0; n < 7; n++)
				{
					//If there are more than 7 stacks, loop over them
					int stackNum = n + (FlansMod.ticker / 60) % Math.max(1, stacksNeeded.size() - 6);
					//If this is a valid stack
					if(stackNum < stacksNeeded.size())
					{
						//Get the item stack we need
						ItemStack stackNeeded = stacksNeeded.get(stackNum);
						//The total amount of items found that match this recipe stack
						int totalAmountFound = 0;
						//Iterate over the temporary inventory
						for(int m = 0; m < temporaryInventory.getSizeInventory(); m++)
						{
							//Get the stack in each slot
							ItemStack stackInSlot = temporaryInventory.getStackInSlot(m).copy();
							//If the stack is what we want
							if(stackInSlot.getItem() == stackNeeded.getItem() && stackInSlot.getItemDamage() == stackNeeded.getItemDamage())
							{
								//Work out the amount to take from the stack
								int amountFound = Math.min(stackInSlot.getCount(), stackNeeded.getCount() - totalAmountFound);
								//Take it
								stackInSlot.setCount(stackInSlot.getCount() - amountFound);
								//Check for empty stacks
								if(stackInSlot.getCount() <= 0)
									stackInSlot = ItemStack.EMPTY.copy();
								//Put the modified stack back in the inventory
								temporaryInventory.setInventorySlotContents(m, stackInSlot);
								//Increase the amount found counter
								totalAmountFound += amountFound;
								//If we have enough, stop looking
								if(totalAmountFound == stackNeeded.getCount())
									break;
							}
						}
						//If we did not find enough in the inventory
						if(totalAmountFound < stackNeeded.getCount())
						{
							mc.renderEngine.bindTexture(texture);
							drawTexturedModalRect(guiOriginX + 67 + 18 * n, guiOriginY + y + 22, 202, 0, 16, 16);
						}
						drawSlotInventory(stacksNeeded.get(stackNum), guiOriginX + 67 + 18 * n, guiOriginY + y + 22);
					}
				}
			}
			
			//Increase the render y value for the next part
			y += broken ? 40 : 20;
		}
		super.drawScreen(i, j, f);
	}

	@Override
	protected void mouseClicked(int i, int j, int k) throws IOException
	{
		super.mouseClicked(i, j, k);
		int m = i - guiOriginX;
		int n = j - guiOriginY;
		if(m > 185 && m < 195 && n > 5 && n < 15)
			if(driving instanceof EntityMecha)
			{
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
				(driver).openGui(FlansMod.INSTANCE, 10, driver.world, driving.chunkCoordX, driving.chunkCoordY, driving.chunkCoordZ);
			}
			else
				mc.displayGuiScreen(new GuiDriveableMenu(driver.inventory, driver.world, driving));
	}

	/**
	 * Item stack renderering method
	 */
	private void drawSlotInventory(ItemStack itemstack, int i, int j)
	{
		if(itemstack == null || itemstack.isEmpty())
			return;
		itemRenderer.renderItemIntoGUI(itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, itemstack, i, j, null);
	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
