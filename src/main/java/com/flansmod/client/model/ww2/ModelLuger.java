//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.9
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

public class ModelLuger extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelLuger()	
	{


// Gun
		gunModel = new ModelRendererTurbo[5];
		gunModel[0] = new ModelRendererTurbo(this,  100,  145, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  100,  155, textureX, textureY); // Body
		gunModel[2] = new ModelRendererTurbo(this,  100,  175, textureX, textureY); // Barrel
		gunModel[3] = new ModelRendererTurbo(this,  116,  150, textureX, textureY); // Sight
		gunModel[4] = new ModelRendererTurbo(this,  115,  140, textureX, textureY); // TriggerGuard

		gunModel[0].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Grip
		gunModel[0].setRotationPoint(0F, -3F, -1F);
		gunModel[0].rotateAngleZ = -0.1919862F;

		gunModel[1].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Body
		gunModel[1].setRotationPoint(-0.4F, -4F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Barrel
		gunModel[2].setRotationPoint(3F, -3.8F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Sight
		gunModel[3].setRotationPoint(6.8F, -4.2F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // TriggerGuard
		gunModel[4].setRotationPoint(3F, -2.4F, -0.5F);
		gunModel[4].rotateAngleZ = -0.8552113F;



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  126,  150, textureX, textureY); // Magazine

		ammoModel[0].addBox(0F, -3F, -0.5F, 1, 4, 1, 0F); // Magazine
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = -0.1919862F;



// Slide
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  100,  165, textureX, textureY); // Body

		slideModel[0].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Body
		slideModel[0].setRotationPoint(1F, -3.8F, -1.5F);

		


		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.PISTOL_CLIP;

		flipAll();
		translateAll(0F, 2F, 0F);
		thirdPersonOffset = new Vector3f(0F, -0.1F, 0F);
	}
}