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

public class ModelPPSH extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelPPSH()	
	{


// Gun
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // Barrel
		gunModel[1] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body
		gunModel[2] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // Stock
		gunModel[3] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // Stock
		gunModel[4] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // StockEnd
		gunModel[5] = new ModelRendererTurbo(this,  5,  300, textureX, textureY); // Clipholder
		gunModel[6] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // StockHandle
		gunModel[7] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Trigger
		gunModel[8] = new ModelRendererTurbo(this,  0,  235, textureX, textureY); // SightRear
		gunModel[9] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // SightFront

		gunModel[0].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Barrel
		gunModel[0].setRotationPoint(0F, -6F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 11, 2, 2, 0F); // Body
		gunModel[1].setRotationPoint(0F, -5.5F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Stock
		gunModel[2].setRotationPoint(-5F, -4F, -0.5F);
		gunModel[2].rotateAngleZ = 0.2094395F;

		gunModel[3].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Stock
		gunModel[3].setRotationPoint(-8F, -4F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // StockEnd
		gunModel[4].setRotationPoint(-9F, -4F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Clipholder
		gunModel[5].setRotationPoint(7.3F, -5F, -1.5F);

		gunModel[6].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // StockHandle
		gunModel[6].setRotationPoint(-2F, -2.6F, -0.5F);
		gunModel[6].rotateAngleZ = 0.6632251F;

		gunModel[7].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Trigger
		gunModel[7].setRotationPoint(1F, -3.5F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SightRear
		gunModel[8].setRotationPoint(0F, -5.9F, -0.5F);
		gunModel[8].rotateAngleZ = 0.6981317F;

		gunModel[9].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SightFront
		gunModel[9].setRotationPoint(18F, -6.9F, -0.5F);
		gunModel[9].rotateAngleZ = 0.06981317F;



// Ammo
		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // MagazineMain
		ammoModel[1] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // MagTop
		ammoModel[2] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // MagBottom
		ammoModel[3] = new ModelRendererTurbo(this,  10,  215, textureX, textureY); // MagSide
		ammoModel[4] = new ModelRendererTurbo(this,  10,  220, textureX, textureY); // MagSide

		ammoModel[0].addBox(8F, -4F, -2F, 1, 4, 4, 0F); // MagazineMain
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = 0.05235988F;

		ammoModel[1].addBox(8F, -4.5F, -1F, 1, 1, 2, 0F); // MagTop
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		ammoModel[1].rotateAngleZ = 0.05235988F;

		ammoModel[2].addBox(8F, -0.5F, -1F, 1, 1, 2, 0F); // MagBottom
		ammoModel[2].setRotationPoint(0F, 0F, 0F);
		ammoModel[2].rotateAngleZ = 0.05235988F;

		ammoModel[3].addBox(8F, -3F, 1.5F, 1, 2, 1, 0F); // MagSide
		ammoModel[3].setRotationPoint(0F, 0F, 0F);
		ammoModel[3].rotateAngleZ = 0.05235988F;

		ammoModel[4].addBox(8F, -3F, -2.5F, 1, 2, 1, 0F); // MagSide
		ammoModel[4].setRotationPoint(0F, 0F, 0F);
		ammoModel[4].rotateAngleZ = 0.05235988F;

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(0F, -0.8F, 0F);
	}
}