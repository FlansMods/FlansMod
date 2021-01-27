//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: R870
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

public class ModelR870 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelR870() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 14, 52, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-49F, -9F, -3F);
		gunModel[0].rotateAngleZ = -1.22173048F;

		gunModel[1].addBox(0F, -17F, 0F, 12, 28, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-33F, -10F, -1.5F);
		gunModel[1].rotateAngleZ = -0.9424778F;

		gunModel[2].addBox(0F, -17F, 0F, 12, 14, 8, 0F); // Import Box0
		gunModel[2].setRotationPoint(-24F, -7F, -4F);

		gunModel[3].addBox(0F, -17F, 0F, 36, 12, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-19F, -8F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 120, 4, 4, 0F); // Import Box0
		gunModel[4].setRotationPoint(10F, -7.5F, -2F);

		gunModel[5].addBox(0F, -17F, 0F, 30, 3, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(-18F, -9F, -2.5F);

		gunModel[6].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(-12F, 9F, -1.5F);

		gunModel[7].addBox(0F, -17F, 0F, 18, 5, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-4F, -6F, -4F);

		gunModel[8].addBox(0F, -17F, 0F, 8, 1, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(14.5F, -7F, -2F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 108, 4, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(10F, -1.5F, -2F);

		gunModel[10].addBox(0F, -17F, 0F, 4, 14, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(70F, -9.5F, -3F);

		gunModel[11].addBox(0F, -17F, 0F, 8, 1, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(4.5F, -7F, -2F);
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 12, 64, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(-39F, -17F, -2F);
		gunModel[12].rotateAngleZ = -1.36135682F;

		gunModel[13].addBox(0F, -17F, 0F, 28, 8, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(-101F, -4F, -3F);
		gunModel[13].rotateAngleZ = -1.29154365F;

		gunModel[14].addBox(0F, -17F, 0F, 14, 3, 4, 0F); // Import Box0
		gunModel[14].setRotationPoint(-12F, -11F, -2F);


		defaultScopeModel = new ModelRendererTurbo[1];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 12, 4, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(138F, -21.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 19

		ammoModel[0].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 19
		ammoModel[0].setRotationPoint(2F, -20F, -2F);


		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box0

		pumpModel[0].addBox(0F, -17F, 0F, 42, 10, 12, 0F); // Import Box0
		pumpModel[0].setRotationPoint(28F, -4F, -6F);

		pumpModel[1].addBox(0F, -17F, 0F, 36, 4, 11, 0F); // Import Box0
		pumpModel[1].setRotationPoint(29.5F, 4.5F, -5.5F);



		barrelAttachPoint = new Vector3f(128F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(21F /16F, 25F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(-2F /16F, 27F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(45 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.SHOTGUN;


		tiltGunTime = 0.16F;


		unloadClipTime = 0F;


		loadClipTime = 0.8F;


		untiltGunTime = 0.05F;


		endLoadedAmmoDistance = 3F;


		numBulletsInReloadAnimation = 7F;


		pumpDelayAfterReload = 115;


		pumpDelay = 5;


		pumpTime = 10;


		pumpHandleDistance = 2F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}