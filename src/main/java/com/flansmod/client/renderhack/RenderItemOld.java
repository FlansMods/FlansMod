package com.flansmod.client.renderhack;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class RenderItemOld extends RenderItem 
{
	protected TextureManager textureManager;

	public RenderItemOld(TextureManager textureManager, ModelManager modelManager) 
	{
		super(textureManager, modelManager);
		this.textureManager = textureManager;
	}

	@Override
	public void renderItem(ItemStack stack, IBakedModel model)
	{
	    this.renderItem(stack, model, TransformType.NONE);
	}
	
	@Override
    protected void renderItemModelTransform(ItemStack stack, IBakedModel model, ItemCameraTransforms.TransformType cameraTransformType)
    {
        this.textureManager.bindTexture(TextureMap.locationBlocksTexture);
        this.textureManager.getTexture(TextureMap.locationBlocksTexture).setBlurMipmap(false, false);
        this.preTransform(stack);
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1F);
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.pushMatrix();

        model = net.minecraftforge.client.ForgeHooksClient.handleCameraTransforms(model, cameraTransformType);

        renderItem(stack, model, cameraTransformType);
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
        this.textureManager.bindTexture(TextureMap.locationBlocksTexture);
        this.textureManager.getTexture(TextureMap.locationBlocksTexture).restoreLastBlurMipmap();
    }
	
    private void preTransform(ItemStack stack)
    {
        IBakedModel ibakedmodel = this.getItemModelMesher().getItemModel(stack);
        Item item = stack.getItem();

        if (item != null)
        {
            boolean flag = ibakedmodel.isGui3d();

            if (!flag)
            {
                GlStateManager.scale(2.0F, 2.0F, 2.0F);
            }

            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    @Override
    public void renderItemIntoGUI(ItemStack stack, int x, int y)
    {
        IBakedModel ibakedmodel = this.getItemModelMesher().getItemModel(stack);
        GlStateManager.pushMatrix();
        this.textureManager.bindTexture(TextureMap.locationBlocksTexture);
        this.textureManager.getTexture(TextureMap.locationBlocksTexture)
                .setBlurMipmap(false, false);
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc(516, 0.1F);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 771);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        setupGuiTransform(x, y, ibakedmodel.isGui3d());
        applyTransform(ibakedmodel.getItemCameraTransforms().gui);
        renderItem(stack, ibakedmodel, ItemCameraTransforms.TransformType.GUI);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableLighting();
        GlStateManager.popMatrix();
        this.textureManager.bindTexture(TextureMap.locationBlocksTexture);
        this.textureManager.getTexture(TextureMap.locationBlocksTexture).restoreLastBlurMipmap();
    }
    
    private void setupGuiTransform(int xPosition, int yPosition, boolean isGui3d)
    {
        GlStateManager.translate((float)xPosition, (float)yPosition, 100.0F + this.zLevel);
        GlStateManager.translate(8.0F, 8.0F, 0.0F);
        GlStateManager.scale(1.0F, 1.0F, -1.0F);
        GlStateManager.scale(0.5F, 0.5F, 0.5F);

        if (isGui3d)
        {
            GlStateManager.scale(40.0F, 40.0F, 40.0F);
            GlStateManager.rotate(210.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
            GlStateManager.enableLighting();
        }
        else
        {
            GlStateManager.scale(64.0F, 64.0F, 64.0F);
            GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.disableLighting();
        }
    }

    public void renderItem(ItemStack paramItemStack, IBakedModel paramIBakedModel, ItemCameraTransforms.TransformType paramTransformType)
    {
        if (((paramItemStack.getItem() instanceof ItemBlock)) && (((ItemBlock) paramItemStack.getItem()).getBlock().getRenderType() > 4))
            RenderRegistry.instance().renderInventoryBlock(paramItemStack, paramTransformType);
        else
            super.renderItem(paramItemStack, paramIBakedModel);
    }

    @Override
    public boolean shouldRenderItemIn3D(ItemStack stack)
    {
        IBakedModel ibakedmodel = this.getItemModelMesher().getItemModel(stack);
        if (ibakedmodel == null || ibakedmodel == this.getItemModelMesher().getModelManager().getMissingModel())
        	return RenderRegistry.instance().shouldRender3DInInventory(stack);

        return ibakedmodel.isGui3d();
    }
}
