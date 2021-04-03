//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M21
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

public class ModelM21 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelM21() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[22];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 14, 6, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-27F, 4.25F, -3F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 18, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-22F, -8F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-18F, -4F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 24, 9, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-44F, -4F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[4].setRotationPoint(-18F, -9F, -2F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 6, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(2F, -1F, -2F);

		gunModel[6].addBox(0F, -17F, 0F, 48, 11, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-14F, -11F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 14, 34, 7, 0F); // Import Box0
		gunModel[7].setRotationPoint(-44F, -9F, -3.5F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 110, 5, 5, 0F); // Import Box0
		gunModel[8].setRotationPoint(26F, -14.5F, -2.5F);

		gunModel[9].addBox(0F, -17F, 0F, 46, 8, 6, 0F); // Import Box0
		gunModel[9].setRotationPoint(36F, -19.5F, 13F);
		gunModel[9].rotateAngleX = 1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 13, 1, 3, 0F); // Import Box0
		gunModel[10].setRotationPoint(-7F, 5F, -1.5F);

		gunModel[11].addBox(0F, -17F, 0F, 23, 6, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-50F, -3.5F, -4F);
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 50, 10, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(34F, -11F, -3.5F);

		gunModel[13].addBox(0F, -17F, 0F, 22, 9, 6, 0F); // Import Box0
		gunModel[13].setRotationPoint(-52F, -25.5F, 12.5F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 24, 5, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(8F, -14F, -3F);

		gunModel[15].addBox(0F, -17F, 0F, 4, 23, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(-44F, -5F, -3F);
		gunModel[15].rotateAngleZ = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 70, 2, 5, 0F); // Import Box0
		gunModel[16].setRotationPoint(6F, -1F, -2.5F);

		gunModel[17].addBox(0F, -17F, 0F, 4, 6, 4, 0F); // Import Box0
		gunModel[17].setRotationPoint(-7F, -1F, -2F);

		gunModel[18].addBox(0F, -17F, 0F, 10, 5, 6, 0F); // Import Box0
		gunModel[18].setRotationPoint(-13F, -14F, -3F);

		gunModel[19].addBox(0F, -17F, 0F, 4, 6, 4, 0F); // Import Box0
		gunModel[19].setRotationPoint(-39F, -11F, -2F);

		gunModel[20].addBox(0F, -17F, 0F, 4, 6, 4, 0F); // Import Box0
		gunModel[20].setRotationPoint(-48F, -11F, -2F);

		gunModel[21].addBox(0F, -17F, 0F, 48, 5, 6, 0F); // Import Box0
		gunModel[21].setRotationPoint(32F, -15F, -3F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 22, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(12F, -1F, -2F);
		ammoModel[0].rotateAngleZ = 0.06981317F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 4, 5, 0F); // Import Box0
		slideModel[0].setRotationPoint(-4F, -13F, -2.5F);



		barrelAttachPoint = new Vector3f(134F /16F, 29F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(16F /16F, 31F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(28 /16F, 17F /16F, 0F /16F);


		gunSlideDistance = 2F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}