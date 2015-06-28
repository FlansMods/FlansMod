//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.4
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelTiger131 extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelTiger131()
	{
		bodyModel = new ModelRendererTurbo[220];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 30
		bodyModel[9] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 46
		bodyModel[10] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 89
		bodyModel[11] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 90
		bodyModel[12] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 91
		bodyModel[13] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 92
		bodyModel[14] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 93
		bodyModel[15] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 94
		bodyModel[16] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 95
		bodyModel[17] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 96
		bodyModel[18] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 97
		bodyModel[19] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 98
		bodyModel[20] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 99
		bodyModel[21] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 100
		bodyModel[22] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 101
		bodyModel[23] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Box 102
		bodyModel[24] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 103
		bodyModel[25] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 104
		bodyModel[26] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 105
		bodyModel[27] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 106
		bodyModel[28] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 107
		bodyModel[29] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 108
		bodyModel[30] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 109
		bodyModel[31] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 110
		bodyModel[32] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 111
		bodyModel[33] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 112
		bodyModel[34] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 113
		bodyModel[35] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 114
		bodyModel[36] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 115
		bodyModel[37] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 116
		bodyModel[38] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 117
		bodyModel[39] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 118
		bodyModel[40] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 119
		bodyModel[41] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 120
		bodyModel[42] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Box 121
		bodyModel[43] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 125
		bodyModel[44] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 126
		bodyModel[45] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 127
		bodyModel[46] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 129
		bodyModel[48] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 130
		bodyModel[49] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 131
		bodyModel[50] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 132
		bodyModel[51] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 133
		bodyModel[52] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 134
		bodyModel[53] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 135
		bodyModel[54] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 136
		bodyModel[55] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 137
		bodyModel[56] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 138
		bodyModel[57] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 139
		bodyModel[58] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 140
		bodyModel[59] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 141
		bodyModel[60] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 142
		bodyModel[61] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 143
		bodyModel[62] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 144
		bodyModel[63] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 145
		bodyModel[64] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 146
		bodyModel[65] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 147
		bodyModel[66] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 148
		bodyModel[67] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 149
		bodyModel[68] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 150
		bodyModel[69] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 151
		bodyModel[70] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 152
		bodyModel[71] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Box 153
		bodyModel[72] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Box 154
		bodyModel[73] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Box 155
		bodyModel[74] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 156
		bodyModel[75] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 157
		bodyModel[76] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 158
		bodyModel[77] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 159
		bodyModel[78] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Box 160
		bodyModel[79] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 161
		bodyModel[80] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 162
		bodyModel[81] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 163
		bodyModel[82] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Box 164
		bodyModel[83] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Box 165
		bodyModel[84] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 166
		bodyModel[85] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 167
		bodyModel[86] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Box 168
		bodyModel[87] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Box 169
		bodyModel[88] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 170
		bodyModel[89] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 171
		bodyModel[90] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 172
		bodyModel[91] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Box 173
		bodyModel[92] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 174
		bodyModel[93] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 175
		bodyModel[94] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 179
		bodyModel[95] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 182
		bodyModel[96] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Box 184
		bodyModel[97] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 185
		bodyModel[98] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 186
		bodyModel[99] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 187
		bodyModel[100] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Box 188
		bodyModel[101] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 189
		bodyModel[102] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 190
		bodyModel[103] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 191
		bodyModel[104] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 192
		bodyModel[105] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 193
		bodyModel[106] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 198
		bodyModel[107] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Box 199
		bodyModel[108] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 193
		bodyModel[109] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 194
		bodyModel[110] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 195
		bodyModel[111] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 199
		bodyModel[112] = new ModelRendererTurbo(this, 169, 273, textureX, textureY); // Box 200
		bodyModel[113] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 201
		bodyModel[114] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 202
		bodyModel[115] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 206
		bodyModel[116] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 212
		bodyModel[117] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 213
		bodyModel[118] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 214
		bodyModel[119] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 215
		bodyModel[120] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Box 216
		bodyModel[121] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 217
		bodyModel[122] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 218
		bodyModel[123] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 219
		bodyModel[124] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 220
		bodyModel[125] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Box 221
		bodyModel[126] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 222
		bodyModel[127] = new ModelRendererTurbo(this, 185, 281, textureX, textureY); // Box 223
		bodyModel[128] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 224
		bodyModel[129] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 225
		bodyModel[130] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 226
		bodyModel[131] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 227
		bodyModel[132] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Box 228
		bodyModel[133] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 229
		bodyModel[134] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 230
		bodyModel[135] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 231
		bodyModel[136] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Box 232
		bodyModel[137] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 233
		bodyModel[138] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 234
		bodyModel[139] = new ModelRendererTurbo(this, 25, 289, textureX, textureY); // Box 235
		bodyModel[140] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Box 236
		bodyModel[141] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Box 237
		bodyModel[142] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Box 238
		bodyModel[143] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Box 239
		bodyModel[144] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 240
		bodyModel[145] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 241
		bodyModel[146] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Box 242
		bodyModel[147] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 243
		bodyModel[148] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Box 244
		bodyModel[149] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Box 245
		bodyModel[150] = new ModelRendererTurbo(this, 241, 297, textureX, textureY); // Box 246
		bodyModel[151] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Box 247
		bodyModel[152] = new ModelRendererTurbo(this, 305, 297, textureX, textureY); // Box 248
		bodyModel[153] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Box 249
		bodyModel[154] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 250
		bodyModel[155] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Box 251
		bodyModel[156] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 252
		bodyModel[157] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 253
		bodyModel[158] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 254
		bodyModel[159] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Box 255
		bodyModel[160] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Box 256
		bodyModel[161] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Box 257
		bodyModel[162] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Box 258
		bodyModel[163] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Box 259
		bodyModel[164] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 260
		bodyModel[165] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 261
		bodyModel[166] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 262
		bodyModel[167] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 263
		bodyModel[168] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 264
		bodyModel[169] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 265
		bodyModel[170] = new ModelRendererTurbo(this, 0, 315, textureX, textureY); // Box 250
		bodyModel[171] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 262
		bodyModel[172] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 263
		bodyModel[173] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 264
		bodyModel[174] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 265
		bodyModel[175] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 266
		bodyModel[176] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 267
		bodyModel[177] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 268
		bodyModel[178] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 269
		bodyModel[179] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 270
		bodyModel[180] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 271
		bodyModel[181] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 272
		bodyModel[182] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 273
		bodyModel[183] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 274
		bodyModel[184] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 275
		bodyModel[185] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 276
		bodyModel[186] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 277
		bodyModel[187] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 278
		bodyModel[188] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 279
		bodyModel[189] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 280
		bodyModel[190] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 281
		bodyModel[191] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 282
		bodyModel[192] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 283
		bodyModel[193] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 284
		bodyModel[194] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 285
		bodyModel[195] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 286
		bodyModel[196] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 287
		bodyModel[197] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 288
		bodyModel[198] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 289
		bodyModel[199] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 290
		bodyModel[200] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 291
		bodyModel[201] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 292
		bodyModel[202] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 293
		bodyModel[203] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 294
		bodyModel[204] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 295
		bodyModel[205] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 296
		bodyModel[206] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 297
		bodyModel[207] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 298
		bodyModel[208] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 299
		bodyModel[209] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 300
		bodyModel[210] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 301
		bodyModel[211] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 302
		bodyModel[212] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 303
		bodyModel[213] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 304
		bodyModel[214] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 305
		bodyModel[215] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 306
		bodyModel[216] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 307
		bodyModel[217] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 308
		bodyModel[218] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 309
		bodyModel[219] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 310

		bodyModel[0].addShapeBox(0F, 0F, 0F, 90, 14, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-47F, -14F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 85, 7, 56, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-47F, -21F, -28F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 60, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 2
		bodyModel[2].setRotationPoint(43F, -14F, -30F);
		bodyModel[2].rotateAngleZ = -0.2443461F;

		bodyModel[3].addBox(0F, 0F, 0F, 90, 1, 10, 0F); // Box 3
		bodyModel[3].setRotationPoint(-47F, -14F, 18F);

		bodyModel[4].addBox(0F, 0F, 0F, 90, 1, 10, 0F); // Box 4
		bodyModel[4].setRotationPoint(-47F, -14F, -28F);

		bodyModel[5].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 6
		bodyModel[5].setRotationPoint(40F, -14.9F, 18F);
		bodyModel[5].rotateAngleZ = -0.2443461F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 14, 38, 0F,0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(43F, -14F, -19F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 88, 5, 3, 0F,0.4F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -3F, 0.4F, 0F, -3F, 00F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.4F, 2F, 0.2F); // Box 28
		bodyModel[7].setRotationPoint(-47F, -16F, 28F);

		bodyModel[8].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 30
		bodyModel[8].setRotationPoint(40F, -14.9F, -30F);
		bodyModel[8].rotateAngleZ = -0.2443461F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 8, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 46
		bodyModel[9].setRotationPoint(37.5F, -21.5F, -28F);

		bodyModel[10].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 89
		bodyModel[10].setRotationPoint(2F, -3F, 28F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[11].setRotationPoint(2F, -6F, 28F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 91
		bodyModel[12].setRotationPoint(2F, 4F, 28F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[13].setRotationPoint(21F, -6F, 28F);

		bodyModel[14].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 93
		bodyModel[14].setRotationPoint(21F, -3F, 28F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 94
		bodyModel[15].setRotationPoint(21F, 4F, 28F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[16].setRotationPoint(-17F, -6F, 28F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[17].setRotationPoint(-36F, -6F, 28F);

		bodyModel[18].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 97
		bodyModel[18].setRotationPoint(-36F, -3F, 28F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 98
		bodyModel[19].setRotationPoint(-36F, 4F, 28F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 99
		bodyModel[20].setRotationPoint(-17F, 4F, 28F);

		bodyModel[21].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 100
		bodyModel[21].setRotationPoint(-17F, -3F, 28F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[22].setRotationPoint(21F, -6F, 20F);

		bodyModel[23].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 102
		bodyModel[23].setRotationPoint(21F, -3F, 20F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 103
		bodyModel[24].setRotationPoint(21F, 4F, 20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 104
		bodyModel[25].setRotationPoint(2F, 4F, 20F);

		bodyModel[26].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 105
		bodyModel[26].setRotationPoint(2F, -3F, 20F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[27].setRotationPoint(2F, -6F, 20F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[28].setRotationPoint(-17F, -6F, 20F);

		bodyModel[29].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 108
		bodyModel[29].setRotationPoint(-17F, -3F, 20F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 109
		bodyModel[30].setRotationPoint(-17F, 4F, 20F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 110
		bodyModel[31].setRotationPoint(-36F, 4F, 20F);

		bodyModel[32].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 111
		bodyModel[32].setRotationPoint(-36F, -3F, 20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[33].setRotationPoint(-36F, -6F, 20F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[34].setRotationPoint(11.5F, -6F, 23F);

		bodyModel[35].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Box 114
		bodyModel[35].setRotationPoint(11.5F, -3F, 23F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 115
		bodyModel[36].setRotationPoint(11.5F, 4F, 23F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 116
		bodyModel[37].setRotationPoint(-7.5F, 4F, 23F);

		bodyModel[38].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Box 117
		bodyModel[38].setRotationPoint(-7.5F, -3F, 23F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[39].setRotationPoint(-7.5F, -6F, 23F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[40].setRotationPoint(-26.5F, -6F, 23F);

		bodyModel[41].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Box 120
		bodyModel[41].setRotationPoint(-26.5F, -3F, 23F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 121
		bodyModel[42].setRotationPoint(-26.5F, 4F, 23F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[43].setRotationPoint(-48F, -7F, 22F);

		bodyModel[44].addBox(0F, 0F, 0F, 11, 7, 6, 0F); // Box 126
		bodyModel[44].setRotationPoint(-48F, -5F, 22F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 127
		bodyModel[45].setRotationPoint(-48F, 2F, 22F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[46].setRotationPoint(-34F, -6F, -22F);

		bodyModel[47].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 129
		bodyModel[47].setRotationPoint(-34F, -3F, -22F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 130
		bodyModel[48].setRotationPoint(-34F, 4F, -22F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 131
		bodyModel[49].setRotationPoint(4F, 4F, -22F);

		bodyModel[50].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 132
		bodyModel[50].setRotationPoint(4F, -3F, -22F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 133
		bodyModel[51].setRotationPoint(-15F, 4F, -22F);

		bodyModel[52].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 134
		bodyModel[52].setRotationPoint(-15F, -3F, -22F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 135
		bodyModel[53].setRotationPoint(23F, 4F, -22F);

		bodyModel[54].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 136
		bodyModel[54].setRotationPoint(23F, -3F, -22F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 137
		bodyModel[55].setRotationPoint(-34F, 4F, -30F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[56].setRotationPoint(-34F, -6F, -30F);

		bodyModel[57].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 139
		bodyModel[57].setRotationPoint(-34F, -3F, -30F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[58].setRotationPoint(-24.5F, -6F, -27F);

		bodyModel[59].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Box 141
		bodyModel[59].setRotationPoint(-24.5F, -3F, -27F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 142
		bodyModel[60].setRotationPoint(-24.5F, 4F, -27F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 143
		bodyModel[61].setRotationPoint(-15F, 4F, -30F);

		bodyModel[62].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 144
		bodyModel[62].setRotationPoint(-15F, -3F, -30F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[63].setRotationPoint(-15F, -6F, -30F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[64].setRotationPoint(-5.5F, -6F, -27F);

		bodyModel[65].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Box 147
		bodyModel[65].setRotationPoint(-5.5F, -3F, -27F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 148
		bodyModel[66].setRotationPoint(-5.5F, 4F, -27F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 149
		bodyModel[67].setRotationPoint(4F, 4F, -30F);

		bodyModel[68].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 150
		bodyModel[68].setRotationPoint(4F, -3F, -30F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[69].setRotationPoint(4F, -6F, -30F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[70].setRotationPoint(13.5F, -6F, -27F);

		bodyModel[71].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Box 153
		bodyModel[71].setRotationPoint(13.5F, -3F, -27F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 154
		bodyModel[72].setRotationPoint(13.5F, 4F, -27F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 155
		bodyModel[73].setRotationPoint(23F, 4F, -30F);

		bodyModel[74].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Box 156
		bodyModel[74].setRotationPoint(23F, -3F, -30F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[75].setRotationPoint(23F, -6F, -30F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[76].setRotationPoint(23F, -6F, -22F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[77].setRotationPoint(4F, -6F, -22F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[78].setRotationPoint(-15F, -6F, -22F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[79].setRotationPoint(-48F, -7F, -28F);

		bodyModel[80].addBox(0F, 0F, 0F, 11, 7, 6, 0F); // Box 162
		bodyModel[80].setRotationPoint(-48F, -5F, -28F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 163
		bodyModel[81].setRotationPoint(-48F, 2F, -28F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[82].setRotationPoint(36F, -9F, 20F);

		bodyModel[83].addBox(0F, 0F, 0F, 13, 7, 9, 0F); // Box 165
		bodyModel[83].setRotationPoint(36F, -6F, 20F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 166
		bodyModel[84].setRotationPoint(36F, 1F, 20F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[85].setRotationPoint(36F, -9F, -29F);

		bodyModel[86].addBox(0F, 0F, 0F, 13, 7, 9, 0F); // Box 168
		bodyModel[86].setRotationPoint(36F, -6F, -29F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 169
		bodyModel[87].setRotationPoint(36F, 1F, -29F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 5, 5, 0F); // Box 170
		bodyModel[88].setRotationPoint(39F, -20F, -14F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[89].setRotationPoint(41F, -19.5F, -13.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[90].setRotationPoint(42F, -18F, -12F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 173
		bodyModel[91].setRotationPoint(39F, -20F, 5F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 174
		bodyModel[92].setRotationPoint(40F, -16F, 5F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 175
		bodyModel[93].setRotationPoint(38F, -21F, 7F);
		bodyModel[93].rotateAngleZ = -0.29670597F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 16, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 179
		bodyModel[94].setRotationPoint(-54F, -22F, 3F);
		bodyModel[94].rotateAngleZ = 0.12217305F;

		bodyModel[95].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 182
		bodyModel[95].setRotationPoint(-52F, -22.3F, 3F);
		bodyModel[95].rotateAngleZ = 0.12217305F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 16, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 184
		bodyModel[96].setRotationPoint(-54F, -22F, -11F);
		bodyModel[96].rotateAngleZ = 0.12217305F;

		bodyModel[97].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 185
		bodyModel[97].setRotationPoint(-52F, -22.3F, 10F);
		bodyModel[97].rotateAngleZ = 0.12217305F;

		bodyModel[98].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 186
		bodyModel[98].setRotationPoint(-52F, -22.3F, -11F);
		bodyModel[98].rotateAngleZ = 0.12217305F;

		bodyModel[99].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 187
		bodyModel[99].setRotationPoint(-52F, -22.3F, -4F);
		bodyModel[99].rotateAngleZ = 0.12217305F;

		bodyModel[100].addBox(0F, 0F, 0F, 4, 16, 4, 0F); // Box 188
		bodyModel[100].setRotationPoint(-52F, -24F, 5F);
		bodyModel[100].rotateAngleZ = 0.12217305F;

		bodyModel[101].addBox(0F, 0F, 0F, 4, 16, 4, 0F); // Box 189
		bodyModel[101].setRotationPoint(-52F, -24F, -9F);
		bodyModel[101].rotateAngleZ = 0.12217305F;

		bodyModel[102].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 190
		bodyModel[102].setRotationPoint(-50F, -22F, 23.9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 191
		bodyModel[103].setRotationPoint(-50F, -18F, 23.9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 192
		bodyModel[104].setRotationPoint(-50F, -18F, 19.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 193
		bodyModel[105].setRotationPoint(-50F, -22F, 19.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Box 198
		bodyModel[106].setRotationPoint(-51F, -7.5F, 18F);
		bodyModel[106].rotateAngleZ = 0.97738438F;

		bodyModel[107].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Box 199
		bodyModel[107].setRotationPoint(-51F, -7.5F, -28F);
		bodyModel[107].rotateAngleZ = 0.97738438F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 193
		bodyModel[108].setRotationPoint(-48F, -24F, 14F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 194
		bodyModel[109].setRotationPoint(-48F, -23F, 13F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[110].setRotationPoint(-49F, -21F, 15.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 199
		bodyModel[111].setRotationPoint(-40F, -23F, -4F);

		bodyModel[112].addBox(0F, 0F, 0F, 6, 2, 8, 0F); // Box 200
		bodyModel[112].setRotationPoint(-39F, -23F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 201
		bodyModel[113].setRotationPoint(-33F, -23F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, -1.5F, 4.5F, 0F, -1.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 202
		bodyModel[114].setRotationPoint(-31F, -23.5F, 4.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 206
		bodyModel[115].setRotationPoint(-48F, -23F, 18F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 212
		bodyModel[116].setRotationPoint(-50F, -22F, -27.9F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 213
		bodyModel[117].setRotationPoint(-50F, -22F, -23.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 214
		bodyModel[118].setRotationPoint(-50F, -18F, -27.9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 215
		bodyModel[119].setRotationPoint(-50F, -18F, -23.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 7, 1, 15, 0F); // Box 216
		bodyModel[120].setRotationPoint(-44F, -22.1F, 11F);

		bodyModel[121].addBox(0F, 0F, 0F, 11, 1, 15, 0F); // Box 217
		bodyModel[121].setRotationPoint(-34F, -22.1F, 11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, -1F, -3F, 2F); // Box 218
		bodyModel[122].setRotationPoint(-49F, -21F, -19.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Box 219
		bodyModel[123].setRotationPoint(-48F, -23F, -19F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Box 220
		bodyModel[124].setRotationPoint(-48F, -24F, -18F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Box 221
		bodyModel[125].setRotationPoint(-48F, -23F, -14F);

		bodyModel[126].addBox(0F, 0F, 0F, 7, 1, 15, 0F); // Box 222
		bodyModel[126].setRotationPoint(-44F, -22.1F, -26F);

		bodyModel[127].addBox(0F, 0F, 0F, 11, 1, 15, 0F); // Box 223
		bodyModel[127].setRotationPoint(-34F, -22.1F, -26F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, -1.5F, -5F, 0F, -1.5F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4.5F, 0F, 0F, 0F); // Box 224
		bodyModel[128].setRotationPoint(-31F, -23.5F, -7.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 225
		bodyModel[129].setRotationPoint(-46.5F, -5F, -2F);
		bodyModel[129].rotateAngleZ = 0.12217305F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[130].setRotationPoint(22F, -5F, 28.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Box 227
		bodyModel[131].setRotationPoint(22F, -2F, 28.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 228
		bodyModel[132].setRotationPoint(22F, 3F, 28.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[133].setRotationPoint(3F, -5F, 28.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Box 230
		bodyModel[134].setRotationPoint(3F, -2F, 28.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 231
		bodyModel[135].setRotationPoint(3F, 3F, 28.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[136].setRotationPoint(-35F, -5F, 28.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Box 233
		bodyModel[137].setRotationPoint(-35F, -2F, 28.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 234
		bodyModel[138].setRotationPoint(-35F, 3F, 28.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[139].setRotationPoint(-16F, -5F, 28.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Box 236
		bodyModel[140].setRotationPoint(-16F, -2F, 28.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 237
		bodyModel[141].setRotationPoint(-16F, 3F, 28.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[142].setRotationPoint(-33F, -5F, -30.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Box 239
		bodyModel[143].setRotationPoint(-33F, -2F, -30.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 240
		bodyModel[144].setRotationPoint(-33F, 3F, -30.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[145].setRotationPoint(-14F, -5F, -30.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Box 242
		bodyModel[146].setRotationPoint(-14F, -2F, -30.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 243
		bodyModel[147].setRotationPoint(-14F, 3F, -30.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[148].setRotationPoint(5F, -5F, -30.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Box 245
		bodyModel[149].setRotationPoint(5F, -2F, -30.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 246
		bodyModel[150].setRotationPoint(5F, 3F, -30.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 247
		bodyModel[151].setRotationPoint(24F, 3F, -30.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Box 248
		bodyModel[152].setRotationPoint(24F, -2F, -30.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[153].setRotationPoint(24F, -5F, -30.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 88, 5, 3, 0F,0.4F, 0F, -3F, -1.3F, 0F, -3F, -1.3F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 2F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0F, 00F, 0F, 0F); // Box 250
		bodyModel[154].setRotationPoint(-47F, -16F, -31F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 9, 30, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 251
		bodyModel[155].setRotationPoint(52F, -10F, -15F);
		bodyModel[155].rotateAngleZ = -0.31415927F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F); // Box 252
		bodyModel[156].setRotationPoint(52.5F, -12F, -14F);
		bodyModel[156].rotateAngleZ = -0.31415927F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F); // Box 253
		bodyModel[157].setRotationPoint(52.5F, -12F, 13F);
		bodyModel[157].rotateAngleZ = -0.31415927F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 254
		bodyModel[158].setRotationPoint(34F, -22F, 10F);

		bodyModel[159].addBox(0F, 0F, 0F, 7, 1, 9, 0F); // Box 255
		bodyModel[159].setRotationPoint(27F, -22F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 256
		bodyModel[160].setRotationPoint(26F, -22F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 257
		bodyModel[161].setRotationPoint(34F, -22F, -19F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 258
		bodyModel[162].setRotationPoint(26F, -22F, -19F);

		bodyModel[163].addBox(0F, 0F, 0F, 7, 1, 9, 0F); // Box 259
		bodyModel[163].setRotationPoint(27F, -22F, -19F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 260
		bodyModel[164].setRotationPoint(-48.5F, -22.5F, 25.4F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 261
		bodyModel[165].setRotationPoint(-48.5F, -22.5F, 21F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 262
		bodyModel[166].setRotationPoint(-48.5F, -22.5F, -26.4F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 263
		bodyModel[167].setRotationPoint(-48.5F, -22.5F, -22F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 264
		bodyModel[168].setRotationPoint(32F, -23F, -17F);
		bodyModel[168].rotateAngleY = -0.40142573F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 265
		bodyModel[169].setRotationPoint(33F, -23F, 15F);
		bodyModel[169].rotateAngleY = 0.41887902F;

		bodyModel[170].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 250
		bodyModel[170].setRotationPoint(0F, -21F, 27.1F);

		bodyModel[171].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 262
		bodyModel[171].setRotationPoint(40.5F, -21.5F, -25F);
		bodyModel[171].rotateAngleY = 0.31415927F;

		bodyModel[172].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 263
		bodyModel[172].setRotationPoint(33.5F, -26.5F, -23F);
		bodyModel[172].rotateAngleY = -0.73303829F;

		bodyModel[173].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 264
		bodyModel[173].setRotationPoint(35.5F, -25.5F, 19F);
		bodyModel[173].rotateAngleY = 0.6981317F;

		bodyModel[174].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 265
		bodyModel[174].setRotationPoint(40.5F, -19.5F, 22F);
		bodyModel[174].rotateAngleY = -0.64577182F;

		bodyModel[175].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 266
		bodyModel[175].setRotationPoint(-36.5F, -24.5F, 26F);
		bodyModel[175].rotateAngleY = 0.38397244F;

		bodyModel[176].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 267
		bodyModel[176].setRotationPoint(-39.5F, -23.5F, -31F);
		bodyModel[176].rotateAngleY = -0.27925268F;

		bodyModel[177].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 268
		bodyModel[177].setRotationPoint(-24.5F, -25.5F, -31F);
		bodyModel[177].rotateAngleY = 0.26179939F;

		bodyModel[178].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 269
		bodyModel[178].setRotationPoint(-23.5F, -23.5F, 26F);
		bodyModel[178].rotateAngleY = -0.52359878F;

		bodyModel[179].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 270
		bodyModel[179].setRotationPoint(20.5F, -23.5F, 24F);
		bodyModel[179].rotateAngleY = 0.6981317F;

		bodyModel[180].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 271
		bodyModel[180].setRotationPoint(19.5F, -22.5F, -31F);
		bodyModel[180].rotateAngleY = 0.99483767F;

		bodyModel[181].addBox(0F, 0F, 0F, 0, 0, 5, 0F); // Box 272
		bodyModel[181].setRotationPoint(33.5F, -26.5F, -23F);
		bodyModel[181].rotateAngleY = -0.73303829F;

		bodyModel[182].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 273
		bodyModel[182].setRotationPoint(-1.5F, -22.5F, -29F);
		bodyModel[182].rotateAngleY = -0.73303829F;

		bodyModel[183].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 274
		bodyModel[183].setRotationPoint(1.5F, -22.5F, -29F);
		bodyModel[183].rotateAngleY = 0.73303829F;

		bodyModel[184].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 275
		bodyModel[184].setRotationPoint(41.5F, -20.5F, 16F);
		bodyModel[184].rotateAngleY = -0.73303829F;

		bodyModel[185].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 276
		bodyModel[185].setRotationPoint(44.5F, -20.5F, 16F);
		bodyModel[185].rotateAngleY = 0.73303829F;

		bodyModel[186].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 277
		bodyModel[186].setRotationPoint(46.5F, -17.5F, -29F);
		bodyModel[186].rotateAngleY = -0.73303829F;

		bodyModel[187].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 278
		bodyModel[187].setRotationPoint(49.5F, -17.5F, -29F);
		bodyModel[187].rotateAngleY = 0.73303829F;

		bodyModel[188].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 279
		bodyModel[188].setRotationPoint(28.5F, -23.5F, 20F);
		bodyModel[188].rotateAngleY = -0.73303829F;

		bodyModel[189].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 280
		bodyModel[189].setRotationPoint(31.5F, -23.5F, 20F);
		bodyModel[189].rotateAngleY = 0.73303829F;

		bodyModel[190].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 281
		bodyModel[190].setRotationPoint(-14.5F, -23.5F, 26F);
		bodyModel[190].rotateAngleY = -0.73303829F;

		bodyModel[191].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 282
		bodyModel[191].setRotationPoint(-11.5F, -23.5F, 26F);
		bodyModel[191].rotateAngleY = 0.73303829F;

		bodyModel[192].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 283
		bodyModel[192].setRotationPoint(-46.5F, -23.5F, 26F);
		bodyModel[192].rotateAngleY = -0.85521133F;

		bodyModel[193].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 284
		bodyModel[193].setRotationPoint(-43.5F, -23.5F, 26F);
		bodyModel[193].rotateAngleY = 0.61086524F;

		bodyModel[194].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 285
		bodyModel[194].setRotationPoint(-12.5F, -23.5F, -32F);
		bodyModel[194].rotateAngleY = -0.85521133F;

		bodyModel[195].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 286
		bodyModel[195].setRotationPoint(-9.5F, -23.5F, -32F);
		bodyModel[195].rotateAngleY = 0.61086524F;

		bodyModel[196].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 287
		bodyModel[196].setRotationPoint(33.5F, -24.5F, -16F);
		bodyModel[196].rotateAngleY = -1.37881011F;

		bodyModel[197].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 288
		bodyModel[197].setRotationPoint(40.5F, -19.5F, -18F);
		bodyModel[197].rotateAngleY = -0.33161256F;

		bodyModel[198].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 289
		bodyModel[198].setRotationPoint(33.5F, -24.5F, 17F);
		bodyModel[198].rotateAngleY = 0.31415927F;

		bodyModel[199].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 290
		bodyModel[199].setRotationPoint(38.5F, -20.5F, 20F);
		bodyModel[199].rotateAngleY = -1.02974426F;

		bodyModel[200].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 291
		bodyModel[200].setRotationPoint(45.5F, -20.5F, 22F);
		bodyModel[200].rotateAngleY = -0.73303829F;

		bodyModel[201].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 292
		bodyModel[201].setRotationPoint(48.5F, -20.5F, 22F);
		bodyModel[201].rotateAngleY = 0.73303829F;

		bodyModel[202].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 293
		bodyModel[202].setRotationPoint(36.5F, -26.5F, -21F);
		bodyModel[202].rotateAngleY = -0.73303829F;

		bodyModel[203].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 294
		bodyModel[203].setRotationPoint(39.5F, -26.5F, -21F);
		bodyModel[203].rotateAngleY = 0.73303829F;

		bodyModel[204].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 295
		bodyModel[204].setRotationPoint(40.5F, -21.5F, -22F);
		bodyModel[204].rotateAngleY = -0.73303829F;

		bodyModel[205].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 296
		bodyModel[205].setRotationPoint(43.5F, -21.5F, -22F);
		bodyModel[205].rotateAngleY = 0.73303829F;

		bodyModel[206].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 297
		bodyModel[206].setRotationPoint(47.5F, -17.5F, -27F);
		bodyModel[206].rotateAngleY = -0.73303829F;

		bodyModel[207].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 298
		bodyModel[207].setRotationPoint(50.5F, -17.5F, -27F);
		bodyModel[207].rotateAngleY = 0.73303829F;

		bodyModel[208].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 299
		bodyModel[208].setRotationPoint(47.5F, -16.5F, -29F);
		bodyModel[208].rotateAngleY = 0.31415927F;

		bodyModel[209].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 300
		bodyModel[209].setRotationPoint(15.5F, -22.5F, -30F);
		bodyModel[209].rotateAngleY = -0.73303829F;

		bodyModel[210].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 301
		bodyModel[210].setRotationPoint(18.5F, -22.5F, -30F);
		bodyModel[210].rotateAngleY = 0.73303829F;

		bodyModel[211].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 302
		bodyModel[211].setRotationPoint(13.5F, -22.5F, -30F);
		bodyModel[211].rotateAngleY = 0.99483767F;

		bodyModel[212].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 303
		bodyModel[212].setRotationPoint(25.5F, -21.5F, -30F);
		bodyModel[212].rotateAngleY = -0.95993109F;

		bodyModel[213].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 304
		bodyModel[213].setRotationPoint(26.5F, -21.5F, -30F);
		bodyModel[213].rotateAngleY = 1.85004901F;

		bodyModel[214].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 305
		bodyModel[214].setRotationPoint(11.5F, -21.5F, -29F);
		bodyModel[214].rotateAngleY = 0.12217305F;

		bodyModel[215].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 306
		bodyModel[215].setRotationPoint(24.5F, -22.5F, 24F);
		bodyModel[215].rotateAngleY = 0.6981317F;

		bodyModel[216].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 307
		bodyModel[216].setRotationPoint(25.5F, -20.5F, 27F);
		bodyModel[216].rotateAngleY = 0.73303829F;

		bodyModel[217].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 308
		bodyModel[217].setRotationPoint(22.5F, -20.5F, 27F);
		bodyModel[217].rotateAngleY = -0.73303829F;

		bodyModel[218].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 309
		bodyModel[218].setRotationPoint(38.5F, -18.5F, 23F);
		bodyModel[218].rotateAngleY = 0.08726646F;

		bodyModel[219].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 310
		bodyModel[219].setRotationPoint(35.5F, -23.5F, 22F);
		bodyModel[219].rotateAngleY = 1.81514242F;


		turretModel = new ModelRendererTurbo[30];
		turretModel[0] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 8
		turretModel[1] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 9
		turretModel[2] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 10
		turretModel[3] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 12
		turretModel[4] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 13
		turretModel[5] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 15
		turretModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		turretModel[7] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 33
		turretModel[8] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 34
		turretModel[9] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 37
		turretModel[10] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 38
		turretModel[11] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 39
		turretModel[12] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 40
		turretModel[13] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 41
		turretModel[14] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 42
		turretModel[15] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 43
		turretModel[16] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 44
		turretModel[17] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 45
		turretModel[18] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 39
		turretModel[19] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 40
		turretModel[20] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 41
		turretModel[21] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 42
		turretModel[22] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 43
		turretModel[23] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 44
		turretModel[24] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 45
		turretModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		turretModel[26] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 47
		turretModel[27] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 0
		turretModel[28] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 1
		turretModel[29] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 16

		turretModel[0].addBox(0F, -35F, -19.5F, 15, 14, 39, 0F); // Box 8
		turretModel[0].setRotationPoint(-7F, 0F, 0F);

		turretModel[1].addShapeBox(0F, -35F, -19.5F, 7, 14, 39, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 9
		turretModel[1].setRotationPoint(-14F, 0F, 0F);

		turretModel[2].addShapeBox(0F, -22F, -19.5F, 7, 1, 39, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 10
		turretModel[2].setRotationPoint(8F, 0F, 0F);

		turretModel[3].addShapeBox(0F, -35F, -15.5F, 4, 14, 29, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 12
		turretModel[3].setRotationPoint(-18F, 0F, 1F);

		turretModel[4].addShapeBox(0F, -22F, -14.5F, 4, 1, 29, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 13
		turretModel[4].setRotationPoint(15F, 0F, 0F);

		turretModel[5].addShapeBox(0F, -35F, -19.5F, 13, 13, 39, 0F,0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 15
		turretModel[5].setRotationPoint(8F, 0F, 0F);

		turretModel[6].addShapeBox(-19F, -35F, -3.5F, 5, 11, 7, 0F,0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[6].setRotationPoint(-7F, 0F, 0F);

		turretModel[7].addShapeBox(-19F, -35F, 3.5F, 8, 11, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -3F, 0F, 3F); // Box 33
		turretModel[7].setRotationPoint(-7F, 0F, 0F);

		turretModel[8].addShapeBox(-12F, -35F, -3.5F, 1, 11, 7, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[8].setRotationPoint(-7F, 0F, 0F);

		turretModel[9].addShapeBox(-19F, -35F, -3.5F, 8, 11, 5, 0F,-3F, -1F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 37
		turretModel[9].setRotationPoint(-7F, 0F, -5F);

		turretModel[10].addBox(0F, -39F, 5F, 7, 4, 13, 0F); // Box 38
		turretModel[10].setRotationPoint(-9F, 0F, 0F);

		turretModel[11].addShapeBox(8F, -39F, 5F, 3, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 39
		turretModel[11].setRotationPoint(-10F, 0F, 0F);

		turretModel[12].addShapeBox(-2F, -39F, 5F, 3, 4, 13, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 40
		turretModel[12].setRotationPoint(-10F, 0F, 0F);

		turretModel[13].addBox(26.7F, -29F, -15F, 2, 2, 30, 0F); // Box 41
		turretModel[13].setRotationPoint(-7F, 0F, 0F);

		turretModel[14].addBox(26.2F, -29.5F, -14F, 3, 3, 28, 0F); // Box 42
		turretModel[14].setRotationPoint(-7F, 0F, 0F);

		turretModel[15].addShapeBox(7.5F, -40F, 5.5F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 43
		turretModel[15].setRotationPoint(-10F, 0F, 0F);

		turretModel[16].addBox(0.5F, -40F, 5.5F, 6, 1, 12, 0F); // Box 44
		turretModel[16].setRotationPoint(-9F, 0F, 0F);

		turretModel[17].addShapeBox(-1.5F, -40F, 5.5F, 3, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 45
		turretModel[17].setRotationPoint(-10F, 0F, 0F);

		turretModel[18].addBox(6F, -36F, -16.5F, 8, 1, 10, 0F); // Box 39
		turretModel[18].setRotationPoint(-7F, 0F, 0F);

		turretModel[19].addShapeBox(11.5F, -36F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 40
		turretModel[19].setRotationPoint(-9F, 0F, 0F);

		turretModel[20].addBox(6.5F, -36F, -2F, 2, 1, 4, 0F); // Box 41
		turretModel[20].setRotationPoint(-6F, 0F, 0F);

		turretModel[21].addShapeBox(6.5F, -36F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 42
		turretModel[21].setRotationPoint(-7F, 0F, 0F);

		turretModel[22].addBox(5F, -35.5F, -15.5F, 1, 1, 3, 0F); // Box 43
		turretModel[22].setRotationPoint(-7F, 0F, 0F);

		turretModel[23].addBox(5F, -35.5F, -10.5F, 1, 1, 3, 0F); // Box 44
		turretModel[23].setRotationPoint(-7F, 0F, 0F);

		turretModel[24].addShapeBox(12F, -37F, -13.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		turretModel[24].setRotationPoint(-7F, 0F, 0F);

		turretModel[25].addShapeBox(12F, -36.5F, -13.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		turretModel[25].setRotationPoint(-7F, 0F, 0F);

		turretModel[26].addShapeBox(12F, -36.5F, -10.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		turretModel[26].setRotationPoint(-7F, 0F, 0F);

		turretModel[27].addShapeBox(10F, -36F, -13F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		turretModel[27].setRotationPoint(-2F, 0F, 0F);

		turretModel[28].addShapeBox(15.8F, -36F, -13.5F, 1, 1, 4, 0F,0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F); // Box 1
		turretModel[28].setRotationPoint(-8F, 0F, 0F);

		turretModel[29].addShapeBox(0F, -33F, -12.5F, 2, 11, 25, 0F,0F, 0F, 0F, 1F, -4.5F, 0F, 1F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4.5F, 0F, 1F, -4.5F, 0F, 0F, 0F, 0F); // Box 16
		turretModel[29].setRotationPoint(20F, 0F, 0F);


		barrelModel = new ModelRendererTurbo[18];
		barrelModel[0] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 17
		barrelModel[1] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 19
		barrelModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		barrelModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 21
		barrelModel[4] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 22
		barrelModel[5] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 23
		barrelModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 24
		barrelModel[7] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 26
		barrelModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 27
		barrelModel[9] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 250
		barrelModel[10] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 251
		barrelModel[11] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 252
		barrelModel[12] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 253
		barrelModel[13] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 254
		barrelModel[14] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 255
		barrelModel[15] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 48
		barrelModel[16] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 49
		barrelModel[17] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 50

		barrelModel[0].addShapeBox(-1F, -2F, -11F, 2, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		barrelModel[0].setRotationPoint(23.5F, -29.5F, 0F);

		barrelModel[1].addShapeBox(0.5F, -2F, -10F, 1, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		barrelModel[1].setRotationPoint(23.5F, -29.5F, 0F);

		barrelModel[2].addShapeBox(1.5F, -1F, -4F, 1, 6, 8, 0F,0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 20
		barrelModel[2].setRotationPoint(23.5F, -29.5F, 0F);

		barrelModel[3].addShapeBox(2.5F, -1F, -2F, 14, 4, 4, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 21
		barrelModel[3].setRotationPoint(23.5F, -28.5F, 0F);

		barrelModel[4].addShapeBox(16.5F, -1F, -2F, 15, 4, 4, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 22
		barrelModel[4].setRotationPoint(23.5F, -28.5F, 0F);

		barrelModel[5].addShapeBox(31.5F, -1F, -2F, 28, 4, 4, 0F,0F, -0.6F, -0.6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.6F, -0.6F); // Box 23
		barrelModel[5].setRotationPoint(23.5F, -28.5F, 0F);

		barrelModel[6].addShapeBox(31.5F, -1F, -2F, 1, 4, 4, 0F,0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F); // Box 24
		barrelModel[6].setRotationPoint(23.5F, -28.5F, 0F);

		barrelModel[7].addShapeBox(16.5F, -1F, -2F, 1, 4, 4, 0F,0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0.3F, 0.3F); // Box 26
		barrelModel[7].setRotationPoint(23.5F, -28.5F, 0F);

		barrelModel[8].addShapeBox(2.5F, -0.5F, -2.5F, 1, 5, 5, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 27
		barrelModel[8].setRotationPoint(23.5F, -29.5F, 0F);

		barrelModel[9].addBox(50F, -0.5F, -1.5F, 3, 4, 3, 0F); // Box 250
		barrelModel[9].setRotationPoint(23.5F, -28.5F, 0F);

		barrelModel[10].addBox(46F, 0F, -1.5F, 1, 6, 3, 0F); // Box 251
		barrelModel[10].setRotationPoint(23.5F, -29F, 0F);

		barrelModel[11].addBox(46F, 5F, -1.5F, 6, 1, 1, 0F); // Box 252
		barrelModel[11].setRotationPoint(23.5F, -28.5F, 0F);
		barrelModel[11].rotateAngleZ = 0.03490659F;

		barrelModel[12].addBox(47F, 4.5F, 0.5F, 6, 1, 1, 0F); // Box 253
		barrelModel[12].setRotationPoint(23.5F, -29.5F, 0F);

		barrelModel[13].addBox(52F, 4F, -1F, 1, 3, 1, 0F); // Box 254
		barrelModel[13].setRotationPoint(23.5F, -29.5F, 0F);

		barrelModel[14].addShapeBox(52F, 6F, -1F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		barrelModel[14].setRotationPoint(22.5F, -28.5F, 0F);

		barrelModel[15].addShapeBox(59.5F, -1F, -2F, 3, 4, 4, 0F,0F, -1F, -1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, -1F, -1F); // Box 48
		barrelModel[15].setRotationPoint(22.5F, -28.5F, 0F);

		barrelModel[16].addShapeBox(62.5F, -0.5F, -1.5F, 2, 3, 3, 0F,0F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 49
		barrelModel[16].setRotationPoint(22.5F, -28.5F, 0F);

		barrelModel[17].addShapeBox(66.5F, -1F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 50
		barrelModel[17].setRotationPoint(22.5F, -28.5F, 0F);


		leftTrackModel = new ModelRendererTurbo[19];
		leftTrackModel[0] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 70
		leftTrackModel[1] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 71
		leftTrackModel[2] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 72
		leftTrackModel[3] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 73
		leftTrackModel[4] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 74
		leftTrackModel[5] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 75
		leftTrackModel[6] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 76
		leftTrackModel[7] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 77
		leftTrackModel[8] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 78
		leftTrackModel[9] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 79
		leftTrackModel[10] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 80
		leftTrackModel[11] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 81
		leftTrackModel[12] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 82
		leftTrackModel[13] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 83
		leftTrackModel[14] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 84
		leftTrackModel[15] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 87
		leftTrackModel[16] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Box 267
		leftTrackModel[17] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Box 268
		leftTrackModel[18] = new ModelRendererTurbo(this, 217, 305, textureX, textureY); // Box 269

		leftTrackModel[0].addBox(-2F, 0F, 0F, 7, 1, 12, 0F); // Box 70
		leftTrackModel[0].setRotationPoint(-46F, -7F, -31F);
		leftTrackModel[0].rotateAngleZ = 0.40142573F;

		leftTrackModel[1].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 71
		leftTrackModel[1].setRotationPoint(-47.9F, -6.3F, -31F);
		leftTrackModel[1].rotateAngleZ = 1.01229097F;

		leftTrackModel[2].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 72
		leftTrackModel[2].setRotationPoint(-49F, -4.6F, -31F);
		leftTrackModel[2].rotateAngleZ = 1.50098316F;

		leftTrackModel[3].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 73
		leftTrackModel[3].setRotationPoint(-49.2F, -2.6F, -31F);
		leftTrackModel[3].rotateAngleZ = 1.58824962F;

		leftTrackModel[4].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 74
		leftTrackModel[4].setRotationPoint(-49.2F, -0.6F, -31F);
		leftTrackModel[4].rotateAngleZ = 1.76278254F;

		leftTrackModel[5].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 75
		leftTrackModel[5].setRotationPoint(-48.8F, 1.4F, -31F);
		leftTrackModel[5].rotateAngleZ = 2.23402144F;

		leftTrackModel[6].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Box 76
		leftTrackModel[6].setRotationPoint(-47.6F, 3F, -31F);
		leftTrackModel[6].rotateAngleZ = 2.47836754F;

		leftTrackModel[7].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Box 77
		leftTrackModel[7].setRotationPoint(-43.7F, 6F, -31F);
		leftTrackModel[7].rotateAngleZ = 2.72271363F;

		leftTrackModel[8].addBox(0F, 0F, 0F, 77, 1, 12, 0F); // Box 78
		leftTrackModel[8].setRotationPoint(-39.4F, 7F, -31F);

		leftTrackModel[9].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 79
		leftTrackModel[9].setRotationPoint(49.6F, -0.1F, -31F);
		leftTrackModel[9].rotateAngleZ = 1.48352986F;

		leftTrackModel[10].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 80
		leftTrackModel[10].setRotationPoint(49.9F, -4.1F, -31F);
		leftTrackModel[10].rotateAngleZ = 1.79768913F;

		leftTrackModel[11].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 81
		leftTrackModel[11].setRotationPoint(49F, 1.9F, -31F);
		leftTrackModel[11].rotateAngleZ = 1.25663706F;

		leftTrackModel[12].addBox(0F, -1F, 0F, 11, 1, 12, 0F); // Box 82
		leftTrackModel[12].setRotationPoint(37.6F, 8F, -31F);
		leftTrackModel[12].rotateAngleZ = 0.43633231F;

		leftTrackModel[13].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 83
		leftTrackModel[13].setRotationPoint(47.6F, 3.3F, -31F);
		leftTrackModel[13].rotateAngleZ = 0.80285146F;

		leftTrackModel[14].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 84
		leftTrackModel[14].setRotationPoint(49.2F, -7.1F, -31F);
		leftTrackModel[14].rotateAngleZ = 2.32128791F;

		leftTrackModel[15].addBox(0F, 0F, 0F, 75, 1, 12, 0F); // Box 87
		leftTrackModel[15].setRotationPoint(-41.4F, -9F, -31F);

		leftTrackModel[16].addBox(0F, -1F, 0F, 6, 1, 12, 0F); // Box 267
		leftTrackModel[16].setRotationPoint(39.3F, -10.1F, -31F);
		leftTrackModel[16].rotateAngleZ = 3.33357887F;

		leftTrackModel[17].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 268
		leftTrackModel[17].setRotationPoint(42.2F, -10.1F, -31F);
		leftTrackModel[17].rotateAngleZ = 3.14159265F;

		leftTrackModel[18].addBox(0F, -1F, 0F, 5, 1, 12, 0F); // Box 269
		leftTrackModel[18].setRotationPoint(47.1F, -9.3F, -31F);
		leftTrackModel[18].rotateAngleZ = 2.98451302F;


		rightTrackModel = new ModelRendererTurbo[19];
		rightTrackModel[0] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 51
		rightTrackModel[1] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 52
		rightTrackModel[2] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 53
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 54
		rightTrackModel[4] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 55
		rightTrackModel[5] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 56
		rightTrackModel[6] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 57
		rightTrackModel[7] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 58
		rightTrackModel[8] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 59
		rightTrackModel[9] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 60
		rightTrackModel[10] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 61
		rightTrackModel[11] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 62
		rightTrackModel[12] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 63
		rightTrackModel[13] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 64
		rightTrackModel[14] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 65
		rightTrackModel[15] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 66
		rightTrackModel[16] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 67
		rightTrackModel[17] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 68
		rightTrackModel[18] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 69

		rightTrackModel[0].addBox(0F, 0F, 0F, 75, 1, 12, 0F); // Box 51
		rightTrackModel[0].setRotationPoint(-41.4F, -9F, 19F);

		rightTrackModel[1].addBox(-2F, 0F, 0F, 7, 1, 12, 0F); // Box 52
		rightTrackModel[1].setRotationPoint(-46F, -7F, 19F);
		rightTrackModel[1].rotateAngleZ = 0.40142573F;

		rightTrackModel[2].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 53
		rightTrackModel[2].setRotationPoint(-47.9F, -6.3F, 19F);
		rightTrackModel[2].rotateAngleZ = 1.01229097F;

		rightTrackModel[3].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 54
		rightTrackModel[3].setRotationPoint(-49F, -4.6F, 19F);
		rightTrackModel[3].rotateAngleZ = 1.50098316F;

		rightTrackModel[4].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 55
		rightTrackModel[4].setRotationPoint(-49.2F, -2.6F, 19F);
		rightTrackModel[4].rotateAngleZ = 1.58824962F;

		rightTrackModel[5].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 56
		rightTrackModel[5].setRotationPoint(-49.2F, -0.6F, 19F);
		rightTrackModel[5].rotateAngleZ = 1.76278254F;

		rightTrackModel[6].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Box 57
		rightTrackModel[6].setRotationPoint(-48.8F, 1.4F, 19F);
		rightTrackModel[6].rotateAngleZ = 2.23402144F;

		rightTrackModel[7].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Box 58
		rightTrackModel[7].setRotationPoint(-47.6F, 3F, 19F);
		rightTrackModel[7].rotateAngleZ = 2.47836754F;

		rightTrackModel[8].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Box 59
		rightTrackModel[8].setRotationPoint(-43.7F, 6F, 19F);
		rightTrackModel[8].rotateAngleZ = 2.72271363F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 77, 1, 12, 0F); // Box 60
		rightTrackModel[9].setRotationPoint(-39.4F, 7F, 19F);

		rightTrackModel[10].addBox(0F, -1F, 0F, 11, 1, 12, 0F); // Box 61
		rightTrackModel[10].setRotationPoint(37.6F, 8F, 19F);
		rightTrackModel[10].rotateAngleZ = 0.43633231F;

		rightTrackModel[11].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 62
		rightTrackModel[11].setRotationPoint(47.6F, 3.3F, 19F);
		rightTrackModel[11].rotateAngleZ = 0.80285146F;

		rightTrackModel[12].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 63
		rightTrackModel[12].setRotationPoint(49F, 1.9F, 19F);
		rightTrackModel[12].rotateAngleZ = 1.25663706F;

		rightTrackModel[13].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 64
		rightTrackModel[13].setRotationPoint(49.6F, -0.1F, 19F);
		rightTrackModel[13].rotateAngleZ = 1.48352986F;

		rightTrackModel[14].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 65
		rightTrackModel[14].setRotationPoint(49.9F, -4.1F, 19F);
		rightTrackModel[14].rotateAngleZ = 1.79768913F;

		rightTrackModel[15].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 66
		rightTrackModel[15].setRotationPoint(49.2F, -7.1F, 19F);
		rightTrackModel[15].rotateAngleZ = 2.32128791F;

		rightTrackModel[16].addBox(0F, -1F, 0F, 5, 1, 12, 0F); // Box 67
		rightTrackModel[16].setRotationPoint(47.1F, -9.3F, 19F);
		rightTrackModel[16].rotateAngleZ = 2.98451302F;

		rightTrackModel[17].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 68
		rightTrackModel[17].setRotationPoint(42.2F, -10.1F, 19F);
		rightTrackModel[17].rotateAngleZ = 3.14159265F;

		rightTrackModel[18].addBox(0F, -1F, 0F, 6, 1, 12, 0F); // Box 69
		rightTrackModel[18].setRotationPoint(39.3F, -10.1F, 19F);
		rightTrackModel[18].rotateAngleZ = 3.33357887F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}