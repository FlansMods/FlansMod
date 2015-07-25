package net.minecraft.client.renderer.entity;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.RenderGrenade;
import com.flansmod.client.model.RenderGun;
import com.flansmod.client.model.RenderMecha;
import com.flansmod.client.model.RenderPlane;
import com.flansmod.client.model.RenderVehicle;
import com.flansmod.client.renderhack.RenderRegistry;
import com.flansmod.common.BlockItemHolder;
import com.flansmod.common.FlansMod;
import com.flansmod.common.ItemHolderType;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

public class RenderItemOld extends RenderItem 
{
	protected TextureManager textureManager;
	
	private RenderGun renderGun;
	private RenderVehicle renderVehicle;
	private RenderPlane renderPlane;
	private RenderMecha renderMecha;
	private RenderGrenade renderGrenade;

	public RenderItemOld(TextureManager textureManager, ModelManager modelManager) 
	{
		super(textureManager, modelManager);
		this.textureManager = textureManager;
		RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
		renderGun = new RenderGun();
		renderVehicle = new RenderVehicle(renderManager);
		renderPlane = new RenderPlane(renderManager);
		renderMecha = new RenderMecha(renderManager);
		renderGrenade = new RenderGrenade(renderManager);
	}

	@Override
	public void renderItem(ItemStack stack, IBakedModel model)
	{
	    this.renderItem(stack, model, TransformType.NONE);
	}
	
    protected void renderItemModelTransform(ItemStack stack, IBakedModel model, ItemCameraTransforms.TransformType cameraTransformType, Object... obj)
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

