//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBAR extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBAR() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[42];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17
		gunModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		gunModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 19
		gunModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		gunModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 22
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 23
		gunModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 24
		gunModel[9] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 54
		gunModel[10] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 1
		gunModel[12] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 2
		gunModel[13] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 3
		gunModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 4
		gunModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		gunModel[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 7
		gunModel[17] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 9
		gunModel[18] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 10
		gunModel[19] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 23
		gunModel[20] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 29
		gunModel[21] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 30
		gunModel[22] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 31
		gunModel[23] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 33
		gunModel[24] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 0
		gunModel[25] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 1
		gunModel[26] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 3
		gunModel[27] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 4
		gunModel[28] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 5
		gunModel[29] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 6
		gunModel[30] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 7
		gunModel[31] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 8
		gunModel[32] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 9
		gunModel[33] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 10
		gunModel[34] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 11
		gunModel[35] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 12
		gunModel[36] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 13
		gunModel[37] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 14
		gunModel[38] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 16
		gunModel[39] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 17
		gunModel[40] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 18
		gunModel[41] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 19

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 2
		gunModel[0].setRotationPoint(-3F, -10F, -2.5F);
		gunModel[0].rotateAngleZ = -1.04719755F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 24, 4, 4, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -15F, 0F, 0F); // Box 4
		gunModel[1].setRotationPoint(-38F, -2.5F, -2F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 49, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[2].setRotationPoint(15F, -11F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 11, 3, 5, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 17
		gunModel[3].setRotationPoint(5F, -8.5F, -2.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 8F, 0F, -1F); // Box 19
		gunModel[4].setRotationPoint(5F, -5.5F, -2.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[5].setRotationPoint(-1.5F, -4.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[6].setRotationPoint(3.5F, -5.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[7].setRotationPoint(-1F, -2.5F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[8].setRotationPoint(1F, -5F, 0F);
		gunModel[8].rotateAngleZ = 0.20943951F;

		gunModel[9].addShapeBox(0F, 0F, 0F, 24, 6, 4, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -14F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 54
		gunModel[9].setRotationPoint(-38F, -8.5F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[10].setRotationPoint(16F, -10F, -2.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		gunModel[11].setRotationPoint(16F, -5.5F, -2.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[12].setRotationPoint(16F, -6.5F, -2.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 3
		gunModel[13].setRotationPoint(5F, -11F, -2.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[14].setRotationPoint(10F, -10F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[15].setRotationPoint(15F, -11F, -2.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 39, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 7
		gunModel[16].setRotationPoint(11F, -8F, -1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 9
		gunModel[17].setRotationPoint(47F, -11.5F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[18].setRotationPoint(17F, -8F, -2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 23
		gunModel[19].setRotationPoint(17F, -6F, -2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[20].setRotationPoint(10F, -10.5F, -2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[21].setRotationPoint(15F, -10F, -2.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[22].setRotationPoint(10F, -9F, -2.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 33
		gunModel[23].setRotationPoint(61F, -12.5F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F); // Box 0
		gunModel[24].setRotationPoint(-15F, -8.5F, -2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, -2F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -2F, 0F); // Box 1
		gunModel[25].setRotationPoint(-12F, -8.5F, -2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[26].setRotationPoint(15F, -11F, 0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[27].setRotationPoint(10F, -9.5F, -2F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[28].setRotationPoint(10F, -11F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 6
		gunModel[29].setRotationPoint(7F, -12F, -1.5F);
		gunModel[29].rotateAngleZ = -0.15707963F;

		gunModel[30].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[30].setRotationPoint(7F, -11.5F, -1.5F);

		gunModel[31].addShapeBox(0F, -1F, 2F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[31].setRotationPoint(7F, -11.5F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 9
		gunModel[32].setRotationPoint(20.5F, -11.5F, -1F);

		gunModel[33].addShapeBox(0F, -5F, 0F, 2, 6, 2, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 10
		gunModel[33].setRotationPoint(21F, -10.5F, -1F);
		gunModel[33].rotateAngleX = 0.78539816F;

		gunModel[34].addShapeBox(-4.5F, -6F, 0F, 7, 2, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 11
		gunModel[34].setRotationPoint(21F, -10.5F, -1F);
		gunModel[34].rotateAngleX = 0.78539816F;

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 12
		gunModel[35].setRotationPoint(60F, -9.5F, -1F);
		gunModel[35].rotateAngleX = 0.26179939F;
		gunModel[35].rotateAngleZ = -1.1693706F;

		gunModel[36].addShapeBox(0F, -1F, 0F, 2, 20, 2, 0F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 13
		gunModel[36].setRotationPoint(60F, -9.5F, -1F);
		gunModel[36].rotateAngleX = -0.26179939F;
		gunModel[36].rotateAngleZ = -1.1693706F;

		gunModel[37].addShapeBox(0F, 5F, 0F, 2, 1, 2, 0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F); // Box 14
		gunModel[37].setRotationPoint(60F, -9.5F, -1F);
		gunModel[37].rotateAngleX = -0.26179939F;
		gunModel[37].rotateAngleZ = -1.1693706F;

		gunModel[38].addShapeBox(0.5F, 18F, 0F, 2, 1, 2, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Box 16
		gunModel[38].setRotationPoint(60F, -9.5F, -1F);
		gunModel[38].rotateAngleX = -0.26179939F;
		gunModel[38].rotateAngleZ = -1.1693706F;

		gunModel[39].addShapeBox(0F, 6F, 0F, 2, 1, 2, 0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F); // Box 17
		gunModel[39].setRotationPoint(60F, -9.5F, -1F);
		gunModel[39].rotateAngleX = 0.26179939F;
		gunModel[39].rotateAngleZ = -1.1693706F;

		gunModel[40].addShapeBox(0.5F, 19F, 0F, 2, 1, 2, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Box 18
		gunModel[40].setRotationPoint(60F, -9.5F, -1F);
		gunModel[40].rotateAngleX = 0.26179939F;
		gunModel[40].rotateAngleZ = -1.1693706F;

		gunModel[41].addShapeBox(0F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[41].setRotationPoint(60F, -9F, -0.5F);
		gunModel[41].rotateAngleZ = -1.1693706F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 2

		ammoModel[0].addShapeBox(5.5F, -4.5F, -1.5F, 8, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		ammoModel[0].setRotationPoint(0F, 0F, 0F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 0

		slideModel[0].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 0
		slideModel[0].setRotationPoint(6.5F, -9F, -3F);


		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		translateAll(0F, -5F, 0.3F);
		thirdPersonOffset = new Vector3f(-0.06F, -0.13F, 0.01F);


		flipAll();
	}
}
