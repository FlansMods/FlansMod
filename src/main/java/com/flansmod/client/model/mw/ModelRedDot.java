package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRedDot extends ModelAttachment 
{
	public ModelRedDot()
	{
		int textureX = 128;
		int textureY = 32;
		
		attachmentModel = new ModelRendererTurbo[5];
		
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		attachmentModel[0].addBox(-16F, 0F, -8F, 32, 3, 16);
		
		attachmentModel[1] = new ModelRendererTurbo(this, 96, 0, textureX, textureY);
		attachmentModel[1].addBox(15F, 3F, 7F, 1, 14, 1);
		
		attachmentModel[2] = new ModelRendererTurbo(this, 100, 0, textureX, textureY);
		attachmentModel[2].addBox(15F, 3F, -8F, 1, 14, 1);
		
		attachmentModel[3] = new ModelRendererTurbo(this, 88, 3, textureX, textureY);
		attachmentModel[3].addBox(15F, 17F, -8F, 1, 1, 16);
		
		attachmentModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		attachmentModel[4].addBox(15F, 9.5F, -0.5F, 1, 1, 1);

	}
}
