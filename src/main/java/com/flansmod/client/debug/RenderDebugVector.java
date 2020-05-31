package com.flansmod.client.debug;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.common.FlansMod;

public class RenderDebugVector extends Render<EntityDebugVector>
{
	
	public RenderDebugVector(RenderManager renderManager)
	{
		super(renderManager);
	}
	
	@Override
	public void doRender(EntityDebugVector entity, double d0, double d1, double d2, float f, float f1)
	{
		if(!FlansMod.DEBUG)
			return;
		
		GlStateManager.disableTexture2D();
		GlStateManager.disableDepth();
		GlStateManager.color(entity.getColorRed(), entity.getColorGreen(), entity.getColorBlue());
		GlStateManager.pushMatrix();
		GlStateManager.translate((float)d0, (float)d1, (float)d2);
		GlStateManager.glLineWidth(5F);
		GlStateManager.glBegin(GL11.GL_LINE_STRIP);
		GlStateManager.glVertex3f(0F, 0F, 0F);
		GlStateManager.glVertex3f(entity.getPointingX(), entity.getPointingY(), entity.getPointingZ());
		GlStateManager.glEnd();
		GlStateManager.popMatrix();
		GlStateManager.enableTexture2D();
		GlStateManager.enableDepth();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDebugVector entity)
	{
		return null;
	}
	
	public static class Factory implements IRenderFactory<EntityDebugVector>
	{
		@Override
		public Render<EntityDebugVector> createRenderFor(RenderManager manager)
		{
			return new RenderDebugVector(manager);
		}
	}
}
