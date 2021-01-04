//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.3
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

public class ModelMG34 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMG34() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[52];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 87
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 88
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 89
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 90
		gunModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 91
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 92
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 93
		gunModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 94
		gunModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 95
		gunModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 96
		gunModel[11] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 97
		gunModel[12] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 98
		gunModel[13] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 99
		gunModel[14] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 100
		gunModel[15] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 101
		gunModel[16] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 102
		gunModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 104
		gunModel[18] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 106
		gunModel[19] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 107
		gunModel[20] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 108
		gunModel[21] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 109
		gunModel[22] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 110
		gunModel[23] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 111
		gunModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 112
		gunModel[25] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 113
		gunModel[26] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 114
		gunModel[27] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 115
		gunModel[28] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 116
		gunModel[29] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 117
		gunModel[30] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 118
		gunModel[31] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 119
		gunModel[32] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 120
		gunModel[33] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 122
		gunModel[34] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 123
		gunModel[35] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 124
		gunModel[36] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 125
		gunModel[37] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 126
		gunModel[38] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 127
		gunModel[39] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 128
		gunModel[40] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 135
		gunModel[41] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 136
		gunModel[42] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 137
		gunModel[43] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 138
		gunModel[44] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 139
		gunModel[45] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 140
		gunModel[46] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 142
		gunModel[47] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 143
		gunModel[48] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 144
		gunModel[49] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 147
		gunModel[50] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 148
		gunModel[51] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 195

		gunModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 86
		gunModel[0].setRotationPoint(7F, -2.65F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 87
		gunModel[1].setRotationPoint(7F, -2.45F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 88
		gunModel[2].setRotationPoint(7F, -2.85F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F); // Box 89
		gunModel[3].setRotationPoint(10.1F, -2.65F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // Box 90
		gunModel[4].setRotationPoint(10.1F, -2.4F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F); // Box 91
		gunModel[5].setRotationPoint(10.1F, -2.9F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 92
		gunModel[6].setRotationPoint(5F, -2.9F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 93
		gunModel[7].setRotationPoint(5F, -2.65F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 94
		gunModel[8].setRotationPoint(5F, -2.4F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F); // Box 95
		gunModel[9].setRotationPoint(13.1F, -2.9F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F); // Box 96
		gunModel[10].setRotationPoint(13.1F, -2.65F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // Box 97
		gunModel[11].setRotationPoint(13.1F, -2.4F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 98
		gunModel[12].setRotationPoint(14.7F, -2.9F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 99
		gunModel[13].setRotationPoint(14.7F, -2.65F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 100
		gunModel[14].setRotationPoint(14.7F, -2.4F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F); // Box 101
		gunModel[15].setRotationPoint(3.25F, -2.75F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F); // Box 102
		gunModel[16].setRotationPoint(3.25F, -2.4F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F); // Box 104
		gunModel[17].setRotationPoint(4.4F, -2.75F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F); // Box 106
		gunModel[18].setRotationPoint(4.4F, -2.35F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 107
		gunModel[19].setRotationPoint(3.1F, -2.35F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F); // Box 108
		gunModel[20].setRotationPoint(3.1F, -2.75F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 109
		gunModel[21].setRotationPoint(-1.5F, -2.4F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F); // Box 110
		gunModel[22].setRotationPoint(-1.5F, -2.65F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F); // Box 111
		gunModel[23].setRotationPoint(2.9F, -3.1F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F); // Box 112
		gunModel[24].setRotationPoint(1.5F, -3.23F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F, -0.2F, -0.35F, -0.08F); // Box 113
		gunModel[25].setRotationPoint(-1.5F, -2.95F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, -0.45F, -0.08F, -0.3F, -0.2F, -0.08F, -0.3F, -0.2F, -0.08F, -0.3F, -0.45F, -0.08F, -0.3F, -0.25F, -0.08F, -0.3F, -0.25F, -0.08F, -0.3F, -0.25F, -0.08F, -0.3F, -0.25F, -0.08F); // Box 114
		gunModel[26].setRotationPoint(0F, -3.05F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F); // Box 115
		gunModel[27].setRotationPoint(-3.2F, -2.65F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F); // Box 116
		gunModel[28].setRotationPoint(-3.7F, -2.65F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.2F); // Box 117
		gunModel[29].setRotationPoint(-4.7F, -2.9F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, 0F, -0.2F); // Box 118
		gunModel[30].setRotationPoint(-4.1F, -2.6F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 119
		gunModel[31].setRotationPoint(-5.7F, -3.2F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.5F, -0.2F); // Box 120
		gunModel[32].setRotationPoint(-2.5F, -2.65F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.6F, -0.2F); // Box 122
		gunModel[33].setRotationPoint(-2.5F, -2.55F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.2F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, 0F, -0.2F); // Box 123
		gunModel[34].setRotationPoint(-2.5F, -2.75F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F); // Box 124
		gunModel[35].setRotationPoint(-1.8F, -2.9F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 125
		gunModel[36].setRotationPoint(0F, -1.9F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, -0.6F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, -0.4F, -0.6F, -0.15F); // Box 126
		gunModel[37].setRotationPoint(-1F, -1.9F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F); // Box 127
		gunModel[38].setRotationPoint(0F, -1.8F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F, -0.2F, -0.4F, -0.15F); // Box 128
		gunModel[39].setRotationPoint(0.7F, -2.3F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F); // Box 135
		gunModel[40].setRotationPoint(15.7F, -2.65F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.26F, 0F, -0.2F, -0.26F, 0F, -0.2F, -0.26F, 0F, 0F, -0.26F, 0F, -0.25F, -0.26F, -0.25F, 0F, -0.26F, -0.25F, 0F, -0.26F, 0F, -0.25F, -0.26F); // Box 136
		gunModel[41].setRotationPoint(0.34F, -1.9F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, -0.75F, -0.15F, 0F, -0.6F, -0.15F, 0F, -0.6F, -0.15F, -0.4F, -0.75F, -0.15F); // Box 137
		gunModel[42].setRotationPoint(-1.6F, -1.9F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F, -0.4F, -0.3F, -0.48F); // Box 138
		gunModel[43].setRotationPoint(10.1F, -3.2F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F, -0.4F, 0F, -0.46F); // Box 139
		gunModel[44].setRotationPoint(13.6F, -3.3F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, 0F, -0.48F, -0.45F, 0F, -0.48F, -0.45F, 0F, -0.48F, -0.45F, 0F, -0.48F, -0.45F, -0.8F, -0.48F, -0.45F, -0.8F, -0.48F, -0.45F, -0.8F, -0.48F, -0.45F, -0.8F, -0.48F); // Box 140
		gunModel[45].setRotationPoint(13.6F, -3.45F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F, -0.44F, 0F, -0.4F); // Box 142
		gunModel[46].setRotationPoint(3.9F, -4F, -0.26F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.48F, 0F, -0.3F, -0.48F, 0F, -0.3F, -0.48F, 0F, -0.46F, -0.48F, 0F, -0.46F, -0.48F, -0.6F, -0.3F, -0.48F, -0.6F, -0.3F, -0.48F, -0.6F, -0.46F, -0.48F, -0.6F, -0.46F); // Box 143
		gunModel[47].setRotationPoint(3.9F, -3.47F, -0.57F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.48F, 0F, -0.46F, -0.48F, 0F, -0.46F, -0.48F, 0F, -0.4F, -0.48F, 0F, -0.4F, -0.48F, -0.6F, -0.46F, -0.48F, -0.6F, -0.46F, -0.48F, -0.6F, -0.4F, -0.48F, -0.6F, -0.4F); // Box 144
		gunModel[48].setRotationPoint(3.9F, -3.47F, -0.43F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.48F, -0.1F, -0.45F, -0.48F, -0.1F, -0.45F, -0.48F, -0.1F, -0.45F, -0.48F, -0.1F, -0.45F, -0.48F, -0.57F, -0.45F, -0.48F, -0.57F, -0.45F, -0.48F, -0.57F, -0.45F, -0.48F, -0.57F, -0.45F); // Box 147
		gunModel[49].setRotationPoint(3.9F, -3.5F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F, -0.3F, -0.35F, -0.15F); // Box 148
		gunModel[50].setRotationPoint(3.9F, -3.35F, -0.4F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 195
		gunModel[51].setRotationPoint(1.8F, -2.95F, -0.05F);


		ammoModel = new ModelRendererTurbo[31];
		ammoModel[0] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 149
		ammoModel[1] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 151
		ammoModel[2] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 152
		ammoModel[3] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 153
		ammoModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 154
		ammoModel[5] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 155
		ammoModel[6] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 168
		ammoModel[7] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 169
		ammoModel[8] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 170
		ammoModel[9] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 171
		ammoModel[10] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 172
		ammoModel[11] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 173
		ammoModel[12] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 174
		ammoModel[13] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 175
		ammoModel[14] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 176
		ammoModel[15] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 177
		ammoModel[16] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 178
		ammoModel[17] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 179
		ammoModel[18] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 180
		ammoModel[19] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 181
		ammoModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 182
		ammoModel[21] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 183
		ammoModel[22] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 184
		ammoModel[23] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 185
		ammoModel[24] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 186
		ammoModel[25] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 187
		ammoModel[26] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 188
		ammoModel[27] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 191
		ammoModel[28] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 192
		ammoModel[29] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 193
		ammoModel[30] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 194

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 149
		ammoModel[0].setRotationPoint(1.3F, -2.95F, 0.1F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 151
		ammoModel[1].setRotationPoint(2.6F, -2.95F, 0.1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 152
		ammoModel[2].setRotationPoint(1.3F, -2.8F, 0.4F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 153
		ammoModel[3].setRotationPoint(2.6F, -2.8F, 0.4F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 154
		ammoModel[4].setRotationPoint(1.3F, -2.5F, 0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 155
		ammoModel[5].setRotationPoint(2.6F, -2.5F, 0.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 168
		ammoModel[6].setRotationPoint(1.3F, -2.2F, 0.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 169
		ammoModel[7].setRotationPoint(2.6F, -2.2F, 0.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 170
		ammoModel[8].setRotationPoint(1.3F, -1.9F, 0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 171
		ammoModel[9].setRotationPoint(2.6F, -1.9F, 0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 172
		ammoModel[10].setRotationPoint(1.3F, -1.6F, 0.5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 173
		ammoModel[11].setRotationPoint(2.6F, -1.6F, 0.5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 174
		ammoModel[12].setRotationPoint(1.3F, -1.3F, 0.5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 175
		ammoModel[13].setRotationPoint(2.6F, -1.3F, 0.5F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 176
		ammoModel[14].setRotationPoint(1.3F, -1F, 0.5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 177
		ammoModel[15].setRotationPoint(2.6F, -1F, 0.5F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 178
		ammoModel[16].setRotationPoint(1.3F, -0.7F, 0.5F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 179
		ammoModel[17].setRotationPoint(2.6F, -0.7F, 0.5F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 180
		ammoModel[18].setRotationPoint(1.3F, -0.4F, 0.5F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 181
		ammoModel[19].setRotationPoint(2.6F, -0.4F, 0.5F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 182
		ammoModel[20].setRotationPoint(1.3F, -0.1F, 0.5F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 183
		ammoModel[21].setRotationPoint(2.6F, -0.1F, 0.5F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 184
		ammoModel[22].setRotationPoint(1.3F, 0.2F, 0.5F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 185
		ammoModel[23].setRotationPoint(2.6F, 0.2F, 0.5F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 186
		ammoModel[24].setRotationPoint(1.3F, -2.95F, -0.5F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 187
		ammoModel[25].setRotationPoint(2.6F, -2.95F, -0.5F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F); // Box 188
		ammoModel[26].setRotationPoint(1.8F, -2.15F, 0.5F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.8F, -0.45F, -0.2F, -0.8F, -0.45F, -0.2F, -0.8F, -0.45F, -0.2F, -0.8F, -0.45F); // Box 191
		ammoModel[27].setRotationPoint(1.8F, -2.35F, 0.5F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 192
		ammoModel[28].setRotationPoint(1.8F, -2.9F, 0.25F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.4F, -0.38F, -0.38F, -0.45F, -0.38F, -0.38F); // Box 193
		ammoModel[29].setRotationPoint(1.3F, -2.95F, -0.2F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F, -0.3F, -0.38F, -0.38F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.3F, -0.38F, -0.38F); // Box 194
		ammoModel[30].setRotationPoint(2.6F, -2.95F, -0.2F);


		animationType = EnumAnimationType.SIDE_CLIP;
		translateAll(0F, -1.2F, 0.07F);
		thirdPersonOffset = new Vector3f(-0.08F, -0.18F, 0.01F);

		flipAll();
	}
}
