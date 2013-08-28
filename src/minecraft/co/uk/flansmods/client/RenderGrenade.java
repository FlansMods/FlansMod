package co.uk.flansmods.client;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.guns.EntityBullet;
import co.uk.flansmods.common.guns.EntityGrenade;
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
		func_110777_b(grenade);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d, (float) d1, (float) d2);
		GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(90F -grenade.prevRotationPitch - (grenade.rotationPitch - grenade.prevRotationPitch) * f1, 1.0F, 0.0F, 0.0F);
		ModelBase model = (ModelBase) grenade.type.model;
		model.render(grenade, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		render((EntityGrenade) entity, d, d1, d2, f, f1);
	}
	
	@Override
	protected ResourceLocation func_110775_a(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityGrenade)entity).type);
	}

}
