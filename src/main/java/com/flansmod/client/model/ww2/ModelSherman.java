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
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSherman extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSherman()
	{

// Body
		bodyModel = new ModelRendererTurbo[17];
		bodyModel[0] = new ModelRendererTurbo(this,  17,  1, textureX, textureY); // UnderBody
		bodyModel[1] = new ModelRendererTurbo(this,  281,  1, textureX, textureY); // UnderBase
		bodyModel[2] = new ModelRendererTurbo(this,  457,  1, textureX, textureY); // Trackguards
		bodyModel[3] = new ModelRendererTurbo(this,  713,  1, textureX, textureY); // Body
		bodyModel[4] = new ModelRendererTurbo(this,  385,  65, textureX, textureY); // BodyBack
		bodyModel[5] = new ModelRendererTurbo(this,  513,  65, textureX, textureY); // FrontAngledPlate
		bodyModel[6] = new ModelRendererTurbo(this,  569,  65, textureX, textureY); // FrontAngledPlate
		bodyModel[7] = new ModelRendererTurbo(this,  625,  65, textureX, textureY); // SidePlate
		bodyModel[8] = new ModelRendererTurbo(this,  17,  73, textureX, textureY); // SidePlate
		bodyModel[9] = new ModelRendererTurbo(this,  193,  57, textureX, textureY); // BackBody
		bodyModel[10] = new ModelRendererTurbo(this,  81,  73, textureX, textureY); // AngledFrontPlateUnder
		bodyModel[11] = new ModelRendererTurbo(this,  249,  73, textureX, textureY); // RearArmorPlate
		bodyModel[12] = new ModelRendererTurbo(this,  905,  65, textureX, textureY); // TrackguardFront
		bodyModel[13] = new ModelRendererTurbo(this,  161,  73, textureX, textureY); // TrackguardFront
		bodyModel[14] = new ModelRendererTurbo(this,  753,  57, textureX, textureY); // MainBody
		bodyModel[15] = new ModelRendererTurbo(this,  345,  73, textureX, textureY); // MgMantle
		bodyModel[16] = new ModelRendererTurbo(this,  33,  1, textureX, textureY); // MG

		bodyModel[0].addBox(0F, 0F, -1F, 95, 14, 35, 0F); // UnderBody
		bodyModel[0].setRotationPoint(-53F, -11F, -17F);

		bodyModel[1].addBox(0F, 0F, 0F, 80, 4, 35, 0F); // UnderBase
		bodyModel[1].setRotationPoint(-38F, 3F, -18F);

		bodyModel[2].addBox(0F, 0F, 0F, 100, 3, 54, 0F); // Trackguards
		bodyModel[2].setRotationPoint(-55F, -14F, -27F);

		bodyModel[3].addBox(0F, 0F, 0F, 30, 17, 35, 0F); // Body
		bodyModel[3].setRotationPoint(33F, -26.4F, -18F);
		bodyModel[3].rotateAngleZ = -0.8028514F;

		bodyModel[4].addBox(0F, 0F, 0F, 35, 7, 49, 0F); // BodyBack
		bodyModel[4].setRotationPoint(-52F, -16.5F, -25F);
		bodyModel[4].rotateAngleZ = 0.2792527F;

		bodyModel[5].addBox(0F, 0F, 0F, 19, 2, 7, 0F); // FrontAngledPlate
		bodyModel[5].setRotationPoint(33F, -26.4F, -25F);
		bodyModel[5].rotateAngleZ = -0.8028514F;

		bodyModel[6].addBox(0F, 0F, 0F, 19, 2, 7, 0F); // FrontAngledPlate
		bodyModel[6].setRotationPoint(33F, -26.4F, 17F);
		bodyModel[6].rotateAngleZ = -0.8028514F;

		bodyModel[7].addBox(0F, 0F, 0F, 52, 13, 4, 0F); // SidePlate
		bodyModel[7].setRotationPoint(-19F, -26.5F, -25F);

		bodyModel[8].addBox(0F, 0F, 0F, 52, 13, 4, 0F); // SidePlate
		bodyModel[8].setRotationPoint(-19F, -26.5F, 20F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 3, 50, 0F); // BackBody
		bodyModel[9].setRotationPoint(-53F, -17F, -25F);

		bodyModel[10].addBox(0F, 0F, 0F, 14, 7, 49, 0F); // AngledFrontPlateUnder
		bodyModel[10].setRotationPoint(33F, -24F, -25F);
		bodyModel[10].rotateAngleZ = -0.8028514F;

		bodyModel[11].addBox(0F, 0F, 0F, 22, 7, 49, 0F); // RearArmorPlate
		bodyModel[11].setRotationPoint(-40F, -14.5F, -25F);
		bodyModel[11].rotateAngleZ = 0.2792527F;

		bodyModel[12].addBox(0F, 0F, 0F, 11, 3, 10, 0F); // TrackguardFront
		bodyModel[12].setRotationPoint(45F, -14F, -27.5F);
		bodyModel[12].rotateAngleZ = -0.2792527F;

		bodyModel[13].addBox(0F, 0F, 0F, 11, 3, 10, 0F); // TrackguardFront
		bodyModel[13].setRotationPoint(45F, -14F, 17F);
		bodyModel[13].rotateAngleZ = -0.2792527F;

		bodyModel[14].addBox(0F, 0F, 0F, 52, 13, 42, 0F); // MainBody
		bodyModel[14].setRotationPoint(-19F, -26.5F, -21F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // MgMantle
		bodyModel[15].setRotationPoint(40F, -19F, -12F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // MG
		bodyModel[16].setRotationPoint(45F, -17F, -10F);



// Turret
		turretModel = new ModelRendererTurbo[17];
		turretModel[0] = new ModelRendererTurbo(this,  513,  81, textureX, textureY); // TurretTop
		turretModel[1] = new ModelRendererTurbo(this,  713,  65, textureX, textureY); // TurretAngledFront
		turretModel[2] = new ModelRendererTurbo(this,  345,  73, textureX, textureY); // TurretFront
		turretModel[3] = new ModelRendererTurbo(this,  249,  73, textureX, textureY); // TurretSideFront
		turretModel[4] = new ModelRendererTurbo(this,  385,  73, textureX, textureY); // TurretSideFront
		turretModel[5] = new ModelRendererTurbo(this,  945,  73, textureX, textureY); // TurretFrontMantle
		turretModel[6] = new ModelRendererTurbo(this,  617,  89, textureX, textureY); // TurretFrontUnder
		turretModel[7] = new ModelRendererTurbo(this,  665,  113, textureX, textureY); // TurretBase
		turretModel[8] = new ModelRendererTurbo(this,  209,  73, textureX, textureY); // TurretSideBack
		turretModel[9] = new ModelRendererTurbo(this,  985,  73, textureX, textureY); // TurretSideBack
		turretModel[10] = new ModelRendererTurbo(this,  17,  105, textureX, textureY); // TurretBack
		turretModel[11] = new ModelRendererTurbo(this,  185,  113, textureX, textureY); // TurretBackUnder
		turretModel[12] = new ModelRendererTurbo(this,  481,  25, textureX, textureY); // GunnerSight
		turretModel[13] = new ModelRendererTurbo(this,  713,  25, textureX, textureY); // CH
		turretModel[14] = new ModelRendererTurbo(this,  713,  33, textureX, textureY); // CH
		turretModel[15] = new ModelRendererTurbo(this,  1001,  41, textureX, textureY); // CH
		turretModel[16] = new ModelRendererTurbo(this,  953,  57, textureX, textureY); // CH

		turretModel[0].addBox(-16F, -42F, -15F, 35, 2, 30, 0F); // TurretTop
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addBox(3F, -46F, -15F, 4, 2, 30, 0F); // TurretAngledFront
		turretModel[1].setRotationPoint(-1F, 0F, 0F);
		turretModel[1].rotateAngleZ = -0.3665192F;

		turretModel[2].addBox(18.5F, -40.5F, -15F, 4, 4, 30, 0F); // TurretFront
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addBox(-1F, -40.5F, 15F, 20, 11, 2, 0F); // TurretSideFront
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addBox(-1F, -40.5F, -17F, 20, 11, 2, 0F); // TurretSideFront
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addBox(19F, -37F, 12F, 4, 7, 30, 0F); // TurretFrontMantle
		turretModel[5].setRotationPoint(0F, 0F, -27F);

		turretModel[6].addBox(17F, -31.5F, -17F, 4, 5, 34, 0F); // TurretFrontUnder
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addBox(-13F, -29.5F, -18F, 30, 3, 36, 0F); // TurretBase
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addBox(-16F, -40F, -15F, 15, 11, 1, 0F); // TurretSideBack
		turretModel[8].setRotationPoint(0F, 0F, -1F);

		turretModel[9].addBox(-16F, -40F, 15F, 15, 11, 1, 0F); // TurretSideBack
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addBox(-18F, -40F, -15F, 4, 10, 30, 0F); // TurretBack
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addBox(-16F, -31F, -15F, 4, 3, 30, 0F); // TurretBackUnder
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addBox(15F, -37F, 7F, 9, 3, 5, 0F); // GunnerSight
		turretModel[12].setRotationPoint(0F, 0F, 0F);

		turretModel[13].addBox(-4F, -44F, -13F, 10, 2, 1, 0F); // CH
		turretModel[13].setRotationPoint(0F, 0F, 0F);

		turretModel[14].addBox(-4F, -44F, -2F, 10, 2, 1, 0F); // CH
		turretModel[14].setRotationPoint(0F, 0F, 0F);

		turretModel[15].addBox(-5F, -44F, -12F, 1, 2, 10, 0F); // CH
		turretModel[15].setRotationPoint(0F, 0F, 0F);

		turretModel[16].addBox(6F, -44F, -12F, 1, 2, 10, 0F); // CH
		turretModel[16].setRotationPoint(0F, 0F, 0F);



// Barrel
		barrelModel = new ModelRendererTurbo[2];
		barrelModel[0] = new ModelRendererTurbo(this,  161,  89, textureX, textureY); // Barrel
		barrelModel[1] = new ModelRendererTurbo(this,  937,  73, textureX, textureY); // BarrelMantle

		barrelModel[0].addBox(-1F, -2F, -2F, 35, 4, 4, 0F); // Barrel
		barrelModel[0].setRotationPoint(25F, -36F, -0.5F);

		barrelModel[1].addBox(-2F, -4F, -7F, 3, 9, 14, 0F); // BarrelMantle
		barrelModel[1].setRotationPoint(25F, -36F, -0.5F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[14];
		leftTrackModel[0] = new ModelRendererTurbo(this,  17,  57, textureX, textureY); // TrackTop
		leftTrackModel[1] = new ModelRendererTurbo(this,  249,  1, textureX, textureY); // 
		leftTrackModel[2] = new ModelRendererTurbo(this,  273,  1, textureX, textureY); // TrackFrontLeft
		leftTrackModel[3] = new ModelRendererTurbo(this,  817,  17, textureX, textureY); // 
		leftTrackModel[4] = new ModelRendererTurbo(this,  33,  9, textureX, textureY); // 
		leftTrackModel[5] = new ModelRendererTurbo(this,  849,  33, textureX, textureY); // TrackRearAngledLeft
		leftTrackModel[6] = new ModelRendererTurbo(this,  969,  49, textureX, textureY); // 
		leftTrackModel[7] = new ModelRendererTurbo(this,  249,  57, textureX, textureY); // WheelL
		leftTrackModel[8] = new ModelRendererTurbo(this,  281,  57, textureX, textureY); // WheelL
		leftTrackModel[9] = new ModelRendererTurbo(this,  313,  57, textureX, textureY); // WheelL
		leftTrackModel[10] = new ModelRendererTurbo(this,  345,  57, textureX, textureY); // WheelL
		leftTrackModel[11] = new ModelRendererTurbo(this,  377,  57, textureX, textureY); // WheelL
		leftTrackModel[12] = new ModelRendererTurbo(this,  409,  57, textureX, textureY); // WheelL
		leftTrackModel[13] = new ModelRendererTurbo(this,  761,  57, textureX, textureY); // WheelL

		leftTrackModel[0].addBox(0F, 0F, 0F, 104, 1, 8, 0F); // TrackTop
		leftTrackModel[0].setRotationPoint(-54F, -9F, -27F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackRearLeft
		leftTrackModel[1].setRotationPoint(-54F, -8F, -27F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackFrontLeft
		leftTrackModel[2].setRotationPoint(49F, -8F, -27F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 90, 1, 8, 0F); // TrackBottomLeft
		leftTrackModel[3].setRotationPoint(-47F, 9F, -27F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // TrackFrontAngledLeft
		leftTrackModel[4].setRotationPoint(50F, -1F, -19F);
		leftTrackModel[4].rotateAngleY = -3.141593F;
		leftTrackModel[4].rotateAngleZ = 0.5759587F;

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // TrackRearAngledLeft
		leftTrackModel[5].setRotationPoint(-54F, -1F, -27F);
		leftTrackModel[5].rotateAngleZ = 0.5759587F;

		leftTrackModel[6].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // WheelL
		leftTrackModel[6].setRotationPoint(-53F, -8F, -26F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[7].setRotationPoint(37F, 3F, -24F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 6, 7, 6, 0F); // WheelL
		leftTrackModel[8].setRotationPoint(16F, 2F, -24F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 6, 7, 6, 0F); // WheelL
		leftTrackModel[9].setRotationPoint(3F, 2F, -24F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 6, 7, 6, 0F); // WheelL
		leftTrackModel[10].setRotationPoint(-16F, 2F, -24F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 6, 7, 6, 0F); // WheelL
		leftTrackModel[11].setRotationPoint(-28F, 2F, -24F);

		leftTrackModel[12].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelL
		leftTrackModel[12].setRotationPoint(-46F, 3F, -24F);

		leftTrackModel[13].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // WheelL
		leftTrackModel[13].setRotationPoint(41F, -8F, -26F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[14];
		rightTrackModel[0] = new ModelRendererTurbo(this,  281,  41, textureX, textureY); // TrackTop
		rightTrackModel[1] = new ModelRendererTurbo(this,  17,  1, textureX, textureY); // 
		rightTrackModel[2] = new ModelRendererTurbo(this,  297,  1, textureX, textureY); // 
		rightTrackModel[3] = new ModelRendererTurbo(this,  817,  1, textureX, textureY); // TrackBottomRight
		rightTrackModel[4] = new ModelRendererTurbo(this,  481,  1, textureX, textureY); // 
		rightTrackModel[5] = new ModelRendererTurbo(this,  713,  1, textureX, textureY); // TrackRearAngledRight
		rightTrackModel[6] = new ModelRendererTurbo(this,  249,  17, textureX, textureY); // 
		rightTrackModel[7] = new ModelRendererTurbo(this,  873,  33, textureX, textureY); // WheelR
		rightTrackModel[8] = new ModelRendererTurbo(this,  289,  17, textureX, textureY); // WheelR
		rightTrackModel[9] = new ModelRendererTurbo(this,  913,  33, textureX, textureY); // WheelR
		rightTrackModel[10] = new ModelRendererTurbo(this,  945,  33, textureX, textureY); // WheelR
		rightTrackModel[11] = new ModelRendererTurbo(this,  977,  33, textureX, textureY); // WheelR
		rightTrackModel[12] = new ModelRendererTurbo(this,  905,  49, textureX, textureY); // WheelR
		rightTrackModel[13] = new ModelRendererTurbo(this,  937,  49, textureX, textureY); // WheelR

		rightTrackModel[0].addBox(0F, 0F, 0F, 104, 1, 8, 0F); // TrackTop
		rightTrackModel[0].setRotationPoint(-54F, -9F, 18.1F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackRearRight
		rightTrackModel[1].setRotationPoint(-54F, -8F, 18.1F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackFrontRight
		rightTrackModel[2].setRotationPoint(49F, -8F, 18.1F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 90, 1, 8, 0F); // TrackBottomRight
		rightTrackModel[3].setRotationPoint(-47F, 9F, 18F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // TrackFrontAngledRight
		rightTrackModel[4].setRotationPoint(50F, -1F, 26.1F);
		rightTrackModel[4].rotateAngleY = -3.141593F;
		rightTrackModel[4].rotateAngleZ = 0.5759587F;

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // TrackRearAngledRight
		rightTrackModel[5].setRotationPoint(-54F, -1F, 18.1F);
		rightTrackModel[5].rotateAngleZ = 0.5759587F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // WheelR
		rightTrackModel[6].setRotationPoint(41F, -8F, 17F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // WheelR
		rightTrackModel[7].setRotationPoint(-53F, -8F, 17F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[8].setRotationPoint(-46F, 3F, 17F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // WheelR
		rightTrackModel[9].setRotationPoint(-28F, 2F, 17F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // WheelR
		rightTrackModel[10].setRotationPoint(-16F, 2F, 17F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // WheelR
		rightTrackModel[11].setRotationPoint(3F, 2F, 17F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // WheelR
		rightTrackModel[12].setRotationPoint(16F, 2F, 17F);

		rightTrackModel[13].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // WheelR
		rightTrackModel[13].setRotationPoint(37F, 3F, 17F);


		translateAll(0, 0, 0);


		flipAll();
	}
}