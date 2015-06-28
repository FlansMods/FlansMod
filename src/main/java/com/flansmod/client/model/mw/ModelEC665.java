//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.10
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelEC665 extends ModelPlane
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelEC665()
	{
		bodyModel = new ModelRendererTurbo[78];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 75, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 127, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 178, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 30, 178, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 203, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 30, 230, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 30, 280, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 304, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 331, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 331, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 45, 375, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 0, 407, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 0, 457, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 0, 457, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 0, 585, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 40, 585, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 0, 617, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 0, 617, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 0, 626, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 0, 648, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 0, 717, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 0, 914, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 0, 947, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 0, 990, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1105, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1024, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1070, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1164, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1164, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1244, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1267, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1290, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 0, 1320, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 0, 1362, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 0, 1404, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1446, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1477, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1500, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1525, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1542, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1576, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1594, textureX, textureY); // Box 109
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1627, textureX, textureY); // Box 110
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1648, textureX, textureY); // Box 111
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Box 112
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Box 113
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Box 114
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Box 115
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Box 116
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Box 117
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 118
		bodyModel[71] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Box 158
		bodyModel[72] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 159
		bodyModel[73] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Box 160
		bodyModel[74] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Box 161
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1690, textureX, textureY); // Box 162
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1718, textureX, textureY); // Box 163
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1761, textureX, textureY); // Box 164

		bodyModel[0].addShapeBox(0F, 0F, 0F, 29, 19, 24, 0F, 0F, -12F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -7.5F, 0F, -3F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -7.5F); // Box 0
		bodyModel[0].setRotationPoint(-100F, -26F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 19, 24, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-71F, -26F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 21, 2, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-67F, -28F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 21, 2, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-67F, -28F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-67F, -9F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-62F, -21F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-62F, -21F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-62F, -9F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 16, 2, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-53F, -21F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 16, 2, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-53F, -21F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 9, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-53F, -9F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 11F, -4F, 0F, 11F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -4F, 0F, -11F, 4F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-67F, -28F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 11F, 4F, 0F, 11F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 4F, 0F, -11F, -4F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-67F, -28F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0F, 0F, 0F, 0F, 0.307F, 0F, 0F, 0.307F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.307F, 0F, 0F, -0.307F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-58F, -39F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 0.307F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.307F, 0F, 0F, -0.307F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.307F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-56F, -39F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 0.307F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.307F, 0F, 0F, -0.307F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.307F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-56F, -39F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 17, 27, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-44F, -31F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 17, 27, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-44F, -31F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 28, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-44F, -9F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-45F, -41F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, -1F, 0F, -2F); // Box 20
		bodyModel[20].setRotationPoint(-45F, -41F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, -1F, 0F, 2F); // Box 21
		bodyModel[21].setRotationPoint(-45F, -41F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 20, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-48F, -29F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-61F, -13F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-49F, -33F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(-47F, -33F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 21, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(-97F, -10F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 27, 2, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-27F, -31F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 27, 2, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-27F, -31F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-43F, -41F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-43F, -41F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-26F, -51F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 57, 38, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-16F, -42F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 57, 9, 24, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-16F, -51F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 31, 9, 24, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(41F, -51F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 31, 38, 24, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(41F, -42F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 25, 24, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -1F, 0F); // Box 37
		bodyModel[36].setRotationPoint(87F, -32F, -12F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 20, 5, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 38
		bodyModel[37].setRotationPoint(67F, -48F, -12F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 20, 6, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(67F, -43F, -17F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 20, 5, 24, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(67F, -37F, -12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 18, 5, 24, 0F, 0F, 0F, 5F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(87F, -37F, -12F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 18, 6, 34, 0F, 0F, 0F, 0F, 0F, -7F, -11F, 0F, -7F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -8F, 0F, 3F, -8F, 0F, 0F, 0F); // Box 42
		bodyModel[41].setRotationPoint(87F, -43F, -17F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 18, 5, 24, 0F, 0F, 0F, 0F, 0F, -10F, -9F, 0F, -10F, -9F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 7F, -6F, 0F, 7F, -6F, 0F, 0F, 5F); // Box 43
		bodyModel[42].setRotationPoint(87F, -48F, -12F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(87F, -47F, -12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 45
		bodyModel[44].setRotationPoint(95F, -47F, -12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 46
		bodyModel[45].setRotationPoint(95F, -47F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 11, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[46].setRotationPoint(87F, -47F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 25, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(72F, -32F, -12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 7, 12, 0F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 48
		bodyModel[48].setRotationPoint(-20F, -58F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(-16F, -58F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[50].setRotationPoint(-9F, -61F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 15, 6, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(45F, -43F, -16F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 13, 6, 32, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 52
		bodyModel[52].setRotationPoint(47F, -49F, -16F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 17, 6, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 2F, 0F, -6F); // Box 53
		bodyModel[53].setRotationPoint(43F, -37F, -16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 29, 10, 16, 0F, 0F, 0F, 0F, 0F, -8F, -4.5F, 0F, -8F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 54
		bodyModel[54].setRotationPoint(9F, -61F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 56
		bodyModel[55].setRotationPoint(105F, -34F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 4, 18, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 57
		bodyModel[56].setRotationPoint(105F, -38F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[57].setRotationPoint(109F, -34F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[58].setRotationPoint(109F, -36F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F); // Box 61
		bodyModel[59].setRotationPoint(135F, -34F, -5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, -2F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F); // Box 62
		bodyModel[60].setRotationPoint(135F, -36F, -5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 21, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[61].setRotationPoint(-2.5F, -82F, -2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[62].setRotationPoint(-6F, -90F, -2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[63].setRotationPoint(-6F, -94F, -2.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[64].setRotationPoint(-4.5F, -90F, -9.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[65].setRotationPoint(-4.5F, -93F, -9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 114
		bodyModel[66].setRotationPoint(-4.5F, -87F, -9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 115
		bodyModel[67].setRotationPoint(-4.5F, -87F, 2.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[68].setRotationPoint(-4.5F, -90F, 2.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[69].setRotationPoint(-4.5F, -93F, 2.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[70].setRotationPoint(-4.5F, -92F, -7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[71].setRotationPoint(-36F, -26F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[72].setRotationPoint(-24F, -46F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[73].setRotationPoint(-22F, -46F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 20, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[74].setRotationPoint(-23F, -42F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 28, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[75].setRotationPoint(-44F, -18F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 19, 20, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[76].setRotationPoint(-67F, -26F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 19, 20, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[77].setRotationPoint(-44F, -31F, -10F);


		tailModel = new ModelRendererTurbo[14];
		tailModel[0] = new ModelRendererTurbo(this, 0, 1803, textureX, textureY); // Box 55
		tailModel[1] = new ModelRendererTurbo(this, 0, 1848, textureX, textureY); // Box 60
		tailModel[2] = new ModelRendererTurbo(this, 0, 1886, textureX, textureY); // Box 63
		tailModel[3] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 64
		tailModel[4] = new ModelRendererTurbo(this, 0, 1939, textureX, textureY); // Box 65
		tailModel[5] = new ModelRendererTurbo(this, 0, 1963, textureX, textureY); // Box 66
		tailModel[6] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 67
		tailModel[7] = new ModelRendererTurbo(this, 200, 72, textureX, textureY); // Box 68
		tailModel[8] = new ModelRendererTurbo(this, 200, 95, textureX, textureY); // Box 69
		tailModel[9] = new ModelRendererTurbo(this, 200, 95, textureX, textureY); // Box 70
		tailModel[10] = new ModelRendererTurbo(this, 200, 72, textureX, textureY); // Box 71
		tailModel[11] = new ModelRendererTurbo(this, 200, 110, textureX, textureY); // Box 72
		tailModel[12] = new ModelRendererTurbo(this, 200, 125, textureX, textureY); // Box 73
		tailModel[13] = new ModelRendererTurbo(this, 200, 125, textureX, textureY); // Box 74

		tailModel[0].addShapeBox(0F, 0F, 0F, 30, 23, 18, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 55
		tailModel[0].setRotationPoint(105F, -32F, -9F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 52, 20, 14, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -3F, -5F, -16F, -3F, -5F, 0F, 0F, 0F); // Box 60
		tailModel[1].setRotationPoint(135F, -32F, -7F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 40, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, -14F, 0F, 0F); // Box 63
		tailModel[2].setRotationPoint(129F, -15F, -2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 35, 6, 14, 0F, 0F, 0F, -1.6346F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1.6346F, 0F, -1.346F, -1.6346F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1.346F, -1.6346F); // Box 64
		tailModel[3].setRotationPoint(152F, -36F, -7F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 8, 6, 14, 0F, 0F, 0F, -5F, 0F, 0F, -1.6346F, 0F, 0F, -1.6346F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1.346F, -1.6346F, 0F, -1.346F, -1.6346F, 0F, 0F, -5F); // Box 65
		tailModel[4].setRotationPoint(144F, -36F, -7F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 35, 30, 14, 0F, -42F, 0F, -5F, 20F, 0F, -5F, 20F, 0F, -5F, -42F, 0F, -5F, 0F, 0F, -1.6346F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1.6346F); // Box 66
		tailModel[5].setRotationPoint(152F, -66F, -7F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 14, 2, 66, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		tailModel[6].setRotationPoint(152F, -32F, -33F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 16, 14, 2, 0F, -16F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		tailModel[7].setRotationPoint(150F, -44.5F, -35F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 16, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F); // Box 69
		tailModel[8].setRotationPoint(150F, -30.5F, -35F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 16, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F); // Box 70
		tailModel[9].setRotationPoint(150F, -30.5F, 33F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 16, 14, 2, 0F, -16F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		tailModel[10].setRotationPoint(150F, -44.5F, 33F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		tailModel[11].setRotationPoint(190F, -61F, 2F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 73
		tailModel[12].setRotationPoint(188F, -61F, 2F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 74
		tailModel[13].setRotationPoint(198F, -61F, 2F);


		leftWingModel = new ModelRendererTurbo[12];
		leftWingModel[0] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 79
		leftWingModel[1] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 80
		leftWingModel[2] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Box 81
		leftWingModel[3] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Box 82
		leftWingModel[4] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Box 83
		leftWingModel[5] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Box 84
		leftWingModel[6] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Box 85
		leftWingModel[7] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 86
		leftWingModel[8] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Box 87
		leftWingModel[9] = new ModelRendererTurbo(this, 200, 252, textureX, textureY); // Box 88
		leftWingModel[10] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Box 89
		leftWingModel[11] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 90

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 21, 4, 20, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		leftWingModel[0].setRotationPoint(-16F, -31F, -32F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftWingModel[1].setRotationPoint(-11F, -31F, -45F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		leftWingModel[2].setRotationPoint(-5F, -25F, -44F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 33, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		leftWingModel[3].setRotationPoint(-16F, -21F, -46F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 41, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		leftWingModel[4].setRotationPoint(-20F, -20.5F, -45.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 41, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		leftWingModel[5].setRotationPoint(-20F, -20.5F, -42.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftWingModel[6].setRotationPoint(-5F, -28F, -32F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 30, 2, 8, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		leftWingModel[7].setRotationPoint(-17F, -24F, -35F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 30, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 87
		leftWingModel[8].setRotationPoint(-17F, -22F, -35F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 32, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, -2F); // Box 88
		leftWingModel[9].setRotationPoint(-19F, -18F, -35F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftWingModel[10].setRotationPoint(-23F, -22F, -32F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 90
		leftWingModel[11].setRotationPoint(-27F, -22F, -32F);


		rightWingModel = new ModelRendererTurbo[18];
		rightWingModel[0] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 91
		rightWingModel[1] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 92
		rightWingModel[2] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Box 93
		rightWingModel[3] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Box 94
		rightWingModel[4] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Box 95
		rightWingModel[5] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Box 96
		rightWingModel[6] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Box 97
		rightWingModel[7] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Box 98
		rightWingModel[8] = new ModelRendererTurbo(this, 200, 305, textureX, textureY); // Box 99
		rightWingModel[9] = new ModelRendererTurbo(this, 200, 314, textureX, textureY); // Box 100
		rightWingModel[10] = new ModelRendererTurbo(this, 200, 314, textureX, textureY); // Box 101
		rightWingModel[11] = new ModelRendererTurbo(this, 200, 305, textureX, textureY); // Box 102
		rightWingModel[12] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Box 103
		rightWingModel[13] = new ModelRendererTurbo(this, 200, 191, textureX, textureY); // Box 104
		rightWingModel[14] = new ModelRendererTurbo(this, 200, 305, textureX, textureY); // Box 105
		rightWingModel[15] = new ModelRendererTurbo(this, 200, 314, textureX, textureY); // Box 106
		rightWingModel[16] = new ModelRendererTurbo(this, 200, 305, textureX, textureY); // Box 107
		rightWingModel[17] = new ModelRendererTurbo(this, 200, 314, textureX, textureY); // Box 108

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 21, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 91
		rightWingModel[0].setRotationPoint(-16F, -31F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -5F, 3F, 0F); // Box 92
		rightWingModel[1].setRotationPoint(-11F, -31F, 32F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		rightWingModel[2].setRotationPoint(-5F, -28F, 30F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		rightWingModel[3].setRotationPoint(-5F, -25F, 42F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 33, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		rightWingModel[4].setRotationPoint(-16F, -21F, 40F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 41, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		rightWingModel[5].setRotationPoint(-20F, -20.5F, 43.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 41, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		rightWingModel[6].setRotationPoint(-20F, -20.5F, 40.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		rightWingModel[7].setRotationPoint(-5F, -24F, 27F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rightWingModel[8].setRotationPoint(-14F, -22F, 26F);

		rightWingModel[9].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 100
		rightWingModel[9].setRotationPoint(-16F, -22F, 26F);

		rightWingModel[10].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 101
		rightWingModel[10].setRotationPoint(-16F, -22F, 33F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightWingModel[11].setRotationPoint(-14F, -22F, 33F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightWingModel[12].setRotationPoint(-5F, -19F, 27F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		rightWingModel[13].setRotationPoint(-5F, -22F, 30F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightWingModel[14].setRotationPoint(-14F, -17F, 26F);

		rightWingModel[15].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 106
		rightWingModel[15].setRotationPoint(-16F, -17F, 26F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		rightWingModel[16].setRotationPoint(-14F, -17F, 33F);

		rightWingModel[17].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 108
		rightWingModel[17].setRotationPoint(-16F, -17F, 33F);


		tailWheelModel = new ModelRendererTurbo[4];
		tailWheelModel[0] = new ModelRendererTurbo(this, 200, 325, textureX, textureY); // Box 154
		tailWheelModel[1] = new ModelRendererTurbo(this, 200, 347, textureX, textureY); // Box 155
		tailWheelModel[2] = new ModelRendererTurbo(this, 200, 357, textureX, textureY); // Box 156
		tailWheelModel[3] = new ModelRendererTurbo(this, 200, 367, textureX, textureY); // Box 157

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		tailWheelModel[0].setRotationPoint(146F, -7F, -1F);
		tailWheelModel[0].rotateAngleZ = 0.62831853F;

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 155
		tailWheelModel[1].setRotationPoint(149F, 6F, 1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		tailWheelModel[2].setRotationPoint(149F, 2F, 1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		tailWheelModel[3].setRotationPoint(149F, -2F, 1F);


		leftWingWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 377, textureX, textureY); // Box 140
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 405, textureX, textureY); // Box 141
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 411, textureX, textureY); // Box 142
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 423, textureX, textureY); // Box 143
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 200, 357, textureX, textureY); // Box 144
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 200, 347, textureX, textureY); // Box 145
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 200, 367, textureX, textureY); // Box 146

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 8F, 11F, 0F, 8F, 11F, 0F, -8F, -11F, 0F, -8F); // Box 140
		leftWingWheelModel[0].setRotationPoint(-44F, -21F, -14F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		leftWingWheelModel[1].setRotationPoint(-44F, -23F, -14F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		leftWingWheelModel[2].setRotationPoint(-33F, -2F, -22F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 4F, 0F, 11F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -4F, 0F, 11F, -4F, 0F); // Box 143
		leftWingWheelModel[3].setRotationPoint(-33F, -2F, -20F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		leftWingWheelModel[4].setRotationPoint(-38F, 2F, -25F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 145
		leftWingWheelModel[5].setRotationPoint(-38F, 6F, -25F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		leftWingWheelModel[6].setRotationPoint(-38F, -2F, -25F);


		rightWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 405, textureX, textureY); // Box 147
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 423, textureX, textureY); // Box 148
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 377, textureX, textureY); // Box 149
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 411, textureX, textureY); // Box 150
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 367, textureX, textureY); // Box 151
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 357, textureX, textureY); // Box 152
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 347, textureX, textureY); // Box 153

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		rightWingWheelModel[0].setRotationPoint(-44F, -23F, 12F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 11F, 4F, 0F, -11F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, -4F, 0F, -11F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		rightWingWheelModel[1].setRotationPoint(-33F, -2F, 12F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -8F, 11F, 0F, -8F, 11F, 0F, 8F, -11F, 0F, 8F); // Box 149
		rightWingWheelModel[2].setRotationPoint(-44F, -21F, 12F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		rightWingWheelModel[3].setRotationPoint(-33F, -2F, 20F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		rightWingWheelModel[4].setRotationPoint(-38F, -2F, 22F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		rightWingWheelModel[5].setRotationPoint(-38F, 2F, 22F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 153
		rightWingWheelModel[6].setRotationPoint(-38F, 6F, 22F);


		heliMainRotorModels = new ModelRendererTurbo[1][21];
		heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 200, 440, textureX, textureY); // Box 119
		heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 200, 455, textureX, textureY); // Box 120
		heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Box 121
		heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 200, 482, textureX, textureY); // Box 122
		heliMainRotorModels[0][4] = new ModelRendererTurbo(this, 200, 493, textureX, textureY); // Box 123
		heliMainRotorModels[0][5] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Box 124
		heliMainRotorModels[0][6] = new ModelRendererTurbo(this, 200, 455, textureX, textureY); // Box 125
		heliMainRotorModels[0][7] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Box 126
		heliMainRotorModels[0][8] = new ModelRendererTurbo(this, 200, 482, textureX, textureY); // Box 127
		heliMainRotorModels[0][9] = new ModelRendererTurbo(this, 200, 493, textureX, textureY); // Box 128
		heliMainRotorModels[0][10] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Box 129
		heliMainRotorModels[0][11] = new ModelRendererTurbo(this, 200, 455, textureX, textureY); // Box 130
		heliMainRotorModels[0][12] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Box 131
		heliMainRotorModels[0][13] = new ModelRendererTurbo(this, 200, 482, textureX, textureY); // Box 132
		heliMainRotorModels[0][14] = new ModelRendererTurbo(this, 200, 493, textureX, textureY); // Box 133
		heliMainRotorModels[0][15] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Box 134
		heliMainRotorModels[0][16] = new ModelRendererTurbo(this, 200, 455, textureX, textureY); // Box 135
		heliMainRotorModels[0][17] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Box 136
		heliMainRotorModels[0][18] = new ModelRendererTurbo(this, 200, 482, textureX, textureY); // Box 137
		heliMainRotorModels[0][19] = new ModelRendererTurbo(this, 200, 493, textureX, textureY); // Box 138
		heliMainRotorModels[0][20] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Box 139

		heliMainRotorModels[0][0].addShapeBox(-3F, 0F, -3F, 6, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		heliMainRotorModels[0][0].setRotationPoint(0F, -68F, 0F);

		heliMainRotorModels[0][1].addShapeBox(3F, 0F, -3F, 8, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 120
		heliMainRotorModels[0][1].setRotationPoint(0F, -68F, 0F);

		heliMainRotorModels[0][2].addShapeBox(11F, 2F, -2F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		heliMainRotorModels[0][2].setRotationPoint(0F, -68F, 0F);

		heliMainRotorModels[0][3].addShapeBox(23F, 2F, -2F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 122
		heliMainRotorModels[0][3].setRotationPoint(0F, -68F, 0F);

		heliMainRotorModels[0][4].addShapeBox(30F, 2F, -2F, 86, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		heliMainRotorModels[0][4].setRotationPoint(0F, -68F, 0F);

		heliMainRotorModels[0][5].addShapeBox(116F, 2F, -2F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		heliMainRotorModels[0][5].setRotationPoint(0F, -68F, 0F);

		heliMainRotorModels[0][6].addShapeBox(3F, 0F, -3F, 8, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 125
		heliMainRotorModels[0][6].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][6].rotateAngleY = -1.57079633F;

		heliMainRotorModels[0][7].addShapeBox(11F, 2F, -2F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		heliMainRotorModels[0][7].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][7].rotateAngleY = -1.57079633F;

		heliMainRotorModels[0][8].addShapeBox(23F, 2F, -2F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 127
		heliMainRotorModels[0][8].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][8].rotateAngleY = -1.57079633F;

		heliMainRotorModels[0][9].addShapeBox(30F, 2F, -2F, 86, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		heliMainRotorModels[0][9].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][9].rotateAngleY = -1.57079633F;

		heliMainRotorModels[0][10].addShapeBox(116F, 2F, -2F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		heliMainRotorModels[0][10].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][10].rotateAngleY = -1.57079633F;

		heliMainRotorModels[0][11].addShapeBox(3F, 0F, -3F, 8, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 130
		heliMainRotorModels[0][11].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][11].rotateAngleY = -3.14159265F;

		heliMainRotorModels[0][12].addShapeBox(11F, 2F, -2F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		heliMainRotorModels[0][12].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][12].rotateAngleY = -3.14159265F;

		heliMainRotorModels[0][13].addShapeBox(23F, 2F, -2F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 132
		heliMainRotorModels[0][13].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][13].rotateAngleY = -3.14159265F;

		heliMainRotorModels[0][14].addShapeBox(30F, 2F, -2F, 86, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		heliMainRotorModels[0][14].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][14].rotateAngleY = -3.14159265F;

		heliMainRotorModels[0][15].addShapeBox(116F, 2F, -2F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		heliMainRotorModels[0][15].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][15].rotateAngleY = -3.14159265F;

		heliMainRotorModels[0][16].addShapeBox(3F, 0F, -3F, 8, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 135
		heliMainRotorModels[0][16].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][16].rotateAngleY = -4.71238898F;

		heliMainRotorModels[0][17].addShapeBox(11F, 2F, -2F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		heliMainRotorModels[0][17].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][17].rotateAngleY = -4.71238898F;

		heliMainRotorModels[0][18].addShapeBox(23F, 2F, -2F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 137
		heliMainRotorModels[0][18].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][18].rotateAngleY = -4.71238898F;

		heliMainRotorModels[0][19].addShapeBox(30F, 2F, -2F, 86, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		heliMainRotorModels[0][19].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][19].rotateAngleY = -4.71238898F;

		heliMainRotorModels[0][20].addShapeBox(116F, 2F, -2F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		heliMainRotorModels[0][20].setRotationPoint(0F, -68F, 0F);
		heliMainRotorModels[0][20].rotateAngleY = -4.71238898F;


		heliTailRotorModels = new ModelRendererTurbo[1][4];
		heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 200, 527, textureX, textureY); // Box 75
		heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 200, 543, textureX, textureY); // Box 76
		heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 200, 564, textureX, textureY); // Box 77
		heliTailRotorModels[0][3] = new ModelRendererTurbo(this, 200, 543, textureX, textureY); // Box 78

		heliTailRotorModels[0][0].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		heliTailRotorModels[0][0].setRotationPoint(194F, -58F, 4F);
		
		heliTailRotorModels[0][1].addShapeBox(-1F, -25F, 9F, 4, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		heliTailRotorModels[0][1].setRotationPoint(194F, -58F, 4F);
		
		heliTailRotorModels[0][2].addShapeBox(-1F, -7F, 9F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		heliTailRotorModels[0][2].setRotationPoint(194F, -58F, 4F);
		
		heliTailRotorModels[0][3].addShapeBox(-3F, 7F, 9F, 4, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		heliTailRotorModels[0][3].setRotationPoint(194F, -58F, 4F);


		heliMainRotorOrigins = new Vector3f[] { new Vector3f(0F / 16F, 0F / 16F, 0F / 16F) };

		heliTailRotorOrigins = new Vector3f[] { new Vector3f(194F / 16F, 58F / 16F, 4F / 16F) };
		
		heliRotorSpeeds = new float[] { 1F };

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
