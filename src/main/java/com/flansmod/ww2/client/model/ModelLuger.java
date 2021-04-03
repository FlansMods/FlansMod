//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.1
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.08.2015 - 20:21:00
// Last changed on: 17.08.2015 - 20:21:00

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelLuger extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelLuger() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[35];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 18
		gunModel[16] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 20
		gunModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 21
		gunModel[18] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 23
		gunModel[19] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 24
		gunModel[20] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 25
		gunModel[21] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 26
		gunModel[22] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 27
		gunModel[23] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 28
		gunModel[24] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 29
		gunModel[25] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 30
		gunModel[26] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 31
		gunModel[27] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 32
		gunModel[28] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 33
		gunModel[29] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 34
		gunModel[30] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 35
		gunModel[31] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 39
		gunModel[32] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 40
		gunModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		gunModel[34] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 45

		gunModel[0].addShapeBox(0F, 0F, 0F, 11, 11, 7, 0F, 0F, 1F, -0.2F, 1F, 0F, -1.2F, 1F, 0F, -1.2F, 0F, 1F, -0.2F, 4F, -1F, -0.2F, -2F, 0F, -1.2F, -2F, 0F, -1.2F, 4F, -1F, -0.2F); // Box 0
		gunModel[0].setRotationPoint(0F, -15F, -3.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 11, 7, 7, 0F, 3F, 1F, -0.2F, -1F, 0F, -1.2F, -1F, 0F, -1.2F, 3F, 1F, -0.2F, 5F, -1F, -0.2F, -2F, 0F, -1.2F, -2F, 0F, -1.2F, 5F, -1F, -0.2F); // Box 1
		gunModel[1].setRotationPoint(-1F, -4F, -3.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 2F, 1F, -0.2F, 0F, 1F, -1.2F, 0F, 1F, -1.2F, 2F, 1F, -0.2F, 1F, -1F, -0.2F, -1F, 0F, -1.2F, -1F, 0F, -1.2F, 1F, -1F, -0.2F); // Box 2
		gunModel[2].setRotationPoint(1F, -19F, -3.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 15, 2, 7, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 3
		gunModel[3].setRotationPoint(-2F, -22F, -3.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 15, 2, 7, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 4
		gunModel[4].setRotationPoint(-2F, -24F, -3.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 15, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-2F, -26F, -3.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 5, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F); // Box 6
		gunModel[6].setRotationPoint(-7F, -26F, -3.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, -1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 7
		gunModel[7].setRotationPoint(-8F, -29.5F, -3.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 9
		gunModel[8].setRotationPoint(27F, -27F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Box 10
		gunModel[9].setRotationPoint(13F, -28.5F, -3.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[10].setRotationPoint(13F, -25.5F, -3.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		gunModel[11].setRotationPoint(13F, -23.5F, -3.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 14, 3, 7, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 14
		gunModel[12].setRotationPoint(13F, -27.5F, -3.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 16
		gunModel[13].setRotationPoint(27F, -27F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 17
		gunModel[14].setRotationPoint(43F, -27F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 18
		gunModel[15].setRotationPoint(13F, -21.5F, -3.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -1F, 0F, 0.4F); // Box 20
		gunModel[16].setRotationPoint(-8F, -29.5F, 1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 21
		gunModel[17].setRotationPoint(-8F, -29.5F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 7, 8, 4, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1.5F, -2.3F, -0.3F, 1.5F, -2.3F, -0.3F, 0F, 0F, -0.3F); // Box 23
		gunModel[18].setRotationPoint(9F, -20F, -2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[19].setRotationPoint(23F, -20F, -2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 25
		gunModel[20].setRotationPoint(23F, -17F, -2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 26
		gunModel[21].setRotationPoint(22F, -15F, -2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 27
		gunModel[22].setRotationPoint(21F, -15F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[23].setRotationPoint(18F, -15F, -2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 29
		gunModel[24].setRotationPoint(43F, -27.4F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, -1.4F, 0.3F, -0.3F, -1.4F, 0F, -0.3F, -1.4F, 0F, -0.3F, -1.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, -0.1F); // Box 30
		gunModel[25].setRotationPoint(43F, -30F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 2F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[26].setRotationPoint(16F, -20F, -2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 32
		gunModel[27].setRotationPoint(18F, -19.5F, -1.5F);
		gunModel[27].rotateAngleZ = 0.20943951F;

		gunModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 33
		gunModel[28].setRotationPoint(43F, -26F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 34
		gunModel[29].setRotationPoint(43F, -25F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 35
		gunModel[30].setRotationPoint(-1F, -29.5F, -4F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 39
		gunModel[31].setRotationPoint(12F, -26F, -3.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F, 0F, -0.3F, -1.8F, 0F, -0.3F, -1.8F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 3F, -1.8F, 0F, 3F, -1.8F, 0F, -1F, 0.2F, 0F, -1F, 0.2F); // Box 40
		gunModel[32].setRotationPoint(17.2F, -26.2F, -4F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 44
		gunModel[33].setRotationPoint(-4F, -30.5F, 1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 45
		gunModel[34].setRotationPoint(-4F, -30.5F, -2F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 43
		ammoModel[1] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 46

		ammoModel[0].addShapeBox(-3F, -25F, -1.5F, 10, 28, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 43
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = -0.20943951F;

		ammoModel[1].addShapeBox(2F, -1F, -4F, 2, 2, 8, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 46
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		ammoModel[1].rotateAngleZ = -0.08726646F;


		slideModel = new ModelRendererTurbo[7];
		slideModel[0] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 8
		slideModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		slideModel[2] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 36
		slideModel[3] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 37
		slideModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 38
		slideModel[5] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 41
		slideModel[6] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 42

		slideModel[0].addShapeBox(0F, 0F, 0F, 15, 2, 8, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 8
		slideModel[0].setRotationPoint(-2F, -28F, -4F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 12
		slideModel[1].setRotationPoint(-2F, -29F, -4F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 36
		slideModel[2].setRotationPoint(-0.5F, -30F, -6F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 37
		slideModel[3].setRotationPoint(-0.5F, -30F, 4F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 38
		slideModel[4].setRotationPoint(-0.5F, -30F, -4F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 41
		slideModel[5].setRotationPoint(-0.5F, -30F, 4.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 42
		slideModel[6].setRotationPoint(-0.5F, -30F, -5.5F);


		gunSlideDistance = 0.8F;
		animationType = EnumAnimationType.ALT_PISTOL_CLIP;

		translateAll(0F, -13F, 0.6F);
		thirdPersonOffset = new Vector3f(-0.1F, -0.18F, 0.01F);


		flipAll();
	}
}
