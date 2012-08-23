package flansmod.client;

import net.minecraft.src.Entity;
import net.minecraft.src.Render;

import org.lwjgl.opengl.GL11;

import flansmod.common.EntityPlane;


public class RenderPlane extends Render
{
    public RenderPlane()
    {
        shadowSize = 0.5F;
    }

    public void func_157_a(EntityPlane entityPlane, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f + 90F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(entityPlane.prevRotationPitch + (entityPlane.axes.getPitch() - entityPlane.prevRotationPitch) * f1, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(-entityPlane.prevRotationRoll - (entityPlane.axes.getRoll() - entityPlane.prevRotationRoll) * f1, 1.0F, 0.0F, 0.0F);
        loadTexture("/skins/" + entityPlane.type.texture + ".png");
        ModelPlane modPlane = (ModelPlane)entityPlane.type.model;
		if(modPlane != null)
			modPlane.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, entityPlane);
        GL11.glPopMatrix();
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_157_a((EntityPlane)entity, d, d1, d2, f, f1);
    }
}