//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M9
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

public class ModelM9 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelM9() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-7.5F, 3F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-4F, -8F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-6F, 0F, -2F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 5, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-9F, 5F, -2.5F);
		gunModel[3].rotateAngleZ = -0.17453293F;

		gunModel[4].addBox(0F, -17F, 0F, 11, 2, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(6F, 0F, -1.5F);

		gunModel[5].addBox(0F, -17F, 0F, 6, 40, 6, 0F); // Import Box0
		gunModel[5].setRotationPoint(17F, -28F, -3F);
		gunModel[5].rotateAngleZ = -1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(32F, -17F, -1.5F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 1, 41, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(21F, -31F, -2F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 4, 44, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(22F, -30F, -2.5F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 3, 6, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(22F, -26F, -2.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 2, 7, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(-18F, -23F, -2F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 4, 1, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(6F, -38F, -1.5F);
		gunModel[11].rotateAngleZ = 2.46091425F;

		gunModel[12].addBox(0F, -17F, 0F, 3, 6, 3, 0F); // Import Box0
		gunModel[12].setRotationPoint(26F, -29.5F, -1.5F);
		gunModel[12].rotateAngleZ = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[3];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 34
		defaultScopeModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 34

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(-4F, -32F, 1F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[1].setRotationPoint(-4F, -32F, -2F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[2].setRotationPoint(35F, -33F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 7, 19, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-3F, -5F, -1.5F);
		ammoModel[0].rotateAngleZ = -0.17453293F;

		ammoModel[1].addBox(0F, -17F, 0F, 12, 3, 6, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-9F, 11F, -3F);
		ammoModel[1].rotateAngleZ = -0.17453293F;



		barrelAttachPoint = new Vector3f(39F /16F, 28F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(26 /16F, 22F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		endLoadedAmmoDistance = 0F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}