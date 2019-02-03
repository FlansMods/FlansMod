package com.flansmod.client.gui;

import java.io.IOException;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.boxes.ContainerGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.guns.boxes.GunBoxType.GunBoxEntry;
import com.flansmod.common.guns.boxes.GunBoxType.GunBoxEntryTopLevel;
import com.flansmod.common.guns.boxes.GunBoxType.GunBoxPage;
import com.flansmod.common.network.PacketBuyWeapon;
import com.flansmod.common.types.InfoType;

public class GuiGunBox extends GuiContainer
{
	private static final int numCategories = 3;
	/**
	 * Texture location
	 */
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/weaponBoxNew.png");
	/**
	 * Texture sizes
	 */
	private final int textureX = 512, textureY = 256;
	private InventoryPlayer inventory;
	private static RenderItem itemRenderer;
	private GunBoxType type;
	private int pageScroller;
	private GunBoxPage currentPage;
	private GunBoxEntryTopLevel currentEntry;
	private GunBoxEntry currentSubEntry;
	private int guiOriginX;
	private int guiOriginY;
	private int scroll;
	private GuiButton craftLeft, craftRight, categoryLeft, categoryRight;
	private GuiButton[] categories = new GuiButton[numCategories];
	
	public GuiGunBox(InventoryPlayer inventory, GunBoxType type)
	{
		super(new ContainerGunBox(inventory));
		this.inventory = inventory;
		this.type = type;
		pageScroller = 0;
		
		currentPage = type.pages.get(0);
		
		xSize = ySize = 256;
	}
	
	@Override
	public void updateScreen()
	{
		super.updateScreen();
		scroll++;
		
		if(craftLeft != null && craftRight != null)
		{
			craftLeft.visible = currentEntry != null;
			craftRight.visible = currentSubEntry != null;

			
			if(currentEntry != null)
			{
				craftLeft.enabled = currentEntry.canCraft(inventory, false);
			}
			
			if(currentSubEntry != null)
			{
				craftRight.enabled = currentSubEntry.canCraft(inventory, false);
			}
		}
		

	}

	
	@Override
	public void initGui()
	{
		super.initGui();
		itemRenderer = mc.getRenderItem();
		
		craftLeft = new GuiButton(0, width / 2 - 119, height / 2 + 15, 87, 20, "Craft");
		craftLeft.visible = false;
		buttonList.add(craftLeft);
		
		craftRight = new GuiButton(1, width / 2 + 33, height / 2 + 15, 87, 20, "Craft");
		craftRight.visible = false;
		buttonList.add(craftRight);

		categoryLeft = new GuiButton(2, width / 2 - 119, height / 2 - 122, 20, 20, "<");
		categoryLeft.enabled = false;
		buttonList.add(categoryLeft);
		
		categoryRight = new GuiButton(3, width / 2 + 99, height / 2 - 122, 20, 20, ">");
		categoryRight.enabled = type.pages.size() > (pageScroller + 1) * numCategories;
		buttonList.add(categoryRight);
		
		for(int i = 0; i < numCategories; i++)
		{
			if(pageScroller * numCategories + i < type.pages.size())
			{
				categories[i] = new GuiButton(4 + i, width / 2 - numCategories * 30 + i * 60, height / 2 - 100, 60, 20, type.pages.get(pageScroller * numCategories + i).name);
				buttonList.add(categories[i]);
			}
			else
			{
				categories[i] = new GuiButton(4 + i, width / 2 - numCategories * 30 + i * 60, height / 2 - 100, 60, 20, "NONE");
				categories[i].visible = false;
				buttonList.add(categories[i]);
			}
		}

	}
	
