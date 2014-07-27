package com.flansmod.client.model.yeolde;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRock extends ModelBase 
{
	public ModelRendererTurbo rockModel;

	public ModelRock()
	{
		rockModel = new ModelRendererTurbo(this, 0, 0, 8, 8);
		rockModel.addBox(-1F, -1F, -1F, 2, 2, 2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		rockModel.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
}
