package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.teams.ArmourType;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;

public class ModelCustomArmour extends ModelBiped 
{
	public ArmourType type;
	
	public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] skirtFrontModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the maximum of the two legs
	public ModelRendererTurbo[] skirtRearModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the minimum of the two legs

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{ 
		GL11.glPushMatrix();
		GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
		isSneak = entity.isSneaking();
		ItemStack itemstack = ((EntityLivingBase)entity).getEquipmentInSlot(0);
        heldItemRight = itemstack != null ? 1 : 0;

        aimedBow = false;
        if (itemstack != null && entity instanceof EntityPlayer && ((EntityPlayer)entity).getItemInUseCount() > 0)
        {
        	EnumAction enumaction = itemstack.getItemUseAction();
            if (enumaction == EnumAction.block)
            {
                heldItemRight = 3;
            }
            else if (enumaction == EnumAction.bow)
            {
                aimedBow = true;
            }
        }
		setRotationAngles(f, f1, f2, f3, f4, f5, entity); 
		render(headModel, bipedHead, f5, type.modelScale);
		render(bodyModel, bipedBody, f5, type.modelScale);
		render(leftArmModel, bipedLeftArm, f5, type.modelScale);
		render(rightArmModel, bipedRightArm, f5, type.modelScale);
		render(leftLegModel, bipedLeftLeg, f5, type.modelScale);
		render(rightLegModel, bipedRightLeg, f5, type.modelScale);
		//Skirt front
		{
			for(ModelRendererTurbo mod : skirtFrontModel)
			{
				mod.rotationPointX = (bipedLeftLeg.rotationPointX + bipedRightLeg.rotationPointX) / 2F / type.modelScale;
				mod.rotationPointY = (bipedLeftLeg.rotationPointY + bipedRightLeg.rotationPointY) / 2F / type.modelScale;
				mod.rotationPointZ = (bipedLeftLeg.rotationPointZ + bipedRightLeg.rotationPointZ) / 2F / type.modelScale;
				mod.rotateAngleX = Math.min(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX);
				mod.rotateAngleY = bipedLeftLeg.rotateAngleY;
				mod.rotateAngleZ = bipedLeftLeg.rotateAngleZ;
				mod.render(f5);
			}
		}
		//Skirt back
		{
			for(ModelRendererTurbo mod : skirtRearModel)
			{
				mod.rotationPointX = (bipedLeftLeg.rotationPointX + bipedRightLeg.rotationPointX) / 2F / type.modelScale;
				mod.rotationPointY = (bipedLeftLeg.rotationPointY + bipedRightLeg.rotationPointY) / 2F / type.modelScale;
				mod.rotationPointZ = (bipedLeftLeg.rotationPointZ + bipedRightLeg.rotationPointZ) / 2F / type.modelScale;
				mod.rotateAngleX = Math.max(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX);
				mod.rotateAngleY = bipedLeftLeg.rotateAngleY;
				mod.rotateAngleZ = bipedLeftLeg.rotateAngleZ;
				mod.render(f5);
			}
		}
		GL11.glPopMatrix();
	} 
	
	public void render(ModelRendererTurbo[] models, ModelRenderer bodyPart, float f5, float scale)
	{
		setBodyPart(models, bodyPart, scale);
		for(ModelRendererTurbo mod : models)
		{
			mod.rotateAngleX = bodyPart.rotateAngleX;
			mod.rotateAngleY = bodyPart.rotateAngleY;
			mod.rotateAngleZ = bodyPart.rotateAngleZ;
			mod.render(f5);
		}
	}
	
	public void setBodyPart(ModelRendererTurbo[] models, ModelRenderer bodyPart, float scale)
	{
		for(ModelRendererTurbo mod : models)
		{
			mod.rotationPointX = bodyPart.rotationPointX / scale;
			mod.rotationPointY = bodyPart.rotationPointY / scale;
			mod.rotationPointZ = bodyPart.rotationPointZ / scale;
		}
	}
}
