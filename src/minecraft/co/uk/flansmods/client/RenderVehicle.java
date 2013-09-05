package co.uk.flansmods.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.model.ModelVehicle;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EntityVehicle;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import co.uk.flansmods.common.driveables.PilotGun;
import co.uk.flansmods.common.driveables.Propeller;
import co.uk.flansmods.common.driveables.VehicleType;

public class RenderVehicle extends Render
{
    public RenderVehicle()
    {
        shadowSize = 0.5F;
    }

    public void render(EntityVehicle vehicle, double d, double d1, double d2, float f, float f1)
    {
    	bindEntityTexture(vehicle);
    	VehicleType type = vehicle.getVehicleType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        float dYaw = (vehicle.axes.getYaw() - vehicle.prevRotationYaw);
        for(; dYaw > 180F; dYaw -= 360F) {}
        for(; dYaw <= -180F; dYaw += 360F) {}
        float dPitch = (vehicle.axes.getPitch() - vehicle.prevRotationPitch);
        for(; dPitch > 180F; dPitch -= 360F) {}
        for(; dPitch <= -180F; dPitch += 360F) {}
        float dRoll = (vehicle.axes.getRoll() - vehicle.prevRotationRoll);
        for(; dRoll > 180F; dRoll -= 360F) {}
        for(; dRoll <= -180F; dRoll += 360F) {}
        GL11.glRotatef(180F - vehicle.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(vehicle.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(vehicle.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
        ModelVehicle modVehicle = (ModelVehicle)type.model;
		if(modVehicle != null)
			modVehicle.render(vehicle, f1);
		
		GL11.glPushMatrix();
		if(type.barrelPosition != null && vehicle.isPartIntact(EnumDriveablePart.turret) && vehicle.seats != null && vehicle.seats[0] != null)
		{
    		float yaw = vehicle.seats[0].prevLooking.getYaw() + (vehicle.seats[0].looking.getYaw() - vehicle.seats[0].prevLooking.getYaw()) * f1;
    		
    		GL11.glTranslatef(type.barrelPosition.x, type.barrelPosition.y, type.barrelPosition.z);
			GL11.glRotatef(-yaw, 0.0F, 1.0F, 0.0F);
			GL11.glTranslatef(-type.barrelPosition.x, -type.barrelPosition.y, -type.barrelPosition.z);
			
			modVehicle.renderTurret(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, vehicle);
			
			if(FlansMod.DEBUG)
			{
				GL11.glColor4f(0F, 0F, 1F, 0.3F);
				for(PilotGun gun : type.guns)
				{		
					if(gun.driveablePart == EnumDriveablePart.turret)
						renderAABB(AxisAlignedBB.getBoundingBox((float)gun.position.x - 0.25F, (float)gun.position.y - 0.25F, (float)gun.position.z - 0.25F, (float)gun.position.x + 0.25F, (float)gun.position.y + 0.25F, (float)gun.position.z + 0.25F));
				}
			}
		}
		GL11.glPopMatrix();
		
		if(FlansMod.DEBUG)
		{
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glColor4f(1F, 0F, 0F, 0.3F);
			GL11.glScalef(1F, 1F, 1F);
			for(DriveablePart part : vehicle.parts.values())
			{
				if(part.box == null)
					continue;
				
				renderAABB(AxisAlignedBB.getBoundingBox((float)part.box.x / 16F, (float)part.box.y / 16F, (float)part.box.z / 16F, (float)(part.box.x + part.box.w) / 16F, (float)(part.box.y + part.box.h) / 16F, (float)(part.box.z + part.box.d) / 16F));
			}
			GL11.glColor4f(0F, 1F, 0F, 0.3F);
			if(type.barrelPosition != null)
				renderAABB(AxisAlignedBB.getBoundingBox(type.barrelPosition.x - 0.25F, type.barrelPosition.y - 0.25F, type.barrelPosition.z - 0.25F, type.barrelPosition.x + 0.25F, type.barrelPosition.y + 0.25F, type.barrelPosition.z + 0.25F));
			GL11.glColor4f(0F, 0F, 1F, 0.3F);
			for(PilotGun gun : type.guns)
			{				
				if(gun.driveablePart != EnumDriveablePart.turret)
					renderAABB(AxisAlignedBB.getBoundingBox((float)gun.position.x - 0.25F, (float)gun.position.y - 0.25F, (float)gun.position.z - 0.25F, (float)gun.position.x + 0.25F, (float)gun.position.y + 0.25F, (float)gun.position.z + 0.25F));
			}
			GL11.glColor4f(0F, 0F, 0F, 0.3F);	
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
		}
        GL11.glPopMatrix();
    }

    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
    {
        render((EntityVehicle)entity, d, d1, d2, f, f1);
    }
    
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityVehicle)entity).getVehicleType());
	}
}