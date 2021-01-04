package com.flansmod.modernweapons.client.model;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelLongBarrel extends ModelAttachment
{
	public ModelLongBarrel()
	{
		int textureX = 32;
		int textureY = 2;
		
		attachmentModel = new ModelRendererTurbo[2];
		
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		attachmentModel[0].addBox(0F, -0.5F, -0.5F, 12, 1, 1);
		
		attachmentModel[1] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
		attachmentModel[1].addBox(10.5F, 0.5F, -0.25F, 0.5F, 1, 0.5F);
	}
}
