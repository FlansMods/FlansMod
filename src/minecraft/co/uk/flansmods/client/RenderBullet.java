package co.uk.flansmods.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.EntityAAGun;
import co.uk.flansmods.common.EntityBullet;


public class RenderBullet extends Render
{
	public RenderBullet()
	{
		shadowSize = 0.5F;
	}

	public void render(EntityBullet bullet, double d, double d1, double d2, float f, float f1)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d, (float) d1, (float) d2);
		GL11.glRotatef(f + 90F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(bullet.prevRotationPitch + (bullet.rotationPitch - bullet.prevRotationPitch) * f1, 1.0F, 0.0F, 0.0F);
		ModelBase model = (ModelBase) bullet.type.model;
		model.render(bullet, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		render((EntityBullet) entity, d, d1, d2, f, f1);
	}
	
	@Override
	protected ResourceLocation func_110775_a(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityBullet)entity).type);
	}
}
