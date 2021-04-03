//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.12.2015 - 13:00:33
// Last changed on: 07.12.2015 - 13:00:33

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelFg42 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelFg42() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[68];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 119
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 120
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 121
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 122
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 123
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 124
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 125
		gunModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 127
		gunModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 128
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 129
		gunModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 130
		gunModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 133
		gunModel[12] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 134
		gunModel[13] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 135
		gunModel[14] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 136
		gunModel[15] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 137
		gunModel[16] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 138
		gunModel[17] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 139
		gunModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 141
		gunModel[19] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 29
		gunModel[27] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 30
		gunModel[28] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 31
		gunModel[29] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 33
		gunModel[31] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 34
		gunModel[32] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 39
		gunModel[36] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 40
		gunModel[37] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 41
		gunModel[38] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 43
		gunModel[39] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 46
		gunModel[40] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 47
		gunModel[41] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 51
		gunModel[42] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 53
		gunModel[43] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 54
		gunModel[44] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 55
		gunModel[45] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 56
		gunModel[46] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 57
		gunModel[47] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 59
		gunModel[48] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 60
		gunModel[49] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 61
		gunModel[50] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 63
		gunModel[51] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 64
		gunModel[52] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 67
		gunModel[53] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 72
		gunModel[54] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 73
		gunModel[55] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 74
		gunModel[56] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 75
		gunModel[57] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 76
		gunModel[58] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 77
		gunModel[59] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 78
		gunModel[60] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 79
		gunModel[61] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 80
		gunModel[62] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 81
		gunModel[63] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 68
		gunModel[64] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 69
		gunModel[65] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 70
		gunModel[66] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 68
		gunModel[67] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 69

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 119
		gunModel[0].setRotationPoint(0F, 0.4F, -0.51F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.6F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 120
		gunModel[1].setRotationPoint(0F, -0.6F, -0.51F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.4F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 121
		gunModel[2].setRotationPoint(0.6F, -1.6F, -0.51F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.8F, -0.1F, -0.7F, -0.8F, -0.1F, -0.7F, -0.8F, -0.1F, 0F, -0.8F, -0.1F); // Box 122
		gunModel[3].setRotationPoint(1.6F, -0.6F, -0.51F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.15F, 0.3F, -0.3F, -0.15F, 0.3F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 123
		gunModel[4].setRotationPoint(0.5F, -2.7F, -0.51F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.15F, 0.3F, 0F, -0.15F, 0.3F, 0F, -0.15F, 0F, 0F, -0.15F, -0.35F, -0.7F, -0.2F, 0.3F, -0.7F, -0.2F, 0.3F, -0.7F, -0.2F, -0.35F, -0.7F, -0.2F); // Box 124
		gunModel[5].setRotationPoint(0.5F, -2F, -0.51F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F); // Box 125
		gunModel[6].setRotationPoint(0.65F, -2F, -0.51F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.75F, -0.15F, 0F, -0.75F, -0.15F, 0F, -0.75F, -0.15F, 0F, -0.75F, -0.15F); // Box 127
		gunModel[7].setRotationPoint(-3F, -4.5F, -0.51F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 128
		gunModel[8].setRotationPoint(-5.3F, -4.35F, -0.51F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 129
		gunModel[9].setRotationPoint(-5.3F, -5.1F, -0.51F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 130
		gunModel[10].setRotationPoint(4.8F, -5.15F, -0.51F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 133
		gunModel[11].setRotationPoint(11F, -4.5F, -0.51F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 134
		gunModel[12].setRotationPoint(11F, -3.6F, -0.51F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.15F, -0.15F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.15F, -0.15F); // Box 135
		gunModel[13].setRotationPoint(21.6F, -4.5F, -0.51F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, -0.75F, -0.3F, -0.3F, -0.75F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.3F, -0.3F, -0.75F, -0.3F, -0.3F, 0F, -0.1F, -0.1F); // Box 136
		gunModel[14].setRotationPoint(24.1F, -4.5F, -0.51F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 137
		gunModel[15].setRotationPoint(20.5F, -3.6F, -0.51F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 138
		gunModel[16].setRotationPoint(19.9F, -3.6F, -0.51F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 139
		gunModel[17].setRotationPoint(11.5F, -4.5F, -0.51F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 141
		gunModel[18].setRotationPoint(11.25F, -3.6F, -0.51F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 21
		gunModel[19].setRotationPoint(12F, -3.6F, -0.51F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 22
		gunModel[20].setRotationPoint(12F, -4.5F, -0.51F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F); // Box 23
		gunModel[21].setRotationPoint(12F, -4F, -0.51F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, 0F, -0.2F, -0.45F); // Box 24
		gunModel[22].setRotationPoint(20.5F, -4.05F, -0.51F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F); // Box 26
		gunModel[23].setRotationPoint(22.1F, -4.5F, -0.51F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F); // Box 27
		gunModel[24].setRotationPoint(22.3F, -4.5F, -0.51F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F); // Box 28
		gunModel[25].setRotationPoint(22.5F, -4.5F, -0.51F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F); // Box 29
		gunModel[26].setRotationPoint(22.7F, -4.5F, -0.51F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F); // Box 30
		gunModel[27].setRotationPoint(22.9F, -4.5F, -0.51F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F); // Box 31
		gunModel[28].setRotationPoint(23.1F, -4.5F, -0.51F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F); // Box 32
		gunModel[29].setRotationPoint(23.3F, -4.5F, -0.51F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.1F, -0.1F); // Box 33
		gunModel[30].setRotationPoint(23.5F, -4.5F, -0.51F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F); // Box 34
		gunModel[31].setRotationPoint(19F, -4.9F, -0.51F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 35
		gunModel[32].setRotationPoint(-5.3F, -2.6F, -0.51F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.2F, -0.7F, -0.1F, 0.2F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F, 0.2F, -0.7F, -0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 36
		gunModel[33].setRotationPoint(-7.5F, -5.1F, -0.51F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.2F, -0.45F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.45F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -1.25F, 0.2F, 0.2F, -1.25F, 0.2F, 0.2F, 0F, 0.2F); // Box 37
		gunModel[34].setRotationPoint(-7.5F, -4.35F, -0.51F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.2F, -1.25F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -1.25F, 0.2F, 0.2F, 0F, -0.1F, 0.2F, -1.5F, -0.1F, 0.2F, -1.5F, -0.1F, 0.2F, 0F, -0.1F); // Box 39
		gunModel[35].setRotationPoint(-7.5F, -2.6F, -0.51F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -0.5F, 0.2F); // Box 40
		gunModel[36].setRotationPoint(-10.7F, -4.9F, -0.51F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.3F, 0.05F, 0.2F, -0.5F, 0.05F, 0.2F, -0.5F, 0.05F, 0.2F, -0.3F, 0.05F, 0.2F); // Box 41
		gunModel[37].setRotationPoint(-10.2F, -4.4F, -0.51F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.4F, 0.2F, 0.1F, -2F, 0.2F, 0.1F, -2F, 0.2F, 0.1F, -0.4F, 0.2F); // Box 43
		gunModel[38].setRotationPoint(-9.8F, -1.35F, -0.51F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.1F, -1.6F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -1.6F, 0.2F, -1F, -0.3F, -0.1F, 0.1F, -1.25F, -0.1F, 0.1F, -1.25F, -0.1F, -1F, -0.3F, -0.1F); // Box 46
		gunModel[39].setRotationPoint(-9.8F, -1.35F, -0.51F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.125F, 0.05F, 0F, -0.125F, 0.05F, 0F, -0.125F, 0.05F, 0F, -0.125F, 0.05F, 0F, -0.125F, 0.05F, 0F, -0.125F, 0.05F, 0F, -0.125F, 0.05F, 0F, -0.125F, 0.05F); // Box 47
		gunModel[40].setRotationPoint(-3F, -4.38F, -0.51F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 51
		gunModel[41].setRotationPoint(1F, -3.4F, -0.51F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.42F, 0F, -0.2F, -0.42F, 0F, -0.2F, -0.42F, 0F, -0.2F, -0.42F, 0F, -0.2F, -0.42F, 0F, -0.2F, -0.42F, 0F, -0.2F, -0.42F, 0F, -0.2F, -0.42F, 0F, -0.2F); // Box 53
		gunModel[42].setRotationPoint(4.23F, -1.9F, -0.51F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0F, -0.2F); // Box 54
		gunModel[43].setRotationPoint(2.35F, -1.6F, -0.51F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.42F, -0.2F, 0.2F, -0.42F, -0.2F, 0.2F, -0.42F, -0.2F, 0.2F, -0.42F, -0.2F, 0.2F, -0.42F, -0.2F, 0.2F, -0.42F, -0.2F, 0.2F, -0.42F, -0.2F, 0.2F, -0.42F, -0.2F); // Box 55
		gunModel[44].setRotationPoint(3.25F, -1.07F, -0.51F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.52F, 0F, -0.2F, -0.32F, 0F, -0.2F, -0.32F, 0F, -0.2F, -0.52F, 0F, -0.2F, -0.32F, -0.75F, -0.2F, -0.7F, -0.6F, -0.2F, -0.7F, -0.6F, -0.2F, -0.32F, -0.75F, -0.2F); // Box 56
		gunModel[45].setRotationPoint(4.13F, -0.9F, -0.51F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 57
		gunModel[46].setRotationPoint(2.85F, -2F, -0.51F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 59
		gunModel[47].setRotationPoint(2.85F, -1.35F, -0.51F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 60
		gunModel[48].setRotationPoint(3.8F, -4.65F, -0.51F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.35F, 0.3F, 0F, -0.35F, 0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0.3F, -0.75F, -0.35F, 0.3F, -0.75F, -0.35F, 0.3F, -0.75F, -0.35F, 0.3F, -0.75F, -0.35F); // Box 61
		gunModel[49].setRotationPoint(0.5F, -4.65F, -0.51F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F); // Box 63
		gunModel[50].setRotationPoint(-3F, -3.2F, -0.51F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F); // Box 64
		gunModel[51].setRotationPoint(-3F, -3.5F, -0.51F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F); // Box 67
		gunModel[52].setRotationPoint(0.7F, -4.4F, -0.01F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, 0F, -0.375F, 0.2F); // Box 72
		gunModel[53].setRotationPoint(10.8F, -4.53F, -0.51F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 73
		gunModel[54].setRotationPoint(4.8F, -2.9F, -0.51F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 74
		gunModel[55].setRotationPoint(4.8F, -4.15F, -0.51F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.5F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, -0.5F, -0.375F, 0.2F, -0.5F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, 0F, -0.375F, 0.2F, -0.5F, -0.375F, 0.2F); // Box 75
		gunModel[56].setRotationPoint(6.8F, -4.53F, -0.51F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.7F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F); // Box 76
		gunModel[57].setRotationPoint(10.8F, -2.9F, -0.51F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F); // Box 77
		gunModel[58].setRotationPoint(6.25F, -2.9F, -0.51F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 78
		gunModel[59].setRotationPoint(-3F, -3.4F, -0.51F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 79
		gunModel[60].setRotationPoint(1F, -3.7F, -0.51F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 80
		gunModel[61].setRotationPoint(1F, -3.4F, -0.31F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 81
		gunModel[62].setRotationPoint(4.8F, -3.55F, -0.01F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 68
		gunModel[63].setRotationPoint(-1.5F, -4.45F, -1.51F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F); // Box 69
		gunModel[64].setRotationPoint(13.7F, -3.9F, -0.91F);
		gunModel[64].rotateAngleX = -0.17453293F;
		gunModel[64].rotateAngleY = 0.01745329F;
		gunModel[64].rotateAngleZ = 0.03490659F;

		gunModel[65].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F); // Box 70
		gunModel[65].setRotationPoint(13.7F, -3.9F, -0.11F);
		gunModel[65].rotateAngleX = 0.17453293F;
		gunModel[65].rotateAngleY = -0.01745329F;
		gunModel[65].rotateAngleZ = 0.03490659F;

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F); // Box 68
		gunModel[66].setRotationPoint(20.25F, -5.5F, -0.51F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, -0.3F, -2.25F, -2.25F, -0.3F, -2.25F, -2.25F, -0.3F, -2.25F, -2.25F, -0.3F, -2.25F, -2.25F, -0.3F, -2.25F, -2.25F, -0.3F, -2.25F, -2.25F, -0.3F, -2.25F, -2.25F, -0.3F, -2.25F, -2.25F); // Box 69
		gunModel[67].setRotationPoint(20.25F, -8.25F, -2.51F);


		defaultScopeModel = new ModelRendererTurbo[2];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 70
		defaultScopeModel[1] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 72

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 70
		defaultScopeModel[0].setRotationPoint(0.25F, -5.5F, -0.51F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0F, -0.47F, -0.35F, 0F, -0.47F, -0.35F, 0F, -0.47F, -0.35F, 0F, -0.47F, -0.35F, 0F, -0.47F, -0.35F, 0F, -0.47F, -0.35F, 0F, -0.47F, -0.35F, 0F, -0.47F); // Box 72
		defaultScopeModel[1].setRotationPoint(0.25F, -5.7F, -0.51F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 62

		ammoModel[0].addShapeBox(0.7F, -4.4F, 1F, 3, 1, 5, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0F); // Box 62
		ammoModel[0].setRotationPoint(0F, 0F, -0.01F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 66

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -1F, -0.4F, -0.4F, -1F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -1F, -0.4F, -0.4F, -1F); // Box 66
		slideModel[0].setRotationPoint(6.5F, -3.53F, -1.51F);

		
		barrelAttachPoint = new Vector3f(0F / 16F, 0F / 16F, 0F / 16F);
		stockAttachPoint = new Vector3f(0F / 16F, 0F / 16F, 0F / 16F);
		scopeAttachPoint = new Vector3f(2F / 16F, 6F / 12.5F, -0.3F / 16F);
		gripAttachPoint = new Vector3f(0 / 16F, 0F / 16F, 0F / 16F);


		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.SIDE_CLIP;

		flipAll();
		translateAll(0F, 1.6F, -0.11F);
		thirdPersonOffset = new Vector3f(-0.15F, -0.13F, 0.01F);
	}
}
