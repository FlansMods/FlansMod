package com.flansmod.client.debug;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.common.FlansMod;

public class RenderDebugDot extends Render<EntityDebugDot>
{
	
	public RenderDebugDot(RenderManager renderManager)
	{
		super(renderManager);
	}
	
	@Override
	public void doRender(EntityDebugDot entity, double d0, double d1, double d2, float f, float f1)
	{
		if(!FlansMod.DEBUG)
			return;
		
		GlStateManager.disableTexture2D();
		GlStateManager.disableDepth();
		GlStateManager.color(entity.getColorRed(), entity.getColorGreen(), entity.getColorBlue());
		GlStateManager.pushMatrix();
		GlStateManager.translate((float)d0, (float)d1, (float)d2);
		GL11.glPointSize(10F);
		GlStateManager.glBegin(GL11.GL_POINTS);
		GlStateManager.glVertex3f(0F, 0F, 0F);
		GlStateManager.glEnd();
		GlStateManager.popMatrix();
		GlStateManager.enableTexture2D();
		GlStateManager.enableDepth();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDebugDot entity)
	{
		return null;
	}
	
	public static class Factory implements IRenderFactory<EntityDebugDot>
	{
		@Override
		public Render<EntityDebugDot> createRenderFor(RenderManager manager)
		{
			return new RenderDebugDot(manager);
		}
	}
}
