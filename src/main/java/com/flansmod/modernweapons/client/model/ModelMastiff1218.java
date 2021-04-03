//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mastiff1218
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

public class ModelMastiff1218 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelMastiff1218() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[21];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 18, 6, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-24F, 25F, -2F);

		gunModel[1].addBox(0F, -17F, 0F, 9, 21, 4, 0F); // Import Box0
		gunModel[1].setRotationPoint(-29F, 1F, -2F);
		gunModel[1].rotateAngleZ = -0.41887902F;

		gunModel[2].addBox(0F, -17F, 0F, 37, 6, 7, 0F); // Import Box0
		gunModel[2].setRotationPoint(0F, 3F, -3.5F);

		gunModel[3].addBox(0F, -17F, 0F, 26, 9, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-47F, 15F, -2.5F);
		gunModel[3].rotateAngleZ = -0.31415927F;

		gunModel[4].addBox(0F, -17F, 0F, 13, 6, 9, 0F); // Import Box0
		gunModel[4].setRotationPoint(-8F, 9F, -4.5F);

		gunModel[5].addBox(0F, -17F, 0F, 84, 10, 7, 0F); // Import Box0
		gunModel[5].setRotationPoint(-44F, -7F, -3.5F);

		gunModel[6].addBox(0F, -17F, 0F, 84, 6, 2, 0F); // Import Box0
		gunModel[6].setRotationPoint(32F, -25.5F, 14F);
		gunModel[6].rotateAngleX = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 34, 9, 5, 0F); // Import Box0
		gunModel[7].setRotationPoint(82F, -12.5F, 12.5F);
		gunModel[7].rotateAngleX = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 61, 3, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(-24F, -9F, -2.5F);

		gunModel[9].addBox(0F, -17F, 0F, 24, 4, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(4F, 16F, -1.5F);
		gunModel[9].rotateAngleZ = 1.22173048F;

		gunModel[10].addBox(0F, -17F, 0F, 7, 20, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(-68F, -7F, -3.5F);

		gunModel[11].addBox(0F, -17F, 0F, 6, 22, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(-44F, 2F, -1.5F);

		gunModel[12].addBox(0F, -17F, 0F, 48, 6, 9, 0F); // Import Box0
		gunModel[12].setRotationPoint(-46F, 3F, -4.5F);

		gunModel[13].addBox(0F, -17F, 0F, 17, 23, 8, 0F); // Import Box0
		gunModel[13].setRotationPoint(-59F, -9F, -4F);

		gunModel[14].addBox(0F, -17F, 0F, 48, 6, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(36F, -5.5F, 3F);

		gunModel[15].addBox(0F, -17F, 0F, 48, 6, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(36F, -5.5F, -5F);

		gunModel[16].addBox(0F, -17F, 0F, 48, 8, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(36F, -22.5F, 13F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 48, 8, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(36F, -12.5F, 13F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 13, 10, 9, 0F); // Import Box0
		gunModel[18].setRotationPoint(-65F, -2F, -4.5F);

		gunModel[19].addBox(0F, -17F, 0F, 82, 5, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(38F, -18.5F, 14.5F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 34, 11, 10, 0F); // Import Box0
		gunModel[20].setRotationPoint(23F, -10.5F, 11.5F);
		gunModel[20].rotateAngleX = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[5];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 8, 12, 2, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(-2F, -24.5F, -1F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 14, 2, 7, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(-21F, -15.5F, -3.5F);
		defaultScopeModel[1].rotateAngleZ = -0.06981317F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 16, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(-4F, -31.5F, -4F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 5, 16, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(-4F, -31.5F, 3F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 5, 2, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(0F, -30.5F, -0.5F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 16, 5, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(12F, 2F, -2.5F);


		pumpModel = new ModelRendererTurbo[3];
		pumpModel[0] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		pumpModel[2] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box0

		pumpModel[0].addBox(0F, -17F, 0F, 18, 8, 4, 0F); // Import Box0
		pumpModel[0].setRotationPoint(84F, -6.5F, 2F);

		pumpModel[1].addBox(0F, -17F, 0F, 18, 8, 4, 0F); // Import Box0
		pumpModel[1].setRotationPoint(84F, -6.5F, -6F);

		pumpModel[2].addBox(0F, -17F, 0F, 34, 11, 10, 0F); // Import Box0
		pumpModel[2].setRotationPoint(62F, -8.5F, 11.5F);
		pumpModel[2].rotateAngleX = 1.57079633F;



		barrelAttachPoint = new Vector3f(119F /16F, 22F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(12F /16F, 21F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(-13F /16F, 25F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(44 /16F, 12F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.SHOTGUN;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}