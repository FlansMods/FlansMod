//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Skorpion
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

public class ModelSkorpion extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelSkorpion() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		gunModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 34
		gunModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 34
		gunModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-7.5F, 13F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 22, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-4F, 2F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-6F, 5.25F, -2F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 5, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-9F, 16F, -2.5F);
		gunModel[3].rotateAngleZ = -0.17453293F;

		gunModel[4].addBox(0F, -17F, 0F, 12, 2, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(7F, 11F, -1.5F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		gunModel[5].setRotationPoint(-3F, -26.5F, 1F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		gunModel[6].setRotationPoint(-3F, -26.5F, -2F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 34
		gunModel[7].setRotationPoint(35F, -28F, -0.5F);

		gunModel[8].addBox(0F, -17F, 0F, 8, 42, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(18F, -20F, -3F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(34F, -6F, -1.5F);
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 1, 40, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(21F, -25F, -2F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 4, 44, 5, 0F); // Import Box0
		gunModel[11].setRotationPoint(22F, -24F, -2.5F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 6, 7, 5, 0F); // Import Box0
		gunModel[12].setRotationPoint(22F, -20F, -2.5F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 2, 7, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(-18F, -13.25F, -2F);
		gunModel[13].rotateAngleZ = -1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 3, 16, 3, 0F); // Import Box0
		gunModel[14].setRotationPoint(36F, -21.5F, -1.5F);
		gunModel[14].rotateAngleZ = -1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 5, 4, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(26F, -22.5F, -2.5F);
		gunModel[15].rotateAngleZ = -1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 9, 16, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(25F, 4F, -1.5F);
		ammoModel[0].rotateAngleZ = 0.2443461F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 34

		slideModel[0].addBox(0F, -17F, 0F, 1, 20, 3, 0F); // Import Box0
		slideModel[0].setRotationPoint(16F, -25.5F, -1.5F);
		slideModel[0].rotateAngleZ = -1.57079633F;

		slideModel[1].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 34
		slideModel[1].setRotationPoint(15F, -27F, -0.5F);



		barrelAttachPoint = new Vector3f(50F /16F, 20F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 24F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(26 /16F, 22F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		endLoadedAmmoDistance = 0F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}