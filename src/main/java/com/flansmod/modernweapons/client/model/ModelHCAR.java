//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HCAR
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

public class ModelHCAR extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelHCAR() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[30];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-4F, 17F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-1F, 5F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-3F, 10F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 40, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, 1F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import Box0
		gunModel[4].setRotationPoint(-5F, 21F, -2.5F);
		gunModel[4].rotateAngleZ = -0.19198622F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 4, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-3F, 1F, -1.5F);
		gunModel[5].rotateAngleZ = -0.05235988F;

		gunModel[6].addBox(0F, -17F, 0F, 4, 6, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(22F, 7F, -4.5F);

		gunModel[7].addBox(0F, -17F, 0F, 42, 10, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-4F, -9F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 58, 8, 6, 0F); // Import Box0
		gunModel[8].setRotationPoint(-61F, -9F, -3F);

		gunModel[9].addBox(0F, -17F, 0F, 42, 8, 4, 0F); // Import Box0
		gunModel[9].setRotationPoint(-53F, 9F, -2F);
		gunModel[9].rotateAngleZ = 0.4712389F;

		gunModel[10].addBox(0F, -17F, 0F, 19, 6, 5, 0F); // Import Box0
		gunModel[10].setRotationPoint(-44F, 1F, -2.5F);
		gunModel[10].rotateAngleZ = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 80, 4, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(38F, -8.5F, -2F);

		gunModel[12].addBox(0F, -17F, 0F, 35, 8, 2, 0F); // Import Box0
		gunModel[12].setRotationPoint(38F, -8.5F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 35, 8, 2, 0F); // Import Box0
		gunModel[13].setRotationPoint(38F, -8.5F, 1F);

		gunModel[14].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[14].setRotationPoint(35F, -8.5F, 2.5F);

		gunModel[15].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(59F, -8.5F, 3F);

		gunModel[16].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[16].setRotationPoint(35F, -8.5F, -5.5F);

		gunModel[17].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(59F, -8.5F, -5F);

		gunModel[18].addBox(0F, -17F, 0F, 24, 8, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(35F, -25.5F, 13F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[19].setRotationPoint(59F, -25.5F, 13F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 22, 9, 4, 0F); // Import Box0
		gunModel[20].setRotationPoint(36F, -12.5F, 12.5F);
		gunModel[20].rotateAngleX = 1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[21].setRotationPoint(59F, -15.5F, 13F);
		gunModel[21].rotateAngleX = 1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 20, 6, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(-3F, -13F, -2.5F);

		gunModel[23].addBox(0F, -17F, 0F, 16, 1, 3, 0F); // Import Box0
		gunModel[23].setRotationPoint(8F, 12F, -1.5F);

		gunModel[24].addBox(0F, -17F, 0F, 70, 4, 4, 0F); // Import Box0
		gunModel[24].setRotationPoint(38F, -3.5F, -2F);

		gunModel[25].addBox(0F, -17F, 0F, 8, 11, 5, 0F); // Import Box0
		gunModel[25].setRotationPoint(92F, -9.5F, -2.5F);

		gunModel[26].addBox(0F, -17F, 0F, 50, 5, 3, 0F); // Import Box0
		gunModel[26].setRotationPoint(15F, -12F, -1.5F);

		gunModel[27].addBox(0F, -17F, 0F, 28, 6, 8, 0F); // Import Box0
		gunModel[27].setRotationPoint(-48F, -11F, -4F);

		gunModel[28].addBox(0F, -17F, 0F, 27, 3, 6, 0F); // Import Box0
		gunModel[28].setRotationPoint(-47F, 1F, -3F);
		gunModel[28].rotateAngleZ = 1.57079633F;

		gunModel[29].addBox(0F, -17F, 0F, 26, 3, 6, 0F); // Import Box0
		gunModel[29].setRotationPoint(-47F, -12F, -3F);


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(78F, -28.5F, -1.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(78.5F, -32.5F, 0.75F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(78.5F, -32.5F, -1.75F);
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


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 14, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(25.5F, 5F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 13, 20, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(28.5F, 18F, -2F);
		ammoModel[1].rotateAngleZ = 0.15707963F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(6F, -7F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 3, 6, 6, 0F); // Import Box0
		slideModel[1].setRotationPoint(5F, -7F, -6.5F);



		barrelAttachPoint = new Vector3f(113F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(66F /16F, 21F /16F, 5F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 30F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(50 /16F, 14F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}