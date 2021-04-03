//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MP7
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

public class ModelMP7 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelMP7() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-6.5F, 17F, -3F);
		gunModel[0].rotateAngleZ = -0.13962634F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-3F, 5F, -2.5F);
		gunModel[1].rotateAngleZ = -0.06981317F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-5.75F, 14F, -2F);
		gunModel[2].rotateAngleZ = -0.13962634F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(4F, 14F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 4, 42, 6, 0F); // Import Box0
		gunModel[4].setRotationPoint(-8F, -12F, -3F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(34F, -3F, -1.5F);
		gunModel[5].rotateAngleZ = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 2, 52, 5, 0F); // Import Box0
		gunModel[6].setRotationPoint(20F, -24.25F, -2.5F);
		gunModel[6].rotateAngleZ = -1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 8, 40, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(32F, -17F, -3F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 4, 26, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(44F, -15F, -2F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 9, 42, 7, 0F); // Import Box0
		gunModel[9].setRotationPoint(-8F, -21F, -3.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 4, 38, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(30F, -21F, -3.5F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 3, 58, 6, 0F); // Import Box0
		gunModel[11].setRotationPoint(24F, -23.25F, -3F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 18, 4, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-44F, -21.25F, -4F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 22, 6, 8, 0F); // Import Box0
		gunModel[13].setRotationPoint(-48F, -21.25F, -4F);
		gunModel[13].rotateAngleZ = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[3];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 34
		defaultScopeModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 34

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(-14F, -26.25F, 1F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[1].setRotationPoint(-14F, -26.25F, -2F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[2].setRotationPoint(34F, -27.25F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 8, 22, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-2F, 19F, -2F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 3, 5, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-3F, 39F, -2.5F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 2, 18, 4, 0F); // Import Box0
		slideModel[0].setRotationPoint(-18F, -22.25F, -2F);
		slideModel[0].rotateAngleZ = -1.57079633F;

		slideModel[1].addBox(0F, -17F, 0F, 2, 2, 9, 0F); // Import Box0
		slideModel[1].setRotationPoint(-36F, -22.25F, -4.5F);
		slideModel[1].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(58F /16F, 13F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 24F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(34 /16F, 10F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}