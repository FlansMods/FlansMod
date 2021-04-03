//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PeaceKeeper
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

public class ModelPeaceKeeper extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelPeaceKeeper() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[18];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 14, 40, 10, 0F); // Import Box0
		gunModel[0].setRotationPoint(-46F, -9F, -5F);
		gunModel[0].rotateAngleZ = -1.22173048F;

		gunModel[1].addBox(0F, -17F, 0F, 12, 28, 7, 0F); // Import Box0
		gunModel[1].setRotationPoint(-30F, -10F, -3.5F);
		gunModel[1].rotateAngleZ = -0.9424778F;

		gunModel[2].addBox(0F, -17F, 0F, 12, 14, 10, 0F); // Import Box0
		gunModel[2].setRotationPoint(-24F, -7F, -5F);

		gunModel[3].addBox(0F, -17F, 0F, 60, 17, 15, 0F); // Import Box0
		gunModel[3].setRotationPoint(-19F, -8F, -7.5F);

		gunModel[4].addBox(0F, -17F, 0F, 90, 5, 5, 0F); // Import Box0
		gunModel[4].setRotationPoint(17F, -6.5F, -6F);

		gunModel[5].addBox(0F, -17F, 0F, 30, 3, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(-18F, -9F, -2.5F);

		gunModel[6].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(-17F, 16F, -1.5F);

		gunModel[7].addBox(0F, -17F, 0F, 18, 5, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-4F, -6F, -4F);

		gunModel[8].addBox(0F, -17F, 0F, 8, 1, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(9.5F, 0F, -2F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 4, 14, 14, 0F); // Import Box0
		gunModel[9].setRotationPoint(96F, -7.5F, -7F);

		gunModel[10].addBox(0F, -17F, 0F, 8, 1, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(-0.5F, 0F, -2F);
		gunModel[10].rotateAngleZ = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 12, 52, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-36F, -17F, -4F);
		gunModel[11].rotateAngleZ = -1.36135682F;

		gunModel[12].addBox(0F, -17F, 0F, 24, 8, 12, 0F); // Import Box0
		gunModel[12].setRotationPoint(-85F, -6F, -6F);
		gunModel[12].rotateAngleZ = -1.29154365F;

		gunModel[13].addBox(0F, -17F, 0F, 90, 5, 5, 0F); // Import Box0
		gunModel[13].setRotationPoint(17F, -6.5F, 1F);

		gunModel[14].addBox(0F, -17F, 0F, 90, 5, 5, 0F); // Import Box0
		gunModel[14].setRotationPoint(17F, 0.5F, -6F);

		gunModel[15].addBox(0F, -17F, 0F, 90, 5, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(17F, 0.5F, 1F);

		gunModel[16].addBox(0F, -17F, 0F, 4, 14, 14, 0F); // Import Box0
		gunModel[16].setRotationPoint(89F, -7.5F, -7F);

		gunModel[17].addBox(0F, -17F, 0F, 82, 5, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(17F, -3F, -2.5F);


		defaultScopeModel = new ModelRendererTurbo[2];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 10, 4, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(51F, -21.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 14, 7, 8, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(-12F, -13F, -4F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 19

		ammoModel[0].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 19
		ammoModel[0].setRotationPoint(2F, -14F, -2F);


		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0

		pumpModel[0].addBox(0F, -17F, 0F, 34, 12, 16, 0F); // Import Box0
		pumpModel[0].setRotationPoint(50F, -2F, -8F);

		pumpModel[1].addBox(0F, -17F, 0F, 28, 4, 13, 0F); // Import Box0
		pumpModel[1].setRotationPoint(51.5F, 9.5F, -6.5F);



		barrelAttachPoint = new Vector3f(128F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(21F /16F, 25F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(-2F /16F, 26F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(45 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.SHOTGUN;


		tiltGunTime = 0.16F;


		unloadClipTime = 0F;


		loadClipTime = 0.8F;


		untiltGunTime = 0.05F;


		numBulletsInReloadAnimation = 4F;


		pumpDelayAfterReload = 115;


		pumpDelay = 5;


		pumpTime = 10;


		pumpHandleDistance = 2F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}