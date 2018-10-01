//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ACR
// Model Creator: 
// Created on: 01.02.2017 - 16:57:52
// Last changed on: 01.02.2017 - 16:57:52

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAA12 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	public ModelAA12() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[7];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		gunModel[6] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 14
		
		gunModel[0].addBox(0F, 2F, -1F, 4, 3, 2, 0F); // Import 
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunModel[1].addShapeBox(-1F, -2F, -1F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import 
		gunModel[1].setRotationPoint(0F, 0F, 0F);
		
		gunModel[2].addShapeBox(6F, 3F, -1F, 8, 2, 2, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import 
		gunModel[2].setRotationPoint(0F, 0F, 0F);
		
		gunModel[3].addShapeBox(13F, 5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F); // Import 
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		
		gunModel[4].addBox(4F, 3F, -1F, 2, 2, 2, 0F); // Box 0
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		
		gunModel[5].addShapeBox(3F, -3F, -0.5F, 1, 5, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 13
		gunModel[5].setRotationPoint(0F, 0F, 0F);
		
		gunModel[6].addShapeBox(0F, -2F, -0.5F, 1, 3, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 14
		gunModel[6].setRotationPoint(3F, -1.85F, 0F);
		gunModel[6].rotateAngleZ = -1.76278254F;
		
		
		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 
		
		defaultBarrelModel[0].addShapeBox(14F, 3.1F, -0.5F, 3, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import 
		defaultBarrelModel[0].setRotationPoint(0F, 0F, 0F);
		
		
		defaultScopeModel = new ModelRendererTurbo[1];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 12
		
		defaultScopeModel[0].addShapeBox(0F, 5F, -0.5F, 1, 2, 1, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F); // Box 12
		defaultScopeModel[0].setRotationPoint(0F, 0F, 0F);
		
		
		defaultStockModel = new ModelRendererTurbo[1];
		defaultStockModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import 
		
		
		defaultStockModel[0].addShapeBox(-7F, 3F, -1F, 7, 2, 2, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import 
		defaultStockModel[0].setRotationPoint(0F, 0F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import 
		ammoModel[1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 10
		ammoModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 11
		
		ammoModel[0].addBox(4F, -3F, -1F, 2, 6, 2, 0F); // Import 
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[1].addShapeBox(4F, -3F, -3F, 2, 6, 2, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[2].addShapeBox(4F, -3F, 1F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F); // Box 11
		ammoModel[2].setRotationPoint(0F, 0F, 0F);
		
		scopeAttachPoint = new Vector3f(3.5F / 16F, 5F / 16F, 0F);
		stockAttachPoint = new Vector3f(1F / 16F, 4F / 16F, 0F);
		barrelAttachPoint = new Vector3f(18F / 16F, 3.5F / 16F, 0F);
		gripAttachPoint = new Vector3f(11F / 16F, 3F / 16F, 0F);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		//translateAll(0F, 0F, 0F);
		//flipAll();
	}
}
