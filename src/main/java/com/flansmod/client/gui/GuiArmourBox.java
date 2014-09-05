package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.teams.ArmourBoxType.ArmourBoxEntry;

import cpw.mods.fml.client.FMLClientHandler;
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

public class GuiArmourBox extends GuiScreen 
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/armourBox.png");
	private InventoryPlayer inventory;
	private Minecraft mc;
	private static RenderItem itemRenderer = new RenderItem();
	private ArmourBoxType type;
	private int page;
	private int guiOriginX;
	private int guiOriginY;
	private int scroll;
	
	public GuiArmourBox(InventoryPlayer playerinventory, ArmourBoxType type)
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
		int n = guiOriginY = l / 2 - 91;
		drawTexturedModalRect(m, n, 0, 0, 176, 182);

		//No idea why this works, but it makes the text bind its texture correctly
		//mc.renderEngine.bindTexture("/terrain.png");
		//TODO : Investigate
		
		drawCenteredString(fontRendererObj, type.name, k / 2, n + 5, 0xffffff);
		mc.renderEngine.bindTexture(texture);
		
		// Grey out buttons when they are unavaliable
		if (page == 0)
			drawTexturedModalRect(m + 77, n + 87, 176, 0, 10, 10);
		if (page >= type.pages.size() - 1)
			drawTexturedModalRect(m + 89, n + 87, 186, 0, 10, 10);

		RenderHelper.enableGUIStandardItemLighting();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);

		// Fill the gun panels with guns
		drawRecipe(fontrenderer, m, n, page);
		// Draw the inventory slots (not real slots)
		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 9; col++)
			{
				drawSlotInventory(inventory.getStackInSlot(col + (row + 1) * 9), m + 8 + col * 18, n + 100 + row * 18);
			}
		}
		for (int col = 0; col < 9; col++)
		{
			drawSlotInventory(inventory.getStackInSlot(col), m + 8 + col * 18, n + 158);
		}

		GL11.glDisable(3042 /*GL_BLEND*/);
	}
	
	/** 
	 * @param fontrenderer
	 * @param m : x position to render in
	 * @param n : y position to render in
	 * @param q : armour page
	 * */
	private void drawRecipe(FontRenderer fontrenderer, int m, int n, int q)
	{
		ArmourBoxEntry page = type.pages.get(q);
		if (page != null)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			//fontRenderer.drawString(type.guns[q].name, m + 9, n + 22, 0xffffffff);
			
			//Iterate over x
			for(int i = 0; i < 2; i++)
			{
				//Iterate over y
				for(int j = 0; j < 2; j++)
				{
					drawSlotInventory(new ItemStack(page.armours[i * 2 + j].item), m + 9 + 83 * i, n + 44 + 22 * j);
					int numParts = page.requiredStacks[i * 2 + j].size();
					//Find which 3 parts to render
					int startPart = 0;
					if (numParts >= 4)
					{
						startPart = (scroll / 40) % (numParts - 2);
					}
					
					for(int p = 0; p < (numParts < 3 ? numParts : 3); p++)
					{
						drawSlotInventory(page.requiredStacks[i * 2 + j].get(startPart + p), m + 30 + p * 19 + 83 * i, n + 44 + 22 * j);
					}
				}
			}
	
			//Draw the armour name at the top
			RenderHelper.disableStandardItemLighting();
			drawCenteredString(fontrenderer, page.name, m + 87, n + 25, 0xffffff);
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
			if (m > 77 && m < 87 && n > 87 && n < 97)
			{
				if (page > 0)
					page--;
			}

			// Forwards button
			if (m > 89 && m < 99 && n > 87 && n < 97)
			{
				if (page < type.pages.size() - 1)
					page++;
			}

			// Gun 1
			//Iterate over x
			for(int x = 0; x < 2; x++)
			{
				//Iterate over y
				for(int y = 0; y < 2; y++)
				{
					if(type.pages.get(page).armours[x * 2 + y] != null && m > 7 + 83 * x && m < 27 + 83 * x && n > 42 + 22 * y && n < 62 + 22 * y)
					{
						type.block.buyArmour(type.pages.get(page).shortName, x * 2 + y, inventory);
					}
				}
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
