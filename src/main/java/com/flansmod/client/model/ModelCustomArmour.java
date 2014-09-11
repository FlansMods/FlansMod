package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;

public class ModelCustomArmour extends ModelBiped 
{
	public ModelRendererTurbo[] headModel;
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{ 
		//super.render(entity, f, f1, f2, f3, f4, f5); 
		setRotationAngles(f, f1, f2, f3, f4, f5, entity); 
		for(ModelRendererTurbo mod : headModel)
		{
			mod.rotateAngleX = bipedHead.rotateAngleX;
			mod.rotateAngleY = bipedHead.rotateAngleY;
			mod.rotateAngleZ = bipedHead.rotateAngleZ;
			mod.render(f5);
		}
	} 
	
	
}
