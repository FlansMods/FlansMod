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

public class ModelBAR extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelBAR()	
	{


// Gun
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Barrel
		gunModel[1] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // FiringMechanism
		gunModel[2] = new ModelRendererTurbo(this,  0,  325, textureX, textureY); // Underbarrelhandle
		gunModel[3] = new ModelRendererTurbo(this,  0,  325, textureX, textureY); // Underbarrelhandle2
		gunModel[4] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // UnderBarrel
		gunModel[5] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // Stock
		gunModel[6] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // StockEnd
		gunModel[7] = new ModelRendererTurbo(this,  30,  310, textureX, textureY); // Trigger
		gunModel[8] = new ModelRendererTurbo(this,  30,  320, textureX, textureY); // RearSight
		gunModel[9] = new ModelRendererTurbo(this,  36,  320, textureX, textureY); // FrontSight
		gunModel[10] = new ModelRendererTurbo(this,  30,  330, textureX, textureY); // HandleBar
		gunModel[11] = new ModelRendererTurbo(this,  35,  330, textureX, textureY); // Handle

		gunModel[0].addBox(0F, 0F, -0.5F, 22, 1, 1, 0F); // Barrel
		gunModel[0].setRotationPoint(2F, -4.2F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // FiringMechanism
		gunModel[1].setRotationPoint(4F, -3.5F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Underbarrelhandle
		gunModel[2].setRotationPoint(12F, -3.2F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Underbarrelhandle2
		gunModel[3].setRotationPoint(15F, -3.2F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // UnderBarrel
		gunModel[4].setRotationPoint(10F, -3.1F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Stock
		gunModel[5].setRotationPoint(-1.5F, -2.9F, -0.5F);
		gunModel[5].rotateAngleZ = 0.2094395F;

		gunModel[6].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // StockEnd
		gunModel[6].setRotationPoint(-5F, -3F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Trigger
		gunModel[7].setRotationPoint(2.8F, -2F, -0.5F);

		gunModel[8].addBox(0F, 0F, -0.5F, 1, 1, 1, 0F); // RearSight
		gunModel[8].setRotationPoint(4F, -4.5F, 0F);
		gunModel[8].rotateAngleZ = 0.2268928F;

		gunModel[9].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // FrontSight
		gunModel[9].setRotationPoint(21F, -5F, -0.5F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // HandleBar
		gunModel[10].setRotationPoint(13F, -5F, -1.6F);
		gunModel[10].rotateAngleX = 0.3141593F;
		gunModel[10].rotateAngleY = 0.1919862F;
		gunModel[10].rotateAngleZ = -0.03490658F;

		gunModel[11].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Handle
		gunModel[11].setRotationPoint(11.2F, -5.5F, -2.1F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  25,  340, textureX, textureY); // Magazine

		ammoModel[0].addBox(6F, -2F, -0.5F, 3, 3, 1, 0F); // Magazine
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = 0.01745329F;



// Slide
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  30,  320, textureX, textureY); // Pump

		slideModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Pump
		slideModel[0].setRotationPoint(10F, -4F, 0.5F);

		


		gunSlideDistance = 0.4F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(0F, 1F, 0F);
	}
}