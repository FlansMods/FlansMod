//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelStuG extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelStuG() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[345];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 50
		bodyModel[24] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 51
		bodyModel[25] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 55
		bodyModel[26] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 56
		bodyModel[27] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 57
		bodyModel[28] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 58
		bodyModel[29] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 59
		bodyModel[30] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 60
		bodyModel[31] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 75
		bodyModel[32] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 77
		bodyModel[33] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 78
		bodyModel[34] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 79
		bodyModel[35] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 80
		bodyModel[36] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 81
		bodyModel[37] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 82
		bodyModel[38] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 83
		bodyModel[39] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 84
		bodyModel[40] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 85
		bodyModel[41] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 86
		bodyModel[42] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 87
		bodyModel[43] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 88
		bodyModel[44] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 89
		bodyModel[45] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 90
		bodyModel[46] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 91
		bodyModel[47] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 92
		bodyModel[48] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 93
		bodyModel[49] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 94
		bodyModel[50] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 95
		bodyModel[51] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 96
		bodyModel[52] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 97
		bodyModel[53] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 98
		bodyModel[54] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 100
		bodyModel[56] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 101
		bodyModel[57] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 102
		bodyModel[58] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 103
		bodyModel[59] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 104
		bodyModel[60] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 105
		bodyModel[61] = new ModelRendererTurbo(this, 150, 456, textureX, textureY); // Box 106
		bodyModel[62] = new ModelRendererTurbo(this, 150, 456, textureX, textureY); // Box 107
		bodyModel[63] = new ModelRendererTurbo(this, 150, 456, textureX, textureY); // Box 108
		bodyModel[64] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 109
		bodyModel[65] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 110
		bodyModel[66] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 111
		bodyModel[67] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 112
		bodyModel[68] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 113
		bodyModel[69] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 114
		bodyModel[70] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 115
		bodyModel[71] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 116
		bodyModel[72] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 117
		bodyModel[73] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 119
		bodyModel[74] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 120
		bodyModel[75] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 121
		bodyModel[76] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 124
		bodyModel[77] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 125
		bodyModel[78] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 126
		bodyModel[79] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 134
		bodyModel[80] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[81] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 136
		bodyModel[82] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 137
		bodyModel[83] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 138
		bodyModel[84] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 139
		bodyModel[85] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 141
		bodyModel[86] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 142
		bodyModel[87] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 144
		bodyModel[88] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 145
		bodyModel[89] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 148
		bodyModel[90] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 150
		bodyModel[91] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 151
		bodyModel[92] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 152
		bodyModel[93] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 153
		bodyModel[94] = new ModelRendererTurbo(this, 792, 448, textureX, textureY); // Box 154
		bodyModel[95] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 155
		bodyModel[96] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 156
		bodyModel[97] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 157
		bodyModel[98] = new ModelRendererTurbo(this, 150, 456, textureX, textureY); // Box 158
		bodyModel[99] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 159
		bodyModel[100] = new ModelRendererTurbo(this, 150, 440, textureX, textureY); // Box 160
		bodyModel[101] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 187
		bodyModel[102] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 188
		bodyModel[103] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 189
		bodyModel[104] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 190
		bodyModel[105] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 197
		bodyModel[106] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 198
		bodyModel[107] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 199
		bodyModel[108] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 200
		bodyModel[109] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 201
		bodyModel[110] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 202
		bodyModel[111] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 203
		bodyModel[112] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 204
		bodyModel[113] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 205
		bodyModel[114] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 206
		bodyModel[115] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 207
		bodyModel[116] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 208
		bodyModel[117] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 209
		bodyModel[118] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 210
		bodyModel[119] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 211
		bodyModel[120] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 212
		bodyModel[121] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 213
		bodyModel[122] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 214
		bodyModel[123] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 215
		bodyModel[124] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 216
		bodyModel[125] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 217
		bodyModel[126] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 218
		bodyModel[127] = new ModelRendererTurbo(this, 481, 313, textureX, textureY); // Box 17
		bodyModel[128] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 18
		bodyModel[129] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 19
		bodyModel[130] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 12
		bodyModel[131] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 13
		bodyModel[132] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 14
		bodyModel[133] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 15
		bodyModel[134] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 16
		bodyModel[135] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 24
		bodyModel[136] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 25
		bodyModel[137] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 27
		bodyModel[138] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 28
		bodyModel[139] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 29
		bodyModel[140] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 30
		bodyModel[141] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 31
		bodyModel[142] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 32
		bodyModel[143] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 33
		bodyModel[144] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 34
		bodyModel[145] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 35
		bodyModel[146] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 36
		bodyModel[147] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 37
		bodyModel[148] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 49
		bodyModel[149] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 52
		bodyModel[150] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 53
		bodyModel[151] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 54
		bodyModel[152] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 55
		bodyModel[153] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 56
		bodyModel[154] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 57
		bodyModel[155] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 58
		bodyModel[156] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 59
		bodyModel[157] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 60
		bodyModel[158] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 61
		bodyModel[159] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 62
		bodyModel[160] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 1
		bodyModel[161] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 4
		bodyModel[163] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 5
		bodyModel[164] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 6
		bodyModel[165] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		bodyModel[166] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 9
		bodyModel[167] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 10
		bodyModel[168] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 11
		bodyModel[169] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 12
		bodyModel[170] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		bodyModel[171] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 14
		bodyModel[172] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 25
		bodyModel[173] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 122
		bodyModel[174] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 123
		bodyModel[175] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 126
		bodyModel[176] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 127
		bodyModel[177] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 129
		bodyModel[178] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 130
		bodyModel[179] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 131
		bodyModel[180] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 132
		bodyModel[181] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 133
		bodyModel[182] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 134
		bodyModel[183] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 135
		bodyModel[184] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 146
		bodyModel[185] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 53
		bodyModel[186] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 8
		bodyModel[187] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 9
		bodyModel[188] = new ModelRendererTurbo(this, 150, 65, textureX, textureY); // Box 10
		bodyModel[189] = new ModelRendererTurbo(this, 150, 65, textureX, textureY); // Box 11
		bodyModel[190] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 12
		bodyModel[191] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 181
		bodyModel[192] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 182
		bodyModel[193] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 183
		bodyModel[194] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 185
		bodyModel[195] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 186
		bodyModel[196] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 191
		bodyModel[197] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 192
		bodyModel[198] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 193
		bodyModel[199] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 194
		bodyModel[200] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 196
		bodyModel[201] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 197
		bodyModel[202] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 199
		bodyModel[203] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 200
		bodyModel[204] = new ModelRendererTurbo(this, 265, 433, textureX, textureY); // Box 204
		bodyModel[205] = new ModelRendererTurbo(this, -8, 457, textureX, textureY); // Box 0
		bodyModel[206] = new ModelRendererTurbo(this, 300, 432, textureX, textureY); // Box 0
		bodyModel[207] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[208] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[209] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[210] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[211] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[212] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[213] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[214] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[215] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[216] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[217] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[218] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[219] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[220] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[221] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[222] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 135
		bodyModel[223] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[224] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 135
		bodyModel[225] = new ModelRendererTurbo(this, 346, 401, textureX, textureY); // Box 191
		bodyModel[226] = new ModelRendererTurbo(this, 346, 401, textureX, textureY); // Box 192
		bodyModel[227] = new ModelRendererTurbo(this, 346, 401, textureX, textureY); // Box 194
		bodyModel[228] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 195
		bodyModel[229] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 196
		bodyModel[230] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 0
		bodyModel[231] = new ModelRendererTurbo(this, 387, 492, textureX, textureY); // Box 1
		bodyModel[232] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Box 290
		bodyModel[233] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 5
		bodyModel[234] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 6
		bodyModel[235] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 28
		bodyModel[236] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 29
		bodyModel[237] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 53
		bodyModel[238] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 54
		bodyModel[239] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 57
		bodyModel[240] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 61
		bodyModel[241] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 70
		bodyModel[242] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 71
		bodyModel[243] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 72
		bodyModel[244] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 75
		bodyModel[245] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 76
		bodyModel[246] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 79
		bodyModel[247] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 80
		bodyModel[248] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 81
		bodyModel[249] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 82
		bodyModel[250] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 85
		bodyModel[251] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 86
		bodyModel[252] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 88
		bodyModel[253] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 92
		bodyModel[254] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Box 96
		bodyModel[255] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Box 67
		bodyModel[256] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 1
		bodyModel[257] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 2
		bodyModel[258] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 3
		bodyModel[259] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 4
		bodyModel[260] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 24
		bodyModel[261] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 25
		bodyModel[262] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 26
		bodyModel[263] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 27
		bodyModel[264] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 34
		bodyModel[265] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Box 50
		bodyModel[266] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 51
		bodyModel[267] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 52
		bodyModel[268] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 55
		bodyModel[269] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 58
		bodyModel[270] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Box 59
		bodyModel[271] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Box 60
		bodyModel[272] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 93
		bodyModel[273] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 94
		bodyModel[274] = new ModelRendererTurbo(this, 21, 52, textureX, textureY); // Box 95
		bodyModel[275] = new ModelRendererTurbo(this, 21, 52, textureX, textureY); // Box 96
		bodyModel[276] = new ModelRendererTurbo(this, 21, 52, textureX, textureY); // Box 97
		bodyModel[277] = new ModelRendererTurbo(this, 21, 52, textureX, textureY); // Box 98
		bodyModel[278] = new ModelRendererTurbo(this, 21, 52, textureX, textureY); // Box 99
		bodyModel[279] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 101
		bodyModel[280] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 102
		bodyModel[281] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 103
		bodyModel[282] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 104
		bodyModel[283] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 105
		bodyModel[284] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 106
		bodyModel[285] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 107
		bodyModel[286] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 108
		bodyModel[287] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 113
		bodyModel[288] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 114
		bodyModel[289] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 115
		bodyModel[290] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 116
		bodyModel[291] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 117
		bodyModel[292] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 118
		bodyModel[293] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 119
		bodyModel[294] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 120
		bodyModel[295] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 121
		bodyModel[296] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 122
		bodyModel[297] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 123
		bodyModel[298] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 124
		bodyModel[299] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 125
		bodyModel[300] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 126
		bodyModel[301] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 127
		bodyModel[302] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 128
		bodyModel[303] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 129
		bodyModel[304] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 130
		bodyModel[305] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 131
		bodyModel[306] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 132
		bodyModel[307] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 133
		bodyModel[308] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 134
		bodyModel[309] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 135
		bodyModel[310] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 136
		bodyModel[311] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 149
		bodyModel[312] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 378
		bodyModel[313] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 379
		bodyModel[314] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 380
		bodyModel[315] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 166
		bodyModel[316] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 167
		bodyModel[317] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 168
		bodyModel[318] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 169
		bodyModel[319] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 170
		bodyModel[320] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 174
		bodyModel[321] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 175
		bodyModel[322] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 176
		bodyModel[323] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 157
		bodyModel[324] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 158
		bodyModel[325] = new ModelRendererTurbo(this, 333, 448, textureX, textureY); // Box 159
		bodyModel[326] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 160
		bodyModel[327] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 161
		bodyModel[328] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 162
		bodyModel[329] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 163
		bodyModel[330] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 164
		bodyModel[331] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 165
		bodyModel[332] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 166
		bodyModel[333] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 167
		bodyModel[334] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 168
		bodyModel[335] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 169
		bodyModel[336] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 170
		bodyModel[337] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 171
		bodyModel[338] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 172
		bodyModel[339] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 173
		bodyModel[340] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 174
		bodyModel[341] = new ModelRendererTurbo(this, 150, 65, textureX, textureY); // Box 175
		bodyModel[342] = new ModelRendererTurbo(this, 150, 65, textureX, textureY); // Box 176
		bodyModel[343] = new ModelRendererTurbo(this, 326, 355, textureX, textureY); // Box 0
		bodyModel[344] = new ModelRendererTurbo(this, 326, 355, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 18, 15, 42, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(34F, -15F, -26F);

		bodyModel[1].addShapeBox(6F, -1F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(34F, -15F, -21F);
		bodyModel[1].rotateAngleZ = -0.3217497F;

		bodyModel[2].addShapeBox(9F, -1F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(34F, -15F, -21F);
		bodyModel[2].rotateAngleZ = -0.3217497F;

		bodyModel[3].addShapeBox(14F, -0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(34F, -15F, -21F);
		bodyModel[3].rotateAngleZ = -0.3217497F;

		bodyModel[4].addShapeBox(14F, -0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(34F, -15F, 8F);
		bodyModel[4].rotateAngleZ = -0.3217497F;

		bodyModel[5].addShapeBox(6F, -1F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(34F, -15F, 8F);
		bodyModel[5].rotateAngleZ = -0.3217497F;

		bodyModel[6].addShapeBox(9F, -1F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(34F, -15F, 8F);
		bodyModel[6].rotateAngleZ = -0.3217497F;

		bodyModel[7].addShapeBox(3F, -0.2F, 0F, 11, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(34F, -15F, -14F);
		bodyModel[7].rotateAngleZ = -0.3217497F;

		bodyModel[8].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(34F, -14.5F, -13F);
		bodyModel[8].rotateAngleZ = -0.3217497F;

		bodyModel[9].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(34F, -14.5F, -11F);
		bodyModel[9].rotateAngleZ = -0.3217497F;

		bodyModel[10].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(34F, -14.5F, -8F);
		bodyModel[10].rotateAngleZ = -0.3217497F;

		bodyModel[11].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(34F, -14.5F, -10F);
		bodyModel[11].rotateAngleZ = -0.3217497F;

		bodyModel[12].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 17
		bodyModel[12].setRotationPoint(34F, -14.5F, -5F);
		bodyModel[12].rotateAngleZ = -0.3217497F;

		bodyModel[13].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(34F, -14.5F, -7F);
		bodyModel[13].rotateAngleZ = -0.3217497F;

		bodyModel[14].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[14].setRotationPoint(34F, -14.5F, -2F);
		bodyModel[14].rotateAngleZ = -0.3217497F;

		bodyModel[15].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[15].setRotationPoint(34F, -14.5F, -4F);
		bodyModel[15].rotateAngleZ = -0.3217497F;

		bodyModel[16].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[16].setRotationPoint(34F, -14.5F, 1F);
		bodyModel[16].rotateAngleZ = -0.3217497F;

		bodyModel[17].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[17].setRotationPoint(34F, -14.5F, -1F);
		bodyModel[17].rotateAngleZ = -0.3217497F;

		bodyModel[18].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[18].setRotationPoint(34F, -14.5F, 4F);
		bodyModel[18].rotateAngleZ = -0.3217497F;

		bodyModel[19].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[19].setRotationPoint(34F, -14.5F, 2F);
		bodyModel[19].rotateAngleZ = -0.3217497F;

		bodyModel[20].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[20].setRotationPoint(34F, -14.5F, -13F);
		bodyModel[20].rotateAngleZ = -0.3217497F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 89, 19, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[21].setRotationPoint(-55F, -15.5F, -26F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 40
		bodyModel[22].setRotationPoint(34F, 0F, -26F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 12, 3, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[23].setRotationPoint(4F, -29.5F, -29F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 15, 3, 5, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[24].setRotationPoint(4F, -17.5F, -31F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 15, 12, 3, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F); // Box 55
		bodyModel[25].setRotationPoint(4F, -29.5F, 16F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 56
		bodyModel[26].setRotationPoint(4F, -17.5F, 16F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 30, 12, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 57
		bodyModel[27].setRotationPoint(-26F, -29.5F, -29F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 20, 2, 48, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[28].setRotationPoint(-15F, -31.5F, -29F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 4, 48, 0F, 0F, 0F, -16F, -13F, 0F, -16F, -13F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -7F, 5F, -2F, -7F, 5F, -2F, -7F, 0F, 0F, 0F); // Box 59
		bodyModel[29].setRotationPoint(-15F, -33.5F, -29F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 4, 48, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[30].setRotationPoint(-26F, -33.5F, -29F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 30, 3, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[31].setRotationPoint(-26F, -17.5F, -32F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 29, 4, 50, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[32].setRotationPoint(-55F, -23.5F, -30F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[33].setRotationPoint(-46F, -25.5F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[34].setRotationPoint(-44F, -24F, 4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[35].setRotationPoint(-44F, -24F, 13F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 81
		bodyModel[36].setRotationPoint(-45F, -24F, 4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 82
		bodyModel[37].setRotationPoint(-31F, -24F, 4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[38].setRotationPoint(-34F, -23.7F, 5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[39].setRotationPoint(-37F, -23.7F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[40].setRotationPoint(-40F, -23.7F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[41].setRotationPoint(-43F, -23.7F, 5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[42].setRotationPoint(-46F, -23.7F, -20F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[43].setRotationPoint(-43F, -23.7F, -20F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[44].setRotationPoint(-40F, -23.7F, -20F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[45].setRotationPoint(-37F, -23.7F, -20F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[46].setRotationPoint(-47F, -24F, -21F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[47].setRotationPoint(-47F, -24F, -12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 93
		bodyModel[48].setRotationPoint(-48F, -24F, -21F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 94
		bodyModel[49].setRotationPoint(-34F, -24F, -21F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 29, 4, 50, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 95
		bodyModel[50].setRotationPoint(-55F, -19.5F, -30F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 96
		bodyModel[51].setRotationPoint(-28F, -27.5F, -28F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[52].setRotationPoint(-28F, -29.5F, -27F);

		bodyModel[53].addShapeBox(0F, -74.5F, 0F, 2, 43, 2, 0F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F); // Box 98
		bodyModel[53].setRotationPoint(-2.5F, -9F, -27F);
		bodyModel[53].rotateAngleZ = 0.90757121F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 99
		bodyModel[54].setRotationPoint(-28F, -27.5F, 14F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[55].setRotationPoint(-28F, -29.5F, 15F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 43, 2, 0F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F); // Box 101
		bodyModel[56].setRotationPoint(-28F, -72.5F, 15F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[57].setRotationPoint(-27F, -30F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[58].setRotationPoint(-27F, -32F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 104
		bodyModel[59].setRotationPoint(-27F, -28F, -5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 18, 14, 11, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 105
		bodyModel[60].setRotationPoint(5F, -29.5F, -26F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 106
		bodyModel[61].setRotationPoint(24F, -16.5F, -24F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[62].setRotationPoint(24F, -17.5F, -24F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[63].setRotationPoint(24F, -18.5F, -24F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 109
		bodyModel[64].setRotationPoint(4F, -31.5F, -18.4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 110
		bodyModel[65].setRotationPoint(4F, -31.5F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 15, 14, 16, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[66].setRotationPoint(5F, -29.5F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 14, 9, 16, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[67].setRotationPoint(20F, -24.5F, 0F);

		bodyModel[68].addShapeBox(9F, -1.5F, 2F, 2, 2, 5, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[68].setRotationPoint(21F, -24.5F, 0F);
		bodyModel[68].rotateAngleZ = -0.2449779F;

		bodyModel[69].addShapeBox(9F, -1.5F, 2F, 2, 2, 5, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[69].setRotationPoint(20F, -24.5F, 6F);
		bodyModel[69].rotateAngleZ = -0.2449779F;

		bodyModel[70].addShapeBox(8F, -1.5F, 2F, 1, 2, 2, 0F, -0.4F, 0F, -1.5F, -0.4F, 0F, -1.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 115
		bodyModel[70].setRotationPoint(20F, -24.5F, 11F);
		bodyModel[70].rotateAngleZ = -0.2449779F;

		bodyModel[71].addShapeBox(3F, -1.5F, 2F, 1, 2, 2, 0F, -0.4F, 0F, -1.5F, -0.4F, 0F, -1.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 116
		bodyModel[71].setRotationPoint(20F, -24.5F, 11F);
		bodyModel[71].rotateAngleZ = -0.2449779F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[72].setRotationPoint(-7F, -31.5F, -28F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 4, 18, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 119
		bodyModel[73].setRotationPoint(-12F, -34.5F, -1F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 4, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[74].setRotationPoint(-18F, -34.5F, -1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 4, 18, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 121
		bodyModel[75].setRotationPoint(-24F, -34.5F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 124
		bodyModel[76].setRotationPoint(-23F, -35.5F, 0.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 125
		bodyModel[77].setRotationPoint(-17.5F, -35.5F, 0.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 126
		bodyModel[78].setRotationPoint(-12F, -35.5F, 0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 134
		bodyModel[79].setRotationPoint(-25F, -23.5F, -40F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 135
		bodyModel[80].setRotationPoint(-24.5F, -23.5F, -40F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 136
		bodyModel[81].setRotationPoint(-2.5F, -23.5F, -40F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 137
		bodyModel[82].setRotationPoint(-2F, -23.5F, -40F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[83].setRotationPoint(-24.5F, -23.5F, 17F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[84].setRotationPoint(-25F, -23.5F, 17F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[85].setRotationPoint(-24F, -18.5F, 21F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[86].setRotationPoint(-2.5F, -23.5F, 17F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[87].setRotationPoint(-2F, -23.5F, 17F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[88].setRotationPoint(-6F, -24.5F, 21F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[89].setRotationPoint(-24F, -17.5F, -37F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[90].setRotationPoint(-6F, -25.5F, 21F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[91].setRotationPoint(-9F, -25.5F, 21F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[92].setRotationPoint(-9F, -24.5F, 21F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[93].setRotationPoint(-12F, -25.5F, 21F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[94].setRotationPoint(-12F, -24.5F, 21F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[95].setRotationPoint(-15F, -25.5F, 21F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[96].setRotationPoint(-15F, -24.5F, 21F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[97].setRotationPoint(-18F, -25.5F, 21F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[98].setRotationPoint(-18F, -24.5F, 21F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[99].setRotationPoint(-21F, -25.5F, 21F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[100].setRotationPoint(-21F, -24.5F, 21F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[101].setRotationPoint(-53F, -22.5F, -30F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[102].setRotationPoint(-53F, -21F, -30.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[103].setRotationPoint(-53F, -21F, 19.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[104].setRotationPoint(-53F, -22.5F, 19F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 103, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[105].setRotationPoint(-58F, -15F, -36F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[106].setRotationPoint(45F, -15F, -36F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[107].setRotationPoint(52F, -13F, -36F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 200
		bodyModel[108].setRotationPoint(-70F, -15F, -36F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 20, 27, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[109].setRotationPoint(-60F, -28F, -41F);
		bodyModel[109].rotateAngleX = 0.15707963F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 20, 27, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 202
		bodyModel[110].setRotationPoint(-39F, -28F, -41F);
		bodyModel[110].rotateAngleX = 0.15707963F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 20, 27, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 203
		bodyModel[111].setRotationPoint(-18F, -28F, -41F);
		bodyModel[111].rotateAngleX = 0.15707963F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 20, 27, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 204
		bodyModel[112].setRotationPoint(3F, -28F, -41F);
		bodyModel[112].rotateAngleX = 0.15707963F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 64, 27, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 205
		bodyModel[113].setRotationPoint(-40F, -28F, -40.5F);
		bodyModel[113].rotateAngleX = 0.15707963F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 15, 27, 1, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[114].setRotationPoint(24F, -28F, -41F);
		bodyModel[114].rotateAngleX = 0.15707963F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 27, 1, 0F, 0F, -8F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[115].setRotationPoint(39F, -28F, -41F);
		bodyModel[115].rotateAngleX = 0.15707963F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 27, 1, 0F, 0F, -8F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[116].setRotationPoint(39F, -28F, 30F);
		bodyModel[116].rotateAngleX = -0.15707963F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 15, 27, 1, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[117].setRotationPoint(24F, -28F, 30F);
		bodyModel[117].rotateAngleX = -0.15707963F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 20, 27, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[118].setRotationPoint(3F, -28F, 30F);
		bodyModel[118].rotateAngleX = -0.15707963F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 20, 27, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[119].setRotationPoint(-18F, -28F, 30F);
		bodyModel[119].rotateAngleX = -0.15707963F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 20, 27, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[120].setRotationPoint(-39F, -28F, 30F);
		bodyModel[120].rotateAngleX = -0.15707963F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 20, 27, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[121].setRotationPoint(-60F, -28F, 30F);
		bodyModel[121].rotateAngleX = -0.15707963F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 64, 27, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[122].setRotationPoint(-40F, -28F, 29.5F);
		bodyModel[122].rotateAngleX = -0.15707963F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 103, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[123].setRotationPoint(-58F, -15F, 15F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[124].setRotationPoint(45F, -15F, 15F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[125].setRotationPoint(52F, -13F, 15F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 218
		bodyModel[126].setRotationPoint(-70F, -15F, 15F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 17
		bodyModel[127].setRotationPoint(-6F, -43F, -24F);
		bodyModel[127].rotateAngleZ = 0.19198622F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 2.3F, 0F, -0.2F, 2.3F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 18
		bodyModel[128].setRotationPoint(-6.5F, -43F, -24.2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 2.3F, 0F, -0.2F, 2.3F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 19
		bodyModel[129].setRotationPoint(-6.5F, -43F, -12.85F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 12
		bodyModel[130].setRotationPoint(-10F, -37.5F, 13F);
		bodyModel[130].rotateAngleY = 1.04719755F;

		bodyModel[131].addShapeBox(0F, -4F, 0F, 1, 4, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[131].setRotationPoint(-10F, -37.5F, 13F);
		bodyModel[131].rotateAngleY = 1.04719755F;

		bodyModel[132].addShapeBox(0F, -4F, 1F, 1, 4, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[132].setRotationPoint(-10F, -37.5F, 13F);
		bodyModel[132].rotateAngleY = 1.04719755F;

		bodyModel[133].addShapeBox(0F, -5F, 3F, 1, 1, 1, 0F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F); // Box 15
		bodyModel[133].setRotationPoint(-10F, -37.5F, 13F);
		bodyModel[133].rotateAngleY = 1.04719755F;

		bodyModel[134].addShapeBox(0F, -5F, -2F, 1, 1, 1, 0F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F); // Box 16
		bodyModel[134].setRotationPoint(-10F, -37.5F, 13F);
		bodyModel[134].rotateAngleY = 1.04719755F;

		bodyModel[135].addShapeBox(-2F, -31F, -18F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[135].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[135].rotateAngleZ = -0.29670597F;

		bodyModel[136].addShapeBox(-2F, -31F, -11F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[136].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[136].rotateAngleZ = -0.29670597F;

		bodyModel[137].addShapeBox(0F, -31F, -18F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 27
		bodyModel[137].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[137].rotateAngleZ = -0.29670597F;

		bodyModel[138].addShapeBox(1F, -31F, -18F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[138].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[138].rotateAngleZ = -0.29670597F;

		bodyModel[139].addShapeBox(3F, -31F, -18F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 29
		bodyModel[139].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[139].rotateAngleZ = -0.29670597F;

		bodyModel[140].addShapeBox(4F, -31F, -18F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[140].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[140].rotateAngleZ = -0.29670597F;

		bodyModel[141].addShapeBox(6F, -31F, -18F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 31
		bodyModel[141].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[141].rotateAngleZ = -0.29670597F;

		bodyModel[142].addShapeBox(7F, -31F, -18F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[142].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[142].rotateAngleZ = -0.29670597F;

		bodyModel[143].addShapeBox(9F, -31F, -18F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 33
		bodyModel[143].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[143].rotateAngleZ = -0.29670597F;

		bodyModel[144].addShapeBox(10F, -31F, -18F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[144].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[144].rotateAngleZ = -0.29670597F;

		bodyModel[145].addShapeBox(12F, -31F, -18F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 35
		bodyModel[145].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[145].rotateAngleZ = -0.29670597F;

		bodyModel[146].addShapeBox(13F, -31F, -18F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[146].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[146].rotateAngleZ = -0.29670597F;

		bodyModel[147].addShapeBox(15F, -31F, -18F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 37
		bodyModel[147].setRotationPoint(-1F, 0.5F, -8.5F);
		bodyModel[147].rotateAngleZ = -0.29670597F;

		bodyModel[148].addShapeBox(-2F, -31F, 19F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[148].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[148].rotateAngleZ = -0.29670597F;

		bodyModel[149].addShapeBox(0F, -31F, 19F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 52
		bodyModel[149].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[149].rotateAngleZ = -0.29670597F;

		bodyModel[150].addShapeBox(1F, -31F, 19F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[150].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[150].rotateAngleZ = -0.29670597F;

		bodyModel[151].addShapeBox(3F, -31F, 19F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 54
		bodyModel[151].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[151].rotateAngleZ = -0.29670597F;

		bodyModel[152].addShapeBox(4F, -31F, 19F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[152].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[152].rotateAngleZ = -0.29670597F;

		bodyModel[153].addShapeBox(6F, -31F, 19F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 56
		bodyModel[153].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[153].rotateAngleZ = -0.29670597F;

		bodyModel[154].addShapeBox(7F, -31F, 19F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[154].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[154].rotateAngleZ = -0.29670597F;

		bodyModel[155].addShapeBox(9F, -31F, 19F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 58
		bodyModel[155].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[155].rotateAngleZ = -0.29670597F;

		bodyModel[156].addShapeBox(10F, -31F, 19F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[156].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[156].rotateAngleZ = -0.29670597F;

		bodyModel[157].addShapeBox(12F, -31F, 19F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 60
		bodyModel[157].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[157].rotateAngleZ = -0.29670597F;

		bodyModel[158].addShapeBox(13F, -31F, 19F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[158].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[158].rotateAngleZ = -0.29670597F;

		bodyModel[159].addShapeBox(15F, -31F, 19F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 62
		bodyModel[159].setRotationPoint(-1F, 0.5F, -13.5F);
		bodyModel[159].rotateAngleZ = -0.29670597F;

		bodyModel[160].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1
		bodyModel[160].setRotationPoint(52F, -12F, 4F);
		bodyModel[160].rotateAngleZ = -1.80527957F;

		bodyModel[161].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[161].setRotationPoint(52F, -12F, 2F);
		bodyModel[161].rotateAngleZ = -1.80527957F;

		bodyModel[162].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[162].setRotationPoint(52F, -12F, -1F);
		bodyModel[162].rotateAngleZ = -1.80527957F;

		bodyModel[163].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[163].setRotationPoint(52F, -12F, -1F);
		bodyModel[163].rotateAngleZ = -1.80527957F;

		bodyModel[164].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[164].setRotationPoint(52F, -12F, -4F);
		bodyModel[164].rotateAngleZ = -1.80527957F;

		bodyModel[165].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		bodyModel[165].setRotationPoint(52F, -12F, -2F);
		bodyModel[165].rotateAngleZ = -1.80527957F;

		bodyModel[166].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[166].setRotationPoint(52F, -12F, -7F);
		bodyModel[166].rotateAngleZ = -1.80527957F;

		bodyModel[167].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		bodyModel[167].setRotationPoint(52F, -12F, -5F);
		bodyModel[167].rotateAngleZ = -1.80527957F;

		bodyModel[168].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[168].setRotationPoint(52F, -12F, -8F);
		bodyModel[168].rotateAngleZ = -1.80527957F;

		bodyModel[169].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[169].setRotationPoint(52F, -12F, -10F);
		bodyModel[169].rotateAngleZ = -1.80527957F;

		bodyModel[170].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[170].setRotationPoint(52F, -12F, -11F);
		bodyModel[170].rotateAngleZ = -1.80527957F;

		bodyModel[171].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[171].setRotationPoint(52F, -12F, -13F);
		bodyModel[171].rotateAngleZ = -1.80527957F;

		bodyModel[172].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[172].setRotationPoint(52F, -12F, 1F);
		bodyModel[172].rotateAngleZ = -1.80527957F;

		bodyModel[173].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 122
		bodyModel[173].setRotationPoint(52F, -12F, 4F);
		bodyModel[173].rotateAngleZ = -1.80527957F;

		bodyModel[174].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[174].setRotationPoint(52F, -12F, 2F);
		bodyModel[174].rotateAngleZ = -1.80527957F;

		bodyModel[175].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[175].setRotationPoint(52F, -12F, -1F);
		bodyModel[175].rotateAngleZ = -1.80527957F;

		bodyModel[176].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[176].setRotationPoint(52F, -12F, -4F);
		bodyModel[176].rotateAngleZ = -1.80527957F;

		bodyModel[177].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 129
		bodyModel[177].setRotationPoint(52F, -12F, -2F);
		bodyModel[177].rotateAngleZ = -1.80527957F;

		bodyModel[178].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[178].setRotationPoint(52F, -12F, -7F);
		bodyModel[178].rotateAngleZ = -1.80527957F;

		bodyModel[179].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[179].setRotationPoint(52F, -12F, -5F);
		bodyModel[179].rotateAngleZ = -1.80527957F;

		bodyModel[180].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 132
		bodyModel[180].setRotationPoint(52F, -12F, -8F);
		bodyModel[180].rotateAngleZ = -1.80527957F;

		bodyModel[181].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[181].setRotationPoint(52F, -12F, -10F);
		bodyModel[181].rotateAngleZ = -1.80527957F;

		bodyModel[182].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 134
		bodyModel[182].setRotationPoint(52F, -12F, -11F);
		bodyModel[182].rotateAngleZ = -1.80527957F;

		bodyModel[183].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[183].setRotationPoint(52F, -12F, -13F);
		bodyModel[183].rotateAngleZ = -1.80527957F;

		bodyModel[184].addShapeBox(3.5F, -1.5F, 9F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 146
		bodyModel[184].setRotationPoint(52F, -12F, 1F);
		bodyModel[184].rotateAngleZ = -1.80527957F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[185].setRotationPoint(40F, -20F, 19F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		bodyModel[186].setRotationPoint(40F, -19F, 19F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[187].setRotationPoint(40F, -20F, -33F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[188].setRotationPoint(41F, -18F, -31.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 11
		bodyModel[189].setRotationPoint(41F, -16F, -31.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[190].setRotationPoint(40F, -19F, -33F);

		bodyModel[191].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[191].setRotationPoint(-6F, -32F, -21F);
		bodyModel[191].rotateAngleZ = -0.12976348F;

		bodyModel[192].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[192].setRotationPoint(-6F, -32F, -21F);
		bodyModel[192].rotateAngleZ = -0.12976348F;

		bodyModel[193].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 183
		bodyModel[193].setRotationPoint(-6F, -32F, -19F);
		bodyModel[193].rotateAngleZ = -0.12976348F;

		bodyModel[194].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[194].setRotationPoint(-6F, -32F, -18F);
		bodyModel[194].rotateAngleZ = -0.12976348F;

		bodyModel[195].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 186
		bodyModel[195].setRotationPoint(-6F, -32F, -16F);
		bodyModel[195].rotateAngleZ = -0.12976348F;

		bodyModel[196].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[196].setRotationPoint(-6F, -32F, -15F);
		bodyModel[196].rotateAngleZ = -0.12976348F;

		bodyModel[197].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 192
		bodyModel[197].setRotationPoint(-6F, -32F, -13F);
		bodyModel[197].rotateAngleZ = -0.12976348F;

		bodyModel[198].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[198].setRotationPoint(-6F, -32F, -12F);
		bodyModel[198].rotateAngleZ = -0.12976348F;

		bodyModel[199].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[199].setRotationPoint(-6F, -32F, -10F);
		bodyModel[199].rotateAngleZ = -0.12976348F;

		bodyModel[200].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[200].setRotationPoint(-6F, -32F, -9F);
		bodyModel[200].rotateAngleZ = -0.12976348F;

		bodyModel[201].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 197
		bodyModel[201].setRotationPoint(-6F, -32F, -7F);
		bodyModel[201].rotateAngleZ = -0.12976348F;

		bodyModel[202].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[202].setRotationPoint(-6F, -32F, -6F);
		bodyModel[202].rotateAngleZ = -0.12976348F;

		bodyModel[203].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 200
		bodyModel[203].setRotationPoint(-6F, -32F, -4F);
		bodyModel[203].rotateAngleZ = -0.12976348F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 6, 14, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 204
		bodyModel[204].setRotationPoint(34F, -21F, 1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 33, 1, 34, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, -22F, 0F, 0F, -22F); // Box 0
		bodyModel[205].setRotationPoint(-6F, -33F, 0F);
		bodyModel[205].rotateAngleZ = -0.08726646F;

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[206].setRotationPoint(3.2F, -29.5F, -13F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 135
		bodyModel[207].setRotationPoint(4.5F, -21.5F, -39F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[208].setRotationPoint(4.5F, -21.5F, 17F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[209].setRotationPoint(-26.5F, -21.5F, 17F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 135
		bodyModel[210].setRotationPoint(-26.5F, -21.5F, -39F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[211].setRotationPoint(-40.5F, -21.5F, 17F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 135
		bodyModel[212].setRotationPoint(-40.5F, -21.5F, -39F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[213].setRotationPoint(17.5F, -21.5F, 17F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 135
		bodyModel[214].setRotationPoint(17.5F, -21.5F, -39F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[215].setRotationPoint(32.5F, -21.5F, 17F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 135
		bodyModel[216].setRotationPoint(32.5F, -21.5F, -39F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[217].setRotationPoint(10F, -5F, -37F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[218].setRotationPoint(27F, -5F, -37F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[219].setRotationPoint(-13F, -5F, -37F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[220].setRotationPoint(-37F, -5F, -37F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[221].setRotationPoint(-37F, -5F, 16F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[222].setRotationPoint(10F, -5F, 16F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[223].setRotationPoint(-13F, -5F, 16F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[224].setRotationPoint(27F, -5F, 16F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[225].setRotationPoint(-62F, -12.5F, -22F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[226].setRotationPoint(-62F, -10.5F, -22F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 194
		bodyModel[227].setRotationPoint(-62F, -8.5F, -22F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 195
		bodyModel[228].setRotationPoint(-63F, -8.5F, -21F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 196
		bodyModel[229].setRotationPoint(-63F, -8.5F, -5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[230].setRotationPoint(-62F, -14.5F, -2F);
		bodyModel[230].rotateAngleZ = 0.2443461F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[231].setRotationPoint(-58F, -6.5F, 7.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 76, 3, 8, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, -2F, 2F, 1F, -2F); // Box 290
		bodyModel[232].setRotationPoint(-42F, 3.5F, -26F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[233].setRotationPoint(31F, 5.5F, 15F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[234].setRotationPoint(20F, 5.5F, 15F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[235].setRotationPoint(-43F, 5.5F, 15F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[236].setRotationPoint(-32F, 5.5F, 15F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[237].setRotationPoint(10F, 5.5F, 15F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[238].setRotationPoint(-1F, 5.5F, 15F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[239].setRotationPoint(-11F, 5.5F, 15F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[240].setRotationPoint(-22F, 5.5F, 15F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 70
		bodyModel[241].setRotationPoint(24F, 0.5F, -27F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[242].setRotationPoint(23F, 4.5F, -28F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[243].setRotationPoint(30F, 4.5F, -28F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[244].setRotationPoint(20F, 5.5F, -32F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 76
		bodyModel[245].setRotationPoint(-39F, 0.5F, -27F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[246].setRotationPoint(-43F, 5.5F, -32F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[247].setRotationPoint(-32F, 5.5F, -32F);

		bodyModel[248].addShapeBox(-1F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 81
		bodyModel[248].setRotationPoint(-17F, 0.5F, -27F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 82
		bodyModel[249].setRotationPoint(3F, 0.5F, -27F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[250].setRotationPoint(10F, 5.5F, -32F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[251].setRotationPoint(-1F, 5.5F, -32F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[252].setRotationPoint(-11F, 5.5F, -32F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[253].setRotationPoint(-22F, 5.5F, -32F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 76, 3, 8, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 2F, 1F, -2F, 2F, 1F, -2F, 2F, 1F, 0F, 2F, 1F, 0F); // Box 96
		bodyModel[254].setRotationPoint(-42F, 3.5F, 8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[255].setRotationPoint(31F, 5.5F, -31F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 1
		bodyModel[256].setRotationPoint(24F, 0.5F, 14F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[257].setRotationPoint(23F, 4.5F, 16F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[258].setRotationPoint(30F, 4.5F, 16F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 4
		bodyModel[259].setRotationPoint(22F, 4.5F, 16F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 24
		bodyModel[260].setRotationPoint(-39F, 0.5F, 14F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[261].setRotationPoint(-33F, 4.5F, 16F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 26
		bodyModel[262].setRotationPoint(-41F, 4.5F, 16F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[263].setRotationPoint(-40F, 4.5F, 16F);

		bodyModel[264].addShapeBox(-1F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 34
		bodyModel[264].setRotationPoint(-17F, 0.5F, 14F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 50
		bodyModel[265].setRotationPoint(3F, 0.5F, 14F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[266].setRotationPoint(2F, 4.5F, 16F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[267].setRotationPoint(9F, 4.5F, 16F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 55
		bodyModel[268].setRotationPoint(1F, 4.5F, 16F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[269].setRotationPoint(-12F, 4.5F, 16F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[270].setRotationPoint(-19F, 4.5F, 16F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[271].setRotationPoint(-20F, 4.5F, 16F);

		bodyModel[272].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 93
		bodyModel[272].setRotationPoint(-60F, -19.5F, 13.5F);
		bodyModel[272].rotateAngleX = -0.06981317F;
		bodyModel[272].rotateAngleY = -1.57079633F;

		bodyModel[273].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 94
		bodyModel[273].setRotationPoint(-60F, -19.5F, 3.5F);
		bodyModel[273].rotateAngleX = -0.06981317F;
		bodyModel[273].rotateAngleY = -1.57079633F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 95
		bodyModel[274].setRotationPoint(-21F, -34F, -14F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 96
		bodyModel[275].setRotationPoint(-21F, -30F, -29F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -4F, 13F, 0F, -4F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 13F, 0F, 4F, 13F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[276].setRotationPoint(-26F, -34F, -15F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -4F, 13F, 0F, -4F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 13F, 0F, 4F, 13F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[277].setRotationPoint(-16F, -34F, -15F);

		bodyModel[278].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 8F, -0.2F, 14F, 0F, -0.2F, 14F, 0F, -0.2F, 0F, 8F, -0.2F, 0F, 8F, -0.2F, 14F, 0F, -0.2F, 14F, 0F, -0.2F, 0F, 8F, -0.2F, 0F); // Box 99
		bodyModel[278].setRotationPoint(-25F, -34F, -14F);
		bodyModel[278].rotateAngleX = 0.36651914F;
		bodyModel[278].rotateAngleY = 0.2443461F;
		bodyModel[278].rotateAngleZ = -0.6981317F;

		bodyModel[279].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[279].setRotationPoint(-6F, -32F, -18F);
		bodyModel[279].rotateAngleZ = -0.12976348F;

		bodyModel[280].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[280].setRotationPoint(-6F, -32F, -12F);
		bodyModel[280].rotateAngleZ = -0.12976348F;

		bodyModel[281].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[281].setRotationPoint(-6F, -32F, -15F);
		bodyModel[281].rotateAngleZ = -0.12976348F;

		bodyModel[282].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[282].setRotationPoint(-6F, -32F, -6F);
		bodyModel[282].rotateAngleZ = -0.12976348F;

		bodyModel[283].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[283].setRotationPoint(-6F, -32F, -9F);
		bodyModel[283].rotateAngleZ = -0.12976348F;

		bodyModel[284].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[284].setRotationPoint(34F, -14.5F, -10F);
		bodyModel[284].rotateAngleZ = -0.3217497F;

		bodyModel[285].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[285].setRotationPoint(34F, -14.5F, -4F);
		bodyModel[285].rotateAngleZ = -0.3217497F;

		bodyModel[286].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[286].setRotationPoint(34F, -14.5F, -7F);
		bodyModel[286].rotateAngleZ = -0.3217497F;

		bodyModel[287].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[287].setRotationPoint(34F, -14.5F, 2F);
		bodyModel[287].rotateAngleZ = -0.3217497F;

		bodyModel[288].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[288].setRotationPoint(34F, -14.5F, -1F);
		bodyModel[288].rotateAngleZ = -0.3217497F;

		bodyModel[289].addShapeBox(7F, -2.5F, -13F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[289].setRotationPoint(52F, -12F, -1F);
		bodyModel[289].rotateAngleZ = -1.80527957F;

		bodyModel[290].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[290].setRotationPoint(52F, -12F, 2F);
		bodyModel[290].rotateAngleZ = -1.80527957F;

		bodyModel[291].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[291].setRotationPoint(52F, -12F, -7F);
		bodyModel[291].rotateAngleZ = -1.80527957F;

		bodyModel[292].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[292].setRotationPoint(52F, -12F, -10F);
		bodyModel[292].rotateAngleZ = -1.80527957F;

		bodyModel[293].addShapeBox(7F, -2.5F, -13F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[293].setRotationPoint(52F, -12F, -10F);
		bodyModel[293].rotateAngleZ = -1.80527957F;

		bodyModel[294].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[294].setRotationPoint(52F, -12F, 12F);
		bodyModel[294].rotateAngleZ = -1.80527957F;

		bodyModel[295].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[295].setRotationPoint(52F, -12F, 9F);
		bodyModel[295].rotateAngleZ = -1.80527957F;

		bodyModel[296].addShapeBox(7F, -2.5F, -13F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[296].setRotationPoint(52F, -12F, 9F);
		bodyModel[296].rotateAngleZ = -1.80527957F;

		bodyModel[297].addShapeBox(7F, -2.5F, -13F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[297].setRotationPoint(52F, -12F, 18F);
		bodyModel[297].rotateAngleZ = -1.80527957F;

		bodyModel[298].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[298].setRotationPoint(52F, -12F, 18F);
		bodyModel[298].rotateAngleZ = -1.80527957F;

		bodyModel[299].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[299].setRotationPoint(52F, -12F, 21F);
		bodyModel[299].rotateAngleZ = -1.80527957F;

		bodyModel[300].addShapeBox(1F, -31F, -11F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[300].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[300].rotateAngleZ = -0.29670597F;

		bodyModel[301].addShapeBox(7F, -31F, -11F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[301].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[301].rotateAngleZ = -0.29670597F;

		bodyModel[302].addShapeBox(4F, -31F, -11F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[302].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[302].rotateAngleZ = -0.29670597F;

		bodyModel[303].addShapeBox(13F, -31F, -11F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[303].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[303].rotateAngleZ = -0.29670597F;

		bodyModel[304].addShapeBox(10F, -31F, -11F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[304].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[304].rotateAngleZ = -0.29670597F;

		bodyModel[305].addShapeBox(13F, -31F, 21F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[305].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[305].rotateAngleZ = -0.29670597F;

		bodyModel[306].addShapeBox(10F, -31F, 21F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[306].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[306].rotateAngleZ = -0.29670597F;

		bodyModel[307].addShapeBox(7F, -31F, 21F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[307].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[307].rotateAngleZ = -0.29670597F;

		bodyModel[308].addShapeBox(4F, -31F, 21F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[308].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[308].rotateAngleZ = -0.29670597F;

		bodyModel[309].addShapeBox(1F, -31F, 21F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[309].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[309].rotateAngleZ = -0.29670597F;

		bodyModel[310].addShapeBox(-2F, -31F, 21F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[310].setRotationPoint(-1F, -0.5F, -12F);
		bodyModel[310].rotateAngleZ = -0.29670597F;

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 149
		bodyModel[311].setRotationPoint(-3F, -23.5F, -39F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 378
		bodyModel[312].setRotationPoint(-24F, -23.5F, -39F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[313].setRotationPoint(-24F, -23.5F, 20F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[314].setRotationPoint(-3F, -23.5F, 20F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 166
		bodyModel[315].setRotationPoint(-21.5F, -18.5F, -37F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[316].setRotationPoint(-22.5F, -20.5F, -37F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[317].setRotationPoint(-22.5F, -23.5F, -37F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[318].setRotationPoint(-22.5F, -25.5F, -37F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[319].setRotationPoint(-21.5F, -26.5F, -37F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 174
		bodyModel[320].setRotationPoint(-11F, -22F, -35F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[321].setRotationPoint(-11F, -24F, -35F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[322].setRotationPoint(-11F, -26F, -35F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[323].setRotationPoint(-21F, -26F, -35F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 158
		bodyModel[324].setRotationPoint(-21F, -22F, -35F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[325].setRotationPoint(-21F, -24F, -35F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[326].setRotationPoint(-11.5F, -26.5F, -37F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[327].setRotationPoint(-12.5F, -25.5F, -37F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[328].setRotationPoint(-12.5F, -23.5F, -37F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 163
		bodyModel[329].setRotationPoint(-12.5F, -20.5F, -37F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 164
		bodyModel[330].setRotationPoint(-11.5F, -18.5F, -37F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[331].setRotationPoint(-11.5F, -26.5F, -34F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[332].setRotationPoint(-12.5F, -25.5F, -34F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[333].setRotationPoint(-12.5F, -23.5F, -34F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[334].setRotationPoint(-12.5F, -20.5F, -34F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 169
		bodyModel[335].setRotationPoint(-11.5F, -18.5F, -34F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[336].setRotationPoint(-21.5F, -26.5F, -34F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[337].setRotationPoint(-22.5F, -25.5F, -34F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[338].setRotationPoint(-22.5F, -23.5F, -34F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 173
		bodyModel[339].setRotationPoint(-22.5F, -20.5F, -34F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 174
		bodyModel[340].setRotationPoint(-21.5F, -18.5F, -34F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[341].setRotationPoint(41F, -18F, 20.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 176
		bodyModel[342].setRotationPoint(41F, -16F, 20.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 35, 1, 35, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F); // Box 0
		bodyModel[343].setRotationPoint(-38F, -19F, 29.7F);
		bodyModel[343].rotateAngleY = -1.57079633F;
		bodyModel[343].rotateAngleZ = 1.72787596F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 35, 1, 35, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F); // Box 0
		bodyModel[344].setRotationPoint(15F, -27F, -40.9F);
		bodyModel[344].rotateAngleY = -1.57079633F;
		bodyModel[344].rotateAngleZ = -1.72787596F;


		turretModel = new ModelRendererTurbo[2];
		turretModel[0] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 17
		turretModel[1] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 19

		turretModel[0].addBox(-11F, -11F, 13F, 1, 4, 1, 0F); // Box 17
		turretModel[0].setRotationPoint(10F, -24.5F, -8F);

		turretModel[1].addShapeBox(-11F, -12F, 13F, 3, 1, 1, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 19
		turretModel[1].setRotationPoint(10F, -24.5F, -8F);


		barrelModel = new ModelRendererTurbo[26];
		barrelModel[0] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 219
		barrelModel[1] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 220
		barrelModel[2] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 221
		barrelModel[3] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 222
		barrelModel[4] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Box 223
		barrelModel[5] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 224
		barrelModel[6] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 225
		barrelModel[7] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 226
		barrelModel[8] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 227
		barrelModel[9] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 228
		barrelModel[10] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // Box 229
		barrelModel[11] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 230
		barrelModel[12] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 231
		barrelModel[13] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 239
		barrelModel[14] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 242
		barrelModel[15] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 243
		barrelModel[16] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 244
		barrelModel[17] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 245
		barrelModel[18] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 246
		barrelModel[19] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 247
		barrelModel[20] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 248
		barrelModel[21] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 249
		barrelModel[22] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 250
		barrelModel[23] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 68
		barrelModel[24] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 237
		barrelModel[25] = new ModelRendererTurbo(this, 150, 448, textureX, textureY); // Box 238

		barrelModel[0].addShapeBox(7F, -2F, -4F, 6, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		barrelModel[0].setRotationPoint(-5F, -24.5F, -8F);

		barrelModel[1].addShapeBox(7F, -4F, -4F, 6, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		barrelModel[1].setRotationPoint(-5F, -24.5F, -8F);

		barrelModel[2].addShapeBox(7F, 2F, -4F, 6, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 221
		barrelModel[2].setRotationPoint(-5F, -24.5F, -8F);

		barrelModel[3].addShapeBox(13F, -6F, -8F, 1, 8, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		barrelModel[3].setRotationPoint(-5F, -24.5F, -8F);

		barrelModel[4].addShapeBox(13F, -7F, -8F, 1, 1, 16, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 223
		barrelModel[4].setRotationPoint(-5F, -24.5F, -8F);

		barrelModel[5].addShapeBox(13F, 2F, -8F, 1, 6, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 224
		barrelModel[5].setRotationPoint(-5F, -24.5F, -8F);

		barrelModel[6].addShapeBox(13F, -5F, -5.5F, 8, 4, 11, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		barrelModel[6].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[7].addShapeBox(13F, -1F, -5.5F, 8, 7, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 226
		barrelModel[7].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[8].addShapeBox(21F, -5F, -5.5F, 6, 4, 11, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 227
		barrelModel[8].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[9].addShapeBox(21F, 2F, -5.5F, 6, 4, 11, 0F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F); // Box 228
		barrelModel[9].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[10].addShapeBox(27F, -1F, -3.5F, 8, 3, 7, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		barrelModel[10].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[11].addShapeBox(27F, 2F, -3.5F, 8, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 230
		barrelModel[11].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[12].addShapeBox(35F, 0.5F, -1.5F, 32, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		barrelModel[12].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[13].addShapeBox(72F, -0.5F, -2.5F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		barrelModel[13].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[14].addShapeBox(72F, 0.5F, 1.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		barrelModel[14].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[15].addShapeBox(72F, 0.5F, -2.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		barrelModel[15].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[16].addShapeBox(72F, 3.5F, -2.5F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 244
		barrelModel[16].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[17].addShapeBox(75F, -0.5F, -2.5F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		barrelModel[17].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[18].addShapeBox(75F, 3.5F, -2.5F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 246
		barrelModel[18].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[19].addShapeBox(75F, 0.5F, 1.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		barrelModel[19].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[20].addShapeBox(75F, 0.5F, -2.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		barrelModel[20].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[21].addShapeBox(73F, -0.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		barrelModel[21].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[22].addShapeBox(73F, 3.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		barrelModel[22].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[23].addShapeBox(67F, 0.5F, -1.5F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 68
		barrelModel[23].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[24].addShapeBox(69F, 0F, -1F, 3, 1, 2, 0F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.3F, 0.8F, 0F, -0.7F, 0.8F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.7F, 0.8F); // Box 237
		barrelModel[24].setRotationPoint(-4F, -24.5F, -8F);

		barrelModel[25].addShapeBox(69F, 3F, -1F, 3, 1, 2, 0F, 0F, -0.7F, 0.7F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.7F, 0.7F, 0F, -0.3F, 0.7F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.3F, 0.7F); // Box 238
		barrelModel[25].setRotationPoint(-4F, -24.5F, -8F);


		leftTrackWheelModels = new ModelRendererTurbo[20];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 270, 490, textureX, textureY); // Shape 6
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 270, 490, textureX, textureY); // Shape 17
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 270, 490, textureX, textureY); // Shape 18
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 270, 490, textureX, textureY); // Shape 19
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 7
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 30
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 31
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 33
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 48
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 49
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 56
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 62
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 63
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 64
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 65
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 66
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 67
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 68
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 69
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 235, 490, textureX, textureY); // Shape 0

		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 7, 13, 13, 48, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 6
		leftTrackWheelModels[0].setRotationPoint(45.5F, -3.5F, 23F);

		leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 7, 13, 13, 48, 7, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 17
		leftTrackWheelModels[1].setRotationPoint(45.5F, -3.5F, -27F);

		leftTrackWheelModels[2].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 5, 13, 13, 48, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 18
		leftTrackWheelModels[2].setRotationPoint(-56.5F, -2.5F, -28F);

		leftTrackWheelModels[3].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 5, 13, 13, 48, 5, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 19
		leftTrackWheelModels[3].setRotationPoint(-57F, -2.5F, 22F);

		leftTrackWheelModels[4].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 7
		leftTrackWheelModels[4].setRotationPoint(21F, 6.5F, 19.5F);

		leftTrackWheelModels[5].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 30
		leftTrackWheelModels[5].setRotationPoint(-31F, 6.5F, 19.5F);

		leftTrackWheelModels[6].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 31
		leftTrackWheelModels[6].setRotationPoint(-42F, 6.5F, 19.5F);

		leftTrackWheelModels[7].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 33
		leftTrackWheelModels[7].setRotationPoint(-20F, 6.5F, 19.5F);

		leftTrackWheelModels[8].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 48
		leftTrackWheelModels[8].setRotationPoint(11F, 6.5F, 19.5F);

		leftTrackWheelModels[9].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 49
		leftTrackWheelModels[9].setRotationPoint(0F, 6.5F, 19.5F);

		leftTrackWheelModels[10].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 56
		leftTrackWheelModels[10].setRotationPoint(-10F, 6.5F, 19.5F);

		leftTrackWheelModels[11].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 62
		leftTrackWheelModels[11].setRotationPoint(32F, 6.5F, -32.5F);

		leftTrackWheelModels[12].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 63
		leftTrackWheelModels[12].setRotationPoint(21F, 6.5F, -32.5F);

		leftTrackWheelModels[13].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 64
		leftTrackWheelModels[13].setRotationPoint(11F, 6.5F, -32.5F);

		leftTrackWheelModels[14].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 65
		leftTrackWheelModels[14].setRotationPoint(0F, 6.5F, -32.5F);

		leftTrackWheelModels[15].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 66
		leftTrackWheelModels[15].setRotationPoint(-10F, 6.5F, -32.5F);

		leftTrackWheelModels[16].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 67
		leftTrackWheelModels[16].setRotationPoint(-20F, 6.5F, -32.5F);

		leftTrackWheelModels[17].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 68
		leftTrackWheelModels[17].setRotationPoint(-31F, 6.5F, -32.5F);

		leftTrackWheelModels[18].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 69
		leftTrackWheelModels[18].setRotationPoint(-42F, 6.5F, -32.5F);

		leftTrackWheelModels[19].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[]{new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2)}), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[]{3, 5, 3, 5, 3, 5, 3, 5}); // Shape 0
		leftTrackWheelModels[19].setRotationPoint(32F, 6.5F, 19.5F);


		rightTrackModel = new ModelRendererTurbo[18];
		rightTrackModel[0] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 291
		rightTrackModel[1] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 292
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 293
		rightTrackModel[3] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Box 294
		rightTrackModel[4] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Box 295
		rightTrackModel[5] = new ModelRendererTurbo(this, 256, 305, textureX, textureY); // Box 296
		rightTrackModel[6] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 297
		rightTrackModel[7] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 298
		rightTrackModel[8] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 299
		rightTrackModel[9] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Box 68
		rightTrackModel[10] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 69
		rightTrackModel[11] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 70
		rightTrackModel[12] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 71
		rightTrackModel[13] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Box 72
		rightTrackModel[14] = new ModelRendererTurbo(this, 256, 305, textureX, textureY); // Box 73
		rightTrackModel[15] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 74
		rightTrackModel[16] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 75
		rightTrackModel[17] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 76

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackModel[0].setRotationPoint(50F, -11F, 16F);
		rightTrackModel[0].rotateAngleZ = -1.04719755F;

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 110, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackModel[1].setRotationPoint(-60F, -11.1F, 16F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightTrackModel[2].setRotationPoint(54F, -4F, 16F);
		rightTrackModel[2].rotateAngleZ = -1.95476876F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackModel[3].setRotationPoint(51F, 3.4F, 16F);
		rightTrackModel[3].rotateAngleZ = -2.67035376F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 77, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		rightTrackModel[4].setRotationPoint(34F, 12F, 16F);
		rightTrackModel[4].rotateAngleZ = -3.14159265F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightTrackModel[5].setRotationPoint(-43F, 12F, 16F);
		rightTrackModel[5].rotateAngleZ = -3.43829863F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightTrackModel[6].setRotationPoint(-64.7F, 1.3F, 16F);
		rightTrackModel[6].rotateAngleZ = -4.72984227F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		rightTrackModel[7].setRotationPoint(-60.2F, 6.7F, 16F);
		rightTrackModel[7].rotateAngleZ = -4.01425728F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightTrackModel[8].setRotationPoint(-64.7F, -5.7F, 16F);
		rightTrackModel[8].rotateAngleZ = -5.44542727F;

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 77, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		rightTrackModel[9].setRotationPoint(34F, 12F, -35F);
		rightTrackModel[9].rotateAngleZ = -3.14159265F;

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		rightTrackModel[10].setRotationPoint(50F, -11F, -35F);
		rightTrackModel[10].rotateAngleZ = -1.04719755F;

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 110, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightTrackModel[11].setRotationPoint(-60F, -11.1F, -35F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightTrackModel[12].setRotationPoint(54F, -4F, -35F);
		rightTrackModel[12].rotateAngleZ = -1.95476876F;

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		rightTrackModel[13].setRotationPoint(51F, 3.4F, -35F);
		rightTrackModel[13].rotateAngleZ = -2.67035376F;

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightTrackModel[14].setRotationPoint(-43F, 12F, -35F);
		rightTrackModel[14].rotateAngleZ = -3.43829863F;

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightTrackModel[15].setRotationPoint(-64.7F, 1.3F, -35F);
		rightTrackModel[15].rotateAngleZ = -4.72984227F;

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		rightTrackModel[16].setRotationPoint(-60.2F, 6.7F, -35F);
		rightTrackModel[16].rotateAngleZ = -4.01425728F;

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		rightTrackModel[17].setRotationPoint(-64.7F, -5.7F, -35F);
		rightTrackModel[17].rotateAngleZ = -5.44542727F;


		steeringWheelModel = new ModelRendererTurbo[5];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 387, 485, textureX, textureY); // Box 17
		steeringWheelModel[1] = new ModelRendererTurbo(this, 389, 462, textureX, textureY); // Box 18
		steeringWheelModel[2] = new ModelRendererTurbo(this, 460, 454, textureX, textureY); // Box 19
		steeringWheelModel[3] = new ModelRendererTurbo(this, 428, 463, textureX, textureY); // Box 21
		steeringWheelModel[4] = new ModelRendererTurbo(this, 449, 460, textureX, textureY); // Box 0

		steeringWheelModel[0].addShapeBox(-6F, 4.5F, -3F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 17
		steeringWheelModel[0].setRotationPoint(-55F, -7F, 8F);

		steeringWheelModel[1].addShapeBox(-6F, 3.5F, -3F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 18
		steeringWheelModel[1].setRotationPoint(-55F, -7F, 8F);

		steeringWheelModel[2].addShapeBox(-4F, -0.5F, -3F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		steeringWheelModel[2].setRotationPoint(-55F, -7F, 8F);

		steeringWheelModel[3].addShapeBox(-1F, -0.5F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		steeringWheelModel[3].setRotationPoint(-55F, -7F, 8F);

		steeringWheelModel[4].addShapeBox(-4F, -0.5F, 2F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		steeringWheelModel[4].setRotationPoint(-55F, -7F, 8F);


		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[13];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 421, 476, textureX, textureY); // Box 4
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 453, 476, textureX, textureY); // Box 5
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 469, 476, textureX, textureY); // Box 6
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 421, 484, textureX, textureY); // Box 7
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 429, 484, textureX, textureY); // Box 8
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 437, 484, textureX, textureY); // Box 9
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 445, 484, textureX, textureY); // Box 10
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 453, 484, textureX, textureY); // Box 12
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 461, 484, textureX, textureY); // Box 13
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 477, 484, textureX, textureY); // Box 15
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 421, 492, textureX, textureY); // Box 16
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 429, 492, textureX, textureY); // Box 17
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 453, 492, textureX, textureY); // Box 0

		gun_1_Model[1][0].addShapeBox(-2F, -1F, -0.5F, 12, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 4

		gun_1_Model[1][1].addShapeBox(-5F, -1F, -0.5F, 3, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 5

		gun_1_Model[1][2].addShapeBox(-10F, -1F, -0.5F, 5, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.2F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.2F); // Box 6

		gun_1_Model[1][3].addShapeBox(11F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Box 7

		gun_1_Model[1][4].addShapeBox(10F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Box 8

		gun_1_Model[1][5].addShapeBox(-3F, -1.2F, -2F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 9

		gun_1_Model[1][6].addShapeBox(-3F, -1.2F, -1.5F, 1, 2, 1, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 10

		gun_1_Model[1][7].addShapeBox(9F, -2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 12

		gun_1_Model[1][8].addShapeBox(-1F, -1.7F, -1F, 2, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 13

		gun_1_Model[1][9].addShapeBox(-7.9F, -1.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_1_Model[1][10].addShapeBox(-12F, -1F, -0.5F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1F, 0F); // Box 16

		gun_1_Model[1][11].addShapeBox(-9F, 0.5F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -0.2F); // Box 17

		gun_1_Model[1][12].addShapeBox(-2F, -1F, -0.5F, 12, 1, 1, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F); // Box 0

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(-5F, -37F, -20F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[3];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 437, 492, textureX, textureY); // Box 18
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 445, 476, textureX, textureY); // Box 19
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 421, 500, textureX, textureY); // Box 1

		gun_1_Model[2][0].addShapeBox(-4.5F, -1F, 1F, 2, 3, 4, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 18

		gun_1_Model[2][1].addShapeBox(-4.5F, -1.5F, 1F, 2, 1, 3, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_1_Model[2][2].addShapeBox(-4.5F, -1.06F, 1F, 2, 3, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 1

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-5F, -37F, -20F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
