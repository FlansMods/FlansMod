//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.4
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelCromwell extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelCromwell()
	{
		bodyModel = new ModelRendererTurbo[180];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 41
		bodyModel[14] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 42
		bodyModel[15] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 43
		bodyModel[16] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 44
		bodyModel[17] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 45
		bodyModel[18] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 46
		bodyModel[19] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 53
		bodyModel[21] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 54
		bodyModel[22] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 55
		bodyModel[23] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 143
		bodyModel[24] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 144
		bodyModel[25] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 145
		bodyModel[26] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 17
		bodyModel[27] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 18
		bodyModel[28] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 304
		bodyModel[29] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 303
		bodyModel[30] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 27
		bodyModel[31] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 28
		bodyModel[32] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 29
		bodyModel[33] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 30
		bodyModel[34] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 31
		bodyModel[35] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 32
		bodyModel[36] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 33
		bodyModel[37] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 34
		bodyModel[38] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 35
		bodyModel[39] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 36
		bodyModel[40] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 37
		bodyModel[41] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 38
		bodyModel[42] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 59
		bodyModel[51] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 60
		bodyModel[52] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 62
		bodyModel[54] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 64
		bodyModel[56] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 65
		bodyModel[57] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 66
		bodyModel[58] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 67
		bodyModel[59] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 68
		bodyModel[60] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 69
		bodyModel[61] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 72
		bodyModel[62] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Box 73
		bodyModel[63] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 75
		bodyModel[64] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Box 76
		bodyModel[65] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 77
		bodyModel[66] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 78
		bodyModel[67] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 80
		bodyModel[68] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 101
		bodyModel[69] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 7
		bodyModel[70] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 8
		bodyModel[71] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 9
		bodyModel[72] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 10
		bodyModel[73] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 11
		bodyModel[74] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 12
		bodyModel[75] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 34
		bodyModel[76] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 35
		bodyModel[77] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 36
		bodyModel[78] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 95
		bodyModel[81] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 96
		bodyModel[82] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 105
		bodyModel[83] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 1
		bodyModel[85] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 2
		bodyModel[86] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 3
		bodyModel[87] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 4
		bodyModel[88] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 1
		bodyModel[89] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 2
		bodyModel[90] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 3
		bodyModel[91] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 4
		bodyModel[92] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 7
		bodyModel[93] = new ModelRendererTurbo(this, 433, 310, textureX, textureY); // Box 9
		bodyModel[94] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 10
		bodyModel[95] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[96] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12
		bodyModel[97] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 13
		bodyModel[98] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 14
		bodyModel[99] = new ModelRendererTurbo(this, 433, 310, textureX, textureY); // Box 15
		bodyModel[100] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 16
		bodyModel[101] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 17
		bodyModel[102] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 18
		bodyModel[103] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 19
		bodyModel[104] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 20
		bodyModel[105] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 21
		bodyModel[106] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 22
		bodyModel[107] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 23
		bodyModel[108] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 24
		bodyModel[109] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 25
		bodyModel[110] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 26
		bodyModel[111] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 27
		bodyModel[112] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 28
		bodyModel[113] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 29
		bodyModel[114] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 30
		bodyModel[115] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 31
		bodyModel[116] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 32
		bodyModel[117] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 33
		bodyModel[118] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 34
		bodyModel[119] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 35
		bodyModel[120] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 36
		bodyModel[121] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 37
		bodyModel[122] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 38
		bodyModel[123] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 39
		bodyModel[124] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 40
		bodyModel[125] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 41
		bodyModel[126] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 42
		bodyModel[127] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 43
		bodyModel[128] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 44
		bodyModel[129] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 45
		bodyModel[130] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 46
		bodyModel[131] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 47
		bodyModel[132] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 48
		bodyModel[133] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 49
		bodyModel[134] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 50
		bodyModel[135] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 51
		bodyModel[136] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 52
		bodyModel[137] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 53
		bodyModel[138] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 54
		bodyModel[139] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 55
		bodyModel[140] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 56
		bodyModel[141] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 57
		bodyModel[142] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 58
		bodyModel[143] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 59
		bodyModel[144] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 60
		bodyModel[145] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 61
		bodyModel[146] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 62
		bodyModel[147] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 63
		bodyModel[148] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 64
		bodyModel[149] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 65
		bodyModel[150] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 66
		bodyModel[151] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 67
		bodyModel[152] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 68
		bodyModel[153] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 69
		bodyModel[154] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 70
		bodyModel[155] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 71
		bodyModel[156] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 72
		bodyModel[157] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 73
		bodyModel[158] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 74
		bodyModel[159] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 75
		bodyModel[160] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 76
		bodyModel[161] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 77
		bodyModel[162] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 78
		bodyModel[163] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 79
		bodyModel[164] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 80
		bodyModel[165] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 81
		bodyModel[166] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 82
		bodyModel[167] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 83
		bodyModel[168] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 84
		bodyModel[169] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 85
		bodyModel[170] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 86
		bodyModel[171] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 87
		bodyModel[172] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 88
		bodyModel[173] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 89
		bodyModel[174] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 90
		bodyModel[175] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 91
		bodyModel[176] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 92
		bodyModel[177] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 93
		bodyModel[178] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 94
		bodyModel[179] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 95

		bodyModel[0].addBox(0F, 0F, 0F, 90, 7, 36, 0F); // Box 0
		bodyModel[0].setRotationPoint(-60F, -20F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 25, 19, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(9F, -13F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 25, 19, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-60F, -13F, -21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 44, 19, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-35F, -13F, -21F);

		bodyModel[4].addBox(0F, 0F, 0F, 80, 1, 1, 0F); // Box 5
		bodyModel[4].setRotationPoint(-49F, -14F, 28F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(31F, -14F, 28F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(30F, -14F, 17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 11
		bodyModel[7].setRotationPoint(-60F, -14F, 28F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 12
		bodyModel[8].setRotationPoint(-60F, -14F, 18F);

		bodyModel[9].addBox(0F, 0F, 0F, 101, 1, 12, 0F); // Box 14
		bodyModel[9].setRotationPoint(-60F, -15F, -29F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 14, 42, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[10].setRotationPoint(34F, -13F, -21F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 35, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[11].setRotationPoint(-30F, -20F, 18F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 60, 5, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(-30F, -20F, -24F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 41
		bodyModel[13].setRotationPoint(30F, -19.5F, 5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 42
		bodyModel[14].setRotationPoint(31F, -19F, 5.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 43
		bodyModel[15].setRotationPoint(32F, -16.5F, 6.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 44
		bodyModel[16].setRotationPoint(32F, -17.5F, 6.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 45
		bodyModel[17].setRotationPoint(32F, -17.5F, 8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 46
		bodyModel[18].setRotationPoint(32F, -17.5F, 7.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 52
		bodyModel[19].setRotationPoint(30F, -19.5F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); // Box 53
		bodyModel[20].setRotationPoint(31F, -19F, -10.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 54
		bodyModel[21].setRotationPoint(28.1F, -19.5F, -14.5F);
		bodyModel[21].rotateAngleY = -0.29670597F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 55
		bodyModel[22].setRotationPoint(28.5F, -18.5F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[23].setRotationPoint(-64F, -9.5F, 21F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[24].setRotationPoint(-64F, -6.5F, 21F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 145
		bodyModel[25].setRotationPoint(-64F, -0.5F, 21F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 33, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[26].setRotationPoint(-29F, -20.1F, 18.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 58, 5, 5, 0F,0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[27].setRotationPoint(-29F, -20.1F, -23.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 304
		bodyModel[28].setRotationPoint(42F, -12.8F, 10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 303
		bodyModel[29].setRotationPoint(42F, -14F, 10.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 27
		bodyModel[30].setRotationPoint(42F, -14F, -10F);

		bodyModel[31].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 28
		bodyModel[31].setRotationPoint(43F, -14F, -10F);
		bodyModel[31].rotateAngleZ = 0.41887902F;

		bodyModel[32].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[32].setRotationPoint(42.2F, -15.8F, -10F);
		bodyModel[32].rotateAngleZ = 0.41887902F;

		bodyModel[33].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[33].setRotationPoint(42.2F, -15.8F, -13F);
		bodyModel[33].rotateAngleZ = 0.41887902F;

		bodyModel[34].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 31
		bodyModel[34].setRotationPoint(43F, -14F, -13F);
		bodyModel[34].rotateAngleZ = 0.41887902F;

		bodyModel[35].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 32
		bodyModel[35].setRotationPoint(42F, -14F, -13F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 33
		bodyModel[36].setRotationPoint(42F, -12.8F, -11.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 34
		bodyModel[37].setRotationPoint(42F, -14F, -11.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[38].setRotationPoint(22F, -20.5F, -14F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[39].setRotationPoint(27F, -21F, -13F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[40].setRotationPoint(27F, -21F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[41].setRotationPoint(21F, -20.5F, 10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[42].setRotationPoint(-36F, -21F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[43].setRotationPoint(-36F, -21F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[44].setRotationPoint(-41F, -20.5F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[45].setRotationPoint(-47F, -20.5F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[46].setRotationPoint(-48F, -21F, 5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[47].setRotationPoint(-48F, -21F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[48].setRotationPoint(-47F, -20.5F, -17F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[49].setRotationPoint(-48F, -21F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[50].setRotationPoint(-41F, -20.5F, -17F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[51].setRotationPoint(-36F, -21F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[52].setRotationPoint(-36F, -21F, -16F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[53].setRotationPoint(-48F, -21F, -16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[54].setRotationPoint(-48F, -21F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[55].setRotationPoint(-36F, -21F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[56].setRotationPoint(-41F, -20.5F, 9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[57].setRotationPoint(-47F, -20.5F, 9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[58].setRotationPoint(-48F, -21F, 15F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[59].setRotationPoint(-36F, -21F, 15F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 22, 33, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[60].setRotationPoint(-65F, -21.1F, -17F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 33, 0F,2F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 72
		bodyModel[61].setRotationPoint(-66F, -21.1F, -17F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 6, 33, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F); // Box 73
		bodyModel[62].setRotationPoint(-71F, -21.1F, -17F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 30, 0F,-1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[63].setRotationPoint(-33F, -21.5F, -15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 30, 0F,-1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[64].setRotationPoint(-33F, -20.5F, -15F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[65].setRotationPoint(-31.5F, -22F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[66].setRotationPoint(-30F, -23F, 2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[67].setRotationPoint(-30F, -23F, -3F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bodyModel[68].setRotationPoint(34F, -17.5F, 7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[69].setRotationPoint(-54F, -20.5F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[70].setRotationPoint(-51F, -21F, 5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[71].setRotationPoint(-51F, -21F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[72].setRotationPoint(-58F, -20.5F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[73].setRotationPoint(-59F, -21F, 5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[74].setRotationPoint(-59F, -21F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 34
		bodyModel[75].setRotationPoint(-63.5F, -1F, 26.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[76].setRotationPoint(-63.5F, -6F, 26.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[77].setRotationPoint(-63.5F, -9F, 26.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[78].setRotationPoint(-50F, -5.1F, 21F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[79].setRotationPoint(-49F, -4.6F, 26.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[80].setRotationPoint(-50F, -2.1F, 21F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[81].setRotationPoint(-49F, -1.6F, 26.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 105
		bodyModel[82].setRotationPoint(-50F, 5.9F, 21F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 106
		bodyModel[83].setRotationPoint(-49F, 5.4F, 26.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[84].setRotationPoint(41F, -15F, -29F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 8, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[85].setRotationPoint(41F, -15F, -28F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, -2F, 0F); // Box 3
		bodyModel[86].setRotationPoint(41F, -15F, -18F);

		bodyModel[87].addBox(0F, 0F, 0F, 101, 1, 12, 0F); // Box 4
		bodyModel[87].setRotationPoint(-60F, -15F, 17F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[88].setRotationPoint(41F, -15F, 28F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 8, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[89].setRotationPoint(41F, -15F, 18F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, -2F, 0F); // Box 3
		bodyModel[90].setRotationPoint(41F, -15F, 17F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 0F, 0F); // Box 4
		bodyModel[91].setRotationPoint(-66F, -15F, 28F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 0F, 0F); // Box 7
		bodyModel[92].setRotationPoint(-66F, -15F, 17F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 8, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 3F, 0F, 0F); // Box 9
		bodyModel[93].setRotationPoint(-66F, -15F, 18F);

		bodyModel[94].addBox(0F, 0F, 0F, 80, 1, 1, 0F); // Box 10
		bodyModel[94].setRotationPoint(-49F, -14F, -29F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[95].setRotationPoint(31F, -14F, -29F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 12
		bodyModel[96].setRotationPoint(-60F, -14F, -29F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 0F, 0F); // Box 13
		bodyModel[97].setRotationPoint(-66F, -15F, -29F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 0F, 0F); // Box 14
		bodyModel[98].setRotationPoint(-66F, -15F, -18F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 8, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 3F, 0F, 0F); // Box 15
		bodyModel[99].setRotationPoint(-66F, -15F, -28F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[100].setRotationPoint(30F, -14F, -18F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 17
		bodyModel[101].setRotationPoint(28.5F, -15.5F, -12F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 18
		bodyModel[102].setRotationPoint(42F, -14F, 9F);

		bodyModel[103].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 19
		bodyModel[103].setRotationPoint(43F, -14F, 9F);
		bodyModel[103].rotateAngleZ = 0.41887902F;

		bodyModel[104].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[104].setRotationPoint(42.2F, -15.8F, 9F);
		bodyModel[104].rotateAngleZ = 0.41887902F;

		bodyModel[105].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[105].setRotationPoint(42.2F, -15.8F, 12F);
		bodyModel[105].rotateAngleZ = 0.41887902F;

		bodyModel[106].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 22
		bodyModel[106].setRotationPoint(43F, -14F, 12F);
		bodyModel[106].rotateAngleZ = 0.41887902F;

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 23
		bodyModel[107].setRotationPoint(42F, -14F, 12F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[108].setRotationPoint(-33F, -5.1F, 21F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[109].setRotationPoint(-33F, -2.1F, 21F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 26
		bodyModel[110].setRotationPoint(-33F, 5.9F, 21F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 27
		bodyModel[111].setRotationPoint(-32F, 5.4F, 26.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[112].setRotationPoint(-32F, -1.6F, 26.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[113].setRotationPoint(-32F, -4.6F, 26.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[114].setRotationPoint(-16F, -5.1F, 21F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[115].setRotationPoint(1F, -5.1F, 21F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[116].setRotationPoint(2F, -4.6F, 26.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[117].setRotationPoint(-15F, -4.6F, 26.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[118].setRotationPoint(-15F, -1.6F, 26.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[119].setRotationPoint(2F, -1.6F, 26.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 36
		bodyModel[120].setRotationPoint(2F, 5.4F, 26.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 37
		bodyModel[121].setRotationPoint(-15F, 5.4F, 26.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[122].setRotationPoint(1F, -2.1F, 21F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 39
		bodyModel[123].setRotationPoint(1F, 5.9F, 21F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 40
		bodyModel[124].setRotationPoint(-16F, 5.9F, 21F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[125].setRotationPoint(-16F, -2.1F, 21F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[126].setRotationPoint(19F, -4.6F, 26.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[127].setRotationPoint(18F, -5.1F, 21F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[128].setRotationPoint(18F, -2.1F, 21F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[129].setRotationPoint(19F, -1.6F, 26.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 46
		bodyModel[130].setRotationPoint(19F, 5.4F, 26.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 47
		bodyModel[131].setRotationPoint(18F, 5.9F, 21F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[132].setRotationPoint(-50F, -5.1F, -27F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[133].setRotationPoint(-49F, -4.6F, -27.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[134].setRotationPoint(-50F, -2.1F, -27F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[135].setRotationPoint(-49F, -1.6F, -27.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 52
		bodyModel[136].setRotationPoint(-50F, 5.9F, -27F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 53
		bodyModel[137].setRotationPoint(-49F, 5.4F, -27.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[138].setRotationPoint(-33F, -5.1F, -27F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[139].setRotationPoint(-33F, -2.1F, -27F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 56
		bodyModel[140].setRotationPoint(-33F, 5.9F, -27F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 57
		bodyModel[141].setRotationPoint(-32F, 5.4F, -27.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[142].setRotationPoint(-32F, -1.6F, -27.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[143].setRotationPoint(-32F, -4.6F, -27.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[144].setRotationPoint(-16F, -5.1F, -27F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[145].setRotationPoint(1F, -5.1F, -27F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[146].setRotationPoint(2F, -4.6F, -27.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[147].setRotationPoint(-15F, -4.6F, -27.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[148].setRotationPoint(-15F, -1.6F, -27.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[149].setRotationPoint(2F, -1.6F, -27.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 66
		bodyModel[150].setRotationPoint(2F, 5.4F, -27.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 67
		bodyModel[151].setRotationPoint(-15F, 5.4F, -27.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[152].setRotationPoint(1F, -2.1F, -27F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 69
		bodyModel[153].setRotationPoint(1F, 5.9F, -27F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 70
		bodyModel[154].setRotationPoint(-16F, 5.9F, -27F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[155].setRotationPoint(-16F, -2.1F, -27F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[156].setRotationPoint(19F, -4.6F, -27.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[157].setRotationPoint(18F, -5.1F, -27F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 14, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[158].setRotationPoint(18F, -2.1F, -27F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[159].setRotationPoint(19F, -1.6F, -27.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 76
		bodyModel[160].setRotationPoint(19F, 5.4F, -27.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 77
		bodyModel[161].setRotationPoint(18F, 5.9F, -27F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[162].setRotationPoint(33F, -10.5F, 21F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 11, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[163].setRotationPoint(33F, -7.5F, 21F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 80
		bodyModel[164].setRotationPoint(33F, -1.5F, 21F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 81
		bodyModel[165].setRotationPoint(33.5F, -2F, 26.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[166].setRotationPoint(33.5F, -7F, 26.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[167].setRotationPoint(33.5F, -10F, 26.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[168].setRotationPoint(-64F, -9.5F, -27F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 11, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[169].setRotationPoint(-64F, -6.5F, -27F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 86
		bodyModel[170].setRotationPoint(-64F, -0.5F, -27F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 87
		bodyModel[171].setRotationPoint(-63.5F, -1F, -27.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[172].setRotationPoint(-63.5F, -6F, -27.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[173].setRotationPoint(-63.5F, -9F, -27.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[174].setRotationPoint(33F, -10.5F, -27F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 11, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[175].setRotationPoint(33F, -7.5F, -27F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 92
		bodyModel[176].setRotationPoint(33F, -1.5F, -27F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 93
		bodyModel[177].setRotationPoint(33.5F, -2F, -27.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[178].setRotationPoint(33.5F, -7F, -27.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[179].setRotationPoint(33.5F, -10F, -27.5F);


		turretModel = new ModelRendererTurbo[61];
		turretModel[0] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 28
		turretModel[1] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 29
		turretModel[2] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 30
		turretModel[3] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 31
		turretModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 32
		turretModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		turretModel[6] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 38
		turretModel[7] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 47
		turretModel[8] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 48
		turretModel[9] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 49
		turretModel[10] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 51
		turretModel[11] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 0
		turretModel[12] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 1
		turretModel[13] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 2
		turretModel[14] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 3
		turretModel[15] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 4
		turretModel[16] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 5
		turretModel[17] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 6
		turretModel[18] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 7
		turretModel[19] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 8
		turretModel[20] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 9
		turretModel[21] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 10
		turretModel[22] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 11
		turretModel[23] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 12
		turretModel[24] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 13
		turretModel[25] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 14
		turretModel[26] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 15
		turretModel[27] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 16
		turretModel[28] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 40
		turretModel[29] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 41
		turretModel[30] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 42
		turretModel[31] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 44
		turretModel[32] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 74
		turretModel[33] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 81
		turretModel[34] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 82
		turretModel[35] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		turretModel[36] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 84
		turretModel[37] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 85
		turretModel[38] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 86
		turretModel[39] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 87
		turretModel[40] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 88
		turretModel[41] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 89
		turretModel[42] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 90
		turretModel[43] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 91
		turretModel[44] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 92
		turretModel[45] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 93
		turretModel[46] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 94
		turretModel[47] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 95
		turretModel[48] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 96
		turretModel[49] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 103
		turretModel[50] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 104
		turretModel[51] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Box 105
		turretModel[52] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 106
		turretModel[53] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 107
		turretModel[54] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 326
		turretModel[55] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 326
		turretModel[56] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 326
		turretModel[57] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 326
		turretModel[58] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 4
		turretModel[59] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 6
		turretModel[60] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 0

		turretModel[0].addShapeBox(7F, -13F, -17F, 12, 13, 35, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 28
		turretModel[0].setRotationPoint(-2F, -21F, 0F);

		turretModel[1].addShapeBox(-19F, -13F, -17F, 16, 13, 35, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 29
		turretModel[1].setRotationPoint(-2F, -21F, 0F);

		turretModel[2].addShapeBox(19F, -12F, -13F, 3, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[2].setRotationPoint(-2F, -21F, 0F);

		turretModel[3].addShapeBox(19F, -2F, -13F, 3, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[3].setRotationPoint(-2F, -21F, 0F);

		turretModel[4].addShapeBox(19F, -10F, -13F, 3, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[4].setRotationPoint(-2F, -21F, 0F);

		turretModel[5].addShapeBox(19F, -10F, 4F, 3, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[5].setRotationPoint(-2F, -21F, 0F);

		turretModel[6].addShapeBox(-3F, -13F, -17F, 10, 13, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[6].setRotationPoint(-2F, -21F, 0F);

		turretModel[7].addBox(20F, -7F, 2F, 5, 1, 1, 0F); // Box 47
		turretModel[7].setRotationPoint(-2F, -21F, 0F);

		turretModel[8].addBox(20F, -6F, 0F, 5, 1, 3, 0F); // Box 48
		turretModel[8].setRotationPoint(-2F, -21F, 0F);

		turretModel[9].addShapeBox(20F, -7F, 1F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 49
		turretModel[9].setRotationPoint(-2F, -21F, 0F);

		turretModel[10].addShapeBox(19F, -8F, -1F, 1, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 51
		turretModel[10].setRotationPoint(-2F, -21F, 0F);

		turretModel[11].addShapeBox(-3.5F, -14F, 0.5F, 10, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[11].setRotationPoint(-2F, -21F, 0F);

		turretModel[12].addShapeBox(6.5F, -14F, 0.5F, 4, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 1
		turretModel[12].setRotationPoint(-2F, -21F, 0F);

		turretModel[13].addShapeBox(-7.5F, -14F, 0.5F, 4, 1, 17, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 2
		turretModel[13].setRotationPoint(-2F, -21F, 0F);

		turretModel[14].addShapeBox(2F, -13.5F, -13F, 6, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[14].setRotationPoint(-2F, -21F, 0F);

		turretModel[15].addShapeBox(-4F, -13.5F, -13F, 6, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		turretModel[15].setRotationPoint(-2F, -21F, 0F);

		turretModel[16].addShapeBox(7F, -14F, -12F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[16].setRotationPoint(-2F, -21F, 0F);

		turretModel[17].addShapeBox(7F, -14F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[17].setRotationPoint(-2F, -21F, 0F);

		turretModel[18].addShapeBox(-5F, -14F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		turretModel[18].setRotationPoint(-2F, -21F, 0F);

		turretModel[19].addShapeBox(-5F, -14F, -12F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		turretModel[19].setRotationPoint(-2F, -21F, 0F);

		turretModel[20].addShapeBox(6F, -15F, 1F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 9
		turretModel[20].setRotationPoint(-2F, -21F, 0F);

		turretModel[21].addShapeBox(-7F, -15F, 1F, 4, 1, 16, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 10
		turretModel[21].setRotationPoint(-2F, -21F, 0F);

		turretModel[22].addShapeBox(-3F, -15F, 1F, 9, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[22].setRotationPoint(-2F, -21F, 0F);

		turretModel[23].addShapeBox(13F, -13.5F, 7F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[23].setRotationPoint(-2F, -21F, 0F);

		turretModel[24].addShapeBox(13F, -13.5F, -10F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[24].setRotationPoint(-2F, -21F, 0F);

		turretModel[25].addShapeBox(11.5F, -12.5F, -10.5F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[25].setRotationPoint(-2F, -21F, 0F);

		turretModel[26].addShapeBox(11.5F, -12.5F, 6.5F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[26].setRotationPoint(-2F, -21F, 0F);

		turretModel[27].addShapeBox(13.5F, -13F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		turretModel[27].setRotationPoint(-2F, -21F, 0F);

		turretModel[28].addShapeBox(-3F, 0F, -16.5F, 10, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		turretModel[28].setRotationPoint(-2F, -21F, 0F);

		turretModel[29].addShapeBox(-15F, 0F, -16.5F, 12, 1, 34, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 41
		turretModel[29].setRotationPoint(-2F, -21F, 0F);

		turretModel[30].addShapeBox(18F, 0F, -12.5F, 3, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		turretModel[30].setRotationPoint(-2F, -21F, 0F);

		turretModel[31].addShapeBox(7F, 0F, -16.5F, 11, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 44
		turretModel[31].setRotationPoint(-2F, -21F, 0F);

		turretModel[32].addShapeBox(14F, -13.5F, 0.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		turretModel[32].setRotationPoint(-2F, -21F, 0F);

		turretModel[33].addShapeBox(0F, -10F, -20.5F, 13, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		turretModel[33].setRotationPoint(-2F, -21F, 0F);
		turretModel[33].rotateAngleY = 0.31415927F;
		turretModel[33].rotateAngleZ = -0.03490659F;

		turretModel[34].addShapeBox(0F, -10.5F, -20.5F, 13, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 82
		turretModel[34].setRotationPoint(-2F, -21F, 0F);
		turretModel[34].rotateAngleY = 0.31415927F;
		turretModel[34].rotateAngleZ = -0.03490659F;

		turretModel[35].addShapeBox(3F, -11F, -20F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		turretModel[35].setRotationPoint(-2F, -21F, 0F);
		turretModel[35].rotateAngleY = 0.31415927F;
		turretModel[35].rotateAngleZ = -0.03490659F;

		turretModel[36].addShapeBox(9F, -11F, -20F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		turretModel[36].setRotationPoint(-2F, -21F, 0F);
		turretModel[36].rotateAngleY = 0.31415927F;
		turretModel[36].rotateAngleZ = -0.03490659F;

		turretModel[37].addShapeBox(8F, -9F, 19.5F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		turretModel[37].setRotationPoint(-2F, -21F, 0F);
		turretModel[37].rotateAngleX = 0.10471976F;
		turretModel[37].rotateAngleY = -0.31415927F;
		turretModel[37].rotateAngleZ = -0.03490659F;

		turretModel[38].addShapeBox(8F, -9.5F, 19.5F, 5, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 86
		turretModel[38].setRotationPoint(-2F, -21F, 0F);
		turretModel[38].rotateAngleX = 0.10471976F;
		turretModel[38].rotateAngleY = -0.31415927F;
		turretModel[38].rotateAngleZ = -0.03490659F;

		turretModel[39].addShapeBox(11F, -10F, 20F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		turretModel[39].setRotationPoint(-2F, -21F, 0F);
		turretModel[39].rotateAngleX = 0.10471976F;
		turretModel[39].rotateAngleY = -0.31415927F;
		turretModel[39].rotateAngleZ = -0.03490659F;

		turretModel[40].addShapeBox(4F, -9F, 20F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		turretModel[40].setRotationPoint(-2F, -21F, 0F);
		turretModel[40].rotateAngleX = 0.10471976F;
		turretModel[40].rotateAngleY = -0.31415927F;
		turretModel[40].rotateAngleZ = -0.06981317F;

		turretModel[41].addShapeBox(1F, -8.5F, 19.5F, 5, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 89
		turretModel[41].setRotationPoint(-2F, -21F, 0F);
		turretModel[41].rotateAngleX = 0.10471976F;
		turretModel[41].rotateAngleY = -0.31415927F;
		turretModel[41].rotateAngleZ = -0.06981317F;

		turretModel[42].addShapeBox(1F, -8F, 19.5F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		turretModel[42].setRotationPoint(-2F, -21F, 0F);
		turretModel[42].rotateAngleX = 0.10471976F;
		turretModel[42].rotateAngleY = -0.31415927F;
		turretModel[42].rotateAngleZ = -0.06981317F;

		turretModel[43].addShapeBox(7F, -8F, 18.5F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		turretModel[43].setRotationPoint(-2F, -21F, 0F);
		turretModel[43].rotateAngleX = -0.08726646F;
		turretModel[43].rotateAngleY = -0.31415927F;
		turretModel[43].rotateAngleZ = -0.03490659F;

		turretModel[44].addShapeBox(7F, -8.5F, 18.5F, 5, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 92
		turretModel[44].setRotationPoint(-2F, -21F, 0F);
		turretModel[44].rotateAngleX = -0.08726646F;
		turretModel[44].rotateAngleY = -0.31415927F;
		turretModel[44].rotateAngleZ = -0.03490659F;

		turretModel[45].addShapeBox(10F, -9F, 19F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		turretModel[45].setRotationPoint(-2F, -21F, 0F);
		turretModel[45].rotateAngleX = -0.08726646F;
		turretModel[45].rotateAngleY = -0.31415927F;
		turretModel[45].rotateAngleZ = -0.03490659F;

		turretModel[46].addShapeBox(0F, -7F, 18.5F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		turretModel[46].setRotationPoint(-2F, -21F, 0F);
		turretModel[46].rotateAngleX = -0.10471976F;
		turretModel[46].rotateAngleY = -0.31415927F;

		turretModel[47].addShapeBox(0F, -7.5F, 18.5F, 5, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 95
		turretModel[47].setRotationPoint(-2F, -21F, 0F);
		turretModel[47].rotateAngleX = -0.10471976F;
		turretModel[47].rotateAngleY = -0.31415927F;

		turretModel[48].addShapeBox(3F, -8F, 19F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		turretModel[48].setRotationPoint(-2F, -21F, 0F);
		turretModel[48].rotateAngleX = -0.10471976F;
		turretModel[48].rotateAngleY = -0.31415927F;

		turretModel[49].addBox(22F, -7F, 1F, 1, 1, 1, 0F); // Box 103
		turretModel[49].setRotationPoint(-2F, -21F, 0F);

		turretModel[50].addShapeBox(-25.5F, -12.5F, -9F, 5, 1, 18, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 104
		turretModel[50].setRotationPoint(0F, -21F, 0F);
		turretModel[50].rotateAngleZ = 0.06981317F;

		turretModel[51].addShapeBox(-25.5F, -12F, -9F, 6, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		turretModel[51].setRotationPoint(0F, -21F, 0F);
		turretModel[51].rotateAngleZ = 0.06981317F;

		turretModel[52].addShapeBox(-25F, -13F, -10F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		turretModel[52].setRotationPoint(0F, -21F, 12F);
		turretModel[52].rotateAngleZ = 0.06981317F;

		turretModel[53].addShapeBox(-25F, -13F, -16F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		turretModel[53].setRotationPoint(0F, -21F, 12F);
		turretModel[53].rotateAngleZ = 0.06981317F;

		turretModel[54].addShapeBox(-5F, -23F, -9F, 4, 2, 4, 0F,0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Box 326
		turretModel[54].setRotationPoint(0F, -20F, 0F);
		turretModel[54].rotateAngleX = -1.43116999F;
		turretModel[54].rotateAngleY = 0.36651914F;

		turretModel[55].addBox(-6.5F, -21F, -9F, 7, 1, 7, 0F); // Box 326
		turretModel[55].setRotationPoint(0F, -21F, 0F);
		turretModel[55].rotateAngleX = -1.43116999F;
		turretModel[55].rotateAngleY = 0.36651914F;

		turretModel[56].addBox(-14.5F, -21F, -9F, 7, 1, 7, 0F); // Box 326
		turretModel[56].setRotationPoint(0F, -21F, 0F);
		turretModel[56].rotateAngleX = -1.43116999F;
		turretModel[56].rotateAngleY = 0.36651914F;

		turretModel[57].addShapeBox(-13F, -23F, -9F, 4, 2, 4, 0F,0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Box 326
		turretModel[57].setRotationPoint(0F, -20F, 0F);
		turretModel[57].rotateAngleX = -1.43116999F;
		turretModel[57].rotateAngleY = 0.36651914F;

		turretModel[58].addShapeBox(-11.5F, -20F, -9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		turretModel[58].setRotationPoint(0F, -20F, 2F);
		turretModel[58].rotateAngleX = -1.43116999F;
		turretModel[58].rotateAngleY = 0.36651914F;

		turretModel[59].addShapeBox(-3.5F, -20F, -9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[59].setRotationPoint(0F, -20F, 2F);
		turretModel[59].rotateAngleX = -1.43116999F;
		turretModel[59].rotateAngleY = 0.36651914F;

		turretModel[60].addBox(20F, -7F, 0F, 5, 1, 1, 0F); // Box 0
		turretModel[60].setRotationPoint(-2F, -21F, 0F);


		barrelModel = new ModelRendererTurbo[4];
		barrelModel[0] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 34
		barrelModel[1] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 35
		barrelModel[2] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 36
		barrelModel[3] = new ModelRendererTurbo(this, 29, 14, textureX, textureY); // Box 37

		barrelModel[0].addBox(-2F, -1F, -1F, 27, 2, 2, 0F); // Box 34
		barrelModel[0].setRotationPoint(18F, -28F, -2F);

		barrelModel[1].addShapeBox(25F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 35
		barrelModel[1].setRotationPoint(18F, -28F, -2F);

		barrelModel[2].addShapeBox(27.5F, -1.5F, -1F, 2, 3, 2, 0F,0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F); // Box 36
		barrelModel[2].setRotationPoint(18F, -28F, -2F);

		barrelModel[3].addShapeBox(26.05F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F); // Box 37
		barrelModel[3].setRotationPoint(18F, -28F, -2F);


		leftTrackModel = new ModelRendererTurbo[13];
		leftTrackModel[0] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 294
		leftTrackModel[1] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 293
		leftTrackModel[2] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 291
		leftTrackModel[3] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 292
		leftTrackModel[4] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 299
		leftTrackModel[5] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 297
		leftTrackModel[6] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 298
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 296
		leftTrackModel[8] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 295
		leftTrackModel[9] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 146
		leftTrackModel[10] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 147
		leftTrackModel[11] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 148
		leftTrackModel[12] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 149

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		leftTrackModel[0].setRotationPoint(43F, 1.4F, 21F);
		leftTrackModel[0].rotateAngleZ = -2.47836754F;

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		leftTrackModel[1].setRotationPoint(46F, -6F, 21F);
		leftTrackModel[1].rotateAngleZ = -1.95476876F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		leftTrackModel[2].setRotationPoint(43.5F, -10.5F, 21F);
		leftTrackModel[2].rotateAngleZ = -1.04719755F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		leftTrackModel[3].setRotationPoint(-50F, -8F, 21F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		leftTrackModel[4].setRotationPoint(-64.7F, -7.7F, 21F);
		leftTrackModel[4].rotateAngleZ = -5.44542727F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		leftTrackModel[5].setRotationPoint(-64.7F, -0.7F, 21F);
		leftTrackModel[5].rotateAngleZ = -4.72984227F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		leftTrackModel[6].setRotationPoint(-60.2F, 4.7F, 21F);
		leftTrackModel[6].rotateAngleZ = -4.01425728F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 13, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		leftTrackModel[7].setRotationPoint(-48.4F, 10F, 21F);
		leftTrackModel[7].rotateAngleZ = -3.56047167F;

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 295
		leftTrackModel[8].setRotationPoint(31.5F, 10F, 21F);
		leftTrackModel[8].rotateAngleZ = -3.14159265F;

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		leftTrackModel[9].setRotationPoint(29.5F, -7.8F, 21F);
		leftTrackModel[9].rotateAngleZ = 0.45378561F;

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		leftTrackModel[10].setRotationPoint(35.5F, -10.8F, 21F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		leftTrackModel[11].setRotationPoint(-61.5F, -10.8F, 21F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		leftTrackModel[12].setRotationPoint(-55.5F, -10.8F, 21F);
		leftTrackModel[12].rotateAngleZ = -0.45378561F;


		rightTrackModel = new ModelRendererTurbo[13];
		rightTrackModel[0] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 161
		rightTrackModel[1] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 96
		rightTrackModel[2] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 97
		rightTrackModel[3] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 98
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 99
		rightTrackModel[5] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 100
		rightTrackModel[6] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 101
		rightTrackModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 102
		rightTrackModel[8] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 103
		rightTrackModel[9] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 104
		rightTrackModel[10] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 105
		rightTrackModel[11] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 106
		rightTrackModel[12] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 108

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 161
		rightTrackModel[0].setRotationPoint(-64F, -0.5F, -27F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		rightTrackModel[1].setRotationPoint(43F, 1.4F, -28F);
		rightTrackModel[1].rotateAngleZ = -2.47836754F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		rightTrackModel[2].setRotationPoint(46F, -6F, -28F);
		rightTrackModel[2].rotateAngleZ = -1.95476876F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		rightTrackModel[3].setRotationPoint(43.5F, -10.5F, -28F);
		rightTrackModel[3].rotateAngleZ = -1.04719755F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rightTrackModel[4].setRotationPoint(-50F, -8F, -28F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		rightTrackModel[5].setRotationPoint(-64.7F, -0.7F, -28F);
		rightTrackModel[5].rotateAngleZ = -4.72984227F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		rightTrackModel[6].setRotationPoint(-60.2F, 4.7F, -28F);
		rightTrackModel[6].rotateAngleZ = -4.01425728F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 13, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightTrackModel[7].setRotationPoint(-48.4F, 10F, -28F);
		rightTrackModel[7].rotateAngleZ = -3.56047167F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 103
		rightTrackModel[8].setRotationPoint(31.5F, 10F, -28F);
		rightTrackModel[8].rotateAngleZ = -3.14159265F;

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		rightTrackModel[9].setRotationPoint(29.5F, -7.8F, -28F);
		rightTrackModel[9].rotateAngleZ = 0.45378561F;

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightTrackModel[10].setRotationPoint(35.5F, -10.8F, -28F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		rightTrackModel[11].setRotationPoint(-61.5F, -10.8F, -28F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		rightTrackModel[12].setRotationPoint(-55.5F, -10.8F, -28F);
		rightTrackModel[12].rotateAngleZ = -0.45378561F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}