//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.1
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.08.2015 - 14:44:02
// Last changed on: 07.08.2015 - 14:44:02

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelGermanPants extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public ModelGermanPants() //Same as Filename
	{
		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 4
		
		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F); // Box 4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
		
		
		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		
		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F); // Box 3
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
		
		
	}
}
