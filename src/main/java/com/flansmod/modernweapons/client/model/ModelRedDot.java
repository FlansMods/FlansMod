//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RedDot
// Model Creator: 
// Created on: 19.05.2020 - 20:50:06
// Last changed on: 19.05.2020 - 20:50:06

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRedDot extends ModelAttachment //Same as Filename
{
	int textureX = 256;
	int textureY = 32;

	public ModelRedDot() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[7];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 01
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 02
		attachmentModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 03
		attachmentModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import 04
		attachmentModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import 05
		attachmentModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import 06
		attachmentModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 01

		attachmentModel[0].addBox(-16F, 0F, -6F, 2, 1, 12, 0F); // Import 01
		attachmentModel[0].setRotationPoint(46F, -19F, 0F);

		attachmentModel[1].addBox(-16F, 3F, -8F, 2, 1, 16, 0F); // Import 02
		attachmentModel[1].setRotationPoint(46F, -21F, 0F);

		attachmentModel[2].addBox(-16F, 20F, -8F, 32, 4, 16, 0F); // Import 03
		attachmentModel[2].setRotationPoint(16F, -21F, 0F);

		attachmentModel[3].addBox(-16F, 4F, -9F, 2, 20, 1, 0F); // Import 04
		attachmentModel[3].setRotationPoint(46F, -22F, 0F);

		attachmentModel[4].addBox(-16F, 4F, 8F, 2, 20, 1, 0F); // Import 05
		attachmentModel[4].setRotationPoint(46F, -22F, 0F);

		attachmentModel[5].addBox(-15F, 10.5F, -1.5F, 1, 18, 16, 0F); // Import 06
		attachmentModel[5].setRotationPoint(46F, -28F, -6.5F);

		attachmentModel[6].addBox(-16F, 0F, -6F, 6, 1, 8, 0F); // Import 01
		attachmentModel[6].setRotationPoint(26F, -2F, 2F);



		flipAll();
	}
}