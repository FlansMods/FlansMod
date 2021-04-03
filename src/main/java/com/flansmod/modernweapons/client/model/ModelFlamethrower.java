//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Flamethrower
// Model Creator: 
// Created on: 02.03.2020 - 22:50:09
// Last changed on: 02.03.2020 - 22:50:09

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFlamethrower extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelFlamethrower() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[21];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 10, 17, 3, 0F); // Import Box0
		gunModel[0].setRotationPoint(12F, 12F, -3F);
		gunModel[0].rotateAngleZ = -0.12217305F;

		gunModel[1].addBox(0F, -17F, 0F, 12, 6, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(9F, 24F, -4F);
		gunModel[1].rotateAngleZ = -0.13962634F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 9, 3, 0F); // Import Box0
		gunModel[2].setRotationPoint(30F, 9F, -3F);

		gunModel[3].addBox(0F, -17F, 0F, 32, 10, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-26F, 2F, -5F);

		gunModel[4].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(40F, 1.5F, 2F);

		gunModel[5].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[5].setRotationPoint(38F, 2.5F, 1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(40F, 1.5F, -8F);

		gunModel[7].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[7].setRotationPoint(38F, 2.5F, -6.5F);

		gunModel[8].addBox(0F, -17F, 0F, 24, 9, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(40F, -2.5F, 11F);
		gunModel[8].rotateAngleX = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(38F, -4.5F, 11.5F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 10, 1, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(23F, 17F, -2.5F);

		gunModel[11].addBox(0F, -17F, 0F, 8, 11, 5, 0F); // Import Box0
		gunModel[11].setRotationPoint(71F, 1.5F, -4F);

		gunModel[12].addBox(0F, -17F, 0F, 28, 6, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-24F, 0F, -5.5F);

		gunModel[13].addBox(0F, -17F, 0F, 26, 3, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(-23F, -1F, -4.5F);

		gunModel[14].addBox(0F, -17F, 0F, 80, 12, 12, 0F); // Import Box0
		gunModel[14].setRotationPoint(1F, 1F, -7.5F);

		gunModel[15].addBox(0F, -17F, 0F, 24, 9, 4, 0F); // Import Box0
		gunModel[15].setRotationPoint(40F, -13.5F, 11F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 18, 14, 14, 0F); // Import Box0
		gunModel[16].setRotationPoint(64F, 0F, -8.5F);

		gunModel[17].addBox(0F, -17F, 0F, 16, 2, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(79.5F, 10F, -2.5F);

		gunModel[18].addBox(0F, -17F, 0F, 2, 4, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(93.5F, 6F, -2.5F);

		gunModel[19].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import Box0
		gunModel[19].setRotationPoint(92F, 3F, -3F);

		gunModel[20].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		gunModel[20].setRotationPoint(93F, 1F, -2F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 40, 14, 14, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-26F, 12F, -8.5F);



		barrelAttachPoint = new Vector3f(113F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(26F /16F, 16F /16F, 4F /16F);

		scopeAttachPoint = new Vector3f(41F /16F, 11F /16F, 8F /16F);

		gripAttachPoint = new Vector3f(42 /16F, 5F /16F, -7F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.END_LOADED;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}