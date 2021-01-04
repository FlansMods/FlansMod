//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SdkFz251
// Model Creator: 
// Created on: 22.05.2015 - 22:28:16
// Last changed on: 22.05.2015 - 22:28:16

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelSdkFz251 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	public ModelSdkFz251() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[225];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 35
		bodyModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 37
		bodyModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 40
		bodyModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
		bodyModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 43
		bodyModel[20] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 61
		bodyModel[21] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 75
		bodyModel[22] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 46
		bodyModel[23] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 79
		bodyModel[24] = new ModelRendererTurbo(this, 65, 259, textureX, textureY); // Box 81
		bodyModel[25] = new ModelRendererTurbo(this, 33, 275, textureX, textureY); // Box 87
		bodyModel[26] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 84
		bodyModel[27] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 87
		bodyModel[28] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 88
		bodyModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 89
		bodyModel[30] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 91
		bodyModel[31] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 93
		bodyModel[32] = new ModelRendererTurbo(this, 409, 299, textureX, textureY); // Box 94
		bodyModel[33] = new ModelRendererTurbo(this, 449, 299, textureX, textureY); // Box 95
		bodyModel[34] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 96
		bodyModel[35] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 97
		bodyModel[36] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 98
		bodyModel[37] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 85
		bodyModel[38] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 88
		bodyModel[39] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 93
		bodyModel[40] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 105
		bodyModel[41] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 106
		bodyModel[42] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 107
		bodyModel[43] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 108
		bodyModel[44] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 109
		bodyModel[45] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 110
		bodyModel[46] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 111
		bodyModel[47] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 112
		bodyModel[48] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 113
		bodyModel[49] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 114
		bodyModel[50] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 115
		bodyModel[51] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 116
		bodyModel[52] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 117
		bodyModel[53] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 118
		bodyModel[54] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 119
		bodyModel[55] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 120
		bodyModel[56] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 121
		bodyModel[57] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 122
		bodyModel[58] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 123
		bodyModel[59] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 124
		bodyModel[60] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 125
		bodyModel[61] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 129
		bodyModel[62] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 132
		bodyModel[63] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 133
		bodyModel[64] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 134
		bodyModel[65] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 135
		bodyModel[66] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 136
		bodyModel[67] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 138
		bodyModel[68] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 139
		bodyModel[69] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 140
		bodyModel[70] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 135
		bodyModel[71] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 136
		bodyModel[72] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 137
		bodyModel[73] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 251
		bodyModel[74] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 257
		bodyModel[75] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 259
		bodyModel[76] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 212
		bodyModel[77] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 261
		bodyModel[78] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 1
		bodyModel[79] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 4
		bodyModel[80] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 7
		bodyModel[81] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 8
		bodyModel[82] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 11
		bodyModel[83] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 13
		bodyModel[84] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 14
		bodyModel[85] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 15
		bodyModel[86] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 16
		bodyModel[87] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 36
		bodyModel[88] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 38
		bodyModel[89] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 47
		bodyModel[90] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 7
		bodyModel[91] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 9
		bodyModel[92] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 10
		bodyModel[93] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 11
		bodyModel[94] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 185
		bodyModel[95] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 186
		bodyModel[96] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 187
		bodyModel[97] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 188
		bodyModel[98] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 191
		bodyModel[99] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 192
		bodyModel[100] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 193
		bodyModel[101] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 194
		bodyModel[102] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 196
		bodyModel[103] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 197
		bodyModel[104] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 199
		bodyModel[105] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 200
		bodyModel[106] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 201
		bodyModel[107] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 202
		bodyModel[108] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 203
		bodyModel[109] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 8
		bodyModel[110] = new ModelRendererTurbo(this, 52, 64, textureX, textureY); // Box 392
		bodyModel[111] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 393
		bodyModel[112] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 394
		bodyModel[113] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 13
		bodyModel[114] = new ModelRendererTurbo(this, 52, 64, textureX, textureY); // Box 14
		bodyModel[115] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 15
		bodyModel[116] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 16
		bodyModel[117] = new ModelRendererTurbo(this, 99, 369, textureX, textureY); // Box 323
		bodyModel[118] = new ModelRendererTurbo(this, 114, 367, textureX, textureY); // Box 324
		bodyModel[119] = new ModelRendererTurbo(this, 99, 377, textureX, textureY); // Box 325
		bodyModel[120] = new ModelRendererTurbo(this, 128, 369, textureX, textureY); // Box 326
		bodyModel[121] = new ModelRendererTurbo(this, 117, 376, textureX, textureY); // Box 327
		bodyModel[122] = new ModelRendererTurbo(this, 124, 385, textureX, textureY); // Box 328
		bodyModel[123] = new ModelRendererTurbo(this, 118, 385, textureX, textureY); // Box 329
		bodyModel[124] = new ModelRendererTurbo(this, 137, 379, textureX, textureY); // Box 330
		bodyModel[125] = new ModelRendererTurbo(this, 137, 384, textureX, textureY); // Box 331
		bodyModel[126] = new ModelRendererTurbo(this, 137, 389, textureX, textureY); // Box 332
		bodyModel[127] = new ModelRendererTurbo(this, 137, 389, textureX, textureY); // Box 333
		bodyModel[128] = new ModelRendererTurbo(this, 137, 375, textureX, textureY); // Box 334
		bodyModel[129] = new ModelRendererTurbo(this, 137, 396, textureX, textureY); // Box 335
		bodyModel[130] = new ModelRendererTurbo(this, 138, 400, textureX, textureY); // Box 336
		bodyModel[131] = new ModelRendererTurbo(this, 138, 404, textureX, textureY); // Box 337
		bodyModel[132] = new ModelRendererTurbo(this, 305, 379, textureX, textureY); // Box 82
		bodyModel[133] = new ModelRendererTurbo(this, 361, 379, textureX, textureY); // Box 83
		bodyModel[134] = new ModelRendererTurbo(this, 321, 264, textureX, textureY); // Shape 84
		bodyModel[135] = new ModelRendererTurbo(this, 321, 264, textureX, textureY); // Shape 85
		bodyModel[136] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 86
		bodyModel[137] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 88
		bodyModel[138] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 89
		bodyModel[139] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 96
		bodyModel[140] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 97
		bodyModel[141] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 98
		bodyModel[142] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 99
		bodyModel[143] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 101
		bodyModel[144] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 102
		bodyModel[145] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 103
		bodyModel[146] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 104
		bodyModel[147] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 105
		bodyModel[148] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 107
		bodyModel[149] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 108
		bodyModel[150] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 109
		bodyModel[151] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 110
		bodyModel[152] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 112
		bodyModel[153] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 113
		bodyModel[154] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 114
		bodyModel[155] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 115
		bodyModel[156] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 116
		bodyModel[157] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 117
		bodyModel[158] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 118
		bodyModel[159] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 119
		bodyModel[160] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 120
		bodyModel[161] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 121
		bodyModel[162] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 122
		bodyModel[163] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 123
		bodyModel[164] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 124
		bodyModel[165] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 125
		bodyModel[166] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 126
		bodyModel[167] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 127
		bodyModel[168] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 129
		bodyModel[170] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 132
		bodyModel[171] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 135
		bodyModel[172] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 136
		bodyModel[173] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 137
		bodyModel[174] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 138
		bodyModel[175] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 139
		bodyModel[176] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 140
		bodyModel[177] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 141
		bodyModel[178] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 142
		bodyModel[179] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 143
		bodyModel[180] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 144
		bodyModel[181] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 145
		bodyModel[182] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 146
		bodyModel[183] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 147
		bodyModel[184] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 148
		bodyModel[185] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 149
		bodyModel[186] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 150
		bodyModel[187] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 151
		bodyModel[188] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 152
		bodyModel[189] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 153
		bodyModel[190] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 154
		bodyModel[191] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 155
		bodyModel[192] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 156
		bodyModel[193] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 157
		bodyModel[194] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 158
		bodyModel[195] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 159
		bodyModel[196] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 160
		bodyModel[197] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 161
		bodyModel[198] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 162
		bodyModel[199] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 163
		bodyModel[200] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 164
		bodyModel[201] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 165
		bodyModel[202] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 166
		bodyModel[203] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 167
		bodyModel[204] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 168
		bodyModel[205] = new ModelRendererTurbo(this, 465, 275, textureX, textureY); // Box 169
		bodyModel[206] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 170
		bodyModel[207] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
		bodyModel[208] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 1
		bodyModel[209] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 2
		bodyModel[210] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 3
		bodyModel[211] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 4
		bodyModel[212] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 5
		bodyModel[213] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 6
		bodyModel[214] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 7
		bodyModel[215] = new ModelRendererTurbo(this, 321, 264, textureX, textureY); // Shape 1
		bodyModel[216] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 0
		bodyModel[217] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 0
		bodyModel[218] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 18
		bodyModel[219] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 19
		bodyModel[220] = new ModelRendererTurbo(this, 118, 188, textureX, textureY); // Box 33
		bodyModel[221] = new ModelRendererTurbo(this, 107, 207, textureX, textureY); // Box 17
		bodyModel[222] = new ModelRendererTurbo(this, 118, 188, textureX, textureY); // Box 23
		bodyModel[223] = new ModelRendererTurbo(this, 107, 207, textureX, textureY); // Box 24
		bodyModel[224] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 0
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 36, 5, 18, 0F, 0F, 0F, 5F, 5F, -4F, -2F, 5F, -4F, -2F, 0F, 0F, 5F, 0F, -3F, 6.5F, 6F, 3F, 0F, 6F, 3F, 0F, 0F, -3F, 6.5F); // Box 0
		bodyModel[0].setRotationPoint(12F, -20F, -9F);
		
		bodyModel[1].addBox(0F, 0F, 0F, 13, 1, 42, 0F); // Box 1
		bodyModel[1].setRotationPoint(12F, -12F, -21F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 42, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(27F, -5F, -21F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 42, 0F, 1F, 7F, 0F, -1F, 7F, 0F, -1F, 7F, 0F, 1F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(26F, -5F, -21F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 38, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 4
		bodyModel[4].setRotationPoint(34F, -12F, -19F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 40, 14, 18, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 5F); // Box 5
		bodyModel[5].setRotationPoint(12F, -12F, -9F);
		
		bodyModel[6].addBox(0F, 0F, 0F, 12, 1, 38, 0F); // Box 6
		bodyModel[6].setRotationPoint(36F, -12F, -19F);
		
		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(48F, -12F, 7F);
		
		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		bodyModel[8].setRotationPoint(13F, -26F, -2F);
		
		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F, 4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -2F, 4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[9].setRotationPoint(13F, -26F, 12F);
		
		bodyModel[10].addShapeBox(0F, 0F, 0F, 61, 4, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[10].setRotationPoint(-49F, -2F, -14F);
		
		bodyModel[11].addBox(0F, 0F, 0F, 55, 1, 7, 0F); // Box 21
		bodyModel[11].setRotationPoint(-43F, -12F, 14F);
		
		bodyModel[12].addShapeBox(0F, 0F, 0F, 61, 14, 10, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -2F, -13F, 0F, -2F, -13F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 24
		bodyModel[12].setRotationPoint(-49F, -12F, -1F);
		
		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 8, 2, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, -4.5F, 0F, -6F, 3F, 0F, -6F, 4F, 0F, -6F, -4.5F, 0F, -6F, -3.5F); // Box 35
		bodyModel[13].setRotationPoint(1F, -20F, 18F);
		
		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 24, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[14].setRotationPoint(3F, -27F, -12F);
		
		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 38
		bodyModel[15].setRotationPoint(10F, -26F, 2F);
		bodyModel[15].rotateAngleZ = 0.33161256F;
		
		bodyModel[16].addShapeBox(0F, 0F, 0F, 54, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.6F, 0F, 0F, 2.6F); // Box 40
		bodyModel[16].setRotationPoint(-53F, -26F, 12F);
		
		bodyModel[17].addShapeBox(0F, 0F, -1F, 1, 5, 5, 0F, 3F, 0F, 0F, -3.4F, 0F, 0F, -3.6F, -1F, -1F, 3F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 42
		bodyModel[17].setRotationPoint(0F, -33F, 3F);
		
		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 33
		bodyModel[18].setRotationPoint(-2F, -27F, -12F);
		
		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 14F, 1F, -1F, 14F, 1F, -1F, 6F, 0.5F, 0F, 6F, 0.5F, 7F, -8F, 0F, -1F, -8F, 0F, -1F, -7F, 0.5F, 0F, -7F, 0.5F); // Box 43
		bodyModel[19].setRotationPoint(-53F, -12F, 13F);
		
		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 6F, 19F, -1F, 0F, 19F, -1F, 0F, 18F, 1.5F, -1F, 18F, 1.5F, -4F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, -1F); // Box 61
		bodyModel[20].setRotationPoint(-54F, 0F, 12F);
		
		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 26, 0F); // Box 75
		bodyModel[21].setRotationPoint(44.5F, -1.5F, -13F);
		
		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 12, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, -2F, 2F, -4F, -2F, 0F, 0F, 0F); // Box 46
		bodyModel[22].setRotationPoint(52F, -12F, -9F);
		
		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, 0F, 1F, 0F, -2F, 1F, 0.5F, -2F, 1F, -2F, 0F, 1F, -2F, 0F, -1.5F, -0.9F, -0.5F, -1.5F, -0.3F, -0.5F, -1.5F, -1.3F, 0F, -1.5F, -0.5F); // Box 79
		bodyModel[23].setRotationPoint(1F, -25F, 12F);
		
		bodyModel[24].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 81
		bodyModel[24].setRotationPoint(-41F, -17F, 15F);
		
		bodyModel[25].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 87
		bodyModel[25].setRotationPoint(-25F, -17F, 15F);
		
		bodyModel[26].addShapeBox(0F, 0F, 0F, 28, 3, 18, 0F, 0F, 4F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 4F, 0F, -2F, 7F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 7F); // Box 84
		bodyModel[26].setRotationPoint(26F, -13F, -9F);
		
		bodyModel[27].addShapeBox(0F, 0F, 0F, 14, 6, 18, 0F, 0F, 0F, 6.5F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0F, 6.5F, 0F, 0F, 5F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 5F); // Box 87
		bodyModel[27].setRotationPoint(12F, -18F, -9F);
		
		bodyModel[28].addBox(0F, 0F, 0F, 55, 1, 7, 0F); // Box 88
		bodyModel[28].setRotationPoint(-43F, -12F, -21F);
		
		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 8, 2, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -5.5F, 0F, 0F, -4.5F, 0F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, -7F, 0F, -2F, -6F); // Box 89
		bodyModel[29].setRotationPoint(1F, -18F, 19F);
		
		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 8, 2, 0F, 0F, 0F, -4.5F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, -6F, -3.5F, 0F, -6F, -4.5F, 0F, -6F, 4F, 0F, -6F, 3F); // Box 91
		bodyModel[30].setRotationPoint(1F, -20F, -20F);
		
		bodyModel[31].addShapeBox(0F, 0F, 0F, 50, 8, 2, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, -6F, 0F, -2F, -6F); // Box 93
		bodyModel[31].setRotationPoint(-49F, -18F, 19F);
		
		bodyModel[32].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 94
		bodyModel[32].setRotationPoint(-25F, -17F, -19F);
		
		bodyModel[33].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[33].setRotationPoint(-41F, -17F, -19F);
		
		bodyModel[34].addShapeBox(0F, 0F, 0F, 50, 8, 2, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, -2F, 5F, 0F, -2F, 5F); // Box 96
		bodyModel[34].setRotationPoint(-49F, -18F, -21F);
		
		bodyModel[35].addShapeBox(0F, 0F, -2F, 11, 8, 2, 0F, 0F, 0F, -4.5F, 0F, 0F, -5.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -2F, -6F, 0F, -2F, -7F, 0F, -2F, 5F, 0F, -2F, 5F); // Box 97
		bodyModel[35].setRotationPoint(1F, -18F, -19F);
		
		bodyModel[36].addShapeBox(0F, 0F, 0F, 61, 14, 10, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -2F, -13F, 0F, -2F, -13F); // Box 98
		bodyModel[36].setRotationPoint(-49F, -12F, -9F);
		
		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, -1F, 0F, 14F, -1F, 1F, -14F, 0F, -2F, -13F, 0F, -2F, -13F, -0.9F, 1F, -14F, -0.9F); // Box 85
		bodyModel[37].setRotationPoint(-53F, -12F, 0F);
		
		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 14F, -1F, 0F, 14F, -1F, 0F, 14F, 0F, 0F, 14F, 0F, 1F, -14F, -0.9F, -2F, -13F, -0.9F, -2F, -13F, 0F, 1F, -14F, 0F); // Box 88
		bodyModel[38].setRotationPoint(-53F, -12F, -13F);
		
		bodyModel[39].addBox(0F, 0F, 0F, 24, 1, 10, 0F); // Box 93
		bodyModel[39].setRotationPoint(-50F, -6F, 3F);
		
		bodyModel[40].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 105
		bodyModel[40].setRotationPoint(-8F, -5F, 6F);
		
		bodyModel[41].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 106
		bodyModel[41].setRotationPoint(-43F, -5F, 5F);
		
		bodyModel[42].addBox(0F, 0F, 0F, 24, 1, 10, 0F); // Box 107
		bodyModel[42].setRotationPoint(-25F, -6F, 3F);
		
		bodyModel[43].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 108
		bodyModel[43].setRotationPoint(-18F, -5F, 6F);
		
		bodyModel[44].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 109
		bodyModel[44].setRotationPoint(-34F, -5F, 6F);
		
		bodyModel[45].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 110
		bodyModel[45].setRotationPoint(-34F, -5F, -9F);
		
		bodyModel[46].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 111
		bodyModel[46].setRotationPoint(-43F, -5F, -9F);
		
		bodyModel[47].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 112
		bodyModel[47].setRotationPoint(-18F, -5F, -9F);
		
		bodyModel[48].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 113
		bodyModel[48].setRotationPoint(-8F, -5F, -9F);
		
		bodyModel[49].addBox(0F, 0F, 0F, 24, 1, 10, 0F); // Box 114
		bodyModel[49].setRotationPoint(-25F, -6F, -14F);
		
		bodyModel[50].addBox(0F, 0F, 0F, 24, 1, 10, 0F); // Box 115
		bodyModel[50].setRotationPoint(-50F, -6F, -14F);
		
		bodyModel[51].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Box 116
		bodyModel[51].setRotationPoint(0F, -5F, 1F);
		
		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 117
		bodyModel[52].setRotationPoint(3F, -4F, 6F);
		
		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[53].setRotationPoint(0F, -17F, 1F);
		
		bodyModel[54].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 119
		bodyModel[54].setRotationPoint(0F, -8F, 2F);
		
		bodyModel[55].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 120
		bodyModel[55].setRotationPoint(0F, -8F, 9F);
		
		bodyModel[56].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 121
		bodyModel[56].setRotationPoint(0F, -8F, -10F);
		
		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[57].setRotationPoint(0F, -17F, -11F);
		
		bodyModel[58].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 123
		bodyModel[58].setRotationPoint(0F, -8F, -3F);
		
		bodyModel[59].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Box 124
		bodyModel[59].setRotationPoint(0F, -5F, -11F);
		
		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 125
		bodyModel[60].setRotationPoint(3F, -4F, -7F);
		
		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[61].setRotationPoint(-1F, -28F, -5F);
		
		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, -1F, -2F, 0F, -5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 132
		bodyModel[62].setRotationPoint(-2F, -28F, -12F);
		
		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[63].setRotationPoint(-2F, -27F, 5F);
		
		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[64].setRotationPoint(-2F, -28F, 5F);
		
		bodyModel[65].addShapeBox(0F, 0F, -1F, 1, 5, 5, 0F, 3F, -1F, -1F, -3.6F, -1F, -1F, -3.4F, 0F, 0F, 3F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[65].setRotationPoint(0F, -33F, -6F);
		
		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 1.2F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[66].setRotationPoint(0F, -30F, -2F);
		
		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[67].setRotationPoint(-53F, -29F, -0.5F);
		
		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 139
		bodyModel[68].setRotationPoint(-60F, -30F, -0.5F);
		
		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 140
		bodyModel[69].setRotationPoint(-57F, -27.5F, -0.5F);
		
		bodyModel[70].addShapeBox(0F, 0.2F, 0F, 16, 1, 2, 0F, 3F, 0.3F, -0.7F, 3F, -1.9F, 3.1F, 0F, -2.5F, -1F, 0F, -2F, 2F, 3F, 8F, 0F, 3F, 8F, 2.5F, 0F, 4F, 0F, 0F, 4F, 3F); // Box 135
		bodyModel[70].setRotationPoint(18F, -19.5F, 13F);
		
		bodyModel[71].addShapeBox(0F, 0.2F, 0F, 16, 1, 2, 0F, 0F, -2F, 2F, 0F, -2.5F, -1F, 3F, -1.9F, 3.1F, 3F, 0.3F, -0.7F, 0F, 4F, 3F, 0F, 4F, 0F, 3F, 8F, 2.5F, 3F, 8F, 0F); // Box 136
		bodyModel[71].setRotationPoint(18F, -19.5F, -15F);
		
		bodyModel[72].addShapeBox(0F, 0F, 0F, 11, 5, 8, 0F, 0F, -1.5F, 5F, 5F, -3F, 3F, 5F, -3F, 3F, 0F, -1.5F, 5F, 0F, -3F, 6.5F, 6F, -1F, 4F, 6F, -1F, 4F, 0F, -3F, 6.5F); // Box 137
		bodyModel[72].setRotationPoint(22F, -21F, -4F);
		
		bodyModel[73].addBox(0F, 2F, 0F, 0, 0, 0, 0F); // Box 251
		bodyModel[73].setRotationPoint(-28.2F, 16.5F, 22F);
		
		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[74].setRotationPoint(-27.2F, -1.5F, 13F);
		
		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[75].setRotationPoint(-4.2F, -1.5F, 13F);
		
		bodyModel[76].addShapeBox(0F, 0F, 0F, 54, 8, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.6F, 0F, 0F, 2.6F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 212
		bodyModel[76].setRotationPoint(-53F, -26F, -14F);
		
		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[77].setRotationPoint(-8.2F, -1F, 13F);
		
		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F, 4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 1F, 4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[78].setRotationPoint(13F, -26F, -14F);
		
		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, 0F, 1F, -2F, -2F, 1F, -2F, -2F, 1F, 0.5F, 0F, 1F, 0F, 0F, -1.5F, -0.5F, -0.5F, -1.5F, -1.3F, -0.5F, -1.5F, -0.3F, 0F, -1.5F, -0.9F); // Box 4
		bodyModel[79].setRotationPoint(1F, -25F, -14F);
		
		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 7
		bodyModel[80].setRotationPoint(10F, -26F, -11F);
		bodyModel[80].rotateAngleZ = 0.33161256F;
		
		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 24, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 8
		bodyModel[81].setRotationPoint(12.1F, -21.5F, -12F);
		bodyModel[81].rotateAngleZ = 0.33161256F;
		
		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -1F, 18F, 1.5F, 0F, 18F, 1.5F, 0F, 19F, -1F, 6F, 19F, -1F, -5F, 0F, -1F, 4F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F); // Box 11
		bodyModel[82].setRotationPoint(-54F, 0F, -15F);
		
		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F, 1F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 4F, 1F, 0F, 4F, -0.2F, -2F, -5.2F, 0F, -2F, -6F, 0F, -2F, 5F, -0.2F, -2F, 5F); // Box 13
		bodyModel[83].setRotationPoint(-52F, -18F, -21F);
		
		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 14, 10, 0F, 0.8F, 0F, 6.7F, 0F, 0F, 6F, 0F, 0F, -15F, 0.8F, 0F, -15F, -2F, 0F, 5F, 0F, 0F, 5F, 0F, -2F, -13F, -2F, -2F, -13F); // Box 14
		bodyModel[84].setRotationPoint(-51F, -12F, -9F);
		
		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F, 1F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4.5F, 1F, 0F, -4.5F, -0.2F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, -6F, -0.2F, -2F, -5.2F); // Box 15
		bodyModel[85].setRotationPoint(-52F, -18F, 19F);
		
		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 14, 10, 0F, 0.8F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 6F, 0.8F, 0F, 6.7F, -2F, -2F, -13F, 0F, -2F, -13F, 0F, 0F, 5F, -2F, 0F, 5F); // Box 16
		bodyModel[86].setRotationPoint(-51F, -12F, -1F);
		
		bodyModel[87].addShapeBox(0F, 0F, 0F, 11, 8, 2, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, -4.5F, 0F, -6F, 3F, 0F, -6F, 4F, 1.4F, -5.9F, -5.25F, 0F, -6F, -3.5F); // Box 36
		bodyModel[87].setRotationPoint(1F, -22F, 17F);
		
		bodyModel[88].addShapeBox(0F, 0F, 0F, 11, 8, 2, 0F, 0F, 0F, -4.5F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, -6F, -3.5F, 1.4F, -5.9F, -5.25F, 0F, -6F, 4F, 0F, -6F, 3F); // Box 38
		bodyModel[88].setRotationPoint(1F, -22F, -19F);
		
		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 6F, 0.5F, -1F, 6F, 0.5F, -1F, 14F, 1F, 0F, 14F, 1F, 0F, -7F, 0.5F, -1F, -7F, 0.5F, -1F, -8F, 0F, 7F, -8F, 0F); // Box 47
		bodyModel[89].setRotationPoint(-53F, -12F, -16F);
		
		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 7
		bodyModel[90].setRotationPoint(-60F, -32.5F, -0.5F);
		
		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 9
		bodyModel[91].setRotationPoint(-47F, -12F, 14F);
		
		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 10
		bodyModel[92].setRotationPoint(-47F, -12F, -21F);
		
		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[93].setRotationPoint(48F, -12F, -19F);
		
		bodyModel[94].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[94].setRotationPoint(51.8F, -19F, -8F);
		bodyModel[94].rotateAngleZ = -1.32645023F;
		
		bodyModel[95].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 186
		bodyModel[95].setRotationPoint(51.8F, -19F, -6F);
		bodyModel[95].rotateAngleZ = -1.32645023F;
		
		bodyModel[96].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[96].setRotationPoint(51.8F, -19F, -8F);
		bodyModel[96].rotateAngleZ = -1.32645023F;
		
		bodyModel[97].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[97].setRotationPoint(51.8F, -19F, -5F);
		bodyModel[97].rotateAngleZ = -1.32645023F;
		
		bodyModel[98].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[98].setRotationPoint(51.8F, -19F, -5F);
		bodyModel[98].rotateAngleZ = -1.32645023F;
		
		bodyModel[99].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 192
		bodyModel[99].setRotationPoint(51.8F, -19F, -3F);
		bodyModel[99].rotateAngleZ = -1.32645023F;
		
		bodyModel[100].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[100].setRotationPoint(51.8F, -19F, -2F);
		bodyModel[100].rotateAngleZ = -1.32645023F;
		
		bodyModel[101].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[101].setRotationPoint(51.8F, -19F, 0F);
		bodyModel[101].rotateAngleZ = -1.32645023F;
		
		bodyModel[102].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[102].setRotationPoint(51.8F, -19F, 1F);
		bodyModel[102].rotateAngleZ = -1.32645023F;
		
		bodyModel[103].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 197
		bodyModel[103].setRotationPoint(51.8F, -19F, 3F);
		bodyModel[103].rotateAngleZ = -1.32645023F;
		
		bodyModel[104].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[104].setRotationPoint(51.8F, -19F, 4F);
		bodyModel[104].rotateAngleZ = -1.32645023F;
		
		bodyModel[105].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 200
		bodyModel[105].setRotationPoint(51.8F, -19F, 6F);
		bodyModel[105].rotateAngleZ = -1.32645023F;
		
		bodyModel[106].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[106].setRotationPoint(51.8F, -19F, 4F);
		bodyModel[106].rotateAngleZ = -1.32645023F;
		
		bodyModel[107].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[107].setRotationPoint(51.8F, -19F, 1F);
		bodyModel[107].rotateAngleZ = -1.32645023F;
		
		bodyModel[108].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[108].setRotationPoint(51.8F, -19F, -2F);
		bodyModel[108].rotateAngleZ = -1.32645023F;
		
		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[109].setRotationPoint(51F, -13F, 13F);
		
		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 392
		bodyModel[110].setRotationPoint(50.5F, -15F, 11.5F);
		
		bodyModel[111].addShapeBox(0F, -1F, 0F, 2, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 393
		bodyModel[111].setRotationPoint(50.5F, -15F, 11.5F);
		
		bodyModel[112].addShapeBox(0F, 2F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 394
		bodyModel[112].setRotationPoint(50.5F, -15F, 11.5F);
		
		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[113].setRotationPoint(51F, -13F, -14F);
		
		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 14
		bodyModel[114].setRotationPoint(50.5F, -15F, -15.5F);
		
		bodyModel[115].addShapeBox(0F, -1F, 0F, 2, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 15
		bodyModel[115].setRotationPoint(50.5F, -15F, -15.5F);
		
		bodyModel[116].addShapeBox(0F, 2F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 16
		bodyModel[116].setRotationPoint(50.5F, -15F, -15.5F);
		
		bodyModel[117].addShapeBox(-3F, 0F, -1F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[117].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[117].rotateAngleX = -2.04203522F;
		bodyModel[117].rotateAngleY = 0.10471976F;
		bodyModel[117].rotateAngleZ = 2.44346095F;
		
		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[118].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[118].rotateAngleX = -2.04203522F;
		bodyModel[118].rotateAngleY = 0.10471976F;
		bodyModel[118].rotateAngleZ = 2.44346095F;
		
		bodyModel[119].addShapeBox(-4F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[119].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[119].rotateAngleX = -2.04203522F;
		bodyModel[119].rotateAngleY = 0.10471976F;
		bodyModel[119].rotateAngleZ = 2.44346095F;
		
		bodyModel[120].addShapeBox(-5F, 0F, 1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[120].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[120].rotateAngleX = -2.04203522F;
		bodyModel[120].rotateAngleY = 0.10471976F;
		bodyModel[120].rotateAngleZ = 2.44346095F;
		
		bodyModel[121].addShapeBox(-6F, 0F, 4F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[121].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[121].rotateAngleX = -2.04203522F;
		bodyModel[121].rotateAngleY = 0.10471976F;
		bodyModel[121].rotateAngleZ = 2.44346095F;
		
		bodyModel[122].addShapeBox(-6F, 0F, 2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[122].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[122].rotateAngleX = -2.04203522F;
		bodyModel[122].rotateAngleY = 0.10471976F;
		bodyModel[122].rotateAngleZ = 2.44346095F;
		
		bodyModel[123].addShapeBox(-3F, 0F, 5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[123].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[123].rotateAngleX = -2.04203522F;
		bodyModel[123].rotateAngleY = 0.10471976F;
		bodyModel[123].rotateAngleZ = 2.44346095F;
		
		bodyModel[124].addShapeBox(-7F, 0F, 5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[124].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[124].rotateAngleX = -2.04203522F;
		bodyModel[124].rotateAngleY = 0.10471976F;
		bodyModel[124].rotateAngleZ = 2.44346095F;
		
		bodyModel[125].addShapeBox(-8F, 0F, 6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[125].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[125].rotateAngleX = -2.04203522F;
		bodyModel[125].rotateAngleY = 0.10471976F;
		bodyModel[125].rotateAngleZ = 2.44346095F;
		
		bodyModel[126].addShapeBox(-9F, 0F, 7F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[126].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[126].rotateAngleX = -2.04203522F;
		bodyModel[126].rotateAngleY = 0.10471976F;
		bodyModel[126].rotateAngleZ = 2.44346095F;
		
		bodyModel[127].addShapeBox(-10F, 0F, 8F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[127].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[127].rotateAngleX = -2.04203522F;
		bodyModel[127].rotateAngleY = 0.10471976F;
		bodyModel[127].rotateAngleZ = 2.44346095F;
		
		bodyModel[128].addShapeBox(-11F, 0F, 9F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[128].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[128].rotateAngleX = -2.04203522F;
		bodyModel[128].rotateAngleY = 0.10471976F;
		bodyModel[128].rotateAngleZ = 2.44346095F;
		
		bodyModel[129].addShapeBox(-13F, 0F, 10F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[129].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[129].rotateAngleX = -2.04203522F;
		bodyModel[129].rotateAngleY = 0.10471976F;
		bodyModel[129].rotateAngleZ = 2.44346095F;
		
		bodyModel[130].addShapeBox(-13F, 0F, 11F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[130].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[130].rotateAngleX = -2.04203522F;
		bodyModel[130].rotateAngleY = 0.10471976F;
		bodyModel[130].rotateAngleZ = 2.44346095F;
		
		bodyModel[131].addShapeBox(-12F, 0F, 12F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[131].setRotationPoint(36.5F, -15F, 12F);
		bodyModel[131].rotateAngleX = -2.04203522F;
		bodyModel[131].rotateAngleY = 0.10471976F;
		bodyModel[131].rotateAngleZ = 2.44346095F;
		
		bodyModel[132].addShapeBox(0F, 0F, 0F, 9, 9, 4, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 82
		bodyModel[132].setRotationPoint(-9F, -17F, 15F);
		
		bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 83
		bodyModel[133].setRotationPoint(-9F, -17F, -19F);
		
		bodyModel[134].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 84
		bodyModel[134].setRotationPoint(-6.5F, -22F, 14.5F);
		bodyModel[134].rotateAngleX = 0.48869219F;
		
		bodyModel[135].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 85
		bodyModel[135].setRotationPoint(-29.5F, -22.5F, 14.5F);
		bodyModel[135].rotateAngleX = 0.48869219F;
		bodyModel[135].rotateAngleY = -0.15707963F;
		bodyModel[135].rotateAngleZ = 0.29670597F;
		
		bodyModel[136].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F, 0.1F, 0F, -0.2F, 0.1F, -1.5F, -0.2F, 0.1F, -1.5F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F); // Box 86
		bodyModel[136].setRotationPoint(22F, -19.7F, -0.5F);
		
		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[137].setRotationPoint(34F, -18.7F, 1.5F);
		
		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[138].setRotationPoint(34F, -18.7F, -2.5F);
		
		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[139].setRotationPoint(-8F, -40F, 12F);
		
		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[140].setRotationPoint(-40F, -40F, 12F);
		
		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[141].setRotationPoint(-8F, -40F, -13F);
		
		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[142].setRotationPoint(-40F, -40F, -13F);
		
		bodyModel[143].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[143].setRotationPoint(-46F, -40F, -11F);
		
		bodyModel[144].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 102
		bodyModel[144].setRotationPoint(-8F, -40F, -11F);
		
		bodyModel[145].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 103
		bodyModel[145].setRotationPoint(-8F, -40F, 10F);
		
		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 104
		bodyModel[146].setRotationPoint(0F, -39F, 9F);
		
		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 0F); // Box 105
		bodyModel[147].setRotationPoint(0F, -39F, -10F);
		
		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 107
		bodyModel[148].setRotationPoint(-52F, -40F, 10F);
		
		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[149].setRotationPoint(2F, -38F, -7F);
		
		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[150].setRotationPoint(-54F, -40F, -7F);
		
		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 110
		bodyModel[151].setRotationPoint(-54F, -40F, 8F);
		
		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[152].setRotationPoint(-25F, -43F, -11F);
		
		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[153].setRotationPoint(-25F, -43F, 10F);
		
		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[154].setRotationPoint(-25F, -43F, -9F);
		
		bodyModel[155].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[155].setRotationPoint(-40F, -43F, -0.5F);
		
		bodyModel[156].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[156].setRotationPoint(-8F, -43F, -0.5F);
		
		bodyModel[157].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 117
		bodyModel[157].setRotationPoint(-54F, -43F, -0.5F);
		
		bodyModel[158].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 118
		bodyModel[158].setRotationPoint(-52F, -40F, -11F);
		
		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 119
		bodyModel[159].setRotationPoint(-54F, -40F, -9F);
		
		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 37, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 120
		bodyModel[160].setRotationPoint(-8F, -63F, -13F);
		
		bodyModel[161].addShapeBox(-5F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[161].setRotationPoint(-45F, -21F, -14.5F);
		bodyModel[161].rotateAngleX = 1.04719755F;
		
		bodyModel[162].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 122
		bodyModel[162].setRotationPoint(-45F, -21F, -14.5F);
		bodyModel[162].rotateAngleX = 1.04719755F;
		
		bodyModel[163].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[163].setRotationPoint(-45F, -21F, -14.5F);
		bodyModel[163].rotateAngleX = 1.04719755F;
		
		bodyModel[164].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 124
		bodyModel[164].setRotationPoint(-45F, -21F, -14.5F);
		bodyModel[164].rotateAngleX = 1.04719755F;
		
		bodyModel[165].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[165].setRotationPoint(-45F, -21F, -14.5F);
		bodyModel[165].rotateAngleX = 1.04719755F;
		
		bodyModel[166].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 126
		bodyModel[166].setRotationPoint(-45F, -21F, -14.5F);
		bodyModel[166].rotateAngleX = 1.04719755F;
		
		bodyModel[167].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[167].setRotationPoint(-42F, -21F, -14.5F);
		bodyModel[167].rotateAngleX = 1.04719755F;
		
		bodyModel[168].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 128
		bodyModel[168].setRotationPoint(-42F, -21F, -14.5F);
		bodyModel[168].rotateAngleX = 1.04719755F;
		
		bodyModel[169].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 129
		bodyModel[169].setRotationPoint(-42F, -21F, -14.5F);
		bodyModel[169].rotateAngleX = 1.04719755F;
		
		bodyModel[170].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[170].setRotationPoint(-42F, -21F, -14.5F);
		bodyModel[170].rotateAngleX = 1.04719755F;
		
		bodyModel[171].addShapeBox(-5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[171].setRotationPoint(-45F, -21F, -14.5F);
		bodyModel[171].rotateAngleX = 1.04719755F;
		
		bodyModel[172].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[172].setRotationPoint(-45F, -21F, -14.5F);
		bodyModel[172].rotateAngleX = 1.04719755F;
		
		bodyModel[173].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[173].setRotationPoint(-45F, -21F, -14.5F);
		bodyModel[173].rotateAngleX = 1.04719755F;
		
		bodyModel[174].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[174].setRotationPoint(-42F, -21F, -14.5F);
		bodyModel[174].rotateAngleX = 1.04719755F;
		
		bodyModel[175].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[175].setRotationPoint(-42F, -21F, -14.5F);
		bodyModel[175].rotateAngleX = 1.04719755F;
		
		bodyModel[176].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[176].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[176].rotateAngleX = 1.04719755F;
		
		bodyModel[177].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 141
		bodyModel[177].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[177].rotateAngleX = 1.04719755F;
		
		bodyModel[178].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[178].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[178].rotateAngleX = 1.04719755F;
		
		bodyModel[179].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 143
		bodyModel[179].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[179].rotateAngleX = 1.04719755F;
		
		bodyModel[180].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[180].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[180].rotateAngleX = 1.04719755F;
		
		bodyModel[181].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 145
		bodyModel[181].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[181].rotateAngleX = 1.04719755F;
		
		bodyModel[182].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[182].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[182].rotateAngleX = 1.04719755F;
		
		bodyModel[183].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 147
		bodyModel[183].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[183].rotateAngleX = 1.04719755F;
		
		bodyModel[184].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[184].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[184].rotateAngleX = 1.04719755F;
		
		bodyModel[185].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 149
		bodyModel[185].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[185].rotateAngleX = 1.04719755F;
		
		bodyModel[186].addShapeBox(-5F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[186].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[186].rotateAngleX = 1.04719755F;
		
		bodyModel[187].addShapeBox(-5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[187].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[187].rotateAngleX = 1.04719755F;
		
		bodyModel[188].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[188].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[188].rotateAngleX = 1.04719755F;
		
		bodyModel[189].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[189].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[189].rotateAngleX = 1.04719755F;
		
		bodyModel[190].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[190].setRotationPoint(-27F, -21F, -14.5F);
		bodyModel[190].rotateAngleX = 1.04719755F;
		
		bodyModel[191].addShapeBox(7F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[191].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[191].rotateAngleX = 1.04719755F;
		
		bodyModel[192].addShapeBox(9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 156
		bodyModel[192].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[192].rotateAngleX = 1.04719755F;
		
		bodyModel[193].addShapeBox(7F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[193].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[193].rotateAngleX = 1.04719755F;
		
		bodyModel[194].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 158
		bodyModel[194].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[194].rotateAngleX = 1.04719755F;
		
		bodyModel[195].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[195].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[195].rotateAngleX = 1.04719755F;
		
		bodyModel[196].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 160
		bodyModel[196].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[196].rotateAngleX = 1.04719755F;
		
		bodyModel[197].addShapeBox(1F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[197].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[197].rotateAngleX = 1.04719755F;
		
		bodyModel[198].addShapeBox(0F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 162
		bodyModel[198].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[198].rotateAngleX = 1.04719755F;
		
		bodyModel[199].addShapeBox(-2F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[199].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[199].rotateAngleX = 1.04719755F;
		
		bodyModel[200].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 164
		bodyModel[200].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[200].rotateAngleX = 1.04719755F;
		
		bodyModel[201].addShapeBox(-5F, -1.5F, -3.5F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[201].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[201].rotateAngleX = 1.04719755F;
		
		bodyModel[202].addShapeBox(-5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[202].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[202].rotateAngleX = 1.04719755F;
		
		bodyModel[203].addShapeBox(-2F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[203].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[203].rotateAngleX = 1.04719755F;
		
		bodyModel[204].addShapeBox(1F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[204].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[204].rotateAngleX = 1.04719755F;
		
		bodyModel[205].addShapeBox(4F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[205].setRotationPoint(-11F, -21F, -14.5F);
		bodyModel[205].rotateAngleX = 1.04719755F;
		
		bodyModel[206].addBox(0F, 0F, 0F, 2, 10, 28, 0F); // Box 170
		bodyModel[206].setRotationPoint(11F, -18F, -14F);
		bodyModel[206].rotateAngleZ = -0.2268928F;
		
		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F); // Box 0
		bodyModel[207].setRotationPoint(4F, 1F, -13F);
		
		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F); // Box 1
		bodyModel[208].setRotationPoint(-3F, 1F, -13F);
		
		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F); // Box 2
		bodyModel[209].setRotationPoint(-18F, 1F, -13F);
		
		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F); // Box 3
		bodyModel[210].setRotationPoint(-10.5F, 1F, -13F);
		
		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F, 0F, 0F, 7.2F); // Box 4
		bodyModel[211].setRotationPoint(-33F, 1F, -13F);
		
		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F); // Box 5
		bodyModel[212].setRotationPoint(-25.5F, 1F, -13F);
		
		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F, 0F, 0F, 5.2F); // Box 6
		bodyModel[213].setRotationPoint(-40F, 1F, -13F);
		
		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F, 0F, 0F, 6.2F, 0F, 0F, 6.2F, 0F, 0F, 6.2F, 0F, 0F, 6.2F, 0F, 0F, 6.2F, 0F, 0F, 6.2F, 0F, 0F, 6.2F, 0F, 0F, 6.2F); // Box 7
		bodyModel[214].setRotationPoint(15F, -1.5F, -13F);
		
		bodyModel[215].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 1
		bodyModel[215].setRotationPoint(6.5F, -18F, -18.5F);
		bodyModel[215].rotateAngleX = -0.48869219F;
		bodyModel[215].rotateAngleY = 0.13962634F;
		bodyModel[215].rotateAngleZ = 0.03490659F;
		
		bodyModel[216].addShapeBox(0F, 0F, 0F, 35, 1, 35, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, -25F, 0F, 0F, -25F); // Box 0
		bodyModel[216].setRotationPoint(40F, -17.4F, -5F);
		bodyModel[216].rotateAngleZ = -0.08726646F;
		
		bodyModel[217].addShapeBox(0F, 0F, 0F, 35, 1, 35, 0F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, -29F, 0F, 0F, -29F); // Box 0
		bodyModel[217].setRotationPoint(-21F, -24.5F, 13F);
		bodyModel[217].rotateAngleX = -1.04719755F;
		
		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 18
		bodyModel[218].setRotationPoint(-2F, -30.5F, -0.5F);
		
		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1.2F, -0.55F, -0.2F, 0.8F, -0.55F, -0.2F, 0.8F, -0.55F, -0.2F, -1.2F, -0.55F, -0.2F); // Box 19
		bodyModel[219].setRotationPoint(-2F, -28.5F, -0.5F);
		
		bodyModel[220].addShapeBox(-0.8F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
		bodyModel[220].setRotationPoint(11.5F, -17F, -4F);
		bodyModel[220].rotateAngleZ = -0.2268928F;
		
		bodyModel[221].addShapeBox(0F, -1F, 0F, 60, 60, 1, 0F, 0F, 0F, 0F, -57F, 0F, 0F, -57F, 0F, 0F, 0F, 0F, 0F, 0F, -57F, 0F, -57F, -57F, 0F, -57F, -57F, 0F, 0F, -57F, 0F); // Box 17
		bodyModel[221].setRotationPoint(10.3F, -16F, 0.5F);
		bodyModel[221].rotateAngleX = -0.2443461F;
		bodyModel[221].rotateAngleY = -1.57079633F;
		
		bodyModel[222].addShapeBox(-0.8F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		bodyModel[222].setRotationPoint(11.5F, -17F, 8F);
		bodyModel[222].rotateAngleZ = -0.2268928F;
		
		bodyModel[223].addShapeBox(0F, -1F, 0F, 60, 60, 1, 0F, 0F, 0F, 0F, -57F, 0F, 0F, -57F, 0F, 0F, 0F, 0F, 0F, 0F, -57F, 0F, -57F, -57F, 0F, -57F, -57F, 0F, 0F, -57F, 0F); // Box 24
		bodyModel[223].setRotationPoint(10.3F, -16F, 12.5F);
		bodyModel[223].rotateAngleX = -0.2443461F;
		bodyModel[223].rotateAngleY = -1.57079633F;
		
		bodyModel[224].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[224].setRotationPoint(-46F, -40F, 10F);
		
		
		bodyDoorOpenModel = new ModelRendererTurbo[8];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 41
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 42
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 45
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 46
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 3
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 4
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 5
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 6
		
		bodyDoorOpenModel[0].addShapeBox(0F, 0F, -13F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -1F, -10F, 0F, -1F); // Box 41
		bodyDoorOpenModel[0].setRotationPoint(-54F, -19F, 23F);
		bodyDoorOpenModel[0].rotateAngleY = -0.78539816F;
		
		bodyDoorOpenModel[1].addShapeBox(7F, 7F, -13F, 1, 1, 13, 0F, 1F, 13F, 0F, -1F, 13F, 0F, -1F, 13F, -1F, 1F, 13F, -1F, 7F, -8F, 0F, -7F, -8F, 0F, -7F, -8F, 0F, 7F, -8F, 0F); // Box 42
		bodyDoorOpenModel[1].setRotationPoint(-54F, -19F, 23F);
		bodyDoorOpenModel[1].rotateAngleY = -0.78539816F;
		
		bodyDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, 0F, -10F, 0F, 0F); // Box 45
		bodyDoorOpenModel[2].setRotationPoint(-54F, -19F, -23F);
		bodyDoorOpenModel[2].rotateAngleY = 0.78539816F;
		
		bodyDoorOpenModel[3].addShapeBox(7F, 7F, 0F, 1, 1, 13, 0F, 1F, 13F, -1F, -1F, 13F, -1F, -1F, 13F, 0F, 1F, 13F, 0F, 7F, -8F, 0F, -7F, -8F, 0F, -7F, -8F, 0F, 7F, -8F, 0F); // Box 46
		bodyDoorOpenModel[3].setRotationPoint(-54F, -19F, -23F);
		bodyDoorOpenModel[3].rotateAngleY = 0.78539816F;
		
		bodyDoorOpenModel[4].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 3
		bodyDoorOpenModel[4].setRotationPoint(-53F, -16F, -13F);
		bodyDoorOpenModel[4].rotateAngleY = 0.87266463F;
		
		bodyDoorOpenModel[5].addBox(-5F, 0F, 4F, 5, 1, 1, 0F); // Box 4
		bodyDoorOpenModel[5].setRotationPoint(-53F, -16F, -13F);
		bodyDoorOpenModel[5].rotateAngleY = 0.87266463F;
		
		bodyDoorOpenModel[6].addShapeBox(-5F, 0F, -5F, 5, 1, 1, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 5
		bodyDoorOpenModel[6].setRotationPoint(-53F, -16F, 13F);
		bodyDoorOpenModel[6].rotateAngleY = -0.78539816F;
		
		bodyDoorOpenModel[7].addBox(0F, 0F, -5F, 1, 1, 5, 0F); // Box 6
		bodyDoorOpenModel[7].setRotationPoint(-53F, -16F, 13F);
		bodyDoorOpenModel[7].rotateAngleY = -0.78539816F;
		
		
		bodyDoorCloseModel = new ModelRendererTurbo[8];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 37
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 64
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 214
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 12
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 40
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 0
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 1
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 2
		
		bodyDoorCloseModel[0].addShapeBox(7F, 7F, -13F, 1, 1, 13, 0F, 1F, 13F, 0F, -1F, 13F, 0F, -1F, 13F, -1F, 1F, 13F, -1F, 7F, -8F, 0F, -7F, -8F, 0F, -7F, -8F, 0F, 7F, -8F, 0F); // Box 37
		bodyDoorCloseModel[0].setRotationPoint(-60F, -19F, 13F);
		
		bodyDoorCloseModel[1].addShapeBox(0F, 0F, -13F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -1F, -10F, 0F, -1F); // Box 64
		bodyDoorCloseModel[1].setRotationPoint(-60F, -19F, 13F);
		
		bodyDoorCloseModel[2].addBox(0F, 0F, -5F, 1, 1, 5, 0F); // Box 214
		bodyDoorCloseModel[2].setRotationPoint(-53F, -16F, 13F);
		
		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, 0F, -10F, 0F, 0F); // Box 12
		bodyDoorCloseModel[3].setRotationPoint(-60F, -19F, -13F);
		
		bodyDoorCloseModel[4].addShapeBox(7F, 7F, 0F, 1, 1, 13, 0F, 1F, 13F, -1F, -1F, 13F, -1F, -1F, 13F, 0F, 1F, 13F, 0F, 7F, -8F, 0F, -7F, -8F, 0F, -7F, -8F, 0F, 7F, -8F, 0F); // Box 40
		bodyDoorCloseModel[4].setRotationPoint(-60F, -19F, -13F);
		
		bodyDoorCloseModel[5].addBox(-5F, 0F, -5F, 5, 1, 1, 0F); // Box 0
		bodyDoorCloseModel[5].setRotationPoint(-53F, -16F, 13F);
		
		bodyDoorCloseModel[6].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 1
		bodyDoorCloseModel[6].setRotationPoint(-53F, -16F, -13F);
		
		bodyDoorCloseModel[7].addBox(-5F, 0F, 4F, 5, 1, 1, 0F); // Box 2
		bodyDoorCloseModel[7].setRotationPoint(-53F, -16F, -13F);
		
		
		leftFrontWheelModel = new ModelRendererTurbo[2];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 321, 292, textureX, textureY); // Shape 10
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 321, 292, textureX, textureY); // Shape 35
		
		leftFrontWheelModel[0].addShape3D(8.5F, -8.5F, -6F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(14, 0, 14, 0), new Coord2D(17, 3, 17, 3), new Coord2D(17, 14, 17, 14), new Coord2D(14, 17, 14, 17), new Coord2D(3, 17, 3, 17), new Coord2D(0, 14, 0, 14), new Coord2D(0, 3, 0, 3)}), 6, 17, 17, 64, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 11, 5, 11, 5, 11, 5, 11}); // Shape 10
		leftFrontWheelModel[0].setRotationPoint(45.5F, 0.5F, 13F);
		
		leftFrontWheelModel[1].addShape3D(8.5F, -8.5F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(14, 0, 14, 0), new Coord2D(17, 3, 17, 3), new Coord2D(17, 14, 17, 14), new Coord2D(14, 17, 14, 17), new Coord2D(3, 17, 3, 17), new Coord2D(0, 14, 0, 14), new Coord2D(0, 3, 0, 3)}), 6, 17, 17, 64, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 11, 5, 11, 5, 11, 5, 11}); // Shape 35
		leftFrontWheelModel[1].setRotationPoint(45.5F, 0.5F, -13F);
		
		
		leftBackWheelModel = new ModelRendererTurbo[11];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 52
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 13
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 14
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 15
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 20
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 21
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 23
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 52
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 90
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 91
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 92
		
		leftBackWheelModel[0].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 52
		leftBackWheelModel[0].setRotationPoint(5F, 2F, 16F);
		
		leftBackWheelModel[1].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 13
		leftBackWheelModel[1].setRotationPoint(-9.5F, 2F, 16F);
		
		leftBackWheelModel[2].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 14
		leftBackWheelModel[2].setRotationPoint(-39F, 2F, 16F);
		
		leftBackWheelModel[3].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 15
		leftBackWheelModel[3].setRotationPoint(-24.5F, 2F, 16F);
		
		leftBackWheelModel[4].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 20
		leftBackWheelModel[4].setRotationPoint(-2F, 2F, 18F);
		
		leftBackWheelModel[5].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 21
		leftBackWheelModel[5].setRotationPoint(-17F, 2F, 18F);
		
		leftBackWheelModel[6].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 23
		leftBackWheelModel[6].setRotationPoint(-32F, 2F, 18F);
		
		leftBackWheelModel[7].addShape3D(4.5F, -4.5F, -3F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 52
		leftBackWheelModel[7].setRotationPoint(16F, -0.5F, 16F);
		
		leftBackWheelModel[8].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 90
		leftBackWheelModel[8].setRotationPoint(-2F, 2F, 15F);
		
		leftBackWheelModel[9].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 91
		leftBackWheelModel[9].setRotationPoint(-17F, 2F, 15F);
		
		leftBackWheelModel[10].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 92
		leftBackWheelModel[10].setRotationPoint(-32F, 2F, 15F);
		
		
		rightBackWheelModel = new ModelRendererTurbo[11];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 16
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 17
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 18
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 19
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 24
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 25
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 376, 237, textureX, textureY); // Shape 26
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 29
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 93
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 94
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 95
		
		rightBackWheelModel[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 16
		rightBackWheelModel[0].setRotationPoint(5F, 2F, -16F);
		
		rightBackWheelModel[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 17
		rightBackWheelModel[1].setRotationPoint(-9.5F, 2F, -16F);
		
		rightBackWheelModel[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 18
		rightBackWheelModel[2].setRotationPoint(-39F, 2F, -16F);
		
		rightBackWheelModel[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 19
		rightBackWheelModel[3].setRotationPoint(-24.5F, 2F, -16F);
		
		rightBackWheelModel[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 24
		rightBackWheelModel[4].setRotationPoint(-2F, 2F, -18F);
		
		rightBackWheelModel[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 25
		rightBackWheelModel[5].setRotationPoint(-17F, 2F, -18F);
		
		rightBackWheelModel[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 26
		rightBackWheelModel[6].setRotationPoint(-32F, 2F, -18F);
		
		rightBackWheelModel[7].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 29
		rightBackWheelModel[7].setRotationPoint(16F, -0.5F, -16F);
		
		rightBackWheelModel[8].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 93
		rightBackWheelModel[8].setRotationPoint(-32F, 2F, -15F);
		
		rightBackWheelModel[9].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 94
		rightBackWheelModel[9].setRotationPoint(-17F, 2F, -15F);
		
		rightBackWheelModel[10].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 95
		rightBackWheelModel[10].setRotationPoint(-2F, 2F, -15F);
		
		
		leftTrackModel = new ModelRendererTurbo[14];
		leftTrackModel[0] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 17
		leftTrackModel[1] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 18
		leftTrackModel[2] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 19
		leftTrackModel[3] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 20
		leftTrackModel[4] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 21
		leftTrackModel[5] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 22
		leftTrackModel[6] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 23
		leftTrackModel[7] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 24
		leftTrackModel[8] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 25
		leftTrackModel[9] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 26
		leftTrackModel[10] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 27
		leftTrackModel[11] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 28
		leftTrackModel[12] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 29
		leftTrackModel[13] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 30
		
		leftTrackModel[0].addBox(-5F, 0F, 0F, 5, 1, 7, 0F); // Box 17
		leftTrackModel[0].setRotationPoint(-46.3F, -1F, 14F);
		leftTrackModel[0].rotateAngleZ = 1.58824962F;
		
		leftTrackModel[1].addBox(-4F, 0F, 0F, 3, 1, 7, 0F); // Box 18
		leftTrackModel[1].setRotationPoint(-44.3F, -4.5F, 14F);
		leftTrackModel[1].rotateAngleZ = 1.06465084F;
		
		leftTrackModel[2].addBox(-4F, 0F, 0F, 4, 1, 7, 0F); // Box 19
		leftTrackModel[2].setRotationPoint(-41F, -5F, 14F);
		leftTrackModel[2].rotateAngleZ = 0.36651914F;
		
		leftTrackModel[3].addBox(0F, 0F, 0F, 50, 1, 7, 0F); // Box 20
		leftTrackModel[3].setRotationPoint(-41F, -5F, 14F);
		
		leftTrackModel[4].addBox(0F, -1F, 0F, 7, 1, 7, 0F); // Box 21
		leftTrackModel[4].setRotationPoint(9F, -4F, 14F);
		leftTrackModel[4].rotateAngleZ = 0.17453293F;
		
		leftTrackModel[5].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 22
		leftTrackModel[5].setRotationPoint(15.7F, -6.2F, 14F);
		leftTrackModel[5].rotateAngleZ = -0.20943951F;
		
		leftTrackModel[6].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 23
		leftTrackModel[6].setRotationPoint(19.6F, -5.4F, 14F);
		leftTrackModel[6].rotateAngleZ = -0.87266463F;
		
		leftTrackModel[7].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 24
		leftTrackModel[7].setRotationPoint(21.5F, -3.1F, 14F);
		leftTrackModel[7].rotateAngleZ = -1.6406095F;
		
		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		leftTrackModel[8].setRotationPoint(21.3F, 1.9F, 14F);
		leftTrackModel[8].rotateAngleZ = -2.02458193F;
		
		leftTrackModel[9].addShapeBox(0F, -1F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 26
		leftTrackModel[9].setRotationPoint(15.9F, 7.8F, 14F);
		leftTrackModel[9].rotateAngleZ = 0.66322512F;
		
		leftTrackModel[10].addBox(0F, -1F, 0F, 7, 1, 7, 0F); // Box 27
		leftTrackModel[10].setRotationPoint(9F, 9F, 14F);
		leftTrackModel[10].rotateAngleZ = 0.17453293F;
		
		leftTrackModel[11].addBox(0F, 0F, 0F, 48, 1, 7, 0F); // Box 28
		leftTrackModel[11].setRotationPoint(-39F, 8F, 14F);
		
		leftTrackModel[12].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 29
		leftTrackModel[12].setRotationPoint(-39F, 9F, 14F);
		leftTrackModel[12].rotateAngleZ = 2.8099801F;
		
		leftTrackModel[13].addShapeBox(-4F, 0F, 0F, 3, 1, 7, 0F, 0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		leftTrackModel[13].setRotationPoint(-46.5F, 3F, 14F);
		leftTrackModel[13].rotateAngleZ = 1.97222205F;
		
		
		rightTrackModel = new ModelRendererTurbo[14];
		rightTrackModel[0] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 67
		rightTrackModel[1] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 75
		rightTrackModel[2] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 6
		rightTrackModel[3] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 7
		rightTrackModel[4] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 8
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 9
		rightTrackModel[6] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 10
		rightTrackModel[7] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 11
		rightTrackModel[8] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 12
		rightTrackModel[9] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 13
		rightTrackModel[10] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 14
		rightTrackModel[11] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 15
		rightTrackModel[12] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 16
		rightTrackModel[13] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 17
		
		rightTrackModel[0].addBox(0F, 0F, 0F, 50, 1, 7, 0F); // Box 67
		rightTrackModel[0].setRotationPoint(-41F, -5F, -21F);
		
		rightTrackModel[1].addBox(0F, 0F, 0F, 48, 1, 7, 0F); // Box 75
		rightTrackModel[1].setRotationPoint(-39F, 8F, -21F);
		
		rightTrackModel[2].addBox(-5F, 0F, 0F, 5, 1, 7, 0F); // Box 6
		rightTrackModel[2].setRotationPoint(-46.3F, -1F, -21F);
		rightTrackModel[2].rotateAngleZ = 1.58824962F;
		
		rightTrackModel[3].addBox(-4F, 0F, 0F, 3, 1, 7, 0F); // Box 7
		rightTrackModel[3].setRotationPoint(-44.3F, -4.5F, -21F);
		rightTrackModel[3].rotateAngleZ = 1.06465084F;
		
		rightTrackModel[4].addBox(-4F, 0F, 0F, 4, 1, 7, 0F); // Box 8
		rightTrackModel[4].setRotationPoint(-41F, -5F, -21F);
		rightTrackModel[4].rotateAngleZ = 0.36651914F;
		
		rightTrackModel[5].addBox(0F, -1F, 0F, 7, 1, 7, 0F); // Box 9
		rightTrackModel[5].setRotationPoint(9F, -4F, -21F);
		rightTrackModel[5].rotateAngleZ = 0.17453293F;
		
		rightTrackModel[6].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 10
		rightTrackModel[6].setRotationPoint(15.7F, -6.2F, -21F);
		rightTrackModel[6].rotateAngleZ = -0.20943951F;
		
		rightTrackModel[7].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 11
		rightTrackModel[7].setRotationPoint(19.6F, -5.4F, -21F);
		rightTrackModel[7].rotateAngleZ = -0.87266463F;
		
		rightTrackModel[8].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 12
		rightTrackModel[8].setRotationPoint(21.5F, -3.1F, -21F);
		rightTrackModel[8].rotateAngleZ = -1.6406095F;
		
		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[9].setRotationPoint(21.3F, 1.9F, -21F);
		rightTrackModel[9].rotateAngleZ = -2.02458193F;
		
		rightTrackModel[10].addShapeBox(0F, -1F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[10].setRotationPoint(15.9F, 7.8F, -21F);
		rightTrackModel[10].rotateAngleZ = 0.66322512F;
		
		rightTrackModel[11].addBox(0F, -1F, 0F, 7, 1, 7, 0F); // Box 15
		rightTrackModel[11].setRotationPoint(9F, 9F, -21F);
		rightTrackModel[11].rotateAngleZ = 0.17453293F;
		
		rightTrackModel[12].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 16
		rightTrackModel[12].setRotationPoint(-39F, 9F, -21F);
		rightTrackModel[12].rotateAngleZ = 2.8099801F;
		
		rightTrackModel[13].addShapeBox(-4F, 0F, 0F, 3, 1, 7, 0F, 0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightTrackModel[13].setRotationPoint(-46.5F, 3F, -21F);
		rightTrackModel[13].rotateAngleZ = 1.97222205F;
		
		
		steeringWheelModel = new ModelRendererTurbo[7];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 171
		steeringWheelModel[1] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 175
		steeringWheelModel[2] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 176
		steeringWheelModel[3] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 177
		steeringWheelModel[4] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 178
		steeringWheelModel[5] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 180
		steeringWheelModel[6] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 20
		
		steeringWheelModel[0].addBox(0F, -3F, 3F, 1, 6, 1, 0F); // Box 171
		steeringWheelModel[0].setRotationPoint(8F, -17F, 7F);
		steeringWheelModel[0].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[1].addBox(0F, -3F, -4F, 1, 6, 1, 0F); // Box 175
		steeringWheelModel[1].setRotationPoint(8F, -17F, 7F);
		steeringWheelModel[1].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[2].addShapeBox(0F, -4F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 176
		steeringWheelModel[2].setRotationPoint(8F, -17F, 7F);
		steeringWheelModel[2].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[3].addShapeBox(0F, 3F, -3F, 1, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		steeringWheelModel[3].setRotationPoint(8F, -17F, 7F);
		steeringWheelModel[3].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[4].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 178
		steeringWheelModel[4].setRotationPoint(8F, -17F, 7F);
		steeringWheelModel[4].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[5].addShapeBox(0F, -1F, -3F, 1, 1, 6, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 180
		steeringWheelModel[5].setRotationPoint(8F, -17F, 7F);
		steeringWheelModel[5].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[6].addShapeBox(1.6F, -1F, -3F, 1, 1, 6, 0F, 0.8F, -0.2F, -2.8F, 0.8F, -0.2F, -2.8F, 0.8F, -0.2F, -2.8F, 0.8F, -0.2F, -2.8F, 0.8F, -0.2F, -2.8F, 0.8F, -0.2F, -2.8F, 0.8F, -0.2F, -2.8F, 0.8F, -0.2F, -2.8F); // Box 20
		steeringWheelModel[6].setRotationPoint(8F, -17F, 7F);
		steeringWheelModel[6].rotateAngleZ = -0.2268928F;
		
		
		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];
		
		gun_1_Model[0] = new ModelRendererTurbo[0];
		
		gun_1_Model[1] = new ModelRendererTurbo[16];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 9, 223, textureX, textureY); // Box 4
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 5
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 1, 231, textureX, textureY); // Box 6
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 57, 223, textureX, textureY); // Box 7
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 17, 231, textureX, textureY); // Box 8
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 9
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 33, 231, textureX, textureY); // Box 10
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 41, 231, textureX, textureY); // Box 12
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 49, 231, textureX, textureY); // Box 13
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 15
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 9, 239, textureX, textureY); // Box 16
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 17, 239, textureX, textureY); // Box 17
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 25, 239, textureX, textureY); // Box 18
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 33, 223, textureX, textureY); // Box 19
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 1, 247, textureX, textureY); // Box 0
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 49, 239, textureX, textureY); // Box 1
		
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
			gunPart.setRotationPoint(-3F, -30F, 0F);
		}
		
		
		gun_1_Model[2] = new ModelRendererTurbo[0];
		
		registerGunModel("PassengerGun1", gun_1_Model);
		
		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];
		
		gun_2_Model[0] = new ModelRendererTurbo[0];
		
		gun_2_Model[1] = new ModelRendererTurbo[16];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 9, 223, textureX, textureY); // Box 4
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 5
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 1, 231, textureX, textureY); // Box 6
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 57, 223, textureX, textureY); // Box 7
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 17, 231, textureX, textureY); // Box 8
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 25, 231, textureX, textureY); // Box 9
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 33, 231, textureX, textureY); // Box 10
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 41, 231, textureX, textureY); // Box 12
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 49, 231, textureX, textureY); // Box 13
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 15
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 9, 239, textureX, textureY); // Box 16
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 17, 239, textureX, textureY); // Box 17
		gun_2_Model[1][12] = new ModelRendererTurbo(this, 25, 239, textureX, textureY); // Box 18
		gun_2_Model[1][13] = new ModelRendererTurbo(this, 33, 223, textureX, textureY); // Box 19
		gun_2_Model[1][14] = new ModelRendererTurbo(this, 1, 247, textureX, textureY); // Box 0
		gun_2_Model[1][15] = new ModelRendererTurbo(this, 49, 239, textureX, textureY); // Box 1
		
		gun_2_Model[1][0].addShapeBox(1F, -1.3F, -0.5F, 12, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 4
		
		gun_2_Model[1][1].addShapeBox(-2F, -1.3F, -0.5F, 3, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 5
		
		gun_2_Model[1][2].addShapeBox(-7F, -1.3F, -0.5F, 5, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.2F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.2F); // Box 6
		
		gun_2_Model[1][3].addShapeBox(14F, -1.3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Box 7
		
		gun_2_Model[1][4].addShapeBox(13F, -1.3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Box 8
		
		gun_2_Model[1][5].addShapeBox(0F, -1.5F, -2F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 9
		
		gun_2_Model[1][6].addShapeBox(0F, -1.5F, -1.5F, 1, 2, 1, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 10
		
		gun_2_Model[1][7].addShapeBox(12F, -2.3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 12
		
		gun_2_Model[1][8].addShapeBox(2F, -2F, -1F, 2, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 13
		
		gun_2_Model[1][9].addShapeBox(-4.9F, -1.8F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		
		gun_2_Model[1][10].addShapeBox(-9F, -1.3F, -0.5F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1F, 0F); // Box 16
		
		gun_2_Model[1][11].addShapeBox(-6F, 0.2F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -0.2F); // Box 17
		
		gun_2_Model[1][12].addShapeBox(-1.5F, -0.8F, 1F, 2, 3, 4, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 18
		
		gun_2_Model[1][13].addShapeBox(-1.5F, -1.5F, 0.4F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		
		gun_2_Model[1][14].addShapeBox(1F, -1.3F, -0.5F, 12, 1, 1, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F); // Box 0
		
		gun_2_Model[1][15].addShapeBox(-1.5F, -0.9F, 1F, 2, 3, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 1
		
		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-58F, -32F, 0F);
		}
		
		
		gun_2_Model[2] = new ModelRendererTurbo[0];
		
		registerGunModel("PassengerGun2", gun_2_Model);
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
