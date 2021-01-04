//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelB52 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;
	
	public ModelB52() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[287];
		noseModel = new ModelRendererTurbo[11];
		tailModel = new ModelRendererTurbo[9];
		leftWingModel = new ModelRendererTurbo[86];
		rightWingModel = new ModelRendererTurbo[86];
		topWingModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[68];
		leftWingWheelModel = new ModelRendererTurbo[6];
		rightWingWheelModel = new ModelRendererTurbo[6];
		
		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittopWingModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
	
	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 571, textureX, textureY); // Box 20
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Box 20
		bodyModel[3] = new ModelRendererTurbo(this, 0, 678, textureX, textureY); // Box 20
		bodyModel[4] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Box 20
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 269, 890, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 198, 1001, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 0, 779, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 116, 779, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 163, 779, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 494, 940, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 361, 974, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 320, 979, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 0, 898, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 644, 779, textureX, textureY); // Box 20
		bodyModel[22] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		bodyModel[23] = new ModelRendererTurbo(this, 644, 829, textureX, textureY); // Box 20
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[27] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		bodyModel[28] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		bodyModel[29] = new ModelRendererTurbo(this, -1, 839, textureX, textureY); // Box 20
		bodyModel[30] = new ModelRendererTurbo(this, 116, 829, textureX, textureY); // Box 20
		bodyModel[31] = new ModelRendererTurbo(this, 163, 829, textureX, textureY); // Box 20
		bodyModel[32] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[33] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[34] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[36] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[37] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[38] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 20
		bodyModel[39] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 20
		bodyModel[40] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 20
		bodyModel[41] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 20
		bodyModel[42] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 20
		bodyModel[43] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 20
		bodyModel[44] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 20
		bodyModel[45] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 20
		bodyModel[46] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 20
		bodyModel[47] = new ModelRendererTurbo(this, 135, 1001, textureX, textureY); // Box 20
		bodyModel[48] = new ModelRendererTurbo(this, 167, 1001, textureX, textureY); // Box 20
		bodyModel[49] = new ModelRendererTurbo(this, 298, 1001, textureX, textureY); // Box 20
		bodyModel[50] = new ModelRendererTurbo(this, 282, 1001, textureX, textureY); // Box 20
		bodyModel[51] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 20
		bodyModel[52] = new ModelRendererTurbo(this, 198, 1001, textureX, textureY); // Box 20
		bodyModel[53] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 20
		bodyModel[54] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 20
		bodyModel[55] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 20
		bodyModel[56] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 20
		bodyModel[57] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 20
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 20
		bodyModel[64] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 20
		bodyModel[65] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 20
		bodyModel[66] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 20
		bodyModel[67] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 20
		bodyModel[68] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 20
		bodyModel[69] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 20
		bodyModel[70] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 20
		bodyModel[71] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 20
		bodyModel[72] = new ModelRendererTurbo(this, 135, 1001, textureX, textureY); // Box 20
		bodyModel[73] = new ModelRendererTurbo(this, 167, 1001, textureX, textureY); // Box 20
		bodyModel[74] = new ModelRendererTurbo(this, 298, 1001, textureX, textureY); // Box 20
		bodyModel[75] = new ModelRendererTurbo(this, 282, 1001, textureX, textureY); // Box 20
		bodyModel[76] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 20
		bodyModel[77] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 20
		bodyModel[78] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 20
		bodyModel[79] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 20
		bodyModel[80] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 20
		bodyModel[81] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 20
		bodyModel[82] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1076, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 463, 890, textureX, textureY); // Box 107
		bodyModel[85] = new ModelRendererTurbo(this, 282, 1001, textureX, textureY); // Box 108
		bodyModel[86] = new ModelRendererTurbo(this, 298, 1001, textureX, textureY); // Box 109
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 110
		bodyModel[88] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 111
		bodyModel[89] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 112
		bodyModel[90] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 113
		bodyModel[91] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 114
		bodyModel[92] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 115
		bodyModel[93] = new ModelRendererTurbo(this, 167, 1001, textureX, textureY); // Box 116
		bodyModel[94] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 117
		bodyModel[95] = new ModelRendererTurbo(this, 198, 1001, textureX, textureY); // Box 118
		bodyModel[96] = new ModelRendererTurbo(this, 135, 1001, textureX, textureY); // Box 119
		bodyModel[97] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 120
		bodyModel[98] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 121
		bodyModel[99] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 122
		bodyModel[100] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 123
		bodyModel[101] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 124
		bodyModel[102] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 125
		bodyModel[103] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 126
		bodyModel[104] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 127
		bodyModel[105] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 129
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 130
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 131
		bodyModel[109] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 132
		bodyModel[110] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 133
		bodyModel[111] = new ModelRendererTurbo(this, 282, 1001, textureX, textureY); // Box 134
		bodyModel[112] = new ModelRendererTurbo(this, 298, 1001, textureX, textureY); // Box 135
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 136
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 137
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 138
		bodyModel[116] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 139
		bodyModel[117] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 140
		bodyModel[118] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 141
		bodyModel[119] = new ModelRendererTurbo(this, 167, 1001, textureX, textureY); // Box 142
		bodyModel[120] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 143
		bodyModel[121] = new ModelRendererTurbo(this, 198, 1001, textureX, textureY); // Box 144
		bodyModel[122] = new ModelRendererTurbo(this, 135, 1001, textureX, textureY); // Box 145
		bodyModel[123] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 146
		bodyModel[124] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 147
		bodyModel[125] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 148
		bodyModel[126] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 149
		bodyModel[127] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 150
		bodyModel[128] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 151
		bodyModel[129] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 152
		bodyModel[130] = new ModelRendererTurbo(this, 91, 0, textureX, textureY); // Box 153
		bodyModel[131] = new ModelRendererTurbo(this, 91, 0, textureX, textureY); // Box 154
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 155
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 156
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 157
		bodyModel[135] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 158
		bodyModel[136] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 159
		bodyModel[137] = new ModelRendererTurbo(this, 282, 1001, textureX, textureY); // Box 238
		bodyModel[138] = new ModelRendererTurbo(this, 298, 1001, textureX, textureY); // Box 239
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 240
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 241
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 242
		bodyModel[142] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 243
		bodyModel[143] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 244
		bodyModel[144] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 245
		bodyModel[145] = new ModelRendererTurbo(this, 167, 1001, textureX, textureY); // Box 246
		bodyModel[146] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 247
		bodyModel[147] = new ModelRendererTurbo(this, 198, 1001, textureX, textureY); // Box 248
		bodyModel[148] = new ModelRendererTurbo(this, 135, 1001, textureX, textureY); // Box 249
		bodyModel[149] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 250
		bodyModel[150] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 251
		bodyModel[151] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 252
		bodyModel[152] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 253
		bodyModel[153] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 254
		bodyModel[154] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 255
		bodyModel[155] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 256
		bodyModel[156] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 257
		bodyModel[157] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 258
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 259
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 260
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 261
		bodyModel[161] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 262
		bodyModel[162] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 263
		bodyModel[163] = new ModelRendererTurbo(this, 282, 1001, textureX, textureY); // Box 264
		bodyModel[164] = new ModelRendererTurbo(this, 298, 1001, textureX, textureY); // Box 265
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 266
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 267
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 268
		bodyModel[168] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 269
		bodyModel[169] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 270
		bodyModel[170] = new ModelRendererTurbo(this, 227, 1001, textureX, textureY); // Box 271
		bodyModel[171] = new ModelRendererTurbo(this, 167, 1001, textureX, textureY); // Box 272
		bodyModel[172] = new ModelRendererTurbo(this, 240, 1001, textureX, textureY); // Box 273
		bodyModel[173] = new ModelRendererTurbo(this, 198, 1001, textureX, textureY); // Box 274
		bodyModel[174] = new ModelRendererTurbo(this, 135, 1001, textureX, textureY); // Box 275
		bodyModel[175] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 276
		bodyModel[176] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 277
		bodyModel[177] = new ModelRendererTurbo(this, 50, 1001, textureX, textureY); // Box 278
		bodyModel[178] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 279
		bodyModel[179] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 280
		bodyModel[180] = new ModelRendererTurbo(this, 122, 1001, textureX, textureY); // Box 281
		bodyModel[181] = new ModelRendererTurbo(this, 105, 1001, textureX, textureY); // Box 282
		bodyModel[182] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 283
		bodyModel[183] = new ModelRendererTurbo(this, 91, 1001, textureX, textureY); // Box 284
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 285
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 286
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 287
		bodyModel[187] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 288
		bodyModel[188] = new ModelRendererTurbo(this, 250, 1001, textureX, textureY); // Box 289
		bodyModel[189] = new ModelRendererTurbo(this, 463, 890, textureX, textureY); // Box 291
		bodyModel[190] = new ModelRendererTurbo(this, 432, 972, textureX, textureY); // Box 292
		bodyModel[191] = new ModelRendererTurbo(this, 361, 974, textureX, textureY); // Box 293
		bodyModel[192] = new ModelRendererTurbo(this, 320, 979, textureX, textureY); // Box 294
		bodyModel[193] = new ModelRendererTurbo(this, 361, 974, textureX, textureY); // Box 296
		bodyModel[194] = new ModelRendererTurbo(this, 320, 979, textureX, textureY); // Box 297
		bodyModel[195] = new ModelRendererTurbo(this, 463, 890, textureX, textureY); // Box 298
		bodyModel[196] = new ModelRendererTurbo(this, 302, 1063, textureX, textureY); // Box 299
		bodyModel[197] = new ModelRendererTurbo(this, 302, 1063, textureX, textureY); // Box 300
		bodyModel[198] = new ModelRendererTurbo(this, 302, 1063, textureX, textureY); // Box 306
		bodyModel[199] = new ModelRendererTurbo(this, 302, 1063, textureX, textureY); // Box 307
		bodyModel[200] = new ModelRendererTurbo(this, 302, 1063, textureX, textureY); // Box 308
		bodyModel[201] = new ModelRendererTurbo(this, 302, 1063, textureX, textureY); // Box 309
		bodyModel[202] = new ModelRendererTurbo(this, 302, 1063, textureX, textureY); // Box 310
		bodyModel[203] = new ModelRendererTurbo(this, 505, 972, textureX, textureY); // Box 311
		bodyModel[204] = new ModelRendererTurbo(this, 432, 972, textureX, textureY); // Box 312
		bodyModel[205] = new ModelRendererTurbo(this, 432, 972, textureX, textureY); // Box 313
		bodyModel[206] = new ModelRendererTurbo(this, 505, 972, textureX, textureY); // Box 314
		bodyModel[207] = new ModelRendererTurbo(this, 432, 972, textureX, textureY); // Box 315
		bodyModel[208] = new ModelRendererTurbo(this, 214, 1063, textureX, textureY); // Box 316
		bodyModel[209] = new ModelRendererTurbo(this, 214, 1063, textureX, textureY); // Box 317
		bodyModel[210] = new ModelRendererTurbo(this, 218, 1086, textureX, textureY); // Box 318
		bodyModel[211] = new ModelRendererTurbo(this, 218, 1086, textureX, textureY); // Box 319
		bodyModel[212] = new ModelRendererTurbo(this, 113, 1063, textureX, textureY); // Box 323
		bodyModel[213] = new ModelRendererTurbo(this, 448, 779, textureX, textureY); // Box 324
		bodyModel[214] = new ModelRendererTurbo(this, 612, 779, textureX, textureY); // Box 326
		bodyModel[215] = new ModelRendererTurbo(this, 537, 779, textureX, textureY); // Box 327
		bodyModel[216] = new ModelRendererTurbo(this, 574, 779, textureX, textureY); // Box 328
		bodyModel[217] = new ModelRendererTurbo(this, 448, 829, textureX, textureY); // Box 329
		bodyModel[218] = new ModelRendererTurbo(this, 612, 829, textureX, textureY); // Box 330
		bodyModel[219] = new ModelRendererTurbo(this, 537, 829, textureX, textureY); // Box 331
		bodyModel[220] = new ModelRendererTurbo(this, 574, 829, textureX, textureY); // Box 332
		bodyModel[221] = new ModelRendererTurbo(this, 1532, 789, textureX, textureY); // Box 333
		bodyModel[222] = new ModelRendererTurbo(this, 1660, 788, textureX, textureY); // Box 334
		bodyModel[223] = new ModelRendererTurbo(this, 1321, 779, textureX, textureY); // Box 335
		bodyModel[224] = new ModelRendererTurbo(this, 1439, 777, textureX, textureY); // Box 336
		bodyModel[225] = new ModelRendererTurbo(this, 398, 779, textureX, textureY); // Box 337
		bodyModel[226] = new ModelRendererTurbo(this, 398, 829, textureX, textureY); // Box 338
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1044, textureX, textureY); // Box 358
		bodyModel[228] = new ModelRendererTurbo(this, 65, 1044, textureX, textureY); // Box 359
		bodyModel[229] = new ModelRendererTurbo(this, 0, 1044, textureX, textureY); // Box 360
		bodyModel[230] = new ModelRendererTurbo(this, 65, 1044, textureX, textureY); // Box 361
		bodyModel[231] = new ModelRendererTurbo(this, 569, 0, textureX, textureY); // Box 362
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1044, textureX, textureY); // Box 363
		bodyModel[233] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 364
		bodyModel[234] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 365
		bodyModel[235] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 366
		bodyModel[236] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 367
		bodyModel[237] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 368
		bodyModel[238] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 369
		bodyModel[239] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 370
		bodyModel[240] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 371
		bodyModel[241] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 372
		bodyModel[242] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 373
		bodyModel[243] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 374
		bodyModel[244] = new ModelRendererTurbo(this, 50, 1044, textureX, textureY); // Box 375
		bodyModel[245] = new ModelRendererTurbo(this, 345, 779, textureX, textureY); // Box 376
		bodyModel[246] = new ModelRendererTurbo(this, 300, 779, textureX, textureY); // Box 377
		bodyModel[247] = new ModelRendererTurbo(this, 322, 779, textureX, textureY); // Box 378
		bodyModel[248] = new ModelRendererTurbo(this, 949, 875, textureX, textureY); // Box 379
		bodyModel[249] = new ModelRendererTurbo(this, 878, 875, textureX, textureY); // Box 380
		bodyModel[250] = new ModelRendererTurbo(this, 890, 781, textureX, textureY); // Box 386
		bodyModel[251] = new ModelRendererTurbo(this, 895, 875, textureX, textureY); // Box 389
		bodyModel[252] = new ModelRendererTurbo(this, 1178, 781, textureX, textureY); // Box 390
		bodyModel[253] = new ModelRendererTurbo(this, 1228, 779, textureX, textureY); // Box 391
		bodyModel[254] = new ModelRendererTurbo(this, 1178, 836, textureX, textureY); // Box 392
		bodyModel[255] = new ModelRendererTurbo(this, 1053, 779, textureX, textureY); // Box 397
		bodyModel[256] = new ModelRendererTurbo(this, 878, 900, textureX, textureY); // Box 398
		bodyModel[257] = new ModelRendererTurbo(this, 890, 836, textureX, textureY); // Box 399
		bodyModel[258] = new ModelRendererTurbo(this, 844, 779, textureX, textureY); // Box 401
		bodyModel[259] = new ModelRendererTurbo(this, 925, 779, textureX, textureY); // Box 402
		bodyModel[260] = new ModelRendererTurbo(this, 844, 836, textureX, textureY); // Box 403
		bodyModel[261] = new ModelRendererTurbo(this, 847, 900, textureX, textureY); // Box 404
		bodyModel[262] = new ModelRendererTurbo(this, 847, 875, textureX, textureY); // Box 405
		bodyModel[263] = new ModelRendererTurbo(this, 825, 900, textureX, textureY); // Box 406
		bodyModel[264] = new ModelRendererTurbo(this, 825, 875, textureX, textureY); // Box 407
		bodyModel[265] = new ModelRendererTurbo(this, 704, 875, textureX, textureY); // Box 408
		bodyModel[266] = new ModelRendererTurbo(this, 764, 875, textureX, textureY); // Box 409
		bodyModel[267] = new ModelRendererTurbo(this, 791, 779, textureX, textureY); // Box 411
		bodyModel[268] = new ModelRendererTurbo(this, 764, 900, textureX, textureY); // Box 412
		bodyModel[269] = new ModelRendererTurbo(this, 742, 875, textureX, textureY); // Box 413
		bodyModel[270] = new ModelRendererTurbo(this, 742, 900, textureX, textureY); // Box 414
		bodyModel[271] = new ModelRendererTurbo(this, 923, 875, textureX, textureY); // Box 418
		bodyModel[272] = new ModelRendererTurbo(this, 345, 829, textureX, textureY); // Box 419
		bodyModel[273] = new ModelRendererTurbo(this, 300, 829, textureX, textureY); // Box 420
		bodyModel[274] = new ModelRendererTurbo(this, 322, 829, textureX, textureY); // Box 421
		bodyModel[275] = new ModelRendererTurbo(this, 949, 900, textureX, textureY); // Box 422
		bodyModel[276] = new ModelRendererTurbo(this, 895, 900, textureX, textureY); // Box 423
		bodyModel[277] = new ModelRendererTurbo(this, 923, 900, textureX, textureY); // Box 424
		bodyModel[278] = new ModelRendererTurbo(this, 1819, 789, textureX, textureY); // Box 844
		bodyModel[279] = new ModelRendererTurbo(this, 793, 1385, textureX, textureY); // Box 0
		bodyModel[280] = new ModelRendererTurbo(this, 793, 1347, textureX, textureY); // Box 1
		bodyModel[281] = new ModelRendererTurbo(this, 346, 1052, textureX, textureY); // Box 2
		bodyModel[282] = new ModelRendererTurbo(this, 346, 1093, textureX, textureY); // Box 3
		bodyModel[283] = new ModelRendererTurbo(this, 479, 1044, textureX, textureY); // Box 4
		bodyModel[284] = new ModelRendererTurbo(this, 479, 1130, textureX, textureY); // Box 5
		bodyModel[285] = new ModelRendererTurbo(this, 479, 1219, textureX, textureY); // Box 6
		bodyModel[286] = new ModelRendererTurbo(this, 479, 1296, textureX, textureY); // Box 7
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 458, 35, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[0].setRotationPoint(-286F, -93F, -30F);
		
		bodyModel[1].addShapeBox(0F, 0F, 0F, 458, 6, 60, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[1].setRotationPoint(-286F, -99F, -30F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 458, 4, 46, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[2].setRotationPoint(-286F, -103F, -23F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 458, 35, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 20
		bodyModel[3].setRotationPoint(-286F, -58F, -30F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 458, 6, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 20
		bodyModel[4].setRotationPoint(-286F, -23F, -28F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 458, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F); // Box 20
		bodyModel[5].setRotationPoint(-286F, -17F, -21F);
		
		bodyModel[6].addShapeBox(0F, 0F, 0F, 65, 15, 13, 0F, 0F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, -10F, 0F, 0F, -10F, 0F, -15F, -2F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, -15F, -10F); // Box 20
		bodyModel[6].setRotationPoint(-420F, -32F, -28F);
		
		bodyModel[7].addShapeBox(0F, 0F, 0F, 65, 15, 13, 0F, 0F, 0F, -10F, 0F, -9F, -10F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, -15F, -10F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, -15F, -2F); // Box 20
		bodyModel[7].setRotationPoint(-420F, -32F, 15F);
		
		bodyModel[8].addShapeBox(0F, 0F, 0F, 65, 18, 56, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -18F, -3F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, -18F, -3F); // Box 20
		bodyModel[8].setRotationPoint(-420F, -32F, -28F);
		
		bodyModel[9].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 20
		bodyModel[9].setRotationPoint(-390F, -35F, 15F);
		
		bodyModel[10].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 20
		bodyModel[10].setRotationPoint(-380F, -50F, 11F);
		
		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 5, 20, 0F, 0F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 20
		bodyModel[11].setRotationPoint(-447F, -84F, -20F);
		
		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 5, 14, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 20
		bodyModel[12].setRotationPoint(-447F, -84F, -7F);
		
		bodyModel[13].addShapeBox(0F, 0F, 0F, 26, 26, 27, 0F, 0F, -5F, -10F, -8F, -3F, -3F, -8F, -3F, -23F, -3F, 0F, -4F, 0F, 0F, -3F, -8F, 0F, -1F, -8F, 0F, -25F, 0F, 0F, -4F); // Box 20
		bodyModel[13].setRotationPoint(-447F, -84F, -30F);
		
		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 23, 8, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -6F); // Box 20
		bodyModel[14].setRotationPoint(-429F, -81F, -30F);
		
		bodyModel[15].addShapeBox(0F, 0F, 0F, 65, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-420F, -81F, -30F);
		
		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 35, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-288F, -93F, -30F);
		
		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 6, 60, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(-288F, -99F, -30F);
		
		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 46, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-288F, -103F, -23F);
		
		bodyModel[19].addShapeBox(0F, 0F, 0F, 69, 35, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 20
		bodyModel[19].setRotationPoint(-355F, -58F, -30F);
		
		bodyModel[20].addShapeBox(0F, 0F, 0F, 69, 6, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 20
		bodyModel[20].setRotationPoint(-355F, -23F, -28F);
		
		bodyModel[21].addShapeBox(0F, 0F, 0F, 65, 35, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 20
		bodyModel[21].setRotationPoint(-420F, -58F, -30F);
		
		bodyModel[22].addShapeBox(0F, 0F, 0F, 27, 26, 60, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -10F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -10F); // Box 20
		bodyModel[22].setRotationPoint(-447F, -58F, -30F);
		
		bodyModel[23].addShapeBox(0F, 0F, 0F, 65, 35, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -9F, -4F); // Box 20
		bodyModel[23].setRotationPoint(-420F, -58F, 25F);
		
		bodyModel[24].addShapeBox(0F, 0F, 0F, 69, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F); // Box 20
		bodyModel[24].setRotationPoint(-355F, -17F, -21F);
		
		bodyModel[25].addShapeBox(0F, 0F, 0F, 65, 18, 28, 0F, 0F, 0F, -2F, 0F, -14F, -7F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -18F, -2F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 20
		bodyModel[25].setRotationPoint(-420F, -32F, -28F);
		
		bodyModel[26].addShapeBox(0F, 0F, 0F, 65, 18, 28, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, -7F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, 0F, -18F, -2F); // Box 20
		bodyModel[26].setRotationPoint(-420F, -32F, 0F);
		
		bodyModel[27].addShapeBox(0F, 0F, 0F, 27, 18, 26, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -9F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 20
		bodyModel[27].setRotationPoint(-447F, -38F, -26F);
		
		bodyModel[28].addShapeBox(0F, 0F, 0F, 27, 18, 26, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, -9F, -26F); // Box 20
		bodyModel[28].setRotationPoint(-447F, -38F, 0F);
		
		bodyModel[29].addShapeBox(0F, 0F, 0F, 26, 26, 27, 0F, -3F, 0F, -4F, -8F, -3F, -23F, -8F, -3F, -3F, 0F, -5F, -10F, 0F, 0F, -4F, -8F, 0F, -25F, -8F, 0F, -1F, 0F, 0F, -3F); // Box 20
		bodyModel[29].setRotationPoint(-447F, -84F, 3F);
		
		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 23, 8, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 20
		bodyModel[30].setRotationPoint(-429F, -81F, 22F);
		
		bodyModel[31].addShapeBox(0F, 0F, 0F, 65, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[31].setRotationPoint(-420F, -81F, 29F);
		
		bodyModel[32].addBox(0F, 0F, 0F, 13, 2, 10, 0F); // Box 20
		bodyModel[32].setRotationPoint(-393F, -34F, -21F);
		
		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 24, 12, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[33].setRotationPoint(-381F, -56F, -22F);
		
		bodyModel[34].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[34].setRotationPoint(-393F, -38F, -22F);
		
		bodyModel[35].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[35].setRotationPoint(-393F, -38F, -11F);
		
		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[36].setRotationPoint(-383F, -56F, -22F);
		
		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[37].setRotationPoint(-383F, -56F, -11F);
		
		bodyModel[38].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 20
		bodyModel[38].setRotationPoint(-392F, -35F, -21F);
		
		bodyModel[39].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 20
		bodyModel[39].setRotationPoint(-392F, -35F, -15F);
		
		bodyModel[40].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 20
		bodyModel[40].setRotationPoint(-390F, -35F, -17F);
		
		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 20
		bodyModel[41].setRotationPoint(-392F, -36F, -16.5F);
		
		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[42].setRotationPoint(-392F, -37F, -17.5F);
		
		bodyModel[43].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 20
		bodyModel[43].setRotationPoint(-387F, -35.5F, -14.5F);
		
		bodyModel[44].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 20
		bodyModel[44].setRotationPoint(-387F, -35.5F, -21.5F);
		
		bodyModel[45].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 20
		bodyModel[45].setRotationPoint(-387F, -35.5F, -17.5F);
		
		bodyModel[46].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 20
		bodyModel[46].setRotationPoint(-387F, -35.5F, -15.5F);
		
		bodyModel[47].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 20
		bodyModel[47].setRotationPoint(-381F, -40F, -21F);
		
		bodyModel[48].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 20
		bodyModel[48].setRotationPoint(-380.5F, -45F, -21F);
		
		bodyModel[49].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 20
		bodyModel[49].setRotationPoint(-380F, -56F, -18F);
		
		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 20
		bodyModel[50].setRotationPoint(-379F, -55F, -18F);
		
		bodyModel[51].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 20
		bodyModel[51].setRotationPoint(-380F, -53F, -21F);
		
		bodyModel[52].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 20
		bodyModel[52].setRotationPoint(-380F, -50F, -21F);
		
		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 20
		bodyModel[53].setRotationPoint(-381F, -53F, -21F);
		
		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[54].setRotationPoint(-380.5F, -51F, -20F);
		
		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[55].setRotationPoint(-380.5F, -51F, -14F);
		
		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[56].setRotationPoint(-380.5F, -47F, -14F);
		
		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[57].setRotationPoint(-380.5F, -47F, -20F);
		
		bodyModel[58].addBox(0F, 0F, 0F, 13, 2, 10, 0F); // Box 20
		bodyModel[58].setRotationPoint(-393F, -34F, 11F);
		
		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 24, 12, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[59].setRotationPoint(-381F, -56F, 10F);
		
		bodyModel[60].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[60].setRotationPoint(-393F, -38F, 21F);
		
		bodyModel[61].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[61].setRotationPoint(-393F, -38F, 10F);
		
		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[62].setRotationPoint(-383F, -56F, 21F);
		
		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[63].setRotationPoint(-383F, -56F, 10F);
		
		bodyModel[64].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 20
		bodyModel[64].setRotationPoint(-392F, -35F, 17F);
		
		bodyModel[65].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 20
		bodyModel[65].setRotationPoint(-392F, -35F, 11F);
		
		bodyModel[66].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 20
		bodyModel[66].setRotationPoint(-392F, -36F, 15.5F);
		
		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[67].setRotationPoint(-392F, -37F, 14.5F);
		
		bodyModel[68].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 20
		bodyModel[68].setRotationPoint(-387F, -35.5F, 10.5F);
		
		bodyModel[69].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 20
		bodyModel[69].setRotationPoint(-387F, -35.5F, 17.5F);
		
		bodyModel[70].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 20
		bodyModel[70].setRotationPoint(-387F, -35.5F, 16.5F);
		
		bodyModel[71].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 20
		bodyModel[71].setRotationPoint(-387F, -35.5F, 14.5F);
		
		bodyModel[72].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 20
		bodyModel[72].setRotationPoint(-381F, -40F, 11F);
		
		bodyModel[73].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 20
		bodyModel[73].setRotationPoint(-380.5F, -45F, 11F);
		
		bodyModel[74].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 20
		bodyModel[74].setRotationPoint(-380F, -56F, 14F);
		
		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 20
		bodyModel[75].setRotationPoint(-379F, -55F, 14F);
		
		bodyModel[76].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 20
		bodyModel[76].setRotationPoint(-380F, -53F, 11F);
		
		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 20
		bodyModel[77].setRotationPoint(-381F, -53F, 11F);
		
		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[78].setRotationPoint(-380.5F, -51F, 18F);
		
		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[79].setRotationPoint(-380.5F, -51F, 12F);
		
		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[80].setRotationPoint(-380.5F, -47F, 12F);
		
		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[81].setRotationPoint(-380.5F, -47F, 18F);
		
		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 5, 20, 0F, 0F, -1F, 0F, 0F, 0F, -7F, -3F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[82].setRotationPoint(-447F, -84F, 0F);
		
		bodyModel[83].addShapeBox(0F, 0F, 0F, 26, 13, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 106
		bodyModel[83].setRotationPoint(-420F, -45F, -27F);
		
		bodyModel[84].addShapeBox(0F, 0F, 0F, 65, 1, 29, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[84].setRotationPoint(-420F, -58F, -29F);
		
		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 108
		bodyModel[85].setRotationPoint(-406F, -90F, -15F);
		
		bodyModel[86].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 109
		bodyModel[86].setRotationPoint(-407F, -91F, -15F);
		
		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[87].setRotationPoint(-410F, -91F, -19F);
		
		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 24, 12, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[88].setRotationPoint(-408F, -91F, -19F);
		
		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[89].setRotationPoint(-410F, -91F, -8F);
		
		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[90].setRotationPoint(-407.5F, -86F, -11F);
		
		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[91].setRotationPoint(-407.5F, -82F, -11F);
		
		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[92].setRotationPoint(-407.5F, -86F, -17F);
		
		bodyModel[93].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 116
		bodyModel[93].setRotationPoint(-407.5F, -80F, -18F);
		
		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[94].setRotationPoint(-407.5F, -82F, -17F);
		
		bodyModel[95].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 118
		bodyModel[95].setRotationPoint(-407F, -85F, -18F);
		
		bodyModel[96].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 119
		bodyModel[96].setRotationPoint(-408F, -75F, -18F);
		
		bodyModel[97].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 120
		bodyModel[97].setRotationPoint(-419F, -70F, -12F);
		
		bodyModel[98].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 121
		bodyModel[98].setRotationPoint(-419F, -70F, -18F);
		
		bodyModel[99].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 122
		bodyModel[99].setRotationPoint(-417F, -70F, -14F);
		
		bodyModel[100].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 123
		bodyModel[100].setRotationPoint(-414F, -70.5F, -11.5F);
		
		bodyModel[101].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 124
		bodyModel[101].setRotationPoint(-414F, -70.5F, -12.5F);
		
		bodyModel[102].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 125
		bodyModel[102].setRotationPoint(-414F, -70.5F, -14.5F);
		
		bodyModel[103].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 126
		bodyModel[103].setRotationPoint(-414F, -70.5F, -18.5F);
		
		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 127
		bodyModel[104].setRotationPoint(-419F, -72F, -14.5F);
		
		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128
		bodyModel[105].setRotationPoint(-419F, -71F, -13.5F);
		
		bodyModel[106].addBox(0F, 0F, 0F, 15, 11, 12, 0F); // Box 129
		bodyModel[106].setRotationPoint(-420F, -69F, -19F);
		
		bodyModel[107].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[107].setRotationPoint(-420F, -73F, -19F);
		
		bodyModel[108].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[108].setRotationPoint(-420F, -73F, -8F);
		
		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 132
		bodyModel[109].setRotationPoint(-408F, -88F, -18F);
		
		bodyModel[110].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 133
		bodyModel[110].setRotationPoint(-407F, -88F, -18F);
		
		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 134
		bodyModel[111].setRotationPoint(-406F, -90F, 11F);
		
		bodyModel[112].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 135
		bodyModel[112].setRotationPoint(-407F, -91F, 11F);
		
		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[113].setRotationPoint(-410F, -91F, 18F);
		
		bodyModel[114].addShapeBox(0F, 0F, 0F, 6, 24, 12, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[114].setRotationPoint(-408F, -91F, 7F);
		
		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[115].setRotationPoint(-410F, -91F, 7F);
		
		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[116].setRotationPoint(-407.5F, -86F, 9F);
		
		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[117].setRotationPoint(-407.5F, -82F, 9F);
		
		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[118].setRotationPoint(-407.5F, -86F, 15F);
		
		bodyModel[119].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 142
		bodyModel[119].setRotationPoint(-407.5F, -80F, 8F);
		
		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[120].setRotationPoint(-407.5F, -82F, 15F);
		
		bodyModel[121].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 144
		bodyModel[121].setRotationPoint(-407F, -85F, 8F);
		
		bodyModel[122].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 145
		bodyModel[122].setRotationPoint(-408F, -75F, 8F);
		
		bodyModel[123].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 146
		bodyModel[123].setRotationPoint(-419F, -70F, 8F);
		
		bodyModel[124].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 147
		bodyModel[124].setRotationPoint(-419F, -70F, 14F);
		
		bodyModel[125].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 148
		bodyModel[125].setRotationPoint(-417F, -70F, 12F);
		
		bodyModel[126].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 149
		bodyModel[126].setRotationPoint(-414F, -70.5F, 7.5F);
		
		bodyModel[127].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 150
		bodyModel[127].setRotationPoint(-414F, -70.5F, 11.5F);
		
		bodyModel[128].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 151
		bodyModel[128].setRotationPoint(-414F, -70.5F, 13.5F);
		
		bodyModel[129].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 152
		bodyModel[129].setRotationPoint(-414F, -70.5F, 14.5F);
		
		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 153
		bodyModel[130].setRotationPoint(-419F, -72F, 11.5F);
		
		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 154
		bodyModel[131].setRotationPoint(-419F, -71F, 12.5F);
		
		bodyModel[132].addBox(0F, 0F, 0F, 15, 11, 12, 0F); // Box 155
		bodyModel[132].setRotationPoint(-420F, -69F, 7F);
		
		bodyModel[133].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[133].setRotationPoint(-420F, -73F, 18F);
		
		bodyModel[134].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[134].setRotationPoint(-420F, -73F, 7F);
		
		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 158
		bodyModel[135].setRotationPoint(-408F, -88F, 8F);
		
		bodyModel[136].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 159
		bodyModel[136].setRotationPoint(-407F, -88F, 8F);
		
		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 238
		bodyModel[137].setRotationPoint(-316F, -81F, 7F);
		
		bodyModel[138].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 239
		bodyModel[138].setRotationPoint(-316F, -82F, 7F);
		
		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 240
		bodyModel[139].setRotationPoint(-316F, -82F, 3F);
		
		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 24, 12, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 241
		bodyModel[140].setRotationPoint(-319F, -82F, 3F);
		
		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 242
		bodyModel[141].setRotationPoint(-316F, -82F, 14F);
		
		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[142].setRotationPoint(-314.5F, -77F, 11F);
		
		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[143].setRotationPoint(-314.5F, -73F, 11F);
		
		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[144].setRotationPoint(-314.5F, -77F, 5F);
		
		bodyModel[145].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 246
		bodyModel[145].setRotationPoint(-315.5F, -71F, 4F);
		
		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[146].setRotationPoint(-314.5F, -73F, 5F);
		
		bodyModel[147].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 248
		bodyModel[147].setRotationPoint(-315F, -76F, 4F);
		
		bodyModel[148].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 249
		bodyModel[148].setRotationPoint(-315F, -66F, 4F);
		
		bodyModel[149].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 250
		bodyModel[149].setRotationPoint(-314F, -61F, 10F);
		
		bodyModel[150].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 251
		bodyModel[150].setRotationPoint(-314F, -61F, 4F);
		
		bodyModel[151].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 252
		bodyModel[151].setRotationPoint(-314F, -61F, 8F);
		
		bodyModel[152].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 253
		bodyModel[152].setRotationPoint(-309F, -61.5F, 10.5F);
		
		bodyModel[153].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 254
		bodyModel[153].setRotationPoint(-309F, -61.5F, 9.5F);
		
		bodyModel[154].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 255
		bodyModel[154].setRotationPoint(-309F, -61.5F, 7.5F);
		
		bodyModel[155].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 256
		bodyModel[155].setRotationPoint(-309F, -61.5F, 3.5F);
		
		bodyModel[156].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 257
		bodyModel[156].setRotationPoint(-303F, -63F, 7.5F);
		
		bodyModel[157].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 258
		bodyModel[157].setRotationPoint(-303F, -62F, 8.5F);
		
		bodyModel[158].addBox(0F, 0F, 0F, 13, 2, 10, 0F); // Box 259
		bodyModel[158].setRotationPoint(-314F, -60F, 4F);
		
		bodyModel[159].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[159].setRotationPoint(-315F, -64F, 3F);
		
		bodyModel[160].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[160].setRotationPoint(-315F, -64F, 14F);
		
		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 262
		bodyModel[161].setRotationPoint(-314F, -79F, 4F);
		
		bodyModel[162].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 263
		bodyModel[162].setRotationPoint(-316F, -79F, 4F);
		
		bodyModel[163].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 264
		bodyModel[163].setRotationPoint(-316F, -81F, -11F);
		
		bodyModel[164].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 265
		bodyModel[164].setRotationPoint(-316F, -82F, -11F);
		
		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 266
		bodyModel[165].setRotationPoint(-316F, -82F, -4F);
		
		bodyModel[166].addShapeBox(0F, 0F, 0F, 6, 24, 12, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 267
		bodyModel[166].setRotationPoint(-319F, -82F, -15F);
		
		bodyModel[167].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 268
		bodyModel[167].setRotationPoint(-316F, -82F, -15F);
		
		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[168].setRotationPoint(-314.5F, -77F, -13F);
		
		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[169].setRotationPoint(-314.5F, -73F, -13F);
		
		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[170].setRotationPoint(-314.5F, -77F, -7F);
		
		bodyModel[171].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 272
		bodyModel[171].setRotationPoint(-315.5F, -71F, -14F);
		
		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[172].setRotationPoint(-314.5F, -73F, -7F);
		
		bodyModel[173].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 274
		bodyModel[173].setRotationPoint(-315F, -76F, -14F);
		
		bodyModel[174].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 275
		bodyModel[174].setRotationPoint(-315F, -66F, -14F);
		
		bodyModel[175].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 276
		bodyModel[175].setRotationPoint(-314F, -61F, -14F);
		
		bodyModel[176].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 277
		bodyModel[176].setRotationPoint(-314F, -61F, -8F);
		
		bodyModel[177].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 278
		bodyModel[177].setRotationPoint(-314F, -61F, -10F);
		
		bodyModel[178].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 279
		bodyModel[178].setRotationPoint(-309F, -61.5F, -14.5F);
		
		bodyModel[179].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 280
		bodyModel[179].setRotationPoint(-309F, -61.5F, -10.5F);
		
		bodyModel[180].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 281
		bodyModel[180].setRotationPoint(-309F, -61.5F, -8.5F);
		
		bodyModel[181].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 282
		bodyModel[181].setRotationPoint(-309F, -61.5F, -7.5F);
		
		bodyModel[182].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 283
		bodyModel[182].setRotationPoint(-303F, -63F, -10.5F);
		
		bodyModel[183].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 284
		bodyModel[183].setRotationPoint(-303F, -62F, -9.5F);
		
		bodyModel[184].addBox(0F, 0F, 0F, 13, 2, 10, 0F); // Box 285
		bodyModel[184].setRotationPoint(-314F, -60F, -14F);
		
		bodyModel[185].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[185].setRotationPoint(-315F, -64F, -4F);
		
		bodyModel[186].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[186].setRotationPoint(-315F, -64F, -15F);
		
		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 288
		bodyModel[187].setRotationPoint(-314F, -79F, -14F);
		
		bodyModel[188].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 289
		bodyModel[188].setRotationPoint(-316F, -79F, -14F);
		
		bodyModel[189].addShapeBox(0F, 0F, 0F, 46, 1, 29, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[189].setRotationPoint(-420F, -58F, 0F);
		
		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 35, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[190].setRotationPoint(-376F, -93F, -29F);
		
		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 6, 60, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[191].setRotationPoint(-376F, -99F, -30F);
		
		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 4, 46, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[192].setRotationPoint(-376F, -103F, -23F);
		
		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 6, 60, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[193].setRotationPoint(-347F, -99F, -30F);
		
		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 4, 46, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[194].setRotationPoint(-347F, -103F, -23F);
		
		bodyModel[195].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[195].setRotationPoint(-374F, -58F, 0F);
		
		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[196].setRotationPoint(-374F, -58F, 9F);
		
		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[197].setRotationPoint(-356F, -58F, 9F);
		
		bodyModel[198].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[198].setRotationPoint(-373F, -34F, 9F);
		
		bodyModel[199].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[199].setRotationPoint(-373F, -39F, 9F);
		
		bodyModel[200].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[200].setRotationPoint(-373F, -44F, 9F);
		
		bodyModel[201].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[201].setRotationPoint(-373F, -49F, 9F);
		
		bodyModel[202].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[202].setRotationPoint(-373F, -54F, 9F);
		
		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[203].setRotationPoint(-376F, -93F, -7F);
		
		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 35, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[204].setRotationPoint(-376F, -93F, 7F);
		
		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 35, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[205].setRotationPoint(-347F, -93F, -29F);
		
		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[206].setRotationPoint(-347F, -93F, -7F);
		
		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 35, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[207].setRotationPoint(-347F, -93F, 7F);
		
		bodyModel[208].addShapeBox(0F, 0F, 0F, 27, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[208].setRotationPoint(-374F, -63F, -29F);
		
		bodyModel[209].addShapeBox(0F, 0F, 0F, 27, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[209].setRotationPoint(-374F, -81F, -29F);
		
		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[210].setRotationPoint(-374F, -81F, -17F);
		
		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[211].setRotationPoint(-348F, -81F, -17F);
		
		bodyModel[212].addShapeBox(0F, 0F, 0F, 16, 1, 58, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[212].setRotationPoint(-304F, -68F, -29F);
		
		bodyModel[213].addShapeBox(0F, 0F, 0F, 41, 35, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[213].setRotationPoint(-355F, -93F, -30F);
		
		bodyModel[214].addShapeBox(0F, 0F, 0F, 11, 35, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[214].setRotationPoint(-299F, -93F, -30F);
		
		bodyModel[215].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[215].setRotationPoint(-314F, -93F, -30F);
		
		bodyModel[216].addShapeBox(0F, 0F, 0F, 15, 25, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[216].setRotationPoint(-314F, -83F, -30F);
		
		bodyModel[217].addShapeBox(0F, 0F, 0F, 41, 35, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[217].setRotationPoint(-355F, -93F, 29F);
		
		bodyModel[218].addShapeBox(0F, 0F, 0F, 11, 35, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[218].setRotationPoint(-299F, -93F, 29F);
		
		bodyModel[219].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[219].setRotationPoint(-314F, -93F, 29F);
		
		bodyModel[220].addShapeBox(0F, 0F, 0F, 15, 25, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[220].setRotationPoint(-314F, -83F, 29F);
		
		bodyModel[221].addShapeBox(0F, 0F, 0F, 31, 6, 60, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[221].setRotationPoint(-345F, -99F, -30F);
		
		bodyModel[222].addShapeBox(0F, 0F, 0F, 57, 4, 46, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[222].setRotationPoint(-345F, -103F, -23F);
		
		bodyModel[223].addShapeBox(0F, 0F, 0F, 27, 6, 60, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[223].setRotationPoint(-374F, -99F, -30F);
		
		bodyModel[224].addShapeBox(0F, 0F, 0F, 27, 4, 46, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[224].setRotationPoint(-374F, -103F, -23F);
		
		bodyModel[225].addShapeBox(0F, 0F, 0F, 21, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[225].setRotationPoint(-376F, -93F, -30F);
		
		bodyModel[226].addShapeBox(0F, 0F, 0F, 21, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[226].setRotationPoint(-376F, -93F, 29F);
		
		bodyModel[227].addShapeBox(0F, 0F, 0F, 8, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[227].setRotationPoint(-429F, -69F, -15F);
		
		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 15, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[228].setRotationPoint(-419F, -81F, -16F);
		bodyModel[228].rotateAngleZ = -0.55850536F;
		
		bodyModel[229].addShapeBox(0F, 0F, 0F, 8, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[229].setRotationPoint(-429F, -69F, 8F);
		
		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 15, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[230].setRotationPoint(-419F, -81F, 7F);
		bodyModel[230].rotateAngleZ = -0.55850536F;
		
		bodyModel[231].addShapeBox(0F, 0F, 0F, 8, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[231].setRotationPoint(-440F, -69F, 8F);
		
		bodyModel[232].addShapeBox(0F, 0F, 0F, 8, 6, 14, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[232].setRotationPoint(-429F, -77F, -7F);
		
		bodyModel[233].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[233].setRotationPoint(-427F, -76F, -6F);
		bodyModel[233].rotateAngleZ = 0.6981317F;
		
		bodyModel[234].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[234].setRotationPoint(-427F, -76F, -4F);
		bodyModel[234].rotateAngleZ = 0.6981317F;
		
		bodyModel[235].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[235].setRotationPoint(-427F, -76F, -2F);
		bodyModel[235].rotateAngleZ = 0.6981317F;
		
		bodyModel[236].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[236].setRotationPoint(-427F, -76F, 0F);
		bodyModel[236].rotateAngleZ = 0.6981317F;
		
		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[237].setRotationPoint(-427F, -76F, 2F);
		bodyModel[237].rotateAngleZ = 0.6981317F;
		
		bodyModel[238].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[238].setRotationPoint(-427F, -76F, 4F);
		bodyModel[238].rotateAngleZ = 0.6981317F;
		
		bodyModel[239].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[239].setRotationPoint(-424F, -75F, 4F);
		bodyModel[239].rotateAngleZ = 0.6981317F;
		
		bodyModel[240].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[240].setRotationPoint(-424F, -75F, 2F);
		bodyModel[240].rotateAngleZ = 0.6981317F;
		
		bodyModel[241].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[241].setRotationPoint(-424F, -75F, 0F);
		bodyModel[241].rotateAngleZ = 0.6981317F;
		
		bodyModel[242].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[242].setRotationPoint(-424F, -75F, -2F);
		bodyModel[242].rotateAngleZ = 0.6981317F;
		
		bodyModel[243].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[243].setRotationPoint(-424F, -75F, -4F);
		bodyModel[243].rotateAngleZ = 0.6981317F;
		
		bodyModel[244].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[244].setRotationPoint(-424F, -75F, -6F);
		bodyModel[244].rotateAngleZ = 0.6981317F;
		
		bodyModel[245].addShapeBox(0F, 0F, 0F, 21, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[245].setRotationPoint(-397F, -93F, -30F);
		
		bodyModel[246].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[246].setRotationPoint(-404F, -85F, -30F);
		
		bodyModel[247].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99999F, 0F); // Box 378
		bodyModel[247].setRotationPoint(-404F, -93F, -30F);
		
		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[248].setRotationPoint(-406F, -93F, -30F);
		
		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 380
		bodyModel[249].setRotationPoint(-420F, -93F, -30F);
		
		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 6, 15, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F); // Box 386
		bodyModel[250].setRotationPoint(-420F, -99F, -27F);
		
		bodyModel[251].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 389
		bodyModel[251].setRotationPoint(-420F, -93F, -30F);
		
		bodyModel[252].addShapeBox(0F, 0F, 0F, 30, 6, 15, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F); // Box 390
		bodyModel[252].setRotationPoint(-406F, -99F, -30F);
		
		bodyModel[253].addShapeBox(0F, 0F, 0F, 30, 4, 46, 0F, 0F, 0F, -20F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[253].setRotationPoint(-406F, -103F, -23F);
		
		bodyModel[254].addShapeBox(0F, 0F, 0F, 30, 6, 15, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[254].setRotationPoint(-406F, -99F, 15F);
		
		bodyModel[255].addShapeBox(0F, 0F, 0F, 14, 4, 46, 0F, 0F, -1F, -18F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -1F, -18F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 397
		bodyModel[255].setRotationPoint(-420F, -103F, -23F);
		
		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[256].setRotationPoint(-420F, -93F, 26F);
		
		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 6, 15, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[257].setRotationPoint(-420F, -99F, 12F);
		
		bodyModel[258].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F, 0F, 0F, -11F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -7F); // Box 401
		bodyModel[258].setRotationPoint(-427F, -99F, -27F);
		
		bodyModel[259].addShapeBox(0F, 0F, 0F, 7, 8, 54, 0F, 0F, 0F, -20F, 0F, 2F, -22F, 0F, 2F, -22F, 0F, 0F, -20F, 0F, -7F, -11F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, -7F, -11F); // Box 402
		bodyModel[259].setRotationPoint(-427F, -100F, -27F);
		
		bodyModel[260].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -11F, 0F, 0F, -7F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 403
		bodyModel[260].setRotationPoint(-427F, -99F, 15F);
		
		bodyModel[261].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 404
		bodyModel[261].setRotationPoint(-427F, -93F, 22F);
		
		bodyModel[262].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 405
		bodyModel[262].setRotationPoint(-427F, -93F, -27F);
		
		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[263].setRotationPoint(-429F, -93F, 22F);
		
		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F); // Box 407
		bodyModel[264].setRotationPoint(-429F, -93F, -27F);
		
		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[265].setRotationPoint(-437F, -93F, -7F);
		
		bodyModel[266].addShapeBox(0F, 0F, 0F, 11, 1, 16, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[266].setRotationPoint(-437F, -93F, -23F);
		
		bodyModel[267].addShapeBox(0F, 0F, 0F, 10, 8, 14, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[267].setRotationPoint(-437F, -100F, -7F);
		
		bodyModel[268].addShapeBox(0F, 0F, 0F, 11, 1, 16, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 412
		bodyModel[268].setRotationPoint(-437F, -93F, 7F);
		
		bodyModel[269].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[269].setRotationPoint(-444F, -93F, -7F);
		
		bodyModel[270].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[270].setRotationPoint(-444F, -93F, 6F);
		
		bodyModel[271].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[271].setRotationPoint(-413F, -93F, -30F);
		
		bodyModel[272].addShapeBox(0F, 0F, 0F, 21, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[272].setRotationPoint(-397F, -93F, 29F);
		
		bodyModel[273].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[273].setRotationPoint(-404F, -85F, 29F);
		
		bodyModel[274].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 421
		bodyModel[274].setRotationPoint(-404F, -93F, 29F);
		
		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[275].setRotationPoint(-406F, -93F, 29F);
		
		bodyModel[276].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 423
		bodyModel[276].setRotationPoint(-420F, -93F, 26F);
		
		bodyModel[277].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[277].setRotationPoint(-413F, -93F, 29F);
		
		bodyModel[278].addShapeBox(0F, 0F, 0F, 11, 6, 60, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		bodyModel[278].setRotationPoint(-299F, -99F, -30F);
		
		bodyModel[279].addShapeBox(0F, 0F, 0F, 23, 15, 14, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 0
		bodyModel[279].setRotationPoint(-429F, -73F, -30F);
		
		bodyModel[280].addShapeBox(0F, 0F, 0F, 23, 15, 14, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 1
		bodyModel[280].setRotationPoint(-429F, -73F, 16F);
		
		bodyModel[281].addShapeBox(0F, 0F, 0F, 8, 13, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[281].setRotationPoint(-429F, -71F, -7F);
		
		bodyModel[282].addShapeBox(0F, 0F, 0F, 16, 13, 14, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[282].setRotationPoint(-421F, -71F, -7F);
		
		bodyModel[283].addShapeBox(0F, 0F, 0F, 15, 26, 52, 0F, 0F, 0F, -19F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F); // Box 4
		bodyModel[283].setRotationPoint(-444F, -84F, -26F);
		
		bodyModel[284].addShapeBox(0F, 0F, 0F, 15, 25, 58, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[284].setRotationPoint(-296F, -93F, -29F);
		
		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 12, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[285].setRotationPoint(-406F, -57F, -27F);
		
		bodyModel[286].addShapeBox(0F, 0F, 0F, 14, 12, 58, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 7
		bodyModel[286].setRotationPoint(-420F, -57F, -29F);
	}
	
	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 20
		noseModel[1] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 20
		noseModel[2] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 20
		noseModel[3] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 20
		noseModel[4] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		noseModel[5] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		noseModel[6] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		noseModel[7] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		noseModel[8] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		noseModel[9] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		noseModel[10] = new ModelRendererTurbo(this, 0, 185, textureX, textureY); // Box 20
		
		noseModel[0].addShapeBox(0F, 0F, 0F, 16, 16, 17, 0F, 0F, -13F, -13F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		noseModel[0].setRotationPoint(-485F, -74F, -17F);
		
		noseModel[1].addShapeBox(0F, 0F, 0F, 22, 25, 27, 0F, 0F, -13F, -15F, 0F, -4F, -7F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		noseModel[1].setRotationPoint(-469F, -83F, -27F);
		
		noseModel[2].addShapeBox(0F, 0F, 0F, 16, 16, 17, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -13F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 20
		noseModel[2].setRotationPoint(-485F, -74F, 0F);
		
		noseModel[3].addShapeBox(0F, 0F, 0F, 22, 25, 27, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -4F, -7F, 0F, -13F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 20
		noseModel[3].setRotationPoint(-469F, -83F, 0F);
		
		noseModel[4].addShapeBox(0F, 0F, 0F, 22, 20, 54, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -7F, -15F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -7F, -15F); // Box 20
		noseModel[4].setRotationPoint(-469F, -58F, -27F);
		
		noseModel[5].addShapeBox(0F, 0F, 0F, 16, 13, 17, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -13F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -10F, 0F); // Box 20
		noseModel[5].setRotationPoint(-485F, -58F, -17F);
		
		noseModel[6].addShapeBox(0F, 0F, 0F, 16, 13, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10F, -13F); // Box 20
		noseModel[6].setRotationPoint(-485F, -58F, 0F);
		
		noseModel[7].addShapeBox(0F, 0F, 0F, 22, 16, 27, 0F, 0F, 0F, -15F, 0F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -10F, -27F, 0F, 0F, -27F, 0F, 0F, 0F, 0F, -10F, 0F); // Box 20
		noseModel[7].setRotationPoint(-469F, -45F, -27F);
		
		noseModel[8].addShapeBox(0F, 0F, 0F, 16, 16, 17, 0F, 0F, 0F, -13F, 0F, -10F, -5F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -16F, -13F, 0F, -6F, -5F, 0F, 0F, 0F, 0F, -15F, 0F); // Box 20
		noseModel[8].setRotationPoint(-485F, -55F, -17F);
		
		noseModel[9].addShapeBox(0F, 0F, 0F, 22, 16, 27, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -7F, 0F, 0F, -15F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -10F, -27F); // Box 20
		noseModel[9].setRotationPoint(-469F, -45F, 0F);
		
		noseModel[10].addShapeBox(0F, 0F, 0F, 16, 16, 17, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, -5F, 0F, 0F, -13F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, -16F, -13F); // Box 20
		noseModel[10].setRotationPoint(-485F, -55F, 0F);
	}
	
	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1104, 146, textureX, textureY); // Box 33
		tailModel[1] = new ModelRendererTurbo(this, 1104, 73, textureX, textureY); // Box 34
		tailModel[2] = new ModelRendererTurbo(this, 1104, 0, textureX, textureY); // Box 35
		tailModel[3] = new ModelRendererTurbo(this, 1104, 246, textureX, textureY); // Box 36
		tailModel[4] = new ModelRendererTurbo(this, 1104, 346, textureX, textureY); // Box 37
		tailModel[5] = new ModelRendererTurbo(this, 1104, 346, textureX, textureY); // Box 38
		tailModel[6] = new ModelRendererTurbo(this, 136, 278, textureX, textureY); // Box 34
		tailModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		tailModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		
		tailModel[0].addShapeBox(0F, 0F, 0F, 290, 35, 60, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F); // Box 33
		tailModel[0].setRotationPoint(172F, -93F, -30F);
		
		tailModel[1].addShapeBox(0F, 0F, 0F, 290, 6, 60, 0F, 0F, 0F, -7F, 0F, -4F, -21F, 0F, -4F, -21F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F); // Box 34
		tailModel[1].setRotationPoint(172F, -99F, -30F);
		
		tailModel[2].addShapeBox(0F, 0F, 0F, 290, 8, 60, 0F, 0F, 0F, -30F, 0F, -6F, -30F, 0F, -6F, -30F, 0F, 0F, -30F, 0F, -4F, -7F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -4F, -7F); // Box 35
		tailModel[2].setRotationPoint(172F, -103F, -30F);
		
		tailModel[3].addShapeBox(0F, 0F, 0F, 290, 35, 60, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -35F, -21F, 0F, -35F, -21F, 0F, 0F, -2F); // Box 36
		tailModel[3].setRotationPoint(172F, -58F, -30F);
		
		tailModel[4].addShapeBox(0F, 0F, 0F, 290, 41, 56, 0F, 0F, -35F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, -35F, 0F, 0F, 0F, -7F, 0F, -39F, -22F, 0F, -39F, -22F, 0F, 0F, -7F); // Box 37
		tailModel[4].setRotationPoint(172F, -58F, -28F);
		
		tailModel[5].addShapeBox(0F, 0F, 0F, 290, 44, 42, 0F, 0F, -41F, 0F, 0F, -2F, -15F, 0F, -2F, -15F, 0F, -41F, 0F, 0F, 0F, -21F, 0F, -41F, -21F, 0F, -41F, -21F, 0F, 0F, -21F); // Box 38
		tailModel[5].setRotationPoint(172F, -58F, -21F);
		
		tailModel[6].addShapeBox(0F, 0F, 0F, 146, 158, 8, 0F, -111F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -111F, 0F, -2F, 0F, 0F, -2F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, 0F, -2F); // Box 34
		tailModel[6].setRotationPoint(254F, -255F, -4F);
		
		tailModel[7].addShapeBox(0F, 0F, 0F, 112, 8, 161, 0F, -112F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -112F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 36
		tailModel[7].setRotationPoint(278F, -80F, -174F);
		
		tailModel[8].addShapeBox(0F, 0F, 0F, 112, 8, 161, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -112F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -112F, 0F, 0F); // Box 38
		tailModel[8].setRotationPoint(278F, -80F, 13F);
	}
	
	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		leftWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		leftWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		leftWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 46
		leftWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		leftWingModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		leftWingModel[6] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Box 54
		leftWingModel[7] = new ModelRendererTurbo(this, 0, 1254, textureX, textureY); // Box 56
		leftWingModel[8] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 58
		leftWingModel[9] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Box 0
		leftWingModel[10] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 4
		leftWingModel[11] = new ModelRendererTurbo(this, 0, 1254, textureX, textureY); // Box 5
		leftWingModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		leftWingModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		leftWingModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		leftWingModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		leftWingModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		leftWingModel[17] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Box 19
		leftWingModel[18] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 20
		leftWingModel[19] = new ModelRendererTurbo(this, 0, 1254, textureX, textureY); // Box 21
		leftWingModel[20] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 22
		leftWingModel[21] = new ModelRendererTurbo(this, 0, 1254, textureX, textureY); // Box 23
		leftWingModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		leftWingModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		leftWingModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		leftWingModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		leftWingModel[26] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Box 34
		leftWingModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 945
		leftWingModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 946
		leftWingModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 947
		leftWingModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 948
		leftWingModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 949
		leftWingModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 950
		leftWingModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 951
		leftWingModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 952
		leftWingModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 953
		leftWingModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 954
		leftWingModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 955
		leftWingModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 956
		leftWingModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 957
		leftWingModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 958
		leftWingModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 959
		leftWingModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 960
		leftWingModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 961
		leftWingModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 962
		leftWingModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 963
		leftWingModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 964
		leftWingModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 965
		leftWingModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 966
		leftWingModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 967
		leftWingModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 968
		leftWingModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box434
		leftWingModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box435
		leftWingModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box436
		leftWingModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 996
		leftWingModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 997
		leftWingModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 998
		leftWingModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 999
		leftWingModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1000
		leftWingModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1001
		leftWingModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1002
		leftWingModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1003
		leftWingModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1004
		leftWingModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1017
		leftWingModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1018
		leftWingModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		leftWingModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		leftWingModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		leftWingModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		leftWingModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		leftWingModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		leftWingModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		leftWingModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		leftWingModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		leftWingModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		leftWingModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		leftWingModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		leftWingModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		leftWingModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		leftWingModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		leftWingModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		leftWingModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		leftWingModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		leftWingModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		leftWingModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		leftWingModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		
		leftWingModel[0].addShapeBox(0F, 0F, 0F, 188, 21, 103, 0F, -134F, -6F, 0F, 0F, -5F, 0F, -60F, 0F, 0F, -64F, -1F, 0F, -129F, -8F, 0F, 0F, 0F, 0F, -60F, -4F, 0F, -57F, -15F, 0F); // Box 40
		leftWingModel[0].setRotationPoint(-354F, -100F, -118F);
		
		leftWingModel[1].addShapeBox(0F, 0F, 0F, 127, 21, 103, 0F, -60F, -5F, 0F, 0F, -5F, 0F, -51F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F, -51F, -5F, 0F, 0F, -4F, 0F); // Box 41
		leftWingModel[1].setRotationPoint(-226F, -100F, -118F);
		
		leftWingModel[2].addShapeBox(0F, 0F, 0F, 109, 21, 103, 0F, -60F, -5F, 0F, 0F, -13F, 0F, -43F, -8F, 0F, -9F, 0F, 0F, -60F, 0F, 0F, 0F, -8F, 0F, -43F, -13F, 0F, -9F, -5F, 0F); // Box 42
		leftWingModel[2].setRotationPoint(-159F, -100F, -118F);
		
		leftWingModel[3].addShapeBox(0F, 0F, 0F, 253, 35, 453, 0F, -222F, -24F, 0F, 0F, -31F, 0F, -204F, -8F, 0F, 0F, 0F, 0F, -222F, 0F, 0F, 0F, -4F, 0F, -204F, -27F, 0F, 0F, -19F, 0F); // Box 46
		leftWingModel[3].setRotationPoint(-99F, -95F, -571F);
		
		leftWingModel[4].addShapeBox(0F, 0F, 0F, 289, 35, 453, 0F, -264F, -24F, 0F, 0F, -24F, 0F, -222F, 0F, 0F, 0F, 0F, 0F, -264F, 0F, 0F, 0F, 0F, 0F, -222F, -19F, 0F, 0F, -19F, 0F); // Box 47
		leftWingModel[4].setRotationPoint(-166F, -95F, -571F);
		
		leftWingModel[5].addShapeBox(0F, 0F, 0F, 318, 35, 453, 0F, -300F, -27F, 0F, 0F, -24F, 0F, -264F, 0F, 0F, 0F, -1F, 0F, -300F, -3F, 0F, 0F, 0F, 0F, -264F, -19F, 0F, 5F, -27F, 0F); // Box 48
		leftWingModel[5].setRotationPoint(-220F, -95F, -571F);
		
		leftWingModel[6].addShapeBox(0F, 0F, 0F, 69, 8, 29, 0F, 0F, 0F, -15F, 0F, -4F, -14F, 0F, -4F, -15F, 0F, 0F, -14F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 54
		leftWingModel[6].setRotationPoint(-232F, -63F, -263F);
		
		leftWingModel[7].addShapeBox(0F, 0F, 0F, 69, 11, 29, 0F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -15F, 0F, -2F, -15F, 0F, -2F, -14F, 0F, 0F, -14F); // Box 56
		leftWingModel[7].setRotationPoint(-232F, -39F, -263F);
		
		leftWingModel[8].addShapeBox(0F, 0F, 0F, 69, 19, 29, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[8].setRotationPoint(-232F, -56F, -263F);
		
		leftWingModel[9].addShapeBox(0F, 0F, 0F, 69, 8, 29, 0F, 0F, 0F, -14F, 0F, -4F, -15F, 0F, -4F, -14F, 0F, 0F, -15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 0
		leftWingModel[9].setRotationPoint(-232F, -63F, -234F);
		
		leftWingModel[10].addShapeBox(0F, 0F, 0F, 69, 19, 29, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 4
		leftWingModel[10].setRotationPoint(-232F, -56F, -234F);
		
		leftWingModel[11].addShapeBox(0F, 0F, 0F, 69, 11, 29, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, -14F, 0F, -2F, -14F, 0F, -2F, -15F, 0F, 0F, -15F); // Box 5
		leftWingModel[11].setRotationPoint(-232F, -39F, -234F);
		
		leftWingModel[12].addShapeBox(0F, 0F, 0F, 21, 16, 7, 0F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 0F); // Box 7
		leftWingModel[12].setRotationPoint(-163F, -55F, -213F);
		
		leftWingModel[13].addShapeBox(0F, 0F, 0F, 66, 46, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F); // Box 9
		leftWingModel[13].setRotationPoint(-144F, -85F, -235F);
		
		leftWingModel[14].addShapeBox(0F, 0F, 0F, 6, 46, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftWingModel[14].setRotationPoint(-150F, -85F, -235F);
		
		leftWingModel[15].addShapeBox(0F, 0F, 0F, 27, 46, 2, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftWingModel[15].setRotationPoint(-177F, -85F, -235F);
		
		leftWingModel[16].addShapeBox(0F, 0F, 0F, 32, 35, 2, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftWingModel[16].setRotationPoint(-209F, -74F, -235F);
		
		leftWingModel[17].addShapeBox(0F, 0F, 0F, 69, 8, 29, 0F, 0F, 0F, -15F, 0F, -4F, -14F, 0F, -4F, -15F, 0F, 0F, -14F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		leftWingModel[17].setRotationPoint(-122F, -53F, -437F);
		
		leftWingModel[18].addShapeBox(0F, 0F, 0F, 69, 19, 29, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 20
		leftWingModel[18].setRotationPoint(-122F, -46F, -437F);
		
		leftWingModel[19].addShapeBox(0F, 0F, 0F, 69, 11, 29, 0F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -15F, 0F, -2F, -15F, 0F, -2F, -14F, 0F, 0F, -14F); // Box 21
		leftWingModel[19].setRotationPoint(-122F, -29F, -437F);
		
		leftWingModel[20].addShapeBox(0F, 0F, 0F, 69, 19, 29, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 22
		leftWingModel[20].setRotationPoint(-122F, -46F, -408F);
		
		leftWingModel[21].addShapeBox(0F, 0F, 0F, 69, 11, 29, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, -14F, 0F, -2F, -14F, 0F, -2F, -15F, 0F, 0F, -15F); // Box 23
		leftWingModel[21].setRotationPoint(-122F, -29F, -408F);
		
		leftWingModel[22].addShapeBox(0F, 0F, 0F, 32, 35, 2, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		leftWingModel[22].setRotationPoint(-99F, -64F, -409F);
		
		leftWingModel[23].addShapeBox(0F, 0F, 0F, 27, 46, 2, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		leftWingModel[23].setRotationPoint(-67F, -75F, -409F);
		
		leftWingModel[24].addShapeBox(0F, 0F, 0F, 6, 46, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		leftWingModel[24].setRotationPoint(-40F, -75F, -409F);
		
		leftWingModel[25].addShapeBox(0F, 0F, 0F, 66, 46, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F); // Box 33
		leftWingModel[25].setRotationPoint(-34F, -75F, -409F);
		
		leftWingModel[26].addShapeBox(0F, 0F, 0F, 69, 8, 29, 0F, 0F, 0F, -14F, 0F, -4F, -15F, 0F, -4F, -14F, 0F, 0F, -15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 34
		leftWingModel[26].setRotationPoint(-122F, -53F, -408F);
		
		leftWingModel[27].addShapeBox(0F, 0F, 0F, 16, 11, 14, 0F, 0F, -10F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -7F, -1F); // Box 945
		leftWingModel[27].setRotationPoint(-248F, -63F, -234F);
		
		leftWingModel[28].addShapeBox(0F, 0F, 0F, 16, 19, 3, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F); // Box 946
		leftWingModel[28].setRotationPoint(-248F, -56F, -234F);
		
		leftWingModel[29].addShapeBox(0F, 0F, 0F, 16, 11, 16, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, -10F, -3F, 0F, -7F, 0F, 0F, -10F, -1F, 0F, -3F, 0F, 0F, 0F, -3F); // Box 947
		leftWingModel[29].setRotationPoint(-248F, -63F, -221F);
		
		leftWingModel[30].addShapeBox(0F, 0F, 0F, 16, 19, 4, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, -3F); // Box 948
		leftWingModel[30].setRotationPoint(-248F, -56F, -209F);
		
		leftWingModel[31].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -13F, 0F, 0F, -7F, -1F, 0F, -13F, -2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -6F, -1F); // Box 949
		leftWingModel[31].setRotationPoint(-248F, -42F, -234F);
		
		leftWingModel[32].addShapeBox(0F, 0F, 0F, 16, 14, 16, 0F, 0F, -7F, 0F, 0F, -13F, -1F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -13F, -3F); // Box 950
		leftWingModel[32].setRotationPoint(-248F, -42F, -221F);
		
		leftWingModel[33].addShapeBox(0F, 0F, 0F, 16, 19, 3, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -2F); // Box 951
		leftWingModel[33].setRotationPoint(-248F, -56F, -237F);
		
		leftWingModel[34].addShapeBox(0F, 0F, 0F, 16, 19, 4, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F); // Box 952
		leftWingModel[34].setRotationPoint(-248F, -56F, -263F);
		
		leftWingModel[35].addShapeBox(0F, 0F, 0F, 16, 11, 14, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, -2F, 0F, -7F, -1F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, 0F, -2F); // Box 953
		leftWingModel[35].setRotationPoint(-248F, -63F, -248F);
		
		leftWingModel[36].addShapeBox(0F, 0F, 0F, 16, 11, 16, 0F, 0F, -10F, -3F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -10F, -1F, 0F, -7F, 0F); // Box 954
		leftWingModel[36].setRotationPoint(-248F, -63F, -263F);
		
		leftWingModel[37].addShapeBox(0F, 0F, 0F, 16, 14, 16, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -13F, -1F, 0F, -7F, 0F, 0F, -13F, -3F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -6F, 0F); // Box 955
		leftWingModel[37].setRotationPoint(-248F, -42F, -263F);
		
		leftWingModel[38].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F, 0F, -7F, -1F, 0F, -13F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -13F, -2F); // Box 956
		leftWingModel[38].setRotationPoint(-248F, -42F, -248F);
		
		leftWingModel[39].addShapeBox(0F, 0F, 0F, 16, 11, 14, 0F, 0F, -10F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -7F, -1F); // Box 957
		leftWingModel[39].setRotationPoint(-138F, -53F, -408F);
		
		leftWingModel[40].addShapeBox(0F, 0F, 0F, 16, 11, 16, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, -10F, -3F, 0F, -7F, 0F, 0F, -10F, -1F, 0F, -3F, 0F, 0F, 0F, -3F); // Box 958
		leftWingModel[40].setRotationPoint(-138F, -53F, -395F);
		
		leftWingModel[41].addShapeBox(0F, 0F, 0F, 16, 19, 4, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, -3F); // Box 959
		leftWingModel[41].setRotationPoint(-138F, -46F, -383F);
		
		leftWingModel[42].addShapeBox(0F, 0F, 0F, 16, 14, 16, 0F, 0F, -7F, 0F, 0F, -13F, -1F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -13F, -3F); // Box 960
		leftWingModel[42].setRotationPoint(-138F, -32F, -395F);
		
		leftWingModel[43].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -13F, 0F, 0F, -7F, -1F, 0F, -13F, -2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -6F, -1F); // Box 961
		leftWingModel[43].setRotationPoint(-138F, -32F, -408F);
		
		leftWingModel[44].addShapeBox(0F, 0F, 0F, 16, 19, 3, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F); // Box 962
		leftWingModel[44].setRotationPoint(-138F, -46F, -408F);
		
		leftWingModel[45].addShapeBox(0F, 0F, 0F, 16, 11, 14, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, -2F, 0F, -7F, -1F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, 0F, -2F); // Box 963
		leftWingModel[45].setRotationPoint(-138F, -53F, -422F);
		
		leftWingModel[46].addShapeBox(0F, 0F, 0F, 16, 19, 3, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -2F); // Box 964
		leftWingModel[46].setRotationPoint(-138F, -46F, -411F);
		
		leftWingModel[47].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F, 0F, -7F, -1F, 0F, -13F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -13F, -2F); // Box 965
		leftWingModel[47].setRotationPoint(-138F, -32F, -422F);
		
		leftWingModel[48].addShapeBox(0F, 0F, 0F, 16, 14, 16, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -13F, -1F, 0F, -7F, 0F, 0F, -13F, -3F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -6F, 0F); // Box 966
		leftWingModel[48].setRotationPoint(-138F, -32F, -437F);
		
		leftWingModel[49].addShapeBox(0F, 0F, 0F, 16, 19, 4, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F); // Box 967
		leftWingModel[49].setRotationPoint(-138F, -46F, -437F);
		
		leftWingModel[50].addShapeBox(0F, 0F, 0F, 16, 11, 16, 0F, 0F, -10F, -3F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -10F, -1F, 0F, -7F, 0F); // Box 968
		leftWingModel[50].setRotationPoint(-138F, -53F, -437F);
		
		leftWingModel[51].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box434
		leftWingModel[51].setRotationPoint(-235F, -46F, -220.5F);
		
		leftWingModel[52].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box435
		leftWingModel[52].setRotationPoint(-235F, -46F, -220.5F);
		
		leftWingModel[53].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Import Box436
		leftWingModel[53].setRotationPoint(-235F, -46F, -220.5F);
		
		leftWingModel[54].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 996
		leftWingModel[54].setRotationPoint(-235F, -46F, -248.5F);
		
		leftWingModel[55].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 997
		leftWingModel[55].setRotationPoint(-235F, -46F, -248.5F);
		
		leftWingModel[56].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 998
		leftWingModel[56].setRotationPoint(-235F, -46F, -248.5F);
		
		leftWingModel[57].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 999
		leftWingModel[57].setRotationPoint(-125F, -37F, -422.5F);
		
		leftWingModel[58].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1000
		leftWingModel[58].setRotationPoint(-125F, -37F, -422.5F);
		
		leftWingModel[59].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 1001
		leftWingModel[59].setRotationPoint(-125F, -37F, -422.5F);
		
		leftWingModel[60].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1002
		leftWingModel[60].setRotationPoint(-125F, -37F, -393.5F);
		
		leftWingModel[61].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1003
		leftWingModel[61].setRotationPoint(-125F, -37F, -393.5F);
		
		leftWingModel[62].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 1004
		leftWingModel[62].setRotationPoint(-125F, -37F, -393.5F);
		
		leftWingModel[63].addShapeBox(0F, 0F, 0F, 21, 17, 6, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, -5F); // Box 1017
		leftWingModel[63].setRotationPoint(-163F, -55F, -234F);
		
		leftWingModel[64].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -4F, 0F, 0F, -9F, -5F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -9F, 0F); // Box 1018
		leftWingModel[64].setRotationPoint(-163F, -59F, -234F);
		
		leftWingModel[65].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -9F, -6F, 0F, -4F, 0F, 0F, -9F, -1F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, -5F, 0F); // Box 0
		leftWingModel[65].setRotationPoint(-163F, -59F, -220F);
		
		leftWingModel[66].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, -6F, 0F, -8F, 0F); // Box 1
		leftWingModel[66].setRotationPoint(-163F, -40F, -220F);
		
		leftWingModel[67].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -9F, -1F, 0F, -8F, 0F, 0F, -9F, -5F, 0F, -5F, -1F, 0F, 0F, -1F); // Box 2
		leftWingModel[67].setRotationPoint(-163F, -40F, -234F);
		
		leftWingModel[68].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -9F, -5F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -4F, -1F, 0F, 0F, -5F, 0F, -5F, 0F); // Box 3
		leftWingModel[68].setRotationPoint(-163F, -59F, -249F);
		
		leftWingModel[69].addShapeBox(0F, 0F, 0F, 21, 17, 6, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 4
		leftWingModel[69].setRotationPoint(-163F, -55F, -240F);
		
		leftWingModel[70].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -4F, 0F, 0F, -9F, -6F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, -1F); // Box 5
		leftWingModel[70].setRotationPoint(-163F, -59F, -262F);
		
		leftWingModel[71].addShapeBox(0F, 0F, 0F, 21, 16, 7, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -6F); // Box 6
		leftWingModel[71].setRotationPoint(-163F, -55F, -262F);
		
		leftWingModel[72].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -9F, -6F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 7
		leftWingModel[72].setRotationPoint(-163F, -40F, -262F);
		
		leftWingModel[73].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -9F, -1F, 0F, -4F, -1F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -9F, -5F, 0F, -8F, 0F); // Box 8
		leftWingModel[73].setRotationPoint(-163F, -40F, -249F);
		
		leftWingModel[74].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -4F, 0F, 0F, -9F, -6F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, -1F); // Box 9
		leftWingModel[74].setRotationPoint(-53F, -49F, -436F);
		
		leftWingModel[75].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -9F, -5F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -4F, -1F, 0F, 0F, -5F, 0F, -5F, 0F); // Box 10
		leftWingModel[75].setRotationPoint(-53F, -49F, -423F);
		
		leftWingModel[76].addShapeBox(0F, 0F, 0F, 21, 17, 6, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 11
		leftWingModel[76].setRotationPoint(-53F, -45F, -414F);
		
		leftWingModel[77].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -4F, 0F, 0F, -9F, -5F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -9F, 0F); // Box 12
		leftWingModel[77].setRotationPoint(-53F, -49F, -408F);
		
		leftWingModel[78].addShapeBox(0F, 0F, 0F, 21, 17, 6, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, -5F); // Box 13
		leftWingModel[78].setRotationPoint(-53F, -45F, -408F);
		
		leftWingModel[79].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -9F, -6F, 0F, -4F, 0F, 0F, -9F, -1F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, -5F, 0F); // Box 14
		leftWingModel[79].setRotationPoint(-53F, -49F, -394F);
		
		leftWingModel[80].addShapeBox(0F, 0F, 0F, 21, 16, 7, 0F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 0F); // Box 15
		leftWingModel[80].setRotationPoint(-53F, -45F, -387F);
		
		leftWingModel[81].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, -6F, 0F, -8F, 0F); // Box 16
		leftWingModel[81].setRotationPoint(-53F, -30F, -394F);
		
		leftWingModel[82].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -9F, -1F, 0F, -8F, 0F, 0F, -9F, -5F, 0F, -5F, -1F, 0F, 0F, -1F); // Box 17
		leftWingModel[82].setRotationPoint(-53F, -30F, -408F);
		
		leftWingModel[83].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -9F, -1F, 0F, -4F, -1F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -9F, -5F, 0F, -8F, 0F); // Box 18
		leftWingModel[83].setRotationPoint(-53F, -30F, -423F);
		
		leftWingModel[84].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -9F, -6F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 19
		leftWingModel[84].setRotationPoint(-53F, -30F, -436F);
		
		leftWingModel[85].addShapeBox(0F, 0F, 0F, 21, 16, 7, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -6F); // Box 20
		leftWingModel[85].setRotationPoint(-53F, -45F, -436F);
	}
	
	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		rightWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		rightWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		rightWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		rightWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		rightWingModel[5] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Box 37
		rightWingModel[6] = new ModelRendererTurbo(this, 0, 1254, textureX, textureY); // Box 39
		rightWingModel[7] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 41
		rightWingModel[8] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Box 44
		rightWingModel[9] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 48
		rightWingModel[10] = new ModelRendererTurbo(this, 0, 1254, textureX, textureY); // Box 49
		rightWingModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		rightWingModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		rightWingModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		rightWingModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		rightWingModel[15] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Box 63
		rightWingModel[16] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 64
		rightWingModel[17] = new ModelRendererTurbo(this, 0, 1254, textureX, textureY); // Box 65
		rightWingModel[18] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 66
		rightWingModel[19] = new ModelRendererTurbo(this, 0, 1254, textureX, textureY); // Box 67
		rightWingModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		rightWingModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		rightWingModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		rightWingModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		rightWingModel[24] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Box 78
		rightWingModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		rightWingModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 969
		rightWingModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 970
		rightWingModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 971
		rightWingModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 972
		rightWingModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 973
		rightWingModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 974
		rightWingModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 975
		rightWingModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 976
		rightWingModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 977
		rightWingModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 978
		rightWingModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 979
		rightWingModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 980
		rightWingModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 981
		rightWingModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 982
		rightWingModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 983
		rightWingModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 984
		rightWingModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 985
		rightWingModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 986
		rightWingModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 987
		rightWingModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 988
		rightWingModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 989
		rightWingModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 990
		rightWingModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 991
		rightWingModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 992
		rightWingModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1005
		rightWingModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1006
		rightWingModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1007
		rightWingModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1008
		rightWingModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1009
		rightWingModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1010
		rightWingModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1011
		rightWingModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1012
		rightWingModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1013
		rightWingModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1014
		rightWingModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1015
		rightWingModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1016
		rightWingModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		rightWingModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		rightWingModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		rightWingModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		rightWingModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		rightWingModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		rightWingModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		rightWingModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		rightWingModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		rightWingModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		rightWingModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		rightWingModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		rightWingModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		rightWingModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		rightWingModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		rightWingModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		rightWingModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		rightWingModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		rightWingModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		rightWingModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		rightWingModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		rightWingModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		rightWingModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		rightWingModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		
		rightWingModel[0].addShapeBox(0F, 0F, 0F, 188, 21, 103, 0F, -64F, -1F, 0F, -60F, 0F, 0F, 0F, -5F, 0F, -134F, -6F, 0F, -57F, -15F, 0F, -60F, -4F, 0F, 0F, 0F, 0F, -129F, -8F, 0F); // Box 43
		rightWingModel[0].setRotationPoint(-354F, -100F, 15F);
		
		rightWingModel[1].addShapeBox(0F, 0F, 0F, 127, 21, 103, 0F, 0F, 0F, 0F, -51F, 0F, 0F, 0F, -5F, 0F, -60F, -5F, 0F, 0F, -4F, 0F, -51F, -5F, 0F, 0F, 0F, 0F, -60F, 0F, 0F); // Box 44
		rightWingModel[1].setRotationPoint(-226F, -100F, 15F);
		
		rightWingModel[2].addShapeBox(0F, 0F, 0F, 253, 35, 453, 0F, 0F, 0F, 0F, -204F, -8F, 0F, 0F, -31F, 0F, -222F, -24F, 0F, 0F, -19F, 0F, -204F, -27F, 0F, 0F, -4F, 0F, -222F, 0F, 0F); // Box 49
		rightWingModel[2].setRotationPoint(-99F, -95F, 118F);
		
		rightWingModel[3].addShapeBox(0F, 0F, 0F, 289, 35, 453, 0F, 0F, 0F, 0F, -222F, 0F, 0F, 0F, -24F, 0F, -264F, -24F, 0F, 0F, -19F, 0F, -222F, -19F, 0F, 0F, 0F, 0F, -264F, 0F, 0F); // Box 50
		rightWingModel[3].setRotationPoint(-166F, -95F, 118F);
		
		rightWingModel[4].addShapeBox(0F, 0F, 0F, 318, 35, 453, 0F, 0F, -1F, 0F, -264F, 0F, 0F, 0F, -24F, 0F, -300F, -27F, 0F, 5F, -27F, 0F, -264F, -19F, 0F, 0F, 0F, 0F, -300F, -3F, 0F); // Box 51
		rightWingModel[4].setRotationPoint(-220F, -95F, 118F);
		
		rightWingModel[5].addShapeBox(0F, 0F, 0F, 69, 8, 29, 0F, 0F, 0F, -14F, 0F, -4F, -15F, 0F, -4F, -14F, 0F, 0F, -15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 37
		rightWingModel[5].setRotationPoint(-232F, -63F, 234F);
		
		rightWingModel[6].addShapeBox(0F, 0F, 0F, 69, 11, 29, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, -14F, 0F, -2F, -14F, 0F, -2F, -15F, 0F, 0F, -15F); // Box 39
		rightWingModel[6].setRotationPoint(-232F, -39F, 234F);
		
		rightWingModel[7].addShapeBox(0F, 0F, 0F, 69, 19, 29, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 41
		rightWingModel[7].setRotationPoint(-232F, -56F, 234F);
		
		rightWingModel[8].addShapeBox(0F, 0F, 0F, 69, 8, 29, 0F, 0F, 0F, -15F, 0F, -4F, -14F, 0F, -4F, -15F, 0F, 0F, -14F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		rightWingModel[8].setRotationPoint(-232F, -63F, 205F);
		
		rightWingModel[9].addShapeBox(0F, 0F, 0F, 69, 19, 29, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 48
		rightWingModel[9].setRotationPoint(-232F, -56F, 205F);
		
		rightWingModel[10].addShapeBox(0F, 0F, 0F, 69, 11, 29, 0F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -15F, 0F, -2F, -15F, 0F, -2F, -14F, 0F, 0F, -14F); // Box 49
		rightWingModel[10].setRotationPoint(-232F, -39F, 205F);
		
		rightWingModel[11].addShapeBox(0F, 0F, 0F, 66, 46, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F); // Box 53
		rightWingModel[11].setRotationPoint(-144F, -85F, 233F);
		
		rightWingModel[12].addShapeBox(0F, 0F, 0F, 6, 46, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightWingModel[12].setRotationPoint(-150F, -85F, 233F);
		
		rightWingModel[13].addShapeBox(0F, 0F, 0F, 27, 46, 2, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightWingModel[13].setRotationPoint(-177F, -85F, 233F);
		
		rightWingModel[14].addShapeBox(0F, 0F, 0F, 32, 35, 2, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightWingModel[14].setRotationPoint(-209F, -74F, 233F);
		
		rightWingModel[15].addShapeBox(0F, 0F, 0F, 69, 8, 29, 0F, 0F, 0F, -14F, 0F, -4F, -15F, 0F, -4F, -14F, 0F, 0F, -15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 63
		rightWingModel[15].setRotationPoint(-122F, -53F, 408F);
		
		rightWingModel[16].addShapeBox(0F, 0F, 0F, 69, 19, 29, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 64
		rightWingModel[16].setRotationPoint(-122F, -46F, 408F);
		
		rightWingModel[17].addShapeBox(0F, 0F, 0F, 69, 11, 29, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, -14F, 0F, -2F, -14F, 0F, -2F, -15F, 0F, 0F, -15F); // Box 65
		rightWingModel[17].setRotationPoint(-122F, -29F, 408F);
		
		rightWingModel[18].addShapeBox(0F, 0F, 0F, 69, 19, 29, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 66
		rightWingModel[18].setRotationPoint(-122F, -46F, 379F);
		
		rightWingModel[19].addShapeBox(0F, 0F, 0F, 69, 11, 29, 0F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -15F, 0F, -2F, -15F, 0F, -2F, -14F, 0F, 0F, -14F); // Box 67
		rightWingModel[19].setRotationPoint(-122F, -29F, 379F);
		
		rightWingModel[20].addShapeBox(0F, 0F, 0F, 32, 35, 2, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightWingModel[20].setRotationPoint(-99F, -64F, 407F);
		
		rightWingModel[21].addShapeBox(0F, 0F, 0F, 27, 46, 2, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		rightWingModel[21].setRotationPoint(-67F, -75F, 407F);
		
		rightWingModel[22].addShapeBox(0F, 0F, 0F, 6, 46, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		rightWingModel[22].setRotationPoint(-40F, -75F, 407F);
		
		rightWingModel[23].addShapeBox(0F, 0F, 0F, 66, 46, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F); // Box 77
		rightWingModel[23].setRotationPoint(-34F, -75F, 407F);
		
		rightWingModel[24].addShapeBox(0F, 0F, 0F, 69, 8, 29, 0F, 0F, 0F, -15F, 0F, -4F, -14F, 0F, -4F, -15F, 0F, 0F, -14F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 78
		rightWingModel[24].setRotationPoint(-122F, -53F, 379F);
		
		rightWingModel[25].addShapeBox(0F, 0F, 0F, 109, 21, 103, 0F, -9F, 0F, 0F, -43F, -8F, 0F, 0F, -13F, 0F, -60F, -5F, 0F, -9F, -5F, 0F, -43F, -13F, 0F, 0F, -8F, 0F, -60F, 0F, 0F); // Box 27
		rightWingModel[25].setRotationPoint(-159F, -100F, 15F);
		
		rightWingModel[26].addShapeBox(0F, 0F, 0F, 16, 11, 14, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, -2F, 0F, -7F, -1F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, 0F, -2F); // Box 969
		rightWingModel[26].setRotationPoint(-248F, -63F, 220F);
		
		rightWingModel[27].addShapeBox(0F, 0F, 0F, 16, 19, 3, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -2F); // Box 970
		rightWingModel[27].setRotationPoint(-248F, -56F, 231F);
		
		rightWingModel[28].addShapeBox(0F, 0F, 0F, 16, 11, 16, 0F, 0F, -10F, -3F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -10F, -1F, 0F, -7F, 0F); // Box 971
		rightWingModel[28].setRotationPoint(-248F, -63F, 205F);
		
		rightWingModel[29].addShapeBox(0F, 0F, 0F, 16, 19, 4, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F); // Box 972
		rightWingModel[29].setRotationPoint(-248F, -56F, 205F);
		
		rightWingModel[30].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F, 0F, -7F, -1F, 0F, -13F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -13F, -2F); // Box 973
		rightWingModel[30].setRotationPoint(-248F, -42F, 220F);
		
		rightWingModel[31].addShapeBox(0F, 0F, 0F, 16, 14, 16, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -13F, -1F, 0F, -7F, 0F, 0F, -13F, -3F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -6F, 0F); // Box 974
		rightWingModel[31].setRotationPoint(-248F, -42F, 205F);
		
		rightWingModel[32].addShapeBox(0F, 0F, 0F, 16, 19, 3, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F); // Box 975
		rightWingModel[32].setRotationPoint(-248F, -56F, 234F);
		
		rightWingModel[33].addShapeBox(0F, 0F, 0F, 16, 19, 4, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, -3F); // Box 976
		rightWingModel[33].setRotationPoint(-248F, -56F, 259F);
		
		rightWingModel[34].addShapeBox(0F, 0F, 0F, 16, 11, 14, 0F, 0F, -10F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -7F, -1F); // Box 977
		rightWingModel[34].setRotationPoint(-248F, -63F, 234F);
		
		rightWingModel[35].addShapeBox(0F, 0F, 0F, 16, 11, 16, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, -10F, -3F, 0F, -7F, 0F, 0F, -10F, -1F, 0F, -3F, 0F, 0F, 0F, -3F); // Box 978
		rightWingModel[35].setRotationPoint(-248F, -63F, 247F);
		
		rightWingModel[36].addShapeBox(0F, 0F, 0F, 16, 14, 16, 0F, 0F, -7F, 0F, 0F, -13F, -1F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -13F, -3F); // Box 979
		rightWingModel[36].setRotationPoint(-248F, -42F, 247F);
		
		rightWingModel[37].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -13F, 0F, 0F, -7F, -1F, 0F, -13F, -2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -6F, -1F); // Box 980
		rightWingModel[37].setRotationPoint(-248F, -42F, 234F);
		
		rightWingModel[38].addShapeBox(0F, 0F, 0F, 16, 11, 14, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, -2F, 0F, -7F, -1F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, 0F, -2F); // Box 981
		rightWingModel[38].setRotationPoint(-138F, -53F, 394F);
		
		rightWingModel[39].addShapeBox(0F, 0F, 0F, 16, 11, 16, 0F, 0F, -10F, -3F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -10F, -1F, 0F, -7F, 0F); // Box 982
		rightWingModel[39].setRotationPoint(-138F, -53F, 379F);
		
		rightWingModel[40].addShapeBox(0F, 0F, 0F, 16, 19, 4, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F); // Box 983
		rightWingModel[40].setRotationPoint(-138F, -46F, 379F);
		
		rightWingModel[41].addShapeBox(0F, 0F, 0F, 16, 14, 16, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -13F, -1F, 0F, -7F, 0F, 0F, -13F, -3F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -6F, 0F); // Box 984
		rightWingModel[41].setRotationPoint(-138F, -32F, 379F);
		
		rightWingModel[42].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F, 0F, -7F, -1F, 0F, -13F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -13F, -2F); // Box 985
		rightWingModel[42].setRotationPoint(-138F, -32F, 394F);
		
		rightWingModel[43].addShapeBox(0F, 0F, 0F, 16, 19, 3, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -2F); // Box 986
		rightWingModel[43].setRotationPoint(-138F, -46F, 405F);
		
		rightWingModel[44].addShapeBox(0F, 0F, 0F, 16, 11, 14, 0F, 0F, -10F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -7F, -1F); // Box 987
		rightWingModel[44].setRotationPoint(-138F, -53F, 408F);
		
		rightWingModel[45].addShapeBox(0F, 0F, 0F, 16, 19, 3, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F); // Box 988
		rightWingModel[45].setRotationPoint(-138F, -46F, 408F);
		
		rightWingModel[46].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -13F, 0F, 0F, -7F, -1F, 0F, -13F, -2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -6F, -1F); // Box 989
		rightWingModel[46].setRotationPoint(-138F, -32F, 408F);
		
		rightWingModel[47].addShapeBox(0F, 0F, 0F, 16, 14, 16, 0F, 0F, -7F, 0F, 0F, -13F, -1F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -13F, -3F); // Box 990
		rightWingModel[47].setRotationPoint(-138F, -32F, 421F);
		
		rightWingModel[48].addShapeBox(0F, 0F, 0F, 16, 19, 4, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, -3F); // Box 991
		rightWingModel[48].setRotationPoint(-138F, -46F, 433F);
		
		rightWingModel[49].addShapeBox(0F, 0F, 0F, 16, 11, 16, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, -10F, -3F, 0F, -7F, 0F, 0F, -10F, -1F, 0F, -3F, 0F, 0F, 0F, -3F); // Box 992
		rightWingModel[49].setRotationPoint(-138F, -53F, 421F);
		
		rightWingModel[50].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1005
		rightWingModel[50].setRotationPoint(-235F, -46F, 219.5F);
		
		rightWingModel[51].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1006
		rightWingModel[51].setRotationPoint(-235F, -46F, 219.5F);
		
		rightWingModel[52].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 1007
		rightWingModel[52].setRotationPoint(-235F, -46F, 219.5F);
		
		rightWingModel[53].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1008
		rightWingModel[53].setRotationPoint(-235F, -46F, 247.5F);
		
		rightWingModel[54].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1009
		rightWingModel[54].setRotationPoint(-235F, -46F, 247.5F);
		
		rightWingModel[55].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 1010
		rightWingModel[55].setRotationPoint(-235F, -46F, 247.5F);
		
		rightWingModel[56].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1011
		rightWingModel[56].setRotationPoint(-125F, -37F, 421.5F);
		
		rightWingModel[57].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1012
		rightWingModel[57].setRotationPoint(-125F, -37F, 421.5F);
		
		rightWingModel[58].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 1013
		rightWingModel[58].setRotationPoint(-125F, -37F, 421.5F);
		
		rightWingModel[59].addShapeBox(0F, -3F, -3F, 3, 2, 6, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1014
		rightWingModel[59].setRotationPoint(-125F, -37F, 394.5F);
		
		rightWingModel[60].addShapeBox(0F, -1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1015
		rightWingModel[60].setRotationPoint(-125F, -37F, 394.5F);
		
		rightWingModel[61].addShapeBox(0F, 1F, -3F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 1016
		rightWingModel[61].setRotationPoint(-125F, -37F, 394.5F);
		
		rightWingModel[62].addShapeBox(0F, 0F, 0F, 21, 16, 7, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -6F); // Box 21
		rightWingModel[62].setRotationPoint(-163F, -55F, 206F);
		
		rightWingModel[63].addShapeBox(0F, 0F, 0F, 21, 17, 6, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 22
		rightWingModel[63].setRotationPoint(-163F, -55F, 228F);
		
		rightWingModel[64].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -9F, -5F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -4F, -1F, 0F, 0F, -5F, 0F, -5F, 0F); // Box 23
		rightWingModel[64].setRotationPoint(-163F, -59F, 219F);
		
		rightWingModel[65].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -4F, 0F, 0F, -9F, -6F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, -1F); // Box 24
		rightWingModel[65].setRotationPoint(-163F, -59F, 206F);
		
		rightWingModel[66].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -9F, -6F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 25
		rightWingModel[66].setRotationPoint(-163F, -40F, 206F);
		
		rightWingModel[67].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -9F, -1F, 0F, -4F, -1F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -9F, -5F, 0F, -8F, 0F); // Box 26
		rightWingModel[67].setRotationPoint(-163F, -40F, 219F);
		
		rightWingModel[68].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -4F, 0F, 0F, -9F, -5F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -9F, 0F); // Box 27
		rightWingModel[68].setRotationPoint(-163F, -59F, 234F);
		
		rightWingModel[69].addShapeBox(0F, 0F, 0F, 21, 17, 6, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, -5F); // Box 28
		rightWingModel[69].setRotationPoint(-163F, -55F, 234F);
		
		rightWingModel[70].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -9F, -6F, 0F, -4F, 0F, 0F, -9F, -1F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, -5F, 0F); // Box 29
		rightWingModel[70].setRotationPoint(-163F, -59F, 248F);
		
		rightWingModel[71].addShapeBox(0F, 0F, 0F, 21, 16, 7, 0F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 0F); // Box 30
		rightWingModel[71].setRotationPoint(-163F, -55F, 255F);
		
		rightWingModel[72].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, -6F, 0F, -8F, 0F); // Box 31
		rightWingModel[72].setRotationPoint(-163F, -40F, 248F);
		
		rightWingModel[73].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -9F, -1F, 0F, -8F, 0F, 0F, -9F, -5F, 0F, -5F, -1F, 0F, 0F, -1F); // Box 32
		rightWingModel[73].setRotationPoint(-163F, -40F, 234F);
		
		rightWingModel[74].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -9F, -6F, 0F, -4F, 0F, 0F, -9F, -1F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, -5F, 0F); // Box 33
		rightWingModel[74].setRotationPoint(-53F, -49F, 422F);
		
		rightWingModel[75].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -4F, 0F, 0F, -9F, -5F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -9F, 0F); // Box 34
		rightWingModel[75].setRotationPoint(-53F, -49F, 408F);
		
		rightWingModel[76].addShapeBox(0F, 0F, 0F, 21, 17, 6, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, -5F); // Box 35
		rightWingModel[76].setRotationPoint(-53F, -45F, 408F);
		
		rightWingModel[77].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -9F, -5F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -4F, -1F, 0F, 0F, -5F, 0F, -5F, 0F); // Box 36
		rightWingModel[77].setRotationPoint(-53F, -49F, 393F);
		
		rightWingModel[78].addShapeBox(0F, 0F, 0F, 21, 17, 6, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 37
		rightWingModel[78].setRotationPoint(-53F, -45F, 402F);
		
		rightWingModel[79].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -4F, 0F, 0F, -9F, -6F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, -1F); // Box 38
		rightWingModel[79].setRotationPoint(-53F, -49F, 380F);
		
		rightWingModel[80].addShapeBox(0F, 0F, 0F, 21, 16, 7, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -6F); // Box 39
		rightWingModel[80].setRotationPoint(-53F, -45F, 380F);
		
		rightWingModel[81].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -9F, -6F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 40
		rightWingModel[81].setRotationPoint(-53F, -30F, 380F);
		
		rightWingModel[82].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -9F, -1F, 0F, -4F, -1F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -9F, -5F, 0F, -8F, 0F); // Box 41
		rightWingModel[82].setRotationPoint(-53F, -30F, 393F);
		
		rightWingModel[83].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -9F, -1F, 0F, -8F, 0F, 0F, -9F, -5F, 0F, -5F, -1F, 0F, 0F, -1F); // Box 42
		rightWingModel[83].setRotationPoint(-53F, -30F, 408F);
		
		rightWingModel[84].addShapeBox(0F, 0F, 0F, 21, 10, 14, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, -6F, 0F, -8F, 0F); // Box 43
		rightWingModel[84].setRotationPoint(-53F, -30F, 422F);
		
		rightWingModel[85].addShapeBox(0F, 0F, 0F, 21, 16, 7, 0F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 0F); // Box 44
		rightWingModel[85].setRotationPoint(-53F, -45F, 429F);
	}
	
	private void inittopWingModel_1()
	{
		topWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		
		topWingModel[0].addShapeBox(0F, 0F, 0F, 79, 158, 8, 0F, -48F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -48F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, -4F, -29F, 0F, -4F, 0F, 0F, 0F); // Box 35
		topWingModel[0].setRotationPoint(352F, -255F, -4F);
	}
	
	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		
		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 57, 8, 166, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -15F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -15F, -4F, 0F, 0F, 0F, 0F); // Box 37
		pitchFlapLeftModel[0].setRotationPoint(390F, -80F, -174F);
	}
	
	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		
		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 57, 8, 166, 0F, 0F, 0F, 0F, -15F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 39
		pitchFlapRightModel[0].setRotationPoint(390F, -80F, 8F);
	}
	
	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 847
		bodyWheelModel[1] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 848
		bodyWheelModel[2] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 849
		bodyWheelModel[3] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 850
		bodyWheelModel[4] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 851
		bodyWheelModel[5] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 852
		bodyWheelModel[6] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 853
		bodyWheelModel[7] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 854
		bodyWheelModel[8] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 855
		bodyWheelModel[9] = new ModelRendererTurbo(this, 41, 1322, textureX, textureY); // Box 856
		bodyWheelModel[10] = new ModelRendererTurbo(this, 121, 1299, textureX, textureY); // Box 857
		bodyWheelModel[11] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 858
		bodyWheelModel[12] = new ModelRendererTurbo(this, 41, 1322, textureX, textureY); // Box 859
		bodyWheelModel[13] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 860
		bodyWheelModel[14] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 861
		bodyWheelModel[15] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 874
		bodyWheelModel[16] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 875
		bodyWheelModel[17] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 876
		bodyWheelModel[18] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 877
		bodyWheelModel[19] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 878
		bodyWheelModel[20] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 879
		bodyWheelModel[21] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 880
		bodyWheelModel[22] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 881
		bodyWheelModel[23] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 882
		bodyWheelModel[24] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 883
		bodyWheelModel[25] = new ModelRendererTurbo(this, 41, 1322, textureX, textureY); // Box 884
		bodyWheelModel[26] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 885
		bodyWheelModel[27] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 886
		bodyWheelModel[28] = new ModelRendererTurbo(this, 41, 1322, textureX, textureY); // Box 887
		bodyWheelModel[29] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 888
		bodyWheelModel[30] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 889
		bodyWheelModel[31] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 890
		bodyWheelModel[32] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 891
		bodyWheelModel[33] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 892
		bodyWheelModel[34] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 893
		bodyWheelModel[35] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 894
		bodyWheelModel[36] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 895
		bodyWheelModel[37] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 896
		bodyWheelModel[38] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 897
		bodyWheelModel[39] = new ModelRendererTurbo(this, 41, 1322, textureX, textureY); // Box 898
		bodyWheelModel[40] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 899
		bodyWheelModel[41] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 900
		bodyWheelModel[42] = new ModelRendererTurbo(this, 41, 1322, textureX, textureY); // Box 901
		bodyWheelModel[43] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 902
		bodyWheelModel[44] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 903
		bodyWheelModel[45] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 904
		bodyWheelModel[46] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 905
		bodyWheelModel[47] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 906
		bodyWheelModel[48] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 907
		bodyWheelModel[49] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 908
		bodyWheelModel[50] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 909
		bodyWheelModel[51] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 910
		bodyWheelModel[52] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 911
		bodyWheelModel[53] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 912
		bodyWheelModel[54] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 913
		bodyWheelModel[55] = new ModelRendererTurbo(this, 41, 1322, textureX, textureY); // Box 914
		bodyWheelModel[56] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 915
		bodyWheelModel[57] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 916
		bodyWheelModel[58] = new ModelRendererTurbo(this, 41, 1322, textureX, textureY); // Box 917
		bodyWheelModel[59] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 918
		bodyWheelModel[60] = new ModelRendererTurbo(this, 282, 1299, textureX, textureY); // Box 919
		bodyWheelModel[61] = new ModelRendererTurbo(this, 282, 1299, textureX, textureY); // Box 920
		bodyWheelModel[62] = new ModelRendererTurbo(this, 121, 1299, textureX, textureY); // Box 921
		bodyWheelModel[63] = new ModelRendererTurbo(this, 121, 1340, textureX, textureY); // Box 922
		bodyWheelModel[64] = new ModelRendererTurbo(this, 282, 1340, textureX, textureY); // Box 923
		bodyWheelModel[65] = new ModelRendererTurbo(this, 282, 1340, textureX, textureY); // Box 926
		bodyWheelModel[66] = new ModelRendererTurbo(this, 121, 1340, textureX, textureY); // Box 927
		bodyWheelModel[67] = new ModelRendererTurbo(this, 41, 1299, textureX, textureY); // Box 944
		
		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 847
		bodyWheelModel[0].setRotationPoint(-223F, -25F, -30F);
		
		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 7, 9, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 848
		bodyWheelModel[1].setRotationPoint(-223F, -23F, -30F);
		
		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F); // Box 849
		bodyWheelModel[2].setRotationPoint(-223F, -19F, -30F);
		
		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850
		bodyWheelModel[3].setRotationPoint(-221F, -18F, -30F);
		
		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 851
		bodyWheelModel[4].setRotationPoint(-223F, -18F, -30F);
		
		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 852
		bodyWheelModel[5].setRotationPoint(-219F, -18F, -30F);
		
		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853
		bodyWheelModel[6].setRotationPoint(-223F, -2F, -32F);
		
		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 854
		bodyWheelModel[7].setRotationPoint(-223F, -4F, -32F);
		
		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 855
		bodyWheelModel[8].setRotationPoint(-223F, 1F, -32F);
		
		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 856
		bodyWheelModel[9].setRotationPoint(-233.5F, -8F, -41F);
		
		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 58, 13, 20, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 857
		bodyWheelModel[10].setRotationPoint(-220.5F, -26F, -47F);
		
		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 858
		bodyWheelModel[11].setRotationPoint(-233.5F, 1F, -41F);
		
		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 859
		bodyWheelModel[12].setRotationPoint(-233.5F, -8F, -23F);
		
		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 860
		bodyWheelModel[13].setRotationPoint(-233.5F, -17F, -23F);
		
		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 861
		bodyWheelModel[14].setRotationPoint(-233.5F, 1F, -23F);
		
		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 6, 7, 9, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 874
		bodyWheelModel[15].setRotationPoint(93F, -23F, -30F);
		
		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 875
		bodyWheelModel[16].setRotationPoint(93F, -25F, -30F);
		
		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F); // Box 876
		bodyWheelModel[17].setRotationPoint(93F, -19F, -30F);
		
		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 877
		bodyWheelModel[18].setRotationPoint(93F, -18F, -30F);
		
		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 878
		bodyWheelModel[19].setRotationPoint(95F, -18F, -30F);
		
		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 879
		bodyWheelModel[20].setRotationPoint(97F, -18F, -30F);
		
		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		bodyWheelModel[21].setRotationPoint(93F, -4F, -32F);
		
		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		bodyWheelModel[22].setRotationPoint(93F, -2F, -32F);
		
		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 882
		bodyWheelModel[23].setRotationPoint(93F, 1F, -32F);
		
		bodyWheelModel[24].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 883
		bodyWheelModel[24].setRotationPoint(82.5F, -17F, -23F);
		
		bodyWheelModel[25].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		bodyWheelModel[25].setRotationPoint(82.5F, -8F, -23F);
		
		bodyWheelModel[26].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 885
		bodyWheelModel[26].setRotationPoint(82.5F, 1F, -23F);
		
		bodyWheelModel[27].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 886
		bodyWheelModel[27].setRotationPoint(82.5F, -17F, -41F);
		
		bodyWheelModel[28].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 887
		bodyWheelModel[28].setRotationPoint(82.5F, -8F, -41F);
		
		bodyWheelModel[29].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 888
		bodyWheelModel[29].setRotationPoint(82.5F, 1F, -41F);
		
		bodyWheelModel[30].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 889
		bodyWheelModel[30].setRotationPoint(-223F, -25F, 21F);
		
		bodyWheelModel[31].addShapeBox(0F, 0F, 0F, 6, 7, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		bodyWheelModel[31].setRotationPoint(-223F, -23F, 21F);
		
		bodyWheelModel[32].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 891
		bodyWheelModel[32].setRotationPoint(-223F, -19F, 21F);
		
		bodyWheelModel[33].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 892
		bodyWheelModel[33].setRotationPoint(-221F, -18F, 24F);
		
		bodyWheelModel[34].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 893
		bodyWheelModel[34].setRotationPoint(-223F, -18F, 24F);
		
		bodyWheelModel[35].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 894
		bodyWheelModel[35].setRotationPoint(-219F, -18F, 24F);
		
		bodyWheelModel[36].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 895
		bodyWheelModel[36].setRotationPoint(-223F, -2F, 23F);
		
		bodyWheelModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 896
		bodyWheelModel[37].setRotationPoint(-223F, -4F, 23F);
		
		bodyWheelModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 897
		bodyWheelModel[38].setRotationPoint(-223F, 1F, 23F);
		
		bodyWheelModel[39].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		bodyWheelModel[39].setRotationPoint(-233.5F, -8F, 32F);
		
		bodyWheelModel[40].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 899
		bodyWheelModel[40].setRotationPoint(-233.5F, -17F, 32F);
		
		bodyWheelModel[41].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 900
		bodyWheelModel[41].setRotationPoint(-233.5F, 1F, 32F);
		
		bodyWheelModel[42].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 901
		bodyWheelModel[42].setRotationPoint(-233.5F, -8F, 14F);
		
		bodyWheelModel[43].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 902
		bodyWheelModel[43].setRotationPoint(-233.5F, -17F, 14F);
		
		bodyWheelModel[44].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 903
		bodyWheelModel[44].setRotationPoint(-233.5F, 1F, 14F);
		
		bodyWheelModel[45].addShapeBox(0F, 0F, 0F, 6, 7, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		bodyWheelModel[45].setRotationPoint(93F, -23F, 21F);
		
		bodyWheelModel[46].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		bodyWheelModel[46].setRotationPoint(93F, -25F, 21F);
		
		bodyWheelModel[47].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 906
		bodyWheelModel[47].setRotationPoint(93F, -19F, 21F);
		
		bodyWheelModel[48].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 907
		bodyWheelModel[48].setRotationPoint(93F, -18F, 24F);
		
		bodyWheelModel[49].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		bodyWheelModel[49].setRotationPoint(95F, -18F, 24F);
		
		bodyWheelModel[50].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 909
		bodyWheelModel[50].setRotationPoint(97F, -18F, 24F);
		
		bodyWheelModel[51].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		bodyWheelModel[51].setRotationPoint(93F, -4F, 23F);
		
		bodyWheelModel[52].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyWheelModel[52].setRotationPoint(93F, -2F, 23F);
		
		bodyWheelModel[53].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 912
		bodyWheelModel[53].setRotationPoint(93F, 1F, 23F);
		
		bodyWheelModel[54].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 913
		bodyWheelModel[54].setRotationPoint(82.5F, -17F, 14F);
		
		bodyWheelModel[55].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 914
		bodyWheelModel[55].setRotationPoint(82.5F, -8F, 14F);
		
		bodyWheelModel[56].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 915
		bodyWheelModel[56].setRotationPoint(82.5F, 1F, 14F);
		
		bodyWheelModel[57].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 916
		bodyWheelModel[57].setRotationPoint(82.5F, -17F, 32F);
		
		bodyWheelModel[58].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		bodyWheelModel[58].setRotationPoint(82.5F, -8F, 32F);
		
		bodyWheelModel[59].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 918
		bodyWheelModel[59].setRotationPoint(82.5F, 1F, 32F);
		
		bodyWheelModel[60].addShapeBox(0F, 0F, 0F, 58, 17, 7, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, -2F, 0F, -17F, -2F, 0F, -17F, 0F, -5F, -23F, 0F, -5F); // Box 919
		bodyWheelModel[60].setRotationPoint(-220.5F, -15F, -52F);
		
		bodyWheelModel[61].addShapeBox(0F, 0F, 0F, 58, 17, 7, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, -2F, 0F, -17F, -2F, 0F, -17F, 0F, -5F, -23F, 0F, -5F); // Box 920
		bodyWheelModel[61].setRotationPoint(96.5F, -15F, -52F);
		
		bodyWheelModel[62].addShapeBox(0F, 0F, 0F, 58, 13, 20, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -11F, 0F, 0F, -11F, 0F); // Box 921
		bodyWheelModel[62].setRotationPoint(96.5F, -26F, -47F);
		
		bodyWheelModel[63].addShapeBox(0F, 0F, 0F, 58, 13, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		bodyWheelModel[63].setRotationPoint(-279.5F, -26F, 27F);
		
		bodyWheelModel[64].addShapeBox(0F, 0F, 0F, 58, 17, 7, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, -23F, 0F, -5F, -17F, 0F, -5F, -17F, -2F, 0F, -23F, -2F, 0F); // Box 923
		bodyWheelModel[64].setRotationPoint(-279.5F, -15F, 45F);
		
		bodyWheelModel[65].addShapeBox(0F, 0F, 0F, 58, 17, 7, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, -23F, 0F, -5F, -17F, 0F, -5F, -17F, -2F, 0F, -23F, -2F, 0F); // Box 926
		bodyWheelModel[65].setRotationPoint(38.5F, -15F, 45F);
		
		bodyWheelModel[66].addShapeBox(0F, 0F, 0F, 58, 13, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		bodyWheelModel[66].setRotationPoint(38.5F, -26F, 27F);
		
		bodyWheelModel[67].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		bodyWheelModel[67].setRotationPoint(-233.5F, -17F, -41F);
	}
	
	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Box 932
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Box 933
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Box 934
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 16, 1420, textureX, textureY); // Box 935
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 16, 1403, textureX, textureY); // Box 936
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 16, 1403, textureX, textureY); // Box 937
		
		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 932
		leftWingWheelModel[0].setRotationPoint(64F, -66F, -446F);
		
		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 933
		leftWingWheelModel[1].setRotationPoint(63F, -66F, -446F);
		
		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 934
		leftWingWheelModel[2].setRotationPoint(65F, -66F, -446F);
		
		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 935
		leftWingWheelModel[3].setRotationPoint(55F, -2F, -447F);
		
		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 936
		leftWingWheelModel[4].setRotationPoint(55F, -8F, -447F);
		
		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 937
		leftWingWheelModel[5].setRotationPoint(55F, 4F, -447F);
	}
	
	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Box 938
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Box 939
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Box 940
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 16, 1420, textureX, textureY); // Box 941
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 16, 1403, textureX, textureY); // Box 942
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 16, 1403, textureX, textureY); // Box 943
		
		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 938
		rightWingWheelModel[0].setRotationPoint(64F, -66F, 443F);
		
		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 939
		rightWingWheelModel[1].setRotationPoint(63F, -66F, 443F);
		
		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 940
		rightWingWheelModel[2].setRotationPoint(65F, -66F, 443F);
		
		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 941
		rightWingWheelModel[3].setRotationPoint(55.5F, -2F, 442F);
		
		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		rightWingWheelModel[4].setRotationPoint(55.5F, -8F, 442F);
		
		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 943
		rightWingWheelModel[5].setRotationPoint(55.5F, 4F, 442F);
	}
}
