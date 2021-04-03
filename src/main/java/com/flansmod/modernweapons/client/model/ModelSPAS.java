//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SPAS
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

public class ModelSPAS extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelSPAS() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[32];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-23F, 13F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-20F, 1F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-22F, 10F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 13, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-24F, 19F, -2.5F);
		gunModel[3].rotateAngleZ = -0.08726646F;

		gunModel[4].addBox(0F, -17F, 0F, 7, 9, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-25F, -4F, -1.5F);

		gunModel[5].addBox(0F, -17F, 0F, 11, 4, 7, 0F); // Import Box0
		gunModel[5].setRotationPoint(-20F, 2F, -3.5F);

		gunModel[6].addBox(0F, -17F, 0F, 42, 14, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-22F, -12F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 104, 4, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(26F, -11.5F, -2F);

		gunModel[8].addBox(0F, -17F, 0F, 11, 4, 2, 0F); // Import Box0
		gunModel[8].setRotationPoint(140F, -25.5F, -1F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 36, 3, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(-21F, -13F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 13, 2, 5, 0F); // Import Box0
		gunModel[10].setRotationPoint(-11F, 6F, -2.5F);

		gunModel[11].addBox(0F, -17F, 0F, 18, 5, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(-9F, -10F, -4F);

		gunModel[12].addBox(0F, -17F, 0F, 8, 14, 10, 0F); // Import Box0
		gunModel[12].setRotationPoint(19F, -11F, -5F);

		gunModel[13].addBox(0F, -17F, 0F, 8, 1, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(18.5F, -9F, -2F);
		gunModel[13].rotateAngleZ = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 100, 4, 4, 0F); // Import Box0
		gunModel[14].setRotationPoint(26F, -5.5F, -2F);

		gunModel[15].addBox(0F, -17F, 0F, 80, 4, 11, 0F); // Import Box0
		gunModel[15].setRotationPoint(20F, -0.5F, -5.5F);

		gunModel[16].addBox(0F, -17F, 0F, 32, 6, 6, 0F); // Import Box0
		gunModel[16].setRotationPoint(82F, -6.5F, -3F);

		gunModel[17].addBox(0F, -17F, 0F, 80, 2, 11, 0F); // Import Box0
		gunModel[17].setRotationPoint(20F, -12.5F, -5.5F);

		gunModel[18].addBox(0F, -17F, 0F, 10, 2, 11, 0F); // Import Box0
		gunModel[18].setRotationPoint(20F, -10.5F, -5.5F);

		gunModel[19].addBox(0F, -17F, 0F, 80, 2, 11, 0F); // Import Box0
		gunModel[19].setRotationPoint(20F, -8.5F, -5.5F);

		gunModel[20].addBox(0F, -17F, 0F, 10, 2, 11, 0F); // Import Box0
		gunModel[20].setRotationPoint(40F, -10.5F, -5.5F);

		gunModel[21].addBox(0F, -17F, 0F, 10, 2, 11, 0F); // Import Box0
		gunModel[21].setRotationPoint(60F, -10.5F, -5.5F);

		gunModel[22].addBox(0F, -17F, 0F, 20, 2, 11, 0F); // Import Box0
		gunModel[22].setRotationPoint(80F, -10.5F, -5.5F);

		gunModel[23].addBox(0F, -17F, 0F, 10, 2, 11, 0F); // Import Box0
		gunModel[23].setRotationPoint(20F, -6.5F, -5.5F);

		gunModel[24].addBox(0F, -17F, 0F, 10, 2, 11, 0F); // Import Box0
		gunModel[24].setRotationPoint(40F, -6.5F, -5.5F);

		gunModel[25].addBox(0F, -17F, 0F, 10, 2, 11, 0F); // Import Box0
		gunModel[25].setRotationPoint(60F, -6.5F, -5.5F);

		gunModel[26].addBox(0F, -17F, 0F, 20, 2, 11, 0F); // Import Box0
		gunModel[26].setRotationPoint(80F, -6.5F, -5.5F);

		gunModel[27].addBox(0F, -17F, 0F, 80, 2, 11, 0F); // Import Box0
		gunModel[27].setRotationPoint(20F, -4.5F, -5.5F);

		gunModel[28].addBox(0F, -17F, 0F, 10, 2, 11, 0F); // Import Box0
		gunModel[28].setRotationPoint(20F, -2.5F, -5.5F);

		gunModel[29].addBox(0F, -17F, 0F, 10, 2, 11, 0F); // Import Box0
		gunModel[29].setRotationPoint(40F, -2.5F, -5.5F);

		gunModel[30].addBox(0F, -17F, 0F, 10, 2, 11, 0F); // Import Box0
		gunModel[30].setRotationPoint(60F, -2.5F, -5.5F);

		gunModel[31].addBox(0F, -17F, 0F, 20, 2, 11, 0F); // Import Box0
		gunModel[31].setRotationPoint(80F, -2.5F, -5.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 19

		ammoModel[0].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 19
		ammoModel[0].setRotationPoint(4F, -22F, -2F);


		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0

		pumpModel[0].addBox(0F, -17F, 0F, 40, 14, 14, 0F); // Import Box0
		pumpModel[0].setRotationPoint(56F, -8F, -7F);

		pumpModel[1].addBox(0F, -17F, 0F, 26, 4, 11, 0F); // Import Box0
		pumpModel[1].setRotationPoint(68.5F, 4.5F, -5.5F);



		barrelAttachPoint = new Vector3f(128F /16F, 26F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(21F /16F, 25F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(3F /16F, 30F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(81 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 3F;


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