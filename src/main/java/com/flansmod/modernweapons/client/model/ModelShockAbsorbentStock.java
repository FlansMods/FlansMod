package com.flansmod.modernweapons.client.model;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelShockAbsorbentStock extends ModelAttachment
{
	public ModelShockAbsorbentStock()
	{
		int textureX = 16;
		int textureY = 8;
		
		attachmentModel = new ModelRendererTurbo[3];
		
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		attachmentModel[0].addBox(-2F, -1F, -1F, 4, 1, 2);
		
		attachmentModel[1] = new ModelRendererTurbo(this, 10, 1, textureX, textureY);
		attachmentModel[1].addBox(-2F, -6F, -0.5F, 1, 5, 1);
		
		attachmentModel[2] = new ModelRendererTurbo(this, 10, 1, textureX, textureY);
		attachmentModel[2].addBox(1F, -6F, -0.5F, 1, 5, 1);
	}
}
