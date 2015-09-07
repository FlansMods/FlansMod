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

public class ModelGlock extends ModelGun
{
	int textureX = 256;
	int textureY = 16;

	public ModelGlock()	
	{


// Gun
		gunModel = new ModelRendererTurbo[6];
		gunModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  17,  1, textureX, textureY); // Body
		gunModel[2] = new ModelRendererTurbo(this,  49,  1, textureX, textureY); // UnderBody
		gunModel[3] = new ModelRendererTurbo(this,  41,  1, textureX, textureY); // Muzzle
		gunModel[4] = new ModelRendererTurbo(this,  73,  1, textureX, textureY); // Trigger
		gunModel[5] = new ModelRendererTurbo(this,  129,  1, textureX, textureY); // Barrel

		gunModel[0].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Grip
		gunModel[0].setRotationPoint(0F, -2.5F, -1F);
		gunModel[0].rotateAngleZ = -0.1396263F;

		gunModel[1].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Body
		gunModel[1].setRotationPoint(-1F, -3F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // UnderBody
		gunModel[2].setRotationPoint(1F, -2.5F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Muzzle
		gunModel[3].setRotationPoint(7.5F, -3.5F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Trigger
		gunModel[4].setRotationPoint(1.5F, -1.5F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Barrel
		gunModel[5].setRotationPoint(0F, -3.5F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this,  81,  1, textureX, textureY); // Magazine
		ammoModel[1] = new ModelRendererTurbo(this,  89,  1, textureX, textureY); // Magazine
		ammoModel[2] = new ModelRendererTurbo(this,  97,  1, textureX, textureY); // Magazine

		ammoModel[0].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Magazine
		ammoModel[0].setRotationPoint(0F, 2F, -0.5F);
		ammoModel[0].rotateAngleZ = -0.1396263F;

		ammoModel[1].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Magazine
		ammoModel[1].setRotationPoint(-0.5F, 1.9F, -0.5F);
		ammoModel[1].rotateAngleZ = -0.1396263F;

		ammoModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Magazine
		ammoModel[2].setRotationPoint(-0.9F, 6.3F, -0.5F);
		ammoModel[2].rotateAngleZ = -0.1396263F;



// Slide
		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this,  105,  1, textureX, textureY); // Slide
		slideModel[1] = new ModelRendererTurbo(this,  153,  1, textureX, textureY); // Slide

		slideModel[0].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Slide
		slideModel[0].setRotationPoint(-1F, -4F, -1F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Slide
		slideModel[1].setRotationPoint(7F, -4.5F, -0.5F);

		
		barrelAttachPoint = new Vector3f(8.5F / 16F, 4F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		scopeIsOnSlide = true;

		gunSlideDistance = 0.2F;
		animationType = EnumAnimationType.PISTOL_CLIP;

		flipAll();
		
		translateAll(0F, 1F, 0F);
	}
}