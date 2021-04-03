//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AmmoBag
// Model Creator:
// Created on:22.05.2020 - 12:29:33
// Last changed on: 22.05.2020 - 12:29:33

package com.flansmod.modernweapons.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAmmoBag extends ModelBase
{
	int textureX = 512;
	int textureY = 64;

	public ModelAmmoBag()
	{
		ammobagModel = new ModelRendererTurbo[20];
		ammobagModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // NoName
		ammobagModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // NoName
		ammobagModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // NoName
		ammobagModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // NoName
		ammobagModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // NoName
		ammobagModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // NoName
		ammobagModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // NoName
		ammobagModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // NoName
		ammobagModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // NoName
		ammobagModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // NoName
		ammobagModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // NoName
		ammobagModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // NoName
		ammobagModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // NoName
		ammobagModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // NoName
		ammobagModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // NoName
		ammobagModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // NoName
		ammobagModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // NoName
		ammobagModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // NoName
		ammobagModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // NoName
		ammobagModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // NoName

		ammobagModel[0].addBox(0F, 0F, 0F, 12, 1, 22, 0F); // NoName
		ammobagModel[0].setRotationPoint(-6F, -1F, -11F);

		ammobagModel[1].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // NoName
		ammobagModel[1].setRotationPoint(-6F, 0F, -12F);

		ammobagModel[2].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // NoName
		ammobagModel[2].setRotationPoint(-6F, 0F, 11F);

		ammobagModel[3].addBox(0F, 0F, 0F, 1, 12, 22, 0F); // NoName
		ammobagModel[3].setRotationPoint(-7F, 0F, -11F);

		ammobagModel[4].addBox(0F, 0F, 0F, 1, 12, 22, 0F); // NoName
		ammobagModel[4].setRotationPoint(6F, 0F, -11F);

		ammobagModel[5].addBox(0F, 0F, 0F, 12, 3, 22, 0F); // NoName
		ammobagModel[5].setRotationPoint(-6F, 4.5F, -11F);

		ammobagModel[6].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // NoName
		ammobagModel[6].setRotationPoint(-2F, 8F, 2F);
		ammobagModel[6].rotateAngleZ = 1.57079633F;

		ammobagModel[7].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // NoName
		ammobagModel[7].setRotationPoint(3F, 8F, 0F);
		ammobagModel[7].rotateAngleX = 1.57079633F;

		ammobagModel[8].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // NoName
		ammobagModel[8].setRotationPoint(0F, 7F, -4F);
		ammobagModel[8].rotateAngleZ = -1.57079633F;

		ammobagModel[9].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // NoName
		ammobagModel[9].setRotationPoint(-3F, 8F, 4F);
		ammobagModel[9].rotateAngleX = 1.57079633F;

		ammobagModel[10].addBox(1F, 0F, 0F, 5, 1, 1, 0F); // NoName
		ammobagModel[10].setRotationPoint(-2F, 7F, 9F);

		ammobagModel[11].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // NoName
		ammobagModel[11].setRotationPoint(2F, 7.25F, 5F);

		ammobagModel[12].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // NoName
		ammobagModel[12].setRotationPoint(0F, 8F, -1F);
		ammobagModel[12].rotateAngleX = -1.57079633F;
		ammobagModel[12].rotateAngleZ = 1.57079633F;

		ammobagModel[13].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // NoName
		ammobagModel[13].setRotationPoint(-2F, 8F, 0F);
		ammobagModel[13].rotateAngleZ = 1.57079633F;

		ammobagModel[14].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // NoName
		ammobagModel[14].setRotationPoint(2F, 8F, -5F);
		ammobagModel[14].rotateAngleX = 1.57079633F;

		ammobagModel[15].addBox(1F, 0F, 0F, 3, 4, 1, 0F); // NoName
		ammobagModel[15].setRotationPoint(-6F, 8F, -9F);
		ammobagModel[15].rotateAngleX = 1.57079633F;

		ammobagModel[16].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // NoName
		ammobagModel[16].setRotationPoint(-6F, 7.25F, 8F);
		ammobagModel[16].rotateAngleX = -1.57079633F;

		ammobagModel[17].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // NoName
		ammobagModel[17].setRotationPoint(0F, 7.25F, -11F);

		ammobagModel[18].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // NoName
		ammobagModel[18].setRotationPoint(-6F, 12F, -11F);

		ammobagModel[19].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // NoName
		ammobagModel[19].setRotationPoint(3F, 12F, -11F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 20; i++)
		{
			ammobagModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ammobagModel[];
}