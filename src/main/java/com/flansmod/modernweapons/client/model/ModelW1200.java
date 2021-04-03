//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: W1200
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

public class ModelW1200 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelW1200() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[17];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 14, 52, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-58F, -7F, -3F);
		gunModel[0].rotateAngleZ = -1.22173048F;

		gunModel[1].addBox(0F, -17F, 0F, 12, 28, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-42F, -14F, -1.5F);
		gunModel[1].rotateAngleZ = -1.09955743F;

		gunModel[2].addBox(0F, -17F, 0F, 12, 10, 8, 0F); // Import Box0
		gunModel[2].setRotationPoint(-31F, -5F, -4F);
		gunModel[2].rotateAngleZ = 0.03490659F;

		gunModel[3].addBox(0F, -17F, 0F, 46, 12, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-20F, -8F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 120, 4, 4, 0F); // Import Box0
		gunModel[4].setRotationPoint(2F, -7.5F, -2F);

		gunModel[5].addBox(0F, -17F, 0F, 30, 3, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(-6F, -10F, -2.5F);

		gunModel[6].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(-14F, 9F, -1.5F);

		gunModel[7].addBox(0F, -17F, 0F, 8, 1, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(12.5F, -7F, -2F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 108, 4, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(10F, -1.5F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 4, 12, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(106F, -8.5F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 12, 64, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(-48F, -16F, -2F);
		gunModel[10].rotateAngleZ = -1.36135682F;

		gunModel[11].addBox(0F, -17F, 0F, 28, 8, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(-106F, -4F, -3.5F);
		gunModel[11].rotateAngleZ = -1.29154365F;

		gunModel[12].addBox(0F, -17F, 0F, 26, 3, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(-4F, -11F, -2F);

		gunModel[13].addBox(0F, -17F, 0F, 6, 5, 5, 0F); // Import Box0
		gunModel[13].setRotationPoint(114F, -2F, -2.5F);

		gunModel[14].addBox(0F, -17F, 0F, 70, 6, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(28F, -8.5F, -3F);

		gunModel[15].addBox(6F, -17F, 0F, 10, 28, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(-31F, -4F, -2.5F);
		gunModel[15].rotateAngleZ = -0.27925268F;

		gunModel[16].addBox(6F, -17F, 0F, 5, 8, 6, 0F); // Import Box0
		gunModel[16].setRotationPoint(-38F, 14F, -3F);
		gunModel[16].rotateAngleZ = -0.27925268F;


		defaultScopeModel = new ModelRendererTurbo[1];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 10, 4, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(134F, -21.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 19

		ammoModel[0].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 19
		ammoModel[0].setRotationPoint(2F, -19F, -2F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 20, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(-2F, -5F, -4F);


		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box0

		pumpModel[0].addBox(0F, -17F, 0F, 42, 10, 10, 0F); // Import Box0
		pumpModel[0].setRotationPoint(34F, -2.5F, -5F);

		pumpModel[1].addBox(0F, -17F, 0F, 30, 4, 9, 0F); // Import Box0
		pumpModel[1].setRotationPoint(42.5F, 6F, -4.5F);



		barrelAttachPoint = new Vector3f(120F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(21F /16F, 25F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(9F /16F, 27F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(58 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.SHOTGUN;


		tiltGunTime = 0.16F;


		unloadClipTime = 0F;


		loadClipTime = 0.8F;


		untiltGunTime = 0.05F;


		endLoadedAmmoDistance = 3F;


		numBulletsInReloadAnimation = 6F;


		pumpDelayAfterReload = 115;


		pumpDelay = 5;


		pumpTime = 10;


		pumpHandleDistance = 2F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}