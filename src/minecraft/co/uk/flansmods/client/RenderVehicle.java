package co.uk.flansmods.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.model.ModelVehicle;
import co.uk.flansmods.common.EntityPassengerSeat;
import co.uk.flansmods.common.EntityVehicle;
import co.uk.flansmods.common.VehicleType;

public class RenderVehicle extends Render
{
    public RenderVehicle()
    {
        shadowSize = 0.5F;
    }

    public void render(EntityVehicle vehicle, double d, double d1, double d2, float f, float f1)
    {
    	VehicleType type = vehicle.getVehicleType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f + 90F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(vehicle.prevRotationPitch + (vehicle.axes.getPitch() - vehicle.prevRotationPitch) * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(-vehicle.prevRotationRoll - (vehicle.axes.getRoll() - vehicle.prevRotationRoll) * f1, 1.0F, 0.0F, 0.0F);
        loadTexture("/skins/" + type.texture + ".png");
        ModelVehicle modVehicle = (ModelVehicle)type.model;
		if(modVehicle != null)
			modVehicle.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, vehicle);
		float gunYaw = 90F;
		float gunPitch = 0;
		GL11.glPushMatrix();
		if(modVehicle != null && modVehicle.gunModel.length > 0 && vehicle.data.guns[1] != null)
		{
			for(EntityPassengerSeat seat : vehicle.seats)
			{
				if(seat.gunnerID == 1 && seat.riddenByEntity != null)
				{
					gunYaw = -seat.riddenByEntity.rotationYaw - f + 90F; 
					gunPitch = seat.riddenByEntity.rotationPitch - vehicle.axes.getPitch();					
				}
			}
			for(; gunYaw > 90F; gunYaw -= 360F) {}
			for(; gunYaw <= -270F; gunYaw += 360F) {}
			if(gunYaw > type.gunYawMax - 90F)
				gunYaw = type.gunYawMax - 90F; 
			if(gunYaw < type.gunYawMin - 90F)
				gunYaw = type.gunYawMin - 90F;
			if(gunPitch < type.gunPitchMax)
				gunPitch = type.gunPitchMax;
			if(gunPitch > type.gunPitchMin)
				gunPitch = type.gunPitchMin;
			GL11.glTranslatef(modVehicle.gunModel[0].rotationPointX / 16F, modVehicle.gunModel[0].rotationPointY / 16F, modVehicle.gunModel[0].rotationPointZ / 16F);
			GL11.glRotatef(180F + gunYaw, 0.0F, 1.0F, 0.0F);
			GL11.glTranslatef(-modVehicle.gunModel[0].rotationPointX / 16F, -modVehicle.gunModel[0].rotationPointY / 16F, -modVehicle.gunModel[0].rotationPointZ / 16F);
			//Re-add this later
			//modVehicle.renderGun(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, vehicle, gunYaw, gunPitch);
		}
		GL11.glPopMatrix();
		if(modVehicle != null && modVehicle.barrelModel.length > 0 && type.hasTurret)
		{
			gunYaw = vehicle.gunYaw;
			gunPitch = vehicle.gunPitch;
			GL11.glTranslatef(modVehicle.turretModel[0].rotationPointX / 16F, modVehicle.turretModel[0].rotationPointY / 16F, modVehicle.turretModel[0].rotationPointZ / 16F);
			GL11.glRotatef(180F + gunYaw, 0.0F, 1.0F, 0.0F);
			GL11.glTranslatef(-modVehicle.turretModel[0].rotationPointX / 16F, -modVehicle.turretModel[0].rotationPointY / 16F, -modVehicle.turretModel[0].rotationPointZ / 16F);
			modVehicle.renderTurret(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, vehicle, gunYaw, gunPitch);
		}
        GL11.glPopMatrix();
    }

    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
    {
        render((EntityVehicle)entity, d, d1, d2, f, f1);
    }
}