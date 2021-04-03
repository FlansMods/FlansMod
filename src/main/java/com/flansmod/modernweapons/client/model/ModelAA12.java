//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AA12
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

public class ModelAA12 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelAA12() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[18];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-4F, 14F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-1F, 3F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-3F, 11F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 37, 8, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, -2F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-5F, 19F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 7, 9, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-6F, -4F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 11, 6, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-1F, 4F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 42, 10, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-4F, -12F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 58, 8, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-51F, -11F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 62, 4, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(38F, -9.5F, -2F);

		gunModel[10].addBox(0F, -17F, 0F, 40, 3, 5, 0F); // Import Box0
		gunModel[10].setRotationPoint(-3F, -13F, -2.5F);

		gunModel[11].addBox(0F, -17F, 0F, 14, 2, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(8F, 10F, -1.5F);

		gunModel[12].addBox(0F, -17F, 0F, 23, 4, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(-4.5F, 22F, -1F);
		gunModel[12].rotateAngleZ = -0.33161256F;

		gunModel[13].addBox(0F, -17F, 0F, 43, 14, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(-47F, -3F, -2F);
		gunModel[13].rotateAngleZ = 0.10471976F;

		gunModel[14].addBox(0F, -17F, 0F, 7, 24, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(-53F, -12F, -3.5F);

		gunModel[15].addBox(0F, -17F, 0F, 58, 9, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(29F, -12F, -3F);

		gunModel[16].addBox(0F, -17F, 0F, 55, 10, 4, 0F); // Import Box0
		gunModel[16].setRotationPoint(33F, -4F, -2F);
		gunModel[16].rotateAngleZ = 0.06981317F;

		gunModel[17].addBox(0F, -17F, 0F, 23, 1, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(37.5F, 17F, -2F);
		gunModel[17].rotateAngleZ = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 15, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(81F, -13.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.80285146F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 13, 4, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(95F, -23.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 15, 2, 0, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(9F, -15.5F, 1.5F);
		defaultScopeModel[2].rotateAngleZ = 0.80285146F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 13, 2, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(24F, -25.5F, 1F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 15, 2, 0, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(9F, -15.5F, -1.5F);
		defaultScopeModel[4].rotateAngleZ = 0.80285146F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 13, 2, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(24F, -25.5F, -2F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 36, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(21.5F, 2F, -2F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 5, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(6F, -10F, -4F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 7, 3, 0F); // Import Box0
		slideModel[1].setRotationPoint(33F, -17F, -1.5F);



		barrelAttachPoint = new Vector3f(99F /16F, 24F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(46F /16F, 20F /16F, 2F /16F);

		scopeAttachPoint = new Vector3f(13F /16F, 28F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(50 /16F, 13F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}