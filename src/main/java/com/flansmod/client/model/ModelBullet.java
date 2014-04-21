package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBullet extends ModelBase
{
	public ModelRenderer bulletModel;

	public ModelBullet()
	{
		bulletModel = new ModelRenderer(this, 0, 0);
		bulletModel.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		bulletModel.render(f5);
	}
}
