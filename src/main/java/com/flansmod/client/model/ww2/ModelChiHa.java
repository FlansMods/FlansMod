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

public class ModelChiHa extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChiHa()
	{

// Body
		bodyModel = new ModelRendererTurbo[22];
		bodyModel[0] = new ModelRendererTurbo(this,  50,  300, textureX, textureY); // CR.MainBody
		bodyModel[1] = new ModelRendererTurbo(this,  50,  350, textureX, textureY); // CR.Beak
		bodyModel[2] = new ModelRendererTurbo(this,  50,  410, textureX, textureY); // CR.BeakSupport
		bodyModel[3] = new ModelRendererTurbo(this,  50,  660, textureX, textureY); // CR.EngineBlock
		bodyModel[4] = new ModelRendererTurbo(this,  50,  720, textureX, textureY); // CR.BackCorner
		bodyModel[5] = new ModelRendererTurbo(this,  50,  770, textureX, textureY); // CR.TrackWeldRight
		bodyModel[6] = new ModelRendererTurbo(this,  50,  770, textureX, textureY); // CR.TrackWeldLeft
		bodyModel[7] = new ModelRendererTurbo(this,  50,  850, textureX, textureY); // CR.RightTrackTopRight
		bodyModel[8] = new ModelRendererTurbo(this,  50,  850, textureX, textureY); // CR.RightTrackTopLeft
		bodyModel[9] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // CR.RightWheelfront
		bodyModel[10] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // CR.RightWheelback
		bodyModel[11] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelrightfront
		bodyModel[12] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelrightcenter
		bodyModel[13] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelrightback
		bodyModel[14] = new ModelRendererTurbo(this,  0,  910, textureX, textureY); // CR.RightTubethingy
		bodyModel[15] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // CR.LeftWheelfront
		bodyModel[16] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // CR.LeftWheelback
		bodyModel[17] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelleftfront
		bodyModel[18] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelleftcenter
		bodyModel[19] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelleftback
		bodyModel[20] = new ModelRendererTurbo(this,  0,  910, textureX, textureY); // CR.LeftTubethingy
		bodyModel[21] = new ModelRendererTurbo(this,  0,  116, textureX, textureY); // CR.SideThingLeft

		bodyModel[0].addBox(0F, 0F, 0F, 77, 12, 30, 0); // CR.MainBody
		bodyModel[0].setRotationPoint(-40F, -8F, -12F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 14, 30, 0F); // CR.Beak
		bodyModel[1].setRotationPoint(40F, -12F, -12F);
		bodyModel[1].rotateAngleZ = -0.6632251F;

		bodyModel[2].addBox(0F, 0F, 0F, 16, 10, 30, 0F); // CR.BeakSupport
		bodyModel[2].setRotationPoint(24F, -12.5F, -12F);
		bodyModel[2].rotateAngleZ = -0.03490658F;

		bodyModel[3].addBox(0F, 0F, 0F, 22, 8, 30, 0F); // CR.EngineBlock
		bodyModel[3].setRotationPoint(-32F, -16F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 11, 30, 0F); // CR.BackCorner
		bodyModel[4].setRotationPoint(-32F, -16F, -12F);
		bodyModel[4].rotateAngleZ = -0.7853982F;

		bodyModel[5].addBox(0F, 0F, 0F, 62, 6, 0, 0F); // CR.TrackWeldRight
		bodyModel[5].setRotationPoint(-40F, -14F, 18F);

		bodyModel[6].addBox(0F, 0F, 0F, 62, 6, 0, 0F); // CR.TrackWeldLeft
		bodyModel[6].setRotationPoint(-40F, -14F, -12F);

		bodyModel[7].addBox(0F, 0F, 0F, 66, 1, 7, 0F); // CR.RightTrackTopRight
		bodyModel[7].setRotationPoint(-44F, -14F, 18F);

		bodyModel[8].addBox(0F, 0F, 0F, 66, 1, 7, 0F); // CR.RightTrackTopLeft
		bodyModel[8].setRotationPoint(-44F, -14F, -19F);

		bodyModel[9].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // CR.RightWheelfront
		bodyModel[9].setRotationPoint(36F, -11F, 18F);

		bodyModel[10].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // CR.RightWheelback
		bodyModel[10].setRotationPoint(-42F, -11F, 18F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelrightfront
		bodyModel[11].setRotationPoint(24F, -11F, 18F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelrightcenter
		bodyModel[12].setRotationPoint(-1F, -11F, 18F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelrightback
		bodyModel[13].setRotationPoint(-26F, -11F, 18F);

		bodyModel[14].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // CR.RightTubethingy
		bodyModel[14].setRotationPoint(-14F, -4F, 18F);

		bodyModel[15].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // CR.LeftWheelfront
		bodyModel[15].setRotationPoint(36F, -11F, -18F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // CR.LeftWheelback
		bodyModel[16].setRotationPoint(-42F, -11F, -18F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelleftfront
		bodyModel[17].setRotationPoint(24F, -11F, -16F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelleftcenter
		bodyModel[18].setRotationPoint(-1F, -11F, -19F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelleftback
		bodyModel[19].setRotationPoint(-26F, -11F, -16F);

		bodyModel[20].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // CR.LeftTubethingy
		bodyModel[20].setRotationPoint(-14F, -4F, -15F);

		bodyModel[21].addBox(0F, -1F, 0F, 35, 12, 30, 0F); // CR.SideThingLeft
		bodyModel[21].setRotationPoint(-11F, -19F, -12F);



// Turret
		turretModel = new ModelRendererTurbo[17];
		turretModel[0] = new ModelRendererTurbo(this,  0,  174, textureX, textureY); // Turret
		turretModel[1] = new ModelRendererTurbo(this,  121,  48, textureX, textureY); // Mantle
		turretModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // UpperTurret
		turretModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // LowerTurret
		turretModel[4] = new ModelRendererTurbo(this,  90,  60, textureX, textureY); // AngledTurret
		turretModel[5] = new ModelRendererTurbo(this,  90,  81, textureX, textureY); // AngledTurret
		turretModel[6] = new ModelRendererTurbo(this,  130,  90, textureX, textureY); // AmmoRacket
		turretModel[7] = new ModelRendererTurbo(this,  0,  77, textureX, textureY); // CH
		turretModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Rail
		turretModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Rail
		turretModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Rail
		turretModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Rail
		turretModel[12] = new ModelRendererTurbo(this,  0,  3, textureX, textureY); // RailConnecter
		turretModel[13] = new ModelRendererTurbo(this,  0,  3, textureX, textureY); // RailConnecter
		turretModel[14] = new ModelRendererTurbo(this,  0,  3, textureX, textureY); // RailConnecter
		turretModel[15] = new ModelRendererTurbo(this,  0,  3, textureX, textureY); // RailConnecter
		turretModel[16] = new ModelRendererTurbo(this,  29,  126, textureX, textureY); // 

		turretModel[0].addBox(-3F, -30F, -10F, 15, 10, 20, 0F); // Turret
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addBox(14F, -28F, -8F, 5, 8, 16, 0F); // Mantle
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleZ = 0.06981317F;

		turretModel[2].addBox(12F, -30F, -8F, 5, 2, 16, 0F); // UpperTurret
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addBox(12.5F, -22F, -8F, 5, 2, 16, 0F); // LowerTurret
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addBox(12F, -30F, -11F, 2, 10, 5, 0F); // AngledTurret
		turretModel[4].setRotationPoint(0F, 0F, 0F);
		turretModel[4].rotateAngleY = 1.082104F;

		turretModel[5].addBox(12F, -30F, 6F, 2, 10, 5, 0F); // AngledTurret
		turretModel[5].setRotationPoint(0F, 0F, 0F);
		turretModel[5].rotateAngleY = -1.082104F;

		turretModel[6].addBox(-8F, -30F, -7F, 8, 9, 15, 0F); // AmmoRacket
		turretModel[6].setRotationPoint(-3F, 0F, 0F);

		turretModel[7].addBox(-2F, -34F, -8F, 12, 4, 12, 0F); // CH
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addBox(1F, -32F, -12.5F, 12, 1, 1, 0F); // Rail
		turretModel[8].setRotationPoint(0F, 0F, 0F);
		turretModel[8].rotateAngleY = 0.08726646F;

		turretModel[9].addBox(-6F, -32F, -17F, 12, 1, 1, 0F); // Rail
		turretModel[9].setRotationPoint(0F, 0F, 0F);
		turretModel[9].rotateAngleY = 1.239184F;

		turretModel[10].addBox(-2F, -32F, 14F, 12, 1, 1, 0F); // Rail
		turretModel[10].setRotationPoint(0F, 0F, 0F);
		turretModel[10].rotateAngleY = -0.9773844F;

		turretModel[11].addBox(-1.5F, -32F, 10F, 12, 1, 1, 0F); // Rail
		turretModel[11].setRotationPoint(0F, 0F, 0F);
		turretModel[11].rotateAngleY = -0.08726646F;

		turretModel[12].addBox(0F, -31F, -12F, 1, 5, 1, 0F); // RailConnecter
		turretModel[12].setRotationPoint(0F, 0F, 0F);
		turretModel[12].rotateAngleX = -0.6806784F;

		turretModel[13].addBox(4F, -32F, 10.2F, 1, 5, 1, 0F); // RailConnecter
		turretModel[13].setRotationPoint(0F, 0F, 0F);
		turretModel[13].rotateAngleX = 0.6806784F;

		turretModel[14].addBox(7.133333F, -33F, -10F, 1, 5, 1, 0F); // RailConnecter
		turretModel[14].setRotationPoint(0F, 0F, 0F);
		turretModel[14].rotateAngleX = -0.6806784F;
		turretModel[14].rotateAngleY = -0.7853982F;

		turretModel[15].addBox(5.1F, -34.5F, -7.5F, 1, 5, 1, 0F); // RailConnecter
		turretModel[15].setRotationPoint(0F, 0F, 0F);
		turretModel[15].rotateAngleX = -0.6806784F;
		turretModel[15].rotateAngleY = -1.850049F;

		turretModel[16].addBox(-1F, -35F, -7F, 10, 1, 10, 0F); // ChTop
		turretModel[16].setRotationPoint(0F, 0F, 0F);



// Barrel
		barrelModel = new ModelRendererTurbo[4];
		barrelModel[0] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // Barrel
		barrelModel[1] = new ModelRendererTurbo(this,  0,  41, textureX, textureY); // UnderBarrel
		barrelModel[2] = new ModelRendererTurbo(this,  0,  64, textureX, textureY); // BarrelConnecter
		barrelModel[3] = new ModelRendererTurbo(this,  61,  53, textureX, textureY); // BarrelMantle

		barrelModel[0].addBox(14F, -28F, -2F, 21, 3, 3, 0F); // Barrel
		barrelModel[0].setRotationPoint(0F, 0F, 0F);

		barrelModel[1].addBox(15F, -24.5F, -1.5F, 11, 2, 2, 0F); // UnderBarrel
		barrelModel[1].setRotationPoint(0F, 0F, 0F);

		barrelModel[2].addBox(22F, -25F, -1F, 3, 1, 1, 0F); // BarrelConnecter
		barrelModel[2].setRotationPoint(0F, 0F, 0F);

		barrelModel[3].addBox(18.5F, -29F, -5F, 1, 8, 9, 0F); // BarrelMantle
		barrelModel[3].setRotationPoint(0F, 0F, 0F);
		barrelModel[3].rotateAngleZ = 0.01745329F;



// Left Track
		leftTrackModel = new ModelRendererTurbo[12];
		leftTrackModel[0] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // LT.Wheel1
		leftTrackModel[1] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // LT.Wheel2
		leftTrackModel[2] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // LT.Wheel3
		leftTrackModel[3] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // LT.Wheel4
		leftTrackModel[4] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // LT.Wheel5
		leftTrackModel[5] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // LT.Wheel6
		leftTrackModel[6] = new ModelRendererTurbo(this,  600,  400, textureX, textureY); // LT.Top
		leftTrackModel[7] = new ModelRendererTurbo(this,  600,  430, textureX, textureY); // LT.Front
		leftTrackModel[8] = new ModelRendererTurbo(this,  600,  460, textureX, textureY); // LT.Bottom
		leftTrackModel[9] = new ModelRendererTurbo(this,  600,  500, textureX, textureY); // LT.Back
		leftTrackModel[10] = new ModelRendererTurbo(this,  600,  530, textureX, textureY); // LT.Frontcorner
		leftTrackModel[11] = new ModelRendererTurbo(this,  600,  570, textureX, textureY); // LT.Backcorner

		leftTrackModel[0].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel1
		leftTrackModel[0].setRotationPoint(28F, 2F, -18F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel2
		leftTrackModel[1].setRotationPoint(17F, 2F, -18F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel3
		leftTrackModel[2].setRotationPoint(3F, 2F, -18F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel4
		leftTrackModel[3].setRotationPoint(-8F, 2F, -18F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel5
		leftTrackModel[4].setRotationPoint(-22F, 2F, -18F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel6
		leftTrackModel[5].setRotationPoint(-33F, 2F, -18F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 88, 1, 6, 0F); // LT.Top
		leftTrackModel[6].setRotationPoint(-42.5F, -12F, -18F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // LT.Front
		leftTrackModel[7].setRotationPoint(45F, -11.5F, -18F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // LT.Bottom
		leftTrackModel[8].setRotationPoint(-33.5F, 9F, -18F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // LT.Back
		leftTrackModel[9].setRotationPoint(-43F, -11.5F, -18F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // LT.Frontcorner
		leftTrackModel[10].setRotationPoint(45F, -2.5F, -18F);
		leftTrackModel[10].rotateAngleZ = -0.6632251F;

		leftTrackModel[11].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // LT.Backcorner
		leftTrackModel[11].setRotationPoint(-43F, -2F, -18F);
		leftTrackModel[11].rotateAngleZ = 0.6632251F;



// Right Track
		rightTrackModel = new ModelRendererTurbo[12];
		rightTrackModel[0] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // RT.Wheel1
		rightTrackModel[1] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // RT.Wheel2
		rightTrackModel[2] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // RT.Wheel3
		rightTrackModel[3] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // RT.Wheel4
		rightTrackModel[4] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // RT.Wheel5
		rightTrackModel[5] = new ModelRendererTurbo(this,  500,  500, textureX, textureY); // RT.Wheel6
		rightTrackModel[6] = new ModelRendererTurbo(this,  600,  400, textureX, textureY); // RT.Top
		rightTrackModel[7] = new ModelRendererTurbo(this,  600,  430, textureX, textureY); // RT.Front
		rightTrackModel[8] = new ModelRendererTurbo(this,  600,  460, textureX, textureY); // RT.Bottom
		rightTrackModel[9] = new ModelRendererTurbo(this,  600,  500, textureX, textureY); // RT.Back
		rightTrackModel[10] = new ModelRendererTurbo(this,  600,  530, textureX, textureY); // RT.Frontcorner
		rightTrackModel[11] = new ModelRendererTurbo(this,  600,  570, textureX, textureY); // RT.Backcorner

		rightTrackModel[0].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel1
		rightTrackModel[0].setRotationPoint(28F, 2F, 18F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel2
		rightTrackModel[1].setRotationPoint(17F, 2F, 18F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel3
		rightTrackModel[2].setRotationPoint(3F, 2F, 18F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel4
		rightTrackModel[3].setRotationPoint(-8F, 2F, 18F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel5
		rightTrackModel[4].setRotationPoint(-22F, 2F, 18F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel6
		rightTrackModel[5].setRotationPoint(-33F, 2F, 18F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 88, 1, 6, 0F); // RT.Top
		rightTrackModel[6].setRotationPoint(-42.5F, -12F, 18F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // RT.Front
		rightTrackModel[7].setRotationPoint(45F, -11.5F, 18F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // RT.Bottom
		rightTrackModel[8].setRotationPoint(-33.5F, 9F, 18F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // RT.Back
		rightTrackModel[9].setRotationPoint(-43F, -11.5F, 18F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // RT.Frontcorner
		rightTrackModel[10].setRotationPoint(45F, -2.5F, 18F);
		rightTrackModel[10].rotateAngleZ = -0.6632251F;

		rightTrackModel[11].addBox(0F, 0F, 3F, 1, 15, 6, 0F); // RT.Backcorner
		rightTrackModel[11].setRotationPoint(-43F, -2F, 15F);
		rightTrackModel[11].rotateAngleZ = 0.6632251F;


		translateAll(0, 0, 0);


		flipAll();
	}
}