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

public class ModelColt extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelColt()	
	{


// Gun
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // Body
		gunModel[1] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // BodyFront
		gunModel[2] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Barrel
		gunModel[3] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // Barrel
		gunModel[4] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Grip
		gunModel[5] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // Grip
		gunModel[6] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // Grip
		gunModel[7] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // Grip
		gunModel[8] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // UnderBarrel
		gunModel[9] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // ThumbGuard
		gunModel[10] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Hammer
		gunModel[11] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // TiggerGuard

		gunModel[0].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Body
		gunModel[0].setRotationPoint(1F, -5.5F, -1.5F);

		gunModel[1].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // BodyFront
		gunModel[1].setRotationPoint(6F, -5.5F, -1.5F);

		gunModel[2].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Barrel
		gunModel[2].setRotationPoint(7.8F, -5.5F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Barrel
		gunModel[3].setRotationPoint(8F, -5F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Grip
		gunModel[4].setRotationPoint(0F, -5F, -1F);
		gunModel[4].rotateAngleZ = -0.1047198F;

		gunModel[5].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Grip
		gunModel[5].setRotationPoint(0.5F, -5F, 0.5F);
		gunModel[5].rotateAngleZ = -0.1047198F;

		gunModel[6].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Grip
		gunModel[6].setRotationPoint(0.5F, -5F, -1.5F);
		gunModel[6].rotateAngleZ = -0.1047198F;

		gunModel[7].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Grip
		gunModel[7].setRotationPoint(1F, -4.9F, -1F);
		gunModel[7].rotateAngleZ = -0.1047198F;

		gunModel[8].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // UnderBarrel
		gunModel[8].setRotationPoint(1F, -4F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // ThumbGuard
		gunModel[9].setRotationPoint(-1F, -4.6F, -1F);
		gunModel[9].rotateAngleZ = 0.418879F;

		gunModel[10].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Hammer
		gunModel[10].setRotationPoint(-0.5F, -6F, -0.5F);
		gunModel[10].rotateAngleZ = -0.3141593F;

		gunModel[11].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // TiggerGuard
		gunModel[11].setRotationPoint(2.3F, -3.5F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  10,  215, textureX, textureY); // Magainze

		ammoModel[0].addBox(0F, -3.7F, -0.5F, 2, 5, 1, 0F); // Magainze
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = -0.1047198F;



// Slide
		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Slide
		slideModel[1] = new ModelRendererTurbo(this,  0,  225, textureX, textureY); // Slide
		slideModel[2] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Slide
		slideModel[3] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // Slide

		slideModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Slide
		slideModel[0].setRotationPoint(9F, -6.5F, -0.5F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Slide
		slideModel[1].setRotationPoint(0.5F, -6.5F, 0.5F);

		slideModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Slide
		slideModel[2].setRotationPoint(0.5F, -6.5F, -1.5F);

		slideModel[3].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Slide
		slideModel[3].setRotationPoint(0F, -6F, -1F);

		


		gunSlideDistance = 0.2F;
		animationType = EnumAnimationType.PISTOL_CLIP;

		flipAll();
		translateAll(0F, 2.5F, 0F);
		thirdPersonOffset = new Vector3f(0F, -0.1F, 0F);
	}
}