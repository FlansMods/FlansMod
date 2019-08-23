package com.flansmod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.common.teams.EntityFlagpole;

public class RenderFlagpole extends Render<EntityFlagpole>
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "teamsMod/Flagpole.png");
	
	public ModelFlagpole modelFlagpole;
	
	public RenderFlagpole(RenderManager renderManager)
	{
		super(renderManager);
		modelFlagpole = new ModelFlagpole();
	}
	
	@Override
	public void doRender(EntityFlagpole flagpole, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(flagpole);
		GlStateManager.pushMatrix();
		GlStateManager.translate((float)d, (float)d1, (float)d2);
		GlStateManager.rotate(f, 0.0F, 1.0F, 0.0F);
		
		GlStateManager.scale(-1F, -1F, 1F);
		GlStateManager.color(1F, 1F, 1F);
		
		modelFlagpole.renderPole(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, flagpole);
		GlStateManager.popMatrix();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityFlagpole entity)
	{
		return texture;
	}
	
	public static class Factory implements IRenderFactory<EntityFlagpole>
	{
		@Override
		public Render<EntityFlagpole> createRenderFor(RenderManager manager)
		{
			return new RenderFlagpole(manager);
		}
	}
}
