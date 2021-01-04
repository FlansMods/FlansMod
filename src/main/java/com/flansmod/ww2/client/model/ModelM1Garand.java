//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM1Garand extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;
	
	public ModelM1Garand() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[37];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 5
		gunModel[3] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 6
		gunModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 7
		gunModel[5] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 10
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		gunModel[8] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 12
		gunModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 13
		gunModel[10] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 16
		gunModel[11] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 18
		gunModel[12] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 17
		gunModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 19
		gunModel[14] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 20
		gunModel[15] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 21
		gunModel[16] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 22
		gunModel[17] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 25
		gunModel[20] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 26
		gunModel[21] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 27
		gunModel[22] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 33
		gunModel[23] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 34
		gunModel[24] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 35
		gunModel[25] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 37
		gunModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		gunModel[27] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 45
		gunModel[28] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 46
		gunModel[29] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
		gunModel[30] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 29
		gunModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 40
		gunModel[32] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 0
		gunModel[33] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 1
		gunModel[34] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		gunModel[35] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 5
		gunModel[36] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 6
		
		gunModel[0].addShapeBox(0F, 0F, 0F, 17, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(14F, -8F, -2.5F);
		
		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[1].setRotationPoint(-1F, -8F, -2.5F);
		
		gunModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[2].setRotationPoint(15.5F, -11F, -2.5F);
		
		gunModel[3].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[3].setRotationPoint(32.5F, -11F, -2.5F);
		
		gunModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[4].setRotationPoint(14.5F, -9F, -2.5F);
		
		gunModel[5].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[5].setRotationPoint(15.5F, -10F, -2.5F);
		
		gunModel[6].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		gunModel[6].setRotationPoint(32.5F, -8F, -2.5F);
		
		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[7].setRotationPoint(31.5F, -11F, -2.5F);
		
		gunModel[8].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 12
		gunModel[8].setRotationPoint(31.5F, -10F, -2.5F);
		
		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		gunModel[9].setRotationPoint(31.5F, -8F, -2.5F);
		
		gunModel[10].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[10].setRotationPoint(32.5F, -10F, -2.5F);
		
		gunModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[11].setRotationPoint(49.5F, -8.3F, -0.5F);
		
		gunModel[12].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[12].setRotationPoint(6F, -8F, -2.5F);
		
		gunModel[13].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 19
		gunModel[13].setRotationPoint(6F, -4F, -2.5F);
		
		gunModel[14].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[14].setRotationPoint(-0.5F, -9F, -2F);
		
		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 21
		gunModel[15].setRotationPoint(-0.5F, -3F, -1.5F);
		
		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 22
		gunModel[16].setRotationPoint(4.5F, -3F, -1.5F);
		
		gunModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 23
		gunModel[17].setRotationPoint(0F, -1F, -1.5F);
		
		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		gunModel[18].setRotationPoint(2F, -3.5F, -1F);
		gunModel[18].rotateAngleZ = 0.15707963F;
		
		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[19].setRotationPoint(56F, -11F, -1F);
		
		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[20].setRotationPoint(56F, -11F, -0.75F);
		
		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[21].setRotationPoint(56F, -11F, -0.25F);
		
		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[22].setRotationPoint(14.5F, -11F, -2.5F);
		
		gunModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[23].setRotationPoint(1.5F, -10F, -2F);
		
		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 35
		gunModel[24].setRotationPoint(1.5F, -10.5F, -1.5F);
		
		gunModel[25].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[25].setRotationPoint(5.5F, -10F, 1F);
		
		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[26].setRotationPoint(2F, -11F, -0.5F);
		
		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[27].setRotationPoint(2F, -11.15F, -1.75F);
		
		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[28].setRotationPoint(2F, -11.15F, 0.75F);
		
		gunModel[29].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -16F, 0F, -1F, -16F, 0F, -1F, 0F, 0F, -1F); // Box 0
		gunModel[29].setRotationPoint(14F, -4F, -2.5F);
		
		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 29
		gunModel[30].setRotationPoint(56.5F, -12F, -0.5F);
		
		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 40
		gunModel[31].setRotationPoint(2F, -12F, -1F);
		
		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 0
		gunModel[32].setRotationPoint(2F, -12F, 0F);
		
		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 1
		gunModel[33].setRotationPoint(2F, -12.5F, -0.5F);
		
		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[34].setRotationPoint(49.5F, -11F, -2.5F);
		
		gunModel[35].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 5
		gunModel[35].setRotationPoint(49.5F, -10F, -2.5F);
		
		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		gunModel[36].setRotationPoint(49.5F, -8F, -2.5F);
		
		
		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 17
		
		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 17
		defaultBarrelModel[0].setRotationPoint(49.5F, -10.75F, -1F);
		
		
		defaultStockModel = new ModelRendererTurbo[2];
		defaultStockModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		defaultStockModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		
		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 2F, 0F); // Box 2
		defaultStockModel[0].setRotationPoint(-1F, -7.5F, -2.5F);
		defaultStockModel[0].rotateAngleZ = -1.02974426F;
		
		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 22, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F); // Box 4
		defaultStockModel[1].setRotationPoint(-23F, -6F, -2.5F);
		
		
		ammoModel = new ModelRendererTurbo[9];
		ammoModel[0] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 49
		ammoModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 50
		ammoModel[2] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 51
		ammoModel[3] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 52
		ammoModel[4] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 53
		ammoModel[5] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 54
		ammoModel[6] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 55
		ammoModel[7] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 56
		ammoModel[8] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 57
		
		ammoModel[0].addShapeBox(8F, -8.9F, -1F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[1].addBox(9F, -8.6F, -0.9F, 3, 1, 1, 0F); // Box 50
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[2].addBox(9F, -8.5F, -0.1F, 3, 1, 1, 0F); // Box 51
		ammoModel[2].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[3].addBox(9F, -7.4F, -0.100000000000001F, 3, 1, 1, 0F); // Box 52
		ammoModel[3].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[4].addBox(9F, -6.2F, -0.100000000000001F, 3, 1, 1, 0F); // Box 53
		ammoModel[4].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[5].addBox(9F, -5.1F, -0.1F, 3, 1, 1, 0F); // Box 54
		ammoModel[5].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[6].addBox(9F, -7.5F, -0.9F, 3, 1, 1, 0F); // Box 55
		ammoModel[6].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[7].addBox(9F, -6.3F, -0.9F, 3, 1, 1, 0F); // Box 56
		ammoModel[7].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[8].addShapeBox(9F, -5.2F, -0.9F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		ammoModel[8].setRotationPoint(0F, 0F, 0F);
		
		
		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 47
		slideModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 48
		slideModel[2] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 7
		
		slideModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		slideModel[0].setRotationPoint(13F, -10F, -2.55F);
		
		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		slideModel[1].setRotationPoint(13F, -10F, -3.5F);
		
		slideModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F); // Box 7
		slideModel[2].setRotationPoint(5F, -9.8F, -0.5F);
		
		
		gunSlideDistance = 0.5F;
		
		translateAll(-8F, -6F, 0.2F);
		thirdPersonOffset = new Vector3f(-0.2F, -0.15F, 0.01F);
		
		
		flipAll();
	}
}
