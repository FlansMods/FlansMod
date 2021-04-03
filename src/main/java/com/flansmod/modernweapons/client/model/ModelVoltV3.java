//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: VoltV3
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

public class ModelVoltV3 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelVoltV3() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[23];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 12, 14, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-5.5F, 15F, -3F);
		gunModel[0].rotateAngleZ = -0.13962634F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-3F, 3F, -2.5F);
		gunModel[1].rotateAngleZ = -0.13962634F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 21, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-5.75F, 6F, -2F);
		gunModel[2].rotateAngleZ = -0.13962634F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(5.5F, 15F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 6, 30, 5, 0F); // Import Box0
		gunModel[4].setRotationPoint(-24F, -18F, -2.5F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 56, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(52F, -25F, -2F);
		gunModel[5].rotateAngleZ = -1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 16, 50, 8, 0F); // Import Box0
		gunModel[6].setRotationPoint(70F, -21F, -4F);
		gunModel[6].rotateAngleZ = -1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 4, 10, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(78F, -15F, -2F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 10, 50, 9, 0F); // Import Box0
		gunModel[8].setRotationPoint(26F, -19F, -4.5F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 4, 30, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(8F, -23F, -3F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 18, 28, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(20F, 3F, -3.5F);

		gunModel[11].addBox(0F, -17F, 0F, 40, 8, 6, 0F); // Import Box0
		gunModel[11].setRotationPoint(-47F, 0F, -3F);

		gunModel[12].addBox(0F, -17F, 0F, 30, 6, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(-36F, 15F, -2F);
		gunModel[12].rotateAngleZ = 0.6981317F;

		gunModel[13].addBox(0F, -17F, 0F, 21, 6, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(-33F, 6F, -3F);
		gunModel[13].rotateAngleZ = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 32, 6, 8, 0F); // Import Box0
		gunModel[14].setRotationPoint(-49F, -3F, -4F);

		gunModel[15].addBox(0F, -17F, 0F, 23, 5, 7, 0F); // Import Box0
		gunModel[15].setRotationPoint(-31F, 7F, -3.5F);
		gunModel[15].rotateAngleZ = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 47, 3, 5, 0F); // Import Box0
		gunModel[16].setRotationPoint(-48F, -4F, -2.5F);

		gunModel[17].addBox(0F, -17F, 0F, 6, 20, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(41F, 7F, -2.5F);
		gunModel[17].rotateAngleZ = -0.38397244F;

		gunModel[18].addBox(0F, -17F, 0F, 28, 6, 8, 0F); // Import Box0
		gunModel[18].setRotationPoint(20F, 26F, -4F);

		gunModel[19].addBox(0F, -17F, 0F, 6, 49, 6, 0F); // Import Box0
		gunModel[19].setRotationPoint(69F, -9F, -3F);
		gunModel[19].rotateAngleZ = -1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 4, 6, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(81F, 13F, -2.5F);

		gunModel[21].addBox(0F, -17F, 0F, 10, 7, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(-4F, 23F, -2.5F);
		gunModel[21].rotateAngleZ = -0.13962634F;

		gunModel[22].addBox(0F, -17F, 0F, 6, 49, 6, 0F); // Import Box0
		gunModel[22].setRotationPoint(69F, -23F, -3F);
		gunModel[22].rotateAngleZ = -1.57079633F;


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box0

		defaultBarrelModel[0].addBox(0F, -17F, 0F, 6, 14, 6, 0F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(90F, -16F, -3F);
		defaultBarrelModel[0].rotateAngleZ = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[3];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 34
		defaultScopeModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(15F, -27.25F, 0.5F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[1].setRotationPoint(15F, -27.25F, -1.5F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[2].setRotationPoint(66F, -28.25F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 17, 3, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(23F, 44F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 14, 32, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(22F, 14F, -2F);
		ammoModel[1].rotateAngleZ = 0.06981317F;


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 5, 18, 5, 0F); // Import Box0
		slideModel[0].setRotationPoint(16F, -17.5F, -6.5F);
		slideModel[0].rotateAngleZ = -1.57079633F;

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(2F, -15.5F, -9.5F);
		slideModel[1].rotateAngleZ = -1.57079633F;

		slideModel[2].addBox(0F, -17F, 0F, 2, 3, 3, 0F); // Import Box0
		slideModel[2].setRotationPoint(4F, -16F, -16.5F);
		slideModel[2].rotateAngleY = 0.34906585F;
		slideModel[2].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(93F /16F, 13F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(28F /16F, 25F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(65 /16F, 4F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}