//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PAW20
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

public class ModelPAW20 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelPAW20() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-5F, 2F, -13F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-1F, -9F, -12.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-3F, -1F, -12F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 37, 10, 12, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, -2F, -6F);

		gunModel[4].addBox(0F, -17F, 0F, 12, 6, 2, 0F); // Import Box0
		gunModel[4].setRotationPoint(-5F, 7F, -12F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 14, 6, 10, 0F); // Import Box0
		gunModel[5].setRotationPoint(-3F, -9F, -14.5F);

		gunModel[6].addBox(0F, -17F, 0F, 42, 10, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(-4F, -12F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 58, 8, 8, 0F); // Import Box0
		gunModel[7].setRotationPoint(-51F, -11F, -4F);

		gunModel[8].addBox(0F, -17F, 0F, 102, 3, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(-50F, -13F, -2.5F);

		gunModel[9].addBox(0F, -17F, 0F, 22, 5, 7, 0F); // Import Box0
		gunModel[9].setRotationPoint(6F, -10F, -4F);

		gunModel[10].addBox(0F, -17F, 0F, 50, 14, 9, 0F); // Import Box0
		gunModel[10].setRotationPoint(-49F, -1F, -4.5F);
		gunModel[10].rotateAngleZ = 0.10471976F;

		gunModel[11].addBox(0F, -17F, 0F, 7, 24, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(-53F, -10F, -3.5F);

		gunModel[12].addBox(0F, -17F, 0F, 23, 9, 6, 0F); // Import Box0
		gunModel[12].setRotationPoint(29F, -12F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 20, 11, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(33F, -4F, -2F);
		gunModel[13].rotateAngleZ = 0.06981317F;

		gunModel[14].addBox(0F, -17F, 0F, 50, 9, 8, 0F); // Import Box0
		gunModel[14].setRotationPoint(49F, -8F, -4F);

		gunModel[15].addBox(0F, -17F, 0F, 49, 11, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(50F, -5F, -3F);
		gunModel[15].rotateAngleZ = 0.03490659F;

		gunModel[16].addBox(0F, -17F, 0F, 16, 4, 4, 0F); // Import Box0
		gunModel[16].setRotationPoint(94F, -6F, -2F);

		gunModel[17].addBox(0F, -17F, 0F, 6, 14, 9, 0F); // Import Box0
		gunModel[17].setRotationPoint(94F, -7F, -4.5F);

		gunModel[18].addBox(0F, -17F, 0F, 86, 8, 10, 0F); // Import Box0
		gunModel[18].setRotationPoint(-51F, -7F, -5F);

		gunModel[19].addBox(0F, -17F, 0F, 12, 6, 8, 0F); // Import Box0
		gunModel[19].setRotationPoint(-2F, -11F, -13.5F);


		defaultScopeModel = new ModelRendererTurbo[4];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 12, 4, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(58F, -23.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 12, 2, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(24F, -25.5F, 1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 12, 2, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(24F, -25.5F, -2F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 1, 2, 4, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(24F, -37.5F, -2F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 24, 14, 14, 0F); // Import Box0
		ammoModel[0].setRotationPoint(11F, 7F, -7F);

		ammoModel[1].addBox(0F, -17F, 0F, 23, 14, 15, 0F); // Import Box0
		ammoModel[1].setRotationPoint(11.5F, 8F, -7.5F);

		ammoModel[2].addBox(0F, -17F, 0F, 26, 6, 6, 0F); // Import Box0
		ammoModel[2].setRotationPoint(10F, 11F, -3F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 42, 4, 4, 0F); // Import Box0
		slideModel[0].setRotationPoint(50F, -11.5F, -2F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(88F, -11F, 0.5F);

		slideModel[2].addBox(0F, -17F, 0F, 3, 3, 8, 0F); // Import Box0
		slideModel[2].setRotationPoint(87.5F, -11.5F, 3.5F);



		barrelAttachPoint = new Vector3f(99F /16F, 24F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(46F /16F, 20F /16F, 2F /16F);

		scopeAttachPoint = new Vector3f(14F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(51 /16F, 12F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}