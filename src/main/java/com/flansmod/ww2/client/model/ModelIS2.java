//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelIS2 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelIS2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[284];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 69
		bodyModel[15] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 70
		bodyModel[16] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 7
		bodyModel[19] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 8
		bodyModel[20] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 9
		bodyModel[21] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 125
		bodyModel[22] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 3
		bodyModel[26] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 5
		bodyModel[28] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 13
		bodyModel[29] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 14
		bodyModel[30] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 15
		bodyModel[31] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 16
		bodyModel[32] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 64
		bodyModel[35] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 69
		bodyModel[36] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 70
		bodyModel[37] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 71
		bodyModel[38] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 72
		bodyModel[39] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 73
		bodyModel[40] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 74
		bodyModel[41] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 76
		bodyModel[42] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 58
		bodyModel[43] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 335, 386, textureX, textureY); // Box 85
		bodyModel[45] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 86
		bodyModel[46] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 35
		bodyModel[47] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 36
		bodyModel[48] = new ModelRendererTurbo(this, 335, 386, textureX, textureY); // Box 37
		bodyModel[49] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 38
		bodyModel[50] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 39
		bodyModel[51] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 40
		bodyModel[52] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 41
		bodyModel[53] = new ModelRendererTurbo(this, 335, 386, textureX, textureY); // Box 42
		bodyModel[54] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 43
		bodyModel[55] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 44
		bodyModel[56] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 45
		bodyModel[57] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 46
		bodyModel[58] = new ModelRendererTurbo(this, 335, 386, textureX, textureY); // Box 47
		bodyModel[59] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 48
		bodyModel[60] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 49
		bodyModel[61] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 50
		bodyModel[62] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 51
		bodyModel[63] = new ModelRendererTurbo(this, 335, 386, textureX, textureY); // Box 52
		bodyModel[64] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 53
		bodyModel[65] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 54
		bodyModel[66] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 55
		bodyModel[67] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 56
		bodyModel[68] = new ModelRendererTurbo(this, 335, 386, textureX, textureY); // Box 57
		bodyModel[69] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 58
		bodyModel[70] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 59
		bodyModel[71] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 60
		bodyModel[72] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 61
		bodyModel[73] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 62
		bodyModel[74] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 63
		bodyModel[75] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 64
		bodyModel[76] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 65
		bodyModel[77] = new ModelRendererTurbo(this, 335, 385, textureX, textureY); // Box 66
		bodyModel[78] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 67
		bodyModel[79] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 68
		bodyModel[80] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 69
		bodyModel[81] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 70
		bodyModel[82] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 71
		bodyModel[83] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 72
		bodyModel[84] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 73
		bodyModel[85] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 74
		bodyModel[86] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 75
		bodyModel[87] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 76
		bodyModel[88] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 77
		bodyModel[89] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 78
		bodyModel[90] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 79
		bodyModel[91] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 80
		bodyModel[92] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 81
		bodyModel[93] = new ModelRendererTurbo(this, 335, 385, textureX, textureY); // Box 82
		bodyModel[94] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 83
		bodyModel[95] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 84
		bodyModel[96] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 85
		bodyModel[97] = new ModelRendererTurbo(this, 361, 339, textureX, textureY); // Box 86
		bodyModel[98] = new ModelRendererTurbo(this, 335, 385, textureX, textureY); // Box 87
		bodyModel[99] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 88
		bodyModel[100] = new ModelRendererTurbo(this, 299, 252, textureX, textureY); // Box 89
		bodyModel[101] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Shape 90
		bodyModel[102] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 91
		bodyModel[103] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 92
		bodyModel[104] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 93
		bodyModel[105] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 94
		bodyModel[106] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 95
		bodyModel[107] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 96
		bodyModel[108] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 97
		bodyModel[109] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 98
		bodyModel[110] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 99
		bodyModel[111] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 100
		bodyModel[112] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 101
		bodyModel[113] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 102
		bodyModel[114] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 103
		bodyModel[115] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 104
		bodyModel[116] = new ModelRendererTurbo(this, 335, 339, textureX, textureY); // Box 105
		bodyModel[117] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 134
		bodyModel[118] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 135
		bodyModel[119] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 136
		bodyModel[120] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 142
		bodyModel[126] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 143
		bodyModel[127] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 144
		bodyModel[128] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 153
		bodyModel[130] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 154
		bodyModel[131] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 155
		bodyModel[132] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 156
		bodyModel[133] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 157
		bodyModel[134] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 162
		bodyModel[135] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 163
		bodyModel[136] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 164
		bodyModel[137] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 165
		bodyModel[138] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 166
		bodyModel[139] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 167
		bodyModel[140] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 168
		bodyModel[141] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 169
		bodyModel[142] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 170
		bodyModel[143] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 171
		bodyModel[144] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 172
		bodyModel[145] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 173
		bodyModel[146] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 174
		bodyModel[147] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 175
		bodyModel[148] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 176
		bodyModel[149] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 177
		bodyModel[150] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 178
		bodyModel[151] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 179
		bodyModel[152] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 180
		bodyModel[153] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 181
		bodyModel[154] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 182
		bodyModel[155] = new ModelRendererTurbo(this, 52, 65, textureX, textureY); // Box 392
		bodyModel[156] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 393
		bodyModel[157] = new ModelRendererTurbo(this, 51, 81, textureX, textureY); // Box 394
		bodyModel[158] = new ModelRendererTurbo(this, 118, 287, textureX, textureY); // Box 404
		bodyModel[159] = new ModelRendererTurbo(this, 74, 287, textureX, textureY); // Box 405
		bodyModel[160] = new ModelRendererTurbo(this, 74, 287, textureX, textureY); // Box 406
		bodyModel[161] = new ModelRendererTurbo(this, 84, 287, textureX, textureY); // Box 407
		bodyModel[162] = new ModelRendererTurbo(this, 74, 287, textureX, textureY); // Box 408
		bodyModel[163] = new ModelRendererTurbo(this, 84, 287, textureX, textureY); // Box 409
		bodyModel[164] = new ModelRendererTurbo(this, 74, 287, textureX, textureY); // Box 410
		bodyModel[165] = new ModelRendererTurbo(this, 84, 287, textureX, textureY); // Box 411
		bodyModel[166] = new ModelRendererTurbo(this, 118, 287, textureX, textureY); // Box 412
		bodyModel[167] = new ModelRendererTurbo(this, 84, 287, textureX, textureY); // Box 413
		bodyModel[168] = new ModelRendererTurbo(this, 52, 65, textureX, textureY); // Box 199
		bodyModel[169] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 200
		bodyModel[170] = new ModelRendererTurbo(this, 51, 81, textureX, textureY); // Box 201
		bodyModel[171] = new ModelRendererTurbo(this, 50, 64, textureX, textureY); // Box 202
		bodyModel[172] = new ModelRendererTurbo(this, 50, 64, textureX, textureY); // Box 203
		bodyModel[173] = new ModelRendererTurbo(this, 250, 271, textureX, textureY); // Box 1
		bodyModel[174] = new ModelRendererTurbo(this, 252, 274, textureX, textureY); // Box 2
		bodyModel[175] = new ModelRendererTurbo(this, 249, 271, textureX, textureY); // Box 3
		bodyModel[176] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 287
		bodyModel[177] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 289
		bodyModel[178] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 31
		bodyModel[179] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 32
		bodyModel[180] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 33
		bodyModel[181] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 34
		bodyModel[182] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 0
		bodyModel[183] = new ModelRendererTurbo(this, 250, 271, textureX, textureY); // Box 228
		bodyModel[184] = new ModelRendererTurbo(this, 252, 274, textureX, textureY); // Box 229
		bodyModel[185] = new ModelRendererTurbo(this, 249, 271, textureX, textureY); // Box 230
		bodyModel[186] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 232
		bodyModel[187] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 233
		bodyModel[188] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 234
		bodyModel[189] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 235
		bodyModel[190] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 236
		bodyModel[191] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 237
		bodyModel[192] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 239
		bodyModel[193] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 240
		bodyModel[194] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 241
		bodyModel[195] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 242
		bodyModel[196] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 243
		bodyModel[197] = new ModelRendererTurbo(this, 116, 455, textureX, textureY); // Box 15
		bodyModel[198] = new ModelRendererTurbo(this, 93, 479, textureX, textureY); // Box 15
		bodyModel[199] = new ModelRendererTurbo(this, 116, 455, textureX, textureY); // Box 9
		bodyModel[200] = new ModelRendererTurbo(this, 93, 479, textureX, textureY); // Box 10
		bodyModel[201] = new ModelRendererTurbo(this, 116, 455, textureX, textureY); // Box 11
		bodyModel[202] = new ModelRendererTurbo(this, 143, 479, textureX, textureY); // Box 13
		bodyModel[203] = new ModelRendererTurbo(this, 116, 455, textureX, textureY); // Box 17
		bodyModel[204] = new ModelRendererTurbo(this, 116, 455, textureX, textureY); // Box 18
		bodyModel[205] = new ModelRendererTurbo(this, 116, 455, textureX, textureY); // Box 19
		bodyModel[206] = new ModelRendererTurbo(this, 99, 469, textureX, textureY); // Box 20
		bodyModel[207] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 21
		bodyModel[208] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 22
		bodyModel[209] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 23
		bodyModel[210] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 24
		bodyModel[211] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 25
		bodyModel[212] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
		bodyModel[213] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 27
		bodyModel[214] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 28
		bodyModel[215] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 29
		bodyModel[216] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 30
		bodyModel[217] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 31
		bodyModel[218] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 32
		bodyModel[219] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 155
		bodyModel[220] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 156
		bodyModel[221] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 157
		bodyModel[222] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 158
		bodyModel[223] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 159
		bodyModel[224] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 160
		bodyModel[225] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 161
		bodyModel[226] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 167
		bodyModel[227] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 168
		bodyModel[228] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 169
		bodyModel[229] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 53
		bodyModel[230] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 54
		bodyModel[231] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 55
		bodyModel[232] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 82
		bodyModel[233] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 83
		bodyModel[234] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 84
		bodyModel[235] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 85
		bodyModel[236] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 86
		bodyModel[237] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 87
		bodyModel[238] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 88
		bodyModel[239] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 89
		bodyModel[240] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 90
		bodyModel[241] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 91
		bodyModel[242] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 92
		bodyModel[243] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 93
		bodyModel[244] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 94
		bodyModel[245] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 95
		bodyModel[246] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 96
		bodyModel[247] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 97
		bodyModel[248] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 98
		bodyModel[249] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 99
		bodyModel[250] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 100
		bodyModel[251] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 101
		bodyModel[252] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 102
		bodyModel[253] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 103
		bodyModel[254] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 104
		bodyModel[255] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 105
		bodyModel[256] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 106
		bodyModel[257] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 107
		bodyModel[258] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 108
		bodyModel[259] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 109
		bodyModel[260] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 110
		bodyModel[261] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 111
		bodyModel[262] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 0
		bodyModel[263] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 1
		bodyModel[264] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 2
		bodyModel[265] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 3
		bodyModel[266] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 4
		bodyModel[267] = new ModelRendererTurbo(this, 99, 497, textureX, textureY); // Box 44
		bodyModel[268] = new ModelRendererTurbo(this, 99, 497, textureX, textureY); // Box 45
		bodyModel[269] = new ModelRendererTurbo(this, 99, 497, textureX, textureY); // Box 46
		bodyModel[270] = new ModelRendererTurbo(this, 99, 497, textureX, textureY); // Box 47
		bodyModel[271] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 48
		bodyModel[272] = new ModelRendererTurbo(this, 335, 385, textureX, textureY); // Box 0
		bodyModel[273] = new ModelRendererTurbo(this, 335, 385, textureX, textureY); // Box 1
		bodyModel[274] = new ModelRendererTurbo(this, 335, 385, textureX, textureY); // Box 2
		bodyModel[275] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 3
		bodyModel[276] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 4
		bodyModel[277] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 5
		bodyModel[278] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 6
		bodyModel[279] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[280] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 1
		bodyModel[281] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 2
		bodyModel[282] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 3
		bodyModel[283] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 4

		bodyModel[0].addShapeBox(0F, 0F, 0F, 73, 8, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 8F, 0F, 5F); // Box 0
		bodyModel[0].setRotationPoint(-58F, -19.5F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 88, 10, 30, 0F, 10F, 0F, 0F, 10F, -2F, 0F, 10F, -2F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-56F, -11.5F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 8, 18, 0F, 0F, 0F, 10F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 15F, 10F, 2F, 5.55F, 10F, 2F, 5.55F, 0F, 0F, 15F); // Box 2
		bodyModel[2].setRotationPoint(15F, -19.5F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 103, 1, 14, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-66F, -13.5F, 14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-69F, -13.5F, 14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(37F, -13.5F, 14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(37F, -13.5F, -28F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 103, 1, 14, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-66F, -13.5F, -28F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-69F, -13.5F, -28F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(14F, -13.5F, 19.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 17, 7, 3, 0F); // Box 20
		bodyModel[10].setRotationPoint(-39F, -20.5F, 24F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-39F, -20.5F, 27F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[12].setRotationPoint(-58F, -20.5F, 27F);

		bodyModel[13].addBox(0F, 0F, 0F, 17, 7, 3, 0F); // Box 18
		bodyModel[13].setRotationPoint(-58F, -20.5F, 24F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[14].setRotationPoint(-58F, -20.5F, 22F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[15].setRotationPoint(-39F, -20.5F, 22F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F, 0F, 0.3F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(25.5F, -18F, -7F);
		bodyModel[16].rotateAngleZ = -0.4712389F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[17].setRotationPoint(41F, -11.5F, 14F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[18].setRotationPoint(41F, -11.5F, -28F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 8
		bodyModel[19].setRotationPoint(-70F, -11.5F, -28F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 9
		bodyModel[20].setRotationPoint(-70F, -11.5F, 14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 24, 0F, 9F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 9F, 0F, -12F, 10F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 5F, 10F, 0F, 5F); // Box 125
		bodyModel[21].setRotationPoint(-47F, -21F, -12F);

		bodyModel[22].addBox(0F, 0F, 0F, 17, 7, 3, 0F); // Box 0
		bodyModel[22].setRotationPoint(-39F, -20.5F, -27F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[23].setRotationPoint(-39F, -20.5F, -29F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[24].setRotationPoint(-58F, -20.5F, -29F);

		bodyModel[25].addBox(0F, 0F, 0F, 17, 7, 3, 0F); // Box 3
		bodyModel[25].setRotationPoint(-58F, -20.5F, -27F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 4
		bodyModel[26].setRotationPoint(-58F, -20.5F, -24F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[27].setRotationPoint(-39F, -20.5F, -24F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[28].setRotationPoint(-43F, -15.5F, -23F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[29].setRotationPoint(-57F, -15.5F, -23F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[30].setRotationPoint(-38F, -15.5F, -23F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[31].setRotationPoint(-24F, -15.5F, -23F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 61
		bodyModel[32].setRotationPoint(41F, -10.5F, 27F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 63
		bodyModel[33].setRotationPoint(41F, -10.5F, -28F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 64
		bodyModel[34].setRotationPoint(37F, -12.5F, -28F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 69
		bodyModel[35].setRotationPoint(-70F, -10.5F, 27F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 95, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[36].setRotationPoint(-62F, -12.5F, -28F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 71
		bodyModel[37].setRotationPoint(33F, -9.5F, -28F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[38].setRotationPoint(-66F, -9.5F, -28F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 73
		bodyModel[39].setRotationPoint(-69F, -12.5F, -28F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 74
		bodyModel[40].setRotationPoint(-70F, -10.5F, -28F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 17, 4, 18, 0F, -7F, 0F, 0F, -6F, 0F, 2F, -6F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 15F, 10F, 2F, 6F, 10F, 2F, 6F, 0F, 0F, 15F); // Box 76
		bodyModel[41].setRotationPoint(15F, -15.5F, -9F);

		bodyModel[42].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 58
		bodyModel[42].setRotationPoint(22F, 0.5F, -17F);
		bodyModel[42].rotateAngleZ = 3.14159265F;

		bodyModel[43].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 59
		bodyModel[43].setRotationPoint(22F, 0F, -16F);
		bodyModel[43].rotateAngleZ = 2.53072742F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[44].setRotationPoint(17.5F, -10.5F, -18F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[45].setRotationPoint(18F, -6.5F, -17F);
		bodyModel[45].rotateAngleZ = 0.29670597F;

		bodyModel[46].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 35
		bodyModel[46].setRotationPoint(26F, -6F, -17F);
		bodyModel[46].rotateAngleZ = 3.14159265F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[47].setRotationPoint(4F, -6.5F, -17F);
		bodyModel[47].rotateAngleZ = 0.29670597F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[48].setRotationPoint(3.5F, -10.5F, -18F);

		bodyModel[49].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 38
		bodyModel[49].setRotationPoint(12F, -6F, -17F);
		bodyModel[49].rotateAngleZ = 3.14159265F;

		bodyModel[50].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 39
		bodyModel[50].setRotationPoint(8F, 0F, -16F);
		bodyModel[50].rotateAngleZ = 2.53072742F;

		bodyModel[51].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 40
		bodyModel[51].setRotationPoint(8F, 0.5F, -17F);
		bodyModel[51].rotateAngleZ = 3.14159265F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[52].setRotationPoint(-10F, -6.5F, -17F);
		bodyModel[52].rotateAngleZ = 0.29670597F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[53].setRotationPoint(-10.5F, -10.5F, -18F);

		bodyModel[54].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 43
		bodyModel[54].setRotationPoint(-2F, -6F, -17F);
		bodyModel[54].rotateAngleZ = 3.14159265F;

		bodyModel[55].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 44
		bodyModel[55].setRotationPoint(-6F, 0F, -16F);
		bodyModel[55].rotateAngleZ = 2.53072742F;

		bodyModel[56].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 45
		bodyModel[56].setRotationPoint(-6F, 0.5F, -17F);
		bodyModel[56].rotateAngleZ = 3.14159265F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[57].setRotationPoint(-24F, -6.5F, -17F);
		bodyModel[57].rotateAngleZ = 0.29670597F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[58].setRotationPoint(-24.5F, -10.5F, -18F);

		bodyModel[59].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 48
		bodyModel[59].setRotationPoint(-16F, -6F, -17F);
		bodyModel[59].rotateAngleZ = 3.14159265F;

		bodyModel[60].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 49
		bodyModel[60].setRotationPoint(-20F, 0F, -16F);
		bodyModel[60].rotateAngleZ = 2.53072742F;

		bodyModel[61].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 50
		bodyModel[61].setRotationPoint(-20F, 0.5F, -17F);
		bodyModel[61].rotateAngleZ = 3.14159265F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[62].setRotationPoint(-39F, -6.5F, -17F);
		bodyModel[62].rotateAngleZ = 0.29670597F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[63].setRotationPoint(-39.5F, -10.5F, -18F);

		bodyModel[64].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 53
		bodyModel[64].setRotationPoint(-31F, -6F, -17F);
		bodyModel[64].rotateAngleZ = 3.14159265F;

		bodyModel[65].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 54
		bodyModel[65].setRotationPoint(-35F, 0F, -16F);
		bodyModel[65].rotateAngleZ = 2.53072742F;

		bodyModel[66].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 55
		bodyModel[66].setRotationPoint(-35F, 0.5F, -17F);
		bodyModel[66].rotateAngleZ = 3.14159265F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[67].setRotationPoint(-53F, -6.5F, -17F);
		bodyModel[67].rotateAngleZ = 0.29670597F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[68].setRotationPoint(-53.5F, -10.5F, -18F);

		bodyModel[69].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 58
		bodyModel[69].setRotationPoint(-45F, -6F, -17F);
		bodyModel[69].rotateAngleZ = 3.14159265F;

		bodyModel[70].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 59
		bodyModel[70].setRotationPoint(-49F, 0F, -16F);
		bodyModel[70].rotateAngleZ = 2.53072742F;

		bodyModel[71].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 60
		bodyModel[71].setRotationPoint(-49F, 0.5F, -17F);
		bodyModel[71].rotateAngleZ = 3.14159265F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 61
		bodyModel[72].setRotationPoint(14F, -8F, -21F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 62
		bodyModel[73].setRotationPoint(-13.5F, -8F, -21F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 63
		bodyModel[74].setRotationPoint(-42.5F, -8F, -21F);

		bodyModel[75].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 64
		bodyModel[75].setRotationPoint(22F, 0.5F, 14.5F);
		bodyModel[75].rotateAngleZ = 3.14159265F;

		bodyModel[76].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 65
		bodyModel[76].setRotationPoint(22F, 0F, 15.5F);
		bodyModel[76].rotateAngleZ = 2.53072742F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 66
		bodyModel[77].setRotationPoint(17.5F, -10.5F, 15F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[78].setRotationPoint(18F, -6.5F, 15F);
		bodyModel[78].rotateAngleZ = 0.29670597F;

		bodyModel[79].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 68
		bodyModel[79].setRotationPoint(26F, -6F, 15F);
		bodyModel[79].rotateAngleZ = 3.14159265F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 69
		bodyModel[80].setRotationPoint(4F, -6.5F, 15F);
		bodyModel[80].rotateAngleZ = 0.29670597F;

		bodyModel[81].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 70
		bodyModel[81].setRotationPoint(12F, -6F, 15F);
		bodyModel[81].rotateAngleZ = 3.14159265F;

		bodyModel[82].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 71
		bodyModel[82].setRotationPoint(8F, 0F, 15.5F);
		bodyModel[82].rotateAngleZ = 2.53072742F;

		bodyModel[83].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 72
		bodyModel[83].setRotationPoint(8F, 0.5F, 14.5F);
		bodyModel[83].rotateAngleZ = 3.14159265F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 73
		bodyModel[84].setRotationPoint(-10F, -6.5F, 15F);
		bodyModel[84].rotateAngleZ = 0.29670597F;

		bodyModel[85].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 74
		bodyModel[85].setRotationPoint(-2F, -6F, 15F);
		bodyModel[85].rotateAngleZ = 3.14159265F;

		bodyModel[86].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 75
		bodyModel[86].setRotationPoint(-6F, 0F, 15.5F);
		bodyModel[86].rotateAngleZ = 2.53072742F;

		bodyModel[87].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 76
		bodyModel[87].setRotationPoint(-6F, 0.5F, 14.5F);
		bodyModel[87].rotateAngleZ = 3.14159265F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 77
		bodyModel[88].setRotationPoint(-24F, -6.5F, 15F);
		bodyModel[88].rotateAngleZ = 0.29670597F;

		bodyModel[89].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 78
		bodyModel[89].setRotationPoint(-16F, -6F, 15F);
		bodyModel[89].rotateAngleZ = 3.14159265F;

		bodyModel[90].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 79
		bodyModel[90].setRotationPoint(-20F, 0F, 15.5F);
		bodyModel[90].rotateAngleZ = 2.53072742F;

		bodyModel[91].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 80
		bodyModel[91].setRotationPoint(-20F, 0.5F, 14.5F);
		bodyModel[91].rotateAngleZ = 3.14159265F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 81
		bodyModel[92].setRotationPoint(-39F, -6.5F, 15F);
		bodyModel[92].rotateAngleZ = 0.29670597F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 82
		bodyModel[93].setRotationPoint(-39.5F, -10.5F, 15F);

		bodyModel[94].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 83
		bodyModel[94].setRotationPoint(-31F, -6F, 15F);
		bodyModel[94].rotateAngleZ = 3.14159265F;

		bodyModel[95].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 84
		bodyModel[95].setRotationPoint(-35F, 0F, 15.5F);
		bodyModel[95].rotateAngleZ = 2.53072742F;

		bodyModel[96].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 85
		bodyModel[96].setRotationPoint(-35F, 0.5F, 14.5F);
		bodyModel[96].rotateAngleZ = 3.14159265F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[97].setRotationPoint(-53F, -6.5F, 15F);
		bodyModel[97].rotateAngleZ = 0.29670597F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 87
		bodyModel[98].setRotationPoint(-53.5F, -10.5F, 15F);

		bodyModel[99].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 88
		bodyModel[99].setRotationPoint(-45F, -6F, 15F);
		bodyModel[99].rotateAngleZ = 3.14159265F;

		bodyModel[100].addBox(-1.5F, 0F, -0.5F, 3, 8, 1, 0F); // Box 89
		bodyModel[100].setRotationPoint(-49F, 0F, 15.5F);
		bodyModel[100].rotateAngleZ = 2.53072742F;

		bodyModel[101].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 90
		bodyModel[101].setRotationPoint(-49F, 0.5F, 14.5F);
		bodyModel[101].rotateAngleZ = 3.14159265F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 91
		bodyModel[102].setRotationPoint(14F, -8F, 15F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 92
		bodyModel[103].setRotationPoint(-13.5F, -8F, 15F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 93
		bodyModel[104].setRotationPoint(-42.5F, -8F, 15F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 94
		bodyModel[105].setRotationPoint(21.5F, 0F, -24F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 95
		bodyModel[106].setRotationPoint(7.5F, 0F, -24F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 96
		bodyModel[107].setRotationPoint(-6.5F, 0F, -24F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 97
		bodyModel[108].setRotationPoint(-20.5F, 0F, -24F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 98
		bodyModel[109].setRotationPoint(-35.5F, 0F, -24F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 99
		bodyModel[110].setRotationPoint(-49.5F, 0F, -24F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 100
		bodyModel[111].setRotationPoint(21.5F, 0F, 13.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 101
		bodyModel[112].setRotationPoint(7.5F, 0F, 13.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 102
		bodyModel[113].setRotationPoint(-6.5F, 0F, 13.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 103
		bodyModel[114].setRotationPoint(-20.5F, 0F, 13.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 104
		bodyModel[115].setRotationPoint(-35.5F, 0F, 13.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 105
		bodyModel[116].setRotationPoint(-49.5F, 0F, 13.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[117].setRotationPoint(-57F, -15.5F, -28F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[118].setRotationPoint(-43F, -15.5F, -28F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[119].setRotationPoint(-38F, -15.5F, -28F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[120].setRotationPoint(-24F, -15.5F, -28F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[121].setRotationPoint(-43F, -15.5F, 22F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(-57F, -15.5F, 22F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[123].setRotationPoint(-38F, -15.5F, 22F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[124].setRotationPoint(-24F, -15.5F, 22F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[125].setRotationPoint(-57F, -15.5F, 27F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[126].setRotationPoint(-43F, -15.5F, 27F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[127].setRotationPoint(-38F, -15.5F, 27F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[128].setRotationPoint(-24F, -15.5F, 27F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[129].setRotationPoint(-4F, -13.5F, 19.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[130].setRotationPoint(-21F, -13.5F, 19.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[131].setRotationPoint(14F, -13.5F, -26.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[132].setRotationPoint(-4F, -13.5F, -26.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[133].setRotationPoint(-21F, -13.5F, -26.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[134].setRotationPoint(-40F, -19.6F, 11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[135].setRotationPoint(-40F, -19.6F, -18F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[136].setRotationPoint(-40F, -20F, -18F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[137].setRotationPoint(-40F, -20F, 11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[138].setRotationPoint(-24F, -20F, -18F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[139].setRotationPoint(-24F, -20F, 11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[140].setRotationPoint(-39F, -20F, -18F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[141].setRotationPoint(-39F, -20F, 11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[142].setRotationPoint(-39F, -20F, 17F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[143].setRotationPoint(-39F, -20F, -12F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[144].setRotationPoint(-34F, -19.8F, 12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[145].setRotationPoint(-34F, -19.8F, -17F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[146].setRotationPoint(-32F, -19.8F, 12F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[147].setRotationPoint(-32F, -19.8F, -17F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[148].setRotationPoint(-30F, -19.8F, 12F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[149].setRotationPoint(-30F, -19.8F, -17F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[150].setRotationPoint(-28F, -19.8F, 12F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[151].setRotationPoint(-28F, -19.8F, -17F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[152].setRotationPoint(-26F, -19.8F, 12F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[153].setRotationPoint(-26F, -19.8F, -17F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 20, 1, 10, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 182
		bodyModel[154].setRotationPoint(-43F, -20.5F, -5F);

		bodyModel[155].addShapeBox(0F, 1F, 0F, 3, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 392
		bodyModel[155].setRotationPoint(34.5F, -16F, -12.8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 393
		bodyModel[156].setRotationPoint(34.5F, -16F, -12.8F);

		bodyModel[157].addShapeBox(0F, 3F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 394
		bodyModel[157].setRotationPoint(34.5F, -16F, -12.8F);

		bodyModel[158].addShapeBox(-2F, 0F, -9F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[158].setRotationPoint(38F, -5F, 19F);

		bodyModel[159].addShapeBox(0.5F, 1F, -10.5F, 1, 5, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[159].setRotationPoint(38F, -5F, 19F);

		bodyModel[160].addShapeBox(0.5F, 1F, -7.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 406
		bodyModel[160].setRotationPoint(38F, -5F, 19F);

		bodyModel[161].addShapeBox(0.5F, 5F, -9.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[161].setRotationPoint(38F, -5F, 19F);

		bodyModel[162].addShapeBox(-1.5F, 1F, 9.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 408
		bodyModel[162].setRotationPoint(40F, -5F, -19F);

		bodyModel[163].addShapeBox(-1.5F, 4F, 8.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[163].setRotationPoint(40F, -4F, -20F);

		bodyModel[164].addShapeBox(-1.5F, 1F, 6.5F, 1, 5, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[164].setRotationPoint(40F, -5F, -19F);

		bodyModel[165].addShapeBox(-1.5F, 1F, 8.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[165].setRotationPoint(40F, -5F, -20F);

		bodyModel[166].addShapeBox(-4F, 0F, 8F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[166].setRotationPoint(40F, -5F, -19F);

		bodyModel[167].addShapeBox(0.5F, 1F, -9.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[167].setRotationPoint(38F, -5F, 19F);

		bodyModel[168].addShapeBox(0F, 1F, 0F, 3, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 199
		bodyModel[168].setRotationPoint(34.5F, -16F, 8.8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 200
		bodyModel[169].setRotationPoint(34.5F, -16F, 8.8F);

		bodyModel[170].addShapeBox(0F, 3F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 201
		bodyModel[170].setRotationPoint(34.5F, -16F, 8.8F);

		bodyModel[171].addShapeBox(0F, 1F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[171].setRotationPoint(33.5F, -16F, -11.8F);

		bodyModel[172].addShapeBox(0F, 1F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[172].setRotationPoint(33.5F, -16F, 9.8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 1
		bodyModel[173].setRotationPoint(37F, -11F, 6F);
		bodyModel[173].rotateAngleZ = 0.95993109F;

		bodyModel[174].addShapeBox(1.8F, 0.7F, 0F, 1, 1, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 2
		bodyModel[174].setRotationPoint(37F, -11F, 6F);
		bodyModel[174].rotateAngleZ = 0.95993109F;

		bodyModel[175].addShapeBox(0F, 1.4F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 3
		bodyModel[175].setRotationPoint(37F, -11F, 6F);
		bodyModel[175].rotateAngleZ = 0.95993109F;

		bodyModel[176].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 287
		bodyModel[176].setRotationPoint(38F, -14.5F, 12F);

		bodyModel[177].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 289
		bodyModel[177].setRotationPoint(39F, -14.5F, 8.5F);
		bodyModel[177].rotateAngleZ = 0.41887902F;

		bodyModel[178].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 31
		bodyModel[178].setRotationPoint(37.8F, -17.2F, 8.5F);
		bodyModel[178].rotateAngleZ = 1.3962634F;

		bodyModel[179].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 32
		bodyModel[179].setRotationPoint(37.8F, -17.2F, 12F);
		bodyModel[179].rotateAngleZ = 1.3962634F;

		bodyModel[180].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 33
		bodyModel[180].setRotationPoint(34.9F, -17.7F, 8.5F);
		bodyModel[180].rotateAngleZ = 2.37364778F;

		bodyModel[181].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 34
		bodyModel[181].setRotationPoint(34.9F, -17.7F, 12F);
		bodyModel[181].rotateAngleZ = 2.37364778F;

		bodyModel[182].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 0
		bodyModel[182].setRotationPoint(39F, -14.5F, 12F);
		bodyModel[182].rotateAngleZ = 0.41887902F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 228
		bodyModel[183].setRotationPoint(37F, -11F, -7F);
		bodyModel[183].rotateAngleZ = 0.95993109F;

		bodyModel[184].addShapeBox(1.8F, 0.7F, 0F, 1, 1, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 229
		bodyModel[184].setRotationPoint(37F, -11F, -7F);
		bodyModel[184].rotateAngleZ = 0.95993109F;

		bodyModel[185].addShapeBox(0F, 1.4F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 230
		bodyModel[185].setRotationPoint(37F, -11F, -7F);
		bodyModel[185].rotateAngleZ = 0.95993109F;

		bodyModel[186].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 232
		bodyModel[186].setRotationPoint(38F, -14.5F, -13F);

		bodyModel[187].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 233
		bodyModel[187].setRotationPoint(39F, -14.5F, -9.5F);
		bodyModel[187].rotateAngleZ = 0.41887902F;

		bodyModel[188].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 234
		bodyModel[188].setRotationPoint(37.8F, -17.2F, -9.5F);
		bodyModel[188].rotateAngleZ = 1.3962634F;

		bodyModel[189].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 235
		bodyModel[189].setRotationPoint(37.8F, -17.2F, -13F);
		bodyModel[189].rotateAngleZ = 1.3962634F;

		bodyModel[190].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 236
		bodyModel[190].setRotationPoint(34.9F, -17.7F, -9.5F);
		bodyModel[190].rotateAngleZ = 2.37364778F;

		bodyModel[191].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 237
		bodyModel[191].setRotationPoint(34.9F, -17.7F, -13F);
		bodyModel[191].rotateAngleZ = 2.37364778F;

		bodyModel[192].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 239
		bodyModel[192].setRotationPoint(39F, -14.5F, -13F);
		bodyModel[192].rotateAngleZ = 0.41887902F;

		bodyModel[193].addBox(1F, -6F, 0F, 1, 3, 1, 0F); // Box 240
		bodyModel[193].setRotationPoint(35.1F, -18.3F, 12F);
		bodyModel[193].rotateAngleZ = 3.05432619F;

		bodyModel[194].addBox(1F, -6F, 0F, 1, 3, 1, 0F); // Box 241
		bodyModel[194].setRotationPoint(35.1F, -18.3F, 8.5F);
		bodyModel[194].rotateAngleZ = 3.05432619F;

		bodyModel[195].addBox(1F, -6F, 0F, 1, 3, 1, 0F); // Box 242
		bodyModel[195].setRotationPoint(35.1F, -18.3F, -9.5F);
		bodyModel[195].rotateAngleZ = 3.05432619F;

		bodyModel[196].addBox(1F, -6F, 0F, 1, 3, 1, 0F); // Box 243
		bodyModel[196].setRotationPoint(35.1F, -18.3F, -13F);
		bodyModel[196].rotateAngleZ = 3.05432619F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[197].setRotationPoint(-2.5F, -16.5F, 21F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[198].setRotationPoint(-1.5F, -16.5F, 21F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[199].setRotationPoint(-19.5F, -16.5F, 21F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[200].setRotationPoint(-18.5F, -16.5F, 21F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[201].setRotationPoint(-2.5F, -16.5F, -27F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[202].setRotationPoint(-1.5F, -16.5F, -27F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[203].setRotationPoint(12.5F, -16.5F, 21F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[204].setRotationPoint(-5.5F, -16.5F, 21F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[205].setRotationPoint(12.5F, -16.5F, -27F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[206].setRotationPoint(-1.5F, -16.5F, -22F);

		bodyModel[207].addShapeBox(-0.5F, -7F, -1F, 1, 2, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 21
		bodyModel[207].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[207].rotateAngleZ = 2.26892803F;

		bodyModel[208].addShapeBox(-0.5F, -8F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[208].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[208].rotateAngleZ = 2.26892803F;

		bodyModel[209].addShapeBox(-0.5F, -12F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 23
		bodyModel[209].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[209].rotateAngleZ = 2.26892803F;

		bodyModel[210].addShapeBox(-0.5F, -11F, -2.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[210].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[210].rotateAngleZ = 2.26892803F;

		bodyModel[211].addShapeBox(-0.5F, -11F, 1.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[211].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[211].rotateAngleZ = 2.26892803F;

		bodyModel[212].addShapeBox(-0.5F, -7F, -0.5F, 1, 2, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 26
		bodyModel[212].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[212].rotateAngleZ = 2.26892803F;

		bodyModel[213].addShapeBox(-0.5F, -5F, -1F, 1, 5, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F); // Box 27
		bodyModel[213].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[213].rotateAngleZ = 2.26892803F;

		bodyModel[214].addShapeBox(-0.5F, -5F, 0F, 1, 5, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F); // Box 28
		bodyModel[214].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[214].rotateAngleZ = 2.26892803F;

		bodyModel[215].addShapeBox(-0.5F, -3F, -2F, 1, 1, 4, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 29
		bodyModel[215].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[215].rotateAngleZ = 2.26892803F;

		bodyModel[216].addShapeBox(-0.5F, -1F, -5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[216].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[216].rotateAngleZ = 2.26892803F;

		bodyModel[217].addShapeBox(-0.5F, -1F, -4F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 31
		bodyModel[217].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[217].rotateAngleZ = 2.26892803F;

		bodyModel[218].addShapeBox(-0.5F, -1F, 3F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 32
		bodyModel[218].setRotationPoint(-58.5F, -19.5F, 0F);
		bodyModel[218].rotateAngleZ = 2.26892803F;

		bodyModel[219].addShapeBox(8.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[219].setRotationPoint(30F, -12.5F, -21.5F);

		bodyModel[220].addShapeBox(10F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 156
		bodyModel[220].setRotationPoint(30F, -12.5F, -22.5F);

		bodyModel[221].addShapeBox(8F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[221].setRotationPoint(30F, -12.5F, -22.5F);

		bodyModel[222].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 158
		bodyModel[222].setRotationPoint(30F, -12.5F, -22.5F);

		bodyModel[223].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[223].setRotationPoint(30F, -12.5F, -22.5F);

		bodyModel[224].addShapeBox(2F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 160
		bodyModel[224].setRotationPoint(30F, -12.5F, -22.5F);

		bodyModel[225].addShapeBox(0F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[225].setRotationPoint(30F, -12.5F, -22.5F);

		bodyModel[226].addShapeBox(-0.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[226].setRotationPoint(30F, -12.5F, -21.5F);

		bodyModel[227].addShapeBox(2.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[227].setRotationPoint(30F, -12.5F, -21.5F);

		bodyModel[228].addShapeBox(5.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[228].setRotationPoint(30F, -12.5F, -21.5F);

		bodyModel[229].addShapeBox(7F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 53
		bodyModel[229].setRotationPoint(30F, -12.5F, -22.5F);

		bodyModel[230].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 54
		bodyModel[230].setRotationPoint(30F, -12.5F, -22.5F);

		bodyModel[231].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 55
		bodyModel[231].setRotationPoint(30F, -12.5F, -22.5F);

		bodyModel[232].addShapeBox(8.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[232].setRotationPoint(30F, -12.5F, 20.5F);

		bodyModel[233].addShapeBox(10F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 83
		bodyModel[233].setRotationPoint(30F, -12.5F, 19.5F);

		bodyModel[234].addShapeBox(8F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[234].setRotationPoint(30F, -12.5F, 19.5F);

		bodyModel[235].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 85
		bodyModel[235].setRotationPoint(30F, -12.5F, 19.5F);

		bodyModel[236].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[236].setRotationPoint(30F, -12.5F, 19.5F);

		bodyModel[237].addShapeBox(2F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 87
		bodyModel[237].setRotationPoint(30F, -12.5F, 19.5F);

		bodyModel[238].addShapeBox(0F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[238].setRotationPoint(30F, -12.5F, 19.5F);

		bodyModel[239].addShapeBox(-0.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[239].setRotationPoint(30F, -12.5F, 20.5F);

		bodyModel[240].addShapeBox(2.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[240].setRotationPoint(30F, -12.5F, 20.5F);

		bodyModel[241].addShapeBox(5.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[241].setRotationPoint(30F, -12.5F, 20.5F);

		bodyModel[242].addShapeBox(7F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 92
		bodyModel[242].setRotationPoint(30F, -12.5F, 19.5F);

		bodyModel[243].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 93
		bodyModel[243].setRotationPoint(30F, -12.5F, 19.5F);

		bodyModel[244].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 94
		bodyModel[244].setRotationPoint(30F, -12.5F, 19.5F);

		bodyModel[245].addShapeBox(8.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[245].setRotationPoint(38.5F, -5.5F, 3.5F);
		bodyModel[245].rotateAngleX = -2.0943951F;
		bodyModel[245].rotateAngleY = -1.57079633F;

		bodyModel[246].addShapeBox(5.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[246].setRotationPoint(38.5F, -5.5F, 3.5F);
		bodyModel[246].rotateAngleX = -2.0943951F;
		bodyModel[246].rotateAngleY = -1.57079633F;

		bodyModel[247].addShapeBox(2.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[247].setRotationPoint(38.5F, -5.5F, 3.5F);
		bodyModel[247].rotateAngleX = -2.0943951F;
		bodyModel[247].rotateAngleY = -1.57079633F;

		bodyModel[248].addShapeBox(-0.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[248].setRotationPoint(38.5F, -5.5F, 3.5F);
		bodyModel[248].rotateAngleX = -2.0943951F;
		bodyModel[248].rotateAngleY = -1.57079633F;

		bodyModel[249].addShapeBox(10F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 99
		bodyModel[249].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[249].rotateAngleX = -2.0943951F;
		bodyModel[249].rotateAngleY = -1.57079633F;

		bodyModel[250].addShapeBox(8F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[250].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[250].rotateAngleX = -2.0943951F;
		bodyModel[250].rotateAngleY = -1.57079633F;

		bodyModel[251].addShapeBox(7F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 101
		bodyModel[251].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[251].rotateAngleX = -2.0943951F;
		bodyModel[251].rotateAngleY = -1.57079633F;

		bodyModel[252].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 102
		bodyModel[252].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[252].rotateAngleX = -2.0943951F;
		bodyModel[252].rotateAngleY = -1.57079633F;

		bodyModel[253].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[253].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[253].rotateAngleX = -2.0943951F;
		bodyModel[253].rotateAngleY = -1.57079633F;

		bodyModel[254].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 104
		bodyModel[254].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[254].rotateAngleX = -2.0943951F;
		bodyModel[254].rotateAngleY = -1.57079633F;

		bodyModel[255].addShapeBox(2F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 105
		bodyModel[255].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[255].rotateAngleX = -2.0943951F;
		bodyModel[255].rotateAngleY = -1.57079633F;

		bodyModel[256].addShapeBox(0F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[256].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[256].rotateAngleX = -2.0943951F;
		bodyModel[256].rotateAngleY = -1.57079633F;

		bodyModel[257].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 107
		bodyModel[257].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[257].rotateAngleX = -2.0943951F;
		bodyModel[257].rotateAngleY = -1.57079633F;

		bodyModel[258].addShapeBox(-5F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 108
		bodyModel[258].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[258].rotateAngleX = -2.0943951F;
		bodyModel[258].rotateAngleY = -1.57079633F;

		bodyModel[259].addShapeBox(-4F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[259].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[259].rotateAngleX = -2.0943951F;
		bodyModel[259].rotateAngleY = -1.57079633F;

		bodyModel[260].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 110
		bodyModel[260].setRotationPoint(39F, -6.5F, 3F);
		bodyModel[260].rotateAngleX = -2.0943951F;
		bodyModel[260].rotateAngleY = -1.57079633F;

		bodyModel[261].addShapeBox(-4.5F, -2.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[261].setRotationPoint(38.5F, -5.5F, 2.5F);
		bodyModel[261].rotateAngleX = -2.0943951F;
		bodyModel[261].rotateAngleY = -1.57079633F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 16, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[262].setRotationPoint(-57F, -20F, -17F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[263].setRotationPoint(-38F, -19.8F, -17F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[264].setRotationPoint(-36F, -19.8F, -17F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[265].setRotationPoint(-38F, -19.8F, 12F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[266].setRotationPoint(-36F, -19.8F, 12F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[267].setRotationPoint(-18.5F, -16.5F, -27F);
		bodyModel[267].rotateAngleY = 0.19198622F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 45
		bodyModel[268].setRotationPoint(-18.5F, -17F, -27F);
		bodyModel[268].rotateAngleY = 0.19198622F;
		bodyModel[268].rotateAngleZ = 0.15707963F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[269].setRotationPoint(-6.5F, -16.5F, -21F);
		bodyModel[269].rotateAngleY = -2.8099801F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 47
		bodyModel[270].setRotationPoint(-6.5F, -17F, -21F);
		bodyModel[270].rotateAngleY = -2.8099801F;
		bodyModel[270].rotateAngleZ = 0.15707963F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, 0.3F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[271].setRotationPoint(27.5F, -16.8F, -4F);
		bodyModel[271].rotateAngleZ = -0.4712389F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 0
		bodyModel[272].setRotationPoint(3.5F, -10.5F, 15F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 1
		bodyModel[273].setRotationPoint(-24.5F, -10.5F, 15F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 2
		bodyModel[274].setRotationPoint(-10.5F, -10.5F, 15F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 3
		bodyModel[275].setRotationPoint(38F, -14.5F, -9.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 4
		bodyModel[276].setRotationPoint(38F, -14.5F, 8.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F); // Box 5
		bodyModel[277].setRotationPoint(38F, -14.5F, -11.25F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F); // Box 6
		bodyModel[278].setRotationPoint(38F, -14.5F, 10.25F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 0
		bodyModel[279].setRotationPoint(37F, -12.5F, 27F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 95, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[280].setRotationPoint(-62F, -12.5F, 27F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[281].setRotationPoint(33F, -9.5F, 27F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[282].setRotationPoint(-66F, -9.5F, 27F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 4
		bodyModel[283].setRotationPoint(-69F, -12.5F, 27F);


		bodyDoorCloseModel = new ModelRendererTurbo[5];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 104, 441, textureX, textureY); // Box 15
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 156, 441, textureX, textureY); // Box 8
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 104, 441, textureX, textureY); // Box 14
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 41, 269, textureX, textureY); // Box 0
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 41, 269, textureX, textureY); // Box 1

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 16, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		bodyDoorCloseModel[0].setRotationPoint(-2.5F, -17.5F, 21F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		bodyDoorCloseModel[1].setRotationPoint(-19.5F, -17.5F, 21F);

		bodyDoorCloseModel[2].addShapeBox(0F, -1F, -7F, 16, 1, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyDoorCloseModel[2].setRotationPoint(-2.5F, -16.5F, -21F);
		bodyDoorCloseModel[2].rotateAngleX = -0.17453293F;

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 16, 1, 7, 0F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F); // Box 0
		bodyDoorCloseModel[3].setRotationPoint(-2.5F, -18F, 20F);

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 16, 1, 7, 0F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, -3F); // Box 1
		bodyDoorCloseModel[4].setRotationPoint(-20F, -18F, 20F);


		turretModel = new ModelRendererTurbo[124];
		turretModel[0] = new ModelRendererTurbo(this, 1, 263, textureX, textureY); // Box 13
		turretModel[1] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 21
		turretModel[2] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 22
		turretModel[3] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 23
		turretModel[4] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 24
		turretModel[5] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 25
		turretModel[6] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 27
		turretModel[7] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 28
		turretModel[8] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 29
		turretModel[9] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 30
		turretModel[10] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 31
		turretModel[11] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 32
		turretModel[12] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 33
		turretModel[13] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 34
		turretModel[14] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 38
		turretModel[15] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 47
		turretModel[16] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 50
		turretModel[17] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 51
		turretModel[18] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 52
		turretModel[19] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 53
		turretModel[20] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 54
		turretModel[21] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 55
		turretModel[22] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 59
		turretModel[23] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 60
		turretModel[24] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 61
		turretModel[25] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 62
		turretModel[26] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 63
		turretModel[27] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 64
		turretModel[28] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 0
		turretModel[29] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 1
		turretModel[30] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 2
		turretModel[31] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 3
		turretModel[32] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 15
		turretModel[33] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 16
		turretModel[34] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 17
		turretModel[35] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 18
		turretModel[36] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 19
		turretModel[37] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 21
		turretModel[38] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 117
		turretModel[39] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 118
		turretModel[40] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 119
		turretModel[41] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 120
		turretModel[42] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 121
		turretModel[43] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 122
		turretModel[44] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 123
		turretModel[45] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 124
		turretModel[46] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 1
		turretModel[47] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 3
		turretModel[48] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 8
		turretModel[49] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 78
		turretModel[50] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 79
		turretModel[51] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 80
		turretModel[52] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 81
		turretModel[53] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 82
		turretModel[54] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 83
		turretModel[55] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 106
		turretModel[56] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 107
		turretModel[57] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 108
		turretModel[58] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 109
		turretModel[59] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 110
		turretModel[60] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 111
		turretModel[61] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 129
		turretModel[62] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 130
		turretModel[63] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 131
		turretModel[64] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 132
		turretModel[65] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 146
		turretModel[66] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 147
		turretModel[67] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 148
		turretModel[68] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 149
		turretModel[69] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 150
		turretModel[70] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 151
		turretModel[71] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 158
		turretModel[72] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 159
		turretModel[73] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 161
		turretModel[74] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 244
		turretModel[75] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 5
		turretModel[76] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 6
		turretModel[77] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 7
		turretModel[78] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 8
		turretModel[79] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 9
		turretModel[80] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 10
		turretModel[81] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 11
		turretModel[82] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 12
		turretModel[83] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 13
		turretModel[84] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 14
		turretModel[85] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 15
		turretModel[86] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 16
		turretModel[87] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 17
		turretModel[88] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 18
		turretModel[89] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 19
		turretModel[90] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 20
		turretModel[91] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 21
		turretModel[92] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 22
		turretModel[93] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 23
		turretModel[94] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 24
		turretModel[95] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 25
		turretModel[96] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 26
		turretModel[97] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 27
		turretModel[98] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 28
		turretModel[99] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 29
		turretModel[100] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 30
		turretModel[101] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 31
		turretModel[102] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 32
		turretModel[103] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 33
		turretModel[104] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 34
		turretModel[105] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 35
		turretModel[106] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 36
		turretModel[107] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 37
		turretModel[108] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 38
		turretModel[109] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 39
		turretModel[110] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 40
		turretModel[111] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 41
		turretModel[112] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 42
		turretModel[113] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 43
		turretModel[114] = new ModelRendererTurbo(this, 162, 292, textureX, textureY); // Box 0
		turretModel[115] = new ModelRendererTurbo(this, 162, 292, textureX, textureY); // Box 1
		turretModel[116] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 5
		turretModel[117] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 6
		turretModel[118] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 7
		turretModel[119] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 8
		turretModel[120] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 9
		turretModel[121] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 10
		turretModel[122] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 0
		turretModel[123] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 1

		turretModel[0].addShapeBox(-14F, -1F, -16F, 37, 2, 16, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[0].setRotationPoint(0F, -20.5F, 8F);

		turretModel[1].addShapeBox(5F, -1F, 0F, 17, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 2F); // Box 21
		turretModel[1].setRotationPoint(0F, -20.5F, 8F);

		turretModel[2].addShapeBox(-12F, 0F, 4F, 17, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[2].setRotationPoint(0F, -20.5F, 0F);

		turretModel[3].addShapeBox(-19F, 0F, -18F, 7, 1, 34, 0F, 2F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, -3F, 2F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, -3F); // Box 23
		turretModel[3].setRotationPoint(0F, -20.5F, 1F);

		turretModel[4].addShapeBox(-12F, 0F, -19F, 17, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		turretModel[4].setRotationPoint(0F, -20.5F, 0F);

		turretModel[5].addShapeBox(5F, -1F, -25F, 17, 2, 9, 0F, 0F, 0F, 2F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[5].setRotationPoint(0F, -20.5F, 8F);

		turretModel[6].addShapeBox(-12F, -3F, -19F, 17, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		turretModel[6].setRotationPoint(0F, -24.5F, 0F);

		turretModel[7].addShapeBox(-18F, -3F, -18F, 6, 7, 34, 0F, 2F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, -5F, 5F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 5F, 0F, -4F); // Box 28
		turretModel[7].setRotationPoint(0F, -24.5F, 1F);

		turretModel[8].addShapeBox(-12F, -3F, 9F, 17, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 29
		turretModel[8].setRotationPoint(0F, -24.5F, 0F);

		turretModel[9].addShapeBox(5F, -3F, 9F, 17, 7, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 3F); // Box 30
		turretModel[9].setRotationPoint(0F, -24.5F, 0F);

		turretModel[10].addShapeBox(-17F, -3F, -17F, 39, 7, 18, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 31
		turretModel[10].setRotationPoint(0F, -23.5F, 8F);

		turretModel[11].addShapeBox(5F, -5F, 7F, 17, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 32
		turretModel[11].setRotationPoint(0F, -26.5F, 0F);

		turretModel[12].addShapeBox(-12F, -5F, 7F, 17, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 33
		turretModel[12].setRotationPoint(0F, -26.5F, 0F);

		turretModel[13].addShapeBox(-18F, -5F, -15F, 6, 4, 28, 0F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 2F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 5F, 2F, 0F, -2F); // Box 34
		turretModel[13].setRotationPoint(0F, -26.5F, 1F);

		turretModel[14].addShapeBox(-12F, -5F, -16F, 17, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[14].setRotationPoint(0F, -26.5F, 0F);

		turretModel[15].addShapeBox(2F, -6F, -7F, 19, 1, 14, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 47
		turretModel[15].setRotationPoint(3F, -26.5F, 0F);

		turretModel[16].addShapeBox(-17F, -6F, 7F, 22, 1, 7, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F); // Box 50
		turretModel[16].setRotationPoint(0F, -26.5F, 0F);

		turretModel[17].addShapeBox(-17F, -6F, -14F, 22, 1, 7, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 51
		turretModel[17].setRotationPoint(0F, -26.5F, 0F);

		turretModel[18].addShapeBox(-16F, -6F, -11F, 4, 1, 22, 0F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 2F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 5F, 2F, 0F, -2F); // Box 52
		turretModel[18].setRotationPoint(0F, -26.5F, 0F);

		turretModel[19].addShapeBox(27F, 0.6F, -15F, 3, 6, 14, 0F, 3F, -2F, 6F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, -2F, 6F, 3F, -1.5F, 5F, -2F, -2F, 0F, -2F, -2F, 0F, 3F, -1.5F, 5F); // Box 53
		turretModel[19].setRotationPoint(-2F, -26.5F, 8F);

		turretModel[20].addShapeBox(28F, -2.4F, -15F, 2, 6, 14, 0F, 4F, -1.5F, 7F, 0F, -1F, 0F, 0F, -1F, 0F, 4F, -1.5F, 7F, 4F, -1F, 6F, 0F, -1F, 0F, 0F, -1F, 0F, 4F, -1F, 6F); // Box 54
		turretModel[20].setRotationPoint(-2F, -26.5F, 8F);

		turretModel[21].addShapeBox(33F, -6.4F, -15F, 2, 7, 14, 0F, 9F, -1.5F, 3F, -6F, -3F, 0F, -6F, -3F, 0F, 9F, -1.5F, 3F, 9F, -1.5F, 7F, -5F, -2F, 0F, -5F, -2F, 0F, 9F, -1.5F, 7F); // Box 55
		turretModel[21].setRotationPoint(-2F, -26.5F, 8F);

		turretModel[22].addShapeBox(5F, -5F, -14F, 17, 4, 7, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		turretModel[22].setRotationPoint(0F, -26.5F, 0F);

		turretModel[23].addShapeBox(5F, -6F, -14F, 22, 1, 7, 0F, 0F, 0F, 0F, -5F, -1F, -4F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		turretModel[23].setRotationPoint(0F, -26.5F, 0F);

		turretModel[24].addShapeBox(5F, -3F, -17F, 17, 7, 8, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 61
		turretModel[24].setRotationPoint(0F, -24.5F, 0F);

		turretModel[25].addShapeBox(-12F, -6F, -7F, 14, 1, 14, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 62
		turretModel[25].setRotationPoint(0F, -26.5F, 0F);

		turretModel[26].addShapeBox(5F, -6F, 7F, 22, 1, 7, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, 2F); // Box 63
		turretModel[26].setRotationPoint(0F, -26.5F, 0F);

		turretModel[27].addShapeBox(-12F, -6F, -15F, 31, 4, 14, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 64
		turretModel[27].setRotationPoint(0F, -25.5F, 8F);

		turretModel[28].addShapeBox(33F, -6.4F, -13F, 2, 7, 9, 0F, 9F, -1.5F, 3F, -6F, -3F, 0F, -6F, -3F, 0F, 9F, -1.5F, 3F, 9F, -1.5F, 7F, -5F, -2F, 0F, -5F, -2F, 0F, 9F, -1.5F, 7F); // Box 0
		turretModel[28].setRotationPoint(-1.5F, -26.3F, 8F);

		turretModel[29].addShapeBox(28F, -2.4F, -13F, 2, 6, 9, 0F, 4F, -1.5F, 7F, 0F, -1F, 0F, 0F, -1F, 0F, 4F, -1.5F, 7F, 4F, -1F, 6F, 0F, -1F, 0F, 0F, -1F, 0F, 4F, -1F, 6F); // Box 1
		turretModel[29].setRotationPoint(-1.5F, -26.3F, 8F);

		turretModel[30].addShapeBox(28F, 0.6F, -13F, 3, 6, 9, 0F, 3F, -2F, 6F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, -2F, 6F, 3F, -1.5F, 5F, -2F, -2F, 0F, -2F, -2F, 0F, 3F, -1.5F, 5F); // Box 2
		turretModel[30].setRotationPoint(-2.5F, -26.3F, 8F);

		turretModel[31].addShapeBox(19F, -5F, -15F, 8, 1, 14, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[31].setRotationPoint(3F, -26.5F, 8F);

		turretModel[32].addShapeBox(-8F, -6F, -8F, 7, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[32].setRotationPoint(0F, -29.5F, 8F);

		turretModel[33].addShapeBox(-10F, -6F, -8F, 3, 3, 13, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 16
		turretModel[33].setRotationPoint(-1F, -29.5F, 8F);

		turretModel[34].addShapeBox(0F, -6F, -8F, 3, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 17
		turretModel[34].setRotationPoint(-1F, -29.5F, 8F);

		turretModel[35].addShapeBox(0F, -7F, -7F, 2, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 18
		turretModel[35].setRotationPoint(-1F, -29.5F, 8F);

		turretModel[36].addShapeBox(-8F, -7F, -7F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
		turretModel[36].setRotationPoint(0F, -29.5F, 8F);

		turretModel[37].addShapeBox(-9F, -7F, -7F, 2, 1, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 21
		turretModel[37].setRotationPoint(-1F, -29.5F, 8F);

		turretModel[38].addShapeBox(14F, -5.5F, -15F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		turretModel[38].setRotationPoint(0F, -26.5F, 7F);

		turretModel[39].addShapeBox(14F, -5.5F, -15F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		turretModel[39].setRotationPoint(0F, -26.5F, 20F);

		turretModel[40].addShapeBox(12F, -4F, -11F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 119
		turretModel[40].setRotationPoint(3F, -29.5F, 8F);

		turretModel[41].addShapeBox(9F, -4F, -11F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 120
		turretModel[41].setRotationPoint(3F, -29.5F, 8F);

		turretModel[42].addShapeBox(8F, -4F, -11F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 121
		turretModel[42].setRotationPoint(3F, -29.5F, 8F);

		turretModel[43].addShapeBox(-4F, -3.5F, -19F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 122
		turretModel[43].setRotationPoint(3F, -29.5F, 8F);

		turretModel[44].addShapeBox(-11F, -3.5F, -19F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 123
		turretModel[44].setRotationPoint(3F, -29.5F, 8F);

		turretModel[45].addShapeBox(-12F, -3.5F, -19F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 124
		turretModel[45].setRotationPoint(3F, -29.5F, 8F);

		turretModel[46].addShapeBox(-26F, 0.5F, -1F, 2, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		turretModel[46].setRotationPoint(3F, -29.5F, 8F);

		turretModel[47].addShapeBox(-26F, 0F, -1F, 2, 1, 5, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		turretModel[47].setRotationPoint(3F, -30F, 8F);

		turretModel[48].addShapeBox(-30F, 1F, 1F, 4, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 8
		turretModel[48].setRotationPoint(3F, -29.5F, 8F);

		turretModel[49].addShapeBox(-12F, 6F, 15F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 78
		turretModel[49].setRotationPoint(0F, -26.5F, 0F);
		turretModel[49].rotateAngleX = 0.68067841F;

		turretModel[50].addShapeBox(-2F, 6F, 15F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 79
		turretModel[50].setRotationPoint(0F, -26.5F, 0F);
		turretModel[50].rotateAngleX = 0.68067841F;

		turretModel[51].addShapeBox(-11F, 6F, 16F, 9, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 80
		turretModel[51].setRotationPoint(0F, -26.5F, 0F);
		turretModel[51].rotateAngleX = 0.68067841F;

		turretModel[52].addShapeBox(-11F, 3F, 20.5F, 9, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 81
		turretModel[52].setRotationPoint(0F, -26.5F, 0F);

		turretModel[53].addShapeBox(-2F, 3F, 19.5F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 82
		turretModel[53].setRotationPoint(0F, -26.5F, 0F);

		turretModel[54].addShapeBox(-12F, 3F, 19.5F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 83
		turretModel[54].setRotationPoint(0F, -26.5F, 0F);

		turretModel[55].addShapeBox(-11F, 4F, -21.5F, 9, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 106
		turretModel[55].setRotationPoint(0F, -26.5F, 0F);
		turretModel[55].rotateAngleX = 6.26573201F;

		turretModel[56].addShapeBox(-12F, 4F, -21.5F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 107
		turretModel[56].setRotationPoint(0F, -26.5F, 0F);
		turretModel[56].rotateAngleX = 6.26573201F;

		turretModel[57].addShapeBox(-2F, 4F, -21.5F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 108
		turretModel[57].setRotationPoint(0F, -26.5F, 0F);
		turretModel[57].rotateAngleX = 6.26573201F;

		turretModel[58].addShapeBox(-2F, 7F, -17F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 109
		turretModel[58].setRotationPoint(0F, -26.5F, 0F);
		turretModel[58].rotateAngleX = 5.58505361F;

		turretModel[59].addShapeBox(-11F, 7F, -17F, 9, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 110
		turretModel[59].setRotationPoint(0F, -26.5F, 0F);
		turretModel[59].rotateAngleX = 5.58505361F;

		turretModel[60].addShapeBox(-12F, 7F, -17F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 111
		turretModel[60].setRotationPoint(0F, -26.5F, 0F);
		turretModel[60].rotateAngleX = 5.58505361F;

		turretModel[61].addShapeBox(14.5F, -6.5F, -14.5F, 2, 2, 2, 0F, -0.5F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 129
		turretModel[61].setRotationPoint(0F, -26.5F, 7F);

		turretModel[62].addShapeBox(14.5F, -6.5F, -14.5F, 2, 2, 2, 0F, -0.5F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 130
		turretModel[62].setRotationPoint(0F, -26.5F, 20F);

		turretModel[63].addShapeBox(-2.5F, -6.6F, -15F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		turretModel[63].setRotationPoint(0F, -26.5F, 7F);

		turretModel[64].addShapeBox(-2F, -7.6F, -14.5F, 2, 2, 2, 0F, -0.5F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 132
		turretModel[64].setRotationPoint(0F, -26.5F, 7F);

		turretModel[65].addShapeBox(-11F, -2F, 19.5F, 9, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 146
		turretModel[65].setRotationPoint(0F, -26.5F, 0F);

		turretModel[66].addShapeBox(-2F, -2F, 18.5F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 147
		turretModel[66].setRotationPoint(0F, -26.5F, 0F);

		turretModel[67].addShapeBox(-12F, -2F, 18.5F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 148
		turretModel[67].setRotationPoint(0F, -26.5F, 0F);

		turretModel[68].addShapeBox(-12F, -1F, -21.5F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 149
		turretModel[68].setRotationPoint(0F, -26.5F, 1F);
		turretModel[68].rotateAngleX = 6.26573201F;

		turretModel[69].addShapeBox(-11F, -1F, -21.5F, 9, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 150
		turretModel[69].setRotationPoint(0F, -26.5F, 1F);
		turretModel[69].rotateAngleX = 6.26573201F;

		turretModel[70].addShapeBox(-2F, -1F, -21.5F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 151
		turretModel[70].setRotationPoint(0F, -26.5F, 1F);
		turretModel[70].rotateAngleX = 6.26573201F;

		turretModel[71].addShapeBox(-24F, -0.5F, -2.5F, 6, 4, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 158
		turretModel[71].setRotationPoint(3F, -29.5F, 8F);

		turretModel[72].addShapeBox(-24F, -1.5F, -2.5F, 6, 1, 8, 0F, 0F, -0.6F, -2F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, -0.6F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 159
		turretModel[72].setRotationPoint(3F, -29.5F, 8F);

		turretModel[73].addShapeBox(-24F, 3.5F, -2.5F, 6, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.6F, -2F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, -0.6F, -2F); // Box 161
		turretModel[73].setRotationPoint(3F, -29.5F, 8F);

		turretModel[74].addShapeBox(-26F, 3F, -1F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -1.5F); // Box 244
		turretModel[74].setRotationPoint(3F, -30F, 8F);

		turretModel[75].addShapeBox(3F, -15.5F, -15.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 5
		turretModel[75].setRotationPoint(0F, -27.5F, 0F);
		turretModel[75].rotateAngleX = 0.82030475F;
		turretModel[75].rotateAngleY = 0.26179939F;
		turretModel[75].rotateAngleZ = -0.03490659F;

		turretModel[76].addShapeBox(4F, -15.5F, -15.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[76].setRotationPoint(0F, -27.5F, 0F);
		turretModel[76].rotateAngleX = 0.82030475F;
		turretModel[76].rotateAngleY = 0.26179939F;
		turretModel[76].rotateAngleZ = -0.03490659F;

		turretModel[77].addShapeBox(6F, -15.5F, -15.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 7
		turretModel[77].setRotationPoint(0F, -27.5F, 0F);
		turretModel[77].rotateAngleX = 0.82030475F;
		turretModel[77].rotateAngleY = 0.26179939F;
		turretModel[77].rotateAngleZ = -0.03490659F;

		turretModel[78].addShapeBox(7F, -15.5F, -15.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 8
		turretModel[78].setRotationPoint(0F, -27.5F, 0F);
		turretModel[78].rotateAngleX = 0.82030475F;
		turretModel[78].rotateAngleY = 0.26179939F;
		turretModel[78].rotateAngleZ = -0.03490659F;

		turretModel[79].addShapeBox(8F, -15.5F, -15.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		turretModel[79].setRotationPoint(0F, -27.5F, 0F);
		turretModel[79].rotateAngleX = 0.82030475F;
		turretModel[79].rotateAngleY = 0.26179939F;
		turretModel[79].rotateAngleZ = -0.03490659F;

		turretModel[80].addShapeBox(10F, -15.5F, -15.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 10
		turretModel[80].setRotationPoint(0F, -27.5F, 0F);
		turretModel[80].rotateAngleX = 0.82030475F;
		turretModel[80].rotateAngleY = 0.26179939F;
		turretModel[80].rotateAngleZ = -0.03490659F;

		turretModel[81].addShapeBox(11F, -15.5F, -15.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 11
		turretModel[81].setRotationPoint(0F, -27.5F, 0F);
		turretModel[81].rotateAngleX = 0.82030475F;
		turretModel[81].rotateAngleY = 0.26179939F;
		turretModel[81].rotateAngleZ = -0.03490659F;

		turretModel[82].addShapeBox(12F, -15.5F, -15.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[82].setRotationPoint(0F, -27.5F, 0F);
		turretModel[82].rotateAngleX = 0.82030475F;
		turretModel[82].rotateAngleY = 0.26179939F;
		turretModel[82].rotateAngleZ = -0.03490659F;

		turretModel[83].addShapeBox(14F, -15.5F, -15.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		turretModel[83].setRotationPoint(0F, -27.5F, 0F);
		turretModel[83].rotateAngleX = 0.82030475F;
		turretModel[83].rotateAngleY = 0.26179939F;
		turretModel[83].rotateAngleZ = -0.03490659F;

		turretModel[84].addShapeBox(12.5F, -16.5F, -10F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[84].setRotationPoint(0F, -27.5F, 0F);
		turretModel[84].rotateAngleX = 0.82030475F;
		turretModel[84].rotateAngleY = 0.26179939F;
		turretModel[84].rotateAngleZ = -0.03490659F;

		turretModel[85].addShapeBox(9.5F, -16.5F, -10F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[85].setRotationPoint(0F, -27.5F, 0F);
		turretModel[85].rotateAngleX = 0.82030475F;
		turretModel[85].rotateAngleY = 0.26179939F;
		turretModel[85].rotateAngleZ = -0.03490659F;

		turretModel[86].addShapeBox(6.5F, -16.5F, -10F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		turretModel[86].setRotationPoint(0F, -27.5F, 0F);
		turretModel[86].rotateAngleX = 0.82030475F;
		turretModel[86].rotateAngleY = 0.26179939F;
		turretModel[86].rotateAngleZ = -0.03490659F;

		turretModel[87].addShapeBox(3.5F, -16.5F, -10F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[87].setRotationPoint(0F, -27.5F, 0F);
		turretModel[87].rotateAngleX = 0.82030475F;
		turretModel[87].rotateAngleY = 0.26179939F;
		turretModel[87].rotateAngleZ = -0.03490659F;

		turretModel[88].addShapeBox(-6.5F, -15.5F, -11.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		turretModel[88].setRotationPoint(0F, -29.5F, 0F);
		turretModel[88].rotateAngleX = 0.85521133F;
		turretModel[88].rotateAngleY = 2.82743339F;

		turretModel[89].addShapeBox(-9.5F, -15.5F, -11.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		turretModel[89].setRotationPoint(0F, -29.5F, 0F);
		turretModel[89].rotateAngleX = 0.85521133F;
		turretModel[89].rotateAngleY = 2.82743339F;

		turretModel[90].addShapeBox(-12.5F, -15.5F, -11.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		turretModel[90].setRotationPoint(0F, -29.5F, 0F);
		turretModel[90].rotateAngleX = 0.85521133F;
		turretModel[90].rotateAngleY = 2.82743339F;

		turretModel[91].addShapeBox(-15.5F, -15.5F, -11.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		turretModel[91].setRotationPoint(0F, -29.5F, 0F);
		turretModel[91].rotateAngleX = 0.85521133F;
		turretModel[91].rotateAngleY = 2.82743339F;

		turretModel[92].addShapeBox(-5F, -14.5F, -17F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 22
		turretModel[92].setRotationPoint(0F, -29.5F, 0F);
		turretModel[92].rotateAngleX = 0.85521133F;
		turretModel[92].rotateAngleY = 2.82743339F;

		turretModel[93].addShapeBox(-7F, -14.5F, -17F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		turretModel[93].setRotationPoint(0F, -29.5F, 0F);
		turretModel[93].rotateAngleX = 0.85521133F;
		turretModel[93].rotateAngleY = 2.82743339F;

		turretModel[94].addShapeBox(-8F, -14.5F, -17F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		turretModel[94].setRotationPoint(0F, -29.5F, 0F);
		turretModel[94].rotateAngleX = 0.85521133F;
		turretModel[94].rotateAngleY = 2.82743339F;

		turretModel[95].addShapeBox(-9F, -14.5F, -17F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 25
		turretModel[95].setRotationPoint(0F, -29.5F, 0F);
		turretModel[95].rotateAngleX = 0.85521133F;
		turretModel[95].rotateAngleY = 2.82743339F;

		turretModel[96].addShapeBox(-11F, -14.5F, -17F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[96].setRotationPoint(0F, -29.5F, 0F);
		turretModel[96].rotateAngleX = 0.85521133F;
		turretModel[96].rotateAngleY = 2.82743339F;

		turretModel[97].addShapeBox(-12F, -14.5F, -17F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
		turretModel[97].setRotationPoint(0F, -29.5F, 0F);
		turretModel[97].rotateAngleX = 0.85521133F;
		turretModel[97].rotateAngleY = 2.82743339F;

		turretModel[98].addShapeBox(-13F, -14.5F, -17F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 28
		turretModel[98].setRotationPoint(0F, -29.5F, 0F);
		turretModel[98].rotateAngleX = 0.85521133F;
		turretModel[98].rotateAngleY = 2.82743339F;

		turretModel[99].addShapeBox(-15F, -14.5F, -17F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[99].setRotationPoint(0F, -29.5F, 0F);
		turretModel[99].rotateAngleX = 0.85521133F;
		turretModel[99].rotateAngleY = 2.82743339F;

		turretModel[100].addShapeBox(-16F, -14.5F, -17F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 30
		turretModel[100].setRotationPoint(0F, -29.5F, 0F);
		turretModel[100].rotateAngleX = 0.85521133F;
		turretModel[100].rotateAngleY = 2.82743339F;

		turretModel[101].addShapeBox(-4F, -20F, -11.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 31
		turretModel[101].setRotationPoint(0F, -24.5F, 0F);
		turretModel[101].rotateAngleX = 1.13446401F;
		turretModel[101].rotateAngleY = -1.57079633F;

		turretModel[102].addShapeBox(-3F, -20F, -11.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[102].setRotationPoint(0F, -24.5F, 0F);
		turretModel[102].rotateAngleX = 1.13446401F;
		turretModel[102].rotateAngleY = -1.57079633F;

		turretModel[103].addShapeBox(-1F, -20F, -11.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 33
		turretModel[103].setRotationPoint(0F, -24.5F, 0F);
		turretModel[103].rotateAngleX = 1.13446401F;
		turretModel[103].rotateAngleY = -1.57079633F;

		turretModel[104].addShapeBox(0F, -20F, -11.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 34
		turretModel[104].setRotationPoint(0F, -24.5F, 0F);
		turretModel[104].rotateAngleX = 1.13446401F;
		turretModel[104].rotateAngleY = -1.57079633F;

		turretModel[105].addShapeBox(1F, -20F, -11.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[105].setRotationPoint(0F, -24.5F, 0F);
		turretModel[105].rotateAngleX = 1.13446401F;
		turretModel[105].rotateAngleY = -1.57079633F;

		turretModel[106].addShapeBox(3F, -20F, -11.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 36
		turretModel[106].setRotationPoint(0F, -24.5F, 0F);
		turretModel[106].rotateAngleX = 1.13446401F;
		turretModel[106].rotateAngleY = -1.57079633F;

		turretModel[107].addShapeBox(7F, -20F, -11.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 37
		turretModel[107].setRotationPoint(0F, -24.5F, 0F);
		turretModel[107].rotateAngleX = 1.13446401F;
		turretModel[107].rotateAngleY = -1.57079633F;

		turretModel[108].addShapeBox(4F, -20F, -11.5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 38
		turretModel[108].setRotationPoint(0F, -24.5F, 0F);
		turretModel[108].rotateAngleX = 1.13446401F;
		turretModel[108].rotateAngleY = -1.57079633F;

		turretModel[109].addShapeBox(5.5F, -22F, -7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		turretModel[109].setRotationPoint(0F, -24.5F, 1F);
		turretModel[109].rotateAngleX = 1.13446401F;
		turretModel[109].rotateAngleY = -1.57079633F;

		turretModel[110].addShapeBox(2.5F, -22F, -7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		turretModel[110].setRotationPoint(0F, -24.5F, 1F);
		turretModel[110].rotateAngleX = 1.13446401F;
		turretModel[110].rotateAngleY = -1.57079633F;

		turretModel[111].addShapeBox(5F, -20F, -11.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		turretModel[111].setRotationPoint(0F, -24.5F, 0F);
		turretModel[111].rotateAngleX = 1.13446401F;
		turretModel[111].rotateAngleY = -1.57079633F;

		turretModel[112].addShapeBox(-0.5F, -22F, -7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		turretModel[112].setRotationPoint(0F, -24.5F, 1F);
		turretModel[112].rotateAngleX = 1.13446401F;
		turretModel[112].rotateAngleY = -1.57079633F;

		turretModel[113].addShapeBox(-3.5F, -22F, -7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		turretModel[113].setRotationPoint(0F, -24.5F, 1F);
		turretModel[113].rotateAngleX = 1.13446401F;
		turretModel[113].rotateAngleY = -1.57079633F;

		turretModel[114].addShapeBox(0F, -2F, 18.4F, 41, 41, 1, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 0
		turretModel[114].setRotationPoint(0F, -24F, 0F);
		turretModel[114].rotateAngleX = 0.13962634F;

		turretModel[115].addShapeBox(0F, -2F, -19.4F, 41, 41, 1, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 1
		turretModel[115].setRotationPoint(0F, -24F, 0F);
		turretModel[115].rotateAngleX = -0.13962634F;

		turretModel[116].addShapeBox(-11F, 12F, -21F, 9, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 5
		turretModel[116].setRotationPoint(0F, -26.5F, 0F);
		turretModel[116].rotateAngleX = 5.93411946F;
		turretModel[116].rotateAngleY = -1.57079633F;

		turretModel[117].addShapeBox(-12F, 12F, -21F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 6
		turretModel[117].setRotationPoint(0F, -26.5F, 0F);
		turretModel[117].rotateAngleX = 5.93411946F;
		turretModel[117].rotateAngleY = -1.57079633F;

		turretModel[118].addShapeBox(-2F, 12F, -21F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 7
		turretModel[118].setRotationPoint(0F, -26.5F, 0F);
		turretModel[118].rotateAngleX = 5.93411946F;
		turretModel[118].rotateAngleY = -1.57079633F;

		turretModel[119].addShapeBox(2F, 12F, -21F, 9, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 8
		turretModel[119].setRotationPoint(0F, -26.5F, 0F);
		turretModel[119].rotateAngleX = 5.93411946F;
		turretModel[119].rotateAngleY = -1.57079633F;

		turretModel[120].addShapeBox(1F, 12F, -21F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 9
		turretModel[120].setRotationPoint(0F, -26.5F, 0F);
		turretModel[120].rotateAngleX = 5.93411946F;
		turretModel[120].rotateAngleY = -1.57079633F;

		turretModel[121].addShapeBox(11F, 12F, -21F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 10
		turretModel[121].setRotationPoint(0F, -26.5F, 0F);
		turretModel[121].rotateAngleX = 5.93411946F;
		turretModel[121].rotateAngleY = -1.57079633F;

		turretModel[122].addShapeBox(-28.1F, 1F, 1F, 4, 1, 1, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F); // Box 0
		turretModel[122].setRotationPoint(3F, -29.5F, 8F);

		turretModel[123].addShapeBox(-32.1F, 1F, 1F, 4, 1, 1, 0F, -1.4F, -0.1F, -0.1F, -1.4F, -0.1F, -0.1F, -1.4F, -0.1F, -0.1F, -1.4F, -0.1F, -0.1F, -1.4F, -0.1F, -0.1F, -1.4F, -0.1F, -0.1F, -1.4F, -0.1F, -0.1F, -1.4F, -0.1F, -0.1F); // Box 1
		turretModel[123].setRotationPoint(3F, -29.5F, 8F);


		barrelModel = new ModelRendererTurbo[16];
		barrelModel[0] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 41
		barrelModel[1] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 42
		barrelModel[2] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 43
		barrelModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 247
		barrelModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 245
		barrelModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 248
		barrelModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 246
		barrelModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 242
		barrelModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 249
		barrelModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 243
		barrelModel[10] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 250
		barrelModel[11] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 244
		barrelModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 239
		barrelModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 238
		barrelModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 4
		barrelModel[15] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 5

		barrelModel[0].addShapeBox(1F, -2.5F, -2.5F, 3, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		barrelModel[0].setRotationPoint(26F, -26.2F, 0F);

		barrelModel[1].addShapeBox(4F, -2.5F, -2.5F, 2, 5, 5, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.3F, -0.3F); // Box 42
		barrelModel[1].setRotationPoint(26F, -26.2F, 0F);

		barrelModel[2].addShapeBox(6F, -2.5F, -2.5F, 56, 5, 5, 0F, 0F, -1F, -1F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, -1F, -1F); // Box 43
		barrelModel[2].setRotationPoint(26F, -26.2F, 0F);

		barrelModel[3].addShapeBox(70F, -1.5F, 1.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		barrelModel[3].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[4].addShapeBox(70F, -2.5F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		barrelModel[4].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[5].addShapeBox(70F, -1.5F, -2.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		barrelModel[5].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[6].addShapeBox(70F, 1.5F, -2.5F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 246
		barrelModel[6].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[7].addShapeBox(67F, -1.5F, 1.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		barrelModel[7].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[8].addShapeBox(68F, -2.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		barrelModel[8].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[9].addShapeBox(67F, -1.5F, -2.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		barrelModel[9].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[10].addShapeBox(68F, 1.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		barrelModel[10].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[11].addShapeBox(67F, 1.5F, -2.5F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 244
		barrelModel[11].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[12].addShapeBox(67F, -2.5F, -2.5F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		barrelModel[12].setRotationPoint(25F, -26.2F, 0F);

		barrelModel[13].addShapeBox(63F, 1F, -1F, 3, 1, 2, 0F, 0F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 238
		barrelModel[13].setRotationPoint(26F, -26.2F, 0F);

		barrelModel[14].addShapeBox(62F, -2.5F, -2.5F, 1, 5, 5, 0F, 0F, -1.3F, -1.3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.3F, -1.3F); // Box 4
		barrelModel[14].setRotationPoint(26F, -26.2F, 0F);

		barrelModel[15].addShapeBox(63F, -2F, -1F, 3, 1, 2, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, 0.5F); // Box 5
		barrelModel[15].setRotationPoint(26F, -26.2F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[17];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 112
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 113
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 114
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 115
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 116
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 117
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 118
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 119
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 120
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 121
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 122
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 123
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 321, 259, textureX, textureY); // Shape 124
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 321, 259, textureX, textureY); // Shape 125
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 126
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 127
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 128

		leftTrackWheelModels[0].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 112
		leftTrackWheelModels[0].setRotationPoint(-49F, 0.5F, 25.5F);

		leftTrackWheelModels[1].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 113
		leftTrackWheelModels[1].setRotationPoint(-49F, 0.5F, 20.5F);

		leftTrackWheelModels[2].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 114
		leftTrackWheelModels[2].setRotationPoint(-35F, 1F, 25.5F);

		leftTrackWheelModels[3].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 115
		leftTrackWheelModels[3].setRotationPoint(-35F, 1F, 20.5F);

		leftTrackWheelModels[4].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 116
		leftTrackWheelModels[4].setRotationPoint(-20F, 1F, 25.5F);

		leftTrackWheelModels[5].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 117
		leftTrackWheelModels[5].setRotationPoint(-20F, 1F, 20.5F);

		leftTrackWheelModels[6].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 118
		leftTrackWheelModels[6].setRotationPoint(-6F, 1F, 25.5F);

		leftTrackWheelModels[7].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 119
		leftTrackWheelModels[7].setRotationPoint(-6F, 1F, 20.5F);

		leftTrackWheelModels[8].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 120
		leftTrackWheelModels[8].setRotationPoint(8F, 1F, 25.5F);

		leftTrackWheelModels[9].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 121
		leftTrackWheelModels[9].setRotationPoint(8F, 1F, 20.5F);

		leftTrackWheelModels[10].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 122
		leftTrackWheelModels[10].setRotationPoint(22F, 0.5F, 25.5F);

		leftTrackWheelModels[11].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 123
		leftTrackWheelModels[11].setRotationPoint(22F, 0.5F, 20.5F);

		leftTrackWheelModels[12].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 7, 12, 12, 44, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 124
		leftTrackWheelModels[12].setRotationPoint(34F, -4.5F, 22F);

		leftTrackWheelModels[13].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 7, 12, 12, 44, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 125
		leftTrackWheelModels[13].setRotationPoint(-61F, -4.5F, 22F);

		leftTrackWheelModels[14].addShape3D(5F, -3F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 126
		leftTrackWheelModels[14].setRotationPoint(-42F, -7.5F, 19F);

		leftTrackWheelModels[15].addShape3D(5F, -3F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 127
		leftTrackWheelModels[15].setRotationPoint(-13F, -7.5F, 19F);

		leftTrackWheelModels[16].addShape3D(5F, -3F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 128
		leftTrackWheelModels[16].setRotationPoint(14.5F, -7.5F, 19F);


		rightTrackWheelModels = new ModelRendererTurbo[17];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 4
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 321, 259, textureX, textureY); // Shape 7
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 321, 259, textureX, textureY); // Shape 9
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 2
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 12
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 13
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 20
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 21
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 22
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 23
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 24
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 25
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 26
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 27
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 28
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 29
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 321, 293, textureX, textureY); // Shape 30

		rightTrackWheelModels[0].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 4
		rightTrackWheelModels[0].setRotationPoint(-49F, 0.5F, -16F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 7, 12, 12, 44, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 7
		rightTrackWheelModels[1].setRotationPoint(34F, -4.5F, -18.5F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 7, 12, 12, 44, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 9
		rightTrackWheelModels[2].setRotationPoint(-61F, -4.5F, -18.5F);

		rightTrackWheelModels[3].addShape3D(5F, -3F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 2
		rightTrackWheelModels[3].setRotationPoint(14.5F, -7.5F, -19F);

		rightTrackWheelModels[4].addShape3D(5F, -3F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 12
		rightTrackWheelModels[4].setRotationPoint(-13F, -7.5F, -19F);

		rightTrackWheelModels[5].addShape3D(5F, -3F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 13
		rightTrackWheelModels[5].setRotationPoint(-42F, -7.5F, -19F);

		rightTrackWheelModels[6].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 20
		rightTrackWheelModels[6].setRotationPoint(-49F, 0.5F, -21F);

		rightTrackWheelModels[7].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 21
		rightTrackWheelModels[7].setRotationPoint(-35F, 1F, -21F);

		rightTrackWheelModels[8].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 22
		rightTrackWheelModels[8].setRotationPoint(-35F, 1F, -16F);

		rightTrackWheelModels[9].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 23
		rightTrackWheelModels[9].setRotationPoint(-6F, 1F, -21F);

		rightTrackWheelModels[10].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 24
		rightTrackWheelModels[10].setRotationPoint(-6F, 1F, -16F);

		rightTrackWheelModels[11].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 25
		rightTrackWheelModels[11].setRotationPoint(-20F, 1F, -16F);

		rightTrackWheelModels[12].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 26
		rightTrackWheelModels[12].setRotationPoint(-20F, 1F, -21F);

		rightTrackWheelModels[13].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 27
		rightTrackWheelModels[13].setRotationPoint(22F, 0.5F, -16F);

		rightTrackWheelModels[14].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 28
		rightTrackWheelModels[14].setRotationPoint(22F, 0.5F, -21F);

		rightTrackWheelModels[15].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 29
		rightTrackWheelModels[15].setRotationPoint(8F, 1F, -21F);

		rightTrackWheelModels[16].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 3, 12, 11, 40, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 30
		rightTrackWheelModels[16].setRotationPoint(8F, 1F, -16F);


		leftTrackModel = new ModelRendererTurbo[23];
		leftTrackModel[0] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 38
		leftTrackModel[1] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 39
		leftTrackModel[2] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 40
		leftTrackModel[3] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 41
		leftTrackModel[4] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 42
		leftTrackModel[5] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 43
		leftTrackModel[6] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 44
		leftTrackModel[7] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 45
		leftTrackModel[8] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 46
		leftTrackModel[9] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 47
		leftTrackModel[10] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 48
		leftTrackModel[11] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 49
		leftTrackModel[12] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 50
		leftTrackModel[13] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 51
		leftTrackModel[14] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 52
		leftTrackModel[15] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 53
		leftTrackModel[16] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 54
		leftTrackModel[17] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 55
		leftTrackModel[18] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 56
		leftTrackModel[19] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 57
		leftTrackModel[20] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 58
		leftTrackModel[21] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 59
		leftTrackModel[22] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 60

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		leftTrackModel[0].setRotationPoint(36.5F, -11.5F, 15.5F);
		leftTrackModel[0].rotateAngleZ = -0.64577182F;

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		leftTrackModel[1].setRotationPoint(40.8F, -8.5F, 15.5F);
		leftTrackModel[1].rotateAngleZ = -1.57079633F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackModel[2].setRotationPoint(31.6F, 5.1F, 15.5F);
		leftTrackModel[2].rotateAngleZ = -2.95833308F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 67, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftTrackModel[3].setRotationPoint(19F, 7.5F, 15.5F);
		leftTrackModel[3].rotateAngleZ = -3.14159265F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 18, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftTrackModel[4].setRotationPoint(-47.5F, 7.6F, 15.5F);
		leftTrackModel[4].rotateAngleZ = 2.84488668F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftTrackModel[5].setRotationPoint(-68F, -0.5F, 15.5F);
		leftTrackModel[5].rotateAngleZ = 1.57079633F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftTrackModel[6].setRotationPoint(-68F, -7.5F, 15.5F);
		leftTrackModel[6].rotateAngleZ = 0.85521133F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftTrackModel[7].setRotationPoint(-64.5F, -11.5F, 15.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackModel[8].setRotationPoint(40.8F, 0F, 15.5F);
		leftTrackModel[8].rotateAngleZ = -2.63544717F;

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 47
		leftTrackModel[9].setRotationPoint(-64.5F, 2.5F, 15.5F);
		leftTrackModel[9].rotateAngleZ = 2.42600766F;

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		leftTrackModel[10].setRotationPoint(-58F, -11.5F, 15.5F);
		leftTrackModel[10].rotateAngleZ = -0.10471976F;

		leftTrackModel[11].addShapeBox(0F, -1F, 0F, 6, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftTrackModel[11].setRotationPoint(-52.2F, -9.9F, 15.5F);
		leftTrackModel[11].rotateAngleZ = 0.01745329F;

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		leftTrackModel[12].setRotationPoint(-46.3F, -11F, 15.5F);
		leftTrackModel[12].rotateAngleZ = 0.10471976F;

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftTrackModel[13].setRotationPoint(-41.3F, -11.5F, 15.5F);
		leftTrackModel[13].rotateAngleZ = -0.10471976F;

		leftTrackModel[14].addShapeBox(0F, -1F, 0F, 17, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftTrackModel[14].setRotationPoint(-36.4F, -9.9F, 15.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		leftTrackModel[15].setRotationPoint(-19.5F, -10.9F, 15.5F);
		leftTrackModel[15].rotateAngleZ = 0.08726646F;

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftTrackModel[16].setRotationPoint(-13.5F, -11.3F, 15.5F);
		leftTrackModel[16].rotateAngleZ = -0.10471976F;

		leftTrackModel[17].addShapeBox(0F, -1F, 0F, 17, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		leftTrackModel[17].setRotationPoint(-8.6F, -9.8F, 15.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		leftTrackModel[18].setRotationPoint(8.3F, -10.8F, 15.5F);
		leftTrackModel[18].rotateAngleZ = 0.08726646F;

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftTrackModel[19].setRotationPoint(13.3F, -11.2F, 15.5F);
		leftTrackModel[19].rotateAngleZ = -0.06981317F;

		leftTrackModel[20].addShapeBox(0F, -1F, 0F, 9, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftTrackModel[20].setRotationPoint(18.4F, -9.8F, 15.5F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftTrackModel[21].setRotationPoint(27.3F, -10.8F, 15.5F);
		leftTrackModel[21].rotateAngleZ = 0.13962634F;

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		leftTrackModel[22].setRotationPoint(32F, -11.5F, 15.5F);


		rightTrackModel = new ModelRendererTurbo[23];
		rightTrackModel[0] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 31
		rightTrackModel[1] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 32
		rightTrackModel[2] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 33
		rightTrackModel[3] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 34
		rightTrackModel[4] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 35
		rightTrackModel[5] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 36
		rightTrackModel[6] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 37
		rightTrackModel[7] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 38
		rightTrackModel[8] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 39
		rightTrackModel[9] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 40
		rightTrackModel[10] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 41
		rightTrackModel[11] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 42
		rightTrackModel[12] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 43
		rightTrackModel[13] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 44
		rightTrackModel[14] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 45
		rightTrackModel[15] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 46
		rightTrackModel[16] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 47
		rightTrackModel[17] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 48
		rightTrackModel[18] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 49
		rightTrackModel[19] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 50
		rightTrackModel[20] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 51
		rightTrackModel[21] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 52
		rightTrackModel[22] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 53

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightTrackModel[0].setRotationPoint(36.5F, -11.5F, -26.5F);
		rightTrackModel[0].rotateAngleZ = -0.64577182F;

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightTrackModel[1].setRotationPoint(40.8F, -8.5F, -26.5F);
		rightTrackModel[1].rotateAngleZ = -1.57079633F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightTrackModel[2].setRotationPoint(31.6F, 5.1F, -26.5F);
		rightTrackModel[2].rotateAngleZ = -2.95833308F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 67, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackModel[3].setRotationPoint(19F, 7.5F, -26.5F);
		rightTrackModel[3].rotateAngleZ = -3.14159265F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 18, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightTrackModel[4].setRotationPoint(-47.5F, 7.6F, -26.5F);
		rightTrackModel[4].rotateAngleZ = 2.84488668F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		rightTrackModel[5].setRotationPoint(-68F, -0.5F, -26.5F);
		rightTrackModel[5].rotateAngleZ = 1.57079633F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightTrackModel[6].setRotationPoint(-68F, -7.5F, -26.5F);
		rightTrackModel[6].rotateAngleZ = 0.85521133F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		rightTrackModel[7].setRotationPoint(-64.5F, -11.5F, -26.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		rightTrackModel[8].setRotationPoint(40.8F, 0F, -26.5F);
		rightTrackModel[8].rotateAngleZ = -2.63544717F;

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 40
		rightTrackModel[9].setRotationPoint(-64.5F, 2.5F, -26.5F);
		rightTrackModel[9].rotateAngleZ = 2.42600766F;

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		rightTrackModel[10].setRotationPoint(-58F, -11.5F, -26.5F);
		rightTrackModel[10].rotateAngleZ = -0.10471976F;

		rightTrackModel[11].addShapeBox(0F, -1F, 0F, 6, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		rightTrackModel[11].setRotationPoint(-52.2F, -9.9F, -26.5F);
		rightTrackModel[11].rotateAngleZ = 0.01745329F;

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		rightTrackModel[12].setRotationPoint(-46.3F, -11F, -26.5F);
		rightTrackModel[12].rotateAngleZ = 0.10471976F;

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		rightTrackModel[13].setRotationPoint(-41.3F, -11.5F, -26.5F);
		rightTrackModel[13].rotateAngleZ = -0.10471976F;

		rightTrackModel[14].addShapeBox(0F, -1F, 0F, 17, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		rightTrackModel[14].setRotationPoint(-36.4F, -9.9F, -26.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rightTrackModel[15].setRotationPoint(-19.5F, -10.9F, -26.5F);
		rightTrackModel[15].rotateAngleZ = 0.08726646F;

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightTrackModel[16].setRotationPoint(-13.5F, -11.3F, -26.5F);
		rightTrackModel[16].rotateAngleZ = -0.10471976F;

		rightTrackModel[17].addShapeBox(0F, -1F, 0F, 17, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		rightTrackModel[17].setRotationPoint(-8.6F, -9.8F, -26.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightTrackModel[18].setRotationPoint(8.3F, -10.8F, -26.5F);
		rightTrackModel[18].rotateAngleZ = 0.08726646F;

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightTrackModel[19].setRotationPoint(13.3F, -11.2F, -26.5F);
		rightTrackModel[19].rotateAngleZ = -0.06981317F;

		rightTrackModel[20].addShapeBox(0F, -1F, 0F, 9, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		rightTrackModel[20].setRotationPoint(18.4F, -9.8F, -26.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		rightTrackModel[21].setRotationPoint(27.3F, -10.8F, -26.5F);
		rightTrackModel[21].rotateAngleZ = 0.13962634F;

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightTrackModel[22].setRotationPoint(32F, -11.5F, -26.5F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
