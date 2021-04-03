//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RPG
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

public class ModelRPG extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelRPG() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[23];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(1F, 22F, -3.5F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 20, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(5F, 10F, -3F);

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(1F, 17F, -2.5F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 22, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(4F, 6F, -5F);

		gunModel[4].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import Box0
		gunModel[4].setRotationPoint(1F, 26F, -4F);
		gunModel[4].rotateAngleZ = -0.19198622F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 6, 6, 0F); // Import Box0
		gunModel[5].setRotationPoint(20F, 12F, -5F);

		gunModel[6].addBox(0F, -17F, 0F, 46, 10, 10, 0F); // Import Box0
		gunModel[6].setRotationPoint(-74F, -1F, -6.5F);

		gunModel[7].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[7].setRotationPoint(-32F, -1.5F, 2F);

		gunModel[8].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[8].setRotationPoint(-32F, -1.5F, -8F);

		gunModel[9].addBox(0F, -17F, 0F, 24, 9, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(-32F, -5.5F, 11F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 6, 1, 1, 0F); // Import Box0
		gunModel[10].setRotationPoint(14F, 16F, -3F);

		gunModel[11].addBox(0F, -17F, 0F, 22, 13, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(4F, -7F, -5.5F);

		gunModel[12].addBox(0F, -17F, 0F, 20, 3, 6, 0F); // Import Box0
		gunModel[12].setRotationPoint(5F, -8F, -4.5F);

		gunModel[13].addBox(0F, -17F, 0F, 32, 12, 12, 0F); // Import Box0
		gunModel[13].setRotationPoint(-36F, -2F, -7.5F);

		gunModel[14].addBox(0F, -17F, 0F, 24, 9, 4, 0F); // Import Box0
		gunModel[14].setRotationPoint(-32F, -16.5F, 11F);
		gunModel[14].rotateAngleX = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 8, 14, 14, 0F); // Import Box0
		gunModel[15].setRotationPoint(-80F, -3F, -8.5F);

		gunModel[16].addBox(0F, -17F, 0F, 8, 3, 10, 0F); // Import Box0
		gunModel[16].setRotationPoint(44F, 3F, 0.5F);

		gunModel[17].addBox(0F, -17F, 0F, 2, 5, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(50F, -2F, 8.5F);

		gunModel[18].addBox(0F, -17F, 0F, 38, 8, 8, 0F); // Import Box0
		gunModel[18].setRotationPoint(-6F, 0F, -5.5F);

		gunModel[19].addBox(0F, -17F, 0F, 38, 6, 6, 0F); // Import Box0
		gunModel[19].setRotationPoint(20F, 1F, -4.5F);

		gunModel[20].addBox(0F, -17F, 0F, 9, 20, 3, 0F); // Import Box0
		gunModel[20].setRotationPoint(-24F, 6F, -3F);

		gunModel[21].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(-28F, 20F, -4F);
		gunModel[21].rotateAngleZ = -0.19198622F;

		gunModel[22].addBox(0F, -17F, 0F, 6, 15, 15, 0F); // Import Box0
		gunModel[22].setRotationPoint(-86F, -3.5F, -9F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 36, 7, 8, 0F); // Import Box0
		ammoModel[0].setRotationPoint(56F, 0.5F, -5.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 8, 10, 10, 0F); // Import Box0
		ammoModel[1].setRotationPoint(62F, -1F, -6.5F);

		ammoModel[2].addBox(0F, -17F, 0F, 8, 10, 10, 0F); // Import Box0
		ammoModel[2].setRotationPoint(90F, -1F, -6.5F);

		ammoModel[3].addBox(0F, -17F, 0F, 22, 12, 12, 0F); // Import Box0
		ammoModel[3].setRotationPoint(69F, -2F, -7.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 30, 3, 4, 0F); // Import Box0
		ammoModel[4].setRotationPoint(76F, 2.5F, -3.5F);



		barrelAttachPoint = new Vector3f(104F /16F, 13F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(20F /16F, 18F /16F, 4F /16F);

		scopeAttachPoint = new Vector3f(14F /16F, 23F /16F, -2F /16F);

		gripAttachPoint = new Vector3f(40 /16F, 11F /16F, -2F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.END_LOADED;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}