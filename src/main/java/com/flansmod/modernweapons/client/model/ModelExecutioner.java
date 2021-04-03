//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Executioner
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

public class ModelExecutioner extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelExecutioner() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		gunModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 34
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 34
		gunModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 34

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-13.5F, 9F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 11, 21, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-10F, -2F, -2.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-12F, 6F, -2F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, 7F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 34
		gunModel[4].setRotationPoint(4F, -34F, 1F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 34
		gunModel[5].setRotationPoint(4F, -34F, -2F);

		gunModel[6].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 34
		gunModel[6].setRotationPoint(2.5F, -31F, -2.5F);
		gunModel[6].rotateAngleX = 1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 4, 32, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(7F, -20F, -3F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(-5F, -2F, -2F);
		gunModel[8].rotateAngleZ = -0.17453293F;

		gunModel[9].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(30F, -10F, -1.5F);
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 2, 2, 7, 0F); // Import Box0
		gunModel[10].setRotationPoint(6F, -19F, -3.5F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 12, 22, 12, 0F); // Import Box0
		gunModel[11].setRotationPoint(6F, -31.5F, -6F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 10, 8, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(-16F, -29F, -3.5F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 6, 4, 5, 0F); // Import Box0
		gunModel[13].setRotationPoint(-22F, -26F, -2.5F);
		gunModel[13].rotateAngleZ = -1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 4, 7, 4, 0F); // Import Box0
		gunModel[14].setRotationPoint(-4F, 13F, -2F);
		gunModel[14].rotateAngleZ = -0.17453293F;

		gunModel[15].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 34
		gunModel[15].setRotationPoint(4F, -35F, -2F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 5, 12, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(20F, -30F, 1.5F);
		ammoModel[0].rotateAngleZ = -1.57079633F;

		ammoModel[1].addBox(0F, -17F, 0F, 5, 12, 5, 0F); // Import Box0
		ammoModel[1].setRotationPoint(20F, -30F, -5.5F);
		ammoModel[1].rotateAngleZ = -1.57079633F;


		breakActionModel = new ModelRendererTurbo[9];
		breakActionModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34
		breakActionModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 34
		breakActionModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		breakActionModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		breakActionModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 34
		breakActionModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 34
		breakActionModel[6] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		breakActionModel[7] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		breakActionModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 34

		breakActionModel[0].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 34
		breakActionModel[0].setRotationPoint(92F, -38F, 2F);

		breakActionModel[1].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 34
		breakActionModel[1].setRotationPoint(88.5F, -31F, -3.5F);
		breakActionModel[1].rotateAngleX = 1.57079633F;

		breakActionModel[2].addBox(0F, -17F, 0F, 4, 36, 11, 0F); // Import Box0
		breakActionModel[2].setRotationPoint(42F, -24F, -5.5F);
		breakActionModel[2].rotateAngleZ = -1.57079633F;

		breakActionModel[3].addBox(0F, -17F, 0F, 7, 74, 7, 0F); // Import Box0
		breakActionModel[3].setRotationPoint(80F, -31F, -6.5F);
		breakActionModel[3].rotateAngleZ = -1.57079633F;

		breakActionModel[4].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 34
		breakActionModel[4].setRotationPoint(92F, -38F, -3F);

		breakActionModel[5].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 34
		breakActionModel[5].setRotationPoint(92F, -39F, -3F);

		breakActionModel[6].addBox(0F, -17F, 0F, 7, 74, 7, 0F); // Import Box0
		breakActionModel[6].setRotationPoint(80F, -31F, 0.5F);
		breakActionModel[6].rotateAngleZ = -1.57079633F;

		breakActionModel[7].addBox(0F, -17F, 0F, 4, 30, 4, 0F); // Import Box0
		breakActionModel[7].setRotationPoint(72F, -24F, -1.5F);
		breakActionModel[7].rotateAngleZ = -1.57079633F;

		breakActionModel[8].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		breakActionModel[8].setRotationPoint(90F, -35F, -0.5F);



		barrelAttachPoint = new Vector3f(58F /16F, 29F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(22F /16F, 18F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(28F /16F, 35F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(50 /16F, 28F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BREAK_ACTION;


		barrelBreakPoint = new Vector3f(22F /16F, 18F /16F, 0F /16F);


		breakAngle = 60F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}