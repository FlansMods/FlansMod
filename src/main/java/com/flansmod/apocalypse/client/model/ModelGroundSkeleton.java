//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.apocalypse.client.model;

import com.flansmod.client.model.ModelItemHolder;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGroundSkeleton extends ModelItemHolder
{
	int textureX = 32;
	int textureY = 16;

	public ModelGroundSkeleton()
	{
		baseModel = new ModelRendererTurbo[3];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		baseModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		baseModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3

		baseModel[0].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Box 1
		baseModel[0].setRotationPoint(4F, -4F, 0F);
		baseModel[0].rotateAngleX = 0.52359878F;

		baseModel[1].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 2
		baseModel[1].setRotationPoint(1F, 6F, 9F);
		baseModel[1].rotateAngleX = 2.35619449F;
		baseModel[1].rotateAngleY = -0.26179939F;

		baseModel[2].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 3
		baseModel[2].setRotationPoint(13F, 6F, 8F);
		baseModel[2].rotateAngleX = 2.35619449F;
		baseModel[2].rotateAngleY = 0.26179939F;
		
		itemOffset = new Vector3f(0F, -0.35F, 0.5F);
		//itemRotation = new Vector3f(-30F, 0F, 0F);
	}
}
