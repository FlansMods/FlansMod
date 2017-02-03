package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.Propeller;
import com.flansmod.common.guns.Paintjob;

public class RenderPlane extends Render
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
		for(; dYaw > 180F; dYaw -= 360F) {}
		for(; dYaw <= -180F; dYaw += 360F) {}
		float dPitch = (entityPlane.axes.getPitch() - entityPlane.prevRotationPitch);
		for(; dPitch > 180F; dPitch -= 360F) {}
		for(; dPitch <= -180F; dPitch += 360F) {}
		float dRoll = (entityPlane.axes.getRoll() - entityPlane.prevRotationRoll);
		for(; dRoll > 180F; dRoll -= 360F) {}
		for(; dRoll <= -180F; dRoll += 360F) {}
		GL11.glRotatef(180F - entityPlane.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(entityPlane.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(entityPlane.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);

		float modelScale = type.modelScale;
		GL11.glScalef(modelScale, modelScale, modelScale);
		ModelPlane model = (ModelPlane)type.model;
		if(model != null)
		{
			model.render(entityPlane, f1);
			//Render heli main rotors
			for(int i = 0; i < model.heliMainRotorModels.length; i++)
			{
				GL11.glPushMatrix();
				GL11.glTranslatef(model.heliMainRotorOrigins[i].x, model.heliMainRotorOrigins[i].y, model.heliMainRotorOrigins[i].z);
				GL11.glRotatef((entityPlane.propAngle + f1 * entityPlane.throttle / 7F) * model.heliRotorSpeeds[i] * 1440F / 3.14159265F, 0.0F, 1.0F, 0.0F);
				GL11.glTranslatef(-model.heliMainRotorOrigins[i].x, -model.heliMainRotorOrigins[i].y, -model.heliMainRotorOrigins[i].z);
				model.renderRotor(entityPlane, 0.0625F, i);
				GL11.glPopMatrix();
			}
			//Render heli tail rotors
			for(int i = 0; i < model.heliTailRotorModels.length; i++)
			{
				GL11.glPushMatrix();
				GL11.glTranslatef(model.heliTailRotorOrigins[i].x, model.heliTailRotorOrigins[i].y, model.heliTailRotorOrigins[i].z);
				GL11.glRotatef((entityPlane.propAngle + f1 * entityPlane.throttle / 7F) * 1440F / 3.14159265F, 0.0F, 0.0F, 1.0F);
				GL11.glTranslatef(-model.heliTailRotorOrigins[i].x, -model.heliTailRotorOrigins[i].y, -model.heliTailRotorOrigins[i].z);
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
				
				renderOffsetAABB(new AxisAlignedBB(part.box.x, part.box.y, part.box.z, (part.box.x + part.box.w), (part.box.y + part.box.h), (part.box.z + part.box.d)), 0, 0, 0);
			}
			GL11.glColor4f(1F, 1F, 0F, 0.3F);
			for(Propeller prop : type.propellers)
			{				
				renderOffsetAABB(new AxisAlignedBB(prop.x / 16F - 0.25F, prop.y / 16F - 0.25F, prop.z / 16F - 0.25F, prop.x / 16F + 0.25F, prop.y / 16F + 0.25F, prop.z / 16F + 0.25F), 0, 0, 0);
			}
			
			//Render shoot points
			GL11.glColor4f(1F, 0F, 1F, 0.3F);
			for(DriveablePosition point : type.shootPointsPrimary)			
				renderOffsetAABB(new AxisAlignedBB(point.position.x - 0.25F, point.position.y - 0.25F, point.position.z - 0.25F, point.position.x + 0.25F, point.position.y + 0.25F, point.position.z + 0.25F), 0, 0, 0);
			
			GL11.glColor4f(0F, 1F, 0F, 0.3F);
			for(DriveablePosition point : type.shootPointsSecondary)			
				renderOffsetAABB(new AxisAlignedBB(point.position.x - 0.25F, point.position.y - 0.25F, point.position.z - 0.25F, point.position.x + 0.25F, point.position.y + 0.25F, point.position.z + 0.25F), 0, 0, 0);
			
			//GL11.glColor4f(0F, 0F, 0F, 0.3F);	
			//if(type.bombPosition != null)
			//	renderAABB(AxisAlignedBB.getBoundingBox(type.bombPosition.x - 0.25F, type.bombPosition.y - 0.25F, type.bombPosition.z - 0.25F, type.bombPosition.x + 0.25F, type.bombPosition.y + 0.25F, type.bombPosition.z + 0.25F));
			
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
		}
		GL11.glPopMatrix();
	}

	@Override
    public boolean shouldRender(Entity entity, ICamera camera, double camX, double camY, double camZ)
    {
        return true;
    }
    
	@Override
	public void doRender(Entity entity, double d, double d1, double d2, 
			float f, float f1)
	{
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		DriveableType type = ((EntityDriveable)entity).getDriveableType();
		Paintjob paintjob = type.getPaintjob(((EntityDriveable)entity).getDriveableData().paintjobID);
		return FlansModResourceHandler.getPaintjobTexture(paintjob);
	}
	
	@SubscribeEvent
	public void renderWorld(RenderWorldLastEvent event)
	{
		//Get the world
		World world = Minecraft.getMinecraft().theWorld;
		if(world == null)
			return;

		//Get the camera frustrum for clipping
        Entity camera = Minecraft.getMinecraft().getRenderViewEntity();
        double x = camera.lastTickPosX + (camera.posX - camera.lastTickPosX) * event.partialTicks;
        double y = camera.lastTickPosY + (camera.posY - camera.lastTickPosY) * event.partialTicks;
        double z = camera.lastTickPosZ + (camera.posZ - camera.lastTickPosZ) * event.partialTicks;
        
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
		        int i = plane.getBrightnessForRender(event.partialTicks);

		        if (plane.isBurning())
		        {
		            i = 15728880;
		        }

		        int j = i % 65536;
		        int k = i / 65536;
		        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j / 1.0F, (float)k / 1.0F);
		        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		        render(plane, plane.prevPosX + (plane.posX - plane.prevPosX) * event.partialTicks, plane.prevPosY + (plane.posY - plane.prevPosY) * event.partialTicks, plane.prevPosZ + (plane.posZ - plane.prevPosZ) * event.partialTicks, 0F, event.partialTicks);
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
