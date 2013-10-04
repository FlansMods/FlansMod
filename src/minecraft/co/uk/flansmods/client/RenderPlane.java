package co.uk.flansmods.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.model.ModelDriveable;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.PilotGun;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.driveables.Propeller;

public class RenderPlane extends Render
{	
    public RenderPlane()
    {
        shadowSize = 0.5F;
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
        ModelDriveable modPlane = type.model;
		if(modPlane != null)
		{
			modPlane.render(entityPlane, f1);
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
				
				renderAABB(AxisAlignedBB.getBoundingBox(part.box.x / 16F, part.box.y / 16F, part.box.z / 16F, (part.box.x + part.box.w) / 16F, (part.box.y + part.box.h) / 16F, (part.box.z + part.box.d) / 16F));
			}
			GL11.glColor4f(0F, 1F, 0F, 0.3F);
			for(Propeller prop : type.propellers)
			{				
				renderAABB(AxisAlignedBB.getBoundingBox(prop.x / 16F - 0.25F, prop.y / 16F - 0.25F, prop.z / 16F - 0.25F, prop.x / 16F + 0.25F, prop.y / 16F + 0.25F, prop.z / 16F + 0.25F));
			}
			GL11.glColor4f(0F, 0F, 1F, 0.3F);
			for(PilotGun gun : type.guns)
			{				
				renderAABB(AxisAlignedBB.getBoundingBox(gun.position.x - 0.25F, gun.position.y - 0.25F, gun.position.z - 0.25F, gun.position.x + 0.25F, gun.position.y + 0.25F, gun.position.z + 0.25F));
			}
			GL11.glColor4f(0F, 0F, 0F, 0.3F);	
			if(type.bombPosition != null)
				renderAABB(AxisAlignedBB.getBoundingBox(type.bombPosition.x - 0.25F, type.bombPosition.y - 0.25F, type.bombPosition.z - 0.25F, type.bombPosition.x + 0.25F, type.bombPosition.y + 0.25F, type.bombPosition.z + 0.25F));
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
		}
        GL11.glPopMatrix();
    }   

    @Override
	public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        render((EntityPlane)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityPlane)entity).getPlaneType());
	}
}