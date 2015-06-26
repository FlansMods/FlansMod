package com.flansmod.client.renderhack;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

public class RenderBlock implements ISimpleBlockRenderingHandler
{
	private int renderID;
	
	public RenderBlock(int i)
	{
		renderID = i;
	}
	
	@Override
    public void renderInventoryBlock(ItemStack itemStack, TransformType transformType, int renderId) 
	{
        Block block = Block.getBlockFromItem(itemStack.getItem());
        
        Tessellator tessellator = Tessellator.getInstance();
        SimpleBlockRender render = new SimpleBlockRender();
        render.worldRenderer = tessellator.getWorldRenderer();
        render.setRenderBounds(0F, 0F, 0F, 1F, 1F, 1F);
        this.renderInInventory(tessellator, render, block, transformType, itemStack);
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, BlockPos pos, IBlockState state, int id, WorldRenderer renderer) 
    {
        Block block = state.getBlock();
        
        if(!(block instanceof ITextureHandler))
        	return false;
        
        SimpleBlockRender render = new SimpleBlockRender();
        render.renderAllFaces = true;
        render.worldRenderer = renderer;

        render.setRenderBounds(0F, 0F, 0F, 1F, 1F, 1F);
        render.renderStandardBlock((ITextureHandler)block, pos);

        return true;
    }

    @Override
    public boolean shouldRender3DInInventory(int id) 
    {
        return true;
    }

    @Override
    public int getRenderId() 
    {
        return renderID;
    }

    @Override
    /**
     * Used when a Enderman or a Golem hold the block
     */
    public void renderBlockBrightness(int renderId, IBlockState state, float brightness) 
    {
        // TODO: really use the render
        Minecraft.getMinecraft().getBlockRendererDispatcher().renderBlockBrightness(Blocks.sand.getDefaultState(),brightness);
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
