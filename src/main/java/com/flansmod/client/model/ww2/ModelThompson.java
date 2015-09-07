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

public class ModelThompson extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelThompson()	
	{


// Gun
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this,  42,  0, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  53,  0, textureX, textureY); // Barrel
		gunModel[2] = new ModelRendererTurbo(this,  0,  12, textureX, textureY); // UnderGrip
		gunModel[3] = new ModelRendererTurbo(this,  0,  19, textureX, textureY); // FiringMechanism
		gunModel[4] = new ModelRendererTurbo(this,  25,  15, textureX, textureY); // Stock
		gunModel[5] = new ModelRendererTurbo(this,  25,  19, textureX, textureY); // Stock
		gunModel[6] = new ModelRendererTurbo(this,  25,  23, textureX, textureY); // Stock
		gunModel[7] = new ModelRendererTurbo(this,  25,  27, textureX, textureY); // Stock
		gunModel[8] = new ModelRendererTurbo(this,  25,  31, textureX, textureY); // Stock
		gunModel[9] = new ModelRendererTurbo(this,  25,  35, textureX, textureY); // StockEnd
		gunModel[10] = new ModelRendererTurbo(this,  15,  24, textureX, textureY); // SightFront
		gunModel[11] = new ModelRendererTurbo(this,  15,  28, textureX, textureY); // SightRear

		gunModel[0].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Grip
		gunModel[0].setRotationPoint(1F, -2.1F, -0.5F);
		gunModel[0].rotateAngleZ = -0.06981317F;

		gunModel[1].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Barrel
		gunModel[1].setRotationPoint(-1F, -4F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // UnderGrip
		gunModel[2].setRotationPoint(7F, -3.5F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // FiringMechanism
		gunModel[3].setRotationPoint(0.7F, -3F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Stock
		gunModel[4].setRotationPoint(-3.5F, -3F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Stock
		gunModel[5].setRotationPoint(-6F, -3F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Stock
		gunModel[6].setRotationPoint(-3F, -2.5F, -0.5F);
		gunModel[6].rotateAngleZ = 0.2792527F;

		gunModel[7].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Stock
		gunModel[7].setRotationPoint(-7F, -1F, -0.5F);
		gunModel[7].rotateAngleZ = 0.3490658F;

		gunModel[8].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Stock
		gunModel[8].setRotationPoint(-6F, -2F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // StockEnd
		gunModel[9].setRotationPoint(-7F, -3F, -0.5F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SightFront
		gunModel[10].setRotationPoint(13.8F, -4.6F, -0.5F);

		gunModel[11].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // SightRear
		gunModel[11].setRotationPoint(1F, -4.5F, -0.5F);
		gunModel[11].rotateAngleZ = -0.06981317F;



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  8,  25, textureX, textureY); // Magazine

		ammoModel[0].addBox(5.7F, -3F, -0.5F, 1, 5, 1, 0F); // Magazine
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(0F, 1F, 0F);
	}
}