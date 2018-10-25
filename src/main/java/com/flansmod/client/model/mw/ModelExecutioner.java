//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DoubleBarrelledShotgun
// Model Creator: 
// Created on: 24.12.2016 - 14:23:51
// Last changed on: 24.12.2016 - 14:23:51

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelExecutioner extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;
	
	public ModelExecutioner() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[5];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 
		
		gunModel[0].addShapeBox(-4F, 1F, -1F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import 
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunModel[1].addShapeBox(-3F, 3F, -1F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F); // Import 
		gunModel[1].setRotationPoint(0F, 0F, 0F);
		
		gunModel[2].addShapeBox(1F, 3F, -1F, 2, 1, 2, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Import 
		gunModel[2].setRotationPoint(0F, 0F, 0F);
		
		gunModel[3].addBox(1F, 4F, -1F, 1, 1, 2, 0F); // Import 
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		
		gunModel[4].addBox(-1.5F, 4F, -0.5F, 1, 1, 1, 0F); // Import 
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import 
		ammoModel[1] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import 
		
		ammoModel[0].addShapeBox(1.9F, 4F, -1F, 3, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import 
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[1].addShapeBox(1.9F, 4F, 0F, 3, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import 
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		
		
		breakActionModel = new ModelRendererTurbo[3];
		breakActionModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 
		breakActionModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import 
		breakActionModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		
		breakActionModel[0].addShapeBox(3F, 3F, -1F, 4, 1, 2, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Import 
		breakActionModel[0].setRotationPoint(0F, 0F, 0F);
		
		breakActionModel[1].addShapeBox(2F, 4F, -1F, 6, 1, 1, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Import 
		breakActionModel[1].setRotationPoint(0F, 0F, 0F);
		
		breakActionModel[2].addShapeBox(2F, 4F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 0
		breakActionModel[2].setRotationPoint(0F, 0F, 0F);
		
		animationType = EnumAnimationType.BREAK_ACTION;
		breakAngle = 60F;
		barrelBreakPoint = new Vector3f(3F / 16F, 2F / 16F, 0F);
	}
}
