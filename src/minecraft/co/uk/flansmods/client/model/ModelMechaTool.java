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
	
	public void render(EntityMecha mecha, float f1)
	{
		float f5 = 1F / 16F;
		
		for(ModelRendererTurbo model : baseModel)
		{
			model.render(f5);
		}
	}
	
	public void renderDrill(EntityMecha mecha, float f1)
	{
		float f5 = 1F / 16F;
				
		for(ModelRendererTurbo model : drillModel)
		{
			//Rotate
			model.render(f5);
		}
	}
}
