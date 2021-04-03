//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ElDiablo
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

public class ModelElDiablo extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelElDiablo() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[27];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 34
		gunModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 34
		gunModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-8.5F, 9F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 11, 23, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-4F, -4F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-7F, 6F, -2F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(4F, 4F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		gunModel[4].setRotationPoint(2.5F, -35F, -2.5F);
		gunModel[4].rotateAngleX = 1.57079633F;

		gunModel[5].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		gunModel[5].setRotationPoint(93F, -34F, -2.5F);
		gunModel[5].rotateAngleX = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 4, 46, 6, 0F); // Import Box0
		gunModel[6].setRotationPoint(22F, -22F, -3F);
		gunModel[6].rotateAngleZ = -1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(-7F, -4F, -2F);
		gunModel[7].rotateAngleZ = -0.17453293F;

		gunModel[8].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[8].setRotationPoint(34F, -13F, -1.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 2, 57, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(41F, -35F, -3F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 4, 36, 5, 0F); // Import Box0
		gunModel[10].setRotationPoint(41F, -26F, -2.5F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 2, 14, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(16F, -18F, -2F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 12, 8, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(-10F, -33F, -3.5F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 9, 40, 7, 0F); // Import Box0
		gunModel[13].setRotationPoint(47F, -33.5F, -3.5F);
		gunModel[13].rotateAngleZ = -1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 6, 4, 5, 0F); // Import Box0
		gunModel[14].setRotationPoint(-18F, -28F, -2.5F);
		gunModel[14].rotateAngleZ = -1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 4, 7, 4, 0F); // Import Box0
		gunModel[15].setRotationPoint(1.5F, 11F, -2F);
		gunModel[15].rotateAngleZ = -0.17453293F;

		gunModel[16].addBox(0F, -17F, 0F, 8, 60, 5, 0F); // Import Box0
		gunModel[16].setRotationPoint(80F, -34F, -2.5F);
		gunModel[16].rotateAngleZ = -1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 2, 8, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(2F, -15F, -2F);
		gunModel[17].rotateAngleZ = 0.38397244F;

		gunModel[18].addBox(0F, -17F, 0F, 7, 20, 7, 0F); // Import Box0
		gunModel[18].setRotationPoint(29F, -47.5F, -3.5F);
		gunModel[18].rotateAngleZ = -1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 9, 20, 9, 0F); // Import Box0
		gunModel[19].setRotationPoint(11F, -48.5F, -4.5F);
		gunModel[19].rotateAngleZ = -1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 9, 20, 9, 0F); // Import Box0
		gunModel[20].setRotationPoint(47F, -48.5F, -4.5F);
		gunModel[20].rotateAngleZ = -1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 4, 5, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(21F, -51.5F, -2.5F);
		gunModel[21].rotateAngleZ = -1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 4, 5, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(21F, -46.5F, -5.5F);
		gunModel[22].rotateAngleZ = -1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 8, 20, 8, 0F); // Import Box0
		gunModel[23].setRotationPoint(10.75F, -48F, -4F);
		gunModel[23].rotateAngleZ = -1.57079633F;

		gunModel[24].addBox(0F, -17F, 0F, 8, 20, 8, 0F); // Import Box0
		gunModel[24].setRotationPoint(47.25F, -48F, -4F);
		gunModel[24].rotateAngleZ = -1.57079633F;

		gunModel[25].addBox(0F, -17F, 0F, 6, 2, 3, 0F); // Import Box0
		gunModel[25].setRotationPoint(26F, -42.5F, -1.5F);
		gunModel[25].rotateAngleZ = -1.57079633F;

		gunModel[26].addBox(0F, -17F, 0F, 6, 2, 3, 0F); // Import Box0
		gunModel[26].setRotationPoint(14F, -42.5F, -1.5F);
		gunModel[26].rotateAngleZ = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[12];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 34
		defaultScopeModel[2] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 34
		defaultScopeModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 34
		defaultScopeModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 34
		defaultScopeModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 34
		defaultScopeModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 34
		defaultScopeModel[7] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 34
		defaultScopeModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 34
		defaultScopeModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 34
		defaultScopeModel[10] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 34
		defaultScopeModel[11] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 34

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(94.5F, -37F, -1.5F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 54, 5, 3, 0F); // Box 34
		defaultScopeModel[1].setRotationPoint(4F, -36.25F, -1.5F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 91, 1, 2, 0F); // Box 34
		defaultScopeModel[2].setRotationPoint(4F, -37.25F, -1F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[3].setRotationPoint(90.5F, -37F, -0.5F);

		defaultScopeModel[4].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[4].setRotationPoint(86.5F, -37F, -0.5F);

		defaultScopeModel[5].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[5].setRotationPoint(82.5F, -37F, -0.5F);

		defaultScopeModel[6].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[6].setRotationPoint(78.5F, -37F, -0.5F);

		defaultScopeModel[7].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[7].setRotationPoint(74.5F, -37F, -0.5F);

		defaultScopeModel[8].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[8].setRotationPoint(70.5F, -37F, -0.5F);

		defaultScopeModel[9].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[9].setRotationPoint(66.5F, -37F, -0.5F);

		defaultScopeModel[10].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[10].setRotationPoint(62.5F, -37F, -0.5F);

		defaultScopeModel[11].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[11].setRotationPoint(58.5F, -37F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 10, 16, 10, 0F); // Import Box0
		ammoModel[0].setRotationPoint(5F, -32.5F, -5F);
		ammoModel[0].rotateAngleZ = -1.57079633F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 2, 11, 0F); // Import Box0
		ammoModel[1].setRotationPoint(7F, -33F, -5.5F);
		ammoModel[1].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(95F /16F, 30F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(36F /16F, 37F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(48 /16F, 23F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.REVOLVER;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}