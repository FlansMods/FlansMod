package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.flansmod.common.teams.EntityFlagpole;

public class RenderFlagpole extends Render
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "teamsMod/Flagpole.png");
	
	public ModelFlagpole modelFlagpole;
	
	public RenderFlagpole()
	{
		modelFlagpole = new ModelFlagpole();
	}
	
	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) 
	{
		bindEntityTexture(entity);
		EntityFlagpole flagpole = (EntityFlagpole)entity;
		GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
		
        GL11.glScalef(-1F, -1F, 1F);
        GL11.glColor3f(1F, 1F, 1F);
        
        modelFlagpole.renderPole(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, flagpole);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return texture;
	}
}
