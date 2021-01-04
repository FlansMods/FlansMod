//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelMustang extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMustang() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];
		bodyModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 47
		bodyModel[11] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 49
		bodyModel[12] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 64
		bodyModel[13] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 69
		bodyModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 70
		bodyModel[15] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 71
		bodyModel[16] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 72
		bodyModel[17] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 79
		bodyModel[18] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 83
		bodyModel[19] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 88
		bodyModel[20] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 89
		bodyModel[21] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 90
		bodyModel[22] = new ModelRendererTurbo(this, 373, 164, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 373, 193, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 473, 119, textureX, textureY); // Box 103
		bodyModel[25] = new ModelRendererTurbo(this, 5, 334, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 10, 314, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 20, 314, textureX, textureY); // Box 26
		bodyModel[28] = new ModelRendererTurbo(this, 36, 314, textureX, textureY); // Box 26
		bodyModel[29] = new ModelRendererTurbo(this, 20, 314, textureX, textureY); // Box 26
		bodyModel[30] = new ModelRendererTurbo(this, 0, 314, textureX, textureY); // Box 26
		bodyModel[31] = new ModelRendererTurbo(this, 0, 314, textureX, textureY); // Box 17
		bodyModel[32] = new ModelRendererTurbo(this, 0, 314, textureX, textureY); // Box 18
		bodyModel[33] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 25
		bodyModel[35] = new ModelRendererTurbo(this, 0, 314, textureX, textureY); // Box 26
		bodyModel[36] = new ModelRendererTurbo(this, 0, 314, textureX, textureY); // Box 27
		bodyModel[37] = new ModelRendererTurbo(this, 0, 314, textureX, textureY); // Box 28
		bodyModel[38] = new ModelRendererTurbo(this, 0, 314, textureX, textureY); // Box 29
		bodyModel[39] = new ModelRendererTurbo(this, 473, 119, textureX, textureY); // Box 30

		bodyModel[0].addShapeBox(0F, 0F, 0F, 41, 3, 20, 0F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		bodyModel[0].setRotationPoint(-70F, -40F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 31, 5, 20, 0F, 0F, 0F, -4F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 5
		bodyModel[1].setRotationPoint(14F, -42F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 31, 20, 20, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(14F, -37F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 21, 9, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 9
		bodyModel[3].setRotationPoint(-14F, -17F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 43, 20, 3, 0F); // Box 11
		bodyModel[4].setRotationPoint(-29F, -37F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 43, 20, 3, 0F); // Box 12
		bodyModel[5].setRotationPoint(-29F, -37F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F, 0F, 0F, -4F, 0F, -2F, -1.7F, 0F, -2F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 13
		bodyModel[6].setRotationPoint(-29F, -40F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 33, 5, 3, 0F, 0F, -4F, -1.6F, 0F, 0F, -4F, 0F, 0F, 7F, 0F, -4F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[7].setRotationPoint(-19F, -42F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 41, 14, 20, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 17
		bodyModel[8].setRotationPoint(-70F, -37F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 27, 9, 20, 0F, 0F, 0F, -1F, 0F, 0F, -0.34146341F, 0F, 0F, -0.34146341F, 0F, 0F, -1F, 0F, -3F, -4F, 0F, 0F, -3.34146341F, 0F, 0F, -3.34146341F, 0F, -3F, -4F); // Box 19
		bodyModel[9].setRotationPoint(-70F, -23F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 29, 9, 20, 0F, 0F, 0F, -0.34146341F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34146341F, 0F, 0F, -3.34146341F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3.34146341F); // Box 47
		bodyModel[10].setRotationPoint(-43F, -23F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 31, 7, 16, 0F, 0F, 2F, 0F, 0F, 7F, -3F, 0F, 7F, -3F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, -14F, -3F, 0F, -14F, -3F, 0F, 0F, -3F); // Box 49
		bodyModel[11].setRotationPoint(7F, -15F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 64
		bodyModel[12].setRotationPoint(-21F, -46F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 33, 5, 3, 0F, 0F, -4F, 0.6F, 0F, 0F, 7F, 0F, 0F, -4F, 0F, -4F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[13].setRotationPoint(-19F, -42F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 70
		bodyModel[14].setRotationPoint(-21F, -46F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 71
		bodyModel[15].setRotationPoint(-21F, -46F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 72
		bodyModel[16].setRotationPoint(-29F, -46F, 3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 33, 2, 1, 0F, 0.3F, 0F, -0.3F, 0F, 2F, -1F, 0F, 2F, 1F, 0.3F, 0F, 0.2F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F); // Box 79
		bodyModel[17].setRotationPoint(-19F, -40F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 17, 5, 20, 0F, 0F, -2F, -7F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -2F, -7F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 83
		bodyModel[18].setRotationPoint(45F, -42F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F, 0F, 0F, 2F, 0F, -2F, -1.5F, 0F, -2F, -1.7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[19].setRotationPoint(-29F, -40F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 33, 2, 1, 0F, 0.3F, 0F, 0.2F, 0F, 2F, 1F, 0F, 2F, -1F, 0.3F, 0F, -0.3F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F); // Box 89
		bodyModel[20].setRotationPoint(-19F, -40F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 90
		bodyModel[21].setRotationPoint(-29F, -46F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 49, 25, 1, 0F, 0F, -10F, 0F, -20F, -10F, 0F, -20F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(14F, -47F, -10F);
		bodyModel[22].rotateAngleY = 0.08726646F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 49, 25, 1, 0F, 0F, -10F, 0F, -20F, -10F, 0F, -20F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(14F, -47F, 9F);
		bodyModel[23].rotateAngleY = -0.08726646F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 16, 14, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[24].setRotationPoint(-4F, -39F, -7F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 26
		bodyModel[25].setRotationPoint(-22F, -24F, -1.5F);

		bodyModel[26].addShapeBox(0F, 0F, -1F, 2, 4, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 26
		bodyModel[26].setRotationPoint(-29F, -40.3F, 0F);

		bodyModel[27].addShapeBox(1F, 0F, 0F, 1, 2, 7, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.8F, -0.8F, 0F, -6.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.8F, -0.8F, 0F, -6.8F); // Box 26
		bodyModel[27].setRotationPoint(-29.5F, -42.3F, -1.5F);

		bodyModel[28].addShapeBox(1F, 0F, 0F, 1, 8, 2, 0F, -0.8F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, -7F, 0.5F, -0.8F, -7F, 0.5F, -0.8F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, -0.8F, -0.8F, 0.5F); // Box 26
		bodyModel[28].setRotationPoint(-29.5F, -49.5F, -1F);

		bodyModel[29].addShapeBox(1F, 0F, 0F, 1, 2, 7, 0F, -0.8F, 0F, -6.8F, 0F, 0F, -6.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -6.8F, 0F, 0F, -6.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 26
		bodyModel[29].setRotationPoint(-29.5F, -42.3F, -5.5F);

		bodyModel[30].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, -0.8F, -0.9F, -0.9F); // Box 26
		bodyModel[30].setRotationPoint(-29.5F, -41.6F, -0.0499999999999998F);

		bodyModel[31].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Box 17
		bodyModel[31].setRotationPoint(-29.5F, -41.7F, -0.95F);

		bodyModel[32].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Box 18
		bodyModel[32].setRotationPoint(-29.5F, -41.7F, 0.15F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 9, 14, 0F); // Box 0
		bodyModel[33].setRotationPoint(-29F, -36F, -7F);
		bodyModel[33].rotateAngleZ = 0.13962634F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 29, 9, 20, 0F, 0F, 0F, -0.34146341F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34146341F, 0F, 0F, -3.34146341F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3.34146341F); // Box 25
		bodyModel[34].setRotationPoint(-30F, -23F, -10F);

		bodyModel[35].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Box 26
		bodyModel[35].setRotationPoint(-29.5F, -41.3F, -0.6F);

		bodyModel[36].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.3F, -0.8F, -0.8F, -0.3F); // Box 27
		bodyModel[36].setRotationPoint(-29.5F, -41.3F, -0.3F);

		bodyModel[37].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.3F, -0.8F, -0.8F, -0.3F); // Box 28
		bodyModel[37].setRotationPoint(-29.5F, -42F, -0.3F);

		bodyModel[38].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Box 29
		bodyModel[38].setRotationPoint(-29.5F, -42F, -0.6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 16, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[39].setRotationPoint(-1F, -24F, -7F);
		bodyModel[39].rotateAngleZ = -1.57079633F;


		noseModel = new ModelRendererTurbo[5];
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		noseModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		noseModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		noseModel[3] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 16
		noseModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 18

		noseModel[0].addTrapezoid(0F, 0F, 0F, 4, 14, 14, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 0
		noseModel[0].setRotationPoint(-89F, -37F, -7F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 15, 14, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		noseModel[1].setRotationPoint(-85F, -37F, -9F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 15, 6, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, -2F); // Box 4
		noseModel[2].setRotationPoint(-85F, -23F, -9F);

		noseModel[3].addTrapezoid(0F, 0F, 0F, 9, 12, 12, 0F, -6.00F, ModelRendererTurbo.MR_RIGHT); // Box 16
		noseModel[3].setRotationPoint(-98F, -36F, -6F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 18, 0F, -4F, -0.5F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -0.5F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 18
		noseModel[4].setRotationPoint(-85F, -38F, -9F);


		tailModel = new ModelRendererTurbo[5];
		tailModel[0] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 0
		tailModel[1] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 4
		tailModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		tailModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 13
		tailModel[4] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 17

		tailModel[0].addShapeBox(0F, 0F, 0F, 40, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -3F); // Box 0
		tailModel[0].setRotationPoint(45F, -37F, -7F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 16, 2, 37, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F); // Box 4
		tailModel[1].setRotationPoint(60F, -37F, 1F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 8
		tailModel[2].setRotationPoint(85F, -65F, -1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 13
		tailModel[3].setRotationPoint(76F, -37F, -2F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 16, 2, 37, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 17
		tailModel[4].setRotationPoint(60F, -37F, -38F);


		leftWingModel = new ModelRendererTurbo[5];
		leftWingModel[0] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 53
		leftWingModel[1] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 54
		leftWingModel[2] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 55
		leftWingModel[3] = new ModelRendererTurbo(this, 199, 348, textureX, textureY); // Import 
		leftWingModel[4] = new ModelRendererTurbo(this, 316, 410, textureX, textureY); // Shape 4

		leftWingModel[0].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 53
		leftWingModel[0].setRotationPoint(-43F, -20F, -41F);

		leftWingModel[1].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 54
		leftWingModel[1].setRotationPoint(-42.8F, -20.3F, -45F);

		leftWingModel[2].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 55
		leftWingModel[2].setRotationPoint(-42.5F, -20.6F, -49F);

		leftWingModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(50, 0, 50, 0), new Coord2D(33, 95, 33, 95), new Coord2D(24, 99, 24, 99), new Coord2D(13, 99, 13, 99), new Coord2D(10, 95, 10, 95)}), 3, 50, 99, 268, 3, ModelRendererTurbo.MR_FRONT, new float[]{96, 5, 11, 10, 97, 49}); // Import
		leftWingModel[3].setRotationPoint(-43.5F, -17.5F, -30.5F);
		leftWingModel[3].rotateAngleX = -1.48352986F;
		leftWingModel[3].rotateAngleY = 3.15904595F;
		leftWingModel[3].rotateAngleZ = 0.05235988F;

		leftWingModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(0, 0, 0, 0), new Coord2D(59, 0, 59, 0), new Coord2D(54, 24, 54, 24), new Coord2D(54, 24, 54, 24), new Coord2D(13, 24, 13, 24), new Coord2D(5, 24, 5, 24)}), 3, 59, 24, 158, 3, ModelRendererTurbo.MR_FRONT, new float[]{25, 8, 41, 0, 25, 59}); // Shape 4
		leftWingModel[4].setRotationPoint(-48F, -15.5F, -7F);
		leftWingModel[4].rotateAngleX = -1.48352986F;
		leftWingModel[4].rotateAngleY = 3.15904595F;
		leftWingModel[4].rotateAngleZ = 0.05235988F;


		rightWingModel = new ModelRendererTurbo[6];
		rightWingModel[0] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 56
		rightWingModel[1] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 57
		rightWingModel[2] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 58
		rightWingModel[3] = new ModelRendererTurbo(this, 316, 376, textureX, textureY); // Shape 6
		rightWingModel[4] = new ModelRendererTurbo(this, 68, 367, textureX, textureY); // Shape 7
		rightWingModel[5] = new ModelRendererTurbo(this, 280, 161, textureX, textureY); // Shape 1

		rightWingModel[0].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 56
		rightWingModel[0].setRotationPoint(-43.5F, -20.6F, 47F);

		rightWingModel[1].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 57
		rightWingModel[1].setRotationPoint(-43.8F, -20.3F, 43F);

		rightWingModel[2].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 58
		rightWingModel[2].setRotationPoint(-44F, -20F, 39F);

		rightWingModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(0, 0, 0, 0), new Coord2D(59, 0, 59, 0), new Coord2D(54, 24, 54, 24), new Coord2D(54, 24, 54, 24), new Coord2D(13, 24, 13, 24), new Coord2D(5, 24, 5, 24)}), 3, 59, 24, 158, 3, ModelRendererTurbo.MR_FRONT, new float[]{25, 8, 41, 0, 25, 59}); // Shape 6
		rightWingModel[3].setRotationPoint(-48.1F, -18.5F, 5F);
		rightWingModel[3].rotateAngleX = 1.48352986F;
		rightWingModel[3].rotateAngleY = 3.15904595F;
		rightWingModel[3].rotateAngleZ = 0.05235988F;

		rightWingModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(50, 0, 50, 0), new Coord2D(33, 95, 33, 95), new Coord2D(24, 99, 24, 99), new Coord2D(13, 99, 13, 99), new Coord2D(10, 95, 10, 95)}), 3, 50, 99, 268, 3, ModelRendererTurbo.MR_FRONT, new float[]{96, 5, 11, 10, 97, 49}); // Shape 7
		rightWingModel[4].setRotationPoint(-44.35F, -20.5F, 29F);
		rightWingModel[4].rotateAngleX = 1.48352986F;
		rightWingModel[4].rotateAngleY = 3.15904595F;
		rightWingModel[4].rotateAngleZ = 0.05235988F;

		rightWingModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(23, 0, 23, 0), new Coord2D(46, 0, 46, 0), new Coord2D(37, 13, 37, 13), new Coord2D(31, 25, 31, 25), new Coord2D(28, 28, 28, 28), new Coord2D(22, 28, 22, 28)}), 2, 46, 28, 93, 2, ModelRendererTurbo.MR_FRONT, new float[]{29, 6, 5, 14, 16, 23}); // Shape 1
		rightWingModel[5].setRotationPoint(108.5F, -38F, 1F);
		rightWingModel[5].rotateAngleZ = 0.05235988F;


		yawFlapModel = new ModelRendererTurbo[8];
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 9
		yawFlapModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 10
		yawFlapModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		yawFlapModel[3] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 26
		yawFlapModel[4] = new ModelRendererTurbo(this, 10, 344, textureX, textureY); // Box 26
		yawFlapModel[5] = new ModelRendererTurbo(this, 10, 344, textureX, textureY); // Box 26
		yawFlapModel[6] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 26
		yawFlapModel[7] = new ModelRendererTurbo(this, 0, 324, textureX, textureY); // Box 26

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 12, 25, 2, 0F, 0F, 0F, 0F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 9
		yawFlapModel[0].setRotationPoint(85F, -62F, -1F);

		yawFlapModel[1].addShapeBox(0F, -2F, 0F, 12, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 3F, 0F); // Box 10
		yawFlapModel[1].setRotationPoint(85F, -35F, -1F);

		yawFlapModel[2].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 12
		yawFlapModel[2].setRotationPoint(95.5F, -38F, -1F);

		yawFlapModel[3].addBox(0F, 0F, -5F, 1, 3, 2, 0F); // Box 26
		yawFlapModel[3].setRotationPoint(-23F, -26F, 0F);
		yawFlapModel[3].rotateAngleZ = 0.45378561F;

		yawFlapModel[4].addBox(-5F, 1F, -4.5F, 5, 1, 1, 0F); // Box 26
		yawFlapModel[4].setRotationPoint(-23F, -26F, 0F);
		yawFlapModel[4].rotateAngleZ = 0.45378561F;

		yawFlapModel[5].addBox(-5F, 1F, 3.5F, 5, 1, 1, 0F); // Box 26
		yawFlapModel[5].setRotationPoint(-23F, -26F, 0F);
		yawFlapModel[5].rotateAngleZ = 0.45378561F;

		yawFlapModel[6].addBox(0F, 0F, 3F, 1, 3, 2, 0F); // Box 26
		yawFlapModel[6].setRotationPoint(-23F, -26F, 0F);
		yawFlapModel[6].rotateAngleZ = 0.45378561F;

		yawFlapModel[7].addShapeBox(0F, -13F, -0.5F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 26
		yawFlapModel[7].setRotationPoint(-20.5F, -23.5F, 0F);
		yawFlapModel[7].rotateAngleZ = 0.15707963F;


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 14

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 36, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 14
		pitchFlapLeftModel[0].setRotationPoint(76F, -37F, -38F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 6

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 36, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 6
		pitchFlapRightModel[0].setRotationPoint(76F, -37F, 2F);


		tailWheelModel = new ModelRendererTurbo[6];
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 80
		tailWheelModel[1] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 81
		tailWheelModel[2] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 82
		tailWheelModel[3] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 83
		tailWheelModel[4] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 84
		tailWheelModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 85

		tailWheelModel[0].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 80
		tailWheelModel[0].setRotationPoint(67F, -21F, -0.5F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Box 81
		tailWheelModel[1].setRotationPoint(66F, -24F, -1F);

		tailWheelModel[2].addShapeBox(0F, -4F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 82
		tailWheelModel[2].setRotationPoint(66F, -24F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		tailWheelModel[3].setRotationPoint(67F, -22F, -0.5F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		tailWheelModel[4].setRotationPoint(67F, -18F, -0.5F);

		tailWheelModel[5].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 85
		tailWheelModel[5].setRotationPoint(60F, -22.5F, -2F);
		tailWheelModel[5].rotateAngleZ = 0.13962634F;


		leftWingWheelModel = new ModelRendererTurbo[10];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 98
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 100
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 101
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 102
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 103
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 104
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 106
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 108
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 109
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 4

		leftWingWheelModel[0].addShapeBox(0F, 0F, -1F, 16, 10, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 98
		leftWingWheelModel[0].setRotationPoint(-40F, -14F, -6F);
		leftWingWheelModel[0].rotateAngleX = -0.26179939F;

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 100
		leftWingWheelModel[1].setRotationPoint(-40F, 6F, -38F);

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 101
		leftWingWheelModel[2].setRotationPoint(-40F, 0F, -38F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		leftWingWheelModel[3].setRotationPoint(-40F, -4F, -38F);

		leftWingWheelModel[4].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 103
		leftWingWheelModel[4].setRotationPoint(-34F, 2F, -38.5F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		leftWingWheelModel[5].setRotationPoint(-34F, -6F, -34F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Box 106
		leftWingWheelModel[6].setRotationPoint(-34F, -20F, -37F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		leftWingWheelModel[7].setRotationPoint(-31.5F, -11F, -40.3F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 22, 1, 0F, -5F, 0F, 1.04347826F, 5F, 0F, 1.04347826F, 5F, 0F, -1.64347826F, -5F, 0F, -1.64347826F, -1F, -2F, 4F, 6F, 0F, 4F, 6F, 0F, -4.6F, -1F, -2F, -4.6F); // Box 109
		leftWingWheelModel[8].setRotationPoint(-36F, -20F, -37.5F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftWingWheelModel[9].setRotationPoint(-32F, -8F, -35F);


		rightWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 86
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 87
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 88
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 89
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 91
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 92
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 95
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 97
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 3
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 92

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 86
		rightWingWheelModel[0].setRotationPoint(-40F, 0F, 34F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Box 87
		rightWingWheelModel[1].setRotationPoint(-34F, -20F, 35F);

		rightWingWheelModel[2].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 88
		rightWingWheelModel[2].setRotationPoint(-34F, 2F, 33.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		rightWingWheelModel[3].setRotationPoint(-34F, -6F, 33F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		rightWingWheelModel[4].setRotationPoint(-40F, -4F, 34F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 92
		rightWingWheelModel[5].setRotationPoint(-40F, 6F, 34F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -3F, 0F, -0.6F); // Box 95
		rightWingWheelModel[6].setRotationPoint(-40F, -14F, 6F);
		rightWingWheelModel[6].rotateAngleX = 0.2443461F;

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 97
		rightWingWheelModel[7].setRotationPoint(-31.5F, -11F, 34.3F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		rightWingWheelModel[8].setRotationPoint(-32F, -8F, 33F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 4, 22, 1, 0F, -5F, 0F, -1.64347826F, 5F, 0F, -1.64347826F, 5F, 0F, 1.04347826F, -5F, 0F, 1.04347826F, -1F, -2F, -4.6F, 6F, 0F, -4.6F, 6F, 0F, 4F, -1F, -2F, 4F); // Box 92
		rightWingWheelModel[9].setRotationPoint(-36F, -20F, 36.5F);


		bodyDoorOpenModel = new ModelRendererTurbo[3];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 1
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 2
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 3

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2F, 0F, 0F, 1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F); // Box 1
		bodyDoorOpenModel[0].setRotationPoint(3.1F, -48.1F, -4F);
		bodyDoorOpenModel[0].rotateAngleZ = -0.10471976F;

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2F, 0F, 0F, 1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F); // Box 2
		bodyDoorOpenModel[1].setRotationPoint(0F, -47F, -4F);

		bodyDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 22, 1, 8, 0F, 0F, -0.9F, 0F, 0F, -5.9F, 0F, 0F, -5.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 3
		bodyDoorOpenModel[2].setRotationPoint(13F, -47F, -4F);


		bodyDoorCloseModel = new ModelRendererTurbo[3];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 74
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 75
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 6

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2F, 0F, 0F, 1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F); // Box 74
		bodyDoorCloseModel[0].setRotationPoint(-21F, -48F, -4F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 22, 1, 8, 0F, 0F, -0.9F, 0F, 0F, -5.9F, 0F, 0F, -5.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 75
		bodyDoorCloseModel[1].setRotationPoint(-8F, -48F, -4F);

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2F, 0F, 0F, 1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F); // Box 6
		bodyDoorCloseModel[2].setRotationPoint(-17.9F, -49.1F, -4F);
		bodyDoorCloseModel[2].rotateAngleZ = -0.10471976F;


		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(-87F, -30F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 250, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 250, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 250, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 250, textureX, textureY);
		prop[0].addBox(-1F, -33F, -2F, 2, 33, 4, 0.0F);
		prop[1].addBox(-1F, -33F, -2F, 2, 33, 4, 0.0F);
		prop[2].addBox(-1F, -33F, -2F, 2, 33, 4, 0.0F);
		prop[3].addBox(-1F, -33F, -2F, 2, 33, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}
