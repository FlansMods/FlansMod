//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMG42 extends ModelMG //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelMG42() //Same as Filename
	{
		bipodModel = new ModelRendererTurbo[3];
		bipodModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bipodModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 3
		bipodModel[2] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 21

		bipodModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1
		bipodModel[0].setRotationPoint(-0.5F, -5.5F, 0F);

		bipodModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 2F, -0.5F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, 2F, -0.5F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 3
		bipodModel[1].setRotationPoint(2F, -5F, 0F);

		bipodModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -2.5F, 0F, -0.2F, 2F, -0.5F, -0.2F, 2F, -0.5F, -0.2F, -2.5F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 21
		bipodModel[2].setRotationPoint(-3F, -5F, 0F);


		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 8
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 10
		gunModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		gunModel[8] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 13
		gunModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 15
		gunModel[10] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 16
		gunModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 17
		gunModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0

		gunModel[0].addShapeBox(-0.5F, -1F, -10F, 1, 1, 12, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[0].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[1].addShapeBox(-0.5F, -1F, -13F, 1, 1, 3, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 5
		gunModel[1].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[2].addShapeBox(-0.5F, -1F, -18F, 1, 1, 5, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 6
		gunModel[2].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[3].addShapeBox(-0.5F, -1F, 3F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 7
		gunModel[3].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[4].addShapeBox(-0.5F, -1F, 2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 8
		gunModel[4].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[5].addShapeBox(1F, -1.2F, -11F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 9
		gunModel[5].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[6].addShapeBox(0.5F, -1.2F, -11F, 1, 2, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 10
		gunModel[6].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[7].addShapeBox(-0.5F, -2F, 1F, 1, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 12
		gunModel[7].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[8].addShapeBox(-1F, -1.7F, -9F, 2, 1, 2, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 13
		gunModel[8].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[9].addShapeBox(-0.5F, -1.5F, -15.9F, 1, 1, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[9].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[10].addShapeBox(-0.5F, -1F, -20F, 1, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 16
		gunModel[10].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[11].addShapeBox(-0.5F, 0.5F, -17F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F); // Box 17
		gunModel[11].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[12].addShapeBox(-0.5F, -1F, -10F, 1, 1, 12, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 0
		gunModel[12].setRotationPoint(0F, -5.5F, 0.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 18
		ammoModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		ammoModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 1

		ammoModel[0].addShapeBox(-5F, -1F, -12.5F, 4, 3, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 18
		ammoModel[0].setRotationPoint(0F, -5.5F, 0.5F);

		ammoModel[1].addShapeBox(-2.1F, -1.06F, -12.5F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		ammoModel[1].setRotationPoint(0F, -5.5F, 0.5F);

		ammoModel[2].addShapeBox(-5F, -1.06F, -12.5F, 4, 3, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 1
		ammoModel[2].setRotationPoint(0F, -5.5F, 0.5F);


		flipAll();
	}
}
