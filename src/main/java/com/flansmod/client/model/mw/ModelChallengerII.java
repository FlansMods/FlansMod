//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelChallengerII extends ModelVehicle
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelChallengerII()
	{
		bodyModel = new ModelRendererTurbo[185];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Body1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import Body2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import Body3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 23
		bodyModel[8] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Box 35
		bodyModel[20] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Box 38
		bodyModel[23] = new ModelRendererTurbo(this, 0, 475, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 0, 475, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Box 42
		bodyModel[27] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Box 64
		bodyModel[33] = new ModelRendererTurbo(this, 1, 561, textureX, textureY); // Box 65
		bodyModel[34] = new ModelRendererTurbo(this, 0, 585, textureX, textureY); // Box 66
		bodyModel[35] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 67
		bodyModel[36] = new ModelRendererTurbo(this, 0, 615, textureX, textureY); // Box 68
		bodyModel[37] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Box 69
		bodyModel[38] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Box 70
		bodyModel[39] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Box 71
		bodyModel[40] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Box 72
		bodyModel[41] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 73
		bodyModel[42] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 74
		bodyModel[43] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 75
		bodyModel[44] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 76
		bodyModel[45] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Box 77
		bodyModel[46] = new ModelRendererTurbo(this, 0, 585, textureX, textureY); // Box 78
		bodyModel[47] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Box 79
		bodyModel[48] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Box 80
		bodyModel[49] = new ModelRendererTurbo(this, 0, 615, textureX, textureY); // Box 81
		bodyModel[50] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Box 82
		bodyModel[51] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Box 83
		bodyModel[52] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Box 84
		bodyModel[53] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 85
		bodyModel[54] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 86
		bodyModel[55] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 87
		bodyModel[56] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 88
		bodyModel[57] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Box 89
		bodyModel[58] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Box 90
		bodyModel[59] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Box 91
		bodyModel[60] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Box 92
		bodyModel[61] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Box 93
		bodyModel[62] = new ModelRendererTurbo(this, 0, 716, textureX, textureY); // Box 94
		bodyModel[63] = new ModelRendererTurbo(this, 0, 765, textureX, textureY); // Box 95
		bodyModel[64] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Box 96
		bodyModel[65] = new ModelRendererTurbo(this, 0, 857, textureX, textureY); // Box 105
		bodyModel[66] = new ModelRendererTurbo(this, 0, 905, textureX, textureY); // Box 106
		bodyModel[67] = new ModelRendererTurbo(this, 0, 905, textureX, textureY); // Box 107
		bodyModel[68] = new ModelRendererTurbo(this, 0, 905, textureX, textureY); // Box 108
		bodyModel[69] = new ModelRendererTurbo(this, 0, 905, textureX, textureY); // Box 109
		bodyModel[70] = new ModelRendererTurbo(this, 0, 925, textureX, textureY); // Box 110
		bodyModel[71] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 112
		bodyModel[72] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 113
		bodyModel[73] = new ModelRendererTurbo(this, 0, 932, textureX, textureY); // Box 114
		bodyModel[74] = new ModelRendererTurbo(this, 0, 962, textureX, textureY); // Box 115
		bodyModel[75] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 116
		bodyModel[76] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 117
		bodyModel[77] = new ModelRendererTurbo(this, 0, 975, textureX, textureY); // Box 118
		bodyModel[78] = new ModelRendererTurbo(this, 0, 975, textureX, textureY); // Box 119
		bodyModel[79] = new ModelRendererTurbo(this, 0, 975, textureX, textureY); // Box 120
		bodyModel[80] = new ModelRendererTurbo(this, 0, 925, textureX, textureY); // Box 121
		bodyModel[81] = new ModelRendererTurbo(this, 0, 925, textureX, textureY); // Box 123
		bodyModel[82] = new ModelRendererTurbo(this, 0, 925, textureX, textureY); // Box 124
		bodyModel[83] = new ModelRendererTurbo(this, 0, 925, textureX, textureY); // Box 125
		bodyModel[84] = new ModelRendererTurbo(this, 0, 925, textureX, textureY); // Box 126
		bodyModel[85] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 129
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 130
		bodyModel[88] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 131
		bodyModel[89] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Box 132
		bodyModel[90] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Box 133
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Box 134
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Box 135
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 136
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 137
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 138
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 140
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 141
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 142
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 144
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 145
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 146
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 147
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 148
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 149
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 150
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 151
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 152
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 153
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 154
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 155
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 156
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 157
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 158
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 159
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 160
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 161
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 162
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 163
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 164
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 165
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 166
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 167
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 168
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 169
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 170
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 171
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 172
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 173
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 174
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 175
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 176
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 177
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 178
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Box 179
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Box 180
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 181
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1220, textureX, textureY); // Box 182
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 183
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1265, textureX, textureY); // Box 186
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1275, textureX, textureY); // Box 187
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Box 188
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1310, textureX, textureY); // Box 189
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 190
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1365, textureX, textureY); // Box 191
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1390, textureX, textureY); // Box 192
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 206
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 211
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 216
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 221
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 226
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 231
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1465, textureX, textureY); // Box 241
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1485, textureX, textureY); // Box 242
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1525, textureX, textureY); // Box 246
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 247
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1220, textureX, textureY); // Box 248
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1275, textureX, textureY); // Box 249
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1265, textureX, textureY); // Box 250
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Box 251
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1310, textureX, textureY); // Box 252
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 253
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1365, textureX, textureY); // Box 254
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1485, textureX, textureY); // Box 255
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1465, textureX, textureY); // Box 256
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 257
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 258
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 259
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 260
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 261
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 262
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1390, textureX, textureY); // Box 263
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1525, textureX, textureY); // Box 304
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Box 305
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Box 306
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1570, textureX, textureY); // Box 377
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1630, textureX, textureY); // Box 378
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1690, textureX, textureY); // Box 379
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Box 380
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Box 381
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1760, textureX, textureY); // Box 382
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1760, textureX, textureY); // Box 383
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Box 384
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Box 385
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1772, textureX, textureY); // Box 386

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 3, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body1
		bodyModel[0].setRotationPoint(37F, -21F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 3, 11, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body2
		bodyModel[1].setRotationPoint(37F, -18F, -18F);

		bodyModel[2].addBox(0F, 0F, 0F, 66, 9, 36, 0F); // Import Body3
		bodyModel[2].setRotationPoint(-29F, -21F, -18F);

		bodyModel[3].addBox(0F, 0F, 0F, 37, 12, 50, 0F); // Box 19
		bodyModel[3].setRotationPoint(-71F, -24F, -25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 12, 50, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[4].setRotationPoint(-34F, -24F, -25F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 1, 50, 0F); // Box 21
		bodyModel[5].setRotationPoint(-47F, -25F, -25F);

		bodyModel[6].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 22
		bodyModel[6].setRotationPoint(-59F, -25F, -25F);

		bodyModel[7].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 23
		bodyModel[7].setRotationPoint(-59F, -25F, -18F);

		bodyModel[8].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 24
		bodyModel[8].setRotationPoint(-59F, -25F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 25
		bodyModel[9].setRotationPoint(-59F, -25F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 1, 50, 0F); // Box 26
		bodyModel[10].setRotationPoint(-61F, -25F, -25F);

		bodyModel[11].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 27
		bodyModel[11].setRotationPoint(-59F, -25F, 23F);

		bodyModel[12].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 28
		bodyModel[12].setRotationPoint(-59F, -25F, 16F);

		bodyModel[13].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 29
		bodyModel[13].setRotationPoint(-59F, -25F, 8F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 46, 0F); // Box 30
		bodyModel[14].setRotationPoint(-49F, -24.5F, -23F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 46, 0F); // Box 31
		bodyModel[15].setRotationPoint(-51F, -24.5F, -23F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 46, 0F); // Box 32
		bodyModel[16].setRotationPoint(-53F, -24.5F, -23F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 46, 0F); // Box 33
		bodyModel[17].setRotationPoint(-55F, -24.5F, -23F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 46, 0F); // Box 34
		bodyModel[18].setRotationPoint(-57F, -24.5F, -23F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 46, 0F); // Box 35
		bodyModel[19].setRotationPoint(-59F, -24.5F, -23F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[20].setRotationPoint(-71F, -25F, -20F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[21].setRotationPoint(-71F, -25F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[22].setRotationPoint(-71F, -25F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[23].setRotationPoint(-71F, -25.5F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(-71F, -25.5F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[25].setRotationPoint(-71F, -25.5F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 42
		bodyModel[26].setRotationPoint(-63F, -25.5F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[27].setRotationPoint(-63F, -25.5F, -1.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 44
		bodyModel[28].setRotationPoint(-64F, -25.5F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[29].setRotationPoint(-65F, -25.5F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[30].setRotationPoint(-69F, -25.5F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[31].setRotationPoint(-69F, -25.5F, 2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 37, 11, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[32].setRotationPoint(-71F, -23F, -33F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 11, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[33].setRotationPoint(-34F, -23F, -33F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[34].setRotationPoint(-34F, -23F, -26F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 37, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[35].setRotationPoint(-71F, -23F, -26F);

		bodyModel[36].addBox(0F, 0F, 0F, 20, 1, 7, 0F); // Box 68
		bodyModel[36].setRotationPoint(-61F, -24F, -33F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 69
		bodyModel[37].setRotationPoint(-49F, -24F, -26.5F);
		bodyModel[37].rotateAngleX = 3.14159265F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 70
		bodyModel[38].setRotationPoint(-61F, -25F, -32.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,-9.9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[39].setRotationPoint(-61F, -24F, -30F);
		bodyModel[39].rotateAngleX = 3.14159265F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,-10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[40].setRotationPoint(-61F, -25F, -29F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[41].setRotationPoint(-65F, -24F, -31F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 74
		bodyModel[42].setRotationPoint(-66F, -24F, -31F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[43].setRotationPoint(-67F, -24F, -31F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 37, 11, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[44].setRotationPoint(-71F, -23F, 25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 37, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 77
		bodyModel[45].setRotationPoint(-71F, -23F, 26F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[46].setRotationPoint(-34F, -23F, 25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 11, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[47].setRotationPoint(-34F, -23F, 26F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,-9.9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[48].setRotationPoint(-61F, -24F, 29F);
		bodyModel[48].rotateAngleX = 3.14159265F;

		bodyModel[49].addBox(0F, 0F, 0F, 20, 1, 7, 0F); // Box 81
		bodyModel[49].setRotationPoint(-61F, -24F, 26F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 82
		bodyModel[50].setRotationPoint(-49F, -24F, 32.5F);
		bodyModel[50].rotateAngleX = 3.14159265F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,-10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[51].setRotationPoint(-61F, -25F, 30F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 84
		bodyModel[52].setRotationPoint(-61F, -25F, 26.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[53].setRotationPoint(-67F, -24F, 28F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[54].setRotationPoint(-65F, -24F, 28F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 87
		bodyModel[55].setRotationPoint(-66F, -24F, 28F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 7, 34, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[56].setRotationPoint(61F, -14F, -17F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[57].setRotationPoint(61F, -15F, -18F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[58].setRotationPoint(61F, -15F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[59].setRotationPoint(61F, -15F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[60].setRotationPoint(61F, -15F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[61].setRotationPoint(61F, -15F, 17F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 8, 36, 0F); // Box 94
		bodyModel[62].setRotationPoint(60F, -15F, -18F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 3, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 95
		bodyModel[63].setRotationPoint(58F, -15F, -18F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 36, 0F); // Box 96
		bodyModel[64].setRotationPoint(68F, -8F, -18F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 9, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[65].setRotationPoint(60F, -7F, -18F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 106
		bodyModel[66].setRotationPoint(68.5F, -7F, -16F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 107
		bodyModel[67].setRotationPoint(68.5F, -7F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 108
		bodyModel[68].setRotationPoint(68.5F, -7F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 109
		bodyModel[69].setRotationPoint(68.5F, -7F, 1F);

		bodyModel[70].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 110
		bodyModel[70].setRotationPoint(54F, -17F, -13F);
		bodyModel[70].rotateAngleX = 0.01745329F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 17, 3, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[71].setRotationPoint(37F, -21F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 23, 3, 11, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[72].setRotationPoint(37F, -18F, 7F);

		bodyModel[73].addShapeBox(0F, 1F, 0F, 21, 11, 14, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[73].setRotationPoint(37F, -18F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 115
		bodyModel[74].setRotationPoint(37F, -20.5F, -2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[75].setRotationPoint(37F, -20.5F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[76].setRotationPoint(37F, -20.5F, 2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[77].setRotationPoint(45F, -17.5F, -6F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 119
		bodyModel[78].setRotationPoint(47F, -17.5F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[79].setRotationPoint(49F, -17.5F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[80].setRotationPoint(54F, -18F, -13F);
		bodyModel[80].rotateAngleX = 0.01745329F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[81].setRotationPoint(54F, -16F, -13F);
		bodyModel[81].rotateAngleX = 0.01745329F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[82].setRotationPoint(54F, -16F, 10F);
		bodyModel[82].rotateAngleX = 0.01745329F;

		bodyModel[83].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 125
		bodyModel[83].setRotationPoint(54F, -17F, 10F);
		bodyModel[83].rotateAngleX = 0.01745329F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[84].setRotationPoint(54F, -18F, 10F);
		bodyModel[84].rotateAngleX = 0.01745329F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 23, 3, 16, 0F,0F, 3F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[85].setRotationPoint(37F, -18F, 18F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 66, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[86].setRotationPoint(-29F, -21F, 18F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 66, 6, 16, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[87].setRotationPoint(-29F, -21F, -34F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 23, 3, 16, 0F,0F, -2.9F, 0F, -0.2F, -2.9F, 0F, -6F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[88].setRotationPoint(37F, -18F, -34F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 11, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 132
		bodyModel[89].setRotationPoint(60F, -15F, 18F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 10, 15, 0F,0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 133
		bodyModel[90].setRotationPoint(68F, -14F, 18F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 10, 15, 0F,0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[91].setRotationPoint(60F, -15F, -33F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 9, 15, 0F,0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 135
		bodyModel[92].setRotationPoint(68F, -14F, -33F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[93].setRotationPoint(59F, -17F, 18F);
		bodyModel[93].rotateAngleX = 0.01745329F;

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 137
		bodyModel[94].setRotationPoint(59F, -16F, 18F);
		bodyModel[94].rotateAngleX = 0.01745329F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 138
		bodyModel[95].setRotationPoint(59F, -15F, 18F);
		bodyModel[95].rotateAngleX = 0.01745329F;

		bodyModel[96].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 140
		bodyModel[96].setRotationPoint(59F, -16F, -25F);
		bodyModel[96].rotateAngleX = 0.01745329F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 141
		bodyModel[97].setRotationPoint(59F, -15F, -25F);
		bodyModel[97].rotateAngleX = 0.01745329F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[98].setRotationPoint(59F, -17F, -25F);
		bodyModel[98].rotateAngleX = 0.01745329F;

		bodyModel[99].addShapeBox(0F, -0.5F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[99].setRotationPoint(29F, -19.5F, 22F);
		bodyModel[99].rotateAngleX = -0.38397244F;

		bodyModel[100].addBox(0F, -0.5F, 0F, 2, 2, 6, 0F); // Box 145
		bodyModel[100].setRotationPoint(31F, -19.5F, 22F);
		bodyModel[100].rotateAngleX = -0.38397244F;

		bodyModel[101].addShapeBox(0F, -0.5F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[101].setRotationPoint(33F, -19.5F, 22F);
		bodyModel[101].rotateAngleX = -0.38397244F;

		bodyModel[102].addShapeBox(0F, -0.5F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[102].setRotationPoint(20F, -19.5F, 22F);
		bodyModel[102].rotateAngleX = -0.38397244F;

		bodyModel[103].addShapeBox(0F, -0.5F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[103].setRotationPoint(16F, -19.5F, 22F);
		bodyModel[103].rotateAngleX = -0.38397244F;

		bodyModel[104].addBox(0F, -0.5F, 0F, 2, 2, 6, 0F); // Box 149
		bodyModel[104].setRotationPoint(18F, -19.5F, 22F);
		bodyModel[104].rotateAngleX = -0.38397244F;

		bodyModel[105].addShapeBox(0F, -0.5F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[105].setRotationPoint(12F, -19.5F, 22F);
		bodyModel[105].rotateAngleX = -0.38397244F;

		bodyModel[106].addShapeBox(0F, -0.5F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[106].setRotationPoint(8F, -19.5F, 22F);
		bodyModel[106].rotateAngleX = -0.38397244F;

		bodyModel[107].addBox(0F, -0.5F, 0F, 2, 2, 6, 0F); // Box 152
		bodyModel[107].setRotationPoint(10F, -19.5F, 22F);
		bodyModel[107].rotateAngleX = -0.38397244F;

		bodyModel[108].addShapeBox(0F, -0.5F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[108].setRotationPoint(-12F, -19.5F, 22F);
		bodyModel[108].rotateAngleX = -0.38397244F;

		bodyModel[109].addShapeBox(0F, -0.5F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[109].setRotationPoint(-16F, -19.5F, 22F);
		bodyModel[109].rotateAngleX = -0.38397244F;

		bodyModel[110].addBox(0F, -0.5F, 0F, 2, 2, 6, 0F); // Box 155
		bodyModel[110].setRotationPoint(-14F, -19.5F, 22F);
		bodyModel[110].rotateAngleX = -0.38397244F;

		bodyModel[111].addShapeBox(0F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[111].setRotationPoint(-16F, -16.5F, -28F);
		bodyModel[111].rotateAngleX = 0.38397244F;

		bodyModel[112].addBox(0F, -1F, 0F, 2, 2, 6, 0F); // Box 157
		bodyModel[112].setRotationPoint(-14F, -16.5F, -28F);
		bodyModel[112].rotateAngleX = 0.38397244F;

		bodyModel[113].addShapeBox(0F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[113].setRotationPoint(-12F, -16.5F, -28F);
		bodyModel[113].rotateAngleX = 0.38397244F;

		bodyModel[114].addShapeBox(0F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[114].setRotationPoint(8F, -16.5F, -28F);
		bodyModel[114].rotateAngleX = 0.38397244F;

		bodyModel[115].addBox(0F, -1F, 0F, 2, 2, 6, 0F); // Box 160
		bodyModel[115].setRotationPoint(10F, -16.5F, -28F);
		bodyModel[115].rotateAngleX = 0.38397244F;

		bodyModel[116].addShapeBox(0F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[116].setRotationPoint(12F, -16.5F, -28F);
		bodyModel[116].rotateAngleX = 0.38397244F;

		bodyModel[117].addShapeBox(0F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[117].setRotationPoint(16F, -16.5F, -28F);
		bodyModel[117].rotateAngleX = 0.38397244F;

		bodyModel[118].addBox(0F, -1F, 0F, 2, 2, 6, 0F); // Box 163
		bodyModel[118].setRotationPoint(18F, -16.5F, -28F);
		bodyModel[118].rotateAngleX = 0.38397244F;

		bodyModel[119].addShapeBox(0F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[119].setRotationPoint(20F, -16.5F, -28F);
		bodyModel[119].rotateAngleX = 0.38397244F;

		bodyModel[120].addShapeBox(0F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[120].setRotationPoint(33F, -16.5F, -28F);
		bodyModel[120].rotateAngleX = 0.38397244F;

		bodyModel[121].addBox(0F, -1F, 0F, 2, 2, 6, 0F); // Box 166
		bodyModel[121].setRotationPoint(31F, -16.5F, -28F);
		bodyModel[121].rotateAngleX = 0.38397244F;

		bodyModel[122].addShapeBox(0F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[122].setRotationPoint(29F, -16.5F, -28F);
		bodyModel[122].rotateAngleX = 0.38397244F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 3, 17, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[123].setRotationPoint(-80F, -24F, -24F);

		bodyModel[124].addBox(0F, 0F, 0F, 9, 3, 17, 0F); // Box 169
		bodyModel[124].setRotationPoint(-80F, -21F, -24F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 170
		bodyModel[125].setRotationPoint(-80F, -18F, -24F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 171
		bodyModel[126].setRotationPoint(-74F, -24F, -23F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 172
		bodyModel[127].setRotationPoint(-74F, -24F, -12F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 173
		bodyModel[128].setRotationPoint(-74F, -24F, 8F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 174
		bodyModel[129].setRotationPoint(-74F, -24F, 19F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 3, 17, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[130].setRotationPoint(-80F, -24F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 9, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 176
		bodyModel[131].setRotationPoint(-80F, -18F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 9, 3, 17, 0F); // Box 177
		bodyModel[132].setRotationPoint(-80F, -21F, 7F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 14, 15, 0F); // Box 178
		bodyModel[133].setRotationPoint(-68F, -12F, -33F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 14, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[134].setRotationPoint(-67F, -12F, -33F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 14, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[135].setRotationPoint(-67F, -12F, 18F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 14, 15, 0F); // Box 181
		bodyModel[136].setRotationPoint(-68F, -12F, 18F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 30, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[137].setRotationPoint(-69F, -23F, 35F);

		bodyModel[138].addBox(0F, 0F, 0F, 30, 7, 2, 0F); // Box 183
		bodyModel[138].setRotationPoint(-69F, -23F, 33F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 37, 4, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[139].setRotationPoint(-64F, -18F, 34.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 187
		bodyModel[140].setRotationPoint(-66F, -18F, 34.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 35, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 188
		bodyModel[141].setRotationPoint(-46F, -14F, 33.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 54, 20, 3, 0F); // Box 189
		bodyModel[142].setRotationPoint(-11F, -14F, 33.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 11, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[143].setRotationPoint(43F, -14F, 33.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 13, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[144].setRotationPoint(54F, -14F, 33.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 19, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[145].setRotationPoint(-27F, -16F, 34.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[146].setRotationPoint(-8F, -16F, 34.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[147].setRotationPoint(0F, -16F, 34.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[148].setRotationPoint(8F, -16F, 34.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[149].setRotationPoint(16F, -16F, 34.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[150].setRotationPoint(24F, -16F, 34.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[151].setRotationPoint(32F, -16F, 34.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 10, 12, 3, 0F); // Box 241
		bodyModel[152].setRotationPoint(40F, -12F, 34.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 11, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[153].setRotationPoint(50F, -12F, 34.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 89, 3, 16, 0F); // Box 246
		bodyModel[154].setRotationPoint(-29F, -15F, 18F);

		bodyModel[155].addBox(0F, 0F, 0F, 30, 7, 2, 0F); // Box 247
		bodyModel[155].setRotationPoint(-69F, -23F, -35F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 30, 7, 3, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[156].setRotationPoint(-69F, -23F, -38F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 249
		bodyModel[157].setRotationPoint(-66F, -18F, -36.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 37, 4, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[158].setRotationPoint(-64F, -18F, -36.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 35, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 251
		bodyModel[159].setRotationPoint(-46F, -14F, -36.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 54, 20, 3, 0F); // Box 252
		bodyModel[160].setRotationPoint(-11F, -14F, -36.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 11, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[161].setRotationPoint(43F, -14F, -36.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 13, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[162].setRotationPoint(54F, -14F, -36.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 11, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[163].setRotationPoint(50F, -12F, -37.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 10, 12, 3, 0F); // Box 256
		bodyModel[164].setRotationPoint(40F, -12F, -37.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 257
		bodyModel[165].setRotationPoint(32F, -16F, -37.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 258
		bodyModel[166].setRotationPoint(24F, -16F, -37.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 259
		bodyModel[167].setRotationPoint(16F, -16F, -37.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 260
		bodyModel[168].setRotationPoint(8F, -16F, -37.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 261
		bodyModel[169].setRotationPoint(0F, -16F, -37.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 262
		bodyModel[170].setRotationPoint(-8F, -16F, -37.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 19, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 263
		bodyModel[171].setRotationPoint(-27F, -16F, -37.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 89, 3, 16, 0F); // Box 304
		bodyModel[172].setRotationPoint(-29F, -15F, -34F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F); // Box 305
		bodyModel[173].setRotationPoint(-45F, -14F, 36.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F); // Box 306
		bodyModel[174].setRotationPoint(-45F, -14F, -37.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 113, 14, 42, 0F); // Box 377
		bodyModel[175].setRotationPoint(-58F, -12F, -21F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 14, 42, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 378
		bodyModel[176].setRotationPoint(55F, -12F, -21F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 5, 14, 42, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 379
		bodyModel[177].setRotationPoint(-63F, -12F, -21F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 380
		bodyModel[178].setRotationPoint(-64F, -12F, -17F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 381
		bodyModel[179].setRotationPoint(-64F, -12F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 382
		bodyModel[180].setRotationPoint(-64F, -8F, -17F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 383
		bodyModel[181].setRotationPoint(-64F, -8F, 9F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 384
		bodyModel[182].setRotationPoint(-64F, -12F, 15F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 385
		bodyModel[183].setRotationPoint(-64F, -12F, 9F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 386
		bodyModel[184].setRotationPoint(-64F, -10F, -4F);


		turretModel = new ModelRendererTurbo[82];
		turretModel[0] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Box 387
		turretModel[1] = new ModelRendererTurbo(this, 300, 125, textureX, textureY); // Box 388
		turretModel[2] = new ModelRendererTurbo(this, 300, 166, textureX, textureY); // Box 389
		turretModel[3] = new ModelRendererTurbo(this, 300, 210, textureX, textureY); // Box 390
		turretModel[4] = new ModelRendererTurbo(this, 300, 285, textureX, textureY); // Box 391
		turretModel[5] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // Box 392
		turretModel[6] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // Box 399
		turretModel[7] = new ModelRendererTurbo(this, 300, 395, textureX, textureY); // Box 406
		turretModel[8] = new ModelRendererTurbo(this, 300, 455, textureX, textureY); // Box 407
		turretModel[9] = new ModelRendererTurbo(this, 300, 475, textureX, textureY); // Box 408
		turretModel[10] = new ModelRendererTurbo(this, 300, 495, textureX, textureY); // Box 409
		turretModel[11] = new ModelRendererTurbo(this, 300, 520, textureX, textureY); // Box 410
		turretModel[12] = new ModelRendererTurbo(this, 300, 520, textureX, textureY); // Box 411
		turretModel[13] = new ModelRendererTurbo(this, 300, 520, textureX, textureY); // Box 412
		turretModel[14] = new ModelRendererTurbo(this, 300, 530, textureX, textureY); // Box 413
		turretModel[15] = new ModelRendererTurbo(this, 300, 540, textureX, textureY); // Box 414
		turretModel[16] = new ModelRendererTurbo(this, 300, 565, textureX, textureY); // Box 415
		turretModel[17] = new ModelRendererTurbo(this, 300, 575, textureX, textureY); // Box 416
		turretModel[18] = new ModelRendererTurbo(this, 300, 590, textureX, textureY); // Box 417
		turretModel[19] = new ModelRendererTurbo(this, 300, 600, textureX, textureY); // Box 418
		turretModel[20] = new ModelRendererTurbo(this, 300, 610, textureX, textureY); // Box 419
		turretModel[21] = new ModelRendererTurbo(this, 300, 685, textureX, textureY); // Box 420
		turretModel[22] = new ModelRendererTurbo(this, 300, 745, textureX, textureY); // Box 421
		turretModel[23] = new ModelRendererTurbo(this, 300, 820, textureX, textureY); // Box 422
		turretModel[24] = new ModelRendererTurbo(this, 300, 890, textureX, textureY); // Box 423
		turretModel[25] = new ModelRendererTurbo(this, 300, 950, textureX, textureY); // Box 424
		turretModel[26] = new ModelRendererTurbo(this, 300, 1020, textureX, textureY); // Box 425
		turretModel[27] = new ModelRendererTurbo(this, 300, 1047, textureX, textureY); // Box 426
		turretModel[28] = new ModelRendererTurbo(this, 300, 1047, textureX, textureY); // Box 427
		turretModel[29] = new ModelRendererTurbo(this, 300, 1065, textureX, textureY); // Box 428
		turretModel[30] = new ModelRendererTurbo(this, 300, 1065, textureX, textureY); // Box 429
		turretModel[31] = new ModelRendererTurbo(this, 300, 1075, textureX, textureY); // Box 430
		turretModel[32] = new ModelRendererTurbo(this, 300, 1075, textureX, textureY); // Box 431
		turretModel[33] = new ModelRendererTurbo(this, 300, 1075, textureX, textureY); // Box 432
		turretModel[34] = new ModelRendererTurbo(this, 300, 1095, textureX, textureY); // Box 433
		turretModel[35] = new ModelRendererTurbo(this, 300, 1095, textureX, textureY); // Box 434
		turretModel[36] = new ModelRendererTurbo(this, 300, 1020, textureX, textureY); // Box 435
		turretModel[37] = new ModelRendererTurbo(this, 300, 1047, textureX, textureY); // Box 436
		turretModel[38] = new ModelRendererTurbo(this, 300, 1065, textureX, textureY); // Box 437
		turretModel[39] = new ModelRendererTurbo(this, 300, 1047, textureX, textureY); // Box 438
		turretModel[40] = new ModelRendererTurbo(this, 300, 1065, textureX, textureY); // Box 439
		turretModel[41] = new ModelRendererTurbo(this, 300, 1075, textureX, textureY); // Box 440
		turretModel[42] = new ModelRendererTurbo(this, 300, 1075, textureX, textureY); // Box 441
		turretModel[43] = new ModelRendererTurbo(this, 300, 1075, textureX, textureY); // Box 442
		turretModel[44] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 443
		turretModel[45] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 444
		turretModel[46] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 445
		turretModel[47] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 446
		turretModel[48] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 447
		turretModel[49] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 448
		turretModel[50] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 449
		turretModel[51] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 450
		turretModel[52] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 451
		turretModel[53] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 452
		turretModel[54] = new ModelRendererTurbo(this, 300, 1130, textureX, textureY); // Box 453
		turretModel[55] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 454
		turretModel[56] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 455
		turretModel[57] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 456
		turretModel[58] = new ModelRendererTurbo(this, 300, 1135, textureX, textureY); // Box 457
		turretModel[59] = new ModelRendererTurbo(this, 300, 1135, textureX, textureY); // Box 458
		turretModel[60] = new ModelRendererTurbo(this, 300, 1135, textureX, textureY); // Box 459
		turretModel[61] = new ModelRendererTurbo(this, 300, 1145, textureX, textureY); // Box 460
		turretModel[62] = new ModelRendererTurbo(this, 300, 1160, textureX, textureY); // Box 461
		turretModel[63] = new ModelRendererTurbo(this, 300, 1175, textureX, textureY); // Box 462
		turretModel[64] = new ModelRendererTurbo(this, 300, 1200, textureX, textureY); // Box 15
		turretModel[65] = new ModelRendererTurbo(this, 300, 1215, textureX, textureY); // Box 16
		turretModel[66] = new ModelRendererTurbo(this, 300, 1215, textureX, textureY); // Box 17
		turretModel[67] = new ModelRendererTurbo(this, 300, 1220, textureX, textureY); // Box 18
		turretModel[68] = new ModelRendererTurbo(this, 300, 1220, textureX, textureY); // Box 19
		turretModel[69] = new ModelRendererTurbo(this, 300, 1235, textureX, textureY); // Box 20
		turretModel[70] = new ModelRendererTurbo(this, 300, 1235, textureX, textureY); // Box 21
		turretModel[71] = new ModelRendererTurbo(this, 300, 1235, textureX, textureY); // Box 22
		turretModel[72] = new ModelRendererTurbo(this, 300, 1235, textureX, textureY); // Box 23
		turretModel[73] = new ModelRendererTurbo(this, 300, 1200, textureX, textureY); // Box 24
		turretModel[74] = new ModelRendererTurbo(this, 300, 1215, textureX, textureY); // Box 25
		turretModel[75] = new ModelRendererTurbo(this, 300, 1215, textureX, textureY); // Box 26
		turretModel[76] = new ModelRendererTurbo(this, 300, 1220, textureX, textureY); // Box 27
		turretModel[77] = new ModelRendererTurbo(this, 300, 1220, textureX, textureY); // Box 28
		turretModel[78] = new ModelRendererTurbo(this, 300, 1235, textureX, textureY); // Box 29
		turretModel[79] = new ModelRendererTurbo(this, 300, 1235, textureX, textureY); // Box 30
		turretModel[80] = new ModelRendererTurbo(this, 300, 1235, textureX, textureY); // Box 31
		turretModel[81] = new ModelRendererTurbo(this, 300, 1235, textureX, textureY); // Box 32

		turretModel[0].addBox(0F, 0F, 0F, 17, 1, 36, 0F); // Box 387
		turretModel[0].setRotationPoint(-13.5F, -22F, -18F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 388
		turretModel[1].setRotationPoint(3.5F, -22F, -18F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 36, 0F,0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 389
		turretModel[2].setRotationPoint(-29.5F, -22F, -18F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 20, 14, 54, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		turretModel[3].setRotationPoint(-11F, -36F, -27F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 13, 14, 54, 0F,0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		turretModel[4].setRotationPoint(9F, -36F, -27F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 22, 11, 20, 0F,0F, 0F, -2F, -21F, 0F, -2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		turretModel[5].setRotationPoint(22F, -33F, -27F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 22, 11, 20, 0F,0F, 0F, 0F, -10F, 0F, 0F, -21F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 399
		turretModel[6].setRotationPoint(22F, -33F, 7F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 20, 3, 50, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		turretModel[7].setRotationPoint(-11F, -39F, -25F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 10, 3, 11, 0F,0F, -1.8F, 0F, 0F, -5F, -8F, 0F, -5F, 0F, 0F, -1.8F, 0F, 0F, 1.15F, 0F, 0F, 3F, -8F, 0F, 3F, 0F, 0F, 1.15F, 0F); // Box 407
		turretModel[8].setRotationPoint(14F, -39F, -3F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F); // Box 408
		turretModel[9].setRotationPoint(9F, -39F, -3F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 17, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F); // Box 409
		turretModel[10].setRotationPoint(9F, -39F, 8F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		turretModel[11].setRotationPoint(15F, -35F, 11F);

		turretModel[12].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 411
		turretModel[12].setRotationPoint(16F, -35F, 11F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		turretModel[13].setRotationPoint(17F, -35F, 11F);

		turretModel[14].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 413
		turretModel[14].setRotationPoint(16F, -36F, 11.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 13, 3, 17, 0F,0F, 0F, -5F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 414
		turretModel[15].setRotationPoint(9F, -39F, -25F);

		turretModel[16].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 415
		turretModel[16].setRotationPoint(9F, -38F, -7F);

		turretModel[17].addBox(0F, 0F, 0F, 9, 3, 7, 0F); // Box 416
		turretModel[17].setRotationPoint(9F, -38F, -16F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		turretModel[18].setRotationPoint(18F, -38F, -12F);

		turretModel[19].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 418
		turretModel[19].setRotationPoint(18F, -38F, -16F);
		turretModel[19].rotateAngleZ = -0.01745329F;

		turretModel[20].addShapeBox(0F, 0F, 0F, 19, 14, 54, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 419
		turretModel[20].setRotationPoint(-30F, -36F, -27F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 19, 3, 50, 0F,0F, -2F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		turretModel[21].setRotationPoint(-30F, -39F, -25F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 4, 13, 54, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 421
		turretModel[22].setRotationPoint(-34F, -36F, -27F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 6, 11, 54, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		turretModel[23].setRotationPoint(-40F, -36F, -27F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 50, 0F,0F, -0.9F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, -9F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		turretModel[24].setRotationPoint(-40F, -37F, -25F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 7, 11, 54, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 424
		turretModel[25].setRotationPoint(-47F, -36F, -27F);

		turretModel[26].addBox(0F, 0F, 0F, 1, 8, 14, 0F); // Box 425
		turretModel[26].setRotationPoint(-48F, -34F, -25F);

		turretModel[27].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 426
		turretModel[27].setRotationPoint(-49F, -34F, -25F);

		turretModel[28].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 427
		turretModel[28].setRotationPoint(-49F, -27F, -25F);

		turretModel[29].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 428
		turretModel[29].setRotationPoint(-49F, -33F, -25F);

		turretModel[30].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 429
		turretModel[30].setRotationPoint(-49F, -33F, -12F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		turretModel[31].setRotationPoint(-49F, -32F, -24F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		turretModel[32].setRotationPoint(-49F, -30F, -24F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		turretModel[33].setRotationPoint(-49F, -28F, -24F);

		turretModel[34].addBox(0F, 0F, 0F, 2, 6, 12, 0F); // Box 433
		turretModel[34].setRotationPoint(-47F, -33F, -24F);

		turretModel[35].addBox(0F, 0F, 0F, 2, 6, 12, 0F); // Box 434
		turretModel[35].setRotationPoint(-47F, -33F, 12F);

		turretModel[36].addBox(0F, 0F, 0F, 1, 8, 14, 0F); // Box 435
		turretModel[36].setRotationPoint(-48F, -34F, 11F);

		turretModel[37].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 436
		turretModel[37].setRotationPoint(-49F, -34F, 11F);

		turretModel[38].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 437
		turretModel[38].setRotationPoint(-49F, -33F, 11F);

		turretModel[39].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 438
		turretModel[39].setRotationPoint(-49F, -27F, 11F);

		turretModel[40].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 439
		turretModel[40].setRotationPoint(-49F, -33F, 24F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		turretModel[41].setRotationPoint(-49F, -28F, 12F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		turretModel[42].setRotationPoint(-49F, -30F, 12F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		turretModel[43].setRotationPoint(-49F, -32F, 12F);

		turretModel[44].addBox(0F, 0F, 0F, 18, 2, 6, 0F); // Box 443
		turretModel[44].setRotationPoint(-13F, -40F, -12F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 444
		turretModel[45].setRotationPoint(-13F, -40F, -6F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		turretModel[46].setRotationPoint(-13F, -40F, -18F);

		turretModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 446
		turretModel[47].setRotationPoint(-13F, -41F, -7F);

		turretModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 447
		turretModel[48].setRotationPoint(-13F, -41F, -12F);

		turretModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 448
		turretModel[49].setRotationPoint(4F, -41F, -12F);

		turretModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 449
		turretModel[50].setRotationPoint(4F, -41F, -7F);

		turretModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 450
		turretModel[51].setRotationPoint(-2F, -41F, -1F);

		turretModel[52].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 451
		turretModel[52].setRotationPoint(-7F, -41F, -1F);

		turretModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 452
		turretModel[53].setRotationPoint(-7F, -41F, -18F);

		turretModel[54].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 453
		turretModel[54].setRotationPoint(-2F, -41F, -18F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 454
		turretModel[55].setRotationPoint(-13F, -42F, -6F);

		turretModel[56].addBox(0F, 0F, 0F, 18, 1, 6, 0F); // Box 455
		turretModel[56].setRotationPoint(-13F, -42F, -12F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		turretModel[57].setRotationPoint(-13F, -42F, -18F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 457
		turretModel[58].setRotationPoint(-5F, -40F, 15F);

		turretModel[59].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 458
		turretModel[59].setRotationPoint(-5F, -40F, 12F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		turretModel[60].setRotationPoint(-5F, -40F, 9F);

		turretModel[61].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 460
		turretModel[61].setRotationPoint(-1F, -44F, -17F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		turretModel[62].setRotationPoint(-3F, -44F, -17F);

		turretModel[63].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 462
		turretModel[63].setRotationPoint(6F, -43F, -16F);

		turretModel[64].addBox(0F, 0F, 0F, 15, 11, 1, 0F); // Box 15
		turretModel[64].setRotationPoint(-7.5F, -34F, 24.5F);
		turretModel[64].rotateAngleX = 0.13962634F;

		turretModel[65].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 16
		turretModel[65].setRotationPoint(-7.5F, -34F, 25.5F);
		turretModel[65].rotateAngleX = 0.13962634F;

		turretModel[66].addShapeBox(0F, 10F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		turretModel[66].setRotationPoint(-7.5F, -34F, 25.5F);
		turretModel[66].rotateAngleX = 0.13962634F;

		turretModel[67].addShapeBox(0F, 1F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 18
		turretModel[67].setRotationPoint(-7.5F, -34F, 25.5F);
		turretModel[67].rotateAngleX = 0.13962634F;

		turretModel[68].addShapeBox(14F, 1F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		turretModel[68].setRotationPoint(-7.5F, -34F, 25.5F);
		turretModel[68].rotateAngleX = 0.13962634F;

		turretModel[69].addShapeBox(1F, 2F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 20
		turretModel[69].setRotationPoint(-7.5F, -34F, 25.5F);
		turretModel[69].rotateAngleX = 0.13962634F;

		turretModel[70].addShapeBox(1F, 4F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 21
		turretModel[70].setRotationPoint(-7.5F, -34F, 25.5F);
		turretModel[70].rotateAngleX = 0.13962634F;

		turretModel[71].addShapeBox(1F, 6F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		turretModel[71].setRotationPoint(-7.5F, -34F, 25.5F);
		turretModel[71].rotateAngleX = 0.13962634F;

		turretModel[72].addShapeBox(1F, 8F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		turretModel[72].setRotationPoint(-7.5F, -34F, 25.5F);
		turretModel[72].rotateAngleX = 0.13962634F;

		turretModel[73].addBox(0F, 0F, 0F, 15, 11, 1, 0F); // Box 24
		turretModel[73].setRotationPoint(-7.5F, -34F, -25.5F);
		turretModel[73].rotateAngleX = -0.13962634F;

		turretModel[74].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[74].setRotationPoint(-7.5F, -34F, -26.5F);
		turretModel[74].rotateAngleX = -0.13962634F;

		turretModel[75].addShapeBox(0F, 10F, 0F, 15, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[75].setRotationPoint(-7.5F, -34F, -26.5F);
		turretModel[75].rotateAngleX = -0.13962634F;

		turretModel[76].addShapeBox(14F, 1F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		turretModel[76].setRotationPoint(-7.5F, -34F, -26.5F);
		turretModel[76].rotateAngleX = -0.13962634F;

		turretModel[77].addShapeBox(0F, 1F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[77].setRotationPoint(-7.5F, -34F, -26.5F);
		turretModel[77].rotateAngleX = -0.13962634F;

		turretModel[78].addShapeBox(1F, 8F, 0F, 13, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[78].setRotationPoint(-7.5F, -34F, -26.5F);
		turretModel[78].rotateAngleX = -0.13962634F;

		turretModel[79].addShapeBox(1F, 6F, 0F, 13, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[79].setRotationPoint(-7.5F, -34F, -26.5F);
		turretModel[79].rotateAngleX = -0.13962634F;

		turretModel[80].addShapeBox(1F, 4F, 0F, 13, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[80].setRotationPoint(-7.5F, -34F, -26.5F);
		turretModel[80].rotateAngleX = -0.13962634F;

		turretModel[81].addShapeBox(1F, 2F, 0F, 13, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[81].setRotationPoint(-7.5F, -34F, -26.5F);
		turretModel[81].rotateAngleX = -0.13962634F;


		barrelModel = new ModelRendererTurbo[39];
		barrelModel[0] = new ModelRendererTurbo(this, 300, 1240, textureX, textureY); // Box 14
		barrelModel[1] = new ModelRendererTurbo(this, 300, 1270, textureX, textureY); // Box 33
		barrelModel[2] = new ModelRendererTurbo(this, 300, 1290, textureX, textureY); // Box 34
		barrelModel[3] = new ModelRendererTurbo(this, 300, 1305, textureX, textureY); // Box 35
		barrelModel[4] = new ModelRendererTurbo(this, 300, 1320, textureX, textureY); // Box 36
		barrelModel[5] = new ModelRendererTurbo(this, 300, 1330, textureX, textureY); // Box 37
		barrelModel[6] = new ModelRendererTurbo(this, 300, 1330, textureX, textureY); // Box 38
		barrelModel[7] = new ModelRendererTurbo(this, 300, 1340, textureX, textureY); // Box 39
		barrelModel[8] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Box 40
		barrelModel[9] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Box 41
		barrelModel[10] = new ModelRendererTurbo(this, 300, 1360, textureX, textureY); // Box 43
		barrelModel[11] = new ModelRendererTurbo(this, 300, 1370, textureX, textureY); // Box 44
		barrelModel[12] = new ModelRendererTurbo(this, 300, 1370, textureX, textureY); // Box 45
		barrelModel[13] = new ModelRendererTurbo(this, 300, 1360, textureX, textureY); // Box 46
		barrelModel[14] = new ModelRendererTurbo(this, 300, 1370, textureX, textureY); // Box 47
		barrelModel[15] = new ModelRendererTurbo(this, 300, 1370, textureX, textureY); // Box 48
		barrelModel[16] = new ModelRendererTurbo(this, 300, 1360, textureX, textureY); // Box 49
		barrelModel[17] = new ModelRendererTurbo(this, 300, 1370, textureX, textureY); // Box 50
		barrelModel[18] = new ModelRendererTurbo(this, 300, 1370, textureX, textureY); // Box 51
		barrelModel[19] = new ModelRendererTurbo(this, 300, 1360, textureX, textureY); // Box 52
		barrelModel[20] = new ModelRendererTurbo(this, 300, 1370, textureX, textureY); // Box 53
		barrelModel[21] = new ModelRendererTurbo(this, 300, 1370, textureX, textureY); // Box 54
		barrelModel[22] = new ModelRendererTurbo(this, 300, 1380, textureX, textureY); // Box 55
		barrelModel[23] = new ModelRendererTurbo(this, 300, 1400, textureX, textureY); // Box 56
		barrelModel[24] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 58
		barrelModel[25] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 59
		barrelModel[26] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 60
		barrelModel[27] = new ModelRendererTurbo(this, 300, 1420, textureX, textureY); // Box 61
		barrelModel[28] = new ModelRendererTurbo(this, 300, 1430, textureX, textureY); // Box 62
		barrelModel[29] = new ModelRendererTurbo(this, 300, 1430, textureX, textureY); // Box 63
		barrelModel[30] = new ModelRendererTurbo(this, 300, 1420, textureX, textureY); // Box 64
		barrelModel[31] = new ModelRendererTurbo(this, 300, 1430, textureX, textureY); // Box 65
		barrelModel[32] = new ModelRendererTurbo(this, 300, 1430, textureX, textureY); // Box 66
		barrelModel[33] = new ModelRendererTurbo(this, 300, 1420, textureX, textureY); // Box 67
		barrelModel[34] = new ModelRendererTurbo(this, 300, 1430, textureX, textureY); // Box 68
		barrelModel[35] = new ModelRendererTurbo(this, 300, 1430, textureX, textureY); // Box 69
		barrelModel[36] = new ModelRendererTurbo(this, 300, 1440, textureX, textureY); // Box 70
		barrelModel[37] = new ModelRendererTurbo(this, 300, 1400, textureX, textureY); // Box 71
		barrelModel[38] = new ModelRendererTurbo(this, 300, 1330, textureX, textureY); // Box 497

		barrelModel[0].addShapeBox(0F, -5F, -7F, 22, 11, 14, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[0].setRotationPoint(22F, -28F, 0F);

		barrelModel[1].addBox(13F, -4F, -3F, 12, 10, 6, 0F); // Box 33
		barrelModel[1].setRotationPoint(22F, -28F, 0F);

		barrelModel[2].addShapeBox(16F, -8F, -3F, 9, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 34
		barrelModel[2].setRotationPoint(22F, -28F, 0F);

		barrelModel[3].addShapeBox(25F, -7F, -2F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 35
		barrelModel[3].setRotationPoint(22F, -28F, 0F);

		barrelModel[4].addBox(25F, 1F, -2.5F, 11, 3, 5, 0F); // Box 36
		barrelModel[4].setRotationPoint(22F, -28F, 0F);

		barrelModel[5].addShapeBox(25F, 0F, -2.5F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		barrelModel[5].setRotationPoint(22F, -28F, 0F);

		barrelModel[6].addShapeBox(25F, 0F, -2.5F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		barrelModel[6].setRotationPoint(22F, -24F, 0F);

		barrelModel[7].addBox(36F, 1.5F, -2F, 31, 2, 4, 0F); // Box 39
		barrelModel[7].setRotationPoint(22F, -28F, 0F);

		barrelModel[8].addShapeBox(36F, 0.5F, -2F, 31, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		barrelModel[8].setRotationPoint(22F, -28F, 0F);

		barrelModel[9].addShapeBox(36F, 3.5F, -2F, 31, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		barrelModel[9].setRotationPoint(22F, -28F, 0F);

		barrelModel[10].addBox(43F, 1F, -2.5F, 1, 3, 5, 0F); // Box 43
		barrelModel[10].setRotationPoint(22F, -28F, 0F);

		barrelModel[11].addShapeBox(43F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		barrelModel[11].setRotationPoint(22F, -28F, 0F);

		barrelModel[12].addShapeBox(43F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		barrelModel[12].setRotationPoint(22F, -24F, 0F);

		barrelModel[13].addBox(51F, 1F, -2.5F, 1, 3, 5, 0F); // Box 46
		barrelModel[13].setRotationPoint(22F, -28F, 0F);

		barrelModel[14].addShapeBox(51F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		barrelModel[14].setRotationPoint(22F, -28F, 0F);

		barrelModel[15].addShapeBox(51F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		barrelModel[15].setRotationPoint(22F, -24F, 0F);

		barrelModel[16].addBox(59F, 1F, -2.5F, 1, 3, 5, 0F); // Box 49
		barrelModel[16].setRotationPoint(22F, -28F, 0F);

		barrelModel[17].addShapeBox(59F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		barrelModel[17].setRotationPoint(22F, -28F, 0F);

		barrelModel[18].addShapeBox(59F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		barrelModel[18].setRotationPoint(22F, -24F, 0F);

		barrelModel[19].addBox(65F, 1F, -2.5F, 1, 3, 5, 0F); // Box 52
		barrelModel[19].setRotationPoint(22F, -28F, 0F);

		barrelModel[20].addShapeBox(65F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		barrelModel[20].setRotationPoint(22F, -28F, 0F);

		barrelModel[21].addShapeBox(65F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		barrelModel[21].setRotationPoint(22F, -24F, 0F);

		barrelModel[22].addShapeBox(67F, 0.5F, -3F, 12, 4, 6, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 55
		barrelModel[22].setRotationPoint(22F, -28F, 0F);

		barrelModel[23].addShapeBox(67F, 0F, -3F, 12, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
		barrelModel[23].setRotationPoint(22F, -28F, 0F);

		barrelModel[24].addShapeBox(79F, 2F, -1.5F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		barrelModel[24].setRotationPoint(22F, -28F, 0F);

		barrelModel[25].addShapeBox(79F, 1F, -1.5F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		barrelModel[25].setRotationPoint(22F, -28F, 0F);

		barrelModel[26].addShapeBox(79F, 3F, -1.5F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		barrelModel[26].setRotationPoint(22F, -28F, 0F);

		barrelModel[27].addBox(84F, 1.5F, -2F, 1, 2, 4, 0F); // Box 61
		barrelModel[27].setRotationPoint(22F, -28F, 0F);

		barrelModel[28].addShapeBox(84F, 0.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		barrelModel[28].setRotationPoint(22F, -28F, 0F);

		barrelModel[29].addShapeBox(84F, 3.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		barrelModel[29].setRotationPoint(22F, -28F, 0F);

		barrelModel[30].addBox(90F, 1.5F, -2F, 1, 2, 4, 0F); // Box 64
		barrelModel[30].setRotationPoint(22F, -28F, 0F);

		barrelModel[31].addShapeBox(90F, 0.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		barrelModel[31].setRotationPoint(22F, -28F, 0F);

		barrelModel[32].addShapeBox(90F, 3.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		barrelModel[32].setRotationPoint(22F, -28F, 0F);

		barrelModel[33].addBox(101F, 1.5F, -2F, 1, 2, 4, 0F); // Box 67
		barrelModel[33].setRotationPoint(22F, -28F, 0F);

		barrelModel[34].addShapeBox(101F, 0.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		barrelModel[34].setRotationPoint(22F, -28F, 0F);

		barrelModel[35].addShapeBox(101F, 3.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		barrelModel[35].setRotationPoint(22F, -28F, 0F);

		barrelModel[36].addBox(105F, 0F, -0.5F, 4, 1, 1, 0F); // Box 70
		barrelModel[36].setRotationPoint(22F, -28F, 0F);

		barrelModel[37].addShapeBox(67F, 4F, -3F, 12, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 71
		barrelModel[37].setRotationPoint(22F, -28F, 0F);

		barrelModel[38].addShapeBox(16F, 0F, 1.5F, 11, 1, 5, 0F,0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 497
		barrelModel[38].setRotationPoint(22F, -28F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[18];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 359
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 360
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 361
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 362
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 363
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 364
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 365
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 366
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 367
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 368
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 369
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 370
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 371
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 372
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 373
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 374
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 375
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 376

		leftTrackWheelModels[0].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		leftTrackWheelModels[0].setRotationPoint(49F, 2F, 21.5F);

		leftTrackWheelModels[1].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 360
		leftTrackWheelModels[1].setRotationPoint(49F, 2F, 21.5F);

		leftTrackWheelModels[2].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 361
		leftTrackWheelModels[2].setRotationPoint(49F, 2F, 21.5F);

		leftTrackWheelModels[3].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		leftTrackWheelModels[3].setRotationPoint(34F, 2F, 21.5F);

		leftTrackWheelModels[4].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 363
		leftTrackWheelModels[4].setRotationPoint(34F, 2F, 21.5F);

		leftTrackWheelModels[5].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 364
		leftTrackWheelModels[5].setRotationPoint(34F, 2F, 21.5F);

		leftTrackWheelModels[6].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		leftTrackWheelModels[6].setRotationPoint(17F, 2F, 21.5F);

		leftTrackWheelModels[7].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 366
		leftTrackWheelModels[7].setRotationPoint(17F, 2F, 21.5F);

		leftTrackWheelModels[8].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 367
		leftTrackWheelModels[8].setRotationPoint(17F, 2F, 21.5F);

		leftTrackWheelModels[9].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		leftTrackWheelModels[9].setRotationPoint(-3F, 2F, 21.5F);

		leftTrackWheelModels[10].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 369
		leftTrackWheelModels[10].setRotationPoint(-3F, 2F, 21.5F);

		leftTrackWheelModels[11].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 370
		leftTrackWheelModels[11].setRotationPoint(-3F, 2F, 21.5F);

		leftTrackWheelModels[12].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		leftTrackWheelModels[12].setRotationPoint(-19F, 2F, 21.5F);

		leftTrackWheelModels[13].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 372
		leftTrackWheelModels[13].setRotationPoint(-19F, 2F, 21.5F);

		leftTrackWheelModels[14].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 373
		leftTrackWheelModels[14].setRotationPoint(-19F, 2F, 21.5F);

		leftTrackWheelModels[15].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		leftTrackWheelModels[15].setRotationPoint(-38F, 2F, 21.5F);

		leftTrackWheelModels[16].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 375
		leftTrackWheelModels[16].setRotationPoint(-38F, 2F, 21.5F);

		leftTrackWheelModels[17].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 376
		leftTrackWheelModels[17].setRotationPoint(-38F, 2F, 21.5F);


		rightTrackWheelModels = new ModelRendererTurbo[18];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 318
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 319
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 320
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 321
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 322
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 323
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 324
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 325
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 326
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 327
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 328
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 329
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 330
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 331
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 332
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 333
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 334
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 335

		rightTrackWheelModels[0].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 318
		rightTrackWheelModels[0].setRotationPoint(-38F, 2F, -31.5F);

		rightTrackWheelModels[1].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		rightTrackWheelModels[1].setRotationPoint(-38F, 2F, -31.5F);

		rightTrackWheelModels[2].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 320
		rightTrackWheelModels[2].setRotationPoint(-38F, 2F, -31.5F);

		rightTrackWheelModels[3].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 321
		rightTrackWheelModels[3].setRotationPoint(-19F, 2F, -31.5F);

		rightTrackWheelModels[4].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		rightTrackWheelModels[4].setRotationPoint(-19F, 2F, -31.5F);

		rightTrackWheelModels[5].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 323
		rightTrackWheelModels[5].setRotationPoint(-19F, 2F, -31.5F);

		rightTrackWheelModels[6].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 324
		rightTrackWheelModels[6].setRotationPoint(-3F, 2F, -31.5F);

		rightTrackWheelModels[7].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		rightTrackWheelModels[7].setRotationPoint(-3F, 2F, -31.5F);

		rightTrackWheelModels[8].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 326
		rightTrackWheelModels[8].setRotationPoint(-3F, 2F, -31.5F);

		rightTrackWheelModels[9].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		rightTrackWheelModels[9].setRotationPoint(17F, 2F, -31.5F);

		rightTrackWheelModels[10].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 328
		rightTrackWheelModels[10].setRotationPoint(17F, 2F, -31.5F);

		rightTrackWheelModels[11].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 329
		rightTrackWheelModels[11].setRotationPoint(17F, 2F, -31.5F);

		rightTrackWheelModels[12].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		rightTrackWheelModels[12].setRotationPoint(34F, 2F, -31.5F);

		rightTrackWheelModels[13].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 331
		rightTrackWheelModels[13].setRotationPoint(34F, 2F, -31.5F);

		rightTrackWheelModels[14].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 332
		rightTrackWheelModels[14].setRotationPoint(34F, 2F, -31.5F);

		rightTrackWheelModels[15].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		rightTrackWheelModels[15].setRotationPoint(49F, 2F, -31.5F);

		rightTrackWheelModels[16].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 334
		rightTrackWheelModels[16].setRotationPoint(49F, 2F, -31.5F);

		rightTrackWheelModels[17].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 335
		rightTrackWheelModels[17].setRotationPoint(49F, 2F, -31.5F);


		leftTrackModel = new ModelRendererTurbo[18];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 342
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 1867, textureX, textureY); // Box 343
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 1903, textureX, textureY); // Box 344
		leftTrackModel[3] = new ModelRendererTurbo(this, 0, 1921, textureX, textureY); // Box 345
		leftTrackModel[4] = new ModelRendererTurbo(this, 0, 1955, textureX, textureY); // Box 346
		leftTrackModel[5] = new ModelRendererTurbo(this, 0, 1975, textureX, textureY); // Box 347
		leftTrackModel[6] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 348
		leftTrackModel[7] = new ModelRendererTurbo(this, 300, 20, textureX, textureY); // Box 349
		leftTrackModel[8] = new ModelRendererTurbo(this, 300, 30, textureX, textureY); // Box 350
		leftTrackModel[9] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 351
		leftTrackModel[10] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 352
		leftTrackModel[11] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 353
		leftTrackModel[12] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 354
		leftTrackModel[13] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 355
		leftTrackModel[14] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 356
		leftTrackModel[15] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 357
		leftTrackModel[16] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 358
		leftTrackModel[17] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Box 12

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 120, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftTrackModel[0].setRotationPoint(-60F, -12F, 21F);

		leftTrackModel[1].addShapeBox(-2F, 0F, 0F, 2, 19, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftTrackModel[1].setRotationPoint(67F, -5F, 21F);
		leftTrackModel[1].rotateAngleZ = -0.6981317F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 107, 2, 12, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, 0F, 0F); // Box 344
		leftTrackModel[2].setRotationPoint(-52F, 8F, 21F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 2, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 345
		leftTrackModel[3].setRotationPoint(-65F, 1F, 21F);
		leftTrackModel[3].rotateAngleZ = 0.97738438F;

		leftTrackModel[4].addShapeBox(0F, -2F, 0F, 7, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 346
		leftTrackModel[4].setRotationPoint(-60F, -12F, 21F);
		leftTrackModel[4].rotateAngleZ = -2.35619449F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 347
		leftTrackModel[5].setRotationPoint(-65F, -7F, 21F);

		leftTrackModel[6].addBox(-4.5F, -1.5F, 0F, 9, 3, 5, 0F); // Box 348
		leftTrackModel[6].setRotationPoint(-57F, -4F, 26F);

		leftTrackModel[7].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftTrackModel[7].setRotationPoint(-57F, -4F, 26F);

		leftTrackModel[8].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 350
		leftTrackModel[8].setRotationPoint(-57F, -4F, 26F);

		leftTrackModel[9].addShapeBox(-0.5F, 2.5F, 0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 351
		leftTrackModel[9].setRotationPoint(-57F, -4F, 25F);
		leftTrackModel[9].rotateAngleZ = 0.78539816F;

		leftTrackModel[10].addShapeBox(-0.5F, 2.5F, 0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 352
		leftTrackModel[10].setRotationPoint(-57F, -4F, 25F);

		leftTrackModel[11].addShapeBox(-0.5F, 2.5F, 0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 353
		leftTrackModel[11].setRotationPoint(-57F, -4F, 25F);
		leftTrackModel[11].rotateAngleZ = -0.78539816F;

		leftTrackModel[12].addShapeBox(-0.5F, 2.5F, 0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 354
		leftTrackModel[12].setRotationPoint(-57F, -4F, 25F);
		leftTrackModel[12].rotateAngleZ = -1.57079633F;

		leftTrackModel[13].addShapeBox(-0.5F, 2.5F, 0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 355
		leftTrackModel[13].setRotationPoint(-57F, -4F, 25F);
		leftTrackModel[13].rotateAngleZ = -2.35619449F;

		leftTrackModel[14].addShapeBox(-0.5F, 2.5F, 0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 356
		leftTrackModel[14].setRotationPoint(-57F, -4F, 25F);
		leftTrackModel[14].rotateAngleZ = 3.14159265F;

		leftTrackModel[15].addShapeBox(-0.5F, 2.5F, 0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 357
		leftTrackModel[15].setRotationPoint(-57F, -4F, 25F);
		leftTrackModel[15].rotateAngleZ = 2.35619449F;

		leftTrackModel[16].addShapeBox(-0.5F, 2.5F, 0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 358
		leftTrackModel[16].setRotationPoint(-57F, -4F, 25F);
		leftTrackModel[16].rotateAngleZ = 1.57079633F;

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 121, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 12
		leftTrackModel[17].setRotationPoint(-62F, -10F, 23F);


		rightTrackModel = new ModelRendererTurbo[18];
		rightTrackModel[0] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 307
		rightTrackModel[1] = new ModelRendererTurbo(this, 300, 20, textureX, textureY); // Box 308
		rightTrackModel[2] = new ModelRendererTurbo(this, 300, 30, textureX, textureY); // Box 309
		rightTrackModel[3] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 310
		rightTrackModel[4] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 311
		rightTrackModel[5] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 312
		rightTrackModel[6] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 313
		rightTrackModel[7] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 314
		rightTrackModel[8] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 315
		rightTrackModel[9] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 316
		rightTrackModel[10] = new ModelRendererTurbo(this, 300, 45, textureX, textureY); // Box 317
		rightTrackModel[11] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 336
		rightTrackModel[12] = new ModelRendererTurbo(this, 0, 1867, textureX, textureY); // Box 337
		rightTrackModel[13] = new ModelRendererTurbo(this, 0, 1903, textureX, textureY); // Box 338
		rightTrackModel[14] = new ModelRendererTurbo(this, 0, 1955, textureX, textureY); // Box 339
		rightTrackModel[15] = new ModelRendererTurbo(this, 0, 1975, textureX, textureY); // Box 340
		rightTrackModel[16] = new ModelRendererTurbo(this, 0, 1921, textureX, textureY); // Box 341
		rightTrackModel[17] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Box 13

		rightTrackModel[0].addBox(-4.5F, -1.5F, 0F, 9, 3, 5, 0F); // Box 307
		rightTrackModel[0].setRotationPoint(-57F, -4F, -31F);

		rightTrackModel[1].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightTrackModel[1].setRotationPoint(-57F, -4F, -31F);

		rightTrackModel[2].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 309
		rightTrackModel[2].setRotationPoint(-57F, -4F, -31F);

		rightTrackModel[3].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 310
		rightTrackModel[3].setRotationPoint(-57F, -4F, -31F);

		rightTrackModel[4].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 311
		rightTrackModel[4].setRotationPoint(-57F, -4F, -31F);
		rightTrackModel[4].rotateAngleZ = 0.78539816F;

		rightTrackModel[5].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 312
		rightTrackModel[5].setRotationPoint(-57F, -4F, -31F);
		rightTrackModel[5].rotateAngleZ = 1.57079633F;

		rightTrackModel[6].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 313
		rightTrackModel[6].setRotationPoint(-57F, -4F, -31F);
		rightTrackModel[6].rotateAngleZ = 2.35619449F;

		rightTrackModel[7].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 314
		rightTrackModel[7].setRotationPoint(-57F, -4F, -31F);
		rightTrackModel[7].rotateAngleZ = 3.14159265F;

		rightTrackModel[8].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 315
		rightTrackModel[8].setRotationPoint(-57F, -4F, -31F);
		rightTrackModel[8].rotateAngleZ = -2.35619449F;

		rightTrackModel[9].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 316
		rightTrackModel[9].setRotationPoint(-57F, -4F, -31F);
		rightTrackModel[9].rotateAngleZ = -1.57079633F;

		rightTrackModel[10].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 4, 6, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 317
		rightTrackModel[10].setRotationPoint(-57F, -4F, -31F);
		rightTrackModel[10].rotateAngleZ = -0.78539816F;

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 120, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		rightTrackModel[11].setRotationPoint(-60F, -12F, -33F);

		rightTrackModel[12].addShapeBox(-2F, 0F, 0F, 2, 19, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightTrackModel[12].setRotationPoint(67F, -5F, -33F);
		rightTrackModel[12].rotateAngleZ = -0.6981317F;

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 107, 2, 12, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, 0F, 0F); // Box 338
		rightTrackModel[13].setRotationPoint(-52F, 8F, -33F);

		rightTrackModel[14].addShapeBox(0F, -2F, 0F, 7, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 339
		rightTrackModel[14].setRotationPoint(-60F, -12F, -33F);
		rightTrackModel[14].rotateAngleZ = -2.35619449F;

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 340
		rightTrackModel[15].setRotationPoint(-65F, -7F, -33F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 2, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 341
		rightTrackModel[16].setRotationPoint(-65F, 1F, -33F);
		rightTrackModel[16].rotateAngleZ = 0.97738438F;

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 121, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 13
		rightTrackModel[17].setRotationPoint(-62F, -10F, -29F);
		
		//Copy This part into your model
		
		ModelRendererTurbo[][] noseGunModel = new ModelRendererTurbo[3][];

		noseGunModel[0] = new ModelRendererTurbo[3];
		noseGunModel[0][0] = new ModelRendererTurbo(this, 300, 1460, textureX, textureY); // Box 0
		noseGunModel[0][1] = new ModelRendererTurbo(this, 300, 1465, textureX, textureY); // Box 1
		noseGunModel[0][2] = new ModelRendererTurbo(this, 300, 1465, textureX, textureY); // Box 2

		noseGunModel[0][0].addBox(-1F, 0F, -1.5F, 2, 1, 3, 0F); // Box 0

		noseGunModel[0][1].addBox(-1F, -3F, -2.5F, 2, 4, 1, 0F); // Box 1

		noseGunModel[0][2].addBox(-1F, -3F, 1.5F, 2, 4, 1, 0F); // Box 2

		
		for(ModelRendererTurbo noseGunPart : noseGunModel[0])
			noseGunPart.setRotationPoint(6F, -40F, 13F);
		
		noseGunModel[1] = new ModelRendererTurbo[0];


		noseGunModel[2] = new ModelRendererTurbo[12];
		noseGunModel[2][0] = new ModelRendererTurbo(this, 300, 1472, textureX, textureY); // Box 3
		noseGunModel[2][1] = new ModelRendererTurbo(this, 300, 1477, textureX, textureY); // Box 4
		noseGunModel[2][2] = new ModelRendererTurbo(this, 300, 1482, textureX, textureY); // Box 5
		noseGunModel[2][3] = new ModelRendererTurbo(this, 300, 1487, textureX, textureY); // Box 6
		noseGunModel[2][4] = new ModelRendererTurbo(this, 300, 1491, textureX, textureY); // Box 8
		noseGunModel[2][5] = new ModelRendererTurbo(this, 300, 1495, textureX, textureY); // Box 9
		noseGunModel[2][6] = new ModelRendererTurbo(this, 300, 1500, textureX, textureY); // Box 10
		noseGunModel[2][7] = new ModelRendererTurbo(this, 300, 1506, textureX, textureY); // Box 11
		noseGunModel[2][8] = new ModelRendererTurbo(this, 300, 1510, textureX, textureY); // Box 12
		noseGunModel[2][9] = new ModelRendererTurbo(this, 300, 1513, textureX, textureY); // Box 13
		noseGunModel[2][10] = new ModelRendererTurbo(this, 300, 1518, textureX, textureY); // Box 14
		noseGunModel[2][11] = new ModelRendererTurbo(this, 300, 1527, textureX, textureY); // Box 15

		noseGunModel[2][0].addBox(-1F, 1F, -1.5F, 2, 1, 3, 0F); // Box 3

		noseGunModel[2][1].addBox(-2F, -1F, -1F, 7, 2, 2, 0F); // Box 4


		noseGunModel[2][2].addShapeBox(-4F, -1F, -1F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5


		noseGunModel[2][3].addShapeBox(-5F, 0F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6


		noseGunModel[2][4].addShapeBox(-6F, 0F, -1F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 8


		noseGunModel[2][5].addBox(-3F, 1F, -0.5F, 1, 1, 1, 0F); // Box 9


		noseGunModel[2][6].addShapeBox(5F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F); // Box 10


		noseGunModel[2][7].addShapeBox(7F, -1F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11


		noseGunModel[2][8].addShapeBox(5F, 0.1F, -0.5F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 12


		noseGunModel[2][9].addShapeBox(11F, -1.6F, -0.5F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 13


		noseGunModel[2][10].addBox(1F, 0F, 1F, 2, 3, 4, 0F); // Box 14


		noseGunModel[2][11].addShapeBox(1F, -1F, 1F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		
		for(ModelRendererTurbo noseGunPart : noseGunModel[2])
			noseGunPart.setRotationPoint(6F, -43F, 13F);
		
		registerGunModel("L37A2", noseGunModel);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}