package co.uk.flansmods.client.model.mw;

import co.uk.flansmods.client.model.ModelAttachment;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelForegrip extends ModelAttachment 
{
	public ModelForegrip()
	{
		int textureX = 16;
		int textureY = 8;
		
		attachmentModel = new ModelRendererTurbo[2];
		
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		attachmentModel[0].addBox(-2F, -1F, -1F, 4, 1, 2);
		
		attachmentModel[1] = new ModelRendererTurbo(this, 10, 1, textureX, textureY);
		attachmentModel[1].addBox(-1F, -6F, -1F, 2, 5, 2);
	}
}
