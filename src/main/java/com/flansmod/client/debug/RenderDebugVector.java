package com.flansmod.client.debug;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.flansmod.common.FlansMod;

public class RenderDebugVector extends Render {

	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) 
	{
		if(!FlansMod.DEBUG)
			return;
		EntityDebugVector ent = (EntityDebugVector)entity;
		
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glColor3f(ent.red, ent.green, ent.blue);
		GL11.glPushMatrix();
	    GL11.glTranslatef((float)d0, (float)d1, (float)d2);
	    GL11.glLineWidth(5F);
	    GL11.glBegin(GL11.GL_LINE_STRIP);
	    GL11.glVertex3f(0F, 0F, 0F);
	    GL11.glVertex3f(ent.vector.x, ent.vector.y, ent.vector.z);
	    GL11.glEnd();
	    GL11.glPopMatrix();
	    GL11.glEnable(GL11.GL_TEXTURE_2D);
	    GL11.glEnable(GL11.GL_DEPTH_TEST);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return null;
	}

}
