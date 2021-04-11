//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Glock17
// Model Creator:Blaky
// Created on: 13.01.2021 - 21:36:47
// Last changed on: 13.01.2021 - 21:36:47

package com.flansmod.zombie.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGlock17 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelGlock17() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Grip
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Body
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import UnderBody
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Muzzle
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Trigger
		gunModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Barrel
		gunModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		gunModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 5
		gunModel[9] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 18
		gunModel[10] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 19
		gunModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 29

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Grip
		gunModel[0].setRotationPoint(0F, -2.5F, -1F);
		gunModel[0].rotateAngleZ = -0.27925268F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Body
		gunModel[1].setRotationPoint(-1F, -3F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.9F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.9F, -0.2F, 0.2F); // Import UnderBody
		gunModel[2].setRotationPoint(-1F, -2.5F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Muzzle
		gunModel[3].setRotationPoint(6.5F, -3.7F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, 0.2F, -0.3F, -1.1F, 0.2F, -0.3F, -1.1F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.9F, -0.2F, -0.3F, -0.9F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F); // Import Trigger
		gunModel[4].setRotationPoint(1.35F, -1.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Import Barrel
		gunModel[5].setRotationPoint(3F, -3.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, -0.7F, 0.15F, 0F, -0.7F, 0.15F); // Box 0
		gunModel[6].setRotationPoint(5F, -3F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 1
		gunModel[7].setRotationPoint(6.5F, -2.6F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -0.9F, -0.35F, 0F, -0.9F, -0.35F, 0F, -0.9F, 0.3F, -0.75F, -0.9F, 0.3F, -0.75F, 0.75F, -0.35F, 0F, 0.75F, -0.35F, 0F, 0.75F, 0.3F, -0.75F, 0.75F, 0.3F); // Box 5
		gunModel[8].setRotationPoint(1F, -4.75F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.2F, -0.6F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 18
		gunModel[9].setRotationPoint(1.5F, -1.2F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1.6F, 0.2F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F); // Box 19
		gunModel[10].setRotationPoint(1.9F, -1.5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -1.4F, -0.7F, -1.6F, 0.05F, -0.7F, -1.6F, 0.05F, -0.7F, -0.2F, -1.4F, -0.7F, -0.2F, -1.4F, -2.7F, -1.6F, 0.05F, -2.7F, -1.6F, 0.05F, -2.7F, -0.2F, -1.4F, -2.7F, -0.2F); // Box 29
		gunModel[11].setRotationPoint(0F, -2.5F, -1F);
		gunModel[11].rotateAngleZ = -0.27925268F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 20
		ammoModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 21

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -0.1F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F, -0.1F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.1F, 0F, -0.6F); // Box 20
		ammoModel[0].setRotationPoint(0F, -2.5F, -1F);
		ammoModel[0].rotateAngleZ = -0.27925268F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, -4F, -0.35F, -0.1F, -4F, -0.35F, -0.1F, -4F, -0.35F, 0F, -4F, -0.35F, 0F, 0.2F, -0.35F, -0.1F, 0.2F, -0.35F, -0.1F, 0.2F, -0.35F, 0F, 0.2F, -0.35F); // Box 21
		ammoModel[1].setRotationPoint(0F, -2.5F, -1F);
		ammoModel[1].rotateAngleZ = -0.27925268F;


		slideModel = new ModelRendererTurbo[16];
		slideModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Slide
		slideModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Slide
		slideModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		slideModel[3] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 3
		slideModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 4
		slideModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 6
		slideModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 8
		slideModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 9
		slideModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 10
		slideModel[9] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 11
		slideModel[10] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 12
		slideModel[11] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 13
		slideModel[12] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 14
		slideModel[13] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 15
		slideModel[14] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 16
		slideModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17

		slideModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Import Slide
		slideModel[0].setRotationPoint(3F, -4F, -1F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Slide
		slideModel[1].setRotationPoint(6F, -4.4F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.2F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F); // Box 2
		slideModel[2].setRotationPoint(-0.8F, -4F, -1F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.75F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -0.3F, -0.75F, -0.1F, -0.3F, -0.75F, 0.5F, -1.3F, 0F, 0.5F, -1.3F, 0F, 0.5F, -0.3F, -0.75F, 0.5F, -0.3F); // Box 3
		slideModel[3].setRotationPoint(1F, -4F, -1F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -0.85F, -0.3F, 0F, -0.85F, -0.3F, 0F, -0.85F, 0.3F, -0.75F, -0.85F, 0.3F, -0.75F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.3F, -0.75F, 0.5F, 0.3F); // Box 4
		slideModel[4].setRotationPoint(1F, -4F, -1F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.2F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F); // Box 6
		slideModel[5].setRotationPoint(1F, -4F, -1F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.35F, -0.8F, -0.2F, -0.35F, -0.8F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, 0.5F, -0.35F, -0.8F, 0.5F, -0.35F, -0.8F, 0.5F, -0.35F, 0F, 0.5F, -0.35F); // Box 8
		slideModel[6].setRotationPoint(-0.6F, -4F, -1F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 9
		slideModel[7].setRotationPoint(-0.4F, -4F, -1F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.35F, -0.8F, -0.2F, -0.35F, -0.8F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, 0.5F, -0.35F, -0.8F, 0.5F, -0.35F, -0.8F, 0.5F, -0.35F, 0F, 0.5F, -0.35F); // Box 10
		slideModel[8].setRotationPoint(-0.2F, -4F, -1F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 11
		slideModel[9].setRotationPoint(0F, -4F, -1F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.35F, -0.8F, -0.2F, -0.35F, -0.8F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, 0.5F, -0.35F, -0.8F, 0.5F, -0.35F, -0.8F, 0.5F, -0.35F, 0F, 0.5F, -0.35F); // Box 12
		slideModel[10].setRotationPoint(0.2F, -4F, -1F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, -0.8F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 13
		slideModel[11].setRotationPoint(0.4F, -4F, -1F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, -0.35F, -0.8F, -0.2F, -0.35F, -0.8F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, 0.5F, -0.35F, -0.8F, 0.5F, -0.35F, -0.8F, 0.5F, -0.35F, 0F, 0.5F, -0.35F); // Box 14
		slideModel[12].setRotationPoint(0.6F, -4F, -1F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, -0.2F, -0.9F, -0.3F, -0.2F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 15
		slideModel[13].setRotationPoint(-1F, -3.9F, -1F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.7F, -0.6F, -0.55F, -0.7F, -0.6F, -0.55F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, 0F, -0.35F, -0.55F, 0F, -0.35F, -0.55F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 16
		slideModel[14].setRotationPoint(-0.7F, -4.9F, -1F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.7F, -1.2F, -0.55F, -0.7F, -1.2F, -0.55F, -0.7F, -0.6F, 0F, -0.7F, -0.6F, 0F, 0F, -1.2F, -0.55F, 0F, -1.2F, -0.55F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 17
		slideModel[15].setRotationPoint(-0.7F, -4.9F, -1F);



		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, -1F, 0F);


		flipAll();
	}
}