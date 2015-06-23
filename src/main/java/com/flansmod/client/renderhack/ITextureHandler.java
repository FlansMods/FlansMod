package com.flansmod.client.renderhack;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface ITextureHandler 
{
	@SideOnly(Side.CLIENT)
    public abstract void loadTextures(TextureLoader loader);
    
    @SideOnly(Side.CLIENT)
    public abstract TextureAtlasSprite getSidedTexture(IBlockState state, EnumFacing facing);
}