	@Override
	protected void actionPerformed(GuiButton button)
	{
		if(categories == null)
		{
			return;
		}
		switch(button.id)
		{
			case 0: //Left
				FlansMod.getPacketHandler().sendToServer(new PacketBuyWeapon(type, currentEntry.type));
				break;
			case 1: //Right
				FlansMod.getPacketHandler().sendToServer(new PacketBuyWeapon(type, currentSubEntry.type));
				break;
			case 2: //Left
				if(pageScroller > 0)
					pageScroller--;
				break;
			case 3: //Right
				if(type.pages.size() > (pageScroller + 1) * numCategories)
					pageScroller++;
				break;
			default:
				currentPage = type.pages.get(pageScroller * numCategories + button.id - 4);
				currentEntry = null;
				currentSubEntry = null;

		}
		
		categoryLeft.enabled = pageScroller > 0;
		categoryRight.enabled = type.pages.size() > (pageScroller + 1) * numCategories;
		
		for(int i = 0; i < numCategories; i++)
		{
			if(pageScroller * numCategories + i < type.pages.size())
			{
				categories[i].visible = true;
				categories[i].displayString = type.pages.get(pageScroller * numCategories + i).name;
			}
			else categories[i].visible = false;
		}
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i1, int j1)
	{
		GlStateManager.color(1F, 1F, 1F, 1F);
		mc.renderEngine.bindTexture(texture);

		int originX = guiOriginX = (width - xSize) / 2;
		int originY = guiOriginY = (height - ySize) / 2;
		
		drawModalRectWithCustomSizedTexture(originX, originY, 0, 0, xSize, ySize, textureX, textureY);
		
		if(currentPage != null)
		{
			if(currentEntry != null)
			{
				int currentEntryIndex = currentPage.entries.indexOf(currentEntry);
				
				//Render sub entry selection boxes
				drawModalRectWithCustomSizedTexture(originX + 130, originY + 54, 290, 4, 24, 112, textureX, textureY);
				drawModalRectWithCustomSizedTexture(originX + 95, originY + 57 + currentEntryIndex * 22, 318, 28, 38, 18, textureX, textureY);
				
				//Loop twice for bg texture and item
				for(int i = 0; i < 5; i++)
				{
					if(i >= currentEntry.childEntries.size())
						break;
					GunBoxEntry subEntry = currentEntry.childEntries.get(i);
					drawModalRectWithCustomSizedTexture(originX + 133, originY + 57 + i * 22, 319, 8, 18, 18, textureX, textureY);
				}
				
				if(currentSubEntry != null)
				{
					int currentSubEntryIndex = currentEntry.childEntries.indexOf(currentSubEntry);
					// Render right panel thing
					drawModalRectWithCustomSizedTexture(originX + 132, originY + 55 + currentSubEntryIndex * 22, 327, 48, 29, 22, textureX, textureY);
					
					
					//Render right panel bg
					renderPanelBackground(currentSubEntry, originX + 161, originY + 57);
				}
				
				//Render left panel for bg 
				renderPanelBackground(currentEntry, originX + 8, originY + 57);

				//Render left panel detail
				renderPanelForeground(currentEntry, originX + 8, originY + 57);

				if(currentSubEntry != null)
				{
					//Render right panel detail
					renderPanelForeground(currentSubEntry, originX + 161, originY + 57);
				}
				
				
				for(int i = 0; i < 5; i++)
				{
					if(i >= currentEntry.childEntries.size())
						break;
					GunBoxEntry subEntry = currentEntry.childEntries.get(i);
					renderInfoType(subEntry.type, originX + 134, originY + 58 + i * 22);
				}
			}
			
			//Render options
			for(int i = 0; i < 5; i++)
			{
				if(i >= currentPage.entries.size())
					break;
				GunBoxEntryTopLevel entry = currentPage.entries.get(i);

				renderInfoType(entry.type, originX + 106, originY + 58 + i * 22);
			}
		}
		int stringWidth = mc.fontRenderer.getStringWidth(type.name);
		mc.fontRenderer.drawString(type.name, originX + xSize / 2 - stringWidth / 2, originY + 8, 0x00000000);
		mc.fontRenderer.drawString(type.name, originX + xSize / 2 - stringWidth / 2 + 1, originY + 7, 0xffffffff);
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		super.drawScreen(mouseX, mouseY, partialTicks);
		renderHoveredToolTip(mouseX, mouseY);
	}
	
