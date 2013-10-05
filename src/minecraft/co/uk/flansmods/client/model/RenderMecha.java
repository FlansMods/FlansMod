package co.uk.flansmods.client.model;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import co.uk.flansmods.client.FlansModResourceHandler;
import co.uk.flansmods.client.model.titan.ModelProtoTitan;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.PilotGun;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import co.uk.flansmods.common.driveables.mechas.EnumMechaSlotType;
import co.uk.flansmods.common.driveables.mechas.ItemMechaTool;
import co.uk.flansmods.common.driveables.mechas.MechaToolType;
import co.uk.flansmods.common.driveables.mechas.MechaType;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

public class RenderMecha extends Render 
{
    private static final ResourceLocation RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    private static final ItemRenderer renderer = new ItemRenderer(Minecraft.getMinecraft());
    
	public RenderMecha()
	{
		shadowSize = 0.5F;
	}
	
    public void render(EntityMecha mecha, double d, double d1, double d2, float f, float f1)
    {
    	bindEntityTexture(mecha);
    	MechaType type = mecha.getMechaType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        float dYaw = (mecha.axes.getYaw() - mecha.prevRotationYaw);
        for(; dYaw > 180F; dYaw -= 360F) {}
        for(; dYaw <= -180F; dYaw += 360F) {}
        float dPitch = (mecha.axes.getPitch() - mecha.prevRotationPitch);
        for(; dPitch > 180F; dPitch -= 360F) {}
        for(; dPitch <= -180F; dPitch += 360F) {}
        float dRoll = (mecha.axes.getRoll() - mecha.prevRotationRoll);
        for(; dRoll > 180F; dRoll -= 360F) {}
        for(; dRoll <= -180F; dRoll += 360F) {}
        GL11.glRotatef(-mecha.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(mecha.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
		//GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
        ModelMecha model = (ModelMecha)type.model;
        //type.model = new ModelProtoTitan();
		if(model != null)
			model.render(mecha, f1);	
		
		//Left arm render
		{
			bindEntityTexture(mecha);
			GL11.glPushMatrix();
	
			//Get the arm pitch from the mecha entity
			float smoothedPitch = 0F;
	        if(mecha.seats[0] != null)
	        	smoothedPitch = mecha.seats[0].prevLooking.getPitch() + (mecha.seats[0].looking.getPitch() - mecha.seats[0].prevLooking.getPitch()) * f1;
			
	        //Translate to the arm origin, rotate and render
			GL11.glTranslatef(type.leftArmOrigin.x, mecha.getMechaType().leftArmOrigin.y, mecha.getMechaType().leftArmOrigin.z);
			GL11.glRotatef(90F - smoothedPitch, 0F, 0F, 1F);
			model.renderLeftArm(0.0625F, mecha, f1);
			
			//Move to the end of the arm and render the held item
			GL11.glTranslatef(0F, -type.armLength, 0F);
			ItemStack holdingStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.leftTool);
			if(holdingStack == null)
			{
				model.renderLeftHand(0.0625F, mecha, f1);
			}
			else
			{
				GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
				renderItem(mecha, holdingStack, 0, f1);
			}
			GL11.glPopMatrix();
		}
		
		//Right arm render
		{
			bindEntityTexture(mecha);
			GL11.glPushMatrix();
	
			//Get the arm pitch from the mecha entity
			float smoothedPitch = 0F;
	        if(mecha.seats[0] != null)
	        	smoothedPitch = mecha.seats[0].prevLooking.getPitch() + (mecha.seats[0].looking.getPitch() - mecha.seats[0].prevLooking.getPitch()) * f1;
			
	        //Translate to the arm origin, rotate and render
			GL11.glTranslatef(type.rightArmOrigin.x, mecha.getMechaType().rightArmOrigin.y, mecha.getMechaType().rightArmOrigin.z);
			GL11.glRotatef(90F - smoothedPitch, 0F, 0F, 1F);
			model.renderRightArm(0.0625F, mecha, f1);
			
			//Move to the end of the arm and render the held item
			GL11.glTranslatef(0F, -type.armLength, 0F);
			ItemStack holdingStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
			if(holdingStack == null)
			{
				model.renderRightHand(0.0625F, mecha, f1);
			}
			else
			{
				GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
				renderItem(mecha, holdingStack, 0, f1);
			}
			GL11.glPopMatrix();
		}
				
		//Debug rendering
		if(FlansMod.DEBUG)
		{
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glColor4f(1F, 0F, 0F, 0.3F);
			for(DriveablePart part : mecha.getDriveableData().parts.values())
			{
				if(part.box == null)
					continue;
				
				renderAABB(AxisAlignedBB.getBoundingBox(part.box.x / 16F, part.box.y / 16F, part.box.z / 16F, (part.box.x + part.box.w) / 16F, (part.box.y + part.box.h) / 16F, (part.box.z + part.box.d) / 16F));
			}
			GL11.glColor4f(0F, 0F, 1F, 0.3F);
			for(PilotGun gun : type.guns)
			{				
				renderAABB(AxisAlignedBB.getBoundingBox(gun.position.x - 0.25F, gun.position.y - 0.25F, gun.position.z - 0.25F, gun.position.x + 0.25F, gun.position.y + 0.25F, gun.position.z + 0.25F));
			}
			GL11.glColor4f(0F, 0F, 0F, 0.3F);	
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
		}
        GL11.glPopMatrix();
        
        //Leg render
        bindEntityTexture(mecha);
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d, (float)d1, (float)d2);
        dYaw = mecha.legAxes.getYaw() - mecha.prevLegsYaw;
        for(; dYaw > 180F; dYaw -= 360F) {}
        for(; dYaw <= -180F; dYaw += 360F) {}
		GL11.glRotatef(- dYaw * f1 - mecha.prevLegsYaw, 0F, 1F, 0F);
        GL11.glRotatef(mecha.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
		if(model != null)
			model.renderLegs(0.0625F, mecha, f1);		
		GL11.glPopMatrix();
    }
	
	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) 
	{
		render((EntityMecha)entity, d0, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityMecha)entity).getMechaType());
	}

	
    private void renderItem(EntityMecha mecha, ItemStack stack, int par3, float dT)
    {
        GL11.glPushMatrix();
        TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
		Item item = stack.getItem();
		
		//Render tools
		if(item instanceof ItemMechaTool)
		{

			GL11.glRotatef(-90F, 0F, 0F, 1F);
			GL11.glTranslatef(0F, 0F, 0F);
			ItemMechaTool toolItem = (ItemMechaTool)item;
			MechaToolType toolType = toolItem.type;
			bindTexture(FlansModResourceHandler.getTexture(toolType));
			if(toolType.model != null)
				toolType.model.render(mecha, true, dT);
		}
		else
		{
	        Icon icon = stack.getIconIndex();
	        if (icon == null)
	        {
	            GL11.glPopMatrix();
	            return;
	        }
	
	        texturemanager.bindTexture(texturemanager.getResourceLocation(stack.getItemSpriteNumber()));
	        Tessellator tessellator = Tessellator.instance;
	        float f = icon.getMinU();
	        float f1 = icon.getMaxU();
	        float f2 = icon.getMinV();
	        float f3 = icon.getMaxV();
	        float f4 = 0.0F;
	        float f5 = 0.3F;
	        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
	        GL11.glTranslatef(-f4, -f5, 0.0F);
	        float f6 = 1.5F;
	        GL11.glScalef(f6, f6, f6);
	        GL11.glTranslatef(0.2F, 0.7F, 0.0F);
	        GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(-133.0F, 0.0F, 0.0F, 1.0F);
	        
	        renderer.renderItemIn2D(tessellator, f1, f2, f, f3, icon.getIconWidth(), icon.getIconHeight(), 0.0625F);
	
	        if (stack.hasEffect(par3))
	        {
	            GL11.glDepthFunc(GL11.GL_EQUAL);
	            GL11.glDisable(GL11.GL_LIGHTING);
	            texturemanager.bindTexture(RES_ITEM_GLINT);
	            GL11.glEnable(GL11.GL_BLEND);
	            GL11.glBlendFunc(GL11.GL_SRC_COLOR, GL11.GL_ONE);
	            float f7 = 0.76F;
	            GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
	            GL11.glMatrixMode(GL11.GL_TEXTURE);
	            GL11.glPushMatrix();
	            float f8 = 0.125F;
	            GL11.glScalef(f8, f8, f8);
	            float f9 = (float)(Minecraft.getSystemTime() % 3000L) / 3000.0F * 8.0F;
	            GL11.glTranslatef(f9, 0.0F, 0.0F);
	            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
	            renderer.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
	            GL11.glPopMatrix();
	            GL11.glPushMatrix();
	            GL11.glScalef(f8, f8, f8);
	            f9 = (float)(Minecraft.getSystemTime() % 4873L) / 4873.0F * 8.0F;
	            GL11.glTranslatef(-f9, 0.0F, 0.0F);
	            GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
	            renderer.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
	            GL11.glPopMatrix();
	            GL11.glMatrixMode(GL11.GL_MODELVIEW);
	            GL11.glDisable(GL11.GL_BLEND);
	            GL11.glEnable(GL11.GL_LIGHTING);
	            GL11.glDepthFunc(GL11.GL_LEQUAL);
	        }
	
	        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		}
        GL11.glPopMatrix();
    }
}
