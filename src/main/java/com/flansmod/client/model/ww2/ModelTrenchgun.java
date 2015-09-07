//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTrenchgun extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelTrenchgun()	
	{


// Gun
		gunModel = new ModelRendererTurbo[9];
		gunModel[0] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // Barrel
		gunModel[1] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Barrelbetween
		gunModel[2] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // UnderBarrel
		gunModel[3] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // FiringPin
		gunModel[4] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // TiggerGuard
		gunModel[5] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // SightFront
		gunModel[6] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // Stock
		gunModel[7] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // Stock
		gunModel[8] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // StockEnd

		gunModel[0].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Barrel
		gunModel[0].setRotationPoint(-1F, -4F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Barrelbetween
		gunModel[1].setRotationPoint(4F, -3.5F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // UnderBarrel
		gunModel[2].setRotationPoint(0F, -2.9F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // FiringPin
		gunModel[3].setRotationPoint(-2F, -3F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // TiggerGuard
		gunModel[4].setRotationPoint(1F, -2F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SightFront
		gunModel[5].setRotationPoint(22F, -4.5F, -0.5F);
		gunModel[5].rotateAngleZ = 0.08726646F;

		gunModel[6].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Stock
		gunModel[6].setRotationPoint(-10F, -3F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Stock
		gunModel[7].setRotationPoint(-5.5F, -3.5F, -1F);

		gunModel[8].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // StockEnd
		gunModel[8].setRotationPoint(-11F, -3F, -1F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  390, textureX, textureY); // Round

		ammoModel[0].addBox(5F, -3F, -0.5F, 2, 1, 1, 0F); // Round
		ammoModel[0].setRotationPoint(0F, 0F, 0F);



// Pump
		pumpModel = new ModelRendererTurbo[1];
		pumpModel[0] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Pump

		pumpModel[0].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Pump
		pumpModel[0].setRotationPoint(12.5F, -3.2F, -1F);

		

		gunSlideDistance = 0.5F;
		pumpDelayAfterReload = 105;
		pumpDelay = 11;
		pumpTime = 9;
		gunSlideDistance = 0.3F;
		animationType = EnumAnimationType.SHOTGUN;

		flipAll();
		translateAll(0F, 2F, 0F);
		
		numBulletsInReloadAnimation = 8;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.558F;
		untiltGunTime = 0.163F;
	}
}