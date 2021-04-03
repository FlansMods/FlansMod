//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bizon
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

public class ModelBizon extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 32;

	public ModelBizon() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 4, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(18F, 5F, -2F);
		gunModel[0].rotateAngleZ = -0.20943951F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 21, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(22F, -5F, -1.5F);
		gunModel[1].rotateAngleZ = -0.20943951F;

		gunModel[2].addBox(0F, -17F, 0F, 3, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(19F, 2F, -1F);
		gunModel[2].rotateAngleZ = -0.20943951F;

		gunModel[3].addBox(0F, -17F, 0F, 2, 5, 2, 0F); // Import Box0
		gunModel[3].setRotationPoint(18F, 9F, -1F);
		gunModel[3].rotateAngleZ = -0.20943951F;

		gunModel[4].addBox(0F, -17F, 0F, 2, 6, 2, 0F); // Import Box0
		gunModel[4].setRotationPoint(39F, 0F, -1F);

		gunModel[5].addBox(0F, -17F, 0F, 34, 9, 8, 0F); // Import Box0
		gunModel[5].setRotationPoint(18F, -8.25F, -4F);

		gunModel[6].addBox(0F, -17F, 0F, 50, 2, 4, 0F); // Import Box0
		gunModel[6].setRotationPoint(-16F, -7F, -2F);

		gunModel[7].addBox(0F, -17F, 0F, 14, 4, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(77F, -4.5F, -2F);

		gunModel[8].addBox(0F, -17F, 0F, 8, 2, 1, 0F); // Import Box0
		gunModel[8].setRotationPoint(32F, 4F, -0.5F);

		gunModel[9].addBox(0F, -17F, 0F, 50, 3, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(-14F, 1F, -1.5F);
		gunModel[9].rotateAngleZ = 0.10471976F;

		gunModel[10].addBox(0F, -17F, 0F, 3, 14, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(-17F, -8F, -3.5F);

		gunModel[11].addBox(0F, -17F, 0F, 33, 7, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(48F, -17F, 13.5F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -19F, 0F, 6, 13, 5, 0F); // Import Box0
		gunModel[12].setRotationPoint(71F, -4.5F, -2.5F);

		gunModel[13].addBox(0F, -19F, 0F, 2, 7, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(74F, 3.5F, -3F);

		gunModel[14].addBox(0F, -17F, 0F, 2, 12, 5, 0F); // Import Box0
		gunModel[14].setRotationPoint(-14F, -8F, -2.5F);

		gunModel[15].addBox(0F, -17F, 0F, 60, 4, 4, 0F); // Import Box0
		gunModel[15].setRotationPoint(20F, -10F, -2F);


		defaultScopeModel = new ModelRendererTurbo[3];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 1, 4, 10, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(24.5F, -12.5F, 1.5F);
		defaultScopeModel[0].rotateAngleY = -1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 1, 4, 10, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(24.5F, -12.5F, -0.5F);
		defaultScopeModel[1].rotateAngleY = -1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 1, 9, 4, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(78.5F, -13F, 0.5F);
		defaultScopeModel[2].rotateAngleY = -1.57079633F;


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 30, 8, 8, 0F); // Import Box0
		ammoModel[0].setRotationPoint(42F, 1F, -4F);

		ammoModel[1].addBox(0F, -17F, 0F, 4, 10, 10, 0F); // Import Box0
		ammoModel[1].setRotationPoint(70F, 0F, -5F);

		ammoModel[2].addBox(0F, -17F, 0F, 4, 10, 10, 0F); // Import Box0
		ammoModel[2].setRotationPoint(40F, 0F, -5F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 18, 5, 4, 0F); // Import Box0
		slideModel[0].setRotationPoint(28F, -6F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(29F, -5F, -7.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(89F /16F, 19F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(36F /16F, 27F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(68 /16F, 7F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}