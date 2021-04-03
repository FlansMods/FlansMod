//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TripleTake
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

public class ModelTripleTake extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelTripleTake() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 9, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-7F, 15F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-2F, 4F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 37, 6, 7, 0F); // Import Box0
		gunModel[2].setRotationPoint(0F, 3F, -3.5F);

		gunModel[3].addBox(0F, -17F, 0F, 16, 7, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-8F, 20F, -2.5F);

		gunModel[4].addBox(0F, -17F, 0F, 13, 8, 9, 0F); // Import Box0
		gunModel[4].setRotationPoint(18F, 9F, -4.5F);

		gunModel[5].addBox(0F, -17F, 0F, 84, 10, 9, 0F); // Import Box0
		gunModel[5].setRotationPoint(-44F, -7F, -4.5F);

		gunModel[6].addBox(0F, -17F, 0F, 46, 4, 6, 0F); // Import Box0
		gunModel[6].setRotationPoint(-77F, -4F, -3F);

		gunModel[7].addBox(0F, -17F, 0F, 106, 2, 2, 0F); // Import Box0
		gunModel[7].setRotationPoint(38F, -2.5F, -2.5F);

		gunModel[8].addBox(0F, -17F, 0F, 18, 6, 2, 0F); // Import Box0
		gunModel[8].setRotationPoint(124F, -5.5F, 3F);

		gunModel[9].addBox(0F, -17F, 0F, 18, 6, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(124F, -5.5F, -5F);

		gunModel[10].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(124F, -22.5F, 13F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[11].setRotationPoint(124F, -14.5F, 13F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 61, 3, 5, 0F); // Import Box0
		gunModel[12].setRotationPoint(-24F, -9F, -2.5F);

		gunModel[13].addBox(0F, -17F, 0F, 11, 2, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(7F, 14F, -1.5F);

		gunModel[14].addBox(0F, -17F, 0F, 3, 3, 5, 0F); // Import Box0
		gunModel[14].setRotationPoint(1F, -4F, -5.5F);
		gunModel[14].rotateAngleY = -0.73303829F;

		gunModel[15].addBox(0F, -17F, 0F, 43, 5, 4, 0F); // Import Box0
		gunModel[15].setRotationPoint(-73F, 6F, -2F);

		gunModel[16].addBox(0F, -17F, 0F, 5, 5, 6, 0F); // Import Box0
		gunModel[16].setRotationPoint(1F, -5F, -4.5F);
		gunModel[16].rotateAngleY = -0.73303829F;

		gunModel[17].addBox(0F, -17F, 0F, 7, 20, 7, 0F); // Import Box0
		gunModel[17].setRotationPoint(-79F, -7F, -3.5F);

		gunModel[18].addBox(0F, -17F, 0F, 9, 23, 3, 0F); // Import Box0
		gunModel[18].setRotationPoint(-10F, 1F, -1.5F);
		gunModel[18].rotateAngleZ = 0.52359878F;

		gunModel[19].addBox(0F, -17F, 0F, 48, 6, 9, 0F); // Import Box0
		gunModel[19].setRotationPoint(-46F, 3F, -4.5F);

		gunModel[20].addBox(0F, -17F, 0F, 17, 10, 8, 0F); // Import Box0
		gunModel[20].setRotationPoint(-61F, -9F, -4F);

		gunModel[21].addBox(0F, -17F, 0F, 21, 20, 7, 0F); // Import Box0
		gunModel[21].setRotationPoint(-67F, -7F, -3.5F);

		gunModel[22].addBox(0F, -17F, 0F, 3, 3, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(-7F, -4F, -5.5F);
		gunModel[22].rotateAngleY = -0.73303829F;

		gunModel[23].addBox(0F, -17F, 0F, 5, 5, 6, 0F); // Import Box0
		gunModel[23].setRotationPoint(-7F, -5F, -4.5F);
		gunModel[23].rotateAngleY = -0.73303829F;

		gunModel[24].addBox(0F, -17F, 0F, 3, 3, 5, 0F); // Import Box0
		gunModel[24].setRotationPoint(-15F, -4F, -5.5F);
		gunModel[24].rotateAngleY = -0.73303829F;

		gunModel[25].addBox(0F, -17F, 0F, 5, 5, 6, 0F); // Import Box0
		gunModel[25].setRotationPoint(-15F, -5F, -4.5F);
		gunModel[25].rotateAngleY = -0.73303829F;

		gunModel[26].addBox(0F, -17F, 0F, 3, 3, 5, 0F); // Import Box0
		gunModel[26].setRotationPoint(-23F, -4F, -5.5F);
		gunModel[26].rotateAngleY = -0.73303829F;

		gunModel[27].addBox(0F, -17F, 0F, 5, 5, 6, 0F); // Import Box0
		gunModel[27].setRotationPoint(-23F, -5F, -4.5F);
		gunModel[27].rotateAngleY = -0.73303829F;

		gunModel[28].addBox(0F, -17F, 0F, 106, 2, 2, 0F); // Import Box0
		gunModel[28].setRotationPoint(38F, -2.5F, 0.5F);

		gunModel[29].addBox(0F, -17F, 0F, 106, 2, 2, 0F); // Import Box0
		gunModel[29].setRotationPoint(38F, -5.5F, -1F);

		gunModel[30].addBox(0F, -17F, 0F, 32, 6, 2, 0F); // Import Box0
		gunModel[30].setRotationPoint(36F, -5.5F, 3F);

		gunModel[31].addBox(0F, -17F, 0F, 32, 6, 2, 0F); // Import Box0
		gunModel[31].setRotationPoint(36F, -5.5F, -5F);

		gunModel[32].addBox(0F, -17F, 0F, 32, 8, 2, 0F); // Import Box0
		gunModel[32].setRotationPoint(36F, -22.5F, 13F);
		gunModel[32].rotateAngleX = 1.57079633F;

		gunModel[33].addBox(0F, -17F, 0F, 32, 8, 4, 0F); // Import Box0
		gunModel[33].setRotationPoint(36F, -12.5F, 13F);
		gunModel[33].rotateAngleX = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[5];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 6, 10, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(-2F, -24F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 16, 2, 11, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(-23F, -14F, -5.5F);
		defaultScopeModel[1].rotateAngleZ = -0.03490659F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 14, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(-5F, -29F, -6F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 5, 14, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(-5F, -29F, 5F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 16, 4, 11, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(-23F, -18F, -5.5F);
		defaultScopeModel[4].rotateAngleZ = -0.03490659F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 16, 36, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-24.5F, 5F, -2F);
		ammoModel[0].rotateAngleZ = 0.52359878F;



		barrelAttachPoint = new Vector3f(109F /16F, 28F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(12F /16F, 21F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(-13F /16F, 25F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(46 /16F, 13F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.RIFLE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}