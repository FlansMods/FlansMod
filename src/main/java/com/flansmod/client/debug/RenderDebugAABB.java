package com.flansmod.client.debug;

import org.lwjgl.opengl.GL11;

import com.flansmod.common.FlansMod;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;

public class RenderDebugAABB extends Render 
{
	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) 
	{
		if(!FlansMod.DEBUG)
			return;
		EntityDebugAABB ent = (EntityDebugAABB)entity;
		
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		//GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(ent.red, ent.green, ent.blue, 0.9F);
		GL11.glPushMatrix();
	    GL11.glTranslatef((float)d0, (float)d1, (float)d2);
	    renderAABB(AxisAlignedBB.getBoundingBox(0, 0, 0, ent.vector.x, ent.vector.y, ent.vector.z));
	    GL11.glPopMatrix();
		GL11.glDisable(GL11.GL_BLEND);
	    GL11.glEnable(GL11.GL_TEXTURE_2D);
	    GL11.glEnable(GL11.GL_DEPTH_TEST);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return null;
	}

}
