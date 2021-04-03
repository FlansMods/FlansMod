//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KCASmartcarbine
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

public class ModelKCASmartcarbine extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelKCASmartcarbine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[24];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-5F, 17F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-2F, 6F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-4F, 15F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 37, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, 2F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-6F, 22F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 7, 7, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-6F, 1F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 15, 6, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(21F, 8F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 42, 10, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-4F, -8F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 58, 8, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-51F, -7F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 60, 4, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(42F, -5.5F, -2F);

		gunModel[10].addBox(0F, -17F, 0F, 46, 8, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(38F, -7.5F, -3F);

		gunModel[11].addBox(0F, -17F, 0F, 46, 8, 2, 0F); // Import Box0
		gunModel[11].setRotationPoint(38F, -7.5F, 1F);

		gunModel[12].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(37F, -7.5F, 3F);

		gunModel[13].addBox(0F, -17F, 0F, 28, 8, 2, 0F); // Import Box0
		gunModel[13].setRotationPoint(56F, -7.5F, 3F);

		gunModel[14].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(37F, -7.5F, -5F);

		gunModel[15].addBox(0F, -17F, 0F, 28, 8, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(56F, -7.5F, -5F);

		gunModel[16].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(37F, -24.5F, 13F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 28, 8, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(56F, -24.5F, 13F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 18, 8, 4, 0F); // Import Box0
		gunModel[18].setRotationPoint(37F, -12.5F, 13F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 28, 8, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(56F, -13.5F, 13F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 56, 5, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(-5F, -12F, -2.5F);

		gunModel[21].addBox(0F, -17F, 0F, 16, 2, 3, 0F); // Import Box0
		gunModel[21].setRotationPoint(8F, 11F, -1.5F);

		gunModel[22].addBox(0F, -17F, 0F, 43, 14, 4, 0F); // Import Box0
		gunModel[22].setRotationPoint(-47F, -1F, -2F);
		gunModel[22].rotateAngleZ = 0.10471976F;

		gunModel[23].addBox(0F, -17F, 0F, 5, 22, 7, 0F); // Import Box0
		gunModel[23].setRotationPoint(-52F, -8F, -3.5F);


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 21, 4, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(76F, -8.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.48869219F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 13, 4, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(102F, -20.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(102F, -28.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(102.5F, -32.5F, 0.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(102.5F, -32.5F, -1.75F);
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
		ammoModel[0] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 14, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(24.5F, 13F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 11, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(27.5F, 26F, -2F);
		ammoModel[1].rotateAngleZ = 0.15707963F;


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 17, 3, 2, 0F); // Import Box0
		slideModel[0].setRotationPoint(-8F, -23.5F, 15.5F);
		slideModel[0].rotateAngleX = 1.57079633F;

		slideModel[1].addBox(0F, -17F, 0F, 7, 3, 3, 0F); // Import Box0
		slideModel[1].setRotationPoint(7F, -23.5F, 3.5F);
		slideModel[1].rotateAngleX = 1.57079633F;
		slideModel[1].rotateAngleY = -1.57079633F;

		slideModel[2].addBox(0F, -17F, 0F, 22, 3, 7, 0F); // Import Box0
		slideModel[2].setRotationPoint(14F, -5F, -4.5F);



		barrelAttachPoint = new Vector3f(98F /16F, 20F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(50 /16F, 14F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}