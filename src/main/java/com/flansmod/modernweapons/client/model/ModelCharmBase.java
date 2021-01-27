//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CharmBase
// Model Creator: 
// Created on: 05.01.2020 - 19:31:23
// Last changed on: 05.01.2020 - 19:31:23

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCharmBase extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCharmBase() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[6];
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Part_01
		attachmentModel[1] = new ModelRendererTurbo(this, 16, 16, textureX, textureY); // Part_02
		attachmentModel[2] = new ModelRendererTurbo(this, 40, 16, textureX, textureY); // Part_03
		attachmentModel[3] = new ModelRendererTurbo(this, 32, 48, textureX, textureY); // Part_04
		attachmentModel[4] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Part_05
		attachmentModel[5] = new ModelRendererTurbo(this, 16, 48, textureX, textureY); // Part_06

		attachmentModel[0].addBox(-4F, -8F, -4F, 8, 8, 8, 0F); // Part_01
		attachmentModel[0].setRotationPoint(1F, 0F, 16F);
		attachmentModel[0].rotateAngleX = -0.15707963F;
		attachmentModel[0].rotateAngleY = 3.4906585F;

		attachmentModel[1].addBox(-4F, 0F, -2F, 8, 12, 4, 0F); // Part_02
		attachmentModel[1].setRotationPoint(1F, 0F, 16F);
		attachmentModel[1].rotateAngleY = 3.61283155F;

		attachmentModel[2].addBox(-3F, -2F, -2F, 4, 12, 4, 0F); // Part_03
		attachmentModel[2].setRotationPoint(-5F, 2F, 14F);
		attachmentModel[2].rotateAngleY = 3.61283155F;

		attachmentModel[3].addBox(-1F, -2F, -2F, 4, 12, 4, 0F); // Part_04
		attachmentModel[3].setRotationPoint(5F, 2F, 17F);
		attachmentModel[3].rotateAngleY = 3.61283155F;
		attachmentModel[3].rotateAngleZ = -2.65290046F;

		attachmentModel[4].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Part_05
		attachmentModel[4].setRotationPoint(-1F, 12F, 15F);
		attachmentModel[4].rotateAngleY = 3.61283155F;

		attachmentModel[5].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Part_06
		attachmentModel[5].setRotationPoint(3F, 12F, 17F);
		attachmentModel[5].rotateAngleY = 3.61283155F;



		flipAll();
	}
}