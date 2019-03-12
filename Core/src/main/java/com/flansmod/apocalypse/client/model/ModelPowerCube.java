//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.apocalypse.client.model;

import net.minecraft.client.model.ModelBase;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPowerCube extends ModelBase
{
	int textureX = 512;
	int textureY = 32;
	
	private ModelRendererTurbo[] bodyModel;
	
	public ModelPowerCube()
	{
		bodyModel = new ModelRendererTurbo[13];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 12
		
		bodyModel[0].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -2F, 0F);
		
		bodyModel[1].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, -2F, 14F);
		
		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 2
		bodyModel[2].setRotationPoint(0F, -2F, 2F);
		
		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 3
		bodyModel[3].setRotationPoint(14F, -2F, 2F);
		
		bodyModel[4].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(0F, -16F, 0F);
		
		bodyModel[5].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, -16F, 14F);
		
		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 6
		bodyModel[6].setRotationPoint(14F, -16F, 2F);
		
		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 7
		bodyModel[7].setRotationPoint(0F, -16F, 2F);
		
		bodyModel[8].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 8
		bodyModel[8].setRotationPoint(0F, -14F, 0F);
		
		bodyModel[9].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 9
		bodyModel[9].setRotationPoint(14F, -14F, 0F);
		
		bodyModel[10].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 10
		bodyModel[10].setRotationPoint(14F, -14F, 14F);
		
		bodyModel[11].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 11
		bodyModel[11].setRotationPoint(0F, -14F, 14F);
		
		bodyModel[12].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Box 12
		bodyModel[12].setRotationPoint(4F, -12F, 4F);
	}
	
	public void render()
	{
		float f5 = 0.0625F;
		
		for(int i = 0; i < 12; i++)
		{
			bodyModel[i].render(f5);
		}
	}
	
	public void renderPower()
	{
		bodyModel[12].render(0.0625F);
	}
}
