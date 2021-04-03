//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: L96
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

public class ModelL96 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelL96() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-16F, 10.25F, -2F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-11F, -2F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-13F, 5F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 24, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-38F, 8F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-14F, 4F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 6, 9, 0F); // Import Box0
		gunModel[5].setRotationPoint(4F, 5F, -4.5F);

		gunModel[6].addBox(0F, -17F, 0F, 48, 13, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-14F, -8F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 38, 12, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(-50F, -7.5F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 22, 34, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-39F, -3F, -3.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 139, 5, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(26F, -11.5F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 53, 9, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(32F, -14.5F, 12.5F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 8, 1, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(-3F, 10F, -1.5F);

		gunModel[12].addBox(0F, -17F, 0F, 30, 6, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-45F, 5.5F, -4F);
		gunModel[12].rotateAngleZ = 1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 50, 6, 7, 0F); // Import Box0
		gunModel[13].setRotationPoint(34F, -9F, -3.5F);

		gunModel[14].addBox(0F, -17F, 0F, 24, 9, 10, 0F); // Import Box0
		gunModel[14].setRotationPoint(8F, -6.5F, 12.5F);
		gunModel[14].rotateAngleX = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 20, 9, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(-55F, -21.5F, 12.5F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 30, 6, 7, 0F); // Import Box0
		gunModel[16].setRotationPoint(0F, -14F, -3.5F);

		gunModel[17].addBox(0F, -17F, 0F, 4, 15, 6, 0F); // Import Box0
		gunModel[17].setRotationPoint(-39F, 1F, -3F);
		gunModel[17].rotateAngleZ = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 28, 4, 7, 0F); // Import Box0
		gunModel[18].setRotationPoint(30F, 2F, -3.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 18, 24, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(11F, -4F, -2F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 4, 5, 0F); // Import Box0
		slideModel[0].setRotationPoint(-12F, -10F, -2.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 3, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(-9F, -9F, -8.5F);

		slideModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		slideModel[2].setRotationPoint(-10F, -9.5F, -10.5F);



		barrelAttachPoint = new Vector3f(166F /16F, 26F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(16F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(44 /16F, 10F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}