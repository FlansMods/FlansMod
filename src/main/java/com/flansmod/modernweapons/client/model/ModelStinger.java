//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Stinger
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

public class ModelStinger extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelStinger() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 9, 17, 3, 0F); // Import Box0
		gunModel[0].setRotationPoint(3F, 11F, -4F);

		gunModel[1].addBox(0F, -17F, 0F, 22, 6, 7, 0F); // Import Box0
		gunModel[1].setRotationPoint(2F, 6F, -6F);

		gunModel[2].addBox(0F, -17F, 0F, 11, 6, 6, 0F); // Import Box0
		gunModel[2].setRotationPoint(-1F, 22F, -5.5F);
		gunModel[2].rotateAngleZ = -0.19198622F;

		gunModel[3].addBox(0F, -17F, 0F, 4, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(20F, 11F, -6F);

		gunModel[4].addBox(0F, -17F, 0F, 150, 10, 10, 0F); // Import Box0
		gunModel[4].setRotationPoint(-90F, -1F, -6.5F);

		gunModel[5].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-30F, -1.5F, 2F);

		gunModel[6].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(-30F, -1.5F, -8F);

		gunModel[7].addBox(0F, -17F, 0F, 24, 9, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(-30F, -5.5F, 11F);
		gunModel[7].rotateAngleX = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 10, 1, 1, 0F); // Import Box0
		gunModel[8].setRotationPoint(12F, 15F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 30, 12, 12, 0F); // Import Box0
		gunModel[9].setRotationPoint(-33F, -2F, -7.5F);

		gunModel[10].addBox(0F, -17F, 0F, 24, 9, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(-30F, -16.5F, 11F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 8, 14, 14, 0F); // Import Box0
		gunModel[11].setRotationPoint(-97F, -3F, -8.5F);

		gunModel[12].addBox(0F, -17F, 0F, 30, 14, 14, 0F); // Import Box0
		gunModel[12].setRotationPoint(-3F, -3F, -8.5F);

		gunModel[13].addBox(0F, -17F, 0F, 6, 14, 14, 0F); // Import Box0
		gunModel[13].setRotationPoint(60F, -3F, -8.5F);

		gunModel[14].addBox(0F, -17F, 0F, 30, 9, 24, 0F); // Import Box0
		gunModel[14].setRotationPoint(24F, 9.5F, 11F);
		gunModel[14].rotateAngleX = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 34, 9, 16, 0F); // Import Box0
		gunModel[15].setRotationPoint(20F, -16.5F, 5F);
		gunModel[15].rotateAngleX = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 8, 8, 0F); // Import Box0
		ammoModel[0].setRotationPoint(55F, 0F, -5.5F);



		barrelAttachPoint = new Vector3f(14F /16F, 19F /16F, -2F /16F);

		stockAttachPoint = new Vector3f(15F /16F, 19F /16F, -2F /16F);

		scopeAttachPoint = new Vector3f(12F /16F, 19F /16F, -2F /16F);

		gripAttachPoint = new Vector3f(13 /16F, 19F /16F, -2F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.END_LOADED;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}