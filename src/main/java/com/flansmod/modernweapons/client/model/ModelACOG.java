//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ACOG
// Model Creator: 
// Created on: 19.05.2020 - 20:50:06
// Last changed on: 19.05.2020 - 20:50:06

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelACOG extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelACOG() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[6];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 01
		attachmentModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 02
		attachmentModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import 03
		attachmentModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import 04
		attachmentModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import 05
		attachmentModel[5] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import 06

		attachmentModel[0].addBox(-16F, 0F, -6F, 32, 3, 12, 0F); // Import 01
		attachmentModel[0].setRotationPoint(16F, -21F, 0F);

		attachmentModel[1].addBox(-16F, 3F, -8F, 32, 1, 16, 0F); // Import 02
		attachmentModel[1].setRotationPoint(16F, -21F, 0F);

		attachmentModel[2].addBox(-16F, 20F, -8F, 32, 1, 16, 0F); // Import 03
		attachmentModel[2].setRotationPoint(16F, -21F, 0F);

		attachmentModel[3].addBox(-16F, 4F, -9F, 32, 16, 1, 0F); // Import 04
		attachmentModel[3].setRotationPoint(16F, -21F, 0F);

		attachmentModel[4].addBox(-16F, 4F, 8F, 32, 16, 1, 0F); // Import 05
		attachmentModel[4].setRotationPoint(16F, -21F, 0F);

		attachmentModel[5].addBox(-15F, 10.5F, -1.5F, 30, 15, 15, 0F); // Import 06
		attachmentModel[5].setRotationPoint(16F, -27F, -6F);



		flipAll();
	}
}