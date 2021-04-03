//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GL6
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

public class ModelGL6 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelGL6() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 13, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-52F, 3.25F, -2F);
		gunModel[0].rotateAngleZ = -0.87266463F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-39F, -6F, -1.5F);
		gunModel[1].rotateAngleZ = -0.9424778F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 19, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-36F, -2F, -1F);
		gunModel[2].rotateAngleZ = -0.9424778F;

		gunModel[3].addBox(0F, -17F, 0F, 2, 6, 4, 0F); // Import Box0
		gunModel[3].setRotationPoint(-14F, 8F, -2F);

		gunModel[4].addBox(0F, -17F, 0F, 12, 30, 7, 0F); // Import Box0
		gunModel[4].setRotationPoint(-46F, -11F, -3.5F);
		gunModel[4].rotateAngleZ = 1.74532925F;

		gunModel[5].addBox(0F, -17F, 0F, 8, 1, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-20F, 14F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 8, 28, 4, 0F); // Import Box0
		gunModel[6].setRotationPoint(-22F, -16F, -2F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 38, 6, 9, 0F); // Import Box0
		gunModel[7].setRotationPoint(-12F, 16F, -4.5F);

		gunModel[8].addBox(0F, -17F, 0F, 2, 6, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(-20F, 8F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 4, 30, 10, 0F); // Import Box0
		gunModel[9].setRotationPoint(-12F, -11F, -5F);

		gunModel[10].addBox(0F, -17F, 0F, 4, 4, 12, 0F); // Import Box0
		gunModel[10].setRotationPoint(21F, 17F, -6F);

		gunModel[11].addBox(0F, -17F, 0F, 2, 23, 23, 0F); // Import Box0
		gunModel[11].setRotationPoint(-8F, -9F, -11.5F);

		gunModel[12].addBox(0F, -17F, 0F, 14, 4, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-49F, -10F, -4F);
		gunModel[12].rotateAngleZ = 1.78023584F;

		gunModel[13].addBox(0F, -17F, 0F, 16, 10, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(-28F, -0.75F, -3F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-4F, 8F, 1F);

		ammoModel[1].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-4F, 8F, -8F);

		ammoModel[2].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[2].setRotationPoint(-4F, -1F, 5F);

		ammoModel[3].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[3].setRotationPoint(-4F, -1F, -12F);

		ammoModel[4].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[4].setRotationPoint(-4F, -10F, 0F);

		ammoModel[5].addBox(0F, -17F, 0F, 12, 7, 7, 0F); // Import Box0
		ammoModel[5].setRotationPoint(-4F, -10F, -9F);


		breakActionModel = new ModelRendererTurbo[18];
		breakActionModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		breakActionModel[1] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		breakActionModel[2] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		breakActionModel[3] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		breakActionModel[4] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		breakActionModel[5] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		breakActionModel[6] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0
		breakActionModel[7] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		breakActionModel[8] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		breakActionModel[9] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		breakActionModel[10] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		breakActionModel[11] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		breakActionModel[12] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		breakActionModel[13] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Import Box0
		breakActionModel[14] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import Box0
		breakActionModel[15] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box0
		breakActionModel[16] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box0
		breakActionModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0

		breakActionModel[0].addBox(0F, -17F, 0F, 40, 11, 11, 0F); // Import Box0
		breakActionModel[0].setRotationPoint(34F, -10F, -5.5F);

		breakActionModel[1].addBox(0F, -17F, 0F, 38, 4, 9, 0F); // Import Box0
		breakActionModel[1].setRotationPoint(-12F, -15F, -4.5F);

		breakActionModel[2].addBox(0F, -17F, 0F, 8, 35, 11, 0F); // Import Box0
		breakActionModel[2].setRotationPoint(26F, -15F, -5.5F);

		breakActionModel[3].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[3].setRotationPoint(82F, -56.5F, -4F);
		breakActionModel[3].rotateAngleZ = 1.57079633F;

		breakActionModel[4].addBox(0F, -17F, 0F, 34, 2, 1, 0F); // Import Box0
		breakActionModel[4].setRotationPoint(82F, -22.5F, -4F);
		breakActionModel[4].rotateAngleZ = 1.57079633F;

		breakActionModel[5].addBox(0F, -17F, 0F, 34, 2, 1, 0F); // Import Box0
		breakActionModel[5].setRotationPoint(82F, -22.5F, 3F);
		breakActionModel[5].rotateAngleZ = 1.57079633F;

		breakActionModel[6].addBox(0F, -17F, 0F, 7, 5, 12, 0F); // Import Box0
		breakActionModel[6].setRotationPoint(80F, -21.5F, -6F);
		breakActionModel[6].rotateAngleZ = 1.57079633F;

		breakActionModel[7].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[7].setRotationPoint(83F, -50.5F, -4F);
		breakActionModel[7].rotateAngleZ = 1.57079633F;

		breakActionModel[8].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[8].setRotationPoint(83F, -44.5F, -4F);
		breakActionModel[8].rotateAngleZ = 1.57079633F;

		breakActionModel[9].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[9].setRotationPoint(83F, -38.5F, -4F);
		breakActionModel[9].rotateAngleZ = 1.57079633F;

		breakActionModel[10].addBox(0F, -17F, 0F, 2, 2, 8, 0F); // Import Box0
		breakActionModel[10].setRotationPoint(83F, -32.5F, -4F);
		breakActionModel[10].rotateAngleZ = 1.57079633F;

		breakActionModel[11].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[11].setRotationPoint(-6F, 7F, 0F);

		breakActionModel[12].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[12].setRotationPoint(-6F, 7F, -9F);

		breakActionModel[13].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[13].setRotationPoint(-6F, -2F, 4F);

		breakActionModel[14].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[14].setRotationPoint(-6F, -2F, -13F);

		breakActionModel[15].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[15].setRotationPoint(-6F, -11F, -1F);

		breakActionModel[16].addBox(0F, -17F, 0F, 30, 9, 9, 0F); // Import Box0
		breakActionModel[16].setRotationPoint(-6F, -11F, -10F);

		breakActionModel[17].addBox(0F, -17F, 0F, 2, 23, 23, 0F); // Import Box0
		breakActionModel[17].setRotationPoint(24F, -9F, -11.5F);



		barrelAttachPoint = new Vector3f(74F /16F, 25F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(23F /16F, -2F /16F, 1F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 32F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(44 /16F, 17F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BREAK_ACTION;


		numBulletsInReloadAnimation = 5F;


		pumpHandleDistance = 2F;


		barrelBreakPoint = new Vector3f(23 /16F, -2F /16F, 1F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}