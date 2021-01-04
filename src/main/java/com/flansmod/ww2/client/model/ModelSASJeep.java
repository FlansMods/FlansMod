//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelSASJeep extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	public ModelSASJeep() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[354];
		bodyModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 2
		bodyModel[26] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 2
		bodyModel[52] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 2
		bodyModel[54] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 2
		bodyModel[55] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 2
		bodyModel[56] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 2
		bodyModel[57] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 2
		bodyModel[58] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 2
		bodyModel[60] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 2
		bodyModel[61] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 2
		bodyModel[62] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 2
		bodyModel[63] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 2
		bodyModel[64] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 2
		bodyModel[65] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 2
		bodyModel[68] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 2
		bodyModel[69] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 2
		bodyModel[70] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 2
		bodyModel[72] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 2
		bodyModel[73] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 2
		bodyModel[75] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 2
		bodyModel[78] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 2
		bodyModel[79] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 2
		bodyModel[82] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 2
		bodyModel[84] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 2
		bodyModel[85] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 2
		bodyModel[86] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 2
		bodyModel[87] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 2
		bodyModel[88] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 2
		bodyModel[90] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 2
		bodyModel[95] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 2
		bodyModel[98] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 2
		bodyModel[99] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 2
		bodyModel[100] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 2
		bodyModel[101] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 2
		bodyModel[102] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 2
		bodyModel[103] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 2
		bodyModel[104] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 2
		bodyModel[105] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 2
		bodyModel[106] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 2
		bodyModel[107] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 2
		bodyModel[108] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 2
		bodyModel[109] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 2
		bodyModel[110] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 2
		bodyModel[111] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 2
		bodyModel[112] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 2
		bodyModel[113] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 2
		bodyModel[114] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 2
		bodyModel[115] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 2
		bodyModel[116] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 2
		bodyModel[117] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 2
		bodyModel[118] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 2
		bodyModel[119] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 2
		bodyModel[120] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 2
		bodyModel[121] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 2
		bodyModel[122] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 2
		bodyModel[123] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 2
		bodyModel[125] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 2
		bodyModel[126] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 2
		bodyModel[127] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 2
		bodyModel[128] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 2
		bodyModel[129] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 2
		bodyModel[130] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 2
		bodyModel[131] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 2
		bodyModel[132] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 2
		bodyModel[133] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 2
		bodyModel[134] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 2
		bodyModel[135] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 2
		bodyModel[136] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 2
		bodyModel[137] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 2
		bodyModel[138] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 2
		bodyModel[139] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 2
		bodyModel[140] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 2
		bodyModel[141] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 2
		bodyModel[142] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 2
		bodyModel[143] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 2
		bodyModel[144] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 2
		bodyModel[145] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 2
		bodyModel[146] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 2
		bodyModel[147] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 2
		bodyModel[148] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 2
		bodyModel[149] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 2
		bodyModel[151] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 2
		bodyModel[152] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 2
		bodyModel[153] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 2
		bodyModel[154] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 2
		bodyModel[155] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 2
		bodyModel[156] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 2
		bodyModel[159] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 2
		bodyModel[160] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 2
		bodyModel[161] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 2
		bodyModel[163] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 2
		bodyModel[164] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 2
		bodyModel[165] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 2
		bodyModel[166] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 2
		bodyModel[167] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 2
		bodyModel[168] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 2
		bodyModel[169] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 2
		bodyModel[170] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 2
		bodyModel[171] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 2
		bodyModel[172] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 2
		bodyModel[173] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 2
		bodyModel[174] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 2
		bodyModel[175] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 2
		bodyModel[176] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 2
		bodyModel[177] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 2
		bodyModel[178] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 2
		bodyModel[179] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 2
		bodyModel[180] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 2
		bodyModel[181] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 2
		bodyModel[182] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 2
		bodyModel[183] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 2
		bodyModel[184] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 2
		bodyModel[185] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 2
		bodyModel[186] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 2
		bodyModel[187] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 2
		bodyModel[188] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 2
		bodyModel[189] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 2
		bodyModel[190] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 2
		bodyModel[191] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 2
		bodyModel[194] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 2
		bodyModel[195] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 2
		bodyModel[196] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 2
		bodyModel[197] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 2
		bodyModel[198] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 2
		bodyModel[199] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 2
		bodyModel[200] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 2
		bodyModel[201] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 2
		bodyModel[202] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 2
		bodyModel[203] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 2
		bodyModel[204] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 2
		bodyModel[205] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 2
		bodyModel[206] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 2
		bodyModel[207] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 2
		bodyModel[208] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 2
		bodyModel[209] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 2
		bodyModel[210] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 2
		bodyModel[211] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 2
		bodyModel[212] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 2
		bodyModel[213] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 2
		bodyModel[214] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 2
		bodyModel[215] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 2
		bodyModel[216] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 2
		bodyModel[217] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 2
		bodyModel[218] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 2
		bodyModel[219] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 2
		bodyModel[220] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 2
		bodyModel[221] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 2
		bodyModel[222] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		bodyModel[223] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 2
		bodyModel[224] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 2
		bodyModel[225] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 2
		bodyModel[226] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 2
		bodyModel[227] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 2
		bodyModel[228] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 2
		bodyModel[229] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 2
		bodyModel[230] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 2
		bodyModel[231] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 2
		bodyModel[232] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 2
		bodyModel[233] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 2
		bodyModel[234] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 2
		bodyModel[235] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 2
		bodyModel[236] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 2
		bodyModel[237] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 2
		bodyModel[238] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 2
		bodyModel[239] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 2
		bodyModel[240] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 2
		bodyModel[241] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 2
		bodyModel[243] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 2
		bodyModel[244] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 2
		bodyModel[245] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 211
		bodyModel[246] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 212
		bodyModel[247] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 213
		bodyModel[248] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 214
		bodyModel[249] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 215
		bodyModel[250] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 216
		bodyModel[251] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 217
		bodyModel[252] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 218
		bodyModel[253] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 219
		bodyModel[254] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 220
		bodyModel[255] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 221
		bodyModel[256] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 222
		bodyModel[257] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 223
		bodyModel[258] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 224
		bodyModel[259] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 225
		bodyModel[260] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 226
		bodyModel[261] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 227
		bodyModel[262] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 228
		bodyModel[263] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 229
		bodyModel[264] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 230
		bodyModel[265] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 231
		bodyModel[266] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 232
		bodyModel[267] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 233
		bodyModel[268] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 234
		bodyModel[269] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 235
		bodyModel[270] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 236
		bodyModel[271] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 237
		bodyModel[272] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 2
		bodyModel[273] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 2
		bodyModel[274] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 2
		bodyModel[275] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 2
		bodyModel[276] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 2
		bodyModel[277] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 2
		bodyModel[278] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 2
		bodyModel[279] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 2
		bodyModel[280] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 246
		bodyModel[281] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 247
		bodyModel[282] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 248
		bodyModel[283] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 249
		bodyModel[284] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 250
		bodyModel[285] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 251
		bodyModel[286] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 252
		bodyModel[287] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 253
		bodyModel[288] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 254
		bodyModel[289] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 255
		bodyModel[290] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 273
		bodyModel[291] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 274
		bodyModel[292] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 275
		bodyModel[293] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 276
		bodyModel[294] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 277
		bodyModel[295] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 278
		bodyModel[296] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 279
		bodyModel[297] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 280
		bodyModel[298] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 282
		bodyModel[299] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 283
		bodyModel[300] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 284
		bodyModel[301] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 285
		bodyModel[302] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 286
		bodyModel[303] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 287
		bodyModel[304] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 312
		bodyModel[305] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 313
		bodyModel[306] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 314
		bodyModel[307] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 315
		bodyModel[308] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 316
		bodyModel[309] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 317
		bodyModel[310] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Import Grip
		bodyModel[311] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Barrel
		bodyModel[312] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Import UnderGrip
		bodyModel[313] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Import FiringMechanism
		bodyModel[314] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Import Stock
		bodyModel[315] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import Stock
		bodyModel[316] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Import Stock
		bodyModel[317] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Import Stock
		bodyModel[318] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Import Stock
		bodyModel[319] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import StockEnd
		bodyModel[320] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Import SightFront
		bodyModel[321] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Import SightRear
		bodyModel[322] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Import Magazine
		bodyModel[323] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 331
		bodyModel[324] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 332
		bodyModel[325] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 333
		bodyModel[326] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 334
		bodyModel[327] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 335
		bodyModel[328] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 336
		bodyModel[329] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 337
		bodyModel[330] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 338
		bodyModel[331] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 339
		bodyModel[332] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 340
		bodyModel[333] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 341
		bodyModel[334] = new ModelRendererTurbo(this, 25, 233, textureX, textureY); // Box 342
		bodyModel[335] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 343
		bodyModel[336] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 344
		bodyModel[337] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 345
		bodyModel[338] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 346
		bodyModel[339] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Box 347
		bodyModel[340] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 348
		bodyModel[341] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 349
		bodyModel[342] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 350
		bodyModel[343] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 351
		bodyModel[344] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 352
		bodyModel[345] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 353
		bodyModel[346] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 354
		bodyModel[347] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 355
		bodyModel[348] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 356
		bodyModel[349] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 357
		bodyModel[350] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 358
		bodyModel[351] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 359
		bodyModel[352] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Shape 4
		bodyModel[353] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Shape 5
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(8F, -16F, 0F);
		
		bodyModel[1].addShapeBox(0F, 0F, 0F, 19, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F); // Box 2
		bodyModel[1].setRotationPoint(14F, -16F, 0F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 3, 13, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(14F, -14F, 0F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 2
		bodyModel[3].setRotationPoint(8F, -14F, 0F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 11, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2
		bodyModel[4].setRotationPoint(8F, -11F, 0F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 2
		bodyModel[5].setRotationPoint(14F, -11F, 0F);
		
		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 4, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 2
		bodyModel[6].setRotationPoint(-3F, -4F, 0F);
		
		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 4, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(-11F, -4F, 0F);
		
		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 2
		bodyModel[8].setRotationPoint(-3F, -8F, 13F);
		
		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-11F, -8F, 16F);
		
		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[10].setRotationPoint(-11F, -15F, 16F);
		
		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, -3.99999F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-7F, -12F, 16F);
		
		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 2
		bodyModel[12].setRotationPoint(-32F, -15F, 16F);
		
		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.99999F, 0F); // Box 2
		bodyModel[13].setRotationPoint(-16F, -10F, 16F);
		
		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.99999F, 0F, 0F, -4.99999F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[14].setRotationPoint(-30F, -10F, 16F);
		
		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(-32F, -10F, 16F);
		
		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[16].setRotationPoint(-34F, -15F, 14F);
		
		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[17].setRotationPoint(18F, -11F, 11F);
		
		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(28F, -11F, 11F);
		
		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 10, 5, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(13F, -11F, 12F);
		
		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F); // Box 2
		bodyModel[20].setRotationPoint(5F, -2F, 11F);
		
		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[21].setRotationPoint(33F, -2F, 6.5F);
		
		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		bodyModel[22].setRotationPoint(39F, -2F, 5.5F);
		
		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[23].setRotationPoint(33F, -16F, 0F);
		
		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[24].setRotationPoint(33F, -15F, 9F);
		
		bodyModel[25].addShapeBox(0F, 0F, 0F, 19, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 2
		bodyModel[25].setRotationPoint(14F, -7F, 0F);
		
		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[26].setRotationPoint(33F, -13F, 10F);
		
		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, 0F, 0F, -2F); // Box 2
		bodyModel[27].setRotationPoint(33F, -11F, 8F);
		
		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[28].setRotationPoint(33F, -7F, 4F);
		
		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[29].setRotationPoint(33F, -15F, 4F);
		
		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 2
		bodyModel[30].setRotationPoint(33F, -15F, 8F);
		
		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[31].setRotationPoint(33F, -15F, 0F);
		
		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[32].setRotationPoint(33F, -14F, 0.5F);
		
		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[33].setRotationPoint(34F, -13.5F, 6.25F);
		
		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[34].setRotationPoint(34F, -13.5F, 5.25F);
		
		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[35].setRotationPoint(34F, -13.5F, 8.25F);
		
		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[36].setRotationPoint(33.5F, -8.5F, 4.5F);
		
		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[37].setRotationPoint(33.5F, -8.5F, 5.5F);
		
		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[38].setRotationPoint(33.5F, -8.5F, 6.5F);
		
		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[39].setRotationPoint(33F, -7F, 8F);
		
		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[40].setRotationPoint(-34.5F, -7.5F, 15F);
		
		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[41].setRotationPoint(-34.5F, -7.5F, 14F);
		
		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[42].setRotationPoint(-34.5F, -7.5F, 13F);
		
		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[43].setRotationPoint(-38F, -3F, 4F);
		
		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[44].setRotationPoint(-38F, -3F, 11F);
		
		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[45].setRotationPoint(-38F, -3F, 5F);
		
		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[46].setRotationPoint(-36F, -2F, -4F);
		
		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[47].setRotationPoint(-11F, -6F, 12F);
		
		bodyModel[48].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[48].setRotationPoint(-32F, -13F, 8F);
		
		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[49].setRotationPoint(-33F, -13F, 8F);
		
		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 2
		bodyModel[50].setRotationPoint(-15F, -13F, 8F);
		
		bodyModel[51].addShapeBox(0F, 0F, 0F, 22, 6, 4, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[51].setRotationPoint(-33F, -12F, 8F);
		
		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[52].setRotationPoint(-32.5F, -19F, 8F);
		
		bodyModel[53].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[53].setRotationPoint(-10F, -8F, 2F);
		
		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 11, 11, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F); // Box 2
		bodyModel[54].setRotationPoint(-15F, -19F, 2F);
		
		bodyModel[55].addShapeBox(0F, 0F, 0F, 27, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[55].setRotationPoint(-11F, -1F, 6.5F);
		
		bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[56].setRotationPoint(16F, -1F, 6.5F);
		
		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 2
		bodyModel[57].setRotationPoint(-19F, -1F, 6.5F);
		
		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[58].setRotationPoint(26F, 0F, 6.5F);
		
		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[59].setRotationPoint(-23F, 0F, 6.5F);
		
		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[60].setRotationPoint(3F, 0F, 8.5F);
		
		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[61].setRotationPoint(3F, 1F, 8.5F);
		
		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[62].setRotationPoint(5F, 1F, 8.5F);
		
		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[63].setRotationPoint(-34F, 0F, 6.5F);
		
		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[64].setRotationPoint(8F, -16F, -13F);
		
		bodyModel[65].addShapeBox(0F, 0F, 0F, 19, 3, 13, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[65].setRotationPoint(14F, -16F, -13F);
		
		bodyModel[66].addShapeBox(0F, 0F, 0F, 19, 3, 13, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[66].setRotationPoint(14F, -14F, -13F);
		
		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[67].setRotationPoint(8F, -14F, -13F);
		
		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 11, 14, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[68].setRotationPoint(8F, -11F, -14F);
		
		bodyModel[69].addShapeBox(0F, 0F, 0F, 19, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[69].setRotationPoint(14F, -11F, -13F);
		
		bodyModel[70].addShapeBox(0F, 0F, 0F, 11, 4, 17, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[70].setRotationPoint(-3F, -4F, -17F);
		
		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 4, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[71].setRotationPoint(-11F, -4F, -17F);
		
		bodyModel[72].addShapeBox(0F, 0F, 0F, 19, 4, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[72].setRotationPoint(-30F, -4F, -12F);
		
		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 4, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[73].setRotationPoint(-35F, -4F, -17F);
		
		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 2
		bodyModel[74].setRotationPoint(-3F, -8F, -17F);
		
		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[75].setRotationPoint(-11F, -8F, -17F);
		
		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[76].setRotationPoint(-11F, -15F, -17F);
		
		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, -3.99999F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[77].setRotationPoint(-7F, -12F, -17F);
		
		bodyModel[78].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Box 2
		bodyModel[78].setRotationPoint(-32F, -15F, -17F);
		
		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.99999F, 0F); // Box 2
		bodyModel[79].setRotationPoint(-16F, -10F, -17F);
		
		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.99999F, 0F, 0F, -4.99999F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[80].setRotationPoint(-30F, -10F, -17F);
		
		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[81].setRotationPoint(-32F, -10F, -17F);
		
		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F, -2F, 0F, -0.01F, 0F, 0F, -0.01F, -2F, 0F, -0.01F, 0F, 0F, -0.01F, -2F, 0F, -0.01F, 0F, 0F, -0.01F, -2F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 2
		bodyModel[82].setRotationPoint(-34F, -15F, -17F);
		
		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 11, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[83].setRotationPoint(-34F, -15F, -14F);
		
		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[84].setRotationPoint(18F, -11F, -17F);
		
		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[85].setRotationPoint(28F, -11F, -17F);
		
		bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 10, 5, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[86].setRotationPoint(13F, -11F, -17F);
		
		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[87].setRotationPoint(5F, -2F, -17F);
		
		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[88].setRotationPoint(7F, -16F, -13F);
		
		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[89].setRotationPoint(7F, -14F, -13F);
		
		bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[90].setRotationPoint(33F, -2F, -8.5F);
		
		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		bodyModel[91].setRotationPoint(39F, -2F, -9.5F);
		
		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 3, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[92].setRotationPoint(41F, -3F, -13F);
		
		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[93].setRotationPoint(33F, -16F, -10F);
		
		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[94].setRotationPoint(33F, -15F, -11F);
		
		bodyModel[95].addShapeBox(0F, 0F, 0F, 19, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[95].setRotationPoint(14F, -7F, -13F);
		
		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[96].setRotationPoint(33F, -13F, -11F);
		
		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[97].setRotationPoint(33F, -11F, -11F);
		
		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[98].setRotationPoint(33F, -4F, -9F);
		
		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[99].setRotationPoint(33F, -7F, -8F);
		
		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[100].setRotationPoint(33F, -15F, -9F);
		
		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[101].setRotationPoint(33F, -15F, -10F);
		
		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[102].setRotationPoint(33F, -15F, -4F);
		
		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[103].setRotationPoint(33F, -14F, -1.5F);
		
		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[104].setRotationPoint(34F, -13.5F, -8.25F);
		
		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[105].setRotationPoint(34F, -13.5F, -6.25F);
		
		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[106].setRotationPoint(34F, -13.5F, -9.25F);
		
		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[107].setRotationPoint(33.5F, -8.5F, -5.5F);
		
		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[108].setRotationPoint(33.5F, -8.5F, -6.5F);
		
		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[109].setRotationPoint(33.5F, -8.5F, -7.5F);
		
		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[110].setRotationPoint(33F, -7F, -9F);
		
		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[111].setRotationPoint(-34.5F, -7.5F, -12.5F);
		
		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[112].setRotationPoint(-34.5F, -7.5F, -11.5F);
		
		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[113].setRotationPoint(-34.5F, -7.5F, -10.5F);
		
		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[114].setRotationPoint(-34.5F, -7.5F, -16F);
		
		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[115].setRotationPoint(-34.5F, -7.5F, -15F);
		
		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[116].setRotationPoint(-34.5F, -7.5F, -14F);
		
		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[117].setRotationPoint(-38F, -3F, -5F);
		
		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[118].setRotationPoint(-38F, -3F, -12F);
		
		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[119].setRotationPoint(-38F, -3F, -11F);
		
		bodyModel[120].addShapeBox(0F, 0F, 0F, 23, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[120].setRotationPoint(-33F, -6F, -12F);
		
		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[121].setRotationPoint(-11F, -6F, -16F);
		
		bodyModel[122].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[122].setRotationPoint(-32F, -13F, -16F);
		
		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[123].setRotationPoint(-33F, -13F, -16F);
		
		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 2
		bodyModel[124].setRotationPoint(-15F, -13F, -16F);
		
		bodyModel[125].addShapeBox(0F, 0F, 0F, 22, 6, 4, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[125].setRotationPoint(-33F, -12F, -12F);
		
		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[126].setRotationPoint(-33F, -12F, -8F);
		
		bodyModel[127].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[127].setRotationPoint(-33F, -13F, -8F);
		
		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[128].setRotationPoint(-33F, -21F, -8F);
		
		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[129].setRotationPoint(-32.5F, -19F, -9F);
		
		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[130].setRotationPoint(-31.5F, -20.5F, -7F);
		
		bodyModel[131].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[131].setRotationPoint(-10F, -6F, -2F);
		
		bodyModel[132].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[132].setRotationPoint(-10F, -8F, -13F);
		
		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 11, 11, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F); // Box 2
		bodyModel[133].setRotationPoint(-15F, -19F, -13F);
		
		bodyModel[134].addShapeBox(0F, 0F, 0F, 27, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[134].setRotationPoint(-11F, -1F, -8.5F);
		
		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[135].setRotationPoint(16F, -1F, -8.5F);
		
		bodyModel[136].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 2
		bodyModel[136].setRotationPoint(-19F, -1F, -8.5F);
		
		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[137].setRotationPoint(-12F, 1F, -7F);
		
		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[138].setRotationPoint(-12F, 0F, -7F);
		
		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[139].setRotationPoint(-12F, 2F, -7F);
		
		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[140].setRotationPoint(14F, 1F, -7F);
		
		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[141].setRotationPoint(14F, 0F, -7F);
		
		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[142].setRotationPoint(14F, 2F, -7F);
		
		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[143].setRotationPoint(26F, 0F, -8.5F);
		
		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 2
		bodyModel[144].setRotationPoint(26.5F, 1F, -12F);
		
		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 2
		bodyModel[145].setRotationPoint(26.5F, 2F, -12F);
		
		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F); // Box 2
		bodyModel[146].setRotationPoint(26.5F, 3F, -12F);
		
		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[147].setRotationPoint(-23F, 0F, -8.5F);
		
		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[148].setRotationPoint(-22.5F, 1F, -12F);
		
		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[149].setRotationPoint(-22.5F, 2F, -12F);
		
		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[150].setRotationPoint(-22.5F, 3F, -12F);
		
		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[151].setRotationPoint(3F, 0F, -10.5F);
		
		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[152].setRotationPoint(3F, 1F, -10.5F);
		
		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[153].setRotationPoint(5F, 1F, -10.5F);
		
		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[154].setRotationPoint(-34F, 0F, -8.5F);
		
		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[155].setRotationPoint(28F, -14F, 11F);
		
		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[156].setRotationPoint(27F, -13F, 11F);
		
		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[157].setRotationPoint(28F, -14F, -12F);
		
		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[158].setRotationPoint(27F, -13F, -12F);
		
		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[159].setRotationPoint(-31F, -12F, 12F);
		
		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[160].setRotationPoint(-31F, -12F, -16F);
		
		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[161].setRotationPoint(-11F, -11F, 17F);
		
		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[162].setRotationPoint(-8F, -11F, 17F);
		
		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[163].setRotationPoint(-11F, -11F, 18F);
		
		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[164].setRotationPoint(-32F, -9F, 18F);
		
		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[165].setRotationPoint(-32F, -9F, 17F);
		
		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[166].setRotationPoint(-29F, -9F, 17F);
		
		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[167].setRotationPoint(-11F, -11F, -18F);
		
		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[168].setRotationPoint(-8F, -11F, -18F);
		
		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[169].setRotationPoint(-11F, -11F, -19F);
		
		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[170].setRotationPoint(-32F, -9F, -19F);
		
		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[171].setRotationPoint(-32F, -9F, -18F);
		
		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[172].setRotationPoint(-29F, -9F, -18F);
		
		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -1.99999F, -0.53F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99999F, -0.45F, 0F, 0F, -0.53F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.45F); // Box 2
		bodyModel[173].setRotationPoint(6F, -10F, 13F);
		
		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -1.99999F, -0.45F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.99999F, -0.53F, 0F, 0F, -0.45F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.53F); // Box 2
		bodyModel[174].setRotationPoint(6F, -10F, -15F);
		
		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[175].setRotationPoint(5F, -10F, -2F);
		
		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[176].setRotationPoint(7F, -10F, 7F);
		
		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[177].setRotationPoint(4F, -7.5F, 6.5F);
		
		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[178].setRotationPoint(7F, -10F, 10F);
		
		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[179].setRotationPoint(4F, -7.5F, 9.5F);
		
		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[180].setRotationPoint(7F, -10F, 4F);
		
		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[181].setRotationPoint(4F, -7.5F, 3.5F);
		
		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 2
		bodyModel[182].setRotationPoint(3F, -12F, 0.5F);
		
		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[183].setRotationPoint(3F, -8F, 0.5F);
		
		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[184].setRotationPoint(3F, -13F, 0.5F);
		
		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[185].setRotationPoint(1.25F, -10F, -1F);
		bodyModel[185].rotateAngleZ = 0.19198622F;
		
		bodyModel[186].addShapeBox(0F, 1F, 0F, 1, 3, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 2
		bodyModel[186].setRotationPoint(1.25F, -10F, -1F);
		bodyModel[186].rotateAngleZ = 0.19198622F;
		
		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[187].setRotationPoint(2F, -7F, -1F);
		
		bodyModel[188].addShapeBox(0F, 1F, 0F, 1, 3, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 2
		bodyModel[188].setRotationPoint(0.25F, -9.5F, -2F);
		bodyModel[188].rotateAngleZ = 0.54105207F;
		
		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[189].setRotationPoint(0.25F, -9.5F, -2F);
		bodyModel[189].rotateAngleZ = 0.54105207F;
		
		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[190].setRotationPoint(2F, -7F, -2F);
		
		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[191].setRotationPoint(6.5F, -13F, -11F);
		
		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[192].setRotationPoint(6.5F, -14F, -8F);
		
		bodyModel[193].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 2
		bodyModel[193].setRotationPoint(1F, -18F, 7F);
		
		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[194].setRotationPoint(2F, -16F, 7F);
		
		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[195].setRotationPoint(6F, -14F, -1.5F);
		
		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[196].setRotationPoint(6F, -13F, -1.5F);
		
		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[197].setRotationPoint(6F, -12F, -1.5F);
		
		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[198].setRotationPoint(6F, -13.5F, -3F);
		bodyModel[198].rotateAngleZ = 1.57079633F;
		
		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[199].setRotationPoint(6F, -13.5F, -3F);
		bodyModel[199].rotateAngleZ = 1.57079633F;
		
		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[200].setRotationPoint(6F, -13.5F, -3F);
		bodyModel[200].rotateAngleZ = 1.57079633F;
		
		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[201].setRotationPoint(6F, -13.5F, 2F);
		bodyModel[201].rotateAngleZ = 1.57079633F;
		
		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[202].setRotationPoint(6F, -13.5F, 2F);
		bodyModel[202].rotateAngleZ = 1.57079633F;
		
		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[203].setRotationPoint(6F, -13.5F, 2F);
		bodyModel[203].rotateAngleZ = 1.57079633F;
		
		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[204].setRotationPoint(6F, -10.5F, 1.5F);
		bodyModel[204].rotateAngleZ = 1.57079633F;
		
		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[205].setRotationPoint(6F, -10.5F, 1.5F);
		bodyModel[205].rotateAngleZ = 1.57079633F;
		
		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[206].setRotationPoint(6F, -10.5F, 1.5F);
		bodyModel[206].rotateAngleZ = 1.57079633F;
		
		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[207].setRotationPoint(6F, -10.5F, -2.5F);
		bodyModel[207].rotateAngleZ = 1.57079633F;
		
		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[208].setRotationPoint(6F, -10.5F, -2.5F);
		bodyModel[208].rotateAngleZ = 1.57079633F;
		
		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[209].setRotationPoint(6F, -10.5F, -2.5F);
		bodyModel[209].rotateAngleZ = 1.57079633F;
		
		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[210].setRotationPoint(6F, -12.5F, 9.5F);
		bodyModel[210].rotateAngleZ = 1.57079633F;
		
		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[211].setRotationPoint(6F, -12.5F, 9.5F);
		bodyModel[211].rotateAngleZ = 1.57079633F;
		
		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[212].setRotationPoint(6F, -12.5F, 9.5F);
		bodyModel[212].rotateAngleZ = 1.57079633F;
		
		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[213].setRotationPoint(6F, -12.5F, 11.5F);
		bodyModel[213].rotateAngleZ = 1.57079633F;
		
		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[214].setRotationPoint(6F, -12.5F, 11.5F);
		bodyModel[214].rotateAngleZ = 1.57079633F;
		
		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[215].setRotationPoint(6F, -12.5F, 11.5F);
		bodyModel[215].rotateAngleZ = 1.57079633F;
		
		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[216].setRotationPoint(6F, -14.5F, -1.5F);
		bodyModel[216].rotateAngleZ = 1.57079633F;
		
		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[217].setRotationPoint(6F, -14.5F, -1.5F);
		bodyModel[217].rotateAngleZ = 1.57079633F;
		
		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[218].setRotationPoint(6F, -14.5F, -1.5F);
		bodyModel[218].rotateAngleZ = 1.57079633F;
		
		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[219].setRotationPoint(6F, -14.5F, 0.5F);
		bodyModel[219].rotateAngleZ = 1.57079633F;
		
		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[220].setRotationPoint(6F, -14.5F, 0.5F);
		bodyModel[220].rotateAngleZ = 1.57079633F;
		
		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[221].setRotationPoint(6F, -14.5F, 0.5F);
		bodyModel[221].rotateAngleZ = 1.57079633F;
		
		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[222].setRotationPoint(5F, -12F, 6F);
		
		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[223].setRotationPoint(9F, -12F, 13F);
		
		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2
		bodyModel[224].setRotationPoint(9F, -20F, 14F);
		
		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[225].setRotationPoint(8.5F, -21F, 16F);
		
		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[226].setRotationPoint(7.5F, -21F, 16F);
		
		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[227].setRotationPoint(7.5F, -21F, 17F);
		
		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F); // Box 2
		bodyModel[228].setRotationPoint(8.5F, -21F, 17F);
		
		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[229].setRotationPoint(8.5F, -21F, 15F);
		
		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[230].setRotationPoint(7.5F, -21F, 15F);
		
		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[231].setRotationPoint(-31.5F, -4.5F, 17.5F);
		bodyModel[231].rotateAngleY = -1.57079633F;
		bodyModel[231].rotateAngleZ = 1.57079633F;
		
		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[232].setRotationPoint(-31.5F, -4.5F, 17.5F);
		bodyModel[232].rotateAngleY = -1.57079633F;
		bodyModel[232].rotateAngleZ = 1.57079633F;
		
		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[233].setRotationPoint(-31.5F, -4.5F, 17.5F);
		bodyModel[233].rotateAngleY = -1.57079633F;
		bodyModel[233].rotateAngleZ = 1.57079633F;
		
		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[234].setRotationPoint(-31.5F, -4.5F, -16.5F);
		bodyModel[234].rotateAngleY = -1.57079633F;
		bodyModel[234].rotateAngleZ = 1.57079633F;
		
		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[235].setRotationPoint(-31.5F, -4.5F, -16.5F);
		bodyModel[235].rotateAngleY = -1.57079633F;
		bodyModel[235].rotateAngleZ = 1.57079633F;
		
		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[236].setRotationPoint(-31.5F, -4.5F, -16.5F);
		bodyModel[236].rotateAngleY = -1.57079633F;
		bodyModel[236].rotateAngleZ = 1.57079633F;
		
		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[237].setRotationPoint(-36F, -8F, -2F);
		
		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[238].setRotationPoint(-37F, -7F, -1.5F);
		
		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[239].setRotationPoint(-37F, -6F, -1F);
		
		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[240].setRotationPoint(-37F, -6F, -3F);
		
		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[241].setRotationPoint(-37F, -4F, -3F);
		
		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 2
		bodyModel[242].setRotationPoint(-15.75F, -31F, -13.5F);
		
		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[243].setRotationPoint(-15.75F, -31F, -13.5F);
		
		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 2
		bodyModel[244].setRotationPoint(-15.75F, -31F, -13.5F);
		
		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 211
		bodyModel[245].setRotationPoint(-32.75F, -29F, -0.5F);
		
		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 212
		bodyModel[246].setRotationPoint(-32.75F, -29F, -0.5F);
		
		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 213
		bodyModel[247].setRotationPoint(-32.75F, -29F, -0.5F);
		
		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 214
		bodyModel[248].setRotationPoint(11.25F, -20F, 13.5F);
		
		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 215
		bodyModel[249].setRotationPoint(11.25F, -20F, 13.5F);
		
		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 216
		bodyModel[250].setRotationPoint(11.25F, -20F, 13.5F);
		
		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Box 217
		bodyModel[251].setRotationPoint(10.25F, -19F, -7.5F);
		
		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 218
		bodyModel[252].setRotationPoint(10.25F, -19F, -7.5F);
		
		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Box 219
		bodyModel[253].setRotationPoint(10.25F, -19F, -7.5F);
		
		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[254].setRotationPoint(36F, -11F, -7.5F);
		
		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 221
		bodyModel[255].setRotationPoint(38F, -11F, -7.5F);
		
		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 222
		bodyModel[256].setRotationPoint(34F, -11F, -7.5F);
		
		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[257].setRotationPoint(36.5F, -12F, -4.5F);
		
		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[258].setRotationPoint(36.5F, -11F, -1.5F);
		
		bodyModel[259].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[259].setRotationPoint(32.5F, -2F, -1.5F);
		
		bodyModel[260].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[260].setRotationPoint(15F, -14F, 11F);
		
		bodyModel[261].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[261].setRotationPoint(14F, -13F, 13F);
		
		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[262].setRotationPoint(7F, -18F, 5F);
		
		bodyModel[263].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[263].setRotationPoint(-27F, -16F, 16F);
		
		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 230
		bodyModel[264].setRotationPoint(-34.5F, -7.5F, 11F);
		
		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[265].setRotationPoint(-34.5F, -7.5F, 10F);
		
		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[266].setRotationPoint(-34.5F, -7.5F, 9F);
		
		bodyModel[267].addShapeBox(0F, 0F, 0F, 17, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[267].setRotationPoint(-32F, -22F, -22F);
		
		bodyModel[268].addShapeBox(0F, 0F, 0F, 17, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[268].setRotationPoint(-32F, -17F, -21F);
		
		bodyModel[269].addShapeBox(0F, 0F, 0F, 12, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[269].setRotationPoint(-29.5F, -12F, -23F);
		
		bodyModel[270].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[270].setRotationPoint(-30F, -13F, -23.5F);
		
		bodyModel[271].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[271].setRotationPoint(-15.5F, -16F, -18F);
		
		bodyModel[272].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 2
		bodyModel[272].setRotationPoint(-33F, -16.5F, -24F);
		
		bodyModel[273].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 2
		bodyModel[273].setRotationPoint(-33F, -13.5F, -24F);
		
		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[274].setRotationPoint(-34F, -17F, -21F);
		
		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[275].setRotationPoint(-22F, -17.5F, -24F);
		
		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[276].setRotationPoint(-34F, -14F, -21F);
		
		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[277].setRotationPoint(-22F, -14F, -24F);
		
		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[278].setRotationPoint(-32F, -17F, -22F);
		
		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[279].setRotationPoint(-24F, -17F, -24F);
		
		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 246
		bodyModel[280].setRotationPoint(9F, -12F, -17F);
		
		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[281].setRotationPoint(9F, -12F, -18F);
		
		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[282].setRotationPoint(9F, -12F, -19F);
		
		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[283].setRotationPoint(12F, -7F, 16F);
		
		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[284].setRotationPoint(12F, -7F, 17F);
		
		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 251
		bodyModel[285].setRotationPoint(12F, -7F, 18F);
		
		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[286].setRotationPoint(6F, -7F, 17F);
		
		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[287].setRotationPoint(6F, -7F, 18F);
		
		bodyModel[288].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 254
		bodyModel[288].setRotationPoint(6F, -7F, 19F);
		
		bodyModel[289].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 255
		bodyModel[289].setRotationPoint(8.5F, -17F, -4F);
		
		bodyModel[290].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[290].setRotationPoint(-23.5F, -11F, 4F);
		
		bodyModel[291].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[291].setRotationPoint(-23.5F, -11F, 0F);
		
		bodyModel[292].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[292].setRotationPoint(-23.5F, -16F, 2F);
		
		bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[293].setRotationPoint(-17.5F, -13F, 3F);
		
		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[294].setRotationPoint(-23.5F, -13F, -8F);
		
		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 8, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[295].setRotationPoint(-41F, -21F, -19F);
		
		bodyModel[296].addShapeBox(0F, 0F, 0F, 7, 1, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[296].setRotationPoint(-40F, -16F, -19F);
		
		bodyModel[297].addShapeBox(0F, 0F, 0F, 7, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[297].setRotationPoint(-34F, -16F, 16F);
		
		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[298].setRotationPoint(-31F, -19F, 18F);
		
		bodyModel[299].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[299].setRotationPoint(-34F, -18F, 16F);
		
		bodyModel[300].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[300].setRotationPoint(-27F, -16F, 18F);
		
		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[301].setRotationPoint(-22F, -14F, 18F);
		
		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[302].setRotationPoint(9F, -6F, 18F);
		
		bodyModel[303].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[303].setRotationPoint(9F, -6F, 16F);
		
		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[304].setRotationPoint(8F, -17F, 0F);
		bodyModel[304].rotateAngleY = 0.45378561F;
		
		bodyModel[305].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[305].setRotationPoint(3F, -17F, -14F);
		
		bodyModel[306].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[306].setRotationPoint(3F, -17F, -16F);
		
		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[307].setRotationPoint(11F, -17F, -15F);
		
		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[308].setRotationPoint(-42F, -21F, -19F);
		
		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[309].setRotationPoint(-42F, -14F, -19F);
		
		bodyModel[310].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Grip
		bodyModel[310].setRotationPoint(-26F, -19.1F, 15.5F);
		bodyModel[310].rotateAngleY = 0.01745329F;
		bodyModel[310].rotateAngleZ = -0.06981317F;
		
		bodyModel[311].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Import Barrel
		bodyModel[311].setRotationPoint(-28F, -21F, 15.5F);
		bodyModel[311].rotateAngleY = 0.01745329F;
		
		bodyModel[312].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Import UnderGrip
		bodyModel[312].setRotationPoint(-20F, -20.5F, 15F);
		bodyModel[312].rotateAngleY = 0.01745329F;
		
		bodyModel[313].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import FiringMechanism
		bodyModel[313].setRotationPoint(-26.3F, -20F, 15.5F);
		bodyModel[313].rotateAngleY = 0.01745329F;
		
		bodyModel[314].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Import Stock
		bodyModel[314].setRotationPoint(-30.5F, -20F, 15.5F);
		bodyModel[314].rotateAngleY = 0.01745329F;
		
		bodyModel[315].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Import Stock
		bodyModel[315].setRotationPoint(-33F, -20F, 15.5F);
		bodyModel[315].rotateAngleY = 0.01745329F;
		
		bodyModel[316].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Stock
		bodyModel[316].setRotationPoint(-30F, -19.5F, 15.5F);
		bodyModel[316].rotateAngleY = 0.01745329F;
		bodyModel[316].rotateAngleZ = 0.2792527F;
		
		bodyModel[317].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import Stock
		bodyModel[317].setRotationPoint(-34F, -18F, 15.5F);
		bodyModel[317].rotateAngleY = 0.01745329F;
		bodyModel[317].rotateAngleZ = 0.3490658F;
		
		bodyModel[318].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Stock
		bodyModel[318].setRotationPoint(-33F, -19F, 15.5F);
		bodyModel[318].rotateAngleY = 0.01745329F;
		
		bodyModel[319].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import StockEnd
		bodyModel[319].setRotationPoint(-34F, -20F, 15.5F);
		bodyModel[319].rotateAngleY = 0.01745329F;
		
		bodyModel[320].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import SightFront
		bodyModel[320].setRotationPoint(-15.2F, -21.6F, 15.5F);
		bodyModel[320].rotateAngleY = 0.01745329F;
		
		bodyModel[321].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import SightRear
		bodyModel[321].setRotationPoint(-26F, -21.5F, 15.5F);
		bodyModel[321].rotateAngleY = 0.01745329F;
		bodyModel[321].rotateAngleZ = -0.06981317F;
		
		bodyModel[322].addBox(5.7F, -4F, -0.5F, 1, 4, 1, 0F); // Import Magazine
		bodyModel[322].setRotationPoint(-27F, -16F, 16F);
		bodyModel[322].rotateAngleY = 0.01745329F;
		
		bodyModel[323].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[323].setRotationPoint(8.5F, -17F, -4F);
		
		bodyModel[324].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[324].setRotationPoint(8.5F, -17F, -4F);
		
		bodyModel[325].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[325].setRotationPoint(-15.5F, -7F, -4F);
		
		bodyModel[326].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[326].setRotationPoint(-15.5F, -7F, -4F);
		
		bodyModel[327].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 335
		bodyModel[327].setRotationPoint(-15.5F, -7F, -4F);
		
		bodyModel[328].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[328].setRotationPoint(-12.5F, -7F, 1F);
		
		bodyModel[329].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[329].setRotationPoint(-12.5F, -7F, 1F);
		
		bodyModel[330].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 338
		bodyModel[330].setRotationPoint(-12.5F, -7F, 1F);
		
		bodyModel[331].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[331].setRotationPoint(-14.5F, -8F, -2F);
		
		bodyModel[332].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[332].setRotationPoint(-14.5F, -8F, -2F);
		
		bodyModel[333].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 341
		bodyModel[333].setRotationPoint(-14.5F, -8F, -2F);
		
		bodyModel[334].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[334].setRotationPoint(-13.5F, -10F, -6F);
		bodyModel[334].rotateAngleX = -1.13446401F;
		bodyModel[334].rotateAngleZ = -0.01745329F;
		
		bodyModel[335].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[335].setRotationPoint(-13.5F, -10F, -6F);
		bodyModel[335].rotateAngleX = -1.13446401F;
		bodyModel[335].rotateAngleZ = -0.01745329F;
		
		bodyModel[336].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 344
		bodyModel[336].setRotationPoint(-13.5F, -10F, -6F);
		bodyModel[336].rotateAngleX = -1.13446401F;
		bodyModel[336].rotateAngleZ = -0.01745329F;
		
		bodyModel[337].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[337].setRotationPoint(-17.5F, -10F, -4F);
		bodyModel[337].rotateAngleX = -1.13446401F;
		bodyModel[337].rotateAngleY = -0.71558499F;
		bodyModel[337].rotateAngleZ = -0.01745329F;
		
		bodyModel[338].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[338].setRotationPoint(-17.5F, -10F, -4F);
		bodyModel[338].rotateAngleX = -1.13446401F;
		bodyModel[338].rotateAngleY = -0.71558499F;
		bodyModel[338].rotateAngleZ = -0.01745329F;
		
		bodyModel[339].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 347
		bodyModel[339].setRotationPoint(-17.5F, -10F, -4F);
		bodyModel[339].rotateAngleX = -1.13446401F;
		bodyModel[339].rotateAngleY = -0.71558499F;
		bodyModel[339].rotateAngleZ = -0.01745329F;
		
		bodyModel[340].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[340].setRotationPoint(-12.5F, -10F, 1F);
		bodyModel[340].rotateAngleX = 1.43116999F;
		bodyModel[340].rotateAngleY = -0.34906585F;
		bodyModel[340].rotateAngleZ = -0.2268928F;
		
		bodyModel[341].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[341].setRotationPoint(-12.5F, -10F, 1F);
		bodyModel[341].rotateAngleX = 1.43116999F;
		bodyModel[341].rotateAngleY = -0.34906585F;
		bodyModel[341].rotateAngleZ = -0.2268928F;
		
		bodyModel[342].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 350
		bodyModel[342].setRotationPoint(-12.5F, -10F, 1F);
		bodyModel[342].rotateAngleX = 1.43116999F;
		bodyModel[342].rotateAngleY = -0.34906585F;
		bodyModel[342].rotateAngleZ = -0.2268928F;
		
		bodyModel[343].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[343].setRotationPoint(-6.5F, -9F, 1F);
		bodyModel[343].rotateAngleX = 1.43116999F;
		bodyModel[343].rotateAngleY = -0.01745329F;
		bodyModel[343].rotateAngleZ = -0.52359878F;
		
		bodyModel[344].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[344].setRotationPoint(-6.5F, -9F, 1F);
		bodyModel[344].rotateAngleX = 1.43116999F;
		bodyModel[344].rotateAngleY = -0.01745329F;
		bodyModel[344].rotateAngleZ = -0.52359878F;
		
		bodyModel[345].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 353
		bodyModel[345].setRotationPoint(-6.5F, -9F, 1F);
		bodyModel[345].rotateAngleX = 1.43116999F;
		bodyModel[345].rotateAngleY = -0.01745329F;
		bodyModel[345].rotateAngleZ = -0.52359878F;
		
		bodyModel[346].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[346].setRotationPoint(-6.5F, -9F, 0F);
		bodyModel[346].rotateAngleX = 1.43116999F;
		bodyModel[346].rotateAngleY = -0.01745329F;
		bodyModel[346].rotateAngleZ = -0.52359878F;
		
		bodyModel[347].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[347].setRotationPoint(-6.5F, -9F, 0F);
		bodyModel[347].rotateAngleX = 1.43116999F;
		bodyModel[347].rotateAngleY = -0.01745329F;
		bodyModel[347].rotateAngleZ = -0.52359878F;
		
		bodyModel[348].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 356
		bodyModel[348].setRotationPoint(-6.5F, -9F, 0F);
		bodyModel[348].rotateAngleX = 1.43116999F;
		bodyModel[348].rotateAngleY = -0.01745329F;
		bodyModel[348].rotateAngleZ = -0.52359878F;
		
		bodyModel[349].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[349].setRotationPoint(-6.5F, -9F, -2F);
		bodyModel[349].rotateAngleX = 1.09955743F;
		bodyModel[349].rotateAngleY = -0.01745329F;
		bodyModel[349].rotateAngleZ = -0.52359878F;
		
		bodyModel[350].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[350].setRotationPoint(-6.5F, -9F, -2F);
		bodyModel[350].rotateAngleX = 1.09955743F;
		bodyModel[350].rotateAngleY = -0.01745329F;
		bodyModel[350].rotateAngleZ = -0.52359878F;
		
		bodyModel[351].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 359
		bodyModel[351].setRotationPoint(-6.5F, -9F, -2F);
		bodyModel[351].rotateAngleX = 1.09955743F;
		bodyModel[351].rotateAngleY = -0.01745329F;
		bodyModel[351].rotateAngleZ = -0.52359878F;
		
		bodyModel[352].addShape3D(9.5F, -8.5F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(15, 0, 15, 0), new Coord2D(18, 3, 18, 3), new Coord2D(18, 14, 18, 14), new Coord2D(15, 17, 15, 17), new Coord2D(4, 17, 4, 17), new Coord2D(1, 14, 1, 14), new Coord2D(1, 3, 1, 3)}), 6, 17, 17, 64, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 11, 5, 11, 5, 11, 5, 11}); // Shape 4
		bodyModel[352].setRotationPoint(-34F, -19F, 8F);
		bodyModel[352].rotateAngleY = -1.57079633F;
		bodyModel[352].rotateAngleZ = 0.20943951F;
		
		bodyModel[353].addShape3D(9.5F, -8.5F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(15, 0, 15, 0), new Coord2D(18, 3, 18, 3), new Coord2D(18, 14, 18, 14), new Coord2D(15, 17, 15, 17), new Coord2D(4, 17, 4, 17), new Coord2D(1, 14, 1, 14), new Coord2D(1, 3, 1, 3)}), 6, 17, 17, 64, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 11, 5, 11, 5, 11, 5, 11}); // Shape 5
		bodyModel[353].setRotationPoint(-34F, -19F, -10F);
		bodyModel[353].rotateAngleY = -1.57079633F;
		bodyModel[353].rotateAngleZ = -0.05235988F;
		
		
		leftFrontWheelModel = new ModelRendererTurbo[1];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Shape 10
		
		leftFrontWheelModel[0].addShape3D(9.5F, -8.5F, -6F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(15, 0, 15, 0), new Coord2D(18, 3, 18, 3), new Coord2D(18, 14, 18, 14), new Coord2D(15, 17, 15, 17), new Coord2D(4, 17, 4, 17), new Coord2D(1, 14, 1, 14), new Coord2D(1, 3, 1, 3)}), 6, 17, 17, 64, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 11, 5, 11, 5, 11, 5, 11}); // Shape 10
		leftFrontWheelModel[0].setRotationPoint(28F, 2F, 13F);
		
		
		rightFrontWheelModel = new ModelRendererTurbo[1];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Shape 10
		
		rightFrontWheelModel[0].addShape3D(9.5F, -8.5F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(15, 0, 15, 0), new Coord2D(18, 3, 18, 3), new Coord2D(18, 14, 18, 14), new Coord2D(15, 17, 15, 17), new Coord2D(4, 17, 4, 17), new Coord2D(1, 14, 1, 14), new Coord2D(1, 3, 1, 3)}), 6, 17, 17, 64, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 11, 5, 11, 5, 11, 5, 11}); // Shape 10
		rightFrontWheelModel[0].setRotationPoint(28F, 2F, -11F);
		
		
		leftBackWheelModel = new ModelRendererTurbo[1];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Shape 10
		
		leftBackWheelModel[0].addShape3D(9.5F, -8.5F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(15, 0, 15, 0), new Coord2D(18, 3, 18, 3), new Coord2D(18, 14, 18, 14), new Coord2D(15, 17, 15, 17), new Coord2D(4, 17, 4, 17), new Coord2D(1, 14, 1, 14), new Coord2D(1, 3, 1, 3)}), 6, 17, 17, 64, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 11, 5, 11, 5, 11, 5, 11}); // Shape 10
		leftBackWheelModel[0].setRotationPoint(-21F, 2F, 17F);
		
		
		rightBackWheelModel = new ModelRendererTurbo[1];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Shape 10
		
		rightBackWheelModel[0].addShape3D(9.5F, -8.5F, -6F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(15, 0, 15, 0), new Coord2D(18, 3, 18, 3), new Coord2D(18, 14, 18, 14), new Coord2D(15, 17, 15, 17), new Coord2D(4, 17, 4, 17), new Coord2D(1, 14, 1, 14), new Coord2D(1, 3, 1, 3)}), 6, 17, 17, 64, 6, ModelRendererTurbo.MR_FRONT, new float[]{5, 11, 5, 11, 5, 11, 5, 11}); // Shape 10
		rightBackWheelModel[0].setRotationPoint(-21F, 2F, -17F);
		
		
		trailerModel = new ModelRendererTurbo[182];
		trailerModel[0] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 2
		trailerModel[1] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 2
		trailerModel[2] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 2
		trailerModel[3] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 2
		trailerModel[4] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 2
		trailerModel[5] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 2
		trailerModel[6] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 2
		trailerModel[7] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 2
		trailerModel[8] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 2
		trailerModel[9] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 2
		trailerModel[10] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 2
		trailerModel[11] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 2
		trailerModel[12] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 2
		trailerModel[13] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 2
		trailerModel[14] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 0
		trailerModel[15] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 1
		trailerModel[16] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 2
		trailerModel[17] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 3
		trailerModel[18] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 4
		trailerModel[19] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 5
		trailerModel[20] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 6
		trailerModel[21] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 7
		trailerModel[22] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 8
		trailerModel[23] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 9
		trailerModel[24] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 10
		trailerModel[25] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 11
		trailerModel[26] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 12
		trailerModel[27] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 13
		trailerModel[28] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 14
		trailerModel[29] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 15
		trailerModel[30] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 16
		trailerModel[31] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 17
		trailerModel[32] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 18
		trailerModel[33] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 19
		trailerModel[34] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 20
		trailerModel[35] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 21
		trailerModel[36] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 22
		trailerModel[37] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 23
		trailerModel[38] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 24
		trailerModel[39] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 25
		trailerModel[40] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 26
		trailerModel[41] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 27
		trailerModel[42] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 28
		trailerModel[43] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 29
		trailerModel[44] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 30
		trailerModel[45] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 31
		trailerModel[46] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 32
		trailerModel[47] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 33
		trailerModel[48] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 34
		trailerModel[49] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 35
		trailerModel[50] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 36
		trailerModel[51] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 37
		trailerModel[52] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 38
		trailerModel[53] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 39
		trailerModel[54] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 40
		trailerModel[55] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 41
		trailerModel[56] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 42
		trailerModel[57] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 43
		trailerModel[58] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 44
		trailerModel[59] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 45
		trailerModel[60] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 46
		trailerModel[61] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 47
		trailerModel[62] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 48
		trailerModel[63] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 49
		trailerModel[64] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 50
		trailerModel[65] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 51
		trailerModel[66] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 52
		trailerModel[67] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 53
		trailerModel[68] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 54
		trailerModel[69] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 55
		trailerModel[70] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 56
		trailerModel[71] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 57
		trailerModel[72] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 58
		trailerModel[73] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 59
		trailerModel[74] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 60
		trailerModel[75] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 61
		trailerModel[76] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 62
		trailerModel[77] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 63
		trailerModel[78] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 64
		trailerModel[79] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 65
		trailerModel[80] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 66
		trailerModel[81] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 67
		trailerModel[82] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 68
		trailerModel[83] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 69
		trailerModel[84] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 99
		trailerModel[85] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 99
		trailerModel[86] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 99
		trailerModel[87] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 99
		trailerModel[88] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 99
		trailerModel[89] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 99
		trailerModel[90] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 99
		trailerModel[91] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 99
		trailerModel[92] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 99
		trailerModel[93] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 99
		trailerModel[94] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 99
		trailerModel[95] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 99
		trailerModel[96] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 99
		trailerModel[97] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 99
		trailerModel[98] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 127
		trailerModel[99] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 128
		trailerModel[100] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 129
		trailerModel[101] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 130
		trailerModel[102] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 131
		trailerModel[103] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 132
		trailerModel[104] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 133
		trailerModel[105] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 134
		trailerModel[106] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 135
		trailerModel[107] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 136
		trailerModel[108] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 137
		trailerModel[109] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 138
		trailerModel[110] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 139
		trailerModel[111] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 140
		trailerModel[112] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 141
		trailerModel[113] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 142
		trailerModel[114] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 143
		trailerModel[115] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 144
		trailerModel[116] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 145
		trailerModel[117] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 146
		trailerModel[118] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 147
		trailerModel[119] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 148
		trailerModel[120] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 149
		trailerModel[121] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 150
		trailerModel[122] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 151
		trailerModel[123] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 152
		trailerModel[124] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 153
		trailerModel[125] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 154
		trailerModel[126] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 155
		trailerModel[127] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 156
		trailerModel[128] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 157
		trailerModel[129] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 158
		trailerModel[130] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 159
		trailerModel[131] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 160
		trailerModel[132] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 161
		trailerModel[133] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 162
		trailerModel[134] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 163
		trailerModel[135] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 164
		trailerModel[136] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 165
		trailerModel[137] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 166
		trailerModel[138] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 167
		trailerModel[139] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 168
		trailerModel[140] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 169
		trailerModel[141] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 170
		trailerModel[142] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 171
		trailerModel[143] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 172
		trailerModel[144] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 173
		trailerModel[145] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 174
		trailerModel[146] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 175
		trailerModel[147] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 176
		trailerModel[148] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 177
		trailerModel[149] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 178
		trailerModel[150] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 179
		trailerModel[151] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 180
		trailerModel[152] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 181
		trailerModel[153] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 182
		trailerModel[154] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 183
		trailerModel[155] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 184
		trailerModel[156] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 185
		trailerModel[157] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 186
		trailerModel[158] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 187
		trailerModel[159] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 188
		trailerModel[160] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 189
		trailerModel[161] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 190
		trailerModel[162] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 191
		trailerModel[163] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 192
		trailerModel[164] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 193
		trailerModel[165] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 194
		trailerModel[166] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 195
		trailerModel[167] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 196
		trailerModel[168] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 197
		trailerModel[169] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 198
		trailerModel[170] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 199
		trailerModel[171] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 200
		trailerModel[172] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 201
		trailerModel[173] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 202
		trailerModel[174] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 203
		trailerModel[175] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 204
		trailerModel[176] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 205
		trailerModel[177] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 206
		trailerModel[178] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 207
		trailerModel[179] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 208
		trailerModel[180] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 209
		trailerModel[181] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 210
		
		trailerModel[0].addBox(-1F, 2F, 0F, 3, 11, 9, 0F); // Box 2
		trailerModel[0].setRotationPoint(-31F, -27F, 7F);
		
		trailerModel[1].addShapeBox(0F, 3F, -1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 2
		trailerModel[1].setRotationPoint(-29F, -27F, 9F);
		
		trailerModel[2].addShapeBox(0F, 8F, -1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		trailerModel[2].setRotationPoint(-29F, -26F, 9F);
		
		trailerModel[3].addShapeBox(0F, 3F, -1F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		trailerModel[3].setRotationPoint(-29F, -26F, 13F);
		
		trailerModel[4].addShapeBox(0F, 3F, -5F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 2
		trailerModel[4].setRotationPoint(-29F, -26F, 13F);
		
		trailerModel[5].addBox(0F, 2F, 0F, 1, 1, 9, 0F); // Box 2
		trailerModel[5].setRotationPoint(-29F, -27F, 7F);
		
		trailerModel[6].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 2
		trailerModel[6].setRotationPoint(-29F, -27F, 15F);
		
		trailerModel[7].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 2
		trailerModel[7].setRotationPoint(-29F, -27F, 7F);
		
		trailerModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		trailerModel[8].setRotationPoint(-32F, -27F, 14F);
		
		trailerModel[9].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2
		trailerModel[9].setRotationPoint(-29F, -27F, 11F);
		
		trailerModel[10].addBox(-3F, 0F, 0F, 1, 1, 3, 0F); // Box 2
		trailerModel[10].setRotationPoint(-29F, -27F, 11F);
		
		trailerModel[11].addBox(-1.5F, 0F, 0F, 1, 1, 3, 0F); // Box 2
		trailerModel[11].setRotationPoint(-29F, -27F, 11F);
		
		trailerModel[12].addShapeBox(0F, 0F, -4F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		trailerModel[12].setRotationPoint(-32F, -27F, 11F);
		
		trailerModel[13].addShapeBox(-1F, 0.5F, -5.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 2
		trailerModel[13].setRotationPoint(-30F, -27F, 13F);
		
		trailerModel[14].addBox(-3F, 0F, 0F, 1, 1, 3, 0F); // Box 0
		trailerModel[14].setRotationPoint(-25F, -27F, 11F);
		
		trailerModel[15].addBox(-1.5F, 0F, 0F, 1, 1, 3, 0F); // Box 1
		trailerModel[15].setRotationPoint(-25F, -27F, 11F);
		
		trailerModel[16].addShapeBox(0F, 0F, -4F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		trailerModel[16].setRotationPoint(-28F, -27F, 11F);
		
		trailerModel[17].addShapeBox(-1F, 0.5F, -5.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 3
		trailerModel[17].setRotationPoint(-26F, -27F, 13F);
		
		trailerModel[18].addShapeBox(0F, 3F, -1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 4
		trailerModel[18].setRotationPoint(-25F, -27F, 9F);
		
		trailerModel[19].addBox(0F, 2F, 0F, 1, 1, 9, 0F); // Box 5
		trailerModel[19].setRotationPoint(-25F, -27F, 7F);
		
		trailerModel[20].addBox(-1F, 2F, 0F, 3, 11, 9, 0F); // Box 6
		trailerModel[20].setRotationPoint(-27F, -27F, 7F);
		
		trailerModel[21].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 7
		trailerModel[21].setRotationPoint(-25F, -27F, 7F);
		
		trailerModel[22].addShapeBox(0F, 3F, -5F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 8
		trailerModel[22].setRotationPoint(-25F, -26F, 13F);
		
		trailerModel[23].addShapeBox(0F, 3F, -1F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		trailerModel[23].setRotationPoint(-25F, -26F, 13F);
		
		trailerModel[24].addShapeBox(0F, 8F, -1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		trailerModel[24].setRotationPoint(-25F, -26F, 9F);
		
		trailerModel[25].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 11
		trailerModel[25].setRotationPoint(-25F, -27F, 15F);
		
		trailerModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		trailerModel[26].setRotationPoint(-28F, -27F, 14F);
		
		trailerModel[27].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 13
		trailerModel[27].setRotationPoint(-25F, -27F, 11F);
		
		trailerModel[28].addBox(-3F, 0F, 0F, 1, 1, 3, 0F); // Box 14
		trailerModel[28].setRotationPoint(-21F, -27F, 11F);
		
		trailerModel[29].addBox(-1.5F, 0F, 0F, 1, 1, 3, 0F); // Box 15
		trailerModel[29].setRotationPoint(-21F, -27F, 11F);
		
		trailerModel[30].addShapeBox(0F, 0F, -4F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		trailerModel[30].setRotationPoint(-24F, -27F, 11F);
		
		trailerModel[31].addShapeBox(-1F, 0.5F, -5.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 17
		trailerModel[31].setRotationPoint(-22F, -27F, 13F);
		
		trailerModel[32].addShapeBox(0F, 3F, -1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 18
		trailerModel[32].setRotationPoint(-21F, -27F, 9F);
		
		trailerModel[33].addBox(0F, 2F, 0F, 1, 1, 9, 0F); // Box 19
		trailerModel[33].setRotationPoint(-21F, -27F, 7F);
		
		trailerModel[34].addBox(-1F, 2F, 0F, 3, 11, 9, 0F); // Box 20
		trailerModel[34].setRotationPoint(-23F, -27F, 7F);
		
		trailerModel[35].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 21
		trailerModel[35].setRotationPoint(-21F, -27F, 7F);
		
		trailerModel[36].addShapeBox(0F, 3F, -5F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 22
		trailerModel[36].setRotationPoint(-21F, -26F, 13F);
		
		trailerModel[37].addShapeBox(0F, 3F, -1F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		trailerModel[37].setRotationPoint(-21F, -26F, 13F);
		
		trailerModel[38].addShapeBox(0F, 8F, -1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		trailerModel[38].setRotationPoint(-21F, -26F, 9F);
		
		trailerModel[39].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 25
		trailerModel[39].setRotationPoint(-21F, -27F, 15F);
		
		trailerModel[40].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		trailerModel[40].setRotationPoint(-24F, -27F, 14F);
		
		trailerModel[41].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 27
		trailerModel[41].setRotationPoint(-21F, -27F, 11F);
		
		trailerModel[42].addBox(-3F, 0F, 0F, 1, 1, 3, 0F); // Box 28
		trailerModel[42].setRotationPoint(-17F, -27F, 11F);
		
		trailerModel[43].addBox(-1.5F, 0F, 0F, 1, 1, 3, 0F); // Box 29
		trailerModel[43].setRotationPoint(-17F, -27F, 11F);
		
		trailerModel[44].addShapeBox(0F, 0F, -4F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		trailerModel[44].setRotationPoint(-20F, -27F, 11F);
		
		trailerModel[45].addShapeBox(-1F, 0.5F, -5.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 31
		trailerModel[45].setRotationPoint(-18F, -27F, 13F);
		
		trailerModel[46].addShapeBox(0F, 3F, -1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 32
		trailerModel[46].setRotationPoint(-17F, -27F, 9F);
		
		trailerModel[47].addBox(0F, 2F, 0F, 1, 1, 9, 0F); // Box 33
		trailerModel[47].setRotationPoint(-17F, -27F, 7F);
		
		trailerModel[48].addBox(-1F, 2F, 0F, 3, 11, 9, 0F); // Box 34
		trailerModel[48].setRotationPoint(-19F, -27F, 7F);
		
		trailerModel[49].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 35
		trailerModel[49].setRotationPoint(-17F, -27F, 7F);
		
		trailerModel[50].addShapeBox(0F, 3F, -5F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 36
		trailerModel[50].setRotationPoint(-17F, -26F, 13F);
		
		trailerModel[51].addShapeBox(0F, 3F, -1F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		trailerModel[51].setRotationPoint(-17F, -26F, 13F);
		
		trailerModel[52].addShapeBox(0F, 8F, -1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		trailerModel[52].setRotationPoint(-17F, -26F, 9F);
		
		trailerModel[53].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 39
		trailerModel[53].setRotationPoint(-17F, -27F, 15F);
		
		trailerModel[54].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		trailerModel[54].setRotationPoint(-20F, -27F, 14F);
		
		trailerModel[55].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 41
		trailerModel[55].setRotationPoint(-17F, -27F, 11F);
		
		trailerModel[56].addBox(-1F, 2F, 0F, 3, 11, 9, 0F); // Box 42
		trailerModel[56].setRotationPoint(-31F, -27F, -16F);
		
		trailerModel[57].addShapeBox(0F, 3F, -1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 43
		trailerModel[57].setRotationPoint(-29F, -27F, -14F);
		
		trailerModel[58].addShapeBox(0F, 8F, -1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		trailerModel[58].setRotationPoint(-29F, -26F, -14F);
		
		trailerModel[59].addShapeBox(0F, 3F, -1F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 45
		trailerModel[59].setRotationPoint(-29F, -26F, -14F);
		
		trailerModel[60].addShapeBox(0F, 3F, -5F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		trailerModel[60].setRotationPoint(-29F, -26F, -6F);
		
		trailerModel[61].addBox(0F, 2F, 0F, 1, 1, 9, 0F); // Box 47
		trailerModel[61].setRotationPoint(-29F, -27F, -16F);
		
		trailerModel[62].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 48
		trailerModel[62].setRotationPoint(-29F, -27F, -16F);
		
		trailerModel[63].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 49
		trailerModel[63].setRotationPoint(-29F, -27F, -8F);
		
		trailerModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		trailerModel[64].setRotationPoint(-32F, -27F, -16F);
		
		trailerModel[65].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 51
		trailerModel[65].setRotationPoint(-29F, -27F, -14F);
		
		trailerModel[66].addBox(-3F, 0F, 0F, 1, 1, 3, 0F); // Box 52
		trailerModel[66].setRotationPoint(-29F, -27F, -14F);
		
		trailerModel[67].addBox(-1.5F, 0F, 0F, 1, 1, 3, 0F); // Box 53
		trailerModel[67].setRotationPoint(-29F, -27F, -14F);
		
		trailerModel[68].addShapeBox(0F, 0F, -4F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		trailerModel[68].setRotationPoint(-32F, -27F, -7F);
		
		trailerModel[69].addShapeBox(-1F, 0.5F, -5.5F, 2, 2, 2, 0F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 55
		trailerModel[69].setRotationPoint(-30F, -27F, -4F);
		
		trailerModel[70].addBox(-3F, 0F, 0F, 1, 1, 3, 0F); // Box 56
		trailerModel[70].setRotationPoint(-25F, -27F, -14F);
		
		trailerModel[71].addBox(-1.5F, 0F, 0F, 1, 1, 3, 0F); // Box 57
		trailerModel[71].setRotationPoint(-25F, -27F, -14F);
		
		trailerModel[72].addShapeBox(0F, 0F, -4F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		trailerModel[72].setRotationPoint(-28F, -27F, -7F);
		
		trailerModel[73].addShapeBox(-1F, 0.5F, -5.5F, 2, 2, 2, 0F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 59
		trailerModel[73].setRotationPoint(-26F, -27F, -4F);
		
		trailerModel[74].addShapeBox(0F, 3F, -1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 60
		trailerModel[74].setRotationPoint(-25F, -27F, -14F);
		
		trailerModel[75].addBox(0F, 2F, 0F, 1, 1, 9, 0F); // Box 61
		trailerModel[75].setRotationPoint(-25F, -27F, -16F);
		
		trailerModel[76].addBox(-1F, 2F, 0F, 3, 11, 9, 0F); // Box 62
		trailerModel[76].setRotationPoint(-27F, -27F, -16F);
		
		trailerModel[77].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 63
		trailerModel[77].setRotationPoint(-25F, -27F, -8F);
		
		trailerModel[78].addShapeBox(0F, 3F, -5F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		trailerModel[78].setRotationPoint(-25F, -26F, -6F);
		
		trailerModel[79].addShapeBox(0F, 3F, -1F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 65
		trailerModel[79].setRotationPoint(-25F, -26F, -14F);
		
		trailerModel[80].addShapeBox(0F, 8F, -1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		trailerModel[80].setRotationPoint(-25F, -26F, -14F);
		
		trailerModel[81].addBox(0F, 3F, 0F, 1, 9, 1, 0F); // Box 67
		trailerModel[81].setRotationPoint(-25F, -27F, -16F);
		
		trailerModel[82].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		trailerModel[82].setRotationPoint(-28F, -27F, -16F);
		
		trailerModel[83].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 69
		trailerModel[83].setRotationPoint(-25F, -27F, -14F);
		
		trailerModel[84].addBox(2F, 3F, 0F, 1, 9, 1, 0F); // Box 99
		trailerModel[84].setRotationPoint(11F, -15F, -13F);
		trailerModel[84].rotateAngleZ = 1.57079633F;
		
		trailerModel[85].addShapeBox(2F, 4F, 1F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 99
		trailerModel[85].setRotationPoint(11F, -15F, -13F);
		trailerModel[85].rotateAngleZ = 1.57079633F;
		
		trailerModel[86].addShapeBox(2F, 9F, 1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		trailerModel[86].setRotationPoint(11F, -15F, -13F);
		trailerModel[86].rotateAngleZ = 1.57079633F;
		
		trailerModel[87].addShapeBox(2F, 4F, 5F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		trailerModel[87].setRotationPoint(11F, -15F, -13F);
		trailerModel[87].rotateAngleZ = 1.57079633F;
		
		trailerModel[88].addBox(2F, 3F, 8F, 1, 9, 1, 0F); // Box 99
		trailerModel[88].setRotationPoint(11F, -15F, -13F);
		trailerModel[88].rotateAngleZ = 1.57079633F;
		
		trailerModel[89].addBox(2F, 2F, 0F, 1, 1, 9, 0F); // Box 99
		trailerModel[89].setRotationPoint(11F, -15F, -13F);
		trailerModel[89].rotateAngleZ = 1.57079633F;
		
		trailerModel[90].addShapeBox(2F, 3F, 1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 99
		trailerModel[90].setRotationPoint(11F, -15F, -13F);
		trailerModel[90].rotateAngleZ = 1.57079633F;
		
		trailerModel[91].addShapeBox(-1F, 0F, 7F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		trailerModel[91].setRotationPoint(11F, -15F, -13F);
		trailerModel[91].rotateAngleZ = 1.57079633F;
		
		trailerModel[92].addBox(2F, 0F, 4F, 1, 1, 3, 0F); // Box 99
		trailerModel[92].setRotationPoint(11F, -15F, -13F);
		trailerModel[92].rotateAngleZ = 1.57079633F;
		
		trailerModel[93].addShapeBox(-1F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		trailerModel[93].setRotationPoint(11F, -15F, -13F);
		trailerModel[93].rotateAngleZ = 1.57079633F;
		
		trailerModel[94].addBox(0.5F, 0F, 4F, 1, 1, 3, 0F); // Box 99
		trailerModel[94].setRotationPoint(11F, -15F, -13F);
		trailerModel[94].rotateAngleZ = 1.57079633F;
		
		trailerModel[95].addBox(-1F, 0F, 4F, 1, 1, 3, 0F); // Box 99
		trailerModel[95].setRotationPoint(11F, -15F, -13F);
		trailerModel[95].rotateAngleZ = 1.57079633F;
		
		trailerModel[96].addShapeBox(0F, 0.5F, 0.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 99
		trailerModel[96].setRotationPoint(11F, -15F, -13F);
		trailerModel[96].rotateAngleZ = 1.57079633F;
		
		trailerModel[97].addBox(-1F, 2F, 0F, 3, 11, 9, 0F); // Box 99
		trailerModel[97].setRotationPoint(11F, -15F, -13F);
		trailerModel[97].rotateAngleZ = 1.57079633F;
		
		trailerModel[98].addShapeBox(2F, 3F, 1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 127
		trailerModel[98].setRotationPoint(11F, -15F, -4F);
		trailerModel[98].rotateAngleZ = 1.57079633F;
		
		trailerModel[99].addBox(2F, 3F, 0F, 1, 9, 1, 0F); // Box 128
		trailerModel[99].setRotationPoint(11F, -15F, -4F);
		trailerModel[99].rotateAngleZ = 1.57079633F;
		
		trailerModel[100].addShapeBox(2F, 4F, 1F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 129
		trailerModel[100].setRotationPoint(11F, -15F, -4F);
		trailerModel[100].rotateAngleZ = 1.57079633F;
		
		trailerModel[101].addShapeBox(2F, 9F, 1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		trailerModel[101].setRotationPoint(11F, -15F, -4F);
		trailerModel[101].rotateAngleZ = 1.57079633F;
		
		trailerModel[102].addShapeBox(2F, 4F, 5F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		trailerModel[102].setRotationPoint(11F, -15F, -4F);
		trailerModel[102].rotateAngleZ = 1.57079633F;
		
		trailerModel[103].addBox(2F, 3F, 8F, 1, 9, 1, 0F); // Box 132
		trailerModel[103].setRotationPoint(11F, -15F, -4F);
		trailerModel[103].rotateAngleZ = 1.57079633F;
		
		trailerModel[104].addBox(-1F, 2F, 0F, 3, 11, 9, 0F); // Box 133
		trailerModel[104].setRotationPoint(11F, -15F, -4F);
		trailerModel[104].rotateAngleZ = 1.57079633F;
		
		trailerModel[105].addBox(2F, 2F, 0F, 1, 1, 9, 0F); // Box 134
		trailerModel[105].setRotationPoint(11F, -15F, -4F);
		trailerModel[105].rotateAngleZ = 1.57079633F;
		
		trailerModel[106].addShapeBox(0F, 0.5F, 0.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 135
		trailerModel[106].setRotationPoint(11F, -15F, -4F);
		trailerModel[106].rotateAngleZ = 1.57079633F;
		
		trailerModel[107].addShapeBox(-1F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		trailerModel[107].setRotationPoint(11F, -15F, -4F);
		trailerModel[107].rotateAngleZ = 1.57079633F;
		
		trailerModel[108].addBox(2F, 0F, 4F, 1, 1, 3, 0F); // Box 137
		trailerModel[108].setRotationPoint(11F, -15F, -4F);
		trailerModel[108].rotateAngleZ = 1.57079633F;
		
		trailerModel[109].addBox(0.5F, 0F, 4F, 1, 1, 3, 0F); // Box 138
		trailerModel[109].setRotationPoint(11F, -15F, -4F);
		trailerModel[109].rotateAngleZ = 1.57079633F;
		
		trailerModel[110].addBox(-1F, 0F, 4F, 1, 1, 3, 0F); // Box 139
		trailerModel[110].setRotationPoint(11F, -15F, -4F);
		trailerModel[110].rotateAngleX = 0.01745329F;
		trailerModel[110].rotateAngleZ = 1.57079633F;
		
		trailerModel[111].addShapeBox(-1F, 0F, 7F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		trailerModel[111].setRotationPoint(11F, -15F, -4F);
		trailerModel[111].rotateAngleZ = 1.57079633F;
		
		trailerModel[112].addShapeBox(2F, 3F, 1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 141
		trailerModel[112].setRotationPoint(11F, -15F, 5F);
		trailerModel[112].rotateAngleZ = 1.57079633F;
		
		trailerModel[113].addBox(2F, 3F, 0F, 1, 9, 1, 0F); // Box 142
		trailerModel[113].setRotationPoint(11F, -15F, 5F);
		trailerModel[113].rotateAngleZ = 1.57079633F;
		
		trailerModel[114].addShapeBox(2F, 4F, 1F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 143
		trailerModel[114].setRotationPoint(11F, -15F, 5F);
		trailerModel[114].rotateAngleZ = 1.57079633F;
		
		trailerModel[115].addShapeBox(2F, 9F, 1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		trailerModel[115].setRotationPoint(11F, -15F, 5F);
		trailerModel[115].rotateAngleZ = 1.57079633F;
		
		trailerModel[116].addShapeBox(2F, 4F, 5F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		trailerModel[116].setRotationPoint(11F, -15F, 5F);
		trailerModel[116].rotateAngleZ = 1.57079633F;
		
		trailerModel[117].addBox(2F, 3F, 8F, 1, 9, 1, 0F); // Box 146
		trailerModel[117].setRotationPoint(11F, -15F, 5F);
		trailerModel[117].rotateAngleZ = 1.57079633F;
		
		trailerModel[118].addBox(-1F, 2F, 0F, 3, 11, 9, 0F); // Box 147
		trailerModel[118].setRotationPoint(11F, -15F, 5F);
		trailerModel[118].rotateAngleZ = 1.57079633F;
		
		trailerModel[119].addBox(2F, 2F, 0F, 1, 1, 9, 0F); // Box 148
		trailerModel[119].setRotationPoint(11F, -15F, 5F);
		trailerModel[119].rotateAngleZ = 1.57079633F;
		
		trailerModel[120].addShapeBox(0F, 0.5F, 0.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 149
		trailerModel[120].setRotationPoint(11F, -15F, 5F);
		trailerModel[120].rotateAngleZ = 1.57079633F;
		
		trailerModel[121].addShapeBox(-1F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		trailerModel[121].setRotationPoint(11F, -15F, 5F);
		trailerModel[121].rotateAngleZ = 1.57079633F;
		
		trailerModel[122].addBox(2F, 0F, 4F, 1, 1, 3, 0F); // Box 151
		trailerModel[122].setRotationPoint(11F, -15F, 5F);
		trailerModel[122].rotateAngleZ = 1.57079633F;
		
		trailerModel[123].addBox(0.5F, 0F, 4F, 1, 1, 3, 0F); // Box 152
		trailerModel[123].setRotationPoint(11F, -15F, 5F);
		trailerModel[123].rotateAngleZ = 1.57079633F;
		
		trailerModel[124].addBox(-1F, 0F, 4F, 1, 1, 3, 0F); // Box 153
		trailerModel[124].setRotationPoint(11F, -15F, 5F);
		trailerModel[124].rotateAngleX = 0.01745329F;
		trailerModel[124].rotateAngleZ = 1.57079633F;
		
		trailerModel[125].addShapeBox(-1F, 0F, 7F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		trailerModel[125].setRotationPoint(11F, -15F, 5F);
		trailerModel[125].rotateAngleZ = 1.57079633F;
		
		trailerModel[126].addBox(-2F, 0F, 4F, 1, 1, 3, 0F); // Box 155
		trailerModel[126].setRotationPoint(14F, -16F, 15F);
		trailerModel[126].rotateAngleY = 1.43116999F;
		trailerModel[126].rotateAngleZ = -0.01745329F;
		
		trailerModel[127].addShapeBox(-2F, 0F, 7F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		trailerModel[127].setRotationPoint(14F, -16F, 15F);
		trailerModel[127].rotateAngleY = 1.43116999F;
		trailerModel[127].rotateAngleZ = -0.01745329F;
		
		trailerModel[128].addBox(-0.5F, 0F, 4F, 1, 1, 3, 0F); // Box 157
		trailerModel[128].setRotationPoint(14F, -16F, 15F);
		trailerModel[128].rotateAngleY = 1.43116999F;
		trailerModel[128].rotateAngleZ = -0.01745329F;
		
		trailerModel[129].addBox(1F, 0F, 4F, 1, 1, 3, 0F); // Box 158
		trailerModel[129].setRotationPoint(14F, -16F, 15F);
		trailerModel[129].rotateAngleY = 1.43116999F;
		trailerModel[129].rotateAngleZ = -0.01745329F;
		
		trailerModel[130].addShapeBox(-2F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		trailerModel[130].setRotationPoint(14F, -16F, 15F);
		trailerModel[130].rotateAngleY = 1.43116999F;
		trailerModel[130].rotateAngleZ = -0.01745329F;
		
		trailerModel[131].addShapeBox(-1F, 0.5F, 0.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 160
		trailerModel[131].setRotationPoint(14F, -16F, 15F);
		trailerModel[131].rotateAngleY = 1.43116999F;
		trailerModel[131].rotateAngleZ = -0.01745329F;
		
		trailerModel[132].addBox(1F, 2F, 0F, 1, 1, 9, 0F); // Box 161
		trailerModel[132].setRotationPoint(14F, -16F, 15F);
		trailerModel[132].rotateAngleY = 1.43116999F;
		trailerModel[132].rotateAngleZ = -0.01745329F;
		
		trailerModel[133].addBox(1F, 3F, 0F, 1, 9, 1, 0F); // Box 162
		trailerModel[133].setRotationPoint(14F, -16F, 15F);
		trailerModel[133].rotateAngleY = 1.43116999F;
		trailerModel[133].rotateAngleZ = -0.01745329F;
		
		trailerModel[134].addBox(-2F, 2F, 0F, 3, 11, 9, 0F); // Box 163
		trailerModel[134].setRotationPoint(14F, -16F, 15F);
		trailerModel[134].rotateAngleY = 1.43116999F;
		trailerModel[134].rotateAngleZ = -0.01745329F;
		
		trailerModel[135].addShapeBox(1F, 4F, 1F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 164
		trailerModel[135].setRotationPoint(14F, -16F, 15F);
		trailerModel[135].rotateAngleY = 1.43116999F;
		trailerModel[135].rotateAngleZ = -0.01745329F;
		
		trailerModel[136].addShapeBox(1F, 3F, 1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 165
		trailerModel[136].setRotationPoint(14F, -16F, 15F);
		trailerModel[136].rotateAngleY = 1.43116999F;
		trailerModel[136].rotateAngleZ = -0.01745329F;
		
		trailerModel[137].addShapeBox(1F, 4F, 5F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		trailerModel[137].setRotationPoint(14F, -16F, 15F);
		trailerModel[137].rotateAngleY = 1.43116999F;
		trailerModel[137].rotateAngleZ = -0.01745329F;
		
		trailerModel[138].addShapeBox(1F, 9F, 1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		trailerModel[138].setRotationPoint(14F, -16F, 15F);
		trailerModel[138].rotateAngleY = 1.43116999F;
		trailerModel[138].rotateAngleZ = -0.01745329F;
		
		trailerModel[139].addBox(1F, 3F, 8F, 1, 9, 1, 0F); // Box 168
		trailerModel[139].setRotationPoint(14F, -16F, 15F);
		trailerModel[139].rotateAngleY = 1.43116999F;
		trailerModel[139].rotateAngleZ = -0.01745329F;
		
		trailerModel[140].addShapeBox(-4F, 0F, 9F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		trailerModel[140].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[140].rotateAngleY = 4.81710874F;
		
		trailerModel[141].addBox(-1F, 0F, 6F, 1, 1, 3, 0F); // Box 170
		trailerModel[141].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[141].rotateAngleY = 4.81710874F;
		
		trailerModel[142].addBox(-2.5F, 0F, 6F, 1, 1, 3, 0F); // Box 171
		trailerModel[142].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[142].rotateAngleY = 4.81710874F;
		
		trailerModel[143].addBox(-4F, 0F, 6F, 1, 1, 3, 0F); // Box 172
		trailerModel[143].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[143].rotateAngleY = 4.81710874F;
		
		trailerModel[144].addShapeBox(-3F, 0.5F, 2.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 173
		trailerModel[144].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[144].rotateAngleY = 4.81710874F;
		
		trailerModel[145].addShapeBox(-4F, 0F, 2F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		trailerModel[145].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[145].rotateAngleY = 4.81710874F;
		
		trailerModel[146].addBox(-4F, 2F, 2F, 3, 11, 9, 0F); // Box 175
		trailerModel[146].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[146].rotateAngleY = 4.81710874F;
		
		trailerModel[147].addBox(-1F, 2F, 2F, 1, 1, 9, 0F); // Box 176
		trailerModel[147].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[147].rotateAngleY = 4.81710874F;
		
		trailerModel[148].addBox(-1F, 3F, 2F, 1, 9, 1, 0F); // Box 177
		trailerModel[148].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[148].rotateAngleY = 4.81710874F;
		
		trailerModel[149].addShapeBox(-1F, 3F, 3F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 178
		trailerModel[149].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[149].rotateAngleY = 4.81710874F;
		
		trailerModel[150].addShapeBox(-1F, 4F, 3F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 179
		trailerModel[150].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[150].rotateAngleY = 4.81710874F;
		
		trailerModel[151].addShapeBox(-1F, 4F, 7F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		trailerModel[151].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[151].rotateAngleY = 4.81710874F;
		
		trailerModel[152].addShapeBox(-1F, 9F, 3F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		trailerModel[152].setRotationPoint(3F, -16.5F, -17F);
		trailerModel[152].rotateAngleY = 4.81710874F;
		
		trailerModel[153].addBox(-1F, 3F, 10F, 1, 9, 1, 0F); // Box 182
		trailerModel[153].setRotationPoint(3F, -16F, -17F);
		trailerModel[153].rotateAngleY = 4.81710874F;
		
		trailerModel[154].addShapeBox(-2F, 0F, 7F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		trailerModel[154].setRotationPoint(33F, -16F, -13F);
		trailerModel[154].rotateAngleY = 1.57079633F;
		trailerModel[154].rotateAngleZ = 1.57079633F;
		
		trailerModel[155].addBox(-2F, 0F, 4F, 1, 1, 3, 0F); // Box 184
		trailerModel[155].setRotationPoint(33F, -16F, -13F);
		trailerModel[155].rotateAngleY = 1.57079633F;
		trailerModel[155].rotateAngleZ = 1.57079633F;
		
		trailerModel[156].addBox(-0.5F, 0F, 4F, 1, 1, 3, 0F); // Box 185
		trailerModel[156].setRotationPoint(33F, -16F, -13F);
		trailerModel[156].rotateAngleY = 1.57079633F;
		trailerModel[156].rotateAngleZ = 1.57079633F;
		
		trailerModel[157].addBox(1F, 0F, 4F, 1, 1, 3, 0F); // Box 186
		trailerModel[157].setRotationPoint(33F, -16F, -13F);
		trailerModel[157].rotateAngleY = 1.57079633F;
		trailerModel[157].rotateAngleZ = 1.57079633F;
		
		trailerModel[158].addShapeBox(-1F, 0.5F, 0.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 187
		trailerModel[158].setRotationPoint(33F, -16F, -13F);
		trailerModel[158].rotateAngleY = 1.57079633F;
		trailerModel[158].rotateAngleZ = 1.57079633F;
		
		trailerModel[159].addShapeBox(-2F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		trailerModel[159].setRotationPoint(33F, -16F, -13F);
		trailerModel[159].rotateAngleY = 1.57079633F;
		trailerModel[159].rotateAngleZ = 1.57079633F;
		
		trailerModel[160].addBox(1F, 2F, 0F, 1, 1, 9, 0F); // Box 189
		trailerModel[160].setRotationPoint(33F, -16F, -13F);
		trailerModel[160].rotateAngleY = 1.57079633F;
		trailerModel[160].rotateAngleZ = 1.57079633F;
		
		trailerModel[161].addBox(-2F, 2F, 0F, 3, 11, 9, 0F); // Box 190
		trailerModel[161].setRotationPoint(33F, -16F, -13F);
		trailerModel[161].rotateAngleY = 1.57079633F;
		trailerModel[161].rotateAngleZ = 1.57079633F;
		
		trailerModel[162].addShapeBox(1F, 3F, 1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 191
		trailerModel[162].setRotationPoint(33F, -16F, -13F);
		trailerModel[162].rotateAngleY = 1.57079633F;
		trailerModel[162].rotateAngleZ = 1.57079633F;
		
		trailerModel[163].addBox(1F, 3F, 8F, 1, 9, 1, 0F); // Box 192
		trailerModel[163].setRotationPoint(33F, -16F, -13F);
		trailerModel[163].rotateAngleY = 1.57079633F;
		trailerModel[163].rotateAngleZ = 1.57079633F;
		
		trailerModel[164].addShapeBox(1F, 4F, 5F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		trailerModel[164].setRotationPoint(33F, -16F, -13F);
		trailerModel[164].rotateAngleY = 1.57079633F;
		trailerModel[164].rotateAngleZ = 1.57079633F;
		
		trailerModel[165].addShapeBox(1F, 4F, 1F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 194
		trailerModel[165].setRotationPoint(33F, -16F, -13F);
		trailerModel[165].rotateAngleY = 1.57079633F;
		trailerModel[165].rotateAngleZ = 1.57079633F;
		
		trailerModel[166].addShapeBox(1F, 9F, 1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		trailerModel[166].setRotationPoint(33F, -16F, -13F);
		trailerModel[166].rotateAngleY = 1.57079633F;
		trailerModel[166].rotateAngleZ = 1.57079633F;
		
		trailerModel[167].addBox(1F, 3F, 0F, 1, 9, 1, 0F); // Box 196
		trailerModel[167].setRotationPoint(33F, -16F, -13F);
		trailerModel[167].rotateAngleY = 1.57079633F;
		trailerModel[167].rotateAngleZ = 1.57079633F;
		
		trailerModel[168].addShapeBox(-2F, 0F, 7F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		trailerModel[168].setRotationPoint(24F, -16F, 13F);
		trailerModel[168].rotateAngleY = 4.71238898F;
		trailerModel[168].rotateAngleZ = 1.57079633F;
		
		trailerModel[169].addBox(-2F, 0F, 4F, 1, 1, 3, 0F); // Box 198
		trailerModel[169].setRotationPoint(24F, -16F, 13F);
		trailerModel[169].rotateAngleY = 4.71238898F;
		trailerModel[169].rotateAngleZ = 1.57079633F;
		
		trailerModel[170].addBox(-0.5F, 0F, 4F, 1, 1, 3, 0F); // Box 199
		trailerModel[170].setRotationPoint(24F, -16F, 13F);
		trailerModel[170].rotateAngleY = 4.71238898F;
		trailerModel[170].rotateAngleZ = 1.57079633F;
		
		trailerModel[171].addBox(1F, 0F, 4F, 1, 1, 3, 0F); // Box 200
		trailerModel[171].setRotationPoint(24F, -16F, 13F);
		trailerModel[171].rotateAngleY = 4.71238898F;
		trailerModel[171].rotateAngleZ = 1.57079633F;
		
		trailerModel[172].addShapeBox(-1F, 0.5F, 0.5F, 2, 2, 2, 0F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 201
		trailerModel[172].setRotationPoint(24F, -16F, 13F);
		trailerModel[172].rotateAngleY = 4.71238898F;
		trailerModel[172].rotateAngleZ = 1.57079633F;
		
		trailerModel[173].addShapeBox(-2F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		trailerModel[173].setRotationPoint(24F, -16F, 13F);
		trailerModel[173].rotateAngleY = 4.71238898F;
		trailerModel[173].rotateAngleZ = 1.57079633F;
		
		trailerModel[174].addBox(1F, 2F, 0F, 1, 1, 9, 0F); // Box 203
		trailerModel[174].setRotationPoint(24F, -16F, 13F);
		trailerModel[174].rotateAngleY = 4.71238898F;
		trailerModel[174].rotateAngleZ = 1.57079633F;
		
		trailerModel[175].addBox(-2F, 2F, 0F, 3, 11, 9, 0F); // Box 204
		trailerModel[175].setRotationPoint(24F, -16F, 13F);
		trailerModel[175].rotateAngleY = 4.71238898F;
		trailerModel[175].rotateAngleZ = 1.57079633F;
		
		trailerModel[176].addShapeBox(1F, 3F, 1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 205
		trailerModel[176].setRotationPoint(24F, -16F, 13F);
		trailerModel[176].rotateAngleY = 4.71238898F;
		trailerModel[176].rotateAngleZ = 1.57079633F;
		
		trailerModel[177].addBox(1F, 3F, 8F, 1, 9, 1, 0F); // Box 206
		trailerModel[177].setRotationPoint(24F, -16F, 13F);
		trailerModel[177].rotateAngleY = 4.71238898F;
		trailerModel[177].rotateAngleZ = 1.57079633F;
		
		trailerModel[178].addShapeBox(1F, 4F, 5F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		trailerModel[178].setRotationPoint(24F, -16F, 13F);
		trailerModel[178].rotateAngleY = 4.71238898F;
		trailerModel[178].rotateAngleZ = 1.57079633F;
		
		trailerModel[179].addShapeBox(1F, 4F, 1F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 208
		trailerModel[179].setRotationPoint(24F, -16F, 13F);
		trailerModel[179].rotateAngleY = 4.71238898F;
		trailerModel[179].rotateAngleZ = 1.57079633F;
		
		trailerModel[180].addShapeBox(1F, 9F, 1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		trailerModel[180].setRotationPoint(24F, -16F, 13F);
		trailerModel[180].rotateAngleY = 4.71238898F;
		trailerModel[180].rotateAngleZ = 1.57079633F;
		
		trailerModel[181].addBox(1F, 3F, 0F, 1, 9, 1, 0F); // Box 210
		trailerModel[181].setRotationPoint(24F, -16F, 13F);
		trailerModel[181].rotateAngleY = 4.71238898F;
		trailerModel[181].rotateAngleZ = 1.57079633F;
		
		
		steeringWheelModel = new ModelRendererTurbo[6];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Import PraweTylneKo?o
		steeringWheelModel[1] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import PraweTylneKo?o
		steeringWheelModel[2] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Import PraweTylneKo?o
		steeringWheelModel[3] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import PraweTylneKo?o
		steeringWheelModel[4] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 98
		steeringWheelModel[5] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 99
		
		steeringWheelModel[0].addBox(-1F, -1F, -1F, 1, 4, 2, 0F); // Import PraweTylneKo?o
		steeringWheelModel[0].setRotationPoint(1F, -17F, 7.5F);
		steeringWheelModel[0].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[1].addShapeBox(-1F, -6F, -5F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PraweTylneKo?o
		steeringWheelModel[1].setRotationPoint(1F, -17F, 7.5F);
		steeringWheelModel[1].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[2].addBox(-1F, -5F, 4F, 1, 8, 1, 0F); // Import PraweTylneKo?o
		steeringWheelModel[2].setRotationPoint(1F, -17F, 7.5F);
		steeringWheelModel[2].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[3].addBox(-1F, -1F, -4F, 1, 1, 8, 0F); // Import PraweTylneKo?o
		steeringWheelModel[3].setRotationPoint(1F, -17F, 7.5F);
		steeringWheelModel[3].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[4].addBox(-1F, -5F, -5F, 1, 8, 1, 0F); // Box 98
		steeringWheelModel[4].setRotationPoint(1F, -17F, 7.5F);
		steeringWheelModel[4].rotateAngleZ = -0.2268928F;
		
		steeringWheelModel[5].addShapeBox(-1F, 3F, -5F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 99
		steeringWheelModel[5].setRotationPoint(1F, -17F, 7.5F);
		steeringWheelModel[5].rotateAngleZ = -0.2268928F;
		
		
		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];
		
		gun_1_Model[0] = new ModelRendererTurbo[0];
		
		gun_1_Model[1] = new ModelRendererTurbo[38];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 1, 306, textureX, textureY); // Import Barrel
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 1, 314, textureX, textureY); // Import FiringMechanism
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 49, 306, textureX, textureY); // Import Underbarrelhandle2
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 25, 314, textureX, textureY); // Import UnderBarrel
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 49, 314, textureX, textureY); // Import Trigger
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 57, 306, textureX, textureY); // Import RearSight
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Import FrontSight
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 9, 322, textureX, textureY); // Import Pump
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 17, 322, textureX, textureY); // Box 0
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 25, 322, textureX, textureY); // Box 2
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 49, 322, textureX, textureY); // Box 3
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Box 4
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 57, 322, textureX, textureY); // Box 5
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 17, 330, textureX, textureY); // Box 6
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 33, 330, textureX, textureY); // Box 7
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 1, 338, textureX, textureY); // Box 8
		gun_1_Model[1][16] = new ModelRendererTurbo(this, 25, 338, textureX, textureY); // Box 9
		gun_1_Model[1][17] = new ModelRendererTurbo(this, 57, 330, textureX, textureY); // Box 10
		gun_1_Model[1][18] = new ModelRendererTurbo(this, 1, 306, textureX, textureY); // Box 0
		gun_1_Model[1][19] = new ModelRendererTurbo(this, 1, 314, textureX, textureY); // Box 0
		gun_1_Model[1][20] = new ModelRendererTurbo(this, 49, 306, textureX, textureY); // Box 0
		gun_1_Model[1][21] = new ModelRendererTurbo(this, 25, 314, textureX, textureY); // Box 0
		gun_1_Model[1][22] = new ModelRendererTurbo(this, 49, 314, textureX, textureY); // Box 0
		gun_1_Model[1][23] = new ModelRendererTurbo(this, 57, 306, textureX, textureY); // Box 0
		gun_1_Model[1][24] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Box 0
		gun_1_Model[1][25] = new ModelRendererTurbo(this, 9, 322, textureX, textureY); // Box 0
		gun_1_Model[1][26] = new ModelRendererTurbo(this, 17, 322, textureX, textureY); // Box 0
		gun_1_Model[1][27] = new ModelRendererTurbo(this, 25, 322, textureX, textureY); // Box 0
		gun_1_Model[1][28] = new ModelRendererTurbo(this, 49, 322, textureX, textureY); // Box 0
		gun_1_Model[1][29] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Box 0
		gun_1_Model[1][30] = new ModelRendererTurbo(this, 57, 322, textureX, textureY); // Box 0
		gun_1_Model[1][31] = new ModelRendererTurbo(this, 17, 330, textureX, textureY); // Box 0
		gun_1_Model[1][32] = new ModelRendererTurbo(this, 33, 330, textureX, textureY); // Box 0
		gun_1_Model[1][33] = new ModelRendererTurbo(this, 1, 338, textureX, textureY); // Box 0
		gun_1_Model[1][34] = new ModelRendererTurbo(this, 25, 338, textureX, textureY); // Box 0
		gun_1_Model[1][35] = new ModelRendererTurbo(this, 57, 330, textureX, textureY); // Box 0
		gun_1_Model[1][36] = new ModelRendererTurbo(this, 44, 334, textureX, textureY); // Box 18
		gun_1_Model[1][37] = new ModelRendererTurbo(this, 44, 334, textureX, textureY); // Box 19
		
		gun_1_Model[1][0].addBox(-7F, -1F, -4F, 22, 1, 1, 0F); // Import Barrel
		
		gun_1_Model[1][1].addBox(-5F, -1.3F, -4.5F, 9, 2, 2, 0F); // Import FiringMechanism
		
		gun_1_Model[1][2].addShapeBox(10F, -1.3F, -4.5F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Underbarrelhandle2
		
		gun_1_Model[1][3].addBox(1F, 0.1F, -4F, 10, 1, 1, 0F); // Import UnderBarrel
		
		gun_1_Model[1][4].addBox(-7.2F, 1.2F, -4F, 4, 1, 1, 0F); // Import Trigger
		
		gun_1_Model[1][5].addBox(-4F, -2.5F, -4F, 1, 1, 1, 0F); // Import RearSight
		
		gun_1_Model[1][6].addBox(12F, -1.8F, -4F, 1, 1, 1, 0F); // Import FrontSight
		
		gun_1_Model[1][7].addBox(1F, -0.800000000000001F, -3F, 1, 1, 1, 0F); // Import Pump
		
		gun_1_Model[1][8].addBox(4F, -2.8F, -4F, 1, 2, 1, 0F); // Box 0
		
		gun_1_Model[1][9].addBox(-5F, 0.7F, -4.5F, 8, 1, 2, 0F); // Box 2
		
		gun_1_Model[1][10].addBox(-8F, -1F, -4F, 1, 4, 1, 0F); // Box 3
		
		gun_1_Model[1][11].addBox(-12F, -1F, -4F, 4, 1, 1, 0F); // Box 4
		
		gun_1_Model[1][12].addBox(-12F, 0F, -4F, 2, 2, 1, 0F); // Box 5
		
		gun_1_Model[1][13].addBox(-12F, 2F, -4F, 4, 1, 1, 0F); // Box 6
		
		gun_1_Model[1][14].addBox(-2.5F, -2.3F, -4.5F, 6, 1, 2, 0F); // Box 7
		
		gun_1_Model[1][15].addShapeBox(-2.5F, -2.3F, -6.5F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		
		gun_1_Model[1][16].addShapeBox(-2.5F, -2.3F, -2.5F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 9
		
		gun_1_Model[1][17].addBox(-4.2F, 1.2F, -4F, 2, 2, 1, 0F); // Box 10
		
		gun_1_Model[1][18].addBox(-7F, -1F, 3F, 22, 1, 1, 0F); // Box 0
		
		gun_1_Model[1][19].addBox(-5F, -1.3F, 2.5F, 9, 2, 2, 0F); // Box 0
		
		gun_1_Model[1][20].addShapeBox(10F, -1.3F, 2.5F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		
		gun_1_Model[1][21].addBox(1F, 0.1F, 3F, 10, 1, 1, 0F); // Box 0
		
		gun_1_Model[1][22].addBox(-7.2F, 1.2F, 3F, 4, 1, 1, 0F); // Box 0
		
		gun_1_Model[1][23].addBox(-4F, -2.5F, 3F, 1, 1, 1, 0F); // Box 0
		
		gun_1_Model[1][24].addBox(12F, -1.8F, 3F, 1, 1, 1, 0F); // Box 0
		
		gun_1_Model[1][25].addBox(1F, -0.800000000000001F, 4F, 1, 1, 1, 0F); // Box 0
		
		gun_1_Model[1][26].addBox(10F, -3.8F, -0.5F, 1, 2, 1, 0F); // Box 0
		
		gun_1_Model[1][27].addBox(-5F, 0.7F, 2.5F, 8, 1, 2, 0F); // Box 0
		
		gun_1_Model[1][28].addBox(-8F, -1F, 3F, 1, 4, 1, 0F); // Box 0
		
		gun_1_Model[1][29].addBox(-12F, -1F, 3F, 4, 1, 1, 0F); // Box 0
		
		gun_1_Model[1][30].addBox(-12F, 0F, 3F, 2, 2, 1, 0F); // Box 0
		
		gun_1_Model[1][31].addBox(-12F, 2F, 3F, 4, 1, 1, 0F); // Box 0
		
		gun_1_Model[1][32].addBox(-2.5F, -2.3F, 2.5F, 6, 1, 2, 0F); // Box 0
		
		gun_1_Model[1][33].addShapeBox(-2.5F, -2.3F, 0.5F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		
		gun_1_Model[1][34].addShapeBox(-2.5F, -2.3F, 4.5F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		
		gun_1_Model[1][35].addBox(-4.2F, 1.2F, 3F, 2, 2, 1, 0F); // Box 0
		
		gun_1_Model[1][36].addBox(10F, -1.8F, -4F, 1, 1, 8, 0F); // Box 18
		
		gun_1_Model[1][37].addBox(-1F, 1.2F, -4F, 1, 1, 8, 0F); // Box 19
		
		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(11F, -21F, -7F);
		}
		
		
		gun_1_Model[2] = new ModelRendererTurbo[0];
		
		registerGunModel("PassengerGun1", gun_1_Model);
		
		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];
		
		gun_2_Model[0] = new ModelRendererTurbo[0];
		
		gun_2_Model[1] = new ModelRendererTurbo[8];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 2, 347, textureX, textureY); // Box 4
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 2, 355, textureX, textureY); // Box 7
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 2, 363, textureX, textureY); // Box 8
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 26, 347, textureX, textureY); // Box 9
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 26, 355, textureX, textureY); // Box 10
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 26, 363, textureX, textureY); // Box 11
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 18, 371, textureX, textureY); // Box 13
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 26, 371, textureX, textureY); // Box 14
		
		gun_2_Model[1][0].addShapeBox(-6F, -2.3F, -1F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 4
		
		gun_2_Model[1][1].addShapeBox(0.5F, -1.8F, -0.5F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		
		gun_2_Model[1][2].addShapeBox(1F, -1.8F, -0.5F, 10, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 8
		
		gun_2_Model[1][3].addShapeBox(-7.5F, -1.3F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		
		gun_2_Model[1][4].addShapeBox(-7.5F, -1.3F, -0.5F, 1, 3, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 10
		
		gun_2_Model[1][5].addShapeBox(-0.1F, -3F, -0.5F, 1, 1, 1, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 11
		
		gun_2_Model[1][6].addShapeBox(-5.5F, -2.5F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		
		gun_2_Model[1][7].addShapeBox(-5.5F, -3.25F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F); // Box 14
		
		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-15F, -30F, -13F);
		}
		
		
		gun_2_Model[2] = new ModelRendererTurbo[1];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 2, 371, textureX, textureY); // Box 299
		
		gun_2_Model[2][0].addShapeBox(-4.5F, -1.7F, 1F, 4, 2, 3, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F); // Box 299
		
		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-15F, -30F, -13F);
		}
		
		
		registerGunModel("PassengerGun2", gun_2_Model);
		
		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];
		
		gun_3_Model[0] = new ModelRendererTurbo[0];
		
		gun_3_Model[1] = new ModelRendererTurbo[18];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 1, 306, textureX, textureY); // Import Barrel
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 1, 314, textureX, textureY); // Import FiringMechanism
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 49, 306, textureX, textureY); // Import Underbarrelhandle2
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 25, 314, textureX, textureY); // Import UnderBarrel
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 49, 314, textureX, textureY); // Import Trigger
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 57, 306, textureX, textureY); // Import RearSight
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Import FrontSight
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 9, 322, textureX, textureY); // Import Pump
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 17, 322, textureX, textureY); // Box 0
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 25, 322, textureX, textureY); // Box 2
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 49, 322, textureX, textureY); // Box 3
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Box 4
		gun_3_Model[1][12] = new ModelRendererTurbo(this, 57, 322, textureX, textureY); // Box 5
		gun_3_Model[1][13] = new ModelRendererTurbo(this, 17, 330, textureX, textureY); // Box 6
		gun_3_Model[1][14] = new ModelRendererTurbo(this, 33, 330, textureX, textureY); // Box 7
		gun_3_Model[1][15] = new ModelRendererTurbo(this, 1, 338, textureX, textureY); // Box 8
		gun_3_Model[1][16] = new ModelRendererTurbo(this, 25, 338, textureX, textureY); // Box 9
		gun_3_Model[1][17] = new ModelRendererTurbo(this, 57, 330, textureX, textureY); // Box 10
		
		gun_3_Model[1][0].addBox(-7F, -1F, -0.5F, 22, 1, 1, 0F); // Import Barrel
		
		gun_3_Model[1][1].addBox(-5F, -1.3F, -1F, 9, 2, 2, 0F); // Import FiringMechanism
		
		gun_3_Model[1][2].addShapeBox(10F, -1.3F, -1F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Underbarrelhandle2
		
		gun_3_Model[1][3].addBox(1F, 0.1F, -0.5F, 10, 1, 1, 0F); // Import UnderBarrel
		
		gun_3_Model[1][4].addBox(-7.2F, 1.2F, -0.5F, 4, 1, 1, 0F); // Import Trigger
		
		gun_3_Model[1][5].addBox(-4F, -2.5F, -0.5F, 1, 1, 1, 0F); // Import RearSight
		
		gun_3_Model[1][6].addBox(12F, -1.8F, -0.5F, 1, 1, 1, 0F); // Import FrontSight
		
		gun_3_Model[1][7].addBox(1F, -0.800000000000001F, 0.5F, 1, 1, 1, 0F); // Import Pump
		
		gun_3_Model[1][8].addBox(4F, -2.8F, -0.5F, 1, 2, 1, 0F); // Box 0
		
		gun_3_Model[1][9].addBox(-5F, 0.7F, -1F, 8, 1, 2, 0F); // Box 2
		
		gun_3_Model[1][10].addBox(-8F, -1F, -0.5F, 1, 4, 1, 0F); // Box 3
		
		gun_3_Model[1][11].addBox(-12F, -1F, -0.5F, 4, 1, 1, 0F); // Box 4
		
		gun_3_Model[1][12].addBox(-12F, 0F, -0.5F, 2, 2, 1, 0F); // Box 5
		
		gun_3_Model[1][13].addBox(-12F, 2F, -0.5F, 4, 1, 1, 0F); // Box 6
		
		gun_3_Model[1][14].addBox(-2.5F, -2.3F, -1F, 6, 1, 2, 0F); // Box 7
		
		gun_3_Model[1][15].addShapeBox(-2.5F, -2.3F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		
		gun_3_Model[1][16].addShapeBox(-2.5F, -2.3F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 9
		
		gun_3_Model[1][17].addBox(-4.2F, 1.2F, -0.5F, 2, 2, 1, 0F); // Box 10
		
		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-33F, -31F, 0F);
		}
		
		
		gun_3_Model[2] = new ModelRendererTurbo[0];
		
		registerGunModel("PassengerGun3", gun_3_Model);
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
