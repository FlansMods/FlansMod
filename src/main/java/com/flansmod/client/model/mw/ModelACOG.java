package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelACOG extends ModelAttachment 
{
	public ModelACOG()
	{
		int textureX = 128;
		int textureY = 128;
		
		attachmentModel = new ModelRendererTurbo[6];
		
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		attachmentModel[0].addBox(-16F, 0F, -6F, 32, 3, 12);
		
		attachmentModel[1] = new ModelRendererTurbo(this, 0, 111, textureX, textureY);
		attachmentModel[1].addBox(-16F, 3F, -8F, 32, 1, 16);
		
		attachmentModel[2] = new ModelRendererTurbo(this, 0, 77, textureX, textureY);
		attachmentModel[2].addBox(-16F, 20F, -8F, 32, 1, 16);
		
		attachmentModel[3] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);
		attachmentModel[3].addBox(-16F, 4F, -9F, 32, 16, 1);
		
		attachmentModel[4] = new ModelRendererTurbo(this, 0, 60, textureX, textureY);
		attachmentModel[4].addBox(-16F, 4F, 8F, 32, 16, 1);
		
		attachmentModel[5] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);
		attachmentModel[5].addBox(-15F, 10.5F, -1.5F, 30, 3, 3);

		renderOffset = 0F;
	}
}
