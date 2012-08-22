package flansmod.minecraft;

import net.minecraft.client.Minecraft;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.OpenGlHelper;
import net.minecraft.src.RenderHelper;
import net.minecraft.src.RenderItem;
import net.minecraft.src.ScaledResolution;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import flansmod.common.BlockGunBox;

public class GuiGunBox extends GuiScreen
{

    public GuiGunBox(InventoryPlayer playerinventory, BlockGunBox weaponbox)
    {
		inventory = playerinventory;
		mc = FMLClientHandler.instance().getClient();
		box = weaponbox;
		page = 0;
    }

	public void drawScreen(int i, int j, float f)
    {
		long newTime = mc.theWorld.getWorldInfo().getWorldTime();
		if(newTime > lastTime)
		{
			lastTime = newTime;
			if(newTime % 40 == 0)
				scroll++;
		}
        ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
        int k = scaledresolution.getScaledWidth();
        int l = scaledresolution.getScaledHeight();
        FontRenderer fontrenderer = mc.fontRenderer;
		drawDefaultBackground();
		GL11.glEnable(3042 /*GL_BLEND*/);
        GL11.glBindTexture(3553 /*GL_TEXTURE_2D*/, mc.renderEngine.getTexture("/gui/weaponBox.png"));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int m = guiOriginX = k / 2 - 88;
		int n = guiOriginY = l / 2 - 102;
		drawTexturedModalRect(m, n, 0, 0, 176, 204);
		drawCenteredString(fontRenderer, box.type.name, k / 2, n + 5, 0xffffff);
		GL11.glBindTexture(3553 /*GL_TEXTURE_2D*/, mc.renderEngine.getTexture("/gui/weaponBox.png"));
		//Draw the gun slots in the second gun panel if there is a second gun on this page
		if(box.type.numGuns > page * 2 + 1 && box.type.guns[page * 2] != null && box.type.guns[page * 2 + 1] != null)
			drawTexturedModalRect(m + 89, n + 18, 5, 18, 82, 90);
		//Grey out buttons when they are unavaliable
		if(page == 0)
			drawTexturedModalRect(m + 77, n + 109, 176, 0, 10, 10);
		if(box.type.numGuns <= page * 2 + 2)
			drawTexturedModalRect(m + 89, n + 109, 186, 0, 10, 10);
		
		RenderHelper.enableGUIStandardItemLighting();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
		
		//Fill the gun panels with guns
		drawRecipe(fontrenderer, m, n, page * 2, 0);
		if(box.type.numGuns > page * 2 + 1)
			drawRecipe(fontrenderer, m, n, page * 2 + 1, 1);
		//Draw the inventory slots (not real slots)
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 9; col++)
			{
				drawSlotInventory(inventory.getStackInSlot(col + (row + 1) * 9), m + 8 + col * 18, n + 122 + row * 18);
			}
		}
		for(int col = 0; col < 9; col++)
		{
			drawSlotInventory(inventory.getStackInSlot(col), m + 8 + col * 18, n + 180);
		}
		
		GL11.glDisable(3042 /*GL_BLEND*/);
	}
	
	private void drawRecipe(FontRenderer fontrenderer, int m, int n, int q, int offset)
	{
		m += offset * 84;
		if(box.type.guns[q] != null)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			//fontRenderer.drawString(box.type.guns[q].name, m + 9, n + 22, 0xffffffff);	
			RenderHelper.disableStandardItemLighting();
			String name = box.type.guns[q].name;
			if(name.length() > 12)
			{
				int nextSpace = name.indexOf(" ", 10);
				if(nextSpace != -1)
				{
					drawCenteredString(fontrenderer, name.substring(0, nextSpace), m + 46, n + 22, 0xffffff);
					drawCenteredString(fontrenderer, name.substring(nextSpace + 1, name.length()), m + 46, n + 32, 0xffffff);
				}
				else drawCenteredString(fontrenderer, name, m + 46, n + 25, 0xffffff);
			}
			else drawCenteredString(fontrenderer, name, m + 46, n + 25, 0xffffff);
			RenderHelper.enableGUIStandardItemLighting();
			drawSlotInventory(new ItemStack(box.type.guns[q].getItem()), m + 9, n + 44);
			drawSlotInventory(new ItemStack(box.type.bullets[q].getItem()), m + 9, n + 66);
			if(box.type.altBullets[q] != null)
			{
				drawSlotInventory(new ItemStack(box.type.altBullets[q].getItem()), m + 9, n + 88);
			}
			int numParts = box.type.gunParts[q].size();
			int startPart = 0;
			if(numParts >= 4)
			{
				startPart = scroll % (numParts - 2);
			}
			for(int p = 0; p < (numParts < 3 ? numParts : 3); p++)
			{
				drawSlotInventory(box.type.gunParts[q].get(startPart + p), m + 30 + p * 19, n + 44);
			}
			numParts = box.type.bulletParts[q].size();
			startPart = 0;
			if(numParts >= 4)
			{
				startPart = scroll % (numParts - 2);
			}
			for(int p = 0; p < (numParts < 3 ? numParts : 3); p++)
			{
				drawSlotInventory(box.type.bulletParts[q].get(startPart + p), m + 30 + p * 19, n + 66);
			}	
			if(box.type.altBullets[q] != null)
			{
				numParts = box.type.altBulletParts[q].size();
				startPart = 0;
				if(numParts >= 4)
				{
					startPart = scroll % (numParts - 2);
				}
				for(int p = 0; p < (numParts < 3 ? numParts : 3); p++)
				{
					drawSlotInventory(box.type.altBulletParts[q].get(startPart + p), m + 30 + p * 19, n + 88);
				}
			}
		}
	}
		
	private void drawSlotInventory(ItemStack itemstack, int i, int j)
    {
        itemRenderer.renderItemIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
        itemRenderer.renderItemOverlayIntoGUI(fontRenderer, mc.renderEngine, itemstack, i, j);
    }
	
	protected void mouseClicked(int i, int j, int k)
    {
        super.mouseClicked(i, j, k);
		int m = i - guiOriginX;
		int n = j - guiOriginY;
        if(k == 0 || k == 1)
        {
			//Back button
			if(m > 77 && m < 87 && n > 109 && n < 119)
			{
				if(page > 0)
					page--;	
			}
			
			//Forwards button
			if(m > 89 && m < 99 && n > 109 && n < 119)
			{
				if(box.type.numGuns > page * 2 + 2)
					page++;		
			}
			
			//Gun 1
			if(box.type.guns[page * 2] != null && m > 7 && m < 27 && n > 42 && n < 62)
			{
				box.buyGun(page * 2, inventory);
			}
			//Ammo 1
			if(box.type.bullets[page * 2] != null && m > 7 && m < 27 && n > 64 && n < 84)
			{
				box.buyAmmo(page * 2, inventory);
			}
			//Alt Ammo 1
			if(box.type.altBullets[page * 2] != null && m > 7 && m < 27 && n > 86 && n < 106)
			{
				box.buyAltAmmo(page * 2, inventory);
			}
			
			//Gun 2
			if(page * 2 + 1 < box.type.numGuns && box.type.guns[page * 2 + 1] != null && m > 91 && m < 111 && n > 42 && n < 62)
			{
				box.buyGun(page * 2 + 1, inventory);
			}
			//Ammo 2
			if(page * 2 + 1 < box.type.numGuns && box.type.bullets[page * 2 + 1] != null && m > 91 && m < 111 && n > 64 && n < 84)
			{
				box.buyAmmo(page * 2 + 1, inventory);
			}		
			//Alt Ammo 2
			if(page * 2 + 1 < box.type.numGuns && box.type.altBullets[page * 2 + 1] != null && m > 91 && m < 111 && n > 86 && n < 106)
			{
				box.buyAltAmmo(page * 2 + 1, inventory);
			}
        }
    }
	
	protected void keyTyped(char c, int i)
    {
        if(i == 1 || i == mc.gameSettings.keyBindInventory.keyCode)
        {
            mc.thePlayer.closeScreen();
        }
    }
	
	public boolean doesGuiPauseGame()
    {
        return false;
    }
	
	private InventoryPlayer inventory;
	private Minecraft mc;
	private static RenderItem itemRenderer = new RenderItem();
	private BlockGunBox box;
	private int page;
	private int guiOriginX;
	private int guiOriginY;
	private int scroll;
	private long lastTime;
}
