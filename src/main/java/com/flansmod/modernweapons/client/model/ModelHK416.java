//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HK416
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

public class ModelHK416 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelHK416() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[27];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-7F, 18F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-4F, 7F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-6F, 15F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 30, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-2F, 2F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-8F, 23F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 7, 6, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-5F, 0F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 13, 6, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(15F, 8F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 34, 10, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-6F, -8F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 30, 8, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-41F, -7F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 30, 4, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(56F, -5F, -2F);

		gunModel[10].addBox(0F, -17F, 0F, 31, 8, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(36F, -7.5F, -3F);

		gunModel[11].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[11].setRotationPoint(28F, -7.5F, 3F);

		gunModel[12].addBox(0F, -17F, 0F, 10, 8, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(47F, -7.5F, 3F);

		gunModel[13].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[13].setRotationPoint(28F, -7.5F, -5F);

		gunModel[14].addBox(0F, -17F, 0F, 10, 8, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(47F, -7.5F, -5F);

		gunModel[15].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(28F, -24.5F, 13F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 10, 8, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(47F, -24.5F, 13F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(28F, -14.5F, 13F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 10, 8, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(47F, -14.5F, 13F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 33, 3, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(-5F, -11F, -2.5F);

		gunModel[20].addBox(0F, -17F, 0F, 10, 2, 3, 0F); // Import Box0
		gunModel[20].setRotationPoint(6F, 11F, -1.5F);

		gunModel[21].addBox(0F, -17F, 0F, 17, 3, 2, 0F); // Import Box0
		gunModel[21].setRotationPoint(-10F, -24.5F, 15.5F);
		gunModel[21].rotateAngleX = 1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 7, 3, 2, 0F); // Import Box0
		gunModel[22].setRotationPoint(5F, -25F, 3.5F);
		gunModel[22].rotateAngleX = 1.57079633F;
		gunModel[22].rotateAngleY = -1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 23, 10, 4, 0F); // Import Box0
		gunModel[23].setRotationPoint(-37F, -1F, -2F);
		gunModel[23].rotateAngleZ = 0.10471976F;

		gunModel[24].addBox(0F, -17F, 0F, 6, 17, 5, 0F); // Import Box0
		gunModel[24].setRotationPoint(-42F, -6.25F, -2.5F);

		gunModel[25].addBox(0F, -17F, 0F, 10, 5, 5, 0F); // Import Box0
		gunModel[25].setRotationPoint(-16F, -5.5F, -2.5F);

		gunModel[26].addBox(0F, -17F, 0F, 4, 12, 5, 0F); // Import Box0
		gunModel[26].setRotationPoint(-18F, -4.25F, -2.5F);


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 10, 3, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(80F, -21.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 4, 14, 4, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(14F, -26.5F, -2F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(80.5F, -28.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(81F, -32.5F, 0.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(81F, -32.5F, -1.75F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(15F, -28.5F, -2F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(15.5F, -28.5F, 1.75F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(15.5F, -28.5F, -2.75F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 14, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(16.5F, 10F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 11, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(19.5F, 23F, -2F);
		ammoModel[1].rotateAngleZ = 0.15707963F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 18, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(8F, -4F, -4.5F);



		barrelAttachPoint = new Vector3f(82F /16F, 20F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(4F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(42 /16F, 15F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}