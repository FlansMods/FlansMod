package com.flansmod.client.gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.boxes.ContainerGunBox;
import com.flansmod.common.guns.boxes.GunBoxEntry;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.guns.boxes.GunPage;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiGunBox extends GuiContainer
{
	private ResourceLocation texture = new ResourceLocation("flansmod", "gui/weaponBoxDefault.png");
	private static RenderItem itemRenderer = new RenderItem();
	private InventoryPlayer inventory;
	private Minecraft mc;
	private GunPage currentPage;
	private GunBoxType type;
	private String recipeTooltip = null;
	private int mouseX, mouseY;
	private boolean tabToAmmo = false;

	//Selection and hover checks
	private int hoverOver = -1;
	private int selectedItem = -1;
	private int selectedAmmoitem = -1;
	private int pageIndex = 0;
	private boolean craftHighlight = false;
	private boolean nextHighlight = false;
	private boolean backHighlight = false;
	private List<String> gunStats;


	public GuiGunBox(InventoryPlayer playerinventory, GunBoxType type, World w)
	{
		super(new ContainerGunBox(playerinventory, w));
		mc = FMLClientHandler.instance().getClient();
		this.type = type;
		inventory = playerinventory;

		xSize = 273;
		ySize = 233;

		//Set to the first gun page
		currentPage = type.gunPages.get(pageIndex);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y)
	{
		GunBoxEntry[] entries = currentPage.gunList;

		//Draw titles
		fontRendererObj.drawString(type.name, 7, 6, hexColor(type.gunBoxTextColor));
		fontRendererObj.drawStringWithShadow(currentPage.pageName, (29 + 33) - (fontRendererObj.getStringWidth(currentPage.pageName) / 2), 26, hexColor(type.pageTextColor));

		//List gun item entries
		for(int i = 0; i < entries.length && i < 8; i++)
		{
			if(entries[i] != null)
			{
				String label = entries[i].type.name;

				//Truncate if name is greater than the boundary
				if(fontRendererObj.getStringWidth(label) > 97)
					label = label.substring(0, Math.min(label.length(), 15)) + "...";

				fontRendererObj.drawString(label, 19, 46 + (i * 12), hexColor(type.itemListTextColor));
			}
		}

		//If a weapon has been selected from the list
		if(selectedItem != -1)
		{
			GunBoxEntry entry = entries[selectedItem];
			//Draw gun and ammo items
			drawSlotInventory(new ItemStack(entry.type.getItem()), 127, 26);
			if(!entry.isAmmoNullOrEmpty())
			{
				for(int i = 0; i < entry.ammoEntryList.size(); i++)
					drawSlotInventory(new ItemStack(entry.ammoEntryList.get(i).type.getItem()), 155 + (i * 22), 26);
			}

			if(!tabToAmmo)
			{
				fontRendererObj.drawString(entry.type.name, 127, 52, hexColor(type.itemTextColor));
				drawRecipe(entry.requiredParts);
			}
			else if(!entry.isAmmoNullOrEmpty())
			{
				fontRendererObj.drawString(entry.ammoEntryList.get(selectedAmmoitem).type.name, 127, 52, hexColor(type.itemTextColor));
				drawRecipe(entry.ammoEntryList.get(selectedAmmoitem).requiredParts);
			}

			//Draw bootleg craft button text
			if(craftHighlight)
				fontRendererObj.drawStringWithShadow("Craft", (126 + 32) - (fontRendererObj.getStringWidth("Craft") / 2), 117, hexColor(type.buttonTextHoverColor));
			else
				fontRendererObj.drawStringWithShadow("Craft", (126 + 32) - (fontRendererObj.getStringWidth("Craft") / 2), 117, hexColor(type.buttonTextColor));

		}

		//Draw bootleg page button text
		if(nextHighlight)
			fontRendererObj.drawStringWithShadow(">", (97 + 10) - (fontRendererObj.getStringWidth(">") / 2), 26, hexColor(type.buttonTextHoverColor));
		else
			fontRendererObj.drawStringWithShadow(">", (97 + 10) - (fontRendererObj.getStringWidth(">") / 2), 26, hexColor(type.buttonTextColor));

		if(backHighlight)
			fontRendererObj.drawStringWithShadow("<", (7 + 10) - (fontRendererObj.getStringWidth("<") / 2), 26, hexColor(type.buttonTextHoverColor));
		else
			fontRendererObj.drawStringWithShadow("<", (7 + 10) - (fontRendererObj.getStringWidth("<") / 2), 26, hexColor(type.buttonTextColor));

		//Draw tooltips
		if(recipeTooltip != null)
			drawHoveringText(Collections.singletonList(recipeTooltip), mouseX - guiLeft, mouseY - guiTop, fontRendererObj);
		//Draw Stats
		if(gunStats != null)
			drawHoveringText(gunStats, mouseX - guiLeft, mouseY - guiTop, fontRendererObj);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		int xOrigin = (width - xSize) / 2;
		int yOrigin = (height - ySize) / 2;

		if(type.guiTexturePath != null)
			texture = new ResourceLocation("flansmod", type.guiTexturePath + ".png");
		mc.renderEngine.bindTexture(texture);
		drawTexturedModalRect(xOrigin, yOrigin, 0, 0, xSize, ySize);

		if(hoverOver != -1)
		{
			drawTexturedModalRect(xOrigin + 8, yOrigin + 43 + (hoverOver * 12), 383, 5, 108, 12);
		}

		//Draw main weapon/ammo window
		if(selectedItem != -1)
		{
			GunBoxEntry entry = currentPage.gunList[selectedItem];

			drawTexturedModalRect(xOrigin + 8, yOrigin + 43 + (selectedItem * 12), 275, 5, 108, 12);
			drawTexturedModalRect(xOrigin + 121, yOrigin + 20, 275, 207, 144, 25);
			if(!tabToAmmo)
			{
				drawTexturedModalRect(xOrigin + 121, yOrigin + 45, 275, 17, 144, 95);
				drawTexturedModalRect(xOrigin + 127, yOrigin + 26, 419, 33, 16, 16);
			}
			else
			{
				drawTexturedModalRect(xOrigin + 121, yOrigin + 45, 275, 112, 144, 95);
			}

			//Draw inv slots per each ammo entry
			if(!entry.isAmmoNullOrEmpty())
			{
				for(int k = 0; k < entry.ammoEntryList.size(); k++)
					drawTexturedModalRect(xOrigin + 154 + (k * 22), yOrigin + 25, 435, 17, 18, 18);
			}

			//Draw bootleg craft button
			if(craftHighlight)
				drawTexturedModalRect(xOrigin + 126, yOrigin + 111, 419, 85, 64, 20);
			else
				drawTexturedModalRect(xOrigin + 126, yOrigin + 111, 419, 65, 64, 20);
		}

		if(tabToAmmo && selectedAmmoitem != -1)
			drawTexturedModalRect(xOrigin + 155 + (selectedAmmoitem * 22), yOrigin + 26, 419, 17, 16, 16);

		//Draw bootleg page buttons
		if(nextHighlight)
			drawTexturedModalRect(xOrigin + 97, yOrigin + 20, 439, 105, 20, 20);
		else
			drawTexturedModalRect(xOrigin + 97, yOrigin + 20, 419, 105, 20, 20);

		if(backHighlight)
			drawTexturedModalRect(xOrigin + 7, yOrigin + 20, 439, 105, 20, 20);
		else
			drawTexturedModalRect(xOrigin + 7, yOrigin + 20, 419, 105, 20, 20);

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
	public void handleMouseInput()
	{
		super.handleMouseInput();

		mouseX = Mouse.getEventX() * this.width / this.mc.displayWidth;
		mouseY = this.height - Mouse.getEventY() * this.height / this.mc.displayHeight - 1;

		int mouseXInGUI = mouseX - guiLeft;
		int mouseYInGUI = mouseY - guiTop;

		//Hover over gun lists
		hoverOver = -1;
		int sectionX = 8;
		for(int i = 0; i < currentPage.gunList.length && i < 8; i++)
		{
			int sectionY = 43 + (i * 12);
			if(mouseXInGUI >= sectionX && mouseXInGUI < sectionX + 108 && mouseYInGUI >= sectionY && mouseYInGUI < sectionY + 12)
				hoverOver = i;
		}

		//Hover over craft button
		craftHighlight = (mouseXInGUI >= 126 && mouseXInGUI < 189 && mouseYInGUI >= 111 && mouseYInGUI < 130);

		//Hover over page buttons
		nextHighlight = (mouseXInGUI >= 97 && mouseXInGUI < 116 && mouseYInGUI >= 20 && mouseYInGUI < 39);
		backHighlight = (mouseXInGUI >= 7 && mouseXInGUI < 26 && mouseYInGUI >= 20 && mouseYInGUI < 39);

		//Hover for recipe tooltips
		recipeTooltip = null;
		gunStats = null;
		if(selectedItem != -1)
		{
			GunBoxEntry entry = currentPage.gunList[selectedItem];
			int count = (!tabToAmmo) ? entry.requiredParts.size() : entry.ammoEntryList.get(selectedAmmoitem).requiredParts.size();

			for(int i = 0; i < count; i++)
			{
				int itemX = 127 + (i * 19);
				int itemY = 68;
				if (i >= 4)
				{
					itemX = 127;
					itemY = 87;
				}
				if(mouseXInGUI >= itemX && mouseXInGUI < itemX + 16 && mouseYInGUI >= itemY && mouseYInGUI < itemY + 16)
					recipeTooltip = (!tabToAmmo) ? entry.requiredParts.get(i).getDisplayName() : entry.ammoEntryList.get(selectedAmmoitem).requiredParts.get(i).getDisplayName();
			}


			if(mouseXInGUI >= 127 && mouseXInGUI < 127 + 16 && mouseYInGUI >= 26 && mouseYInGUI < 26 + 16)
			{
				if(entry.type instanceof GunType)
				{
					List<String> lines = new ArrayList<String>();
					GunType gunType = (GunType) entry.type;
					lines.add(gunType.name);
					lines.add("\u00a79Damage" + "\u00a77: " + gunType.damage);
					lines.add("\u00a79Recoil" + "\u00a77: " + gunType.recoilPitch);
					lines.add("\u00a79Spread" + "\u00a77: " + gunType.bulletSpread);
					lines.add("\u00a79Reload" + "\u00a77: " + (gunType.reloadTime / 20) + "s");
					if(gunType.shootDelay != 0)
					{
						lines.add("\u00a79RPM" + "\u00a77: " + (1200 / gunType.shootDelay) + "rpm");
					}
					else
						lines.add("\u00a79RPM" + "\u00a77: " + (gunType.roundsPerMin) + "rpm");
					lines.add("\u00a79Mode(s)" + "\u00a77: " + gunType.mode);
					gunStats = lines;
				}
			}
		}
	}

	@Override
	protected void mouseClicked(int x, int y, int button)
	{
		int xOrigin = (width - xSize) / 2;
		int yOrigin = (height - ySize) / 2;

		super.mouseClicked(x, y, button);
		int m = x - xOrigin;
		int n = y - yOrigin;

		if (button == 0 || button == 1)
		{
			//If an item is selected in the list
			if(hoverOver != -1 && hoverOver < currentPage.gunList.length)
			{
				selectedItem = hoverOver;
				selectedAmmoitem = -1;
				tabToAmmo = false;
			}

			//Switch to weapon tab
			if(m >= 121 && m <= 148 && n >= 20 && n <= 44)
				tabToAmmo = false;

			//Go to previous page
			if(backHighlight && type.gunPages.size() > 1)
			{
				if(pageIndex == 0)
					pageIndex = type.gunPages.size() - 1;
				else
					pageIndex--;
				resetAndSwapPages();
			}

			//Go to next page
			if(nextHighlight && type.gunPages.size() > 1)
			{
				if(pageIndex == type.gunPages.size() - 1)
					pageIndex = 0;
				else
					pageIndex++;
				resetAndSwapPages();
			}

			//Switch through the ammo item tabs
			if(selectedItem != -1 && !currentPage.gunList[selectedItem].isAmmoNullOrEmpty())
			{
				for(int i = 0; i < currentPage.gunList[selectedItem].ammoEntryList.size(); i++)
				{
					if(m >= 152 + (i * 22) && m <= 173 + (i * 22) && n >= 23 && n <= 44)
					{
						tabToAmmo = true;
						selectedAmmoitem = i;
					}
				}
			}

			//Buy item
			if(craftHighlight)
			{
				//If gun is selected
				if(selectedItem != -1 && !tabToAmmo)
					type.block.buyGun(currentPage.gunList[selectedItem].type, inventory, type);

				if(tabToAmmo && selectedAmmoitem != -1)
					type.block.buyGun(currentPage.gunList[selectedItem].ammoEntryList.get(selectedAmmoitem).type, inventory, type);
			}
		}

		if(button != 0)
			return;
	}

	private void resetAndSwapPages()
	{
		selectedItem = -1;
		selectedAmmoitem = -1;
		tabToAmmo = false;
		currentPage = type.gunPages.get(pageIndex);
	}

	private void drawSlotInventory(ItemStack itemstack, int i, int j)
	{
		if(itemstack == null || itemstack.getItem() == null)
			return;
		RenderHelper.enableGUIStandardItemLighting();
		itemRenderer.renderItemIntoGUI(fontRendererObj, mc.renderEngine, itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRendererObj, mc.renderEngine, itemstack, i, j);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
	}

	private void drawRecipe(List<ItemStack> parts)
	{
		int i = 0;
		for(ItemStack stack : parts)
		{
			if(i < 4)
				drawSlotInventory(stack, 127 + (i * 19), 68);
			else
				drawSlotInventory(stack, 127 + ((i - 4) * 19), 87);
			i++;
		}
	}

	//Format hex string to int
	private int hexColor(String color)
	{
		return Integer.parseInt(color, 16);
	}

	@Override
	protected void keyTyped(char c, int i)
	{
		if (i == 1 || i == mc.gameSettings.keyBindInventory.getKeyCode())
		{
			mc.thePlayer.closeScreen();
		}
	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
