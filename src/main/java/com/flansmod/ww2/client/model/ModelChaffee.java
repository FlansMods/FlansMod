//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelChaffee extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelChaffee() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[158];
		bodyModel[0] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 37
		bodyModel[13] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 38
		bodyModel[14] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 39
		bodyModel[15] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 40
		bodyModel[16] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 41
		bodyModel[17] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 42
		bodyModel[18] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 43
		bodyModel[19] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 44
		bodyModel[20] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 45
		bodyModel[21] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 46
		bodyModel[22] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 47
		bodyModel[23] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 48
		bodyModel[24] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 49
		bodyModel[25] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 50
		bodyModel[26] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 51
		bodyModel[27] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 52
		bodyModel[28] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 60
		bodyModel[29] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 61
		bodyModel[30] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 62
		bodyModel[31] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 63
		bodyModel[32] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 64
		bodyModel[33] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 179
		bodyModel[34] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 180
		bodyModel[35] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 181
		bodyModel[36] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 190
		bodyModel[37] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 191
		bodyModel[38] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 192
		bodyModel[39] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 193
		bodyModel[40] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 194
		bodyModel[41] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 195
		bodyModel[42] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 196
		bodyModel[43] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 176
		bodyModel[44] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 177
		bodyModel[45] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 178
		bodyModel[46] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 179
		bodyModel[47] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 180
		bodyModel[48] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 186
		bodyModel[49] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 187
		bodyModel[50] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 188
		bodyModel[51] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 189
		bodyModel[52] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 190
		bodyModel[53] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 207
		bodyModel[54] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 208
		bodyModel[55] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 210
		bodyModel[56] = new ModelRendererTurbo(this, 884, 142, textureX, textureY); // Box 214
		bodyModel[57] = new ModelRendererTurbo(this, 884, 142, textureX, textureY); // Box 215
		bodyModel[58] = new ModelRendererTurbo(this, 884, 142, textureX, textureY); // Box 216
		bodyModel[59] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 217
		bodyModel[60] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 218
		bodyModel[61] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 219
		bodyModel[62] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 220
		bodyModel[63] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 221
		bodyModel[64] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 222
		bodyModel[65] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 223
		bodyModel[66] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 6
		bodyModel[67] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 7
		bodyModel[68] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 8
		bodyModel[69] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 9
		bodyModel[70] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 12
		bodyModel[71] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 13
		bodyModel[72] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 14
		bodyModel[73] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 19
		bodyModel[74] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 20
		bodyModel[75] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 21
		bodyModel[76] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 22
		bodyModel[77] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 23
		bodyModel[78] = new ModelRendererTurbo(this, 590, 73, textureX, textureY); // Box 24
		bodyModel[79] = new ModelRendererTurbo(this, 590, 73, textureX, textureY); // Box 25
		bodyModel[80] = new ModelRendererTurbo(this, 529, 47, textureX, textureY); // Box 26
		bodyModel[81] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 5
		bodyModel[82] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 9
		bodyModel[83] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Box 10
		bodyModel[84] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Box 1
		bodyModel[86] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Box 2
		bodyModel[87] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Box 3
		bodyModel[88] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Box 4
		bodyModel[89] = new ModelRendererTurbo(this, 909, 15, textureX, textureY); // Box 5
		bodyModel[90] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 6
		bodyModel[91] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 7
		bodyModel[92] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 8
		bodyModel[93] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 9
		bodyModel[94] = new ModelRendererTurbo(this, 882, 73, textureX, textureY); // Box 10
		bodyModel[95] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 11
		bodyModel[96] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 12
		bodyModel[97] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 13
		bodyModel[98] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 14
		bodyModel[99] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 15
		bodyModel[100] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 16
		bodyModel[101] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 18
		bodyModel[102] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 19
		bodyModel[103] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 20
		bodyModel[104] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 21
		bodyModel[105] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 22
		bodyModel[106] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 23
		bodyModel[107] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 26
		bodyModel[108] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 39
		bodyModel[109] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 40
		bodyModel[110] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 41
		bodyModel[111] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 42
		bodyModel[112] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 43
		bodyModel[113] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 44
		bodyModel[114] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 46
		bodyModel[115] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 52
		bodyModel[116] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 1
		bodyModel[118] = new ModelRendererTurbo(this, 590, 73, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 590, 73, textureX, textureY); // Box 1
		bodyModel[120] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 4
		bodyModel[121] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 5
		bodyModel[122] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 6
		bodyModel[123] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 1
		bodyModel[125] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 2
		bodyModel[126] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 3
		bodyModel[127] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 4
		bodyModel[128] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 5
		bodyModel[129] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 6
		bodyModel[130] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 7
		bodyModel[131] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 8
		bodyModel[132] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 9
		bodyModel[133] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 10
		bodyModel[134] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 11
		bodyModel[135] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 12
		bodyModel[136] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 13
		bodyModel[137] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 14
		bodyModel[138] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 18
		bodyModel[139] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 19
		bodyModel[140] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 20
		bodyModel[141] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 21
		bodyModel[142] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 1
		bodyModel[144] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 2
		bodyModel[145] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 3
		bodyModel[146] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 4
		bodyModel[147] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 5
		bodyModel[148] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 6
		bodyModel[149] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 7
		bodyModel[150] = new ModelRendererTurbo(this, 529, 47, textureX, textureY); // Box 8
		bodyModel[151] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 9
		bodyModel[152] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 10
		bodyModel[153] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 11
		bodyModel[154] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 12
		bodyModel[155] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 13
		bodyModel[156] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 14
		bodyModel[157] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 21, 12, 19, 0F, 0F, -1F, -5F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(24F, -21F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 21, 11, 7, 0F, 0F, -1F, 0F, 0F, -11F, -2F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(24F, -20F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 22, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(5F, -21F, -21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 22, 7, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-30F, -21F, -21F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 21, 14, 28, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[4].setRotationPoint(-51F, -21F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 23, 14, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[5].setRotationPoint(5F, -22F, -14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 35, 23, 14, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[6].setRotationPoint(-30F, -22F, -14F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 22, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[7].setRotationPoint(5F, -21F, 14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 19, 23, 14, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[8].setRotationPoint(5F, -22F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 35, 23, 14, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-30F, -22F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 35, 22, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[10].setRotationPoint(-30F, -21F, 14F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 21, 14, 7, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-51F, -21F, 14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 27, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[12].setRotationPoint(-30F, -22.5F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 27, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[13].setRotationPoint(-24F, -22.5F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[14].setRotationPoint(-21F, -21.5F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 4, 26, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[15].setRotationPoint(-50F, -19F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 4, 20, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 41
		bodyModel[16].setRotationPoint(29F, -18.5F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 20, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[17].setRotationPoint(34F, -15.5F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 4, 20, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 43
		bodyModel[18].setRotationPoint(38F, -13.5F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[19].setRotationPoint(35F, -15.5F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[20].setRotationPoint(35F, -15.5F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[21].setRotationPoint(36F, -19F, -19F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[22].setRotationPoint(36F, -18F, -16F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[23].setRotationPoint(36F, -18F, -13F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[24].setRotationPoint(36F, -16F, -15F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[25].setRotationPoint(36F, -16F, -18F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[26].setRotationPoint(36F, -19F, -16F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[27].setRotationPoint(36F, -20F, -19F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 21, 10, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[28].setRotationPoint(24F, -9F, -21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 18, 8, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 61
		bodyModel[29].setRotationPoint(-48F, -7F, -21F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 83, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[30].setRotationPoint(-44F, -16F, 21F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[31].setRotationPoint(-51F, -16F, 21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[32].setRotationPoint(-54F, -14F, 21F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 179
		bodyModel[33].setRotationPoint(42F, -14F, -28F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 180
		bodyModel[34].setRotationPoint(39F, -16F, -28F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 83, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[35].setRotationPoint(-44F, -16F, -28F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[36].setRotationPoint(39F, -15F, 28F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 20, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 191
		bodyModel[37].setRotationPoint(19F, -15F, 28F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 45, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[38].setRotationPoint(-26F, -15F, 28F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 18, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[39].setRotationPoint(-44F, -15F, 28F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 10, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[40].setRotationPoint(-50F, -15F, 28F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 195
		bodyModel[41].setRotationPoint(-53F, -13F, 28F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[42].setRotationPoint(44F, -12F, 28F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[43].setRotationPoint(-34F, -18F, 21F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[44].setRotationPoint(-21F, -18F, 21F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[45].setRotationPoint(-8F, -18F, 21F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[46].setRotationPoint(15F, -18F, 20F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[47].setRotationPoint(27F, -17F, 21F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[48].setRotationPoint(44F, -12F, -30F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[49].setRotationPoint(39F, -15F, -30F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 20, 9, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 188
		bodyModel[50].setRotationPoint(19F, -15F, -30F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 45, 7, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[51].setRotationPoint(-26F, -15F, -30F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 10, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[52].setRotationPoint(-44F, -15F, -30F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[53].setRotationPoint(-51.5F, -15F, 16.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 208
		bodyModel[54].setRotationPoint(-51.5F, -13F, 16.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[55].setRotationPoint(-51.5F, -14F, 16.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[56].setRotationPoint(-57F, -13F, -12F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 24, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 215
		bodyModel[57].setRotationPoint(-57F, -11F, -12F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[58].setRotationPoint(-56F, -10F, -12F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[59].setRotationPoint(-56F, -13F, -12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[60].setRotationPoint(-56F, -13F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[61].setRotationPoint(-52F, -6F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 220
		bodyModel[62].setRotationPoint(-50F, -5F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[63].setRotationPoint(-52F, -3F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[64].setRotationPoint(-52F, -4F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 223
		bodyModel[65].setRotationPoint(-49F, -4F, -3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[66].setRotationPoint(34F, -18F, -15F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[67].setRotationPoint(34F, -18F, -18F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[68].setRotationPoint(35F, -19F, -17.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[69].setRotationPoint(28F, -17F, -19F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[70].setRotationPoint(34F, -14F, -17F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 13
		bodyModel[71].setRotationPoint(41F, -14F, -17F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 14
		bodyModel[72].setRotationPoint(42F, -12.5F, -15.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[73].setRotationPoint(37F, -9F, -21F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[74].setRotationPoint(37F, -9F, 13F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 21
		bodyModel[75].setRotationPoint(26F, -20F, 7F);
		bodyModel[75].rotateAngleZ = -0.4712389F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 74, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[76].setRotationPoint(-39F, -17F, 21F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 23
		bodyModel[77].setRotationPoint(35F, -17F, 17F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[78].setRotationPoint(45F, -10F, 17F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[79].setRotationPoint(44F, -8F, 17F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 26
		bodyModel[80].setRotationPoint(-40F, -17F, 21F);

		bodyModel[81].addShapeBox(-9F, 0F, -20F, 16, 2, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[81].setRotationPoint(1F, -21.5F, 0F);

		bodyModel[82].addShapeBox(7F, 0F, -20F, 8, 2, 40, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 9
		bodyModel[82].setRotationPoint(1F, -21.5F, 0F);

		bodyModel[83].addShapeBox(-18F, 0F, -20F, 9, 2, 40, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 10
		bodyModel[83].setRotationPoint(1F, -21.5F, 0F);

		bodyModel[84].addShapeBox(0F, 1F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(45F, -5F, -9F);
		bodyModel[84].rotateAngleX = -2.26892803F;
		bodyModel[84].rotateAngleY = -1.57079633F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[85].setRotationPoint(45F, -5F, -9F);
		bodyModel[85].rotateAngleX = -2.26892803F;
		bodyModel[85].rotateAngleY = -1.57079633F;

		bodyModel[86].addShapeBox(0F, 1F, 3F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[86].setRotationPoint(45F, -5F, -9F);
		bodyModel[86].rotateAngleX = -2.26892803F;
		bodyModel[86].rotateAngleY = -1.57079633F;

		bodyModel[87].addShapeBox(0F, 1F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[87].setRotationPoint(45F, -5F, 10F);
		bodyModel[87].rotateAngleX = -2.26892803F;
		bodyModel[87].rotateAngleY = -1.57079633F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[88].setRotationPoint(45F, -5F, 10F);
		bodyModel[88].rotateAngleX = -2.26892803F;
		bodyModel[88].rotateAngleY = -1.57079633F;

		bodyModel[89].addShapeBox(0F, 1F, 3F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[89].setRotationPoint(45F, -5F, 10F);
		bodyModel[89].rotateAngleX = -2.26892803F;
		bodyModel[89].rotateAngleY = -1.57079633F;

		bodyModel[90].addShapeBox(0F, -0.2F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[90].setRotationPoint(26F, -20F, 7F);
		bodyModel[90].rotateAngleZ = -0.4712389F;

		bodyModel[91].addShapeBox(4F, -0.2F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[91].setRotationPoint(26F, -20F, 7F);
		bodyModel[91].rotateAngleZ = -0.4712389F;

		bodyModel[92].addShapeBox(1F, -0.2F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[92].setRotationPoint(26F, -20F, 7F);
		bodyModel[92].rotateAngleZ = -0.4712389F;

		bodyModel[93].addShapeBox(1F, -0.2F, 8F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[93].setRotationPoint(26F, -20F, 6F);
		bodyModel[93].rotateAngleZ = -0.4712389F;

		bodyModel[94].addShapeBox(4.2F, -0.2F, 3.5F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 10
		bodyModel[94].setRotationPoint(26F, -20F, 7F);
		bodyModel[94].rotateAngleZ = -0.4712389F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[95].setRotationPoint(17.5F, -21.5F, 7F);
		bodyModel[95].rotateAngleX = -0.08726646F;
		bodyModel[95].rotateAngleY = -0.12217305F;
		bodyModel[95].rotateAngleZ = -0.08726646F;

		bodyModel[96].addShapeBox(5F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 12
		bodyModel[96].setRotationPoint(17.5F, -21.5F, 7F);
		bodyModel[96].rotateAngleX = -0.08726646F;
		bodyModel[96].rotateAngleY = -0.12217305F;
		bodyModel[96].rotateAngleZ = -0.08726646F;

		bodyModel[97].addShapeBox(-1F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 13
		bodyModel[97].setRotationPoint(17.5F, -21.5F, 7F);
		bodyModel[97].rotateAngleX = -0.08726646F;
		bodyModel[97].rotateAngleY = -0.12217305F;
		bodyModel[97].rotateAngleZ = -0.08726646F;

		bodyModel[98].addShapeBox(-3F, 0F, 7F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[98].setRotationPoint(17.5F, -21.7F, 7F);
		bodyModel[98].rotateAngleX = -0.08726646F;
		bodyModel[98].rotateAngleY = -0.12217305F;
		bodyModel[98].rotateAngleZ = -0.08726646F;

		bodyModel[99].addShapeBox(-5F, 0F, 7F, 2, 1, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 15
		bodyModel[99].setRotationPoint(17.5F, -21.7F, 7F);
		bodyModel[99].rotateAngleX = -0.08726646F;
		bodyModel[99].rotateAngleY = -0.12217305F;
		bodyModel[99].rotateAngleZ = -0.08726646F;

		bodyModel[100].addShapeBox(1F, 0F, 7F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F); // Box 16
		bodyModel[100].setRotationPoint(17.5F, -21.7F, 7F);
		bodyModel[100].rotateAngleX = -0.08726646F;
		bodyModel[100].rotateAngleY = -0.12217305F;
		bodyModel[100].rotateAngleZ = -0.08726646F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[101].setRotationPoint(18.5F, -20.5F, -18F);
		bodyModel[101].rotateAngleX = 0.08726646F;
		bodyModel[101].rotateAngleY = 0.12217305F;
		bodyModel[101].rotateAngleZ = -0.08726646F;

		bodyModel[102].addShapeBox(5F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 19
		bodyModel[102].setRotationPoint(18.5F, -20.5F, -18F);
		bodyModel[102].rotateAngleX = 0.08726646F;
		bodyModel[102].rotateAngleY = 0.12217305F;
		bodyModel[102].rotateAngleZ = -0.08726646F;

		bodyModel[103].addShapeBox(-1F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 20
		bodyModel[103].setRotationPoint(18.5F, -20.5F, -18F);
		bodyModel[103].rotateAngleX = 0.08726646F;
		bodyModel[103].rotateAngleY = 0.12217305F;
		bodyModel[103].rotateAngleZ = -0.08726646F;

		bodyModel[104].addShapeBox(-3F, 0F, 2F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[104].setRotationPoint(18.5F, -20.7F, -18F);
		bodyModel[104].rotateAngleX = 0.08726646F;
		bodyModel[104].rotateAngleY = 0.12217305F;
		bodyModel[104].rotateAngleZ = -0.08726646F;

		bodyModel[105].addShapeBox(-5F, 0F, 2F, 2, 1, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 22
		bodyModel[105].setRotationPoint(18.5F, -20.7F, -18F);
		bodyModel[105].rotateAngleX = 0.08726646F;
		bodyModel[105].rotateAngleY = 0.12217305F;
		bodyModel[105].rotateAngleZ = -0.08726646F;

		bodyModel[106].addShapeBox(1F, 0F, 2F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F); // Box 23
		bodyModel[106].setRotationPoint(18.5F, -20.7F, -18F);
		bodyModel[106].rotateAngleX = 0.08726646F;
		bodyModel[106].rotateAngleY = 0.12217305F;
		bodyModel[106].rotateAngleZ = -0.08726646F;

		bodyModel[107].addShapeBox(-1.05F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 26
		bodyModel[107].setRotationPoint(26F, -20F, 6.5F);
		bodyModel[107].rotateAngleZ = -0.4712389F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[108].setRotationPoint(-34F, -18F, -28F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[109].setRotationPoint(-21F, -18F, -28F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[110].setRotationPoint(-8F, -18F, -28F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[111].setRotationPoint(15F, -18F, -28F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[112].setRotationPoint(27F, -17F, -28F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 74, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[113].setRotationPoint(-39F, -17F, -22F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[114].setRotationPoint(-6F, -20F, 22.5F);
		bodyModel[114].rotateAngleX = -0.08726646F;
		bodyModel[114].rotateAngleY = -0.03490659F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[115].setRotationPoint(8F, -19F, 22.5F);
		bodyModel[115].rotateAngleY = 0.10471976F;

		bodyModel[116].addShapeBox(4F, -0.5F, 5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[116].setRotationPoint(18.5F, -20.5F, -18F);
		bodyModel[116].rotateAngleX = 0.08726646F;
		bodyModel[116].rotateAngleY = 0.12217305F;
		bodyModel[116].rotateAngleZ = -0.08726646F;

		bodyModel[117].addShapeBox(4F, -0.5F, 4F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[117].setRotationPoint(17.5F, -21.5F, 7F);
		bodyModel[117].rotateAngleX = -0.08726646F;
		bodyModel[117].rotateAngleY = -0.12217305F;
		bodyModel[117].rotateAngleZ = -0.08726646F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[118].setRotationPoint(45F, -10F, -18F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[119].setRotationPoint(44F, -8F, -18F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 21, 14, 7, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[120].setRotationPoint(-51F, -21F, -21F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[121].setRotationPoint(2F, -19F, -28.5F);
		bodyModel[121].rotateAngleX = 0.08726646F;
		bodyModel[121].rotateAngleY = -0.03490659F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[122].setRotationPoint(20F, -19F, -27F);
		bodyModel[122].rotateAngleY = -0.10471976F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 21, 11, 7, 0F, 0F, 0F, 0F, 0F, -11F, -5F, 0F, -11F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 0
		bodyModel[123].setRotationPoint(24F, -20F, 14F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 1
		bodyModel[124].setRotationPoint(35F, -17F, -22F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[125].setRotationPoint(28F, -17F, -16F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[126].setRotationPoint(28F, -17F, -13F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[127].setRotationPoint(28F, -17F, 18F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[128].setRotationPoint(28F, -17F, 15F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[129].setRotationPoint(28F, -17F, 12F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[130].setRotationPoint(-56F, -11F, 2.5F);
		bodyModel[130].rotateAngleX = 1.30899694F;
		bodyModel[130].rotateAngleY = -1.57079633F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[131].setRotationPoint(36F, -19F, 18F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[132].setRotationPoint(36F, -18F, 15F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[133].setRotationPoint(36F, -18F, 12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[134].setRotationPoint(36F, -16F, 13F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[135].setRotationPoint(36F, -16F, 16F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[136].setRotationPoint(36F, -19F, 12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[137].setRotationPoint(36F, -20F, 15F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 10, 2, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[138].setRotationPoint(-50F, -15F, -30F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 19
		bodyModel[139].setRotationPoint(-53F, -13F, -30F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 20
		bodyModel[140].setRotationPoint(42F, -14F, 21F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 21
		bodyModel[141].setRotationPoint(39F, -16F, 21F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[142].setRotationPoint(39F, -15F, -21F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[143].setRotationPoint(44F, -12F, -21F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 20, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 2
		bodyModel[144].setRotationPoint(19F, -15F, -21F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[145].setRotationPoint(39F, -15F, 19F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[146].setRotationPoint(44F, -12F, 19F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 20, 9, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[147].setRotationPoint(19F, -15F, 19F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[148].setRotationPoint(-51F, -16F, -28F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[149].setRotationPoint(-54F, -14F, -28F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[150].setRotationPoint(-40F, -17F, -22F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[151].setRotationPoint(34F, -18F, 13F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[152].setRotationPoint(34F, -18F, 16F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[153].setRotationPoint(35F, -19F, 16.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[154].setRotationPoint(-51.5F, -15F, -19.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		bodyModel[155].setRotationPoint(-51.5F, -13F, -19.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[156].setRotationPoint(-51.5F, -14F, -19.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 21, 12, 19, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 0
		bodyModel[157].setRotationPoint(24F, -21F, 0F);


		turretModel = new ModelRendererTurbo[50];
		turretModel[0] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 24
		turretModel[1] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 25
		turretModel[2] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 26
		turretModel[3] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 27
		turretModel[4] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 28
		turretModel[5] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 29
		turretModel[6] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 30
		turretModel[7] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 31
		turretModel[8] = new ModelRendererTurbo(this, 1, 178, textureX, textureY); // Box 32
		turretModel[9] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 33
		turretModel[10] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 15
		turretModel[11] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 16
		turretModel[12] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 17
		turretModel[13] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 18
		turretModel[14] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 299
		turretModel[15] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 299
		turretModel[16] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 24
		turretModel[17] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 27
		turretModel[18] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 28
		turretModel[19] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 29
		turretModel[20] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 30
		turretModel[21] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 31
		turretModel[22] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 32
		turretModel[23] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 33
		turretModel[24] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 34
		turretModel[25] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 36
		turretModel[26] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 37
		turretModel[27] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 38
		turretModel[28] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 47
		turretModel[29] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 48
		turretModel[30] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 49
		turretModel[31] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 50
		turretModel[32] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 51
		turretModel[33] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 0
		turretModel[34] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 1
		turretModel[35] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 2
		turretModel[36] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 3
		turretModel[37] = new ModelRendererTurbo(this, 40, 241, textureX, textureY); // Box 288
		turretModel[38] = new ModelRendererTurbo(this, 42, 249, textureX, textureY); // Box 289
		turretModel[39] = new ModelRendererTurbo(this, 0, 252, textureX, textureY); // Box 290
		turretModel[40] = new ModelRendererTurbo(this, 0, 252, textureX, textureY); // Box 291
		turretModel[41] = new ModelRendererTurbo(this, 26, 251, textureX, textureY); // Box 292
		turretModel[42] = new ModelRendererTurbo(this, 17, 263, textureX, textureY); // Box 293
		turretModel[43] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 294
		turretModel[44] = new ModelRendererTurbo(this, 24, 241, textureX, textureY); // Box 295
		turretModel[45] = new ModelRendererTurbo(this, 24, 241, textureX, textureY); // Box 296
		turretModel[46] = new ModelRendererTurbo(this, 0, 257, textureX, textureY); // Box 297
		turretModel[47] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Box 299
		turretModel[48] = new ModelRendererTurbo(this, 162, 193, textureX, textureY); // Box 0
		turretModel[49] = new ModelRendererTurbo(this, 162, 193, textureX, textureY); // Box 0

		turretModel[0].addShapeBox(-8F, 0F, -20F, 14, 3, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 24
		turretModel[0].setRotationPoint(0F, -25F, 0F);

		turretModel[1].addShapeBox(0F, 0F, -20F, 6, 11, 40, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[1].setRotationPoint(0F, -36F, 0F);

		turretModel[2].addShapeBox(-8F, 0F, -20F, 8, 11, 40, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[2].setRotationPoint(0F, -36F, 0F);

		turretModel[3].addShapeBox(6F, 0F, -20F, 6, 9, 40, 0F, 0F, 0F, -6F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 27
		turretModel[3].setRotationPoint(0F, -34F, 0F);

		turretModel[4].addShapeBox(-21F, 0F, -20F, 13, 11, 40, 0F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 28
		turretModel[4].setRotationPoint(0F, -36F, 0F);

		turretModel[5].addShapeBox(-26F, 1F, -14F, 5, 10, 28, 0F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 29
		turretModel[5].setRotationPoint(0F, -36F, 0F);

		turretModel[6].addShapeBox(-34.5F, 3F, -12F, 8, 7, 24, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 30
		turretModel[6].setRotationPoint(0F, -36F, 0F);

		turretModel[7].addShapeBox(6F, 0F, -20F, 9, 3, 40, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0.5F, -1F, -1F, 0.5F, -13F, -1F, 0.5F, -13F, 0F, 0.5F, -1F); // Box 31
		turretModel[7].setRotationPoint(0F, -25F, 0F);

		turretModel[8].addShapeBox(-21F, 0F, -20F, 13, 3, 40, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -1F, 0.5F, -13F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -1F, 0.5F, -13F); // Box 32
		turretModel[8].setRotationPoint(0F, -25F, 0F);

		turretModel[9].addShapeBox(12F, 0F, -15F, 3, 7, 30, 0F, 0F, 0F, -5F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 33
		turretModel[9].setRotationPoint(0F, -32F, 0F);

		turretModel[10].addShapeBox(-12F, 0F, -1F, 6, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[10].setRotationPoint(0F, -37F, 0F);

		turretModel[11].addShapeBox(-16F, 0F, -1F, 4, 6, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 16
		turretModel[11].setRotationPoint(0F, -37F, 0F);

		turretModel[12].addShapeBox(-6F, 0F, -1F, 4, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 17
		turretModel[12].setRotationPoint(0F, -37F, 0F);

		turretModel[13].addShapeBox(-32F, 0F, 10F, 1, 39, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 18
		turretModel[13].setRotationPoint(0F, -69F, 0F);
		turretModel[13].rotateAngleX = -0.05235988F;
		turretModel[13].rotateAngleZ = 0.10471976F;

		turretModel[14].addBox(5.5F, -7F, -20F, 1, 3, 1, 0F); // Box 299
		turretModel[14].setRotationPoint(0F, -36F, 0F);
		turretModel[14].rotateAngleY = -1.57079633F;

		turretModel[15].addShapeBox(5.5F, -4F, -20F, 1, 8, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2.5F, 0F, 6F, 2F, 0F, 6F, 2F, 0F, -6.5F, -2.5F, 0F, -6.5F); // Box 299
		turretModel[15].setRotationPoint(0F, -36F, 0F);
		turretModel[15].rotateAngleY = -1.57079633F;

		turretModel[16].addShapeBox(6F, -2F, 6F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		turretModel[16].setRotationPoint(0F, -33.5F, 0F);
		turretModel[16].rotateAngleX = 0.05235988F;
		turretModel[16].rotateAngleY = 0.13962634F;
		turretModel[16].rotateAngleZ = -0.20943951F;

		turretModel[17].addShapeBox(7.5F, -1.2F, 7F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		turretModel[17].setRotationPoint(0F, -33.5F, 0F);
		turretModel[17].rotateAngleX = 0.05235988F;
		turretModel[17].rotateAngleY = 0.13962634F;

		turretModel[18].addShapeBox(0F, -1F, 12F, 1, 2, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 28
		turretModel[18].setRotationPoint(0F, -36F, 0F);

		turretModel[19].addShapeBox(0F, -2F, 12F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[19].setRotationPoint(0F, -36F, 0F);

		turretModel[20].addShapeBox(2F, -5F, 10.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[20].setRotationPoint(0F, -36F, 0F);
		turretModel[20].rotateAngleY = 0.31415927F;
		turretModel[20].rotateAngleZ = -0.33161256F;

		turretModel[21].addShapeBox(2F, -4F, 10.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 31
		turretModel[21].setRotationPoint(0F, -36F, 0F);
		turretModel[21].rotateAngleY = 0.31415927F;
		turretModel[21].rotateAngleZ = -0.33161256F;

		turretModel[22].addShapeBox(2F, -6F, 10.5F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[22].setRotationPoint(0F, -36F, 0F);
		turretModel[22].rotateAngleY = 0.31415927F;
		turretModel[22].rotateAngleZ = -0.33161256F;

		turretModel[23].addShapeBox(-8F, -0.5F, -14F, 7, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[23].setRotationPoint(0F, -36F, 0.5F);

		turretModel[24].addShapeBox(-13F, -0.5F, -14F, 5, 1, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[24].setRotationPoint(0F, -36F, 0.5F);

		turretModel[25].addShapeBox(5.5F, -4F, -20F, 1, 1, 1, 0F, 0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 36
		turretModel[25].setRotationPoint(0F, -36F, 0F);
		turretModel[25].rotateAngleY = -1.57079633F;

		turretModel[26].addShapeBox(5.5F, -4F, -20F, 1, 8, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 6F, -2.5F, 0F, 6F, -2.5F, 0F, -6.5F, 2F, 0F, -6.5F); // Box 37
		turretModel[26].setRotationPoint(0F, -36F, 0F);
		turretModel[26].rotateAngleY = -1.57079633F;

		turretModel[27].addShapeBox(5.25F, -4F, -20F, 1, 8, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 6F, -0.5F, 0F, 6F); // Box 38
		turretModel[27].setRotationPoint(0F, -36F, 0F);
		turretModel[27].rotateAngleY = -1.57079633F;

		turretModel[28].addShapeBox(-1F, 0F, -13.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		turretModel[28].setRotationPoint(0F, -36.5F, 0.5F);

		turretModel[29].addShapeBox(-1F, 0F, -6.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		turretModel[29].setRotationPoint(0F, -36.5F, 0.5F);

		turretModel[30].addShapeBox(-1F, 0F, -10F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[30].setRotationPoint(0F, -36.5F, 0.5F);

		turretModel[31].addShapeBox(-9F, -0.5F, -13F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		turretModel[31].setRotationPoint(0F, -36.5F, 0.5F);

		turretModel[32].addShapeBox(-9F, -0.5F, -6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		turretModel[32].setRotationPoint(0F, -36.5F, 0.5F);

		turretModel[33].addShapeBox(-27F, 4.8F, -9F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[33].setRotationPoint(0F, -36.5F, 0F);

		turretModel[34].addShapeBox(-27F, 8.8F, -9F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[34].setRotationPoint(0F, -36.5F, 0F);

		turretModel[35].addShapeBox(-27F, 8.8F, 8F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		turretModel[35].setRotationPoint(0F, -36.5F, 0F);

		turretModel[36].addShapeBox(-27F, 4.8F, 8F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[36].setRotationPoint(0F, -36.5F, 0F);

		turretModel[37].addShapeBox(-28.5F, -10F, -7F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		turretModel[37].setRotationPoint(0F, -35F, 0F);

		turretModel[38].addShapeBox(-32.5F, -10F, -7F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 289
		turretModel[38].setRotationPoint(0F, -35F, 0F);

		turretModel[39].addShapeBox(-34.5F, -10.5F, -8F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		turretModel[39].setRotationPoint(0F, -35F, 0F);

		turretModel[40].addShapeBox(-34.5F, -10.5F, -5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		turretModel[40].setRotationPoint(0F, -35F, 0F);

		turretModel[41].addShapeBox(-19.5F, -9.5F, -6.5F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 292
		turretModel[41].setRotationPoint(0F, -35F, 0F);

		turretModel[42].addShapeBox(-14.5F, -9.5F, -6.5F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 293
		turretModel[42].setRotationPoint(0F, -35F, 0F);

		turretModel[43].addShapeBox(-25.5F, -9.8F, -8.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		turretModel[43].setRotationPoint(0F, -35F, 0F);

		turretModel[44].addShapeBox(-33.5F, -10F, -7F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		turretModel[44].setRotationPoint(0F, -35F, 0F);

		turretModel[45].addShapeBox(-33.5F, -10F, -5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		turretModel[45].setRotationPoint(0F, -35F, 0F);

		turretModel[46].addShapeBox(-25.5F, -9.5F, -5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		turretModel[46].setRotationPoint(0F, -35F, 0F);

		turretModel[47].addShapeBox(-16.5F, -8.8F, -7.5F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[47].setRotationPoint(0F, -35F, 0F);

		turretModel[48].addShapeBox(-8F, 9F, 12.5F, 41, 41, 1, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 0
		turretModel[48].setRotationPoint(1F, -36F, 0F);
		turretModel[48].rotateAngleX = 0.45378561F;

		turretModel[49].addShapeBox(-8F, 9F, -13.5F, 41, 41, 1, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 0
		turretModel[49].setRotationPoint(1F, -36F, 0F);
		turretModel[49].rotateAngleX = -0.45378561F;


		barrelModel = new ModelRendererTurbo[12];
		barrelModel[0] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 34
		barrelModel[1] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 35
		barrelModel[2] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 36
		barrelModel[3] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 194
		barrelModel[4] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 205
		barrelModel[5] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 225
		barrelModel[6] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 226
		barrelModel[7] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 227
		barrelModel[8] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 228
		barrelModel[9] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 17
		barrelModel[10] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 0
		barrelModel[11] = new ModelRendererTurbo(this, 881, 15, textureX, textureY); // Box 0

		barrelModel[0].addShapeBox(0F, -4F, -9F, 8, 5, 18, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 34
		barrelModel[0].setRotationPoint(10F, -27F, 0F);

		barrelModel[1].addShapeBox(0F, -4F, -9F, 8, 3, 18, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F); // Box 35
		barrelModel[1].setRotationPoint(10F, -22F, 0F);

		barrelModel[2].addShapeBox(-1F, -4F, -9F, 6, 2, 18, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 36
		barrelModel[2].setRotationPoint(10F, -29F, 0F);

		barrelModel[3].addShapeBox(13F, -4F, -1F, 29, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 194
		barrelModel[3].setRotationPoint(10F, -23.5F, 0F);

		barrelModel[4].addShapeBox(6F, -4F, -2.5F, 7, 5, 5, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 205
		barrelModel[4].setRotationPoint(10F, -25F, 0F);

		barrelModel[5].addShapeBox(5.25F, -1F, 3F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		barrelModel[5].setRotationPoint(10F, -27F, 0F);

		barrelModel[6].addShapeBox(5.25F, -2F, 3F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		barrelModel[6].setRotationPoint(10F, -27F, 0F);

		barrelModel[7].addShapeBox(5.25F, -2F, 5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		barrelModel[7].setRotationPoint(10F, -27F, 0F);

		barrelModel[8].addShapeBox(7F, -4F, -6F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 228
		barrelModel[8].setRotationPoint(10F, -24F, 0F);

		barrelModel[9].addShapeBox(40F, -4F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		barrelModel[9].setRotationPoint(10F, -23.5F, 0F);

		barrelModel[10].addShapeBox(6F, -4F, -6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[10].setRotationPoint(10F, -24F, 0F);

		barrelModel[11].addShapeBox(5.25F, -3F, 3F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[11].setRotationPoint(10F, -27F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[10];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 165
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 1
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 2
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 3
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 4
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 9
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Shape 535
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Shape 11
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Shape 12
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 33

		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 165
		leftTrackWheelModels[0].setRotationPoint(10.5F, 2.5F, 20.5F);

		leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 1
		leftTrackWheelModels[1].setRotationPoint(-3F, 2.5F, 20.5F);

		leftTrackWheelModels[2].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 2
		leftTrackWheelModels[2].setRotationPoint(24F, 2.5F, 20.5F);

		leftTrackWheelModels[3].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 3
		leftTrackWheelModels[3].setRotationPoint(-16.5F, 2.5F, 20.5F);

		leftTrackWheelModels[4].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 4
		leftTrackWheelModels[4].setRotationPoint(-30F, 2.5F, 20.5F);

		leftTrackWheelModels[5].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 9
		leftTrackWheelModels[5].setRotationPoint(36F, -4.35F, 20.5F);

		leftTrackWheelModels[6].addShape3D(3F, -3F, -26F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 535
		leftTrackWheelModels[6].setRotationPoint(17F, -7.5F, 0F);

		leftTrackWheelModels[7].addShape3D(3F, -3F, -26F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 11
		leftTrackWheelModels[7].setRotationPoint(3F, -7.5F, 0F);

		leftTrackWheelModels[8].addShape3D(3F, -3F, -26F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 12
		leftTrackWheelModels[8].setRotationPoint(-23F, -7.2F, 0F);

		leftTrackWheelModels[9].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 33
		leftTrackWheelModels[9].setRotationPoint(-42F, -4.25F, 20.5F);


		rightTrackWheelModels = new ModelRendererTurbo[10];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 24
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 25
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 26
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 27
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 28
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 29
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Shape 30
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Shape 31
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Shape 32
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Shape 1

		rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 24
		rightTrackWheelModels[0].setRotationPoint(10.5F, 2.5F, -21.5F);

		rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 25
		rightTrackWheelModels[1].setRotationPoint(-3F, 2.5F, -21.5F);

		rightTrackWheelModels[2].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 26
		rightTrackWheelModels[2].setRotationPoint(24F, 2.5F, -21.5F);

		rightTrackWheelModels[3].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 27
		rightTrackWheelModels[3].setRotationPoint(-16.5F, 2.5F, -21.5F);

		rightTrackWheelModels[4].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 28
		rightTrackWheelModels[4].setRotationPoint(-30F, 2.5F, -21.5F);

		rightTrackWheelModels[5].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 29
		rightTrackWheelModels[5].setRotationPoint(36F, -4.35F, -21.5F);

		rightTrackWheelModels[6].addShape3D(3F, -3F, -20F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 30
		rightTrackWheelModels[6].setRotationPoint(17F, -7.5F, -43F);

		rightTrackWheelModels[7].addShape3D(3F, -3F, -20F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 31
		rightTrackWheelModels[7].setRotationPoint(3F, -7.5F, -43F);

		rightTrackWheelModels[8].addShape3D(3F, -3F, -20F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 32
		rightTrackWheelModels[8].setRotationPoint(-23F, -7.2F, -43F);

		rightTrackWheelModels[9].addShape3D(6.5F, -6.5F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 1
		rightTrackWheelModels[9].setRotationPoint(-42F, -4.25F, -27.5F);


		leftTrackModel = new ModelRendererTurbo[11];
		leftTrackModel[0] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 67
		leftTrackModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 69
		leftTrackModel[2] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 70
		leftTrackModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 72
		leftTrackModel[4] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 73
		leftTrackModel[5] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Box 74
		leftTrackModel[6] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 75
		leftTrackModel[7] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 6
		leftTrackModel[8] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 7
		leftTrackModel[9] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 8
		leftTrackModel[10] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 0

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 59, 1, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftTrackModel[0].setRotationPoint(-33F, 9F, 21F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 69
		leftTrackModel[1].setRotationPoint(-49.5F, -13F, 21F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftTrackModel[2].setRotationPoint(-49.8F, -7.5F, 21F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 72
		leftTrackModel[3].setRotationPoint(35.5F, -13F, 21F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftTrackModel[4].setRotationPoint(42.5F, -7F, 21F);

		leftTrackModel[5].addShapeBox(0F, -1F, 0F, 14, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftTrackModel[5].setRotationPoint(26.5F, 10F, 21F);
		leftTrackModel[5].rotateAngleZ = 0.52359878F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 54, 4, 1, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		leftTrackModel[6].setRotationPoint(-30F, -11F, 24F);

		leftTrackModel[7].addShapeBox(0F, -1F, 0F, 7, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[7].setRotationPoint(38.6F, 3F, 21F);
		leftTrackModel[7].rotateAngleZ = 0.78539816F;

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftTrackModel[8].setRotationPoint(-33F, 10F, 21F);
		leftTrackModel[8].rotateAngleZ = 2.63544717F;

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftTrackModel[9].setRotationPoint(-45.6F, 3F, 21F);
		leftTrackModel[9].rotateAngleZ = 2.32128791F;

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 78, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftTrackModel[10].setRotationPoint(-42F, -13F, 21F);


		rightTrackModel = new ModelRendererTurbo[11];
		rightTrackModel[0] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Box 172
		rightTrackModel[1] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Box 13
		rightTrackModel[2] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 14
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 15
		rightTrackModel[4] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 16
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		rightTrackModel[6] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 18
		rightTrackModel[7] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 19
		rightTrackModel[8] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 21
		rightTrackModel[9] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 22
		rightTrackModel[10] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 23

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 54, 4, 1, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		rightTrackModel[0].setRotationPoint(-30F, -11F, -25F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 59, 1, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[1].setRotationPoint(-33F, 9F, -28F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 78, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[2].setRotationPoint(-42F, -13F, -28F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[3].setRotationPoint(-49.5F, -13F, -28F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightTrackModel[4].setRotationPoint(-49.8F, -7.5F, -28F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 17
		rightTrackModel[5].setRotationPoint(35.5F, -13F, -28F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightTrackModel[6].setRotationPoint(42.5F, -7F, -28F);

		rightTrackModel[7].addShapeBox(0F, -1F, 0F, 14, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightTrackModel[7].setRotationPoint(26.5F, 10F, -28F);
		rightTrackModel[7].rotateAngleZ = 0.52359878F;

		rightTrackModel[8].addShapeBox(0F, -1F, 0F, 7, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		rightTrackModel[8].setRotationPoint(38.6F, 3F, -28F);
		rightTrackModel[8].rotateAngleZ = 0.78539816F;

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 22
		rightTrackModel[9].setRotationPoint(-33F, 10F, -28F);
		rightTrackModel[9].rotateAngleZ = 2.63544717F;

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightTrackModel[10].setRotationPoint(-45.6F, 3F, -28F);
		rightTrackModel[10].rotateAngleZ = 2.32128791F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
