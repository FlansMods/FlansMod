package co.uk.flansmods.client.model;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.FlansModClient;
import co.uk.flansmods.client.FlansModResourceHandler;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.guns.AttachmentType;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.guns.ItemGun;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class RenderGun implements IItemRenderer
{
	private static TextureManager renderEngine = Minecraft.getMinecraft().renderEngine;
	
	public static float smoothing;
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type)
		{
		case EQUIPPED : case EQUIPPED_FIRST_PERSON :  /*case INVENTORY : case ENTITY :*/ return item != null && item.getItem() instanceof ItemGun && ((ItemGun)item.getItem()).type.model != null;
		}
		return false;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		//Avoid any broken cases by returning
		if(!(item.getItem() instanceof ItemGun))
			return;
		
		GunType gunType = ((ItemGun)item.getItem()).type;
		if(gunType == null)
			return;
		
		ModelGun model = gunType.model;
		if(model == null)
			return;
		
		//The model scale
		float f = 1F / 16F;
		
		GunAnimations animations = FlansModClient.gunAnimations.get(data[1]);
		if(animations == null)
		{
			animations = new GunAnimations();
			FlansModClient.gunAnimations.put((EntityLivingBase)data[1], animations);
		}
		
		GL11.glPushMatrix();
		{
			//Setup transforms based on gun position
			switch(type)
			{
				case EQUIPPED:
				{
					GL11.glRotatef(35F, 0F, 0F, 1F);
					GL11.glRotatef(-5F, 0F, 1F, 0F);
					GL11.glTranslatef(0.75F, -0.22F, -0.08F);
					break;
				}
				case EQUIPPED_FIRST_PERSON:
				{
					float adsSwitch = FlansModClient.lastZoomProgress + (FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) * smoothing;//0F;//((float)Math.sin((FlansMod.ticker) / 10F) + 1F) / 2F;
					GL11.glRotatef(25F - 5F * adsSwitch, 0F, 0F, 1F); 
					GL11.glRotatef(-5F + 0F * adsSwitch, 0F, 1F, 0F);
					GL11.glTranslatef(0.15F, 0.2F + 0.175F * adsSwitch, -0.6F - 0.405F * adsSwitch);
					
					if(animations.reloading)
					{
						//Calculate the amount of tilt required for the reloading animation
						float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;
						float reloadRotate = 1F;
						if(effectiveReloadAnimationProgress < model.tiltGunTime)
							reloadRotate = effectiveReloadAnimationProgress / model.tiltGunTime;
						if(effectiveReloadAnimationProgress > model.tiltGunTime + model.unloadClipTime + model.loadClipTime)
							reloadRotate = 1F - (effectiveReloadAnimationProgress - (model.tiltGunTime + model.unloadClipTime + model.loadClipTime)) / model.untiltGunTime;
						
						//Rotate the gun dependent on the animation type
						switch(model.animationType)
						{
							case BOTTOM_CLIP : case PISTOL_CLIP :
							{
								GL11.glRotatef(60F * reloadRotate, 0F, 0F, 1F);
								GL11.glRotatef(30F * reloadRotate, 1F, 0F, 0F);
								GL11.glTranslatef(0.25F * reloadRotate, 0F, 0F);
								break;
							}
						}
					}
					break;
				}
			}
			
			renderGun(item, gunType, f, model, animations);
		}
		GL11.glPopMatrix();
	}
	
	/** Gun render method, seperated from transforms so that mecha renderer may also call this */
	public void renderGun(ItemStack item, GunType type, float f, ModelGun model, GunAnimations animations)
	{
		//If we have no animation variables, use defaults
		if(animations == null)
			animations = GunAnimations.defaults;
		
		//Get all the attachments that we may need to render
		AttachmentType scopeAttachment = type.getScope(item);
		AttachmentType barrelAttachment = type.getBarrel(item);
		AttachmentType stockAttachment = type.getStock(item);
		AttachmentType gripAttachment = type.getGrip(item);
		
		//Load texture
		renderEngine.bindTexture(FlansModResourceHandler.getTexture(type));
		
		//Render the gun and default attachment models
		GL11.glPushMatrix();
		{
			GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
			model.renderGun(f);
			if(scopeAttachment == null && !model.scopeIsOnSlide)
				model.renderDefaultScope(f);
			if(barrelAttachment == null)
				model.renderDefaultBarrel(f);
			if(stockAttachment == null)
				model.renderDefaultStock(f);
			if(gripAttachment == null)
				model.renderDefaultGrip(f);
			
			//Render various shoot / reload animated parts
			//Render the slide
			GL11.glPushMatrix();
			{
				GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
				model.renderSlide(f);
				if(scopeAttachment == null && model.scopeIsOnSlide)
					model.renderDefaultScope(f);
			}
			GL11.glPopMatrix();
			
			//Render the pump-action handle
			
			//Render the cocking handle
			
			//Render the clip
			GL11.glPushMatrix();
			{
				if(animations.reloading && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0)
				{
					//Calculate the amount of tilt required for the reloading animation
					float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;
					float clipPosition = 0F;
					if(effectiveReloadAnimationProgress > model.tiltGunTime && effectiveReloadAnimationProgress < model.tiltGunTime + model.unloadClipTime)
						clipPosition = (effectiveReloadAnimationProgress - model.tiltGunTime) / model.unloadClipTime;
					if(effectiveReloadAnimationProgress >= model.tiltGunTime + model.unloadClipTime && effectiveReloadAnimationProgress < model.tiltGunTime + model.unloadClipTime + model.loadClipTime)
						clipPosition = 1F - (effectiveReloadAnimationProgress - (model.tiltGunTime + model.unloadClipTime)) / model.loadClipTime;
					
					//Rotate the gun dependent on the animation type
					switch(model.animationType)
					{
						case BOTTOM_CLIP : 
						{
							GL11.glRotatef(-180F * clipPosition, 0F, 0F, 1F);
							GL11.glRotatef(60F * clipPosition, 1F, 0F, 0F);
							GL11.glTranslatef(0.5F * clipPosition, 0F, 0F);
							break;
						}
						case PISTOL_CLIP :
						{
							GL11.glRotatef(-90F * clipPosition * clipPosition, 0F, 0F, 1F);
							GL11.glTranslatef(0F, -1F * clipPosition, 0F);
							break;
						}
					}
				}
				model.renderAmmo(f);
			}
			GL11.glPopMatrix();
		}
		GL11.glPopMatrix();
		
		//Render static attachments
		//Scope
		if(scopeAttachment != null)
		{
			GL11.glPushMatrix();
			{
				renderEngine.bindTexture(FlansModResourceHandler.getTexture(scopeAttachment));
				GL11.glTranslatef(model.scopeAttachPoint.x * type.modelScale, model.scopeAttachPoint.y * type.modelScale, model.scopeAttachPoint.z * type.modelScale);
				if(model.scopeIsOnSlide)
					GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
				GL11.glScalef(scopeAttachment.modelScale, scopeAttachment.modelScale, scopeAttachment.modelScale);
				ModelAttachment scopeModel = scopeAttachment.model;
				if(scopeModel != null)
					scopeModel.renderAttachment(f);
				renderEngine.bindTexture(FlansModResourceHandler.getTexture(type));
			}
			GL11.glPopMatrix();
		}
		
		//Barrel
		if(barrelAttachment != null)
		{
			GL11.glPushMatrix();
			{
				renderEngine.bindTexture(FlansModResourceHandler.getTexture(barrelAttachment));
				GL11.glTranslatef(model.barrelAttachPoint.x * type.modelScale, model.barrelAttachPoint.y * type.modelScale, model.barrelAttachPoint.z * type.modelScale);
				GL11.glScalef(barrelAttachment.modelScale, barrelAttachment.modelScale, barrelAttachment.modelScale);
				ModelAttachment barrelModel = barrelAttachment.model;
				if(barrelModel != null)
					barrelModel.renderAttachment(f);
				renderEngine.bindTexture(FlansModResourceHandler.getTexture(type));
			}
			GL11.glPopMatrix();
		}
		
		//Scope
		if(stockAttachment != null)
		{
			GL11.glPushMatrix();
			{
				renderEngine.bindTexture(FlansModResourceHandler.getTexture(stockAttachment));
				GL11.glTranslatef(model.stockAttachPoint.x * type.modelScale, model.stockAttachPoint.y * type.modelScale, model.stockAttachPoint.z * type.modelScale);
				GL11.glScalef(stockAttachment.modelScale, stockAttachment.modelScale, stockAttachment.modelScale);
				ModelAttachment stockModel = stockAttachment.model;
				if(stockModel != null)
					stockModel.renderAttachment(f);
				renderEngine.bindTexture(FlansModResourceHandler.getTexture(type));
			}
			GL11.glPopMatrix();
		}
		
		//Grip
		if(gripAttachment != null)
		{
			GL11.glPushMatrix();
			{
				renderEngine.bindTexture(FlansModResourceHandler.getTexture(gripAttachment));
				GL11.glTranslatef(model.gripAttachPoint.x * type.modelScale, model.gripAttachPoint.y * type.modelScale, model.gripAttachPoint.z * type.modelScale);
				GL11.glScalef(gripAttachment.modelScale, gripAttachment.modelScale, gripAttachment.modelScale);
				ModelAttachment gripModel = gripAttachment.model;
				if(gripModel != null)
					gripModel.renderAttachment(f);
				renderEngine.bindTexture(FlansModResourceHandler.getTexture(type));
			}
			GL11.glPopMatrix();
		}
	}
}
