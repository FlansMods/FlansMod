//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.apocalypse.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelBuggy extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBuggy() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[206];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 46
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		bodyModel[23] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		bodyModel[26] = new ModelRendererTurbo(this, 0, 59, textureX, textureY); // Box 10
		bodyModel[27] = new ModelRendererTurbo(this, 0, 73, textureX, textureY); // Box 11
		bodyModel[28] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 12
		bodyModel[29] = new ModelRendererTurbo(this, 0, 59, textureX, textureY); // Box 13
		bodyModel[30] = new ModelRendererTurbo(this, 0, 73, textureX, textureY); // Box 14
		bodyModel[31] = new ModelRendererTurbo(this, 0, 59, textureX, textureY); // Box 15
		bodyModel[32] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 16
		bodyModel[33] = new ModelRendererTurbo(this, 0, 73, textureX, textureY); // Box 17
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		bodyModel[37] = new ModelRendererTurbo(this, 127, 122, textureX, textureY); // Box 24
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		bodyModel[39] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 26
		bodyModel[40] = new ModelRendererTurbo(this, 97, 124, textureX, textureY); // Box 27
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		bodyModel[43] = new ModelRendererTurbo(this, 97, 122, textureX, textureY); // Box 31
		bodyModel[44] = new ModelRendererTurbo(this, 63, 129, textureX, textureY); // Box 32
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 46
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		bodyModel[63] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 52
		bodyModel[64] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 54
		bodyModel[65] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 55
		bodyModel[66] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 56
		bodyModel[67] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 57
		bodyModel[68] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 63
		bodyModel[69] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 64
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		bodyModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		bodyModel[75] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 8
		bodyModel[76] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 9
		bodyModel[77] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 12
		bodyModel[78] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 13
		bodyModel[79] = new ModelRendererTurbo(this, 85, 55, textureX, textureY); // Box 14
		bodyModel[80] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 82
		bodyModel[81] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 83
		bodyModel[82] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 84
		bodyModel[83] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 85
		bodyModel[84] = new ModelRendererTurbo(this, 85, 55, textureX, textureY); // Box 86
		bodyModel[85] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 92
		bodyModel[86] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 93
		bodyModel[87] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 94
		bodyModel[88] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 95
		bodyModel[89] = new ModelRendererTurbo(this, 30, 55, textureX, textureY); // Box 96
		bodyModel[90] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 97
		bodyModel[91] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 98
		bodyModel[92] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 99
		bodyModel[93] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 100
		bodyModel[94] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 101
		bodyModel[95] = new ModelRendererTurbo(this, 30, 55, textureX, textureY); // Box 102
		bodyModel[96] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 103
		bodyModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		bodyModel[98] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 106
		bodyModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		bodyModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		bodyModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		bodyModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		bodyModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		bodyModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		bodyModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 123
		bodyModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		bodyModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		bodyModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		bodyModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 127
		bodyModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		bodyModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		bodyModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		bodyModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		bodyModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		bodyModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 135
		bodyModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		bodyModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		bodyModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 144
		bodyModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 147
		bodyModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 148
		bodyModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 149
		bodyModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 150
		bodyModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 151
		bodyModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 159
		bodyModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 160
		bodyModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 161
		bodyModel[135] = new ModelRendererTurbo(this, 72, 96, textureX, textureY); // Box 162
		bodyModel[136] = new ModelRendererTurbo(this, 40, 68, textureX, textureY); // Box 163
		bodyModel[137] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 164
		bodyModel[138] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 165
		bodyModel[139] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 166
		bodyModel[140] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 167
		bodyModel[141] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 168
		bodyModel[142] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 169
		bodyModel[143] = new ModelRendererTurbo(this, 87, 18, textureX, textureY); // Box 170
		bodyModel[144] = new ModelRendererTurbo(this, 87, 5, textureX, textureY); // Box 171
		bodyModel[145] = new ModelRendererTurbo(this, 54, 11, textureX, textureY); // Box 172
		bodyModel[146] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 173
		bodyModel[147] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 174
		bodyModel[148] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 175
		bodyModel[149] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 176
		bodyModel[150] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 177
		bodyModel[151] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 178
		bodyModel[152] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 179
		bodyModel[153] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 180
		bodyModel[154] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 181
		bodyModel[155] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 182
		bodyModel[156] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 183
		bodyModel[157] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 184
		bodyModel[158] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 185
		bodyModel[159] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 186
		bodyModel[160] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 187
		bodyModel[161] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 188
		bodyModel[162] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 189
		bodyModel[163] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 190
		bodyModel[164] = new ModelRendererTurbo(this, 87, 30, textureX, textureY); // Box 191
		bodyModel[165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 192
		bodyModel[166] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 193
		bodyModel[167] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 194
		bodyModel[168] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 195
		bodyModel[169] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 211
		bodyModel[170] = new ModelRendererTurbo(this, 0, 78, textureX, textureY); // Box 212
		bodyModel[171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 213
		bodyModel[172] = new ModelRendererTurbo(this, 0, 78, textureX, textureY); // Box 214
		bodyModel[173] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 215
		bodyModel[174] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 216
		bodyModel[175] = new ModelRendererTurbo(this, 19, 53, textureX, textureY); // Box 218
		bodyModel[176] = new ModelRendererTurbo(this, 6, 49, textureX, textureY); // Box 219
		bodyModel[177] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 230
		bodyModel[178] = new ModelRendererTurbo(this, 73, 107, textureX, textureY); // Box 231
		bodyModel[179] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 232
		bodyModel[180] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 233
		bodyModel[181] = new ModelRendererTurbo(this, 0, 107, textureX, textureY); // Box 234
		bodyModel[182] = new ModelRendererTurbo(this, 97, 122, textureX, textureY); // Box 235
		bodyModel[183] = new ModelRendererTurbo(this, 63, 129, textureX, textureY); // Box 236
		bodyModel[184] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 237
		bodyModel[185] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 238
		bodyModel[186] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 239
		bodyModel[187] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 240
		bodyModel[188] = new ModelRendererTurbo(this, 0, 107, textureX, textureY); // Box 241
		bodyModel[189] = new ModelRendererTurbo(this, 73, 107, textureX, textureY); // Box 242
		bodyModel[190] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 243
		bodyModel[191] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 244
		bodyModel[192] = new ModelRendererTurbo(this, 85, 65, textureX, textureY); // Box 245
		bodyModel[193] = new ModelRendererTurbo(this, 85, 65, textureX, textureY); // Box 246
		bodyModel[194] = new ModelRendererTurbo(this, 70, 72, textureX, textureY); // Box 247
		bodyModel[195] = new ModelRendererTurbo(this, 70, 72, textureX, textureY); // Box 248
		bodyModel[196] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 249
		bodyModel[197] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 250
		bodyModel[198] = new ModelRendererTurbo(this, 111, 51, textureX, textureY); // Box 251
		bodyModel[199] = new ModelRendererTurbo(this, 111, 51, textureX, textureY); // Box 252
		bodyModel[200] = new ModelRendererTurbo(this, 121, 51, textureX, textureY); // Box 253
		bodyModel[201] = new ModelRendererTurbo(this, 121, 51, textureX, textureY); // Box 254
		bodyModel[202] = new ModelRendererTurbo(this, 121, 55, textureX, textureY); // Box 255
		bodyModel[203] = new ModelRendererTurbo(this, 121, 55, textureX, textureY); // Box 256
		bodyModel[204] = new ModelRendererTurbo(this, 0, 126, textureX, textureY); // Box 258
		bodyModel[205] = new ModelRendererTurbo(this, 6, 49, textureX, textureY); // Box 1

		bodyModel[0].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 9
		bodyModel[0].setRotationPoint(7F, 4.2F, 9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 10
		bodyModel[1].setRotationPoint(32F, -4.8F, 9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[2].setRotationPoint(32F, -5.8F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[3].setRotationPoint(28F, 4.2F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[4].setRotationPoint(-14F, -6.8F, 13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[5].setRotationPoint(-14F, 4.2F, 13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[6].setRotationPoint(-25F, -6.8F, 13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		bodyModel[7].setRotationPoint(-25F, 4.2F, 13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 5F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[8].setRotationPoint(-4F, -17.8F, 11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[9].setRotationPoint(-4F, -9.8F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[10].setRotationPoint(-4F, -9.8F, 13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[11].setRotationPoint(2F, 4.2F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[12].setRotationPoint(-14F, 4.2F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[13].setRotationPoint(-41F, -7.8F, 13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[14].setRotationPoint(-35F, 3.2F, 13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[15].setRotationPoint(-26F, 3.2F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[16].setRotationPoint(-35F, 3.2F, -13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[17].setRotationPoint(-35F, -6.8F, 13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[18].setRotationPoint(-26F, -6.8F, 13F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[19].setRotationPoint(-14F, -5.8F, 13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F, 0F, -2F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 4F, 0F, 1F, -4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 4F); // Box 2
		bodyModel[20].setRotationPoint(7F, -8.8F, 9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, 0F, 0F, -3F, -21F, 0F, -3F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -21F, 0F, 3F, 21F, 0F, 0F, 0F); // Box 3
		bodyModel[21].setRotationPoint(7F, -8.8F, -13F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[22].setRotationPoint(32F, 0.7F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[23].setRotationPoint(32.5F, 2.2F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[24].setRotationPoint(32F, 3.7F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[25].setRotationPoint(32F, 1.7F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[26].setRotationPoint(32.5F, 1.2F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		bodyModel[27].setRotationPoint(32.5F, 3.2F, 4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[28].setRotationPoint(32.5F, 2.2F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[29].setRotationPoint(32.5F, 1.2F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		bodyModel[30].setRotationPoint(32.5F, 3.2F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[31].setRotationPoint(32.5F, 1.2F, -1.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[32].setRotationPoint(32.5F, 2.2F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		bodyModel[33].setRotationPoint(32.5F, 3.2F, -1.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 20
		bodyModel[34].setRotationPoint(18.5F, 1.7F, 11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 21
		bodyModel[35].setRotationPoint(18.5F, 2.7F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[36].setRotationPoint(17.5F, 1.7F, 11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 1, 25, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 24
		bodyModel[37].setRotationPoint(-12.5F, 3.7F, -12.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 25F, 0F, 0F, 0F); // Box 25
		bodyModel[38].setRotationPoint(-13F, 4.2F, -13F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 24, 1, 23, 0F, 0F, -0.3F, 0F, 0F, -3.3F, -4F, 0F, -3.3F, -4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 2.7F, -4F, 0F, 2.7F, -4F, 0F, -0.3F, 0F); // Box 26
		bodyModel[39].setRotationPoint(7.5F, -9.3F, -11.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 9, 25, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 27
		bodyModel[40].setRotationPoint(-25.5F, -6.3F, -12.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[41].setRotationPoint(-26F, -7.8F, -13F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 30
		bodyModel[42].setRotationPoint(-6F, -5.8F, 13F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[43].setRotationPoint(-23F, -6.8F, 1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 32
		bodyModel[44].setRotationPoint(-23F, 1.5F, 1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 33
		bodyModel[45].setRotationPoint(7F, 4.2F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 34
		bodyModel[46].setRotationPoint(32F, -4.8F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F, 0F, -2F, 4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, -4F, 0F, 1F, 4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, -4F); // Box 35
		bodyModel[47].setRotationPoint(7F, -8.8F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 36
		bodyModel[48].setRotationPoint(32F, 1.7F, -12F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 37
		bodyModel[49].setRotationPoint(18.5F, 1.7F, -12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 38
		bodyModel[50].setRotationPoint(18.5F, 2.7F, -12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[51].setRotationPoint(-14F, -6.8F, -14F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[52].setRotationPoint(-14F, 4.2F, -14F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 41
		bodyModel[53].setRotationPoint(-25F, -6.8F, -14F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 42
		bodyModel[54].setRotationPoint(-25F, 4.2F, -14F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[55].setRotationPoint(-4F, -9.8F, -14F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[56].setRotationPoint(-41F, -7.8F, -14F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[57].setRotationPoint(-35F, 3.2F, -14F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[58].setRotationPoint(-35F, -6.8F, -14F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[59].setRotationPoint(-26F, -6.8F, -14F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[60].setRotationPoint(-14F, -5.8F, -14F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 50
		bodyModel[61].setRotationPoint(-6F, -5.8F, -14F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[62].setRotationPoint(17.5F, 1.7F, -12F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 52
		bodyModel[63].setRotationPoint(32F, -4.8F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 54
		bodyModel[64].setRotationPoint(32F, -4.8F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 55
		bodyModel[65].setRotationPoint(32F, -4.8F, -5.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 56
		bodyModel[66].setRotationPoint(32F, -4.8F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 57
		bodyModel[67].setRotationPoint(32F, -4.8F, -3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 63
		bodyModel[68].setRotationPoint(32F, -4.8F, 4.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 64
		bodyModel[69].setRotationPoint(32F, -4.8F, 2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 21F, 0F, 0F, 0F); // Box 67
		bodyModel[70].setRotationPoint(3F, 4.2F, -13F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F, 0F); // Box 68
		bodyModel[71].setRotationPoint(3F, 4.2F, 12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -25F, 0F, 0F, 0F); // Box 69
		bodyModel[72].setRotationPoint(-13F, 4.2F, 12F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[73].setRotationPoint(6F, -8.8F, -14F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[74].setRotationPoint(6F, -8.8F, 13F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 8
		bodyModel[75].setRotationPoint(17F, -7F, 13F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, -1.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.7F, 0F, -1.1F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 1.7F, 0F); // Box 9
		bodyModel[76].setRotationPoint(13F, -6.5F, 13F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, -1.7F, -3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.7F, -3F, 0F, -2.9F, 2.5F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -2.9F, 2.5F, 0F); // Box 12
		bodyModel[77].setRotationPoint(9F, -4.5F, 13F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, -2.4F, -3F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -2.4F, -3F, 0F, -3.5F, 1.7F, 0F, 0.9F, -1F, 0F, 0.9F, -1F, 0F, -3.5F, 2.5F, 0F); // Box 13
		bodyModel[78].setRotationPoint(7F, -1F, 13F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[79].setRotationPoint(21F, -6.5F, 13F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 82
		bodyModel[80].setRotationPoint(17F, -7F, -21F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, -1.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.7F, 0F, -1.1F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 1.7F, 0F); // Box 83
		bodyModel[81].setRotationPoint(13F, -6.5F, -21F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, -1.7F, -3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.7F, -3F, 0F, -2.9F, 2.5F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, -2.9F, 2.5F, 0F); // Box 84
		bodyModel[82].setRotationPoint(9F, -4.5F, -21F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, -2.4F, -3F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -2.4F, -3F, 0F, -3.5F, 2.5F, 0F, 0.9F, -1F, 0F, 0.9F, -1F, 0F, -3.5F, 1.7F, 0F); // Box 85
		bodyModel[83].setRotationPoint(7F, -1F, -21F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -0.5F, 0F); // Box 86
		bodyModel[84].setRotationPoint(21F, -6.5F, -21F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -0.3F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.3F, 0.5F, 0F, 0.9F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.9F, -1F, 0F); // Box 92
		bodyModel[85].setRotationPoint(-26F, -1F, 14F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.3F, 0F, -1.7F, -3F, 0F, -1.7F, -3F, 0F, 0F, 0.3F, 0F, 1.2F, -0.3F, 0F, -2.9F, 2.5F, 0F, -2.9F, 2.5F, 0F, 1.2F, -0.3F, 0F); // Box 93
		bodyModel[86].setRotationPoint(-28F, -4.5F, 14F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.2F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -1.1F, 1.7F, 0F, -1.1F, 1.7F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[87].setRotationPoint(-32F, -6.5F, 14F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[88].setRotationPoint(-36F, -7F, 14F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[89].setRotationPoint(-44F, -7F, 14F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 97
		bodyModel[90].setRotationPoint(-22F, 2F, 14F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, -0.3F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.3F, 0.5F, 0F, 0.9F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.9F, -1F, 0F); // Box 98
		bodyModel[91].setRotationPoint(-26F, -1F, -23F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.3F, 0F, -1.7F, -3F, 0F, -1.7F, -3F, 0F, 0F, 0.3F, 0F, 1.2F, -0.3F, 0F, -2.9F, 2.5F, 0F, -2.9F, 2.5F, 0F, 1.2F, -0.3F, 0F); // Box 99
		bodyModel[92].setRotationPoint(-28F, -4.5F, -23F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0.2F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -1.1F, 1.7F, 0F, -1.1F, 1.7F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[93].setRotationPoint(-32F, -6.5F, -23F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[94].setRotationPoint(-36F, -7F, -23F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[95].setRotationPoint(-44F, -7F, -23F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[96].setRotationPoint(-22F, 2F, -23F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[97].setRotationPoint(6F, -8.8F, -13F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 1, 23, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 106
		bodyModel[98].setRotationPoint(-2.5F, -10.3F, -11.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 25F, 0F, 0F, 0F); // Box 107
		bodyModel[99].setRotationPoint(-3F, -6.8F, -13F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -25F, 0F, 0F, 0F); // Box 108
		bodyModel[100].setRotationPoint(-3F, -6.8F, 12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[101].setRotationPoint(-9F, -18.8F, -10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[102].setRotationPoint(-24F, -20.8F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -5F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[103].setRotationPoint(-29F, -19.8F, 11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[104].setRotationPoint(-3F, -6.8F, 13F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[105].setRotationPoint(-3F, -6.8F, -14F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[106].setRotationPoint(6F, -6.8F, -13F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, 0F, 0F, -3F, 21F, 0F, -3F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 21F, 0F, 3F, -21F, 0F, 0F, 0F); // Box 122
		bodyModel[107].setRotationPoint(7F, -8.8F, 12F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 25F, 0F, -1F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 25F, 0F, 1F, -25F, 0F, 0F, 0F); // Box 123
		bodyModel[108].setRotationPoint(-3F, -9.8F, 12F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, -25F, 0F, -1F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -25F, 0F, 1F, 25F, 0F, 0F, 0F); // Box 124
		bodyModel[109].setRotationPoint(-3F, -9.8F, -13F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[110].setRotationPoint(-4F, -9.8F, -13F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 2F, 5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[111].setRotationPoint(-4F, -17.8F, -12F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -5F, 0F, -2F, 5F, 0F, -2F, 5F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[112].setRotationPoint(-29F, -19.8F, -12F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 129
		bodyModel[113].setRotationPoint(-2F, -5.8F, -14F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 131
		bodyModel[114].setRotationPoint(-2F, -5.8F, 13F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[115].setRotationPoint(-29F, -7.8F, -13F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[116].setRotationPoint(-42F, 3.2F, 13F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[117].setRotationPoint(-42F, 3.2F, -14F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[118].setRotationPoint(-42F, 3.2F, -13F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 136
		bodyModel[119].setRotationPoint(-41F, -6.8F, 13F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 137
		bodyModel[120].setRotationPoint(-41F, -6.8F, -14F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[121].setRotationPoint(-4F, -6.8F, -13F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(-23F, -0.8F, 1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 140
		bodyModel[123].setRotationPoint(-23F, -0.8F, 9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 25F, 0F, -1F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 25F, 0F, 1F, -25F, 0F, 0F, 0F); // Box 141
		bodyModel[124].setRotationPoint(-25F, 3.2F, 12F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, -25F, 0F, -1F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -25F, 0F, 1F, 25F, 0F, 0F, 0F); // Box 143
		bodyModel[125].setRotationPoint(-25F, 3.2F, -13F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 25F, 0F, 0F, 0F); // Box 144
		bodyModel[126].setRotationPoint(-34F, 3.2F, -13F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -25F, 0F, 0F, 0F); // Box 147
		bodyModel[127].setRotationPoint(-41F, 3.2F, 12F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 14, 1, 25, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 148
		bodyModel[128].setRotationPoint(-40.5F, 2.7F, -12.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[129].setRotationPoint(-14F, 2.2F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[130].setRotationPoint(-14F, 2.2F, 1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 151
		bodyModel[131].setRotationPoint(-23F, -18.8F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, -2F, 5F, 0F, -2F); // Box 159
		bodyModel[132].setRotationPoint(-29F, -15.8F, -12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 2F, 5F, 0F, 2F); // Box 160
		bodyModel[133].setRotationPoint(-29F, -15.8F, 11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[134].setRotationPoint(-34F, -7.8F, -13F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[135].setRotationPoint(-40F, -6F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 163
		bodyModel[136].setRotationPoint(-40F, -5F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 164
		bodyModel[137].setRotationPoint(-38F, -5F, -3.2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 165
		bodyModel[138].setRotationPoint(-35F, -5F, -3.2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 166
		bodyModel[139].setRotationPoint(-32F, -5F, -3.2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 167
		bodyModel[140].setRotationPoint(-32F, -5F, 6.8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 168
		bodyModel[141].setRotationPoint(-35F, -5F, 6.8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 169
		bodyModel[142].setRotationPoint(-38F, -5F, 6.8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 170
		bodyModel[143].setRotationPoint(-40F, -2F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[144].setRotationPoint(-40F, 0F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 172
		bodyModel[145].setRotationPoint(-40F, -4F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 173
		bodyModel[146].setRotationPoint(-32F, -5.5F, -2.2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 174
		bodyModel[147].setRotationPoint(-35F, -5.5F, -2.2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 175
		bodyModel[148].setRotationPoint(-38F, -5.5F, -2.2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 176
		bodyModel[149].setRotationPoint(-32F, -5.5F, 5.8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 177
		bodyModel[150].setRotationPoint(-35F, -5.5F, 5.8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 178
		bodyModel[151].setRotationPoint(-38F, -5.5F, 5.8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 179
		bodyModel[152].setRotationPoint(-32F, -3.5F, 5.8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 180
		bodyModel[153].setRotationPoint(-35F, -3.5F, 5.8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 181
		bodyModel[154].setRotationPoint(-38F, -3.5F, 5.8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 182
		bodyModel[155].setRotationPoint(-32F, -3.5F, -2.2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 183
		bodyModel[156].setRotationPoint(-35F, -3.5F, -2.2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 184
		bodyModel[157].setRotationPoint(-38F, -3.5F, -2.2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 185
		bodyModel[158].setRotationPoint(-38F, -5F, -3.2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 186
		bodyModel[159].setRotationPoint(-35F, -5F, -3.2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 187
		bodyModel[160].setRotationPoint(-32F, -5F, -3.2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 188
		bodyModel[161].setRotationPoint(-32F, -5F, 7.8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 189
		bodyModel[162].setRotationPoint(-35F, -5F, 7.8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 190
		bodyModel[163].setRotationPoint(-38F, -5F, 7.8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 191
		bodyModel[164].setRotationPoint(-40F, -1.5F, -1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[165].setRotationPoint(-39F, -6.5F, 3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[166].setRotationPoint(-31F, -6.5F, 3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[167].setRotationPoint(-36.5F, -6.5F, 3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[168].setRotationPoint(-33.5F, -6.5F, 3F);

		bodyModel[169].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 211
		bodyModel[169].setRotationPoint(-3.5F, -11.8F, 13.5F);
		bodyModel[169].rotateAngleY = 0.43633231F;

		bodyModel[170].addShapeBox(-0.5F, -2F, -1F, 1, 2, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 212
		bodyModel[170].setRotationPoint(-3.5F, -11.8F, 13.5F);
		bodyModel[170].rotateAngleY = 0.43633231F;

		bodyModel[171].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 213
		bodyModel[171].setRotationPoint(-3.5F, -11.8F, -13.5F);
		bodyModel[171].rotateAngleY = -0.43633231F;

		bodyModel[172].addShapeBox(-0.5F, -2F, -1F, 1, 2, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 214
		bodyModel[172].setRotationPoint(-3.5F, -11.8F, -13.5F);
		bodyModel[172].rotateAngleY = -0.43633231F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, -4F, 2F, 0F, -4F); // Box 215
		bodyModel[173].setRotationPoint(-24F, -19.8F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 4F, 2F, 0F, 4F); // Box 216
		bodyModel[174].setRotationPoint(-24F, -19.8F, 9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[175].setRotationPoint(-33F, -1F, -12F);
		bodyModel[175].rotateAngleY = 0.29670597F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[176].setRotationPoint(-34F, 1F, -6F);
		bodyModel[176].rotateAngleY = 0.05235988F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.3F, 0F, 0F, 4.7F, 0F, 0F, 4.7F, 0F, 2F, -5.3F, 0F, 2F); // Box 230
		bodyModel[177].setRotationPoint(-8.5F, -18F, 9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.3F, 0F, 0F, 4.7F, 0F, 0F, 4.7F, 0F, 0F, -5.3F, 0F, 0F); // Box 231
		bodyModel[178].setRotationPoint(-8.5F, -18F, 1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 232
		bodyModel[179].setRotationPoint(-23F, -18.8F, 9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F); // Box 233
		bodyModel[180].setRotationPoint(-23F, -18.8F, -0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, -2.3F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -2.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 234
		bodyModel[181].setRotationPoint(-3.5F, -12F, 1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[182].setRotationPoint(-23F, -6.8F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 236
		bodyModel[183].setRotationPoint(-23F, 1.5F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 237
		bodyModel[184].setRotationPoint(-23F, -0.8F, -3F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 238
		bodyModel[185].setRotationPoint(-23F, -0.8F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[186].setRotationPoint(-14F, 2.2F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[187].setRotationPoint(-14F, 2.2F, -2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.3F, 0F, 0F, 4.7F, 0F, 0F, 4.7F, 0F, 0F, -5.3F, 0F, 0F); // Box 241
		bodyModel[188].setRotationPoint(-8.5F, -18F, -9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, -2.3F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -2.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 242
		bodyModel[189].setRotationPoint(-3.5F, -13F, -9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.3F, 0F, 2F, 4.7F, 0F, 2F, 4.7F, 0F, 0F, -5.3F, 0F, 0F); // Box 243
		bodyModel[190].setRotationPoint(-8.5F, -18F, -9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.3F, 0F, 0F, 4.7F, 0F, 0F, 4.7F, 0F, 0F, -5.3F, 0F, 0F); // Box 244
		bodyModel[191].setRotationPoint(-8.5F, -18F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 4.7F, 0F, 0F, -5.3F, 0F, 0F, -5.3F, 0F, 2F, 4.7F, 0F, 2F); // Box 245
		bodyModel[192].setRotationPoint(-24.5F, -20F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 4.7F, 0F, 2F, -5.3F, 0F, 2F, -5.3F, 0F, 0F, 4.7F, 0F, 0F); // Box 246
		bodyModel[193].setRotationPoint(-24.5F, -20F, -9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 4.7F, 0F, 0F, -5.3F, 0F, 0F, -5.3F, 0F, 2F, 4.7F, 0F, 2F); // Box 247
		bodyModel[194].setRotationPoint(-29.5F, -16F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 4.7F, 0F, 2F, -5.3F, 0F, 2F, -5.3F, 0F, 0F, 4.7F, 0F, 0F); // Box 248
		bodyModel[195].setRotationPoint(-29.5F, -16F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 42, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 249
		bodyModel[196].setRotationPoint(19.5F, 1.5F, -21F);

		bodyModel[197].addBox(0F, 0F, 0F, 2, 2, 46, 0F); // Box 250
		bodyModel[197].setRotationPoint(-36.5F, 1.5F, -23F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 251
		bodyModel[198].setRotationPoint(0F, -1F, 7F);
		bodyModel[198].rotateAngleZ = -0.55850536F;

		bodyModel[199].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 252
		bodyModel[199].setRotationPoint(0F, -1F, -1F);
		bodyModel[199].rotateAngleZ = -0.55850536F;

		bodyModel[200].addBox(1F, 2F, 1F, 3, 1, 1, 0F); // Box 253
		bodyModel[200].setRotationPoint(0F, -1F, -1F);
		bodyModel[200].rotateAngleZ = -0.55850536F;

		bodyModel[201].addBox(1F, 2F, 1F, 3, 1, 1, 0F); // Box 254
		bodyModel[201].setRotationPoint(0F, -1F, 7F);
		bodyModel[201].rotateAngleZ = -0.55850536F;

		bodyModel[202].addBox(3F, 1F, 0F, 2, 3, 3, 0F); // Box 255
		bodyModel[202].setRotationPoint(0F, -1F, 7F);
		bodyModel[202].rotateAngleZ = -0.55850536F;

		bodyModel[203].addBox(3F, 1F, 0F, 2, 3, 3, 0F); // Box 256
		bodyModel[203].setRotationPoint(0F, -1F, -1F);
		bodyModel[203].rotateAngleZ = -0.55850536F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 11, 26, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 258
		bodyModel[204].setRotationPoint(3F, -6F, -13F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F); // Box 1
		bodyModel[205].setRotationPoint(-34F, 0F, -6F);
		bodyModel[205].rotateAngleY = 0.05235988F;


		leftFrontWheelModel = new ModelRendererTurbo[1];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 112, 73, textureX, textureY); // Box 10

		leftFrontWheelModel[0].addShape3D(8F, -7F, -5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 5, 14, 14, 52, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Box 10
		leftFrontWheelModel[0].setRotationPoint(20.5F, 2.7F, 15F);


		rightFrontWheelModel = new ModelRendererTurbo[1];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 112, 73, textureX, textureY); // Box 10

		rightFrontWheelModel[0].addShape3D(8F, -7F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 5, 14, 14, 52, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Box 10
		rightFrontWheelModel[0].setRotationPoint(20.5F, 2.7F, -15F);


		leftBackWheelModel = new ModelRendererTurbo[1];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 117, 96, textureX, textureY); // Box 10

		leftBackWheelModel[0].addShape3D(8F, -7F, -7F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 7, 14, 14, 52, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Box 10
		leftBackWheelModel[0].setRotationPoint(-35.5F, 2.7F, 15F);


		rightBackWheelModel = new ModelRendererTurbo[1];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 117, 96, textureX, textureY); // Box 10

		rightBackWheelModel[0].addShape3D(8F, -7F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 7, 14, 14, 52, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Box 10
		rightBackWheelModel[0].setRotationPoint(-35.5F, 2.7F, -15F);


		steeringWheelModel = new ModelRendererTurbo[11];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 196
		steeringWheelModel[1] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 200
		steeringWheelModel[2] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 201
		steeringWheelModel[3] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 202
		steeringWheelModel[4] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 203
		steeringWheelModel[5] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 205
		steeringWheelModel[6] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 206
		steeringWheelModel[7] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 207
		steeringWheelModel[8] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 209
		steeringWheelModel[9] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 210
		steeringWheelModel[10] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 0

		steeringWheelModel[0].addShapeBox(0F, -0.5F, -3F, 1, 1, 6, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 196
		steeringWheelModel[0].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[1].addShapeBox(0F, -2F, 3F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		steeringWheelModel[1].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[2].addShapeBox(0F, -2F, -4F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		steeringWheelModel[2].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[3].addShapeBox(0F, -3F, -3F, 1, 1, 6, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		steeringWheelModel[3].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[4].addShapeBox(0F, 2F, 3F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 203
		steeringWheelModel[4].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[5].addShapeBox(0F, 2F, -4F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 205
		steeringWheelModel[5].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[6].addBox(0F, -1F, -4F, 1, 3, 1, 0F); // Box 206
		steeringWheelModel[6].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[7].addBox(0F, -1F, 3F, 1, 3, 1, 0F); // Box 207
		steeringWheelModel[7].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[8].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 209
		steeringWheelModel[8].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[9].addShapeBox(0.6F, -0.5F, -0.5F, 3, 1, 1, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 210
		steeringWheelModel[9].setRotationPoint(-7F, -9.5F, 7F);

		steeringWheelModel[10].addShapeBox(0F, 3F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 0
		steeringWheelModel[10].setRotationPoint(-7F, -9.5F, 7F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
