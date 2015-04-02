//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.4
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelFury extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelFury()
	{
		bodyModel = new ModelRendererTurbo[234];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 16
		bodyModel[10] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 42
		bodyModel[15] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 43
		bodyModel[16] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 44
		bodyModel[17] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 45
		bodyModel[18] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 52
		bodyModel[19] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 53
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 56
		bodyModel[21] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 42
		bodyModel[22] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 43
		bodyModel[23] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 60
		bodyModel[24] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 61
		bodyModel[25] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 64
		bodyModel[27] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 65
		bodyModel[28] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 66
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 67
		bodyModel[30] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 75
		bodyModel[31] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 112
		bodyModel[32] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 113
		bodyModel[33] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 114
		bodyModel[34] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 115
		bodyModel[35] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 116
		bodyModel[36] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 117
		bodyModel[37] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 118
		bodyModel[38] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 119
		bodyModel[39] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 120
		bodyModel[40] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 121
		bodyModel[41] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 122
		bodyModel[42] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 126
		bodyModel[43] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 129
		bodyModel[45] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 130
		bodyModel[46] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 131
		bodyModel[47] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 132
		bodyModel[48] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 133
		bodyModel[49] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 134
		bodyModel[50] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 135
		bodyModel[51] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 136
		bodyModel[52] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 137
		bodyModel[53] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 139
		bodyModel[54] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 142
		bodyModel[55] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 144
		bodyModel[56] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 145
		bodyModel[57] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 146
		bodyModel[58] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 147
		bodyModel[59] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 148
		bodyModel[60] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 149
		bodyModel[61] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 150
		bodyModel[62] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 151
		bodyModel[63] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 152
		bodyModel[64] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 153
		bodyModel[65] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 154
		bodyModel[66] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 155
		bodyModel[67] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 156
		bodyModel[68] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 158
		bodyModel[69] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 160
		bodyModel[70] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 161
		bodyModel[71] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 162
		bodyModel[72] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 163
		bodyModel[73] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 164
		bodyModel[74] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 165
		bodyModel[75] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 166
		bodyModel[76] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 167
		bodyModel[77] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 168
		bodyModel[78] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 169
		bodyModel[79] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 171
		bodyModel[80] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 174
		bodyModel[81] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 176
		bodyModel[82] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 177
		bodyModel[83] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 178
		bodyModel[84] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 179
		bodyModel[85] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 180
		bodyModel[86] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 181
		bodyModel[87] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 182
		bodyModel[88] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 183
		bodyModel[89] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 184
		bodyModel[90] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 185
		bodyModel[91] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 187
		bodyModel[92] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 190
		bodyModel[93] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 193
		bodyModel[94] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 195
		bodyModel[95] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 196
		bodyModel[96] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 197
		bodyModel[97] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 198
		bodyModel[98] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 199
		bodyModel[99] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 200
		bodyModel[100] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 201
		bodyModel[101] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 202
		bodyModel[102] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 203
		bodyModel[103] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 204
		bodyModel[104] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 205
		bodyModel[105] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 206
		bodyModel[106] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 207
		bodyModel[107] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 208
		bodyModel[108] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 209
		bodyModel[109] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 210
		bodyModel[110] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 211
		bodyModel[111] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 212
		bodyModel[112] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 213
		bodyModel[113] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 214
		bodyModel[114] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 215
		bodyModel[115] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 216
		bodyModel[116] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 217
		bodyModel[117] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 218
		bodyModel[118] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 219
		bodyModel[119] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 226
		bodyModel[120] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 227
		bodyModel[121] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 228
		bodyModel[122] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 229
		bodyModel[123] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 230
		bodyModel[124] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 231
		bodyModel[125] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 240
		bodyModel[126] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 241
		bodyModel[127] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 290
		bodyModel[128] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 300
		bodyModel[129] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Box 301
		bodyModel[130] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Box 302
		bodyModel[131] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Box 303
		bodyModel[132] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 304
		bodyModel[133] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Box 308
		bodyModel[134] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 311
		bodyModel[135] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 312
		bodyModel[136] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Box 270
		bodyModel[137] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 273
		bodyModel[138] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 274
		bodyModel[139] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Box 275
		bodyModel[140] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 109
		bodyModel[141] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 118
		bodyModel[142] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 108
		bodyModel[143] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 102
		bodyModel[144] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 103
		bodyModel[145] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 104
		bodyModel[146] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 115
		bodyModel[147] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 285
		bodyModel[148] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 286
		bodyModel[149] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 287
		bodyModel[150] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 288
		bodyModel[151] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 289
		bodyModel[152] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 291
		bodyModel[153] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 293
		bodyModel[154] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 294
		bodyModel[155] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 295
		bodyModel[156] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 299
		bodyModel[157] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 302
		bodyModel[158] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 303
		bodyModel[159] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 304
		bodyModel[160] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 305
		bodyModel[161] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 306
		bodyModel[162] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 307
		bodyModel[163] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 308
		bodyModel[164] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 309
		bodyModel[165] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 310
		bodyModel[166] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 311
		bodyModel[167] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 312
		bodyModel[168] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 313
		bodyModel[169] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 314
		bodyModel[170] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 315
		bodyModel[171] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 316
		bodyModel[172] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 317
		bodyModel[173] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 318
		bodyModel[174] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 2
		bodyModel[175] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 3
		bodyModel[176] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 4
		bodyModel[177] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 5
		bodyModel[178] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 6
		bodyModel[179] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 7
		bodyModel[180] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 8
		bodyModel[181] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 9
		bodyModel[182] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 19
		bodyModel[183] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 20
		bodyModel[184] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 21
		bodyModel[185] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 22
		bodyModel[186] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 23
		bodyModel[187] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 24
		bodyModel[188] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 25
		bodyModel[189] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 26
		bodyModel[190] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 343
		bodyModel[191] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 344
		bodyModel[192] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 0
		bodyModel[193] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 1
		bodyModel[194] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 2
		bodyModel[195] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 3
		bodyModel[196] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 4
		bodyModel[197] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 5
		bodyModel[198] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 6
		bodyModel[199] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 7
		bodyModel[200] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 8
		bodyModel[201] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 9
		bodyModel[202] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 10
		bodyModel[203] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 11
		bodyModel[204] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 12
		bodyModel[205] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 13
		bodyModel[206] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 14
		bodyModel[207] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 15
		bodyModel[208] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 16
		bodyModel[209] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 17
		bodyModel[210] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 18
		bodyModel[211] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 19
		bodyModel[212] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 0
		bodyModel[213] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 1
		bodyModel[214] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 2
		bodyModel[215] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 3
		bodyModel[216] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 4
		bodyModel[217] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 5
		bodyModel[218] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 6
		bodyModel[219] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 7
		bodyModel[220] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 8
		bodyModel[221] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 9
		bodyModel[222] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 10
		bodyModel[223] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 11
		bodyModel[224] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 12
		bodyModel[225] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 13
		bodyModel[226] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 14
		bodyModel[227] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 15
		bodyModel[228] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 16
		bodyModel[229] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 17
		bodyModel[230] = new ModelRendererTurbo(this, 35, 350, textureX, textureY); // Box 18
		bodyModel[231] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 19
		bodyModel[232] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 20
		bodyModel[233] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 21

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 11, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 60F, 1F, 0F, 15F, 4F, 0F, 15F, 4F, 0F, 60F, 1F, 0F); // Box 0
		bodyModel[0].setRotationPoint(6F, -24F, -24F);

		bodyModel[1].addBox(-71F, 0F, 0F, 91, 14, 28, 0F); // Box 6
		bodyModel[1].setRotationPoint(20F, -12F, -14F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 28, 0F,0F, 5F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 7
		bodyModel[2].setRotationPoint(38F, -7.9F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[3].setRotationPoint(40F, -7F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 3, 28, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F); // Box 9
		bodyModel[4].setRotationPoint(40F, -3F, -14F);

		bodyModel[5].addBox(0F, 0F, 0F, 97, 1, 14, 0F); // Box 11
		bodyModel[5].setRotationPoint(-55F, -12.5F, -27F);

		bodyModel[6].addBox(0F, 0F, 0F, 97, 1, 14, 0F); // Box 12
		bodyModel[6].setRotationPoint(-55F, -12.5F, 13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 4F, 0F); // Box 13
		bodyModel[7].setRotationPoint(42F, -12.5F, -27F);

		bodyModel[8].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Box 15
		bodyModel[8].setRotationPoint(-55F, -11.5F, -27F);

		bodyModel[9].addBox(67F, 0F, 0F, 97, 4, 1, 0F); // Box 16
		bodyModel[9].setRotationPoint(-122F, -11.5F, 26F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 22, 11, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 35F, -5F, 0F, -60F, 1F, 0F, -60F, 1F, 0F, 35F, -5F, -6F); // Box 19
		bodyModel[10].setRotationPoint(-16F, -24F, 0F);

		bodyModel[11].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Box 22
		bodyModel[11].setRotationPoint(-55F, -11.5F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 97, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(-55F, -11.5F, 13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 4F, 0F); // Box 24
		bodyModel[13].setRotationPoint(42F, -12.5F, 13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 22, 11, 24, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 35F, -5F, -6F, -60F, 1F, 0F, -60F, 1F, 0F, 35F, -5F, 0F); // Box 42
		bodyModel[14].setRotationPoint(-16F, -24F, -24F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 1, 26, 0F); // Box 43
		bodyModel[15].setRotationPoint(-55F, -12.5F, -13F);

		bodyModel[16].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Box 44
		bodyModel[16].setRotationPoint(18F, -25F, 8F);

		bodyModel[17].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Box 45
		bodyModel[17].setRotationPoint(18F, -25F, -18F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 5, 6, 0F); // Box 52
		bodyModel[18].setRotationPoint(33F, -21F, -14F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 53
		bodyModel[19].setRotationPoint(38F, -20.5F, -13F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 56
		bodyModel[20].setRotationPoint(39F, -18.8F, -11.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, 5F, 0F); // Box 42
		bodyModel[21].setRotationPoint(-57F, -12.5F, -27F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, 5F, 0F); // Box 43
		bodyModel[22].setRotationPoint(-57F, -12.5F, 13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 8, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[23].setRotationPoint(-52.3F, -9F, -10.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[24].setRotationPoint(-52.4F, -9F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[25].setRotationPoint(-52.4F, -10F, -11.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[26].setRotationPoint(-52.4F, -10F, 10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[27].setRotationPoint(-52.4F, -10F, -10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[28].setRotationPoint(-52.4F, -1F, -10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[29].setRotationPoint(-53F, -6F, 0.1F);

		bodyModel[30].addShapeBox(4F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -1F, -2F, 0F, -2F, -2F, 0F, -1F); // Box 75
		bodyModel[30].setRotationPoint(35.4F, -13F, 5F);
		bodyModel[30].rotateAngleZ = -0.33161256F;

		bodyModel[31].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 112
		bodyModel[31].setRotationPoint(-2.2F, -7F, 21F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 113
		bodyModel[32].setRotationPoint(-3.8F, -7F, 21F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 114
		bodyModel[33].setRotationPoint(-6F, -7F, 21F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 115
		bodyModel[34].setRotationPoint(0F, -7F, 21F);

		bodyModel[35].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 116
		bodyModel[35].setRotationPoint(-6F, -7F, 17F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 117
		bodyModel[36].setRotationPoint(-4F, -2F, 17F);

		bodyModel[37].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 118
		bodyModel[37].setRotationPoint(-4F, 2F, 17F);
		bodyModel[37].rotateAngleZ = 0.34906585F;

		bodyModel[38].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 119
		bodyModel[38].setRotationPoint(1.8F, 3F, 17F);
		bodyModel[38].rotateAngleZ = -0.34906585F;

		bodyModel[39].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 120
		bodyModel[39].setRotationPoint(1F, 4F, 17.4F);
		bodyModel[39].rotateAngleZ = -0.34906585F;

		bodyModel[40].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 121
		bodyModel[40].setRotationPoint(-4F, 3.4F, 17.4F);
		bodyModel[40].rotateAngleZ = 0.34906585F;

		bodyModel[41].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 122
		bodyModel[41].setRotationPoint(3F, 1F, 17F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 126
		bodyModel[42].setRotationPoint(-11F, 1F, 17F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 128
		bodyModel[43].setRotationPoint(19F, -7F, 21F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 129
		bodyModel[44].setRotationPoint(25F, -7F, 21F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 130
		bodyModel[45].setRotationPoint(22.8F, -7F, 21F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 131
		bodyModel[46].setRotationPoint(21.2F, -7F, 21F);

		bodyModel[47].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 132
		bodyModel[47].setRotationPoint(19F, -7F, 17F);

		bodyModel[48].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 133
		bodyModel[48].setRotationPoint(21F, 2F, 17F);
		bodyModel[48].rotateAngleZ = 0.34906585F;

		bodyModel[49].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 134
		bodyModel[49].setRotationPoint(26.8F, 3F, 17F);
		bodyModel[49].rotateAngleZ = -0.34906585F;

		bodyModel[50].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 135
		bodyModel[50].setRotationPoint(26F, 4F, 17.4F);
		bodyModel[50].rotateAngleZ = -0.34906585F;

		bodyModel[51].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 136
		bodyModel[51].setRotationPoint(21F, 3.4F, 17.4F);
		bodyModel[51].rotateAngleZ = 0.34906585F;

		bodyModel[52].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 137
		bodyModel[52].setRotationPoint(21F, -2F, 17F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 139
		bodyModel[53].setRotationPoint(14F, 1F, 17F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 142
		bodyModel[54].setRotationPoint(28F, 1F, 17F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 144
		bodyModel[55].setRotationPoint(-31F, -7F, 21F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 145
		bodyModel[56].setRotationPoint(-25F, -7F, 21F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 146
		bodyModel[57].setRotationPoint(-27.2F, -7F, 21F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 147
		bodyModel[58].setRotationPoint(-28.8F, -7F, 21F);

		bodyModel[59].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 148
		bodyModel[59].setRotationPoint(-31F, -7F, 17F);

		bodyModel[60].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 149
		bodyModel[60].setRotationPoint(-29F, 2F, 17F);
		bodyModel[60].rotateAngleZ = 0.34906585F;

		bodyModel[61].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 150
		bodyModel[61].setRotationPoint(-23.2F, 3F, 17F);
		bodyModel[61].rotateAngleZ = -0.34906585F;

		bodyModel[62].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 151
		bodyModel[62].setRotationPoint(-24F, 4F, 17.4F);
		bodyModel[62].rotateAngleZ = -0.34906585F;

		bodyModel[63].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 152
		bodyModel[63].setRotationPoint(-29F, 3.4F, 17.4F);
		bodyModel[63].rotateAngleZ = 0.34906585F;

		bodyModel[64].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 153
		bodyModel[64].setRotationPoint(-29F, -2F, 17F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[65].setRotationPoint(-33F, 1F, 17F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 155
		bodyModel[66].setRotationPoint(-36F, 1F, 17F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 156
		bodyModel[67].setRotationPoint(-38F, 1F, 17F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 158
		bodyModel[68].setRotationPoint(-22F, 1F, 17F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 160
		bodyModel[69].setRotationPoint(19F, -7F, -22F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 161
		bodyModel[70].setRotationPoint(25F, -7F, -22F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 162
		bodyModel[71].setRotationPoint(22.8F, -7F, -22F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 163
		bodyModel[72].setRotationPoint(21.2F, -7F, -22F);

		bodyModel[73].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 164
		bodyModel[73].setRotationPoint(19F, -7F, -21F);

		bodyModel[74].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 165
		bodyModel[74].setRotationPoint(21F, 2F, -21F);
		bodyModel[74].rotateAngleZ = 0.34906585F;

		bodyModel[75].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 166
		bodyModel[75].setRotationPoint(26.8F, 3F, -21F);
		bodyModel[75].rotateAngleZ = -0.34906585F;

		bodyModel[76].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 167
		bodyModel[76].setRotationPoint(21F, -2F, -21F);

		bodyModel[77].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 168
		bodyModel[77].setRotationPoint(26F, 4F, -21.4F);
		bodyModel[77].rotateAngleZ = -0.34906585F;

		bodyModel[78].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 169
		bodyModel[78].setRotationPoint(21F, 3.4F, -21.4F);
		bodyModel[78].rotateAngleZ = 0.34906585F;

		bodyModel[79].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 171
		bodyModel[79].setRotationPoint(14F, 1F, -22F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 174
		bodyModel[80].setRotationPoint(28F, 1F, -22F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 176
		bodyModel[81].setRotationPoint(0F, -7F, -22F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 177
		bodyModel[82].setRotationPoint(-2.2F, -7F, -22F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 178
		bodyModel[83].setRotationPoint(-3.8F, -7F, -22F);

		bodyModel[84].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 179
		bodyModel[84].setRotationPoint(-6F, -7F, -21F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 180
		bodyModel[85].setRotationPoint(-6F, -7F, -22F);

		bodyModel[86].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 181
		bodyModel[86].setRotationPoint(-4F, 2F, -21F);
		bodyModel[86].rotateAngleZ = 0.34906585F;

		bodyModel[87].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 182
		bodyModel[87].setRotationPoint(-4F, -2F, -21F);

		bodyModel[88].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 183
		bodyModel[88].setRotationPoint(1.8F, 3F, -21F);
		bodyModel[88].rotateAngleZ = -0.34906585F;

		bodyModel[89].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 184
		bodyModel[89].setRotationPoint(1F, 4F, -21.4F);
		bodyModel[89].rotateAngleZ = -0.34906585F;

		bodyModel[90].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 185
		bodyModel[90].setRotationPoint(-4F, 3.4F, -21.4F);
		bodyModel[90].rotateAngleZ = 0.34906585F;

		bodyModel[91].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 187
		bodyModel[91].setRotationPoint(-11F, 1F, -22F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 190
		bodyModel[92].setRotationPoint(3F, 1F, -22F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 193
		bodyModel[93].setRotationPoint(-22F, 1F, -22F);

		bodyModel[94].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 195
		bodyModel[94].setRotationPoint(-24F, 4F, -21.4F);
		bodyModel[94].rotateAngleZ = -0.34906585F;

		bodyModel[95].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 196
		bodyModel[95].setRotationPoint(-23.2F, 3F, -21F);
		bodyModel[95].rotateAngleZ = -0.34906585F;

		bodyModel[96].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 197
		bodyModel[96].setRotationPoint(-29F, -2F, -21F);

		bodyModel[97].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Box 198
		bodyModel[97].setRotationPoint(-29F, 2F, -21F);
		bodyModel[97].rotateAngleZ = 0.34906585F;

		bodyModel[98].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 199
		bodyModel[98].setRotationPoint(-29F, 3.4F, -21.4F);
		bodyModel[98].rotateAngleZ = 0.34906585F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[99].setRotationPoint(-33F, 1F, -22F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 201
		bodyModel[100].setRotationPoint(-36F, 1F, -22F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 202
		bodyModel[101].setRotationPoint(-38F, 1F, -22F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 203
		bodyModel[102].setRotationPoint(-27.2F, -7F, -22F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 204
		bodyModel[103].setRotationPoint(-25F, -7F, -22F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 205
		bodyModel[104].setRotationPoint(-31F, -7F, -22F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 206
		bodyModel[105].setRotationPoint(-28.8F, -7F, -22F);

		bodyModel[106].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 207
		bodyModel[106].setRotationPoint(-31F, -7F, -21F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[107].setRotationPoint(44F, -6F, 15F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Box 209
		bodyModel[108].setRotationPoint(39F, -6F, 15F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 210
		bodyModel[109].setRotationPoint(37F, -6F, 15F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[110].setRotationPoint(-47F, -6F, 15F);

		bodyModel[111].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Box 212
		bodyModel[111].setRotationPoint(-52F, -6F, 15F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 213
		bodyModel[112].setRotationPoint(-54F, -6F, 15F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[113].setRotationPoint(-47F, -6F, -24F);

		bodyModel[114].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Box 215
		bodyModel[114].setRotationPoint(-52F, -6F, -24F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 216
		bodyModel[115].setRotationPoint(-54F, -6F, -24F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 217
		bodyModel[116].setRotationPoint(37F, -6F, -24F);

		bodyModel[117].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Box 218
		bodyModel[117].setRotationPoint(39F, -6F, -24F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[118].setRotationPoint(44F, -6F, -24F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[119].setRotationPoint(-34F, -8F, 17F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 227
		bodyModel[120].setRotationPoint(-36F, -8F, 17F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 228
		bodyModel[121].setRotationPoint(-37F, -8F, 17F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[122].setRotationPoint(-34F, -8F, -22F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 230
		bodyModel[123].setRotationPoint(-36F, -8F, -22F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 231
		bodyModel[124].setRotationPoint(-37F, -8F, -22F);

		bodyModel[125].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Box 240
		bodyModel[125].setRotationPoint(-31F, -6F, 17F);
		bodyModel[125].rotateAngleZ = -0.34906585F;

		bodyModel[126].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Box 241
		bodyModel[126].setRotationPoint(-31F, -6F, -21F);
		bodyModel[126].rotateAngleZ = -0.34906585F;

		bodyModel[127].addBox(0F, 0F, 0F, 13, 8, 1, 0F); // Box 290
		bodyModel[127].setRotationPoint(13F, -22F, 23.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 300
		bodyModel[128].setRotationPoint(-32F, -22F, 8F);
		bodyModel[128].rotateAngleZ = 0.15707963F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 301
		bodyModel[129].setRotationPoint(-39F, -21F, 8F);
		bodyModel[129].rotateAngleZ = 0.15707963F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 302
		bodyModel[130].setRotationPoint(-45F, -20F, 8F);
		bodyModel[130].rotateAngleZ = 0.15707963F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 303
		bodyModel[131].setRotationPoint(-52F, -19F, 8F);
		bodyModel[131].rotateAngleZ = 0.15707963F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Box 304
		bodyModel[132].setRotationPoint(-32F, -22F, -15F);
		bodyModel[132].rotateAngleZ = 0.15707963F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Box 308
		bodyModel[133].setRotationPoint(-39F, -21F, -15F);
		bodyModel[133].rotateAngleZ = 0.15707963F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Box 311
		bodyModel[134].setRotationPoint(-45F, -20F, -15F);
		bodyModel[134].rotateAngleZ = 0.15707963F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Box 312
		bodyModel[135].setRotationPoint(-52F, -19F, -15F);
		bodyModel[135].rotateAngleZ = 0.15707963F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 270
		bodyModel[136].setRotationPoint(36F, -6F, 6F);
		bodyModel[136].rotateAngleZ = 0.55850536F;

		bodyModel[137].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Box 273
		bodyModel[137].setRotationPoint(-23F, -22F, -26F);
		bodyModel[137].rotateAngleY = -0.01745329F;
		bodyModel[137].rotateAngleZ = 0.02617994F;

		bodyModel[138].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Box 274
		bodyModel[138].setRotationPoint(-23F, -19F, -27F);
		bodyModel[138].rotateAngleZ = 0.01745329F;

		bodyModel[139].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Box 275
		bodyModel[139].setRotationPoint(-23F, -16F, -27F);

		bodyModel[140].addBox(-13F, 0F, 0.3F, 13, 1, 1, 0F); // Box 109
		bodyModel[140].setRotationPoint(5.2F, -25F, 20F);
		bodyModel[140].rotateAngleY = 0.05235988F;

		bodyModel[141].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 118
		bodyModel[141].setRotationPoint(-9F, -24.5F, 19F);

		bodyModel[142].addBox(-13F, 0F, 0F, 13, 1, 1, 0F); // Box 108
		bodyModel[142].setRotationPoint(18F, -25F, 19F);
		bodyModel[142].rotateAngleY = -0.10471976F;

		bodyModel[143].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 102
		bodyModel[143].setRotationPoint(18F, -25F, 19F);

		bodyModel[144].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 103
		bodyModel[144].setRotationPoint(30.6F, -25F, 19F);
		bodyModel[144].rotateAngleY = -0.76794487F;
		bodyModel[144].rotateAngleZ = -0.66322512F;

		bodyModel[145].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 104
		bodyModel[145].setRotationPoint(34F, -21.5F, 16F);
		bodyModel[145].rotateAngleY = -0.27925268F;
		bodyModel[145].rotateAngleZ = -0.54105207F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[146].setRotationPoint(40.9F, -16.9F, 14F);
		bodyModel[146].rotateAngleY = -0.80285146F;
		bodyModel[146].rotateAngleZ = -0.62831853F;

		bodyModel[147].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 285
		bodyModel[147].setRotationPoint(48.7F, -8.7F, 6F);
		bodyModel[147].rotateAngleY = -0.76794487F;
		bodyModel[147].rotateAngleZ = -2.04203522F;

		bodyModel[148].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 286
		bodyModel[148].setRotationPoint(37F, -18F, 18F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 287
		bodyModel[149].setRotationPoint(37F, -18F, 21F);

		bodyModel[150].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 288
		bodyModel[150].setRotationPoint(38F, -18F, 21F);
		bodyModel[150].rotateAngleZ = 0.41887902F;

		bodyModel[151].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 289
		bodyModel[151].setRotationPoint(38F, -18F, 18F);
		bodyModel[151].rotateAngleZ = 0.41887902F;

		bodyModel[152].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[152].setRotationPoint(37.2F, -19.8F, 18F);
		bodyModel[152].rotateAngleZ = 0.41887902F;

		bodyModel[153].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 293
		bodyModel[153].setRotationPoint(37F, -18F, -22F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 294
		bodyModel[154].setRotationPoint(37F, -18F, -19F);

		bodyModel[155].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 295
		bodyModel[155].setRotationPoint(38F, -18F, -19F);
		bodyModel[155].rotateAngleZ = 0.41887902F;

		bodyModel[156].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 299
		bodyModel[156].setRotationPoint(38F, -18F, -22F);
		bodyModel[156].rotateAngleZ = 0.41887902F;

		bodyModel[157].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[157].setRotationPoint(37.2F, -19.8F, 21F);
		bodyModel[157].rotateAngleZ = 0.41887902F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 303
		bodyModel[158].setRotationPoint(37F, -18F, 19.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 304
		bodyModel[159].setRotationPoint(37F, -16.8F, 19.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 305
		bodyModel[160].setRotationPoint(37F, -16.8F, -20.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 306
		bodyModel[161].setRotationPoint(37F, -18F, -20.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 307
		bodyModel[162].setRotationPoint(37F, -18F, -19F);

		bodyModel[163].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 308
		bodyModel[163].setRotationPoint(38F, -18F, -19F);
		bodyModel[163].rotateAngleZ = 0.41887902F;

		bodyModel[164].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[164].setRotationPoint(37.2F, -19.8F, -19F);
		bodyModel[164].rotateAngleZ = 0.41887902F;

		bodyModel[165].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[165].setRotationPoint(37.2F, -19.8F, -22F);
		bodyModel[165].rotateAngleZ = 0.41887902F;

		bodyModel[166].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Box 311
		bodyModel[166].setRotationPoint(38F, -18F, -22F);
		bodyModel[166].rotateAngleZ = 0.41887902F;

		bodyModel[167].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 312
		bodyModel[167].setRotationPoint(37F, -18F, -22F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[168].setRotationPoint(36.5F, -13F, -3F);
		bodyModel[168].rotateAngleX = 0.85521133F;
		bodyModel[168].rotateAngleY = -1.57079633F;

		bodyModel[169].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Box 314
		bodyModel[169].setRotationPoint(36.5F, -13F, 0F);
		bodyModel[169].rotateAngleX = 0.85521133F;
		bodyModel[169].rotateAngleY = -1.57079633F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 315
		bodyModel[170].setRotationPoint(36.5F, -13F, 2F);
		bodyModel[170].rotateAngleX = 0.85521133F;
		bodyModel[170].rotateAngleY = -1.57079633F;

		bodyModel[171].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 316
		bodyModel[171].setRotationPoint(31F, -22.5F, 0F);
		bodyModel[171].rotateAngleX = 0.20943951F;
		bodyModel[171].rotateAngleZ = 0.78539816F;

		bodyModel[172].addBox(0F, 0F, -1F, 1, 9, 1, 0F); // Box 317
		bodyModel[172].setRotationPoint(31F, -22.5F, -1F);
		bodyModel[172].rotateAngleX = -0.20943951F;
		bodyModel[172].rotateAngleZ = 0.78539816F;

		bodyModel[173].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 318
		bodyModel[173].setRotationPoint(29F, -25F, -2.5F);
		bodyModel[173].rotateAngleZ = 0.78539816F;

		bodyModel[174].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Box 2
		bodyModel[174].setRotationPoint(-23F, -22F, 23F);
		bodyModel[174].rotateAngleY = 0.01745329F;
		bodyModel[174].rotateAngleZ = 0.02617994F;

		bodyModel[175].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Box 3
		bodyModel[175].setRotationPoint(-23F, -19F, 24F);
		bodyModel[175].rotateAngleZ = 0.01745329F;

		bodyModel[176].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Box 4
		bodyModel[176].setRotationPoint(-23F, -16F, 24F);

		bodyModel[177].addBox(0F, 0F, 0F, 8, 8, 3, 0F); // Box 5
		bodyModel[177].setRotationPoint(-50F, -20.5F, 24F);

		bodyModel[178].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 6
		bodyModel[178].setRotationPoint(-50F, -21.5F, 24.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 7
		bodyModel[179].setRotationPoint(-50F, -23.5F, 24.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 8
		bodyModel[180].setRotationPoint(-48F, -23.5F, 25F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 9
		bodyModel[181].setRotationPoint(-45F, -22.5F, 25F);

		bodyModel[182].addBox(0F, -1F, 0F, 6, 1, 6, 0F); // Box 19
		bodyModel[182].setRotationPoint(32F, -22F, 9.5F);
		bodyModel[182].rotateAngleZ = -0.01745329F;

		bodyModel[183].addShapeBox(1F, -3F, -0.5F, 4, 2, 4, 0F,0.4F, 0.5F, 0.1F, 0.4F, 0.5F, 0.1F, 0.4F, 0.5F, 1F, 0.4F, 0.5F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Box 20
		bodyModel[183].setRotationPoint(32F, -21F, 10.5F);
		bodyModel[183].rotateAngleZ = -0.01745329F;

		bodyModel[184].addBox(0F, -1F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[184].setRotationPoint(32F, -21F, 9.5F);
		bodyModel[184].rotateAngleZ = -0.01745329F;

		bodyModel[185].addShapeBox(1F, -3F, -0.5F, 1, 2, 3, 0F,2.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 2.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Box 22
		bodyModel[185].setRotationPoint(35F, -19F, 11F);
		bodyModel[185].rotateAngleZ = -0.01745329F;

		bodyModel[186].addShapeBox(1F, -3F, -0.3F, 1, 2, 1, 0F,0.4F, 1F, -0.2F, 0.4F, 0F, 0.5F, 0.4F, 0F, 1F, 0.4F, 1F, 0.5F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F); // Box 23
		bodyModel[186].setRotationPoint(37F, -17F, 12F);
		bodyModel[186].rotateAngleZ = 0.59341195F;

		bodyModel[187].addShapeBox(1F, -3F, -0.5F, 1, 1, 1, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F); // Box 24
		bodyModel[187].setRotationPoint(38F, -15.5F, 12.5F);
		bodyModel[187].rotateAngleZ = 0.59341195F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 25
		bodyModel[188].setRotationPoint(36.02F, -22F, 11.3F);
		bodyModel[188].rotateAngleZ = -0.01745329F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 26
		bodyModel[189].setRotationPoint(36.02F, -22F, 13.7F);
		bodyModel[189].rotateAngleZ = -0.01745329F;

		bodyModel[190].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 343
		bodyModel[190].setRotationPoint(24F, -27F, 12F);

		bodyModel[191].addBox(0F, 0F, -18F, 1, 2, 4, 0F); // Box 344
		bodyModel[191].setRotationPoint(24F, -27F, 2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 0
		bodyModel[192].setRotationPoint(-24F, 1F, -22F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 1
		bodyModel[193].setRotationPoint(1F, 1F, -22F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 2
		bodyModel[194].setRotationPoint(-13F, 1F, -22F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 3
		bodyModel[195].setRotationPoint(26F, 1F, -22F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 4
		bodyModel[196].setRotationPoint(12F, 1F, -22F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[197].setRotationPoint(-19F, 1F, -22F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[198].setRotationPoint(6F, 1F, -22F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[199].setRotationPoint(-8F, 1F, -22F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[200].setRotationPoint(17F, 1F, -22F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[201].setRotationPoint(31F, 1F, -22F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[202].setRotationPoint(-19F, 1F, 17F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 11
		bodyModel[203].setRotationPoint(-24F, 1F, 17F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[204].setRotationPoint(6F, 1F, 17F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 13
		bodyModel[205].setRotationPoint(1F, 1F, 17F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[206].setRotationPoint(-8F, 1F, 17F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 15
		bodyModel[207].setRotationPoint(-13F, 1F, 17F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[208].setRotationPoint(31F, 1F, 17F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 17
		bodyModel[209].setRotationPoint(26F, 1F, 17F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[210].setRotationPoint(17F, 1F, 17F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 19
		bodyModel[211].setRotationPoint(12F, 1F, 17F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[212].setRotationPoint(-9F, -8F, 17F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 1
		bodyModel[213].setRotationPoint(-11F, -8F, 17F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[214].setRotationPoint(-12F, -8F, 17F);

		bodyModel[215].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Box 3
		bodyModel[215].setRotationPoint(-6F, -6F, 17F);
		bodyModel[215].rotateAngleZ = -0.34906585F;

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[216].setRotationPoint(16F, -8F, 17F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 5
		bodyModel[217].setRotationPoint(14F, -8F, 17F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[218].setRotationPoint(13F, -8F, 17F);

		bodyModel[219].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Box 7
		bodyModel[219].setRotationPoint(19F, -6F, 17F);
		bodyModel[219].rotateAngleZ = -0.34906585F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[220].setRotationPoint(-12F, -8F, -22F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 9
		bodyModel[221].setRotationPoint(-11F, -8F, -22F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[222].setRotationPoint(-9F, -8F, -22F);

		bodyModel[223].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Box 11
		bodyModel[223].setRotationPoint(-6F, -6F, -21F);
		bodyModel[223].rotateAngleZ = -0.34906585F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[224].setRotationPoint(13F, -8F, -22F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 13
		bodyModel[225].setRotationPoint(14F, -8F, -22F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[226].setRotationPoint(16F, -8F, -22F);

		bodyModel[227].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Box 15
		bodyModel[227].setRotationPoint(19F, -6F, -21F);
		bodyModel[227].rotateAngleZ = -0.34906585F;

		bodyModel[228].addBox(0F, 0F, 0F, 5, 1, 26, 0F); // Box 16
		bodyModel[228].setRotationPoint(-57F, -15.5F, -13F);
		bodyModel[228].rotateAngleZ = -0.33161256F;

		bodyModel[229].addBox(0F, 0F, 0F, 3, 5, 10, 0F); // Box 17
		bodyModel[229].setRotationPoint(-53F, -19F, -5F);
		bodyModel[229].rotateAngleZ = -0.64577182F;

		bodyModel[230].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 18
		bodyModel[230].setRotationPoint(-56F, -19F, -12F);
		bodyModel[230].rotateAngleZ = -0.20943951F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[231].setRotationPoint(-53F, -18F, 6F);

		bodyModel[232].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 20
		bodyModel[232].setRotationPoint(-55F, -18F, 6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		bodyModel[233].setRotationPoint(-56F, -18F, 6F);


		turretModel = new ModelRendererTurbo[76];
		turretModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 25
		turretModel[1] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 27
		turretModel[2] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 28
		turretModel[3] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 31
		turretModel[4] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 32
		turretModel[5] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 33
		turretModel[6] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 34
		turretModel[7] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 35
		turretModel[8] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 36
		turretModel[9] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 37
		turretModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 39
		turretModel[11] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 47
		turretModel[12] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 48
		turretModel[13] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 49
		turretModel[14] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 50
		turretModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 51
		turretModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 45
		turretModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 46
		turretModel[18] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 47
		turretModel[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 48
		turretModel[20] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 49
		turretModel[21] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 50
		turretModel[22] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 51
		turretModel[23] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 52
		turretModel[24] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 53
		turretModel[25] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 54
		turretModel[26] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 55
		turretModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 56
		turretModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 57
		turretModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 58
		turretModel[30] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 69
		turretModel[31] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 70
		turretModel[32] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 71
		turretModel[33] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 72
		turretModel[34] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 76
		turretModel[35] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 288
		turretModel[36] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 289
		turretModel[37] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 290
		turretModel[38] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 291
		turretModel[39] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 292
		turretModel[40] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 293
		turretModel[41] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 294
		turretModel[42] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 295
		turretModel[43] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 296
		turretModel[44] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 297
		turretModel[45] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 299
		turretModel[46] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 319
		turretModel[47] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 320
		turretModel[48] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Box 321
		turretModel[49] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 322
		turretModel[50] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 325
		turretModel[51] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 326
		turretModel[52] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 327
		turretModel[53] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 333
		turretModel[54] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 335
		turretModel[55] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 336
		turretModel[56] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 0
		turretModel[57] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 1
		turretModel[58] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 11
		turretModel[59] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 12
		turretModel[60] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 13
		turretModel[61] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 14
		turretModel[62] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 15
		turretModel[63] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 18
		turretModel[64] = new ModelRendererTurbo(this, 20, 400, textureX, textureY); // Box 4
		turretModel[65] = new ModelRendererTurbo(this, 36, 400, textureX, textureY); // Box 5
		turretModel[66] = new ModelRendererTurbo(this, 36, 400, textureX, textureY); // Box 7
		turretModel[67] = new ModelRendererTurbo(this, 4, 408, textureX, textureY); // Box 8
		turretModel[68] = new ModelRendererTurbo(this, 52, 400, textureX, textureY); // Box 9
		turretModel[69] = new ModelRendererTurbo(this, 60, 400, textureX, textureY); // Box 10
		turretModel[70] = new ModelRendererTurbo(this, 4, 408, textureX, textureY); // Box 11
		turretModel[71] = new ModelRendererTurbo(this, 30, 420, textureX, textureY); // Box 299
		turretModel[72] = new ModelRendererTurbo(this, 60, 408, textureX, textureY); // Box 13
		turretModel[73] = new ModelRendererTurbo(this, 44, 416, textureX, textureY); // Box 14
		turretModel[74] = new ModelRendererTurbo(this, 52, 416, textureX, textureY); // Box 15
		turretModel[75] = new ModelRendererTurbo(this, 60, 416, textureX, textureY); // Box 16

		turretModel[0].addBox(-10F, -24F, -15F, 20, 1, 30, 0F); // Box 25
		turretModel[0].setRotationPoint(0F, -1F, 0F);

		turretModel[1].addShapeBox(-15F, -24F, -15F, 5, 1, 30, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 27
		turretModel[1].setRotationPoint(0F, -1F, 0F);

		turretModel[2].addShapeBox(10F, -24F, -15F, 5, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 28
		turretModel[2].setRotationPoint(0F, -1F, 0F);

		turretModel[3].addShapeBox(10F, -25F, -16F, 5, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 31
		turretModel[3].setRotationPoint(0F, -1F, 0F);

		turretModel[4].addBox(-10F, -25F, -16F, 20, 1, 32, 0F); // Box 32
		turretModel[4].setRotationPoint(0F, -1F, 0F);

		turretModel[5].addShapeBox(-19F, -25F, -16F, 9, 1, 32, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 33
		turretModel[5].setRotationPoint(0F, -1F, 0F);

		turretModel[6].addShapeBox(-10F, -38F, -18F, 14, 13, 36, 0F,0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[6].setRotationPoint(0F, -1F, 0F);

		turretModel[7].addShapeBox(10F, -38F, -18F, 7, 13, 36, 0F,6F, 0F, -2F, -1F, -2F, -5F, -1F, -2F, -5F, 6F, 0F, -2F, 6F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 6F, 0F, 0F); // Box 35
		turretModel[7].setRotationPoint(0F, -1F, 0F);

		turretModel[8].addShapeBox(-21F, -31F, -14F, 11, 6, 28, 0F,5F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 5F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -5F); // Box 36
		turretModel[8].setRotationPoint(0F, -1F, 0F);

		turretModel[9].addShapeBox(-26F, -38F, -18F, 16, 7, 36, 0F,0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F); // Box 37
		turretModel[9].setRotationPoint(0F, -1F, 0F);

		turretModel[10].addShapeBox(16F, -35F, -10F, 3, 7, 20, 0F,0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 39
		turretModel[10].setRotationPoint(0F, -1F, 0F);

		turretModel[11].addShapeBox(-12F, -40F, -12F, 14, 2, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		turretModel[11].setRotationPoint(0F, -1F, 0F);

		turretModel[12].addShapeBox(-12F, -40F, -14F, 14, 2, 2, 0F,-4F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		turretModel[12].setRotationPoint(0F, -1F, 0F);

		turretModel[13].addShapeBox(-12F, -40F, -2F, 14, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		turretModel[13].setRotationPoint(0F, -1F, 0F);

		turretModel[14].addShapeBox(-6F, -39F, 7F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		turretModel[14].setRotationPoint(0F, -1F, 0F);
		turretModel[14].rotateAngleY = 0.54105207F;

		turretModel[15].addShapeBox(-3F, -40F, 12F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		turretModel[15].setRotationPoint(0F, -1F, 0F);
		turretModel[15].rotateAngleY = 0.54105207F;

		turretModel[16].addShapeBox(-22F, -42F, -4F, 3, 4, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		turretModel[16].setRotationPoint(0F, -1F, 0F);

		turretModel[17].addShapeBox(-21.5F, -48F, -3.5F, 2, 6, 2, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 46
		turretModel[17].setRotationPoint(0F, -1F, 0F);

		turretModel[18].addShapeBox(-30F, -38F, -7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		turretModel[18].setRotationPoint(0F, -1F, 0F);

		turretModel[19].addShapeBox(-30F, -38F, 6F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		turretModel[19].setRotationPoint(0F, -1F, 0F);

		turretModel[20].addShapeBox(-29F, -35.5F, 5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[20].setRotationPoint(0F, -1F, 0F);

		turretModel[21].addShapeBox(-29F, -35.5F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		turretModel[21].setRotationPoint(0F, -1F, 0F);

		turretModel[22].addShapeBox(-30F, -39F, -7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		turretModel[22].setRotationPoint(0F, -1F, 0F);

		turretModel[23].addShapeBox(-30F, -39F, 6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		turretModel[23].setRotationPoint(0F, -1F, 0F);

		turretModel[24].addShapeBox(0F, -40F, 12F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		turretModel[24].setRotationPoint(0F, -1F, 0F);
		turretModel[24].rotateAngleY = 0.54105207F;

		turretModel[25].addShapeBox(-3F, -40.8F, 12F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 54
		turretModel[25].setRotationPoint(0F, -1F, 0F);
		turretModel[25].rotateAngleY = 0.54105207F;

		turretModel[26].addBox(-8F, -25F, 23.2F, 6, 4, 1, 0F); // Box 55
		turretModel[26].setRotationPoint(0F, -1F, 0F);
		turretModel[26].rotateAngleX = 0.2443461F;

		turretModel[27].addBox(-8F, -25.2F, 23.3F, 1, 1, 1, 0F); // Box 56
		turretModel[27].setRotationPoint(0F, -1F, 0F);
		turretModel[27].rotateAngleX = 0.2443461F;

		turretModel[28].addBox(-3F, -25.2F, 23.3F, 1, 1, 1, 0F); // Box 57
		turretModel[28].setRotationPoint(0F, -1F, 0F);
		turretModel[28].rotateAngleX = 0.2443461F;

		turretModel[29].addShapeBox(-26.5F, -37F, -3F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		turretModel[29].setRotationPoint(0F, -1F, 0F);

		turretModel[30].addBox(8F, -39F, -11F, 1, 2, 4, 0F); // Box 69
		turretModel[30].setRotationPoint(0F, -1F, 0F);

		turretModel[31].addShapeBox(7F, -38F, -11F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		turretModel[31].setRotationPoint(0F, -1F, 0F);

		turretModel[32].addShapeBox(7F, -38F, 7F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		turretModel[32].setRotationPoint(0F, -1F, 0F);

		turretModel[33].addBox(8F, -39F, 7F, 1, 2, 4, 0F); // Box 72
		turretModel[33].setRotationPoint(0F, -1F, 0F);

		turretModel[34].addShapeBox(3.5F, -41F, -0.5F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 76
		turretModel[34].setRotationPoint(0F, -1F, 0F);

		turretModel[35].addShapeBox(-15.5F, -52F, 9.5F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		turretModel[35].setRotationPoint(0F, -1F, 0F);
		turretModel[35].rotateAngleY = 0.66322512F;
		turretModel[35].rotateAngleZ = 0.13962634F;

		turretModel[36].addShapeBox(-19.5F, -52F, 9.5F, 4, 2, 2, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 289
		turretModel[36].setRotationPoint(0F, -1F, 0F);
		turretModel[36].rotateAngleY = 0.66322512F;
		turretModel[36].rotateAngleZ = 0.13962634F;

		turretModel[37].addShapeBox(-21.5F, -52.5F, 8.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		turretModel[37].setRotationPoint(0F, -1F, 0F);
		turretModel[37].rotateAngleY = 0.66322512F;
		turretModel[37].rotateAngleZ = 0.13962634F;

		turretModel[38].addShapeBox(-21.5F, -52.5F, 11.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		turretModel[38].setRotationPoint(0F, -1F, 0F);
		turretModel[38].rotateAngleY = 0.66322512F;
		turretModel[38].rotateAngleZ = 0.13962634F;

		turretModel[39].addShapeBox(-6.5F, -51.5F, 10F, 5, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 292
		turretModel[39].setRotationPoint(0F, -1F, 0F);
		turretModel[39].rotateAngleY = 0.66322512F;
		turretModel[39].rotateAngleZ = 0.13962634F;

		turretModel[40].addShapeBox(-1.5F, -51.5F, 10F, 7, 1, 1, 0F,0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 293
		turretModel[40].setRotationPoint(0F, -1F, 0F);
		turretModel[40].rotateAngleY = 0.66322512F;
		turretModel[40].rotateAngleZ = 0.13962634F;

		turretModel[41].addShapeBox(-12.5F, -51.8F, 8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		turretModel[41].setRotationPoint(0F, -1F, 0F);
		turretModel[41].rotateAngleY = 0.66322512F;
		turretModel[41].rotateAngleZ = 0.13962634F;

		turretModel[42].addShapeBox(-20.5F, -52F, 9.5F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		turretModel[42].setRotationPoint(0F, -1F, 0F);
		turretModel[42].rotateAngleY = 0.66322512F;
		turretModel[42].rotateAngleZ = 0.13962634F;

		turretModel[43].addShapeBox(-20.5F, -52F, 11.5F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		turretModel[43].setRotationPoint(0F, -1F, 0F);
		turretModel[43].rotateAngleY = 0.66322512F;
		turretModel[43].rotateAngleZ = 0.13962634F;

		turretModel[44].addShapeBox(-12.5F, -51.5F, 11.5F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		turretModel[44].setRotationPoint(0F, -1F, 0F);
		turretModel[44].rotateAngleY = 0.66322512F;
		turretModel[44].rotateAngleZ = 0.13962634F;

		turretModel[45].addShapeBox(-3.5F, -50.8F, 9F, 1, 1, 2, 0F,0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[45].setRotationPoint(0F, -1F, 0F);
		turretModel[45].rotateAngleY = 0.66322512F;
		turretModel[45].rotateAngleZ = 0.13962634F;

		turretModel[46].addBox(0.5F, -28F, -22F, 11, 4, 2, 0F); // Box 319
		turretModel[46].setRotationPoint(0F, -1F, 0F);
		turretModel[46].rotateAngleX = -0.13962634F;
		turretModel[46].rotateAngleY = 0.20943951F;

		turretModel[47].addBox(1F, -33F, -22F, 11, 4, 2, 0F); // Box 320
		turretModel[47].setRotationPoint(0F, -1F, 0F);
		turretModel[47].rotateAngleX = -0.13962634F;
		turretModel[47].rotateAngleY = 0.20943951F;
		turretModel[47].rotateAngleZ = 0.01745329F;

		turretModel[48].addBox(1F, -29F, 18F, 11, 4, 2, 0F); // Box 321
		turretModel[48].setRotationPoint(0F, -1F, 0F);
		turretModel[48].rotateAngleX = 0.05235988F;
		turretModel[48].rotateAngleY = -0.20943951F;
		turretModel[48].rotateAngleZ = 0.01745329F;

		turretModel[49].addBox(0.5F, -30F, 23F, 11, 4, 2, 0F); // Box 322
		turretModel[49].setRotationPoint(0F, -1F, 0F);
		turretModel[49].rotateAngleX = 0.2268928F;
		turretModel[49].rotateAngleY = -0.20943951F;

		turretModel[50].addBox(-11F, -23F, -34.5F, 6, 1, 6, 0F); // Box 325
		turretModel[50].setRotationPoint(0F, -1F, 0F);
		turretModel[50].rotateAngleX = -1.43116999F;
		turretModel[50].rotateAngleY = 0.33161256F;
		turretModel[50].rotateAngleZ = 0.05235988F;

		turretModel[51].addShapeBox(-10F, -25F, -35F, 4, 2, 4, 0F,0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Box 326
		turretModel[51].setRotationPoint(0F, 0F, 0F);
		turretModel[51].rotateAngleX = -1.43116999F;
		turretModel[51].rotateAngleY = 0.33161256F;
		turretModel[51].rotateAngleZ = 0.05235988F;

		turretModel[52].addBox(-18F, -23F, -34.5F, 6, 1, 6, 0F); // Box 327
		turretModel[52].setRotationPoint(0F, -1F, 0F);
		turretModel[52].rotateAngleX = -1.43116999F;
		turretModel[52].rotateAngleY = 0.33161256F;
		turretModel[52].rotateAngleZ = 0.05235988F;

		turretModel[53].addBox(14F, -23F, -33.5F, 6, 1, 6, 0F); // Box 333
		turretModel[53].setRotationPoint(0F, -1F, 0F);
		turretModel[53].rotateAngleX = -1.43116999F;
		turretModel[53].rotateAngleY = -3.47320521F;
		turretModel[53].rotateAngleZ = 0.05235988F;

		turretModel[54].addBox(7F, -23F, -33.5F, 6, 1, 6, 0F); // Box 335
		turretModel[54].setRotationPoint(0F, -1F, 0F);
		turretModel[54].rotateAngleX = -1.43116999F;
		turretModel[54].rotateAngleY = -3.47320521F;
		turretModel[54].rotateAngleZ = 0.05235988F;

		turretModel[55].addShapeBox(8F, -25F, -34F, 4, 2, 4, 0F,0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Box 336
		turretModel[55].setRotationPoint(0F, 0F, 0F);
		turretModel[55].rotateAngleX = -1.43116999F;
		turretModel[55].rotateAngleY = -3.47320521F;
		turretModel[55].rotateAngleZ = 0.05235988F;

		turretModel[56].addShapeBox(-17F, -25F, -35F, 4, 2, 4, 0F,0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Box 0
		turretModel[56].setRotationPoint(0F, 0F, 0F);
		turretModel[56].rotateAngleX = -1.43116999F;
		turretModel[56].rotateAngleY = 0.33161256F;
		turretModel[56].rotateAngleZ = 0.05235988F;

		turretModel[57].addShapeBox(15F, -25F, -34F, 4, 2, 4, 0F,0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Box 1
		turretModel[57].setRotationPoint(0F, 0F, 0F);
		turretModel[57].rotateAngleX = -1.43116999F;
		turretModel[57].rotateAngleY = -3.47320521F;
		turretModel[57].rotateAngleZ = 0.05235988F;

		turretModel[58].addBox(1.5F, -31F, 26F, 1, 9, 1, 0F); // Box 11
		turretModel[58].setRotationPoint(0F, -1F, 0F);
		turretModel[58].rotateAngleX = 0.27925268F;
		turretModel[58].rotateAngleY = -0.20943951F;

		turretModel[59].addBox(9.5F, -31F, 26F, 1, 9, 1, 0F); // Box 12
		turretModel[59].setRotationPoint(0F, -1F, 0F);
		turretModel[59].rotateAngleX = 0.27925268F;
		turretModel[59].rotateAngleY = -0.20943951F;

		turretModel[60].addBox(9.5F, -33F, -23.8F, 1, 9, 1, 0F); // Box 13
		turretModel[60].setRotationPoint(0F, -1F, 0F);
		turretModel[60].rotateAngleX = -0.19198622F;
		turretModel[60].rotateAngleY = 0.20943951F;

		turretModel[61].addBox(1.5F, -33F, -23.8F, 1, 9, 1, 0F); // Box 14
		turretModel[61].setRotationPoint(0F, -1F, 0F);
		turretModel[61].rotateAngleX = -0.19198622F;
		turretModel[61].rotateAngleY = 0.20943951F;

		turretModel[62].addShapeBox(-18.5F, -44F, 8.5F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 15
		turretModel[62].setRotationPoint(0F, -1F, 0F);

		turretModel[63].addShapeBox(-15.5F, -66F, 8.5F, 2, 22, 2, 0F,-0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 18
		turretModel[63].setRotationPoint(0F, -1F, 0F);
		turretModel[63].rotateAngleZ = 0.06981317F;

		turretModel[64].addShapeBox(-1F, -43.3F, -10.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 4
		turretModel[64].setRotationPoint(0F, -1F, 0F);
		turretModel[64].rotateAngleX = -0.2268928F;
		turretModel[64].rotateAngleY = -1.37881011F;

		turretModel[65].addShapeBox(-1.5F, -41.8F, -4.7F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		turretModel[65].setRotationPoint(0F, -1F, 0F);
		turretModel[65].rotateAngleX = -0.2268928F;
		turretModel[65].rotateAngleY = -1.37881011F;

		turretModel[66].addShapeBox(-0.5F, -42.8F, -4F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		turretModel[66].setRotationPoint(0F, -1F, 0F);
		turretModel[66].rotateAngleX = -0.2268928F;
		turretModel[66].rotateAngleY = -1.37881011F;

		turretModel[67].addShapeBox(-0.5F, -42.8F, -3.5F, 1, 1, 10, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 8
		turretModel[67].setRotationPoint(0F, -1F, 0F);
		turretModel[67].rotateAngleX = -0.2268928F;
		turretModel[67].rotateAngleY = -1.37881011F;

		turretModel[68].addShapeBox(-0.5F, -42.3F, -12F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		turretModel[68].setRotationPoint(0F, -1F, 0F);
		turretModel[68].rotateAngleX = -0.2268928F;
		turretModel[68].rotateAngleY = -1.37881011F;

		turretModel[69].addShapeBox(-0.5F, -42.3F, -12F, 1, 3, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F); // Box 10
		turretModel[69].setRotationPoint(0F, -1F, 0F);
		turretModel[69].rotateAngleX = -0.2268928F;
		turretModel[69].rotateAngleY = -1.37881011F;

		turretModel[70].addShapeBox(-0.5F, -44F, -4.6F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[70].setRotationPoint(0F, -1F, 0F);
		turretModel[70].rotateAngleX = -0.2268928F;
		turretModel[70].rotateAngleY = -1.37881011F;

		turretModel[71].addShapeBox(-4F, -43.7F, -6F, 3, 2, 4, 0F,0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F); // Box 299
		turretModel[71].setRotationPoint(0F, -1F, 0F);
		turretModel[71].rotateAngleX = -0.17453293F;
		turretModel[71].rotateAngleY = -1.37881011F;

		turretModel[72].addShapeBox(-0.5F, -43.3F, -10F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[72].setRotationPoint(0F, -1.5F, 0F);
		turretModel[72].rotateAngleX = -0.2268928F;
		turretModel[72].rotateAngleY = -1.37881011F;

		turretModel[73].addShapeBox(-0.5F, -43.3F, -10F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Box 14
		turretModel[73].setRotationPoint(0F, -2.2F, 0F);
		turretModel[73].rotateAngleX = -0.2268928F;
		turretModel[73].rotateAngleY = -1.37881011F;

		turretModel[74].addShapeBox(0.5F, -41.8F, -4.7F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		turretModel[74].setRotationPoint(0F, -1F, 0F);
		turretModel[74].rotateAngleX = -0.2268928F;
		turretModel[74].rotateAngleY = -1.37881011F;

		turretModel[75].addShapeBox(-0.5F, -40.5F, -4.7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		turretModel[75].setRotationPoint(0F, -1F, 0F);
		turretModel[75].rotateAngleX = -0.2268928F;
		turretModel[75].rotateAngleY = -1.37881011F;


		barrelModel = new ModelRendererTurbo[7];
		barrelModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 38
		barrelModel[1] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 40
		barrelModel[2] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 41
		barrelModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 54
		barrelModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 55
		barrelModel[5] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 343
		barrelModel[6] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 345

		barrelModel[0].addShapeBox(0F, -4F, -10F, 3, 9, 20, 0F,0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 38
		barrelModel[0].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[1].addShapeBox(-1F, -1.5F, -1.5F, 45, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 40
		barrelModel[1].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[2].addShapeBox(-1F, -2.5F, -2.5F, 9, 5, 5, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 41
		barrelModel[2].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[3].addShapeBox(44F, -1.5F, -1.5F, 2, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 54
		barrelModel[3].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[4].addShapeBox(46F, -1.5F, -1.5F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		barrelModel[4].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[5].addShapeBox(18F, -1.5F, 0.3F, 90, 30, 1, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -80F, -27F, 0F, -80F, -27F, 0F, 0F, -27F, 0F); // Box 343
		barrelModel[5].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[6].addShapeBox(18F, -1.5F, -1.3F, 90, 30, 1, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -80F, -27F, 0F, -80F, -27F, 0F, 0F, -27F, 0F); // Box 345
		barrelModel[6].setRotationPoint(17.5F, -32.5F, 0F);


		leftTrackModel = new ModelRendererTurbo[22];
		leftTrackModel[0] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 268
		leftTrackModel[1] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 269
		leftTrackModel[2] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 270
		leftTrackModel[3] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 271
		leftTrackModel[4] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 272
		leftTrackModel[5] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 273
		leftTrackModel[6] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 274
		leftTrackModel[7] = new ModelRendererTurbo(this, 17, 233, textureX, textureY); // Box 275
		leftTrackModel[8] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 276
		leftTrackModel[9] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 277
		leftTrackModel[10] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 278
		leftTrackModel[11] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 279
		leftTrackModel[12] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 280
		leftTrackModel[13] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 281
		leftTrackModel[14] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 282
		leftTrackModel[15] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 283
		leftTrackModel[16] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 284
		leftTrackModel[17] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 285
		leftTrackModel[18] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 286
		leftTrackModel[19] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 287
		leftTrackModel[20] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 288
		leftTrackModel[21] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Box 289

		leftTrackModel[0].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Box 268
		leftTrackModel[0].setRotationPoint(45.5F, -5.2F, -25F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 269
		leftTrackModel[1].setRotationPoint(46F, -4.5F, -25F);
		leftTrackModel[1].rotateAngleZ = -3.71755131F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 17, 1, 11, 0F); // Box 270
		leftTrackModel[2].setRotationPoint(27F, -7F, -25F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Box 271
		leftTrackModel[3].setRotationPoint(27F, -6F, -25F);
		leftTrackModel[3].rotateAngleZ = -3.4906585F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 8, 1, 11, 0F); // Box 272
		leftTrackModel[4].setRotationPoint(17.5F, -7.6F, -25F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Box 273
		leftTrackModel[5].setRotationPoint(17.5F, -6.6F, -25F);
		leftTrackModel[5].rotateAngleZ = -3.85717765F;

		leftTrackModel[6].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 274
		leftTrackModel[6].setRotationPoint(14.5F, -8.2F, -25F);
		leftTrackModel[6].rotateAngleZ = 3.66519143F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 275
		leftTrackModel[7].setRotationPoint(-7F, -7.6F, -25F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 276
		leftTrackModel[8].setRotationPoint(13.5F, -8.6F, -25F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Box 277
		leftTrackModel[9].setRotationPoint(-7.5F, -6.6F, -25F);
		leftTrackModel[9].rotateAngleZ = -3.85717765F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 278
		leftTrackModel[10].setRotationPoint(-11.5F, -8.6F, -25F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 279
		leftTrackModel[11].setRotationPoint(-10.5F, -8.2F, -25F);
		leftTrackModel[11].rotateAngleZ = 3.66519143F;

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 280
		leftTrackModel[12].setRotationPoint(-32F, -7.6F, -25F);

		leftTrackModel[13].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Box 281
		leftTrackModel[13].setRotationPoint(-32.5F, -6.6F, -25F);
		leftTrackModel[13].rotateAngleZ = -3.85717765F;

		leftTrackModel[14].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 282
		leftTrackModel[14].setRotationPoint(-36.5F, -8.6F, -25F);

		leftTrackModel[15].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 283
		leftTrackModel[15].setRotationPoint(-35.5F, -8.2F, -25F);
		leftTrackModel[15].rotateAngleZ = 3.66519143F;

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 284
		leftTrackModel[16].setRotationPoint(-51F, -7F, -25F);
		leftTrackModel[16].rotateAngleZ = 0.05235988F;

		leftTrackModel[17].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Box 285
		leftTrackModel[17].setRotationPoint(-51F, -6.2F, -25F);
		leftTrackModel[17].rotateAngleZ = 3.7350046F;

		leftTrackModel[18].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Box 286
		leftTrackModel[18].setRotationPoint(-54.8F, -4.8F, -25F);

		leftTrackModel[19].addShapeBox(0F, -1F, 0F, 14, 1, 11, 0F,0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 287
		leftTrackModel[19].setRotationPoint(-55F, 2F, -25F);
		leftTrackModel[19].rotateAngleZ = -0.48869219F;

		leftTrackModel[20].addBox(0F, 0F, 0F, 77, 1, 11, 0F); // Box 288
		leftTrackModel[20].setRotationPoint(-42F, 8F, -25F);

		leftTrackModel[21].addShapeBox(0F, -1F, 0F, 13, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F); // Box 289
		leftTrackModel[21].setRotationPoint(35F, 9F, -25F);
		leftTrackModel[21].rotateAngleZ = 0.54105207F;


		rightTrackModel = new ModelRendererTurbo[24];
		rightTrackModel[0] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 244
		rightTrackModel[1] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Box 245
		rightTrackModel[2] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 246
		rightTrackModel[3] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 247
		rightTrackModel[4] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 248
		rightTrackModel[5] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 249
		rightTrackModel[6] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 250
		rightTrackModel[7] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 252
		rightTrackModel[8] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 253
		rightTrackModel[9] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 255
		rightTrackModel[10] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 256
		rightTrackModel[11] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 257
		rightTrackModel[12] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 258
		rightTrackModel[13] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 259
		rightTrackModel[14] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 260
		rightTrackModel[15] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 261
		rightTrackModel[16] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 262
		rightTrackModel[17] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Box 263
		rightTrackModel[18] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 264
		rightTrackModel[19] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 265
		rightTrackModel[20] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 266
		rightTrackModel[21] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 267
		rightTrackModel[22] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 276
		rightTrackModel[23] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Box 277

		rightTrackModel[0].addBox(0F, 0F, 0F, 17, 1, 11, 0F); // Box 244
		rightTrackModel[0].setRotationPoint(27F, -7F, 14F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Box 245
		rightTrackModel[1].setRotationPoint(27F, -6F, 14F);
		rightTrackModel[1].rotateAngleZ = -3.4906585F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 8, 1, 11, 0F); // Box 246
		rightTrackModel[2].setRotationPoint(17.5F, -7.6F, 14F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Box 247
		rightTrackModel[3].setRotationPoint(17.5F, -6.6F, 14F);
		rightTrackModel[3].rotateAngleZ = -3.85717765F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 248
		rightTrackModel[4].setRotationPoint(13.5F, -8.6F, 14F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 249
		rightTrackModel[5].setRotationPoint(14.5F, -8.2F, 14F);
		rightTrackModel[5].rotateAngleZ = 3.66519143F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Box 250
		rightTrackModel[6].setRotationPoint(-7.5F, -6.6F, 14F);
		rightTrackModel[6].rotateAngleZ = -3.85717765F;

		rightTrackModel[7].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 252
		rightTrackModel[7].setRotationPoint(-11.5F, -8.6F, 14F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Box 253
		rightTrackModel[8].setRotationPoint(-32.5F, -6.6F, 14F);
		rightTrackModel[8].rotateAngleZ = -3.85717765F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 255
		rightTrackModel[9].setRotationPoint(-36.5F, -8.6F, 14F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 256
		rightTrackModel[10].setRotationPoint(-7F, -7.6F, 14F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 257
		rightTrackModel[11].setRotationPoint(-32F, -7.6F, 14F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 258
		rightTrackModel[12].setRotationPoint(-10.5F, -8.2F, 14F);
		rightTrackModel[12].rotateAngleZ = 3.66519143F;

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 259
		rightTrackModel[13].setRotationPoint(-51F, -7F, 14F);
		rightTrackModel[13].rotateAngleZ = 0.05235988F;

		rightTrackModel[14].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 260
		rightTrackModel[14].setRotationPoint(-35.5F, -8.2F, 14F);
		rightTrackModel[14].rotateAngleZ = 3.66519143F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 261
		rightTrackModel[15].setRotationPoint(46F, -4.5F, 14F);
		rightTrackModel[15].rotateAngleZ = -3.71755131F;

		rightTrackModel[16].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Box 262
		rightTrackModel[16].setRotationPoint(45.5F, -5.2F, 14F);

		rightTrackModel[17].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Box 263
		rightTrackModel[17].setRotationPoint(-51F, -6.2F, 14F);
		rightTrackModel[17].rotateAngleZ = 3.7350046F;

		rightTrackModel[18].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Box 264
		rightTrackModel[18].setRotationPoint(-54.8F, -4.8F, 14F);

		rightTrackModel[19].addBox(0F, 0F, 0F, 77, 1, 11, 0F); // Box 265
		rightTrackModel[19].setRotationPoint(-42F, 8F, 14F);

		rightTrackModel[20].addShapeBox(0F, -1F, 0F, 13, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F); // Box 266
		rightTrackModel[20].setRotationPoint(35F, 9F, 14F);
		rightTrackModel[20].rotateAngleZ = 0.54105207F;

		rightTrackModel[21].addShapeBox(0F, -1F, 0F, 14, 1, 11, 0F,0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightTrackModel[21].setRotationPoint(-55F, 2F, 14F);
		rightTrackModel[21].rotateAngleZ = -0.48869219F;

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F); // Box 276
		rightTrackModel[22].setRotationPoint(43F, -13F, 5F);
		rightTrackModel[22].rotateAngleZ = 2.67035376F;

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -10F, 0F, 0F); // Box 277
		rightTrackModel[23].setRotationPoint(36.8F, -2.2F, 5F);
		rightTrackModel[23].rotateAngleZ = 1.09955743F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}