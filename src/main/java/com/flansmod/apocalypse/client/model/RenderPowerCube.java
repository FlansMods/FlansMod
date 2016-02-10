package com.flansmod.apocalypse.client.model;

import com.flansmod.apocalypse.common.blocks.TileEntityPowerCube;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.ModelItemHolder;
import com.flansmod.common.ItemHolderType;
import com.flansmod.common.TileEntityItemHolder;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderPowerCube extends TileEntitySpecialRenderer 
{
	private ResourceLocation TEXTURE = new ResourceLocation("flansmodapocalypse", "textures/blocks/PowerCube.png");
	private ModelPowerCube model;
	
	public RenderPowerCube() 
	{
		model = new ModelPowerCube();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float p_180535_8_, int p_180535_9_) 
	{
		TileEntityPowerCube holder = (TileEntityPowerCube)te;
		
		if(model != null)
		{
			bindTexture(TEXTURE);
	        GlStateManager.pushMatrix();
	        GlStateManager.translate((float)posX, (float)posY, (float)posZ);
	        GlStateManager.rotate(180F, 0F, 0F, 1F);
	        
	        /*
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
	        }
	        */
	        GlStateManager.translate(-1F, 0F, 0F);
	        model.render();
	        
	        float angle = (holder.age + p_180535_8_) * 10F;
	        float scale = (float)Math.sin(angle * 0.01F);
	        
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(0.5F, -0.5F, 0.5F);
	        GlStateManager.rotate(angle * 1.345F, 1F, 0F, 0F);
	        GlStateManager.rotate(angle * 0.8925F, 0F, 1F, 0F);
	        GlStateManager.rotate(angle * 0.245F, 0F, 0F, 1F);
	        GlStateManager.scale(scale, scale, scale);
	        GlStateManager.translate(-0.5F, 0.5F, -0.5F);
	        model.renderPower();
	        GlStateManager.popMatrix();
	        
	        scale = (float)Math.cos(angle * 0.0134F);

	        GlStateManager.pushMatrix();
	        GlStateManager.translate(0.5F, -0.5F, 0.5F);
	        GlStateManager.rotate(angle * 1.783F, 1F, 0F, 0F);
	        GlStateManager.rotate(angle * 1.145F, 0F, 1F, 0F);
	        GlStateManager.rotate(angle * 0.3567F, 0F, 0F, 1F);
	        GlStateManager.scale(scale, scale, scale);
	        GlStateManager.translate(-0.5F, 0.5F, -0.5F);
	        model.renderPower();
	        GlStateManager.popMatrix();
	        
	        scale = (float)Math.sin(angle * 0.0254F);
	        
	        GlStateManager.pushMatrix();
	        GlStateManager.translate(0.5F, -0.5F, 0.5F);
	        GlStateManager.rotate(angle * 1.9993F, 1F, 0F, 0F);
	        GlStateManager.rotate(angle * 1.111F, 0F, 1F, 0F);
	        GlStateManager.rotate(angle * 0.578F, 0F, 0F, 1F);
	        GlStateManager.scale(scale, scale, scale);
	        GlStateManager.translate(-0.5F, 0.5F, -0.5F);
	        model.renderPower();
	        GlStateManager.popMatrix();
	        
	        GlStateManager.popMatrix();
		}
	}
}
