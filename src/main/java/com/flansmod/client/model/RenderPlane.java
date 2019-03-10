package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.Propeller;
import com.flansmod.common.guns.Paintjob;

public class RenderPlane extends Render<EntityPlane> implements CustomItemRenderer
{
	public RenderPlane(RenderManager renderManager)
	{
		super(renderManager);
		shadowSize = 0.5F;
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public void render(EntityPlane entityPlane, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(entityPlane);
		PlaneType type = entityPlane.getPlaneType();
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d, (float)d1, (float)d2);
		float dYaw = (entityPlane.axes.getYaw() - entityPlane.prevRotationYaw);
		while(dYaw > 180F)
		{
			dYaw -= 360F;
		}
		while(dYaw <= -180F)
		{
			dYaw += 360F;
		}
		float dPitch = (entityPlane.axes.getPitch() - entityPlane.prevRotationPitch);
		while(dPitch > 180F)
		{
			dPitch -= 360F;
		}
		while(dPitch <= -180F)
		{
			dPitch += 360F;
		}
		float dRoll = (entityPlane.axes.getRoll() - entityPlane.prevRotationRoll);
		while(dRoll > 180F)
		{
			dRoll -= 360F;
		}
		while(dRoll <= -180F)
		{
			dRoll += 360F;
		}
		GL11.glRotatef(180F - entityPlane.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(entityPlane.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(entityPlane.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
		
		float modelScale = type.modelScale;
		GL11.glScalef(modelScale, modelScale, modelScale);
		ModelPlane model = (ModelPlane)type.model;
		if(model != null)
		{
			model.render(entityPlane, f1);
			// Render helicopter main rotors
			for(int i = 0; i < model.heliMainRotorModels.length; i++)
			{
				GL11.glPushMatrix();
				GL11.glTranslatef(model.heliMainRotorOrigins[i].x, model.heliMainRotorOrigins[i].y,
						model.heliMainRotorOrigins[i].z);
				GL11.glRotatef(
						(entityPlane.propAngle + f1 * entityPlane.throttle / 7F) * model.heliRotorSpeeds[i] * 1440F /
								3.14159265F, 0.0F, 1.0F, 0.0F);
				GL11.glTranslatef(-model.heliMainRotorOrigins[i].x, -model.heliMainRotorOrigins[i].y,
						-model.heliMainRotorOrigins[i].z);
				model.renderRotor(entityPlane, 0.0625F, i);
				GL11.glPopMatrix();
			}
			// Render helicopter tail rotors
			for(int i = 0; i < model.heliTailRotorModels.length; i++)
			{
				GL11.glPushMatrix();
				GL11.glTranslatef(model.heliTailRotorOrigins[i].x, model.heliTailRotorOrigins[i].y,
						model.heliTailRotorOrigins[i].z);
				GL11.glRotatef((entityPlane.propAngle + f1 * entityPlane.throttle / 7F) * 1440F / 3.14159265F, 0.0F,
						0.0F, 1.0F);
				GL11.glTranslatef(-model.heliTailRotorOrigins[i].x, -model.heliTailRotorOrigins[i].y,
						-model.heliTailRotorOrigins[i].z);
				model.renderTailRotor(entityPlane, 0.0625F, i);
				GL11.glPopMatrix();
			}
		}
		
		if(FlansMod.DEBUG)
		{
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glColor4f(1F, 0F, 0F, 0.3F);
			GL11.glScalef(-1F, 1F, -1F);
			for(DriveablePart part : entityPlane.getDriveableData().parts.values())
			{
				if(part.box == null)
					continue;
				
				GL11.glColor4f(1F, entityPlane.isPartIntact(part.type) ? 1F : 0F, 0F, 0.3F);
				
				renderOffsetAABB(new AxisAlignedBB(part.box.x, part.box.y, part.box.z, (part.box.x + part.box.w),
						(part.box.y + part.box.h), (part.box.z + part.box.d)), 0, 0, 0);
			}
			GL11.glColor4f(1F, 1F, 0F, 0.3F);
			for(Propeller prop : type.propellers)
			{
				renderOffsetAABB(new AxisAlignedBB(prop.x / 16F - 0.25F, prop.y / 16F - 0.25F, prop.z / 16F - 0.25F,
						prop.x / 16F + 0.25F, prop.y / 16F + 0.25F, prop.z / 16F + 0.25F), 0, 0, 0);
			}
			
			// Render shoot points
			GL11.glColor4f(1F, 0F, 1F, 0.3F);
			for(DriveablePosition point : type.shootPointsPrimary)
			{
				renderOffsetAABB(
						new AxisAlignedBB(point.position.x - 0.25F, point.position.y - 0.25F, point.position.z - 0.25F,
								point.position.x + 0.25F, point.position.y + 0.25F, point.position.z + 0.25F), 0, 0, 0);
			}
			
			GL11.glColor4f(0F, 1F, 0F, 0.3F);
			for(DriveablePosition point : type.shootPointsSecondary)
			{
				renderOffsetAABB(
						new AxisAlignedBB(point.position.x - 0.25F, point.position.y - 0.25F, point.position.z - 0.25F,
								point.position.x + 0.25F, point.position.y + 0.25F, point.position.z + 0.25F), 0, 0, 0);
			}
			
			
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
		}
		GL11.glPopMatrix();
	}
	
	@Override
	public boolean shouldRender(EntityPlane entity, ICamera camera, double camX, double camY, double camZ)
	{
		return true;
	}
	
	@Override
	public void doRender(EntityPlane entity, double d, double d1, double d2, float f, float f1)
	{
		//The plane is rendered by the renderWorld Method
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityPlane entity)
	{
		DriveableType type = entity.getDriveableType();
		Paintjob paintjob = type.getPaintjob(entity.getDriveableData().paintjobID);
		return FlansModResourceHandler.getPaintjobTexture(paintjob);
	}
	
	@SubscribeEvent(priority = EventPriority.LOWEST)
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
			if(entity instanceof EntityPlane)
			{
				EntityPlane plane = (EntityPlane)entity;
				int i = plane.getBrightnessForRender();
				
				if(plane.isBurning())
				{
					i = 15728880;
				}
				
				int j = i % 65536;
				int k = i / 65536;
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j / 1.0F, (float)k / 1.0F);
				GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
				render(plane,
						plane.prevPosX + (plane.posX - plane.prevPosX) * event.getPartialTicks(),
						plane.prevPosY + (plane.posY - plane.prevPosY) * event.getPartialTicks(),
						plane.prevPosZ + (plane.posZ - plane.prevPosZ) * event.getPartialTicks(),
						0F,
						event.getPartialTicks());
			}
		}
		
		//Reset Lighting
		Minecraft.getMinecraft().entityRenderer.disableLightmap();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL11.GL_LIGHTING);
		//Pop
		GL11.glPopMatrix();
	}
	
	@Override
	public void renderItem(CustomItemRenderType type, EnumHand hand, ItemStack item, Object... data)
	{
		GL11.glPushMatrix();
		if(item != null && item.getItem() instanceof ItemPlane)
		{
			PlaneType planeType = ((ItemPlane)item.getItem()).type;
			if(planeType.model != null)
			{
				float scale = 0.5F;
				switch(type)
				{
					case INVENTORY:
					{
						GL11.glRotatef(180F, 0F, 1F, 0F);
						scale = 1.0F;
						break;
					}
					case ENTITY:
					{
						scale = 1.5F;
						break;
					}
					case EQUIPPED:
					{
						GL11.glRotatef(0F, 0F, 0F, 1F);
						GL11.glRotatef(270F, 1F, 0F, 0F);
						GL11.glRotatef(270F, 0F, 1F, 0F);
						GL11.glTranslatef(0F, 0.25F, 0F);
						scale = 0.5F;
						break;
					}
					case EQUIPPED_FIRST_PERSON:
					{
						if(hand == EnumHand.MAIN_HAND)
						{
							GL11.glRotatef(45F, 0F, 1F, 0F);
							GL11.glTranslatef(-0.5F, 0.5F, -0.5F);
							GL11.glRotatef(180F, 0F, 1F, 0F);
						}
						else
						{
							GL11.glRotatef(45F, 0F, 1F, 0F);
							GL11.glTranslatef(-0.5F, 0.5F, -2.3F);
							GL11.glRotatef(180F, 0F, 1F, 0F);
						}
						scale = 1F;
						break;
					}
					default:
						break;
				}
				
				GL11.glScalef(scale / planeType.cameraDistance, scale / planeType.cameraDistance,
						scale / planeType.cameraDistance);
				Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(planeType));
				ModelDriveable model = planeType.model;
				model.render(planeType);
			}
		}
		GL11.glPopMatrix();
	}
	
	public static class Factory implements IRenderFactory<EntityPlane>
	{
		@Override
		public Render<EntityPlane> createRenderFor(RenderManager manager)
		{
			return new RenderPlane(manager);
		}
	}
}
