package com.flansmod.apocalypse.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.flansmod.apocalypse.common.entity.EntitySkullDrone;
import com.flansmod.apocalypse.common.entity.EntityNukeDrop;
import com.flansmod.apocalypse.common.entity.EntitySkullBoss;
import com.flansmod.apocalypse.common.entity.EntityTeleporter;
import com.flansmod.client.ClientProxy;
import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.vector.Vector3f;

public class RenderSkullDrone extends Render<EntitySkullDrone>
{
	private static final ResourceLocation texture = new ResourceLocation("flansmodapocalypse", "textures/entity/skulldrone.png");
	private ModelSkullDrone model;
	private static final ItemRenderer renderer = new ItemRenderer(Minecraft.getMinecraft());
	private static RenderItem renderItem;
	
	public RenderSkullDrone(RenderManager rm)
	{
		super(rm);
		renderItem = Minecraft.getMinecraft().getRenderItem();
		model = new ModelSkullDrone();
	}
	
	public void doRender(EntitySkullDrone entity, double x, double y, double z, float p_76986_8_, float partialTicks)
	{
		bindEntityTexture(entity);
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		
		GlStateManager.rotate(-entity.rotationYaw, 0, 1, 0);
		
		GlStateManager.pushMatrix();
		{
			model.renderBase(1F / 16F);
			
			for(int i = 0; i < model.numPropellers; i++)
			{
				GlStateManager.pushMatrix();
				GlStateManager.translate(model.propellerOrigins[i].x, model.propellerOrigins[i].y, model.propellerOrigins[i].z);
				GlStateManager.rotate((entity.ticksExisted + partialTicks) * (i % 2== 0 ? -80f :80f), 0f, 1f, 0f);
				GlStateManager.scale(2f,  2f, 2f);
				model.renderPropeller(1f / 16f);
				GlStateManager.popMatrix();
			}
		}
		GlStateManager.popMatrix();
			
		GlStateManager.pushMatrix();
		
		ItemStack stack = entity.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND);
		if(!stack.isEmpty())
		{
			model.itemOrigin = new Vector3f(0f, -0.5f, 0f);
			GlStateManager.translate(model.itemOrigin.x, model.itemOrigin.y, model.itemOrigin.z);
			GlStateManager.rotate(entity.rotationPitch, 0, 0, 1);
			
			Item item = stack.getItem();
			if(item instanceof ItemGun && ((ItemGun)item).GetType().model != null)
			{
				GunType gunType = ((ItemGun)item).GetType();
				ModelGun model = gunType.model;
				
				//GlStateManager.rotate(-90F, 0F, 0F, 1F);
				bindTexture(FlansModResourceHandler.getTexture(gunType));
				ClientProxy.gunRenderer.renderGun(stack, gunType, 1F / 16F, model, entity.animations, 0F);
			}
			else
			{
				GlStateManager.rotate(-135F, 0F, 0F, 1F);
				GlStateManager.translate(0F, -0.4F, 0F);
				
				IBakedModel ibakedmodel = renderItem.getItemModelMesher().getItemModel(stack);
				renderItem.renderItem(stack, ibakedmodel);
				
				GlStateManager.disableRescaleNormal();
			}
		}
		GlStateManager.popMatrix();
		
		GlStateManager.popMatrix();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySkullDrone entity)
	{
		return texture;
	}
		
	public static class Factory implements IRenderFactory<EntitySkullDrone>
	{
		@Override
		public Render<EntitySkullDrone> createRenderFor(RenderManager manager)
		{
			return new RenderSkullDrone(manager);
		}
	}
}
