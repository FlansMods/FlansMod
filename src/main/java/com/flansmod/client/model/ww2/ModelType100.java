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

public class ModelType100 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelType100()	
	{


// Gun
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // GN.StockBodyconnector
		gunModel[1] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // GN.MainWoodenBodyRight
		gunModel[2] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // GN.MainWoodenBodyLeft
		gunModel[3] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // GN.StockForward
		gunModel[4] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.StockTop
		gunModel[5] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.StockBottom
		gunModel[6] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // GN.MainPart
		gunModel[7] = new ModelRendererTurbo(this,  0,  285, textureX, textureY); // BL.Barrel
		gunModel[8] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // GN.UnderBarrelRight
		gunModel[9] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // GN.UnderBarrelLeft
		gunModel[10] = new ModelRendererTurbo(this,  30,  250, textureX, textureY); // SL.Slide
		gunModel[11] = new ModelRendererTurbo(this,  80,  250, textureX, textureY); // GN.Trigger
		gunModel[12] = new ModelRendererTurbo(this,  120,  250, textureX, textureY); // GN.Magazinefeeder

		gunModel[0].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // GN.StockBodyconnector
		gunModel[0].setRotationPoint(-1.3F, -1F, -1F);
		gunModel[0].rotateAngleZ = 0.6632251F;

		gunModel[1].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // GN.MainWoodenBodyRight
		gunModel[1].setRotationPoint(1F, -3F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // GN.MainWoodenBodyLeft
		gunModel[2].setRotationPoint(1F, -3F, -1.5F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // GN.StockForward
		gunModel[3].setRotationPoint(-3F, -2.5F, -1F);
		gunModel[3].rotateAngleZ = -0.3569146F;

		gunModel[4].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // GN.StockTop
		gunModel[4].setRotationPoint(-9F, -2.5F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // GN.StockBottom
		gunModel[5].setRotationPoint(-9F, -0.5F, -1F);
		gunModel[5].rotateAngleZ = 0.2094395F;

		gunModel[6].addBox(0F, 0F, 0F, 22, 2, 2, 0F); // GN.MainPart
		gunModel[6].setRotationPoint(1.2F, -4F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // BL.Barrel
		gunModel[7].setRotationPoint(23F, -3.5F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // GN.UnderBarrelRight
		gunModel[8].setRotationPoint(15.5F, -2F, -0.8F);

		gunModel[9].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // GN.UnderBarrelLeft
		gunModel[9].setRotationPoint(15.5F, -2F, -1.2F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SL.Slide
		gunModel[10].setRotationPoint(11F, -4F, -2F);

		gunModel[11].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // GN.Trigger
		gunModel[11].setRotationPoint(2.5F, -1F, -0.5F);

		gunModel[12].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // GN.Magazinefeeder
		gunModel[12].setRotationPoint(9F, -3.7F, 0.3F);



// Ammo
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // AM.Ammo1
		ammoModel[1] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // AM.Ammo2
		ammoModel[2] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // AM.Ammo1

		ammoModel[0].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // AM.Ammo1
		ammoModel[0].setRotationPoint(9.5F, -3.5F, 0F);

		ammoModel[1].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // AM.Ammo2
		ammoModel[1].setRotationPoint(9.5F, -3.5F, 4F);
		ammoModel[1].rotateAngleY = -0.1745329F;

		ammoModel[2].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // AM.Ammo1
		ammoModel[2].setRotationPoint(10F, -3.5F, 7F);
		ammoModel[2].rotateAngleY = -0.5235988F;

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.SIDE_CLIP;

		flipAll();
	}
}