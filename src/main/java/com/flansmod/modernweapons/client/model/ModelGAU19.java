//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GAU19
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

public class ModelGAU19 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelGAU19() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 24, 24, 17, 0F); // Import Box0
		gunModel[0].setRotationPoint(70F, -8F, -7.5F);

		gunModel[1].addBox(0F, -17F, 0F, 70, 32, 29, 0F); // Import Box0
		gunModel[1].setRotationPoint(1F, -10F, -13.5F);

		gunModel[2].addBox(0F, -17F, 0F, 18, 12, 11, 0F); // Import Box0
		gunModel[2].setRotationPoint(-14F, 4F, -4.5F);

		gunModel[3].addBox(0F, -17F, 0F, 6, 12, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-13F, -4F, -1.5F);
		gunModel[3].rotateAngleZ = 0.31415927F;

		gunModel[4].addBox(0F, -17F, 0F, 12, 4, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-13F, -6F, -0.5F);
		gunModel[4].rotateAngleZ = 0.31415927F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 2, 1, 0F); // Import Box0
		gunModel[5].setRotationPoint(-5F, -9F, 0.5F);
		gunModel[5].rotateAngleZ = 0.34906585F;

		gunModel[6].addBox(0F, -17F, 0F, 2, 16, 30, 0F); // Import Box0
		gunModel[6].setRotationPoint(9.5F, 9F, 15F);

		gunModel[7].addBox(0F, -17F, 0F, 2, 16, 30, 0F); // Import Box0
		gunModel[7].setRotationPoint(43.5F, 9F, 15F);

		gunModel[8].addBox(0F, -17F, 0F, 44, 10, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(7F, 22F, 10.5F);

		gunModel[9].addBox(0F, -17F, 0F, 20, 4, 10, 0F); // Import Box0
		gunModel[9].setRotationPoint(14F, -6F, 16.5F);

		gunModel[10].addBox(0F, -17F, 0F, 20, 2, 10, 0F); // Import Box0
		gunModel[10].setRotationPoint(14F, -8F, 14.5F);

		gunModel[11].addBox(0F, -17F, 0F, 20, 4, 10, 0F); // Import Box0
		gunModel[11].setRotationPoint(14F, -2F, 14.5F);

		gunModel[12].addBox(0F, -17F, 0F, 2, 10, 10, 0F); // Import Box0
		gunModel[12].setRotationPoint(12F, -8F, 14.5F);

		gunModel[13].addBox(0F, -17F, 0F, 2, 10, 10, 0F); // Import Box0
		gunModel[13].setRotationPoint(34F, -8F, 14.5F);


		defaultScopeModel = new ModelRendererTurbo[5];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 18, 6, 7, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(12F, -11F, -2.5F);

		defaultScopeModel[1].addBox(0F, -17F, 0F, 14, 2, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(82F, -20.5F, 0.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 9, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(80F, -20.5F, -0.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 10, 6, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(14F, -15F, -1.5F);

		defaultScopeModel[4].addBox(0F, -17F, 0F, 10, 6, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(14F, -15F, 2.5F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 32, 24, 24, 0F); // Import Box0
		ammoModel[0].setRotationPoint(11.5F, 7F, 25F);

		ammoModel[1].addBox(0F, -17F, 0F, 10, 16, 2, 0F); // Import Box0
		ammoModel[1].setRotationPoint(18F, -6F, 34F);
		ammoModel[1].rotateAngleX = 0.6981317F;

		ammoModel[2].addBox(0F, -17F, 0F, 28, 20, 4, 0F); // Import Box0
		ammoModel[2].setRotationPoint(13.5F, 9F, 22F);

		ammoModel[3].addBox(0F, -17F, 0F, 28, 20, 4, 0F); // Import Box0
		ammoModel[3].setRotationPoint(13.5F, 9F, 48F);

		ammoModel[4].addBox(0F, -17F, 0F, 28, 20, 4, 0F); // Import Box0
		ammoModel[4].setRotationPoint(13.5F, -9F, 44F);
		ammoModel[4].rotateAngleX = 1.57079633F;

		ammoModel[5].addBox(0F, -17F, 0F, 28, 20, 4, 0F); // Import Box0
		ammoModel[5].setRotationPoint(13.5F, 17F, 44F);
		ammoModel[5].rotateAngleX = 1.57079633F;


		minigunBarrelModel = new ModelRendererTurbo[6];
		minigunBarrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		minigunBarrelModel[1] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		minigunBarrelModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		minigunBarrelModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		minigunBarrelModel[4] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box0
		minigunBarrelModel[5] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0

		minigunBarrelModel[0].addBox(0F, -17F, 0F, 120, 2, 2, 0F); // Import Box0
		minigunBarrelModel[0].setRotationPoint(90F, -2F, -3.5F);

		minigunBarrelModel[1].addBox(0F, -17F, 0F, 24, 12, 12, 0F); // Import Box0
		minigunBarrelModel[1].setRotationPoint(90F, -4.5F, -5F);

		minigunBarrelModel[2].addBox(0F, -17F, 0F, 120, 2, 2, 0F); // Import Box0
		minigunBarrelModel[2].setRotationPoint(90F, -2F, 3.5F);

		minigunBarrelModel[3].addBox(0F, -17F, 0F, 120, 2, 2, 0F); // Import Box0
		minigunBarrelModel[3].setRotationPoint(90F, 3.5F, 0F);

		minigunBarrelModel[4].addBox(0F, -17F, 0F, 24, 12, 12, 0F); // Import Box0
		minigunBarrelModel[4].setRotationPoint(180F, -4.5F, -5F);

		minigunBarrelModel[5].addBox(0F, -17F, 0F, 2, 12, 12, 0F); // Import Box0
		minigunBarrelModel[5].setRotationPoint(176F, -4.5F, -5F);



		barrelAttachPoint = new Vector3f(125F /16F, 22F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(121F /16F, 15F /16F, 1F /16F);

		scopeAttachPoint = new Vector3f(5F /16F, 26F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(48 /16F, 10F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		minigunBarrelOrigin = new Vector3f(0 /16F, 15F /16F, 0F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}