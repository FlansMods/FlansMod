//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Hellcat
// Model Creator: 
// Created on: 31.05.2015 - 17:23:55
// Last changed on: 31.05.2015 - 17:23:55

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelHellcat extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHellcat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[310];
		turretModel = new ModelRendererTurbo[154];
		barrelModel = new ModelRendererTurbo[37];
		leftTrackWheelModels = new ModelRendererTurbo[29];
		rightTrackWheelModels = new ModelRendererTurbo[29];
		leftTrackModel = new ModelRendererTurbo[14];
		rightTrackModel = new ModelRendererTurbo[14];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 35
		bodyModel[1] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 36
		bodyModel[2] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 38
		bodyModel[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 40
		bodyModel[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 42
		bodyModel[5] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 45
		bodyModel[6] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 46
		bodyModel[7] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 47
		bodyModel[8] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 49
		bodyModel[9] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 53
		bodyModel[10] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 54
		bodyModel[11] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 55
		bodyModel[12] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 56
		bodyModel[13] = new ModelRendererTurbo(this, 202, 161, textureX, textureY); // Box 58
		bodyModel[14] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 59
		bodyModel[15] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 60
		bodyModel[16] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 65
		bodyModel[18] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 68
		bodyModel[19] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 72
		bodyModel[20] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 73
		bodyModel[21] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 74
		bodyModel[22] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 79
		bodyModel[23] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 81
		bodyModel[25] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 82
		bodyModel[26] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 84
		bodyModel[28] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 85
		bodyModel[29] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 86
		bodyModel[30] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 87
		bodyModel[31] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 88
		bodyModel[32] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 89
		bodyModel[33] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 90
		bodyModel[34] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 91
		bodyModel[35] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 92
		bodyModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 93
		bodyModel[37] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 97
		bodyModel[38] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 98
		bodyModel[39] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 102
		bodyModel[43] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 75, 66, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 105, 52, textureX, textureY); // Box 105
		bodyModel[46] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 107
		bodyModel[47] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 108
		bodyModel[48] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 110
		bodyModel[49] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 111
		bodyModel[50] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 113
		bodyModel[51] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 114
		bodyModel[52] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 115
		bodyModel[53] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 116
		bodyModel[54] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 117
		bodyModel[55] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 118
		bodyModel[56] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 119
		bodyModel[57] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 120
		bodyModel[58] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 121
		bodyModel[59] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 122
		bodyModel[60] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 123
		bodyModel[61] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 124
		bodyModel[62] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 126
		bodyModel[63] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 127
		bodyModel[64] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 1
		bodyModel[66] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 12
		bodyModel[67] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 13
		bodyModel[68] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 14
		bodyModel[69] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 15
		bodyModel[70] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 16
		bodyModel[71] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 17
		bodyModel[72] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 18
		bodyModel[73] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 19
		bodyModel[74] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 20
		bodyModel[75] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 21
		bodyModel[76] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 22
		bodyModel[77] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 23
		bodyModel[78] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 0
		bodyModel[79] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 1
		bodyModel[80] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 3
		bodyModel[82] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Box 4
		bodyModel[83] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 5
		bodyModel[84] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 6
		bodyModel[85] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 25
		bodyModel[86] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 26
		bodyModel[87] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 27
		bodyModel[88] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 28
		bodyModel[89] = new ModelRendererTurbo(this, 111, 56, textureX, textureY); // Box 29
		bodyModel[90] = new ModelRendererTurbo(this, 111, 53, textureX, textureY); // Box 30
		bodyModel[91] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 31
		bodyModel[92] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 32
		bodyModel[93] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 33
		bodyModel[94] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 34
		bodyModel[95] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 35
		bodyModel[96] = new ModelRendererTurbo(this, 154, 4, textureX, textureY); // Box 1
		bodyModel[97] = new ModelRendererTurbo(this, 156, 7, textureX, textureY); // Box 2
		bodyModel[98] = new ModelRendererTurbo(this, 161, 4, textureX, textureY); // Box 3
		bodyModel[99] = new ModelRendererTurbo(this, 154, 4, textureX, textureY); // Box 4
		bodyModel[100] = new ModelRendererTurbo(this, 156, 7, textureX, textureY); // Box 5
		bodyModel[101] = new ModelRendererTurbo(this, 161, 4, textureX, textureY); // Box 6
		bodyModel[102] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 286
		bodyModel[103] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 287
		bodyModel[104] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 289
		bodyModel[105] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 303
		bodyModel[106] = new ModelRendererTurbo(this, 137, 101, textureX, textureY); // Box 304
		bodyModel[107] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 31
		bodyModel[108] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 32
		bodyModel[109] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 33
		bodyModel[110] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 34
		bodyModel[111] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 35
		bodyModel[112] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 36
		bodyModel[113] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 37
		bodyModel[114] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 38
		bodyModel[115] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 39
		bodyModel[116] = new ModelRendererTurbo(this, 137, 101, textureX, textureY); // Box 40
		bodyModel[117] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 41
		bodyModel[118] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 42
		bodyModel[119] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 43
		bodyModel[120] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 44
		bodyModel[121] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 155
		bodyModel[122] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 156
		bodyModel[123] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 157
		bodyModel[124] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 158
		bodyModel[125] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 159
		bodyModel[126] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 160
		bodyModel[127] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 161
		bodyModel[128] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 162
		bodyModel[129] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 163
		bodyModel[130] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 164
		bodyModel[131] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 165
		bodyModel[132] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 166
		bodyModel[133] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 167
		bodyModel[134] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 168
		bodyModel[135] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 169
		bodyModel[136] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 60
		bodyModel[137] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 61
		bodyModel[138] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 62
		bodyModel[139] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 63
		bodyModel[140] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 64
		bodyModel[141] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 65
		bodyModel[142] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 66
		bodyModel[143] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 71
		bodyModel[144] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 72
		bodyModel[145] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 90
		bodyModel[146] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 91
		bodyModel[147] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 92
		bodyModel[148] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 93
		bodyModel[149] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 94
		bodyModel[150] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 95
		bodyModel[151] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 96
		bodyModel[152] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 97
		bodyModel[153] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 98
		bodyModel[154] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 99
		bodyModel[155] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 100
		bodyModel[156] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 101
		bodyModel[157] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 102
		bodyModel[158] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 103
		bodyModel[159] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 104
		bodyModel[160] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 105
		bodyModel[161] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 106
		bodyModel[162] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 107
		bodyModel[163] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 108
		bodyModel[164] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 109
		bodyModel[165] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 110
		bodyModel[166] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 111
		bodyModel[167] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 112
		bodyModel[168] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 113
		bodyModel[169] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 114
		bodyModel[170] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 115
		bodyModel[171] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 116
		bodyModel[172] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 117
		bodyModel[173] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 118
		bodyModel[174] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 119
		bodyModel[175] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 120
		bodyModel[176] = new ModelRendererTurbo(this, 481, 28, textureX, textureY); // Box 121
		bodyModel[177] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 122
		bodyModel[178] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 123
		bodyModel[179] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 124
		bodyModel[180] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 125
		bodyModel[181] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 126
		bodyModel[182] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 127
		bodyModel[183] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 129
		bodyModel[185] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 130
		bodyModel[186] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 131
		bodyModel[187] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 132
		bodyModel[188] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 133
		bodyModel[189] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 134
		bodyModel[190] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 135
		bodyModel[191] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 136
		bodyModel[192] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 137
		bodyModel[193] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 138
		bodyModel[194] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 139
		bodyModel[195] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 140
		bodyModel[196] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 141
		bodyModel[197] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 142
		bodyModel[198] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 143
		bodyModel[199] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 144
		bodyModel[200] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 145
		bodyModel[201] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 146
		bodyModel[202] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 147
		bodyModel[203] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 148
		bodyModel[204] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 149
		bodyModel[205] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 150
		bodyModel[206] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 151
		bodyModel[207] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 152
		bodyModel[208] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 153
		bodyModel[209] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 154
		bodyModel[210] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 155
		bodyModel[211] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 156
		bodyModel[212] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 157
		bodyModel[213] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 158
		bodyModel[214] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 159
		bodyModel[215] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 160
		bodyModel[216] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 161
		bodyModel[217] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 162
		bodyModel[218] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 163
		bodyModel[219] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 164
		bodyModel[220] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 165
		bodyModel[221] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 166
		bodyModel[222] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 167
		bodyModel[223] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 168
		bodyModel[224] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 169
		bodyModel[225] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 170
		bodyModel[226] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 171
		bodyModel[227] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 172
		bodyModel[228] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 173
		bodyModel[229] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 174
		bodyModel[230] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 175
		bodyModel[231] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 176
		bodyModel[232] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 177
		bodyModel[233] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 178
		bodyModel[234] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 179
		bodyModel[235] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 180
		bodyModel[236] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 181
		bodyModel[237] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 182
		bodyModel[238] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 183
		bodyModel[239] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 184
		bodyModel[240] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 185
		bodyModel[241] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 186
		bodyModel[242] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 187
		bodyModel[243] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 188
		bodyModel[244] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 189
		bodyModel[245] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 190
		bodyModel[246] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 191
		bodyModel[247] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 192
		bodyModel[248] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 193
		bodyModel[249] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 2
		bodyModel[252] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 3
		bodyModel[253] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 4
		bodyModel[254] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 5
		bodyModel[255] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 6
		bodyModel[256] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 7
		bodyModel[257] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 8
		bodyModel[258] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 9
		bodyModel[259] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 10
		bodyModel[260] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 11
		bodyModel[261] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 12
		bodyModel[262] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 13
		bodyModel[263] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 14
		bodyModel[264] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 55
		bodyModel[265] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 56
		bodyModel[266] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 57
		bodyModel[267] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 58
		bodyModel[268] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 59
		bodyModel[269] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 60
		bodyModel[270] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 61
		bodyModel[271] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 62
		bodyModel[272] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 63
		bodyModel[273] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 64
		bodyModel[274] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 65
		bodyModel[275] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 66
		bodyModel[276] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 67
		bodyModel[277] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 68
		bodyModel[278] = new ModelRendererTurbo(this, 93, 204, textureX, textureY); // Box 589
		bodyModel[279] = new ModelRendererTurbo(this, 256, 285, textureX, textureY); // Box 590
		bodyModel[280] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 592
		bodyModel[281] = new ModelRendererTurbo(this, 244, 226, textureX, textureY); // Box 554
		bodyModel[282] = new ModelRendererTurbo(this, 170, 193, textureX, textureY); // Box 555
		bodyModel[283] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 556
		bodyModel[284] = new ModelRendererTurbo(this, 62, 380, textureX, textureY); // Box 511
		bodyModel[285] = new ModelRendererTurbo(this, 62, 380, textureX, textureY); // Box 512
		bodyModel[286] = new ModelRendererTurbo(this, 62, 380, textureX, textureY); // Box 513
		bodyModel[287] = new ModelRendererTurbo(this, 62, 380, textureX, textureY); // Box 514
		bodyModel[288] = new ModelRendererTurbo(this, 62, 380, textureX, textureY); // Box 515
		bodyModel[289] = new ModelRendererTurbo(this, 62, 380, textureX, textureY); // Box 580
		bodyModel[290] = new ModelRendererTurbo(this, 62, 380, textureX, textureY); // Box 581
		bodyModel[291] = new ModelRendererTurbo(this, 62, 380, textureX, textureY); // Box 582
		bodyModel[292] = new ModelRendererTurbo(this, 495, 316, textureX, textureY); // Box 207
		bodyModel[293] = new ModelRendererTurbo(this, 494, 304, textureX, textureY); // Box 208
		bodyModel[294] = new ModelRendererTurbo(this, 495, 305, textureX, textureY); // Box 210
		bodyModel[295] = new ModelRendererTurbo(this, 408, 388, textureX, textureY); // Box 214
		bodyModel[296] = new ModelRendererTurbo(this, 407, 388, textureX, textureY); // Box 215
		bodyModel[297] = new ModelRendererTurbo(this, 359, 375, textureX, textureY); // Box 216
		bodyModel[298] = new ModelRendererTurbo(this, 290, 308, textureX, textureY); // Box 217
		bodyModel[299] = new ModelRendererTurbo(this, 275, 308, textureX, textureY); // Box 218
		bodyModel[300] = new ModelRendererTurbo(this, 260, 307, textureX, textureY); // Box 219
		bodyModel[301] = new ModelRendererTurbo(this, 305, 319, textureX, textureY); // Box 220
		bodyModel[302] = new ModelRendererTurbo(this, 478, 321, textureX, textureY); // Box 221
		bodyModel[303] = new ModelRendererTurbo(this, 479, 321, textureX, textureY); // Box 222
		bodyModel[304] = new ModelRendererTurbo(this, 330, 321, textureX, textureY); // Box 223
		bodyModel[305] = new ModelRendererTurbo(this, 333, 378, textureX, textureY); // Box 7
		bodyModel[306] = new ModelRendererTurbo(this, 495, 316, textureX, textureY); // Box 609
		bodyModel[307] = new ModelRendererTurbo(this, 495, 305, textureX, textureY); // Box 610
		bodyModel[308] = new ModelRendererTurbo(this, 495, 305, textureX, textureY); // Box 611
		bodyModel[309] = new ModelRendererTurbo(this, 161, 385, textureX, textureY); // Box 584

		bodyModel[0].addShapeBox(0F, 0F, 0F, 23, 1, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[0].setRotationPoint(14.5F, -19F, -22F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 38, 1, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[1].setRotationPoint(-54.5F, -19F, -22F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 31, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[2].setRotationPoint(-16.5F, -19F, 17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 92, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 40
		bodyModel[3].setRotationPoint(-54.5F, -19F, 22F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 31, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[4].setRotationPoint(-16.5F, -19F, -22F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[5].setRotationPoint(6.5F, -19F, 8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 46
		bodyModel[6].setRotationPoint(6.5F, -19F, -17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 44, 0F, 0F, 0F, 0F, 4F, -7F, -4F, 4F, -7F, -4F, 0F, 0F, 0F, 0F, 6F, 0F, 4F, 6F, -4F, 4F, 6F, -4F, 0F, 6F, 0F); // Box 47
		bodyModel[7].setRotationPoint(37.5F, -19F, -22F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, -7F, 4F, 0F, -7F, -8F, 0F, 0F, -4F, 0F, 4F, 0F, 0F, 6F, 4F, 0F, 6F, -8F, 0F, 4F, 2F); // Box 49
		bodyModel[8].setRotationPoint(37.5F, -19F, 22F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 73, 8, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[9].setRotationPoint(-33.5F, -8F, -17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 73, 18, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[10].setRotationPoint(-33.5F, -18F, -18F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 73, 18, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[11].setRotationPoint(-33.5F, -18F, 17F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 10, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F); // Box 56
		bodyModel[12].setRotationPoint(39.5F, -12F, -18F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 102, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[13].setRotationPoint(-54.5F, -12F, 18F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 102, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[14].setRotationPoint(-54.5F, -12F, -28F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 15, 10, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[15].setRotationPoint(-33.5F, -18F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 10, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[16].setRotationPoint(14.5F, -18F, -17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -8F, 0F, 0F, 2F); // Box 65
		bodyModel[17].setRotationPoint(37.5F, -14F, 22F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[18].setRotationPoint(47.5F, -12F, 18F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 21, 10, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, -1F, 0F); // Box 72
		bodyModel[19].setRotationPoint(-54.5F, -12F, -18F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 21, 6, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 73
		bodyModel[20].setRotationPoint(-54.5F, -18F, -22F);

		bodyModel[21].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 74
		bodyModel[21].setRotationPoint(22.5F, -19.2F, -17F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 10, 36, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 1F, 2F, 0F); // Box 79
		bodyModel[22].setRotationPoint(47.5F, -12F, -18F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[23].setRotationPoint(50.5F, -10F, 18F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[24].setRotationPoint(52.5F, -8F, 18F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[25].setRotationPoint(47.5F, -12F, -28F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[26].setRotationPoint(50.5F, -10F, -28F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[27].setRotationPoint(52.5F, -8F, -28F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[28].setRotationPoint(52.5F, -8F, 27F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 86
		bodyModel[29].setRotationPoint(50.5F, -9F, 27F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 87
		bodyModel[30].setRotationPoint(47.5F, -11F, 27F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 3F, 0F); // Box 88
		bodyModel[31].setRotationPoint(42.5F, -11F, 27F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 5F, 0F); // Box 89
		bodyModel[32].setRotationPoint(34.5F, -11F, 27F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 1F, 3F, 0F); // Box 90
		bodyModel[33].setRotationPoint(33.5F, -11F, 27F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[34].setRotationPoint(52.5F, -8F, -28F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 92
		bodyModel[35].setRotationPoint(50.5F, -9F, -28F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 93
		bodyModel[36].setRotationPoint(47.5F, -11F, -28F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[37].setRotationPoint(37.5F, -11F, 27F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[38].setRotationPoint(35.5F, -11F, 27F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[39].setRotationPoint(31.5F, -11F, 27F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 3F, 0F); // Box 100
		bodyModel[40].setRotationPoint(42.5F, -11F, -28F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 5F, 0F); // Box 101
		bodyModel[41].setRotationPoint(34.5F, -11F, -28F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 1F, 3F, 0F); // Box 102
		bodyModel[42].setRotationPoint(33.5F, -11F, -28F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[43].setRotationPoint(37.5F, -11F, -28F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[44].setRotationPoint(35.5F, -11F, -28F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[45].setRotationPoint(31.5F, -11F, -28F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 15, 2, 42, 0F, 6F, 0F, -15F, -8F, 0F, -15F, -8F, 0F, -15F, 6F, 0F, -15F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -1F, 0F); // Box 107
		bodyModel[46].setRotationPoint(-35.5F, -21F, -21F);

		bodyModel[47].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 108
		bodyModel[47].setRotationPoint(22.5F, -19.2F, -10.9F);

		bodyModel[48].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 110
		bodyModel[48].setRotationPoint(22.5F, -19.2F, 11F);

		bodyModel[49].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 111
		bodyModel[49].setRotationPoint(22.5F, -19.2F, 4.9F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 113
		bodyModel[50].setRotationPoint(31F, -20.5F, -15.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 114
		bodyModel[51].setRotationPoint(30F, -19.5F, -16F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 115
		bodyModel[52].setRotationPoint(31F, -20.5F, 12.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 116
		bodyModel[53].setRotationPoint(30F, -19.5F, 12F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 117
		bodyModel[54].setRotationPoint(23.5F, -19.4F, -18F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 118
		bodyModel[55].setRotationPoint(30.5F, -19.4F, -18F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 119
		bodyModel[56].setRotationPoint(23.5F, -19.4F, 17F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 120
		bodyModel[57].setRotationPoint(30.5F, -19.4F, 17F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 121
		bodyModel[58].setRotationPoint(23.5F, -19.4F, -5F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 122
		bodyModel[59].setRotationPoint(30.5F, -19.4F, -5F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 123
		bodyModel[60].setRotationPoint(23.5F, -19.4F, 4F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 124
		bodyModel[61].setRotationPoint(30.5F, -19.4F, 4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 13, 1, 44, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[62].setRotationPoint(-54.5F, -20F, -22F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 21, 1, 44, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 127
		bodyModel[63].setRotationPoint(-41.5F, -20F, -22F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(-16.5F, -19F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 1
		bodyModel[65].setRotationPoint(-16.5F, -19F, -17F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // Box 12
		bodyModel[66].setRotationPoint(-53.5F, -8F, 18F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 13
		bodyModel[67].setRotationPoint(-52.5F, -9F, 27F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 14
		bodyModel[68].setRotationPoint(-50.5F, -11F, 27F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[69].setRotationPoint(-47.5F, -11F, 27F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[70].setRotationPoint(38F, -11.5F, 27.2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 92, 1, 6, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[71].setRotationPoint(-54.5F, -19F, -28F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, -4F, 0F, -7F, -8F, 0F, -7F, 4F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 6F, -8F, 0F, 6F, 4F, 0F, 4F, 0F); // Box 18
		bodyModel[72].setRotationPoint(37.5F, -19F, -26F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0F, 0F, 2F, 0F, -2F, -8F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -8F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 19
		bodyModel[73].setRotationPoint(37.5F, -14F, -26F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // Box 20
		bodyModel[74].setRotationPoint(-53.5F, -8F, -28F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 21
		bodyModel[75].setRotationPoint(-52.5F, -9F, -28F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 22
		bodyModel[76].setRotationPoint(-50.5F, -11F, -28F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[77].setRotationPoint(-47.5F, -11F, -28F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 0
		bodyModel[78].setRotationPoint(43.5F, -15F, -12F);
		bodyModel[78].rotateAngleZ = -0.61086524F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 24, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[79].setRotationPoint(47.6F, -12.1F, -12F);
		bodyModel[79].rotateAngleZ = -0.78539816F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[80].setRotationPoint(50.6F, -9.1F, -12F);
		bodyModel[80].rotateAngleZ = -1.65806279F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 3
		bodyModel[81].setRotationPoint(50.1F, -3.9F, -12F);
		bodyModel[81].rotateAngleZ = -2.28638132F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 1, 42, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[82].setRotationPoint(-54.5F, -21F, -21F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 5
		bodyModel[83].setRotationPoint(31.5F, -19.3F, 8.9F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 6
		bodyModel[84].setRotationPoint(31.5F, -19.3F, -9.9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 25
		bodyModel[85].setRotationPoint(-52.5F, -9F, -27F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 26
		bodyModel[86].setRotationPoint(-50.5F, -11F, -27F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 27
		bodyModel[87].setRotationPoint(-52.5F, -9F, 18F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 28
		bodyModel[88].setRotationPoint(-50.5F, -11F, 18F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[89].setRotationPoint(43F, -11.5F, 27.2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[90].setRotationPoint(38F, -11.5F, -28.2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[91].setRotationPoint(43F, -11.5F, -28.2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[92].setRotationPoint(-47F, -11.5F, -28.2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[93].setRotationPoint(-42F, -11.5F, -28.2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[94].setRotationPoint(-42F, -11.5F, 27.2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[95].setRotationPoint(-47F, -11.5F, 27.2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 1
		bodyModel[96].setRotationPoint(44F, -13.5F, 8F);
		bodyModel[96].rotateAngleZ = 0.95993109F;

		bodyModel[97].addShapeBox(1.8F, 0.7F, 0F, 1, 1, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 2
		bodyModel[97].setRotationPoint(44F, -13.5F, 8F);
		bodyModel[97].rotateAngleZ = 0.95993109F;

		bodyModel[98].addShapeBox(0F, 1.4F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 3
		bodyModel[98].setRotationPoint(44F, -13.5F, 8F);
		bodyModel[98].rotateAngleZ = 0.95993109F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 4
		bodyModel[99].setRotationPoint(44F, -13.5F, -9F);
		bodyModel[99].rotateAngleZ = 0.95993109F;

		bodyModel[100].addShapeBox(1.8F, 0.7F, 0F, 1, 1, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 5
		bodyModel[100].setRotationPoint(44F, -13.5F, -9F);
		bodyModel[100].rotateAngleZ = 0.95993109F;

		bodyModel[101].addShapeBox(0F, 1.4F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 6
		bodyModel[101].setRotationPoint(44F, -13.5F, -9F);
		bodyModel[101].rotateAngleZ = 0.95993109F;

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 286
		bodyModel[102].setRotationPoint(45F, -15F, 14.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 287
		bodyModel[103].setRotationPoint(45F, -15F, 18F);

		bodyModel[104].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 289
		bodyModel[104].setRotationPoint(46F, -15F, 14.5F);
		bodyModel[104].rotateAngleZ = 0.41887902F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F); // Box 303
		bodyModel[105].setRotationPoint(43F, -17F, 16.2F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 304
		bodyModel[106].setRotationPoint(43F, -15.8F, 16.2F);

		bodyModel[107].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 31
		bodyModel[107].setRotationPoint(44.8F, -17.7F, 14.5F);
		bodyModel[107].rotateAngleZ = 1.3962634F;

		bodyModel[108].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 32
		bodyModel[108].setRotationPoint(44.8F, -17.7F, 18F);
		bodyModel[108].rotateAngleZ = 1.3962634F;

		bodyModel[109].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 33
		bodyModel[109].setRotationPoint(41.9F, -18.2F, 14.5F);
		bodyModel[109].rotateAngleZ = 2.42600766F;

		bodyModel[110].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 34
		bodyModel[110].setRotationPoint(41.9F, -18.2F, 18F);
		bodyModel[110].rotateAngleZ = 2.42600766F;

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 35
		bodyModel[111].setRotationPoint(45F, -15F, -15.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 36
		bodyModel[112].setRotationPoint(45F, -15F, -19F);

		bodyModel[113].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 37
		bodyModel[113].setRotationPoint(46F, -15F, -19F);
		bodyModel[113].rotateAngleZ = 0.41887902F;

		bodyModel[114].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 38
		bodyModel[114].setRotationPoint(46F, -15F, -15.5F);
		bodyModel[114].rotateAngleZ = 0.41887902F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F); // Box 39
		bodyModel[115].setRotationPoint(43F, -17F, -17.2F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 40
		bodyModel[116].setRotationPoint(43F, -15.8F, -17.2F);

		bodyModel[117].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 41
		bodyModel[117].setRotationPoint(44.8F, -17.7F, -15.5F);
		bodyModel[117].rotateAngleZ = 1.3962634F;

		bodyModel[118].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 42
		bodyModel[118].setRotationPoint(44.8F, -17.7F, -19F);
		bodyModel[118].rotateAngleZ = 1.3962634F;

		bodyModel[119].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 43
		bodyModel[119].setRotationPoint(41.9F, -18.2F, -15.5F);
		bodyModel[119].rotateAngleZ = 2.42600766F;

		bodyModel[120].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 44
		bodyModel[120].setRotationPoint(41.9F, -18.2F, -19F);
		bodyModel[120].rotateAngleZ = 2.42600766F;

		bodyModel[121].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[121].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[121].rotateAngleX = -0.6981317F;

		bodyModel[122].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 156
		bodyModel[122].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[122].rotateAngleX = -0.6981317F;

		bodyModel[123].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[123].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[123].rotateAngleX = -0.6981317F;

		bodyModel[124].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 158
		bodyModel[124].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[124].rotateAngleX = -0.6981317F;

		bodyModel[125].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[125].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[125].rotateAngleX = -0.6981317F;

		bodyModel[126].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 160
		bodyModel[126].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[126].rotateAngleX = -0.6981317F;

		bodyModel[127].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[127].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[127].rotateAngleX = -0.6981317F;

		bodyModel[128].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 162
		bodyModel[128].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[128].rotateAngleX = -0.6981317F;

		bodyModel[129].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[129].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[129].rotateAngleX = -0.6981317F;

		bodyModel[130].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 164
		bodyModel[130].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[130].rotateAngleX = -0.6981317F;

		bodyModel[131].addShapeBox(-5F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[131].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[131].rotateAngleX = -0.6981317F;

		bodyModel[132].addShapeBox(-5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[132].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[132].rotateAngleX = -0.6981317F;

		bodyModel[133].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[133].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[133].rotateAngleX = -0.6981317F;

		bodyModel[134].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[134].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[134].rotateAngleX = -0.6981317F;

		bodyModel[135].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[135].setRotationPoint(27F, -16F, 24.5F);
		bodyModel[135].rotateAngleX = -0.6981317F;

		bodyModel[136].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[136].setRotationPoint(12F, -16F, 24.5F);
		bodyModel[136].rotateAngleX = -0.6981317F;

		bodyModel[137].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 61
		bodyModel[137].setRotationPoint(12F, -16F, 24.5F);
		bodyModel[137].rotateAngleX = -0.6981317F;

		bodyModel[138].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[138].setRotationPoint(12F, -16F, 24.5F);
		bodyModel[138].rotateAngleX = -0.6981317F;

		bodyModel[139].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 63
		bodyModel[139].setRotationPoint(12F, -16F, 24.5F);
		bodyModel[139].rotateAngleX = -0.6981317F;

		bodyModel[140].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[140].setRotationPoint(12F, -16F, 24.5F);
		bodyModel[140].rotateAngleX = -0.6981317F;

		bodyModel[141].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 65
		bodyModel[141].setRotationPoint(12F, -16F, 24.5F);
		bodyModel[141].rotateAngleX = -0.6981317F;

		bodyModel[142].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[142].setRotationPoint(12F, -16F, 24.5F);
		bodyModel[142].rotateAngleX = -0.6981317F;

		bodyModel[143].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[143].setRotationPoint(12F, -16F, 24.5F);
		bodyModel[143].rotateAngleX = -0.6981317F;

		bodyModel[144].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[144].setRotationPoint(12F, -16F, 24.5F);
		bodyModel[144].rotateAngleX = -0.6981317F;

		bodyModel[145].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[145].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[145].rotateAngleX = -0.6981317F;

		bodyModel[146].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 91
		bodyModel[146].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[146].rotateAngleX = -0.6981317F;

		bodyModel[147].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[147].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[147].rotateAngleX = -0.6981317F;

		bodyModel[148].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 93
		bodyModel[148].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[148].rotateAngleX = -0.6981317F;

		bodyModel[149].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[149].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[149].rotateAngleX = -0.6981317F;

		bodyModel[150].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 95
		bodyModel[150].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[150].rotateAngleX = -0.6981317F;

		bodyModel[151].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[151].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[151].rotateAngleX = -0.6981317F;

		bodyModel[152].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[152].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[152].rotateAngleX = -0.6981317F;

		bodyModel[153].addShapeBox(-5F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[153].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[153].rotateAngleX = -0.6981317F;

		bodyModel[154].addShapeBox(-5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[154].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[154].rotateAngleX = -0.6981317F;

		bodyModel[155].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[155].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[155].rotateAngleX = -0.6981317F;

		bodyModel[156].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[156].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[156].rotateAngleX = -0.6981317F;

		bodyModel[157].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[157].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[157].rotateAngleX = -0.6981317F;

		bodyModel[158].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 103
		bodyModel[158].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[158].rotateAngleX = -0.6981317F;

		bodyModel[159].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 104
		bodyModel[159].setRotationPoint(-25F, -16F, 24.5F);
		bodyModel[159].rotateAngleX = -0.6981317F;

		bodyModel[160].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[160].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[160].rotateAngleX = -0.6981317F;

		bodyModel[161].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 106
		bodyModel[161].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[161].rotateAngleX = -0.6981317F;

		bodyModel[162].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[162].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[162].rotateAngleX = -0.6981317F;

		bodyModel[163].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 108
		bodyModel[163].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[163].rotateAngleX = -0.6981317F;

		bodyModel[164].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[164].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[164].rotateAngleX = -0.6981317F;

		bodyModel[165].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 110
		bodyModel[165].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[165].rotateAngleX = -0.6981317F;

		bodyModel[166].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[166].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[166].rotateAngleX = -0.6981317F;

		bodyModel[167].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[167].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[167].rotateAngleX = -0.6981317F;

		bodyModel[168].addShapeBox(-5F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[168].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[168].rotateAngleX = -0.6981317F;

		bodyModel[169].addShapeBox(-5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[169].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[169].rotateAngleX = -0.6981317F;

		bodyModel[170].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[170].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[170].rotateAngleX = -0.6981317F;

		bodyModel[171].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[171].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[171].rotateAngleX = -0.6981317F;

		bodyModel[172].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[172].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[172].rotateAngleX = -0.6981317F;

		bodyModel[173].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 118
		bodyModel[173].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[173].rotateAngleX = -0.6981317F;

		bodyModel[174].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 119
		bodyModel[174].setRotationPoint(-40F, -16F, 24.5F);
		bodyModel[174].rotateAngleX = -0.6981317F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 120
		bodyModel[175].setRotationPoint(45F, -15F, -17.8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 121
		bodyModel[176].setRotationPoint(45F, -15F, 15.8F);

		bodyModel[177].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 122
		bodyModel[177].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[177].rotateAngleX = 0.6981317F;

		bodyModel[178].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[178].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[178].rotateAngleX = 0.6981317F;

		bodyModel[179].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 124
		bodyModel[179].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[179].rotateAngleX = 0.6981317F;

		bodyModel[180].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[180].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[180].rotateAngleX = 0.6981317F;

		bodyModel[181].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 126
		bodyModel[181].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[181].rotateAngleX = 0.6981317F;

		bodyModel[182].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[182].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[182].rotateAngleX = 0.6981317F;

		bodyModel[183].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 128
		bodyModel[183].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[183].rotateAngleX = 0.6981317F;

		bodyModel[184].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[184].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[184].rotateAngleX = 0.6981317F;

		bodyModel[185].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[185].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[185].rotateAngleX = 0.6981317F;

		bodyModel[186].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[186].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[186].rotateAngleX = 0.6981317F;

		bodyModel[187].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[187].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[187].rotateAngleX = 0.6981317F;

		bodyModel[188].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[188].setRotationPoint(27F, -16F, -24.5F);
		bodyModel[188].rotateAngleX = 0.6981317F;

		bodyModel[189].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 134
		bodyModel[189].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[189].rotateAngleX = 0.6981317F;

		bodyModel[190].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[190].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[190].rotateAngleX = 0.6981317F;

		bodyModel[191].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 136
		bodyModel[191].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[191].rotateAngleX = 0.6981317F;

		bodyModel[192].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[192].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[192].rotateAngleX = 0.6981317F;

		bodyModel[193].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 138
		bodyModel[193].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[193].rotateAngleX = 0.6981317F;

		bodyModel[194].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[194].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[194].rotateAngleX = 0.6981317F;

		bodyModel[195].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 140
		bodyModel[195].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[195].rotateAngleX = 0.6981317F;

		bodyModel[196].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[196].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[196].rotateAngleX = 0.6981317F;

		bodyModel[197].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[197].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[197].rotateAngleX = 0.6981317F;

		bodyModel[198].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[198].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[198].rotateAngleX = 0.6981317F;

		bodyModel[199].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[199].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[199].rotateAngleX = 0.6981317F;

		bodyModel[200].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[200].setRotationPoint(15F, -16F, -24.5F);
		bodyModel[200].rotateAngleX = 0.6981317F;

		bodyModel[201].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 146
		bodyModel[201].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[201].rotateAngleX = 0.6981317F;

		bodyModel[202].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[202].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[202].rotateAngleX = 0.6981317F;

		bodyModel[203].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 148
		bodyModel[203].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[203].rotateAngleX = 0.6981317F;

		bodyModel[204].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[204].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[204].rotateAngleX = 0.6981317F;

		bodyModel[205].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 150
		bodyModel[205].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[205].rotateAngleX = 0.6981317F;

		bodyModel[206].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[206].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[206].rotateAngleX = 0.6981317F;

		bodyModel[207].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 152
		bodyModel[207].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[207].rotateAngleX = 0.6981317F;

		bodyModel[208].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[208].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[208].rotateAngleX = 0.6981317F;

		bodyModel[209].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[209].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[209].rotateAngleX = 0.6981317F;

		bodyModel[210].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[210].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[210].rotateAngleX = 0.6981317F;

		bodyModel[211].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[211].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[211].rotateAngleX = 0.6981317F;

		bodyModel[212].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[212].setRotationPoint(-23F, -16F, -24.5F);
		bodyModel[212].rotateAngleX = 0.6981317F;

		bodyModel[213].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 158
		bodyModel[213].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[213].rotateAngleX = 0.6981317F;

		bodyModel[214].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[214].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[214].rotateAngleX = 0.6981317F;

		bodyModel[215].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 160
		bodyModel[215].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[215].rotateAngleX = 0.6981317F;

		bodyModel[216].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[216].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[216].rotateAngleX = 0.6981317F;

		bodyModel[217].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 162
		bodyModel[217].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[217].rotateAngleX = 0.6981317F;

		bodyModel[218].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[218].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[218].rotateAngleX = 0.6981317F;

		bodyModel[219].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 164
		bodyModel[219].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[219].rotateAngleX = 0.6981317F;

		bodyModel[220].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[220].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[220].rotateAngleX = 0.6981317F;

		bodyModel[221].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[221].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[221].rotateAngleX = 0.6981317F;

		bodyModel[222].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[222].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[222].rotateAngleX = 0.6981317F;

		bodyModel[223].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[223].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[223].rotateAngleX = 0.6981317F;

		bodyModel[224].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[224].setRotationPoint(-35F, -16F, -24.5F);
		bodyModel[224].rotateAngleX = 0.6981317F;

		bodyModel[225].addShapeBox(9F, -2.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 170
		bodyModel[225].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[225].rotateAngleX = -0.61086524F;
		bodyModel[225].rotateAngleY = -1.57079633F;

		bodyModel[226].addShapeBox(7F, -2.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[226].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[226].rotateAngleX = -0.61086524F;
		bodyModel[226].rotateAngleY = -1.57079633F;

		bodyModel[227].addShapeBox(6F, -2.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 172
		bodyModel[227].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[227].rotateAngleX = -0.61086524F;
		bodyModel[227].rotateAngleY = -1.57079633F;

		bodyModel[228].addShapeBox(4F, -2.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[228].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[228].rotateAngleX = -0.61086524F;
		bodyModel[228].rotateAngleY = -1.57079633F;

		bodyModel[229].addShapeBox(1F, -2.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[229].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[229].rotateAngleX = -0.61086524F;
		bodyModel[229].rotateAngleY = -1.57079633F;

		bodyModel[230].addShapeBox(3F, -2.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 175
		bodyModel[230].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[230].rotateAngleX = -0.61086524F;
		bodyModel[230].rotateAngleY = -1.57079633F;

		bodyModel[231].addShapeBox(0F, -2.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 176
		bodyModel[231].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[231].rotateAngleX = -0.61086524F;
		bodyModel[231].rotateAngleY = -1.57079633F;

		bodyModel[232].addShapeBox(-2F, -2.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[232].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[232].rotateAngleX = -0.61086524F;
		bodyModel[232].rotateAngleY = -1.57079633F;

		bodyModel[233].addShapeBox(-2F, -3.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[233].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[233].rotateAngleX = -0.61086524F;
		bodyModel[233].rotateAngleY = -1.57079633F;

		bodyModel[234].addShapeBox(1F, -3.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[234].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[234].rotateAngleX = -0.61086524F;
		bodyModel[234].rotateAngleY = -1.57079633F;

		bodyModel[235].addShapeBox(4F, -3.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[235].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[235].rotateAngleX = -0.61086524F;
		bodyModel[235].rotateAngleY = -1.57079633F;

		bodyModel[236].addShapeBox(7F, -3.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[236].setRotationPoint(39F, -16F, 10.5F);
		bodyModel[236].rotateAngleX = -0.61086524F;
		bodyModel[236].rotateAngleY = -1.57079633F;

		bodyModel[237].addShapeBox(9F, -2.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 182
		bodyModel[237].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[237].rotateAngleX = -0.61086524F;
		bodyModel[237].rotateAngleY = -1.57079633F;

		bodyModel[238].addShapeBox(7F, -2.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[238].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[238].rotateAngleX = -0.61086524F;
		bodyModel[238].rotateAngleY = -1.57079633F;

		bodyModel[239].addShapeBox(6F, -2.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 184
		bodyModel[239].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[239].rotateAngleX = -0.61086524F;
		bodyModel[239].rotateAngleY = -1.57079633F;

		bodyModel[240].addShapeBox(4F, -2.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[240].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[240].rotateAngleX = -0.61086524F;
		bodyModel[240].rotateAngleY = -1.57079633F;

		bodyModel[241].addShapeBox(1F, -2.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[241].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[241].rotateAngleX = -0.61086524F;
		bodyModel[241].rotateAngleY = -1.57079633F;

		bodyModel[242].addShapeBox(3F, -2.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 187
		bodyModel[242].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[242].rotateAngleX = -0.61086524F;
		bodyModel[242].rotateAngleY = -1.57079633F;

		bodyModel[243].addShapeBox(0F, -2.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 188
		bodyModel[243].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[243].rotateAngleX = -0.61086524F;
		bodyModel[243].rotateAngleY = -1.57079633F;

		bodyModel[244].addShapeBox(-2F, -2.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[244].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[244].rotateAngleX = -0.61086524F;
		bodyModel[244].rotateAngleY = -1.57079633F;

		bodyModel[245].addShapeBox(-2F, -3.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[245].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[245].rotateAngleX = -0.61086524F;
		bodyModel[245].rotateAngleY = -1.57079633F;

		bodyModel[246].addShapeBox(1F, -3.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[246].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[246].rotateAngleX = -0.61086524F;
		bodyModel[246].rotateAngleY = -1.57079633F;

		bodyModel[247].addShapeBox(4F, -3.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[247].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[247].rotateAngleX = -0.61086524F;
		bodyModel[247].rotateAngleY = -1.57079633F;

		bodyModel[248].addShapeBox(7F, -3.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[248].setRotationPoint(39F, -16F, -2.5F);
		bodyModel[248].rotateAngleX = -0.61086524F;
		bodyModel[248].rotateAngleY = -1.57079633F;

		bodyModel[249].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 0
		bodyModel[249].setRotationPoint(46F, -15F, 18F);
		bodyModel[249].rotateAngleZ = 0.41887902F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[250].setRotationPoint(-3F, 0F, -18.5F);
		bodyModel[250].rotateAngleZ = 0.43633231F;

		bodyModel[251].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 2
		bodyModel[251].setRotationPoint(-4F, -1F, -19F);
		bodyModel[251].rotateAngleZ = 0.41887902F;

		bodyModel[252].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 3
		bodyModel[252].setRotationPoint(11F, -1F, -19F);
		bodyModel[252].rotateAngleZ = 0.41887902F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[253].setRotationPoint(12F, 0F, -18.5F);
		bodyModel[253].rotateAngleZ = 0.43633231F;

		bodyModel[254].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 5
		bodyModel[254].setRotationPoint(26F, -1F, -19F);
		bodyModel[254].rotateAngleZ = 0.41887902F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[255].setRotationPoint(27F, 0F, -18.5F);
		bodyModel[255].rotateAngleZ = 0.43633231F;

		bodyModel[256].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 7
		bodyModel[256].setRotationPoint(-19F, -1F, -19F);
		bodyModel[256].rotateAngleZ = 0.41887902F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[257].setRotationPoint(-18F, 0F, -18.5F);
		bodyModel[257].rotateAngleZ = 0.43633231F;

		bodyModel[258].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 9
		bodyModel[258].setRotationPoint(-34F, -1F, -19F);
		bodyModel[258].rotateAngleZ = 0.41887902F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[259].setRotationPoint(-33F, 0F, -18.5F);
		bodyModel[259].rotateAngleZ = 0.43633231F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 11
		bodyModel[260].setRotationPoint(6.5F, -8F, -18.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 12
		bodyModel[261].setRotationPoint(21.5F, -8F, -18.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 13
		bodyModel[262].setRotationPoint(-8.5F, -8F, -18.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 14
		bodyModel[263].setRotationPoint(-23.5F, -8F, -18.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[264].setRotationPoint(-3F, 0F, 17.5F);
		bodyModel[264].rotateAngleZ = 0.43633231F;

		bodyModel[265].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 56
		bodyModel[265].setRotationPoint(-4F, -1F, 17F);
		bodyModel[265].rotateAngleZ = 0.41887902F;

		bodyModel[266].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 57
		bodyModel[266].setRotationPoint(11F, -1F, 17F);
		bodyModel[266].rotateAngleZ = 0.41887902F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[267].setRotationPoint(12F, 0F, 17.5F);
		bodyModel[267].rotateAngleZ = 0.43633231F;

		bodyModel[268].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 59
		bodyModel[268].setRotationPoint(26F, -1F, 17F);
		bodyModel[268].rotateAngleZ = 0.41887902F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[269].setRotationPoint(27F, 0F, 17.5F);
		bodyModel[269].rotateAngleZ = 0.43633231F;

		bodyModel[270].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 61
		bodyModel[270].setRotationPoint(-19F, -1F, 17F);
		bodyModel[270].rotateAngleZ = 0.41887902F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[271].setRotationPoint(-18F, 0F, 17.5F);
		bodyModel[271].rotateAngleZ = 0.43633231F;

		bodyModel[272].addBox(0F, -3F, 0F, 4, 5, 2, 0F); // Box 63
		bodyModel[272].setRotationPoint(-34F, -1F, 17F);
		bodyModel[272].rotateAngleZ = 0.41887902F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[273].setRotationPoint(-33F, 0F, 17.5F);
		bodyModel[273].rotateAngleZ = 0.43633231F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 65
		bodyModel[274].setRotationPoint(6.5F, -8F, 16.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 66
		bodyModel[275].setRotationPoint(21.5F, -8F, 16.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 67
		bodyModel[276].setRotationPoint(-8.5F, -8F, 16.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 68
		bodyModel[277].setRotationPoint(-23.5F, -8F, 16.5F);

		bodyModel[278].addShapeBox(-1F, -0.3F, 0F, 10, 2, 3, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 589
		bodyModel[278].setRotationPoint(2.5F, -18.5F, 22.5F);
		bodyModel[278].rotateAngleX = 0.87266463F;

		bodyModel[279].addBox(-1F, 0F, 0F, 10, 6, 3, 0F); // Box 590
		bodyModel[279].setRotationPoint(2.5F, -18.5F, 22.5F);
		bodyModel[279].rotateAngleX = 0.87266463F;

		bodyModel[280].addShapeBox(3.5F, 0.8F, 2.2F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 592
		bodyModel[280].setRotationPoint(2.5F, -18.5F, 22.5F);
		bodyModel[280].rotateAngleX = 0.87266463F;

		bodyModel[281].addBox(-1F, 0F, 0F, 10, 6, 3, 0F); // Box 554
		bodyModel[281].setRotationPoint(-10.5F, -18.5F, 22.5F);
		bodyModel[281].rotateAngleX = 0.9250245F;
		bodyModel[281].rotateAngleY = 0.01745329F;
		bodyModel[281].rotateAngleZ = -0.03490659F;

		bodyModel[282].addShapeBox(-1F, -0.3F, 0F, 10, 2, 3, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 555
		bodyModel[282].setRotationPoint(-10.5F, -18.5F, 22.5F);
		bodyModel[282].rotateAngleX = 0.9250245F;
		bodyModel[282].rotateAngleY = 0.01745329F;
		bodyModel[282].rotateAngleZ = -0.03490659F;

		bodyModel[283].addShapeBox(3.5F, 0.8F, 2.2F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 556
		bodyModel[283].setRotationPoint(-10.5F, -18.5F, 22.5F);
		bodyModel[283].rotateAngleX = 0.9250245F;
		bodyModel[283].rotateAngleY = 0.01745329F;
		bodyModel[283].rotateAngleZ = -0.03490659F;

		bodyModel[284].addShapeBox(-0.4F, 3F, -0.8F, 3, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -1.45F, 0F, -0.2F, -1.45F, 0F, -0.2F, -0.2F, -0.25F, -0.2F); // Box 511
		bodyModel[284].setRotationPoint(1F, -19F, -22.1F);
		bodyModel[284].rotateAngleX = -0.85521133F;
		bodyModel[284].rotateAngleY = -0.05235988F;
		bodyModel[284].rotateAngleZ = -0.17453293F;

		bodyModel[285].addShapeBox(-0.4F, 2F, -0.8F, 3, 1, 1, 0F, -0.2F, -0.25F, -0.2F, -1.45F, 0F, -0.2F, -1.45F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F); // Box 512
		bodyModel[285].setRotationPoint(1F, -19F, -22.1F);
		bodyModel[285].rotateAngleX = -0.85521133F;
		bodyModel[285].rotateAngleY = -0.05235988F;
		bodyModel[285].rotateAngleZ = -0.17453293F;

		bodyModel[286].addShapeBox(-10F, 2.5F, -0.8F, 10, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 513
		bodyModel[286].setRotationPoint(1F, -19F, -22.1F);
		bodyModel[286].rotateAngleX = -0.85521133F;
		bodyModel[286].rotateAngleY = 0.03490659F;

		bodyModel[287].addShapeBox(-3F, 2.5F, -0.8F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 514
		bodyModel[287].setRotationPoint(1F, -19F, -22.1F);
		bodyModel[287].rotateAngleX = -0.85521133F;
		bodyModel[287].rotateAngleY = 0.03490659F;

		bodyModel[288].addShapeBox(-8F, 2.5F, -0.8F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 515
		bodyModel[288].setRotationPoint(1F, -19F, -22.1F);
		bodyModel[288].rotateAngleX = -0.85521133F;
		bodyModel[288].rotateAngleY = 0.03490659F;

		bodyModel[289].addShapeBox(-9F, 2.5F, -0.8F, 10, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 580
		bodyModel[289].setRotationPoint(1F, -19F, -22.1F);
		bodyModel[289].rotateAngleX = -0.85521133F;
		bodyModel[289].rotateAngleY = -0.20943951F;
		bodyModel[289].rotateAngleZ = -0.17453293F;

		bodyModel[290].addShapeBox(-2F, 2.5F, -0.8F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 581
		bodyModel[290].setRotationPoint(1F, -19F, -22.1F);
		bodyModel[290].rotateAngleX = -0.85521133F;
		bodyModel[290].rotateAngleY = -0.20943951F;
		bodyModel[290].rotateAngleZ = -0.17453293F;

		bodyModel[291].addShapeBox(-7F, 2.5F, -0.8F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 582
		bodyModel[291].setRotationPoint(1F, -19F, -22.1F);
		bodyModel[291].rotateAngleX = -0.85521133F;
		bodyModel[291].rotateAngleY = -0.20943951F;
		bodyModel[291].rotateAngleZ = -0.17453293F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[292].setRotationPoint(-55.3F, -17.2F, 20.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 208
		bodyModel[293].setRotationPoint(-55.3F, -15.2F, 20.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[294].setRotationPoint(-55.3F, -16.2F, 20.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[295].setRotationPoint(-60F, -13F, -12F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 2, 24, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 215
		bodyModel[296].setRotationPoint(-60F, -11F, -12F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 6, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[297].setRotationPoint(-59F, -10F, -12F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[298].setRotationPoint(-59F, -13F, -12F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[299].setRotationPoint(-59F, -13F, 11F);

		bodyModel[300].addShapeBox(0F, 1F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[300].setRotationPoint(-58F, -8.5F, -1F);
		bodyModel[300].rotateAngleZ = 0.20943951F;

		bodyModel[301].addShapeBox(0F, 1F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 220
		bodyModel[301].setRotationPoint(-56F, -7.5F, -1F);
		bodyModel[301].rotateAngleZ = 0.20943951F;

		bodyModel[302].addShapeBox(0F, 1F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[302].setRotationPoint(-58F, -5.5F, -1F);
		bodyModel[302].rotateAngleZ = 0.20943951F;

		bodyModel[303].addShapeBox(0F, 1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[303].setRotationPoint(-58F, -6.5F, -1F);
		bodyModel[303].rotateAngleZ = 0.20943951F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 223
		bodyModel[304].setRotationPoint(-55F, -6.5F, -3F);
		bodyModel[304].rotateAngleZ = 0.20943951F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[305].setRotationPoint(-59F, -11F, 2.5F);
		bodyModel[305].rotateAngleX = 1.30899694F;
		bodyModel[305].rotateAngleY = -1.57079633F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[306].setRotationPoint(-55.3F, -17.2F, -23.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 610
		bodyModel[307].setRotationPoint(-55.3F, -15.2F, -23.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[308].setRotationPoint(-55.3F, -16.2F, -23.5F);

		bodyModel[309].addShapeBox(-3.5F, 0.5F, 17F, 41, 41, 1, 0F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, -34F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, 0F, -34F, 0F); // Box 584
		bodyModel[309].setRotationPoint(33F, -1.25F, 0F);
		bodyModel[309].rotateAngleX = 0.82030475F;
		bodyModel[309].rotateAngleY = -1.57079633F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 301, textureX, textureY); // Box 256
		turretModel[1] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 257
		turretModel[2] = new ModelRendererTurbo(this, 17, 59, textureX, textureY); // Box 259
		turretModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 260
		turretModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 261
		turretModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 262
		turretModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 263
		turretModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 264
		turretModel[8] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 1124
		turretModel[9] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 1125
		turretModel[10] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 1126
		turretModel[11] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 1127
		turretModel[12] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 1128
		turretModel[13] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 1130
		turretModel[14] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 1141
		turretModel[15] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 1142
		turretModel[16] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 1145
		turretModel[17] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 1146
		turretModel[18] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 1148
		turretModel[19] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 1150
		turretModel[20] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 1151
		turretModel[21] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 1152
		turretModel[22] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 1155
		turretModel[23] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 1156
		turretModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1157
		turretModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 1159
		turretModel[26] = new ModelRendererTurbo(this, 58, 16, textureX, textureY); // Box 1161
		turretModel[27] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1162
		turretModel[28] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 1163
		turretModel[29] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 1164
		turretModel[30] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 1165
		turretModel[31] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 1166
		turretModel[32] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 1172
		turretModel[33] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 1173
		turretModel[34] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 1169
		turretModel[35] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1170
		turretModel[36] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 1171
		turretModel[37] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 1172
		turretModel[38] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 1173
		turretModel[39] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 1174
		turretModel[40] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 1175
		turretModel[41] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1176
		turretModel[42] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 0
		turretModel[43] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 2
		turretModel[44] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 3
		turretModel[45] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 0
		turretModel[46] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 4
		turretModel[47] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 7
		turretModel[48] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 9
		turretModel[49] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 13
		turretModel[50] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 14
		turretModel[51] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 15
		turretModel[52] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 16
		turretModel[53] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 17
		turretModel[54] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 18
		turretModel[55] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 19
		turretModel[56] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 21
		turretModel[57] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 0
		turretModel[58] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 1
		turretModel[59] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 2
		turretModel[60] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 3
		turretModel[61] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 4
		turretModel[62] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 5
		turretModel[63] = new ModelRendererTurbo(this, 84, 25, textureX, textureY); // Box 6
		turretModel[64] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 7
		turretModel[65] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 8
		turretModel[66] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 9
		turretModel[67] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		turretModel[68] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 11
		turretModel[69] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 12
		turretModel[70] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 1134
		turretModel[71] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 18
		turretModel[72] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 21
		turretModel[73] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 22
		turretModel[74] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 23
		turretModel[75] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 0
		turretModel[76] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 1
		turretModel[77] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 2
		turretModel[78] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 3
		turretModel[79] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 4
		turretModel[80] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 5
		turretModel[81] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 6
		turretModel[82] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 22
		turretModel[83] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 23
		turretModel[84] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 24
		turretModel[85] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 25
		turretModel[86] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 26
		turretModel[87] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 27
		turretModel[88] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 28
		turretModel[89] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 29
		turretModel[90] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 30
		turretModel[91] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 70
		turretModel[92] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 71
		turretModel[93] = new ModelRendererTurbo(this, 165, 200, textureX, textureY); // Box 1
		turretModel[94] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 2
		turretModel[95] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 3
		turretModel[96] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 4
		turretModel[97] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 5
		turretModel[98] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 6
		turretModel[99] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 8
		turretModel[100] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 9
		turretModel[101] = new ModelRendererTurbo(this, 35, 27, textureX, textureY); // Box 10
		turretModel[102] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 11
		turretModel[103] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 24
		turretModel[104] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 25
		turretModel[105] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 7
		turretModel[106] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 8
		turretModel[107] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 11
		turretModel[108] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		turretModel[109] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 14
		turretModel[110] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 15
		turretModel[111] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 16
		turretModel[112] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 17
		turretModel[113] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Box 18
		turretModel[114] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 19
		turretModel[115] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 20
		turretModel[116] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 21
		turretModel[117] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Box 22
		turretModel[118] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 23
		turretModel[119] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 24
		turretModel[120] = new ModelRendererTurbo(this, 190, 54, textureX, textureY); // Box 0
		turretModel[121] = new ModelRendererTurbo(this, 49, 6, textureX, textureY); // Box 15
		turretModel[122] = new ModelRendererTurbo(this, 49, 6, textureX, textureY); // Box 16
		turretModel[123] = new ModelRendererTurbo(this, 49, 6, textureX, textureY); // Box 17
		turretModel[124] = new ModelRendererTurbo(this, 49, 6, textureX, textureY); // Box 18
		turretModel[125] = new ModelRendererTurbo(this, 58, 19, textureX, textureY); // Box 19
		turretModel[126] = new ModelRendererTurbo(this, 35, 5, textureX, textureY); // Box 24
		turretModel[127] = new ModelRendererTurbo(this, 380, 244, textureX, textureY); // Box 4
		turretModel[128] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 5
		turretModel[129] = new ModelRendererTurbo(this, 356, 244, textureX, textureY); // Box 6
		turretModel[130] = new ModelRendererTurbo(this, 399, 243, textureX, textureY); // Box 3
		turretModel[131] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 561
		turretModel[132] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 562
		turretModel[133] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 563
		turretModel[134] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 565
		turretModel[135] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 566
		turretModel[136] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 567
		turretModel[137] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 568
		turretModel[138] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 569
		turretModel[139] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 570
		turretModel[140] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 571
		turretModel[141] = new ModelRendererTurbo(this, 17, 288, textureX, textureY); // Box 584
		turretModel[142] = new ModelRendererTurbo(this, 48, 289, textureX, textureY); // Box 585
		turretModel[143] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 586
		turretModel[144] = new ModelRendererTurbo(this, 242, 240, textureX, textureY); // Box 587
		turretModel[145] = new ModelRendererTurbo(this, 168, 53, textureX, textureY); // Box 587
		turretModel[146] = new ModelRendererTurbo(this, 167, 53, textureX, textureY); // Box 588
		turretModel[147] = new ModelRendererTurbo(this, 219, 75, textureX, textureY); // Box 589
		turretModel[148] = new ModelRendererTurbo(this, 168, 53, textureX, textureY); // Box 590
		turretModel[149] = new ModelRendererTurbo(this, 179, 54, textureX, textureY); // Box 591
		turretModel[150] = new ModelRendererTurbo(this, 161, 385, textureX, textureY); // Box 0
		turretModel[151] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 585
		turretModel[152] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 586
		turretModel[153] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 587

		turretModel[0].addShapeBox(-14.5F, 3.5F, 8.5F, 2, 5, 6, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		turretModel[0].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[1].addShapeBox(1.5F, 3.5F, 8.5F, 2, 3, 6, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		turretModel[1].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[2].addShapeBox(-8.5F, 3.5F, 2.5F, 6, 3, 2, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		turretModel[2].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[3].addShapeBox(-8.5F, 3.5F, 18.5F, 6, 5, 2, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		turretModel[3].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[4].addShapeBox(-2.5F, 3.5F, 18.5F, 6, 5, 2, 0F, 0F, 0.1F, 0F, -2F, 0.1F, 4F, 0F, 0.1F, -6F, 0F, 0.1F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 261
		turretModel[4].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[5].addShapeBox(-14.5F, 3.5F, 18.5F, 6, 5, 2, 0F, -2F, 0.1F, 4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -6F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 262
		turretModel[5].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[6].addShapeBox(-14.5F, 3.5F, 2.5F, 6, 3, 2, 0F, 0F, 0.1F, -6F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -2F, 0.1F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 4F); // Box 263
		turretModel[6].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[7].addShapeBox(-2.5F, 3.5F, 2.5F, 6, 3, 2, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -6F, -2F, 0.1F, 4F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 4F, 0F, 0F, 0F); // Box 264
		turretModel[7].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[8].addBox(17F, -1.5F, -5.5F, 7, 3, 11, 0F); // Box 1124
		turretModel[8].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[9].addShapeBox(17F, -2.5F, -5.5F, 7, 1, 11, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1125
		turretModel[9].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[10].addShapeBox(17F, -3.5F, -5.5F, 7, 1, 11, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 1126
		turretModel[10].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[11].addShapeBox(17F, -4.5F, -5.5F, 7, 1, 11, 0F, 0F, 0F, 0F, -3.7F, 0F, 0F, -3.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F); // Box 1127
		turretModel[11].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[12].addShapeBox(17F, -1.5F, -8.5F, 7, 3, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1128
		turretModel[12].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[13].addShapeBox(17F, -3.5F, -8.5F, 6, 2, 3, 0F, 0F, 0F, -0.25F, -3.7F, 0F, -0.25F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 1130
		turretModel[13].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[14].addShapeBox(17F, -3.5F, 5.5F, 6, 2, 3, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -3.7F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1141
		turretModel[14].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[15].addShapeBox(17F, -1.5F, 5.5F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1142
		turretModel[15].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[16].addShapeBox(17F, 1.5F, -8.5F, 7, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.7F, 0F, -0.25F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 1145
		turretModel[16].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[17].addShapeBox(17F, 1.5F, 5.5F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -1.7F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 1146
		turretModel[17].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[18].addShapeBox(17F, 1.5F, -5.5F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 1148
		turretModel[18].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[19].addShapeBox(17F, 2.5F, -8.5F, 7, 1, 3, 0F, 0F, 0F, -0.25F, -1.7F, 0F, -0.25F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.7F, 0F, -0.75F, -1.7F, 0F, 0F, 0F, 0F, 0F); // Box 1150
		turretModel[19].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[20].addShapeBox(17F, 2.5F, -5.5F, 7, 1, 11, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F); // Box 1151
		turretModel[20].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[21].addShapeBox(17F, 2.5F, 5.5F, 7, 1, 3, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -1.7F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1.7F, 0F, 0F, -2.7F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 1152
		turretModel[21].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[22].addShapeBox(17F, 3.5F, 5.5F, 7, 1, 3, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -2.7F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3.7F, 0F, 0F, -3.7F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 1155
		turretModel[22].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[23].addShapeBox(17F, 3.5F, -5.5F, 7, 1, 11, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.7F, 0F, 0F, -3.7F, 0F, 0F, 0F, 0F, 0F); // Box 1156
		turretModel[23].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[24].addShapeBox(17F, 3.5F, -8.5F, 7, 1, 3, 0F, 0F, 0F, -0.75F, -2.7F, 0F, -0.75F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3.7F, 0F, -1.5F, -3.7F, 0F, 0F, 0F, 0F, 0F); // Box 1157
		turretModel[24].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[25].addShapeBox(22F, -1.5F, 7.5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 1159
		turretModel[25].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[26].addShapeBox(22F, -0.1F, 7.5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 1161
		turretModel[26].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[27].addShapeBox(23.8F, -0.8F, 7.5F, 1, 1, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 1162
		turretModel[27].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[28].addShapeBox(22F, -1.5F, -8.5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 1163
		turretModel[28].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[29].addShapeBox(22F, -0.1F, -8.5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 1164
		turretModel[29].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[30].addShapeBox(23.8F, -0.8F, -8.5F, 1, 1, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 1165
		turretModel[30].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[31].addShapeBox(-32F, -5.5F, -14F, 19, 8, 28, 0F, -2F, 0F, -6F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -2F, 0F, -6F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F); // Box 1166
		turretModel[31].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[32].addShapeBox(17.5F, -5.5F, -14F, 6, 13, 28, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F); // Box 1172
		turretModel[32].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[33].addShapeBox(12.5F, -5.5F, -18F, 5, 13, 1, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1173
		turretModel[33].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[34].addShapeBox(7.5F, -5.5F, -16F, 5, 13, 1, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 1169
		turretModel[34].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[35].addShapeBox(2.5F, -5.5F, -17F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1170
		turretModel[35].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[36].addShapeBox(7.5F, -5.5F, 15F, 5, 13, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 5F); // Box 1171
		turretModel[36].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[37].addShapeBox(2.5F, -5.5F, 16F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 1172
		turretModel[37].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[38].addShapeBox(-2.5F, -5.5F, -16F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -4F); // Box 1173
		turretModel[38].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[39].addShapeBox(-7.5F, -5.5F, -15F, 5, 13, 1, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 1174
		turretModel[39].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[40].addShapeBox(-13.5F, -5.5F, -13F, 6, 8, 1, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F); // Box 1175
		turretModel[40].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[41].addShapeBox(-13.5F, 2.5F, -18F, 6, 5, 1, 0F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 1176
		turretModel[41].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[42].addShapeBox(-8.5F, 8.5F, 18.5F, 6, 5, 2, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		turretModel[42].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[43].addShapeBox(-14.5F, 8.5F, 18.5F, 6, 5, 2, 0F, -2F, 0.1F, 4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -6F, -2F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 2
		turretModel[43].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[44].addShapeBox(-14.5F, 4.5F, 8.5F, 2, 5, 6, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[44].setRotationPoint(-3F, -32.5F, 0F);

		turretModel[45].addShapeBox(-2.5F, 8.5F, 18.5F, 6, 5, 2, 0F, 0F, 0.1F, 0F, -2F, 0.1F, 4F, 0F, 0.1F, -6F, 0F, 0.1F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 0
		turretModel[45].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[46].addShapeBox(-2.5F, -5.5F, 15F, 5, 13, 1, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 4F); // Box 4
		turretModel[46].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[47].addShapeBox(-13.5F, 2.5F, 17F, 6, 5, 1, 0F, 0F, 0F, 4F, 0F, 0F, 1.5F, 0F, 0F, -1.2F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 7
		turretModel[47].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[48].addShapeBox(-7.5F, 1.5F, 14F, 5, 6, 1, 0F, 0F, 0F, -1.5F, 1.7F, 0F, -3F, 1.35F, 0F, 3.2F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 3F); // Box 9
		turretModel[48].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[49].addShapeBox(-13.5F, 1.5F, 10F, 6, 1, 1, 0F, 0F, 0F, -2.5F, 0F, 0F, -5.5F, 0F, 0F, 5.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -5.5F, 0F, 0F, 5.8F, 0F, 0F, 3F); // Box 13
		turretModel[49].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[50].addShapeBox(-14.5F, 10.5F, 12.5F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 14
		turretModel[50].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[51].addShapeBox(-8.5F, 10.5F, 12.5F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[51].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[52].addShapeBox(-2.5F, 10.5F, 12.5F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 16
		turretModel[52].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[53].addShapeBox(-13.5F, 10.5F, 7.5F, 15, 1, 5, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[53].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[54].addShapeBox(-14.5F, -0.49F, 5.5F, 2, 9, 3, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 18
		turretModel[54].setRotationPoint(-3F, -32.5F, 0F);

		turretModel[55].addShapeBox(-14.5F, 8.5F, -14.5F, 1, 5, 29, 0F, 0F, 0.1F, -2.9F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -2.9F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 19
		turretModel[55].setRotationPoint(-3F, -32.5F, 0F);

		turretModel[56].addShapeBox(-20.5F, 8.5F, -13F, 6, 5, 26, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F); // Box 21
		turretModel[56].setRotationPoint(-3F, -32.5F, 0F);

		turretModel[57].addShapeBox(12.5F, -5.5F, -18F, 5, 1, 36, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 0
		turretModel[57].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[58].addShapeBox(12.5F, -5.5F, 17F, 5, 13, 1, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 1
		turretModel[58].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[59].addShapeBox(13.5F, -8.5F, -0.5F, 1, 3, 1, 0F, 4F, -0.4F, -0.3F, -5F, 0F, -0.3F, -5F, 0F, -0.3F, 4F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 2
		turretModel[59].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[60].addShapeBox(-16.5F, -8.5F, -0.5F, 1, 3, 1, 0F, -5F, 0F, -0.3F, 4F, -0.4F, -0.3F, 4F, -0.4F, -0.3F, -5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 3
		turretModel[60].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[61].addShapeBox(-11.5F, -8.8F, -0.5F, 21, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 4
		turretModel[61].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[62].addShapeBox(14.5F, -7.8F, 2F, 1, 1, 10, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 5
		turretModel[62].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[63].addShapeBox(14.5F, -7.5F, 1.3F, 1, 2, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 6
		turretModel[63].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[64].addShapeBox(14.5F, -7.5F, 11.7F, 1, 2, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 7
		turretModel[64].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[65].addShapeBox(4.5F, -7.5F, -5.3F, 1, 2, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 8
		turretModel[65].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[66].addShapeBox(4.5F, -7.5F, -11.7F, 1, 2, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 9
		turretModel[66].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[67].addShapeBox(4.5F, -7.8F, -11F, 1, 1, 6, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 10
		turretModel[67].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[68].addShapeBox(14.5F, -5.8F, 7F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[68].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[69].addShapeBox(17.5F, -6.8F, 1.75F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[69].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[69].rotateAngleY = 0.33161256F;

		turretModel[70].addShapeBox(17F, -4.5F, -8.5F, 7, 1, 3, 0F, 0F, 0F, -1.5F, -5F, 0F, -1.5F, -3.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -4.7F, 0F, -0.2F, -1.7F, 0F, 0F, 0F, 0F, 0F); // Box 1134
		turretModel[70].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[71].addShapeBox(17F, -4.5F, 5.5F, 7, 1, 3, 0F, 0F, 0F, 0F, -3.7F, 0F, 0F, -5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.7F, 0F, 0F, -4.7F, 0F, -0.2F, 0F, 0F, -0.75F); // Box 18
		turretModel[71].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[72].addShapeBox(2.5F, -5.5F, -16F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		turretModel[72].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[73].addShapeBox(7.5F, -5.5F, -16F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[73].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[74].addShapeBox(1.5F, 4.6F, 18.5F, 4, 9, 2, 0F, -2F, 0.1F, 3.9F, 0F, 0.1F, 2.4F, -4F, 0.1F, -4F, 0F, 0.1F, -6F, -2F, 0F, 3.9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5.9F); // Box 23
		turretModel[74].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[75].addShapeBox(3F, -3.5F, -16F, 11, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[75].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[76].addShapeBox(3F, -2.5F, -16F, 11, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[76].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[77].addShapeBox(3F, -2.5F, -5F, 11, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		turretModel[77].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[78].addShapeBox(3F, 3.5F, -5F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[78].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[79].addShapeBox(3F, 3.5F, -16F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		turretModel[79].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[80].addShapeBox(3F, 2.5F, -16F, 11, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[80].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[81].addShapeBox(3F, 6.5F, -16F, 11, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[81].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[82].addShapeBox(1.2F, 4.5F, -8.2F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[82].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[83].addShapeBox(1.2F, 3.5F, -8.2F, 8, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		turretModel[83].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[84].addShapeBox(1.2F, 5.5F, -8.2F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 24
		turretModel[84].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[85].addShapeBox(0.6F, 4.5F, -14.8F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[85].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[85].rotateAngleY = 0.05235988F;

		turretModel[86].addShapeBox(0.6F, 3.5F, -14.8F, 8, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[86].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[86].rotateAngleY = 0.05235988F;

		turretModel[87].addShapeBox(0.6F, 5.5F, -14.8F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 27
		turretModel[87].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[87].rotateAngleY = 0.05235988F;

		turretModel[88].addShapeBox(2.5F, 4.5F, -11.5F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[88].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[88].rotateAngleY = -0.08726646F;

		turretModel[89].addShapeBox(2.5F, 3.5F, -11.5F, 8, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[89].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[89].rotateAngleY = -0.08726646F;

		turretModel[90].addShapeBox(2.5F, 5.5F, -11.5F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 30
		turretModel[90].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[90].rotateAngleY = -0.08726646F;

		turretModel[91].addShapeBox(7.2F, -6.8F, -8F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		turretModel[91].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[91].rotateAngleY = -0.20943951F;

		turretModel[92].addShapeBox(4.5F, -5.8F, -10F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		turretModel[92].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[93].addShapeBox(-12.5F, 18.5F, -10.5F, 10, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[93].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[94].addShapeBox(-13.5F, 18.5F, -9.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		turretModel[94].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[95].addShapeBox(-13.5F, 18.5F, -2.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[95].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[96].addShapeBox(-13.5F, 18.5F, -2.5F, 3, 1, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 4
		turretModel[96].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[97].addShapeBox(-13.5F, 18.5F, -9.5F, 3, 1, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 5
		turretModel[97].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[98].addShapeBox(5.5F, 18.5F, 3F, 10, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[98].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[99].addShapeBox(7.5F, 18.5F, 13F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 8
		turretModel[99].setRotationPoint(0F, -36.5F, 0F);

		turretModel[100].addShapeBox(4.5F, 18.5F, 13F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 9
		turretModel[100].setRotationPoint(0F, -36.5F, 0F);

		turretModel[101].addShapeBox(4.5F, 16.5F, 17F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		turretModel[101].setRotationPoint(0F, -36.5F, 0F);

		turretModel[102].addShapeBox(7.5F, 16.5F, 17F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[102].setRotationPoint(0F, -36.5F, 0F);

		turretModel[103].addShapeBox(-14.5F, 13.5F, 16.5F, 6, 2, 2, 0F, 0F, 0.1F, 4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 24
		turretModel[103].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[104].addShapeBox(-8.5F, 13.5F, 16.5F, 6, 2, 2, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 25
		turretModel[104].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[105].addShapeBox(-32.8F, -2.5F, -24F, 19, 1, 16, 0F, -0.5F, -0.2F, -11.2F, 1F, -0.2F, -11.2F, 0F, -0.2F, -4.2F, -0.5F, -0.2F, -4.2F, -0.5F, -0.2F, -11.2F, 0.8F, -0.2F, -11.2F, -0.2F, -0.2F, -4.2F, -0.5F, -0.2F, -4.2F); // Box 7
		turretModel[105].setRotationPoint(0F, -27.5F, 0F);

		turretModel[106].addShapeBox(-33F, -2.5F, -13F, 1, 1, 5, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 8
		turretModel[106].setRotationPoint(0F, -27.5F, 0F);

		turretModel[107].addShapeBox(-32F, 1.5F, -13F, 1, 1, 4, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 11
		turretModel[107].setRotationPoint(0F, -27.5F, 0F);

		turretModel[108].addShapeBox(-33F, -1.9F, -13F, 1, 4, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1.2F, -0.4F, -0.2F, 0.8F, -0.4F, -0.2F, 0.8F, -0.4F, -0.2F, -1.2F, -0.4F, -0.2F); // Box 13
		turretModel[108].setRotationPoint(0F, -27.5F, 0F);

		turretModel[109].addShapeBox(-29F, -1.9F, -13F, 1, 4, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 14
		turretModel[109].setRotationPoint(0F, -27.5F, 0F);

		turretModel[110].addShapeBox(-31.8F, 1.5F, -24F, 13, 1, 16, 0F, -0.5F, -0.2F, -11.2F, 0F, -0.2F, -11.2F, 0F, -0.2F, -4.2F, -0.5F, -0.2F, -4.2F, -0.5F, -0.2F, -11.2F, 0F, -0.2F, -11.2F, 0F, -0.2F, -4.2F, -0.5F, -0.2F, -4.2F); // Box 15
		turretModel[110].setRotationPoint(0F, -27.5F, 0F);

		turretModel[111].addShapeBox(-25F, -1.9F, -13F, 1, 4, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 16
		turretModel[111].setRotationPoint(0F, -27.5F, 0F);

		turretModel[112].addShapeBox(-21F, -1.9F, -13F, 1, 4, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 17
		turretModel[112].setRotationPoint(0F, -27.5F, 0F);

		turretModel[113].addShapeBox(-32.8F, -2.5F, 1F, 16, 1, 16, 0F, -0.5F, -0.2F, -11.2F, 0F, -0.2F, -11.2F, 0F, -0.2F, -4.2F, -0.5F, -0.2F, -4.2F, -0.5F, -0.2F, -11.2F, 0F, -0.2F, -11.2F, 0F, -0.2F, -4.2F, -0.5F, -0.2F, -4.2F); // Box 18
		turretModel[113].setRotationPoint(0F, -27.5F, 0F);

		turretModel[114].addShapeBox(-29F, -1.9F, 12F, 1, 4, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 19
		turretModel[114].setRotationPoint(0F, -27.5F, 0F);

		turretModel[115].addShapeBox(-25F, -1.9F, 12F, 1, 4, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 20
		turretModel[115].setRotationPoint(0F, -27.5F, 0F);

		turretModel[116].addShapeBox(-21F, -1.9F, 12F, 1, 4, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 21
		turretModel[116].setRotationPoint(0F, -27.5F, 0F);

		turretModel[117].addShapeBox(-31.8F, 1.5F, 1F, 13, 1, 16, 0F, -0.5F, -0.2F, -11.2F, 0F, -0.2F, -11.2F, 0F, -0.2F, -4.2F, -0.5F, -0.2F, -4.2F, -0.5F, -0.2F, -11.2F, 0F, -0.2F, -11.2F, 0F, -0.2F, -4.2F, -0.5F, -0.2F, -4.2F); // Box 22
		turretModel[117].setRotationPoint(0F, -27.5F, 0F);

		turretModel[118].addShapeBox(-33F, -2.5F, 8F, 1, 1, 5, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 23
		turretModel[118].setRotationPoint(0F, -27.5F, 0F);

		turretModel[119].addShapeBox(-32F, 1.5F, 7F, 1, 1, 4, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 24
		turretModel[119].setRotationPoint(0F, -27.5F, 2F);

		turretModel[120].addShapeBox(-33F, -1.9F, 12F, 1, 4, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1.2F, -0.4F, -0.2F, 0.8F, -0.4F, -0.2F, 0.8F, -0.4F, -0.2F, -1.2F, -0.4F, -0.2F); // Box 0
		turretModel[120].setRotationPoint(0F, -27.5F, 0F);

		turretModel[121].addShapeBox(2.5F, 2.5F, 9F, 1, 2, 1, 0F, -2F, 0.1F, 0F, 2F, 0.1F, 0F, 2F, 0.1F, 0F, -2F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[121].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[122].addShapeBox(2.5F, 2.5F, 12F, 1, 2, 1, 0F, -2F, 0.1F, 0F, 2F, 0.1F, 0F, 2F, 0.1F, 0F, -2F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		turretModel[122].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[123].addShapeBox(4.5F, 0.5F, 12F, 1, 2, 1, 0F, -4F, 0.1F, 0F, 4F, 0.1F, 0F, 4F, 0.1F, 0F, -4F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[123].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[124].addShapeBox(4.5F, 0.5F, 9F, 1, 2, 1, 0F, -4F, 0.1F, 0F, 4F, 0.1F, 0F, 4F, 0.1F, 0F, -4F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		turretModel[124].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[125].addShapeBox(8.5F, -0.5F, 9F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		turretModel[125].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[126].addShapeBox(8.5F, -2.5F, 10.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 24
		turretModel[126].setRotationPoint(-3F, -36.5F, 0F);

		turretModel[127].addShapeBox(-4F, 4F, -20.5F, 8, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		turretModel[127].setRotationPoint(0F, -26.5F, 0F);
		turretModel[127].rotateAngleX = -0.33161256F;

		turretModel[128].addShapeBox(-0.5F, 4.7F, -20.9F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[128].setRotationPoint(0F, -26.5F, 0F);
		turretModel[128].rotateAngleX = -0.33161256F;

		turretModel[129].addShapeBox(-4F, 2.7F, -20.5F, 8, 3, 3, 0F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 6
		turretModel[129].setRotationPoint(0F, -26.5F, 0F);
		turretModel[129].rotateAngleX = -0.33161256F;

		turretModel[130].addShapeBox(-4F, 4F, -19.5F, 8, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[130].setRotationPoint(0F, -26.5F, 0F);
		turretModel[130].rotateAngleX = -0.33161256F;

		turretModel[131].addShapeBox(-1F, 9F, 18.5F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -1F, 0F, -0.7F, -1F); // Box 561
		turretModel[131].setRotationPoint(0F, -26.5F, 0F);
		turretModel[131].rotateAngleX = 0.29670597F;
		turretModel[131].rotateAngleY = -0.31415927F;

		turretModel[132].addShapeBox(-1F, 4F, 18.5F, 1, 5, 4, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, 0F, 0F, -1F); // Box 562
		turretModel[132].setRotationPoint(0F, -26.5F, 0F);
		turretModel[132].rotateAngleX = 0.29670597F;
		turretModel[132].rotateAngleY = -0.31415927F;

		turretModel[133].addShapeBox(8F, 4F, 18.5F, 1, 5, 4, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, 0F, -1F); // Box 563
		turretModel[133].setRotationPoint(0F, -26.5F, 0F);
		turretModel[133].rotateAngleX = 0.29670597F;
		turretModel[133].rotateAngleY = -0.31415927F;

		turretModel[134].addShapeBox(-1.5F, 4F, 21.5F, 11, 5, 1, 0F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, -1F, -0.8F, 0F, -1F); // Box 565
		turretModel[134].setRotationPoint(0F, -26.5F, 0F);
		turretModel[134].rotateAngleX = 0.29670597F;
		turretModel[134].rotateAngleY = -0.31415927F;

		turretModel[135].addShapeBox(-1.5F, 4F, 18F, 11, 5, 1, 0F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, 0F, 0F); // Box 566
		turretModel[135].setRotationPoint(0F, -26.5F, 0F);
		turretModel[135].rotateAngleX = 0.29670597F;
		turretModel[135].rotateAngleY = -0.31415927F;

		turretModel[136].addShapeBox(-9F, 4.5F, 18.5F, 1, 5, 4, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, 0F, 0F, -1F); // Box 567
		turretModel[136].setRotationPoint(0F, -26.5F, 0F);
		turretModel[136].rotateAngleX = 0.29670597F;
		turretModel[136].rotateAngleY = -2.84488668F;

		turretModel[137].addShapeBox(-9.5F, 4.5F, 21.5F, 11, 5, 1, 0F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, -1F, -0.8F, 0F, -1F); // Box 568
		turretModel[137].setRotationPoint(0F, -26.5F, 0F);
		turretModel[137].rotateAngleX = 0.29670597F;
		turretModel[137].rotateAngleY = -2.84488668F;

		turretModel[138].addShapeBox(-9.5F, 4.5F, 18F, 11, 5, 1, 0F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, 0F, 0F); // Box 569
		turretModel[138].setRotationPoint(0F, -26.5F, 0F);
		turretModel[138].rotateAngleX = 0.29670597F;
		turretModel[138].rotateAngleY = -2.84488668F;

		turretModel[139].addShapeBox(0F, 4.5F, 18.5F, 1, 5, 4, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, 0F, -1F); // Box 570
		turretModel[139].setRotationPoint(0F, -26.5F, 0F);
		turretModel[139].rotateAngleX = 0.29670597F;
		turretModel[139].rotateAngleY = -2.84488668F;

		turretModel[140].addShapeBox(-9F, 9.5F, 18.5F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -1F, 0F, -0.7F, -1F); // Box 571
		turretModel[140].setRotationPoint(0F, -26.5F, 0F);
		turretModel[140].rotateAngleX = 0.29670597F;
		turretModel[140].rotateAngleY = -2.84488668F;

		turretModel[141].addShapeBox(-5F, 1.5F, -39.3F, 11, 6, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		turretModel[141].setRotationPoint(0F, -23.5F, 0F);
		turretModel[141].rotateAngleX = -0.2268928F;
		turretModel[141].rotateAngleY = -1.57079633F;

		turretModel[142].addShapeBox(-5F, 0.199999999999999F, -39.3F, 11, 3, 5, 0F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 585
		turretModel[142].setRotationPoint(0F, -23.5F, 0F);
		turretModel[142].rotateAngleX = -0.2268928F;
		turretModel[142].rotateAngleY = -1.57079633F;

		turretModel[143].addShapeBox(0F, 2.2F, -39.7F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		turretModel[143].setRotationPoint(0F, -23.5F, 0F);
		turretModel[143].rotateAngleX = -0.2268928F;
		turretModel[143].rotateAngleY = -1.57079633F;

		turretModel[144].addShapeBox(-5F, 1.5F, -37.3F, 11, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		turretModel[144].setRotationPoint(0F, -23.5F, 0F);
		turretModel[144].rotateAngleX = -0.2268928F;
		turretModel[144].rotateAngleY = -1.57079633F;

		turretModel[145].addShapeBox(-18F, -6.5F, 5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 587
		turretModel[145].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[146].addShapeBox(-18F, -7.5F, 5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		turretModel[146].setRotationPoint(-3F, -26.5F, 0F);

		turretModel[147].addShapeBox(-9F, -54.5F, 6F, 1, 38, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 589
		turretModel[147].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[147].rotateAngleZ = 0.68067841F;

		turretModel[148].addShapeBox(-9F, -18.5F, 6F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 590
		turretModel[148].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[148].rotateAngleZ = 0.68067841F;

		turretModel[149].addShapeBox(-9F, -19.5F, 6F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 591
		turretModel[149].setRotationPoint(-3F, -26.5F, 0F);
		turretModel[149].rotateAngleZ = 0.68067841F;

		turretModel[150].addShapeBox(-3F, 3F, 17F, 41, 41, 1, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 0
		turretModel[150].setRotationPoint(1F, -26.5F, 0F);
		turretModel[150].rotateAngleX = 0.29670597F;

		turretModel[151].addShapeBox(5.2F, 5.5F, -10.2F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 585
		turretModel[151].setRotationPoint(-3F, -30.5F, 0F);
		turretModel[151].rotateAngleY = -0.29670597F;

		turretModel[152].addShapeBox(5.2F, 4.5F, -10.2F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		turretModel[152].setRotationPoint(-3F, -30.5F, 0F);
		turretModel[152].rotateAngleY = -0.29670597F;

		turretModel[153].addShapeBox(5.2F, 3.5F, -10.2F, 8, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		turretModel[153].setRotationPoint(-3F, -30.5F, 0F);
		turretModel[153].rotateAngleY = -0.29670597F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 1080
		barrelModel[1] = new ModelRendererTurbo(this, 50, 2, textureX, textureY); // Box 1127
		barrelModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1127
		barrelModel[3] = new ModelRendererTurbo(this, 13, 4, textureX, textureY); // Box 1115
		barrelModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 1116
		barrelModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 1117
		barrelModel[6] = new ModelRendererTurbo(this, 8, 4, textureX, textureY); // Box 1118
		barrelModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 1119
		barrelModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 1120
		barrelModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 1121
		barrelModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 1122
		barrelModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 1123
		barrelModel[12] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 3
		barrelModel[13] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 4
		barrelModel[14] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 5
		barrelModel[15] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 11
		barrelModel[16] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 14
		barrelModel[17] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 15
		barrelModel[18] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 16
		barrelModel[19] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 19
		barrelModel[20] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 20
		barrelModel[21] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 24
		barrelModel[22] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 25
		barrelModel[23] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 26
		barrelModel[24] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 27
		barrelModel[25] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 28
		barrelModel[26] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 29
		barrelModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 30
		barrelModel[28] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 31
		barrelModel[29] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 32
		barrelModel[30] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 34
		barrelModel[31] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 35
		barrelModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 36
		barrelModel[33] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 31
		barrelModel[34] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 33
		barrelModel[35] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 34
		barrelModel[36] = new ModelRendererTurbo(this, 83, 65, textureX, textureY); // Box 25

		barrelModel[0].addShapeBox(-13F, -1.5F, -1.5F, 64, 3, 3, 0F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 1080
		barrelModel[0].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[1].addBox(2F, -1.5F, -4.5F, 1, 3, 11, 0F); // Box 1127
		barrelModel[1].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[2].addShapeBox(2F, -3.5F, -4.5F, 1, 2, 11, 0F, 0.8F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, -1F, 0.8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1127
		barrelModel[2].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[3].addShapeBox(2F, -2F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 1115
		barrelModel[3].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[4].addShapeBox(2F, 1F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 1116
		barrelModel[4].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[5].addShapeBox(2F, -1F, -1.5F, 2, 2, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 1117
		barrelModel[5].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[6].addShapeBox(2.5F, -1F, 3.5F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 1118
		barrelModel[6].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[7].addShapeBox(-8.5F, -1F, 4.5F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 1119
		barrelModel[7].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[8].addShapeBox(-8.5F, -1F, 2.5F, 12, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1120
		barrelModel[8].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[9].addShapeBox(-8.5F, -2F, 3.5F, 12, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 1121
		barrelModel[9].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[10].addShapeBox(-8.5F, 0F, 3.5F, 12, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1122
		barrelModel[10].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[11].addShapeBox(2F, -2.25F, 2.5F, 2, 1, 3, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1123
		barrelModel[11].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[12].addShapeBox(57F, -0.65F, -2F, 1, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 3
		barrelModel[12].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[13].addShapeBox(57F, -0.65F, 1F, 1, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
		barrelModel[13].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[14].addShapeBox(54F, -1.9F, -1F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
		barrelModel[14].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[15].addShapeBox(54F, 0.85F, -1F, 4, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		barrelModel[15].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[16].addShapeBox(54F, -0.65F, -2F, 1, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		barrelModel[16].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[17].addShapeBox(54F, -0.65F, 1F, 1, 2, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		barrelModel[17].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[18].addShapeBox(52F, -1.9F, -1F, 2, 1, 2, 0F, 0F, -0.8F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, 0.1F); // Box 16
		barrelModel[18].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[19].addShapeBox(52F, 0.85F, -1F, 2, 1, 2, 0F, 0F, -0.2F, 0.1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.1F); // Box 19
		barrelModel[19].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[20].addShapeBox(2F, 1.5F, -4.5F, 1, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, -1F, 0.8F, 0F, -1F); // Box 20
		barrelModel[20].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[21].addShapeBox(-13F, -3.5F, -2.5F, 8, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 24
		barrelModel[21].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[22].addShapeBox(-11F, -2F, -2F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		barrelModel[22].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[23].addShapeBox(-17F, -2F, -2F, 5, 4, 4, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 26
		barrelModel[23].setRotationPoint(19F, -26.5F, 0F);
		barrelModel[23].rotateAngleX = 0.78539816F;

		barrelModel[24].addShapeBox(-27F, -2F, 1F, 4, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 27
		barrelModel[24].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[25].addShapeBox(-27F, 1F, 1F, 4, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 28
		barrelModel[25].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[26].addShapeBox(-24F, -2F, 1F, 1, 4, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 29
		barrelModel[26].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[27].addShapeBox(-27F, -2F, 1F, 1, 4, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 30
		barrelModel[27].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[28].addShapeBox(-20F, -2F, 2F, 1, 4, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 31
		barrelModel[28].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[29].addShapeBox(-23F, -2F, 1F, 3, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F); // Box 32
		barrelModel[29].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[30].addShapeBox(-23F, 1F, 1F, 3, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F); // Box 34
		barrelModel[30].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[31].addShapeBox(-19F, -2F, 1F, 8, 1, 1, 0F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F); // Box 35
		barrelModel[31].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[32].addShapeBox(-19F, 1F, 1F, 8, 1, 1, 0F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F); // Box 36
		barrelModel[32].setRotationPoint(19F, -26.5F, 0F);

		barrelModel[33].addShapeBox(-19F, -2F, 1F, 2, 4, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 31
		barrelModel[33].setRotationPoint(19F, -26.5F, 0F);
		barrelModel[33].rotateAngleX = 0.78539816F;

		barrelModel[34].addShapeBox(-19F, 1F, -1.7F, 2, 1, 3, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 33
		barrelModel[34].setRotationPoint(19F, -26.5F, 0F);
		barrelModel[34].rotateAngleX = 0.78539816F;

		barrelModel[35].addShapeBox(-19F, -2F, -2F, 2, 4, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 34
		barrelModel[35].setRotationPoint(19F, -26.5F, 0F);
		barrelModel[35].rotateAngleX = 0.78539816F;

		barrelModel[36].addShapeBox(51F, -1.5F, -1.5F, 1, 3, 3, 0F, 0F, -0.35F, -0.35F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.35F); // Box 25
		barrelModel[36].setRotationPoint(19F, -26.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 26
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 27
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 28
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 29
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 30
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 31
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 32
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 33
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 34
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 35
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 36
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 37
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 38
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 39
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 40
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 212, 312, textureX, textureY); // Shape 41
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 42
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 43
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 44
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 45
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 165, 318, textureX, textureY); // Shape 46
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 81, 299, textureX, textureY); // Shape 47
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 115, 329, textureX, textureY); // Shape 48
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 115, 329, textureX, textureY); // Shape 49
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 81, 299, textureX, textureY); // Shape 50
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 115, 329, textureX, textureY); // Shape 51
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 81, 299, textureX, textureY); // Shape 52
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 81, 299, textureX, textureY); // Shape 53
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 115, 329, textureX, textureY); // Shape 54

		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 26
		leftTrackWheelModels[0].setRotationPoint(0F, 2.5F, -1F);

		leftTrackWheelModels[1].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 27
		leftTrackWheelModels[1].setRotationPoint(0F, 2.5F, -1F);

		leftTrackWheelModels[2].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 28
		leftTrackWheelModels[2].setRotationPoint(0F, 2.5F, -1F);

		leftTrackWheelModels[3].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 29
		leftTrackWheelModels[3].setRotationPoint(-15F, 2.5F, -1F);

		leftTrackWheelModels[4].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 30
		leftTrackWheelModels[4].setRotationPoint(-15F, 2.5F, -1F);

		leftTrackWheelModels[5].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 31
		leftTrackWheelModels[5].setRotationPoint(-15F, 2.5F, -1F);

		leftTrackWheelModels[6].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 32
		leftTrackWheelModels[6].setRotationPoint(-30F, 2.5F, -1F);

		leftTrackWheelModels[7].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 33
		leftTrackWheelModels[7].setRotationPoint(-30F, 2.5F, -1F);

		leftTrackWheelModels[8].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 34
		leftTrackWheelModels[8].setRotationPoint(-30F, 2.5F, -1F);

		leftTrackWheelModels[9].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 35
		leftTrackWheelModels[9].setRotationPoint(15F, 2.5F, -1F);

		leftTrackWheelModels[10].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 36
		leftTrackWheelModels[10].setRotationPoint(15F, 2.5F, -1F);

		leftTrackWheelModels[11].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 37
		leftTrackWheelModels[11].setRotationPoint(15F, 2.5F, -1F);

		leftTrackWheelModels[12].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 38
		leftTrackWheelModels[12].setRotationPoint(30F, 2.5F, -1F);

		leftTrackWheelModels[13].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 39
		leftTrackWheelModels[13].setRotationPoint(30F, 2.5F, -1F);

		leftTrackWheelModels[14].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 40
		leftTrackWheelModels[14].setRotationPoint(30F, 2.5F, -1F);

		leftTrackWheelModels[15].addShape3D(5.5F, -5.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3)}), 5, 11, 11, 40, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 41
		leftTrackWheelModels[15].setRotationPoint(-43.5F, -3.5F, -2F);

		leftTrackWheelModels[16].addShape3D(3.5F, -3.5F, -28.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 8, 7, 7, 24, 8, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 42
		leftTrackWheelModels[16].setRotationPoint(-43.5F, -3.5F, -2F);

		leftTrackWheelModels[17].addShape3D(2F, -2F, -29F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 9, 4, 4, 16, 9, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 43
		leftTrackWheelModels[17].setRotationPoint(-43.5F, -3.5F, -2F);

		leftTrackWheelModels[18].addShape3D(2F, -2F, -29F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 8, 4, 4, 16, 8, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 44
		leftTrackWheelModels[18].setRotationPoint(45.7F, -3.5F, -2F);

		leftTrackWheelModels[19].addShape3D(3.5F, -3.5F, -28.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 45
		leftTrackWheelModels[19].setRotationPoint(45.7F, -3.5F, -2F);

		leftTrackWheelModels[20].addShape3D(5.5F, -5.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3)}), 4, 11, 11, 40, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 46
		leftTrackWheelModels[20].setRotationPoint(45.7F, -3.5F, -2F);

		leftTrackWheelModels[21].addShape3D(3F, -3F, -29F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 47
		leftTrackWheelModels[21].setRotationPoint(8F, -6.5F, -6.5F);

		leftTrackWheelModels[22].addShape3D(1.5F, -1.5F, -30F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1)}), 6, 3, 3, 12, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 48
		leftTrackWheelModels[22].setRotationPoint(8F, -6.5F, -6.5F);

		leftTrackWheelModels[23].addShape3D(1.5F, -1.5F, -30F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1)}), 6, 3, 3, 12, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 49
		leftTrackWheelModels[23].setRotationPoint(-7F, -6.5F, -6.5F);

		leftTrackWheelModels[24].addShape3D(3F, -3F, -29F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 50
		leftTrackWheelModels[24].setRotationPoint(-7F, -6.5F, -6.5F);

		leftTrackWheelModels[25].addShape3D(1.5F, -1.5F, -30F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1)}), 6, 3, 3, 12, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 51
		leftTrackWheelModels[25].setRotationPoint(23F, -6.5F, -6.5F);

		leftTrackWheelModels[26].addShape3D(3F, -3F, -29F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 52
		leftTrackWheelModels[26].setRotationPoint(23F, -6.5F, -6.5F);

		leftTrackWheelModels[27].addShape3D(3F, -3F, -29F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 53
		leftTrackWheelModels[27].setRotationPoint(-22F, -6.5F, -6.5F);

		leftTrackWheelModels[28].addShape3D(1.5F, -1.5F, -30F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1)}), 6, 3, 3, 12, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 54
		leftTrackWheelModels[28].setRotationPoint(-22F, -6.5F, -6.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 612
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 613
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 614
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 615
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 616
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 617
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 618
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 619
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 620
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 621
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 622
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 623
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 162, 298, textureX, textureY); // Shape 624
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 625
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 626
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 212, 312, textureX, textureY); // Shape 627
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 628
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 629
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 56, 311, textureX, textureY); // Shape 630
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 81, 322, textureX, textureY); // Shape 631
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 210, 331, textureX, textureY); // Shape 632
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 81, 299, textureX, textureY); // Shape 633
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 115, 329, textureX, textureY); // Shape 634
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 115, 329, textureX, textureY); // Shape 635
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 81, 299, textureX, textureY); // Shape 636
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 115, 329, textureX, textureY); // Shape 637
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 81, 299, textureX, textureY); // Shape 638
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 81, 299, textureX, textureY); // Shape 639
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 115, 329, textureX, textureY); // Shape 640

		rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 612
		rightTrackWheelModels[0].setRotationPoint(0F, 2.5F, -47F);

		rightTrackWheelModels[1].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 613
		rightTrackWheelModels[1].setRotationPoint(0F, 2.5F, -45F);

		rightTrackWheelModels[2].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 614
		rightTrackWheelModels[2].setRotationPoint(0F, 2.5F, -47F);

		rightTrackWheelModels[3].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 615
		rightTrackWheelModels[3].setRotationPoint(-15F, 2.5F, -47F);

		rightTrackWheelModels[4].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 616
		rightTrackWheelModels[4].setRotationPoint(-15F, 2.5F, -45F);

		rightTrackWheelModels[5].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 617
		rightTrackWheelModels[5].setRotationPoint(-15F, 2.5F, -47F);

		rightTrackWheelModels[6].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 618
		rightTrackWheelModels[6].setRotationPoint(-30F, 2.5F, -47F);

		rightTrackWheelModels[7].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 619
		rightTrackWheelModels[7].setRotationPoint(-30F, 2.5F, -45F);

		rightTrackWheelModels[8].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 620
		rightTrackWheelModels[8].setRotationPoint(-30F, 2.5F, -47F);

		rightTrackWheelModels[9].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 621
		rightTrackWheelModels[9].setRotationPoint(15F, 2.5F, -47F);

		rightTrackWheelModels[10].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 622
		rightTrackWheelModels[10].setRotationPoint(15F, 2.5F, -45F);

		rightTrackWheelModels[11].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 623
		rightTrackWheelModels[11].setRotationPoint(15F, 2.5F, -47F);

		rightTrackWheelModels[12].addShape3D(6.5F, -6.5F, -26.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4)}), 5, 13, 13, 44, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 5, 6, 5, 6, 5, 6, 5}); // Shape 624
		rightTrackWheelModels[12].setRotationPoint(30F, 2.5F, -47F);

		rightTrackWheelModels[13].addShape3D(2F, -2F, -28F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 10, 4, 4, 16, 10, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 625
		rightTrackWheelModels[13].setRotationPoint(30F, 2.5F, -45F);

		rightTrackWheelModels[14].addShape3D(3.5F, -3.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 626
		rightTrackWheelModels[14].setRotationPoint(30F, 2.5F, -47F);

		rightTrackWheelModels[15].addShape3D(5.5F, -5.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3)}), 5, 11, 11, 40, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 627
		rightTrackWheelModels[15].setRotationPoint(-43.5F, -3.5F, -47F);

		rightTrackWheelModels[16].addShape3D(3.5F, -3.5F, -28.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 8, 7, 7, 24, 8, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 628
		rightTrackWheelModels[16].setRotationPoint(-43.5F, -3.5F, -46F);

		rightTrackWheelModels[17].addShape3D(2F, -2F, -29F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 9, 4, 4, 16, 9, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 629
		rightTrackWheelModels[17].setRotationPoint(-43.5F, -3.5F, -46F);

		rightTrackWheelModels[18].addShape3D(2F, -2F, -29F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 8, 4, 4, 16, 8, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 630
		rightTrackWheelModels[18].setRotationPoint(45.7F, -3.5F, -46F);

		rightTrackWheelModels[19].addShape3D(3.5F, -3.5F, -28.5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2)}), 7, 7, 7, 24, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 631
		rightTrackWheelModels[19].setRotationPoint(45.7F, -3.5F, -46F);

		rightTrackWheelModels[20].addShape3D(5.5F, -5.5F, -27.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3)}), 4, 11, 11, 40, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 632
		rightTrackWheelModels[20].setRotationPoint(45.7F, -3.5F, -48F);

		rightTrackWheelModels[21].addShape3D(3F, -3F, -29F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 633
		rightTrackWheelModels[21].setRotationPoint(8F, -6.5F, -48.5F);

		rightTrackWheelModels[22].addShape3D(1.5F, -1.5F, -30F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1)}), 6, 3, 3, 12, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 634
		rightTrackWheelModels[22].setRotationPoint(8F, -6.5F, -47.5F);

		rightTrackWheelModels[23].addShape3D(1.5F, -1.5F, -30F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1)}), 6, 3, 3, 12, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 635
		rightTrackWheelModels[23].setRotationPoint(-7F, -6.5F, -47.5F);

		rightTrackWheelModels[24].addShape3D(3F, -3F, -29F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 636
		rightTrackWheelModels[24].setRotationPoint(-7F, -6.5F, -48.5F);

		rightTrackWheelModels[25].addShape3D(1.5F, -1.5F, -30F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1)}), 6, 3, 3, 12, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 637
		rightTrackWheelModels[25].setRotationPoint(23F, -6.5F, -47.5F);

		rightTrackWheelModels[26].addShape3D(3F, -3F, -29F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 638
		rightTrackWheelModels[26].setRotationPoint(23F, -6.5F, -48.5F);

		rightTrackWheelModels[27].addShape3D(3F, -3F, -29F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2)}), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 639
		rightTrackWheelModels[27].setRotationPoint(-22F, -6.5F, -48.5F);

		rightTrackWheelModels[28].addShape3D(1.5F, -1.5F, -30F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1)}), 6, 3, 3, 12, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 640
		rightTrackWheelModels[28].setRotationPoint(-22F, -6.5F, -47.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Box 2
		leftTrackModel[1] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 3
		leftTrackModel[2] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 4
		leftTrackModel[3] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 5
		leftTrackModel[4] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 6
		leftTrackModel[5] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 7
		leftTrackModel[6] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 8
		leftTrackModel[7] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 9
		leftTrackModel[8] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 10
		leftTrackModel[9] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 11
		leftTrackModel[10] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 12
		leftTrackModel[11] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 13
		leftTrackModel[12] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 14
		leftTrackModel[13] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 15

		leftTrackModel[0].addBox(0F, 0F, 0F, 66, 1, 8, 0F); // Box 2
		leftTrackModel[0].setRotationPoint(-33F, 9F, 19F);

		leftTrackModel[1].addBox(0F, -1F, 0F, 16, 1, 8, 0F); // Box 3
		leftTrackModel[1].setRotationPoint(33F, 10F, 19F);
		leftTrackModel[1].rotateAngleZ = 0.38397244F;

		leftTrackModel[2].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 4
		leftTrackModel[2].setRotationPoint(48F, 4F, 19F);
		leftTrackModel[2].rotateAngleZ = 0.78539816F;

		leftTrackModel[3].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 5
		leftTrackModel[3].setRotationPoint(52.2F, -0.2F, 19F);
		leftTrackModel[3].rotateAngleZ = 1.57079633F;

		leftTrackModel[4].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 6
		leftTrackModel[4].setRotationPoint(47.3F, -9.7F, 19F);
		leftTrackModel[4].rotateAngleZ = -0.78539816F;

		leftTrackModel[5].addBox(0F, -1F, 0F, 14, 1, 8, 0F); // Box 7
		leftTrackModel[5].setRotationPoint(-32.5F, 9.15F, 19F);
		leftTrackModel[5].rotateAngleZ = 2.68780705F;

		leftTrackModel[6].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 8
		leftTrackModel[6].setRotationPoint(48F, -9.3F, 19F);
		leftTrackModel[6].rotateAngleZ = 3.14159265F;

		leftTrackModel[7].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 9
		leftTrackModel[7].setRotationPoint(42F, -10.3F, 19F);
		leftTrackModel[7].rotateAngleZ = 3.24631241F;

		leftTrackModel[8].addBox(0F, -1F, 0F, 66, 1, 8, 0F); // Box 10
		leftTrackModel[8].setRotationPoint(36.2F, -9.65F, 19F);
		leftTrackModel[8].rotateAngleZ = 3.14159265F;

		leftTrackModel[9].addBox(0F, -2F, 0F, 11, 1, 8, 0F); // Box 11
		leftTrackModel[9].setRotationPoint(-29.5F, -10.6F, 19F);
		leftTrackModel[9].rotateAngleZ = 3.05432619F;

		leftTrackModel[10].addBox(0F, -2F, 0F, 5, 1, 8, 0F); // Box 12
		leftTrackModel[10].setRotationPoint(-40.5F, -11.6F, 19F);
		leftTrackModel[10].rotateAngleZ = 3.14159265F;

		leftTrackModel[11].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 13
		leftTrackModel[11].setRotationPoint(-45.5F, -10.6F, 19F);
		leftTrackModel[11].rotateAngleZ = 3.89208423F;

		leftTrackModel[12].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 14
		leftTrackModel[12].setRotationPoint(-49F, -6.5F, 19F);
		leftTrackModel[12].rotateAngleZ = 4.74729557F;

		leftTrackModel[13].addShapeBox(0F, -1F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackModel[13].setRotationPoint(-49.8F, -0.5F, 19F);
		leftTrackModel[13].rotateAngleZ = 5.48033385F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 321, 253, textureX, textureY); // Box 16
		rightTrackModel[1] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 17
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 18
		rightTrackModel[3] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 19
		rightTrackModel[4] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 20
		rightTrackModel[5] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 21
		rightTrackModel[6] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 22
		rightTrackModel[7] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 23
		rightTrackModel[8] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 24
		rightTrackModel[9] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 25
		rightTrackModel[10] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 26
		rightTrackModel[11] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 27
		rightTrackModel[12] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 28
		rightTrackModel[13] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 29

		rightTrackModel[0].addBox(0F, 0F, 0F, 66, 1, 8, 0F); // Box 16
		rightTrackModel[0].setRotationPoint(-33F, 9F, -26.5F);

		rightTrackModel[1].addBox(0F, -1F, 0F, 16, 1, 8, 0F); // Box 17
		rightTrackModel[1].setRotationPoint(33F, 10F, -26.5F);
		rightTrackModel[1].rotateAngleZ = 0.38397244F;

		rightTrackModel[2].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 18
		rightTrackModel[2].setRotationPoint(48F, 4F, -26.5F);
		rightTrackModel[2].rotateAngleZ = 0.78539816F;

		rightTrackModel[3].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 19
		rightTrackModel[3].setRotationPoint(52.2F, -0.2F, -26.5F);
		rightTrackModel[3].rotateAngleZ = 1.57079633F;

		rightTrackModel[4].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 20
		rightTrackModel[4].setRotationPoint(47.3F, -9.7F, -26.5F);
		rightTrackModel[4].rotateAngleZ = -0.78539816F;

		rightTrackModel[5].addBox(0F, -1F, 0F, 14, 1, 8, 0F); // Box 21
		rightTrackModel[5].setRotationPoint(-32.5F, 9.15F, -26.5F);
		rightTrackModel[5].rotateAngleZ = 2.68780705F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 22
		rightTrackModel[6].setRotationPoint(48F, -9.3F, -26.5F);
		rightTrackModel[6].rotateAngleZ = 3.14159265F;

		rightTrackModel[7].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 23
		rightTrackModel[7].setRotationPoint(42F, -10.3F, -26.5F);
		rightTrackModel[7].rotateAngleZ = 3.24631241F;

		rightTrackModel[8].addBox(0F, -1F, 0F, 66, 1, 8, 0F); // Box 24
		rightTrackModel[8].setRotationPoint(36.2F, -9.65F, -26.5F);
		rightTrackModel[8].rotateAngleZ = 3.14159265F;

		rightTrackModel[9].addBox(0F, -2F, 0F, 11, 1, 8, 0F); // Box 25
		rightTrackModel[9].setRotationPoint(-29.5F, -10.6F, -26.5F);
		rightTrackModel[9].rotateAngleZ = 3.05432619F;

		rightTrackModel[10].addBox(0F, -2F, 0F, 5, 1, 8, 0F); // Box 26
		rightTrackModel[10].setRotationPoint(-40.5F, -11.6F, -26.5F);
		rightTrackModel[10].rotateAngleZ = 3.14159265F;

		rightTrackModel[11].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 27
		rightTrackModel[11].setRotationPoint(-45.5F, -10.6F, -26.5F);
		rightTrackModel[11].rotateAngleZ = 3.89208423F;

		rightTrackModel[12].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 28
		rightTrackModel[12].setRotationPoint(-49F, -6.5F, -26.5F);
		rightTrackModel[12].rotateAngleZ = 4.74729557F;

		rightTrackModel[13].addShapeBox(0F, -1F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		rightTrackModel[13].setRotationPoint(-49.8F, -0.5F, -26.5F);
		rightTrackModel[13].rotateAngleZ = 5.48033385F;
	}

	private void initGuns()
	{
	}

	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[10];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Box 299
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 9, 341, textureX, textureY); // Box 299
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 33, 341, textureX, textureY); // Box 299
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 1, 349, textureX, textureY); // Box 299
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 49, 341, textureX, textureY); // Box 299
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 49, 349, textureX, textureY); // Box 299
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 57, 341, textureX, textureY); // Box 299
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 1, 357, textureX, textureY); // Box 299
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 25, 349, textureX, textureY); // Box 299
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 41, 349, textureX, textureY); // Box 299

		gun_1_Model[1][0].addShapeBox(7F, -0.8F, -1.5F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_1_Model[1][1].addShapeBox(7F, -1.5F, -0.5F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 299

		gun_1_Model[1][2].addShapeBox(4F, -1.5F, -0.5F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 299

		gun_1_Model[1][3].addShapeBox(-5F, -2F, -1F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_1_Model[1][4].addShapeBox(-3F, -1.8F, -2F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_1_Model[1][5].addShapeBox(-9F, -2F, -1F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 299

		gun_1_Model[1][6].addShapeBox(-11F, -2.5F, 1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_1_Model[1][7].addShapeBox(-11F, -2.5F, -2F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_1_Model[1][8].addShapeBox(-10F, -2F, -1F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		gun_1_Model[1][9].addShapeBox(-10F, -2F, 1F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(5F, -38F, 11F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[1];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 25, 349, textureX, textureY); // Box 299

		gun_1_Model[2][0].addShapeBox(-4.5F, -1.5F, 1F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(5F, -38F, 11F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);
	}
}
