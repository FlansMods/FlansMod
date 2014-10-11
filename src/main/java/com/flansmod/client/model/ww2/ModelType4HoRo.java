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

public class ModelType4HoRo extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelType4HoRo()
	{

// Body
		bodyModel = new ModelRendererTurbo[40];
		bodyModel[0] = new ModelRendererTurbo(this,  50,  300, textureX, textureY); // CR.MainBody
		bodyModel[1] = new ModelRendererTurbo(this,  50,  350, textureX, textureY); // CR.Beak
		bodyModel[2] = new ModelRendererTurbo(this,  50,  410, textureX, textureY); // CR.BeakSupport
		bodyModel[3] = new ModelRendererTurbo(this,  50,  460, textureX, textureY); // CR.FrontArmorPlateBottom
		bodyModel[4] = new ModelRendererTurbo(this,  50,  510, textureX, textureY); // CR.FrontArmorPlateRight
		bodyModel[5] = new ModelRendererTurbo(this,  100,  510, textureX, textureY); // CR.FrontArmorPlateLeft
		bodyModel[6] = new ModelRendererTurbo(this,  50,  570, textureX, textureY); // CR.FrontArmorPlateRight
		bodyModel[7] = new ModelRendererTurbo(this,  50,  610, textureX, textureY); // CR.Roof
		bodyModel[8] = new ModelRendererTurbo(this,  50,  660, textureX, textureY); // CR.EngineBlock
		bodyModel[9] = new ModelRendererTurbo(this,  50,  720, textureX, textureY); // CR.BackCorner
		bodyModel[10] = new ModelRendererTurbo(this,  50,  770, textureX, textureY); // CR.TrackWeldRight
		bodyModel[11] = new ModelRendererTurbo(this,  50,  770, textureX, textureY); // CR.TrackWeldLeft
		bodyModel[12] = new ModelRendererTurbo(this,  50,  800, textureX, textureY); // CR.AmmoSquare?
		bodyModel[13] = new ModelRendererTurbo(this,  150,  800, textureX, textureY); // CR.AmmoSquarePegRight
		bodyModel[14] = new ModelRendererTurbo(this,  150,  800, textureX, textureY); // CR.AmmoSquarePegLeft
		bodyModel[15] = new ModelRendererTurbo(this,  50,  850, textureX, textureY); // CR.RightTrackTopRight
		bodyModel[16] = new ModelRendererTurbo(this,  50,  850, textureX, textureY); // CR.RightTrackTopLeft
		bodyModel[17] = new ModelRendererTurbo(this,  50,  870, textureX, textureY); // CR.ArmorRightSide
		bodyModel[18] = new ModelRendererTurbo(this,  100,  870, textureX, textureY); // CR.ArmorRightSideBack
		bodyModel[19] = new ModelRendererTurbo(this,  50,  870, textureX, textureY); // CR.ArmorLeftSide
		bodyModel[20] = new ModelRendererTurbo(this,  100,  870, textureX, textureY); // CR.ArmorLeftSideBack
		bodyModel[21] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // CR.ArmorRightPanel
		bodyModel[22] = new ModelRendererTurbo(this,  0,  450, textureX, textureY); // CR.ArmorLeftPanel
		bodyModel[23] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // CR.GunPegRight
		bodyModel[24] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // CR.GunPegLeft
		bodyModel[25] = new ModelRendererTurbo(this,  0,  600, textureX, textureY); // CR.GunAxel
		bodyModel[26] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // CR.RightWheelfront
		bodyModel[27] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // CR.RightWheelback
		bodyModel[28] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelrightfront
		bodyModel[29] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelrightcenter
		bodyModel[30] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelrightback
		bodyModel[31] = new ModelRendererTurbo(this,  0,  910, textureX, textureY); // CR.RightTubethingy
		bodyModel[32] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // CR.LeftWheelfront
		bodyModel[33] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // CR.LeftWheelback
		bodyModel[34] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelleftfront
		bodyModel[35] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelleftcenter
		bodyModel[36] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // CR.miniwheelleftback
		bodyModel[37] = new ModelRendererTurbo(this,  0,  910, textureX, textureY); // CR.LeftTubethingy
		bodyModel[38] = new ModelRendererTurbo(this,  0,  940, textureX, textureY); // CR.SideThingRight
		bodyModel[39] = new ModelRendererTurbo(this,  0,  940, textureX, textureY); // CR.SideThingLeft

		bodyModel[0].addBox(0F, 0F, 0F, 77, 12, 30, 0); // CR.MainBody
		bodyModel[0].setRotationPoint(-40F, -8F, -15F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 14, 30, 0F); // CR.Beak
		bodyModel[1].setRotationPoint(40F, -12F, -15F);
		bodyModel[1].rotateAngleZ = -0.6632251F;

		bodyModel[2].addBox(0F, 0F, 0F, 16, 10, 30, 0F); // CR.BeakSupport
		bodyModel[2].setRotationPoint(24F, -12.5F, -15F);
		bodyModel[2].rotateAngleZ = -0.03490658F;

		bodyModel[3].addBox(0F, 0F, 0F, 1, 10, 30, 0F); // CR.FrontArmorPlateBottom
		bodyModel[3].setRotationPoint(26F, -7F, -15F);
		bodyModel[3].rotateAngleZ = -2.879793F;

		bodyModel[4].addBox(0F, 0F, 0F, 0, 24, 7, 0F); // CR.FrontArmorPlateRight
		bodyModel[4].setRotationPoint(26F, -7F, 8F);
		bodyModel[4].rotateAngleZ = -2.879793F;

		bodyModel[5].addBox(0F, 0F, 0F, 0, 24, 16, 0F); // CR.FrontArmorPlateLeft
		bodyModel[5].setRotationPoint(26F, -7F, -15F);
		bodyModel[5].rotateAngleZ = -2.879793F;

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 30, 0F); // CR.FrontArmorPlateRight
		bodyModel[6].setRotationPoint(18.5F, -30F, -15F);
		bodyModel[6].rotateAngleZ = 0.2617994F;

		bodyModel[7].addBox(0F, 0F, 0F, 13, 1, 30, 0F); // CR.Roof
		bodyModel[7].setRotationPoint(6F, -30.5F, -15F);

		bodyModel[8].addBox(0F, 0F, 0F, 22, 8, 30, 0F); // CR.EngineBlock
		bodyModel[8].setRotationPoint(-32F, -16F, -15F);

		bodyModel[9].addBox(0F, 0F, 0F, 6, 11, 30, 0F); // CR.BackCorner
		bodyModel[9].setRotationPoint(-32F, -16F, -15F);
		bodyModel[9].rotateAngleZ = -0.7853982F;

		bodyModel[10].addBox(0F, 0F, 0F, 62, 6, 0, 0F); // CR.TrackWeldRight
		bodyModel[10].setRotationPoint(-40F, -14F, 15F);

		bodyModel[11].addBox(0F, 0F, 0F, 62, 6, 0, 0F); // CR.TrackWeldLeft
		bodyModel[11].setRotationPoint(-40F, -14F, -15F);

		bodyModel[12].addBox(0F, 0F, 0F, 16, 4, 28, 0F); // CR.AmmoSquare?
		bodyModel[12].setRotationPoint(-27F, -21F, -14F);
		bodyModel[12].rotateAngleZ = 0.1047198F;

		bodyModel[13].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // CR.AmmoSquarePegRight
		bodyModel[13].setRotationPoint(-18F, -20F, 8F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // CR.AmmoSquarePegLeft
		bodyModel[14].setRotationPoint(-18F, -20F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 66, 1, 7, 0F); // CR.RightTrackTopRight
		bodyModel[15].setRotationPoint(-44F, -14F, 15F);

		bodyModel[16].addBox(0F, 0F, 0F, 66, 1, 7, 0F); // CR.RightTrackTopLeft
		bodyModel[16].setRotationPoint(-44F, -14F, -22F);

		bodyModel[17].addBox(0F, 0F, 0F, 10, 24, 1, 0F); // CR.ArmorRightSide
		bodyModel[17].setRotationPoint(26F, -7F, 14F);
		bodyModel[17].rotateAngleZ = -2.879793F;

		bodyModel[18].addBox(0F, 0F, 0F, 10, 24, 1, 0F); // CR.ArmorRightSideBack
		bodyModel[18].setRotationPoint(9F, -30F, 14F);

		bodyModel[19].addBox(0F, 0F, 0F, 10, 24, 1, 0F); // CR.ArmorLeftSide
		bodyModel[19].setRotationPoint(26F, -7F, -15F);
		bodyModel[19].rotateAngleZ = -2.879793F;

		bodyModel[20].addBox(0F, 0F, 0F, 10, 24, 1, 0F); // CR.ArmorLeftSideBack
		bodyModel[20].setRotationPoint(9F, -30F, -15F);

		bodyModel[21].addBox(0F, 0F, 0F, 10, 17, 3, 0F); // CR.ArmorRightPanel
		bodyModel[21].setRotationPoint(6F, -30.5F, 15F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 17, 3, 0F); // CR.ArmorLeftPanel
		bodyModel[22].setRotationPoint(6F, -30.5F, -18F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 16, 1, 0); // CR.GunPegRight
		bodyModel[23].setRotationPoint(10F, -22F, 7.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 16, 1, 0); // CR.GunPegLeft
		bodyModel[24].setRotationPoint(10F, -22F, 0.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // CR.GunAxel
		bodyModel[25].setRotationPoint(10F, -22F, 1F);

		bodyModel[26].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // CR.RightWheelfront
		bodyModel[26].setRotationPoint(36F, -11F, 15F);

		bodyModel[27].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // CR.RightWheelback
		bodyModel[27].setRotationPoint(-42F, -11F, 15F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelrightfront
		bodyModel[28].setRotationPoint(24F, -11F, 15F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelrightcenter
		bodyModel[29].setRotationPoint(-1F, -11F, 15F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelrightback
		bodyModel[30].setRotationPoint(-26F, -11F, 15F);

		bodyModel[31].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // CR.RightTubethingy
		bodyModel[31].setRotationPoint(-14F, -4F, 15F);

		bodyModel[32].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // CR.LeftWheelfront
		bodyModel[32].setRotationPoint(36F, -11F, -21F);

		bodyModel[33].addBox(0F, 0F, 0F, 9, 9, 6, 0F); // CR.LeftWheelback
		bodyModel[33].setRotationPoint(-42F, -11F, -21F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelleftfront
		bodyModel[34].setRotationPoint(24F, -11F, -19F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelleftcenter
		bodyModel[35].setRotationPoint(-1F, -11F, -19F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // CR.miniwheelleftback
		bodyModel[36].setRotationPoint(-26F, -11F, -19F);

		bodyModel[37].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // CR.LeftTubethingy
		bodyModel[37].setRotationPoint(-14F, -4F, -18F);

		bodyModel[38].addBox(0F, 0F, 0F, 27, 4, 5, 0F); // CR.SideThingRight
		bodyModel[38].setRotationPoint(-11F, -18F, 15F);

		bodyModel[39].addBox(0F, 0F, 0F, 27, 4, 5, 0F); // CR.SideThingLeft
		bodyModel[39].setRotationPoint(-11F, -18F, -20F);



// Barrel
		barrelModel = new ModelRendererTurbo[3];
		barrelModel[0] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // BL.MainCannon
		barrelModel[1] = new ModelRendererTurbo(this,  250,  430, textureX, textureY); // BL.BottomThing
		barrelModel[2] = new ModelRendererTurbo(this,  250,  450, textureX, textureY); // BL.WormBrainthing

		barrelModel[0].addBox(-9F, -4.5F, -3F, 36, 5, 5, 0F); // BL.MainCannon
		barrelModel[0].setRotationPoint(10.5F, -19.5F, 5F);

		barrelModel[1].addBox(-7F, 1F, -2.5F, 30, 1, 4, 0F); // BL.BottomThing
		barrelModel[1].setRotationPoint(10.5F, -19.5F, 5F);

		barrelModel[2].addBox(19F, -5F, -3.5F, 4, 6, 6, 0F); // BL.WormBrainthing
		barrelModel[2].setRotationPoint(10.5F, -19.5F, 5F);



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
		leftTrackModel[0].setRotationPoint(28F, 2F, -21F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel2
		leftTrackModel[1].setRotationPoint(17F, 2F, -21F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel3
		leftTrackModel[2].setRotationPoint(3F, 2F, -21F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel4
		leftTrackModel[3].setRotationPoint(-8F, 2F, -21F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel5
		leftTrackModel[4].setRotationPoint(-22F, 2F, -21F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // LT.Wheel6
		leftTrackModel[5].setRotationPoint(-33F, 2F, -21F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 88, 1, 6, 0F); // LT.Top
		leftTrackModel[6].setRotationPoint(-42.5F, -12F, -21F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // LT.Front
		leftTrackModel[7].setRotationPoint(45F, -11.5F, -21F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // LT.Bottom
		leftTrackModel[8].setRotationPoint(-33.5F, 9F, -21F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // LT.Back
		leftTrackModel[9].setRotationPoint(-43F, -11.5F, -21F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // LT.Frontcorner
		leftTrackModel[10].setRotationPoint(45F, -2.5F, -21F);
		leftTrackModel[10].rotateAngleZ = -0.6632251F;

		leftTrackModel[11].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // LT.Backcorner
		leftTrackModel[11].setRotationPoint(-43F, -2F, -21F);
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
		rightTrackModel[0].setRotationPoint(28F, 2F, 15F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel2
		rightTrackModel[1].setRotationPoint(17F, 2F, 15F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel3
		rightTrackModel[2].setRotationPoint(3F, 2F, 15F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel4
		rightTrackModel[3].setRotationPoint(-8F, 2F, 15F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel5
		rightTrackModel[4].setRotationPoint(-22F, 2F, 15F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // RT.Wheel6
		rightTrackModel[5].setRotationPoint(-33F, 2F, 15F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 88, 1, 6, 0F); // RT.Top
		rightTrackModel[6].setRotationPoint(-42.5F, -12F, 15F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // RT.Front
		rightTrackModel[7].setRotationPoint(45F, -11.5F, 15F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 70, 1, 6, 0F); // RT.Bottom
		rightTrackModel[8].setRotationPoint(-33.5F, 9F, 15F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // RT.Back
		rightTrackModel[9].setRotationPoint(-43F, -11.5F, 15F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // RT.Frontcorner
		rightTrackModel[10].setRotationPoint(45F, -2.5F, 15F);
		rightTrackModel[10].rotateAngleZ = -0.6632251F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // RT.Backcorner
		rightTrackModel[11].setRotationPoint(-43F, -2F, 15F);
		rightTrackModel[11].rotateAngleZ = 0.6632251F;


		translateAll(0, 0, 0);


		flipAll();
	}
}