package com.flansmod.client.gui.teams;

import java.io.IOException;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.model.CustomItemRenderType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.teams.LoadoutPool;
import com.flansmod.common.teams.PlayerLoadout;
import com.flansmod.common.teams.PlayerRankData;
import com.flansmod.common.types.EnumPaintjobRarity;

public class GuiTeamsBase extends GuiScreen
{
	/**
	 * Item renderer
	 */
	protected static RenderItem itemRenderer;
	/**
	 * Gui origin
	 */
	protected int guiOriginX, guiOriginY;
	
	protected Minecraft mc;
	protected EntityPlayer player;
	
	public GuiTeamsBase()
	{
		super();
		mc = Minecraft.getMinecraft();
		player = mc.player;
		itemRenderer = mc.getRenderItem();
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
	}
	
	@Override
	public void drawScreen(int i, int j, float f)
	{
		super.drawScreen(i, j, f);
	}
	
	private static final ResourceLocation loudoutBoxes = new ResourceLocation("flansmod", "gui/LandingPage.png");
	private static final ResourceLocation ranks = new ResourceLocation("flansmod", "gui/Ranks.png");
	private static final ResourceLocation loadoutEditor = new ResourceLocation("flansmod", "gui/LoadoutEditor.png");
	
	protected void DrawLoadoutPanel(LoadoutPool pool, PlayerRankData data, int i, int j, int n)
	{
		mc.renderEngine.bindTexture(loudoutBoxes);
		
		int textureX = 512;
		int textureY = 256;
		
		if(data.currentLevel >= pool.slotUnlockLevels[n])
		{
			drawModalRectWithCustomSizedTexture(i, j, 7 + 49 * n, 28, 46, 111, textureX, textureY);
			
			PlayerLoadout loadout = data.loadouts[n];
			if(loadout != null)
			{
				DrawGun(loadout.slots[0], i + 20, j + 28, 16f);
				DrawGun(loadout.slots[1], i + 20, j + 46, 16f);
				
				drawSlotInventory(loadout.slots[0], i + 6, j + 54);
				drawSlotInventory(loadout.slots[1], i + 24, j + 54);
				drawSlotInventory(loadout.slots[2], i + 6, j + 72);
				drawSlotInventory(loadout.slots[3], i + 24, j + 72);
			}
		}
		else
		{
			
			drawModalRectWithCustomSizedTexture(i, j, 259, 28, 46, 111, textureX, textureY);
			drawCenteredString(fontRenderer, "Unlocks", i + 23, j + 23, 0xffffff);
			drawCenteredString(fontRenderer, "at " + pool.slotUnlockLevels[n], i + 23, j + 40, 0xffffff);
		}
		
		drawCenteredString(fontRenderer, "Slot " + (n + 1), i + 23, j + 5, 0xffffff);
	}
	
	protected void DrawRarityBackground(EnumPaintjobRarity rarity, int i, int j)
	{
		mc.renderEngine.bindTexture(loadoutEditor);
		int textureX = 512;
		int textureY = 256;
		
		if(rarity != EnumPaintjobRarity.UNKNOWN)
		{
			int x = 0, y = 71;
			switch(rarity)
			{
				case COMMON: x = 331;
					break;
				case UNCOMMON: x = 349;
					break;
				case RARE: x = 367;
					break;
				case LEGENDARY:
				{
					x = 385;
					break;
				}
				default: break;
			}
			if(x > 0)
			{
				drawModalRectWithCustomSizedTexture(i, j, x, y, 16, 16, textureX, textureY);
			}
		}
	}
	
	protected void DrawGun(ItemStack stack, int x, int y, float scale)
	{
		if(stack != null && stack.getItem() instanceof ItemGun)
		{
			GunType gunType = ((ItemGun)stack.getItem()).GetType();
			if(gunType.model != null)
			{
				GL11.glPushMatrix();
				GL11.glColor4f(1F, 1F, 1F, 1F);
				
				GL11.glTranslatef(x, y, 100);
				
				GlStateManager.disableLighting();
				GlStateManager.pushMatrix();
				GlStateManager.rotate(180F, 1.0F, 0.0F, 0.0F);
				GlStateManager.rotate(1F, 0.0F, 1.0F, 0.0F);
				RenderHelper.enableStandardItemLighting();
				
				GlStateManager.popMatrix();
				GlStateManager.enableRescaleNormal();
				
				GL11.glRotatef(160, 1F, 0F, 0F);
				GL11.glRotatef(10, 0F, 1F, 0F);
				GL11.glScalef(-scale, scale, scale);
				ClientProxy.gunRenderer.renderItem(CustomItemRenderType.ENTITY, EnumHand.MAIN_HAND, stack);
				
				RenderHelper.disableStandardItemLighting();
				
				GL11.glPopMatrix();
			}
		}
	}
	
	protected void DrawRankIcon(int rank, int prestige, int x, int y, boolean doubleSize)
	{
		mc.renderEngine.bindTexture(ranks);
		
		if(doubleSize)
		{
			drawModalRectWithCustomSizedTexture(guiOriginX + x, guiOriginY + y, rank * 32, prestige * 32, 32, 32, 1024, 512);
		}
		else
			drawModalRectWithCustomSizedTexture(guiOriginX + x, guiOriginY + y, rank * 16, prestige * 16, 16, 16, 512, 256);
	}
	
	/**
	 * Item stack renderering method
	 */
	protected void drawSlotInventory(ItemStack itemstack, int i, int j)
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
	
	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException
	{
		if(AllowEscape())
		{
			super.keyTyped(typedChar, keyCode);
		}
	}
	
	protected boolean AllowEscape()
	{
		return false;
	}
}
