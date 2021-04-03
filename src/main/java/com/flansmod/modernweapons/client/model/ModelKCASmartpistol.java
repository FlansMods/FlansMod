//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KCASmartpistol
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

public class ModelKCASmartpistol extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelKCASmartpistol() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[7];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-9.5F, 11F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 12, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-6F, -2F, -2.5F);
		gunModel[1].rotateAngleZ = -0.2443461F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-8F, 8F, -2F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(4F, 6F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 4, 50, 6, 0F); // Import Box0
		gunModel[4].setRotationPoint(25F, -19F, -3F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 8, 3, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(-11F, 0F, -2F);
		gunModel[5].rotateAngleZ = -0.17453293F;

		gunModel[6].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(34F, -11F, -1.5F);
		gunModel[6].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 9, 21, 3, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-6F, 5F, -1.5F);
		ammoModel[0].rotateAngleZ = -0.2443461F;

		ammoModel[1].addBox(0F, -17F, 0F, 12, 5, 5, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-12F, 22F, -2.5F);
		ammoModel[1].rotateAngleZ = -0.2443461F;


		slideModel = new ModelRendererTurbo[15];
		slideModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34
		slideModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 34
		slideModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 34
		slideModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		slideModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		slideModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		slideModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		slideModel[11] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		slideModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		slideModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		slideModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		slideModel[0].setRotationPoint(2F, -34.25F, -0.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 38, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(17F, -23.25F, -2.5F);
		slideModel[1].rotateAngleZ = -1.57079633F;

		slideModel[2].addBox(0F, -17F, 0F, 8, 56, 8, 0F); // Import Box0
		slideModel[2].setRotationPoint(31F, -27F, -4F);
		slideModel[2].rotateAngleZ = -1.57079633F;

		slideModel[3].addBox(0F, -17F, 0F, 11, 40, 9, 0F); // Import Box0
		slideModel[3].setRotationPoint(56.5F, -29F, -4.5F);
		slideModel[3].rotateAngleZ = -1.57079633F;

		slideModel[4].addBox(0F, -17F, 0F, 4, 28, 2, 0F); // Import Box0
		slideModel[4].setRotationPoint(46F, -19.5F, -1F);
		slideModel[4].rotateAngleZ = -1.57079633F;

		slideModel[5].addBox(15F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		slideModel[5].setRotationPoint(40F, -35.25F, 2.5F);

		slideModel[6].addBox(15F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		slideModel[6].setRotationPoint(40F, -35.25F, -3.5F);

		slideModel[7].addBox(0F, -17F, 0F, 1, 4, 1, 0F); // Import Box0
		slideModel[7].setRotationPoint(60.5F, -28F, -3.5F);
		slideModel[7].rotateAngleZ = -1.57079633F;

		slideModel[8].addBox(0F, -17F, 0F, 1, 4, 1, 0F); // Import Box0
		slideModel[8].setRotationPoint(60.5F, -28F, 2.5F);
		slideModel[8].rotateAngleZ = -1.57079633F;

		slideModel[9].addBox(0F, -17F, 0F, 1, 4, 1, 0F); // Import Box0
		slideModel[9].setRotationPoint(60.5F, -20F, -3.5F);
		slideModel[9].rotateAngleZ = -1.57079633F;

		slideModel[10].addBox(0F, -17F, 0F, 1, 4, 1, 0F); // Import Box0
		slideModel[10].setRotationPoint(60.5F, -20F, 2.5F);
		slideModel[10].rotateAngleZ = -1.57079633F;

		slideModel[11].addBox(0F, -17F, 0F, 4, 22, 9, 0F); // Import Box0
		slideModel[11].setRotationPoint(58.5F, -33F, -4.5F);
		slideModel[11].rotateAngleZ = -1.57079633F;

		slideModel[12].addBox(0F, -17F, 0F, 3, 4, 7, 0F); // Import Box0
		slideModel[12].setRotationPoint(59.25F, -32.5F, -3.5F);
		slideModel[12].rotateAngleZ = -1.57079633F;

		slideModel[13].addBox(0F, -17F, 0F, 4, 22, 7, 0F); // Import Box0
		slideModel[13].setRotationPoint(40.5F, -31F, -3.5F);
		slideModel[13].rotateAngleZ = -1.57079633F;

		slideModel[14].addBox(0F, -17F, 0F, 6, 22, 7, 0F); // Import Box0
		slideModel[14].setRotationPoint(2.5F, -33F, -3.5F);
		slideModel[14].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(73F /16F, 30F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 39F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(28 /16F, 22F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}