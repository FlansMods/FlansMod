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

public class ModelAT4 extends ModelGun
{
	int textureX = 256;
	int textureY = 32;

	public ModelAT4()	
	{


// Gun
		gunModel = new ModelRendererTurbo[8];
		gunModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  9,  1, textureX, textureY); // MainBody
		gunModel[2] = new ModelRendererTurbo(this,  57,  1, textureX, textureY); // Muzzle
		gunModel[3] = new ModelRendererTurbo(this,  73,  1, textureX, textureY); // Sight
		gunModel[4] = new ModelRendererTurbo(this,  9,  1, textureX, textureY); // Sight
		gunModel[5] = new ModelRendererTurbo(this,  89,  1, textureX, textureY); // RearLoader
		gunModel[6] = new ModelRendererTurbo(this,  105,  1, textureX, textureY); // RearLoader
		gunModel[7] = new ModelRendererTurbo(this,  121,  1, textureX, textureY); // PostLoader

		gunModel[0].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Grip
		gunModel[0].setRotationPoint(-1F, -3F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 18, 3, 3, 0F); // MainBody
		gunModel[1].setRotationPoint(-15F, -6F, -1.5F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Muzzle
		gunModel[2].setRotationPoint(2.5F, -6.5F, -2F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Sight
		gunModel[3].setRotationPoint(1F, -5F, 1F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Sight
		gunModel[4].setRotationPoint(1F, -6F, 4F);
		gunModel[4].rotateAngleY = -0.1745329F;

		gunModel[5].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // RearLoader
		gunModel[5].setRotationPoint(-16.1F, -6F, -1.5F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // RearLoader
		gunModel[6].setRotationPoint(-17.2F, -6.5F, -2F);

		gunModel[7].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // PostLoader
		gunModel[7].setRotationPoint(-18F, -5.5F, -1F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  137,  1, textureX, textureY); // Rocket

		ammoModel[0].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Rocket
		ammoModel[0].setRotationPoint(-3F, -5.5F, -1F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
		translateAll(0, 0, 3);
		thirdPersonOffset = new Vector3f(0F, 0F, -0.2F);
		
		itemFrameOffset = new Vector3f(11F / 16F, 0F / 16F, 0F);
	}
}