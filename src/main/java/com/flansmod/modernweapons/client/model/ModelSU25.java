//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SU25
// Model Creator: 
// Created on: 28.07.2020 - 20:41:01
// Last changed on: 28.07.2020 - 20:41:01

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSU25 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelSU25() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[28];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox102
		bodyModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportImportImportBox285
		bodyModel[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[3] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[4] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[5] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[6] = new ModelRendererTurbo(this, 1585, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[7] = new ModelRendererTurbo(this, 1337, 33, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[8] = new ModelRendererTurbo(this, 1497, 33, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[9] = new ModelRendererTurbo(this, 1633, 41, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[10] = new ModelRendererTurbo(this, 1001, 185, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[11] = new ModelRendererTurbo(this, 1281, 81, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[12] = new ModelRendererTurbo(this, 1329, 57, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[15] = new ModelRendererTurbo(this, 1281, 57, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[16] = new ModelRendererTurbo(this, 2009, 57, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[17] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[18] = new ModelRendererTurbo(this, 1129, 121, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[19] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[20] = new ModelRendererTurbo(this, 1297, 97, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[21] = new ModelRendererTurbo(this, 1673, 185, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[22] = new ModelRendererTurbo(this, 1761, 185, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[23] = new ModelRendererTurbo(this, 1161, 121, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[24] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[25] = new ModelRendererTurbo(this, 801, 193, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[26] = new ModelRendererTurbo(this, 1145, 177, textureX, textureY); // Import ImportImportImportBox143
		bodyModel[27] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Import ImportImportImportBox143

		bodyModel[0].addBox(0F, 0F, 0F, 80, 10, 40, 0F); // Import ImportImportImportBox102
		bodyModel[0].setRotationPoint(-50F, -44F, -41F);

		bodyModel[1].addBox(0F, 0F, 0F, 80, 10, 40, 0F); // Import ImportImportImportBox285
		bodyModel[1].setRotationPoint(-50F, -44F, 1F);

		bodyModel[2].addBox(0F, 0F, 0F, 160, 36, 24, 0F); // Import ImportImportImportBox143
		bodyModel[2].setRotationPoint(-81F, -48F, -12F);

		bodyModel[3].addBox(0F, 0F, 0F, 8, 27, 20, 0F); // Import ImportImportImportBox143
		bodyModel[3].setRotationPoint(-130F, -47F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 100, 20, 22, 0F); // Import ImportImportImportBox143
		bodyModel[4].setRotationPoint(-80F, -62F, -11F);
		bodyModel[4].rotateAngleZ = -0.03490659F;

		bodyModel[5].addBox(0F, 0F, 0F, 110, 16, 8, 0F); // Import ImportImportImportBox143
		bodyModel[5].setRotationPoint(-70F, -48F, 22F);

		bodyModel[6].addBox(0F, 0F, 0F, 110, 16, 8, 0F); // Import ImportImportImportBox143
		bodyModel[6].setRotationPoint(-70F, -48F, -30F);

		bodyModel[7].addBox(0F, 0F, 0F, 70, 16, 6, 0F); // Import ImportImportImportBox143
		bodyModel[7].setRotationPoint(-42F, -49F, 23F);

		bodyModel[8].addBox(0F, 0F, 0F, 70, 16, 6, 0F); // Import ImportImportImportBox143
		bodyModel[8].setRotationPoint(-42F, -49F, -29F);

		bodyModel[9].addBox(0F, 0F, 0F, 90, 20, 18, 0F); // Import ImportImportImportBox143
		bodyModel[9].setRotationPoint(-76F, -63F, -9F);
		bodyModel[9].rotateAngleZ = -0.03490659F;

		bodyModel[10].addBox(0F, 0F, 0F, 41, 7, 24, 0F); // Import ImportImportImportBox143
		bodyModel[10].setRotationPoint(-122F, -24F, -12F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 20, 12, 0F); // Import ImportImportImportBox143
		bodyModel[11].setRotationPoint(-92F, -58F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 8, 6, 12, 0F); // Import ImportImportImportBox143
		bodyModel[12].setRotationPoint(-96F, -66F, -6F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[13].setRotationPoint(-90F, -65F, -5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Import ImportImportImportBox143
		bodyModel[14].setRotationPoint(-90F, -65F, 4F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[15].setRotationPoint(-95F, -57F, -5F);
		bodyModel[15].rotateAngleZ = 0.17453293F;

		bodyModel[16].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[16].setRotationPoint(-94F, -50F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 6, 10, 0F); // Import ImportImportImportBox143
		bodyModel[17].setRotationPoint(-94F, -43F, -5F);
		bodyModel[17].rotateAngleZ = -0.31415927F;

		bodyModel[18].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Import ImportImportImportBox143
		bodyModel[18].setRotationPoint(-100F, -38F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 8, 8, 0F); // Import ImportImportImportBox143
		bodyModel[19].setRotationPoint(-100F, -37F, -4F);
		bodyModel[19].rotateAngleZ = -0.52359878F;

		bodyModel[20].addBox(0F, 0F, 0F, 10, 3, 18, 0F); // Import ImportImportImportBox143
		bodyModel[20].setRotationPoint(-118F, -46F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 40, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[21].setRotationPoint(-121F, -48F, -12F);

		bodyModel[22].addBox(0F, 0F, 0F, 40, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[22].setRotationPoint(-121F, -48F, 11F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 24, 24, 0F); // Import ImportImportImportBox143
		bodyModel[23].setRotationPoint(-122F, -48F, -12F);

		bodyModel[24].addBox(0F, 0F, 0F, 40, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[24].setRotationPoint(-121F, -48F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 40, 24, 1, 0F); // Import ImportImportImportBox143
		bodyModel[25].setRotationPoint(-121F, -48F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 24, 20, 0F); // Import ImportImportImportBox143
		bodyModel[26].setRotationPoint(-121F, -48F, -10F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 8, 14, 0F); // Import ImportImportImportBox143
		bodyModel[27].setRotationPoint(-116F, -62F, -7F);


		noseModel = new ModelRendererTurbo[11];
		noseModel[0] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[1] = new ModelRendererTurbo(this, 1177, 41, textureX, textureY); // Import ImportImportImportBox143
		noseModel[2] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportImportImportBox266
		noseModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[4] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Import ImportImportImportBox143
		noseModel[5] = new ModelRendererTurbo(this, 1249, 41, textureX, textureY); // Import ImportImportImportBox143
		noseModel[6] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Import ImportImportImportBox143
		noseModel[7] = new ModelRendererTurbo(this, 625, 169, textureX, textureY); // Import ImportImportImportBox143
		noseModel[8] = new ModelRendererTurbo(this, 1649, 33, textureX, textureY); // Import ImportImportImportBox266
		noseModel[9] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import ImportImportImportBox266
		noseModel[10] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Import ImportImportImportBox266

		noseModel[0].addBox(0F, 0F, 0F, 20, 22, 16, 0F); // Import ImportImportImportBox143
		noseModel[0].setRotationPoint(-142F, -44F, -8F);

		noseModel[1].addBox(0F, 0F, 0F, 20, 16, 12, 0F); // Import ImportImportImportBox143
		noseModel[1].setRotationPoint(-160F, -40F, -6F);

		noseModel[2].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Import ImportImportImportBox266
		noseModel[2].setRotationPoint(-178F, -36F, 3F);

		noseModel[3].addBox(0F, 0F, 0F, 10, 10, 8, 0F); // Import ImportImportImportBox143
		noseModel[3].setRotationPoint(-168F, -35F, -4F);

		noseModel[4].addBox(0F, 0F, 0F, 18, 3, 8, 0F); // Import ImportImportImportBox143
		noseModel[4].setRotationPoint(-166F, -38F, -4F);

		noseModel[5].addBox(0F, 0F, 0F, 24, 4, 8, 0F); // Import ImportImportImportBox143
		noseModel[5].setRotationPoint(-164F, -42F, -4F);

		noseModel[6].addBox(0F, 0F, 0F, 18, 3, 8, 0F); // Import ImportImportImportBox143
		noseModel[6].setRotationPoint(-146F, -45F, -4F);

		noseModel[7].addBox(0F, 0F, 0F, 40, 10, 11, 0F); // Import ImportImportImportBox143
		noseModel[7].setRotationPoint(-157F, -33F, -5.5F);
		noseModel[7].rotateAngleZ = -0.13962634F;

		noseModel[8].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Import ImportImportImportBox266
		noseModel[8].setRotationPoint(-178F, -36F, -5F);

		noseModel[9].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import ImportImportImportBox266
		noseModel[9].setRotationPoint(-186F, -35.5F, 3.5F);

		noseModel[10].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import ImportImportImportBox266
		noseModel[10].setRotationPoint(-186F, -35.5F, -4.5F);


		tailModel = new ModelRendererTurbo[21];
		tailModel[0] = new ModelRendererTurbo(this, 1961, 17, textureX, textureY); // Import ImportImportImportBox76
		tailModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import ImportImportImportBox87
		tailModel[2] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Import ImportImportImportBox143
		tailModel[3] = new ModelRendererTurbo(this, 1281, 41, textureX, textureY); // Import ImportImportImportBox157
		tailModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportImportImportBox143
		tailModel[5] = new ModelRendererTurbo(this, 1345, 57, textureX, textureY); // Import ImportImportImportBox143
		tailModel[6] = new ModelRendererTurbo(this, 1033, 49, textureX, textureY); // Import ImportImportImportBox143
		tailModel[7] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Import ImportImportImportBox143
		tailModel[8] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Import ImportImportImportBox143
		tailModel[9] = new ModelRendererTurbo(this, 1641, 81, textureX, textureY); // Import ImportImportImportBox143
		tailModel[10] = new ModelRendererTurbo(this, 2009, 17, textureX, textureY); // Import ImportImportImportBox87
		tailModel[11] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Import ImportImportImportBox87
		tailModel[12] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Import ImportImportImportBox143
		tailModel[13] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Import ImportImportImportBox143
		tailModel[14] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import ImportImportImportBox143
		tailModel[15] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Import ImportImportImportBox143
		tailModel[16] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Import ImportImportImportBox143
		tailModel[17] = new ModelRendererTurbo(this, 1889, 81, textureX, textureY); // Import ImportImportImportBox143
		tailModel[18] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import ImportImportImportBox87
		tailModel[19] = new ModelRendererTurbo(this, 1617, 177, textureX, textureY); // Import ImportImportImportBox76
		tailModel[20] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Import ImportImportImportBox157

		tailModel[0].addBox(0F, 0F, 0F, 4, 1, 38, 0F); // Import ImportImportImportBox76
		tailModel[0].setRotationPoint(106F, -45.5F, -41F);

		tailModel[1].addBox(0F, 0F, 0F, 6, 36, 3, 0F); // Import ImportImportImportBox87
		tailModel[1].setRotationPoint(110F, -82F, -1F);

		tailModel[2].addBox(0F, 0F, 0F, 70, 18, 16, 0F); // Import ImportImportImportBox143
		tailModel[2].setRotationPoint(60F, -48F, -8F);

		tailModel[3].addBox(0F, 0F, 0F, 4, 1, 38, 0F); // Import ImportImportImportBox157
		tailModel[3].setRotationPoint(106F, -45.5F, 4F);

		tailModel[4].addBox(0F, 0F, 0F, 120, 30, 26, 0F); // Import ImportImportImportBox143
		tailModel[4].setRotationPoint(-74F, -38F, 11F);

		tailModel[5].addBox(0F, 0F, 0F, 120, 30, 26, 0F); // Import ImportImportImportBox143
		tailModel[5].setRotationPoint(-74F, -38F, -37F);

		tailModel[6].addBox(0F, 0F, 0F, 43, 18, 20, 0F); // Import ImportImportImportBox143
		tailModel[6].setRotationPoint(-76F, -32F, 14F);

		tailModel[7].addBox(0F, 0F, 0F, 43, 18, 20, 0F); // Import ImportImportImportBox143
		tailModel[7].setRotationPoint(-76F, -32F, -34F);

		tailModel[8].addBox(0F, 0F, 0F, 90, 26, 24, 0F); // Import ImportImportImportBox143
		tailModel[8].setRotationPoint(-42F, -36F, 12F);

		tailModel[9].addBox(0F, 0F, 0F, 90, 26, 24, 0F); // Import ImportImportImportBox143
		tailModel[9].setRotationPoint(-42F, -36F, -36F);

		tailModel[10].addBox(0F, 0F, 0F, 6, 32, 2, 0F); // Import ImportImportImportBox87
		tailModel[10].setRotationPoint(104F, -78F, -0.5F);

		tailModel[11].addBox(0F, 0F, 0F, 4, 30, 1, 0F); // Import ImportImportImportBox87
		tailModel[11].setRotationPoint(100F, -74F, 0F);

		tailModel[12].addBox(0F, 0F, 0F, 112, 4, 24, 0F); // Import ImportImportImportBox143
		tailModel[12].setRotationPoint(-70F, -11F, 12F);

		tailModel[13].addBox(0F, 0F, 0F, 112, 4, 24, 0F); // Import ImportImportImportBox143
		tailModel[13].setRotationPoint(-70F, -11F, -36F);

		tailModel[14].addBox(0F, 0F, 0F, 112, 23, 24, 0F); // Import ImportImportImportBox143
		tailModel[14].setRotationPoint(-70F, -35F, 14F);

		tailModel[15].addBox(0F, 0F, 0F, 112, 23, 24, 0F); // Import ImportImportImportBox143
		tailModel[15].setRotationPoint(-70F, -35F, -38F);

		tailModel[16].addBox(0F, 0F, 0F, 111, 18, 12, 0F); // Import ImportImportImportBox143
		tailModel[16].setRotationPoint(18F, -51F, -6F);

		tailModel[17].addBox(0F, 0F, 0F, 70, 18, 8, 0F); // Import ImportImportImportBox143
		tailModel[17].setRotationPoint(18F, -55F, -4F);

		tailModel[18].addBox(0F, 0F, 0F, 6, 30, 1, 0F); // Import ImportImportImportBox87
		tailModel[18].setRotationPoint(94F, -68F, 0F);

		tailModel[19].addBox(0F, 0F, 0F, 6, 2, 42, 0F); // Import ImportImportImportBox76
		tailModel[19].setRotationPoint(110F, -46F, -43F);

		tailModel[20].addBox(0F, 0F, 0F, 6, 2, 42, 0F); // Import ImportImportImportBox157
		tailModel[20].setRotationPoint(110F, -46F, 2F);


		leftWingModel = new ModelRendererTurbo[19];
		leftWingModel[0] = new ModelRendererTurbo(this, 1065, 73, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[1] = new ModelRendererTurbo(this, 1769, 113, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[2] = new ModelRendererTurbo(this, 1897, 57, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[3] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[4] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[5] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[6] = new ModelRendererTurbo(this, 1913, 113, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[7] = new ModelRendererTurbo(this, 1281, 121, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[8] = new ModelRendererTurbo(this, 1417, 121, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[9] = new ModelRendererTurbo(this, 1281, 137, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[10] = new ModelRendererTurbo(this, 1457, 121, textureX, textureY); // Import ImportImportImportBox105
		leftWingModel[11] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[12] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[13] = new ModelRendererTurbo(this, 1617, 137, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[14] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[15] = new ModelRendererTurbo(this, 1913, 129, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[16] = new ModelRendererTurbo(this, 1457, 137, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[17] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Import ImportImportImportBox143
		leftWingModel[18] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Import ImportImportImportBox143

		leftWingModel[0].addBox(0F, 0F, 0F, 32, 4, 150, 0F); // Import ImportImportImportBox105
		leftWingModel[0].setRotationPoint(-30F, -40F, -186F);

		leftWingModel[1].addBox(0F, 0F, 0F, 18, 1, 106, 0F); // Import ImportImportImportBox105
		leftWingModel[1].setRotationPoint(-40F, -37.5F, -146F);

		leftWingModel[2].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportImportBox143
		leftWingModel[2].setRotationPoint(-32F, -36F, -64F);

		leftWingModel[3].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportImportBox143
		leftWingModel[3].setRotationPoint(-32F, -36F, -94F);

		leftWingModel[4].addBox(0F, 0F, 0F, 70, 8, 8, 0F); // Import ImportImportImportBox143
		leftWingModel[4].setRotationPoint(-52F, -26F, -67F);

		leftWingModel[5].addBox(0F, 0F, 0F, 70, 8, 8, 0F); // Import ImportImportImportBox143
		leftWingModel[5].setRotationPoint(-52F, -26F, -97F);

		leftWingModel[6].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Import ImportImportImportBox143
		leftWingModel[6].setRotationPoint(-54F, -25F, -66F);

		leftWingModel[7].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Import ImportImportImportBox143
		leftWingModel[7].setRotationPoint(-54F, -25F, -96F);

		leftWingModel[8].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportImportBox143
		leftWingModel[8].setRotationPoint(-62F, -24F, -65F);

		leftWingModel[9].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportImportBox143
		leftWingModel[9].setRotationPoint(-62F, -24F, -95F);

		leftWingModel[10].addBox(0F, 0F, 0F, 10, 1, 134, 0F); // Import ImportImportImportBox105
		leftWingModel[10].setRotationPoint(-37F, -38F, -176F);

		leftWingModel[11].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportImportBox143
		leftWingModel[11].setRotationPoint(-32F, -36F, -124F);

		leftWingModel[12].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportImportBox143
		leftWingModel[12].setRotationPoint(-32F, -36F, -154F);

		leftWingModel[13].addBox(0F, 0F, 0F, 70, 8, 8, 0F); // Import ImportImportImportBox143
		leftWingModel[13].setRotationPoint(-52F, -26F, -127F);

		leftWingModel[14].addBox(0F, 0F, 0F, 70, 8, 8, 0F); // Import ImportImportImportBox143
		leftWingModel[14].setRotationPoint(-52F, -26F, -157F);

		leftWingModel[15].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Import ImportImportImportBox143
		leftWingModel[15].setRotationPoint(-54F, -25F, -126F);

		leftWingModel[16].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Import ImportImportImportBox143
		leftWingModel[16].setRotationPoint(-54F, -25F, -156F);

		leftWingModel[17].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportImportBox143
		leftWingModel[17].setRotationPoint(-62F, -24F, -125F);

		leftWingModel[18].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportImportBox143
		leftWingModel[18].setRotationPoint(-62F, -24F, -155F);


		rightWingModel = new ModelRendererTurbo[19];
		rightWingModel[0] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[1] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[2] = new ModelRendererTurbo(this, 1913, 145, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[3] = new ModelRendererTurbo(this, 1281, 153, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[4] = new ModelRendererTurbo(this, 1393, 153, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[5] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[6] = new ModelRendererTurbo(this, 1617, 161, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[8] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[9] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[10] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Import ImportImportImportBox322
		rightWingModel[11] = new ModelRendererTurbo(this, 1753, 161, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[12] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[13] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[14] = new ModelRendererTurbo(this, 1281, 177, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[15] = new ModelRendererTurbo(this, 1913, 169, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[16] = new ModelRendererTurbo(this, 1441, 177, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[17] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import ImportImportImportBox143
		rightWingModel[18] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Import ImportImportImportBox143

		rightWingModel[0].addBox(0F, 0F, 0F, 32, 4, 150, 0F); // Import ImportImportImportBox322
		rightWingModel[0].setRotationPoint(-30F, -40F, 38F);

		rightWingModel[1].addBox(0F, 0F, 0F, 18, 1, 106, 0F); // Import ImportImportImportBox322
		rightWingModel[1].setRotationPoint(-40F, -37.5F, 40F);

		rightWingModel[2].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportImportBox143
		rightWingModel[2].setRotationPoint(-32F, -37F, 66F);

		rightWingModel[3].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportImportBox143
		rightWingModel[3].setRotationPoint(-32F, -37F, 96F);

		rightWingModel[4].addBox(0F, 0F, 0F, 70, 8, 8, 0F); // Import ImportImportImportBox143
		rightWingModel[4].setRotationPoint(-52F, -27F, 63F);

		rightWingModel[5].addBox(0F, 0F, 0F, 70, 8, 8, 0F); // Import ImportImportImportBox143
		rightWingModel[5].setRotationPoint(-52F, -27F, 93F);

		rightWingModel[6].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Import ImportImportImportBox143
		rightWingModel[6].setRotationPoint(-54F, -26F, 64F);

		rightWingModel[7].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Import ImportImportImportBox143
		rightWingModel[7].setRotationPoint(-54F, -26F, 94F);

		rightWingModel[8].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportImportBox143
		rightWingModel[8].setRotationPoint(-62F, -25F, 65F);

		rightWingModel[9].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportImportBox143
		rightWingModel[9].setRotationPoint(-62F, -25F, 95F);

		rightWingModel[10].addBox(0F, 0F, 0F, 10, 1, 136, 0F); // Import ImportImportImportBox322
		rightWingModel[10].setRotationPoint(-37F, -39F, 40F);

		rightWingModel[11].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportImportBox143
		rightWingModel[11].setRotationPoint(-32F, -37F, 126F);

		rightWingModel[12].addBox(0F, 0F, 0F, 52, 16, 2, 0F); // Import ImportImportImportBox143
		rightWingModel[12].setRotationPoint(-32F, -37F, 156F);

		rightWingModel[13].addBox(0F, 0F, 0F, 70, 8, 8, 0F); // Import ImportImportImportBox143
		rightWingModel[13].setRotationPoint(-52F, -27F, 123F);

		rightWingModel[14].addBox(0F, 0F, 0F, 70, 8, 8, 0F); // Import ImportImportImportBox143
		rightWingModel[14].setRotationPoint(-52F, -27F, 153F);

		rightWingModel[15].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Import ImportImportImportBox143
		rightWingModel[15].setRotationPoint(-54F, -26F, 124F);

		rightWingModel[16].addBox(0F, 0F, 0F, 60, 6, 6, 0F); // Import ImportImportImportBox143
		rightWingModel[16].setRotationPoint(-54F, -26F, 154F);

		rightWingModel[17].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportImportBox143
		rightWingModel[17].setRotationPoint(-62F, -25F, 125F);

		rightWingModel[18].addBox(0F, 0F, 0F, 82, 4, 4, 0F); // Import ImportImportImportBox143
		rightWingModel[18].setRotationPoint(-62F, -25F, 155F);


		yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this, 1857, 41, textureX, textureY); // Import ImportImportImportBox87
		yawFlapModel[1] = new ModelRendererTurbo(this, 1881, 41, textureX, textureY); // Import ImportImportImportBox87

		yawFlapModel[0].addBox(0F, 0F, 0F, 6, 40, 2, 0F); // Import ImportImportImportBox87
		yawFlapModel[0].setRotationPoint(116F, -86F, -0.5F);

		yawFlapModel[1].addBox(0F, 0F, 0F, 6, 44, 1, 0F); // Import ImportImportImportBox87
		yawFlapModel[1].setRotationPoint(122F, -90F, 0F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Import ImportImportImportBox76

		pitchFlapLeftModel[0].addBox(0F, 0F, 0F, 8, 2, 46, 0F); // Import ImportImportImportBox76
		pitchFlapLeftModel[0].setRotationPoint(116F, -46F, -45F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Import ImportImportImportBox157

		pitchFlapRightModel[0].addBox(0F, 0F, 0F, 8, 2, 46, 0F); // Import ImportImportImportBox157
		pitchFlapRightModel[0].setRotationPoint(116F, -46F, 0F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import ImportImportImportBox105
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 1577, 225, textureX, textureY); // Import ImportImportImportBox105

		pitchFlapLeftWingModel[0].addBox(0F, 0F, 0F, 10, 1, 166, 0F); // Import ImportImportImportBox105
		pitchFlapLeftWingModel[0].setRotationPoint(2F, -38F, -192F);

		pitchFlapLeftWingModel[1].addBox(0F, 0F, 0F, 14, 1, 170, 0F); // Import ImportImportImportBox105
		pitchFlapLeftWingModel[1].setRotationPoint(2F, -37F, -194F);


		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1265, 201, textureX, textureY); // Import ImportImportImportBox322
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 937, 233, textureX, textureY); // Import ImportImportImportBox322

		pitchFlapRightWingModel[0].addBox(0F, 0F, 0F, 10, 1, 168, 0F); // Import ImportImportImportBox322
		pitchFlapRightWingModel[0].setRotationPoint(2F, -39F, 24F);

		pitchFlapRightWingModel[1].addBox(0F, 0F, 0F, 14, 1, 172, 0F); // Import ImportImportImportBox322
		pitchFlapRightWingModel[1].setRotationPoint(1F, -38F, 22F);


		bodyWheelModel = new ModelRendererTurbo[2];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import ImportImportImportBox266
		bodyWheelModel[1] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import ImportImportImportBox143

		bodyWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		bodyWheelModel[0].setRotationPoint(-80F, -15F, -1F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		bodyWheelModel[1].setRotationPoint(-85F, 3F, -4F);
		bodyWheelModel[1].rotateAngleZ = 0.78539816F;


		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Import ImportImportImportBox266
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Import ImportImportImportBox143

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		leftWingWheelModel[0].setRotationPoint(14F, -15F, -33F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		leftWingWheelModel[1].setRotationPoint(9F, 3F, -36F);
		leftWingWheelModel[1].rotateAngleZ = 0.78539816F;


		rightWingWheelModel = new ModelRendererTurbo[2];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1161, 49, textureX, textureY); // Import ImportImportImportBox266
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Import ImportImportImportBox143

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 2, 0F); // Import ImportImportImportBox266
		rightWingWheelModel[0].setRotationPoint(14F, -15F, 31F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportImportImportBox143
		rightWingWheelModel[1].setRotationPoint(9F, 3F, 28F);
		rightWingWheelModel[1].rotateAngleZ = 0.78539816F;


		bodyDoorCloseModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1185, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1249, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Import ImportImportImportBox143
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 1913, 185, textureX, textureY); // Import ImportImportImportBox143

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 10, 20, 16, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[0].setRotationPoint(-84F, -67F, -8F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.34906585F;

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 14, 20, 17, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[1].setRotationPoint(-100F, -67F, -8.5F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[2].addBox(0F, 0F, 0F, 28, 20, 16, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[2].setRotationPoint(-121F, -51F, -8F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.64577182F;

		bodyDoorCloseModel[3].addBox(0F, 0F, 0F, 2, 20, 18, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[3].setRotationPoint(-100F, -68F, -9F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[4].addBox(0F, 0F, 0F, 2, 20, 18, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[4].setRotationPoint(-86F, -68F, -9F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.03490659F;

		bodyDoorCloseModel[5].addBox(0F, 0F, 0F, 42, 2, 24, 0F); // Import ImportImportImportBox143
		bodyDoorCloseModel[5].setRotationPoint(-122F, -50F, -12F);



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