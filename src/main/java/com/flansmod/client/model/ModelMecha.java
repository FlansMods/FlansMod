package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.util.Vec3;

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
	public ModelRendererTurbo[] leftAnimLegUpperModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightAnimLegUpperModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftAnimLegLowerModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightAnimLegLowerModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftAnimFootModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightAnimFootModel = new ModelRendererTurbo[0];

	
	/** The point at which various attachment models are rendered */
	public Vector3f hipsAttachmentPoint = new Vector3f();
	public Vector3f legsOrigin = new Vector3f();
	public Vector3f leftLegUpperOrigin = new Vector3f();
	public Vector3f leftLegLowerOrigin = new Vector3f();
	public Vector3f rightLegUpperOrigin = new Vector3f();
	public Vector3f rightLegLowerOrigin = new Vector3f();
	public Vector3f rightFootOrigin = new Vector3f();
	public Vector3f leftFootOrigin = new Vector3f();
	
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
		GL11.glPushMatrix();
		renderPart(leftAnimLegUpperModel);
		renderPart(rightAnimLegUpperModel);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(leftLegLowerOrigin.x, leftLegLowerOrigin.y, leftLegLowerOrigin.z);
		renderPart(leftAnimLegLowerModel);
		GL11.glPopMatrix();GL11.glPushMatrix();
		GL11.glTranslatef(rightLegLowerOrigin.x, rightLegLowerOrigin.y, rightLegLowerOrigin.z);
		renderPart(rightAnimLegLowerModel);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(leftFootOrigin.x, leftFootOrigin.y, -leftFootOrigin.z);
		renderPart(leftAnimFootModel);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(rightFootOrigin.x, rightFootOrigin.y, -rightFootOrigin.z);
		renderPart(rightAnimFootModel);
		GL11.glPopMatrix();
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

		float pitch = 0;
		if(mecha.seats[0].looking != null){ pitch = mecha.seats[0].looking.getPitch();}
		float dPitch = (mecha.seats[0].looking.getPitch() - mecha.seats[0].prevLooking.getPitch());
		float aPitch = mecha.seats[0].prevLooking.getPitch() + dPitch * f;
        
        if(mecha.isPartIntact(EnumDriveablePart.barrel))
        {
			for (ModelRendererTurbo aBarrelModel : barrelModel) {
				aBarrelModel.rotateAngleZ = -(pitch * 3.14159265F / 180F);	
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
	
	public void renderRightAnimLegUpper(float f5, EntityMecha mecha, float f)
	{		
    	for(ModelRendererTurbo model : rightAnimLegUpperModel){
    		model.render(f5);      		
    	}
	}
	
	public void renderRightAnimLegLower(float f5, EntityMecha mecha, float f)
	{		
    	for(ModelRendererTurbo model : rightAnimLegLowerModel){
    		model.render(f5);      		
    	}
	}
	
	public void renderRightAnimFoot(float f5, EntityMecha mecha, float f)
	{		
    	for(ModelRendererTurbo model : rightAnimFootModel){
    		model.render(f5);      		
    	}
	}
	
	public void renderLeftAnimLegUpper(float f5, EntityMecha mecha, float f)
	{		
    	for(ModelRendererTurbo model : leftAnimLegUpperModel){
    		model.render(f5);      		
    	}
	}
	
	public void renderLeftAnimLegLower(float f5, EntityMecha mecha, float f)
	{		
    	for(ModelRendererTurbo model : leftAnimLegLowerModel){
    		model.render(f5);      		
    	}
	}
	
	public void renderLeftAnimFoot(float f5, EntityMecha mecha, float f)
	{		
    	for(ModelRendererTurbo model : leftAnimFootModel){
    		model.render(f5);      		
    	}
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
		flip(leftAnimLegUpperModel);
		flip(rightAnimLegUpperModel);
		flip(leftAnimLegLowerModel);
		flip(rightAnimLegLowerModel);
		flip(leftAnimFootModel);
		flip(rightAnimFootModel);
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
		translate(leftAnimLegUpperModel, x, y, z);
		translate(rightAnimLegUpperModel, x, y, z);
		translate(leftAnimLegLowerModel, x, y, z);
		translate(rightAnimLegLowerModel, x, y, z);
		translate(leftAnimFootModel, x, y, z);
		translate(rightAnimFootModel, x, y, z);
		translate(headModel, x, y, z);
		translate(barrelModel, x, y, z);
	}
}
