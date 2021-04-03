//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBlackHawk extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;
	
	public ModelBlackHawk() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[283];
		bodyModel[0] = new ModelRendererTurbo(this, 337, 103, textureX, textureY); // Box 25
		bodyModel[1] = new ModelRendererTurbo(this, 894, 103, textureX, textureY); // Box 26
		bodyModel[2] = new ModelRendererTurbo(this, 894, 132, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 337, 132, textureX, textureY); // Box 28
		bodyModel[4] = new ModelRendererTurbo(this, 99, 176, textureX, textureY); // Box 41
		bodyModel[5] = new ModelRendererTurbo(this, 55, 176, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 0, 176, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 48
		bodyModel[8] = new ModelRendererTurbo(this, 99, 176, textureX, textureY); // Box 57
		bodyModel[9] = new ModelRendererTurbo(this, 55, 176, textureX, textureY); // Box 58
		bodyModel[10] = new ModelRendererTurbo(this, 0, 176, textureX, textureY); // Box 59
		bodyModel[11] = new ModelRendererTurbo(this, 205, 103, textureX, textureY); // Box 60
		bodyModel[12] = new ModelRendererTurbo(this, 205, 132, textureX, textureY); // Box 61
		bodyModel[13] = new ModelRendererTurbo(this, 177, 103, textureX, textureY); // Box 64
		bodyModel[14] = new ModelRendererTurbo(this, 152, 103, textureX, textureY); // Box 65
		bodyModel[15] = new ModelRendererTurbo(this, 129, 103, textureX, textureY); // Box 66
		bodyModel[16] = new ModelRendererTurbo(this, 0, 103, textureX, textureY); // Box 67
		bodyModel[17] = new ModelRendererTurbo(this, 41, 103, textureX, textureY); // Box 68
		bodyModel[18] = new ModelRendererTurbo(this, 82, 103, textureX, textureY); // Box 69
		bodyModel[19] = new ModelRendererTurbo(this, 257, 132, textureX, textureY); // Box 70
		bodyModel[20] = new ModelRendererTurbo(this, 177, 132, textureX, textureY); // Box 71
		bodyModel[21] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 72
		bodyModel[22] = new ModelRendererTurbo(this, 129, 132, textureX, textureY); // Box 73
		bodyModel[23] = new ModelRendererTurbo(this, 354, 103, textureX, textureY); // Box 74
		bodyModel[24] = new ModelRendererTurbo(this, 401, 103, textureX, textureY); // Box 75
		bodyModel[25] = new ModelRendererTurbo(this, 450, 103, textureX, textureY); // Box 76
		bodyModel[26] = new ModelRendererTurbo(this, 354, 132, textureX, textureY); // Box 77
		bodyModel[27] = new ModelRendererTurbo(this, 401, 132, textureX, textureY); // Box 78
		bodyModel[28] = new ModelRendererTurbo(this, 450, 132, textureX, textureY); // Box 79
		bodyModel[29] = new ModelRendererTurbo(this, 650, 103, textureX, textureY); // Box 80
		bodyModel[30] = new ModelRendererTurbo(this, 696, 103, textureX, textureY); // Box 81
		bodyModel[31] = new ModelRendererTurbo(this, 789, 103, textureX, textureY); // Box 82
		bodyModel[32] = new ModelRendererTurbo(this, 766, 103, textureX, textureY); // Box 83
		bodyModel[33] = new ModelRendererTurbo(this, 752, 103, textureX, textureY); // Box 84
		bodyModel[34] = new ModelRendererTurbo(this, 500, 103, textureX, textureY); // Box 85
		bodyModel[35] = new ModelRendererTurbo(this, 824, 103, textureX, textureY); // Box 86
		bodyModel[36] = new ModelRendererTurbo(this, 0, 212, textureX, textureY); // Box 89
		bodyModel[37] = new ModelRendererTurbo(this, 47, 212, textureX, textureY); // Box 90
		bodyModel[38] = new ModelRendererTurbo(this, 238, 176, textureX, textureY); // Box 91
		bodyModel[39] = new ModelRendererTurbo(this, 176, 176, textureX, textureY); // Box 92
		bodyModel[40] = new ModelRendererTurbo(this, 650, 132, textureX, textureY); // Box 96
		bodyModel[41] = new ModelRendererTurbo(this, 696, 132, textureX, textureY); // Box 97
		bodyModel[42] = new ModelRendererTurbo(this, 789, 132, textureX, textureY); // Box 98
		bodyModel[43] = new ModelRendererTurbo(this, 766, 132, textureX, textureY); // Box 99
		bodyModel[44] = new ModelRendererTurbo(this, 752, 132, textureX, textureY); // Box 100
		bodyModel[45] = new ModelRendererTurbo(this, 500, 132, textureX, textureY); // Box 101
		bodyModel[46] = new ModelRendererTurbo(this, 824, 132, textureX, textureY); // Box 102
		bodyModel[47] = new ModelRendererTurbo(this, 0, 232, textureX, textureY); // Box 103
		bodyModel[48] = new ModelRendererTurbo(this, 47, 232, textureX, textureY); // Box 104
		bodyModel[49] = new ModelRendererTurbo(this, 176, 176, textureX, textureY); // Box 105
		bodyModel[50] = new ModelRendererTurbo(this, 59, 317, textureX, textureY); // Box 107
		bodyModel[51] = new ModelRendererTurbo(this, 0, 317, textureX, textureY); // Box 108
		bodyModel[52] = new ModelRendererTurbo(this, 0, 317, textureX, textureY); // Box 109
		bodyModel[53] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 110
		bodyModel[54] = new ModelRendererTurbo(this, 52, 253, textureX, textureY); // Box 111
		bodyModel[55] = new ModelRendererTurbo(this, 112, 253, textureX, textureY); // Box 112
		bodyModel[56] = new ModelRendererTurbo(this, 155, 253, textureX, textureY); // Box 113
		bodyModel[57] = new ModelRendererTurbo(this, 187, 253, textureX, textureY); // Box 114
		bodyModel[58] = new ModelRendererTurbo(this, 0, 371, textureX, textureY); // Box 115
		bodyModel[59] = new ModelRendererTurbo(this, 320, 425, textureX, textureY); // Box 116
		bodyModel[60] = new ModelRendererTurbo(this, 0, 541, textureX, textureY); // Box 117
		bodyModel[61] = new ModelRendererTurbo(this, 74, 494, textureX, textureY); // Box 118
		bodyModel[62] = new ModelRendererTurbo(this, 0, 494, textureX, textureY); // Box 119
		bodyModel[63] = new ModelRendererTurbo(this, 0, 494, textureX, textureY); // Box 120
		bodyModel[64] = new ModelRendererTurbo(this, 0, 284, textureX, textureY); // Box 123
		bodyModel[65] = new ModelRendererTurbo(this, 52, 284, textureX, textureY); // Box 124
		bodyModel[66] = new ModelRendererTurbo(this, 112, 284, textureX, textureY); // Box 125
		bodyModel[67] = new ModelRendererTurbo(this, 155, 284, textureX, textureY); // Box 126
		bodyModel[68] = new ModelRendererTurbo(this, 187, 284, textureX, textureY); // Box 129
		bodyModel[69] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 130
		bodyModel[70] = new ModelRendererTurbo(this, 320, 454, textureX, textureY); // Box 131
		bodyModel[71] = new ModelRendererTurbo(this, 0, 573, textureX, textureY); // Box 132
		bodyModel[72] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Box 133
		bodyModel[73] = new ModelRendererTurbo(this, 28, 755, textureX, textureY); // Box 134
		bodyModel[74] = new ModelRendererTurbo(this, 92, 755, textureX, textureY); // Box 135
		bodyModel[75] = new ModelRendererTurbo(this, 193, 755, textureX, textureY); // Box 136
		bodyModel[76] = new ModelRendererTurbo(this, 314, 755, textureX, textureY); // Box 137
		bodyModel[77] = new ModelRendererTurbo(this, 171, 0, textureX, textureY); // Box 150
		bodyModel[78] = new ModelRendererTurbo(this, 133, 0, textureX, textureY); // Box 151
		bodyModel[79] = new ModelRendererTurbo(this, 98, 0, textureX, textureY); // Box 152
		bodyModel[80] = new ModelRendererTurbo(this, 171, 31, textureX, textureY); // Box 153
		bodyModel[81] = new ModelRendererTurbo(this, 133, 31, textureX, textureY); // Box 154
		bodyModel[82] = new ModelRendererTurbo(this, 98, 31, textureX, textureY); // Box 155
		bodyModel[83] = new ModelRendererTurbo(this, 295, 605, textureX, textureY); // Box 156
		bodyModel[84] = new ModelRendererTurbo(this, 196, 605, textureX, textureY); // Box 6
		bodyModel[85] = new ModelRendererTurbo(this, 395, 605, textureX, textureY); // Box 7
		bodyModel[86] = new ModelRendererTurbo(this, 492, 605, textureX, textureY); // Box 8
		bodyModel[87] = new ModelRendererTurbo(this, 590, 605, textureX, textureY); // Box 9
		bodyModel[88] = new ModelRendererTurbo(this, 646, 605, textureX, textureY); // Box 10
		bodyModel[89] = new ModelRendererTurbo(this, 590, 655, textureX, textureY); // Box 11
		bodyModel[90] = new ModelRendererTurbo(this, 95, 605, textureX, textureY); // Box 12
		bodyModel[91] = new ModelRendererTurbo(this, 0, 605, textureX, textureY); // Box 13
		bodyModel[92] = new ModelRendererTurbo(this, 297, 655, textureX, textureY); // Box 14
		bodyModel[93] = new ModelRendererTurbo(this, 196, 655, textureX, textureY); // Box 15
		bodyModel[94] = new ModelRendererTurbo(this, 395, 655, textureX, textureY); // Box 16
		bodyModel[95] = new ModelRendererTurbo(this, 492, 655, textureX, textureY); // Box 17
		bodyModel[96] = new ModelRendererTurbo(this, 95, 655, textureX, textureY); // Box 18
		bodyModel[97] = new ModelRendererTurbo(this, 0, 655, textureX, textureY); // Box 19
		bodyModel[98] = new ModelRendererTurbo(this, 424, 755, textureX, textureY); // Box 20
		bodyModel[99] = new ModelRendererTurbo(this, 543, 755, textureX, textureY); // Box 21
		bodyModel[100] = new ModelRendererTurbo(this, 224, 823, textureX, textureY); // Box 22
		bodyModel[101] = new ModelRendererTurbo(this, 645, 823, textureX, textureY); // Box 23
		bodyModel[102] = new ModelRendererTurbo(this, 682, 823, textureX, textureY); // Box 24
		bodyModel[103] = new ModelRendererTurbo(this, 288, 823, textureX, textureY); // Box 25
		bodyModel[104] = new ModelRendererTurbo(this, 359, 823, textureX, textureY); // Box 26
		bodyModel[105] = new ModelRendererTurbo(this, 24, 823, textureX, textureY); // Box 28
		bodyModel[106] = new ModelRendererTurbo(this, 70, 823, textureX, textureY); // Box 29
		bodyModel[107] = new ModelRendererTurbo(this, 421, 823, textureX, textureY); // Box 30
		bodyModel[108] = new ModelRendererTurbo(this, 125, 823, textureX, textureY); // Box 31
		bodyModel[109] = new ModelRendererTurbo(this, 498, 823, textureX, textureY); // Box 32
		bodyModel[110] = new ModelRendererTurbo(this, 177, 823, textureX, textureY); // Box 33
		bodyModel[111] = new ModelRendererTurbo(this, 572, 823, textureX, textureY); // Box 34
		bodyModel[112] = new ModelRendererTurbo(this, 224, 852, textureX, textureY); // Box 40
		bodyModel[113] = new ModelRendererTurbo(this, 645, 852, textureX, textureY); // Box 41
		bodyModel[114] = new ModelRendererTurbo(this, 682, 852, textureX, textureY); // Box 42
		bodyModel[115] = new ModelRendererTurbo(this, 288, 852, textureX, textureY); // Box 43
		bodyModel[116] = new ModelRendererTurbo(this, 359, 852, textureX, textureY); // Box 44
		bodyModel[117] = new ModelRendererTurbo(this, 24, 852, textureX, textureY); // Box 45
		bodyModel[118] = new ModelRendererTurbo(this, 70, 852, textureX, textureY); // Box 46
		bodyModel[119] = new ModelRendererTurbo(this, 421, 852, textureX, textureY); // Box 47
		bodyModel[120] = new ModelRendererTurbo(this, 125, 852, textureX, textureY); // Box 48
		bodyModel[121] = new ModelRendererTurbo(this, 498, 852, textureX, textureY); // Box 49
		bodyModel[122] = new ModelRendererTurbo(this, 177, 852, textureX, textureY); // Box 50
		bodyModel[123] = new ModelRendererTurbo(this, 572, 852, textureX, textureY); // Box 51
		bodyModel[124] = new ModelRendererTurbo(this, 714, 823, textureX, textureY); // Box 57
		bodyModel[125] = new ModelRendererTurbo(this, 751, 823, textureX, textureY); // Box 58
		bodyModel[126] = new ModelRendererTurbo(this, 714, 852, textureX, textureY); // Box 59
		bodyModel[127] = new ModelRendererTurbo(this, 751, 852, textureX, textureY); // Box 60
		bodyModel[128] = new ModelRendererTurbo(this, 1370, 605, textureX, textureY); // Box 61
		bodyModel[129] = new ModelRendererTurbo(this, 1215, 605, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 1060, 605, textureX, textureY); // Box 1
		bodyModel[131] = new ModelRendererTurbo(this, 908, 605, textureX, textureY); // Box 2
		bodyModel[132] = new ModelRendererTurbo(this, 768, 605, textureX, textureY); // Box 4
		bodyModel[133] = new ModelRendererTurbo(this, 1895, 605, textureX, textureY); // Box 5
		bodyModel[134] = new ModelRendererTurbo(this, 1798, 605, textureX, textureY); // Box 6
		bodyModel[135] = new ModelRendererTurbo(this, 1703, 605, textureX, textureY); // Box 7
		bodyModel[136] = new ModelRendererTurbo(this, 1605, 605, textureX, textureY); // Box 8
		bodyModel[137] = new ModelRendererTurbo(this, 1519, 605, textureX, textureY); // Box 9
		bodyModel[138] = new ModelRendererTurbo(this, 620, 755, textureX, textureY); // Box 22
		bodyModel[139] = new ModelRendererTurbo(this, 785, 823, textureX, textureY); // Box 23
		bodyModel[140] = new ModelRendererTurbo(this, 837, 823, textureX, textureY); // Box 24
		bodyModel[141] = new ModelRendererTurbo(this, 895, 823, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 715, 755, textureX, textureY); // Box 2
		bodyModel[143] = new ModelRendererTurbo(this, 791, 755, textureX, textureY); // Box 3
		bodyModel[144] = new ModelRendererTurbo(this, 785, 852, textureX, textureY); // Box 11
		bodyModel[145] = new ModelRendererTurbo(this, 837, 852, textureX, textureY); // Box 12
		bodyModel[146] = new ModelRendererTurbo(this, 895, 852, textureX, textureY); // Box 13
		bodyModel[147] = new ModelRendererTurbo(this, 257, 103, textureX, textureY); // Box 1
		bodyModel[148] = new ModelRendererTurbo(this, 35, 886, textureX, textureY); // Box 21
		bodyModel[149] = new ModelRendererTurbo(this, 0, 886, textureX, textureY); // Box 22
		bodyModel[150] = new ModelRendererTurbo(this, 84, 886, textureX, textureY); // Box 23
		bodyModel[151] = new ModelRendererTurbo(this, 84, 886, textureX, textureY); // Box 24
		bodyModel[152] = new ModelRendererTurbo(this, 125, 903, textureX, textureY); // Box 25
		bodyModel[153] = new ModelRendererTurbo(this, 125, 886, textureX, textureY); // Box 26
		bodyModel[154] = new ModelRendererTurbo(this, 125, 886, textureX, textureY); // Box 27
		bodyModel[155] = new ModelRendererTurbo(this, 35, 886, textureX, textureY); // Box 35
		bodyModel[156] = new ModelRendererTurbo(this, 0, 886, textureX, textureY); // Box 36
		bodyModel[157] = new ModelRendererTurbo(this, 84, 886, textureX, textureY); // Box 37
		bodyModel[158] = new ModelRendererTurbo(this, 84, 886, textureX, textureY); // Box 38
		bodyModel[159] = new ModelRendererTurbo(this, 125, 903, textureX, textureY); // Box 39
		bodyModel[160] = new ModelRendererTurbo(this, 125, 886, textureX, textureY); // Box 40
		bodyModel[161] = new ModelRendererTurbo(this, 125, 886, textureX, textureY); // Box 41
		bodyModel[162] = new ModelRendererTurbo(this, 1307, 0, textureX, textureY); // Box 56
		bodyModel[163] = new ModelRendererTurbo(this, 1307, 0, textureX, textureY); // Box 57
		bodyModel[164] = new ModelRendererTurbo(this, 1307, 0, textureX, textureY); // Box 58
		bodyModel[165] = new ModelRendererTurbo(this, 1338, 0, textureX, textureY); // Box 59
		bodyModel[166] = new ModelRendererTurbo(this, 1338, 0, textureX, textureY); // Box 60
		bodyModel[167] = new ModelRendererTurbo(this, 1338, 0, textureX, textureY); // Box 63
		bodyModel[168] = new ModelRendererTurbo(this, 1239, 0, textureX, textureY); // Box 68
		bodyModel[169] = new ModelRendererTurbo(this, 1239, 0, textureX, textureY); // Box 69
		bodyModel[170] = new ModelRendererTurbo(this, 1239, 0, textureX, textureY); // Box 70
		bodyModel[171] = new ModelRendererTurbo(this, 1273, 0, textureX, textureY); // Box 71
		bodyModel[172] = new ModelRendererTurbo(this, 1273, 0, textureX, textureY); // Box 72
		bodyModel[173] = new ModelRendererTurbo(this, 1273, 0, textureX, textureY); // Box 73
		bodyModel[174] = new ModelRendererTurbo(this, 1273, 0, textureX, textureY); // Box 74
		bodyModel[175] = new ModelRendererTurbo(this, 1273, 0, textureX, textureY); // Box 75
		bodyModel[176] = new ModelRendererTurbo(this, 1273, 0, textureX, textureY); // Box 76
		bodyModel[177] = new ModelRendererTurbo(this, 1273, 0, textureX, textureY); // Box 77
		bodyModel[178] = new ModelRendererTurbo(this, 1273, 0, textureX, textureY); // Box 78
		bodyModel[179] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 123
		bodyModel[180] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 124
		bodyModel[181] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 125
		bodyModel[182] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 126
		bodyModel[183] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 127
		bodyModel[184] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 135
		bodyModel[186] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 136
		bodyModel[187] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 137
		bodyModel[188] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 138
		bodyModel[189] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 139
		bodyModel[190] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 141
		bodyModel[191] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 142
		bodyModel[192] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 143
		bodyModel[193] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 144
		bodyModel[194] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 145
		bodyModel[195] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 146
		bodyModel[196] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 147
		bodyModel[197] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 148
		bodyModel[198] = new ModelRendererTurbo(this, 529, 0, textureX, textureY); // Box 149
		bodyModel[199] = new ModelRendererTurbo(this, 597, 0, textureX, textureY); // Box 150
		bodyModel[200] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 161
		bodyModel[201] = new ModelRendererTurbo(this, 421, 0, textureX, textureY); // Box 162
		bodyModel[202] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 163
		bodyModel[203] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 164
		bodyModel[204] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 165
		bodyModel[205] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 166
		bodyModel[206] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 167
		bodyModel[207] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 168
		bodyModel[208] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 169
		bodyModel[209] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 170
		bodyModel[210] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 171
		bodyModel[211] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 172
		bodyModel[212] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 173
		bodyModel[213] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 174
		bodyModel[214] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 175
		bodyModel[215] = new ModelRendererTurbo(this, 461, 0, textureX, textureY); // Box 176
		bodyModel[216] = new ModelRendererTurbo(this, 529, 0, textureX, textureY); // Box 177
		bodyModel[217] = new ModelRendererTurbo(this, 597, 0, textureX, textureY); // Box 178
		bodyModel[218] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 189
		bodyModel[219] = new ModelRendererTurbo(this, 421, 0, textureX, textureY); // Box 190
		bodyModel[220] = new ModelRendererTurbo(this, 206, 0, textureX, textureY); // Box 191
		bodyModel[221] = new ModelRendererTurbo(this, 527, 252, textureX, textureY); // Box 192
		bodyModel[222] = new ModelRendererTurbo(this, 527, 252, textureX, textureY); // Box 193
		bodyModel[223] = new ModelRendererTurbo(this, 527, 252, textureX, textureY); // Box 194
		bodyModel[224] = new ModelRendererTurbo(this, 527, 252, textureX, textureY); // Box 195
		bodyModel[225] = new ModelRendererTurbo(this, 583, 252, textureX, textureY); // Box 212
		bodyModel[226] = new ModelRendererTurbo(this, 612, 252, textureX, textureY); // Box 214
		bodyModel[227] = new ModelRendererTurbo(this, 612, 252, textureX, textureY); // Box 215
		bodyModel[228] = new ModelRendererTurbo(this, 583, 252, textureX, textureY); // Box 216
		bodyModel[229] = new ModelRendererTurbo(this, 612, 252, textureX, textureY); // Box 217
		bodyModel[230] = new ModelRendererTurbo(this, 583, 252, textureX, textureY); // Box 218
		bodyModel[231] = new ModelRendererTurbo(this, 612, 252, textureX, textureY); // Box 219
		bodyModel[232] = new ModelRendererTurbo(this, 583, 252, textureX, textureY); // Box 220
		bodyModel[233] = new ModelRendererTurbo(this, 527, 220, textureX, textureY); // Box 221
		bodyModel[234] = new ModelRendererTurbo(this, 527, 220, textureX, textureY); // Box 237
		bodyModel[235] = new ModelRendererTurbo(this, 527, 220, textureX, textureY); // Box 238
		bodyModel[236] = new ModelRendererTurbo(this, 527, 220, textureX, textureY); // Box 239
		bodyModel[237] = new ModelRendererTurbo(this, 583, 220, textureX, textureY); // Box 260
		bodyModel[238] = new ModelRendererTurbo(this, 583, 220, textureX, textureY); // Box 261
		bodyModel[239] = new ModelRendererTurbo(this, 583, 220, textureX, textureY); // Box 262
		bodyModel[240] = new ModelRendererTurbo(this, 583, 220, textureX, textureY); // Box 263
		bodyModel[241] = new ModelRendererTurbo(this, 612, 220, textureX, textureY); // Box 264
		bodyModel[242] = new ModelRendererTurbo(this, 612, 220, textureX, textureY); // Box 265
		bodyModel[243] = new ModelRendererTurbo(this, 612, 220, textureX, textureY); // Box 266
		bodyModel[244] = new ModelRendererTurbo(this, 612, 220, textureX, textureY); // Box 267
		bodyModel[245] = new ModelRendererTurbo(this, 417, 252, textureX, textureY); // Box 268
		bodyModel[246] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 269
		bodyModel[247] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 270
		bodyModel[248] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 271
		bodyModel[249] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 272
		bodyModel[250] = new ModelRendererTurbo(this, 472, 252, textureX, textureY); // Box 273
		bodyModel[251] = new ModelRendererTurbo(this, 501, 252, textureX, textureY); // Box 274
		bodyModel[252] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 275
		bodyModel[253] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 276
		bodyModel[254] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 277
		bodyModel[255] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 278
		bodyModel[256] = new ModelRendererTurbo(this, 417, 220, textureX, textureY); // Box 279
		bodyModel[257] = new ModelRendererTurbo(this, 472, 220, textureX, textureY); // Box 280
		bodyModel[258] = new ModelRendererTurbo(this, 501, 220, textureX, textureY); // Box 281
		bodyModel[259] = new ModelRendererTurbo(this, 55, 0, textureX, textureY); // Box 283
		bodyModel[260] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Box 284
		bodyModel[261] = new ModelRendererTurbo(this, 651, 220, textureX, textureY); // Box 288
		bodyModel[262] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 289
		bodyModel[263] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 290
		bodyModel[264] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 291
		bodyModel[265] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 292
		bodyModel[266] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 293
		bodyModel[267] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 294
		bodyModel[268] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 295
		bodyModel[269] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 296
		bodyModel[270] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 297
		bodyModel[271] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 298
		bodyModel[272] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 299
		bodyModel[273] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 300
		bodyModel[274] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 301
		bodyModel[275] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 302
		bodyModel[276] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 303
		bodyModel[277] = new ModelRendererTurbo(this, 628, 220, textureX, textureY); // Box 304
		bodyModel[278] = new ModelRendererTurbo(this, 651, 220, textureX, textureY); // Box 305
		bodyModel[279] = new ModelRendererTurbo(this, 651, 220, textureX, textureY); // Box 306
		bodyModel[280] = new ModelRendererTurbo(this, 651, 220, textureX, textureY); // Box 307
		bodyModel[281] = new ModelRendererTurbo(this, 277, 0, textureX, textureY); // Box 0
		bodyModel[282] = new ModelRendererTurbo(this, 319, 0, textureX, textureY); // Box 1
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F); // Box 25
		bodyModel[0].setRotationPoint(-72F, -19F, -25F);
		
		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[1].setRotationPoint(-72F, -20F, -25F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
		bodyModel[2].setRotationPoint(-72F, -20F, 24F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, -1F); // Box 28
		bodyModel[3].setRotationPoint(-72F, -19F, 23F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 41
		bodyModel[4].setRotationPoint(-73F, -4F, -15F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 42
		bodyModel[5].setRotationPoint(-73F, -4F, -19F);
		
		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 43
		bodyModel[6].setRotationPoint(-73F, -4F, -23F);
		
		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, -2F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, -2F, 0F, 0F); // Box 48
		bodyModel[7].setRotationPoint(-92F, -20F, 9F);
		
		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 57
		bodyModel[8].setRotationPoint(-73F, -4F, 0F);
		
		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 58
		bodyModel[9].setRotationPoint(-73F, -4F, 15F);
		
		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F); // Box 59
		bodyModel[10].setRotationPoint(-73F, -4F, 19F);
		
		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 14, 1, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[11].setRotationPoint(-80F, -37F, -6F);
		
		bodyModel[12].addShapeBox(0F, 0F, 0F, 22, 14, 1, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[12].setRotationPoint(-80F, -37F, 5F);
		
		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, -4F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[13].setRotationPoint(-56F, -38F, -21F);
		
		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[14].setRotationPoint(-57F, -38F, -16F);
		
		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[15].setRotationPoint(-58F, -38F, -11F);
		
		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[16].setRotationPoint(-58F, -38F, -6F);
		
		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[17].setRotationPoint(-55F, -39F, -6F);
		
		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[18].setRotationPoint(-52F, -40F, -6F);
		
		bodyModel[19].addShapeBox(0F, 0F, 0F, 20, 17, 6, 0F, -17F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -17F, 0F, -5F, 1F, 0F, -4F, -17F, 0F, -5F, -17F, 0F, 0F, 0F, -1F, -1F); // Box 70
		bodyModel[19].setRotationPoint(-71F, -36F, 19F);
		
		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 71
		bodyModel[20].setRotationPoint(-56F, -38F, 16F);
		
		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Box 72
		bodyModel[21].setRotationPoint(-57F, -38F, 11F);
		
		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 73
		bodyModel[22].setRotationPoint(-58F, -38F, 6F);
		
		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 9, 3, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F); // Box 74
		bodyModel[23].setRotationPoint(-72F, -19F, -26F);
		
		bodyModel[24].addShapeBox(0F, 0F, 0F, 17, 8, 4, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, -4F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, -4F, 0F); // Box 75
		bodyModel[24].setRotationPoint(-72F, -12F, -26F);
		
		bodyModel[25].addShapeBox(0F, 0F, 0F, 15, 4, 5, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 76
		bodyModel[25].setRotationPoint(-73F, -8F, -23F);
		
		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 9, 3, 0F, -4F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 77
		bodyModel[26].setRotationPoint(-72F, -19F, 23F);
		
		bodyModel[27].addShapeBox(0F, 0F, 0F, 17, 8, 4, 0F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, -4F, -3F); // Box 78
		bodyModel[27].setRotationPoint(-72F, -12F, 22F);
		
		bodyModel[28].addShapeBox(0F, 0F, 0F, 15, 4, 5, 0F, -1F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 79
		bodyModel[28].setRotationPoint(-73F, -8F, 18F);
		
		bodyModel[29].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[29].setRotationPoint(-55F, -19F, -26F);
		
		bodyModel[30].addShapeBox(0F, 0F, 0F, 22, 6, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[30].setRotationPoint(-58F, -10F, -26F);
		
		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 15, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 82
		bodyModel[31].setRotationPoint(-44F, -36F, -26F);
		
		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[32].setRotationPoint(-44F, -21F, -26F);
		
		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[33].setRotationPoint(-46F, -21F, -26F);
		
		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 85
		bodyModel[34].setRotationPoint(-52F, -38F, -22F);
		
		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 22, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[35].setRotationPoint(-44F, -38F, -22F);
		
		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[36].setRotationPoint(-44F, -40F, -21F);
		
		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[37].setRotationPoint(-44F, -40F, -12F);
		
		bodyModel[38].addShapeBox(0F, 0F, 0F, 22, 4, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[38].setRotationPoint(-58F, -4F, -19F);
		
		bodyModel[39].addShapeBox(0F, 0F, 0F, 22, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[39].setRotationPoint(-58F, -4F, -23F);
		
		bodyModel[40].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[40].setRotationPoint(-55F, -19F, 25F);
		
		bodyModel[41].addShapeBox(0F, 0F, 0F, 22, 6, 4, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 97
		bodyModel[41].setRotationPoint(-58F, -10F, 22F);
		
		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[42].setRotationPoint(-44F, -36F, 21F);
		
		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[43].setRotationPoint(-44F, -21F, 25F);
		
		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[44].setRotationPoint(-46F, -21F, 25F);
		
		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 101
		bodyModel[45].setRotationPoint(-52F, -38F, 19F);
		
		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[46].setRotationPoint(-44F, -38F, 0F);
		
		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 103
		bodyModel[47].setRotationPoint(-44F, -40F, 12F);
		
		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[48].setRotationPoint(-44F, -40F, 0F);
		
		bodyModel[49].addShapeBox(0F, 0F, 0F, 22, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 105
		bodyModel[49].setRotationPoint(-58F, -4F, 19F);
		
		bodyModel[50].addShapeBox(0F, 0F, 0F, 19, 4, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[50].setRotationPoint(-36F, -4F, -19F);
		
		bodyModel[51].addShapeBox(0F, 0F, 0F, 19, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 108
		bodyModel[51].setRotationPoint(-36F, -4F, 19F);
		
		bodyModel[52].addShapeBox(0F, 0F, 0F, 19, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[52].setRotationPoint(-36F, -4F, -23F);
		
		bodyModel[53].addShapeBox(0F, 0F, 0F, 19, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[53].setRotationPoint(-36F, -10F, -26F);
		
		bodyModel[54].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[54].setRotationPoint(-36F, -19F, -26F);
		
		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[55].setRotationPoint(-24F, -21F, -26F);
		
		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 113
		bodyModel[56].setRotationPoint(-24F, -36F, -26F);
		
		bodyModel[57].addShapeBox(0F, 0F, 0F, 19, 2, 22, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[57].setRotationPoint(-36F, -38F, -22F);
		
		bodyModel[58].addShapeBox(0F, 0F, 0F, 19, 2, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[58].setRotationPoint(-36F, -40F, -21F);
		
		bodyModel[59].addShapeBox(0F, 0F, 0F, 35, 2, 22, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[59].setRotationPoint(-17F, -38F, -22F);
		
		bodyModel[60].addShapeBox(0F, 0F, 0F, 35, 2, 21, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[60].setRotationPoint(-17F, -40F, -21F);
		
		bodyModel[61].addShapeBox(0F, 0F, 0F, 35, 4, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[61].setRotationPoint(-17F, -4F, -19F);
		
		bodyModel[62].addShapeBox(0F, 0F, 0F, 35, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[62].setRotationPoint(-17F, -4F, -23F);
		
		bodyModel[63].addShapeBox(0F, 0F, 0F, 35, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 120
		bodyModel[63].setRotationPoint(-17F, -4F, 19F);
		
		bodyModel[64].addShapeBox(0F, 0F, 0F, 19, 6, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 123
		bodyModel[64].setRotationPoint(-36F, -10F, 22F);
		
		bodyModel[65].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[65].setRotationPoint(-36F, -19F, 25F);
		
		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[66].setRotationPoint(-24F, -21F, 25F);
		
		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[67].setRotationPoint(-24F, -36F, 21F);
		
		bodyModel[68].addShapeBox(0F, 0F, 0F, 19, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[68].setRotationPoint(-36F, -38F, 0F);
		
		bodyModel[69].addShapeBox(0F, 0F, 0F, 19, 2, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[69].setRotationPoint(-36F, -40F, 0F);
		
		bodyModel[70].addShapeBox(0F, 0F, 0F, 35, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[70].setRotationPoint(-17F, -38F, 0F);
		
		bodyModel[71].addShapeBox(0F, 0F, 0F, 35, 2, 21, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[71].setRotationPoint(-17F, -40F, 0F);
		
		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[72].setRotationPoint(-45F, -41F, -4F);
		
		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 4, 20, 0F, 0F, -3F, -7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -7F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F); // Box 134
		bodyModel[73].setRotationPoint(-43F, -44F, -10F);
		
		bodyModel[74].addShapeBox(0F, 0F, 0F, 13, 7, 32, 0F, 0F, -3F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 135
		bodyModel[74].setRotationPoint(-36F, -47F, -16F);
		
		bodyModel[75].addShapeBox(0F, 0F, 0F, 19, 11, 38, 0F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 136
		bodyModel[75].setRotationPoint(-23F, -50F, -19F);
		
		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 11, 38, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[76].setRotationPoint(-4F, -50F, -19F);
		
		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[77].setRotationPoint(-43F, -10F, -25F);
		
		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 11, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[78].setRotationPoint(-43F, -21F, -25F);
		
		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 15, 13, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[79].setRotationPoint(-43F, -36F, -25F);
		
		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 153
		bodyModel[80].setRotationPoint(-43F, -10F, 12F);
		
		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 11, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[81].setRotationPoint(-43F, -21F, 12F);
		
		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 15, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[82].setRotationPoint(-43F, -36F, 12F);
		
		bodyModel[83].addShapeBox(0F, 0F, 0F, 19, 16, 26, 0F, 0F, -2F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[83].setRotationPoint(18F, -36F, -26F);
		
		bodyModel[84].addShapeBox(0F, 0F, 0F, 19, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[84].setRotationPoint(18F, -36F, -23F);
		
		bodyModel[85].addShapeBox(0F, 0F, 0F, 19, 12, 26, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[85].setRotationPoint(18F, -22F, -26F);
		
		bodyModel[86].addShapeBox(0F, 0F, 0F, 19, 6, 26, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[86].setRotationPoint(18F, -10F, -26F);
		
		bodyModel[87].addShapeBox(0F, 0F, 0F, 19, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[87].setRotationPoint(18F, -4F, -23F);
		
		bodyModel[88].addShapeBox(0F, 0F, 0F, 19, 4, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[88].setRotationPoint(18F, -4F, -19F);
		
		bodyModel[89].addShapeBox(0F, 0F, 0F, 19, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 11
		bodyModel[89].setRotationPoint(18F, -4F, 19F);
		
		bodyModel[90].addShapeBox(0F, 0F, 0F, 19, 2, 22, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[90].setRotationPoint(18F, -38F, -22F);
		
		bodyModel[91].addShapeBox(0F, 0F, 0F, 19, 1, 21, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[91].setRotationPoint(18F, -39F, -21F);
		
		bodyModel[92].addShapeBox(0F, 0F, 0F, 19, 16, 26, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 14
		bodyModel[92].setRotationPoint(18F, -36F, 0F);
		
		bodyModel[93].addShapeBox(0F, 0F, 0F, 19, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 15
		bodyModel[93].setRotationPoint(18F, -36F, 0F);
		
		bodyModel[94].addShapeBox(0F, 0F, 0F, 19, 12, 26, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 16
		bodyModel[94].setRotationPoint(18F, -22F, 0F);
		
		bodyModel[95].addShapeBox(0F, 0F, 0F, 19, 6, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 17
		bodyModel[95].setRotationPoint(18F, -10F, 0F);
		
		bodyModel[96].addShapeBox(0F, 0F, 0F, 19, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 18
		bodyModel[96].setRotationPoint(18F, -38F, 0F);
		
		bodyModel[97].addShapeBox(0F, 0F, 0F, 19, 1, 21, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 19
		bodyModel[97].setRotationPoint(18F, -39F, 0F);
		
		bodyModel[98].addShapeBox(0F, 0F, 0F, 22, 11, 34, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F); // Box 20
		bodyModel[98].setRotationPoint(8F, -50F, -17F);
		
		bodyModel[99].addShapeBox(0F, 0F, 0F, 7, 12, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[99].setRotationPoint(30F, -50F, -13F);
		
		bodyModel[100].addShapeBox(0F, 0F, 0F, 22, 13, 7, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 22
		bodyModel[100].setRotationPoint(8F, -50F, -20F);
		
		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 12, 7, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[101].setRotationPoint(30F, -50F, -20F);
		
		bodyModel[102].addShapeBox(0F, 0F, 0F, 9, 11, 4, 0F, -3F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 24
		bodyModel[102].setRotationPoint(30F, -49F, -24F);
		
		bodyModel[103].addShapeBox(0F, 0F, 0F, 25, 3, 7, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F); // Box 25
		bodyModel[103].setRotationPoint(8F, -50F, -24F);
		
		bodyModel[104].addShapeBox(0F, 0F, 0F, 25, 4, 2, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 26
		bodyModel[104].setRotationPoint(8F, -48F, -26F);
		
		bodyModel[105].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[105].setRotationPoint(-5F, -50F, -24F);
		
		bodyModel[106].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[106].setRotationPoint(-5F, -47F, -26F);
		
		bodyModel[107].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[107].setRotationPoint(8F, -47F, -26F);
		
		bodyModel[108].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[108].setRotationPoint(-5F, -44F, -26F);
		
		bodyModel[109].addShapeBox(0F, 0F, 0F, 25, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 32
		bodyModel[109].setRotationPoint(8F, -44F, -26F);
		
		bodyModel[110].addShapeBox(0F, 0F, 0F, 13, 3, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 33
		bodyModel[110].setRotationPoint(-5F, -41F, -25F);
		
		bodyModel[111].addShapeBox(0F, 0F, 0F, 25, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, -1F, -6F, 2F, 1F, 0F, -1F, 0F); // Box 34
		bodyModel[111].setRotationPoint(8F, -41F, -25F);
		
		bodyModel[112].addShapeBox(0F, 0F, 0F, 22, 13, 7, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 40
		bodyModel[112].setRotationPoint(8F, -50F, 13F);
		
		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 12, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 41
		bodyModel[113].setRotationPoint(30F, -50F, 13F);
		
		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 11, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -3F, -1F, 0F); // Box 42
		bodyModel[114].setRotationPoint(30F, -49F, 20F);
		
		bodyModel[115].addShapeBox(0F, 0F, 0F, 25, 3, 7, 0F, 0F, 0F, 0F, -3F, -1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[115].setRotationPoint(8F, -50F, 17F);
		
		bodyModel[116].addShapeBox(0F, 0F, 0F, 25, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 44
		bodyModel[116].setRotationPoint(8F, -48F, 24F);
		
		bodyModel[117].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 45
		bodyModel[117].setRotationPoint(-5F, -50F, 17F);
		
		bodyModel[118].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 46
		bodyModel[118].setRotationPoint(-5F, -47F, 17F);
		
		bodyModel[119].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[119].setRotationPoint(8F, -47F, 17F);
		
		bodyModel[120].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 48
		bodyModel[120].setRotationPoint(-5F, -44F, 17F);
		
		bodyModel[121].addShapeBox(0F, 0F, 0F, 25, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -1F); // Box 49
		bodyModel[121].setRotationPoint(8F, -44F, 17F);
		
		bodyModel[122].addShapeBox(0F, 0F, 0F, 13, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, -4F); // Box 50
		bodyModel[122].setRotationPoint(-5F, -41F, 17F);
		
		bodyModel[123].addShapeBox(0F, 0F, 0F, 25, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, 2F, 1F, 0F, -2F, -1F, 0F, -4F, 0F); // Box 51
		bodyModel[123].setRotationPoint(8F, -41F, 17F);
		
		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, -2F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[124].setRotationPoint(33F, -48F, -29F);
		
		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2F, 0F, -1F, -2F, -3F, 0F, 0F, 1F, 0F, 2F); // Box 58
		bodyModel[125].setRotationPoint(33F, -43F, -29F);
		
		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 59
		bodyModel[126].setRotationPoint(33F, -48F, 24F);
		
		bodyModel[127].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 2F, -3F, 0F, 0F, 0F, -1F, -2F, -2F, -1F, -2F); // Box 60
		bodyModel[127].setRotationPoint(33F, -43F, 24F);
		
		bodyModel[128].addShapeBox(0F, 0F, 0F, 25, 5, 44, 0F, 0F, -1F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, -3F); // Box 61
		bodyModel[128].setRotationPoint(37F, -5F, -22F);
		
		bodyModel[129].addShapeBox(0F, 0F, 0F, 25, 7, 48, 0F, 0F, -1F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -1F, -10F, 0F, -1F, -10F, 0F, 0F, -2F); // Box 0
		bodyModel[129].setRotationPoint(37F, -11F, -24F);
		
		bodyModel[130].addShapeBox(0F, 0F, 0F, 25, 12, 48, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, 0F); // Box 1
		bodyModel[130].setRotationPoint(37F, -22F, -24F);
		
		bodyModel[131].addShapeBox(0F, 0F, 0F, 25, 14, 48, 0F, 0F, 0F, -3F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 2
		bodyModel[131].setRotationPoint(37F, -36F, -24F);
		
		bodyModel[132].addShapeBox(0F, 0F, 0F, 25, 4, 42, 0F, 0F, 0F, -2F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2F, 0F); // Box 4
		bodyModel[132].setRotationPoint(37F, -38F, -21F);
		
		bodyModel[133].addShapeBox(0F, 0F, 0F, 12, 5, 28, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -4F); // Box 5
		bodyModel[133].setRotationPoint(62F, -6F, -14F);
		
		bodyModel[134].addShapeBox(0F, 0F, 0F, 12, 6, 32, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -2F); // Box 6
		bodyModel[134].setRotationPoint(62F, -11F, -16F);
		
		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 11, 32, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 7
		bodyModel[135].setRotationPoint(62F, -22F, -16F);
		
		bodyModel[136].addShapeBox(0F, 0F, 0F, 12, 12, 32, 0F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 8
		bodyModel[136].setRotationPoint(62F, -34F, -16F);
		
		bodyModel[137].addShapeBox(0F, 0F, 0F, 12, 4, 26, 0F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F); // Box 9
		bodyModel[137].setRotationPoint(62F, -36F, -13F);
		
		bodyModel[138].addShapeBox(0F, 0F, 0F, 15, 14, 26, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 22
		bodyModel[138].setRotationPoint(37F, -50F, -13F);
		
		bodyModel[139].addShapeBox(0F, 0F, 0F, 15, 14, 7, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 23
		bodyModel[139].setRotationPoint(37F, -50F, -20F);
		
		bodyModel[140].addShapeBox(0F, 0F, 0F, 15, 13, 11, 0F, -2F, -2F, -2F, 0F, -3F, -2F, 0F, -2F, -4F, 0F, -1F, -5F, -2F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 1F, 3F, 1F, -1F); // Box 24
		bodyModel[140].setRotationPoint(37F, -50F, -26F);
		
		bodyModel[141].addShapeBox(0F, 0F, 0F, 13, 10, 5, 0F, -3F, -5F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[141].setRotationPoint(39F, -48F, -29F);
		
		bodyModel[142].addShapeBox(0F, 0F, 0F, 10, 14, 24, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 2
		bodyModel[142].setRotationPoint(52F, -48F, -12F);
		
		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 11, 20, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 3
		bodyModel[143].setRotationPoint(62F, -45F, -10F);
		
		bodyModel[144].addShapeBox(0F, 0F, 0F, 15, 14, 7, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 11
		bodyModel[144].setRotationPoint(37F, -50F, 13F);
		
		bodyModel[145].addShapeBox(0F, 0F, 0F, 15, 13, 11, 0F, 0F, -1F, -5F, 0F, -2F, -4F, 0F, -3F, -2F, -2F, -2F, -2F, 3F, 1F, -1F, 0F, 1F, 1F, 0F, -1F, -2F, -2F, -1F, -2F); // Box 12
		bodyModel[145].setRotationPoint(37F, -50F, 15F);
		
		bodyModel[146].addShapeBox(0F, 0F, 0F, 13, 10, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -1F, -2F); // Box 13
		bodyModel[146].setRotationPoint(39F, -48F, 24F);
		
		bodyModel[147].addShapeBox(0F, 0F, 0F, 20, 17, 6, 0F, -17F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -1F, -17F, 0F, 0F, 0F, -1F, -1F, -17F, 0F, 0F, -17F, 0F, -5F, 1F, 0F, -4F); // Box 1
		bodyModel[147].setRotationPoint(-71F, -36F, -25F);
		
		bodyModel[148].addShapeBox(0F, 0F, 0F, 13, 9, 9, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, -2F); // Box 21
		bodyModel[148].setRotationPoint(-49F, -8F, -29F);
		
		bodyModel[149].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 22
		bodyModel[149].setRotationPoint(-55F, -8F, -29F);
		
		bodyModel[150].addShapeBox(0F, 0F, 0F, 15, 9, 2, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 23
		bodyModel[150].setRotationPoint(-36F, -4F, -26F);
		
		bodyModel[151].addShapeBox(0F, 0F, 0F, 5, 13, 3, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, -3F, -3F, 0F, -1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -1F, -3F, -1F); // Box 24
		bodyModel[151].setRotationPoint(-24F, -8F, -26F);
		
		bodyModel[152].addShapeBox(0F, 0F, 0F, 14, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[152].setRotationPoint(-29.5F, 1F, -31F);
		
		bodyModel[153].addShapeBox(0F, 0F, 0F, 14, 5, 5, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[153].setRotationPoint(-29.5F, -4F, -31F);
		
		bodyModel[154].addShapeBox(0F, 0F, 0F, 14, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 27
		bodyModel[154].setRotationPoint(-29.5F, 5F, -31F);
		
		bodyModel[155].addShapeBox(0F, 0F, 0F, 13, 9, 9, 0F, 0F, 0F, -5F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F); // Box 35
		bodyModel[155].setRotationPoint(-49F, -8F, 20F);
		
		bodyModel[156].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 36
		bodyModel[156].setRotationPoint(-55F, -8F, 22F);
		
		bodyModel[157].addShapeBox(0F, 0F, 0F, 15, 9, 2, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 37
		bodyModel[157].setRotationPoint(-36F, -4F, 24F);
		
		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 13, 3, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -1F, -3F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, -3F, 0F); // Box 38
		bodyModel[158].setRotationPoint(-24F, -8F, 23F);
		
		bodyModel[159].addShapeBox(0F, 0F, 0F, 14, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[159].setRotationPoint(-29.5F, 1F, 26F);
		
		bodyModel[160].addShapeBox(0F, 0F, 0F, 14, 5, 5, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[160].setRotationPoint(-29.5F, -4F, 26F);
		
		bodyModel[161].addShapeBox(0F, 0F, 0F, 14, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 41
		bodyModel[161].setRotationPoint(-29.5F, 5F, 26F);
		
		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[162].setRotationPoint(-1F, -55F, -1F);
		
		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 57
		bodyModel[163].setRotationPoint(-2F, -55F, -1F);
		
		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 58
		bodyModel[164].setRotationPoint(1F, -55F, -1F);
		
		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[165].setRotationPoint(-1F, -59F, -1.5F);
		
		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 60
		bodyModel[166].setRotationPoint(-3F, -59F, -1.5F);
		
		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 63
		bodyModel[167].setRotationPoint(1F, -59F, -1.5F);
		
		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 68
		bodyModel[168].setRotationPoint(-4.5F, -51F, -3.5F);
		
		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 69
		bodyModel[169].setRotationPoint(1.5F, -51F, -3.5F);
		
		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[170].setRotationPoint(-1.5F, -51F, -3.5F);
		
		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[171].setRotationPoint(-3.5F, -59F, -0.5F);
		
		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[172].setRotationPoint(-3.5F, -59F, 1.5F);
		
		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[173].setRotationPoint(2.5F, -59F, -0.5F);
		
		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[174].setRotationPoint(2.5F, -59F, 1.5F);
		
		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[175].setRotationPoint(-1.5F, -59F, -2.5F);
		
		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[176].setRotationPoint(0.5F, -59F, -2.5F);
		
		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[177].setRotationPoint(0.5F, -59F, 3.5F);
		
		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[178].setRotationPoint(-1.5F, -59F, 3.5F);
		
		bodyModel[179].addShapeBox(0F, 0F, 0F, 14, 8, 12, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[179].setRotationPoint(-79F, -27F, -6F);
		
		bodyModel[180].addShapeBox(0F, 0F, 0F, 14, 8, 7, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[180].setRotationPoint(-79F, -27F, -13F);
		
		bodyModel[181].addShapeBox(0F, 0F, 0F, 11, 8, 4, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[181].setRotationPoint(-76F, -27F, -17F);
		
		bodyModel[182].addShapeBox(0F, 0F, 0F, 14, 8, 7, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 126
		bodyModel[182].setRotationPoint(-79F, -27F, 6F);
		
		bodyModel[183].addShapeBox(0F, 0F, 0F, 11, 8, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 127
		bodyModel[183].setRotationPoint(-76F, -27F, 13F);
		
		bodyModel[184].addShapeBox(0F, 0F, 0F, 15, 15, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[184].setRotationPoint(-79F, -19F, -6F);
		
		bodyModel[185].addShapeBox(0F, 0F, 0F, 18, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[185].setRotationPoint(-61F, -10F, -20F);
		
		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 19, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[186].setRotationPoint(-45F, -26F, -20F);
		
		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[187].setRotationPoint(-45F, -30F, -20F);
		
		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[188].setRotationPoint(-45F, -34F, -15.5F);
		
		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[189].setRotationPoint(-45F, -35F, -15.5F);
		
		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[190].setRotationPoint(-48F, -18F, -7F);
		
		bodyModel[191].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[191].setRotationPoint(-55F, -18F, -7F);
		
		bodyModel[192].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[192].setRotationPoint(-61F, -14F, -7F);
		
		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[193].setRotationPoint(-48F, -26F, -7F);
		
		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[194].setRotationPoint(-48F, -26F, -20F);
		
		bodyModel[195].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[195].setRotationPoint(-61F, -14F, -20F);
		
		bodyModel[196].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[196].setRotationPoint(-55F, -18F, -20F);
		
		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[197].setRotationPoint(-48F, -18F, -20F);
		
		bodyModel[198].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[198].setRotationPoint(-61F, -11F, -19F);
		
		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 18, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[199].setRotationPoint(-46F, -26F, -19F);
		
		bodyModel[200].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[200].setRotationPoint(-73F, -9F, -15F);
		
		bodyModel[201].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[201].setRotationPoint(-65F, -9F, -13.5F);
		bodyModel[201].rotateAngleZ = 0.95993109F;
		
		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[202].setRotationPoint(-73F, -14F, -15F);
		
		bodyModel[203].addShapeBox(0F, 0F, 0F, 18, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[203].setRotationPoint(-61F, -10F, 6F);
		
		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 19, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[204].setRotationPoint(-45F, -26F, 6F);
		
		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[205].setRotationPoint(-45F, -30F, 6F);
		
		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[206].setRotationPoint(-45F, -34F, 10.5F);
		
		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[207].setRotationPoint(-45F, -35F, 10.5F);
		
		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[208].setRotationPoint(-48F, -18F, 6F);
		
		bodyModel[209].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[209].setRotationPoint(-55F, -18F, 6F);
		
		bodyModel[210].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[210].setRotationPoint(-61F, -14F, 6F);
		
		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[211].setRotationPoint(-48F, -26F, 6F);
		
		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[212].setRotationPoint(-48F, -26F, 19F);
		
		bodyModel[213].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[213].setRotationPoint(-61F, -14F, 19F);
		
		bodyModel[214].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[214].setRotationPoint(-55F, -18F, 19F);
		
		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[215].setRotationPoint(-48F, -18F, 19F);
		
		bodyModel[216].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[216].setRotationPoint(-61F, -11F, 7F);
		
		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 18, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[217].setRotationPoint(-46F, -26F, 7F);
		
		bodyModel[218].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[218].setRotationPoint(-73F, -9F, 11F);
		
		bodyModel[219].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[219].setRotationPoint(-65F, -9F, 12.5F);
		bodyModel[219].rotateAngleZ = 0.95993109F;
		
		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[220].setRotationPoint(-73F, -14F, 11F);
		
		bodyModel[221].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[221].setRotationPoint(3F, -12F, -21.5F);
		
		bodyModel[222].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[222].setRotationPoint(3F, -12F, -10.5F);
		
		bodyModel[223].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[223].setRotationPoint(3F, -12F, 11.5F);
		
		bodyModel[224].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[224].setRotationPoint(3F, -12F, 0.5F);
		
		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[225].setRotationPoint(17F, -27F, 11.5F);
		
		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[226].setRotationPoint(17F, -32F, 14F);
		
		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[227].setRotationPoint(17F, -32F, 3F);
		
		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[228].setRotationPoint(17F, -27F, 0.5F);
		
		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[229].setRotationPoint(17F, -32F, -8F);
		
		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[230].setRotationPoint(17F, -27F, -10.5F);
		
		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[231].setRotationPoint(17F, -32F, -19F);
		
		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[232].setRotationPoint(17F, -27F, -21.5F);
		
		bodyModel[233].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[233].setRotationPoint(-22F, -12F, 11.5F);
		
		bodyModel[234].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[234].setRotationPoint(-22F, -12F, 0.5F);
		
		bodyModel[235].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[235].setRotationPoint(-22F, -12F, -10.5F);
		
		bodyModel[236].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[236].setRotationPoint(-22F, -12F, -21.5F);
		
		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[237].setRotationPoint(-22F, -27F, -10.5F);
		
		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[238].setRotationPoint(-22F, -27F, 0.5F);
		
		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[239].setRotationPoint(-22F, -27F, 11.5F);
		
		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[240].setRotationPoint(-22F, -27F, -21.5F);
		
		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[241].setRotationPoint(-22F, -32F, -19F);
		
		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[242].setRotationPoint(-22F, -32F, -8F);
		
		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[243].setRotationPoint(-22F, -32F, 3F);
		
		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[244].setRotationPoint(-22F, -32F, 14F);
		
		bodyModel[245].addShapeBox(0F, 0F, 0F, 10, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[245].setRotationPoint(-35F, -12F, 5.5F);
		
		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[246].setRotationPoint(-35F, -11F, 5.5F);
		
		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[247].setRotationPoint(-26F, -11F, 5.5F);
		
		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[248].setRotationPoint(-26F, -11F, 19.5F);
		
		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[249].setRotationPoint(-35F, -11F, 19.5F);
		
		bodyModel[250].addShapeBox(0F, 0F, 0F, 10, 15, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[250].setRotationPoint(-35F, -27F, 5.5F);
		
		bodyModel[251].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[251].setRotationPoint(-32.5F, -32F, 5.5F);
		
		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[252].setRotationPoint(-35F, -11F, -20.5F);
		
		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[253].setRotationPoint(-35F, -11F, -6.5F);
		
		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[254].setRotationPoint(-26F, -11F, -6.5F);
		
		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[255].setRotationPoint(-26F, -11F, -20.5F);
		
		bodyModel[256].addShapeBox(0F, 0F, 0F, 10, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[256].setRotationPoint(-35F, -12F, -20.5F);
		
		bodyModel[257].addShapeBox(0F, 0F, 0F, 10, 15, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[257].setRotationPoint(-35F, -27F, -6.5F);
		
		bodyModel[258].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[258].setRotationPoint(-32.5F, -32F, -6.5F);
		
		bodyModel[259].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[259].setRotationPoint(-83F, -19F, -20F);
		
		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[260].setRotationPoint(-74F, -23F, -19F);
		
		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 43, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[261].setRotationPoint(-22F, -36F, -21F);
		
		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[262].setRotationPoint(-22F, -35F, -19F);
		
		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[263].setRotationPoint(-22F, -35F, -15F);
		
		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[264].setRotationPoint(-22F, -35F, -4F);
		
		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[265].setRotationPoint(-22F, -35F, -8F);
		
		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[266].setRotationPoint(-22F, -35F, 7F);
		
		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[267].setRotationPoint(-22F, -35F, 3F);
		
		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[268].setRotationPoint(-22F, -35F, 18F);
		
		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[269].setRotationPoint(-22F, -35F, 14F);
		
		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[270].setRotationPoint(17F, -35F, 18F);
		
		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[271].setRotationPoint(17F, -35F, 14F);
		
		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[272].setRotationPoint(17F, -35F, 7F);
		
		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[273].setRotationPoint(17F, -35F, 3F);
		
		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[274].setRotationPoint(17F, -35F, -4F);
		
		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[275].setRotationPoint(17F, -35F, -8F);
		
		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[276].setRotationPoint(17F, -35F, -15F);
		
		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[277].setRotationPoint(17F, -35F, -19F);
		
		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 43, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[278].setRotationPoint(17F, -36F, -21F);
		
		bodyModel[279].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[279].setRotationPoint(-21F, -36F, -20F);
		
		bodyModel[280].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[280].setRotationPoint(-21F, -36F, 19F);
		
		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 8, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[281].setRotationPoint(-65F, -27F, -17F);
		
		bodyModel[282].addShapeBox(0F, 0F, 0F, 20, 15, 12, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[282].setRotationPoint(-64F, -19F, -6F);
		
		
		noseModel = new ModelRendererTurbo[41];
		noseModel[0] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 0
		noseModel[1] = new ModelRendererTurbo(this, 238, 68, textureX, textureY); // Box 2
		noseModel[2] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 3
		noseModel[3] = new ModelRendererTurbo(this, 209, 68, textureX, textureY); // Box 4
		noseModel[4] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 5
		noseModel[5] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 6
		noseModel[6] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 15
		noseModel[7] = new ModelRendererTurbo(this, 127, 68, textureX, textureY); // Box 16
		noseModel[8] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 17
		noseModel[9] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 18
		noseModel[10] = new ModelRendererTurbo(this, 127, 84, textureX, textureY); // Box 19
		noseModel[11] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 20
		noseModel[12] = new ModelRendererTurbo(this, 84, 68, textureX, textureY); // Box 21
		noseModel[13] = new ModelRendererTurbo(this, 84, 84, textureX, textureY); // Box 22
		noseModel[14] = new ModelRendererTurbo(this, 65, 68, textureX, textureY); // Box 23
		noseModel[15] = new ModelRendererTurbo(this, 65, 84, textureX, textureY); // Box 24
		noseModel[16] = new ModelRendererTurbo(this, 316, 103, textureX, textureY); // Box 29
		noseModel[17] = new ModelRendererTurbo(this, 316, 132, textureX, textureY); // Box 30
		noseModel[18] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 32
		noseModel[19] = new ModelRendererTurbo(this, 266, 68, textureX, textureY); // Box 34
		noseModel[20] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 36
		noseModel[21] = new ModelRendererTurbo(this, 298, 68, textureX, textureY); // Box 37
		noseModel[22] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 38
		noseModel[23] = new ModelRendererTurbo(this, 327, 68, textureX, textureY); // Box 39
		noseModel[24] = new ModelRendererTurbo(this, 365, 68, textureX, textureY); // Box 40
		noseModel[25] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 44
		noseModel[26] = new ModelRendererTurbo(this, 238, 84, textureX, textureY); // Box 45
		noseModel[27] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 46
		noseModel[28] = new ModelRendererTurbo(this, 209, 84, textureX, textureY); // Box 47
		noseModel[29] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 49
		noseModel[30] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 50
		noseModel[31] = new ModelRendererTurbo(this, 266, 84, textureX, textureY); // Box 51
		noseModel[32] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 52
		noseModel[33] = new ModelRendererTurbo(this, 298, 84, textureX, textureY); // Box 53
		noseModel[34] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 54
		noseModel[35] = new ModelRendererTurbo(this, 327, 84, textureX, textureY); // Box 55
		noseModel[36] = new ModelRendererTurbo(this, 365, 68, textureX, textureY); // Box 56
		noseModel[37] = new ModelRendererTurbo(this, 177, 68, textureX, textureY); // Box 282
		noseModel[38] = new ModelRendererTurbo(this, 177, 84, textureX, textureY); // Box 285
		noseModel[39] = new ModelRendererTurbo(this, 58, 40, textureX, textureY); // Box 286
		noseModel[40] = new ModelRendererTurbo(this, 246, 0, textureX, textureY); // Box 287
		
		noseModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, -2F, -1F, 0F, 8F, -1F, 0F, 8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F); // Box 0
		noseModel[0].setRotationPoint(-96F, -17F, -9F);
		
		noseModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, -4F, -1F, 0F, 6F, -1F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 2
		noseModel[1].setRotationPoint(-95F, -16F, -15F);
		
		noseModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F, -3F, -1F, 0F, 6F, -1F, 0F, 6F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, -1F, 0F, 0F, -1F, 0F); // Box 3
		noseModel[2].setRotationPoint(-95F, -20F, -9F);
		
		noseModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, -4F, -1F, 0F, 5F, -1F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F, 5F, -1F, 0F, 0F, -1F, 0F); // Box 4
		noseModel[3].setRotationPoint(-94F, -19F, -15F);
		
		noseModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, -1F, 0F); // Box 5
		noseModel[4].setRotationPoint(-92F, -20F, -15F);
		
		noseModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, -3F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 6
		noseModel[5].setRotationPoint(-93F, -20F, -9F);
		
		noseModel[6].addShapeBox(0F, 0F, 0F, 14, 4, 9, 0F, -13F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F); // Box 15
		noseModel[6].setRotationPoint(-90F, -24F, -15F);
		
		noseModel[7].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F, -14F, -1F, -1F, 1F, -1F, -1F, -2F, 0F, 0F, -11F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -2F, -1F, 0F, 0F, -1F, -2F); // Box 16
		noseModel[7].setRotationPoint(-88F, -24F, -20F);
		
		noseModel[8].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F, -13F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -13F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		noseModel[8].setRotationPoint(-93F, -24F, -8F);
		
		noseModel[9].addShapeBox(0F, 0F, 0F, 14, 4, 9, 0F, -10F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -13F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F); // Box 18
		noseModel[9].setRotationPoint(-90F, -24F, 6F);
		
		noseModel[10].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F, -11F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, -1F, -14F, -1F, -1F, 0F, -1F, -2F, -2F, -1F, 0F, 0F, 0F, -1F, -5F, 0F, 0F); // Box 19
		noseModel[10].setRotationPoint(-88F, -24F, 13F);
		
		noseModel[11].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -13F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F); // Box 20
		noseModel[11].setRotationPoint(-93F, -24F, 0F);
		
		noseModel[12].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F, -12F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F); // Box 21
		noseModel[12].setRotationPoint(-83F, -23F, -23F);
		
		noseModel[13].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F, -9F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -12F, -1F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F); // Box 22
		noseModel[13].setRotationPoint(-83F, -23F, 19F);
		
		noseModel[14].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, -3F, -2F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		noseModel[14].setRotationPoint(-74F, -22F, -24F);
		
		noseModel[15].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 24
		noseModel[15].setRotationPoint(-74F, -22F, 23F);
		
		noseModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 29
		noseModel[16].setRotationPoint(-74F, -19F, -24F);
		
		noseModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 30
		noseModel[17].setRotationPoint(-74F, -19F, 23F);
		
		noseModel[18].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F, -1F, 0F, -1F, 7F, 0F, 1F, 7F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 7F, -1F, 1F, 7F, -1F, 0F, -2F, 0F, 0F); // Box 32
		noseModel[18].setRotationPoint(-96F, -13F, -10F);
		
		noseModel[19].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, -4F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, -2F, 0F, 0F, 0F, -5F, -1F, -1F, 5F, -1F, -1F, 5F, 0F, -2F, -3F, 0F, -1F); // Box 34
		noseModel[19].setRotationPoint(-95F, -13F, -16F);
		
		noseModel[20].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 36
		noseModel[20].setRotationPoint(-94F, -9F, -11F);
		
		noseModel[21].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, -1F, 0F, -7F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, -1F, -7F, 0F, -1F); // Box 37
		noseModel[21].setRotationPoint(-92F, -10F, -15F);
		
		noseModel[22].addShapeBox(0F, 0F, 0F, 14, 4, 15, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -14F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -14F, 0F, 0F); // Box 38
		noseModel[22].setRotationPoint(-87F, -5F, -15F);
		
		noseModel[23].addShapeBox(0F, 0F, 0F, 12, 5, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, -12F, -2F, -4F); // Box 39
		noseModel[23].setRotationPoint(-85F, -6F, -15F);
		
		noseModel[24].addShapeBox(0F, 0F, 0F, 12, 16, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		noseModel[24].setRotationPoint(-85F, -20F, -15F);
		
		noseModel[25].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F, -1F, 0F, 0F, 8F, 0F, 0F, 8F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -1F, 0F, 0F); // Box 44
		noseModel[25].setRotationPoint(-96F, -17F, 0F);
		
		noseModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -4F, 0F, 0F); // Box 45
		noseModel[26].setRotationPoint(-95F, -16F, 9F);
		
		noseModel[27].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 6F, -1F, 0F, 6F, 0F, 0F, -1F, 0F, 0F); // Box 46
		noseModel[27].setRotationPoint(-95F, -20F, 0F);
		
		noseModel[28].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 5F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 5F, -1F, 0F, 5F, 0F, 0F, -3F, 0F, 0F); // Box 47
		noseModel[28].setRotationPoint(-94F, -19F, 9F);
		
		noseModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -1F, -3F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, 0F, 5F, 0F, 0F, -1F, 0F, 0F); // Box 49
		noseModel[29].setRotationPoint(-93F, -20F, 0F);
		
		noseModel[30].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 1F, -4F, -1F, 0F); // Box 50
		noseModel[30].setRotationPoint(-96F, -13F, 0F);
		
		noseModel[31].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, 5F, 0F, -2F, 5F, 0F, -1F, -4F, 0F, -1F, -3F, 0F, -1F, 5F, 0F, -2F, 5F, -1F, -1F, -5F, -1F, -1F); // Box 51
		noseModel[31].setRotationPoint(-95F, -13F, 9F);
		
		noseModel[32].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -1F, 0F); // Box 52
		noseModel[32].setRotationPoint(-94F, -9F, 0F);
		
		noseModel[33].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, -1F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, -1F, 2F, 0F, -1F, 2F, -1F, 0F, -7F, -1F, 0F); // Box 53
		noseModel[33].setRotationPoint(-92F, -10F, 10F);
		
		noseModel[34].addShapeBox(0F, 0F, 0F, 14, 4, 15, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -14F, -2F, 0F); // Box 54
		noseModel[34].setRotationPoint(-87F, -5F, 0F);
		
		noseModel[35].addShapeBox(0F, 0F, 0F, 12, 5, 4, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, -12F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -5F, 0F); // Box 55
		noseModel[35].setRotationPoint(-85F, -6F, 11F);
		
		noseModel[36].addShapeBox(0F, 0F, 0F, 12, 16, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 56
		noseModel[36].setRotationPoint(-85F, -20F, 0F);
		
		noseModel[37].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		noseModel[37].setRotationPoint(-90F, -20F, -20F);
		
		noseModel[38].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F); // Box 285
		noseModel[38].setRotationPoint(-90F, -20F, 15F);
		
		noseModel[39].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, 0F, -1F, 0F); // Box 286
		noseModel[39].setRotationPoint(-83F, -19F, 15F);
		
		noseModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 287
		noseModel[40].setRotationPoint(-74F, -23F, 15F);
		
		
		tailModel = new ModelRendererTurbo[44];
		tailModel[0] = new ModelRendererTurbo(this, 859, 710, textureX, textureY); // Box 10
		tailModel[1] = new ModelRendererTurbo(this, 665, 710, textureX, textureY); // Box 11
		tailModel[2] = new ModelRendererTurbo(this, 474, 710, textureX, textureY); // Box 13
		tailModel[3] = new ModelRendererTurbo(this, 283, 710, textureX, textureY); // Box 14
		tailModel[4] = new ModelRendererTurbo(this, 104, 710, textureX, textureY); // Box 15
		tailModel[5] = new ModelRendererTurbo(this, 1211, 710, textureX, textureY); // Box 16
		tailModel[6] = new ModelRendererTurbo(this, 1303, 710, textureX, textureY); // Box 17
		tailModel[7] = new ModelRendererTurbo(this, 1395, 710, textureX, textureY); // Box 18
		tailModel[8] = new ModelRendererTurbo(this, 1116, 710, textureX, textureY); // Box 19
		tailModel[9] = new ModelRendererTurbo(this, 1629, 710, textureX, textureY); // Box 20
		tailModel[10] = new ModelRendererTurbo(this, 1543, 710, textureX, textureY); // Box 21
		tailModel[11] = new ModelRendererTurbo(this, 862, 755, textureX, textureY); // Box 4
		tailModel[12] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Box 19
		tailModel[13] = new ModelRendererTurbo(this, 1042, 710, textureX, textureY); // Box 20
		tailModel[14] = new ModelRendererTurbo(this, 1478, 710, textureX, textureY); // Box 21
		tailModel[15] = new ModelRendererTurbo(this, 204, 938, textureX, textureY); // Box 22
		tailModel[16] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 2
		tailModel[17] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 3
		tailModel[18] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 4
		tailModel[19] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 5
		tailModel[20] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 6
		tailModel[21] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 7
		tailModel[22] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 8
		tailModel[23] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 9
		tailModel[24] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 10
		tailModel[25] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 11
		tailModel[26] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 12
		tailModel[27] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 13
		tailModel[28] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 14
		tailModel[29] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 15
		tailModel[30] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 16
		tailModel[31] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 17
		tailModel[32] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 18
		tailModel[33] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 19
		tailModel[34] = new ModelRendererTurbo(this, 331, 938, textureX, textureY); // Box 20
		tailModel[35] = new ModelRendererTurbo(this, 260, 903, textureX, textureY); // Box 49
		tailModel[36] = new ModelRendererTurbo(this, 260, 886, textureX, textureY); // Box 50
		tailModel[37] = new ModelRendererTurbo(this, 260, 886, textureX, textureY); // Box 52
		tailModel[38] = new ModelRendererTurbo(this, 225, 886, textureX, textureY); // Box 53
		tailModel[39] = new ModelRendererTurbo(this, 175, 886, textureX, textureY); // Box 54
		tailModel[40] = new ModelRendererTurbo(this, 175, 886, textureX, textureY); // Box 55
		tailModel[41] = new ModelRendererTurbo(this, 0, 871, textureX, textureY); // Box 107
		tailModel[42] = new ModelRendererTurbo(this, 19, 871, textureX, textureY); // Box 108
		tailModel[43] = new ModelRendererTurbo(this, 19, 871, textureX, textureY); // Box 111
		
		tailModel[0].addShapeBox(0F, 0F, 0F, 64, 9, 22, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, -5F, -9F, 0F, -5F, -9F, 0F, 0F, -5F); // Box 10
		tailModel[0].setRotationPoint(74F, -11F, -11F);
		
		tailModel[1].addShapeBox(0F, 0F, 0F, 64, 8, 26, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, -2F); // Box 11
		tailModel[1].setRotationPoint(74F, -14F, -13F);
		
		tailModel[2].addShapeBox(0F, 0F, 0F, 64, 12, 26, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F); // Box 13
		tailModel[2].setRotationPoint(74F, -23F, -13F);
		
		tailModel[3].addShapeBox(0F, 0F, 0F, 64, 10, 26, 0F, 0F, 0F, -3F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 14
		tailModel[3].setRotationPoint(74F, -32F, -13F);
		
		tailModel[4].addShapeBox(0F, 0F, 0F, 64, 11, 20, 0F, 0F, 0F, -3F, 0F, -8F, -5F, 0F, -8F, -5F, 0F, 0F, -3F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -9F, 0F); // Box 15
		tailModel[4].setRotationPoint(74F, -34F, -10F);
		
		tailModel[5].addShapeBox(0F, 0F, 0F, 27, 13, 16, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F); // Box 16
		tailModel[5].setRotationPoint(138F, -23F, -8F);
		
		tailModel[6].addShapeBox(0F, 0F, 0F, 27, 4, 16, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -2F); // Box 17
		tailModel[6].setRotationPoint(138F, -14F, -8F);
		
		tailModel[7].addShapeBox(0F, 0F, 0F, 27, 4, 12, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, -4F); // Box 18
		tailModel[7].setRotationPoint(138F, -11F, -6F);
		
		tailModel[8].addShapeBox(0F, 0F, 0F, 27, 7, 16, 0F, 0F, 0F, -3F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F); // Box 19
		tailModel[8].setRotationPoint(138F, -26F, -8F);
		
		tailModel[9].addShapeBox(0F, 0F, 0F, 30, 9, 10, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F); // Box 20
		tailModel[9].setRotationPoint(165F, -19F, -5F);
		
		tailModel[10].addShapeBox(0F, 0F, 0F, 30, 6, 10, 0F, 0F, 0F, -2F, -6F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F); // Box 21
		tailModel[10].setRotationPoint(165F, -22F, -5F);
		
		tailModel[11].addShapeBox(0F, 0F, 0F, 20, 10, 14, 0F, 0F, 0F, 0F, 0F, -8F, -5F, 0F, -8F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 4
		tailModel[11].setRotationPoint(74F, -41F, -7F);
		
		tailModel[12].addShapeBox(0F, 0F, 0F, 44, 11, 4, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 19
		tailModel[12].setRotationPoint(94F, -33F, -2F);
		
		tailModel[13].addShapeBox(0F, 0F, 0F, 27, 6, 6, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 20
		tailModel[13].setRotationPoint(138F, -28F, -3F);
		
		tailModel[14].addShapeBox(0F, 0F, 0F, 24, 3, 6, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 21
		tailModel[14].setRotationPoint(165F, -25F, -3F);
		
		tailModel[15].addShapeBox(0F, 0F, 0F, 55, 43, 4, 0F, -39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, 0F, -3F, 0F, -30F, 0F, 0F, -31F, 0F, 0F, 0F, -3F, 0F); // Box 22
		tailModel[15].setRotationPoint(165F, -65F, -2F);
		
		tailModel[16].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		tailModel[16].setRotationPoint(196F, -62F, -2F);
		
		tailModel[17].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 3
		tailModel[17].setRotationPoint(196F, -59F, -2F);
		
		tailModel[18].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 4
		tailModel[18].setRotationPoint(196F, -65F, -2F);
		
		tailModel[19].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		tailModel[19].setRotationPoint(199F, -66F, -2F);
		
		tailModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		tailModel[20].setRotationPoint(201F, -67F, -2F);
		
		tailModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 7
		tailModel[21].setRotationPoint(195F, -62F, -2F);
		
		tailModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		tailModel[22].setRotationPoint(207F, -66F, -2F);
		
		tailModel[23].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F, -1F, -6F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		tailModel[23].setRotationPoint(201F, -67F, -8F);
		
		tailModel[24].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F, -3F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 10
		tailModel[24].setRotationPoint(199F, -66F, -8F);
		
		tailModel[25].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F, -6F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		tailModel[25].setRotationPoint(196F, -65F, -8F);
		
		tailModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, -7F, -1F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 12
		tailModel[26].setRotationPoint(195F, -62F, -8F);
		
		tailModel[27].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, -6F, 0F, -5F, -6F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 13
		tailModel[27].setRotationPoint(202F, -67F, -8F);
		
		tailModel[28].addShapeBox(0F, 0F, 0F, 7, 6, 6, 0F, 0F, -6F, 0F, -7F, -6F, 0F, 0F, -2F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 14
		tailModel[28].setRotationPoint(202F, -67F, -8F);
		
		tailModel[29].addShapeBox(0F, 0F, 0F, 9, 4, 6, 0F, 0F, -4F, 0F, -9F, -4F, 0F, 1F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, -7F, 0F, 0F); // Box 15
		tailModel[29].setRotationPoint(202F, -65F, -8F);
		
		tailModel[30].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F, 0F, -2F, 0F, -12F, -2F, 0F, 0F, -2F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 16
		tailModel[30].setRotationPoint(202F, -63F, -8F);
		
		tailModel[31].addShapeBox(0F, 0F, 0F, 12, 5, 6, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -12F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[31].setRotationPoint(202F, -61F, -8F);
		
		tailModel[32].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 18
		tailModel[32].setRotationPoint(197F, -61F, -8F);
		
		tailModel[33].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, 0F, -2F, 0F); // Box 19
		tailModel[33].setRotationPoint(196F, -61F, -8F);
		
		tailModel[34].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F); // Box 20
		tailModel[34].setRotationPoint(195F, -61F, -8F);
		
		tailModel[35].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[35].setRotationPoint(162F, 4F, -2F);
		
		tailModel[36].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		tailModel[36].setRotationPoint(162F, 2F, -2F);
		
		tailModel[37].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 52
		tailModel[37].setRotationPoint(162F, 8F, -2F);
		
		tailModel[38].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 53
		tailModel[38].setRotationPoint(159F, 2F, -3F);
		
		tailModel[39].addShapeBox(0F, 0F, 0F, 20, 13, 2, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 54
		tailModel[39].setRotationPoint(139F, -9F, -1F);
		
		tailModel[40].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F); // Box 55
		tailModel[40].setRotationPoint(146F, -9F, -1F);
		
		tailModel[41].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 107
		tailModel[41].setRotationPoint(204F, -67F, 2F);
		
		tailModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 108
		tailModel[42].setRotationPoint(205F, -67F, 7F);
		
		tailModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 111
		tailModel[43].setRotationPoint(204F, -67F, 7F);
		
		
		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 154, 938, textureX, textureY); // Box 25
		
		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 16, 11, 4, 0F, -8F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -7.5F, 0F, 0F, -0.5F, 0F, 0F, -8F, 0F, -2F, -8F, 0F, -2F, 0.5F, 0F, 0F); // Box 25
		yawFlapModel[0].setRotationPoint(193F, -38F, -2F);
		
		
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 0, 938, textureX, textureY); // Box 23
		
		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 24, 2, 43, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		pitchFlapLeftModel[0].setRotationPoint(178F, -30F, -45F);
		
		
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 0, 938, textureX, textureY); // Box 24
		
		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 24, 2, 43, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 24
		pitchFlapRightModel[0].setRotationPoint(178F, -30F, 2F);
		
		
		bodyDoorOpenModel = new ModelRendererTurbo[12];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 88, 440, textureX, textureY); // Box 26
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 27
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 167, 440, textureX, textureY); // Box 28
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 235, 440, textureX, textureY); // Box 29
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 189, 440, textureX, textureY); // Box 30
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 212, 440, textureX, textureY); // Box 31
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 88, 462, textureX, textureY); // Box 32
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Box 33
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 167, 462, textureX, textureY); // Box 34
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 235, 462, textureX, textureY); // Box 35
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 189, 462, textureX, textureY); // Box 36
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 212, 462, textureX, textureY); // Box 37
		
		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 35, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyDoorOpenModel[0].setRotationPoint(18F, -20F, -27F);
		
		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 35, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyDoorOpenModel[1].setRotationPoint(18F, -10F, -27F);
		
		bodyDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 28
		bodyDoorOpenModel[2].setRotationPoint(18F, -35F, -27F);
		
		bodyDoorOpenModel[3].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 29
		bodyDoorOpenModel[3].setRotationPoint(18F, -36F, -24F);
		
		bodyDoorOpenModel[4].addShapeBox(0F, 0F, 0F, 4, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 30
		bodyDoorOpenModel[4].setRotationPoint(33F, -35F, -27F);
		
		bodyDoorOpenModel[5].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 31
		bodyDoorOpenModel[5].setRotationPoint(50F, -35F, -27F);
		
		bodyDoorOpenModel[6].addShapeBox(0F, 0F, 0F, 35, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyDoorOpenModel[6].setRotationPoint(18F, -20F, 26F);
		
		bodyDoorOpenModel[7].addShapeBox(0F, 0F, 0F, 35, 6, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 33
		bodyDoorOpenModel[7].setRotationPoint(18F, -10F, 23F);
		
		bodyDoorOpenModel[8].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyDoorOpenModel[8].setRotationPoint(18F, -35F, 23F);
		
		bodyDoorOpenModel[9].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyDoorOpenModel[9].setRotationPoint(18F, -36F, 22F);
		
		bodyDoorOpenModel[10].addShapeBox(0F, 0F, 0F, 4, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyDoorOpenModel[10].setRotationPoint(33F, -35F, 23F);
		
		bodyDoorOpenModel[11].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyDoorOpenModel[11].setRotationPoint(50F, -35F, 23F);
		
		
		bodyDoorCloseModel = new ModelRendererTurbo[12];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 88, 440, textureX, textureY); // Box 138
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 235, 440, textureX, textureY); // Box 139
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 167, 440, textureX, textureY); // Box 140
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 189, 440, textureX, textureY); // Box 141
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 212, 440, textureX, textureY); // Box 142
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 143
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 88, 462, textureX, textureY); // Box 144
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 235, 462, textureX, textureY); // Box 145
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 167, 462, textureX, textureY); // Box 146
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 189, 462, textureX, textureY); // Box 147
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 212, 462, textureX, textureY); // Box 148
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Box 149
		
		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 35, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyDoorCloseModel[0].setRotationPoint(-17F, -20F, -26F);
		
		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 139
		bodyDoorCloseModel[1].setRotationPoint(-17F, -36F, -23F);
		
		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 140
		bodyDoorCloseModel[2].setRotationPoint(-17F, -35F, -26F);
		
		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 4, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 141
		bodyDoorCloseModel[3].setRotationPoint(-2F, -35F, -26F);
		
		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 142
		bodyDoorCloseModel[4].setRotationPoint(15F, -35F, -26F);
		
		bodyDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 35, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyDoorCloseModel[5].setRotationPoint(-17F, -10F, -26F);
		
		bodyDoorCloseModel[6].addShapeBox(0F, 0F, 0F, 35, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyDoorCloseModel[6].setRotationPoint(-17F, -20F, 25F);
		
		bodyDoorCloseModel[7].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyDoorCloseModel[7].setRotationPoint(-17F, -36F, 21F);
		
		bodyDoorCloseModel[8].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyDoorCloseModel[8].setRotationPoint(-17F, -35F, 22F);
		
		bodyDoorCloseModel[9].addShapeBox(0F, 0F, 0F, 4, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyDoorCloseModel[9].setRotationPoint(-2F, -35F, 22F);
		
		bodyDoorCloseModel[10].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyDoorCloseModel[10].setRotationPoint(15F, -35F, 22F);
		
		bodyDoorCloseModel[11].addShapeBox(0F, 0F, 0F, 35, 6, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 149
		bodyDoorCloseModel[11].setRotationPoint(-17F, -10F, 22F);
		
		
		heliMainRotorModels = new ModelRendererTurbo[1][27];
		heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 1367, 0, textureX, textureY); // Box 64
		heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 1367, 0, textureX, textureY); // Box 65
		heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 1367, 0, textureX, textureY); // Box 66
		heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 86
		heliMainRotorModels[0][4] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 87
		heliMainRotorModels[0][5] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 88
		heliMainRotorModels[0][6] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 104
		heliMainRotorModels[0][7] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 105
		heliMainRotorModels[0][8] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 106
		heliMainRotorModels[0][9] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 0
		heliMainRotorModels[0][10] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 1
		heliMainRotorModels[0][11] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 2
		heliMainRotorModels[0][12] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 3
		heliMainRotorModels[0][13] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 4
		heliMainRotorModels[0][14] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 5
		heliMainRotorModels[0][15] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 8
		heliMainRotorModels[0][16] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 9
		heliMainRotorModels[0][17] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 10
		heliMainRotorModels[0][18] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 11
		heliMainRotorModels[0][19] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 12
		heliMainRotorModels[0][20] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 13
		heliMainRotorModels[0][21] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 14
		heliMainRotorModels[0][22] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 15
		heliMainRotorModels[0][23] = new ModelRendererTurbo(this, 1398, 0, textureX, textureY); // Box 16
		heliMainRotorModels[0][24] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 17
		heliMainRotorModels[0][25] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 18
		heliMainRotorModels[0][26] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 19
		
		heliMainRotorModels[0][0].addShapeBox(-1.5F, 0F, -3.5F, 3, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		heliMainRotorModels[0][0].setRotationPoint(0F, -65F, 1F);
		
		heliMainRotorModels[0][1].addShapeBox(-3.5F, 0F, -3.5F, 2, 6, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 65
		heliMainRotorModels[0][1].setRotationPoint(0F, -65F, 1F);
		
		heliMainRotorModels[0][2].addShapeBox(1.5F, 0F, -3.5F, 2, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 66
		heliMainRotorModels[0][2].setRotationPoint(0F, -65F, 1F);
		
		heliMainRotorModels[0][3].addShapeBox(3.5F, 0F, -0.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 86
		heliMainRotorModels[0][3].setRotationPoint(0F, -61F, 0F);
		
		heliMainRotorModels[0][4].addShapeBox(3.5F, 0F, -0.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		heliMainRotorModels[0][4].setRotationPoint(0F, -62F, 0F);
		
		heliMainRotorModels[0][5].addShapeBox(3.5F, 0F, -0.5F, 9, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		heliMainRotorModels[0][5].setRotationPoint(0F, -63F, 0F);
		
		heliMainRotorModels[0][6].addShapeBox(12.5F, 0F, -1.5F, 7, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		heliMainRotorModels[0][6].setRotationPoint(0F, -62F, 0F);
		
		heliMainRotorModels[0][7].addShapeBox(19.5F, 0F, -2.5F, 132, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		heliMainRotorModels[0][7].setRotationPoint(0F, -62F, 0F);
		
		heliMainRotorModels[0][8].addShapeBox(151.5F, 0F, -6.5F, 13, 1, 14, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 106
		heliMainRotorModels[0][8].setRotationPoint(0F, -62F, 0F);
		
		heliMainRotorModels[0][9].addShapeBox(2.5F, 0F, -1.5F, 9, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][9].setRotationPoint(0F, -63F, 0F);
		heliMainRotorModels[0][9].rotateAngleY = -1.57079633F;
		
		heliMainRotorModels[0][10].addShapeBox(2.5F, 0F, -1.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		heliMainRotorModels[0][10].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][10].rotateAngleY = -1.57079633F;
		
		heliMainRotorModels[0][11].addShapeBox(2.5F, 0F, -1.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		heliMainRotorModels[0][11].setRotationPoint(0F, -61F, 0F);
		heliMainRotorModels[0][11].rotateAngleY = -1.57079633F;
		
		heliMainRotorModels[0][12].addShapeBox(11.5F, 0F, -2.5F, 7, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		heliMainRotorModels[0][12].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][12].rotateAngleY = -1.57079633F;
		
		heliMainRotorModels[0][13].addShapeBox(18.5F, 0F, -3.5F, 132, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		heliMainRotorModels[0][13].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][13].rotateAngleY = -1.57079633F;
		
		heliMainRotorModels[0][14].addShapeBox(150.5F, 0F, -7.5F, 13, 1, 14, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		heliMainRotorModels[0][14].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][14].rotateAngleY = -1.57079633F;
		
		heliMainRotorModels[0][15].addShapeBox(3.5F, 0F, -2.5F, 9, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		heliMainRotorModels[0][15].setRotationPoint(0F, -63F, 0F);
		heliMainRotorModels[0][15].rotateAngleY = -3.14159265F;
		
		heliMainRotorModels[0][16].addShapeBox(3.5F, 0F, -2.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		heliMainRotorModels[0][16].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][16].rotateAngleY = -3.14159265F;
		
		heliMainRotorModels[0][17].addShapeBox(3.5F, 0F, -2.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		heliMainRotorModels[0][17].setRotationPoint(0F, -61F, 0F);
		heliMainRotorModels[0][17].rotateAngleY = -3.14159265F;
		
		heliMainRotorModels[0][18].addShapeBox(12.5F, 0F, -3.5F, 7, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		heliMainRotorModels[0][18].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][18].rotateAngleY = -3.14159265F;
		
		heliMainRotorModels[0][19].addShapeBox(19.5F, 0F, -6.5F, 132, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		heliMainRotorModels[0][19].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][19].rotateAngleY = -3.14159265F;
		
		heliMainRotorModels[0][20].addShapeBox(151.5F, 0F, -10.5F, 13, 1, 14, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 13
		heliMainRotorModels[0][20].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][20].rotateAngleY = -3.14159265F;
		
		heliMainRotorModels[0][21].addShapeBox(4.5F, 0F, -1.5F, 9, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		heliMainRotorModels[0][21].setRotationPoint(0F, -63F, 0F);
		heliMainRotorModels[0][21].rotateAngleY = 1.57079633F;
		
		heliMainRotorModels[0][22].addShapeBox(4.5F, 0F, -1.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		heliMainRotorModels[0][22].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][22].rotateAngleY = 1.57079633F;
		
		heliMainRotorModels[0][23].addShapeBox(4.5F, 0F, -1.5F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 16
		heliMainRotorModels[0][23].setRotationPoint(0F, -61F, 0F);
		heliMainRotorModels[0][23].rotateAngleY = 1.57079633F;
		
		heliMainRotorModels[0][24].addShapeBox(13.5F, 0F, -2.5F, 7, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		heliMainRotorModels[0][24].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][24].rotateAngleY = 1.57079633F;
		
		heliMainRotorModels[0][25].addShapeBox(20.5F, 0F, -6.5F, 132, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		heliMainRotorModels[0][25].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][25].rotateAngleY = 1.57079633F;
		
		heliMainRotorModels[0][26].addShapeBox(152.5F, 0F, -10.5F, 13, 1, 14, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 19
		heliMainRotorModels[0][26].setRotationPoint(0F, -62F, 0F);
		heliMainRotorModels[0][26].rotateAngleY = 1.57079633F;
		
		heliMainRotorOrigins = new Vector3f[]{new Vector3f(0F, 0F / 16F, 0F)};
		
		heliRotorSpeeds = new float[]{1F};

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		heliTailRotorModels = new ModelRendererTurbo[1][12];
		heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 117
		heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 118
		heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 119
		heliTailRotorModels[0][3] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 20
		heliTailRotorModels[0][4] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 21
		heliTailRotorModels[0][5] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 22
		heliTailRotorModels[0][6] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 23
		heliTailRotorModels[0][7] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 24
		heliTailRotorModels[0][8] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 25
		heliTailRotorModels[0][9] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 26
		heliTailRotorModels[0][10] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 27
		heliTailRotorModels[0][11] = new ModelRendererTurbo(this, 1481, 0, textureX, textureY); // Box 28
		
		heliTailRotorModels[0][0].addShapeBox(-1.5F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 117
		heliTailRotorModels[0][0].setRotationPoint(205F, -66F, 6F);
		
		heliTailRotorModels[0][1].addShapeBox(-2.5F, 3F, 0F, 4, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 118
		heliTailRotorModels[0][1].setRotationPoint(205F, -65F, 6F);
		
		heliTailRotorModels[0][2].addShapeBox(-2.5F, 10F, 0F, 4, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 119
		heliTailRotorModels[0][2].setRotationPoint(205F, -66F, 6F);
		
		heliTailRotorModels[0][3].addShapeBox(-1.5F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		heliTailRotorModels[0][3].setRotationPoint(205F, -66F, 6F);
		heliTailRotorModels[0][3].rotateAngleZ = 1.57079633F;
		
		heliTailRotorModels[0][4].addShapeBox(-2.5F, 4F, 0F, 4, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
		heliTailRotorModels[0][4].setRotationPoint(205F, -66F, 6F);
		heliTailRotorModels[0][4].rotateAngleZ = 1.57079633F;
		
		heliTailRotorModels[0][5].addShapeBox(-1.5F, 10F, 0F, 4, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		heliTailRotorModels[0][5].setRotationPoint(205F, -65F, 6F);
		heliTailRotorModels[0][5].rotateAngleZ = 1.57079633F;
		
		heliTailRotorModels[0][6].addShapeBox(-1.5F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 23
		heliTailRotorModels[0][6].setRotationPoint(205F, -66F, 6F);
		heliTailRotorModels[0][6].rotateAngleZ = -1.57079633F;
		
		heliTailRotorModels[0][7].addShapeBox(-3.5F, 4F, 0F, 4, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 24
		heliTailRotorModels[0][7].setRotationPoint(205F, -65F, 6F);
		heliTailRotorModels[0][7].rotateAngleZ = -1.57079633F;
		
		heliTailRotorModels[0][8].addShapeBox(-3.5F, 10F, 0F, 4, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		heliTailRotorModels[0][8].setRotationPoint(205F, -65F, 6F);
		heliTailRotorModels[0][8].rotateAngleZ = -1.57079633F;
		
		heliTailRotorModels[0][9].addShapeBox(-1.5F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 26
		heliTailRotorModels[0][9].setRotationPoint(205F, -66F, 6F);
		heliTailRotorModels[0][9].rotateAngleZ = -3.14159265F;
		
		heliTailRotorModels[0][10].addShapeBox(-2.5F, 5F, 0F, 4, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		heliTailRotorModels[0][10].setRotationPoint(205F, -65F, 6F);
		heliTailRotorModels[0][10].rotateAngleZ = -3.14159265F;
		
		heliTailRotorModels[0][11].addShapeBox(-3.5F, 10F, 0F, 4, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 28
		heliTailRotorModels[0][11].setRotationPoint(204F, -66F, 6F);
		heliTailRotorModels[0][11].rotateAngleZ = -3.14159265F;
		
		heliTailRotorOrigins = new Vector3f[]{new Vector3f(205F / 16F, 66F / 16F, -6F / 16F)};
		
		translateAll(0F, 0F, 0F);
		
		flipAll();
	}
}
