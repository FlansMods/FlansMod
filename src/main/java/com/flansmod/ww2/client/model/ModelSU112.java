//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelSU112 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSU112() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[127];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 105
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 106
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 110
		bodyModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 111
		bodyModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 112
		bodyModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 4
		bodyModel[10] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 5
		bodyModel[11] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 6
		bodyModel[12] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 7
		bodyModel[13] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 8
		bodyModel[14] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 1
		bodyModel[16] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 3
		bodyModel[17] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 5
		bodyModel[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 7
		bodyModel[21] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 8
		bodyModel[22] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 9
		bodyModel[23] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 10
		bodyModel[24] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 11
		bodyModel[25] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 12
		bodyModel[26] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 13
		bodyModel[27] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 14
		bodyModel[28] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 15
		bodyModel[29] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 16
		bodyModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17
		bodyModel[31] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 18
		bodyModel[32] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 19
		bodyModel[33] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 20
		bodyModel[34] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 27
		bodyModel[35] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // door
		bodyModel[36] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 30
		bodyModel[37] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // door
		bodyModel[38] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // door
		bodyModel[39] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // door
		bodyModel[40] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // door
		bodyModel[41] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // door
		bodyModel[42] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 161
		bodyModel[43] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 162
		bodyModel[44] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 163
		bodyModel[45] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 172
		bodyModel[46] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 173
		bodyModel[47] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 174
		bodyModel[48] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 175
		bodyModel[49] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 176
		bodyModel[50] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Box 177
		bodyModel[51] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 178
		bodyModel[52] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 179
		bodyModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 180
		bodyModel[54] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 181
		bodyModel[55] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 182
		bodyModel[56] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 183
		bodyModel[57] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 195
		bodyModel[58] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 196
		bodyModel[59] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 197
		bodyModel[60] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 198
		bodyModel[61] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 199
		bodyModel[62] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 200
		bodyModel[63] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 201
		bodyModel[64] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 202
		bodyModel[65] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 203
		bodyModel[66] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 204
		bodyModel[67] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 205
		bodyModel[68] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 206
		bodyModel[69] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 207
		bodyModel[70] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 208
		bodyModel[71] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 209
		bodyModel[72] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 210
		bodyModel[73] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 211
		bodyModel[74] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 212
		bodyModel[75] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 213
		bodyModel[76] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 214
		bodyModel[77] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 215
		bodyModel[78] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 216
		bodyModel[79] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 217
		bodyModel[80] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 218
		bodyModel[81] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 219
		bodyModel[82] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 220
		bodyModel[83] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 221
		bodyModel[84] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 222
		bodyModel[85] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 225
		bodyModel[86] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 226
		bodyModel[87] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 227
		bodyModel[88] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 229
		bodyModel[89] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 231
		bodyModel[90] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 232
		bodyModel[91] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 233
		bodyModel[92] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 234
		bodyModel[93] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 235
		bodyModel[94] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 236
		bodyModel[95] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 237
		bodyModel[96] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 248
		bodyModel[97] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 249
		bodyModel[98] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 250
		bodyModel[99] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 251
		bodyModel[100] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 252
		bodyModel[101] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 253
		bodyModel[102] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 254
		bodyModel[103] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 255
		bodyModel[104] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Box 256
		bodyModel[105] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 258
		bodyModel[106] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 260
		bodyModel[107] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 262
		bodyModel[108] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 263
		bodyModel[109] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 264
		bodyModel[110] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 265
		bodyModel[111] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 266
		bodyModel[112] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 267
		bodyModel[113] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 268
		bodyModel[114] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Box 269
		bodyModel[115] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 270
		bodyModel[116] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 271
		bodyModel[117] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 272
		bodyModel[118] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 273
		bodyModel[119] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 16
		bodyModel[120] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 17
		bodyModel[121] = new ModelRendererTurbo(this, 757, 56, textureX, textureY); // Box 24
		bodyModel[122] = new ModelRendererTurbo(this, 758, 58, textureX, textureY); // Box 26
		bodyModel[123] = new ModelRendererTurbo(this, 703, 185, textureX, textureY); // door
		bodyModel[124] = new ModelRendererTurbo(this, 703, 250, textureX, textureY); // door
		bodyModel[125] = new ModelRendererTurbo(this, 777, 234, textureX, textureY); // Box 184
		bodyModel[126] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 50

		bodyModel[0].addBox(0F, 0F, 0F, 52, 1, 14, 0F); // Box 105
		bodyModel[0].setRotationPoint(-35F, -15F, 8F);

		bodyModel[1].addBox(0F, 1F, 13F, 52, 2, 1, 0F); // Box 106
		bodyModel[1].setRotationPoint(-35F, -15F, 8F);

		bodyModel[2].addShapeBox(0F, 1F, 13F, 15, 2, 1, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[2].setRotationPoint(17F, -15F, 8F);

		bodyModel[3].addBox(0F, 0F, 0F, 13, 1, 8, 0F); // Box 111
		bodyModel[3].setRotationPoint(70F, -16F, 14F);

		bodyModel[4].addShapeBox(-10F, 0F, 0F, 10, 1, 8, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F); // Box 112
		bodyModel[4].setRotationPoint(70F, -16F, 14F);

		bodyModel[5].addBox(-19F, 0F, -36F, 28, 1, 44, 0F); // Box 0
		bodyModel[5].setRotationPoint(51F, -1F, 14F);

		bodyModel[6].addShapeBox(0F, -3.5F, -7F, 2, 2, 14, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[6].setRotationPoint(79F, -20F, 0F);

		bodyModel[7].addShapeBox(0F, -1.5F, -7F, 2, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(79F, -20F, 0F);

		bodyModel[8].addShapeBox(0F, 0.5F, -7F, 2, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[8].setRotationPoint(79F, -20F, 0F);

		bodyModel[9].addShapeBox(0F, 0.5F, 6F, 2, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[9].setRotationPoint(79F, -20F, 0F);

		bodyModel[10].addShapeBox(0F, 10.5F, -7F, 2, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 5
		bodyModel[10].setRotationPoint(79F, -16F, 0F);

		bodyModel[11].addShapeBox(0F, 12.5F, -7F, 2, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[11].setRotationPoint(79F, -20F, 0F);

		bodyModel[12].addShapeBox(0F, -4F, -10.5F, 20, 2, 21, 0F, 0F, 0F, -5F, 0F, -0.5F, -8.5F, 0F, -0.5F, -8.5F, 0F, 0F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, 0F); // Box 7
		bodyModel[12].setRotationPoint(59F, -20F, 0F);

		bodyModel[13].addShapeBox(0F, -1.5F, -10.5F, 20, 3, 21, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 8
		bodyModel[13].setRotationPoint(59F, -20F, 0F);

		bodyModel[14].addShapeBox(0F, 8.5F, -10.5F, 20, 5, 21, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(59F, -20F, 0F);

		bodyModel[15].addShapeBox(0F, 1.5F, -10.5F, 4, 7, 21, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F); // Box 1
		bodyModel[15].setRotationPoint(59F, -20F, 0F);

		bodyModel[16].addShapeBox(0F, 1.5F, -7.5F, 4, 7, 15, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F); // Box 3
		bodyModel[16].setRotationPoint(75F, -20F, 0F);

		bodyModel[17].addShapeBox(0F, 1.5F, -7.5F, 12, 7, 15, 0F, 0F, 0F, 1.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.6F); // Box 4
		bodyModel[17].setRotationPoint(63F, -20F, 0F);

		bodyModel[18].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.5F, 0F, -0.8F); // Box 5
		bodyModel[18].setRotationPoint(63F, -20F, 0F);

		bodyModel[19].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, -0.5F, 0F, -1F); // Box 6
		bodyModel[19].setRotationPoint(64F, -20F, 0F);

		bodyModel[20].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -1.2F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -0.5F, 0F, -1.2F, -0.5F, 0F, -1.2F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -0.5F, 0F, -1.2F); // Box 7
		bodyModel[20].setRotationPoint(65F, -20F, 0F);

		bodyModel[21].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -1.4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.4F, -0.5F, 0F, -1.4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.4F); // Box 8
		bodyModel[21].setRotationPoint(66F, -20F, 0F);

		bodyModel[22].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, -0.5F, 0F, -1.5F); // Box 9
		bodyModel[22].setRotationPoint(67F, -20F, 0F);

		bodyModel[23].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -1.7F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, -0.5F, 0F, -1.7F, -0.5F, 0F, -1.7F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, -0.5F, 0F, -1.7F); // Box 10
		bodyModel[23].setRotationPoint(68F, -20F, 0F);

		bodyModel[24].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -1.9F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -1.9F, -0.5F, 0F, -1.9F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -1.9F); // Box 11
		bodyModel[24].setRotationPoint(69F, -20F, 0F);

		bodyModel[25].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -2.1F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, -0.5F, 0F, -2.1F, -0.5F, 0F, -2.1F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, -0.5F, 0F, -2.1F); // Box 12
		bodyModel[25].setRotationPoint(70F, -20F, 0F);

		bodyModel[26].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -2.2F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, -0.5F, 0F, -2.2F, -0.5F, 0F, -2.2F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, -0.5F, 0F, -2.2F); // Box 13
		bodyModel[26].setRotationPoint(71F, -20F, 0F);

		bodyModel[27].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -2.4F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, -2.4F, -0.5F, 0F, -2.4F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, -2.4F); // Box 14
		bodyModel[27].setRotationPoint(72F, -20F, 0F);

		bodyModel[28].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -2.6F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, -0.5F, 0F, -2.6F, -0.5F, 0F, -2.6F, 0F, 0F, -2.7F, 0F, 0F, -2.8F, -0.5F, 0F, -2.6F); // Box 15
		bodyModel[28].setRotationPoint(73F, -20F, 0F);

		bodyModel[29].addShapeBox(0F, 1.5F, -10.5F, 1, 7, 21, 0F, -0.5F, 0F, -2.7F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, -0.5F, 0F, -2.7F, -0.5F, 0F, -2.7F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, -0.5F, 0F, -2.7F); // Box 16
		bodyModel[29].setRotationPoint(74F, -20F, 0F);

		bodyModel[30].addShapeBox(0F, -3F, -11.5F, 4, 2, 23, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 1F); // Box 17
		bodyModel[30].setRotationPoint(55F, -21F, 0F);

		bodyModel[31].addShapeBox(0F, -3.5F, -11.5F, 4, 21, 23, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F); // Box 18
		bodyModel[31].setRotationPoint(55F, -18F, 0F);

		bodyModel[32].addShapeBox(0F, -4.4F, -0.5F, 24, 2, 1, 0F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[32].setRotationPoint(55F, -20F, 0F);

		bodyModel[33].addShapeBox(0F, -4.5F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[33].setRotationPoint(79F, -20F, 0F);

		bodyModel[34].addShapeBox(0F, 11F, -16F, 1, 16, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[34].setRotationPoint(54F, -36F, 0F);

		bodyModel[35].addShapeBox(1F, 0F, 0F, 5, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // door
		bodyModel[35].setRotationPoint(34F, -24F, 15F);

		bodyModel[36].addShapeBox(0F, 6F, -31F, 1, 16, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[36].setRotationPoint(34F, -31F, 15F);

		bodyModel[37].addShapeBox(6F, 12F, 0.2F, 14, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // door
		bodyModel[37].setRotationPoint(34F, -36F, 15F);

		bodyModel[38].addShapeBox(7F, 11F, 0.1F, 19, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // door
		bodyModel[38].setRotationPoint(28F, -36F, 15F);

		bodyModel[39].addShapeBox(1F, 0F, 0F, 5, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // door
		bodyModel[39].setRotationPoint(34F, -24F, -16F);

		bodyModel[40].addShapeBox(7F, 11F, -0.1F, 19, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // door
		bodyModel[40].setRotationPoint(28F, -36F, -16F);

		bodyModel[41].addShapeBox(6F, 12F, -0.2F, 14, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // door
		bodyModel[41].setRotationPoint(34F, -36F, -16F);

		bodyModel[42].addShapeBox(-31F, 26F, -16F, 32, 8, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 161
		bodyModel[42].setRotationPoint(54F, -35F, 0F);

		bodyModel[43].addShapeBox(0F, 11F, -16F, 3, 4, 32, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[43].setRotationPoint(51F, -36F, 0F);

		bodyModel[44].addShapeBox(0F, 12F, 6F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[44].setRotationPoint(51F, -36F, 0F);

		bodyModel[45].addShapeBox(-14F, 21F, 2F, 9, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[45].setRotationPoint(54F, -35F, 0F);

		bodyModel[46].addShapeBox(-14F, 18F, 2F, 1, 3, 10, 0F, 2F, 0F, 2F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[46].setRotationPoint(54F, -35F, 0F);

		bodyModel[47].addShapeBox(-14F, 18F, 11F, 9, 3, 1, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[47].setRotationPoint(54F, -35F, 0F);

		bodyModel[48].addShapeBox(-14F, 18F, 2F, 9, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[48].setRotationPoint(54F, -35F, 0F);

		bodyModel[49].addShapeBox(-16F, 11F, 2F, 1, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[49].setRotationPoint(54F, -35F, 0F);

		bodyModel[50].addShapeBox(-16F, 9F, 2F, 1, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[50].setRotationPoint(54F, -35F, 0F);

		bodyModel[51].addShapeBox(-14F, 21F, -12F, 9, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[51].setRotationPoint(54F, -35F, 0F);

		bodyModel[52].addShapeBox(-14F, 18F, -3F, 9, 3, 1, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[52].setRotationPoint(54F, -35F, 0F);

		bodyModel[53].addShapeBox(-16F, 11F, -12F, 1, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[53].setRotationPoint(54F, -35F, 0F);

		bodyModel[54].addShapeBox(-16F, 9F, -12F, 1, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[54].setRotationPoint(54F, -35F, 0F);

		bodyModel[55].addShapeBox(-14F, 18F, -12F, 1, 3, 10, 0F, 2F, 0F, 2F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[55].setRotationPoint(54F, -35F, 0F);

		bodyModel[56].addShapeBox(-14F, 18F, -12F, 9, 3, 1, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[56].setRotationPoint(54F, -35F, 0F);

		bodyModel[57].addShapeBox(-2.5F, -2.5F, -8F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[57].setRotationPoint(76.5F, -0.5F, -9F);

		bodyModel[58].addShapeBox(-1.5F, 0.5F, -3F, 3, 3, 3, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[58].setRotationPoint(76.5F, -0.5F, -9F);

		bodyModel[59].addShapeBox(-1.5F, 0.5F, 1F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 197
		bodyModel[59].setRotationPoint(76.5F, -0.5F, 9F);

		bodyModel[60].addShapeBox(-2.5F, -2.5F, 4F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[60].setRotationPoint(76.5F, -0.5F, 9F);

		bodyModel[61].addShapeBox(-1.5F, 0.5F, -18F, 3, 3, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[61].setRotationPoint(76.5F, -0.5F, 9F);

		bodyModel[62].addShapeBox(-1F, -8.5F, -15.5F, 2, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[62].setRotationPoint(76.5F, -0.5F, 9F);

		bodyModel[63].addShapeBox(-1F, -8.5F, -4.5F, 2, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[63].setRotationPoint(76.5F, -0.5F, 9F);

		bodyModel[64].addShapeBox(7F, 14F, 0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[64].setRotationPoint(34F, -36F, 15F);

		bodyModel[65].addShapeBox(7F, 14F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[65].setRotationPoint(34F, -36F, -16F);

		bodyModel[66].addShapeBox(0F, 2.5F, -12.5F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[66].setRotationPoint(80F, -20F, 0F);

		bodyModel[67].addShapeBox(0F, 5.5F, -12.5F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 205
		bodyModel[67].setRotationPoint(80F, -20F, 0F);

		bodyModel[68].addShapeBox(0F, 1.5F, -12.5F, 3, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[68].setRotationPoint(80F, -20F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, -7F, 13, 1, 7, 0F, 0F, -9.5F, 0F, -2F, -9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.5F, 0F, -2F, 9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[69].setRotationPoint(70F, -16F, 14F);

		bodyModel[70].addShapeBox(-10F, 0F, -7F, 10, 1, 7, 0F, 0F, -15F, 0F, 0F, -9.5F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 9.5F, 0F, 0F, 0F, 0F, 0F, 15F, 0F); // Box 208
		bodyModel[70].setRotationPoint(70F, -16F, 14F);

		bodyModel[71].addShapeBox(0F, 1.5F, 7.5F, 3, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[71].setRotationPoint(80F, -20F, 0F);

		bodyModel[72].addShapeBox(0F, 2.5F, 7.5F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[72].setRotationPoint(80F, -20F, 0F);

		bodyModel[73].addShapeBox(0F, 5.5F, 7.5F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 211
		bodyModel[73].setRotationPoint(80F, -20F, 0F);

		bodyModel[74].addShapeBox(0.5F, 6.5F, -11F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[74].setRotationPoint(80F, -20F, 0F);

		bodyModel[75].addShapeBox(0.5F, 6.5F, 9F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[75].setRotationPoint(80F, -20F, 0F);

		bodyModel[76].addShapeBox(1F, 7.5F, -10F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[76].setRotationPoint(80F, -20F, 0F);

		bodyModel[77].addShapeBox(0F, 0.5F, -6F, 1, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[77].setRotationPoint(79F, -20F, 0F);

		bodyModel[78].addShapeBox(0F, 13.5F, -10.5F, 20, 6, 21, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -5F, -3.5F, 0F, -5F, -3.5F, 0F, -0.5F, 0F); // Box 216
		bodyModel[78].setRotationPoint(59F, -20F, 0F);

		bodyModel[79].addShapeBox(-10F, 0F, 0F, 10, 1, 8, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F); // Box 217
		bodyModel[79].setRotationPoint(70F, -16F, -22F);

		bodyModel[80].addBox(0F, 0F, 0F, 13, 1, 8, 0F); // Box 218
		bodyModel[80].setRotationPoint(70F, -16F, -22F);

		bodyModel[81].addShapeBox(0F, 0F, 7F, 13, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 9.5F, 0F, 0F, 9.5F, 0F); // Box 219
		bodyModel[81].setRotationPoint(70F, -16F, -21F);

		bodyModel[82].addShapeBox(-10F, 0F, 7F, 10, 1, 7, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F, 15F, 0F); // Box 220
		bodyModel[82].setRotationPoint(70F, -16F, -21F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 15, 1, 44, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[83].setRotationPoint(17F, -15F, -22F);

		bodyModel[84].addBox(0F, 0F, 0F, 52, 1, 14, 0F); // Box 222
		bodyModel[84].setRotationPoint(-35F, -15F, -22F);

		bodyModel[85].addBox(0F, 1F, -13F, 52, 2, 1, 0F); // Box 225
		bodyModel[85].setRotationPoint(-35F, -15F, -9F);

		bodyModel[86].addShapeBox(0F, 1F, -13F, 15, 2, 1, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[86].setRotationPoint(17F, -15F, -9F);

		bodyModel[87].addShapeBox(-2.5F, -2.5F, -2F, 5, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[87].setRotationPoint(-11.5F, 0F, -16F);

		bodyModel[88].addShapeBox(-1.5F, -1.5F, -15F, 3, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[88].setRotationPoint(-11.5F, 0F, 9F);

		bodyModel[89].addShapeBox(-2.5F, -2.5F, -3F, 5, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[89].setRotationPoint(-11.5F, 0F, 9F);

		bodyModel[90].addShapeBox(-1.5F, -1.5F, -15F, 3, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[90].setRotationPoint(11.5F, 0F, 9F);

		bodyModel[91].addShapeBox(-2.5F, -2.5F, -3F, 5, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[91].setRotationPoint(11.5F, 0F, 9F);

		bodyModel[92].addShapeBox(-2.5F, -2.5F, -2F, 5, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[92].setRotationPoint(11.5F, 0F, -16F);

		bodyModel[93].addShapeBox(-2.5F, -2.5F, -2.5F, 48, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[93].setRotationPoint(-11.5F, 0F, 0F);

		bodyModel[94].addShapeBox(-31F, 24F, -8F, 52, 9, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[94].setRotationPoint(-4F, -39F, 0F);

		bodyModel[95].addShapeBox(2F, 28F, -8F, 17, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[95].setRotationPoint(15F, -39F, 0F);

		bodyModel[96].addBox(1F, -1F, 0F, 3, 11, 9, 0F); // Box 248
		bodyModel[96].setRotationPoint(30F, -23F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 1F, 1, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 249
		bodyModel[97].setRotationPoint(30F, -23F, 6F);

		bodyModel[98].addShapeBox(0F, 5F, 1F, 1, 3, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[98].setRotationPoint(30F, -22F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 1F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 251
		bodyModel[99].setRotationPoint(30F, -22F, 6F);

		bodyModel[100].addShapeBox(0F, 0F, 5F, 1, 7, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[100].setRotationPoint(30F, -22F, 6F);

		bodyModel[101].addBox(0F, -1F, 0F, 1, 1, 9, 0F); // Box 253
		bodyModel[101].setRotationPoint(30F, -23F, 6F);

		bodyModel[102].addBox(0F, 9F, 0F, 1, 1, 9, 0F); // Box 254
		bodyModel[102].setRotationPoint(30F, -23F, 6F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 255
		bodyModel[103].setRotationPoint(30F, -23F, 6F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 256
		bodyModel[104].setRotationPoint(30F, -23F, 14F);

		bodyModel[105].addShapeBox(0F, -3F, 0F, 4, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[105].setRotationPoint(30F, -23F, 6F);

		bodyModel[106].addBox(0F, -3F, 0F, 1, 1, 3, 0F); // Box 260
		bodyModel[106].setRotationPoint(30F, -23F, 8F);

		bodyModel[107].addBox(3F, -3F, 0F, 1, 1, 3, 0F); // Box 262
		bodyModel[107].setRotationPoint(30F, -23F, 8F);

		bodyModel[108].addBox(1.5F, -3F, 0F, 1, 1, 3, 0F); // Box 263
		bodyModel[108].setRotationPoint(30F, -23F, 8F);

		bodyModel[109].addShapeBox(0F, -3F, 4F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[109].setRotationPoint(30F, -23F, 7F);

		bodyModel[110].addShapeBox(1F, -2.5F, 5.5F, 2, 2, 2, 0F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 265
		bodyModel[110].setRotationPoint(30F, -23F, 7F);

		bodyModel[111].addBox(0F, 10F, -1F, 5, 1, 11, 0F); // Box 266
		bodyModel[111].setRotationPoint(29F, -23F, 6F);

		bodyModel[112].addBox(0F, 8F, -1F, 1, 2, 11, 0F); // Box 267
		bodyModel[112].setRotationPoint(29F, -23F, 6F);

		bodyModel[113].addBox(1F, 8F, -1F, 4, 2, 1, 0F); // Box 268
		bodyModel[113].setRotationPoint(29F, -23F, 6F);

		bodyModel[114].addBox(1F, 8F, 9F, 4, 2, 1, 0F); // Box 269
		bodyModel[114].setRotationPoint(29F, -23F, 6F);

		bodyModel[115].addBox(0F, 5F, 9F, 2, 3, 1, 0F); // Box 270
		bodyModel[115].setRotationPoint(29F, -23F, 6F);

		bodyModel[116].addBox(0F, 5F, -1F, 2, 3, 1, 0F); // Box 271
		bodyModel[116].setRotationPoint(29F, -23F, 6F);

		bodyModel[117].addBox(0F, 5F, 0F, 1, 3, 1, 0F); // Box 272
		bodyModel[117].setRotationPoint(29F, -23F, 6F);

		bodyModel[118].addBox(0F, 5F, 8F, 1, 3, 1, 0F); // Box 273
		bodyModel[118].setRotationPoint(29F, -23F, 6F);

		bodyModel[119].addShapeBox(-2.5F, -2.5F, -2.5F, 5, 5, 2, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 16
		bodyModel[119].setRotationPoint(-11.5F, -5F, 0F);

		bodyModel[120].addShapeBox(-2.5F, -2.5F, 0.5F, 5, 5, 2, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 17
		bodyModel[120].setRotationPoint(-11.5F, -5F, 0F);

		bodyModel[121].addShapeBox(0F, 1F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[121].setRotationPoint(54F, -36F, -0.5F);

		bodyModel[122].addShapeBox(0F, 10F, -15F, 1, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[122].setRotationPoint(54F, -36F, 0F);

		bodyModel[123].addShapeBox(19F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // door
		bodyModel[123].setRotationPoint(35F, -35F, 15F);

		bodyModel[124].addShapeBox(19F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // door
		bodyModel[124].setRotationPoint(35F, -35F, -16F);

		bodyModel[125].addShapeBox(0F, -1F, -15F, 1, 1, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[125].setRotationPoint(54F, -35F, -1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[126].setRotationPoint(-6F, -16F, -5.5F);


		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 0, 168, textureX, textureY); // Box 11
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 0, 168, textureX, textureY); // Box 15

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 52, 1, 14, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 11
		bodyDoorOpenModel[0].setRotationPoint(-35F, -15F, 22F);
		bodyDoorOpenModel[0].rotateAngleX = -0.17453293F;

		bodyDoorOpenModel[1].addShapeBox(0F, -1F, 0F, 52, 1, 14, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 15
		bodyDoorOpenModel[1].setRotationPoint(-35F, -15F, -22F);
		bodyDoorOpenModel[1].rotateAngleX = -2.96705973F;


		bodyDoorCloseModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 0, 168, textureX, textureY); // Box 12
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 0, 168, textureX, textureY); // Box 14

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 52, 1, 14, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 12
		bodyDoorCloseModel[0].setRotationPoint(-35F, -15F, 22F);
		bodyDoorCloseModel[0].rotateAngleX = -1.23918377F;

		bodyDoorCloseModel[1].addShapeBox(0F, -1F, 0F, 52, 1, 14, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 14
		bodyDoorCloseModel[1].setRotationPoint(-35F, -15F, -22F);
		bodyDoorCloseModel[1].rotateAngleX = -1.91986218F;


		turretModel = new ModelRendererTurbo[34];
		turretModel[0] = new ModelRendererTurbo(this, 0, 221, textureX, textureY); // Box 20
		turretModel[1] = new ModelRendererTurbo(this, 0, 217, textureX, textureY); // Box 20
		turretModel[2] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 20
		turretModel[3] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 20
		turretModel[4] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 20
		turretModel[5] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 0
		turretModel[6] = new ModelRendererTurbo(this, 82, 221, textureX, textureY); // Box 1
		turretModel[7] = new ModelRendererTurbo(this, 82, 0, textureX, textureY); // Box 3
		turretModel[8] = new ModelRendererTurbo(this, 0, 217, textureX, textureY); // Box 0
		turretModel[9] = new ModelRendererTurbo(this, 82, 221, textureX, textureY); // Box 1
		turretModel[10] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 24
		turretModel[11] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 25
		turretModel[12] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 26
		turretModel[13] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 27
		turretModel[14] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 28
		turretModel[15] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 29
		turretModel[16] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 30
		turretModel[17] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 31
		turretModel[18] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 32
		turretModel[19] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 33
		turretModel[20] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 34
		turretModel[21] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 35
		turretModel[22] = new ModelRendererTurbo(this, 33, 262, textureX, textureY); // Box 0
		turretModel[23] = new ModelRendererTurbo(this, 0, 264, textureX, textureY); // Box 1
		turretModel[24] = new ModelRendererTurbo(this, 0, 289, textureX, textureY); // Box 3
		turretModel[25] = new ModelRendererTurbo(this, 29, 289, textureX, textureY); // Box 4
		turretModel[26] = new ModelRendererTurbo(this, 29, 289, textureX, textureY); // Box 42
		turretModel[27] = new ModelRendererTurbo(this, 0, 289, textureX, textureY); // Box 43
		turretModel[28] = new ModelRendererTurbo(this, 0, 289, textureX, textureY); // Box 44
		turretModel[29] = new ModelRendererTurbo(this, 0, 289, textureX, textureY); // Box 45
		turretModel[30] = new ModelRendererTurbo(this, 33, 262, textureX, textureY); // Box 46
		turretModel[31] = new ModelRendererTurbo(this, 29, 289, textureX, textureY); // Box 47
		turretModel[32] = new ModelRendererTurbo(this, 29, 289, textureX, textureY); // Box 48
		turretModel[33] = new ModelRendererTurbo(this, 0, 264, textureX, textureY); // Box 49

		turretModel[0].addShapeBox(-7F, 0F, -18F, 13, 1, 36, 0F, 0F, 0F, -4F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -4F); // Box 20
		turretModel[0].setRotationPoint(0F, -18F, 0F);

		turretModel[1].addShapeBox(-7F, -26F, -18F, 11, 24, 1, 0F, 0F, 0F, -4F, 0F, -6F, -8F, 0F, -6F, 8F, 0F, 0F, 4F, 0F, 0F, -4F, 2F, 0F, -12F, 2F, 0F, 12F, 0F, 0F, 4F); // Box 20
		turretModel[1].setRotationPoint(0F, -18F, 0F);

		turretModel[2].addShapeBox(3F, -20F, -9F, 1, 18, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 20
		turretModel[2].setRotationPoint(0F, -18F, 0F);

		turretModel[3].addShapeBox(-7F, -26F, -18F, 11, 1, 36, 0F, 0F, 0F, -4F, 0F, -6F, -8F, 0F, -6F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 6F, -8F, 0F, 6F, -8F, 0F, 0F, -4F); // Box 20
		turretModel[3].setRotationPoint(0F, -18F, 0F);

		turretModel[4].addShapeBox(3F, -20F, 3F, 1, 18, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, -2F, 0F, -4F); // Box 20
		turretModel[4].setRotationPoint(0F, -18F, 0F);

		turretModel[5].addShapeBox(3F, -22F, -3F, 1, 20, 7, 0F, -1.25F, -14F, -1F, 1.25F, -14F, -1F, 1.25F, -14F, -1F, -1.25F, -14F, -1F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, -1F); // Box 0
		turretModel[5].setRotationPoint(0F, -18F, 0F);

		turretModel[6].addShapeBox(-7F, -2F, -18F, 13, 2, 1, 0F, 0F, 0F, -4F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 4F); // Box 1
		turretModel[6].setRotationPoint(0F, -18F, 0F);

		turretModel[7].addShapeBox(5F, -2F, -6F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[7].setRotationPoint(0F, -18F, 0F);

		turretModel[8].addShapeBox(-7F, -26F, 17F, 11, 24, 1, 0F, 0F, 0F, 4F, 0F, -6F, 8F, 0F, -6F, -8F, 0F, 0F, -4F, 0F, 0F, 4F, 2F, 0F, 12F, 2F, 0F, -12F, 0F, 0F, -4F); // Box 0
		turretModel[8].setRotationPoint(0F, -18F, 0F);

		turretModel[9].addShapeBox(-7F, -2F, 17F, 13, 2, 1, 0F, 0F, 0F, 4F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, -4F); // Box 1
		turretModel[9].setRotationPoint(0F, -18F, 0F);

		turretModel[10].addShapeBox(-1F, -14.8F, 2.2F, 2, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		turretModel[10].setRotationPoint(0F, -18F, 0F);

		turretModel[11].addShapeBox(-1F, -14.8F, -3.8F, 2, 2, 8, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 25
		turretModel[11].setRotationPoint(0F, -18F, 0F);

		turretModel[12].addShapeBox(-1F, -14.8F, -3.2F, 2, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[12].setRotationPoint(0F, -18F, 0F);

		turretModel[13].addShapeBox(-2F, -7.8F, -2.8F, 4, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 1F, 2F, 1F, 1F, 2F, 1F, 1F, 2F, 1F, 1F); // Box 27
		turretModel[13].setRotationPoint(0F, -18F, 0F);

		turretModel[14].addShapeBox(-17F, -6.8F, 2.2F, 5, 1, 10, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 28
		turretModel[14].setRotationPoint(0F, -18F, 0F);

		turretModel[15].addShapeBox(-19F, -6.8F, -12.8F, 5, 1, 10, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 29
		turretModel[15].setRotationPoint(0F, -18F, 0F);

		turretModel[16].addShapeBox(-2F, -4.8F, 2.2F, 1, 1, 8, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 30
		turretModel[16].setRotationPoint(0F, -18F, 0F);

		turretModel[17].addShapeBox(-2F, -4.8F, -10.2F, 1, 1, 8, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 31
		turretModel[17].setRotationPoint(0F, -18F, 0F);

		turretModel[18].addShapeBox(-14F, -4.8F, 7F, 12, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 32
		turretModel[18].setRotationPoint(0F, -18F, 0F);

		turretModel[19].addShapeBox(-19F, -4.8F, 7F, 5, 1, 1, 0F, -2F, 1.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, 1.8F, 0F, -1F, -2.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -2.8F, 0F); // Box 33
		turretModel[19].setRotationPoint(0F, -18F, 0F);

		turretModel[20].addShapeBox(-19F, -4.8F, -9F, 5, 1, 1, 0F, -2F, 1.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, 1.8F, 0F, -1F, -2.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -2.8F, 0F); // Box 34
		turretModel[20].setRotationPoint(0F, -18F, 0F);

		turretModel[21].addShapeBox(-14F, -4.8F, -9F, 12, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35
		turretModel[21].setRotationPoint(0F, -18F, 0F);

		turretModel[22].addBox(-20F, -58F, -11F, 8, 8, 8, 0F); // Box 0
		turretModel[22].setRotationPoint(0F, 12F, 0F);

		turretModel[23].addBox(-18F, -50F, -11F, 4, 12, 8, 0F); // Box 1
		turretModel[23].setRotationPoint(0F, 12F, 0F);

		turretModel[24].addBox(6F, -52F, -3F, 4, 12, 4, 0F); // Box 3
		turretModel[24].setRotationPoint(0F, 12F, 0F);
		turretModel[24].rotateAngleZ = 0.48869219F;

		turretModel[25].addBox(27F, -30F, -14F, 4, 12, 4, 0F); // Box 4
		turretModel[25].setRotationPoint(0F, 12F, 0F);
		turretModel[25].rotateAngleY = -0.20943951F;
		turretModel[25].rotateAngleZ = 1.13446401F;

		turretModel[26].addBox(26F, -32F, -4F, 4, 12, 4, 0F); // Box 42
		turretModel[26].setRotationPoint(0F, 12F, 0F);
		turretModel[26].rotateAngleY = 0.20943951F;
		turretModel[26].rotateAngleZ = 1.13446401F;

		turretModel[27].addBox(6F, -52F, -15F, 4, 12, 4, 0F); // Box 43
		turretModel[27].setRotationPoint(0F, 12F, 0F);
		turretModel[27].rotateAngleZ = 0.48869219F;

		turretModel[28].addBox(6F, -52F, 9F, 4, 12, 4, 0F); // Box 44
		turretModel[28].setRotationPoint(0F, 12F, 0F);
		turretModel[28].rotateAngleY = -0.33161256F;
		turretModel[28].rotateAngleZ = 0.48869219F;

		turretModel[29].addBox(6F, -52F, -3F, 4, 12, 4, 0F); // Box 45
		turretModel[29].setRotationPoint(0F, 12F, 0F);
		turretModel[29].rotateAngleY = -0.33161256F;
		turretModel[29].rotateAngleZ = 0.48869219F;

		turretModel[30].addBox(-20F, -58F, 1F, 8, 8, 8, 0F); // Box 46
		turretModel[30].setRotationPoint(0F, 12F, 0F);
		turretModel[30].rotateAngleY = -0.33161256F;

		turretModel[31].addBox(26F, -31F, 4F, 4, 12, 4, 0F); // Box 47
		turretModel[31].setRotationPoint(0F, 12F, 0F);
		turretModel[31].rotateAngleY = -0.38397244F;
		turretModel[31].rotateAngleZ = 1.13446401F;

		turretModel[32].addBox(25F, -31F, -3F, 4, 12, 4, 0F); // Box 48
		turretModel[32].setRotationPoint(0F, 12F, 0F);
		turretModel[32].rotateAngleY = -0.54105207F;
		turretModel[32].rotateAngleZ = 1.13446401F;

		turretModel[33].addBox(-18F, -50F, 1F, 4, 12, 8, 0F); // Box 49
		turretModel[33].setRotationPoint(0F, 12F, 0F);
		turretModel[33].rotateAngleY = -0.33161256F;


		barrelModel = new ModelRendererTurbo[15];
		barrelModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 7
		barrelModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		barrelModel[2] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 10
		barrelModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		barrelModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 13
		barrelModel[5] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 14
		barrelModel[6] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 15
		barrelModel[7] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 16
		barrelModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 17
		barrelModel[9] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 18
		barrelModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 19
		barrelModel[11] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 20
		barrelModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 21
		barrelModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 22
		barrelModel[14] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 23

		barrelModel[0].addShapeBox(8F, -6F, -2.5F, 1, 12, 5, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 7
		barrelModel[0].setRotationPoint(0F, -31F, 0F);
		barrelModel[0].rotateAngleZ = 0.10471976F;

		barrelModel[1].addShapeBox(0F, -4F, -2.5F, 10, 5, 5, 0F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 9
		barrelModel[1].setRotationPoint(0F, -31F, 0F);

		barrelModel[2].addShapeBox(10F, -3.5F, -2F, 10, 4, 4, 0F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 10
		barrelModel[2].setRotationPoint(0F, -31F, 0F);

		barrelModel[3].addShapeBox(20F, -3.5F, -2F, 1, 4, 4, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 11
		barrelModel[3].setRotationPoint(0F, -31F, 0F);

		barrelModel[4].addShapeBox(-8F, 1F, -1F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[4].setRotationPoint(0F, -31F, 0F);

		barrelModel[5].addShapeBox(-8F, 2.2F, -1F, 25, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 14
		barrelModel[5].setRotationPoint(0F, -31F, 0F);

		barrelModel[6].addShapeBox(-6F, -4F, -2.5F, 6, 5, 5, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 15
		barrelModel[6].setRotationPoint(0F, -31F, 0F);

		barrelModel[7].addShapeBox(-7F, -4F, -2.5F, 1, 5, 5, 0F, 0F, -1F, -1F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -1F, -1F); // Box 16
		barrelModel[7].setRotationPoint(0F, -31F, 0F);

		barrelModel[8].addShapeBox(-13F, 0F, -2.5F, 7, 1, 5, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 17
		barrelModel[8].setRotationPoint(0F, -31F, 0F);

		barrelModel[9].addShapeBox(-12F, -4F, 2.5F, 9, 5, 2, 0F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F); // Box 18
		barrelModel[9].setRotationPoint(0F, -31F, 0F);

		barrelModel[10].addShapeBox(-3F, -4F, 2.5F, 2, 5, 2, 0F, 0F, -0.75F, -0.6F, 0F, -0.75F, 1.4F, 0F, -0.75F, -2.6F, 0F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, 0F, -0.75F, 1.4F, 0F, -0.75F, -2.6F, 0F, -0.75F, -0.6F); // Box 19
		barrelModel[10].setRotationPoint(0F, -31F, 0F);

		barrelModel[11].addShapeBox(-5F, 0F, -2F, 2, 3, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 20
		barrelModel[11].setRotationPoint(0F, -31F, 0F);

		barrelModel[12].addShapeBox(-5F, 0F, 1F, 2, 3, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 21
		barrelModel[12].setRotationPoint(0F, -31F, 0F);

		barrelModel[13].addShapeBox(2F, 0F, 1F, 2, 3, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 22
		barrelModel[13].setRotationPoint(0F, -31F, 0F);

		barrelModel[14].addShapeBox(2F, 0F, -2F, 2, 3, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 23
		barrelModel[14].setRotationPoint(0F, -31F, 0F);


		leftFrontWheelModel = new ModelRendererTurbo[1];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 4

		leftFrontWheelModel[0].addShape3D(11F, -10F, -7F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 8, 21, 20, 72, 8, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 4
		leftFrontWheelModel[0].setRotationPoint(76.5F, 0F, 15F);


		rightFrontWheelModel = new ModelRendererTurbo[1];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 5

		rightFrontWheelModel[0].addShape3D(11F, -10F, 0F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 8, 21, 20, 72, 8, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 5
		rightFrontWheelModel[0].setRotationPoint(76.5F, 0F, -13F);


		backWheelModel = new ModelRendererTurbo[8];
		backWheelModel[0] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 32
		backWheelModel[1] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 32
		backWheelModel[2] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 32
		backWheelModel[3] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 6
		backWheelModel[4] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 7
		backWheelModel[5] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 8
		backWheelModel[6] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 9
		backWheelModel[7] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Shape 10

		backWheelModel[0].addShape3D(11F, -10F, 0F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 5, 21, 20, 72, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 32
		backWheelModel[0].setRotationPoint(-11.5F, 0F, -11F);

		backWheelModel[1].addShape3D(11F, -10F, -11F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 5, 21, 20, 72, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 32
		backWheelModel[1].setRotationPoint(-11.5F, 0F, 11F);

		backWheelModel[2].addShape3D(11F, -10F, -11F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 5, 21, 20, 72, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 32
		backWheelModel[2].setRotationPoint(11.5F, 0F, 11F);

		backWheelModel[3].addShape3D(11F, -10F, -5F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 5, 21, 20, 72, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 6
		backWheelModel[3].setRotationPoint(-11.5F, 0F, 11F);

		backWheelModel[4].addShape3D(11F, -10F, -5F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 5, 21, 20, 72, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 7
		backWheelModel[4].setRotationPoint(11.5F, 0F, 11F);

		backWheelModel[5].addShape3D(11F, -10F, 6F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 5, 21, 20, 72, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 8
		backWheelModel[5].setRotationPoint(-11.5F, 0F, -11F);

		backWheelModel[6].addShape3D(11F, -10F, 0F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 5, 21, 20, 72, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 9
		backWheelModel[6].setRotationPoint(11.5F, 0F, -11F);

		backWheelModel[7].addShape3D(11F, -10F, 6F, new Shape2D(new Coord2D[]{new Coord2D(5, 0, 5, 0), new Coord2D(17, 0, 17, 0), new Coord2D(21, 4, 21, 4), new Coord2D(21, 16, 21, 16), new Coord2D(17, 20, 17, 20), new Coord2D(5, 20, 5, 20), new Coord2D(1, 16, 1, 16), new Coord2D(1, 4, 1, 4)}), 5, 21, 20, 72, 5, ModelRendererTurbo.MR_FRONT, new float[]{6, 12, 6, 12, 6, 12, 6, 12}); // Shape 10
		backWheelModel[7].setRotationPoint(11.5F, 0F, -11F);


		steeringWheelModel = new ModelRendererTurbo[8];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 164
		steeringWheelModel[1] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 165
		steeringWheelModel[2] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 166
		steeringWheelModel[3] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 167
		steeringWheelModel[4] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 168
		steeringWheelModel[5] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 169
		steeringWheelModel[6] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 170
		steeringWheelModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 171

		steeringWheelModel[0].addShapeBox(-2F, -0.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		steeringWheelModel[0].setRotationPoint(51F, -23F, 7F);
		steeringWheelModel[0].rotateAngleZ = -0.17453293F;

		steeringWheelModel[1].addShapeBox(-2F, -4.5F, -3.5F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		steeringWheelModel[1].setRotationPoint(51F, -23F, 7F);
		steeringWheelModel[1].rotateAngleZ = -0.17453293F;

		steeringWheelModel[2].addShapeBox(-2F, -3.5F, -4.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		steeringWheelModel[2].setRotationPoint(51F, -23F, 7F);
		steeringWheelModel[2].rotateAngleZ = -0.17453293F;

		steeringWheelModel[3].addShapeBox(-2F, -3.5F, 3.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		steeringWheelModel[3].setRotationPoint(51F, -23F, 7F);
		steeringWheelModel[3].rotateAngleZ = -0.17453293F;

		steeringWheelModel[4].addShapeBox(-2F, 3.5F, -3.5F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		steeringWheelModel[4].setRotationPoint(51F, -23F, 7F);
		steeringWheelModel[4].rotateAngleZ = -0.17453293F;

		steeringWheelModel[5].addShapeBox(-2F, -0.5F, -3.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		steeringWheelModel[5].setRotationPoint(51F, -23F, 7F);
		steeringWheelModel[5].rotateAngleZ = -0.17453293F;

		steeringWheelModel[6].addShapeBox(-2F, -0.5F, 0.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		steeringWheelModel[6].setRotationPoint(51F, -23F, 7F);
		steeringWheelModel[6].rotateAngleZ = -0.17453293F;

		steeringWheelModel[7].addShapeBox(-2F, 0.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		steeringWheelModel[7].setRotationPoint(51F, -23F, 7F);
		steeringWheelModel[7].rotateAngleZ = -0.17453293F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
