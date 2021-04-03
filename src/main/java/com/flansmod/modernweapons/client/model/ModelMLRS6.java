//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MLRS6
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

public class ModelMLRS6 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelMLRS6() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 30, 10, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-62F, -0.75F, -3F);
		gunModel[0].rotateAngleZ = -0.45378561F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-39F, -5F, -2.5F);
		gunModel[1].rotateAngleZ = -0.52359878F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 19, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-36F, -1F, -2F);
		gunModel[2].rotateAngleZ = -0.52359878F;

		gunModel[3].addBox(0F, -17F, 0F, 2, 6, 4, 0F); // Import Box0
		gunModel[3].setRotationPoint(-18F, 3F, -2F);

		gunModel[4].addBox(0F, -17F, 0F, 30, 22, 9, 0F); // Import Box0
		gunModel[4].setRotationPoint(-65F, -7F, -4.5F);

		gunModel[5].addBox(0F, -17F, 0F, 8, 1, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-24F, 9F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 8, 41, 6, 0F); // Import Box0
		gunModel[6].setRotationPoint(-34F, -20F, -3F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 38, 8, 9, 0F); // Import Box0
		gunModel[7].setRotationPoint(-11F, 16F, -4.5F);

		gunModel[8].addBox(0F, -17F, 0F, 2, 6, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(-24F, 3F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 4, 32, 14, 0F); // Import Box0
		gunModel[9].setRotationPoint(-12F, -12F, -7F);

		gunModel[10].addBox(0F, -17F, 0F, 6, 6, 12, 0F); // Import Box0
		gunModel[10].setRotationPoint(20F, 17F, -6F);

		gunModel[11].addBox(0F, -17F, 0F, 2, 23, 23, 0F); // Import Box0
		gunModel[11].setRotationPoint(-8F, -9F, -11.5F);

		gunModel[12].addBox(0F, -17F, 0F, 28, 12, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-40F, -8F, -4F);

		gunModel[13].addBox(0F, -17F, 0F, 4, 32, 14, 0F); // Import Box0
		gunModel[13].setRotationPoint(26F, -12F, -7F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 729, 25, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-4F, 8F, 1F);

		ammoModel[1].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-4F, 8F, -8F);

		ammoModel[2].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[2].setRotationPoint(-4F, -1F, 5F);

		ammoModel[3].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[3].setRotationPoint(-4F, -1F, -12F);

		ammoModel[4].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[4].setRotationPoint(-4F, -10F, 0F);

		ammoModel[5].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[5].setRotationPoint(-4F, -10F, -9F);


		breakActionModel = new ModelRendererTurbo[10];
		breakActionModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		breakActionModel[1] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		breakActionModel[2] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		breakActionModel[3] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		breakActionModel[4] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		breakActionModel[5] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		breakActionModel[6] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import Box0
		breakActionModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		breakActionModel[8] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box0
		breakActionModel[9] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import Box0

		breakActionModel[0].addBox(0F, -17F, 0F, 40, 11, 9, 0F); // Import Box0
		breakActionModel[0].setRotationPoint(34F, -10F, -4.5F);

		breakActionModel[1].addBox(0F, -17F, 0F, 38, 2, 9, 0F); // Import Box0
		breakActionModel[1].setRotationPoint(-11F, -13F, -4.5F);

		breakActionModel[2].addBox(0F, -17F, 0F, 30, 20, 11, 0F); // Import Box0
		breakActionModel[2].setRotationPoint(26F, -12F, -5.5F);

		breakActionModel[3].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[3].setRotationPoint(-6F, 7F, 0F);

		breakActionModel[4].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[4].setRotationPoint(-6F, 7F, -9F);

		breakActionModel[5].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[5].setRotationPoint(-6F, -2F, 4F);

		breakActionModel[6].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[6].setRotationPoint(-6F, -2F, -13F);

		breakActionModel[7].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[7].setRotationPoint(-6F, -11F, -1F);

		breakActionModel[8].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[8].setRotationPoint(-6F, -11F, -10F);

		breakActionModel[9].addBox(0F, -17F, 0F, 2, 23, 23, 0F); // Import Box0
		breakActionModel[9].setRotationPoint(24F, -9F, -11.5F);



		barrelAttachPoint = new Vector3f(74F /16F, 25F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(23F /16F, -2F /16F, 1F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 32F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(44 /16F, 17F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BREAK_ACTION;


		numBulletsInReloadAnimation = 5F;


		pumpHandleDistance = 2F;


		barrelBreakPoint = new Vector3f(23 /16F, -2F /16F, 1F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}