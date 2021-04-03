//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Pr3
// Model Creator: 
// Created on: 14.01.2021 - 01:55:13
// Last changed on: 14.01.2021 - 01:55:13

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPr3 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelPr3() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[24];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-4F, 18F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(-1F, 6F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(-3F, 11F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 61, 8, 7, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(0F, 2F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(-5F, 22F, -2.5F);
		gunModel[4].rotateAngleZ = -0.19198622F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(-4F, 1F, -1.5F);
		gunModel[5].rotateAngleZ = -0.05235988F;

		gunModel[6].addBox(0F, -17F, 0F, 4, 6, 5, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(18F, 9F, -2.5F);

		gunModel[7].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(-11F, -11F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 19, 9, 6, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(-27F, -11F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 16, 6, 7, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(-16F, -12F, -3.5F);
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 64, 5, 5, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(71F, -8.5F, -2.5F);

		gunModel[11].addBox(0F, -17F, 0F, 24, 8, 2, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(35F, -24.5F, 13F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 25, 9, 4, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(35F, -12.5F, 12.5F);
		gunModel[12].rotateAngleX = 1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 88, 8, 7, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(26F, -4.5F, 13F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 16, 1, 1, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(4F, 14F, -0.5F);

		gunModel[15].addBox(0F, -17F, 0F, 22, 4, 7, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(4F, -6F, -4.5F);

		gunModel[16].addBox(0F, -17F, 0F, 2, 5, 8, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(25F, -7F, -8.5F);

		gunModel[17].addBox(0F, -17F, 0F, 70, 5, 6, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(29F, -13F, -3F);

		gunModel[18].addBox(0F, -17F, 0F, 16, 6, 8, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(-19F, -12F, -4F);

		gunModel[19].addBox(0F, -17F, 0F, 14, 3, 6, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(-18F, -13F, -3F);

		gunModel[20].addBox(0F, -17F, 0F, 64, 3, 7, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(61F, 3.5F, -3.5F);

		gunModel[21].addBox(0F, -17F, 0F, 18, 6, 7, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(-22F, -10F, -3.5F);
		gunModel[21].rotateAngleZ = 1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 10, 22, 9, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(76F, -12F, -4.5F);

		gunModel[23].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(127F, -7.5F, -1.5F);


		defaultScopeModel = new ModelRendererTurbo[5];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import ImportBox0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 18, 6, 5, 0F); // Import ImportBox0
		defaultScopeModel[0].setRotationPoint(34F, -19F, -2.5F);

		defaultScopeModel[1].addBox(0F, -17F, 0F, 14, 2, 1, 0F); // Import ImportBox0
		defaultScopeModel[1].setRotationPoint(146F, -24.5F, -0.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 9, 2, 3, 0F); // Import ImportBox0
		defaultScopeModel[2].setRotationPoint(144F, -24.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import ImportBox0
		defaultScopeModel[3].setRotationPoint(36F, -21F, -2.5F);

		defaultScopeModel[4].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import ImportBox0
		defaultScopeModel[4].setRotationPoint(36F, -21F, 1.5F);


		ammoModel = new ModelRendererTurbo[9];
		ammoModel[0] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import ImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import ImportBox0
		ammoModel[5] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import ImportBox0
		ammoModel[6] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Import ImportBox0
		ammoModel[7] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import ImportBox0
		ammoModel[8] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Import ImportBox0

		ammoModel[0].addBox(0F, -17F, 0F, 18, 24, 28, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(53.5F, 3F, -10F);

		ammoModel[1].addBox(0F, -17F, 0F, 18, 36, 8, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(53.5F, -13F, -18F);

		ammoModel[2].addBox(0F, -17F, 0F, 18, 20, 6, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(53.5F, 3F, 18F);

		ammoModel[3].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import ImportBox0
		ammoModel[3].setRotationPoint(56F, 1.5F, 17.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import ImportBox0
		ammoModel[4].setRotationPoint(56F, -1.5F, 15.5F);

		ammoModel[5].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import ImportBox0
		ammoModel[5].setRotationPoint(56F, -4.5F, 12.5F);

		ammoModel[6].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import ImportBox0
		ammoModel[6].setRotationPoint(56F, -5.5F, 9.5F);

		ammoModel[7].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import ImportBox0
		ammoModel[7].setRotationPoint(56F, -6.5F, 6.5F);

		ammoModel[8].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import ImportBox0
		ammoModel[8].setRotationPoint(56F, -7.5F, 3.5F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Import ImportBox0
		slideModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox0

		slideModel[0].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import ImportBox0
		slideModel[0].setRotationPoint(30F, -5.5F, -1.5F);

		slideModel[1].addBox(0F, -17F, 0F, 22, 7, 7, 0F); // Import ImportBox0
		slideModel[1].setRotationPoint(51F, -9.5F, 7.5F);
		slideModel[1].rotateAngleX = 0.78539816F;



		barrelAttachPoint = new Vector3f(132F /16F, 23F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(43F /16F, 30F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(43 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}