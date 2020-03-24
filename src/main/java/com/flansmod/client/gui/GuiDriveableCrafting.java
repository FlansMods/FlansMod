package com.flansmod.client.gui;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.lang3.NotImplementedException;

import io.vavr.collection.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;

import com.flansmod.client.handlers.FlansModResourceHandler;
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
	private static final int CRAFT_BUTTON_ID = 0;
	private static final int BLUEPRINTS_UP_BUTTON_ID = 1;
	private static final int BLUEPRINTS_DOWN_BUTTON_ID = 2;
	private static final int RECIPE_UP_BUTTON_ID = 3;
	private static final int RECIPE_DOWN_BUTTON_ID = 4;

	/**
	 * The inventory of the player using this crafting table
	 */
	private InventoryPlayer inventory;
	/**
	 * The Minecraft instance
	 */
	private Minecraft mc;
	/**
	 * Gui origin
	 */
	private int guiOriginX, guiOriginY;
	/**
	 * Blueprint scroller, static to save position upon exiting crafting window
	 */
	private static int blueprintsScrollPos = 0;
	/**
	 * Recipe scroller
	 */
	private int recipeScrollPos = 0;
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
	public static final int BLUEPRINT_ROW_COUNT = 2;
	public static final int BLUEPRINT_COLUMN_COUNT = 8;
	public static final int BLUEPRINT_WIDTH = 18;
	public static final int BLUEPRINT_HEIGHT = 18;
	private int blueprintsOriginX;
	private int blueprintsOriginY;
	private int statsOriginX;
	private int statsOriginY;
	private int vehicleCraftingTextX;
	private int vehicleCraftingTextY;
	private int requiresTextX;
	private int requiresTextY;
	private int engineTextX;
	private int engineTextY;
	public static final int GUI_WIDTH = 176;
	public static final int GUI_HEIGHT = 198;
	public static final int WHITE = Color.white.getRGB();
	private int recipeOriginX;
	private int recipeOriginY;
	private int engineOriginX;
	private int engineOriginY;
	private int modelCenterX;
	private int modelCenterY;
	private GuiButton craftButton;
	public static final int RECIPE_ROW_COUNT = 3;
	public static final int RECIPE_COLUMN_COUNT = 4;
	private ArrowButton blueprintsDownButton;
	private ArrowButton recipeDownButton;
	private ArrowButton recipeUpButton;
	private ArrowButton blueprintsUpButton;

	public GuiDriveableCrafting(InventoryPlayer playerInventory)
	{
		inventory = playerInventory;
		mc = FMLClientHandler.instance().getClient();
	}

	@Override
	public void initGui()
	{
		super.initGui();

		guiOriginX = width / 2 - GUI_WIDTH / 2;
		guiOriginY = height / 2 - GUI_HEIGHT / 2;
		blueprintsOriginX = guiOriginX + 8;
		blueprintsOriginY = guiOriginY + 18;
		statsOriginX = guiOriginX + 82;
		statsOriginY = guiOriginY + 64;
		vehicleCraftingTextX = guiOriginX + 6;
		vehicleCraftingTextY = guiOriginY + 6;
		requiresTextX = guiOriginX + 6;
		requiresTextY = guiOriginY + 125;
		engineTextX = guiOriginX + 114;
		engineTextY = guiOriginY + 141;
		recipeOriginX = guiOriginX + 8;
		recipeOriginY = guiOriginY + 138;
		engineOriginX = guiOriginX + 152;
		engineOriginY = guiOriginY + 138;
		modelCenterX = guiOriginX + 42;
		modelCenterY = guiOriginY + 89;

		buttonList.add(craftButton = new GuiButton(
				CRAFT_BUTTON_ID,
				guiOriginX + 110,
				guiOriginY + 162,
				40,
				20,
				"Craft"));
		buttonList.add(blueprintsUpButton = new ArrowButton(
				BLUEPRINTS_UP_BUTTON_ID,
				guiOriginX + 157,
				guiOriginY + 21,
				Direction.UP));
		buttonList.add(blueprintsDownButton = new ArrowButton(
				BLUEPRINTS_DOWN_BUTTON_ID,
				guiOriginX + 157,
				guiOriginY + 39,
				Direction.DOWN));
		buttonList.add(recipeUpButton = new ArrowButton(
				RECIPE_UP_BUTTON_ID,
				guiOriginX + 83,
				guiOriginY + 141,
				Direction.UP));
		buttonList.add(recipeDownButton = new ArrowButton(
				RECIPE_DOWN_BUTTON_ID,
				guiOriginX + 83,
				guiOriginY + 177,
				Direction.DOWN));

		updateButtons();
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		switch(button.id)
		{
			case CRAFT_BUTTON_ID:
				FlansMod.proxy.craftDriveable(inventory.player, DriveableType.types.get(selectedBlueprint));
				break;
			case BLUEPRINTS_UP_BUTTON_ID:
				if(blueprintsScrollPos > 0)
					blueprintsScrollPos--;
				break;
			case BLUEPRINTS_DOWN_BUTTON_ID:
				if(blueprintsScrollPos * 8 + 16 < DriveableType.types.size())
					blueprintsScrollPos++;
				break;
			case RECIPE_UP_BUTTON_ID:
				if(recipeScrollPos > 0)
					recipeScrollPos--;
				break;
			case RECIPE_DOWN_BUTTON_ID:
				DriveableType selectedType = DriveableType.types.get(selectedBlueprint);
				int totalCells = RECIPE_ROW_COUNT * RECIPE_COLUMN_COUNT;
				if(recipeScrollPos * RECIPE_COLUMN_COUNT + totalCells < selectedType.driveableRecipe.size())
					recipeScrollPos++;
				break;
		}

		updateButtons();
	}


	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		drawDefaultBackground();

		// GUI background
		mc.renderEngine.bindTexture(texture);
		drawTexturedModalRect(guiOriginX, guiOriginY, 0, 0, GUI_WIDTH, GUI_HEIGHT);
		drawString(fontRenderer, "Vehicle Crafting", vehicleCraftingTextX, vehicleCraftingTextY, WHITE);

		// Blueprints selector
		List<ItemToRender> itemsToRender = getBlueprintItemsToRender();

		// Preview
		DriveableType selectedType = DriveableType.types.get(selectedBlueprint);
		drawPreview(selectedType);

		// Stats
		drawStats(selectedType);

		// Engine requirements
		drawString(fontRenderer, "Engine", engineTextX, engineTextY, WHITE);
		drawString(fontRenderer, selectedType.numEngines() + "x", engineTextX - 14, engineTextY, WHITE);

		canCraft = true;

		// Recipe items
		itemsToRender = itemsToRender.pushAll(getRecipeItemsToRender(selectedType));

		// Collect up all the engines into neat and tidy stacks so we can find if any of them are big enough
		// and which of those stacks are best
		ItemStack bestEngineStack = getBestEngineStackForType(selectedType);

		// Draw engine slot
		itemsToRender = itemsToRender.pushAll(getEngineItemToRender(bestEngineStack));

		craftButton.enabled = canCraft;

		super.drawScreen(mouseX, mouseY, partialTicks);

		itemsToRender.forEach(item -> drawSlotInventory(item.itemStack, item.x, item.y, mouseX, mouseY));
	}

	private List<ItemToRender> getEngineItemToRender(ItemStack engineStack)
	{
		List<ItemToRender> itemsToRender = List.empty();
		mc.renderEngine.bindTexture(texture);
		if(engineStack.isEmpty())
		{
			drawTexturedModalRect(engineOriginX, engineOriginY, 195, 11, 16, 16);
			canCraft = false;
		}
		else
		{
			itemsToRender = itemsToRender.push(new ItemToRender(engineStack, engineOriginX, engineOriginY));
		}
		return itemsToRender;
	}

	private ItemStack getBestEngineStackForType(DriveableType selectedType)
	{
		HashMap<PartType, ItemStack> engines = getPlayersEnginesForType(selectedType);

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
		return bestEngineStack;
	}

	private HashMap<PartType, ItemStack> getPlayersEnginesForType(DriveableType selectedType)
	{
		HashMap<PartType, ItemStack> engines = new HashMap<>();

		//Find some suitable engines
		for(ItemStack itemStack : inventory.mainInventory)
		{
			if(itemStack.getItem() instanceof ItemPart)
			{
				PartType partType = ((ItemPart)itemStack.getItem()).type;
				//Check its an engine that we can use
				if(partType.category == EnumPartCategory.ENGINE
						&& partType.worksWith.contains(EnumType.getFromObject(selectedType)))
				{
					//If we already have engines of this type, add these ones to the stack
					if(engines.containsKey(partType))
					{
						engines.get(partType).setCount(engines.get(partType).getCount() + itemStack.getCount());
					}
					//Else, make this the first stack
					else engines.put(partType, itemStack);
				}
			}
		}
		return engines;
	}

	private List<ItemToRender> getRecipeItemsToRender(DriveableType selectedType)
	{
		List<ItemToRender> itemsToRender = List.empty();
		drawString(fontRenderer, "Requires", requiresTextX, requiresTextY, WHITE);
		for(int row = 0; row < RECIPE_ROW_COUNT; row++)
		{
			for(int column = RECIPE_COLUMN_COUNT - 1; column >= 0; column--)
			{
				int pageStartIndex = recipeScrollPos * RECIPE_COLUMN_COUNT;
				int rowStartInPageIndex = row * RECIPE_COLUMN_COUNT;
				int recipeItemNumber = pageStartIndex + rowStartInPageIndex + column;
				if(recipeItemNumber < selectedType.driveableRecipe.size())
				{
					ItemStack recipeStack = selectedType.driveableRecipe.get(recipeItemNumber);
					int totalAmountFound = 0;
					for(ItemStack itemStack : inventory.mainInventory)
					{
						if(itemStack.getItem() == recipeStack.getItem()
								&& itemStack.getItemDamage() == recipeStack.getItemDamage())
						{
							totalAmountFound += itemStack.getCount();
							if(totalAmountFound == recipeStack.getCount())
								break;
						}
					}
					//If we didn't find enough, give the stack a red outline
					if(totalAmountFound < recipeStack.getCount())
					{
						mc.renderEngine.bindTexture(texture);
						drawTexturedModalRect(
								recipeOriginX + column * BLUEPRINT_WIDTH,
								recipeOriginY + row * BLUEPRINT_HEIGHT,
								195,
								11,
								16,
								16);
						canCraft = false;
					}
					//Draw the actual item we want
					itemsToRender = itemsToRender.push(new ItemToRender(
							recipeStack,
							recipeOriginX + column * BLUEPRINT_WIDTH,
							recipeOriginY + row * BLUEPRINT_HEIGHT));
				}
			}
		}
		return itemsToRender;
	}

	private void drawStats(DriveableType selectedType)
	{
		String recipeName = selectedType.name;
		if(recipeName.length() > 16)
			recipeName = recipeName.substring(0, 15) + "...";

		// Driveable stats
		drawString(fontRenderer, recipeName, statsOriginX, statsOriginY, WHITE);
		drawString(
				fontRenderer,
				"Cargo Slots : " + selectedType.numCargoSlots,
				statsOriginX,
				statsOriginY + 10,
				WHITE);
		drawString(
				fontRenderer,
				"Bomb Slots : " + selectedType.numBombSlots,
				statsOriginX,
				statsOriginY + 20,
				WHITE);
		drawString(
				fontRenderer,
				"Passengers : " + selectedType.numPassengers,
				statsOriginX,
				statsOriginY + 30,
				WHITE);
		drawString(fontRenderer, "Guns : " + (selectedType.ammoSlots()), statsOriginX, statsOriginY + 40, WHITE);
	}

	private void drawPreview(DriveableType selectedType)
	{
		//Increment the spinner to spin the driveable. Wheeee!
		spinner++;

		//Render rotating driveable model
		GlStateManager.pushMatrix();
		{
			GlStateManager.translate(modelCenterX, modelCenterY, 100);
			GlStateManager.disableLighting();

			//Do lights
			GlStateManager.pushMatrix();
			{
				GlStateManager.rotate(180F, 1.0F, 0.0F, 0.0F);
				GlStateManager.rotate(0F, 0.0F, 1.0F, 0.0F);
				RenderHelper.enableStandardItemLighting();

			}
			GlStateManager.popMatrix();
			GlStateManager.enableRescaleNormal();

			if(selectedType instanceof MechaType)
				GlStateManager.translate(0, 15, 0);
			GlStateManager.scale(
					-50F * selectedType.modelScale / selectedType.cameraDistance,
					50F * selectedType.modelScale / selectedType.cameraDistance,
					50F * selectedType.modelScale / selectedType.cameraDistance);
			GlStateManager.rotate(180F, 0F, 0F, 1F);
			GlStateManager.rotate(30F, 1F, 0F, 0F);
			GlStateManager.rotate(spinner / 5F, 0F, 1F, 0F);
			mc.renderEngine.bindTexture(FlansModResourceHandler.getTexture(selectedType));
			selectedType.model.render(selectedType);
		}
		GlStateManager.popMatrix();
	}

	private List<ItemToRender> getBlueprintItemsToRender()
	{
		List<ItemToRender> itemsToRender = List.empty();
		for(int row = BLUEPRINT_ROW_COUNT - 1; row >= 0; row--)
		{
			for(int column = 0; column < BLUEPRINT_COLUMN_COUNT; column++)
			{
				int pageStartIndex = blueprintsScrollPos * BLUEPRINT_COLUMN_COUNT;
				int rowStartInPageIndex = row * BLUEPRINT_COLUMN_COUNT;
				int blueprintNumber = pageStartIndex + rowStartInPageIndex + column;

				// Draw outline for selected blueprint
				if(blueprintNumber == selectedBlueprint)
				{
					mc.renderEngine.bindTexture(texture);
					drawTexturedModalRect(
							blueprintsOriginX + column * BLUEPRINT_WIDTH,
							blueprintsOriginY + row * BLUEPRINT_HEIGHT,
							213,
							11,
							BLUEPRINT_WIDTH - 2,
							BLUEPRINT_HEIGHT - 2);
				}

				// Draw blueprint
				if(blueprintNumber < DriveableType.types.size())
				{
					DriveableType type = DriveableType.types.get(blueprintNumber);
					itemsToRender = itemsToRender.push(new ItemToRender(
							new ItemStack(type.item),
							blueprintsOriginX + column * BLUEPRINT_WIDTH,
							blueprintsOriginY + row * BLUEPRINT_HEIGHT));
				}
			}
		}
		return itemsToRender;
	}

	/**
	 * Item stack rendering method
	 */
	private void drawSlotInventory(ItemStack itemstack, int x, int y, int mouseX, int mouseY)
	{
		if(itemstack == null)
			return;
		itemRender.renderItemIntoGUI(itemstack, x, y);
		itemRender.renderItemOverlayIntoGUI(fontRenderer, itemstack, x, y, null);
		drawTooltip(itemstack.getDisplayName(), x, y, mouseX, mouseY, 16, 16);
	}

	private void drawTooltip(String text, int x, int y, int mouseX, int mouseY, int iconWidth, int iconHeight)
	{
		if(mouseX >= x && mouseY >= y && mouseX < x + iconWidth && mouseY < y + iconHeight)
		{
			drawHoveringText(text, mouseX, mouseY);
		}
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
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException
	{
		super.mouseClicked(mouseX, mouseY, mouseButton);
		if(mouseButton == 0 || mouseButton == 1)
		{
			//Driveable buttons
			for(int row = 0; row < BLUEPRINT_ROW_COUNT; row++)
			{
				for(int column = 0; column < BLUEPRINT_COLUMN_COUNT; column++)
				{
					if(mouseX >= blueprintsOriginX + column * BLUEPRINT_WIDTH
							&& mouseX < blueprintsOriginX + column * BLUEPRINT_WIDTH + BLUEPRINT_WIDTH
							&& mouseY >= blueprintsOriginY + row * BLUEPRINT_HEIGHT
							&& mouseY < blueprintsOriginY + row * BLUEPRINT_HEIGHT + BLUEPRINT_HEIGHT)
					{
						int pageStartIndex = blueprintsScrollPos * BLUEPRINT_COLUMN_COUNT;
						int rowStartInPageIndex = row * BLUEPRINT_COLUMN_COUNT;
						int result = pageStartIndex + rowStartInPageIndex + column;
						if(result < DriveableType.types.size())
						{
							recipeScrollPos = 0;
							selectedBlueprint = result;
							return;
						}
					}
				}
			}
		}
	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}

	private void updateButtons()
	{
		// Blueprint buttons
		blueprintsUpButton.enabled = blueprintsScrollPos > 0;

		int totalBlueprintsCells = BLUEPRINT_COLUMN_COUNT * BLUEPRINT_ROW_COUNT;
		blueprintsDownButton.enabled =
				blueprintsScrollPos * BLUEPRINT_COLUMN_COUNT + totalBlueprintsCells < DriveableType.types.size() - 1;

		// Recipe buttons
		recipeUpButton.enabled = recipeScrollPos > 0;

		int totalRecipeItems = RECIPE_COLUMN_COUNT * RECIPE_ROW_COUNT;
		DriveableType selectedType = DriveableType.types.get(selectedBlueprint);
		recipeDownButton.enabled =
				recipeScrollPos * RECIPE_COLUMN_COUNT + totalRecipeItems < selectedType.driveableRecipe.size() - 1;
	}

	private static class ArrowButton extends GuiButton
	{

		public static final int WIDTH = 10;
		public static final int HEIGHT = 10;
		public final int enabledTextureX;
		public final int enabledTextureY = 0;
		public final int disabledTextureX;
		public final int disabledTextureY = 0;
		public final Direction direction;

		public ArrowButton(int buttonId, int x, int y, Direction direction)
		{
			super(buttonId, x, y, WIDTH, HEIGHT, "");
			this.direction = direction;

			switch(direction)
			{
				case UP:
					enabledTextureX = 216;
					disabledTextureX = 196;
					break;
				case DOWN:
					enabledTextureX = 226;
					disabledTextureX = 206;
					break;
				default:
					throw new NotImplementedException("Texture location not set for direction");
			}
		}

		@Override
		public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks)
		{
			if(visible)
			{
				mc.renderEngine.bindTexture(texture);
				if(enabled)
				{
					drawTexturedModalRect(x, y, enabledTextureX, enabledTextureY, WIDTH, HEIGHT);
				}
				else
				{
					drawTexturedModalRect(x, y, disabledTextureX, disabledTextureY, WIDTH, HEIGHT);
				}
			}
		}

	}

	private static class ItemToRender
	{
		public ItemStack itemStack;
		public int x;
		public int y;

		public ItemToRender(ItemStack itemStack, int x, int y)
		{
			this.itemStack = itemStack;
			this.x = x;
			this.y = y;
		}
	}

	private enum Direction
	{UP, DOWN}
}
