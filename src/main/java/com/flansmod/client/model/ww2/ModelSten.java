//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
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
import com.flansmod.common.vector.Vector3f;

public class ModelSten extends ModelGun
{
	int textureX = 64;
	int textureY = 32;

	public ModelSten()	
	{


// Gun
		gunModel = new ModelRendererTurbo[7];
		gunModel[0] = new ModelRendererTurbo(this,  0,  14, textureX, textureY); // Body1
		gunModel[1] = new ModelRendererTurbo(this,  0,  21, textureX, textureY); // Body2
		gunModel[2] = new ModelRendererTurbo(this,  0,  8, textureX, textureY); // Body3
		gunModel[3] = new ModelRendererTurbo(this,  14,  14, textureX, textureY); // Body4
		gunModel[4] = new ModelRendererTurbo(this,  14,  18, textureX, textureY); // Body5
		gunModel[5] = new ModelRendererTurbo(this,  0,  27, textureX, textureY); // Body6
		gunModel[6] = new ModelRendererTurbo(this,  28,  26, textureX, textureY); // Body10

		gunModel[0].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // Body1
		gunModel[0].setRotationPoint(0F, 0F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); //Test
		gunModel[1].setRotationPoint(5F, 0F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 17, 3, 3, 0F); // Body3
		gunModel[2].setRotationPoint(0F, -3F, -1.5F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Body4
		gunModel[3].setRotationPoint(17F, -2.5F, -1.126667F);

		gunModel[4].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Body5
		gunModel[4].setRotationPoint(8F, -3.1F, -1.4F);

		gunModel[5].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Body6
		gunModel[5].setRotationPoint(8F, -2.6F, 1.6F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); //Test
		gunModel[6].setRotationPoint(-2F, -3F, -1.5F);



// Default Stock
		defaultStockModel = new ModelRendererTurbo[3];
		defaultStockModel[0] = new ModelRendererTurbo(this,  14,  24, textureX, textureY); // Body7
		defaultStockModel[1] = new ModelRendererTurbo(this,  20,  24, textureX, textureY); // Body8
		defaultStockModel[2] = new ModelRendererTurbo(this,  20,  26, textureX, textureY); // Body9

		defaultStockModel[0].addBox(0F, -1F, 0F, 1, 6, 2, 0F); // Body7
		defaultStockModel[0].setRotationPoint(-9F, 1F, -1F);

		defaultStockModel[1].addBox(-1F, 0F, 0F, 10, 1, 1, 0F); // Body8
		defaultStockModel[1].setRotationPoint(-8F, 2F, -0.5F);
		defaultStockModel[1].rotateAngleZ = 0.2268928F;

		defaultStockModel[2].addShapeBox(6F, 1F, 0F, 3, 1, 1, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultStockModel[2].setRotationPoint(-8F, 2F, -0.5F);
		defaultStockModel[2].rotateAngleZ = 0.2268928F;



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  26,  14, textureX, textureY); // Ammo1

		ammoModel[0].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Ammo1
		ammoModel[0].setRotationPoint(8.5F, -2.1F, 3.6F);

		
		barrelAttachPoint = new Vector3f(21F / 16F, 5.5F / 16F, 0F / 16F);
		stockAttachPoint = new Vector3f(0F / 16F, 4F / 16F, 0F / 16F);
		scopeAttachPoint = new Vector3f(6F / 16F, 7F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(12F / 16F, 4F / 16F, 0F / 16F);


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.SIDE_CLIP;

		flipAll();
		translateAll(0F, 4F, 0F);
		
		numBulletsInReloadAnimation = 8;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.25F;
		loadClipTime = 0.25F;
		untiltGunTime = 0.25F;
	}
}