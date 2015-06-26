package com.flansmod.client.renderhack;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.teams.BlockSpawner;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TileEntitySpawner;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

public class RenderSpawner implements ISimpleBlockRenderingHandler 
{
	private int renderID;
	
	public RenderSpawner(int renderType) 
	{
		renderID = renderType;
	}

	@Override
	public void loadTextures(TextureLoader loader) 
	{
	}

	@Override
	public TextureAtlasSprite getSidedTexture(IBlockState state, EnumFacing facing) 
	{
		return null;
	}

	@Override
	public void renderInventoryBlock(ItemStack itemStack, TransformType transformType, int renderId) 
	{
        Block block = Block.getBlockFromItem(itemStack.getItem());
        
        Tessellator tessellator = Tessellator.getInstance();
        SimpleBlockRender render = new SimpleBlockRender();
        render.worldRenderer = tessellator.getWorldRenderer();
        render.setRenderBounds(0F, 0F, 0F, 1F, 0.0625F, 1F);
        this.renderInInventory(tessellator, render, block, transformType, itemStack);

		switch(itemStack.getItemDamage()) 
		{ 
		case 0: render.setRenderBounds(0.375F, 0.0625F, 0.375F, 0.625F, 0.125F, 0.625F); break; 
		case 1: render.setRenderBounds(0.25F, 0.0625F, 0.25F, 0.75F, 0.125F, 0.75F); break; 
		case 2: render.setRenderBounds(0.0625F, 0.0625F, 0.0625F, 0.9375F, 0.125F, 0.9375F); break; 
		}
        
        BlockSpawner.colouredPass = true;
        this.renderInInventory(tessellator, render, block, transformType, itemStack);
        BlockSpawner.colouredPass = false;

	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, BlockPos pos, IBlockState state, int renderId, WorldRenderer renderer) 
	{
        Block block = state.getBlock();
        
        if(!(block instanceof BlockSpawner))
        	return false;
        
        SimpleBlockRender render = new SimpleBlockRender();
        render.renderAllFaces = true;
        render.worldRenderer = renderer;

        render.setRenderBounds(0F, 0F, 0F, 1F, 0.0625F, 1F);
        render.renderStandardBlock((ITextureHandler)block, pos);
        
        
        //Coloured pass
        BlockSpawner.colouredPass = true;
		switch(((Integer)state.getValue(BlockSpawner.TYPE)).intValue()) 
		{ 
		case 0: render.setRenderBounds(0.375F, 0.0125F, 0.375F, 0.625F, 0.075F, 0.625F); break; 
		case 1: render.setRenderBounds(0.25F, 0.0125F, 0.25F, 0.75F, 0.075F, 0.75F); break; 
		case 2: render.setRenderBounds(0.0625F, 0.0125F, 0.0625F, 0.9375F, 0.075F, 0.9375F); break; 
		}
        render.renderStandardBlock((ITextureHandler)block, pos);
        BlockSpawner.colouredPass = false;        
        
        return true;
	}

	@Override
	public void renderBlockBrightness(int renderId, IBlockState state, float brightness) 
	{
        // TODO: really use the render
        Minecraft.getMinecraft().getBlockRendererDispatcher().renderBlockBrightness(Blocks.sand.getDefaultState(),brightness);
	}

	@Override
	public boolean shouldRender3DInInventory(int renderId) 
	{
		return true;
	}

	@Override
	public int getRenderId() 
	{
		return renderID;
	}
	
    protected void renderInInventory(Tessellator tessellator, SimpleBlockRender render, Block block, TransformType transformType, ItemStack stack) 
    {
        GlStateManager.translate(-0.5F, -0.5F, -0.5F);
        GlStateManager.pushMatrix();

        if (transformType.equals(TransformType.THIRD_PERSON)) 
        {
            GlStateManager.scale(0.55F, 0.55F, 0.55F);
            GlStateManager.rotate(45, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(180F, 0.0F, 0.0F, 1.0F);
            GlStateManager.translate(-1.4F, -1.9F, -1F);
        }

        render.renderInventoryStandardBlock((ITextureHandler)block, block.getStateFromMeta(stack.getItemDamage()), tessellator);
        GlStateManager.popMatrix();
        GlStateManager.translate(0.5F, 0.5F, 0.5F);
    }
}
