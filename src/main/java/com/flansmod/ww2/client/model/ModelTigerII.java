//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.07.2015 - 13:34:02
// Last changed on: 12.07.2015 - 13:34:02

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelTigerII extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	public ModelTigerII() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[293];
		turretModel = new ModelRendererTurbo[120];
		barrelModel = new ModelRendererTurbo[29];
		leftTrackWheelModels = new ModelRendererTurbo[45];
		rightTrackWheelModels = new ModelRendererTurbo[45];
		leftTrackModel = new ModelRendererTurbo[33];
		rightTrackModel = new ModelRendererTurbo[11];
		
		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
	
	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 7
		bodyModel[21] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 14
		bodyModel[22] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 15
		bodyModel[23] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 16
		bodyModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 48
		bodyModel[31] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 49
		bodyModel[32] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 53
		bodyModel[36] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 1
		bodyModel[38] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 3
		bodyModel[40] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 27
		bodyModel[41] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 28
		bodyModel[42] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 30
		bodyModel[43] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 32
		bodyModel[44] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 34
		bodyModel[45] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 36
		bodyModel[46] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 39
		bodyModel[47] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 40
		bodyModel[48] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 41
		bodyModel[49] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 43
		bodyModel[50] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 1
		bodyModel[52] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 3
		bodyModel[54] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 15
		bodyModel[55] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 16
		bodyModel[56] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 17
		bodyModel[57] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[58] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 19
		bodyModel[59] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 20
		bodyModel[60] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 21
		bodyModel[61] = new ModelRendererTurbo(this, 116, 27, textureX, textureY); // Box 404
		bodyModel[62] = new ModelRendererTurbo(this, 74, 31, textureX, textureY); // Box 405
		bodyModel[63] = new ModelRendererTurbo(this, 74, 31, textureX, textureY); // Box 406
		bodyModel[64] = new ModelRendererTurbo(this, 68, 27, textureX, textureY); // Box 407
		bodyModel[65] = new ModelRendererTurbo(this, 84, 31, textureX, textureY); // Box 413
		bodyModel[66] = new ModelRendererTurbo(this, 116, 27, textureX, textureY); // Box 27
		bodyModel[67] = new ModelRendererTurbo(this, 75, 32, textureX, textureY); // Box 28
		bodyModel[68] = new ModelRendererTurbo(this, 74, 31, textureX, textureY); // Box 29
		bodyModel[69] = new ModelRendererTurbo(this, 74, 31, textureX, textureY); // Box 30
		bodyModel[70] = new ModelRendererTurbo(this, 68, 27, textureX, textureY); // Box 31
		bodyModel[71] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 95
		bodyModel[72] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 96
		bodyModel[73] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 97
		bodyModel[74] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 98
		bodyModel[75] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 100
		bodyModel[76] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 103
		bodyModel[77] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 106
		bodyModel[78] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 108
		bodyModel[79] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 109
		bodyModel[80] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 110
		bodyModel[81] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 111
		bodyModel[82] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 49
		bodyModel[83] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 50
		bodyModel[84] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 51
		bodyModel[85] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 52
		bodyModel[86] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 53
		bodyModel[87] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 54
		bodyModel[88] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 55
		bodyModel[89] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 56
		bodyModel[90] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 57
		bodyModel[91] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 58
		bodyModel[92] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 59
		bodyModel[93] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 60
		bodyModel[94] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 61
		bodyModel[95] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 62
		bodyModel[96] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 63
		bodyModel[97] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 64
		bodyModel[98] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 65
		bodyModel[99] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 66
		bodyModel[100] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 67
		bodyModel[101] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 73
		bodyModel[102] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 74
		bodyModel[103] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 75
		bodyModel[104] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 76
		bodyModel[105] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 77
		bodyModel[106] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 78
		bodyModel[107] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 79
		bodyModel[108] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 80
		bodyModel[109] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 81
		bodyModel[110] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 83
		bodyModel[111] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 84
		bodyModel[112] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 85
		bodyModel[113] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 86
		bodyModel[114] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 87
		bodyModel[115] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 88
		bodyModel[116] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 89
		bodyModel[117] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 90
		bodyModel[118] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 91
		bodyModel[119] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 92
		bodyModel[120] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 93
		bodyModel[121] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 94
		bodyModel[122] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 95
		bodyModel[123] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 96
		bodyModel[124] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 97
		bodyModel[125] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 98
		bodyModel[126] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 99
		bodyModel[127] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 100
		bodyModel[128] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 101
		bodyModel[129] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 102
		bodyModel[130] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 103
		bodyModel[131] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 104
		bodyModel[132] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 164
		bodyModel[133] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 168
		bodyModel[134] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 171
		bodyModel[135] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 1
		bodyModel[136] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 2
		bodyModel[137] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 110
		bodyModel[138] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 111
		bodyModel[139] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 112
		bodyModel[140] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 113
		bodyModel[141] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 114
		bodyModel[142] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 115
		bodyModel[143] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 116
		bodyModel[144] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 117
		bodyModel[145] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 118
		bodyModel[146] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 119
		bodyModel[147] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 120
		bodyModel[148] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 121
		bodyModel[149] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 122
		bodyModel[150] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 123
		bodyModel[151] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 124
		bodyModel[152] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 125
		bodyModel[153] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 126
		bodyModel[154] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 127
		bodyModel[155] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 129
		bodyModel[157] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 130
		bodyModel[158] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 131
		bodyModel[159] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 132
		bodyModel[160] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 133
		bodyModel[161] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 134
		bodyModel[162] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 135
		bodyModel[163] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 136
		bodyModel[164] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 119
		bodyModel[165] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 120
		bodyModel[166] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 121
		bodyModel[167] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 144
		bodyModel[168] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 145
		bodyModel[169] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 146
		bodyModel[170] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 147
		bodyModel[171] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 148
		bodyModel[172] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 149
		bodyModel[173] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 150
		bodyModel[174] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 151
		bodyModel[175] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 152
		bodyModel[176] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 153
		bodyModel[177] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 154
		bodyModel[178] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 155
		bodyModel[179] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 159
		bodyModel[180] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 0
		bodyModel[181] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 1
		bodyModel[182] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 2
		bodyModel[183] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 3
		bodyModel[184] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 4
		bodyModel[185] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 5
		bodyModel[186] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 6
		bodyModel[187] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 7
		bodyModel[188] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 8
		bodyModel[189] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 9
		bodyModel[190] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 10
		bodyModel[191] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 14
		bodyModel[192] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 19
		bodyModel[193] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 20
		bodyModel[194] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 75
		bodyModel[195] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 76
		bodyModel[196] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 77
		bodyModel[197] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 78
		bodyModel[198] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 79
		bodyModel[199] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 80
		bodyModel[200] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 81
		bodyModel[201] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 82
		bodyModel[202] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 83
		bodyModel[203] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 84
		bodyModel[204] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 85
		bodyModel[205] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 86
		bodyModel[206] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Box 66
		bodyModel[207] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 68
		bodyModel[208] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 69
		bodyModel[209] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 70
		bodyModel[210] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 71
		bodyModel[211] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 72
		bodyModel[212] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 73
		bodyModel[213] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 74
		bodyModel[214] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 75
		bodyModel[215] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 76
		bodyModel[216] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 77
		bodyModel[217] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 78
		bodyModel[218] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 79
		bodyModel[219] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 80
		bodyModel[220] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 81
		bodyModel[221] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 82
		bodyModel[222] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Box 83
		bodyModel[223] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 84
		bodyModel[224] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 85
		bodyModel[225] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 86
		bodyModel[226] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 87
		bodyModel[227] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 88
		bodyModel[228] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 89
		bodyModel[229] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 90
		bodyModel[230] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 91
		bodyModel[231] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 92
		bodyModel[232] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 93
		bodyModel[233] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 94
		bodyModel[234] = new ModelRendererTurbo(this, 118, 31, textureX, textureY); // Box 563
		bodyModel[235] = new ModelRendererTurbo(this, 118, 31, textureX, textureY); // Box 563
		bodyModel[236] = new ModelRendererTurbo(this, 84, 29, textureX, textureY); // Box 563
		bodyModel[237] = new ModelRendererTurbo(this, 74, 31, textureX, textureY); // Box 563
		bodyModel[238] = new ModelRendererTurbo(this, 68, 27, textureX, textureY); // Box 563
		bodyModel[239] = new ModelRendererTurbo(this, 74, 31, textureX, textureY); // Box 563
		bodyModel[240] = new ModelRendererTurbo(this, 74, 31, textureX, textureY); // Box 563
		bodyModel[241] = new ModelRendererTurbo(this, 68, 27, textureX, textureY); // Box 563
		bodyModel[242] = new ModelRendererTurbo(this, 74, 31, textureX, textureY); // Box 563
		bodyModel[243] = new ModelRendererTurbo(this, 84, 29, textureX, textureY); // Box 563
		bodyModel[244] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 0
		bodyModel[245] = new ModelRendererTurbo(this, 99, 369, textureX, textureY); // Box 0
		bodyModel[246] = new ModelRendererTurbo(this, 114, 367, textureX, textureY); // Box 0
		bodyModel[247] = new ModelRendererTurbo(this, 99, 377, textureX, textureY); // Box 0
		bodyModel[248] = new ModelRendererTurbo(this, 128, 369, textureX, textureY); // Box 0
		bodyModel[249] = new ModelRendererTurbo(this, 117, 376, textureX, textureY); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 124, 385, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 118, 385, textureX, textureY); // Box 0
		bodyModel[252] = new ModelRendererTurbo(this, 137, 379, textureX, textureY); // Box 0
		bodyModel[253] = new ModelRendererTurbo(this, 137, 384, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 137, 389, textureX, textureY); // Box 0
		bodyModel[255] = new ModelRendererTurbo(this, 137, 389, textureX, textureY); // Box 0
		bodyModel[256] = new ModelRendererTurbo(this, 137, 375, textureX, textureY); // Box 0
		bodyModel[257] = new ModelRendererTurbo(this, 137, 396, textureX, textureY); // Box 0
		bodyModel[258] = new ModelRendererTurbo(this, 138, 400, textureX, textureY); // Box 0
		bodyModel[259] = new ModelRendererTurbo(this, 138, 404, textureX, textureY); // Box 0
		bodyModel[260] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 589
		bodyModel[261] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 590
		bodyModel[262] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 592
		bodyModel[263] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 546
		bodyModel[264] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 547
		bodyModel[265] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 548
		bodyModel[266] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 549
		bodyModel[267] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 550
		bodyModel[268] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 551
		bodyModel[269] = new ModelRendererTurbo(this, 337, 305, textureX, textureY); // Box 550
		bodyModel[270] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 551
		bodyModel[271] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 552
		bodyModel[272] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 553
		bodyModel[273] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 554
		bodyModel[274] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 558
		bodyModel[275] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 559
		bodyModel[276] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 560
		bodyModel[277] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 561
		bodyModel[278] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 562
		bodyModel[279] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 563
		bodyModel[280] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 564
		bodyModel[281] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 565
		bodyModel[282] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 566
		bodyModel[283] = new ModelRendererTurbo(this, 345, 313, textureX, textureY); // Box 567
		bodyModel[284] = new ModelRendererTurbo(this, 217, 321, textureX, textureY); // Box 568
		bodyModel[285] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 569
		bodyModel[286] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 570
		bodyModel[287] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 571
		bodyModel[288] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 572
		bodyModel[289] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 573
		bodyModel[290] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 574
		bodyModel[291] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 575
		bodyModel[292] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 576
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 100, 14, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, -8F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-55F, -21.5F, -16F);
		
		bodyModel[1].addShapeBox(0F, 0F, 0F, 100, 14, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, 8.5F, -7F, 0F, 8.5F, -7F, 4F, -5F, -4.5F, 4F); // Box 1
		bodyModel[1].setRotationPoint(-55F, -21.5F, 16F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 92, 8, 32, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F); // Box 12
		bodyModel[2].setRotationPoint(-47F, -7.5F, -16F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(51F, -16.5F, 16F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(56F, -16.5F, 16F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(59F, -13.5F, 16F);
		
		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 9
		bodyModel[6].setRotationPoint(51F, -16.5F, 25F);
		
		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, 3F, 0F); // Box 10
		bodyModel[7].setRotationPoint(56F, -16.5F, 25F);
		
		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 3F, 0F); // Box 11
		bodyModel[8].setRotationPoint(59F, -13.5F, 25F);
		
		bodyModel[9].addShapeBox(0F, 0F, 0F, 102, 1, 4, 0F, -1F, 1F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-51F, -11.5F, 25F);
		
		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 14
		bodyModel[10].setRotationPoint(51F, -15.5F, 15.75F);
		
		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -0.8F, 0F, 0F, -0.8F); // Box 15
		bodyModel[11].setRotationPoint(56F, -15.5F, 15.75F);
		
		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, -0.8F, 0F, 0F, -0.8F); // Box 16
		bodyModel[12].setRotationPoint(59F, -12.5F, 15.75F);
		
		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[13].setRotationPoint(51F, -16.5F, -25F);
		
		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[14].setRotationPoint(56F, -16.5F, -25F);
		
		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[15].setRotationPoint(59F, -13.5F, -25F);
		
		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(51F, -16.5F, -29F);
		
		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[17].setRotationPoint(51F, -15.5F, -16.75F);
		
		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, -0.8F, 0F, -3F, -0.8F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 3F, -0.8F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[18].setRotationPoint(56F, -15.5F, -16.75F);
		
		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -0.8F, 0F, -3F, -0.8F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 1F, 2F, -0.8F, 1F, 2F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[19].setRotationPoint(59F, -12.5F, -16.75F);
		
		bodyModel[20].addShapeBox(0F, 0F, 0F, 102, 5, 1, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 7
		bodyModel[20].setRotationPoint(-51F, -10.5F, 29F);
		
		bodyModel[21].addShapeBox(0F, 0F, -4F, 8, 1, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[21].setRotationPoint(32F, -22F, -12F);
		
		bodyModel[22].addShapeBox(0F, 0F, 5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F); // Box 15
		bodyModel[22].setRotationPoint(32F, -22F, -12F);
		
		bodyModel[23].addShapeBox(0F, 0F, -5F, 8, 1, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 16
		bodyModel[23].setRotationPoint(32F, -22F, -12F);
		
		bodyModel[24].addShapeBox(0F, 0F, 5F, 8, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(32F, -22F, 10F);
		
		bodyModel[25].addShapeBox(0F, 0F, -4F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 28
		bodyModel[25].setRotationPoint(32F, -22F, 10F);
		
		bodyModel[26].addShapeBox(0F, 0F, -6F, 8, 1, 2, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(32F, -22F, 10F);
		
		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 1.2F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, -1F, 1.2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(44F, -22.5F, -10F);
		
		bodyModel[28].addShapeBox(0F, 0F, 0F, 98, 1, 1, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-55F, -22F, -22F);
		
		bodyModel[29].addShapeBox(0F, 0F, 0F, 98, 1, 1, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		bodyModel[29].setRotationPoint(-55F, -22F, 21F);
		
		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 48
		bodyModel[30].setRotationPoint(38F, -23.5F, 7F);
		bodyModel[30].rotateAngleY = -1.57079633F;
		
		bodyModel[31].addShapeBox(0F, 0F, -1.5F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 49
		bodyModel[31].setRotationPoint(38F, -23.5F, 7F);
		bodyModel[31].rotateAngleY = -1.57079633F;
		
		bodyModel[32].addShapeBox(0F, 0F, -2.3F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 50
		bodyModel[32].setRotationPoint(38F, -23.5F, 7F);
		bodyModel[32].rotateAngleY = -1.57079633F;
		
		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F); // Box 51
		bodyModel[33].setRotationPoint(38F, -23.5F, -7F);
		bodyModel[33].rotateAngleY = -1.57079633F;
		
		bodyModel[34].addShapeBox(-1F, 0F, -1.8F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 52
		bodyModel[34].setRotationPoint(38F, -23.5F, -8F);
		bodyModel[34].rotateAngleY = -1.57079633F;
		
		bodyModel[35].addShapeBox(0F, 0F, -2.3F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F); // Box 53
		bodyModel[35].setRotationPoint(38F, -23.5F, -7F);
		bodyModel[35].rotateAngleY = -1.57079633F;
		
		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(56F, -16.5F, -29F);
		
		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[37].setRotationPoint(59F, -13.5F, -29F);
		
		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 2
		bodyModel[38].setRotationPoint(51F, -14.5F, 29F);
		
		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -4F, 0F); // Box 3
		bodyModel[39].setRotationPoint(56F, -14.5F, 29F);
		
		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 1.2F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, -1F, 1.2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 27
		bodyModel[40].setRotationPoint(44F, -22.5F, -22F);
		
		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 1.2F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, -1F, 1.2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 28
		bodyModel[41].setRotationPoint(44F, -22.5F, 11F);
		
		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 30
		bodyModel[42].setRotationPoint(-50F, -12.5F, 16F);
		bodyModel[42].rotateAngleZ = -0.78539816F;
		
		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 14, 8, 0F, -4F, -7F, 0F, 4F, -7F, 0F, 4F, -7F, 0F, -4F, -7F, 0F, -5F, -4F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, -5F, -4F, 0F); // Box 32
		bodyModel[43].setRotationPoint(-55F, -21.5F, 16F);
		
		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 34
		bodyModel[44].setRotationPoint(-50F, -12.5F, -26F);
		bodyModel[44].rotateAngleZ = -0.61086524F;
		
		bodyModel[45].addShapeBox(0F, 0F, 0F, 102, 1, 4, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, -1F, 0F); // Box 36
		bodyModel[45].setRotationPoint(-51F, -11.5F, -29F);
		
		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 14, 8, 0F, -4F, -7F, 0F, 4F, -7F, 0F, 4F, -7F, 0F, -4F, -7F, 0F, -5F, -4F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, -5F, -4F, 0F); // Box 39
		bodyModel[46].setRotationPoint(-55F, -21.5F, -24F);
		
		bodyModel[47].addShapeBox(-1F, 0.5F, -1F, 2, 7, 7, 0F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F); // Box 40
		bodyModel[47].setRotationPoint(48F, -18.5F, -12F);
		bodyModel[47].rotateAngleZ = 0.87266463F;
		
		bodyModel[48].addShapeBox(1F, 0.5F, -1F, 1, 7, 7, 0F, 0F, 0F, 0F, 0.5F, -4F, -2F, 0.5F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -2F, -0.5F, -1F, -2F, 0F, 0F, 0F); // Box 41
		bodyModel[48].setRotationPoint(48F, -18.5F, -12F);
		bodyModel[48].rotateAngleZ = 0.87266463F;
		
		bodyModel[49].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 43
		bodyModel[49].setRotationPoint(53F, -17F, -9.5F);
		
		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 0
		bodyModel[50].setRotationPoint(42F, -23F, -14.5F);
		bodyModel[50].rotateAngleY = -0.15707963F;
		
		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 1
		bodyModel[51].setRotationPoint(42F, -22F, -14.5F);
		bodyModel[51].rotateAngleY = -0.15707963F;
		
		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 2
		bodyModel[52].setRotationPoint(42.5F, -22F, 6F);
		bodyModel[52].rotateAngleY = 0.12217305F;
		
		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 3
		bodyModel[53].setRotationPoint(42.5F, -23F, 6F);
		bodyModel[53].rotateAngleY = 0.12217305F;
		
		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F); // Box 15
		bodyModel[54].setRotationPoint(-50F, -12.5F, 17F);
		bodyModel[54].rotateAngleZ = -0.78539816F;
		
		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F); // Box 16
		bodyModel[55].setRotationPoint(-50F, -12.5F, 23F);
		bodyModel[55].rotateAngleZ = -0.78539816F;
		
		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F); // Box 17
		bodyModel[56].setRotationPoint(-50F, -12.5F, -18F);
		bodyModel[56].rotateAngleZ = -0.61086524F;
		
		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F); // Box 18
		bodyModel[57].setRotationPoint(-50F, -12.5F, -24F);
		bodyModel[57].rotateAngleZ = -0.61086524F;
		
		bodyModel[58].addShapeBox(0F, 0F, 0F, 102, 5, 1, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 19
		bodyModel[58].setRotationPoint(-51F, -10.5F, -30F);
		
		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -2F, 0F); // Box 20
		bodyModel[59].setRotationPoint(51F, -14.5F, -30F);
		
		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, -2F, 0F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -5F, 0F); // Box 21
		bodyModel[60].setRotationPoint(56F, -14.5F, -30F);
		
		bodyModel[61].addShapeBox(-2F, 0F, -9F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[61].setRotationPoint(60F, -10.5F, 23F);
		bodyModel[61].rotateAngleZ = 0.50614548F;
		
		bodyModel[62].addShapeBox(0.5F, 2F, -10.5F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[62].setRotationPoint(60F, -10.5F, 23F);
		bodyModel[62].rotateAngleZ = 0.50614548F;
		
		bodyModel[63].addShapeBox(0.5F, 2F, -7.5F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 406
		bodyModel[63].setRotationPoint(60F, -10.5F, 23F);
		bodyModel[63].rotateAngleZ = 0.50614548F;
		
		bodyModel[64].addShapeBox(0.5F, 5F, -9.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[64].setRotationPoint(60F, -10.5F, 23F);
		bodyModel[64].rotateAngleZ = 0.50614548F;
		
		bodyModel[65].addShapeBox(0.5F, 1F, -11F, 1, 1, 5, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 413
		bodyModel[65].setRotationPoint(60F, -10.5F, 23F);
		bodyModel[65].rotateAngleZ = 0.50614548F;
		
		bodyModel[66].addShapeBox(-2F, 0F, -9F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[66].setRotationPoint(60F, -10.5F, -6F);
		bodyModel[66].rotateAngleZ = 0.50614548F;
		
		bodyModel[67].addShapeBox(0.5F, 1F, -11F, 1, 1, 5, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 28
		bodyModel[67].setRotationPoint(60F, -10.5F, -6F);
		bodyModel[67].rotateAngleZ = 0.50614548F;
		
		bodyModel[68].addShapeBox(0.5F, 2F, -7.5F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[68].setRotationPoint(60F, -10.5F, -6F);
		bodyModel[68].rotateAngleZ = 0.50614548F;
		
		bodyModel[69].addShapeBox(0.5F, 2F, -10.5F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[69].setRotationPoint(60F, -10.5F, -6F);
		bodyModel[69].rotateAngleZ = 0.50614548F;
		
		bodyModel[70].addShapeBox(0.5F, 5F, -9.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[70].setRotationPoint(60F, -10.5F, -6F);
		bodyModel[70].rotateAngleZ = 0.50614548F;
		
		bodyModel[71].addShapeBox(8.5F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[71].setRotationPoint(58.5F, -4F, 9.5F);
		bodyModel[71].rotateAngleX = -2.46091425F;
		bodyModel[71].rotateAngleY = -1.57079633F;
		
		bodyModel[72].addShapeBox(5.5F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[72].setRotationPoint(58.5F, -4F, 9.5F);
		bodyModel[72].rotateAngleX = -2.46091425F;
		bodyModel[72].rotateAngleY = -1.57079633F;
		
		bodyModel[73].addShapeBox(2.5F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[73].setRotationPoint(58.5F, -4F, 9.5F);
		bodyModel[73].rotateAngleX = -2.46091425F;
		bodyModel[73].rotateAngleY = -1.57079633F;
		
		bodyModel[74].addShapeBox(-0.5F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[74].setRotationPoint(58.5F, -4F, 9.5F);
		bodyModel[74].rotateAngleX = -2.46091425F;
		bodyModel[74].rotateAngleY = -1.57079633F;
		
		bodyModel[75].addShapeBox(8F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[75].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[75].rotateAngleX = -2.46091425F;
		bodyModel[75].rotateAngleY = -1.57079633F;
		
		bodyModel[76].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[76].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[76].rotateAngleX = -2.46091425F;
		bodyModel[76].rotateAngleY = -1.57079633F;
		
		bodyModel[77].addShapeBox(0F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[77].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[77].rotateAngleX = -2.46091425F;
		bodyModel[77].rotateAngleY = -1.57079633F;
		
		bodyModel[78].addShapeBox(-5F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 108
		bodyModel[78].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[78].rotateAngleX = -2.46091425F;
		bodyModel[78].rotateAngleY = -1.57079633F;
		
		bodyModel[79].addShapeBox(-4F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[79].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[79].rotateAngleX = -2.46091425F;
		bodyModel[79].rotateAngleY = -1.57079633F;
		
		bodyModel[80].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 110
		bodyModel[80].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[80].rotateAngleX = -2.46091425F;
		bodyModel[80].rotateAngleY = -1.57079633F;
		
		bodyModel[81].addShapeBox(-4.5F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[81].setRotationPoint(58.5F, -4F, 8.5F);
		bodyModel[81].rotateAngleX = -2.46091425F;
		bodyModel[81].rotateAngleY = -1.57079633F;
		
		bodyModel[82].addShapeBox(-4.5F, -1.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[82].setRotationPoint(58.5F, -4F, 8.5F);
		bodyModel[82].rotateAngleX = -2.46091425F;
		bodyModel[82].rotateAngleY = -1.57079633F;
		
		bodyModel[83].addShapeBox(-0.5F, -1.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[83].setRotationPoint(58.5F, -4F, 9.5F);
		bodyModel[83].rotateAngleX = -2.46091425F;
		bodyModel[83].rotateAngleY = -1.57079633F;
		
		bodyModel[84].addShapeBox(2.5F, -1.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[84].setRotationPoint(58.5F, -4F, 9.5F);
		bodyModel[84].rotateAngleX = -2.46091425F;
		bodyModel[84].rotateAngleY = -1.57079633F;
		
		bodyModel[85].addShapeBox(5.5F, -1.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[85].setRotationPoint(58.5F, -4F, 9.5F);
		bodyModel[85].rotateAngleX = -2.46091425F;
		bodyModel[85].rotateAngleY = -1.57079633F;
		
		bodyModel[86].addShapeBox(8.5F, -1.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[86].setRotationPoint(58.5F, -4F, 9.5F);
		bodyModel[86].rotateAngleX = -2.46091425F;
		bodyModel[86].rotateAngleY = -1.57079633F;
		
		bodyModel[87].addShapeBox(2F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 54
		bodyModel[87].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[87].rotateAngleX = -2.46091425F;
		bodyModel[87].rotateAngleY = -1.57079633F;
		
		bodyModel[88].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 55
		bodyModel[88].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[88].rotateAngleX = -2.46091425F;
		bodyModel[88].rotateAngleY = -1.57079633F;
		
		bodyModel[89].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 56
		bodyModel[89].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[89].rotateAngleX = -2.46091425F;
		bodyModel[89].rotateAngleY = -1.57079633F;
		
		bodyModel[90].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 57
		bodyModel[90].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[90].rotateAngleX = -2.46091425F;
		bodyModel[90].rotateAngleY = -1.57079633F;
		
		bodyModel[91].addShapeBox(10F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 58
		bodyModel[91].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[91].rotateAngleX = -2.46091425F;
		bodyModel[91].rotateAngleY = -1.57079633F;
		
		bodyModel[92].addShapeBox(7F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 59
		bodyModel[92].setRotationPoint(58.5F, -5F, 9F);
		bodyModel[92].rotateAngleX = -2.46091425F;
		bodyModel[92].rotateAngleY = -1.57079633F;
		
		bodyModel[93].addShapeBox(-5F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 60
		bodyModel[93].setRotationPoint(58.5F, -5F, -7F);
		bodyModel[93].rotateAngleX = -2.46091425F;
		bodyModel[93].rotateAngleY = -1.57079633F;
		
		bodyModel[94].addShapeBox(-4F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[94].setRotationPoint(58.5F, -5F, -7F);
		bodyModel[94].rotateAngleX = -2.46091425F;
		bodyModel[94].rotateAngleY = -1.57079633F;
		
		bodyModel[95].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 62
		bodyModel[95].setRotationPoint(58.5F, -5F, -7F);
		bodyModel[95].rotateAngleX = -2.46091425F;
		bodyModel[95].rotateAngleY = -1.57079633F;
		
		bodyModel[96].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 63
		bodyModel[96].setRotationPoint(58.5F, -5F, -7F);
		bodyModel[96].rotateAngleX = -2.46091425F;
		bodyModel[96].rotateAngleY = -1.57079633F;
		
		bodyModel[97].addShapeBox(2F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 64
		bodyModel[97].setRotationPoint(58.5F, -5F, -7F);
		bodyModel[97].rotateAngleX = -2.46091425F;
		bodyModel[97].rotateAngleY = -1.57079633F;
		
		bodyModel[98].addShapeBox(3F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 65
		bodyModel[98].setRotationPoint(58.5F, -5F, -7F);
		bodyModel[98].rotateAngleX = -2.46091425F;
		bodyModel[98].rotateAngleY = -1.57079633F;
		
		bodyModel[99].addShapeBox(4F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[99].setRotationPoint(58.5F, -5F, -7F);
		bodyModel[99].rotateAngleX = -2.46091425F;
		bodyModel[99].rotateAngleY = -1.57079633F;
		
		bodyModel[100].addShapeBox(6F, -1.5F, -3.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 67
		bodyModel[100].setRotationPoint(58.5F, -5F, -7F);
		bodyModel[100].rotateAngleX = -2.46091425F;
		bodyModel[100].rotateAngleY = -1.57079633F;
		
		bodyModel[101].addShapeBox(4.5F, -1.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[101].setRotationPoint(58.5F, -4F, -6.5F);
		bodyModel[101].rotateAngleX = -2.46091425F;
		bodyModel[101].rotateAngleY = -1.57079633F;
		
		bodyModel[102].addShapeBox(4.5F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[102].setRotationPoint(58.5F, -4F, -6.5F);
		bodyModel[102].rotateAngleX = -2.46091425F;
		bodyModel[102].rotateAngleY = -1.57079633F;
		
		bodyModel[103].addShapeBox(1.5F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[103].setRotationPoint(58.5F, -4F, -6.5F);
		bodyModel[103].rotateAngleX = -2.46091425F;
		bodyModel[103].rotateAngleY = -1.57079633F;
		
		bodyModel[104].addShapeBox(1.5F, -1.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[104].setRotationPoint(58.5F, -4F, -6.5F);
		bodyModel[104].rotateAngleX = -2.46091425F;
		bodyModel[104].rotateAngleY = -1.57079633F;
		
		bodyModel[105].addShapeBox(-1.5F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[105].setRotationPoint(58.5F, -4F, -6.5F);
		bodyModel[105].rotateAngleX = -2.46091425F;
		bodyModel[105].rotateAngleY = -1.57079633F;
		
		bodyModel[106].addShapeBox(-1.5F, -1.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[106].setRotationPoint(58.5F, -4F, -6.5F);
		bodyModel[106].rotateAngleX = -2.46091425F;
		bodyModel[106].rotateAngleY = -1.57079633F;
		
		bodyModel[107].addShapeBox(0F, -1.5F, -3.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[107].setRotationPoint(58.5F, -5F, -7F);
		bodyModel[107].rotateAngleX = -2.46091425F;
		bodyModel[107].rotateAngleY = -1.57079633F;
		
		bodyModel[108].addShapeBox(-5.5F, -1.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[108].setRotationPoint(58.5F, -4F, -7.5F);
		bodyModel[108].rotateAngleX = -2.46091425F;
		bodyModel[108].rotateAngleY = -1.57079633F;
		
		bodyModel[109].addShapeBox(-5.5F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[109].setRotationPoint(58.5F, -4F, -7.5F);
		bodyModel[109].rotateAngleX = -2.46091425F;
		bodyModel[109].rotateAngleY = -1.57079633F;
		
		bodyModel[110].addShapeBox(-17F, -2F, -6F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 83
		bodyModel[110].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[110].rotateAngleZ = -0.68067841F;
		
		bodyModel[111].addShapeBox(-16F, -2F, -6F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[111].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[111].rotateAngleZ = -0.68067841F;
		
		bodyModel[112].addShapeBox(-14F, -2F, -6F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 85
		bodyModel[112].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[112].rotateAngleZ = -0.68067841F;
		
		bodyModel[113].addShapeBox(-13F, -2F, -6F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 86
		bodyModel[113].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[113].rotateAngleZ = -0.68067841F;
		
		bodyModel[114].addShapeBox(-12F, -2F, -6F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[114].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[114].rotateAngleZ = -0.68067841F;
		
		bodyModel[115].addShapeBox(-10F, -2F, -6F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 88
		bodyModel[115].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[115].rotateAngleZ = -0.68067841F;
		
		bodyModel[116].addShapeBox(-9F, -2F, -6F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 89
		bodyModel[116].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[116].rotateAngleZ = -0.68067841F;
		
		bodyModel[117].addShapeBox(-8F, -2F, -6F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[117].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[117].rotateAngleZ = -0.68067841F;
		
		bodyModel[118].addShapeBox(-6F, -2F, -6F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 91
		bodyModel[118].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[118].rotateAngleZ = -0.68067841F;
		
		bodyModel[119].addShapeBox(-5F, -2F, -6F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 92
		bodyModel[119].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[119].rotateAngleZ = -0.68067841F;
		
		bodyModel[120].addShapeBox(-4F, -2F, -6F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[120].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[120].rotateAngleZ = -0.68067841F;
		
		bodyModel[121].addShapeBox(-2F, -2F, -6F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 94
		bodyModel[121].setRotationPoint(58.5F, -9F, 9F);
		bodyModel[121].rotateAngleZ = -0.68067841F;
		
		bodyModel[122].addShapeBox(-4.5F, -3.5F, -3.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[122].setRotationPoint(58.5F, -8F, 9.5F);
		bodyModel[122].rotateAngleZ = -0.68067841F;
		
		bodyModel[123].addShapeBox(-4.5F, -3.5F, -1.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[123].setRotationPoint(58.5F, -8F, 9.5F);
		bodyModel[123].rotateAngleZ = -0.68067841F;
		
		bodyModel[124].addShapeBox(-7.5F, -3.5F, -1.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[124].setRotationPoint(58.5F, -8F, 9.5F);
		bodyModel[124].rotateAngleZ = -0.68067841F;
		
		bodyModel[125].addShapeBox(-7.5F, -3.5F, -3.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[125].setRotationPoint(58.5F, -8F, 9.5F);
		bodyModel[125].rotateAngleZ = -0.68067841F;
		
		bodyModel[126].addShapeBox(-10.5F, -3.5F, -1.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[126].setRotationPoint(58.5F, -8F, 9.5F);
		bodyModel[126].rotateAngleZ = -0.68067841F;
		
		bodyModel[127].addShapeBox(-10.5F, -3.5F, -3.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[127].setRotationPoint(58.5F, -8F, 9.5F);
		bodyModel[127].rotateAngleZ = -0.68067841F;
		
		bodyModel[128].addShapeBox(-13.5F, -3.5F, -1.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[128].setRotationPoint(58.5F, -8F, 9.5F);
		bodyModel[128].rotateAngleZ = -0.68067841F;
		
		bodyModel[129].addShapeBox(-13.5F, -3.5F, -3.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[129].setRotationPoint(58.5F, -8F, 9.5F);
		bodyModel[129].rotateAngleZ = -0.68067841F;
		
		bodyModel[130].addShapeBox(-16.5F, -3.5F, -0.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[130].setRotationPoint(58.5F, -8F, 8.5F);
		bodyModel[130].rotateAngleZ = -0.68067841F;
		
		bodyModel[131].addShapeBox(-16.5F, -3.5F, -2.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[131].setRotationPoint(58.5F, -8F, 8.5F);
		bodyModel[131].rotateAngleZ = -0.68067841F;
		
		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[132].setRotationPoint(-54F, -22F, -20F);
		
		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[133].setRotationPoint(-53F, -22F, -20F);
		
		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[134].setRotationPoint(-53F, -22F, -11F);
		
		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[135].setRotationPoint(-52F, -21.8F, -19F);
		
		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[136].setRotationPoint(-50F, -21.8F, -19F);
		
		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[137].setRotationPoint(-48F, -22F, -20F);
		
		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[138].setRotationPoint(-54F, -22F, 10F);
		
		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[139].setRotationPoint(-53F, -22F, 19F);
		
		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[140].setRotationPoint(-53F, -22F, 10F);
		
		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[141].setRotationPoint(-52F, -21.8F, 11F);
		
		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[142].setRotationPoint(-50F, -21.8F, 11F);
		
		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[143].setRotationPoint(-48F, -22F, 10F);
		
		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[144].setRotationPoint(-29F, -22F, 19F);
		
		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[145].setRotationPoint(-29F, -22F, 10F);
		
		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[146].setRotationPoint(-30F, -22F, 10F);
		
		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[147].setRotationPoint(-24F, -22F, 10F);
		
		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[148].setRotationPoint(-26F, -21.8F, 11F);
		
		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[149].setRotationPoint(-28F, -21.8F, 11F);
		
		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[150].setRotationPoint(-30F, -22F, -20F);
		
		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[151].setRotationPoint(-28F, -21.8F, -19F);
		
		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[152].setRotationPoint(-26F, -21.8F, -19F);
		
		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 126
		bodyModel[153].setRotationPoint(-24F, -22F, -20F);
		
		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[154].setRotationPoint(-29F, -22F, -11F);
		
		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[155].setRotationPoint(-29F, -22F, -20F);
		
		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 129
		bodyModel[156].setRotationPoint(-36F, -22.5F, 8F);
		
		bodyModel[157].addShapeBox(-6F, 0F, 0F, 6, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[157].setRotationPoint(-36F, -22.5F, 8F);
		
		bodyModel[158].addShapeBox(-9F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 131
		bodyModel[158].setRotationPoint(-36F, -22.5F, 8F);
		
		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 132
		bodyModel[159].setRotationPoint(-36F, -22.5F, -20F);
		
		bodyModel[160].addShapeBox(-6F, 0F, 0F, 6, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[160].setRotationPoint(-36F, -22.5F, -20F);
		
		bodyModel[161].addShapeBox(-9F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 134
		bodyModel[161].setRotationPoint(-36F, -22.5F, -20F);
		
		bodyModel[162].addShapeBox(0F, 0F, 0F, 13, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[162].setRotationPoint(-43F, -22F, -6F);
		
		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 136
		bodyModel[163].setRotationPoint(-44F, -22F, -6F);
		
		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 119
		bodyModel[164].setRotationPoint(-37F, -23F, -2.5F);
		
		bodyModel[165].addShapeBox(-3F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 120
		bodyModel[165].setRotationPoint(-37F, -23F, -2.5F);
		
		bodyModel[166].addShapeBox(-4F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 121
		bodyModel[166].setRotationPoint(-37F, -23F, -2.5F);
		
		bodyModel[167].addShapeBox(-4F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 144
		bodyModel[167].setRotationPoint(-49F, -22F, 3F);
		
		bodyModel[168].addShapeBox(-3F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 145
		bodyModel[168].setRotationPoint(-49F, -22F, 3F);
		
		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 146
		bodyModel[169].setRotationPoint(-49F, -22F, 3F);
		
		bodyModel[170].addShapeBox(-4F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 147
		bodyModel[170].setRotationPoint(-49F, -22F, -8F);
		
		bodyModel[171].addShapeBox(-3F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 148
		bodyModel[171].setRotationPoint(-49F, -22F, -8F);
		
		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 149
		bodyModel[172].setRotationPoint(-49F, -22F, -8F);
		
		bodyModel[173].addShapeBox(-4F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 150
		bodyModel[173].setRotationPoint(-46F, -22.5F, -2.5F);
		
		bodyModel[174].addShapeBox(-3F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 151
		bodyModel[174].setRotationPoint(-46F, -22.5F, -2.5F);
		
		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 152
		bodyModel[175].setRotationPoint(-46F, -22.5F, -2.5F);
		
		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 153
		bodyModel[176].setRotationPoint(-42F, -23.5F, 5F);
		bodyModel[176].rotateAngleY = -1.04719755F;
		
		bodyModel[177].addShapeBox(0F, 0F, -1.5F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 154
		bodyModel[177].setRotationPoint(-42F, -23.5F, 5F);
		bodyModel[177].rotateAngleY = -1.04719755F;
		
		bodyModel[178].addShapeBox(0F, 0F, -2.3F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 155
		bodyModel[178].setRotationPoint(-42F, -23.5F, 5F);
		bodyModel[178].rotateAngleY = -1.04719755F;
		
		bodyModel[179].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F); // Box 159
		bodyModel[179].setRotationPoint(-42F, -22F, -6.5F);
		
		bodyModel[180].addShapeBox(-1F, -12F, 0F, 3, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[180].setRotationPoint(-48F, -7F, 3F);
		bodyModel[180].rotateAngleZ = 0.52359878F;
		
		bodyModel[181].addShapeBox(-3F, -12F, 0F, 2, 12, 6, 0F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F); // Box 1
		bodyModel[181].setRotationPoint(-48F, -7F, 3F);
		bodyModel[181].rotateAngleZ = 0.52359878F;
		
		bodyModel[182].addShapeBox(-1F, -12F, 0F, 3, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[182].setRotationPoint(-48F, -7F, -9F);
		bodyModel[182].rotateAngleZ = 0.52359878F;
		
		bodyModel[183].addShapeBox(-3F, -12F, 0F, 2, 12, 6, 0F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F); // Box 3
		bodyModel[183].setRotationPoint(-48F, -7F, -9F);
		bodyModel[183].rotateAngleZ = 0.52359878F;
		
		bodyModel[184].addShapeBox(-2.5F, -18F, 1.5F, 1, 6, 3, 0F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F); // Box 4
		bodyModel[184].setRotationPoint(-48F, -7F, 3F);
		bodyModel[184].rotateAngleZ = 0.52359878F;
		
		bodyModel[185].addShapeBox(-0.5F, -18F, 1.5F, 1, 6, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F); // Box 5
		bodyModel[185].setRotationPoint(-48F, -7F, 3F);
		bodyModel[185].rotateAngleZ = 0.52359878F;
		
		bodyModel[186].addShapeBox(-1.5F, -18F, 1.5F, 1, 6, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 6
		bodyModel[186].setRotationPoint(-48F, -7F, 3F);
		bodyModel[186].rotateAngleZ = 0.52359878F;
		
		bodyModel[187].addShapeBox(-2.5F, -18F, -1.5F, 1, 6, 3, 0F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F); // Box 7
		bodyModel[187].setRotationPoint(-48F, -7F, -6F);
		bodyModel[187].rotateAngleZ = 0.52359878F;
		
		bodyModel[188].addShapeBox(-0.5F, -18F, -1.5F, 1, 6, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F); // Box 8
		bodyModel[188].setRotationPoint(-48F, -7F, -6F);
		bodyModel[188].rotateAngleZ = 0.52359878F;
		
		bodyModel[189].addShapeBox(-1.5F, -18F, -1.5F, 1, 6, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 9
		bodyModel[189].setRotationPoint(-48F, -7F, -6F);
		bodyModel[189].rotateAngleZ = 0.52359878F;
		
		bodyModel[190].addShapeBox(-1.5F, -20F, 1.5F, 1, 2, 3, 0F, 0F, 0F, -0.2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -0.2F); // Box 10
		bodyModel[190].setRotationPoint(-48F, -7F, 3F);
		bodyModel[190].rotateAngleZ = 0.52359878F;
		
		bodyModel[191].addShapeBox(-2.5F, -20F, 1.5F, 1, 2, 3, 0F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 14
		bodyModel[191].setRotationPoint(-48F, -7F, 3F);
		bodyModel[191].rotateAngleZ = 0.52359878F;
		
		bodyModel[192].addShapeBox(-3.5F, -20F, -1.5F, 1, 2, 3, 0F, 0F, -2F, -1F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -2F, -1F, -1F, 0F, -1F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -1F); // Box 19
		bodyModel[192].setRotationPoint(-48F, -7F, -6F);
		bodyModel[192].rotateAngleZ = 0.52359878F;
		
		bodyModel[193].addShapeBox(-2.5F, -20F, -1.5F, 1, 2, 3, 0F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 20
		bodyModel[193].setRotationPoint(-48F, -7F, -6F);
		bodyModel[193].rotateAngleZ = 0.52359878F;
		
		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 75
		bodyModel[194].setRotationPoint(34F, -22F, -2.5F);
		
		bodyModel[195].addShapeBox(-3F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 76
		bodyModel[195].setRotationPoint(34F, -22F, -2.5F);
		
		bodyModel[196].addShapeBox(-4F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 77
		bodyModel[196].setRotationPoint(34F, -22F, -2.5F);
		
		bodyModel[197].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 78
		bodyModel[197].setRotationPoint(48.5F, -18F, -3F);
		
		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 79
		bodyModel[198].setRotationPoint(49F, -20F, -2F);
		
		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 80
		bodyModel[199].setRotationPoint(49F, -19.5F, -0.2F);
		
		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 81
		bodyModel[200].setRotationPoint(49F, -19.5F, -2.8F);
		
		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 82
		bodyModel[201].setRotationPoint(48.5F, -21.5F, -2F);
		
		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 83
		bodyModel[202].setRotationPoint(48.5F, -20.5F, -2F);
		
		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[203].setRotationPoint(48.5F, -22.5F, -2F);
		
		bodyModel[204].addShapeBox(-3.5F, -20F, -1.5F, 1, 2, 3, 0F, 0F, -2F, -1F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -2F, -1F, -1F, 0F, -1F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -1F); // Box 85
		bodyModel[204].setRotationPoint(-48F, -7F, 6F);
		bodyModel[204].rotateAngleZ = 0.52359878F;
		
		bodyModel[205].addShapeBox(-1.5F, -20F, 1.5F, 1, 2, 3, 0F, 0F, 0F, -0.2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -0.2F); // Box 86
		bodyModel[205].setRotationPoint(-48F, -7F, -9F);
		bodyModel[205].rotateAngleZ = 0.52359878F;
		
		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 66
		bodyModel[206].setRotationPoint(47F, 0.5F, -17F);
		
		bodyModel[207].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 68
		bodyModel[207].setRotationPoint(41F, 0.5F, -17F);
		
		bodyModel[208].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 69
		bodyModel[208].setRotationPoint(41F, 0.5F, 16F);
		
		bodyModel[209].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 70
		bodyModel[209].setRotationPoint(32F, 0.5F, 16F);
		
		bodyModel[210].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 71
		bodyModel[210].setRotationPoint(32F, 0.5F, -17F);
		
		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 72
		bodyModel[211].setRotationPoint(38F, 0.5F, -17F);
		
		bodyModel[212].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 73
		bodyModel[212].setRotationPoint(23F, 0.5F, 16F);
		
		bodyModel[213].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 74
		bodyModel[213].setRotationPoint(23F, 0.5F, -17F);
		
		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 75
		bodyModel[214].setRotationPoint(29F, 0.5F, -17F);
		
		bodyModel[215].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 76
		bodyModel[215].setRotationPoint(14F, 0.5F, 16F);
		
		bodyModel[216].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 77
		bodyModel[216].setRotationPoint(14F, 0.5F, -17F);
		
		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 78
		bodyModel[217].setRotationPoint(20F, 0.5F, -17F);
		
		bodyModel[218].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 79
		bodyModel[218].setRotationPoint(5F, 0.5F, -17F);
		
		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 80
		bodyModel[219].setRotationPoint(11F, 0.5F, -17F);
		
		bodyModel[220].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 81
		bodyModel[220].setRotationPoint(5F, 0.5F, 16F);
		
		bodyModel[221].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 82
		bodyModel[221].setRotationPoint(-4F, 0.5F, -17F);
		
		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 83
		bodyModel[222].setRotationPoint(2F, 0.5F, -17F);
		
		bodyModel[223].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 84
		bodyModel[223].setRotationPoint(-4F, 0.5F, 16F);
		
		bodyModel[224].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 85
		bodyModel[224].setRotationPoint(-13F, 0.5F, -17F);
		
		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 86
		bodyModel[225].setRotationPoint(-7F, 0.5F, -17F);
		
		bodyModel[226].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 87
		bodyModel[226].setRotationPoint(-13F, 0.5F, 16F);
		
		bodyModel[227].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 88
		bodyModel[227].setRotationPoint(-22F, 0.5F, -17F);
		
		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 89
		bodyModel[228].setRotationPoint(-16F, 0.5F, -17F);
		
		bodyModel[229].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 90
		bodyModel[229].setRotationPoint(-22F, 0.5F, 16F);
		
		bodyModel[230].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 91
		bodyModel[230].setRotationPoint(-31F, 0.5F, -17F);
		
		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 92
		bodyModel[231].setRotationPoint(-25F, 0.5F, -17F);
		
		bodyModel[232].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 93
		bodyModel[232].setRotationPoint(-31F, 0.5F, 16F);
		
		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 2, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[233].setRotationPoint(-44.5F, -5.5F, -22F);
		
		bodyModel[234].addShapeBox(-3F, 0F, 0F, 3, 4, 2, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1.5F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1.5F, -2F); // Box 563
		bodyModel[234].setRotationPoint(-55F, -21.5F, -22F);
		bodyModel[234].rotateAngleZ = 0.52359878F;
		
		bodyModel[235].addShapeBox(-3F, 0F, -2F, 3, 4, 2, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1.5F, 2F); // Box 563
		bodyModel[235].setRotationPoint(-55F, -21.5F, 22F);
		bodyModel[235].rotateAngleZ = 0.52359878F;
		
		bodyModel[236].addShapeBox(-0.5F, 0F, -2.5F, 1, 1, 4, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 563
		bodyModel[236].setRotationPoint(-55.5F, -20F, 23F);
		bodyModel[236].rotateAngleX = 0.34906585F;
		
		bodyModel[237].addShapeBox(-0.5F, 1F, -2.25F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[237].setRotationPoint(-55.5F, -20F, 23F);
		bodyModel[237].rotateAngleX = 0.34906585F;
		
		bodyModel[238].addShapeBox(-0.5F, 4F, -1.5F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 563
		bodyModel[238].setRotationPoint(-55.5F, -20F, 23F);
		bodyModel[238].rotateAngleX = 0.34906585F;
		
		bodyModel[239].addShapeBox(-0.5F, 1F, 0.25F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 563
		bodyModel[239].setRotationPoint(-55.5F, -20F, 23F);
		bodyModel[239].rotateAngleX = 0.34906585F;
		
		bodyModel[240].addShapeBox(-0.5F, 1F, -1.25F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[240].setRotationPoint(-55.5F, -20F, -23F);
		bodyModel[240].rotateAngleX = -0.34906585F;
		
		bodyModel[241].addShapeBox(-0.5F, 4F, -0.5F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 563
		bodyModel[241].setRotationPoint(-55.5F, -20F, -23F);
		bodyModel[241].rotateAngleX = -0.34906585F;
		
		bodyModel[242].addShapeBox(-0.5F, 1F, 1.25F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 563
		bodyModel[242].setRotationPoint(-55.5F, -20F, -23F);
		bodyModel[242].rotateAngleX = -0.34906585F;
		
		bodyModel[243].addShapeBox(-0.5F, 0F, -1.5F, 1, 1, 4, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 563
		bodyModel[243].setRotationPoint(-55.5F, -20F, -23F);
		bodyModel[243].rotateAngleX = -0.34906585F;
		
		bodyModel[244].addShapeBox(0F, 0F, 0F, 100, 14, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4.5F, 4F, 8.5F, -7F, 4F, 8.5F, -7F, 0F, -5F, -5F, 0F); // Box 0
		bodyModel[244].setRotationPoint(-55F, -21.5F, -22F);
		
		bodyModel[245].addShapeBox(-3F, 0F, -1F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[245].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[245].rotateAngleX = -2.23402144F;
		bodyModel[245].rotateAngleY = 0.41887902F;
		bodyModel[245].rotateAngleZ = 2.51327412F;
		
		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[246].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[246].rotateAngleX = -2.23402144F;
		bodyModel[246].rotateAngleY = 0.41887902F;
		bodyModel[246].rotateAngleZ = 2.51327412F;
		
		bodyModel[247].addShapeBox(-4F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[247].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[247].rotateAngleX = -2.23402144F;
		bodyModel[247].rotateAngleY = 0.41887902F;
		bodyModel[247].rotateAngleZ = 2.51327412F;
		
		bodyModel[248].addShapeBox(-5F, 0F, 1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[248].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[248].rotateAngleX = -2.23402144F;
		bodyModel[248].rotateAngleY = 0.41887902F;
		bodyModel[248].rotateAngleZ = 2.51327412F;
		
		bodyModel[249].addShapeBox(-6F, 0F, 4F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[249].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[249].rotateAngleX = -2.23402144F;
		bodyModel[249].rotateAngleY = 0.41887902F;
		bodyModel[249].rotateAngleZ = 2.51327412F;
		
		bodyModel[250].addShapeBox(-6F, 0F, 2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[250].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[250].rotateAngleX = -2.23402144F;
		bodyModel[250].rotateAngleY = 0.41887902F;
		bodyModel[250].rotateAngleZ = 2.51327412F;
		
		bodyModel[251].addShapeBox(-3F, 0F, 5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[251].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[251].rotateAngleX = -2.23402144F;
		bodyModel[251].rotateAngleY = 0.41887902F;
		bodyModel[251].rotateAngleZ = 2.51327412F;
		
		bodyModel[252].addShapeBox(-7F, 0F, 5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[252].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[252].rotateAngleX = -2.23402144F;
		bodyModel[252].rotateAngleY = 0.41887902F;
		bodyModel[252].rotateAngleZ = 2.51327412F;
		
		bodyModel[253].addShapeBox(-8F, 0F, 6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[253].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[253].rotateAngleX = -2.23402144F;
		bodyModel[253].rotateAngleY = 0.41887902F;
		bodyModel[253].rotateAngleZ = 2.51327412F;
		
		bodyModel[254].addShapeBox(-9F, 0F, 7F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[254].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[254].rotateAngleX = -2.23402144F;
		bodyModel[254].rotateAngleY = 0.41887902F;
		bodyModel[254].rotateAngleZ = 2.51327412F;
		
		bodyModel[255].addShapeBox(-10F, 0F, 8F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[255].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[255].rotateAngleX = -2.23402144F;
		bodyModel[255].rotateAngleY = 0.41887902F;
		bodyModel[255].rotateAngleZ = 2.51327412F;
		
		bodyModel[256].addShapeBox(-11F, 0F, 9F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[256].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[256].rotateAngleX = -2.23402144F;
		bodyModel[256].rotateAngleY = 0.41887902F;
		bodyModel[256].rotateAngleZ = 2.51327412F;
		
		bodyModel[257].addShapeBox(-13F, 0F, 10F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[257].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[257].rotateAngleX = -2.23402144F;
		bodyModel[257].rotateAngleY = 0.41887902F;
		bodyModel[257].rotateAngleZ = 2.51327412F;
		
		bodyModel[258].addShapeBox(-13F, 0F, 11F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[258].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[258].rotateAngleX = -2.23402144F;
		bodyModel[258].rotateAngleY = 0.41887902F;
		bodyModel[258].rotateAngleZ = 2.51327412F;
		
		bodyModel[259].addShapeBox(-12F, 0F, 12F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[259].setRotationPoint(27.5F, -19F, 24.5F);
		bodyModel[259].rotateAngleX = -2.23402144F;
		bodyModel[259].rotateAngleY = 0.41887902F;
		bodyModel[259].rotateAngleZ = 2.51327412F;
		
		bodyModel[260].addShapeBox(0F, -0.3F, 0F, 8, 1, 4, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 589
		bodyModel[260].setRotationPoint(-7.5F, -17.5F, -28F);
		bodyModel[260].rotateAngleZ = 0.03490659F;
		
		bodyModel[261].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 590
		bodyModel[261].setRotationPoint(-7.5F, -17.5F, -28F);
		bodyModel[261].rotateAngleZ = 0.03490659F;
		
		bodyModel[262].addShapeBox(3.5F, -0.2F, -0.2F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 592
		bodyModel[262].setRotationPoint(-7.5F, -17.5F, -28F);
		bodyModel[262].rotateAngleZ = 0.03490659F;
		
		bodyModel[263].addBox(-12F, 0F, 0F, 8, 4, 4, 0F); // Box 546
		bodyModel[263].setRotationPoint(-7.5F, -17.5F, -28F);
		bodyModel[263].rotateAngleZ = 0.03490659F;
		
		bodyModel[264].addShapeBox(-8.5F, -0.2F, -0.2F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 547
		bodyModel[264].setRotationPoint(-7.5F, -17.5F, -28F);
		bodyModel[264].rotateAngleZ = 0.03490659F;
		
		bodyModel[265].addShapeBox(-12F, -0.3F, 0F, 8, 1, 4, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 548
		bodyModel[265].setRotationPoint(-7.5F, -17.5F, -28F);
		bodyModel[265].rotateAngleZ = 0.03490659F;
		
		bodyModel[266].addBox(-29F, 0F, 0F, 8, 4, 4, 0F); // Box 549
		bodyModel[266].setRotationPoint(-7.5F, -17.5F, -28F);
		bodyModel[266].rotateAngleZ = 0.03490659F;
		
		bodyModel[267].addShapeBox(-25.5F, -0.2F, -0.2F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 550
		bodyModel[267].setRotationPoint(-7.5F, -17.5F, -28F);
		bodyModel[267].rotateAngleZ = 0.03490659F;
		
		bodyModel[268].addShapeBox(-29F, -0.3F, 0F, 8, 1, 4, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 551
		bodyModel[268].setRotationPoint(-7.5F, -17.5F, -28F);
		bodyModel[268].rotateAngleZ = 0.03490659F;
		
		bodyModel[269].addBox(7F, -2F, 0.2F, 60, 1, 1, 0F); // Box 550
		bodyModel[269].setRotationPoint(-50F, -18F, -24F);
		bodyModel[269].rotateAngleX = -0.40142573F;
		bodyModel[269].rotateAngleY = -0.00349066F;
		
		bodyModel[270].addBox(17F, 0F, 0.2F, 60, 1, 1, 0F); // Box 551
		bodyModel[270].setRotationPoint(-50F, -18F, -24F);
		bodyModel[270].rotateAngleX = -0.36651914F;
		bodyModel[270].rotateAngleY = -0.00872665F;
		
		bodyModel[271].addShapeBox(4F, -2F, 0.2F, 3, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 552
		bodyModel[271].setRotationPoint(-50F, -18F, -24F);
		bodyModel[271].rotateAngleX = -0.36651914F;
		
		bodyModel[272].addShapeBox(1F, -2F, 0.2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[272].setRotationPoint(-50F, -18F, -24F);
		bodyModel[272].rotateAngleX = -0.36651914F;
		
		bodyModel[273].addShapeBox(2F, -3F, 0.2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[273].setRotationPoint(-50F, -18F, -24F);
		bodyModel[273].rotateAngleX = -0.36651914F;
		
		bodyModel[274].addShapeBox(0F, -1F, 0.2F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[274].setRotationPoint(-50F, -18F, -24F);
		bodyModel[274].rotateAngleX = -0.36651914F;
		
		bodyModel[275].addShapeBox(0F, 0F, 0.2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 559
		bodyModel[275].setRotationPoint(-50F, -18F, -24F);
		bodyModel[275].rotateAngleX = -0.36651914F;
		
		bodyModel[276].addShapeBox(1F, 1F, 0.2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[276].setRotationPoint(-50F, -18F, -24F);
		bodyModel[276].rotateAngleX = -0.36651914F;
		
		bodyModel[277].addShapeBox(2F, 2F, 0.2F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[277].setRotationPoint(-50F, -18F, -24F);
		bodyModel[277].rotateAngleX = -0.36651914F;
		
		bodyModel[278].addShapeBox(7F, 1F, 0.2F, 10, 1, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0.15F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 562
		bodyModel[278].setRotationPoint(-50F, -18F, -24F);
		bodyModel[278].rotateAngleX = -0.36651914F;
		
		bodyModel[279].addShapeBox(77F, -1F, 0.2F, 3, 3, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 563
		bodyModel[279].setRotationPoint(-50F, -18F, -24F);
		bodyModel[279].rotateAngleX = -0.48869219F;
		bodyModel[279].rotateAngleY = -0.00872665F;
		
		bodyModel[280].addShapeBox(67F, -3F, 0F, 3, 3, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 564
		bodyModel[280].setRotationPoint(-50F, -18F, -24F);
		bodyModel[280].rotateAngleX = -0.50614548F;
		bodyModel[280].rotateAngleY = -0.00349066F;
		
		bodyModel[281].addShapeBox(67F, -3F, 0.5F, 3, 3, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 565
		bodyModel[281].setRotationPoint(-50F, -18F, 22F);
		bodyModel[281].rotateAngleX = 0.31415927F;
		bodyModel[281].rotateAngleY = 0.00523599F;
		
		bodyModel[282].addShapeBox(77F, -1F, 0.7F, 3, 3, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 566
		bodyModel[282].setRotationPoint(-50F, -18F, 22F);
		bodyModel[282].rotateAngleX = 0.33161256F;
		bodyModel[282].rotateAngleY = 0F;
		
		bodyModel[283].addBox(17F, 0F, 0.7F, 60, 1, 1, 0F); // Box 567
		bodyModel[283].setRotationPoint(-50F, -18F, 22F);
		bodyModel[283].rotateAngleX = 0.45378561F;
		bodyModel[283].rotateAngleY = 0F;
		
		bodyModel[284].addBox(7F, -2F, 0.7F, 60, 1, 1, 0F); // Box 568
		bodyModel[284].setRotationPoint(-50F, -18F, 22F);
		bodyModel[284].rotateAngleX = 0.41887902F;
		bodyModel[284].rotateAngleY = 0.00523599F;
		
		bodyModel[285].addShapeBox(7F, 1F, 0.7F, 10, 1, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0.15F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 569
		bodyModel[285].setRotationPoint(-50F, -18F, 22F);
		bodyModel[285].rotateAngleX = 0.45378561F;
		bodyModel[285].rotateAngleY = 0.00872665F;
		
		bodyModel[286].addShapeBox(2F, 2F, 0.7F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[286].setRotationPoint(-50F, -18F, 22F);
		bodyModel[286].rotateAngleX = 0.45378561F;
		bodyModel[286].rotateAngleY = 0.00872665F;
		
		bodyModel[287].addShapeBox(1F, 1F, 0.7F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[287].setRotationPoint(-50F, -18F, 22F);
		bodyModel[287].rotateAngleX = 0.45378561F;
		bodyModel[287].rotateAngleY = 0.00872665F;
		
		bodyModel[288].addShapeBox(0F, 0F, 0.7F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 572
		bodyModel[288].setRotationPoint(-50F, -18F, 22F);
		bodyModel[288].rotateAngleX = 0.45378561F;
		bodyModel[288].rotateAngleY = 0.00872665F;
		
		bodyModel[289].addShapeBox(0F, -1F, 0.7F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[289].setRotationPoint(-50F, -18F, 22F);
		bodyModel[289].rotateAngleX = 0.45378561F;
		bodyModel[289].rotateAngleY = 0.00872665F;
		
		bodyModel[290].addShapeBox(1F, -2F, 0.7F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[290].setRotationPoint(-50F, -18F, 22F);
		bodyModel[290].rotateAngleX = 0.45378561F;
		bodyModel[290].rotateAngleY = 0.00872665F;
		
		bodyModel[291].addShapeBox(2F, -3F, 0.7F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[291].setRotationPoint(-50F, -18F, 22F);
		bodyModel[291].rotateAngleX = 0.45378561F;
		bodyModel[291].rotateAngleY = 0.00872665F;
		
		bodyModel[292].addShapeBox(4F, -2F, 0.7F, 3, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 576
		bodyModel[292].setRotationPoint(-50F, -18F, 22F);
		bodyModel[292].rotateAngleX = 0.45378561F;
		bodyModel[292].rotateAngleY = 0.00872665F;
	}
	
	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 3
		turretModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		turretModel[2] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 5
		turretModel[3] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 6
		turretModel[4] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 7
		turretModel[5] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 8
		turretModel[6] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 9
		turretModel[7] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 10
		turretModel[8] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 11
		turretModel[9] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 0
		turretModel[10] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 1
		turretModel[11] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 2
		turretModel[12] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 3
		turretModel[13] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 4
		turretModel[14] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 5
		turretModel[15] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
		turretModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 7
		turretModel[17] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 8
		turretModel[18] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 9
		turretModel[19] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 10
		turretModel[20] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 11
		turretModel[21] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 12
		turretModel[22] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 13
		turretModel[23] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 33
		turretModel[24] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 34
		turretModel[25] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 35
		turretModel[26] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 36
		turretModel[27] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 37
		turretModel[28] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 38
		turretModel[29] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 39
		turretModel[30] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 40
		turretModel[31] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 42
		turretModel[32] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 43
		turretModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		turretModel[34] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 45
		turretModel[35] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 46
		turretModel[36] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 29
		turretModel[37] = new ModelRendererTurbo(this, 154, 4, textureX, textureY); // Box 1
		turretModel[38] = new ModelRendererTurbo(this, 156, 7, textureX, textureY); // Box 2
		turretModel[39] = new ModelRendererTurbo(this, 161, 4, textureX, textureY); // Box 3
		turretModel[40] = new ModelRendererTurbo(this, 154, 4, textureX, textureY); // Box 7
		turretModel[41] = new ModelRendererTurbo(this, 156, 7, textureX, textureY); // Box 8
		turretModel[42] = new ModelRendererTurbo(this, 161, 4, textureX, textureY); // Box 9
		turretModel[43] = new ModelRendererTurbo(this, 161, 4, textureX, textureY); // Box 10
		turretModel[44] = new ModelRendererTurbo(this, 154, 4, textureX, textureY); // Box 11
		turretModel[45] = new ModelRendererTurbo(this, 156, 7, textureX, textureY); // Box 12
		turretModel[46] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 14
		turretModel[47] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 82
		turretModel[48] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 160
		turretModel[49] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 161
		turretModel[50] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 162
		turretModel[51] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 22
		turretModel[52] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 23
		turretModel[53] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 24
		turretModel[54] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 25
		turretModel[55] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 26
		turretModel[56] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 27
		turretModel[57] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 28
		turretModel[58] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 29
		turretModel[59] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 30
		turretModel[60] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 31
		turretModel[61] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 32
		turretModel[62] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 33
		turretModel[63] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 487
		turretModel[64] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 488
		turretModel[65] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 489
		turretModel[66] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 490
		turretModel[67] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 491
		turretModel[68] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 492
		turretModel[69] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 493
		turretModel[70] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 494
		turretModel[71] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 495
		turretModel[72] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 496
		turretModel[73] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 497
		turretModel[74] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 498
		turretModel[75] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 501
		turretModel[76] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 502
		turretModel[77] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 503
		turretModel[78] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 504
		turretModel[79] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 505
		turretModel[80] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 506
		turretModel[81] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 507
		turretModel[82] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 508
		turretModel[83] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 509
		turretModel[84] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 510
		turretModel[85] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 511
		turretModel[86] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 512
		turretModel[87] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 513
		turretModel[88] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 514
		turretModel[89] = new ModelRendererTurbo(this, 488, 345, textureX, textureY); // Box 515
		turretModel[90] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 516
		turretModel[91] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 517
		turretModel[92] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 518
		turretModel[93] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 519
		turretModel[94] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 520
		turretModel[95] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 521
		turretModel[96] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 522
		turretModel[97] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 523
		turretModel[98] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 524
		turretModel[99] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 525
		turretModel[100] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 526
		turretModel[101] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 527
		turretModel[102] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 584
		turretModel[103] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 585
		turretModel[104] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 586
		turretModel[105] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 587
		turretModel[106] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 24
		turretModel[107] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 25
		turretModel[108] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 26
		turretModel[109] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 541
		turretModel[110] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 542
		turretModel[111] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 543
		turretModel[112] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 544
		turretModel[113] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 545
		turretModel[114] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 546
		turretModel[115] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 547
		turretModel[116] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 548
		turretModel[117] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 549
		turretModel[118] = new ModelRendererTurbo(this, 58, 429, textureX, textureY); // Box 0
		turretModel[119] = new ModelRendererTurbo(this, 58, 429, textureX, textureY); // Box 575
		
		turretModel[0].addShapeBox(1F, 0F, -19F, 18, 1, 38, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 3
		turretModel[0].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[1].addShapeBox(-30F, 0F, -19F, 14, 1, 38, 0F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 4
		turretModel[1].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[2].addShapeBox(-5F, 0F, -19F, 6, 1, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[2].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[3].addShapeBox(1F, -16F, -15F, 18, 16, 30, 0F, 0F, 0F, -2F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, -2F, 0F, 0F, 5F, 3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 5F); // Box 6
		turretModel[3].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[4].addShapeBox(-3F, -16F, -13F, 4, 16, 26, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 7
		turretModel[4].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[5].addShapeBox(-7F, -16F, -13F, 4, 16, 26, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 8
		turretModel[5].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[6].addShapeBox(-12F, -16F, -13F, 5, 16, 26, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 9
		turretModel[6].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[7].addShapeBox(-16F, -16F, -13F, 4, 16, 26, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 10
		turretModel[7].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[8].addShapeBox(-36F, -16F, -15F, 20, 16, 30, 0F, -3F, -3F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, -3F, -6F, 2F, -1F, -3F, 0F, 0F, 5F, 0F, 0F, 5F, 2F, -1F, -3F); // Box 11
		turretModel[8].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[9].addShapeBox(-12F, -18F, 1F, 6, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[9].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[10].addShapeBox(-6F, -18F, 1F, 3, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1
		turretModel[10].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[11].addShapeBox(-15F, -18F, 1F, 3, 2, 12, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 2
		turretModel[11].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[12].addShapeBox(1F, -16F, -12F, 17, 1, 24, 0F, 0F, 0.5F, 0F, 0F, -3.5F, -4.5F, 0F, -3.5F, -4.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 3.5F, -4.5F, 0F, 3.5F, -4.5F, 0F, 0F, 0F); // Box 3
		turretModel[12].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[13].addShapeBox(-32F, -16F, -12F, 16, 1, 24, 0F, 0F, -2.5F, -3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, -3.5F, 0F, 2.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -3.5F); // Box 4
		turretModel[13].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[14].addShapeBox(-16F, -16.5F, -12F, 17, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[14].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[15].addShapeBox(-16F, -16.5F, -13F, 4, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[15].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[16].addShapeBox(-12F, -16.5F, -13F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		turretModel[16].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[17].addShapeBox(-7F, -16.5F, -13F, 4, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		turretModel[17].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[18].addShapeBox(-3F, -16.5F, -13F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		turretModel[18].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[19].addShapeBox(-16F, -16.5F, 12F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 10
		turretModel[19].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[20].addShapeBox(-12F, -16.5F, 12F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 11
		turretModel[20].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[21].addShapeBox(-7F, -16.5F, 12F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 12
		turretModel[21].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[22].addShapeBox(-3F, -16.5F, 12F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		turretModel[22].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[23].addShapeBox(-15F, -16.8F, -10F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[23].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[24].addShapeBox(-15F, -16.8F, -11F, 7, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[24].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[25].addShapeBox(-15F, -16.8F, -2F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 35
		turretModel[25].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[26].addShapeBox(-8.5F, -16.9F, -9F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[26].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[27].addShapeBox(-8.5F, -16.9F, -5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		turretModel[27].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[28].addShapeBox(-13.5F, -18.2F, -7F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 38
		turretModel[28].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[29].addShapeBox(-13.5F, -18.2F, -7.8F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 39
		turretModel[29].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[30].addShapeBox(-13.5F, -18.2F, -5.5F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 40
		turretModel[30].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[31].addShapeBox(-12F, -36F, -5F, 8, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		turretModel[31].setRotationPoint(7F, -22.5F, 0F);
		turretModel[31].rotateAngleZ = 1.18682389F;
		
		turretModel[32].addShapeBox(-3.5F, -37.2F, -1.8F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 43
		turretModel[32].setRotationPoint(7F, -22.5F, 0F);
		turretModel[32].rotateAngleZ = 1.18682389F;
		
		turretModel[33].addShapeBox(-3.5F, -37.2F, -1F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 44
		turretModel[33].setRotationPoint(7F, -22.5F, 0F);
		turretModel[33].rotateAngleZ = 1.18682389F;
		
		turretModel[34].addShapeBox(-3.5F, -37.2F, 0.5F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 45
		turretModel[34].setRotationPoint(7F, -22.5F, 0F);
		turretModel[34].rotateAngleZ = 1.18682389F;
		
		turretModel[35].addShapeBox(-13F, -36.2F, -10.5F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		turretModel[35].setRotationPoint(7F, -22.5F, 0F);
		turretModel[35].rotateAngleZ = 1.18682389F;
		
		turretModel[36].addShapeBox(19F, 0F, -7F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[36].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[37].addShapeBox(14F, 26F, -6F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 1
		turretModel[37].setRotationPoint(-7F, -27F, 0F);
		turretModel[37].rotateAngleZ = 1.34390352F;
		
		turretModel[38].addShapeBox(15.8F, 26.7F, -6F, 1, 1, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 2
		turretModel[38].setRotationPoint(-7F, -27F, 0F);
		turretModel[38].rotateAngleZ = 1.34390352F;
		
		turretModel[39].addShapeBox(14F, 27.4F, -6F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 3
		turretModel[39].setRotationPoint(-7F, -27F, 0F);
		turretModel[39].rotateAngleZ = 1.34390352F;
		
		turretModel[40].addShapeBox(14F, 26F, 5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 7
		turretModel[40].setRotationPoint(-7F, -27F, 0F);
		turretModel[40].rotateAngleZ = 1.34390352F;
		
		turretModel[41].addShapeBox(15.8F, 26.7F, 5F, 1, 1, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 8
		turretModel[41].setRotationPoint(-7F, -27F, 0F);
		turretModel[41].rotateAngleZ = 1.34390352F;
		
		turretModel[42].addShapeBox(14F, 27.4F, 5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 9
		turretModel[42].setRotationPoint(-7F, -27F, 0F);
		turretModel[42].rotateAngleZ = 1.34390352F;
		
		turretModel[43].addShapeBox(9.8F, -15.2F, -0.5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 10
		turretModel[43].setRotationPoint(-7F, -27.5F, 0F);
		turretModel[43].rotateAngleZ = 1.69296937F;
		
		turretModel[44].addShapeBox(9.8F, -16.6F, -0.5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 11
		turretModel[44].setRotationPoint(-7F, -27.5F, 0F);
		turretModel[44].rotateAngleZ = 1.69296937F;
		
		turretModel[45].addShapeBox(11.6F, -15.9F, -0.5F, 1, 1, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 12
		turretModel[45].setRotationPoint(-7F, -27.5F, 0F);
		turretModel[45].rotateAngleZ = 1.69296937F;
		
		turretModel[46].addShapeBox(17F, -8.5F, -3.5F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[46].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[47].addShapeBox(-4F, -36F, -5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 82
		turretModel[47].setRotationPoint(7F, -22.5F, 0F);
		turretModel[47].rotateAngleZ = 1.18682389F;
		
		turretModel[48].addShapeBox(-16F, 0F, -17F, 11, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		turretModel[48].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[49].addShapeBox(-16F, 0F, -19F, 4, 1, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 161
		turretModel[49].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[50].addShapeBox(-9F, 0F, -19F, 4, 1, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 162
		turretModel[50].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[51].addShapeBox(7.5F, -12F, -2.5F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 22
		turretModel[51].setRotationPoint(-7F, -27.5F, -2.5F);
		
		turretModel[52].addShapeBox(8.5F, -12F, -2.5F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 23
		turretModel[52].setRotationPoint(-7F, -27.5F, -2.5F);
		
		turretModel[53].addShapeBox(11.5F, -12F, -2.5F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 24
		turretModel[53].setRotationPoint(-7F, -27.5F, -2.5F);
		
		turretModel[54].addShapeBox(18F, -11F, 6F, 2, 1, 4, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 25
		turretModel[54].setRotationPoint(-7F, -27.5F, -14.5F);
		
		turretModel[55].addShapeBox(18F, -11F, 6F, 2, 1, 4, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 26
		turretModel[55].setRotationPoint(-7F, -28.5F, -14.5F);
		
		turretModel[56].addShapeBox(1F, -17.5F, 8F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		turretModel[56].setRotationPoint(7F, -22.5F, 0F);
		
		turretModel[57].addShapeBox(11.5F, -12F, -7.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 28
		turretModel[57].setRotationPoint(-7F, -27.2F, -2.5F);
		
		turretModel[58].addShapeBox(10.5F, -12F, -7.5F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 29
		turretModel[58].setRotationPoint(-7F, -27.2F, -2.5F);
		
		turretModel[59].addShapeBox(12.5F, -12F, -7.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 30
		turretModel[59].setRotationPoint(-7F, -27.2F, -2.5F);
		
		turretModel[60].addShapeBox(-8.5F, -22F, 1F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 31
		turretModel[60].setRotationPoint(-7F, -27.2F, -2.5F);
		turretModel[60].rotateAngleZ = 1.18682389F;
		
		turretModel[61].addShapeBox(-7.5F, -22F, 1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 32
		turretModel[61].setRotationPoint(-7F, -27.2F, -2.5F);
		turretModel[61].rotateAngleZ = 1.18682389F;
		
		turretModel[62].addShapeBox(-6.5F, -22F, 1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Box 33
		turretModel[62].setRotationPoint(-7F, -27.2F, -2.5F);
		turretModel[62].rotateAngleZ = 1.18682389F;
		
		turretModel[63].addShapeBox(22F, -31F, -9.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 487
		turretModel[63].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[63].rotateAngleX = 1.13446401F;
		turretModel[63].rotateAngleY = 0.31415927F;
		turretModel[63].rotateAngleZ = -0.10471976F;
		
		turretModel[64].addShapeBox(20F, -31F, -9.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		turretModel[64].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[64].rotateAngleX = 1.13446401F;
		turretModel[64].rotateAngleY = 0.31415927F;
		turretModel[64].rotateAngleZ = -0.10471976F;
		
		turretModel[65].addShapeBox(19F, -31F, -9.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 489
		turretModel[65].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[65].rotateAngleX = 1.13446401F;
		turretModel[65].rotateAngleY = 0.31415927F;
		turretModel[65].rotateAngleZ = -0.10471976F;
		
		turretModel[66].addShapeBox(18F, -31F, -9.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 490
		turretModel[66].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[66].rotateAngleX = 1.13446401F;
		turretModel[66].rotateAngleY = 0.31415927F;
		turretModel[66].rotateAngleZ = -0.10471976F;
		
		turretModel[67].addShapeBox(16F, -31F, -9.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		turretModel[67].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[67].rotateAngleX = 1.13446401F;
		turretModel[67].rotateAngleY = 0.31415927F;
		turretModel[67].rotateAngleZ = -0.10471976F;
		
		turretModel[68].addShapeBox(15F, -31F, -9.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 492
		turretModel[68].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[68].rotateAngleX = 1.13446401F;
		turretModel[68].rotateAngleY = 0.31415927F;
		turretModel[68].rotateAngleZ = -0.10471976F;
		
		turretModel[69].addShapeBox(14F, -31F, -9.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 493
		turretModel[69].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[69].rotateAngleX = 1.13446401F;
		turretModel[69].rotateAngleY = 0.31415927F;
		turretModel[69].rotateAngleZ = -0.10471976F;
		
		turretModel[70].addShapeBox(12F, -31F, -9.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		turretModel[70].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[70].rotateAngleX = 1.13446401F;
		turretModel[70].rotateAngleY = 0.31415927F;
		turretModel[70].rotateAngleZ = -0.10471976F;
		
		turretModel[71].addShapeBox(11F, -31F, -9.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 495
		turretModel[71].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[71].rotateAngleX = 1.13446401F;
		turretModel[71].rotateAngleY = 0.31415927F;
		turretModel[71].rotateAngleZ = -0.10471976F;
		
		turretModel[72].addShapeBox(10F, -31F, -9.5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 496
		turretModel[72].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[72].rotateAngleX = 1.13446401F;
		turretModel[72].rotateAngleY = 0.31415927F;
		turretModel[72].rotateAngleZ = -0.10471976F;
		
		turretModel[73].addShapeBox(8F, -31F, -9.5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		turretModel[73].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[73].rotateAngleX = 1.13446401F;
		turretModel[73].rotateAngleY = 0.31415927F;
		turretModel[73].rotateAngleZ = -0.10471976F;
		
		turretModel[74].addShapeBox(7F, -31F, -9.5F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 498
		turretModel[74].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[74].rotateAngleX = 1.13446401F;
		turretModel[74].rotateAngleY = 0.31415927F;
		turretModel[74].rotateAngleZ = -0.10471976F;
		
		turretModel[75].addShapeBox(10.5F, -32F, -4.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		turretModel[75].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[75].rotateAngleX = 1.13446401F;
		turretModel[75].rotateAngleY = 0.31415927F;
		turretModel[75].rotateAngleZ = -0.10471976F;
		
		turretModel[76].addShapeBox(10.5F, -32F, -6.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		turretModel[76].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[76].rotateAngleX = 1.13446401F;
		turretModel[76].rotateAngleY = 0.31415927F;
		turretModel[76].rotateAngleZ = -0.10471976F;
		
		turretModel[77].addShapeBox(13.5F, -32F, -6.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		turretModel[77].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[77].rotateAngleX = 1.13446401F;
		turretModel[77].rotateAngleY = 0.31415927F;
		turretModel[77].rotateAngleZ = -0.10471976F;
		
		turretModel[78].addShapeBox(13.5F, -32F, -4.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		turretModel[78].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[78].rotateAngleX = 1.13446401F;
		turretModel[78].rotateAngleY = 0.31415927F;
		turretModel[78].rotateAngleZ = -0.10471976F;
		
		turretModel[79].addShapeBox(16.5F, -32F, -6.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		turretModel[79].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[79].rotateAngleX = 1.13446401F;
		turretModel[79].rotateAngleY = 0.31415927F;
		turretModel[79].rotateAngleZ = -0.10471976F;
		
		turretModel[80].addShapeBox(16.5F, -32F, -4.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		turretModel[80].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[80].rotateAngleX = 1.13446401F;
		turretModel[80].rotateAngleY = 0.31415927F;
		turretModel[80].rotateAngleZ = -0.10471976F;
		
		turretModel[81].addShapeBox(19.5F, -32F, -6.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		turretModel[81].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[81].rotateAngleX = 1.13446401F;
		turretModel[81].rotateAngleY = 0.31415927F;
		turretModel[81].rotateAngleZ = -0.10471976F;
		
		turretModel[82].addShapeBox(19.5F, -32F, -4.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		turretModel[82].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[82].rotateAngleX = 1.13446401F;
		turretModel[82].rotateAngleY = 0.31415927F;
		turretModel[82].rotateAngleZ = -0.10471976F;
		
		turretModel[83].addShapeBox(7.5F, -32F, -6.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		turretModel[83].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[83].rotateAngleX = 1.13446401F;
		turretModel[83].rotateAngleY = 0.31415927F;
		turretModel[83].rotateAngleZ = -0.10471976F;
		
		turretModel[84].addShapeBox(7.5F, -32F, -4.5F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		turretModel[84].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[84].rotateAngleX = 1.13446401F;
		turretModel[84].rotateAngleY = 0.31415927F;
		turretModel[84].rotateAngleZ = -0.10471976F;
		
		turretModel[85].addShapeBox(-17F, -15.4F, 2.9F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		turretModel[85].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[85].rotateAngleX = 1.1693706F;
		turretModel[85].rotateAngleY = -3.38593875F;
		turretModel[85].rotateAngleZ = 0.27925268F;
		
		turretModel[86].addShapeBox(-15F, -15.4F, 2.9F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 512
		turretModel[86].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[86].rotateAngleX = 1.1693706F;
		turretModel[86].rotateAngleY = -3.38593875F;
		turretModel[86].rotateAngleZ = 0.27925268F;
		
		turretModel[87].addShapeBox(-18F, -15.4F, 2.9F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 513
		turretModel[87].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[87].rotateAngleX = 1.1693706F;
		turretModel[87].rotateAngleY = -3.38593875F;
		turretModel[87].rotateAngleZ = 0.27925268F;
		
		turretModel[88].addShapeBox(-19F, -15.4F, 2.9F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 514
		turretModel[88].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[88].rotateAngleX = 1.1693706F;
		turretModel[88].rotateAngleY = -3.38593875F;
		turretModel[88].rotateAngleZ = 0.27925268F;
		
		turretModel[89].addShapeBox(-21F, -15.4F, 2.9F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		turretModel[89].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[89].rotateAngleX = 1.1693706F;
		turretModel[89].rotateAngleY = -3.38593875F;
		turretModel[89].rotateAngleZ = 0.27925268F;
		
		turretModel[90].addShapeBox(-22F, -15.4F, 2.9F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 516
		turretModel[90].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[90].rotateAngleX = 1.1693706F;
		turretModel[90].rotateAngleY = -3.38593875F;
		turretModel[90].rotateAngleZ = 0.27925268F;
		
		turretModel[91].addShapeBox(-23F, -15.4F, 2.9F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 517
		turretModel[91].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[91].rotateAngleX = 1.1693706F;
		turretModel[91].rotateAngleY = -3.38593875F;
		turretModel[91].rotateAngleZ = 0.27925268F;
		
		turretModel[92].addShapeBox(-25F, -15.4F, 2.9F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		turretModel[92].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[92].rotateAngleX = 1.1693706F;
		turretModel[92].rotateAngleY = -3.38593875F;
		turretModel[92].rotateAngleZ = 0.27925268F;
		
		turretModel[93].addShapeBox(-26F, -15.4F, 2.9F, 1, 1, 10, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 519
		turretModel[93].setRotationPoint(-7F, -22.5F, 9F);
		turretModel[93].rotateAngleX = 1.1693706F;
		turretModel[93].rotateAngleY = -3.38593875F;
		turretModel[93].rotateAngleZ = 0.27925268F;
		
		turretModel[94].addShapeBox(-22.5F, -16.4F, 7.9F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		turretModel[94].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[94].rotateAngleX = 1.1693706F;
		turretModel[94].rotateAngleY = -3.38593875F;
		turretModel[94].rotateAngleZ = 0.27925268F;
		
		turretModel[95].addShapeBox(-19.5F, -16.4F, 7.9F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		turretModel[95].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[95].rotateAngleX = 1.1693706F;
		turretModel[95].rotateAngleY = -3.38593875F;
		turretModel[95].rotateAngleZ = 0.27925268F;
		
		turretModel[96].addShapeBox(-16.5F, -16.4F, 7.9F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		turretModel[96].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[96].rotateAngleX = 1.1693706F;
		turretModel[96].rotateAngleY = -3.38593875F;
		turretModel[96].rotateAngleZ = 0.27925268F;
		
		turretModel[97].addShapeBox(-16.5F, -16.4F, 5.9F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		turretModel[97].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[97].rotateAngleX = 1.1693706F;
		turretModel[97].rotateAngleY = -3.38593875F;
		turretModel[97].rotateAngleZ = 0.27925268F;
		
		turretModel[98].addShapeBox(-19.5F, -16.4F, 5.9F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		turretModel[98].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[98].rotateAngleX = 1.1693706F;
		turretModel[98].rotateAngleY = -3.38593875F;
		turretModel[98].rotateAngleZ = 0.27925268F;
		
		turretModel[99].addShapeBox(-22.5F, -16.4F, 5.9F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		turretModel[99].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[99].rotateAngleX = 1.1693706F;
		turretModel[99].rotateAngleY = -3.38593875F;
		turretModel[99].rotateAngleZ = 0.27925268F;
		
		turretModel[100].addShapeBox(-25.5F, -16.4F, 5.9F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		turretModel[100].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[100].rotateAngleX = 1.1693706F;
		turretModel[100].rotateAngleY = -3.38593875F;
		turretModel[100].rotateAngleZ = 0.27925268F;
		
		turretModel[101].addShapeBox(-25.5F, -16.4F, 7.9F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		turretModel[101].setRotationPoint(-7F, -22.5F, 9.5F);
		turretModel[101].rotateAngleX = 1.1693706F;
		turretModel[101].rotateAngleY = -3.38593875F;
		turretModel[101].rotateAngleZ = 0.27925268F;
		
		turretModel[102].addShapeBox(8.5F, -6F, -24.5F, 11, 8, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		turretModel[102].setRotationPoint(0F, -22.5F, 0F);
		turretModel[102].rotateAngleX = -0.34906585F;
		turretModel[102].rotateAngleY = -2.89724656F;
		turretModel[102].rotateAngleZ = -0.10471976F;
		
		turretModel[103].addShapeBox(8.5F, -7.3F, -24.5F, 11, 4, 5, 0F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 585
		turretModel[103].setRotationPoint(0F, -22.5F, 0F);
		turretModel[103].rotateAngleX = -0.34906585F;
		turretModel[103].rotateAngleY = -2.89724656F;
		turretModel[103].rotateAngleZ = -0.10471976F;
		
		turretModel[104].addShapeBox(13.5F, -4.5F, -24.9F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		turretModel[104].setRotationPoint(0F, -22.5F, 0F);
		turretModel[104].rotateAngleX = -0.34906585F;
		turretModel[104].rotateAngleY = -2.89724656F;
		turretModel[104].rotateAngleZ = -0.10471976F;
		
		turretModel[105].addShapeBox(8.5F, -6F, -22.5F, 11, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		turretModel[105].setRotationPoint(0F, -22.5F, 0F);
		turretModel[105].rotateAngleX = -0.34906585F;
		turretModel[105].rotateAngleY = -2.89724656F;
		turretModel[105].rotateAngleZ = -0.10471976F;
		
		turretModel[106].addShapeBox(-10.5F, -2.5F, -22.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		turretModel[106].setRotationPoint(0F, -22.5F, 0F);
		turretModel[106].rotateAngleX = -0.40142573F;
		turretModel[106].rotateAngleY = -0.27925268F;
		turretModel[106].rotateAngleZ = -0.06981317F;
		
		turretModel[107].addShapeBox(-12.5F, -3.5F, -22.1F, 5, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[107].setRotationPoint(0F, -22.5F, 0F);
		turretModel[107].rotateAngleX = -0.40142573F;
		turretModel[107].rotateAngleY = -0.27925268F;
		turretModel[107].rotateAngleZ = -0.06981317F;
		
		turretModel[108].addShapeBox(-12.5F, -3.5F, -21.1F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[108].setRotationPoint(0F, -22.5F, 0F);
		turretModel[108].rotateAngleX = -0.40142573F;
		turretModel[108].rotateAngleY = -0.27925268F;
		turretModel[108].rotateAngleZ = -0.06981317F;
		
		turretModel[109].addShapeBox(-12.5F, 1.5F, -22.1F, 5, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		turretModel[109].setRotationPoint(0F, -22.5F, 0F);
		turretModel[109].rotateAngleX = -0.36651914F;
		turretModel[109].rotateAngleY = -0.27925268F;
		turretModel[109].rotateAngleZ = 0.03490659F;
		
		turretModel[110].addShapeBox(-12.5F, 1.5F, -21.1F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		turretModel[110].setRotationPoint(0F, -22.5F, 0F);
		turretModel[110].rotateAngleX = -0.36651914F;
		turretModel[110].rotateAngleY = -0.27925268F;
		turretModel[110].rotateAngleZ = 0.03490659F;
		
		turretModel[111].addShapeBox(-10.5F, 2.5F, -22.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		turretModel[111].setRotationPoint(0F, -22.5F, 0F);
		turretModel[111].rotateAngleX = -0.36651914F;
		turretModel[111].rotateAngleY = -0.27925268F;
		turretModel[111].rotateAngleZ = 0.03490659F;
		
		turretModel[112].addShapeBox(-19.5F, 1.5F, -22.1F, 5, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		turretModel[112].setRotationPoint(0F, -22.5F, 0F);
		turretModel[112].rotateAngleX = -0.40142573F;
		turretModel[112].rotateAngleY = -0.27925268F;
		turretModel[112].rotateAngleZ = -0.03490659F;
		
		turretModel[113].addShapeBox(-19.5F, 1.5F, -21.1F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		turretModel[113].setRotationPoint(0F, -22.5F, 0F);
		turretModel[113].rotateAngleX = -0.40142573F;
		turretModel[113].rotateAngleY = -0.27925268F;
		turretModel[113].rotateAngleZ = -0.03490659F;
		
		turretModel[114].addShapeBox(-17.5F, 2.5F, -22.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		turretModel[114].setRotationPoint(0F, -22.5F, 0F);
		turretModel[114].rotateAngleX = -0.40142573F;
		turretModel[114].rotateAngleY = -0.27925268F;
		turretModel[114].rotateAngleZ = -0.03490659F;
		
		turretModel[115].addShapeBox(-19.5F, -4.5F, -22.1F, 5, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		turretModel[115].setRotationPoint(0F, -22.5F, 0F);
		turretModel[115].rotateAngleX = -0.43633231F;
		turretModel[115].rotateAngleY = -0.27925268F;
		turretModel[115].rotateAngleZ = 0.05235988F;
		
		turretModel[116].addShapeBox(-19.5F, -4.5F, -21.1F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		turretModel[116].setRotationPoint(0F, -22.5F, 0F);
		turretModel[116].rotateAngleX = -0.43633231F;
		turretModel[116].rotateAngleY = -0.27925268F;
		turretModel[116].rotateAngleZ = 0.05235988F;
		
		turretModel[117].addShapeBox(-17.5F, -3.5F, -22.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		turretModel[117].setRotationPoint(0F, -22.5F, 0F);
		turretModel[117].rotateAngleX = -0.43633231F;
		turretModel[117].rotateAngleY = -0.27925268F;
		turretModel[117].rotateAngleZ = 0.05235988F;
		
		turretModel[118].addShapeBox(13F, 18.5F, -11F, 35, 1, 35, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F); // Box 0
		turretModel[118].setRotationPoint(7.5F, -22.5F, 40F);
		turretModel[118].rotateAngleY = -1.57079633F;
		turretModel[118].rotateAngleZ = 1.22173048F;
		
		turretModel[119].addShapeBox(7.5F, -57F, -11F, 35, 1, 35, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F); // Box 575
		turretModel[119].setRotationPoint(7.5F, -22.5F, 40F);
		turretModel[119].rotateAngleY = -1.57079633F;
		turretModel[119].rotateAngleZ = -1.22173048F;
	}
	
	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 13
		barrelModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 14
		barrelModel[2] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 15
		barrelModel[3] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 19
		barrelModel[4] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 0
		barrelModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		barrelModel[6] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 2
		barrelModel[7] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 2
		barrelModel[8] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 4
		barrelModel[9] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 5
		barrelModel[10] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 6
		barrelModel[11] = new ModelRendererTurbo(this, 9, 484, textureX, textureY); // Box 239
		barrelModel[12] = new ModelRendererTurbo(this, 121, 484, textureX, textureY); // Box 242
		barrelModel[13] = new ModelRendererTurbo(this, 393, 483, textureX, textureY); // Box 243
		barrelModel[14] = new ModelRendererTurbo(this, 89, 484, textureX, textureY); // Box 244
		barrelModel[15] = new ModelRendererTurbo(this, 145, 484, textureX, textureY); // Box 247
		barrelModel[16] = new ModelRendererTurbo(this, 145, 484, textureX, textureY); // Box 20
		barrelModel[17] = new ModelRendererTurbo(this, 220, 484, textureX, textureY); // Box 21
		barrelModel[18] = new ModelRendererTurbo(this, 145, 484, textureX, textureY); // Box 22
		barrelModel[19] = new ModelRendererTurbo(this, 145, 484, textureX, textureY); // Box 23
		barrelModel[20] = new ModelRendererTurbo(this, 250, 484, textureX, textureY); // Box 24
		barrelModel[21] = new ModelRendererTurbo(this, 177, 484, textureX, textureY); // Box 25
		barrelModel[22] = new ModelRendererTurbo(this, 177, 484, textureX, textureY); // Box 26
		barrelModel[23] = new ModelRendererTurbo(this, 497, 484, textureX, textureY); // Box 44
		barrelModel[24] = new ModelRendererTurbo(this, 497, 484, textureX, textureY); // Box 45
		barrelModel[25] = new ModelRendererTurbo(this, 145, 484, textureX, textureY); // Box 46
		barrelModel[26] = new ModelRendererTurbo(this, 145, 484, textureX, textureY); // Box 47
		barrelModel[27] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 13
		barrelModel[28] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 74
		
		barrelModel[0].addShapeBox(2F, -5.5F, -6F, 1, 2, 11, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[0].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[1].addBox(2F, -3.5F, -6F, 1, 6, 11, 0F); // Box 14
		barrelModel[1].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[2].addShapeBox(2F, 2.5F, -6F, 1, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 15
		barrelModel[2].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[3].addShapeBox(28F, -2.5F, -2.5F, 40, 4, 4, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F); // Box 19
		barrelModel[3].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[4].addShapeBox(3F, -5F, -5.5F, 3, 2, 10, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		barrelModel[4].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[5].addShapeBox(3F, 2F, -5.5F, 3, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 1
		barrelModel[5].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[6].addShapeBox(3F, -3F, -5.5F, 3, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2
		barrelModel[6].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[7].addShapeBox(2F, -2.5F, -5F, 6, 4, 9, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 2
		barrelModel[7].setRotationPoint(30F, -27.5F, 0F);
		
		barrelModel[8].addShapeBox(2F, -4.5F, -5F, 6, 2, 9, 0F, 0F, -1F, -2F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 4
		barrelModel[8].setRotationPoint(30F, -27.5F, 0F);
		
		barrelModel[9].addShapeBox(2F, 1.5F, -5F, 6, 2, 9, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1F, -2F); // Box 5
		barrelModel[9].setRotationPoint(30F, -27.5F, 0F);
		
		barrelModel[10].addShapeBox(13F, -2.5F, -2.5F, 15, 4, 4, 0F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F); // Box 6
		barrelModel[10].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[11].addShapeBox(71F, -3F, -3F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		barrelModel[11].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[12].addShapeBox(71F, -2F, 1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		barrelModel[12].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[13].addShapeBox(71F, -2F, -3F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		barrelModel[13].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[14].addShapeBox(71F, 1F, -3F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 244
		barrelModel[14].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[15].addShapeBox(72F, -1.5F, 0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		barrelModel[15].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[16].addShapeBox(72F, -1.5F, -2.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		barrelModel[16].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[17].addShapeBox(72F, -2.5F, -2.5F, 4, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		barrelModel[17].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[18].addShapeBox(75F, -1.5F, 0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		barrelModel[18].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[19].addShapeBox(75F, -1.5F, -2.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		barrelModel[19].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[20].addShapeBox(72F, 0.5F, -2.5F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 24
		barrelModel[20].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[21].addShapeBox(68F, 0.5F, -1.5F, 3, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 25
		barrelModel[21].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[22].addShapeBox(68F, -2.5F, -1.5F, 3, 1, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 26
		barrelModel[22].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[23].addShapeBox(76F, -2.5F, -2.5F, 1, 1, 4, 0F, 0F, 0F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 44
		barrelModel[23].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[24].addShapeBox(76F, 0.5F, -2.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, 0F, 0F, -1F); // Box 45
		barrelModel[24].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[25].addShapeBox(76F, -1.5F, 0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 46
		barrelModel[25].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[26].addShapeBox(76F, -1.5F, -2.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		barrelModel[26].setRotationPoint(26F, -27.5F, 0F);
		
		barrelModel[27].addBox(0.8F, -2.5F, 5F, 1, 3, 3, 0F); // Box 13
		barrelModel[27].setRotationPoint(26F, -27.5F, 0F);
		barrelModel[27].rotateAngleZ = 0.2268928F;
		
		barrelModel[28].addShapeBox(5F, -2.5F, -2.5F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		barrelModel[28].setRotationPoint(30F, -27.5F, 0F);
	}
	
	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 2
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 3
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 4
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 5
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 6
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 7
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 8
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 9
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 10
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 11
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 12
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 13
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 14
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 15
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 321, 412, textureX, textureY); // Shape 32
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 33
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 321, 371, textureX, textureY); // Shape 34
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 4
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 40
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 41
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 42
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 43
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 44
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 45
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 46
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 47
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 48
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Box 49
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 50
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 51
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 52
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 53
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 54
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 55
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 56
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 57
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 58
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 59
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 60
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 61
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 62
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 63
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 64
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 65
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 379, 371, textureX, textureY); // Shape 52
		
		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 2
		leftTrackWheelModels[0].setRotationPoint(-30F, 1.5F, 26F);
		
		leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 3
		leftTrackWheelModels[1].setRotationPoint(-12F, 1.5F, 26F);
		
		leftTrackWheelModels[2].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 4
		leftTrackWheelModels[2].setRotationPoint(6F, 1.5F, 26F);
		
		leftTrackWheelModels[3].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 5
		leftTrackWheelModels[3].setRotationPoint(24F, 1.5F, 26F);
		
		leftTrackWheelModels[4].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 6
		leftTrackWheelModels[4].setRotationPoint(42F, 1.5F, 26F);
		
		leftTrackWheelModels[5].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 7
		leftTrackWheelModels[5].setRotationPoint(-30F, 1.5F, 20F);
		
		leftTrackWheelModels[6].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 8
		leftTrackWheelModels[6].setRotationPoint(-12F, 1.5F, 20F);
		
		leftTrackWheelModels[7].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 9
		leftTrackWheelModels[7].setRotationPoint(6F, 1.5F, 20F);
		
		leftTrackWheelModels[8].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 10
		leftTrackWheelModels[8].setRotationPoint(24F, 1.5F, 20F);
		
		leftTrackWheelModels[9].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 11
		leftTrackWheelModels[9].setRotationPoint(42F, 1.5F, 20F);
		
		leftTrackWheelModels[10].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 12
		leftTrackWheelModels[10].setRotationPoint(33F, 1.5F, 23F);
		
		leftTrackWheelModels[11].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 13
		leftTrackWheelModels[11].setRotationPoint(15F, 1.5F, 23F);
		
		leftTrackWheelModels[12].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 14
		leftTrackWheelModels[12].setRotationPoint(-3F, 1.5F, 23F);
		
		leftTrackWheelModels[13].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 15
		leftTrackWheelModels[13].setRotationPoint(-21F, 1.5F, 23F);
		
		leftTrackWheelModels[14].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 32
		leftTrackWheelModels[14].setRotationPoint(54.5F, -3.5F, 27F);
		
		leftTrackWheelModels[15].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 33
		leftTrackWheelModels[15].setRotationPoint(54.5F, -3.5F, 18F);
		
		leftTrackWheelModels[16].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 12, 12, 12, 44, 12, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 34
		leftTrackWheelModels[16].setRotationPoint(54.5F, -3.5F, 26F);
		
		leftTrackWheelModels[17].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 4
		leftTrackWheelModels[17].setRotationPoint(6F, 1.5F, 28F);
		
		leftTrackWheelModels[18].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackWheelModels[18].setRotationPoint(6F, 1.5F, 18F);
		
		leftTrackWheelModels[19].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 41
		leftTrackWheelModels[19].setRotationPoint(6F, 1.5F, 18F);
		
		leftTrackWheelModels[20].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 42
		leftTrackWheelModels[20].setRotationPoint(15F, 1.5F, 18F);
		
		leftTrackWheelModels[21].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftTrackWheelModels[21].setRotationPoint(15F, 1.5F, 18F);
		
		leftTrackWheelModels[22].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 44
		leftTrackWheelModels[22].setRotationPoint(15F, 1.5F, 28F);
		
		leftTrackWheelModels[23].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 45
		leftTrackWheelModels[23].setRotationPoint(24F, 1.5F, 18F);
		
		leftTrackWheelModels[24].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackWheelModels[24].setRotationPoint(24F, 1.5F, 18F);
		
		leftTrackWheelModels[25].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 47
		leftTrackWheelModels[25].setRotationPoint(24F, 1.5F, 28F);
		
		leftTrackWheelModels[26].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 48
		leftTrackWheelModels[26].setRotationPoint(33F, 1.5F, 18F);
		
		leftTrackWheelModels[27].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftTrackWheelModels[27].setRotationPoint(33F, 1.5F, 18F);
		
		leftTrackWheelModels[28].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 50
		leftTrackWheelModels[28].setRotationPoint(33F, 1.5F, 28F);
		
		leftTrackWheelModels[29].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 51
		leftTrackWheelModels[29].setRotationPoint(42F, 1.5F, 18F);
		
		leftTrackWheelModels[30].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftTrackWheelModels[30].setRotationPoint(42F, 1.5F, 18F);
		
		leftTrackWheelModels[31].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 53
		leftTrackWheelModels[31].setRotationPoint(42F, 1.5F, 28F);
		
		leftTrackWheelModels[32].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 54
		leftTrackWheelModels[32].setRotationPoint(-3F, 1.5F, 18F);
		
		leftTrackWheelModels[33].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		leftTrackWheelModels[33].setRotationPoint(-3F, 1.5F, 18F);
		
		leftTrackWheelModels[34].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 56
		leftTrackWheelModels[34].setRotationPoint(-3F, 1.5F, 28F);
		
		leftTrackWheelModels[35].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 57
		leftTrackWheelModels[35].setRotationPoint(-12F, 1.5F, 18F);
		
		leftTrackWheelModels[36].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftTrackWheelModels[36].setRotationPoint(-12F, 1.5F, 18F);
		
		leftTrackWheelModels[37].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 59
		leftTrackWheelModels[37].setRotationPoint(-12F, 1.5F, 28F);
		
		leftTrackWheelModels[38].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 60
		leftTrackWheelModels[38].setRotationPoint(-21F, 1.5F, 18F);
		
		leftTrackWheelModels[39].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftTrackWheelModels[39].setRotationPoint(-21F, 1.5F, 18F);
		
		leftTrackWheelModels[40].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 62
		leftTrackWheelModels[40].setRotationPoint(-21F, 1.5F, 28F);
		
		leftTrackWheelModels[41].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 63
		leftTrackWheelModels[41].setRotationPoint(-30F, 1.5F, 18F);
		
		leftTrackWheelModels[42].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftTrackWheelModels[42].setRotationPoint(-30F, 1.5F, 18F);
		
		leftTrackWheelModels[43].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 65
		leftTrackWheelModels[43].setRotationPoint(-30F, 1.5F, 28F);
		
		leftTrackWheelModels[44].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 4, 12, 12, 44, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 52
		leftTrackWheelModels[44].setRotationPoint(-43.4F, -4F, 22F);
	}
	
	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 17
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 18
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 19
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 20
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 21
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 22
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 23
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 24
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 25
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 26
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 27
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 28
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 29
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 30
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 35
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 330, 334, textureX, textureY); // Shape 36
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 321, 371, textureX, textureY); // Shape 37
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 67
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 0
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 1
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 2
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 3
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 4
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 5
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 6
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 7
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 8
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 9
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 10
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 11
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 12
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 13
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 14
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 15
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 16
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 17
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 18
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 19
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 20
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 21
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 22
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 23
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 24
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 257, 252, textureX, textureY); // Shape 25
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 379, 371, textureX, textureY); // Shape 16
		
		rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 17
		rightTrackWheelModels[0].setRotationPoint(-30F, 1.5F, -25F);
		
		rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 18
		rightTrackWheelModels[1].setRotationPoint(-12F, 1.5F, -25F);
		
		rightTrackWheelModels[2].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 19
		rightTrackWheelModels[2].setRotationPoint(6F, 1.5F, -25F);
		
		rightTrackWheelModels[3].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 20
		rightTrackWheelModels[3].setRotationPoint(24F, 1.5F, -25F);
		
		rightTrackWheelModels[4].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 21
		rightTrackWheelModels[4].setRotationPoint(42F, 1.5F, -25F);
		
		rightTrackWheelModels[5].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 22
		rightTrackWheelModels[5].setRotationPoint(-30F, 1.5F, -19F);
		
		rightTrackWheelModels[6].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 23
		rightTrackWheelModels[6].setRotationPoint(-12F, 1.5F, -19F);
		
		rightTrackWheelModels[7].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 24
		rightTrackWheelModels[7].setRotationPoint(6F, 1.5F, -19F);
		
		rightTrackWheelModels[8].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 25
		rightTrackWheelModels[8].setRotationPoint(24F, 1.5F, -19F);
		
		rightTrackWheelModels[9].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 26
		rightTrackWheelModels[9].setRotationPoint(42F, 1.5F, -19F);
		
		rightTrackWheelModels[10].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 27
		rightTrackWheelModels[10].setRotationPoint(33F, 1.5F, -22F);
		
		rightTrackWheelModels[11].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 28
		rightTrackWheelModels[11].setRotationPoint(15F, 1.5F, -22F);
		
		rightTrackWheelModels[12].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 29
		rightTrackWheelModels[12].setRotationPoint(-3F, 1.5F, -22F);
		
		rightTrackWheelModels[13].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 2, 13, 13, 48, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 30
		rightTrackWheelModels[13].setRotationPoint(-21F, 1.5F, -22F);
		
		rightTrackWheelModels[14].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 35
		rightTrackWheelModels[14].setRotationPoint(54.5F, -3.5F, -27F);
		
		rightTrackWheelModels[15].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 36
		rightTrackWheelModels[15].setRotationPoint(54.5F, -3.5F, -18F);
		
		rightTrackWheelModels[16].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 12, 12, 12, 44, 12, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 37
		rightTrackWheelModels[16].setRotationPoint(54.5F, -3.5F, -19F);
		
		rightTrackWheelModels[17].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 67
		rightTrackWheelModels[17].setRotationPoint(42F, 1.5F, -17F);
		
		rightTrackWheelModels[18].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightTrackWheelModels[18].setRotationPoint(33F, 1.5F, -27F);
		
		rightTrackWheelModels[19].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rightTrackWheelModels[19].setRotationPoint(15F, 1.5F, -27F);
		
		rightTrackWheelModels[20].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightTrackWheelModels[20].setRotationPoint(42F, 1.5F, -27F);
		
		rightTrackWheelModels[21].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		rightTrackWheelModels[21].setRotationPoint(24F, 1.5F, -27F);
		
		rightTrackWheelModels[22].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightTrackWheelModels[22].setRotationPoint(6F, 1.5F, -27F);
		
		rightTrackWheelModels[23].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		rightTrackWheelModels[23].setRotationPoint(-3F, 1.5F, -27F);
		
		rightTrackWheelModels[24].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[24].setRotationPoint(-12F, 1.5F, -27F);
		
		rightTrackWheelModels[25].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		rightTrackWheelModels[25].setRotationPoint(-21F, 1.5F, -27F);
		
		rightTrackWheelModels[26].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightTrackWheelModels[26].setRotationPoint(-30F, 1.5F, -27F);
		
		rightTrackWheelModels[27].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 9
		rightTrackWheelModels[27].setRotationPoint(33F, 1.5F, -17F);
		
		rightTrackWheelModels[28].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 10
		rightTrackWheelModels[28].setRotationPoint(24F, 1.5F, -17F);
		
		rightTrackWheelModels[29].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 11
		rightTrackWheelModels[29].setRotationPoint(15F, 1.5F, -17F);
		
		rightTrackWheelModels[30].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 12
		rightTrackWheelModels[30].setRotationPoint(6F, 1.5F, -17F);
		
		rightTrackWheelModels[31].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 13
		rightTrackWheelModels[31].setRotationPoint(-3F, 1.5F, -17F);
		
		rightTrackWheelModels[32].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 14
		rightTrackWheelModels[32].setRotationPoint(-12F, 1.5F, -17F);
		
		rightTrackWheelModels[33].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 15
		rightTrackWheelModels[33].setRotationPoint(-21F, 1.5F, -17F);
		
		rightTrackWheelModels[34].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 16
		rightTrackWheelModels[34].setRotationPoint(-30F, 1.5F, -17F);
		
		rightTrackWheelModels[35].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 17
		rightTrackWheelModels[35].setRotationPoint(-30F, 1.5F, -27F);
		
		rightTrackWheelModels[36].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 18
		rightTrackWheelModels[36].setRotationPoint(-21F, 1.5F, -27F);
		
		rightTrackWheelModels[37].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 19
		rightTrackWheelModels[37].setRotationPoint(-12F, 1.5F, -27F);
		
		rightTrackWheelModels[38].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 20
		rightTrackWheelModels[38].setRotationPoint(-3F, 1.5F, -27F);
		
		rightTrackWheelModels[39].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 21
		rightTrackWheelModels[39].setRotationPoint(6F, 1.5F, -27F);
		
		rightTrackWheelModels[40].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 22
		rightTrackWheelModels[40].setRotationPoint(15F, 1.5F, -27F);
		
		rightTrackWheelModels[41].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 23
		rightTrackWheelModels[41].setRotationPoint(24F, 1.5F, -27F);
		
		rightTrackWheelModels[42].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 24
		rightTrackWheelModels[42].setRotationPoint(33F, 1.5F, -27F);
		
		rightTrackWheelModels[43].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2)}), 1, 7, 7, 16, 1, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 25
		rightTrackWheelModels[43].setRotationPoint(42F, 1.5F, -27F);
		
		rightTrackWheelModels[44].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 4, 12, 12, 44, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 16
		rightTrackWheelModels[44].setRotationPoint(-43.4F, -4F, -23F);
	}
	
	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 35
		leftTrackModel[1] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 36
		leftTrackModel[2] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 37
		leftTrackModel[3] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 38
		leftTrackModel[4] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 39
		leftTrackModel[5] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 40
		leftTrackModel[6] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 41
		leftTrackModel[7] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 42
		leftTrackModel[8] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 43
		leftTrackModel[9] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 44
		leftTrackModel[10] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 45
		leftTrackModel[11] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 34
		leftTrackModel[12] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Box 46
		leftTrackModel[13] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 47
		leftTrackModel[14] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 48
		leftTrackModel[15] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 49
		leftTrackModel[16] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 50
		leftTrackModel[17] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 51
		leftTrackModel[18] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 52
		leftTrackModel[19] = new ModelRendererTurbo(this, 377, 249, textureX, textureY); // Box 588
		leftTrackModel[20] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 590
		leftTrackModel[21] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 589
		leftTrackModel[22] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 21
		leftTrackModel[23] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Box 22
		leftTrackModel[24] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 23
		leftTrackModel[25] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Box 24
		leftTrackModel[26] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Box 25
		leftTrackModel[27] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 26
		leftTrackModel[28] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 27
		leftTrackModel[29] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Box 28
		leftTrackModel[30] = new ModelRendererTurbo(this, 217, 281, textureX, textureY); // Box 29
		leftTrackModel[31] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Box 30
		leftTrackModel[32] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Box 31
		
		leftTrackModel[0].addBox(0F, -1F, 0F, 7, 1, 12, 0F); // Box 35
		leftTrackModel[0].setRotationPoint(51F, 9F, 16.5F);
		leftTrackModel[0].rotateAngleZ = 0.59341195F;
		
		leftTrackModel[1].addBox(0F, -1F, 0F, 6, 1, 12, 0F); // Box 36
		leftTrackModel[1].setRotationPoint(56.7F, 5.15F, 16.5F);
		leftTrackModel[1].rotateAngleZ = 0.6981317F;
		
		leftTrackModel[2].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 37
		leftTrackModel[2].setRotationPoint(61.3F, 1.3F, 16.5F);
		leftTrackModel[2].rotateAngleZ = 1.30899694F;
		
		leftTrackModel[3].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 38
		leftTrackModel[3].setRotationPoint(62.35F, -2.6F, 16.5F);
		leftTrackModel[3].rotateAngleZ = 1.55334303F;
		
		leftTrackModel[4].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 39
		leftTrackModel[4].setRotationPoint(62.35F, -4.6F, 16.5F);
		leftTrackModel[4].rotateAngleZ = 1.91986218F;
		
		leftTrackModel[5].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 40
		leftTrackModel[5].setRotationPoint(61F, -8.2F, 16.5F);
		leftTrackModel[5].rotateAngleZ = 2.53072742F;
		
		leftTrackModel[6].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 41
		leftTrackModel[6].setRotationPoint(57.7F, -10.55F, 16.5F);
		leftTrackModel[6].rotateAngleZ = 2.89724656F;
		
		leftTrackModel[7].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 42
		leftTrackModel[7].setRotationPoint(55.7F, -11F, 16.5F);
		leftTrackModel[7].rotateAngleZ = 3.14159265F;
		
		leftTrackModel[8].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 43
		leftTrackModel[8].setRotationPoint(51.7F, -11F, 16.5F);
		leftTrackModel[8].rotateAngleZ = 3.54301838F;
		
		leftTrackModel[9].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 44
		leftTrackModel[9].setRotationPoint(48.45F, -8.55F, 16.5F);
		leftTrackModel[9].rotateAngleZ = 3.57792497F;
		
		leftTrackModel[10].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 45
		leftTrackModel[10].setRotationPoint(44.8F, -6.8F, 16.5F);
		leftTrackModel[10].rotateAngleZ = 3.28121899F;
		
		leftTrackModel[11].addBox(0F, 0F, 0F, 83, 1, 12, 0F); // Box 34
		leftTrackModel[11].setRotationPoint(-32F, 8F, 16.5F);
		
		leftTrackModel[12].addBox(0F, 0F, 0F, 73, 1, 12, 0F); // Box 46
		leftTrackModel[12].setRotationPoint(38.9F, -5.95F, 16.5F);
		leftTrackModel[12].rotateAngleZ = 3.14159265F;
		
		leftTrackModel[13].addBox(0F, -1F, 0F, 5, 1, 12, 0F); // Box 47
		leftTrackModel[13].setRotationPoint(-42.1F, -10.95F, 16.5F);
		leftTrackModel[13].rotateAngleZ = 3.35103216F;
		
		leftTrackModel[14].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 48
		leftTrackModel[14].setRotationPoint(-47.05F, -9.9F, 16.5F);
		leftTrackModel[14].rotateAngleZ = 3.90953752F;
		
		leftTrackModel[15].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 49
		leftTrackModel[15].setRotationPoint(-49.9F, -7.15F, 16.5F);
		leftTrackModel[15].rotateAngleZ = 4.59021593F;
		
		leftTrackModel[16].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 50
		leftTrackModel[16].setRotationPoint(-50.15F, -5.2F, 16.5F);
		leftTrackModel[16].rotateAngleZ = 4.71238898F;
		
		leftTrackModel[17].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 51
		leftTrackModel[17].setRotationPoint(-50.15F, -2.2F, 16.5F);
		leftTrackModel[17].rotateAngleZ = 5.04400154F;
		
		leftTrackModel[18].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 52
		leftTrackModel[18].setRotationPoint(-49.5F, -0.31F, 16.5F);
		leftTrackModel[18].rotateAngleZ = 5.49778714F;
		
		leftTrackModel[19].addShapeBox(0F, -1F, 0F, 17, 1, 12, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F, -0.45F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F); // Box 588
		leftTrackModel[19].setRotationPoint(-47.38F, 1.81F, 16.5F);
		leftTrackModel[19].rotateAngleZ = 5.84336234F;
		
		leftTrackModel[20].addShapeBox(-4F, 0F, 0F, 4, 1, 12, 0F, 0.4F, -0.09F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.09F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftTrackModel[20].setRotationPoint(-38.1F, -7.78F, 16.5F);
		leftTrackModel[20].rotateAngleZ = -3.59014227F;
		
		leftTrackModel[21].addBox(-5F, -1F, 0F, 5, 1, 12, 0F); // Box 589
		leftTrackModel[21].setRotationPoint(-42.1F, -10.95F, 16.5F);
		leftTrackModel[21].rotateAngleZ = -3.61283155F;
		
		leftTrackModel[22].addBox(0F, 0F, 0F, 83, 1, 12, 0F); // Box 21
		leftTrackModel[22].setRotationPoint(-32F, 8F, -28.5F);
		
		leftTrackModel[23].addBox(0F, 0F, 0F, 73, 1, 12, 0F); // Box 22
		leftTrackModel[23].setRotationPoint(38.9F, -5.95F, -28.5F);
		leftTrackModel[23].rotateAngleZ = 3.14159265F;
		
		leftTrackModel[24].addBox(0F, -1F, 0F, 5, 1, 12, 0F); // Box 23
		leftTrackModel[24].setRotationPoint(-42.1F, -10.95F, -28.5F);
		leftTrackModel[24].rotateAngleZ = 3.35103216F;
		
		leftTrackModel[25].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 24
		leftTrackModel[25].setRotationPoint(-47.05F, -9.9F, -28.5F);
		leftTrackModel[25].rotateAngleZ = 3.90953752F;
		
		leftTrackModel[26].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 25
		leftTrackModel[26].setRotationPoint(-49.9F, -7.15F, -28.5F);
		leftTrackModel[26].rotateAngleZ = 4.59021593F;
		
		leftTrackModel[27].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 26
		leftTrackModel[27].setRotationPoint(-50.15F, -5.2F, -28.5F);
		leftTrackModel[27].rotateAngleZ = 4.71238898F;
		
		leftTrackModel[28].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 27
		leftTrackModel[28].setRotationPoint(-50.15F, -2.2F, -28.5F);
		leftTrackModel[28].rotateAngleZ = 5.04400154F;
		
		leftTrackModel[29].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Box 28
		leftTrackModel[29].setRotationPoint(-49.5F, -0.31F, -28.5F);
		leftTrackModel[29].rotateAngleZ = 5.49778714F;
		
		leftTrackModel[30].addShapeBox(0F, -1F, 0F, 17, 1, 12, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F, -0.45F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F); // Box 29
		leftTrackModel[30].setRotationPoint(-47.38F, 1.81F, -28.5F);
		leftTrackModel[30].rotateAngleZ = 5.84336234F;
		
		leftTrackModel[31].addShapeBox(-4F, 0F, 0F, 4, 1, 12, 0F, 0.4F, -0.09F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.09F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		leftTrackModel[31].setRotationPoint(-38.1F, -7.78F, -28.5F);
		leftTrackModel[31].rotateAngleZ = -3.59014227F;
		
		leftTrackModel[32].addBox(-5F, -1F, 0F, 5, 1, 12, 0F); // Box 31
		leftTrackModel[32].setRotationPoint(-42.1F, -10.95F, -28.5F);
		leftTrackModel[32].rotateAngleZ = -3.61283155F;
	}
	
	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 55
		rightTrackModel[1] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 56
		rightTrackModel[2] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 57
		rightTrackModel[3] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 58
		rightTrackModel[4] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 59
		rightTrackModel[5] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 60
		rightTrackModel[6] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 61
		rightTrackModel[7] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 62
		rightTrackModel[8] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 63
		rightTrackModel[9] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 64
		rightTrackModel[10] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 65
		
		rightTrackModel[0].addBox(0F, -1F, 0F, 7, 1, 12, 0F); // Box 55
		rightTrackModel[0].setRotationPoint(51F, 9F, -28.5F);
		rightTrackModel[0].rotateAngleZ = 0.59341195F;
		
		rightTrackModel[1].addBox(0F, -1F, 0F, 6, 1, 12, 0F); // Box 56
		rightTrackModel[1].setRotationPoint(56.7F, 5.15F, -28.5F);
		rightTrackModel[1].rotateAngleZ = 0.6981317F;
		
		rightTrackModel[2].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 57
		rightTrackModel[2].setRotationPoint(61.3F, 1.3F, -28.5F);
		rightTrackModel[2].rotateAngleZ = 1.30899694F;
		
		rightTrackModel[3].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 58
		rightTrackModel[3].setRotationPoint(62.35F, -2.6F, -28.5F);
		rightTrackModel[3].rotateAngleZ = 1.55334303F;
		
		rightTrackModel[4].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 59
		rightTrackModel[4].setRotationPoint(62.35F, -4.6F, -28.5F);
		rightTrackModel[4].rotateAngleZ = 1.91986218F;
		
		rightTrackModel[5].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 60
		rightTrackModel[5].setRotationPoint(61F, -8.2F, -28.5F);
		rightTrackModel[5].rotateAngleZ = 2.53072742F;
		
		rightTrackModel[6].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Box 61
		rightTrackModel[6].setRotationPoint(57.7F, -10.55F, -28.5F);
		rightTrackModel[6].rotateAngleZ = 2.89724656F;
		
		rightTrackModel[7].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 62
		rightTrackModel[7].setRotationPoint(55.7F, -11F, -28.5F);
		rightTrackModel[7].rotateAngleZ = 3.14159265F;
		
		rightTrackModel[8].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Box 63
		rightTrackModel[8].setRotationPoint(51.7F, -11F, -28.5F);
		rightTrackModel[8].rotateAngleZ = 3.54301838F;
		
		rightTrackModel[9].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 64
		rightTrackModel[9].setRotationPoint(48.45F, -8.55F, -28.5F);
		rightTrackModel[9].rotateAngleZ = 3.57792497F;
		
		rightTrackModel[10].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 65
		rightTrackModel[10].setRotationPoint(44.8F, -6.8F, -28.5F);
		rightTrackModel[10].rotateAngleZ = 3.28121899F;
	}
}
