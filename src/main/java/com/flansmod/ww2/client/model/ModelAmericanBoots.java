//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.1
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.01.2016 - 16:46:50
// Last changed on: 10.01.2016 - 16:46:50

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAmericanBoots extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public ModelAmericanBoots() //Same as Filename
	{
		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 46
		
		leftLegModel[0].addShapeBox(-2.2F, 7.2F, -2F, 8, 12, 4, 0F, 0.1F, -1F, 0.35F, -3.5F, -1F, 0.35F, -3.5F, -1F, 0.35F, 0.1F, -1F, 0.35F, 0.15F, -7F, 0.35F, -3.5F, -7F, 0.35F, -3.59F, -7F, 0.35F, 0.15F, -7F, 0.35F); // Box 46
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
		
		
		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 44
		
		rightLegModel[0].addShapeBox(-2.2F, 7.2F, -2F, 8, 12, 4, 0F, 0.1F, -1F, 0.35F, -3.5F, -1F, 0.35F, -3.5F, -1F, 0.35F, 0.1F, -1F, 0.35F, 0.15F, -7F, 0.35F, -3.5F, -7F, 0.35F, -3.59F, -7F, 0.35F, 0.15F, -7F, 0.35F); // Box 44
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
		
		
	}
}
