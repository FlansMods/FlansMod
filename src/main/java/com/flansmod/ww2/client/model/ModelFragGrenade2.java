//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:05.06.2016 - 20:23:18
// Last changed on: 05.06.2016 - 20:23:18

package com.flansmod.ww2.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFragGrenade2 extends ModelBase
{
	int textureX = 256;
	int textureY = 128;
	
	public ModelFragGrenade2()
	{
		fraggrenadeModel = new ModelRendererTurbo[96];
		fraggrenadeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		fraggrenadeModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		fraggrenadeModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		fraggrenadeModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		fraggrenadeModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		fraggrenadeModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 23
		fraggrenadeModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 27
		fraggrenadeModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 28
		fraggrenadeModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 29
		fraggrenadeModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 30
		fraggrenadeModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 31
		fraggrenadeModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 32
		fraggrenadeModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 33
		fraggrenadeModel[13] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 34
		fraggrenadeModel[14] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 35
		fraggrenadeModel[15] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 36
		fraggrenadeModel[16] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 37
		fraggrenadeModel[17] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 38
		fraggrenadeModel[18] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 39
		fraggrenadeModel[19] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 40
		fraggrenadeModel[20] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 41
		fraggrenadeModel[21] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 42
		fraggrenadeModel[22] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 43
		fraggrenadeModel[23] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 44
		fraggrenadeModel[24] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 45
		fraggrenadeModel[25] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 46
		fraggrenadeModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 47
		fraggrenadeModel[27] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 48
		fraggrenadeModel[28] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 49
		fraggrenadeModel[29] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 50
		fraggrenadeModel[30] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 51
		fraggrenadeModel[31] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 52
		fraggrenadeModel[32] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 53
		fraggrenadeModel[33] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 54
		fraggrenadeModel[34] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 55
		fraggrenadeModel[35] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 56
		fraggrenadeModel[36] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 57
		fraggrenadeModel[37] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 58
		fraggrenadeModel[38] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 59
		fraggrenadeModel[39] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 61
		fraggrenadeModel[40] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 62
		fraggrenadeModel[41] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 63
		fraggrenadeModel[42] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 64
		fraggrenadeModel[43] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 65
		fraggrenadeModel[44] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 66
		fraggrenadeModel[45] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 67
		fraggrenadeModel[46] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 68
		fraggrenadeModel[47] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 69
		fraggrenadeModel[48] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 70
		fraggrenadeModel[49] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 71
		fraggrenadeModel[50] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 72
		fraggrenadeModel[51] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 73
		fraggrenadeModel[52] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 74
		fraggrenadeModel[53] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 75
		fraggrenadeModel[54] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 76
		fraggrenadeModel[55] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 77
		fraggrenadeModel[56] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 78
		fraggrenadeModel[57] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 79
		fraggrenadeModel[58] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 80
		fraggrenadeModel[59] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 81
		fraggrenadeModel[60] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 82
		fraggrenadeModel[61] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 83
		fraggrenadeModel[62] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 84
		fraggrenadeModel[63] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 89
		fraggrenadeModel[64] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 91
		fraggrenadeModel[65] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 92
		fraggrenadeModel[66] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 93
		fraggrenadeModel[67] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 94
		fraggrenadeModel[68] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 95
		fraggrenadeModel[69] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 96
		fraggrenadeModel[70] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 97
		fraggrenadeModel[71] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 98
		fraggrenadeModel[72] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 99
		fraggrenadeModel[73] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 100
		fraggrenadeModel[74] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 101
		fraggrenadeModel[75] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 102
		fraggrenadeModel[76] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 103
		fraggrenadeModel[77] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 104
		fraggrenadeModel[78] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 105
		fraggrenadeModel[79] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 106
		fraggrenadeModel[80] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 107
		fraggrenadeModel[81] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 108
		fraggrenadeModel[82] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 109
		fraggrenadeModel[83] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 110
		fraggrenadeModel[84] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 111
		fraggrenadeModel[85] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 112
		fraggrenadeModel[86] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 113
		fraggrenadeModel[87] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 114
		fraggrenadeModel[88] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 115
		fraggrenadeModel[89] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 117
		fraggrenadeModel[90] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 118
		fraggrenadeModel[91] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 119
		fraggrenadeModel[92] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 120
		fraggrenadeModel[93] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 121
		fraggrenadeModel[94] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 122
		fraggrenadeModel[95] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 123
		
		fraggrenadeModel[0].addShapeBox(-2.5F, -10F, 1.5F, 5, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1
		fraggrenadeModel[0].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[0].rotateAngleX = -3.14159265F;
		fraggrenadeModel[0].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[1].addShapeBox(-2.5F, -10F, -2.5F, 5, 19, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		fraggrenadeModel[1].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[1].rotateAngleX = -3.14159265F;
		fraggrenadeModel[1].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[2].addShapeBox(-2.5F, -10F, -1.5F, 5, 19, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		fraggrenadeModel[2].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[2].rotateAngleX = -3.14159265F;
		fraggrenadeModel[2].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[3].addShapeBox(2.5F, -10F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 5
		fraggrenadeModel[3].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[3].rotateAngleX = -3.14159265F;
		fraggrenadeModel[3].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[4].addShapeBox(1.5F, -6F, -5.5F, 4, 4, 4, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		fraggrenadeModel[4].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[4].rotateAngleX = -3.14159265F;
		fraggrenadeModel[4].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[5].addShapeBox(-1.5F, -6.1F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		fraggrenadeModel[5].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[5].rotateAngleX = -3.14159265F;
		fraggrenadeModel[5].rotateAngleY = -3.92699082F;
		
		fraggrenadeModel[6].addShapeBox(1.5F, -6F, 1.5F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 27
		fraggrenadeModel[6].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[6].rotateAngleX = -3.14159265F;
		fraggrenadeModel[6].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[7].addShapeBox(-5.5F, -6F, 1.5F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 28
		fraggrenadeModel[7].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[7].rotateAngleX = -3.14159265F;
		fraggrenadeModel[7].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[8].addShapeBox(-5.5F, -6F, -5.5F, 4, 4, 4, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		fraggrenadeModel[8].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[8].rotateAngleX = -3.14159265F;
		fraggrenadeModel[8].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[9].addShapeBox(-1.5F, -6F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		fraggrenadeModel[9].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[9].rotateAngleX = -3.14159265F;
		fraggrenadeModel[9].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[10].addShapeBox(-1.5F, -6F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		fraggrenadeModel[10].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[10].rotateAngleX = -3.14159265F;
		fraggrenadeModel[10].rotateAngleY = -1.57079633F;
		
		fraggrenadeModel[11].addShapeBox(-1.5F, -6.1F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		fraggrenadeModel[11].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[11].rotateAngleX = -3.14159265F;
		fraggrenadeModel[11].rotateAngleY = -2.35619449F;
		
		fraggrenadeModel[12].addShapeBox(-1.5F, -6F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		fraggrenadeModel[12].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[12].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[13].addShapeBox(-1.5F, -6.1F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		fraggrenadeModel[13].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[13].rotateAngleX = -3.14159265F;
		fraggrenadeModel[13].rotateAngleY = -0.78539816F;
		
		fraggrenadeModel[14].addShapeBox(-1.5F, -6F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		fraggrenadeModel[14].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[14].rotateAngleX = -3.14159265F;
		fraggrenadeModel[14].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[15].addShapeBox(-1.5F, -6.1F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		fraggrenadeModel[15].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[15].rotateAngleX = -3.14159265F;
		fraggrenadeModel[15].rotateAngleY = -5.49778714F;
		
		fraggrenadeModel[16].addShapeBox(-1.5F, -3F, 1.5F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		fraggrenadeModel[16].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[16].rotateAngleX = -3.14159265F;
		fraggrenadeModel[16].rotateAngleY = -3.92699082F;
		
		fraggrenadeModel[17].addShapeBox(-1.5F, -3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		fraggrenadeModel[17].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[17].rotateAngleX = -3.14159265F;
		fraggrenadeModel[17].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[18].addShapeBox(-1.5F, -3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		fraggrenadeModel[18].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[18].rotateAngleX = -3.14159265F;
		fraggrenadeModel[18].rotateAngleY = -2.35619449F;
		
		fraggrenadeModel[19].addShapeBox(-1.5F, -3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		fraggrenadeModel[19].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[19].rotateAngleX = -3.14159265F;
		fraggrenadeModel[19].rotateAngleY = -1.57079633F;
		
		fraggrenadeModel[20].addShapeBox(-1.5F, -3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		fraggrenadeModel[20].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[20].rotateAngleX = -3.14159265F;
		fraggrenadeModel[20].rotateAngleY = -0.78539816F;
		
		fraggrenadeModel[21].addShapeBox(-1.5F, -3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		fraggrenadeModel[21].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[21].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[22].addShapeBox(-1.5F, -3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		fraggrenadeModel[22].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[22].rotateAngleX = -3.14159265F;
		fraggrenadeModel[22].rotateAngleY = -5.49778714F;
		
		fraggrenadeModel[23].addShapeBox(-1.5F, -3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		fraggrenadeModel[23].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[23].rotateAngleX = -3.14159265F;
		fraggrenadeModel[23].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[24].addShapeBox(-1.5F, -4F, -6F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		fraggrenadeModel[24].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[24].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[25].addShapeBox(-1.5F, -4F, -6F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		fraggrenadeModel[25].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[25].rotateAngleX = -3.14159265F;
		fraggrenadeModel[25].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[26].addShapeBox(-1.5F, 0F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		fraggrenadeModel[26].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[26].rotateAngleX = -3.14159265F;
		fraggrenadeModel[26].rotateAngleY = -1.57079633F;
		
		fraggrenadeModel[27].addShapeBox(-1.5F, -1F, -7F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		fraggrenadeModel[27].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[27].rotateAngleX = -3.14159265F;
		fraggrenadeModel[27].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[28].addShapeBox(-1.5F, -1F, -7F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		fraggrenadeModel[28].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[28].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[29].addShapeBox(-1.5F, 2F, -6.5F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		fraggrenadeModel[29].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[29].rotateAngleX = -3.14159265F;
		fraggrenadeModel[29].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[30].addShapeBox(-1.5F, 2F, -7F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		fraggrenadeModel[30].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[30].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[31].addShapeBox(-1.5F, 5F, -6F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		fraggrenadeModel[31].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[31].rotateAngleX = -3.14159265F;
		fraggrenadeModel[31].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[32].addShapeBox(-1.5F, 5F, -6F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		fraggrenadeModel[32].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[32].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[33].addShapeBox(-1.5F, 0F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		fraggrenadeModel[33].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[33].rotateAngleX = -3.14159265F;
		fraggrenadeModel[33].rotateAngleY = -2.35619449F;
		
		fraggrenadeModel[34].addShapeBox(-1.5F, 0F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		fraggrenadeModel[34].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[34].rotateAngleX = -3.14159265F;
		fraggrenadeModel[34].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[35].addShapeBox(-1.5F, 0F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		fraggrenadeModel[35].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[35].rotateAngleX = -3.14159265F;
		fraggrenadeModel[35].rotateAngleY = -3.92699082F;
		
		fraggrenadeModel[36].addShapeBox(-1.5F, 0F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		fraggrenadeModel[36].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[36].rotateAngleX = -3.14159265F;
		fraggrenadeModel[36].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[37].addShapeBox(-1.5F, 0F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		fraggrenadeModel[37].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[37].rotateAngleX = -3.14159265F;
		fraggrenadeModel[37].rotateAngleY = -5.49778714F;
		
		fraggrenadeModel[38].addShapeBox(-1.5F, 0F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		fraggrenadeModel[38].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[38].rotateAngleX = -3.14159265F;
		fraggrenadeModel[38].rotateAngleY = -6.28318531F;
		
		fraggrenadeModel[39].addShapeBox(-1.5F, 0F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		fraggrenadeModel[39].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[39].rotateAngleX = -3.14159265F;
		fraggrenadeModel[39].rotateAngleY = -0.78539816F;
		
		fraggrenadeModel[40].addShapeBox(-1.5F, 3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 62
		fraggrenadeModel[40].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[40].rotateAngleX = -3.14159265F;
		fraggrenadeModel[40].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[41].addShapeBox(-1.5F, 3F, 1.5F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 63
		fraggrenadeModel[41].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[41].rotateAngleX = -3.14159265F;
		fraggrenadeModel[41].rotateAngleY = -3.92699082F;
		
		fraggrenadeModel[42].addShapeBox(-1.5F, 3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 64
		fraggrenadeModel[42].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[42].rotateAngleX = -3.14159265F;
		fraggrenadeModel[42].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[43].addShapeBox(-1.5F, 3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 65
		fraggrenadeModel[43].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[43].rotateAngleX = -3.14159265F;
		fraggrenadeModel[43].rotateAngleY = -5.49778714F;
		
		fraggrenadeModel[44].addShapeBox(-1.5F, 3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 66
		fraggrenadeModel[44].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[44].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[45].addShapeBox(-1.5F, 3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		fraggrenadeModel[45].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[45].rotateAngleX = -3.14159265F;
		fraggrenadeModel[45].rotateAngleY = -0.78539816F;
		
		fraggrenadeModel[46].addShapeBox(-1.5F, 3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		fraggrenadeModel[46].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[46].rotateAngleX = -3.14159265F;
		fraggrenadeModel[46].rotateAngleY = -1.57079633F;
		
		fraggrenadeModel[47].addShapeBox(-1.5F, 3F, 2.5F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 69
		fraggrenadeModel[47].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[47].rotateAngleX = -3.14159265F;
		fraggrenadeModel[47].rotateAngleY = -2.35619449F;
		
		fraggrenadeModel[48].addShapeBox(-1.5F, 6.1F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 70
		fraggrenadeModel[48].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[48].rotateAngleX = -3.14159265F;
		fraggrenadeModel[48].rotateAngleY = -3.92699082F;
		
		fraggrenadeModel[49].addShapeBox(-1.5F, 6F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 71
		fraggrenadeModel[49].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[49].rotateAngleX = -3.14159265F;
		fraggrenadeModel[49].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[50].addShapeBox(-1.5F, 6.1F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		fraggrenadeModel[50].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[50].rotateAngleX = -3.14159265F;
		fraggrenadeModel[50].rotateAngleY = -2.35619449F;
		
		fraggrenadeModel[51].addShapeBox(-1.5F, 6F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		fraggrenadeModel[51].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[51].rotateAngleX = -3.14159265F;
		fraggrenadeModel[51].rotateAngleY = -1.57079633F;
		
		fraggrenadeModel[52].addShapeBox(-1.5F, 6.1F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 74
		fraggrenadeModel[52].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[52].rotateAngleX = -3.14159265F;
		fraggrenadeModel[52].rotateAngleY = -0.78539816F;
		
		fraggrenadeModel[53].addShapeBox(-1.5F, 6F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 75
		fraggrenadeModel[53].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[53].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[54].addShapeBox(-1.5F, 6.1F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 76
		fraggrenadeModel[54].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[54].rotateAngleX = -3.14159265F;
		fraggrenadeModel[54].rotateAngleY = -5.49778714F;
		
		fraggrenadeModel[55].addShapeBox(-1.5F, 6F, 2.5F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 77
		fraggrenadeModel[55].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[55].rotateAngleX = -3.14159265F;
		fraggrenadeModel[55].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[56].addShapeBox(-3.5F, -10F, -1.5F, 1, 4, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 78
		fraggrenadeModel[56].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[56].rotateAngleX = -3.14159265F;
		fraggrenadeModel[56].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[57].addShapeBox(-1.5F, -10F, 2.5F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 79
		fraggrenadeModel[57].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[57].rotateAngleX = -3.14159265F;
		fraggrenadeModel[57].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[58].addShapeBox(-1.5F, -10F, -3.5F, 3, 4, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		fraggrenadeModel[58].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[58].rotateAngleX = -3.14159265F;
		fraggrenadeModel[58].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[59].addShapeBox(1.5F, 4F, 1.5F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 81
		fraggrenadeModel[59].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[59].rotateAngleX = -3.14159265F;
		fraggrenadeModel[59].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[60].addShapeBox(-5.5F, 4F, 1.5F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 82
		fraggrenadeModel[60].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[60].rotateAngleX = -3.14159265F;
		fraggrenadeModel[60].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[61].addShapeBox(-5.5F, 4F, -5.5F, 4, 4, 4, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		fraggrenadeModel[61].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[61].rotateAngleX = -3.14159265F;
		fraggrenadeModel[61].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[62].addShapeBox(1.5F, 4F, -5.5F, 4, 4, 4, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		fraggrenadeModel[62].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[62].rotateAngleX = -3.14159265F;
		fraggrenadeModel[62].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[63].addShapeBox(1.5F, 1F, -5.5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		fraggrenadeModel[63].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[63].rotateAngleX = -3.14159265F;
		fraggrenadeModel[63].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[64].addShapeBox(1.5F, -2F, -5.5F, 4, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		fraggrenadeModel[64].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[64].rotateAngleX = -3.14159265F;
		fraggrenadeModel[64].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[65].addShapeBox(1.5F, -2F, -5.5F, 4, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		fraggrenadeModel[65].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[65].rotateAngleX = -3.14159265F;
		fraggrenadeModel[65].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[66].addShapeBox(1.5F, 1F, -5.5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		fraggrenadeModel[66].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[66].rotateAngleX = -3.14159265F;
		fraggrenadeModel[66].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[67].addShapeBox(1.5F, -2F, -5.5F, 4, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		fraggrenadeModel[67].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[67].rotateAngleX = -3.14159265F;
		fraggrenadeModel[67].rotateAngleY = -1.57079633F;
		
		fraggrenadeModel[68].addShapeBox(1.5F, 1F, -5.5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		fraggrenadeModel[68].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[68].rotateAngleX = -3.14159265F;
		fraggrenadeModel[68].rotateAngleY = -1.57079633F;
		
		fraggrenadeModel[69].addShapeBox(1.5F, -2F, -5.5F, 4, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		fraggrenadeModel[69].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[69].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[70].addShapeBox(1.5F, 1F, -5.5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		fraggrenadeModel[70].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[70].rotateAngleX = -3.14159265F;
		
		fraggrenadeModel[71].addShapeBox(-0.5F, -10F, 1.5F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 98
		fraggrenadeModel[71].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[71].rotateAngleX = -3.14159265F;
		fraggrenadeModel[71].rotateAngleY = -5.49778714F;
		
		fraggrenadeModel[72].addShapeBox(-0.5F, -10F, 1.5F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 99
		fraggrenadeModel[72].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[72].rotateAngleX = -3.14159265F;
		fraggrenadeModel[72].rotateAngleY = -3.92699082F;
		
		fraggrenadeModel[73].addShapeBox(-0.5F, -10F, 1.5F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 100
		fraggrenadeModel[73].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[73].rotateAngleX = -3.14159265F;
		fraggrenadeModel[73].rotateAngleY = -2.35619449F;
		
		fraggrenadeModel[74].addShapeBox(-0.5F, -10F, 1.5F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 101
		fraggrenadeModel[74].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[74].rotateAngleX = -3.14159265F;
		fraggrenadeModel[74].rotateAngleY = -0.78539816F;
		
		fraggrenadeModel[75].addShapeBox(-1.5F, -14F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 102
		fraggrenadeModel[75].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[75].rotateAngleX = -3.14159265F;
		fraggrenadeModel[75].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[76].addShapeBox(-2.5F, -14F, -2F, 1, 4, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 103
		fraggrenadeModel[76].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[76].rotateAngleX = -3.14159265F;
		fraggrenadeModel[76].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[77].addShapeBox(-1.5F, 8F, 2.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 104
		fraggrenadeModel[77].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[77].rotateAngleX = -3.14159265F;
		fraggrenadeModel[77].rotateAngleY = -1.57079633F;
		
		fraggrenadeModel[78].addShapeBox(-1.5F, 8F, 2.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 105
		fraggrenadeModel[78].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[78].rotateAngleX = -3.14159265F;
		fraggrenadeModel[78].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[79].addShapeBox(-1.5F, 8F, 2.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 106
		fraggrenadeModel[79].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[79].rotateAngleX = -3.14159265F;
		fraggrenadeModel[79].rotateAngleY = -4.71238898F;
		
		fraggrenadeModel[80].addShapeBox(-1.5F, 8F, 2.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 107
		fraggrenadeModel[80].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[80].rotateAngleX = -3.14159265F;
		fraggrenadeModel[80].rotateAngleY = -6.28318531F;
		
		fraggrenadeModel[81].addShapeBox(2.5F, -14F, -1.5F, 3, 4, 3, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F); // Box 108
		fraggrenadeModel[81].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[81].rotateAngleX = -3.14159265F;
		fraggrenadeModel[81].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[82].addShapeBox(-1.5F, -14.5F, -2F, 4, 1, 4, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0.2F); // Box 109
		fraggrenadeModel[82].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[82].rotateAngleX = -3.14159265F;
		fraggrenadeModel[82].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[83].addShapeBox(-3.5F, -14.5F, -2F, 2, 1, 4, 0F, -0.8F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -1F, 0.2F, -0.5F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -1F); // Box 110
		fraggrenadeModel[83].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[83].rotateAngleX = -3.14159265F;
		fraggrenadeModel[83].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[84].addShapeBox(4F, -14F, -1F, 1, 4, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2.3F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -2.3F, 0F, 0F); // Box 111
		fraggrenadeModel[84].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[84].rotateAngleX = -3.14159265F;
		fraggrenadeModel[84].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[85].addShapeBox(6F, -10F, -1F, 1, 5, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2.3F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -2.3F, 0F, 0F); // Box 112
		fraggrenadeModel[85].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[85].rotateAngleX = -3.14159265F;
		fraggrenadeModel[85].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[86].addShapeBox(9F, 0F, -1F, 1, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 113
		fraggrenadeModel[86].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[86].rotateAngleX = -3.14159265F;
		fraggrenadeModel[86].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[87].addShapeBox(8F, 1F, -1F, 1, 6, 2, 0F, -1.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 114
		fraggrenadeModel[87].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[87].rotateAngleX = -3.14159265F;
		fraggrenadeModel[87].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[88].addShapeBox(8F, -5F, -1F, 1, 5, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, 0F, 0F); // Box 115
		fraggrenadeModel[88].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[88].rotateAngleX = -3.14159265F;
		fraggrenadeModel[88].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[89].addShapeBox(2.5F, -14.5F, -2F, 2, 1, 4, 0F, 0F, 0F, -0.3F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 117
		fraggrenadeModel[89].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[89].rotateAngleX = -3.14159265F;
		fraggrenadeModel[89].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[90].addShapeBox(-3.7F, -14F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118
		fraggrenadeModel[90].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[90].rotateAngleX = -3.14159265F;
		fraggrenadeModel[90].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[91].addShapeBox(3.5F, -13F, -3.5F, 1, 1, 5, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 119
		fraggrenadeModel[91].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[91].rotateAngleX = -3.14159265F;
		fraggrenadeModel[91].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[92].addShapeBox(3F, -13.5F, -3.5F, 4, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F); // Box 120
		fraggrenadeModel[92].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[92].rotateAngleX = -3.14159265F;
		fraggrenadeModel[92].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[93].addShapeBox(2F, -12.5F, -3.5F, 1, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 121
		fraggrenadeModel[93].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[93].rotateAngleX = -3.14159265F;
		fraggrenadeModel[93].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[94].addShapeBox(7F, -12.5F, -3.5F, 1, 4, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 122
		fraggrenadeModel[94].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[94].rotateAngleX = -3.14159265F;
		fraggrenadeModel[94].rotateAngleY = -3.14159265F;
		
		fraggrenadeModel[95].addShapeBox(3F, -8.5F, -3.5F, 4, 1, 1, 0F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 123
		fraggrenadeModel[95].setRotationPoint(0F, 0F, 0F);
		fraggrenadeModel[95].rotateAngleX = -3.14159265F;
		fraggrenadeModel[95].rotateAngleY = -3.14159265F;
		
		
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		
		GlStateManager.scale(0.2F, 0.2F, 0.2F);
		
		for(int i = 0; i < 96; i++)
		{
			fraggrenadeModel[i].render(f5);
		}
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
	
	public ModelRendererTurbo fraggrenadeModel[];
}
