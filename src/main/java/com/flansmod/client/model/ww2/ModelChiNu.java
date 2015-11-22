//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.7
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelChiNu extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelChiNu()
	{
		bodyModel = new ModelRendererTurbo[107];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import TrackCoverLeft
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import TrackCoverRight
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import MainBodyBack
		bodyModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import MainB0dyFront
		bodyModel[4] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import SmallCoverUp
		bodyModel[5] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import EngineThingLeft
		bodyModel[6] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import DWC
		bodyModel[7] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import CW6
		bodyModel[8] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box98
		bodyModel[9] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 42
		bodyModel[33] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 58
		bodyModel[46] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 64
		bodyModel[52] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 65
		bodyModel[53] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 73
		bodyModel[59] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 74
		bodyModel[60] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 75
		bodyModel[61] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 79
		bodyModel[62] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 80
		bodyModel[63] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 81
		bodyModel[64] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 82
		bodyModel[65] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 83
		bodyModel[66] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 84
		bodyModel[67] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 85
		bodyModel[68] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 86
		bodyModel[69] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 87
		bodyModel[70] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 88
		bodyModel[71] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 90
		bodyModel[72] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 91
		bodyModel[73] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 92
		bodyModel[74] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 132
		bodyModel[75] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 135
		bodyModel[76] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 139
		bodyModel[77] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 140
		bodyModel[78] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 142
		bodyModel[79] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 144
		bodyModel[80] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 132
		bodyModel[81] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 133
		bodyModel[82] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 134
		bodyModel[83] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 135
		bodyModel[84] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 136
		bodyModel[85] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 137
		bodyModel[86] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 138
		bodyModel[87] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 139
		bodyModel[88] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 140
		bodyModel[89] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 141
		bodyModel[90] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 142
		bodyModel[91] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 143
		bodyModel[92] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 144
		bodyModel[93] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 145
		bodyModel[94] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 146
		bodyModel[95] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 148
		bodyModel[96] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 149
		bodyModel[97] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 150
		bodyModel[98] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 151
		bodyModel[99] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 152
		bodyModel[100] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 153
		bodyModel[101] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 154
		bodyModel[102] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 155
		bodyModel[103] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 160
		bodyModel[104] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 161
		bodyModel[105] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 162
		bodyModel[106] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 164

		bodyModel[0].addBox(0F, 0F, 0F, 90, 1, 8, 0F); // Import TrackCoverLeft
		bodyModel[0].setRotationPoint(-56.5F, -13.5F, 13F);

		bodyModel[1].addBox(0F, 0F, 0F, 90, 1, 8, 0F); // Import TrackCoverRight
		bodyModel[1].setRotationPoint(-56.5F, -13.5F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 72, 16, 26, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -3F, .3F, 0F); // Import MainBodyBack
		bodyModel[2].setRotationPoint(-53F, -13.5F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 11, 5, 26, 0F,0F, 2F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 2F, 0F, 0F, 5.3F, 0F, 7F, 2F, 0F, 7F, 2F, 0F, 0F, 5.3F, 0F); // Import MainB0dyFront
		bodyModel[3].setRotationPoint(19F, -7.5F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 26, 0F,4F, -10.3F, 0F, 12F, -7.0F, 0F, 12F, -7.0F, 0F, 3F, -10.3F, 0F, 4F, 5.3F, 0F, 7F, 5.3F, 0F, 7F, 5.3F, 0F, 4F, 5.3F, 0F); // Import SmallCoverUp
		bodyModel[4].setRotationPoint(23F, -7.5F, -13F);

		bodyModel[5].addBox(0F, 0F, -0.5F, 16, 4, 5, 0F); // Import EngineThingLeft
		bodyModel[5].setRotationPoint(-53F, -17F, 15.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Import DWC
		bodyModel[6].setRotationPoint(31F, -7F, 13F);

		bodyModel[7].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Import CW6
		bodyModel[7].setRotationPoint(-43F, 3F, 13F);

		bodyModel[8].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Import Box98
		bodyModel[8].setRotationPoint(20F, -7.5F, 13F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-43F, -1F, 13F);

		bodyModel[10].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(-43F, -1F, 13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(-30F, -1F, 13F);

		bodyModel[12].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 15
		bodyModel[12].setRotationPoint(-30F, 3F, 13F);

		bodyModel[13].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(-30F, -1F, 13F);

		bodyModel[14].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-17F, -1F, 13F);

		bodyModel[15].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 18
		bodyModel[15].setRotationPoint(-17F, 3F, 13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-17F, -1F, 13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(-4F, -1F, 13F);

		bodyModel[18].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 21
		bodyModel[18].setRotationPoint(-4F, 3F, 13F);

		bodyModel[19].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-4F, -1F, 13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(9F, -1F, 13F);

		bodyModel[21].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 24
		bodyModel[21].setRotationPoint(9F, 3F, 13F);

		bodyModel[22].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(9F, -1F, 13F);

		bodyModel[23].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(22F, -1F, 13F);

		bodyModel[24].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 27
		bodyModel[24].setRotationPoint(22F, 3F, 13F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(22F, -1F, 13F);

		bodyModel[26].addBox(-3F, 0F, 0F, 3, 1, 8, 0F); // Box 31
		bodyModel[26].setRotationPoint(-56.5F, -13.5F, 13F);
		bodyModel[26].rotateAngleZ = 0.64577182F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[27].setRotationPoint(31F, -9F, 13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 35
		bodyModel[28].setRotationPoint(31F, -4F, 13F);

		bodyModel[29].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 39
		bodyModel[29].setRotationPoint(-56F, -6.5F, 13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[30].setRotationPoint(-56F, -8.5F, 13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 41
		bodyModel[31].setRotationPoint(-56F, -3.5F, 13F);

		bodyModel[32].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[32].setRotationPoint(20F, -8.5F, 13F);

		bodyModel[33].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 45
		bodyModel[33].setRotationPoint(20F, -4.5F, 13F);

		bodyModel[34].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[34].setRotationPoint(-6F, -8.5F, 13F);

		bodyModel[35].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Box 47
		bodyModel[35].setRotationPoint(-6F, -7.5F, 13F);

		bodyModel[36].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 48
		bodyModel[36].setRotationPoint(-6F, -4.5F, 13F);

		bodyModel[37].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[37].setRotationPoint(-32F, -8.5F, 13F);

		bodyModel[38].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Box 50
		bodyModel[38].setRotationPoint(-32F, -7.5F, 13F);

		bodyModel[39].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 51
		bodyModel[39].setRotationPoint(-32F, -4.5F, 13F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[40].setRotationPoint(-43F, -1F, -19F);

		bodyModel[41].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 54
		bodyModel[41].setRotationPoint(-43F, 3F, -19F);

		bodyModel[42].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 55
		bodyModel[42].setRotationPoint(-43F, -1F, -19F);

		bodyModel[43].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 56
		bodyModel[43].setRotationPoint(-30F, -1F, -19F);

		bodyModel[44].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 57
		bodyModel[44].setRotationPoint(-30F, 3F, -19F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[45].setRotationPoint(-30F, -1F, -19F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[46].setRotationPoint(-17F, -1F, -19F);

		bodyModel[47].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 60
		bodyModel[47].setRotationPoint(-17F, 3F, -19F);

		bodyModel[48].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 61
		bodyModel[48].setRotationPoint(-17F, -1F, -19F);

		bodyModel[49].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 62
		bodyModel[49].setRotationPoint(-4F, 3F, -19F);

		bodyModel[50].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 63
		bodyModel[50].setRotationPoint(-4F, -1F, -19F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[51].setRotationPoint(-4F, -1F, -19F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[52].setRotationPoint(9F, -1F, -19F);

		bodyModel[53].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 66
		bodyModel[53].setRotationPoint(9F, 3F, -19F);

		bodyModel[54].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 67
		bodyModel[54].setRotationPoint(9F, -1F, -19F);

		bodyModel[55].addShapeBox(0F, 6F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 68
		bodyModel[55].setRotationPoint(22F, -1F, -19F);

		bodyModel[56].addBox(0F, -2F, 0F, 8, 4, 6, 0F); // Box 69
		bodyModel[56].setRotationPoint(22F, 3F, -19F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[57].setRotationPoint(22F, -1F, -19F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 73
		bodyModel[58].setRotationPoint(31F, -4F, -19F);

		bodyModel[59].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 74
		bodyModel[59].setRotationPoint(31F, -7F, -19F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[60].setRotationPoint(31F, -9F, -19F);

		bodyModel[61].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[61].setRotationPoint(20F, -8.5F, -17F);

		bodyModel[62].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Box 80
		bodyModel[62].setRotationPoint(20F, -7.5F, -17F);

		bodyModel[63].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 81
		bodyModel[63].setRotationPoint(20F, -4.5F, -17F);

		bodyModel[64].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 82
		bodyModel[64].setRotationPoint(-6F, -4.5F, -17F);

		bodyModel[65].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Box 83
		bodyModel[65].setRotationPoint(-6F, -7.5F, -17F);

		bodyModel[66].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[66].setRotationPoint(-6F, -8.5F, -17F);

		bodyModel[67].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Box 85
		bodyModel[67].setRotationPoint(-21F, -3F, -14F);

		bodyModel[68].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[68].setRotationPoint(-32F, -4.5F, -17F);

		bodyModel[69].addBox(-2F, 0F, 0F, 5, 3, 4, 0F); // Box 87
		bodyModel[69].setRotationPoint(-32F, -7.5F, -17F);

		bodyModel[70].addShapeBox(-2F, 0F, 0F, 5, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[70].setRotationPoint(-32F, -8.5F, -17F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 90
		bodyModel[71].setRotationPoint(-56F, -3.5F, -19F);

		bodyModel[72].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 91
		bodyModel[72].setRotationPoint(-56F, -6.5F, -19F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[73].setRotationPoint(-56F, -8.5F, -19F);

		bodyModel[74].addBox(-3F, 0F, 0F, 3, 1, 8, 0F); // Box 132
		bodyModel[74].setRotationPoint(-56.5F, -13.5F, -21F);
		bodyModel[74].rotateAngleZ = 0.64577182F;

		bodyModel[75].addBox(0F, 0F, 0F, 48, 5, 32, 0F); // Box 135
		bodyModel[75].setRotationPoint(-31F, -18F, -16F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F,0F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[76].setRotationPoint(17F, -18F, -16F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 20, 6, 26, 0F,0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[77].setRotationPoint(19F, -13.5F, -13F);

		bodyModel[78].addShapeBox(0F, 0F, -14F, 9, 6, 20, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[78].setRotationPoint(17F, -18F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 6, 0, 0F,0F, -2F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -4F, 0F); // Box 144
		bodyModel[79].setRotationPoint(19F, -14.5F, 13F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 48, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[80].setRotationPoint(-31F, -18F, 16F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[81].setRotationPoint(17F, -18F, -20F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 48, 5, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[82].setRotationPoint(-31F, -18F, -20F);

		bodyModel[83].addBox(0F, 0F, 0F, 24, 5, 32, 0F); // Box 135
		bodyModel[83].setRotationPoint(-55F, -18F, -16F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[84].setRotationPoint(-35F, -18F, -20F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 137
		bodyModel[85].setRotationPoint(-35F, -18F, 16F);

		bodyModel[86].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Box 138
		bodyModel[86].setRotationPoint(26F, -12.5F, 1F);
		bodyModel[86].rotateAngleZ = -0.12217305F;

		bodyModel[87].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Box 139
		bodyModel[87].setRotationPoint(26F, -12.5F, -11F);
		bodyModel[87].rotateAngleZ = -0.12217305F;

		bodyModel[88].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 140
		bodyModel[88].setRotationPoint(26F, -12.8F, 10F);
		bodyModel[88].rotateAngleZ = -0.12217305F;

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 141
		bodyModel[89].setRotationPoint(34F, -11.8F, 10F);
		bodyModel[89].rotateAngleZ = -0.12217305F;

		bodyModel[90].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 142
		bodyModel[90].setRotationPoint(34F, -11.8F, -11F);
		bodyModel[90].rotateAngleZ = -0.12217305F;

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 143
		bodyModel[91].setRotationPoint(26F, -12.8F, -11F);
		bodyModel[91].rotateAngleZ = -0.12217305F;

		bodyModel[92].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 144
		bodyModel[92].setRotationPoint(24F, -17.5F, 4F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 145
		bodyModel[93].setRotationPoint(25F, -17F, 5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 146
		bodyModel[94].setRotationPoint(27F, -16F, 6F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 148
		bodyModel[95].setRotationPoint(24F, -17.5F, -9F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 149
		bodyModel[96].setRotationPoint(25.4F, -16.5F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 150
		bodyModel[97].setRotationPoint(25.4F, -15F, -9F);

		bodyModel[98].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 151
		bodyModel[98].setRotationPoint(-51F, -18.2F, -15F);

		bodyModel[99].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 152
		bodyModel[99].setRotationPoint(-51F, -18.2F, 1F);

		bodyModel[100].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 153
		bodyModel[100].setRotationPoint(-38F, -18.2F, 1F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 154
		bodyModel[101].setRotationPoint(-38F, -18.2F, -15F);

		bodyModel[102].addBox(0F, 0F, -0.5F, 16, 4, 5, 0F); // Box 155
		bodyModel[102].setRotationPoint(-53F, -17F, -19.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Box 160
		bodyModel[103].setRotationPoint(-21F, -3F, 12F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 161
		bodyModel[104].setRotationPoint(17F, -18F, 16F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[105].setRotationPoint(17F, -18F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 19, 6, 0, 0F,0F, -2F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -4F, 0F); // Box 164
		bodyModel[106].setRotationPoint(19F, -14.5F, -13F);


		turretModel = new ModelRendererTurbo[20];
		turretModel[0] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import BackHatch
		turretModel[1] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import RotatingThingy
		turretModel[2] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Thesquare
		turretModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import LeftHatch
		turretModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import RightHatch
		turretModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import AntennaBottom
		turretModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import AntennaForward
		turretModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import AntennaUpperBase
		turretModel[8] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import AntennaAngle
		turretModel[9] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Import RightSticker
		turretModel[10] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 1
		turretModel[11] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 129
		turretModel[12] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 130
		turretModel[13] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 131
		turretModel[14] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 136
		turretModel[15] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 137
		turretModel[16] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 138
		turretModel[17] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 145
		turretModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 146
		turretModel[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 147

		turretModel[0].addBox(-27.5F, 9F, -5F, 1, 7, 10, 0F); // Import BackHatch
		turretModel[0].setRotationPoint(0F, -28F, 0F);
		turretModel[0].rotateAngleZ = -0.34906585F;

		turretModel[1].addShapeBox(16F, 2F, -5.5F, 2, 6, 11, 0F,0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2.2F, 0F, 0F, .5F, 0F, 0F, 0.5F, 0F, 0F, 2.2F, 0F); // Import RotatingThingy
		turretModel[1].setRotationPoint(2F, -29F, 0F);

		turretModel[2].addBox(13.9F, -1F, -6F, 4, 11, 12, 0F); // Import Thesquare
		turretModel[2].setRotationPoint(0F, -29F, 0F);

		turretModel[3].addShapeBox(-3F, 0F, -1F, 3, 4, 1, 0F,5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F); // Import LeftHatch
		turretModel[3].setRotationPoint(0F, -35F, 0F);

		turretModel[4].addShapeBox(-3F, 0F, -10F, 3, 4, 1, 0F,2F, 0F, 2F, 2F, 0F, 2F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 5F, 0F, 0F, 5F, 0F, 0F); // Import RightHatch
		turretModel[4].setRotationPoint(0F, -35F, 0F);

		turretModel[5].addShapeBox(4.5F, 7F, 9.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Import AntennaBottom
		turretModel[5].setRotationPoint(0F, -43F, 0F);

		turretModel[6].addBox(7.5F, 4.5F, 9.5F, 1, 4, 1, 0F); // Import AntennaForward
		turretModel[6].setRotationPoint(0F, -28F, 0F);
		turretModel[6].rotateAngleZ = 1.57079633F;

		turretModel[7].addBox(7.5F, 7F, 9.5F, 1, 3, 1, 0F); // Import AntennaUpperBase
		turretModel[7].setRotationPoint(0F, -46F, 0F);

		turretModel[8].addShapeBox(-2F, 9F, 9.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import AntennaAngle
		turretModel[8].setRotationPoint(0F, -49F, 0F);
		turretModel[8].rotateAngleZ = 0.78539816F;

		turretModel[9].addBox(0F, 4F, -13.3F, 6, 4, 1, 0F); // Import RightSticker
		turretModel[9].setRotationPoint(0F, -29F, 0F);
		turretModel[9].rotateAngleX = -0.10471976F;
		turretModel[9].rotateAngleY = 0.59341195F;

		turretModel[10].addShapeBox(-8F, 0F, -9F, 13, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[10].setRotationPoint(0F, -35F, 0F);

		turretModel[11].addShapeBox(4F, -3F, -14F, 10, 14, 28, 0F,0F, 0F, -1F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, -8F, 3F, 0F, -8F, 0F, 0F, 0F); // Box 129
		turretModel[11].setRotationPoint(0F, -29F, 0F);

		turretModel[12].addShapeBox(-28F, -3F, -14F, 21, 11, 28, 0F,0F, -2F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -6F, 3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -5F); // Box 130
		turretModel[12].setRotationPoint(0F, -29F, 0F);

		turretModel[13].addShapeBox(-7F, -3F, -14F, 11, 14, 28, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		turretModel[13].setRotationPoint(0F, -29F, 0F);

		turretModel[14].addShapeBox(-23F, 8F, -14F, 16, 3, 28, 0F,3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -4F, 3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -5F); // Box 136
		turretModel[14].setRotationPoint(0F, -29F, 0F);

		turretModel[15].addBox(0F, 4F, 12F, 6, 4, 1, 0F); // Box 137
		turretModel[15].setRotationPoint(0F, -29F, 0F);
		turretModel[15].rotateAngleX = 0.10471976F;
		turretModel[15].rotateAngleY = -0.59341195F;

		turretModel[16].addBox(-6F, 0F, 3F, 9, 1, 9, 0F); // Box 138
		turretModel[16].setRotationPoint(0F, -32.5F, 0F);

		turretModel[17].addShapeBox(-6F, 1F, 12.5F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		turretModel[17].setRotationPoint(0F, -29F, 0F);
		turretModel[17].rotateAngleX = 0.08726646F;

		turretModel[18].addShapeBox(1F, 1F, 12.7F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		turretModel[18].setRotationPoint(0F, -29F, 0F);
		turretModel[18].rotateAngleX = 0.08726646F;

		turretModel[19].addShapeBox(1F, 6F, 12.7F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		turretModel[19].setRotationPoint(0F, -29F, 0F);
		turretModel[19].rotateAngleX = 0.08726646F;


		barrelModel = new ModelRendererTurbo[11];
		barrelModel[0] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import BarrelBack
		barrelModel[1] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import LeftWeeGee
		barrelModel[2] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import RightWeeGee
		barrelModel[3] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 3
		barrelModel[4] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 5
		barrelModel[5] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 6
		barrelModel[6] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 7
		barrelModel[7] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 8
		barrelModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 9
		barrelModel[9] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 10
		barrelModel[10] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 128

		barrelModel[0].addBox(1F, -1.2F, -1.5F, 12, 3, 3, 0F); // Import BarrelBack
		barrelModel[0].setRotationPoint(16F, -24.2F, 0F);

		barrelModel[1].addBox(1F, -3.1F, 1F, 10, 1, 3, 0F); // Import LeftWeeGee
		barrelModel[1].setRotationPoint(16F, -24.2F, 0F);

		barrelModel[2].addBox(0F, -3.1F, -4F, 9, 1, 3, 0F); // Import RightWeeGee
		barrelModel[2].setRotationPoint(17F, -24.2F, 0F);

		barrelModel[3].addShapeBox(0F, -4.1F, -4F, 9, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		barrelModel[3].setRotationPoint(17F, -24.2F, 0F);

		barrelModel[4].addShapeBox(0F, -2.1F, -4F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		barrelModel[4].setRotationPoint(17F, -24.2F, 0F);

		barrelModel[5].addShapeBox(1F, -4.1F, 1F, 10, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[5].setRotationPoint(16F, -24.2F, 0F);

		barrelModel[6].addShapeBox(1F, -2.1F, 1F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7
		barrelModel[6].setRotationPoint(16F, -24.2F, 0F);

		barrelModel[7].addShapeBox(1F, 3.5F, 1F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		barrelModel[7].setRotationPoint(16F, -24.2F, 0F);

		barrelModel[8].addBox(1F, 2.5F, 1F, 10, 1, 3, 0F); // Box 9
		barrelModel[8].setRotationPoint(16F, -24.2F, 0F);

		barrelModel[9].addShapeBox(1F, 1.5F, 1F, 10, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		barrelModel[9].setRotationPoint(16F, -24.2F, 0F);

		barrelModel[10].addShapeBox(8F, -0.7F, -1F, 55, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F); // Box 128
		barrelModel[10].setRotationPoint(11F, -24.2F, 0F);


		leftTrackModel = new ModelRendererTurbo[8];
		leftTrackModel[0] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import BottomTrackLeft
		leftTrackModel[1] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import TopTrackLeft
		leftTrackModel[2] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import FrontCornerTrack
		leftTrackModel[3] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import TrackFront
		leftTrackModel[4] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Import TraclFrontAngled
		leftTrackModel[5] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import BackTopTrack
		leftTrackModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Back
		leftTrackModel[7] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import BackLowerAngle

		leftTrackModel[0].addBox(0F, 0F, 0F, 71, 1, 7, 0F); // Import BottomTrackLeft
		leftTrackModel[0].setRotationPoint(-42F, 7F, 13F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 91, 1, 7, 0F); // Import TopTrackLeft
		leftTrackModel[1].setRotationPoint(-54F, -9.5F, 13F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import FrontCornerTrack
		leftTrackModel[2].setRotationPoint(37F, -9.5F, 13F);
		leftTrackModel[2].rotateAngleZ = -0.79412481F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Import TrackFront
		leftTrackModel[3].setRotationPoint(39F, -7.5F, 13F);
		leftTrackModel[3].rotateAngleZ = -1.57079633F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TraclFrontAngled
		leftTrackModel[4].setRotationPoint(39F, -3.5F, 13F);
		leftTrackModel[4].rotateAngleZ = -2.28638132F;

		leftTrackModel[5].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Import BackTopTrack
		leftTrackModel[5].setRotationPoint(-56.8F, -6.7F, 13F);
		leftTrackModel[5].rotateAngleZ = 0.78539816F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Back
		leftTrackModel[6].setRotationPoint(-56.8F, -2.7F, 13F);
		leftTrackModel[6].rotateAngleZ = 1.57079633F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F,0F, 0F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import BackLowerAngle
		leftTrackModel[7].setRotationPoint(-42F, 8F, 13F);
		leftTrackModel[7].rotateAngleZ = 2.53072742F;


		rightTrackModel = new ModelRendererTurbo[8];
		rightTrackModel[0] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 71
		rightTrackModel[1] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 72
		rightTrackModel[2] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 76
		rightTrackModel[3] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 77
		rightTrackModel[4] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 78
		rightTrackModel[5] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 89
		rightTrackModel[6] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 93
		rightTrackModel[7] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 94

		rightTrackModel[0].addBox(0F, 0F, 0F, 71, 1, 7, 0F); // Box 71
		rightTrackModel[0].setRotationPoint(-42F, 7F, -20F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		rightTrackModel[1].setRotationPoint(39F, -3.5F, -20F);
		rightTrackModel[1].rotateAngleZ = -2.28638132F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 91, 1, 7, 0F); // Box 76
		rightTrackModel[2].setRotationPoint(-54F, -9.5F, -20F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 77
		rightTrackModel[3].setRotationPoint(39F, -7.5F, -20F);
		rightTrackModel[3].rotateAngleZ = -1.57079633F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		rightTrackModel[4].setRotationPoint(37F, -9.5F, -20F);
		rightTrackModel[4].rotateAngleZ = -0.79412481F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 7, 0F,0F, 0F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		rightTrackModel[5].setRotationPoint(-42F, 8F, -20F);
		rightTrackModel[5].rotateAngleZ = 2.53072742F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 93
		rightTrackModel[6].setRotationPoint(-56.8F, -6.7F, -20F);
		rightTrackModel[6].rotateAngleZ = 0.78539816F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		rightTrackModel[7].setRotationPoint(-56.8F, -2.7F, -20F);
		rightTrackModel[7].rotateAngleZ = 1.57079633F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}