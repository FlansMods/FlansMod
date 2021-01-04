//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+
package com.flansmod.modernweapons.client.model;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelA91 extends ModelGun
{
	int textureX = 64;
	int textureY = 16;

	public ModelA91()
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 32, 5, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 10, 3, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 10, 5, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 14, 5, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 32, 0, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 36, 0, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 12, 13, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 6, 12, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 16, 7, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 20
		gunModel[15] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Box 21

		gunModel[0].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-7F, -3F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(4F, -2F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(0F, -2F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-7F, -4F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-2F, -4F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		gunModel[5].setRotationPoint(-1F, -5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 8
		gunModel[6].setRotationPoint(3.5F, -5F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 9
		gunModel[7].setRotationPoint(-1F, -3.5F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 10
		gunModel[8].setRotationPoint(8F, -3F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 11
		gunModel[9].setRotationPoint(11F, -3F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[10].setRotationPoint(7F, -5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.25F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0.25F, -0.8F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 13
		gunModel[11].setRotationPoint(2F, -1.5F, -1F);

		gunModel[12].addShapeBox(-8F, -4F, -1F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gunModel[13].addShapeBox(-6F, -2F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 15

		gunModel[14].addShapeBox(0F, -0.5F, -1F, 2, 2, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 20

		gunModel[15].addShapeBox(-8F, -2F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 21


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 24, 5, textureX, textureY); // Box 16
		ammoModel[1] = new ModelRendererTurbo(this, 24, 8, textureX, textureY); // Box 17
		ammoModel[2] = new ModelRendererTurbo(this, 24, 12, textureX, textureY); // Box 18

		ammoModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 16
		ammoModel[0].setRotationPoint(-4F, -2F, -1F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 17
		ammoModel[1].setRotationPoint(-4F, -1F, -1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.25F, 0F); // Box 18
		ammoModel[2].setRotationPoint(-3.75F, 1F, -1F);


		barrelAttachPoint = new Vector3f(0F / 16F, 0F / 16F, 0F / 16F);
		stockAttachPoint = new Vector3f(0F / 16F, 0F / 16F, 0F / 16F);
		scopeAttachPoint = new Vector3f(0F / 16F, 0F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(0 / 16F, 0F / 16F, 0F / 16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
