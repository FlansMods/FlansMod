//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Judge
// Model Creator: 
// Created on: 24.12.2016 - 13:12:30
// Last changed on: 24.12.2016 - 13:12:30

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelJury extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;
	
	public ModelJury() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImport
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportImport
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		gunModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		gunModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 3
		gunModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 4
		gunModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 5
		gunModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 6
		gunModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		
		gunModel[0].addShapeBox(1F, 2.75F, -0.5F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportImport
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunModel[1].addShapeBox(4F, 3F, -0.5F, 5, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportImport
		gunModel[1].setRotationPoint(0F, 0F, 0F);
		
		gunModel[2].addBox(4F, 2F, -0.5F, 5, 1, 1, 0F); // Box 0
		gunModel[2].setRotationPoint(0F, 0F, 0F);
		
		gunModel[3].addShapeBox(2F, 3.5F, -0.5F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		
		gunModel[4].addShapeBox(2F, 1.5F, -0.5F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 2
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		
		gunModel[5].addShapeBox(0F, 0.5F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		gunModel[5].setRotationPoint(0F, 0F, 0F);
		
		gunModel[6].addShapeBox(0.5F, 2.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 4
		gunModel[6].setRotationPoint(0F, 0F, 0F);
		
		gunModel[7].addShapeBox(0.5F, 1.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 5
		gunModel[7].setRotationPoint(0F, 0F, 0F);
		
		gunModel[8].addShapeBox(-0.5F, -1.5F, -0.5F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 6
		gunModel[8].setRotationPoint(0F, 0F, 0F);
		
		gunModel[9].addShapeBox(8.5F, 2F, -0.5F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 10
		gunModel[9].setRotationPoint(0F, 0F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 7
		ammoModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 8
		ammoModel[3] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 9
		
		ammoModel[0].addShapeBox(0F, 0.1F, -0.85F, 2, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import Box0
		ammoModel[0].setRotationPoint(2F, 2.75F, 0F);
		
		ammoModel[1].addShapeBox(0F, 0.1F, -0.15F, 2, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 7
		ammoModel[1].setRotationPoint(2F, 2.75F, 0F);
		
		ammoModel[2].addShapeBox(0F, -0.6F, -0.15F, 2, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 8
		ammoModel[2].setRotationPoint(2F, 2.75F, 0F);
		
		ammoModel[3].addShapeBox(0F, -0.6F, -0.85F, 2, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 9
		ammoModel[3].setRotationPoint(2F, 2.75F, 0F);
		
		
		revolverBarrelModel = new ModelRendererTurbo[1];
		revolverBarrelModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportImport
		
		revolverBarrelModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportImport
		revolverBarrelModel[0].setRotationPoint(2F, 2.75F, -0.5F);
		
		barrelAttachPoint = new Vector3f(9.5F / 16F, 2.5F / 16F, 0F);
		scopeAttachPoint = new Vector3f(5F / 16F, 4.25F / 16F, 0F);
		
		animationType = EnumAnimationType.REVOLVER;
		revolverFlipAngle = -25.0f;
		tiltGunTime = 0.1F;
		unloadClipTime = 0.3F;
		loadClipTime = 0.5F;
		untiltGunTime = 0.1F;
	}
}
