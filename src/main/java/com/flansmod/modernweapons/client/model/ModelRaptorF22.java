//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RaptorF22
// Model Creator: 
// Created on: 28.07.2020 - 20:41:01
// Last changed on: 28.07.2020 - 20:41:01

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRaptorF22 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelRaptorF22() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[26];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox102
		bodyModel[1] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import ImportImportImportBox285
		bodyModel[2] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[3] = new ModelRendererTurbo(this, 1185, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[4] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[5] = new ModelRendererTurbo(this, 1865, 185, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[6] = new ModelRendererTurbo(this, 617, 209, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[7] = new ModelRendererTurbo(this, 1657, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[8] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[11] = new ModelRendererTurbo(this, 1769, 41, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[12] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[13] = new ModelRendererTurbo(this, 1849, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[14] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[16] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[17] = new ModelRendererTurbo(this, 1289, 129, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[18] = new ModelRendererTurbo(this, 1289, 161, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[19] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[20] = new ModelRendererTurbo(this, 769, 209, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[21] = new ModelRendererTurbo(this, 1289, 209, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[22] = new ModelRendererTurbo(this, 1961, 105, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[23] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[24] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[25] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Import ImportImportImportBox143

		bodyModel[0].addBox(0F, 0F, 0F, 160, 14, 40, 0F); // Import ImportImportImportBox102
		bodyModel[0].setRotationPoint(-60F, -40F, -41F);

		bodyModel[1].addBox(0F, 0F, 0F, 160, 14, 40, 0F); // Import ImportImportImportBox285
		bodyModel[1].setRotationPoint(-60F, -40F, 1F);

		bodyModel[2].addBox(0F, 0F, 0F, 190, 28, 10, 0F); // Import ImportImportImportBox143
		bodyModel[2].setRotationPoint(-110F, -45F, -22F);

		bodyModel[3].addBox(0F, 0F, 0F, 100, 20, 26, 0F); // Import ImportImportImportBox143
		bodyModel[3].setRotationPoint(-76F, -60F, -13F);
		bodyModel[3].rotateAngleZ = -0.03490659F;

		bodyModel[4].addBox(0F, 0F, 0F, 90, 20, 18, 0F); // Import ImportImportImportBox143
		bodyModel[4].setRotationPoint(-74F, -62F, -9F);
		bodyModel[4].rotateAngleZ = -0.03490659F;

		bodyModel[5].addBox(0F, 0F, 0F, 30, 24, 44, 0F); // Import ImportImportImportBox143
		bodyModel[5].setRotationPoint(78F, -45F, -22F);

		bodyModel[6].addBox(0F, 0F, 0F, 51, 2, 24, 0F); // Import ImportImportImportBox143
		bodyModel[6].setRotationPoint(-128F, -20F, -12F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 20, 12, 0F); // Import ImportImportImportBox143
		bodyModel[7].setRotationPoint(-90F, -51F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 6, 12, 0F); // Import ImportImportImportBox143
		bodyModel[8].setRotationPoint(-94F, -59F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[9].setRotationPoint(-88F, -58F, -5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[10].setRotationPoint(-88F, -58F, 4F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[11].setRotationPoint(-93F, -50F, -5F);
		bodyModel[11].rotateAngleZ = 0.17453293F;

		bodyModel[12].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[12].setRotationPoint(-92F, -43F, -5F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[13].setRotationPoint(-92F, -36F, -5F);
		bodyModel[13].rotateAngleZ = -0.31415927F;

		bodyModel[14].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Import ImportImportImportBox143
		bodyModel[14].setRotationPoint(-98F, -34F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 8, 8, 0F); // Import ImportImportImportBox143
		bodyModel[15].setRotationPoint(-98F, -33F, -4F);
		bodyModel[15].rotateAngleZ = -0.52359878F;

		bodyModel[16].addBox(0F, 0F, 0F, 10, 3, 18, 0F); // Import ImportImportImportBox143
		bodyModel[16].setRotationPoint(-124F, -42F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[17].setRotationPoint(-127F, -44F, -12F);

		bodyModel[18].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[18].setRotationPoint(-127F, -44F, 11F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 24, 24, 0F); // Import ImportImportImportBox143
		bodyModel[19].setRotationPoint(-128F, -44F, -12F);

		bodyModel[20].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[20].setRotationPoint(-127F, -44F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[21].setRotationPoint(-127F, -44F, 10F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 24, 20, 0F); // Import ImportImportImportBox143
		bodyModel[22].setRotationPoint(-127F, -44F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 190, 28, 10, 0F); // Import ImportImportImportBox143
		bodyModel[23].setRotationPoint(-110F, -45F, 12F);

		bodyModel[24].addBox(0F, 0F, 0F, 190, 28, 24, 0F); // Import ImportImportImportBox143
		bodyModel[24].setRotationPoint(-80F, -45F, -12F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 8, 14, 0F); // Import ImportImportImportBox143
		bodyModel[25].setRotationPoint(-128F, -58F, -7F);


		noseModel = new ModelRendererTurbo[10];
		noseModel[0] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[1] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Import ImportImportImportBox143
		noseModel[2] = new ModelRendererTurbo(this, 1993, 33, textureX, textureY); // Import ImportImportImportBox143
		noseModel[3] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Import ImportImportImportBox143
		noseModel[4] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[5] = new ModelRendererTurbo(this, 1857, 41, textureX, textureY); // Import ImportImportImportBox143
		noseModel[6] = new ModelRendererTurbo(this, 1857, 65, textureX, textureY); // Import ImportImportImportBox143
		noseModel[7] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Import ImportImportImportBox143
		noseModel[8] = new ModelRendererTurbo(this, 1489, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[9] = new ModelRendererTurbo(this, 1385, 49, textureX, textureY); // Import ImportImportImportBox143

		noseModel[0].addBox(0F, 0F, 0F, 20, 21, 16, 0F); // Import ImportImportImportBox143
		noseModel[0].setRotationPoint(-142F, -44.5F, -8F);

		noseModel[1].addBox(0F, 0F, 0F, 24, 16, 12, 0F); // Import ImportImportImportBox143
		noseModel[1].setRotationPoint(-164F, -40F, -6F);

		noseModel[2].addBox(0F, 0F, 0F, 16, 13, 8, 0F); // Import ImportImportImportBox143
		noseModel[2].setRotationPoint(-178F, -38F, -4F);

		noseModel[3].addBox(0F, 0F, 0F, 28, 4, 8, 0F); // Import ImportImportImportBox143
		noseModel[3].setRotationPoint(-168F, -42F, -4F);

		noseModel[4].addBox(0F, 0F, 0F, 22, 3, 8, 0F); // Import ImportImportImportBox143
		noseModel[4].setRotationPoint(-150F, -45F, -4F);

		noseModel[5].addBox(0F, 0F, 0F, 50, 8, 11, 0F); // Import ImportImportImportBox143
		noseModel[5].setRotationPoint(-157F, -31F, -5.5F);
		noseModel[5].rotateAngleZ = -0.08726646F;

		noseModel[6].addBox(0F, 0F, 0F, 40, 4, 15, 0F); // Import ImportImportImportBox143
		noseModel[6].setRotationPoint(-170F, -34F, -7.5F);

		noseModel[7].addBox(0F, 0F, 0F, 16, 8, 6, 0F); // Import ImportImportImportBox143
		noseModel[7].setRotationPoint(-184F, -36F, -3F);

		noseModel[8].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Import ImportImportImportBox143
		noseModel[8].setRotationPoint(-186F, -35F, -2F);

		noseModel[9].addBox(0F, 0F, 0F, 12, 4, 13, 0F); // Import ImportImportImportBox143
		noseModel[9].setRotationPoint(-182F, -34F, -6.5F);


		tailModel = new ModelRendererTurbo[20];
		tailModel[0] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Import ImportImportImportBox87
		tailModel[1] = new ModelRendererTurbo(this, 1041, 41, textureX, textureY); // Import ImportImportImportBox143
		tailModel[2] = new ModelRendererTurbo(this, 1417, 41, textureX, textureY); // Import ImportImportImportBox143
		tailModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportImportImportBox143
		tailModel[4] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import ImportImportImportBox143
		tailModel[5] = new ModelRendererTurbo(this, 1041, 89, textureX, textureY); // Import ImportImportImportBox143
		tailModel[6] = new ModelRendererTurbo(this, 1801, 41, textureX, textureY); // Import ImportImportImportBox87
		tailModel[7] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Import ImportImportImportBox143
		tailModel[8] = new ModelRendererTurbo(this, 1193, 49, textureX, textureY); // Import ImportImportImportBox143
		tailModel[9] = new ModelRendererTurbo(this, 1985, 57, textureX, textureY); // Import ImportImportImportBox87
		tailModel[10] = new ModelRendererTurbo(this, 1489, 89, textureX, textureY); // Import ImportImportImportBox87
		tailModel[11] = new ModelRendererTurbo(this, 1601, 89, textureX, textureY); // Import ImportImportImportBox87
		tailModel[12] = new ModelRendererTurbo(this, 1905, 89, textureX, textureY); // Import ImportImportImportBox87
		tailModel[13] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import ImportImportImportBox143
		tailModel[14] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Import ImportImportImportBox143
		tailModel[15] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Import ImportImportImportBox143
		tailModel[16] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Import ImportImportImportBox87
		tailModel[17] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Import ImportImportImportBox87
		tailModel[18] = new ModelRendererTurbo(this, 1793, 113, textureX, textureY); // Import ImportImportImportBox87
		tailModel[19] = new ModelRendererTurbo(this, 1153, 129, textureX, textureY); // Import ImportImportImportBox87

		tailModel[0].addBox(0F, 0F, 0F, 26, 68, 5, 0F); // Import ImportImportImportBox87
		tailModel[0].setRotationPoint(45F, -99F, -63F);
		tailModel[0].rotateAngleX = 0.38397244F;

		tailModel[1].addBox(0F, 0F, 0F, 54, 22, 20, 0F); // Import ImportImportImportBox143
		tailModel[1].setRotationPoint(60F, -42F, 1F);

		tailModel[2].addBox(0F, 0F, 0F, 162, 14, 26, 0F); // Import ImportImportImportBox143
		tailModel[2].setRotationPoint(-74F, -38F, 11F);

		tailModel[3].addBox(0F, 0F, 0F, 162, 14, 26, 0F); // Import ImportImportImportBox143
		tailModel[3].setRotationPoint(-74F, -38F, -37F);

		tailModel[4].addBox(0F, 0F, 0F, 160, 18, 20, 0F); // Import ImportImportImportBox143
		tailModel[4].setRotationPoint(-76F, -37F, 14F);

		tailModel[5].addBox(0F, 0F, 0F, 160, 18, 20, 0F); // Import ImportImportImportBox143
		tailModel[5].setRotationPoint(-76F, -37F, -34F);

		tailModel[6].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[6].setRotationPoint(46F, -97F, -56.5F);
		tailModel[6].rotateAngleX = 0.38397244F;
		tailModel[6].rotateAngleZ = -0.48869219F;

		tailModel[7].addBox(0F, 0F, 0F, 98, 18, 24, 0F); // Import ImportImportImportBox143
		tailModel[7].setRotationPoint(5F, -47F, 20F);

		tailModel[8].addBox(0F, 0F, 0F, 80, 18, 12, 0F); // Import ImportImportImportBox143
		tailModel[8].setRotationPoint(19F, -51F, 26F);

		tailModel[9].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[9].setRotationPoint(46F, -86F, -57.5F);
		tailModel[9].rotateAngleX = 0.38397244F;
		tailModel[9].rotateAngleZ = 0.52359878F;

		tailModel[10].addBox(0F, 0F, 0F, 26, 68, 5, 0F); // Import ImportImportImportBox87
		tailModel[10].setRotationPoint(45F, -100F, 58F);
		tailModel[10].rotateAngleX = -0.38397244F;

		tailModel[11].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[11].setRotationPoint(46F, -98F, 56.5F);
		tailModel[11].rotateAngleX = -0.38397244F;
		tailModel[11].rotateAngleZ = -0.48869219F;

		tailModel[12].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[12].setRotationPoint(46F, -87F, 56.5F);
		tailModel[12].rotateAngleX = -0.38397244F;
		tailModel[12].rotateAngleZ = 0.52359878F;

		tailModel[13].addBox(0F, 0F, 0F, 54, 22, 20, 0F); // Import ImportImportImportBox143
		tailModel[13].setRotationPoint(60F, -42F, -21F);

		tailModel[14].addBox(0F, 0F, 0F, 98, 18, 24, 0F); // Import ImportImportImportBox143
		tailModel[14].setRotationPoint(5F, -47F, -44F);

		tailModel[15].addBox(0F, 0F, 0F, 80, 18, 12, 0F); // Import ImportImportImportBox143
		tailModel[15].setRotationPoint(19F, -51F, -38F);

		tailModel[16].addBox(0F, 0F, 0F, 26, 68, 3, 0F); // Import ImportImportImportBox87
		tailModel[16].setRotationPoint(78F, -41F, -108F);
		tailModel[16].rotateAngleX = 1.57079633F;

		tailModel[17].addBox(0F, 0F, 0F, 26, 68, 3, 0F); // Import ImportImportImportBox87
		tailModel[17].setRotationPoint(79F, -41F, 40F);
		tailModel[17].rotateAngleX = 1.57079633F;

		tailModel[18].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[18].setRotationPoint(68F, -42F, -108F);
		tailModel[18].rotateAngleX = 1.57079633F;
		tailModel[18].rotateAngleY = 0.13962634F;

		tailModel[19].addBox(0F, 0F, 0F, 26, 64, 1, 0F); // Import ImportImportImportBox87
		tailModel[19].setRotationPoint(60F, -42F, 44F);
		tailModel[19].rotateAngleX = 1.57079633F;
		tailModel[19].rotateAngleY = -0.13962634F;


		leftWingModel = new ModelRendererTurbo[6];
		leftWingModel[0] = new ModelRendererTurbo(this, 1297, 89, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[1] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[2] = new ModelRendererTurbo(this, 1489, 89, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[3] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[4] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[5] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Import ImportImportImportBox105

		leftWingModel[0].addBox(0F, 0F, 0F, 40, 3, 110, 0F); // Import ImportImportImportBox105
		leftWingModel[0].setRotationPoint(-14F, -36.5F, -150F);

		leftWingModel[1].addBox(0F, 0F, 0F, 80, 4, 60, 0F); // Import ImportImportImportBox105
		leftWingModel[1].setRotationPoint(-43F, -37F, -99F);

		leftWingModel[2].addBox(0F, 0F, 0F, 8, 2, 90, 0F); // Import ImportImportImportBox105
		leftWingModel[2].setRotationPoint(22F, -36F, -140F);

		leftWingModel[3].addBox(0F, 0F, 0F, 8, 2, 90, 0F); // Import ImportImportImportBox105
		leftWingModel[3].setRotationPoint(-33F, -36F, -140F);

		leftWingModel[4].addBox(0F, 0F, 0F, 6, 1, 86, 0F); // Import ImportImportImportBox105
		leftWingModel[4].setRotationPoint(-38F, -35.5F, -138F);

		leftWingModel[5].addBox(0F, 0F, 0F, 14, 3, 100, 0F); // Import ImportImportImportBox105
		leftWingModel[5].setRotationPoint(-28F, -36.5F, -141F);


		rightWingModel = new ModelRendererTurbo[6];
		rightWingModel[0] = new ModelRendererTurbo(this, 1601, 89, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[2] = new ModelRendererTurbo(this, 1793, 89, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[3] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[4] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[5] = new ModelRendererTurbo(this, 1153, 137, textureX, textureY); // Import ImportImportImportBox322

		rightWingModel[0].addBox(0F, 0F, 0F, 40, 3, 110, 0F); // Import ImportImportImportBox322
		rightWingModel[0].setRotationPoint(-14F, -36.5F, 40F);

		rightWingModel[1].addBox(0F, 0F, 0F, 80, 4, 60, 0F); // Import ImportImportImportBox322
		rightWingModel[1].setRotationPoint(-43F, -37F, 39F);

		rightWingModel[2].addBox(0F, 0F, 0F, 8, 2, 90, 0F); // Import ImportImportImportBox322
		rightWingModel[2].setRotationPoint(22F, -36F, 50F);

		rightWingModel[3].addBox(0F, 0F, 0F, 8, 2, 90, 0F); // Import ImportImportImportBox322
		rightWingModel[3].setRotationPoint(-33F, -36F, 50F);

		rightWingModel[4].addBox(0F, 0F, 0F, 6, 1, 86, 0F); // Import ImportImportImportBox322
		rightWingModel[4].setRotationPoint(-38F, -35.5F, 52F);

		rightWingModel[5].addBox(0F, 0F, 0F, 14, 3, 100, 0F); // Import ImportImportImportBox322
		rightWingModel[5].setRotationPoint(-28F, -36.5F, 41F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Import ImportImportImportBox87

		pitchFlapLeftModel[0].addBox(0F, 0F, 0F, 26, 67, 1, 0F); // Import ImportImportImportBox87
		pitchFlapLeftModel[0].setRotationPoint(92F, -42F, -108F);
		pitchFlapLeftModel[0].rotateAngleX = 1.57079633F;
		pitchFlapLeftModel[0].rotateAngleY = -0.17453293F;


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1041, 129, textureX, textureY); // Import ImportImportImportBox87

		pitchFlapRightModel[0].addBox(0F, 0F, 0F, 26, 66, 1, 0F); // Import ImportImportImportBox87
		pitchFlapRightModel[0].setRotationPoint(105F, -42F, 42F);
		pitchFlapRightModel[0].rotateAngleX = 1.57079633F;
		pitchFlapRightModel[0].rotateAngleY = 0.17453293F;


		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Import ImportImportImportBox105

		pitchFlapLeftWingModel[0].addBox(0F, 0F, 0F, 8, 1, 80, 0F); // Import ImportImportImportBox105
		pitchFlapLeftWingModel[0].setRotationPoint(28F, -35F, -135F);


		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Import ImportImportImportBox322

		pitchFlapRightWingModel[0].addBox(0F, 0F, 0F, 8, 1, 80, 0F); // Import ImportImportImportBox322
		pitchFlapRightWingModel[0].setRotationPoint(28F, -35F, 55F);


		bodyWheelModel = new ModelRendererTurbo[2];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox266
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Import ImportImportImportBox143

		bodyWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		bodyWheelModel[0].setRotationPoint(-76F, -19F, -1F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		bodyWheelModel[1].setRotationPoint(-81F, 1F, -4F);
		bodyWheelModel[1].rotateAngleZ = 0.78539816F;


		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportImportImportBox266
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Import ImportImportImportBox143

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		leftWingWheelModel[0].setRotationPoint(14F, -19F, -33F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		leftWingWheelModel[1].setRotationPoint(9F, 1F, -36F);
		leftWingWheelModel[1].rotateAngleZ = 0.78539816F;


		rightWingWheelModel = new ModelRendererTurbo[2];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1185, 1, textureX, textureY); // Import ImportImportImportBox266
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Import ImportImportImportBox143

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		rightWingWheelModel[0].setRotationPoint(14F, -19F, 31F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		rightWingWheelModel[1].setRotationPoint(9F, 1F, 28F);
		rightWingWheelModel[1].rotateAngleZ = 0.78539816F;


		bodyDoorCloseModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 1393, 209, textureX, textureY); // Import ImportImportImportBox143

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 20, 20, 16, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[0].setRotationPoint(-87F, -64F, -8F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.20943951F;

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 14, 20, 17, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[1].setRotationPoint(-101F, -64F, -8.5F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[2].addBox(0F, 0F, 0F, 30, 20, 16, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[2].setRotationPoint(-124F, -45F, -8F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.6981317F;

		bodyDoorCloseModel[3].addBox(0F, 0F, 0F, 2, 20, 18, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[3].setRotationPoint(-101F, -65F, -9F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[4].addBox(0F, 0F, 0F, 2, 20, 18, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[4].setRotationPoint(-87F, -65F, -9F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[5].addBox(0F, 0F, 0F, 52, 2, 24, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[5].setRotationPoint(-128F, -46F, -12F);



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