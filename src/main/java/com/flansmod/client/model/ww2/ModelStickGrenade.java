package com.flansmod.client.model.ww2;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelStickGrenade extends ModelBase 
{
	public ModelRendererTurbo headModel;
	public ModelRendererTurbo stickModel;

	public ModelStickGrenade()
	{
		stickModel = new ModelRendererTurbo(this, 0, 0, 16, 8);
		stickModel.addBox(-0.5F, -0.5F, -3F, 1, 1, 4);
		headModel = new ModelRendererTurbo(this, 8, 0, 16, 8);
		headModel.addBox(-1F, -1F, 1F, 2, 2, 2);
		stickModel.rotateAngleX = -3.14159265F / 2F;
		headModel.rotateAngleX = -3.14159265F / 2F;
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		headModel.render(f5);
		stickModel.render(f5);
	}
}
