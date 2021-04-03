//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FNSCAR
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

public class ModelFNSCAR extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelFNSCAR() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[24];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-2F, 13F, -2F);
		gunModel[0].rotateAngleZ = -0.15707963F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(1F, 2F, -1.5F);
		gunModel[1].rotateAngleZ = -0.15707963F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-1F, 10F, -1F);
		gunModel[2].rotateAngleZ = -0.15707963F;

		gunModel[3].addBox(0F, -17F, 0F, 28, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-4F, 0F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 2, 0F); // Import Box0
		gunModel[4].setRotationPoint(-3F, 17F, -1F);
		gunModel[4].rotateAngleZ = -0.15707963F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 8, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(18F, 5F, -2.5F);

		gunModel[6].addBox(0F, -17F, 0F, 46, 11, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(-4F, -11F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 40, 4, 8, 0F); // Import Box0
		gunModel[7].setRotationPoint(-41F, -7.5F, -4F);
		gunModel[7].rotateAngleZ = 0.06981317F;

		gunModel[8].addBox(0F, -17F, 0F, 40, 4, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(70F, -6F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 38, 7, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(42F, -7.5F, 3F);

		gunModel[10].addBox(0F, -17F, 0F, 38, 7, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(42F, -7.5F, -5F);

		gunModel[11].addBox(0F, -17F, 0F, 38, 7, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(42F, -14.5F, 13F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 38, 9, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(-42F, -7.25F, -3.5F);

		gunModel[13].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(11F, 10F, -1.5F);

		gunModel[14].addBox(0F, -17F, 0F, 40, 4, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(-38F, 1.75F, -3F);

		gunModel[15].addBox(0F, -17F, 0F, 8, 22, 9, 0F); // Import Box0
		gunModel[15].setRotationPoint(-44F, -7F, -4.5F);

		gunModel[16].addBox(0F, -17F, 0F, 14, 2, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(77F, -8.5F, -1F);

		gunModel[17].addBox(0F, -17F, 0F, 34, 3, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(42F, -10.5F, 3F);

		gunModel[18].addBox(0F, -17F, 0F, 34, 3, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(42F, -10.5F, -5F);

		gunModel[19].addBox(0F, -17F, 0F, 38, 8, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(42F, -24F, 13F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 2, 9, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(81F, -9.5F, -2.5F);

		gunModel[21].addBox(0F, -17F, 0F, 2, 14, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(79F, -11.5F, -2.5F);

		gunModel[22].addBox(0F, -17F, 0F, 20, 12, 6, 0F); // Import Box0
		gunModel[22].setRotationPoint(22F, 0F, -3F);

		gunModel[23].addBox(0F, -17F, 0F, 4, 18, 9, 0F); // Import Box0
		gunModel[23].setRotationPoint(-36F, -7F, -4.5F);


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 20, 4, 7, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(-1F, -12.5F, -3.5F);

		defaultScopeModel[1].addBox(0F, -17F, 0F, 1, 5, 3, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(78.5F, -12.5F, 0.5F);
		defaultScopeModel[1].rotateAngleY = -1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(96F, -28.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(96.5F, -32.5F, 0.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(96.5F, -32.5F, -1.75F);
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
		ammoModel[0] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 14, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(26.5F, 9F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.15707963F;

		ammoModel[1].addBox(0F, -17F, 0F, 14, 14, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(29.5F, 22.25F, -2F);
		ammoModel[1].rotateAngleZ = 0.20943951F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 5, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(12F, -7F, -5.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(13F, -6F, -8.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(108F /16F, 21F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 28F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(66 /16F, 15F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}