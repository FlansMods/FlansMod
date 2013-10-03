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
	}
}