//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EMP4
// Model Creator: 
// Created on: 09.06.2020 - 02:28:22
// Last changed on: 09.06.2020 - 02:28:22

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEMP4 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelEMP4() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox1
		gunModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox2
		gunModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox5
		gunModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox5
		gunModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportBox5
		gunModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import ImportBox5
		gunModel[10] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import ImportBox2
		gunModel[11] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import ImportBox5
		gunModel[12] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportBox5

		gunModel[0].addBox(0F, 0F, 0F, 31, 10, 3, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-8F, -8F, -2F);

		gunModel[1].addBox(0F, 0F, 0F, 30, 5, 2, 0F); // Import ImportBox1
		gunModel[1].setRotationPoint(-16F, -1F, 0.5F);
		gunModel[1].rotateAngleX = -3.14159265F;

		gunModel[2].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Import ImportBox2
		gunModel[2].setRotationPoint(-9.5F, 4F, 0.5F);
		gunModel[2].rotateAngleX = -3.14159265F;
		gunModel[2].rotateAngleZ = -0.45378561F;

		gunModel[3].addBox(0F, 0F, 0F, 20, 10, 4, 0F); // Import ImportBox0
		gunModel[3].setRotationPoint(9F, -8.5F, -2.5F);

		gunModel[4].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Import ImportBox5
		gunModel[4].setRotationPoint(20F, -4F, 5F);
		gunModel[4].rotateAngleZ = -0.34906585F;

		gunModel[5].addBox(0F, 0F, 0F, 30, 2, 3, 0F); // Import ImportBox5
		gunModel[5].setRotationPoint(28F, -3F, -2F);

		gunModel[6].addBox(0F, 0F, 0F, 11, 10, 8, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(16F, -6F, -4.5F);

		gunModel[7].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(1F, -4F, -4.5F);

		gunModel[8].addBox(0F, 0F, 0F, 30, 2, 3, 0F); // Import ImportBox5
		gunModel[8].setRotationPoint(28F, -6F, -2F);

		gunModel[9].addBox(0F, 0F, 0F, 2, 8, 5, 0F); // Import ImportBox5
		gunModel[9].setRotationPoint(29F, -8F, -3F);

		gunModel[10].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Import ImportBox2
		gunModel[10].setRotationPoint(-7.5F, 5F, 0F);
		gunModel[10].rotateAngleX = -3.14159265F;
		gunModel[10].rotateAngleZ = 1.57079633F;

		gunModel[11].addBox(0F, 0F, 0F, 3, 6, 7, 0F); // Import ImportBox5
		gunModel[11].setRotationPoint(21F, -4F, 3.5F);
		gunModel[11].rotateAngleZ = -0.34906585F;

		gunModel[12].addBox(0F, 0F, 0F, 8, 10, 10, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(8F, -5F, -5.5F);

		gunModel[13].addBox(0F, 0F, 0F, 4, 10, 5, 0F); // Import ImportBox5
		gunModel[13].setRotationPoint(-18F, -4.75F, -3F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportBox0

		ammoModel[0].addBox(0F, 0F, 0F, 8, 3, 6, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(-7F, 2F, -3.5F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import ImportBox5

		slideModel[0].addBox(0F, 0F, 0F, 2, 8, 5, 0F); // Import ImportBox5
		slideModel[0].setRotationPoint(55.75F, -8F, -3F);



		gunSlideDistance = 6F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}