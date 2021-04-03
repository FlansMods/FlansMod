//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MedicBag
// Model Creator:
// Created on:22.05.2020 - 12:29:33
// Last changed on: 22.05.2020 - 12:29:33

package com.flansmod.modernweapons.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMedicBag extends ModelBase
{
	int textureX = 512;
	int textureY = 64;

	public ModelMedicBag()
	{
		medicbagModel = new ModelRendererTurbo[19];
		medicbagModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // NoName
		medicbagModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // NoName
		medicbagModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // NoName
		medicbagModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // NoName
		medicbagModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // NoName
		medicbagModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // NoName
		medicbagModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // NoName
		medicbagModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // NoName
		medicbagModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // NoName
		medicbagModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // NoName
		medicbagModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // NoName
		medicbagModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // NoName
		medicbagModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // NoName
		medicbagModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // NoName
		medicbagModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // NoName
		medicbagModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // NoName
		medicbagModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // NoName
		medicbagModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // NoName
		medicbagModel[18] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // NoName

		medicbagModel[0].addBox(0F, 0F, 0F, 12, 1, 22, 0F); // NoName
		medicbagModel[0].setRotationPoint(-6F, -1F, -11F);

		medicbagModel[1].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // NoName
		medicbagModel[1].setRotationPoint(-6F, 0F, -12F);

		medicbagModel[2].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // NoName
		medicbagModel[2].setRotationPoint(-6F, 0F, 11F);

		medicbagModel[3].addBox(0F, 0F, 0F, 1, 12, 22, 0F); // NoName
		medicbagModel[3].setRotationPoint(-7F, 0F, -11F);

		medicbagModel[4].addBox(0F, 0F, 0F, 1, 12, 22, 0F); // NoName
		medicbagModel[4].setRotationPoint(6F, 0F, -11F);

		medicbagModel[5].addBox(0F, 0F, 0F, 12, 3, 22, 0F); // NoName
		medicbagModel[5].setRotationPoint(-6F, 4.5F, -11F);

		medicbagModel[6].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // NoName
		medicbagModel[6].setRotationPoint(0F, 8F, -1F);
		medicbagModel[6].rotateAngleZ = 1.57079633F;

		medicbagModel[7].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // NoName
		medicbagModel[7].setRotationPoint(3F, 8F, 0F);
		medicbagModel[7].rotateAngleX = 1.57079633F;

		medicbagModel[8].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // NoName
		medicbagModel[8].setRotationPoint(0F, 7F, -4F);
		medicbagModel[8].rotateAngleZ = -1.57079633F;

		medicbagModel[9].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // NoName
		medicbagModel[9].setRotationPoint(-3F, 9F, 4F);
		medicbagModel[9].rotateAngleX = 1.57079633F;

		medicbagModel[10].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // NoName
		medicbagModel[10].setRotationPoint(2F, 7.25F, 4F);

		medicbagModel[11].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // NoName
		medicbagModel[11].setRotationPoint(0F, 8F, -2F);
		medicbagModel[11].rotateAngleX = -1.57079633F;
		medicbagModel[11].rotateAngleZ = 1.57079633F;

		medicbagModel[12].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // NoName
		medicbagModel[12].setRotationPoint(-3F, 8F, -1F);
		medicbagModel[12].rotateAngleZ = 1.57079633F;

		medicbagModel[13].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // NoName
		medicbagModel[13].setRotationPoint(2F, 9F, -7F);
		medicbagModel[13].rotateAngleX = 1.57079633F;

		medicbagModel[14].addBox(1F, 0F, 0F, 3, 4, 1, 0F); // NoName
		medicbagModel[14].setRotationPoint(-6F, 8F, -9F);
		medicbagModel[14].rotateAngleX = 1.57079633F;

		medicbagModel[15].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // NoName
		medicbagModel[15].setRotationPoint(-6F, 7.25F, 8F);
		medicbagModel[15].rotateAngleX = -1.57079633F;

		medicbagModel[16].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // NoName
		medicbagModel[16].setRotationPoint(0F, 7.25F, -9F);

		medicbagModel[17].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // NoName
		medicbagModel[17].setRotationPoint(-6F, 12F, -11F);

		medicbagModel[18].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // NoName
		medicbagModel[18].setRotationPoint(3F, 12F, -11F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 19; i++)
		{
			medicbagModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo medicbagModel[];
}