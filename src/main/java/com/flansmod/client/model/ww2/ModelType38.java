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

public class ModelType38 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelType38()	
	{


// Gun
		gunModel = new ModelRendererTurbo[18];
		gunModel[0] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // GN.StockBodyconnector
		gunModel[1] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // GN.MainWoodenBodytop
		gunModel[2] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // GN.StockForward
		gunModel[3] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.StockTop
		gunModel[4] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.StockBottom
		gunModel[5] = new ModelRendererTurbo(this,  80,  250, textureX, textureY); // GN.Trigger
		gunModel[6] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // GN.MainWoodenBodyBottomBack
		gunModel[7] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // GN.MainWoodenBodyBottomfront
		gunModel[8] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // GN.Backmetalbinder
		gunModel[9] = new ModelRendererTurbo(this,  0,  112, textureX, textureY); // GN.MetalPart1
		gunModel[10] = new ModelRendererTurbo(this,  0,  112, textureX, textureY); // GN.MetalPart2
		gunModel[11] = new ModelRendererTurbo(this,  0,  120, textureX, textureY); // GN.Woodenmidway1
		gunModel[12] = new ModelRendererTurbo(this,  0,  120, textureX, textureY); // GN.Woodenmidway2
		gunModel[13] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // GN.Forwardmetalbinder
		gunModel[14] = new ModelRendererTurbo(this,  0,  130, textureX, textureY); // GN.Barrel
		gunModel[15] = new ModelRendererTurbo(this,  30,  130, textureX, textureY); // 
		gunModel[16] = new ModelRendererTurbo(this,  50,  130, textureX, textureY); // 
		gunModel[17] = new ModelRendererTurbo(this,  50,  130, textureX, textureY); // GN.Ironsight1

		gunModel[0].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // GN.StockBodyconnector
		gunModel[0].setRotationPoint(-2.5F, -1.7F, -1F);
		gunModel[0].rotateAngleZ = 0.3490658F;

		gunModel[1].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // GN.MainWoodenBodytop
		gunModel[1].setRotationPoint(1F, -3F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // GN.StockForward
		gunModel[2].setRotationPoint(-3.5F, -2F, -1F);
		gunModel[2].rotateAngleZ = -0.1745329F;

		gunModel[3].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // GN.StockTop
		gunModel[3].setRotationPoint(-11F, -2F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // GN.StockBottom
		gunModel[4].setRotationPoint(-11F, -0.2F, -1F);
		gunModel[4].rotateAngleZ = 0.2094395F;

		gunModel[5].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // GN.Trigger
		gunModel[5].setRotationPoint(2.5F, -1F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // GN.MainWoodenBodyBottomBack
		gunModel[6].setRotationPoint(1F, -2F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // GN.MainWoodenBodyBottomfront
		gunModel[7].setRotationPoint(4.7F, -2F, -1F);
		gunModel[7].rotateAngleZ = 0.122173F;

		gunModel[8].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // GN.Backmetalbinder
		gunModel[8].setRotationPoint(13F, -4F, -1F);

		gunModel[9].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // GN.MetalPart1
		gunModel[9].setRotationPoint(0.5F, -3.8F, -0.3F);

		gunModel[10].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // GN.MetalPart2
		gunModel[10].setRotationPoint(0.5F, -3.8F, -0.7F);

		gunModel[11].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // GN.Woodenmidway1
		gunModel[11].setRotationPoint(13.5F, -3.1F, -0.2F);

		gunModel[12].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // GN.Woodenmidway2
		gunModel[12].setRotationPoint(13.5F, -3.1F, -0.8F);

		gunModel[13].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // GN.Forwardmetalbinder
		gunModel[13].setRotationPoint(22F, -4F, -1F);

		gunModel[14].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // GN.Barrel
		gunModel[14].setRotationPoint(22F, -3.7F, -0.5F);

		gunModel[15].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // PM.Bolt
		gunModel[15].setRotationPoint(3F, -3.7F, -1.5F);

		gunModel[16].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // GN.Ironsight1
		gunModel[16].setRotationPoint(26F, -4.5F, 0.5F);

		gunModel[17].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // GN.Ironsight1
		gunModel[17].setRotationPoint(26F, -4.5F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Ammo

		ammoModel[0].addBox(3F, -3.5F, -0.5F, 3, 2, 1, 0F); // Ammo
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.RIFLE;

		flipAll();
		translateAll(0F, 2F, 0F);
	}
}