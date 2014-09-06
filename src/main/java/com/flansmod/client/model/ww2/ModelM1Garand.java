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

public class ModelM1Garand extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelM1Garand()	
	{


// Gun
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this,  0,  17, textureX, textureY); // Body
		gunModel[1] = new ModelRendererTurbo(this,  49,  0, textureX, textureY); // Grip
		gunModel[2] = new ModelRendererTurbo(this,  0,  9, textureX, textureY); // Underbody
		gunModel[3] = new ModelRendererTurbo(this,  0,  26, textureX, textureY); // Barrelguard
		gunModel[4] = new ModelRendererTurbo(this,  0,  34, textureX, textureY); // Endbarrel
		gunModel[5] = new ModelRendererTurbo(this,  0,  39, textureX, textureY); // Sightfront
		gunModel[6] = new ModelRendererTurbo(this,  0,  53, textureX, textureY); // SightBase
		gunModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // SightRear
		gunModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // SightRear
		gunModel[9] = new ModelRendererTurbo(this,  0,  53, textureX, textureY); // Loader
		gunModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Loader
		gunModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Loader
		gunModel[12] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // Stock
		gunModel[13] = new ModelRendererTurbo(this,  0,  88, textureX, textureY); // Stock
		gunModel[14] = new ModelRendererTurbo(this,  0,  98, textureX, textureY); // Stock
		gunModel[15] = new ModelRendererTurbo(this,  0,  108, textureX, textureY); // Trigger

		gunModel[0].addBox(0F, -1F, 0F, 20, 3, 3, 0F); // Body
		gunModel[0].setRotationPoint(7F, 0F, -1.5F);

		gunModel[1].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Grip
		gunModel[1].setRotationPoint(-5F, 1.5F, -1F);
		gunModel[1].rotateAngleZ = -0.6108652F;

		gunModel[2].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Underbody
		gunModel[2].setRotationPoint(0F, 1F, -1.5F);

		gunModel[3].addBox(0F, -1F, 0F, 2, 3, 2, 0F); // Barrelguard
		gunModel[3].setRotationPoint(27F, 0F, -1F);

		gunModel[4].addBox(0F, -1F, 0F, 6, 1, 1, 0F); // Endbarrel
		gunModel[4].setRotationPoint(29F, 0.5F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Sightfront
		gunModel[5].setRotationPoint(28F, -2F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // SightBase
		gunModel[6].setRotationPoint(-2F, -1F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // SightRear
		gunModel[7].setRotationPoint(0F, -2F, -1.5F);

		gunModel[8].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // SightRear
		gunModel[8].setRotationPoint(0F, -2F, 0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Loader
		gunModel[9].setRotationPoint(0F, 0F, -1F);

		gunModel[10].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Loader
		gunModel[10].setRotationPoint(1F, 0F, -1.5F);

		gunModel[11].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Loader
		gunModel[11].setRotationPoint(1F, 0F, 0.5F);

		gunModel[12].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Stock
		gunModel[12].setRotationPoint(-1F, 0F, -1.5F);

		gunModel[13].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Stock
		gunModel[13].setRotationPoint(-6F, 0F, -1.5F);

		gunModel[14].addBox(0F, 0F, 0F, 8, 4, 3, 0F); // Stock
		gunModel[14].setRotationPoint(-14F, 0F, -1.5F);

		gunModel[15].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Trigger
		gunModel[15].setRotationPoint(-2F, 3F, -0.5F);
		gunModel[15].rotateAngleZ = 0.1570796F;



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  29,  34, textureX, textureY); // Ammo

		ammoModel[0].addBox(2F, 0.1F, -1F, 2, 2, 2, 0F); // Ammo
		ammoModel[0].setRotationPoint(0F, 0F, 0F);



// Slide
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  0,  73, textureX, textureY); // Slide

		slideModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Slide
		slideModel[0].setRotationPoint(4F, -1F, -0.5F);

		


		gunSlideDistance = 0.2F;
		animationType = EnumAnimationType.TOP_CLIP;

		flipAll();
		translateAll(0F, 7F, 0F);
	}
}