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
import com.flansmod.common.vector.Vector3f;

public class ModelFg42 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelFg42()	
	{


// Gun
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  9,  1, textureX, textureY); // Body
		gunModel[2] = new ModelRendererTurbo(this,  49,  1, textureX, textureY); // Stock
		gunModel[3] = new ModelRendererTurbo(this,  65,  1, textureX, textureY); // Stock
		gunModel[4] = new ModelRendererTurbo(this,  81,  1, textureX, textureY); // StockEnd
		gunModel[5] = new ModelRendererTurbo(this,  89,  1, textureX, textureY); // Barrel
		gunModel[6] = new ModelRendererTurbo(this,  169,  1, textureX, textureY); // UnderBarrel
		gunModel[7] = new ModelRendererTurbo(this,  121,  1, textureX, textureY); // BipodR
		gunModel[8] = new ModelRendererTurbo(this,  145,  1, textureX, textureY); // BipodL
		gunModel[9] = new ModelRendererTurbo(this,  185,  1, textureX, textureY); // SightR
		gunModel[10] = new ModelRendererTurbo(this,  193,  1, textureX, textureY); // SightF

		gunModel[0].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Grip
		gunModel[0].setRotationPoint(1F, -3F, -0.5F);
		gunModel[0].rotateAngleZ = -0.1919862F;

		gunModel[1].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Body
		gunModel[1].setRotationPoint(-3F, -4.3F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Stock
		gunModel[2].setRotationPoint(-8F, -3.7F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Stock
		gunModel[3].setRotationPoint(-4F, -4F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // StockEnd
		gunModel[4].setRotationPoint(-9F, -4F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Barrel
		gunModel[5].setRotationPoint(12F, -4F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // UnderBarrel
		gunModel[6].setRotationPoint(12F, -3.5F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // BipodR
		gunModel[7].setRotationPoint(12F, -2.8F, 0F);
		gunModel[7].rotateAngleY = 0.03490658F;
		gunModel[7].rotateAngleZ = -0.03490658F;

		gunModel[8].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // BipodL
		gunModel[8].setRotationPoint(12F, -2.8F, -1.2F);
		gunModel[8].rotateAngleY = -0.03490658F;
		gunModel[8].rotateAngleZ = -0.03490658F;

		gunModel[9].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SightR
		gunModel[9].setRotationPoint(2F, -5F, -0.5F);
		gunModel[9].rotateAngleZ = -0.1745329F;

		gunModel[10].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // SightF
		gunModel[10].setRotationPoint(18F, -5.3F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  201,  1, textureX, textureY); // Magazine

		ammoModel[0].addBox(2F, -4F, 1F, 3, 1, 4, 0F); // Magazine
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleY = -0.05235988F;

		
		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.SIDE_CLIP;

		flipAll();
		translateAll(0F, 1F, 0F);
	}
}