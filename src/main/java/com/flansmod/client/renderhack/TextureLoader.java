package com.flansmod.client.renderhack;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

public class TextureLoader 
{
	private TextureMap textureMap;

    public TextureMap getTextureMap() 
    {
        return this.textureMap;
    }

    public void setTextureMap(TextureMap newMap) 
    {
        this.textureMap = newMap;
    }

    public boolean registerTexture(ResourceLocation location) 
    {
        return this.textureMap.setTextureEntry(location.toString(), this.textureMap.registerSprite(location));
    }
}
