//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DesertEagle
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

public class ModelDesertEagle extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelDesertEagle() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 34
		gunModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 12, 9, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-7.5F, 3F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-4F, -8F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 9, 3, 0F); // Import Box0
		gunModel[2].setRotationPoint(-6F, -3F, -1.5F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 12, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-7F, 6F, -3.5F);
		gunModel[3].rotateAngleZ = -0.17453293F;

		gunModel[4].addBox(0F, -17F, 0F, 11, 2, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(7F, 0F, -1.5F);

		gunModel[5].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 34
		gunModel[5].setRotationPoint(44F, -35F, -0.5F);

		gunModel[6].addBox(0F, -17F, 0F, 5, 3, 4, 0F); // Import Box0
		gunModel[6].setRotationPoint(-9F, -6F, -2F);
		gunModel[6].rotateAngleZ = -0.17453293F;

		gunModel[7].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[7].setRotationPoint(33F, -17F, -1.5F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 5, 15, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(30F, -28F, -2.5F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 2, 7, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(-19F, -23F, -2.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 4, 1, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(9F, -34F, -1.5F);
		gunModel[10].rotateAngleZ = 2.05948852F;

		gunModel[11].addBox(0F, -17F, 0F, 4, 48, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(30F, -31.75F, -2F);
		gunModel[11].rotateAngleZ = -1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 11, 2, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-9F, 12F, -2.5F);
		ammoModel[0].rotateAngleZ = -0.17453293F;

		ammoModel[1].addBox(0F, -17F, 0F, 7, 17, 3, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-3F, -3F, -1.5F);
		ammoModel[1].rotateAngleZ = -0.17453293F;


		slideModel = new ModelRendererTurbo[5];
		slideModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		slideModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 34
		slideModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		slideModel[0].setRotationPoint(-4F, -35F, 1F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		slideModel[1].setRotationPoint(-4F, -35F, -2F);

		slideModel[2].addBox(0F, -17F, 0F, 6, 40, 6, 0F); // Import Box0
		slideModel[2].setRotationPoint(17F, -28F, -3F);
		slideModel[2].rotateAngleZ = -1.57079633F;

		slideModel[3].addBox(0F, -17F, 0F, 1, 19, 4, 0F); // Import Box0
		slideModel[3].setRotationPoint(-1F, -33F, -2F);
		slideModel[3].rotateAngleZ = -1.57079633F;

		slideModel[4].addBox(0F, -17F, 0F, 4, 22, 5, 0F); // Import Box0
		slideModel[4].setRotationPoint(0F, -32F, -2.5F);
		slideModel[4].rotateAngleZ = -1.57079633F;



		barrelAttachPoint = new Vector3f(46F /16F, 30F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(28F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(26 /16F, 23F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}