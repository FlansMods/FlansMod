//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M8Smoke
// Model Creator:
// Created on:07.10.2016 - 09:34:44
// Last changed on: 07.10.2016 - 09:34:44

package com.flansmod.ww2.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelM8Smoke extends ModelBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelM8Smoke()
	{
		m8smokeModel = new ModelRendererTurbo[18];
		m8smokeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
		m8smokeModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 103
		m8smokeModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 108
		m8smokeModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 109
		m8smokeModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 110
		m8smokeModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 111
		m8smokeModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 112
		m8smokeModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 115
		m8smokeModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 117
		m8smokeModel[9] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 118
		m8smokeModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 119
		m8smokeModel[11] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 120
		m8smokeModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 121
		m8smokeModel[13] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 122
		m8smokeModel[14] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 123
		m8smokeModel[15] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 17
		m8smokeModel[16] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 18
		m8smokeModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19

		m8smokeModel[0].addShapeBox(-1.5F, -14F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 102
		m8smokeModel[0].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[0].rotateAngleX = 3.14159265F;
		m8smokeModel[0].rotateAngleY = -3.14159265F;

		m8smokeModel[1].addShapeBox(-2.5F, -14F, -2F, 1, 4, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 103
		m8smokeModel[1].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[1].rotateAngleX = 3.14159265F;
		m8smokeModel[1].rotateAngleY = -3.14159265F;

		m8smokeModel[2].addShapeBox(2.5F, -14F, -1.5F, 3, 4, 3, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F); // Box 108
		m8smokeModel[2].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[2].rotateAngleX = 3.14159265F;
		m8smokeModel[2].rotateAngleY = -3.14159265F;

		m8smokeModel[3].addShapeBox(-1.5F, -14.5F, -2F, 4, 1, 4, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0.2F); // Box 109
		m8smokeModel[3].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[3].rotateAngleX = 3.14159265F;
		m8smokeModel[3].rotateAngleY = -3.14159265F;

		m8smokeModel[4].addShapeBox(-3.5F, -14.5F, -2F, 2, 1, 4, 0F, -0.8F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -1F, 0.2F, -0.5F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -1F); // Box 110
		m8smokeModel[4].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[4].rotateAngleX = 3.14159265F;
		m8smokeModel[4].rotateAngleY = -3.14159265F;

		m8smokeModel[5].addShapeBox(4F, -14F, -1F, 1, 4, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2.3F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -2.3F, 0F, 0F); // Box 111
		m8smokeModel[5].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[5].rotateAngleX = 3.14159265F;
		m8smokeModel[5].rotateAngleY = -3.14159265F;

		m8smokeModel[6].addShapeBox(6F, -10F, -1F, 1, 5, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2.3F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -2.3F, 0F, 0F); // Box 112
		m8smokeModel[6].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[6].rotateAngleX = 3.14159265F;
		m8smokeModel[6].rotateAngleY = -3.14159265F;

		m8smokeModel[7].addShapeBox(8F, -5F, -1F, 1, 5, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, 0F, 0F); // Box 115
		m8smokeModel[7].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[7].rotateAngleX = 3.14159265F;
		m8smokeModel[7].rotateAngleY = -3.14159265F;

		m8smokeModel[8].addShapeBox(2.5F, -14.5F, -2F, 2, 1, 4, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 117
		m8smokeModel[8].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[8].rotateAngleX = 3.14159265F;
		m8smokeModel[8].rotateAngleY = -3.14159265F;

		m8smokeModel[9].addShapeBox(-3.7F, -14F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118
		m8smokeModel[9].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[9].rotateAngleX = 3.14159265F;
		m8smokeModel[9].rotateAngleY = -3.14159265F;

		m8smokeModel[10].addShapeBox(4.5F, -13F, -3.5F, 1, 1, 5, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 119
		m8smokeModel[10].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[10].rotateAngleX = 3.14159265F;
		m8smokeModel[10].rotateAngleY = -3.14159265F;

		m8smokeModel[11].addShapeBox(5F, -13.5F, -3.5F, 4, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F); // Box 120
		m8smokeModel[11].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[11].rotateAngleX = 3.14159265F;
		m8smokeModel[11].rotateAngleY = -3.14159265F;

		m8smokeModel[12].addShapeBox(4F, -12.5F, -3.5F, 1, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 121
		m8smokeModel[12].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[12].rotateAngleX = 3.14159265F;
		m8smokeModel[12].rotateAngleY = -3.14159265F;

		m8smokeModel[13].addShapeBox(9F, -12.5F, -3.5F, 1, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 122
		m8smokeModel[13].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[13].rotateAngleX = 3.14159265F;
		m8smokeModel[13].rotateAngleY = -3.14159265F;

		m8smokeModel[14].addShapeBox(5F, -8.5F, -3.5F, 4, 1, 1, 0F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 123
		m8smokeModel[14].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[14].rotateAngleX = 3.14159265F;
		m8smokeModel[14].rotateAngleY = -3.14159265F;

		m8smokeModel[15].addShapeBox(-4.5F, -10F, -5F, 3, 22, 10, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 17
		m8smokeModel[15].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[15].rotateAngleX = 3.14159265F;
		m8smokeModel[15].rotateAngleY = -3.14159265F;

		m8smokeModel[16].addShapeBox(2.5F, -10F, -5F, 3, 22, 10, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 18
		m8smokeModel[16].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[16].rotateAngleX = 3.14159265F;
		m8smokeModel[16].rotateAngleY = -3.14159265F;

		m8smokeModel[17].addShapeBox(-1.5F, -10F, -5F, 4, 22, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		m8smokeModel[17].setRotationPoint(0F, 0F, 0F);
		m8smokeModel[17].rotateAngleX = 3.14159265F;
		m8smokeModel[17].rotateAngleY = -3.14159265F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		GlStateManager.scale(0.2F, 0.2F, 0.2F);

		for(int i = 0; i < 18; i++)
		{
			m8smokeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo m8smokeModel[];
}
