//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelChinook extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;
	
	public ModelChinook() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[311];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 248, textureX, textureY); // Import Box33
		bodyModel[1] = new ModelRendererTurbo(this, 0, 341, textureX, textureY); // Import Box34
		bodyModel[2] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Box30
		bodyModel[3] = new ModelRendererTurbo(this, 70, 152, textureX, textureY); // Import Box31
		bodyModel[4] = new ModelRendererTurbo(this, 132, 152, textureX, textureY); // Import Box32
		bodyModel[5] = new ModelRendererTurbo(this, 411, 152, textureX, textureY); // Import Box36
		bodyModel[6] = new ModelRendererTurbo(this, 411, 193, textureX, textureY); // Import Box66
		bodyModel[7] = new ModelRendererTurbo(this, 498, 193, textureX, textureY); // Import Box68
		bodyModel[8] = new ModelRendererTurbo(this, 780, 152, textureX, textureY); // Import Box69
		bodyModel[9] = new ModelRendererTurbo(this, 780, 193, textureX, textureY); // Import Box70
		bodyModel[10] = new ModelRendererTurbo(this, 820, 152, textureX, textureY); // Import Box71
		bodyModel[11] = new ModelRendererTurbo(this, 820, 193, textureX, textureY); // Import Box72
		bodyModel[12] = new ModelRendererTurbo(this, 590, 152, textureX, textureY); // Import Box73
		bodyModel[13] = new ModelRendererTurbo(this, 622, 152, textureX, textureY); // Import Box76
		bodyModel[14] = new ModelRendererTurbo(this, 542, 152, textureX, textureY); // Import Box77
		bodyModel[15] = new ModelRendererTurbo(this, 469, 152, textureX, textureY); // Import Box79
		bodyModel[16] = new ModelRendererTurbo(this, 516, 152, textureX, textureY); // Import Box80
		bodyModel[17] = new ModelRendererTurbo(this, 622, 193, textureX, textureY); // Import Box81
		bodyModel[18] = new ModelRendererTurbo(this, 469, 193, textureX, textureY); // Import Box83
		bodyModel[19] = new ModelRendererTurbo(this, 516, 193, textureX, textureY); // Import Box84
		bodyModel[20] = new ModelRendererTurbo(this, 670, 152, textureX, textureY); // Import Box88
		bodyModel[21] = new ModelRendererTurbo(this, 687, 152, textureX, textureY); // Import Box89
		bodyModel[22] = new ModelRendererTurbo(this, 721, 152, textureX, textureY); // Import Box90
		bodyModel[23] = new ModelRendererTurbo(this, 752, 152, textureX, textureY); // Import Box91
		bodyModel[24] = new ModelRendererTurbo(this, 654, 193, textureX, textureY); // Import Box93
		bodyModel[25] = new ModelRendererTurbo(this, 670, 193, textureX, textureY); // Import Box94
		bodyModel[26] = new ModelRendererTurbo(this, 687, 193, textureX, textureY); // Import Box95
		bodyModel[27] = new ModelRendererTurbo(this, 721, 193, textureX, textureY); // Import Box96
		bodyModel[28] = new ModelRendererTurbo(this, 752, 193, textureX, textureY); // Import Box97
		bodyModel[29] = new ModelRendererTurbo(this, 218, 152, textureX, textureY); // Import Box98
		bodyModel[30] = new ModelRendererTurbo(this, 498, 152, textureX, textureY); // Import Box99
		bodyModel[31] = new ModelRendererTurbo(this, 567, 152, textureX, textureY); // Import Box100
		bodyModel[32] = new ModelRendererTurbo(this, 542, 193, textureX, textureY); // Import Box101
		bodyModel[33] = new ModelRendererTurbo(this, 567, 193, textureX, textureY); // Import Box102
		bodyModel[34] = new ModelRendererTurbo(this, 371, 152, textureX, textureY); // Import Box103
		bodyModel[35] = new ModelRendererTurbo(this, 286, 152, textureX, textureY); // Import Box104
		bodyModel[36] = new ModelRendererTurbo(this, 371, 193, textureX, textureY); // Import Box106
		bodyModel[37] = new ModelRendererTurbo(this, 0, 749, textureX, textureY); // Import Box107
		bodyModel[38] = new ModelRendererTurbo(this, 41, 749, textureX, textureY); // Import Box108
		bodyModel[39] = new ModelRendererTurbo(this, 91, 749, textureX, textureY); // Import Box109
		bodyModel[40] = new ModelRendererTurbo(this, 274, 74, textureX, textureY); // Import Box110
		bodyModel[41] = new ModelRendererTurbo(this, 274, 118, textureX, textureY); // Import Box111
		bodyModel[42] = new ModelRendererTurbo(this, 133, 248, textureX, textureY); // Import Box112
		bodyModel[43] = new ModelRendererTurbo(this, 133, 289, textureX, textureY); // Import Box113
		bodyModel[44] = new ModelRendererTurbo(this, 486, 248, textureX, textureY); // Import Box114
		bodyModel[45] = new ModelRendererTurbo(this, 632, 248, textureX, textureY); // Import Box115
		bodyModel[46] = new ModelRendererTurbo(this, 542, 248, textureX, textureY); // Import Box116
		bodyModel[47] = new ModelRendererTurbo(this, 658, 248, textureX, textureY); // Import Box117
		bodyModel[48] = new ModelRendererTurbo(this, 246, 248, textureX, textureY); // Import Box118
		bodyModel[49] = new ModelRendererTurbo(this, 246, 289, textureX, textureY); // Import Box119
		bodyModel[50] = new ModelRendererTurbo(this, 340, 248, textureX, textureY); // Import Box120
		bodyModel[51] = new ModelRendererTurbo(this, 398, 341, textureX, textureY); // Import Box121
		bodyModel[52] = new ModelRendererTurbo(this, 0, 403, textureX, textureY); // Import Box122
		bodyModel[53] = new ModelRendererTurbo(this, 628, 403, textureX, textureY); // Import Box123
		bodyModel[54] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box124
		bodyModel[55] = new ModelRendererTurbo(this, 326, 403, textureX, textureY); // Import Box128
		bodyModel[56] = new ModelRendererTurbo(this, 387, 403, textureX, textureY); // Import Box129
		bodyModel[57] = new ModelRendererTurbo(this, 454, 403, textureX, textureY); // Import Box130
		bodyModel[58] = new ModelRendererTurbo(this, 524, 403, textureX, textureY); // Import Box131
		bodyModel[59] = new ModelRendererTurbo(this, 594, 403, textureX, textureY); // Import Box132
		bodyModel[60] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box133
		bodyModel[61] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box134
		bodyModel[62] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box135
		bodyModel[63] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box136
		bodyModel[64] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box137
		bodyModel[65] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box138
		bodyModel[66] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box139
		bodyModel[67] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box140
		bodyModel[68] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box141
		bodyModel[69] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box142
		bodyModel[70] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box143
		bodyModel[71] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box144
		bodyModel[72] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box145
		bodyModel[73] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box146
		bodyModel[74] = new ModelRendererTurbo(this, 947, 403, textureX, textureY); // Import Box147
		bodyModel[75] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box148
		bodyModel[76] = new ModelRendererTurbo(this, 326, 677, textureX, textureY); // Import Box149
		bodyModel[77] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box150
		bodyModel[78] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box151
		bodyModel[79] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box152
		bodyModel[80] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box153
		bodyModel[81] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box154
		bodyModel[82] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box155
		bodyModel[83] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box156
		bodyModel[84] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box157
		bodyModel[85] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box158
		bodyModel[86] = new ModelRendererTurbo(this, 733, 341, textureX, textureY); // Import Box159
		bodyModel[87] = new ModelRendererTurbo(this, 1071, 341, textureX, textureY); // Import Box160
		bodyModel[88] = new ModelRendererTurbo(this, 0, 806, textureX, textureY); // Import Box161
		bodyModel[89] = new ModelRendererTurbo(this, 286, 806, textureX, textureY); // Import Box162
		bodyModel[90] = new ModelRendererTurbo(this, 398, 364, textureX, textureY); // Import Box163
		bodyModel[91] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Import Box164
		bodyModel[92] = new ModelRendererTurbo(this, 628, 426, textureX, textureY); // Import Box165
		bodyModel[93] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box166
		bodyModel[94] = new ModelRendererTurbo(this, 326, 426, textureX, textureY); // Import Box167
		bodyModel[95] = new ModelRendererTurbo(this, 387, 426, textureX, textureY); // Import Box168
		bodyModel[96] = new ModelRendererTurbo(this, 454, 426, textureX, textureY); // Import Box169
		bodyModel[97] = new ModelRendererTurbo(this, 524, 426, textureX, textureY); // Import Box170
		bodyModel[98] = new ModelRendererTurbo(this, 594, 426, textureX, textureY); // Import Box171
		bodyModel[99] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box172
		bodyModel[100] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box173
		bodyModel[101] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box174
		bodyModel[102] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box175
		bodyModel[103] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box176
		bodyModel[104] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box177
		bodyModel[105] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box178
		bodyModel[106] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box179
		bodyModel[107] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box180
		bodyModel[108] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box181
		bodyModel[109] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box182
		bodyModel[110] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box183
		bodyModel[111] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box184
		bodyModel[112] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box185
		bodyModel[113] = new ModelRendererTurbo(this, 947, 426, textureX, textureY); // Import Box186
		bodyModel[114] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box187
		bodyModel[115] = new ModelRendererTurbo(this, 326, 715, textureX, textureY); // Import Box188
		bodyModel[116] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box189
		bodyModel[117] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box190
		bodyModel[118] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box191
		bodyModel[119] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box192
		bodyModel[120] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box193
		bodyModel[121] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box194
		bodyModel[122] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box195
		bodyModel[123] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box196
		bodyModel[124] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box197
		bodyModel[125] = new ModelRendererTurbo(this, 486, 289, textureX, textureY); // Import Box198
		bodyModel[126] = new ModelRendererTurbo(this, 632, 289, textureX, textureY); // Import Box199
		bodyModel[127] = new ModelRendererTurbo(this, 542, 289, textureX, textureY); // Import Box200
		bodyModel[128] = new ModelRendererTurbo(this, 658, 289, textureX, textureY); // Import Box201
		bodyModel[129] = new ModelRendererTurbo(this, 733, 364, textureX, textureY); // Import Box202
		bodyModel[130] = new ModelRendererTurbo(this, 225, 749, textureX, textureY); // Import Box203
		bodyModel[131] = new ModelRendererTurbo(this, 156, 749, textureX, textureY); // Import Box204
		bodyModel[132] = new ModelRendererTurbo(this, 288, 749, textureX, textureY); // Import Box205
		bodyModel[133] = new ModelRendererTurbo(this, 356, 749, textureX, textureY); // Import Box206
		bodyModel[134] = new ModelRendererTurbo(this, 415, 749, textureX, textureY); // Import Box207
		bodyModel[135] = new ModelRendererTurbo(this, 654, 152, textureX, textureY); // Import Box208
		bodyModel[136] = new ModelRendererTurbo(this, 641, 152, textureX, textureY); // Import Box209
		bodyModel[137] = new ModelRendererTurbo(this, 641, 193, textureX, textureY); // Import Box210
		bodyModel[138] = new ModelRendererTurbo(this, 571, 289, textureX, textureY); // Import Box211
		bodyModel[139] = new ModelRendererTurbo(this, 616, 289, textureX, textureY); // Import Box212
		bodyModel[140] = new ModelRendererTurbo(this, 602, 289, textureX, textureY); // Import Box213
		bodyModel[141] = new ModelRendererTurbo(this, 586, 289, textureX, textureY); // Import Box214
		bodyModel[142] = new ModelRendererTurbo(this, 571, 248, textureX, textureY); // Import Box215
		bodyModel[143] = new ModelRendererTurbo(this, 616, 248, textureX, textureY); // Import Box216
		bodyModel[144] = new ModelRendererTurbo(this, 602, 248, textureX, textureY); // Import Box217
		bodyModel[145] = new ModelRendererTurbo(this, 586, 248, textureX, textureY); // Import Box218
		bodyModel[146] = new ModelRendererTurbo(this, 299, 983, textureX, textureY); // Import Box219
		bodyModel[147] = new ModelRendererTurbo(this, 299, 983, textureX, textureY); // Import Box220
		bodyModel[148] = new ModelRendererTurbo(this, 346, 983, textureX, textureY); // Import Box221
		bodyModel[149] = new ModelRendererTurbo(this, 449, 983, textureX, textureY); // Import Box222
		bodyModel[150] = new ModelRendererTurbo(this, 223, 983, textureX, textureY); // Import Box224
		bodyModel[151] = new ModelRendererTurbo(this, 140, 983, textureX, textureY); // Import Box225
		bodyModel[152] = new ModelRendererTurbo(this, 51, 983, textureX, textureY); // Import Box226
		bodyModel[153] = new ModelRendererTurbo(this, 223, 983, textureX, textureY); // Import Box227
		bodyModel[154] = new ModelRendererTurbo(this, 258, 983, textureX, textureY); // Import Box228
		bodyModel[155] = new ModelRendererTurbo(this, 258, 983, textureX, textureY); // Import Box229
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box344
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box345
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box346
		bodyModel[159] = new ModelRendererTurbo(this, 16, 1156, textureX, textureY); // Import Box347
		bodyModel[160] = new ModelRendererTurbo(this, 16, 1142, textureX, textureY); // Import Box348
		bodyModel[161] = new ModelRendererTurbo(this, 16, 1142, textureX, textureY); // Import Box349
		bodyModel[162] = new ModelRendererTurbo(this, 16, 1142, textureX, textureY); // Import Box350
		bodyModel[163] = new ModelRendererTurbo(this, 16, 1142, textureX, textureY); // Import Box351
		bodyModel[164] = new ModelRendererTurbo(this, 16, 1156, textureX, textureY); // Import Box352
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box353
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box354
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box355
		bodyModel[168] = new ModelRendererTurbo(this, 16, 1156, textureX, textureY); // Import Box356
		bodyModel[169] = new ModelRendererTurbo(this, 16, 1142, textureX, textureY); // Import Box357
		bodyModel[170] = new ModelRendererTurbo(this, 16, 1142, textureX, textureY); // Import Box358
		bodyModel[171] = new ModelRendererTurbo(this, 16, 1142, textureX, textureY); // Import Box359
		bodyModel[172] = new ModelRendererTurbo(this, 16, 1142, textureX, textureY); // Import Box360
		bodyModel[173] = new ModelRendererTurbo(this, 16, 1156, textureX, textureY); // Import Box361
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1111, textureX, textureY); // Import Box494
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1111, textureX, textureY); // Import Box495
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1111, textureX, textureY); // Import Box496
		bodyModel[177] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box0
		bodyModel[178] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box1
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box2
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box3
		bodyModel[181] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box10
		bodyModel[182] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box11
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box12
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box13
		bodyModel[185] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box18
		bodyModel[186] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box19
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box20
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box21
		bodyModel[189] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box32
		bodyModel[190] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box45
		bodyModel[191] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box46
		bodyModel[192] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box47
		bodyModel[193] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box48
		bodyModel[194] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box49
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box50
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box51
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box52
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box53
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box54
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box55
		bodyModel[201] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box56
		bodyModel[202] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box69
		bodyModel[203] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box70
		bodyModel[204] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box71
		bodyModel[205] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box72
		bodyModel[206] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box73
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box74
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box75
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box76
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box77
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box78
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box79
		bodyModel[213] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box80
		bodyModel[214] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box93
		bodyModel[215] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box94
		bodyModel[216] = new ModelRendererTurbo(this, 96, 1055, textureX, textureY); // Import Box95
		bodyModel[217] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box96
		bodyModel[218] = new ModelRendererTurbo(this, 11, 1055, textureX, textureY); // Import Box97
		bodyModel[219] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box98
		bodyModel[220] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box99
		bodyModel[221] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box100
		bodyModel[222] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box101
		bodyModel[223] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box102
		bodyModel[224] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box103
		bodyModel[225] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box104
		bodyModel[226] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box105
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box106
		bodyModel[228] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box107
		bodyModel[229] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box114
		bodyModel[230] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box115
		bodyModel[231] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box116
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box117
		bodyModel[233] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box122
		bodyModel[234] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box123
		bodyModel[235] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box124
		bodyModel[236] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box125
		bodyModel[237] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box128
		bodyModel[238] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box141
		bodyModel[239] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box142
		bodyModel[240] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box143
		bodyModel[241] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box144
		bodyModel[242] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box145
		bodyModel[243] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box146
		bodyModel[244] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box147
		bodyModel[245] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box148
		bodyModel[246] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box149
		bodyModel[247] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box150
		bodyModel[248] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box151
		bodyModel[249] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box152
		bodyModel[250] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box165
		bodyModel[251] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box166
		bodyModel[252] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box167
		bodyModel[253] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box168
		bodyModel[254] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box169
		bodyModel[255] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box170
		bodyModel[256] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box171
		bodyModel[257] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box172
		bodyModel[258] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box173
		bodyModel[259] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box174
		bodyModel[260] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box175
		bodyModel[261] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box176
		bodyModel[262] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box189
		bodyModel[263] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box190
		bodyModel[264] = new ModelRendererTurbo(this, 96, 1074, textureX, textureY); // Import Box191
		bodyModel[265] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box192
		bodyModel[266] = new ModelRendererTurbo(this, 11, 1074, textureX, textureY); // Import Box193
		bodyModel[267] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box194
		bodyModel[268] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box195
		bodyModel[269] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box196
		bodyModel[270] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box197
		bodyModel[271] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box198
		bodyModel[272] = new ModelRendererTurbo(this, 0, 1074, textureX, textureY); // Import Box199
		bodyModel[273] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box135
		bodyModel[274] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box136
		bodyModel[275] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box137
		bodyModel[276] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box138
		bodyModel[277] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box139
		bodyModel[278] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box141
		bodyModel[279] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box142
		bodyModel[280] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box143
		bodyModel[281] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box144
		bodyModel[282] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box145
		bodyModel[283] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box146
		bodyModel[284] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box147
		bodyModel[285] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box148
		bodyModel[286] = new ModelRendererTurbo(this, 114, 35, textureX, textureY); // Import Box149
		bodyModel[287] = new ModelRendererTurbo(this, 83, 35, textureX, textureY); // Import Box150
		bodyModel[288] = new ModelRendererTurbo(this, 70, 35, textureX, textureY); // Import Box160
		bodyModel[289] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box50
		bodyModel[290] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box51
		bodyModel[291] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box52
		bodyModel[292] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box53
		bodyModel[293] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box54
		bodyModel[294] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box55
		bodyModel[295] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box56
		bodyModel[296] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box57
		bodyModel[297] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box58
		bodyModel[298] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box59
		bodyModel[299] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box60
		bodyModel[300] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box61
		bodyModel[301] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Import Box62
		bodyModel[302] = new ModelRendererTurbo(this, 114, 35, textureX, textureY); // Import Box63
		bodyModel[303] = new ModelRendererTurbo(this, 83, 35, textureX, textureY); // Import Box64
		bodyModel[304] = new ModelRendererTurbo(this, 70, 35, textureX, textureY); // Import Box74
		bodyModel[305] = new ModelRendererTurbo(this, 362, 31, textureX, textureY); // Import Box11
		bodyModel[306] = new ModelRendererTurbo(this, 324, 31, textureX, textureY); // Import Box11
		bodyModel[307] = new ModelRendererTurbo(this, 401, 32, textureX, textureY); // Import Box11
		bodyModel[308] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box9
		bodyModel[309] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box11
		bodyModel[310] = new ModelRendererTurbo(this, 442, 31, textureX, textureY); // Import Box0
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 32, 5, 32, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Import Box33
		bodyModel[0].setRotationPoint(-153F, -9F, -16F);
		
		bodyModel[1].addShapeBox(0F, 0F, 0F, 155, 5, 40, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[1].setRotationPoint(-121F, -9F, -20F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 24, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1.5F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -6F); // Import Box30
		bodyModel[2].setRotationPoint(-174F, -9F, -12F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box31
		bodyModel[3].setRotationPoint(-167F, -9F, -12F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 5, 28, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -2F); // Import Box32
		bodyModel[4].setRotationPoint(-164F, -9F, -14F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 11, 17, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, -16F, 0F, 0F, -15F, 0F, -2.5F, -13F, 0F, -1.5F, -7F, 0F, -1.5F, -5F, 0F, -2.5F, -1F); // Import Box36
		bodyModel[5].setRotationPoint(-174F, -16F, -19F);
		
		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 11, 17, 0F, 0F, 0F, -15F, 0F, -3F, -16F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -2.5F, -1F, 0F, -1.5F, -5F, 0F, -1.5F, -7F, 0F, -2.5F, -13F); // Import Box66
		bodyModel[6].setRotationPoint(-174F, -16F, 2F);
		
		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		bodyModel[7].setRotationPoint(-174F, -40F, 5F);
		
		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -0.5F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Import Box69
		bodyModel[8].setRotationPoint(-167F, -13F, -19F);
		
		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 7, 13, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -0.5F, -7F); // Import Box70
		bodyModel[9].setRotationPoint(-167F, -13F, 6F);
		
		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 8, 13, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -13F, 0F, 0F, -12F, 0F, -1F, -7F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, -1F, 0F); // Import Box71
		bodyModel[10].setRotationPoint(-164F, -13F, -19F);
		
		bodyModel[11].addShapeBox(0F, 0F, 0F, 11, 8, 13, 0F, 0F, 0F, -12F, 0F, -1F, -13F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, -1F, -7F); // Import Box72
		bodyModel[11].setRotationPoint(-164F, -13F, 6F);
		
		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[12].setRotationPoint(-170F, -40F, -6F);
		
		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box76
		bodyModel[13].setRotationPoint(-166F, -40F, -19F);
		
		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[14].setRotationPoint(-169F, -40F, -18F);
		
		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 25, 1, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, -1F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, 0F, 0F, -1F, 0F); // Import Box79
		bodyModel[15].setRotationPoint(-174F, -40F, -18F);
		
		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box80
		bodyModel[16].setRotationPoint(-170F, -28F, -19F);
		
		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box81
		bodyModel[17].setRotationPoint(-166F, -40F, 17F);
		
		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 25, 1, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, -1F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, 0F, 0F, -1F, 0F); // Import Box83
		bodyModel[18].setRotationPoint(-174F, -40F, 17F);
		
		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box84
		bodyModel[19].setRotationPoint(-170F, -28F, 17F);
		
		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		bodyModel[20].setRotationPoint(-164F, -33F, -19F);
		
		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 21, 2, 0F, -4F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Import Box89
		bodyModel[21].setRotationPoint(-164F, -33F, -20F);
		
		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 28, 2, 0F, 0F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, -21F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -21F, 0F); // Import Box90
		bodyModel[22].setRotationPoint(-161F, -40F, -20F);
		
		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 29, 2, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, -1F); // Import Box91
		bodyModel[23].setRotationPoint(-161F, -41F, -20F);
		
		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		bodyModel[24].setRotationPoint(-167F, -24F, 18F);
		
		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		bodyModel[25].setRotationPoint(-164F, -33F, 18F);
		
		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 21, 2, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -4F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box95
		bodyModel[26].setRotationPoint(-164F, -33F, 18F);
		
		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 28, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, 0F, 0F, -1F, -1F, -21F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -21F, -1F); // Import Box96
		bodyModel[27].setRotationPoint(-161F, -40F, 18F);
		
		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 29, 2, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, -8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -8F, 0F, 0F); // Import Box97
		bodyModel[28].setRotationPoint(-161F, -41F, 18F);
		
		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 8, 24, 0F, 0F, -7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, 0F, -6F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -6F); // Import Box98
		bodyModel[29].setRotationPoint(-170F, -47F, -12F);
		
		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		bodyModel[30].setRotationPoint(-174F, -40F, -6F);
		
		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		bodyModel[31].setRotationPoint(-170F, -40F, -12F);
		
		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box101
		bodyModel[32].setRotationPoint(-169F, -40F, 12F);
		
		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box102
		bodyModel[33].setRotationPoint(-170F, -40F, 6F);
		
		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 9, 8, 0F, 3F, -2F, -8F, 0F, 0F, -7F, 0F, -3F, -1F, 3F, -3F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, -6F); // Import Box103
		bodyModel[34].setRotationPoint(-161F, -49F, -20F);
		
		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 3, 26, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box104
		bodyModel[35].setRotationPoint(-164F, -49F, -13F);
		
		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 9, 8, 0F, 3F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, -7F, 3F, -2F, -8F, 0F, 0F, -6F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -1F); // Import Box106
		bodyModel[36].setRotationPoint(-161F, -49F, 12F);
		
		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 17, 14, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box107
		bodyModel[37].setRotationPoint(-164F, -64F, -7F);
		
		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 19, 20, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box108
		bodyModel[38].setRotationPoint(-161F, -66F, -10F);
		
		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 20, 22, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box109
		bodyModel[39].setRotationPoint(-159F, -67F, -11F);
		
		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Import Box110
		bodyModel[40].setRotationPoint(-172F, -28F, -18F);
		
		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Import Box111
		bodyModel[41].setRotationPoint(-172F, -28F, 17F);
		
		bodyModel[42].addShapeBox(0F, 0F, 0F, 32, 8, 19, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -14F, 0F, -1F, -11F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box112
		bodyModel[42].setRotationPoint(-153F, -12F, -24F);
		
		bodyModel[43].addShapeBox(0F, 0F, 0F, 32, 8, 19, 0F, 0F, 0F, -14F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -11F); // Import Box113
		bodyModel[43].setRotationPoint(-153F, -12F, 5F);
		
		bodyModel[44].addShapeBox(0F, 0F, 0F, 20, 29, 4, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Import Box114
		bodyModel[44].setRotationPoint(-153F, -41F, -23F);
		
		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 16, 3, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.1F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.1F); // Import Box115
		bodyModel[45].setRotationPoint(-133F, -28F, -23.4F);
		
		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 6, 3, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.1F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.1F); // Import Box116
		bodyModel[46].setRotationPoint(-133F, -41F, -23.4F);
		
		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 29, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.4F); // Import Box117
		bodyModel[47].setRotationPoint(-126F, -41F, -24F);
		
		bodyModel[48].addShapeBox(0F, 0F, 0F, 32, 9, 11, 0F, 0F, -8F, -4F, 0F, -8F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -6F, 0F); // Import Box118
		bodyModel[48].setRotationPoint(-153F, -49F, -24F);
		
		bodyModel[49].addShapeBox(0F, 0F, 0F, 32, 9, 11, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -8F, 0F, 0F, -8F, -4F, 0F, -6F, 0F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box119
		bodyModel[49].setRotationPoint(-153F, -49F, 13F);
		
		bodyModel[50].addShapeBox(0F, 0F, 0F, 32, 4, 32, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F); // Import Box120
		bodyModel[50].setRotationPoint(-153F, -50F, -16F);
		
		bodyModel[51].addShapeBox(0F, 0F, 0F, 155, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		bodyModel[51].setRotationPoint(-121F, -12F, -24F);
		
		bodyModel[52].addShapeBox(0F, 0F, 0F, 155, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box122
		bodyModel[52].setRotationPoint(-121F, -28F, -24F);
		
		bodyModel[53].addShapeBox(0F, 0F, 0F, 155, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		bodyModel[53].setRotationPoint(-121F, -41F, -24F);
		
		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box124
		bodyModel[54].setRotationPoint(-95F, -35F, -24F);
		
		bodyModel[55].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		bodyModel[55].setRotationPoint(-121F, -35F, -24F);
		
		bodyModel[56].addShapeBox(0F, 0F, 0F, 29, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		bodyModel[56].setRotationPoint(-88F, -35F, -24F);
		
		bodyModel[57].addShapeBox(0F, 0F, 0F, 31, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box130
		bodyModel[57].setRotationPoint(-52F, -35F, -24F);
		
		bodyModel[58].addShapeBox(0F, 0F, 0F, 29, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		bodyModel[58].setRotationPoint(-14F, -35F, -24F);
		
		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		bodyModel[59].setRotationPoint(22F, -35F, -24F);
		
		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[60].setRotationPoint(-95F, -30F, -24F);
		
		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		bodyModel[61].setRotationPoint(-90F, -30F, -24F);
		
		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box135
		bodyModel[62].setRotationPoint(-90F, -35F, -24F);
		
		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		bodyModel[63].setRotationPoint(-59F, -30F, -24F);
		
		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		bodyModel[64].setRotationPoint(-54F, -30F, -24F);
		
		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box138
		bodyModel[65].setRotationPoint(-54F, -35F, -24F);
		
		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box139
		bodyModel[66].setRotationPoint(-59F, -35F, -24F);
		
		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		bodyModel[67].setRotationPoint(-21F, -30F, -24F);
		
		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		bodyModel[68].setRotationPoint(-16F, -30F, -24F);
		
		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box142
		bodyModel[69].setRotationPoint(-16F, -35F, -24F);
		
		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box143
		bodyModel[70].setRotationPoint(-21F, -35F, -24F);
		
		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		bodyModel[71].setRotationPoint(15F, -30F, -24F);
		
		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		bodyModel[72].setRotationPoint(20F, -30F, -24F);
		
		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box146
		bodyModel[73].setRotationPoint(20F, -35F, -24F);
		
		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[74].setRotationPoint(15F, -35F, -24F);
		
		bodyModel[75].addShapeBox(0F, 0F, 0F, 152, 22, 6, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		bodyModel[75].setRotationPoint(-118F, -26F, -30F);
		
		bodyModel[76].addShapeBox(0F, 0F, 0F, 147, 18, 4, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		bodyModel[76].setRotationPoint(-113F, -24F, -34F);
		
		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 7, 10, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		bodyModel[77].setRotationPoint(-118F, -18F, -34F);
		
		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F, 0F, -1F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		bodyModel[78].setRotationPoint(-118F, -24F, -34F);
		
		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, -3F, -2F, 0F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		bodyModel[79].setRotationPoint(-118F, -26F, -30F);
		
		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box153
		bodyModel[80].setRotationPoint(-118F, -11F, -34F);
		
		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		bodyModel[81].setRotationPoint(-118F, -7F, -30F);
		
		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box155
		bodyModel[82].setRotationPoint(-121F, -23F, -30F);
		
		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		bodyModel[83].setRotationPoint(-121F, -26F, -28F);
		
		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box157
		bodyModel[84].setRotationPoint(-121F, -18F, -30F);
		
		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F, -3F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box158
		bodyModel[85].setRotationPoint(-121F, -12F, -28F);
		
		bodyModel[86].addShapeBox(0F, 0F, 0F, 155, 10, 8, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import Box159
		bodyModel[86].setRotationPoint(-121F, -50F, -24F);
		
		bodyModel[87].addShapeBox(0F, 0F, 0F, 155, 5, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		bodyModel[87].setRotationPoint(-121F, -50F, -16F);
		
		bodyModel[88].addShapeBox(0F, 0F, 0F, 135, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		bodyModel[88].setRotationPoint(-121F, -52F, -2F);
		
		bodyModel[89].addShapeBox(0F, 0F, 0F, 136, 1, 4, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		bodyModel[89].setRotationPoint(-122F, -53F, -2F);
		
		bodyModel[90].addShapeBox(0F, 0F, 0F, 155, 8, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box163
		bodyModel[90].setRotationPoint(-121F, -12F, 20F);
		
		bodyModel[91].addShapeBox(0F, 0F, 0F, 155, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		bodyModel[91].setRotationPoint(-121F, -28F, 23F);
		
		bodyModel[92].addShapeBox(0F, 0F, 0F, 155, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		bodyModel[92].setRotationPoint(-121F, -41F, 23F);
		
		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box166
		bodyModel[93].setRotationPoint(-95F, -35F, 23F);
		
		bodyModel[94].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		bodyModel[94].setRotationPoint(-121F, -35F, 23F);
		
		bodyModel[95].addShapeBox(0F, 0F, 0F, 29, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		bodyModel[95].setRotationPoint(-88F, -35F, 23F);
		
		bodyModel[96].addShapeBox(0F, 0F, 0F, 31, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		bodyModel[96].setRotationPoint(-52F, -35F, 23F);
		
		bodyModel[97].addShapeBox(0F, 0F, 0F, 29, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		bodyModel[97].setRotationPoint(-14F, -35F, 23F);
		
		bodyModel[98].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		bodyModel[98].setRotationPoint(22F, -35F, 23F);
		
		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		bodyModel[99].setRotationPoint(-95F, -30F, 23F);
		
		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		bodyModel[100].setRotationPoint(-90F, -30F, 23F);
		
		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box174
		bodyModel[101].setRotationPoint(-90F, -35F, 23F);
		
		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		bodyModel[102].setRotationPoint(-59F, -30F, 23F);
		
		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		bodyModel[103].setRotationPoint(-54F, -30F, 23F);
		
		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box177
		bodyModel[104].setRotationPoint(-54F, -35F, 23F);
		
		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box178
		bodyModel[105].setRotationPoint(-59F, -35F, 23F);
		
		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box179
		bodyModel[106].setRotationPoint(-21F, -30F, 23F);
		
		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		bodyModel[107].setRotationPoint(-16F, -30F, 23F);
		
		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box181
		bodyModel[108].setRotationPoint(-16F, -35F, 23F);
		
		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box182
		bodyModel[109].setRotationPoint(-21F, -35F, 23F);
		
		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box183
		bodyModel[110].setRotationPoint(15F, -30F, 23F);
		
		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box184
		bodyModel[111].setRotationPoint(20F, -30F, 23F);
		
		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box185
		bodyModel[112].setRotationPoint(20F, -35F, 23F);
		
		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box186
		bodyModel[113].setRotationPoint(15F, -35F, 23F);
		
		bodyModel[114].addShapeBox(0F, 0F, 0F, 152, 22, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F); // Import Box187
		bodyModel[114].setRotationPoint(-118F, -26F, 24F);
		
		bodyModel[115].addShapeBox(0F, 0F, 0F, 147, 18, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import Box188
		bodyModel[115].setRotationPoint(-113F, -24F, 30F);
		
		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box189
		bodyModel[116].setRotationPoint(-118F, -18F, 24F);
		
		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box190
		bodyModel[117].setRotationPoint(-118F, -24F, 24F);
		
		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box191
		bodyModel[118].setRotationPoint(-118F, -26F, 24F);
		
		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -6F); // Import Box192
		bodyModel[119].setRotationPoint(-118F, -11F, 24F);
		
		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F); // Import Box193
		bodyModel[120].setRotationPoint(-118F, -7F, 24F);
		
		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import Box194
		bodyModel[121].setRotationPoint(-121F, -23F, 24F);
		
		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box195
		bodyModel[122].setRotationPoint(-121F, -26F, 24F);
		
		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F); // Import Box196
		bodyModel[123].setRotationPoint(-121F, -18F, 24F);
		
		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, -3F, -1F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F); // Import Box197
		bodyModel[124].setRotationPoint(-121F, -12F, 24F);
		
		bodyModel[125].addShapeBox(0F, 0F, 0F, 20, 29, 4, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -3F); // Import Box198
		bodyModel[125].setRotationPoint(-153F, -41F, 19F);
		
		bodyModel[126].addShapeBox(0F, 0F, 0F, 7, 16, 3, 0F, 0F, 0F, -1.1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -1.1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Import Box199
		bodyModel[126].setRotationPoint(-133F, -28F, 20.4F);
		
		bodyModel[127].addShapeBox(0F, 0F, 0F, 7, 6, 3, 0F, 0F, 0F, -1.1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -1.1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Import Box200
		bodyModel[127].setRotationPoint(-133F, -41F, 20.4F);
		
		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 29, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F); // Import Box201
		bodyModel[128].setRotationPoint(-126F, -41F, 22F);
		
		bodyModel[129].addShapeBox(0F, 0F, 0F, 155, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		bodyModel[129].setRotationPoint(-121F, -50F, 16F);
		
		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 20, 24, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box203
		bodyModel[130].setRotationPoint(-153F, -68F, -12F);
		
		bodyModel[131].addShapeBox(0F, 0F, 0F, 7, 21, 24, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box204
		bodyModel[131].setRotationPoint(-150F, -69F, -12F);
		
		bodyModel[132].addShapeBox(0F, 0F, 0F, 7, 19, 22, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box205
		bodyModel[132].setRotationPoint(-143F, -68F, -11F);
		
		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 17, 18, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box206
		bodyModel[133].setRotationPoint(-136F, -66F, -9F);
		
		bodyModel[134].addShapeBox(0F, 0F, 0F, 10, 16, 12, 0F, 0F, 0F, 0F, -3F, -1F, -3F, -3F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		bodyModel[134].setRotationPoint(-130F, -65F, -6F);
		
		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208
		bodyModel[135].setRotationPoint(-167F, -24F, -19F);
		
		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.85F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.35F); // Import Box209
		bodyModel[136].setRotationPoint(-169F, -17F, -19F);
		
		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.8F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.3F); // Import Box210
		bodyModel[137].setRotationPoint(-169F, -17F, 18F);
		
		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, 0F, 0F, -0.9F, 0F, 0F, -0.1F, 0F, -2F, -0.35F, 0F, -2F, -0.65F, 0F, 0F, -0.9F); // Import Box211
		bodyModel[138].setRotationPoint(-133F, -35F, 21.4F);
		
		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.1F, 0F, -2F, -0.35F, 0F, -2F, -0.65F, 0F, 0F, -0.9F, 0F, 0F, -0.1F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, 0F, 0F, -0.9F); // Import Box212
		bodyModel[139].setRotationPoint(-133F, -30F, 21.4F);
		
		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Import Box213
		bodyModel[140].setRotationPoint(-128F, -30F, 21.4F);
		
		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.25F); // Import Box214
		bodyModel[141].setRotationPoint(-128F, -35F, 21.4F);
		
		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.65F, 0F, 0F, -0.35F, 0F, 0F, -0.1F, 0F, 0F, -0.9F, 0F, -2F, -0.65F, 0F, -2F, -0.35F, 0F, 0F, -0.1F); // Import Box215
		bodyModel[142].setRotationPoint(-133F, -35F, -23.4F);
		
		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.9F, 0F, -2F, -0.65F, 0F, -2F, -0.35F, 0F, 0F, -0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.65F, 0F, 0F, -0.35F, 0F, 0F, -0.1F); // Import Box216
		bodyModel[143].setRotationPoint(-133F, -30F, -23.4F);
		
		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F); // Import Box217
		bodyModel[144].setRotationPoint(-128F, -30F, -23.4F);
		
		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -0.75F); // Import Box218
		bodyModel[145].setRotationPoint(-128F, -35F, -23.4F);
		
		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 29, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box219
		bodyModel[146].setRotationPoint(-121F, -38F, -23F);
		
		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 29, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box220
		bodyModel[147].setRotationPoint(-121F, -38F, 7F);
		
		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 46, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box221
		bodyModel[148].setRotationPoint(-121F, -41F, -23F);
		
		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 46, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box222
		bodyModel[149].setRotationPoint(-121F, -45F, -23F);
		
		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 26, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box224
		bodyModel[150].setRotationPoint(-146F, -38F, -19F);
		
		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box225
		bodyModel[151].setRotationPoint(-146F, -41F, -19F);
		
		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 5, 38, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box226
		bodyModel[152].setRotationPoint(-146F, -46F, -19F);
		
		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 26, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box227
		bodyModel[153].setRotationPoint(-146F, -38F, 6F);
		
		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box228
		bodyModel[154].setRotationPoint(-146F, -12F, -19F);
		
		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Import Box229
		bodyModel[155].setRotationPoint(-146F, -12F, 6F);
		
		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box344
		bodyModel[156].setRotationPoint(-80F, -8F, -29F);
		
		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 14, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box345
		bodyModel[157].setRotationPoint(-81F, -8F, -29F);
		
		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box346
		bodyModel[158].setRotationPoint(-79F, -8F, -29F);
		
		bodyModel[159].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box347
		bodyModel[159].setRotationPoint(-86F, 2F, -33F);
		
		bodyModel[160].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box348
		bodyModel[160].setRotationPoint(-86F, -2F, -33F);
		
		bodyModel[161].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box349
		bodyModel[161].setRotationPoint(-86F, 6F, -33F);
		
		bodyModel[162].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box350
		bodyModel[162].setRotationPoint(-86F, -2F, -26F);
		
		bodyModel[163].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box351
		bodyModel[163].setRotationPoint(-86F, 6F, -26F);
		
		bodyModel[164].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box352
		bodyModel[164].setRotationPoint(-86F, 2F, -26F);
		
		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box353
		bodyModel[165].setRotationPoint(-80F, -8F, 26F);
		
		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 14, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box354
		bodyModel[166].setRotationPoint(-81F, -8F, 26F);
		
		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box355
		bodyModel[167].setRotationPoint(-79F, -8F, 26F);
		
		bodyModel[168].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box356
		bodyModel[168].setRotationPoint(-86F, 2F, 29F);
		
		bodyModel[169].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box357
		bodyModel[169].setRotationPoint(-86F, -2F, 29F);
		
		bodyModel[170].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box358
		bodyModel[170].setRotationPoint(-86F, 6F, 29F);
		
		bodyModel[171].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box359
		bodyModel[171].setRotationPoint(-86F, -2F, 22F);
		
		bodyModel[172].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box360
		bodyModel[172].setRotationPoint(-86F, 6F, 22F);
		
		bodyModel[173].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box361
		bodyModel[173].setRotationPoint(-86F, 2F, 22F);
		
		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box494
		bodyModel[174].setRotationPoint(-156F, -68F, -3F);
		
		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box495
		bodyModel[175].setRotationPoint(-158F, -68F, -3F);
		
		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box496
		bodyModel[176].setRotationPoint(-154F, -68F, -3F);
		
		bodyModel[177].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[177].setRotationPoint(-116F, -15F, 11F);
		
		bodyModel[178].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[178].setRotationPoint(-116F, -28F, 22F);
		
		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[179].setRotationPoint(-116F, -14F, 11F);
		
		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[180].setRotationPoint(-105F, -14F, 11F);
		
		bodyModel[181].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[181].setRotationPoint(-103F, -28F, 22F);
		
		bodyModel[182].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[182].setRotationPoint(-103F, -15F, 11F);
		
		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[183].setRotationPoint(-103F, -14F, 11F);
		
		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[184].setRotationPoint(-92F, -14F, 11F);
		
		bodyModel[185].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[185].setRotationPoint(-90F, -28F, 22F);
		
		bodyModel[186].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[186].setRotationPoint(-90F, -15F, 11F);
		
		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[187].setRotationPoint(-90F, -14F, 11F);
		
		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[188].setRotationPoint(-79F, -14F, 11F);
		
		bodyModel[189].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[189].setRotationPoint(-77F, -28F, 22F);
		
		bodyModel[190].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[190].setRotationPoint(-51F, -15F, 11F);
		
		bodyModel[191].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[191].setRotationPoint(-51F, -28F, 22F);
		
		bodyModel[192].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		bodyModel[192].setRotationPoint(-64F, -28F, 22F);
		
		bodyModel[193].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		bodyModel[193].setRotationPoint(-64F, -15F, 11F);
		
		bodyModel[194].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[194].setRotationPoint(-77F, -15F, 11F);
		
		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[195].setRotationPoint(-77F, -14F, 11F);
		
		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		bodyModel[196].setRotationPoint(-66F, -14F, 11F);
		
		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[197].setRotationPoint(-64F, -14F, 11F);
		
		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[198].setRotationPoint(-53F, -14F, 11F);
		
		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[199].setRotationPoint(-51F, -14F, 11F);
		
		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[200].setRotationPoint(-40F, -14F, 11F);
		
		bodyModel[201].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[201].setRotationPoint(-38F, -28F, 22F);
		
		bodyModel[202].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[202].setRotationPoint(-12F, -15F, 11F);
		
		bodyModel[203].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[203].setRotationPoint(-12F, -28F, 22F);
		
		bodyModel[204].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		bodyModel[204].setRotationPoint(-25F, -28F, 22F);
		
		bodyModel[205].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box72
		bodyModel[205].setRotationPoint(-25F, -15F, 11F);
		
		bodyModel[206].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[206].setRotationPoint(-38F, -15F, 11F);
		
		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[207].setRotationPoint(-38F, -14F, 11F);
		
		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		bodyModel[208].setRotationPoint(-27F, -14F, 11F);
		
		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		bodyModel[209].setRotationPoint(-25F, -14F, 11F);
		
		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[210].setRotationPoint(-14F, -14F, 11F);
		
		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		bodyModel[211].setRotationPoint(-12F, -14F, 11F);
		
		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		bodyModel[212].setRotationPoint(-1F, -14F, 11F);
		
		bodyModel[213].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		bodyModel[213].setRotationPoint(1F, -28F, 22F);
		
		bodyModel[214].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		bodyModel[214].setRotationPoint(27F, -15F, 11F);
		
		bodyModel[215].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		bodyModel[215].setRotationPoint(27F, -28F, 22F);
		
		bodyModel[216].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		bodyModel[216].setRotationPoint(14F, -28F, 22F);
		
		bodyModel[217].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		bodyModel[217].setRotationPoint(14F, -15F, 11F);
		
		bodyModel[218].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		bodyModel[218].setRotationPoint(1F, -15F, 11F);
		
		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		bodyModel[219].setRotationPoint(1F, -14F, 11F);
		
		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		bodyModel[220].setRotationPoint(12F, -14F, 11F);
		
		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		bodyModel[221].setRotationPoint(14F, -14F, 11F);
		
		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		bodyModel[222].setRotationPoint(25F, -14F, 11F);
		
		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		bodyModel[223].setRotationPoint(27F, -14F, 11F);
		
		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		bodyModel[224].setRotationPoint(38F, -14F, 11F);
		
		bodyModel[225].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box104
		bodyModel[225].setRotationPoint(-116F, -15F, -23F);
		
		bodyModel[226].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		bodyModel[226].setRotationPoint(-116F, -28F, -23F);
		
		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[227].setRotationPoint(-116F, -14F, -12F);
		
		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		bodyModel[228].setRotationPoint(-105F, -14F, -12F);
		
		bodyModel[229].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box114
		bodyModel[229].setRotationPoint(-103F, -28F, -23F);
		
		bodyModel[230].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		bodyModel[230].setRotationPoint(-103F, -15F, -23F);
		
		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		bodyModel[231].setRotationPoint(-103F, -14F, -12F);
		
		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		bodyModel[232].setRotationPoint(-92F, -14F, -12F);
		
		bodyModel[233].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box122
		bodyModel[233].setRotationPoint(-90F, -28F, -23F);
		
		bodyModel[234].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		bodyModel[234].setRotationPoint(-90F, -15F, -23F);
		
		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		bodyModel[235].setRotationPoint(-90F, -14F, -12F);
		
		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
		bodyModel[236].setRotationPoint(-79F, -14F, -12F);
		
		bodyModel[237].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		bodyModel[237].setRotationPoint(-77F, -28F, -23F);
		
		bodyModel[238].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		bodyModel[238].setRotationPoint(-51F, -15F, -23F);
		
		bodyModel[239].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		bodyModel[239].setRotationPoint(-51F, -28F, -23F);
		
		bodyModel[240].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		bodyModel[240].setRotationPoint(-64F, -28F, -23F);
		
		bodyModel[241].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		bodyModel[241].setRotationPoint(-64F, -15F, -23F);
		
		bodyModel[242].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		bodyModel[242].setRotationPoint(-77F, -15F, -23F);
		
		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[243].setRotationPoint(-77F, -14F, -12F);
		
		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[244].setRotationPoint(-66F, -14F, -12F);
		
		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		bodyModel[245].setRotationPoint(-64F, -14F, -12F);
		
		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		bodyModel[246].setRotationPoint(-53F, -14F, -12F);
		
		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		bodyModel[247].setRotationPoint(-51F, -14F, -12F);
		
		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		bodyModel[248].setRotationPoint(-40F, -14F, -12F);
		
		bodyModel[249].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		bodyModel[249].setRotationPoint(-38F, -28F, -23F);
		
		bodyModel[250].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		bodyModel[250].setRotationPoint(-12F, -15F, -23F);
		
		bodyModel[251].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		bodyModel[251].setRotationPoint(-12F, -28F, -23F);
		
		bodyModel[252].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		bodyModel[252].setRotationPoint(-25F, -28F, -23F);
		
		bodyModel[253].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		bodyModel[253].setRotationPoint(-25F, -15F, -23F);
		
		bodyModel[254].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		bodyModel[254].setRotationPoint(-38F, -15F, -23F);
		
		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		bodyModel[255].setRotationPoint(-38F, -14F, -12F);
		
		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		bodyModel[256].setRotationPoint(-27F, -14F, -12F);
		
		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		bodyModel[257].setRotationPoint(-25F, -14F, -12F);
		
		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		bodyModel[258].setRotationPoint(-14F, -14F, -12F);
		
		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		bodyModel[259].setRotationPoint(-12F, -14F, -12F);
		
		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		bodyModel[260].setRotationPoint(-1F, -14F, -12F);
		
		bodyModel[261].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		bodyModel[261].setRotationPoint(1F, -28F, -23F);
		
		bodyModel[262].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		bodyModel[262].setRotationPoint(27F, -15F, -23F);
		
		bodyModel[263].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box190
		bodyModel[263].setRotationPoint(27F, -28F, -23F);
		
		bodyModel[264].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box191
		bodyModel[264].setRotationPoint(14F, -28F, -23F);
		
		bodyModel[265].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box192
		bodyModel[265].setRotationPoint(14F, -15F, -23F);
		
		bodyModel[266].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box193
		bodyModel[266].setRotationPoint(1F, -15F, -23F);
		
		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box194
		bodyModel[267].setRotationPoint(1F, -14F, -12F);
		
		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		bodyModel[268].setRotationPoint(12F, -14F, -12F);
		
		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
		bodyModel[269].setRotationPoint(14F, -14F, -12F);
		
		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box197
		bodyModel[270].setRotationPoint(25F, -14F, -12F);
		
		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box198
		bodyModel[271].setRotationPoint(27F, -14F, -12F);
		
		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box199
		bodyModel[272].setRotationPoint(38F, -14F, -12F);
		
		bodyModel[273].addShapeBox(0F, 0F, 0F, 18, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F); // Import Box135
		bodyModel[273].setRotationPoint(-164F, -15F, -17F);
		
		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 19, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		bodyModel[274].setRotationPoint(-148F, -31F, -17F);
		
		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		bodyModel[275].setRotationPoint(-148F, -35F, -17F);
		
		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		bodyModel[276].setRotationPoint(-148F, -39F, -12.5F);
		
		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		bodyModel[277].setRotationPoint(-148F, -40F, -12.5F);
		
		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		bodyModel[278].setRotationPoint(-151F, -23F, -4F);
		
		bodyModel[279].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		bodyModel[279].setRotationPoint(-158F, -23F, -4F);
		
		bodyModel[280].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		bodyModel[280].setRotationPoint(-164F, -19F, -4F);
		
		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		bodyModel[281].setRotationPoint(-151F, -31F, -4F);
		
		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		bodyModel[282].setRotationPoint(-151F, -31F, -17F);
		
		bodyModel[283].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[283].setRotationPoint(-164F, -19F, -17F);
		
		bodyModel[284].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[284].setRotationPoint(-158F, -23F, -17F);
		
		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		bodyModel[285].setRotationPoint(-151F, -23F, -17F);
		
		bodyModel[286].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		bodyModel[286].setRotationPoint(-164F, -16F, -16F);
		
		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 18, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		bodyModel[287].setRotationPoint(-149F, -31F, -16F);
		
		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		bodyModel[288].setRotationPoint(-149F, -39F, -12F);
		
		bodyModel[289].addShapeBox(0F, 0F, 0F, 18, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F); // Import Box50
		bodyModel[289].setRotationPoint(-164F, -15F, 3F);
		
		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 19, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		bodyModel[290].setRotationPoint(-148F, -31F, 3F);
		
		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[291].setRotationPoint(-148F, -35F, 3F);
		
		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[292].setRotationPoint(-148F, -39F, 7.5F);
		
		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[293].setRotationPoint(-148F, -40F, 7.5F);
		
		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[294].setRotationPoint(-151F, -23F, 3F);
		
		bodyModel[295].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[295].setRotationPoint(-158F, -23F, 3F);
		
		bodyModel[296].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[296].setRotationPoint(-164F, -19F, 3F);
		
		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[297].setRotationPoint(-151F, -31F, 3F);
		
		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[298].setRotationPoint(-151F, -31F, 16F);
		
		bodyModel[299].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		bodyModel[299].setRotationPoint(-164F, -19F, 16F);
		
		bodyModel[300].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		bodyModel[300].setRotationPoint(-158F, -23F, 16F);
		
		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyModel[301].setRotationPoint(-151F, -23F, 16F);
		
		bodyModel[302].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		bodyModel[302].setRotationPoint(-164F, -16F, 4F);
		
		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 18, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[303].setRotationPoint(-149F, -31F, 4F);
		
		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[304].setRotationPoint(-149F, -39F, 8F);
		
		bodyModel[305].addShapeBox(0F, 0F, 0F, 5, 24, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box11
		bodyModel[305].setRotationPoint(-174F, -31F, -6F);
		
		bodyModel[306].addShapeBox(0F, 0F, 0F, 5, 11, 11, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[306].setRotationPoint(-174F, -31F, -17F);
		
		bodyModel[307].addShapeBox(0F, 0F, 0F, 5, 11, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box11
		bodyModel[307].setRotationPoint(-174F, -31F, 6F);
		
		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box9
		bodyModel[308].setRotationPoint(-170F, -14F, -10.5F);
		
		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box11
		bodyModel[309].setRotationPoint(-170F, -14F, 5.5F);
		
		bodyModel[310].addShapeBox(0F, 0F, 0F, 18, 12, 6, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		bodyModel[310].setRotationPoint(-169F, -20F, -3F);
		
		
		noseModel = new ModelRendererTurbo[27];
		noseModel[0] = new ModelRendererTurbo(this, 48, 74, textureX, textureY); // Import Box0
		noseModel[1] = new ModelRendererTurbo(this, 83, 74, textureX, textureY); // Import Box8
		noseModel[2] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Import Box14
		noseModel[3] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Import Box17
		noseModel[4] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Import Box19
		noseModel[5] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Import Box20
		noseModel[6] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Import Box21
		noseModel[7] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Import Box39
		noseModel[8] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Import Box40
		noseModel[9] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Import Box41
		noseModel[10] = new ModelRendererTurbo(this, 108, 74, textureX, textureY); // Import Box42
		noseModel[11] = new ModelRendererTurbo(this, 108, 118, textureX, textureY); // Import Box43
		noseModel[12] = new ModelRendererTurbo(this, 48, 118, textureX, textureY); // Import Box44
		noseModel[13] = new ModelRendererTurbo(this, 161, 74, textureX, textureY); // Import Box45
		noseModel[14] = new ModelRendererTurbo(this, 13, 74, textureX, textureY); // Import Box47
		noseModel[15] = new ModelRendererTurbo(this, 402, 74, textureX, textureY); // Import Box3
		noseModel[16] = new ModelRendererTurbo(this, 13, 118, textureX, textureY); // Import Box49
		noseModel[17] = new ModelRendererTurbo(this, 402, 118, textureX, textureY); // Import Box50
		noseModel[18] = new ModelRendererTurbo(this, 436, 74, textureX, textureY); // Import Box4
		noseModel[19] = new ModelRendererTurbo(this, 436, 118, textureX, textureY); // Import Box52
		noseModel[20] = new ModelRendererTurbo(this, 471, 74, textureX, textureY); // Import Box26
		noseModel[21] = new ModelRendererTurbo(this, 471, 118, textureX, textureY); // Import Box54
		noseModel[22] = new ModelRendererTurbo(this, 290, 74, textureX, textureY); // Import Box10
		noseModel[23] = new ModelRendererTurbo(this, 211, 74, textureX, textureY); // Import Box24
		noseModel[24] = new ModelRendererTurbo(this, 239, 74, textureX, textureY); // Import Box28
		noseModel[25] = new ModelRendererTurbo(this, 211, 118, textureX, textureY); // Import Box85
		noseModel[26] = new ModelRendererTurbo(this, 239, 118, textureX, textureY); // Import Box86
		
		noseModel[0].addShapeBox(0F, 0F, 0F, 4, 6, 10, 0F, -2F, -5F, 0F, -2F, -5F, 0F, -1F, 0F, -3F, 0F, -4F, -1F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, -2F, -3F, 0F, -2F, -1F); // Import Box0
		noseModel[0].setRotationPoint(-187F, -27F, -10F);
		
		noseModel[1].addShapeBox(0F, 0F, 0F, 3, 16, 6, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -6F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, -2F); // Import Box8
		noseModel[1].setRotationPoint(-187F, -27F, -3F);
		
		noseModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box14
		noseModel[2].setRotationPoint(-189F, -21F, -2F);
		
		noseModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		noseModel[3].setRotationPoint(-189F, -23F, -2F);
		
		noseModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Import Box19
		noseModel[4].setRotationPoint(-189F, -20F, -2F);
		
		noseModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box20
		noseModel[5].setRotationPoint(-189F, -23F, -1F);
		
		noseModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box21
		noseModel[6].setRotationPoint(-189F, -20F, -1F);
		
		noseModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box39
		noseModel[7].setRotationPoint(-189F, -21F, 0F);
		
		noseModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Import Box40
		noseModel[8].setRotationPoint(-189F, -23F, 0F);
		
		noseModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Import Box41
		noseModel[9].setRotationPoint(-189F, -20F, 0F);
		
		noseModel[10].addShapeBox(0F, 0F, 0F, 10, 9, 12, 0F, 0F, -9F, -5F, 0F, -6F, 0F, 0F, 0F, -3F, -1F, -4F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, -2F, -3F, -1F, 0F, 0F); // Import Box42
		noseModel[10].setRotationPoint(-185F, -31F, -15F);
		
		noseModel[11].addShapeBox(0F, 0F, 0F, 10, 9, 12, 0F, -1F, -4F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -9F, -5F, -1F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -5F); // Import Box43
		noseModel[11].setRotationPoint(-185F, -31F, 3F);
		
		noseModel[12].addShapeBox(0F, 0F, 0F, 4, 6, 10, 0F, 0F, -4F, -1F, -1F, 0F, -3F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -2F, -1F, -1F, -2F, -3F, -1F, -1F, 0F, -2F, -1F, 0F); // Import Box44
		noseModel[12].setRotationPoint(-187F, -27F, 0F);
		
		noseModel[13].addShapeBox(0F, 0F, 0F, 9, 23, 12, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F); // Import Box45
		noseModel[13].setRotationPoint(-184F, -31F, -6F);
		
		noseModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box47
		noseModel[14].setRotationPoint(-188F, -23F, -10F);
		
		noseModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F); // Import Box3
		noseModel[15].setRotationPoint(-190F, -22F, -10F);
		
		noseModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -3F, -1F, 0F); // Import Box49
		noseModel[16].setRotationPoint(-188F, -23F, 1F);
		
		noseModel[17].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Import Box50
		noseModel[17].setRotationPoint(-190F, -22F, 2F);
		
		noseModel[18].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F, -3F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -7F, 0F, 0F, -7F, -1F, -4F, -1F, -1F, -4F, -1F); // Import Box4
		noseModel[18].setRotationPoint(-188F, -19F, -10F);
		
		noseModel[19].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, -1F, 0F, -3F, -1F, 0F, -1F, -4F, -1F, -1F, -4F, -1F, 0F, 0F, -7F, -4F, 0F, -7F); // Import Box52
		noseModel[19].setRotationPoint(-188F, -19F, 0F);
		
		noseModel[20].addShapeBox(0F, 0F, 0F, 10, 10, 7, 0F, 0F, 0F, 0F, 0F, -9F, -4F, 0F, -9F, -3F, -1F, -3F, 0F, 0F, -10F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, -1F, -5F, 0F); // Import Box26
		noseModel[20].setRotationPoint(-185F, -18F, -10F);
		
		noseModel[21].addShapeBox(0F, 0F, 0F, 10, 10, 7, 0F, -1F, -3F, 0F, 0F, -9F, -3F, 0F, -9F, -4F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -10F, 0F); // Import Box54
		noseModel[21].setRotationPoint(-185F, -18F, 3F);
		
		noseModel[22].addShapeBox(0F, 0F, 0F, 1, 24, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Import Box10
		noseModel[22].setRotationPoint(-175F, -31F, -6F);
		
		noseModel[23].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F); // Import Box24
		noseModel[23].setRotationPoint(-175F, -33F, -15F);
		
		noseModel[24].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F, -1F, -8F, -3F, 0F, -7F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, -3F, 0F, -1F, 0F, -2F, -7F, 0F, 0F, -5F, 0F); // Import Box28
		noseModel[24].setRotationPoint(-174F, -33F, -18F);
		
		noseModel[25].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		noseModel[25].setRotationPoint(-175F, -33F, 6F);
		
		noseModel[26].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -7F, 0F, -1F, -8F, -3F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -1F, 0F, -1F, 0F, -3F); // Import Box86
		noseModel[26].setRotationPoint(-174F, -33F, 6F);
		
		
		tailModel = new ModelRendererTurbo[129];
		tailModel[0] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Import Box35
		tailModel[1] = new ModelRendererTurbo(this, 63, 818, textureX, textureY); // Import Box230
		tailModel[2] = new ModelRendererTurbo(this, 23, 818, textureX, textureY); // Import Box231
		tailModel[3] = new ModelRendererTurbo(this, 104, 818, textureX, textureY); // Import Box232
		tailModel[4] = new ModelRendererTurbo(this, 119, 452, textureX, textureY); // Import Box233
		tailModel[5] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Import Box234
		tailModel[6] = new ModelRendererTurbo(this, 563, 452, textureX, textureY); // Import Box235
		tailModel[7] = new ModelRendererTurbo(this, 604, 452, textureX, textureY); // Import Box236
		tailModel[8] = new ModelRendererTurbo(this, 684, 452, textureX, textureY); // Import Box237
		tailModel[9] = new ModelRendererTurbo(this, 716, 452, textureX, textureY); // Import Box238
		tailModel[10] = new ModelRendererTurbo(this, 98, 550, textureX, textureY); // Import Box239
		tailModel[11] = new ModelRendererTurbo(this, 604, 498, textureX, textureY); // Import Box241
		tailModel[12] = new ModelRendererTurbo(this, 684, 498, textureX, textureY); // Import Box242
		tailModel[13] = new ModelRendererTurbo(this, 716, 498, textureX, textureY); // Import Box243
		tailModel[14] = new ModelRendererTurbo(this, 379, 550, textureX, textureY); // Import Box244
		tailModel[15] = new ModelRendererTurbo(this, 630, 550, textureX, textureY); // Import Box245
		tailModel[16] = new ModelRendererTurbo(this, 804, 550, textureX, textureY); // Import Box246
		tailModel[17] = new ModelRendererTurbo(this, 168, 452, textureX, textureY); // Import Box247
		tailModel[18] = new ModelRendererTurbo(this, 215, 452, textureX, textureY); // Import Box248
		tailModel[19] = new ModelRendererTurbo(this, 563, 498, textureX, textureY); // Import Box249
		tailModel[20] = new ModelRendererTurbo(this, 756, 452, textureX, textureY); // Import Box250
		tailModel[21] = new ModelRendererTurbo(this, 301, 452, textureX, textureY); // Import Box251
		tailModel[22] = new ModelRendererTurbo(this, 215, 498, textureX, textureY); // Import Box252
		tailModel[23] = new ModelRendererTurbo(this, 301, 498, textureX, textureY); // Import Box253
		tailModel[24] = new ModelRendererTurbo(this, 168, 498, textureX, textureY); // Import Box254
		tailModel[25] = new ModelRendererTurbo(this, 341, 452, textureX, textureY); // Import Box255
		tailModel[26] = new ModelRendererTurbo(this, 341, 498, textureX, textureY); // Import Box256
		tailModel[27] = new ModelRendererTurbo(this, 391, 452, textureX, textureY); // Import Box257
		tailModel[28] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Box258
		tailModel[29] = new ModelRendererTurbo(this, 291, 550, textureX, textureY); // Import Box259
		tailModel[30] = new ModelRendererTurbo(this, 119, 498, textureX, textureY); // Import Box260
		tailModel[31] = new ModelRendererTurbo(this, -1, 22, textureX, textureY); // Import Box261
		tailModel[32] = new ModelRendererTurbo(this, 559, 550, textureX, textureY); // Import Box262
		tailModel[33] = new ModelRendererTurbo(this, 766, 550, textureX, textureY); // Import Box263
		tailModel[34] = new ModelRendererTurbo(this, 193, 550, textureX, textureY); // Import Box264
		tailModel[35] = new ModelRendererTurbo(this, 470, 550, textureX, textureY); // Import Box265
		tailModel[36] = new ModelRendererTurbo(this, 698, 550, textureX, textureY); // Import Box266
		tailModel[37] = new ModelRendererTurbo(this, 842, 550, textureX, textureY); // Import Box267
		tailModel[38] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box268
		tailModel[39] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box269
		tailModel[40] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box270
		tailModel[41] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box271
		tailModel[42] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box272
		tailModel[43] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Import Box273
		tailModel[44] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box274
		tailModel[45] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box275
		tailModel[46] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box276
		tailModel[47] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box277
		tailModel[48] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box278
		tailModel[49] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Import Box279
		tailModel[50] = new ModelRendererTurbo(this, 150, 818, textureX, textureY); // Import Box280
		tailModel[51] = new ModelRendererTurbo(this, 239, 818, textureX, textureY); // Import Box281
		tailModel[52] = new ModelRendererTurbo(this, 309, 818, textureX, textureY); // Import Box282
		tailModel[53] = new ModelRendererTurbo(this, 409, 818, textureX, textureY); // Import Box283
		tailModel[54] = new ModelRendererTurbo(this, 480, 818, textureX, textureY); // Import Box284
		tailModel[55] = new ModelRendererTurbo(this, 535, 818, textureX, textureY); // Import Box285
		tailModel[56] = new ModelRendererTurbo(this, 585, 818, textureX, textureY); // Import Box286
		tailModel[57] = new ModelRendererTurbo(this, 531, 893, textureX, textureY); // Import Box287
		tailModel[58] = new ModelRendererTurbo(this, 741, 893, textureX, textureY); // Import Box288
		tailModel[59] = new ModelRendererTurbo(this, 946, 893, textureX, textureY); // Import Box289
		tailModel[60] = new ModelRendererTurbo(this, 478, 893, textureX, textureY); // Import Box290
		tailModel[61] = new ModelRendererTurbo(this, 685, 893, textureX, textureY); // Import Box291
		tailModel[62] = new ModelRendererTurbo(this, 890, 893, textureX, textureY); // Import Box292
		tailModel[63] = new ModelRendererTurbo(this, 586, 893, textureX, textureY); // Import Box293
		tailModel[64] = new ModelRendererTurbo(this, 796, 893, textureX, textureY); // Import Box294
		tailModel[65] = new ModelRendererTurbo(this, 1004, 893, textureX, textureY); // Import Box295
		tailModel[66] = new ModelRendererTurbo(this, 425, 893, textureX, textureY); // Import Box296
		tailModel[67] = new ModelRendererTurbo(this, 639, 893, textureX, textureY); // Import Box297
		tailModel[68] = new ModelRendererTurbo(this, 843, 893, textureX, textureY); // Import Box298
		tailModel[69] = new ModelRendererTurbo(this, 364, 893, textureX, textureY); // Import Box299
		tailModel[70] = new ModelRendererTurbo(this, 332, 893, textureX, textureY); // Import Box300
		tailModel[71] = new ModelRendererTurbo(this, 396, 893, textureX, textureY); // Import Box301
		tailModel[72] = new ModelRendererTurbo(this, 303, 893, textureX, textureY); // Import Box302
		tailModel[73] = new ModelRendererTurbo(this, 174, 893, textureX, textureY); // Import Box303
		tailModel[74] = new ModelRendererTurbo(this, 215, 893, textureX, textureY); // Import Box304
		tailModel[75] = new ModelRendererTurbo(this, 127, 893, textureX, textureY); // Import Box305
		tailModel[76] = new ModelRendererTurbo(this, 256, 893, textureX, textureY); // Import Box306
		tailModel[77] = new ModelRendererTurbo(this, 78, 893, textureX, textureY); // Import Box307
		tailModel[78] = new ModelRendererTurbo(this, 38, 893, textureX, textureY); // Import Box308
		tailModel[79] = new ModelRendererTurbo(this, 1179, 893, textureX, textureY); // Import Box310
		tailModel[80] = new ModelRendererTurbo(this, 1051, 893, textureX, textureY); // Import Box311
		tailModel[81] = new ModelRendererTurbo(this, 1132, 893, textureX, textureY); // Import Box312
		tailModel[82] = new ModelRendererTurbo(this, 1086, 893, textureX, textureY); // Import Box313
		tailModel[83] = new ModelRendererTurbo(this, 1217, 893, textureX, textureY); // Import Box314
		tailModel[84] = new ModelRendererTurbo(this, 531, 928, textureX, textureY); // Import Box315
		tailModel[85] = new ModelRendererTurbo(this, 741, 928, textureX, textureY); // Import Box316
		tailModel[86] = new ModelRendererTurbo(this, 946, 928, textureX, textureY); // Import Box317
		tailModel[87] = new ModelRendererTurbo(this, 478, 928, textureX, textureY); // Import Box318
		tailModel[88] = new ModelRendererTurbo(this, 685, 928, textureX, textureY); // Import Box319
		tailModel[89] = new ModelRendererTurbo(this, 890, 928, textureX, textureY); // Import Box320
		tailModel[90] = new ModelRendererTurbo(this, 586, 928, textureX, textureY); // Import Box321
		tailModel[91] = new ModelRendererTurbo(this, 796, 928, textureX, textureY); // Import Box322
		tailModel[92] = new ModelRendererTurbo(this, 1004, 928, textureX, textureY); // Import Box323
		tailModel[93] = new ModelRendererTurbo(this, 425, 928, textureX, textureY); // Import Box324
		tailModel[94] = new ModelRendererTurbo(this, 639, 928, textureX, textureY); // Import Box325
		tailModel[95] = new ModelRendererTurbo(this, 843, 928, textureX, textureY); // Import Box326
		tailModel[96] = new ModelRendererTurbo(this, 364, 928, textureX, textureY); // Import Box327
		tailModel[97] = new ModelRendererTurbo(this, 332, 928, textureX, textureY); // Import Box328
		tailModel[98] = new ModelRendererTurbo(this, 396, 928, textureX, textureY); // Import Box329
		tailModel[99] = new ModelRendererTurbo(this, 303, 928, textureX, textureY); // Import Box330
		tailModel[100] = new ModelRendererTurbo(this, 174, 928, textureX, textureY); // Import Box331
		tailModel[101] = new ModelRendererTurbo(this, 215, 928, textureX, textureY); // Import Box332
		tailModel[102] = new ModelRendererTurbo(this, 127, 928, textureX, textureY); // Import Box333
		tailModel[103] = new ModelRendererTurbo(this, 256, 928, textureX, textureY); // Import Box334
		tailModel[104] = new ModelRendererTurbo(this, 78, 928, textureX, textureY); // Import Box335
		tailModel[105] = new ModelRendererTurbo(this, 38, 928, textureX, textureY); // Import Box336
		tailModel[106] = new ModelRendererTurbo(this, 1179, 928, textureX, textureY); // Import Box337
		tailModel[107] = new ModelRendererTurbo(this, 1051, 928, textureX, textureY); // Import Box338
		tailModel[108] = new ModelRendererTurbo(this, 1132, 928, textureX, textureY); // Import Box339
		tailModel[109] = new ModelRendererTurbo(this, 1086, 928, textureX, textureY); // Import Box340
		tailModel[110] = new ModelRendererTurbo(this, 1217, 928, textureX, textureY); // Import Box341
		tailModel[111] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box362
		tailModel[112] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box363
		tailModel[113] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box364
		tailModel[114] = new ModelRendererTurbo(this, 54, 1142, textureX, textureY); // Import Box365
		tailModel[115] = new ModelRendererTurbo(this, 54, 1142, textureX, textureY); // Import Box366
		tailModel[116] = new ModelRendererTurbo(this, 54, 1156, textureX, textureY); // Import Box367
		tailModel[117] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box368
		tailModel[118] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box369
		tailModel[119] = new ModelRendererTurbo(this, 0, 1142, textureX, textureY); // Import Box370
		tailModel[120] = new ModelRendererTurbo(this, 54, 1142, textureX, textureY); // Import Box371
		tailModel[121] = new ModelRendererTurbo(this, 54, 1142, textureX, textureY); // Import Box372
		tailModel[122] = new ModelRendererTurbo(this, 54, 1156, textureX, textureY); // Import Box373
		tailModel[123] = new ModelRendererTurbo(this, 0, 893, textureX, textureY); // Import Box491
		tailModel[124] = new ModelRendererTurbo(this, 0, 928, textureX, textureY); // Import Box492
		tailModel[125] = new ModelRendererTurbo(this, 0, 818, textureX, textureY); // Import Box493
		tailModel[126] = new ModelRendererTurbo(this, 0, 1111, textureX, textureY); // Import Box497
		tailModel[127] = new ModelRendererTurbo(this, 0, 1111, textureX, textureY); // Import Box498
		tailModel[128] = new ModelRendererTurbo(this, 0, 1111, textureX, textureY); // Import Box499
		
		tailModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 40, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box35
		tailModel[0].setRotationPoint(34F, -9F, -20F);
		
		tailModel[1].addShapeBox(0F, 0F, 0F, 7, 24, 10, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box230
		tailModel[1].setRotationPoint(14F, -81F, -5F);
		
		tailModel[2].addShapeBox(0F, 0F, 0F, 7, 7, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box231
		tailModel[2].setRotationPoint(14F, -57F, -5F);
		
		tailModel[3].addShapeBox(0F, 0F, 0F, 6, 35, 14, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box232
		tailModel[3].setRotationPoint(21F, -85F, -7F);
		
		tailModel[4].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box233
		tailModel[4].setRotationPoint(34F, -9F, -24F);
		
		tailModel[5].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Import Box234
		tailModel[5].setRotationPoint(34F, -12F, -24F);
		
		tailModel[6].addShapeBox(0F, 0F, 0F, 12, 29, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -3F); // Import Box235
		tailModel[6].setRotationPoint(34F, -41F, -24F);
		
		tailModel[7].addShapeBox(0F, 0F, 0F, 32, 36, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -15F, 0F, -3F, 0F, 0F); // Import Box236
		tailModel[7].setRotationPoint(46F, -44F, -24F);
		
		tailModel[8].addShapeBox(0F, 0F, 0F, 6, 21, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box237
		tailModel[8].setRotationPoint(78F, -44F, -24F);
		
		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 20, 4, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -7F, -4F, 0F, -7F, 0F, 0F, 0F, 0F); // Import Box238
		tailModel[9].setRotationPoint(84F, -46F, -24F);
		
		tailModel[10].addShapeBox(0F, 0F, 0F, 4, 13, 40, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F); // Import Box239
		tailModel[10].setRotationPoint(95F, -46F, -20F);
		
		tailModel[11].addShapeBox(0F, 0F, 0F, 32, 36, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -15F, 0F, 0F, -18F, 0F, 0F, 0F, 0F); // Import Box241
		tailModel[11].setRotationPoint(46F, -44F, 20F);
		
		tailModel[12].addShapeBox(0F, 0F, 0F, 6, 21, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -3F, 0F); // Import Box242
		tailModel[12].setRotationPoint(78F, -44F, 20F);
		
		tailModel[13].addShapeBox(0F, 0F, 0F, 11, 20, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -4F, 0F, -2F, 0F); // Import Box243
		tailModel[13].setRotationPoint(84F, -46F, 20F);
		
		tailModel[14].addShapeBox(0F, 0F, 0F, 2, 10, 38, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F); // Import Box244
		tailModel[14].setRotationPoint(99F, -46F, -19F);
		
		tailModel[15].addShapeBox(0F, 0F, 0F, 2, 7, 28, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, 0F); // Import Box245
		tailModel[15].setRotationPoint(101F, -46F, -14F);
		
		tailModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, 0F); // Import Box246
		tailModel[16].setRotationPoint(103F, -46F, -7F);
		
		tailModel[17].addShapeBox(0F, 0F, 0F, 12, 10, 8, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import Box247
		tailModel[17].setRotationPoint(34F, -50F, -24F);
		
		tailModel[18].addShapeBox(0F, 0F, 0F, 32, 10, 8, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import Box248
		tailModel[18].setRotationPoint(46F, -50F, -24F);
		
		tailModel[19].addShapeBox(0F, 0F, 0F, 12, 29, 4, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		tailModel[19].setRotationPoint(34F, -41F, 20F);
		
		tailModel[20].addShapeBox(0F, 0F, 0F, 50, 5, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box250
		tailModel[20].setRotationPoint(34F, -50F, -16F);
		
		tailModel[21].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import Box251
		tailModel[21].setRotationPoint(78F, -50F, -24F);
		
		tailModel[22].addShapeBox(0F, 0F, 0F, 32, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box252
		tailModel[22].setRotationPoint(46F, -50F, 16F);
		
		tailModel[23].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box253
		tailModel[23].setRotationPoint(78F, -50F, 16F);
		
		tailModel[24].addShapeBox(0F, 0F, 0F, 12, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box254
		tailModel[24].setRotationPoint(34F, -50F, 16F);
		
		tailModel[25].addShapeBox(0F, 0F, 0F, 11, 10, 11, 0F, 0F, -5F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F, -3F); // Import Box255
		tailModel[25].setRotationPoint(84F, -50F, -24F);
		
		tailModel[26].addShapeBox(0F, 0F, 0F, 11, 10, 11, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box256
		tailModel[26].setRotationPoint(84F, -50F, 13F);
		
		tailModel[27].addShapeBox(0F, 0F, 0F, 11, 5, 32, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box257
		tailModel[27].setRotationPoint(84F, -50F, -16F);
		
		tailModel[28].addShapeBox(0F, 0F, 0F, 4, 6, 40, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, -6F); // Import Box258
		tailModel[28].setRotationPoint(95F, -36F, -20F);
		
		tailModel[29].addShapeBox(0F, 0F, 0F, 2, 5, 38, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -3F, -10F, 0F, -3F, -10F, 0F, 0F, -6F); // Import Box259
		tailModel[29].setRotationPoint(99F, -39F, -19F);
		
		tailModel[30].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F); // Import Box260
		tailModel[30].setRotationPoint(34F, -9F, 20F);
		
		tailModel[31].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box261
		tailModel[31].setRotationPoint(34F, -12F, 20F);
		
		tailModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 28, 0F, 0F, -3F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, -4F, -10F, 0F, -4F, -10F, 0F, 0F, -5F); // Import Box262
		tailModel[32].setRotationPoint(101F, -42F, -14F);
		
		tailModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -3F); // Import Box263
		tailModel[33].setRotationPoint(103F, -44F, -7F);
		
		tailModel[34].addShapeBox(0F, 0F, 0F, 4, 4, 40, 0F, 0F, 0F, -7F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box264
		tailModel[34].setRotationPoint(95F, -50F, -20F);
		
		tailModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 38, 0F, 0F, 0F, -7F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box265
		tailModel[35].setRotationPoint(99F, -49F, -19F);
		
		tailModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 28, 0F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Import Box266
		tailModel[36].setRotationPoint(101F, -48F, -14F);
		
		tailModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Import Box267
		tailModel[37].setRotationPoint(103F, -48F, -7F);
		
		tailModel[38].addShapeBox(0F, 0F, 0F, 12, 18, 6, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -8F, -2F, 0F, -3F, 0F, 0F, 0F, -2F); // Import Box268
		tailModel[38].setRotationPoint(34F, -24F, -34F);
		
		tailModel[39].addShapeBox(0F, 0F, 0F, 12, 22, 6, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, -2F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box269
		tailModel[39].setRotationPoint(34F, -26F, -30F);
		
		tailModel[40].addShapeBox(0F, 0F, 0F, 11, 17, 4, 0F, 0F, -1F, 0F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, -2F, 0F, -6.5F, 0F, 0F, 0F, 0F); // Import Box270
		tailModel[40].setRotationPoint(46F, -25F, -28F);
		
		tailModel[41].addShapeBox(0F, 0F, 0F, 11, 17, 6, 0F, 0F, -6F, 0F, 0F, -5F, -4F, 0F, -3F, 0F, 0F, -1F, -2F, 0F, -6F, 0F, 0F, -10F, -4F, 0F, -8F, 0F, 0F, -1F, -2F); // Import Box271
		tailModel[41].setRotationPoint(46F, -25F, -32F);
		
		tailModel[42].addShapeBox(0F, 0F, 0F, 8, 17, 4, 0F, 0F, -3F, -2F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -8F, -2F, 0F, -13F, -4F, 0F, -13F, 0F, 0F, -6.5F, 0F); // Import Box272
		tailModel[42].setRotationPoint(57F, -25F, -28F);
		
		tailModel[43].addShapeBox(0F, 0F, 0F, 8, 6, 4, 0F, 0F, -2F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -5F, -4F, 0F, -5F, 0F, 0F, 0F, -2F); // Import Box273
		tailModel[43].setRotationPoint(57F, -22F, -28F);
		
		tailModel[44].addShapeBox(0F, 0F, 0F, 12, 18, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -8F, -2F, 0F, -5F, 0F); // Import Box274
		tailModel[44].setRotationPoint(34F, -24F, 28F);
		
		tailModel[45].addShapeBox(0F, 0F, 0F, 12, 22, 6, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -2F, 0F, -2F, 0F); // Import Box275
		tailModel[45].setRotationPoint(34F, -26F, 24F);
		
		tailModel[46].addShapeBox(0F, 0F, 0F, 11, 17, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -8F, -2F, 0F, -1F, 0F); // Import Box276
		tailModel[46].setRotationPoint(46F, -25F, 24F);
		
		tailModel[47].addShapeBox(0F, 0F, 0F, 11, 17, 6, 0F, 0F, -1F, -2F, 0F, -3F, 0F, 0F, -5F, -4F, 0F, -6F, 0F, 0F, -1F, -2F, 0F, -8F, 0F, 0F, -10F, -4F, 0F, -6F, 0F); // Import Box277
		tailModel[47].setRotationPoint(46F, -25F, 26F);
		
		tailModel[48].addShapeBox(0F, 0F, 0F, 8, 17, 4, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -3F, -2F, 0F, -6.5F, 0F, 0F, -13F, 0F, 0F, -13F, -4F, 0F, -8F, -2F); // Import Box278
		tailModel[48].setRotationPoint(57F, -25F, 24F);
		
		tailModel[49].addShapeBox(0F, 0F, 0F, 8, 6, 4, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -5F, -4F, 0F, -2F, 0F); // Import Box279
		tailModel[49].setRotationPoint(57F, -22F, 24F);
		
		tailModel[50].addShapeBox(0F, 0F, 0F, 19, 39, 22, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box280
		tailModel[50].setRotationPoint(27F, -89F, -11F);
		
		tailModel[51].addShapeBox(0F, 0F, 0F, 8, 41, 22, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box281
		tailModel[51].setRotationPoint(46F, -91F, -11F);
		
		tailModel[52].addShapeBox(0F, 0F, 0F, 24, 43, 22, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box282
		tailModel[52].setRotationPoint(54F, -93F, -11F);
		
		tailModel[53].addShapeBox(0F, 0F, 0F, 9, 45, 22, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box283
		tailModel[53].setRotationPoint(78F, -94F, -11F);
		
		tailModel[54].addShapeBox(0F, 0F, 0F, 8, 44, 16, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box284
		tailModel[54].setRotationPoint(87F, -94F, -8F);
		
		tailModel[55].addShapeBox(0F, 0F, 0F, 6, 45, 14, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box285
		tailModel[55].setRotationPoint(95F, -92F, -7F);
		
		tailModel[56].addShapeBox(0F, 0F, 0F, 3, 43, 12, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box286
		tailModel[56].setRotationPoint(101F, -89F, -6F);
		
		tailModel[57].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box287
		tailModel[57].setRotationPoint(30F, -64F, -32F);
		
		tailModel[58].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box288
		tailModel[58].setRotationPoint(38F, -64F, -32F);
		
		tailModel[59].addShapeBox(0F, 0F, 0F, 11, 5, 14, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box289
		tailModel[59].setRotationPoint(46F, -63F, -31F);
		
		tailModel[60].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Import Box290
		tailModel[60].setRotationPoint(30F, -58F, -32F);
		
		tailModel[61].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F); // Import Box291
		tailModel[61].setRotationPoint(38F, -58F, -32F);
		
		tailModel[62].addShapeBox(0F, 0F, 0F, 11, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -2F); // Import Box292
		tailModel[62].setRotationPoint(46F, -58F, -31F);
		
		tailModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Import Box293
		tailModel[63].setRotationPoint(30F, -65F, -32F);
		
		tailModel[64].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F); // Import Box294
		tailModel[64].setRotationPoint(38F, -65F, -30F);
		
		tailModel[65].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F); // Import Box295
		tailModel[65].setRotationPoint(46F, -65F, -29F);
		
		tailModel[66].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Import Box296
		tailModel[66].setRotationPoint(30F, -52F, -32F);
		
		tailModel[67].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Import Box297
		tailModel[67].setRotationPoint(38F, -53F, -30F);
		
		tailModel[68].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, -1F, -5F); // Import Box298
		tailModel[68].setRotationPoint(46F, -53F, -29F);
		
		tailModel[69].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box299
		tailModel[69].setRotationPoint(28F, -62F, -30F);
		
		tailModel[70].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box300
		tailModel[70].setRotationPoint(28F, -58F, -30F);
		
		tailModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box301
		tailModel[71].setRotationPoint(28F, -64F, -28F);
		
		tailModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F); // Import Box302
		tailModel[72].setRotationPoint(28F, -54F, -28F);
		
		tailModel[73].addShapeBox(0F, 0F, 0F, 10, 10, 6, 0F, 0F, -10F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box303
		tailModel[73].setRotationPoint(18F, -68F, -30F);
		
		tailModel[74].addShapeBox(0F, 0F, 0F, 10, 10, 6, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import Box304
		tailModel[74].setRotationPoint(18F, -68F, -24F);
		
		tailModel[75].addShapeBox(0F, 0F, 0F, 10, 8, 10, 0F, 0F, -8F, -10F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, -8F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Import Box305
		tailModel[75].setRotationPoint(18F, -66F, -34F);
		
		tailModel[76].addShapeBox(0F, 0F, 0F, 10, 8, 10, 0F, 0F, -8F, 0F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, -8F, -10F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 3F, 0F, 0F, 0F, -10F); // Import Box306
		tailModel[76].setRotationPoint(18F, -66F, -24F);
		
		tailModel[77].addShapeBox(0F, 0F, 0F, 10, 8, 10, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -8F, -10F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, -8F, 0F); // Import Box307
		tailModel[77].setRotationPoint(18F, -58F, -34F);
		
		tailModel[78].addShapeBox(0F, 0F, 0F, 10, 10, 6, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -6F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -10F, 0F); // Import Box308
		tailModel[78].setRotationPoint(18F, -58F, -30F);
		
		tailModel[79].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F, 0F, -2F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -2F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box310
		tailModel[79].setRotationPoint(57F, -65F, -29F);
		
		tailModel[80].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -2F, -5F); // Import Box311
		tailModel[80].setRotationPoint(57F, -54F, -29F);
		
		tailModel[81].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F); // Import Box312
		tailModel[81].setRotationPoint(57F, -62F, -30F);
		
		tailModel[82].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F); // Import Box313
		tailModel[82].setRotationPoint(57F, -58F, -30F);
		
		tailModel[83].addShapeBox(0F, 0F, 0F, 19, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -5F, 1F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box314
		tailModel[83].setRotationPoint(31F, -58F, -19F);
		
		tailModel[84].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box315
		tailModel[84].setRotationPoint(30F, -64F, 16F);
		
		tailModel[85].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box316
		tailModel[85].setRotationPoint(38F, -64F, 16F);
		
		tailModel[86].addShapeBox(0F, 0F, 0F, 11, 5, 14, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box317
		tailModel[86].setRotationPoint(46F, -63F, 17F);
		
		tailModel[87].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Import Box318
		tailModel[87].setRotationPoint(30F, -58F, 16F);
		
		tailModel[88].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F); // Import Box319
		tailModel[88].setRotationPoint(38F, -58F, 16F);
		
		tailModel[89].addShapeBox(0F, 0F, 0F, 11, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -2F); // Import Box320
		tailModel[89].setRotationPoint(46F, -58F, 17F);
		
		tailModel[90].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Import Box321
		tailModel[90].setRotationPoint(30F, -65F, 16F);
		
		tailModel[91].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F); // Import Box322
		tailModel[91].setRotationPoint(38F, -65F, 18F);
		
		tailModel[92].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F); // Import Box323
		tailModel[92].setRotationPoint(46F, -65F, 19F);
		
		tailModel[93].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Import Box324
		tailModel[93].setRotationPoint(30F, -52F, 16F);
		
		tailModel[94].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Import Box325
		tailModel[94].setRotationPoint(38F, -53F, 18F);
		
		tailModel[95].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, -1F, -5F); // Import Box326
		tailModel[95].setRotationPoint(46F, -53F, 19F);
		
		tailModel[96].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box327
		tailModel[96].setRotationPoint(28F, -62F, 18F);
		
		tailModel[97].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box328
		tailModel[97].setRotationPoint(28F, -58F, 18F);
		
		tailModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box329
		tailModel[98].setRotationPoint(28F, -64F, 20F);
		
		tailModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F); // Import Box330
		tailModel[99].setRotationPoint(28F, -54F, 20F);
		
		tailModel[100].addShapeBox(0F, 0F, 0F, 10, 10, 6, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import Box331
		tailModel[100].setRotationPoint(18F, -68F, 24F);
		
		tailModel[101].addShapeBox(0F, 0F, 0F, 10, 10, 6, 0F, 0F, -10F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box332
		tailModel[101].setRotationPoint(18F, -68F, 18F);
		
		tailModel[102].addShapeBox(0F, 0F, 0F, 10, 8, 10, 0F, 0F, -8F, 0F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, -8F, -10F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -10F); // Import Box333
		tailModel[102].setRotationPoint(18F, -66F, 24F);
		
		tailModel[103].addShapeBox(0F, 0F, 0F, 10, 8, 10, 0F, 0F, -8F, -10F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, -8F, 0F, 0F, 0F, -10F, 0F, 3F, 0F, 0F, 3F, -6F, 0F, 0F, 0F); // Import Box334
		tailModel[103].setRotationPoint(18F, -66F, 14F);
		
		tailModel[104].addShapeBox(0F, 0F, 0F, 10, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -8F, 0F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, -8F, -10F); // Import Box335
		tailModel[104].setRotationPoint(18F, -58F, 24F);
		
		tailModel[105].addShapeBox(0F, 0F, 0F, 10, 10, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -10F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -10F, -6F); // Import Box336
		tailModel[105].setRotationPoint(18F, -58F, 24F);
		
		tailModel[106].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F, 0F, -2F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -2F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box337
		tailModel[106].setRotationPoint(57F, -65F, 19F);
		
		tailModel[107].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -2F, -5F); // Import Box338
		tailModel[107].setRotationPoint(57F, -54F, 19F);
		
		tailModel[108].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box339
		tailModel[108].setRotationPoint(57F, -62F, 16F);
		
		tailModel[109].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F); // Import Box340
		tailModel[109].setRotationPoint(57F, -58F, 16F);
		
		tailModel[110].addShapeBox(0F, 0F, 0F, 19, 9, 8, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -5F, 1F, 0F, -3F, 0F); // Import Box341
		tailModel[110].setRotationPoint(31F, -58F, 11F);
		
		tailModel[111].addShapeBox(0F, 0F, 0F, 1, 19, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box362
		tailModel[111].setRotationPoint(45F, -13F, -29F);
		
		tailModel[112].addShapeBox(0F, 0F, 0F, 1, 19, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box363
		tailModel[112].setRotationPoint(47F, -13F, -29F);
		
		tailModel[113].addShapeBox(0F, 0F, 0F, 1, 19, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box364
		tailModel[113].setRotationPoint(46F, -13F, -29F);
		
		tailModel[114].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box365
		tailModel[114].setRotationPoint(40F, -2F, -33F);
		
		tailModel[115].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box366
		tailModel[115].setRotationPoint(40F, 6F, -33F);
		
		tailModel[116].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box367
		tailModel[116].setRotationPoint(40F, 2F, -33F);
		
		tailModel[117].addShapeBox(0F, 0F, 0F, 1, 19, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box368
		tailModel[117].setRotationPoint(45F, -13F, 26F);
		
		tailModel[118].addShapeBox(0F, 0F, 0F, 1, 19, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box369
		tailModel[118].setRotationPoint(47F, -13F, 26F);
		
		tailModel[119].addShapeBox(0F, 0F, 0F, 1, 19, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box370
		tailModel[119].setRotationPoint(46F, -13F, 26F);
		
		tailModel[120].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box371
		tailModel[120].setRotationPoint(40F, -2F, 29F);
		
		tailModel[121].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box372
		tailModel[121].setRotationPoint(40F, 6F, 29F);
		
		tailModel[122].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box373
		tailModel[122].setRotationPoint(40F, 2F, 29F);
		
		tailModel[123].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.9F, 0F, -3.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -3F, -0.5F, -1.5F); // Import Box491
		tailModel[123].setRotationPoint(18F, -58F, -25F);
		
		tailModel[124].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F, -3F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, -3.3F, 0F, -0.3F); // Import Box492
		tailModel[124].setRotationPoint(18F, -58F, 21F);
		
		tailModel[125].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box493
		tailModel[125].setRotationPoint(12F, -57F, -3F);
		
		tailModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box497
		tailModel[126].setRotationPoint(69F, -94F, -3F);
		
		tailModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box498
		tailModel[127].setRotationPoint(67F, -94F, -3F);
		
		tailModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box499
		tailModel[128].setRotationPoint(71F, -94F, -3F);
		
		
		yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this, 22, 983, textureX, textureY); // Import Box10
		yawFlapModel[1] = new ModelRendererTurbo(this, 22, 983, textureX, textureY); // Import Box12
		
		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box10
		yawFlapModel[0].setRotationPoint(-168F, -14F, -9.5F);
		yawFlapModel[0].rotateAngleZ = 0.76794487F;
		
		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box12
		yawFlapModel[1].setRotationPoint(-168F, -14F, 8.5F);
		yawFlapModel[1].rotateAngleZ = 0.76794487F;
		
		
		tailDoorOpenModel = new ModelRendererTurbo[3];
		tailDoorOpenModel[0] = new ModelRendererTurbo(this, 0, 617, textureX, textureY); // Import Box342
		tailDoorOpenModel[1] = new ModelRendererTurbo(this, 193, 617, textureX, textureY); // Import Box0
		tailDoorOpenModel[2] = new ModelRendererTurbo(this, 193, 617, textureX, textureY); // Import Box1
		
		tailDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 53, 12, 40, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, 0F, -11F, 0F); // Import Box342
		tailDoorOpenModel[0].setRotationPoint(49F, -9F, -20F);
		tailDoorOpenModel[0].rotateAngleZ = -0.13962634F;
		
		tailDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 2, 50, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		tailDoorOpenModel[1].setRotationPoint(48F, -37F, -20F);
		tailDoorOpenModel[1].rotateAngleY = -0.01745329F;
		tailDoorOpenModel[1].rotateAngleZ = 0.68067841F;
		
		tailDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 2, 50, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tailDoorOpenModel[2].setRotationPoint(48F, -37F, 18F);
		tailDoorOpenModel[2].rotateAngleY = -0.01745329F;
		tailDoorOpenModel[2].rotateAngleZ = 0.68067841F;
		
		
		tailDoorCloseModel = new ModelRendererTurbo[1];
		tailDoorCloseModel[0] = new ModelRendererTurbo(this, 0, 617, textureX, textureY); // Import Box343
		
		tailDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 53, 12, 40, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -4F, -0.35F, -6F, -4F, -0.35F, -6F, 0F, -11F, 0F); // Import Box343
		tailDoorCloseModel[0].setRotationPoint(49F, -9F, -20F);
		tailDoorCloseModel[0].rotateAngleZ = 0.66322512F;
		
		
		heliMainRotorModels = new ModelRendererTurbo[2][];
		heliMainRotorModels[0] = new ModelRendererTurbo[25];
		heliMainRotorModels[1] = new ModelRendererTurbo[25];
		heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 22, 1111, textureX, textureY); // FrontRotor1
		heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 35, 1111, textureX, textureY); // FrontRotor2
		heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // FrontRotor3
		heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 96, 1111, textureX, textureY); // FrontRotor4
		heliMainRotorModels[0][4] = new ModelRendererTurbo(this, 125, 1111, textureX, textureY); // FrontRotor5
		heliMainRotorModels[0][5] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // FrontRotor6
		heliMainRotorModels[0][6] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // FrontRotor7
		heliMainRotorModels[0][7] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // FrontRotor8
		heliMainRotorModels[0][8] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // FrontRotor9
		heliMainRotorModels[0][9] = new ModelRendererTurbo(this, 35, 1111, textureX, textureY); // FrontRotor10
		heliMainRotorModels[0][10] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // FrontRotor11
		heliMainRotorModels[0][11] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // FrontRotor12
		heliMainRotorModels[0][12] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // FrontRotor13
		heliMainRotorModels[0][13] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // FrontRotor14
		heliMainRotorModels[0][14] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // FrontRotor15
		heliMainRotorModels[0][15] = new ModelRendererTurbo(this, 96, 1111, textureX, textureY); // FrontRotor16
		heliMainRotorModels[0][16] = new ModelRendererTurbo(this, 125, 1111, textureX, textureY); // FrontRotor17
		heliMainRotorModels[0][17] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // FrontRotor18
		heliMainRotorModels[0][18] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // FrontRotor19
		heliMainRotorModels[0][19] = new ModelRendererTurbo(this, 96, 1111, textureX, textureY); // FrontRotor20
		heliMainRotorModels[0][20] = new ModelRendererTurbo(this, 125, 1111, textureX, textureY); // FrontRotor21
		heliMainRotorModels[0][21] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // FrontRotor22
		heliMainRotorModels[0][22] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // FrontRotor23
		heliMainRotorModels[0][23] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // FrontRotor24
		heliMainRotorModels[0][24] = new ModelRendererTurbo(this, 35, 1111, textureX, textureY); // FrontRotor25
		heliMainRotorModels[1][0] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // BackRotor1
		heliMainRotorModels[1][1] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // BackRotor2
		heliMainRotorModels[1][2] = new ModelRendererTurbo(this, 96, 1111, textureX, textureY); // BackRotor3
		heliMainRotorModels[1][3] = new ModelRendererTurbo(this, 125, 1111, textureX, textureY); // BackRotor4
		heliMainRotorModels[1][4] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // BackRotor5
		heliMainRotorModels[1][5] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // BackRotor6
		heliMainRotorModels[1][6] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // BackRotor7
		heliMainRotorModels[1][7] = new ModelRendererTurbo(this, 35, 1111, textureX, textureY); // BackRotor8
		heliMainRotorModels[1][8] = new ModelRendererTurbo(this, 35, 1111, textureX, textureY); // BackRotor9
		heliMainRotorModels[1][9] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // BackRotor10
		heliMainRotorModels[1][10] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // BackRotor11
		heliMainRotorModels[1][11] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // BackRotor12
		heliMainRotorModels[1][12] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // BackRotor13
		heliMainRotorModels[1][13] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // BackRotor14
		heliMainRotorModels[1][14] = new ModelRendererTurbo(this, 96, 1111, textureX, textureY); // BackRotor15
		heliMainRotorModels[1][15] = new ModelRendererTurbo(this, 125, 1111, textureX, textureY); // BackRotor16
		heliMainRotorModels[1][16] = new ModelRendererTurbo(this, 125, 1111, textureX, textureY); // BackRotor17
		heliMainRotorModels[1][17] = new ModelRendererTurbo(this, 96, 1111, textureX, textureY); // BackRotor18
		heliMainRotorModels[1][18] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // BackRotor19
		heliMainRotorModels[1][19] = new ModelRendererTurbo(this, 71, 1111, textureX, textureY); // BackRotor20
		heliMainRotorModels[1][20] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // BackRotor21
		heliMainRotorModels[1][21] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // BackRotor22
		heliMainRotorModels[1][22] = new ModelRendererTurbo(this, 52, 1111, textureX, textureY); // BackRotor23
		heliMainRotorModels[1][23] = new ModelRendererTurbo(this, 35, 1111, textureX, textureY); // BackRotor24
		heliMainRotorModels[1][24] = new ModelRendererTurbo(this, 22, 1111, textureX, textureY); // BackRotor25
		
		heliMainRotorModels[0][0].addShapeBox(-1F, 0F, -1F, 2, 20, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor1
		heliMainRotorModels[0][0].setRotationPoint(-155F, -74F, 0F);
		
		heliMainRotorModels[0][1].addShapeBox(1F, 0F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor2
		heliMainRotorModels[0][1].setRotationPoint(-155F, -73F, 0F);
		
		heliMainRotorModels[0][2].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor3
		heliMainRotorModels[0][2].setRotationPoint(-155F, -72.5F, 0F);
		
		heliMainRotorModels[0][3].addShapeBox(15F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor4
		heliMainRotorModels[0][3].setRotationPoint(-155F, -72.5F, 0F);
		
		heliMainRotorModels[0][4].addShapeBox(23F, 0F, -1F, 145, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor5
		heliMainRotorModels[0][4].setRotationPoint(-155F, -73.5F, 0F);
		
		heliMainRotorModels[0][5].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor6
		heliMainRotorModels[0][5].setRotationPoint(-155F, -73.5F, 0F);
		
		heliMainRotorModels[0][6].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // FrontRotor7
		heliMainRotorModels[0][6].setRotationPoint(-155F, -71.5F, 0F);
		
		heliMainRotorModels[0][7].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor8
		heliMainRotorModels[0][7].setRotationPoint(-155F, -73F, 0F);
		
		heliMainRotorModels[0][8].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // FrontRotor9
		heliMainRotorModels[0][8].setRotationPoint(-155F, -72F, 0F);
		
		heliMainRotorModels[0][9].addShapeBox(1F, 0F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor10
		heliMainRotorModels[0][9].setRotationPoint(-155F, -73F, 0F);
		heliMainRotorModels[0][9].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[0][10].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor11
		heliMainRotorModels[0][10].setRotationPoint(-155F, -73.5F, 0F);
		heliMainRotorModels[0][10].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[0][11].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor12
		heliMainRotorModels[0][11].setRotationPoint(-155F, -72.5F, 0F);
		heliMainRotorModels[0][11].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[0][12].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // FrontRotor13
		heliMainRotorModels[0][12].setRotationPoint(-155F, -71.5F, 0F);
		heliMainRotorModels[0][12].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[0][13].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor14
		heliMainRotorModels[0][13].setRotationPoint(-155F, -73F, 0F);
		heliMainRotorModels[0][13].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[0][14].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // FrontRotor15
		heliMainRotorModels[0][14].setRotationPoint(-155F, -72F, 0F);
		heliMainRotorModels[0][14].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[0][15].addShapeBox(15F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor16
		heliMainRotorModels[0][15].setRotationPoint(-155F, -72.5F, 0F);
		heliMainRotorModels[0][15].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[0][16].addShapeBox(23F, 0F, -1F, 145, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor17
		heliMainRotorModels[0][16].setRotationPoint(-155F, -73.5F, 0F);
		heliMainRotorModels[0][16].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[0][17].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor18
		heliMainRotorModels[0][17].setRotationPoint(-155F, -73F, 0F);
		heliMainRotorModels[0][17].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[0][18].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // FrontRotor19
		heliMainRotorModels[0][18].setRotationPoint(-155F, -72F, 0F);
		heliMainRotorModels[0][18].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[0][19].addShapeBox(15F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor20
		heliMainRotorModels[0][19].setRotationPoint(-155F, -72.5F, 0F);
		heliMainRotorModels[0][19].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[0][20].addShapeBox(23F, 0F, -1F, 145, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor21
		heliMainRotorModels[0][20].setRotationPoint(-155F, -73.5F, 0F);
		heliMainRotorModels[0][20].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[0][21].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor22
		heliMainRotorModels[0][21].setRotationPoint(-155F, -73.5F, 0F);
		heliMainRotorModels[0][21].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[0][22].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor23
		heliMainRotorModels[0][22].setRotationPoint(-155F, -72.5F, 0F);
		heliMainRotorModels[0][22].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[0][23].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // FrontRotor24
		heliMainRotorModels[0][23].setRotationPoint(-155F, -71.5F, 0F);
		heliMainRotorModels[0][23].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[0][24].addShapeBox(1F, 0F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FrontRotor25
		heliMainRotorModels[0][24].setRotationPoint(-155F, -73F, 0F);
		heliMainRotorModels[0][24].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[1][0].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor1
		heliMainRotorModels[1][0].setRotationPoint(70F, -98F, 0F);
		heliMainRotorModels[1][0].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[1][1].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // BackRotor2
		heliMainRotorModels[1][1].setRotationPoint(70F, -97F, 0F);
		heliMainRotorModels[1][1].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[1][2].addShapeBox(15F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor3
		heliMainRotorModels[1][2].setRotationPoint(70F, -97.5F, 0F);
		heliMainRotorModels[1][2].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[1][3].addShapeBox(23F, 0F, -1F, 145, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor4
		heliMainRotorModels[1][3].setRotationPoint(70F, -98.5F, 0F);
		heliMainRotorModels[1][3].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[1][4].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor5
		heliMainRotorModels[1][4].setRotationPoint(70F, -98.5F, 0F);
		heliMainRotorModels[1][4].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[1][5].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor6
		heliMainRotorModels[1][5].setRotationPoint(70F, -97.5F, 0F);
		heliMainRotorModels[1][5].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[1][6].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // BackRotor7
		heliMainRotorModels[1][6].setRotationPoint(70F, -96.5F, 0F);
		heliMainRotorModels[1][6].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[1][7].addShapeBox(1F, 0F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor8
		heliMainRotorModels[1][7].setRotationPoint(70F, -98F, 0F);
		heliMainRotorModels[1][7].rotateAngleY = 2.0943951F;
		
		heliMainRotorModels[1][8].addShapeBox(1F, 0F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor9
		heliMainRotorModels[1][8].setRotationPoint(70F, -98F, 0F);
		heliMainRotorModels[1][8].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[1][9].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor10
		heliMainRotorModels[1][9].setRotationPoint(70F, -98.5F, 0F);
		heliMainRotorModels[1][9].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[1][10].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor11
		heliMainRotorModels[1][10].setRotationPoint(70F, -97.5F, 0F);
		heliMainRotorModels[1][10].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[1][11].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // BackRotor12
		heliMainRotorModels[1][11].setRotationPoint(70F, -96.5F, 0F);
		heliMainRotorModels[1][11].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[1][12].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor13
		heliMainRotorModels[1][12].setRotationPoint(70F, -98F, 0F);
		heliMainRotorModels[1][12].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[1][13].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // BackRotor14
		heliMainRotorModels[1][13].setRotationPoint(70F, -97F, 0F);
		heliMainRotorModels[1][13].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[1][14].addShapeBox(15F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor15
		heliMainRotorModels[1][14].setRotationPoint(70F, -97.5F, 0F);
		heliMainRotorModels[1][14].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[1][15].addShapeBox(23F, 0F, -1F, 145, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor16
		heliMainRotorModels[1][15].setRotationPoint(70F, -98.5F, 0F);
		heliMainRotorModels[1][15].rotateAngleY = -2.0943951F;
		
		heliMainRotorModels[1][16].addShapeBox(23F, 0F, -1F, 145, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor17
		heliMainRotorModels[1][16].setRotationPoint(70F, -98.5F, 0F);
		
		heliMainRotorModels[1][17].addShapeBox(15F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor18
		heliMainRotorModels[1][17].setRotationPoint(70F, -97.5F, 0F);
		
		heliMainRotorModels[1][18].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor19
		heliMainRotorModels[1][18].setRotationPoint(70F, -98F, 0F);
		
		heliMainRotorModels[1][19].addShapeBox(7F, 0F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // BackRotor20
		heliMainRotorModels[1][19].setRotationPoint(70F, -97F, 0F);
		
		heliMainRotorModels[1][20].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor21
		heliMainRotorModels[1][20].setRotationPoint(70F, -98.5F, 0F);
		
		heliMainRotorModels[1][21].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // BackRotor22
		heliMainRotorModels[1][21].setRotationPoint(70F, -96.5F, 0F);
		
		heliMainRotorModels[1][22].addShapeBox(4F, 0F, -1.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor23
		heliMainRotorModels[1][22].setRotationPoint(70F, -97.5F, 0F);
		
		heliMainRotorModels[1][23].addShapeBox(1F, 0F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor24
		heliMainRotorModels[1][23].setRotationPoint(70F, -98F, 0F);
		
		heliMainRotorModels[1][24].addShapeBox(-1F, 0F, -1F, 2, 20, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BackRotor25
		heliMainRotorModels[1][24].setRotationPoint(70F, -99F, 0F);
		
		heliMainRotorOrigins = new Vector3f[]{new Vector3f(-155F / 16F, 74F / 16F, 0F), new Vector3f(70F / 16F, 99F / 16F, 0F)};
		
		heliRotorSpeeds = new float[]{1F, -1F};
		
		
		translateAll(0F, 0F, 0F);
		
		flipAll();
	}
}
