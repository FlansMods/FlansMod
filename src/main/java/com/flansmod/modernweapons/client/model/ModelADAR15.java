//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ADAR15
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

public class ModelADAR15 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelADAR15() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[38];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-5F, 17F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-2F, 6F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-4F, 14F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 26, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(8F, 1F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-6F, 22F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 7, 9, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-2F, -1F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 14, 6, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(18F, 7F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 39, 10, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-4F, -9F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 58, 10, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-51F, -8F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 90, 4, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(38F, -7.5F, -2F);

		gunModel[10].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(44F, -8.5F, 2.5F);

		gunModel[11].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[11].setRotationPoint(63F, -8.5F, 2.5F);

		gunModel[12].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(44F, -8.5F, -4.5F);

		gunModel[13].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[13].setRotationPoint(63F, -8.5F, -4.5F);

		gunModel[14].addBox(0F, -17F, 0F, 18, 6, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(44F, -28.5F, 14F);
		gunModel[14].rotateAngleX = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 18, 6, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(63F, -28.5F, 14F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 18, 6, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(44F, -12.5F, 14F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 37, 3, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(-3F, -12F, -2.5F);

		gunModel[18].addBox(0F, -17F, 0F, 16, 2, 3, 0F); // Import Box0
		gunModel[18].setRotationPoint(8F, 10F, -1.5F);

		gunModel[19].addBox(0F, -17F, 0F, 22, 5, 7, 0F); // Import Box0
		gunModel[19].setRotationPoint(6F, -7F, -4.5F);

		gunModel[20].addBox(0F, -17F, 0F, 3, 3, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(1F, -6F, -5.5F);
		gunModel[20].rotateAngleY = -0.73303829F;

		gunModel[21].addBox(0F, -17F, 0F, 54, 4, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(-53F, 19F, -2.5F);

		gunModel[22].addBox(0F, -17F, 0F, 5, 5, 6, 0F); // Import Box0
		gunModel[22].setRotationPoint(1F, -7F, -4.5F);
		gunModel[22].rotateAngleY = -0.73303829F;

		gunModel[23].addBox(0F, -17F, 0F, 14, 28, 7, 0F); // Import Box0
		gunModel[23].setRotationPoint(-53.5F, -9F, -3.5F);

		gunModel[24].addBox(0F, -17F, 0F, 14, 28, 7, 0F); // Import Box0
		gunModel[24].setRotationPoint(-31.5F, -9F, -3.5F);

		gunModel[25].addBox(0F, -17F, 0F, 8, 12, 7, 0F); // Import Box0
		gunModel[25].setRotationPoint(-39F, -9F, -3.5F);

		gunModel[26].addBox(0F, -17F, 0F, 8, 8, 7, 0F); // Import Box0
		gunModel[26].setRotationPoint(-39.5F, 11F, -3.5F);

		gunModel[27].addBox(0F, -17F, 0F, 42, 10, 8, 0F); // Import Box0
		gunModel[27].setRotationPoint(-53F, -10F, -4F);

		gunModel[28].addBox(0F, -17F, 0F, 58, 6, 2, 0F); // Import Box0
		gunModel[28].setRotationPoint(34F, -7.5F, 3F);

		gunModel[29].addBox(0F, -17F, 0F, 58, 6, 2, 0F); // Import Box0
		gunModel[29].setRotationPoint(34F, -7.5F, -5F);

		gunModel[30].addBox(0F, -17F, 0F, 58, 8, 4, 0F); // Import Box0
		gunModel[30].setRotationPoint(34F, -14.5F, 13F);
		gunModel[30].rotateAngleX = 1.57079633F;

		gunModel[31].addBox(0F, -17F, 0F, 48, 2, 2, 0F); // Import Box0
		gunModel[31].setRotationPoint(50F, -9.5F, -1F);

		gunModel[32].addBox(0F, -17F, 0F, 10, 8, 5, 0F); // Import Box0
		gunModel[32].setRotationPoint(34F, -9.5F, 13F);
		gunModel[32].rotateAngleX = 1.57079633F;

		gunModel[33].addBox(0F, -17F, 0F, 37, 2, 2, 0F); // Import Box0
		gunModel[33].setRotationPoint(44F, -10.5F, 2.5F);

		gunModel[34].addBox(0F, -17F, 0F, 37, 2, 2, 0F); // Import Box0
		gunModel[34].setRotationPoint(44F, -10.5F, -4.5F);

		gunModel[35].addBox(0F, -17F, 0F, 57, 8, 5, 0F); // Import Box0
		gunModel[35].setRotationPoint(34F, -24F, 13F);
		gunModel[35].rotateAngleX = 1.57079633F;

		gunModel[36].addBox(0F, -17F, 0F, 5, 9, 5, 0F); // Import Box0
		gunModel[36].setRotationPoint(90F, -10.5F, -2.5F);

		gunModel[37].addBox(0F, -17F, 0F, 8, 8, 5, 0F); // Import Box0
		gunModel[37].setRotationPoint(0F, 1F, -2.5F);


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 18, 2, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(98.5F, -6.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 0.6981317F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 10, 3, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(118.5F, -22.5F, -0.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(118F, -28.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(118.5F, -32.5F, 0.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(118.5F, -32.5F, -1.75F);
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
		ammoModel[0] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 13, 14, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(19.5F, 12F, -2F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 14, 11, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(21.5F, 25F, -2F);
		ammoModel[1].rotateAngleZ = 0.15707963F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 17, 3, 2, 0F); // Import Box0
		slideModel[0].setRotationPoint(-8F, -26.5F, 15.5F);
		slideModel[0].rotateAngleX = 1.57079633F;

		slideModel[1].addBox(0F, -17F, 0F, 9, 3, 3, 0F); // Import Box0
		slideModel[1].setRotationPoint(7F, -26F, 4.5F);
		slideModel[1].rotateAngleX = 1.57079633F;
		slideModel[1].rotateAngleY = -1.57079633F;



		barrelAttachPoint = new Vector3f(126F /16F, 22F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(1F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(52 /16F, 13F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}