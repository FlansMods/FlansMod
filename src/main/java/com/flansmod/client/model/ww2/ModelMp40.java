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

public class ModelMp40 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelMp40()	
	{


// Gun
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this,  100,  150, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  113,  150, textureX, textureY); // Body
		gunModel[2] = new ModelRendererTurbo(this,  100,  175, textureX, textureY); // UnderBody
		gunModel[3] = new ModelRendererTurbo(this,  100,  165, textureX, textureY); // AngledBody
		gunModel[4] = new ModelRendererTurbo(this,  115,  165, textureX, textureY); // BodyFront
		gunModel[5] = new ModelRendererTurbo(this,  150,  150, textureX, textureY); // SightFront
		gunModel[6] = new ModelRendererTurbo(this,  160,  150, textureX, textureY); // SightRear
		gunModel[7] = new ModelRendererTurbo(this,  160,  150, textureX, textureY); // SightRear
		gunModel[8] = new ModelRendererTurbo(this,  160,  165, textureX, textureY); // Barrel
		gunModel[9] = new ModelRendererTurbo(this,  150,  180, textureX, textureY); // ReleaseMag

		gunModel[0].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Grip
		gunModel[0].setRotationPoint(-1F, -4F, -1F);
		gunModel[0].rotateAngleZ = -0.2268928F;

		gunModel[1].addBox(0F, 0F, 0F, 14, 3, 2, 0F); // Body
		gunModel[1].setRotationPoint(-2F, -4F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 10, 2, 3, 0F); // UnderBody
		gunModel[2].setRotationPoint(0F, -2.6F, -1.5F);

		gunModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // AngledBody
		gunModel[3].setRotationPoint(11.1F, -2.8F, -1F);
		gunModel[3].rotateAngleZ = 0.4886922F;

		gunModel[4].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // BodyFront
		gunModel[4].setRotationPoint(12F, -4F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SightFront
		gunModel[5].setRotationPoint(20F, -4F, -0.5F);
		gunModel[5].rotateAngleZ = 0.418879F;

		gunModel[6].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SightRear
		gunModel[6].setRotationPoint(1F, -4.3F, 0.2F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SightRear
		gunModel[7].setRotationPoint(1F, -4.3F, -1.2F);

		gunModel[8].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Barrel
		gunModel[8].setRotationPoint(14F, -3.7F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // ReleaseMag
		gunModel[9].setRotationPoint(10F, -1F, -0.5F);
		gunModel[9].rotateAngleZ = 0.03490658F;



// Ammo
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this,  135,  175, textureX, textureY); // Magazine
		ammoModel[1] = new ModelRendererTurbo(this,  135,  175, textureX, textureY); // Magazine

		ammoModel[0].addBox(10.3F, 0F, -0.5F, 1, 7, 1, 0F); // Magazine
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = 0.03490658F;

		ammoModel[1].addBox(10.8F, 0F, -0.5F, 1, 7, 1, 0F); // Magazine
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		ammoModel[1].rotateAngleZ = 0.03490658F;

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(0F, 3F, 0F);
	}
}