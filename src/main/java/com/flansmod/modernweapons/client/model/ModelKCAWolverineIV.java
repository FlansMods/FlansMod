//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KCAWolverineIV
// Model Creator: 
// Created on: 28.07.2020 - 20:41:01
// Last changed on: 28.07.2020 - 20:41:01

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKCAWolverineIV extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelKCAWolverineIV() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[26];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox102
		bodyModel[1] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import ImportImportImportBox285
		bodyModel[2] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[3] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[4] = new ModelRendererTurbo(this, 1233, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[5] = new ModelRendererTurbo(this, 1745, 25, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[6] = new ModelRendererTurbo(this, 1681, 177, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[7] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[8] = new ModelRendererTurbo(this, 1441, 49, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[9] = new ModelRendererTurbo(this, 1681, 49, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[10] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[12] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[13] = new ModelRendererTurbo(this, 1601, 41, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[14] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[15] = new ModelRendererTurbo(this, 1145, 81, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[16] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[17] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[18] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[19] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[20] = new ModelRendererTurbo(this, 1025, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[21] = new ModelRendererTurbo(this, 1441, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[22] = new ModelRendererTurbo(this, 1241, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[23] = new ModelRendererTurbo(this, 1889, 121, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[24] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[25] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Import ImportImportImportBox143

		bodyModel[0].addBox(0F, 0F, 0F, 120, 14, 40, 0F); // Import ImportImportImportBox102
		bodyModel[0].setRotationPoint(-70F, -44F, -41F);

		bodyModel[1].addBox(0F, 0F, 0F, 120, 14, 40, 0F); // Import ImportImportImportBox285
		bodyModel[1].setRotationPoint(-70F, -44F, 1F);

		bodyModel[2].addBox(0F, 0F, 0F, 190, 36, 36, 0F); // Import ImportImportImportBox143
		bodyModel[2].setRotationPoint(-79F, -52F, -18F);

		bodyModel[3].addBox(0F, 0F, 0F, 51, 7, 24, 0F); // Import ImportImportImportBox143
		bodyModel[3].setRotationPoint(-130F, -24F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 100, 20, 26, 0F); // Import ImportImportImportBox143
		bodyModel[4].setRotationPoint(-81F, -60F, -13F);
		bodyModel[4].rotateAngleZ = -0.03490659F;

		bodyModel[5].addBox(0F, 0F, 0F, 128, 20, 20, 0F); // Import ImportImportImportBox143
		bodyModel[5].setRotationPoint(-79F, -67F, -10F);
		bodyModel[5].rotateAngleZ = -0.05235988F;

		bodyModel[6].addBox(0F, 0F, 0F, 110, 28, 44, 0F); // Import ImportImportImportBox143
		bodyModel[6].setRotationPoint(-13F, -48F, -22F);

		bodyModel[7].addBox(0F, 0F, 0F, 83, 10, 7, 0F); // Import ImportImportImportBox143
		bodyModel[7].setRotationPoint(22F, -55F, -4F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 20, 12, 0F); // Import ImportImportImportBox143
		bodyModel[8].setRotationPoint(-92F, -58F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 8, 12, 0F); // Import ImportImportImportBox143
		bodyModel[9].setRotationPoint(-96F, -68F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[10].setRotationPoint(-90F, -65F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[11].setRotationPoint(-90F, -65F, 4F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[12].setRotationPoint(-95F, -57F, -5F);
		bodyModel[12].rotateAngleZ = 0.17453293F;

		bodyModel[13].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[13].setRotationPoint(-94F, -50F, -5F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[14].setRotationPoint(-94F, -43F, -5F);
		bodyModel[14].rotateAngleZ = -0.31415927F;

		bodyModel[15].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Import ImportImportImportBox143
		bodyModel[15].setRotationPoint(-100F, -38F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 8, 8, 0F); // Import ImportImportImportBox143
		bodyModel[16].setRotationPoint(-100F, -37F, -4F);
		bodyModel[16].rotateAngleZ = -0.52359878F;

		bodyModel[17].addBox(0F, 0F, 0F, 10, 3, 18, 0F); // Import ImportImportImportBox143
		bodyModel[17].setRotationPoint(-126F, -46F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[18].setRotationPoint(-129F, -48F, -12F);

		bodyModel[19].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[19].setRotationPoint(-129F, -48F, 11F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 24, 24, 0F); // Import ImportImportImportBox143
		bodyModel[20].setRotationPoint(-130F, -48F, -12F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 24, 24, 0F); // Import ImportImportImportBox143
		bodyModel[21].setRotationPoint(-80F, -48F, -12F);

		bodyModel[22].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[22].setRotationPoint(-129F, -48F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[23].setRotationPoint(-129F, -48F, 10F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 24, 20, 0F); // Import ImportImportImportBox143
		bodyModel[24].setRotationPoint(-129F, -48F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 8, 14, 0F); // Import ImportImportImportBox143
		bodyModel[25].setRotationPoint(-125F, -58F, -7F);


		noseModel = new ModelRendererTurbo[17];
		noseModel[0] = new ModelRendererTurbo(this, 1113, 33, textureX, textureY); // Import ImportImportImportBox143
		noseModel[1] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[2] = new ModelRendererTurbo(this, 1209, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[3] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[4] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[5] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[6] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Import ImportImportImportBox143
		noseModel[7] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[8] = new ModelRendererTurbo(this, 1761, 17, textureX, textureY); // Import ImportImportImportBox143
		noseModel[9] = new ModelRendererTurbo(this, 1177, 33, textureX, textureY); // Import ImportImportImportBox143
		noseModel[10] = new ModelRendererTurbo(this, 1145, 105, textureX, textureY); // Import ImportImportBox266
		noseModel[11] = new ModelRendererTurbo(this, 1145, 113, textureX, textureY); // Import ImportImportBox266
		noseModel[12] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Import ImportImportBox266
		noseModel[13] = new ModelRendererTurbo(this, 2025, 17, textureX, textureY); // Import ImportImportBox143
		noseModel[14] = new ModelRendererTurbo(this, 1057, 89, textureX, textureY); // Import ImportImportBox143
		noseModel[15] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import ImportImportBox143
		noseModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportImportBox143

		noseModel[0].addBox(0F, 0F, 0F, 20, 21, 16, 0F); // Import ImportImportImportBox143
		noseModel[0].setRotationPoint(-142F, -44F, -8F);

		noseModel[1].addBox(0F, 0F, 0F, 24, 16, 12, 0F); // Import ImportImportImportBox143
		noseModel[1].setRotationPoint(-164F, -41F, -6F);

		noseModel[2].addBox(0F, 0F, 0F, 16, 14, 8, 0F); // Import ImportImportImportBox143
		noseModel[2].setRotationPoint(-180F, -41F, -4F);

		noseModel[3].addBox(0F, 0F, 0F, 33, 2, 8, 0F); // Import ImportImportImportBox143
		noseModel[3].setRotationPoint(-174F, -43F, -4F);

		noseModel[4].addBox(0F, 0F, 0F, 27, 2, 8, 0F); // Import ImportImportImportBox143
		noseModel[4].setRotationPoint(-156F, -45F, -4F);

		noseModel[5].addBox(0F, 0F, 0F, 36, 8, 11, 0F); // Import ImportImportImportBox143
		noseModel[5].setRotationPoint(-163F, -32F, -5.5F);
		noseModel[5].rotateAngleZ = -0.19198622F;

		noseModel[6].addBox(0F, 0F, 0F, 40, 4, 15, 0F); // Import ImportImportImportBox143
		noseModel[6].setRotationPoint(-170F, -34F, -7.5F);

		noseModel[7].addBox(0F, 0F, 0F, 16, 8, 6, 0F); // Import ImportImportImportBox143
		noseModel[7].setRotationPoint(-184F, -39F, -3F);

		noseModel[8].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Import ImportImportImportBox143
		noseModel[8].setRotationPoint(-210F, -36F, -1F);

		noseModel[9].addBox(0F, 0F, 0F, 12, 4, 11, 0F); // Import ImportImportImportBox143
		noseModel[9].setRotationPoint(-182F, -34F, -5.5F);

		noseModel[10].addBox(0F, 0F, 0F, 40, 2, 2, 0F); // Import ImportImportBox266
		noseModel[10].setRotationPoint(-150F, -15F, -1F);
		noseModel[10].rotateAngleX = 0.78539816F;

		noseModel[11].addBox(0F, 0F, 0F, 40, 2, 2, 0F); // Import ImportImportBox266
		noseModel[11].setRotationPoint(-150F, -12F, 1F);
		noseModel[11].rotateAngleX = 0.78539816F;

		noseModel[12].addBox(0F, 0F, 0F, 40, 2, 2, 0F); // Import ImportImportBox266
		noseModel[12].setRotationPoint(-150F, -12F, -3F);
		noseModel[12].rotateAngleX = 0.78539816F;

		noseModel[13].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Import ImportImportBox143
		noseModel[13].setRotationPoint(-147F, -17F, -3F);

		noseModel[14].addBox(0F, 0F, 0F, 12, 9, 9, 0F); // Import ImportImportBox143
		noseModel[14].setRotationPoint(-123F, -17F, -4F);

		noseModel[15].addBox(0F, 0F, 0F, 20, 12, 11, 0F); // Import ImportImportBox143
		noseModel[15].setRotationPoint(-113F, -17F, -5F);

		noseModel[16].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Import ImportImportBox143
		noseModel[16].setRotationPoint(-145F, -17F, -3F);


		tailModel = new ModelRendererTurbo[16];
		tailModel[0] = new ModelRendererTurbo(this, 1193, 49, textureX, textureY); // Import ImportImportImportBox143
		tailModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportImportImportBox143
		tailModel[2] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import ImportImportImportBox143
		tailModel[3] = new ModelRendererTurbo(this, 1553, 41, textureX, textureY); // Import ImportImportImportBox143
		tailModel[4] = new ModelRendererTurbo(this, 1617, 41, textureX, textureY); // Import ImportImportImportBox143
		tailModel[5] = new ModelRendererTurbo(this, 1345, 49, textureX, textureY); // Import ImportImportImportBox87
		tailModel[6] = new ModelRendererTurbo(this, 1553, 73, textureX, textureY); // Import ImportImportImportBox143
		tailModel[7] = new ModelRendererTurbo(this, 1889, 73, textureX, textureY); // Import ImportImportImportBox143
		tailModel[8] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Import ImportImportImportBox143
		tailModel[9] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Import ImportImportImportBox87
		tailModel[10] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import ImportImportImportBox87
		tailModel[11] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Import ImportImportImportBox143
		tailModel[12] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import ImportImportImportBox143
		tailModel[13] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Import ImportImportImportBox87
		tailModel[14] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import ImportImportImportBox87
		tailModel[15] = new ModelRendererTurbo(this, 1025, 81, textureX, textureY); // Import ImportImportImportBox87

		tailModel[0].addBox(0F, 0F, 0F, 54, 22, 20, 0F); // Import ImportImportImportBox143
		tailModel[0].setRotationPoint(60F, -44F, 1F);

		tailModel[1].addBox(0F, 0F, 0F, 90, 10, 26, 0F); // Import ImportImportImportBox143
		tailModel[1].setRotationPoint(-68F, -45F, 11F);

		tailModel[2].addBox(0F, 0F, 0F, 90, 10, 26, 0F); // Import ImportImportImportBox143
		tailModel[2].setRotationPoint(-68F, -45F, -37F);

		tailModel[3].addBox(0F, 0F, 0F, 10, 8, 20, 0F); // Import ImportImportImportBox143
		tailModel[3].setRotationPoint(-73F, -41F, 14F);

		tailModel[4].addBox(0F, 0F, 0F, 10, 8, 20, 0F); // Import ImportImportImportBox143
		tailModel[4].setRotationPoint(-73F, -41F, -34F);

		tailModel[5].addBox(0F, 0F, 0F, 28, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[5].setRotationPoint(95F, -108F, -1F);
		tailModel[5].rotateAngleZ = -0.52359878F;

		tailModel[6].addBox(0F, 0F, 0F, 98, 10, 24, 0F); // Import ImportImportImportBox143
		tailModel[6].setRotationPoint(5F, -41F, 8F);

		tailModel[7].addBox(0F, 0F, 0F, 54, 22, 20, 0F); // Import ImportImportImportBox143
		tailModel[7].setRotationPoint(60F, -44F, -21F);

		tailModel[8].addBox(0F, 0F, 0F, 98, 10, 24, 0F); // Import ImportImportImportBox143
		tailModel[8].setRotationPoint(5F, -41F, -32F);

		tailModel[9].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[9].setRotationPoint(92F, -38F, -91F);
		tailModel[9].rotateAngleX = 1.57079633F;
		tailModel[9].rotateAngleY = 0.38397244F;

		tailModel[10].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[10].setRotationPoint(70F, -38F, 32F);
		tailModel[10].rotateAngleX = 1.57079633F;
		tailModel[10].rotateAngleY = -0.41887902F;

		tailModel[11].addBox(0F, 0F, 0F, 100, 6, 26, 0F); // Import ImportImportImportBox143
		tailModel[11].setRotationPoint(-68F, -31F, 11F);

		tailModel[12].addBox(0F, 0F, 0F, 100, 6, 26, 0F); // Import ImportImportImportBox143
		tailModel[12].setRotationPoint(-68F, -31F, -37F);

		tailModel[13].addBox(0F, 0F, 0F, 37, 2, 5, 0F); // Import ImportImportImportBox87
		tailModel[13].setRotationPoint(88F, -118F, -3F);

		tailModel[14].addBox(0F, 0F, 0F, 38, 2, 5, 0F); // Import ImportImportImportBox87
		tailModel[14].setRotationPoint(88F, -36F, 96F);
		tailModel[14].rotateAngleX = 1.57079633F;

		tailModel[15].addBox(0F, 0F, 0F, 38, 2, 5, 0F); // Import ImportImportImportBox87
		tailModel[15].setRotationPoint(88F, -36F, -97F);
		tailModel[15].rotateAngleX = 1.57079633F;


		leftWingModel = new ModelRendererTurbo[6];
		leftWingModel[0] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[1] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[2] = new ModelRendererTurbo(this, 1321, 49, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[4] = new ModelRendererTurbo(this, 1145, 97, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[5] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Import ImportImportImportBox105

		leftWingModel[0].addBox(0F, 0F, 0F, 40, 3, 98, 0F); // Import ImportImportImportBox105
		leftWingModel[0].setRotationPoint(-43F, -41.5F, -144F);

		leftWingModel[1].addBox(0F, 0F, 0F, 54, 4, 60, 0F); // Import ImportImportImportBox105
		leftWingModel[1].setRotationPoint(-53F, -42F, -99F);

		leftWingModel[2].addBox(0F, 0F, 0F, 12, 2, 90, 0F); // Import ImportImportImportBox105
		leftWingModel[2].setRotationPoint(-7F, -41F, -140F);

		leftWingModel[3].addBox(0F, 0F, 0F, 5, 2, 90, 0F); // Import ImportImportImportBox105
		leftWingModel[3].setRotationPoint(-57F, -41F, -128F);

		leftWingModel[4].addBox(0F, 0F, 0F, 3, 1, 86, 0F); // Import ImportImportImportBox105
		leftWingModel[4].setRotationPoint(-58F, -40.5F, -126F);

		leftWingModel[5].addBox(0F, 0F, 0F, 10, 3, 100, 0F); // Import ImportImportImportBox105
		leftWingModel[5].setRotationPoint(-53F, -41.5F, -141F);


		rightWingModel = new ModelRendererTurbo[6];
		rightWingModel[0] = new ModelRendererTurbo(this, 1705, 73, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[1] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[2] = new ModelRendererTurbo(this, 1025, 73, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[3] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[4] = new ModelRendererTurbo(this, 1441, 113, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[5] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Import ImportImportImportBox322

		rightWingModel[0].addBox(0F, 0F, 0F, 40, 3, 98, 0F); // Import ImportImportImportBox322
		rightWingModel[0].setRotationPoint(-43F, -41.5F, 46F);

		rightWingModel[1].addBox(0F, 0F, 0F, 54, 4, 60, 0F); // Import ImportImportImportBox322
		rightWingModel[1].setRotationPoint(-53F, -42F, 39F);

		rightWingModel[2].addBox(0F, 0F, 0F, 12, 2, 90, 0F); // Import ImportImportImportBox322
		rightWingModel[2].setRotationPoint(-7F, -41F, 50F);

		rightWingModel[3].addBox(0F, 0F, 0F, 5, 2, 90, 0F); // Import ImportImportImportBox322
		rightWingModel[3].setRotationPoint(-57F, -41F, 38F);

		rightWingModel[4].addBox(0F, 0F, 0F, 3, 1, 86, 0F); // Import ImportImportImportBox322
		rightWingModel[4].setRotationPoint(-58F, -40.5F, 40F);

		rightWingModel[5].addBox(0F, 0F, 0F, 10, 3, 100, 0F); // Import ImportImportImportBox322
		rightWingModel[5].setRotationPoint(-53F, -41.5F, 41F);


		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 1489, 41, textureX, textureY); // Import ImportImportImportBox87

		yawFlapModel[0].addBox(0F, 0F, 0F, 26, 68, 3, 0F); // Import ImportImportImportBox87
		yawFlapModel[0].setRotationPoint(94F, -116F, -2F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportImportImportBox87

		pitchFlapLeftModel[0].addBox(0F, 0F, 0F, 26, 68, 3, 0F); // Import ImportImportImportBox87
		pitchFlapLeftModel[0].setRotationPoint(93F, -37F, -96F);
		pitchFlapLeftModel[0].rotateAngleX = 1.57079633F;


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import ImportImportImportBox87

		pitchFlapRightModel[0].addBox(0F, 0F, 0F, 26, 68, 3, 0F); // Import ImportImportImportBox87
		pitchFlapRightModel[0].setRotationPoint(94F, -37F, 28F);
		pitchFlapRightModel[0].rotateAngleX = 1.57079633F;


		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1537, 113, textureX, textureY); // Import ImportImportImportBox105

		pitchFlapLeftWingModel[0].addBox(0F, 0F, 0F, 12, 1, 80, 0F); // Import ImportImportImportBox105
		pitchFlapLeftWingModel[0].setRotationPoint(-2F, -40F, -135F);


		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1249, 145, textureX, textureY); // Import ImportImportImportBox322

		pitchFlapRightWingModel[0].addBox(0F, 0F, 0F, 12, 1, 80, 0F); // Import ImportImportImportBox322
		pitchFlapRightWingModel[0].setRotationPoint(-2F, -40F, 55F);


		bodyWheelModel = new ModelRendererTurbo[2];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox266
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Import ImportImportImportBox143

		bodyWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		bodyWheelModel[0].setRotationPoint(-88F, -19F, -1F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		bodyWheelModel[1].setRotationPoint(-93F, 1F, -4F);
		bodyWheelModel[1].rotateAngleZ = 0.78539816F;


		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportImportImportBox266
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Import ImportImportImportBox143

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		leftWingWheelModel[0].setRotationPoint(14F, -19F, -16F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		leftWingWheelModel[1].setRotationPoint(9F, 1F, -19F);
		leftWingWheelModel[1].rotateAngleZ = 0.78539816F;


		rightWingWheelModel = new ModelRendererTurbo[2];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Import ImportImportImportBox266
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Import ImportImportImportBox143

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		rightWingWheelModel[0].setRotationPoint(14F, -19F, 14F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		rightWingWheelModel[1].setRotationPoint(9F, 1F, 11F);
		rightWingWheelModel[1].rotateAngleZ = 0.78539816F;


		bodyDoorCloseModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1489, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1561, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 1665, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 1649, 113, textureX, textureY); // Import ImportImportImportBox143

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 20, 20, 18, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[0].setRotationPoint(-88F, -68F, -9F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.20943951F;

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 14, 20, 19, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[1].setRotationPoint(-102F, -68F, -9.5F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[2].addBox(0F, 0F, 0F, 30, 20, 18, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[2].setRotationPoint(-125F, -49F, -9F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.6981317F;

		bodyDoorCloseModel[3].addBox(0F, 0F, 0F, 2, 20, 20, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[3].setRotationPoint(-102F, -69F, -10F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[4].addBox(0F, 0F, 0F, 2, 20, 20, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[4].setRotationPoint(-88F, -69F, -10F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[5].addBox(0F, 0F, 0F, 51, 2, 24, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[5].setRotationPoint(-130F, -50F, -12F);



		propellerModels = new ModelRendererTurbo[1][0];
		propellerModels[0] = makeProp1(54F, 0F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}