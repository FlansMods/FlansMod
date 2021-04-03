//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B4CrossBow
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

public class ModelB4CrossBow extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelB4CrossBow() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(10F, 10F, -2F);
		gunModel[0].rotateAngleZ = -0.20943951F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(14F, -1F, -1.5F);
		gunModel[1].rotateAngleZ = -0.20943951F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(11F, 7F, -1F);
		gunModel[2].rotateAngleZ = -0.20943951F;

		gunModel[3].addBox(0F, -17F, 0F, 28, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(12F, -2F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 2, 0F); // Import Box0
		gunModel[4].setRotationPoint(8F, 14F, -1F);
		gunModel[4].rotateAngleZ = -0.20943951F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 6, 2, 0F); // Import Box0
		gunModel[5].setRotationPoint(31F, 4F, -1F);

		gunModel[6].addBox(0F, -17F, 0F, 30, 6, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(11F, -7F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 50, 2, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(-22F, -9F, -2F);

		gunModel[8].addBox(0F, -17F, 0F, 30, 6, 14, 0F); // Import Box0
		gunModel[8].setRotationPoint(62F, -4F, -7F);

		gunModel[9].addBox(0F, -17F, 0F, 34, 5, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(69F, -6.5F, 43F);
		gunModel[9].rotateAngleY = -1.04719755F;

		gunModel[10].addBox(0F, -17F, 0F, 34, 5, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(71F, -6.5F, -44F);
		gunModel[10].rotateAngleY = 1.04719755F;

		gunModel[11].addBox(0F, -17F, 0F, 64, 10, 6, 0F); // Import Box0
		gunModel[11].setRotationPoint(32F, -14.5F, 12F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 8, 2, 1, 0F); // Import Box0
		gunModel[12].setRotationPoint(24F, 8F, -0.5F);

		gunModel[13].addBox(0F, -17F, 0F, 50, 4, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(-20F, 2F, -1.5F);
		gunModel[13].rotateAngleZ = 0.06981317F;

		gunModel[14].addBox(0F, -17F, 0F, 3, 18, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(-23F, -10F, -3.5F);

		gunModel[15].addBox(0F, -17F, 0F, 54, 4, 1, 0F); // Import Box0
		gunModel[15].setRotationPoint(41F, -5.5F, 1F);

		gunModel[16].addBox(0F, -17F, 0F, 54, 4, 1, 0F); // Import Box0
		gunModel[16].setRotationPoint(41F, -5.5F, -2F);

		gunModel[17].addBox(0F, -17F, 0F, 54, 7, 6, 0F); // Import Box0
		gunModel[17].setRotationPoint(40F, -15.25F, 13F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 18, 8, 8, 0F); // Import Box0
		gunModel[18].setRotationPoint(33F, 1F, -4F);

		gunModel[19].addBox(0F, -17F, 0F, 14, 17, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(-20F, -10F, -2.5F);

		gunModel[20].addBox(0F, -17F, 0F, 4, 10, 1, 0F); // Import Box0
		gunModel[20].setRotationPoint(10F, -8F, -0.5F);

		gunModel[21].addBox(0F, -17F, 0F, 5, 4, 6, 0F); // Import Box0
		gunModel[21].setRotationPoint(26.5F, -10F, 2.5F);
		gunModel[21].rotateAngleY = -1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 6, 4, 6, 0F); // Import Box0
		gunModel[22].setRotationPoint(32.5F, -10.5F, 3F);
		gunModel[22].rotateAngleY = -1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 5, 2, 24, 0F); // Import Box0
		gunModel[23].setRotationPoint(27.5F, -12F, 2.5F);
		gunModel[23].rotateAngleY = -1.57079633F;

		gunModel[24].addBox(0F, -17F, 0F, 1, 4, 1, 0F); // Import Box0
		gunModel[24].setRotationPoint(90.5F, -15F, 0.5F);
		gunModel[24].rotateAngleY = -1.57079633F;

		gunModel[25].addBox(0F, -17F, 0F, 6, 2, 24, 0F); // Import Box0
		gunModel[25].setRotationPoint(82F, -3F, -12F);

		gunModel[26].addBox(0F, -17F, 0F, 8, 8, 6, 0F); // Import Box0
		gunModel[26].setRotationPoint(81F, -8F, -15F);

		gunModel[27].addBox(0F, -17F, 0F, 8, 8, 6, 0F); // Import Box0
		gunModel[27].setRotationPoint(81F, -8F, 9F);

		gunModel[28].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		gunModel[28].setRotationPoint(90F, -10.5F, 2F);

		gunModel[29].addBox(0F, -17F, 0F, 2, 5, 1, 0F); // Import Box0
		gunModel[29].setRotationPoint(90F, -10.5F, -3F);

		gunModel[30].addBox(0F, -17F, 0F, 2, 1, 6, 0F); // Import Box0
		gunModel[30].setRotationPoint(90F, -11.5F, -3F);

		gunModel[31].addBox(0F, -17F, 0F, 48, 1, 1, 0F); // Import Box0
		gunModel[31].setRotationPoint(43F, -5.5F, 0F);
		gunModel[31].rotateAngleY = 0.87266463F;

		gunModel[32].addBox(0F, -17F, 0F, 48, 1, 1, 0F); // Import Box0
		gunModel[32].setRotationPoint(42F, -5.5F, 0F);
		gunModel[32].rotateAngleY = -0.87266463F;

		gunModel[33].addBox(0F, -17F, 0F, 2, 2, 2, 0F); // Import Box0
		gunModel[33].setRotationPoint(42F, -6.5F, -1F);


		defaultScopeModel = new ModelRendererTurbo[2];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 1, 4, 4, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(29.5F, -14.5F, 1.5F);
		defaultScopeModel[0].rotateAngleY = -1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 1, 4, 4, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(29.5F, -14.5F, -0.5F);
		defaultScopeModel[1].rotateAngleY = -1.57079633F;


		ammoModel = new ModelRendererTurbo[7];
		ammoModel[0] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 50, 1, 1, 0F); // Import Box0
		ammoModel[0].setRotationPoint(48F, -5.5F, -0.5F);

		ammoModel[1].addBox(0F, -17F, 0F, 6, 1, 0, 0F); // Import Box0
		ammoModel[1].setRotationPoint(47F, -21.5F, 15.5F);
		ammoModel[1].rotateAngleX = 1.57079633F;

		ammoModel[2].addBox(0F, -17F, 0F, 6, 1, 0, 0F); // Import Box0
		ammoModel[2].setRotationPoint(47F, -21.5F, -15.5F);
		ammoModel[2].rotateAngleX = -1.57079633F;

		ammoModel[3].addBox(0F, -17F, 0F, 2, 0, 3, 0F); // Import Box0
		ammoModel[3].setRotationPoint(97F, -5F, -1.5F);

		ammoModel[4].addBox(0F, -17F, 0F, 2, 0, 1, 0F); // Import Box0
		ammoModel[4].setRotationPoint(99F, -5F, -0.5F);

		ammoModel[5].addBox(0F, -17F, 0F, 2, 0, 3, 0F); // Import Box0
		ammoModel[5].setRotationPoint(98F, -20.5F, 17F);
		ammoModel[5].rotateAngleX = 1.57079633F;

		ammoModel[6].addBox(0F, -17F, 0F, 2, 0, 1, 0F); // Import Box0
		ammoModel[6].setRotationPoint(100F, -21.5F, 17F);
		ammoModel[6].rotateAngleX = 1.57079633F;



		barrelAttachPoint = new Vector3f(94F /16F, 13F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(36F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(42 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.END_LOADED;


		endLoadedAmmoDistance = 6F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}