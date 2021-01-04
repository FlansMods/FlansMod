//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelPanzer extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPanzer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[278];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 30
		bodyModel[22] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 35
		bodyModel[25] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 36
		bodyModel[26] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 37
		bodyModel[27] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 75
		bodyModel[31] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 77
		bodyModel[32] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 78
		bodyModel[33] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 79
		bodyModel[34] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 80
		bodyModel[35] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 81
		bodyModel[36] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 82
		bodyModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 83
		bodyModel[38] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 84
		bodyModel[39] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 85
		bodyModel[40] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 86
		bodyModel[41] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 87
		bodyModel[42] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 88
		bodyModel[43] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 89
		bodyModel[44] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 90
		bodyModel[45] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 91
		bodyModel[46] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 92
		bodyModel[47] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 93
		bodyModel[48] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 94
		bodyModel[49] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 135
		bodyModel[50] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 136
		bodyModel[51] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 138
		bodyModel[52] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 141
		bodyModel[53] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 142
		bodyModel[54] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 145
		bodyModel[55] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 149
		bodyModel[56] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 150
		bodyModel[57] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 151
		bodyModel[58] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 152
		bodyModel[59] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 153
		bodyModel[60] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 154
		bodyModel[61] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 155
		bodyModel[62] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 156
		bodyModel[63] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 157
		bodyModel[64] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 158
		bodyModel[65] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 159
		bodyModel[66] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 160
		bodyModel[67] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 161
		bodyModel[68] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 162
		bodyModel[69] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 163
		bodyModel[70] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 164
		bodyModel[71] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 165
		bodyModel[72] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 166
		bodyModel[73] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 167
		bodyModel[74] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 168
		bodyModel[75] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 169
		bodyModel[76] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 170
		bodyModel[77] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 171
		bodyModel[78] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 172
		bodyModel[79] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 173
		bodyModel[80] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 174
		bodyModel[81] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 175
		bodyModel[82] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 176
		bodyModel[83] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 177
		bodyModel[84] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 178
		bodyModel[85] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 179
		bodyModel[86] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 180
		bodyModel[87] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 181
		bodyModel[88] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 182
		bodyModel[89] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 183
		bodyModel[90] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 184
		bodyModel[91] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 185
		bodyModel[92] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 186
		bodyModel[93] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 187
		bodyModel[94] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 188
		bodyModel[95] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 189
		bodyModel[96] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 190
		bodyModel[97] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 191
		bodyModel[98] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 192
		bodyModel[99] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 194
		bodyModel[100] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 195
		bodyModel[101] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 196
		bodyModel[102] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 197
		bodyModel[103] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 198
		bodyModel[104] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 199
		bodyModel[105] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 200
		bodyModel[106] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 201
		bodyModel[107] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 202
		bodyModel[108] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 203
		bodyModel[109] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 204
		bodyModel[110] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 205
		bodyModel[111] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 215
		bodyModel[112] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 216
		bodyModel[113] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 217
		bodyModel[114] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 218
		bodyModel[115] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Box 290
		bodyModel[116] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 378
		bodyModel[117] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 379
		bodyModel[118] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 380
		bodyModel[119] = new ModelRendererTurbo(this, 417, 385, textureX, textureY); // Box 383
		bodyModel[120] = new ModelRendererTurbo(this, 465, 385, textureX, textureY); // Box 384
		bodyModel[121] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Box 385
		bodyModel[122] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 386
		bodyModel[123] = new ModelRendererTurbo(this, 209, 401, textureX, textureY); // Box 387
		bodyModel[124] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 390
		bodyModel[125] = new ModelRendererTurbo(this, 73, 401, textureX, textureY); // Box 392
		bodyModel[126] = new ModelRendererTurbo(this, 345, 409, textureX, textureY); // Box 393
		bodyModel[127] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 46
		bodyModel[128] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 47
		bodyModel[129] = new ModelRendererTurbo(this, 209, 369, textureX, textureY); // Box 185
		bodyModel[130] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Box 45
		bodyModel[131] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 9
		bodyModel[132] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 10
		bodyModel[133] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 11
		bodyModel[134] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 12
		bodyModel[135] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 13
		bodyModel[136] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 14
		bodyModel[137] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 15
		bodyModel[138] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 16
		bodyModel[139] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 17
		bodyModel[140] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 28
		bodyModel[141] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 29
		bodyModel[142] = new ModelRendererTurbo(this, 25, 257, textureX, textureY); // Box 30
		bodyModel[143] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 31
		bodyModel[144] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 32
		bodyModel[145] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 33
		bodyModel[146] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Box 34
		bodyModel[147] = new ModelRendererTurbo(this, 449, 401, textureX, textureY); // Box 35
		bodyModel[148] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 26
		bodyModel[150] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 27
		bodyModel[151] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 28
		bodyModel[152] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 29
		bodyModel[153] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 30
		bodyModel[154] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 31
		bodyModel[155] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 32
		bodyModel[156] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 33
		bodyModel[157] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 34
		bodyModel[158] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 35
		bodyModel[159] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 36
		bodyModel[160] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 37
		bodyModel[161] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 38
		bodyModel[162] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 39
		bodyModel[163] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 40
		bodyModel[164] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 41
		bodyModel[165] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 42
		bodyModel[166] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 43
		bodyModel[167] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 44
		bodyModel[168] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 50
		bodyModel[169] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 51
		bodyModel[170] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 52
		bodyModel[171] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 53
		bodyModel[172] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 54
		bodyModel[173] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 55
		bodyModel[174] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 56
		bodyModel[175] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 57
		bodyModel[176] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 58
		bodyModel[177] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 59
		bodyModel[178] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 60
		bodyModel[179] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 61
		bodyModel[180] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 62
		bodyModel[181] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 63
		bodyModel[182] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 64
		bodyModel[183] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 65
		bodyModel[184] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 66
		bodyModel[185] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 67
		bodyModel[186] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 68
		bodyModel[187] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 69
		bodyModel[188] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 70
		bodyModel[189] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Box 1
		bodyModel[190] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Box 2
		bodyModel[191] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 53
		bodyModel[192] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 6
		bodyModel[193] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 7
		bodyModel[194] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 8
		bodyModel[195] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 9
		bodyModel[196] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 10
		bodyModel[197] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 11
		bodyModel[198] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 12
		bodyModel[199] = new ModelRendererTurbo(this, 105, 425, textureX, textureY); // Box 13
		bodyModel[200] = new ModelRendererTurbo(this, 161, 425, textureX, textureY); // Box 14
		bodyModel[201] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 32
		bodyModel[202] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 33
		bodyModel[203] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 34
		bodyModel[204] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 35
		bodyModel[205] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 1
		bodyModel[206] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 1
		bodyModel[207] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 2
		bodyModel[208] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 3
		bodyModel[209] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 4
		bodyModel[210] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 5
		bodyModel[211] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 6
		bodyModel[212] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 7
		bodyModel[213] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 8
		bodyModel[214] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 9
		bodyModel[215] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 10
		bodyModel[216] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 11
		bodyModel[217] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 12
		bodyModel[218] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 13
		bodyModel[219] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 14
		bodyModel[220] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 15
		bodyModel[221] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 16
		bodyModel[222] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 17
		bodyModel[223] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 18
		bodyModel[224] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19
		bodyModel[225] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 25
		bodyModel[226] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[227] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 3
		bodyModel[228] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 1
		bodyModel[229] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 2
		bodyModel[230] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 3
		bodyModel[231] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 4
		bodyModel[232] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 5
		bodyModel[233] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 6
		bodyModel[234] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 24
		bodyModel[235] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 25
		bodyModel[236] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 26
		bodyModel[237] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 27
		bodyModel[238] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 28
		bodyModel[239] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 29
		bodyModel[240] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 34
		bodyModel[241] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 50
		bodyModel[242] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 51
		bodyModel[243] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 52
		bodyModel[244] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 53
		bodyModel[245] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 54
		bodyModel[246] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 55
		bodyModel[247] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 57
		bodyModel[248] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 58
		bodyModel[249] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 59
		bodyModel[250] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 60
		bodyModel[251] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 61
		bodyModel[252] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 70
		bodyModel[253] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 71
		bodyModel[254] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 72
		bodyModel[255] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 73
		bodyModel[256] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 74
		bodyModel[257] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 75
		bodyModel[258] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 76
		bodyModel[259] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 77
		bodyModel[260] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 78
		bodyModel[261] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 79
		bodyModel[262] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 80
		bodyModel[263] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 81
		bodyModel[264] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 82
		bodyModel[265] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 83
		bodyModel[266] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 84
		bodyModel[267] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 85
		bodyModel[268] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 86
		bodyModel[269] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 87
		bodyModel[270] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 88
		bodyModel[271] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 89
		bodyModel[272] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 90
		bodyModel[273] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 91
		bodyModel[274] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 92
		bodyModel[275] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 93
		bodyModel[276] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 94
		bodyModel[277] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Box 96

		bodyModel[0].addShapeBox(0F, 0F, 0F, 18, 15, 42, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(43F, -16F, -21F);

		bodyModel[1].addShapeBox(6F, -1F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(43F, -16F, -16F);
		bodyModel[1].rotateAngleZ = -0.3217497F;

		bodyModel[2].addShapeBox(9F, -1F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(43F, -16F, -16F);
		bodyModel[2].rotateAngleZ = -0.3217497F;

		bodyModel[3].addShapeBox(14F, -0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(43F, -16F, -16F);
		bodyModel[3].rotateAngleZ = -0.3217497F;

		bodyModel[4].addShapeBox(14F, -0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(43F, -16F, 13F);
		bodyModel[4].rotateAngleZ = -0.3217497F;

		bodyModel[5].addShapeBox(6F, -1F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(43F, -16F, 13F);
		bodyModel[5].rotateAngleZ = -0.3217497F;

		bodyModel[6].addShapeBox(9F, -1F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(43F, -16F, 13F);
		bodyModel[6].rotateAngleZ = -0.3217497F;

		bodyModel[7].addShapeBox(3F, -0.2F, 0F, 11, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(43F, -16F, -9F);
		bodyModel[7].rotateAngleZ = -0.3217497F;

		bodyModel[8].addShapeBox(4F, -1F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(43F, -16F, -9F);
		bodyModel[8].rotateAngleZ = -0.3217497F;

		bodyModel[9].addShapeBox(9F, -1F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(43F, -16F, -9F);
		bodyModel[9].rotateAngleZ = -0.3217497F;

		bodyModel[10].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(43F, -16F, -8F);
		bodyModel[10].rotateAngleZ = -0.3217497F;

		bodyModel[11].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(43F, -16F, -6F);
		bodyModel[11].rotateAngleZ = -0.3217497F;

		bodyModel[12].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(43F, -16F, -3F);
		bodyModel[12].rotateAngleZ = -0.3217497F;

		bodyModel[13].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(43F, -16F, -5F);
		bodyModel[13].rotateAngleZ = -0.3217497F;

		bodyModel[14].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(43F, -16F, 0F);
		bodyModel[14].rotateAngleZ = -0.3217497F;

		bodyModel[15].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(43F, -16F, -2F);
		bodyModel[15].rotateAngleZ = -0.3217497F;

		bodyModel[16].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[16].setRotationPoint(43F, -16F, 3F);
		bodyModel[16].rotateAngleZ = -0.3217497F;

		bodyModel[17].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(43F, -16F, 1F);
		bodyModel[17].rotateAngleZ = -0.3217497F;

		bodyModel[18].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[18].setRotationPoint(43F, -16F, 6F);
		bodyModel[18].rotateAngleZ = -0.3217497F;

		bodyModel[19].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[19].setRotationPoint(43F, -16F, 4F);
		bodyModel[19].rotateAngleZ = -0.3217497F;

		bodyModel[20].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[20].setRotationPoint(43F, -16F, 9F);
		bodyModel[20].rotateAngleZ = -0.3217497F;

		bodyModel[21].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[21].setRotationPoint(43F, -16F, 7F);
		bodyModel[21].rotateAngleZ = -0.3217497F;

		bodyModel[22].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[22].setRotationPoint(43F, -16F, 7F);
		bodyModel[22].rotateAngleZ = -0.3217497F;

		bodyModel[23].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[23].setRotationPoint(43F, -16F, 4F);
		bodyModel[23].rotateAngleZ = -0.3217497F;

		bodyModel[24].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[24].setRotationPoint(43F, -16F, 1F);
		bodyModel[24].rotateAngleZ = -0.3217497F;

		bodyModel[25].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[25].setRotationPoint(43F, -16F, -2F);
		bodyModel[25].rotateAngleZ = -0.3217497F;

		bodyModel[26].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[26].setRotationPoint(43F, -16F, -5F);
		bodyModel[26].rotateAngleZ = -0.3217497F;

		bodyModel[27].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[27].setRotationPoint(43F, -16F, -8F);
		bodyModel[27].rotateAngleZ = -0.3217497F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 89, 18, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[28].setRotationPoint(-46F, -15.5F, -21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 16, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 40
		bodyModel[29].setRotationPoint(43F, -1F, -21F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 30, 3, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[30].setRotationPoint(-17F, -18.5F, -27F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 80, 9, 50, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[31].setRotationPoint(-46F, -24.5F, -25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[32].setRotationPoint(-37F, -26.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[33].setRotationPoint(-35F, -25F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[34].setRotationPoint(-35F, -25F, 18F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 81
		bodyModel[35].setRotationPoint(-36F, -25F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 82
		bodyModel[36].setRotationPoint(-22F, -25F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[37].setRotationPoint(-25F, -24.7F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[38].setRotationPoint(-28F, -24.7F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[39].setRotationPoint(-31F, -24.7F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[40].setRotationPoint(-34F, -24.7F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[41].setRotationPoint(-37F, -24.7F, -15F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[42].setRotationPoint(-34F, -24.7F, -15F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[43].setRotationPoint(-31F, -24.7F, -15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[44].setRotationPoint(-28F, -24.7F, -15F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[45].setRotationPoint(-38F, -25F, -16F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[46].setRotationPoint(-38F, -25F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 93
		bodyModel[47].setRotationPoint(-39F, -25F, -16F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 94
		bodyModel[48].setRotationPoint(-25F, -25F, -16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 135
		bodyModel[49].setRotationPoint(-15.5F, -24.5F, -34F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 136
		bodyModel[50].setRotationPoint(6.5F, -24.5F, -34F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[51].setRotationPoint(-15.5F, -24.5F, 22F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[52].setRotationPoint(-15F, -19.5F, 26F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[53].setRotationPoint(6.5F, -24.5F, 22F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[54].setRotationPoint(3F, -23.5F, 26F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 149
		bodyModel[55].setRotationPoint(6F, -25.5F, -34F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[56].setRotationPoint(3F, -24.5F, 26F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[57].setRotationPoint(0F, -24.5F, 26F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[58].setRotationPoint(0F, -23.5F, 26F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[59].setRotationPoint(-3F, -24.5F, 26F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[60].setRotationPoint(-3F, -23.5F, 26F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[61].setRotationPoint(-6F, -24.5F, 26F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[62].setRotationPoint(-6F, -23.5F, 26F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[63].setRotationPoint(-9F, -24.5F, 26F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[64].setRotationPoint(-9F, -23.5F, 26F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[65].setRotationPoint(-12F, -24.5F, 26F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[66].setRotationPoint(-12F, -23.5F, 26F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[67].setRotationPoint(-14F, -21.5F, -28F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[68].setRotationPoint(-14F, -23.5F, -28F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[69].setRotationPoint(-13F, -24.5F, -28F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[70].setRotationPoint(-14F, -18.5F, -28F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 165
		bodyModel[71].setRotationPoint(-13F, -20.5F, -28F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 166
		bodyModel[72].setRotationPoint(-13F, -16.5F, -31F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[73].setRotationPoint(-14F, -18.5F, -31F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[74].setRotationPoint(-14F, -21.5F, -31F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[75].setRotationPoint(-14F, -23.5F, -31F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[76].setRotationPoint(-13F, -24.5F, -31F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[77].setRotationPoint(-12.5F, -22F, -29F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[78].setRotationPoint(-12.5F, -24F, -29F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 173
		bodyModel[79].setRotationPoint(-12.5F, -19F, -29F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 174
		bodyModel[80].setRotationPoint(-2.5F, -19F, -29F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[81].setRotationPoint(-2.5F, -22F, -29F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[82].setRotationPoint(-2.5F, -24F, -29F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[83].setRotationPoint(-4F, -18.5F, -28F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 178
		bodyModel[84].setRotationPoint(-3F, -20.5F, -28F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[85].setRotationPoint(-4F, -21.5F, -28F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[86].setRotationPoint(-4F, -23.5F, -28F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[87].setRotationPoint(-3F, -24.5F, -28F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[88].setRotationPoint(-3F, -24.5F, -31F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[89].setRotationPoint(-4F, -23.5F, -31F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[90].setRotationPoint(-4F, -21.5F, -31F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 185
		bodyModel[91].setRotationPoint(-4F, -18.5F, -31F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 186
		bodyModel[92].setRotationPoint(-3F, -16.5F, -31F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[93].setRotationPoint(-44F, -23.5F, -25F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[94].setRotationPoint(-44F, -22F, -25.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[95].setRotationPoint(-44F, -22F, 24.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[96].setRotationPoint(-44F, -23.5F, 24F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[97].setRotationPoint(-53F, -15.5F, -17F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[98].setRotationPoint(-53F, -13.5F, -17F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 194
		bodyModel[99].setRotationPoint(-53F, -11.5F, -17F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 195
		bodyModel[100].setRotationPoint(-54F, -11.5F, -16F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 196
		bodyModel[101].setRotationPoint(-54F, -11.5F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 103, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[102].setRotationPoint(-49F, -16F, -31F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[103].setRotationPoint(54F, -16F, -31F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[104].setRotationPoint(61F, -14F, -31F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 200
		bodyModel[105].setRotationPoint(-61F, -16F, -31F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[106].setRotationPoint(-51F, -25F, -35F);
		bodyModel[106].rotateAngleX = 0.15707963F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 202
		bodyModel[107].setRotationPoint(-30F, -25F, -35F);
		bodyModel[107].rotateAngleX = 0.15707963F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 203
		bodyModel[108].setRotationPoint(-9F, -25F, -35F);
		bodyModel[108].rotateAngleX = 0.15707963F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 204
		bodyModel[109].setRotationPoint(12F, -25F, -35F);
		bodyModel[109].rotateAngleX = 0.15707963F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 64, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 205
		bodyModel[110].setRotationPoint(-31F, -25F, -34.5F);
		bodyModel[110].rotateAngleX = 0.15707963F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 103, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[111].setRotationPoint(-49F, -16F, 20F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[112].setRotationPoint(54F, -16F, 20F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[113].setRotationPoint(61F, -14F, 20F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 218
		bodyModel[114].setRotationPoint(-61F, -16F, 20F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 76, 3, 8, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, -2F, 2F, 1F, -2F); // Box 290
		bodyModel[115].setRotationPoint(-33F, 2.5F, -21F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 378
		bodyModel[116].setRotationPoint(-15F, -25.5F, -34F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[117].setRotationPoint(-15F, -25.5F, 25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[118].setRotationPoint(6F, -25.5F, 25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[119].setRotationPoint(12F, -26F, 34F);
		bodyModel[119].rotateAngleX = -0.15707963F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[120].setRotationPoint(-9F, -26F, 34F);
		bodyModel[120].rotateAngleX = -0.15707963F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[121].setRotationPoint(-30F, -26F, 34F);
		bodyModel[121].rotateAngleX = -0.15707963F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[122].setRotationPoint(-51F, -26F, 34F);
		bodyModel[122].rotateAngleX = -0.15707963F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 64, 22, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[123].setRotationPoint(-31F, -26F, 33.5F);
		bodyModel[123].rotateAngleX = -0.15707963F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 9, 50, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -5F, 2F, 0F, -5F, 0F, 0F, 0F); // Box 390
		bodyModel[124].setRotationPoint(34F, -24.5F, -25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[125].setRotationPoint(33F, -26F, 34F);
		bodyModel[125].rotateAngleX = -0.15707963F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[126].setRotationPoint(33F, -25F, -35F);
		bodyModel[126].rotateAngleX = 0.15707963F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Box 46
		bodyModel[127].setRotationPoint(41F, -22F, -12F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[128].setRotationPoint(44F, -19.5F, -10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Box 185
		bodyModel[129].setRotationPoint(42F, -23F, 3.5F);
		bodyModel[129].rotateAngleZ = -0.34906585F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Box 45
		bodyModel[130].setRotationPoint(43F, -21.5F, 4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[131].setRotationPoint(-24.5F, -24.5F, 22F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 10
		bodyModel[132].setRotationPoint(-24.5F, -24.5F, -34F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[133].setRotationPoint(-38.5F, -24.5F, 22F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 12
		bodyModel[134].setRotationPoint(-38.5F, -24.5F, -34F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[135].setRotationPoint(19.5F, -24.5F, 22F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 14
		bodyModel[136].setRotationPoint(19.5F, -24.5F, -34F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[137].setRotationPoint(34.5F, -24.5F, 22F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 16
		bodyModel[138].setRotationPoint(34.5F, -24.5F, -34F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[139].setRotationPoint(43.4F, -19.5F, -9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 28
		bodyModel[140].setRotationPoint(12F, -8F, -32F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[141].setRotationPoint(29F, -8F, -32F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 30
		bodyModel[142].setRotationPoint(-11F, -8F, -32F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[143].setRotationPoint(-35F, -8F, -32F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[144].setRotationPoint(-35F, -8F, 21F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[145].setRotationPoint(12F, -8F, 21F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[146].setRotationPoint(-11F, -8F, 21F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[147].setRotationPoint(29F, -8F, 21F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[148].setRotationPoint(-53F, -17.5F, 3F);
		bodyModel[148].rotateAngleZ = 0.2443461F;

		bodyModel[149].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 26
		bodyModel[149].setRotationPoint(62F, -12F, 11F);
		bodyModel[149].rotateAngleY = 0.13962634F;
		bodyModel[149].rotateAngleZ = -1.78782627F;

		bodyModel[150].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[150].setRotationPoint(62F, -12F, 9F);
		bodyModel[150].rotateAngleY = 0.13962634F;
		bodyModel[150].rotateAngleZ = -1.78782627F;

		bodyModel[151].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[151].setRotationPoint(62F, -12F, 9F);
		bodyModel[151].rotateAngleY = 0.13962634F;
		bodyModel[151].rotateAngleZ = -1.78782627F;

		bodyModel[152].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[152].setRotationPoint(62F, -12F, 6F);
		bodyModel[152].rotateAngleY = 0.13962634F;
		bodyModel[152].rotateAngleZ = -1.78782627F;

		bodyModel[153].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[153].setRotationPoint(62F, -12F, 6F);
		bodyModel[153].rotateAngleY = 0.13962634F;
		bodyModel[153].rotateAngleZ = -1.78782627F;

		bodyModel[154].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[154].setRotationPoint(62F, -12F, 3F);
		bodyModel[154].rotateAngleY = 0.13962634F;
		bodyModel[154].rotateAngleZ = -1.78782627F;

		bodyModel[155].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[155].setRotationPoint(62F, -12F, 3F);
		bodyModel[155].rotateAngleY = 0.13962634F;
		bodyModel[155].rotateAngleZ = -1.78782627F;

		bodyModel[156].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 33
		bodyModel[156].setRotationPoint(62F, -12F, 5F);
		bodyModel[156].rotateAngleY = 0.13962634F;
		bodyModel[156].rotateAngleZ = -1.78782627F;

		bodyModel[157].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[157].setRotationPoint(62F, -12F, 0F);
		bodyModel[157].rotateAngleY = 0.13962634F;
		bodyModel[157].rotateAngleZ = -1.78782627F;

		bodyModel[158].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 35
		bodyModel[158].setRotationPoint(62F, -12F, 2F);
		bodyModel[158].rotateAngleY = 0.13962634F;
		bodyModel[158].rotateAngleZ = -1.78782627F;

		bodyModel[159].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 36
		bodyModel[159].setRotationPoint(62F, -12F, -1F);
		bodyModel[159].rotateAngleY = 0.13962634F;
		bodyModel[159].rotateAngleZ = -1.78782627F;

		bodyModel[160].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[160].setRotationPoint(62F, -12F, -3F);
		bodyModel[160].rotateAngleY = 0.13962634F;
		bodyModel[160].rotateAngleZ = -1.78782627F;

		bodyModel[161].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[161].setRotationPoint(62F, -12F, -4F);
		bodyModel[161].rotateAngleY = 0.13962634F;
		bodyModel[161].rotateAngleZ = -1.78782627F;

		bodyModel[162].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[162].setRotationPoint(62F, -12F, -6F);
		bodyModel[162].rotateAngleY = 0.13962634F;
		bodyModel[162].rotateAngleZ = -1.78782627F;

		bodyModel[163].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[163].setRotationPoint(62F, -12F, -6F);
		bodyModel[163].rotateAngleY = 0.13962634F;
		bodyModel[163].rotateAngleZ = -1.78782627F;

		bodyModel[164].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[164].setRotationPoint(62F, -12F, -3F);
		bodyModel[164].rotateAngleY = 0.13962634F;
		bodyModel[164].rotateAngleZ = -1.78782627F;

		bodyModel[165].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[165].setRotationPoint(62F, -12F, 0F);
		bodyModel[165].rotateAngleY = 0.13962634F;
		bodyModel[165].rotateAngleZ = -1.78782627F;

		bodyModel[166].addShapeBox(9F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[166].setRotationPoint(62F, -12F, -7F);
		bodyModel[166].rotateAngleY = 0.13962634F;
		bodyModel[166].rotateAngleZ = -1.78782627F;

		bodyModel[167].addShapeBox(4F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[167].setRotationPoint(62F, -12F, -7F);
		bodyModel[167].rotateAngleY = 0.13962634F;
		bodyModel[167].rotateAngleZ = -1.78782627F;

		bodyModel[168].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 50
		bodyModel[168].setRotationPoint(62F, -12F, 8F);
		bodyModel[168].rotateAngleY = 0.13962634F;
		bodyModel[168].rotateAngleZ = -1.78782627F;

		bodyModel[169].addShapeBox(4F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[169].setRotationPoint(50F, -17.5F, -39F);
		bodyModel[169].rotateAngleZ = -0.3217497F;

		bodyModel[170].addShapeBox(9F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[170].setRotationPoint(50F, -17.5F, -39F);
		bodyModel[170].rotateAngleZ = -0.3217497F;

		bodyModel[171].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[171].setRotationPoint(50F, -17F, -38F);
		bodyModel[171].rotateAngleZ = -0.3217497F;

		bodyModel[172].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[172].setRotationPoint(50F, -17F, -38F);
		bodyModel[172].rotateAngleZ = -0.3217497F;

		bodyModel[173].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[173].setRotationPoint(50F, -17F, -36F);
		bodyModel[173].rotateAngleZ = -0.3217497F;

		bodyModel[174].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[174].setRotationPoint(50F, -17F, -35F);
		bodyModel[174].rotateAngleZ = -0.3217497F;

		bodyModel[175].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[175].setRotationPoint(50F, -17F, -35F);
		bodyModel[175].rotateAngleZ = -0.3217497F;

		bodyModel[176].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 58
		bodyModel[176].setRotationPoint(50F, -17F, -33F);
		bodyModel[176].rotateAngleZ = -0.3217497F;

		bodyModel[177].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[177].setRotationPoint(50F, -17F, -32F);
		bodyModel[177].rotateAngleZ = -0.3217497F;

		bodyModel[178].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 60
		bodyModel[178].setRotationPoint(50F, -17F, -30F);
		bodyModel[178].rotateAngleZ = -0.3217497F;

		bodyModel[179].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[179].setRotationPoint(50F, -17F, -32F);
		bodyModel[179].rotateAngleZ = -0.3217497F;

		bodyModel[180].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[180].setRotationPoint(50F, -17F, 22F);
		bodyModel[180].rotateAngleZ = -0.3217497F;

		bodyModel[181].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 63
		bodyModel[181].setRotationPoint(50F, -17F, 24F);
		bodyModel[181].rotateAngleZ = -0.3217497F;

		bodyModel[182].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[182].setRotationPoint(50F, -17F, 25F);
		bodyModel[182].rotateAngleZ = -0.3217497F;

		bodyModel[183].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 65
		bodyModel[183].setRotationPoint(50F, -17F, 27F);
		bodyModel[183].rotateAngleZ = -0.3217497F;

		bodyModel[184].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[184].setRotationPoint(50F, -17F, 28F);
		bodyModel[184].rotateAngleZ = -0.3217497F;

		bodyModel[185].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[185].setRotationPoint(50F, -17F, 30F);
		bodyModel[185].rotateAngleZ = -0.3217497F;

		bodyModel[186].addShapeBox(7F, -2.5F, -1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[186].setRotationPoint(50F, -17F, 28F);
		bodyModel[186].rotateAngleZ = -0.3217497F;

		bodyModel[187].addShapeBox(7F, -2.5F, -1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[187].setRotationPoint(50F, -17F, 25F);
		bodyModel[187].rotateAngleZ = -0.3217497F;

		bodyModel[188].addShapeBox(7F, -2.5F, -1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[188].setRotationPoint(50F, -17F, 22F);
		bodyModel[188].rotateAngleZ = -0.3217497F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Box 1
		bodyModel[189].setRotationPoint(41.3F, -22.5F, 20F);
		bodyModel[189].rotateAngleY = 1.09955743F;
		bodyModel[189].rotateAngleZ = 0.12217305F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Box 2
		bodyModel[190].setRotationPoint(35F, -22.5F, -23.5F);
		bodyModel[190].rotateAngleY = -1.09955743F;
		bodyModel[190].rotateAngleZ = 0.12217305F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[191].setRotationPoint(49F, -21F, 24F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[192].setRotationPoint(50F, -19F, 25.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 7
		bodyModel[193].setRotationPoint(50F, -17F, 25.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		bodyModel[194].setRotationPoint(49F, -20F, 24F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[195].setRotationPoint(49F, -21F, -28F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[196].setRotationPoint(50F, -19F, -26.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 11
		bodyModel[197].setRotationPoint(50F, -17F, -26.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[198].setRotationPoint(49F, -20F, -28F);

		bodyModel[199].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Box 13
		bodyModel[199].setRotationPoint(28F, -25F, 4F);

		bodyModel[200].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Box 14
		bodyModel[200].setRotationPoint(28F, -25F, -16F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 32
		bodyModel[201].setRotationPoint(28F, -25.5F, 4F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 33
		bodyModel[202].setRotationPoint(28F, -25.5F, -16F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 34
		bodyModel[203].setRotationPoint(38F, -25.5F, -11F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 35
		bodyModel[204].setRotationPoint(38F, -25.5F, 9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[205].setRotationPoint(-49F, -9.5F, 12.5F);

		bodyModel[206].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1
		bodyModel[206].setRotationPoint(61F, -12F, 9F);
		bodyModel[206].rotateAngleZ = -1.80527957F;

		bodyModel[207].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[207].setRotationPoint(61F, -12F, 7F);
		bodyModel[207].rotateAngleZ = -1.80527957F;

		bodyModel[208].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[208].setRotationPoint(61F, -12F, 7F);
		bodyModel[208].rotateAngleZ = -1.80527957F;

		bodyModel[209].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[209].setRotationPoint(61F, -12F, 4F);
		bodyModel[209].rotateAngleZ = -1.80527957F;

		bodyModel[210].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[210].setRotationPoint(61F, -12F, 4F);
		bodyModel[210].rotateAngleZ = -1.80527957F;

		bodyModel[211].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[211].setRotationPoint(61F, -12F, 1F);
		bodyModel[211].rotateAngleZ = -1.80527957F;

		bodyModel[212].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[212].setRotationPoint(61F, -12F, 1F);
		bodyModel[212].rotateAngleZ = -1.80527957F;

		bodyModel[213].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		bodyModel[213].setRotationPoint(61F, -12F, 3F);
		bodyModel[213].rotateAngleZ = -1.80527957F;

		bodyModel[214].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[214].setRotationPoint(61F, -12F, -2F);
		bodyModel[214].rotateAngleZ = -1.80527957F;

		bodyModel[215].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		bodyModel[215].setRotationPoint(61F, -12F, 0F);
		bodyModel[215].rotateAngleZ = -1.80527957F;

		bodyModel[216].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[216].setRotationPoint(61F, -12F, -3F);
		bodyModel[216].rotateAngleZ = -1.80527957F;

		bodyModel[217].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[217].setRotationPoint(61F, -12F, -5F);
		bodyModel[217].rotateAngleZ = -1.80527957F;

		bodyModel[218].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[218].setRotationPoint(61F, -12F, -6F);
		bodyModel[218].rotateAngleZ = -1.80527957F;

		bodyModel[219].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[219].setRotationPoint(61F, -12F, -8F);
		bodyModel[219].rotateAngleZ = -1.80527957F;

		bodyModel[220].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[220].setRotationPoint(61F, -12F, -8F);
		bodyModel[220].rotateAngleZ = -1.80527957F;

		bodyModel[221].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[221].setRotationPoint(61F, -12F, -5F);
		bodyModel[221].rotateAngleZ = -1.80527957F;

		bodyModel[222].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[222].setRotationPoint(61F, -12F, -2F);
		bodyModel[222].rotateAngleZ = -1.80527957F;

		bodyModel[223].addShapeBox(9F, -1F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[223].setRotationPoint(61F, -12F, -9F);
		bodyModel[223].rotateAngleZ = -1.80527957F;

		bodyModel[224].addShapeBox(4F, -1F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[224].setRotationPoint(61F, -12F, -9F);
		bodyModel[224].rotateAngleZ = -1.80527957F;

		bodyModel[225].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[225].setRotationPoint(61F, -12F, 6F);
		bodyModel[225].rotateAngleZ = -1.80527957F;

		bodyModel[226].addShapeBox(9F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[226].setRotationPoint(50F, -17.5F, 12F);
		bodyModel[226].rotateAngleZ = -0.3217497F;

		bodyModel[227].addShapeBox(4F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[227].setRotationPoint(50F, -17.5F, 12F);
		bodyModel[227].rotateAngleZ = -0.3217497F;

		bodyModel[228].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 1
		bodyModel[228].setRotationPoint(33F, -0.5F, 18F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[229].setRotationPoint(32F, 3.5F, 20F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[230].setRotationPoint(39F, 3.5F, 20F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 4
		bodyModel[231].setRotationPoint(31F, 3.5F, 20F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[232].setRotationPoint(40F, 4.5F, 20F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[233].setRotationPoint(29F, 4.5F, 20F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 24
		bodyModel[234].setRotationPoint(-30F, -0.5F, 18F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[235].setRotationPoint(-24F, 3.5F, 20F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 26
		bodyModel[236].setRotationPoint(-32F, 3.5F, 20F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[237].setRotationPoint(-31F, 3.5F, 20F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[238].setRotationPoint(-34F, 4.5F, 20F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[239].setRotationPoint(-23F, 4.5F, 20F);

		bodyModel[240].addShapeBox(-1F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 34
		bodyModel[240].setRotationPoint(-8F, -0.5F, 18F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 50
		bodyModel[241].setRotationPoint(12F, -0.5F, 18F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[242].setRotationPoint(11F, 3.5F, 20F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[243].setRotationPoint(18F, 3.5F, 20F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[244].setRotationPoint(19F, 4.5F, 20F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[245].setRotationPoint(8F, 4.5F, 20F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 55
		bodyModel[246].setRotationPoint(10F, 3.5F, 20F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[247].setRotationPoint(-2F, 4.5F, 20F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[248].setRotationPoint(-3F, 3.5F, 20F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[249].setRotationPoint(-10F, 3.5F, 20F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[250].setRotationPoint(-11F, 3.5F, 20F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[251].setRotationPoint(-13F, 4.5F, 20F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 70
		bodyModel[252].setRotationPoint(33F, -0.5F, -22F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[253].setRotationPoint(32F, 3.5F, -23F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[254].setRotationPoint(39F, 3.5F, -23F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 73
		bodyModel[255].setRotationPoint(31F, 3.5F, -23F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[256].setRotationPoint(40F, 4.5F, -27F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[257].setRotationPoint(29F, 4.5F, -27F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 76
		bodyModel[258].setRotationPoint(-30F, -0.5F, -22F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[259].setRotationPoint(-24F, 3.5F, -23F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 78
		bodyModel[260].setRotationPoint(-32F, 3.5F, -23F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[261].setRotationPoint(-34F, 4.5F, -27F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[262].setRotationPoint(-23F, 4.5F, -27F);

		bodyModel[263].addShapeBox(-1F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 81
		bodyModel[263].setRotationPoint(-8F, -0.5F, -22F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 82
		bodyModel[264].setRotationPoint(12F, -0.5F, -22F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[265].setRotationPoint(11F, 3.5F, -23F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[266].setRotationPoint(18F, 3.5F, -23F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[267].setRotationPoint(19F, 4.5F, -27F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[268].setRotationPoint(8F, 4.5F, -27F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 87
		bodyModel[269].setRotationPoint(10F, 3.5F, -23F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[270].setRotationPoint(-2F, 4.5F, -27F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[271].setRotationPoint(-3F, 3.5F, -23F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[272].setRotationPoint(-10F, 3.5F, -23F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 91
		bodyModel[273].setRotationPoint(-11F, 3.5F, -23F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[274].setRotationPoint(-13F, 4.5F, -27F);

		bodyModel[275].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 93
		bodyModel[275].setRotationPoint(-50F, -21.5F, 18.5F);
		bodyModel[275].rotateAngleX = -0.06981317F;
		bodyModel[275].rotateAngleY = -1.57079633F;

		bodyModel[276].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 94
		bodyModel[276].setRotationPoint(-50F, -21.5F, 8.5F);
		bodyModel[276].rotateAngleX = -0.06981317F;
		bodyModel[276].rotateAngleY = -1.57079633F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 76, 3, 8, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 2F, 1F, -2F, 2F, 1F, -2F, 2F, 1F, 0F, 2F, 1F, 0F); // Box 96
		bodyModel[277].setRotationPoint(-33F, 2.5F, 13F);


		turretModel = new ModelRendererTurbo[65];
		turretModel[0] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 59
		turretModel[1] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Box 188
		turretModel[2] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 66
		turretModel[3] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Box 68
		turretModel[4] = new ModelRendererTurbo(this, 369, 305, textureX, textureY); // Box 64
		turretModel[5] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Box 67
		turretModel[6] = new ModelRendererTurbo(this, 169, 321, textureX, textureY); // Box 73
		turretModel[7] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Box 60
		turretModel[8] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 74
		turretModel[9] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 162
		turretModel[10] = new ModelRendererTurbo(this, 321, 329, textureX, textureY); // Box 61
		turretModel[11] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Box 62
		turretModel[12] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Box 161
		turretModel[13] = new ModelRendererTurbo(this, 65, 361, textureX, textureY); // Box 57
		turretModel[14] = new ModelRendererTurbo(this, 137, 321, textureX, textureY); // Box 55
		turretModel[15] = new ModelRendererTurbo(this, 225, 353, textureX, textureY); // Box 56
		turretModel[16] = new ModelRendererTurbo(this, 145, 321, textureX, textureY); // Box 72
		turretModel[17] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Box 71
		turretModel[18] = new ModelRendererTurbo(this, 65, 329, textureX, textureY); // Box 75
		turretModel[19] = new ModelRendererTurbo(this, 465, 329, textureX, textureY); // Box 74
		turretModel[20] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Box 214
		turretModel[21] = new ModelRendererTurbo(this, 265, 361, textureX, textureY); // Box 218
		turretModel[22] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 215
		turretModel[23] = new ModelRendererTurbo(this, 185, 369, textureX, textureY); // Box 217
		turretModel[24] = new ModelRendererTurbo(this, 297, 369, textureX, textureY); // Box 219
		turretModel[25] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Box 76
		turretModel[26] = new ModelRendererTurbo(this, 329, 377, textureX, textureY); // Box 216
		turretModel[27] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 176
		turretModel[28] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 177
		turretModel[29] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 178
		turretModel[30] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 181
		turretModel[31] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 180
		turretModel[32] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 179
		turretModel[33] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Box 388
		turretModel[34] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Box 389
		turretModel[35] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 391
		turretModel[36] = new ModelRendererTurbo(this, 321, 329, textureX, textureY); // Box 394
		turretModel[37] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 395
		turretModel[38] = new ModelRendererTurbo(this, 121, 401, textureX, textureY); // Box 397
		turretModel[39] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 398
		turretModel[40] = new ModelRendererTurbo(this, 489, 353, textureX, textureY); // Box 0
		turretModel[41] = new ModelRendererTurbo(this, 33, 377, textureX, textureY); // Box 1
		turretModel[42] = new ModelRendererTurbo(this, 393, 417, textureX, textureY); // Box 2
		turretModel[43] = new ModelRendererTurbo(this, 441, 417, textureX, textureY); // Box 4
		turretModel[44] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 7
		turretModel[45] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 8
		turretModel[46] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Box 18
		turretModel[47] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 23
		turretModel[48] = new ModelRendererTurbo(this, 225, 337, textureX, textureY); // Box 24
		turretModel[49] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Box 25
		turretModel[50] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Box 26
		turretModel[51] = new ModelRendererTurbo(this, 65, 353, textureX, textureY); // Box 27
		turretModel[52] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 0
		turretModel[53] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 3
		turretModel[54] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 15
		turretModel[55] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 16
		turretModel[56] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 29
		turretModel[57] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 30
		turretModel[58] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 31
		turretModel[59] = new ModelRendererTurbo(this, 377, 433, textureX, textureY); // Box 36
		turretModel[60] = new ModelRendererTurbo(this, 73, 433, textureX, textureY); // Box 37
		turretModel[61] = new ModelRendererTurbo(this, 145, 409, textureX, textureY); // Box 40
		turretModel[62] = new ModelRendererTurbo(this, 417, 433, textureX, textureY); // Box 41
		turretModel[63] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 0
		turretModel[64] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 1

		turretModel[0].addShapeBox(12F, -13F, -11F, 10, 5, 4, 0F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, -6F); // Box 59
		turretModel[0].setRotationPoint(2F, -17F, -4F);

		turretModel[1].addShapeBox(22F, -13.5F, -8F, 2, 3, 16, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 188
		turretModel[1].setRotationPoint(2F, -17F, 0F);

		turretModel[2].addShapeBox(22F, -16.5F, -8F, 2, 3, 16, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 66
		turretModel[2].setRotationPoint(2F, -18F, 0F);

		turretModel[3].addShapeBox(12F, -13F, -11F, 10, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 68
		turretModel[3].setRotationPoint(2F, -17F, 0F);

		turretModel[4].addShapeBox(12F, -13F, 11F, 10, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, -6F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 2F); // Box 64
		turretModel[4].setRotationPoint(2F, -17F, 0F);

		turretModel[5].addShapeBox(12F, -19F, -15F, 10, 6, 30, 0F, 0F, 0F, 1.5F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F); // Box 67
		turretModel[5].setRotationPoint(2F, -17F, 0F);

		turretModel[6].addShapeBox(3F, -19F, -17F, 9, 10, 34, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 1F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 4F); // Box 73
		turretModel[6].setRotationPoint(2F, -17F, 0F);

		turretModel[7].addShapeBox(12F, -20F, -14F, 8, 1, 28, 0F, 0F, 0F, 0F, -2F, -1F, -4F, -2F, -1F, -4F, 0F, 0F, 0F, 0F, 1F, 2.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 2.5F); // Box 60
		turretModel[7].setRotationPoint(2F, -18F, 0F);

		turretModel[8].addShapeBox(3F, -20F, -17F, 9, 1, 34, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, -0.51F, 0F, 1F, -0.51F, 0F, 1F, 2F); // Box 74
		turretModel[8].setRotationPoint(2F, -18F, 0F);

		turretModel[9].addShapeBox(-11F, -18F, -16.5F, 12, 7, 35, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 1F, 2.5F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, 2.5F); // Box 162
		turretModel[9].setRotationPoint(0F, -17F, -1F);

		turretModel[10].addShapeBox(-14F, -19F, -17F, 17, 10, 34, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 1F, 3F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F, 3F); // Box 61
		turretModel[10].setRotationPoint(2F, -17F, 0F);

		turretModel[11].addShapeBox(-14F, -20F, -16F, 17, 1, 32, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, 2F); // Box 62
		turretModel[11].setRotationPoint(2F, -18F, 0F);

		turretModel[12].addShapeBox(-17F, -18F, -17F, 8, 11, 2, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 161
		turretModel[12].setRotationPoint(-3F, -18F, -2F);

		turretModel[13].addShapeBox(-22F, -20F, -18F, 8, 2, 36, 0F, -4F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 57
		turretModel[13].setRotationPoint(2F, -18F, 0F);

		turretModel[14].addShapeBox(-22F, -18F, 17F, 8, 11, 2, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 55
		turretModel[14].setRotationPoint(2F, -18F, 0F);

		turretModel[15].addShapeBox(-24F, -18F, -16F, 2, 11, 32, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 56
		turretModel[15].setRotationPoint(2F, -18F, 0F);

		turretModel[16].addShapeBox(-27F, -20F, -10F, 8, 8, 18, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 72
		turretModel[16].setRotationPoint(0F, -15F, 1F);

		turretModel[17].addShapeBox(-27F, -20F, -11F, 11, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 71
		turretModel[17].setRotationPoint(0F, -18F, 1F);

		turretModel[18].addShapeBox(-22F, -37F, -7.5F, 4, 2, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 75
		turretModel[18].setRotationPoint(2F, -2F, 0F);

		turretModel[19].addBox(-18F, -36F, -7.5F, 8, 1, 15, 0F); // Box 74
		turretModel[19].setRotationPoint(2F, -3F, 0F);

		turretModel[20].addShapeBox(-21.5F, -37F, -7F, 4, 2, 14, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 214
		turretModel[20].setRotationPoint(2F, -4F, 0F);

		turretModel[21].addBox(-18F, -39F, -7.5F, 8, 1, 15, 0F); // Box 218
		turretModel[21].setRotationPoint(2F, -3F, 0F);

		turretModel[22].addBox(-17.5F, -37F, -7F, 7, 2, 14, 0F); // Box 215
		turretModel[22].setRotationPoint(2F, -4F, 0F);

		turretModel[23].addShapeBox(-22F, -39F, -7.5F, 4, 1, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 217
		turretModel[23].setRotationPoint(2F, -3F, 0F);

		turretModel[24].addShapeBox(-10F, -39F, -7.5F, 4, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 219
		turretModel[24].setRotationPoint(2F, -3F, 0F);

		turretModel[25].addShapeBox(-10F, -37F, -7.5F, 4, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 76
		turretModel[25].setRotationPoint(2F, -2F, 0F);

		turretModel[26].addShapeBox(-10.5F, -37F, -7F, 4, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 216
		turretModel[26].setRotationPoint(2F, -4F, 0F);

		turretModel[27].addBox(22F, -8F, 9F, 4, 1, 1, 0F); // Box 176
		turretModel[27].setRotationPoint(1F, -18F, 0F);
		turretModel[27].rotateAngleY = 0.4712389F;
		turretModel[27].rotateAngleZ = 0.43633231F;

		turretModel[28].addBox(22F, -8F, 9F, 4, 1, 1, 0F); // Box 177
		turretModel[28].setRotationPoint(2F, -18F, 0F);
		turretModel[28].rotateAngleY = 0.38397244F;
		turretModel[28].rotateAngleZ = 0.40142573F;

		turretModel[29].addBox(23F, -8F, 9F, 4, 1, 1, 0F); // Box 178
		turretModel[29].setRotationPoint(2F, -18F, 0F);
		turretModel[29].rotateAngleY = 0.29670597F;
		turretModel[29].rotateAngleZ = 0.36651914F;

		turretModel[30].addBox(23.5F, -10F, -5F, 4, 1, 1, 0F); // Box 181
		turretModel[30].setRotationPoint(2F, -17.5F, -1F);
		turretModel[30].rotateAngleY = -0.62831853F;
		turretModel[30].rotateAngleZ = 0.36651914F;

		turretModel[31].addBox(24.5F, -8.5F, -5F, 4, 1, 1, 0F); // Box 180
		turretModel[31].setRotationPoint(2F, -17.5F, -1F);
		turretModel[31].rotateAngleY = -0.54105207F;
		turretModel[31].rotateAngleZ = 0.40142573F;

		turretModel[32].addBox(25.5F, -7F, -5F, 4, 1, 1, 0F); // Box 179
		turretModel[32].setRotationPoint(2F, -17.5F, -1F);
		turretModel[32].rotateAngleY = -0.45378561F;
		turretModel[32].rotateAngleZ = 0.43633231F;

		turretModel[33].addShapeBox(-16F, -20F, -26F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		turretModel[33].setRotationPoint(0F, -18F, 0F);

		turretModel[34].addShapeBox(-16F, -20F, 25F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		turretModel[34].setRotationPoint(0F, -18F, 0F);

		turretModel[35].addShapeBox(-29F, -20F, 25F, 13, 11, 1, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 391
		turretModel[35].setRotationPoint(0F, -18F, 0F);

		turretModel[36].addShapeBox(-41F, -20F, 15F, 12, 11, 1, 0F, -9F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F, -9F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F); // Box 394
		turretModel[36].setRotationPoint(0F, -18F, 0F);

		turretModel[37].addShapeBox(-29F, -20F, -26F, 13, 11, 1, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F); // Box 395
		turretModel[37].setRotationPoint(0F, -18F, 0F);

		turretModel[38].addShapeBox(-33F, -20F, -5F, 1, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		turretModel[38].setRotationPoint(0F, -18F, 0F);

		turretModel[39].addShapeBox(-41F, -20F, -16F, 12, 11, 1, 0F, -8F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 10F, -8F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 10F); // Box 398
		turretModel[39].setRotationPoint(0F, -18F, 0F);

		turretModel[40].addShapeBox(-6F, -20F, 25F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[40].setRotationPoint(0F, -18F, 0F);

		turretModel[41].addShapeBox(-6F, -20F, -26F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[41].setRotationPoint(0F, -18F, 0F);

		turretModel[42].addShapeBox(4F, -20F, 25F, 20, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 2
		turretModel[42].setRotationPoint(0F, -18F, 0F);

		turretModel[43].addShapeBox(4F, -20F, -20F, 20, 11, 1, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 4
		turretModel[43].setRotationPoint(0F, -18F, 0F);

		turretModel[44].addShapeBox(24F, -20F, -14F, 5, 11, 1, 0F, 0F, 0F, 6F, 0.5F, -7F, 0F, 0F, -7F, -1F, 0F, 0F, -6F, 0F, 0F, 6F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F); // Box 7
		turretModel[44].setRotationPoint(0F, -18F, 0F);

		turretModel[45].addShapeBox(24F, -20F, 13F, 5, 11, 1, 0F, 0F, 0F, -6F, 0F, -7F, -1F, 0.5F, -7F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 6F); // Box 8
		turretModel[45].setRotationPoint(0F, -18F, 0F);

		turretModel[46].addShapeBox(-0.5F, -19F, -25F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 18
		turretModel[46].setRotationPoint(2F, -18F, 0F);

		turretModel[47].addShapeBox(-10.5F, -19F, -28.5F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 23
		turretModel[47].setRotationPoint(2F, -18F, 0F);
		turretModel[47].rotateAngleY = -0.34906585F;

		turretModel[48].addShapeBox(5.5F, -19F, -25F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 24
		turretModel[48].setRotationPoint(2F, -18F, 0F);
		turretModel[48].rotateAngleY = 0.27925268F;

		turretModel[49].addShapeBox(-10.5F, -19F, 17.5F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[49].setRotationPoint(2F, -18F, 0F);
		turretModel[49].rotateAngleY = 0.34906585F;

		turretModel[50].addShapeBox(-0.5F, -19F, 15F, 1, 1, 10, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[50].setRotationPoint(2F, -18F, 0F);

		turretModel[51].addShapeBox(5.5F, -19F, 16F, 1, 1, 9, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		turretModel[51].setRotationPoint(2F, -18F, 0F);
		turretModel[51].rotateAngleY = -0.27925268F;

		turretModel[52].addShapeBox(20F, -16F, 10F, 3, 3, 2, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 0
		turretModel[52].setRotationPoint(2F, -18F, 0F);

		turretModel[53].addShapeBox(20F, -16F, -11F, 3, 3, 1, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 3
		turretModel[53].setRotationPoint(2F, -18F, 0F);

		turretModel[54].addShapeBox(3.5F, -20F, 25.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[54].setRotationPoint(0F, -18F, 0F);

		turretModel[55].addShapeBox(3.5F, -20F, -26.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		turretModel[55].setRotationPoint(0F, -18F, 0F);

		turretModel[56].addBox(11F, -35.5F, -5.5F, 3, 2, 5, 0F); // Box 29
		turretModel[56].setRotationPoint(2F, -3F, 0F);

		turretModel[57].addShapeBox(10F, -35.5F, -5.5F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 30
		turretModel[57].setRotationPoint(2F, -3F, 0F);

		turretModel[58].addShapeBox(14F, -35.5F, -5.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 31
		turretModel[58].setRotationPoint(2F, -3F, 0F);

		turretModel[59].addShapeBox(-30F, -20F, -9F, 3, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 36
		turretModel[59].setRotationPoint(0F, -18F, 1F);

		turretModel[60].addShapeBox(-32F, -20F, -7F, 2, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 37
		turretModel[60].setRotationPoint(0F, -18F, 1F);

		turretModel[61].addShapeBox(-32F, -17F, -6F, 2, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 40
		turretModel[61].setRotationPoint(0F, -18F, 1F);

		turretModel[62].addShapeBox(-30F, -17F, -8F, 3, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 41
		turretModel[62].setRotationPoint(0F, -18F, 1F);

		turretModel[63].addShapeBox(-16.5F, -20F, 25.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[63].setRotationPoint(0F, -18F, 0F);

		turretModel[64].addShapeBox(-16.5F, -20F, -26.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[64].setRotationPoint(0F, -18F, 0F);


		barrelModel = new ModelRendererTurbo[19];
		barrelModel[0] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 77
		barrelModel[1] = new ModelRendererTurbo(this, 473, 313, textureX, textureY); // Box 64
		barrelModel[2] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 203
		barrelModel[3] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 67
		barrelModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 204
		barrelModel[5] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 63
		barrelModel[6] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 68
		barrelModel[7] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 246
		barrelModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 248
		barrelModel[9] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 247
		barrelModel[10] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 245
		barrelModel[11] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 249
		barrelModel[12] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 250
		barrelModel[13] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 237
		barrelModel[14] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 238
		barrelModel[15] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 239
		barrelModel[16] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 242
		barrelModel[17] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 244
		barrelModel[18] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 243

		barrelModel[0].addShapeBox(-4F, -6F, -7F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		barrelModel[0].setRotationPoint(28F, -25F, 0F);

		barrelModel[1].addShapeBox(-3F, -3F, -4F, 9, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		barrelModel[1].setRotationPoint(25F, -31F, 0F);

		barrelModel[2].addShapeBox(6F, -3F, -4F, 1, 5, 10, 0F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 203
		barrelModel[2].setRotationPoint(25F, -31F, 0F);

		barrelModel[3].addShapeBox(6F, -2F, -0.5F, 6, 3, 3, 0F, 0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F); // Box 67
		barrelModel[3].setRotationPoint(25F, -31F, 0F);

		barrelModel[4].addShapeBox(12F, -2F, 0F, 1, 3, 3, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 204
		barrelModel[4].setRotationPoint(25F, -31F, -0.5F);

		barrelModel[5].addShapeBox(-2F, -2F, -0.5F, 49, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		barrelModel[5].setRotationPoint(25F, -31F, 0F);

		barrelModel[6].addShapeBox(47F, -2F, -0.5F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F); // Box 68
		barrelModel[6].setRotationPoint(25F, -31F, 0F);

		barrelModel[7].addShapeBox(55F, 1F, -1.5F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 246
		barrelModel[7].setRotationPoint(25F, -31F, 0F);

		barrelModel[8].addShapeBox(55F, -2F, -1.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		barrelModel[8].setRotationPoint(25F, -31F, 0F);

		barrelModel[9].addShapeBox(55F, -2F, 2.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		barrelModel[9].setRotationPoint(25F, -31F, 0F);

		barrelModel[10].addShapeBox(55F, -3F, -1.5F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		barrelModel[10].setRotationPoint(25F, -31F, 0F);

		barrelModel[11].addShapeBox(53F, -3F, -0.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		barrelModel[11].setRotationPoint(25F, -31F, 0F);

		barrelModel[12].addShapeBox(53F, 1F, -0.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		barrelModel[12].setRotationPoint(25F, -31F, 0F);

		barrelModel[13].addShapeBox(49F, -2.5F, 0F, 3, 1, 2, 0F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.3F, 0.8F, 0F, -0.7F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.7F, 0.8F); // Box 237
		barrelModel[13].setRotationPoint(25F, -31F, 0F);

		barrelModel[14].addShapeBox(49F, 0.5F, 0F, 3, 1, 2, 0F, 0F, -0.7F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.7F, 1F, 0F, -0.3F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.3F, 1F); // Box 238
		barrelModel[14].setRotationPoint(25F, -31F, 0F);

		barrelModel[15].addShapeBox(52F, -3F, -1.5F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		barrelModel[15].setRotationPoint(25F, -31F, 0F);

		barrelModel[16].addShapeBox(52F, -2F, 2.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		barrelModel[16].setRotationPoint(25F, -31F, 0F);

		barrelModel[17].addShapeBox(52F, 1F, -1.5F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 244
		barrelModel[17].setRotationPoint(25F, -31F, 0F);

		barrelModel[18].addShapeBox(52F, -2F, -1.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		barrelModel[18].setRotationPoint(25F, -31F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[10];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Shape 6
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Shape 19
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 0
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 7
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 30
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 31
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 33
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 48
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 49
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 56

		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 7, 13, 13, 48, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 6
		leftTrackWheelModels[0].setRotationPoint(54.5F, -4.5F, 28F);

		leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 5, 13, 13, 48, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 19
		leftTrackWheelModels[1].setRotationPoint(-48F, -3.5F, 27F);

		leftTrackWheelModels[2].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 0
		leftTrackWheelModels[2].setRotationPoint(41F, 5.5F, 24.5F);

		leftTrackWheelModels[3].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 7
		leftTrackWheelModels[3].setRotationPoint(30F, 5.5F, 24.5F);

		leftTrackWheelModels[4].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 30
		leftTrackWheelModels[4].setRotationPoint(-22F, 5.5F, 24.5F);

		leftTrackWheelModels[5].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 31
		leftTrackWheelModels[5].setRotationPoint(-33F, 5.5F, 24.5F);

		leftTrackWheelModels[6].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 33
		leftTrackWheelModels[6].setRotationPoint(-11F, 5.5F, 24.5F);

		leftTrackWheelModels[7].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 48
		leftTrackWheelModels[7].setRotationPoint(20F, 5.5F, 24.5F);

		leftTrackWheelModels[8].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 49
		leftTrackWheelModels[8].setRotationPoint(9F, 5.5F, 24.5F);

		leftTrackWheelModels[9].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 56
		leftTrackWheelModels[9].setRotationPoint(-1F, 5.5F, 24.5F);


		rightTrackWheelModels = new ModelRendererTurbo[10];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Shape 17
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Shape 18
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 62
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 63
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 64
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 65
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 66
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 67
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 68
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 69

		rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 7, 13, 13, 48, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 17
		rightTrackWheelModels[0].setRotationPoint(54.5F, -4.5F, -22F);

		rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 5, 13, 13, 48, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 18
		rightTrackWheelModels[1].setRotationPoint(-47.5F, -3.5F, -23F);

		rightTrackWheelModels[2].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 62
		rightTrackWheelModels[2].setRotationPoint(41F, 5.5F, -27.5F);

		rightTrackWheelModels[3].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 63
		rightTrackWheelModels[3].setRotationPoint(30F, 5.5F, -27.5F);

		rightTrackWheelModels[4].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 64
		rightTrackWheelModels[4].setRotationPoint(20F, 5.5F, -27.5F);

		rightTrackWheelModels[5].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 65
		rightTrackWheelModels[5].setRotationPoint(9F, 5.5F, -27.5F);

		rightTrackWheelModels[6].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 66
		rightTrackWheelModels[6].setRotationPoint(-1F, 5.5F, -27.5F);

		rightTrackWheelModels[7].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 67
		rightTrackWheelModels[7].setRotationPoint(-11F, 5.5F, -27.5F);

		rightTrackWheelModels[8].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 68
		rightTrackWheelModels[8].setRotationPoint(-22F, 5.5F, -27.5F);

		rightTrackWheelModels[9].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 69
		rightTrackWheelModels[9].setRotationPoint(-33F, 5.5F, -27.5F);


		leftTrackModel = new ModelRendererTurbo[9];
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 281
		leftTrackModel[1] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 282
		leftTrackModel[2] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 283
		leftTrackModel[3] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 284
		leftTrackModel[4] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 285
		leftTrackModel[5] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 286
		leftTrackModel[6] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 287
		leftTrackModel[7] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 288
		leftTrackModel[8] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 289

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 110, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		leftTrackModel[0].setRotationPoint(-51F, -12.1F, -30F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		leftTrackModel[1].setRotationPoint(59F, -12F, -30F);
		leftTrackModel[1].rotateAngleZ = -1.04719755F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		leftTrackModel[2].setRotationPoint(63F, -5F, -30F);
		leftTrackModel[2].rotateAngleZ = -1.95476876F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		leftTrackModel[3].setRotationPoint(60F, 2.4F, -30F);
		leftTrackModel[3].rotateAngleZ = -2.67035376F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 77, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		leftTrackModel[4].setRotationPoint(43F, 11F, -30F);
		leftTrackModel[4].rotateAngleZ = -3.14159265F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		leftTrackModel[5].setRotationPoint(-34F, 11F, -30F);
		leftTrackModel[5].rotateAngleZ = -3.43829863F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		leftTrackModel[6].setRotationPoint(-51.2F, 5.7F, -30F);
		leftTrackModel[6].rotateAngleZ = -4.01425728F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		leftTrackModel[7].setRotationPoint(-55.7F, 0.3F, -30F);
		leftTrackModel[7].rotateAngleZ = -4.72984227F;

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		leftTrackModel[8].setRotationPoint(-55.7F, -6.7F, -30F);
		leftTrackModel[8].rotateAngleZ = -5.44542727F;


		rightTrackModel = new ModelRendererTurbo[9];
		rightTrackModel[0] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Box 291
		rightTrackModel[1] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 292
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 293
		rightTrackModel[3] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 294
		rightTrackModel[4] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Box 295
		rightTrackModel[5] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 296
		rightTrackModel[6] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 297
		rightTrackModel[7] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Box 298
		rightTrackModel[8] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 299

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackModel[0].setRotationPoint(59F, -12F, 21F);
		rightTrackModel[0].rotateAngleZ = -1.04719755F;

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 110, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackModel[1].setRotationPoint(-51F, -12.1F, 21F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightTrackModel[2].setRotationPoint(63F, -5F, 21F);
		rightTrackModel[2].rotateAngleZ = -1.95476876F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackModel[3].setRotationPoint(60F, 2.4F, 21F);
		rightTrackModel[3].rotateAngleZ = -2.67035376F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 77, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		rightTrackModel[4].setRotationPoint(43F, 11F, 21F);
		rightTrackModel[4].rotateAngleZ = -3.14159265F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightTrackModel[5].setRotationPoint(-34F, 11F, 21F);
		rightTrackModel[5].rotateAngleZ = -3.43829863F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightTrackModel[6].setRotationPoint(-55.7F, 0.3F, 21F);
		rightTrackModel[6].rotateAngleZ = -4.72984227F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		rightTrackModel[7].setRotationPoint(-51.2F, 5.7F, 21F);
		rightTrackModel[7].rotateAngleZ = -4.01425728F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightTrackModel[8].setRotationPoint(-55.7F, -6.7F, 21F);
		rightTrackModel[8].rotateAngleZ = -5.44542727F;


		steeringWheelModel = new ModelRendererTurbo[5];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 169, 369, textureX, textureY); // Box 17
		steeringWheelModel[1] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Box 18
		steeringWheelModel[2] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 19
		steeringWheelModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 21
		steeringWheelModel[4] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 0

		steeringWheelModel[0].addShapeBox(-6F, 4.5F, -3F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 17
		steeringWheelModel[0].setRotationPoint(-46F, -10F, 13F);

		steeringWheelModel[1].addShapeBox(-6F, 3.5F, -3F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 18
		steeringWheelModel[1].setRotationPoint(-46F, -10F, 13F);

		steeringWheelModel[2].addShapeBox(-4F, -0.5F, -3F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		steeringWheelModel[2].setRotationPoint(-46F, -10F, 13F);

		steeringWheelModel[3].addShapeBox(-1F, -0.5F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		steeringWheelModel[3].setRotationPoint(-46F, -10F, 13F);

		steeringWheelModel[4].addShapeBox(-4F, -0.5F, 2F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		steeringWheelModel[4].setRotationPoint(-46F, -10F, 13F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
