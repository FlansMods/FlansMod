package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

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
