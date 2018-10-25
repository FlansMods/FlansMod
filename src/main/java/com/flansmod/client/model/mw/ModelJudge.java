//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Judge
// Model Creator: 
// Created on: 24.12.2016 - 10:25:11
// Last changed on: 24.12.2016 - 10:25:11

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelJudge extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 16;
	
	public ModelJudge() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[6];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Import
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Import
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Import
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Import
		gunModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box1
		
		gunModel[0].addShapeBox(-1F, -0.5F, -0.5F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Import Import
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunModel[1].addShapeBox(1F, 2.5F, -0.5F, 1, 1, 1, 0F, 0F, 1.00000000000000F, 0F, 0F, 0.500000000000000F, 0F, 0F, 0.500000000000000F, 0F, 0F, 1.00000000000000F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Import
		gunModel[1].setRotationPoint(0F, 0F, 0F);
		
		gunModel[2].addBox(2F, 1F, -0.5F, 5, 3, 1, 0F); // Import Import
		gunModel[2].setRotationPoint(0F, 0F, 0F);
		
		gunModel[3].addBox(7F, 2F, -0.5F, 1, 2, 1, 0F); // Import Import
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		
		gunModel[4].addBox(8F, 2.5F, -0.5F, 1, 1, 1, 0F); // Import Box0
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		
		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box1
		gunModel[5].setRotationPoint(0.5F, 2.75F, -0.5F);
		
		
		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		ammoModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		ammoModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 3
		
		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F); // Box 0
		ammoModel[0].setRotationPoint(3F, 2.5F, 0F);
		
		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F); // Box 1
		ammoModel[1].setRotationPoint(3F, 2.5F, -1F);
		
		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F); // Box 2
		ammoModel[2].setRotationPoint(3F, 1.5F, -1F);
		
		ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F, 0F, -0.100000000000000F, -0.100000000000000F); // Box 3
		ammoModel[3].setRotationPoint(3F, 1.5F, 0F);
		
		
		revolverBarrelModel = new ModelRendererTurbo[1];
		revolverBarrelModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Import
		
		revolverBarrelModel[0].addBox(2.5F, 1.5F, -1F, 4, 2, 2, 0F); // Import Import
		revolverBarrelModel[0].setRotationPoint(0F, 0F, 0F);
		
		gripAttachPoint = new Vector3f(5F / 16F, 1F / 16F, 0F);
		scopeAttachPoint = new Vector3f(5F / 16F, 4F / 16F, 0F);
		
		animationType = EnumAnimationType.REVOLVER;
		revolverFlipAngle = -40.0f;
		tiltGunTime = 0.2F;
		unloadClipTime = 0.2F;
		loadClipTime = 0.4F;
		untiltGunTime = 0.2F;
	}
}
