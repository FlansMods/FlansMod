//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FS10
// Model Creator: 
// Created on: 28.07.2020 - 13:53:19
// Last changed on: 28.07.2020 - 13:53:19

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFS10 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelFS10() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[31];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox102
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportImportBox285
		bodyModel[2] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportImportBox143
		bodyModel[3] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import ImportImportBox143
		bodyModel[4] = new ModelRendererTurbo(this, 1305, 1, textureX, textureY); // Import ImportImportBox143
		bodyModel[5] = new ModelRendererTurbo(this, 1425, 1, textureX, textureY); // Import ImportImportBox143
		bodyModel[6] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Import ImportImportBox143
		bodyModel[7] = new ModelRendererTurbo(this, 1729, 1, textureX, textureY); // Import ImportImportBox143
		bodyModel[8] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import ImportImportBox143
		bodyModel[9] = new ModelRendererTurbo(this, 1369, 105, textureX, textureY); // Import ImportImportBox143
		bodyModel[10] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Import ImportImportBox143
		bodyModel[11] = new ModelRendererTurbo(this, 1601, 105, textureX, textureY); // Import ImportImportBox143
		bodyModel[12] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Import ImportImportBox143
		bodyModel[13] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[14] = new ModelRendererTurbo(this, 1313, 73, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[15] = new ModelRendererTurbo(this, 1993, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[18] = new ModelRendererTurbo(this, 1601, 81, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[19] = new ModelRendererTurbo(this, 1545, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[20] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[21] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[22] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[23] = new ModelRendererTurbo(this, 1969, 41, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[24] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[25] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[26] = new ModelRendererTurbo(this, 1969, 113, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[27] = new ModelRendererTurbo(this, 1769, 169, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[28] = new ModelRendererTurbo(this, 1873, 169, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[29] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[30] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import ImportImportImportBox143

		bodyModel[0].addBox(0F, 0F, 0F, 70, 10, 40, 0F); // Import ImportImportBox102
		bodyModel[0].setRotationPoint(-50F, -25F, -41F);

		bodyModel[1].addBox(0F, 0F, 0F, 70, 10, 40, 0F); // Import ImportImportBox285
		bodyModel[1].setRotationPoint(-50F, -25F, 1F);

		bodyModel[2].addBox(0F, 0F, 0F, 140, 36, 24, 0F); // Import ImportImportBox143
		bodyModel[2].setRotationPoint(-79F, -49F, -12F);

		bodyModel[3].addBox(0F, 0F, 0F, 130, 20, 22, 0F); // Import ImportImportBox143
		bodyModel[3].setRotationPoint(-58F, -59F, -11F);
		bodyModel[3].rotateAngleZ = -0.03490659F;

		bodyModel[4].addBox(0F, 0F, 0F, 43, 14, 16, 0F); // Import ImportImportBox143
		bodyModel[4].setRotationPoint(-56F, -22F, 32F);

		bodyModel[5].addBox(0F, 0F, 0F, 43, 14, 16, 0F); // Import ImportImportBox143
		bodyModel[5].setRotationPoint(-56F, -22F, -48F);

		bodyModel[6].addBox(0F, 0F, 0F, 82, 16, 8, 0F); // Import ImportImportBox143
		bodyModel[6].setRotationPoint(-52F, -28F, 36F);

		bodyModel[7].addBox(0F, 0F, 0F, 82, 16, 8, 0F); // Import ImportImportBox143
		bodyModel[7].setRotationPoint(-52F, -28F, -44F);

		bodyModel[8].addBox(0F, 0F, 0F, 70, 4, 6, 0F); // Import ImportImportBox143
		bodyModel[8].setRotationPoint(-42F, -29F, 37F);

		bodyModel[9].addBox(0F, 0F, 0F, 70, 4, 6, 0F); // Import ImportImportBox143
		bodyModel[9].setRotationPoint(-42F, -29F, -43F);

		bodyModel[10].addBox(0F, 0F, 0F, 60, 10, 6, 0F); // Import ImportImportBox143
		bodyModel[10].setRotationPoint(-58F, -19F, 37F);

		bodyModel[11].addBox(0F, 0F, 0F, 60, 10, 6, 0F); // Import ImportImportBox143
		bodyModel[11].setRotationPoint(-58F, -19F, -43F);

		bodyModel[12].addBox(0F, 0F, 0F, 120, 20, 18, 0F); // Import ImportImportBox143
		bodyModel[12].setRotationPoint(-54F, -61F, -9F);
		bodyModel[12].rotateAngleZ = -0.03490659F;

		bodyModel[13].addBox(0F, 0F, 0F, 51, 2, 24, 0F); // Import ImportImportImportBox143
		bodyModel[13].setRotationPoint(-130F, -24F, -12F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 20, 12, 0F); // Import ImportImportImportBox143
		bodyModel[14].setRotationPoint(-92F, -55F, -6F);

		bodyModel[15].addBox(0F, 0F, 0F, 8, 6, 12, 0F); // Import ImportImportImportBox143
		bodyModel[15].setRotationPoint(-96F, -63F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[16].setRotationPoint(-90F, -62F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[17].setRotationPoint(-90F, -62F, 4F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[18].setRotationPoint(-95F, -54F, -5F);
		bodyModel[18].rotateAngleZ = 0.17453293F;

		bodyModel[19].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[19].setRotationPoint(-94F, -47F, -5F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[20].setRotationPoint(-94F, -40F, -5F);
		bodyModel[20].rotateAngleZ = -0.31415927F;

		bodyModel[21].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Import ImportImportImportBox143
		bodyModel[21].setRotationPoint(-100F, -38F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 8, 8, 0F); // Import ImportImportImportBox143
		bodyModel[22].setRotationPoint(-100F, -37F, -4F);
		bodyModel[22].rotateAngleZ = -0.52359878F;

		bodyModel[23].addBox(0F, 0F, 0F, 10, 3, 18, 0F); // Import ImportImportImportBox143
		bodyModel[23].setRotationPoint(-126F, -46F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[24].setRotationPoint(-129F, -48F, -12F);

		bodyModel[25].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[25].setRotationPoint(-129F, -48F, 11F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 24, 24, 0F); // Import ImportImportImportBox143
		bodyModel[26].setRotationPoint(-130F, -48F, -12F);

		bodyModel[27].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[27].setRotationPoint(-129F, -48F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 50, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[28].setRotationPoint(-129F, -48F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 24, 20, 0F); // Import ImportImportImportBox143
		bodyModel[29].setRotationPoint(-129F, -48F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 8, 14, 0F); // Import ImportImportImportBox143
		bodyModel[30].setRotationPoint(-130F, -58F, -7F);


		noseModel = new ModelRendererTurbo[16];
		noseModel[0] = new ModelRendererTurbo(this, 1289, 33, textureX, textureY); // Import ImportImportBox143
		noseModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox143
		noseModel[2] = new ModelRendererTurbo(this, 1353, 33, textureX, textureY); // Import ImportImportBox143
		noseModel[3] = new ModelRendererTurbo(this, 1385, 33, textureX, textureY); // Import ImportImportBox266
		noseModel[4] = new ModelRendererTurbo(this, 1497, 33, textureX, textureY); // Import ImportImportBox266
		noseModel[5] = new ModelRendererTurbo(this, 1609, 33, textureX, textureY); // Import ImportImportBox266
		noseModel[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import ImportImportBox143
		noseModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportImportBox143
		noseModel[8] = new ModelRendererTurbo(this, 1705, 33, textureX, textureY); // Import ImportImportBox143
		noseModel[9] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import ImportImportBox143
		noseModel[10] = new ModelRendererTurbo(this, 1761, 33, textureX, textureY); // Import ImportImportBox143
		noseModel[11] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import ImportImportBox143
		noseModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportImportBox143
		noseModel[13] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import ImportImportBox143
		noseModel[14] = new ModelRendererTurbo(this, 1769, 57, textureX, textureY); // Import ImportImportBox143
		noseModel[15] = new ModelRendererTurbo(this, 1977, 169, textureX, textureY); // Import ImportImportBox143

		noseModel[0].addBox(0F, 0F, 0F, 12, 20, 16, 0F); // Import ImportImportBox143
		noseModel[0].setRotationPoint(-152F, -44F, -8F);

		noseModel[1].addBox(0F, 0F, 0F, 10, 10, 8, 0F); // Import ImportImportBox143
		noseModel[1].setRotationPoint(-164F, -37F, -4F);

		noseModel[2].addBox(0F, 0F, 0F, 10, 14, 10, 0F); // Import ImportImportBox143
		noseModel[2].setRotationPoint(-158F, -39F, -5F);

		noseModel[3].addBox(0F, 0F, 0F, 50, 2, 2, 0F); // Import ImportImportBox266
		noseModel[3].setRotationPoint(-162F, -18F, -1F);
		noseModel[3].rotateAngleX = 0.78539816F;

		noseModel[4].addBox(0F, 0F, 0F, 50, 2, 2, 0F); // Import ImportImportBox266
		noseModel[4].setRotationPoint(-162F, -15F, 1F);
		noseModel[4].rotateAngleX = 0.78539816F;

		noseModel[5].addBox(0F, 0F, 0F, 50, 2, 2, 0F); // Import ImportImportBox266
		noseModel[5].setRotationPoint(-162F, -15F, -3F);
		noseModel[5].rotateAngleX = 0.78539816F;

		noseModel[6].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Import ImportImportBox143
		noseModel[6].setRotationPoint(-156F, -21F, -4F);

		noseModel[7].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Import ImportImportBox143
		noseModel[7].setRotationPoint(-159F, -21F, -4F);

		noseModel[8].addBox(0F, 0F, 0F, 18, 10, 9, 0F); // Import ImportImportBox143
		noseModel[8].setRotationPoint(-116F, -22F, -4F);

		noseModel[9].addBox(0F, 0F, 0F, 2, 9, 9, 0F); // Import ImportImportBox143
		noseModel[9].setRotationPoint(-120F, -21F, -4F);

		noseModel[10].addBox(0F, 0F, 0F, 20, 12, 11, 0F); // Import ImportImportBox143
		noseModel[10].setRotationPoint(-99F, -22F, -5F);

		noseModel[11].addBox(0F, 0F, 0F, 10, 6, 6, 0F); // Import ImportImportBox143
		noseModel[11].setRotationPoint(-169F, -34F, -3F);

		noseModel[12].addBox(0F, 0F, 0F, 10, 4, 6, 0F); // Import ImportImportBox143
		noseModel[12].setRotationPoint(-167F, -38F, -3F);

		noseModel[13].addBox(0F, 0F, 0F, 10, 4, 6, 0F); // Import ImportImportBox143
		noseModel[13].setRotationPoint(-162F, -42F, -3F);

		noseModel[14].addBox(0F, 0F, 0F, 16, 6, 6, 0F); // Import ImportImportBox143
		noseModel[14].setRotationPoint(-155F, -48F, -3F);

		noseModel[15].addBox(0F, 0F, 0F, 10, 25, 18, 0F); // Import ImportImportBox143
		noseModel[15].setRotationPoint(-140F, -48F, -9F);


		tailModel = new ModelRendererTurbo[23];
		tailModel[0] = new ModelRendererTurbo(this, 1793, 33, textureX, textureY); // Import ImportImportBox76
		tailModel[1] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Import ImportImportBox80
		tailModel[2] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Import ImportImportBox87
		tailModel[3] = new ModelRendererTurbo(this, 1401, 41, textureX, textureY); // Import ImportImportBox143
		tailModel[4] = new ModelRendererTurbo(this, 1177, 41, textureX, textureY); // Import ImportImportBox157
		tailModel[5] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Import ImportImportBox143
		tailModel[6] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportImportBox143
		tailModel[7] = new ModelRendererTurbo(this, 1561, 41, textureX, textureY); // Import ImportImportBox80
		tailModel[8] = new ModelRendererTurbo(this, 1881, 41, textureX, textureY); // Import ImportImportBox87
		tailModel[9] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Import ImportImportBox80
		tailModel[10] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Import ImportImportBox87
		tailModel[11] = new ModelRendererTurbo(this, 1665, 41, textureX, textureY); // Import ImportImportBox80
		tailModel[12] = new ModelRendererTurbo(this, 1681, 41, textureX, textureY); // Import ImportImportBox87
		tailModel[13] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Import ImportImportBox80
		tailModel[14] = new ModelRendererTurbo(this, 1697, 41, textureX, textureY); // Import ImportImportBox87
		tailModel[15] = new ModelRendererTurbo(this, 1641, 57, textureX, textureY); // Import ImportImportBox80
		tailModel[16] = new ModelRendererTurbo(this, 1705, 57, textureX, textureY); // Import ImportImportBox87
		tailModel[17] = new ModelRendererTurbo(this, 1177, 89, textureX, textureY); // Import ImportImportBox143
		tailModel[18] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import ImportImportBox143
		tailModel[19] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Import ImportImportBox143
		tailModel[20] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportImportBox143
		tailModel[21] = new ModelRendererTurbo(this, 1177, 145, textureX, textureY); // Import ImportImportBox143
		tailModel[22] = new ModelRendererTurbo(this, 1601, 153, textureX, textureY); // Import ImportImportBox143

		tailModel[0].addBox(0F, 0F, 0F, 24, 5, 38, 0F); // Import ImportImportBox76
		tailModel[0].setRotationPoint(102F, -27F, -41F);

		tailModel[1].addBox(0F, 0F, 0F, 22, 60, 3, 0F); // Import ImportImportBox80
		tailModel[1].setRotationPoint(106F, -85F, -43F);

		tailModel[2].addBox(0F, 0F, 0F, 22, 60, 3, 0F); // Import ImportImportBox87
		tailModel[2].setRotationPoint(106F, -85F, 40F);

		tailModel[3].addBox(0F, 0F, 0F, 70, 18, 16, 0F); // Import ImportImportBox143
		tailModel[3].setRotationPoint(60F, -37F, -8F);

		tailModel[4].addBox(0F, 0F, 0F, 24, 5, 38, 0F); // Import ImportImportBox157
		tailModel[4].setRotationPoint(102F, -27F, 4F);

		tailModel[5].addBox(0F, 0F, 0F, 60, 20, 26, 0F); // Import ImportImportBox143
		tailModel[5].setRotationPoint(20F, -62F, 11F);

		tailModel[6].addBox(0F, 0F, 0F, 60, 20, 26, 0F); // Import ImportImportBox143
		tailModel[6].setRotationPoint(20F, -62F, -37F);

		tailModel[7].addBox(0F, 0F, 0F, 46, 6, 5, 0F); // Import ImportImportBox80
		tailModel[7].setRotationPoint(92F, -25F, -44F);

		tailModel[8].addBox(0F, 0F, 0F, 46, 6, 5, 0F); // Import ImportImportBox87
		tailModel[8].setRotationPoint(92F, -25F, 39F);

		tailModel[9].addBox(0F, 0F, 0F, 4, 55, 2, 0F); // Import ImportImportBox80
		tailModel[9].setRotationPoint(102F, -80F, -42.5F);

		tailModel[10].addBox(0F, 0F, 0F, 4, 55, 2, 0F); // Import ImportImportBox87
		tailModel[10].setRotationPoint(102F, -80F, 40.5F);

		tailModel[11].addBox(0F, 0F, 0F, 4, 55, 2, 0F); // Import ImportImportBox80
		tailModel[11].setRotationPoint(128F, -80F, -42.5F);

		tailModel[12].addBox(0F, 0F, 0F, 4, 55, 2, 0F); // Import ImportImportBox87
		tailModel[12].setRotationPoint(128F, -80F, 40.5F);

		tailModel[13].addBox(0F, 0F, 0F, 2, 42, 1, 0F); // Import ImportImportBox80
		tailModel[13].setRotationPoint(100F, -67F, -42F);

		tailModel[14].addBox(0F, 0F, 0F, 2, 42, 1, 0F); // Import ImportImportBox87
		tailModel[14].setRotationPoint(100F, -67F, 41F);

		tailModel[15].addBox(0F, 0F, 0F, 4, 42, 1, 0F); // Import ImportImportBox80
		tailModel[15].setRotationPoint(132F, -67F, -42F);

		tailModel[16].addBox(0F, 0F, 0F, 4, 42, 1, 0F); // Import ImportImportBox87
		tailModel[16].setRotationPoint(132F, -67F, 41F);

		tailModel[17].addBox(0F, 0F, 0F, 52, 4, 24, 0F); // Import ImportImportBox143
		tailModel[17].setRotationPoint(24F, -66F, 12F);

		tailModel[18].addBox(0F, 0F, 0F, 52, 4, 24, 0F); // Import ImportImportBox143
		tailModel[18].setRotationPoint(24F, -66F, -36F);

		tailModel[19].addBox(0F, 0F, 0F, 52, 16, 24, 0F); // Import ImportImportBox143
		tailModel[19].setRotationPoint(24F, -60F, 16F);

		tailModel[20].addBox(0F, 0F, 0F, 52, 16, 24, 0F); // Import ImportImportBox143
		tailModel[20].setRotationPoint(24F, -60F, -40F);

		tailModel[21].addBox(0F, 0F, 0F, 60, 18, 12, 0F); // Import ImportImportBox143
		tailModel[21].setRotationPoint(60F, -40F, -6F);

		tailModel[22].addBox(0F, 0F, 0F, 60, 18, 8, 0F); // Import ImportImportBox143
		tailModel[22].setRotationPoint(54F, -52F, -4F);


		leftWingModel = new ModelRendererTurbo[15];
		leftWingModel[0] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Import ImportImportBox105
		leftWingModel[1] = new ModelRendererTurbo(this, 1433, 57, textureX, textureY); // Import ImportImportBox105
		leftWingModel[2] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import ImportImportBox143
		leftWingModel[3] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Import ImportImportBox143
		leftWingModel[4] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Import ImportImportBox143
		leftWingModel[5] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import ImportImportBox143
		leftWingModel[6] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import ImportImportBox105
		leftWingModel[7] = new ModelRendererTurbo(this, 1769, 105, textureX, textureY); // Import ImportImportBox143
		leftWingModel[8] = new ModelRendererTurbo(this, 1881, 105, textureX, textureY); // Import ImportImportBox143
		leftWingModel[9] = new ModelRendererTurbo(this, 1369, 121, textureX, textureY); // Import ImportImportBox143
		leftWingModel[10] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Import ImportImportBox143
		leftWingModel[11] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import ImportImportBox143
		leftWingModel[12] = new ModelRendererTurbo(this, 1769, 129, textureX, textureY); // Import ImportImportBox143
		leftWingModel[13] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import ImportImportBox143
		leftWingModel[14] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Import ImportImportBox143

		leftWingModel[0].addBox(0F, 0F, 0F, 50, 4, 150, 0F); // Import ImportImportBox105
		leftWingModel[0].setRotationPoint(-30F, -46F, -186F);
		leftWingModel[0].rotateAngleX = -0.17453293F;

		leftWingModel[1].addBox(0F, 0F, 0F, 10, 1, 146, 0F); // Import ImportImportBox105
		leftWingModel[1].setRotationPoint(-38F, -43.5F, -184F);
		leftWingModel[1].rotateAngleX = -0.17453293F;

		leftWingModel[2].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportBox143
		leftWingModel[2].setRotationPoint(-32F, -26F, -94F);

		leftWingModel[3].addBox(0F, 0F, 0F, 82, 8, 8, 0F); // Import ImportImportBox143
		leftWingModel[3].setRotationPoint(-52F, -16F, -97F);

		leftWingModel[4].addBox(0F, 0F, 0F, 82, 6, 6, 0F); // Import ImportImportBox143
		leftWingModel[4].setRotationPoint(-54F, -15F, -96F);

		leftWingModel[5].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportBox143
		leftWingModel[5].setRotationPoint(-62F, -14F, -95F);

		leftWingModel[6].addBox(0F, 0F, 0F, 8, 1, 140, 0F); // Import ImportImportBox105
		leftWingModel[6].setRotationPoint(-37F, -44F, -181F);
		leftWingModel[6].rotateAngleX = -0.17453293F;

		leftWingModel[7].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportBox143
		leftWingModel[7].setRotationPoint(-32F, -31F, -124F);

		leftWingModel[8].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportBox143
		leftWingModel[8].setRotationPoint(-32F, -36F, -154F);

		leftWingModel[9].addBox(0F, 0F, 0F, 82, 8, 8, 0F); // Import ImportImportBox143
		leftWingModel[9].setRotationPoint(-52F, -21F, -127F);

		leftWingModel[10].addBox(0F, 0F, 0F, 82, 8, 8, 0F); // Import ImportImportBox143
		leftWingModel[10].setRotationPoint(-52F, -26F, -157F);

		leftWingModel[11].addBox(0F, 0F, 0F, 82, 6, 6, 0F); // Import ImportImportBox143
		leftWingModel[11].setRotationPoint(-54F, -20F, -126F);

		leftWingModel[12].addBox(0F, 0F, 0F, 82, 6, 6, 0F); // Import ImportImportBox143
		leftWingModel[12].setRotationPoint(-54F, -25F, -156F);

		leftWingModel[13].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportBox143
		leftWingModel[13].setRotationPoint(-62F, -19F, -125F);

		leftWingModel[14].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportBox143
		leftWingModel[14].setRotationPoint(-62F, -24F, -155F);


		rightWingModel = new ModelRendererTurbo[15];
		rightWingModel[0] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Import ImportImportBox322
		rightWingModel[1] = new ModelRendererTurbo(this, 1601, 65, textureX, textureY); // Import ImportImportBox322
		rightWingModel[2] = new ModelRendererTurbo(this, 1921, 65, textureX, textureY); // Import ImportImportBox143
		rightWingModel[3] = new ModelRendererTurbo(this, 1369, 81, textureX, textureY); // Import ImportImportBox143
		rightWingModel[4] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import ImportImportBox143
		rightWingModel[5] = new ModelRendererTurbo(this, 1769, 89, textureX, textureY); // Import ImportImportBox143
		rightWingModel[6] = new ModelRendererTurbo(this, 1377, 209, textureX, textureY); // Import ImportImportBox322
		rightWingModel[7] = new ModelRendererTurbo(this, 1177, 121, textureX, textureY); // Import ImportImportBox143
		rightWingModel[8] = new ModelRendererTurbo(this, 1601, 129, textureX, textureY); // Import ImportImportBox143
		rightWingModel[9] = new ModelRendererTurbo(this, 1369, 145, textureX, textureY); // Import ImportImportBox143
		rightWingModel[10] = new ModelRendererTurbo(this, 1769, 145, textureX, textureY); // Import ImportImportBox143
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import ImportImportBox143
		rightWingModel[12] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import ImportImportBox143
		rightWingModel[13] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Import ImportImportBox143
		rightWingModel[14] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Import ImportImportBox143

		rightWingModel[0].addBox(0F, 0F, 0F, 50, 4, 150, 0F); // Import ImportImportBox322
		rightWingModel[0].setRotationPoint(-30F, -21F, 38F);
		rightWingModel[0].rotateAngleX = 0.13962634F;

		rightWingModel[1].addBox(0F, 0F, 0F, 10, 1, 146, 0F); // Import ImportImportBox322
		rightWingModel[1].setRotationPoint(-38F, -18.5F, 40F);
		rightWingModel[1].rotateAngleX = 0.13962634F;

		rightWingModel[2].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportBox143
		rightWingModel[2].setRotationPoint(-32F, -26F, 96F);

		rightWingModel[3].addBox(0F, 0F, 0F, 82, 8, 8, 0F); // Import ImportImportBox143
		rightWingModel[3].setRotationPoint(-52F, -16F, 93F);

		rightWingModel[4].addBox(0F, 0F, 0F, 82, 6, 6, 0F); // Import ImportImportBox143
		rightWingModel[4].setRotationPoint(-54F, -15F, 94F);

		rightWingModel[5].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportBox143
		rightWingModel[5].setRotationPoint(-62F, -14F, 95F);

		rightWingModel[6].addBox(0F, 0F, 0F, 8, 1, 140, 0F); // Import ImportImportBox322
		rightWingModel[6].setRotationPoint(-37F, -20F, 43F);
		rightWingModel[6].rotateAngleX = 0.13962634F;

		rightWingModel[7].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportBox143
		rightWingModel[7].setRotationPoint(-32F, -30F, 126F);

		rightWingModel[8].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportBox143
		rightWingModel[8].setRotationPoint(-32F, -35F, 156F);

		rightWingModel[9].addBox(0F, 0F, 0F, 82, 8, 8, 0F); // Import ImportImportBox143
		rightWingModel[9].setRotationPoint(-52F, -20F, 123F);

		rightWingModel[10].addBox(0F, 0F, 0F, 82, 8, 8, 0F); // Import ImportImportBox143
		rightWingModel[10].setRotationPoint(-52F, -25F, 153F);

		rightWingModel[11].addBox(0F, 0F, 0F, 82, 6, 6, 0F); // Import ImportImportBox143
		rightWingModel[11].setRotationPoint(-54F, -19F, 124F);

		rightWingModel[12].addBox(0F, 0F, 0F, 82, 6, 6, 0F); // Import ImportImportBox143
		rightWingModel[12].setRotationPoint(-54F, -24F, 154F);

		rightWingModel[13].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportBox143
		rightWingModel[13].setRotationPoint(-62F, -18F, 125F);

		rightWingModel[14].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportBox143
		rightWingModel[14].setRotationPoint(-62F, -23F, 155F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import ImportImportBox105
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import ImportImportBox105

		pitchFlapLeftWingModel[0].addBox(0F, 0F, 0F, 10, 1, 146, 0F); // Import ImportImportBox105
		pitchFlapLeftWingModel[0].setRotationPoint(19F, -43.5F, -184F);
		pitchFlapLeftWingModel[0].rotateAngleX = -0.17453293F;

		pitchFlapLeftWingModel[1].addBox(0F, 0F, 0F, 8, 1, 140, 0F); // Import ImportImportBox105
		pitchFlapLeftWingModel[1].setRotationPoint(20F, -44F, -181F);
		pitchFlapLeftWingModel[1].rotateAngleX = -0.17453293F;


		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1201, 65, textureX, textureY); // Import ImportImportBox322
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 793, 209, textureX, textureY); // Import ImportImportBox322

		pitchFlapRightWingModel[0].addBox(0F, 0F, 0F, 10, 1, 146, 0F); // Import ImportImportBox322
		pitchFlapRightWingModel[0].setRotationPoint(19F, -18.5F, 40F);
		pitchFlapRightWingModel[0].rotateAngleX = 0.13962634F;

		pitchFlapRightWingModel[1].addBox(0F, 0F, 0F, 8, 1, 140, 0F); // Import ImportImportBox322
		pitchFlapRightWingModel[1].setRotationPoint(20F, -20F, 43F);
		pitchFlapRightWingModel[1].rotateAngleX = 0.13962634F;


		bodyWheelModel = new ModelRendererTurbo[2];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportImportBox266
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Import ImportImportBox143

		bodyWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportBox266
		bodyWheelModel[0].setRotationPoint(-70F, -15F, -1F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportBox143
		bodyWheelModel[1].setRotationPoint(-75F, 3F, -4F);
		bodyWheelModel[1].rotateAngleZ = 0.78539816F;


		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Import ImportImportBox266
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1177, 49, textureX, textureY); // Import ImportImportBox143

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportBox266
		leftWingWheelModel[0].setRotationPoint(14F, -15F, -41F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportBox143
		leftWingWheelModel[1].setRotationPoint(9F, 3F, -44F);
		leftWingWheelModel[1].rotateAngleZ = 0.78539816F;


		rightWingWheelModel = new ModelRendererTurbo[2];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1265, 41, textureX, textureY); // Import ImportImportBox266
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1601, 57, textureX, textureY); // Import ImportImportBox143

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportBox266
		rightWingWheelModel[0].setRotationPoint(14F, -15F, 39F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportBox143
		rightWingWheelModel[1].setRotationPoint(9F, 3F, 36F);
		rightWingWheelModel[1].rotateAngleZ = 0.78539816F;


		bodyDoorCloseModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import ImportImportBox143
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import ImportImportBox143
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Import ImportImportBox143
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Import ImportImportBox143
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Import ImportImportBox143
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 1369, 169, textureX, textureY); // Import ImportImportImportBox143

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 40, 20, 16, 0F); // Import ImportImportBox143
		bodyDoorCloseModel[0].setRotationPoint(-91F, -65F, -8F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.52359878F;

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 20, 20, 17, 0F); // Import ImportImportBox143
		bodyDoorCloseModel[1].setRotationPoint(-109F, -64F, -8.5F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[2].addBox(0F, 0F, 0F, 26, 20, 16, 0F); // Import ImportImportBox143
		bodyDoorCloseModel[2].setRotationPoint(-130F, -49F, -8F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.61086524F;

		bodyDoorCloseModel[3].addBox(0F, 0F, 0F, 2, 20, 18, 0F); // Import ImportImportBox143
		bodyDoorCloseModel[3].setRotationPoint(-109F, -65F, -9F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[4].addBox(0F, 0F, 0F, 2, 20, 18, 0F); // Import ImportImportBox143
		bodyDoorCloseModel[4].setRotationPoint(-91F, -65F, -9F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[5].addBox(0F, 0F, 0F, 51, 2, 24, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[5].setRotationPoint(-130F, -50F, -12F);



		propellerModels = new ModelRendererTurbo[2][0];
		propellerModels[0] = makeProp1(29F, -41F, 21F);
		propellerModels[1] = makeProp2(29F, -41F, -21F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}