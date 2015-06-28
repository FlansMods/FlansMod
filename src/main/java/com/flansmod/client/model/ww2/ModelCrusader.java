//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelCrusader extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelCrusader()
	{
		bodyModel = new ModelRendererTurbo[72];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Import CR,MainBody
		bodyModel[1] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import CR,EngineBlock
		bodyModel[2] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import CR,RightWheelfront
		bodyModel[3] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 1
		bodyModel[19] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 3
		bodyModel[21] = new ModelRendererTurbo(this, 0, 595, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 0, 635, textureX, textureY); // Box 5
		bodyModel[23] = new ModelRendererTurbo(this, 0, 635, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 0, 645, textureX, textureY); // Box 7
		bodyModel[25] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 8
		bodyModel[26] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 9
		bodyModel[27] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Box 10
		bodyModel[28] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Box 11
		bodyModel[29] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 70
		bodyModel[30] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 71
		bodyModel[31] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 72
		bodyModel[32] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Box 82
		bodyModel[33] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Box 83
		bodyModel[34] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 85
		bodyModel[35] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Box 86
		bodyModel[36] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Box 87
		bodyModel[37] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Box 88
		bodyModel[38] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 89
		bodyModel[39] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Box 90
		bodyModel[40] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Box 106
		bodyModel[41] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 107
		bodyModel[42] = new ModelRendererTurbo(this, 100, 15, textureX, textureY); // Box 108
		bodyModel[43] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 96
		bodyModel[44] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 97
		bodyModel[45] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 98
		bodyModel[46] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 99
		bodyModel[47] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 100
		bodyModel[48] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 101
		bodyModel[49] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 102
		bodyModel[50] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 103
		bodyModel[51] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 104
		bodyModel[52] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 105
		bodyModel[53] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 106
		bodyModel[54] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 107
		bodyModel[55] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 108
		bodyModel[56] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 109
		bodyModel[57] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 110
		bodyModel[58] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 112
		bodyModel[59] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 113
		bodyModel[60] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 114
		bodyModel[61] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 115
		bodyModel[62] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 116
		bodyModel[63] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 117
		bodyModel[64] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 118
		bodyModel[65] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 119
		bodyModel[66] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 120
		bodyModel[67] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 121
		bodyModel[68] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 122
		bodyModel[69] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 123
		bodyModel[70] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 124
		bodyModel[71] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 125

		bodyModel[0].addShapeBox(0F, 0F, 0F, 31, 12, 30, 0F,0F, 0F, 0F,3F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F); // Import CR,MainBody
		bodyModel[0].setRotationPoint(3F, -8F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 50, 7, 30, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import CR,EngineBlock
		bodyModel[1].setRotationPoint(-26F, -15F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F); // Import CR,RightWheelfront
		bodyModel[2].setRotationPoint(29F, -7F, 15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(24F, -15F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 5, 15, 0F,0F, 0F, 0F,0F, -1F, -0.5F,0F, -1F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F); // Box 1
		bodyModel[4].setRotationPoint(26F, -15F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 3, 30, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 2
		bodyModel[5].setRotationPoint(24F, -11F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 26, 12, 30, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-23F, -8F, -15F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 31, 12, 30, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-54F, -8F, -15F);

		bodyModel[8].addBox(0F, 0F, 0F, 79, 1, 7, 0F); // Box 10
		bodyModel[8].setRotationPoint(-49F, -10.5F, -22F);

		bodyModel[9].addBox(0F, 0F, 0F, 79, 1, 7, 0F); // Box 11
		bodyModel[9].setRotationPoint(-49F, -10.5F, 15F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 12
		bodyModel[10].setRotationPoint(-56.8F, -8.8F, -22F);
		bodyModel[10].rotateAngleZ = 0.20943951F;

		bodyModel[11].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 13
		bodyModel[11].setRotationPoint(-56.8F, -8.8F, 15F);
		bodyModel[11].rotateAngleZ = 0.20943951F;

		bodyModel[12].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 14
		bodyModel[12].setRotationPoint(29.9F, -10.5F, 15F);
		bodyModel[12].rotateAngleZ = -0.20943951F;

		bodyModel[13].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 15
		bodyModel[13].setRotationPoint(29.9F, -10.5F, -22F);
		bodyModel[13].rotateAngleZ = -0.20943951F;

		bodyModel[14].addBox(0F, 0F, 0F, 3, 9, 22, 0F); // Box 18
		bodyModel[14].setRotationPoint(-57F, -11F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 1F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 1F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-60F, -7F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 4F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 4F, 0F); // Box 21
		bodyModel[16].setRotationPoint(-54F, -7F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 30, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.3F, -1F,0F, 0.3F, -1F,0F, -1F, 0F,0F, -1F, -1F); // Box 0
		bodyModel[17].setRotationPoint(-39F, -14.2F, 16F);
		bodyModel[17].rotateAngleX = -0.36651914F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.3F, -1F,0F, 0.3F, -1F,0F, -1F, 0F,0F, -1F, -1F); // Box 1
		bodyModel[18].setRotationPoint(-6F, -14.2F, 16F);
		bodyModel[18].rotateAngleX = -0.36651914F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.3F, -1F,0F, 0.3F, -1F,0F, -1F, 0F,0F, -1F, -1F); // Box 2
		bodyModel[19].setRotationPoint(16F, -14.2F, -16F);
		bodyModel[19].rotateAngleX = -0.36651914F;
		bodyModel[19].rotateAngleY = -3.14159265F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 30, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.3F, -1F,0F, 0.3F, -1F,0F, -1F, 0F,0F, -1F, -1F); // Box 3
		bodyModel[20].setRotationPoint(-9F, -14.2F, -16F);
		bodyModel[20].rotateAngleX = -0.36651914F;
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addShapeBox(0F, 0F, 1F, 20, 7, 25, 0F,0F, -2F, -5F,0F, 0F, -5F,0F, 0F, -5F,0F, -2F, -5F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F); // Box 4
		bodyModel[21].setRotationPoint(-46F, -15F, -14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 2F, 0F,0F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 5
		bodyModel[22].setRotationPoint(-46F, -11F, -15F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 6
		bodyModel[23].setRotationPoint(-46F, -11F, 13F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 2, 30, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F); // Box 7
		bodyModel[24].setRotationPoint(-54F, -9F, -15F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 6, 0, 0F,0F, -1.3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.3F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F); // Box 8
		bodyModel[25].setRotationPoint(-57F, -10.1F, 15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 6, 0, 0F,0F, -1.3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.3F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F); // Box 9
		bodyModel[26].setRotationPoint(-57F, -10.1F, -15F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 19, 8, 0, 0F,0F, -1.3F, 0F,0F, -1.3F, 0F,0F, -1.3F, 0F,0F, -1.3F, 0F,0F, -1.3F, 0F,0F, -4.3F, 0F,0F, -4.3F, 0F,0F, -1.3F, 0F); // Box 10
		bodyModel[27].setRotationPoint(-49F, -11.1F, 15F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 19, 8, 0, 0F,0F, -1.3F, 0F,0F, -1.3F, 0F,0F, -1.3F, 0F,0F, -1.3F, 0F,0F, -1.3F, 0F,0F, -4.3F, 0F,0F, -4.3F, 0F,0F, -1.3F, 0F); // Box 11
		bodyModel[28].setRotationPoint(-49F, -11.1F, -15F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 70
		bodyModel[29].setRotationPoint(18F, -3.5F, 15F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 71
		bodyModel[30].setRotationPoint(16.5F, -2F, 15F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 72
		bodyModel[31].setRotationPoint(18F, 7.5F, 15F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 82
		bodyModel[32].setRotationPoint(29F, -9.5F, 15F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F); // Box 83
		bodyModel[33].setRotationPoint(29F, -4.5F, 15F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F); // Box 85
		bodyModel[34].setRotationPoint(-52F, -7F, 15F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F); // Box 86
		bodyModel[35].setRotationPoint(-52F, -4.5F, 15F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 87
		bodyModel[36].setRotationPoint(-52F, -9.5F, 15F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 88
		bodyModel[37].setRotationPoint(-52F, -9.5F, -20F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F); // Box 89
		bodyModel[38].setRotationPoint(-52F, -7F, -20F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F); // Box 90
		bodyModel[39].setRotationPoint(-52F, -4.5F, -20F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F); // Box 106
		bodyModel[40].setRotationPoint(29F, -4.5F, -20F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F); // Box 107
		bodyModel[41].setRotationPoint(29F, -7F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,-2F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 108
		bodyModel[42].setRotationPoint(29F, -9.5F, -20F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 96
		bodyModel[43].setRotationPoint(3F, -3.5F, 15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 97
		bodyModel[44].setRotationPoint(1.5F, -2F, 15F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 98
		bodyModel[45].setRotationPoint(3F, 7.5F, 15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 99
		bodyModel[46].setRotationPoint(-12F, -3.5F, 15F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 100
		bodyModel[47].setRotationPoint(-13.5F, -2F, 15F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 101
		bodyModel[48].setRotationPoint(-12F, 7.5F, 15F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 102
		bodyModel[49].setRotationPoint(-27F, -3.5F, 15F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 103
		bodyModel[50].setRotationPoint(-28.5F, -2F, 15F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 104
		bodyModel[51].setRotationPoint(-27F, 7.5F, 15F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 105
		bodyModel[52].setRotationPoint(-42F, -3.5F, 15F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 106
		bodyModel[53].setRotationPoint(-43.5F, -2F, 15F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 107
		bodyModel[54].setRotationPoint(-42F, 7.5F, 15F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 108
		bodyModel[55].setRotationPoint(18F, -3.5F, -20F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 109
		bodyModel[56].setRotationPoint(16.5F, -2F, -20F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 110
		bodyModel[57].setRotationPoint(18F, 7.5F, -20F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 112
		bodyModel[58].setRotationPoint(1.5F, -2F, -20F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 113
		bodyModel[59].setRotationPoint(3F, -3.5F, -20F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 114
		bodyModel[60].setRotationPoint(-12F, -3.5F, -20F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 115
		bodyModel[61].setRotationPoint(-13.5F, -2F, -20F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 116
		bodyModel[62].setRotationPoint(-12F, 7.5F, -20F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 117
		bodyModel[63].setRotationPoint(-27F, 7.5F, -20F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 118
		bodyModel[64].setRotationPoint(-28.5F, -2F, -20F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 119
		bodyModel[65].setRotationPoint(-27F, -3.5F, -20F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F); // Box 120
		bodyModel[66].setRotationPoint(-42F, -3.5F, -20F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F,1.5F, -0.5F, 0F); // Box 121
		bodyModel[67].setRotationPoint(-43.5F, -2F, -20F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 122
		bodyModel[68].setRotationPoint(-42F, 7.5F, -20F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,1F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,1F, 0F, 0F); // Box 123
		bodyModel[69].setRotationPoint(3F, 7.5F, -20F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F,35F, 2F, 0F,35F, 2F, 0F,35F, 2F, -5F,35F, 2F, -5F,30F, 2F, 0F,30F, 2F, 0F,30F, 2F, -5F,30F, 2F, -5F); // Box 124
		bodyModel[70].setRotationPoint(-20F, -7.2F, 22F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F,35F, 2F, -5F,35F, 2F, -5F,35F, 2F, 0F,35F, 2F, 0F,30F, 2F, -5F,30F, 2F, -5F,30F, 2F, 0F,30F, 2F, 0F); // Box 125
		bodyModel[71].setRotationPoint(-20F, -7.2F, -28F);


		turretModel = new ModelRendererTurbo[11];
		turretModel[0] = new ModelRendererTurbo(this, 300, 88, textureX, textureY); // Box 16
		turretModel[1] = new ModelRendererTurbo(this, 268, 40, textureX, textureY); // Box 17
		turretModel[2] = new ModelRendererTurbo(this, 200, 75, textureX, textureY); // Box 21
		turretModel[3] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Box 22
		turretModel[4] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 23
		turretModel[5] = new ModelRendererTurbo(this, 200, 185, textureX, textureY); // Box 24
		turretModel[6] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Box 26
		turretModel[7] = new ModelRendererTurbo(this, 200, 215, textureX, textureY); // Box 29
		turretModel[8] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Box 32
		turretModel[9] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Box 67
		turretModel[10] = new ModelRendererTurbo(this, 1, 0, textureX, textureY); // Box 96

		turretModel[0].addShapeBox(5F, -15F, -14F, 11, 1, 28, 0F,0F, 2F, 2F,2F, 2F, -3F,2F, 2F, -3F,0F, 2F, 2F,0F, -1F, 0F,0F, -1F, -5F,0F, -1F, -5F,0F, -1F, 0F); // Box 16
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addShapeBox(-13F, -15F, -14F, 18, 1, 28, 0F,5F, 2F, -2F,0F, 2F, 2F,0F, 2F, 2F,5F, 2F, -2F,0F, -1F, -2F,0F, -1F, 0F,0F, -1F, 0F,0F, -1F, -2F); // Box 17
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addShapeBox(5F, -25F, -15F, 11, 8, 30, 0F,0F, 0F, -5F,-1F, 0F, -8F,-1F, 0F, -8F,0F, 0F, -5F,0F, 0F, 2F,2F, 0F, -3F,2F, 0F, -3F,0F, 0F, 2F); // Box 21
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addShapeBox(-16F, -23F, -15F, 21, 6, 30, 0F,0F, 2F, -8F,0F, 2F, -5F,0F, 2F, -5F,0F, 2F, -8F,5F, 0F, -2F,0F, 0F, 2F,0F, 0F, 2F,5F, 0F, -2F); // Box 22
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addShapeBox(-30F, -12F, -7F, 5, 7, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 23
		turretModel[4].setRotationPoint(0F, 0F, 0F);
		turretModel[4].rotateAngleZ = -0.55850536F;

		turretModel[5].addShapeBox(5F, -26F, -6F, 9, 1, 12, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 4F,0.8F, 0F, 1.3F,0.8F, 0F, 1.3F,0F, 0F, 4F); // Box 24
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addShapeBox(-15F, -26F, -6F, 10, 1, 12, 0F,0.8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.8F, 0F, 0F,0.8F, 0F, 2.5F,0F, 0F, 4F,0F, 0F, 4F,0.8F, 0F, 2.5F); // Box 26
		turretModel[6].setRotationPoint(10F, 0F, 0F);

		turretModel[7].addShapeBox(15F, -23F, -5F, 3, 4, 10, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F); // Box 29
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addShapeBox(-13.5F, -12F, 28.5F, 9, 8, 1, 0F,1.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1.5F, 0F, 0F,1.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1.5F, 0F, 0F); // Box 32
		turretModel[8].setRotationPoint(0F, 3F, 0F);
		turretModel[8].rotateAngleX = 1.74532925F;
		turretModel[8].rotateAngleY = -0.13962634F;

		turretModel[9].addShapeBox(-13.5F, -13F, -30F, 9, 8, 1, 0F,1.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1.5F, 0F, 0F,1.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1.5F, 0F, 0F); // Box 67
		turretModel[9].setRotationPoint(0F, 3F, -1F);
		turretModel[9].rotateAngleX = -1.74532925F;
		turretModel[9].rotateAngleY = 0.13962634F;

		turretModel[10].addShapeBox(-6F, -24F, -14F, 6, 5, 28, 0F,0F, 0F, -4.6F,2F, 0F, -3.3F,2F, 0F, -3.3F,0F, 0F, -4.6F,0F, 0F, 0F,2F, 0F, 1.2F,2F, 0F, 1.2F,0F, 0F, 0F); // Box 96
		turretModel[10].setRotationPoint(0F, 0F, 0F);


		barrelModel = new ModelRendererTurbo[3];
		barrelModel[0] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Box 27
		barrelModel[1] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 28
		barrelModel[2] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Box 30

		barrelModel[0].addShapeBox(-5F, -1F, -1F, 22, 2, 2, 0F,0F, -0.5F, -0.5F,5F, -0.5F, -0.5F,5F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,5F, -0.5F, -0.5F,5F, -0.5F, -0.5F,0F, -0.5F, -0.5F); // Box 27
		barrelModel[0].setRotationPoint(18F, -21F, -2F);

		barrelModel[1].addShapeBox(22F, -1F, -1F, 6, 2, 2, 0F,0F, -0.2F, -0.2F,0F, -0.2F, -0.2F,0F, -0.2F, -0.2F,0F, -0.2F, -0.2F,0F, -0.2F, -0.2F,0F, -0.2F, -0.2F,0F, -0.2F, -0.2F,0F, -0.2F, -0.2F); // Box 28
		barrelModel[1].setRotationPoint(18F, -21F, -2F);

		barrelModel[2].addShapeBox(0F, -1F, 4F, 6, 1, 1, 0F,0F, -0.3F, -0.3F,0F, -0.3F, -0.3F,0F, -0.3F, -0.3F,0F, -0.3F, -0.3F,0F, -0.3F, -0.3F,0F, -0.3F, -0.3F,0F, -0.3F, -0.3F,0F, -0.3F, -0.3F); // Box 30
		barrelModel[2].setRotationPoint(18F, -21F, -2F);


		leftTrackModel = new ModelRendererTurbo[6];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import LT,Top
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import LT,Front
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import LT,Bottom
		leftTrackModel[3] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import LT,Back
		leftTrackModel[4] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import LT,Frontcorner
		leftTrackModel[5] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import LT,Backcorner

		leftTrackModel[0].addBox(0F, 0F, 0F, 87, 1, 6, 0F); // Import LT,Top
		leftTrackModel[0].setRotationPoint(-52F, -8F, -21F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Import LT,Front
		leftTrackModel[1].setRotationPoint(35F, -8F, -21F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // Import LT,Bottom
		leftTrackModel[2].setRotationPoint(-44F, 9.5F, -21F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Import LT,Back
		leftTrackModel[3].setRotationPoint(-53F, -8F, -21F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import LT,Frontcorner
		leftTrackModel[4].setRotationPoint(35.5F, -1.5F, -21F);
		leftTrackModel[4].rotateAngleZ = -0.71558499F;

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import LT,Backcorner
		leftTrackModel[5].setRotationPoint(-53F, -2F, -21F);
		leftTrackModel[5].rotateAngleZ = 0.62831853F;


		rightTrackModel = new ModelRendererTurbo[6];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import RT,Top
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import RT,Front
		rightTrackModel[2] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import RT,Bottom
		rightTrackModel[3] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import RT,Back
		rightTrackModel[4] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import RT,Frontcorner
		rightTrackModel[5] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import RT,Backcorner

		rightTrackModel[0].addBox(0F, 0F, 0F, 87, 1, 6, 0F); // Import RT,Top
		rightTrackModel[0].setRotationPoint(-52F, -8F, 15F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Import RT,Front
		rightTrackModel[1].setRotationPoint(35F, -8F, 15F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // Import RT,Bottom
		rightTrackModel[2].setRotationPoint(-44F, 9.5F, 15F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Import RT,Back
		rightTrackModel[3].setRotationPoint(-53F, -8F, 15F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Import RT,Frontcorner
		rightTrackModel[4].setRotationPoint(35.3F, -1.5F, 15F);
		rightTrackModel[4].rotateAngleZ = -0.71558499F;

		rightTrackModel[5].addBox(0F, 0F, 3F, 1, 15, 6, 0F); // Import RT,Backcorner
		rightTrackModel[5].setRotationPoint(-53F, -2F, 12F);
		rightTrackModel[5].rotateAngleZ = 0.62831853F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
