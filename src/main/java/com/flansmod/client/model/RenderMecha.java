package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.EnumMechaSlotType;
import com.flansmod.common.driveables.mechas.ItemMecha;
import com.flansmod.common.driveables.mechas.ItemMechaAddon;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.Paintjob;

public class RenderMecha extends Render<EntityMecha> implements CustomItemRenderer
{
	private static final ResourceLocation RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
	private static final ItemRenderer renderer = new ItemRenderer(Minecraft.getMinecraft());
	private static RenderItem renderItem;
	
	public RenderMecha(RenderManager manager)
	{
		super(manager);
		renderItem = Minecraft.getMinecraft().getRenderItem();
		shadowSize = 0.5F;
	}
	
	public void doRender(EntityMecha mecha, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(mecha);
		float scale = 1F / 16F;
		MechaType type = mecha.getMechaType();
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d, (float)d1, (float)d2);
		float dYaw = (mecha.axes.getYaw() - mecha.prevRotationYaw);
		for(; dYaw > 180F; dYaw -= 360F)
		{
		}
		for(; dYaw <= -180F; dYaw += 360F)
		{
		}
		float dPitch = (mecha.axes.getPitch() - mecha.prevRotationPitch);
		for(; dPitch > 180F; dPitch -= 360F)
		{
		}
		for(; dPitch <= -180F; dPitch += 360F)
		{
		}
		float dRoll = (mecha.axes.getRoll() - mecha.prevRotationRoll);
		for(; dRoll > 180F; dRoll -= 360F)
		{
		}
		for(; dRoll <= -180F; dRoll += 360F)
		{
		}
		GL11.glRotatef(-mecha.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(mecha.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
		float modelScale = mecha.getMechaType().modelScale;
		ModelMecha model = (ModelMecha)type.model;
		
		//Body Render
		{
			GL11.glPushMatrix();
			GL11.glScalef(modelScale, modelScale, modelScale);
			if(model != null)
				model.render(mecha, f1);
			
			//Render hips slot : jetpack item
			ItemStack hipsSlot = mecha.inventory.getStackInSlot(EnumMechaSlotType.hips);
			if(hipsSlot != null && hipsSlot.getItem() instanceof ItemMechaAddon)
			{
				MechaItemType hipsAddon = ((ItemMechaAddon)hipsSlot.getItem()).type;
				if(hipsAddon.model != null)
				{
					GL11.glTranslatef(model.hipsAttachmentPoint.x, model.hipsAttachmentPoint.y, model.hipsAttachmentPoint.z);
					GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
					if(hipsAddon.texture != null)
						bindTexture(FlansModResourceHandler.getTexture(hipsAddon));
					hipsAddon.model.render(mecha, f1);
				}
			}
			
			GL11.glPopMatrix();
		}
		
		//Left arm render
		if(mecha.isPartIntact(EnumDriveablePart.leftArm))
		{
			bindEntityTexture(mecha);
			GL11.glPushMatrix();
			
			//Get the arm pitch from the mecha entity
			float smoothedPitch = 0F;
			if(mecha.getSeat(0) != null)
				smoothedPitch = mecha.getSeat(0).prevLooking.getPitch() + (mecha.getSeat(0).looking.getPitch() - mecha.getSeat(0).prevLooking.getPitch()) * f1;
			
			//Lower Limit
			if(smoothedPitch > type.lowerArmLimit)
				smoothedPitch = type.lowerArmLimit;
			//Upper Limit
			if(smoothedPitch < -type.upperArmLimit)
				smoothedPitch = -type.upperArmLimit;
			
			//Translate to the arm origin, rotate and render
			GL11.glTranslatef(type.leftArmOrigin.x, mecha.getMechaType().leftArmOrigin.y, mecha.getMechaType().leftArmOrigin.z);
			GL11.glRotatef(90F - smoothedPitch, 0F, 0F, 1F);
			GL11.glPushMatrix();
			GL11.glScalef(modelScale, modelScale, modelScale);
			model.renderLeftArm(scale, mecha, f1);
			GL11.glPopMatrix();
			
			//Move to the end of the arm and render the held item
			GL11.glTranslatef(0F + type.leftHandModifierY, -type.armLength - type.leftHandModifierX, 0F + type.leftHandModifierZ);
			ItemStack holdingStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.leftTool);
			GL11.glScalef(modelScale, modelScale, modelScale);
			if(holdingStack == null || holdingStack.isEmpty())
			{
				model.renderLeftHand(scale, mecha, f1);
			}
			else
			{
				GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
				renderItem(mecha, holdingStack, 0, true, f1);
			}
			GL11.glPopMatrix();
		}
		
		//Right arm render
		if(mecha.isPartIntact(EnumDriveablePart.rightArm))
		{
			bindEntityTexture(mecha);
			GL11.glPushMatrix();
			
			//Get the arm pitch from the mecha entity
			float smoothedPitch = 0F;
			if(mecha.getSeat(0) != null)
				smoothedPitch = mecha.getSeat(0).prevLooking.getPitch() + (mecha.getSeat(0).looking.getPitch() - mecha.getSeat(0).prevLooking.getPitch()) * f1;
			
			//Lower Limit
			if(smoothedPitch > type.lowerArmLimit)
				smoothedPitch = type.lowerArmLimit;
			//Upper Limit
			if(smoothedPitch < -type.upperArmLimit)
				smoothedPitch = -type.upperArmLimit;
			
			//Translate to the arm origin, rotate and render
			GL11.glTranslatef(type.rightArmOrigin.x, mecha.getMechaType().rightArmOrigin.y, mecha.getMechaType().rightArmOrigin.z);
			GL11.glRotatef(90F - smoothedPitch, 0F, 0F, 1F);
			GL11.glPushMatrix();
			GL11.glScalef(modelScale, modelScale, modelScale);
			model.renderRightArm(scale, mecha, f1);
			GL11.glPopMatrix();
			
			//Move to the end of the arm and render the held item
			GL11.glTranslatef(0F + type.rightHandModifierY, -type.armLength - type.rightHandModifierX, 0F + type.rightHandModifierZ);
			GL11.glScalef(modelScale, modelScale, modelScale);
			ItemStack holdingStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
			if(holdingStack == null || holdingStack.isEmpty())
			{
				model.renderRightHand(scale, mecha, f1);
			}
			else
			{
				GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
				renderItem(mecha, holdingStack, 0, false, f1);
			}
			GL11.glPopMatrix();
		}
		
		//Debug rendering
		if(FlansMod.DEBUG)
		{
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			
			//Render boxes
			GL11.glColor4f(1F, 0F, 0F, 0.3F);
			for(DriveablePart part : mecha.getDriveableData().parts.values())
			{
				if(part.box == null)
					continue;
				
				renderOffsetAABB(new AxisAlignedBB(part.box.x / 16F, part.box.y / 16F, part.box.z / 16F, (part.box.x + part.box.w) / 16F, (part.box.y + part.box.h) / 16F, (part.box.z + part.box.d) / 16F), 0, 0, 0);
			}
			
			//Render shoot points
			GL11.glColor4f(0F, 0F, 1F, 0.3F);
			for(DriveablePosition point : type.shootPointsPrimary)
				renderOffsetAABB(new AxisAlignedBB(point.position.x - 0.25F, point.position.y - 0.25F, point.position.z - 0.25F, point.position.x + 0.25F, point.position.y + 0.25F, point.position.z + 0.25F), 0, 0, 0);
			
			GL11.glColor4f(0F, 1F, 0F, 0.3F);
			for(DriveablePosition point : type.shootPointsSecondary)
				renderOffsetAABB(new AxisAlignedBB(point.position.x - 0.25F, point.position.y - 0.25F, point.position.z - 0.25F, point.position.x + 0.25F, point.position.y + 0.25F, point.position.z + 0.25F), 0, 0, 0);
			
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
		}
		GL11.glPopMatrix();
		
		//Leg render
		if(mecha.isPartIntact(EnumDriveablePart.hips))
		{
			bindEntityTexture(mecha);
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d, (float)d1, (float)d2);
			dYaw = mecha.legAxes.getYaw() - mecha.prevLegsYaw;
			for(; dYaw > 180F; dYaw -= 360F)
			{
			}
			for(; dYaw <= -180F; dYaw += 360F)
			{
			}
			GL11.glRotatef(-dYaw * f1 - mecha.prevLegsYaw, 0F, 1F, 0F);
			GL11.glRotatef(mecha.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
			GL11.glScalef(modelScale, modelScale, modelScale);
			if(model != null)
			{
				float legLength = type.legLength;
				float rearlegLength = type.RearlegLength;
				float frontlegLength = type.FrontlegLength;
				float legTrans = type.LegTrans;
				float rearlegTrans = type.RearLegTrans;
				float frontlegTrans = type.FrontLegTrans;
				
				float legsYaw = (float)Math.sin(((mecha.ticksExisted) + f1) / type.legSwingTime) * mecha.legSwing;
				float footH = (float)Math.sin(legsYaw) * legLength;
				float footV = (float)Math.cos(legsYaw) * legLength;
				float footRH = (float)Math.sin(legsYaw) * rearlegLength;
				float footRV = (float)Math.cos(legsYaw) * rearlegLength;
				float footFH = (float)Math.sin(legsYaw) * frontlegLength;
				float footFV = (float)Math.cos(legsYaw) * frontlegLength;
				
				//Hips
				model.renderHips(scale, mecha, f1);
				
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(legTrans, legLength, 0F);
					
					//Left Foot
					GL11.glPushMatrix();
					GL11.glTranslatef(footH, -footV, 0F);
					model.renderLeftFoot(scale, mecha, f1);
					GL11.glPopMatrix();
					
					//Right Foot
					GL11.glPushMatrix();
					GL11.glTranslatef(-footH, -footV, 0F);
					model.renderRightFoot(scale, mecha, f1);
					GL11.glPopMatrix();
					
					//Left Leg
					GL11.glPushMatrix();
					GL11.glRotatef(legsYaw * 180F / 3.14159265F, 0F, 0F, 1F);
					GL11.glTranslatef(0F, -legLength, 0F);
					model.renderLeftLeg(scale, mecha, f1);
					GL11.glPopMatrix();
					
					//Right Leg
					GL11.glPushMatrix();
					GL11.glRotatef(-legsYaw * 180F / 3.14159265F, 0F, 0F, 1F);
					GL11.glTranslatef(0F, -legLength, 0F);
					model.renderRightLeg(scale, mecha, f1);
					GL11.glPopMatrix();
				}
				GL11.glPopMatrix();
				
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(rearlegTrans, rearlegLength, 0F);
					
					//Left Rear Foot
					GL11.glPushMatrix();
					GL11.glTranslatef(-footRH, -footRV, 0F);
					model.renderLeftRearFoot(scale, mecha, f1);
					GL11.glPopMatrix();
					
					//Right Rear Foot
					GL11.glPushMatrix();
					GL11.glTranslatef(footRH, -footRV, 0F);
					model.renderRightRearFoot(scale, mecha, f1);
					GL11.glPopMatrix();
					
					//Left Rear Leg
					GL11.glPushMatrix();
					GL11.glRotatef(-legsYaw * 180F / 3.14159265F, 0F, 0F, 1F);
					GL11.glTranslatef(0F, -rearlegLength, 0F);
					model.renderLeftRearLeg(scale, mecha, f1);
					GL11.glPopMatrix();
					
					//Right Leg
					GL11.glPushMatrix();
					GL11.glRotatef(legsYaw * 180F / 3.14159265F, 0F, 0F, 1F);
					GL11.glTranslatef(0F, -rearlegLength, 0F);
					model.renderRightRearLeg(scale, mecha, f1);
					GL11.glPopMatrix();
				}
				GL11.glPopMatrix();
				
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(frontlegTrans, frontlegLength, 0F);
					
					//Left Front Foot
					GL11.glPushMatrix();
					GL11.glTranslatef(-footFH, -footFV, 0F);
					model.renderLeftFrontFoot(scale, mecha, f1);
					GL11.glPopMatrix();
					
					//Right Front Foot
					GL11.glPushMatrix();
					GL11.glTranslatef(footFH, -footFV, 0F);
					model.renderRightFrontFoot(scale, mecha, f1);
					GL11.glPopMatrix();
					
					//Left Front Leg
					GL11.glPushMatrix();
					GL11.glRotatef(-legsYaw * 180F / 3.14159265F, 0F, 0F, 1F);
					GL11.glTranslatef(0F, -frontlegLength, 0F);
					model.renderLeftFrontLeg(scale, mecha, f1);
					GL11.glPopMatrix();
					
					//Right Front Leg
					GL11.glPushMatrix();
					GL11.glRotatef(legsYaw * 180F / 3.14159265F, 0F, 0F, 1F);
					GL11.glTranslatef(0F, -frontlegLength, 0F);
					model.renderRightFrontLeg(scale, mecha, f1);
					GL11.glPopMatrix();
				}
				GL11.glPopMatrix();
				
			}
			GL11.glPopMatrix();
		}
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityMecha entity)
	{
		DriveableType type = ((EntityDriveable)entity).getDriveableType();
		Paintjob paintjob = type.getPaintjob(((EntityDriveable)entity).getDriveableData().paintjobID);
		return FlansModResourceHandler.getPaintjobTexture(paintjob);
	}
	
	private void renderItem(EntityMecha mecha, ItemStack stack, int par3, boolean leftHand, float dT)
	{
		GL11.glPushMatrix();
		TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
		Item item = stack.getItem();
		
		//Render tools
		if(item instanceof ItemMechaAddon)
		{
			
			GL11.glRotatef(-90F, 0F, 0F, 1F);
			GL11.glTranslatef(0F, 0F, 0F);
			ItemMechaAddon toolItem = (ItemMechaAddon)item;
			MechaItemType toolType = toolItem.type;
			bindTexture(FlansModResourceHandler.getTexture(toolType));
			if(toolType.model != null)
			{
				toolType.model.render(mecha, dT);
				GL11.glPushMatrix();
				if((leftHand && mecha.leftMouseHeld) || (!leftHand && mecha.rightMouseHeld))
				{
					GL11.glRotatef(25F * (float)mecha.ticksExisted, 1F, 0F, 0F);
				}
				toolType.model.renderDrill(mecha, dT);
				GL11.glPopMatrix();
				toolType.model.renderSaw(mecha, dT, (leftHand && mecha.leftMouseHeld) || (!leftHand && mecha.rightMouseHeld));
			}
		}
		else if(item instanceof ItemGun && ((ItemGun)item).GetType().model != null)
		{
			GunType gunType = ((ItemGun)item).GetType();
			ModelGun model = gunType.model;
			
			GL11.glRotatef(-90F, 0F, 0F, 1F);
			texturemanager.bindTexture(FlansModResourceHandler.getTexture(gunType));
			ClientProxy.gunRenderer.renderGun(stack, gunType, 1F / 16F, model, leftHand ? mecha.leftAnimations : mecha.rightAnimations, 0F);
		}
		else
		{
			GL11.glRotatef(-135F, 0F, 0F, 1F);
			GL11.glTranslatef(0F, -0.4F, 0F);
			
			IBakedModel ibakedmodel = renderItem.getItemModelMesher().getItemModel(stack);
			renderItem.renderItem(stack, ibakedmodel);
			
			GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		}
		GL11.glPopMatrix();
	}
	
	@Override
	public void renderItem(CustomItemRenderType type, EnumHand hand, ItemStack item, Object... data)
	{
		GL11.glPushMatrix();
		if(item != null && item.getItem() instanceof ItemMecha)
		{
			MechaType mechaType = ((ItemMecha)item.getItem()).type;
			if(mechaType.model != null)
			{
				float scale = 2F;
				switch(type)
				{
					case INVENTORY:
					{
						scale = 1.0F;
						GL11.glTranslatef(0F, -0.35F, 0F);
						break;
					}
					case ENTITY:
					{
						scale = 1.5F;
						//GL11.glRotatef(((EntityItem)data[1]).ticksExisted, 0F, 1F, 0F);
						break;
					}
					case EQUIPPED:
					{
						GL11.glRotatef(0F, 0F, 0F, 1F);
						GL11.glRotatef(270F, 1F, 0F, 0F);
						GL11.glRotatef(270F, 0F, 1F, 0F);
						GL11.glTranslatef(0F, 0.25F, 0F);
						scale = 0.5F;
						break;
					}
					case EQUIPPED_FIRST_PERSON:
					{
						//GL11.glRotatef(25F, 0F, 0F, 1F);
						GL11.glRotatef(45F, 0F, 1F, 0F);
						GL11.glTranslatef(-0.5F, 0.5F, -0.5F);
						scale = 1F;
						break;
					}
					default: break;
				}
				
				GL11.glScalef(scale / mechaType.cameraDistance, scale / mechaType.cameraDistance, scale / mechaType.cameraDistance);
				Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(mechaType));
				ModelDriveable model = mechaType.model;
				model.render(mechaType);
			}
		}
		GL11.glPopMatrix();
	}
	
	public static class Factory implements IRenderFactory
	{
		@Override
		public Render createRenderFor(RenderManager manager)
		{
			return new RenderMecha(manager);
		}
	}
}
