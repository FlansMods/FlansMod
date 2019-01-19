package com.flansmod.client.debug;

import org.lwjgl.opengl.GL11;

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
		
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glColor3f(entity.getColorRed(), entity.getColorGreen(), entity.getColorBlue());
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d0, (float)d1, (float)d2);
		GL11.glPointSize(10F);
		GL11.glBegin(GL11.GL_POINTS);
		GL11.glVertex3f(0F, 0F, 0F);
		GL11.glEnd();
		GL11.glPopMatrix();
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
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
