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

public class ModelPanzerschreck extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelPanzerschreck()	
	{


// Gun
		gunModel = new ModelRendererTurbo[8];
		gunModel[0] = new ModelRendererTurbo(this,  76,  0, textureX, textureY); // Barrel
		gunModel[1] = new ModelRendererTurbo(this,  86,  17, textureX, textureY); // Shield/Sight
		gunModel[2] = new ModelRendererTurbo(this,  51,  34, textureX, textureY); // Grip
		gunModel[3] = new ModelRendererTurbo(this,  35,  35, textureX, textureY); // Back
		gunModel[4] = new ModelRendererTurbo(this,  35,  35, textureX, textureY); // Back
		gunModel[5] = new ModelRendererTurbo(this,  35,  35, textureX, textureY); // Back
		gunModel[6] = new ModelRendererTurbo(this,  35,  35, textureX, textureY); // Back
		gunModel[7] = new ModelRendererTurbo(this,  35,  35, textureX, textureY); // Back

		gunModel[0].addBox(0F, 0F, 0F, 26, 3, 3, 0F); // Barrel
		gunModel[0].setRotationPoint(-18F, -4.5F, -1.5F);

		gunModel[1].addBox(0F, 0F, 0F, 0, 9, 11, 0F); // Shield/Sight
		gunModel[1].setRotationPoint(3F, -7F, -3F);
		gunModel[1].rotateAngleY = 0.01745329F;

		gunModel[2].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Grip
		gunModel[2].setRotationPoint(0.8F, -2.2F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Back
		gunModel[3].setRotationPoint(-18.5F, -4F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Back
		gunModel[4].setRotationPoint(-19F, -5F, 1F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Back
		gunModel[5].setRotationPoint(-19F, -5F, -2F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Back
		gunModel[6].setRotationPoint(-19F, -2F, -2F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Back
		gunModel[7].setRotationPoint(-19F, -4F, -2F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Rocket

		ammoModel[0].addBox(-18F, -4F, -1F, 7, 2, 2, 0F); // Rocket
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.RIFLE;

		flipAll();
		translateAll(0F, 2F, 4F);
		thirdPersonOffset = new Vector3f(0F, -0.05F, -0.2F);
	}
}