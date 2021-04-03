//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KCASmart50
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

public class ModelKCASmart50 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelKCASmart50() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[21];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-25F, 27F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-22F, 16F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-24F, 24F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 82, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-29F, 11F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-26F, 32F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 7, 6, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-34F, 9F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 2, 5, 5, 0F); // Import Box0
		gunModel[6].setRotationPoint(0F, 17F, -2.5F);

		gunModel[7].addBox(0F, -17F, 0F, 117, 2, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-61F, -4F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 40, 6, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(-3F, -10F, -2.5F);

		gunModel[9].addBox(0F, -17F, 0F, 12, 2, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(-12F, 20F, -1.5F);

		gunModel[10].addBox(0F, -17F, 0F, 9, 22, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(-80F, -7F, -3.5F);

		gunModel[11].addBox(0F, -17F, 0F, 117, 5, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(-61F, 6F, -3.5F);

		gunModel[12].addBox(0F, -17F, 0F, 50, 8, 10, 0F); // Import Box0
		gunModel[12].setRotationPoint(-72F, -2F, -5F);

		gunModel[13].addBox(0F, -17F, 0F, 18, 10, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(35F, -2.5F, 2F);

		gunModel[14].addBox(0F, -17F, 0F, 18, 10, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(35F, -2.5F, -8F);

		gunModel[15].addBox(0F, -17F, 0F, 22, 10, 4, 0F); // Import Box0
		gunModel[15].setRotationPoint(38F, -16.5F, 12F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 22, 10, 4, 0F); // Import Box0
		gunModel[16].setRotationPoint(38F, -8.5F, 12F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 32, 14, 11, 0F); // Import Box0
		gunModel[17].setRotationPoint(3.5F, -9F, 18F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 94, 4, 4, 0F); // Import Box0
		gunModel[18].setRotationPoint(18F, 9.5F, -2F);

		gunModel[19].addBox(0F, -17F, 0F, 36, 6, 6, 0F); // Import Box0
		gunModel[19].setRotationPoint(64F, 8.5F, -3F);

		gunModel[20].addBox(0F, -17F, 0F, 6, 18, 8, 0F); // Import Box0
		gunModel[20].setRotationPoint(104F, -2.5F, -4F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 28, 22, 8, 0F); // Import Box0
		ammoModel[0].setRotationPoint(5.5F, -10F, 28F);
		ammoModel[0].rotateAngleX = 1.57079633F;


		slideModel = new ModelRendererTurbo[15];
		slideModel[0] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import Box0
		slideModel[6] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import Box0
		slideModel[7] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import Box0
		slideModel[8] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box0
		slideModel[9] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import Box0
		slideModel[10] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Import Box0
		slideModel[11] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Box0
		slideModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		slideModel[13] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Import Box0
		slideModel[14] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 164, 6, 6, 0F); // Import Box0
		slideModel[0].setRotationPoint(38F, -0.5F, -3F);

		slideModel[1].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		slideModel[1].setRotationPoint(21F, -1.5F, 3F);

		slideModel[2].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		slideModel[2].setRotationPoint(21F, -1.5F, -5F);

		slideModel[3].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		slideModel[3].setRotationPoint(21F, -18.5F, 13F);
		slideModel[3].rotateAngleX = 1.57079633F;

		slideModel[4].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		slideModel[4].setRotationPoint(21F, -8.5F, 13F);
		slideModel[4].rotateAngleX = 1.57079633F;

		slideModel[5].addBox(0F, -17F, 0F, 24, 8, 6, 0F); // Import Box0
		slideModel[5].setRotationPoint(2F, -2F, -3F);

		slideModel[6].addBox(0F, -17F, 0F, 32, 12, 14, 0F); // Import Box0
		slideModel[6].setRotationPoint(200F, -3.5F, -7F);

		slideModel[7].addBox(0F, -17F, 0F, 8, 14, 8, 0F); // Import Box0
		slideModel[7].setRotationPoint(204F, -4.5F, -10F);
		slideModel[7].rotateAngleY = 0.20943951F;

		slideModel[8].addBox(0F, -17F, 0F, 8, 14, 8, 0F); // Import Box0
		slideModel[8].setRotationPoint(202F, -4.5F, 2F);
		slideModel[8].rotateAngleY = -0.20943951F;

		slideModel[9].addBox(0F, -17F, 0F, 8, 14, 8, 0F); // Import Box0
		slideModel[9].setRotationPoint(211F, -4.5F, -10F);
		slideModel[9].rotateAngleY = 0.20943951F;

		slideModel[10].addBox(0F, -17F, 0F, 8, 14, 8, 0F); // Import Box0
		slideModel[10].setRotationPoint(209F, -4.5F, 2F);
		slideModel[10].rotateAngleY = -0.20943951F;

		slideModel[11].addBox(0F, -17F, 0F, 4, 17, 3, 0F); // Import Box0
		slideModel[11].setRotationPoint(6F, -14F, 0.5F);
		slideModel[11].rotateAngleX = 1.57079633F;

		slideModel[12].addBox(0F, -17F, 0F, 6, 4, 5, 0F); // Import Box0
		slideModel[12].setRotationPoint(7F, -0.5F, -19F);
		slideModel[12].rotateAngleY = 0.59341195F;

		slideModel[13].addBox(0F, -17F, 0F, 30, 4, 12, 0F); // Import Box0
		slideModel[13].setRotationPoint(201F, -5.5F, -6F);

		slideModel[14].addBox(0F, -17F, 0F, 30, 4, 12, 0F); // Import Box0
		slideModel[14].setRotationPoint(201F, 6.5F, -6F);



		barrelAttachPoint = new Vector3f(233F /16F, 14F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(51F /16F, 15F /16F, 8F /16F);

		scopeAttachPoint = new Vector3f(18F /16F, 26F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(26 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 2F;


		animationType = EnumAnimationType.STRIKER;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}