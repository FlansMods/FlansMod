package co.uk.flansmods.client;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.model.GunAnimations;
import co.uk.flansmods.client.model.ModelGun;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import co.uk.flansmods.common.guns.ContainerGunModTable;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.guns.ItemGun;
import co.uk.flansmods.common.network.PacketGunModButton;
import co.uk.flansmods.common.network.PacketVehicleGUI;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiGunModTable extends GuiContainer 
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/gunTable.png");
	private static final Random rand = new Random();
	private int secretColour = 0;
	
	public GuiGunModTable(InventoryPlayer inv, World w) 
	{
		super(new ContainerGunModTable(inv, w));
		ySize = 256;
		secretColour = rand.nextInt(11);
	}
	
    @Override
	protected void drawGuiContainerForegroundLayer(int x, int y)
    {
    	fontRenderer.drawString("Inventory", 8, (ySize - 94) + 2, 0x404040);
       	fontRenderer.drawString("Gun Modification Table", 8, 6, 0x404040);
       	
        ItemStack gunStack = inventorySlots.getSlot(0).getStack();
        if(gunStack != null && gunStack.getItem() instanceof ItemGun)
        {
        	GunType gunType = ((ItemGun)gunStack.getItem()).type;
        	if(gunType.model != null)
        	{
        		GL11.glPushMatrix();
        		GL11.glColor3f(1F, 1F, 1F);
        		GL11.glTranslatef(110, 54, 100);
        		
        		GL11.glRotatef(160, 1F, 0F, 0F);
        		GL11.glRotatef(20, 0F, 1F, 0F);
        		GL11.glScalef(-50F, 50F, 50F);
        		ClientProxy.gunRenderer.renderGun(gunStack, gunType, 1F / 16F, gunType.model, GunAnimations.defaults);
        		GL11.glPopMatrix();
        	}
        }
    }
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) 
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        mc.renderEngine.bindTexture(texture);
        
        int xOrigin = (width - xSize) / 2;
        int yOrigin = (height - ySize) / 2;
        drawTexturedModalRect(xOrigin, yOrigin, 0, 0, xSize, ySize);
        
        drawTexturedModalRect(xOrigin + 143, yOrigin + 135, 177 + 5 * secretColour, 29, 4, 16);
        
        for(int z = 1; z < 13; z++)
        	inventorySlots.getSlot(z).yDisplayPosition = -1000;
        
        ItemStack gunStack = inventorySlots.getSlot(0).getStack();
        if(gunStack != null && gunStack.getItem() instanceof ItemGun)
        {
        	GunType gunType = ((ItemGun)gunStack.getItem()).type;
        	if(gunType.allowBarrelAttachments)
        	{
        		drawTexturedModalRect(xOrigin + 51, yOrigin + 107, 176, 122, 22, 22);
        		inventorySlots.getSlot(1).yDisplayPosition = 110;
        	}
        	if(gunType.allowScopeAttachments)
        	{
        		drawTexturedModalRect(xOrigin + 77, yOrigin + 81, 202, 96, 22, 22);
        		inventorySlots.getSlot(2).yDisplayPosition = 84;
        	}
        	if(gunType.allowStockAttachments)
        	{
        		drawTexturedModalRect(xOrigin + 103, yOrigin + 107, 228, 122, 22, 22);
        		inventorySlots.getSlot(3).yDisplayPosition = 110;
        	}
        	if(gunType.allowGripAttachments)
        	{
        		drawTexturedModalRect(xOrigin + 77, yOrigin + 133, 202, 148, 22, 22);
        		inventorySlots.getSlot(4).yDisplayPosition = 136;
        	}
        	
        	for(int x = 0; x < 2; x++)
        	{
        		for(int y = 0; y < 4; y++)
        		{
        			if(x + y * 2 < gunType.numGenericAttachmentSlots)
        				inventorySlots.getSlot(5 + x + y * 2).yDisplayPosition = 83 + 18 * y;
        		}
        	}
        }
	}
}