        renderItem(stack, model, cameraTransformType, obj);
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
        this.textureManager.bindTexture(TextureMap.locationBlocksTexture);
        this.textureManager.getTexture(TextureMap.locationBlocksTexture).restoreLastBlurMipmap();
    }
	
	@Override
    protected void renderItemModelTransform(ItemStack stack, IBakedModel model, ItemCameraTransforms.TransformType cameraTransformType)
    {
		super.renderItemModelTransform(stack, model, cameraTransformType);
    }
	
	@Override
    public void renderItemModelForEntity(ItemStack stack, EntityLivingBase entityToRenderFor, ItemCameraTransforms.TransformType cameraTransformType)
    {
        IBakedModel ibakedmodel = this.getItemModelMesher().getItemModel(stack);

        if (entityToRenderFor instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityToRenderFor;
            Item item = stack.getItem();
            ModelResourceLocation modelresourcelocation = null;

            if (item == Items.fishing_rod && entityplayer.fishEntity != null)
            {
                modelresourcelocation = new ModelResourceLocation("fishing_rod_cast", "inventory");
            }
            else if (item == Items.bow && entityplayer.getItemInUse() != null)
            {
                int i = stack.getMaxItemUseDuration() - entityplayer.getItemInUseCount();

                if (i >= 18)
                {
                    modelresourcelocation = new ModelResourceLocation("bow_pulling_2", "inventory");
                }
                else if (i > 13)
                {
                    modelresourcelocation = new ModelResourceLocation("bow_pulling_1", "inventory");
                }
                else if (i > 0)
                {
                    modelresourcelocation = new ModelResourceLocation("bow_pulling_0", "inventory");
                }
            }
            else
            {
                modelresourcelocation = item.getModel(stack, entityplayer, entityplayer.getItemInUseCount());
            }

            if (modelresourcelocation != null)
            {
                ibakedmodel = this.getItemModelMesher().getModelManager().getModel(modelresourcelocation);
            }
        }

        this.renderItemModelTransform(stack, ibakedmodel, cameraTransformType, null, entityToRenderFor);
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

    public void renderItem(ItemStack paramItemStack, IBakedModel paramIBakedModel, ItemCameraTransforms.TransformType paramTransformType, Object... obj)
    {
    	//Look for Flan's Mod blocks
        if (((paramItemStack.getItem() instanceof ItemBlock)) && (((ItemBlock) paramItemStack.getItem()).getBlock().getRenderType() > 4))
            RenderRegistry.instance().renderInventoryBlock(paramItemStack, paramTransformType);
        
        else if(paramItemStack.getItem() instanceof IFlanItem)
        {     	
        	InfoType type = ((IFlanItem)paramItemStack.getItem()).getInfoType();
        	if(paramTransformType == TransformType.GUI)
        	{
        		render2DItem(paramItemStack, type, false);
        	}
        	else
        	{
	        	if(type == null || type.modelString == null || type instanceof BulletType || type instanceof ArmourType || type instanceof AttachmentType || type instanceof ToolType || type instanceof MechaItemType)
	        	{
	        		switch(paramTransformType)
	        		{
					case FIRST_PERSON:	
						GL11.glTranslatef(-1.5F, 0.75F, 0.5F);
						GL11.glRotatef(60F, 0F, 1F, 0F);
						GL11.glRotatef(-30F, 0F, 0F, 1F);
						break;
					case GUI:
						break;
					case HEAD:
						break;
					case NONE:
						GL11.glTranslatef(-0.4F, 0.25F, 0F);
						//GL11.glRotatef(-45F, 0F, 0F, 1F);
						break;
					case THIRD_PERSON:
						GL11.glTranslatef(0F, -0.25F, -0.25F);
						GL11.glRotatef(-90F, 0F, 1F, 0F);
						GL11.glRotatef(45F, 0F, 0F, 1F);
						break;
					default:
						break;
	        		
	        		}
	        		render2DItem(paramItemStack, type, true);
	        	}
	        	else
	        	{

	        		RenderHelper.enableStandardItemLighting();
	        		GlStateManager.disableLighting();
	        		GlStateManager.enableLighting();
		        	if(type instanceof GunType)
		        		renderGun.renderItem(convert(paramTransformType), paramItemStack, obj);
		        	else if(type instanceof VehicleType)
		        		renderVehicle.renderItem(convert(paramTransformType), paramItemStack, obj);
		        	else if(type instanceof PlaneType)
		        		renderPlane.renderItem(convert(paramTransformType), paramItemStack, obj);
		        	else if(type instanceof MechaType)
		        		renderMecha.renderItem(convert(paramTransformType), paramItemStack, obj);
		        	else if(type instanceof GrenadeType)
		        		renderGrenade.renderItem(convert(paramTransformType), paramItemStack, obj);
	        	}
        	}
        }
    	else if(paramItemStack.getItem() instanceof ItemBlock && Block.getBlockFromItem(((ItemBlock)paramItemStack.getItem())) instanceof BlockItemHolder)
    	{
    		ItemHolderType type = ((BlockItemHolder)Block.getBlockFromItem(((ItemBlock)paramItemStack.getItem()))).type;
    		if(type.model != null)
    		{
    			GL11.glPushMatrix();
    			GL11.glRotatef(180F, 0F, 0F, 1F);
    			GL11.glRotatef(180F, 0F, 1F, 0F);
    			textureManager.bindTexture(FlansModResourceHandler.getTexture(type));
    			type.model.render();
    			GL11.glPopMatrix();
    		}
    	}
        else super.renderItem(paramItemStack, paramIBakedModel);
    }
    
    private void render2DItem(ItemStack stack, InfoType type, boolean depth)
    {
    	GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_BLEND);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        ResourceLocation resourcelocation;
        if(type == null)
        {
        	if(stack.getItem() == FlansMod.opStick)
        	{
        		resourcelocation = FlansModResourceHandler.opStick[stack.getItemDamage()];
        	}
        	else resourcelocation = FlansModResourceHandler.flag;
        }
        else resourcelocation = FlansModResourceHandler.getIcon(type);
        
        if(type instanceof GunType && stack.hasTagCompound())
        {
        	GunType gunType = (GunType)type;
        	Paintjob paintjob = gunType.getPaintjob(stack.getTagCompound().getString("Paint"));
        	resourcelocation = FlansModResourceHandler.getIcon(gunType, paintjob);
        }
        textureManager.bindTexture(resourcelocation);
        
        GL11.glDisable(GL11.GL_LIGHTING); //Forge: Make sure that render states are reset, a renderEffect can derp them up.
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_BLEND);
        
        if(depth)
        {
        	renderIconWithThickness();
        }
        else
        {
        	GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glRotatef(-45F, 0F, 1F, 0F);
			GL11.glRotatef(30F, 1F, 0F, 0F);
			GL11.glRotatef(180F, 0F, 0F, 1F);
			float scale = 0.05F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(-8F, -8F, 0F);
			this.renderIcon(0, 0, 16, 16);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
        }

        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_LIGHTING);
    }
    
    private void renderIconWithThickness()
    {
    	float minU = 0, maxU = 1, minV = 0, maxV = 1, iconWidth = 16, iconHeight = 16, scale = 0.0625F;
    	
    	Tessellator tessellator = Tessellator.getInstance();
        tessellator.getWorldRenderer().startDrawingQuads();
        tessellator.getWorldRenderer().setNormal(0.0F, 0.0F, 1.0F);
        tessellator.getWorldRenderer().addVertexWithUV(0.0D, 0.0D, 0.0D, (double)maxU, (double)maxV);
        tessellator.getWorldRenderer().addVertexWithUV(1.0D, 0.0D, 0.0D, (double)minU, (double)maxV);
        tessellator.getWorldRenderer().addVertexWithUV(1.0D, 1.0D, 0.0D, (double)minU, (double)minV);
        tessellator.getWorldRenderer().addVertexWithUV(0.0D, 1.0D, 0.0D, (double)maxU, (double)minV);
        tessellator.draw();
        tessellator.getWorldRenderer().startDrawingQuads();
        tessellator.getWorldRenderer().setNormal(0.0F, 0.0F, -1.0F);
        tessellator.getWorldRenderer().addVertexWithUV(0.0D, 1.0D, (double)(0.0F - scale), (double)maxU, (double)minV);
        tessellator.getWorldRenderer().addVertexWithUV(1.0D, 1.0D, (double)(0.0F - scale), (double)minU, (double)minV);
        tessellator.getWorldRenderer().addVertexWithUV(1.0D, 0.0D, (double)(0.0F - scale), (double)minU, (double)maxV);
        tessellator.getWorldRenderer().addVertexWithUV(0.0D, 0.0D, (double)(0.0F - scale), (double)maxU, (double)maxV);
        tessellator.draw();
        float f5 = 0.5F * (maxU - minU) / (float)iconWidth;
        float f6 = 0.5F * (maxV - minV) / (float)iconHeight;
        tessellator.getWorldRenderer().startDrawingQuads();
        tessellator.getWorldRenderer().setNormal(-1.0F, 0.0F, 0.0F);
        int k;
        float f7;
        float f8;

        for (k = 0; k < iconWidth; ++k)
        {
            f7 = (float)k / (float)iconWidth;
            f8 = maxU + (minU - maxU) * f7 - f5;
            tessellator.getWorldRenderer().addVertexWithUV((double)f7, 0.0D, (double)(0.0F - scale), (double)f8, (double)maxV);
            tessellator.getWorldRenderer().addVertexWithUV((double)f7, 0.0D, 0.0D, (double)f8, (double)maxV);
            tessellator.getWorldRenderer().addVertexWithUV((double)f7, 1.0D, 0.0D, (double)f8, (double)minV);
            tessellator.getWorldRenderer().addVertexWithUV((double)f7, 1.0D, (double)(0.0F - scale), (double)f8, (double)minV);
        }

        tessellator.draw();
        tessellator.getWorldRenderer().startDrawingQuads();
        tessellator.getWorldRenderer().setNormal(1.0F, 0.0F, 0.0F);
        float f9;

        for (k = 0; k < iconWidth; ++k)
        {
            f7 = (float)k / (float)iconWidth;
            f8 = maxU + (minU - maxU) * f7 - f5;
            f9 = f7 + 1.0F / (float)iconWidth;
            tessellator.getWorldRenderer().addVertexWithUV((double)f9, 1.0D, (double)(0.0F - scale), (double)f8, (double)minV);
            tessellator.getWorldRenderer().addVertexWithUV((double)f9, 1.0D, 0.0D, (double)f8, (double)minV);
            tessellator.getWorldRenderer().addVertexWithUV((double)f9, 0.0D, 0.0D, (double)f8, (double)maxV);
            tessellator.getWorldRenderer().addVertexWithUV((double)f9, 0.0D, (double)(0.0F - scale), (double)f8, (double)maxV);
        }

        tessellator.draw();
        tessellator.getWorldRenderer().startDrawingQuads();
        tessellator.getWorldRenderer().setNormal(0.0F, 1.0F, 0.0F);

        for (k = 0; k < iconHeight; ++k)
        {
            f7 = (float)k / (float)iconHeight;
            f8 = maxV + (minV - maxV) * f7 - f6;
            f9 = f7 + 1.0F / (float)iconHeight;
            tessellator.getWorldRenderer().addVertexWithUV(0.0D, (double)f9, 0.0D, (double)maxU, (double)f8);
            tessellator.getWorldRenderer().addVertexWithUV(1.0D, (double)f9, 0.0D, (double)minU, (double)f8);
            tessellator.getWorldRenderer().addVertexWithUV(1.0D, (double)f9, (double)(0.0F - scale), (double)minU, (double)f8);
            tessellator.getWorldRenderer().addVertexWithUV(0.0D, (double)f9, (double)(0.0F - scale), (double)maxU, (double)f8);
        }

        tessellator.draw();
        tessellator.getWorldRenderer().startDrawingQuads();
        tessellator.getWorldRenderer().setNormal(0.0F, -1.0F, 0.0F);

        for (k = 0; k < iconHeight; ++k)
        {
            f7 = (float)k / (float)iconHeight;
            f8 = maxV + (minV - maxV) * f7 - f6;
            tessellator.getWorldRenderer().addVertexWithUV(1.0D, (double)f7, 0.0D, (double)minU, (double)f8);
            tessellator.getWorldRenderer().addVertexWithUV(0.0D, (double)f7, 0.0D, (double)maxU, (double)f8);
            tessellator.getWorldRenderer().addVertexWithUV(0.0D, (double)f7, (double)(0.0F - scale), (double)maxU, (double)f8);
            tessellator.getWorldRenderer().addVertexWithUV(1.0D, (double)f7, (double)(0.0F - scale), (double)minU, (double)f8);
        }

        tessellator.draw();
    }
    
    public void renderIcon(int p_94149_1_, int p_94149_2_, int p_94149_4_, int p_94149_5_)
    {
        Tessellator tessellator = Tessellator.getInstance();
        tessellator.getWorldRenderer().startDrawingQuads();
        tessellator.getWorldRenderer().addVertexWithUV((double)(p_94149_1_ + 0), (double)(p_94149_2_ + p_94149_5_), 			(double)this.zLevel, 0, 1);
        tessellator.getWorldRenderer().addVertexWithUV((double)(p_94149_1_ + p_94149_4_), (double)(p_94149_2_ + p_94149_5_), 	(double)this.zLevel, 1, 1);
        tessellator.getWorldRenderer().addVertexWithUV((double)(p_94149_1_ + p_94149_4_), (double)(p_94149_2_ + 0), 			(double)this.zLevel, 1, 0);
        tessellator.getWorldRenderer().addVertexWithUV((double)(p_94149_1_ + 0), (double)(p_94149_2_ + 0), 						(double)this.zLevel, 0, 0);
        tessellator.draw();
    }

    @Override
    public boolean shouldRenderItemIn3D(ItemStack stack)
    {
        IBakedModel ibakedmodel = this.getItemModelMesher().getItemModel(stack);
        if (ibakedmodel == null || ibakedmodel == this.getItemModelMesher().getModelManager().getMissingModel())
        	return RenderRegistry.instance().shouldRender3DInInventory(stack);

        return ibakedmodel.isGui3d();
    }
    
    private ItemRenderType convert(ItemCameraTransforms.TransformType type)
    {
    	switch(type)
    	{
		case FIRST_PERSON: 	return ItemRenderType.EQUIPPED_FIRST_PERSON;
		case GUI:			return ItemRenderType.INVENTORY;
		case HEAD:			return ItemRenderType.FIRST_PERSON_MAP;
		case NONE:			return ItemRenderType.ENTITY;
		case THIRD_PERSON:	return ItemRenderType.EQUIPPED;
		default:
			return ItemRenderType.ENTITY;
    	}
    }
}
