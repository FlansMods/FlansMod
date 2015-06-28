//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelPanzerIILuchs extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelPanzerIILuchs()
	{
		bodyModel = new ModelRendererTurbo[81];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 91, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 59, 92, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 83, 133, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 0, 266, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 0, 266, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 58, 254, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 58, 254, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 85, 253, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 85, 253, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 0, 277, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 0, 277, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 0, 289, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 0, 312, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 0, 289, textureX, textureY); // Box 31
		bodyModel[21] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 0, 312, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 42
		bodyModel[28] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 43
		bodyModel[29] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 44
		bodyModel[30] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 45
		bodyModel[31] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 46
		bodyModel[32] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 48
		bodyModel[34] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 49
		bodyModel[35] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 50
		bodyModel[36] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 51
		bodyModel[37] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 52
		bodyModel[38] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 56
		bodyModel[39] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 57
		bodyModel[40] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 58
		bodyModel[41] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 59
		bodyModel[42] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 60
		bodyModel[43] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 61
		bodyModel[44] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 62
		bodyModel[45] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 64
		bodyModel[47] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 65
		bodyModel[48] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 66
		bodyModel[49] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 67
		bodyModel[50] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 68
		bodyModel[51] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 69
		bodyModel[52] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 70
		bodyModel[53] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 71
		bodyModel[54] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 72
		bodyModel[55] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 73
		bodyModel[56] = new ModelRendererTurbo(this, 32, 277, textureX, textureY); // Box 74
		bodyModel[57] = new ModelRendererTurbo(this, 65, 277, textureX, textureY); // Box 75
		bodyModel[58] = new ModelRendererTurbo(this, 98, 277, textureX, textureY); // Box 76
		bodyModel[59] = new ModelRendererTurbo(this, 198, 29, textureX, textureY); // Box 106
		bodyModel[60] = new ModelRendererTurbo(this, 198, 29, textureX, textureY); // Box 107
		bodyModel[61] = new ModelRendererTurbo(this, 197, 29, textureX, textureY); // Box 108
		bodyModel[62] = new ModelRendererTurbo(this, 197, 29, textureX, textureY); // Box 109
		bodyModel[63] = new ModelRendererTurbo(this, 0, 56, textureX, textureY); // Box 110
		bodyModel[64] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 111
		bodyModel[65] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 112
		bodyModel[66] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 113
		bodyModel[67] = new ModelRendererTurbo(this, 0, 88, textureX, textureY); // Box 114
		bodyModel[68] = new ModelRendererTurbo(this, 0, 126, textureX, textureY); // Box 115
		bodyModel[69] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 116
		bodyModel[70] = new ModelRendererTurbo(this, 12, 57, textureX, textureY); // Box 117
		bodyModel[71] = new ModelRendererTurbo(this, 12, 57, textureX, textureY); // Box 118
		bodyModel[72] = new ModelRendererTurbo(this, 0, 106, textureX, textureY); // Box 119
		bodyModel[73] = new ModelRendererTurbo(this, 54, 174, textureX, textureY); // Box 121
		bodyModel[74] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 122
		bodyModel[75] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 123
		bodyModel[76] = new ModelRendererTurbo(this, 102, 194, textureX, textureY); // Box 124
		bodyModel[77] = new ModelRendererTurbo(this, 42, 217, textureX, textureY); // Box 125
		bodyModel[78] = new ModelRendererTurbo(this, 42, 217, textureX, textureY); // Box 126
		bodyModel[79] = new ModelRendererTurbo(this, 42, 217, textureX, textureY); // Box 127
		bodyModel[80] = new ModelRendererTurbo(this, 157, 115, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 80, 13, 30, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-6F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -9F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 4, 30, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(26F, -13F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 66, 4, 30, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-40F, -13F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 27, 6, 34, 0F,0F, 0F, 0F,-1F, 0F, -2F,-1F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-1F, -19F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 24, 6, 34, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-25F, -19F, -17F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 29, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-29F, -17F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 3, 29, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-41F, -16F, -15F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 18
		bodyModel[7].setRotationPoint(25F, -17F, -11F);
		bodyModel[7].rotateAngleZ = 0.13962634F;

		bodyModel[8].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 19
		bodyModel[8].setRotationPoint(25F, -17F, 3F);
		bodyModel[8].rotateAngleZ = 0.13962634F;

		bodyModel[9].addBox(0F, 0F, 0F, 62, 1, 9, 0F); // Box 20
		bodyModel[9].setRotationPoint(-30F, -13F, -24F);

		bodyModel[10].addBox(0F, 0F, 0F, 62, 1, 9, 0F); // Box 21
		bodyModel[10].setRotationPoint(-30F, -13F, 15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(32F, -13F, -24F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(32F, -13F, 15F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F); // Box 24
		bodyModel[13].setRotationPoint(41F, -11F, 15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F); // Box 25
		bodyModel[14].setRotationPoint(41F, -11F, -24F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,0F, 0F, 0F,0F, 9F, 0F,0F, 9F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -9F, 0F,0F, -9F, 0F,0F, 0F, 0F); // Box 26
		bodyModel[15].setRotationPoint(-41F, -4F, 15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,0F, 0F, 0F,0F, 9F, 0F,0F, 9F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -9F, 0F,0F, -9F, 0F,0F, 0F, 0F); // Box 27
		bodyModel[16].setRotationPoint(-41F, -4F, -24F);

		bodyModel[17].addShapeBox(-6F, -6F, -7F, 12, 4, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(35F, -1F, -15F);

		bodyModel[18].addShapeBox(-6F, 2F, -7F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 29
		bodyModel[18].setRotationPoint(35F, -1F, -15F);

		bodyModel[19].addBox(-6F, -2F, -7F, 12, 4, 6, 0F); // Box 30
		bodyModel[19].setRotationPoint(35F, -1F, -15F);

		bodyModel[20].addShapeBox(-6F, -6F, 1F, 12, 4, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 31
		bodyModel[20].setRotationPoint(35F, -1F, 15F);

		bodyModel[21].addBox(-6F, -2F, 1F, 12, 4, 6, 0F); // Box 32
		bodyModel[21].setRotationPoint(35F, -1F, 15F);

		bodyModel[22].addShapeBox(-6F, 2F, 1F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 33
		bodyModel[22].setRotationPoint(35F, -1F, 15F);

		bodyModel[23].addShapeBox(-6F, -6F, -4F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 35
		bodyModel[23].setRotationPoint(23F, 3F, -15F);

		bodyModel[24].addBox(-6F, -2F, -4F, 12, 4, 4, 0F); // Box 36
		bodyModel[24].setRotationPoint(23F, 3F, -15F);

		bodyModel[25].addShapeBox(-6F, 2F, -4F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 37
		bodyModel[25].setRotationPoint(23F, 3F, -15F);

		bodyModel[26].addShapeBox(-6F, -6F, -4F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 41
		bodyModel[26].setRotationPoint(14F, 3F, -19F);

		bodyModel[27].addBox(-6F, -2F, -4F, 12, 4, 4, 0F); // Box 42
		bodyModel[27].setRotationPoint(14F, 3F, -19F);

		bodyModel[28].addShapeBox(-6F, 2F, -4F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 43
		bodyModel[28].setRotationPoint(14F, 3F, -19F);

		bodyModel[29].addShapeBox(-6F, -6F, -4F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 44
		bodyModel[29].setRotationPoint(3F, 3F, -15F);

		bodyModel[30].addBox(-6F, -2F, -4F, 12, 4, 4, 0F); // Box 45
		bodyModel[30].setRotationPoint(3F, 3F, -15F);

		bodyModel[31].addShapeBox(-6F, 2F, -4F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 46
		bodyModel[31].setRotationPoint(3F, 3F, -15F);

		bodyModel[32].addShapeBox(-6F, -6F, -4F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 47
		bodyModel[32].setRotationPoint(-18F, 3F, -15F);

		bodyModel[33].addBox(-6F, -2F, -4F, 12, 4, 4, 0F); // Box 48
		bodyModel[33].setRotationPoint(-18F, 3F, -15F);

		bodyModel[34].addShapeBox(-6F, 2F, -4F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 49
		bodyModel[34].setRotationPoint(-18F, 3F, -15F);

		bodyModel[35].addShapeBox(-6F, -6F, -4F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 50
		bodyModel[35].setRotationPoint(-7F, 3F, -19F);

		bodyModel[36].addBox(-6F, -2F, -4F, 12, 4, 4, 0F); // Box 51
		bodyModel[36].setRotationPoint(-7F, 3F, -19F);

		bodyModel[37].addShapeBox(-6F, 2F, -4F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 52
		bodyModel[37].setRotationPoint(-7F, 3F, -19F);

		bodyModel[38].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 56
		bodyModel[38].setRotationPoint(23F, 3F, 15F);

		bodyModel[39].addBox(-6F, -2F, 0F, 12, 4, 4, 0F); // Box 57
		bodyModel[39].setRotationPoint(23F, 3F, 15F);

		bodyModel[40].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 58
		bodyModel[40].setRotationPoint(23F, 3F, 15F);

		bodyModel[41].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 59
		bodyModel[41].setRotationPoint(14F, 3F, 19F);

		bodyModel[42].addBox(-6F, -2F, 0F, 12, 4, 4, 0F); // Box 60
		bodyModel[42].setRotationPoint(14F, 3F, 19F);

		bodyModel[43].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 61
		bodyModel[43].setRotationPoint(14F, 3F, 19F);

		bodyModel[44].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 62
		bodyModel[44].setRotationPoint(3F, 3F, 15F);

		bodyModel[45].addBox(-6F, -2F, 0F, 12, 4, 4, 0F); // Box 63
		bodyModel[45].setRotationPoint(3F, 3F, 15F);

		bodyModel[46].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 64
		bodyModel[46].setRotationPoint(3F, 3F, 15F);

		bodyModel[47].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 65
		bodyModel[47].setRotationPoint(-7F, 3F, 19F);

		bodyModel[48].addBox(-6F, -2F, 0F, 12, 4, 4, 0F); // Box 66
		bodyModel[48].setRotationPoint(-7F, 3F, 19F);

		bodyModel[49].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 67
		bodyModel[49].setRotationPoint(-7F, 3F, 19F);

		bodyModel[50].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 68
		bodyModel[50].setRotationPoint(-18F, 3F, 15F);

		bodyModel[51].addBox(-6F, -2F, 0F, 12, 4, 4, 0F); // Box 69
		bodyModel[51].setRotationPoint(-18F, 3F, 15F);

		bodyModel[52].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 70
		bodyModel[52].setRotationPoint(-18F, 3F, 15F);

		bodyModel[53].addShapeBox(-6F, -6F, -4F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 71
		bodyModel[53].setRotationPoint(-29F, 1F, -18F);

		bodyModel[54].addBox(-6F, -2F, -4F, 12, 4, 4, 0F); // Box 72
		bodyModel[54].setRotationPoint(-29F, 1F, -18F);

		bodyModel[55].addShapeBox(-6F, 2F, -4F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 73
		bodyModel[55].setRotationPoint(-29F, 1F, -18F);

		bodyModel[56].addShapeBox(-6F, -6F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 74
		bodyModel[56].setRotationPoint(-29F, 1F, 18F);

		bodyModel[57].addBox(-6F, -2F, 0F, 12, 4, 4, 0F); // Box 75
		bodyModel[57].setRotationPoint(-29F, 1F, 18F);

		bodyModel[58].addShapeBox(-6F, 2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 76
		bodyModel[58].setRotationPoint(-29F, 1F, 18F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 38, 0F); // Box 106
		bodyModel[59].setRotationPoint(13F, 2F, -19F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 38, 0F); // Box 107
		bodyModel[60].setRotationPoint(-8F, 2F, -19F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 2, 38, 0F); // Box 108
		bodyModel[61].setRotationPoint(-30F, 0F, -19F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 2, 38, 0F); // Box 109
		bodyModel[62].setRotationPoint(34F, -2F, -19F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 110
		bodyModel[63].setRotationPoint(19F, -12F, -17F);
		bodyModel[63].rotateAngleZ = 0.19198622F;

		bodyModel[64].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 111
		bodyModel[64].setRotationPoint(19F, -12F, 15F);
		bodyModel[64].rotateAngleZ = 0.19198622F;

		bodyModel[65].addBox(-3F, 0F, 0F, 3, 14, 2, 0F); // Box 112
		bodyModel[65].setRotationPoint(-14F, -12F, 15F);
		bodyModel[65].rotateAngleZ = -0.19198622F;

		bodyModel[66].addBox(-3F, 0F, 0F, 3, 14, 2, 0F); // Box 113
		bodyModel[66].setRotationPoint(-14F, -12F, -17F);
		bodyModel[66].rotateAngleZ = -0.19198622F;

		bodyModel[67].addBox(-1F, 0F, 0F, 3, 7, 10, 0F); // Box 114
		bodyModel[67].setRotationPoint(-42F, -15F, 3F);
		bodyModel[67].rotateAngleZ = 0.36651914F;

		bodyModel[68].addShapeBox(-2F, 0F, 0F, 1, 7, 10, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Box 115
		bodyModel[68].setRotationPoint(-42F, -15F, 3F);
		bodyModel[68].rotateAngleZ = 0.36651914F;

		bodyModel[69].addBox(-1F, 1F, 10F, 2, 2, 1, 0F); // Box 116
		bodyModel[69].setRotationPoint(-42F, -15F, 3F);
		bodyModel[69].rotateAngleZ = 0.2268928F;

		bodyModel[70].addBox(-1F, 1F, 0F, 4, 6, 4, 0F); // Box 117
		bodyModel[70].setRotationPoint(-43F, -15F, -13F);
		bodyModel[70].rotateAngleZ = 0.34906585F;

		bodyModel[71].addBox(-1F, 1F, 5F, 4, 6, 4, 0F); // Box 118
		bodyModel[71].setRotationPoint(-43F, -15F, -13F);
		bodyModel[71].rotateAngleZ = 0.34906585F;

		bodyModel[72].addBox(-1F, 1F, 0F, 5, 4, 10, 0F); // Box 119
		bodyModel[72].setRotationPoint(-43F, -13F, -13.5F);
		bodyModel[72].rotateAngleZ = 0.34906585F;

		bodyModel[73].addBox(0F, 0F, 0F, 28, 4, 6, 0F); // Box 121
		bodyModel[73].setRotationPoint(-29F, -16.5F, -23.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 122
		bodyModel[74].setRotationPoint(18F, -17F, 15F);
		bodyModel[74].rotateAngleY = -0.08726646F;

		bodyModel[75].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 123
		bodyModel[75].setRotationPoint(18F, -17F, -16F);
		bodyModel[75].rotateAngleY = 0.08726646F;

		bodyModel[76].addBox(0F, 0F, 0F, 12, 5, 7, 0F); // Box 124
		bodyModel[76].setRotationPoint(-38F, -17.5F, 14.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 12, 5, 6, 0F); // Box 125
		bodyModel[77].setRotationPoint(-25F, -18F, 17.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 12, 5, 6, 0F); // Box 126
		bodyModel[78].setRotationPoint(-12F, -18F, 17.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 12, 5, 6, 0F); // Box 127
		bodyModel[79].setRotationPoint(1F, -18F, 17.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 7, 1, 26, 0F); // Box 0
		bodyModel[80].setRotationPoint(-40F, -17F, -13F);
		bodyModel[80].rotateAngleZ = 0.05235988F;


		turretModel = new ModelRendererTurbo[6];
		turretModel[0] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 7
		turretModel[1] = new ModelRendererTurbo(this, 61, 185, textureX, textureY); // Box 8
		turretModel[2] = new ModelRendererTurbo(this, 63, 216, textureX, textureY); // Box 9
		turretModel[3] = new ModelRendererTurbo(this, 148, 101, textureX, textureY); // Box 120
		turretModel[4] = new ModelRendererTurbo(this, 63, 216, textureX, textureY); // Box 0
		turretModel[5] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 1

		turretModel[0].addShapeBox(-9F, -9F, -11F, 9, 7, 22, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,4F, 0F, 0F,0F, 2F, 3F,0F, 2F, 3F,4F, 0F, 0F); // Box 7
		turretModel[0].setRotationPoint(0F, -19F, 0F);

		turretModel[1].addShapeBox(0F, -9F, -11F, 9, 8, 22, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 0F, 3F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 3F); // Box 8
		turretModel[1].setRotationPoint(0F, -18F, 0F);

		turretModel[2].addShapeBox(9F, -9F, -11F, 6, 6, 22, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 2F, 2F,2F, 0F, 0F,2F, 0F, 0F,0F, 2F, 2F); // Box 9
		turretModel[2].setRotationPoint(0F, -18F, 0F);

		turretModel[3].addShapeBox(-5F, -10F, -5F, 10, 2, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 120
		turretModel[3].setRotationPoint(0F, -19F, 0F);

		turretModel[4].addShapeBox(9F, -4F, -11F, 6, 3, 22, 0F,0F, -3F, 2F,2F, -1F, 0F,2F, -1F, 0F,0F, -3F, 2F,0F, 0F, 2F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 2F); // Box 0
		turretModel[4].setRotationPoint(0F, -18F, 0F);

		turretModel[5].addShapeBox(-9F, -4F, -11F, 9, 3, 22, 0F,4F, -1F, 0F,0F, -3F, 3F,0F, -3F, 3F,4F, -1F, 0F,2F, 0F, -1F,0F, 0F, 3F,0F, 0F, 3F,2F, 0F, -1F); // Box 1
		turretModel[5].setRotationPoint(0F, -18F, 0F);


		barrelModel = new ModelRendererTurbo[8];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 149, textureX, textureY); // Box 10
		barrelModel[1] = new ModelRendererTurbo(this, 0, 242, textureX, textureY); // Box 11
		barrelModel[2] = new ModelRendererTurbo(this, 23, 239, textureX, textureY); // Box 12
		barrelModel[3] = new ModelRendererTurbo(this, 0, 29, textureX, textureY); // Box 13
		barrelModel[4] = new ModelRendererTurbo(this, 12, 27, textureX, textureY); // Box 14
		barrelModel[5] = new ModelRendererTurbo(this, 0, 41, textureX, textureY); // Box 15
		barrelModel[6] = new ModelRendererTurbo(this, 16, 32, textureX, textureY); // Box 16
		barrelModel[7] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 17

		barrelModel[0].addBox(15F, -6F, -7F, 2, 3, 14, 0F); // Box 10
		barrelModel[0].setRotationPoint(0F, -17.5F, 0F);

		barrelModel[1].addShapeBox(-0.5F, -3F, -10F, 1, 3, 20, 0F,0.75F, 0F, -1F,-0.75F, 0F, -1F,-0.75F, 0F, -1F,0.75F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 11
		barrelModel[1].setRotationPoint(17F, -22F, 0F);

		barrelModel[2].addShapeBox(-0.5F, 0F, -10F, 1, 2, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 12
		barrelModel[2].setRotationPoint(17F, -22F, 0F);

		barrelModel[3].addBox(0F, -2F, -1.5F, 4, 3, 3, 0F); // Box 13
		barrelModel[3].setRotationPoint(17F, -21.5F, 0F);

		barrelModel[4].addBox(4F, -1.5F, -1F, 2, 2, 2, 0F); // Box 14
		barrelModel[4].setRotationPoint(17F, -21.5F, 0F);

		barrelModel[5].addBox(6F, -1F, -0.5F, 18, 1, 1, 0F); // Box 15
		barrelModel[5].setRotationPoint(17F, -21.5F, 0F);

		barrelModel[6].addShapeBox(24F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F); // Box 16
		barrelModel[6].setRotationPoint(17F, -21.5F, 0F);

		barrelModel[7].addBox(0F, -1F, 5.5F, 3, 1, 1, 0F); // Box 17
		barrelModel[7].setRotationPoint(17F, -21.5F, 0F);


		leftTrackModel = new ModelRendererTurbo[14];
		leftTrackModel[0] = new ModelRendererTurbo(this, 163, 0, textureX, textureY); // Box 77
		leftTrackModel[1] = new ModelRendererTurbo(this, 163, 24, textureX, textureY); // Box 78
		leftTrackModel[2] = new ModelRendererTurbo(this, 163, 11, textureX, textureY); // Box 79
		leftTrackModel[3] = new ModelRendererTurbo(this, 202, 39, textureX, textureY); // Box 80
		leftTrackModel[4] = new ModelRendererTurbo(this, 202, 24, textureX, textureY); // Box 81
		leftTrackModel[5] = new ModelRendererTurbo(this, 202, 24, textureX, textureY); // Box 82
		leftTrackModel[6] = new ModelRendererTurbo(this, 202, 11, textureX, textureY); // Box 83
		leftTrackModel[7] = new ModelRendererTurbo(this, 202, 39, textureX, textureY); // Box 84
		leftTrackModel[8] = new ModelRendererTurbo(this, 202, 24, textureX, textureY); // Box 85
		leftTrackModel[9] = new ModelRendererTurbo(this, 202, 11, textureX, textureY); // Box 86
		leftTrackModel[10] = new ModelRendererTurbo(this, 202, 24, textureX, textureY); // Box 87
		leftTrackModel[11] = new ModelRendererTurbo(this, 192, 51, textureX, textureY); // Box 88
		leftTrackModel[12] = new ModelRendererTurbo(this, 148, 89, textureX, textureY); // Box 89
		leftTrackModel[13] = new ModelRendererTurbo(this, 214, 16, textureX, textureY); // Box 90

		leftTrackModel[0].addBox(0F, 0F, 0F, 43, 1, 9, 0F); // Box 77
		leftTrackModel[0].setRotationPoint(-20F, -3.5F, -23.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F); // Box 78
		leftTrackModel[1].setRotationPoint(-26F, -5.5F, -23.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 4F, 0F); // Box 79
		leftTrackModel[2].setRotationPoint(23F, -7.5F, -23.5F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Box 80
		leftTrackModel[3].setRotationPoint(32F, -7.5F, -23.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,3F, -1F, 0F,-3.5F, 0F, 0F,-3.5F, 0F, 0F,3F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 81
		leftTrackModel[4].setRotationPoint(40.5F, -7.5F, -23.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, -1F, 0F,-3.5F, 0F, 0F,-3.5F, 0F, 0F,3F, -1F, 0F); // Box 82
		leftTrackModel[5].setRotationPoint(40.5F, 0.5F, -23.5F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 83
		leftTrackModel[6].setRotationPoint(40.5F, -2.5F, -23.5F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Box 84
		leftTrackModel[7].setRotationPoint(-32F, -5.5F, -23.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,-3.5F, 0F, 0F,3F, -1F, 0F,3F, -1F, 0F,-3.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 85
		leftTrackModel[8].setRotationPoint(-35.5F, -5.5F, -23.5F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 86
		leftTrackModel[9].setRotationPoint(-35.5F, -0.5F, -23.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3.5F, 0F, 0F,3F, -1F, 0F,3F, -1F, 0F,-3.5F, 0F, 0F); // Box 87
		leftTrackModel[10].setRotationPoint(-35.5F, 2.5F, -23.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,-0.5F, 0F, 0F,0F, -2.5F, 0F,0F, -2.5F, 0F,-0.5F, 0F, 0F,0F, 0F, 0F,0F, 2.5F, 0F,0F, 2.5F, 0F,0F, 0F, 0F); // Box 88
		leftTrackModel[11].setRotationPoint(-32F, 6.5F, -23.5F);

		leftTrackModel[12].addBox(0F, 0F, 0F, 47, 1, 9, 0F); // Box 89
		leftTrackModel[12].setRotationPoint(-21F, 9F, -23.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, -4.5F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F,0F, -4.5F, 0F,0F, 4.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 4.5F, 0F); // Box 90
		leftTrackModel[13].setRotationPoint(26F, 4.5F, -23.5F);


		rightTrackModel = new ModelRendererTurbo[14];
		rightTrackModel[0] = new ModelRendererTurbo(this, 163, 11, textureX, textureY); // Box 91
		rightTrackModel[1] = new ModelRendererTurbo(this, 163, 0, textureX, textureY); // Box 92
		rightTrackModel[2] = new ModelRendererTurbo(this, 202, 39, textureX, textureY); // Box 93
		rightTrackModel[3] = new ModelRendererTurbo(this, 202, 24, textureX, textureY); // Box 94
		rightTrackModel[4] = new ModelRendererTurbo(this, 202, 11, textureX, textureY); // Box 95
		rightTrackModel[5] = new ModelRendererTurbo(this, 202, 24, textureX, textureY); // Box 96
		rightTrackModel[6] = new ModelRendererTurbo(this, 214, 16, textureX, textureY); // Box 97
		rightTrackModel[7] = new ModelRendererTurbo(this, 148, 89, textureX, textureY); // Box 98
		rightTrackModel[8] = new ModelRendererTurbo(this, 192, 51, textureX, textureY); // Box 99
		rightTrackModel[9] = new ModelRendererTurbo(this, 202, 11, textureX, textureY); // Box 101
		rightTrackModel[10] = new ModelRendererTurbo(this, 202, 24, textureX, textureY); // Box 102
		rightTrackModel[11] = new ModelRendererTurbo(this, 202, 24, textureX, textureY); // Box 103
		rightTrackModel[12] = new ModelRendererTurbo(this, 202, 39, textureX, textureY); // Box 104
		rightTrackModel[13] = new ModelRendererTurbo(this, 163, 24, textureX, textureY); // Box 105

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 4F, 0F); // Box 91
		rightTrackModel[0].setRotationPoint(23F, -7.5F, 14.5F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 43, 1, 9, 0F); // Box 92
		rightTrackModel[1].setRotationPoint(-20F, -3.5F, 14.5F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Box 93
		rightTrackModel[2].setRotationPoint(32F, -7.5F, 14.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,3F, -1F, 0F,-3.5F, 0F, 0F,-3.5F, 0F, 0F,3F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 94
		rightTrackModel[3].setRotationPoint(40.5F, -7.5F, 14.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 95
		rightTrackModel[4].setRotationPoint(40.5F, -2.5F, 14.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, -1F, 0F,-3.5F, 0F, 0F,-3.5F, 0F, 0F,3F, -1F, 0F); // Box 96
		rightTrackModel[5].setRotationPoint(40.5F, 0.5F, 14.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, -4.5F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F,0F, -4.5F, 0F,0F, 4.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 4.5F, 0F); // Box 97
		rightTrackModel[6].setRotationPoint(26F, 4.5F, 14.5F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 47, 1, 9, 0F); // Box 98
		rightTrackModel[7].setRotationPoint(-21F, 9F, 14.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,-0.5F, 0F, 0F,0F, -2.5F, 0F,0F, -2.5F, 0F,-0.5F, 0F, 0F,0F, 0F, 0F,0F, 2.5F, 0F,0F, 2.5F, 0F,0F, 0F, 0F); // Box 99
		rightTrackModel[8].setRotationPoint(-32F, 6.5F, 14.5F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 101
		rightTrackModel[9].setRotationPoint(-35.5F, -0.5F, 14.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3.5F, 0F, 0F,3F, -1F, 0F,3F, -1F, 0F,-3.5F, 0F, 0F); // Box 102
		rightTrackModel[10].setRotationPoint(-35.5F, 2.5F, 14.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,-3.5F, 0F, 0F,3F, -1F, 0F,3F, -1F, 0F,-3.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 103
		rightTrackModel[11].setRotationPoint(-35.5F, -5.5F, 14.5F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Box 104
		rightTrackModel[12].setRotationPoint(-32F, -5.5F, 14.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F); // Box 105
		rightTrackModel[13].setRotationPoint(-26F, -5.5F, 14.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
