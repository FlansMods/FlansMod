package com.flansmod.client.gui;

import java.io.IOException;
import java.util.HashMap;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.parts.EnumPartCategory;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;

public class GuiDriveableCrafting extends GuiScreen
{
	/**
	 * The background image
	 */
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/driveableCrafting.png");
	
	/**
	 * The inventory of the player using this crafting table
	 */
	private InventoryPlayer inventory;
	/**
	 * The Minecraft instance
	 */
	private Minecraft mc;
	/**
	 * The world in which this crafting table resides
	 */
	private World world;
	/**
	 * The crafting table co-ordinates
	 */
	private int x, y, z;
	/**
	 * Item renderer
	 */
	private static RenderItem itemRenderer;
	/**
	 * Gui origin
	 */
	private int guiOriginX, guiOriginY;
	/**
	 * Blueprint scroller, static to save position upon exiting crafting window
	 */
	private static int blueprintsScroll = 0;
	/**
	 * Recipe scroller
	 */
	private int recipeScroll = 0;
	/**
	 * The blueprint that is currently selected
	 */
	private static int selectedBlueprint = 0;
	/**
	 * Spins the driveable model
	 */
	private float spinner = 0;
	/**
	 * Whether or not the currently selected driveable can be crafted
	 */
	private boolean canCraft = false;
	
	public GuiDriveableCrafting(InventoryPlayer playerinventory, World w, int i, int j, int k)
	{
		inventory = playerinventory;
		mc = FMLClientHandler.instance().getClient();
		itemRenderer = mc.getRenderItem();
		world = w;
		x = i;
		y = j;
		z = k;
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
		buttonList.add(new GuiButton(0, width / 2 + 22, height / 2 + 63, 40, 20, "Craft"));
	}
	
	@Override
	protected void actionPerformed(GuiButton button)
	{
		if(button.id == 0)
		{
			FlansMod.proxy.craftDriveable(inventory.player, DriveableType.types.get(selectedBlueprint));
		}
	}

	@Override
	public void drawScreen(int i, int j, float f)
	{
		String recipeName;
		ScaledResolution scaledresolution = new ScaledResolution(mc);
		int w = scaledresolution.getScaledWidth();
		int h = scaledresolution.getScaledHeight();
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);
		//Bind the background texture
		mc.renderEngine.bindTexture(texture);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		guiOriginX = w / 2 - 88;
		guiOriginY = h / 2 - 99;
		//Draw the background
		drawTexturedModalRect(guiOriginX, guiOriginY, 0, 0, 176, 198);
		
		drawString(fontRenderer, "Vehicle Crafting", guiOriginX + 6, guiOriginY + 6, 0xffffff);
		drawString(fontRenderer, "Requires", guiOriginX + 6, guiOriginY + 125, 0xffffff);
		drawString(fontRenderer, "Engine", guiOriginX + 114, guiOriginY + 141, 0xffffff);

		for(int m = 0; m < 2; m++)
		{
			for(int n = 0; n < 8; n++)
			{
				//Add the scroll bar position to get the correct driveable
				int blueprintNumber = blueprintsScroll * 8 + 8 * m + n;
				//If this driveable is selected
				if(blueprintNumber == selectedBlueprint)
				{
					//Bind the gui texture and draw in the green highlighted panel behind the driveable item
					mc.renderEngine.bindTexture(texture);
					drawTexturedModalRect(guiOriginX + 8 + n * 18, guiOriginY + 18 + m * 18, 213, 11, 16, 16);
				}
				//If the number is within the bounds of the list
				if(blueprintNumber < DriveableType.types.size())
				{
					//Draw the driveable item
					DriveableType type = DriveableType.types.get(blueprintNumber);
					drawSlotInventory(new ItemStack(type.item), guiOriginX + 8 + n * 18, guiOriginY + 18 + m * 18);
				}
			}
		}
		
		//Increment the spinner to spin the driveable. Wheeee!
		spinner++;


		//Return if the selectedBlueprint is invalid
		if(selectedBlueprint >= DriveableType.types.size())
		{
			return;
		}
		
		//Make this true and then set it back to false as soon as a problem occurs in finding the required parts
		canCraft = true;
		
