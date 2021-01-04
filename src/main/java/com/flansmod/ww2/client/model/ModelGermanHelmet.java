//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.1
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.01.2016 - 21:19:43
// Last changed on: 09.01.2016 - 21:19:43

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelGermanHelmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public ModelGermanHelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[9];
		headModel[0] = new ModelRendererTurbo(this, 35, 95, textureX, textureY); // Box 15
		headModel[1] = new ModelRendererTurbo(this, 75, 90, textureX, textureY); // Box 16
		headModel[2] = new ModelRendererTurbo(this, 75, 90, textureX, textureY); // Box 17
		headModel[3] = new ModelRendererTurbo(this, 50, 110, textureX, textureY); // Box 9
		headModel[4] = new ModelRendererTurbo(this, 55, 110, textureX, textureY); // Box 6
		headModel[5] = new ModelRendererTurbo(this, 35, 90, textureX, textureY); // Box 7
		headModel[6] = new ModelRendererTurbo(this, 45, 85, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 15, 105, textureX, textureY); // Box 12
		headModel[8] = new ModelRendererTurbo(this, 45, 85, textureX, textureY); // Box 14
		
		headModel[0].addShapeBox(-4.5F, -0.5F, -3F, 9, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		headModel[0].setRotationPoint(0F, 0F, 0F);
		
		headModel[1].addShapeBox(-4.5F, -4F, -3F, 1, 4, 1, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		headModel[1].setRotationPoint(0F, 0F, 0F);
		
		headModel[2].addShapeBox(3.5F, -4F, -3F, 1, 4, 1, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 17
		headModel[2].setRotationPoint(0F, 0F, 0F);
		
		headModel[3].addShapeBox(-3.5F, -5F, 3.5F, 7, 3, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.5F, -1F, 1.5F, -0.5F, -1F, 1.5F, -0.5F, 1F, 1.5F, -0.5F, 1F); // Box 9
		headModel[3].setRotationPoint(0F, 0F, 0F);
		
		headModel[4].addShapeBox(-4F, -8F, -4F, 16, 1, 16, 0F, -0.1F, 0.2F, -0.1F, -8.1F, 0.2F, -0.1F, -8.1F, 0.2F, -8.1F, -0.1F, 0.2F, -8.1F, 0.3F, -0.5F, 0.3F, -7.7F, -0.5F, 0.3F, -7.7F, -0.5F, -7.7F, 0.3F, -0.5F, -7.7F); // Box 6
		headModel[4].setRotationPoint(0F, 0F, 0F);
		
		headModel[5].addShapeBox(-4.5F, -6F, -5F, 9, 1, 1, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		headModel[5].setRotationPoint(0F, 0F, 0F);
		
		headModel[6].addShapeBox(3.5F, -5F, -3F, 1, 3, 16, 0F, -0.5F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -8.5F, -0.5F, 0F, -8.5F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -7.5F, -1.5F, -0.5F, -7.5F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);
		
		headModel[7].addShapeBox(-4F, -7F, -4F, 8, 2, 16, 0F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, -7.7F, 0.3F, 0.5F, -7.7F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -7.5F, 0.5F, 0F, -7.5F); // Box 12
		headModel[7].setRotationPoint(0F, 0F, 0F);
		
		headModel[8].addShapeBox(-4.5F, -5F, -3F, 1, 3, 16, 0F, 0F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -8.5F, 0F, 0F, -8.5F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, -7.5F, 1F, -0.5F, -7.5F); // Box 14
		headModel[8].setRotationPoint(0F, 0F, 0F);
		
		
	}
}
