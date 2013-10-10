package co.uk.flansmods.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.item.ItemStack;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import co.uk.flansmods.common.driveables.mechas.EnumMechaSlotType;
import co.uk.flansmods.common.driveables.mechas.MechaType;

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
		renderPart(headModel);
		GL11.glPushMatrix();
		GL11.glTranslatef(mechaType.leftArmOrigin.x, mechaType.leftArmOrigin.y, mechaType.leftArmOrigin.z);
		renderPart(leftArmModel);
		renderPart(leftHandModel);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(mechaType.rightArmOrigin.x, mechaType.rightArmOrigin.y, mechaType.rightArmOrigin.z);
		renderPart(rightArmModel);
		renderPart(rightHandModel);
		GL11.glPopMatrix();
	}
	
	public void render(float f5, EntityMecha mecha, float f)
	{
		//Rendering the body
        if(mecha.isPartIntact(EnumDriveablePart.core))
	        for(int i = 0; i < bodyModel.length; i++)
				bodyModel[i].render(f5);
            
        if(mecha.isPartIntact(EnumDriveablePart.head))
        	for(ModelRendererTurbo model : headModel)
        		model.render(f5);
        
        if(mecha.isPartIntact(EnumDriveablePart.rightArm))
        	for(ModelRendererTurbo model : rightArmModel)
        		//model.render(f5);
        		;
	}
		
	public void renderLeftArm(float f5, EntityMecha mecha, float f)
	{
        if(mecha.isPartIntact(EnumDriveablePart.leftArm))
        	for(ModelRendererTurbo model : leftArmModel)
        		model.render(f5);
	}
	
	public void renderLeftHand(float f5, EntityMecha mecha, float f)
	{
		if(mecha.isPartIntact(EnumDriveablePart.leftArm))
        	for(ModelRendererTurbo model : leftHandModel)
        		model.render(f5);
	}
	
	public void renderRightArm(float f5, EntityMecha mecha, float f)
	{
        if(mecha.isPartIntact(EnumDriveablePart.rightArm))
        	for(ModelRendererTurbo model : rightArmModel)
        		model.render(f5);
	}
	
	public void renderRightHand(float f5, EntityMecha mecha, float f)
	{
		if(mecha.isPartIntact(EnumDriveablePart.rightArm))
        	for(ModelRendererTurbo model : rightHandModel)
        		model.render(f5);
	}
	
	public void renderRightFoot(float f5, EntityMecha mecha, float f)
	{
		if(mecha.isPartIntact(EnumDriveablePart.hips))
        	for(ModelRendererTurbo model : rightFootModel)
        		model.render(f5);
	}
	
	public void renderLeftFoot(float f5, EntityMecha mecha, float f)
	{
		if(mecha.isPartIntact(EnumDriveablePart.hips))
        	for(ModelRendererTurbo model : leftFootModel)
        		model.render(f5);
	}
	
	public void renderRightLeg(float f5, EntityMecha mecha, float f)
	{
		if(mecha.isPartIntact(EnumDriveablePart.hips))
        	for(ModelRendererTurbo model : rightLegModel)
        		model.render(f5);
	}
	
	public void renderLeftLeg(float f5, EntityMecha mecha, float f)
	{
		if(mecha.isPartIntact(EnumDriveablePart.hips))
        	for(ModelRendererTurbo model : leftLegModel)
        		model.render(f5);
	}
	
	public void renderHips(float f5, EntityMecha mecha, float f)
	{        
        if(mecha.isPartIntact(EnumDriveablePart.hips))
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
	}	
	
	@Override
	public void translateAll(int x, int y, int z)
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
	}
}