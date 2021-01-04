//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BMWR75
// Model Creator: 
// Created on: 10.08.2015 - 17:33:36
// Last changed on: 10.08.2015 - 17:33:36

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelSdkFz2 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSdkFz2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[242];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 219, 231, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 126, 24, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 210, 235, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 123
		bodyModel[33] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 129
		bodyModel[34] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 130
		bodyModel[35] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 131
		bodyModel[36] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 132
		bodyModel[37] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 134
		bodyModel[38] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 281
		bodyModel[39] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 282
		bodyModel[40] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 283
		bodyModel[41] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 284
		bodyModel[42] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 285
		bodyModel[43] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 286
		bodyModel[44] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 141
		bodyModel[45] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 221
		bodyModel[46] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 222
		bodyModel[47] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 223
		bodyModel[48] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 224
		bodyModel[49] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 226
		bodyModel[50] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 227
		bodyModel[51] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 228
		bodyModel[52] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 229
		bodyModel[53] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 254
		bodyModel[54] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 255
		bodyModel[55] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 256
		bodyModel[56] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 257
		bodyModel[57] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 258
		bodyModel[58] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 259
		bodyModel[59] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 172
		bodyModel[60] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 173
		bodyModel[61] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 174
		bodyModel[62] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 175
		bodyModel[63] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 176
		bodyModel[64] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 177
		bodyModel[65] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 179
		bodyModel[66] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 180
		bodyModel[67] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 182
		bodyModel[68] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 183
		bodyModel[69] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 190
		bodyModel[70] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 191
		bodyModel[71] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 192
		bodyModel[72] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 193
		bodyModel[73] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 194
		bodyModel[74] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 195
		bodyModel[75] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 196
		bodyModel[76] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 197
		bodyModel[77] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 198
		bodyModel[78] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 199
		bodyModel[79] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 200
		bodyModel[80] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 201
		bodyModel[81] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 202
		bodyModel[82] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 205
		bodyModel[83] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 206
		bodyModel[84] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 207
		bodyModel[85] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 208
		bodyModel[86] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 209
		bodyModel[87] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 210
		bodyModel[88] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 217
		bodyModel[89] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 218
		bodyModel[90] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 219
		bodyModel[91] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 221
		bodyModel[92] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 222
		bodyModel[93] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 223
		bodyModel[94] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 224
		bodyModel[95] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 225
		bodyModel[96] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 226
		bodyModel[97] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 227
		bodyModel[98] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 228
		bodyModel[99] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 229
		bodyModel[100] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 230
		bodyModel[101] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 231
		bodyModel[102] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 232
		bodyModel[103] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 233
		bodyModel[104] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 234
		bodyModel[105] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 235
		bodyModel[106] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 236
		bodyModel[107] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 237
		bodyModel[108] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 238
		bodyModel[109] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 239
		bodyModel[110] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 240
		bodyModel[111] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 250
		bodyModel[112] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 252
		bodyModel[113] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 253
		bodyModel[114] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 254
		bodyModel[115] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 255
		bodyModel[116] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 256
		bodyModel[117] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 257
		bodyModel[118] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 258
		bodyModel[119] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 259
		bodyModel[120] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 260
		bodyModel[121] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 261
		bodyModel[122] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 262
		bodyModel[123] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 263
		bodyModel[124] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 381
		bodyModel[125] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 382
		bodyModel[126] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 383
		bodyModel[127] = new ModelRendererTurbo(this, 10, 182, textureX, textureY); // Box 323
		bodyModel[128] = new ModelRendererTurbo(this, 25, 180, textureX, textureY); // Box 324
		bodyModel[129] = new ModelRendererTurbo(this, 10, 190, textureX, textureY); // Box 325
		bodyModel[130] = new ModelRendererTurbo(this, 39, 182, textureX, textureY); // Box 326
		bodyModel[131] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 327
		bodyModel[132] = new ModelRendererTurbo(this, 35, 198, textureX, textureY); // Box 328
		bodyModel[133] = new ModelRendererTurbo(this, 29, 198, textureX, textureY); // Box 329
		bodyModel[134] = new ModelRendererTurbo(this, 48, 192, textureX, textureY); // Box 330
		bodyModel[135] = new ModelRendererTurbo(this, 48, 197, textureX, textureY); // Box 331
		bodyModel[136] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 332
		bodyModel[137] = new ModelRendererTurbo(this, 48, 202, textureX, textureY); // Box 333
		bodyModel[138] = new ModelRendererTurbo(this, 48, 188, textureX, textureY); // Box 334
		bodyModel[139] = new ModelRendererTurbo(this, 48, 209, textureX, textureY); // Box 335
		bodyModel[140] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 336
		bodyModel[141] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 337
		bodyModel[142] = new ModelRendererTurbo(this, 355, 217, textureX, textureY); // Box 106
		bodyModel[143] = new ModelRendererTurbo(this, 355, 217, textureX, textureY); // Box 107
		bodyModel[144] = new ModelRendererTurbo(this, 355, 160, textureX, textureY); // Box 2
		bodyModel[145] = new ModelRendererTurbo(this, 355, 160, textureX, textureY); // Box 400
		bodyModel[146] = new ModelRendererTurbo(this, 355, 217, textureX, textureY); // Box 401
		bodyModel[147] = new ModelRendererTurbo(this, 355, 217, textureX, textureY); // Box 403
		bodyModel[148] = new ModelRendererTurbo(this, 430, 86, textureX, textureY); // Box 428
		bodyModel[149] = new ModelRendererTurbo(this, 322, 273, textureX, textureY); // Box 429
		bodyModel[150] = new ModelRendererTurbo(this, 322, 273, textureX, textureY); // Box 430
		bodyModel[151] = new ModelRendererTurbo(this, 322, 109, textureX, textureY); // Box 432
		bodyModel[152] = new ModelRendererTurbo(this, 304, 81, textureX, textureY); // Box 433
		bodyModel[153] = new ModelRendererTurbo(this, 322, 109, textureX, textureY); // Box 434
		bodyModel[154] = new ModelRendererTurbo(this, 322, 92, textureX, textureY); // Box 435
		bodyModel[155] = new ModelRendererTurbo(this, 322, 101, textureX, textureY); // Box 436
		bodyModel[156] = new ModelRendererTurbo(this, 322, 101, textureX, textureY); // Box 437
		bodyModel[157] = new ModelRendererTurbo(this, 322, 120, textureX, textureY); // Box 438
		bodyModel[158] = new ModelRendererTurbo(this, 322, 92, textureX, textureY); // Box 439
		bodyModel[159] = new ModelRendererTurbo(this, 322, 120, textureX, textureY); // Box 440
		bodyModel[160] = new ModelRendererTurbo(this, 326, 299, textureX, textureY); // Box 441
		bodyModel[161] = new ModelRendererTurbo(this, 443, 53, textureX, textureY); // Box 442
		bodyModel[162] = new ModelRendererTurbo(this, 341, 117, textureX, textureY); // Box 443
		bodyModel[163] = new ModelRendererTurbo(this, 443, 53, textureX, textureY); // Box 444
		bodyModel[164] = new ModelRendererTurbo(this, 341, 117, textureX, textureY); // Box 445
		bodyModel[165] = new ModelRendererTurbo(this, 417, 61, textureX, textureY); // Box 446
		bodyModel[166] = new ModelRendererTurbo(this, 396, 238, textureX, textureY); // Box 457
		bodyModel[167] = new ModelRendererTurbo(this, 429, 181, textureX, textureY); // Box 458
		bodyModel[168] = new ModelRendererTurbo(this, 385, 91, textureX, textureY); // Box 459
		bodyModel[169] = new ModelRendererTurbo(this, 385, 91, textureX, textureY); // Box 460
		bodyModel[170] = new ModelRendererTurbo(this, 433, 11, textureX, textureY); // Box 461
		bodyModel[171] = new ModelRendererTurbo(this, 342, 156, textureX, textureY); // Box 462
		bodyModel[172] = new ModelRendererTurbo(this, 472, 87, textureX, textureY); // Box 463
		bodyModel[173] = new ModelRendererTurbo(this, 355, 96, textureX, textureY); // Box 464
		bodyModel[174] = new ModelRendererTurbo(this, 355, 96, textureX, textureY); // Box 465
		bodyModel[175] = new ModelRendererTurbo(this, 355, 96, textureX, textureY); // Box 466
		bodyModel[176] = new ModelRendererTurbo(this, 355, 96, textureX, textureY); // Box 467
		bodyModel[177] = new ModelRendererTurbo(this, 424, 38, textureX, textureY); // Box 470
		bodyModel[178] = new ModelRendererTurbo(this, 443, 38, textureX, textureY); // Box 471
		bodyModel[179] = new ModelRendererTurbo(this, 466, 38, textureX, textureY); // Box 472
		bodyModel[180] = new ModelRendererTurbo(this, 396, 171, textureX, textureY); // Box 473
		bodyModel[181] = new ModelRendererTurbo(this, 396, 171, textureX, textureY); // Box 474
		bodyModel[182] = new ModelRendererTurbo(this, 484, 38, textureX, textureY); // Box 475
		bodyModel[183] = new ModelRendererTurbo(this, 484, 38, textureX, textureY); // Box 476
		bodyModel[184] = new ModelRendererTurbo(this, 484, 38, textureX, textureY); // Box 477
		bodyModel[185] = new ModelRendererTurbo(this, 484, 38, textureX, textureY); // Box 478
		bodyModel[186] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 479
		bodyModel[187] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 480
		bodyModel[188] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 481
		bodyModel[189] = new ModelRendererTurbo(this, 484, 38, textureX, textureY); // Box 482
		bodyModel[190] = new ModelRendererTurbo(this, 484, 38, textureX, textureY); // Box 483
		bodyModel[191] = new ModelRendererTurbo(this, 484, 38, textureX, textureY); // Box 484
		bodyModel[192] = new ModelRendererTurbo(this, 484, 38, textureX, textureY); // Box 485
		bodyModel[193] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 486
		bodyModel[194] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 487
		bodyModel[195] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 488
		bodyModel[196] = new ModelRendererTurbo(this, 304, 167, textureX, textureY); // Box 490
		bodyModel[197] = new ModelRendererTurbo(this, 304, 189, textureX, textureY); // Box 491
		bodyModel[198] = new ModelRendererTurbo(this, 304, 162, textureX, textureY); // Box 492
		bodyModel[199] = new ModelRendererTurbo(this, 378, 200, textureX, textureY); // Box 493
		bodyModel[200] = new ModelRendererTurbo(this, 362, 200, textureX, textureY); // Box 494
		bodyModel[201] = new ModelRendererTurbo(this, 362, 200, textureX, textureY); // Box 495
		bodyModel[202] = new ModelRendererTurbo(this, 304, 137, textureX, textureY); // Box 496
		bodyModel[203] = new ModelRendererTurbo(this, 304, 167, textureX, textureY); // Box 497
		bodyModel[204] = new ModelRendererTurbo(this, 304, 189, textureX, textureY); // Box 498
		bodyModel[205] = new ModelRendererTurbo(this, 304, 162, textureX, textureY); // Box 499
		bodyModel[206] = new ModelRendererTurbo(this, 378, 200, textureX, textureY); // Box 500
		bodyModel[207] = new ModelRendererTurbo(this, 362, 200, textureX, textureY); // Box 501
		bodyModel[208] = new ModelRendererTurbo(this, 362, 200, textureX, textureY); // Box 502
		bodyModel[209] = new ModelRendererTurbo(this, 304, 81, textureX, textureY); // Box 503
		bodyModel[210] = new ModelRendererTurbo(this, 341, 209, textureX, textureY); // Box 504
		bodyModel[211] = new ModelRendererTurbo(this, 341, 209, textureX, textureY); // Box 505
		bodyModel[212] = new ModelRendererTurbo(this, 439, 217, textureX, textureY); // Box 506
		bodyModel[213] = new ModelRendererTurbo(this, 430, 248, textureX, textureY); // Box 508
		bodyModel[214] = new ModelRendererTurbo(this, 430, 248, textureX, textureY); // Box 509
		bodyModel[215] = new ModelRendererTurbo(this, 304, 117, textureX, textureY); // Box 513
		bodyModel[216] = new ModelRendererTurbo(this, 304, 128, textureX, textureY); // Box 514
		bodyModel[217] = new ModelRendererTurbo(this, 304, 112, textureX, textureY); // Box 515
		bodyModel[218] = new ModelRendererTurbo(this, 304, 128, textureX, textureY); // Box 516
		bodyModel[219] = new ModelRendererTurbo(this, 304, 112, textureX, textureY); // Box 517
		bodyModel[220] = new ModelRendererTurbo(this, 307, 112, textureX, textureY); // Box 518
		bodyModel[221] = new ModelRendererTurbo(this, 304, 137, textureX, textureY); // Box 519
		bodyModel[222] = new ModelRendererTurbo(this, 304, 128, textureX, textureY); // Box 520
		bodyModel[223] = new ModelRendererTurbo(this, 304, 128, textureX, textureY); // Box 521
		bodyModel[224] = new ModelRendererTurbo(this, 304, 112, textureX, textureY); // Box 522
		bodyModel[225] = new ModelRendererTurbo(this, 307, 112, textureX, textureY); // Box 523
		bodyModel[226] = new ModelRendererTurbo(this, 304, 112, textureX, textureY); // Box 524
		bodyModel[227] = new ModelRendererTurbo(this, 304, 117, textureX, textureY); // Box 525
		bodyModel[228] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 308
		bodyModel[229] = new ModelRendererTurbo(this, 309, 88, textureX, textureY); // Box 309
		bodyModel[230] = new ModelRendererTurbo(this, 304, 300, textureX, textureY); // Box 310
		bodyModel[231] = new ModelRendererTurbo(this, 304, 300, textureX, textureY); // Box 311
		bodyModel[232] = new ModelRendererTurbo(this, 292, 104, textureX, textureY); // Box 312
		bodyModel[233] = new ModelRendererTurbo(this, 292, 97, textureX, textureY); // Box 313
		bodyModel[234] = new ModelRendererTurbo(this, 292, 89, textureX, textureY); // Box 314
		bodyModel[235] = new ModelRendererTurbo(this, 292, 104, textureX, textureY); // Box 318
		bodyModel[236] = new ModelRendererTurbo(this, 292, 97, textureX, textureY); // Box 319
		bodyModel[237] = new ModelRendererTurbo(this, 292, 89, textureX, textureY); // Box 320
		bodyModel[238] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 3
		bodyModel[239] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 322
		bodyModel[240] = new ModelRendererTurbo(this, 322, 101, textureX, textureY); // Box 323
		bodyModel[241] = new ModelRendererTurbo(this, 322, 101, textureX, textureY); // Box 324

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(6F, -11F, -4.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99999F, -2F, 0F, -0.99999F, -2F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(6F, -8F, -4.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 2
		bodyModel[2].setRotationPoint(-5F, -7F, -4.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F, 0F, -2.99999F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2.999999F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 3
		bodyModel[3].setRotationPoint(-5F, -11F, -4.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-12.5F, -8F, -4.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-7.5F, -9F, -2.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(10F, -8F, -2.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-10F, 3F, -4.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-4F, -4F, -3.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(4F, -5F, -2.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-8F, -5F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-11F, -3F, -3.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(8F, -6F, -4.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(8F, -4F, -4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 16
		bodyModel[14].setRotationPoint(8F, 0F, -4.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(4F, -2F, 3.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(4F, -1F, 3.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(4F, 0F, 3.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(0F, 0F, 3.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(0F, -1F, 3.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(0F, -2F, 3.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-9F, -1F, 3.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-9F, -5F, 3.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-9F, -5F, -3.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-11F, 2F, 3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-6F, 0F, 3.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-2F, -5F, -0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F); // Box 30
		bodyModel[27].setRotationPoint(-11.5F, -7F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(9F, -7F, 1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 33
		bodyModel[29].setRotationPoint(9F, -7F, -4.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(-11F, 2F, -4.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(9F, -12F, -1.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[32].setRotationPoint(-10F, -4F, -2.5F);

		bodyModel[33].addShapeBox(-2.5F, -7.5F, -3F, 6, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[33].setRotationPoint(17F, 2F, 0.5F);

		bodyModel[34].addShapeBox(2.5F, -7.5F, -3F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[34].setRotationPoint(18F, 2F, 0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[35].setRotationPoint(7F, -15F, -0.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[36].setRotationPoint(7F, -15.01F, -3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 134
		bodyModel[37].setRotationPoint(7F, -16.01F, 3.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 281
		bodyModel[38].setRotationPoint(11.5F, -13F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[39].setRotationPoint(12.5F, -13F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[40].setRotationPoint(12.5F, -13F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 284
		bodyModel[41].setRotationPoint(11.5F, -13F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F); // Box 285
		bodyModel[42].setRotationPoint(11.5F, -13F, 1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 286
		bodyModel[43].setRotationPoint(12.5F, -13F, 1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[44].setRotationPoint(11F, -12F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[45].setRotationPoint(7F, -16.01F, -6.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 222
		bodyModel[46].setRotationPoint(7F, -16.01F, 6.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[47].setRotationPoint(7F, -16.01F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 224
		bodyModel[48].setRotationPoint(-8.5F, -8F, -2.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[49].setRotationPoint(9F, -12F, -3F);
		bodyModel[49].rotateAngleZ = 0.54105207F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 227
		bodyModel[50].setRotationPoint(9.5F, -12F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 228
		bodyModel[51].setRotationPoint(-11.5F, -7F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 229
		bodyModel[52].setRotationPoint(-11.5F, -6F, -1F);

		bodyModel[53].addShapeBox(0F, 9.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 254
		bodyModel[53].setRotationPoint(9F, -12F, -3F);
		bodyModel[53].rotateAngleZ = 0.54105207F;

		bodyModel[54].addShapeBox(0F, 10.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 255
		bodyModel[54].setRotationPoint(9F, -12F, -3F);
		bodyModel[54].rotateAngleZ = 0.54105207F;

		bodyModel[55].addShapeBox(0F, 11.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 256
		bodyModel[55].setRotationPoint(9F, -12F, -3F);
		bodyModel[55].rotateAngleZ = 0.54105207F;

		bodyModel[56].addShapeBox(0F, 12.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 257
		bodyModel[56].setRotationPoint(9F, -12F, -3F);
		bodyModel[56].rotateAngleZ = 0.54105207F;

		bodyModel[57].addShapeBox(0F, 13.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 258
		bodyModel[57].setRotationPoint(9F, -12F, -3F);
		bodyModel[57].rotateAngleZ = 0.54105207F;

		bodyModel[58].addShapeBox(0F, 14.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 259
		bodyModel[58].setRotationPoint(9F, -12F, -3F);
		bodyModel[58].rotateAngleZ = 0.54105207F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[59].setRotationPoint(3F, -11F, -4.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[60].setRotationPoint(3F, -7F, -4.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[61].setRotationPoint(5F, -1F, 4.8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[62].setRotationPoint(1F, -1F, 4.8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 176
		bodyModel[63].setRotationPoint(-11.5F, -5F, -1F);

		bodyModel[64].addShapeBox(2.5F, -7.5F, -3F, 6, 5, 5, 0F, -6F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, -3F, 0F); // Box 177
		bodyModel[64].setRotationPoint(6F, 2F, 0.5F);

		bodyModel[65].addShapeBox(-2.5F, -7.5F, -3F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[65].setRotationPoint(17F, 1.5F, 1F);

		bodyModel[66].addShapeBox(2.5F, -7.5F, -3F, 6, 5, 1, 0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, -3F, 0F); // Box 180
		bodyModel[66].setRotationPoint(6F, 1.5F, 1F);

		bodyModel[67].addShapeBox(-2.5F, -7.5F, -3F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[67].setRotationPoint(17F, 1.5F, 4F);

		bodyModel[68].addShapeBox(2.5F, -7.5F, -3F, 6, 5, 1, 0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, -3F, 0F); // Box 183
		bodyModel[68].setRotationPoint(6F, 1.5F, 4F);

		bodyModel[69].addShapeBox(0F, 1F, 1F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 190
		bodyModel[69].setRotationPoint(-2.5F, -8.5F, 0.5F);
		bodyModel[69].rotateAngleZ = 1.97222205F;

		bodyModel[70].addShapeBox(0F, 1F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[70].setRotationPoint(-2.5F, -8.5F, -1.5F);
		bodyModel[70].rotateAngleZ = 1.97222205F;

		bodyModel[71].addShapeBox(0F, 1F, 0F, 2, 5, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[71].setRotationPoint(-2.5F, -8.5F, -2.5F);
		bodyModel[71].rotateAngleZ = 1.97222205F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[72].setRotationPoint(-9F, -1F, -4.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[73].setRotationPoint(-9F, -5F, -4.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[74].setRotationPoint(-8F, -2.51F, -4.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[75].setRotationPoint(-0.5F, -2.5F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[76].setRotationPoint(-0.5F, -1.5F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 198
		bodyModel[77].setRotationPoint(-0.5F, 0.5F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 199
		bodyModel[78].setRotationPoint(3.5F, 0.5F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[79].setRotationPoint(3.51F, -1.5F, 4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[80].setRotationPoint(3.5F, -2.5F, 4F);

		bodyModel[81].addShapeBox(0F, -0.2F, 0F, 1, 1, 1, 0F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F); // Box 202
		bodyModel[81].setRotationPoint(9F, -12F, -3F);
		bodyModel[81].rotateAngleZ = 0.54105207F;

		bodyModel[82].addShapeBox(0F, 1.2F, 0F, 1, 1, 1, 0F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F); // Box 205
		bodyModel[82].setRotationPoint(9F, -12F, -3F);
		bodyModel[82].rotateAngleZ = 0.54105207F;

		bodyModel[83].addShapeBox(2.5F, -7.5F, -3F, 2, 3, 5, 0F, 0F, -0.5F, 0F, 0.2F, -3.5F, 0F, 0.2F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[83].setRotationPoint(21F, 3F, 0.5F);

		bodyModel[84].addShapeBox(2.5F, -7.5F, -3F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[84].setRotationPoint(18F, 1.5F, 1F);

		bodyModel[85].addShapeBox(2.5F, -7.5F, -3F, 2, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[85].setRotationPoint(21F, 2.5F, 1F);

		bodyModel[86].addShapeBox(2.5F, -7.5F, -3F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[86].setRotationPoint(18F, 1.5F, 4F);

		bodyModel[87].addShapeBox(2.5F, -7.5F, -3F, 2, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[87].setRotationPoint(21F, 2.5F, 4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[88].setRotationPoint(3F, -8F, -4.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 218
		bodyModel[89].setRotationPoint(-5F, -8F, -4.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 219
		bodyModel[90].setRotationPoint(-13.5F, -8F, -3.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 221
		bodyModel[91].setRotationPoint(2.5F, -3.5F, 4.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[92].setRotationPoint(5.5F, -6.5F, 4.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 223
		bodyModel[93].setRotationPoint(2.5F, -3.5F, -7.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[94].setRotationPoint(5.5F, -6.5F, -7.5F);

		bodyModel[95].addShapeBox(0F, 0.1F, 0F, 1, 1, 16, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 225
		bodyModel[95].setRotationPoint(5.2F, -3.5F, -8F);
		bodyModel[95].rotateAngleZ = 0.78539816F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[96].setRotationPoint(4F, -2F, -6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[97].setRotationPoint(4F, -1F, -6.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 228
		bodyModel[98].setRotationPoint(4F, 0F, -6.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 229
		bodyModel[99].setRotationPoint(0F, 0F, -6.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[100].setRotationPoint(0F, -1F, -6.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[101].setRotationPoint(0F, -2F, -6.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[102].setRotationPoint(5F, -1F, -6.8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[103].setRotationPoint(1F, -1F, -6.8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[104].setRotationPoint(-0.5F, -2.5F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[105].setRotationPoint(-0.5F, -1.5F, -5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[106].setRotationPoint(-0.5F, 0.5F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 237
		bodyModel[107].setRotationPoint(3.5F, 0.5F, -5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[108].setRotationPoint(3.51F, -1.5F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[109].setRotationPoint(3.5F, -2.5F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[110].setRotationPoint(-8F, -2.51F, 3.5F);

		bodyModel[111].addShapeBox(0F, 15F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[111].setRotationPoint(9F, -12F, -3F);
		bodyModel[111].rotateAngleZ = 0.54105207F;

		bodyModel[112].addShapeBox(0F, 10F, 0F, 1, 5, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 252
		bodyModel[112].setRotationPoint(9F, -12F, -3F);
		bodyModel[112].rotateAngleZ = 0.54105207F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[113].setRotationPoint(9F, -12F, 2F);
		bodyModel[113].rotateAngleZ = 0.54105207F;

		bodyModel[114].addShapeBox(0F, 9.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 254
		bodyModel[114].setRotationPoint(9F, -12F, 2F);
		bodyModel[114].rotateAngleZ = 0.54105207F;

		bodyModel[115].addShapeBox(0F, 10.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 255
		bodyModel[115].setRotationPoint(9F, -12F, 2F);
		bodyModel[115].rotateAngleZ = 0.54105207F;

		bodyModel[116].addShapeBox(0F, 11.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 256
		bodyModel[116].setRotationPoint(9F, -12F, 2F);
		bodyModel[116].rotateAngleZ = 0.54105207F;

		bodyModel[117].addShapeBox(0F, 12.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 257
		bodyModel[117].setRotationPoint(9F, -12F, 2F);
		bodyModel[117].rotateAngleZ = 0.54105207F;

		bodyModel[118].addShapeBox(0F, 13.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 258
		bodyModel[118].setRotationPoint(9F, -12F, 2F);
		bodyModel[118].rotateAngleZ = 0.54105207F;

		bodyModel[119].addShapeBox(0F, 14.5F, 0F, 1, 1, 1, 0F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 259
		bodyModel[119].setRotationPoint(9F, -12F, 2F);
		bodyModel[119].rotateAngleZ = 0.54105207F;

		bodyModel[120].addShapeBox(0F, -0.2F, 0F, 1, 1, 1, 0F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F); // Box 260
		bodyModel[120].setRotationPoint(9F, -12F, 2F);
		bodyModel[120].rotateAngleZ = 0.54105207F;

		bodyModel[121].addShapeBox(0F, 1.2F, 0F, 1, 1, 1, 0F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F); // Box 261
		bodyModel[121].setRotationPoint(9F, -12F, 2F);
		bodyModel[121].rotateAngleZ = 0.54105207F;

		bodyModel[122].addShapeBox(0F, 15F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[122].setRotationPoint(9F, -12F, 2F);
		bodyModel[122].rotateAngleZ = 0.54105207F;

		bodyModel[123].addShapeBox(0F, 10F, 0F, 1, 5, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[123].setRotationPoint(9F, -12F, 2F);
		bodyModel[123].rotateAngleZ = 0.54105207F;

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 381
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 382
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-3F, 0F, -1F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[127].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[127].rotateAngleY = -0.19198622F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[128].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[128].rotateAngleY = -0.19198622F;

		bodyModel[129].addShapeBox(-4F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[129].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[129].rotateAngleY = -0.19198622F;

		bodyModel[130].addShapeBox(-5F, 0F, 1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[130].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[130].rotateAngleY = -0.19198622F;

		bodyModel[131].addShapeBox(-6F, 0F, 4F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[131].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[131].rotateAngleY = -0.19198622F;

		bodyModel[132].addShapeBox(-6F, 0F, 2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[132].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[132].rotateAngleY = -0.19198622F;

		bodyModel[133].addShapeBox(-3F, 0F, 5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[133].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[133].rotateAngleY = -0.19198622F;

		bodyModel[134].addShapeBox(-7F, 0F, 5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[134].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[134].rotateAngleY = -0.19198622F;

		bodyModel[135].addShapeBox(-8F, 0F, 6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[135].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[135].rotateAngleY = -0.19198622F;

		bodyModel[136].addShapeBox(-9F, 0F, 7F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[136].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[136].rotateAngleY = -0.19198622F;

		bodyModel[137].addShapeBox(-10F, 0F, 8F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[137].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[137].rotateAngleY = -0.19198622F;

		bodyModel[138].addShapeBox(-11F, 0F, 9F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[138].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[138].rotateAngleY = -0.19198622F;

		bodyModel[139].addShapeBox(-13F, 0F, 10F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[139].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[139].rotateAngleY = -0.19198622F;

		bodyModel[140].addShapeBox(-13F, 0F, 11F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[140].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[140].rotateAngleY = -0.19198622F;

		bodyModel[141].addShapeBox(-12F, 0F, 12F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[141].setRotationPoint(-15F, -17.5F, -7F);
		bodyModel[141].rotateAngleY = -0.19198622F;

		bodyModel[142].addBox(0F, 0F, 0F, 2, 2, 25, 0F); // Box 106
		bodyModel[142].setRotationPoint(6.5F, -1F, -12.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 2, 25, 0F); // Box 107
		bodyModel[143].setRotationPoint(-21.5F, 2F, -12.5F);

		bodyModel[144].addBox(-1F, -1F, 0F, 2, 2, 28, 0F); // Box 2
		bodyModel[144].setRotationPoint(-12F, 3F, -14F);

		bodyModel[145].addBox(-1F, -1F, 0F, 2, 2, 28, 0F); // Box 400
		bodyModel[145].setRotationPoint(-29.5F, 3F, -14F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 2, 25, 0F); // Box 401
		bodyModel[146].setRotationPoint(-39F, 2F, -12.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 2, 25, 0F); // Box 403
		bodyModel[147].setRotationPoint(-4.5F, 2F, -12.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 18, 18, 0F); // Box 428
		bodyModel[148].setRotationPoint(6.5F, -12.5F, -9F);

		bodyModel[149].addBox(0F, 0F, 0F, 48, 18, 1, 0F); // Box 429
		bodyModel[149].setRotationPoint(-41.5F, -12.5F, -9F);

		bodyModel[150].addBox(0F, 0F, 0F, 48, 18, 1, 0F); // Box 430
		bodyModel[150].setRotationPoint(-41.5F, -12.5F, 8F);

		bodyModel[151].addBox(0F, 0F, 0F, 51, 3, 1, 0F); // Box 432
		bodyModel[151].setRotationPoint(-44.5F, -11.5F, 13F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 51, 1, 5, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 433
		bodyModel[152].setRotationPoint(-44.5F, -12.5F, -14F);

		bodyModel[153].addBox(0F, 0F, 0F, 51, 3, 1, 0F); // Box 434
		bodyModel[153].setRotationPoint(-44.5F, -11.5F, -14F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[154].setRotationPoint(6.5F, -10.5F, 9F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 436
		bodyModel[155].setRotationPoint(5.5F, -11.5F, 9F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 437
		bodyModel[156].setRotationPoint(5.5F, -11.5F, -13F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[157].setRotationPoint(11.5F, -9.5F, 9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[158].setRotationPoint(6.5F, -10.5F, -14F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[159].setRotationPoint(11.5F, -9.5F, -14F);

		bodyModel[160].addBox(0F, 0F, 0F, 52, 1, 16, 0F); // Box 441
		bodyModel[160].setRotationPoint(-45.5F, 1.5F, -8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[161].setRotationPoint(-44.5F, -8.5F, -14F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[162].setRotationPoint(-44.5F, -6.5F, -14F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[163].setRotationPoint(-44.5F, -8.5F, 13F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[164].setRotationPoint(-44.5F, -6.5F, 13F);

		bodyModel[165].addBox(0F, 0F, 0F, 27, 5, 16, 0F); // Box 446
		bodyModel[165].setRotationPoint(-42.5F, -3.5F, -8F);

		bodyModel[166].addBox(0F, 0F, 0F, 9, 9, 16, 0F); // Box 457
		bodyModel[166].setRotationPoint(-24.5F, -12.5F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 9, 4, 16, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[167].setRotationPoint(-24.5F, -16.5F, -8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[168].setRotationPoint(-24.5F, -17.5F, -13F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[169].setRotationPoint(-24.5F, -17.5F, 9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 461
		bodyModel[170].setRotationPoint(-36.5F, -6F, -8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 9, 16, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[171].setRotationPoint(-26.5F, -15F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 463
		bodyModel[172].setRotationPoint(-26.5F, -16F, -8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[173].setRotationPoint(-24.5F, -17.5F, 8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[174].setRotationPoint(-24.5F, -17.5F, 13F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[175].setRotationPoint(-24.5F, -17.5F, -9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[176].setRotationPoint(-24.5F, -17.5F, -14F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 10, 5, 0F); // Box 470
		bodyModel[177].setRotationPoint(-44.5F, -8.5F, -2.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[178].setRotationPoint(-44.5F, -11.5F, -2.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[179].setRotationPoint(-44.5F, -12.5F, -2.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F); // Box 473
		bodyModel[180].setRotationPoint(-44F, -12.5F, -14F);
		bodyModel[180].rotateAngleX = 1.25663706F;

		bodyModel[181].addShapeBox(0F, 0F, -5F, 19, 1, 5, 0F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F); // Box 474
		bodyModel[181].setRotationPoint(-44F, -12.5F, 14F);
		bodyModel[181].rotateAngleX = -1.25663706F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 475
		bodyModel[182].setRotationPoint(-44F, -12.5F, -14F);
		bodyModel[182].rotateAngleX = 1.25663706F;

		bodyModel[183].addShapeBox(6F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 476
		bodyModel[183].setRotationPoint(-44F, -12.5F, -14F);
		bodyModel[183].rotateAngleX = 1.25663706F;

		bodyModel[184].addShapeBox(12F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 477
		bodyModel[184].setRotationPoint(-44F, -12.5F, -14F);
		bodyModel[184].rotateAngleX = 1.25663706F;

		bodyModel[185].addShapeBox(18F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 478
		bodyModel[185].setRotationPoint(-44F, -12.5F, -14F);
		bodyModel[185].rotateAngleX = 1.25663706F;

		bodyModel[186].addShapeBox(7F, 0F, 4F, 5, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 479
		bodyModel[186].setRotationPoint(-44F, -12.5F, -14F);
		bodyModel[186].rotateAngleX = 1.25663706F;

		bodyModel[187].addShapeBox(13F, 0F, 4F, 5, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 480
		bodyModel[187].setRotationPoint(-44F, -12.5F, -14F);
		bodyModel[187].rotateAngleX = 1.25663706F;

		bodyModel[188].addShapeBox(1F, 0F, 4F, 5, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 481
		bodyModel[188].setRotationPoint(-44F, -12.5F, -14F);
		bodyModel[188].rotateAngleX = 1.25663706F;

		bodyModel[189].addShapeBox(0F, 0F, -5F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 482
		bodyModel[189].setRotationPoint(-44F, -12.5F, 14F);
		bodyModel[189].rotateAngleX = -1.25663706F;

		bodyModel[190].addShapeBox(6F, 0F, -5F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 483
		bodyModel[190].setRotationPoint(-44F, -12.5F, 14F);
		bodyModel[190].rotateAngleX = -1.25663706F;

		bodyModel[191].addShapeBox(12F, 0F, -5F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 484
		bodyModel[191].setRotationPoint(-44F, -12.5F, 14F);
		bodyModel[191].rotateAngleX = -1.25663706F;

		bodyModel[192].addShapeBox(18F, 0F, -5F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 485
		bodyModel[192].setRotationPoint(-44F, -12.5F, 14F);
		bodyModel[192].rotateAngleX = -1.25663706F;

		bodyModel[193].addShapeBox(13F, 0F, -5F, 5, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 486
		bodyModel[193].setRotationPoint(-44F, -12.5F, 14F);
		bodyModel[193].rotateAngleX = -1.25663706F;

		bodyModel[194].addShapeBox(7F, 0F, -5F, 5, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 487
		bodyModel[194].setRotationPoint(-44F, -12.5F, 14F);
		bodyModel[194].rotateAngleX = -1.25663706F;

		bodyModel[195].addShapeBox(1F, 0F, -5F, 5, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 488
		bodyModel[195].setRotationPoint(-44F, -12.5F, 14F);
		bodyModel[195].rotateAngleX = -1.25663706F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 490
		bodyModel[196].setRotationPoint(-43.5F, -18.7F, 10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -2.2F, -0.2F, 0.2F, -2.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 1.8F, -0.2F, 0.2F, 1.8F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 491
		bodyModel[197].setRotationPoint(-42.1F, -18.7F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 492
		bodyModel[198].setRotationPoint(-37.7F, -16.7F, 10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 493
		bodyModel[199].setRotationPoint(-30.7F, -16.5F, 10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 494
		bodyModel[200].setRotationPoint(-38F, -15.9F, 10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 495
		bodyModel[201].setRotationPoint(-34.5F, -15.9F, 10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 496
		bodyModel[202].setRotationPoint(-44.5F, -25.5F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 497
		bodyModel[203].setRotationPoint(-43.5F, -18.7F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -2.2F, -0.2F, 0.2F, -2.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 1.8F, -0.2F, 0.2F, 1.8F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 498
		bodyModel[204].setRotationPoint(-42.1F, -18.7F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 499
		bodyModel[205].setRotationPoint(-37.7F, -16.7F, -11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 500
		bodyModel[206].setRotationPoint(-30.7F, -16.5F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 501
		bodyModel[207].setRotationPoint(-38F, -15.9F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 502
		bodyModel[208].setRotationPoint(-34.5F, -15.9F, -11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 51, 1, 5, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 503
		bodyModel[209].setRotationPoint(-44.5F, -12.5F, 9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 51, 1, 5, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 504
		bodyModel[210].setRotationPoint(-44.5F, -9.5F, 9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 51, 1, 5, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 505
		bodyModel[211].setRotationPoint(-44.5F, -9.5F, -14F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 8, 2, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[212].setRotationPoint(-24.5F, -21F, -10F);
		bodyModel[212].rotateAngleY = -0.06981317F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 8, 1, 21, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[213].setRotationPoint(-24.5F, -22F, -10F);
		bodyModel[213].rotateAngleY = -0.06981317F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 8, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 509
		bodyModel[214].setRotationPoint(-24.5F, -19F, -10F);
		bodyModel[214].rotateAngleY = -0.06981317F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 513
		bodyModel[215].setRotationPoint(-24.5F, -25.5F, -11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -6.2F, -0.2F, 0F, -6.2F, -0.2F, 0F, 5.8F, -0.2F, 0F, 5.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 514
		bodyModel[216].setRotationPoint(-44.5F, -31.5F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, 2.8F, -0.2F, 0F, 2.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 515
		bodyModel[217].setRotationPoint(-44.5F, -32.5F, -5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 5.8F, -0.2F, 0F, 5.8F, -0.2F, 0F, -6.2F, -0.2F, 0F, -6.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 516
		bodyModel[218].setRotationPoint(-44.5F, -31.5F, 10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 2.8F, -0.2F, 0F, 2.8F, -0.2F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 517
		bodyModel[219].setRotationPoint(-44.5F, -32.5F, 4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F); // Box 518
		bodyModel[220].setRotationPoint(-44.5F, -32.85F, -2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 519
		bodyModel[221].setRotationPoint(-44.5F, -25.5F, 10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -6.2F, -0.2F, 0F, -6.2F, -0.2F, 0F, 5.8F, -0.2F, 0F, 5.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 520
		bodyModel[222].setRotationPoint(-24.5F, -31.5F, -11F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 5.8F, -0.2F, 0F, 5.8F, -0.2F, 0F, -6.2F, -0.2F, 0F, -6.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 521
		bodyModel[223].setRotationPoint(-24.5F, -31.5F, 10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 2.8F, -0.2F, 0F, 2.8F, -0.2F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 522
		bodyModel[224].setRotationPoint(-24.5F, -32.5F, 4F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F); // Box 523
		bodyModel[225].setRotationPoint(-24.5F, -32.85F, -2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, 2.8F, -0.2F, 0F, 2.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 524
		bodyModel[226].setRotationPoint(-24.5F, -32.5F, -5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 525
		bodyModel[227].setRotationPoint(-24.5F, -25.5F, 10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[228].setRotationPoint(-45.5F, -12.5F, -9F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[229].setRotationPoint(-45.5F, -12.5F, 8F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 310
		bodyModel[230].setRotationPoint(-24.51F, -12.8F, -14F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 311
		bodyModel[231].setRotationPoint(-24.51F, -12.8F, 9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[232].setRotationPoint(-6.5F, -12F, -12.5F);
		bodyModel[232].rotateAngleZ = 1.57079633F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[233].setRotationPoint(-6.5F, -12F, -13.5F);
		bodyModel[233].rotateAngleZ = 1.57079633F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 314
		bodyModel[234].setRotationPoint(-6.5F, -12F, -10.5F);
		bodyModel[234].rotateAngleZ = 1.57079633F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[235].setRotationPoint(-6.5F, -12F, 10.5F);
		bodyModel[235].rotateAngleZ = 1.57079633F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 319
		bodyModel[236].setRotationPoint(-6.5F, -12F, 12.5F);
		bodyModel[236].rotateAngleZ = 1.57079633F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[237].setRotationPoint(-6.5F, -12F, 9.5F);
		bodyModel[237].rotateAngleZ = 1.57079633F;

		bodyModel[238].addShapeBox(-10F, -0.2F, -10F, 35, 1, 35, 0F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, -29F, 0F, 0F, -29F); // Box 3
		bodyModel[238].setRotationPoint(-13F, -21.5F, -13.5F);
		bodyModel[238].rotateAngleY = -1.57079633F;
		bodyModel[238].rotateAngleZ = 1.57079633F;

		bodyModel[239].addShapeBox(-10F, -0.2F, -10F, 35, 1, 35, 0F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, -29F, 0F, 0F, -29F); // Box 322
		bodyModel[239].setRotationPoint(-13F, -21.5F, 14.2F);
		bodyModel[239].rotateAngleY = -1.57079633F;
		bodyModel[239].rotateAngleZ = 1.57079633F;

		bodyModel[240].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 323
		bodyModel[240].setRotationPoint(-44.5F, -11.5F, 9F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 324
		bodyModel[241].setRotationPoint(-44.5F, -11.5F, -13F);


		leftTrackWheelModels = new ModelRendererTurbo[6];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 407
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 408
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 409
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 410
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 411
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 326

		leftTrackWheelModels[0].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 407
		leftTrackWheelModels[0].setRotationPoint(-3.5F, 3F, 10F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 408
		leftTrackWheelModels[1].setRotationPoint(-20.5F, 3F, 10F);

		leftTrackWheelModels[2].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 409
		leftTrackWheelModels[2].setRotationPoint(-38F, 3F, 10F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 1, 12, 12, 44, 1, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 410
		leftTrackWheelModels[3].setRotationPoint(-12F, 3F, 11F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 1, 12, 12, 44, 1, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 411
		leftTrackWheelModels[4].setRotationPoint(-29.5F, 3F, 11F);

		leftTrackWheelModels[5].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 326
		leftTrackWheelModels[5].setRotationPoint(7.5F, 0F, 11F);


		rightTrackWheelModels = new ModelRendererTurbo[6];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 23
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 26
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 399
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 402
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 404
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 433, 136, textureX, textureY); // Shape 325

		rightTrackWheelModels[0].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 1, 12, 12, 44, 1, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 23
		rightTrackWheelModels[0].setRotationPoint(-12F, 3F, -14F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 26
		rightTrackWheelModels[1].setRotationPoint(-20.5F, 3F, -12F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 1, 12, 12, 44, 1, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 399
		rightTrackWheelModels[2].setRotationPoint(-29.5F, 3F, -14F);

		rightTrackWheelModels[3].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 402
		rightTrackWheelModels[3].setRotationPoint(-38F, 3F, -12F);

		rightTrackWheelModels[4].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 404
		rightTrackWheelModels[4].setRotationPoint(-3.5F, 3F, -12F);

		rightTrackWheelModels[5].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 325
		rightTrackWheelModels[5].setRotationPoint(7.5F, 0F, -13F);


		frontWheelModel = new ModelRendererTurbo[31];
		frontWheelModel[0] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 377
		frontWheelModel[1] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 378
		frontWheelModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 379
		frontWheelModel[3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 380
		frontWheelModel[4] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 381
		frontWheelModel[5] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 382
		frontWheelModel[6] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 383
		frontWheelModel[7] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 384
		frontWheelModel[8] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 387
		frontWheelModel[9] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 388
		frontWheelModel[10] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 389
		frontWheelModel[11] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 390
		frontWheelModel[12] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 391
		frontWheelModel[13] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 392
		frontWheelModel[14] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 409
		frontWheelModel[15] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 410
		frontWheelModel[16] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 411
		frontWheelModel[17] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 412
		frontWheelModel[18] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 413
		frontWheelModel[19] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 414
		frontWheelModel[20] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 415
		frontWheelModel[21] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 416
		frontWheelModel[22] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 234
		frontWheelModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 393
		frontWheelModel[24] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 406
		frontWheelModel[25] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 384
		frontWheelModel[26] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 385
		frontWheelModel[27] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 386
		frontWheelModel[28] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 387
		frontWheelModel[29] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 388
		frontWheelModel[30] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 389

		frontWheelModel[0].addShapeBox(-2.5F, -7.5F, -3F, 5, 3, 4, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 377
		frontWheelModel[0].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[1].addShapeBox(-7.5F, -2.5F, -3F, 3, 5, 4, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 378
		frontWheelModel[1].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[2].addShapeBox(4.5F, -2.5F, -3F, 3, 5, 4, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 379
		frontWheelModel[2].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[3].addShapeBox(-2.5F, 4.5F, -3F, 5, 3, 4, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 380
		frontWheelModel[3].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[4].addShapeBox(-7.5F, -7.5F, -3F, 5, 5, 4, 0F, -5F, 0F, 0.1F, 0F, -3F, 0.1F, 0F, -3F, 0.1F, -5F, 0F, 0.1F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 381
		frontWheelModel[4].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[5].addShapeBox(2.5F, -7.5F, -3F, 5, 5, 4, 0F, 0F, -3F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 0F, -3F, 0.1F, -2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -2F, 0F, 0.1F); // Box 382
		frontWheelModel[5].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[6].addShapeBox(2.5F, 2.5F, -3F, 5, 5, 4, 0F, -2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, 0F, -3F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 0F, -3F, 0.1F); // Box 383
		frontWheelModel[6].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[7].addShapeBox(-7.5F, 2.5F, -3F, 5, 5, 4, 0F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, 0F, 0F, 0.1F, -5F, 0F, 0.1F, 0F, -3F, 0.1F, 0F, -3F, 0.1F, -5F, 0F, 0.1F); // Box 384
		frontWheelModel[7].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[8].addShapeBox(-1.5F, -0.5F, -3F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		frontWheelModel[8].setRotationPoint(18F, 2.5F, 0.5F);

		frontWheelModel[9].addShapeBox(-1.5F, -1.5F, -3F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		frontWheelModel[9].setRotationPoint(18F, 2.5F, 0.5F);

		frontWheelModel[10].addShapeBox(-1.5F, 0.5F, -3F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 389
		frontWheelModel[10].setRotationPoint(18F, 2.5F, 0.5F);

		frontWheelModel[11].addShapeBox(-1.5F, 0.5F, 2F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 390
		frontWheelModel[11].setRotationPoint(18F, 2.5F, -0.5F);

		frontWheelModel[12].addShapeBox(-1.5F, -1.5F, 2F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		frontWheelModel[12].setRotationPoint(18F, 2.5F, -0.5F);

		frontWheelModel[13].addShapeBox(-1.5F, -0.5F, 2F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		frontWheelModel[13].setRotationPoint(18F, 2.5F, -0.5F);

		frontWheelModel[14].addShapeBox(-2.5F, -4.5F, -3F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		frontWheelModel[14].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[15].addShapeBox(-4.5F, -2.5F, -3F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		frontWheelModel[15].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[16].addShapeBox(3.5F, -2.5F, -3F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		frontWheelModel[16].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[17].addShapeBox(-2.5F, 3.5F, -3F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		frontWheelModel[17].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[18].addShapeBox(-4.5F, -4.5F, -3F, 2, 2, 4, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 413
		frontWheelModel[18].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[19].addShapeBox(2.5F, -4.5F, -3F, 2, 2, 4, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 414
		frontWheelModel[19].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[20].addShapeBox(2.5F, 2.5F, -3F, 2, 2, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Box 415
		frontWheelModel[20].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[21].addShapeBox(-4.5F, 2.5F, -3F, 2, 2, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F); // Box 416
		frontWheelModel[21].setRotationPoint(18F, 2.5F, 1F);

		frontWheelModel[22].addShapeBox(-0.5F, -0.5F, 2F, 1, 1, 7, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 234
		frontWheelModel[22].setRotationPoint(18F, 2.5F, -5.5F);

		frontWheelModel[23].addShapeBox(-0.5F, -0.5F, -2F, 1, 5, 1, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		frontWheelModel[23].setRotationPoint(18F, 2.5F, 0.5F);

		frontWheelModel[24].addShapeBox(-0.5F, -0.5F, 2F, 1, 5, 1, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		frontWheelModel[24].setRotationPoint(18F, 2.5F, -1.5F);

		frontWheelModel[25].addShapeBox(-3.5F, -2.5F, 2F, 1, 5, 1, 0F, 0F, -2F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 0F, -2F, 0F); // Box 384
		frontWheelModel[25].setRotationPoint(18F, 2.5F, -1.5F);

		frontWheelModel[26].addShapeBox(-3.5F, -2.5F, 0F, 1, 5, 1, 0F, 0F, -2F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 0F, -2F, 0F); // Box 385
		frontWheelModel[26].setRotationPoint(18F, 2.5F, -1.5F);

		frontWheelModel[27].addShapeBox(-3.5F, -2.5F, 2F, 1, 5, 1, 0F, 0F, 2F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 6F, 2F, 0F, 6F, 2F, 0F, 0F, -6F, 0F); // Box 386
		frontWheelModel[27].setRotationPoint(18F, 2.5F, -1.5F);

		frontWheelModel[28].addShapeBox(-3.5F, -2.5F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 6F, 2F, 0F, 6F, 2F, 0F, 0F, -6F, 0F); // Box 387
		frontWheelModel[28].setRotationPoint(18F, 2.5F, -1.5F);

		frontWheelModel[29].addShapeBox(-3.5F, -2.5F, 0F, 1, 5, 1, 0F, 0F, -6F, 0F, 6F, 2F, 0F, 6F, 2F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, 0F, 2F, 0F); // Box 388
		frontWheelModel[29].setRotationPoint(18F, 2.5F, -1.5F);

		frontWheelModel[30].addShapeBox(-3.5F, -2.5F, 2F, 1, 5, 1, 0F, 0F, -6F, 0F, 6F, 2F, 0F, 6F, 2F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, 0F, 2F, 0F); // Box 389
		frontWheelModel[30].setRotationPoint(18F, 2.5F, -1.5F);


		leftTrackModel = new ModelRendererTurbo[11];
		leftTrackModel[0] = new ModelRendererTurbo(this, 322, 261, textureX, textureY); // Box 91
		leftTrackModel[1] = new ModelRendererTurbo(this, 322, 131, textureX, textureY); // Box 92
		leftTrackModel[2] = new ModelRendererTurbo(this, 322, 207, textureX, textureY); // Box 93
		leftTrackModel[3] = new ModelRendererTurbo(this, 322, 191, textureX, textureY); // Box 94
		leftTrackModel[4] = new ModelRendererTurbo(this, 322, 182, textureX, textureY); // Box 95
		leftTrackModel[5] = new ModelRendererTurbo(this, 322, 158, textureX, textureY); // Box 97
		leftTrackModel[6] = new ModelRendererTurbo(this, 322, 147, textureX, textureY); // Box 98
		leftTrackModel[7] = new ModelRendererTurbo(this, 322, 167, textureX, textureY); // Box 4
		leftTrackModel[8] = new ModelRendererTurbo(this, 322, 233, textureX, textureY); // Box 448
		leftTrackModel[9] = new ModelRendererTurbo(this, 322, 248, textureX, textureY); // Box 449
		leftTrackModel[10] = new ModelRendererTurbo(this, 322, 216, textureX, textureY); // Box 451

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Box 91
		leftTrackModel[0].setRotationPoint(-4F, -6.5F, 9.5F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 37, 1, 4, 0F); // Box 92
		leftTrackModel[1].setRotationPoint(-41F, -4F, 9.5F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 93
		leftTrackModel[2].setRotationPoint(5F, -6.5F, 9.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 2.5F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 2.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 94
		leftTrackModel[3].setRotationPoint(13.5F, -6.5F, 9.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 95
		leftTrackModel[4].setRotationPoint(13.5F, -1.5F, 9.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 97
		leftTrackModel[5].setRotationPoint(-1F, 5.5F, 9.5F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 40, 1, 4, 0F); // Box 98
		leftTrackModel[6].setRotationPoint(-41F, 9F, 9.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F); // Box 4
		leftTrackModel[7].setRotationPoint(13.5F, 1.5F, 9.5F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 448
		leftTrackModel[8].setRotationPoint(-45F, 1F, 9.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		leftTrackModel[9].setRotationPoint(-45F, -4F, 9.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 451
		leftTrackModel[10].setRotationPoint(-45F, 5F, 9.5F);


		rightTrackModel = new ModelRendererTurbo[11];
		rightTrackModel[0] = new ModelRendererTurbo(this, 322, 261, textureX, textureY); // Box 420
		rightTrackModel[1] = new ModelRendererTurbo(this, 322, 207, textureX, textureY); // Box 422
		rightTrackModel[2] = new ModelRendererTurbo(this, 322, 158, textureX, textureY); // Box 425
		rightTrackModel[3] = new ModelRendererTurbo(this, 322, 131, textureX, textureY); // Box 452
		rightTrackModel[4] = new ModelRendererTurbo(this, 322, 147, textureX, textureY); // Box 453
		rightTrackModel[5] = new ModelRendererTurbo(this, 322, 233, textureX, textureY); // Box 454
		rightTrackModel[6] = new ModelRendererTurbo(this, 322, 248, textureX, textureY); // Box 455
		rightTrackModel[7] = new ModelRendererTurbo(this, 322, 216, textureX, textureY); // Box 456
		rightTrackModel[8] = new ModelRendererTurbo(this, 322, 191, textureX, textureY); // Box 327
		rightTrackModel[9] = new ModelRendererTurbo(this, 322, 182, textureX, textureY); // Box 328
		rightTrackModel[10] = new ModelRendererTurbo(this, 322, 167, textureX, textureY); // Box 329

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Box 420
		rightTrackModel[0].setRotationPoint(-4F, -6.5F, -13.5F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 422
		rightTrackModel[1].setRotationPoint(5F, -6.5F, -13.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 425
		rightTrackModel[2].setRotationPoint(-1F, 5.5F, -13.5F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 37, 1, 4, 0F); // Box 452
		rightTrackModel[3].setRotationPoint(-41F, -4F, -13.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 40, 1, 4, 0F); // Box 453
		rightTrackModel[4].setRotationPoint(-41F, 9F, -13.5F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 454
		rightTrackModel[5].setRotationPoint(-45F, 1F, -13.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		rightTrackModel[6].setRotationPoint(-45F, -4F, -13.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 456
		rightTrackModel[7].setRotationPoint(-45F, 5F, -13.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 2.5F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 2.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 327
		rightTrackModel[8].setRotationPoint(13.5F, -6.5F, -13.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 328
		rightTrackModel[9].setRotationPoint(13.5F, -1.5F, -13.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, -1F, 0F); // Box 329
		rightTrackModel[10].setRotationPoint(13.5F, 1.5F, -13.5F);


		trailerModel = new ModelRendererTurbo[3];
		trailerModel[0] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 368
		trailerModel[1] = new ModelRendererTurbo(this, 92, 233, textureX, textureY); // Box 369
		trailerModel[2] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 370

		trailerModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.3F, -1F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 368
		trailerModel[0].setRotationPoint(-45F, -15F, -2.75F);
		trailerModel[0].rotateAngleZ = 0.2443461F;

		trailerModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 369
		trailerModel[1].setRotationPoint(-45F, -15F, 1.75F);
		trailerModel[1].rotateAngleZ = 0.2443461F;

		trailerModel[2].addShapeBox(0F, -0.3F, 0F, 1, 1, 5, 0F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F); // Box 370
		trailerModel[2].setRotationPoint(-45F, -15F, -2.5F);
		trailerModel[2].rotateAngleZ = 0.2443461F;


		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[79];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 1, 269, textureX, textureY); // Box 0
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 17, 269, textureX, textureY); // Box 3
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 33, 269, textureX, textureY); // Box 4
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 49, 269, textureX, textureY); // Box 5
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 73, 269, textureX, textureY); // Box 6
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 113, 269, textureX, textureY); // Box 7
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 121, 269, textureX, textureY); // Box 8
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 129, 269, textureX, textureY); // Box 9
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 153, 269, textureX, textureY); // Box 12
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 169, 269, textureX, textureY); // Box 20
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 177, 269, textureX, textureY); // Box 21
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 24
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 241, 269, textureX, textureY); // Box 29
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 249, 269, textureX, textureY); // Box 30
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 17, 277, textureX, textureY); // Box 33
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 121, 277, textureX, textureY); // Box 34
		gun_1_Model[1][16] = new ModelRendererTurbo(this, 49, 277, textureX, textureY); // Box 45
		gun_1_Model[1][17] = new ModelRendererTurbo(this, 153, 277, textureX, textureY); // Box 46
		gun_1_Model[1][18] = new ModelRendererTurbo(this, 169, 277, textureX, textureY); // Box 47
		gun_1_Model[1][19] = new ModelRendererTurbo(this, 177, 277, textureX, textureY); // Box 48
		gun_1_Model[1][20] = new ModelRendererTurbo(this, 193, 277, textureX, textureY); // Box 49
		gun_1_Model[1][21] = new ModelRendererTurbo(this, 217, 277, textureX, textureY); // Box 50
		gun_1_Model[1][22] = new ModelRendererTurbo(this, 233, 277, textureX, textureY); // Box 51
		gun_1_Model[1][23] = new ModelRendererTurbo(this, 241, 277, textureX, textureY); // Box 52
		gun_1_Model[1][24] = new ModelRendererTurbo(this, 1, 285, textureX, textureY); // Box 53
		gun_1_Model[1][25] = new ModelRendererTurbo(this, 249, 277, textureX, textureY); // Box 55
		gun_1_Model[1][26] = new ModelRendererTurbo(this, 17, 285, textureX, textureY); // Box 56
		gun_1_Model[1][27] = new ModelRendererTurbo(this, 49, 285, textureX, textureY); // Box 57
		gun_1_Model[1][28] = new ModelRendererTurbo(this, 65, 285, textureX, textureY); // Box 58
		gun_1_Model[1][29] = new ModelRendererTurbo(this, 73, 285, textureX, textureY); // Box 59
		gun_1_Model[1][30] = new ModelRendererTurbo(this, 81, 285, textureX, textureY); // Box 60
		gun_1_Model[1][31] = new ModelRendererTurbo(this, 89, 285, textureX, textureY); // Box 61
		gun_1_Model[1][32] = new ModelRendererTurbo(this, 97, 285, textureX, textureY); // Box 73
		gun_1_Model[1][33] = new ModelRendererTurbo(this, 105, 285, textureX, textureY); // Box 74
		gun_1_Model[1][34] = new ModelRendererTurbo(this, 113, 285, textureX, textureY); // Box 75
		gun_1_Model[1][35] = new ModelRendererTurbo(this, 121, 285, textureX, textureY); // Box 76
		gun_1_Model[1][36] = new ModelRendererTurbo(this, 129, 285, textureX, textureY); // Box 77
		gun_1_Model[1][37] = new ModelRendererTurbo(this, 137, 285, textureX, textureY); // Box 78
		gun_1_Model[1][38] = new ModelRendererTurbo(this, 145, 285, textureX, textureY); // Box 79
		gun_1_Model[1][39] = new ModelRendererTurbo(this, 153, 285, textureX, textureY); // Box 80
		gun_1_Model[1][40] = new ModelRendererTurbo(this, 161, 285, textureX, textureY); // Box 81
		gun_1_Model[1][41] = new ModelRendererTurbo(this, 169, 285, textureX, textureY); // Box 82
		gun_1_Model[1][42] = new ModelRendererTurbo(this, 177, 285, textureX, textureY); // Box 83
		gun_1_Model[1][43] = new ModelRendererTurbo(this, 193, 285, textureX, textureY); // Box 84
		gun_1_Model[1][44] = new ModelRendererTurbo(this, 201, 285, textureX, textureY); // Box 85
		gun_1_Model[1][45] = new ModelRendererTurbo(this, 209, 285, textureX, textureY); // Box 86
		gun_1_Model[1][46] = new ModelRendererTurbo(this, 217, 285, textureX, textureY); // Box 104
		gun_1_Model[1][47] = new ModelRendererTurbo(this, 233, 285, textureX, textureY); // Box 105
		gun_1_Model[1][48] = new ModelRendererTurbo(this, 1, 293, textureX, textureY); // Box 106
		gun_1_Model[1][49] = new ModelRendererTurbo(this, 9, 293, textureX, textureY); // Box 18
		gun_1_Model[1][50] = new ModelRendererTurbo(this, 41, 293, textureX, textureY); // Box 23
		gun_1_Model[1][51] = new ModelRendererTurbo(this, 73, 293, textureX, textureY); // Box 24
		gun_1_Model[1][52] = new ModelRendererTurbo(this, 105, 293, textureX, textureY); // Box 25
		gun_1_Model[1][53] = new ModelRendererTurbo(this, 137, 293, textureX, textureY); // Box 27
		gun_1_Model[1][54] = new ModelRendererTurbo(this, 161, 293, textureX, textureY); // Box 28
		gun_1_Model[1][55] = new ModelRendererTurbo(this, 193, 293, textureX, textureY); // Box 29
		gun_1_Model[1][56] = new ModelRendererTurbo(this, 209, 293, textureX, textureY); // Box 30
		gun_1_Model[1][57] = new ModelRendererTurbo(this, 193, 341, textureX, textureY); // Box 133
		gun_1_Model[1][58] = new ModelRendererTurbo(this, 41, 293, textureX, textureY); // Box 147
		gun_1_Model[1][59] = new ModelRendererTurbo(this, 65, 293, textureX, textureY); // Box 148
		gun_1_Model[1][60] = new ModelRendererTurbo(this, 73, 293, textureX, textureY); // Box 149
		gun_1_Model[1][61] = new ModelRendererTurbo(this, 97, 293, textureX, textureY); // Box 150
		gun_1_Model[1][62] = new ModelRendererTurbo(this, 105, 293, textureX, textureY); // Box 151
		gun_1_Model[1][63] = new ModelRendererTurbo(this, 129, 293, textureX, textureY); // Box 152
		gun_1_Model[1][64] = new ModelRendererTurbo(this, 137, 293, textureX, textureY); // Box 153
		gun_1_Model[1][65] = new ModelRendererTurbo(this, 161, 293, textureX, textureY); // Box 154
		gun_1_Model[1][66] = new ModelRendererTurbo(this, 185, 293, textureX, textureY); // Box 155
		gun_1_Model[1][67] = new ModelRendererTurbo(this, 233, 293, textureX, textureY); // Box 156
		gun_1_Model[1][68] = new ModelRendererTurbo(this, 177, 269, textureX, textureY); // Box 96
		gun_1_Model[1][69] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 97
		gun_1_Model[1][70] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 98
		gun_1_Model[1][71] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 99
		gun_1_Model[1][72] = new ModelRendererTurbo(this, 121, 269, textureX, textureY); // Box 100
		gun_1_Model[1][73] = new ModelRendererTurbo(this, 121, 269, textureX, textureY); // Box 101
		gun_1_Model[1][74] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 102
		gun_1_Model[1][75] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 103
		gun_1_Model[1][76] = new ModelRendererTurbo(this, 121, 269, textureX, textureY); // Box 104
		gun_1_Model[1][77] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 105
		gun_1_Model[1][78] = new ModelRendererTurbo(this, 201, 269, textureX, textureY); // Box 106

		gun_1_Model[1][0].addShapeBox(-7F, -1.5F, -1F, 2, 4, 2, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 0

		gun_1_Model[1][1].addShapeBox(-7F, -2F, -1F, 3, 1, 2, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 3

		gun_1_Model[1][2].addShapeBox(-12F, -2F, -1F, 5, 1, 2, 0F, 0F, -0.8F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F); // Box 4

		gun_1_Model[1][3].addShapeBox(0F, -0.6F, -0.5F, 14, 1, 1, 0F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, 0.5F); // Box 5

		gun_1_Model[1][4].addShapeBox(0F, -2F, -3.5F, 14, 1, 7, 0F, 0F, -0.4F, -2.5F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -2.5F, 0F, -0.4F, -2.4F, 0F, -0.4F, -2.9F, 0F, -0.4F, -2.9F, 0F, -0.4F, -2.4F); // Box 6

		gun_1_Model[1][5].addShapeBox(0F, -1.3F, 0.5F, 2, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 7

		gun_1_Model[1][6].addShapeBox(5F, -1.3F, 0.5F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.55F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.55F); // Box 8

		gun_1_Model[1][7].addShapeBox(3F, -1.3F, 0.5F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.54F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.54F, 0F, 0.1F, -0.5F); // Box 9

		gun_1_Model[1][8].addShapeBox(12.5F, -1.3F, 0.1F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 12

		gun_1_Model[1][9].addShapeBox(12.9F, -1.3F, -1.5F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 20

		gun_1_Model[1][10].addShapeBox(2F, -1.7F, 0.5F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.4F); // Box 21

		gun_1_Model[1][11].addShapeBox(4F, -1.7F, 0.5F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.55F, 0F, -0.4F, -0.55F); // Box 24

		gun_1_Model[1][12].addShapeBox(11.75F, -0.9F, 0.1F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F); // Box 29

		gun_1_Model[1][13].addShapeBox(11.75F, -1.7F, 0.1F, 1, 1, 1, 0F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F); // Box 30

		gun_1_Model[1][14].addShapeBox(-0.1F, -1.7F, -1.5F, 13, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.9F, 0F, -0.3F, 0.6F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.6F, 0F, -0.4F, -0.4F); // Box 33

		gun_1_Model[1][15].addShapeBox(-0.1F, -0.9F, -1.5F, 13, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.6F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.9F, 0F, -0.3F, 0.6F, 0F, -0.3F, -0.4F); // Box 34

		gun_1_Model[1][16].addShapeBox(-7F, -2.5F, -1F, 6, 1, 2, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 45

		gun_1_Model[1][17].addShapeBox(-10F, -2.5F, -1F, 3, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.6F, 0F, 0.6F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, -0.3F); // Box 46

		gun_1_Model[1][18].addShapeBox(-10.5F, -2.15F, -0.5F, 1, 1, 1, 0F, -0.3F, -0.2F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.3F, -0.2F, 0.2F, -0.5F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F); // Box 47

		gun_1_Model[1][19].addShapeBox(-12F, -1F, -1F, 5, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F); // Box 48

		gun_1_Model[1][20].addShapeBox(-7F, -1F, -1F, 7, 1, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 49

		gun_1_Model[1][21].addShapeBox(-15F, -1F, -0.5F, 3, 2, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0.3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0.3F); // Box 50

		gun_1_Model[1][22].addShapeBox(-17F, 1F, -0.5F, 2, 1, 1, 0F, -0.5F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, -0.5F, 1F, 0.3F, -0.2F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, -0.5F, 0F); // Box 51

		gun_1_Model[1][23].addShapeBox(-17F, -1F, -0.5F, 2, 2, 1, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.5F, 0F, -0.5F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, -0.5F, -1F, 0.3F); // Box 52

		gun_1_Model[1][24].addShapeBox(-15F, 1F, -0.5F, 3, 1, 1, 0F, 0F, 1F, 0.3F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0.3F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 53

		gun_1_Model[1][25].addShapeBox(13F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F); // Box 55

		gun_1_Model[1][26].addShapeBox(0F, -1.3F, -0.5F, 14, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 56

		gun_1_Model[1][27].addShapeBox(13.25F, -1.3F, -0.5F, 4, 1, 1, 0F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F); // Box 57

		gun_1_Model[1][28].addShapeBox(16.75F, -1.3F, -0.5F, 1, 1, 1, 0F, 0.2F, -0.1F, -0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, -0.1F, -0.1F); // Box 58

		gun_1_Model[1][29].addShapeBox(14.85F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 59

		gun_1_Model[1][30].addShapeBox(14.85F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 60

		gun_1_Model[1][31].addShapeBox(14.85F, -1F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 61

		gun_1_Model[1][32].addShapeBox(14.55F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 73

		gun_1_Model[1][33].addShapeBox(14.55F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 74

		gun_1_Model[1][34].addShapeBox(14.55F, -1F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 75

		gun_1_Model[1][35].addShapeBox(14.25F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 76

		gun_1_Model[1][36].addShapeBox(14.25F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 77

		gun_1_Model[1][37].addShapeBox(14.25F, -1F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 78

		gun_1_Model[1][38].addShapeBox(13.95F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 79

		gun_1_Model[1][39].addShapeBox(13.95F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 80

		gun_1_Model[1][40].addShapeBox(13.95F, -1F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 81

		gun_1_Model[1][41].addShapeBox(16.25F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F); // Box 82

		gun_1_Model[1][42].addShapeBox(1F, -2F, -0.5F, 3, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F); // Box 83

		gun_1_Model[1][43].addShapeBox(1F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 84

		gun_1_Model[1][44].addShapeBox(1F, -2.5F, -0.8F, 1, 1, 1, 0F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F); // Box 85

		gun_1_Model[1][45].addShapeBox(1F, -2.5F, -0.2F, 1, 1, 1, 0F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 86

		gun_1_Model[1][46].addShapeBox(-2F, -2F, -1F, 2, 1, 2, 0F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 104

		gun_1_Model[1][47].addShapeBox(-4F, -2F, -1F, 2, 1, 2, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F); // Box 105

		gun_1_Model[1][48].addShapeBox(-7F, -1.5F, -1F, 2, 4, 2, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0.3F, -0.1F, -0.4F, -1.3F, -0.1F, -0.4F, -1.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F); // Box 106

		gun_1_Model[1][49].addShapeBox(-4F, -2.5F, 1.1F, 6, 6, 8, 0F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 18

		gun_1_Model[1][50].addShapeBox(-5.3F, -2.5F, -1.5F, 6, 6, 9, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 23

		gun_1_Model[1][51].addShapeBox(-6.9F, -2.5F, -1.5F, 6, 6, 9, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 24

		gun_1_Model[1][52].addShapeBox(-4F, -2.5F, -2.9F, 6, 6, 8, 0F, 0F, -2F, -3.9F, -4.2F, -2F, -3.9F, -4.2F, -2F, -3.9F, 0F, -2F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 25

		gun_1_Model[1][53].addShapeBox(-4F, -1.5F, -1.4F, 6, 5, 9, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 27

		gun_1_Model[1][54].addShapeBox(-5.3F, -1.45F, -2.1F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 28

		gun_1_Model[1][55].addShapeBox(-6.9F, -1.45F, -2.1F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 29

		gun_1_Model[1][56].addShapeBox(-4F, -3.75F, -1.4F, 6, 5, 9, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 30

		gun_1_Model[1][57].addShapeBox(-4F, -4.3F, -0.4F, 6, 5, 8, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 133

		gun_1_Model[1][58].addShapeBox(-5F, -2.5F, -2.5F, 1, 3, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 147

		gun_1_Model[1][59].addShapeBox(-5F, -2.5F, -1.9F, 1, 3, 1, 0F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F); // Box 148

		gun_1_Model[1][60].addShapeBox(-2.3F, -2F, 0.2F, 1, 1, 1, 0F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 149

		gun_1_Model[1][61].addShapeBox(-4.7F, -2F, 0.2F, 1, 1, 1, 0F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 150

		gun_1_Model[1][62].addShapeBox(-2F, -2.25F, -0.5F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 151

		gun_1_Model[1][63].addShapeBox(-2.5F, -2.25F, -0.5F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 152

		gun_1_Model[1][64].addShapeBox(-3F, -2.15F, -0.5F, 2, 1, 1, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F); // Box 153

		gun_1_Model[1][65].addShapeBox(-10F, -1.85F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 154

		gun_1_Model[1][66].addShapeBox(-6F, 0F, -1F, 3, 1, 2, 0F, -0.3F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, -0.3F, 0F, -0.6F, 0F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 155

		gun_1_Model[1][67].addShapeBox(-5F, 0.5F, -0.5F, 1, 1, 1, 0F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F); // Box 156

		gun_1_Model[1][68].addShapeBox(2F, -0.8F, 0.5F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.4F); // Box 96

		gun_1_Model[1][69].addShapeBox(4F, -0.8F, 0.5F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.55F, 0F, -0.4F, -0.55F); // Box 97

		gun_1_Model[1][70].addShapeBox(6F, -1.7F, 0.45F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.55F, 0F, -0.4F, -0.55F); // Box 98

		gun_1_Model[1][71].addShapeBox(6F, -0.8F, 0.45F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.55F, 0F, -0.4F, -0.55F); // Box 99

		gun_1_Model[1][72].addShapeBox(7F, -1.3F, 0.45F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.55F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.55F); // Box 100

		gun_1_Model[1][73].addShapeBox(11F, -1.3F, 0.3F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.55F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.55F); // Box 101

		gun_1_Model[1][74].addShapeBox(10F, -1.7F, 0.3F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.55F, 0F, -0.4F, -0.55F); // Box 102

		gun_1_Model[1][75].addShapeBox(10F, -0.8F, 0.3F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.55F, 0F, -0.4F, -0.55F); // Box 103

		gun_1_Model[1][76].addShapeBox(9F, -1.3F, 0.35F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.55F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.55F); // Box 104

		gun_1_Model[1][77].addShapeBox(8F, -0.8F, 0.35F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.55F, 0F, -0.4F, -0.55F); // Box 105

		gun_1_Model[1][78].addShapeBox(8F, -1.7F, 0.35F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.55F, 0F, -0.4F, -0.55F); // Box 106

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(-45F, -15F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
