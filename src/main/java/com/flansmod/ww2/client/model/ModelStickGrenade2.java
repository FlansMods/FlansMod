//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.3
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.02.2016 - 21:12:44
// Last changed on: 14.02.2016 - 21:12:44

package com.flansmod.ww2.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelStickGrenade2 extends ModelBase
{
	int textureX = 128;
	int textureY = 64;
	
	public ModelStickGrenade2()
	{
		stickgrenadeModel = new ModelRendererTurbo[20];
		stickgrenadeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		stickgrenadeModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		stickgrenadeModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		stickgrenadeModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		stickgrenadeModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		stickgrenadeModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
		stickgrenadeModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		stickgrenadeModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 8
		stickgrenadeModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 10
		stickgrenadeModel[9] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 11
		stickgrenadeModel[10] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 13
		stickgrenadeModel[11] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 14
		stickgrenadeModel[12] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 15
		stickgrenadeModel[13] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 16
		stickgrenadeModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 17
		stickgrenadeModel[15] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 18
		stickgrenadeModel[16] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 19
		stickgrenadeModel[17] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 20
		stickgrenadeModel[18] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 22
		stickgrenadeModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 23
		
		stickgrenadeModel[0].addShapeBox(-2F, 0F, -2.5F, 5, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		stickgrenadeModel[0].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[0].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[1].addShapeBox(-2F, -4F, -2.5F, 5, 4, 5, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		stickgrenadeModel[1].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[1].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[2].addShapeBox(-2F, -21F, -2.5F, 5, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 3
		stickgrenadeModel[2].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[2].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[3].addShapeBox(-1.5F, -13F, -2F, 4, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		stickgrenadeModel[3].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[3].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[4].addShapeBox(-2F, -25F, -2.5F, 5, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		stickgrenadeModel[4].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[4].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[5].addShapeBox(-2F, -27F, -2.5F, 5, 2, 5, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 6
		stickgrenadeModel[5].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[5].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[6].addShapeBox(-1.5F, -39F, -3.5F, 4, 11, 7, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F); // Box 7
		stickgrenadeModel[6].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[6].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[7].addShapeBox(4F, -39F, -3.5F, 1, 11, 7, 0F, 1F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 1F, 0F, 1.5F); // Box 8
		stickgrenadeModel[7].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[7].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[8].addShapeBox(-4F, -39F, -3.5F, 1, 11, 7, 0F, 0.5F, 0F, -1.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 0.5F, 0F, -1.5F); // Box 10
		stickgrenadeModel[8].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[8].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[9].addShapeBox(-1.5F, -28F, -3.5F, 4, 1, 7, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F); // Box 11
		stickgrenadeModel[9].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[9].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[10].addShapeBox(4F, -28F, -3.5F, 1, 1, 7, 0F, 1F, 0F, 2F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 2F); // Box 13
		stickgrenadeModel[10].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[10].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[11].addShapeBox(-4F, -28F, -3.5F, 1, 1, 7, 0F, 1F, 0F, -1.5F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -1.5F); // Box 14
		stickgrenadeModel[11].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[11].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[12].addShapeBox(-2F, 2.8F, -2.5F, 5, 1, 5, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 15
		stickgrenadeModel[12].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[12].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[13].addShapeBox(-2F, 2.2F, -2.5F, 5, 1, 5, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 16
		stickgrenadeModel[13].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[13].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[14].addShapeBox(-2F, 2F, -2.5F, 5, 2, 5, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 17
		stickgrenadeModel[14].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[14].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[15].addShapeBox(-2F, -24.8F, -2.5F, 5, 1, 5, 0F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F); // Box 18
		stickgrenadeModel[15].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[15].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[16].addShapeBox(-2F, -23.8F, -2.5F, 5, 1, 5, 0F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F); // Box 19
		stickgrenadeModel[16].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[16].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[17].addShapeBox(-1.5F, -39.5F, -3.5F, 4, 1, 7, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 20
		stickgrenadeModel[17].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[17].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[18].addShapeBox(-4F, -39.5F, -3.5F, 1, 1, 7, 0F, 0F, 0F, -2F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -2F); // Box 22
		stickgrenadeModel[18].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[18].rotateAngleZ = 3.14159265F;
		
		stickgrenadeModel[19].addShapeBox(4F, -39.5F, -3.5F, 1, 1, 7, 0F, 1F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0.5F); // Box 23
		stickgrenadeModel[19].setRotationPoint(0F, -10F, 0F);
		stickgrenadeModel[19].rotateAngleZ = 3.14159265F;
		
		
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		
		GlStateManager.scale(0.2F, 0.2F, 0.2F);
		
		for(int i = 0; i < 20; i++)
		{
			stickgrenadeModel[i].render(f5);
		}
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
	
	public ModelRendererTurbo stickgrenadeModel[];
}
