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

public class ModelMaus extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024  ;

	public ModelMaus()
	{

// Body
		bodyModel = new ModelRendererTurbo[26];
		bodyModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // Base
		bodyModel[1] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // FrontArmor
		bodyModel[2] = new ModelRendererTurbo(this,  481,  1, textureX, textureY); // FrontArmor
		bodyModel[3] = new ModelRendererTurbo(this,  553,  1, textureX, textureY); // FrontArmorAngle
		bodyModel[4] = new ModelRendererTurbo(this,  633,  41, textureX, textureY); // FrontAngledUnder
		bodyModel[5] = new ModelRendererTurbo(this,  97,  409, textureX, textureY); // CoverUnder
		bodyModel[6] = new ModelRendererTurbo(this,  1,  481, textureX, textureY); // CoverUnder
		bodyModel[7] = new ModelRendererTurbo(this,  393,  481, textureX, textureY); // CoverUnder
		bodyModel[8] = new ModelRendererTurbo(this,  1,  81, textureX, textureY); // Side
		bodyModel[9] = new ModelRendererTurbo(this,  425,  153, textureX, textureY); // Side
		bodyModel[10] = new ModelRendererTurbo(this,  833,  161, textureX, textureY); // Side
		bodyModel[11] = new ModelRendererTurbo(this,  145,  177, textureX, textureY); // Side
		bodyModel[12] = new ModelRendererTurbo(this,  305,  177, textureX, textureY); // Side
		bodyModel[13] = new ModelRendererTurbo(this,  1,  209, textureX, textureY); // Side
		bodyModel[14] = new ModelRendererTurbo(this,  393,  241, textureX, textureY); // Side
		bodyModel[15] = new ModelRendererTurbo(this,  553,  241, textureX, textureY); // Side
		bodyModel[16] = new ModelRendererTurbo(this,  713,  241, textureX, textureY); // Side
		bodyModel[17] = new ModelRendererTurbo(this,  793,  257, textureX, textureY); // Side
		bodyModel[18] = new ModelRendererTurbo(this,  89,  273, textureX, textureY); // Side
		bodyModel[19] = new ModelRendererTurbo(this,  249,  273, textureX, textureY); // Side
		bodyModel[20] = new ModelRendererTurbo(this,  329,  329, textureX, textureY); // Sideangled
		bodyModel[21] = new ModelRendererTurbo(this,  433,  345, textureX, textureY); // CoverSide
		bodyModel[22] = new ModelRendererTurbo(this,  1,  353, textureX, textureY); // CoverSide
		bodyModel[23] = new ModelRendererTurbo(this,  761,  345, textureX, textureY); // BodyBack
		bodyModel[24] = new ModelRendererTurbo(this,  433,  361, textureX, textureY); // CoverBack
		bodyModel[25] = new ModelRendererTurbo(this,  1,  369, textureX, textureY); // 

		bodyModel[0].addBox(0F, 0F, 0F, 200, 2, 75, 0F); // Base
		bodyModel[0].setRotationPoint(-55F, -8F, -37.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 10, 30, 0F); // FrontArmor
		bodyModel[1].setRotationPoint(145F, -8F, -37.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 10, 30, 0F); // FrontArmor
		bodyModel[2].setRotationPoint(145F, -8F, 7.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 45, 75, 0F); // FrontArmorAngle
		bodyModel[3].setRotationPoint(108.1F, -32.5F, -37.5F);
		bodyModel[3].rotateAngleZ = 0.9599311F;

		bodyModel[4].addBox(0F, 0F, 0F, 11, 8, 16, 0F); // FrontAngledUnder
		bodyModel[4].setRotationPoint(146F, -7.5F, -8F);
		bodyModel[4].rotateAngleZ = -2.181662F;

		bodyModel[5].addBox(0F, 0F, 0F, 200, 10, 1, 0F); // CoverUnder
		bodyModel[5].setRotationPoint(-54F, -8F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 200, 10, 1, 0F); // CoverUnder
		bodyModel[6].setRotationPoint(-54F, -8F, 7F);

		bodyModel[7].addBox(0F, 0F, 0F, 195, 8, 14, 0F); // CoverUnder
		bodyModel[7].setRotationPoint(-55.2F, -6F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 171, 20, 75, 0F); // Side
		bodyModel[8].setRotationPoint(-55F, -28F, -37.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 164, 7, 75, 0F); // Side
		bodyModel[9].setRotationPoint(-55F, -34.2F, -37.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 19, 75, 0F); // Side
		bodyModel[10].setRotationPoint(116F, -27F, -37.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 17, 75, 0F); // Side
		bodyModel[11].setRotationPoint(119F, -25F, -37.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 15, 75, 0F); // Side
		bodyModel[12].setRotationPoint(122F, -22.9F, -37.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 13, 75, 0F); // Side
		bodyModel[13].setRotationPoint(125F, -20.5F, -37.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 11, 75, 0F); // Side
		bodyModel[14].setRotationPoint(128F, -18.5F, -37.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 9, 75, 0F); // Side
		bodyModel[15].setRotationPoint(131F, -16.5F, -37.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 7, 75, 0F); // Side
		bodyModel[16].setRotationPoint(134F, -14.5F, -37.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 5, 75, 0F); // Side
		bodyModel[17].setRotationPoint(136F, -12.5F, -37.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 4, 75, 0F); // Side
		bodyModel[18].setRotationPoint(139F, -11.5F, -37.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 75, 0F); // Side
		bodyModel[19].setRotationPoint(141F, -9.5F, -37.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 14, 4, 75, 0F); // Sideangled
		bodyModel[20].setRotationPoint(109F, -33F, -37.5F);
		bodyModel[20].rotateAngleZ = -0.6108652F;

		bodyModel[21].addBox(0F, 0F, 0F, 200, 8, 1, 0F); // CoverSide
		bodyModel[21].setRotationPoint(-55F, -6F, 36.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 200, 8, 1, 0F); // CoverSide
		bodyModel[22].setRotationPoint(-55F, -6F, -37.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 17, 26, 75, 0F); // BodyBack
		bodyModel[23].setRotationPoint(-55F, -34F, -37.5F);
		bodyModel[23].rotateAngleZ = -0.3490658F;

		bodyModel[24].addBox(0F, 0F, 0F, 9, 12, 75, 0F); // CoverBack
		bodyModel[24].setRotationPoint(-63.9F, -10F, -37.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 16, 16, 62, 0F); // FuelTank
		bodyModel[25].setRotationPoint(-73F, -31F, -31F);
		bodyModel[25].rotateAngleZ = -0.3490658F;



// Turret
		turretModel = new ModelRendererTurbo[10];
		turretModel[0] = new ModelRendererTurbo(this,  657,  65, textureX, textureY); // TurretMain
		turretModel[1] = new ModelRendererTurbo(this,  633,  1, textureX, textureY); // TurretSide
		turretModel[2] = new ModelRendererTurbo(this,  1,  177, textureX, textureY); // TurretSide
		turretModel[3] = new ModelRendererTurbo(this,  497,  1, textureX, textureY); // TurretMantle
		turretModel[4] = new ModelRendererTurbo(this,  801,  1, textureX, textureY); // TurretMantleTop
		turretModel[5] = new ModelRendererTurbo(this,  929,  1, textureX, textureY); // GunMantleBack
		turretModel[6] = new ModelRendererTurbo(this,  913,  1, textureX, textureY); // Commander'sParascope
		turretModel[7] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // Commander'sParascope
		turretModel[8] = new ModelRendererTurbo(this,  865,  33, textureX, textureY); // Commander'sHatch
		turretModel[9] = new ModelRendererTurbo(this,  969,  1, textureX, textureY); // GunnerHatch

		turretModel[0].addBox(-50F, -59F, -28.5F, 100, 25, 57, 0F); // TurretMain
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addBox(-50F, -51F, 34F, 100, 25, 7, 0F); // TurretSide
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleX = 0.2268928F;

		turretModel[2].addBox(-50F, -51F, -41.5F, 100, 25, 6, 0F); // TurretSide
		turretModel[2].setRotationPoint(0F, 0F, 0F);
		turretModel[2].rotateAngleX = -0.2268928F;

		turretModel[3].addBox(50F, -56F, -26F, 8, 20, 52, 0F); // TurretMantle
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addBox(69F, 27F, -26F, 3, 9, 52, 0F); // TurretMantleTop
		turretModel[4].setRotationPoint(0F, 0F, 0F);
		turretModel[4].rotateAngleZ = 1.239184F;

		turretModel[5].addBox(58F, -55F, -15F, 2, 17, 30, 0F); // GunMantleBack
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addBox(35F, -62F, 10F, 10, 3, 10, 0F); // Commander'sParascope
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addBox(37F, -66F, 12F, 6, 4, 6, 0F); // Commander'sParascope
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addBox(-10F, -61F, -23F, 15, 2, 15, 0F); // Commander'sHatch
		turretModel[8].setRotationPoint(0F, 0F, 0F);

		turretModel[9].addBox(-10F, -60F, 10F, 10, 1, 10, 0F); // GunnerHatch
		turretModel[9].setRotationPoint(0F, 0F, 0F);



// Barrel
		barrelModel = new ModelRendererTurbo[3];
		barrelModel[0] = new ModelRendererTurbo(this,  425,  129, textureX, textureY); // Barrel
		barrelModel[1] = new ModelRendererTurbo(this,  569,  1, textureX, textureY); // TurretGun
		barrelModel[2] = new ModelRendererTurbo(this,  866,  1, textureX, textureY); // 

		barrelModel[0].addBox(11F, 4F, 5F, 100, 6, 6, 0F); // Barrel
		barrelModel[0].setRotationPoint(54F, -54F, -7.5F);

		barrelModel[1].addBox(54F, -48F, -12F, 19, 2, 2, 0F); // TurretGun
		barrelModel[1].setRotationPoint(0F, 0F, 0F);

		barrelModel[2].addBox(0F, 0F, 0F, 14, 15, 15, 0F); // GunMantle
		barrelModel[2].setRotationPoint(54F, -54F, -7.5F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[14];
		leftTrackModel[0] = new ModelRendererTurbo(this,  1,  81, textureX, textureY); // LW
		leftTrackModel[1] = new ModelRendererTurbo(this,  425,  81, textureX, textureY); // LW
		leftTrackModel[2] = new ModelRendererTurbo(this,  489,  81, textureX, textureY); // LW
		leftTrackModel[3] = new ModelRendererTurbo(this,  1,  113, textureX, textureY); // LW
		leftTrackModel[4] = new ModelRendererTurbo(this,  961,  137, textureX, textureY); // LW
		leftTrackModel[5] = new ModelRendererTurbo(this,  833,  153, textureX, textureY); // LW
		leftTrackModel[6] = new ModelRendererTurbo(this,  921,  169, textureX, textureY); // LW
		leftTrackModel[7] = new ModelRendererTurbo(this,  233,  177, textureX, textureY); // LW
		leftTrackModel[8] = new ModelRendererTurbo(this,  297,  177, textureX, textureY); // LW
		leftTrackModel[9] = new ModelRendererTurbo(this,  393,  177, textureX, textureY); // LW
		leftTrackModel[10] = new ModelRendererTurbo(this,  833,  185, textureX, textureY); // LW
		leftTrackModel[11] = new ModelRendererTurbo(this,  953,  73, textureX, textureY); // 
		leftTrackModel[12] = new ModelRendererTurbo(this,  969,  25, textureX, textureY); // 
		leftTrackModel[13] = new ModelRendererTurbo(this,  417,  449, textureX, textureY); // 

		leftTrackModel[0].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[0].setRotationPoint(-49F, -4F, -33F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[1].setRotationPoint(-33F, -4F, -33F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[2].setRotationPoint(-17F, -4F, -33F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[3].setRotationPoint(-1F, -4F, -33F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[4].setRotationPoint(15F, -4F, -33F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[5].setRotationPoint(31F, -4F, -33F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[6].setRotationPoint(47F, -4F, -33F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[7].setRotationPoint(63F, -4F, -33F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[8].setRotationPoint(79F, -4F, -33F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[9].setRotationPoint(95F, -4F, -33F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // LW
		leftTrackModel[10].setRotationPoint(112F, -4F, -33F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 2, 13, 25, 0F); // TrackLBA
		leftTrackModel[11].setRotationPoint(-57.4F, -0.8F, -36F);
		leftTrackModel[11].rotateAngleZ = 0.6108652F;

		leftTrackModel[12].addBox(0F, 0F, 0F, 2, 18, 25, 0F); // TrackLFA
		leftTrackModel[12].setRotationPoint(138.4F, -5.8F, -36F);
		leftTrackModel[12].rotateAngleZ = -0.6108652F;

		leftTrackModel[13].addBox(0F, 0F, 0F, 180, 2, 25, 0F); // TrackLB
		leftTrackModel[13].setRotationPoint(-50F, 8F, -36F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[14];
		rightTrackModel[0] = new ModelRendererTurbo(this,  921,  201, textureX, textureY); // RW
		rightTrackModel[1] = new ModelRendererTurbo(this,  1,  209, textureX, textureY); // RW
		rightTrackModel[2] = new ModelRendererTurbo(this,  89,  209, textureX, textureY); // RW
		rightTrackModel[3] = new ModelRendererTurbo(this,  153,  209, textureX, textureY); // RW
		rightTrackModel[4] = new ModelRendererTurbo(this,  233,  209, textureX, textureY); // RW
		rightTrackModel[5] = new ModelRendererTurbo(this,  297,  209, textureX, textureY); // RW
		rightTrackModel[6] = new ModelRendererTurbo(this,  1,  241, textureX, textureY); // RW
		rightTrackModel[7] = new ModelRendererTurbo(this,  481,  241, textureX, textureY); // RW
		rightTrackModel[8] = new ModelRendererTurbo(this,  545,  241, textureX, textureY); // RW
		rightTrackModel[9] = new ModelRendererTurbo(this,  641,  241, textureX, textureY); // RW
		rightTrackModel[10] = new ModelRendererTurbo(this,  705,  241, textureX, textureY); // RW
		rightTrackModel[11] = new ModelRendererTurbo(this,  921,  49, textureX, textureY); // 
		rightTrackModel[12] = new ModelRendererTurbo(this,  569,  9, textureX, textureY); // 
		rightTrackModel[13] = new ModelRendererTurbo(this,  1,  449, textureX, textureY); // 

		rightTrackModel[0].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[0].setRotationPoint(-49F, -4F, 15F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[1].setRotationPoint(-33F, -4F, 15F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[2].setRotationPoint(-17F, -4F, 15F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[3].setRotationPoint(-1F, -4F, 15F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[4].setRotationPoint(16F, -4F, 15F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[5].setRotationPoint(32F, -4F, 15F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[6].setRotationPoint(48F, -4F, 15F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[7].setRotationPoint(64F, -4F, 15F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[8].setRotationPoint(80F, -4F, 15F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[9].setRotationPoint(96F, -4F, 15F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 12, 12, 18, 0F); // RW
		rightTrackModel[10].setRotationPoint(112F, -4F, 15F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 2, 13, 25, 0F); // TrackRBA
		rightTrackModel[11].setRotationPoint(-57.4F, -0.8F, 11F);
		rightTrackModel[11].rotateAngleZ = 0.6108652F;

		rightTrackModel[12].addBox(0F, 0F, 0F, 2, 18, 25, 0F); // TrackRFA
		rightTrackModel[12].setRotationPoint(138.4F, -5.8F, 11F);
		rightTrackModel[12].rotateAngleZ = -0.6108652F;

		rightTrackModel[13].addBox(0F, 0F, 0F, 180, 2, 25, 0F); // TrackRB
		rightTrackModel[13].setRotationPoint(-50F, 8F, 11F);


		translateAll(0, 0, 0);


		flipAll();
	}
}