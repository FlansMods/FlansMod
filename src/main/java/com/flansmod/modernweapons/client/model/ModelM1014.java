//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M1014
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

public class ModelM1014 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelM1014() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 4, 57, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-39F, -14F, -2F);
		gunModel[0].rotateAngleZ = -1.29154365F;

		gunModel[1].addBox(0F, -17F, 0F, 12, 10, 7, 0F); // Import Box0
		gunModel[1].setRotationPoint(-28F, -5F, -3.5F);
		gunModel[1].rotateAngleZ = 0.13962634F;

		gunModel[2].addBox(0F, -17F, 0F, 46, 14, 8, 0F); // Import Box0
		gunModel[2].setRotationPoint(-20F, -8F, -4F);

		gunModel[3].addBox(0F, -17F, 0F, 104, 4, 4, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, -7.5F, -2F);

		gunModel[4].addBox(0F, -17F, 0F, 30, 3, 5, 0F); // Import Box0
		gunModel[4].setRotationPoint(-6F, -10F, -2.5F);

		gunModel[5].addBox(0F, -17F, 0F, 12, 2, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-24F, 10F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 8, 1, 4, 0F); // Import Box0
		gunModel[6].setRotationPoint(4.5F, -6F, -2F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 92, 4, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(10F, -1.5F, -2F);

		gunModel[8].addBox(0F, -17F, 0F, 2, 12, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(90F, -8.5F, -2.5F);

		gunModel[9].addBox(0F, -17F, 0F, 6, 30, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(-63F, -18F, -3F);
		gunModel[9].rotateAngleZ = -1.29154365F;

		gunModel[10].addBox(0F, -17F, 0F, 18, 6, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(-92F, -11F, -3.5F);
		gunModel[10].rotateAngleZ = -1.29154365F;

		gunModel[11].addBox(0F, -17F, 0F, 26, 3, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(-4F, -11F, -2F);

		gunModel[12].addBox(0F, -17F, 0F, 4, 5, 5, 0F); // Import Box0
		gunModel[12].setRotationPoint(100F, -2F, -2.5F);

		gunModel[13].addBox(6F, -17F, 0F, 11, 28, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(-40F, -4F, -3F);
		gunModel[13].rotateAngleZ = -0.27925268F;

		gunModel[14].addBox(6F, -17F, 0F, 5, 8, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(-47F, 14F, -3.5F);
		gunModel[14].rotateAngleZ = -0.27925268F;

		gunModel[15].addBox(0F, -17F, 0F, 8, 24, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(-67F, -12F, -2.5F);
		gunModel[15].rotateAngleZ = -1.29154365F;


		defaultScopeModel = new ModelRendererTurbo[1];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 8, 4, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(115F, -22.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 19

		ammoModel[0].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 19
		ammoModel[0].setRotationPoint(2F, -17F, -2F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 20, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(2F, -5F, -5F);


		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0

		pumpModel[0].addBox(0F, -17F, 0F, 32, 10, 9, 0F); // Import Box0
		pumpModel[0].setRotationPoint(30F, -2.5F, -4.5F);

		pumpModel[1].addBox(0F, -17F, 0F, 26, 6, 8, 0F); // Import Box0
		pumpModel[1].setRotationPoint(32.5F, 4F, -4F);



		barrelAttachPoint = new Vector3f(102F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(21F /16F, 25F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(10F /16F, 27F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(45 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.SHOTGUN;


		tiltGunTime = 0.16F;


		unloadClipTime = 0F;


		loadClipTime = 0.8F;


		untiltGunTime = 0.05F;


		endLoadedAmmoDistance = 3F;


		numBulletsInReloadAnimation = 4F;


		pumpDelayAfterReload = 115;


		pumpDelay = 5;


		pumpTime = 10;


		pumpHandleDistance = 2F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}