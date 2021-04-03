//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Glock
// Model Creator: 
// Created on: 02.03.2020 - 22:50:09
// Last changed on: 02.03.2020 - 22:50:09

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGlock extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelGlock() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[8];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-8.5F, 1F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 11, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-5F, -12F, -2.5F);
		gunModel[1].rotateAngleZ = -0.2443461F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-7F, -2F, -2F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(4F, -4F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 4, 42, 6, 0F); // Import Box0
		gunModel[4].setRotationPoint(18F, -29F, -3F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 8, 3, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(-11F, -10F, -2F);
		gunModel[5].rotateAngleZ = -0.17453293F;

		gunModel[6].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(34F, -21F, -1.5F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 4, 6, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(19F, -32F, -2F);
		gunModel[7].rotateAngleZ = -1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 7, 21, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-3F, -9F, -1.5F);
		ammoModel[0].rotateAngleZ = -0.17453293F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 3, 5, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-8F, 9F, -2.5F);
		ammoModel[1].rotateAngleZ = -0.17453293F;


		slideModel = new ModelRendererTurbo[5];
		slideModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		slideModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 34
		slideModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34
		slideModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		slideModel[0].setRotationPoint(-3F, -34.25F, 1F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		slideModel[1].setRotationPoint(-3F, -34.25F, -2F);

		slideModel[2].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		slideModel[2].setRotationPoint(33F, -34.25F, -0.5F);

		slideModel[3].addBox(0F, -17F, 0F, 1, 38, 5, 0F); // Import Box0
		slideModel[3].setRotationPoint(17F, -33.25F, -2.5F);
		slideModel[3].rotateAngleZ = -1.57079633F;

		slideModel[4].addBox(0F, -17F, 0F, 4, 42, 6, 0F); // Import Box0
		slideModel[4].setRotationPoint(18F, -33F, -3F);
		slideModel[4].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(36F /16F, 30F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 33F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(28 /16F, 26F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}