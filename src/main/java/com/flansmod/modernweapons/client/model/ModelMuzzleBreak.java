package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMuzzleBreak extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 16;

	public ModelMuzzleBreak() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[5];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 
		attachmentModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		attachmentModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 

		attachmentModel[0].addBox(0F, -1F, -1F, 4, 3, 3, 0F); // Import 
		attachmentModel[0].setRotationPoint(-2F, -0.5F, -0.5F);

		attachmentModel[1].addBox(0F, -1F, -1F, 4, 4, 1, 0F); // Import 
		attachmentModel[1].setRotationPoint(0F, -1F, -1F);

		attachmentModel[2].addBox(0F, -1F, -1F, 4, 1, 2, 0F); // Import 
		attachmentModel[2].setRotationPoint(0F, -1F, 0F);

		attachmentModel[3].addBox(0F, -1F, -1F, 4, 4, 1, 0F); // Import 
		attachmentModel[3].setRotationPoint(0F, -1F, 2F);

		attachmentModel[4].addBox(0F, -1F, -1F, 4, 1, 2, 0F); // Import 
		attachmentModel[4].setRotationPoint(0F, 2F, 0F);



		flipAll();
	}
}