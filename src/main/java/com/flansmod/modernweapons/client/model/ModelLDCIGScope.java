//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LDCIGScope
// Model Creator: 
// Created on: 15.05.2020 - 15:19:41
// Last changed on: 15.05.2020 - 15:19:41

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelLDCIGScope extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelLDCIGScope() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[25];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 01
		attachmentModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 03
		attachmentModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import 06
		attachmentModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import 01
		attachmentModel[4] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import 01
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import 06
		attachmentModel[6] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import 06
		attachmentModel[7] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import 06
		attachmentModel[8] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import 06
		attachmentModel[9] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import 06
		attachmentModel[10] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import 06
		attachmentModel[11] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import 06
		attachmentModel[12] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import 06
		attachmentModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import 01
		attachmentModel[14] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import 01
		attachmentModel[15] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import 01
		attachmentModel[16] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Import 01
		attachmentModel[17] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Import 06
		attachmentModel[18] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import 06
		attachmentModel[19] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Import 06
		attachmentModel[20] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Import 06
		attachmentModel[21] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import 06
		attachmentModel[22] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Import 06
		attachmentModel[23] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Import 06
		attachmentModel[24] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import 06

		attachmentModel[0].addBox(-16F, 0F, -6F, 22, 3, 12, 0F); // Import 01
		attachmentModel[0].setRotationPoint(22F, -4F, 0F);

		attachmentModel[1].addBox(-16F, 20F, -8F, 32, 6, 19, 0F); // Import 03
		attachmentModel[1].setRotationPoint(16F, -25F, -2F);

		attachmentModel[2].addBox(-15F, 10.5F, -1.5F, 82, 30, 30, 0F); // Import 06
		attachmentModel[2].setRotationPoint(28F, -54F, 13F);
		attachmentModel[2].rotateAngleY = 3.14159265F;

		attachmentModel[3].addBox(-16F, 0F, -6F, 6, 16, 17, 0F); // Import 01
		attachmentModel[3].setRotationPoint(20F, -32F, -3F);

		attachmentModel[4].addBox(-16F, 0F, -6F, 6, 16, 17, 0F); // Import 01
		attachmentModel[4].setRotationPoint(38F, -32F, -3F);

		attachmentModel[5].addBox(-15F, 10.5F, -1.5F, 10, 36, 16, 0F); // Import 06
		attachmentModel[5].setRotationPoint(-18F, -57F, 6F);
		attachmentModel[5].rotateAngleY = 3.14159265F;

		attachmentModel[6].addBox(-15F, 10.5F, -1.5F, 40, 34, 34, 0F); // Import 06
		attachmentModel[6].setRotationPoint(67F, -56F, 15F);
		attachmentModel[6].rotateAngleY = 3.14159265F;

		attachmentModel[7].addBox(-15F, 10.5F, -1.5F, 10, 36, 16, 0F); // Import 06
		attachmentModel[7].setRotationPoint(32F, -57F, 6F);
		attachmentModel[7].rotateAngleY = 3.14159265F;

		attachmentModel[8].addBox(-15F, 10.5F, -1.5F, 40, 32, 12, 0F); // Import 06
		attachmentModel[8].setRotationPoint(22F, -55F, 4F);
		attachmentModel[8].rotateAngleY = 3.14159265F;

		attachmentModel[9].addBox(-15F, 10.5F, -1.5F, 50, 22, 4, 0F); // Import 06
		attachmentModel[9].setRotationPoint(6F, -50F, 14F);
		attachmentModel[9].rotateAngleY = 3.14159265F;

		attachmentModel[10].addBox(-15F, 10.5F, -1.5F, 8, 4, 8, 0F); // Import 06
		attachmentModel[10].setRotationPoint(6F, -59F, 2F);
		attachmentModel[10].rotateAngleY = 3.14159265F;

		attachmentModel[11].addBox(-15F, 10.5F, -1.5F, 2, 29, 29, 0F); // Import 06
		attachmentModel[11].setRotationPoint(-56.01F, -53.5F, 12.5F);
		attachmentModel[11].rotateAngleY = 3.14159265F;

		attachmentModel[12].addBox(-15F, 10.5F, -1.5F, 2, 29, 29, 0F); // Import 06
		attachmentModel[12].setRotationPoint(72.1F, -53.5F, 12.5F);
		attachmentModel[12].rotateAngleY = 3.14159265F;

		attachmentModel[13].addBox(-16F, 0F, -6F, 6, 16, 4, 0F); // Import 01
		attachmentModel[13].setRotationPoint(20F, -16F, -3F);

		attachmentModel[14].addBox(-16F, 0F, -6F, 6, 16, 4, 0F); // Import 01
		attachmentModel[14].setRotationPoint(38F, -16F, -3F);

		attachmentModel[15].addBox(-16F, 0F, -6F, 6, 16, 4, 0F); // Import 01
		attachmentModel[15].setRotationPoint(20F, -16F, 10F);

		attachmentModel[16].addBox(-16F, 0F, -6F, 6, 16, 4, 0F); // Import 01
		attachmentModel[16].setRotationPoint(38F, -16F, 10F);

		attachmentModel[17].addBox(-15F, 10.5F, -1.5F, 11, 30, 2, 0F); // Import 06
		attachmentModel[17].setRotationPoint(-54F, -54F, 14F);
		attachmentModel[17].rotateAngleY = 3.14159265F;

		attachmentModel[18].addBox(-15F, 10.5F, -1.5F, 11, 30, 2, 0F); // Import 06
		attachmentModel[18].setRotationPoint(-54F, -54F, -16F);
		attachmentModel[18].rotateAngleY = 3.14159265F;

		attachmentModel[19].addBox(-15F, 10.5F, -1.5F, 11, 2, 30, 0F); // Import 06
		attachmentModel[19].setRotationPoint(-54F, -56F, 13F);
		attachmentModel[19].rotateAngleY = 3.14159265F;

		attachmentModel[20].addBox(-15F, 10.5F, -1.5F, 11, 2, 30, 0F); // Import 06
		attachmentModel[20].setRotationPoint(-54F, -24F, 13F);
		attachmentModel[20].rotateAngleY = 3.14159265F;

		attachmentModel[21].addBox(-15F, 10.5F, -1.5F, 11, 30, 2, 0F); // Import 06
		attachmentModel[21].setRotationPoint(78F, -54F, 14F);
		attachmentModel[21].rotateAngleY = 3.14159265F;

		attachmentModel[22].addBox(-15F, 10.5F, -1.5F, 11, 30, 2, 0F); // Import 06
		attachmentModel[22].setRotationPoint(78F, -54F, -16F);
		attachmentModel[22].rotateAngleY = 3.14159265F;

		attachmentModel[23].addBox(-15F, 10.5F, -1.5F, 11, 2, 30, 0F); // Import 06
		attachmentModel[23].setRotationPoint(78F, -56F, 13F);
		attachmentModel[23].rotateAngleY = 3.14159265F;

		attachmentModel[24].addBox(-15F, 10.5F, -1.5F, 11, 2, 30, 0F); // Import 06
		attachmentModel[24].setRotationPoint(78F, -24F, 13F);
		attachmentModel[24].rotateAngleY = 3.14159265F;



		flipAll();
	}
}