//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FlareGun
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

public class ModelFlareGun extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelFlareGun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-7.5F, 7F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 11, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-4F, -4F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-6F, 4F, -2F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(6F, 5F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 4, 28, 6, 0F); // Import Box0
		gunModel[4].setRotationPoint(6F, -22F, -3F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(-5F, -4F, -2F);
		gunModel[5].rotateAngleZ = -0.17453293F;

		gunModel[6].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[6].setRotationPoint(36F, -12F, -1.5F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 2, 2, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(5F, -21F, -3.5F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 12, 8, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-10F, -33F, -3.5F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 8, 4, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(-16F, -30F, -2.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 4, 7, 4, 0F); // Import Box0
		gunModel[10].setRotationPoint(2F, 11F, -2F);
		gunModel[10].rotateAngleZ = -0.17453293F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 5, 12, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(4F, -31F, -2.5F);
		ammoModel[0].rotateAngleZ = -1.57079633F;


		breakActionModel = new ModelRendererTurbo[11];
		breakActionModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34
		breakActionModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 34
		breakActionModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 34
		breakActionModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 34
		breakActionModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 34
		breakActionModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		breakActionModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		breakActionModel[7] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		breakActionModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 34
		breakActionModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 34
		breakActionModel[10] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 34

		breakActionModel[0].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		breakActionModel[0].setRotationPoint(4F, -39F, 1F);

		breakActionModel[1].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		breakActionModel[1].setRotationPoint(4F, -39F, -2F);

		breakActionModel[2].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 34
		breakActionModel[2].setRotationPoint(40F, -41F, 1F);

		breakActionModel[3].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		breakActionModel[3].setRotationPoint(2.5F, -33F, -2.5F);
		breakActionModel[3].rotateAngleX = 1.57079633F;

		breakActionModel[4].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		breakActionModel[4].setRotationPoint(38.5F, -33F, -2.5F);
		breakActionModel[4].rotateAngleX = 1.57079633F;

		breakActionModel[5].addBox(0F, -17F, 0F, 4, 36, 7, 0F); // Import Box0
		breakActionModel[5].setRotationPoint(26F, -26F, -3.5F);
		breakActionModel[5].rotateAngleZ = -1.57079633F;

		breakActionModel[6].addBox(0F, -17F, 0F, 10, 16, 10, 0F); // Import Box0
		breakActionModel[6].setRotationPoint(6F, -32.5F, -5F);
		breakActionModel[6].rotateAngleZ = -1.57079633F;

		breakActionModel[7].addBox(0F, -17F, 0F, 7, 38, 7, 0F); // Import Box0
		breakActionModel[7].setRotationPoint(30F, -33F, -3.5F);
		breakActionModel[7].rotateAngleZ = -1.57079633F;

		breakActionModel[8].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 34
		breakActionModel[8].setRotationPoint(40F, -41F, -2F);

		breakActionModel[9].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 34
		breakActionModel[9].setRotationPoint(40F, -42F, -2F);

		breakActionModel[10].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 34
		breakActionModel[10].setRotationPoint(4F, -40F, -2F);



		barrelAttachPoint = new Vector3f(58F /16F, 29F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(20F /16F, 20F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(28F /16F, 35F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(50 /16F, 28F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BREAK_ACTION;


		barrelBreakPoint = new Vector3f(20 /16F, 20F /16F, 0F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}