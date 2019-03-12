package com.flansmod.apocalypse.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.flansmod.apocalypse.common.entity.EntityNukeDrop;

public class RenderNukeDrop extends Render<EntityNukeDrop>
{
	private static final ResourceLocation texture = new ResourceLocation("flansmodapocalypse", "textures/entity/NukeDrop.png");
	private ModelNukeDrop model;
	
	public RenderNukeDrop(RenderManager rm)
	{
		super(rm);
		model = new ModelNukeDrop();
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public void render(EntityNukeDrop entity, double x, double y, double z, float p_76986_8_, float partialTicks)
	{
		bindEntityTexture(entity);
		
		EntityNukeDrop nuke = entity;
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, z);
		
		if(entity.onGround)
		{
			//Exploded
			float alpha = ((float)nuke.timeSinceExplosion / (float)EntityNukeDrop.explosionLength);
			alpha = 1F - alpha * alpha;
			alpha *= 0.5F;
			
			GlStateManager.enableAlpha();
			
			RenderHelper.disableStandardItemLighting();
			GlStateManager.shadeModel(7425);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(770, 1);
			GlStateManager.disableCull();
			
			GlStateManager.pushMatrix();
			float scale = 1F - 1F / ((float)nuke.timeSinceExplosion / 5F + 1);
			scale *= 100F * scale;
			GlStateManager.scale(-scale, scale, scale);
			
			GlStateManager.color(1F, 1F, 1F, alpha);
			
			model.renderBall(0.0625F);
			GlStateManager.popMatrix();
			
			
			GlStateManager.enableCull();
			GlStateManager.disableBlend();
			GlStateManager.shadeModel(7424);
			RenderHelper.enableStandardItemLighting();
		}
		else
		{
			//Falling
			model.renderNuke(0.0625F);
		}
		
		GlStateManager.popMatrix();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityNukeDrop entity)
	{
		return texture;
	}
	
	@SubscribeEvent
	public void renderWorld(RenderWorldLastEvent event)
	{
		//Get the world
		World world = Minecraft.getMinecraft().world;
		if(world == null)
			return;
		
		//Get the camera frustrum for clipping
		Entity camera = Minecraft.getMinecraft().getRenderViewEntity();
		double x = camera.lastTickPosX + (camera.posX - camera.lastTickPosX) * event.getPartialTicks();
		double y = camera.lastTickPosY + (camera.posY - camera.lastTickPosY) * event.getPartialTicks();
		double z = camera.lastTickPosZ + (camera.posZ - camera.lastTickPosZ) * event.getPartialTicks();
		
		//Frustum frustrum = new Frustum();
		//frustrum.setPosition(x, y, z);
		
		//Push
		GL11.glPushMatrix();
		//Setup lighting
		Minecraft.getMinecraft().entityRenderer.enableLightmap();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_BLEND);
		
		RenderHelper.enableStandardItemLighting();
		
		GL11.glTranslatef(-(float)x, -(float)y, -(float)z);
		for(Object entity : world.loadedEntityList)
		{
			if(entity instanceof EntityNukeDrop)
			{
				EntityNukeDrop nuke = (EntityNukeDrop)entity;
				int i = nuke.getBrightnessForRender();
				
				if(nuke.isBurning())
				{
					i = 15728880;
				}
				
				int j = i % 65536;
				int k = i / 65536;
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j / 1.0F, (float)k / 1.0F);
				GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
				render(nuke,
						nuke.prevPosX + (nuke.posX - nuke.prevPosX) * event.getPartialTicks(),
						nuke.prevPosY + (nuke.posY - nuke.prevPosY) * event.getPartialTicks(),
						nuke.prevPosZ + (nuke.posZ - nuke.prevPosZ) * event.getPartialTicks(), 0F, event.getPartialTicks());
			}
		}
		
		//Reset Lighting
		Minecraft.getMinecraft().entityRenderer.disableLightmap();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL11.GL_LIGHTING);
		//Pop
		GL11.glPopMatrix();
	}
}
