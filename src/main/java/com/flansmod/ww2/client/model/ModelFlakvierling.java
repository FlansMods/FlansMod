//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFlakvierling extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 128;
	
	public ModelFlakvierling() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 3
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 25, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-26F, 5F, -1F);
		
		bodyModel[1].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 8.5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 8.5F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-5F, 5F, -7F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(-5F, 4.5F, -9F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(5F, 4.5F, -9F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 8.5F, 0F, 0F, 0F); // Box 9
		bodyModel[4].setRotationPoint(-5F, 5F, 4F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 10
		bodyModel[5].setRotationPoint(-9F, 4.5F, -9F);
		
		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 12
		bodyModel[6].setRotationPoint(-25F, 4F, -0.5F);
		
		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 13
		bodyModel[7].setRotationPoint(12.5F, 4F, 13.5F);
		
		bodyModel[8].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 15
		bodyModel[8].setRotationPoint(12.5F, 4F, -14.5F);
		
		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F); // Box 1
		bodyModel[9].setRotationPoint(12.5F, 3F, 13.5F);
		
		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F); // Box 2
		bodyModel[10].setRotationPoint(12.5F, 3F, -14.5F);
		
		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F, 0.25F, -1.35F, 0.25F); // Box 3
		bodyModel[11].setRotationPoint(-25F, 3F, -0.5F);
		
		
		turretModel = new ModelRendererTurbo[42];
		turretModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 18
		turretModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 19
		turretModel[2] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 20
		turretModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 21
		turretModel[4] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 22
		turretModel[5] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 23
		turretModel[6] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 24
		turretModel[7] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 25
		turretModel[8] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 26
		turretModel[9] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 27
		turretModel[10] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 35
		turretModel[11] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 36
		turretModel[12] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 67
		turretModel[13] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 68
		turretModel[14] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 69
		turretModel[15] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 72
		turretModel[16] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 73
		turretModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
		turretModel[18] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 75
		turretModel[19] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 76
		turretModel[20] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 77
		turretModel[21] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 78
		turretModel[22] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 79
		turretModel[23] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 80
		turretModel[24] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 81
		turretModel[25] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 82
		turretModel[26] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 83
		turretModel[27] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 84
		turretModel[28] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 85
		turretModel[29] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 86
		turretModel[30] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 87
		turretModel[31] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 88
		turretModel[32] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 89
		turretModel[33] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 91
		turretModel[34] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 98
		turretModel[35] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 99
		turretModel[36] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 100
		turretModel[37] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 83
		turretModel[38] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 84
		turretModel[39] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 85
		turretModel[40] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 86
		turretModel[41] = new ModelRendererTurbo(this, 39, 86, textureX, textureY); // Box 0
		
		turretModel[0].addShapeBox(5F, 6.5F, -7F, 2, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 18
		turretModel[0].setRotationPoint(0F, -3F, 0F);
		
		turretModel[1].addShapeBox(-7F, 6.5F, -7F, 2, 1, 14, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 19
		turretModel[1].setRotationPoint(0F, -3F, 0F);
		
		turretModel[2].addShapeBox(-5F, 6.5F, -7F, 10, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		turretModel[2].setRotationPoint(0F, -3F, 0F);
		
		turretModel[3].addBox(-4F, -3F, 3F, 8, 10, 1, 0F); // Box 21
		turretModel[3].setRotationPoint(0F, -3F, 0F);
		
		turretModel[4].addBox(-4F, -3F, -4F, 8, 10, 1, 0F); // Box 22
		turretModel[4].setRotationPoint(0F, -3F, 0F);
		
		turretModel[5].addShapeBox(-4F, -5F, -4F, 8, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		turretModel[5].setRotationPoint(0F, -3F, 0F);
		
		turretModel[6].addShapeBox(-4F, -5F, 3F, 8, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		turretModel[6].setRotationPoint(0F, -3F, 0F);
		
		turretModel[7].addBox(-3F, -3F, -2.5F, 6, 7, 5, 0F); // Box 25
		turretModel[7].setRotationPoint(0F, -3F, 0F);
		
		turretModel[8].addShapeBox(-3F, -7F, -3F, 6, 4, 6, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[8].setRotationPoint(0F, -3F, 0F);
		
		turretModel[9].addShapeBox(-6F, -7F, -3F, 3, 4, 6, 0F, 2F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 2F, 1F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 27
		turretModel[9].setRotationPoint(0F, -3F, 0F);
		
		turretModel[10].addShapeBox(3F, -6F, -3F, 1, 3, 6, 0F, 0F, 1F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 1F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[10].setRotationPoint(0F, -3F, 0F);
		
		turretModel[11].addShapeBox(3F, -3F, -4.5F, 2, 7, 9, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[11].setRotationPoint(0F, -3F, 0F);
		
		turretModel[12].addShapeBox(5.5F, -3F, -3F, 1, 8, 6, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 67
		turretModel[12].setRotationPoint(0F, -3F, 0F);
		
		turretModel[13].addShapeBox(5.5F, -2F, -12F, 1, 8, 6, 0F, 2.2F, 0F, 0F, -2.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, -2.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 68
		turretModel[13].setRotationPoint(0F, -3F, 0F);
		
		turretModel[14].addShapeBox(5.5F, -2F, 6F, 1, 8, 6, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2.6F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2.6F, 0F, 0F, 2.2F, 0F, 0F); // Box 69
		turretModel[14].setRotationPoint(0F, -3F, 0F);
		
		turretModel[15].addShapeBox(5.5F, -8F, -12F, 1, 6, 6, 0F, 4.2F, 0F, -2.2F, -4.6F, 0F, -2.2F, -2.6F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -2.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 72
		turretModel[15].setRotationPoint(0F, -3F, 0F);
		
		turretModel[16].addShapeBox(5.5F, -8F, 6F, 1, 6, 6, 0F, 2.2F, 0F, 0F, -2.6F, 0F, 0F, -4.6F, 0F, -2.2F, 4.2F, 0F, -2.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2.6F, 0F, 0F, 2.2F, 0F, 0F); // Box 73
		turretModel[16].setRotationPoint(0F, -3F, 0F);
		
		turretModel[17].addBox(-13F, 3F, -10.5F, 10, 1, 21, 0F); // Box 74
		turretModel[17].setRotationPoint(0F, 0F, 0F);
		
		turretModel[18].addBox(-15F, 0F, -3F, 6, 1, 6, 0F); // Box 75
		turretModel[18].setRotationPoint(0F, 0F, 0F);
		
		turretModel[19].addBox(-13F, 1F, -0.5F, 1, 2, 1, 0F); // Box 76
		turretModel[19].setRotationPoint(0F, 0F, 0F);
		
		turretModel[20].addShapeBox(-16F, -2F, -1F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 77
		turretModel[20].setRotationPoint(0F, 0F, 0F);
		
		turretModel[21].addBox(-16F, -5F, -2.5F, 1, 3, 5, 0F); // Box 78
		turretModel[21].setRotationPoint(0F, 0F, 0F);
		
		turretModel[22].addBox(-13F, 1F, -2.5F, 1, 2, 1, 0F); // Box 79
		turretModel[22].setRotationPoint(0F, 0F, 0F);
		turretModel[22].rotateAngleY = 0.73303829F;
		
		turretModel[23].addBox(-15F, 0F, -5F, 6, 1, 6, 0F); // Box 80
		turretModel[23].setRotationPoint(0F, 0F, 0F);
		turretModel[23].rotateAngleY = 0.73303829F;
		
		turretModel[24].addShapeBox(-16F, -2F, -3F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 81
		turretModel[24].setRotationPoint(0F, 0F, 0F);
		turretModel[24].rotateAngleY = 0.73303829F;
		
		turretModel[25].addBox(-16F, -5F, -4.5F, 1, 3, 5, 0F); // Box 82
		turretModel[25].setRotationPoint(0F, 0F, 0F);
		turretModel[25].rotateAngleY = 0.73303829F;
		
		turretModel[26].addBox(-13F, 1F, 1.5F, 1, 2, 1, 0F); // Box 83
		turretModel[26].setRotationPoint(0F, 0F, 0F);
		turretModel[26].rotateAngleY = -0.73303829F;
		
		turretModel[27].addBox(-15F, 0F, -1F, 6, 1, 6, 0F); // Box 84
		turretModel[27].setRotationPoint(0F, 0F, 0F);
		turretModel[27].rotateAngleY = -0.73303829F;
		
		turretModel[28].addShapeBox(-16F, -2F, 1F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 85
		turretModel[28].setRotationPoint(0F, 0F, 0F);
		turretModel[28].rotateAngleY = -0.73303829F;
		
		turretModel[29].addBox(-16F, -5F, -0.5F, 1, 3, 5, 0F); // Box 86
		turretModel[29].setRotationPoint(0F, 0F, 0F);
		turretModel[29].rotateAngleY = -0.73303829F;
		
		turretModel[30].addShapeBox(-4F, -14F, 1F, 1, 3, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 87
		turretModel[30].setRotationPoint(0F, 0F, 0F);
		
		turretModel[31].addShapeBox(-4F, -14F, -2F, 1, 3, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F); // Box 88
		turretModel[31].setRotationPoint(0F, 0F, 0F);
		
		turretModel[32].addShapeBox(-9F, -11F, 1F, 6, 3, 3, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F); // Box 89
		turretModel[32].setRotationPoint(0F, 0F, -1F);
		
		turretModel[33].addShapeBox(-11F, -11F, 2.5F, 4, 3, 2, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, -0.5F, 0F, 0F, 0F); // Box 91
		turretModel[33].setRotationPoint(0F, 0F, 0F);
		
		turretModel[34].addBox(-6F, -5F, -2F, 4, 1, 4, 0F); // Box 98
		turretModel[34].setRotationPoint(0F, 0F, 0F);
		turretModel[34].rotateAngleZ = 0.17453293F;
		
		turretModel[35].addBox(-5.5F, -6F, -1.5F, 3, 1, 3, 0F); // Box 99
		turretModel[35].setRotationPoint(0F, 0F, 0F);
		turretModel[35].rotateAngleZ = 0.17453293F;
		
		turretModel[36].addShapeBox(-5.5F, -7F, -0.5F, 1, 1, 1, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 100
		turretModel[36].setRotationPoint(0F, 0F, 0F);
		turretModel[36].rotateAngleZ = 0.17453293F;
		
		turretModel[37].addShapeBox(3F, -2F, -14F, 1, 5, 2, 0F, 2.2F, 0F, 0F, -2.6F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, -2.6F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F); // Box 83
		turretModel[37].setRotationPoint(0F, -3F, 0F);
		
		turretModel[38].addShapeBox(3F, -8F, -14F, 1, 6, 2, 0F, 4.2F, 0F, -2.2F, -4.6F, 0F, -2.2F, -2.1F, 0F, 2.2F, 1.7F, 0F, 2.2F, 2.2F, 0F, 0F, -2.6F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F); // Box 84
		turretModel[38].setRotationPoint(0F, -3F, 0F);
		
		turretModel[39].addShapeBox(3F, -2F, 12F, 1, 5, 2, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -2.6F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -2.6F, 0F, 0F, 2.2F, 0F, 0F); // Box 85
		turretModel[39].setRotationPoint(0F, -3F, 0F);
		
		turretModel[40].addShapeBox(3F, -8F, 12F, 1, 6, 2, 0F, 1.7F, 0F, 2.2F, -2.1F, 0F, 2.2F, -4.6F, 0F, -2.2F, 4.2F, 0F, -2.2F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -2.6F, 0F, 0F, 2.2F, 0F, 0F); // Box 86
		turretModel[40].setRotationPoint(0F, -3F, 0F);
		
		turretModel[41].addShapeBox(-3F, -8.8F, 5F, 35, 1, 35, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, -32F, 0F, 0F, -32F); // Box 0
		turretModel[41].setRotationPoint(0F, -3F, 0F);
		turretModel[41].rotateAngleY = 0.43633231F;
		turretModel[41].rotateAngleZ = -1.18682389F;
		
		
		barrelModel = new ModelRendererTurbo[38];
		barrelModel[0] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 28
		barrelModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 29
		barrelModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 30
		barrelModel[3] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 31
		barrelModel[4] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 32
		barrelModel[5] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 33
		barrelModel[6] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 34
		barrelModel[7] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 37
		barrelModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 41
		barrelModel[9] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 43
		barrelModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 44
		barrelModel[11] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 45
		barrelModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 46
		barrelModel[13] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 48
		barrelModel[14] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 52
		barrelModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 53
		barrelModel[16] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 54
		barrelModel[17] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 55
		barrelModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 56
		barrelModel[19] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 57
		barrelModel[20] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 58
		barrelModel[21] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 59
		barrelModel[22] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 60
		barrelModel[23] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 61
		barrelModel[24] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 62
		barrelModel[25] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 63
		barrelModel[26] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 64
		barrelModel[27] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 65
		barrelModel[28] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 66
		barrelModel[29] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 92
		barrelModel[30] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 93
		barrelModel[31] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 95
		barrelModel[32] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 96
		barrelModel[33] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 97
		barrelModel[34] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 87
		barrelModel[35] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 88
		barrelModel[36] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 89
		barrelModel[37] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 90
		
		barrelModel[0].addBox(-1F, -0.75F, -5F, 2, 2, 10, 0F); // Box 28
		barrelModel[0].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[1].addShapeBox(-3.5F, -3.25F, 3.5F, 7, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		barrelModel[1].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[2].addShapeBox(-3.5F, -1.25F, 3.5F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		barrelModel[2].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[3].addShapeBox(-3.5F, 1.75F, 3.5F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 31
		barrelModel[3].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[4].addShapeBox(-3.5F, -1.25F, -4.5F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		barrelModel[4].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[5].addShapeBox(-3.5F, 1.75F, -4.5F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 33
		barrelModel[5].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[6].addShapeBox(-3.5F, -3.25F, -4.5F, 7, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		barrelModel[6].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[7].addShapeBox(0F, -3F, 4F, 22, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 37
		barrelModel[7].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[8].addShapeBox(-1F, -2F, 4F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 41
		barrelModel[8].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[9].addShapeBox(-1F, 1.5F, 5F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 43
		barrelModel[9].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[10].addShapeBox(-1F, -2F, -5F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 44
		barrelModel[10].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[11].addShapeBox(-1F, 1.5F, -6F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 45
		barrelModel[11].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[12].addShapeBox(5.5F, -4F, 3F, 1, 6, 3, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 46
		barrelModel[12].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[13].addShapeBox(4.5F, -5F, 3F, 1, 1, 3, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 48
		barrelModel[13].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[14].addShapeBox(-1.5F, -2F, 5F, 5, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 52
		barrelModel[14].setRotationPoint(0F, -4F, 0F);
		barrelModel[14].rotateAngleY = -0.06981317F;
		
		barrelModel[15].addShapeBox(-1.5F, 1.5F, 5F, 5, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 53
		barrelModel[15].setRotationPoint(0F, -4F, 0F);
		barrelModel[15].rotateAngleY = -0.06981317F;
		
		barrelModel[16].addShapeBox(-1.5F, -2F, -9F, 5, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 54
		barrelModel[16].setRotationPoint(0F, -4F, 0F);
		barrelModel[16].rotateAngleY = 0.06981317F;
		
		barrelModel[17].addShapeBox(-1.5F, 1.5F, -9F, 5, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 55
		barrelModel[17].setRotationPoint(0F, -4F, 0F);
		barrelModel[17].rotateAngleY = 0.06981317F;
		
		barrelModel[18].addShapeBox(0F, 0.5F, 4F, 22, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 56
		barrelModel[18].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[19].addShapeBox(0F, 0.5F, -5F, 22, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 57
		barrelModel[19].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[20].addShapeBox(0F, -3F, -5F, 22, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 58
		barrelModel[20].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[21].addShapeBox(22F, -3F, 4F, 2, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 59
		barrelModel[21].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[22].addShapeBox(22F, 0.5F, 4F, 2, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 60
		barrelModel[22].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[23].addShapeBox(22F, 0.5F, -5F, 2, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 61
		barrelModel[23].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[24].addShapeBox(22F, -3F, -5F, 2, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 62
		barrelModel[24].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[25].addShapeBox(-5F, -2.5F, 4F, 4, 2, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 63
		barrelModel[25].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[26].addShapeBox(-5F, 1.5F, 4F, 4, 2, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 64
		barrelModel[26].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[27].addShapeBox(-5F, 1.5F, -5F, 4, 2, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 65
		barrelModel[27].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[28].addShapeBox(-5F, -2.5F, -5F, 4, 2, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 66
		barrelModel[28].setRotationPoint(0F, -4F, 0F);
		
		barrelModel[29].addShapeBox(-1.5F, -2F, 2.5F, 2, 3, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		barrelModel[29].setRotationPoint(-7.5F, -11F, 0F);
		
		barrelModel[30].addBox(-1F, -2F, 0.5F, 1, 1, 2, 0F); // Box 93
		barrelModel[30].setRotationPoint(-7.5F, -11F, 0F);
		
		barrelModel[31].addShapeBox(-1F, -3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 95
		barrelModel[31].setRotationPoint(-7.5F, -11F, 0F);
		
		barrelModel[32].addBox(-1F, -2F, -1.5F, 1, 1, 1, 0F); // Box 96
		barrelModel[32].setRotationPoint(-7.5F, -11F, 0F);
		
		barrelModel[33].addShapeBox(-1F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		barrelModel[33].setRotationPoint(-7.5F, -11F, 0F);
		
		barrelModel[34].addShapeBox(4.5F, -2F, 3F, 1, 1, 3, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F); // Box 87
		barrelModel[34].setRotationPoint(0F, 1F, 0F);
		
		barrelModel[35].addShapeBox(4.5F, -5F, -6F, 1, 1, 3, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 88
		barrelModel[35].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[36].addShapeBox(5.5F, -4F, -6F, 1, 6, 3, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 89
		barrelModel[36].setRotationPoint(0F, -3F, 0F);
		
		barrelModel[37].addShapeBox(4.5F, -2F, -6F, 1, 1, 3, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F); // Box 90
		barrelModel[37].setRotationPoint(0F, 1F, 0F);
		
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
