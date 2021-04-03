//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: P90
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

public class ModelP90 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelP90() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[17];
		gunModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 46, 12, 9, 0F); // Import Box0
		gunModel[0].setRotationPoint(-12F, 14F, -4.5F);

		gunModel[1].addBox(0F, -17F, 0F, 23, 8, 9, 0F); // Import Box0
		gunModel[1].setRotationPoint(-31F, 16F, -4.5F);
		gunModel[1].rotateAngleZ = 1.57079633F;

		gunModel[2].addBox(0F, -17F, 0F, 56, 5, 5, 0F); // Import Box0
		gunModel[2].setRotationPoint(14F, 17.5F, -2.5F);

		gunModel[3].addBox(0F, -17F, 0F, 20, 8, 18, 0F); // Import Box0
		gunModel[3].setRotationPoint(8F, 20.5F, 13F);
		gunModel[3].rotateAngleX = 1.57079633F;

		gunModel[4].addBox(0F, -17F, 0F, 25, 4, 7, 0F); // Import Box0
		gunModel[4].setRotationPoint(-33F, 17.5F, -3.5F);
		gunModel[4].rotateAngleZ = 1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 18, 12, 8, 0F); // Import Box0
		gunModel[5].setRotationPoint(34F, 14F, -4F);

		gunModel[6].addBox(0F, -17F, 0F, 28, 9, 24, 0F); // Import Box0
		gunModel[6].setRotationPoint(-40F, 16.5F, 12.5F);
		gunModel[6].rotateAngleX = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 18, 6, 5, 0F); // Import Box0
		gunModel[7].setRotationPoint(-26F, 23F, -2.5F);
		gunModel[7].rotateAngleZ = -0.66322512F;

		gunModel[8].addBox(0F, -17F, 0F, 18, 6, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(6F, 35F, -2.5F);
		gunModel[8].rotateAngleZ = 0.59341195F;

		gunModel[9].addBox(0F, -17F, 0F, 16, 8, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(-12F, 35F, -3F);

		gunModel[10].addBox(0F, -17F, 0F, 20, 6, 5, 0F); // Import Box0
		gunModel[10].setRotationPoint(21F, 17F, -2.5F);
		gunModel[10].rotateAngleZ = -0.41887902F;

		gunModel[11].addBox(0F, -17F, 0F, 18, 9, 20, 0F); // Import Box0
		gunModel[11].setRotationPoint(38F, 11.5F, 12.5F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 25, 6, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(24F, 6F, -4F);
		gunModel[12].rotateAngleZ = 1.04719755F;

		gunModel[13].addBox(0F, -17F, 0F, 25, 6, 2, 0F); // Import Box0
		gunModel[13].setRotationPoint(24F, 6F, 2F);
		gunModel[13].rotateAngleZ = 1.04719755F;

		gunModel[14].addBox(0F, -17F, 0F, 25, 6, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(68F, 1F, -4F);
		gunModel[14].rotateAngleZ = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 25, 6, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(68F, 1F, 2F);
		gunModel[15].rotateAngleZ = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 38, 9, 4, 0F); // Import Box0
		gunModel[16].setRotationPoint(20F, -20.5F, 12.5F);
		gunModel[16].rotateAngleX = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[4];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(72F, -22.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 7, 2, 3, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(70F, -22.5F, -1.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 10, 4, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(21F, -10F, -1.5F);

		defaultScopeModel[3].addBox(0F, -17F, 0F, 10, 4, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(21F, -10F, 0.5F);


		defaultGripModel = new ModelRendererTurbo[4];
		defaultGripModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		defaultGripModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		defaultGripModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		defaultGripModel[3] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); // Import Box0

		defaultGripModel[0].addBox(0F, -17F, 0F, 4, 16, 3, 0F); // Import Box0
		defaultGripModel[0].setRotationPoint(40F, 23F, -1.5F);
		defaultGripModel[0].rotateAngleZ = -0.17453293F;

		defaultGripModel[1].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		defaultGripModel[1].setRotationPoint(38F, 19F, -1F);
		defaultGripModel[1].rotateAngleZ = -0.17453293F;

		defaultGripModel[2].addBox(0F, -17F, 0F, 20, 6, 5, 0F); // Import Box0
		defaultGripModel[2].setRotationPoint(20F, 30F, -2.5F);
		defaultGripModel[2].rotateAngleZ = -0.17453293F;

		defaultGripModel[3].addBox(0F, -17F, 0F, 4, 8, 7, 0F); // Import Box0
		defaultGripModel[3].setRotationPoint(53F, 26F, -3.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 52, 6, 6, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-13F, 10F, -3F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 14, 4, 3, 0F); // Import Box0
		slideModel[0].setRotationPoint(-9F, 19F, -5.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 3, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(-10F, 19.5F, -9F);



		barrelAttachPoint = new Vector3f(68F /16F, -2F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(40F /16F, 24F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(50 /16F, -12F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.P90;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}