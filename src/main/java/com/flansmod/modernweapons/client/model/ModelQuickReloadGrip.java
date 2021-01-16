package com.flansmod.modernweapons.client.model;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelQuickReloadGrip extends ModelAttachment
{
	public ModelQuickReloadGrip()
	{
		int textureX = 16;
		int textureY = 8;
		
		attachmentModel = new ModelRendererTurbo[5];
		
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		attachmentModel[0].addBox(-2F, -1F, -1F, 4, 1, 2);
		
		attachmentModel[1] = new ModelRendererTurbo(this, 10, 1, textureX, textureY);
		attachmentModel[1].addBox(-1F, -4F, -0.5F, 1, 3, 1);
		
		attachmentModel[2] = new ModelRendererTurbo(this, 2, 1, textureX, textureY);
		attachmentModel[2].addBox(1F, -2F, -0.5F, 1, 1, 1);
		
		attachmentModel[3] = new ModelRendererTurbo(this, 2, 1, textureX, textureY);
		attachmentModel[3].addBox(2F, -4F, -0.5F, 1, 2, 1);
		
		attachmentModel[4] = new ModelRendererTurbo(this, 2, 1, textureX, textureY);
		attachmentModel[4].addBox(0F, -5F, -0.5F, 2, 1, 1);
		
	}
}
