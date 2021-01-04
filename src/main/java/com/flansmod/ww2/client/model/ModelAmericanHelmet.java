//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.1
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.01.2016 - 16:44:51
// Last changed on: 10.01.2016 - 16:44:51

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAmericanHelmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public ModelAmericanHelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[10];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 15
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		headModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 13
		headModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 14
		headModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 15
		
		headModel[0].addShapeBox(-4.5F, -6.5F, -4.5F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);
		
		headModel[1].addShapeBox(-4.5F, -7.5F, -4.5F, 9, 1, 9, 0F, -0.3F, 1F, -0.2F, -0.3F, 1F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);
		
		headModel[2].addShapeBox(-4.5F, -8.5F, -4.5F, 18, 1, 18, 0F, -1F, 0.9F, -1.5F, -10F, 0.9F, -1.5F, -10F, 0.5F, -10.2F, -1F, 0.5F, -10.2F, -0.3F, -1F, -0.2F, -9.3F, -1F, -0.2F, -9.3F, -0.5F, -9.2F, -0.3F, -0.5F, -9.2F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);
		
		headModel[3].addShapeBox(-4.5F, -5.5F, -5F, 9, 1, 10, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);
		
		headModel[4].addShapeBox(-4.5F, -0.5F, -3.5F, 9, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		headModel[4].setRotationPoint(0F, 0F, 0F);
		
		headModel[5].addShapeBox(-4.5F, -5.5F, -4.5F, 1, 6, 1, 0F, 0F, -0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 16
		headModel[5].setRotationPoint(0F, 0F, 0F);
		
		headModel[6].addShapeBox(-4.5F, -6.5F, -5F, 1, 3, 1, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, -3F, -0.5F, 0.5F, -3F, -0.5F, -0.5F, 2F, 0F, -0.5F, 2F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);
		
		headModel[7].addShapeBox(-6F, -6.5F, -5F, 11, 2, 1, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 13
		headModel[7].setRotationPoint(0F, 0F, 0F);
		
		headModel[8].addShapeBox(3.5F, -5.5F, -4.5F, 1, 6, 1, 0F, -0.5F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 2F, -0.5F, -0.5F, 2F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F); // Box 14
		headModel[8].setRotationPoint(0F, 0F, 0F);
		
		headModel[9].addShapeBox(3.5F, -6.5F, -5F, 1, 3, 1, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, 2F, -0.5F, -0.5F, 2F); // Box 15
		headModel[9].setRotationPoint(0F, 0F, 0F);
		
		
	}
}
