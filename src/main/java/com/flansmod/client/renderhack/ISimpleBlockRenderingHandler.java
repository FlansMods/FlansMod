package com.flansmod.client.renderhack;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public interface ISimpleBlockRenderingHandler extends ITextureHandler
{
    public abstract void renderInventoryBlock(ItemStack itemStack, TransformType transformType, int renderId);

    public abstract boolean renderWorldBlock(IBlockAccess world, BlockPos pos, IBlockState state, int renderId, WorldRenderer renderer);

    public abstract void renderBlockBrightness(int renderId, IBlockState state, float brightness);

    public abstract boolean shouldRender3DInInventory(int renderId);

    public abstract int getRenderId();
}
