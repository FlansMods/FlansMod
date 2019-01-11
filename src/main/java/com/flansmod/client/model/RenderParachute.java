package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.tools.EntityParachute;

public class RenderParachute extends Render<EntityParachute>
{
	public RenderParachute(RenderManager renderManager)
	{
		super(renderManager);
		shadowSize = 0.5F;
	}
	
	@Override
	public void doRender(EntityParachute entity, double d0, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(entity);
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d0, (float)d1, (float)d2);
		GL11.glRotatef(-f, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(-entity.prevRotationPitch - (entity.rotationPitch - entity.prevRotationPitch) * f1, 1.0F, 0.0F, 0.0F);
		ModelBase model = entity.type.model;
		model.render(entity, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityParachute entity)
	{
		return FlansModResourceHandler.getTexture(entity.type);
	}
	
	public static class Factory implements IRenderFactory<EntityParachute>
	{
		@Override
		public Render<EntityParachute> createRenderFor(RenderManager manager)
		{
			return new RenderParachute(manager);
		}
	}
}
