//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
//Copyright (C) 2015 Minecraft-SMP.de
//This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelExoskeletonBody extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelExoskeletonBody()
	{
		bodyModel = new ModelRendererTurbo[33];
		bodyModel[0] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 17
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 18
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 19
		bodyModel[3] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 20
		bodyModel[4] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 21
		bodyModel[5] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 22
		bodyModel[6] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 23
		bodyModel[7] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 24
		bodyModel[8] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 36
		bodyModel[10] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 37
		bodyModel[11] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 38
		bodyModel[12] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 39
		bodyModel[13] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 40
		bodyModel[14] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 41
		bodyModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 42
		bodyModel[16] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 43
		bodyModel[17] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 44
		bodyModel[18] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 45
		bodyModel[19] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 46
		bodyModel[20] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 67
		bodyModel[21] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 68
		bodyModel[22] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 72
		bodyModel[23] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 73
		bodyModel[24] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 74
		bodyModel[25] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 75
		bodyModel[26] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 76
		bodyModel[27] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 80
		bodyModel[28] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 81
		bodyModel[29] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 61
		bodyModel[30] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 62
		bodyModel[31] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 109
		bodyModel[32] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 110

		bodyModel[0].addBox(-16F, 6F, -10F, 32, 36, 2, 0F); // Box 17
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(-16F, 0F, -10F, 3, 6, 2, 0F); // Box 18
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(13F, 0F, -10F, 3, 6, 2, 0F); // Box 19
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-16F, 20F, -12F, 32, 14, 2, 0F); // Box 20
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(-15F, 21F, -14F, 6, 12, 2, 0F); // Box 21
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(-7F, 21F, -14F, 6, 12, 2, 0F); // Box 22
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(1F, 21F, -14F, 6, 12, 2, 0F); // Box 23
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(9F, 21F, -14F, 6, 12, 2, 0F); // Box 24
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addBox(-15F, 6F, -10F, 30, 10, 1, 0F); // Box 25
		bodyModel[8].setRotationPoint(0F, 0F, -1F);

		bodyModel[9].addShapeBox(-41F, -7F, 11.25F, 19, 4, 4, 0F,-6F, 0F, 9F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, -13F,-6F, 0F, 9F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, -13F); // Box 36
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addBox(-5F, 1F, 9F, 3, 35, 1, 0F); // Box 37
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addBox(3F, 1F, 9F, 3, 35, 1, 0F); // Box 38
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addBox(2F, 2F, 9F, 2, 33, 3, 0F); // Box 39
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addBox(-3F, 2F, 9F, 2, 33, 3, 0F); // Box 40
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addBox(-1F, 1F, 8F, 3, 35, 2, 0F); // Box 41
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addBox(-22F, -7.5F, 10.8F, 5, 5, 5, 0F); // Box 42
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addBox(-1F, 16F, 11F, 3, 6, 2, 0F); // Box 43
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addBox(-1F, 7F, 11F, 3, 6, 2, 0F); // Box 44
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addBox(-1F, 25F, 11F, 3, 6, 2, 0F); // Box 45
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addBox(-6F, -1F, 9F, 13, 8, 6, 0F); // Box 46
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addBox(35.5F, -7.5F, -2.2F, 5, 5, 5, 0F); // Box 67
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(22F, -7F, 11.25F, 19, 4, 4, 0F,0F, 0F, 0F,-6F, 0F, 10F,-1F, 0F, -14F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 10F,-1F, 0F, -14F,0F, 0F, 0F); // Box 68
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addBox(-16F, 6F, 7F, 32, 36, 2, 0F); // Box 72
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addBox(-16F, 0F, 7F, 3, 6, 2, 0F); // Box 73
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addBox(13F, 0F, 7F, 3, 6, 2, 0F); // Box 74
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addBox(13F, -2F, -10F, 3, 2, 19, 0F); // Box 75
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addBox(-16F, -2F, -10F, 3, 2, 19, 0F); // Box 76
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addBox(18F, -4F, 11F, 4, 12, 4, 0F); // Box 80
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addBox(-23F, -4F, 11F, 4, 12, 4, 0F); // Box 81
		bodyModel[28].setRotationPoint(0F, 0F, 0F);
		bodyModel[28].rotateAngleZ = -0.01745329F;

		bodyModel[29].addBox(7F, 4F, 11F, 11, 4, 4, 0F); // Box 61
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addBox(-18F, 4F, 11F, 12, 4, 4, 0F); // Box 62
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addBox(17.5F, -7.5F, 10.8F, 5, 5, 5, 0F); // Box 109
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addBox(-40.5F, -7.5F, -2.2F, 5, 5, 5, 0F); // Box 110
		bodyModel[32].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[13];
		
		rightArmModel[0] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 26
		rightArmModel[1] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 28
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 31
		rightArmModel[3] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 34
		rightArmModel[4] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 35
		rightArmModel[5] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 63
		rightArmModel[6] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 78
		rightArmModel[7] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 106
		rightArmModel[8] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 114
		rightArmModel[9] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 119
		rightArmModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 120
		rightArmModel[11] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 121
		rightArmModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 122

		float armOffsetX = 20, armOffsetY = 60, armOffsetZ = -1;

		
		rightArmModel[0].addBox(-33F + armOffsetX, -39F + armOffsetY, -6F + armOffsetZ, 1, 10, 14, 0F); // Box 26
		rightArmModel[0].setRotationPoint(0F, 0F, -1F);

		rightArmModel[1].addBox(-34F + armOffsetX, -36F + armOffsetY, -4F + armOffsetZ, 1, 10, 2, 0F); // Box 28
		rightArmModel[1].setRotationPoint(0F, 0F, -1F);

		rightArmModel[2].addBox(-33F + armOffsetX, -43F + armOffsetY, -4F + armOffsetZ, 1, 4, 2, 0F); // Box 31
		rightArmModel[2].setRotationPoint(0F, 0F, -1F);

		rightArmModel[3].addBox(-40F + armOffsetX, -74F + armOffsetY, -2F + armOffsetZ, 4, 32, 4, 0F); // Box 34
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-40F + armOffsetX, -42F + armOffsetY, -2F + armOffsetZ, 4, 16, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,-6F, 0F, 0F); // Box 35
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addBox(-33.5F + armOffsetX, -28F + armOffsetY, -8F + armOffsetZ, 16, 3, 18, 0F); // Box 63
		rightArmModel[5].setRotationPoint(0F, 0F, -1F);

		rightArmModel[6].addBox(-34F + armOffsetX, -67F + armOffsetY, -4F + armOffsetZ, 2, 20, 8, 0F); // Box 78
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addBox(-33F + armOffsetX, -72.2F + armOffsetY, -8F + armOffsetZ, 17, 5, 18, 0F); // Box 106
		rightArmModel[7].setRotationPoint(0F, 0F, -5F);

		rightArmModel[8].addBox(-36F + armOffsetX, -62F + armOffsetY, -3F + armOffsetZ, 2, 10, 6, 0F); // Box 114
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addBox(-34F + armOffsetX, -36F + armOffsetY, 0F + armOffsetZ, 1, 10, 2, 0F); // Box 119
		rightArmModel[9].setRotationPoint(0F, 0F, -1F);

		rightArmModel[10].addBox(-33F + armOffsetX, -43F + armOffsetY, 0F + armOffsetZ, 1, 4, 2, 0F); // Box 120
		rightArmModel[10].setRotationPoint(0F, 0F, -1F);

		rightArmModel[11].addBox(-34F + armOffsetX, -36F + armOffsetY, 4F + armOffsetZ, 1, 10, 2, 0F); // Box 121
		rightArmModel[11].setRotationPoint(0F, 0F, -1F);

		rightArmModel[12].addBox(-33F + armOffsetX, -43F + armOffsetY, 4F + armOffsetZ, 1, 4, 2, 0F); // Box 122
		rightArmModel[12].setRotationPoint(0F, 0F, -1F);


		leftArmModel = new ModelRendererTurbo[13];
		
		leftArmModel[0] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 27
		leftArmModel[1] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 71
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 77
		leftArmModel[3] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 79
		leftArmModel[4] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 107
		leftArmModel[5] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 115
		leftArmModel[6] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 123
		leftArmModel[7] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 124
		leftArmModel[8] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 125
		leftArmModel[9] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 126
		leftArmModel[10] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 127
		leftArmModel[11] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 128
		leftArmModel[12] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 129

		leftArmModel[0].addBox(16.5F - armOffsetX, -28F + armOffsetY, -8F + armOffsetZ, 16, 3, 18, 0F); // Box 27
		leftArmModel[0].setRotationPoint(0F, 0F, -1F);

		leftArmModel[1].addBox(36F - armOffsetX, -74F + armOffsetY, -2F + armOffsetZ, 4, 32, 4, 0F); // Box 71
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(36F - armOffsetX, -42F + armOffsetY, -2F + armOffsetZ, 4, 16, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,2F, 0F, 0F); // Box 77
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addBox(32F - armOffsetX, -67F + armOffsetY, -4F + armOffsetZ, 2, 20, 8, 0F); // Box 79
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addBox(16F - armOffsetX, -72.2F + armOffsetY, -8F + armOffsetZ, 17, 5, 18, 0F); // Box 107
		leftArmModel[4].setRotationPoint(0F, 0F, -5F);

		leftArmModel[5].addBox(34F - armOffsetX, -62F + armOffsetY, -3F + armOffsetZ, 2, 10, 6, 0F); // Box 115
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addBox(32F - armOffsetX, -43F + armOffsetY, 4F + armOffsetZ, 1, 4, 2, 0F); // Box 123
		leftArmModel[6].setRotationPoint(0F, 0F, -1F);

		leftArmModel[7].addBox(32F - armOffsetX, -43F + armOffsetY, 0F + armOffsetZ, 1, 4, 2, 0F); // Box 124
		leftArmModel[7].setRotationPoint(0F, 0F, -1F);

		leftArmModel[8].addBox(32F - armOffsetX, -43F + armOffsetY, -4F + armOffsetZ, 1, 4, 2, 0F); // Box 125
		leftArmModel[8].setRotationPoint(0F, 0F, -1F);

		leftArmModel[9].addBox(32F - armOffsetX, -39F + armOffsetY, -6F + armOffsetZ, 1, 10, 14, 0F); // Box 126
		leftArmModel[9].setRotationPoint(0F, 0F, -1F);

		leftArmModel[10].addBox(33F - armOffsetX, -36F + armOffsetY, 4F + armOffsetZ, 1, 10, 2, 0F); // Box 127
		leftArmModel[10].setRotationPoint(0F, 0F, -1F);

		leftArmModel[11].addBox(33F - armOffsetX, -36F + armOffsetY, 0F + armOffsetZ, 1, 10, 2, 0F); // Box 128
		leftArmModel[11].setRotationPoint(0F, 0F, -1F);

		leftArmModel[12].addBox(33F - armOffsetX, -36F + armOffsetY, -4F + armOffsetZ, 1, 10, 2, 0F); // Box 129
		leftArmModel[12].setRotationPoint(0F, 0F, -1F);
	}
}
