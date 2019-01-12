package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.EntityMG;

public class RenderMG extends Render<EntityMG>
{
	public RenderMG(RenderManager renderManager)
	{
		super(renderManager);
		shadowSize = 0.5F;
	}
	
	@Override
	public void doRender(EntityMG mg, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(mg);
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d, (float)d1, (float)d2);
		
		GL11.glRotatef(180F - mg.direction * 90F, 0.0F, 1.0F, 0.0F);
		ModelMG model = mg.type.deployableModel;
		if(model == null)
			return;
		//GL11.glScalef(-1F, -1F, 1.0F);
		model.renderBipod(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, mg);
		GL11.glRotatef(-(mg.prevRotationYaw + (mg.rotationYaw - mg.prevRotationYaw) * f1), 0.0F, 1.0F, 0.0F);
		model.renderGun(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, f1, mg);
		GL11.glPopMatrix();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityMG entity)
	{
		return FlansModResourceHandler.getDeployableTexture(entity.type);
	}
	
	public static class Factory implements IRenderFactory<EntityMG>
	{
		@Override
		public Render<EntityMG> createRenderFor(RenderManager manager)
		{
			return new RenderMG(manager);
		}
	}
}
