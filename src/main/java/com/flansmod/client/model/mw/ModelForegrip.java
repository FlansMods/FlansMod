package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

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
