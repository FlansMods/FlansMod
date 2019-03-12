package com.flansmod.apocalypse.client.model;

import com.flansmod.apocalypse.common.entity.EntityTeleporter;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTeleporter extends Render<EntityTeleporter>
{
	private ModelTeleporter model;
	private static final ResourceLocation texture = new ResourceLocation("flansmodapocalypse", "textures/entity/Teleporter.png");
	private static int[] randomiser = new int[]{145, 167, 324, 541};
	
	public RenderTeleporter(RenderManager renderManager)
	{
		super(renderManager);
		model = new ModelTeleporter();
	}
	
	public void doRender(EntityTeleporter entity, double x, double y, double z, float p_76986_8_, float partialTicks)
	{
		bindEntityTexture(entity);
		
		RenderHelper.disableStandardItemLighting();
		//GlStateManager.disableTexture2D();
		GlStateManager.shadeModel(7425);
		//GlStateManager.enableBlend();
		//GlStateManager.blendFunc(770, 1);
		//GlStateManager.disableAlpha();
		GlStateManager.enableCull();
		//GlStateManager.depthMask(false);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		
		for(int i = 0; i < 4; i++)
		{
			float scaleX = 0.4F * (float)Math.sin((entity.ticksExisted + partialTicks) * 0.1F + 1.7F * randomiser[i]) + 1.0F;
			float scaleY = 0.4F * (float)Math.cos((entity.ticksExisted + partialTicks) * 0.114F + 1.145F + 0.35F * randomiser[(i + 1) % 4]) + 1.0F;
			float scaleZ = 0.4F * (float)Math.cos((entity.ticksExisted + partialTicks) * 0.121F + 0.7545F - 11F * randomiser[i]) + 1.0F;
			float rotation = 100F * (float)Math.cos((entity.ticksExisted + partialTicks) * 0.000121F * randomiser[(i + 2) % 4]);
			GlStateManager.pushMatrix();
			GlStateManager.translate(0.0F, 1.0F, 0.0F);
			GlStateManager.translate(x, y, z);
			GlStateManager.rotate(rotation, 1F, 1F, 0F);
			GlStateManager.rotate(100F * (float)Math.sin((entity.ticksExisted + partialTicks) * 0.000173F * randomiser[(i + 2) % 4]), 1F, 0F, 1F);
			GlStateManager.scale(-scaleX, scaleY, scaleZ);
			model.render(0.0625F);
			GlStateManager.popMatrix();
		}
		
		GlStateManager.depthMask(true);
		GlStateManager.disableCull();
		GlStateManager.disableBlend();
		GlStateManager.shadeModel(7424);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.enableTexture2D();
		GlStateManager.enableAlpha();
		RenderHelper.enableStandardItemLighting();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityTeleporter entity)
	{
		return texture;
	}
}
