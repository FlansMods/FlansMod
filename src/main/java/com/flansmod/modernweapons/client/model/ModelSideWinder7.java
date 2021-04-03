//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SideWinder7
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

public class ModelSideWinder7 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelSideWinder7() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[28];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import ImportBox0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-9F, 13F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 18, 3, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(-6F, 3F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(-8F, 8F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 50, 6, 7, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(0F, 2F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import ImportBox0
		gunModel[4].setRotationPoint(-10F, 17F, -2.5F);
		gunModel[4].rotateAngleZ = -0.19198622F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(-5F, 1F, -2F);
		gunModel[5].rotateAngleZ = -0.05235988F;

		gunModel[6].addBox(0F, -17F, 0F, 20, 13, 5, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(-11F, -11F, -2.5F);

		gunModel[7].addBox(0F, -17F, 0F, 19, 4, 4, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(-24F, -10F, -2F);

		gunModel[8].addBox(0F, -17F, 0F, 20, 8, 7, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(-23.5F, -8F, -3.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 24, 5, 5, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(71F, -8.5F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 18, 6, 5, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(4F, -19F, -2.5F);

		gunModel[11].addBox(0F, -17F, 0F, 56, 4, 3, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(-6F, 23F, -1.5F);

		gunModel[12].addBox(0F, -17F, 0F, 97, 5, 6, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(-8F, -13F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 22, 18, 8, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(-41F, -12F, -4F);

		gunModel[14].addBox(0F, -17F, 0F, 14, 3, 6, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(-40F, -13F, -3F);

		gunModel[15].addBox(0F, -17F, 0F, 40, 3, 7, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(58F, 9.5F, -3.5F);

		gunModel[16].addBox(0F, -17F, 0F, 20, 2, 5, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(-25.5F, -8F, -2.5F);
		gunModel[16].rotateAngleZ = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 10, 22, 10, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(50F, -12F, -5F);

		gunModel[18].addBox(0F, -17F, 0F, 16, 22, 4, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(13.5F, 3F, 2F);

		gunModel[19].addBox(0F, -17F, 0F, 19, 2, 2, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(-24F, -4F, -1F);

		gunModel[20].addBox(0F, -17F, 0F, 24, 14, 9, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(26F, -12F, -4.5F);

		gunModel[21].addBox(0F, -17F, 0F, 44, 10, 12, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(57F, 1F, -6F);

		gunModel[22].addBox(0F, -17F, 0F, 9, 18, 3, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(42F, 5F, -1.5F);
		gunModel[22].rotateAngleZ = -0.17453293F;

		gunModel[23].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(37F, 17F, -2.5F);
		gunModel[23].rotateAngleZ = -0.31415927F;

		gunModel[24].addBox(0F, -17F, 0F, 32, 14, 9, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(60F, -12F, -4.5F);

		gunModel[25].addBox(0F, -17F, 0F, 24, 4, 4, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(73F, -8F, -2F);

		gunModel[26].addBox(0F, -17F, 0F, 40, 7, 14, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(59F, 2F, -7F);

		gunModel[27].addBox(0F, -17F, 0F, 18, 10, 10, 0F); // Import ImportBox0
		gunModel[27].setRotationPoint(-39F, -11F, -5F);


		defaultScopeModel = new ModelRendererTurbo[4];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Import ImportBox0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Import ImportBox0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 14, 2, 1, 0F); // Import ImportBox0
		defaultScopeModel[0].setRotationPoint(102F, -24.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 9, 2, 3, 0F); // Import ImportBox0
		defaultScopeModel[1].setRotationPoint(100F, -24.5F, -1.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import ImportBox0
		defaultScopeModel[2].setRotationPoint(6F, -21F, -2.5F);

		defaultScopeModel[3].addBox(0F, -17F, 0F, 10, 2, 1, 0F); // Import ImportBox0
		defaultScopeModel[3].setRotationPoint(6F, -21F, 1.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import ImportBox0

		ammoModel[0].addBox(0F, -17F, 0F, 18, 20, 16, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(12.5F, 3F, 6F);

		ammoModel[1].addBox(0F, -17F, 0F, 16, 10, 1, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(13.5F, -7F, 24F);
		ammoModel[1].rotateAngleX = 0.52359878F;

		ammoModel[2].addBox(0F, -17F, 0F, 6, 18, 2, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(19F, -10F, 13F);
		ammoModel[2].rotateAngleX = 0.75049158F;


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import ImportBox0
		slideModel[1] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import ImportBox0
		slideModel[2] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import ImportBox0

		slideModel[0].addBox(0F, -17F, 0F, 2, 2, 14, 0F); // Import ImportBox0
		slideModel[0].setRotationPoint(10F, -6F, 1.5F);

		slideModel[1].addBox(0F, -17F, 0F, 9, 5, 5, 0F); // Import ImportBox0
		slideModel[1].setRotationPoint(9F, -7.5F, -2.5F);

		slideModel[2].addBox(0F, -17F, 0F, 14, 3, 3, 0F); // Import ImportBox0
		slideModel[2].setRotationPoint(16F, -6.5F, -1.5F);



		barrelAttachPoint = new Vector3f(96F /16F, 23F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(13F /16F, 36F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(70 /16F, 6F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}