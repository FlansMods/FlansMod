package co.uk.flansmods.client;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.model.ModelPlane;
import co.uk.flansmods.common.EntityBullet;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.PlaneType;


public class RenderPlane extends Render
{
    public RenderPlane()
    {
        shadowSize = 0.5F;
    }

    public void render(EntityPlane entityPlane, double d, double d1, double d2, float f, float f1)
    {
    	func_110777_b(entityPlane);
    	PlaneType type = entityPlane.getPlaneType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        //FloatBuffer buffer = ByteBuffer.allocateDirect(16 * 16).order(ByteOrder.nativeOrder()).asFloatBuffer();
        //buffer.clear();
        //entityPlane.axes.getMatrix().store(buffer);
        //buffer.flip();
        //GL11.glScalef(-1F, 1F, 1F);
        //GL11.glMultMatrix(buffer);
        //GL11.glScalef(-1F, 1F, 1F);
        //GL11.glRotatef(90F, 0F, 1F, 0F);
        //GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, buffer);
        //GL11.glRotatef(-f + 90F, 0.0F, 1.0F, 0.0F);
        
        
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
        GL11.glRotatef(entityPlane.prevRotationPitch - dPitch * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(entityPlane.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
        ModelPlane modPlane = (ModelPlane)type.model;
		if(modPlane != null)
		{
			modPlane.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, entityPlane);
		}
        
		/*
        ModelPlane modPlane = (ModelPlane)type.model;
		if(modPlane != null)
		{
	        GL11.glPushMatrix();
	        GL11.glRotatef(entityPlane.axes.getYaw(), 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(entityPlane.axes.getPitch(), 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(entityPlane.axes.getRoll(), 1.0F, 0.0F, 0.0F);
			modPlane.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, entityPlane);
			GL11.glPopMatrix();
			
			GL11.glRotatef(entityPlane.prevRotationYaw, 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(entityPlane.prevRotationPitch, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(entityPlane.prevRotationRoll, 1.0F, 0.0F, 0.0F);
			modPlane.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, entityPlane);
		}
		*/
        GL11.glPopMatrix();
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        render((EntityPlane)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityPlane)entity).getPlaneType());
	}
}