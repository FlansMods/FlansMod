package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.EntityAAGun;


public class RenderAAGun extends Render
{
	public RenderAAGun()
	{
		shadowSize = 0.5F;
	}

	public void render(EntityAAGun aa, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(aa);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d, (float) d1, (float) d2);
		GL11.glScalef(1F, 1F, 1.0F);
		
		float dYaw = aa.gunYaw - aa.prevGunYaw;
		for(; dYaw > 180F; dYaw -= 360F) {}
		for(; dYaw <= -180F; dYaw += 360F) {}
		
		ModelAAGun modelAAGun = aa.type.model;
		if(modelAAGun != null)
		{
			modelAAGun.renderBase(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, aa);
			GL11.glRotatef(180F - (aa.prevGunYaw + dYaw * f1), 0.0F, 1.0F, 0.0F);
			modelAAGun.renderGun(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, aa);
		}
		GL11.glPopMatrix();
	}

	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		render((EntityAAGun) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityAAGun)entity).type);
	}
}
