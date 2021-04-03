//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M14
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

public class ModelM14 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelM14() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[29];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 10, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-9F, 14F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-6F, 2F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 14, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-8F, 7F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 43, 6, 6, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, 2F, -3F);

		gunModel[4].addBox(0F, -17F, 0F, 11, 8, 5, 0F); // Import Box0
		gunModel[4].setRotationPoint(-10F, 16F, -2.5F);
		gunModel[4].rotateAngleZ = -0.19198622F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 6, 9, 0F); // Import Box0
		gunModel[5].setRotationPoint(17F, 8F, -4.5F);

		gunModel[6].addBox(0F, -17F, 0F, 42, 12, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-4F, -8F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 28, 6, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(-51F, -4F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 20, 9, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(-38F, 6F, -2F);
		gunModel[8].rotateAngleZ = 1.18682389F;

		gunModel[9].addBox(0F, -17F, 0F, 19, 6, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(-34F, 4F, -2.5F);
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 82, 4, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(38F, -7.5F, -2F);

		gunModel[11].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(35F, -7.5F, 2.5F);

		gunModel[12].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(59F, -7.5F, 3F);

		gunModel[13].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(35F, -7.5F, -5.5F);

		gunModel[14].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(59F, -7.5F, -5F);

		gunModel[15].addBox(0F, -17F, 0F, 24, 8, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(35F, -24.5F, 13F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 22, 8, 10, 0F); // Import Box0
		gunModel[16].setRotationPoint(59F, -15.5F, 13F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 22, 9, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(34F, -12.5F, 12.5F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(59F, -14.5F, 13F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 20, 6, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(-3F, -12F, -2.5F);

		gunModel[20].addBox(0F, -17F, 0F, 16, 1, 3, 0F); // Import Box0
		gunModel[20].setRotationPoint(3F, 13F, -1.5F);

		gunModel[21].addBox(0F, -17F, 0F, 66, 3, 3, 0F); // Import Box0
		gunModel[21].setRotationPoint(50F, -2F, -1.5F);

		gunModel[22].addBox(0F, -17F, 0F, 4, 14, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(107F, -12.5F, -2.5F);

		gunModel[23].addBox(0F, -17F, 0F, 40, 5, 5, 0F); // Import Box0
		gunModel[23].setRotationPoint(29F, -12F, -2.5F);

		gunModel[24].addBox(0F, -17F, 0F, 22, 4, 6, 0F); // Import Box0
		gunModel[24].setRotationPoint(-44F, -12F, -3F);

		gunModel[25].addBox(0F, -17F, 0F, 25, 4, 6, 0F); // Import Box0
		gunModel[25].setRotationPoint(-37F, 5F, -3F);
		gunModel[25].rotateAngleZ = 1.57079633F;

		gunModel[26].addBox(0F, -17F, 0F, 20, 3, 4, 0F); // Import Box0
		gunModel[26].setRotationPoint(-43F, -13F, -2F);

		gunModel[27].addBox(0F, -17F, 0F, 10, 4, 5, 0F); // Import Box0
		gunModel[27].setRotationPoint(-26F, -18F, -2.5F);
		gunModel[27].rotateAngleZ = 1.57079633F;

		gunModel[28].addBox(0F, -17F, 0F, 32, 4, 4, 0F); // Import Box0
		gunModel[28].setRotationPoint(-34F, -3F, -2F);


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Import Box0

		defaultBarrelModel[0].addBox(0F, -17F, 0F, 13, 5, 5, 0F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(112F, -8F, -2.5F);


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(125F, -28.5F, -1.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(125.5F, -32.5F, 0.75F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(125.5F, -32.5F, -1.75F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(15F, -28.5F, -2F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(15.5F, -28.5F, 1.75F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(15.5F, -28.5F, -2.75F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 13, 20, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(28.5F, 7F, -2F);
		ammoModel[0].rotateAngleZ = 0.15707963F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(6F, -6F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 3, 6, 6, 0F); // Import Box0
		slideModel[1].setRotationPoint(5F, -7F, -6.5F);



		barrelAttachPoint = new Vector3f(112F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(66F /16F, 21F /16F, 5F /16F);

		scopeAttachPoint = new Vector3f(4F /16F, 28F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(48 /16F, 14F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}