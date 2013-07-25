package co.uk.flansmods.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.EntityAAGun;
import co.uk.flansmods.common.teams.EntityFlagpole;

public class RenderFlagpole extends Render
{
	private static final ResourceLocation texture = new ResourceLocation("Flan", "teamsMod/Flagpole.png");
	
	public ModelFlagpole modelFlagpole;
	
	public RenderFlagpole()
	{
		modelFlagpole = new ModelFlagpole();
	}
	
	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) 
	{
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
	protected ResourceLocation func_110775_a(Entity entity) 
	{
		return texture;
	}
}
