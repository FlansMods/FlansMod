//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.apocalypse.client.model;

import com.flansmod.client.model.ModelItemHolder;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGunRack extends ModelItemHolder
{
	int textureX = 256;
	int textureY = 32;

	public ModelGunRack()
	{
		baseModel = new ModelRendererTurbo[10];
		baseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box5
		baseModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		baseModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 8
		baseModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		baseModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		baseModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11
		baseModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
		baseModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
		baseModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14
		baseModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 15

		baseModel[0].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Import Box5
		baseModel[0].setRotationPoint(0F, -1F, 0F);

		baseModel[1].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 6
		baseModel[1].setRotationPoint(0F, -11F, 0F);

		baseModel[2].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 8
		baseModel[2].setRotationPoint(0F, -6F, 0F);

		baseModel[3].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 9
		baseModel[3].setRotationPoint(0F, -16F, 0F);

		baseModel[4].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 10
		baseModel[4].setRotationPoint(15F, -6F, 0F);

		baseModel[5].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 11
		baseModel[5].setRotationPoint(15F, -11F, 0F);

		baseModel[6].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 12
		baseModel[6].setRotationPoint(15F, -16F, 0F);

		baseModel[7].addBox(0F, 0F, 0F, 14, 15, 1, 0F); // Box 13
		baseModel[7].setRotationPoint(1F, -16F, 0F);

		baseModel[8].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 14
		baseModel[8].setRotationPoint(5F, -9F, 0F);

		baseModel[9].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 15
		baseModel[9].setRotationPoint(10F, -9F, 0F);

		itemOffset = new Vector3f(0F, 0.5F, -0.25F);
		itemRotation = new Vector3f(75F, 90F, 0F);

		//flipAll();
	}
}
