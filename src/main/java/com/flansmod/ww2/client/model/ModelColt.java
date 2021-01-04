//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelColt extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelColt() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 98, 10, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 18
		gunModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
		gunModel[12] = new ModelRendererTurbo(this, 115, 27, textureX, textureY); // Box 22
		gunModel[13] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 24
		gunModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2

		gunModel[0].addBox(0F, 0F, 0F, 6, 12, 5, 0F); // Box 0
		gunModel[0].setRotationPoint(-2F, -12F, -2.5F);
		gunModel[0].rotateAngleZ = -0.26179939F;

		gunModel[1].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 1
		gunModel[1].setRotationPoint(-1.5F, -11.5F, 2F);
		gunModel[1].rotateAngleZ = -0.26179939F;

		gunModel[2].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 2
		gunModel[2].setRotationPoint(-1.5F, -11.5F, -3F);
		gunModel[2].rotateAngleZ = -0.26179939F;

		gunModel[3].addBox(0F, 0F, 0F, 13, 2, 5, 0F); // Box 5
		gunModel[3].setRotationPoint(-2.5F, -12F, -2.5F);

		gunModel[4].addBox(0F, 0F, 0F, 7, 2, 5, 0F); // Box 6
		gunModel[4].setRotationPoint(10.5F, -12.5F, -2.5F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 7
		gunModel[5].setRotationPoint(3.5F, -11F, -2F);
		gunModel[5].rotateAngleZ = -0.26179939F;

		gunModel[6].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 8
		gunModel[6].setRotationPoint(9.5F, -11F, -1.5F);
		gunModel[6].rotateAngleZ = -0.2443461F;

		gunModel[7].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 9
		gunModel[7].setRotationPoint(3.4F, -7F, -1.5F);
		gunModel[7].rotateAngleZ = 1.55334303F;

		gunModel[8].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 10
		gunModel[8].setRotationPoint(-5F, -11F, -2F);
		gunModel[8].rotateAngleZ = 0.78539816F;

		gunModel[9].addShapeBox(0F, 0F, 0F, 21, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[9].setRotationPoint(-3F, -13.5F, -3F);

		gunModel[10].addBox(0F, 0F, 0F, 24, 2, 2, 0F); // Box 18
		gunModel[10].setRotationPoint(-0.5F, -16F, -1F);

		gunModel[11].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 19
		gunModel[11].setRotationPoint(23.5F, -16F, -1F);

		gunModel[12].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 22
		gunModel[12].setRotationPoint(5.5F, -10.5F, -0.5F);

		gunModel[13].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 24
		gunModel[13].setRotationPoint(4F, -16.25F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 2
		gunModel[14].setRotationPoint(24.2F, -13.5F, 1F);
		gunModel[14].rotateAngleY = -3.14159265F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		ammoModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 3
		ammoModel[0].setRotationPoint(-1F, -10F, -1.5F);
		ammoModel[0].rotateAngleZ = -0.17453293F;

		ammoModel[1].addBox(-4.5F, -8.9F, -1.5F, 5, 10, 3, 0F); // Box 4
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		ammoModel[1].rotateAngleZ = -0.26179939F;


		slideModel = new ModelRendererTurbo[9];
		slideModel[0] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 13
		slideModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 15
		slideModel[2] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 16
		slideModel[3] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 17
		slideModel[4] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 20
		slideModel[5] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 21
		slideModel[6] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 23
		slideModel[7] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 25
		slideModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 0

		slideModel[0].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		slideModel[0].setRotationPoint(17F, -13.5F, -2.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		slideModel[1].setRotationPoint(9F, -16.5F, -2.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		slideModel[2].setRotationPoint(18F, -15.5F, -2.5F);

		slideModel[3].addBox(0F, 0F, 0F, 21, 2, 5, 0F); // Box 17
		slideModel[3].setRotationPoint(-3F, -15.5F, -2.5F);

		slideModel[4].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 20
		slideModel[4].setRotationPoint(-5F, -16.5F, -1F);
		slideModel[4].rotateAngleZ = -0.34906585F;

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		slideModel[5].setRotationPoint(-2F, -17F, -1.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		slideModel[6].setRotationPoint(-3F, -16.5F, -2.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 25
		slideModel[7].setRotationPoint(4F, -16.5F, -1.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[8].setRotationPoint(22F, -17.5F, -1F);

		gunSlideDistance = 1.5F;
		translateAll(0F, -10F, 0.3F);
		thirdPersonOffset = new Vector3f(-0.06F, -0.13F, 0.01F);
		animationType = EnumAnimationType.PISTOL_CLIP;

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
