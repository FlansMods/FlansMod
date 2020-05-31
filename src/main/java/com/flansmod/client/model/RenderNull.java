package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntitySeat;

public class RenderNull<E extends Entity> extends Render<E>
{
	private static final ResourceLocation texture = new ResourceLocation("Flan", "null.png");
	
	public RenderNull(RenderManager renderManager)
	{
		super(renderManager);
		shadowSize = 0.5F;
	}
	
	public void func_157_a(Entity entity, double d, double d1, double d2, float f, float f1)
	{
	}
	
	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		if(FlansMod.DEBUG)
		{
			GlStateManager.pushMatrix();
			GlStateManager.translate((float)d, (float)d1, (float)d2);
			GlStateManager.rotate(-entity.rotationYaw, 0F, 1F, 0F);
			GlStateManager.disableTexture2D();
			//GlStateManager.enableBlend();
			//GlStateManager.disableDepth();
			if(entity instanceof EntitySeat)
			{
				GlStateManager.color(1F, 1F, 1F, 1F);
			}
			else GlStateManager.color(0F, 0F, 1F, 0.3F);
			GlStateManager.scale(-1F, 1F, -1F);
			renderOffsetAABB(new AxisAlignedBB(-1F, -1F, -1F, 1F, 1F, 1F), 0, 0, 0);
			GlStateManager.enableTexture2D();
			GlStateManager.enableDepth();
			GlStateManager.disableBlend();
			GlStateManager.color(1F, 1F, 1F, 1F);
			GlStateManager.popMatrix();
		}
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return texture;
	}
	
	protected ModelBase model;
	
	public static class Factory<E extends Entity> implements IRenderFactory<E>
	{
		@Override
		public Render<E> createRenderFor(RenderManager manager)
		{
			return new RenderNull<E>(manager);
		}
	}
}
