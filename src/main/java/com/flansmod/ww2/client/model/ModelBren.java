//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBren extends ModelMG //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelBren() //Same as Filename
	{
		bipodModel = new ModelRendererTurbo[5];
		bipodModel[0] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 29
		bipodModel[1] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 30
		bipodModel[2] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 31
		bipodModel[3] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 32
		bipodModel[4] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 33

		bipodModel[0].addShapeBox(-0.5F, -0.5F, -0.8F, 1, 1, 6, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -2.3F, -1.3F, 0F, 1.7F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -2.3F, 0.7F, 0F, 1.7F, 0.7F, 0F); // Box 29
		bipodModel[0].setRotationPoint(0F, -5.5F, -0.25F);
		bipodModel[0].rotateAngleX = -1.18682389F;

		bipodModel[1].addShapeBox(-0.5F, -0.5F, -0.8F, 1, 1, 6, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 1.7F, -1.3F, 0F, -2.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 1.7F, 0.7F, 0F, -2.3F, 0.7F, 0F); // Box 30
		bipodModel[1].setRotationPoint(0F, -5.5F, -0.25F);
		bipodModel[1].rotateAngleX = -1.18682389F;

		bipodModel[2].addShapeBox(-0.5F, -0.5F, -1F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 31
		bipodModel[2].setRotationPoint(0F, -6F, 0F);

		bipodModel[3].addShapeBox(-2.5F, 0.5F, 5F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F); // Box 32
		bipodModel[3].setRotationPoint(0F, -5.5F, -0.25F);
		bipodModel[3].rotateAngleX = -1.18682389F;

		bipodModel[4].addShapeBox(1.5F, 0.5F, 5F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F); // Box 33
		bipodModel[4].setRotationPoint(0F, -5.5F, -0.25F);
		bipodModel[4].rotateAngleX = -1.18682389F;


		gunModel = new ModelRendererTurbo[27];
		gunModel[0] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 25, 6, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 18
		gunModel[16] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 21
		gunModel[19] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 23
		gunModel[21] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 24
		gunModel[22] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 25
		gunModel[23] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 34, 22, textureX, textureY); // Box 0

		gunModel[0].addShapeBox(-0.5F, -2F, -7F, 1, 1, 10, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -6F, -0.5F);

		gunModel[1].addShapeBox(-0.5F, -2F, 3F, 1, 1, 4, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 1
		gunModel[1].setRotationPoint(0F, -6F, -0.5F);

		gunModel[2].addShapeBox(-0.5F, -2F, -4F, 1, 1, 1, 0F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F); // Box 2
		gunModel[2].setRotationPoint(0F, -6F, -0.5F);

		gunModel[3].addShapeBox(-0.5F, -2F, -14F, 1, 2, 7, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 3
		gunModel[3].setRotationPoint(0F, -6F, -0.5F);

		gunModel[4].addShapeBox(-0.5F, -1.2F, -7.8F, 1, 1, 9, 0F, -0.3F, -0.3F, 0.01F, -0.3F, -0.3F, 0.01F, -0.3F, -0.3F, 0.01F, -0.3F, -0.3F, 0.01F, -0.3F, 0F, 0.01F, -0.3F, 0F, 0.01F, -0.3F, 0F, 0.01F, -0.3F, 0F, 0.01F); // Box 4
		gunModel[4].setRotationPoint(0F, -6F, -0.5F);

		gunModel[5].addShapeBox(-0.5F, -2F, 0F, 1, 1, 1, 0F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F); // Box 5
		gunModel[5].setRotationPoint(0F, -6F, -0.5F);

		gunModel[6].addShapeBox(-0.5F, -1.2F, 0F, 1, 1, 1, 0F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F); // Box 6
		gunModel[6].setRotationPoint(0F, -6F, -0.5F);

		gunModel[7].addShapeBox(-0.5F, -2F, -13F, 1, 1, 5, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(0F, -6F, -0.5F);

		gunModel[8].addShapeBox(-0.5F, -2F, -16F, 1, 2, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[8].setRotationPoint(0F, -6F, -0.5F);

		gunModel[9].addShapeBox(-0.5F, -2F, -17F, 1, 2, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[9].setRotationPoint(0F, -6F, -0.5F);

		gunModel[10].addShapeBox(-0.5F, -1F, -19F, 1, 1, 2, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[10].setRotationPoint(0F, -6F, -0.5F);

		gunModel[11].addShapeBox(-0.5F, -1F, -20F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 14
		gunModel[11].setRotationPoint(0F, -6F, -0.5F);

		gunModel[12].addShapeBox(-0.5F, -1F, -21F, 1, 1, 1, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 15
		gunModel[12].setRotationPoint(0F, -6F, -0.5F);

		gunModel[13].addShapeBox(-0.5F, 0F, -14F, 1, 3, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Box 16
		gunModel[13].setRotationPoint(0F, -6F, -0.5F);

		gunModel[14].addShapeBox(-0.5F, -0.2F, -13.5F, 1, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 17
		gunModel[14].setRotationPoint(0F, -6F, -0.5F);

		gunModel[15].addShapeBox(-0.5F, -2F, 3F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[15].setRotationPoint(0F, -6F, -0.5F);

		gunModel[16].addShapeBox(-1.5F, -3F, 3F, 1, 1, 1, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 19
		gunModel[16].setRotationPoint(0F, -6F, -0.5F);

		gunModel[17].addShapeBox(-1.9F, -3F, 3F, 1, 1, 1, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 20
		gunModel[17].setRotationPoint(0F, -6F, -0.5F);

		gunModel[18].addShapeBox(-1.1F, -3F, 3F, 1, 1, 1, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 21
		gunModel[18].setRotationPoint(0F, -6F, -0.5F);

		gunModel[19].addShapeBox(-1.5F, -3F, 3F, 1, 1, 1, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[19].setRotationPoint(0F, -6F, -0.5F);

		gunModel[20].addShapeBox(-1F, -3F, -10F, 1, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 23
		gunModel[20].setRotationPoint(0F, -6F, -0.5F);

		gunModel[21].addShapeBox(-2F, -3F, -10F, 1, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 24
		gunModel[21].setRotationPoint(0F, -6F, -0.5F);

		gunModel[22].addShapeBox(-1F, -3F, -10F, 2, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 25
		gunModel[22].setRotationPoint(-1F, -6F, -0.5F);

		gunModel[23].addShapeBox(-1F, -2.2F, -10F, 2, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 26
		gunModel[23].setRotationPoint(-1F, -6F, -0.5F);

		gunModel[24].addShapeBox(-1.3F, -2F, -4F, 2, 1, 1, 0F, -0.1F, 0.6F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, 0.6F, 0.2F, -0.1F, -1.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -1.4F, 0.2F); // Box 27
		gunModel[24].setRotationPoint(-1F, -6F, -0.5F);

		gunModel[25].addShapeBox(-3.1F, -3F, -5F, 1, 1, 3, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 28
		gunModel[25].setRotationPoint(0F, -6F, -0.5F);

		gunModel[26].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 0
		gunModel[26].setRotationPoint(0F, -6F, -0.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		ammoModel[1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 9
		ammoModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 10

		ammoModel[0].addShapeBox(-0.5F, -3.1F, -12F, 1, 1, 3, 0F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 8
		ammoModel[0].setRotationPoint(0F, -6F, -0.5F);

		ammoModel[1].addShapeBox(-0.5F, -4.6F, -11.9F, 1, 1, 3, 0F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F); // Box 9
		ammoModel[1].setRotationPoint(0F, -6F, -0.5F);

		ammoModel[2].addShapeBox(-0.5F, -6.1F, -11.6F, 1, 1, 3, 0F, -0.2F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -0.5F, 0.4F, -0.2F, -0.5F, 0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F); // Box 10
		ammoModel[2].setRotationPoint(0F, -6F, -0.5F);


		flipAll();
	}
}
