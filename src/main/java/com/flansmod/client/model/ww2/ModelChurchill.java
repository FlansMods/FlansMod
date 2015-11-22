//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelChurchill extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChurchill()
	{
		bodyModel = new ModelRendererTurbo[90];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Import Body1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 155, textureX, textureY); // Import Body4
		bodyModel[2] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import Body5
		bodyModel[3] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Import Body6
		bodyModel[4] = new ModelRendererTurbo(this, 0, 295, textureX, textureY); // Import Body7
		bodyModel[5] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Body8
		bodyModel[6] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Body9
		bodyModel[7] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Body10
		bodyModel[8] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Import Body11
		bodyModel[9] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Body12
		bodyModel[10] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Import Body13
		bodyModel[11] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Import Body14
		bodyModel[12] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Body15
		bodyModel[13] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body16
		bodyModel[14] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Body17
		bodyModel[15] = new ModelRendererTurbo(this, 0, 95, textureX, textureY); // Import Body19
		bodyModel[16] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Import Body20
		bodyModel[17] = new ModelRendererTurbo(this, 0, 155, textureX, textureY); // Import Body21
		bodyModel[18] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Body23
		bodyModel[19] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import Body24
		bodyModel[20] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Body25
		bodyModel[21] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Body27
		bodyModel[22] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import Body28
		bodyModel[23] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import Body29
		bodyModel[24] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Body30
		bodyModel[25] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Body31
		bodyModel[26] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Body32
		bodyModel[27] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import LeftTrack4
		bodyModel[28] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Body33
		bodyModel[29] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body34
		bodyModel[30] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Body35
		bodyModel[31] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import RightTrack4
		bodyModel[32] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import RightTrack5
		bodyModel[33] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import RightTrack6
		bodyModel[34] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import RightTrack7
		bodyModel[35] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import RightTrack8
		bodyModel[36] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import RightTrack9
		bodyModel[37] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import RightTrack10
		bodyModel[38] = new ModelRendererTurbo(this, 0, 95, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 1
		bodyModel[40] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 71
		bodyModel[53] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 74
		bodyModel[56] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 78
		bodyModel[57] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 80
		bodyModel[59] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 1
		bodyModel[61] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 2
		bodyModel[62] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Box 6
		bodyModel[63] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Box 7
		bodyModel[64] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Box 8
		bodyModel[65] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 9
		bodyModel[66] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 10
		bodyModel[67] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 11
		bodyModel[68] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 12
		bodyModel[69] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 13
		bodyModel[70] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 14
		bodyModel[71] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 15
		bodyModel[72] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 16
		bodyModel[73] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 17
		bodyModel[74] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 18
		bodyModel[75] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 19
		bodyModel[76] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 20
		bodyModel[77] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 21
		bodyModel[78] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 22
		bodyModel[79] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 23
		bodyModel[80] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 24
		bodyModel[81] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 25
		bodyModel[82] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 26
		bodyModel[83] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 27
		bodyModel[84] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Box 28
		bodyModel[85] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 29
		bodyModel[86] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Box 30
		bodyModel[87] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Box 31
		bodyModel[88] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Box 32
		bodyModel[89] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Box 111

		bodyModel[0].addShapeBox(0F, 0F, 0F, 113, 18, 18, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 6F, 0F); // Import Body1
		bodyModel[0].setRotationPoint(-50F, -22F, 19F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 18, 18, 0F); // Import Body4
		bodyModel[1].setRotationPoint(-54F, -22F, 19F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 19, 16, 0F,-3F, -7F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, -7F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body5
		bodyModel[2].setRotationPoint(-70F, -22F, 19F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 89, 13, 30, 0F,0F, 0F, 5F,2F, 0F, 5F,2F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,2F, 0F, 5F,2F, 0F, 5F,0F, 0F, 5F); // Import Body6
		bodyModel[3].setRotationPoint(-54F, -23F, -15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 106, 5, 30, 0F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F); // Import Body7
		bodyModel[4].setRotationPoint(-54F, -11F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 120, 9, 30, 0F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,-10F, 0F, 5F,-5F, 0F, 5F,-5F, 0F, 5F,-10F, 0F, 5F); // Import Body8
		bodyModel[5].setRotationPoint(-68F, -6F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 6, 30, 0F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,10F, 0F, 5F,10F, 0F, 5F,0F, 0F, 5F); // Import Body9
		bodyModel[6].setRotationPoint(29F, -17F, -15F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 8, 10, 0F); // Import Body10
		bodyModel[7].setRotationPoint(35F, -23F, 4F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Import Body11
		bodyModel[8].setRotationPoint(36F, -22F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F); // Import Body12
		bodyModel[9].setRotationPoint(39F, -21F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Body13
		bodyModel[10].setRotationPoint(26F, -24F, 5F);

		bodyModel[11].addBox(0F, 0F, -10F, 10, 1, 10, 0F); // Import Body14
		bodyModel[11].setRotationPoint(26F, -24F, -5F);

		bodyModel[12].addBox(0F, 0F, 0F, 26, 10, 8, 0F); // Import Body15
		bodyModel[12].setRotationPoint(-34F, -20F, 37F);

		bodyModel[13].addBox(0F, 0F, 0F, 26, 4, 8, 0F); // Import Body16
		bodyModel[13].setRotationPoint(-34F, -10F, 35F);

		bodyModel[14].addBox(0F, 0F, 0F, 20, 3, 4, 0F); // Import Body17
		bodyModel[14].setRotationPoint(-31F, -23F, 37F);

		bodyModel[15].addShapeBox(0F, 0F, -16F, 16, 5, 16, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body19
		bodyModel[15].setRotationPoint(63F, -22F, -19F);

		bodyModel[16].addShapeBox(0F, 0F, -16F, 16, 11, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F); // Import Body20
		bodyModel[16].setRotationPoint(63F, -17F, -19F);

		bodyModel[17].addBox(0F, 0F, -18F, 4, 18, 18, 0F); // Import Body21
		bodyModel[17].setRotationPoint(-54F, -22F, -19F);

		bodyModel[18].addShapeBox(-15F, 0F, 0F, 15, 14, 30, 0F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F); // Import Body23
		bodyModel[18].setRotationPoint(-53F, -25F, -15F);
		bodyModel[18].rotateAngleZ = 0.17453293F;

		bodyModel[19].addShapeBox(-14F, 0F, 0F, 15, 17, 30, 0F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F); // Import Body24
		bodyModel[19].setRotationPoint(-54F, -23F, -15F);

		bodyModel[20].addBox(0F, 0F, 0F, 7, 13, 4, 0F); // Import Body25
		bodyModel[20].setRotationPoint(-75F, -23F, -15F);

		bodyModel[21].addBox(0F, 0F, 0F, 7, 13, 4, 0F); // Import Body27
		bodyModel[21].setRotationPoint(-75F, -23F, 11F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 13, 4, 0F); // Import Body28
		bodyModel[22].setRotationPoint(-78F, -23F, -15F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 13, 4, 0F); // Import Body29
		bodyModel[23].setRotationPoint(-78F, -23F, 11F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 9, 22, 0F); // Import Body30
		bodyModel[24].setRotationPoint(-71F, -21F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 9, 22, 0F); // Import Body31
		bodyModel[25].setRotationPoint(-74F, -21F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 9, 22, 0F); // Import Body32
		bodyModel[26].setRotationPoint(-77F, -21F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 113, 7, 10, 0F); // Import LeftTrack4
		bodyModel[27].setRotationPoint(-51F, -5F, 23F);

		bodyModel[28].addBox(0F, 0F, -8F, 26, 10, 8, 0F); // Import Body33
		bodyModel[28].setRotationPoint(-34F, -20F, -35F);

		bodyModel[29].addBox(0F, 0F, -8F, 26, 4, 8, 0F); // Import Body34
		bodyModel[29].setRotationPoint(-34F, -10F, -35F);

		bodyModel[30].addBox(0F, 0F, -4F, 20, 3, 4, 0F); // Import Body35
		bodyModel[30].setRotationPoint(-31F, -23F, -37F);

		bodyModel[31].addBox(0F, 0F, -10F, 113, 7, 10, 0F); // Import RightTrack4
		bodyModel[31].setRotationPoint(-51F, -5F, -23F);

		bodyModel[32].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import RightTrack5
		bodyModel[32].setRotationPoint(-53F, -4F, -20F);

		bodyModel[33].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // Import RightTrack6
		bodyModel[33].setRotationPoint(-53F, -1F, -20F);

		bodyModel[34].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Import RightTrack7
		bodyModel[34].setRotationPoint(-53F, 2F, -20F);

		bodyModel[35].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import RightTrack8
		bodyModel[35].setRotationPoint(-42F, -2F, -20F);

		bodyModel[36].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Import RightTrack9
		bodyModel[36].setRotationPoint(-42F, 2F, -20F);

		bodyModel[37].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import RightTrack10
		bodyModel[37].setRotationPoint(-42F, 6F, -20F);

		bodyModel[38].addShapeBox(0F, 0F, -16F, 16, 5, 16, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 0
		bodyModel[38].setRotationPoint(63F, -22F, 35F);

		bodyModel[39].addShapeBox(0F, 0F, -16F, 16, 11, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F); // Box 1
		bodyModel[39].setRotationPoint(63F, -17F, 35F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 19, 16, 0F,-3F, -7F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, -7F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 56
		bodyModel[40].setRotationPoint(-70F, -22F, -35F);

		bodyModel[41].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // Box 57
		bodyModel[41].setRotationPoint(56F, -1F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 58
		bodyModel[42].setRotationPoint(56F, 2F, -20F);

		bodyModel[43].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(56F, -4F, -20F);

		bodyModel[44].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 60
		bodyModel[44].setRotationPoint(-28F, -2F, -20F);

		bodyModel[45].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 61
		bodyModel[45].setRotationPoint(-28F, 2F, -20F);

		bodyModel[46].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(-28F, 6F, -20F);

		bodyModel[47].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 63
		bodyModel[47].setRotationPoint(0F, -2F, -20F);

		bodyModel[48].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 64
		bodyModel[48].setRotationPoint(0F, 2F, -20F);

		bodyModel[49].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 65
		bodyModel[49].setRotationPoint(0F, 6F, -20F);

		bodyModel[50].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 69
		bodyModel[50].setRotationPoint(-14F, -2F, -20F);

		bodyModel[51].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 70
		bodyModel[51].setRotationPoint(-14F, 2F, -20F);

		bodyModel[52].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 71
		bodyModel[52].setRotationPoint(-14F, 6F, -20F);

		bodyModel[53].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 72
		bodyModel[53].setRotationPoint(14F, -2F, -20F);

		bodyModel[54].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 73
		bodyModel[54].setRotationPoint(14F, 2F, -20F);

		bodyModel[55].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 74
		bodyModel[55].setRotationPoint(14F, 6F, -20F);

		bodyModel[56].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 78
		bodyModel[56].setRotationPoint(42F, 6F, -20F);

		bodyModel[57].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 79
		bodyModel[57].setRotationPoint(42F, 2F, -20F);

		bodyModel[58].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 80
		bodyModel[58].setRotationPoint(42F, -2F, -20F);

		bodyModel[59].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 0
		bodyModel[59].setRotationPoint(28F, -2F, -20F);

		bodyModel[60].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 1
		bodyModel[60].setRotationPoint(28F, 2F, -20F);

		bodyModel[61].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 2
		bodyModel[61].setRotationPoint(28F, 6F, -20F);

		bodyModel[62].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 6
		bodyModel[62].setRotationPoint(56F, -4F, 34F);

		bodyModel[63].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // Box 7
		bodyModel[63].setRotationPoint(56F, -1F, 34F);

		bodyModel[64].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 8
		bodyModel[64].setRotationPoint(56F, 2F, 34F);

		bodyModel[65].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 9
		bodyModel[65].setRotationPoint(42F, 2F, 34F);

		bodyModel[66].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 10
		bodyModel[66].setRotationPoint(42F, -2F, 34F);

		bodyModel[67].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 11
		bodyModel[67].setRotationPoint(42F, 6F, 34F);

		bodyModel[68].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 12
		bodyModel[68].setRotationPoint(28F, 6F, 34F);

		bodyModel[69].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 13
		bodyModel[69].setRotationPoint(28F, 2F, 34F);

		bodyModel[70].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 14
		bodyModel[70].setRotationPoint(28F, -2F, 34F);

		bodyModel[71].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 15
		bodyModel[71].setRotationPoint(14F, -2F, 34F);

		bodyModel[72].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 16
		bodyModel[72].setRotationPoint(14F, 2F, 34F);

		bodyModel[73].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 17
		bodyModel[73].setRotationPoint(14F, 6F, 34F);

		bodyModel[74].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 18
		bodyModel[74].setRotationPoint(0F, 6F, 34F);

		bodyModel[75].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 19
		bodyModel[75].setRotationPoint(0F, 2F, 34F);

		bodyModel[76].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 20
		bodyModel[76].setRotationPoint(0F, -2F, 34F);

		bodyModel[77].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 21
		bodyModel[77].setRotationPoint(-14F, -2F, 34F);

		bodyModel[78].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 22
		bodyModel[78].setRotationPoint(-14F, 2F, 34F);

		bodyModel[79].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 23
		bodyModel[79].setRotationPoint(-14F, 6F, 34F);

		bodyModel[80].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 24
		bodyModel[80].setRotationPoint(-28F, 6F, 34F);

		bodyModel[81].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 25
		bodyModel[81].setRotationPoint(-28F, 2F, 34F);

		bodyModel[82].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 26
		bodyModel[82].setRotationPoint(-28F, -2F, 34F);

		bodyModel[83].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 27
		bodyModel[83].setRotationPoint(-42F, -2F, 34F);

		bodyModel[84].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // Box 28
		bodyModel[84].setRotationPoint(-42F, 2F, 34F);

		bodyModel[85].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 29
		bodyModel[85].setRotationPoint(-42F, 6F, 34F);

		bodyModel[86].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // Box 30
		bodyModel[86].setRotationPoint(-53F, -1F, 34F);

		bodyModel[87].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 31
		bodyModel[87].setRotationPoint(-53F, -4F, 34F);

		bodyModel[88].addShapeBox(0F, 0F, -14F, 9, 3, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 32
		bodyModel[88].setRotationPoint(-53F, 2F, 34F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 113, 18, 18, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 6F, 0F); // Box 111
		bodyModel[89].setRotationPoint(-50F, -22F, -37F);


		turretModel = new ModelRendererTurbo[12];
		turretModel[0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Turret1
		turretModel[1] = new ModelRendererTurbo(this, 502, 100, textureX, textureY); // Import Turret2
		turretModel[2] = new ModelRendererTurbo(this, 400, 160, textureX, textureY); // Import Turret3
		turretModel[3] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import Turret4
		turretModel[4] = new ModelRendererTurbo(this, 400, 230, textureX, textureY); // Import Turret5
		turretModel[5] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Box 0
		turretModel[6] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 106
		turretModel[7] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 110
		turretModel[8] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Box 110
		turretModel[9] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Box 111
		turretModel[10] = new ModelRendererTurbo(this, 296, 4, textureX, textureY); // Box 114
		turretModel[11] = new ModelRendererTurbo(this, 296, 4, textureX, textureY); // Box 115

		turretModel[0].addShapeBox(0F, 0F, 0F, 25, 16, 32, 0F,-13F, 0F, 5F,0F, -2F, -2F,0F, -2F, -2F,-13F, 0F, 5F,-13F, 0F, 5F,0F, 0F, -2F,0F, 0F, -2F,-13F, 0F, 5F); // Import Turret1
		turretModel[0].setRotationPoint(-8F, -39F, -16F);

		turretModel[1].addShapeBox(-26F, -39F, -16F, 18, 16, 32, 0F,2F, 0F, -6F,0F, 0F, 5F,0F, 0F, 5F,2F, 0F, -6F,2F, -2F, -8F,0F, 0F, 5F,0F, 0F, 5F,2F, -2F, -8F); // Import Turret2
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addShapeBox(-36F, -39F, -8F, 8, 8, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F); // Import Turret3
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addBox(-16F, -40F, 0F, 12, 1, 12, 0F); // Import Turret4
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addShapeBox(0F, -6F, -10F, 4, 12, 20, 0F,0F, 0F, 0F,0F, -2F, -1F,0F, -2F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -1F,0F, -2F, -1F,0F, 0F, 0F); // Import Turret5
		turretModel[4].setRotationPoint(17F, -30F, 0F);

		turretModel[5].addShapeBox(-11F, -39F, -16F, 18, 16, 32, 0F,-3F, 0F, 5F,-2F, 0F, 5F,-2F, 0F, 5F,-3F, 0F, 5F,-3F, 0F, 5F,-2F, 0F, 5F,-2F, 0F, 5F,-3F, 0F, 5F); // Box 0
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addShapeBox(-3F, -38F, -3F, 25, 16, 32, 0F,0F, -2.5F, -10F,0F, -2.5F, -10F,0F, -2.5F, -15F,0F, -2.5F, -15F,0F, -2.5F, -10F,0F, -2.5F, -10F,0F, -2.5F, -15F,0F, -2.5F, -15F); // Box 106
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addShapeBox(-3F, -38F, -24F, 25, 16, 32, 0F,0F, -2.5F, -10F,0F, -2.5F, -10F,0F, -2.5F, -15F,0F, -2.5F, -15F,0F, -2.5F, -10F,0F, -2.5F, -10F,0F, -2.5F, -15F,0F, -2.5F, -15F); // Box 110
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addShapeBox(-14F, -39.3F, -21F, 12, 1, 12, 0F,-2F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,-2F, 0F, -2F,-2F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,-2F, 0F, -2F); // Box 110
		turretModel[8].setRotationPoint(0F, 0F, 0F);
		turretModel[8].rotateAngleY = -0.52359878F;

		turretModel[9].addShapeBox(21F, -32F, 4F, 7, 2, 2, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F); // Box 111
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addShapeBox(17F, -36.5F, -14F, 5, 1, 28, 0F,0F, 0.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 114
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addShapeBox(17F, -24.5F, -14F, 5, 1, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 115
		turretModel[11].setRotationPoint(0F, 0F, 0F);


		barrelModel = new ModelRendererTurbo[3];
		barrelModel[0] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import Barrel1
		barrelModel[1] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Import Barrel2
		barrelModel[2] = new ModelRendererTurbo(this, 400, 370, textureX, textureY); // Import Barrel3

		barrelModel[0].addBox(0F, -4F, -5F, 7, 8, 8, 0F); // Import Barrel1
		barrelModel[0].setRotationPoint(17F, -30F, 0F);

		barrelModel[1].addShapeBox(7F, -2F, -3F, 38, 4, 4, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F); // Import Barrel2
		barrelModel[1].setRotationPoint(17F, -30F, 0F);

		barrelModel[2].addShapeBox(45F, -2F, -3.5F, 9, 5, 5, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F,0F, -1F, -1F); // Import Barrel3
		barrelModel[2].setRotationPoint(17F, -30.5F, 0F);


		leftTrackModel = new ModelRendererTurbo[3];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import RightTrack1
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Import RightTrack2
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import RightTrack3

		leftTrackModel[0].addBox(-2F, 0F, -14F, 2, 25, 14, 0F); // Import RightTrack1
		leftTrackModel[0].setRotationPoint(76F, -8F, -20F);
		leftTrackModel[0].rotateAngleZ = -0.66322512F;

		leftTrackModel[1].addBox(-2F, 0F, -14F, 105, 2, 14, 0F); // Import RightTrack2
		leftTrackModel[1].setRotationPoint(-42F, 10F, -20F);

		leftTrackModel[2].addBox(-28F, -2F, -14F, 28, 2, 14, 0F); // Import RightTrack3
		leftTrackModel[2].setRotationPoint(-44F, 12F, -20F);
		leftTrackModel[2].rotateAngleZ = -0.66322512F;


		rightTrackModel = new ModelRendererTurbo[3];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import LeftTrack1
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Import LeftTrack2
		rightTrackModel[2] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import LeftTrack3

		rightTrackModel[0].addBox(-2F, 0F, 0F, 2, 25, 14, 0F); // Import LeftTrack1
		rightTrackModel[0].setRotationPoint(76F, -8F, 20F);
		rightTrackModel[0].rotateAngleZ = -0.66322512F;

		rightTrackModel[1].addBox(-2F, 0F, 0F, 105, 2, 14, 0F); // Import LeftTrack2
		rightTrackModel[1].setRotationPoint(-42F, 10F, 20F);

		rightTrackModel[2].addBox(-28F, -2F, 0F, 28, 2, 14, 0F); // Import LeftTrack3
		rightTrackModel[2].setRotationPoint(-44F, 12F, 20F);
		rightTrackModel[2].rotateAngleZ = -0.66322512F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}

