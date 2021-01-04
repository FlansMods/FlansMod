//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelGreyhound extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	public ModelGreyhound() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[152];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 88, 274, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 240, 277, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 433, 268, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 43
		bodyModel[35] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 44
		bodyModel[36] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 45
		bodyModel[37] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 153
		bodyModel[41] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 154
		bodyModel[42] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 155
		bodyModel[43] = new ModelRendererTurbo(this, 155, 396, textureX, textureY); // Box 57
		bodyModel[44] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 59
		bodyModel[45] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 60
		bodyModel[46] = new ModelRendererTurbo(this, 144, 396, textureX, textureY); // Box 61
		bodyModel[47] = new ModelRendererTurbo(this, 152, 396, textureX, textureY); // Box 62
		bodyModel[48] = new ModelRendererTurbo(this, 152, 404, textureX, textureY); // Box 63
		bodyModel[49] = new ModelRendererTurbo(this, 155, 396, textureX, textureY); // Box 64
		bodyModel[50] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 78
		bodyModel[51] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 81
		bodyModel[52] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 85
		bodyModel[53] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 86
		bodyModel[54] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 87
		bodyModel[55] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 88
		bodyModel[56] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 90
		bodyModel[57] = new ModelRendererTurbo(this, 154, 396, textureX, textureY); // Box 94
		bodyModel[58] = new ModelRendererTurbo(this, 155, 396, textureX, textureY); // Box 95
		bodyModel[59] = new ModelRendererTurbo(this, 144, 395, textureX, textureY); // Box 108
		bodyModel[60] = new ModelRendererTurbo(this, 155, 395, textureX, textureY); // Box 109
		bodyModel[61] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 110
		bodyModel[62] = new ModelRendererTurbo(this, 169, 295, textureX, textureY); // Box 111
		bodyModel[63] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 112
		bodyModel[64] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 113
		bodyModel[65] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 114
		bodyModel[66] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 115
		bodyModel[67] = new ModelRendererTurbo(this, 155, 395, textureX, textureY); // Box 116
		bodyModel[68] = new ModelRendererTurbo(this, 155, 395, textureX, textureY); // Box 117
		bodyModel[69] = new ModelRendererTurbo(this, 152, 395, textureX, textureY); // Box 118
		bodyModel[70] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 129
		bodyModel[71] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 131
		bodyModel[72] = new ModelRendererTurbo(this, 130, 129, textureX, textureY); // Box 132
		bodyModel[73] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 138
		bodyModel[74] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 139
		bodyModel[75] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 140
		bodyModel[76] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 141
		bodyModel[77] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 142
		bodyModel[78] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 143
		bodyModel[79] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 144
		bodyModel[80] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 145
		bodyModel[81] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 146
		bodyModel[82] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 147
		bodyModel[83] = new ModelRendererTurbo(this, 141, 330, textureX, textureY); // Box 153
		bodyModel[84] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 7
		bodyModel[85] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 1
		bodyModel[87] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 2
		bodyModel[88] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 1
		bodyModel[90] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 9, 233, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Box 1
		bodyModel[93] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 3
		bodyModel[95] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 4
		bodyModel[96] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 5
		bodyModel[97] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 1
		bodyModel[99] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 2
		bodyModel[100] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 3
		bodyModel[101] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 1
		bodyModel[102] = new ModelRendererTurbo(this, 155, 396, textureX, textureY); // Box 2
		bodyModel[103] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 1
		bodyModel[105] = new ModelRendererTurbo(this, 0, 363, textureX, textureY); // Box 2
		bodyModel[106] = new ModelRendererTurbo(this, 61, 345, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 61, 375, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 1
		bodyModel[109] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 2
		bodyModel[110] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 3
		bodyModel[111] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 4
		bodyModel[112] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 5
		bodyModel[113] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 6
		bodyModel[114] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 7
		bodyModel[115] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 8
		bodyModel[116] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 9
		bodyModel[117] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 10
		bodyModel[118] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 11
		bodyModel[119] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 12
		bodyModel[120] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 9
		bodyModel[121] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 1
		bodyModel[123] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 3
		bodyModel[125] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 1
		bodyModel[127] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 2
		bodyModel[128] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 154, 396, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 155, 396, textureX, textureY); // Box 1
		bodyModel[131] = new ModelRendererTurbo(this, 155, 396, textureX, textureY); // Box 2
		bodyModel[132] = new ModelRendererTurbo(this, 144, 396, textureX, textureY); // Box 3
		bodyModel[133] = new ModelRendererTurbo(this, 152, 396, textureX, textureY); // Box 4
		bodyModel[134] = new ModelRendererTurbo(this, 152, 404, textureX, textureY); // Box 5
		bodyModel[135] = new ModelRendererTurbo(this, 144, 395, textureX, textureY); // Box 6
		bodyModel[136] = new ModelRendererTurbo(this, 155, 395, textureX, textureY); // Box 7
		bodyModel[137] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 8
		bodyModel[138] = new ModelRendererTurbo(this, 169, 295, textureX, textureY); // Box 9
		bodyModel[139] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 10
		bodyModel[140] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 11
		bodyModel[141] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 12
		bodyModel[142] = new ModelRendererTurbo(this, 169, 395, textureX, textureY); // Box 13
		bodyModel[143] = new ModelRendererTurbo(this, 155, 395, textureX, textureY); // Box 14
		bodyModel[144] = new ModelRendererTurbo(this, 155, 395, textureX, textureY); // Box 15
		bodyModel[145] = new ModelRendererTurbo(this, 152, 395, textureX, textureY); // Box 16
		bodyModel[146] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 17
		bodyModel[147] = new ModelRendererTurbo(this, 269, 343, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 0, 451, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 0, 423, textureX, textureY); // Box 1
		bodyModel[150] = new ModelRendererTurbo(this, 0, 451, textureX, textureY); // Box 4
		bodyModel[151] = new ModelRendererTurbo(this, 0, 423, textureX, textureY); // Box 5
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 17, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(16F, -21F, -16F);
		
		bodyModel[1].addShapeBox(0F, 0F, 0F, 32, 17, 32, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-52F, -21F, -16F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 6, 8, 0F, -2F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-50F, -21F, -24F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 37, 6, 8, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-20F, -21F, -24F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 37, 8, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 5
		bodyModel[4].setRotationPoint(-20F, -5F, -16F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 32, 7, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -12F, 0F, -3F); // Box 6
		bodyModel[5].setRotationPoint(-52F, -4F, -16F);
		
		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 13, 30, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 7
		bodyModel[6].setRotationPoint(-52.75F, -18F, -15F);
		
		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(17F, 2F, -13F);
		
		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 17, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(17F, -21F, -16F);
		
		bodyModel[9].addShapeBox(0F, 0F, 0F, 17, 17, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(17F, -21F, 14F);
		
		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 28, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(16F, -25F, -14F);
		
		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, -2F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F); // Box 13
		bodyModel[11].setRotationPoint(17F, -25F, -14F);
		
		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 7, 2, 0F, -2F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F); // Box 14
		bodyModel[12].setRotationPoint(17F, -25F, 14F);
		
		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(28F, -24F, -3F);
		
		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 9, 32, 0F, 0F, 0F, 0F, 0F, -8.99999F, 0F, 0F, -8.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(34F, -18F, -16F);
		
		bodyModel[15].addShapeBox(0F, 0F, 0F, 14, 5, 32, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.1F, 0F, 0F, -3.1F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(34F, -9F, -16F);
		
		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 7, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F); // Box 21
		bodyModel[16].setRotationPoint(36F, -4F, -16F);
		
		bodyModel[17].addShapeBox(0F, 0F, 0F, 19, 7, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 22
		bodyModel[17].setRotationPoint(17F, -4F, 12F);
		
		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 7, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(17F, -4F, -15F);
		
		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 12, 42, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, -5F); // Box 24
		bodyModel[19].setRotationPoint(42F, -9F, -21F);
		
		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 6, 8, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(17F, -21F, -24F);
		
		bodyModel[21].addShapeBox(0F, 0F, 0F, 14, 9, 8, 0F, 0F, 0F, -3F, 0F, -8.99999F, -3F, 0F, -8.99999F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 26
		bodyModel[21].setRotationPoint(34F, -18F, -24F);
		
		bodyModel[22].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, 0F, -3F, 0F, -5.99999F, -5.99999F, 0F, -5.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.99999F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 27
		bodyModel[22].setRotationPoint(34F, -15F, -27F);
		
		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 6, 11, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(18F, -15F, -27F);
		
		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(15F, -9F, -27F);
		
		bodyModel[25].addShapeBox(0F, 0F, 0F, 49, 3, 11, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[25].setRotationPoint(-51F, -15F, -27F);
		
		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F, 0F, 0F, -3F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(-2F, -15F, -27F);
		
		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 8, 12, 0F, 0F, 0F, -1F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.999999F, 0F, 0F, 0F, 0F, 0F, -11F); // Box 36
		bodyModel[27].setRotationPoint(-2F, -12F, -28F);
		
		bodyModel[28].addShapeBox(0F, 0F, 0F, 23, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -7.9999F, -5F, 0F, -7.9999F, -5F, 0F, 0F, -7F, 0F, 0F); // Box 37
		bodyModel[28].setRotationPoint(-2F, -15F, -24F);
		
		bodyModel[29].addShapeBox(0F, 0F, 0F, 30, 6, 8, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[29].setRotationPoint(-50F, -21F, 16F);
		
		bodyModel[30].addShapeBox(0F, 0F, 0F, 37, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[30].setRotationPoint(-20F, -21F, 16F);
		
		bodyModel[31].addShapeBox(0F, 0F, 0F, 17, 6, 8, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[31].setRotationPoint(17F, -21F, 16F);
		
		bodyModel[32].addShapeBox(0F, 0F, 0F, 14, 9, 8, 0F, 0F, 0F, 0F, 0F, -8.99999F, 0F, 0F, -8.99999F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, 0F); // Box 41
		bodyModel[32].setRotationPoint(34F, -18F, 16F);
		
		bodyModel[33].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, 0F, 0F, 0F, -5.99999F, 0F, 0F, -5.99999F, -5.99999F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5.99999F, 0F, 0F, 0F); // Box 42
		bodyModel[33].setRotationPoint(34F, -15F, 21F);
		
		bodyModel[34].addShapeBox(0F, 0F, 0F, 16, 6, 11, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[34].setRotationPoint(18F, -15F, 16F);
		
		bodyModel[35].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[35].setRotationPoint(15F, -9F, 26F);
		
		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 6, 11, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[36].setRotationPoint(15F, -9F, 15F);
		
		bodyModel[37].addShapeBox(0F, 0F, 0F, 49, 3, 11, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[37].setRotationPoint(-51F, -15F, 16F);
		
		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 48
		bodyModel[38].setRotationPoint(-2F, -15F, 16F);
		
		bodyModel[39].addShapeBox(0F, 0F, 0F, 23, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -7.9999F, -7F, 0F, -7.9999F); // Box 50
		bodyModel[39].setRotationPoint(-2F, -15F, 16F);
		
		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 153
		bodyModel[40].setRotationPoint(42.5F, -17F, -11.5F);
		
		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[41].setRotationPoint(42.5F, -17F, -12.5F);
		
		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[42].setRotationPoint(42.5F, -17F, -13.5F);
		
		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[43].setRotationPoint(41.5F, -14F, -12.5F);
		
		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[44].setRotationPoint(42.5F, -17F, 11.5F);
		
		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 60
		bodyModel[45].setRotationPoint(42.5F, -17F, 12.5F);
		
		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[46].setRotationPoint(40.5F, -17F, 11.5F);
		
		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 62
		bodyModel[47].setRotationPoint(40.5F, -17F, 10.5F);
		
		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F); // Box 63
		bodyModel[48].setRotationPoint(40.5F, -17F, 12.5F);
		
		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[49].setRotationPoint(41.5F, -14F, 11.5F);
		
		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[50].setRotationPoint(-50F, -23F, -14F);
		bodyModel[50].rotateAngleY = 0.19198622F;
		
		bodyModel[51].addShapeBox(0F, 0F, 0F, 11, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[51].setRotationPoint(-42F, -25F, 12.5F);
		bodyModel[51].rotateAngleY = -0.10471976F;
		
		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[52].setRotationPoint(-23F, -25F, 14.5F);
		bodyModel[52].rotateAngleY = 0.13962634F;
		bodyModel[52].rotateAngleZ = 0.06981317F;
		
		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 5, 12, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[53].setRotationPoint(-50F, -24F, 2F);
		
		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[54].setRotationPoint(-50F, -23F, 7.5F);
		bodyModel[54].rotateAngleZ = -0.29670597F;
		
		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[55].setRotationPoint(-47F, -23F, 7.5F);
		bodyModel[55].rotateAngleZ = 0.76794487F;
		
		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 4, 29, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[56].setRotationPoint(-25F, -23F, -15F);
		
		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[57].setRotationPoint(36F, -18F, 14F);
		
		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[58].setRotationPoint(39F, -17F, 14F);
		
		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[59].setRotationPoint(42F, -7F, 9.5F);
		
		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[60].setRotationPoint(50F, -7F, 9.5F);
		
		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[61].setRotationPoint(49F, -7F, 8.5F);
		
		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[62].setRotationPoint(48F, -7F, 8.5F);
		
		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 112
		bodyModel[63].setRotationPoint(47F, -7F, 8.5F);
		
		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 113
		bodyModel[64].setRotationPoint(47F, -7F, 10.5F);
		
		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[65].setRotationPoint(48F, -7F, 10.5F);
		
		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[66].setRotationPoint(49F, -7F, 10.5F);
		
		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[67].setRotationPoint(48F, -6F, 7.5F);
		
		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[68].setRotationPoint(48F, -6F, 11.5F);
		
		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 118
		bodyModel[69].setRotationPoint(48F, -2F, 7.5F);
		
		bodyModel[70].addBox(0F, 0F, 0F, 3, 3, 46, 0F); // Box 129
		bodyModel[70].setRotationPoint(-15F, -2F, -23F);
		
		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 6, 11, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[71].setRotationPoint(15F, -9F, -26F);
		
		bodyModel[72].addBox(-1F, -1.5F, -24F, 3, 3, 48, 0F); // Box 132
		bodyModel[72].setRotationPoint(30F, 1F, 0F);
		
		bodyModel[73].addShapeBox(0F, 0F, 0F, 51, 8, 2, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 138
		bodyModel[73].setRotationPoint(-53F, -12F, -28F);
		
		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[74].setRotationPoint(-52F, -12F, -27F);
		
		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 8, 12, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11.999999F, 0F, 0F, 0F); // Box 140
		bodyModel[75].setRotationPoint(-2F, -12F, 16F);
		
		bodyModel[76].addShapeBox(0F, 0F, 0F, 51, 8, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 141
		bodyModel[76].setRotationPoint(-53F, -12F, 26F);
		
		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[77].setRotationPoint(-52F, -12F, 16F);
		
		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 17, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[78].setRotationPoint(-20F, -21F, -16F);
		
		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 17, 11, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -7.9999F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -7.9999F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 144
		bodyModel[79].setRotationPoint(-16F, -21F, -16F);
		
		bodyModel[80].addShapeBox(0F, 0F, 0F, 11, 17, 11, 0F, 0F, 0F, -0.1F, -7.9999F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -7.9999F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 145
		bodyModel[80].setRotationPoint(-16F, -21F, 5F);
		
		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 16, 11, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[81].setRotationPoint(5F, -21F, 5F);
		
		bodyModel[82].addShapeBox(0F, 0F, 0F, 11, 16, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, 0F); // Box 147
		bodyModel[82].setRotationPoint(5F, -21F, -16F);
		
		bodyModel[83].addShapeBox(0F, 0F, 0F, 32, 11, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[83].setRotationPoint(-16F, -15F, -16F);
		
		bodyModel[84].addBox(0F, 0F, 0F, 3, 3, 46, 0F); // Box 7
		bodyModel[84].setRotationPoint(-40.5F, -2F, -23F);
		
		bodyModel[85].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 0
		bodyModel[85].setRotationPoint(-30F, -23F, 3F);
		bodyModel[85].rotateAngleY = -0.52359878F;
		bodyModel[85].rotateAngleZ = 0.03490659F;
		
		bodyModel[86].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 1
		bodyModel[86].setRotationPoint(-34F, -23F, 9F);
		bodyModel[86].rotateAngleY = -1.53588974F;
		bodyModel[86].rotateAngleZ = -0.03490659F;
		
		bodyModel[87].addShapeBox(1.5F, 3.5F, 0.2F, 49, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 2
		bodyModel[87].setRotationPoint(-53F, -12F, 26F);
		bodyModel[87].rotateAngleX = 0.13962634F;
		
		bodyModel[88].addShapeBox(1.5F, 6F, 0.2F, 49, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 0
		bodyModel[88].setRotationPoint(-53F, -12F, 26F);
		bodyModel[88].rotateAngleX = 0.13962634F;
		
		bodyModel[89].addShapeBox(1.5F, 3.5F, -0.3F, 49, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 1
		bodyModel[89].setRotationPoint(-53F, -12F, -27F);
		bodyModel[89].rotateAngleX = -0.13962634F;
		
		bodyModel[90].addShapeBox(1.5F, 6F, -0.3F, 49, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 2
		bodyModel[90].setRotationPoint(-53F, -12F, -27F);
		bodyModel[90].rotateAngleX = -0.13962634F;
		
		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[91].setRotationPoint(-52.75F, -17F, -15F);
		bodyModel[91].rotateAngleZ = -0.29670597F;
		
		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[92].setRotationPoint(-52.75F, -15F, -15F);
		bodyModel[92].rotateAngleZ = -0.29670597F;
		
		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[93].setRotationPoint(-52.75F, -11F, -15F);
		bodyModel[93].rotateAngleZ = -0.29670597F;
		
		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[94].setRotationPoint(-52.75F, -13F, -15F);
		bodyModel[94].rotateAngleZ = -0.29670597F;
		
		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[95].setRotationPoint(-52.75F, -9F, -15F);
		bodyModel[95].rotateAngleZ = -0.29670597F;
		
		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[96].setRotationPoint(-52.75F, -7F, -15F);
		bodyModel[96].rotateAngleZ = -0.29670597F;
		
		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[97].setRotationPoint(20F, -25.3F, 3F);
		bodyModel[97].rotateAngleZ = -0.05235988F;
		
		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[98].setRotationPoint(20F, -24.5F, -3F);
		bodyModel[98].rotateAngleZ = -0.05235988F;
		
		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[99].setRotationPoint(19.5F, -24F, 3F);
		bodyModel[99].rotateAngleZ = -0.05235988F;
		
		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[100].setRotationPoint(19.5F, -24F, -14F);
		bodyModel[100].rotateAngleZ = -0.05235988F;
		
		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[101].setRotationPoint(22F, -25.8F, 4F);
		bodyModel[101].rotateAngleZ = -0.05235988F;
		
		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[102].setRotationPoint(36F, -17F, 14F);
		
		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 0
		bodyModel[103].setRotationPoint(44F, -21F, -10.5F);
		bodyModel[103].rotateAngleZ = -0.38397244F;
		
		bodyModel[104].addShapeBox(0F, 0F, 0F, 18, 7, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F); // Box 1
		bodyModel[104].setRotationPoint(-0.5F, -11F, -27F);
		
		bodyModel[105].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[105].setRotationPoint(-0.5F, -15F, -27F);
		
		bodyModel[106].addShapeBox(0F, 0F, 0F, 18, 7, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 0
		bodyModel[106].setRotationPoint(-0.5F, -11F, 15F);
		
		bodyModel[107].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(-0.5F, -15F, 15F);
		
		bodyModel[108].addShapeBox(1.5F, 3.5F, -0.3F, 15, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 1
		bodyModel[108].setRotationPoint(-0.5F, -13F, -27F);
		
		bodyModel[109].addShapeBox(1.5F, 6F, -0.3F, 13, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 2
		bodyModel[109].setRotationPoint(0.5F, -13F, -27F);
		
		bodyModel[110].addShapeBox(0.5F, 0.5F, -0.3F, 17, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 3
		bodyModel[110].setRotationPoint(-0.5F, -15F, -24.5F);
		bodyModel[110].rotateAngleX = -0.55850536F;
		
		bodyModel[111].addShapeBox(0.5F, 2.5F, -0.3F, 17, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 4
		bodyModel[111].setRotationPoint(-0.5F, -15F, -24.5F);
		bodyModel[111].rotateAngleX = -0.55850536F;
		
		bodyModel[112].addShapeBox(0.5F, 0.5F, -0.3F, 17, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 5
		bodyModel[112].setRotationPoint(-0.5F, -15F, 24F);
		bodyModel[112].rotateAngleX = 0.55850536F;
		
		bodyModel[113].addShapeBox(0.5F, 2.5F, -0.3F, 17, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 6
		bodyModel[113].setRotationPoint(-0.5F, -15F, 24F);
		bodyModel[113].rotateAngleX = 0.55850536F;
		
		bodyModel[114].addShapeBox(1.5F, 3.5F, -0.3F, 15, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 7
		bodyModel[114].setRotationPoint(-0.5F, -13F, 26.5F);
		
		bodyModel[115].addShapeBox(1.5F, 6F, -0.3F, 13, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 8
		bodyModel[115].setRotationPoint(0.5F, -13F, 26.5F);
		
		bodyModel[116].addShapeBox(0F, 0F, -0.3F, 2, 2, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 9
		bodyModel[116].setRotationPoint(1F, -12F, -27F);
		
		bodyModel[117].addShapeBox(0F, 0F, -0.3F, 2, 2, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 10
		bodyModel[117].setRotationPoint(14.5F, -12F, -27F);
		
		bodyModel[118].addShapeBox(0F, 0F, -0.3F, 2, 2, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 11
		bodyModel[118].setRotationPoint(1F, -12F, 26.5F);
		
		bodyModel[119].addShapeBox(0F, 0F, -0.3F, 2, 2, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 12
		bodyModel[119].setRotationPoint(14.5F, -12F, 26.5F);
		
		bodyModel[120].addShapeBox(-1F, 0F, 2F, 5, 5, 7, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -5F, 0F); // Box 9
		bodyModel[120].setRotationPoint(34F, -19F, 3F);
		
		bodyModel[121].addBox(0F, 0F, 0F, 3, 16, 10, 0F); // Box 0
		bodyModel[121].setRotationPoint(-16F, -21F, -5F);
		
		bodyModel[122].addBox(0F, 0F, 0F, 3, 16, 10, 0F); // Box 1
		bodyModel[122].setRotationPoint(13F, -21F, -5F);
		
		bodyModel[123].addBox(0F, 0F, 0F, 14, 16, 3, 0F); // Box 2
		bodyModel[123].setRotationPoint(-7F, -21F, 13F);
		
		bodyModel[124].addBox(0F, 0F, 0F, 14, 16, 3, 0F); // Box 3
		bodyModel[124].setRotationPoint(-7F, -21F, -16F);
		
		bodyModel[125].addShapeBox(-5F, -4F, 2F, 5, 5, 7, 0F, 0F, 1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 1F, 0F, 1F, -6F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 1F, -6F, 0F); // Box 0
		bodyModel[125].setRotationPoint(34F, -19F, 3F);
		
		bodyModel[126].addShapeBox(-5F, -4F, 0F, 5, 5, 2, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F); // Box 1
		bodyModel[126].setRotationPoint(34F, -19F, 3F);
		
		bodyModel[127].addShapeBox(-5F, -4F, 9F, 5, 5, 2, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F); // Box 2
		bodyModel[127].setRotationPoint(34F, -19F, 3F);
		
		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[128].setRotationPoint(42.5F, -17F, 10.5F);
		
		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[129].setRotationPoint(36F, -18F, -15F);
		
		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[130].setRotationPoint(39F, -17F, -15F);
		
		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[131].setRotationPoint(36F, -17F, -15F);
		
		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[132].setRotationPoint(40.5F, -17F, -12.5F);
		
		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F); // Box 4
		bodyModel[133].setRotationPoint(40.5F, -17F, -11.5F);
		
		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99999F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 5
		bodyModel[134].setRotationPoint(40.5F, -17F, -13.5F);
		
		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[135].setRotationPoint(42F, -7F, -10.5F);
		
		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[136].setRotationPoint(50F, -7F, -10.5F);
		
		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[137].setRotationPoint(49F, -7F, -9.5F);
		
		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[138].setRotationPoint(48F, -7F, -9.5F);
		
		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 10
		bodyModel[139].setRotationPoint(47F, -7F, -9.5F);
		
		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[140].setRotationPoint(47F, -7F, -11.5F);
		
		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[141].setRotationPoint(48F, -7F, -11.5F);
		
		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[142].setRotationPoint(49F, -7F, -11.5F);
		
		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[143].setRotationPoint(48F, -6F, -8.5F);
		
		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[144].setRotationPoint(48F, -6F, -12.5F);
		
		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 16
		bodyModel[145].setRotationPoint(48F, -2F, -12.5F);
		
		bodyModel[146].addShapeBox(0F, -2.2F, 0F, 8, 4, 12, 0F, 0.2F, -1.7F, 0.2F, 0.2F, -1.7F, 0.2F, 0.2F, -1.7F, 0.2F, 0.2F, -1.7F, 0.2F, 0.2F, -1.7F, 0.2F, 0.2F, -1.7F, 0.2F, 0.2F, -1.7F, 0.2F, 0.2F, -1.7F, 0.2F); // Box 17
		bodyModel[146].setRotationPoint(-50F, -23F, -14F);
		bodyModel[146].rotateAngleX = -0.01745329F;
		bodyModel[146].rotateAngleY = 0.19198622F;
		bodyModel[146].rotateAngleZ = 0.05235988F;
		
		bodyModel[147].addShapeBox(0F, 0F, 0F, 41, 41, 1, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, -32F, -32F, 0F, -32F, -32F, 0F, 0F, -32F, 0F); // Box 0
		bodyModel[147].setRotationPoint(36F, -15.8F, 7F);
		bodyModel[147].rotateAngleX = 1.01229097F;
		bodyModel[147].rotateAngleY = -1.57079633F;
		
		bodyModel[148].addBox(0F, 0F, 0F, 15, 1, 12, 0F); // Box 0
		bodyModel[148].setRotationPoint(18.8F, -1F, -13F);
		
		bodyModel[149].addBox(0F, 0F, 0F, 1, 10, 12, 0F); // Box 1
		bodyModel[149].setRotationPoint(18F, -10.5F, -13F);
		bodyModel[149].rotateAngleZ = 0.08726646F;
		
		bodyModel[150].addBox(0F, 0F, 0F, 15, 1, 12, 0F); // Box 4
		bodyModel[150].setRotationPoint(18.8F, -1F, 1F);
		
		bodyModel[151].addBox(0F, 0F, 0F, 1, 10, 12, 0F); // Box 5
		bodyModel[151].setRotationPoint(18F, -10.5F, 1F);
		bodyModel[151].rotateAngleZ = 0.08726646F;
		
		
		bodyDoorOpenModel = new ModelRendererTurbo[6];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 6
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 7
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 18
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 1
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 3
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 4
		
		bodyDoorOpenModel[0].addShapeBox(0F, -0.5F, 0F, 9, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyDoorOpenModel[0].setRotationPoint(20F, -25F, -14F);
		bodyDoorOpenModel[0].rotateAngleX = 3.38593875F;
		bodyDoorOpenModel[0].rotateAngleZ = -0.05235988F;
		
		bodyDoorOpenModel[1].addShapeBox(2F, -1F, 9F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyDoorOpenModel[1].setRotationPoint(20F, -25F, -14F);
		bodyDoorOpenModel[1].rotateAngleX = 3.38593875F;
		bodyDoorOpenModel[1].rotateAngleZ = -0.05235988F;
		
		bodyDoorOpenModel[2].addShapeBox(-1F, 0F, 2F, 5, 5, 7, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -5F, 0F); // Box 18
		bodyDoorOpenModel[2].setRotationPoint(34F, -18F, -14F);
		bodyDoorOpenModel[2].rotateAngleZ = -2.86233997F;
		
		bodyDoorOpenModel[3].addShapeBox(-5F, -4F, 2F, 5, 5, 7, 0F, 0F, 1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 1F, 0F, 1F, -6F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 1F, -6F, 0F); // Box 1
		bodyDoorOpenModel[3].setRotationPoint(34F, -18F, -14F);
		bodyDoorOpenModel[3].rotateAngleZ = -2.86233997F;
		
		bodyDoorOpenModel[4].addShapeBox(-5F, -4F, 9F, 5, 5, 2, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F); // Box 3
		bodyDoorOpenModel[4].setRotationPoint(34F, -18F, -14F);
		bodyDoorOpenModel[4].rotateAngleZ = -2.86233997F;
		
		bodyDoorOpenModel[5].addShapeBox(-5F, -4F, 0F, 5, 5, 2, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F); // Box 4
		bodyDoorOpenModel[5].setRotationPoint(34F, -18F, -14F);
		bodyDoorOpenModel[5].rotateAngleZ = -2.86233997F;
		
		
		bodyDoorCloseModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Box 2
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 3
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 8
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 0
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 2
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 0
		
		bodyDoorCloseModel[0].addShapeBox(0F, -0.5F, 0F, 9, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyDoorCloseModel[0].setRotationPoint(20F, -24.8F, -14F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.05235988F;
		
		bodyDoorCloseModel[1].addShapeBox(2F, -1F, 9F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyDoorCloseModel[1].setRotationPoint(20F, -24.8F, -14F);
		bodyDoorCloseModel[1].rotateAngleZ = -0.05235988F;
		
		bodyDoorCloseModel[2].addShapeBox(-5F, -4F, 0F, 5, 5, 2, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F); // Box 8
		bodyDoorCloseModel[2].setRotationPoint(34F, -19F, -14F);
		
		bodyDoorCloseModel[3].addShapeBox(-5F, -4F, 2F, 5, 5, 7, 0F, 0F, 1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 1F, 0F, 1F, -6F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 1F, -6F, 0F); // Box 0
		bodyDoorCloseModel[3].setRotationPoint(34F, -19F, -14F);
		
		bodyDoorCloseModel[4].addShapeBox(-1F, 0F, 2F, 5, 5, 7, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -5F, 0F); // Box 2
		bodyDoorCloseModel[4].setRotationPoint(34F, -19F, -14F);
		
		bodyDoorCloseModel[5].addShapeBox(-5F, -4F, 9F, 5, 5, 2, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F); // Box 0
		bodyDoorCloseModel[5].setRotationPoint(34F, -19F, -14F);
		
		
		turretModel = new ModelRendererTurbo[67];
		turretModel[0] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 152
		turretModel[1] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 154
		turretModel[2] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 155
		turretModel[3] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 156
		turretModel[4] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 157
		turretModel[5] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 158
		turretModel[6] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 159
		turretModel[7] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 160
		turretModel[8] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 161
		turretModel[9] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 162
		turretModel[10] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 163
		turretModel[11] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 164
		turretModel[12] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 165
		turretModel[13] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 166
		turretModel[14] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 167
		turretModel[15] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 0
		turretModel[16] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 1
		turretModel[17] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 11
		turretModel[18] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 12
		turretModel[19] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 13
		turretModel[20] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 14
		turretModel[21] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 15
		turretModel[22] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 16
		turretModel[23] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 17
		turretModel[24] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 18
		turretModel[25] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 19
		turretModel[26] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 20
		turretModel[27] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 21
		turretModel[28] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 22
		turretModel[29] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 23
		turretModel[30] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 29
		turretModel[31] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 30
		turretModel[32] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 31
		turretModel[33] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 32
		turretModel[34] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 33
		turretModel[35] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 35
		turretModel[36] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 36
		turretModel[37] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 37
		turretModel[38] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 38
		turretModel[39] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 39
		turretModel[40] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 40
		turretModel[41] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 41
		turretModel[42] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 0
		turretModel[43] = new ModelRendererTurbo(this, 1, 291, textureX, textureY); // Box 3
		turretModel[44] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 0
		turretModel[45] = new ModelRendererTurbo(this, 122, 30, textureX, textureY); // Box 299
		turretModel[46] = new ModelRendererTurbo(this, 122, 30, textureX, textureY); // Box 299
		turretModel[47] = new ModelRendererTurbo(this, 138, 30, textureX, textureY); // Box 299
		turretModel[48] = new ModelRendererTurbo(this, 146, 30, textureX, textureY); // Box 299
		turretModel[49] = new ModelRendererTurbo(this, 162, 30, textureX, textureY); // Box 299
		turretModel[50] = new ModelRendererTurbo(this, 170, 38, textureX, textureY); // Box 299
		turretModel[51] = new ModelRendererTurbo(this, 138, 30, textureX, textureY); // Box 299
		turretModel[52] = new ModelRendererTurbo(this, 138, 38, textureX, textureY); // Box 299
		turretModel[53] = new ModelRendererTurbo(this, 162, 30, textureX, textureY); // Box 299
		turretModel[54] = new ModelRendererTurbo(this, 178, 30, textureX, textureY); // Box 299
		turretModel[55] = new ModelRendererTurbo(this, 8, 291, textureX, textureY); // Box 0
		turretModel[56] = new ModelRendererTurbo(this, 11, 291, textureX, textureY); // Box 1
		turretModel[57] = new ModelRendererTurbo(this, 13, 291, textureX, textureY); // Box 2
		turretModel[58] = new ModelRendererTurbo(this, 10, 291, textureX, textureY); // Box 3
		turretModel[59] = new ModelRendererTurbo(this, 10, 291, textureX, textureY); // Box 4
		turretModel[60] = new ModelRendererTurbo(this, 10, 291, textureX, textureY); // Box 5
		turretModel[61] = new ModelRendererTurbo(this, 11, 291, textureX, textureY); // Box 6
		turretModel[62] = new ModelRendererTurbo(this, 13, 291, textureX, textureY); // Box 7
		turretModel[63] = new ModelRendererTurbo(this, 8, 291, textureX, textureY); // Box 8
		turretModel[64] = new ModelRendererTurbo(this, 10, 291, textureX, textureY); // Box 9
		turretModel[65] = new ModelRendererTurbo(this, 1, 291, textureX, textureY); // Box 10
		turretModel[66] = new ModelRendererTurbo(this, 269, 343, textureX, textureY); // Box 1
		
		turretModel[0].addShapeBox(7F, -2F, -16F, 9, 8, 8, 0F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F); // Box 152
		turretModel[0].setRotationPoint(0F, -21F, 0F);
		
		turretModel[1].addShapeBox(-8F, -2F, -16F, 16, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		turretModel[1].setRotationPoint(0F, -21F, 0F);
		
		turretModel[2].addShapeBox(-16F, -2F, -16F, 9, 8, 8, 0F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F); // Box 155
		turretModel[2].setRotationPoint(0F, -21F, 0F);
		
		turretModel[3].addShapeBox(-16F, -2F, 8F, 9, 8, 8, 0F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F); // Box 156
		turretModel[3].setRotationPoint(0F, -21F, 0F);
		
		turretModel[4].addShapeBox(-8F, -2F, 15F, 16, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		turretModel[4].setRotationPoint(0F, -21F, 0F);
		
		turretModel[5].addShapeBox(7F, -2F, 8F, 9, 8, 8, 0F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F, -8F, 0F, -0.001F, 0F, 0F, -0.001F); // Box 158
		turretModel[5].setRotationPoint(0F, -21F, 0F);
		
		turretModel[6].addShapeBox(-16F, -2F, -8F, 1, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		turretModel[6].setRotationPoint(0F, -21F, 0F);
		
		turretModel[7].addShapeBox(15F, -2F, -8F, 1, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		turretModel[7].setRotationPoint(0F, -21F, 0F);
		
		turretModel[8].addShapeBox(10F, -12F, -8F, 7, 10, 16, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		turretModel[8].setRotationPoint(0F, -21F, 0F);
		
		turretModel[9].addShapeBox(4F, -12F, 4F, 13, 10, 13, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -12.99999F, 0F, -6F, 0F, 0F, -8F, -6F, 0F, 0F, 0F, 0F, -4F, -8.99999F, 0F, 0F, 0F, 0F, -8F); // Box 162
		turretModel[9].setRotationPoint(0F, -21F, 0F);
		
		turretModel[10].addShapeBox(-8F, -12F, 9F, 16, 10, 8, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		turretModel[10].setRotationPoint(0F, -21F, 0F);
		
		turretModel[11].addShapeBox(-17F, -12F, 4F, 13, 10, 13, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -8F, -12.99999F, 0F, -6F, 0F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, -8F, -8.99999F, 0F, 0F); // Box 164
		turretModel[11].setRotationPoint(0F, -21F, 0F);
		
		turretModel[12].addShapeBox(-17F, -12F, -8F, 7, 10, 16, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		turretModel[12].setRotationPoint(0F, -21F, 0F);
		
		turretModel[13].addShapeBox(-8F, -12F, -17F, 16, 10, 8, 0F, -4F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		turretModel[13].setRotationPoint(0F, -21F, 0F);
		
		turretModel[14].addShapeBox(-17F, -12F, -17F, 13, 10, 13, 0F, -12.99999F, 0F, -6F, 0F, 0F, -8F, -6F, 0F, 0F, -5F, 0F, 0F, -8.99999F, 0F, 0F, 0F, 0F, -8F, -6F, 0F, 0F, 0F, 0F, -4F); // Box 167
		turretModel[14].setRotationPoint(0F, -21F, 0F);
		
		turretModel[15].addShapeBox(4F, -12F, -17F, 13, 10, 13, 0F, 0F, 0F, -8F, -12.99999F, 0F, -6F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -8F, -8.99999F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, 0F); // Box 0
		turretModel[15].setRotationPoint(0F, -21F, 0F);
		
		turretModel[16].addShapeBox(-4F, -11F, 10.2F, 8, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[16].setRotationPoint(0F, -21.5F, 0F);
		
		turretModel[17].addShapeBox(12F, -17F, -5F, 1, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[17].setRotationPoint(0F, -22.5F, 0F);
		
		turretModel[18].addShapeBox(-5F, -17F, -12F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[18].setRotationPoint(0F, -22.5F, 0F);
		
		turretModel[19].addShapeBox(4F, -17F, -12F, 9, 2, 7, 0F, -1F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 13
		turretModel[19].setRotationPoint(0F, -22.5F, 0F);
		
		turretModel[20].addShapeBox(-13F, -17F, -12F, 9, 2, 7, 0F, -8F, 0F, 0F, -1F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[20].setRotationPoint(0F, -22.5F, 0F);
		
		turretModel[21].addShapeBox(4F, -17F, 5F, 9, 2, 7, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, -1F); // Box 15
		turretModel[21].setRotationPoint(0F, -22.5F, 0F);
		
		turretModel[22].addShapeBox(-5F, -17F, 11F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		turretModel[22].setRotationPoint(0F, -22.5F, 0F);
		
		turretModel[23].addShapeBox(-13F, -17F, -5F, 1, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[23].setRotationPoint(0F, -22.5F, 0F);
		
		turretModel[24].addShapeBox(-13F, -17F, 5F, 9, 2, 7, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, -1F, -8F, 0F, 0F); // Box 18
		turretModel[24].setRotationPoint(0F, -22.5F, 0F);
		
		turretModel[25].addShapeBox(-0.5F, -18F, 12F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		turretModel[25].setRotationPoint(0F, -21.5F, 0F);
		
		turretModel[26].addShapeBox(-0.5F, -17.5F, -13F, 1, 7, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		turretModel[26].setRotationPoint(0F, -22F, 0F);
		
		turretModel[27].addShapeBox(-4F, -11F, -13.22F, 8, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		turretModel[27].setRotationPoint(0F, -21.5F, 0F);
		
		turretModel[28].addShapeBox(-14F, -12F, -1F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[28].setRotationPoint(0F, -21F, 0F);
		
		turretModel[29].addShapeBox(-14F, -22F, -0.5F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		turretModel[29].setRotationPoint(0F, -22F, 0F);
		
		turretModel[30].addShapeBox(0F, -8F, 1F, 10, 5, 1, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[30].setRotationPoint(0F, -21F, 0F);
		
		turretModel[31].addShapeBox(0F, -3F, -2F, 10, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[31].setRotationPoint(0F, -21F, 0F);
		
		turretModel[32].addShapeBox(0F, -8F, -2F, 10, 5, 1, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[32].setRotationPoint(0F, -21F, 0F);
		
		turretModel[33].addShapeBox(3F, -9F, 2F, 4, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[33].setRotationPoint(0F, -21F, 0F);
		
		turretModel[34].addShapeBox(0F, -8F, 2F, 5, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[34].setRotationPoint(0F, -21F, 0F);
		
		turretModel[35].addShapeBox(3F, -9F, 1F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[35].setRotationPoint(0F, -21F, 0F);
		
		turretModel[36].addShapeBox(3F, -9F, -2F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[36].setRotationPoint(0F, -21F, 0F);
		
		turretModel[37].addShapeBox(3F, -11F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		turretModel[37].setRotationPoint(0F, -21F, 0F);
		
		turretModel[38].addShapeBox(6F, -4F, -3F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[38].setRotationPoint(0F, -21F, 0F);
		
		turretModel[39].addShapeBox(6F, -5F, -4F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		turretModel[39].setRotationPoint(0F, -21F, 0F);
		
		turretModel[40].addShapeBox(5F, -5F, -4F, 1, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 40
		turretModel[40].setRotationPoint(0F, -21F, 0F);
		
		turretModel[41].addShapeBox(7F, -5F, -4F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
		turretModel[41].setRotationPoint(0F, -21F, 0F);
		
		turretModel[42].addShapeBox(11F, -11F, -5F, 6, 7, 10, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[42].setRotationPoint(0F, -21F, 0F);
		
		turretModel[43].addShapeBox(-5F, -1.5F, 12F, 10, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[43].setRotationPoint(0F, -21F, 0F);
		turretModel[43].rotateAngleX = 0.48869219F;
		turretModel[43].rotateAngleZ = 0.03490659F;
		
		turretModel[44].addShapeBox(-13F, -20.5F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[44].setRotationPoint(0F, -21F, 0F);
		
		turretModel[45].addShapeBox(-5F, -9F, -6F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F); // Box 299
		turretModel[45].setRotationPoint(0F, -38F, -1.5F);
		turretModel[45].rotateAngleX = 0.29670597F;
		turretModel[45].rotateAngleY = -1.23918377F;
		
		turretModel[46].addShapeBox(-5F, -9.7F, -4F, 1, 1, 7, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F); // Box 299
		turretModel[46].setRotationPoint(0F, -38F, -1.5F);
		turretModel[46].rotateAngleX = 0.29670597F;
		turretModel[46].rotateAngleY = -1.23918377F;
		
		turretModel[47].addShapeBox(-5F, -9.7F, -9F, 1, 1, 5, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[47].setRotationPoint(0F, -38F, -1.5F);
		turretModel[47].rotateAngleX = 0.29670597F;
		turretModel[47].rotateAngleY = -1.23918377F;
		
		turretModel[48].addShapeBox(-5.5F, -10.2F, -18F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[48].setRotationPoint(0F, -38F, -1.5F);
		turretModel[48].rotateAngleX = 0.29670597F;
		turretModel[48].rotateAngleY = -1.23918377F;
		
		turretModel[49].addShapeBox(-9.5F, -9.7F, -15F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[49].setRotationPoint(0F, -38F, -1.5F);
		turretModel[49].rotateAngleX = 0.29670597F;
		turretModel[49].rotateAngleY = -1.23918377F;
		
		turretModel[50].addShapeBox(-5.5F, -10.2F, -22F, 2, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 299
		turretModel[50].setRotationPoint(0F, -38F, -1.5F);
		turretModel[50].rotateAngleX = 0.29670597F;
		turretModel[50].rotateAngleY = -1.23918377F;
		
		turretModel[51].addShapeBox(-6.5F, -10.7F, -24F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[51].setRotationPoint(0F, -38F, -1.5F);
		turretModel[51].rotateAngleX = 0.29670597F;
		turretModel[51].rotateAngleY = -1.23918377F;
		
		turretModel[52].addShapeBox(-3.5F, -10.7F, -24F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[52].setRotationPoint(0F, -38F, -1.5F);
		turretModel[52].rotateAngleX = 0.29670597F;
		turretModel[52].rotateAngleY = -1.23918377F;
		
		turretModel[53].addShapeBox(-3.5F, -10.2F, -23F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[53].setRotationPoint(0F, -38F, -1.5F);
		turretModel[53].rotateAngleX = 0.29670597F;
		turretModel[53].rotateAngleY = -1.23918377F;
		
		turretModel[54].addShapeBox(-5.5F, -10.2F, -23F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[54].setRotationPoint(0F, -38F, -1.5F);
		turretModel[54].rotateAngleX = 0.29670597F;
		turretModel[54].rotateAngleY = -1.23918377F;
		
		turretModel[55].addShapeBox(-3F, -1.5F, 12F, 2, 6, 6, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0F); // Box 0
		turretModel[55].setRotationPoint(0F, -21F, 0F);
		turretModel[55].rotateAngleX = 0.48869219F;
		turretModel[55].rotateAngleZ = 0.03490659F;
		
		turretModel[56].addShapeBox(1F, -1.5F, 12F, 2, 6, 6, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F); // Box 1
		turretModel[56].setRotationPoint(0F, -21F, 0F);
		turretModel[56].rotateAngleX = 0.48869219F;
		turretModel[56].rotateAngleZ = 0.03490659F;
		
		turretModel[57].addShapeBox(-1F, -1.5F, 12F, 2, 6, 6, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F); // Box 2
		turretModel[57].setRotationPoint(0F, -21F, 0F);
		turretModel[57].rotateAngleX = 0.48869219F;
		turretModel[57].rotateAngleZ = 0.03490659F;
		
		turretModel[58].addShapeBox(-5F, -1.5F, 12F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 3
		turretModel[58].setRotationPoint(0F, -21F, 0F);
		turretModel[58].rotateAngleX = 0.48869219F;
		turretModel[58].rotateAngleZ = 0.03490659F;
		
		turretModel[59].addShapeBox(4F, -1.5F, 12F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 4
		turretModel[59].setRotationPoint(0F, -21F, 0F);
		turretModel[59].rotateAngleX = 0.48869219F;
		turretModel[59].rotateAngleZ = 0.03490659F;
		
		turretModel[60].addShapeBox(4F, -2F, 12F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 5
		turretModel[60].setRotationPoint(0F, -21F, 0F);
		turretModel[60].rotateAngleX = 0.41887902F;
		turretModel[60].rotateAngleY = -3.14159265F;
		turretModel[60].rotateAngleZ = 0.08726646F;
		
		turretModel[61].addShapeBox(1F, -2F, 12F, 2, 6, 6, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F); // Box 6
		turretModel[61].setRotationPoint(0F, -21F, 0F);
		turretModel[61].rotateAngleX = 0.41887902F;
		turretModel[61].rotateAngleY = -3.14159265F;
		turretModel[61].rotateAngleZ = 0.08726646F;
		
		turretModel[62].addShapeBox(-1F, -2F, 12F, 2, 6, 6, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0.2F); // Box 7
		turretModel[62].setRotationPoint(0F, -21F, 0F);
		turretModel[62].rotateAngleX = 0.41887902F;
		turretModel[62].rotateAngleY = -3.14159265F;
		turretModel[62].rotateAngleZ = 0.08726646F;
		
		turretModel[63].addShapeBox(-3F, -2F, 12F, 2, 6, 6, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.2F, 0F, -0.01F, 0F); // Box 8
		turretModel[63].setRotationPoint(0F, -21F, 0F);
		turretModel[63].rotateAngleX = 0.41887902F;
		turretModel[63].rotateAngleY = -3.14159265F;
		turretModel[63].rotateAngleZ = 0.08726646F;
		
		turretModel[64].addShapeBox(-5F, -2F, 12F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 9
		turretModel[64].setRotationPoint(0F, -21F, 0F);
		turretModel[64].rotateAngleX = 0.41887902F;
		turretModel[64].rotateAngleY = -3.14159265F;
		turretModel[64].rotateAngleZ = 0.08726646F;
		
		turretModel[65].addShapeBox(-5F, -2F, 12F, 10, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		turretModel[65].setRotationPoint(0F, -21F, 0F);
		turretModel[65].rotateAngleX = 0.41887902F;
		turretModel[65].rotateAngleY = -3.14159265F;
		turretModel[65].rotateAngleZ = 0.08726646F;
		
		turretModel[66].addShapeBox(-2.5F, -1F, 15F, 41, 41, 1, 0F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, -34F, 0F, -34F, -34F, 0F, -34F, -34F, 0F, 0F, -34F, 0F); // Box 1
		turretModel[66].setRotationPoint(0F, -21F, 0F);
		turretModel[66].rotateAngleX = 0.66322512F;
		turretModel[66].rotateAngleY = -0.73303829F;
		turretModel[66].rotateAngleZ = 0.01745329F;
		
		
		barrelModel = new ModelRendererTurbo[9];
		barrelModel[0] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 25
		barrelModel[1] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 26
		barrelModel[2] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 28
		barrelModel[3] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Box 0
		barrelModel[4] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Box 0
		barrelModel[5] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 0
		barrelModel[6] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 1
		barrelModel[7] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 6
		barrelModel[8] = new ModelRendererTurbo(this, 155, 396, textureX, textureY); // Box 0
		
		barrelModel[0].addShapeBox(-14F, -2.5F, -1F, 12, 2, 2, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F); // Box 25
		barrelModel[0].setRotationPoint(17F, -28F, 0F);
		
		barrelModel[1].addShapeBox(10F, -2.5F, -1F, 25, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 26
		barrelModel[1].setRotationPoint(17F, -28F, 0F);
		
		barrelModel[2].addShapeBox(1F, -3F, -2F, 3, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		barrelModel[2].setRotationPoint(17F, -28F, 0F);
		
		barrelModel[3].addShapeBox(-3F, -3F, -6F, 4, 2, 12, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F); // Box 0
		barrelModel[3].setRotationPoint(17F, -28F, 0F);
		
		barrelModel[4].addShapeBox(-3F, -5F, -6F, 4, 2, 12, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 0
		barrelModel[4].setRotationPoint(17F, -28F, 0F);
		
		barrelModel[5].addShapeBox(-2F, -1F, -6F, 3, 5, 12, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, -2F, 0F, 1F); // Box 0
		barrelModel[5].setRotationPoint(17F, -28F, 0F);
		
		barrelModel[6].addShapeBox(-0.5F, -2.5F, 3.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		barrelModel[6].setRotationPoint(17F, -28F, 0F);
		
		barrelModel[7].addShapeBox(0.5F, -2.5F, -4.5F, 5, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 6
		barrelModel[7].setRotationPoint(17F, -28F, 0F);
		
		barrelModel[8].addShapeBox(0.5F, -2.5F, -4.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[8].setRotationPoint(17F, -28F, 0F);
		
		
		leftFrontWheelModel = new ModelRendererTurbo[2];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Shape 2
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Shape 15
		
		leftFrontWheelModel[0].addShape3D(11F, -10F, -6F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 2
		leftFrontWheelModel[0].setRotationPoint(30F, 1F, 18.5F);
		
		leftFrontWheelModel[1].addShape3D(11F, -10F, 0F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 15
		leftFrontWheelModel[1].setRotationPoint(30F, 1F, -18.5F);
		
		
		leftBackWheelModel = new ModelRendererTurbo[4];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Shape 0
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Shape 1
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Shape 2
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Shape 3
		
		leftBackWheelModel[0].addShape3D(11F, -10F, -6F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 7, 21, 21, 72, 7, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 0
		leftBackWheelModel[0].setRotationPoint(-13.5F, 1F, 18F);
		
		leftBackWheelModel[1].addShape3D(11F, -10F, -6F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 7, 21, 21, 72, 7, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 1
		leftBackWheelModel[1].setRotationPoint(-39F, 1F, 18F);
		
		leftBackWheelModel[2].addShape3D(11F, -10F, 0F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 7, 21, 21, 72, 7, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 2
		leftBackWheelModel[2].setRotationPoint(-39F, 1F, -17F);
		
		leftBackWheelModel[3].addShape3D(11F, -10F, 0F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 7, 21, 21, 72, 7, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 3
		leftBackWheelModel[3].setRotationPoint(-13.5F, 1F, -17F);
		
		
		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];
		
		gun_1_Model[0] = new ModelRendererTurbo[0];
		
		gun_1_Model[1] = new ModelRendererTurbo[8];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 52, 288, textureX, textureY); // Box 4
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 52, 296, textureX, textureY); // Box 7
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 52, 304, textureX, textureY); // Box 8
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 76, 288, textureX, textureY); // Box 9
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 76, 296, textureX, textureY); // Box 10
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 76, 304, textureX, textureY); // Box 11
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 68, 312, textureX, textureY); // Box 13
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 76, 312, textureX, textureY); // Box 14
		
		gun_1_Model[1][0].addShapeBox(-6F, -2.3F, -1F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 4
		
		gun_1_Model[1][1].addShapeBox(0.5F, -1.8F, -0.5F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		
		gun_1_Model[1][2].addShapeBox(1F, -1.8F, -0.5F, 10, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 8
		
		gun_1_Model[1][3].addShapeBox(-7.5F, -1.3F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		
		gun_1_Model[1][4].addShapeBox(-7.5F, -1.3F, -0.5F, 1, 3, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 10
		
		gun_1_Model[1][5].addShapeBox(-0.1F, -3F, -0.5F, 1, 1, 1, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 11
		
		gun_1_Model[1][6].addShapeBox(-5.5F, -2.5F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		
		gun_1_Model[1][7].addShapeBox(-5.5F, -3.25F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F); // Box 14
		
		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(44F, -20F, -10F);
		}
		
		
		gun_1_Model[2] = new ModelRendererTurbo[1];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 52, 312, textureX, textureY); // Box 299
		
		gun_1_Model[2][0].addShapeBox(-4.5F, -1.7F, 1F, 4, 2, 3, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F); // Box 299
		
		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(44F, -20F, -10F);
		}
		
		
		registerGunModel("PassengerGun1", gun_1_Model);
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
