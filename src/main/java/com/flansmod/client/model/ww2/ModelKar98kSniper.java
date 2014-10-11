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

public class ModelKar98kSniper extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelKar98kSniper()	
	{


// Gun
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this,  0,  17, textureX, textureY); // Body
		gunModel[1] = new ModelRendererTurbo(this,  0,  9, textureX, textureY); // Underbody
		gunModel[2] = new ModelRendererTurbo(this,  0,  26, textureX, textureY); // Barrelguard
		gunModel[3] = new ModelRendererTurbo(this,  0,  34, textureX, textureY); // Endbarrel
		gunModel[4] = new ModelRendererTurbo(this,  0,  39, textureX, textureY); // Sightfront
		gunModel[5] = new ModelRendererTurbo(this,  0,  67, textureX, textureY); // Sightback
		gunModel[6] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // Stock
		gunModel[7] = new ModelRendererTurbo(this,  0,  88, textureX, textureY); // Stock
		gunModel[8] = new ModelRendererTurbo(this,  0,  98, textureX, textureY); // Stock
		gunModel[9] = new ModelRendererTurbo(this,  0,  108, textureX, textureY); // Trigger
		gunModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Roundguard
		gunModel[11] = new ModelRendererTurbo(this,  0,  53, textureX, textureY); // Loader
		gunModel[12] = new ModelRendererTurbo(this,  104,  0, textureX, textureY); // Scope
		gunModel[13] = new ModelRendererTurbo(this,  115,  0, textureX, textureY); // Shape1
		gunModel[14] = new ModelRendererTurbo(this,  110,  0, textureX, textureY); // Shape1

		gunModel[0].addBox(0F, -1F, 0F, 20, 3, 3, 0F); // Body
		gunModel[0].setRotationPoint(7F, 0F, -1.5F);

		gunModel[1].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Underbody
		gunModel[1].setRotationPoint(0F, 1F, -1.5F);

		gunModel[2].addBox(0F, -1F, 0F, 2, 3, 2, 0F); // Barrelguard
		gunModel[2].setRotationPoint(27F, 0F, -1F);

		gunModel[3].addBox(0F, -1F, 0F, 6, 1, 1, 0F); // Endbarrel
		gunModel[3].setRotationPoint(29F, 0.5F, -0.5F);

		gunModel[4].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Sightfront
		gunModel[4].setRotationPoint(29F, 0.5F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Sightback
		gunModel[5].setRotationPoint(0F, -1F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Stock
		gunModel[6].setRotationPoint(-1F, 0F, -1.5F);

		gunModel[7].addBox(0F, 0F, 0F, 5, 4, 3, 0F); // Stock
		gunModel[7].setRotationPoint(-6F, 0F, -1.5F);

		gunModel[8].addBox(0F, 0F, 0F, 8, 5, 3, 0F); // Stock
		gunModel[8].setRotationPoint(-14F, 0F, -1.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Trigger
		gunModel[9].setRotationPoint(0F, 3F, -0.5F);
		gunModel[9].rotateAngleZ = 0.1570796F;

		gunModel[10].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Roundguard
		gunModel[10].setRotationPoint(1F, -1F, 0F);

		gunModel[11].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Pump
		gunModel[11].setRotationPoint(0F, 0F, -1F);

		gunModel[12].addBox(0F, 0F, 0F, 24, 2, 2, 0F); // Scope
		gunModel[12].setRotationPoint(-3F, -4F, -1F);

		gunModel[13].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Shape1
		gunModel[13].setRotationPoint(1F, -2F, -0.5F);

		gunModel[14].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Shape1
		gunModel[14].setRotationPoint(16F, -2F, -0.5F);
		




// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  20,  0, textureX, textureY); // Bullet

		ammoModel[0].addBox(3F, 0F, -0.5F, 3, 3, 1, 0F); // Bullet
		ammoModel[0].setRotationPoint(0F, 0F, 0F);



// Pump
		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Bolt Action
		pumpModel[1] = new ModelRendererTurbo(this,  0,  73, textureX, textureY); // Pump

		pumpModel[0].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // BoltAction
		pumpModel[0].setRotationPoint(4F, 0F, -3F);
		pumpModel[0].rotateAngleX = 0.1570796F;
		pumpModel[0].rotateAngleY = 0.122173F;

		pumpModel[1].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Pump
		pumpModel[1].setRotationPoint(2F, -1F, -0.5F);




		gunSlideDistance = 0.5F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.4F;

		flipAll();
		translateAll(0F, 7F, 0F);
	}
}