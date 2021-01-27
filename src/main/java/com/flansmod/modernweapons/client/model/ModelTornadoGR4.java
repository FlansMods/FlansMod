//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TornadoGR4
// Model Creator: 
// Created on: 28.07.2020 - 20:41:01
// Last changed on: 28.07.2020 - 20:41:01

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTornadoGR4 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelTornadoGR4() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[25];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox102
		bodyModel[1] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportImportImportBox285
		bodyModel[2] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[3] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[4] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[5] = new ModelRendererTurbo(this, 1801, 145, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[6] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[7] = new ModelRendererTurbo(this, 1105, 145, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[8] = new ModelRendererTurbo(this, 1961, 65, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[9] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[10] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[12] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[13] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[14] = new ModelRendererTurbo(this, 1633, 49, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[15] = new ModelRendererTurbo(this, 1665, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[16] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[17] = new ModelRendererTurbo(this, 1977, 81, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[18] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[19] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[20] = new ModelRendererTurbo(this, 1697, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[21] = new ModelRendererTurbo(this, 1329, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[22] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[23] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[24] = new ModelRendererTurbo(this, 2017, 73, textureX, textureY); // Import ImportImportImportBox143

		bodyModel[0].addBox(0F, 0F, 0F, 100, 14, 40, 0F); // Import ImportImportImportBox102
		bodyModel[0].setRotationPoint(-76F, -44F, -41F);

		bodyModel[1].addBox(0F, 0F, 0F, 100, 14, 40, 0F); // Import ImportImportImportBox285
		bodyModel[1].setRotationPoint(-76F, -44F, 1F);

		bodyModel[2].addBox(0F, 0F, 0F, 178, 30, 36, 0F); // Import ImportImportImportBox143
		bodyModel[2].setRotationPoint(-81F, -46F, -18F);

		bodyModel[3].addBox(0F, 0F, 0F, 100, 20, 26, 0F); // Import ImportImportImportBox143
		bodyModel[3].setRotationPoint(-76F, -60F, -13F);
		bodyModel[3].rotateAngleZ = -0.03490659F;

		bodyModel[4].addBox(0F, 0F, 0F, 90, 20, 20, 0F); // Import ImportImportImportBox143
		bodyModel[4].setRotationPoint(-74F, -62F, -10F);
		bodyModel[4].rotateAngleZ = -0.03490659F;

		bodyModel[5].addBox(0F, 0F, 0F, 40, 24, 44, 0F); // Import ImportImportImportBox143
		bodyModel[5].setRotationPoint(58F, -45F, -22F);

		bodyModel[6].addBox(0F, 0F, 0F, 83, 10, 7, 0F); // Import ImportImportImportBox143
		bodyModel[6].setRotationPoint(22F, -55F, -4F);

		bodyModel[7].addBox(0F, 0F, 0F, 51, 7, 24, 0F); // Import ImportImportImportBox143
		bodyModel[7].setRotationPoint(-122F, -24F, -12F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 20, 12, 0F); // Import ImportImportImportBox143
		bodyModel[8].setRotationPoint(-84F, -54F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 6, 6, 12, 0F); // Import ImportImportImportBox143
		bodyModel[9].setRotationPoint(-86F, -62F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[10].setRotationPoint(-82F, -61F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[11].setRotationPoint(-82F, -61F, 4F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[12].setRotationPoint(-87F, -53F, -5F);
		bodyModel[12].rotateAngleZ = 0.17453293F;

		bodyModel[13].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[13].setRotationPoint(-86F, -46F, -5F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[14].setRotationPoint(-86F, -39F, -5F);
		bodyModel[14].rotateAngleZ = -0.31415927F;

		bodyModel[15].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Import ImportImportImportBox143
		bodyModel[15].setRotationPoint(-92F, -34F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 8, 8, 0F); // Import ImportImportImportBox143
		bodyModel[16].setRotationPoint(-92F, -33F, -4F);
		bodyModel[16].rotateAngleZ = -0.52359878F;

		bodyModel[17].addBox(0F, 0F, 0F, 10, 3, 18, 0F); // Import ImportImportImportBox143
		bodyModel[17].setRotationPoint(-118F, -42F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 50, 20, 1, 0F); // Import ImportImportImportBox143
		bodyModel[18].setRotationPoint(-121F, -44F, -12F);

		bodyModel[19].addBox(0F, 0F, 0F, 50, 20, 1, 0F); // Import ImportImportImportBox143
		bodyModel[19].setRotationPoint(-121F, -44F, 11F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 20, 24, 0F); // Import ImportImportImportBox143
		bodyModel[20].setRotationPoint(-122F, -44F, -12F);

		bodyModel[21].addBox(0F, 0F, 0F, 50, 20, 1, 0F); // Import ImportImportImportBox143
		bodyModel[21].setRotationPoint(-121F, -44F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 50, 20, 1, 0F); // Import ImportImportImportBox143
		bodyModel[22].setRotationPoint(-121F, -44F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Import ImportImportImportBox143
		bodyModel[23].setRotationPoint(-121F, -44F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 8, 14, 0F); // Import ImportImportImportBox143
		bodyModel[24].setRotationPoint(-124F, -58F, -7F);


		noseModel = new ModelRendererTurbo[10];
		noseModel[0] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[1] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[2] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[3] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[4] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[5] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import ImportImportImportBox143
		noseModel[6] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Import ImportImportImportBox143
		noseModel[7] = new ModelRendererTurbo(this, 1193, 49, textureX, textureY); // Import ImportImportImportBox143
		noseModel[8] = new ModelRendererTurbo(this, 1841, 17, textureX, textureY); // Import ImportImportImportBox143
		noseModel[9] = new ModelRendererTurbo(this, 1433, 49, textureX, textureY); // Import ImportImportImportBox143

		noseModel[0].addBox(0F, 0F, 0F, 20, 21, 16, 0F); // Import ImportImportImportBox143
		noseModel[0].setRotationPoint(-142F, -44F, -8F);

		noseModel[1].addBox(0F, 0F, 0F, 24, 16, 12, 0F); // Import ImportImportImportBox143
		noseModel[1].setRotationPoint(-164F, -40F, -6F);

		noseModel[2].addBox(0F, 0F, 0F, 16, 13, 8, 0F); // Import ImportImportImportBox143
		noseModel[2].setRotationPoint(-180F, -38F, -4F);

		noseModel[3].addBox(0F, 0F, 0F, 33, 4, 8, 0F); // Import ImportImportImportBox143
		noseModel[3].setRotationPoint(-174F, -42F, -4F);

		noseModel[4].addBox(0F, 0F, 0F, 27, 3, 8, 0F); // Import ImportImportImportBox143
		noseModel[4].setRotationPoint(-156F, -45F, -4F);

		noseModel[5].addBox(0F, 0F, 0F, 40, 8, 11, 0F); // Import ImportImportImportBox143
		noseModel[5].setRotationPoint(-157F, -33F, -5.5F);
		noseModel[5].rotateAngleZ = -0.19198622F;

		noseModel[6].addBox(0F, 0F, 0F, 40, 4, 15, 0F); // Import ImportImportImportBox143
		noseModel[6].setRotationPoint(-170F, -34F, -7.5F);

		noseModel[7].addBox(0F, 0F, 0F, 16, 8, 6, 0F); // Import ImportImportImportBox143
		noseModel[7].setRotationPoint(-184F, -36F, -3F);

		noseModel[8].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Import ImportImportImportBox143
		noseModel[8].setRotationPoint(-204F, -33F, -1F);

		noseModel[9].addBox(0F, 0F, 0F, 12, 4, 11, 0F); // Import ImportImportImportBox143
		noseModel[9].setRotationPoint(-182F, -34F, -5.5F);


		tailModel = new ModelRendererTurbo[11];
		tailModel[0] = new ModelRendererTurbo(this, 1817, 25, textureX, textureY); // Import ImportImportImportBox143
		tailModel[1] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Import ImportImportImportBox143
		tailModel[2] = new ModelRendererTurbo(this, 1225, 49, textureX, textureY); // Import ImportImportImportBox143
		tailModel[3] = new ModelRendererTurbo(this, 1465, 49, textureX, textureY); // Import ImportImportImportBox143
		tailModel[4] = new ModelRendererTurbo(this, 1649, 49, textureX, textureY); // Import ImportImportImportBox143
		tailModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportImportImportBox87
		tailModel[6] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import ImportImportImportBox143
		tailModel[7] = new ModelRendererTurbo(this, 1105, 97, textureX, textureY); // Import ImportImportImportBox143
		tailModel[8] = new ModelRendererTurbo(this, 665, 177, textureX, textureY); // Import ImportImportImportBox143
		tailModel[9] = new ModelRendererTurbo(this, 1473, 89, textureX, textureY); // Import ImportImportImportBox87
		tailModel[10] = new ModelRendererTurbo(this, 1561, 89, textureX, textureY); // Import ImportImportImportBox87

		tailModel[0].addBox(0F, 0F, 0F, 54, 22, 20, 0F); // Import ImportImportImportBox143
		tailModel[0].setRotationPoint(60F, -44F, 1F);

		tailModel[1].addBox(0F, 0F, 0F, 90, 18, 26, 0F); // Import ImportImportImportBox143
		tailModel[1].setRotationPoint(-78F, -42F, 11F);

		tailModel[2].addBox(0F, 0F, 0F, 90, 18, 26, 0F); // Import ImportImportImportBox143
		tailModel[2].setRotationPoint(-78F, -42F, -37F);

		tailModel[3].addBox(0F, 0F, 0F, 70, 12, 20, 0F); // Import ImportImportImportBox143
		tailModel[3].setRotationPoint(-80F, -40F, 14F);

		tailModel[4].addBox(0F, 0F, 0F, 70, 12, 20, 0F); // Import ImportImportImportBox143
		tailModel[4].setRotationPoint(-80F, -40F, -34F);

		tailModel[5].addBox(0F, 0F, 0F, 26, 70, 1, 0F); // Import ImportImportImportBox87
		tailModel[5].setRotationPoint(95F, -114F, -1F);
		tailModel[5].rotateAngleZ = -0.48869219F;

		tailModel[6].addBox(0F, 0F, 0F, 98, 10, 24, 0F); // Import ImportImportImportBox143
		tailModel[6].setRotationPoint(5F, -41F, 8F);

		tailModel[7].addBox(0F, 0F, 0F, 54, 22, 20, 0F); // Import ImportImportImportBox143
		tailModel[7].setRotationPoint(60F, -44F, -21F);

		tailModel[8].addBox(0F, 0F, 0F, 98, 10, 24, 0F); // Import ImportImportImportBox143
		tailModel[8].setRotationPoint(5F, -41F, -32F);

		tailModel[9].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[9].setRotationPoint(78F, -38F, -96F);
		tailModel[9].rotateAngleX = 1.57079633F;
		tailModel[9].rotateAngleY = 0.13962634F;

		tailModel[10].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[10].setRotationPoint(70F, -38F, 32F);
		tailModel[10].rotateAngleX = 1.57079633F;
		tailModel[10].rotateAngleY = -0.13962634F;


		leftWingModel = new ModelRendererTurbo[5];
		leftWingModel[0] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[1] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[2] = new ModelRendererTurbo(this, 1369, 89, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[3] = new ModelRendererTurbo(this, 1665, 89, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[4] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Import ImportImportImportBox105

		leftWingModel[0].addBox(0F, 0F, 0F, 40, 3, 110, 0F); // Import ImportImportImportBox105
		leftWingModel[0].setRotationPoint(-43F, -41.5F, -150F);

		leftWingModel[1].addBox(0F, 0F, 0F, 54, 4, 60, 0F); // Import ImportImportImportBox105
		leftWingModel[1].setRotationPoint(-53F, -42F, -99F);

		leftWingModel[2].addBox(0F, 0F, 0F, 5, 2, 90, 0F); // Import ImportImportImportBox105
		leftWingModel[2].setRotationPoint(-57F, -41F, -128F);

		leftWingModel[3].addBox(0F, 0F, 0F, 3, 1, 86, 0F); // Import ImportImportImportBox105
		leftWingModel[3].setRotationPoint(-58F, -40.5F, -126F);

		leftWingModel[4].addBox(0F, 0F, 0F, 10, 3, 100, 0F); // Import ImportImportImportBox105
		leftWingModel[4].setRotationPoint(-53F, -41.5F, -141F);


		rightWingModel = new ModelRendererTurbo[5];
		rightWingModel[0] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[1] = new ModelRendererTurbo(this, 1777, 73, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[2] = new ModelRendererTurbo(this, 1561, 89, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[3] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[4] = new ModelRendererTurbo(this, 1201, 97, textureX, textureY); // Import ImportImportImportBox322

		rightWingModel[0].addBox(0F, 0F, 0F, 40, 3, 110, 0F); // Import ImportImportImportBox322
		rightWingModel[0].setRotationPoint(-43F, -41.5F, 40F);

		rightWingModel[1].addBox(0F, 0F, 0F, 54, 4, 60, 0F); // Import ImportImportImportBox322
		rightWingModel[1].setRotationPoint(-53F, -42F, 39F);

		rightWingModel[2].addBox(0F, 0F, 0F, 5, 2, 90, 0F); // Import ImportImportImportBox322
		rightWingModel[2].setRotationPoint(-57F, -41F, 38F);

		rightWingModel[3].addBox(0F, 0F, 0F, 3, 1, 86, 0F); // Import ImportImportImportBox322
		rightWingModel[3].setRotationPoint(-58F, -40.5F, 40F);

		rightWingModel[4].addBox(0F, 0F, 0F, 10, 3, 100, 0F); // Import ImportImportImportBox322
		rightWingModel[4].setRotationPoint(-53F, -41.5F, 41F);


		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Import ImportImportImportBox87

		yawFlapModel[0].addBox(0F, 0F, 0F, 26, 68, 3, 0F); // Import ImportImportImportBox87
		yawFlapModel[0].setRotationPoint(94F, -116F, -2F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Import ImportImportImportBox87

		pitchFlapLeftModel[0].addBox(0F, 0F, 0F, 26, 68, 3, 0F); // Import ImportImportImportBox87
		pitchFlapLeftModel[0].setRotationPoint(88F, -37F, -96F);
		pitchFlapLeftModel[0].rotateAngleX = 1.57079633F;


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Import ImportImportImportBox87

		pitchFlapRightModel[0].addBox(0F, 0F, 0F, 26, 68, 3, 0F); // Import ImportImportImportBox87
		pitchFlapRightModel[0].setRotationPoint(89F, -37F, 28F);
		pitchFlapRightModel[0].rotateAngleX = 1.57079633F;


		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Import ImportImportImportBox105
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 1473, 89, textureX, textureY); // Import ImportImportImportBox105

		pitchFlapLeftWingModel[0].addBox(0F, 0F, 0F, 6, 2, 90, 0F); // Import ImportImportImportBox105
		pitchFlapLeftWingModel[0].setRotationPoint(-7F, -41F, -140F);

		pitchFlapLeftWingModel[1].addBox(0F, 0F, 0F, 2, 1, 80, 0F); // Import ImportImportImportBox105
		pitchFlapLeftWingModel[1].setRotationPoint(-2F, -40F, -135F);


		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Import ImportImportImportBox322
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Import ImportImportImportBox322

		pitchFlapRightWingModel[0].addBox(0F, 0F, 0F, 6, 2, 90, 0F); // Import ImportImportImportBox322
		pitchFlapRightWingModel[0].setRotationPoint(-7F, -41F, 50F);

		pitchFlapRightWingModel[1].addBox(0F, 0F, 0F, 2, 1, 80, 0F); // Import ImportImportImportBox322
		pitchFlapRightWingModel[1].setRotationPoint(-2F, -40F, 55F);


		bodyWheelModel = new ModelRendererTurbo[2];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox266
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Import ImportImportImportBox143

		bodyWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		bodyWheelModel[0].setRotationPoint(-88F, -19F, -1F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		bodyWheelModel[1].setRotationPoint(-93F, 1F, -4F);
		bodyWheelModel[1].rotateAngleZ = 0.78539816F;


		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportImportImportBox266
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1313, 1, textureX, textureY); // Import ImportImportImportBox143

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		leftWingWheelModel[0].setRotationPoint(14F, -19F, -16F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		leftWingWheelModel[1].setRotationPoint(9F, 1F, -19F);
		leftWingWheelModel[1].rotateAngleZ = 0.78539816F;


		rightWingWheelModel = new ModelRendererTurbo[2];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1953, 17, textureX, textureY); // Import ImportImportImportBox266
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Import ImportImportImportBox143

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		rightWingWheelModel[0].setRotationPoint(14F, -19F, 14F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		rightWingWheelModel[1].setRotationPoint(9F, 1F, 11F);
		rightWingWheelModel[1].rotateAngleZ = 0.78539816F;


		bodyDoorCloseModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 1489, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Import ImportImportImportBox143

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 20, 20, 18, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[0].setRotationPoint(-86F, -64F, -9F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.20943951F;

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 14, 20, 19, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[1].setRotationPoint(-100F, -64F, -9.5F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[2].addBox(0F, 0F, 0F, 30, 20, 18, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[2].setRotationPoint(-121F, -45F, -9F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.6981317F;

		bodyDoorCloseModel[3].addBox(0F, 0F, 0F, 2, 20, 20, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[3].setRotationPoint(-100F, -65F, -10F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[4].addBox(0F, 0F, 0F, 2, 20, 20, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[4].setRotationPoint(-86F, -65F, -10F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[5].addBox(0F, 0F, 0F, 51, 2, 24, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[5].setRotationPoint(-122F, -46F, -12F);



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