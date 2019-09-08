package com.flansmod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.common.guns.EntityBullet;

public class RenderBullet extends Render<EntityBullet>
{
	public RenderBullet(RenderManager renderManager)
	{
		super(renderManager);
		shadowSize = 0.5F;
	}
	
	public void render(EntityBullet bullet, double d, double d1, double d2, float f, float f1)
	{
		//TODO may fix this again
		//if(bullet.owner == Minecraft.getMinecraft().player && bullet.ticksExisted < 1)
		//	return;
		bindEntityTexture(bullet);
		GlStateManager.pushMatrix();
		GlStateManager.translate((float)d, (float)d1, (float)d2);
		GlStateManager.rotate(f, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(90F - bullet.prevRotationPitch - (bullet.rotationPitch - bullet.prevRotationPitch) * f1, 1.0F, 0.0F, 0.0F);
		ModelBase model = bullet.getFiredShot().getBulletType().model;
		if(model != null)
			model.render(bullet, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GlStateManager.popMatrix();
	}
	
	@Override
	public void doRender(EntityBullet entity, double d, double d1, double d2, float f, float f1)
	{
		render(entity, d, d1, d2, f, f1);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBullet entity)
	{
		return FlansModResourceHandler.getTexture(entity.getFiredShot().getBulletType());
	}
	
	public static class Factory implements IRenderFactory<EntityBullet>
	{
		@Override
		public Render<EntityBullet> createRenderFor(RenderManager manager)
		{
			return new RenderBullet(manager);
		}
	}
}

