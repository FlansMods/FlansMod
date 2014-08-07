package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelClaymore extends ModelBase 
{
	public ModelRendererTurbo[] claymoreModel;

	public ModelClaymore()
	{
		claymoreModel = new ModelRendererTurbo[2];
		claymoreModel[0] = new ModelRendererTurbo(this, 0, 0, 32, 16);
		claymoreModel[0].addBox(-1F, 2F, -4F, 2, 4, 8);
		claymoreModel[1] = new ModelRendererTurbo(this, 12, 4, 32, 16);
		claymoreModel[1].addBox(0F, -2F, -4F, 0, 4, 8);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(ModelRendererTurbo claymoreModelBit : claymoreModel)
			claymoreModelBit.render(f5);
	}
	
}
