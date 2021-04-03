//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HCOG
// Model Creator: 
// Created on: 15.05.2020 - 15:19:41
// Last changed on: 15.05.2020 - 15:19:41

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHCOG extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelHCOG() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[10];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 01
		attachmentModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 02
		attachmentModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import 03
		attachmentModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import 04
		attachmentModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import 05
		attachmentModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import 06
		attachmentModel[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import 06
		attachmentModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import 01
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import 01
		attachmentModel[9] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import 01

		attachmentModel[0].addBox(-16F, 0F, -6F, 22, 3, 12, 0F); // Import 01
		attachmentModel[0].setRotationPoint(22F, -4F, 0F);

		attachmentModel[1].addBox(-16F, 3F, -8F, 32, 1, 16, 0F); // Import 02
		attachmentModel[1].setRotationPoint(16F, -4F, 0F);

		attachmentModel[2].addBox(-16F, 20F, -8F, 32, 1, 20, 0F); // Import 03
		attachmentModel[2].setRotationPoint(16F, -22F, -2F);

		attachmentModel[3].addBox(-16F, 4F, -9F, 32, 16, 3, 0F); // Import 04
		attachmentModel[3].setRotationPoint(16F, -22F, -2F);

		attachmentModel[4].addBox(-16F, 4F, 8F, 32, 16, 3, 0F); // Import 05
		attachmentModel[4].setRotationPoint(16F, -22F, 0F);

		attachmentModel[5].addBox(-15F, 10.5F, -1.5F, 6, 15, 20, 0F); // Import 06
		attachmentModel[5].setRotationPoint(11F, -28F, 8F);
		attachmentModel[5].rotateAngleY = 3.14159265F;

		attachmentModel[6].addBox(-15F, 10.5F, -1.5F, 6, 15, 20, 0F); // Import 06
		attachmentModel[6].setRotationPoint(-4F, -28F, 8F);
		attachmentModel[6].rotateAngleY = 3.14159265F;

		attachmentModel[7].addBox(-16F, 0F, -6F, 8, 2, 17, 0F); // Import 01
		attachmentModel[7].setRotationPoint(14F, -3F, -3F);

		attachmentModel[8].addBox(-16F, 0F, -6F, 6, 2, 17, 0F); // Import 01
		attachmentModel[8].setRotationPoint(44F, -3F, -3F);

		attachmentModel[9].addBox(-16F, 0F, -6F, 8, 1, 15, 0F); // Import 01
		attachmentModel[9].setRotationPoint(13.99F, -2.5F, -2F);



		flipAll();
	}
}