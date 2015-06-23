package com.flansmod.client.renderhack;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public class RenderRegistry 
{
    private static final RenderRegistry INSTANCE = new RenderRegistry();

    private int nextRenderId = 5;

    private Map<Integer, ISimpleBlockRenderingHandler> renders = Maps.newHashMap();
    
    private List<ITextureHandler> texturesHandlers = Lists.newArrayList();

    private TextureLoader loader = new TextureLoader();

    public static RenderRegistry instance() {
        return INSTANCE;
    }

    /**
     * Get the next available renderId from the block render ID list
     */
    public static int getNextAvailableRenderId() {
        return instance().nextRenderId++;
    }

    /**
     * Register a simple block rendering handler
     *
     * @param handler
     */
    public static void registerBlockHandler(ISimpleBlockRenderingHandler handler) {
        registerBlockHandler(handler.getRenderId(), handler);
    }
    
    public static void registerTextureHandler(ITextureHandler handler) {
        if(!instance().texturesHandlers.contains(handler))
            instance().texturesHandlers.add(handler);
    }

    /**
     * Register the simple block rendering handler This version will not call
     * getRenderId on the passed in handler, instead using the supplied ID, so
     * you can easily re-use the same rendering handler for multiple IDs
     *
     * @param renderId
     * @param handler
     */
    public static void registerBlockHandler(int renderId, ISimpleBlockRenderingHandler handler) 
    {
        instance().renders.put(renderId, handler);
        registerTextureHandler(handler);
    }

    public boolean renderBlock(int renderId, IBlockState state, BlockPos pos, IBlockAccess world, WorldRenderer renderer) 
    {
        if (renders.containsKey(renderId))
            return renders.get(renderId).renderWorldBlock(world, pos, state, renderId, renderer);
        return false;
    }

    public void renderBlockBrightness(int renderId, IBlockState state, float brightness) 
    {
        if (!renders.containsKey(renderId))
            return;
        renders.get(renderId).renderBlockBrightness(renderId, state, brightness);
    }

    public void renderInventoryBlock(ItemStack stack, TransformType transformType) 
    {
        int renderId = ((ItemBlock) stack.getItem()).getBlock().getRenderType();
        if (!renders.containsKey(renderId))
            return;
        GlStateManager.enableRescaleNormal();
        GlStateManager.pushMatrix();
        GlStateManager.scale(0.5F, 0.5F, 0.5F);
        renders.get(renderId).renderInventoryBlock(stack, transformType, renderId);
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
    }

    public boolean shouldRender3DInInventory(ItemStack stack) 
    {
    	if(!(stack.getItem() instanceof ItemBlock))
    		return false;
    	
        int renderId = ((ItemBlock) stack.getItem()).getBlock().getRenderType();
        if (!renders.containsKey(renderId))
            return false;
        return renders.get(renderId).shouldRender3DInInventory(renderId);
    }

    public void injectTexture(TextureMap map) 
    {
        loader.setTextureMap(map);

        for (ITextureHandler itextured : texturesHandlers)
            itextured.loadTextures(loader);
    }
}
