package co.uk.flansmods.client.model.mw;

import co.uk.flansmods.client.model.ModelAttachment;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelSilencer extends ModelAttachment 
{
	public ModelSilencer()
	{
		int textureX = 16;
		int textureY = 4;
		
		attachmentModel = new ModelRendererTurbo[1];
		
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		attachmentModel[0].addBox(0F, -1F, -1F, 6, 2, 2);
	}
}
