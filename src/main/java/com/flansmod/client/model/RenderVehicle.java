package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
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

import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.guns.Paintjob;

public class RenderVehicle extends Render<EntityVehicle> implements CustomItemRenderer
{
	public RenderVehicle(RenderManager renderManager)
	{
		super(renderManager);
		shadowSize = 0.5F;
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public void render(EntityVehicle vehicle, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(vehicle);
		VehicleType type = vehicle.getVehicleType();
		GlStateManager.pushMatrix();
		{
			GlStateManager.translate((float)d, (float)d1, (float)d2);
			float dYaw = (vehicle.axes.getYaw() - vehicle.prevRotationYaw);
			while(dYaw > 180F)
			{
				dYaw -= 360F;
			}
			while(dYaw <= -180F)
			{
				dYaw += 360F;
			}
			float dPitch = (vehicle.axes.getPitch() - vehicle.prevRotationPitch);
			while(dPitch > 180F)
			{
				dPitch -= 360F;
			}
			while(dPitch <= -180F)
			{
				dPitch += 360F;
			}
			float dRoll = (vehicle.axes.getRoll() - vehicle.prevRotationRoll);
			while(dRoll > 180F)
			{
				dRoll -= 360F;
			}
			while(dRoll <= -180F)
			{
				dRoll += 360F;
			}
			GlStateManager.rotate(180F - vehicle.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
			GlStateManager.rotate(vehicle.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
			GlStateManager.rotate(vehicle.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
			GlStateManager.rotate(180F, 0.0F, 1.0F, 0.0F);
			
			float modelScale = type.modelScale;
			GlStateManager.pushMatrix();
			{
				float recoilDPos = (float)Math.sin(Math.toRadians(vehicle.recoilPos)) -
					(float)Math.sin(Math.toRadians(vehicle.lastRecoilPos));
				float recoilPos = (float)Math.sin(Math.toRadians(vehicle.lastRecoilPos)) + recoilDPos * f1;
				
				GlStateManager.scale(modelScale, modelScale, modelScale);
				ModelVehicle modVehicle = (ModelVehicle)type.model;
				if(modVehicle != null)
					modVehicle.render(vehicle, f1);
				
				for(int i = 0; i < vehicle.trackLinksLeft.length; i++)
				{
					AnimTrackLink link = vehicle.trackLinksLeft[i];
					float rotZ = link.zRot;
					GlStateManager.pushMatrix();
					GlStateManager.translate(link.position.x / 16F, link.position.y / 16F, link.position.z / 16F);
					for(; rotZ > 180F; rotZ -= 360F)
					{
					}
					for(; rotZ <= -180F; rotZ += 360F)
					{
					}
					GlStateManager.rotate(rotZ * (float)(180 / Math.PI), 0, 0, 1);
					modVehicle.renderFancyTracks(vehicle, f1);
					GlStateManager.popMatrix();
				}
				
				for(int i = 0; i < vehicle.trackLinksRight.length; i++)
				{
					AnimTrackLink link = vehicle.trackLinksRight[i];
					float rotZ = link.zRot;
					for(; rotZ > 180F; rotZ -= 360F)
					{
					}
					for(; rotZ <= -180F; rotZ += 360F)
					{
					}
					GlStateManager.pushMatrix();
					GlStateManager.translate(link.position.x / 16F, link.position.y / 16F, link.position.z / 16F);
					GlStateManager.rotate(rotZ * (float)(180 / Math.PI), 0, 0, 1);
					modVehicle.renderFancyTracks(vehicle, f1);
					GlStateManager.popMatrix();
				}
				
				GlStateManager.pushMatrix();
				if(type.turretOrigin != null && vehicle.isPartIntact(EnumDriveablePart.turret) &&
					vehicle.getSeat(0) != null)
				{
					dYaw = (vehicle.getSeat(0).looking.getYaw() - vehicle.getSeat(0).prevLooking.getYaw());
					while(dYaw > 180F)
					{
						dYaw -= 360F;
					}
					while(dYaw <= -180F)
					{
						dYaw += 360F;
					}
					float yaw = vehicle.getSeat(0).prevLooking.getYaw() + dYaw * f1;
					
					GlStateManager.translate(type.turretOrigin.x, type.turretOrigin.y, type.turretOrigin.z);
					GlStateManager.rotate(-yaw, 0.0F, 1.0F, 0.0F);
					GlStateManager.translate(-type.turretOrigin.x, -type.turretOrigin.y, -type.turretOrigin.z);
					
					if(modVehicle != null)
						modVehicle.renderTurret(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, vehicle, f1);
					
					//rotate and render barrel
					if(modVehicle != null)
					{
						EntitySeat[] seats = vehicle.getSeats();
						GlStateManager.translate(modVehicle.barrelAttach.x,
							modVehicle.barrelAttach.y,
							-modVehicle.barrelAttach.z);
						float bPitch = (seats[0].looking.getPitch() - seats[0].prevLooking.getPitch());
						float aPitch = seats[0].prevLooking.getPitch() + bPitch * f1;
						
						GlStateManager.rotate(-aPitch, 0F, 0F, 1F);
						GlStateManager.translate(recoilPos * -(5F / 16F), 0F, 0F);
						modVehicle.renderAnimBarrel(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, vehicle, f1);
					}
					
					if(FlansMod.DEBUG)
					{
						GlStateManager.translate(type.turretOrigin.x, type.turretOrigin.y, type.turretOrigin.z);
						GlStateManager.rotate(-vehicle.getSeat(0).looking.getPitch(), 0.0F, 0.0F, 1.0F);
						GlStateManager.translate(-type.turretOrigin.x, -type.turretOrigin.y, -type.turretOrigin.z);
						
						//Render shoot points
						GlStateManager.color(0F, 0F, 1F, 0.3F);
						for(ShootPoint point : type.shootPointsPrimary)
						{
							DriveablePosition driveablePosition = point.rootPos;
							if(driveablePosition.part == EnumDriveablePart.turret)
							{
								renderOffsetAABB(new AxisAlignedBB(
										driveablePosition.position.x - 0.25F,
										driveablePosition.position.y - 0.25F,
										driveablePosition.position.z - 0.25F,
										driveablePosition.position.x + 0.25F,
										driveablePosition.position.y + 0.25F,
										driveablePosition.position.z + 0.25F),
									0, 0, 0);
							}
						}
						
						GlStateManager.color(0F, 1F, 0F, 0.3F);
						for(ShootPoint point : type.shootPointsSecondary)
						{
							DriveablePosition driveablePosition = point.rootPos;
							if(driveablePosition.part == EnumDriveablePart.turret)
								renderOffsetAABB(new AxisAlignedBB(
										driveablePosition.position.x - 0.25F,
										driveablePosition.position.y - 0.25F,
										driveablePosition.position.z - 0.25F,
										driveablePosition.position.x + 0.25F,
										driveablePosition.position.y + 0.25F,
										driveablePosition.position.z + 0.25F),
									0, 0, 0);
						}
					}
				}
				GlStateManager.popMatrix();
				if(modVehicle != null)
				{
					GlStateManager.pushMatrix();
					
					GlStateManager.translate(modVehicle.drillHeadOrigin.x, modVehicle.drillHeadOrigin.y,
						modVehicle.drillHeadOrigin.z);
					GlStateManager.rotate(vehicle.harvesterAngle * 50F, 1.0F, 0.0F, 0.0F);
					GlStateManager.translate(-modVehicle.drillHeadOrigin.x, -modVehicle.drillHeadOrigin.y,
						-modVehicle.drillHeadOrigin.z);
					modVehicle.renderDrillBit(vehicle, f1);
					
					GlStateManager.popMatrix();
				}
			}
			GlStateManager.popMatrix();
			
			if(FlansMod.DEBUG)
			{
				GlStateManager.disableTexture2D();
				GlStateManager.enableBlend();
				GlStateManager.disableDepth();
				GlStateManager.color(1F, 0F, 0F, 0.3F);
				GlStateManager.scale(1F, 1F, 1F);
				for(DriveablePart part : vehicle.getDriveableData().parts.values())
				{
					if(part.box == null)
						continue;
					
					renderOffsetAABB(new AxisAlignedBB(part.box.x, part.box.y, part.box.z, (part.box.x + part.box.w),
						(part.box.y + part.box.h), (part.box.z + part.box.d)), 0, 0, 0);
				}
				
				// Render shoot points
				GlStateManager.color(0F, 0F, 1F, 0.3F);
				for(ShootPoint point : type.shootPointsPrimary)
				{
					DriveablePosition driveablePosition = point.rootPos;
					if(driveablePosition.part != EnumDriveablePart.turret)
					{
						renderOffsetAABB(new AxisAlignedBB(
								driveablePosition.position.x - 0.25F,
								driveablePosition.position.y - 0.25F,
								driveablePosition.position.z - 0.25F,
								driveablePosition.position.x + 0.25F,
								driveablePosition.position.y + 0.25F,
								driveablePosition.position.z + 0.25F),
							0, 0, 0);
					}
				}
				
				GlStateManager.color(0F, 1F, 0F, 0.3F);
				for(ShootPoint point : type.shootPointsSecondary)
				{
					DriveablePosition driveablePosition = point.rootPos;
					if(driveablePosition.part != EnumDriveablePart.turret)
						renderOffsetAABB(new AxisAlignedBB(
								driveablePosition.position.x - 0.25F,
								driveablePosition.position.y - 0.25F,
								driveablePosition.position.z - 0.25F,
								driveablePosition.position.x + 0.25F,
								driveablePosition.position.y + 0.25F,
								driveablePosition.position.z + 0.25F),
							0, 0, 0);
				}
				
				GlStateManager.enableTexture2D();
				GlStateManager.enableDepth();
				GlStateManager.disableBlend();
				GlStateManager.color(1F, 1F, 1F, 1F);
			}
		}
		GlStateManager.popMatrix();
	}
	
	@Override
	public void doRender(EntityVehicle entity, double d, double d1, double d2, float f, float f1)
	{
		//render((EntityVehicle)entity, d, d1, d2, f, f1);
		//The Vehicle is rendered by the renderWorld Method
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityVehicle entity)
	{
		DriveableType type = entity.getDriveableType();
		Paintjob paintjob = type.getPaintjob(entity.getDriveableData().paintjobID);
		return FlansModResourceHandler.getPaintjobTexture(paintjob);
	}
	
	@Override
	public void renderItem(CustomItemRenderType type, EnumHand hand, ItemStack item, Object... data)
	{
		GlStateManager.pushMatrix();
		if(item != null && item.getItem() instanceof ItemVehicle)
		{
			VehicleType vehicleType = ((ItemVehicle)item.getItem()).type;
			if(vehicleType.model != null)
			{
				float scale = 1F;
				switch(type)
				{
					case ENTITY:
					{
						scale = 1.5F;
						break;
					}
					case INVENTORY:
					{
						scale = 0.70F;
						GlStateManager.translate(0F, -0.05F, 0F);
						break;
					}
					case EQUIPPED:
					{
						GlStateManager.rotate(0F, 0F, 0F, 1F);
						GlStateManager.rotate(270F, 1F, 0F, 0F);
						GlStateManager.rotate(270F, 0F, 1F, 0F);
						GlStateManager.translate(0F, 0.25F, 0F);
						scale = 0.5F;
						break;
					}
					case EQUIPPED_FIRST_PERSON:
					{
						if(hand == EnumHand.MAIN_HAND)
						{
							GlStateManager.rotate(45F, 0F, 1F, 0F);
							GlStateManager.translate(-0.5F, 0.5F, -0.5F);
						}
						else
						{
							GlStateManager.rotate(45F, 0F, 1F, 0F);
							GlStateManager.translate(-0.5F, 0.5F, -2.3F);
						}
						
						break;
					}
					default:
						break;
				}
				
				GlStateManager.scale(scale / vehicleType.cameraDistance, scale / vehicleType.cameraDistance,
					scale / vehicleType.cameraDistance);
				Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(vehicleType));
				ModelDriveable model = vehicleType.model;
				model.render(vehicleType);
			}
		}
		GlStateManager.popMatrix();
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
		GlStateManager.pushMatrix();
		//Setup lighting
		Minecraft.getMinecraft().entityRenderer.enableLightmap();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.enableLighting();
		GlStateManager.enableLighting();
		GlStateManager.disableBlend();
		
		RenderHelper.enableStandardItemLighting();
		
		GlStateManager.translate(-(float)x, -(float)y, -(float)z);
		for(Object entity : world.loadedEntityList)
		{
			if(entity instanceof EntityVehicle)
			{
				EntityVehicle vehicle = (EntityVehicle)entity;
				int i = vehicle.getBrightnessForRender();
				
				if(vehicle.isBurning())
				{
					i = 15728880;
				}
				
				int j = i % 65536;
				int k = i / 65536;
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j / 1.0F, (float)k / 1.0F);
				GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
				render(vehicle,
					vehicle.prevPosX + (vehicle.posX - vehicle.prevPosX) * event.getPartialTicks(),
					vehicle.prevPosY + (vehicle.posY - vehicle.prevPosY) * event.getPartialTicks(),
					vehicle.prevPosZ + (vehicle.posZ - vehicle.prevPosZ) * event.getPartialTicks(),
					0F,
					event.getPartialTicks());
			}
		}
		
		//Reset Lighting
		Minecraft.getMinecraft().entityRenderer.disableLightmap();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.disableLighting();
		//Pop
		GlStateManager.popMatrix();
	}
	
	public static class Factory implements IRenderFactory<EntityVehicle>
	{
		@Override
		public Render<EntityVehicle> createRenderFor(RenderManager manager)
		{
			return new RenderVehicle(manager);
		}
	}
}
