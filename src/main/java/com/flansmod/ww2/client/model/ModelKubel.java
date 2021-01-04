//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelKubel extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKubel() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[135];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 425, 156, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 35
		bodyModel[9] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 36
		bodyModel[10] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 37
		bodyModel[11] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 38
		bodyModel[12] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 39
		bodyModel[13] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 47
		bodyModel[14] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 48
		bodyModel[15] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 49
		bodyModel[16] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 50
		bodyModel[17] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 51
		bodyModel[18] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 52
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 9
		bodyModel[21] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 10
		bodyModel[22] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[26] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 14
		bodyModel[27] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
		bodyModel[28] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 16
		bodyModel[29] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 17
		bodyModel[30] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 18
		bodyModel[31] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 19
		bodyModel[32] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 20
		bodyModel[33] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 21
		bodyModel[34] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 22
		bodyModel[35] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 23
		bodyModel[36] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 24
		bodyModel[37] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 25
		bodyModel[38] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 26
		bodyModel[39] = new ModelRendererTurbo(this, 461, 25, textureX, textureY); // Box 27
		bodyModel[40] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 28
		bodyModel[41] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 29
		bodyModel[42] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 30
		bodyModel[43] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 31
		bodyModel[44] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 32
		bodyModel[45] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 33
		bodyModel[46] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 34
		bodyModel[47] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 35
		bodyModel[48] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 36
		bodyModel[49] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 37
		bodyModel[50] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 38
		bodyModel[51] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 39
		bodyModel[52] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 40
		bodyModel[53] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 42
		bodyModel[54] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 43
		bodyModel[55] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 44
		bodyModel[56] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 45
		bodyModel[57] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 46
		bodyModel[58] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 66
		bodyModel[62] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 52
		bodyModel[67] = new ModelRendererTurbo(this, 10, 182, textureX, textureY); // Box 323
		bodyModel[68] = new ModelRendererTurbo(this, 25, 180, textureX, textureY); // Box 324
		bodyModel[69] = new ModelRendererTurbo(this, 10, 190, textureX, textureY); // Box 325
		bodyModel[70] = new ModelRendererTurbo(this, 39, 182, textureX, textureY); // Box 326
		bodyModel[71] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 327
		bodyModel[72] = new ModelRendererTurbo(this, 35, 198, textureX, textureY); // Box 328
		bodyModel[73] = new ModelRendererTurbo(this, 29, 198, textureX, textureY); // Box 329
		bodyModel[74] = new ModelRendererTurbo(this, 48, 192, textureX, textureY); // Box 330
		bodyModel[75] = new ModelRendererTurbo(this, 48, 197, textureX, textureY); // Box 331
		bodyModel[76] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 332
		bodyModel[77] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 333
		bodyModel[78] = new ModelRendererTurbo(this, 48, 188, textureX, textureY); // Box 334
		bodyModel[79] = new ModelRendererTurbo(this, 48, 209, textureX, textureY); // Box 335
		bodyModel[80] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 336
		bodyModel[81] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 337
		bodyModel[82] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 36
		bodyModel[83] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 37
		bodyModel[84] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 1
		bodyModel[86] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 2
		bodyModel[87] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 3
		bodyModel[88] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 4
		bodyModel[89] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 5
		bodyModel[90] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 6
		bodyModel[91] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 7
		bodyModel[92] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 8
		bodyModel[93] = new ModelRendererTurbo(this, 52, 61, textureX, textureY); // Box 392
		bodyModel[94] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 393
		bodyModel[95] = new ModelRendererTurbo(this, 51, 81, textureX, textureY); // Box 394
		bodyModel[96] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 13
		bodyModel[97] = new ModelRendererTurbo(this, 52, 61, textureX, textureY); // Box 14
		bodyModel[98] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 15
		bodyModel[99] = new ModelRendererTurbo(this, 51, 81, textureX, textureY); // Box 16
		bodyModel[100] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 14
		bodyModel[101] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 26
		bodyModel[102] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 27
		bodyModel[103] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 28
		bodyModel[104] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 29
		bodyModel[105] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 30
		bodyModel[106] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 31
		bodyModel[107] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 32
		bodyModel[108] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 33
		bodyModel[109] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 34
		bodyModel[110] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 35
		bodyModel[111] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 36
		bodyModel[112] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 37
		bodyModel[113] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 3
		bodyModel[114] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		bodyModel[115] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 5
		bodyModel[116] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 6
		bodyModel[117] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 7
		bodyModel[118] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 8
		bodyModel[119] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 9
		bodyModel[120] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 10
		bodyModel[121] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 11
		bodyModel[122] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 12
		bodyModel[123] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 13
		bodyModel[124] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 14
		bodyModel[125] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 15
		bodyModel[126] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 16
		bodyModel[127] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 17
		bodyModel[128] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 18
		bodyModel[129] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 19
		bodyModel[130] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 20
		bodyModel[131] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 21
		bodyModel[132] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 22
		bodyModel[133] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 23
		bodyModel[134] = new ModelRendererTurbo(this, 378, 194, textureX, textureY); // Box 17

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F, 0F, 2.5F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-43F, 2.5F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 5, 17, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-39F, -0.5F, -8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 63, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-33F, -1.5F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-20F, -1F, 7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, -4F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, -1.5F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-3F, -1F, 7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 25, 5, 17, 0F, 0F, 1F, 4F, 1F, -8F, 0F, 1F, -8F, 0F, 0F, 1F, 4F, 0F, 8F, 4F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 4F); // Box 10
		bodyModel[5].setRotationPoint(11F, -13.5F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F, 1F, 3F, -1F, 0F, 3F, -2F, 0F, 3F, -1F, 1F, 3F, -1F, 1F, 0.5F, -2F, 0F, -4F, -2F, 0F, -4F, -1F, 1F, 0.5F, -2F); // Box 11
		bodyModel[6].setRotationPoint(31F, 2.5F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[7].setRotationPoint(22F, -7F, -17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, -1.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.7F, 0F, -1.1F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 1.7F, 0F); // Box 35
		bodyModel[8].setRotationPoint(18F, -6.5F, -17F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -1.7F, -3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.7F, -3F, 0F, -2.9F, 2.5F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -2.9F, 2.5F, 0F); // Box 36
		bodyModel[9].setRotationPoint(14F, -4.5F, -17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -2.4F, -3F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -2.4F, -3F, 0F, -3.5F, 2.5F, 0F, 0.9F, -1F, 0F, 0.9F, -1F, 0F, -3.5F, 1.7F, 0F); // Box 37
		bodyModel[10].setRotationPoint(12F, -1F, -17F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[11].setRotationPoint(26F, -6.5F, -17F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 1.2F, 0F, 0F, -1.3F, 0F, 0F, -1F, 0F, 0F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.8F, 0F); // Box 39
		bodyModel[12].setRotationPoint(30F, -4.5F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, 1.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.2F, 0F); // Box 47
		bodyModel[13].setRotationPoint(-34F, -7.5F, -18F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[14].setRotationPoint(-30F, -8F, -18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.2F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -1.1F, 1.7F, 0F, -1.1F, 1.7F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[15].setRotationPoint(-26F, -7.5F, -18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.3F, 0F, -1.7F, -3F, 0F, -1.7F, -3F, 0F, 0F, 0.3F, 0F, 1.2F, -0.3F, 0F, -2.9F, 2.5F, 0F, -2.9F, 2.5F, 0F, 1.2F, -0.3F, 0F); // Box 50
		bodyModel[16].setRotationPoint(-22F, -5.5F, -18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -0.3F, 0.5F, 0F, -2.4F, -3F, 0F, -2.4F, -3F, 0F, -0.3F, 0.5F, 0F, 0.9F, -1F, 0F, -3.5F, 2.5F, 0F, -3.5F, 1.7F, 0F, 0.9F, -1F, 0F); // Box 51
		bodyModel[17].setRotationPoint(-20F, -2F, -18F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -1F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, -1F, -1.5F, 0F, 0F, 4.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 4.5F, 0F); // Box 52
		bodyModel[18].setRotationPoint(-38F, -5.5F, -18F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 4
		bodyModel[19].setRotationPoint(-4.5F, -14F, 12.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 9
		bodyModel[20].setRotationPoint(-4.5F, -14F, -13.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 25, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F); // Box 10
		bodyModel[21].setRotationPoint(10.9F, -14.5F, -12.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(-37F, -14F, 12.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 1
		bodyModel[23].setRotationPoint(-26F, -7F, 12.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[24].setRotationPoint(-23F, -5F, 12.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 3
		bodyModel[25].setRotationPoint(-21F, -3F, 12.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[26].setRotationPoint(-37F, -7F, 12.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[27].setRotationPoint(-37F, -5F, 12.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 10, 27, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[28].setRotationPoint(-43F, -14F, -13.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 14, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[29].setRotationPoint(-37F, -14F, -12.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[30].setRotationPoint(-36F, -15F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 19
		bodyModel[31].setRotationPoint(-30F, -15F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 20
		bodyModel[32].setRotationPoint(-30F, -16F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[33].setRotationPoint(-33F, -16F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[34].setRotationPoint(-36F, -15F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[35].setRotationPoint(-36F, -15F, -13F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 24
		bodyModel[36].setRotationPoint(-30F, -16F, -13F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[37].setRotationPoint(-33F, -16F, -13F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 26
		bodyModel[38].setRotationPoint(-30F, -15F, -13F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[39].setRotationPoint(-36F, -16F, -13F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[40].setRotationPoint(-36F, -16F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[41].setRotationPoint(-36F, -16F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -1F, -1.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 3F, 0F, 0.3F); // Box 30
		bodyModel[42].setRotationPoint(-34F, -15F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 1F, 0F, 0F, -2.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -1F, 3F, 0F, 0.3F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 1F); // Box 31
		bodyModel[43].setRotationPoint(-34F, -15F, -13F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 26, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 32
		bodyModel[44].setRotationPoint(-36F, -15F, -13F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 2F, -0.2F, -0.2F, 2F, -0.2F, -0.2F, 2F, -0.2F, -0.2F, 2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 33
		bodyModel[45].setRotationPoint(-6F, -24F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 5.8F, 0F, -0.2F, -6.2F, 0F, -0.2F, -6.2F, 0F, -0.2F, 5.8F, 0F, -0.2F); // Box 34
		bodyModel[46].setRotationPoint(-6F, -20F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[47].setRotationPoint(-4F, -4F, -12.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 5, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[48].setRotationPoint(-4F, -11F, -12.5F);

		bodyModel[49].addShapeBox(-1F, -10F, 0F, 1, 10, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[49].setRotationPoint(-1.5F, -4F, 1.5F);
		bodyModel[49].rotateAngleZ = 0.03490659F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[50].setRotationPoint(-2.5F, -4F, 1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 39
		bodyModel[51].setRotationPoint(-5F, -13.5F, -13.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 40
		bodyModel[52].setRotationPoint(-5F, -13.5F, 12.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[53].setRotationPoint(-2.5F, -4F, -12.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[54].setRotationPoint(-18.5F, -4F, -12.5F);

		bodyModel[55].addShapeBox(-1F, -10F, 0F, 1, 10, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[55].setRotationPoint(-17.5F, -4F, -12.5F);
		bodyModel[55].rotateAngleZ = 0.03490659F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[56].setRotationPoint(-18.5F, -4F, 1.5F);

		bodyModel[57].addShapeBox(-1F, -10F, 0F, 1, 10, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[57].setRotationPoint(-17.5F, -4F, 1.5F);
		bodyModel[57].rotateAngleZ = 0.03490659F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 63
		bodyModel[58].setRotationPoint(-37F, -13F, 12.7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 64
		bodyModel[59].setRotationPoint(-37F, -10F, 12.7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 65
		bodyModel[60].setRotationPoint(-26F, -7F, 12.7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 66
		bodyModel[61].setRotationPoint(-37F, -7F, 12.7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 67
		bodyModel[62].setRotationPoint(-37F, -13F, -13.7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 68
		bodyModel[63].setRotationPoint(-37F, -10F, -13.7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 69
		bodyModel[64].setRotationPoint(-26F, -7F, -13.7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 70
		bodyModel[65].setRotationPoint(-37F, -7F, -13.7F);

		bodyModel[66].addShape3D(8F, -8F, -5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 5, 17, 17, 52, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 52
		bodyModel[66].setRotationPoint(26F, -9F, -0.5F);
		bodyModel[66].rotateAngleX = 1.60570291F;
		bodyModel[66].rotateAngleY = 0.15707963F;
		bodyModel[66].rotateAngleZ = -0.31415927F;

		bodyModel[67].addShapeBox(-3F, 0F, -1F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[67].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[67].rotateAngleX = -1.78023584F;
		bodyModel[67].rotateAngleY = -6.26573201F;
		bodyModel[67].rotateAngleZ = 2.44346095F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[68].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[68].rotateAngleX = -1.78023584F;
		bodyModel[68].rotateAngleY = -6.26573201F;
		bodyModel[68].rotateAngleZ = 2.44346095F;

		bodyModel[69].addShapeBox(-4F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[69].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[69].rotateAngleX = -1.78023584F;
		bodyModel[69].rotateAngleY = -6.26573201F;
		bodyModel[69].rotateAngleZ = 2.44346095F;

		bodyModel[70].addShapeBox(-5F, 0F, 1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[70].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[70].rotateAngleX = -1.78023584F;
		bodyModel[70].rotateAngleY = -6.26573201F;
		bodyModel[70].rotateAngleZ = 2.44346095F;

		bodyModel[71].addShapeBox(-6F, 0F, 4F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[71].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[71].rotateAngleX = -1.78023584F;
		bodyModel[71].rotateAngleY = -6.26573201F;
		bodyModel[71].rotateAngleZ = 2.44346095F;

		bodyModel[72].addShapeBox(-6F, 0F, 2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[72].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[72].rotateAngleX = -1.78023584F;
		bodyModel[72].rotateAngleY = -6.26573201F;
		bodyModel[72].rotateAngleZ = 2.44346095F;

		bodyModel[73].addShapeBox(-3F, 0F, 5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[73].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[73].rotateAngleX = -1.78023584F;
		bodyModel[73].rotateAngleY = -6.26573201F;
		bodyModel[73].rotateAngleZ = 2.44346095F;

		bodyModel[74].addShapeBox(-7F, 0F, 5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[74].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[74].rotateAngleX = -1.78023584F;
		bodyModel[74].rotateAngleY = -6.26573201F;
		bodyModel[74].rotateAngleZ = 2.44346095F;

		bodyModel[75].addShapeBox(-8F, 0F, 6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[75].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[75].rotateAngleX = -1.78023584F;
		bodyModel[75].rotateAngleY = -6.26573201F;
		bodyModel[75].rotateAngleZ = 2.44346095F;

		bodyModel[76].addShapeBox(-9F, 0F, 7F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[76].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[76].rotateAngleX = -1.78023584F;
		bodyModel[76].rotateAngleY = -6.26573201F;
		bodyModel[76].rotateAngleZ = 2.44346095F;

		bodyModel[77].addShapeBox(-10F, 0F, 8F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[77].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[77].rotateAngleX = -1.78023584F;
		bodyModel[77].rotateAngleY = -6.26573201F;
		bodyModel[77].rotateAngleZ = 2.44346095F;

		bodyModel[78].addShapeBox(-11F, 0F, 9F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[78].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[78].rotateAngleX = -1.78023584F;
		bodyModel[78].rotateAngleY = -6.26573201F;
		bodyModel[78].rotateAngleZ = 2.44346095F;

		bodyModel[79].addShapeBox(-13F, 0F, 10F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[79].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[79].rotateAngleX = -1.78023584F;
		bodyModel[79].rotateAngleY = -6.26573201F;
		bodyModel[79].rotateAngleZ = 2.44346095F;

		bodyModel[80].addShapeBox(-13F, 0F, 11F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[80].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[80].rotateAngleX = -1.78023584F;
		bodyModel[80].rotateAngleY = -6.26573201F;
		bodyModel[80].rotateAngleZ = 2.44346095F;

		bodyModel[81].addShapeBox(-12F, 0F, 12F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[81].setRotationPoint(11.5F, -8F, 13.5F);
		bodyModel[81].rotateAngleX = -1.78023584F;
		bodyModel[81].rotateAngleY = -6.26573201F;
		bodyModel[81].rotateAngleZ = 2.44346095F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 22, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 36
		bodyModel[82].setRotationPoint(23.5F, 1.5F, -10.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 3, 22, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 37
		bodyModel[83].setRotationPoint(-30.5F, 1.5F, -10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 4, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(-43F, -4F, -13.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 10, 22, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -1.8F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -1.8F, -3F, 0F); // Box 1
		bodyModel[85].setRotationPoint(-44F, -13F, -10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 2
		bodyModel[86].setRotationPoint(-28F, -15F, 12.5F);
		bodyModel[86].rotateAngleZ = -0.08726646F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 3
		bodyModel[87].setRotationPoint(-29F, -16F, 12.5F);
		bodyModel[87].rotateAngleZ = -0.13962634F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[88].setRotationPoint(-29F, -16F, 12.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 5
		bodyModel[89].setRotationPoint(-28F, -15F, -13.5F);
		bodyModel[89].rotateAngleZ = -0.08726646F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 6
		bodyModel[90].setRotationPoint(-29F, -16F, -13.5F);
		bodyModel[90].rotateAngleZ = -0.13962634F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[91].setRotationPoint(-29F, -16F, -13.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[92].setRotationPoint(31F, -7F, 13F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 392
		bodyModel[93].setRotationPoint(30.5F, -9F, 11.5F);

		bodyModel[94].addShapeBox(0F, -1F, 0F, 2, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 393
		bodyModel[94].setRotationPoint(30.5F, -9F, 11.5F);

		bodyModel[95].addShapeBox(0F, 2F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 394
		bodyModel[95].setRotationPoint(30.5F, -9F, 11.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[96].setRotationPoint(31F, -7F, -14F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 14
		bodyModel[97].setRotationPoint(30.5F, -9F, -15.5F);

		bodyModel[98].addShapeBox(0F, -1F, 0F, 2, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 15
		bodyModel[98].setRotationPoint(30.5F, -9F, -15.5F);

		bodyModel[99].addShapeBox(0F, 2F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 16
		bodyModel[99].setRotationPoint(30.5F, -9F, -15.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 6, 24, 0F, -2F, -0.2F, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -2F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 14
		bodyModel[100].setRotationPoint(8F, -14F, -12F);

		bodyModel[101].addBox(0F, 0F, 0F, 13, 4, 2, 0F); // Box 26
		bodyModel[101].setRotationPoint(-2F, -4.5F, -1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 27
		bodyModel[102].setRotationPoint(0F, -9.5F, -0.5F);
		bodyModel[102].rotateAngleZ = -0.26179939F;

		bodyModel[103].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[103].setRotationPoint(0F, -9.5F, -0.5F);
		bodyModel[103].rotateAngleZ = -0.26179939F;

		bodyModel[104].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 29
		bodyModel[104].setRotationPoint(9.5F, -5F, 8F);
		bodyModel[104].rotateAngleZ = -0.61086524F;

		bodyModel[105].addBox(1F, 1F, 0.5F, 3, 1, 1, 0F); // Box 30
		bodyModel[105].setRotationPoint(9.5F, -5F, 8F);
		bodyModel[105].rotateAngleZ = -0.61086524F;

		bodyModel[106].addBox(1F, 1F, 0.5F, 3, 1, 1, 0F); // Box 31
		bodyModel[106].setRotationPoint(9.5F, -5F, 4F);
		bodyModel[106].rotateAngleZ = -0.61086524F;

		bodyModel[107].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 32
		bodyModel[107].setRotationPoint(9.5F, -5F, 4F);
		bodyModel[107].rotateAngleZ = -0.61086524F;

		bodyModel[108].addShapeBox(-0.8F, 1F, 0F, 1, 4, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
		bodyModel[108].setRotationPoint(10F, -14F, -4F);
		bodyModel[108].rotateAngleZ = -0.33161256F;

		bodyModel[109].addShapeBox(-0.8F, 1F, -2F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[109].setRotationPoint(10F, -14F, -4F);
		bodyModel[109].rotateAngleZ = -0.33161256F;

		bodyModel[110].addShapeBox(-0.8F, 1F, -4F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[110].setRotationPoint(10F, -14F, -4F);
		bodyModel[110].rotateAngleZ = -0.33161256F;

		bodyModel[111].addShapeBox(-0.8F, 4F, -3F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[111].setRotationPoint(10F, -14F, -4F);
		bodyModel[111].rotateAngleZ = -0.33161256F;

		bodyModel[112].addShapeBox(-0.2F, 6.8F, 9F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[112].setRotationPoint(-38F, -13F, -10.5F);
		bodyModel[112].rotateAngleZ = -0.54105207F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, -4F, 0F, -1.5F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 3
		bodyModel[113].setRotationPoint(-3F, -1F, -13.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[114].setRotationPoint(-20F, -1F, -13.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 5
		bodyModel[115].setRotationPoint(22F, -7F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, -1.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.7F, 0F, -1.1F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 1.7F, 0F); // Box 6
		bodyModel[116].setRotationPoint(18F, -6.5F, 8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -1.7F, -3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.7F, -3F, 0F, -2.9F, 2.5F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -2.9F, 2.5F, 0F); // Box 7
		bodyModel[117].setRotationPoint(14F, -4.5F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -2.4F, -3F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -2.4F, -3F, 0F, -3.5F, 1.7F, 0F, 0.9F, -1F, 0F, 0.9F, -1F, 0F, -3.5F, 2.5F, 0F); // Box 8
		bodyModel[118].setRotationPoint(12F, -1F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -0.5F, 0F); // Box 9
		bodyModel[119].setRotationPoint(26F, -6.5F, 8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 1.2F, 0F, 0F, -1F, 0F, 0F, -1.3F, 0F, 0F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.8F, 0F); // Box 10
		bodyModel[120].setRotationPoint(30F, -4.5F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, 1.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.2F, 0F); // Box 11
		bodyModel[121].setRotationPoint(-34F, -7.5F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[122].setRotationPoint(-30F, -8F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.2F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -1.1F, 1.7F, 0F, -1.1F, 1.7F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[123].setRotationPoint(-26F, -7.5F, 9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.3F, 0F, -1.7F, -3F, 0F, -1.7F, -3F, 0F, 0F, 0.3F, 0F, 1.2F, -0.3F, 0F, -2.9F, 2.5F, 0F, -2.9F, 2.5F, 0F, 1.2F, -0.3F, 0F); // Box 14
		bodyModel[124].setRotationPoint(-22F, -5.5F, 9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -0.3F, 0.5F, 0F, -2.4F, -3F, 0F, -2.4F, -3F, 0F, -0.3F, 0.5F, 0F, 0.9F, -1F, 0F, -3.5F, 1.7F, 0F, -3.5F, 2.5F, 0F, 0.9F, -1F, 0F); // Box 15
		bodyModel[125].setRotationPoint(-20F, -2F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -1F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, -1F, -1.5F, 0F, 0F, 4.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 4.5F, 0F); // Box 16
		bodyModel[126].setRotationPoint(-38F, -5.5F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[127].setRotationPoint(-37F, -14F, -13.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 18
		bodyModel[128].setRotationPoint(-26F, -7F, -13.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 19
		bodyModel[129].setRotationPoint(-23F, -5F, -13.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 20
		bodyModel[130].setRotationPoint(-21F, -3F, -13.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[131].setRotationPoint(-37F, -7F, -13.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[132].setRotationPoint(-37F, -5F, -13.5F);

		bodyModel[133].addShapeBox(-1F, -10F, 0F, 1, 10, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[133].setRotationPoint(-1.5F, -4F, -12.5F);
		bodyModel[133].rotateAngleZ = 0.03490659F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 60, 60, 1, 0F, 0F, 0F, 0F, -57F, 0F, 0F, -57F, 0F, 0F, 0F, 0F, 0F, 0F, -57F, 0F, -57F, -57F, 0F, -57F, -57F, 0F, 0F, -57F, 0F); // Box 17
		bodyModel[134].setRotationPoint(8.8F, -13F, 0.5F);
		bodyModel[134].rotateAngleX = -0.36651914F;
		bodyModel[134].rotateAngleY = -1.57079633F;


		bodyDoorOpenModel = new ModelRendererTurbo[49];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 75
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 76
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 77
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 78
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 79
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 80
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 81
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 82
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 83
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 92
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 93
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 94
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 95
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 96
		bodyDoorOpenModel[14] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 97
		bodyDoorOpenModel[15] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 98
		bodyDoorOpenModel[16] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 99
		bodyDoorOpenModel[17] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 100
		bodyDoorOpenModel[18] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 119
		bodyDoorOpenModel[19] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 120
		bodyDoorOpenModel[20] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 121
		bodyDoorOpenModel[21] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 123
		bodyDoorOpenModel[22] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 124
		bodyDoorOpenModel[23] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 125
		bodyDoorOpenModel[24] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 126
		bodyDoorOpenModel[25] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 127
		bodyDoorOpenModel[26] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 128
		bodyDoorOpenModel[27] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 129
		bodyDoorOpenModel[28] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 130
		bodyDoorOpenModel[29] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 131
		bodyDoorOpenModel[30] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 132
		bodyDoorOpenModel[31] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 133
		bodyDoorOpenModel[32] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 134
		bodyDoorOpenModel[33] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 135
		bodyDoorOpenModel[34] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 136
		bodyDoorOpenModel[35] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 5
		bodyDoorOpenModel[36] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 7
		bodyDoorOpenModel[37] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 9
		bodyDoorOpenModel[38] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 11
		bodyDoorOpenModel[39] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 12
		bodyDoorOpenModel[40] = new ModelRendererTurbo(this, 81, 165, textureX, textureY); // Box 11
		bodyDoorOpenModel[41] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 12
		bodyDoorOpenModel[42] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 13
		bodyDoorOpenModel[43] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 14
		bodyDoorOpenModel[44] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 16
		bodyDoorOpenModel[45] = new ModelRendererTurbo(this, 457, 128, textureX, textureY); // Box 17
		bodyDoorOpenModel[46] = new ModelRendererTurbo(this, 58, 207, textureX, textureY); // Box 1
		bodyDoorOpenModel[47] = new ModelRendererTurbo(this, 58, 207, textureX, textureY); // Box 4
		bodyDoorOpenModel[48] = new ModelRendererTurbo(this, 81, 165, textureX, textureY); // Box 2

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, -0.5F, 14, 12, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.8F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.8F, 0F, 0F, -1F, 0F, 0F, -0.1F); // Box 75
		bodyDoorOpenModel[0].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[0].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[1].addShapeBox(0F, 10F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 76
		bodyDoorOpenModel[1].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[1].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[2].addShapeBox(0F, 7F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 77
		bodyDoorOpenModel[2].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[2].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[3].addShapeBox(0F, 4F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 78
		bodyDoorOpenModel[3].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[3].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[4].addShapeBox(0F, 1F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 79
		bodyDoorOpenModel[4].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[4].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[5].addShapeBox(0F, 1F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 80
		bodyDoorOpenModel[5].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[5].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[6].addShapeBox(0F, 4F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 81
		bodyDoorOpenModel[6].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[6].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[7].addShapeBox(0F, 7F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 82
		bodyDoorOpenModel[7].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[7].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[8].addShapeBox(0F, 10F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 83
		bodyDoorOpenModel[8].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[8].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[9].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 92
		bodyDoorOpenModel[9].setRotationPoint(-5F, -14F, 13F);
		bodyDoorOpenModel[9].rotateAngleY = -1.22173048F;

		bodyDoorOpenModel[10].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 93
		bodyDoorOpenModel[10].setRotationPoint(-5F, -11F, 13F);
		bodyDoorOpenModel[10].rotateAngleY = -1.22173048F;

		bodyDoorOpenModel[11].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 94
		bodyDoorOpenModel[11].setRotationPoint(-5F, -8F, 13F);
		bodyDoorOpenModel[11].rotateAngleY = -1.22173048F;

		bodyDoorOpenModel[12].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 95
		bodyDoorOpenModel[12].setRotationPoint(-5F, -5F, 13F);
		bodyDoorOpenModel[12].rotateAngleY = -1.22173048F;

		bodyDoorOpenModel[13].addShapeBox(-13F, 0F, -0.5F, 13, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyDoorOpenModel[13].setRotationPoint(-5F, -14F, 13F);
		bodyDoorOpenModel[13].rotateAngleY = -1.22173048F;

		bodyDoorOpenModel[14].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 97
		bodyDoorOpenModel[14].setRotationPoint(-5F, -14F, 13F);
		bodyDoorOpenModel[14].rotateAngleY = -1.22173048F;

		bodyDoorOpenModel[15].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 98
		bodyDoorOpenModel[15].setRotationPoint(-5F, -11F, 13F);
		bodyDoorOpenModel[15].rotateAngleY = -1.22173048F;

		bodyDoorOpenModel[16].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 99
		bodyDoorOpenModel[16].setRotationPoint(-5F, -8F, 13F);
		bodyDoorOpenModel[16].rotateAngleY = -1.22173048F;

		bodyDoorOpenModel[17].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 100
		bodyDoorOpenModel[17].setRotationPoint(-5F, -5F, 13F);
		bodyDoorOpenModel[17].rotateAngleY = -1.22173048F;

		bodyDoorOpenModel[18].addShapeBox(0F, 0F, -0.5F, 14, 12, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, 0.8F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, 0.8F, 0F, 0F, -0.1F); // Box 119
		bodyDoorOpenModel[18].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[18].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[19].addShapeBox(0F, 10F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 120
		bodyDoorOpenModel[19].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[19].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[20].addShapeBox(0F, 7F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 121
		bodyDoorOpenModel[20].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[20].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[21].addShapeBox(0F, 1F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 123
		bodyDoorOpenModel[21].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[21].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[22].addShapeBox(0F, 1F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 124
		bodyDoorOpenModel[22].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[22].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[23].addShapeBox(0F, 4F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 125
		bodyDoorOpenModel[23].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[23].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[24].addShapeBox(0F, 7F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 126
		bodyDoorOpenModel[24].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[24].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[25].addShapeBox(0F, 10F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 127
		bodyDoorOpenModel[25].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[25].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[26].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 128
		bodyDoorOpenModel[26].setRotationPoint(-5F, -14F, -13F);
		bodyDoorOpenModel[26].rotateAngleY = -5.06145483F;

		bodyDoorOpenModel[27].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 129
		bodyDoorOpenModel[27].setRotationPoint(-5F, -11F, -13F);
		bodyDoorOpenModel[27].rotateAngleY = -5.06145483F;

		bodyDoorOpenModel[28].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 130
		bodyDoorOpenModel[28].setRotationPoint(-5F, -8F, -13F);
		bodyDoorOpenModel[28].rotateAngleY = -5.06145483F;

		bodyDoorOpenModel[29].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 131
		bodyDoorOpenModel[29].setRotationPoint(-5F, -5F, -13F);
		bodyDoorOpenModel[29].rotateAngleY = -5.06145483F;

		bodyDoorOpenModel[30].addShapeBox(-13F, 0F, -0.5F, 13, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyDoorOpenModel[30].setRotationPoint(-5F, -14F, -13F);
		bodyDoorOpenModel[30].rotateAngleY = -5.06145483F;

		bodyDoorOpenModel[31].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 133
		bodyDoorOpenModel[31].setRotationPoint(-5F, -14F, -13F);
		bodyDoorOpenModel[31].rotateAngleY = -5.06145483F;

		bodyDoorOpenModel[32].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 134
		bodyDoorOpenModel[32].setRotationPoint(-5F, -11F, -13F);
		bodyDoorOpenModel[32].rotateAngleY = -5.06145483F;

		bodyDoorOpenModel[33].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 135
		bodyDoorOpenModel[33].setRotationPoint(-5F, -8F, -13F);
		bodyDoorOpenModel[33].rotateAngleY = -5.06145483F;

		bodyDoorOpenModel[34].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 136
		bodyDoorOpenModel[34].setRotationPoint(-5F, -5F, -13F);
		bodyDoorOpenModel[34].rotateAngleY = -5.06145483F;

		bodyDoorOpenModel[35].addShapeBox(0F, 4F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 5
		bodyDoorOpenModel[35].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[35].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[36].addShapeBox(12F, 4F, -1F, 1, 1, 2, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.75F, 0F, -0.2F, -0.9F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.75F); // Box 7
		bodyDoorOpenModel[36].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[36].rotateAngleY = -1.57079633F;

		bodyDoorOpenModel[37].addShapeBox(12F, 4F, -1F, 1, 1, 2, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.75F, 0F, -0.2F, -0.9F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.75F); // Box 9
		bodyDoorOpenModel[37].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[37].rotateAngleY = 1.43116999F;

		bodyDoorOpenModel[38].addShapeBox(12F, 4F, -1F, 1, 1, 2, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.75F, 0F, -0.2F, -0.9F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.75F); // Box 11
		bodyDoorOpenModel[38].setRotationPoint(-3F, -14F, 13F);
		bodyDoorOpenModel[38].rotateAngleY = -0.12217305F;

		bodyDoorOpenModel[39].addShapeBox(12F, 4F, -1F, 1, 1, 2, 0F, 0F, -0.2F, 0.75F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0.75F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1F, 0F, -0.2F, -0.9F); // Box 12
		bodyDoorOpenModel[39].setRotationPoint(-3F, -14F, -13F);
		bodyDoorOpenModel[39].rotateAngleY = 0.12217305F;

		bodyDoorOpenModel[40].addShapeBox(-1F, -2F, -24F, 2, 2, 22, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyDoorOpenModel[40].setRotationPoint(11F, -14.5F, 13F);
		bodyDoorOpenModel[40].rotateAngleZ = -1.76278254F;

		bodyDoorOpenModel[41].addShapeBox(-1F, -2F, -25F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyDoorOpenModel[41].setRotationPoint(11F, -14.5F, 13F);
		bodyDoorOpenModel[41].rotateAngleZ = -1.76278254F;

		bodyDoorOpenModel[42].addShapeBox(-1F, -2F, -2F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyDoorOpenModel[42].setRotationPoint(11F, -14.5F, 13F);
		bodyDoorOpenModel[42].rotateAngleZ = -1.76278254F;

		bodyDoorOpenModel[43].addShapeBox(-3F, -7F, -2F, 3, 5, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 14
		bodyDoorOpenModel[43].setRotationPoint(11F, -14.5F, 13F);
		bodyDoorOpenModel[43].rotateAngleZ = -1.76278254F;

		bodyDoorOpenModel[44].addShapeBox(-3F, -7F, -25F, 3, 5, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 16
		bodyDoorOpenModel[44].setRotationPoint(11F, -14.5F, 13F);
		bodyDoorOpenModel[44].rotateAngleZ = -1.76278254F;

		bodyDoorOpenModel[45].addShapeBox(-4F, -8F, -25F, 2, 1, 24, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 17
		bodyDoorOpenModel[45].setRotationPoint(11F, -14.5F, 13F);
		bodyDoorOpenModel[45].rotateAngleZ = -1.76278254F;

		bodyDoorOpenModel[46].addShapeBox(-10F, -0.8F, -10F, 35, 1, 35, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F); // Box 1
		bodyDoorOpenModel[46].setRotationPoint(-5F, -14F, 13F);
		bodyDoorOpenModel[46].rotateAngleY = -2.7925268F;
		bodyDoorOpenModel[46].rotateAngleZ = 1.57079633F;

		bodyDoorOpenModel[47].addShapeBox(-10F, -0.2F, -10F, 35, 1, 35, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F); // Box 4
		bodyDoorOpenModel[47].setRotationPoint(-5F, -14F, -13F);
		bodyDoorOpenModel[47].rotateAngleY = -0.34906585F;
		bodyDoorOpenModel[47].rotateAngleZ = 1.57079633F;

		bodyDoorOpenModel[48].addShapeBox(-0.5F, -2F, -15F, 1, 1, 8, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 2.8F, 0F, -0.2F, 2.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -3.2F, 0F, -0.2F, -3.2F, 0F); // Box 2
		bodyDoorOpenModel[48].setRotationPoint(11F, -14.5F, 13F);
		bodyDoorOpenModel[48].rotateAngleZ = -1.55334303F;


		bodyDoorCloseModel = new ModelRendererTurbo[49];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 0
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 1
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 2
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 3
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 5
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 6
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 7
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 8
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 47
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 51
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 52
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 53
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 54
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 55
		bodyDoorCloseModel[14] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 56
		bodyDoorCloseModel[15] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 57
		bodyDoorCloseModel[16] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 58
		bodyDoorCloseModel[17] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 59
		bodyDoorCloseModel[18] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 60
		bodyDoorCloseModel[19] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 61
		bodyDoorCloseModel[20] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 62
		bodyDoorCloseModel[21] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 72
		bodyDoorCloseModel[22] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 73
		bodyDoorCloseModel[23] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 74
		bodyDoorCloseModel[24] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 84
		bodyDoorCloseModel[25] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 85
		bodyDoorCloseModel[26] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 86
		bodyDoorCloseModel[27] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 87
		bodyDoorCloseModel[28] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 88
		bodyDoorCloseModel[29] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 89
		bodyDoorCloseModel[30] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 90
		bodyDoorCloseModel[31] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 91
		bodyDoorCloseModel[32] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 13
		bodyDoorCloseModel[33] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 14
		bodyDoorCloseModel[34] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 15
		bodyDoorCloseModel[35] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 16
		bodyDoorCloseModel[36] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 17
		bodyDoorCloseModel[37] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 18
		bodyDoorCloseModel[38] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 19
		bodyDoorCloseModel[39] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 20
		bodyDoorCloseModel[40] = new ModelRendererTurbo(this, 81, 165, textureX, textureY); // Box 29
		bodyDoorCloseModel[41] = new ModelRendererTurbo(this, 457, 128, textureX, textureY); // Box 35
		bodyDoorCloseModel[42] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 329
		bodyDoorCloseModel[43] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 74
		bodyDoorCloseModel[44] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 7
		bodyDoorCloseModel[45] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 8
		bodyDoorCloseModel[46] = new ModelRendererTurbo(this, 81, 165, textureX, textureY); // Box 9
		bodyDoorCloseModel[47] = new ModelRendererTurbo(this, 58, 207, textureX, textureY); // Box 0
		bodyDoorCloseModel[48] = new ModelRendererTurbo(this, 58, 207, textureX, textureY); // Box 3

		bodyDoorCloseModel[0].addShapeBox(-13F, 0F, -0.5F, 13, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyDoorCloseModel[0].setRotationPoint(-5F, -14F, 13F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 1
		bodyDoorCloseModel[1].setRotationPoint(-18F, -2F, 12.5F);

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.2F); // Box 2
		bodyDoorCloseModel[2].setRotationPoint(-3F, -2F, 12.5F);

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, -0.5F, 14, 12, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.8F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.8F, 0F, 0F, -1F, 0F, 0F, -0.1F); // Box 3
		bodyDoorCloseModel[3].setRotationPoint(-3F, -14F, 13F);

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyDoorCloseModel[4].setRotationPoint(-18F, -14F, -13.5F);

		bodyDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 6
		bodyDoorCloseModel[5].setRotationPoint(-18F, -2F, -13.5F);

		bodyDoorCloseModel[6].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F); // Box 7
		bodyDoorCloseModel[6].setRotationPoint(-3F, -2F, -13.5F);

		bodyDoorCloseModel[7].addShapeBox(0F, 0F, 0F, 14, 12, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, 0.8F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, 0.8F, 0F, 0F, -0.1F); // Box 8
		bodyDoorCloseModel[7].setRotationPoint(-3F, -14F, -13.5F);

		bodyDoorCloseModel[8].addShapeBox(0F, 1F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 47
		bodyDoorCloseModel[8].setRotationPoint(-3F, -14F, 13F);

		bodyDoorCloseModel[9].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 51
		bodyDoorCloseModel[9].setRotationPoint(-5F, -14F, 13F);

		bodyDoorCloseModel[10].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 52
		bodyDoorCloseModel[10].setRotationPoint(-5F, -11F, 13F);

		bodyDoorCloseModel[11].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 53
		bodyDoorCloseModel[11].setRotationPoint(-5F, -8F, 13F);

		bodyDoorCloseModel[12].addShapeBox(-13F, 1F, -0.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 54
		bodyDoorCloseModel[12].setRotationPoint(-5F, -5F, 13F);

		bodyDoorCloseModel[13].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 55
		bodyDoorCloseModel[13].setRotationPoint(-3F, -13F, -13.7F);

		bodyDoorCloseModel[14].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 56
		bodyDoorCloseModel[14].setRotationPoint(-3F, -10F, -13.7F);

		bodyDoorCloseModel[15].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 57
		bodyDoorCloseModel[15].setRotationPoint(-3F, -7F, -13.7F);

		bodyDoorCloseModel[16].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 58
		bodyDoorCloseModel[16].setRotationPoint(-3F, -4F, -13.7F);

		bodyDoorCloseModel[17].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 59
		bodyDoorCloseModel[17].setRotationPoint(-18F, -13F, -13.7F);

		bodyDoorCloseModel[18].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 60
		bodyDoorCloseModel[18].setRotationPoint(-18F, -10F, -13.7F);

		bodyDoorCloseModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 61
		bodyDoorCloseModel[19].setRotationPoint(-18F, -7F, -13.7F);

		bodyDoorCloseModel[20].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 62
		bodyDoorCloseModel[20].setRotationPoint(-18F, -4F, -13.7F);

		bodyDoorCloseModel[21].addShapeBox(0F, 4F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 72
		bodyDoorCloseModel[21].setRotationPoint(-3F, -14F, 13F);

		bodyDoorCloseModel[22].addShapeBox(0F, 7F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 73
		bodyDoorCloseModel[22].setRotationPoint(-3F, -14F, 13F);

		bodyDoorCloseModel[23].addShapeBox(0F, 10F, -0.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 74
		bodyDoorCloseModel[23].setRotationPoint(-3F, -14F, 13F);

		bodyDoorCloseModel[24].addShapeBox(0F, 1F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 84
		bodyDoorCloseModel[24].setRotationPoint(-3F, -14F, 13F);

		bodyDoorCloseModel[25].addShapeBox(0F, 4F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 85
		bodyDoorCloseModel[25].setRotationPoint(-3F, -14F, 13F);

		bodyDoorCloseModel[26].addShapeBox(0F, 7F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 86
		bodyDoorCloseModel[26].setRotationPoint(-3F, -14F, 13F);

		bodyDoorCloseModel[27].addShapeBox(0F, 10F, -0.7F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -0.1F); // Box 87
		bodyDoorCloseModel[27].setRotationPoint(-3F, -14F, 13F);

		bodyDoorCloseModel[28].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 88
		bodyDoorCloseModel[28].setRotationPoint(-5F, -14F, 13F);

		bodyDoorCloseModel[29].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 89
		bodyDoorCloseModel[29].setRotationPoint(-5F, -11F, 13F);

		bodyDoorCloseModel[30].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 90
		bodyDoorCloseModel[30].setRotationPoint(-5F, -8F, 13F);

		bodyDoorCloseModel[31].addShapeBox(-13F, 1F, -0.7F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 91
		bodyDoorCloseModel[31].setRotationPoint(-5F, -5F, 13F);

		bodyDoorCloseModel[32].addShapeBox(0F, 1F, -1.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 13
		bodyDoorCloseModel[32].setRotationPoint(-3F, -14F, -12F);

		bodyDoorCloseModel[33].addShapeBox(0F, 4F, -1.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 14
		bodyDoorCloseModel[33].setRotationPoint(-3F, -14F, -12F);

		bodyDoorCloseModel[34].addShapeBox(0F, 7F, -1.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 15
		bodyDoorCloseModel[34].setRotationPoint(-3F, -14F, -12F);

		bodyDoorCloseModel[35].addShapeBox(0F, 10F, -1.3F, 14, 1, 1, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0.8F, -0.5F, -0.3F, -0.1F); // Box 16
		bodyDoorCloseModel[35].setRotationPoint(-3F, -14F, -12F);

		bodyDoorCloseModel[36].addShapeBox(-13F, 1F, -1.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 17
		bodyDoorCloseModel[36].setRotationPoint(-5F, -14F, -12F);

		bodyDoorCloseModel[37].addShapeBox(-13F, 1F, -1.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 18
		bodyDoorCloseModel[37].setRotationPoint(-5F, -11F, -12F);

		bodyDoorCloseModel[38].addShapeBox(-13F, 1F, -1.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 19
		bodyDoorCloseModel[38].setRotationPoint(-5F, -8F, -12F);

		bodyDoorCloseModel[39].addShapeBox(-13F, 1F, -1.3F, 13, 1, 1, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 20
		bodyDoorCloseModel[39].setRotationPoint(-5F, -5F, -12F);

		bodyDoorCloseModel[40].addShapeBox(-1F, -2F, -24F, 2, 2, 22, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyDoorCloseModel[40].setRotationPoint(11F, -14.5F, 13F);

		bodyDoorCloseModel[41].addShapeBox(-4F, -8F, -25F, 2, 1, 24, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 35
		bodyDoorCloseModel[41].setRotationPoint(11F, -14.5F, 13F);

		bodyDoorCloseModel[42].addShapeBox(-3F, -7F, -25F, 3, 5, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 329
		bodyDoorCloseModel[42].setRotationPoint(11F, -14.5F, 13F);

		bodyDoorCloseModel[43].addShapeBox(-1F, -2F, -2F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 74
		bodyDoorCloseModel[43].setRotationPoint(11F, -14.5F, 13F);

		bodyDoorCloseModel[44].addShapeBox(-1F, -2F, -25F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 7
		bodyDoorCloseModel[44].setRotationPoint(11F, -14.5F, 13F);

		bodyDoorCloseModel[45].addShapeBox(-3F, -7F, -2F, 3, 5, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 8
		bodyDoorCloseModel[45].setRotationPoint(11F, -14.5F, 13F);

		bodyDoorCloseModel[46].addShapeBox(-1F, -2F, -15F, 1, 1, 8, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 2.8F, 0F, -0.2F, 2.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -3.2F, 0F, -0.2F, -3.2F, 0F); // Box 9
		bodyDoorCloseModel[46].setRotationPoint(11F, -14.5F, 13F);

		bodyDoorCloseModel[47].addShapeBox(-10F, -0.8F, -10F, 35, 1, 35, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F); // Box 0
		bodyDoorCloseModel[47].setRotationPoint(-5F, -14F, 13F);
		bodyDoorCloseModel[47].rotateAngleY = -1.57079633F;
		bodyDoorCloseModel[47].rotateAngleZ = 1.57079633F;

		bodyDoorCloseModel[48].addShapeBox(-10F, -0.2F, -10F, 35, 1, 35, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F); // Box 3
		bodyDoorCloseModel[48].setRotationPoint(-5F, -14F, -13F);
		bodyDoorCloseModel[48].rotateAngleY = -1.57079633F;
		bodyDoorCloseModel[48].rotateAngleZ = 1.57079633F;


		leftFrontWheelModel = new ModelRendererTurbo[1];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 10

		leftFrontWheelModel[0].addShape3D(8F, -7F, -5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 5, 17, 17, 52, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 10
		leftFrontWheelModel[0].setRotationPoint(25F, 3F, 11F);


		rightFrontWheelModel = new ModelRendererTurbo[1];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 2

		rightFrontWheelModel[0].addShape3D(8F, -7F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 5, 17, 17, 52, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 2
		rightFrontWheelModel[0].setRotationPoint(25F, 3F, -10F);


		leftBackWheelModel = new ModelRendererTurbo[1];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 4

		leftBackWheelModel[0].addShape3D(8F, -7F, -5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 5, 17, 17, 52, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 4
		leftBackWheelModel[0].setRotationPoint(-29F, 3F, 11F);


		rightBackWheelModel = new ModelRendererTurbo[1];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 3

		rightBackWheelModel[0].addShape3D(8F, -7F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 5, 17, 17, 52, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 3
		rightBackWheelModel[0].setRotationPoint(-29F, 3F, -10F);


		steeringWheelModel = new ModelRendererTurbo[9];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 15
		steeringWheelModel[1] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 16
		steeringWheelModel[2] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 17
		steeringWheelModel[3] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 25
		steeringWheelModel[4] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 25
		steeringWheelModel[5] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 26
		steeringWheelModel[6] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 27
		steeringWheelModel[7] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 28
		steeringWheelModel[8] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 29

		steeringWheelModel[0].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 15
		steeringWheelModel[0].setRotationPoint(7F, -13F, 5F);
		steeringWheelModel[0].rotateAngleZ = -0.43633231F;

		steeringWheelModel[1].addShapeBox(-1F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		steeringWheelModel[1].setRotationPoint(7F, -13F, 5F);
		steeringWheelModel[1].rotateAngleZ = -0.43633231F;

		steeringWheelModel[2].addShapeBox(-1F, -0.8F, 0.3F, 1, 1, 3, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 1.7F, -1F, -0.3F, 1.7F, -1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -2.3F, -1F, -0.3F, -2.3F, -1F); // Box 17
		steeringWheelModel[2].setRotationPoint(7F, -13F, 5F);
		steeringWheelModel[2].rotateAngleZ = -0.43633231F;

		steeringWheelModel[3].addShapeBox(-1F, -3F, -3F, 1, 1, 6, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 25
		steeringWheelModel[3].setRotationPoint(7F, -13F, 5F);
		steeringWheelModel[3].rotateAngleZ = -0.43633231F;

		steeringWheelModel[4].addShapeBox(-1F, 2F, -3F, 1, 1, 6, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F); // Box 25
		steeringWheelModel[4].setRotationPoint(7F, -13F, 5F);
		steeringWheelModel[4].rotateAngleZ = -0.43633231F;

		steeringWheelModel[5].addShapeBox(-1F, -0.8F, -3.3F, 1, 1, 3, 0F, -0.3F, 1.7F, -1F, -0.3F, 1.7F, -1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -2.3F, -1F, -0.3F, -2.3F, -1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 26
		steeringWheelModel[5].setRotationPoint(7F, -13F, 5F);
		steeringWheelModel[5].rotateAngleZ = -0.43633231F;

		steeringWheelModel[6].addShapeBox(-1F, 0.8F, -2.85F, 1, 1, 3, 0F, -0.3F, 0.3F, -2.7F, -0.3F, 0.3F, -2.7F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -2.7F, -0.3F, 0.3F, -2.7F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F); // Box 27
		steeringWheelModel[6].setRotationPoint(7F, -13F, 5F);
		steeringWheelModel[6].rotateAngleZ = -0.43633231F;

		steeringWheelModel[7].addShapeBox(-1F, -0.5F, -0.5F, 1, 1, 6, 0F, -0.2F, 2.5F, -2.5F, -0.2F, 2.5F, -2.5F, -0.2F, 1.5F, -2.5F, -0.2F, 1.5F, -2.5F, -0.2F, 2.5F, -2.5F, -0.2F, 2.5F, -2.5F, -0.2F, 1.5F, -2.5F, -0.2F, 1.5F, -2.5F); // Box 28
		steeringWheelModel[7].setRotationPoint(7F, -13F, 5F);
		steeringWheelModel[7].rotateAngleZ = -0.43633231F;

		steeringWheelModel[8].addShapeBox(-1F, -0.5F, -5.5F, 1, 1, 6, 0F, -0.2F, 1.5F, -2.5F, -0.2F, 1.5F, -2.5F, -0.2F, 2.5F, -2.5F, -0.2F, 2.5F, -2.5F, -0.2F, 1.5F, -2.5F, -0.2F, 1.5F, -2.5F, -0.2F, 2.5F, -2.5F, -0.2F, 2.5F, -2.5F); // Box 29
		steeringWheelModel[8].setRotationPoint(7F, -13F, 5F);
		steeringWheelModel[8].rotateAngleZ = -0.43633231F;


		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[16];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 9, 227, textureX, textureY); // Box 4
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 41, 227, textureX, textureY); // Box 5
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 1, 235, textureX, textureY); // Box 6
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 57, 227, textureX, textureY); // Box 7
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 17, 235, textureX, textureY); // Box 8
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 25, 235, textureX, textureY); // Box 9
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 33, 235, textureX, textureY); // Box 10
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 41, 235, textureX, textureY); // Box 12
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 49, 235, textureX, textureY); // Box 13
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 1, 243, textureX, textureY); // Box 15
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 9, 243, textureX, textureY); // Box 16
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 17, 243, textureX, textureY); // Box 17
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 25, 243, textureX, textureY); // Box 18
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 33, 227, textureX, textureY); // Box 19
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 1, 251, textureX, textureY); // Box 0
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 49, 243, textureX, textureY); // Box 1

		gun_1_Model[1][0].addShapeBox(1F, -1.3F, -0.5F, 12, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 4

		gun_1_Model[1][1].addShapeBox(-2F, -1.3F, -0.5F, 3, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 5

		gun_1_Model[1][2].addShapeBox(-7F, -1.3F, -0.5F, 5, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.2F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.2F); // Box 6

		gun_1_Model[1][3].addShapeBox(14F, -1.3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Box 7

		gun_1_Model[1][4].addShapeBox(13F, -1.3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Box 8

		gun_1_Model[1][5].addShapeBox(0F, -1.5F, -2F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 9

		gun_1_Model[1][6].addShapeBox(0F, -1.5F, -1.5F, 1, 2, 1, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 10

		gun_1_Model[1][7].addShapeBox(12F, -2.3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 12

		gun_1_Model[1][8].addShapeBox(2F, -2F, -1F, 2, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 13

		gun_1_Model[1][9].addShapeBox(-4.9F, -1.8F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_1_Model[1][10].addShapeBox(-9F, -1.3F, -0.5F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1F, 0F); // Box 16

		gun_1_Model[1][11].addShapeBox(-6F, 0.2F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -0.2F); // Box 17

		gun_1_Model[1][12].addShapeBox(-1.5F, -0.8F, 1F, 2, 3, 4, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 18

		gun_1_Model[1][13].addShapeBox(-1.5F, -1.5F, 0.4F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_1_Model[1][14].addShapeBox(1F, -1.3F, -0.5F, 12, 1, 1, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F); // Box 0

		gun_1_Model[1][15].addShapeBox(-1.5F, -0.9F, 1F, 2, 3, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 1

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(-5F, -25F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
