//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.3
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.01.2016 - 21:25:43
// Last changed on: 21.01.2016 - 21:25:43

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelSdkFz222 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	public ModelSdkFz222() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[136];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 26
		bodyModel[5] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 67
		bodyModel[6] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 73
		bodyModel[7] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 74
		bodyModel[8] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 76
		bodyModel[9] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 77
		bodyModel[10] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 93
		bodyModel[11] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 95
		bodyModel[12] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 96
		bodyModel[13] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 97
		bodyModel[14] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 103
		bodyModel[15] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 104
		bodyModel[16] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 105
		bodyModel[17] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 106
		bodyModel[18] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 109
		bodyModel[19] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 110
		bodyModel[20] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 111
		bodyModel[21] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 112
		bodyModel[22] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 113
		bodyModel[23] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 114
		bodyModel[24] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 115
		bodyModel[25] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 116
		bodyModel[26] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 117
		bodyModel[27] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 118
		bodyModel[28] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 119
		bodyModel[29] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 120
		bodyModel[30] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 126
		bodyModel[31] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 127
		bodyModel[32] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 129
		bodyModel[34] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 1
		bodyModel[36] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 3
		bodyModel[38] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 1
		bodyModel[40] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 3
		bodyModel[42] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 5
		bodyModel[44] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		bodyModel[45] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 10
		bodyModel[46] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 11
		bodyModel[47] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 12
		bodyModel[48] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 13
		bodyModel[49] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 14
		bodyModel[50] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 15
		bodyModel[51] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Shape 16
		bodyModel[52] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 1
		bodyModel[54] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 2
		bodyModel[55] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 3
		bodyModel[56] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 5
		bodyModel[58] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 6
		bodyModel[59] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 13
		bodyModel[60] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 14
		bodyModel[61] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 15
		bodyModel[62] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 16
		bodyModel[63] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 17
		bodyModel[64] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 18
		bodyModel[65] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 20
		bodyModel[66] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 21
		bodyModel[67] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 22
		bodyModel[68] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 23
		bodyModel[69] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 24
		bodyModel[70] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 25
		bodyModel[71] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 26
		bodyModel[72] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 27
		bodyModel[73] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 28
		bodyModel[74] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 29
		bodyModel[75] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 30
		bodyModel[76] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 31
		bodyModel[77] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 32
		bodyModel[78] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 33
		bodyModel[79] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 34
		bodyModel[80] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 35
		bodyModel[81] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 36
		bodyModel[82] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 37
		bodyModel[83] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 38
		bodyModel[84] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 39
		bodyModel[85] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 40
		bodyModel[86] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 41
		bodyModel[87] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 42
		bodyModel[88] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 43
		bodyModel[89] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 44
		bodyModel[90] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 45
		bodyModel[91] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 46
		bodyModel[92] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 47
		bodyModel[93] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 48
		bodyModel[94] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 49
		bodyModel[95] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 50
		bodyModel[96] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 1
		bodyModel[98] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 2
		bodyModel[99] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 9
		bodyModel[100] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 10
		bodyModel[101] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 8
		bodyModel[102] = new ModelRendererTurbo(this, 52, 61, textureX, textureY); // Box 392
		bodyModel[103] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 393
		bodyModel[104] = new ModelRendererTurbo(this, 51, 81, textureX, textureY); // Box 394
		bodyModel[105] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 16
		bodyModel[106] = new ModelRendererTurbo(this, 52, 61, textureX, textureY); // Box 17
		bodyModel[107] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 18
		bodyModel[108] = new ModelRendererTurbo(this, 51, 81, textureX, textureY); // Box 19
		bodyModel[109] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 37
		bodyModel[110] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 38
		bodyModel[111] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 39
		bodyModel[112] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 40
		bodyModel[113] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 41
		bodyModel[114] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 42
		bodyModel[115] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 43
		bodyModel[116] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 44
		bodyModel[117] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 45
		bodyModel[118] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 46
		bodyModel[119] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 47
		bodyModel[120] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 48
		bodyModel[121] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 49
		bodyModel[122] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 50
		bodyModel[123] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 51
		bodyModel[124] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 52
		bodyModel[125] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 53
		bodyModel[126] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 55
		bodyModel[127] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 56
		bodyModel[128] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 57
		bodyModel[129] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 58
		bodyModel[130] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 59
		bodyModel[131] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 60
		bodyModel[132] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 0, 284, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 0, 284, textureX, textureY); // Box 366
		bodyModel[135] = new ModelRendererTurbo(this, 0, 284, textureX, textureY); // Box 367
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 7
		bodyModel[0].setRotationPoint(-8F, -13.5F, 9F);
		
		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 6, 16, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 2F); // Box 8
		bodyModel[1].setRotationPoint(21F, -11.5F, -8F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 11, 2, 26, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 1.8F, 2F, 2F, -5F, 2F, 2F, -5F, 0F, 0F, 1.8F); // Box 0
		bodyModel[2].setRotationPoint(8F, -15.5F, -13F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[3].setRotationPoint(-8F, -15.5F, -13F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F); // Box 26
		bodyModel[4].setRotationPoint(-8F, -15.5F, 8F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 8, 6, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -7F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 67
		bodyModel[5].setRotationPoint(8F, -13.5F, 9F);
		
		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 8, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[6].setRotationPoint(-8F, -13.5F, -15F);
		
		bodyModel[7].addShapeBox(0F, 0F, 0F, 13, 8, 6, 0F, 0F, 0F, -0.2F, 0F, -2F, -7F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[7].setRotationPoint(8F, -13.5F, -15F);
		
		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F, 0F, -2F, -7F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[8].setRotationPoint(-25F, -13.5F, -15F);
		
		bodyModel[9].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F); // Box 77
		bodyModel[9].setRotationPoint(-25F, -13.5F, 9F);
		
		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[10].setRotationPoint(21F, -7.5F, -14F);
		
		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 28, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 95
		bodyModel[11].setRotationPoint(17F, -7.5F, -14F);
		
		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 96
		bodyModel[12].setRotationPoint(16.5F, -3.5F, -14F);
		bodyModel[12].rotateAngleZ = -0.20943951F;
		
		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 97
		bodyModel[13].setRotationPoint(16.5F, -3.5F, 10F);
		bodyModel[13].rotateAngleZ = -0.27925268F;
		
		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[14].setRotationPoint(29F, -7.5F, -14F);
		
		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 28, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 104
		bodyModel[15].setRotationPoint(-29F, -7.5F, -14F);
		
		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 1, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[16].setRotationPoint(-26F, -7.5F, -14F);
		
		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 28, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[17].setRotationPoint(-16F, -7.5F, -14F);
		
		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F); // Box 109
		bodyModel[18].setRotationPoint(-29.5F, -3.5F, 8.5F);
		bodyModel[18].rotateAngleZ = -0.27925268F;
		
		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F); // Box 110
		bodyModel[19].setRotationPoint(-29.5F, -3.5F, -12.5F);
		bodyModel[19].rotateAngleZ = -0.20943951F;
		
		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 1.1F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, -3F, -6F, 2F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, -4F); // Box 111
		bodyModel[20].setRotationPoint(-33F, -11.5F, -8F);
		
		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 8, 16, 0F, 0F, 0F, 2F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 2F, 0F, -2F, 0F, 1F, -3F, -2F, 1F, -3F, -2F, 0F, -2F, 0F); // Box 112
		bodyModel[21].setRotationPoint(21F, -5.5F, -8F);
		
		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 8, 16, 0F, 2F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, -4F, 3.5F, -3F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 3.5F, -3F, -6F); // Box 113
		bodyModel[22].setRotationPoint(-33F, -5.5F, -8F);
		
		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -5.2F, 0F, -2F, 0F, 0F, -2F, 2F); // Box 114
		bodyModel[23].setRotationPoint(-25F, -5.5F, -15F);
		
		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 6, 6, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.2F, 0F, 0F, -5.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[24].setRotationPoint(-8F, -5.5F, -15F);
		
		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -2F, -7F, 0F, -2F, -5.2F); // Box 116
		bodyModel[25].setRotationPoint(8F, -5.5F, 9F);
		
		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, -2F, -5.2F, 0F, -2F, -7F); // Box 117
		bodyModel[26].setRotationPoint(-25F, -5.5F, 9F);
		
		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.2F, 0F, 0F, -5.2F); // Box 118
		bodyModel[27].setRotationPoint(-8F, -5.5F, 9F);
		
		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 8, 6, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5.2F, 0F, -2F, -7F, 0F, -2F, 2F, 0F, -2F, 0F); // Box 119
		bodyModel[28].setRotationPoint(8F, -5.5F, -15F);
		
		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[29].setRotationPoint(29F, -7.5F, 5F);
		
		bodyModel[30].addShapeBox(0F, 0F, 0F, 16, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[30].setRotationPoint(-8F, -6.5F, -9F);
		
		bodyModel[31].addShapeBox(0F, 0F, 0F, 13, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[31].setRotationPoint(8F, -6.5F, -9F);
		
		bodyModel[32].addShapeBox(0F, 0F, 0F, 17, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[32].setRotationPoint(-25F, -6.5F, -9F);
		
		bodyModel[33].addShapeBox(0F, -1.7F, -2.5F, 1, 4, 6, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 129
		bodyModel[33].setRotationPoint(19.2F, -13.2F, 2.5F);
		bodyModel[33].rotateAngleZ = 0.4712389F;
		
		bodyModel[34].addShapeBox(0F, -2F, -2.5F, 1, 4, 6, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 0
		bodyModel[34].setRotationPoint(19.2F, -13.2F, -4F);
		bodyModel[34].rotateAngleZ = 0.4712389F;
		
		bodyModel[35].addShapeBox(0F, -2F, -2.5F, 1, 4, 6, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 1
		bodyModel[35].setRotationPoint(16.2F, -13.2F, -8.5F);
		bodyModel[35].rotateAngleY = -1.01229097F;
		bodyModel[35].rotateAngleZ = 0.59341195F;
		
		bodyModel[36].addShapeBox(0F, -2F, -2.5F, 1, 4, 6, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 2
		bodyModel[36].setRotationPoint(17.2F, -13.2F, 8F);
		bodyModel[36].rotateAngleY = 1.01229097F;
		bodyModel[36].rotateAngleZ = 0.59341195F;
		
		bodyModel[37].addShapeBox(0F, -1.7F, -2.5F, 1, 1, 6, 0F, 0.2F, -0.3F, -0.25F, 0.2F, -0.3F, -0.25F, 0.2F, -0.3F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F); // Box 3
		bodyModel[37].setRotationPoint(19.2F, -13.2F, 2.5F);
		bodyModel[37].rotateAngleZ = 0.4712389F;
		
		bodyModel[38].addShapeBox(0F, -0.7F, -2.5F, 1, 1, 6, 0F, 0.1F, 1.9F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, 1.9F, -0.8F, 0.1F, -0.3F, -0.8F, 0.4F, -0.3F, -0.8F, 0.4F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F); // Box 0
		bodyModel[38].setRotationPoint(19.2F, -13.2F, 2.5F);
		bodyModel[38].rotateAngleZ = 0.50614548F;
		
		bodyModel[39].addShapeBox(0F, 0.3F, -2.5F, 1, 1, 6, 0F, 0.1F, -0.3F, -0.8F, 0.4F, -0.3F, -0.8F, 0.4F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, 1.9F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, 1.9F, -0.8F); // Box 1
		bodyModel[39].setRotationPoint(19.2F, -13.2F, 2.5F);
		bodyModel[39].rotateAngleZ = 0.45378561F;
		
		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[40].setRotationPoint(-4F, -10.5F, 13F);
		bodyModel[40].rotateAngleX = -0.34906585F;
		
		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F); // Box 3
		bodyModel[41].setRotationPoint(-4F, -10.5F, 13F);
		bodyModel[41].rotateAngleX = -0.41887902F;
		
		bodyModel[42].addShapeBox(0.5F, 5.5F, 0.2F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(-4F, -10.5F, 13F);
		bodyModel[42].rotateAngleX = -0.34906585F;
		
		bodyModel[43].addShapeBox(4.5F, 5.5F, 0.2F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[43].setRotationPoint(-4F, -10.5F, 13F);
		bodyModel[43].rotateAngleX = -0.34906585F;
		
		bodyModel[44].addShapeBox(6.5F, 3.5F, 0F, 1, 3, 1, 0F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 7
		bodyModel[44].setRotationPoint(-4F, -10.5F, 13F);
		
		bodyModel[45].addShapeBox(0F, 4F, 0F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[45].setRotationPoint(8F, -9.5F, 12.5F);
		bodyModel[45].rotateAngleX = -0.31415927F;
		bodyModel[45].rotateAngleY = -0.15707963F;
		bodyModel[45].rotateAngleZ = 0.03490659F;
		
		bodyModel[46].addShapeBox(0F, -1F, 0F, 8, 5, 1, 0F, 0F, 0F, 0F, -2F, -1F, 1.5F, -2F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[46].setRotationPoint(8F, -9.5F, 12.5F);
		bodyModel[46].rotateAngleX = -0.31415927F;
		bodyModel[46].rotateAngleY = -0.15707963F;
		bodyModel[46].rotateAngleZ = 0.03490659F;
		
		bodyModel[47].addShapeBox(0F, 4F, 0F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[47].setRotationPoint(8F, -9.5F, -13.5F);
		bodyModel[47].rotateAngleX = 0.31415927F;
		bodyModel[47].rotateAngleY = 0.15707963F;
		bodyModel[47].rotateAngleZ = 0.03490659F;
		
		bodyModel[48].addShapeBox(0F, -1F, 0F, 8, 5, 1, 0F, 0F, 0F, 0F, -2F, -1F, 0.2F, -2F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[48].setRotationPoint(8F, -9.5F, -13.5F);
		bodyModel[48].rotateAngleX = 0.31415927F;
		bodyModel[48].rotateAngleY = 0.15707963F;
		bodyModel[48].rotateAngleZ = 0.03490659F;
		
		bodyModel[49].addShapeBox(1F, 4F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 14
		bodyModel[49].setRotationPoint(8F, -9.5F, 13F);
		bodyModel[49].rotateAngleX = -0.31415927F;
		bodyModel[49].rotateAngleY = -0.15707963F;
		bodyModel[49].rotateAngleZ = 0.03490659F;
		
		bodyModel[50].addShapeBox(1F, 4F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 15
		bodyModel[50].setRotationPoint(8F, -9.5F, -14F);
		bodyModel[50].rotateAngleX = 0.31415927F;
		bodyModel[50].rotateAngleY = 0.15707963F;
		bodyModel[50].rotateAngleZ = 0.03490659F;
		
		bodyModel[51].addShape3D(6.5F, -6.5F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 4, 13, 13, 48, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 16
		bodyModel[51].setRotationPoint(3F, -7F, -14F);
		bodyModel[51].rotateAngleX = 0.33161256F;
		bodyModel[51].rotateAngleY = -0.06981317F;
		bodyModel[51].rotateAngleZ = 0.19198622F;
		
		bodyModel[52].addShapeBox(4.5F, 3.5F, 0F, 1, 3, 1, 0F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 0
		bodyModel[52].setRotationPoint(-4F, -10.5F, 13F);
		
		bodyModel[53].addShapeBox(0.5F, 3.5F, 0F, 1, 3, 1, 0F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1
		bodyModel[53].setRotationPoint(-4F, -10.5F, 13F);
		
		bodyModel[54].addShapeBox(2.5F, 3.5F, 0F, 1, 3, 1, 0F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2
		bodyModel[54].setRotationPoint(-4F, -10.5F, 13F);
		
		bodyModel[55].addShapeBox(4.5F, 5.5F, 0.2F, 3, 1, 3, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 3
		bodyModel[55].setRotationPoint(-4F, -10.5F, 13F);
		bodyModel[55].rotateAngleX = -0.34906585F;
		
		bodyModel[56].addShapeBox(0.5F, 5.5F, 0.2F, 3, 1, 3, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 4
		bodyModel[56].setRotationPoint(-4F, -10.5F, 13F);
		bodyModel[56].rotateAngleX = -0.34906585F;
		
		bodyModel[57].addShapeBox(1.5F, 5.8F, 2.7F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 5
		bodyModel[57].setRotationPoint(-4F, -10.5F, 13F);
		bodyModel[57].rotateAngleX = -0.34906585F;
		
		bodyModel[58].addShapeBox(5.5F, 5.8F, 2.7F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 6
		bodyModel[58].setRotationPoint(-4F, -10.5F, 13F);
		bodyModel[58].rotateAngleX = -0.34906585F;
		
		bodyModel[59].addShapeBox(0F, -1F, 0F, 8, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[59].setRotationPoint(-13F, -10.5F, 12F);
		bodyModel[59].rotateAngleX = -0.34906585F;
		
		bodyModel[60].addShapeBox(0F, 4F, 0F, 8, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 14
		bodyModel[60].setRotationPoint(-13F, -10.5F, 12F);
		bodyModel[60].rotateAngleX = -0.34906585F;
		
		bodyModel[61].addShapeBox(0F, -1F, 0F, 8, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[61].setRotationPoint(-13F, -9.5F, -15F);
		bodyModel[61].rotateAngleX = 0.34906585F;
		
		bodyModel[62].addShapeBox(0F, 4F, 0F, 8, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 16
		bodyModel[62].setRotationPoint(-13F, -9.5F, -15F);
		bodyModel[62].rotateAngleX = 0.34906585F;
		
		bodyModel[63].addShapeBox(0F, -1.2F, 0F, 8, 1, 3, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 17
		bodyModel[63].setRotationPoint(-13F, -10.5F, 12F);
		bodyModel[63].rotateAngleX = -0.34906585F;
		
		bodyModel[64].addShapeBox(0F, -1.2F, 0F, 8, 1, 3, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 18
		bodyModel[64].setRotationPoint(-13F, -9.5F, -15F);
		bodyModel[64].rotateAngleX = 0.34906585F;
		
		bodyModel[65].addShapeBox(0.2F, 0F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 20
		bodyModel[65].setRotationPoint(-13F, -10.5F, 12F);
		bodyModel[65].rotateAngleX = -0.34906585F;
		
		bodyModel[66].addShapeBox(0.2F, 0F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 21
		bodyModel[66].setRotationPoint(-13F, -9.5F, -15F);
		bodyModel[66].rotateAngleX = 0.34906585F;
		
		bodyModel[67].addShapeBox(0.2F, 3F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 22
		bodyModel[67].setRotationPoint(-13F, -9.5F, -15F);
		bodyModel[67].rotateAngleX = 0.34906585F;
		
		bodyModel[68].addShapeBox(0.2F, 3F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 23
		bodyModel[68].setRotationPoint(-13F, -10.5F, 12F);
		bodyModel[68].rotateAngleX = -0.34906585F;
		
		bodyModel[69].addShapeBox(6.8F, 3F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 24
		bodyModel[69].setRotationPoint(-13F, -9.5F, -15F);
		bodyModel[69].rotateAngleX = 0.34906585F;
		
		bodyModel[70].addShapeBox(6.8F, 3F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 25
		bodyModel[70].setRotationPoint(-13F, -10.5F, 12F);
		bodyModel[70].rotateAngleX = -0.34906585F;
		
		bodyModel[71].addShapeBox(6.8F, 0F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 26
		bodyModel[71].setRotationPoint(-13F, -9.5F, -15F);
		bodyModel[71].rotateAngleX = 0.34906585F;
		
		bodyModel[72].addShapeBox(6.8F, 0F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 27
		bodyModel[72].setRotationPoint(-13F, -10.5F, 12F);
		bodyModel[72].rotateAngleX = -0.34906585F;
		
		bodyModel[73].addShapeBox(6.8F, 7.8F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 28
		bodyModel[73].setRotationPoint(-13F, -9.5F, -15F);
		bodyModel[73].rotateAngleX = 0.34906585F;
		
		bodyModel[74].addShapeBox(6.8F, 7.8F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 29
		bodyModel[74].setRotationPoint(-13F, -10.5F, 12F);
		bodyModel[74].rotateAngleX = -0.34906585F;
		
		bodyModel[75].addShapeBox(2.8F, 7.8F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 30
		bodyModel[75].setRotationPoint(-13F, -9.5F, -15F);
		bodyModel[75].rotateAngleX = 0.34906585F;
		
		bodyModel[76].addShapeBox(2.8F, 7.8F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 31
		bodyModel[76].setRotationPoint(-13F, -10.5F, 12F);
		bodyModel[76].rotateAngleX = -0.34906585F;
		
		bodyModel[77].addShapeBox(0F, -2F, -2.5F, 1, 3, 6, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0F, -1.4F, -0.7F); // Box 32
		bodyModel[77].setRotationPoint(17.2F, -13.2F, 8F);
		bodyModel[77].rotateAngleY = 1.01229097F;
		bodyModel[77].rotateAngleZ = 0.59341195F;
		
		bodyModel[78].addShapeBox(0F, -1F, -2.5F, 1, 3, 6, 0F, 0F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0F, -1.4F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 33
		bodyModel[78].setRotationPoint(17.2F, -13.2F, 8F);
		bodyModel[78].rotateAngleY = 1.01229097F;
		bodyModel[78].rotateAngleZ = 0.59341195F;
		
		bodyModel[79].addShapeBox(0F, -2F, -2.5F, 1, 3, 6, 0F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0F, -1.4F, -0.7F); // Box 34
		bodyModel[79].setRotationPoint(16.2F, -13.2F, -8.5F);
		bodyModel[79].rotateAngleY = -1.01229097F;
		bodyModel[79].rotateAngleZ = 0.59341195F;
		
		bodyModel[80].addShapeBox(0F, -2F, -2.5F, 1, 2, 6, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 35
		bodyModel[80].setRotationPoint(19.2F, -13.2F, -4F);
		bodyModel[80].rotateAngleZ = 0.4712389F;
		
		bodyModel[81].addShapeBox(0F, -1F, -2.5F, 1, 3, 6, 0F, 0F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0F, -1.4F, -0.7F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F); // Box 36
		bodyModel[81].setRotationPoint(16.2F, -13.2F, -8.5F);
		bodyModel[81].rotateAngleY = -1.01229097F;
		bodyModel[81].rotateAngleZ = 0.59341195F;
		
		bodyModel[82].addShapeBox(0F, -2F, -2.5F, 1, 3, 6, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0F, -1.4F, -0.7F); // Box 37
		bodyModel[82].setRotationPoint(19.2F, -13.2F, -4F);
		bodyModel[82].rotateAngleZ = 0.4712389F;
		
		bodyModel[83].addShapeBox(0F, -1F, -2.5F, 1, 3, 6, 0F, 0F, -1.4F, -0.8F, 0.2F, -1.4F, -0.8F, 0.2F, -1.4F, -0.8F, 0F, -1.4F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, -0.7F, -0.8F); // Box 38
		bodyModel[83].setRotationPoint(19.2F, -13.2F, -4F);
		bodyModel[83].rotateAngleZ = 0.4712389F;
		
		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.2F, -0.2F, 0.2F, -3.8F, -0.2F, 0.2F, -3.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0.2F, 4F, -0.2F, 0.2F, 4F, -0.2F, 0F, 0F, -0.2F); // Box 39
		bodyModel[84].setRotationPoint(29F, -7.5F, 13F);
		
		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.2F, -3.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0.2F, -3.8F, -0.2F, 0.2F, 4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 4F, -0.2F); // Box 40
		bodyModel[85].setRotationPoint(17F, -7.5F, 13F);
		
		bodyModel[86].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 41
		bodyModel[86].setRotationPoint(21F, -7.5F, 13F);
		
		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.2F, -0.2F, 0.2F, -3.8F, -0.2F, 0.2F, -3.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0.2F, 4F, -0.2F, 0.2F, 4F, -0.2F, 0F, 0F, -0.2F); // Box 42
		bodyModel[87].setRotationPoint(29F, -7.5F, -14F);
		
		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.2F, -3.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0.2F, -3.8F, -0.2F, 0.2F, 4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 4F, -0.2F); // Box 43
		bodyModel[88].setRotationPoint(17F, -7.5F, -14F);
		
		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 44
		bodyModel[89].setRotationPoint(21F, -7.5F, -14F);
		
		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, -3.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0.2F, -3.8F, -0.2F, 0.2F, 4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 4F, -0.2F); // Box 45
		bodyModel[90].setRotationPoint(-29F, -7.5F, 13F);
		
		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.2F, -0.2F, 0.2F, -3.8F, -0.2F, 0.2F, -3.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0.2F, 4F, -0.2F, 0.2F, 4F, -0.2F, 0F, 0F, -0.2F); // Box 46
		bodyModel[91].setRotationPoint(-16F, -7.5F, 13F);
		
		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 47
		bodyModel[92].setRotationPoint(-26F, -7.5F, 13F);
		
		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, -3.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0.2F, -3.8F, -0.2F, 0.2F, 4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 4F, -0.2F); // Box 48
		bodyModel[93].setRotationPoint(-29F, -7.5F, -14F);
		
		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 49
		bodyModel[94].setRotationPoint(-26F, -7.5F, -14F);
		
		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.2F, -0.2F, 0.2F, -3.8F, -0.2F, 0.2F, -3.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0.2F, 4F, -0.2F, 0.2F, 4F, -0.2F, 0F, 0F, -0.2F); // Box 50
		bodyModel[95].setRotationPoint(-16F, -7.5F, -14F);
		
		bodyModel[96].addShapeBox(0F, -2.5F, 0F, 1, 1, 3, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 0
		bodyModel[96].setRotationPoint(19.2F, -13.2F, -6F);
		bodyModel[96].rotateAngleZ = 0.4712389F;
		
		bodyModel[97].addShapeBox(0F, -2.5F, 0F, 1, 1, 3, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 1
		bodyModel[97].setRotationPoint(19.2F, -13.2F, 3F);
		bodyModel[97].rotateAngleZ = 0.4712389F;
		
		bodyModel[98].addShapeBox(0F, -2.5F, 0F, 1, 1, 6, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 2
		bodyModel[98].setRotationPoint(19.2F, -13.2F, -3F);
		bodyModel[98].rotateAngleZ = 0.4712389F;
		
		bodyModel[99].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 9
		bodyModel[99].setRotationPoint(24F, 0F, -11F);
		
		bodyModel[100].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 10
		bodyModel[100].setRotationPoint(-22F, 0F, -11F);
		
		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[101].setRotationPoint(31.5F, -5.5F, 7F);
		
		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 392
		bodyModel[102].setRotationPoint(31F, -7.5F, 5.5F);
		
		bodyModel[103].addShapeBox(0F, -1F, 0F, 2, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 393
		bodyModel[103].setRotationPoint(31F, -7.5F, 5.5F);
		
		bodyModel[104].addShapeBox(0F, 2F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 394
		bodyModel[104].setRotationPoint(31F, -7.5F, 5.5F);
		
		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[105].setRotationPoint(31.5F, -5.5F, -8F);
		
		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 17
		bodyModel[106].setRotationPoint(31F, -7.5F, -9.5F);
		
		bodyModel[107].addShapeBox(0F, -1F, 0F, 2, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 18
		bodyModel[107].setRotationPoint(31F, -7.5F, -9.5F);
		
		bodyModel[108].addShapeBox(0F, 2F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 19
		bodyModel[108].setRotationPoint(31F, -7.5F, -9.5F);
		
		bodyModel[109].addShapeBox(-13.4F, 4F, 0.2F, 1, 1, 2, 0F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F); // Box 37
		bodyModel[109].setRotationPoint(-25F, -3.5F, -6F);
		bodyModel[109].rotateAngleX = 0.26179939F;
		bodyModel[109].rotateAngleY = -0.90757121F;
		bodyModel[109].rotateAngleZ = -0.50614548F;
		
		bodyModel[110].addShapeBox(-13.4F, 1F, 2.2F, 1, 1, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 38
		bodyModel[110].setRotationPoint(-25F, -3.5F, -6F);
		bodyModel[110].rotateAngleX = 0.26179939F;
		bodyModel[110].rotateAngleY = -0.90757121F;
		bodyModel[110].rotateAngleZ = -0.50614548F;
		
		bodyModel[111].addShapeBox(-13.4F, 1F, 2.2F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 39
		bodyModel[111].setRotationPoint(-25F, -3.5F, -6F);
		bodyModel[111].rotateAngleX = 0.26179939F;
		bodyModel[111].rotateAngleY = -0.90757121F;
		bodyModel[111].rotateAngleZ = -0.50614548F;
		
		bodyModel[112].addShapeBox(-13.4F, 1F, -0.8F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[112].setRotationPoint(-25F, -3.5F, -6F);
		bodyModel[112].rotateAngleX = 0.26179939F;
		bodyModel[112].rotateAngleY = -0.90757121F;
		bodyModel[112].rotateAngleZ = -0.50614548F;
		
		bodyModel[113].addShapeBox(-13.4F, 1F, -0.8F, 1, 1, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 41
		bodyModel[113].setRotationPoint(-25F, -3.5F, -6F);
		bodyModel[113].rotateAngleX = 0.26179939F;
		bodyModel[113].rotateAngleY = -0.90757121F;
		bodyModel[113].rotateAngleZ = -0.50614548F;
		
		bodyModel[114].addShapeBox(-13.4F, 1F, -0.8F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 42
		bodyModel[114].setRotationPoint(-25F, -3.5F, -6F);
		bodyModel[114].rotateAngleX = 0.26179939F;
		bodyModel[114].rotateAngleY = -0.90757121F;
		bodyModel[114].rotateAngleZ = -0.50614548F;
		
		bodyModel[115].addShapeBox(-13.6F, 3.8F, 0.2F, 1, 1, 2, 0F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F); // Box 43
		bodyModel[115].setRotationPoint(-23F, -3.5F, 5F);
		bodyModel[115].rotateAngleX = -0.2268928F;
		bodyModel[115].rotateAngleY = 0.9250245F;
		bodyModel[115].rotateAngleZ = -0.52359878F;
		
		bodyModel[116].addShapeBox(-13.6F, 0.8F, 2.2F, 1, 1, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 44
		bodyModel[116].setRotationPoint(-23F, -3.5F, 5F);
		bodyModel[116].rotateAngleX = -0.2268928F;
		bodyModel[116].rotateAngleY = 0.9250245F;
		bodyModel[116].rotateAngleZ = -0.52359878F;
		
		bodyModel[117].addShapeBox(-13.6F, 0.8F, 2.2F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 45
		bodyModel[117].setRotationPoint(-23F, -3.5F, 5F);
		bodyModel[117].rotateAngleX = -0.2268928F;
		bodyModel[117].rotateAngleY = 0.9250245F;
		bodyModel[117].rotateAngleZ = -0.52359878F;
		
		bodyModel[118].addShapeBox(-13.6F, 0.8F, -0.8F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[118].setRotationPoint(-23F, -3.5F, 5F);
		bodyModel[118].rotateAngleX = -0.2268928F;
		bodyModel[118].rotateAngleY = 0.9250245F;
		bodyModel[118].rotateAngleZ = -0.52359878F;
		
		bodyModel[119].addShapeBox(-13.6F, 0.8F, -0.8F, 1, 1, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 47
		bodyModel[119].setRotationPoint(-23F, -3.5F, 5F);
		bodyModel[119].rotateAngleX = -0.2268928F;
		bodyModel[119].rotateAngleY = 0.9250245F;
		bodyModel[119].rotateAngleZ = -0.52359878F;
		
		bodyModel[120].addShapeBox(-13.6F, 0.8F, -0.8F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 48
		bodyModel[120].setRotationPoint(-23F, -3.5F, 5F);
		bodyModel[120].rotateAngleX = -0.2268928F;
		bodyModel[120].rotateAngleY = 0.9250245F;
		bodyModel[120].rotateAngleZ = -0.52359878F;
		
		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 6, 14, 0F, -1.9F, -1.8F, -5F, -1F, -0.2F, -2F, -1F, -0.2F, -2F, -1.9F, -1.8F, -5F, 1F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, -4F); // Box 49
		bodyModel[121].setRotationPoint(-33F, -11.5F, -7F);
		
		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 4, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -1F, 0F); // Box 50
		bodyModel[122].setRotationPoint(33F, -3.5F, -13F);
		
		bodyModel[123].addShapeBox(0F, 0F, 0F, 18, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[123].setRotationPoint(-9F, -10.5F, -9F);
		
		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 18, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 52
		bodyModel[124].setRotationPoint(-9F, -14.5F, -9F);
		
		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 18, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 53
		bodyModel[125].setRotationPoint(8F, -14.5F, -9F);
		
		bodyModel[126].addShapeBox(-1F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		bodyModel[126].setRotationPoint(-34.5F, -4F, -5.5F);
		bodyModel[126].rotateAngleZ = 1.04719755F;
		
		bodyModel[127].addShapeBox(-1F, 2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[127].setRotationPoint(-34.5F, -4F, -6.5F);
		bodyModel[127].rotateAngleZ = 1.04719755F;
		
		bodyModel[128].addShapeBox(-1F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
		bodyModel[128].setRotationPoint(-34.5F, -4F, 4.5F);
		bodyModel[128].rotateAngleZ = 1.04719755F;
		
		bodyModel[129].addShapeBox(-1F, 2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[129].setRotationPoint(-34.5F, -4F, 5.5F);
		bodyModel[129].rotateAngleZ = 1.04719755F;
		
		bodyModel[130].addShapeBox(-1F, 4F, 0F, 1, 4, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 59
		bodyModel[130].setRotationPoint(-34.5F, -4F, -6.5F);
		bodyModel[130].rotateAngleZ = 1.04719755F;
		
		bodyModel[131].addShapeBox(-1F, 4F, 0F, 1, 4, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 60
		bodyModel[131].setRotationPoint(-34.5F, -4F, 5.5F);
		bodyModel[131].rotateAngleZ = 1.04719755F;
		
		bodyModel[132].addShapeBox(0F, 0F, 0F, 15, 2, 26, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 2F, 2F, -5F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 2F, 2F, -5F); // Box 0
		bodyModel[132].setRotationPoint(-23F, -15.5F, -13F);
		
		bodyModel[133].addShapeBox(0F, 0F, 0F, 35, 1, 35, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, -28F, 0F, 0F, -28F); // Box 0
		bodyModel[133].setRotationPoint(22F, -11.5F, -3.25F);
		bodyModel[133].rotateAngleZ = -0.29670597F;
		
		bodyModel[134].addShapeBox(-0.25F, 0F, 0F, 35, 1, 35, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, -32F, 0F, 0F, -32F); // Box 366
		bodyModel[134].setRotationPoint(-7F, -15.5F, -13.25F);
		bodyModel[134].rotateAngleY = -1.57079633F;
		bodyModel[134].rotateAngleZ = -0.83775804F;
		
		bodyModel[135].addShapeBox(1F, 0F, 0F, 35, 1, 35, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -30F, 0F, 0F, -30F); // Box 367
		bodyModel[135].setRotationPoint(-34.15F, -8.5F, 2.5F);
		bodyModel[135].rotateAngleY = 3.14159265F;
		bodyModel[135].rotateAngleZ = -1.25663706F;
		
		
		turretModel = new ModelRendererTurbo[59];
		turretModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		turretModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		turretModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		turretModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 4
		turretModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 5
		turretModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 6
		turretModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 7
		turretModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 8
		turretModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 9
		turretModel[9] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 10
		turretModel[10] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 11
		turretModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 12
		turretModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 13
		turretModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 14
		turretModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 15
		turretModel[15] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 16
		turretModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 17
		turretModel[17] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 18
		turretModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 19
		turretModel[19] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 20
		turretModel[20] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 30
		turretModel[21] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 33
		turretModel[22] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		turretModel[23] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 35
		turretModel[24] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 36
		turretModel[25] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 37
		turretModel[26] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 42
		turretModel[27] = new ModelRendererTurbo(this, 161, 135, textureX, textureY); // Box 43
		turretModel[28] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 46
		turretModel[29] = new ModelRendererTurbo(this, 161, 135, textureX, textureY); // Box 47
		turretModel[30] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 48
		turretModel[31] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 50
		turretModel[32] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 7
		turretModel[33] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 8
		turretModel[34] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 9
		turretModel[35] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 10
		turretModel[36] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 11
		turretModel[37] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 12
		turretModel[38] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 3
		turretModel[39] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 4
		turretModel[40] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 5
		turretModel[41] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 6
		turretModel[42] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 7
		turretModel[43] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 8
		turretModel[44] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 35
		turretModel[45] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 36
		turretModel[46] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 54
		turretModel[47] = new ModelRendererTurbo(this, 161, 135, textureX, textureY); // Box 0
		turretModel[48] = new ModelRendererTurbo(this, 161, 135, textureX, textureY); // Box 1
		turretModel[49] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 2
		turretModel[50] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 3
		turretModel[51] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 448
		turretModel[52] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 449
		turretModel[53] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 450
		turretModel[54] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 451
		turretModel[55] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 452
		turretModel[56] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 453
		turretModel[57] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 454
		turretModel[58] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 455
		
		turretModel[0].addShapeBox(11F, 0F, -12F, 1, 1, 6, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[0].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[1].addShapeBox(-6F, 0F, 11F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		turretModel[1].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[2].addShapeBox(-6F, 0F, -12F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[2].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[3].addShapeBox(11F, 0F, 6F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 4
		turretModel[3].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[4].addShapeBox(13F, 0F, -6F, 1, 1, 6, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		turretModel[4].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[5].addShapeBox(13F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 6
		turretModel[5].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[6].addShapeBox(-6F, 0F, 8F, 1, 1, 4, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		turretModel[6].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[7].addShapeBox(-12F, 0F, 0F, 1, 1, 8, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		turretModel[7].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[8].addShapeBox(-12F, 0F, -8F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 9
		turretModel[8].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[9].addShapeBox(-6F, 0F, -12F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 10
		turretModel[9].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[10].addShapeBox(13F, -6F, 1F, 1, 4, 4, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 11
		turretModel[10].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[11].addShapeBox(11F, -6F, 6F, 1, 4, 6, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, -2F, 8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 8F, 0F, 0F); // Box 12
		turretModel[11].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[12].addShapeBox(-6F, -6F, 11F, 12, 4, 1, 0F, 0F, 0F, 2F, -1.5F, 0F, 2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[12].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[13].addShapeBox(-6F, -6F, 8F, 1, 4, 4, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -2F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[13].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[14].addShapeBox(-12F, -6F, 0F, 1, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[14].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[15].addShapeBox(13F, -6F, -5F, 1, 4, 4, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		turretModel[15].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[16].addShapeBox(11F, -6F, -12F, 1, 4, 6, 0F, 8F, 0F, -2F, -8F, 0F, -2F, -2F, 0F, 0F, 2F, 0F, 0F, 8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[16].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[17].addShapeBox(-6F, -6F, -12F, 12, 4, 1, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -1.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 18
		turretModel[17].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[18].addShapeBox(-6F, -6F, -12F, 1, 4, 4, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 19
		turretModel[18].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[19].addShapeBox(-12F, -6F, -8F, 1, 4, 8, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 20
		turretModel[19].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[20].addShapeBox(-2F, -2F, 1F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[20].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[21].addShapeBox(-1F, 2F, 1F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[21].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[22].addShapeBox(2F, -2F, 1F, 1, 4, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[22].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[23].addShapeBox(-1F, 2F, -2F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[23].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[24].addShapeBox(-2F, -2F, -2F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[24].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[25].addShapeBox(2F, -2F, -2F, 1, 4, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		turretModel[25].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[26].addShapeBox(-6F, -11.5F, -8F, 10, 3, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 42
		turretModel[26].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[26].rotateAngleX = -1.72787596F;
		
		turretModel[27].addShapeBox(-6F, -11.7F, -15.6F, 17, 1, 14, 0F, 0F, -0.2F, -0.1F, -7F, -0.2F, -0.1F, -7F, -0.2F, -6.2F, 0F, -0.2F, -6.2F, 0F, -0.2F, -0.2F, -7F, -0.2F, -0.1F, -7F, -0.2F, -6.2F, 0F, -0.2F, -6.2F); // Box 43
		turretModel[27].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[27].rotateAngleX = -1.72787596F;
		
		turretModel[28].addShapeBox(-6F, -11F, 7.5F, 10, 3, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 46
		turretModel[28].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[28].rotateAngleX = 1.79768913F;
		
		turretModel[29].addShapeBox(-6F, -11.2F, 8.1F, 17, 1, 14, 0F, 0F, -0.2F, -0.2F, -7F, -0.2F, -0.2F, -7F, -0.2F, -6.2F, 0F, -0.2F, -6.2F, 0F, -0.2F, -0.2F, -7F, -0.2F, -0.2F, -7F, -0.2F, -6.2F, 0F, -0.2F, -6.2F); // Box 47
		turretModel[29].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[29].rotateAngleX = 1.79768913F;
		
		turretModel[30].addShapeBox(4F, -11.5F, -8F, 6, 3, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, 7.5F, 1F, 0F, -8.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 7.5F, 1F, 0F, -8.5F, 0F, 0F, -0.2F); // Box 48
		turretModel[30].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[30].rotateAngleX = -1.72787596F;
		
		turretModel[31].addShapeBox(4F, -11F, 7.5F, 6, 3, 1, 0F, 0F, 0F, -0.2F, 1F, 0F, -8.5F, 0F, 0F, 7.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -8.5F, 0F, 0F, 7.5F, 0F, 0F, -0.2F); // Box 50
		turretModel[31].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[31].rotateAngleX = 1.79768913F;
		
		turretModel[32].addShapeBox(-13.3F, 0F, -1F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		turretModel[32].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[32].rotateAngleY = -0.2443461F;
		turretModel[32].rotateAngleZ = -0.43633231F;
		
		turretModel[33].addShapeBox(-13.3F, 0F, -1F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 8
		turretModel[33].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[33].rotateAngleY = -0.2443461F;
		turretModel[33].rotateAngleZ = -0.43633231F;
		
		turretModel[34].addShapeBox(-13.3F, 0F, 2F, 1, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 9
		turretModel[34].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[34].rotateAngleY = -0.2443461F;
		turretModel[34].rotateAngleZ = -0.43633231F;
		
		turretModel[35].addShapeBox(-13.3F, 0F, 2F, 1, 1, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 10
		turretModel[35].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[35].rotateAngleY = -0.2443461F;
		turretModel[35].rotateAngleZ = -0.43633231F;
		
		turretModel[36].addShapeBox(-13.3F, 0F, -1F, 1, 1, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 11
		turretModel[36].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[36].rotateAngleY = -0.2443461F;
		turretModel[36].rotateAngleZ = -0.43633231F;
		
		turretModel[37].addShapeBox(-13.3F, 3F, 0F, 1, 1, 2, 0F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F, 0.25F, -0.25F, -0.3F); // Box 12
		turretModel[37].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[37].rotateAngleY = -0.2443461F;
		turretModel[37].rotateAngleZ = -0.43633231F;
		
		turretModel[38].addShapeBox(11.5F, -1F, -4.5F, 1, 3, 6, 0F, 0F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0F, -1.4F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F); // Box 3
		turretModel[38].setRotationPoint(0F, -13.2F, 0F);
		turretModel[38].rotateAngleY = -1.57079633F;
		turretModel[38].rotateAngleZ = 0.38397244F;
		
		turretModel[39].addShapeBox(11.5F, -2F, -4.5F, 1, 4, 6, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 4
		turretModel[39].setRotationPoint(0F, -13.2F, 0F);
		turretModel[39].rotateAngleY = -1.57079633F;
		turretModel[39].rotateAngleZ = 0.38397244F;
		
		turretModel[40].addShapeBox(11.55F, -2F, -4.5F, 1, 3, 6, 0F, 0F, 0.2F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0.2F, -0.7F, 0F, -2.4F, -0.7F, 0.2F, -1.8F, -0.7F, 0.2F, -1.8F, -0.7F, 0F, -2.4F, -0.7F); // Box 5
		turretModel[40].setRotationPoint(0F, -13.2F, 0F);
		turretModel[40].rotateAngleY = -1.57079633F;
		turretModel[40].rotateAngleZ = 0.38397244F;
		
		turretModel[41].addShapeBox(11.5F, -1F, -1.5F, 1, 3, 6, 0F, 0F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0.2F, -1.4F, -0.7F, 0F, -1.4F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F); // Box 6
		turretModel[41].setRotationPoint(0F, -13.2F, 0F);
		turretModel[41].rotateAngleY = 1.57079633F;
		turretModel[41].rotateAngleZ = 0.38397244F;
		
		turretModel[42].addShapeBox(11.5F, -2F, -1.5F, 1, 4, 6, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 7
		turretModel[42].setRotationPoint(0F, -13.2F, 0F);
		turretModel[42].rotateAngleY = 1.57079633F;
		turretModel[42].rotateAngleZ = 0.38397244F;
		
		turretModel[43].addShapeBox(11.55F, -2F, -1.5F, 1, 3, 6, 0F, 0F, 0.2F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0.2F, -0.7F, 0F, -2.4F, -0.7F, 0.2F, -1.8F, -0.7F, 0.2F, -1.8F, -0.7F, 0F, -2.4F, -0.7F); // Box 8
		turretModel[43].setRotationPoint(0F, -13.2F, 0F);
		turretModel[43].rotateAngleY = 1.57079633F;
		turretModel[43].rotateAngleZ = 0.38397244F;
		
		turretModel[44].addShapeBox(-12.2F, -7F, -0.5F, 1, 2, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 4.1F, 0.1F, 0.1F, 4.1F, 0.1F, 0.1F, 4.1F, 0.1F, 0.1F, 4.1F, 0.1F); // Box 35
		turretModel[44].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[45].addShapeBox(-12.2F, -8F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[45].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[46].addShapeBox(-3F, 2F, -3.5F, 7, 1, 7, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		turretModel[46].setRotationPoint(-1F, -13.5F, 0F);
		
		turretModel[47].addShapeBox(4F, -11.2F, 8.1F, 17, 1, 14, 0F, 0F, -0.2F, -0.2F, -17F, -0.2F, -0.2F, -11F, -0.2F, -6.2F, 0F, -0.2F, -6.2F, 0F, -0.2F, -0.2F, -17F, -0.2F, -0.2F, -11F, -0.2F, -6.2F, 0F, -0.2F, -6.2F); // Box 0
		turretModel[47].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[47].rotateAngleX = 1.79768913F;
		
		turretModel[48].addShapeBox(4F, -11.7F, -15.6F, 17, 1, 14, 0F, 0F, -0.2F, -0.1F, -11F, -0.2F, -0.1F, -17F, -0.2F, -6.2F, 0F, -0.2F, -6.2F, 0F, -0.2F, -0.2F, -11F, -0.2F, -0.1F, -17F, -0.2F, -6.2F, 0F, -0.2F, -6.2F); // Box 1
		turretModel[48].setRotationPoint(-1F, -14.5F, 0F);
		turretModel[48].rotateAngleX = -1.72787596F;
		
		turretModel[49].addShapeBox(-9F, 0F, -4F, 1, 1, 8, 0F, 3F, -0.7F, 4F, 2F, -0.7F, 8F, 2F, -0.7F, 8F, 3F, -0.7F, 4F, 3F, 0F, 4F, 2F, 0F, 8F, 2F, 0F, 8F, 3F, 0F, 4F); // Box 2
		turretModel[49].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[50].addShapeBox(-13F, 0F, -4F, 1, 1, 8, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 3
		turretModel[50].setRotationPoint(-1F, -16.5F, 0F);
		
		turretModel[51].addShapeBox(1.5F, -6F, -12F, 1, 4, 6, 0F, 0.5F, -1F, -2F, 0.5F, -1F, -2F, 0.5F, -1F, -3F, 0.5F, -1F, -3F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, -4F, 0.5F, -1F, -4F); // Box 448
		turretModel[51].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[52].addShapeBox(-3.5F, -6F, -12F, 1, 4, 6, 0F, 0.5F, -1F, -2F, 0.5F, -1F, -2F, 0.5F, -1F, -3F, 0.5F, -1F, -3F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, -4F, 0.5F, -1F, -4F); // Box 449
		turretModel[52].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[53].addShapeBox(1.5F, -6F, 6F, 1, 4, 6, 0F, 0.5F, -1F, -3F, 0.5F, -1F, -3F, 0.5F, -1F, -2F, 0.5F, -1F, -2F, 0.5F, -1F, -4F, 0.5F, -1F, -4F, 0.5F, -1F, -1F, 0.5F, -1F, -1F); // Box 450
		turretModel[53].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[54].addShapeBox(-3.5F, -6F, 6F, 1, 4, 6, 0F, 0.5F, -1F, -3F, 0.5F, -1F, -3F, 0.5F, -1F, -2F, 0.5F, -1F, -2F, 0.5F, -1F, -4F, 0.5F, -1F, -4F, 0.5F, -1F, -1F, 0.5F, -1F, -1F); // Box 451
		turretModel[54].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[55].addShapeBox(-1F, -6F, -12F, 1, 4, 6, 0F, 1F, -1F, -2F, 1F, -1F, -2F, 1F, -1F, -3F, 1F, -1F, -3F, 1F, -2F, -1F, 1F, -2F, -1F, 1F, -2F, -4F, 1F, -2F, -4F); // Box 452
		turretModel[55].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[56].addShapeBox(-1F, -4F, -13F, 1, 4, 6, 0F, 3F, -1F, -2F, 3F, -1F, -2F, 3F, -1F, -3F, 3F, -1F, -3F, 3F, -2F, -1F, 3F, -2F, -1F, 3F, -2F, -4F, 3F, -2F, -4F); // Box 453
		turretModel[56].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[57].addShapeBox(-1F, -4F, 7F, 1, 4, 6, 0F, 3F, -1F, -3F, 3F, -1F, -3F, 3F, -1F, -2F, 3F, -1F, -2F, 3F, -2F, -4F, 3F, -2F, -4F, 3F, -2F, -1F, 3F, -2F, -1F); // Box 454
		turretModel[57].setRotationPoint(-1F, -14.5F, 0F);
		
		turretModel[58].addShapeBox(-1F, -6F, 6F, 1, 4, 6, 0F, 1F, -1F, -3F, 1F, -1F, -3F, 1F, -1F, -2F, 1F, -1F, -2F, 1F, -2F, -4F, 1F, -2F, -4F, 1F, -2F, -1F, 1F, -2F, -1F); // Box 455
		turretModel[58].setRotationPoint(-1F, -14.5F, 0F);
		
		
		barrelModel = new ModelRendererTurbo[99];
		barrelModel[0] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 21
		barrelModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 22
		barrelModel[2] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 24
		barrelModel[3] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 25
		barrelModel[4] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 26
		barrelModel[5] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 27
		barrelModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		barrelModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		barrelModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		barrelModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 32
		barrelModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 38
		barrelModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 39
		barrelModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 40
		barrelModel[13] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 41
		barrelModel[14] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 400
		barrelModel[15] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 401
		barrelModel[16] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 402
		barrelModel[17] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 403
		barrelModel[18] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 404
		barrelModel[19] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 405
		barrelModel[20] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 86
		barrelModel[21] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 87
		barrelModel[22] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 88
		barrelModel[23] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 89
		barrelModel[24] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 90
		barrelModel[25] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 91
		barrelModel[26] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 92
		barrelModel[27] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 93
		barrelModel[28] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 94
		barrelModel[29] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 95
		barrelModel[30] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 96
		barrelModel[31] = new ModelRendererTurbo(this, 9, 209, textureX, textureY); // Box 97
		barrelModel[32] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 98
		barrelModel[33] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Box 99
		barrelModel[34] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 100
		barrelModel[35] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 101
		barrelModel[36] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 102
		barrelModel[37] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 104
		barrelModel[38] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 106
		barrelModel[39] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 107
		barrelModel[40] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 108
		barrelModel[41] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 109
		barrelModel[42] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 110
		barrelModel[43] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 111
		barrelModel[44] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 112
		barrelModel[45] = new ModelRendererTurbo(this, 9, 217, textureX, textureY); // Box 113
		barrelModel[46] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 114
		barrelModel[47] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 115
		barrelModel[48] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 120
		barrelModel[49] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 122
		barrelModel[50] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 123
		barrelModel[51] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 124
		barrelModel[52] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 125
		barrelModel[53] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Box 126
		barrelModel[54] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 127
		barrelModel[55] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 128
		barrelModel[56] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Box 135
		barrelModel[57] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 136
		barrelModel[58] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Box 137
		barrelModel[59] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 138
		barrelModel[60] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 139
		barrelModel[61] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 140
		barrelModel[62] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 142
		barrelModel[63] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 143
		barrelModel[64] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 144
		barrelModel[65] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 147
		barrelModel[66] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 148
		barrelModel[67] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 149
		barrelModel[68] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 151
		barrelModel[69] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 152
		barrelModel[70] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 153
		barrelModel[71] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 154
		barrelModel[72] = new ModelRendererTurbo(this, 9, 233, textureX, textureY); // Box 155
		barrelModel[73] = new ModelRendererTurbo(this, 17, 233, textureX, textureY); // Box 168
		barrelModel[74] = new ModelRendererTurbo(this, 25, 233, textureX, textureY); // Box 169
		barrelModel[75] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 170
		barrelModel[76] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Box 171
		barrelModel[77] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 172
		barrelModel[78] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 173
		barrelModel[79] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 174
		barrelModel[80] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 175
		barrelModel[81] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 176
		barrelModel[82] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Box 177
		barrelModel[83] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 178
		barrelModel[84] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 179
		barrelModel[85] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 180
		barrelModel[86] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Box 181
		barrelModel[87] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 182
		barrelModel[88] = new ModelRendererTurbo(this, 9, 241, textureX, textureY); // Box 183
		barrelModel[89] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 184
		barrelModel[90] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 185
		barrelModel[91] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 186
		barrelModel[92] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Box 187
		barrelModel[93] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 188
		barrelModel[94] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Box 191
		barrelModel[95] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 192
		barrelModel[96] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 193
		barrelModel[97] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 194
		barrelModel[98] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 195
		
		barrelModel[0].addShapeBox(10F, -3F, -0.5F, 15, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 21
		barrelModel[0].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[1].addShapeBox(25F, -3F, -0.5F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 22
		barrelModel[1].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[2].addShapeBox(11F, -5F, -1.5F, 1, 5, 3, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 24
		barrelModel[2].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[3].addShapeBox(0F, -3F, -0.5F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		barrelModel[3].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[4].addShapeBox(-2F, -4F, -0.5F, 12, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 26
		barrelModel[4].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[5].addShapeBox(0F, -5F, -0.5F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		barrelModel[5].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[6].addShapeBox(8F, -3.5F, -6F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Box 28
		barrelModel[6].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[7].addShapeBox(-3F, -4F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		barrelModel[7].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[8].addShapeBox(-2F, -4F, 1F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		barrelModel[8].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[9].addShapeBox(-2F, -3F, 1F, 4, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 32
		barrelModel[9].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[10].addShapeBox(-2F, -3F, -2F, 4, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 38
		barrelModel[10].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[11].addShapeBox(-2F, -4F, -2F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		barrelModel[11].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[12].addShapeBox(6F, -3.5F, -6F, 2, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 40
		barrelModel[12].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[13].addShapeBox(8.5F, -3.5F, -5.5F, 1, 1, 5, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 41
		barrelModel[13].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[14].addShapeBox(0F, -3F, 2F, 1, 1, 4, 0F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 400
		barrelModel[14].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[15].addShapeBox(25F, -3F, -0.5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 401
		barrelModel[15].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[16].addShapeBox(27F, -3F, -0.5F, 1, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 402
		barrelModel[16].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[17].addShapeBox(27.7F, -3F, -0.5F, 2, 1, 1, 0F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F); // Box 403
		barrelModel[17].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[18].addShapeBox(-3F, -1.5F, -0.5F, 21, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 404
		barrelModel[18].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[19].addShapeBox(-3F, -2F, -2.5F, 6, 2, 5, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 405
		barrelModel[19].setRotationPoint(-1F, -16.5F, 0F);
		
		barrelModel[20].addShapeBox(7F, -3F, 5F, 8, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 86
		barrelModel[20].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[21].addShapeBox(7F, -2.8F, 5F, 8, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 87
		barrelModel[21].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[22].addShapeBox(7F, -3.2F, 5F, 8, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 88
		barrelModel[22].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[23].addShapeBox(10.1F, -3F, 5F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F); // Box 89
		barrelModel[23].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[24].addShapeBox(10.1F, -2.75F, 5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // Box 90
		barrelModel[24].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[25].addShapeBox(10.1F, -3.25F, 5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F); // Box 91
		barrelModel[25].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[26].addShapeBox(5F, -3.25F, 5F, 2, 1, 1, 0F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 92
		barrelModel[26].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[27].addShapeBox(5F, -3F, 5F, 2, 1, 1, 0F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 93
		barrelModel[27].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[28].addShapeBox(5F, -2.75F, 5F, 2, 1, 1, 0F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 94
		barrelModel[28].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[29].addShapeBox(13.1F, -3.25F, 5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F); // Box 95
		barrelModel[29].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[30].addShapeBox(13.1F, -3F, 5F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F); // Box 96
		barrelModel[30].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[31].addShapeBox(13.1F, -2.75F, 5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // Box 97
		barrelModel[31].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[32].addShapeBox(14.7F, -3.25F, 5F, 1, 1, 1, 0F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 98
		barrelModel[32].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[33].addShapeBox(14.7F, -3F, 5F, 1, 1, 1, 0F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 99
		barrelModel[33].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[34].addShapeBox(14.7F, -2.75F, 5F, 1, 1, 1, 0F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 100
		barrelModel[34].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[35].addShapeBox(3.25F, -3.1F, 5F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F); // Box 101
		barrelModel[35].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[36].addShapeBox(3.25F, -2.75F, 5F, 2, 1, 1, 0F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F); // Box 102
		barrelModel[36].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[37].addShapeBox(4.4F, -3.1F, 5F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F); // Box 104
		barrelModel[37].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[38].addShapeBox(4.4F, -2.7F, 5F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F); // Box 106
		barrelModel[38].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[39].addShapeBox(3.1F, -2.7F, 5F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 107
		barrelModel[39].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[40].addShapeBox(3.1F, -3.1F, 5F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F); // Box 108
		barrelModel[40].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[41].addShapeBox(-1.5F, -2.75F, 5F, 5, 1, 1, 0F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 109
		barrelModel[41].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[42].addShapeBox(-1.5F, -3F, 5F, 5, 1, 1, 0F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F); // Box 110
		barrelModel[42].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[43].addShapeBox(2.9F, -3.45F, 5F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F); // Box 111
		barrelModel[43].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[44].addShapeBox(1.5F, -3.58F, 5F, 2, 1, 1, 0F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F); // Box 112
		barrelModel[44].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[45].addShapeBox(-1.5F, -3.3F, 5F, 2, 1, 1, 0F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F); // Box 113
		barrelModel[45].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[46].addShapeBox(0F, -3.4F, 5F, 2, 1, 1, 0F, -0.3F, -0.45F, -0.08F, -0.3F, -0.2F, -0.08F, -0.3F, -0.2F, -0.08F, -0.3F, -0.45F, -0.08F, -0.3F, -0.25F, -0.08F, -0.3F, -0.25F, -0.08F, -0.3F, -0.25F, -0.08F, -0.3F, -0.25F, -0.08F); // Box 114
		barrelModel[46].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[47].addShapeBox(-3.2F, -3F, 5F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 115
		barrelModel[47].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[48].addShapeBox(-2.5F, -3F, 5F, 1, 1, 1, 0F, 0F, -0.5F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.5F, -0.2F); // Box 120
		barrelModel[48].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[49].addShapeBox(-2.5F, -2.9F, 5F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.6F, -0.2F); // Box 122
		barrelModel[49].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[50].addShapeBox(-2.5F, -3.1F, 5F, 1, 1, 1, 0F, 0F, -0.6F, -0.2F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, 0F, -0.2F); // Box 123
		barrelModel[50].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[51].addShapeBox(-1.8F, -3.25F, 5F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F); // Box 124
		barrelModel[51].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[52].addShapeBox(0F, -2.25F, 5F, 1, 1, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 125
		barrelModel[52].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[53].addShapeBox(-1F, -2.25F, 5F, 1, 1, 1, 0F, -0.4F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, -0.6F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, -0.4F, -0.6F, -0.15F); // Box 126
		barrelModel[53].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[54].addShapeBox(0F, -2.15F, 5F, 1, 2, 1, 0F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0.8F, 0F, -0.25F, -1.2F, 0F, -0.25F, -1.2F, 0F, -0.25F, 0.8F, 0F, -0.25F); // Box 127
		barrelModel[54].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[55].addShapeBox(0.7F, -2.65F, 5F, 3, 1, 1, 0F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F); // Box 128
		barrelModel[55].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[56].addShapeBox(15.7F, -3F, 5F, 1, 1, 1, 0F, 0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F); // Box 135
		barrelModel[56].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[57].addShapeBox(0.34F, -2.25F, 5F, 1, 1, 1, 0F, 0F, 0F, -0.26F, 0F, -0.2F, -0.26F, 0F, -0.2F, -0.26F, 0F, 0F, -0.26F, 0F, -0.25F, -0.26F, -0.25F, 0F, -0.26F, -0.25F, 0F, -0.26F, 0F, -0.25F, -0.26F); // Box 136
		barrelModel[57].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[58].addShapeBox(-1.6F, -2.25F, 5F, 1, 1, 1, 0F, -0.4F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, -0.75F, -0.15F, 0F, -0.6F, -0.15F, 0F, -0.6F, -0.15F, -0.4F, -0.75F, -0.15F); // Box 137
		barrelModel[58].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[59].addShapeBox(10.1F, -3.55F, 5F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F); // Box 138
		barrelModel[59].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[60].addShapeBox(13.6F, -3.65F, 5F, 1, 1, 1, 0F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F); // Box 139
		barrelModel[60].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[61].addShapeBox(13.6F, -3.8F, 5F, 1, 1, 1, 0F, -0.45F, 0F, -0.48F, -0.45F, 0F, -0.48F, -0.45F, 0F, -0.48F, -0.45F, 0F, -0.48F, -0.45F, -0.8F, -0.48F, -0.45F, -0.8F, -0.48F, -0.45F, -0.8F, -0.48F, -0.45F, -0.8F, -0.48F); // Box 140
		barrelModel[61].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[62].addShapeBox(3.9F, -4.35F, 5.24F, 1, 2, 1, 0F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F); // Box 142
		barrelModel[62].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[63].addShapeBox(3.9F, -3.82F, 4.93F, 1, 1, 1, 0F, -0.48F, 0F, -0.3F, -0.48F, 0F, -0.3F, -0.48F, 0F, -0.46F, -0.48F, 0F, -0.46F, -0.48F, -0.6F, -0.3F, -0.48F, -0.6F, -0.3F, -0.48F, -0.6F, -0.46F, -0.48F, -0.6F, -0.46F); // Box 143
		barrelModel[63].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[64].addShapeBox(3.9F, -3.82F, 5.07F, 1, 1, 1, 0F, -0.48F, 0F, -0.46F, -0.48F, 0F, -0.46F, -0.48F, 0F, -0.4F, -0.48F, 0F, -0.4F, -0.48F, -0.6F, -0.46F, -0.48F, -0.6F, -0.46F, -0.48F, -0.6F, -0.4F, -0.48F, -0.6F, -0.4F); // Box 144
		barrelModel[64].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[65].addShapeBox(3.9F, -3.85F, 5F, 1, 1, 1, 0F, -0.48F, -0.1F, -0.45F, -0.48F, -0.1F, -0.45F, -0.48F, -0.1F, -0.45F, -0.48F, -0.1F, -0.45F, -0.48F, -0.57F, -0.45F, -0.48F, -0.57F, -0.45F, -0.48F, -0.57F, -0.45F, -0.48F, -0.57F, -0.45F); // Box 147
		barrelModel[65].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[66].addShapeBox(3.9F, -3.7F, 5.1F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F); // Box 148
		barrelModel[66].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[67].addShapeBox(1.3F, -3.3F, 5.6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 149
		barrelModel[67].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[68].addShapeBox(2.6F, -3.3F, 5.6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 151
		barrelModel[68].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[69].addShapeBox(1.3F, -3.15F, 5.9F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 152
		barrelModel[69].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[70].addShapeBox(2.6F, -3.15F, 5.9F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 153
		barrelModel[70].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[71].addShapeBox(1.3F, -2.85F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 154
		barrelModel[71].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[72].addShapeBox(2.6F, -2.85F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 155
		barrelModel[72].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[73].addShapeBox(1.3F, -2.55F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 168
		barrelModel[73].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[74].addShapeBox(2.6F, -2.55F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 169
		barrelModel[74].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[75].addShapeBox(1.3F, -2.25F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 170
		barrelModel[75].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[76].addShapeBox(2.6F, -2.25F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 171
		barrelModel[76].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[77].addShapeBox(1.3F, -1.95F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 172
		barrelModel[77].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[78].addShapeBox(2.6F, -1.95F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 173
		barrelModel[78].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[79].addShapeBox(1.3F, -1.65F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 174
		barrelModel[79].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[80].addShapeBox(2.6F, -1.65F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 175
		barrelModel[80].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[81].addShapeBox(1.3F, -1.35F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 176
		barrelModel[81].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[82].addShapeBox(2.6F, -1.35F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 177
		barrelModel[82].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[83].addShapeBox(1.3F, -1.05F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 178
		barrelModel[83].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[84].addShapeBox(2.6F, -1.05F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 179
		barrelModel[84].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[85].addShapeBox(1.3F, -0.75F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 180
		barrelModel[85].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[86].addShapeBox(2.6F, -0.75F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 181
		barrelModel[86].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[87].addShapeBox(1.3F, -0.45F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 182
		barrelModel[87].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[88].addShapeBox(2.6F, -0.45F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 183
		barrelModel[88].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[89].addShapeBox(1.3F, -0.15F, 6F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 184
		barrelModel[89].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[90].addShapeBox(2.6F, -0.15F, 6F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 185
		barrelModel[90].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[91].addShapeBox(1.3F, -3.3F, 5F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 186
		barrelModel[91].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[92].addShapeBox(2.6F, -3.3F, 5F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 187
		barrelModel[92].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[93].addShapeBox(1.8F, -2.5F, 6F, 1, 3, 1, 0F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F); // Box 188
		barrelModel[93].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[94].addShapeBox(1.8F, -2.7F, 6F, 1, 1, 1, 0F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.8F, -0.45F, -0.2F, -0.8F, -0.45F, -0.2F, -0.8F, -0.45F, -0.2F, -0.8F, -0.45F); // Box 191
		barrelModel[94].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[95].addShapeBox(1.8F, -3.25F, 5.75F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 192
		barrelModel[95].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[96].addShapeBox(1.3F, -3.3F, 5.3F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 193
		barrelModel[96].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[97].addShapeBox(2.6F, -3.3F, 5.3F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 194
		barrelModel[97].setRotationPoint(0F, -16.5F, 0F);
		
		barrelModel[98].addShapeBox(1.8F, -3.3F, 5.45F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 195
		barrelModel[98].setRotationPoint(0F, -16.5F, 0F);
		
		
		leftFrontWheelModel = new ModelRendererTurbo[1];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Shape 6
		
		leftFrontWheelModel[0].addShape3D(6.5F, -6.5F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 4, 13, 13, 48, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 6
		leftFrontWheelModel[0].setRotationPoint(25F, 1F, 11F);
		
		
		rightFrontWheelModel = new ModelRendererTurbo[1];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Shape 123
		
		rightFrontWheelModel[0].addShape3D(6.5F, -6.5F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 4, 13, 13, 48, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 123
		rightFrontWheelModel[0].setRotationPoint(25F, 1F, -10F);
		
		
		leftBackWheelModel = new ModelRendererTurbo[1];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Shape 124
		
		leftBackWheelModel[0].addShape3D(6.5F, -6.5F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 4, 13, 13, 48, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 124
		leftBackWheelModel[0].setRotationPoint(-21F, 1F, 11F);
		
		
		rightBackWheelModel = new ModelRendererTurbo[1];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Shape 125
		
		rightBackWheelModel[0].addShape3D(6.5F, -6.5F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3)}), 4, 13, 13, 48, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 7, 5, 7, 5, 7, 5, 7}); // Shape 125
		rightBackWheelModel[0].setRotationPoint(-21F, 1F, -10F);
		
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
