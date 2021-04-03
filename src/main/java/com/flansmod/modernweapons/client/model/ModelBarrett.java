//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Barrett
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

public class ModelBarrett extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelBarrett() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[24];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-25F, 26F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-22F, 15F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-24F, 24F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 30, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-28F, 11F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-26F, 30F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 7, 6, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(-31F, 10F, -1.5F);

		gunModel[6].addBox(0F, -17F, 0F, 2, 5, 5, 0F); // Import Box0
		gunModel[6].setRotationPoint(-0.75F, 17F, -2.5F);

		gunModel[7].addBox(0F, -17F, 0F, 130, 9, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-83F, -7F, -3.5F);

		gunModel[8].addBox(0F, -17F, 0F, 90, 8, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(-24F, -12F, -2.5F);

		gunModel[9].addBox(0F, -17F, 0F, 12, 2, 3, 0F); // Import Box0
		gunModel[9].setRotationPoint(-12F, 20F, -1.5F);

		gunModel[10].addBox(0F, -17F, 0F, 7, 26, 8, 0F); // Import Box0
		gunModel[10].setRotationPoint(-90F, -7F, -4F);

		gunModel[11].addBox(0F, -17F, 0F, 81, 5, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-32F, 8F, -4F);

		gunModel[12].addBox(0F, -17F, 0F, 80, 10, 6, 0F); // Import Box0
		gunModel[12].setRotationPoint(-64F, -2F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 70, 10, 4, 0F); // Import Box0
		gunModel[13].setRotationPoint(6F, -2.5F, 2F);

		gunModel[14].addBox(0F, -17F, 0F, 70, 10, 4, 0F); // Import Box0
		gunModel[14].setRotationPoint(6F, -2.5F, -6F);

		gunModel[15].addBox(0F, -17F, 0F, 70, 10, 4, 0F); // Import Box0
		gunModel[15].setRotationPoint(5.75F, -18.5F, 12F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 70, 10, 4, 0F); // Import Box0
		gunModel[16].setRotationPoint(5.75F, -6.5F, 12F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 8, 20, 3, 0F); // Import Box0
		gunModel[17].setRotationPoint(-70F, -4F, -1.5F);
		gunModel[17].rotateAngleZ = -0.08726646F;

		gunModel[18].addBox(0F, -17F, 0F, 6, 20, 5, 0F); // Import Box0
		gunModel[18].setRotationPoint(-68F, 0.25F, -2.5F);
		gunModel[18].rotateAngleZ = 1.51843645F;

		gunModel[19].addBox(0F, -17F, 0F, 28, 6, 7, 0F); // Import Box0
		gunModel[19].setRotationPoint(2F, 11F, -3.5F);

		gunModel[20].addBox(0F, -17F, 0F, 28, 6, 3, 0F); // Import Box0
		gunModel[20].setRotationPoint(-30F, -5F, -5.5F);

		gunModel[21].addBox(0F, -17F, 0F, 3, 4, 3, 0F); // Import Box0
		gunModel[21].setRotationPoint(-28F, -4F, -6.5F);

		gunModel[22].addBox(0F, -17F, 0F, 7, 30, 8, 0F); // Import Box0
		gunModel[22].setRotationPoint(-58F, -18F, -4F);
		gunModel[22].rotateAngleZ = 1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 7, 26, 6, 0F); // Import Box0
		gunModel[23].setRotationPoint(-56F, -20F, -3F);
		gunModel[23].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 25, 18, 6, 0F); // Import Box0
		ammoModel[0].setRotationPoint(1F, 15F, -3F);

		ammoModel[1].addBox(0F, -17F, 0F, 20, 2, 6, 0F); // Import Box0
		ammoModel[1].setRotationPoint(1F, 33F, -3F);


		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 110, 6, 6, 0F); // Import Box0
		slideModel[0].setRotationPoint(50F, 0.5F, -3F);

		slideModel[1].addBox(0F, -17F, 0F, 24, 10, 12, 0F); // Import Box0
		slideModel[1].setRotationPoint(132F, -1.5F, -6F);

		slideModel[2].addBox(0F, -17F, 0F, 8, 6, 8, 0F); // Import Box0
		slideModel[2].setRotationPoint(135F, 0.5F, -10F);
		slideModel[2].rotateAngleY = 0.20943951F;

		slideModel[3].addBox(0F, -17F, 0F, 8, 6, 8, 0F); // Import Box0
		slideModel[3].setRotationPoint(133F, 0.5F, 2F);
		slideModel[3].rotateAngleY = -0.20943951F;



		barrelAttachPoint = new Vector3f(157F /16F, 14F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(51F /16F, 15F /16F, 8F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 28F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(40 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 2F;


		animationType = EnumAnimationType.SIDE_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}