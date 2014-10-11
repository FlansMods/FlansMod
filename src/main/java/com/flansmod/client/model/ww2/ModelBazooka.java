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

public class ModelBazooka extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelBazooka()	
	{


// Gun
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // MainBody
		gunModel[2] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // Body
		gunModel[3] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // Body
		gunModel[4] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // BodyBody
		gunModel[5] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // SholderStock
		gunModel[6] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // ShoulderStock
		gunModel[7] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // RangeFinder
		gunModel[8] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // FrontalGrip
		gunModel[9] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Trigger

		gunModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Grip
		gunModel[0].setRotationPoint(0F, -4F, -0.5F);
		gunModel[0].rotateAngleZ = -0.1919862F;

		gunModel[1].addBox(0F, 0F, 0F, 32, 2, 2, 0F); // MainBody
		gunModel[1].setRotationPoint(-20F, -4.5F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Body
		gunModel[2].setRotationPoint(-15F, -4.5F, -1.5F);
		gunModel[2].rotateAngleX = 0.6108652F;

		gunModel[3].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Body
		gunModel[3].setRotationPoint(-10F, -4.7F, -1.2F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // BodyBody
		gunModel[4].setRotationPoint(-21F, -5F, -1.5F);

		gunModel[5].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // SholderStock
		gunModel[5].setRotationPoint(-9F, -3F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // ShoulderStock
		gunModel[6].setRotationPoint(-9F, -1F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // RangeFinder
		gunModel[7].setRotationPoint(9F, -5F, 1F);

		gunModel[8].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // FrontalGrip
		gunModel[8].setRotationPoint(7F, -3.5F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Trigger
		gunModel[9].setRotationPoint(0.5F, -2.5F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Round

		ammoModel[0].addBox(-20F, -4F, -0.5F, 5, 1, 1, 0F); // Round
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.RIFLE;

		flipAll();
		translateAll(0F, 0F, 2F);
		thirdPersonOffset = new Vector3f(0F, 0F, -0.1F);
	}
}