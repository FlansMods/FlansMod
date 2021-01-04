//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: type100
// Model Creator:
// Created on: 17.08.2015 - 13:31:54
// Last changed on: 17.08.2015 - 13:31:54

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelType100 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;
	
	public ModelType100() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[30];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 16
		gunModel[5] = new ModelRendererTurbo(this, 2, 25, textureX, textureY); // Box 17
		gunModel[6] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 20
		gunModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		gunModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 22
		gunModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 23
		gunModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24
		gunModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 54
		gunModel[12] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 1
		gunModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 42
		gunModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 43
		gunModel[15] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 40
		gunModel[16] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 46
		gunModel[17] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 47
		gunModel[18] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 48
		gunModel[19] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 50
		gunModel[20] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 53
		gunModel[21] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 58
		gunModel[22] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 59
		gunModel[23] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 33
		gunModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		gunModel[25] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 35
		gunModel[26] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 38
		gunModel[27] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 41
		gunModel[28] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 36
		gunModel[29] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 37
		
		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 2.5F, -1.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.5F, -1.5F, -1F, 1.5F, 3F, -0.8F, 1F, 1F, -0.5F, 1F, 1F, -0.5F, 1.5F, 3F, -0.8F); // Box 2
		gunModel[0].setRotationPoint(-1.5F, -11F, -2.5F);
		
		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F, 1F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 1F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F); // Box 3
		gunModel[1].setRotationPoint(1.5F, -11F, -2.5F);
		
		gunModel[2].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		gunModel[2].setRotationPoint(-23F, -5F, -2F);
		
		gunModel[3].addShapeBox(0F, 0F, 0F, 31, 1, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 1.5F, 0.5F); // Box 10
		gunModel[3].setRotationPoint(8.5F, -9.5F, -1.5F);
		
		gunModel[4].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 16
		gunModel[4].setRotationPoint(21F, -12F, -1.5F);
		
		gunModel[5].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0.3F, 0.3F, 4F, 0.3F, 0.3F, 4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 4F, 0.3F, 0.3F, 4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 17
		gunModel[5].setRotationPoint(37.5F, -12.25F, -1F);
		
		gunModel[6].addShapeBox(0F, 0F, 0F, 21, 2, 4, 0F, -1F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -1F, 0F, 0.01F, -1F, 0.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.01F, -1F, 0.5F, 0.01F); // Box 20
		gunModel[6].setRotationPoint(0F, -12F, -2F);
		
		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[7].setRotationPoint(2.5F, -7F, -0.5F);
		
		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[8].setRotationPoint(7.5F, -7F, -0.5F);
		
		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[9].setRotationPoint(3F, -5F, -0.5F);
		
		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[10].setRotationPoint(4.5F, -7.5F, -0.5F);
		gunModel[10].rotateAngleZ = -0.10471976F;
		
		gunModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0.5F, 0F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 54
		gunModel[11].setRotationPoint(-23F, -9F, -2F);
		
		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 1
		gunModel[12].setRotationPoint(32.5F, -13.85F, -1.5F);
		
		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 42
		gunModel[13].setRotationPoint(9F, -13.6F, -1.25F);
		
		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 43
		gunModel[14].setRotationPoint(9F, -13.6F, 0.25F);
		
		gunModel[15].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[15].setRotationPoint(1.5F, -13.5F, -1.5F);
		
		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 46
		gunModel[16].setRotationPoint(9F, -14.6F, 0.25F);
		
		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 47
		gunModel[17].setRotationPoint(9F, -14.6F, -1.25F);
		
		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 1F, 1F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 1F, 1F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 48
		gunModel[18].setRotationPoint(-5F, -9F, -2F);
		
		gunModel[19].addShapeBox(0F, 0F, 0F, 23, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[19].setRotationPoint(14.5F, -13.5F, -1.5F);
		
		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 53
		gunModel[20].setRotationPoint(56.5F, -13.3F, -1F);
		
		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, -1F, -0.65F, -0.65F, -1F, -0.65F, -0.65F, 0F, -0.65F, -0.65F); // Box 58
		gunModel[21].setRotationPoint(54.5F, -11.5F, -1F);
		
		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.6F, -0.85F, -0.5F, 0.6F, -0.85F, -0.5F, 0.6F, -0.85F, 0F, 0.6F, -0.85F, 0F, -0.1F, -0.85F, 0F, -0.1F, -0.85F, 0F, -0.1F, -0.85F, 0F, -0.1F, -0.85F); // Box 59
		gunModel[22].setRotationPoint(56.5F, -14.05F, -1F);
		
		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -3.2F, 0.6F, 0F, -3.2F, 0.6F, 0F, -3.2F, 0.6F, 0F, -3.2F, 0.6F); // Box 33
		gunModel[23].setRotationPoint(37.45F, -13.75F, -1.5F);
		
		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 34
		gunModel[24].setRotationPoint(1.45F, -13.5F, -1.5F);
		
		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 1F, 0.35F, 0F, 1F, 0.35F, 0F, 1F, 0.35F, 0F, 1F, 0.35F); // Box 35
		gunModel[25].setRotationPoint(54.5F, -13F, -1F);
		
		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F); // Box 38
		gunModel[26].setRotationPoint(39.5F, -12.75F, -1F);
		
		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 41
		gunModel[27].setRotationPoint(61.5F, -12.75F, -1F);
		
		gunModel[28].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, -0.2F, 4F, 0F, -0.2F, 4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.25F, 0.3F, 4F, -0.25F, 0.3F, 4F, -0.25F, 0.3F, 0F, -0.25F, 0.3F); // Box 36
		gunModel[28].setRotationPoint(37.5F, -13.3F, -1F);
		
		gunModel[29].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, -0.25F, 0.3F, 4F, -0.25F, 0.3F, 4F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, 0F, -0.2F, 4F, 0F, -0.2F, 4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 37
		gunModel[29].setRotationPoint(37.5F, -11.2F, -1F);
		
		
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 63, 56, textureX, textureY); // Box 30
		ammoModel[1] = new ModelRendererTurbo(this, 92, 56, textureX, textureY); // Box 31
		ammoModel[2] = new ModelRendererTurbo(this, 47, 56, textureX, textureY); // Box 32
		
		ammoModel[0].addShapeBox(34.5F, -12.85F, 1.5F, 5, 2, 9, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[1].addShapeBox(34.5F, -12.85F, 10.5F, 5, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 31
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[2].addShapeBox(36.5F, -12.85F, 19.5F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 32
		ammoModel[2].setRotationPoint(0F, 0F, 0F);
		
		
		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 46
		pumpModel[1] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 43
		
		pumpModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F); // Box 46
		pumpModel[0].setRotationPoint(36F, -14.75F, -2.8F);
		pumpModel[0].rotateAngleX = -0.59341195F;
		
		pumpModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 43
		pumpModel[1].setRotationPoint(35.5F, -15.8F, -3.6F);
		pumpModel[1].rotateAngleX = -0.59341195F;
		
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
