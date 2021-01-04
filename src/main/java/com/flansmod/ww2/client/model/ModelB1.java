//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.3
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.06.2015 - 22:29:57
// Last changed on: 11.06.2015 - 22:29:57

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelB1 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelB1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[432];
		bodyDoorOpenModel = new ModelRendererTurbo[4];
		bodyDoorCloseModel = new ModelRendererTurbo[4];
		turretModel = new ModelRendererTurbo[33];
		barrelModel = new ModelRendererTurbo[10];
		leftTrackWheelModels = new ModelRendererTurbo[22];
		rightTrackWheelModels = new ModelRendererTurbo[22];
		leftTrackModel = new ModelRendererTurbo[15];
		rightTrackModel = new ModelRendererTurbo[15];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 67
		bodyModel[18] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 71
		bodyModel[19] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 72
		bodyModel[20] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 73
		bodyModel[21] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 79
		bodyModel[22] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 80
		bodyModel[23] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 81
		bodyModel[24] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 82
		bodyModel[25] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 89
		bodyModel[26] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 90
		bodyModel[27] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 91
		bodyModel[28] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 94
		bodyModel[29] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 95
		bodyModel[30] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 96
		bodyModel[31] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 97
		bodyModel[32] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 98
		bodyModel[33] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 99
		bodyModel[34] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 100
		bodyModel[35] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 101
		bodyModel[36] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 102
		bodyModel[37] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 103
		bodyModel[38] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 104
		bodyModel[39] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 105
		bodyModel[40] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 106
		bodyModel[41] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 107
		bodyModel[42] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 108
		bodyModel[43] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 110
		bodyModel[44] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 111
		bodyModel[45] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 112
		bodyModel[46] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 113
		bodyModel[47] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 114
		bodyModel[48] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 115
		bodyModel[49] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 116
		bodyModel[50] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 117
		bodyModel[51] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 118
		bodyModel[52] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 119
		bodyModel[53] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 120
		bodyModel[54] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 121
		bodyModel[55] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 122
		bodyModel[56] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 101
		bodyModel[57] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 102
		bodyModel[58] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 103
		bodyModel[59] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 106
		bodyModel[60] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 111
		bodyModel[61] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 112
		bodyModel[62] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 113
		bodyModel[63] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 115
		bodyModel[64] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 41
		bodyModel[65] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 50
		bodyModel[66] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 51
		bodyModel[67] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 52
		bodyModel[68] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 53
		bodyModel[69] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 54
		bodyModel[70] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 55
		bodyModel[71] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 51
		bodyModel[72] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 9
		bodyModel[75] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 0
		bodyModel[76] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 3
		bodyModel[77] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 4
		bodyModel[78] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 5
		bodyModel[79] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 6
		bodyModel[80] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 7
		bodyModel[81] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
		bodyModel[82] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 9
		bodyModel[83] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 10
		bodyModel[84] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 11
		bodyModel[85] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 12
		bodyModel[86] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 15
		bodyModel[87] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 16
		bodyModel[88] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 17
		bodyModel[89] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 18
		bodyModel[90] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 19
		bodyModel[91] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 20
		bodyModel[92] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 21
		bodyModel[93] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 22
		bodyModel[94] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 23
		bodyModel[95] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 24
		bodyModel[96] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 25
		bodyModel[97] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 27
		bodyModel[98] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 28
		bodyModel[99] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 29
		bodyModel[100] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 30
		bodyModel[101] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 31
		bodyModel[102] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 32
		bodyModel[103] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 33
		bodyModel[104] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 34
		bodyModel[105] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 35
		bodyModel[106] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 36
		bodyModel[107] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 37
		bodyModel[108] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 38
		bodyModel[109] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 39
		bodyModel[110] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 40
		bodyModel[111] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 42
		bodyModel[112] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 43
		bodyModel[113] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 44
		bodyModel[114] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 45
		bodyModel[115] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 46
		bodyModel[116] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 47
		bodyModel[117] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 48
		bodyModel[118] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 49
		bodyModel[119] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 50
		bodyModel[120] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 51
		bodyModel[121] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 53
		bodyModel[122] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 55
		bodyModel[123] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 56
		bodyModel[124] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 57
		bodyModel[125] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 58
		bodyModel[126] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 59
		bodyModel[127] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 60
		bodyModel[128] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 61
		bodyModel[129] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 62
		bodyModel[130] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 63
		bodyModel[131] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 64
		bodyModel[132] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 65
		bodyModel[133] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 66
		bodyModel[134] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 67
		bodyModel[135] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 68
		bodyModel[136] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 83
		bodyModel[137] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 84
		bodyModel[138] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 90
		bodyModel[139] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 91
		bodyModel[140] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 92
		bodyModel[141] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 93
		bodyModel[142] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 94
		bodyModel[143] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 95
		bodyModel[144] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 97
		bodyModel[145] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 98
		bodyModel[146] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 99
		bodyModel[147] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 101
		bodyModel[148] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 102
		bodyModel[149] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 103
		bodyModel[150] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 104
		bodyModel[151] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 105
		bodyModel[152] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 106
		bodyModel[153] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 107
		bodyModel[154] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 108
		bodyModel[155] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 109
		bodyModel[156] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 110
		bodyModel[157] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 111
		bodyModel[158] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 112
		bodyModel[159] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 113
		bodyModel[160] = new ModelRendererTurbo(this, 129, 249, textureX, textureY); // Box 114
		bodyModel[161] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Box 115
		bodyModel[162] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 116
		bodyModel[163] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Box 117
		bodyModel[164] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 118
		bodyModel[165] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 119
		bodyModel[166] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 120
		bodyModel[167] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 1
		bodyModel[169] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 2
		bodyModel[170] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 3
		bodyModel[171] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 4
		bodyModel[172] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 5
		bodyModel[173] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 6
		bodyModel[174] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Box 7
		bodyModel[175] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 8
		bodyModel[176] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Box 9
		bodyModel[177] = new ModelRendererTurbo(this, 489, 249, textureX, textureY); // Box 10
		bodyModel[178] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 11
		bodyModel[179] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 164
		bodyModel[180] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 165
		bodyModel[181] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 166
		bodyModel[182] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 28
		bodyModel[183] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 29
		bodyModel[184] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 30
		bodyModel[185] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 31
		bodyModel[186] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 32
		bodyModel[187] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 33
		bodyModel[188] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 34
		bodyModel[189] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 35
		bodyModel[190] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 36
		bodyModel[191] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 37
		bodyModel[192] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 38
		bodyModel[193] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 39
		bodyModel[194] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 40
		bodyModel[195] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 41
		bodyModel[196] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 42
		bodyModel[197] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 43
		bodyModel[198] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 44
		bodyModel[199] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 54
		bodyModel[200] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 55
		bodyModel[201] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 56
		bodyModel[202] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 57
		bodyModel[203] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 64
		bodyModel[204] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 65
		bodyModel[205] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 66
		bodyModel[206] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 67
		bodyModel[207] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 68
		bodyModel[208] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 69
		bodyModel[209] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 70
		bodyModel[210] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 71
		bodyModel[211] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 72
		bodyModel[212] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 73
		bodyModel[213] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 74
		bodyModel[214] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 75
		bodyModel[215] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 76
		bodyModel[216] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 77
		bodyModel[217] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 78
		bodyModel[218] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 79
		bodyModel[219] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 80
		bodyModel[220] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 81
		bodyModel[221] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 82
		bodyModel[222] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 83
		bodyModel[223] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 84
		bodyModel[224] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 85
		bodyModel[225] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 86
		bodyModel[226] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 87
		bodyModel[227] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 88
		bodyModel[228] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 89
		bodyModel[229] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 90
		bodyModel[230] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 91
		bodyModel[231] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 92
		bodyModel[232] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 93
		bodyModel[233] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 94
		bodyModel[234] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 95
		bodyModel[235] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 96
		bodyModel[236] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 97
		bodyModel[237] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 98
		bodyModel[238] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 99
		bodyModel[239] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 100
		bodyModel[240] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 101
		bodyModel[241] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 102
		bodyModel[242] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 103
		bodyModel[243] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 104
		bodyModel[244] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 105
		bodyModel[245] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 106
		bodyModel[246] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 107
		bodyModel[247] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 108
		bodyModel[248] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 109
		bodyModel[249] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 110
		bodyModel[250] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 111
		bodyModel[251] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 112
		bodyModel[252] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 113
		bodyModel[253] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 114
		bodyModel[254] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 115
		bodyModel[255] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 116
		bodyModel[256] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 117
		bodyModel[257] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 118
		bodyModel[258] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 119
		bodyModel[259] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 120
		bodyModel[260] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 121
		bodyModel[261] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 122
		bodyModel[262] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 123
		bodyModel[263] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 124
		bodyModel[264] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 125
		bodyModel[265] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 126
		bodyModel[266] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 127
		bodyModel[267] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 128
		bodyModel[268] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 129
		bodyModel[269] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 130
		bodyModel[270] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 131
		bodyModel[271] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 132
		bodyModel[272] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 133
		bodyModel[273] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 134
		bodyModel[274] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 135
		bodyModel[275] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 136
		bodyModel[276] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 137
		bodyModel[277] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 138
		bodyModel[278] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 139
		bodyModel[279] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 140
		bodyModel[280] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 141
		bodyModel[281] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 142
		bodyModel[282] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 143
		bodyModel[283] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 144
		bodyModel[284] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 145
		bodyModel[285] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 146
		bodyModel[286] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 147
		bodyModel[287] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 148
		bodyModel[288] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 149
		bodyModel[289] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 150
		bodyModel[290] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 151
		bodyModel[291] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 152
		bodyModel[292] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 153
		bodyModel[293] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 154
		bodyModel[294] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 155
		bodyModel[295] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 156
		bodyModel[296] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 157
		bodyModel[297] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 158
		bodyModel[298] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 159
		bodyModel[299] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 160
		bodyModel[300] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 161
		bodyModel[301] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 162
		bodyModel[302] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 163
		bodyModel[303] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 164
		bodyModel[304] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 165
		bodyModel[305] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 166
		bodyModel[306] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 167
		bodyModel[307] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 168
		bodyModel[308] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 169
		bodyModel[309] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 170
		bodyModel[310] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 171
		bodyModel[311] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 172
		bodyModel[312] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 173
		bodyModel[313] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 174
		bodyModel[314] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 175
		bodyModel[315] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 176
		bodyModel[316] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 177
		bodyModel[317] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 178
		bodyModel[318] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 179
		bodyModel[319] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 180
		bodyModel[320] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 181
		bodyModel[321] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 182
		bodyModel[322] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 183
		bodyModel[323] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 184
		bodyModel[324] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 185
		bodyModel[325] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 186
		bodyModel[326] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 187
		bodyModel[327] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 188
		bodyModel[328] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 189
		bodyModel[329] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 190
		bodyModel[330] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 191
		bodyModel[331] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 192
		bodyModel[332] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 193
		bodyModel[333] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 194
		bodyModel[334] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 195
		bodyModel[335] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 196
		bodyModel[336] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 197
		bodyModel[337] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 198
		bodyModel[338] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 199
		bodyModel[339] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 200
		bodyModel[340] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 201
		bodyModel[341] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 202
		bodyModel[342] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 203
		bodyModel[343] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 204
		bodyModel[344] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 205
		bodyModel[345] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 206
		bodyModel[346] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 207
		bodyModel[347] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 208
		bodyModel[348] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 209
		bodyModel[349] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 210
		bodyModel[350] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 211
		bodyModel[351] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 212
		bodyModel[352] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 213
		bodyModel[353] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 214
		bodyModel[354] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 215
		bodyModel[355] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 216
		bodyModel[356] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 217
		bodyModel[357] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 218
		bodyModel[358] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 219
		bodyModel[359] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 220
		bodyModel[360] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 221
		bodyModel[361] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 222
		bodyModel[362] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 223
		bodyModel[363] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 224
		bodyModel[364] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 225
		bodyModel[365] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 226
		bodyModel[366] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 227
		bodyModel[367] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 228
		bodyModel[368] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 229
		bodyModel[369] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 230
		bodyModel[370] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 231
		bodyModel[371] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 232
		bodyModel[372] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 233
		bodyModel[373] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 234
		bodyModel[374] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 235
		bodyModel[375] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 236
		bodyModel[376] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 237
		bodyModel[377] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 238
		bodyModel[378] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 239
		bodyModel[379] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 248
		bodyModel[380] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 249
		bodyModel[381] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 250
		bodyModel[382] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 251
		bodyModel[383] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 252
		bodyModel[384] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 275
		bodyModel[385] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 276
		bodyModel[386] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 277
		bodyModel[387] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 278
		bodyModel[388] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 279
		bodyModel[389] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 280
		bodyModel[390] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 281
		bodyModel[391] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 282
		bodyModel[392] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 283
		bodyModel[393] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 284
		bodyModel[394] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 285
		bodyModel[395] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 286
		bodyModel[396] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 287
		bodyModel[397] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 288
		bodyModel[398] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 289
		bodyModel[399] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 290
		bodyModel[400] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 291
		bodyModel[401] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 292
		bodyModel[402] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 301
		bodyModel[403] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 302
		bodyModel[404] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 305
		bodyModel[405] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 306
		bodyModel[406] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 307
		bodyModel[407] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 308
		bodyModel[408] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 309
		bodyModel[409] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 310
		bodyModel[410] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 311
		bodyModel[411] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 312
		bodyModel[412] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 313
		bodyModel[413] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 314
		bodyModel[414] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 315
		bodyModel[415] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 316
		bodyModel[416] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 317
		bodyModel[417] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 318
		bodyModel[418] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 319
		bodyModel[419] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 320
		bodyModel[420] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 321
		bodyModel[421] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 322
		bodyModel[422] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 323
		bodyModel[423] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 324
		bodyModel[424] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 325
		bodyModel[425] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 326
		bodyModel[426] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 327
		bodyModel[427] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 328
		bodyModel[428] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 329
		bodyModel[429] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 0
		bodyModel[430] = new ModelRendererTurbo(this, 57, 257, textureX, textureY); // Box 1
		bodyModel[431] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 555

		bodyModel[0].addBox(0F, 0F, 0F, 58, 24, 31, 0F); // Box 0
		bodyModel[0].setRotationPoint(-43F, -21F, -17.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 24, 15, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(15F, -21F, -17.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(3F, -21.5F, 14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 24, 31, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-61F, -21F, -17.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 8
		bodyModel[4].setRotationPoint(-65F, -17.5F, 14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F, 0F, -4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 9
		bodyModel[5].setRotationPoint(-61F, -21.5F, 14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 15, 5, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[6].setRotationPoint(27F, -14F, -17.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 46, 1, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-43F, -21.5F, 14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(23F, -23F, 0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[9].setRotationPoint(25F, -19F, 0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 6, 16, 0F, -5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(21F, -5F, -2.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[11].setRotationPoint(25F, -17F, 2.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 10, 16, 0F, -5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -5F, 0F, 0F); // Box 17
		bodyModel[12].setRotationPoint(21F, -15F, -2.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[13].setRotationPoint(3F, -21.5F, -25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F); // Box 22
		bodyModel[14].setRotationPoint(-65F, -17.5F, -25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 4F, 0.5F); // Box 23
		bodyModel[15].setRotationPoint(-61F, -21.5F, -25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 46, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 24
		bodyModel[16].setRotationPoint(-43F, -21.5F, -25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -6F, 0F); // Box 67
		bodyModel[17].setRotationPoint(15F, -23F, 12.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 71
		bodyModel[18].setRotationPoint(23F, -23F, 10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 72
		bodyModel[19].setRotationPoint(23F, -16F, 0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 24, 1, 0F, 0F, 0F, 0F, 0F, -5.7F, 0F, 0F, -5.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[20].setRotationPoint(15F, -21F, 12.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[21].setRotationPoint(27F, -14F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[22].setRotationPoint(21F, -18F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[23].setRotationPoint(21F, -18F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[24].setRotationPoint(27F, -10F, -13F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[25].setRotationPoint(27F, -14F, -13F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[26].setRotationPoint(21F, -18F, -13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 6, 6, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[27].setRotationPoint(27F, -8F, -13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 94
		bodyModel[28].setRotationPoint(35F, -5F, -19F);

		bodyModel[29].addShapeBox(0F, -0.5F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[29].setRotationPoint(35F, -5F, -19F);

		bodyModel[30].addShapeBox(0F, -1F, 0F, 2, 1, 34, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 96
		bodyModel[30].setRotationPoint(35F, -5F, -19F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[31].setRotationPoint(3F, -21.5F, 21.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[32].setRotationPoint(-43F, -21.5F, 21.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, -4F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 99
		bodyModel[33].setRotationPoint(-61F, -21.5F, 21.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 100
		bodyModel[34].setRotationPoint(-65F, -17.5F, 21.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F); // Box 101
		bodyModel[35].setRotationPoint(3F, -21.5F, -26.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 102
		bodyModel[36].setRotationPoint(-43F, -21.5F, -26.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 4F, 0.5F); // Box 103
		bodyModel[37].setRotationPoint(-61F, -21.5F, -26.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F); // Box 104
		bodyModel[38].setRotationPoint(-65F, -17.5F, -26.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[39].setRotationPoint(3F, -21.5F, -17F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[40].setRotationPoint(-43F, -21.5F, -17F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, -4F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 107
		bodyModel[41].setRotationPoint(-61F, -21.5F, -17F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 108
		bodyModel[42].setRotationPoint(-65F, -17.5F, -17F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 110
		bodyModel[43].setRotationPoint(-43F, -21.5F, 12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 4F, 0.5F); // Box 111
		bodyModel[44].setRotationPoint(-61F, -21.5F, 12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F); // Box 112
		bodyModel[45].setRotationPoint(-65F, -17.5F, 12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 0.5F, 0F, 0F, 0.5F); // Box 113
		bodyModel[46].setRotationPoint(3F, -21.5F, 12F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[47].setRotationPoint(27F, -10F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[48].setRotationPoint(27F, -14F, -14F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[49].setRotationPoint(27F, -10F, -14F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[50].setRotationPoint(21F, -18F, -14F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[51].setRotationPoint(27F, -8F, -14F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[52].setRotationPoint(27F, -8F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[53].setRotationPoint(27F, -10F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[54].setRotationPoint(27F, -14F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[55].setRotationPoint(21F, -18F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 46, 25, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[56].setRotationPoint(-43F, -19F, 21.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 19, 22, 1, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[57].setRotationPoint(12F, -16F, 21.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[58].setRotationPoint(31F, -13F, 21.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 25, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 106
		bodyModel[59].setRotationPoint(-53F, -19F, 21.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 111
		bodyModel[60].setRotationPoint(-57F, -11F, -26.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 25, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 112
		bodyModel[61].setRotationPoint(-53F, -19F, -26.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 15, 6, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[62].setRotationPoint(27F, -14F, -7.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 15, 5, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[63].setRotationPoint(27F, -14F, -12.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 12, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 41
		bodyModel[64].setRotationPoint(15F, 0F, -1.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 50
		bodyModel[65].setRotationPoint(26F, -5F, -17.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 51
		bodyModel[66].setRotationPoint(26F, -8F, -17.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 2F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 52
		bodyModel[67].setRotationPoint(26F, -11F, -17.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 53
		bodyModel[68].setRotationPoint(26F, -5F, 12.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 54
		bodyModel[69].setRotationPoint(26F, -8F, 12.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, 2F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 55
		bodyModel[70].setRotationPoint(26F, -11F, 12.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 16, 31, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 51
		bodyModel[71].setRotationPoint(-65F, -17F, -17.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 0
		bodyModel[72].setRotationPoint(23F, -23F, -1.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 11, 24, 1, 0F, 0F, 0F, 0F, 0F, -5.7F, 0F, 0F, -5.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[73].setRotationPoint(15F, -21F, -2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[74].setRotationPoint(25F, -19F, 8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[75].setRotationPoint(-27F, -25F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 3
		bodyModel[76].setRotationPoint(-27F, -25F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[77].setRotationPoint(-27F, -27F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 5F, -4.5F, 0.5F, -5F, -4.5F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 5F, 4F, 0F, -5F, 4F, 0F); // Box 5
		bodyModel[78].setRotationPoint(-27F, -25F, 11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -5F, -3.5F, 0.5F, 5F, -3.5F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 2F, -1F, 4F, 2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6
		bodyModel[79].setRotationPoint(-27F, -24F, -15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[80].setRotationPoint(-27F, -25F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[81].setRotationPoint(-27F, -24F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[82].setRotationPoint(-27F, -24F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[83].setRotationPoint(-27F, -26F, 9F);

		bodyModel[84].addShapeBox(-18F, 1.2F, 0F, 18, 1, 4, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 11
		bodyModel[84].setRotationPoint(-45F, -24.8F, -24F);
		bodyModel[84].rotateAngleZ = 0.2443461F;

		bodyModel[85].addShapeBox(-18F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[85].setRotationPoint(-45F, -24.8F, -24F);
		bodyModel[85].rotateAngleZ = 0.2443461F;

		bodyModel[86].addShapeBox(-18F, 2.4F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		bodyModel[86].setRotationPoint(-45F, -24.8F, -24F);
		bodyModel[86].rotateAngleZ = 0.2443461F;

		bodyModel[87].addShapeBox(-18F, 1.2F, 0F, 18, 1, 4, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 16
		bodyModel[87].setRotationPoint(-45F, -24.8F, 16F);
		bodyModel[87].rotateAngleZ = 0.2443461F;

		bodyModel[88].addShapeBox(-18F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[88].setRotationPoint(-45F, -24.8F, 16F);
		bodyModel[88].rotateAngleZ = 0.2443461F;

		bodyModel[89].addShapeBox(-18F, 2.4F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 18
		bodyModel[89].setRotationPoint(-45F, -24.8F, 16F);
		bodyModel[89].rotateAngleZ = 0.2443461F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 30, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[90].setRotationPoint(-43F, -24.8F, -17F);

		bodyModel[91].addShapeBox(0F, 1.2F, 0F, 4, 1, 30, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 20
		bodyModel[91].setRotationPoint(-43F, -24.8F, -17F);

		bodyModel[92].addShapeBox(0F, 2.4F, 0F, 4, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[92].setRotationPoint(-43F, -24.8F, -17F);

		bodyModel[93].addShapeBox(0F, 1.2F, 0F, 3, 3, 4, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 22
		bodyModel[93].setRotationPoint(-42.5F, -25.8F, 13F);

		bodyModel[94].addShapeBox(0F, 1.2F, 0F, 6, 3, 3, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 23
		bodyModel[94].setRotationPoint(-45.5F, -25.8F, 16.5F);

		bodyModel[95].addShapeBox(0F, 1.2F, 0F, 3, 3, 4, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 24
		bodyModel[95].setRotationPoint(-42.5F, -25.8F, -21F);

		bodyModel[96].addShapeBox(0F, 1.2F, 0F, 6, 3, 3, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 25
		bodyModel[96].setRotationPoint(-45.5F, -25.8F, -23.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[97].setRotationPoint(-36F, -26.5F, -24F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 28
		bodyModel[98].setRotationPoint(-33F, -26.5F, -24F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 29
		bodyModel[99].setRotationPoint(-33F, -26.2F, -24F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 30
		bodyModel[100].setRotationPoint(-33F, -24.2F, -24F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 31
		bodyModel[101].setRotationPoint(-33F, -22.2F, -24F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 32
		bodyModel[102].setRotationPoint(-33F, -26.5F, 15F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[103].setRotationPoint(-36F, -26.5F, 15F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 34
		bodyModel[104].setRotationPoint(-33F, -26.5F, 15F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 35
		bodyModel[105].setRotationPoint(-33F, -26.2F, 15F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 36
		bodyModel[106].setRotationPoint(-33F, -24.2F, 15F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 37
		bodyModel[107].setRotationPoint(-33F, -22.2F, 15F);

		bodyModel[108].addShapeBox(0F, 1.2F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[108].setRotationPoint(-64F, -20.8F, -22.5F);
		bodyModel[108].rotateAngleZ = -0.27925268F;

		bodyModel[109].addShapeBox(0F, 1.2F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[109].setRotationPoint(-64F, -20.8F, 17.5F);
		bodyModel[109].rotateAngleZ = -0.27925268F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 40
		bodyModel[110].setRotationPoint(-37F, -21.2F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 42
		bodyModel[111].setRotationPoint(-30F, -22.2F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 43
		bodyModel[112].setRotationPoint(-30F, -23.2F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 44
		bodyModel[113].setRotationPoint(-30F, -22.2F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 45
		bodyModel[114].setRotationPoint(-37F, -21.5F, -2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 46
		bodyModel[115].setRotationPoint(-17F, -21.5F, -2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 47
		bodyModel[116].setRotationPoint(-25F, -21.2F, -2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 48
		bodyModel[117].setRotationPoint(-24F, -22.2F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[118].setRotationPoint(-24F, -22.2F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 50
		bodyModel[119].setRotationPoint(-24F, -23.2F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[120].setRotationPoint(37.5F, -7.5F, -27F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[121].setRotationPoint(38.5F, -6.5F, -28F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[122].setRotationPoint(-43F, -17F, 21.6000000000001F);
		bodyModel[122].rotateAngleX = 0.29670597F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[123].setRotationPoint(-43F, -15F, 21.6000000000001F);
		bodyModel[123].rotateAngleX = 0.29670597F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[124].setRotationPoint(-43F, -11F, 21.6000000000001F);
		bodyModel[124].rotateAngleX = 0.29670597F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[125].setRotationPoint(-43F, -13F, 21.6000000000001F);
		bodyModel[125].rotateAngleX = 0.29670597F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[126].setRotationPoint(-43F, -3F, 21.6000000000001F);
		bodyModel[126].rotateAngleX = 0.29670597F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[127].setRotationPoint(-43F, -5F, 21.6000000000001F);
		bodyModel[127].rotateAngleX = 0.29670597F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[128].setRotationPoint(-43F, -7F, 21.6000000000001F);
		bodyModel[128].rotateAngleX = 0.29670597F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[129].setRotationPoint(-43F, -9F, 21.6000000000001F);
		bodyModel[129].rotateAngleX = 0.29670597F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[130].setRotationPoint(-43F, 1F, 21.6000000000001F);
		bodyModel[130].rotateAngleX = 0.29670597F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[131].setRotationPoint(-43F, -1F, 21.6000000000001F);
		bodyModel[131].rotateAngleX = 0.29670597F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[132].setRotationPoint(-44F, -18F, 21.7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[133].setRotationPoint(-23F, -18F, 21.7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[134].setRotationPoint(-43F, -18F, 21.7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[135].setRotationPoint(-43F, 2F, 21.7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 9, 25, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[136].setRotationPoint(3F, -19F, 21.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 46, 25, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[137].setRotationPoint(-43F, -19F, -26.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[138].setRotationPoint(37.5F, -7.5F, 13F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[139].setRotationPoint(38.5F, -6.5F, 12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 92
		bodyModel[140].setRotationPoint(-57F, -11F, 21.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[141].setRotationPoint(38F, -11F, 21.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 94
		bodyModel[142].setRotationPoint(-33F, -26.5F, -24F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[143].setRotationPoint(-17.5F, -17F, -26.8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[144].setRotationPoint(-18.5F, -17F, -26.9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[145].setRotationPoint(-5.5F, -17F, -26.9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[146].setRotationPoint(-18.5F, -18F, -26.9F);
		bodyModel[146].rotateAngleX = -0.40142573F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[147].setRotationPoint(-16F, -11F, -27.2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[148].setRotationPoint(-43F, 2F, -26.6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[149].setRotationPoint(-43F, 2F, 21.6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 104
		bodyModel[150].setRotationPoint(-36F, -26.5F, -17F);
		bodyModel[150].rotateAngleY = 0.54105207F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 105
		bodyModel[151].setRotationPoint(-37F, -26.5F, 9F);
		bodyModel[151].rotateAngleY = 0.05235988F;

		bodyModel[152].addShapeBox(0F, 0F, 0.5F, 6, 6, 2, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 106
		bodyModel[152].setRotationPoint(-37F, -27.5F, 6.5F);
		bodyModel[152].rotateAngleX = -0.15707963F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 19, 22, 1, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[153].setRotationPoint(12F, -16F, -26.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[154].setRotationPoint(31F, -13F, -26.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 9, 25, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[155].setRotationPoint(3F, -19F, -26.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[156].setRotationPoint(38F, -11F, -26.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 10, 9, 11, 0F, 0F, -4F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, 0F); // Box 111
		bodyModel[157].setRotationPoint(-55F, -23F, -15.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 9, 11, 0F, 0F, -3F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -5F, 0F); // Box 112
		bodyModel[158].setRotationPoint(-51F, -23F, -0.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 9, 11, 0F, 0F, -3F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -5F, 0F); // Box 113
		bodyModel[159].setRotationPoint(-57F, -21.5F, -0.5F);

		bodyModel[160].addShapeBox(0F, -1F, 0F, 2, 1, 20, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[160].setRotationPoint(-62F, -18F, -16F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 115
		bodyModel[161].setRotationPoint(-62F, -18F, -16F);

		bodyModel[162].addShapeBox(0F, -0.5F, 0F, 2, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[162].setRotationPoint(-62F, -18F, -16F);

		bodyModel[163].addShapeBox(0F, -1F, 0F, 2, 1, 20, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		bodyModel[163].setRotationPoint(-64F, -16.5F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 118
		bodyModel[164].setRotationPoint(-64F, -16.5F, -11F);

		bodyModel[165].addShapeBox(0F, -0.5F, 0F, 2, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[165].setRotationPoint(-64F, -16.5F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[166].setRotationPoint(-54F, -20F, -11.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[167].setRotationPoint(1F, -18F, 13.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[168].setRotationPoint(-14F, -18F, 13.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[169].setRotationPoint(-29F, -18F, 13.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[170].setRotationPoint(1F, -6F, 13.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[171].setRotationPoint(-14F, -6F, 13.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[172].setRotationPoint(-29F, -6F, 13.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[173].setRotationPoint(1F, -18F, -25.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[174].setRotationPoint(-14F, -18F, -25.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[175].setRotationPoint(-29F, -18F, -25.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[176].setRotationPoint(1F, -6F, -25.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[177].setRotationPoint(-14F, -6F, -25.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[178].setRotationPoint(-29F, -6F, -25.5F);

		bodyModel[179].addShapeBox(-4F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 164
		bodyModel[179].setRotationPoint(0F, -6F, -26F);
		bodyModel[179].rotateAngleX = 1.57079633F;
		bodyModel[179].rotateAngleZ = -1.57079633F;

		bodyModel[180].addShapeBox(-5F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[180].setRotationPoint(0F, -6F, -26F);
		bodyModel[180].rotateAngleX = 1.57079633F;
		bodyModel[180].rotateAngleZ = -1.57079633F;

		bodyModel[181].addShapeBox(-5.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[181].setRotationPoint(0F, -6F, -26F);
		bodyModel[181].rotateAngleX = 1.57079633F;
		bodyModel[181].rotateAngleZ = -1.57079633F;

		bodyModel[182].addShapeBox(-5.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[182].setRotationPoint(0F, -6F, -26F);
		bodyModel[182].rotateAngleX = 1.57079633F;
		bodyModel[182].rotateAngleZ = -1.57079633F;

		bodyModel[183].addShapeBox(-6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 29
		bodyModel[183].setRotationPoint(0F, -6F, -26F);
		bodyModel[183].rotateAngleX = 1.57079633F;
		bodyModel[183].rotateAngleZ = -1.57079633F;

		bodyModel[184].addShapeBox(-9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 30
		bodyModel[184].setRotationPoint(0F, -6F, -26F);
		bodyModel[184].rotateAngleX = 1.57079633F;
		bodyModel[184].rotateAngleZ = -1.57079633F;

		bodyModel[185].addShapeBox(-8F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[185].setRotationPoint(0F, -6F, -26F);
		bodyModel[185].rotateAngleX = 1.57079633F;
		bodyModel[185].rotateAngleZ = -1.57079633F;

		bodyModel[186].addShapeBox(-7F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 32
		bodyModel[186].setRotationPoint(0F, -6F, -26F);
		bodyModel[186].rotateAngleX = 1.57079633F;
		bodyModel[186].rotateAngleZ = -1.57079633F;

		bodyModel[187].addShapeBox(-8.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[187].setRotationPoint(0F, -6F, -26F);
		bodyModel[187].rotateAngleX = 1.57079633F;
		bodyModel[187].rotateAngleZ = -1.57079633F;

		bodyModel[188].addShapeBox(-8.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[188].setRotationPoint(0F, -6F, -26F);
		bodyModel[188].rotateAngleX = 1.57079633F;
		bodyModel[188].rotateAngleZ = -1.57079633F;

		bodyModel[189].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 35
		bodyModel[189].setRotationPoint(0F, -6F, -26F);
		bodyModel[189].rotateAngleX = 1.57079633F;
		bodyModel[189].rotateAngleZ = -1.57079633F;

		bodyModel[190].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[190].setRotationPoint(0F, -6F, -26F);
		bodyModel[190].rotateAngleX = 1.57079633F;
		bodyModel[190].rotateAngleZ = -1.57079633F;

		bodyModel[191].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 37
		bodyModel[191].setRotationPoint(0F, -6F, -26F);
		bodyModel[191].rotateAngleX = 1.57079633F;
		bodyModel[191].rotateAngleZ = -1.57079633F;

		bodyModel[192].addShapeBox(-11.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[192].setRotationPoint(0F, -6F, -26F);
		bodyModel[192].rotateAngleX = 1.57079633F;
		bodyModel[192].rotateAngleZ = -1.57079633F;

		bodyModel[193].addShapeBox(-11.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[193].setRotationPoint(0F, -6F, -26F);
		bodyModel[193].rotateAngleX = 1.57079633F;
		bodyModel[193].rotateAngleZ = -1.57079633F;

		bodyModel[194].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 40
		bodyModel[194].setRotationPoint(0F, -6F, -26F);
		bodyModel[194].rotateAngleX = 1.57079633F;
		bodyModel[194].rotateAngleZ = -1.57079633F;

		bodyModel[195].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[195].setRotationPoint(0F, -6F, -26F);
		bodyModel[195].rotateAngleX = 1.57079633F;
		bodyModel[195].rotateAngleZ = -1.57079633F;

		bodyModel[196].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 42
		bodyModel[196].setRotationPoint(0F, -6F, -26F);
		bodyModel[196].rotateAngleX = 1.57079633F;
		bodyModel[196].rotateAngleZ = -1.57079633F;

		bodyModel[197].addShapeBox(-2.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[197].setRotationPoint(0F, -6F, -26F);
		bodyModel[197].rotateAngleX = 1.57079633F;
		bodyModel[197].rotateAngleZ = -1.57079633F;

		bodyModel[198].addShapeBox(-2.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[198].setRotationPoint(0F, -6F, -26F);
		bodyModel[198].rotateAngleX = 1.57079633F;
		bodyModel[198].rotateAngleZ = -1.57079633F;

		bodyModel[199].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 54
		bodyModel[199].setRotationPoint(0F, 6F, -26F);
		bodyModel[199].rotateAngleX = 1.57079633F;
		bodyModel[199].rotateAngleZ = -1.57079633F;

		bodyModel[200].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[200].setRotationPoint(0F, 6F, -26F);
		bodyModel[200].rotateAngleX = 1.57079633F;
		bodyModel[200].rotateAngleZ = -1.57079633F;

		bodyModel[201].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 56
		bodyModel[201].setRotationPoint(0F, 6F, -26F);
		bodyModel[201].rotateAngleX = 1.57079633F;
		bodyModel[201].rotateAngleZ = -1.57079633F;

		bodyModel[202].addShapeBox(-11.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[202].setRotationPoint(0F, 6F, -26F);
		bodyModel[202].rotateAngleX = 1.57079633F;
		bodyModel[202].rotateAngleZ = -1.57079633F;

		bodyModel[203].addShapeBox(-11.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[203].setRotationPoint(0F, 6F, -26F);
		bodyModel[203].rotateAngleX = 1.57079633F;
		bodyModel[203].rotateAngleZ = -1.57079633F;

		bodyModel[204].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 65
		bodyModel[204].setRotationPoint(9F, 8F, -26F);
		bodyModel[204].rotateAngleX = 1.57079633F;
		bodyModel[204].rotateAngleZ = -1.57079633F;

		bodyModel[205].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[205].setRotationPoint(9F, 8F, -26F);
		bodyModel[205].rotateAngleX = 1.57079633F;
		bodyModel[205].rotateAngleZ = -1.57079633F;

		bodyModel[206].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 67
		bodyModel[206].setRotationPoint(9F, 8F, -26F);
		bodyModel[206].rotateAngleX = 1.57079633F;
		bodyModel[206].rotateAngleZ = -1.57079633F;

		bodyModel[207].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 68
		bodyModel[207].setRotationPoint(9F, -4F, -26F);
		bodyModel[207].rotateAngleX = 1.57079633F;
		bodyModel[207].rotateAngleZ = -1.57079633F;

		bodyModel[208].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[208].setRotationPoint(9F, -4F, -26F);
		bodyModel[208].rotateAngleX = 1.57079633F;
		bodyModel[208].rotateAngleZ = -1.57079633F;

		bodyModel[209].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 70
		bodyModel[209].setRotationPoint(9F, -4F, -26F);
		bodyModel[209].rotateAngleX = 1.57079633F;
		bodyModel[209].rotateAngleZ = -1.57079633F;

		bodyModel[210].addShapeBox(-4F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 71
		bodyModel[210].setRotationPoint(9F, -4F, -26F);
		bodyModel[210].rotateAngleX = 1.57079633F;
		bodyModel[210].rotateAngleZ = -1.57079633F;

		bodyModel[211].addShapeBox(-5F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[211].setRotationPoint(9F, -4F, -26F);
		bodyModel[211].rotateAngleX = 1.57079633F;
		bodyModel[211].rotateAngleZ = -1.57079633F;

		bodyModel[212].addShapeBox(-6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 73
		bodyModel[212].setRotationPoint(9F, -4F, -26F);
		bodyModel[212].rotateAngleX = 1.57079633F;
		bodyModel[212].rotateAngleZ = -1.57079633F;

		bodyModel[213].addShapeBox(-7F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 74
		bodyModel[213].setRotationPoint(9F, -4F, -26F);
		bodyModel[213].rotateAngleX = 1.57079633F;
		bodyModel[213].rotateAngleZ = -1.57079633F;

		bodyModel[214].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 75
		bodyModel[214].setRotationPoint(9F, -4F, -26F);
		bodyModel[214].rotateAngleX = 1.57079633F;
		bodyModel[214].rotateAngleZ = -1.57079633F;

		bodyModel[215].addShapeBox(-11.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[215].setRotationPoint(9F, -4F, -26F);
		bodyModel[215].rotateAngleX = 1.57079633F;
		bodyModel[215].rotateAngleZ = -1.57079633F;

		bodyModel[216].addShapeBox(-8.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[216].setRotationPoint(9F, -4F, -26F);
		bodyModel[216].rotateAngleX = 1.57079633F;
		bodyModel[216].rotateAngleZ = -1.57079633F;

		bodyModel[217].addShapeBox(-5.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[217].setRotationPoint(9F, -4F, -26F);
		bodyModel[217].rotateAngleX = 1.57079633F;
		bodyModel[217].rotateAngleZ = -1.57079633F;

		bodyModel[218].addShapeBox(-2.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[218].setRotationPoint(9F, -4F, -26F);
		bodyModel[218].rotateAngleX = 1.57079633F;
		bodyModel[218].rotateAngleZ = -1.57079633F;

		bodyModel[219].addShapeBox(-11.5F, -2.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[219].setRotationPoint(9F, 8F, -26F);
		bodyModel[219].rotateAngleX = 1.57079633F;
		bodyModel[219].rotateAngleZ = -1.57079633F;

		bodyModel[220].addShapeBox(-11.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[220].setRotationPoint(9F, 8F, -26F);
		bodyModel[220].rotateAngleX = 1.57079633F;
		bodyModel[220].rotateAngleZ = -1.57079633F;

		bodyModel[221].addShapeBox(-2.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[221].setRotationPoint(9F, -4F, -26F);
		bodyModel[221].rotateAngleX = 1.57079633F;
		bodyModel[221].rotateAngleZ = -1.57079633F;

		bodyModel[222].addShapeBox(-5.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[222].setRotationPoint(9F, -4F, -26F);
		bodyModel[222].rotateAngleX = 1.57079633F;
		bodyModel[222].rotateAngleZ = -1.57079633F;

		bodyModel[223].addShapeBox(-8.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[223].setRotationPoint(9F, -4F, -26F);
		bodyModel[223].rotateAngleX = 1.57079633F;
		bodyModel[223].rotateAngleZ = -1.57079633F;

		bodyModel[224].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[224].setRotationPoint(9F, -4F, -26F);
		bodyModel[224].rotateAngleX = 1.57079633F;
		bodyModel[224].rotateAngleZ = -1.57079633F;

		bodyModel[225].addShapeBox(-11.5F, -2.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[225].setRotationPoint(9F, -4F, -26F);
		bodyModel[225].rotateAngleX = 1.57079633F;
		bodyModel[225].rotateAngleZ = -1.57079633F;

		bodyModel[226].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 87
		bodyModel[226].setRotationPoint(9F, -4F, -26F);
		bodyModel[226].rotateAngleX = 1.57079633F;
		bodyModel[226].rotateAngleZ = -1.57079633F;

		bodyModel[227].addShapeBox(-9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 88
		bodyModel[227].setRotationPoint(9F, -4F, -26F);
		bodyModel[227].rotateAngleX = 1.57079633F;
		bodyModel[227].rotateAngleZ = -1.57079633F;

		bodyModel[228].addShapeBox(-8F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[228].setRotationPoint(9F, -4F, -26F);
		bodyModel[228].rotateAngleX = 1.57079633F;
		bodyModel[228].rotateAngleZ = -1.57079633F;

		bodyModel[229].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 90
		bodyModel[229].setRotationPoint(4F, 9F, 24F);
		bodyModel[229].rotateAngleX = 1.57079633F;
		bodyModel[229].rotateAngleZ = -1.57079633F;

		bodyModel[230].addShapeBox(-13F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[230].setRotationPoint(4F, 9F, 24F);
		bodyModel[230].rotateAngleX = 1.57079633F;
		bodyModel[230].rotateAngleZ = -1.57079633F;

		bodyModel[231].addShapeBox(-14F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 92
		bodyModel[231].setRotationPoint(4F, 9F, 24F);
		bodyModel[231].rotateAngleX = 1.57079633F;
		bodyModel[231].rotateAngleZ = -1.57079633F;

		bodyModel[232].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 93
		bodyModel[232].setRotationPoint(4F, -3F, 24F);
		bodyModel[232].rotateAngleX = 1.57079633F;
		bodyModel[232].rotateAngleZ = -1.57079633F;

		bodyModel[233].addShapeBox(-4F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[233].setRotationPoint(4F, -3F, 24F);
		bodyModel[233].rotateAngleX = 1.57079633F;
		bodyModel[233].rotateAngleZ = -1.57079633F;

		bodyModel[234].addShapeBox(-5F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 95
		bodyModel[234].setRotationPoint(4F, -3F, 24F);
		bodyModel[234].rotateAngleX = 1.57079633F;
		bodyModel[234].rotateAngleZ = -1.57079633F;

		bodyModel[235].addShapeBox(-6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 96
		bodyModel[235].setRotationPoint(4F, -3F, 24F);
		bodyModel[235].rotateAngleX = 1.57079633F;
		bodyModel[235].rotateAngleZ = -1.57079633F;

		bodyModel[236].addShapeBox(-7F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[236].setRotationPoint(4F, -3F, 24F);
		bodyModel[236].rotateAngleX = 1.57079633F;
		bodyModel[236].rotateAngleZ = -1.57079633F;

		bodyModel[237].addShapeBox(-8F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 98
		bodyModel[237].setRotationPoint(4F, -3F, 24F);
		bodyModel[237].rotateAngleX = 1.57079633F;
		bodyModel[237].rotateAngleZ = -1.57079633F;

		bodyModel[238].addShapeBox(-9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 99
		bodyModel[238].setRotationPoint(4F, -3F, 24F);
		bodyModel[238].rotateAngleX = 1.57079633F;
		bodyModel[238].rotateAngleZ = -1.57079633F;

		bodyModel[239].addShapeBox(-14F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 100
		bodyModel[239].setRotationPoint(4F, -3F, 24F);
		bodyModel[239].rotateAngleX = 1.57079633F;
		bodyModel[239].rotateAngleZ = -1.57079633F;

		bodyModel[240].addShapeBox(-13.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 101
		bodyModel[240].setRotationPoint(4F, -3F, 26F);
		bodyModel[240].rotateAngleX = 1.57079633F;
		bodyModel[240].rotateAngleZ = -1.57079633F;

		bodyModel[241].addShapeBox(-10.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 102
		bodyModel[241].setRotationPoint(4F, -3F, 26F);
		bodyModel[241].rotateAngleX = 1.57079633F;
		bodyModel[241].rotateAngleZ = -1.57079633F;

		bodyModel[242].addShapeBox(-7.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 103
		bodyModel[242].setRotationPoint(4F, -3F, 26F);
		bodyModel[242].rotateAngleX = 1.57079633F;
		bodyModel[242].rotateAngleZ = -1.57079633F;

		bodyModel[243].addShapeBox(-4.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 104
		bodyModel[243].setRotationPoint(4F, -3F, 26F);
		bodyModel[243].rotateAngleX = 1.57079633F;
		bodyModel[243].rotateAngleZ = -1.57079633F;

		bodyModel[244].addShapeBox(-13.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 105
		bodyModel[244].setRotationPoint(4F, 9F, 26F);
		bodyModel[244].rotateAngleX = 1.57079633F;
		bodyModel[244].rotateAngleZ = -1.57079633F;

		bodyModel[245].addShapeBox(-13.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 106
		bodyModel[245].setRotationPoint(4F, 9F, 26F);
		bodyModel[245].rotateAngleX = 1.57079633F;
		bodyModel[245].rotateAngleZ = -1.57079633F;

		bodyModel[246].addShapeBox(-4.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 107
		bodyModel[246].setRotationPoint(4F, -3F, 26F);
		bodyModel[246].rotateAngleX = 1.57079633F;
		bodyModel[246].rotateAngleZ = -1.57079633F;

		bodyModel[247].addShapeBox(-7.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 108
		bodyModel[247].setRotationPoint(4F, -3F, 26F);
		bodyModel[247].rotateAngleX = 1.57079633F;
		bodyModel[247].rotateAngleZ = -1.57079633F;

		bodyModel[248].addShapeBox(-10.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 109
		bodyModel[248].setRotationPoint(4F, -3F, 26F);
		bodyModel[248].rotateAngleX = 1.57079633F;
		bodyModel[248].rotateAngleZ = -1.57079633F;

		bodyModel[249].addShapeBox(-13F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[249].setRotationPoint(4F, -3F, 24F);
		bodyModel[249].rotateAngleX = 1.57079633F;
		bodyModel[249].rotateAngleZ = -1.57079633F;

		bodyModel[250].addShapeBox(-13.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 111
		bodyModel[250].setRotationPoint(4F, -3F, 26F);
		bodyModel[250].rotateAngleX = 1.57079633F;
		bodyModel[250].rotateAngleZ = -1.57079633F;

		bodyModel[251].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 112
		bodyModel[251].setRotationPoint(4F, -3F, 24F);
		bodyModel[251].rotateAngleX = 1.57079633F;
		bodyModel[251].rotateAngleZ = -1.57079633F;

		bodyModel[252].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 113
		bodyModel[252].setRotationPoint(4F, -3F, 24F);
		bodyModel[252].rotateAngleX = 1.57079633F;
		bodyModel[252].rotateAngleZ = -1.57079633F;

		bodyModel[253].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[253].setRotationPoint(4F, -3F, 24F);
		bodyModel[253].rotateAngleX = 1.57079633F;
		bodyModel[253].rotateAngleZ = -1.57079633F;

		bodyModel[254].addShapeBox(-11.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 115
		bodyModel[254].setRotationPoint(-5F, -6F, 26F);
		bodyModel[254].rotateAngleX = 1.57079633F;
		bodyModel[254].rotateAngleZ = -1.57079633F;

		bodyModel[255].addShapeBox(-11.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 116
		bodyModel[255].setRotationPoint(-5F, -6F, 26F);
		bodyModel[255].rotateAngleX = 1.57079633F;
		bodyModel[255].rotateAngleZ = -1.57079633F;

		bodyModel[256].addShapeBox(-8.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 117
		bodyModel[256].setRotationPoint(-5F, -6F, 26F);
		bodyModel[256].rotateAngleX = 1.57079633F;
		bodyModel[256].rotateAngleZ = -1.57079633F;

		bodyModel[257].addShapeBox(-8.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 118
		bodyModel[257].setRotationPoint(-5F, -6F, 26F);
		bodyModel[257].rotateAngleX = 1.57079633F;
		bodyModel[257].rotateAngleZ = -1.57079633F;

		bodyModel[258].addShapeBox(-5.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 119
		bodyModel[258].setRotationPoint(-5F, -6F, 26F);
		bodyModel[258].rotateAngleX = 1.57079633F;
		bodyModel[258].rotateAngleZ = -1.57079633F;

		bodyModel[259].addShapeBox(-5.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 120
		bodyModel[259].setRotationPoint(-5F, -6F, 26F);
		bodyModel[259].rotateAngleX = 1.57079633F;
		bodyModel[259].rotateAngleZ = -1.57079633F;

		bodyModel[260].addShapeBox(-2.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 121
		bodyModel[260].setRotationPoint(-5F, -6F, 26F);
		bodyModel[260].rotateAngleX = 1.57079633F;
		bodyModel[260].rotateAngleZ = -1.57079633F;

		bodyModel[261].addShapeBox(-2.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 122
		bodyModel[261].setRotationPoint(-5F, -6F, 26F);
		bodyModel[261].rotateAngleX = 1.57079633F;
		bodyModel[261].rotateAngleZ = -1.57079633F;

		bodyModel[262].addShapeBox(-11.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 123
		bodyModel[262].setRotationPoint(-5F, 6F, 26F);
		bodyModel[262].rotateAngleX = 1.57079633F;
		bodyModel[262].rotateAngleZ = -1.57079633F;

		bodyModel[263].addShapeBox(-11.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 124
		bodyModel[263].setRotationPoint(-5F, 6F, 26F);
		bodyModel[263].rotateAngleX = 1.57079633F;
		bodyModel[263].rotateAngleZ = -1.57079633F;

		bodyModel[264].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 125
		bodyModel[264].setRotationPoint(-5F, -6F, 24F);
		bodyModel[264].rotateAngleX = 1.57079633F;
		bodyModel[264].rotateAngleZ = -1.57079633F;

		bodyModel[265].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[265].setRotationPoint(-5F, -6F, 24F);
		bodyModel[265].rotateAngleX = 1.57079633F;
		bodyModel[265].rotateAngleZ = -1.57079633F;

		bodyModel[266].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 127
		bodyModel[266].setRotationPoint(-5F, -6F, 24F);
		bodyModel[266].rotateAngleX = 1.57079633F;
		bodyModel[266].rotateAngleZ = -1.57079633F;

		bodyModel[267].addShapeBox(-9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 128
		bodyModel[267].setRotationPoint(-5F, -6F, 24F);
		bodyModel[267].rotateAngleX = 1.57079633F;
		bodyModel[267].rotateAngleZ = -1.57079633F;

		bodyModel[268].addShapeBox(-8F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[268].setRotationPoint(-5F, -6F, 24F);
		bodyModel[268].rotateAngleX = 1.57079633F;
		bodyModel[268].rotateAngleZ = -1.57079633F;

		bodyModel[269].addShapeBox(-7F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 130
		bodyModel[269].setRotationPoint(-5F, -6F, 24F);
		bodyModel[269].rotateAngleX = 1.57079633F;
		bodyModel[269].rotateAngleZ = -1.57079633F;

		bodyModel[270].addShapeBox(-6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 131
		bodyModel[270].setRotationPoint(-5F, -6F, 24F);
		bodyModel[270].rotateAngleX = 1.57079633F;
		bodyModel[270].rotateAngleZ = -1.57079633F;

		bodyModel[271].addShapeBox(-5F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[271].setRotationPoint(-5F, -6F, 24F);
		bodyModel[271].rotateAngleX = 1.57079633F;
		bodyModel[271].rotateAngleZ = -1.57079633F;

		bodyModel[272].addShapeBox(-4F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 133
		bodyModel[272].setRotationPoint(-5F, -6F, 24F);
		bodyModel[272].rotateAngleX = 1.57079633F;
		bodyModel[272].rotateAngleZ = -1.57079633F;

		bodyModel[273].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 134
		bodyModel[273].setRotationPoint(-5F, -6F, 24F);
		bodyModel[273].rotateAngleX = 1.57079633F;
		bodyModel[273].rotateAngleZ = -1.57079633F;

		bodyModel[274].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[274].setRotationPoint(-5F, -6F, 24F);
		bodyModel[274].rotateAngleX = 1.57079633F;
		bodyModel[274].rotateAngleZ = -1.57079633F;

		bodyModel[275].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 136
		bodyModel[275].setRotationPoint(-5F, -6F, 24F);
		bodyModel[275].rotateAngleX = 1.57079633F;
		bodyModel[275].rotateAngleZ = -1.57079633F;

		bodyModel[276].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 137
		bodyModel[276].setRotationPoint(-5F, 6F, 24F);
		bodyModel[276].rotateAngleX = 1.57079633F;
		bodyModel[276].rotateAngleZ = -1.57079633F;

		bodyModel[277].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[277].setRotationPoint(-5F, 6F, 24F);
		bodyModel[277].rotateAngleX = 1.57079633F;
		bodyModel[277].rotateAngleZ = -1.57079633F;

		bodyModel[278].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 139
		bodyModel[278].setRotationPoint(-5F, 6F, 24F);
		bodyModel[278].rotateAngleX = 1.57079633F;
		bodyModel[278].rotateAngleZ = -1.57079633F;

		bodyModel[279].addShapeBox(-11.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 140
		bodyModel[279].setRotationPoint(-14F, -6F, 26F);
		bodyModel[279].rotateAngleX = 1.57079633F;
		bodyModel[279].rotateAngleZ = -1.57079633F;

		bodyModel[280].addShapeBox(-11.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 141
		bodyModel[280].setRotationPoint(-14F, -6F, 26F);
		bodyModel[280].rotateAngleX = 1.57079633F;
		bodyModel[280].rotateAngleZ = -1.57079633F;

		bodyModel[281].addShapeBox(-8.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 142
		bodyModel[281].setRotationPoint(-14F, -6F, 26F);
		bodyModel[281].rotateAngleX = 1.57079633F;
		bodyModel[281].rotateAngleZ = -1.57079633F;

		bodyModel[282].addShapeBox(-8.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 143
		bodyModel[282].setRotationPoint(-14F, -6F, 26F);
		bodyModel[282].rotateAngleX = 1.57079633F;
		bodyModel[282].rotateAngleZ = -1.57079633F;

		bodyModel[283].addShapeBox(-5.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 144
		bodyModel[283].setRotationPoint(-14F, -6F, 26F);
		bodyModel[283].rotateAngleX = 1.57079633F;
		bodyModel[283].rotateAngleZ = -1.57079633F;

		bodyModel[284].addShapeBox(-5.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 145
		bodyModel[284].setRotationPoint(-14F, -6F, 26F);
		bodyModel[284].rotateAngleX = 1.57079633F;
		bodyModel[284].rotateAngleZ = -1.57079633F;

		bodyModel[285].addShapeBox(-2.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 146
		bodyModel[285].setRotationPoint(-14F, -6F, 26F);
		bodyModel[285].rotateAngleX = 1.57079633F;
		bodyModel[285].rotateAngleZ = -1.57079633F;

		bodyModel[286].addShapeBox(-2.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 147
		bodyModel[286].setRotationPoint(-14F, -6F, 26F);
		bodyModel[286].rotateAngleX = 1.57079633F;
		bodyModel[286].rotateAngleZ = -1.57079633F;

		bodyModel[287].addShapeBox(-11.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 148
		bodyModel[287].setRotationPoint(-14F, 6F, 26F);
		bodyModel[287].rotateAngleX = 1.57079633F;
		bodyModel[287].rotateAngleZ = -1.57079633F;

		bodyModel[288].addShapeBox(-11.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 149
		bodyModel[288].setRotationPoint(-14F, 6F, 26F);
		bodyModel[288].rotateAngleX = 1.57079633F;
		bodyModel[288].rotateAngleZ = -1.57079633F;

		bodyModel[289].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 150
		bodyModel[289].setRotationPoint(-14F, -6F, 24F);
		bodyModel[289].rotateAngleX = 1.57079633F;
		bodyModel[289].rotateAngleZ = -1.57079633F;

		bodyModel[290].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[290].setRotationPoint(-14F, -6F, 24F);
		bodyModel[290].rotateAngleX = 1.57079633F;
		bodyModel[290].rotateAngleZ = -1.57079633F;

		bodyModel[291].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 152
		bodyModel[291].setRotationPoint(-14F, -6F, 24F);
		bodyModel[291].rotateAngleX = 1.57079633F;
		bodyModel[291].rotateAngleZ = -1.57079633F;

		bodyModel[292].addShapeBox(-9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 153
		bodyModel[292].setRotationPoint(-14F, -6F, 24F);
		bodyModel[292].rotateAngleX = 1.57079633F;
		bodyModel[292].rotateAngleZ = -1.57079633F;

		bodyModel[293].addShapeBox(-8F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[293].setRotationPoint(-14F, -6F, 24F);
		bodyModel[293].rotateAngleX = 1.57079633F;
		bodyModel[293].rotateAngleZ = -1.57079633F;

		bodyModel[294].addShapeBox(-7F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 155
		bodyModel[294].setRotationPoint(-14F, -6F, 24F);
		bodyModel[294].rotateAngleX = 1.57079633F;
		bodyModel[294].rotateAngleZ = -1.57079633F;

		bodyModel[295].addShapeBox(-6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 156
		bodyModel[295].setRotationPoint(-14F, -6F, 24F);
		bodyModel[295].rotateAngleX = 1.57079633F;
		bodyModel[295].rotateAngleZ = -1.57079633F;

		bodyModel[296].addShapeBox(-5F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[296].setRotationPoint(-14F, -6F, 24F);
		bodyModel[296].rotateAngleX = 1.57079633F;
		bodyModel[296].rotateAngleZ = -1.57079633F;

		bodyModel[297].addShapeBox(-4F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 158
		bodyModel[297].setRotationPoint(-14F, -6F, 24F);
		bodyModel[297].rotateAngleX = 1.57079633F;
		bodyModel[297].rotateAngleZ = -1.57079633F;

		bodyModel[298].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 159
		bodyModel[298].setRotationPoint(-14F, -6F, 24F);
		bodyModel[298].rotateAngleX = 1.57079633F;
		bodyModel[298].rotateAngleZ = -1.57079633F;

		bodyModel[299].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[299].setRotationPoint(-14F, -6F, 24F);
		bodyModel[299].rotateAngleX = 1.57079633F;
		bodyModel[299].rotateAngleZ = -1.57079633F;

		bodyModel[300].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 161
		bodyModel[300].setRotationPoint(-14F, -6F, 24F);
		bodyModel[300].rotateAngleX = 1.57079633F;
		bodyModel[300].rotateAngleZ = -1.57079633F;

		bodyModel[301].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 162
		bodyModel[301].setRotationPoint(-14F, 6F, 24F);
		bodyModel[301].rotateAngleX = 1.57079633F;
		bodyModel[301].rotateAngleZ = -1.57079633F;

		bodyModel[302].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[302].setRotationPoint(-14F, 6F, 24F);
		bodyModel[302].rotateAngleX = 1.57079633F;
		bodyModel[302].rotateAngleZ = -1.57079633F;

		bodyModel[303].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 164
		bodyModel[303].setRotationPoint(-14F, 6F, 24F);
		bodyModel[303].rotateAngleX = 1.57079633F;
		bodyModel[303].rotateAngleZ = -1.57079633F;

		bodyModel[304].addShapeBox(-12F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 165
		bodyModel[304].setRotationPoint(0F, -6F, -26F);
		bodyModel[304].rotateAngleX = 1.57079633F;
		bodyModel[304].rotateAngleZ = -1.57079633F;

		bodyModel[305].addShapeBox(-11F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[305].setRotationPoint(0F, -6F, -26F);
		bodyModel[305].rotateAngleX = 1.57079633F;
		bodyModel[305].rotateAngleZ = -1.57079633F;

		bodyModel[306].addShapeBox(-10F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 167
		bodyModel[306].setRotationPoint(0F, -6F, -26F);
		bodyModel[306].rotateAngleX = 1.57079633F;
		bodyModel[306].rotateAngleZ = -1.57079633F;

		bodyModel[307].addShapeBox(-9F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 168
		bodyModel[307].setRotationPoint(0F, -6F, -26F);
		bodyModel[307].rotateAngleX = 1.57079633F;
		bodyModel[307].rotateAngleZ = -1.57079633F;

		bodyModel[308].addShapeBox(-8F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[308].setRotationPoint(0F, -6F, -26F);
		bodyModel[308].rotateAngleX = 1.57079633F;
		bodyModel[308].rotateAngleZ = -1.57079633F;

		bodyModel[309].addShapeBox(-7F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 170
		bodyModel[309].setRotationPoint(0F, -6F, -26F);
		bodyModel[309].rotateAngleX = 1.57079633F;
		bodyModel[309].rotateAngleZ = -1.57079633F;

		bodyModel[310].addShapeBox(-6F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 171
		bodyModel[310].setRotationPoint(0F, -6F, -26F);
		bodyModel[310].rotateAngleX = 1.57079633F;
		bodyModel[310].rotateAngleZ = -1.57079633F;

		bodyModel[311].addShapeBox(-5F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[311].setRotationPoint(0F, -6F, -26F);
		bodyModel[311].rotateAngleX = 1.57079633F;
		bodyModel[311].rotateAngleZ = -1.57079633F;

		bodyModel[312].addShapeBox(-4F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 173
		bodyModel[312].setRotationPoint(0F, -6F, -26F);
		bodyModel[312].rotateAngleX = 1.57079633F;
		bodyModel[312].rotateAngleZ = -1.57079633F;

		bodyModel[313].addShapeBox(-3F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 174
		bodyModel[313].setRotationPoint(0F, -6F, -26F);
		bodyModel[313].rotateAngleX = 1.57079633F;
		bodyModel[313].rotateAngleZ = -1.57079633F;

		bodyModel[314].addShapeBox(-2F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[314].setRotationPoint(0F, -6F, -26F);
		bodyModel[314].rotateAngleX = 1.57079633F;
		bodyModel[314].rotateAngleZ = -1.57079633F;

		bodyModel[315].addShapeBox(-1F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 176
		bodyModel[315].setRotationPoint(0F, -6F, -26F);
		bodyModel[315].rotateAngleX = 1.57079633F;
		bodyModel[315].rotateAngleZ = -1.57079633F;

		bodyModel[316].addShapeBox(-12F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 177
		bodyModel[316].setRotationPoint(0F, 6F, -26F);
		bodyModel[316].rotateAngleX = 1.57079633F;
		bodyModel[316].rotateAngleZ = -1.57079633F;

		bodyModel[317].addShapeBox(-11F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[317].setRotationPoint(0F, 6F, -26F);
		bodyModel[317].rotateAngleX = 1.57079633F;
		bodyModel[317].rotateAngleZ = -1.57079633F;

		bodyModel[318].addShapeBox(-10F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 179
		bodyModel[318].setRotationPoint(0F, 6F, -26F);
		bodyModel[318].rotateAngleX = 1.57079633F;
		bodyModel[318].rotateAngleZ = -1.57079633F;

		bodyModel[319].addShapeBox(-11.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[319].setRotationPoint(0F, 6F, -26F);
		bodyModel[319].rotateAngleX = 1.57079633F;
		bodyModel[319].rotateAngleZ = -1.57079633F;

		bodyModel[320].addShapeBox(-2.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[320].setRotationPoint(0F, -6F, -26F);
		bodyModel[320].rotateAngleX = 1.57079633F;
		bodyModel[320].rotateAngleZ = -1.57079633F;

		bodyModel[321].addShapeBox(-5.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[321].setRotationPoint(0F, -6F, -26F);
		bodyModel[321].rotateAngleX = 1.57079633F;
		bodyModel[321].rotateAngleZ = -1.57079633F;

		bodyModel[322].addShapeBox(-8.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[322].setRotationPoint(0F, -6F, -26F);
		bodyModel[322].rotateAngleX = 1.57079633F;
		bodyModel[322].rotateAngleZ = -1.57079633F;

		bodyModel[323].addShapeBox(-11.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[323].setRotationPoint(0F, -6F, -26F);
		bodyModel[323].rotateAngleX = 1.57079633F;
		bodyModel[323].rotateAngleZ = -1.57079633F;

		bodyModel[324].addShapeBox(-11.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[324].setRotationPoint(0F, -6F, -26F);
		bodyModel[324].rotateAngleX = 1.57079633F;
		bodyModel[324].rotateAngleZ = -1.57079633F;

		bodyModel[325].addShapeBox(-8.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[325].setRotationPoint(0F, -6F, -26F);
		bodyModel[325].rotateAngleX = 1.57079633F;
		bodyModel[325].rotateAngleZ = -1.57079633F;

		bodyModel[326].addShapeBox(-5.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[326].setRotationPoint(0F, -6F, -26F);
		bodyModel[326].rotateAngleX = 1.57079633F;
		bodyModel[326].rotateAngleZ = -1.57079633F;

		bodyModel[327].addShapeBox(-2.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[327].setRotationPoint(0F, -6F, -26F);
		bodyModel[327].rotateAngleX = 1.57079633F;
		bodyModel[327].rotateAngleZ = -1.57079633F;

		bodyModel[328].addShapeBox(-11.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[328].setRotationPoint(0F, 6F, -26F);
		bodyModel[328].rotateAngleX = 1.57079633F;
		bodyModel[328].rotateAngleZ = -1.57079633F;

		bodyModel[329].addShapeBox(-12F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
		bodyModel[329].setRotationPoint(-9F, -6F, -26F);
		bodyModel[329].rotateAngleX = 1.57079633F;
		bodyModel[329].rotateAngleZ = -1.57079633F;

		bodyModel[330].addShapeBox(-11F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[330].setRotationPoint(-9F, -6F, -26F);
		bodyModel[330].rotateAngleX = 1.57079633F;
		bodyModel[330].rotateAngleZ = -1.57079633F;

		bodyModel[331].addShapeBox(-10F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 192
		bodyModel[331].setRotationPoint(-9F, -6F, -26F);
		bodyModel[331].rotateAngleX = 1.57079633F;
		bodyModel[331].rotateAngleZ = -1.57079633F;

		bodyModel[332].addShapeBox(-9F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 193
		bodyModel[332].setRotationPoint(-9F, -6F, -26F);
		bodyModel[332].rotateAngleX = 1.57079633F;
		bodyModel[332].rotateAngleZ = -1.57079633F;

		bodyModel[333].addShapeBox(-8F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[333].setRotationPoint(-9F, -6F, -26F);
		bodyModel[333].rotateAngleX = 1.57079633F;
		bodyModel[333].rotateAngleZ = -1.57079633F;

		bodyModel[334].addShapeBox(-7F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 195
		bodyModel[334].setRotationPoint(-9F, -6F, -26F);
		bodyModel[334].rotateAngleX = 1.57079633F;
		bodyModel[334].rotateAngleZ = -1.57079633F;

		bodyModel[335].addShapeBox(-6F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 196
		bodyModel[335].setRotationPoint(-9F, -6F, -26F);
		bodyModel[335].rotateAngleX = 1.57079633F;
		bodyModel[335].rotateAngleZ = -1.57079633F;

		bodyModel[336].addShapeBox(-5F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[336].setRotationPoint(-9F, -6F, -26F);
		bodyModel[336].rotateAngleX = 1.57079633F;
		bodyModel[336].rotateAngleZ = -1.57079633F;

		bodyModel[337].addShapeBox(-4F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 198
		bodyModel[337].setRotationPoint(-9F, -6F, -26F);
		bodyModel[337].rotateAngleX = 1.57079633F;
		bodyModel[337].rotateAngleZ = -1.57079633F;

		bodyModel[338].addShapeBox(-3F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 199
		bodyModel[338].setRotationPoint(-9F, -6F, -26F);
		bodyModel[338].rotateAngleX = 1.57079633F;
		bodyModel[338].rotateAngleZ = -1.57079633F;

		bodyModel[339].addShapeBox(-2F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[339].setRotationPoint(-9F, -6F, -26F);
		bodyModel[339].rotateAngleX = 1.57079633F;
		bodyModel[339].rotateAngleZ = -1.57079633F;

		bodyModel[340].addShapeBox(-1F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 201
		bodyModel[340].setRotationPoint(-9F, -6F, -26F);
		bodyModel[340].rotateAngleX = 1.57079633F;
		bodyModel[340].rotateAngleZ = -1.57079633F;

		bodyModel[341].addShapeBox(-12F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 202
		bodyModel[341].setRotationPoint(-9F, 6F, -26F);
		bodyModel[341].rotateAngleX = 1.57079633F;
		bodyModel[341].rotateAngleZ = -1.57079633F;

		bodyModel[342].addShapeBox(-11F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[342].setRotationPoint(-9F, 6F, -26F);
		bodyModel[342].rotateAngleX = 1.57079633F;
		bodyModel[342].rotateAngleZ = -1.57079633F;

		bodyModel[343].addShapeBox(-10F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 204
		bodyModel[343].setRotationPoint(-9F, 6F, -26F);
		bodyModel[343].rotateAngleX = 1.57079633F;
		bodyModel[343].rotateAngleZ = -1.57079633F;

		bodyModel[344].addShapeBox(-11.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[344].setRotationPoint(-9F, 6F, -26F);
		bodyModel[344].rotateAngleX = 1.57079633F;
		bodyModel[344].rotateAngleZ = -1.57079633F;

		bodyModel[345].addShapeBox(-2.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[345].setRotationPoint(-9F, -6F, -26F);
		bodyModel[345].rotateAngleX = 1.57079633F;
		bodyModel[345].rotateAngleZ = -1.57079633F;

		bodyModel[346].addShapeBox(-5.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[346].setRotationPoint(-9F, -6F, -26F);
		bodyModel[346].rotateAngleX = 1.57079633F;
		bodyModel[346].rotateAngleZ = -1.57079633F;

		bodyModel[347].addShapeBox(-8.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[347].setRotationPoint(-9F, -6F, -26F);
		bodyModel[347].rotateAngleX = 1.57079633F;
		bodyModel[347].rotateAngleZ = -1.57079633F;

		bodyModel[348].addShapeBox(-11.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[348].setRotationPoint(-9F, -6F, -26F);
		bodyModel[348].rotateAngleX = 1.57079633F;
		bodyModel[348].rotateAngleZ = -1.57079633F;

		bodyModel[349].addShapeBox(-11.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[349].setRotationPoint(-9F, -6F, -26F);
		bodyModel[349].rotateAngleX = 1.57079633F;
		bodyModel[349].rotateAngleZ = -1.57079633F;

		bodyModel[350].addShapeBox(-8.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[350].setRotationPoint(-9F, -6F, -26F);
		bodyModel[350].rotateAngleX = 1.57079633F;
		bodyModel[350].rotateAngleZ = -1.57079633F;

		bodyModel[351].addShapeBox(-5.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[351].setRotationPoint(-9F, -6F, -26F);
		bodyModel[351].rotateAngleX = 1.57079633F;
		bodyModel[351].rotateAngleZ = -1.57079633F;

		bodyModel[352].addShapeBox(-2.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[352].setRotationPoint(-9F, -6F, -26F);
		bodyModel[352].rotateAngleX = 1.57079633F;
		bodyModel[352].rotateAngleZ = -1.57079633F;

		bodyModel[353].addShapeBox(-11.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[353].setRotationPoint(-9F, 6F, -26F);
		bodyModel[353].rotateAngleX = 1.57079633F;
		bodyModel[353].rotateAngleZ = -1.57079633F;

		bodyModel[354].addShapeBox(-9F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 215
		bodyModel[354].setRotationPoint(-9F, 6F, -26F);
		bodyModel[354].rotateAngleX = 1.57079633F;
		bodyModel[354].rotateAngleZ = -1.57079633F;

		bodyModel[355].addShapeBox(-8F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[355].setRotationPoint(-9F, 6F, -26F);
		bodyModel[355].rotateAngleX = 1.57079633F;
		bodyModel[355].rotateAngleZ = -1.57079633F;

		bodyModel[356].addShapeBox(-7F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 217
		bodyModel[356].setRotationPoint(-9F, 6F, -26F);
		bodyModel[356].rotateAngleX = 1.57079633F;
		bodyModel[356].rotateAngleZ = -1.57079633F;

		bodyModel[357].addShapeBox(-8.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[357].setRotationPoint(-9F, 6F, -26F);
		bodyModel[357].rotateAngleX = 1.57079633F;
		bodyModel[357].rotateAngleZ = -1.57079633F;

		bodyModel[358].addShapeBox(-8.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[358].setRotationPoint(-9F, 6F, -26F);
		bodyModel[358].rotateAngleX = 1.57079633F;
		bodyModel[358].rotateAngleZ = -1.57079633F;

		bodyModel[359].addShapeBox(-10F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 220
		bodyModel[359].setRotationPoint(-49F, 4F, 24F);
		bodyModel[359].rotateAngleX = 1.57079633F;
		bodyModel[359].rotateAngleZ = -1.57079633F;

		bodyModel[360].addShapeBox(-11F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[360].setRotationPoint(-49F, 4F, 24F);
		bodyModel[360].rotateAngleX = 1.57079633F;
		bodyModel[360].rotateAngleZ = -1.57079633F;

		bodyModel[361].addShapeBox(-12F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 222
		bodyModel[361].setRotationPoint(-49F, 4F, 24F);
		bodyModel[361].rotateAngleX = 1.57079633F;
		bodyModel[361].rotateAngleZ = -1.57079633F;

		bodyModel[362].addShapeBox(-1F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 223
		bodyModel[362].setRotationPoint(-49F, -8F, 24F);
		bodyModel[362].rotateAngleX = 1.57079633F;
		bodyModel[362].rotateAngleZ = -1.57079633F;

		bodyModel[363].addShapeBox(-3F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 224
		bodyModel[363].setRotationPoint(-49F, -8F, 24F);
		bodyModel[363].rotateAngleX = 1.57079633F;
		bodyModel[363].rotateAngleZ = -1.57079633F;

		bodyModel[364].addShapeBox(-4F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 225
		bodyModel[364].setRotationPoint(-49F, -8F, 24F);
		bodyModel[364].rotateAngleX = 1.57079633F;
		bodyModel[364].rotateAngleZ = -1.57079633F;

		bodyModel[365].addShapeBox(-5F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[365].setRotationPoint(-49F, -8F, 24F);
		bodyModel[365].rotateAngleX = 1.57079633F;
		bodyModel[365].rotateAngleZ = -1.57079633F;

		bodyModel[366].addShapeBox(-6F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 227
		bodyModel[366].setRotationPoint(-49F, -8F, 24F);
		bodyModel[366].rotateAngleX = 1.57079633F;
		bodyModel[366].rotateAngleZ = -1.57079633F;

		bodyModel[367].addShapeBox(-8F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[367].setRotationPoint(-49F, -8F, 24F);
		bodyModel[367].rotateAngleX = 1.57079633F;
		bodyModel[367].rotateAngleZ = -1.57079633F;

		bodyModel[368].addShapeBox(-7F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 229
		bodyModel[368].setRotationPoint(-49F, -8F, 24F);
		bodyModel[368].rotateAngleX = 1.57079633F;
		bodyModel[368].rotateAngleZ = -1.57079633F;

		bodyModel[369].addShapeBox(-9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 230
		bodyModel[369].setRotationPoint(-49F, -8F, 24F);
		bodyModel[369].rotateAngleX = 1.57079633F;
		bodyModel[369].rotateAngleZ = -1.57079633F;

		bodyModel[370].addShapeBox(-8.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 231
		bodyModel[370].setRotationPoint(-49F, -8F, 26F);
		bodyModel[370].rotateAngleX = 1.57079633F;
		bodyModel[370].rotateAngleZ = -1.57079633F;

		bodyModel[371].addShapeBox(-8.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 232
		bodyModel[371].setRotationPoint(-49F, -8F, 26F);
		bodyModel[371].rotateAngleX = 1.57079633F;
		bodyModel[371].rotateAngleZ = -1.57079633F;

		bodyModel[372].addShapeBox(-5.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 233
		bodyModel[372].setRotationPoint(-49F, -8F, 26F);
		bodyModel[372].rotateAngleX = 1.57079633F;
		bodyModel[372].rotateAngleZ = -1.57079633F;

		bodyModel[373].addShapeBox(-5.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 234
		bodyModel[373].setRotationPoint(-49F, -8F, 26F);
		bodyModel[373].rotateAngleX = 1.57079633F;
		bodyModel[373].rotateAngleZ = -1.57079633F;

		bodyModel[374].addShapeBox(-2.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 235
		bodyModel[374].setRotationPoint(-49F, -8F, 26F);
		bodyModel[374].rotateAngleX = 1.57079633F;
		bodyModel[374].rotateAngleZ = -1.57079633F;

		bodyModel[375].addShapeBox(-2.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 236
		bodyModel[375].setRotationPoint(-49F, -8F, 26F);
		bodyModel[375].rotateAngleX = 1.57079633F;
		bodyModel[375].rotateAngleZ = -1.57079633F;

		bodyModel[376].addShapeBox(-2F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[376].setRotationPoint(-49F, -8F, 24F);
		bodyModel[376].rotateAngleX = 1.57079633F;
		bodyModel[376].rotateAngleZ = -1.57079633F;

		bodyModel[377].addShapeBox(-11.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 238
		bodyModel[377].setRotationPoint(-49F, 4F, 26F);
		bodyModel[377].rotateAngleX = 1.57079633F;
		bodyModel[377].rotateAngleZ = -1.57079633F;

		bodyModel[378].addShapeBox(-11.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 239
		bodyModel[378].setRotationPoint(-49F, 4F, 26F);
		bodyModel[378].rotateAngleX = 1.57079633F;
		bodyModel[378].rotateAngleZ = -1.57079633F;

		bodyModel[379].addShapeBox(-8F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[379].setRotationPoint(-49F, 4F, 24F);
		bodyModel[379].rotateAngleX = 1.57079633F;
		bodyModel[379].rotateAngleZ = -1.57079633F;

		bodyModel[380].addShapeBox(-7F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 249
		bodyModel[380].setRotationPoint(-49F, 4F, 24F);
		bodyModel[380].rotateAngleX = 1.57079633F;
		bodyModel[380].rotateAngleZ = -1.57079633F;

		bodyModel[381].addShapeBox(-9F, -1.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 250
		bodyModel[381].setRotationPoint(-49F, 4F, 24F);
		bodyModel[381].rotateAngleX = 1.57079633F;
		bodyModel[381].rotateAngleZ = -1.57079633F;

		bodyModel[382].addShapeBox(-8.5F, -2.5F, -2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 251
		bodyModel[382].setRotationPoint(-49F, 4F, 26F);
		bodyModel[382].rotateAngleX = 1.57079633F;
		bodyModel[382].rotateAngleZ = -1.57079633F;

		bodyModel[383].addShapeBox(-8.5F, -2.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 252
		bodyModel[383].setRotationPoint(-49F, 4F, 26F);
		bodyModel[383].rotateAngleX = 1.57079633F;
		bodyModel[383].rotateAngleZ = -1.57079633F;

		bodyModel[384].addShapeBox(-12F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 275
		bodyModel[384].setRotationPoint(35F, -4F, 3F);
		bodyModel[384].rotateAngleZ = -0.80285146F;

		bodyModel[385].addShapeBox(-11F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[385].setRotationPoint(35F, -4F, 3F);
		bodyModel[385].rotateAngleZ = -0.80285146F;

		bodyModel[386].addShapeBox(-10F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 277
		bodyModel[386].setRotationPoint(35F, -4F, 3F);
		bodyModel[386].rotateAngleZ = -0.80285146F;

		bodyModel[387].addShapeBox(-9F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 278
		bodyModel[387].setRotationPoint(35F, -4F, 3F);
		bodyModel[387].rotateAngleZ = -0.80285146F;

		bodyModel[388].addShapeBox(-8F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[388].setRotationPoint(35F, -4F, 3F);
		bodyModel[388].rotateAngleZ = -0.80285146F;

		bodyModel[389].addShapeBox(-7F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 280
		bodyModel[389].setRotationPoint(35F, -4F, 3F);
		bodyModel[389].rotateAngleZ = -0.80285146F;

		bodyModel[390].addShapeBox(-6F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 281
		bodyModel[390].setRotationPoint(35F, -4F, 3F);
		bodyModel[390].rotateAngleZ = -0.80285146F;

		bodyModel[391].addShapeBox(-5F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[391].setRotationPoint(35F, -4F, 3F);
		bodyModel[391].rotateAngleZ = -0.80285146F;

		bodyModel[392].addShapeBox(-4F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 283
		bodyModel[392].setRotationPoint(35F, -4F, 3F);
		bodyModel[392].rotateAngleZ = -0.80285146F;

		bodyModel[393].addShapeBox(-5.5F, -4.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[393].setRotationPoint(35F, -4F, 3F);
		bodyModel[393].rotateAngleZ = -0.80285146F;

		bodyModel[394].addShapeBox(-8.5F, -4.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[394].setRotationPoint(35F, -4F, 3F);
		bodyModel[394].rotateAngleZ = -0.80285146F;

		bodyModel[395].addShapeBox(-11.5F, -4.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[395].setRotationPoint(35F, -4F, 3F);
		bodyModel[395].rotateAngleZ = -0.80285146F;

		bodyModel[396].addShapeBox(-11.5F, -4.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[396].setRotationPoint(35F, -4F, 3F);
		bodyModel[396].rotateAngleZ = -0.80285146F;

		bodyModel[397].addShapeBox(-8.5F, -4.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[397].setRotationPoint(35F, -4F, 3F);
		bodyModel[397].rotateAngleZ = -0.80285146F;

		bodyModel[398].addShapeBox(-5.5F, -4.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[398].setRotationPoint(35F, -4F, 3F);
		bodyModel[398].rotateAngleZ = -0.80285146F;

		bodyModel[399].addShapeBox(-3F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 290
		bodyModel[399].setRotationPoint(35F, -4F, 3F);
		bodyModel[399].rotateAngleZ = -0.80285146F;

		bodyModel[400].addShapeBox(-2F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[400].setRotationPoint(35F, -4F, 3F);
		bodyModel[400].rotateAngleZ = -0.80285146F;

		bodyModel[401].addShapeBox(-1F, -3.5F, -3.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 292
		bodyModel[401].setRotationPoint(35F, -4F, 3F);
		bodyModel[401].rotateAngleZ = -0.80285146F;

		bodyModel[402].addShapeBox(-2.5F, -4.5F, -2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[402].setRotationPoint(35F, -4F, 3F);
		bodyModel[402].rotateAngleZ = -0.80285146F;

		bodyModel[403].addShapeBox(-2.5F, -4.5F, 2F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[403].setRotationPoint(35F, -4F, 3F);
		bodyModel[403].rotateAngleZ = -0.80285146F;

		bodyModel[404].addShapeBox(-12F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 305
		bodyModel[404].setRotationPoint(-19F, -4F, -26F);
		bodyModel[404].rotateAngleX = 1.57079633F;
		bodyModel[404].rotateAngleZ = -1.57079633F;

		bodyModel[405].addShapeBox(-11F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[405].setRotationPoint(-19F, -4F, -26F);
		bodyModel[405].rotateAngleX = 1.57079633F;
		bodyModel[405].rotateAngleZ = -1.57079633F;

		bodyModel[406].addShapeBox(-10F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 307
		bodyModel[406].setRotationPoint(-19F, -4F, -26F);
		bodyModel[406].rotateAngleX = 1.57079633F;
		bodyModel[406].rotateAngleZ = -1.57079633F;

		bodyModel[407].addShapeBox(-9F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 308
		bodyModel[407].setRotationPoint(-19F, -4F, -26F);
		bodyModel[407].rotateAngleX = 1.57079633F;
		bodyModel[407].rotateAngleZ = -1.57079633F;

		bodyModel[408].addShapeBox(-8F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[408].setRotationPoint(-19F, -4F, -26F);
		bodyModel[408].rotateAngleX = 1.57079633F;
		bodyModel[408].rotateAngleZ = -1.57079633F;

		bodyModel[409].addShapeBox(-7F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 310
		bodyModel[409].setRotationPoint(-19F, -4F, -26F);
		bodyModel[409].rotateAngleX = 1.57079633F;
		bodyModel[409].rotateAngleZ = -1.57079633F;

		bodyModel[410].addShapeBox(-6F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 311
		bodyModel[410].setRotationPoint(-19F, -4F, -26F);
		bodyModel[410].rotateAngleX = 1.57079633F;
		bodyModel[410].rotateAngleZ = -1.57079633F;

		bodyModel[411].addShapeBox(-5F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[411].setRotationPoint(-19F, -4F, -26F);
		bodyModel[411].rotateAngleX = 1.57079633F;
		bodyModel[411].rotateAngleZ = -1.57079633F;

		bodyModel[412].addShapeBox(-4F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 313
		bodyModel[412].setRotationPoint(-19F, -4F, -26F);
		bodyModel[412].rotateAngleX = 1.57079633F;
		bodyModel[412].rotateAngleZ = -1.57079633F;

		bodyModel[413].addShapeBox(-5.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[413].setRotationPoint(-19F, -4F, -26F);
		bodyModel[413].rotateAngleX = 1.57079633F;
		bodyModel[413].rotateAngleZ = -1.57079633F;

		bodyModel[414].addShapeBox(-5.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[414].setRotationPoint(-19F, -4F, -26F);
		bodyModel[414].rotateAngleX = 1.57079633F;
		bodyModel[414].rotateAngleZ = -1.57079633F;

		bodyModel[415].addShapeBox(-8.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[415].setRotationPoint(-19F, -4F, -26F);
		bodyModel[415].rotateAngleX = 1.57079633F;
		bodyModel[415].rotateAngleZ = -1.57079633F;

		bodyModel[416].addShapeBox(-8.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[416].setRotationPoint(-19F, -4F, -26F);
		bodyModel[416].rotateAngleX = 1.57079633F;
		bodyModel[416].rotateAngleZ = -1.57079633F;

		bodyModel[417].addShapeBox(-11.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[417].setRotationPoint(-19F, -4F, -26F);
		bodyModel[417].rotateAngleX = 1.57079633F;
		bodyModel[417].rotateAngleZ = -1.57079633F;

		bodyModel[418].addShapeBox(-11.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[418].setRotationPoint(-19F, -4F, -26F);
		bodyModel[418].rotateAngleX = 1.57079633F;
		bodyModel[418].rotateAngleZ = -1.57079633F;

		bodyModel[419].addShapeBox(-6F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 320
		bodyModel[419].setRotationPoint(-19F, -1F, -26F);
		bodyModel[419].rotateAngleX = 1.57079633F;
		bodyModel[419].rotateAngleZ = -1.57079633F;

		bodyModel[420].addShapeBox(-5F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[420].setRotationPoint(-19F, -1F, -26F);
		bodyModel[420].rotateAngleX = 1.57079633F;
		bodyModel[420].rotateAngleZ = -1.57079633F;

		bodyModel[421].addShapeBox(-4F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 322
		bodyModel[421].setRotationPoint(-19F, -1F, -26F);
		bodyModel[421].rotateAngleX = 1.57079633F;
		bodyModel[421].rotateAngleZ = -1.57079633F;

		bodyModel[422].addShapeBox(-5.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[422].setRotationPoint(-19F, -1F, -26F);
		bodyModel[422].rotateAngleX = 1.57079633F;
		bodyModel[422].rotateAngleZ = -1.57079633F;

		bodyModel[423].addShapeBox(-5.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[423].setRotationPoint(-19F, -1F, -26F);
		bodyModel[423].rotateAngleX = 1.57079633F;
		bodyModel[423].rotateAngleZ = -1.57079633F;

		bodyModel[424].addShapeBox(-6F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 325
		bodyModel[424].setRotationPoint(-19F, 2F, -26F);
		bodyModel[424].rotateAngleX = 1.57079633F;
		bodyModel[424].rotateAngleZ = -1.57079633F;

		bodyModel[425].addShapeBox(-5F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[425].setRotationPoint(-19F, 2F, -26F);
		bodyModel[425].rotateAngleX = 1.57079633F;
		bodyModel[425].rotateAngleZ = -1.57079633F;

		bodyModel[426].addShapeBox(-4F, -1.5F, -30.5F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 327
		bodyModel[426].setRotationPoint(-19F, 2F, -26F);
		bodyModel[426].rotateAngleX = 1.57079633F;
		bodyModel[426].rotateAngleZ = -1.57079633F;

		bodyModel[427].addShapeBox(-5.5F, -2.5F, -29F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[427].setRotationPoint(-19F, 2F, -26F);
		bodyModel[427].rotateAngleX = 1.57079633F;
		bodyModel[427].rotateAngleZ = -1.57079633F;

		bodyModel[428].addShapeBox(-5.5F, -2.5F, -25F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[428].setRotationPoint(-19F, 2F, -26F);
		bodyModel[428].rotateAngleX = 1.57079633F;
		bodyModel[428].rotateAngleZ = -1.57079633F;

		bodyModel[429].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -6F, 0F); // Box 0
		bodyModel[429].setRotationPoint(15F, -23F, -2.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[430].setRotationPoint(14F, -23F, -2.5F);

		bodyModel[431].addShapeBox(-0.5F, 0F, -0.2F, 9, 5, 5, 0F, 0.2F, -2.1F, 0.1F, 0.2F, -2.1F, 0.1F, 0.2F, -2.1F, 0.1F, 0.2F, -2.1F, 0.1F, 0.2F, -2.1F, 0.1F, 0.2F, -2.1F, 0.1F, 0.2F, -2.1F, 0.1F, 0.2F, -2.1F, 0.1F); // Box 555
		bodyModel[431].setRotationPoint(-36F, -29F, -17F);
		bodyModel[431].rotateAngleX = 0.05235988F;
		bodyModel[431].rotateAngleY = 0.54105207F;
		bodyModel[431].rotateAngleZ = 0.05235988F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 5
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 6
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 7
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 8

		bodyDoorOpenModel[0].addShapeBox(-8F, 0F, -1.5F, 8, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyDoorOpenModel[0].setRotationPoint(23F, -23F, 0F);
		bodyDoorOpenModel[0].rotateAngleZ = -3.24631241F;

		bodyDoorOpenModel[1].addShapeBox(-7.5F, -0.5F, 4F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyDoorOpenModel[1].setRotationPoint(23F, -23F, 0F);
		bodyDoorOpenModel[1].rotateAngleZ = -3.24631241F;

		bodyDoorOpenModel[2].addShapeBox(-0.5F, -0.3F, 7F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyDoorOpenModel[2].setRotationPoint(23F, -23F, 0F);
		bodyDoorOpenModel[2].rotateAngleZ = -3.24631241F;

		bodyDoorOpenModel[3].addShapeBox(-0.5F, -0.3F, 1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyDoorOpenModel[3].setRotationPoint(23F, -23F, 0F);
		bodyDoorOpenModel[3].rotateAngleZ = -3.24631241F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 12
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 13
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 3
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4

		bodyDoorCloseModel[0].addShapeBox(-8F, 0F, -1.5F, 8, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyDoorCloseModel[0].setRotationPoint(23F, -23F, 0F);

		bodyDoorCloseModel[1].addShapeBox(-0.5F, -0.3F, 1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[1].setRotationPoint(23F, -23F, 0F);

		bodyDoorCloseModel[2].addShapeBox(-0.5F, -0.3F, 7F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyDoorCloseModel[2].setRotationPoint(23F, -23F, 0F);

		bodyDoorCloseModel[3].addShapeBox(-7.5F, -0.5F, 4F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyDoorCloseModel[3].setRotationPoint(23F, -23F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 25
		turretModel[1] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 27
		turretModel[2] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 28
		turretModel[3] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 29
		turretModel[4] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 30
		turretModel[5] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 31
		turretModel[6] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 32
		turretModel[7] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 33
		turretModel[8] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 34
		turretModel[9] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 36
		turretModel[10] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 37
		turretModel[11] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 38
		turretModel[12] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 44
		turretModel[13] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 45
		turretModel[14] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 46
		turretModel[15] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 47
		turretModel[16] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 48
		turretModel[17] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 49
		turretModel[18] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 57
		turretModel[19] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 60
		turretModel[20] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 61
		turretModel[21] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 64
		turretModel[22] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 66
		turretModel[23] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 33
		turretModel[24] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 34
		turretModel[25] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 35
		turretModel[26] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 36
		turretModel[27] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 37
		turretModel[28] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 38
		turretModel[29] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 39
		turretModel[30] = new ModelRendererTurbo(this, 9, 257, textureX, textureY); // Box 12
		turretModel[31] = new ModelRendererTurbo(this, 209, 310, textureX, textureY); // Box 556
		turretModel[32] = new ModelRendererTurbo(this, 209, 310, textureX, textureY); // Box 557

		turretModel[0].addShapeBox(-3F, -12F, -13F, 8, 11, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[0].setRotationPoint(0F, -22F, 0F);

		turretModel[1].addShapeBox(-3F, -12F, 9F, 6, 11, 4, 0F, 3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 27
		turretModel[1].setRotationPoint(0F, -22F, 0F);

		turretModel[2].addShapeBox(-3F, -12F, -9F, 8, 11, 9, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[2].setRotationPoint(0F, -22F, 0F);

		turretModel[3].addShapeBox(7F, -1F, -8F, 4, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 29
		turretModel[3].setRotationPoint(0F, -21F, 0F);

		turretModel[4].addShapeBox(3F, -12F, 9F, 8, 11, 4, 0F, 0F, 0F, 1F, -2F, -1F, 2F, -2F, -1F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 30
		turretModel[4].setRotationPoint(0F, -22F, 0F);

		turretModel[5].addShapeBox(5F, -12F, -13F, 6, 11, 4, 0F, 0F, 0F, -3F, -2F, -1F, -5F, -2F, -1F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 31
		turretModel[5].setRotationPoint(0F, -22F, 0F);

		turretModel[6].addShapeBox(-17F, -12F, 0F, 14, 11, 13, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -9F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F); // Box 32
		turretModel[6].setRotationPoint(0F, -22F, 0F);

		turretModel[7].addShapeBox(-17F, -12F, -13F, 14, 11, 13, 0F, -9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 33
		turretModel[7].setRotationPoint(0F, -22F, 0F);

		turretModel[8].addShapeBox(11F, -11F, -8F, 4, 8, 15, 0F, 2F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 2F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 2F); // Box 34
		turretModel[8].setRotationPoint(0F, -22F, 0F);

		turretModel[9].addShapeBox(-3F, -12F, 0F, 6, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2.65F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[9].setRotationPoint(0F, -22F, 0F);

		turretModel[10].addShapeBox(3F, -12F, 0F, 4, 11, 8, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 37
		turretModel[10].setRotationPoint(0F, -22F, 0F);

		turretModel[11].addShapeBox(5F, -12F, -8F, 6, 11, 9, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 38
		turretModel[11].setRotationPoint(0F, -22F, 0F);

		turretModel[12].addShapeBox(11F, -3F, -8F, 4, 2, 15, 0F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 2F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 2F); // Box 44
		turretModel[12].setRotationPoint(0F, -22F, 0F);

		turretModel[13].addShapeBox(-15F, -1F, 1F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 45
		turretModel[13].setRotationPoint(0F, -21F, 0F);

		turretModel[14].addShapeBox(-13F, -1F, 7F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 46
		turretModel[14].setRotationPoint(0F, -21F, 0F);

		turretModel[15].addShapeBox(-15F, -1F, -6F, 14, 1, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		turretModel[15].setRotationPoint(0F, -21F, 0F);

		turretModel[16].addShapeBox(-13F, -1F, -11F, 12, 1, 5, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		turretModel[16].setRotationPoint(0F, -21F, 0F);

		turretModel[17].addShapeBox(-15F, -1F, -1F, 14, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[17].setRotationPoint(0F, -21F, 0F);

		turretModel[18].addShapeBox(-1F, -1F, -11F, 8, 1, 23, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 57
		turretModel[18].setRotationPoint(0F, -21F, 0F);

		turretModel[19].addShapeBox(5F, -12F, 1F, 6, 11, 7, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, -1F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 60
		turretModel[19].setRotationPoint(0F, -22F, 0F);

		turretModel[20].addShapeBox(-10F, -15F, 1F, 11, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		turretModel[20].setRotationPoint(0F, -22F, 0F);

		turretModel[21].addShapeBox(-10F, -15F, 7F, 11, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 64
		turretModel[21].setRotationPoint(0F, -22F, 0F);

		turretModel[22].addShapeBox(-10F, -15F, -2F, 11, 3, 3, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		turretModel[22].setRotationPoint(0F, -22F, 0F);

		turretModel[23].addShapeBox(7F, -2F, -9F, 4, 1, 19, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 33
		turretModel[23].setRotationPoint(0F, -21F, 0F);

		turretModel[24].addShapeBox(-1F, -2F, -12F, 8, 1, 25, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 34
		turretModel[24].setRotationPoint(0F, -21F, 0F);

		turretModel[25].addShapeBox(-13F, -2F, 7F, 12, 1, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F); // Box 35
		turretModel[25].setRotationPoint(0F, -21F, 0F);

		turretModel[26].addShapeBox(-15F, -2F, 1F, 14, 1, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 36
		turretModel[26].setRotationPoint(0F, -21F, 0F);

		turretModel[27].addShapeBox(-15F, -2F, -1F, 14, 1, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		turretModel[27].setRotationPoint(0F, -21F, 0F);

		turretModel[28].addShapeBox(-15F, -2F, -6F, 14, 1, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[28].setRotationPoint(0F, -21F, 0F);

		turretModel[29].addShapeBox(-13F, -2F, -12F, 12, 1, 6, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		turretModel[29].setRotationPoint(0F, -21F, 0F);

		turretModel[30].addShapeBox(-16.5F, -11F, -12F, 9, 9, 11, 0F, -6.8F, 0F, -3F, -1F, 0F, -3F, -5.5F, 0F, 0F, -2F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, -8.5F, 0F, 2F, 1F, 0F, 2F); // Box 12
		turretModel[30].setRotationPoint(0F, -22F, 0F);

		turretModel[31].addShapeBox(-79F, -10F, 9.5F, 81, 81, 1, 0F, -75F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -75F, 0F, 0.2F, -75F, -75F, 2F, 0F, -75F, 2F, 0F, -75F, 2F, -75F, -75F, 2F); // Box 556
		turretModel[31].setRotationPoint(0F, -22F, 0F);

		turretModel[32].addShapeBox(-79F, -10F, -10.5F, 81, 81, 1, 0F, -75F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -75F, 0F, 0.2F, -75F, -75F, 2F, 0F, -75F, 2F, 0F, -75F, 2F, -75F, -75F, 2F); // Box 557
		turretModel[32].setRotationPoint(0F, -22F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 35
		barrelModel[1] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 39
		barrelModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 40
		barrelModel[3] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 41
		barrelModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 42
		barrelModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 51
		barrelModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 52
		barrelModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 53
		barrelModel[8] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 54
		barrelModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 56

		barrelModel[0].addShapeBox(0F, -3F, -5.5F, 2, 7, 5, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 35
		barrelModel[0].setRotationPoint(15F, -28F, 0F);

		barrelModel[1].addShapeBox(-2F, -5F, -5.5F, 2, 3, 5, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F, -1F); // Box 39
		barrelModel[1].setRotationPoint(15F, -28F, 0F);

		barrelModel[2].addShapeBox(1F, -1.5F, 0.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 40
		barrelModel[2].setRotationPoint(15F, -28F, 0F);

		barrelModel[3].addShapeBox(0F, -2F, 0F, 1, 4, 5, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 1F, -1F); // Box 41
		barrelModel[3].setRotationPoint(15F, -28F, 0F);

		barrelModel[4].addShapeBox(-0.5F, -0.5F, 1.5F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 42
		barrelModel[4].setRotationPoint(17F, -28F, 0F);

		barrelModel[5].addShapeBox(2F, -0.5F, -4F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		barrelModel[5].setRotationPoint(15F, -28F, 0F);

		barrelModel[6].addShapeBox(2F, -1F, -4F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		barrelModel[6].setRotationPoint(15F, -28F, 0F);

		barrelModel[7].addShapeBox(2F, 0F, -4F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53
		barrelModel[7].setRotationPoint(15F, -28F, 0F);

		barrelModel[8].addShapeBox(3F, -0.5F, -3.5F, 12, 1, 1, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 54
		barrelModel[8].setRotationPoint(15F, -28F, 0F);

		barrelModel[9].addShapeBox(15F, -0.5F, -3.5F, 2, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 56
		barrelModel[9].setRotationPoint(15F, -28F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 52
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 52
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 1
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 2
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 3
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 4
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 5
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 6
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 7
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 8
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 9
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 10
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 11
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 12
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 13
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 14
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 321, 282, textureX, textureY); // Shape 16
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 262, 282, textureX, textureY); // Shape 17
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 18
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 549
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 550
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 551

		leftTrackWheelModels[0].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 7, 12, 12, 44, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 52
		leftTrackWheelModels[0].setRotationPoint(39F, -6F, 18F);

		leftTrackWheelModels[1].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 52
		leftTrackWheelModels[1].setRotationPoint(20F, 3F, 16F);

		leftTrackWheelModels[2].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 1
		leftTrackWheelModels[2].setRotationPoint(14F, 3.5F, 16F);

		leftTrackWheelModels[3].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 2
		leftTrackWheelModels[3].setRotationPoint(8F, 4F, 16F);

		leftTrackWheelModels[4].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 3
		leftTrackWheelModels[4].setRotationPoint(2F, 4F, 16F);

		leftTrackWheelModels[5].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 4
		leftTrackWheelModels[5].setRotationPoint(-10F, 4F, 16F);

		leftTrackWheelModels[6].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 5
		leftTrackWheelModels[6].setRotationPoint(-4F, 4F, 16F);

		leftTrackWheelModels[7].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 6
		leftTrackWheelModels[7].setRotationPoint(-34F, 4F, 16F);

		leftTrackWheelModels[8].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 7
		leftTrackWheelModels[8].setRotationPoint(-28F, 4F, 16F);

		leftTrackWheelModels[9].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 8
		leftTrackWheelModels[9].setRotationPoint(-16F, 4F, 16F);

		leftTrackWheelModels[10].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 9
		leftTrackWheelModels[10].setRotationPoint(-22F, 4F, 16F);

		leftTrackWheelModels[11].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 10
		leftTrackWheelModels[11].setRotationPoint(-58F, 4F, 16F);

		leftTrackWheelModels[12].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 11
		leftTrackWheelModels[12].setRotationPoint(-52F, 4F, 16F);

		leftTrackWheelModels[13].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 12
		leftTrackWheelModels[13].setRotationPoint(-40F, 4F, 16F);

		leftTrackWheelModels[14].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 13
		leftTrackWheelModels[14].setRotationPoint(-46F, 4F, 16F);

		leftTrackWheelModels[15].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 14
		leftTrackWheelModels[15].setRotationPoint(26F, 1.5F, 16F);

		leftTrackWheelModels[16].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 7, 12, 12, 44, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 16
		leftTrackWheelModels[16].setRotationPoint(-61.5F, -5.5F, 18F);

		leftTrackWheelModels[17].addShape3D(7F, -7F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(10, 0, 10, 0), new Coord2D(14, 4, 14, 4), new Coord2D(14, 10, 14, 10), new Coord2D(10, 14, 10, 14), new Coord2D(4, 14, 4, 14), new Coord2D(0, 10, 0, 10), new Coord2D(0, 4, 0, 4)}), 5, 14, 14, 48, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 6, 6, 6, 6, 6, 6, 6}); // Shape 17
		leftTrackWheelModels[17].setRotationPoint(-61.5F, -5.5F, 14F);

		leftTrackWheelModels[18].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 18
		leftTrackWheelModels[18].setRotationPoint(32F, 0.5F, 16F);

		leftTrackWheelModels[19].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 6, 8, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 549
		leftTrackWheelModels[19].setRotationPoint(-5.5F, -16F, 15F);

		leftTrackWheelModels[20].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 6, 8, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 550
		leftTrackWheelModels[20].setRotationPoint(-20.5F, -16F, 15F);

		leftTrackWheelModels[21].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 6, 8, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 551
		leftTrackWheelModels[21].setRotationPoint(-35.5F, -16F, 15F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 321, 237, textureX, textureY); // Shape 32
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 33
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 34
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 35
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 36
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 37
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 38
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 39
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 40
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 41
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 42
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 43
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 44
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 45
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 46
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 47
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 321, 282, textureX, textureY); // Shape 48
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 262, 282, textureX, textureY); // Shape 49
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 50
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 552
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 553
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Shape 554

		rightTrackWheelModels[0].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 7, 12, 12, 44, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 32
		rightTrackWheelModels[0].setRotationPoint(39F, -6F, -20F);

		rightTrackWheelModels[1].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 33
		rightTrackWheelModels[1].setRotationPoint(20F, 3F, -22F);

		rightTrackWheelModels[2].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 34
		rightTrackWheelModels[2].setRotationPoint(14F, 3.5F, -22F);

		rightTrackWheelModels[3].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 35
		rightTrackWheelModels[3].setRotationPoint(8F, 4F, -22F);

		rightTrackWheelModels[4].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 36
		rightTrackWheelModels[4].setRotationPoint(2F, 4F, -22F);

		rightTrackWheelModels[5].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 37
		rightTrackWheelModels[5].setRotationPoint(-10F, 4F, -22F);

		rightTrackWheelModels[6].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 38
		rightTrackWheelModels[6].setRotationPoint(-4F, 4F, -22F);

		rightTrackWheelModels[7].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 39
		rightTrackWheelModels[7].setRotationPoint(-34F, 4F, -22F);

		rightTrackWheelModels[8].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 40
		rightTrackWheelModels[8].setRotationPoint(-28F, 4F, -22F);

		rightTrackWheelModels[9].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 41
		rightTrackWheelModels[9].setRotationPoint(-16F, 4F, -22F);

		rightTrackWheelModels[10].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 42
		rightTrackWheelModels[10].setRotationPoint(-22F, 4F, -22F);

		rightTrackWheelModels[11].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 43
		rightTrackWheelModels[11].setRotationPoint(-58F, 4F, -22F);

		rightTrackWheelModels[12].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 44
		rightTrackWheelModels[12].setRotationPoint(-52F, 4F, -22F);

		rightTrackWheelModels[13].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 45
		rightTrackWheelModels[13].setRotationPoint(-40F, 4F, -22F);

		rightTrackWheelModels[14].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 46
		rightTrackWheelModels[14].setRotationPoint(-46F, 4F, -22F);

		rightTrackWheelModels[15].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 47
		rightTrackWheelModels[15].setRotationPoint(26F, 1.5F, -22F);

		rightTrackWheelModels[16].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 7, 12, 12, 44, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 48
		rightTrackWheelModels[16].setRotationPoint(-61.5F, -5.5F, -20F);

		rightTrackWheelModels[17].addShape3D(7F, -7F, -5.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(10, 0, 10, 0), new Coord2D(14, 4, 14, 4), new Coord2D(14, 10, 14, 10), new Coord2D(10, 14, 10, 14), new Coord2D(4, 14, 4, 14), new Coord2D(0, 10, 0, 10), new Coord2D(0, 4, 0, 4)}), 5, 14, 14, 48, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 6, 6, 6, 6, 6, 6, 6}); // Shape 49
		rightTrackWheelModels[17].setRotationPoint(-61.5F, -5.5F, -24F);

		rightTrackWheelModels[18].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 7, 8, 6, 20, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 50
		rightTrackWheelModels[18].setRotationPoint(32F, 0.5F, -22F);

		rightTrackWheelModels[19].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 6, 8, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 552
		rightTrackWheelModels[19].setRotationPoint(-5.5F, -16F, -22F);

		rightTrackWheelModels[20].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 6, 8, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 553
		rightTrackWheelModels[20].setRotationPoint(-20.5F, -16F, -22F);

		rightTrackWheelModels[21].addShape3D(5F, -3F, -4.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 6, 8, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 554
		rightTrackWheelModels[21].setRotationPoint(-35.5F, -16F, -22F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 15
		leftTrackModel[1] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 16
		leftTrackModel[2] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 21
		leftTrackModel[3] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 22
		leftTrackModel[4] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 23
		leftTrackModel[5] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 24
		leftTrackModel[6] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 25
		leftTrackModel[7] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 26
		leftTrackModel[8] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 27
		leftTrackModel[9] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 28
		leftTrackModel[10] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 29
		leftTrackModel[11] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 549
		leftTrackModel[12] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 550
		leftTrackModel[13] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 551
		leftTrackModel[14] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 552

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 46, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackModel[0].setRotationPoint(-43F, -20F, 14F);
		leftTrackModel[0].rotateAngleZ = 0.00349066F;

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 41, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftTrackModel[1].setRotationPoint(3F, -20.2F, 14F);
		leftTrackModel[1].rotateAngleZ = -0.20071286F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 72, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftTrackModel[2].setRotationPoint(13F, 8F, 14F);
		leftTrackModel[2].rotateAngleZ = -3.14159265F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftTrackModel[3].setRotationPoint(45F, -1.6F, 14F);
		leftTrackModel[3].rotateAngleZ = -2.60926723F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 23, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		leftTrackModel[4].setRotationPoint(35.5F, 3.9F, 14F);
		leftTrackModel[4].rotateAngleZ = -2.95833308F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftTrackModel[5].setRotationPoint(-59F, 8F, 14F);
		leftTrackModel[5].rotateAngleZ = -3.78736448F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		leftTrackModel[6].setRotationPoint(-67.8F, 1.35F, 14F);
		leftTrackModel[6].rotateAngleZ = -4.32841654F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		leftTrackModel[7].setRotationPoint(-69.58F, -3.2F, 14F);
		leftTrackModel[7].rotateAngleZ = -4.71238898F;

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftTrackModel[8].setRotationPoint(-69.58F, -8.2F, 14F);
		leftTrackModel[8].rotateAngleZ = -5.44542727F;

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftTrackModel[9].setRotationPoint(-66.2F, -11.9F, 14F);
		leftTrackModel[9].rotateAngleZ = -5.70722665F;

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		leftTrackModel[10].setRotationPoint(-59.5F, -16.2F, 14F);
		leftTrackModel[10].rotateAngleZ = -6.0562925F;

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		leftTrackModel[11].setRotationPoint(43.1F, -12F, 14F);
		leftTrackModel[11].rotateAngleZ = -0.64751715F;

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		leftTrackModel[12].setRotationPoint(45.5F, -10.2F, 14F);
		leftTrackModel[12].rotateAngleZ = -1.3962634F;

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftTrackModel[13].setRotationPoint(46F, -7.35F, 14F);
		leftTrackModel[13].rotateAngleZ = -1.58824962F;

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		leftTrackModel[14].setRotationPoint(46F, -4.35F, 14F);
		leftTrackModel[14].rotateAngleZ = -1.93731547F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 0
		rightTrackModel[1] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 6
		rightTrackModel[2] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 19
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 20
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 21
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 22
		rightTrackModel[6] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 23
		rightTrackModel[7] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 24
		rightTrackModel[8] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 25
		rightTrackModel[9] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 26
		rightTrackModel[10] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 30
		rightTrackModel[11] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 31
		rightTrackModel[12] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 553
		rightTrackModel[13] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 554
		rightTrackModel[14] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 555

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 46, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightTrackModel[0].setRotationPoint(-43F, -20F, -25F);
		rightTrackModel[0].rotateAngleZ = 0.00349066F;

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 72, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[1].setRotationPoint(13F, 8F, -25F);
		rightTrackModel[1].rotateAngleZ = -3.14159265F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 41, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightTrackModel[2].setRotationPoint(3F, -20.2F, -25F);
		rightTrackModel[2].rotateAngleZ = -0.20071286F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightTrackModel[3].setRotationPoint(43.1F, -12F, -25F);
		rightTrackModel[3].rotateAngleZ = -0.64751715F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		rightTrackModel[4].setRotationPoint(45.5F, -10.2F, -25F);
		rightTrackModel[4].rotateAngleZ = -1.3962634F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		rightTrackModel[5].setRotationPoint(46F, -7.35F, -25F);
		rightTrackModel[5].rotateAngleZ = -1.58824962F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightTrackModel[6].setRotationPoint(46F, -4.35F, -25F);
		rightTrackModel[6].rotateAngleZ = -1.93731547F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightTrackModel[7].setRotationPoint(45F, -1.6F, -25F);
		rightTrackModel[7].rotateAngleZ = -2.60926723F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 23, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightTrackModel[8].setRotationPoint(35.5F, 3.9F, -25F);
		rightTrackModel[8].rotateAngleZ = -2.95833308F;

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		rightTrackModel[9].setRotationPoint(-59F, 8F, -25F);
		rightTrackModel[9].rotateAngleZ = -3.78736448F;

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		rightTrackModel[10].setRotationPoint(-66.2F, -11.9F, -25F);
		rightTrackModel[10].rotateAngleZ = -5.70722665F;

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightTrackModel[11].setRotationPoint(-59.5F, -16.2F, -25F);
		rightTrackModel[11].rotateAngleZ = -6.0562925F;

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		rightTrackModel[12].setRotationPoint(-67.8F, 1.35F, -25F);
		rightTrackModel[12].rotateAngleZ = -4.32841654F;

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		rightTrackModel[13].setRotationPoint(-69.58F, -3.2F, -25F);
		rightTrackModel[13].rotateAngleZ = -4.71238898F;

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		rightTrackModel[14].setRotationPoint(-69.58F, -8.2F, -25F);
		rightTrackModel[14].rotateAngleZ = -5.44542727F;
	}

	private void initGuns()
	{
	}

	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[9];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 1, 285, textureX, textureY); // Box 0
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 17, 285, textureX, textureY); // Box 1
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 33, 285, textureX, textureY); // Box 2
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 33, 293, textureX, textureY); // Box 3
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 1, 301, textureX, textureY); // Box 4
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 1, 309, textureX, textureY); // Box 6
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 49, 293, textureX, textureY); // Box 7
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 41, 301, textureX, textureY); // Box 8
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 1, 317, textureX, textureY); // Box 9

		gun_1_Model[1][0].addShapeBox(0F, -3.5F, -2F, 1, 7, 4, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 0

		gun_1_Model[1][1].addShapeBox(-2F, -4.5F, -2F, 2, 9, 4, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 1

		gun_1_Model[1][2].addShapeBox(1F, -1F, -2F, 10, 2, 4, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_1_Model[1][3].addShapeBox(1F, -2.5F, -2F, 1, 5, 4, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F); // Box 3

		gun_1_Model[1][4].addShapeBox(1F, -1.5F, -2F, 10, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 4

		gun_1_Model[1][5].addShapeBox(1F, 0.5F, -2F, 10, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 6

		gun_1_Model[1][6].addShapeBox(1F, -2F, -2.5F, 2, 1, 5, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7

		gun_1_Model[1][7].addShapeBox(1F, -1.5F, -2.5F, 2, 3, 5, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 8

		gun_1_Model[1][8].addShapeBox(1F, 1F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 9

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(29F, -10F, -10F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}
