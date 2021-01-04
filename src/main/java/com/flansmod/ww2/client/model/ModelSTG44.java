//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.02.2016 - 19:53:01
// Last changed on: 12.02.2016 - 19:53:01

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSTG44 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	public ModelSTG44() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[56];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 15
		gunModel[9] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 16
		gunModel[10] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 18
		gunModel[11] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 19
		gunModel[12] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 20
		gunModel[13] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 21
		gunModel[14] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 22
		gunModel[15] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 23
		gunModel[16] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 24
		gunModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 25
		gunModel[18] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 26
		gunModel[19] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 27
		gunModel[20] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 28
		gunModel[21] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 29
		gunModel[22] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 30
		gunModel[23] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 31
		gunModel[24] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 32
		gunModel[25] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 33
		gunModel[26] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 34
		gunModel[27] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 35
		gunModel[28] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 36
		gunModel[29] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 37
		gunModel[30] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 41
		gunModel[31] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 44
		gunModel[32] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 46
		gunModel[33] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 47
		gunModel[34] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 50
		gunModel[35] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 51
		gunModel[36] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 52
		gunModel[37] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 53
		gunModel[38] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 54
		gunModel[39] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 55
		gunModel[40] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 59
		gunModel[41] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 60
		gunModel[42] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 65
		gunModel[43] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 66
		gunModel[44] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 67
		gunModel[45] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 70
		gunModel[46] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 71
		gunModel[47] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 72
		gunModel[48] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 73
		gunModel[49] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 74
		gunModel[50] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 83
		gunModel[51] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 84
		gunModel[52] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 85
		gunModel[53] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 71
		gunModel[54] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Box 72
		gunModel[55] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 73
		
		gunModel[0].addShapeBox(0F, 0F, 0F, 20, 35, 10, 0F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, 1F, 0F, -0.15F, -1F, 0F, -0.15F, 11F, 0F, -0.15F, -13F, 0F, -0.15F, -13F, 0F, -0.15F, 11F, 0F, -0.15F); // Box 0
		gunModel[0].setRotationPoint(-6F, -31F, -5F);
		
		gunModel[1].addShapeBox(0F, 0F, 0F, 20, 8, 10, 0F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, -3F, -1F, -0.15F, -7F, -1F, -0.15F, -7F, -1F, -0.15F, -3F, -1F, -0.15F); // Box 1
		gunModel[1].setRotationPoint(-18F, 4F, -5F);
		
		gunModel[2].addShapeBox(0F, 0F, 0F, 55, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-6F, -37F, -5F);
		
		gunModel[3].addShapeBox(0F, 0F, 0F, 16, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[3].setRotationPoint(33F, -31F, -5F);
		
		gunModel[4].addShapeBox(0F, 0F, 0F, 5, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 6
		gunModel[4].setRotationPoint(28F, -31F, -5F);
		
		gunModel[5].addShapeBox(0F, 0F, 0F, 28, 23, 10, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0F, 0.6F); // Box 8
		gunModel[5].setRotationPoint(51F, -45F, -5F);
		
		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 23, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F); // Box 9
		gunModel[6].setRotationPoint(49F, -45F, -5F);
		
		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 23, 10, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, -2F, 0.6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.6F); // Box 10
		gunModel[7].setRotationPoint(79F, -45F, -5F);
		
		gunModel[8].addShapeBox(0F, 0F, 0F, 55, 2, 10, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[8].setRotationPoint(-6F, -39F, -5F);
		
		gunModel[9].addShapeBox(0F, 0F, 0F, 59, 8, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 16
		gunModel[9].setRotationPoint(-8F, -47F, -6F);
		
		gunModel[10].addShapeBox(0F, 0F, 0F, 59, 2, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[10].setRotationPoint(-8F, -55F, -6F);
		
		gunModel[11].addShapeBox(0F, 0F, 0F, 59, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[11].setRotationPoint(-8F, -53F, -6F);
		
		gunModel[12].addShapeBox(0F, 0F, 0F, 59, 12, 10, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 20
		gunModel[12].setRotationPoint(51F, -57F, -5F);
		
		gunModel[13].addShapeBox(0F, 0F, 0F, 59, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 21
		gunModel[13].setRotationPoint(-8F, -57F, -6F);
		
		gunModel[14].addShapeBox(0F, 0F, 0F, 118, 5, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[14].setRotationPoint(-8F, -66F, -6F);
		
		gunModel[15].addShapeBox(0F, 0F, 0F, 118, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[15].setRotationPoint(-8F, -61F, -6F);
		
		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[16].setRotationPoint(-8F, -61F, 4F);
		
		gunModel[17].addShapeBox(0F, 0F, 0F, 23, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[17].setRotationPoint(87F, -61F, 4F);
		
		gunModel[18].addShapeBox(0F, 0F, 0F, 22, 21, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[18].setRotationPoint(-30F, -61F, -6F);
		
		gunModel[19].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[19].setRotationPoint(-30F, -66F, -6F);
		
		gunModel[20].addShapeBox(0F, 0F, 0F, 20, 26, 12, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 28
		gunModel[20].setRotationPoint(-50F, -61F, -6F);
		
		gunModel[21].addShapeBox(0F, 0F, 0F, 20, 5, 12, 0F, 0F, -6F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 29
		gunModel[21].setRotationPoint(-50F, -66F, -6F);
		
		gunModel[22].addShapeBox(0F, 0F, 0F, 18, 32, 12, 0F, 4F, -4F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, 4F, 9F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 4F, 9F, 0F); // Box 30
		gunModel[22].setRotationPoint(-72F, -61F, -6F);
		
		gunModel[23].addShapeBox(0F, 0F, 0F, 48, 5, 12, 0F, -4F, -2F, -2F, -4F, -2F, -2F, -4F, -2F, -2F, -4F, -2F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 31
		gunModel[23].setRotationPoint(-94F, -62F, -6F);
		
		gunModel[24].addShapeBox(0F, 0F, 0F, 30, 36, 12, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 5F, 0F, -7F, 1F, 0F, -7F, 1F, 0F, -7F, 5F, 0F); // Box 32
		gunModel[24].setRotationPoint(-99F, -57F, -6F);
		
		gunModel[25].addShapeBox(0F, 0F, 0F, 22, 38, 12, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 7F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, -3F, 7F, 0F); // Box 33
		gunModel[25].setRotationPoint(-111F, -57F, -6F);
		
		gunModel[26].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F, -2F, -1F, -2F, -2F, -2F, -2F, -2F, -2F, -2F, -2F, -1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		gunModel[26].setRotationPoint(-110F, -62F, -6F);
		
		gunModel[27].addShapeBox(0F, 0F, 0F, 29, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[27].setRotationPoint(82F, -45F, -5F);
		
		gunModel[28].addShapeBox(0F, 0F, 0F, 70, 16, 10, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 36
		gunModel[28].setRotationPoint(110F, -61F, -5F);
		
		gunModel[29].addShapeBox(0F, 0F, 0F, 71, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
		gunModel[29].setRotationPoint(110F, -41F, -7F);
		
		gunModel[30].addShapeBox(0F, 0F, 0F, 71, 3, 14, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[30].setRotationPoint(110F, -51F, -7F);
		
		gunModel[31].addShapeBox(0F, 0F, 0F, 71, 7, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[31].setRotationPoint(110F, -48F, -7F);
		
		gunModel[32].addShapeBox(0F, 0F, 0F, 70, 5, 10, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 46
		gunModel[32].setRotationPoint(110F, -66F, -5F);
		
		gunModel[33].addShapeBox(0F, 0F, 0F, 6, 3, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[33].setRotationPoint(180F, -66F, -5F);
		
		gunModel[34].addShapeBox(0F, 0F, 0F, 30, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[34].setRotationPoint(186F, -63F, -2F);
		
		gunModel[35].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 51
		gunModel[35].setRotationPoint(186F, -63F, -2F);
		
		gunModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 52
		gunModel[36].setRotationPoint(216F, -63F, -2F);
		
		gunModel[37].addShapeBox(0F, 0F, 0F, 64, 4, 4, 0F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F); // Box 53
		gunModel[37].setRotationPoint(186F, -53F, -2F);
		
		gunModel[38].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, 1.5F, 1.5F, 4F, 1.5F, 1.5F, 4F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 1.5F, 1.5F, 4F, 1.5F, 1.5F, 0F, 1.5F, 1.5F); // Box 54
		gunModel[38].setRotationPoint(250F, -53F, -2F);
		
		gunModel[39].addShapeBox(0F, 0F, 0F, 11, 10, 2, 0F, 0F, 1.5F, 0F, -3F, 1.5F, 0F, -3F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F); // Box 55
		gunModel[39].setRotationPoint(254F, -66F, -1F);
		
		gunModel[40].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[40].setRotationPoint(254F, -73.5F, -3.5F);
		
		gunModel[41].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 60
		gunModel[41].setRotationPoint(254F, -68.5F, -3.5F);
		
		gunModel[42].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[42].setRotationPoint(254F, -74.5F, -3.5F);
		
		gunModel[43].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[43].setRotationPoint(254F, -73.5F, 2.5F);
		
		gunModel[44].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 67
		gunModel[44].setRotationPoint(255F, -71.5F, -0.5F);
		
		gunModel[45].addShapeBox(0F, 0F, 0F, 6, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 70
		gunModel[45].setRotationPoint(180F, -58F, -5F);
		
		gunModel[46].addShapeBox(0F, 0F, 0F, 6, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[46].setRotationPoint(180F, -63F, -5F);
		
		gunModel[47].addShapeBox(0F, 0F, 0F, 6, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		gunModel[47].setRotationPoint(180F, -47F, -5F);
		
		gunModel[48].addShapeBox(0F, 0F, 0F, 6, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[48].setRotationPoint(180F, -52F, -5F);
		
		gunModel[49].addShapeBox(0F, 0F, 0F, 6, 3, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[49].setRotationPoint(180F, -55F, -5F);
		
		gunModel[50].addShapeBox(0F, 0F, 0F, 23, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[50].setRotationPoint(10F, -21F, -2.5F);
		
		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[51].setRotationPoint(33F, -26F, -2.5F);
		
		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[52].setRotationPoint(17F, -32F, -2F);
		gunModel[52].rotateAngleZ = 0.19198622F;
		
		gunModel[53].addShapeBox(0F, 0F, 0F, 59, 6, 12, 0F, -16F, 2F, -5.5F, -16F, 2F, -5.5F, -16F, 2F, -5.5F, -16F, 2F, -5.5F, -16F, 2F, -5.5F, -16F, 2F, -5.5F, -16F, 2F, -5.5F, -16F, 2F, -5.5F); // Box 71
		gunModel[53].setRotationPoint(36F, -63F, -13F);
		gunModel[53].rotateAngleX = 0.15707963F;
		
		gunModel[54].addShapeBox(0F, 0F, 0F, 20, 8, 10, 0F, 1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 1F, 0F, -0.3F, -1F, 0F, -0.3F, -7F, 0F, -0.3F, -7F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 72
		gunModel[54].setRotationPoint(-17F, 4F, -5F);
		
		gunModel[55].addShapeBox(0F, 0F, 0F, 20, 35, 10, 0F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 13F, 0F, -0.3F, -13F, 0F, -0.3F, -13F, 0F, -0.3F, 13F, 0F, -0.3F); // Box 73
		gunModel[55].setRotationPoint(-5F, -31F, -5F);
		
		
		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 68
		defaultScopeModel[1] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 69
		defaultScopeModel[2] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 75
		defaultScopeModel[3] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 76
		defaultScopeModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 77
		defaultScopeModel[5] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 78
		defaultScopeModel[6] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 79
		defaultScopeModel[7] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 80
		defaultScopeModel[8] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 81
		defaultScopeModel[9] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 82
		
		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 32, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 68
		defaultScopeModel[0].setRotationPoint(75F, -67F, -6F);
		
		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 32, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		defaultScopeModel[1].setRotationPoint(75F, -69F, -6F);
		
		defaultScopeModel[2].addShapeBox(-32F, 0F, 0F, 32, 2, 8, 0F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F); // Box 75
		defaultScopeModel[2].setRotationPoint(107F, -70F, -4F);
		defaultScopeModel[2].rotateAngleZ = -0.06981317F;
		
		defaultScopeModel[3].addShapeBox(-32F, 0F, 0F, 2, 2, 8, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 76
		defaultScopeModel[3].setRotationPoint(107F, -70F, -4F);
		defaultScopeModel[3].rotateAngleZ = -0.06981317F;
		
		defaultScopeModel[4].addShapeBox(-32F, -2F, 1F, 3, 2, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 77
		defaultScopeModel[4].setRotationPoint(107.5F, -70F, -3.5F);
		defaultScopeModel[4].rotateAngleZ = -0.06981317F;
		
		defaultScopeModel[5].addShapeBox(-32F, -2F, 1F, 3, 2, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 78
		defaultScopeModel[5].setRotationPoint(107.5F, -70F, 0.5F);
		defaultScopeModel[5].rotateAngleZ = -0.06981317F;
		
		defaultScopeModel[6].addShapeBox(-2F, 0F, 0F, 2, 2, 9, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 79
		defaultScopeModel[6].setRotationPoint(107F, -70F, -4.5F);
		defaultScopeModel[6].rotateAngleZ = -0.06981317F;
		
		defaultScopeModel[7].addShapeBox(-2F, 0F, 0F, 2, 2, 1, 0F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F); // Box 80
		defaultScopeModel[7].setRotationPoint(107F, -70F, -4.5F);
		defaultScopeModel[7].rotateAngleZ = -0.06981317F;
		
		defaultScopeModel[8].addShapeBox(-2F, 0F, 0F, 2, 2, 1, 0F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F); // Box 81
		defaultScopeModel[8].setRotationPoint(107F, -70F, 3.5F);
		defaultScopeModel[8].rotateAngleZ = -0.06981317F;
		
		defaultScopeModel[9].addShapeBox(-2F, 0F, 0F, 2, 2, 9, 0F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F); // Box 82
		defaultScopeModel[9].setRotationPoint(107F, -70F, -4.5F);
		defaultScopeModel[9].rotateAngleZ = -0.06981317F;
		
		
		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 11
		ammoModel[1] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 12
		ammoModel[2] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 13
		ammoModel[3] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 14
		
		ammoModel[0].addShapeBox(64.5F, -99F, -5F, 25, 26, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		ammoModel[0].setRotationPoint(0F, 82F, 0F);
		ammoModel[0].rotateAngleZ = 0.12217305F;
		
		ammoModel[1].addShapeBox(65.5F, -73F, -5F, 25, 20, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 12
		ammoModel[1].setRotationPoint(0F, 82F, 0F);
		ammoModel[1].rotateAngleZ = 0.12217305F;
		
		ammoModel[2].addShapeBox(68.5F, -53F, -5F, 25, 20, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 13
		ammoModel[2].setRotationPoint(0F, 82F, 0F);
		ammoModel[2].rotateAngleZ = 0.12217305F;
		
		ammoModel[3].addShapeBox(73.5F, -33F, -5F, 25, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, 3.5F, -1F, 0F, 3.5F, -1F, 0F, -5F, 2F, 0F); // Box 14
		ammoModel[3].setRotationPoint(0F, 82F, 0F);
		ammoModel[3].rotateAngleZ = 0.12217305F;
		
		
		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 56
		slideModel[1] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 57
		slideModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 58
		
		slideModel[0].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 56
		slideModel[0].setRotationPoint(80F, -61F, 4F);
		
		slideModel[1].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 57
		slideModel[1].setRotationPoint(80F, -61F, 4F);
		
		slideModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 58
		slideModel[2].setRotationPoint(80F, -61F, 14F);
		
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
