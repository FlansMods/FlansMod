package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.EntityGrenade;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderGrenade extends Render {

	public RenderGrenade()
	{
		shadowSize = 0.5F;
	}

	public void render(EntityGrenade grenade, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(grenade);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        if(grenade.stuck)
        {
	        GL11.glRotatef(180F - grenade.axes.getYaw(), 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(grenade.axes.getPitch(), 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(grenade.axes.getRoll(), 1.0F, 0.0F, 0.0F);
        }
        else
        {
	        float dYaw = (grenade.axes.getYaw() - grenade.prevRotationYaw);
	        for(; dYaw > 180F; dYaw -= 360F) {}
	        for(; dYaw <= -180F; dYaw += 360F) {}
	        float dPitch = (grenade.axes.getPitch() - grenade.prevRotationPitch);
	        for(; dPitch > 180F; dPitch -= 360F) {}
	        for(; dPitch <= -180F; dPitch += 360F) {}
	        float dRoll = (grenade.axes.getRoll() - grenade.prevRotationRoll);
	        for(; dRoll > 180F; dRoll -= 360F) {}
	        for(; dRoll <= -180F; dRoll += 360F) {}
	        GL11.glRotatef(180F - grenade.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(grenade.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(grenade.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
        }
		ModelBase model = grenade.type.model;
		model.render(grenade, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		render((EntityGrenade) entity, d, d1, d2, f, f1);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityGrenade)entity).type);
	}

}
