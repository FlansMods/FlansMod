//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ASH12
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

public class ModelASH12 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelASH12() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[22];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 4, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-6F, 17F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 6, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-2F, 5F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-6F, 10F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 10, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-9F, 21F, -2.5F);
		gunModel[3].rotateAngleZ = -0.27925268F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-6F, 9F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 14, 6, 8, 0F); // Import Box0
		gunModel[5].setRotationPoint(16F, 10F, -4F);

		gunModel[6].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-8F, -1F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 34, 14, 8, 0F); // Import Box0
		gunModel[7].setRotationPoint(-42F, -1F, -4F);

		gunModel[8].addBox(0F, -17F, 0F, 40, 5, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(30F, 2.5F, -2.5F);

		gunModel[9].addBox(0F, -17F, 0F, 39, 12, 8, 0F); // Import Box0
		gunModel[9].setRotationPoint(20F, -0.5F, 11F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 23, 12, 10, 0F); // Import Box0
		gunModel[10].setRotationPoint(36F, -2F, -5F);

		gunModel[11].addBox(0F, -17F, 0F, 17, 11, 10, 0F); // Import Box0
		gunModel[11].setRotationPoint(-31F, -2.5F, 11.5F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 10, 2, 5, 0F); // Import Box0
		gunModel[12].setRotationPoint(4F, 16F, -2.5F);

		gunModel[13].addBox(0F, -17F, 0F, 2, 7, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(14F, 11F, -2F);

		gunModel[14].addBox(0F, -17F, 0F, 5, 10, 5, 0F); // Import Box0
		gunModel[14].setRotationPoint(-14F, -11F, -2.5F);

		gunModel[15].addBox(0F, -17F, 0F, 3, 10, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(16F, -11F, -2.5F);

		gunModel[16].addBox(0F, -17F, 0F, 31, 2, 6, 0F); // Import Box0
		gunModel[16].setRotationPoint(-13F, -12F, -3F);

		gunModel[17].addBox(0F, -17F, 0F, 4, 11, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(57F, 5F, -2F);

		gunModel[18].addBox(0F, -17F, 0F, 23, 9, 16, 0F); // Import Box0
		gunModel[18].setRotationPoint(-60F, -3.5F, 12.5F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -17F, 0F, 4, 10, 24, 0F); // Import Box0
		gunModel[19].setRotationPoint(-62F, 4.5F, 12F);
		gunModel[19].rotateAngleX = 1.57079633F;
		gunModel[19].rotateAngleZ = 0.06981317F;

		gunModel[20].addBox(0F, -17F, 0F, 23, 8, 8, 0F); // Import Box0
		gunModel[20].setRotationPoint(-60F, 3.5F, 13F);
		gunModel[20].rotateAngleX = 1.57079633F;
		gunModel[20].rotateAngleZ = 0.19198622F;

		gunModel[21].addBox(0F, -17F, 0F, 51, 7, 6, 0F); // Import Box0
		gunModel[21].setRotationPoint(-61F, -14.5F, 13.5F);
		gunModel[21].rotateAngleX = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(31F, -28.5F, -1.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(31.5F, -32.5F, 0.75F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(31.5F, -32.5F, -1.75F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(4F, -28.5F, -2F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(4.5F, -28.5F, 1.75F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(4.5F, -28.5F, -2.75F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 30, 6, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-29F, 7F, -3F);
		ammoModel[0].rotateAngleZ = 0.10471976F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 14, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(-30F, 0F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 3, 8, 2, 0F); // Import Box0
		slideModel[1].setRotationPoint(21F, -5F, -1F);



		barrelAttachPoint = new Vector3f(68F /16F, 12F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(-1F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(36 /16F, 2F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.RIFLE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}