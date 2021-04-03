//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Dragunov
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

public class ModelDragunov extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelDragunov() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 10, 26, 3, 0F); // Import Box0
		gunModel[0].setRotationPoint(1F, -1F, -1.5F);
		gunModel[0].rotateAngleZ = -0.13962634F;

		gunModel[1].addBox(0F, -17F, 0F, 49, 6, 7, 0F); // Import Box0
		gunModel[1].setRotationPoint(11F, 4F, -3.5F);

		gunModel[2].addBox(0F, -17F, 0F, 5, 6, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-3F, 18F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 4, 6, 9, 0F); // Import Box0
		gunModel[3].setRotationPoint(19F, 10F, -4.5F);

		gunModel[4].addBox(0F, -17F, 0F, 54, 10, 7, 0F); // Import Box0
		gunModel[4].setRotationPoint(7F, -6F, -3.5F);

		gunModel[5].addBox(0F, -17F, 0F, 58, 4, 6, 0F); // Import Box0
		gunModel[5].setRotationPoint(-45F, -1F, -3F);
		gunModel[5].rotateAngleZ = 0.03490659F;

		gunModel[6].addBox(0F, -17F, 0F, 128, 4, 4, 0F); // Import Box0
		gunModel[6].setRotationPoint(32F, -3.5F, -2F);

		gunModel[7].addBox(0F, -17F, 0F, 43, 6, 2, 0F); // Import Box0
		gunModel[7].setRotationPoint(60F, -4.5F, 3F);

		gunModel[8].addBox(0F, -17F, 0F, 43, 6, 2, 0F); // Import Box0
		gunModel[8].setRotationPoint(60F, -4.5F, -5F);

		gunModel[9].addBox(0F, -17F, 0F, 43, 8, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(60F, -11.5F, 13F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 60, 5, 5, 0F); // Import Box0
		gunModel[10].setRotationPoint(8F, -9F, -2.5F);

		gunModel[11].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(11F, 13F, -1.5F);

		gunModel[12].addBox(0F, -17F, 0F, 52, 6, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(-46F, 18F, -2F);
		gunModel[12].rotateAngleZ = 0.12217305F;

		gunModel[13].addBox(0F, -17F, 0F, 10, 26, 7, 0F); // Import Box0
		gunModel[13].setRotationPoint(-50F, -2F, -3.5F);

		gunModel[14].addBox(0F, -17F, 0F, 48, 2, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(66F, -6.5F, -1F);

		gunModel[15].addBox(0F, -17F, 0F, 18, 8, 3, 0F); // Import Box0
		gunModel[15].setRotationPoint(60F, -8.5F, 13F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 22, 4, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(71F, -8.5F, 3F);

		gunModel[17].addBox(0F, -17F, 0F, 22, 4, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(71F, -8.5F, -5F);

		gunModel[18].addBox(0F, -17F, 0F, 35, 8, 5, 0F); // Import Box0
		gunModel[18].setRotationPoint(68F, -21F, 13F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 5, 9, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(113F, -7.5F, -2.5F);


		defaultScopeModel = new ModelRendererTurbo[2];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 15, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(152F, -8.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.85521133F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 12, 2, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(166F, -20.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 18, 20, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(24.5F, 8F, -2F);
		ammoModel[0].rotateAngleZ = 0.06981317F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 5, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(22F, -4F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(23F, -3F, -7.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(156F /16F, 19F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(34F /16F, 25F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(68 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}