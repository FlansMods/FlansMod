package co.uk.flansmods.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.client.model.ModelPlane;
import co.uk.flansmods.common.EntityBullet;
import co.uk.flansmods.common.EntityPlane;
import co.uk.flansmods.common.PlaneType;


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
        GL11.glRotatef(f + 90F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(entityPlane.prevRotationPitch + (entityPlane.axes.getPitch() - entityPlane.prevRotationPitch) * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(-entityPlane.prevRotationRoll - (entityPlane.axes.getRoll() - entityPlane.prevRotationRoll) * f1, 1.0F, 0.0F, 0.0F);
        ModelPlane modPlane = (ModelPlane)type.model;

		if(modPlane != null)
		{
			modPlane.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, entityPlane);
			/*
			if(modPlane.oldModel)
				GL11.glScalef(-1F, -1F, 1F);
			*/
		}
		
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