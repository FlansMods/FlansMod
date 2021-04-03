//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GL1
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

public class ModelGL1 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelGL1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 12, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-37F, -5.75F, -2F);
		gunModel[0].rotateAngleZ = -0.87266463F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-24F, -17F, -1.5F);
		gunModel[1].rotateAngleZ = -0.9424778F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 19, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-20F, -13F, -1F);
		gunModel[2].rotateAngleZ = -0.9424778F;

		gunModel[3].addBox(0F, -17F, 0F, 20, 12, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-45F, -4F, -2.5F);
		gunModel[3].rotateAngleZ = -0.12217305F;

		gunModel[4].addBox(0F, -17F, 0F, 2, 6, 4, 0F); // Import Box0
		gunModel[4].setRotationPoint(4F, 6F, -2F);

		gunModel[5].addBox(0F, -17F, 0F, 14, 38, 7, 0F); // Import Box0
		gunModel[5].setRotationPoint(-51F, -7F, -3.5F);
		gunModel[5].rotateAngleZ = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 13, 1, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(-7F, 12F, -1.5F);

		gunModel[7].addBox(0F, -17F, 0F, 23, 6, 8, 0F); // Import Box0
		gunModel[7].setRotationPoint(-55F, -6.5F, -4F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 4, 34, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-51F, -21F, -3F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 40, 6, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(-12F, 1F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 2, 6, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(-7F, 6F, -2F);

		gunModel[11].addBox(0F, -17F, 0F, 4, 14, 6, 0F); // Import Box0
		gunModel[11].setRotationPoint(-51F, -25F, -3F);
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 4, 16, 6, 0F); // Import Box0
		gunModel[12].setRotationPoint(-12F, -14F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 4, 4, 8, 0F); // Import Box0
		gunModel[13].setRotationPoint(22F, 2F, -4F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 16, 7, 7, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-6F, -9F, -3.5F);


		breakActionModel = new ModelRendererTurbo[11];
		breakActionModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		breakActionModel[1] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		breakActionModel[2] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		breakActionModel[3] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		breakActionModel[4] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Box0
		breakActionModel[5] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0
		breakActionModel[6] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		breakActionModel[7] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		breakActionModel[8] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import Box0
		breakActionModel[9] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Import Box0
		breakActionModel[10] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Import Box0

		breakActionModel[0].addBox(0F, -17F, 0F, 84, 11, 11, 0F); // Import Box0
		breakActionModel[0].setRotationPoint(-8F, -10F, -5.5F);

		breakActionModel[1].addBox(0F, -17F, 0F, 20, 4, 5, 0F); // Import Box0
		breakActionModel[1].setRotationPoint(-8F, -14F, -2.5F);

		breakActionModel[2].addBox(0F, -17F, 0F, 30, 6, 5, 0F); // Import Box0
		breakActionModel[2].setRotationPoint(28F, 1F, -2.5F);

		breakActionModel[3].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[3].setRotationPoint(63F, -56.5F, -4F);
		breakActionModel[3].rotateAngleZ = 1.57079633F;

		breakActionModel[4].addBox(0F, -17F, 0F, 34, 2, 1, 0F); // Import Box0
		breakActionModel[4].setRotationPoint(63F, -22.5F, -4F);
		breakActionModel[4].rotateAngleZ = 1.57079633F;

		breakActionModel[5].addBox(0F, -17F, 0F, 34, 2, 1, 0F); // Import Box0
		breakActionModel[5].setRotationPoint(63F, -22.5F, 3F);
		breakActionModel[5].rotateAngleZ = 1.57079633F;

		breakActionModel[6].addBox(0F, -17F, 0F, 7, 5, 12, 0F); // Import Box0
		breakActionModel[6].setRotationPoint(61F, -21.5F, -6F);
		breakActionModel[6].rotateAngleZ = 1.57079633F;

		breakActionModel[7].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[7].setRotationPoint(64F, -50.5F, -4F);
		breakActionModel[7].rotateAngleZ = 1.57079633F;

		breakActionModel[8].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[8].setRotationPoint(64F, -44.5F, -4F);
		breakActionModel[8].rotateAngleZ = 1.57079633F;

		breakActionModel[9].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[9].setRotationPoint(64F, -38.5F, -4F);
		breakActionModel[9].rotateAngleZ = 1.57079633F;

		breakActionModel[10].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[10].setRotationPoint(64F, -32.5F, -4F);
		breakActionModel[10].rotateAngleZ = 1.57079633F;



		barrelAttachPoint = new Vector3f(74F /16F, 25F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 13F /16F, 1F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(18 /16F, 11F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BREAK_ACTION;


		numBulletsInReloadAnimation = 5F;


		pumpHandleDistance = 2F;


		barrelBreakPoint = new Vector3f(24 /16F, 13F /16F, 1F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}