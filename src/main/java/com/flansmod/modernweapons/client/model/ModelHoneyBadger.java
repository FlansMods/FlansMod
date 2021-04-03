//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HoneyBadger
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

public class ModelHoneyBadger extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelHoneyBadger() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[28];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-6F, 21F, -2F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 21, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-2F, 10F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-5F, 18F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 37, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, 7F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-8F, 25F, -1.5F);
		gunModel[4].rotateAngleZ = -0.17453293F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 4, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-1F, 5F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 16, 6, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(20F, 13F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 42, 12, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-4F, -5F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 29, 2, 2, 0F); // Import Box0
		gunModel[8].setRotationPoint(-32F, -2F, 0.5F);

		gunModel[9].addBox(0F, -17F, 0F, 8, 6, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(-34F, -5F, -3F);

		gunModel[10].addBox(0F, -17F, 0F, 8, 2, 5, 0F); // Import Box0
		gunModel[10].setRotationPoint(-34F, 1F, -2.5F);

		gunModel[11].addBox(0F, -17F, 0F, 8, 2, 5, 0F); // Import Box0
		gunModel[11].setRotationPoint(-34F, 3F, -2.5F);

		gunModel[12].addBox(0F, -17F, 0F, 6, 3, 5, 0F); // Import Box0
		gunModel[12].setRotationPoint(-34F, 5F, -2.5F);

		gunModel[13].addBox(0F, -17F, 0F, 5, 3, 5, 0F); // Import Box0
		gunModel[13].setRotationPoint(-34F, 8F, -2.5F);

		gunModel[14].addBox(0F, -17F, 0F, 30, 10, 10, 0F); // Import Box0
		gunModel[14].setRotationPoint(73F, -3.5F, -5F);

		gunModel[15].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[15].setRotationPoint(37F, -2.5F, 4F);

		gunModel[16].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[16].setRotationPoint(55F, -2.5F, 4F);

		gunModel[17].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(37F, -2.5F, -8F);

		gunModel[18].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[18].setRotationPoint(55F, -2.5F, -8F);

		gunModel[19].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(37F, -19.5F, 12F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[20].setRotationPoint(55F, -19.5F, 12F);
		gunModel[20].rotateAngleX = 1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[21].setRotationPoint(37F, -6.5F, 12F);
		gunModel[21].rotateAngleX = 1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 18, 10, 4, 0F); // Import Box0
		gunModel[22].setRotationPoint(55F, -6.5F, 12F);
		gunModel[22].rotateAngleX = 1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 72, 6, 5, 0F); // Import Box0
		gunModel[23].setRotationPoint(-3F, -8F, -2.5F);

		gunModel[24].addBox(0F, -17F, 0F, 16, 2, 3, 0F); // Import Box0
		gunModel[24].setRotationPoint(8F, 16F, -1.5F);

		gunModel[25].addBox(0F, -17F, 0F, 29, 2, 2, 0F); // Import Box0
		gunModel[25].setRotationPoint(-32F, -2F, -2.5F);

		gunModel[26].addBox(0F, -17F, 0F, 4, 3, 5, 0F); // Import Box0
		gunModel[26].setRotationPoint(-34F, 11F, -2.5F);

		gunModel[27].addBox(0F, -17F, 0F, 30, 8, 8, 0F); // Import Box0
		gunModel[27].setRotationPoint(84F, -2.5F, -4F);


		defaultScopeModel = new ModelRendererTurbo[5];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 34
		defaultScopeModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 34
		defaultScopeModel[3] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 34
		defaultScopeModel[4] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 34

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(0F, -28F, 1F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[1].setRotationPoint(0F, -28F, -2F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[2].setRotationPoint(66F, -29F, -0.5F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		defaultScopeModel[3].setRotationPoint(-1.5F, -25F, -2.5F);
		defaultScopeModel[3].rotateAngleX = 1.57079633F;

		defaultScopeModel[4].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		defaultScopeModel[4].setRotationPoint(64.5F, -25F, -2.5F);
		defaultScopeModel[4].rotateAngleX = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 10, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(23.5F, 18F, -2F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 12, 11, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(24.5F, 28F, -2F);
		ammoModel[1].rotateAngleZ = 0.08726646F;


		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 17, 3, 2, 0F); // Import Box0
		slideModel[0].setRotationPoint(-10F, -18.5F, 15.5F);
		slideModel[0].rotateAngleX = 1.57079633F;

		slideModel[1].addBox(0F, -17F, 0F, 7, 3, 3, 0F); // Import Box0
		slideModel[1].setRotationPoint(6F, -18.5F, 3.5F);
		slideModel[1].rotateAngleX = 1.57079633F;
		slideModel[1].rotateAngleY = -1.57079633F;

		slideModel[2].addBox(0F, -17F, 0F, 22, 2, 7, 0F); // Import Box0
		slideModel[2].setRotationPoint(10F, 0F, -4.5F);

		slideModel[3].addBox(0F, -17F, 0F, 3, 5, 7, 0F); // Import Box0
		slideModel[3].setRotationPoint(9.5F, -1.5F, -6F);



		barrelAttachPoint = new Vector3f(99F /16F, 15F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(51F /16F, 15F /16F, 7F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 24F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(64 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}