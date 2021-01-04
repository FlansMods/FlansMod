//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:15.02.2016 - 10:40:46
// Last changed on: 15.02.2016 - 10:40:46

package com.flansmod.ww2.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAmmoBag extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelAmmoBag()
	{
		ammobagModel = new ModelRendererTurbo[98];
		ammobagModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 57
		ammobagModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 62
		ammobagModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 63
		ammobagModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 64
		ammobagModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 65
		ammobagModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 66
		ammobagModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 67
		ammobagModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 68
		ammobagModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 69
		ammobagModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 70
		ammobagModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 71
		ammobagModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 72
		ammobagModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 73
		ammobagModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 74
		ammobagModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 75
		ammobagModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 76
		ammobagModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 77
		ammobagModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 78
		ammobagModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 79
		ammobagModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 80
		ammobagModel[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 81
		ammobagModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 82
		ammobagModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 83
		ammobagModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 84
		ammobagModel[24] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 18
		ammobagModel[25] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 23
		ammobagModel[26] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 24
		ammobagModel[27] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 25
		ammobagModel[28] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 27
		ammobagModel[29] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 28
		ammobagModel[30] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 29
		ammobagModel[31] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 30
		ammobagModel[32] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 31
		ammobagModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 32
		ammobagModel[34] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 33
		ammobagModel[35] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 34
		ammobagModel[36] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 35
		ammobagModel[37] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 36
		ammobagModel[38] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 37
		ammobagModel[39] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 39
		ammobagModel[40] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 40
		ammobagModel[41] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 47
		ammobagModel[42] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 48
		ammobagModel[43] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 49
		ammobagModel[44] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 50
		ammobagModel[45] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 52
		ammobagModel[46] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 53
		ammobagModel[47] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 54
		ammobagModel[48] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 55
		ammobagModel[49] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 133
		ammobagModel[50] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 131
		ammobagModel[51] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 132
		ammobagModel[52] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 133
		ammobagModel[53] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 134
		ammobagModel[54] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 135
		ammobagModel[55] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 136
		ammobagModel[56] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 137
		ammobagModel[57] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 138
		ammobagModel[58] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 139
		ammobagModel[59] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 140
		ammobagModel[60] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 141
		ammobagModel[61] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 142
		ammobagModel[62] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 143
		ammobagModel[63] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 144
		ammobagModel[64] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 145
		ammobagModel[65] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 146
		ammobagModel[66] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 147
		ammobagModel[67] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 148
		ammobagModel[68] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 149
		ammobagModel[69] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 150
		ammobagModel[70] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 151
		ammobagModel[71] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 152
		ammobagModel[72] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 153
		ammobagModel[73] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 154
		ammobagModel[74] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 155
		ammobagModel[75] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 156
		ammobagModel[76] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 157
		ammobagModel[77] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 158
		ammobagModel[78] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 159
		ammobagModel[79] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 160
		ammobagModel[80] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 161
		ammobagModel[81] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 162
		ammobagModel[82] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 163
		ammobagModel[83] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 164
		ammobagModel[84] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 165
		ammobagModel[85] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 166
		ammobagModel[86] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 193
		ammobagModel[87] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 194
		ammobagModel[88] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 195
		ammobagModel[89] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 196
		ammobagModel[90] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 197
		ammobagModel[91] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 198
		ammobagModel[92] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 199
		ammobagModel[93] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 200
		ammobagModel[94] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 201
		ammobagModel[95] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 202
		ammobagModel[96] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 203
		ammobagModel[97] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 204

		ammobagModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		ammobagModel[0].setRotationPoint(-7F, -1F, -3F);

		ammobagModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 62
		ammobagModel[1].setRotationPoint(-7F, -4F, -3F);

		ammobagModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 63
		ammobagModel[2].setRotationPoint(-7F, -4F, 4F);

		ammobagModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		ammobagModel[3].setRotationPoint(-2F, -1F, -3F);

		ammobagModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 65
		ammobagModel[4].setRotationPoint(-2F, -4F, -3F);

		ammobagModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 66
		ammobagModel[5].setRotationPoint(-2F, -4F, 4F);

		ammobagModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		ammobagModel[6].setRotationPoint(-8F, -4F, -3F);

		ammobagModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		ammobagModel[7].setRotationPoint(-8F, -1F, -3F);

		ammobagModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		ammobagModel[8].setRotationPoint(1F, -4F, -3F);

		ammobagModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		ammobagModel[9].setRotationPoint(1F, -1F, -3F);

		ammobagModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		ammobagModel[10].setRotationPoint(-1.25F, -5.75F, -1F);
		ammobagModel[10].rotateAngleZ = -0.36651914F;

		ammobagModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -1F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		ammobagModel[11].setRotationPoint(-1.25F, -5.75F, -2F);
		ammobagModel[11].rotateAngleZ = -0.36651914F;

		ammobagModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -1F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 73
		ammobagModel[12].setRotationPoint(-1.25F, -5.75F, 3F);
		ammobagModel[12].rotateAngleZ = -0.36651914F;

		ammobagModel[13].addShapeBox(0.5F, -0.2F, 1.5F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		ammobagModel[13].setRotationPoint(-1.25F, -5.75F, -1F);
		ammobagModel[13].rotateAngleZ = -0.36651914F;

		ammobagModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		ammobagModel[14].setRotationPoint(-8F, -1F, -6F);

		ammobagModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 76
		ammobagModel[15].setRotationPoint(-3F, -1F, -6F);

		ammobagModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.9F, 0F, 0F, 0.9F, 0F, 0F); // Box 77
		ammobagModel[16].setRotationPoint(-4F, -1F, -6.3F);

		ammobagModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 78
		ammobagModel[17].setRotationPoint(-8F, -1F, 5F);

		ammobagModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		ammobagModel[18].setRotationPoint(-2F, -1F, 5F);

		ammobagModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 80
		ammobagModel[19].setRotationPoint(-4F, -1F, 7.3F);

		ammobagModel[20].addShapeBox(0F, 0F, 0F, 20, 1, 21, 0F, -8.5F, -0.6F, -8.5F, -8.5F, -0.6F, -8.5F, -8.5F, -0.6F, -8.5F, -8.5F, -0.6F, -8.5F, -8.5F, 0F, -8.5F, -8.5F, 0F, -8.5F, -8.5F, 0F, -8.5F, -8.5F, 0F, -8.5F); // Box 81
		ammobagModel[20].setRotationPoint(-16F, -4.75F, -9.5F);

		ammobagModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.6F, -1F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		ammobagModel[21].setRotationPoint(-7.5F, -4.75F, -2F);

		ammobagModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 83
		ammobagModel[22].setRotationPoint(-7.5F, -4.75F, 3F);

		ammobagModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		ammobagModel[23].setRotationPoint(-4.5F, -4.75F, -2F);

		ammobagModel[24].addShapeBox(2F, -4.5F, 1.1F, 6, 6, 8, 0F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 18
		ammobagModel[24].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[24].rotateAngleX = -0.06981317F;
		ammobagModel[24].rotateAngleY = -0.26179939F;
		ammobagModel[24].rotateAngleZ = -0.03490659F;

		ammobagModel[25].addShapeBox(0.7F, -4.5F, -1.5F, 6, 6, 9, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 23
		ammobagModel[25].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[25].rotateAngleX = -0.06981317F;
		ammobagModel[25].rotateAngleY = -0.26179939F;
		ammobagModel[25].rotateAngleZ = -0.03490659F;

		ammobagModel[26].addShapeBox(-0.9F, -4.5F, -1.5F, 6, 6, 9, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 24
		ammobagModel[26].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[26].rotateAngleX = -0.06981317F;
		ammobagModel[26].rotateAngleY = -0.26179939F;
		ammobagModel[26].rotateAngleZ = -0.03490659F;

		ammobagModel[27].addShapeBox(2F, -4.5F, -2.9F, 6, 6, 8, 0F, 0F, -2F, -3.9F, -4.2F, -2F, -3.9F, -4.2F, -2F, -3.9F, 0F, -2F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 25
		ammobagModel[27].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[27].rotateAngleX = -0.06981317F;
		ammobagModel[27].rotateAngleY = -0.26179939F;
		ammobagModel[27].rotateAngleZ = -0.03490659F;

		ammobagModel[28].addShapeBox(2F, -3.5F, -1.4F, 6, 5, 9, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 27
		ammobagModel[28].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[28].rotateAngleX = -0.06981317F;
		ammobagModel[28].rotateAngleY = -0.26179939F;
		ammobagModel[28].rotateAngleZ = -0.03490659F;

		ammobagModel[29].addShapeBox(0.7F, -3.45F, -2.1F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 28
		ammobagModel[29].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[29].rotateAngleX = -0.15707963F;
		ammobagModel[29].rotateAngleY = -0.26179939F;
		ammobagModel[29].rotateAngleZ = -0.03490659F;

		ammobagModel[30].addShapeBox(-0.9F, -3.45F, -2.1F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 29
		ammobagModel[30].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[30].rotateAngleX = -0.15707963F;
		ammobagModel[30].rotateAngleY = -0.26179939F;
		ammobagModel[30].rotateAngleZ = -0.03490659F;

		ammobagModel[31].addShapeBox(2F, -5.75F, -1.4F, 6, 5, 9, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 30
		ammobagModel[31].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[31].rotateAngleX = -0.06981317F;
		ammobagModel[31].rotateAngleY = -0.26179939F;
		ammobagModel[31].rotateAngleZ = -0.03490659F;

		ammobagModel[32].addShapeBox(0.39F, -7.3F, -1.4F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 31
		ammobagModel[32].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[32].rotateAngleX = -0.26179939F;
		ammobagModel[32].rotateAngleY = -0.26179939F;
		ammobagModel[32].rotateAngleZ = -0.03490659F;

		ammobagModel[33].addShapeBox(0.39F, -7.3F, -1F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 32
		ammobagModel[33].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[33].rotateAngleX = -0.26179939F;
		ammobagModel[33].rotateAngleY = -0.26179939F;
		ammobagModel[33].rotateAngleZ = -0.03490659F;

		ammobagModel[34].addShapeBox(0.39F, -7.3F, -1.8F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 33
		ammobagModel[34].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[34].rotateAngleX = -0.26179939F;
		ammobagModel[34].rotateAngleY = -0.26179939F;
		ammobagModel[34].rotateAngleZ = -0.03490659F;

		ammobagModel[35].addShapeBox(0.39F, -7.3F, -2.2F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 34
		ammobagModel[35].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[35].rotateAngleX = -0.26179939F;
		ammobagModel[35].rotateAngleY = -0.26179939F;
		ammobagModel[35].rotateAngleZ = -0.03490659F;

		ammobagModel[36].addShapeBox(0.39F, -7.3F, -3F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 35
		ammobagModel[36].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[36].rotateAngleX = -0.26179939F;
		ammobagModel[36].rotateAngleY = -0.26179939F;
		ammobagModel[36].rotateAngleZ = -0.03490659F;

		ammobagModel[37].addShapeBox(0.39F, -7.3F, -3.4F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 36
		ammobagModel[37].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[37].rotateAngleX = -0.26179939F;
		ammobagModel[37].rotateAngleY = -0.26179939F;
		ammobagModel[37].rotateAngleZ = -0.03490659F;

		ammobagModel[38].addShapeBox(0.39F, -7.3F, -2.6F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 37
		ammobagModel[38].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[38].rotateAngleX = -0.26179939F;
		ammobagModel[38].rotateAngleY = -0.26179939F;
		ammobagModel[38].rotateAngleZ = -0.03490659F;

		ammobagModel[39].addShapeBox(0.39F, -7.3F, -3.7F, 5, 8, 11, 0F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F); // Box 39
		ammobagModel[39].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[39].rotateAngleX = -0.26179939F;
		ammobagModel[39].rotateAngleY = -0.26179939F;
		ammobagModel[39].rotateAngleZ = -0.03490659F;

		ammobagModel[40].addShapeBox(1.98F, -7.3F, -3.4F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 40
		ammobagModel[40].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[40].rotateAngleX = -0.26179939F;
		ammobagModel[40].rotateAngleY = -0.26179939F;
		ammobagModel[40].rotateAngleZ = -0.03490659F;

		ammobagModel[41].addShapeBox(1.98F, -7.3F, -3F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 47
		ammobagModel[41].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[41].rotateAngleX = -0.26179939F;
		ammobagModel[41].rotateAngleY = -0.26179939F;
		ammobagModel[41].rotateAngleZ = -0.03490659F;

		ammobagModel[42].addShapeBox(1.98F, -7.3F, -1F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 48
		ammobagModel[42].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[42].rotateAngleX = -0.26179939F;
		ammobagModel[42].rotateAngleY = -0.26179939F;
		ammobagModel[42].rotateAngleZ = -0.03490659F;

		ammobagModel[43].addShapeBox(1.98F, -7.3F, -1.4F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 49
		ammobagModel[43].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[43].rotateAngleX = -0.26179939F;
		ammobagModel[43].rotateAngleY = -0.26179939F;
		ammobagModel[43].rotateAngleZ = -0.03490659F;

		ammobagModel[44].addShapeBox(1.98F, -7.3F, -2.6F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 50
		ammobagModel[44].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[44].rotateAngleX = -0.26179939F;
		ammobagModel[44].rotateAngleY = -0.26179939F;
		ammobagModel[44].rotateAngleZ = -0.03490659F;

		ammobagModel[45].addShapeBox(1.98F, -7.3F, -2.2F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 52
		ammobagModel[45].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[45].rotateAngleX = -0.26179939F;
		ammobagModel[45].rotateAngleY = -0.26179939F;
		ammobagModel[45].rotateAngleZ = -0.03490659F;

		ammobagModel[46].addShapeBox(1.98F, -7.3F, -1.8F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 53
		ammobagModel[46].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[46].rotateAngleX = -0.26179939F;
		ammobagModel[46].rotateAngleY = -0.26179939F;
		ammobagModel[46].rotateAngleZ = -0.03490659F;

		ammobagModel[47].addShapeBox(0.39F, -7.3F, -3.8F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 54
		ammobagModel[47].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[47].rotateAngleX = -0.26179939F;
		ammobagModel[47].rotateAngleY = -0.26179939F;
		ammobagModel[47].rotateAngleZ = -0.03490659F;

		ammobagModel[48].addShapeBox(1.98F, -7.3F, -3.8F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 55
		ammobagModel[48].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[48].rotateAngleX = -0.26179939F;
		ammobagModel[48].rotateAngleY = -0.26179939F;
		ammobagModel[48].rotateAngleZ = -0.03490659F;

		ammobagModel[49].addShapeBox(2F, -6.8F, -0.6F, 6, 5, 8, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 133
		ammobagModel[49].setRotationPoint(-5.5F, -1F, -2F);
		ammobagModel[49].rotateAngleX = -0.15707963F;
		ammobagModel[49].rotateAngleY = -0.26179939F;
		ammobagModel[49].rotateAngleZ = -0.03490659F;

		ammobagModel[50].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 131
		ammobagModel[50].setRotationPoint(0F, -3F, -5F);
		ammobagModel[50].rotateAngleX = -0.52359878F;
		ammobagModel[50].rotateAngleY = 0.4712389F;

		ammobagModel[51].addShapeBox(0F, -0.2F, 0F, 1, 1, 2, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F); // Box 132
		ammobagModel[51].setRotationPoint(0F, -3F, -5F);
		ammobagModel[51].rotateAngleX = -0.52359878F;
		ammobagModel[51].rotateAngleY = 0.4712389F;

		ammobagModel[52].addShapeBox(2F, -0.2F, 0F, 1, 1, 2, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 133
		ammobagModel[52].setRotationPoint(0F, -3F, -5F);
		ammobagModel[52].rotateAngleX = -0.52359878F;
		ammobagModel[52].rotateAngleY = 0.4712389F;

		ammobagModel[53].addShapeBox(1F, -0.2F, 0F, 1, 1, 2, 0F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F); // Box 134
		ammobagModel[53].setRotationPoint(0F, -3F, -5F);
		ammobagModel[53].rotateAngleX = -0.52359878F;
		ammobagModel[53].rotateAngleY = 0.4712389F;

		ammobagModel[54].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F); // Box 135
		ammobagModel[54].setRotationPoint(0F, -3F, -5F);
		ammobagModel[54].rotateAngleX = -0.52359878F;
		ammobagModel[54].rotateAngleY = 0.4712389F;

		ammobagModel[55].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F); // Box 136
		ammobagModel[55].setRotationPoint(-11F, -3F, -2F);
		ammobagModel[55].rotateAngleX = -0.12217305F;
		ammobagModel[55].rotateAngleY = -0.76794487F;

		ammobagModel[56].addShapeBox(2F, -0.2F, 0F, 1, 1, 2, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 137
		ammobagModel[56].setRotationPoint(-11F, -3F, -2F);
		ammobagModel[56].rotateAngleX = -0.12217305F;
		ammobagModel[56].rotateAngleY = -0.76794487F;

		ammobagModel[57].addShapeBox(1F, -0.2F, 0F, 1, 1, 2, 0F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F); // Box 138
		ammobagModel[57].setRotationPoint(-11F, -3F, -2F);
		ammobagModel[57].rotateAngleX = -0.12217305F;
		ammobagModel[57].rotateAngleY = -0.76794487F;

		ammobagModel[58].addShapeBox(0F, -0.2F, 0F, 1, 1, 2, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F); // Box 139
		ammobagModel[58].setRotationPoint(-11F, -3F, -2F);
		ammobagModel[58].rotateAngleX = -0.12217305F;
		ammobagModel[58].rotateAngleY = -0.76794487F;

		ammobagModel[59].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 140
		ammobagModel[59].setRotationPoint(-11F, -3F, -2F);
		ammobagModel[59].rotateAngleX = -0.12217305F;
		ammobagModel[59].rotateAngleY = -0.76794487F;

		ammobagModel[60].addShapeBox(2F, -4.5F, 1.1F, 6, 6, 8, 0F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 141
		ammobagModel[60].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[60].rotateAngleY = -0.33161256F;

		ammobagModel[61].addShapeBox(0.7F, -4.5F, -1.5F, 6, 6, 9, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 142
		ammobagModel[61].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[61].rotateAngleY = -0.33161256F;

		ammobagModel[62].addShapeBox(-0.9F, -4.5F, -1.5F, 6, 6, 9, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 143
		ammobagModel[62].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[62].rotateAngleY = -0.33161256F;

		ammobagModel[63].addShapeBox(2F, -4.5F, -2.9F, 6, 6, 8, 0F, 0F, -2F, -3.9F, -4.2F, -2F, -3.9F, -4.2F, -2F, -3.9F, 0F, -2F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 144
		ammobagModel[63].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[63].rotateAngleY = -0.33161256F;

		ammobagModel[64].addShapeBox(2F, -3.5F, -1.4F, 6, 5, 9, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 145
		ammobagModel[64].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[64].rotateAngleY = -0.33161256F;

		ammobagModel[65].addShapeBox(0.7F, -3.45F, -2.1F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 146
		ammobagModel[65].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[65].rotateAngleX = -0.08726646F;
		ammobagModel[65].rotateAngleY = -0.33161256F;

		ammobagModel[66].addShapeBox(-0.9F, -3.45F, -2.1F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 147
		ammobagModel[66].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[66].rotateAngleX = -0.08726646F;
		ammobagModel[66].rotateAngleY = -0.33161256F;

		ammobagModel[67].addShapeBox(2F, -5.75F, -1.4F, 6, 5, 9, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 148
		ammobagModel[67].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[67].rotateAngleY = -0.33161256F;

		ammobagModel[68].addShapeBox(0.39F, -7.3F, -1.4F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 149
		ammobagModel[68].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[68].rotateAngleX = -0.19198622F;
		ammobagModel[68].rotateAngleY = -0.33161256F;

		ammobagModel[69].addShapeBox(0.39F, -7.3F, -1F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 150
		ammobagModel[69].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[69].rotateAngleX = -0.19198622F;
		ammobagModel[69].rotateAngleY = -0.33161256F;

		ammobagModel[70].addShapeBox(0.39F, -7.3F, -1.8F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 151
		ammobagModel[70].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[70].rotateAngleX = -0.19198622F;
		ammobagModel[70].rotateAngleY = -0.33161256F;

		ammobagModel[71].addShapeBox(0.39F, -7.3F, -2.2F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 152
		ammobagModel[71].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[71].rotateAngleX = -0.19198622F;
		ammobagModel[71].rotateAngleY = -0.33161256F;

		ammobagModel[72].addShapeBox(0.39F, -7.3F, -3F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 153
		ammobagModel[72].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[72].rotateAngleX = -0.19198622F;
		ammobagModel[72].rotateAngleY = -0.33161256F;

		ammobagModel[73].addShapeBox(0.39F, -7.3F, -3.4F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 154
		ammobagModel[73].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[73].rotateAngleX = -0.19198622F;
		ammobagModel[73].rotateAngleY = -0.33161256F;

		ammobagModel[74].addShapeBox(0.39F, -7.3F, -2.6F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 155
		ammobagModel[74].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[74].rotateAngleX = -0.19198622F;
		ammobagModel[74].rotateAngleY = -0.33161256F;

		ammobagModel[75].addShapeBox(0.39F, -7.3F, -3.7F, 5, 8, 11, 0F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F); // Box 156
		ammobagModel[75].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[75].rotateAngleX = -0.19198622F;
		ammobagModel[75].rotateAngleY = -0.33161256F;

		ammobagModel[76].addShapeBox(1.98F, -7.3F, -3.4F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 157
		ammobagModel[76].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[76].rotateAngleX = -0.19198622F;
		ammobagModel[76].rotateAngleY = -0.33161256F;

		ammobagModel[77].addShapeBox(1.98F, -7.3F, -3F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 158
		ammobagModel[77].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[77].rotateAngleX = -0.19198622F;
		ammobagModel[77].rotateAngleY = -0.33161256F;

		ammobagModel[78].addShapeBox(1.98F, -7.3F, -1F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 159
		ammobagModel[78].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[78].rotateAngleX = -0.19198622F;
		ammobagModel[78].rotateAngleY = -0.33161256F;

		ammobagModel[79].addShapeBox(1.98F, -7.3F, -1.4F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 160
		ammobagModel[79].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[79].rotateAngleX = -0.19198622F;
		ammobagModel[79].rotateAngleY = -0.33161256F;

		ammobagModel[80].addShapeBox(1.98F, -7.3F, -2.6F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 161
		ammobagModel[80].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[80].rotateAngleX = -0.19198622F;
		ammobagModel[80].rotateAngleY = -0.33161256F;

		ammobagModel[81].addShapeBox(1.98F, -7.3F, -2.2F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 162
		ammobagModel[81].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[81].rotateAngleX = -0.19198622F;
		ammobagModel[81].rotateAngleY = -0.33161256F;

		ammobagModel[82].addShapeBox(1.98F, -7.3F, -1.8F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 163
		ammobagModel[82].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[82].rotateAngleX = -0.19198622F;
		ammobagModel[82].rotateAngleY = -0.33161256F;

		ammobagModel[83].addShapeBox(0.39F, -7.3F, -3.8F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 164
		ammobagModel[83].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[83].rotateAngleX = -0.19198622F;
		ammobagModel[83].rotateAngleY = -0.33161256F;

		ammobagModel[84].addShapeBox(1.98F, -7.3F, -3.8F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 165
		ammobagModel[84].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[84].rotateAngleX = -0.19198622F;
		ammobagModel[84].rotateAngleY = -0.33161256F;

		ammobagModel[85].addShapeBox(2F, -6.8F, -0.6F, 6, 5, 8, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 166
		ammobagModel[85].setRotationPoint(-13.5F, 0F, 1F);
		ammobagModel[85].rotateAngleX = -0.08726646F;
		ammobagModel[85].rotateAngleY = -0.33161256F;

		ammobagModel[86].addShapeBox(0F, 0F, 0F, 6, 7, 3, 0F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -3F, -1.2F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -3F, -1.2F); // Box 193
		ammobagModel[86].setRotationPoint(-6F, -4F, 5F);
		ammobagModel[86].rotateAngleX = 0.17453293F;
		ammobagModel[86].rotateAngleY = -0.29670597F;
		ammobagModel[86].rotateAngleZ = 0.13962634F;

		ammobagModel[87].addShapeBox(0F, 0F, 0F, 6, 7, 3, 0F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -3F, -1.2F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -3F, -1.2F); // Box 194
		ammobagModel[87].setRotationPoint(-7F, -2.5F, 4F);
		ammobagModel[87].rotateAngleX = 0.76794487F;
		ammobagModel[87].rotateAngleY = 0.13962634F;

		ammobagModel[88].addShapeBox(0F, 0F, 0F, 6, 7, 3, 0F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -3F, -1.2F, -2F, -2.5F, -1.2F, -2F, -2.5F, -1.2F, -2F, -3F, -1.2F); // Box 195
		ammobagModel[88].setRotationPoint(-4F, -2.1F, 7F);
		ammobagModel[88].rotateAngleX = 0.54105207F;
		ammobagModel[88].rotateAngleY = -0.87266463F;
		ammobagModel[88].rotateAngleZ = 0.26179939F;

		ammobagModel[89].addShapeBox(-1F, 0F, -1F, 1, 1, 6, 0F, 0F, -0.8F, -1F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 196
		ammobagModel[89].setRotationPoint(-1.25F, -5.75F, -1F);
		ammobagModel[89].rotateAngleZ = -0.36651914F;

		ammobagModel[90].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 197
		ammobagModel[90].setRotationPoint(-1.25F, -5.55F, -1F);
		ammobagModel[90].rotateAngleY = -0.08726646F;
		ammobagModel[90].rotateAngleZ = -0.36651914F;

		ammobagModel[91].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 198
		ammobagModel[91].setRotationPoint(-1.25F, -5.61F, 2F);
		ammobagModel[91].rotateAngleY = 0.08726646F;
		ammobagModel[91].rotateAngleZ = -0.36651914F;

		ammobagModel[92].addShapeBox(0.39F, -7.3F, -3.8F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 199
		ammobagModel[92].setRotationPoint(-9.5F, -1F, 1F);
		ammobagModel[92].rotateAngleX = -0.19198622F;
		ammobagModel[92].rotateAngleY = -0.62831853F;

		ammobagModel[93].addShapeBox(1.98F, -7.3F, -3.8F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 200
		ammobagModel[93].setRotationPoint(-9.5F, -1F, 1F);
		ammobagModel[93].rotateAngleX = -0.19198622F;
		ammobagModel[93].rotateAngleY = -0.62831853F;

		ammobagModel[94].addShapeBox(0.39F, -7.3F, -3.8F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 201
		ammobagModel[94].setRotationPoint(-9.5F, -1F, 1F);
		ammobagModel[94].rotateAngleX = -0.19198622F;
		ammobagModel[94].rotateAngleY = -0.06981317F;

		ammobagModel[95].addShapeBox(1.98F, -7.3F, -3.8F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 202
		ammobagModel[95].setRotationPoint(-9.5F, -1F, 1F);
		ammobagModel[95].rotateAngleX = -0.19198622F;
		ammobagModel[95].rotateAngleY = -0.06981317F;

		ammobagModel[96].addShapeBox(0.39F, -7.3F, -3.8F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 203
		ammobagModel[96].setRotationPoint(-4.5F, -1F, 3.5F);
		ammobagModel[96].rotateAngleX = -0.19198622F;
		ammobagModel[96].rotateAngleY = -2.35619449F;

		ammobagModel[97].addShapeBox(1.98F, -7.3F, -3.8F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 204
		ammobagModel[97].setRotationPoint(-4.5F, -1F, 3.5F);
		ammobagModel[97].rotateAngleX = -0.19198622F;
		ammobagModel[97].rotateAngleY = -2.35619449F;

		
		for(ModelRendererTurbo part : ammobagModel)
		{
			part.doMirror(false, true, true);
			part.setRotationPoint(part.rotationPointX, -part.rotationPointY, -part.rotationPointZ);
		}
	}

	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 98; i++)
		{
			ammobagModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ammobagModel[];
}
