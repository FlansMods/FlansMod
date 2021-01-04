//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.01.2016 - 21:41:20
// Last changed on: 17.01.2016 - 21:41:20

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelZF4Scope extends ModelAttachment //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	public ModelZF4Scope() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[28];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		attachmentModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
		attachmentModel[7] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 7
		attachmentModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 8
		attachmentModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 9
		attachmentModel[10] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 10
		attachmentModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 11
		attachmentModel[12] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 12
		attachmentModel[13] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 13
		attachmentModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		attachmentModel[15] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 15
		attachmentModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 16
		attachmentModel[17] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 18
		attachmentModel[18] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 19
		attachmentModel[19] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 20
		attachmentModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 24
		attachmentModel[21] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 28
		attachmentModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 32
		attachmentModel[23] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 36
		attachmentModel[24] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 37
		attachmentModel[25] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 38
		attachmentModel[26] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 39
		attachmentModel[27] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 40
		
		attachmentModel[0].addShapeBox(-1F, -0.7F, -1F, 2, 1, 2, 0F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -1.2F, 0F, -0.8F, -1.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 0
		attachmentModel[0].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[1].addShapeBox(-1F, -1.1F, -1F, 2, 1, 2, 0F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.8F, -1.25F, 0F, -0.8F, -1.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 2
		attachmentModel[1].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[2].addShapeBox(-1F, -2.3F, -1F, 1, 2, 2, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -1.2F, -0.4F, -0.8F, -1.2F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0F, -1.3F, -0.4F, 0F, -1.3F); // Box 2
		attachmentModel[2].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[3].addShapeBox(0F, -2.3F, -1F, 1, 2, 2, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -1.2F, -0.4F, -0.8F, -1.2F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0F, -1.3F, -0.4F, 0F, -1.3F); // Box 3
		attachmentModel[3].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[4].addShapeBox(-1.3F, -0.9F, -1F, 1, 1, 2, 0F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -1.2F, -0.3F, -0.8F, -1.2F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F); // Box 4
		attachmentModel[4].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[5].addShapeBox(0.3F, -0.9F, -1F, 1, 1, 2, 0F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -1.2F, -0.3F, -0.8F, -1.2F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F); // Box 5
		attachmentModel[5].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[6].addShapeBox(-1F, -1.9F, -0.7F, 2, 1, 1, 0F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F); // Box 6
		attachmentModel[6].setRotationPoint(0F, 0F, 0F);
		attachmentModel[6].rotateAngleX = -0.08726646F;
		
		attachmentModel[7].addShapeBox(-2F, -1.9F, -0.55F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 7
		attachmentModel[7].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[8].addShapeBox(-2F, -2.25F, -0.55F, 1, 1, 1, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 8
		attachmentModel[8].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[9].addShapeBox(-2F, -1.55F, -0.55F, 1, 1, 1, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 9
		attachmentModel[9].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[10].addShapeBox(1F, -1.55F, -0.55F, 1, 1, 1, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 10
		attachmentModel[10].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[11].addShapeBox(1F, -1.9F, -0.55F, 1, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 11
		attachmentModel[11].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[12].addShapeBox(1F, -2.25F, -0.55F, 1, 1, 1, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 12
		attachmentModel[12].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[13].addShapeBox(-1F, -2.5F, -0.9F, 1, 1, 2, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -1.2F, -0.4F, -0.8F, -1.2F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -1.3F, -0.4F, 0F, -1.3F); // Box 13
		attachmentModel[13].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[14].addShapeBox(0F, -2.5F, -0.9F, 1, 1, 2, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -1.2F, -0.4F, -0.8F, -1.2F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -1.3F, -0.4F, 0F, -1.3F); // Box 14
		attachmentModel[14].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[15].addShapeBox(-0.1F, -0.9F, -1F, 1, 1, 1, 0F, 0F, -0.8F, -0.35F, 0F, -0.8F, -0.35F, 0F, -0.8F, -0.35F, 0F, -0.8F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 15
		attachmentModel[15].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[16].addShapeBox(-0.5F, -1.9F, -0.9F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F); // Box 16
		attachmentModel[16].setRotationPoint(0F, 0F, 0F);
		attachmentModel[16].rotateAngleX = -0.08726646F;
		
		attachmentModel[17].addShapeBox(-0.5F, -2F, -0.7F, 1, 1, 1, 0F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 18
		attachmentModel[17].setRotationPoint(0F, 0F, 0F);
		attachmentModel[17].rotateAngleX = -0.08726646F;
		
		attachmentModel[18].addShapeBox(-0.5F, -1.9F, -0.9F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F); // Box 19
		attachmentModel[18].setRotationPoint(0F, 0F, 0F);
		attachmentModel[18].rotateAngleX = -0.08726646F;
		
		attachmentModel[19].addShapeBox(-0.5F, -2F, -0.7F, 1, 1, 1, 0F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F); // Box 20
		attachmentModel[19].setRotationPoint(0F, 0F, 0F);
		attachmentModel[19].rotateAngleX = -0.08726646F;
		
		attachmentModel[20].addShapeBox(-2.3F, -2.25F, -0.55F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F); // Box 24
		attachmentModel[20].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[21].addShapeBox(-2.3F, -1.9F, -0.55F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F); // Box 28
		attachmentModel[21].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[22].addShapeBox(-2.3F, -1.55F, -0.55F, 1, 1, 1, 0F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 32
		attachmentModel[22].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[23].addShapeBox(1.5F, -1.55F, -0.55F, 1, 1, 1, 0F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 36
		attachmentModel[23].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[24].addShapeBox(1.5F, -1.9F, -0.55F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F); // Box 37
		attachmentModel[24].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[25].addShapeBox(1.5F, -2.25F, -0.55F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F); // Box 38
		attachmentModel[25].setRotationPoint(0F, 0F, 0F);
		
		attachmentModel[26].addShapeBox(0F, -1.9F, -0.7F, 1, 1, 1, 0F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F); // Box 39
		attachmentModel[26].setRotationPoint(0F, 0F, 0F);
		attachmentModel[26].rotateAngleX = -0.08726646F;
		
		attachmentModel[27].addShapeBox(-1F, -1.9F, -0.7F, 1, 1, 1, 0F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F); // Box 40
		attachmentModel[27].setRotationPoint(0F, 0F, 0F);
		attachmentModel[27].rotateAngleX = -0.08726646F;
		
		
		flipAll();
	}
}
