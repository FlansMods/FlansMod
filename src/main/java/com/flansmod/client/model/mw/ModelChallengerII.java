//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelChallengerII extends ModelVehicle
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelChallengerII()
	{
		bodyModel = new ModelRendererTurbo[97];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Body1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import Body2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import Body3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 23
		bodyModel[8] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Box 64
		bodyModel[18] = new ModelRendererTurbo(this, 1, 561, textureX, textureY); // Box 65
		bodyModel[19] = new ModelRendererTurbo(this, 0, 585, textureX, textureY); // Box 66
		bodyModel[20] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 67
		bodyModel[21] = new ModelRendererTurbo(this, 0, 615, textureX, textureY); // Box 68
		bodyModel[22] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 76
		bodyModel[23] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Box 77
		bodyModel[24] = new ModelRendererTurbo(this, 0, 585, textureX, textureY); // Box 78
		bodyModel[25] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Box 79
		bodyModel[26] = new ModelRendererTurbo(this, 0, 615, textureX, textureY); // Box 81
		bodyModel[27] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 88
		bodyModel[28] = new ModelRendererTurbo(this, 0, 765, textureX, textureY); // Box 95
		bodyModel[29] = new ModelRendererTurbo(this, 0, 857, textureX, textureY); // Box 105
		bodyModel[30] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 112
		bodyModel[31] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 113
		bodyModel[32] = new ModelRendererTurbo(this, 0, 932, textureX, textureY); // Box 114
		bodyModel[33] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 129
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 130
		bodyModel[36] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 131
		bodyModel[37] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Box 132
		bodyModel[38] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Box 133
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Box 134
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Box 135
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 168
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 169
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 170
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 171
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 172
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 173
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Box 174
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 175
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 176
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 177
		bodyModel[51] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 178
		bodyModel[52] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Box 179
		bodyModel[53] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Box 180
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 181
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1220, textureX, textureY); // Box 182
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 183
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1265, textureX, textureY); // Box 186
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1275, textureX, textureY); // Box 187
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Box 188
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1310, textureX, textureY); // Box 189
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 190
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1365, textureX, textureY); // Box 191
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1390, textureX, textureY); // Box 192
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 206
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 211
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 214
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 216
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 221
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 226
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 231
		bodyModel[71] = new ModelRendererTurbo(this, 0, 1465, textureX, textureY); // Box 241
		bodyModel[72] = new ModelRendererTurbo(this, 0, 1485, textureX, textureY); // Box 242
		bodyModel[73] = new ModelRendererTurbo(this, 0, 1525, textureX, textureY); // Box 246
		bodyModel[74] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 247
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1220, textureX, textureY); // Box 248
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1275, textureX, textureY); // Box 249
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1265, textureX, textureY); // Box 250
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Box 251
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1310, textureX, textureY); // Box 252
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 253
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1365, textureX, textureY); // Box 254
		bodyModel[82] = new ModelRendererTurbo(this, 0, 1485, textureX, textureY); // Box 255
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1465, textureX, textureY); // Box 256
		bodyModel[84] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 257
		bodyModel[85] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 258
		bodyModel[86] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 259
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 260
		bodyModel[88] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 261
		bodyModel[89] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 262
		bodyModel[90] = new ModelRendererTurbo(this, 0, 1390, textureX, textureY); // Box 263
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1525, textureX, textureY); // Box 304
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Box 305
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Box 306
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1570, textureX, textureY); // Box 377
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1630, textureX, textureY); // Box 378
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1690, textureX, textureY); // Box 379

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 3, 11, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body1
		bodyModel[0].setRotationPoint(37F, -21F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 3, 11, 0F,0F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body2
		bodyModel[1].setRotationPoint(37F, -18F, -18F);

		bodyModel[2].addBox(0F, 0F, 0F, 66, 9, 36, 0F); // Import Body3
		bodyModel[2].setRotationPoint(-29F, -21F, -18F);

		bodyModel[3].addBox(0F, 0F, 0F, 37, 12, 50, 0F); // Box 19
		bodyModel[3].setRotationPoint(-71F, -24F, -25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 12, 50, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 20
		bodyModel[4].setRotationPoint(-34F, -24F, -25F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 1, 50, 0F); // Box 21
		bodyModel[5].setRotationPoint(-47F, -25F, -25F);

		bodyModel[6].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 22
		bodyModel[6].setRotationPoint(-59F, -25F, -25F);

		bodyModel[7].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 23
		bodyModel[7].setRotationPoint(-59F, -25F, -18F);

		bodyModel[8].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 24
		bodyModel[8].setRotationPoint(-59F, -25F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 25
		bodyModel[9].setRotationPoint(-59F, -25F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 1, 50, 0F); // Box 26
		bodyModel[10].setRotationPoint(-61F, -25F, -25F);

		bodyModel[11].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 27
		bodyModel[11].setRotationPoint(-59F, -25F, 23F);

		bodyModel[12].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 28
		bodyModel[12].setRotationPoint(-59F, -25F, 16F);

		bodyModel[13].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 29
		bodyModel[13].setRotationPoint(-59F, -25F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 36
		bodyModel[14].setRotationPoint(-71F, -25F, -20F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 37
		bodyModel[15].setRotationPoint(-71F, -25F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 38
		bodyModel[16].setRotationPoint(-71F, -25F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 37, 11, 7, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 64
		bodyModel[17].setRotationPoint(-71F, -23F, -33F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 11, 7, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 65
		bodyModel[18].setRotationPoint(-34F, -23F, -33F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -2F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 66
		bodyModel[19].setRotationPoint(-34F, -23F, -26F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 37, 11, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 67
		bodyModel[20].setRotationPoint(-71F, -23F, -26F);

		bodyModel[21].addBox(0F, 0F, 0F, 20, 1, 7, 0F); // Box 68
		bodyModel[21].setRotationPoint(-61F, -24F, -33F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 37, 11, 1, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 76
		bodyModel[22].setRotationPoint(-71F, -23F, 25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 37, 11, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F); // Box 77
		bodyModel[23].setRotationPoint(-71F, -23F, 26F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 1F, 0F,0F, -2F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 78
		bodyModel[24].setRotationPoint(-34F, -23F, 25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 11, 7, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 79
		bodyModel[25].setRotationPoint(-34F, -23F, 26F);

		bodyModel[26].addBox(0F, 0F, 0F, 20, 1, 7, 0F); // Box 81
		bodyModel[26].setRotationPoint(-61F, -24F, 26F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 7, 34, 0F,0F, 0F, 1F,1F, -6F, 1F,1F, -6F, 1F,0F, 0F, 1F,0F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F,0F, 0F, 1F); // Box 88
		bodyModel[27].setRotationPoint(61F, -14F, -17F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 36, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Box 95
		bodyModel[28].setRotationPoint(58F, -15F, -18F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 9, 9, 36, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 0F,0F, 0F, 0F); // Box 105
		bodyModel[29].setRotationPoint(60F, -7F, -18F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 3, 11, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 112
		bodyModel[30].setRotationPoint(37F, -21F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 23, 3, 11, 0F,0F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 113
		bodyModel[31].setRotationPoint(37F, -18F, 7F);

		bodyModel[32].addShapeBox(0F, 1F, 0F, 21, 11, 14, 0F,0F, 1F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 114
		bodyModel[32].setRotationPoint(37F, -18F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 23, 3, 16, 0F,0F, 3F, 0F,-6F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 128
		bodyModel[33].setRotationPoint(37F, -18F, 18F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 66, 6, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 129
		bodyModel[34].setRotationPoint(-29F, -21F, 18F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 66, 6, 16, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 130
		bodyModel[35].setRotationPoint(-29F, -21F, -34F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 23, 3, 16, 0F,0F, -2.9F, 0F,-0.2F, -2.9F, 0F,-6F, 0F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 131
		bodyModel[36].setRotationPoint(37F, -18F, -34F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 11, 15, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 1F); // Box 132
		bodyModel[37].setRotationPoint(60F, -15F, 18F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 10, 15, 0F,0F, 0F, 0F,0F, -4F, -2F,0F, -4F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F); // Box 133
		bodyModel[38].setRotationPoint(68F, -14F, 18F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 10, 15, 0F,0F, 0F, 1F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 134
		bodyModel[39].setRotationPoint(60F, -15F, -33F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 9, 15, 0F,0F, 0F, 0F,0F, -4F, -2F,0F, -4F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F); // Box 135
		bodyModel[40].setRotationPoint(68F, -14F, -33F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 3, 17, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 168
		bodyModel[41].setRotationPoint(-80F, -24F, -24F);

		bodyModel[42].addBox(0F, 0F, 0F, 9, 3, 17, 0F); // Box 169
		bodyModel[42].setRotationPoint(-80F, -21F, -24F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 3, 17, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 170
		bodyModel[43].setRotationPoint(-80F, -18F, -24F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 171
		bodyModel[44].setRotationPoint(-74F, -24F, -23F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 172
		bodyModel[45].setRotationPoint(-74F, -24F, -12F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 173
		bodyModel[46].setRotationPoint(-74F, -24F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 174
		bodyModel[47].setRotationPoint(-74F, -24F, 19F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 3, 17, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 175
		bodyModel[48].setRotationPoint(-80F, -24F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 3, 17, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 176
		bodyModel[49].setRotationPoint(-80F, -18F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 9, 3, 17, 0F); // Box 177
		bodyModel[50].setRotationPoint(-80F, -21F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 14, 15, 0F); // Box 178
		bodyModel[51].setRotationPoint(-68F, -12F, -33F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 14, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F); // Box 179
		bodyModel[52].setRotationPoint(-67F, -12F, -33F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 14, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F); // Box 180
		bodyModel[53].setRotationPoint(-67F, -12F, 18F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 14, 15, 0F); // Box 181
		bodyModel[54].setRotationPoint(-68F, -12F, 18F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 30, 7, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 182
		bodyModel[55].setRotationPoint(-69F, -23F, 35F);

		bodyModel[56].addBox(0F, 0F, 0F, 30, 7, 2, 0F); // Box 183
		bodyModel[56].setRotationPoint(-69F, -23F, 33F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 37, 4, 2, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 186
		bodyModel[57].setRotationPoint(-64F, -18F, 34.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Box 187
		bodyModel[58].setRotationPoint(-66F, -18F, 34.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 35, 20, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F); // Box 188
		bodyModel[59].setRotationPoint(-46F, -14F, 33.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 54, 20, 3, 0F); // Box 189
		bodyModel[60].setRotationPoint(-11F, -14F, 33.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 11, 20, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F); // Box 190
		bodyModel[61].setRotationPoint(43F, -14F, 33.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 13, 18, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, -8F, 0F,0F, 0F, 0F); // Box 191
		bodyModel[62].setRotationPoint(54F, -14F, 33.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 19, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F,0F, 0F, 0F); // Box 192
		bodyModel[63].setRotationPoint(-27F, -16F, 34.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F,0F, 0F, 0F); // Box 206
		bodyModel[64].setRotationPoint(-8F, -16F, 34.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F,0F, 0F, 0F); // Box 211
		bodyModel[65].setRotationPoint(0F, -16F, 34.5F);

		bodyModel[66].addBox(0F, 0F, 0F, -16, 11, -10, 0F); // Box 214
		bodyModel[66].setRotationPoint(-37F, 6F, 55.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F,0F, 0F, 0F); // Box 216
		bodyModel[67].setRotationPoint(8F, -16F, 34.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F,0F, 0F, 0F); // Box 221
		bodyModel[68].setRotationPoint(16F, -16F, 34.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F,0F, 0F, 0F); // Box 226
		bodyModel[69].setRotationPoint(24F, -16F, 34.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F,0F, 0F, 0F); // Box 231
		bodyModel[70].setRotationPoint(32F, -16F, 34.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 10, 12, 3, 0F); // Box 241
		bodyModel[71].setRotationPoint(40F, -12F, 34.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 11, 12, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F); // Box 242
		bodyModel[72].setRotationPoint(50F, -12F, 34.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 89, 3, 16, 0F); // Box 246
		bodyModel[73].setRotationPoint(-29F, -15F, 18F);

		bodyModel[74].addBox(0F, 0F, 0F, 30, 7, 2, 0F); // Box 247
		bodyModel[74].setRotationPoint(-69F, -23F, -35F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 30, 7, 3, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 248
		bodyModel[75].setRotationPoint(-69F, -23F, -38F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Box 249
		bodyModel[76].setRotationPoint(-66F, -18F, -36.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 37, 4, 2, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 250
		bodyModel[77].setRotationPoint(-64F, -18F, -36.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 35, 20, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F); // Box 251
		bodyModel[78].setRotationPoint(-46F, -14F, -36.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 54, 20, 3, 0F); // Box 252
		bodyModel[79].setRotationPoint(-11F, -14F, -36.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 11, 20, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F); // Box 253
		bodyModel[80].setRotationPoint(43F, -14F, -36.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 13, 18, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, -8F, 0F,0F, 0F, 0F); // Box 254
		bodyModel[81].setRotationPoint(54F, -14F, -36.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 11, 12, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F); // Box 255
		bodyModel[82].setRotationPoint(50F, -12F, -37.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 10, 12, 3, 0F); // Box 256
		bodyModel[83].setRotationPoint(40F, -12F, -37.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F); // Box 257
		bodyModel[84].setRotationPoint(32F, -16F, -37.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F); // Box 258
		bodyModel[85].setRotationPoint(24F, -16F, -37.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F); // Box 259
		bodyModel[86].setRotationPoint(16F, -16F, -37.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F); // Box 260
		bodyModel[87].setRotationPoint(8F, -16F, -37.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F); // Box 261
		bodyModel[88].setRotationPoint(0F, -16F, -37.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F); // Box 262
		bodyModel[89].setRotationPoint(-8F, -16F, -37.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 19, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F); // Box 263
		bodyModel[90].setRotationPoint(-27F, -16F, -37.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 89, 3, 16, 0F); // Box 304
		bodyModel[91].setRotationPoint(-29F, -15F, -34F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3.5F, 0F, 0F); // Box 305
		bodyModel[92].setRotationPoint(-45F, -14F, 36.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3.5F, 0F, 0F); // Box 306
		bodyModel[93].setRotationPoint(-45F, -14F, -37.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 113, 14, 42, 0F); // Box 377
		bodyModel[94].setRotationPoint(-58F, -12F, -21F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 14, 42, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F); // Box 378
		bodyModel[95].setRotationPoint(55F, -12F, -21F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 14, 42, 0F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, -3F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, -3F); // Box 379
		bodyModel[96].setRotationPoint(-63F, -12F, -21F);


		turretModel = new ModelRendererTurbo[23];
		turretModel[0] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Box 387
		turretModel[1] = new ModelRendererTurbo(this, 300, 125, textureX, textureY); // Box 388
		turretModel[2] = new ModelRendererTurbo(this, 300, 166, textureX, textureY); // Box 389
		turretModel[3] = new ModelRendererTurbo(this, 300, 210, textureX, textureY); // Box 390
		turretModel[4] = new ModelRendererTurbo(this, 300, 285, textureX, textureY); // Box 391
		turretModel[5] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // Box 392
		turretModel[6] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // Box 399
		turretModel[7] = new ModelRendererTurbo(this, 300, 395, textureX, textureY); // Box 406
		turretModel[8] = new ModelRendererTurbo(this, 300, 475, textureX, textureY); // Box 408
		turretModel[9] = new ModelRendererTurbo(this, 300, 495, textureX, textureY); // Box 409
		turretModel[10] = new ModelRendererTurbo(this, 300, 540, textureX, textureY); // Box 414
		turretModel[11] = new ModelRendererTurbo(this, 300, 610, textureX, textureY); // Box 419
		turretModel[12] = new ModelRendererTurbo(this, 300, 685, textureX, textureY); // Box 420
		turretModel[13] = new ModelRendererTurbo(this, 300, 745, textureX, textureY); // Box 421
		turretModel[14] = new ModelRendererTurbo(this, 300, 820, textureX, textureY); // Box 422
		turretModel[15] = new ModelRendererTurbo(this, 300, 890, textureX, textureY); // Box 423
		turretModel[16] = new ModelRendererTurbo(this, 300, 950, textureX, textureY); // Box 424
		turretModel[17] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 443
		turretModel[18] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 444
		turretModel[19] = new ModelRendererTurbo(this, 300, 1120, textureX, textureY); // Box 445
		turretModel[20] = new ModelRendererTurbo(this, 300, 1135, textureX, textureY); // Box 457
		turretModel[21] = new ModelRendererTurbo(this, 300, 1135, textureX, textureY); // Box 458
		turretModel[22] = new ModelRendererTurbo(this, 300, 1135, textureX, textureY); // Box 459

		turretModel[0].addBox(0F, 0F, 0F, 17, 1, 36, 0F); // Box 387
		turretModel[0].setRotationPoint(-13.5F, -22F, -18F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 36, 0F,0F, 0F, 0F,0F, 0F, -12F,0F, 0F, -12F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -12F,0F, 0F, -12F,0F, 0F, 0F); // Box 388
		turretModel[1].setRotationPoint(3.5F, -22F, -18F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 36, 0F,0F, 0F, -12F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -12F,0F, 0F, -12F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -12F); // Box 389
		turretModel[2].setRotationPoint(-29.5F, -22F, -18F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 20, 14, 54, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 390
		turretModel[3].setRotationPoint(-11F, -36F, -27F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 13, 14, 54, 0F,0F, 0F, -2F,0F, -3F, -2F,0F, -3F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 391
		turretModel[4].setRotationPoint(9F, -36F, -27F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 22, 11, 20, 0F,0F, 0F, -2F,-21F, 0F, -2F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 392
		turretModel[5].setRotationPoint(22F, -33F, -27F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 22, 11, 20, 0F,0F, 0F, 0F,-10F, 0F, 0F,-21F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F); // Box 399
		turretModel[6].setRotationPoint(22F, -33F, 7F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 20, 3, 50, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 406
		turretModel[7].setRotationPoint(-11F, -39F, -25F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, 0F, 0F,0F, -1.8F, 0F,0F, -1.8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1.15F, 0F,0F, 1.15F, 0F,0F, 0F, 0F); // Box 408
		turretModel[8].setRotationPoint(9F, -39F, -3F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 5, 3, 17, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 1.15F, 0F,0F, 1.15F, 0F,0F, 0F, 0F); // Box 409
		turretModel[9].setRotationPoint(9F, -39F, 8F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 13, 3, 17, 0F,0F, 0F, -5F,0F, -6F, -5F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F); // Box 414
		turretModel[10].setRotationPoint(9F, -39F, -25F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 19, 14, 54, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F); // Box 419
		turretModel[11].setRotationPoint(-30F, -36F, -27F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 19, 3, 50, 0F,0F, -2F, -9F,0F, 0F, -5F,0F, 0F, -5F,0F, -2F, -9F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 420
		turretModel[12].setRotationPoint(-30F, -39F, -25F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 4, 13, 54, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Box 421
		turretModel[13].setRotationPoint(-34F, -36F, -27F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 6, 11, 54, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 422
		turretModel[14].setRotationPoint(-40F, -36F, -27F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 50, 0F,0F, -0.9F, -9F,0F, 0F, -9F,0F, 0F, -9F,0F, -1F, -9F,0F, 0.1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 423
		turretModel[15].setRotationPoint(-40F, -37F, -25F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 7, 11, 54, 0F,0F, -2F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, -2F, -2F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 424
		turretModel[16].setRotationPoint(-47F, -36F, -27F);

		turretModel[17].addBox(0F, 0F, 0F, 18, 2, 6, 0F); // Box 443
		turretModel[17].setRotationPoint(-13F, -40F, -12F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F); // Box 444
		turretModel[18].setRotationPoint(-13F, -40F, -6F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 445
		turretModel[19].setRotationPoint(-13F, -40F, -18F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 457
		turretModel[20].setRotationPoint(-5F, -40F, 15F);

		turretModel[21].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 458
		turretModel[21].setRotationPoint(-5F, -40F, 12F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 459
		turretModel[22].setRotationPoint(-5F, -40F, 9F);


		barrelModel = new ModelRendererTurbo[16];
		barrelModel[0] = new ModelRendererTurbo(this, 300, 1240, textureX, textureY); // Box 14
		barrelModel[1] = new ModelRendererTurbo(this, 300, 1270, textureX, textureY); // Box 33
		barrelModel[2] = new ModelRendererTurbo(this, 300, 1290, textureX, textureY); // Box 34
		barrelModel[3] = new ModelRendererTurbo(this, 300, 1305, textureX, textureY); // Box 35
		barrelModel[4] = new ModelRendererTurbo(this, 300, 1320, textureX, textureY); // Box 36
		barrelModel[5] = new ModelRendererTurbo(this, 300, 1330, textureX, textureY); // Box 37
		barrelModel[6] = new ModelRendererTurbo(this, 300, 1330, textureX, textureY); // Box 38
		barrelModel[7] = new ModelRendererTurbo(this, 300, 1340, textureX, textureY); // Box 39
		barrelModel[8] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Box 40
		barrelModel[9] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Box 41
		barrelModel[10] = new ModelRendererTurbo(this, 300, 1380, textureX, textureY); // Box 55
		barrelModel[11] = new ModelRendererTurbo(this, 300, 1400, textureX, textureY); // Box 56
		barrelModel[12] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 58
		barrelModel[13] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 59
		barrelModel[14] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Box 60
		barrelModel[15] = new ModelRendererTurbo(this, 300, 1400, textureX, textureY); // Box 71

		barrelModel[0].addShapeBox(0F, -5F, -7F, 22, 11, 14, 0F,0F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 14
		barrelModel[0].setRotationPoint(22F, -28F, 0F);

		barrelModel[1].addBox(13F, -4F, -3F, 12, 10, 6, 0F); // Box 33
		barrelModel[1].setRotationPoint(22F, -28F, 0F);

		barrelModel[2].addShapeBox(16F, -8F, -3F, 9, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,4F, 0F, 0F); // Box 34
		barrelModel[2].setRotationPoint(22F, -28F, 0F);

		barrelModel[3].addShapeBox(25F, -7F, -2F, 1, 5, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,4F, 0F, 0F); // Box 35
		barrelModel[3].setRotationPoint(22F, -28F, 0F);

		barrelModel[4].addBox(25F, 1F, -2.5F, 11, 3, 5, 0F); // Box 36
		barrelModel[4].setRotationPoint(22F, -28F, 0F);

		barrelModel[5].addShapeBox(25F, 0F, -2.5F, 11, 1, 5, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 37
		barrelModel[5].setRotationPoint(22F, -28F, 0F);

		barrelModel[6].addShapeBox(25F, 0F, -2.5F, 11, 1, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 38
		barrelModel[6].setRotationPoint(22F, -24F, 0F);

		barrelModel[7].addBox(36F, 1.5F, -2F, 31, 2, 4, 0F); // Box 39
		barrelModel[7].setRotationPoint(22F, -28F, 0F);

		barrelModel[8].addShapeBox(36F, 0.5F, -2F, 31, 1, 4, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 40
		barrelModel[8].setRotationPoint(22F, -28F, 0F);

		barrelModel[9].addShapeBox(36F, 3.5F, -2F, 31, 1, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 41
		barrelModel[9].setRotationPoint(22F, -28F, 0F);

		barrelModel[10].addShapeBox(67F, 0.5F, -3F, 12, 4, 6, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F); // Box 55
		barrelModel[10].setRotationPoint(22F, -28F, 0F);

		barrelModel[11].addShapeBox(67F, 0F, -3F, 12, 1, 6, 0F,0F, 0F, -1.5F,0F, 0F, -1.5F,0F, 0F, -1.5F,0F, 0F, -1.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F); // Box 56
		barrelModel[11].setRotationPoint(22F, -28F, 0F);

		barrelModel[12].addShapeBox(79F, 2F, -1.5F, 30, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 58
		barrelModel[12].setRotationPoint(22F, -28F, 0F);

		barrelModel[13].addShapeBox(79F, 1F, -1.5F, 30, 1, 3, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 59
		barrelModel[13].setRotationPoint(22F, -28F, 0F);

		barrelModel[14].addShapeBox(79F, 3F, -1.5F, 30, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 60
		barrelModel[14].setRotationPoint(22F, -28F, 0F);

		barrelModel[15].addShapeBox(67F, 4F, -3F, 12, 1, 6, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -1.5F,0F, 0F, -1.5F,0F, 0F, -1.5F,0F, 0F, -1.5F); // Box 71
		barrelModel[15].setRotationPoint(22F, -28F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[18];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 359
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 360
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 361
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 362
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 363
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 364
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 365
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 366
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 367
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 368
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 369
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 370
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 371
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 372
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 373
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 374
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 375
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 376

		leftTrackWheelModels[0].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 359
		leftTrackWheelModels[0].setRotationPoint(49F, 2F, 21.5F);

		leftTrackWheelModels[1].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 360
		leftTrackWheelModels[1].setRotationPoint(49F, 2F, 21.5F);

		leftTrackWheelModels[2].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 361
		leftTrackWheelModels[2].setRotationPoint(49F, 2F, 21.5F);

		leftTrackWheelModels[3].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 362
		leftTrackWheelModels[3].setRotationPoint(34F, 2F, 21.5F);

		leftTrackWheelModels[4].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 363
		leftTrackWheelModels[4].setRotationPoint(34F, 2F, 21.5F);

		leftTrackWheelModels[5].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 364
		leftTrackWheelModels[5].setRotationPoint(34F, 2F, 21.5F);

		leftTrackWheelModels[6].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 365
		leftTrackWheelModels[6].setRotationPoint(17F, 2F, 21.5F);

		leftTrackWheelModels[7].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 366
		leftTrackWheelModels[7].setRotationPoint(17F, 2F, 21.5F);

		leftTrackWheelModels[8].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 367
		leftTrackWheelModels[8].setRotationPoint(17F, 2F, 21.5F);

		leftTrackWheelModels[9].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 368
		leftTrackWheelModels[9].setRotationPoint(-3F, 2F, 21.5F);

		leftTrackWheelModels[10].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 369
		leftTrackWheelModels[10].setRotationPoint(-3F, 2F, 21.5F);

		leftTrackWheelModels[11].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 370
		leftTrackWheelModels[11].setRotationPoint(-3F, 2F, 21.5F);

		leftTrackWheelModels[12].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 371
		leftTrackWheelModels[12].setRotationPoint(-19F, 2F, 21.5F);

		leftTrackWheelModels[13].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 372
		leftTrackWheelModels[13].setRotationPoint(-19F, 2F, 21.5F);

		leftTrackWheelModels[14].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 373
		leftTrackWheelModels[14].setRotationPoint(-19F, 2F, 21.5F);

		leftTrackWheelModels[15].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 374
		leftTrackWheelModels[15].setRotationPoint(-38F, 2F, 21.5F);

		leftTrackWheelModels[16].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 375
		leftTrackWheelModels[16].setRotationPoint(-38F, 2F, 21.5F);

		leftTrackWheelModels[17].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 376
		leftTrackWheelModels[17].setRotationPoint(-38F, 2F, 21.5F);


		rightTrackWheelModels = new ModelRendererTurbo[18];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 318
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 319
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 320
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 321
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 322
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 323
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 324
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 325
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 326
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 327
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 328
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 329
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 330
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 331
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 332
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 333
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 334
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 1830, textureX, textureY); // Box 335

		rightTrackWheelModels[0].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 318
		rightTrackWheelModels[0].setRotationPoint(-38F, 2F, -31.5F);

		rightTrackWheelModels[1].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 319
		rightTrackWheelModels[1].setRotationPoint(-38F, 2F, -31.5F);

		rightTrackWheelModels[2].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 320
		rightTrackWheelModels[2].setRotationPoint(-38F, 2F, -31.5F);

		rightTrackWheelModels[3].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 321
		rightTrackWheelModels[3].setRotationPoint(-19F, 2F, -31.5F);

		rightTrackWheelModels[4].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 322
		rightTrackWheelModels[4].setRotationPoint(-19F, 2F, -31.5F);

		rightTrackWheelModels[5].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 323
		rightTrackWheelModels[5].setRotationPoint(-19F, 2F, -31.5F);

		rightTrackWheelModels[6].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 324
		rightTrackWheelModels[6].setRotationPoint(-3F, 2F, -31.5F);

		rightTrackWheelModels[7].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 325
		rightTrackWheelModels[7].setRotationPoint(-3F, 2F, -31.5F);

		rightTrackWheelModels[8].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 326
		rightTrackWheelModels[8].setRotationPoint(-3F, 2F, -31.5F);

		rightTrackWheelModels[9].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 327
		rightTrackWheelModels[9].setRotationPoint(17F, 2F, -31.5F);

		rightTrackWheelModels[10].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 328
		rightTrackWheelModels[10].setRotationPoint(17F, 2F, -31.5F);

		rightTrackWheelModels[11].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 329
		rightTrackWheelModels[11].setRotationPoint(17F, 2F, -31.5F);

		rightTrackWheelModels[12].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 330
		rightTrackWheelModels[12].setRotationPoint(34F, 2F, -31.5F);

		rightTrackWheelModels[13].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 331
		rightTrackWheelModels[13].setRotationPoint(34F, 2F, -31.5F);

		rightTrackWheelModels[14].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 332
		rightTrackWheelModels[14].setRotationPoint(34F, 2F, -31.5F);

		rightTrackWheelModels[15].addShapeBox(-5.5F, -6F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 333
		rightTrackWheelModels[15].setRotationPoint(49F, 2F, -31.5F);

		rightTrackWheelModels[16].addBox(-5.5F, -2F, 0F, 12, 4, 10, 0F); // Box 334
		rightTrackWheelModels[16].setRotationPoint(49F, 2F, -31.5F);

		rightTrackWheelModels[17].addShapeBox(-5.5F, 2F, 0F, 12, 4, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 335
		rightTrackWheelModels[17].setRotationPoint(49F, 2F, -31.5F);


		leftTrackModel = new ModelRendererTurbo[10];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 342
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 1867, textureX, textureY); // Box 343
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 1903, textureX, textureY); // Box 344
		leftTrackModel[3] = new ModelRendererTurbo(this, 0, 1921, textureX, textureY); // Box 345
		leftTrackModel[4] = new ModelRendererTurbo(this, 0, 1955, textureX, textureY); // Box 346
		leftTrackModel[5] = new ModelRendererTurbo(this, 0, 1975, textureX, textureY); // Box 347
		leftTrackModel[6] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 348
		leftTrackModel[7] = new ModelRendererTurbo(this, 300, 20, textureX, textureY); // Box 349
		leftTrackModel[8] = new ModelRendererTurbo(this, 300, 30, textureX, textureY); // Box 350
		leftTrackModel[9] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Box 12

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 120, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 342
		leftTrackModel[0].setRotationPoint(-60F, -12F, 21F);

		leftTrackModel[1].addShapeBox(-2F, 0F, 0F, 2, 19, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 343
		leftTrackModel[1].setRotationPoint(67F, -5F, 21F);
		leftTrackModel[1].rotateAngleZ = -0.6981317F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 107, 2, 12, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, -0.4F, -0.1F,-0.2F, -0.4F, -0.1F,-0.2F, 0F, 0F); // Box 344
		leftTrackModel[2].setRotationPoint(-52F, 8F, 21F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 2, 16, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F); // Box 345
		leftTrackModel[3].setRotationPoint(-65F, 1F, 21F);
		leftTrackModel[3].rotateAngleZ = 0.97738438F;

		leftTrackModel[4].addShapeBox(0F, -2F, 0F, 7, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F); // Box 346
		leftTrackModel[4].setRotationPoint(-60F, -12F, 21F);
		leftTrackModel[4].rotateAngleZ = -2.35619449F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F); // Box 347
		leftTrackModel[5].setRotationPoint(-65F, -7F, 21F);

		leftTrackModel[6].addBox(-4.5F, -1.5F, 0F, 9, 3, 5, 0F); // Box 348
		leftTrackModel[6].setRotationPoint(-57F, -4F, 26F);

		leftTrackModel[7].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 5, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 349
		leftTrackModel[7].setRotationPoint(-57F, -4F, 26F);

		leftTrackModel[8].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 350
		leftTrackModel[8].setRotationPoint(-57F, -4F, 26F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 121, 10, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F); // Box 12
		leftTrackModel[9].setRotationPoint(-62F, -10F, 23F);


		rightTrackModel = new ModelRendererTurbo[10];
		rightTrackModel[0] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 307
		rightTrackModel[1] = new ModelRendererTurbo(this, 300, 20, textureX, textureY); // Box 308
		rightTrackModel[2] = new ModelRendererTurbo(this, 300, 30, textureX, textureY); // Box 309
		rightTrackModel[3] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 336
		rightTrackModel[4] = new ModelRendererTurbo(this, 0, 1867, textureX, textureY); // Box 337
		rightTrackModel[5] = new ModelRendererTurbo(this, 0, 1903, textureX, textureY); // Box 338
		rightTrackModel[6] = new ModelRendererTurbo(this, 0, 1955, textureX, textureY); // Box 339
		rightTrackModel[7] = new ModelRendererTurbo(this, 0, 1975, textureX, textureY); // Box 340
		rightTrackModel[8] = new ModelRendererTurbo(this, 0, 1921, textureX, textureY); // Box 341
		rightTrackModel[9] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Box 13

		rightTrackModel[0].addBox(-4.5F, -1.5F, 0F, 9, 3, 5, 0F); // Box 307
		rightTrackModel[0].setRotationPoint(-57F, -4F, -31F);

		rightTrackModel[1].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 5, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 308
		rightTrackModel[1].setRotationPoint(-57F, -4F, -31F);

		rightTrackModel[2].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 309
		rightTrackModel[2].setRotationPoint(-57F, -4F, -31F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 120, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 336
		rightTrackModel[3].setRotationPoint(-60F, -12F, -33F);

		rightTrackModel[4].addShapeBox(-2F, 0F, 0F, 2, 19, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 337
		rightTrackModel[4].setRotationPoint(67F, -5F, -33F);
		rightTrackModel[4].rotateAngleZ = -0.6981317F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 107, 2, 12, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, -0.4F, -0.1F,-0.2F, -0.4F, -0.1F,-0.2F, 0F, 0F); // Box 338
		rightTrackModel[5].setRotationPoint(-52F, 8F, -33F);

		rightTrackModel[6].addShapeBox(0F, -2F, 0F, 7, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F); // Box 339
		rightTrackModel[6].setRotationPoint(-60F, -12F, -33F);
		rightTrackModel[6].rotateAngleZ = -2.35619449F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F); // Box 340
		rightTrackModel[7].setRotationPoint(-65F, -7F, -33F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 16, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.1F,0F, 0F, -0.1F,0F, 0F, 0F); // Box 341
		rightTrackModel[8].setRotationPoint(-65F, 1F, -33F);
		rightTrackModel[8].rotateAngleZ = 0.97738438F;

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 121, 10, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F); // Box 13
		rightTrackModel[9].setRotationPoint(-62F, -10F, -29F);



		// Passenger Gun 1
		ModelRendererTurbo[][] gun_0_Model = new ModelRendererTurbo[3][];

		gun_0_Model[0] = new ModelRendererTurbo[0];

		gun_0_Model[1] = new ModelRendererTurbo[0];

		gun_0_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("Gun0", gun_0_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
