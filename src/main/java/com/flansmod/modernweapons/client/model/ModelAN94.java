//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AN94
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

public class ModelAN94 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelAN94() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[25];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-3F, 15F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 8, 20, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(0F, 4F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-2F, 12F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 45, 4, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, 4F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 2, 0F); // Import Box0
		gunModel[4].setRotationPoint(-2F, 18F, -1F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 8, 2, 0F); // Import Box0
		gunModel[5].setRotationPoint(18F, 7F, -1F);

		gunModel[6].addBox(0F, -17F, 0F, 50, 10, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-4F, -6F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 35, 6, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(-47F, -7F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 72, 4, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(40F, -3.5F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 38, 6, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(40F, -4.5F, 3F);

		gunModel[10].addBox(0F, -17F, 0F, 38, 6, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(40F, -4.5F, -5F);

		gunModel[11].addBox(0F, -17F, 0F, 38, 8, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(40F, -11.5F, 13F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 60, 6, 5, 0F); // Import Box0
		gunModel[12].setRotationPoint(-3F, -11F, -2.5F);

		gunModel[13].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import Box0
		gunModel[13].setRotationPoint(8F, 13.01F, -0.5F);

		gunModel[14].addBox(0F, -17F, 0F, 50, 10, 4, 0F); // Import Box0
		gunModel[14].setRotationPoint(-46F, 4F, -2F);
		gunModel[14].rotateAngleZ = 0.20943951F;

		gunModel[15].addBox(0F, -17F, 0F, 7, 22, 7, 0F); // Import Box0
		gunModel[15].setRotationPoint(-52F, -7.01F, -3.5F);

		gunModel[16].addBox(0F, -17F, 0F, 48, 2, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(44F, 2.5F, -1F);

		gunModel[17].addBox(0F, -17F, 0F, 10, 6, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(40F, -7.5F, 13F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 30, 4, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(42F, -8.5F, 3F);

		gunModel[19].addBox(0F, -17F, 0F, 30, 4, 2, 0F); // Import Box0
		gunModel[19].setRotationPoint(42F, -8.5F, -5F);

		gunModel[20].addBox(0F, -17F, 0F, 33, 8, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(44.01F, -21F, 13F);
		gunModel[20].rotateAngleX = 1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 3, 10, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(90F, -4.5F, -2.5F);

		gunModel[22].addBox(0F, -17F, 0F, 20, 8, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(-45F, -3F, -2.5F);

		gunModel[23].addBox(0F, -17F, 0F, 18, 6, 5, 0F); // Import Box0
		gunModel[23].setRotationPoint(57.25F, -10F, -2.5F);

		gunModel[24].addBox(0F, -17F, 0F, 60, 6, 3, 0F); // Import Box0
		gunModel[24].setRotationPoint(-2F, -12F, -1.5F);


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 15, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(108F, -6.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.85521133F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 14, 2, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(122F, -18.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(121F, -28.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(121.5F, -32.5F, 0.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(121.5F, -32.5F, -1.75F);
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


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 10, 14, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(26.5F, 6F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.33161256F;

		ammoModel[1].addBox(0F, -17F, 0F, 10, 17, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(32F, 19F, -2F);
		ammoModel[1].rotateAngleZ = 0.38397243F;

		ammoModel[2].addBox(0F, -17F, 0F, 3, 32, 2, 0F); // Import Box0
		ammoModel[2].setRotationPoint(24.5F, 5F, -1F);
		ammoModel[2].rotateAngleZ = 0.36651914F;

		ammoModel[3].addBox(0F, -17F, 0F, 3, 32, 2, 0F); // Import Box0
		ammoModel[3].setRotationPoint(34.5F, 2F, -1F);
		ammoModel[3].rotateAngleZ = 0.34906585F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(10F, -5F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(11F, -4F, -7.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(110F /16F, 18F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(55 /16F, 12F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}