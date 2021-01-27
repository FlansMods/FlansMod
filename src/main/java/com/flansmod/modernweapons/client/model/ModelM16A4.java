//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M16A4
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

public class ModelM16A4 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelM16A4() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[27];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-6F, 22F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-3F, 11F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-5F, 19F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 37, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-1F, 6F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-7F, 27F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 7, 6, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-7F, 4F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 13, 6, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(21F, 12F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 42, 10, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-5F, -4F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 58, 8, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-52F, -3F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 74, 4, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(37F, -1.5F, -2F);

		gunModel[10].addBox(0F, -17F, 0F, 46, 8, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(37F, -3.5F, -3F);

		gunModel[11].addBox(0F, -17F, 0F, 46, 8, 2, 0F); // Import Box0
		gunModel[11].setRotationPoint(37F, -3.5F, 1F);

		gunModel[12].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(43F, -3.5F, 3F);

		gunModel[13].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[13].setRotationPoint(62F, -3.5F, 3F);

		gunModel[14].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[14].setRotationPoint(43F, -3.5F, -5F);

		gunModel[15].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(62F, -3.5F, -5F);

		gunModel[16].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(43F, -20.5F, 13F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(62F, -20.5F, 13F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(43F, -10.5F, 13F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 18, 8, 2, 0F); // Import Box0
		gunModel[19].setRotationPoint(62F, -10.5F, 13F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 40, 3, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(-4F, -7F, -2.5F);

		gunModel[21].addBox(0F, -17F, 0F, 16, 2, 3, 0F); // Import Box0
		gunModel[21].setRotationPoint(7F, 15F, -1.5F);

		gunModel[22].addBox(0F, -17F, 0F, 22, 5, 7, 0F); // Import Box0
		gunModel[22].setRotationPoint(5F, -2F, -4.5F);

		gunModel[23].addBox(0F, -17F, 0F, 3, 3, 5, 0F); // Import Box0
		gunModel[23].setRotationPoint(0F, -1F, -5.5F);
		gunModel[23].rotateAngleY = -0.73303829F;

		gunModel[24].addBox(0F, -17F, 0F, 43, 14, 4, 0F); // Import Box0
		gunModel[24].setRotationPoint(-48F, 1F, -2F);
		gunModel[24].rotateAngleZ = 0.10471976F;

		gunModel[25].addBox(0F, -17F, 0F, 5, 5, 6, 0F); // Import Box0
		gunModel[25].setRotationPoint(0F, -2F, -4.5F);
		gunModel[25].rotateAngleY = -0.73303829F;

		gunModel[26].addBox(0F, -17F, 0F, 7, 20, 7, 0F); // Import Box0
		gunModel[26].setRotationPoint(-54F, -4F, -3.5F);


		defaultScopeModel = new ModelRendererTurbo[11];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		defaultScopeModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 21, 4, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(82F, -4.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.48869219F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 13, 4, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(108F, -16.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 13, 3, 2, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(49F, -16.5F, -1F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 15, 5, 2, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(15F, -16.5F, -1F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 37, 2, 3, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(-3F, -15.5F, -1.5F);
		defaultScopeModel[4].rotateAngleZ = -0.06981317F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(109F, -28.5F, -1.5F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(109.5F, -32.5F, 0.75F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(109.5F, -32.5F, -1.75F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;

		defaultScopeModel[8].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		defaultScopeModel[8].setRotationPoint(15F, -28.5F, -2F);
		defaultScopeModel[8].rotateAngleZ = 1.57079633F;

		defaultScopeModel[9].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(15.5F, -28.5F, 1.75F);
		defaultScopeModel[9].rotateAngleZ = 1.57079633F;

		defaultScopeModel[10].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[10].setRotationPoint(15.5F, -28.5F, -2.75F);
		defaultScopeModel[10].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 14, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(22.5F, 17F, -2F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 13, 11, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(24.5F, 30F, -2F);
		ammoModel[1].rotateAngleZ = 0.15707963F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 17, 3, 2, 0F); // Import Box0
		slideModel[0].setRotationPoint(-9F, -19.5F, 15.5F);
		slideModel[0].rotateAngleX = 1.57079633F;

		slideModel[1].addBox(0F, -17F, 0F, 9, 3, 2, 0F); // Import Box0
		slideModel[1].setRotationPoint(6F, -20.5F, 4.5F);
		slideModel[1].rotateAngleX = 1.57079633F;
		slideModel[1].rotateAngleY = -1.57079633F;



		barrelAttachPoint = new Vector3f(109F /16F, 17F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(1F /16F, 25F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(55 /16F, 11F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}