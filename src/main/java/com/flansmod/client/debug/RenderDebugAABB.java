package com.flansmod.client.debug;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.common.FlansMod;

public class RenderDebugAABB extends Render<EntityDebugAABB>
{
	public RenderDebugAABB(RenderManager renderManager)
	{
		super(renderManager);
	}
	
	@Override
	public void doRender(EntityDebugAABB entity, double d0, double d1, double d2, float f, float f1)
	{
		if(!FlansMod.DEBUG)
			return;
		EntityDebugAABB ent = entity;
		GlStateManager.disableTexture2D();
		GlStateManager.enableBlend();
		GlStateManager.color(ent.red, ent.green, ent.blue, 0.2F);
		GlStateManager.pushMatrix();
		
		GlStateManager.translate((float)d0, (float)d1, (float)d2);
		GlStateManager.rotate(-ent.rotationYaw, 0F, 1F, 0F);
		GlStateManager.rotate(ent.rotationPitch, 1F, 0F, 0F);
		GlStateManager.rotate(ent.rotationRoll, 0F, 0F, 1F);
		renderOffsetAABB(new AxisAlignedBB(ent.offset.x, ent.offset.y, ent.offset.z, ent.offset.x + ent.vector.x, ent.offset.y + ent.vector.y, ent.offset.z + ent.vector.z), 0, 0, 0);
		GlStateManager.popMatrix();
		GlStateManager.disableBlend();
		GlStateManager.enableTexture2D();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDebugAABB entity)
	{
		return null;
	}
	
	public static class Factory implements IRenderFactory<EntityDebugAABB>
	{
		@Override
		public Render<EntityDebugAABB> createRenderFor(RenderManager manager)
		{
			return new RenderDebugAABB(manager);
		}
	}
}
