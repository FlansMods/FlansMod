package com.flansmod.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.ItemHolderType;
import com.flansmod.common.TileEntityItemHolder;
import com.flansmod.common.guns.ItemGun;

public class RenderItemHolder extends TileEntitySpecialRenderer<TileEntityItemHolder>
{
	public RenderItemHolder()
	{
	}
	
	@Override
	public void render(TileEntityItemHolder te, double posX, double posY, double posZ, float p_180535_8_, int p_180535_9_, float f)
	{
		TileEntityItemHolder holder = te;
		if(holder == null || holder.type == null)
			return;
		ModelItemHolder model = holder.type.model;
		
		if(model != null)
		{
			bindTexture(getTexture(holder.type));
			GlStateManager.pushMatrix();
			GlStateManager.translate((float)posX, (float)posY, (float)posZ);
			GlStateManager.rotate(180F, 0F, 0F, 1F);
			GlStateManager.disableLighting();
			RenderHelper.enableStandardItemLighting();
			GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
			
			switch(EnumFacing.HORIZONTALS[holder.getBlockMetadata()])
			{
				case NORTH:
					GlStateManager.translate(-1F, 0F, 0F);
					GlStateManager.rotate(0F, 0F, 1F, 0F);
					break;
				case EAST:
					GlStateManager.translate(-1F, 0F, 1F);
					GlStateManager.rotate(90F, 0F, 1F, 0F);
					break;
				case SOUTH:
					GlStateManager.translate(0F, 0F, 1F);
					GlStateManager.rotate(180F, 0F, 1F, 0F);
					break;
				case WEST:
					GlStateManager.rotate(270F, 0F, 1F, 0F);
					break;
				default:
					break;
			}
			
			model.render();
			
			ItemStack stack = holder.getStackInSlot(0);
			if(stack != null && !stack.isEmpty())
			{
				GlStateManager.rotate(180F, 0F, 0F, 1F);
				GlStateManager.translate(-0.5F, 0.5F, 0.5F);
				
				GlStateManager.translate(model.itemOffset.x, model.itemOffset.y, model.itemOffset.z);
				GlStateManager.rotate(model.itemRotation.x, 1F, 0F, 0F);
				GlStateManager.rotate(model.itemRotation.z, 0F, 0F, 1F);
				GlStateManager.rotate(model.itemRotation.y, 0F, 1F, 0F);
				
				if(stack.getItem() instanceof ItemGun && ((ItemGun)stack.getItem()).GetType().model != null)
				{
					ClientProxy.gunRenderer.renderItem(CustomItemRenderType.ENTITY, EnumHand.MAIN_HAND, stack);
				}
				else Minecraft.getMinecraft().getRenderItem().renderItem(stack, TransformType.NONE);
			}
			
			RenderHelper.disableStandardItemLighting();
			GlStateManager.enableLighting();
			GlStateManager.popMatrix();
		}
	}
	
	protected ResourceLocation getTexture(ItemHolderType type)
	{
		return FlansModResourceHandler.getTexture(type);
	}
}
