package com.flansmod.client.renderhack;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FlansModRendererDispatcher extends BlockRendererDispatcher
{
	public FlansModRendererDispatcher(BlockModelShapes modelShapes, GameSettings settings)
    {
        super(modelShapes, settings);
    }
    
    @Override
    public boolean renderBlock(IBlockState state, BlockPos pos, IBlockAccess blockAccess, WorldRenderer worldRendererIn)
    {
        final boolean result = super.renderBlock(state, pos, blockAccess, worldRendererIn);
        if(!result && state.getBlock().getRenderType() > 4)
        {
            return RenderRegistry.instance().renderBlock(state.getBlock().getRenderType(), state, pos, blockAccess, worldRendererIn);
        }
        
        return result;
    }
    
    @Override
    public void renderBlockBrightness(IBlockState state, float brightness)
    {
        super.renderBlockBrightness(state, brightness);
        if(state.getBlock().getRenderType() > 4)
            RenderRegistry.instance().renderBlockBrightness(state.getBlock().getRenderType(), state, brightness);
    }
    
    @Override
    public void renderBlockDamage(IBlockState state, BlockPos pos, TextureAtlasSprite texture, IBlockAccess blockAccess)
    {
        super.renderBlockDamage(state, pos, texture, blockAccess);
        if(state.getBlock().getRenderType() > 4)
            RenderRegistry.instance().renderBlock(state.getBlock().getRenderType(), state, pos, blockAccess, Tessellator.getInstance().getWorldRenderer());
    }
}
