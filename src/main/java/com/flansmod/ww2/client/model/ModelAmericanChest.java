//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.1
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.01.2016 - 16:47:11
// Last changed on: 10.01.2016 - 16:47:11

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAmericanChest extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public ModelAmericanChest() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[27];
		bodyModel[0] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 91
		bodyModel[9] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 94
		bodyModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 95
		bodyModel[13] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 97
		bodyModel[14] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 98
		bodyModel[15] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 99
		bodyModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 100
		bodyModel[17] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 101
		bodyModel[18] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 104
		bodyModel[19] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 113
		bodyModel[20] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 114
		bodyModel[21] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 4
		bodyModel[26] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 5
		
		bodyModel[0].addShapeBox(-4.5F, 0F, -2F, 16, 18, 4, 0F, 0F, 0.1F, 0.1F, -7F, 0.1F, 0.1F, -7F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -6F, 0.1F, -7F, -6F, 0.1F, -7F, -6F, 0.1F, 0F, -6F, 0.1F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[1].addShapeBox(-4.5F, 9.6F, -2.2F, 16, 8, 5, 0F, 0.1F, 0F, 0.1F, -6.9F, 0F, 0.1F, -6.9F, 0F, -0.51F, 0.1F, 0F, -0.5F, 0.1F, -6.7F, 0.1F, -6.9F, -6.7F, 0.1F, -6.9F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Box 5
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[2].addShapeBox(-3.3F, 1.6F, -2.2F, 8, 15, 1, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, 0F, -6.7F, 0.1F); // Box 6
		bodyModel[2].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[3].addShapeBox(-3.3F, 0.3F, -2.2F, 8, 8, 1, 0F, 0F, 0F, 0.2F, -7F, 0F, 0.2F, -7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -6.7F, 0.2F, -7F, -6.7F, 0.2F, -7F, -6.7F, 0.1F, 0F, -6.7F, 0.1F); // Box 7
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[4].addShapeBox(2.3F, 1.6F, -2.2F, 8, 15, 1, 0F, 0F, 0F, 0.1F, -7F, 0F, 0.1F, -7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, 0F, -6.7F, 0.1F); // Box 9
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[5].addShapeBox(-3.3F, 0F, -2.2F, 8, 7, 5, 0F, 0F, 0.2F, 0.1F, -7F, 0.2F, 0.1F, -7F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, -0.6F, 0F, -6.7F, -0.6F); // Box 13
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[6].addShapeBox(2.3F, 0F, -2.2F, 8, 7, 5, 0F, 0F, 0.2F, 0.1F, -7F, 0.2F, 0.1F, -7F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, -6.7F, 0.1F, -7F, -6.7F, 0.1F, -7F, -6.7F, -0.6F, 0F, -6.7F, -0.6F); // Box 14
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[7].addShapeBox(-4.7F, 0.4F, 1.8F, 8, 16, 1, 0F, -7F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.6F, -7F, 0.1F, -0.6F, -6F, -6F, 0.1F, -1F, -6F, 0.1F, -1F, -6F, -0.6F, -6F, -6F, -0.6F); // Box 18
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[8].addShapeBox(-3.3F, 0.4F, 1.8F, 8, 16, 1, 0F, 0F, 0.1F, 0.1F, -7F, 0.1F, 0.1F, -7F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, -1F, -6F, 0.1F, -6F, -6F, 0.1F, -6F, -6F, -0.6F, -1F, -6F, -0.6F); // Box 91
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[9].addShapeBox(-3.5F, 1F, 4.2F, 7, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[10].addShapeBox(-3.5F, 1F, 2.2F, 7, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[10].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[11].addShapeBox(-3.5F, 0F, 2.5F, 7, 5, 3, 0F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -1F, 0F, 0.05F, -1F, 0F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -1F, 0F, 0.05F, -1F, 0F); // Box 94
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[12].addShapeBox(-3F, 2F, 4.6F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[12].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[13].addShapeBox(-3F, 4F, 4.6F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 97
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[14].addShapeBox(2F, 4F, 4.6F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 98
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[15].addShapeBox(2F, 2F, 4.6F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[16].addShapeBox(2F, 5F, 4.6F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 100
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[17].addShapeBox(-3F, 5F, 4.6F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 101
		bodyModel[17].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[18].addShapeBox(2.3F, 0.3F, -2.2F, 8, 8, 1, 0F, 0F, 0F, 0.2F, -7F, 0F, 0.2F, -7F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -6.7F, 0.2F, -7F, -6.7F, 0.2F, -7F, -6.7F, 0.1F, 0F, -6.7F, 0.1F); // Box 104
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[19].addBox(-4F, 9F, 2F, 3, 3, 2, 0F); // Box 113
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[20].addBox(-3F, 8.5F, 2.5F, 1, 1, 1, 0F); // Box 114
		bodyModel[20].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[21].addShapeBox(-3.3F, 0.3F, -2.2F, 3, 2, 1, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[22].addShapeBox(-0.3F, 1F, -2.25F, 3, 2, 1, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[23].addShapeBox(-0.5F, 3.7F, -1.8F, 1, 1, 1, 0F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F); // Box 2
		bodyModel[23].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[24].addShapeBox(-0.5F, 5.7F, -1.8F, 1, 1, 1, 0F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F); // Box 3
		bodyModel[24].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[25].addShapeBox(-0.5F, 7.7F, -1.8F, 1, 1, 1, 0F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F); // Box 4
		bodyModel[25].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[26].addShapeBox(-1F, 2.7F, -1.8F, 1, 7, 1, 0F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, 0.35F, -0.4F, -0.2F, 0.35F); // Box 5
		bodyModel[26].setRotationPoint(0F, 0F, 0F);
		
		
		leftArmModel = new ModelRendererTurbo[5];
		leftArmModel[0] = new ModelRendererTurbo(this, 70, 93, textureX, textureY); // Box 68
		leftArmModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 102
		leftArmModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 103
		leftArmModel[3] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 53
		leftArmModel[4] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 54
		
		leftArmModel[0].addShapeBox(3.2F, -1.1F, -1F, 4, 92, 69, 0F, 0.1F, 0F, 0.15F, -3.85F, 0F, 0.15F, -3.85F, 0F, -66.85F, 0.1F, 0F, -66.85F, 0.15F, -89F, 0.15F, -3.85F, -89F, 0.15F, -3.85F, -89F, -66.85F, 0.15F, -89F, -66.85F); // Box 68
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		
		leftArmModel[1].addShapeBox(2.1F, 4.7F, -1.5F, 1, 1, 2, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 102
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		
		leftArmModel[2].addShapeBox(2.1F, 4.7F, -0.8F, 1, 1, 1, 0F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F); // Box 103
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		
		leftArmModel[3].addShapeBox(-1.1F, 5.9F, -2F, 8, 1, 4, 0F, 0.2F, 0F, 0.15F, -3.8F, 0F, 0.15F, -3.8F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0F, 0F, 0.15F, -3.9F, 0F, 0.15F, -3.9F, 0F, 0.15F, 0.1F, 0F, 0.15F); // Box 53
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		
		leftArmModel[4].addShapeBox(-1.1F, -2.1F, -2F, 8, 15, 4, 0F, 0.1F, 0.2F, 0.15F, -3.8F, 0.2F, 0.15F, -3.8F, 0.2F, 0.15F, 0.1F, 0.2F, 0.15F, 0.15F, -7F, 0.15F, -3.8F, -7F, 0.15F, -3.8F, -7F, 0.15F, 0.15F, -7F, 0.15F); // Box 54
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		
		
		rightArmModel = new ModelRendererTurbo[5];
		rightArmModel[0] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 1
		rightArmModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 72
		rightArmModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 74
		rightArmModel[3] = new ModelRendererTurbo(this, 70, 93, textureX, textureY); // Box 115
		rightArmModel[4] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 8
		
		rightArmModel[0].addShapeBox(-3.1F, -2.1F, -2F, 8, 15, 4, 0F, 0.1F, 0.2F, 0.15F, -3.8F, 0.2F, 0.15F, -3.8F, 0.2F, 0.15F, 0.1F, 0.2F, 0.15F, 0.15F, -7F, 0.15F, -3.8F, -7F, 0.15F, -3.8F, -7F, 0.15F, 0.15F, -7F, 0.15F); // Box 1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		
		rightArmModel[1].addShapeBox(-3.2F, 4.7F, -1.5F, 1, 1, 2, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 72
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		
		rightArmModel[2].addShapeBox(-3.2F, 4.7F, -0.8F, 1, 1, 1, 0F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F); // Box 74
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		
		rightArmModel[3].addShapeBox(-7.3F, -1.1F, -1F, 4, 92, 69, 0F, -3.85F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, -66.85F, -3.85F, 0F, -66.85F, -3.85F, -89F, 0.15F, 0.15F, -89F, 0.15F, 0.15F, -89F, -66.85F, -3.85F, -89F, -66.85F); // Box 115
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		
		rightArmModel[4].addShapeBox(-3.1F, 5.9F, -2F, 8, 1, 4, 0F, 0.2F, 0F, 0.15F, -3.8F, 0F, 0.15F, -3.8F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0F, 0F, 0.15F, -3.9F, 0F, 0.15F, -3.9F, 0F, 0.15F, 0.1F, 0F, 0.15F); // Box 8
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		
		
	}
}
