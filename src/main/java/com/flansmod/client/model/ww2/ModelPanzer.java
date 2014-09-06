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

public class ModelPanzer extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelPanzer()
	{

// Body
		bodyModel = new ModelRendererTurbo[24];
		bodyModel[0] = new ModelRendererTurbo(this,  145,  1, textureX, textureY); // UnderBody
		bodyModel[1] = new ModelRendererTurbo(this,  417,  1, textureX, textureY); // Body
		bodyModel[2] = new ModelRendererTurbo(this,  497,  1, textureX, textureY); // Body
		bodyModel[3] = new ModelRendererTurbo(this,  545,  1, textureX, textureY); // Body
		bodyModel[4] = new ModelRendererTurbo(this,  617,  1, textureX, textureY); // SidePlateR
		bodyModel[5] = new ModelRendererTurbo(this,  801,  1, textureX, textureY); // SidePlateL
		bodyModel[6] = new ModelRendererTurbo(this,  633,  33, textureX, textureY); // UnderBase
		bodyModel[7] = new ModelRendererTurbo(this,  17,  57, textureX, textureY); // Trackguards
		bodyModel[8] = new ModelRendererTurbo(this,  385,  1, textureX, textureY); // TrackcoverBack
		bodyModel[9] = new ModelRendererTurbo(this,  465,  1, textureX, textureY); // TrackcoverBack
		bodyModel[10] = new ModelRendererTurbo(this,  265,  57, textureX, textureY); // MainBody
		bodyModel[11] = new ModelRendererTurbo(this,  865,  33, textureX, textureY); // Body
		bodyModel[12] = new ModelRendererTurbo(this,  985,  1, textureX, textureY); // AngledBody
		bodyModel[13] = new ModelRendererTurbo(this,  385,  17, textureX, textureY); // AngledBody
		bodyModel[14] = new ModelRendererTurbo(this,  481,  41, textureX, textureY); // Body
		bodyModel[15] = new ModelRendererTurbo(this,  425,  25, textureX, textureY); // 
		bodyModel[16] = new ModelRendererTurbo(this,  985,  17, textureX, textureY); // MGfront
		bodyModel[17] = new ModelRendererTurbo(this,  121,  9, textureX, textureY); // Driver'sPort
		bodyModel[18] = new ModelRendererTurbo(this,  17,  73, textureX, textureY); // TrackcoverFront
		bodyModel[19] = new ModelRendererTurbo(this,  753,  73, textureX, textureY); // TrackcoverFront
		bodyModel[20] = new ModelRendererTurbo(this,  849,  121, textureX, textureY); // 
		bodyModel[21] = new ModelRendererTurbo(this,  1,  129, textureX, textureY); // PlateHolder
		bodyModel[22] = new ModelRendererTurbo(this,  561,  25, textureX, textureY); // 
		bodyModel[23] = new ModelRendererTurbo(this,  625,  57, textureX, textureY); // RadiooperatorHatch

		bodyModel[0].addBox(0F, 0F, -1F, 100, 14, 35, 0F); // UnderBody
		bodyModel[0].setRotationPoint(-45F, -11F, -17F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 3, 36, 0F); // Body
		bodyModel[1].setRotationPoint(61F, -11.7F, -18F);
		bodyModel[1].rotateAngleZ = -0.2443461F;

		bodyModel[2].addBox(0F, 0F, 0F, 12, 2, 36, 0F); // Body
		bodyModel[2].setRotationPoint(50F, -14F, -18F);
		bodyModel[2].rotateAngleZ = -0.2094395F;

		bodyModel[3].addBox(0F, 0F, 0F, 8, 3, 50, 0F); // Body
		bodyModel[3].setRotationPoint(42F, -14F, -25F);

		bodyModel[4].addBox(0F, 0F, 0F, 87, 25, 1, 0F); // SidePlateR
		bodyModel[4].setRotationPoint(-37F, -20F, 27F);
		bodyModel[4].rotateAngleX = -0.01745329F;

		bodyModel[5].addBox(0F, 0F, 0F, 87, 25, 1, 0F); // SidePlateL
		bodyModel[5].setRotationPoint(-37F, -20F, -29F);
		bodyModel[5].rotateAngleX = 0.01745329F;

		bodyModel[6].addBox(0F, 0F, 0F, 80, 4, 35, 0F); // UnderBase
		bodyModel[6].setRotationPoint(-30F, 3F, -18F);

		bodyModel[7].addBox(0F, 0F, 0F, 97, 3, 50, 0F); // Trackguards
		bodyModel[7].setRotationPoint(-47F, -14F, -25F);

		bodyModel[8].addBox(0F, 0F, 0F, 10, 3, 8, 0F); // TrackcoverBack
		bodyModel[8].setRotationPoint(-55.5F, -8.5F, -25F);
		bodyModel[8].rotateAngleZ = 0.5759587F;

		bodyModel[9].addBox(0F, 0F, 0F, 10, 3, 8, 0F); // TrackcoverBack
		bodyModel[9].setRotationPoint(-55.5F, -8.5F, 17F);
		bodyModel[9].rotateAngleZ = 0.5759587F;

		bodyModel[10].addBox(0F, 0F, 0F, 84, 7, 42, 0F); // MainBody
		bodyModel[10].setRotationPoint(-45F, -21F, -21F);

		bodyModel[11].addBox(0F, 0F, 0F, 11, 8, 30, 0F); // Body
		bodyModel[11].setRotationPoint(38.5F, -21F, -15F);

		bodyModel[12].addBox(0F, 0F, 0F, 12, 8, 6, 0F); // AngledBody
		bodyModel[12].setRotationPoint(39F, -21F, -21F);
		bodyModel[12].rotateAngleY = 0.5235988F;

		bodyModel[13].addBox(0F, 0F, 0F, 12, 8, 6, 0F); // AngledBody
		bodyModel[13].setRotationPoint(39F, -13F, 21F);
		bodyModel[13].rotateAngleX = 3.154392F;
		bodyModel[13].rotateAngleY = -0.5235988F;

		bodyModel[14].addBox(0F, 0F, 0F, 13, 2, 36, 0F); // Body
		bodyModel[14].setRotationPoint(50F, -13F, -18F);
		bodyModel[14].rotateAngleZ = -0.2094395F;

		bodyModel[15].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // MachinegunPort
		bodyModel[15].setRotationPoint(49F, -19.5F, -12F);

		bodyModel[16].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // MGfront
		bodyModel[16].setRotationPoint(50F, -17.3F, -9.7F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Driver'sPort
		bodyModel[17].setRotationPoint(49F, -19F, 4F);

		bodyModel[18].addBox(0F, 0F, 0F, 13, 3, 8, 0F); // TrackcoverFront
		bodyModel[18].setRotationPoint(50F, -13.93333F, -25F);
		bodyModel[18].rotateAngleZ = -0.08726646F;

		bodyModel[19].addBox(0F, 0F, 0F, 13, 3, 8, 0F); // TrackcoverFront
		bodyModel[19].setRotationPoint(50F, -13.9F, 17F);
		bodyModel[19].rotateAngleZ = -0.08726646F;

		bodyModel[20].addBox(0F, 0F, 0F, 1, 2, 55, 0F); // PlateHolder
		bodyModel[20].setRotationPoint(-17F, -16F, -28F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 55, 0F); // PlateHolder
		bodyModel[21].setRotationPoint(37F, -16F, -28F);

		bodyModel[22].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Driver'sHatch
		bodyModel[22].setRotationPoint(36F, -22.5F, 6F);

		bodyModel[23].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // RadiooperatorHatch
		bodyModel[23].setRotationPoint(36F, -22.5F, -16F);



// Turret
		turretModel = new ModelRendererTurbo[33];
		turretModel[0] = new ModelRendererTurbo(this,  465,  17, textureX, textureY); // TurretCheek
		turretModel[1] = new ModelRendererTurbo(this,  17,  25, textureX, textureY); // turretCheek
		turretModel[2] = new ModelRendererTurbo(this,  81,  1, textureX, textureY); // TurretFront
		turretModel[3] = new ModelRendererTurbo(this,  617,  33, textureX, textureY); // TurretSide
		turretModel[4] = new ModelRendererTurbo(this,  833,  33, textureX, textureY); // TurretSide
		turretModel[5] = new ModelRendererTurbo(this,  921,  33, textureX, textureY); // TurretTopCheek
		turretModel[6] = new ModelRendererTurbo(this,  17,  41, textureX, textureY); // TurretTopCheek
		turretModel[7] = new ModelRendererTurbo(this,  921,  49, textureX, textureY); // TurretTopFront
		turretModel[8] = new ModelRendererTurbo(this,  553,  57, textureX, textureY); // Turrettop
		turretModel[9] = new ModelRendererTurbo(this,  601,  73, textureX, textureY); // TurretBase
		turretModel[10] = new ModelRendererTurbo(this,  705,  73, textureX, textureY); // TurretBase2
		turretModel[11] = new ModelRendererTurbo(this,  785,  73, textureX, textureY); // TurretBase3
		turretModel[12] = new ModelRendererTurbo(this,  977,  25, textureX, textureY); // Turrettop
		turretModel[13] = new ModelRendererTurbo(this,  73,  41, textureX, textureY); // TurretBottom
		turretModel[14] = new ModelRendererTurbo(this,  977,  33, textureX, textureY); // Turrettop
		turretModel[15] = new ModelRendererTurbo(this,  417,  41, textureX, textureY); // TurretBottom
		turretModel[16] = new ModelRendererTurbo(this,  841,  73, textureX, textureY); // TurretBack
		turretModel[17] = new ModelRendererTurbo(this,  561,  1, textureX, textureY); // Turret
		turretModel[18] = new ModelRendererTurbo(this,  465,  41, textureX, textureY); // Turrettop
		turretModel[19] = new ModelRendererTurbo(this,  833,  49, textureX, textureY); // Turrettop
		turretModel[20] = new ModelRendererTurbo(this,  673,  73, textureX, textureY); // AmmoRacket
		turretModel[21] = new ModelRendererTurbo(this,  417,  9, textureX, textureY); // Gunnersight
		turretModel[22] = new ModelRendererTurbo(this,  41,  9, textureX, textureY); // 
		turretModel[23] = new ModelRendererTurbo(this,  417,  1, textureX, textureY); // CH
		turretModel[24] = new ModelRendererTurbo(this,  73,  9, textureX, textureY); // CH
		turretModel[25] = new ModelRendererTurbo(this,  561,  17, textureX, textureY); // CH
		turretModel[26] = new ModelRendererTurbo(this,  65,  129, textureX, textureY); // 
		turretModel[27] = new ModelRendererTurbo(this,  129,  129, textureX, textureY); // TurretSkirt
		turretModel[28] = new ModelRendererTurbo(this,  193,  129, textureX, textureY); // TurretSkirt
		turretModel[29] = new ModelRendererTurbo(this,  241,  129, textureX, textureY); // TurretSkirt
		turretModel[30] = new ModelRendererTurbo(this,  265,  129, textureX, textureY); // TurretSkirt
		turretModel[31] = new ModelRendererTurbo(this,  297,  129, textureX, textureY); // TurretSkirt
		turretModel[32] = new ModelRendererTurbo(this,  329,  129, textureX, textureY); // TurretSkirt

		turretModel[0].addBox(0F, -30F, -12.4F, 23, 6, 2, 0F); // TurretCheek
		turretModel[0].setRotationPoint(-1F, 0F, 0F);
		turretModel[0].rotateAngleX = 0.1570796F;
		turretModel[0].rotateAngleY = 0.1396263F;

		turretModel[1].addBox(-1F, -30F, 10.6F, 22, 6, 2, 0F); // turretCheek
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleX = -0.1570796F;
		turretModel[1].rotateAngleY = -0.1396263F;

		turretModel[2].addBox(25F, -25.5F, -13.5F, 2, 9, 27, 0F); // TurretFront
		turretModel[2].setRotationPoint(0F, -4F, 0F);
		turretModel[2].rotateAngleZ = 0.08726646F;

		turretModel[3].addBox(-18.5F, -31F, -20.3F, 20, 12, 2, 0F); // TurretSide
		turretModel[3].setRotationPoint(0F, 0F, 0F);
		turretModel[3].rotateAngleX = -0.1396263F;

		turretModel[4].addBox(-18.5F, -31F, 18.3F, 20, 12, 2, 0F); // TurretSide
		turretModel[4].setRotationPoint(0F, 0F, 0F);
		turretModel[4].rotateAngleX = 0.1396263F;

		turretModel[5].addBox(-1F, -31F, 18.5F, 22, 6, 2, 0F); // TurretTopCheek
		turretModel[5].setRotationPoint(0F, 0F, 0F);
		turretModel[5].rotateAngleX = 0.1396263F;
		turretModel[5].rotateAngleY = -0.1396263F;

		turretModel[6].addBox(0F, -31F, -20.5F, 23, 6, 2, 0F); // TurretTopCheek
		turretModel[6].setRotationPoint(-1F, 0F, 0F);
		turretModel[6].rotateAngleX = -0.1396263F;
		turretModel[6].rotateAngleY = 0.1396263F;

		turretModel[7].addBox(0F, -34.4F, -13.5F, 23, 2, 27, 0F); // TurretTopFront
		turretModel[7].setRotationPoint(0F, 0F, 0F);
		turretModel[7].rotateAngleZ = -0.03490658F;

		turretModel[8].addBox(0F, -34.4F, 0F, 6, 2, 31, 0F); // Turrettop
		turretModel[8].setRotationPoint(-4.5F, 0F, -15.5F);

		turretModel[9].addBox(-10.5F, -23F, -15.5F, 20, 3, 31, 0F); // TurretBase
		turretModel[9].setRotationPoint(-8F, -1F, 0F);

		turretModel[10].addBox(1.5F, -24F, -14.5F, 8, 3, 29, 0F); // TurretBase2
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addBox(9.5F, -24F, -13F, 14, 3, 26, 0F); // TurretBase3
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addBox(-2F, -34.3F, 10.6F, 18, 1, 5, 0F); // Turrettop
		turretModel[12].setRotationPoint(0F, 0F, 0F);
		turretModel[12].rotateAngleY = -0.1396263F;
		turretModel[12].rotateAngleZ = -0.03490658F;

		turretModel[13].addBox(-2F, -22F, 11F, 23, 1, 5, 0F); // TurretBottom
		turretModel[13].setRotationPoint(0F, 0F, 0F);
		turretModel[13].rotateAngleY = -0.1396263F;

		turretModel[14].addBox(-2F, -34.3F, -15.6F, 18, 1, 5, 0F); // Turrettop
		turretModel[14].setRotationPoint(0F, 0F, 0F);
		turretModel[14].rotateAngleY = 0.1396263F;
		turretModel[14].rotateAngleZ = -0.03490658F;

		turretModel[15].addBox(-2F, -22F, -16F, 23, 1, 5, 0F); // TurretBottom
		turretModel[15].setRotationPoint(0F, 0F, 0F);
		turretModel[15].rotateAngleY = 0.1396263F;

		turretModel[16].addBox(-24.5F, -30.5F, -15F, 3, 13, 30, 0F); // TurretBack
		turretModel[16].setRotationPoint(0F, 0F, 0F);
		turretModel[16].rotateAngleZ = -0.1745329F;

		turretModel[17].addBox(-18.5F, -34.5F, -5.5F, 3, 2, 11, 0F); // Turret
		turretModel[17].setRotationPoint(0F, 0F, 0F);

		turretModel[18].addBox(-18.5F, -34.4F, -15.5F, 14, 2, 10, 0F); // Turrettop
		turretModel[18].setRotationPoint(0F, 0F, 0F);

		turretModel[19].addBox(-18.5F, -34.4F, 5.5F, 14, 2, 10, 0F); // Turrettop
		turretModel[19].setRotationPoint(0F, 0F, 0F);

		turretModel[20].addBox(-31F, -34F, -9F, 12, 10, 18, 0F); // AmmoRacket
		turretModel[20].setRotationPoint(0F, 0F, 0F);

		turretModel[21].addBox(18F, -29F, 5F, 8, 3, 6, 0F); // Gunnersight
		turretModel[21].setRotationPoint(0F, 0F, 0F);

		turretModel[22].addBox(-16F, -37F, -5F, 1, 3, 10, 0F); // CH
		turretModel[22].setRotationPoint(0F, 0F, 0F);

		turretModel[23].addBox(-15F, -36F, 5F, 10, 3, 1, 0F); // CH
		turretModel[23].setRotationPoint(0F, -1F, 0F);

		turretModel[24].addBox(-5F, -37F, -5F, 1, 3, 10, 0F); // CH
		turretModel[24].setRotationPoint(0F, 0F, 0F);

		turretModel[25].addBox(-15F, -37F, -6F, 10, 3, 1, 0F); // CH
		turretModel[25].setRotationPoint(0F, 0F, 0F);

		turretModel[26].addBox(-5F, -34F, 20F, 28, 12, 1, 0F); // TurretSkirt
		turretModel[26].setRotationPoint(0F, 0F, 0F);
		turretModel[26].rotateAngleX = 0.03490658F;
		turretModel[26].rotateAngleY = -0.1745329F;

		turretModel[27].addBox(-5F, -34F, -21F, 28, 12, 1, 0F); // TurretSkirt
		turretModel[27].setRotationPoint(0F, 0F, 0F);
		turretModel[27].rotateAngleX = -0.03490658F;
		turretModel[27].rotateAngleY = 0.1745329F;

		turretModel[28].addBox(-21F, -34F, 20.5F, 22, 12, 1, 0F); // TurretSkirt
		turretModel[28].setRotationPoint(0F, 0F, 0F);
		turretModel[28].rotateAngleX = 0.03490658F;
		turretModel[28].rotateAngleY = 0.1047198F;

		turretModel[29].addBox(-21F, -34F, -21.5F, 22, 12, 1, 0F); // TurretSkirt
		turretModel[29].setRotationPoint(0F, 0F, 0F);
		turretModel[29].rotateAngleX = -0.03490658F;
		turretModel[29].rotateAngleY = -0.1047198F;

		turretModel[30].addBox(-34.5F, -34F, -12F, 1, 12, 24, 0F); // TurretSkirt
		turretModel[30].setRotationPoint(0F, 0F, 0F);
		turretModel[30].rotateAngleZ = -0.03490658F;

		turretModel[31].addBox(-20F, -34F, 28.5F, 12, 12, 1, 0F); // TurretSkirt
		turretModel[31].setRotationPoint(0F, 0F, 0F);
		turretModel[31].rotateAngleX = 0.03490658F;
		turretModel[31].rotateAngleY = 0.6283185F;

		turretModel[32].addBox(-20F, -34F, -29.5F, 12, 12, 1, 0F); // TurretSkirt
		turretModel[32].setRotationPoint(0F, 0F, 0F);
		turretModel[32].rotateAngleX = -0.03490658F;
		turretModel[32].rotateAngleY = -0.6283185F;



// Barrel
		barrelModel = new ModelRendererTurbo[4];
		barrelModel[0] = new ModelRendererTurbo(this,  17,  57, textureX, textureY); // GunRammer
		barrelModel[1] = new ModelRendererTurbo(this,  881,  81, textureX, textureY); // Barrel
		barrelModel[2] = new ModelRendererTurbo(this,  505,  1, textureX, textureY); // MuzzleBreak
		barrelModel[3] = new ModelRendererTurbo(this,  145,  9, textureX, textureY); // Gunmantle

		barrelModel[0].addBox(1F, -2.5F, -6F, 13, 5, 9, 0F); // GunRammer
		barrelModel[0].setRotationPoint(24F, -26F, 0F);

		barrelModel[1].addBox(-10F, -1.5F, -3F, 59, 3, 3, 0F); // Barrel
		barrelModel[1].setRotationPoint(24F, -26F, 0F);

		barrelModel[2].addBox(49F, -2F, -3.5F, 7, 4, 4, 0F); // MuzzleBreak
		barrelModel[2].setRotationPoint(24F, -26F, 0F);
		
		barrelModel[3].addBox(1.5F, -4.5F, -7F, 1, 9, 11, 0F); // Gunmantle
		barrelModel[3].setRotationPoint(24F, -26F, 0F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[16];
		leftTrackModel[0] = new ModelRendererTurbo(this,  249,  113, textureX, textureY); // TrackTop
		leftTrackModel[1] = new ModelRendererTurbo(this,  1001,  41, textureX, textureY); // 
		leftTrackModel[2] = new ModelRendererTurbo(this,  265,  57, textureX, textureY); // TrackFrontLeft
		leftTrackModel[3] = new ModelRendererTurbo(this,  673,  121, textureX, textureY); // 
		leftTrackModel[4] = new ModelRendererTurbo(this,  841,  73, textureX, textureY); // 
		leftTrackModel[5] = new ModelRendererTurbo(this,  521,  81, textureX, textureY); // TrackRearAngledLeft
		leftTrackModel[6] = new ModelRendererTurbo(this,  913,  105, textureX, textureY); // 
		leftTrackModel[7] = new ModelRendererTurbo(this,  569,  97, textureX, textureY); // WheelL
		leftTrackModel[8] = new ModelRendererTurbo(this,  777,  105, textureX, textureY); // WheelL
		leftTrackModel[9] = new ModelRendererTurbo(this,  809,  105, textureX, textureY); // WheelL
		leftTrackModel[10] = new ModelRendererTurbo(this,  953,  105, textureX, textureY); // WheelL
		leftTrackModel[11] = new ModelRendererTurbo(this,  985,  105, textureX, textureY); // WheelL
		leftTrackModel[12] = new ModelRendererTurbo(this,  873,  121, textureX, textureY); // WheelL
		leftTrackModel[13] = new ModelRendererTurbo(this,  945,  121, textureX, textureY); // WheelL
		leftTrackModel[14] = new ModelRendererTurbo(this,  977,  121, textureX, textureY); // WheelL
		leftTrackModel[15] = new ModelRendererTurbo(this,  17,  129, textureX, textureY); // WheelL

		leftTrackModel[0].addBox(0F, 0F, 0F, 104, 1, 8, 0F); // TrackTop
		leftTrackModel[0].setRotationPoint(-46F, -9F, -27F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackRearLeft
		leftTrackModel[1].setRotationPoint(-46F, -8F, -27F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackFrontLeft
		leftTrackModel[2].setRotationPoint(57F, -8F, -27F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 90, 1, 8, 0F); // TrackBottomLeft
		leftTrackModel[3].setRotationPoint(-39F, 9F, -27F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // TrackFrontAngledLeft
		leftTrackModel[4].setRotationPoint(58F, -1F, -19F);
		leftTrackModel[4].rotateAngleY = -3.141593F;
		leftTrackModel[4].rotateAngleZ = 0.5759587F;

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // TrackRearAngledLeft
		leftTrackModel[5].setRotationPoint(-46F, -1F, -27F);
		leftTrackModel[5].rotateAngleZ = 0.5759587F;

		leftTrackModel[6].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // WheelL
		leftTrackModel[6].setRotationPoint(-45F, -8F, -26F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[7].setRotationPoint(45F, 3F, -24F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[8].setRotationPoint(35F, 3F, -24F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[9].setRotationPoint(24F, 3F, -24F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[10].setRotationPoint(11F, 3F, -24F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[11].setRotationPoint(-1F, 3F, -24F);

		leftTrackModel[12].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[12].setRotationPoint(-14F, 3F, -24F);

		leftTrackModel[13].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[13].setRotationPoint(-26F, 3F, -24F);

		leftTrackModel[14].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[14].setRotationPoint(-38F, 3F, -24F);

		leftTrackModel[15].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // WheelL
		leftTrackModel[15].setRotationPoint(49F, -8F, -26F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[16];
		rightTrackModel[0] = new ModelRendererTurbo(this,  17,  113, textureX, textureY); // TrackTop
		rightTrackModel[1] = new ModelRendererTurbo(this,  873,  41, textureX, textureY); // 
		rightTrackModel[2] = new ModelRendererTurbo(this,  481,  57, textureX, textureY); // 
		rightTrackModel[3] = new ModelRendererTurbo(this,  481,  113, textureX, textureY); // TrackBottomRight
		rightTrackModel[4] = new ModelRendererTurbo(this,  601,  57, textureX, textureY); // 
		rightTrackModel[5] = new ModelRendererTurbo(this,  281,  65, textureX, textureY); // TrackRearAngledRight
		rightTrackModel[6] = new ModelRendererTurbo(this,  545,  57, textureX, textureY); // 
		rightTrackModel[7] = new ModelRendererTurbo(this,  481,  81, textureX, textureY); // WheelR
		rightTrackModel[8] = new ModelRendererTurbo(this,  921,  49, textureX, textureY); // WheelR
		rightTrackModel[9] = new ModelRendererTurbo(this,  17,  89, textureX, textureY); // WheelR
		rightTrackModel[10] = new ModelRendererTurbo(this,  753,  89, textureX, textureY); // WheelR
		rightTrackModel[11] = new ModelRendererTurbo(this,  881,  89, textureX, textureY); // WheelR
		rightTrackModel[12] = new ModelRendererTurbo(this,  913,  89, textureX, textureY); // WheelR
		rightTrackModel[13] = new ModelRendererTurbo(this,  945,  89, textureX, textureY); // WheelR
		rightTrackModel[14] = new ModelRendererTurbo(this,  977,  89, textureX, textureY); // WheelR
		rightTrackModel[15] = new ModelRendererTurbo(this,  537,  97, textureX, textureY); // WheelR

		rightTrackModel[0].addBox(0F, 0F, 0F, 105, 1, 8, 0F); // TrackTop
		rightTrackModel[0].setRotationPoint(-47F, -9F, 18.1F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackRearRight
		rightTrackModel[1].setRotationPoint(-47F, -8F, 18.1F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackFrontRight
		rightTrackModel[2].setRotationPoint(57F, -8F, 18.1F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 91, 1, 8, 0F); // TrackBottomRight
		rightTrackModel[3].setRotationPoint(-40F, 9F, 18F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // TrackFrontAngledRight
		rightTrackModel[4].setRotationPoint(58F, -1F, 26.1F);
		rightTrackModel[4].rotateAngleY = -3.141593F;
		rightTrackModel[4].rotateAngleZ = 0.5759587F;

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // TrackRearAngledRight
		rightTrackModel[5].setRotationPoint(-47F, -1F, 18.1F);
		rightTrackModel[5].rotateAngleZ = 0.5759587F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // WheelR
		rightTrackModel[6].setRotationPoint(49F, -8F, 17F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // WheelR
		rightTrackModel[7].setRotationPoint(-46F, -8F, 17F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[8].setRotationPoint(-38F, 3F, 17F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[9].setRotationPoint(-26F, 3F, 17F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[10].setRotationPoint(-14F, 3F, 17F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[11].setRotationPoint(-1F, 3F, 17F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[12].setRotationPoint(11F, 3F, 17F);

		rightTrackModel[13].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[13].setRotationPoint(24F, 3F, 17F);

		rightTrackModel[14].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[14].setRotationPoint(35F, 3F, 17F);

		rightTrackModel[15].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[15].setRotationPoint(45F, 3F, 17F);

		//Gun model stolen from the browning
        ModelRendererTurbo[][] mg42Model = new ModelRendererTurbo[3][];
       
        //Yaw only part
        mg42Model[0] = new ModelRendererTurbo[0];
       
        //The main gun part
        mg42Model[1] = new ModelRendererTurbo[4];
        mg42Model[1][0] = new ModelRendererTurbo(this, 0, 205, textureX, textureY);
        mg42Model[1][1] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
        mg42Model[1][2] = new ModelRendererTurbo(this, 8, 203, textureX, textureY);
        mg42Model[1][3] = new ModelRendererTurbo(this, 18, 196, textureX, textureY);
       
        mg42Model[1][0].addBox(6F, 10F, -1F, 16, 2, 2);
        mg42Model[1][1].addBox(10F, 12F, -1F, 2, 3, 2);  
        mg42Model[1][2].addBox(22F, 10.5F, -0.5F, 4, 1, 1);             
        mg42Model[1][3].addBox(14F, 10F, -6F, 2, 4, 5);
       
        //Set the origin
        for(ModelRendererTurbo gunPart : mg42Model[1])
                gunPart.setRotationPoint(-10F, -55F, 0F);
       
        //No recoil part
                        mg42Model[2] = new ModelRendererTurbo[0];
                       
        registerGunModel("MG42", mg42Model);
		
		translateAll(0, 0, 0);


		flipAll();
	}
}