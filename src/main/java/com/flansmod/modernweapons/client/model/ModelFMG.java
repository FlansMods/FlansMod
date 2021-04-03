//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FMG
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

public class ModelFMG extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelFMG() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-24.25F, 22F, -3F);
		gunModel[0].rotateAngleZ = -0.19198622F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 22, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-20F, 10F, -2.5F);
		gunModel[1].rotateAngleZ = -0.12217305F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-23.25F, 20F, -2F);
		gunModel[2].rotateAngleZ = -0.19198622F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(-12F, 20F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 4, 64, 6, 0F); // Import Box0
		gunModel[4].setRotationPoint(0F, -7F, -3F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(18F, 3F, -1.5F);
		gunModel[5].rotateAngleZ = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 8, 38, 6, 0F); // Import Box0
		gunModel[6].setRotationPoint(28F, -12F, -3F);
		gunModel[6].rotateAngleZ = -1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 4, 30, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(30F, -10F, -2F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 9, 56, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-8F, -16F, -3.5F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 4, 36, 7, 0F); // Import Box0
		gunModel[9].setRotationPoint(28F, -16F, -3.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 2, 86, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(28F, -18F, -3F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 18, 4, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-64F, -16.25F, -4F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 22, 2, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-68F, -16.25F, -4F);
		gunModel[12].rotateAngleZ = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[7];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 34
		defaultScopeModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 34
		defaultScopeModel[3] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 34
		defaultScopeModel[4] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 34
		defaultScopeModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 34

		defaultScopeModel[0].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(-13F, -22.25F, 1F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 34
		defaultScopeModel[1].setRotationPoint(-13F, -22.25F, -2F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 34
		defaultScopeModel[2].setRotationPoint(38F, -24.25F, -2.5F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 34
		defaultScopeModel[3].setRotationPoint(38F, -24.25F, 1.5F);

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 56, 6, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(25F, -25.25F, -3F);
		defaultScopeModel[4].rotateAngleZ = -1.55334303F;

		defaultScopeModel[5].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 34
		defaultScopeModel[5].setRotationPoint(39F, -19.25F, -1.5F);

		defaultScopeModel[6].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 34
		defaultScopeModel[6].setRotationPoint(-12F, -19.25F, -1.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 7, 22, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-20.5F, 28F, -2F);
		ammoModel[0].rotateAngleZ = -0.13962634F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 5, 18, 5, 0F); // Import Box0
		slideModel[0].setRotationPoint(-18F, -14F, -4.5F);
		slideModel[0].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(46F /16F, 8F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(12F /16F, 24F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(24 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}