		//Get the currently selected driveable type and check its not null
		DriveableType selectedType = DriveableType.types.get(selectedBlueprint);
		if(selectedType != null)
		{
			//Render rotating driveable model
			GL11.glPushMatrix();
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glEnable(GL11.GL_ALPHA_TEST);
			GL11.glTranslatef(w / 2 - 46, h / 2 - 10, 100);
			
			//Do lights
			GlStateManager.disableLighting();
			GlStateManager.pushMatrix();
			GlStateManager.rotate(180F, 1.0F, 0.0F, 0.0F);
			GlStateManager.rotate(0F, 0.0F, 1.0F, 0.0F);
			RenderHelper.enableStandardItemLighting();
			GlStateManager.popMatrix();
			GlStateManager.enableRescaleNormal();
			
			if(selectedType instanceof MechaType)
				GL11.glTranslatef(0, 15, 0);
			GL11.glScalef(-50F * selectedType.modelScale / selectedType.cameraDistance, 50F * selectedType.modelScale / selectedType.cameraDistance, 50F * selectedType.modelScale / selectedType.cameraDistance);
			GL11.glRotatef(180F, 0F, 0F, 1F);
			GL11.glRotatef(30F, 1F, 0F, 0F);
			GL11.glRotatef(spinner / 5F, 0F, 1F, 0F);
			mc.renderEngine.bindTexture(FlansModResourceHandler.getTexture(selectedType));
			selectedType.model.render(selectedType);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_ALPHA_TEST);
			GL11.glPopMatrix();
			
			recipeName = selectedType.name;
			if(recipeName.length() > 16)
				recipeName = recipeName.substring(0, 15) + "...";
			
			//Render the info text alongside the driveable
			drawString(fontRenderer, recipeName, guiOriginX + 82, guiOriginY + 64, 0xffffff);
			drawString(fontRenderer, "Cargo Slots : " + selectedType.numCargoSlots, guiOriginX + 82, guiOriginY + 74, 0xffffff);
			drawString(fontRenderer, "Bomb Slots : " + selectedType.numBombSlots, guiOriginX + 82, guiOriginY + 84, 0xffffff);
			drawString(fontRenderer, "Passengers : " + selectedType.numPassengers, guiOriginX + 82, guiOriginY + 94, 0xffffff);
			drawString(fontRenderer, "Guns : " + (selectedType.ammoSlots()), guiOriginX + 82, guiOriginY + 104, 0xffffff);
			drawString(fontRenderer, selectedType.numEngines() + "x", guiOriginX + 100, guiOriginY + 141, 0xffffff);
			
			//Create a temporary copy of the player inventory in order to work out whether the player has each of the itemstacks required
			InventoryPlayer temporaryInventory = new InventoryPlayer(null);
			temporaryInventory.copyInventory(inventory);
			
			//Draw the recipe items
			//Iterate over rows then columns
			for(int r = 0; r < 3; r++)
			{
				for(int c = 0; c < 4; c++)
				{
					//Work out what recipe item this is
					int recipeItemNumber = recipeScroll * 4 + r * 4 + c;
					//If this is actually a valid recipe item
					if(recipeItemNumber < selectedType.driveableRecipe.size())
					{
						//Get the itemstack required by the recipe
						ItemStack recipeStack = selectedType.driveableRecipe.get(recipeItemNumber);
						//The total amount of items found that match this recipe stack
						int totalAmountFound = 0;
						//Iterate over the temporary inventory
						for(int n = 0; n < temporaryInventory.getSizeInventory(); n++)
						{
							//Get the stack in each slot
							ItemStack stackInSlot = temporaryInventory.getStackInSlot(n).copy();
							//If the stack is what we want
							if(stackInSlot != null && stackInSlot.getItem() == recipeStack.getItem() && stackInSlot.getItemDamage() == recipeStack.getItemDamage())
							{
								//Work out the amount to take from the stack
								int amountFound = Math.min(stackInSlot.getCount(), recipeStack.getCount() - totalAmountFound);
								//Take it
								stackInSlot.setCount(stackInSlot.getCount() - amountFound);
								//Check for empty stacks
								if(stackInSlot.getCount() <= 0)
									stackInSlot = ItemStack.EMPTY.copy();
								//Put the modified stack back in the inventory
								temporaryInventory.setInventorySlotContents(n, stackInSlot);
								//Increase the amount found counter
								totalAmountFound += amountFound;
								//If we have enough, stop looking
								if(totalAmountFound == recipeStack.getCount())
									break;
							}
						}
						//If we didn't find enough, give the stack a red outline
						if(totalAmountFound < recipeStack.getCount())
						{
							mc.renderEngine.bindTexture(texture);
							drawTexturedModalRect(guiOriginX + 8 + c * 18, guiOriginY + 138 + r * 18, 195, 11, 16, 16);
							canCraft = false;
						}
						//Draw the actual item we want
						drawSlotInventory(recipeStack, guiOriginX + 8 + c * 18, guiOriginY + 138 + r * 18);
					}
				}
			}
			
			//Collect up all the engines into neat and tidy stacks so we can find if any of them are big enough and which of those stacks are best
			HashMap<PartType, ItemStack> engines = new HashMap<>();
			
