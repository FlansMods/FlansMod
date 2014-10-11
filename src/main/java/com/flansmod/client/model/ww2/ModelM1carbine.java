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

public class ModelM1carbine extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelM1carbine()	
	{


// Gun
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // Body
		gunModel[2] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // BodyUpper
		gunModel[3] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // UnderBody
		gunModel[4] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // UnderBody
		gunModel[5] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // Barrel
		gunModel[6] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // BarrelRear
		gunModel[7] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // Trigger
		gunModel[8] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // WireStockT
		gunModel[9] = new ModelRendererTurbo(this,  0,  390, textureX, textureY); // WireStockB
		gunModel[10] = new ModelRendererTurbo(this,  0,  395, textureX, textureY); // WireBack
		gunModel[11] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // SightRear
		gunModel[12] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // SightFront

		gunModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Grip
		gunModel[0].setRotationPoint(0F, -4F, -0.5F);
		gunModel[0].rotateAngleZ = -0.122173F;

		gunModel[1].addBox(0F, 0F, 0F, 14, 1, 2, 0F); // Body
		gunModel[1].setRotationPoint(-2F, -4.5F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // BodyUpper
		gunModel[2].setRotationPoint(5F, -5.2F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // UnderBody
		gunModel[3].setRotationPoint(0F, -4F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // UnderBody
		gunModel[4].setRotationPoint(10.5F, -3.9F, -1F);
		gunModel[4].rotateAngleZ = 0.5235988F;

		gunModel[5].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Barrel
		gunModel[5].setRotationPoint(11F, -5F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // BarrelRear
		gunModel[6].setRotationPoint(0F, -5F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Trigger
		gunModel[7].setRotationPoint(0.5F, -3F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // WireStockT
		gunModel[8].setRotationPoint(-7F, -4.5F, -0.5F);
		gunModel[8].rotateAngleZ = -0.03490658F;

		gunModel[9].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // WireStockB
		gunModel[9].setRotationPoint(-7F, -2.5F, -0.5F);
		gunModel[9].rotateAngleZ = 0.05235988F;

		gunModel[10].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // WireBack
		gunModel[10].setRotationPoint(-7F, -5F, -0.5F);

		gunModel[11].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // SightRear
		gunModel[11].setRotationPoint(-1F, -5.8F, -0.5F);

		gunModel[12].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SightFront
		gunModel[12].setRotationPoint(17F, -6F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Magazine

		ammoModel[0].addBox(4.5F, -3F, -0.5F, 2, 3, 1, 0F); // Magazine
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(0F, 2F, 0F);
		thirdPersonOffset = new Vector3f(0F, -0.1F, 0F);
	}
}