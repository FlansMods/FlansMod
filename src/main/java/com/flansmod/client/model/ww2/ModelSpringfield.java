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

public class ModelSpringfield extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelSpringfield()	
	{


// Gun
		gunModel = new ModelRendererTurbo[17];
		gunModel[0] = new ModelRendererTurbo(this,  0,  17, textureX, textureY); // Body
		gunModel[1] = new ModelRendererTurbo(this,  59,  0, textureX, textureY); // Bodyangled
		gunModel[2] = new ModelRendererTurbo(this,  49,  0, textureX, textureY); // Grip
		gunModel[3] = new ModelRendererTurbo(this,  58,  13, textureX, textureY); // Scope
		gunModel[4] = new ModelRendererTurbo(this,  56,  31, textureX, textureY); // Scopestilt
		gunModel[5] = new ModelRendererTurbo(this,  71,  31, textureX, textureY); // Scopestilt
		gunModel[6] = new ModelRendererTurbo(this,  0,  9, textureX, textureY); // Underbody
		gunModel[7] = new ModelRendererTurbo(this,  0,  26, textureX, textureY); // Barrelguard
		gunModel[8] = new ModelRendererTurbo(this,  0,  34, textureX, textureY); // Endbarrel
		gunModel[9] = new ModelRendererTurbo(this,  0,  39, textureX, textureY); // Sightfront
		gunModel[10] = new ModelRendererTurbo(this,  0,  53, textureX, textureY); // Loader
		gunModel[11] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // Stock
		gunModel[12] = new ModelRendererTurbo(this,  0,  88, textureX, textureY); // Stock
		gunModel[13] = new ModelRendererTurbo(this,  0,  98, textureX, textureY); // Stock
		gunModel[14] = new ModelRendererTurbo(this,  0,  108, textureX, textureY); // Trigger
		gunModel[15] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Roundguard
		gunModel[16] = new ModelRendererTurbo(this,  0,  67, textureX, textureY); // 

		gunModel[0].addBox(0F, -1F, 0F, 20, 3, 3, 0F); // Body
		gunModel[0].setRotationPoint(7F, 0F, -1.5F);

		gunModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Bodyangled
		gunModel[1].setRotationPoint(8F, -1.5F, -1.5F);
		gunModel[1].rotateAngleZ = -0.122173F;

		gunModel[2].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Grip
		gunModel[2].setRotationPoint(-5F, 1.5F, -1F);
		gunModel[2].rotateAngleZ = -0.6108652F;

		gunModel[3].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Scope
		gunModel[3].setRotationPoint(-4F, -4F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Scopestilt
		gunModel[4].setRotationPoint(1F, -2F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Scopestilt
		gunModel[5].setRotationPoint(7F, -2F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Underbody
		gunModel[6].setRotationPoint(0F, 1F, -1.5F);

		gunModel[7].addBox(0F, -1F, 0F, 2, 3, 2, 0F); // Barrelguard
		gunModel[7].setRotationPoint(27F, 0F, -1F);

		gunModel[8].addBox(0F, -1F, 0F, 6, 1, 1, 0F); // Endbarrel
		gunModel[8].setRotationPoint(29F, 0.5F, -0.5F);

		gunModel[9].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Sightfront
		gunModel[9].setRotationPoint(29F, 0.5F, -0.5F);

		gunModel[10].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Loader
		gunModel[10].setRotationPoint(0F, 0F, -1F);

		gunModel[11].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Stock
		gunModel[11].setRotationPoint(-1F, 0F, -1.5F);

		gunModel[12].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Stock
		gunModel[12].setRotationPoint(-6F, 0F, -1.5F);

		gunModel[13].addBox(0F, 0F, 0F, 8, 4, 3, 0F); // Stock
		gunModel[13].setRotationPoint(-14F, 0F, -1.5F);

		gunModel[14].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Trigger
		gunModel[14].setRotationPoint(-2F, 3F, -0.5F);
		gunModel[14].rotateAngleZ = 0.1570796F;

		gunModel[15].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Roundguard
		gunModel[15].setRotationPoint(1F, -1F, 0F);

		gunModel[16].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Boltaction
		gunModel[16].setRotationPoint(0F, -1F, -1F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  20,  0, textureX, textureY); // Bullet

		ammoModel[0].addBox(3F, -0.1F, -0.4F, 3, 1, 1, 0F); // Bullet
		ammoModel[0].setRotationPoint(0F, 0F, 0F);



// Pump
		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this,  0,  73, textureX, textureY); // Pump
		pumpModel[1] = new ModelRendererTurbo(this,  37,  0, textureX, textureY); // Pump

		pumpModel[0].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Pump
		pumpModel[0].setRotationPoint(2F, -1F, -0.5F);

		pumpModel[1].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Pump
		pumpModel[1].setRotationPoint(2.4F, -0.5F, -3F);
		pumpModel[1].rotateAngleX = 0.1570796F;
		pumpModel[1].rotateAngleY = 0.122173F;

		

		gunSlideDistance = 0.5F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.RIFLE;

		flipAll();
		translateAll(0F, 7F, 0F);
		
		numBulletsInReloadAnimation = 5;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.558F;
		untiltGunTime = 0.163F;
	}
}