//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLuchs extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLuchs() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[193];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Box 106
		bodyModel[16] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Box 107
		bodyModel[17] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Box 108
		bodyModel[18] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Box 109
		bodyModel[19] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 114
		bodyModel[20] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 115
		bodyModel[21] = new ModelRendererTurbo(this, 245, 394, textureX, textureY); // Box 116
		bodyModel[22] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 117
		bodyModel[23] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 118
		bodyModel[24] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 119
		bodyModel[25] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 121
		bodyModel[26] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 122
		bodyModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 123
		bodyModel[28] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 124
		bodyModel[29] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 125
		bodyModel[30] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 126
		bodyModel[31] = new ModelRendererTurbo(this, 289, 240, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 120, 440, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 121, 440, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 258, 390, textureX, textureY); // Box 5
		bodyModel[35] = new ModelRendererTurbo(this, 258, 390, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 258, 390, textureX, textureY); // Box 7
		bodyModel[37] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 12
		bodyModel[38] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 13
		bodyModel[39] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 15
		bodyModel[40] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 18
		bodyModel[41] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 35
		bodyModel[42] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 37
		bodyModel[43] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 39
		bodyModel[44] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 40
		bodyModel[45] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 240, 385, textureX, textureY); // Box 1
		bodyModel[47] = new ModelRendererTurbo(this, 240, 385, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 240, 385, textureX, textureY); // Box 1
		bodyModel[49] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 289, 240, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 1
		bodyModel[52] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 5
		bodyModel[54] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 7
		bodyModel[55] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 13
		bodyModel[56] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 14
		bodyModel[57] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 15
		bodyModel[58] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 16
		bodyModel[59] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 17
		bodyModel[60] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 18
		bodyModel[61] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 19
		bodyModel[62] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 28
		bodyModel[63] = new ModelRendererTurbo(this, 101, 427, textureX, textureY); // Box 29
		bodyModel[64] = new ModelRendererTurbo(this, 102, 383, textureX, textureY); // Box 30
		bodyModel[65] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 31
		bodyModel[66] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 36
		bodyModel[67] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 37
		bodyModel[68] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 42
		bodyModel[69] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 43
		bodyModel[70] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 50
		bodyModel[71] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 51
		bodyModel[72] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 54
		bodyModel[73] = new ModelRendererTurbo(this, 25, 240, textureX, textureY); // Box 56
		bodyModel[74] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Box 1
		bodyModel[76] = new ModelRendererTurbo(this, 401, 400, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 21
		bodyModel[78] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 22
		bodyModel[79] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 35
		bodyModel[80] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 36
		bodyModel[81] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 37
		bodyModel[82] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 38
		bodyModel[83] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 39
		bodyModel[84] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 40
		bodyModel[85] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 41
		bodyModel[86] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 42
		bodyModel[87] = new ModelRendererTurbo(this, 125, 440, textureX, textureY); // Box 10
		bodyModel[88] = new ModelRendererTurbo(this, 125, 440, textureX, textureY); // Box 11
		bodyModel[89] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 14
		bodyModel[90] = new ModelRendererTurbo(this, 300, 202, textureX, textureY); // Box 15
		bodyModel[91] = new ModelRendererTurbo(this, 300, 202, textureX, textureY); // Box 4
		bodyModel[92] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 6
		bodyModel[93] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 7
		bodyModel[94] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 28
		bodyModel[95] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 29
		bodyModel[96] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 34
		bodyModel[97] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 36
		bodyModel[98] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 37
		bodyModel[99] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 38
		bodyModel[100] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 39
		bodyModel[101] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 40
		bodyModel[102] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 41
		bodyModel[103] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 42
		bodyModel[104] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 43
		bodyModel[105] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 48
		bodyModel[106] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 49
		bodyModel[107] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 64
		bodyModel[108] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 65
		bodyModel[109] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 68
		bodyModel[110] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 69
		bodyModel[111] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 88
		bodyModel[112] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 89
		bodyModel[113] = new ModelRendererTurbo(this, 0, 195, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 5
		bodyModel[115] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 6
		bodyModel[116] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 7
		bodyModel[117] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 8
		bodyModel[118] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 9
		bodyModel[119] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 12
		bodyModel[120] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 1
		bodyModel[122] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 2
		bodyModel[123] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 3
		bodyModel[124] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 4
		bodyModel[125] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 5
		bodyModel[126] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 6
		bodyModel[127] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 7
		bodyModel[128] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 8
		bodyModel[129] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 9
		bodyModel[130] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 1
		bodyModel[132] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 2
		bodyModel[133] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 3
		bodyModel[134] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 4
		bodyModel[135] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 5
		bodyModel[136] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 6
		bodyModel[137] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 7
		bodyModel[138] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 8
		bodyModel[139] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 9
		bodyModel[140] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 10
		bodyModel[141] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 11
		bodyModel[142] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 12
		bodyModel[143] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 13
		bodyModel[144] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		bodyModel[146] = new ModelRendererTurbo(this, 125, 440, textureX, textureY); // Box 2
		bodyModel[147] = new ModelRendererTurbo(this, 125, 440, textureX, textureY); // Box 3
		bodyModel[148] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 10
		bodyModel[149] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 3
		bodyModel[152] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 4
		bodyModel[153] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 5
		bodyModel[154] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 6
		bodyModel[155] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 7
		bodyModel[156] = new ModelRendererTurbo(this, 101, 427, textureX, textureY); // Box 8
		bodyModel[157] = new ModelRendererTurbo(this, 102, 383, textureX, textureY); // Box 9
		bodyModel[158] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 10
		bodyModel[159] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 1
		bodyModel[161] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 3
		bodyModel[163] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 4
		bodyModel[164] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 5
		bodyModel[165] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 6
		bodyModel[166] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 7
		bodyModel[167] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 8
		bodyModel[168] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 9
		bodyModel[169] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 10
		bodyModel[170] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 11
		bodyModel[171] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 12
		bodyModel[172] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 13
		bodyModel[173] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 14
		bodyModel[174] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 15
		bodyModel[175] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 16
		bodyModel[176] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 17
		bodyModel[177] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 18
		bodyModel[178] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 19
		bodyModel[179] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 20
		bodyModel[180] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 21
		bodyModel[181] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 22
		bodyModel[182] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 23
		bodyModel[183] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 24
		bodyModel[184] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 25
		bodyModel[185] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 26
		bodyModel[186] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 27
		bodyModel[187] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 28
		bodyModel[188] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 29
		bodyModel[189] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 30
		bodyModel[190] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 31
		bodyModel[191] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 32
		bodyModel[192] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 33

		bodyModel[0].addShapeBox(0F, 0F, 0F, 80, 12, 29, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -9F, -14.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 14, 4, 30, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(28F, -14F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 68, 4, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-40F, -14F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 26, 6, 34, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-1F, -20F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 6, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-23F, -20F, -17F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 4, 30, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-29F, -18F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 3, 30, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-41F, -17F, -15F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 18
		bodyModel[7].setRotationPoint(24F, -18F, -11.5F);
		bodyModel[7].rotateAngleZ = 0.13962634F;

		bodyModel[8].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 19
		bodyModel[8].setRotationPoint(24F, -18F, 3.5F);
		bodyModel[8].rotateAngleZ = 0.13962634F;

		bodyModel[9].addBox(0F, 0F, 0F, 62, 1, 9, 0F); // Box 20
		bodyModel[9].setRotationPoint(-30F, -14F, -24F);

		bodyModel[10].addBox(0F, 0F, 0F, 62, 1, 9, 0F); // Box 21
		bodyModel[10].setRotationPoint(-30F, -14F, 15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(32F, -14F, -24F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(32F, -14F, 15F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[13].setRotationPoint(41F, -12F, 15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(-39F, -9F, -24F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 2, 40, 0F); // Box 106
		bodyModel[15].setRotationPoint(13F, 1.5F, -20F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 2, 40, 0F); // Box 107
		bodyModel[16].setRotationPoint(-8F, 1.5F, -20F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 42, 0F); // Box 108
		bodyModel[17].setRotationPoint(-29.5F, -0.5F, -21F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 42, 0F); // Box 109
		bodyModel[18].setRotationPoint(33F, -3F, -21F);

		bodyModel[19].addBox(-1F, 0F, 0F, 3, 6, 10, 0F); // Box 114
		bodyModel[19].setRotationPoint(-42F, -16F, 3F);
		bodyModel[19].rotateAngleZ = 0.36651914F;

		bodyModel[20].addShapeBox(-2F, 0F, 0F, 1, 6, 10, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 115
		bodyModel[20].setRotationPoint(-42F, -16F, 3F);
		bodyModel[20].rotateAngleZ = 0.36651914F;

		bodyModel[21].addBox(-1F, 1F, 10F, 2, 2, 1, 0F); // Box 116
		bodyModel[21].setRotationPoint(-42F, -16F, 3F);
		bodyModel[21].rotateAngleZ = 0.2268928F;

		bodyModel[22].addBox(-1F, 1F, 0F, 4, 6, 4, 0F); // Box 117
		bodyModel[22].setRotationPoint(-43.5F, -16.5F, -13F);
		bodyModel[22].rotateAngleY = 0.05235988F;
		bodyModel[22].rotateAngleZ = 0.36651914F;

		bodyModel[23].addBox(-1F, 1F, 5F, 4, 6, 4, 0F); // Box 118
		bodyModel[23].setRotationPoint(-43F, -16.5F, -13F);
		bodyModel[23].rotateAngleZ = 0.27925268F;

		bodyModel[24].addBox(-1F, 1F, 0F, 5, 4, 10, 0F); // Box 119
		bodyModel[24].setRotationPoint(-43F, -14F, -13.5F);
		bodyModel[24].rotateAngleZ = 0.34906585F;

		bodyModel[25].addBox(0F, 0F, 0F, 26, 4, 6, 0F); // Box 121
		bodyModel[25].setRotationPoint(-25.5F, -18F, -23.5F);
		bodyModel[25].rotateAngleY = -0.03490659F;

		bodyModel[26].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 122
		bodyModel[26].setRotationPoint(17F, -18F, 14.8F);
		bodyModel[26].rotateAngleY = -0.08726646F;

		bodyModel[27].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 123
		bodyModel[27].setRotationPoint(19F, -18F, -16F);
		bodyModel[27].rotateAngleY = 0.08726646F;

		bodyModel[28].addBox(0F, 0F, 0F, 12, 6, 7, 0F); // Box 124
		bodyModel[28].setRotationPoint(-26F, -20F, 10.1F);

		bodyModel[29].addBox(0F, 0F, 0F, 12, 5, 6, 0F); // Box 125
		bodyModel[29].setRotationPoint(-26F, -19F, 17.5F);
		bodyModel[29].rotateAngleY = -0.01745329F;

		bodyModel[30].addBox(0F, 0F, 0F, 12, 5, 6, 0F); // Box 126
		bodyModel[30].setRotationPoint(-13F, -19F, 17.5F);
		bodyModel[30].rotateAngleY = 0.03490659F;

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 26, 0F); // Box 0
		bodyModel[31].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[31].rotateAngleZ = 0.06981317F;

		bodyModel[32].addBox(0F, 0F, -4F, 2, 2, 4, 0F); // Box 2
		bodyModel[32].setRotationPoint(-41F, -13F, 3F);
		bodyModel[32].rotateAngleZ = 0.36651914F;

		bodyModel[33].addBox(0F, 2F, -4F, 2, 4, 2, 0F); // Box 4
		bodyModel[33].setRotationPoint(-41F, -13F, 3F);
		bodyModel[33].rotateAngleZ = 0.36651914F;

		bodyModel[34].addShapeBox(-0.5F, 6F, -4F, 3, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[34].setRotationPoint(-41F, -13F, 3F);
		bodyModel[34].rotateAngleZ = 0.36651914F;

		bodyModel[35].addShapeBox(-0.5F, 6F, -2F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 6
		bodyModel[35].setRotationPoint(-41F, -13F, 3F);
		bodyModel[35].rotateAngleZ = 0.36651914F;

		bodyModel[36].addShapeBox(-0.5F, 6F, -5F, 3, 4, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[36].setRotationPoint(-41F, -13F, 3F);
		bodyModel[36].rotateAngleZ = 0.36651914F;

		bodyModel[37].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 12
		bodyModel[37].setRotationPoint(23.5F, -18F, -2.5F);
		bodyModel[37].rotateAngleZ = 0.13962634F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F); // Box 13
		bodyModel[38].setRotationPoint(27F, -16F, -2F);
		bodyModel[38].rotateAngleZ = -0.13962634F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[39].setRotationPoint(16F, -20.5F, 4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 18
		bodyModel[40].setRotationPoint(31F, -15F, -15F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[41].setRotationPoint(16F, -20.7F, 4F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[42].setRotationPoint(21F, -20.7F, 7F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 39
		bodyModel[43].setRotationPoint(23.5F, -17.85F, 3.5F);
		bodyModel[43].rotateAngleZ = 0.29670597F;

		bodyModel[44].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 40
		bodyModel[44].setRotationPoint(23.5F, -17.85F, -11.5F);
		bodyModel[44].rotateAngleZ = 0.29670597F;

		bodyModel[45].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 0
		bodyModel[45].setRotationPoint(17F, -18F, 15F);
		bodyModel[45].rotateAngleX = 0.87266463F;
		bodyModel[45].rotateAngleY = -0.08726646F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 1
		bodyModel[46].setRotationPoint(7F, -19F, -21F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F); // Box 0
		bodyModel[47].setRotationPoint(8.2F, -19F, -21F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F); // Box 1
		bodyModel[48].setRotationPoint(5.8F, -19F, -21F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 0
		bodyModel[49].setRotationPoint(7F, -41F, -20F);

		bodyModel[50].addBox(8F, 0F, 0F, 1, 1, 26, 0F); // Box 0
		bodyModel[50].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[50].rotateAngleZ = 0.06981317F;

		bodyModel[51].addBox(1F, 0F, 0F, 7, 1, 1, 0F); // Box 1
		bodyModel[51].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[51].rotateAngleZ = 0.06981317F;

		bodyModel[52].addBox(1F, 0F, 0F, 7, 1, 1, 0F); // Box 2
		bodyModel[52].setRotationPoint(-40F, -17.3F, 12F);
		bodyModel[52].rotateAngleZ = 0.06981317F;

		bodyModel[53].addShapeBox(7F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 5
		bodyModel[53].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[53].rotateAngleZ = 0.06981317F;

		bodyModel[54].addShapeBox(8F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[54].setRotationPoint(42F, -12F, 7F);
		bodyModel[54].rotateAngleZ = -1.9623592F;

		bodyModel[55].addShapeBox(3.5F, -2F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[55].setRotationPoint(42F, -12F, 0F);
		bodyModel[55].rotateAngleZ = -1.9623592F;

		bodyModel[56].addShapeBox(3.5F, -2F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[56].setRotationPoint(42F, -12F, -2F);
		bodyModel[56].rotateAngleZ = -1.9623592F;

		bodyModel[57].addShapeBox(8F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[57].setRotationPoint(42F, -12F, -2F);
		bodyModel[57].rotateAngleZ = -1.9623592F;

		bodyModel[58].addShapeBox(8F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[58].setRotationPoint(42F, -12F, 1F);
		bodyModel[58].rotateAngleZ = -1.9623592F;

		bodyModel[59].addShapeBox(8F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[59].setRotationPoint(42F, -12F, 4F);
		bodyModel[59].rotateAngleZ = -1.9623592F;

		bodyModel[60].addShapeBox(9F, -1.5F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[60].setRotationPoint(42F, -12F, -3F);
		bodyModel[60].rotateAngleZ = -1.9623592F;

		bodyModel[61].addShapeBox(4F, -1.5F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[61].setRotationPoint(42F, -12F, -3F);
		bodyModel[61].rotateAngleZ = -1.9623592F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[62].setRotationPoint(28F, -18.5F, 17.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[63].setRotationPoint(29F, -16.5F, 19F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.3F, 0.5F); // Box 30
		bodyModel[64].setRotationPoint(29F, -14.5F, 19F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 31
		bodyModel[65].setRotationPoint(28F, -17.5F, 17.5F);

		bodyModel[66].addShapeBox(8F, -3F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[66].setRotationPoint(42F, -12F, 4F);
		bodyModel[66].rotateAngleZ = -1.9623592F;

		bodyModel[67].addShapeBox(8F, -3F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[67].setRotationPoint(42F, -12F, 7F);
		bodyModel[67].rotateAngleZ = -1.9623592F;

		bodyModel[68].addShapeBox(8F, -3F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[68].setRotationPoint(42F, -12F, 4F);
		bodyModel[68].rotateAngleZ = -1.9623592F;

		bodyModel[69].addShapeBox(8F, -3F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[69].setRotationPoint(42F, -12F, 7F);
		bodyModel[69].rotateAngleZ = -1.9623592F;

		bodyModel[70].addShapeBox(-3.5F, -2.1F, -4F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 50
		bodyModel[70].setRotationPoint(36F, -11F, 7F);
		bodyModel[70].rotateAngleZ = -0.19957665F;

		bodyModel[71].addShapeBox(-3.5F, -2.1F, -4F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[71].setRotationPoint(36F, -11F, 5F);
		bodyModel[71].rotateAngleZ = -0.19957665F;

		bodyModel[72].addShapeBox(1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[72].setRotationPoint(36F, -11F, 5F);
		bodyModel[72].rotateAngleZ = -0.19957665F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 80, 1, 29, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[73].setRotationPoint(-38F, -10F, -14.5F);

		bodyModel[74].addBox(-1F, -1F, 0F, 2, 2, 42, 0F); // Box 0
		bodyModel[74].setRotationPoint(23F, 2.5F, -21F);

		bodyModel[75].addBox(-1F, -1F, 0F, 2, 2, 42, 0F); // Box 1
		bodyModel[75].setRotationPoint(-17F, 2.5F, -21F);

		bodyModel[76].addBox(-1F, -1F, 0F, 2, 2, 42, 0F); // Box 2
		bodyModel[76].setRotationPoint(4F, 2.5F, -21F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 16, 2, 0F); // Box 21
		bodyModel[77].setRotationPoint(19F, -13F, -15.6F);
		bodyModel[77].rotateAngleZ = 0.19198622F;

		bodyModel[78].addBox(-3F, 0F, 0F, 3, 16, 2, 0F); // Box 22
		bodyModel[78].setRotationPoint(-12.5F, -13F, -15.6F);
		bodyModel[78].rotateAngleZ = -0.19198622F;

		bodyModel[79].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 35
		bodyModel[79].setRotationPoint(7.5F, -39F, -19.5F);

		bodyModel[80].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 36
		bodyModel[80].setRotationPoint(7.5F, -39F, -19.5F);
		bodyModel[80].rotateAngleY = -1.57079633F;

		bodyModel[81].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 37
		bodyModel[81].setRotationPoint(7.5F, -39F, -19.5F);
		bodyModel[81].rotateAngleY = -3.14159265F;

		bodyModel[82].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 38
		bodyModel[82].setRotationPoint(7.5F, -39F, -19.5F);
		bodyModel[82].rotateAngleY = -4.71238898F;

		bodyModel[83].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 39
		bodyModel[83].setRotationPoint(7.5F, -39F, -19.5F);
		bodyModel[83].rotateAngleY = -4.01425728F;

		bodyModel[84].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 40
		bodyModel[84].setRotationPoint(7.5F, -39F, -19.5F);
		bodyModel[84].rotateAngleY = -5.58505361F;

		bodyModel[85].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 41
		bodyModel[85].setRotationPoint(7.5F, -39F, -19.5F);
		bodyModel[85].rotateAngleY = -0.87266463F;

		bodyModel[86].addShapeBox(-0.5F, -5F, -0.5F, 1, 3, 1, 0F, -4.2F, 0F, -0.2F, 3.8F, 0F, -0.2F, 3.8F, 0F, -0.2F, -4.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 42
		bodyModel[86].setRotationPoint(7.5F, -39F, -19.5F);
		bodyModel[86].rotateAngleY = -2.44346095F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 10
		bodyModel[87].setRotationPoint(41F, -10.5F, -15F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 11
		bodyModel[88].setRotationPoint(41F, -7.5F, -15F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 14
		bodyModel[89].setRotationPoint(24F, -18F, -2.5F);
		bodyModel[89].rotateAngleZ = 0.66322512F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[90].setRotationPoint(-26F, -21F, 10.1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[91].setRotationPoint(-26F, -21F, -17.1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[92].setRotationPoint(24.5F, -14.5F, -14.9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 7
		bodyModel[93].setRotationPoint(24.5F, -14.5F, -23.9F);

		bodyModel[94].addShapeBox(-3.5F, -2.1F, -7F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[94].setRotationPoint(36F, -11F, 5F);
		bodyModel[94].rotateAngleZ = -0.19957665F;

		bodyModel[95].addShapeBox(-3.5F, -2.1F, -7F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[95].setRotationPoint(36F, -11F, 7F);
		bodyModel[95].rotateAngleZ = -0.19957665F;

		bodyModel[96].addShapeBox(-1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[96].setRotationPoint(36F, -11F, 5F);
		bodyModel[96].rotateAngleZ = -0.19957665F;

		bodyModel[97].addShapeBox(6F, -3F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[97].setRotationPoint(42F, -12F, 7F);
		bodyModel[97].rotateAngleZ = -1.9623592F;

		bodyModel[98].addShapeBox(6F, -3F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[98].setRotationPoint(42F, -12F, 4F);
		bodyModel[98].rotateAngleZ = -1.9623592F;

		bodyModel[99].addShapeBox(6F, -3F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[99].setRotationPoint(42F, -12F, 7F);
		bodyModel[99].rotateAngleZ = -1.9623592F;

		bodyModel[100].addShapeBox(6F, -3F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[100].setRotationPoint(42F, -12F, 4F);
		bodyModel[100].rotateAngleZ = -1.9623592F;

		bodyModel[101].addShapeBox(6F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[101].setRotationPoint(42F, -12F, 7F);
		bodyModel[101].rotateAngleZ = -1.9623592F;

		bodyModel[102].addShapeBox(6F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[102].setRotationPoint(42F, -12F, 4F);
		bodyModel[102].rotateAngleZ = -1.9623592F;

		bodyModel[103].addShapeBox(6F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[103].setRotationPoint(42F, -12F, 1F);
		bodyModel[103].rotateAngleZ = -1.9623592F;

		bodyModel[104].addShapeBox(6F, -3F, -9.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[104].setRotationPoint(42F, -12F, -2F);
		bodyModel[104].rotateAngleZ = -1.9623592F;

		bodyModel[105].addShapeBox(1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[105].setRotationPoint(36F, -11.9F, 13F);
		bodyModel[105].rotateAngleZ = -0.19957665F;

		bodyModel[106].addShapeBox(-1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[106].setRotationPoint(36F, -11.9F, 13F);
		bodyModel[106].rotateAngleZ = -0.19957665F;

		bodyModel[107].addShapeBox(1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[107].setRotationPoint(36F, -11.9F, -26F);
		bodyModel[107].rotateAngleZ = -0.19957665F;

		bodyModel[108].addShapeBox(-1F, -3.1F, 2.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[108].setRotationPoint(36F, -11.9F, -26F);
		bodyModel[108].rotateAngleZ = -0.19957665F;

		bodyModel[109].addBox(0F, 0F, 0F, 3, 16, 2, 0F); // Box 68
		bodyModel[109].setRotationPoint(19F, -13F, 13.6F);
		bodyModel[109].rotateAngleZ = 0.19198622F;

		bodyModel[110].addBox(-3F, 0F, 0F, 3, 16, 2, 0F); // Box 69
		bodyModel[110].setRotationPoint(-12.5F, -13F, 13.6F);
		bodyModel[110].rotateAngleZ = -0.19198622F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[111].setRotationPoint(-19F, -20.5F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[112].setRotationPoint(-24F, -20.5F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 35, 1, 35, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, -25F, 0F, 0F, -25F); // Box 0
		bodyModel[113].setRotationPoint(28F, -14.2F, -13F);
		bodyModel[113].rotateAngleZ = -0.20943951F;

		bodyModel[114].addShapeBox(6F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 5
		bodyModel[114].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[114].rotateAngleZ = 0.06981317F;

		bodyModel[115].addShapeBox(5F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 6
		bodyModel[115].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[115].rotateAngleZ = 0.06981317F;

		bodyModel[116].addShapeBox(2F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 7
		bodyModel[116].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[116].rotateAngleZ = 0.06981317F;

		bodyModel[117].addShapeBox(3F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 8
		bodyModel[117].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[117].rotateAngleZ = 0.06981317F;

		bodyModel[118].addShapeBox(4F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 9
		bodyModel[118].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[118].rotateAngleZ = 0.06981317F;

		bodyModel[119].addShapeBox(1F, 0F, 1F, 1, 1, 24, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 12
		bodyModel[119].setRotationPoint(-40F, -17.3F, -13F);
		bodyModel[119].rotateAngleZ = 0.06981317F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 0
		bodyModel[120].setRotationPoint(31F, -15F, 13F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 1
		bodyModel[121].setRotationPoint(24.5F, -14.5F, 12.9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 2
		bodyModel[122].setRotationPoint(31F, -15F, -23.9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 3
		bodyModel[123].setRotationPoint(24.5F, -14.5F, 14.9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 4
		bodyModel[124].setRotationPoint(31F, -15F, 14.9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 5
		bodyModel[125].setRotationPoint(-0.5F, -14.5F, 14.9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[126].setRotationPoint(-14F, -14.5F, 14.9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 7
		bodyModel[127].setRotationPoint(-27.5F, -14.5F, 14.9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 8
		bodyModel[128].setRotationPoint(-27F, -14.5F, -23.9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 9
		bodyModel[129].setRotationPoint(1F, -14.5F, -23.9F);

		bodyModel[130].addShapeBox(3.5F, -2F, -7F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[130].setRotationPoint(42F, -12F, 0F);
		bodyModel[130].rotateAngleZ = -1.9623592F;

		bodyModel[131].addShapeBox(3.5F, -2F, -7F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[131].setRotationPoint(42F, -12F, -2F);
		bodyModel[131].rotateAngleZ = -1.9623592F;

		bodyModel[132].addShapeBox(3.5F, -2F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[132].setRotationPoint(42F, -12F, 0F);
		bodyModel[132].rotateAngleZ = -1.9623592F;

		bodyModel[133].addShapeBox(3.5F, -2F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[133].setRotationPoint(42F, -12F, -2F);
		bodyModel[133].rotateAngleZ = -1.9623592F;

		bodyModel[134].addShapeBox(3.5F, -2F, -4F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[134].setRotationPoint(42F, -12F, 0F);
		bodyModel[134].rotateAngleZ = -1.9623592F;

		bodyModel[135].addShapeBox(3.5F, -2F, -4F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[135].setRotationPoint(42F, -12F, -2F);
		bodyModel[135].rotateAngleZ = -1.9623592F;

		bodyModel[136].addShapeBox(3.5F, -2F, 5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[136].setRotationPoint(42F, -12F, 0F);
		bodyModel[136].rotateAngleZ = -1.9623592F;

		bodyModel[137].addShapeBox(3.5F, -2F, 5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[137].setRotationPoint(42F, -12F, -2F);
		bodyModel[137].rotateAngleZ = -1.9623592F;

		bodyModel[138].addShapeBox(3.5F, -2F, 2F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		bodyModel[138].setRotationPoint(42F, -12F, 0F);
		bodyModel[138].rotateAngleZ = -1.9623592F;

		bodyModel[139].addShapeBox(3.5F, -2F, 2F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[139].setRotationPoint(42F, -12F, -2F);
		bodyModel[139].rotateAngleZ = -1.9623592F;

		bodyModel[140].addShapeBox(3.5F, -2F, 11F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		bodyModel[140].setRotationPoint(42F, -12F, 0F);
		bodyModel[140].rotateAngleZ = -1.9623592F;

		bodyModel[141].addShapeBox(3.5F, -2F, 11F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[141].setRotationPoint(42F, -12F, -2F);
		bodyModel[141].rotateAngleZ = -1.9623592F;

		bodyModel[142].addShapeBox(3.5F, -2F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyModel[142].setRotationPoint(42F, -12F, 0F);
		bodyModel[142].rotateAngleZ = -1.9623592F;

		bodyModel[143].addShapeBox(3.5F, -2F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[143].setRotationPoint(42F, -12F, -2F);
		bodyModel[143].rotateAngleZ = -1.9623592F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[144].setRotationPoint(-39F, -9F, 15F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[145].setRotationPoint(41F, -12F, -24F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 2
		bodyModel[146].setRotationPoint(41F, -10.5F, 14F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 3
		bodyModel[147].setRotationPoint(41F, -7.5F, 14F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 10
		bodyModel[148].setRotationPoint(-25.5F, -18F, -23.5F);
		bodyModel[148].rotateAngleY = -0.03490659F;
		bodyModel[148].rotateAngleZ = 0.01745329F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		bodyModel[149].setRotationPoint(-26F, -19F, 17.5F);
		bodyModel[149].rotateAngleY = -0.01745329F;
		bodyModel[149].rotateAngleZ = 0.08726646F;

		bodyModel[150].addShapeBox(-13F, 0F, 0F, 12, 1, 6, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		bodyModel[150].setRotationPoint(0F, -19F, 18F);
		bodyModel[150].rotateAngleY = 0.03490659F;
		bodyModel[150].rotateAngleZ = -0.03490659F;

		bodyModel[151].addBox(0F, 0F, 0F, 12, 6, 7, 0F); // Box 3
		bodyModel[151].setRotationPoint(-26F, -20F, -17.1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[152].setRotationPoint(16F, -20.5F, -12F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[153].setRotationPoint(16F, -20.7F, -12F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[154].setRotationPoint(21F, -20.7F, -9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[155].setRotationPoint(28F, -18.5F, -21.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[156].setRotationPoint(29F, -16.5F, -20F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.3F, 0.5F); // Box 9
		bodyModel[157].setRotationPoint(29F, -14.5F, -20F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		bodyModel[158].setRotationPoint(28F, -17.5F, -21.5F);

		bodyModel[159].addShapeBox(-3.5F, -2.1F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[159].setRotationPoint(36F, -11F, 5F);
		bodyModel[159].rotateAngleZ = -0.19957665F;

		bodyModel[160].addShapeBox(-3.5F, -2.1F, 2F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[160].setRotationPoint(36F, -11F, 5F);
		bodyModel[160].rotateAngleZ = -0.19957665F;

		bodyModel[161].addShapeBox(-3.5F, -2.1F, 5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[161].setRotationPoint(36F, -11F, 5F);
		bodyModel[161].rotateAngleZ = -0.19957665F;

		bodyModel[162].addShapeBox(-3.5F, -3.1F, 10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[162].setRotationPoint(36F, -11F, 5F);
		bodyModel[162].rotateAngleZ = -0.19957665F;

		bodyModel[163].addShapeBox(-3.5F, -3.1F, 13F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[163].setRotationPoint(36F, -11F, 5F);
		bodyModel[163].rotateAngleZ = -0.19957665F;

		bodyModel[164].addShapeBox(-3.5F, -3.1F, 16F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[164].setRotationPoint(36F, -11F, 5F);
		bodyModel[164].rotateAngleZ = -0.19957665F;

		bodyModel[165].addShapeBox(-3.5F, -3.1F, -17F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[165].setRotationPoint(36F, -11F, -7F);
		bodyModel[165].rotateAngleZ = -0.19957665F;

		bodyModel[166].addShapeBox(-3.5F, -3.1F, -14F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[166].setRotationPoint(36F, -11F, -7F);
		bodyModel[166].rotateAngleZ = -0.19957665F;

		bodyModel[167].addShapeBox(-3.5F, -3.1F, -11F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[167].setRotationPoint(36F, -11F, -7F);
		bodyModel[167].rotateAngleZ = -0.19957665F;

		bodyModel[168].addShapeBox(-3.5F, -2.1F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 9
		bodyModel[168].setRotationPoint(36F, -11F, 7F);
		bodyModel[168].rotateAngleZ = -0.19957665F;

		bodyModel[169].addShapeBox(-3.5F, -2.1F, 2F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		bodyModel[169].setRotationPoint(36F, -11F, 7F);
		bodyModel[169].rotateAngleZ = -0.19957665F;

		bodyModel[170].addShapeBox(-3.5F, -2.1F, 5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[170].setRotationPoint(36F, -11F, 7F);
		bodyModel[170].rotateAngleZ = -0.19957665F;

		bodyModel[171].addShapeBox(-3.5F, -3.1F, 10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyModel[171].setRotationPoint(36F, -11F, 7F);
		bodyModel[171].rotateAngleZ = -0.19957665F;

		bodyModel[172].addShapeBox(-3.5F, -3.1F, 13F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[172].setRotationPoint(36F, -11F, 7F);
		bodyModel[172].rotateAngleZ = -0.19957665F;

		bodyModel[173].addShapeBox(-3.5F, -3.1F, 16F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[173].setRotationPoint(36F, -11F, 7F);
		bodyModel[173].rotateAngleZ = -0.19957665F;

		bodyModel[174].addShapeBox(-3.5F, -3.1F, -23F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		bodyModel[174].setRotationPoint(36F, -11F, 7F);
		bodyModel[174].rotateAngleZ = -0.19957665F;

		bodyModel[175].addShapeBox(-3.5F, -3.1F, -26F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 16
		bodyModel[175].setRotationPoint(36F, -11F, 7F);
		bodyModel[175].rotateAngleZ = -0.19957665F;

		bodyModel[176].addShapeBox(-3.5F, -3.1F, -29F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 17
		bodyModel[176].setRotationPoint(36F, -11F, 7F);
		bodyModel[176].rotateAngleZ = -0.19957665F;

		bodyModel[177].addShapeBox(-1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[177].setRotationPoint(36F, -11.9F, -26F);
		bodyModel[177].rotateAngleZ = -0.19957665F;

		bodyModel[178].addShapeBox(1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[178].setRotationPoint(36F, -11.9F, -26F);
		bodyModel[178].rotateAngleZ = -0.19957665F;

		bodyModel[179].addShapeBox(-1F, -3.1F, 8.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[179].setRotationPoint(36F, -11.9F, -26F);
		bodyModel[179].rotateAngleZ = -0.19957665F;

		bodyModel[180].addShapeBox(1F, -3.1F, 8.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[180].setRotationPoint(36F, -11.9F, -26F);
		bodyModel[180].rotateAngleZ = -0.19957665F;

		bodyModel[181].addShapeBox(1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[181].setRotationPoint(36F, -11F, 5F);
		bodyModel[181].rotateAngleZ = -0.19957665F;

		bodyModel[182].addShapeBox(-1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[182].setRotationPoint(36F, -11F, 5F);
		bodyModel[182].rotateAngleZ = -0.19957665F;

		bodyModel[183].addShapeBox(1F, -3.1F, -0.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[183].setRotationPoint(36F, -11F, 5F);
		bodyModel[183].rotateAngleZ = -0.19957665F;

		bodyModel[184].addShapeBox(-1F, -3.1F, -0.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[184].setRotationPoint(36F, -11F, 5F);
		bodyModel[184].rotateAngleZ = -0.19957665F;

		bodyModel[185].addShapeBox(1F, -3.1F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[185].setRotationPoint(36F, -11F, 5F);
		bodyModel[185].rotateAngleZ = -0.19957665F;

		bodyModel[186].addShapeBox(-1F, -3.1F, -3.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[186].setRotationPoint(36F, -11F, 5F);
		bodyModel[186].rotateAngleZ = -0.19957665F;

		bodyModel[187].addShapeBox(1F, -3.1F, -6.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[187].setRotationPoint(36F, -11F, 5F);
		bodyModel[187].rotateAngleZ = -0.19957665F;

		bodyModel[188].addShapeBox(-1F, -3.1F, -6.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[188].setRotationPoint(36F, -11F, 5F);
		bodyModel[188].rotateAngleZ = -0.19957665F;

		bodyModel[189].addShapeBox(1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[189].setRotationPoint(36F, -11.9F, 13F);
		bodyModel[189].rotateAngleZ = -0.19957665F;

		bodyModel[190].addShapeBox(-1F, -3.1F, 5.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[190].setRotationPoint(36F, -11.9F, 13F);
		bodyModel[190].rotateAngleZ = -0.19957665F;

		bodyModel[191].addShapeBox(1F, -3.1F, 8.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[191].setRotationPoint(36F, -11.9F, 13F);
		bodyModel[191].rotateAngleZ = -0.19957665F;

		bodyModel[192].addShapeBox(-1F, -3.1F, 8.5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[192].setRotationPoint(36F, -11.9F, 13F);
		bodyModel[192].rotateAngleZ = -0.19957665F;


		turretModel = new ModelRendererTurbo[28];
		turretModel[0] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 7
		turretModel[1] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 8
		turretModel[2] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 9
		turretModel[3] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 0
		turretModel[4] = new ModelRendererTurbo(this, 450, 175, textureX, textureY); // Box 1
		turretModel[5] = new ModelRendererTurbo(this, 170, 370, textureX, textureY); // Box 21
		turretModel[6] = new ModelRendererTurbo(this, 170, 370, textureX, textureY); // Box 22
		turretModel[7] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 207
		turretModel[8] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 208
		turretModel[9] = new ModelRendererTurbo(this, 145, 205, textureX, textureY); // Box 0
		turretModel[10] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 0
		turretModel[11] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 218
		turretModel[12] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 217
		turretModel[13] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 219
		turretModel[14] = new ModelRendererTurbo(this, 115, 432, textureX, textureY); // Box 122
		turretModel[15] = new ModelRendererTurbo(this, 115, 432, textureX, textureY); // Box 123
		turretModel[16] = new ModelRendererTurbo(this, 115, 432, textureX, textureY); // Box 124
		turretModel[17] = new ModelRendererTurbo(this, 260, 400, textureX, textureY); // Box 131
		turretModel[18] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 132
		turretModel[19] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 181
		turretModel[20] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 180
		turretModel[21] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 179
		turretModel[22] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 176
		turretModel[23] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 177
		turretModel[24] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 178
		turretModel[25] = new ModelRendererTurbo(this, 0, 284, textureX, textureY); // Box 0
		turretModel[26] = new ModelRendererTurbo(this, 134, 443, textureX, textureY); // Box 1
		turretModel[27] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 2

		turretModel[0].addShapeBox(-9F, -10F, -11F, 8, 6, 22, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 4F, 0F, 0F); // Box 7
		turretModel[0].setRotationPoint(-2F, -19F, 0F);

		turretModel[1].addShapeBox(0F, -9F, -11F, 9, 8, 22, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F); // Box 8
		turretModel[1].setRotationPoint(-3F, -19F, 0F);

		turretModel[2].addShapeBox(9F, -9F, -11F, 6, 5, 22, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 3F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 2F); // Box 9
		turretModel[2].setRotationPoint(-3F, -19F, 0F);

		turretModel[3].addShapeBox(9F, -4F, -11F, 6, 4, 22, 0F, 0F, -4F, 2F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -4F, 2F, 0F, 0F, 2F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 2F); // Box 0
		turretModel[3].setRotationPoint(-3F, -20F, 0F);

		turretModel[4].addShapeBox(-9F, -4F, -11F, 8, 4, 22, 0F, 4F, -1F, 0F, 0F, -4F, 3F, 0F, -4F, 3F, 4F, -1F, 0F, 2F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 2F, 0F, -1F); // Box 1
		turretModel[4].setRotationPoint(-2F, -20F, 0F);

		turretModel[5].addShapeBox(14.5F, -7F, -8F, 2, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		turretModel[5].setRotationPoint(-3F, -19F, 0F);

		turretModel[6].addShapeBox(16.5F, -7F, -8F, 1, 5, 16, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[6].setRotationPoint(-3F, -19F, 0F);

		turretModel[7].addShapeBox(-1F, -9F, -13.5F, 4, 7, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		turretModel[7].setRotationPoint(-2F, -18.5F, 0F);
		turretModel[7].rotateAngleX = -0.06981317F;
		turretModel[7].rotateAngleZ = -0.08726646F;

		turretModel[8].addShapeBox(-17F, -1.5F, -7F, 3, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		turretModel[8].setRotationPoint(0F, -20F, 0F);
		turretModel[8].rotateAngleZ = -0.57595865F;

		turretModel[9].addShapeBox(-3F, -9F, -14F, 9, 7, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[9].setRotationPoint(-2F, -18.5F, 0F);
		turretModel[9].rotateAngleX = -0.03490659F;
		turretModel[9].rotateAngleY = -3.14159265F;
		turretModel[9].rotateAngleZ = 0.08726646F;

		turretModel[10].addShapeBox(4F, -9F, -13.5F, 4, 7, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[10].setRotationPoint(-2F, -18.5F, 0F);
		turretModel[10].rotateAngleX = -0.06981317F;
		turretModel[10].rotateAngleZ = -0.08726646F;

		turretModel[11].addBox(-4F, -11F, -2F, 6, 2, 12, 0F); // Box 218
		turretModel[11].setRotationPoint(-3F, -19F, 0F);

		turretModel[12].addShapeBox(-7F, -11F, -2F, 3, 2, 12, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 217
		turretModel[12].setRotationPoint(-3F, -19F, 0F);

		turretModel[13].addShapeBox(2F, -11F, -2F, 3, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 219
		turretModel[13].setRotationPoint(-3F, -19F, 0F);

		turretModel[14].addShapeBox(-1F, -7.5F, -10.5F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 122
		turretModel[14].setRotationPoint(3F, -22F, 1F);

		turretModel[15].addShapeBox(-6F, -7.5F, -10.5F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 123
		turretModel[15].setRotationPoint(3F, -22F, 1F);

		turretModel[16].addShapeBox(-7F, -7.5F, -10.5F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 124
		turretModel[16].setRotationPoint(3F, -22F, 1F);

		turretModel[17].addShapeBox(-0.5F, -10.6F, -8F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		turretModel[17].setRotationPoint(0F, -19F, 0F);

		turretModel[18].addShapeBox(0F, -11.6F, -7.5F, 2, 2, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 132
		turretModel[18].setRotationPoint(0F, -19F, 0F);

		turretModel[19].addBox(9.5F, -6F, -3.5F, 4, 1, 1, 0F); // Box 181
		turretModel[19].setRotationPoint(4F, -18.5F, -1F);
		turretModel[19].rotateAngleY = -0.62831853F;
		turretModel[19].rotateAngleZ = 0.36651914F;

		turretModel[20].addBox(10.5F, -4.5F, -3.5F, 4, 1, 1, 0F); // Box 180
		turretModel[20].setRotationPoint(4F, -18.5F, -1F);
		turretModel[20].rotateAngleY = -0.54105207F;
		turretModel[20].rotateAngleZ = 0.40142573F;

		turretModel[21].addBox(11.5F, -3F, -3.5F, 4, 1, 1, 0F); // Box 179
		turretModel[21].setRotationPoint(4F, -18.5F, -1F);
		turretModel[21].rotateAngleY = -0.45378561F;
		turretModel[21].rotateAngleZ = 0.43633231F;

		turretModel[22].addBox(9F, -5F, 6F, 4, 1, 1, 0F); // Box 176
		turretModel[22].setRotationPoint(3F, -19F, 0F);
		turretModel[22].rotateAngleY = 0.4712389F;
		turretModel[22].rotateAngleZ = 0.43633231F;

		turretModel[23].addBox(9F, -5F, 6F, 4, 1, 1, 0F); // Box 177
		turretModel[23].setRotationPoint(4F, -19F, 0F);
		turretModel[23].rotateAngleY = 0.38397244F;
		turretModel[23].rotateAngleZ = 0.40142573F;

		turretModel[24].addBox(10F, -5F, 6F, 4, 1, 1, 0F); // Box 178
		turretModel[24].setRotationPoint(4F, -19F, 0F);
		turretModel[24].rotateAngleY = 0.29670597F;
		turretModel[24].rotateAngleZ = 0.36651914F;

		turretModel[25].addShapeBox(0F, -11.5F, -8F, 35, 1, 35, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -30F, 0F, 0F, -30F); // Box 0
		turretModel[25].setRotationPoint(-3F, -19F, 0F);
		turretModel[25].rotateAngleX = 0.01745329F;
		turretModel[25].rotateAngleY = -1.3962634F;
		turretModel[25].rotateAngleZ = 1.20427718F;

		turretModel[26].addShapeBox(-1.5F, -10F, 5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[26].setRotationPoint(0F, -19F, 0F);
		turretModel[26].rotateAngleX = -0.13962634F;
		turretModel[26].rotateAngleY = -1.57079633F;

		turretModel[27].addShapeBox(-1F, -11F, 5.5F, 2, 2, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 2
		turretModel[27].setRotationPoint(0F, -19F, 0F);
		turretModel[27].rotateAngleX = -0.13962634F;
		turretModel[27].rotateAngleY = -1.57079633F;


		barrelModel = new ModelRendererTurbo[9];
		barrelModel[0] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		barrelModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		barrelModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 14
		barrelModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 15
		barrelModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		barrelModel[5] = new ModelRendererTurbo(this, 233, 240, textureX, textureY); // Box 17
		barrelModel[6] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 23
		barrelModel[7] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 24
		barrelModel[8] = new ModelRendererTurbo(this, 141, 380, textureX, textureY); // Box 1

		barrelModel[0].addShapeBox(0.5F, -3F, -10F, 1, 2, 20, 0F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		barrelModel[0].setRotationPoint(14F, -23F, 0F);

		barrelModel[1].addBox(1F, -2F, -1.5F, 4, 3, 3, 0F); // Box 13
		barrelModel[1].setRotationPoint(14F, -22.5F, 0F);

		barrelModel[2].addBox(5F, -1.5F, -1F, 2, 2, 2, 0F); // Box 14
		barrelModel[2].setRotationPoint(14F, -22.5F, 0F);

		barrelModel[3].addShapeBox(7F, -1F, -0.5F, 18, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 15
		barrelModel[3].setRotationPoint(14F, -22.5F, 0F);

		barrelModel[4].addShapeBox(25F, -1F, -0.5F, 4, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.2F, 0.2F); // Box 16
		barrelModel[4].setRotationPoint(14F, -22.5F, 0F);

		barrelModel[5].addShapeBox(1F, -1F, 5.5F, 3, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 17
		barrelModel[5].setRotationPoint(14F, -22.5F, 0F);

		barrelModel[6].addShapeBox(0.5F, 0F, -10F, 1, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F); // Box 23
		barrelModel[6].setRotationPoint(14F, -23F, 0F);

		barrelModel[7].addShapeBox(0.5F, -1F, -10F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		barrelModel[7].setRotationPoint(14F, -23F, 0F);

		barrelModel[8].addBox(1F, -1F, 5.5F, 1, 1, 1, 0F); // Box 1
		barrelModel[8].setRotationPoint(14F, -22.5F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[9];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 52
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 4
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 5
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 6
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 7
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 8
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 9
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 10
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 11

		leftTrackWheelModels[0].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 52
		leftTrackWheelModels[0].setRotationPoint(4F, 2.5F, 18F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 4
		leftTrackWheelModels[1].setRotationPoint(14F, 2.5F, 21F);

		leftTrackWheelModels[2].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 5
		leftTrackWheelModels[2].setRotationPoint(23F, 2.5F, 18F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 6
		leftTrackWheelModels[3].setRotationPoint(-7F, 2.5F, 21F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 7
		leftTrackWheelModels[4].setRotationPoint(-17F, 2.5F, 18F);

		leftTrackWheelModels[5].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 8
		leftTrackWheelModels[5].setRotationPoint(-28F, 0.5F, 22F);

		leftTrackWheelModels[6].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 9
		leftTrackWheelModels[6].setRotationPoint(-28F, 0.5F, 17F);

		leftTrackWheelModels[7].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 10
		leftTrackWheelModels[7].setRotationPoint(34F, -1.6F, 21F);

		leftTrackWheelModels[8].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 11
		leftTrackWheelModels[8].setRotationPoint(34F, -1.6F, 16F);


		rightTrackWheelModels = new ModelRendererTurbo[9];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 23
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 24
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 25
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 26
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 27
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 28
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 29
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 30
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 31

		rightTrackWheelModels[0].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 23
		rightTrackWheelModels[0].setRotationPoint(4F, 2.5F, -20F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 24
		rightTrackWheelModels[1].setRotationPoint(14F, 2.5F, -23F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 25
		rightTrackWheelModels[2].setRotationPoint(23F, 2.5F, -20F);

		rightTrackWheelModels[3].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 26
		rightTrackWheelModels[3].setRotationPoint(-7F, 2.5F, -23F);

		rightTrackWheelModels[4].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 27
		rightTrackWheelModels[4].setRotationPoint(-17F, 2.5F, -20F);

		rightTrackWheelModels[5].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 28
		rightTrackWheelModels[5].setRotationPoint(-28F, 0.5F, -18F);

		rightTrackWheelModels[6].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 29
		rightTrackWheelModels[6].setRotationPoint(-28F, 0.5F, -23F);

		rightTrackWheelModels[7].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 30
		rightTrackWheelModels[7].setRotationPoint(34F, -1.6F, -17F);

		rightTrackWheelModels[8].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 31
		rightTrackWheelModels[8].setRotationPoint(34F, -1.6F, -22F);


		leftTrackModel = new ModelRendererTurbo[14];
		leftTrackModel[0] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 91
		leftTrackModel[1] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 92
		leftTrackModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 93
		leftTrackModel[3] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 94
		leftTrackModel[4] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 95
		leftTrackModel[5] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 97
		leftTrackModel[6] = new ModelRendererTurbo(this, 393, 244, textureX, textureY); // Box 98
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 99
		leftTrackModel[8] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 101
		leftTrackModel[9] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 102
		leftTrackModel[10] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 103
		leftTrackModel[11] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 104
		leftTrackModel[12] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 105
		leftTrackModel[13] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 4

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 91
		leftTrackModel[0].setRotationPoint(23F, -8.5F, 15.5F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 43, 1, 9, 0F); // Box 92
		leftTrackModel[1].setRotationPoint(-20F, -4.5F, 15.5F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Box 93
		leftTrackModel[2].setRotationPoint(32F, -8.5F, 15.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftTrackModel[3].setRotationPoint(40.5F, -8.5F, 15.5F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 95
		leftTrackModel[4].setRotationPoint(40.5F, -3.5F, 15.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F, 0F, -4.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F); // Box 97
		leftTrackModel[5].setRotationPoint(26F, 3.5F, 15.5F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 47, 1, 9, 0F); // Box 98
		leftTrackModel[6].setRotationPoint(-21F, 8F, 15.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 99
		leftTrackModel[7].setRotationPoint(-32F, 5.5F, 15.5F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 101
		leftTrackModel[8].setRotationPoint(-35.5F, -1.5F, 15.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F); // Box 102
		leftTrackModel[9].setRotationPoint(-35.5F, 1.5F, 15.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		leftTrackModel[10].setRotationPoint(-35.5F, -6.5F, 15.5F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Box 104
		leftTrackModel[11].setRotationPoint(-32F, -6.5F, 15.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 105
		leftTrackModel[12].setRotationPoint(-26F, -6.5F, 15.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F); // Box 4
		leftTrackModel[13].setRotationPoint(40.5F, -0.5F, 15.5F);


		rightTrackModel = new ModelRendererTurbo[14];
		rightTrackModel[0] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 14
		rightTrackModel[1] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 15
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 16
		rightTrackModel[3] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 17
		rightTrackModel[4] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 18
		rightTrackModel[5] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 19
		rightTrackModel[6] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 20
		rightTrackModel[7] = new ModelRendererTurbo(this, 393, 244, textureX, textureY); // Box 21
		rightTrackModel[8] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 22
		rightTrackModel[9] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 5
		rightTrackModel[10] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 6
		rightTrackModel[11] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 7
		rightTrackModel[12] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 8
		rightTrackModel[13] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 9

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 14
		rightTrackModel[0].setRotationPoint(23F, -8.5F, -24.5F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 43, 1, 9, 0F); // Box 15
		rightTrackModel[1].setRotationPoint(-20F, -4.5F, -24.5F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Box 16
		rightTrackModel[2].setRotationPoint(32F, -8.5F, -24.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightTrackModel[3].setRotationPoint(40.5F, -8.5F, -24.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 18
		rightTrackModel[4].setRotationPoint(40.5F, -3.5F, -24.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F); // Box 19
		rightTrackModel[5].setRotationPoint(40.5F, -0.5F, -24.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F, 0F, -4.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F); // Box 20
		rightTrackModel[6].setRotationPoint(26F, 3.5F, -24.5F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 47, 1, 9, 0F); // Box 21
		rightTrackModel[7].setRotationPoint(-21F, 8F, -24.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 22
		rightTrackModel[8].setRotationPoint(-32F, 5.5F, -24.5F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 5
		rightTrackModel[9].setRotationPoint(-35.5F, -1.5F, -24.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F); // Box 6
		rightTrackModel[10].setRotationPoint(-35.5F, 1.5F, -24.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		rightTrackModel[11].setRotationPoint(-35.5F, -6.5F, -24.5F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Box 8
		rightTrackModel[12].setRotationPoint(-32F, -6.5F, -24.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9
		rightTrackModel[13].setRotationPoint(-26F, -6.5F, -24.5F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
