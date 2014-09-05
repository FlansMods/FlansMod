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

public class ModelChurchill extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelChurchill()
	{

// Body
		bodyModel = new ModelRendererTurbo[35];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body15
		bodyModel[1] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // Body1
		bodyModel[2] = new ModelRendererTurbo(this,  0,  95, textureX, textureY); // Body2
		bodyModel[3] = new ModelRendererTurbo(this,  0,  125, textureX, textureY); // Body3
		bodyModel[4] = new ModelRendererTurbo(this,  0,  155, textureX, textureY); // Body4
		bodyModel[5] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body5
		bodyModel[6] = new ModelRendererTurbo(this,  0,  245, textureX, textureY); // Body6
		bodyModel[7] = new ModelRendererTurbo(this,  0,  295, textureX, textureY); // Body7
		bodyModel[8] = new ModelRendererTurbo(this,  0,  335, textureX, textureY); // Body8
		bodyModel[9] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Body9
		bodyModel[10] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Body10
		bodyModel[11] = new ModelRendererTurbo(this,  0,  445, textureX, textureY); // Body11
		bodyModel[12] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Body12
		bodyModel[13] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // Body13
		bodyModel[14] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // Body14
		bodyModel[15] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // Body15
		bodyModel[16] = new ModelRendererTurbo(this,  0,  530, textureX, textureY); // Body16
		bodyModel[17] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // Body17
		bodyModel[18] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // Body18
		bodyModel[19] = new ModelRendererTurbo(this,  0,  95, textureX, textureY); // Body19
		bodyModel[20] = new ModelRendererTurbo(this,  0,  125, textureX, textureY); // Body20
		bodyModel[21] = new ModelRendererTurbo(this,  0,  155, textureX, textureY); // Body21
		bodyModel[22] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body22
		bodyModel[23] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // Body23
		bodyModel[24] = new ModelRendererTurbo(this,  0,  630, textureX, textureY); // Body24
		bodyModel[25] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // Body25
		bodyModel[26] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // Body27
		bodyModel[27] = new ModelRendererTurbo(this,  0,  700, textureX, textureY); // Body28
		bodyModel[28] = new ModelRendererTurbo(this,  0,  700, textureX, textureY); // Body29
		bodyModel[29] = new ModelRendererTurbo(this,  0,  730, textureX, textureY); // Body30
		bodyModel[30] = new ModelRendererTurbo(this,  0,  730, textureX, textureY); // Body31
		bodyModel[31] = new ModelRendererTurbo(this,  0,  730, textureX, textureY); // Body32
		bodyModel[32] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // Body33
		bodyModel[33] = new ModelRendererTurbo(this,  0,  530, textureX, textureY); // Body34
		bodyModel[34] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // Body35

		bodyModel[0].addBox(0F, 0F, 0F, 26, 10, 8, 0F); // Body15
		bodyModel[0].setRotationPoint(-34F, -22F, 33F);

		bodyModel[1].addBox(0F, 0F, 0F, 113, 24, 18, 0F); // Body1
		bodyModel[1].setRotationPoint(-54F, -22F, 15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 10, 16, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[2].setRotationPoint(63F, -22F, 15F);

		bodyModel[3].addBox(0F, 0F, 0F, 16, 11, 16, 0F); // Body3
		bodyModel[3].setRotationPoint(63F, -12F, 15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 24, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 0F); //Test
		bodyModel[4].setRotationPoint(59F, -22F, 15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 24, 16, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); //Test
		bodyModel[5].setRotationPoint(-70F, -22F, 15F);

		bodyModel[6].addBox(0F, 0F, 0F, 89, 16, 30, 0F); // Body6
		bodyModel[6].setRotationPoint(-54F, -20F, -15F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 106, 5, 30, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test Body7
		bodyModel[7].setRotationPoint(-54F, -4F, -15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 120, 9, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -10F, 0F, 0F); //Test
		bodyModel[8].setRotationPoint(-68F, 1F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 13, 6, 30, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[9].setRotationPoint(29F, -10F, -15F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 8, 10, 0F); // Body10
		bodyModel[10].setRotationPoint(35F, -19F, 4F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Body11
		bodyModel[11].setRotationPoint(36F, -17F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Body12
		bodyModel[12].setRotationPoint(39F, -16F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Body13
		bodyModel[13].setRotationPoint(21F, -21F, 3F);

		bodyModel[14].addBox(0F, 0F, -10F, 10, 1, 10, 0F); // Body14
		bodyModel[14].setRotationPoint(21F, -21F, -3F);

		bodyModel[15].addBox(0F, 0F, 0F, 26, 10, 8, 0F); // Body15
		bodyModel[15].setRotationPoint(-34F, -22F, 33F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 26, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		bodyModel[16].setRotationPoint(-34F, -12F, 33F);

		bodyModel[17].addBox(0F, 0F, 0F, 20, 3, 4, 0F); // Body17
		bodyModel[17].setRotationPoint(-31F, -25F, 35F);

		bodyModel[18].addBox(0F, 0F, -18F, 113, 24, 18, 0F); // Body18
		bodyModel[18].setRotationPoint(-54F, -22F, -15F);

		bodyModel[19].addShapeBox(0F, 0F, -16F, 16, 10, 16, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[19].setRotationPoint(63F, -22F, -15F);

		bodyModel[20].addBox(0F, 0F, -16F, 16, 11, 16, 0F); // Body20
		bodyModel[20].setRotationPoint(63F, -12F, -15F);

		bodyModel[21].addShapeBox(0F, 0F, -18F, 4, 24, 18, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); //Test Body21
		bodyModel[21].setRotationPoint(59F, -22F, -15F);

		bodyModel[22].addShapeBox(0F, 0F, -16F, 16, 24, 16, 0F, 0F, -6F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); //Test Body22
		bodyModel[22].setRotationPoint(-70F, -22F, -15F);

		bodyModel[23].addBox(-15F, 0F, 0F, 15, 14, 30, 0F); // Body23
		bodyModel[23].setRotationPoint(-53F, -20F, -15F);
		bodyModel[23].rotateAngleZ = 0.2792527F;

		bodyModel[24].addBox(-14F, 0F, 0F, 15, 17, 30, 0F); // Body24
		bodyModel[24].setRotationPoint(-54F, -16F, -15F);

		bodyModel[25].addBox(0F, 0F, 0F, 7, 13, 4, 0F); // Body25
		bodyModel[25].setRotationPoint(-75F, -16F, -15F);

		bodyModel[26].addBox(0F, 0F, 0F, 7, 13, 4, 0F); // Body27
		bodyModel[26].setRotationPoint(-75F, -16F, 11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 13, 4, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); //Test
		bodyModel[27].setRotationPoint(-78F, -16F, -15F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 13, 4, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); //Test
		bodyModel[28].setRotationPoint(-78F, -16F, 11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 9, 22, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); //Test Body30
		bodyModel[29].setRotationPoint(-71F, -14F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 9, 22, 0F); // Body31
		bodyModel[30].setRotationPoint(-74F, -14F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 9, 22, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); //Test
		bodyModel[31].setRotationPoint(-77F, -14F, -11F);

		bodyModel[32].addBox(0F, 0F, -8F, 26, 10, 8, 0F); // Body33
		bodyModel[32].setRotationPoint(-34F, -22F, -33F);

		bodyModel[33].addShapeBox(0F, 0F, -8F, 26, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[33].setRotationPoint(-34F, -12F, -33F);

		bodyModel[34].addBox(0F, 0F, -4F, 20, 3, 4, 0F); // Body35
		bodyModel[34].setRotationPoint(-31F, -25F, -35F);



// Turret
		turretModel = new ModelRendererTurbo[5];
		turretModel[0] = new ModelRendererTurbo(this,  400,  0, textureX, textureY); // Turret1
		turretModel[1] = new ModelRendererTurbo(this,  400,  100, textureX, textureY); // Turret2
		turretModel[2] = new ModelRendererTurbo(this,  400,  160, textureX, textureY); // Turret3
		turretModel[3] = new ModelRendererTurbo(this,  400,  200, textureX, textureY); // Turret4
		turretModel[4] = new ModelRendererTurbo(this,  400,  230, textureX, textureY); // Turret5

		turretModel[0].addShapeBox(0F, 0F, 0F, 25, 22, 32, 0F, 0F, 0F, 6F, 0F, -5F, -6F, 0F, -5F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 6F); //Test
		turretModel[0].setRotationPoint(-5F, -42F, -16F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 18, 22, 32, 0F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -7F); //Test
		turretModel[1].setRotationPoint(-23F, -42F, -16F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 8, 8, 16, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); //Test
		turretModel[2].setRotationPoint(-31F, -41F, -8F);

		turretModel[3].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Turret4
		turretModel[3].setRotationPoint(-18F, -43F, -4F);

		turretModel[4].addShapeBox(0F, -6F, -10F, 4, 12, 20, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); //Test
		turretModel[4].setRotationPoint(19F, -28F, 0F);



// Barrel
		barrelModel = new ModelRendererTurbo[3];
		barrelModel[0] = new ModelRendererTurbo(this,  400,  300, textureX, textureY); // Barrel1
		barrelModel[1] = new ModelRendererTurbo(this,  400,  340, textureX, textureY); // Barrel2
		barrelModel[2] = new ModelRendererTurbo(this,  400,  370, textureX, textureY); // Barrel3

		barrelModel[0].addBox(0F, -4F, -4F, 7, 8, 8, 0F); // Barrel1
		barrelModel[0].setRotationPoint(20F, -28F, 0F);

		barrelModel[1].addBox(7F, -2F, -2F, 38, 4, 4, 0F); // Barrel2
		barrelModel[1].setRotationPoint(20F, -28F, 0F);

		barrelModel[2].addBox(45F, -2.5F, -2.5F, 9, 5, 5, 0F); // Barrel3
		barrelModel[2].setRotationPoint(20F, -28F, 0F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[22];
		leftTrackModel[0] = new ModelRendererTurbo(this,  0,  780, textureX, textureY); // LeftTrack1
		leftTrackModel[1] = new ModelRendererTurbo(this,  0,  830, textureX, textureY); // LeftTrack2
		leftTrackModel[2] = new ModelRendererTurbo(this,  0,  850, textureX, textureY); // LeftTrack3
		leftTrackModel[3] = new ModelRendererTurbo(this,  0,  870, textureX, textureY); // LeftTrack4
		leftTrackModel[4] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // LeftTrack5
		leftTrackModel[5] = new ModelRendererTurbo(this,  0,  920, textureX, textureY); // LeftTrack6
		leftTrackModel[6] = new ModelRendererTurbo(this,  0,  950, textureX, textureY); // LeftTrack7
		leftTrackModel[7] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack8
		leftTrackModel[8] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // LeftTrack9
		leftTrackModel[9] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack10
		leftTrackModel[10] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack11
		leftTrackModel[11] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // LeftTrack12
		leftTrackModel[12] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack13
		leftTrackModel[13] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack14
		leftTrackModel[14] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // LeftTrack15
		leftTrackModel[15] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack16
		leftTrackModel[16] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack17
		leftTrackModel[17] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // LeftTrack18
		leftTrackModel[18] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack19
		leftTrackModel[19] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack20
		leftTrackModel[20] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // LeftTrack21
		leftTrackModel[21] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // LeftTrack22

		leftTrackModel[0].addBox(-2F, 0F, 0F, 2, 25, 14, 0F); // LeftTrack1
		leftTrackModel[0].setRotationPoint(76F, -1F, 16F);
		leftTrackModel[0].rotateAngleZ = -0.6632251F;

		leftTrackModel[1].addBox(-2F, 0F, 0.1F, 105, 2, 14, 0F); // LeftTrack2
		leftTrackModel[1].setRotationPoint(-42.3F, 16.6F, 16F);

		leftTrackModel[2].addBox(-28F, -2F, 0F, 28, 2, 14, 0F); // LeftTrack3
		leftTrackModel[2].setRotationPoint(-44.3F, 18.6F, 16F);
		leftTrackModel[2].rotateAngleZ = -0.6632251F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 113, 7, 10, 0F, 6F, 0F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[3].setRotationPoint(-51F, 2F, 19F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 9, 3, 14, 0F); // LeftTrack5
		leftTrackModel[4].setRotationPoint(-49F, 3F, 16F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 9, 3, 14, 0F); // LeftTrack6
		leftTrackModel[5].setRotationPoint(-49F, 6F, 16F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 9, 3, 14, 0F); // LeftTrack7
		leftTrackModel[6].setRotationPoint(-49F, 9F, 16F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[7].setRotationPoint(-34F, 5F, 16F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 12, 4, 14, 0F); // LeftTrack9
		leftTrackModel[8].setRotationPoint(-34F, 9F, 16F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[9].setRotationPoint(-34F, 13F, 16F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[10].setRotationPoint(-14F, 5F, 16F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 12, 4, 14, 0F); // LeftTrack12
		leftTrackModel[11].setRotationPoint(-14F, 9F, 16F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[12].setRotationPoint(-14F, 13F, 16F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[13].setRotationPoint(6F, 5F, 16F);

		leftTrackModel[14].addBox(0F, 0F, 0F, 12, 4, 14, 0F); // LeftTrack15
		leftTrackModel[14].setRotationPoint(6F, 9F, 16F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[15].setRotationPoint(6F, 13F, 16F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[16].setRotationPoint(26F, 5F, 16F);

		leftTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 14, 0F); // LeftTrack18
		leftTrackModel[17].setRotationPoint(26F, 9F, 16F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[18].setRotationPoint(26F, 13F, 16F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[19].setRotationPoint(46F, 5F, 16F);

		leftTrackModel[20].addBox(0F, 0F, 0F, 12, 4, 14, 0F); // LeftTrack21
		leftTrackModel[20].setRotationPoint(46F, 9F, 16F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[21].setRotationPoint(46F, 13F, 16F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[22];
		rightTrackModel[0] = new ModelRendererTurbo(this,  0,  780, textureX, textureY); // RightTrack1
		rightTrackModel[1] = new ModelRendererTurbo(this,  0,  830, textureX, textureY); // RightTrack2
		rightTrackModel[2] = new ModelRendererTurbo(this,  0,  850, textureX, textureY); // RightTrack3
		rightTrackModel[3] = new ModelRendererTurbo(this,  0,  870, textureX, textureY); // RightTrack4
		rightTrackModel[4] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // RightTrack5
		rightTrackModel[5] = new ModelRendererTurbo(this,  0,  920, textureX, textureY); // RightTrack6
		rightTrackModel[6] = new ModelRendererTurbo(this,  0,  950, textureX, textureY); // RightTrack7
		rightTrackModel[7] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack8
		rightTrackModel[8] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // RightTrack9
		rightTrackModel[9] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack10
		rightTrackModel[10] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack11
		rightTrackModel[11] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // RightTrack12
		rightTrackModel[12] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack13
		rightTrackModel[13] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack14
		rightTrackModel[14] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // RightTrack15
		rightTrackModel[15] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack16
		rightTrackModel[16] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack17
		rightTrackModel[17] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // RightTrack18
		rightTrackModel[18] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack19
		rightTrackModel[19] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack20
		rightTrackModel[20] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // RightTrack21
		rightTrackModel[21] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // RightTrack22

		rightTrackModel[0].addBox(-2F, 0F, -14F, 2, 25, 14, 0F); // RightTrack1
		rightTrackModel[0].setRotationPoint(76F, -1F, -16F);
		rightTrackModel[0].rotateAngleZ = -0.6632251F;

		rightTrackModel[1].addBox(-2F, 0F, -14.1F, 105, 2, 14, 0F); // RightTrack2
		rightTrackModel[1].setRotationPoint(-42.3F, 16.6F, -16F);

		rightTrackModel[2].addBox(-28F, -2F, -14F, 28, 2, 14, 0F); // RightTrack3
		rightTrackModel[2].setRotationPoint(-44.3F, 18.6F, -16F);
		rightTrackModel[2].rotateAngleZ = -0.6632251F;

		rightTrackModel[3].addShapeBox(0F, 0F, -6F, 113, 7, 10, 0F, 6F, 0F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[3].setRotationPoint(-51F, 2F, -23F);

		rightTrackModel[4].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // RightTrack5
		rightTrackModel[4].setRotationPoint(-49F, 3F, -16F);

		rightTrackModel[5].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // RightTrack6
		rightTrackModel[5].setRotationPoint(-49F, 6F, -16F);

		rightTrackModel[6].addBox(0F, 0F, -14F, 9, 3, 14, 0F); // RightTrack7
		rightTrackModel[6].setRotationPoint(-49F, 9F, -16F);

		rightTrackModel[7].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[7].setRotationPoint(-34F, 5F, -16F);

		rightTrackModel[8].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // RightTrack9
		rightTrackModel[8].setRotationPoint(-34F, 9F, -16F);

		rightTrackModel[9].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[9].setRotationPoint(-34F, 13F, -16F);

		rightTrackModel[10].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[10].setRotationPoint(-14F, 5F, -16F);

		rightTrackModel[11].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // RightTrack12
		rightTrackModel[11].setRotationPoint(-14F, 9F, -16F);

		rightTrackModel[12].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[12].setRotationPoint(-14F, 13F, -16F);

		rightTrackModel[13].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[13].setRotationPoint(6F, 5F, -16F);

		rightTrackModel[14].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // RightTrack15
		rightTrackModel[14].setRotationPoint(6F, 9F, -16F);

		rightTrackModel[15].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[15].setRotationPoint(6F, 13F, -16F);

		rightTrackModel[16].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[16].setRotationPoint(26F, 5F, -16F);

		rightTrackModel[17].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // RightTrack18
		rightTrackModel[17].setRotationPoint(26F, 9F, -16F);

		rightTrackModel[18].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[18].setRotationPoint(26F, 13F, -16F);

		rightTrackModel[19].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[19].setRotationPoint(46F, 5F, -16F);

		rightTrackModel[20].addBox(0F, 0F, -14F, 12, 4, 14, 0F); // RightTrack21
		rightTrackModel[20].setRotationPoint(46F, 9F, -16F);

		rightTrackModel[21].addShapeBox(0F, 0F, -14F, 12, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[21].setRotationPoint(46F, 13F, -16F);


		translateAll(0F, -13F, 0F);


		flipAll();
	}
}