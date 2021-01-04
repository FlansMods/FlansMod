package com.flansmod.yeolde.client.model;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.util.WorldRenderer;

public class ModelArrow extends ModelBase
{
	public ModelRenderer bulletModel;

	public ModelArrow()
	{
		bulletModel = new ModelRenderer(this, 0, 0);
		bulletModel.addBox(-0.5F, -1F, -0.5F, 1, 2, 1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		WorldRenderer worldrenderer = FlansModClient.getWorldRenderer();
		byte var11 = 0;
		float var12 = 0.0F;
		float var13 = 0.5F;
		float var14 = (var11 * 10) / 32.0F;
		float var15 = (5 + var11 * 10) / 32.0F;
		float var16 = 0.0F;
		float var17 = 0.15625F;
		float var18 = (5 + var11 * 10) / 32.0F;
		float var19 = (10 + var11 * 10) / 32.0F;
		float var20 = 0.05625F;
		GlStateManager.enableRescaleNormal();
		GlStateManager.rotate(90F, 0.0F, 0.0F, 1.0F);
		GlStateManager.rotate(45.0F, 1.0F, 0.0F, 0.0F);
		GlStateManager.scale(var20, var20, var20);
		GlStateManager.translate(-4.0F, 0.0F, 0.0F);
		GlStateManager.glNormal3f(var20, 0.0F, 0.0F);
		worldrenderer.startDrawingQuads();
		worldrenderer.addVertexWithUV(-7.0D, -2.0D, -2.0D, var16, var18);
		worldrenderer.addVertexWithUV(-7.0D, -2.0D, 2.0D, var17, var18);
		worldrenderer.addVertexWithUV(-7.0D, 2.0D, 2.0D, var17, var19);
		worldrenderer.addVertexWithUV(-7.0D, 2.0D, -2.0D, var16, var19);
		worldrenderer.draw();
		GlStateManager.glNormal3f(-var20, 0.0F, 0.0F);
		worldrenderer.startDrawingQuads();
		worldrenderer.addVertexWithUV(-7.0D, 2.0D, -2.0D, var16, var18);
		worldrenderer.addVertexWithUV(-7.0D, 2.0D, 2.0D, var17, var18);
		worldrenderer.addVertexWithUV(-7.0D, -2.0D, 2.0D, var17, var19);
		worldrenderer.addVertexWithUV(-7.0D, -2.0D, -2.0D, var16, var19);
		worldrenderer.draw();

		for(int var23 = 0; var23 < 4; ++var23)
		{
			GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
			GlStateManager.glNormal3f(0.0F, 0.0F, var20);
			worldrenderer.startDrawingQuads();
			worldrenderer.addVertexWithUV(-8.0D, -2.0D, 0.0D, var12, var14);
			worldrenderer.addVertexWithUV(8.0D, -2.0D, 0.0D, var13, var14);
			worldrenderer.addVertexWithUV(8.0D, 2.0D, 0.0D, var13, var15);
			worldrenderer.addVertexWithUV(-8.0D, 2.0D, 0.0D, var12, var15);
			worldrenderer.draw();
		}
		GlStateManager.disableRescaleNormal();

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
}
