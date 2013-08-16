package co.uk.flansmods.client.model;

import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntityPlane;
import net.minecraft.client.model.ModelBase;

public class ModelDriveable extends ModelBase 
{
	/** For rendering a specific entity */
	public void render(EntityDriveable driveable)
	{
	}
	   
	/** For rendering from GUIs */
	public void render()
	{
	}
	
	/** Renders the specified parts */
	public void renderPart(ModelRendererTurbo[] part)
	{
		for(ModelRendererTurbo bit : part)
		{
			bit.render(0.0625F);
		}
	}
}
