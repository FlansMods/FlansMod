//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AT4
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

public class ModelAT4 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelAT4() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[23];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-3F, 9F, -15.5F);
		gunModel[0].rotateAngleX = -0.20943951F;
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 17, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(0F, -1F, -13F);
		gunModel[1].rotateAngleX = -0.20943951F;
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-2F, 4F, -13.5F);
		gunModel[2].rotateAngleX = -0.20943951F;
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 28, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(1F, -5F, -15F);
		gunModel[3].rotateAngleX = -0.20943951F;

		gunModel[4].addBox(0F, -17F, 0F, 11, 6, 6, 0F); // Import Box0
		gunModel[4].setRotationPoint(-4F, 11F, -17F);
		gunModel[4].rotateAngleX = -0.20943951F;
		gunModel[4].rotateAngleZ = -0.19198622F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 4, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-1F, -3F, -13F);
		gunModel[5].rotateAngleX = -0.20943951F;
		gunModel[5].rotateAngleZ = -0.05235988F;

		gunModel[6].addBox(0F, -17F, 0F, 4, 6, 9, 0F); // Import Box0
		gunModel[6].setRotationPoint(17F, 1F, -16F);
		gunModel[6].rotateAngleX = -0.20943951F;

		gunModel[7].addBox(0F, -17F, 0F, 80, 10, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-44F, -1F, -5F);

		gunModel[8].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[8].setRotationPoint(29F, -1.5F, 2F);

		gunModel[9].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(38F, -0.5F, 1.5F);

		gunModel[10].addBox(0F, -17F, 0F, 24, 11, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(29F, -1.5F, -8F);

		gunModel[11].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[11].setRotationPoint(38F, -0.5F, -6.5F);

		gunModel[12].addBox(0F, -17F, 0F, 24, 9, 4, 0F); // Import Box0
		gunModel[12].setRotationPoint(29F, -5.5F, 11F);
		gunModel[12].rotateAngleX = 1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 12, 8, 2, 0F); // Import Box0
		gunModel[13].setRotationPoint(38F, -7.5F, 11.5F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 10, 1, 1, 0F); // Import Box0
		gunModel[14].setRotationPoint(9F, 5F, -13F);
		gunModel[14].rotateAngleX = -0.20943951F;

		gunModel[15].addBox(0F, -17F, 0F, 8, 11, 5, 0F); // Import Box0
		gunModel[15].setRotationPoint(71F, -1.5F, -4F);

		gunModel[16].addBox(0F, -17F, 0F, 28, 6, 8, 0F); // Import Box0
		gunModel[16].setRotationPoint(-28F, -3F, -5.5F);

		gunModel[17].addBox(0F, -17F, 0F, 26, 3, 6, 0F); // Import Box0
		gunModel[17].setRotationPoint(-27F, -4F, -4.5F);

		gunModel[18].addBox(0F, -17F, 0F, 80, 12, 12, 0F); // Import Box0
		gunModel[18].setRotationPoint(1F, -2F, -7.5F);

		gunModel[19].addBox(0F, -17F, 0F, 24, 9, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(29F, -16.5F, 11F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 8, 14, 14, 0F); // Import Box0
		gunModel[20].setRotationPoint(-49F, -3F, -8.5F);

		gunModel[21].addBox(0F, -17F, 0F, 8, 14, 14, 0F); // Import Box0
		gunModel[21].setRotationPoint(71F, -3F, -8.5F);

		gunModel[22].addBox(0F, -17F, 0F, 22, 3, 7, 0F); // Import Box0
		gunModel[22].setRotationPoint(30F, 5F, 4.5F);


		defaultScopeModel = new ModelRendererTurbo[1];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 4, 5, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(48F, 0F, 8.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 8, 7, 0F); // Import Box0
		ammoModel[0].setRotationPoint(70F, 0F, -5F);



		barrelAttachPoint = new Vector3f(113F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(26F /16F, 16F /16F, 4F /16F);

		scopeAttachPoint = new Vector3f(41F /16F, 11F /16F, 8F /16F);

		gripAttachPoint = new Vector3f(42 /16F, 5F /16F, -7F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.END_LOADED;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}