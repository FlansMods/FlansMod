package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCustomArmour extends ModelBiped 
{
	public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{ 
		isSneak = entity.isSneaking();
		setRotationAngles(f, f1, f2, f3, f4, f5, entity); 
		render(headModel, bipedHead, f5);
		render(bodyModel, bipedBody, f5);
		render(leftArmModel, bipedLeftArm, f5);
		render(rightArmModel, bipedRightArm, f5);
		render(leftLegModel, bipedLeftLeg, f5);
		render(rightLegModel, bipedRightLeg, f5);
	} 
	
	public void render(ModelRendererTurbo[] models, ModelRenderer bodyPart, float f5)
	{
		setBodyPart(models, bodyPart);
		for(ModelRendererTurbo mod : models)
		{
			mod.rotateAngleX = bodyPart.rotateAngleX;
			mod.rotateAngleY = bodyPart.rotateAngleY;
			mod.rotateAngleZ = bodyPart.rotateAngleZ;
			mod.render(f5);
		}
	}
	
	public void setBodyPart(ModelRendererTurbo[] models, ModelRenderer bodyPart)
	{
		for(ModelRendererTurbo mod : models)
		{
			mod.rotationPointX = bodyPart.rotationPointX;
			mod.rotationPointY = bodyPart.rotationPointY;
			mod.rotationPointZ = bodyPart.rotationPointZ;
		}
	}
}
