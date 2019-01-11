package com.flansmod.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import com.flansmod.common.guns.ItemGun;

public class RenderGunItem extends RenderEntityItem
{
	private RenderGun gunRenderer;
	
	public RenderGunItem(RenderManager renderManager, RenderItem renderItem)
	{
		super(renderManager, renderItem);
		this.gunRenderer = new RenderGun();
	}
	
	@Override
	public void doRender(EntityItem entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		ItemStack stack = entity.getItem();
		
		if(stack.getItem() instanceof ItemGun && ((ItemGun)stack.getItem()).GetType().model != null)
		{
			GlStateManager.pushMatrix();
			GlStateManager.translate(x, y + 0.25D, z);
			GlStateManager.rotate(entity.ticksExisted + partialTicks, 0F, 1F, 0F);
			
			gunRenderer.renderItem(CustomItemRenderType.ENTITY, EnumHand.MAIN_HAND, stack);
			GlStateManager.popMatrix();
		}
		else
		{
			super.doRender(entity, x, y, z, partialTicks, partialTicks);
		}
	}
	
	public static class Factory implements IRenderFactory<EntityItem>
	{
		@Override
		public Render<EntityItem> createRenderFor(RenderManager manager)
		{
			return new RenderGunItem(manager, Minecraft.getMinecraft().getRenderItem());
		}
	}
}
