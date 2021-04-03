//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: R700
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

public class ModelR700 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelR700() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 12, 6, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-25F, 7.25F, -2F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 18, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-21F, -5F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-17F, -1F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 24, 9, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-38F, 2F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[4].setRotationPoint(-18F, -6F, -2F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 6, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(3F, 2F, -2F);

		gunModel[6].addBox(0F, -17F, 0F, 48, 11, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-14F, -8F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 16, 30, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-40F, -4F, -3.5F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 108, 5, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(26F, -11.5F, -2.5F);

		gunModel[9].addBox(0F, -17F, 0F, 38, 8, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(36F, -16.5F, 13F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 13, 1, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(-6F, 8F, -1.5F);

		gunModel[11].addBox(0F, -17F, 0F, 21, 6, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-46F, -3.5F, -4F);
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 42, 10, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(34F, -8F, -3.5F);

		gunModel[13].addBox(0F, -17F, 0F, 24, 9, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(8F, -16.5F, 12.5F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 34, 4, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(2F, -12F, -3.5F);

		gunModel[15].addBox(0F, -17F, 0F, 4, 26, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(-40F, -20F, -3F);
		gunModel[15].rotateAngleZ = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 58, 2, 5, 0F); // Import Box0
		gunModel[16].setRotationPoint(7F, 2F, -2.5F);

		gunModel[17].addBox(0F, -17F, 0F, 4, 6, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(-6F, 2F, -2F);

		gunModel[18].addBox(0F, -17F, 0F, 20, 5, 3, 0F); // Import Box0
		gunModel[18].setRotationPoint(10F, -11F, -3.75F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 3, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(13F, -10F, -2.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 6, 2, 2, 0F); // Import Box0
		ammoModel[1].setRotationPoint(21F, -9.5F, -2F);

		ammoModel[2].addBox(0F, -17F, 0F, 1, 3, 3, 0F); // Import Box0
		ammoModel[2].setRotationPoint(12F, -10F, -2.5F);


		pumpModel = new ModelRendererTurbo[3];
		pumpModel[0] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		pumpModel[2] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Import Box0

		pumpModel[0].addBox(0F, -17F, 0F, 22, 4, 5, 0F); // Import Box0
		pumpModel[0].setRotationPoint(-8F, -10F, -2.5F);

		pumpModel[1].addBox(0F, -17F, 0F, 2, 3, 8, 0F); // Import Box0
		pumpModel[1].setRotationPoint(-5F, -9F, -8.5F);

		pumpModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		pumpModel[2].setRotationPoint(-6F, -9.5F, -10.5F);



		barrelAttachPoint = new Vector3f(132F /16F, 26F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(16F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(44 /16F, 14F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.RIFLE;


		numBulletsInReloadAnimation = 4F;


		pumpHandleDistance = 2F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}