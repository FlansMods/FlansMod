//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.1
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.08.2015 - 14:43:45
// Last changed on: 07.08.2015 - 14:43:45

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelGermanChest extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public ModelGermanChest() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[25];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 35
		bodyModel[14] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 1
		bodyModel[19] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 3
		bodyModel[21] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 32
		
		bodyModel[0].addShapeBox(-4.5F, 7.3F, -2.2F, 16, 8, 5, 0F, 0.1F, 0F, 0.1F, -6.9F, 0F, 0.1F, -6.9F, 0F, -0.51F, 0.1F, 0F, -0.5F, 0.1F, -6.7F, 0.1F, -6.9F, -6.7F, 0.1F, -6.9F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Box 5
		bodyModel[0].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[1].addShapeBox(-3.3F, 1.3F, -2.2F, 8, 13, 1, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, 0F, -6.7F, 0.1F); // Box 6
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[2].addShapeBox(-3.3F, 0.3F, -2.2F, 8, 8, 1, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, 0F, -6.7F, 0.1F); // Box 7
		bodyModel[2].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[3].addShapeBox(2.3F, 0.3F, -2.2F, 8, 8, 1, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, 0F, -6.7F, 0.1F); // Box 8
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[4].addShapeBox(2.3F, 1.3F, -2.2F, 8, 13, 1, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, 0F, -6.7F, 0.1F); // Box 9
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[5].addShapeBox(-2.2F, 8.5F, -2.5F, 4, 4, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 10
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[6].addShapeBox(-3.3F, 0F, -2.2F, 8, 7, 5, 0F, 0F, 0.2F, 0.1F, -7F, 0.2F, 0.1F, -7F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, -0.6F, 0F, -6.7F, -0.6F); // Box 13
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[7].addShapeBox(2.3F, 0F, -2.2F, 8, 7, 5, 0F, 0F, 0.2F, 0.1F, -7F, 0.2F, 0.1F, -7F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, -0.6F, 0F, -6.7F, -0.6F); // Box 14
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[8].addShapeBox(-3.3F, 0.4F, 1.8F, 8, 10, 1, 0F, 0F, 0.1F, 0.1F, -7F, 0.1F, 0.1F, -7F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, -3F, -6F, 0.1F, -5F, -7.7F, 0.1F, -5F, -7.7F, -0.6F, -3F, -6F, -0.6F); // Box 15
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[9].addShapeBox(-4.7F, 0.4F, 1.8F, 8, 10, 1, 0F, -7F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.6F, -7F, 0.1F, -0.6F, -5F, -7.7F, 0.1F, -3F, -6F, 0.1F, -3F, -6F, -0.6F, -5F, -7.7F, -0.6F); // Box 18
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[10].addShapeBox(-0.5F, 2.7F, 1.8F, 8, 12, 1, 0F, 0.1F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, -0.51F, 0.1F, 0F, -0.5F, 0.1F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Box 20
		bodyModel[10].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[11].addShapeBox(-3F, 9F, 2F, 6, 2, 2, 0F, 0F, 1.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1.4F, 0.2F, 0.5F, -1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, -1.2F, 0.2F); // Box 22
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[12].addShapeBox(-4.3F, 0.3F, -3.3F, 11, 8, 1, 0F, -0.5F, 0F, 0.1F, -6.5F, -4.3F, 0.1F, -6.5F, -4.3F, 0.1F, -0.5F, 0F, 0.1F, 0.5F, -7F, 0.1F, -7.5F, -2.7F, 0.1F, -7.5F, -2.7F, 0.1F, 0.5F, -7F, 0.1F); // Box 27
		bodyModel[12].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[13].addShapeBox(-2F, 6.5F, 2F, 6, 1, 1, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 35
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[14].addShapeBox(-4.7F, 8.5F, -2.5F, 4, 4, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 36
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[15].addShapeBox(0.3F, 8.5F, -2.5F, 4, 4, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 37
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[16].addShapeBox(2.8F, 8.5F, -2.5F, 4, 4, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 38
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[17].addShapeBox(-4.2F, 1F, 4.8F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[17].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[18].addShapeBox(-4.2F, 1F, 1.8F, 8, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[19].addShapeBox(-4.2F, 1F, 2.8F, 8, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[20].addShapeBox(2.3F, 0.1F, 2.2F, 8, 7, 5, 0F, 0F, 0.1F, 0.1F, -7F, 0.1F, 0.1F, -7F, -0.9F, -2.6F, 0F, -0.9F, -2.6F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -5.7F, -2.6F, 0F, -5.7F, -2.6F); // Box 3
		bodyModel[20].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[21].addShapeBox(-3.3F, 0.1F, 2.2F, 8, 7, 5, 0F, 0F, 0.1F, 0.1F, -7F, 0.1F, 0.1F, -7F, -0.9F, -2.6F, 0F, -0.9F, -2.6F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -5.7F, -2.6F, 0F, -5.7F, -2.6F); // Box 4
		bodyModel[21].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[22].addShapeBox(-4.5F, 0F, -2F, 16, 18, 4, 0F, 0F, 0.1F, 0.1F, -7F, 0.1F, 0.1F, -7F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -6F, 0.1F, -7F, -6F, 0.1F, -7F, -6F, 0.1F, 0F, -6F, 0.1F); // Box 0
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[23].addShapeBox(-4.3F, 2.7F, -3.3F, 11, 8, 1, 0F, -0.5F, 0F, 0.1F, -6.5F, -4.3F, 0.1F, -6.5F, -4.3F, 0.1F, -0.5F, 0F, 0.1F, 0.5F, -7F, 0.1F, -7.5F, -2.7F, 0.1F, -7.5F, -2.7F, 0.1F, 0.5F, -7F, 0.1F); // Box 31
		bodyModel[23].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[24].addShapeBox(-4.3F, 5.1F, -3.3F, 11, 8, 1, 0F, -0.5F, 0F, 0.1F, -6.5F, -4.3F, 0.1F, -6.5F, -4.3F, 0.1F, -0.5F, 0F, 0.1F, 0.5F, -7F, 0.1F, -7.5F, -2.7F, 0.1F, -7.5F, -2.7F, 0.1F, 0.5F, -7F, 0.1F); // Box 32
		bodyModel[24].setRotationPoint(0F, 0F, 0F);
		
		
		leftArmModel = new ModelRendererTurbo[3];
		leftArmModel[0] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 26
		leftArmModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 31
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 42
		
		leftArmModel[0].addShapeBox(-1F, 4.8F, -2F, 4, 1, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 26
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		
		leftArmModel[1].addShapeBox(0.2F, -2.6F, -0.5F, 2, 1, 1, 0F, 0.4F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F); // Box 31
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		
		leftArmModel[2].addShapeBox(-1F, -2.2F, -2F, 8, 15, 4, 0F, 0.2F, 0F, 0.15F, -3.8F, 0F, 0.15F, -3.8F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, -8F, 0.15F, -3.8F, -8F, 0.15F, -3.8F, -8F, 0.15F, 0.2F, -8F, 0.15F); // Box 42
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		
		
		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		rightArmModel[1] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 25
		rightArmModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 30
		
		rightArmModel[0].addShapeBox(-3F, -2.2F, -2F, 8, 15, 4, 0F, 0.2F, 0F, 0.15F, -3.8F, 0F, 0.15F, -3.8F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, -7F, 0.15F, -3.8F, -7F, 0.15F, -3.8F, -7F, 0.15F, 0.2F, -7F, 0.15F); // Box 1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		
		rightArmModel[1].addShapeBox(-3F, 5.8F, -2F, 4, 1, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 25
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		
		rightArmModel[2].addShapeBox(-2.2F, -2.6F, -0.5F, 2, 1, 1, 0F, 0.1F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F); // Box 30
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		
		
	}
}
