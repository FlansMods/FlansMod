package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.PilotGun;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.Propeller;

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
				
				renderAABB(AxisAlignedBB.getBoundingBox(part.box.x, part.box.y, part.box.z, (part.box.x + part.box.w), (part.box.y + part.box.h), (part.box.z + part.box.d)));
			}
			GL11.glColor4f(1F, 1F, 0F, 0.3F);
			for(Propeller prop : type.propellers)
			{				
				renderAABB(AxisAlignedBB.getBoundingBox(prop.x / 16F - 0.25F, prop.y / 16F - 0.25F, prop.z / 16F - 0.25F, prop.x / 16F + 0.25F, prop.y / 16F + 0.25F, prop.z / 16F + 0.25F));
			}
			
			//Render shoot points
			GL11.glColor4f(1F, 0F, 1F, 0.3F);
			for(DriveablePosition point : type.shootPointsPrimary)			
				renderAABB(AxisAlignedBB.getBoundingBox(point.position.x - 0.25F, point.position.y - 0.25F, point.position.z - 0.25F, point.position.x + 0.25F, point.position.y + 0.25F, point.position.z + 0.25F));
			
			GL11.glColor4f(0F, 1F, 0F, 0.3F);
			for(DriveablePosition point : type.shootPointsSecondary)			
				renderAABB(AxisAlignedBB.getBoundingBox(point.position.x - 0.25F, point.position.y - 0.25F, point.position.z - 0.25F, point.position.x + 0.25F, point.position.y + 0.25F, point.position.z + 0.25F));
			
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
