//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NTW20
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

public class ModelNTW20 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelNTW20() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[23];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-25F, 27F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-22F, 16F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-24F, 24F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 37, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-28F, 11F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-26F, 32F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 7, 6, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-34F, 9F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 2, 5, 5, 0F); // Import Box0
		gunModel[6].setRotationPoint(0F, 17F, -2.5F);

		gunModel[7].addBox(0F, -17F, 0F, 121, 5, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-71F, -7F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 40, 3, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(-3F, -10F, -2.5F);

		gunModel[9].addBox(0F, -17F, 0F, 12, 2, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(-12F, 20F, -1.5F);

		gunModel[10].addBox(0F, -17F, 0F, 7, 22, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(-82F, -9F, -3.5F);

		gunModel[11].addBox(0F, -17F, 0F, 121, 5, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(-71F, 6F, -3.5F);

		gunModel[12].addBox(0F, -17F, 0F, 50, 8, 6, 0F); // Import Box0
		gunModel[12].setRotationPoint(-76F, -2F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 18, 10, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(40F, -2.5F, 2F);

		gunModel[14].addBox(0F, -17F, 0F, 18, 10, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(40F, -2.5F, -8F);

		gunModel[15].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[15].setRotationPoint(40F, -18.5F, 12F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[16].setRotationPoint(40F, -6.5F, 12F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 32, 14, 11, 0F); // Import Box0
		gunModel[17].setRotationPoint(3.5F, -9F, 18F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 4, 34, 4, 0F); // Import Box0
		gunModel[18].setRotationPoint(40F, -29.5F, 8F);

		gunModel[19].addBox(0F, -17F, 0F, 4, 34, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(40F, -29.5F, -12F);

		gunModel[20].addBox(0F, -17F, 0F, 4, 16, 4, 0F); // Import Box0
		gunModel[20].setRotationPoint(40F, -43.5F, 9F);
		gunModel[20].rotateAngleX = 1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 94, 4, 4, 0F); // Import Box0
		gunModel[21].setRotationPoint(8F, 9.5F, -2F);

		gunModel[22].addBox(0F, -17F, 0F, 22, 6, 6, 0F); // Import Box0
		gunModel[22].setRotationPoint(74F, 8.5F, -3F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 24, 28, 8, 0F); // Import Box0
		ammoModel[0].setRotationPoint(5.5F, -10F, 28F);
		ammoModel[0].rotateAngleX = 1.57079633F;


		slideModel = new ModelRendererTurbo[13];
		slideModel[0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0
		slideModel[6] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Import Box0
		slideModel[7] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box0
		slideModel[8] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import Box0
		slideModel[9] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import Box0
		slideModel[10] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import Box0
		slideModel[11] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Box0
		slideModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 164, 6, 6, 0F); // Import Box0
		slideModel[0].setRotationPoint(38F, -0.5F, -3F);

		slideModel[1].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		slideModel[1].setRotationPoint(21F, -1.5F, 3F);

		slideModel[2].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		slideModel[2].setRotationPoint(21F, -1.5F, -5F);

		slideModel[3].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		slideModel[3].setRotationPoint(21F, -18.5F, 13F);
		slideModel[3].rotateAngleX = 1.57079633F;

		slideModel[4].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		slideModel[4].setRotationPoint(21F, -8.5F, 13F);
		slideModel[4].rotateAngleX = 1.57079633F;

		slideModel[5].addBox(0F, -17F, 0F, 24, 8, 6, 0F); // Import Box0
		slideModel[5].setRotationPoint(2F, -2F, -3F);

		slideModel[6].addBox(0F, -17F, 0F, 24, 10, 14, 0F); // Import Box0
		slideModel[6].setRotationPoint(200F, -2.5F, -7F);

		slideModel[7].addBox(0F, -17F, 0F, 8, 8, 8, 0F); // Import Box0
		slideModel[7].setRotationPoint(205F, -1.5F, -10F);
		slideModel[7].rotateAngleY = 0.20943951F;

		slideModel[8].addBox(0F, -17F, 0F, 8, 8, 8, 0F); // Import Box0
		slideModel[8].setRotationPoint(202F, -1.5F, 2F);
		slideModel[8].rotateAngleY = -0.20943951F;

		slideModel[9].addBox(0F, -17F, 0F, 8, 8, 8, 0F); // Import Box0
		slideModel[9].setRotationPoint(212F, -1.5F, -10F);
		slideModel[9].rotateAngleY = 0.20943951F;

		slideModel[10].addBox(0F, -17F, 0F, 8, 8, 8, 0F); // Import Box0
		slideModel[10].setRotationPoint(209F, -1.5F, 2F);
		slideModel[10].rotateAngleY = -0.20943951F;

		slideModel[11].addBox(0F, -17F, 0F, 4, 17, 3, 0F); // Import Box0
		slideModel[11].setRotationPoint(-4F, -10F, -12.5F);
		slideModel[11].rotateAngleY = 0.59341195F;
		slideModel[11].rotateAngleZ = -1.18682389F;

		slideModel[12].addBox(0F, -17F, 0F, 6, 7, 5, 0F); // Import Box0
		slideModel[12].setRotationPoint(-12F, -8F, -19F);
		slideModel[12].rotateAngleY = 0.59341195F;
		slideModel[12].rotateAngleZ = -1.18682389F;



		barrelAttachPoint = new Vector3f(107F /16F, 19F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(51F /16F, 15F /16F, 8F /16F);

		scopeAttachPoint = new Vector3f(18F /16F, 26F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(26 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 2F;


		animationType = EnumAnimationType.STRIKER;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}