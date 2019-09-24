package com.flansmod.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.ItemGrenade;

public class RenderGrenade extends Render<EntityGrenade> implements CustomItemRenderer
{
	public RenderGrenade(RenderManager renderManager)
	{
		super(renderManager);
		shadowSize = 0.5F;
	}
	
	@Override
	public void doRender(EntityGrenade grenade, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(grenade);
		GlStateManager.pushMatrix();
		GlStateManager.translate((float)d, (float)d1, (float)d2);
		if(grenade.stuck)
		{
			GlStateManager.rotate(180F - grenade.axes.getYaw(), 0.0F, 1.0F, 0.0F);
			GlStateManager.rotate(grenade.axes.getPitch(), 0.0F, 0.0F, 1.0F);
			GlStateManager.rotate(grenade.axes.getRoll(), 1.0F, 0.0F, 0.0F);
		}
		else
		{
			float dYaw = (grenade.axes.getYaw() - grenade.prevRotationYaw);
			for(; dYaw > 180F; dYaw -= 360F)
			{
			}
			for(; dYaw <= -180F; dYaw += 360F)
			{
			}
			float dPitch = (grenade.axes.getPitch() - grenade.prevRotationPitch);
			for(; dPitch > 180F; dPitch -= 360F)
			{
			}
			for(; dPitch <= -180F; dPitch += 360F)
			{
			}
			float dRoll = (grenade.axes.getRoll() - grenade.prevRotationRoll);
			for(; dRoll > 180F; dRoll -= 360F)
			{
			}
			for(; dRoll <= -180F; dRoll += 360F)
			{
			}
			GlStateManager.rotate(180F - grenade.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
			GlStateManager.rotate(grenade.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
			GlStateManager.rotate(grenade.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
		}
		ModelBase model = grenade.type.model;
		if(model != null)
			model.render(grenade, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GlStateManager.popMatrix();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityGrenade entity)
	{
		ResourceLocation texture = FlansModResourceHandler.getTexture(entity.type);
		if(texture == null)
			return FlansModResourceHandler.getIcon(entity.type);
		return texture;
	}
	
	public boolean handleRenderType(ItemStack item, CustomItemRenderType type)
	{
		switch(type)
		{
			case EQUIPPED:
			case EQUIPPED_FIRST_PERSON: return item != null && item.getItem() instanceof ItemGrenade && ((ItemGrenade)item.getItem()).type.model != null;
			default: break;
		}
		return false;
	}
	
	@Override
	public void renderItem(CustomItemRenderType type, EnumHand hand, ItemStack item, Object... data)
	{
		GlStateManager.pushMatrix();
		if(item != null && item.getItem() instanceof ItemGrenade)
		{
			GrenadeType grenadeType = ((ItemGrenade)item.getItem()).type;
			if(grenadeType.model != null)
			{
				switch(type)
				{
					case EQUIPPED:
					{
						//GlStateManager.rotate(35F, 0F, 0F, 1F);
						//GlStateManager.rotate(-5F, 0F, 1F, 0F);
						//GlStateManager.translate(0.75F, -0.22F, -0.08F);
						//GlStateManager.translate(0F, 0.25F, 0F);
						break;
					}
					case EQUIPPED_FIRST_PERSON:
					{
						if(hand == EnumHand.MAIN_HAND)
						{
							GlStateManager.translate(-1.25F, 0.8F, 0.1F);
						}
						else
						{
							GlStateManager.rotate(45F, 0F, 1F, 0F);
							GlStateManager.translate(-1F, 0.8F, -2F);
							GlStateManager.rotate(-135F, 0F, 1F, 0F);
						}
						break;
					}
					default: break;
				}
				
				Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(grenadeType));
				ModelBase model = grenadeType.model;
				model.render(null, 0F, 0F, 0F, 0F, 0F, 1F / 16F);
			}
		}
		GlStateManager.popMatrix();
	}
	
	public static class Factory implements IRenderFactory<EntityGrenade>
	{
		@Override
		public Render<EntityGrenade> createRenderFor(RenderManager manager)
		{
			return new RenderGrenade(manager);
		}
	}
	
}
