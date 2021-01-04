package com.flansmod.modernweapons.client.model;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPistolFlashlight extends ModelAttachment
{
	public ModelPistolFlashlight()
	{
		int textureX = 32;
		int textureY = 32;
		
		attachmentModel = new ModelRendererTurbo[2];
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 10
		attachmentModel[1] = new ModelRendererTurbo(this, 8, 5, textureX, textureY); // Box 11

		attachmentModel[0].addShapeBox(-1.6F, 0F, -1F, 3, 2, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 10
		attachmentModel[0].setRotationPoint(5F, -3F, 0F);

		attachmentModel[1].addShapeBox(0.65F, 0F, -1F, 1, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 11
		attachmentModel[1].setRotationPoint(5F, -3F, 0F);

	}
}