	private void renderInfoType(InfoType type, int x, int y)
	{
		if(type == null)
		{
			FlansMod.log.warn("Null type when rendering!");
			return;
		}
		drawSlotInventory(new ItemStack(type.item), x, y);
	}
	
	private void renderPanelBackground(GunBoxEntry entry, int x, int y)
	{
		int numParts = entry.requiredParts.size();
		
		int numPartsOnLine1 = Math.min(numParts, 4);
		int numPartsOnLine2 = numParts > 4 ? Math.min(numParts - 4, 4) : 0;
		
		if(numPartsOnLine1 > 0)
			drawModalRectWithCustomSizedTexture(x + 5, y + 44, 276, 122, 18 + 20 * (numPartsOnLine1 - 1), 18, textureX, textureY);
		if(numPartsOnLine2 > 0)
			drawModalRectWithCustomSizedTexture(x + 5, y + 64, 276, 122, 18 + 20 * (numPartsOnLine2 - 1), 18, textureX, textureY);
	}
	
	private void renderPanelForeground(GunBoxEntry entry, int x, int y)
	{
		if(entry == null)
		{
			return;
		}
		FontRenderer fr = mc.fontRenderer;
		
		String bufferLine = "";
		String bufferLine2 = "";
		String bufferArray[] = entry.type.name.split(" ");
		
		for(String aBufferArray : bufferArray)
		{
			if((bufferLine.length() + aBufferArray.length()) <= 16)
				bufferLine += aBufferArray + " ";
			else
				bufferLine2 += aBufferArray + " ";
		}

		fr.drawString(bufferLine, x + 5, y + 5, 0x00000000);
		fr.drawString(bufferLine2, x + 5, y + 15, 0x00000000);
		
		fr.drawString("Cost", x + 5, y + 35, 0x00000000);
		
		int numParts = entry.requiredParts.size();
		
		int numPartsOnLine1 = Math.min(numParts, 4);
		int numPartsOnLine2 = numParts > 4 ? Math.min(numParts - 4, 4) : 0;
		
		for(int i = 0; i < numPartsOnLine1; i++)
		{
			drawSlotInventory(entry.requiredParts.get(i), x + 6 + 20 * i, y + 45);
		}
		for(int i = 0; i < numPartsOnLine2; i++)
		{
			drawSlotInventory(entry.requiredParts.get(i + 4), x + 6 + 20 * i, y + 65);
		}
	}

	private void drawSlotInventory(ItemStack itemstack, int i, int j)
	{
		if(itemstack == null || itemstack.isEmpty())
			return;
		RenderHelper.enableGUIStandardItemLighting();
		
		itemRenderer.renderItemIntoGUI(itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, itemstack, i, j, null);
	}

	@Override
	protected void mouseClicked(int i, int j, int k) throws IOException
	{
		super.mouseClicked(i, j, k);
		int m = i - guiOriginX;
		int n = j - guiOriginY;
		if(k == 0 || k == 1)
		{
			if(currentPage != null)
			{
				for(int e = 0; e < 5; e++)
				{
					if(e < currentPage.entries.size() && 105 < m && m < 123 && 57 + e * 22 < n && n < 76 + e * 22)
					{
						currentEntry = currentPage.entries.get(e);
						currentSubEntry = currentEntry.childEntries.size() > 0 ? currentEntry.childEntries.get(0) : null;
					}
				}
			}
			
			if(currentEntry != null)
			{
				for(int e = 0; e < 5; e++)
				{
					if(e < currentEntry.childEntries.size() && 133 < m && m < 151 && 57 + e * 22 < n && n < 76 + e * 22)
					{
						currentSubEntry = currentEntry.childEntries.get(e);
					}
				}
			}
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
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
