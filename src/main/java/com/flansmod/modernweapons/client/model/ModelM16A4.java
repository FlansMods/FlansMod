//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM16A4 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	public ModelM16A4() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[26];
		gunModel[0] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 0, 18, textureX, textureY); // Box 5
		gunModel[3] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 13, 14, textureX, textureY); // Box 19
		gunModel[5] = new ModelRendererTurbo(this, 8, 25, textureX, textureY); // Box 20
		gunModel[6] = new ModelRendererTurbo(this, 8, 25, textureX, textureY); // Box 21
		gunModel[7] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 29
		gunModel[8] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 18
		gunModel[9] = new ModelRendererTurbo(this, 0, 11, textureX, textureY); // Box 19
		gunModel[10] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // Box 20
		gunModel[11] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // Box 22
		gunModel[12] = new ModelRendererTurbo(this, 21, 32, textureX, textureY); // Box 23
		gunModel[13] = new ModelRendererTurbo(this, 33, 28, textureX, textureY); // Box 24
		gunModel[14] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // Box 25
		gunModel[15] = new ModelRendererTurbo(this, 20, 22, textureX, textureY); // Box 26
		gunModel[16] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // Box 29
		gunModel[17] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // Box 30
		gunModel[18] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 33
		gunModel[19] = new ModelRendererTurbo(this, 14, 29, textureX, textureY); // Box 34
		gunModel[20] = new ModelRendererTurbo(this, 15, 33, textureX, textureY); // Box 35
		gunModel[21] = new ModelRendererTurbo(this, 21, 0, textureX, textureY); // Box 40
		gunModel[22] = new ModelRendererTurbo(this, 21, 28, textureX, textureY); // Box 0
		gunModel[23] = new ModelRendererTurbo(this, 7, 22, textureX, textureY); // Box 3
		gunModel[24] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // Box 4
		gunModel[25] = new ModelRendererTurbo(this, 21, 32, textureX, textureY); // Box 5
		
		gunModel[0].addShapeBox(-0.5F, -4.25F, -1F, 5, 2, 2, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunModel[1].addShapeBox(1.7F, -2.35F, -1F, 3, 1, 2, 0F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.1F, -0.2F, -0.25F, 0.1F, -0.2F, -0.25F, 0.2F, -0.2F); // Box 2
		gunModel[1].setRotationPoint(0F, 0F, 0F);
		
		gunModel[2].addShapeBox(-1.2F, -3.2F, -0.5F, 2, 4, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 5
		gunModel[2].setRotationPoint(0F, 0F, 0F);
		gunModel[2].rotateAngleZ = -0.29670597F;
		
		gunModel[3].addBox(-0.5F, -4.5F, -0.5F, 5, 1, 1, 0F); // Box 10
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		
		gunModel[4].addShapeBox(1F, -1.85F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 19
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		
		gunModel[5].addShapeBox(-1F, -4.3F, -1F, 1, 2, 2, 0F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 20
		gunModel[5].setRotationPoint(0F, 0F, 0F);
		
		gunModel[6].addShapeBox(3.75F, -4.25F, -1F, 1, 2, 2, 0F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F); // Box 21
		gunModel[6].setRotationPoint(0F, 0F, 0F);
		
		gunModel[7].addShapeBox(-0.25F, -4F, -1.9F, 2, 1, 1, 0F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -1F, -0.4F, -0.1F, 0F, 0F, -0.1F, 0F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -1F, -0.4F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 29
		gunModel[7].setRotationPoint(0F, 0F, 0F);
		
		gunModel[8].addShapeBox(-0.3F, -4F, -1.95F, 2, 1, 1, 0F, -0.3F, -0.2F, -0.5F, -1.5F, -0.2F, -0.5F, -1.6F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, -0.5F, -1.5F, -0.2F, -0.5F, -1.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 18
		gunModel[8].setRotationPoint(0F, 0F, 0F);
		
		gunModel[9].addShapeBox(4.75F, -3.75F, -0.5F, 9, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 19
		gunModel[9].setRotationPoint(0F, 0F, 0F);
		
		gunModel[10].addShapeBox(4.75F, -4.6F, -1F, 6, 1, 2, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 20
		gunModel[10].setRotationPoint(0F, 0F, 0F);
		
		gunModel[11].addShapeBox(4.75F, -4.9F, -1F, 4, 1, 2, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 22
		gunModel[11].setRotationPoint(0F, 0F, 0F);
		
		gunModel[12].addShapeBox(8.75F, -4.9F, -1F, 3, 1, 2, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 23
		gunModel[12].setRotationPoint(0F, 0F, 0F);
		
		gunModel[13].addShapeBox(8.75F, -1.65F, 2.25F, 3, 1, 2, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 24
		gunModel[13].setRotationPoint(0F, 0F, 0F);
		gunModel[13].rotateAngleX = 1.57079633F;
		
		gunModel[14].addShapeBox(4.75F, -1.35F, 2.25F, 6, 1, 2, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 25
		gunModel[14].setRotationPoint(0F, 0F, 0F);
		gunModel[14].rotateAngleX = 1.57079633F;
		
		gunModel[15].addShapeBox(4.75F, -1.65F, 2.25F, 4, 1, 2, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 26
		gunModel[15].setRotationPoint(0F, 0F, 0F);
		gunModel[15].rotateAngleX = 1.57079633F;
		
		gunModel[16].addShapeBox(4.75F, 0.35F, 2.25F, 6, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Box 29
		gunModel[16].setRotationPoint(0F, 0F, 0F);
		gunModel[16].rotateAngleX = 1.57079633F;
		
		gunModel[17].addShapeBox(4.75F, -2.9F, -1F, 6, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Box 30
		gunModel[17].setRotationPoint(0F, 0F, 0F);
		
		gunModel[18].addShapeBox(13.25F, -3.75F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[18].setRotationPoint(0F, 0F, 0F);
		
		gunModel[19].addShapeBox(12.25F, -5.8F, -0.5F, 1, 3, 1, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 34
		gunModel[19].setRotationPoint(0F, 0F, 0F);
		
		gunModel[20].addShapeBox(10.5F, -5.75F, -0.5F, 1, 3, 1, 0F, -2.05F, -0.5F, -0.2F, 1.05F, -1F, -0.2F, 1.05F, -1F, -0.2F, -2.05F, -0.5F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 35
		gunModel[20].setRotationPoint(0F, 0F, 0F);
		
		gunModel[21].addShapeBox(-0.5F, -4.75F, -1F, 5, 1, 2, 0F, -0.5F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F); // Box 40
		gunModel[21].setRotationPoint(0F, 0F, 0F);
		
		gunModel[22].addShapeBox(8.75F, -1.65F, -4.25F, 3, 1, 2, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 0
		gunModel[22].setRotationPoint(0F, 0F, 0F);
		gunModel[22].rotateAngleX = -1.57079633F;
		
		gunModel[23].addShapeBox(4.75F, -1.65F, -4.25F, 4, 1, 2, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 3
		gunModel[23].setRotationPoint(0F, 0F, 0F);
		gunModel[23].rotateAngleX = -1.57079633F;
		
		gunModel[24].addShapeBox(4.75F, 1.6F, -1F, 4, 1, 2, 0F, 0F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 4
		gunModel[24].setRotationPoint(0F, 0F, 0F);
		gunModel[24].rotateAngleX = -3.14159265F;
		
		gunModel[25].addShapeBox(8.75F, 1.6F, -1F, 3, 1, 2, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 5
		gunModel[25].setRotationPoint(0F, 0F, 0F);
		gunModel[25].rotateAngleX = -3.14159265F;
		
		
		defaultScopeModel = new ModelRendererTurbo[5];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 11
		defaultScopeModel[1] = new ModelRendererTurbo(this, 12, 9, textureX, textureY); // Box 12
		defaultScopeModel[2] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 13
		defaultScopeModel[3] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 29
		defaultScopeModel[4] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 30
		
		defaultScopeModel[0].addShapeBox(-0.5F, -5.5F, -0.5F, 2, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 11
		defaultScopeModel[0].setRotationPoint(0F, 0F, 0F);
		
		defaultScopeModel[1].addShapeBox(3.8F, -5.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 12
		defaultScopeModel[1].setRotationPoint(0F, 0F, 0F);
		
		defaultScopeModel[2].addShapeBox(0.2F, -6.5F, -3.25F, 4, 1, 3, 0F, 0F, -0.2F, -2.75F, 0F, -0.7F, -2.75F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0.4F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 13
		defaultScopeModel[2].setRotationPoint(0F, 0F, 0F);
		
		defaultScopeModel[3].addShapeBox(0.2F, -6.5F, -2.5F, 4, 1, 3, 0F, 0F, -0.2F, -2.75F, 0F, -0.7F, -2.75F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0.4F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 29
		defaultScopeModel[3].setRotationPoint(0F, 0F, 0F);
		
		defaultScopeModel[4].addShapeBox(0.2F, -6F, -1.5F, 4, 1, 3, 0F, 0F, -0.45F, -1.25F, 0F, -0.45F, -1.25F, 0F, -0.45F, -1.25F, 0F, -0.45F, -1.25F, 0F, -0.45F, -1.25F, 0F, -0.45F, -1.25F, 0F, -0.45F, -1.25F, 0F, -0.45F, -1.25F); // Box 30
		defaultScopeModel[4].setRotationPoint(0F, 0F, 0F);
		
		
		defaultStockModel = new ModelRendererTurbo[4];
		defaultStockModel[0] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 38
		defaultStockModel[1] = new ModelRendererTurbo(this, 0, 41, textureX, textureY); // Box 39
		defaultStockModel[2] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 36
		defaultStockModel[3] = new ModelRendererTurbo(this, 17, 38, textureX, textureY); // Box 37
		
		defaultStockModel[0].addShapeBox(-7F, -4.05F, -1F, 6, 1, 2, 0F, -4F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -4F, 0F, -0.25F, -4F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.15F); // Box 38
		defaultStockModel[0].setRotationPoint(0F, 0F, 0F);
		
		defaultStockModel[1].addShapeBox(-7F, -3.05F, -1F, 6, 2, 2, 0F, -4F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.15F, -4F, -1F, -0.25F, 0F, -1.3F, -0.35F, 0F, -1.3F, -0.35F, -4F, -1F, -0.25F); // Box 39
		defaultStockModel[1].setRotationPoint(0F, 0F, 0F);
		
		defaultStockModel[2].addShapeBox(-9F, -3.05F, -1F, 6, 2, 2, 0F, -2F, 0F, 0.05F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -2F, 0F, 0.05F, -2.2F, 0.2F, -0.1F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -2.2F, 0.2F, -0.1F); // Box 36
		defaultStockModel[2].setRotationPoint(0F, 0F, 0F);
		
		defaultStockModel[3].addShapeBox(-9F, -4.05F, -1F, 6, 1, 2, 0F, -1.9F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.9F, 0F, -0.15F, -2F, 0F, 0.05F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -2F, 0F, 0.05F); // Box 37
		defaultStockModel[3].setRotationPoint(0F, 0F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 17, 13, textureX, textureY); // Box 36
		ammoModel[1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 37
		
		ammoModel[0].addShapeBox(2.25F, -2F, -1F, 2, 2, 2, 0F, 0F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 36
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = 0.10471976F;
		
		ammoModel[1].addShapeBox(2.25F, 0F, -1F, 2, 2, 2, 0F, 0F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0.2F, -0.35F, 0.5F, -0.1F, -0.35F, 0.5F, -0.1F, -0.35F, -0.5F, 0.2F, -0.35F); // Box 37
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		ammoModel[1].rotateAngleZ = 0.10471976F;
		
		
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 12, 4, textureX, textureY); // Box 18
		
		slideModel[0].addShapeBox(-1F, -4.75F, -1F, 1, 1, 2, 0F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F); // Box 18
		slideModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunSlideDistance = 0.05F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		barrelAttachPoint = new Vector3f(13F / 16F, 3.25F / 16F, 0F / 16F);
		
		stockAttachPoint = new Vector3f(-1F / 16F, 3.25F / 16F, 0F / 16F);
		
		scopeAttachPoint = new Vector3f(2F / 16F, 4.5F / 16F, 0F / 16F);
		
		gripAttachPoint = new Vector3f(7 / 16F, 2.5F / 16F, 0F / 16F);
		
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
