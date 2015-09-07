package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.client.FMLClientHandler;

import com.flansmod.common.guns.boxes.GunBoxType;

public class GuiGunBox extends GuiScreen
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/weaponBox.png");
	private InventoryPlayer inventory;
	private Minecraft mc;
	private static RenderItem itemRenderer = new RenderItem();
	private GunBoxType type;
	private int page;
	private int guiOriginX;
	private int guiOriginY;
	private int scroll;
	
	public GuiGunBox(InventoryPlayer playerinventory, GunBoxType type)
	{
		inventory = playerinventory;
		mc = FMLClientHandler.instance().getClient();
		this.type = type;
		page = 0;
	}
	
	@Override
	public void updateScreen()
	{
		super.updateScreen();
		scroll++;
	}

	@Override
	public void drawScreen(int i, int j, float f)
	{
		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int k = scaledresolution.getScaledWidth();
		int l = scaledresolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);
		mc.renderEngine.bindTexture(texture);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int m = guiOriginX = k / 2 - 88;
		int n = guiOriginY = l / 2 - 102;
		drawTexturedModalRect(m, n, 0, 0, 176, 204);

		//No idea why this works, but it makes the text bind its texture correctly
		//mc.renderEngine.bindTexture("/terrain.png");
		//TODO : Investigate
		
		drawCenteredString(fontRendererObj, type.name, k / 2, n + 5, 0xffffff);
		mc.renderEngine.bindTexture(texture);
		
		// Draw the gun slots in the second gun panel if there is a second gun
		// on this page
		if (type.numGuns > page * 2 + 1 && type.guns[page * 2] != null && type.guns[page * 2 + 1] != null)
			drawTexturedModalRect(m + 89, n + 18, 5, 18, 82, 90);
		// Grey out buttons when they are unavaliable
		if (page == 0)
			drawTexturedModalRect(m + 77, n + 109, 176, 0, 10, 10);
		if (type.numGuns <= page * 2 + 2)
			drawTexturedModalRect(m + 89, n + 109, 186, 0, 10, 10);

		RenderHelper.enableGUIStandardItemLighting();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);

		// Fill the gun panels with guns
		drawRecipe(fontrenderer, m, n, page * 2, 0);
		if (type.numGuns > page * 2 + 1)
			drawRecipe(fontrenderer, m, n, page * 2 + 1, 1);
		// Draw the inventory slots (not real slots)
		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 9; col++)
			{
				drawSlotInventory(inventory.getStackInSlot(col + (row + 1) * 9), m + 8 + col * 18, n + 122 + row * 18);
			}
		}
		for (int col = 0; col < 9; col++)
		{
			drawSlotInventory(inventory.getStackInSlot(col), m + 8 + col * 18, n + 180);
		}

		GL11.glDisable(3042 /*GL_BLEND*/);
	}

	private void drawRecipe(FontRenderer fontrenderer, int m, int n, int q, int offset)
	{
		m += offset * 84;
		if (type.guns[q] != null)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			//fontRenderer.drawString(type.guns[q].name, m + 9, n + 22, 0xffffffff);
			drawSlotInventory(new ItemStack(type.guns[q].getItem()), m + 9, n + 44);
			if(type.bullets[q] != null)
				drawSlotInventory(new ItemStack(type.bullets[q].getItem()), m + 9, n + 66);
			if(type.altBullets[q] != null)
				drawSlotInventory(new ItemStack(type.altBullets[q].getItem()), m + 9, n + 88);
			int numParts = type.gunParts[q].size();
			int startPart = 0;
			if (numParts >= 4)
			{
				startPart = (scroll / 40) % (numParts - 2);
			}
			for (int p = 0; p < (numParts < 3 ? numParts : 3); p++)
			{
				drawSlotInventory(type.gunParts[q].get(startPart + p), m + 30 + p * 19, n + 44);
			}
			if(type.bullets[q] != null)
			{
				numParts = type.bulletParts[q].size();
				startPart = 0;
				if (numParts >= 4)
				{
					startPart = (scroll / 40) % (numParts - 2);
				}
				for (int p = 0; p < (numParts < 3 ? numParts : 3); p++)
				{
					drawSlotInventory(type.bulletParts[q].get(startPart + p), m + 30 + p * 19, n + 66);
				}
			}
			if(type.altBullets[q] != null)
			{
				numParts = type.altBulletParts[q].size();
				startPart = 0;
				if (numParts >= 4)
				{
					startPart = (scroll / 40) % (numParts - 2);
				}
				for (int p = 0; p < (numParts < 3 ? numParts : 3); p++)
				{
					drawSlotInventory(type.altBulletParts[q].get(startPart + p), m + 30 + p * 19, n + 88);
				}
			}
			RenderHelper.disableStandardItemLighting();
			String name = type.guns[q].name;
			if (name.length() > 12)
			{
				int nextSpace = name.indexOf(" ", 10);
				if (nextSpace != -1)
				{
					drawCenteredString(fontrenderer, name.substring(0, nextSpace), m + 46, n + 22, 0xffffff);
					drawCenteredString(fontrenderer, name.substring(nextSpace + 1, name.length()), m + 46, n + 32, 0xffffff);
				} else
					drawCenteredString(fontrenderer, name, m + 46, n + 25, 0xffffff);
			} else
				drawCenteredString(fontrenderer, name, m + 46, n + 25, 0xffffff);
			RenderHelper.enableGUIStandardItemLighting();

		}
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

	@Override
	protected void mouseClicked(int i, int j, int k)
	{
		super.mouseClicked(i, j, k);
		int m = i - guiOriginX;
		int n = j - guiOriginY;
		if (k == 0 || k == 1)
		{
			// Back button
			if (m > 77 && m < 87 && n > 109 && n < 119)
			{
				if (page > 0)
					page--;
			}

			// Forwards button
			if (m > 89 && m < 99 && n > 109 && n < 119)
			{
				if (type.numGuns > page * 2 + 2)
					page++;
			}

			// Gun 1
			if (type.guns[page * 2] != null && m > 7 && m < 27 && n > 42 && n < 62)
			{
				type.block.buyGun(page * 2, inventory, type);
			}
			// Ammo 1
			if (type.bullets[page * 2] != null && m > 7 && m < 27 && n > 64 && n < 84)
			{
				type.block.buyAmmo(page * 2, inventory, type);
			}
			// Alt Ammo 1
			if (type.altBullets[page * 2] != null && m > 7 && m < 27 && n > 86 && n < 106)
			{
				type.block.buyAltAmmo(page * 2, inventory, type);
			}

			// Gun 2
			if (page * 2 + 1 < type.numGuns && type.guns[page * 2 + 1] != null && m > 91 && m < 111 && n > 42 && n < 62)
			{
				type.block.buyGun(page * 2 + 1, inventory, type);
			}
			// Ammo 2
			if (page * 2 + 1 < type.numGuns && type.bullets[page * 2 + 1] != null && m > 91 && m < 111 && n > 64 && n < 84)
			{
				type.block.buyAmmo(page * 2 + 1, inventory, type);
			}
			// Alt Ammo 2
			if (page * 2 + 1 < type.numGuns && type.altBullets[page * 2 + 1] != null && m > 91 && m < 111 && n > 86 && n < 106)
			{
				type.block.buyAltAmmo(page * 2 + 1, inventory, type);
			}
		}
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
