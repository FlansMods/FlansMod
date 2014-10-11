package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFlashlight extends ModelAttachment 
{
	public ModelFlashlight()
	{
		int textureX = 16;
		int textureY = 16;
		
		attachmentModel = new ModelRendererTurbo[3];
		
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		attachmentModel[0].addBox(-2F, -1F, -0.5F, 4, 1, 1);
		
		attachmentModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY);
		attachmentModel[1].addBox(-2.5F, -3F, -1F, 5, 2, 2);
		
		attachmentModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		attachmentModel[2].addBox(2.5F, -3.5F, -1.5F, 1, 3, 3);
	}
}
