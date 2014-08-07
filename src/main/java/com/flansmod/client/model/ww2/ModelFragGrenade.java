package com.flansmod.client.model.ww2;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFragGrenade extends ModelBase 
{
	public ModelRendererTurbo headModel;
	public ModelRendererTurbo bodyModel;

	public ModelFragGrenade()
	{
		bodyModel = new ModelRendererTurbo(this, 0, 0, 16, 8);
		bodyModel.addBox(-1F, -1F, -1.5F, 2, 2, 3);
		headModel = new ModelRendererTurbo(this, 8, 0, 16, 8);
		headModel.addBox(-0.5F, -0.5F, 1F, 1, 1, 1);
		bodyModel.rotateAngleX = -3.14159265F / 2F;
		headModel.rotateAngleX = -3.14159265F / 2F;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		headModel.render(f5);
		bodyModel.render(f5);
	}
}
