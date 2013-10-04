package co.uk.flansmods.client.model;

import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import net.minecraft.client.model.ModelBase;

public class ModelMechaTool extends ModelBase
{
	/** This bit does nothing */
	public ModelRendererTurbo[] baseModel = new ModelRendererTurbo[0];
	/** This bit spins */
	public ModelRendererTurbo[] drillModel = new ModelRendererTurbo[0];
	
	public void render(EntityMecha mecha, boolean leftHand, float f1)
	{
		for(ModelRendererTurbo model : baseModel)
		{
			model.render(f1);
		}
		
		for(ModelRendererTurbo model : drillModel)
		{
			//Rotate
			model.render(f1);
		}
	}
}
