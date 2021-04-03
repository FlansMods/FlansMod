//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MiniUzi
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

public class ModelMiniUzi extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelMiniUzi() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34
		gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 34
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 34
		gunModel[15] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 34

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-11.5F, 21F, -3F);

		gunModel[1].addBox(0F, -17F, 0F, 11, 24, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-9F, 7F, -2.5F);

		gunModel[2].addBox(0F, -17F, 0F, 5, 8, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-13F, 14F, -2F);
		gunModel[2].rotateAngleZ = -0.2443461F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, 13F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 34
		gunModel[4].setRotationPoint(28F, -32.25F, 3F);

		gunModel[5].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 34
		gunModel[5].setRotationPoint(28F, -32.25F, -4F);

		gunModel[6].addBox(0F, -17F, 0F, 4, 62, 8, 0F); // Import Box0
		gunModel[6].setRotationPoint(18F, -13F, -4F);
		gunModel[6].rotateAngleZ = -1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 8, 4, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(-18F, 6F, -2F);
		gunModel[7].rotateAngleZ = -0.17453293F;

		gunModel[8].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[8].setRotationPoint(30F, -4F, -1.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 12, 86, 10, 0F); // Import Box0
		gunModel[9].setRotationPoint(18F, -25F, -5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 4, 32, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(40F, -19F, -2F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 6, 8, 6, 0F); // Import Box0
		gunModel[11].setRotationPoint(24F, -20F, -3F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 6, 1, 6, 0F); // Import Box0
		gunModel[12].setRotationPoint(26F, -20F, -3F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 12, 22, 12, 0F); // Import Box0
		gunModel[13].setRotationPoint(20F, -19F, -6F);
		gunModel[13].rotateAngleZ = -1.57079633F;

		gunModel[14].addBox(0F, 0F, 0F, 8, 9, 1, 0F); // Box 34
		gunModel[14].setRotationPoint(-49F, -33.25F, 3F);

		gunModel[15].addBox(0F, 0F, 0F, 8, 9, 1, 0F); // Box 34
		gunModel[15].setRotationPoint(-49F, -33.25F, -4F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 7, 21, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-7F, 21F, -2F);

		ammoModel[1].addBox(0F, -17F, 0F, 9, 4, 5, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-8F, 39F, -2.5F);


		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 34
		slideModel[1] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		slideModel[0].setRotationPoint(10F, -31.25F, -0.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 38, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(-2F, -25.25F, -2.5F);
		slideModel[1].rotateAngleZ = -1.57079633F;

		slideModel[2].addBox(0F, -17F, 0F, 6, 6, 6, 0F); // Import Box0
		slideModel[2].setRotationPoint(-4F, -29F, -3F);
		slideModel[2].rotateAngleZ = -1.57079633F;

		slideModel[3].addBox(0F, -17F, 0F, 4, 27, 8, 0F); // Import Box0
		slideModel[3].setRotationPoint(-10F, -23F, -6F);
		slideModel[3].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(54F /16F, 17F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(-37F /16F, 24F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(26 /16F, 8F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}