			//Find some suitable engines
			for(int n = 0; n < temporaryInventory.getSizeInventory(); n++)
			{
				//Get the stack in each slot
				ItemStack stackInSlot = temporaryInventory.getStackInSlot(n).copy();
				//Check to see if its a part
				if(stackInSlot.getItem() instanceof ItemPart)
				{
					PartType partType = ((ItemPart)stackInSlot.getItem()).type;
					//Check its an engine that we can use
					if(partType.category == EnumPartCategory.ENGINE && partType.worksWith.contains(EnumType.getFromObject(selectedType)))
					{
						//If we already have engines of this type, add these ones to the stack
						if(engines.containsKey(partType))
						{
							engines.get(partType).setCount(engines.get(partType).getCount() + stackInSlot.getCount());
						}
						//Else, make this the first stack
						else engines.put(partType, stackInSlot);
					}
				}
			}
			
			//Find the stack of engines that is fastest but which also has enough for this driveable
			float bestEngineSpeed = -1F;
			ItemStack bestEngineStack = ItemStack.EMPTY.copy();
			for(PartType part : engines.keySet())
			{
				//If this engine outperforms the currently selected best one and there are enough of them, swap
				if(part.engineSpeed > bestEngineSpeed && engines.get(part).getCount() >= selectedType.numEngines())
				{
					bestEngineSpeed = part.engineSpeed;
					bestEngineStack = engines.get(part);
				}
			}
			
			//If we didn't find a suitable stack of engines, red the box out
			mc.renderEngine.bindTexture(texture);
			if(bestEngineStack == null || bestEngineStack.isEmpty())
			{
				drawTexturedModalRect(guiOriginX + 152, guiOriginY + 138, 195, 11, 16, 16);
				canCraft = false;
			}
			//But if we did, render the stack
			else
			{
				//drawTexturedModalRect(guiOriginX + 152, guiOriginY + 138, 213, 11, 16, 16);
				drawSlotInventory(bestEngineStack, guiOriginX + 152, guiOriginY + 138);
			}
		}
		
		//If we can't craft it, draw a red box around the craft button and disable it
		if(!canCraft)
		{
			buttonList.get(0).enabled = false;
			mc.renderEngine.bindTexture(texture);
			drawTexturedModalRect(guiOriginX + 108, guiOriginY + 160, 176, 28, 44, 24);
			drawString(fontRenderer, "Craft", guiOriginX + 116, guiOriginY + 168, 0xa0a0a0);
		}
		//If we can craft it, draw and enable the button for crafting
		else
		{
			super.drawScreen(i, j, f);
			buttonList.get(0).enabled = true;
		}
	}
	
	/**
	 * Item stack renderering method
	 */
	private void drawSlotInventory(ItemStack itemstack, int i, int j)
	{
		if(itemstack == null || itemstack.getItem() == null)
			return;
		itemRenderer.renderItemIntoGUI(itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, itemstack, i, j, null);
	}
	
	@Override
	protected void keyTyped(char c, int i)
	{
		if(i == 1 || i == mc.gameSettings.keyBindInventory.getKeyCode())
		{
			mc.player.closeScreen();
		}
	}
	
	@Override
	protected void mouseClicked(int i, int j, int k) throws IOException
	{
		super.mouseClicked(i, j, k);
		int x = i - guiOriginX;
		int y = j - guiOriginY;
		if(k == 0 || k == 1)
		{
			//Driveable buttons
			for(int m = 0; m < 2; m++)
			{
				for(int n = 0; n < 8; n++)
				{
					if(x >= 8 + n * 18 && x <= 26 + n * 18 && y >= 18 + 18 * m && y <= 42 + 18 * m)
						selectedBlueprint = blueprintsScroll * 8 + m * 8 + n;
				}
			}
			//Blueprints back button
			if(x >= 157 && x <= 167 && y >= 21 && y <= 31)
			{
				if(blueprintsScroll > 0)
					blueprintsScroll--;
			}
			//Blueprints forwards button
			if(x >= 157 && x <= 167 && y >= 39 && y <= 49)
			{
				if(blueprintsScroll * 8 + 16 < DriveableType.types.size())
					blueprintsScroll++;
			}
			//Return if the selectedBlueprint is invalid
			if(selectedBlueprint >= DriveableType.types.size())
			{
				return;
			}
			//Recipe back button
			if(x >= 83 && x <= 93 && y >= 141 && y <= 151)
			{
				if(recipeScroll > 0)
					recipeScroll--;
			}
			//Recipe forwards button
			if(x >= 83 && x <= 93 && y >= 177 && y <= 187)
			{
				DriveableType selectedType = DriveableType.types.get(selectedBlueprint);
				if(selectedType != null && recipeScroll * 4 + 12 < selectedType.driveableRecipe.size())
					recipeScroll++;
			}
		}
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
