//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.02.2016 - 09:17:22
// Last changed on: 16.02.2016 - 09:17:22

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelPanzerschreck extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public ModelPanzerschreck() //Same as Filename
	{
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 85
		
		ammoModel[0].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		ammoModel[0].setRotationPoint(-58.5F, -13.5F, -2F);
		
		
		slideModel = new ModelRendererTurbo[77];
		slideModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		slideModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		slideModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 2
		slideModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
		slideModel[4] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 4
		slideModel[5] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 5
		slideModel[6] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 9
		slideModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		slideModel[8] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 11
		slideModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 12
		slideModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		slideModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 14
		slideModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 15
		slideModel[13] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 16
		slideModel[14] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 17
		slideModel[15] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 18
		slideModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		slideModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 20
		slideModel[18] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 21
		slideModel[19] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 22
		slideModel[20] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 24
		slideModel[21] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 25
		slideModel[22] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 26
		slideModel[23] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 27
		slideModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		slideModel[25] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		slideModel[26] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 30
		slideModel[27] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 31
		slideModel[28] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 32
		slideModel[29] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 33
		slideModel[30] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 34
		slideModel[31] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 35
		slideModel[32] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 36
		slideModel[33] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 37
		slideModel[34] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 38
		slideModel[35] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 38
		slideModel[36] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 40
		slideModel[37] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 41
		slideModel[38] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 43
		slideModel[39] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 44
		slideModel[40] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 45
		slideModel[41] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 46
		slideModel[42] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 47
		slideModel[43] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 48
		slideModel[44] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 49
		slideModel[45] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 50
		slideModel[46] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 52
		slideModel[47] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 53
		slideModel[48] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 54
		slideModel[49] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 55
		slideModel[50] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 56
		slideModel[51] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 57
		slideModel[52] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 58
		slideModel[53] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 59
		slideModel[54] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 60
		slideModel[55] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 63
		slideModel[56] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 64
		slideModel[57] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 65
		slideModel[58] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 66
		slideModel[59] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 67
		slideModel[60] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 68
		slideModel[61] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 69
		slideModel[62] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 70
		slideModel[63] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 71
		slideModel[64] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 72
		slideModel[65] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 73
		slideModel[66] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 74
		slideModel[67] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 75
		slideModel[68] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 76
		slideModel[69] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 77
		slideModel[70] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 78
		slideModel[71] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 79
		slideModel[72] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 80
		slideModel[73] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 81
		slideModel[74] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 82
		slideModel[75] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 83
		slideModel[76] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 84
		
		slideModel[0].addShapeBox(0F, 0F, 0F, 100, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[0].setRotationPoint(-59F, -14F, -4.5F);
		
		slideModel[1].addShapeBox(0F, 0F, 0F, 100, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		slideModel[1].setRotationPoint(-59F, -16F, -4.5F);
		
		slideModel[2].addShapeBox(0F, 0F, 0F, 100, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2
		slideModel[2].setRotationPoint(-59F, -10F, -4.5F);
		
		slideModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 3
		slideModel[3].setRotationPoint(41F, -9.5F, -5F);
		
		slideModel[4].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		slideModel[4].setRotationPoint(41F, -14.5F, -5F);
		
		slideModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		slideModel[5].setRotationPoint(41F, -16.5F, -5F);
		
		slideModel[6].addBox(0F, 0F, 0F, 1, 15, 10, 0F); // Box 9
		slideModel[6].setRotationPoint(19F, -19F, 13F);
		
		slideModel[7].addBox(-1F, -5F, 0F, 1, 5, 27, 0F); // Box 10
		slideModel[7].setRotationPoint(20F, -19F, -6F);
		slideModel[7].rotateAngleZ = 0.12217305F;
		
		slideModel[8].addBox(-1F, 0F, 0F, 1, 5, 27, 0F); // Box 11
		slideModel[8].setRotationPoint(20F, -4F, -6F);
		slideModel[8].rotateAngleZ = -0.12217305F;
		
		slideModel[9].addShapeBox(-1F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 12
		slideModel[9].setRotationPoint(20F, -4F, 21F);
		slideModel[9].rotateAngleZ = -0.12217305F;
		
		slideModel[10].addShapeBox(-1F, -6F, 0F, 1, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		slideModel[10].setRotationPoint(20F, -19F, 21F);
		slideModel[10].rotateAngleZ = 0.12217305F;
		
		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		slideModel[11].setRotationPoint(19F, -13F, 4F);
		
		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 15
		slideModel[12].setRotationPoint(19F, -19F, 4F);
		
		slideModel[13].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -1F, 0F, -0.9F, -1F); // Box 16
		slideModel[13].setRotationPoint(19F, -19F, 12F);
		
		slideModel[14].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 17
		slideModel[14].setRotationPoint(19F, -19F, -6F);
		
		slideModel[15].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 18
		slideModel[15].setRotationPoint(19F, -8F, -6F);
		
		slideModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		slideModel[16].setRotationPoint(19F, -9F, 3F);
		
		slideModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 20
		slideModel[17].setRotationPoint(19F, -16F, 3F);
		
		slideModel[18].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 21
		slideModel[18].setRotationPoint(7F, -8.5F, -1F);
		
		slideModel[19].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 22
		slideModel[19].setRotationPoint(-2F, -0.5F, -1F);
		
		slideModel[20].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 24
		slideModel[20].setRotationPoint(-2F, -8.5F, -0.5F);
		
		slideModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		slideModel[21].setRotationPoint(-9F, -0.5F, -0.5F);
		
		slideModel[22].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -0.2F); // Box 26
		slideModel[22].setRotationPoint(-11F, -8.5F, -1F);
		
		slideModel[23].addShapeBox(0F, -1F, 0F, 3, 6, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 27
		slideModel[23].setRotationPoint(-1F, -10F, -1F);
		slideModel[23].rotateAngleZ = 0.34906585F;
		
		slideModel[24].addShapeBox(0F, 5F, 0F, 1, 4, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F); // Box 28
		slideModel[24].setRotationPoint(-1F, -10F, -1F);
		slideModel[24].rotateAngleZ = 0.34906585F;
		
		slideModel[25].addShapeBox(2F, 5F, 0F, 1, 4, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 29
		slideModel[25].setRotationPoint(-1F, -10F, -1F);
		slideModel[25].rotateAngleZ = 0.34906585F;
		
		slideModel[26].addShapeBox(1F, 8F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 30
		slideModel[26].setRotationPoint(-1F, -10F, -1F);
		slideModel[26].rotateAngleZ = 0.34906585F;
		
		slideModel[27].addShapeBox(-1F, -6F, 0F, 1, 1, 27, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		slideModel[27].setRotationPoint(20F, -19F, -6F);
		slideModel[27].rotateAngleZ = 0.12217305F;
		
		slideModel[28].addShapeBox(-1F, 5F, 0F, 1, 1, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		slideModel[28].setRotationPoint(20F, -4F, -6F);
		slideModel[28].rotateAngleZ = -0.12217305F;
		
		slideModel[29].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 33
		slideModel[29].setRotationPoint(18.5F, -20F, 5.2F);
		
		slideModel[30].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 34
		slideModel[30].setRotationPoint(18.5F, -20F, 11.8F);
		
		slideModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F); // Box 35
		slideModel[31].setRotationPoint(18.5F, -20F, 6F);
		
		slideModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 36
		slideModel[32].setRotationPoint(18.5F, -13F, 6F);
		
		slideModel[33].addShapeBox(-0.9F, -5F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F); // Box 37
		slideModel[33].setRotationPoint(20.5F, -20F, 8F);
		slideModel[33].rotateAngleZ = 0.15707963F;
		
		slideModel[34].addShapeBox(-0.4F, -4.5F, 0F, 1, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 38
		slideModel[34].setRotationPoint(20.5F, -20F, 8.5F);
		slideModel[34].rotateAngleZ = 0.15707963F;
		
		slideModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		slideModel[35].setRotationPoint(38F, -14.5F, -5F);
		
		slideModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		slideModel[36].setRotationPoint(38F, -16.5F, -5F);
		
		slideModel[37].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		slideModel[37].setRotationPoint(38F, -9.5F, -5F);
		
		slideModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 43
		slideModel[38].setRotationPoint(38F, -9.5F, 3F);
		
		slideModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		slideModel[39].setRotationPoint(38F, -2.5F, -4F);
		
		slideModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 45
		slideModel[40].setRotationPoint(38F, -13.5F, 5F);
		
		slideModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 46
		slideModel[41].setRotationPoint(38F, -19.5F, 10.5F);
		
		slideModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 47
		slideModel[42].setRotationPoint(38F, -19.5F, 6.5F);
		
		slideModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 48
		slideModel[43].setRotationPoint(38F, -17.5F, 7.5F);
		
		slideModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 49
		slideModel[44].setRotationPoint(38F, -19.5F, 7.5F);
		
		slideModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 50
		slideModel[45].setRotationPoint(38F, -14.5F, 8.5F);
		
		slideModel[46].addShapeBox(0F, 0F, -5F, 1, 1, 5, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 52
		slideModel[46].setRotationPoint(38F, -19.5F, 6.5F);
		slideModel[46].rotateAngleX = 0.80285146F;
		
		slideModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		slideModel[47].setRotationPoint(-59.5F, -16.5F, -5F);
		
		slideModel[48].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		slideModel[48].setRotationPoint(-59.5F, -14.5F, -5F);
		
		slideModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 55
		slideModel[49].setRotationPoint(-59.5F, -9.5F, -5F);
		
		slideModel[50].addBox(0F, 0F, 0F, 13, 3, 2, 0F); // Box 56
		slideModel[50].setRotationPoint(-13F, -8.5F, -1F);
		
		slideModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 57
		slideModel[51].setRotationPoint(0F, -8.5F, -1F);
		
		slideModel[52].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 58
		slideModel[52].setRotationPoint(-37F, -7F, -0.5F);
		
		slideModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 59
		slideModel[53].setRotationPoint(-23F, -7F, -0.5F);
		
		slideModel[54].addBox(0F, 0F, 0F, 13, 3, 2, 0F); // Box 60
		slideModel[54].setRotationPoint(-50F, -8.5F, -1F);
		
		slideModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 63
		slideModel[55].setRotationPoint(-62.5F, -14.5F, 3F);
		
		slideModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 64
		slideModel[56].setRotationPoint(-62.5F, -10.5F, 3F);
		
		slideModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 65
		slideModel[57].setRotationPoint(-62.5F, -10.5F, -5F);
		
		slideModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 66
		slideModel[58].setRotationPoint(-62.5F, -14.5F, -5F);
		
		slideModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
		slideModel[59].setRotationPoint(-62.5F, -16.5F, -1F);
		
		slideModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 68
		slideModel[60].setRotationPoint(-62.5F, -8.5F, -1F);
		
		slideModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		slideModel[61].setRotationPoint(-63.5F, -15.5F, -6F);
		
		slideModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		slideModel[62].setRotationPoint(-63.5F, -9.5F, -6F);
		
		slideModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		slideModel[63].setRotationPoint(-63.5F, -7.5F, -1F);
		
		slideModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		slideModel[64].setRotationPoint(-63.5F, -17.5F, -1F);
		
		slideModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		slideModel[65].setRotationPoint(-63.5F, -15.5F, 4F);
		
		slideModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		slideModel[66].setRotationPoint(-63.5F, -9.5F, 4F);
		
		slideModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		slideModel[67].setRotationPoint(-63.5F, -9.5F, 0F);
		
		slideModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 76
		slideModel[68].setRotationPoint(-63.5F, -9.5F, -5F);
		
		slideModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		slideModel[69].setRotationPoint(-63.5F, -15.5F, 0F);
		
		slideModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 78
		slideModel[70].setRotationPoint(-63.5F, -15.5F, -5F);
		
		slideModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 79
		slideModel[71].setRotationPoint(-63.5F, -12.5F, 3F);
		
		slideModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 80
		slideModel[72].setRotationPoint(-63.5F, -12.5F, 3F);
		
		slideModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		slideModel[73].setRotationPoint(-63.5F, -12.5F, -6F);
		
		slideModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		slideModel[74].setRotationPoint(-63.5F, -12.5F, -6F);
		
		slideModel[75].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 83
		slideModel[75].setRotationPoint(-50F, -8.5F, -1F);
		
		slideModel[76].addBox(0F, 0F, 0F, 76, 1, 1, 0F); // Box 84
		slideModel[76].setRotationPoint(-57F, -16.2F, -0.5F);
		
		
		gunSlideDistance = 0F;
		animationType = EnumAnimationType.RIFLE;
		gunSlideDistance = 1.5F;
		
		
		flipAll();
		translateAll(0F, 6F, 10F);
		thirdPersonOffset = new Vector3f(0F, -0.15F, -0.15F);
	}
}
