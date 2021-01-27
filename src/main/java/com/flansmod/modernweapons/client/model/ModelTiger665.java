//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tiger665
// Model Creator: 
// Created on: 16.07.2020 - 17:07:52
// Last changed on: 16.07.2020 - 17:07:52

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTiger665 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelTiger665() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[103];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 75, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 127, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 178, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 30, 178, textureX, textureY); // Import Box3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 203, textureX, textureY); // Import Box4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Box5
		bodyModel[6] = new ModelRendererTurbo(this, 30, 230, textureX, textureY); // Import Box6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import Box7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import Box8
		bodyModel[9] = new ModelRendererTurbo(this, 30, 280, textureX, textureY); // Import Box9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 304, textureX, textureY); // Import Box10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 331, textureX, textureY); // Import Box11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 331, textureX, textureY); // Import Box12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Box13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Import Box14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Import Box15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Import Box16
		bodyModel[17] = new ModelRendererTurbo(this, 45, 375, textureX, textureY); // Import Box17
		bodyModel[18] = new ModelRendererTurbo(this, 0, 407, textureX, textureY); // Import Box18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Import Box19
		bodyModel[20] = new ModelRendererTurbo(this, 0, 457, textureX, textureY); // Import Box20
		bodyModel[21] = new ModelRendererTurbo(this, 0, 457, textureX, textureY); // Import Box21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Import Box22
		bodyModel[23] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Import Box23
		bodyModel[24] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box24
		bodyModel[25] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Box25
		bodyModel[26] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Box26
		bodyModel[27] = new ModelRendererTurbo(this, 0, 585, textureX, textureY); // Import Box27
		bodyModel[28] = new ModelRendererTurbo(this, 40, 585, textureX, textureY); // Import Box28
		bodyModel[29] = new ModelRendererTurbo(this, 0, 617, textureX, textureY); // Import Box29
		bodyModel[30] = new ModelRendererTurbo(this, 0, 617, textureX, textureY); // Import Box30
		bodyModel[31] = new ModelRendererTurbo(this, 0, 626, textureX, textureY); // Import Box31
		bodyModel[32] = new ModelRendererTurbo(this, 0, 648, textureX, textureY); // Import Box32
		bodyModel[33] = new ModelRendererTurbo(this, 0, 717, textureX, textureY); // Import Box33
		bodyModel[34] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Import Box34
		bodyModel[35] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Import Box35
		bodyModel[36] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Import Box37
		bodyModel[37] = new ModelRendererTurbo(this, 0, 914, textureX, textureY); // Import Box38
		bodyModel[38] = new ModelRendererTurbo(this, 0, 947, textureX, textureY); // Import Box39
		bodyModel[39] = new ModelRendererTurbo(this, 0, 990, textureX, textureY); // Import Box40
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1105, textureX, textureY); // Import Box41
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1024, textureX, textureY); // Import Box42
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1070, textureX, textureY); // Import Box43
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box44
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1164, textureX, textureY); // Import Box45
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1164, textureX, textureY); // Import Box46
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box47
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box48
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1244, textureX, textureY); // Import Box48
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1267, textureX, textureY); // Import Box49
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1290, textureX, textureY); // Import Box50
		bodyModel[51] = new ModelRendererTurbo(this, 0, 1320, textureX, textureY); // Import Box51
		bodyModel[52] = new ModelRendererTurbo(this, 0, 1362, textureX, textureY); // Import Box52
		bodyModel[53] = new ModelRendererTurbo(this, 0, 1404, textureX, textureY); // Import Box53
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1446, textureX, textureY); // Import Box54
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1477, textureX, textureY); // Import Box56
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1500, textureX, textureY); // Import Box57
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1525, textureX, textureY); // Import Box58
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1542, textureX, textureY); // Import Box59
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Import Box61
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1576, textureX, textureY); // Import Box62
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1594, textureX, textureY); // Import Box109
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1627, textureX, textureY); // Import Box110
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1648, textureX, textureY); // Import Box111
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Import Box112
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Import Box113
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Import Box114
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Import Box115
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Import Box116
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Import Box117
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box118
		bodyModel[71] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Import Box158
		bodyModel[72] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box159
		bodyModel[73] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Box160
		bodyModel[74] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Import Box161
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1690, textureX, textureY); // Import Box162
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1718, textureX, textureY); // Import Box163
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1761, textureX, textureY); // Import Box164
		bodyModel[78] = new ModelRendererTurbo(this, 200, 440, textureX, textureY); // Import Box119
		bodyModel[79] = new ModelRendererTurbo(this, 200, 455, textureX, textureY); // Import Box120
		bodyModel[80] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box121
		bodyModel[81] = new ModelRendererTurbo(this, 200, 482, textureX, textureY); // Import Box122
		bodyModel[82] = new ModelRendererTurbo(this, 200, 493, textureX, textureY); // Import Box123
		bodyModel[83] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import Box124
		bodyModel[84] = new ModelRendererTurbo(this, 200, 455, textureX, textureY); // Import Box125
		bodyModel[85] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box126
		bodyModel[86] = new ModelRendererTurbo(this, 200, 482, textureX, textureY); // Import Box127
		bodyModel[87] = new ModelRendererTurbo(this, 200, 493, textureX, textureY); // Import Box128
		bodyModel[88] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import Box129
		bodyModel[89] = new ModelRendererTurbo(this, 200, 455, textureX, textureY); // Import Box130
		bodyModel[90] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box131
		bodyModel[91] = new ModelRendererTurbo(this, 200, 482, textureX, textureY); // Import Box132
		bodyModel[92] = new ModelRendererTurbo(this, 200, 493, textureX, textureY); // Import Box133
		bodyModel[93] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import Box134
		bodyModel[94] = new ModelRendererTurbo(this, 200, 455, textureX, textureY); // Import Box135
		bodyModel[95] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box136
		bodyModel[96] = new ModelRendererTurbo(this, 200, 482, textureX, textureY); // Import Box137
		bodyModel[97] = new ModelRendererTurbo(this, 200, 493, textureX, textureY); // Import Box138
		bodyModel[98] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import Box139
		bodyModel[99] = new ModelRendererTurbo(this, 200, 527, textureX, textureY); // Import Box75
		bodyModel[100] = new ModelRendererTurbo(this, 200, 543, textureX, textureY); // Import Box76
		bodyModel[101] = new ModelRendererTurbo(this, 200, 564, textureX, textureY); // Import Box77
		bodyModel[102] = new ModelRendererTurbo(this, 200, 543, textureX, textureY); // Import Box78

		bodyModel[0].addShapeBox(0F, 0F, 0F, 29, 19, 24, 0F, 0F, -12F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -7.5F, 0F, -3F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -7.5F); // Import Box0
		bodyModel[0].setRotationPoint(-100F, -26F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 19, 24, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[1].setRotationPoint(-71F, -26F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 21, 2, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Import Box2
		bodyModel[2].setRotationPoint(-67F, -28F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 21, 2, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Import Box3
		bodyModel[3].setRotationPoint(-67F, -28F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Import Box4
		bodyModel[4].setRotationPoint(-67F, -9F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box5
		bodyModel[5].setRotationPoint(-62F, -21F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[6].setRotationPoint(-62F, -21F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[7].setRotationPoint(-62F, -9F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 16, 2, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[8].setRotationPoint(-53F, -21F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 16, 2, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box9
		bodyModel[9].setRotationPoint(-53F, -21F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 9, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[10].setRotationPoint(-53F, -9F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 11F, -4F, 0F, 11F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -4F, 0F, -11F, 4F, 0F, 0F, 0F); // Import Box11
		bodyModel[11].setRotationPoint(-67F, -28F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 11F, 4F, 0F, 11F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 4F, 0F, -11F, -4F, 0F, 0F, 0F); // Import Box12
		bodyModel[12].setRotationPoint(-67F, -28F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0F, 0F, 0F, 0F, 0.307F, 0F, 0F, 0.307F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.307F, 0F, 0F, -0.307F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[13].setRotationPoint(-58F, -39F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 0.307F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.307F, 0F, 0F, -0.307F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.307F, 0F); // Import Box14
		bodyModel[14].setRotationPoint(-56F, -39F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 0.307F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.307F, 0F, 0F, -0.307F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.307F, 0F); // Import Box15
		bodyModel[15].setRotationPoint(-56F, -39F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 17, 27, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[16].setRotationPoint(-44F, -31F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 17, 27, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[17].setRotationPoint(-44F, -31F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 28, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[18].setRotationPoint(-44F, -9F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[19].setRotationPoint(-45F, -41F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, -1F, 0F, -2F); // Import Box20
		bodyModel[20].setRotationPoint(-45F, -41F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, -1F, 0F, 2F); // Import Box21
		bodyModel[21].setRotationPoint(-45F, -41F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 20, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[22].setRotationPoint(-48F, -29F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[23].setRotationPoint(-61F, -13F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[24].setRotationPoint(-49F, -33F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[25].setRotationPoint(-47F, -33F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 21, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[26].setRotationPoint(-97F, -10F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 27, 2, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[27].setRotationPoint(-27F, -31F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 27, 2, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[28].setRotationPoint(-27F, -31F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[29].setRotationPoint(-43F, -41F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[30].setRotationPoint(-43F, -41F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[31].setRotationPoint(-26F, -51F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 57, 38, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[32].setRotationPoint(-16F, -42F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 57, 9, 24, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[33].setRotationPoint(-16F, -51F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 31, 9, 24, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[34].setRotationPoint(41F, -51F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 31, 38, 24, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box35
		bodyModel[35].setRotationPoint(41F, -42F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 25, 24, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -1F, 0F); // Import Box37
		bodyModel[36].setRotationPoint(87F, -32F, -12F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 20, 5, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Import Box38
		bodyModel[37].setRotationPoint(67F, -48F, -12F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 20, 6, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[38].setRotationPoint(67F, -43F, -17F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 20, 5, 24, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[39].setRotationPoint(67F, -37F, -12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 18, 5, 24, 0F, 0F, 0F, 5F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box41
		bodyModel[40].setRotationPoint(87F, -37F, -12F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 18, 6, 34, 0F, 0F, 0F, 0F, 0F, -7F, -11F, 0F, -7F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -8F, 0F, 3F, -8F, 0F, 0F, 0F); // Import Box42
		bodyModel[41].setRotationPoint(87F, -43F, -17F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 18, 5, 24, 0F, 0F, 0F, 0F, 0F, -10F, -9F, 0F, -10F, -9F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 7F, -6F, 0F, 7F, -6F, 0F, 0F, 5F); // Import Box43
		bodyModel[42].setRotationPoint(87F, -48F, -12F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		bodyModel[43].setRotationPoint(87F, -47F, -12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box45
		bodyModel[44].setRotationPoint(95F, -47F, -12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box46
		bodyModel[45].setRotationPoint(95F, -47F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		bodyModel[46].setRotationPoint(87F, -47F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 25, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box48
		bodyModel[47].setRotationPoint(72F, -32F, -12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 7, 12, 0F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box48
		bodyModel[48].setRotationPoint(-20F, -58F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box49
		bodyModel[49].setRotationPoint(-16F, -58F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[50].setRotationPoint(-9F, -61F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 15, 6, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box51
		bodyModel[51].setRotationPoint(45F, -43F, -16F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 13, 6, 32, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box52
		bodyModel[52].setRotationPoint(47F, -49F, -16F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 17, 6, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 2F, 0F, -6F); // Import Box53
		bodyModel[53].setRotationPoint(43F, -37F, -16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 29, 10, 16, 0F, 0F, 0F, 0F, 0F, -8F, -4.5F, 0F, -8F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Import Box54
		bodyModel[54].setRotationPoint(9F, -61F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box56
		bodyModel[55].setRotationPoint(105F, -34F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 4, 18, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box57
		bodyModel[56].setRotationPoint(105F, -38F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[57].setRotationPoint(109F, -34F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[58].setRotationPoint(109F, -36F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F); // Import Box61
		bodyModel[59].setRotationPoint(135F, -34F, -5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, -2F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F); // Import Box62
		bodyModel[60].setRotationPoint(135F, -36F, -5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 21, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box109
		bodyModel[61].setRotationPoint(-2.5F, -82F, -2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		bodyModel[62].setRotationPoint(-6F, -90F, -2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		bodyModel[63].setRotationPoint(-6F, -94F, -2.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		bodyModel[64].setRotationPoint(-4.5F, -90F, -9.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		bodyModel[65].setRotationPoint(-4.5F, -93F, -9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box114
		bodyModel[66].setRotationPoint(-4.5F, -87F, -9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box115
		bodyModel[67].setRotationPoint(-4.5F, -87F, 2.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		bodyModel[68].setRotationPoint(-4.5F, -90F, 2.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		bodyModel[69].setRotationPoint(-4.5F, -93F, 2.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		bodyModel[70].setRotationPoint(-4.5F, -92F, -7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		bodyModel[71].setRotationPoint(-36F, -26F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		bodyModel[72].setRotationPoint(-24F, -46F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		bodyModel[73].setRotationPoint(-22F, -46F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 20, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		bodyModel[74].setRotationPoint(-23F, -42F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 28, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		bodyModel[75].setRotationPoint(-44F, -18F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 19, 20, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box163
		bodyModel[76].setRotationPoint(-67F, -26F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 19, 20, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		bodyModel[77].setRotationPoint(-44F, -31F, -10F);

		bodyModel[78].addShapeBox(-3F, 0F, -3F, 6, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		bodyModel[78].setRotationPoint(0F, -68F, 0F);

		bodyModel[79].addShapeBox(3F, 0F, -3F, 8, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box120
		bodyModel[79].setRotationPoint(0F, -68F, 0F);

		bodyModel[80].addShapeBox(11F, 2F, -2F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		bodyModel[80].setRotationPoint(0F, -68F, 0F);

		bodyModel[81].addShapeBox(23F, 2F, -2F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Import Box122
		bodyModel[81].setRotationPoint(0F, -68F, 0F);

		bodyModel[82].addShapeBox(30F, 2F, -2F, 86, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		bodyModel[82].setRotationPoint(0F, -68F, 0F);

		bodyModel[83].addShapeBox(116F, 2F, -2F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		bodyModel[83].setRotationPoint(0F, -68F, 0F);

		bodyModel[84].addShapeBox(3F, 0F, -3F, 8, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box125
		bodyModel[84].setRotationPoint(0F, -68F, 0F);
		bodyModel[84].rotateAngleY = -1.57079633F;

		bodyModel[85].addShapeBox(11F, 2F, -2F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		bodyModel[85].setRotationPoint(0F, -68F, 0F);
		bodyModel[85].rotateAngleY = -1.57079633F;

		bodyModel[86].addShapeBox(23F, 2F, -2F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Import Box127
		bodyModel[86].setRotationPoint(0F, -68F, 0F);
		bodyModel[86].rotateAngleY = -1.57079633F;

		bodyModel[87].addShapeBox(30F, 2F, -2F, 86, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		bodyModel[87].setRotationPoint(0F, -68F, 0F);
		bodyModel[87].rotateAngleY = -1.57079633F;

		bodyModel[88].addShapeBox(116F, 2F, -2F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		bodyModel[88].setRotationPoint(0F, -68F, 0F);
		bodyModel[88].rotateAngleY = -1.57079633F;

		bodyModel[89].addShapeBox(3F, 0F, -3F, 8, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box130
		bodyModel[89].setRotationPoint(0F, -68F, 0F);
		bodyModel[89].rotateAngleY = -3.14159265F;

		bodyModel[90].addShapeBox(11F, 2F, -2F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		bodyModel[90].setRotationPoint(0F, -68F, 0F);
		bodyModel[90].rotateAngleY = -3.14159265F;

		bodyModel[91].addShapeBox(23F, 2F, -2F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Import Box132
		bodyModel[91].setRotationPoint(0F, -68F, 0F);
		bodyModel[91].rotateAngleY = -3.14159265F;

		bodyModel[92].addShapeBox(30F, 2F, -2F, 86, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[92].setRotationPoint(0F, -68F, 0F);
		bodyModel[92].rotateAngleY = -3.14159265F;

		bodyModel[93].addShapeBox(116F, 2F, -2F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		bodyModel[93].setRotationPoint(0F, -68F, 0F);
		bodyModel[93].rotateAngleY = -3.14159265F;

		bodyModel[94].addShapeBox(3F, 0F, -3F, 8, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box135
		bodyModel[94].setRotationPoint(0F, -68F, 0F);
		bodyModel[94].rotateAngleY = -4.71238898F;

		bodyModel[95].addShapeBox(11F, 2F, -2F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		bodyModel[95].setRotationPoint(0F, -68F, 0F);
		bodyModel[95].rotateAngleY = -4.71238898F;

		bodyModel[96].addShapeBox(23F, 2F, -2F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Import Box137
		bodyModel[96].setRotationPoint(0F, -68F, 0F);
		bodyModel[96].rotateAngleY = -4.71238898F;

		bodyModel[97].addShapeBox(30F, 2F, -2F, 86, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		bodyModel[97].setRotationPoint(0F, -68F, 0F);
		bodyModel[97].rotateAngleY = -4.71238898F;

		bodyModel[98].addShapeBox(116F, 2F, -2F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		bodyModel[98].setRotationPoint(0F, -68F, 0F);
		bodyModel[98].rotateAngleY = -4.71238898F;

		bodyModel[99].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		bodyModel[99].setRotationPoint(194F, -58F, 4F);

		bodyModel[100].addShapeBox(-1F, -25F, 9F, 4, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		bodyModel[100].setRotationPoint(194F, -58F, 4F);

		bodyModel[101].addShapeBox(-1F, -7F, 9F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[101].setRotationPoint(194F, -58F, 4F);

		bodyModel[102].addShapeBox(-3F, 7F, 9F, 4, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		bodyModel[102].setRotationPoint(194F, -58F, 4F);


		tailModel = new ModelRendererTurbo[14];
		tailModel[0] = new ModelRendererTurbo(this, 0, 1803, textureX, textureY); // Import Box55
		tailModel[1] = new ModelRendererTurbo(this, 0, 1848, textureX, textureY); // Import Box60
		tailModel[2] = new ModelRendererTurbo(this, 0, 1886, textureX, textureY); // Import Box63
		tailModel[3] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Import Box64
		tailModel[4] = new ModelRendererTurbo(this, 0, 1939, textureX, textureY); // Import Box65
		tailModel[5] = new ModelRendererTurbo(this, 0, 1963, textureX, textureY); // Import Box66
		tailModel[6] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box67
		tailModel[7] = new ModelRendererTurbo(this, 200, 72, textureX, textureY); // Import Box68
		tailModel[8] = new ModelRendererTurbo(this, 200, 95, textureX, textureY); // Import Box69
		tailModel[9] = new ModelRendererTurbo(this, 200, 95, textureX, textureY); // Import Box70
		tailModel[10] = new ModelRendererTurbo(this, 200, 72, textureX, textureY); // Import Box71
		tailModel[11] = new ModelRendererTurbo(this, 200, 110, textureX, textureY); // Import Box72
		tailModel[12] = new ModelRendererTurbo(this, 200, 125, textureX, textureY); // Import Box73
		tailModel[13] = new ModelRendererTurbo(this, 200, 125, textureX, textureY); // Import Box74

		tailModel[0].addShapeBox(0F, 0F, 0F, 30, 23, 18, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); // Import Box55
		tailModel[0].setRotationPoint(105F, -32F, -9F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 52, 20, 14, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -3F, -5F, -16F, -3F, -5F, 0F, 0F, 0F); // Import Box60
		tailModel[1].setRotationPoint(135F, -32F, -7F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 40, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, -14F, 0F, 0F); // Import Box63
		tailModel[2].setRotationPoint(129F, -15F, -2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 35, 6, 14, 0F, 0F, 0F, -1.6346F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1.6346F, 0F, -1.346F, -1.6346F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1.346F, -1.6346F); // Import Box64
		tailModel[3].setRotationPoint(152F, -36F, -7F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 8, 6, 14, 0F, 0F, 0F, -5F, 0F, 0F, -1.6346F, 0F, 0F, -1.6346F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1.346F, -1.6346F, 0F, -1.346F, -1.6346F, 0F, 0F, -5F); // Import Box65
		tailModel[4].setRotationPoint(144F, -36F, -7F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 35, 30, 14, 0F, -42F, 0F, -5F, 20F, 0F, -5F, 20F, 0F, -5F, -42F, 0F, -5F, 0F, 0F, -1.6346F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1.6346F); // Import Box66
		tailModel[5].setRotationPoint(152F, -66F, -7F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 14, 2, 66, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		tailModel[6].setRotationPoint(152F, -32F, -33F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 16, 14, 2, 0F, -16F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		tailModel[7].setRotationPoint(150F, -44.5F, -35F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 16, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F); // Import Box69
		tailModel[8].setRotationPoint(150F, -30.5F, -35F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 16, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F); // Import Box70
		tailModel[9].setRotationPoint(150F, -30.5F, 33F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 16, 14, 2, 0F, -16F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		tailModel[10].setRotationPoint(150F, -44.5F, 33F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box72
		tailModel[11].setRotationPoint(190F, -61F, 2F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box73
		tailModel[12].setRotationPoint(188F, -61F, 2F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box74
		tailModel[13].setRotationPoint(198F, -61F, 2F);


		leftWingModel = new ModelRendererTurbo[12];
		leftWingModel[0] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Import Box79
		leftWingModel[1] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box80
		leftWingModel[2] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Import Box81
		leftWingModel[3] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box82
		leftWingModel[4] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box83
		leftWingModel[5] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box84
		leftWingModel[6] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Import Box85
		leftWingModel[7] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import Box86
		leftWingModel[8] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Import Box87
		leftWingModel[9] = new ModelRendererTurbo(this, 200, 252, textureX, textureY); // Import Box88
		leftWingModel[10] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import Box89
		leftWingModel[11] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box90

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 21, 4, 20, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		leftWingModel[0].setRotationPoint(-16F, -31F, -32F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		leftWingModel[1].setRotationPoint(-11F, -31F, -45F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		leftWingModel[2].setRotationPoint(-5F, -25F, -44F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 33, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		leftWingModel[3].setRotationPoint(-16F, -21F, -46F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 41, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		leftWingModel[4].setRotationPoint(-20F, -20.5F, -45.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 41, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		leftWingModel[5].setRotationPoint(-20F, -20.5F, -42.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		leftWingModel[6].setRotationPoint(-5F, -28F, -32F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 30, 2, 8, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		leftWingModel[7].setRotationPoint(-17F, -24F, -35F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 30, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box87
		leftWingModel[8].setRotationPoint(-17F, -22F, -35F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 32, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, -2F); // Import Box88
		leftWingModel[9].setRotationPoint(-19F, -18F, -35F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		leftWingModel[10].setRotationPoint(-23F, -22F, -32F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Import Box90
		leftWingModel[11].setRotationPoint(-27F, -22F, -32F);


		rightWingModel = new ModelRendererTurbo[18];
		rightWingModel[0] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Import Box91
		rightWingModel[1] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box92
		rightWingModel[2] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Import Box93
		rightWingModel[3] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Import Box94
		rightWingModel[4] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box95
		rightWingModel[5] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box96
		rightWingModel[6] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box97
		rightWingModel[7] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import Box98
		rightWingModel[8] = new ModelRendererTurbo(this, 200, 305, textureX, textureY); // Import Box99
		rightWingModel[9] = new ModelRendererTurbo(this, 200, 314, textureX, textureY); // Import Box100
		rightWingModel[10] = new ModelRendererTurbo(this, 200, 314, textureX, textureY); // Import Box101
		rightWingModel[11] = new ModelRendererTurbo(this, 200, 305, textureX, textureY); // Import Box102
		rightWingModel[12] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import Box103
		rightWingModel[13] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Import Box104
		rightWingModel[14] = new ModelRendererTurbo(this, 200, 305, textureX, textureY); // Import Box105
		rightWingModel[15] = new ModelRendererTurbo(this, 200, 314, textureX, textureY); // Import Box106
		rightWingModel[16] = new ModelRendererTurbo(this, 200, 305, textureX, textureY); // Import Box107
		rightWingModel[17] = new ModelRendererTurbo(this, 200, 314, textureX, textureY); // Import Box108

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 21, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Import Box91
		rightWingModel[0].setRotationPoint(-16F, -31F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -5F, 3F, 0F); // Import Box92
		rightWingModel[1].setRotationPoint(-11F, -31F, 32F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		rightWingModel[2].setRotationPoint(-5F, -28F, 30F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		rightWingModel[3].setRotationPoint(-5F, -25F, 42F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 33, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		rightWingModel[4].setRotationPoint(-16F, -21F, 40F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 41, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		rightWingModel[5].setRotationPoint(-20F, -20.5F, 43.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 41, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		rightWingModel[6].setRotationPoint(-20F, -20.5F, 40.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		rightWingModel[7].setRotationPoint(-5F, -24F, 27F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		rightWingModel[8].setRotationPoint(-14F, -22F, 26F);

		rightWingModel[9].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box100
		rightWingModel[9].setRotationPoint(-16F, -22F, 26F);

		rightWingModel[10].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box101
		rightWingModel[10].setRotationPoint(-16F, -22F, 33F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		rightWingModel[11].setRotationPoint(-14F, -22F, 33F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		rightWingModel[12].setRotationPoint(-5F, -19F, 27F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box104
		rightWingModel[13].setRotationPoint(-5F, -22F, 30F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		rightWingModel[14].setRotationPoint(-14F, -17F, 26F);

		rightWingModel[15].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box106
		rightWingModel[15].setRotationPoint(-16F, -17F, 26F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		rightWingModel[16].setRotationPoint(-14F, -17F, 33F);

		rightWingModel[17].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box108
		rightWingModel[17].setRotationPoint(-16F, -17F, 33F);


		tailWheelModel = new ModelRendererTurbo[4];
		tailWheelModel[0] = new ModelRendererTurbo(this, 200, 325, textureX, textureY); // Import Box154
		tailWheelModel[1] = new ModelRendererTurbo(this, 200, 347, textureX, textureY); // Import Box155
		tailWheelModel[2] = new ModelRendererTurbo(this, 200, 357, textureX, textureY); // Import Box156
		tailWheelModel[3] = new ModelRendererTurbo(this, 200, 367, textureX, textureY); // Import Box157

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		tailWheelModel[0].setRotationPoint(146F, -7F, -1F);
		tailWheelModel[0].rotateAngleZ = 0.62831853F;

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box155
		tailWheelModel[1].setRotationPoint(149F, 6F, 1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		tailWheelModel[2].setRotationPoint(149F, 2F, 1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		tailWheelModel[3].setRotationPoint(149F, -2F, 1F);


		leftWingWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 377, textureX, textureY); // Import Box140
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 405, textureX, textureY); // Import Box141
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 411, textureX, textureY); // Import Box142
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 423, textureX, textureY); // Import Box143
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 200, 357, textureX, textureY); // Import Box144
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 200, 347, textureX, textureY); // Import Box145
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 200, 367, textureX, textureY); // Import Box146

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 8F, 11F, 0F, 8F, 11F, 0F, -8F, -11F, 0F, -8F); // Import Box140
		leftWingWheelModel[0].setRotationPoint(-44F, -21F, -14F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		leftWingWheelModel[1].setRotationPoint(-44F, -23F, -14F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		leftWingWheelModel[2].setRotationPoint(-33F, -2F, -22F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 4F, 0F, 11F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -4F, 0F, 11F, -4F, 0F); // Import Box143
		leftWingWheelModel[3].setRotationPoint(-33F, -2F, -20F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		leftWingWheelModel[4].setRotationPoint(-38F, 2F, -25F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box145
		leftWingWheelModel[5].setRotationPoint(-38F, 6F, -25F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		leftWingWheelModel[6].setRotationPoint(-38F, -2F, -25F);


		rightWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 405, textureX, textureY); // Import Box147
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 423, textureX, textureY); // Import Box148
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 377, textureX, textureY); // Import Box149
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 411, textureX, textureY); // Import Box150
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 367, textureX, textureY); // Import Box151
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 357, textureX, textureY); // Import Box152
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 347, textureX, textureY); // Import Box153

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		rightWingWheelModel[0].setRotationPoint(-44F, -23F, 12F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 11F, 4F, 0F, -11F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, -4F, 0F, -11F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		rightWingWheelModel[1].setRotationPoint(-33F, -2F, 12F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -8F, 11F, 0F, -8F, 11F, 0F, 8F, -11F, 0F, 8F); // Import Box149
		rightWingWheelModel[2].setRotationPoint(-44F, -21F, 12F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		rightWingWheelModel[3].setRotationPoint(-33F, -2F, 20F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		rightWingWheelModel[4].setRotationPoint(-38F, -2F, 22F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		rightWingWheelModel[5].setRotationPoint(-38F, 2F, 22F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box153
		rightWingWheelModel[6].setRotationPoint(-38F, 6F, 22F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}