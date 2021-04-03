//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: UnderBarrelLaser
// Model Creator: 
// Created on: 02.03.2020 - 22:50:09
// Last changed on: 02.03.2020 - 22:50:09

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelUnderBarrelLaser extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 2048;

	public ModelUnderBarrelLaser() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[3];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		attachmentModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		attachmentModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0

		attachmentModel[0].addBox(0F, -17F, 0F, 5, 2, 4, 0F); // Import Box0
		attachmentModel[0].setRotationPoint(16F, 4.5F, -2F);
		attachmentModel[0].rotateAngleZ = 1.57079633F;

		attachmentModel[1].addBox(0F, -17F, 0F, 1, 2000, 1, 0F); // Import Box0
		attachmentModel[1].setRotationPoint(15.5F, 2.5F, -0.5F);
		attachmentModel[1].rotateAngleZ = 1.57079633F;

		attachmentModel[2].addBox(0F, -17F, 0F, 5, 5, 3, 0F); // Import Box0
		attachmentModel[2].setRotationPoint(14.5F, 3.5F, -1.5F);
		attachmentModel[2].rotateAngleZ = 1.57079633F;



		flipAll();
	}
}