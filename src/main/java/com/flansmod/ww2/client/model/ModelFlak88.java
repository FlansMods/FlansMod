//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFlak88 extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelFlak88() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[50];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 8
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 32
		bodyModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		bodyModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 34
		bodyModel[9] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 36
		bodyModel[10] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 1
		bodyModel[12] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 3
		bodyModel[14] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		bodyModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		bodyModel[17] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 7
		bodyModel[18] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 8
		bodyModel[19] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 9
		bodyModel[20] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 10
		bodyModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		bodyModel[22] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 12
		bodyModel[23] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 13
		bodyModel[24] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 14
		bodyModel[25] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 15
		bodyModel[26] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 16
		bodyModel[27] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 17
		bodyModel[28] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 18
		bodyModel[29] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 19
		bodyModel[30] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 20
		bodyModel[31] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 23
		bodyModel[32] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 24
		bodyModel[33] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 25
		bodyModel[34] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 26
		bodyModel[35] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 27
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		bodyModel[37] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 29
		bodyModel[38] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 30
		bodyModel[39] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 31
		bodyModel[40] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 32
		bodyModel[41] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 33
		bodyModel[42] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 34
		bodyModel[43] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 35
		bodyModel[44] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 36
		bodyModel[45] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 37
		bodyModel[46] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 38
		bodyModel[47] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 39
		bodyModel[48] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 40
		bodyModel[49] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 41

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 7
		bodyModel[0].setRotationPoint(-0.5F, 3F, 37.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[1].setRotationPoint(-0.5F, 3F, 39.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.8F, 0F, -1.5F, -0.8F, 0F); // Box 9
		bodyModel[2].setRotationPoint(-2.5F, 5.5F, 39.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[3].setRotationPoint(-2.5F, 7F, 38F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12
		bodyModel[4].setRotationPoint(-2.5F, 7F, 39.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 13
		bodyModel[5].setRotationPoint(-2.5F, 7F, 41F);

		bodyModel[6].addShapeBox(-5.5F, 0F, -5.5F, 3, 3, 13, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 32
		bodyModel[6].setRotationPoint(-1F, 4F, -1F);

		bodyModel[7].addBox(-2.5F, 0F, -5.5F, 7, 3, 13, 0F); // Box 33
		bodyModel[7].setRotationPoint(-1F, 4F, -1F);

		bodyModel[8].addShapeBox(2.5F, 0F, -5.5F, 3, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 34
		bodyModel[8].setRotationPoint(1F, 4F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 37, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 36
		bodyModel[9].setRotationPoint(-2.5F, 5.5F, 2.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 37, 1, 5, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[10].setRotationPoint(2.5F, 5.5F, -2.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[11].setRotationPoint(39.5F, 3F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 2
		bodyModel[12].setRotationPoint(37.5F, 3F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, 0F, 0F, -1.5F); // Box 3
		bodyModel[13].setRotationPoint(39.5F, 5.5F, -2.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 4
		bodyModel[14].setRotationPoint(41F, 7F, -2.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 5
		bodyModel[15].setRotationPoint(39.5F, 7F, -2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F); // Box 6
		bodyModel[16].setRotationPoint(38F, 7F, -2.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 37, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 7
		bodyModel[17].setRotationPoint(-2.5F, 5.5F, -39.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[18].setRotationPoint(-0.5F, 3F, -40.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 9
		bodyModel[19].setRotationPoint(-0.5F, 3F, -42.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.8F, 0F, -1.5F, -0.8F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 10
		bodyModel[20].setRotationPoint(-2.5F, 5.5F, -43.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[21].setRotationPoint(-2.5F, 7F, -42F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12
		bodyModel[22].setRotationPoint(-2.5F, 7F, -40.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 13
		bodyModel[23].setRotationPoint(-2.5F, 7F, -39F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 37, 1, 5, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 14
		bodyModel[24].setRotationPoint(-39.5F, 5.5F, -2.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[25].setRotationPoint(-40.5F, 3F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 16
		bodyModel[26].setRotationPoint(-42.5F, 3F, -0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.8F, -1.5F); // Box 17
		bodyModel[27].setRotationPoint(-43.5F, 5.5F, -2.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F); // Box 18
		bodyModel[28].setRotationPoint(-42F, 7F, -2.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 19
		bodyModel[29].setRotationPoint(-40.5F, 7F, -2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 20
		bodyModel[30].setRotationPoint(-39F, 7F, -2.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 23
		bodyModel[31].setRotationPoint(24F, 5.5F, 2F);
		bodyModel[31].rotateAngleZ = 0.05235988F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 24
		bodyModel[32].setRotationPoint(24F, 5.5F, -3F);
		bodyModel[32].rotateAngleZ = 0.05235988F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 25
		bodyModel[33].setRotationPoint(24F, 5.5F, -2.5F);
		bodyModel[33].rotateAngleZ = 0.05235988F;

		bodyModel[34].addShapeBox(17F, 0F, 0F, 2, 1, 5, 0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 26
		bodyModel[34].setRotationPoint(24F, 5.5F, -2.5F);
		bodyModel[34].rotateAngleZ = 0.05235988F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[35].setRotationPoint(19F, 5.25F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[36].setRotationPoint(20F, 5.25F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[37].setRotationPoint(20F, 5.25F, 4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 30
		bodyModel[38].setRotationPoint(-2.5F, 5.5F, -25F);
		bodyModel[38].rotateAngleZ = 0.05235988F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 31
		bodyModel[39].setRotationPoint(2F, 5.5F, -43F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 32
		bodyModel[40].setRotationPoint(-3F, 5.5F, -43F);

		bodyModel[41].addShapeBox(0F, 0F, -17F, 5, 1, 2, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 33
		bodyModel[41].setRotationPoint(-2.5F, 5.5F, -26F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 34
		bodyModel[42].setRotationPoint(-25F, 5.5F, -2.5F);
		bodyModel[42].rotateAngleZ = 0.05235988F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 35
		bodyModel[43].setRotationPoint(-43F, 5.5F, -3F);
		bodyModel[43].rotateAngleZ = 0.05235988F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 36
		bodyModel[44].setRotationPoint(-43F, 5.5F, 2F);
		bodyModel[44].rotateAngleZ = 0.05235988F;

		bodyModel[45].addShapeBox(-17F, 0F, 0F, 2, 1, 5, 0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 37
		bodyModel[45].setRotationPoint(-26F, 5.5F, -2.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 38
		bodyModel[46].setRotationPoint(-2.5F, 5.5F, 24F);
		bodyModel[46].rotateAngleZ = 0.05235988F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 39
		bodyModel[47].setRotationPoint(-3F, 5.5F, 24F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 40
		bodyModel[48].setRotationPoint(2F, 5.5F, 24F);

		bodyModel[49].addShapeBox(0F, 0F, 17F, 5, 1, 2, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 41
		bodyModel[49].setRotationPoint(-2.5F, 5.5F, 24F);


		turretModel = new ModelRendererTurbo[37];
		turretModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		turretModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 29
		turretModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 31
		turretModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 38
		turretModel[4] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 39
		turretModel[5] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 40
		turretModel[6] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 41
		turretModel[7] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 42
		turretModel[8] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 44
		turretModel[9] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 45
		turretModel[10] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 46
		turretModel[11] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 47
		turretModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 48
		turretModel[13] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 49
		turretModel[14] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 21
		turretModel[15] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 22
		turretModel[16] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 85
		turretModel[17] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 86
		turretModel[18] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 87
		turretModel[19] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 88
		turretModel[20] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 89
		turretModel[21] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 94
		turretModel[22] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 95
		turretModel[23] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 96
		turretModel[24] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 98
		turretModel[25] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 99
		turretModel[26] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 100
		turretModel[27] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 101
		turretModel[28] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 102
		turretModel[29] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 0
		turretModel[30] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 1
		turretModel[31] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 2
		turretModel[32] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 3
		turretModel[33] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 4
		turretModel[34] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 5
		turretModel[35] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 8
		turretModel[36] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 9

		turretModel[0].addBox(-1.5F, 0F, -4.5F, 3, 8, 9, 0F); // Box 28
		turretModel[0].setRotationPoint(0F, -4F, 0F);

		turretModel[1].addShapeBox(-4.5F, 0F, -4.5F, 3, 8, 9, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 29
		turretModel[1].setRotationPoint(0F, -4F, 0F);

		turretModel[2].addShapeBox(1.5F, 0F, -4.5F, 3, 8, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 31
		turretModel[2].setRotationPoint(0F, -4F, 0F);

		turretModel[3].addShapeBox(-7F, -11F, -6F, 13, 10, 1, 0F, 6F, 1F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 6F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		turretModel[3].setRotationPoint(0F, -4F, 0F);

		turretModel[4].addBox(-6F, -1F, -6F, 12, 1, 12, 0F); // Box 39
		turretModel[4].setRotationPoint(0F, -4F, 0F);

		turretModel[5].addShapeBox(-14F, -11F, -6F, 7, 10, 1, 0F, -1F, -3F, 0F, -6F, 1F, 0F, -6F, 1F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, -3F, 0F); // Box 40
		turretModel[5].setRotationPoint(0F, -4F, 0F);

		turretModel[6].addShapeBox(-14F, -11F, 5F, 7, 10, 1, 0F, -1F, -3F, 0F, -6F, 1F, 0F, -6F, 1F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, -3F, 0F); // Box 41
		turretModel[6].setRotationPoint(0F, -4F, 0F);

		turretModel[7].addShapeBox(-7F, -11F, 5F, 13, 10, 1, 0F, 6F, 1F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 6F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 42
		turretModel[7].setRotationPoint(0F, -4F, 0F);

		turretModel[8].addShapeBox(-12F, -5F, 1.5F, 25, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		turretModel[8].setRotationPoint(0F, -4F, 0F);

		turretModel[9].addShapeBox(-12F, -4F, 1.5F, 25, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		turretModel[9].setRotationPoint(0F, -4F, 0F);

		turretModel[10].addShapeBox(-12F, -3F, 1.5F, 25, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 46
		turretModel[10].setRotationPoint(0F, -4F, 0F);

		turretModel[11].addShapeBox(-12F, -5F, -4.5F, 25, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		turretModel[11].setRotationPoint(0F, -4F, 0F);

		turretModel[12].addShapeBox(-12F, -4F, -4.5F, 25, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		turretModel[12].setRotationPoint(0F, -4F, 0F);

		turretModel[13].addShapeBox(-12F, -3F, -4.5F, 25, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		turretModel[13].setRotationPoint(0F, -4F, 0F);

		turretModel[14].addShapeBox(-6F, -2F, -8F, 1, 1, 14, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 21
		turretModel[14].setRotationPoint(0F, -4F, 0F);

		turretModel[15].addShapeBox(5F, -2F, -6F, 1, 1, 12, 0F, 0F, 0F, -0.1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[15].setRotationPoint(0F, -4F, 0F);

		turretModel[16].addShapeBox(-3.5F, 2F, -16.5F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 85
		turretModel[16].setRotationPoint(0F, -4F, 0F);

		turretModel[17].addBox(-7.5F, 2F, -16.5F, 4, 1, 10, 0F); // Box 86
		turretModel[17].setRotationPoint(0F, -4F, 0F);

		turretModel[18].addShapeBox(-10.5F, 2F, -16.5F, 3, 1, 10, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 87
		turretModel[18].setRotationPoint(0F, -4F, 0F);

		turretModel[19].addShapeBox(-5F, 2F, -6.5F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 88
		turretModel[19].setRotationPoint(0F, -4F, 0F);

		turretModel[20].addShapeBox(8F, -1F, -5F, 1, 8, 10, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 89
		turretModel[20].setRotationPoint(0F, -4F, 0F);

		turretModel[21].addShapeBox(6F, -17F, -17F, 1, 24, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 94
		turretModel[21].setRotationPoint(0F, -4F, 0F);

		turretModel[22].addShapeBox(6F, -17F, 5F, 1, 24, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 95
		turretModel[22].setRotationPoint(0F, -4F, 0F);

		turretModel[23].addShapeBox(5F, -17F, -17F, 1, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 96
		turretModel[23].setRotationPoint(0F, -4F, 0F);

		turretModel[24].addShapeBox(5F, -17F, 16F, 1, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 98
		turretModel[24].setRotationPoint(0F, -4F, 0F);

		turretModel[25].addShapeBox(6F, -17F, -9F, 1, 24, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 99
		turretModel[25].setRotationPoint(0F, -4F, 0F);

		turretModel[26].addShapeBox(8.05F, -1F, -14F, 1, 8, 5, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 100
		turretModel[26].setRotationPoint(0F, -4F, 0F);

		turretModel[27].addShapeBox(6.35F, -9F, -14F, 1, 8, 5, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 101
		turretModel[27].setRotationPoint(0F, -4F, 0F);

		turretModel[28].addShapeBox(4.7F, -17F, -14F, 1, 3, 5, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 102
		turretModel[28].setRotationPoint(0F, -4F, 0F);

		turretModel[29].addShapeBox(5.4F, -14F, -14F, 1, 5, 1, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, -2.3F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, 0.5F, -2.3F, 0F, 0.5F); // Box 0
		turretModel[29].setRotationPoint(0F, -4F, 0F);

		turretModel[30].addShapeBox(5.4F, -14F, -10F, 1, 5, 1, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, -2.3F, 0F, 0.5F, 2.3F, 0F, 0.5F, 2.3F, 0F, 0F, -2.3F, 0F, 0F); // Box 1
		turretModel[30].setRotationPoint(0F, -4F, 0F);

		turretModel[31].addShapeBox(10.2F, -15F, 11.5F, 1, 5, 2, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 2
		turretModel[31].setRotationPoint(0F, -4F, 0F);
		turretModel[31].rotateAngleX = 1.48352986F;
		turretModel[31].rotateAngleZ = 0.20943951F;

		turretModel[32].addShapeBox(2F, -2F, -8F, 1, 1, 14, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 3
		turretModel[32].setRotationPoint(0F, -4F, 0F);

		turretModel[33].addBox(-7F, -3F, -8.5F, 3, 3, 1, 0F); // Box 4
		turretModel[33].setRotationPoint(0F, -4F, 0F);

		turretModel[34].addBox(1F, -3F, -8.5F, 3, 3, 1, 0F); // Box 5
		turretModel[34].setRotationPoint(0F, -4F, 0F);

		turretModel[35].addShapeBox(6F, -17F, 3F, 1, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, 0F, -2.3F, 0F, 0F); // Box 8
		turretModel[35].setRotationPoint(0F, -4F, 0F);

		turretModel[36].addShapeBox(6F, -17F, -5F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, 0F, -2.3F, 0F, 0F); // Box 9
		turretModel[36].setRotationPoint(0F, -4F, 0F);


		barrelModel = new ModelRendererTurbo[71];
		barrelModel[0] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 43
		barrelModel[1] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 51
		barrelModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 52
		barrelModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 53
		barrelModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 54
		barrelModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 56
		barrelModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 57
		barrelModel[7] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 58
		barrelModel[8] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 59
		barrelModel[9] = new ModelRendererTurbo(this, 106, 1, textureX, textureY); // Box 60
		barrelModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 61
		barrelModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 62
		barrelModel[12] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 63
		barrelModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 64
		barrelModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 65
		barrelModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 66
		barrelModel[16] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 67
		barrelModel[17] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 68
		barrelModel[18] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 70
		barrelModel[19] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 71
		barrelModel[20] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 72
		barrelModel[21] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 73
		barrelModel[22] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 74
		barrelModel[23] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 76
		barrelModel[24] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 78
		barrelModel[25] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 80
		barrelModel[26] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 81
		barrelModel[27] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 83
		barrelModel[28] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 84
		barrelModel[29] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 85
		barrelModel[30] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 86
		barrelModel[31] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 42
		barrelModel[32] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 43
		barrelModel[33] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 44
		barrelModel[34] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 45
		barrelModel[35] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 46
		barrelModel[36] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 47
		barrelModel[37] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 49
		barrelModel[38] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 50
		barrelModel[39] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 51
		barrelModel[40] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 52
		barrelModel[41] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 53
		barrelModel[42] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 54
		barrelModel[43] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 55
		barrelModel[44] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 56
		barrelModel[45] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 57
		barrelModel[46] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 58
		barrelModel[47] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 59
		barrelModel[48] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 60
		barrelModel[49] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 61
		barrelModel[50] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 63
		barrelModel[51] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 64
		barrelModel[52] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 65
		barrelModel[53] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 66
		barrelModel[54] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 67
		barrelModel[55] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 68
		barrelModel[56] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 69
		barrelModel[57] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 71
		barrelModel[58] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 72
		barrelModel[59] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 73
		barrelModel[60] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 74
		barrelModel[61] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 75
		barrelModel[62] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 76
		barrelModel[63] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 77
		barrelModel[64] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 78
		barrelModel[65] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 79
		barrelModel[66] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 80
		barrelModel[67] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 81
		barrelModel[68] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 82
		barrelModel[69] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 6
		barrelModel[70] = new ModelRendererTurbo(this, 45, 125, textureX, textureY); // Box 0

		barrelModel[0].addBox(-1F, -1F, -7F, 2, 2, 14, 0F); // Box 43
		barrelModel[0].setRotationPoint(-11F, -14F, 0F);

		barrelModel[1].addShapeBox(-6F, 3F, -1.5F, 27, 4, 3, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 51
		barrelModel[1].setRotationPoint(-11F, -14F, 0F);

		barrelModel[2].addShapeBox(21F, 4F, -1F, 4, 1, 2, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 52
		barrelModel[2].setRotationPoint(-11F, -14F, 0F);

		barrelModel[3].addShapeBox(21F, 4.65F, -1F, 4, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.45F); // Box 53
		barrelModel[3].setRotationPoint(-11F, -14F, 0F);

		barrelModel[4].addShapeBox(21F, 3.35F, -1F, 4, 1, 2, 0F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 54
		barrelModel[4].setRotationPoint(-11F, -14F, 0F);

		barrelModel[5].addShapeBox(-12F, 5F, -1.5F, 6, 1, 3, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F); // Box 56
		barrelModel[5].setRotationPoint(-11F, -14F, 0F);

		barrelModel[6].addShapeBox(-13F, 3.6F, -1.5F, 7, 2, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F); // Box 57
		barrelModel[6].setRotationPoint(-11F, -14F, 0F);

		barrelModel[7].addShapeBox(-13F, 3.6F, 0.5F, 7, 2, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F); // Box 58
		barrelModel[7].setRotationPoint(-11F, -14F, 0F);

		barrelModel[8].addShapeBox(-6F, -2F, -2.5F, 13, 5, 4, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 59
		barrelModel[8].setRotationPoint(-11F, -14F, 0F);

		barrelModel[9].addShapeBox(-8F, -2F, -2.5F, 2, 2, 5, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 60
		barrelModel[9].setRotationPoint(-11F, -14F, 0F);

		barrelModel[10].addShapeBox(-8F, 1F, -2.5F, 2, 2, 5, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 61
		barrelModel[10].setRotationPoint(-11F, -14F, 0F);

		barrelModel[11].addShapeBox(-8F, -0.5F, -2.5F, 2, 2, 2, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 62
		barrelModel[11].setRotationPoint(-11F, -14F, 0F);

		barrelModel[12].addShapeBox(-8F, 0.5F, -1.1F, 2, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 63
		barrelModel[12].setRotationPoint(-11F, -14F, 0F);

		barrelModel[13].addShapeBox(-8F, -0.5F, -1.1F, 2, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 64
		barrelModel[13].setRotationPoint(-11F, -14F, 0F);

		barrelModel[14].addShapeBox(-8F, 0F, -1.1F, 2, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 65
		barrelModel[14].setRotationPoint(-11F, -14F, 0F);

		barrelModel[15].addShapeBox(-6F, -0.5F, 0.9F, 2, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 66
		barrelModel[15].setRotationPoint(-11F, -14F, 0F);

		barrelModel[16].addShapeBox(-6F, 0F, 0.9F, 2, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 67
		barrelModel[16].setRotationPoint(-11F, -14F, 0F);

		barrelModel[17].addShapeBox(-6F, 0.5F, 0.9F, 2, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 68
		barrelModel[17].setRotationPoint(-11F, -14F, 0F);

		barrelModel[18].addShapeBox(-6F, 1F, 0.7F, 13, 2, 2, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 70
		barrelModel[18].setRotationPoint(-11F, -14F, 0F);

		barrelModel[19].addShapeBox(-6F, -2F, 0.7F, 13, 2, 2, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 71
		barrelModel[19].setRotationPoint(-11F, -14F, 0F);

		barrelModel[20].addShapeBox(-4F, -0.5F, 0.7F, 11, 2, 2, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 72
		barrelModel[20].setRotationPoint(-11F, -14F, 0F);

		barrelModel[21].addShapeBox(7F, -0.5F, -2F, 22, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		barrelModel[21].setRotationPoint(-11F, -14F, 0F);

		barrelModel[22].addShapeBox(7F, -1.5F, -2F, 22, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		barrelModel[22].setRotationPoint(-11F, -14F, 0F);

		barrelModel[23].addShapeBox(7F, 1.5F, -2F, 22, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 76
		barrelModel[23].setRotationPoint(-11F, -14F, 0F);

		barrelModel[24].addShapeBox(30F, -1F, -1.5F, 30, 3, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 78
		barrelModel[24].setRotationPoint(-11F, -14F, 0F);

		barrelModel[25].addShapeBox(29F, -1.5F, -2F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0F, 0F); // Box 80
		barrelModel[25].setRotationPoint(-11F, -14F, 0F);

		barrelModel[26].addShapeBox(29F, -0.5F, -2F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 81
		barrelModel[26].setRotationPoint(-11F, -14F, 0F);

		barrelModel[27].addShapeBox(29F, 1.5F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 83
		barrelModel[27].setRotationPoint(-11F, -14F, 0F);

		barrelModel[28].addShapeBox(0F, -5F, -1.5F, 20, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		barrelModel[28].setRotationPoint(-11F, -14F, 0F);

		barrelModel[29].addShapeBox(0F, -4F, -1.5F, 20, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		barrelModel[29].setRotationPoint(-11F, -14F, 0F);

		barrelModel[30].addShapeBox(0F, -3F, -1.5F, 20, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 86
		barrelModel[30].setRotationPoint(-11F, -14F, 0F);

		barrelModel[31].addShapeBox(-12F, 4.7F, -1F, 1, 1, 2, 0F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F); // Box 42
		barrelModel[31].setRotationPoint(-11F, -14F, 0F);

		barrelModel[32].addShapeBox(-12F, 4.7F, -1F, 1, 1, 2, 0F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F); // Box 43
		barrelModel[32].setRotationPoint(-10F, -14F, 0F);

		barrelModel[33].addShapeBox(-12F, 4.7F, -1F, 1, 1, 2, 0F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F); // Box 44
		barrelModel[33].setRotationPoint(-7F, -14F, 0F);

		barrelModel[34].addShapeBox(-12F, 4.7F, -1F, 1, 1, 2, 0F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F); // Box 45
		barrelModel[34].setRotationPoint(-8F, -14F, 0F);

		barrelModel[35].addShapeBox(-16F, 1F, -1.5F, 8, 1, 3, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F); // Box 46
		barrelModel[35].setRotationPoint(-11F, -14F, 0F);

		barrelModel[36].addShapeBox(-16F, 0F, -1.5F, 8, 1, 1, 0F, 0F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 47
		barrelModel[36].setRotationPoint(-11F, -14F, 0F);

		barrelModel[37].addShapeBox(-16.3F, 0F, -1F, 1, 1, 2, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F); // Box 49
		barrelModel[37].setRotationPoint(-11F, -14F, 0F);

		barrelModel[38].addShapeBox(-16F, 0F, 0.5F, 8, 1, 1, 0F, 0F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 50
		barrelModel[38].setRotationPoint(-11F, -14F, 0F);

		barrelModel[39].addShapeBox(-17F, -3.5F, -3.7F, 43, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 51
		barrelModel[39].setRotationPoint(-11F, -14F, 0F);

		barrelModel[40].addShapeBox(0F, -4.5F, -2.5F, 1, 2, 5, 0F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F); // Box 52
		barrelModel[40].setRotationPoint(-11F, -14F, 0F);

		barrelModel[41].addShapeBox(0F, -4.5F, 1.5F, 1, 2, 3, 0F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -1.3F, -1.3F, -0.2F, -1.3F, -1.3F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F); // Box 53
		barrelModel[41].setRotationPoint(-11F, -14F, 0F);

		barrelModel[42].addShapeBox(0F, -4.5F, -4.5F, 1, 2, 3, 0F, -0.2F, -1.3F, -1.3F, -0.2F, -1.3F, -1.3F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F); // Box 54
		barrelModel[42].setRotationPoint(-11F, -14F, 0F);

		barrelModel[43].addShapeBox(8F, -4.5F, -4.5F, 1, 2, 3, 0F, -0.2F, -1.3F, -1.3F, -0.2F, -1.3F, -1.3F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F); // Box 55
		barrelModel[43].setRotationPoint(-11F, -14F, 0F);

		barrelModel[44].addShapeBox(8F, -4.5F, 1.5F, 1, 2, 3, 0F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -1.3F, -1.3F, -0.2F, -1.3F, -1.3F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F); // Box 56
		barrelModel[44].setRotationPoint(-11F, -14F, 0F);

		barrelModel[45].addShapeBox(8F, -4.5F, -2.5F, 1, 2, 5, 0F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F); // Box 57
		barrelModel[45].setRotationPoint(-11F, -14F, 0F);

		barrelModel[46].addShapeBox(-3F, -3F, 2.8F, 12, 3, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 58
		barrelModel[46].setRotationPoint(-11F, -14F, 0F);

		barrelModel[47].addShapeBox(-3F, -0.6F, 2.8F, 12, 5, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F); // Box 59
		barrelModel[47].setRotationPoint(-11F, -14F, 0F);

		barrelModel[48].addShapeBox(-3F, 3.8F, 0.8F, 12, 1, 2, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 60
		barrelModel[48].setRotationPoint(-11F, -14F, 0F);

		barrelModel[49].addShapeBox(-3F, -0.6F, -3.5F, 2, 5, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F); // Box 61
		barrelModel[49].setRotationPoint(-11F, -14F, 0F);

		barrelModel[50].addShapeBox(-3F, -3F, -3.5F, 12, 3, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 63
		barrelModel[50].setRotationPoint(-11F, -14F, 0F);

		barrelModel[51].addShapeBox(-3F, 3.8F, -2.5F, 12, 1, 2, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 64
		barrelModel[51].setRotationPoint(-11F, -14F, 0F);

		barrelModel[52].addShapeBox(7F, -0.6F, -3.5F, 2, 5, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F); // Box 65
		barrelModel[52].setRotationPoint(-11F, -14F, 0F);

		barrelModel[53].addShapeBox(19.5F, -4F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		barrelModel[53].setRotationPoint(-11F, -14F, 0F);

		barrelModel[54].addShapeBox(-0.5F, -3.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		barrelModel[54].setRotationPoint(-11F, -14F, 0F);

		barrelModel[55].addShapeBox(-2.5F, -3.5F, -0.5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 68
		barrelModel[55].setRotationPoint(-11F, -14F, 0F);

		barrelModel[56].addShapeBox(-3.5F, -3.5F, -0.5F, 1, 2, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 69
		barrelModel[56].setRotationPoint(-11F, -14F, 0F);

		barrelModel[57].addShapeBox(-3.5F, -2F, -0.5F, 1, 1, 1, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 71
		barrelModel[57].setRotationPoint(-11F, -14F, 0F);

		barrelModel[58].addShapeBox(-16F, 1.3F, 1.4F, 8, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 72
		barrelModel[58].setRotationPoint(-11F, -14F, 0F);

		barrelModel[59].addShapeBox(-16F, 3.3F, 1.4F, 7, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 73
		barrelModel[59].setRotationPoint(-11F, -14F, 0F);

		barrelModel[60].addShapeBox(-10F, 6F, 1.4F, 9, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74
		barrelModel[60].setRotationPoint(-11F, -14F, 0F);

		barrelModel[61].addShapeBox(-16F, 0.3F, 1.4F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 75
		barrelModel[61].setRotationPoint(-11F, -14F, 0F);

		barrelModel[62].addShapeBox(-10F, 0.3F, 1.4F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 76
		barrelModel[62].setRotationPoint(-11F, -14F, 0F);

		barrelModel[63].addShapeBox(-5F, 6F, 2.5F, 4, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 77
		barrelModel[63].setRotationPoint(-11F, -14F, 0F);

		barrelModel[64].addShapeBox(-5F, 6F, -3.5F, 4, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 78
		barrelModel[64].setRotationPoint(-11F, -14F, 0F);

		barrelModel[65].addShapeBox(-5.15F, 6F, -2.5F, 1, 1, 5, 0F, -0.15F, -0.15F, 0.15F, -0.15F, -0.15F, 0.15F, -0.15F, -0.15F, 0.15F, -0.15F, -0.15F, 0.15F, -0.15F, -0.15F, 0.15F, -0.15F, -0.15F, 0.15F, -0.15F, -0.15F, 0.15F, -0.15F, -0.15F, 0.15F); // Box 79
		barrelModel[65].setRotationPoint(-11F, -14F, 0F);

		barrelModel[66].addShapeBox(-16F, 0.3F, 1.4F, 1, 1, 1, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 80
		barrelModel[66].setRotationPoint(-11F, -14F, 0F);

		barrelModel[67].addShapeBox(-10F, 0.3F, 1.4F, 1, 1, 1, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 81
		barrelModel[67].setRotationPoint(-11F, -14F, 0F);

		barrelModel[68].addShapeBox(-16F, 6F, 1.4F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 82
		barrelModel[68].setRotationPoint(-11F, -14F, 0F);

		barrelModel[69].addShapeBox(17F, -7F, -3F, 1, 5, 6, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 6
		barrelModel[69].setRotationPoint(-11F, -14F, 0F);

		barrelModel[70].addShapeBox(60F, -1F, -1.5F, 1, 6, 6, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F); // Box 0
		barrelModel[70].setRotationPoint(-11F, -14F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
