//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AUG
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

public class ModelAUG extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelAUG() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[17];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 24, 12, 9, 0F); // Import Box0
		gunModel[0].setRotationPoint(0F, -9F, -4.5F);

		gunModel[1].addBox(0F, -17F, 0F, 27, 8, 9, 0F); // Import Box0
		gunModel[1].setRotationPoint(-25F, 0.5F, -4.5F);
		gunModel[1].rotateAngleZ = 1.57079633F;

		gunModel[2].addBox(0F, -17F, 0F, 76, 3, 3, 0F); // Import Box0
		gunModel[2].setRotationPoint(4F, -4.5F, -1.5F);

		gunModel[3].addBox(0F, -17F, 0F, 27, 4, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-27F, 1.1F, -3.5F);
		gunModel[3].rotateAngleZ = 1.57079633F;

		gunModel[4].addBox(0F, -17F, 0F, 18, 12, 8, 0F); // Import Box0
		gunModel[4].setRotationPoint(24F, -9F, -4F);

		gunModel[5].addBox(0F, -17F, 0F, 22, 9, 18, 0F); // Import Box0
		gunModel[5].setRotationPoint(-22F, -8.5F, 12.5F);
		gunModel[5].rotateAngleX = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 54, 10, 12, 0F); // Import Box0
		gunModel[6].setRotationPoint(-9F, -11.5F, 12F);
		gunModel[6].rotateAngleX = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 34, 4, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(28F, 1F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 23, 6, 9, 0F); // Import Box0
		gunModel[8].setRotationPoint(-17F, -3.5F, -4.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 4, 18, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(5F, 3F, -2.5F);
		gunModel[9].rotateAngleZ = -0.17453293F;

		gunModel[10].addBox(0F, -17F, 0F, 12, 2, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(6F, 20F, -2F);

		gunModel[11].addBox(0F, -17F, 0F, 20, 2, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(32F, 9F, -1.5F);
		gunModel[11].rotateAngleZ = 1.22173048F;

		gunModel[12].addBox(0F, -17F, 0F, 20, 6, 6, 0F); // Import Box0
		gunModel[12].setRotationPoint(38F, -6F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 20, 6, 9, 0F); // Import Box0
		gunModel[13].setRotationPoint(-11F, -6.5F, -4.5F);
		gunModel[13].rotateAngleZ = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 44, 6, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(4F, -12F, -3F);

		gunModel[15].addBox(0F, -17F, 0F, 4, 6, 3, 0F); // Import Box0
		gunModel[15].setRotationPoint(2F, 14F, -1.5F);
		gunModel[15].rotateAngleZ = -0.17453293F;

		gunModel[16].addBox(0F, -17F, 0F, 10, 6, 3, 0F); // Import Box0
		gunModel[16].setRotationPoint(1F, 2F, -1.5F);
		gunModel[16].rotateAngleZ = 0.13962634F;


		defaultScopeModel = new ModelRendererTurbo[7];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 7, 2, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(56F, -24.5F, -1.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(58F, -28.5F, -1.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(58.5F, -32.5F, 0.75F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(58.5F, -32.5F, -1.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(22F, -28.5F, -2F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(22.5F, -28.5F, 1.75F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(22.5F, -28.5F, -2.75F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 11, 10, 6, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-17.5F, 8F, -3F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 10, 16, 5, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-15.5F, 10F, -2.5F);
		ammoModel[1].rotateAngleZ = 0.17453293F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 16, 4, 3, 0F); // Import Box0
		slideModel[0].setRotationPoint(-14F, -2F, -6.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 3, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(-13F, -1.5F, -10F);



		barrelAttachPoint = new Vector3f(78F /16F, 20F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(7F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(36 /16F, 12F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.RIFLE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}