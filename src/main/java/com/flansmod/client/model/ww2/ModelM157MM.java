//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelM157MM extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelM157MM()
	{

// Body
		bodyModel = new ModelRendererTurbo[7];
		bodyModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // Axle
		bodyModel[1] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // Body
		bodyModel[2] = new ModelRendererTurbo(this,  97,  1, textureX, textureY); // 
		bodyModel[3] = new ModelRendererTurbo(this,  225,  1, textureX, textureY); // Stake
		bodyModel[4] = new ModelRendererTurbo(this,  97,  9, textureX, textureY); // 
		bodyModel[5] = new ModelRendererTurbo(this,  137,  9, textureX, textureY); // SidePlateF
		bodyModel[6] = new ModelRendererTurbo(this,  97,  9, textureX, textureY); // 

		bodyModel[0].addBox(0F, 0F, 0F, 4, 4, 40, 0F); // Axle
		bodyModel[0].setRotationPoint(9F, 2F, -20F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 8, 6, 0F); // Body
		bodyModel[1].setRotationPoint(3F, -5F, -3F);

		bodyModel[2].addBox(0F, 0F, 0F, 58, 2, 5, 0F); // Stake
		bodyModel[2].setRotationPoint(-45F, 7F, 21F);
		bodyModel[2].rotateAngleX = -0.05235988F;
		bodyModel[2].rotateAngleY = -0.2617994F;
		bodyModel[2].rotateAngleZ = 0.08726646F;

		bodyModel[3].addBox(0F, 0F, 0F, 58, 2, 5, 0F); // Stake
		bodyModel[3].setRotationPoint(-45F, 7F, -25F);
		bodyModel[3].rotateAngleX = 0.05235988F;
		bodyModel[3].rotateAngleY = 0.2617994F;
		bodyModel[3].rotateAngleZ = 0.08726646F;

		bodyModel[4].addBox(0F, 0F, 0F, 1, 12, 8, 0F); // SidePlateF
		bodyModel[4].setRotationPoint(16F, -14.5F, 8F);
		bodyModel[4].rotateAngleZ = 0.1745329F;

		bodyModel[5].addBox(0F, 0F, 0F, 1, 12, 8, 0F); // SidePlateF
		bodyModel[5].setRotationPoint(16F, -14.5F, -16F);
		bodyModel[5].rotateAngleZ = 0.1745329F;

		bodyModel[6].addBox(0F, 0F, 0F, 1, 10, 32, 0F); // Frontplate
		bodyModel[6].setRotationPoint(18F, -3F, -16F);



// Turret
		turretModel = new ModelRendererTurbo[7];
		turretModel[0] = new ModelRendererTurbo(this,  57,  1, textureX, textureY); // Gunbase
		turretModel[1] = new ModelRendererTurbo(this,  497,  1, textureX, textureY); // 
		turretModel[2] = new ModelRendererTurbo(this,  529,  1, textureX, textureY); // Gunshield
		turretModel[3] = new ModelRendererTurbo(this,  569,  1, textureX, textureY); // Gunshield
		turretModel[4] = new ModelRendererTurbo(this,  785,  1, textureX, textureY); // 
		turretModel[5] = new ModelRendererTurbo(this,  873,  1, textureX, textureY); // Seatconnector
		turretModel[6] = new ModelRendererTurbo(this,  905,  1, textureX, textureY); // Seatconnector

		turretModel[0].addBox(0F, 0F, 0F, 10, 3, 13, 0); // Gunbase
		turretModel[0].setRotationPoint(-2F, -8F, -6F);

		turretModel[1].addBox(11.5F, -18.5F, -11F, 1, 21, 22, 0F); // Gunshield
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleZ = 0.296706F;

		turretModel[2].addBox(-14F, -18.4F, 14F, 15, 11, 1, 0F); // Gunshield
		turretModel[2].setRotationPoint(1.5F, -0.5F, 1F);
		turretModel[2].rotateAngleX = 0.2094395F;
		turretModel[2].rotateAngleY = -0.7853982F;
		turretModel[2].rotateAngleZ = 0.2094395F;

		turretModel[3].addBox(-14F, -18.4F, -15F, 15, 11, 1, 0F); // Gunshield
		turretModel[3].setRotationPoint(1.5F, -0.5F, -1F);
		turretModel[3].rotateAngleX = -0.2094395F;
		turretModel[3].rotateAngleY = 0.7853982F;
		turretModel[3].rotateAngleZ = 0.2094395F;

		turretModel[4].addBox(-23F, -1F, 3F, 15, 2, 15, 0F); // Seat
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addBox(-12F, -4F, 0F, 12, 3, 3, 0F); // Seatconnector
		turretModel[5].setRotationPoint(0F, 0F, 0F);
		turretModel[5].rotateAngleZ = 0.1745329F;

		turretModel[6].addBox(-23F, -1.9F, 0F, 11, 3, 3, 0F); // Seatconnector
		turretModel[6].setRotationPoint(0F, 0F, 0F);



// Barrel
		barrelModel = new ModelRendererTurbo[4];
		barrelModel[0] = new ModelRendererTurbo(this,  353,  1, textureX, textureY); // Barrel
		barrelModel[1] = new ModelRendererTurbo(this,  609,  1, textureX, textureY); // 
		barrelModel[2] = new ModelRendererTurbo(this,  673,  1, textureX, textureY); // UnderBarrelEnd
		barrelModel[3] = new ModelRendererTurbo(this,  697,  1, textureX, textureY); // Loader

		barrelModel[0].addBox(-16F, -17F, -2F, 76, 4, 4, 0F); // Barrel
		barrelModel[0].setRotationPoint(0F, 0F, 0F);

		barrelModel[1].addBox(-4F, -12F, -2F, 24, 4, 4, 0F); // UnderBarrel
		barrelModel[1].setRotationPoint(0F, 0F, 0F);

		barrelModel[2].addBox(-12F, -13F, -3F, 8, 6, 6, 0F); // UnderBarrelEnd
		barrelModel[2].setRotationPoint(0F, 0F, 0F);

		barrelModel[3].addBox(-30F, -13F, -1.5F, 19, 1, 3, 0); // Loader
		barrelModel[3].setRotationPoint(0F, 0F, 0F);
		barrelModel[3].rotateAngleZ = 0.01745329F;



// Left Track
		leftTrackModel = new ModelRendererTurbo[1];
		leftTrackModel[0] = new ModelRendererTurbo(this,  937,  1, textureX, textureY); // LeftWheel

		leftTrackModel[0].addBox(0F, 0F, 0F, 14, 14, 5, 0F); // LeftWheel
		leftTrackModel[0].setRotationPoint(4F, -3F, -22F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[1];
		rightTrackModel[0] = new ModelRendererTurbo(this,  977,  1, textureX, textureY); // RightWheel

		rightTrackModel[0].addBox(0F, 0F, 0F, 14, 14, 5, 0F); // RightWheel
		rightTrackModel[0].setRotationPoint(4F, -3F, 17F);


		translateAll(0, 0, 0);


		flipAll();
	}
}