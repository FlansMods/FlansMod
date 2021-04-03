//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model50Cal extends ModelMG //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public Model50Cal() //Same as Filename
	{
		bipodModel = new ModelRendererTurbo[4];
		bipodModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		bipodModel[1] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 12
		bipodModel[2] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 14
		bipodModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 15

		bipodModel[0].addBox(0F, -6F, -2F, 1, 3, 1, 0F); // Box 11
		bipodModel[0].setRotationPoint(-0.5F, 0F, 0F);

		bipodModel[1].addShapeBox(0F, -3F, -2F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 6F, 6F, 0F, 6F, 6F, 0F, -6F, -6F, 0F, -6F); // Box 12
		bipodModel[1].setRotationPoint(-0.5F, 0F, 0F);

		bipodModel[2].addShapeBox(0F, -3F, -2F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, -6F, 6F, 0F, -6F); // Box 14
		bipodModel[2].setRotationPoint(-0.5F, 0F, 0F);

		bipodModel[3].addShapeBox(0F, -3F, -2F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 15
		bipodModel[3].setRotationPoint(-0.5F, 0F, 0F);


		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 299
		gunModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 299
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 299
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 299
		gunModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 299
		gunModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 299
		gunModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 299
		gunModel[7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 299
		gunModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 299
		gunModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 299

		gunModel[0].addShapeBox(-0.5F, -0.5F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F); // Box 299
		gunModel[0].setRotationPoint(0F, -6F, -1.5F);

		gunModel[1].addShapeBox(-0.5F, -1.2F, 4F, 1, 1, 7, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F); // Box 299
		gunModel[1].setRotationPoint(0F, -6F, -1.5F);

		gunModel[2].addShapeBox(-0.5F, -1.2F, -1F, 1, 1, 5, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		gunModel[2].setRotationPoint(0F, -6F, -1.5F);

		gunModel[3].addShapeBox(-1F, -1.7F, -10F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		gunModel[3].setRotationPoint(0F, -6F, -1.5F);

		gunModel[4].addShapeBox(0F, -1.5F, -7F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		gunModel[4].setRotationPoint(0F, -6F, -1.5F);

		gunModel[5].addShapeBox(-1F, -1.7F, -14F, 2, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 299
		gunModel[5].setRotationPoint(0F, -6F, -1.5F);

		gunModel[6].addShapeBox(-2F, -2.2F, -16F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		gunModel[6].setRotationPoint(0F, -6F, -1.5F);

		gunModel[7].addShapeBox(1F, -2.2F, -16F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		gunModel[7].setRotationPoint(0F, -6F, -1.5F);

		gunModel[8].addShapeBox(1F, -1.7F, -15F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		gunModel[8].setRotationPoint(0F, -6F, -1.5F);

		gunModel[9].addShapeBox(-1F, -1.7F, -15F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		gunModel[9].setRotationPoint(0F, -6F, -1.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 299

		ammoModel[0].addShapeBox(-5F, -1.2F, -7F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		ammoModel[0].setRotationPoint(0F, -6F, -1.5F);


		flipAll();
	}
}
