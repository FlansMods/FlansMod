//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ColdWarE2
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

public class ModelColdWarE2 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelColdWarE2() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[30];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(6F, 12F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(9F, 0F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(6F, 5F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 20, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-6F, 15F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(6F, 4F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 12, 8, 7, 0F); // Import Box0
		gunModel[5].setRotationPoint(22F, 3F, -3.5F);

		gunModel[6].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-11F, -8F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 26, 13, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(-37F, -7F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 16, 10, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-20F, 4F, -3.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 50, 9, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(34F, -6.5F, 12.5F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 5, 1, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(17F, 8F, -1.5F);

		gunModel[11].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(58F, -25.5F, -1.5F);
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 30, 6, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(-26F, 4.5F, -3.5F);
		gunModel[12].rotateAngleZ = 1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 50, 9, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(34F, -17.5F, 12.5F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 47, 14, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(35F, -5F, -3.5F);

		gunModel[15].addBox(0F, -17F, 0F, 42, 11, 11, 0F); // Import Box0
		gunModel[15].setRotationPoint(-39F, -10.5F, 11.5F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 16, 9, 6, 0F); // Import Box0
		gunModel[16].setRotationPoint(-38F, -20.5F, 12.5F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 16, 10, 7, 0F); // Import Box0
		gunModel[17].setRotationPoint(9F, 4F, -3.5F);
		gunModel[17].rotateAngleZ = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 46, 7, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(35F, -25.5F, 13.5F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 46, 7, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(34F, -4.5F, 13.5F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 12, 7, 2, 0F); // Import Box0
		gunModel[20].setRotationPoint(35F, -23.5F, 13.5F);
		gunModel[20].rotateAngleX = 1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 10, 7, 2, 0F); // Import Box0
		gunModel[21].setRotationPoint(73F, -23.5F, 13.5F);
		gunModel[21].rotateAngleX = 1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 2, 3, 2, 0F); // Import Box0
		gunModel[22].setRotationPoint(70F, -23.5F, 15.5F);
		gunModel[22].rotateAngleX = 1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 2, 3, 2, 0F); // Import Box0
		gunModel[23].setRotationPoint(67F, -23.5F, 15.5F);
		gunModel[23].rotateAngleX = 1.57079633F;

		gunModel[24].addBox(0F, -17F, 0F, 2, 3, 2, 0F); // Import Box0
		gunModel[24].setRotationPoint(64F, -23.5F, 15.5F);
		gunModel[24].rotateAngleX = 1.57079633F;

		gunModel[25].addBox(0F, -17F, 0F, 2, 3, 2, 0F); // Import Box0
		gunModel[25].setRotationPoint(61F, -23.5F, 15.5F);
		gunModel[25].rotateAngleX = 1.57079633F;

		gunModel[26].addBox(0F, -17F, 0F, 2, 3, 2, 0F); // Import Box0
		gunModel[26].setRotationPoint(58F, -23.5F, 15.5F);
		gunModel[26].rotateAngleX = 1.57079633F;

		gunModel[27].addBox(0F, -17F, 0F, 2, 3, 2, 0F); // Import Box0
		gunModel[27].setRotationPoint(55F, -23.5F, 15.5F);
		gunModel[27].rotateAngleX = 1.57079633F;

		gunModel[28].addBox(0F, -17F, 0F, 2, 3, 2, 0F); // Import Box0
		gunModel[28].setRotationPoint(52F, -23.5F, 15.5F);
		gunModel[28].rotateAngleX = 1.57079633F;

		gunModel[29].addBox(0F, -17F, 0F, 2, 3, 2, 0F); // Import Box0
		gunModel[29].setRotationPoint(49F, -23.5F, 15.5F);
		gunModel[29].rotateAngleX = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 10, 10, 5, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(20F, -25F, -2.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 17, 2, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(57F, -25.5F, -0.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 4, 4, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(5F, -24F, -1.5F);

		defaultScopeModel[3].addBox(0F, -17F, 0F, 4, 4, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(5F, -24F, 0.5F);

		defaultScopeModel[4].addBox(0F, -17F, 0F, 38, 2, 5, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(3F, -20F, -2.5F);

		defaultScopeModel[5].addBox(0F, -17F, 0F, 10, 4, 5, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(54F, -25F, -2.5F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 36, 1, 4, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(4F, -21F, -2F);

		defaultScopeModel[7].addBox(0F, -17F, 0F, 4, 4, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(14F, -24F, -1.5F);

		defaultScopeModel[8].addBox(0F, -17F, 0F, 4, 4, 1, 0F); // Import Box0
		defaultScopeModel[8].setRotationPoint(14F, -24F, 0.5F);

		defaultScopeModel[9].addBox(0F, -17F, 0F, 9, 8, 4, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(19F, -25F, -2F);
		defaultScopeModel[9].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 22, 20, 16, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-28F, 0F, -8F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 2, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(-20F, -3F, -6.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 1, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(-2F, -2.5F, -10.5F);



		barrelAttachPoint = new Vector3f(82F /16F, 15F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 38F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(25F /16F, 38F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(40 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}