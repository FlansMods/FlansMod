package com.flansmod.client.model.mw;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelDeployableBag extends ModelBase 
{
	public ModelRendererTurbo[] bagModel;

	public ModelDeployableBag()
	{
		bagModel = new ModelRendererTurbo[2];
		bagModel[0] = new ModelRendererTurbo(this, 0, 0, 32, 32);
		bagModel[0].addShapeBox(-3F, 0F, -6F, 6, 6, 6, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ -0.5F, -1F, 0F, /* 7 */ -0.1F, -1F, 0F);	
		bagModel[1] = new ModelRendererTurbo(this, 0, 12, 32, 32);
		bagModel[1].addShapeBox(-3F, 0F, 0F, 6, 6, 6, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -0.1F, -1F, 0F, /* 5 */ -0.5F, -1F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	

	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(ModelRendererTurbo bagModelBit : bagModel)
			bagModelBit.render(f5);
	}
}
