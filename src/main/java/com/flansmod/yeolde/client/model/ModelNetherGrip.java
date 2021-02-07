//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.02.2021 - 16:31:03
// Last changed on: 04.02.2021 - 16:31:03

package com.flansmod.yeolde.client.model; //Path where the model is located

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNetherGrip extends ModelAttachment
{
	int textureX = 32;
	int textureY = 32;

	public ModelNetherGrip() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[11];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		attachmentModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
		attachmentModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 8
		attachmentModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 9
		attachmentModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 10
		attachmentModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 11
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		attachmentModel[8] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 13
		attachmentModel[9] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 14
		attachmentModel[10] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 15

		attachmentModel[0].addBox(-1F, 0F, -1F, 2, 1, 2, 0F); // Box 0
		attachmentModel[0].setRotationPoint(0F, 0F, 0F);

		attachmentModel[1].addTrapezoid(-0.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 6
		attachmentModel[1].setRotationPoint(0F, 4F, 0F);
		attachmentModel[1].rotateAngleY = -0.78539816F;

		attachmentModel[2].addBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F); // Box 7
		attachmentModel[2].setRotationPoint(0F, 2F, 0F);
		attachmentModel[2].rotateAngleY = -0.78539816F;

		attachmentModel[3].addTrapezoid(-0.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Box 8
		attachmentModel[3].setRotationPoint(0F, 1F, 0F);
		attachmentModel[3].rotateAngleY = -0.78539816F;

		attachmentModel[4].addBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F); // Box 9
		attachmentModel[4].setRotationPoint(0F, 3F, -1F);
		attachmentModel[4].rotateAngleX = 1.57079633F;
		attachmentModel[4].rotateAngleZ = 0.78539816F;

		attachmentModel[5].addTrapezoid(-0.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Box 10
		attachmentModel[5].setRotationPoint(0F, 3F, -2F);
		attachmentModel[5].rotateAngleX = 1.57079633F;
		attachmentModel[5].rotateAngleZ = 0.78539816F;

		attachmentModel[6].addTrapezoid(-0.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.50F, ModelRendererTurbo.MR_BOTTOM); // Box 11
		attachmentModel[6].setRotationPoint(0F, 3F, 1F);
		attachmentModel[6].rotateAngleX = 1.57079633F;
		attachmentModel[6].rotateAngleZ = 0.78539816F;

		attachmentModel[7].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 12
		attachmentModel[7].setRotationPoint(0.9F, 0.5F, 0F);

		attachmentModel[8].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 13
		attachmentModel[8].setRotationPoint(-0.9F, 0.5F, 0F);

		attachmentModel[9].addShapeBox(-0.5F, 0F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 14
		attachmentModel[9].setRotationPoint(0F, 0F, 2F);

		attachmentModel[10].addShapeBox(-0.5F, 0F, -1F, 1, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 15
		attachmentModel[10].setRotationPoint(0F, 0F, -1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}