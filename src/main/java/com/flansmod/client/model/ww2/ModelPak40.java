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

public class ModelPak40 extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelPak40()
	{

// Body
		bodyModel = new ModelRendererTurbo[7];
		bodyModel[0] = new ModelRendererTurbo(this,  57,  1, textureX, textureY); // Axle
		bodyModel[1] = new ModelRendererTurbo(this,  113,  1, textureX, textureY); // Body
		bodyModel[2] = new ModelRendererTurbo(this,  209,  1, textureX, textureY); // 
		bodyModel[3] = new ModelRendererTurbo(this,  337,  1, textureX, textureY); // Stake
		bodyModel[4] = new ModelRendererTurbo(this,  969,  1, textureX, textureY); // 
		bodyModel[5] = new ModelRendererTurbo(this,  209,  9, textureX, textureY); // StakeEnd
		bodyModel[6] = new ModelRendererTurbo(this,  161,  1, textureX, textureY); // 

		bodyModel[0].addBox(0F, 0F, 0F, 4, 4, 44, 0F); // Axle
		bodyModel[0].setRotationPoint(-4F, -1F, -22F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 8, 6, 0F); // Body
		bodyModel[1].setRotationPoint(-3F, -6F, -3F);

		bodyModel[2].addBox(0F, 0F, 0F, 58, 2, 5, 0F); // Stake
		bodyModel[2].setRotationPoint(-49F, 7F, 21F);
		bodyModel[2].rotateAngleX = -0.05235988F;
		bodyModel[2].rotateAngleY = -0.2617994F;
		bodyModel[2].rotateAngleZ = 0.122173F;

		bodyModel[3].addBox(0F, 0F, 0F, 58, 2, 5, 0F); // Stake
		bodyModel[3].setRotationPoint(-48F, 7F, -25F);
		bodyModel[3].rotateAngleX = 0.05235988F;
		bodyModel[3].rotateAngleY = 0.2617994F;
		bodyModel[3].rotateAngleZ = 0.122173F;

		bodyModel[4].addBox(0F, 0F, 0F, 13, 4, 7, 0F); // StakeEnd
		bodyModel[4].setRotationPoint(-59F, 6F, 23F);
		bodyModel[4].rotateAngleY = -0.2617994F;

		bodyModel[5].addBox(0F, 0F, 0F, 13, 4, 7, 0F); // StakeEnd
		bodyModel[5].setRotationPoint(-59F, 6F, -29F);
		bodyModel[5].rotateAngleY = 0.2617994F;

		bodyModel[6].addBox(0F, 0F, 0F, 1, 11, 40, 0F); // Wheelshield
		bodyModel[6].setRotationPoint(6.1F, -4F, -20F);
		bodyModel[6].rotateAngleZ = 0.1919862F;



// Turret
		turretModel = new ModelRendererTurbo[7];
		turretModel[0] = new ModelRendererTurbo(this,  145,  1, textureX, textureY); // Gunbase
		turretModel[1] = new ModelRendererTurbo(this,  121,  1, textureX, textureY); // 
		turretModel[2] = new ModelRendererTurbo(this,  633,  1, textureX, textureY); // Gunshield
		turretModel[3] = new ModelRendererTurbo(this,  673,  1, textureX, textureY); // Gunshield
		turretModel[4] = new ModelRendererTurbo(this,  889,  1, textureX, textureY); // 
		turretModel[5] = new ModelRendererTurbo(this,  249,  9, textureX, textureY); // 
		turretModel[6] = new ModelRendererTurbo(this,  281,  9, textureX, textureY); // Seatconnector

		turretModel[0].addBox(0F, 0F, 0F, 10, 2, 13, 0); // Gunbase
		turretModel[0].setRotationPoint(-5F, -8F, -6F);

		turretModel[1].addBox(11.5F, -18.5F, -9F, 1, 14, 18, 0F); // Gunshield
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleZ = 0.296706F;

		turretModel[2].addBox(-14F, -18.4F, 14F, 17, 14, 1, 0F); // Gunshield
		turretModel[2].setRotationPoint(0F, 0F, 0F);
		turretModel[2].rotateAngleX = 0.2094395F;
		turretModel[2].rotateAngleY = -0.7853982F;
		turretModel[2].rotateAngleZ = 0.2094395F;

		turretModel[3].addBox(-14F, -18.4F, -15F, 17, 14, 1, 0F); // Gunshield
		turretModel[3].setRotationPoint(0F, 0F, 0F);
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
		barrelModel = new ModelRendererTurbo[8];
		barrelModel[0] = new ModelRendererTurbo(this,  465,  1, textureX, textureY); // Barrel
		barrelModel[1] = new ModelRendererTurbo(this,  713,  1, textureX, textureY); // 
		barrelModel[2] = new ModelRendererTurbo(this,  777,  1, textureX, textureY); // UnderBarrelEnd
		barrelModel[3] = new ModelRendererTurbo(this,  801,  1, textureX, textureY); // Loader
		barrelModel[4] = new ModelRendererTurbo(this,  849,  1, textureX, textureY); // RoundGuard
		barrelModel[5] = new ModelRendererTurbo(this,  145,  1, textureX, textureY); // 
		barrelModel[6] = new ModelRendererTurbo(this,  937,  1, textureX, textureY); // UpperBarrel
		barrelModel[7] = new ModelRendererTurbo(this,  0,  25, textureX, textureY); // 

		barrelModel[0].addBox(-16F, -17F, -2F, 76, 4, 4, 0F); // Barrel
		barrelModel[0].setRotationPoint(0F, 0F, 0F);

		barrelModel[1].addBox(-4F, -12F, -2F, 24, 4, 4, 0F); // UnderBarrel
		barrelModel[1].setRotationPoint(0F, 0F, 0F);

		barrelModel[2].addBox(-12F, -13F, -3F, 8, 6, 6, 0F); // UnderBarrelEnd
		barrelModel[2].setRotationPoint(0F, 0F, 0F);

		barrelModel[3].addBox(-30F, -13F, -1.5F, 19, 1, 3, 0); // Loader
		barrelModel[3].setRotationPoint(0F, 0F, 0F);
		barrelModel[3].rotateAngleZ = 0.01745329F;

		barrelModel[4].addBox(-22F, -16F, 4F, 25, 5, 1, 0F); // RoundGuard
		barrelModel[4].setRotationPoint(0F, 0F, 0F);

		barrelModel[5].addBox(0F, -15F, 2F, 1, 3, 2, 0F); // RoundGuardpeg
		barrelModel[5].setRotationPoint(0F, 0F, 0F);

		barrelModel[6].addBox(-13.5F, -20.2F, -1.5F, 15, 3, 3, 0F); // UpperBarrel
		barrelModel[6].setRotationPoint(0F, 0F, 0F);

		barrelModel[7].addBox(60F, -17.5F, -2.5F, 8, 5, 5, 0F); // Muzzle
		barrelModel[7].setRotationPoint(0F, 0F, 0F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[1];
		leftTrackModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // WheelL

		leftTrackModel[0].addBox(0F, 0F, 0F, 18, 18, 4, 0F); // WheelL
		leftTrackModel[0].setRotationPoint(-12F, -8F, -25F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[1];
		rightTrackModel[0] = new ModelRendererTurbo(this,  49,  1, textureX, textureY); // WheelR

		rightTrackModel[0].addBox(0F, 0F, 0F, 18, 18, 4, 0F); // WheelR
		rightTrackModel[0].setRotationPoint(-12F, -8F, 21F);


		translateAll(0, 0, 0);


		flipAll();
	}
}