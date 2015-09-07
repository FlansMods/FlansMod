package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.vector.Vector3f;

public class ModelMecha extends ModelDriveable 
{
	public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftHandModel = new ModelRendererTurbo[0]; //Renderered when the mecha is not holding anything
	public ModelRendererTurbo[] rightHandModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] hipsModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftFootModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightFootModel = new ModelRendererTurbo[0];	
	public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] barrelModel = new ModelRendererTurbo[0];
	
	/** The point at which various attachment models are rendered */
	public Vector3f hipsAttachmentPoint = new Vector3f();
	
	@Override
	public void render(EntityDriveable driveable, float f1)
	{
		render(0.0625F, (EntityMecha)driveable, f1);
	}
	
	@Override
	/** GUI render method */
	public void render(DriveableType type)
	{
		super.render(type);
		MechaType mechaType = (MechaType)type;
		renderPart(hipsModel);
		renderPart(leftLegModel);
		renderPart(rightLegModel);
		renderPart(leftFootModel);
		renderPart(rightFootModel);
		renderPart(barrelModel);
		renderPart(headModel);
		GL11.glPushMatrix();
		GL11.glTranslatef(mechaType.leftArmOrigin.x / mechaType.modelScale, mechaType.leftArmOrigin.y / mechaType.modelScale, mechaType.leftArmOrigin.z / mechaType.modelScale);
		renderPart(leftArmModel);
		renderPart(leftHandModel);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(mechaType.rightArmOrigin.x / mechaType.modelScale, mechaType.rightArmOrigin.y / mechaType.modelScale, mechaType.rightArmOrigin.z / mechaType.modelScale);
		renderPart(rightArmModel);
		renderPart(rightHandModel);
		GL11.glPopMatrix();
	}
	
	public void render(float f5, EntityMecha mecha, float f)
	{
		//Rendering the body
        if(mecha.isPartIntact(EnumDriveablePart.core))
			for (ModelRendererTurbo aBodyModel : bodyModel) aBodyModel.render(f5);
            
        if(mecha.isPartIntact(EnumDriveablePart.head))
        	for(ModelRendererTurbo model : headModel)
        		model.render(f5);

		float pitch = mecha.seats[0] == null ? 0F : mecha.seats[0].looking.getPitch();
        
        if(mecha.isPartIntact(EnumDriveablePart.barrel))
        {
			for (ModelRendererTurbo aBarrelModel : barrelModel) {
				aBarrelModel.rotateAngleZ = -pitch * 3.14159265F / 180F;
				aBarrelModel.render(f5, oldRotateOrder);
			}
        }
	}
		
	public void renderLeftArm(float f5, EntityMecha mecha, float f)
	{
        	for(ModelRendererTurbo model : leftArmModel)
        		model.render(f5);
	}
	
	public void renderLeftHand(float f5, EntityMecha mecha, float f)
	{
        	for(ModelRendererTurbo model : leftHandModel)
        		model.render(f5);
	}
	
	public void renderRightArm(float f5, EntityMecha mecha, float f)
	{
        	for(ModelRendererTurbo model : rightArmModel)
        		model.render(f5);
	}
	
	public void renderRightHand(float f5, EntityMecha mecha, float f)
	{
        	for(ModelRendererTurbo model : rightHandModel)
        		model.render(f5);
	}
	
	public void renderRightFoot(float f5, EntityMecha mecha, float f)
	{
        	for(ModelRendererTurbo model : rightFootModel)
        		model.render(f5);
	}
	
	public void renderLeftFoot(float f5, EntityMecha mecha, float f)
	{
        	for(ModelRendererTurbo model : leftFootModel)
        		model.render(f5);
	}
	
	public void renderRightLeg(float f5, EntityMecha mecha, float f)
	{
        	for(ModelRendererTurbo model : rightLegModel)
        		model.render(f5);
	}
	
	public void renderLeftLeg(float f5, EntityMecha mecha, float f)
	{
        	for(ModelRendererTurbo model : leftLegModel)
        		model.render(f5);
	}
	
	public void renderHips(float f5, EntityMecha mecha, float f)
	{        
        	for(ModelRendererTurbo model : hipsModel)
        		model.render(f5);
	}
	
	@Override
	public void flipAll()
	{
		super.flipAll();
		flip(leftArmModel);
		flip(rightArmModel);
		flip(leftHandModel);
		flip(rightHandModel);
		flip(hipsModel);
		flip(leftLegModel);
		flip(rightLegModel);
		flip(leftFootModel);
		flip(rightFootModel);
		flip(headModel);
		flip(barrelModel);
	}	
	
	@Override
	public void translateAll(float x, float y, float z)
	{
		super.translateAll(x, y, z);
		translate(leftArmModel, x, y, z);
		translate(rightArmModel, x, y, z);
		translate(leftHandModel, x, y, z);
		translate(rightHandModel, x, y, z);
		translate(hipsModel, x, y, z);
		translate(leftLegModel, x, y, z);
		translate(rightLegModel, x, y, z);
		translate(leftFootModel, x, y, z);
		translate(rightFootModel, x, y, z);
		translate(headModel, x, y, z);
		translate(barrelModel, x, y, z);
	}
}
