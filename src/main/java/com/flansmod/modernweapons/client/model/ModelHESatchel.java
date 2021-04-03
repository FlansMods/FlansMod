//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HESatchel
// Model Creator:
// Created on:21.06.2020 - 21:25:37
// Last changed on: 21.06.2020 - 21:25:37

package com.flansmod.modernweapons.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHESatchel extends ModelBase
{
	int textureX = 128;
	int textureY = 16;

	public ModelHESatchel()
	{
		hesatchelModel = new ModelRendererTurbo[5];
		hesatchelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		hesatchelModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import 
		hesatchelModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		hesatchelModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		hesatchelModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 

		hesatchelModel[0].addBox(-2F, 0F, -3F, 5, 2, 6, 0F); // Import 
		hesatchelModel[0].setRotationPoint(-1F, 0F, 0F);

		hesatchelModel[1].addBox(-1F, 1.5F, -2F, 4, 2, 5, 0F); // Import 
		hesatchelModel[1].setRotationPoint(-2.25F, -0.75F, -0.5F);

		hesatchelModel[2].addBox(-2F, 0F, -3F, 1, 2, 2, 0F); // Import 
		hesatchelModel[2].setRotationPoint(1F, 1F, 1F);

		hesatchelModel[3].addBox(-2F, 0F, -3F, 1, 2, 2, 0F); // Import 
		hesatchelModel[3].setRotationPoint(-1F, 1F, 1F);

		hesatchelModel[4].addBox(-1F, 1.5F, -2F, 2, 2, 4, 0F); // Import 
		hesatchelModel[4].setRotationPoint(0.75F, -1.1F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 5; i++)
		{
			hesatchelModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo hesatchelModel[];
}