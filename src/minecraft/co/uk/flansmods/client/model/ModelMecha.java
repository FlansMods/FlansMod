package co.uk.flansmods.client.model;

import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;

public class ModelMecha extends ModelDriveable 
{
	public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] hipsModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
	
	@Override
	public void render(EntityDriveable driveable, float f1)
	{
		render(0.0625F, (EntityMecha)driveable, f1);
	}
	
	@Override
	/** GUI render method */
	public void render()
	{
		super.render();
		renderPart(leftArmModel);
		renderPart(rightArmModel);
		renderPart(hipsModel);
		renderPart(leftLegModel);
		renderPart(rightLegModel);
		renderPart(headModel);
	}
	
	public void render(float f5, EntityMecha mecha, float f)
	{
		//Rendering the body
        if(mecha.isPartIntact(EnumDriveablePart.core))
        {
	        for(int i = 0; i < bodyModel.length; i++)
	        {
				bodyModel[i].render(f5);
	        }	
        }
            
        float smoothedPitch = 0F;
        
        if(mecha.seats[0] != null)
        	smoothedPitch = mecha.seats[0].prevLooking.getPitch() + (mecha.seats[0].looking.getPitch() - mecha.seats[0].prevLooking.getPitch()) * f;
        
        if(mecha.isPartIntact(EnumDriveablePart.head))
        {
        	for(ModelRendererTurbo model : headModel)
        	{
        		if(mecha.seats[0] != null)
        			model.rotateAngleX = smoothedPitch;
        		model.render(f5);
        	}
        }
        
        if(mecha.isPartIntact(EnumDriveablePart.leftArm))
        {
        	for(ModelRendererTurbo model : leftArmModel)
        	{
        		if(mecha.seats[0] != null)
        			model.rotateAngleZ = (90F - smoothedPitch) * 3.14159265F / 180F;
        		model.render(f5);
        	}
        	
        	
        }
	
        if(mecha.isPartIntact(EnumDriveablePart.rightArm))
        {
        	for(ModelRendererTurbo model : rightArmModel)
        	{
        		if(mecha.seats[0] != null)
        			model.rotateAngleZ = (90F - smoothedPitch) * 3.14159265F / 180F;
        		model.render(f5);
        	}
        }
}
	
	public void renderLegs(float f5, EntityMecha mecha, float f)
	{        
        if(mecha.isPartIntact(EnumDriveablePart.hips))
        {
        	for(ModelRendererTurbo model : hipsModel)
        	{
        		model.render(f5);
        	}
        }
        
        int legSwingTime = 5;
        float legsYaw = (float)Math.sin(((mecha.ticksExisted) + f) / legSwingTime) * mecha.legSwing;
        
        if(mecha.isPartIntact(EnumDriveablePart.leftLeg))
        {
        	for(ModelRendererTurbo model : leftLegModel)
        	{
        		model.rotateAngleZ = legsYaw;
        		model.render(f5);
        	}
        }
        
        if(mecha.isPartIntact(EnumDriveablePart.rightLeg))
        {
        	for(ModelRendererTurbo model : rightLegModel)
        	{
        		model.rotateAngleZ = -legsYaw;
        		model.render(f5);
        	}
        }
	}
}