package com.flansmod.client.gui;

import java.io.IOException;
import java.util.Random;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.model.ModelDriveable;
import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketGunPaint;
import com.flansmod.common.paintjob.ContainerPaintjobTable;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.vector.Vector3f;

public class GuiPaintjobTable extends GuiContainer 
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/paintjobTable.png");
	private static final Random rand = new Random();
	
	private static final int paletteSizeX = 18;
	private static final int paletteSizeY = 4;
	
    private static final float componentBarLength = 68.0f;
	
	private Paintjob hoveringOver = null;
	private int mouseX, mouseY;
	private InventoryPlayer inventory;
	
	private boolean inCustomMode;
	private float customModeTransitionTimer = 0.0f;
	private float transitionSpeed = 0.9f;
	private int prevMainPageX;
	private RotatedAxes modelAxes = new RotatedAxes();
	private RotatedAxes prevModelAxes = new RotatedAxes();
	
	private static int[][] paletteColours = new int[paletteSizeX][paletteSizeY];
	private static int[] baseColours = new int[] { 0x000000, 0xffffff, 0xff0000, 0xff5500, 0xffaa00, 0xffff00, 0xaaff00, 0x55ff00, 0x00ff00, 0x00ff55, 0x00ffaa, 0x00ffff, 0x00aaff, 0x0055ff, 0x0000ff, 0x5500ff, 0xaa00ff, 0xff00ff };
	private static int currentColour;
	
	static { ResetPalette(); }
	
	private static void ResetPalette()
	{
        for(int x = 0; x < paletteSizeX; x++)
        {
        	for(int y = 0; y < paletteSizeY; y++)
    		{ 
        		int red = (baseColours[x] >> 16) & 0xff;
        		int green = (baseColours[x] >> 8) & 0xff;
        		int blue = (baseColours[x] >> 0) & 0xff;
        	
        		if(x == 0)
        		{
        			red = green = blue = 0xff * y / 7;
        		}
        		else if(x == 1)
        		{
        			red = green = blue = 0xff * (y + 4) / 7;
        		}
        		else
        		{
	        		if(y == 3)
	        		{
	        			red /= 2;
	        			green /= 2;
	        			blue /= 2;
	        		}
	        		if(y == 1)
	        		{
	        			red = 0xff - (0xff - red) / 2;
	        			green = 0xff - (0xff - green) / 2;
	        			blue = 0xff - (0xff - blue) / 2;
	        		}
	        		if(y == 0)
	        		{
	        			red = 0xff - (0xff - red) / 4;
	        			green = 0xff - (0xff - green) / 4;
	        			blue = 0xff - (0xff - blue) / 4;
	        		}
        		}
        		
        		paletteColours[x][y] = (red << 16) + (green << 8) + blue;
    		}
        }
	}
	
	public GuiPaintjobTable(InventoryPlayer inv, World w, TileEntityPaintjobTable te) 
	{
		super(new ContainerPaintjobTable(inv, w, te));
		inventory = inv;
		xSize = 224;
		ySize = 264;
		

	}
	
	@Override
	public void updateScreen()
	{
		super.updateScreen();
		
		prevModelAxes = modelAxes.clone();
		
		if(inCustomMode)
		{
			customModeTransitionTimer = 1.0f - ((1.0f - customModeTransitionTimer) * transitionSpeed);
		}
		else
		{
			customModeTransitionTimer *= transitionSpeed;
			modelAxes.rotateLocalYaw(2.5f);
		}
		
		int xPos = GetMainPageX();
		int dPos = xPos - prevMainPageX;
		
        for(int i = 0; i < 4 * 9 + 2; i++)
        {
        	inventorySlots.getSlot(i).xDisplayPosition += dPos;
        }
        
        prevMainPageX = xPos;
	}
	
	private int GetMainPageX() { return (int)(-500.0f * customModeTransitionTimer); }
	private int GetMainPageY() { return 0; }
	
	private int GetCustomPageX() { return (int)(500.0f * (1.0f - customModeTransitionTimer)); }
	private int GetCustomPageY() { return 0; }
	
	private Vector3f GetRenderOrigin()
	{
		Vector3f mainPagePosition = new Vector3f(100.0f, 64.0f, 100.0f);
		
		return mainPagePosition;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y)
	{
        // Render main screen
        if(customModeTransitionTimer <= 0.999f)
        {
            int xOrigin = ((width - xSize) / 2)  + GetMainPageX();
            int yOrigin = ((height - ySize) / 2) + GetMainPageY();
            
    		fontRendererObj.drawString("Inventory", GetMainPageX() + 8, GetMainPageY() + (ySize - 94) + 2, 0x404040);
    		fontRendererObj.drawString("Paintjob Table", GetMainPageX() + 8, GetMainPageY() + 6, 0x404040);
        }

        Vector3f renderOrigin = GetRenderOrigin();
        
		ItemStack paintableStack = inventorySlots.getSlot(0).getStack();
		if(paintableStack != null && paintableStack.getItem() instanceof IPaintableItem)
		{
			ItemStack tempStack = paintableStack.copy();
			if(hoveringOver != null)
				tempStack.setItemDamage(hoveringOver.ID);
			PaintableType paintableType = ((IPaintableItem)paintableStack.getItem()).GetPaintableType();
			EnumType eType = EnumType.getFromObject(paintableType);
			if(paintableType.GetModel() != null)
			{
				GL11.glPushMatrix();
				GL11.glColor4f(1F, 1F, 1F, 1F);

		        GL11.glDisable(GL11.GL_LIGHTING);
		        GL11.glPushMatrix();
		        
		        GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
		        RenderHelper.enableStandardItemLighting();
		        GL11.glPopMatrix();
		        GL11.glEnable(GL11.GL_NORMALIZE);
		        
				GL11.glTranslatef(renderOrigin.x, renderOrigin.y, renderOrigin.z);

				GL11.glRotatef(160, 1F, 0F, 0F);
				GL11.glRotatef(20, 0F, 1F, 0F);
				float scale = paintableType.GetRecommendedScale();
				GL11.glScalef(-scale, scale, scale);
				
				float dYaw = (modelAxes.getYaw() - prevModelAxes.getYaw());
				while(dYaw > 180.0f) dYaw -= 360.0f;
				while(dYaw < -180.0f) dYaw += 360.0f;
		        GL11.glRotatef(prevModelAxes.getYaw() + dYaw * RenderGun.smoothing, 0.0F, 1.0F, 0.0F);
		        
		        Paintjob paintjob = paintableType.paintjobs.get(tempStack.getItemDamage());

				switch(eType)
				{
					case gun: 
					{
						GunType gunType = (GunType)paintableType;
						ClientProxy.gunRenderer.renderGun(tempStack, gunType, 1F / 16F, gunType.model, GunAnimations.defaults, 0F, ItemRenderType.ENTITY); 
						break;
					}
					case attachment: 
					{
						mc.renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(paintjob));
						AttachmentType model = (AttachmentType)paintableType;
						GL11.glScalef(model.modelScale, model.modelScale, model.modelScale);
						((ModelAttachment)paintableType.GetModel()).renderAttachment(1F / 16F);
						break;
					}
					case plane:
					case vehicle:
					case mecha:
					{
						mc.renderEngine.bindTexture(FlansModResourceHandler.getPaintjobTexture(paintjob));
						((ModelDriveable)paintableType.GetModel()).render((DriveableType)paintableType);
						break;
					}
				
					default: break;
				}
				
				GL11.glPopMatrix();
			}
		}
	}
	
	private void drawModalRectWithCustomSizedTexture(int a, int b, int c, int d, int e, int f, int g, int h)
	{
		func_146110_a(a, b, c, d, e, f, g, h);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) 
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		
        mc.renderEngine.bindTexture(texture);
        
        int textureX = 512;
        int textureY = 256;
        
        // Render main screen
        if(customModeTransitionTimer <= 0.999f)
        {
            int xOrigin = ((width - xSize) / 2)  + GetMainPageX();
            int yOrigin = ((height - ySize) / 2) + GetMainPageY();
            
            // Gun render box
            drawModalRectWithCustomSizedTexture(xOrigin, yOrigin, 0, 0, xSize, 114, textureX, textureY);
            // Inventory box
            drawModalRectWithCustomSizedTexture(xOrigin, yOrigin + 122, 0, 114, xSize, 142, textureX, textureY);
            
            ItemStack gunStack = inventorySlots.getSlot(0).getStack();
            if(gunStack != null && gunStack.getItem() instanceof IPaintableItem)
            {
            	PaintableType gunType = ((IPaintableItem)gunStack.getItem()).GetPaintableType();
            	
            	int numPaintjobs = gunType.paintjobs.size();
            	int numRows = numPaintjobs / 9 + 1;
            	
                for(int y = 0; y < numRows; y++)
                {
                	for(int x = 0; x < 9; x++)
                	{
                		// Only render up to the number of paintjobs in the row
                		if(9 * y + x >= numPaintjobs)
                			continue;
                		
                		Paintjob paintjob = gunType.paintjobs.get(9 * y + x);
                		ItemStack stack = gunStack.copy();
                		stack.setItemDamage(paintjob.ID);
                		itemRender.renderItemIntoGUI(mc.fontRenderer, mc.getTextureManager(), stack, xOrigin + 8 + x * 18, yOrigin + 130 + y * 18);
                	}
                }
            }
            
            //Draw hover box for paintjob
            if(hoveringOver != null)
            {
            	int numDyes = hoveringOver.dyesNeeded.length;
            	//Only draw box if there are dyes needed
            	if(numDyes != 0 && !inventory.player.capabilities.isCreativeMode)
            	{
            		//Calculate which dyes we have in our inventory
    	        	boolean[] haveDyes = new boolean[numDyes];
    	        	for(int n = 0; n < numDyes; n++)
    	        	{
    	        		int amountNeeded = hoveringOver.dyesNeeded[n].stackSize;
    	        		for(int s = 0; s < inventory.getSizeInventory(); s++)
    	        		{
    	        			ItemStack stack = inventory.getStackInSlot(s);
    	        			if(stack != null && stack.getItem() == Items.dye && stack.getItemDamage() == hoveringOver.dyesNeeded[n].getItemDamage())
    	        			{
    	        				amountNeeded -= stack.stackSize;
    	        			}
    	        		}
    					if(amountNeeded <= 0)
    						haveDyes[n] = true;
    				}

    				GL11.glColor4f(1F, 1F, 1F, 1F);
    				GL11.glDisable(GL11.GL_LIGHTING);
    				mc.renderEngine.bindTexture(texture);

    				int originX = mouseX + 6;
    				int originY = mouseY - 20;
    	
    	        	//If we have only one, use the double ended slot 
    	        	if(numDyes == 1)
    	        	{
    	        		drawModalRectWithCustomSizedTexture(originX, originY, (haveDyes[0] ? 379 : 356), 0, 22, 22, textureX, textureY);
    	        	}
    	        	else
    	        	{
    	        		//First slot
    	        		drawModalRectWithCustomSizedTexture(originX, originY, 256, (haveDyes[0] ? 23 : 0), 20, 22, textureX, textureY);
    	        		//Middle slots
    	        		for(int s = 1; s < numDyes - 1; s++)
    	        		{
    	        			drawModalRectWithCustomSizedTexture(originX + 2 + 18 * s, originY, 277, (haveDyes[s] ? 23 : 0), 18, 22, textureX, textureY);
    	        		}
    	        		//Last slot
    	        		drawModalRectWithCustomSizedTexture(originX + 2 + 18 * (numDyes - 1), originY, 296, (haveDyes[numDyes - 1] ? 23 : 0), 20, 22, textureX, textureY);
    	        	}
    	        	
    	        	for(int s = 0; s < numDyes; s++)
    	        	{
    	        		itemRender.renderItemIntoGUI(mc.fontRenderer, mc.getTextureManager(), hoveringOver.dyesNeeded[s], originX + 3 + s * 18, originY + 3);
    	        		itemRender.renderItemOverlayIntoGUI(mc.fontRenderer, mc.getTextureManager(), hoveringOver.dyesNeeded[s], originX + 3 + s * 18, originY + 3, null);
    	        	}
            	}
            }
        	
        }
        
        
        
        // Render custom paintjob screen
        if(customModeTransitionTimer >= 0.001f)
        {
            mc.renderEngine.bindTexture(texture);
        	
            int xOrigin = ((width - xSize) / 2)  + GetCustomPageX() - 32;
            int yOrigin = ((height - ySize) / 2) + GetCustomPageY();
            
            // Palette
            drawModalRectWithCustomSizedTexture(xOrigin, yOrigin + 200, 224, 206, 288, 50, textureX, textureY);
            
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            
            for(int x = 0; x < paletteSizeX; x++)
            {
            	for(int y = 0; y < paletteSizeY; y++)
        		{ 
            		int colour = paletteColours[x][y];
            		float scale = 1.0f / 256.0f;
            		GL11.glColor3f(scale * ((colour >> 16) & 0xff), scale * ((colour >> 8) & 0xff), scale * ((colour >> 0) & 0xff));
            		
            		drawModalRectWithCustomSizedTexture(xOrigin + 8 + 9 * x, yOrigin + 200 + 8 + 9 * y, 0, 0, 7, 7, textureX, textureY);
        		}
            }
            
            float scale = 1.0f / 256.0f;
            float red = scale * ((currentColour >> 16) & 0xff);
            float green = scale * ((currentColour >> 8) & 0xff);
            float blue = scale * ((currentColour >> 0) & 0xff);
    		
    		GL11.glColor3f(red, green, blue);
            drawModalRectWithCustomSizedTexture(xOrigin + 172, yOrigin + 208, 0, 0, 34, 34, textureX, textureY);
          
            
            // Slider bars
            for(int n = 0; n < componentBarLength; n++)
            {
            	GL11.glColor3f((float)n / componentBarLength, green, blue);
                drawModalRectWithCustomSizedTexture(xOrigin + 212 + n, yOrigin + 208, 0, 0, 1, 10, textureX, textureY);
            }
            for(int n = 0; n < componentBarLength; n++)
            {
            	GL11.glColor3f(red, (float)n / componentBarLength, blue);
                drawModalRectWithCustomSizedTexture(xOrigin + 212 + n, yOrigin + 220, 0, 0, 1, 10, textureX, textureY);
            }
            for(int n = 0; n < componentBarLength; n++)
            {
            	GL11.glColor3f(red, green, (float)n / componentBarLength);
                drawModalRectWithCustomSizedTexture(xOrigin + 212 + n, yOrigin + 232, 0, 0, 1, 10, textureX, textureY);
            }
            
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
            // Sliders
            drawModalRectWithCustomSizedTexture(xOrigin + 212 + (int)(red * componentBarLength), yOrigin + 207, 317, 21, 3, 12, textureX, textureY);
            drawModalRectWithCustomSizedTexture(xOrigin + 212 + (int)(green * componentBarLength), yOrigin + 219, 317, 21, 3, 12, textureX, textureY);
            drawModalRectWithCustomSizedTexture(xOrigin + 212 + (int)(blue * componentBarLength), yOrigin + 231, 317, 21, 3, 12, textureX, textureY);
                       
        }
       
        GL11.glEnable(GL11.GL_DEPTH_TEST);
	}
	
	@Override
    public void handleMouseInput()
	{
		super.handleMouseInput();
		
		//if(Mouse.getEventButton() == 2 && Mouse.getEventButtonState())
		//{
		//	inCustomMode = !inCustomMode;
		//}
		
		mouseX = Mouse.getEventX() * this.width / this.mc.displayWidth;
		mouseY = this.height - Mouse.getEventY() * this.height / this.mc.displayHeight - 1;	

		int mouseXInGUI = mouseX - guiLeft;
		int mouseYInGUI = mouseY - guiTop;
		
		hoveringOver = null;
		
		if(inCustomMode)
		{
            int xOrigin = GetCustomPageX() - 32;
            int yOrigin = GetCustomPageY();
            
            for(int x = 0; x < paletteSizeX; x++)
            {
            	for(int y = 0; y < paletteSizeY; y++)
        		{             
            		if(mouseXInGUI >= xOrigin + 8 + 9 * x && mouseXInGUI < xOrigin + 15 + 9 * x && mouseYInGUI >= yOrigin + 208 + 9 * y && mouseYInGUI < yOrigin + 215 + 9 * y)
            		{
            			switch(Mouse.getEventButton())
            			{
	            			case 0: // Left click. Pick colour
	            			{
	            				currentColour = paletteColours[x][y];
	            				break;
	            			}
	            			case 1: // Right click. Set colour from custom
	            			{
	            				paletteColours[x][y] = currentColour;
	            				break;
	            			}
            			}
            		}
        		}
            }
            
            if(Mouse.getEventButton() == 0 && Mouse.getEventButtonState())
            {
	    		if(mouseXInGUI >= xOrigin + 212 && mouseXInGUI < xOrigin + 212 + componentBarLength && mouseYInGUI >= yOrigin + 208 && mouseYInGUI < yOrigin + 218)
	    		{
	    			int red = (int)(((mouseXInGUI - (xOrigin + 212)) * 0xff) / componentBarLength);
	    			currentColour &= 0x00ffff; // Clear red component
	    			currentColour |= (red << 16);
	    		}
	    		if(mouseXInGUI >= xOrigin + 212 && mouseXInGUI < xOrigin + 212 + componentBarLength && mouseYInGUI >= yOrigin + 220 && mouseYInGUI < yOrigin + 230)
	    		{
	    			int green = (int)(((mouseXInGUI - (xOrigin + 212)) * 0xff) / componentBarLength);
	    			currentColour &= 0xff00ff; // Clear green component
	    			currentColour |= (green << 8);
	    		}
	    		if(mouseXInGUI >= xOrigin + 212 && mouseXInGUI < xOrigin + 212 + componentBarLength && mouseYInGUI >= yOrigin + 232 && mouseYInGUI < yOrigin + 242)
	    		{
	    			int blue = (int)(((mouseXInGUI - (xOrigin + 212)) * 0xff) / componentBarLength);
	    			currentColour &= 0xffff00; // Clear blue component
	    			currentColour |= (blue << 0);
	    		}
            }
		}
		else
		{
			ItemStack gunStack = inventorySlots.getSlot(0).getStack();
	        if(gunStack != null && gunStack.getItem() instanceof IPaintableItem)
	        {
	        	PaintableType paintableType = ((IPaintableItem)gunStack.getItem()).GetPaintableType();
	        	int numPaintjobs = paintableType.paintjobs.size();
	        	int numRows = numPaintjobs / 9 + 1;
	        	
	            for(int j = 0; j < numRows; j++)
	            {
	            	for(int i = 0; i < 9; i++)
	            	{
	            		if(9 * j + i >= numPaintjobs)
	            			continue;
	            		
	            		Paintjob paintjob = paintableType.paintjobs.get(9 * j + i);
	            		ItemStack stack = gunStack.copy();
                        try {
	            		 stack.getTagCompound().setString("Paint", paintjob.iconName);
                        } catch (NullPointerException e) {
                            //
                        }
	            		int slotX = 7 + i * 18;
	            		int slotY = 129 + j * 18;
	            		if(mouseXInGUI >= slotX && mouseXInGUI < slotX + 18 && mouseYInGUI >= slotY && mouseYInGUI < slotY + 18)
	            			hoveringOver = paintjob;
	            	}
	            }
	        }
		}
	}
	
	@Override
    protected void mouseClicked(int x, int y, int button)
    {
		super.mouseClicked(x, y, button);
		if(button != 0)
			return;
		if(hoveringOver == null)
			return;
		
		FlansMod.getPacketHandler().sendToServer(new PacketGunPaint(hoveringOver.ID));
		((ContainerPaintjobTable)inventorySlots).clickPaintjob(hoveringOver.ID);
	}
}