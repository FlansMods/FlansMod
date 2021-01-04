//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelUC2Pdr extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelUC2Pdr() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[358];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 53
		bodyModel[35] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 54
		bodyModel[36] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 1
		bodyModel[38] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 3
		bodyModel[40] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 5
		bodyModel[42] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 9
		bodyModel[43] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 10
		bodyModel[44] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 11
		bodyModel[45] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 12
		bodyModel[46] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 13
		bodyModel[47] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 14
		bodyModel[48] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 15
		bodyModel[49] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 16
		bodyModel[50] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 19
		bodyModel[51] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 20
		bodyModel[52] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 22
		bodyModel[53] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 23
		bodyModel[54] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 25
		bodyModel[55] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 26
		bodyModel[56] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 10
		bodyModel[57] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 15
		bodyModel[58] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 16
		bodyModel[59] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 17
		bodyModel[60] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 18
		bodyModel[61] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
		bodyModel[62] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 20
		bodyModel[63] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 21
		bodyModel[64] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 22
		bodyModel[65] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 23
		bodyModel[66] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 24
		bodyModel[67] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 25
		bodyModel[68] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 26
		bodyModel[69] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 27
		bodyModel[70] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 28
		bodyModel[71] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 29
		bodyModel[72] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 30
		bodyModel[73] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 31
		bodyModel[74] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 32
		bodyModel[75] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 33
		bodyModel[76] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 34
		bodyModel[77] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 35
		bodyModel[78] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 36
		bodyModel[79] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 37
		bodyModel[80] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 38
		bodyModel[81] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 39
		bodyModel[82] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 40
		bodyModel[83] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 41
		bodyModel[84] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 42
		bodyModel[85] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 43
		bodyModel[86] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 44
		bodyModel[87] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 45
		bodyModel[88] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 46
		bodyModel[89] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 47
		bodyModel[90] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 50
		bodyModel[91] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 51
		bodyModel[92] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 54
		bodyModel[93] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 62
		bodyModel[94] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 65
		bodyModel[95] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 66
		bodyModel[96] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 67
		bodyModel[97] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 68
		bodyModel[98] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 69
		bodyModel[99] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 70
		bodyModel[100] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 71
		bodyModel[101] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 72
		bodyModel[102] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 73
		bodyModel[103] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 74
		bodyModel[104] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 75
		bodyModel[105] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 76
		bodyModel[106] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 77
		bodyModel[107] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 78
		bodyModel[108] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 79
		bodyModel[109] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 80
		bodyModel[110] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 81
		bodyModel[111] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 82
		bodyModel[112] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 83
		bodyModel[113] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 84
		bodyModel[114] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 85
		bodyModel[115] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 86
		bodyModel[116] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 87
		bodyModel[117] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 88
		bodyModel[118] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 89
		bodyModel[119] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 90
		bodyModel[120] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 91
		bodyModel[121] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 92
		bodyModel[122] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 93
		bodyModel[123] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 94
		bodyModel[124] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 95
		bodyModel[125] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 96
		bodyModel[126] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 97
		bodyModel[127] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 98
		bodyModel[128] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 99
		bodyModel[129] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 100
		bodyModel[130] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 102
		bodyModel[131] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 104
		bodyModel[132] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 106
		bodyModel[133] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 108
		bodyModel[134] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 110
		bodyModel[135] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 111
		bodyModel[136] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 112
		bodyModel[137] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 113
		bodyModel[138] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 114
		bodyModel[139] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 115
		bodyModel[140] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 116
		bodyModel[141] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 117
		bodyModel[142] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 120
		bodyModel[143] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 168
		bodyModel[144] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 170
		bodyModel[145] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 171
		bodyModel[146] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 173
		bodyModel[147] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 174
		bodyModel[148] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 175
		bodyModel[149] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 177
		bodyModel[150] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 178
		bodyModel[151] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 179
		bodyModel[152] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 180
		bodyModel[153] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 193
		bodyModel[154] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 194
		bodyModel[155] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 195
		bodyModel[156] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 196
		bodyModel[157] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 197
		bodyModel[158] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 198
		bodyModel[159] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 199
		bodyModel[160] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 200
		bodyModel[161] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 201
		bodyModel[162] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 202
		bodyModel[163] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 203
		bodyModel[164] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 204
		bodyModel[165] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 205
		bodyModel[166] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 206
		bodyModel[167] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 207
		bodyModel[168] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 208
		bodyModel[169] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 209
		bodyModel[170] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 210
		bodyModel[171] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 211
		bodyModel[172] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 212
		bodyModel[173] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 213
		bodyModel[174] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 214
		bodyModel[175] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 215
		bodyModel[176] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 186
		bodyModel[177] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 187
		bodyModel[178] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 188
		bodyModel[179] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 196
		bodyModel[180] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 197
		bodyModel[181] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 203
		bodyModel[182] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 204
		bodyModel[183] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 205
		bodyModel[184] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 206
		bodyModel[185] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 209
		bodyModel[186] = new ModelRendererTurbo(this, 363, 121, textureX, textureY); // Box 210
		bodyModel[187] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 211
		bodyModel[188] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 212
		bodyModel[189] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 50
		bodyModel[190] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 51
		bodyModel[191] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 52
		bodyModel[192] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 53
		bodyModel[193] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 0
		bodyModel[194] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 3
		bodyModel[195] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 4
		bodyModel[196] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 5
		bodyModel[197] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 6
		bodyModel[198] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 7
		bodyModel[199] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 8
		bodyModel[200] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 9
		bodyModel[201] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 16
		bodyModel[202] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 17
		bodyModel[203] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 18
		bodyModel[204] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 19
		bodyModel[205] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 20
		bodyModel[206] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 21
		bodyModel[207] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 22
		bodyModel[208] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 23
		bodyModel[209] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 24
		bodyModel[210] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 25
		bodyModel[211] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 26
		bodyModel[212] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 27
		bodyModel[213] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 28
		bodyModel[214] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 29
		bodyModel[215] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 30
		bodyModel[216] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 47
		bodyModel[217] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 50
		bodyModel[218] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 51
		bodyModel[219] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 52
		bodyModel[220] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 53
		bodyModel[221] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 54
		bodyModel[222] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 55
		bodyModel[223] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 56
		bodyModel[224] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 57
		bodyModel[225] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 58
		bodyModel[226] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 59
		bodyModel[227] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 60
		bodyModel[228] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 61
		bodyModel[229] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 62
		bodyModel[230] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 63
		bodyModel[231] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 64
		bodyModel[232] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 65
		bodyModel[233] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 66
		bodyModel[234] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 68
		bodyModel[235] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 70
		bodyModel[236] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 72
		bodyModel[237] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 74
		bodyModel[238] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 75
		bodyModel[239] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 76
		bodyModel[240] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 77
		bodyModel[241] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 78
		bodyModel[242] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 79
		bodyModel[243] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 80
		bodyModel[244] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 81
		bodyModel[245] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 82
		bodyModel[246] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 84
		bodyModel[247] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 86
		bodyModel[248] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 88
		bodyModel[249] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 90
		bodyModel[250] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 91
		bodyModel[251] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 92
		bodyModel[252] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 93
		bodyModel[253] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 94
		bodyModel[254] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 95
		bodyModel[255] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 96
		bodyModel[256] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 97
		bodyModel[257] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 104
		bodyModel[258] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 106
		bodyModel[259] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 107
		bodyModel[260] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 0
		bodyModel[261] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 1
		bodyModel[262] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 2
		bodyModel[263] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 3
		bodyModel[264] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 4
		bodyModel[265] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 5
		bodyModel[266] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 6
		bodyModel[267] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 7
		bodyModel[268] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 8
		bodyModel[269] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 9
		bodyModel[270] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 10
		bodyModel[271] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 11
		bodyModel[272] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 12
		bodyModel[273] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 13
		bodyModel[274] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 14
		bodyModel[275] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 15
		bodyModel[276] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 16
		bodyModel[277] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 17
		bodyModel[278] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 18
		bodyModel[279] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 66
		bodyModel[280] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 67
		bodyModel[281] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 68
		bodyModel[282] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 69
		bodyModel[283] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 70
		bodyModel[284] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 427
		bodyModel[285] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 428
		bodyModel[286] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 429
		bodyModel[287] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 430
		bodyModel[288] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 431
		bodyModel[289] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 432
		bodyModel[290] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 433
		bodyModel[291] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 434
		bodyModel[292] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 435
		bodyModel[293] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 436
		bodyModel[294] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 437
		bodyModel[295] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 438
		bodyModel[296] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 439
		bodyModel[297] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 440
		bodyModel[298] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 441
		bodyModel[299] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 442
		bodyModel[300] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 443
		bodyModel[301] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 444
		bodyModel[302] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 445
		bodyModel[303] = new ModelRendererTurbo(this, 135, 195, textureX, textureY); // Box 446
		bodyModel[304] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 447
		bodyModel[305] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 448
		bodyModel[306] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 449
		bodyModel[307] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 450
		bodyModel[308] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 451
		bodyModel[309] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 452
		bodyModel[310] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 453
		bodyModel[311] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 454
		bodyModel[312] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 455
		bodyModel[313] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 456
		bodyModel[314] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 457
		bodyModel[315] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 458
		bodyModel[316] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 459
		bodyModel[317] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 460
		bodyModel[318] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 461
		bodyModel[319] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 462
		bodyModel[320] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 463
		bodyModel[321] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 464
		bodyModel[322] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 465
		bodyModel[323] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 466
		bodyModel[324] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 467
		bodyModel[325] = new ModelRendererTurbo(this, 175, 194, textureX, textureY); // Box 468
		bodyModel[326] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 469
		bodyModel[327] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 470
		bodyModel[328] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 471
		bodyModel[329] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 472
		bodyModel[330] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 0
		bodyModel[331] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 3
		bodyModel[332] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 4
		bodyModel[333] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 5
		bodyModel[334] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 38
		bodyModel[335] = new ModelRendererTurbo(this, 69, 214, textureX, textureY); // Box 0
		bodyModel[336] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 0
		bodyModel[337] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 1
		bodyModel[338] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 2
		bodyModel[339] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 3
		bodyModel[340] = new ModelRendererTurbo(this, 147, 232, textureX, textureY); // Box 306
		bodyModel[341] = new ModelRendererTurbo(this, 147, 224, textureX, textureY); // Box 307
		bodyModel[342] = new ModelRendererTurbo(this, 162, 222, textureX, textureY); // Box 308
		bodyModel[343] = new ModelRendererTurbo(this, 165, 231, textureX, textureY); // Box 309
		bodyModel[344] = new ModelRendererTurbo(this, 176, 224, textureX, textureY); // Box 310
		bodyModel[345] = new ModelRendererTurbo(this, 166, 240, textureX, textureY); // Box 311
		bodyModel[346] = new ModelRendererTurbo(this, 172, 240, textureX, textureY); // Box 312
		bodyModel[347] = new ModelRendererTurbo(this, 185, 234, textureX, textureY); // Box 313
		bodyModel[348] = new ModelRendererTurbo(this, 185, 239, textureX, textureY); // Box 314
		bodyModel[349] = new ModelRendererTurbo(this, 185, 244, textureX, textureY); // Box 315
		bodyModel[350] = new ModelRendererTurbo(this, 185, 244, textureX, textureY); // Box 316
		bodyModel[351] = new ModelRendererTurbo(this, 185, 251, textureX, textureY); // Box 317
		bodyModel[352] = new ModelRendererTurbo(this, 186, 255, textureX, textureY); // Box 318
		bodyModel[353] = new ModelRendererTurbo(this, 186, 259, textureX, textureY); // Box 319
		bodyModel[354] = new ModelRendererTurbo(this, 185, 230, textureX, textureY); // Box 320
		bodyModel[355] = new ModelRendererTurbo(this, 378, 206, textureX, textureY); // Box 16
		bodyModel[356] = new ModelRendererTurbo(this, 378, 206, textureX, textureY); // Box 17
		bodyModel[357] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 2

		bodyModel[0].addShapeBox(0F, 0F, 0F, 74, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -3F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 28, 0F, 3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(33F, -6F, -14F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 28, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(28F, -7F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 62, 1, 7, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-29F, -6F, -20F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 11, 9, 0F, 3F, 3F, 0F, -3F, 3F, 0F, -8F, -1F, 0F, 8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(27F, -18F, 11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F, 5F, -1F, 0F, -5F, -1F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(27F, -18F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(25F, -21F, 2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(26F, -13F, 2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, -1F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 4.3F, 0F, 0F, -1F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 4.3F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(26F, -7F, 12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(27F, -7F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 10, 17, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(25F, -17F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(25F, -7F, -20F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 66, 2, 1, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(-38F, -5F, -14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 74, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-38F, -3F, 13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 62, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.1F, 0F, -0.8F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-29F, -6F, 13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 5, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(33F, -3F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 13, 5, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-38F, -3F, -13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 56, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(-24F, 1F, -13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(10F, -17F, 19F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 39, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-29F, -21F, 19F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(10F, -17F, -20F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 39, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-29F, -21F, -20F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 66, 2, 1, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-38F, -5F, 13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(30F, -7F, 11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(34F, -6F, 11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(32F, -7F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 33
		bodyModel[26].setRotationPoint(19F, -7F, 19F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 35
		bodyModel[27].setRotationPoint(25F, -16F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 36
		bodyModel[28].setRotationPoint(25F, -16F, 8F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 16, 38, 0F); // Box 38
		bodyModel[29].setRotationPoint(8F, -22F, -19F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 7, 26, 0F); // Box 39
		bodyModel[30].setRotationPoint(8F, -6F, -13F);

		bodyModel[31].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Box 43
		bodyModel[31].setRotationPoint(10F, -2F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[32].setRotationPoint(-29F, -22F, 19F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[33].setRotationPoint(-29F, -22F, -20F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 46, 3, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[34].setRotationPoint(-38F, -6F, -13F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 16, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[35].setRotationPoint(-29F, -22F, -19F);

		bodyModel[36].addBox(0F, 0F, 0F, 28, 10, 12, 0F); // Box 0
		bodyModel[36].setRotationPoint(-20F, -16F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 28, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[37].setRotationPoint(-20F, -17F, -6F);

		bodyModel[38].addBox(0F, 0F, 0F, 8, 9, 12, 0F); // Box 2
		bodyModel[38].setRotationPoint(-28F, -15F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[39].setRotationPoint(-28F, -16F, -6F);

		bodyModel[40].addBox(0F, 0F, 0F, 8, 5, 8, 0F); // Box 4
		bodyModel[40].setRotationPoint(-29F, -11F, -16F);
		bodyModel[40].rotateAngleY = -0.27925268F;

		bodyModel[41].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 5
		bodyModel[41].setRotationPoint(-28F, -15F, -16F);
		bodyModel[41].rotateAngleY = -0.12217305F;

		bodyModel[42].addBox(0F, 0F, 0F, 9, 7, 12, 0F); // Box 9
		bodyModel[42].setRotationPoint(-38F, -13F, -6F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 10
		bodyModel[43].setRotationPoint(-37.5F, -15F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 11
		bodyModel[44].setRotationPoint(-42F, -5F, 11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 12
		bodyModel[45].setRotationPoint(-40F, -6F, 11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 13
		bodyModel[46].setRotationPoint(-42F, -5F, -20F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 14
		bodyModel[47].setRotationPoint(-40F, -6F, -20F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[48].setRotationPoint(-38F, -6F, -20F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[49].setRotationPoint(-38F, -6F, 13F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 19
		bodyModel[50].setRotationPoint(-41F, -2F, -4.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 20
		bodyModel[51].setRotationPoint(-41.3F, -4F, -4.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 22
		bodyModel[52].setRotationPoint(-41F, -8.3F, -5.2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 23
		bodyModel[53].setRotationPoint(-41F, -5.3F, -5.2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 25
		bodyModel[54].setRotationPoint(-41F, -8.3F, 4.2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 26
		bodyModel[55].setRotationPoint(-41F, -5.3F, 4.2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[56].setRotationPoint(-17F, -14F, 15F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[57].setRotationPoint(-11F, -14F, 15F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[58].setRotationPoint(-13F, -14F, 15F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[59].setRotationPoint(-13F, -14F, 18F);

		bodyModel[60].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 18
		bodyModel[60].setRotationPoint(-12.5F, -16F, 16.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 19
		bodyModel[61].setRotationPoint(-12.5F, -15F, 16.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[62].setRotationPoint(-16F, -14F, 15F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[63].setRotationPoint(-14F, -14F, 15F);

		bodyModel[64].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 22
		bodyModel[64].setRotationPoint(-15.5F, -16F, 16.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 23
		bodyModel[65].setRotationPoint(-15.5F, -15F, 16.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[66].setRotationPoint(-16F, -14F, 18F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[67].setRotationPoint(-5F, -14F, 15F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[68].setRotationPoint(-7F, -14F, 15F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[69].setRotationPoint(-7F, -14F, 18F);

		bodyModel[70].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 28
		bodyModel[70].setRotationPoint(-6.5F, -16F, 16.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 29
		bodyModel[71].setRotationPoint(-6.5F, -15F, 16.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[72].setRotationPoint(-10F, -14F, 15F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[73].setRotationPoint(-8F, -14F, 15F);

		bodyModel[74].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 32
		bodyModel[74].setRotationPoint(-9.5F, -16F, 16.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 33
		bodyModel[75].setRotationPoint(-9.5F, -15F, 16.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[76].setRotationPoint(-10F, -14F, 18F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[77].setRotationPoint(1F, -14F, 15F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[78].setRotationPoint(-1F, -14F, 15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[79].setRotationPoint(-1F, -14F, 18F);

		bodyModel[80].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 38
		bodyModel[80].setRotationPoint(-0.5F, -16F, 16.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 39
		bodyModel[81].setRotationPoint(-0.5F, -15F, 16.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[82].setRotationPoint(-4F, -14F, 15F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[83].setRotationPoint(-2F, -14F, 15F);

		bodyModel[84].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 42
		bodyModel[84].setRotationPoint(-3.5F, -16F, 16.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 43
		bodyModel[85].setRotationPoint(-3.5F, -15F, 16.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[86].setRotationPoint(-4F, -14F, 18F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[87].setRotationPoint(7F, -14F, 15F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[88].setRotationPoint(5F, -14F, 15F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[89].setRotationPoint(5F, -14F, 18F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[90].setRotationPoint(2F, -14F, 15F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[91].setRotationPoint(4F, -14F, 15F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[92].setRotationPoint(2F, -14F, 18F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[93].setRotationPoint(-17F, -14F, -19F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[94].setRotationPoint(-11F, -14F, -19F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[95].setRotationPoint(-13F, -14F, -16F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[96].setRotationPoint(-13F, -14F, -19F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[97].setRotationPoint(-16F, -14F, -16F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[98].setRotationPoint(-14F, -14F, -19F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[99].setRotationPoint(-16F, -14F, -19F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[100].setRotationPoint(-5F, -14F, -19F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[101].setRotationPoint(-7F, -14F, -16F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[102].setRotationPoint(-7F, -14F, -19F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[103].setRotationPoint(-10F, -14F, -16F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[104].setRotationPoint(-8F, -14F, -19F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[105].setRotationPoint(-10F, -14F, -19F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[106].setRotationPoint(1F, -14F, -19F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[107].setRotationPoint(-1F, -14F, -16F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[108].setRotationPoint(-1F, -14F, -19F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[109].setRotationPoint(-4F, -14F, -16F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[110].setRotationPoint(-2F, -14F, -19F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[111].setRotationPoint(-4F, -14F, -19F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[112].setRotationPoint(7F, -14F, -19F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[113].setRotationPoint(5F, -14F, -16F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[114].setRotationPoint(5F, -14F, -19F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[115].setRotationPoint(2F, -14F, -16F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[116].setRotationPoint(4F, -14F, -19F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[117].setRotationPoint(2F, -14F, -19F);

		bodyModel[118].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 89
		bodyModel[118].setRotationPoint(-12.5F, -16F, -17.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 90
		bodyModel[119].setRotationPoint(-12.5F, -15F, -17.5F);

		bodyModel[120].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 91
		bodyModel[120].setRotationPoint(-15.5F, -16F, -17.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 92
		bodyModel[121].setRotationPoint(-15.5F, -15F, -17.5F);

		bodyModel[122].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 93
		bodyModel[122].setRotationPoint(-9.5F, -16F, -17.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 94
		bodyModel[123].setRotationPoint(-9.5F, -15F, -17.5F);

		bodyModel[124].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 95
		bodyModel[124].setRotationPoint(5.5F, -16F, -17.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 96
		bodyModel[125].setRotationPoint(5.5F, -15F, -17.5F);

		bodyModel[126].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 97
		bodyModel[126].setRotationPoint(2.5F, -16F, -17.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 98
		bodyModel[127].setRotationPoint(2.5F, -15F, -17.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 15, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 99
		bodyModel[128].setRotationPoint(-7F, -20F, -6F);

		bodyModel[129].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 100
		bodyModel[129].setRotationPoint(0.5F, -7.3F, -10.5F);
		bodyModel[129].rotateAngleY = 0.36651914F;
		bodyModel[129].rotateAngleZ = -1.57079633F;

		bodyModel[130].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 102
		bodyModel[130].setRotationPoint(-7.5F, -7.3F, -10.5F);
		bodyModel[130].rotateAngleY = -0.36651914F;
		bodyModel[130].rotateAngleZ = -1.57079633F;

		bodyModel[131].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 104
		bodyModel[131].setRotationPoint(-13.5F, -7.3F, 9.5F);
		bodyModel[131].rotateAngleY = 0.2268928F;
		bodyModel[131].rotateAngleZ = -1.57079633F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 106
		bodyModel[132].setRotationPoint(-13.5F, -7.3F, 9.5F);
		bodyModel[132].rotateAngleY = -1.90240888F;
		bodyModel[132].rotateAngleZ = -1.57079633F;

		bodyModel[133].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 108
		bodyModel[133].setRotationPoint(-11.5F, -7.3F, -10.5F);
		bodyModel[133].rotateAngleY = -3.59537826F;
		bodyModel[133].rotateAngleZ = -1.57079633F;

		bodyModel[134].addBox(0F, 2F, 0F, 1, 13, 9, 0F); // Box 110
		bodyModel[134].setRotationPoint(9.2F, -18F, -11.5F);
		bodyModel[134].rotateAngleZ = 0.01745329F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 111
		bodyModel[135].setRotationPoint(9.2F, -18F, -10.5F);
		bodyModel[135].rotateAngleZ = 0.01745329F;

		bodyModel[136].addBox(0F, 15F, 0F, 1, 1, 1, 0F); // Box 112
		bodyModel[136].setRotationPoint(9.2F, -18F, -10.5F);
		bodyModel[136].rotateAngleZ = 0.01745329F;

		bodyModel[137].addBox(0F, 15F, 0F, 1, 1, 1, 0F); // Box 113
		bodyModel[137].setRotationPoint(9.2F, -18F, -4.5F);
		bodyModel[137].rotateAngleZ = 0.01745329F;

		bodyModel[138].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Box 114
		bodyModel[138].setRotationPoint(10F, -2F, 2F);

		bodyModel[139].addBox(0F, 2F, 0F, 1, 13, 9, 0F); // Box 115
		bodyModel[139].setRotationPoint(9.2F, -18F, 2.5F);
		bodyModel[139].rotateAngleZ = 0.01745329F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 116
		bodyModel[140].setRotationPoint(9.2F, -18F, 3.5F);
		bodyModel[140].rotateAngleZ = 0.01745329F;

		bodyModel[141].addBox(0F, 15F, 0F, 1, 1, 1, 0F); // Box 117
		bodyModel[141].setRotationPoint(9.2F, -18F, 3.5F);
		bodyModel[141].rotateAngleZ = 0.01745329F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, 1.5F, 0F, -0.4F, -1.7F, 0F, -0.4F, -1.7F, 0F, -0.4F, 1.5F, 0F, -0.4F); // Box 120
		bodyModel[142].setRotationPoint(28F, -13.5F, 6F);

		bodyModel[143].addBox(0F, 0F, 0F, 8, 5, 8, 0F); // Box 168
		bodyModel[143].setRotationPoint(-26.5F, -11F, 8F);
		bodyModel[143].rotateAngleY = 0.20943951F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[144].setRotationPoint(5F, -14F, 12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[145].setRotationPoint(7F, -14F, 12F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[146].setRotationPoint(4F, -14F, 12F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[147].setRotationPoint(5F, -14F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[148].setRotationPoint(7F, -14F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[149].setRotationPoint(4F, -14F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[150].setRotationPoint(7F, -14F, 6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[151].setRotationPoint(5F, -14F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[152].setRotationPoint(4F, -14F, 6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[153].setRotationPoint(5F, -14F, -13F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[154].setRotationPoint(7F, -14F, -15F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[155].setRotationPoint(4F, -14F, -15F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[156].setRotationPoint(5F, -14F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[157].setRotationPoint(7F, -14F, -12F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[158].setRotationPoint(4F, -14F, -12F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[159].setRotationPoint(7F, -14F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[160].setRotationPoint(5F, -14F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[161].setRotationPoint(4F, -14F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 202
		bodyModel[162].setRotationPoint(5.5F, -15F, -14.5F);

		bodyModel[163].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 203
		bodyModel[163].setRotationPoint(5.5F, -16F, -14.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 204
		bodyModel[164].setRotationPoint(5.5F, -15F, -11.5F);

		bodyModel[165].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 205
		bodyModel[165].setRotationPoint(5.5F, -16F, -11.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 206
		bodyModel[166].setRotationPoint(5.5F, -15F, -8.5F);

		bodyModel[167].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 207
		bodyModel[167].setRotationPoint(5.5F, -16F, -8.5F);

		bodyModel[168].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 208
		bodyModel[168].setRotationPoint(5.5F, -16F, 16.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 209
		bodyModel[169].setRotationPoint(5.5F, -15F, 16.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 210
		bodyModel[170].setRotationPoint(5.5F, -15F, 13.5F);

		bodyModel[171].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 211
		bodyModel[171].setRotationPoint(5.5F, -16F, 13.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 212
		bodyModel[172].setRotationPoint(5.5F, -15F, 10.5F);

		bodyModel[173].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 213
		bodyModel[173].setRotationPoint(5.5F, -16F, 10.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 214
		bodyModel[174].setRotationPoint(5.5F, -15F, 7.5F);

		bodyModel[175].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.30F, ModelRendererTurbo.MR_BOTTOM); // Box 215
		bodyModel[175].setRotationPoint(5.5F, -16F, 7.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 186
		bodyModel[176].setRotationPoint(-11F, -16F, 6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F); // Box 187
		bodyModel[177].setRotationPoint(-11F, -13F, 6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F); // Box 188
		bodyModel[178].setRotationPoint(-4F, -13F, 6F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[179].setRotationPoint(25F, -21F, 8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[180].setRotationPoint(25F, -20F, 5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 203
		bodyModel[181].setRotationPoint(21F, -7F, 19F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[182].setRotationPoint(30F, -7F, -19F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[183].setRotationPoint(34F, -6F, -19F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[184].setRotationPoint(32F, -7F, -19F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 209
		bodyModel[185].setRotationPoint(21F, -7F, -20F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[186].setRotationPoint(28F, -7F, -19F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[187].setRotationPoint(35F, -3F, -19F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[188].setRotationPoint(35F, -3F, 11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[189].setRotationPoint(10F, -7F, 19F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.001F, 0F, 0F, -0.001F, 0F, 0F, -0.001F, 0F, 0F, -0.001F, 0F, -2F, -0.001F, 0F, 0F, -0.001F, 0F, 0F, -0.001F, 0F, -2F, -0.001F); // Box 51
		bodyModel[190].setRotationPoint(18F, -7F, 19F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 52
		bodyModel[191].setRotationPoint(19F, -7F, -20F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[192].setRotationPoint(10F, -7F, -20F);

		bodyModel[193].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 6, 7, 7, 16, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 0
		bodyModel[193].setRotationPoint(-11.9F, 6.9F, 20F);

		bodyModel[194].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 6, 7, 7, 16, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 3
		bodyModel[194].setRotationPoint(3.1F, 6.9F, 20F);

		bodyModel[195].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 6, 7, 7, 16, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 4
		bodyModel[195].setRotationPoint(16.9F, 6.9F, 20F);

		bodyModel[196].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 6, 7, 7, 16, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 5
		bodyModel[196].setRotationPoint(-11.9F, 6.9F, -14F);

		bodyModel[197].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 6, 7, 7, 16, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 6
		bodyModel[197].setRotationPoint(3.1F, 6.9F, -14F);

		bodyModel[198].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 6, 7, 7, 16, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 7
		bodyModel[198].setRotationPoint(16.9F, 6.9F, -14F);

		bodyModel[199].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(5, 1, 5, 1), new Coord2D(6, 2, 6, 2), new Coord2D(6, 3, 6, 3), new Coord2D(5, 4, 5, 4), new Coord2D(4, 4, 4, 4), new Coord2D(3, 3, 3, 3), new Coord2D(3, 2, 3, 2)}), 4, 6, 4, 12, 4, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 8
		bodyModel[199].setRotationPoint(8.5F, 0.5F, 19F);

		bodyModel[200].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(5, 1, 5, 1), new Coord2D(6, 2, 6, 2), new Coord2D(6, 3, 6, 3), new Coord2D(5, 4, 5, 4), new Coord2D(4, 4, 4, 4), new Coord2D(3, 3, 3, 3), new Coord2D(3, 2, 3, 2)}), 4, 6, 4, 12, 4, ModelRendererTurbo.MR_FRONT, new float[]{2, 1, 2, 1, 2, 1, 2, 1}); // Shape 9
		bodyModel[200].setRotationPoint(8.5F, 0.5F, -15F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 16
		bodyModel[201].setRotationPoint(22.5F, -12F, -7.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 17
		bodyModel[202].setRotationPoint(21.5F, -12F, -7.5F);

		bodyModel[203].addBox(0F, -4F, 0F, 1, 4, 2, 0F); // Box 18
		bodyModel[203].setRotationPoint(24.5F, -1F, -4.5F);
		bodyModel[203].rotateAngleZ = -0.54105207F;

		bodyModel[204].addBox(1F, -2F, 0.5F, 6, 1, 1, 0F); // Box 19
		bodyModel[204].setRotationPoint(24.5F, -1F, -4.5F);
		bodyModel[204].rotateAngleZ = -0.54105207F;

		bodyModel[205].addBox(0F, -4F, 0F, 1, 4, 2, 0F); // Box 20
		bodyModel[205].setRotationPoint(24.5F, -1F, -11.5F);
		bodyModel[205].rotateAngleZ = -0.54105207F;

		bodyModel[206].addBox(1F, -2F, 0.5F, 6, 1, 1, 0F); // Box 21
		bodyModel[206].setRotationPoint(24.5F, -1F, -11.5F);
		bodyModel[206].rotateAngleZ = -0.54105207F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 2F, -0.5F, 2F, 2F, -0.5F, 2F, 2F, -0.5F, 2F, 2F, -0.5F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 22
		bodyModel[207].setRotationPoint(22.5F, 0.3F, -7.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[208].setRotationPoint(9F, -14F, -19F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 24
		bodyModel[209].setRotationPoint(16F, -11F, -19F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F, 3F, -0.1F, -0.1F, -3.1F, -0.1F, -0.1F, -3.1F, -0.1F, 0F, 3F, -0.1F, 0F, 3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 3F, 0F, 0F); // Box 25
		bodyModel[210].setRotationPoint(25F, -17F, -20F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[211].setRotationPoint(22F, -7F, -20F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 21, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[212].setRotationPoint(-28F, -7F, -20.5F);
		bodyModel[212].rotateAngleX = -0.27925268F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 21, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[213].setRotationPoint(-5F, -7F, -20.5F);
		bodyModel[213].rotateAngleX = -0.27925268F;

		bodyModel[214].addShapeBox(0F, 0F, -1F, 21, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[214].setRotationPoint(-28F, -7F, 20.5F);
		bodyModel[214].rotateAngleX = 0.27925268F;

		bodyModel[215].addShapeBox(0F, 0F, -1F, 21, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[215].setRotationPoint(-5F, -7F, 20.5F);
		bodyModel[215].rotateAngleX = 0.27925268F;

		bodyModel[216].addShape3D(6F, -6F, -1F, new Shape2D(new Coord2D[]{new Coord2D(3, 1, 3, 1), new Coord2D(9, 1, 9, 1), new Coord2D(11, 3, 11, 3), new Coord2D(11, 9, 11, 9), new Coord2D(9, 11, 9, 11), new Coord2D(3, 11, 3, 11), new Coord2D(1, 9, 1, 9), new Coord2D(1, 3, 1, 3)}), 2, 12, 12, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{3, 6, 3, 6, 3, 6, 3, 6}); // Shape 47
		bodyModel[216].setRotationPoint(31F, -7.85F, -15.1F);
		bodyModel[216].rotateAngleX = 1.57079633F;
		bodyModel[216].rotateAngleY = 1.57079633F;

		bodyModel[217].addShapeBox(0F, 0.5F, -0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 50
		bodyModel[217].setRotationPoint(-5F, -7F, -20.5F);
		bodyModel[217].rotateAngleX = -0.27925268F;

		bodyModel[218].addShapeBox(0F, 2.5F, -0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 51
		bodyModel[218].setRotationPoint(-5F, -7F, -20.5F);
		bodyModel[218].rotateAngleX = -0.27925268F;

		bodyModel[219].addShapeBox(0F, 6.5F, -0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 52
		bodyModel[219].setRotationPoint(-5F, -7F, -20.5F);
		bodyModel[219].rotateAngleX = -0.27925268F;

		bodyModel[220].addShapeBox(0F, 4.5F, -0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 53
		bodyModel[220].setRotationPoint(-5F, -7F, -20.5F);
		bodyModel[220].rotateAngleX = -0.27925268F;

		bodyModel[221].addShapeBox(0F, 6.5F, -0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 54
		bodyModel[221].setRotationPoint(-28F, -7F, -20.5F);
		bodyModel[221].rotateAngleX = -0.27925268F;

		bodyModel[222].addShapeBox(0F, 4.5F, -0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 55
		bodyModel[222].setRotationPoint(-28F, -7F, -20.5F);
		bodyModel[222].rotateAngleX = -0.27925268F;

		bodyModel[223].addShapeBox(0F, 2.5F, -0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 56
		bodyModel[223].setRotationPoint(-28F, -7F, -20.5F);
		bodyModel[223].rotateAngleX = -0.27925268F;

		bodyModel[224].addShapeBox(0F, 0.5F, -0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 57
		bodyModel[224].setRotationPoint(-28F, -7F, -20.5F);
		bodyModel[224].rotateAngleX = -0.27925268F;

		bodyModel[225].addShapeBox(0F, 6.5F, 0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 58
		bodyModel[225].setRotationPoint(-28F, -7F, 19.5F);
		bodyModel[225].rotateAngleX = 0.27925268F;

		bodyModel[226].addShapeBox(0F, 4.5F, 0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 59
		bodyModel[226].setRotationPoint(-28F, -7F, 19.5F);
		bodyModel[226].rotateAngleX = 0.27925268F;

		bodyModel[227].addShapeBox(0F, 2.5F, 0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 60
		bodyModel[227].setRotationPoint(-28F, -7F, 19.5F);
		bodyModel[227].rotateAngleX = 0.27925268F;

		bodyModel[228].addShapeBox(0F, 0.5F, 0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 61
		bodyModel[228].setRotationPoint(-28F, -7F, 19.5F);
		bodyModel[228].rotateAngleX = 0.27925268F;

		bodyModel[229].addShapeBox(0F, 0.5F, 0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 62
		bodyModel[229].setRotationPoint(-5F, -7F, 19.5F);
		bodyModel[229].rotateAngleX = 0.27925268F;

		bodyModel[230].addShapeBox(0F, 2.5F, 0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 63
		bodyModel[230].setRotationPoint(-5F, -7F, 19.5F);
		bodyModel[230].rotateAngleX = 0.27925268F;

		bodyModel[231].addShapeBox(0F, 4.5F, 0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 64
		bodyModel[231].setRotationPoint(-5F, -7F, 19.5F);
		bodyModel[231].rotateAngleX = 0.27925268F;

		bodyModel[232].addShapeBox(0F, 6.5F, 0.1F, 21, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 65
		bodyModel[232].setRotationPoint(-5F, -7F, 19.5F);
		bodyModel[232].rotateAngleX = 0.27925268F;

		bodyModel[233].addShapeBox(8F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 66
		bodyModel[233].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[233].rotateAngleX = -1.57079633F;
		bodyModel[233].rotateAngleZ = 0.01745329F;

		bodyModel[234].addShapeBox(5F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 68
		bodyModel[234].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[234].rotateAngleX = -1.57079633F;
		bodyModel[234].rotateAngleZ = 0.01745329F;

		bodyModel[235].addShapeBox(2F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 70
		bodyModel[235].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[235].rotateAngleX = -1.57079633F;
		bodyModel[235].rotateAngleZ = 0.01745329F;

		bodyModel[236].addShapeBox(-1F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 72
		bodyModel[236].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[236].rotateAngleX = -1.57079633F;
		bodyModel[236].rotateAngleZ = 0.01745329F;

		bodyModel[237].addShapeBox(-2F, -2.5F, -1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[237].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[237].rotateAngleX = -1.57079633F;
		bodyModel[237].rotateAngleZ = 0.01745329F;

		bodyModel[238].addShapeBox(-2F, -2.5F, 1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[238].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[238].rotateAngleX = -1.57079633F;
		bodyModel[238].rotateAngleZ = 0.01745329F;

		bodyModel[239].addShapeBox(1F, -2.5F, 1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[239].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[239].rotateAngleX = -1.57079633F;
		bodyModel[239].rotateAngleZ = 0.01745329F;

		bodyModel[240].addShapeBox(1F, -2.5F, -1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[240].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[240].rotateAngleX = -1.57079633F;
		bodyModel[240].rotateAngleZ = 0.01745329F;

		bodyModel[241].addShapeBox(4F, -2.5F, 1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[241].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[241].rotateAngleX = -1.57079633F;
		bodyModel[241].rotateAngleZ = 0.01745329F;

		bodyModel[242].addShapeBox(4F, -2.5F, -1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[242].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[242].rotateAngleX = -1.57079633F;
		bodyModel[242].rotateAngleZ = 0.01745329F;

		bodyModel[243].addShapeBox(7F, -2.5F, 1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[243].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[243].rotateAngleX = -1.57079633F;
		bodyModel[243].rotateAngleZ = 0.01745329F;

		bodyModel[244].addShapeBox(7F, -2.5F, -1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[244].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[244].rotateAngleX = -1.57079633F;
		bodyModel[244].rotateAngleZ = 0.01745329F;

		bodyModel[245].addShapeBox(8F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 82
		bodyModel[245].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[245].rotateAngleX = -1.57079633F;
		bodyModel[245].rotateAngleZ = 0.01745329F;

		bodyModel[246].addShapeBox(5F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 84
		bodyModel[246].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[246].rotateAngleX = -1.57079633F;
		bodyModel[246].rotateAngleZ = 0.01745329F;

		bodyModel[247].addShapeBox(2F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 86
		bodyModel[247].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[247].rotateAngleX = -1.57079633F;
		bodyModel[247].rotateAngleZ = 0.01745329F;

		bodyModel[248].addShapeBox(-1F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 88
		bodyModel[248].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[248].rotateAngleX = -1.57079633F;
		bodyModel[248].rotateAngleZ = 0.01745329F;

		bodyModel[249].addShapeBox(-2F, -2.5F, -1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[249].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[249].rotateAngleX = -1.57079633F;
		bodyModel[249].rotateAngleZ = 0.01745329F;

		bodyModel[250].addShapeBox(-2F, -2.5F, 1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[250].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[250].rotateAngleX = -1.57079633F;
		bodyModel[250].rotateAngleZ = 0.01745329F;

		bodyModel[251].addShapeBox(1F, -2.5F, 1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[251].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[251].rotateAngleX = -1.57079633F;
		bodyModel[251].rotateAngleZ = 0.01745329F;

		bodyModel[252].addShapeBox(1F, -2.5F, -1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[252].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[252].rotateAngleX = -1.57079633F;
		bodyModel[252].rotateAngleZ = 0.01745329F;

		bodyModel[253].addShapeBox(4F, -2.5F, 1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[253].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[253].rotateAngleX = -1.57079633F;
		bodyModel[253].rotateAngleZ = 0.01745329F;

		bodyModel[254].addShapeBox(4F, -2.5F, -1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[254].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[254].rotateAngleX = -1.57079633F;
		bodyModel[254].rotateAngleZ = 0.01745329F;

		bodyModel[255].addShapeBox(7F, -2.5F, 1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[255].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[255].rotateAngleX = -1.57079633F;
		bodyModel[255].rotateAngleZ = 0.01745329F;

		bodyModel[256].addShapeBox(7F, -2.5F, -1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[256].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[256].rotateAngleX = -1.57079633F;
		bodyModel[256].rotateAngleZ = 0.01745329F;

		bodyModel[257].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 104
		bodyModel[257].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[257].rotateAngleX = -1.57079633F;
		bodyModel[257].rotateAngleZ = 0.01745329F;

		bodyModel[258].addShapeBox(-2F, -2.5F, -1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[258].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[258].rotateAngleX = -1.57079633F;
		bodyModel[258].rotateAngleZ = 0.01745329F;

		bodyModel[259].addShapeBox(-2F, -2.5F, 1F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[259].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[259].rotateAngleX = -1.57079633F;
		bodyModel[259].rotateAngleZ = 0.01745329F;

		bodyModel[260].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		bodyModel[260].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[260].rotateAngleX = -1.57079633F;
		bodyModel[260].rotateAngleZ = 0.01745329F;

		bodyModel[261].addShapeBox(7F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		bodyModel[261].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[261].rotateAngleX = -1.57079633F;
		bodyModel[261].rotateAngleZ = 0.01745329F;

		bodyModel[262].addShapeBox(4F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		bodyModel[262].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[262].rotateAngleX = -1.57079633F;
		bodyModel[262].rotateAngleZ = 0.01745329F;

		bodyModel[263].addShapeBox(1F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		bodyModel[263].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[263].rotateAngleX = -1.57079633F;
		bodyModel[263].rotateAngleZ = 0.01745329F;

		bodyModel[264].addShapeBox(-2F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 4
		bodyModel[264].setRotationPoint(-14F, -17F, 19.5F);
		bodyModel[264].rotateAngleX = -1.57079633F;
		bodyModel[264].rotateAngleZ = 0.01745329F;

		bodyModel[265].addShapeBox(7F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 5
		bodyModel[265].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[265].rotateAngleX = -1.57079633F;
		bodyModel[265].rotateAngleZ = 0.01745329F;

		bodyModel[266].addShapeBox(4F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		bodyModel[266].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[266].rotateAngleX = -1.57079633F;
		bodyModel[266].rotateAngleZ = 0.01745329F;

		bodyModel[267].addShapeBox(1F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 7
		bodyModel[267].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[267].rotateAngleX = -1.57079633F;
		bodyModel[267].rotateAngleZ = 0.01745329F;

		bodyModel[268].addShapeBox(-2F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 8
		bodyModel[268].setRotationPoint(-26F, -17F, 19.5F);
		bodyModel[268].rotateAngleX = -1.57079633F;
		bodyModel[268].rotateAngleZ = 0.01745329F;

		bodyModel[269].addShapeBox(-3F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[269].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[269].rotateAngleX = -1.57079633F;
		bodyModel[269].rotateAngleZ = 0.01745329F;

		bodyModel[270].addShapeBox(0F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 10
		bodyModel[270].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[270].rotateAngleX = -1.57079633F;
		bodyModel[270].rotateAngleZ = 0.01745329F;

		bodyModel[271].addShapeBox(-6F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 11
		bodyModel[271].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[271].rotateAngleX = -1.57079633F;
		bodyModel[271].rotateAngleZ = 0.01745329F;

		bodyModel[272].addShapeBox(-9F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[272].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[272].rotateAngleX = -1.57079633F;
		bodyModel[272].rotateAngleZ = 0.01745329F;

		bodyModel[273].addShapeBox(-12F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 13
		bodyModel[273].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[273].rotateAngleX = -1.57079633F;
		bodyModel[273].rotateAngleZ = 0.01745329F;

		bodyModel[274].addShapeBox(-15F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 14
		bodyModel[274].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[274].rotateAngleX = -1.57079633F;
		bodyModel[274].rotateAngleZ = 0.01745329F;

		bodyModel[275].addShapeBox(-18F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[275].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[275].rotateAngleX = -1.57079633F;
		bodyModel[275].rotateAngleZ = 0.01745329F;

		bodyModel[276].addShapeBox(-21F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 16
		bodyModel[276].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[276].rotateAngleX = -1.57079633F;
		bodyModel[276].rotateAngleZ = 0.01745329F;

		bodyModel[277].addShapeBox(-24F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[277].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[277].rotateAngleX = -1.57079633F;
		bodyModel[277].rotateAngleZ = 0.01745329F;

		bodyModel[278].addShapeBox(-27F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 18
		bodyModel[278].setRotationPoint(-2F, -17F, 19.5F);
		bodyModel[278].rotateAngleX = -1.57079633F;
		bodyModel[278].rotateAngleZ = 0.01745329F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 66
		bodyModel[279].setRotationPoint(-40.8F, -7F, -1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 67
		bodyModel[280].setRotationPoint(-40.8F, -8.5F, 3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.4F, -2F, 1F, -0.4F, -2F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 68
		bodyModel[281].setRotationPoint(-40.8F, -8.5F, 0F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 69
		bodyModel[282].setRotationPoint(-40.8F, -8.5F, 1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 70
		bodyModel[283].setRotationPoint(-39.8F, -9.5F, 2.5F);

		bodyModel[284].addShapeBox(-27F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 427
		bodyModel[284].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[284].rotateAngleX = -1.57079633F;
		bodyModel[284].rotateAngleZ = 0.01745329F;

		bodyModel[285].addShapeBox(-24F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 428
		bodyModel[285].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[285].rotateAngleX = -1.57079633F;
		bodyModel[285].rotateAngleZ = 0.01745329F;

		bodyModel[286].addShapeBox(-21F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 429
		bodyModel[286].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[286].rotateAngleX = -1.57079633F;
		bodyModel[286].rotateAngleZ = 0.01745329F;

		bodyModel[287].addShapeBox(-18F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 430
		bodyModel[287].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[287].rotateAngleX = -1.57079633F;
		bodyModel[287].rotateAngleZ = 0.01745329F;

		bodyModel[288].addShapeBox(-15F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 431
		bodyModel[288].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[288].rotateAngleX = -1.57079633F;
		bodyModel[288].rotateAngleZ = 0.01745329F;

		bodyModel[289].addShapeBox(-12F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 432
		bodyModel[289].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[289].rotateAngleX = -1.57079633F;
		bodyModel[289].rotateAngleZ = 0.01745329F;

		bodyModel[290].addShapeBox(-3F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 433
		bodyModel[290].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[290].rotateAngleX = -1.57079633F;
		bodyModel[290].rotateAngleZ = 0.01745329F;

		bodyModel[291].addShapeBox(0F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 434
		bodyModel[291].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[291].rotateAngleX = -1.57079633F;
		bodyModel[291].rotateAngleZ = 0.01745329F;

		bodyModel[292].addShapeBox(-2F, -2.5F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 435
		bodyModel[292].setRotationPoint(-17F, -17F, -23.5F);
		bodyModel[292].rotateAngleX = -1.57079633F;
		bodyModel[292].rotateAngleZ = 0.01745329F;

		bodyModel[293].addShapeBox(-2F, -2.5F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 436
		bodyModel[293].setRotationPoint(-17F, -17F, -23.5F);
		bodyModel[293].rotateAngleX = -1.57079633F;
		bodyModel[293].rotateAngleZ = 0.01745329F;

		bodyModel[294].addShapeBox(1F, -2.5F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 437
		bodyModel[294].setRotationPoint(-17F, -17F, -23.5F);
		bodyModel[294].rotateAngleX = -1.57079633F;
		bodyModel[294].rotateAngleZ = 0.01745329F;

		bodyModel[295].addShapeBox(4F, -2.5F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 438
		bodyModel[295].setRotationPoint(-17F, -17F, -23.5F);
		bodyModel[295].rotateAngleX = -1.57079633F;
		bodyModel[295].rotateAngleZ = 0.01745329F;

		bodyModel[296].addShapeBox(7F, -2.5F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 439
		bodyModel[296].setRotationPoint(-17F, -17F, -23.5F);
		bodyModel[296].rotateAngleX = -1.57079633F;
		bodyModel[296].rotateAngleZ = 0.01745329F;

		bodyModel[297].addShapeBox(-2F, -2.5F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 440
		bodyModel[297].setRotationPoint(-5F, -17F, -23.5F);
		bodyModel[297].rotateAngleX = -1.57079633F;
		bodyModel[297].rotateAngleZ = 0.01745329F;

		bodyModel[298].addShapeBox(4F, -2.5F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 441
		bodyModel[298].setRotationPoint(-5F, -17F, -23.5F);
		bodyModel[298].rotateAngleX = -1.57079633F;
		bodyModel[298].rotateAngleZ = 0.01745329F;

		bodyModel[299].addShapeBox(4F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 442
		bodyModel[299].setRotationPoint(-5F, -17F, -21.5F);
		bodyModel[299].rotateAngleX = -1.57079633F;
		bodyModel[299].rotateAngleZ = 0.01745329F;

		bodyModel[300].addShapeBox(-9F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 443
		bodyModel[300].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[300].rotateAngleX = -1.57079633F;
		bodyModel[300].rotateAngleZ = 0.01745329F;

		bodyModel[301].addShapeBox(1F, -2.5F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 444
		bodyModel[301].setRotationPoint(-5F, -17F, -23.5F);
		bodyModel[301].rotateAngleX = -1.57079633F;
		bodyModel[301].rotateAngleZ = 0.01745329F;

		bodyModel[302].addShapeBox(5F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 445
		bodyModel[302].setRotationPoint(-5F, -17F, -21.5F);
		bodyModel[302].rotateAngleX = -1.57079633F;
		bodyModel[302].rotateAngleZ = 0.01745329F;

		bodyModel[303].addShapeBox(-6F, -1.5F, -2.5F, 1, 1, 6, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 446
		bodyModel[303].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[303].rotateAngleX = -1.57079633F;
		bodyModel[303].rotateAngleZ = 0.01745329F;

		bodyModel[304].addShapeBox(7F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 447
		bodyModel[304].setRotationPoint(-5F, -17F, -21.5F);
		bodyModel[304].rotateAngleX = -1.57079633F;
		bodyModel[304].rotateAngleZ = 0.01745329F;

		bodyModel[305].addShapeBox(8F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 448
		bodyModel[305].setRotationPoint(-5F, -17F, -21.5F);
		bodyModel[305].rotateAngleX = -1.57079633F;
		bodyModel[305].rotateAngleZ = 0.01745329F;

		bodyModel[306].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 449
		bodyModel[306].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[306].rotateAngleX = -1.57079633F;
		bodyModel[306].rotateAngleZ = 0.01745329F;

		bodyModel[307].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 450
		bodyModel[307].setRotationPoint(7F, -17F, -21.5F);
		bodyModel[307].rotateAngleX = -1.57079633F;
		bodyModel[307].rotateAngleZ = 0.01745329F;

		bodyModel[308].addShapeBox(-2F, -2.5F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 451
		bodyModel[308].setRotationPoint(7F, -17F, -23.5F);
		bodyModel[308].rotateAngleX = -1.57079633F;
		bodyModel[308].rotateAngleZ = 0.01745329F;

		bodyModel[309].addShapeBox(7F, -2.5F, -1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 452
		bodyModel[309].setRotationPoint(-5F, -17F, -23.5F);
		bodyModel[309].rotateAngleX = -1.57079633F;
		bodyModel[309].rotateAngleZ = 0.01745329F;

		bodyModel[310].addShapeBox(-2F, -2.5F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 453
		bodyModel[310].setRotationPoint(7F, -17F, -23.5F);
		bodyModel[310].rotateAngleX = -1.57079633F;
		bodyModel[310].rotateAngleZ = 0.01745329F;

		bodyModel[311].addShapeBox(7F, -2.5F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 454
		bodyModel[311].setRotationPoint(-5F, -17F, -23.5F);
		bodyModel[311].rotateAngleX = -1.57079633F;
		bodyModel[311].rotateAngleZ = 0.01745329F;

		bodyModel[312].addShapeBox(4F, -2.5F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 455
		bodyModel[312].setRotationPoint(-5F, -17F, -23.5F);
		bodyModel[312].rotateAngleX = -1.57079633F;
		bodyModel[312].rotateAngleZ = 0.01745329F;

		bodyModel[313].addShapeBox(1F, -2.5F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 456
		bodyModel[313].setRotationPoint(-5F, -17F, -23.5F);
		bodyModel[313].rotateAngleX = -1.57079633F;
		bodyModel[313].rotateAngleZ = 0.01745329F;

		bodyModel[314].addShapeBox(2F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 457
		bodyModel[314].setRotationPoint(-5F, -17F, -21.5F);
		bodyModel[314].rotateAngleX = -1.57079633F;
		bodyModel[314].rotateAngleZ = 0.01745329F;

		bodyModel[315].addShapeBox(1F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 458
		bodyModel[315].setRotationPoint(-5F, -17F, -21.5F);
		bodyModel[315].rotateAngleX = -1.57079633F;
		bodyModel[315].rotateAngleZ = 0.01745329F;

		bodyModel[316].addShapeBox(-1F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 459
		bodyModel[316].setRotationPoint(-5F, -17F, -21.5F);
		bodyModel[316].rotateAngleX = -1.57079633F;
		bodyModel[316].rotateAngleZ = 0.01745329F;

		bodyModel[317].addShapeBox(-2F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 460
		bodyModel[317].setRotationPoint(-5F, -17F, -21.5F);
		bodyModel[317].rotateAngleX = -1.57079633F;
		bodyModel[317].rotateAngleZ = 0.01745329F;

		bodyModel[318].addShapeBox(-2F, -2.5F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 461
		bodyModel[318].setRotationPoint(-5F, -17F, -23.5F);
		bodyModel[318].rotateAngleX = -1.57079633F;
		bodyModel[318].rotateAngleZ = 0.01745329F;

		bodyModel[319].addShapeBox(7F, -2.5F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 462
		bodyModel[319].setRotationPoint(-17F, -17F, -23.5F);
		bodyModel[319].rotateAngleX = -1.57079633F;
		bodyModel[319].rotateAngleZ = 0.01745329F;

		bodyModel[320].addShapeBox(8F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 463
		bodyModel[320].setRotationPoint(-17F, -17F, -21.5F);
		bodyModel[320].rotateAngleX = -1.57079633F;
		bodyModel[320].rotateAngleZ = 0.01745329F;

		bodyModel[321].addShapeBox(7F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 464
		bodyModel[321].setRotationPoint(-17F, -17F, -21.5F);
		bodyModel[321].rotateAngleX = -1.57079633F;
		bodyModel[321].rotateAngleZ = 0.01745329F;

		bodyModel[322].addShapeBox(5F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 465
		bodyModel[322].setRotationPoint(-17F, -17F, -21.5F);
		bodyModel[322].rotateAngleX = -1.57079633F;
		bodyModel[322].rotateAngleZ = 0.01745329F;

		bodyModel[323].addShapeBox(4F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 466
		bodyModel[323].setRotationPoint(-17F, -17F, -21.5F);
		bodyModel[323].rotateAngleX = -1.57079633F;
		bodyModel[323].rotateAngleZ = 0.01745329F;

		bodyModel[324].addShapeBox(4F, -2.5F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 467
		bodyModel[324].setRotationPoint(-17F, -17F, -23.5F);
		bodyModel[324].rotateAngleX = -1.57079633F;
		bodyModel[324].rotateAngleZ = 0.01745329F;

		bodyModel[325].addShapeBox(1F, -2.5F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 468
		bodyModel[325].setRotationPoint(-17F, -17F, -23.5F);
		bodyModel[325].rotateAngleX = -1.57079633F;
		bodyModel[325].rotateAngleZ = 0.01745329F;

		bodyModel[326].addShapeBox(2F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 469
		bodyModel[326].setRotationPoint(-17F, -17F, -21.5F);
		bodyModel[326].rotateAngleX = -1.57079633F;
		bodyModel[326].rotateAngleZ = 0.01745329F;

		bodyModel[327].addShapeBox(1F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 470
		bodyModel[327].setRotationPoint(-17F, -17F, -21.5F);
		bodyModel[327].rotateAngleX = -1.57079633F;
		bodyModel[327].rotateAngleZ = 0.01745329F;

		bodyModel[328].addShapeBox(-1F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 471
		bodyModel[328].setRotationPoint(-17F, -17F, -21.5F);
		bodyModel[328].rotateAngleX = -1.57079633F;
		bodyModel[328].rotateAngleZ = 0.01745329F;

		bodyModel[329].addShapeBox(-2F, -1.5F, -3.3F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 472
		bodyModel[329].setRotationPoint(-17F, -17F, -21.5F);
		bodyModel[329].rotateAngleX = -1.57079633F;
		bodyModel[329].rotateAngleZ = 0.01745329F;

		bodyModel[330].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 0
		bodyModel[330].setRotationPoint(31F, -7.85F, -15.1F);
		bodyModel[330].rotateAngleX = 1.57079633F;
		bodyModel[330].rotateAngleY = 1.57079633F;

		bodyModel[331].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 3
		bodyModel[331].setRotationPoint(31F, -7.85F, -15.1F);
		bodyModel[331].rotateAngleX = 1.57079633F;
		bodyModel[331].rotateAngleY = 0.78539816F;

		bodyModel[332].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 4
		bodyModel[332].setRotationPoint(31F, -7.85F, -15.1F);
		bodyModel[332].rotateAngleX = 1.57079633F;
		bodyModel[332].rotateAngleY = -0.78539816F;

		bodyModel[333].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 5
		bodyModel[333].setRotationPoint(31F, -7.85F, -15.1F);
		bodyModel[333].rotateAngleX = 1.57079633F;

		bodyModel[334].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 6, 7, 7, 16, 6, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 38
		bodyModel[334].setRotationPoint(35.9F, -5.1F, -18F);
		bodyModel[334].rotateAngleX = -1.57079633F;

		bodyModel[335].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 0
		bodyModel[335].setRotationPoint(22.65F, -15F, -15F);
		bodyModel[335].rotateAngleZ = 0.29670597F;

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[336].setRotationPoint(34F, -6F, -20F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1
		bodyModel[337].setRotationPoint(34F, -6F, 19F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 2
		bodyModel[338].setRotationPoint(32F, -7F, 19F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 3
		bodyModel[339].setRotationPoint(32F, -7F, -20F);

		bodyModel[340].addShapeBox(-4F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[340].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[340].rotateAngleX = -1.57079633F;
		bodyModel[340].rotateAngleZ = -0.6981317F;

		bodyModel[341].addShapeBox(-3F, 0F, -1F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[341].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[341].rotateAngleX = -1.57079633F;
		bodyModel[341].rotateAngleZ = -0.6981317F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[342].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[342].rotateAngleX = -1.57079633F;
		bodyModel[342].rotateAngleZ = -0.6981317F;

		bodyModel[343].addShapeBox(-6F, 0F, 4F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[343].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[343].rotateAngleX = -1.57079633F;
		bodyModel[343].rotateAngleZ = -0.6981317F;

		bodyModel[344].addShapeBox(-5F, 0F, 1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[344].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[344].rotateAngleX = -1.57079633F;
		bodyModel[344].rotateAngleZ = -0.6981317F;

		bodyModel[345].addShapeBox(-3F, 0F, 5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[345].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[345].rotateAngleX = -1.57079633F;
		bodyModel[345].rotateAngleZ = -0.6981317F;

		bodyModel[346].addShapeBox(-6F, 0F, 2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[346].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[346].rotateAngleX = -1.57079633F;
		bodyModel[346].rotateAngleZ = -0.6981317F;

		bodyModel[347].addShapeBox(-7F, 0F, 5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[347].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[347].rotateAngleX = -1.57079633F;
		bodyModel[347].rotateAngleZ = -0.6981317F;

		bodyModel[348].addShapeBox(-8F, 0F, 6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[348].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[348].rotateAngleX = -1.57079633F;
		bodyModel[348].rotateAngleZ = -0.6981317F;

		bodyModel[349].addShapeBox(-9F, 0F, 7F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[349].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[349].rotateAngleX = -1.57079633F;
		bodyModel[349].rotateAngleZ = -0.6981317F;

		bodyModel[350].addShapeBox(-10F, 0F, 8F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[350].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[350].rotateAngleX = -1.57079633F;
		bodyModel[350].rotateAngleZ = -0.6981317F;

		bodyModel[351].addShapeBox(-13F, 0F, 10F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[351].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[351].rotateAngleX = -1.57079633F;
		bodyModel[351].rotateAngleZ = -0.6981317F;

		bodyModel[352].addShapeBox(-13F, 0F, 11F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[352].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[352].rotateAngleX = -1.57079633F;
		bodyModel[352].rotateAngleZ = -0.6981317F;

		bodyModel[353].addShapeBox(-12F, 0F, 12F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[353].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[353].rotateAngleX = -1.57079633F;
		bodyModel[353].rotateAngleZ = -0.6981317F;

		bodyModel[354].addShapeBox(-11F, 0F, 9F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[354].setRotationPoint(17.5F, -12F, 21F);
		bodyModel[354].rotateAngleX = -1.57079633F;
		bodyModel[354].rotateAngleZ = -0.6981317F;

		bodyModel[355].addShapeBox(0F, 0F, 0F, 60, 60, 1, 0F, 0F, 0F, 0F, -55F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, -55F, -55F, 0F, -55F, -55F, 0F, 0F, -55F, 0F); // Box 16
		bodyModel[355].setRotationPoint(9.5F, -13F, -15.9F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 60, 60, 1, 0F, 0F, 0F, 0F, -55F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, -55F, -55F, 0F, -55F, -55F, 0F, 0F, -55F, 0F); // Box 17
		bodyModel[356].setRotationPoint(17.5F, -11F, -18F);
		bodyModel[356].rotateAngleY = 0.59341195F;

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.001F, 0F, 0F, -0.001F, 0F, 0F, -0.001F, 0F, 0F, -0.001F, 0F, -2F, -0.001F, 0F, 0F, -0.001F, 0F, 0F, -0.001F, 0F, -2F, -0.001F); // Box 2
		bodyModel[357].setRotationPoint(18F, -7F, -20F);


		leftTrackWheelModels = new ModelRendererTurbo[21];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Shape 52
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Shape 191
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 52
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 194
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 195
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 0
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 8
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 257, 270, textureX, textureY); // Shape 43
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 257, 270, textureX, textureY); // Shape 44
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 26
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 27
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 28
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 29
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 30
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 31
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 32
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 33
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 34
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 35
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 36
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 37

		leftTrackWheelModels[0].addShape3D(4F, -4F, -4F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2)}), 4, 8, 8, 28, 4, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 52
		leftTrackWheelModels[0].setRotationPoint(29F, 0F, 15F);

		leftTrackWheelModels[1].addShape3D(4F, -4F, -4F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2)}), 4, 8, 8, 28, 4, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 191
		leftTrackWheelModels[1].setRotationPoint(-34F, 1F, 15F);

		leftTrackWheelModels[2].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 1, 3, 1), new Coord2D(9, 1, 9, 1), new Coord2D(11, 3, 11, 3), new Coord2D(11, 9, 11, 9), new Coord2D(9, 11, 9, 11), new Coord2D(3, 11, 3, 11), new Coord2D(1, 9, 1, 9), new Coord2D(1, 3, 1, 3)}), 2, 13, 13, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{3, 6, 3, 6, 3, 6, 3, 6}); // Shape 52
		leftTrackWheelModels[2].setRotationPoint(12F, 4F, 16F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 1, 3, 1), new Coord2D(9, 1, 9, 1), new Coord2D(11, 3, 11, 3), new Coord2D(11, 9, 11, 9), new Coord2D(9, 11, 9, 11), new Coord2D(3, 11, 3, 11), new Coord2D(1, 9, 1, 9), new Coord2D(1, 3, 1, 3)}), 2, 13, 13, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{3, 6, 3, 6, 3, 6, 3, 6}); // Shape 194
		leftTrackWheelModels[3].setRotationPoint(-2F, 4F, 16F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 1, 3, 1), new Coord2D(9, 1, 9, 1), new Coord2D(11, 3, 11, 3), new Coord2D(11, 9, 11, 9), new Coord2D(9, 11, 9, 11), new Coord2D(3, 11, 3, 11), new Coord2D(1, 9, 1, 9), new Coord2D(1, 3, 1, 3)}), 2, 13, 13, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{3, 6, 3, 6, 3, 6, 3, 6}); // Shape 195
		leftTrackWheelModels[4].setRotationPoint(-17F, 4F, 16F);

		leftTrackWheelModels[5].addShape3D(5F, -3F, -2F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 2, 7, 5, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 0
		leftTrackWheelModels[5].setRotationPoint(4F, -2F, 16F);

		leftTrackWheelModels[6].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 2, 7, 5, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 8
		leftTrackWheelModels[6].setRotationPoint(4F, -2F, -16F);

		leftTrackWheelModels[7].addShape3D(5F, -3F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 43
		leftTrackWheelModels[7].setRotationPoint(-34F, 0.8F, 18F);

		leftTrackWheelModels[8].addShape3D(5F, -3F, 36.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 44
		leftTrackWheelModels[8].setRotationPoint(-34F, 0.8F, 18F);

		leftTrackWheelModels[9].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 26
		leftTrackWheelModels[9].setRotationPoint(-17F, 4.15F, 16.9F);

		leftTrackWheelModels[10].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 27
		leftTrackWheelModels[10].setRotationPoint(-17F, 4.15F, 16.9F);

		leftTrackWheelModels[11].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F); // Box 28
		leftTrackWheelModels[11].setRotationPoint(-17F, 4.15F, 16.9F);

		leftTrackWheelModels[12].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F); // Box 29
		leftTrackWheelModels[12].setRotationPoint(-17F, 4.15F, 16.9F);

		leftTrackWheelModels[13].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 30
		leftTrackWheelModels[13].setRotationPoint(-2F, 4.15F, 16.9F);

		leftTrackWheelModels[14].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 31
		leftTrackWheelModels[14].setRotationPoint(-2F, 4.15F, 16.9F);

		leftTrackWheelModels[15].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F); // Box 32
		leftTrackWheelModels[15].setRotationPoint(-2F, 4.15F, 16.9F);

		leftTrackWheelModels[16].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F); // Box 33
		leftTrackWheelModels[16].setRotationPoint(-2F, 4.15F, 16.9F);

		leftTrackWheelModels[17].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 34
		leftTrackWheelModels[17].setRotationPoint(12F, 4.15F, 16.9F);

		leftTrackWheelModels[18].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 35
		leftTrackWheelModels[18].setRotationPoint(12F, 4.15F, 16.9F);

		leftTrackWheelModels[19].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F); // Box 36
		leftTrackWheelModels[19].setRotationPoint(12F, 4.15F, 16.9F);

		leftTrackWheelModels[20].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F); // Box 37
		leftTrackWheelModels[20].setRotationPoint(12F, 4.15F, 16.9F);


		rightTrackWheelModels = new ModelRendererTurbo[17];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Shape 190
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Shape 192
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 1
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 2
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 3
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 11
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 15
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 16
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 17
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 18
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 19
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 20
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 21
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 22
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 23
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 24
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 326, 256, textureX, textureY); // Box 25

		rightTrackWheelModels[0].addShape3D(4F, -4F, 0F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2)}), 4, 8, 8, 28, 4, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 190
		rightTrackWheelModels[0].setRotationPoint(29F, 0F, -15F);

		rightTrackWheelModels[1].addShape3D(4F, -4F, 0F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2)}), 4, 8, 8, 28, 4, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 192
		rightTrackWheelModels[1].setRotationPoint(-34F, 1F, -15F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 1, 3, 1), new Coord2D(9, 1, 9, 1), new Coord2D(11, 3, 11, 3), new Coord2D(11, 9, 11, 9), new Coord2D(9, 11, 9, 11), new Coord2D(3, 11, 3, 11), new Coord2D(1, 9, 1, 9), new Coord2D(1, 3, 1, 3)}), 2, 13, 13, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{3, 6, 3, 6, 3, 6, 3, 6}); // Shape 1
		rightTrackWheelModels[2].setRotationPoint(12F, 4F, -16F);

		rightTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 1, 3, 1), new Coord2D(9, 1, 9, 1), new Coord2D(11, 3, 11, 3), new Coord2D(11, 9, 11, 9), new Coord2D(9, 11, 9, 11), new Coord2D(3, 11, 3, 11), new Coord2D(1, 9, 1, 9), new Coord2D(1, 3, 1, 3)}), 2, 13, 13, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{3, 6, 3, 6, 3, 6, 3, 6}); // Shape 2
		rightTrackWheelModels[3].setRotationPoint(-2F, 4F, -16F);

		rightTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[]{new Coord2D(3, 1, 3, 1), new Coord2D(9, 1, 9, 1), new Coord2D(11, 3, 11, 3), new Coord2D(11, 9, 11, 9), new Coord2D(9, 11, 9, 11), new Coord2D(3, 11, 3, 11), new Coord2D(1, 9, 1, 9), new Coord2D(1, 3, 1, 3)}), 2, 13, 13, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{3, 6, 3, 6, 3, 6, 3, 6}); // Shape 3
		rightTrackWheelModels[4].setRotationPoint(-17F, 4F, -16F);

		rightTrackWheelModels[5].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 11
		rightTrackWheelModels[5].setRotationPoint(12F, 4.15F, -17.1F);

		rightTrackWheelModels[6].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 15
		rightTrackWheelModels[6].setRotationPoint(12F, 4.15F, -17.1F);

		rightTrackWheelModels[7].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F); // Box 16
		rightTrackWheelModels[7].setRotationPoint(12F, 4.15F, -17.1F);

		rightTrackWheelModels[8].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F); // Box 17
		rightTrackWheelModels[8].setRotationPoint(12F, 4.15F, -17.1F);

		rightTrackWheelModels[9].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 18
		rightTrackWheelModels[9].setRotationPoint(-2F, 4.15F, -17.1F);

		rightTrackWheelModels[10].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 19
		rightTrackWheelModels[10].setRotationPoint(-2F, 4.15F, -17.1F);

		rightTrackWheelModels[11].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F); // Box 20
		rightTrackWheelModels[11].setRotationPoint(-2F, 4.15F, -17.1F);

		rightTrackWheelModels[12].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F); // Box 21
		rightTrackWheelModels[12].setRotationPoint(-2F, 4.15F, -17.1F);

		rightTrackWheelModels[13].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 22
		rightTrackWheelModels[13].setRotationPoint(-17F, 4.15F, -17.1F);

		rightTrackWheelModels[14].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 23
		rightTrackWheelModels[14].setRotationPoint(-17F, 4.15F, -17.1F);

		rightTrackWheelModels[15].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F); // Box 24
		rightTrackWheelModels[15].setRotationPoint(-17F, 4.15F, -17.1F);

		rightTrackWheelModels[16].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F, 3.8F, 2.9F, 0F, 3.8F, 2.9F, 0F, -4F, 3.7F, 0F); // Box 25
		rightTrackWheelModels[16].setRotationPoint(-17F, 4.15F, -17.1F);


		leftTrackModel = new ModelRendererTurbo[28];
		leftTrackModel[0] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 213
		leftTrackModel[1] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 215
		leftTrackModel[2] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 216
		leftTrackModel[3] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 217
		leftTrackModel[4] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 1
		leftTrackModel[5] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 2
		leftTrackModel[6] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 3
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 4
		leftTrackModel[8] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 5
		leftTrackModel[9] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 6
		leftTrackModel[10] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 7
		leftTrackModel[11] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 8
		leftTrackModel[12] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 9
		leftTrackModel[13] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 0
		leftTrackModel[14] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 4
		leftTrackModel[15] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 7
		leftTrackModel[16] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 8
		leftTrackModel[17] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 9
		leftTrackModel[18] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 10
		leftTrackModel[19] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 11
		leftTrackModel[20] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 12
		leftTrackModel[21] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 25
		leftTrackModel[22] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 27
		leftTrackModel[23] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 28
		leftTrackModel[24] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 30
		leftTrackModel[25] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 32
		leftTrackModel[26] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 33
		leftTrackModel[27] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 34

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 37, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 213
		leftTrackModel[0].setRotationPoint(-21F, 9F, 14F);

		leftTrackModel[1].addShapeBox(0F, -1F, 0F, 6, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 215
		leftTrackModel[1].setRotationPoint(29.5F, 6.5F, 14F);
		leftTrackModel[1].rotateAngleZ = 0.78539816F;

		leftTrackModel[2].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 216
		leftTrackModel[2].setRotationPoint(33.8F, 2.2F, 14F);
		leftTrackModel[2].rotateAngleZ = 1.57079633F;

		leftTrackModel[3].addShapeBox(0F, -1F, 0F, 14, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 217
		leftTrackModel[3].setRotationPoint(16F, 10F, 14F);
		leftTrackModel[3].rotateAngleZ = 0.24783675F;

		leftTrackModel[4].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 1
		leftTrackModel[4].setRotationPoint(33.8F, -1.8F, 14F);
		leftTrackModel[4].rotateAngleZ = 2.35619449F;

		leftTrackModel[5].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 2
		leftTrackModel[5].setRotationPoint(31F, -4.6F, 14F);
		leftTrackModel[5].rotateAngleZ = 3.14159265F;

		leftTrackModel[6].addShapeBox(0F, -1F, 0F, 17, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 3
		leftTrackModel[6].setRotationPoint(27F, -4.6F, 14F);
		leftTrackModel[6].rotateAngleZ = 3.17649924F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 4
		leftTrackModel[7].setRotationPoint(10F, -3F, 14F);
		leftTrackModel[7].rotateAngleZ = 2.98451302F;

		leftTrackModel[8].addShapeBox(0F, -1F, 0F, 40, 1, 6, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 5
		leftTrackModel[8].setRotationPoint(4.3F, -4.9F, 14F);
		leftTrackModel[8].rotateAngleZ = 3.16777259F;

		leftTrackModel[9].addShapeBox(0F, -1F, 0F, 3, 1, 6, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 6
		leftTrackModel[9].setRotationPoint(-36.2F, -3.9F, 14F);
		leftTrackModel[9].rotateAngleZ = 3.89208423F;

		leftTrackModel[10].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 7
		leftTrackModel[10].setRotationPoint(-38.8F, -1.5F, 14F);
		leftTrackModel[10].rotateAngleZ = 4.71238898F;

		leftTrackModel[11].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 8
		leftTrackModel[11].setRotationPoint(-38.8F, 3F, 14F);
		leftTrackModel[11].rotateAngleZ = 5.49778714F;

		leftTrackModel[12].addShapeBox(0F, -1F, 0F, 15, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 9
		leftTrackModel[12].setRotationPoint(-35.6F, 6.2F, 14F);
		leftTrackModel[12].rotateAngleZ = 6.03011257F;

		leftTrackModel[13].addBox(-9F, 0F, 0F, 9, 2, 1, 0F); // Box 0
		leftTrackModel[13].setRotationPoint(12F, 3F, 18F);
		leftTrackModel[13].rotateAngleZ = -0.43633231F;

		leftTrackModel[14].addShapeBox(-13F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 4
		leftTrackModel[14].setRotationPoint(12F, 4F, 18F);
		leftTrackModel[14].rotateAngleZ = -0.06981317F;

		leftTrackModel[15].addShapeBox(-9F, -2F, 0F, 5, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 7
		leftTrackModel[15].setRotationPoint(4.8F, -2F, 18F);
		leftTrackModel[15].rotateAngleZ = 0.83775804F;

		leftTrackModel[16].addShapeBox(-4F, -2F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 8
		leftTrackModel[16].setRotationPoint(4.8F, -2F, 18F);
		leftTrackModel[16].rotateAngleZ = 0.83775804F;

		leftTrackModel[17].addShapeBox(-9F, -2F, 0F, 5, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 9
		leftTrackModel[17].setRotationPoint(4.8F, -2F, 15F);
		leftTrackModel[17].rotateAngleZ = 0.83775804F;

		leftTrackModel[18].addShapeBox(-13F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 10
		leftTrackModel[18].setRotationPoint(12F, 4F, 15F);
		leftTrackModel[18].rotateAngleZ = -0.06981317F;

		leftTrackModel[19].addBox(-9F, 0F, 0F, 9, 2, 1, 0F); // Box 11
		leftTrackModel[19].setRotationPoint(12F, 3F, 15F);
		leftTrackModel[19].rotateAngleZ = -0.43633231F;

		leftTrackModel[20].addShapeBox(-4F, -2F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 12
		leftTrackModel[20].setRotationPoint(4.8F, -2F, 15F);
		leftTrackModel[20].rotateAngleZ = 0.83775804F;

		leftTrackModel[21].addShapeBox(-9F, -2F, 0F, 9, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 25
		leftTrackModel[21].setRotationPoint(-9.2F, 2F, 18F);
		leftTrackModel[21].rotateAngleZ = 0.40142573F;

		leftTrackModel[22].addShapeBox(-9F, -2F, 0F, 9, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 27
		leftTrackModel[22].setRotationPoint(-9.2F, 2F, 15F);
		leftTrackModel[22].rotateAngleZ = 0.40142573F;

		leftTrackModel[23].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftTrackModel[23].setRotationPoint(-17.2F, 4F, 18F);
		leftTrackModel[23].rotateAngleZ = 3.14159265F;

		leftTrackModel[24].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		leftTrackModel[24].setRotationPoint(-17.2F, 4F, 15F);
		leftTrackModel[24].rotateAngleZ = 3.14159265F;

		leftTrackModel[25].addShapeBox(-8F, 0F, 0F, 1, 6, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 32
		leftTrackModel[25].setRotationPoint(-17.2F, 5F, 18F);
		leftTrackModel[25].rotateAngleZ = 3.01941961F;

		leftTrackModel[26].addShapeBox(-8F, 0F, 0F, 1, 6, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 33
		leftTrackModel[26].setRotationPoint(-17.2F, 5F, 15F);
		leftTrackModel[26].rotateAngleZ = 3.01941961F;

		leftTrackModel[27].addShapeBox(-8F, 4F, -4F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackModel[27].setRotationPoint(-17.2F, 5F, 18F);
		leftTrackModel[27].rotateAngleZ = 3.01941961F;


		rightTrackModel = new ModelRendererTurbo[28];
		rightTrackModel[0] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 13
		rightTrackModel[1] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 15
		rightTrackModel[2] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 16
		rightTrackModel[3] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 17
		rightTrackModel[4] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 18
		rightTrackModel[5] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 19
		rightTrackModel[6] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 20
		rightTrackModel[7] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 21
		rightTrackModel[8] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 22
		rightTrackModel[9] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 23
		rightTrackModel[10] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 5
		rightTrackModel[11] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 6
		rightTrackModel[12] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 7
		rightTrackModel[13] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 14
		rightTrackModel[14] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 15
		rightTrackModel[15] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 16
		rightTrackModel[16] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 17
		rightTrackModel[17] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 19
		rightTrackModel[18] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 20
		rightTrackModel[19] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 21
		rightTrackModel[20] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 22
		rightTrackModel[21] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 35
		rightTrackModel[22] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 36
		rightTrackModel[23] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 37
		rightTrackModel[24] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 38
		rightTrackModel[25] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 39
		rightTrackModel[26] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 40
		rightTrackModel[27] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 42

		rightTrackModel[0].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
		rightTrackModel[0].setRotationPoint(33.8F, 2.2F, -20F);
		rightTrackModel[0].rotateAngleZ = 1.57079633F;

		rightTrackModel[1].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 15
		rightTrackModel[1].setRotationPoint(33.8F, -1.8F, -20F);
		rightTrackModel[1].rotateAngleZ = 2.35619449F;

		rightTrackModel[2].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 16
		rightTrackModel[2].setRotationPoint(31F, -4.6F, -20F);
		rightTrackModel[2].rotateAngleZ = 3.14159265F;

		rightTrackModel[3].addShapeBox(0F, -1F, 0F, 17, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 17
		rightTrackModel[3].setRotationPoint(27F, -4.6F, -20F);
		rightTrackModel[3].rotateAngleZ = 3.17649924F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 18
		rightTrackModel[4].setRotationPoint(10F, -3F, -20F);
		rightTrackModel[4].rotateAngleZ = 2.98451302F;

		rightTrackModel[5].addShapeBox(0F, -1F, 0F, 40, 1, 6, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 19
		rightTrackModel[5].setRotationPoint(4.3F, -4.9F, -20F);
		rightTrackModel[5].rotateAngleZ = 3.16777259F;

		rightTrackModel[6].addShapeBox(0F, -1F, 0F, 3, 1, 6, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 20
		rightTrackModel[6].setRotationPoint(-36.2F, -3.9F, -20F);
		rightTrackModel[6].rotateAngleZ = 3.89208423F;

		rightTrackModel[7].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 21
		rightTrackModel[7].setRotationPoint(-38.8F, -1.5F, -20F);
		rightTrackModel[7].rotateAngleZ = 4.71238898F;

		rightTrackModel[8].addShapeBox(0F, -1F, 0F, 4, 1, 6, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 22
		rightTrackModel[8].setRotationPoint(-38.8F, 3F, -20F);
		rightTrackModel[8].rotateAngleZ = 5.49778714F;

		rightTrackModel[9].addShapeBox(0F, -1F, 0F, 15, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 23
		rightTrackModel[9].setRotationPoint(-35.6F, 6.2F, -20F);
		rightTrackModel[9].rotateAngleZ = 6.03011257F;

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 37, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 5
		rightTrackModel[10].setRotationPoint(-21F, 9F, -20F);

		rightTrackModel[11].addShapeBox(0F, -1F, 0F, 6, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 6
		rightTrackModel[11].setRotationPoint(29.5F, 6.5F, -20F);
		rightTrackModel[11].rotateAngleZ = 0.78539816F;

		rightTrackModel[12].addShapeBox(0F, -1F, 0F, 14, 1, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 7
		rightTrackModel[12].setRotationPoint(16F, 10F, -20F);
		rightTrackModel[12].rotateAngleZ = 0.24783675F;

		rightTrackModel[13].addShapeBox(-13F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 14
		rightTrackModel[13].setRotationPoint(12F, 4F, -16F);
		rightTrackModel[13].rotateAngleZ = -0.06981317F;

		rightTrackModel[14].addBox(-9F, 0F, 0F, 9, 2, 1, 0F); // Box 15
		rightTrackModel[14].setRotationPoint(12F, 3F, -16F);
		rightTrackModel[14].rotateAngleZ = -0.43633231F;

		rightTrackModel[15].addShapeBox(-4F, -2F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 16
		rightTrackModel[15].setRotationPoint(4.8F, -2F, -16F);
		rightTrackModel[15].rotateAngleZ = 0.83775804F;

		rightTrackModel[16].addShapeBox(-9F, -2F, 0F, 5, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 17
		rightTrackModel[16].setRotationPoint(4.8F, -2F, -16F);
		rightTrackModel[16].rotateAngleZ = 0.83775804F;

		rightTrackModel[17].addBox(-9F, 0F, 0F, 9, 2, 1, 0F); // Box 19
		rightTrackModel[17].setRotationPoint(12F, 3F, -19F);
		rightTrackModel[17].rotateAngleZ = -0.43633231F;

		rightTrackModel[18].addShapeBox(-9F, -2F, 0F, 5, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 20
		rightTrackModel[18].setRotationPoint(4.8F, -2F, -19F);
		rightTrackModel[18].rotateAngleZ = 0.83775804F;

		rightTrackModel[19].addShapeBox(-13F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 21
		rightTrackModel[19].setRotationPoint(12F, 4F, -19F);
		rightTrackModel[19].rotateAngleZ = -0.06981317F;

		rightTrackModel[20].addShapeBox(-4F, -2F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 22
		rightTrackModel[20].setRotationPoint(4.8F, -2F, -19F);
		rightTrackModel[20].rotateAngleZ = 0.83775804F;

		rightTrackModel[21].addShapeBox(-9F, -2F, 0F, 9, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 35
		rightTrackModel[21].setRotationPoint(-9.2F, 2F, -16F);
		rightTrackModel[21].rotateAngleZ = 0.40142573F;

		rightTrackModel[22].addShapeBox(-9F, -2F, 0F, 9, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 36
		rightTrackModel[22].setRotationPoint(-9.2F, 2F, -19F);
		rightTrackModel[22].rotateAngleZ = 0.40142573F;

		rightTrackModel[23].addShapeBox(-8F, 0F, 0F, 1, 6, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 37
		rightTrackModel[23].setRotationPoint(-17.2F, 5F, -19F);
		rightTrackModel[23].rotateAngleZ = 3.01941961F;

		rightTrackModel[24].addShapeBox(-8F, 0F, 0F, 1, 6, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 38
		rightTrackModel[24].setRotationPoint(-17.2F, 5F, -16F);
		rightTrackModel[24].rotateAngleZ = 3.01941961F;

		rightTrackModel[25].addShapeBox(-8F, 4F, -4F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		rightTrackModel[25].setRotationPoint(-17.2F, 5F, -16F);
		rightTrackModel[25].rotateAngleZ = 3.01941961F;

		rightTrackModel[26].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		rightTrackModel[26].setRotationPoint(-17.2F, 4F, -16F);
		rightTrackModel[26].rotateAngleZ = 3.14159265F;

		rightTrackModel[27].addShapeBox(-8F, -1F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		rightTrackModel[27].setRotationPoint(-17.2F, 4F, -19F);
		rightTrackModel[27].rotateAngleZ = 3.14159265F;


		steeringWheelModel = new ModelRendererTurbo[6];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 171
		steeringWheelModel[1] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 175
		steeringWheelModel[2] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 176
		steeringWheelModel[3] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 177
		steeringWheelModel[4] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 178
		steeringWheelModel[5] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 180

		steeringWheelModel[0].addBox(-0.5F, -2.5F, 3F, 1, 6, 1, 0F); // Box 171
		steeringWheelModel[0].setRotationPoint(21.2F, -11.5F, -7F);

		steeringWheelModel[1].addBox(-0.5F, -2.5F, -4F, 1, 6, 1, 0F); // Box 175
		steeringWheelModel[1].setRotationPoint(21.2F, -11.5F, -7F);

		steeringWheelModel[2].addShapeBox(-0.5F, -3.5F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 176
		steeringWheelModel[2].setRotationPoint(21.2F, -11.5F, -7F);

		steeringWheelModel[3].addShapeBox(-0.5F, 3.5F, -3F, 1, 1, 6, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		steeringWheelModel[3].setRotationPoint(21.2F, -11.5F, -7F);

		steeringWheelModel[4].addShapeBox(-0.5F, 0.5F, -0.5F, 1, 3, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 178
		steeringWheelModel[4].setRotationPoint(21.2F, -11.5F, -7F);

		steeringWheelModel[5].addShapeBox(-0.5F, -0.5F, -3F, 1, 1, 6, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 180
		steeringWheelModel[5].setRotationPoint(21.2F, -11.5F, -7F);


		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[35];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 1, 181, textureX, textureY); // Box 0
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 25, 181, textureX, textureY); // Box 1
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 41, 181, textureX, textureY); // Box 2
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 3
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 25, 189, textureX, textureY); // Box 4
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 49, 181, textureX, textureY); // Box 5
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 57, 181, textureX, textureY); // Box 6
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 49, 189, textureX, textureY); // Box 7
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 1, 197, textureX, textureY); // Box 8
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 17, 197, textureX, textureY); // Box 9
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 33, 197, textureX, textureY); // Box 10
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 49, 197, textureX, textureY); // Box 11
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 57, 197, textureX, textureY); // Box 12
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 1, 205, textureX, textureY); // Box 13
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 14
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 17, 205, textureX, textureY); // Box 15
		gun_1_Model[1][16] = new ModelRendererTurbo(this, 25, 205, textureX, textureY); // Box 16
		gun_1_Model[1][17] = new ModelRendererTurbo(this, 33, 205, textureX, textureY); // Box 17
		gun_1_Model[1][18] = new ModelRendererTurbo(this, 41, 205, textureX, textureY); // Box 18
		gun_1_Model[1][19] = new ModelRendererTurbo(this, 49, 205, textureX, textureY); // Box 19
		gun_1_Model[1][20] = new ModelRendererTurbo(this, 57, 205, textureX, textureY); // Box 20
		gun_1_Model[1][21] = new ModelRendererTurbo(this, 1, 213, textureX, textureY); // Box 21
		gun_1_Model[1][22] = new ModelRendererTurbo(this, 9, 213, textureX, textureY); // Box 22
		gun_1_Model[1][23] = new ModelRendererTurbo(this, 17, 213, textureX, textureY); // Box 23
		gun_1_Model[1][24] = new ModelRendererTurbo(this, 25, 213, textureX, textureY); // Box 24
		gun_1_Model[1][25] = new ModelRendererTurbo(this, 33, 213, textureX, textureY); // Box 25
		gun_1_Model[1][26] = new ModelRendererTurbo(this, 41, 213, textureX, textureY); // Box 26
		gun_1_Model[1][27] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 27
		gun_1_Model[1][28] = new ModelRendererTurbo(this, 1, 221, textureX, textureY); // Box 28
		gun_1_Model[1][29] = new ModelRendererTurbo(this, 17, 221, textureX, textureY); // Box 29
		gun_1_Model[1][30] = new ModelRendererTurbo(this, 33, 221, textureX, textureY); // Box 30
		gun_1_Model[1][31] = new ModelRendererTurbo(this, 57, 213, textureX, textureY); // Box 31
		gun_1_Model[1][32] = new ModelRendererTurbo(this, 49, 221, textureX, textureY); // Box 32
		gun_1_Model[1][33] = new ModelRendererTurbo(this, 57, 221, textureX, textureY); // Box 33
		gun_1_Model[1][34] = new ModelRendererTurbo(this, 34, 202, textureX, textureY); // Box 0

		gun_1_Model[1][0].addShapeBox(-1F, -2F, -1F, 10, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 0

		gun_1_Model[1][1].addShapeBox(9F, -2F, -1F, 4, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Box 1

		gun_1_Model[1][2].addShapeBox(2F, -2F, -1F, 1, 1, 1, 0F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F); // Box 2

		gun_1_Model[1][3].addShapeBox(-8F, -2F, -1F, 7, 2, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F); // Box 3

		gun_1_Model[1][4].addShapeBox(-1.8F, -1.2F, -1F, 9, 1, 1, 0F, 0.01F, -0.3F, -0.3F, 0.01F, -0.3F, -0.3F, 0.01F, -0.3F, -0.3F, 0.01F, -0.3F, -0.3F, 0.01F, 0F, -0.3F, 0.01F, 0F, -0.3F, 0.01F, 0F, -0.3F, 0.01F, 0F, -0.3F); // Box 4

		gun_1_Model[1][5].addShapeBox(6F, -2F, -1F, 1, 1, 1, 0F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F); // Box 5

		gun_1_Model[1][6].addShapeBox(6F, -1.2F, -1F, 1, 1, 1, 0F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F); // Box 6

		gun_1_Model[1][7].addShapeBox(-7F, -2F, -1F, 5, 1, 1, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_1_Model[1][8].addShapeBox(-6F, -3.1F, -1F, 3, 1, 1, 0F, -0.1F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.1F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F); // Box 8

		gun_1_Model[1][9].addShapeBox(-5.9F, -4.6F, -1F, 3, 1, 1, 0F, -0.3F, 0.5F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, -0.3F, 0.5F, -0.2F, 0F, 0F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, 0F, 0F, -0.2F); // Box 9

		gun_1_Model[1][10].addShapeBox(-5.6F, -6.1F, -1F, 3, 1, 1, 0F, -0.8F, 0.5F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, -0.8F, 0.5F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, 0F, 0F, -0.2F); // Box 10

		gun_1_Model[1][11].addShapeBox(-10F, -2F, -1F, 2, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_1_Model[1][12].addShapeBox(-11F, -2F, -1F, 1, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_1_Model[1][13].addShapeBox(-13F, -1F, -1F, 2, 1, 1, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 13

		gun_1_Model[1][14].addShapeBox(-14F, -1F, -1F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 14

		gun_1_Model[1][15].addShapeBox(-15F, -1F, -1F, 1, 1, 1, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F); // Box 15

		gun_1_Model[1][16].addShapeBox(-8F, 0F, -1F, 1, 3, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F); // Box 16

		gun_1_Model[1][17].addShapeBox(-7.5F, -0.2F, -1F, 2, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 17

		gun_1_Model[1][18].addShapeBox(9F, -2F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18

		gun_1_Model[1][19].addShapeBox(9F, -3F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 19

		gun_1_Model[1][20].addShapeBox(9F, -3F, 0.4F, 1, 1, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 20

		gun_1_Model[1][21].addShapeBox(9F, -3F, -0.4F, 1, 1, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 21

		gun_1_Model[1][22].addShapeBox(9F, -3F, 0F, 1, 1, 1, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22

		gun_1_Model[1][23].addShapeBox(-4F, -3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 23

		gun_1_Model[1][24].addShapeBox(-4F, -3F, 0.5F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 24

		gun_1_Model[1][25].addShapeBox(-4F, -3F, -0.5F, 1, 1, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 25

		gun_1_Model[1][26].addShapeBox(-4F, -2.2F, -0.5F, 1, 1, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 26

		gun_1_Model[1][27].addShapeBox(2F, -2F, -0.2F, 1, 1, 2, 0F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, 0.6F, -0.1F, 0.2F, 0.6F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -1.4F, -0.1F, 0.2F, -1.4F, -0.1F); // Box 27

		gun_1_Model[1][28].addShapeBox(1F, -3F, 1.6F, 3, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 28

		gun_1_Model[1][29].addShapeBox(5.2F, -0.5F, -1F, 6, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -1.3F, -2.3F, 0F, -1.3F, 1.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -2.3F, 0F, 0.7F, 1.7F, 0F, -0.3F, -0.3F); // Box 29

		gun_1_Model[1][30].addShapeBox(5.2F, -0.5F, -1F, 6, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -1.3F, 1.7F, 0F, -1.3F, -2.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, 1.7F, 0F, 0.7F, -2.3F, 0F, -0.3F, -0.3F); // Box 30

		gun_1_Model[1][31].addShapeBox(5F, -0.5F, -1F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 31

		gun_1_Model[1][32].addShapeBox(11F, 0.5F, 1F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 32

		gun_1_Model[1][33].addShapeBox(11F, 0.5F, -3F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 33

		gun_1_Model[1][34].addShapeBox(-7F, -0.5F, -1F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 0

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(27F, -13F, 7F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[29];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1, 231, textureX, textureY); // Box 0
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 33, 231, textureX, textureY); // Box 1
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 65, 231, textureX, textureY); // Box 4
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 5
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 97, 239, textureX, textureY); // Box 15
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 1, 247, textureX, textureY); // Box 16
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 33, 247, textureX, textureY); // Box 18
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 49, 247, textureX, textureY); // Box 54
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 57, 247, textureX, textureY); // Box 55
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 65, 247, textureX, textureY); // Box 56
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 73, 247, textureX, textureY); // Box 67
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 81, 247, textureX, textureY); // Box 68
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 89, 247, textureX, textureY); // Box 69
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 97, 247, textureX, textureY); // Box 70
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 105, 247, textureX, textureY); // Box 71
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 113, 247, textureX, textureY); // Box 72
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 73
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 41, 247, textureX, textureY); // Box 74
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 1, 255, textureX, textureY); // Box 75
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 17, 255, textureX, textureY); // Box 77
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 25, 255, textureX, textureY); // Box 78
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 17, 271, textureX, textureY); // Box 100
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 33, 271, textureX, textureY); // Box 101
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 49, 271, textureX, textureY); // Box 102
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 65, 271, textureX, textureY); // Box 103
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 81, 271, textureX, textureY); // Box 1
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 97, 271, textureX, textureY); // Box 2
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 113, 271, textureX, textureY); // Box 3
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 1, 279, textureX, textureY); // Box 4

		gun_2_Model[0][0].addShapeBox(-6F, 5F, -5.5F, 12, 1, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[0][1].addBox(-6F, 5F, -2.5F, 12, 1, 5, 0F); // Box 1

		gun_2_Model[0][2].addShapeBox(-6F, 4F, -5.5F, 12, 1, 3, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4

		gun_2_Model[0][3].addShapeBox(-6F, 4F, -2.5F, 12, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5

		gun_2_Model[0][4].addShapeBox(-6F, 5F, 2.5F, 12, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 15

		gun_2_Model[0][5].addShapeBox(-6F, 4F, 2.5F, 12, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 16

		gun_2_Model[0][6].addShapeBox(6.2F, -6.5F, 7.7F, 1, 12, 3, 0F, 3.4F, -0.7F, 0F, -4F, -0.7F, 0F, -6.3F, -0.7F, 2F, 5.7F, -0.7F, 2F, -0.6F, -0.3F, 6.2F, 0F, -0.3F, 6.2F, -6.3F, -0.3F, 2F, 5.7F, -0.3F, 2F); // Box 18

		gun_2_Model[0][7].addShapeBox(2.2F, -6.8F, 2.3F, 1, 1, 2, 0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 54

		gun_2_Model[0][8].addShapeBox(2.2F, -6.8F, 4.3F, 1, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 55

		gun_2_Model[0][9].addShapeBox(2.2F, -6.8F, 6.3F, 1, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 56

		gun_2_Model[0][10].addShapeBox(2.2F, -6.8F, 1F, 1, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 67

		gun_2_Model[0][11].addShapeBox(2.2F, -6.8F, -1F, 1, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 68

		gun_2_Model[0][12].addShapeBox(2.2F, -6.8F, -3F, 1, 1, 2, 0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 69

		gun_2_Model[0][13].addShapeBox(2.2F, -6.8F, -8.3F, 1, 1, 2, 0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 70

		gun_2_Model[0][14].addShapeBox(2.2F, -6.8F, -6.3F, 1, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 71

		gun_2_Model[0][15].addShapeBox(2.2F, -6.8F, -4.3F, 1, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 72

		gun_2_Model[0][16].addShapeBox(2.2F, -6.8F, -3.15F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.6F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.6F, 0F, -0.25F); // Box 73

		gun_2_Model[0][17].addShapeBox(2.2F, -6.8F, 2.15F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.6F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.6F, 0F, -0.25F); // Box 74

		gun_2_Model[0][18].addShapeBox(6.5F, -5.8F, 1.5F, 1, 11, 6, 0F, 3.7F, 0F, 0.2F, -4.3F, 0F, 0.2F, -4.3F, 0F, 0.2F, 3.7F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, -6F, -0.3F, 0F, -6F); // Box 75

		gun_2_Model[0][19].addShapeBox(6.5F, -5.8F, -1F, 1, 3, 2, 0F, 3.7F, 0F, 0.3F, -4.3F, 0F, 0.3F, -4.3F, 0F, 0.3F, 3.7F, 0F, 0.3F, 2.6F, 0F, 0.3F, -3.2F, 0F, 0.3F, -3.2F, 0F, 0.3F, 2.6F, 0F, 0.3F); // Box 77

		gun_2_Model[0][20].addShapeBox(9.5F, 3.2F, -1F, 1, 2, 2, 0F, 3.45F, 0F, 0.3F, -4F, 0F, 0.3F, -4F, 0F, 0.3F, 3.45F, 0F, 0.3F, 2.7F, 0F, 0.3F, -3.3F, 0F, 0.3F, -3.3F, 0F, 0.3F, 2.7F, 0F, 0.3F); // Box 78

		gun_2_Model[0][21].addShapeBox(-3F, -1F, -3.6F, 6, 2, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100

		gun_2_Model[0][22].addShapeBox(-3F, -1F, 2.6F, 6, 2, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101

		gun_2_Model[0][23].addShapeBox(-3F, 1F, 2.6F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102

		gun_2_Model[0][24].addShapeBox(-3F, 1F, -3.6F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103

		gun_2_Model[0][25].addShapeBox(6.2F, -6.5F, -10.7F, 1, 12, 3, 0F, 5.7F, -0.78F, 2F, -6.3F, -0.7F, 2F, -4F, -0.7F, 0F, 3.4F, -0.7F, 0F, 5.7F, -0.3F, 2F, -6.3F, -0.3F, 2F, 0F, -0.3F, 6.2F, -0.6F, -0.3F, 6.2F); // Box 1

		gun_2_Model[0][26].addShapeBox(6.5F, -5.8F, -7.5F, 1, 11, 6, 0F, 3.7F, 0F, 0.2F, -4.3F, 0F, 0.2F, -4.3F, 0F, 0.2F, 3.7F, 0F, 0.2F, -0.3F, 0F, -6F, -0.3F, 0F, -6F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F); // Box 2

		gun_2_Model[0][27].addShapeBox(6.2F, -7.3F, 7.7F, 1, 2, 3, 0F, 3.7F, -0.8F, 0F, -4.3F, -0.8F, 0F, -6.3F, -0.8F, 2F, 5.7F, -0.8F, 2F, 3.4F, -0.5F, 0F, -4F, -0.5F, 0F, -6.3F, -0.5F, 2F, 5.7F, -0.5F, 2F); // Box 3

		gun_2_Model[0][28].addShapeBox(6.2F, -7.3F, -10.7F, 1, 2, 3, 0F, 5.7F, -0.8F, 2F, -6.3F, -0.8F, 2F, -4.3F, -0.8F, 0F, 3.7F, -0.8F, 0F, 5.7F, -0.5F, 2F, -6.3F, -0.5F, 2F, -4F, -0.5F, 0F, 3.4F, -0.5F, 0F); // Box 4

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(0F, -26F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[18];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 97, 231, textureX, textureY); // Box 9
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 113, 231, textureX, textureY); // Box 10
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 33, 239, textureX, textureY); // Box 11
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 33, 231, textureX, textureY); // Box 12
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 49, 239, textureX, textureY); // Box 13
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 65, 239, textureX, textureY); // Box 14
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 121, 247, textureX, textureY); // Box 76
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 49, 255, textureX, textureY); // Box 81
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 65, 255, textureX, textureY); // Box 82
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 81, 255, textureX, textureY); // Box 90
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 97, 255, textureX, textureY); // Box 91
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 113, 255, textureX, textureY); // Box 94
		gun_2_Model[1][12] = new ModelRendererTurbo(this, 17, 263, textureX, textureY); // Box 95
		gun_2_Model[1][13] = new ModelRendererTurbo(this, 41, 263, textureX, textureY); // Box 96
		gun_2_Model[1][14] = new ModelRendererTurbo(this, 121, 255, textureX, textureY); // Box 97
		gun_2_Model[1][15] = new ModelRendererTurbo(this, 65, 263, textureX, textureY); // Box 98
		gun_2_Model[1][16] = new ModelRendererTurbo(this, 97, 263, textureX, textureY); // Box 99
		gun_2_Model[1][17] = new ModelRendererTurbo(this, 113, 263, textureX, textureY); // Box 104

		gun_2_Model[1][0].addShapeBox(-5.5F, -1.8F, -1F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_2_Model[1][1].addShapeBox(-9.5F, -0.8F, -1F, 4, 1, 2, 0F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 10

		gun_2_Model[1][2].addShapeBox(-9.5F, -1.8F, -0.3F, 5, 2, 2, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_2_Model[1][3].addShapeBox(-5.5F, -1.8F, 0.7F, 1, 2, 1, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F); // Box 12

		gun_2_Model[1][4].addShapeBox(-0.5F, -1.8F, -1F, 4, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 13

		gun_2_Model[1][5].addShapeBox(13.5F, -1.8F, -1F, 12, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F); // Box 14

		gun_2_Model[1][6].addShapeBox(25.5F, -1.8F, -1F, 1, 2, 2, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 76

		gun_2_Model[1][7].addShapeBox(-9.5F, -2F, -1F, 4, 2, 1, 0F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 81

		gun_2_Model[1][8].addShapeBox(-9.5F, -2F, 0.7F, 4, 2, 1, 0F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 82

		gun_2_Model[1][9].addShapeBox(-2.5F, -2F, -1.5F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 90

		gun_2_Model[1][10].addShapeBox(-2.5F, -3F, -0.5F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 91

		gun_2_Model[1][11].addShapeBox(12.5F, -1.8F, -1F, 1, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F); // Box 94

		gun_2_Model[1][12].addShapeBox(3.5F, -1.8F, -1F, 9, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 95

		gun_2_Model[1][13].addShapeBox(6.5F, 0.2F, -1F, 7, 1, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 96

		gun_2_Model[1][14].addShapeBox(6.5F, -1.8F, -1F, 1, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F); // Box 97

		gun_2_Model[1][15].addShapeBox(-0.5F, 1F, -0.5F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98

		gun_2_Model[1][16].addShapeBox(-2.5F, 1F, -1.5F, 5, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99

		gun_2_Model[1][17].addShapeBox(-1F, -1F, -2.5F, 2, 2, 5, 0F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 104

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(0F, -26F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
