package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelC4 extends ModelBase 
{
	public ModelRendererTurbo[] c4Model;

	public ModelC4()
	{
		c4Model = new ModelRendererTurbo[2];
		c4Model[0] = new ModelRendererTurbo(this, 0, 0, 32, 8);
		c4Model[0].addBox(-2F, 0F, -3F, 4, 2, 6);
		c4Model[1] = new ModelRendererTurbo(this, 20, 0, 32, 8);
		c4Model[1].addBox(-1F, 1.5F, -2F, 2, 1, 4);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(ModelRendererTurbo mineModelBit : c4Model)
			mineModelBit.render(f5);
	}
	
}
