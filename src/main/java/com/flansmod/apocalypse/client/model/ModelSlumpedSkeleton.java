//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.apocalypse.client.model;

import com.flansmod.client.model.ModelItemHolder;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSlumpedSkeleton extends ModelItemHolder
{
	int textureX = 128;
	int textureY = 32;

	public ModelSlumpedSkeleton()
	{
		baseModel = new ModelRendererTurbo[6];
		baseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		baseModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box2
		baseModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box3
		baseModel[3] = new ModelRendererTurbo(this, 69, 1, textureX, textureY); // Import Box5
		baseModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		baseModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1

		baseModel[0].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Import Box1
		baseModel[0].setRotationPoint(4F, -5F, 12F);
		baseModel[0].rotateAngleX = -0.78539816F;

		baseModel[1].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box2
		baseModel[1].setRotationPoint(2F, 6F, 9F);
		baseModel[1].rotateAngleX = 0.78539816F;
		baseModel[1].rotateAngleY = -0.26179939F;

		baseModel[2].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Import Box3
		baseModel[2].setRotationPoint(12F, 6F, 8F);
		baseModel[2].rotateAngleX = 0.78539816F;
		baseModel[2].rotateAngleY = 0.26179939F;

		baseModel[3].addBox(0F, 0F, 0F, 8, 12, 4, 0F); // Import Box5
		baseModel[3].setRotationPoint(4F, 4F, 7F);

		baseModel[4].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 0
		baseModel[4].setRotationPoint(5F, 16F, 10F);
		baseModel[4].rotateAngleX = 1.57079633F;
		baseModel[4].rotateAngleY = -0.26179939F;

		baseModel[5].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 1
		baseModel[5].setRotationPoint(9F, 16F, 10F);
		baseModel[5].rotateAngleX = 1.57079633F;
		baseModel[5].rotateAngleY = 0.26179939F;
		
		translateAll(0, -16, -8);
		itemOffset = new Vector3f(0F, -0.35F, 0.25F);
	}
}
