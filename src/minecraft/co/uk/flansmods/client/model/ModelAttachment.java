package co.uk.flansmods.client.model;

import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelAttachment extends ModelBase 
{
	public ModelRendererTurbo[] attachmentModel = new ModelRendererTurbo[0];
	
	/** For big scopes, so that the player actually looks through them properly */
	public float renderOffset = 0F;
	
	public void renderAttachment(float f)
	{
		for(ModelRendererTurbo model : attachmentModel)
			if(model != null)
				model.render(f);
	}
}
