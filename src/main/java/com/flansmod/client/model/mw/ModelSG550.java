//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSG550 extends ModelGun
{
	int textureX = 512;
	int textureY = 16;

	public ModelSG550()	
	{


// Gun
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  137,  1, textureX, textureY); // Trigger
		gunModel[2] = new ModelRendererTurbo(this,  209,  1, textureX, textureY); // Barrel
		gunModel[3] = new ModelRendererTurbo(this,  161,  1, textureX, textureY); // UnderBarrel
		gunModel[4] = new ModelRendererTurbo(this,  241,  1, textureX, textureY); // UnderBarrelGrip
		gunModel[5] = new ModelRendererTurbo(this,  297,  1, textureX, textureY); // RearBarrel
		gunModel[6] = new ModelRendererTurbo(this,  265,  1, textureX, textureY); // Body
		gunModel[7] = new ModelRendererTurbo(this,  113,  1, textureX, textureY); // FrontSight
		gunModel[8] = new ModelRendererTurbo(this,  33,  1, textureX, textureY); // RearSight
		gunModel[9] = new ModelRendererTurbo(this,  193,  1, textureX, textureY); // Stock
		gunModel[10] = new ModelRendererTurbo(this,  321,  1, textureX, textureY); // Stock
		gunModel[11] = new ModelRendererTurbo(this,  353,  1, textureX, textureY); // StockEnd
		gunModel[12] = new ModelRendererTurbo(this,  369,  1, textureX, textureY); // Stock

		gunModel[0].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Grip
		gunModel[0].setRotationPoint(0F, -4F, -0.5F);
		gunModel[0].rotateAngleZ = -0.2094395F;

		gunModel[1].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Trigger
		gunModel[1].setRotationPoint(1F, -2F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Barrel
		gunModel[2].setRotationPoint(14F, -3.8F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // UnderBarrel
		gunModel[3].setRotationPoint(-0.23F, -4F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // UnderBarrelGrip
		gunModel[4].setRotationPoint(11F, -4.5F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // RearBarrel
		gunModel[5].setRotationPoint(1F, -4.5F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Body
		gunModel[6].setRotationPoint(1F, -3F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // FrontSight
		gunModel[7].setRotationPoint(23F, -5.5F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // RearSight
		gunModel[8].setRotationPoint(1F, -5F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Stock
		gunModel[9].setRotationPoint(-3.8F, -2.9F, -1F);
		gunModel[9].rotateAngleZ = 0.2792527F;

		gunModel[10].addBox(0F, 0F, 0F, 11, 2, 1, 0F); // Stock
		gunModel[10].setRotationPoint(-9.5F, -2F, -0.5F);
		gunModel[10].rotateAngleZ = 0.2443461F;

		gunModel[11].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // StockEnd
		gunModel[11].setRotationPoint(-10F, -3F, -0.5F);

		gunModel[12].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Stock
		gunModel[12].setRotationPoint(-7F, -2F, -1F);
		gunModel[12].rotateAngleZ = 0.2792527F;

		//Scope
		scopeAttachPoint = new Vector3f(4F / 16F, 6F / 16F, 0F);
		
		//Grip
		gripAttachPoint = new Vector3f(15F / 16F, 3.5F / 16F, 0F);
				
		//Barrel		
		barrelAttachPoint = new Vector3f(36.5F / 24F, 4.5F / 16F, 0F);

// Ammo
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this,  65,  1, textureX, textureY); // Magazine
		ammoModel[1] = new ModelRendererTurbo(this,  89,  1, textureX, textureY); // Magazine

		ammoModel[0].addBox(6F, -2F, -0.5F, 2, 2, 1, 0F); // Magazine
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		ammoModel[1].addBox(6.2F, 0F, 0F, 2, 2, 1, 0F); // Magazine
		ammoModel[1].setRotationPoint(0F, 0F, -0.5F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;


		flipAll();
		translateAll(0F, 1F, 0F);
	}
}