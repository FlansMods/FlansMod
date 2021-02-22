//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CharmBaseSight
// Model Creator: 
// Created on: 05.01.2020 - 19:31:23
// Last changed on: 05.01.2020 - 19:31:23

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCharmBaseSight extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCharmBaseSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[6];
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Part_01
		attachmentModel[1] = new ModelRendererTurbo(this, 16, 16, textureX, textureY); // Part_02
		attachmentModel[2] = new ModelRendererTurbo(this, 40, 16, textureX, textureY); // Part_03
		attachmentModel[3] = new ModelRendererTurbo(this, 32, 48, textureX, textureY); // Part_04
		attachmentModel[4] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Part_05
		attachmentModel[5] = new ModelRendererTurbo(this, 16, 48, textureX, textureY); // Part_06

		attachmentModel[0].addBox(-4F, -8F, -4F, 8, 8, 8, 0F); // Part_01
		attachmentModel[0].setRotationPoint(-4.75F, -12F, -1F);
		attachmentModel[0].rotateAngleX = -0.26179939F;
		attachmentModel[0].rotateAngleY = -1.57079633F;

		attachmentModel[1].addBox(-4F, 0F, -2F, 8, 12, 4, 0F); // Part_02
		attachmentModel[1].setRotationPoint(-4.75F, -12.25F, -1F);
		attachmentModel[1].rotateAngleX = -0.17453293F;
		attachmentModel[1].rotateAngleY = -1.57079633F;

		attachmentModel[2].addBox(-3F, -2F, -2F, 4, 12, 4, 0F); // Part_03
		attachmentModel[2].setRotationPoint(-4F, -11F, -5F);
		attachmentModel[2].rotateAngleY = -1.57079633F;
		attachmentModel[2].rotateAngleZ = 2.44346095F;

		attachmentModel[3].addBox(-1F, -2F, -2F, 4, 12, 4, 0F); // Part_04
		attachmentModel[3].setRotationPoint(-4F, -11F, 3F);
		attachmentModel[3].rotateAngleY = -1.57079633F;
		attachmentModel[3].rotateAngleZ = -2.44346095F;

		attachmentModel[4].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Part_05
		attachmentModel[4].setRotationPoint(-5.75F, -1.5F, -3.01F);
		attachmentModel[4].rotateAngleX = -1.57079633F;
		attachmentModel[4].rotateAngleY = -1.57079633F;

		attachmentModel[5].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Part_06
		attachmentModel[5].setRotationPoint(-5.75F, -1.5F, 1.01F);
		attachmentModel[5].rotateAngleX = -1.57079633F;
		attachmentModel[5].rotateAngleY = -1.57079633F;



		flipAll();
	}
}