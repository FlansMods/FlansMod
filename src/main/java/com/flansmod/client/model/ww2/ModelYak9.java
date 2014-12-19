//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelYak9 extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public ModelYak9()
	{

// Nose
		noseModel = new ModelRendererTurbo[8];
		noseModel[0] = new ModelRendererTurbo(this,  35,  461, textureX, textureY); // NS.Nose
		noseModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // NS.Core/NoseTransitionTop
		noseModel[2] = new ModelRendererTurbo(this,  280,  440, textureX, textureY); // NS.Core/NoseTransitionBottom
		noseModel[3] = new ModelRendererTurbo(this,  280,  400, textureX, textureY); // NS.NoseAirIntake
		noseModel[4] = new ModelRendererTurbo(this,  280,  350, textureX, textureY); // NS.EngineThingiesLeft
		noseModel[5] = new ModelRendererTurbo(this,  280,  350, textureX, textureY); // NS.EngineThingiesRight
		noseModel[6] = new ModelRendererTurbo(this,  280,  380, textureX, textureY); // NS.Cannon
		noseModel[7] = new ModelRendererTurbo(this,  0,  480, textureX, textureY); // NS.Cannon

		noseModel[0].addBox(0F, 0F, 0F, 14, 10, 12, 0F); // NS.Nose
		noseModel[0].setRotationPoint(-65F, -22.5F, -6F);

		noseModel[1].addBox(0F, 0F, 0F, 16, 12, 14, 0F); // NS.Core/NoseTransitionTop
		noseModel[1].setRotationPoint(-52F, -22.5F, -7F);
		noseModel[1].rotateAngleZ = 0.05235988F;

		noseModel[2].addBox(0F, -6F, 0F, 26, 7, 12, 0F); // NS.Core/NoseTransitionBottom
		noseModel[2].setRotationPoint(-61F, -13F, -6F);
		noseModel[2].rotateAngleZ = -0.2094395F;

		noseModel[3].addBox(0F, 0F, 0F, 18, 4, 8, 0F); // NS.NoseAirIntake
		noseModel[3].setRotationPoint(-56F, -11F, -4F);

		noseModel[4].addBox(0F, 0F, -1.5F, 20, 2, 3, 0F); // NS.EngineThingiesLeft
		noseModel[4].setRotationPoint(-55F, -20F, 6F);
		noseModel[4].rotateAngleY = 0.06981317F;

		noseModel[5].addBox(0F, 0F, -1.5F, 20, 2, 3, 0F); // NS.EngineThingiesRight
		noseModel[5].setRotationPoint(-55F, -20F, -6F);
		noseModel[5].rotateAngleY = -0.06981317F;

		noseModel[6].addBox(0F, -0.5F, -0.5F, 10, 1, 1, 0F); // NS.Cannon
		noseModel[6].setRotationPoint(-74F, -18F, 0F);
		
		noseModel[7].addBox(-2F, -3.5F, -3.5F, 7, 7, 7, 0F); // NS.cone
		noseModel[7].setRotationPoint(-70F, -18F, 0F);
		
		
		propellerModels = new ModelRendererTurbo[1][3]; //1 propeller in 3 parts
        propellerModels[0][0] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); //Propeller 0 - Blade 0 : 192, 12 is the texture origin
        propellerModels[0][1] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); //Propeller 0 - Blade 1
        propellerModels[0][2] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); //Propeller 0 - Blade 2		
        propellerModels[0][0].addBox(0F, 0F, -1F, 1, 21, 2, 0F);		//Propeller Blades
        propellerModels[0][1].addBox(0F, 0F, -1F, 1, 21, 2, 0F);		//They will all be the same
        propellerModels[0][2].addBox(0F, 0F, -1F, 1, 21, 2, 0F);		
        propellerModels[0][0].setRotationPoint(-69F, -18F, 0F);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(-69F, -18F, 0F);	
        propellerModels[0][2].setRotationPoint(-69F, -18F, 0F);	
		



// Body
		bodyModel = new ModelRendererTurbo[24];
		bodyModel[0] = new ModelRendererTurbo(this,  280,  470, textureX, textureY); // CR.CoreFront
		bodyModel[1] = new ModelRendererTurbo(this,  450,  450, textureX, textureY); // CR.Intake
		bodyModel[2] = new ModelRendererTurbo(this,  450,  415, textureX, textureY); // CR.ControlPanel
		bodyModel[3] = new ModelRendererTurbo(this,  440,  490, textureX, textureY); // CR.FrontLeftSideTube
		bodyModel[4] = new ModelRendererTurbo(this,  440,  490, textureX, textureY); // CR.FrontRightSideTube
		bodyModel[5] = new ModelRendererTurbo(this,  420,  460, textureX, textureY); // CR.FrontTopTube
		bodyModel[6] = new ModelRendererTurbo(this,  430,  490, textureX, textureY); // CR.FrontLeftTube
		bodyModel[7] = new ModelRendererTurbo(this,  430,  490, textureX, textureY); // CR.FrontRightTube
		bodyModel[8] = new ModelRendererTurbo(this,  440,  490, textureX, textureY); // CR.BackRightSideTube
		bodyModel[9] = new ModelRendererTurbo(this,  440,  490, textureX, textureY); // CR.BackLeftSideTube
		bodyModel[10] = new ModelRendererTurbo(this,  420,  480, textureX, textureY); // CR.RightTopSideTube
		bodyModel[11] = new ModelRendererTurbo(this,  420,  480, textureX, textureY); // CR.LeftSideTube
		bodyModel[12] = new ModelRendererTurbo(this,  410,  445, textureX, textureY); // CR.BackRightTube
		bodyModel[13] = new ModelRendererTurbo(this,  410,  445, textureX, textureY); // CR.BackLeftTube
		bodyModel[14] = new ModelRendererTurbo(this,  420,  460, textureX, textureY); // CR.BackTopTube
		bodyModel[15] = new ModelRendererTurbo(this,  450,  370, textureX, textureY); // CR.CoreBack
		bodyModel[16] = new ModelRendererTurbo(this,  430,  340, textureX, textureY); // CR.CoreFloor
		bodyModel[17] = new ModelRendererTurbo(this,  460,  310, textureX, textureY); // CR.CoreWallLeft
		bodyModel[18] = new ModelRendererTurbo(this,  390,  500, textureX, textureY); // CR.UnderJoystick
		bodyModel[19] = new ModelRendererTurbo(this,  410,  370, textureX, textureY); // CR.ChairBottom
		bodyModel[20] = new ModelRendererTurbo(this,  420,  390, textureX, textureY); // CR.ChairTop
		bodyModel[21] = new ModelRendererTurbo(this,  460,  310, textureX, textureY); // CR.CoreWallRight
		bodyModel[22] = new ModelRendererTurbo(this,  430,  420, textureX, textureY); // CR.Antenna
		bodyModel[23] = new ModelRendererTurbo(this,  80,  200, textureX, textureY); // CR.MagicSquare

		bodyModel[0].addBox(0F, 0F, 0F, 12, 17, 16, 0F); // CR.CoreFront
		bodyModel[0].setRotationPoint(-36F, -23.5F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 5, 10, 0F); // CR.Intake
		bodyModel[1].setRotationPoint(-22F, -7F, -5F);
		bodyModel[1].rotateAngleZ = 0.03490658F;

		bodyModel[2].addBox(0F, 0F, 0F, 12, 8, 12, 0F); // CR.ControlPanel
		bodyModel[2].setRotationPoint(-35F, -22F, -6F);
		bodyModel[2].rotateAngleZ = 0.1745329F;

		bodyModel[3].addBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F); // CR.FrontLeftSideTube
		bodyModel[3].setRotationPoint(-18.5F, -29F, 3.8F);
		bodyModel[3].rotateAngleX = 0.2443461F;

		bodyModel[4].addBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F); // CR.FrontRightSideTube
		bodyModel[4].setRotationPoint(-18.5F, -29F, -3.8F);
		bodyModel[4].rotateAngleX = -0.2443461F;

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // CR.FrontTopTube
		bodyModel[5].setRotationPoint(-18F, -29.3F, -4F);
		bodyModel[5].rotateAngleZ = -1.396263F;

		bodyModel[6].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // CR.FrontLeftTube
		bodyModel[6].setRotationPoint(-18.5F, -28.7F, 3F);
		bodyModel[6].rotateAngleZ = -0.9773844F;

		bodyModel[7].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // CR.FrontRightTube
		bodyModel[7].setRotationPoint(-18.5F, -28.7F, -3F);
		bodyModel[7].rotateAngleZ = -0.9773844F;

		bodyModel[8].addBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F); // CR.BackRightSideTube
		bodyModel[8].setRotationPoint(-9F, -28.7F, -3.8F);
		bodyModel[8].rotateAngleX = -0.2443461F;

		bodyModel[9].addBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F); // CR.BackLeftSideTube
		bodyModel[9].setRotationPoint(-9F, -29F, 3.8F);
		bodyModel[9].rotateAngleX = 0.2443461F;

		bodyModel[10].addBox(-0.5F, -0.5F, -0.5F, 10, 1, 1, 0F); // CR.RightTopSideTube
		bodyModel[10].setRotationPoint(-18F, -28.4F, -3.8F);
		bodyModel[10].rotateAngleX = -0.6632251F;

		bodyModel[11].addBox(-0.5F, -0.5F, -0.5F, 10, 1, 1, 0F); // CR.LeftSideTube
		bodyModel[11].setRotationPoint(-18F, -28.4F, 3.9F);
		bodyModel[11].rotateAngleX = 0.6632251F;

		bodyModel[12].addBox(-0.5F, -0.5F, -0.5F, 16, 1, 1, 0F); // CR.BackRightTube
		bodyModel[12].setRotationPoint(-9F, -28.2F, -3.8F);
		bodyModel[12].rotateAngleY = 0.1745329F;
		bodyModel[12].rotateAngleZ = -0.3839724F;

		bodyModel[13].addBox(-0.5F, -0.5F, -0.5F, 22, 1, 1, 0F); // CR.BackLeftTube
		bodyModel[13].setRotationPoint(-9F, -28.2F, 3.8F);
		bodyModel[13].rotateAngleY = -0.1745329F;
		bodyModel[13].rotateAngleZ = -0.3839724F;

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // CR.BackTopTube
		bodyModel[14].setRotationPoint(-9.5F, -28.2F, -4F);
		bodyModel[14].rotateAngleZ = 1.396263F;

		bodyModel[15].addBox(0F, 0F, 0F, 10, 17, 16, 0F); // CR.CoreBack
		bodyModel[15].setRotationPoint(-6F, -23.5F, -8F);

		bodyModel[16].addBox(0F, 0F, 0F, 18, 1, 16, 0F); // CR.CoreFloor
		bodyModel[16].setRotationPoint(-24F, -7.5F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 18, 17, 2, 0F); // CR.CoreWallLeft
		bodyModel[17].setRotationPoint(-24F, -23.5F, 6F);

		bodyModel[18].addBox(0F, 0F, -0.5F, 13, 1, 1, 0F); // CR.UnderJoystick
		bodyModel[18].setRotationPoint(-18.5F, -9F, 0F);

		bodyModel[19].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // CR.ChairBottom
		bodyModel[19].setRotationPoint(-16F, -12F, -3.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 10, 10, 0F); // CR.ChairTop
		bodyModel[20].setRotationPoint(-8.5F, -25F, -5F);
		bodyModel[20].rotateAngleZ = -0.06981317F;

		bodyModel[21].addBox(0F, 0F, 0F, 18, 17, 2, 0F); // CR.CoreWallRight
		bodyModel[21].setRotationPoint(-24F, -23.5F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // CR.Antenna
		bodyModel[22].setRotationPoint(8F, -35F, -0.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // CR.MagicSquare
		bodyModel[23].setRotationPoint(-5F, -25F, -2F);



// Bay
		bayModel = new ModelRendererTurbo[5];
		bayModel[0] = new ModelRendererTurbo(this,  300,  150, textureX, textureY); // BY.BayRight
		bayModel[1] = new ModelRendererTurbo(this,  300,  180, textureX, textureY); // BY.BayLeft
		bayModel[2] = new ModelRendererTurbo(this,  300,  210, textureX, textureY); // BY.Core/Bayconnector
		bayModel[3] = new ModelRendererTurbo(this,  340,  210, textureX, textureY); // BY.BayBottom
		bayModel[4] = new ModelRendererTurbo(this,  425,  200, textureX, textureY); // BY.WheelHolder

		bayModel[0].addBox(0F, 0F, -4F, 54, 13, 8, 0F); // BY.BayRight
		bayModel[0].setRotationPoint(2F, -23F, -4F);
		bayModel[0].rotateAngleY = 0.06981317F;

		bayModel[1].addBox(0F, 0F, -4F, 54, 13, 8, 0F); // BY.BayLeft
		bayModel[1].setRotationPoint(2F, -23F, 4F);
		bayModel[1].rotateAngleY = -0.06981317F;

		bayModel[2].addBox(0F, 0F, 0F, 12, 3, 6, 0F); // BY.Core/Bayconnector
		bayModel[2].setRotationPoint(3F, -23.5F, -3F);

		bayModel[3].addBox(0F, 0F, 0F, 48, 4, 8, 0F); // BY.BayBottom
		bayModel[3].setRotationPoint(3.5F, -10.4F, -4F);
		bayModel[3].rotateAngleZ = 0.07679449F;

		bayModel[4].addBox(-3F, -1F, 0F, 12, 4, 1, 0F); // BY.WheelHolder
		bayModel[4].setRotationPoint(46F, -9F, -0.5F);
		bayModel[4].rotateAngleZ = 0.1745329F;



// Tail
		tailModel = new ModelRendererTurbo[8];
		tailModel[0] = new ModelRendererTurbo(this,  180,  235, textureX, textureY); // TL.Dorsal/FlapCapital
		tailModel[1] = new ModelRendererTurbo(this,  180,  250, textureX, textureY); // TL.DorsalFinFront
		tailModel[2] = new ModelRendererTurbo(this,  180,  265, textureX, textureY); // TL.DorsalFiller1
		tailModel[3] = new ModelRendererTurbo(this,  180,  300, textureX, textureY); // TL.FinAngleLeft
		tailModel[4] = new ModelRendererTurbo(this,  180,  340, textureX, textureY); // TL.LeftFlapHinge
		tailModel[5] = new ModelRendererTurbo(this,  180,  300, textureX, textureY); // TL.FinAngleRight
		tailModel[6] = new ModelRendererTurbo(this,  180,  340, textureX, textureY); // TL.RightFlapHinge
		tailModel[7] = new ModelRendererTurbo(this,  180,  375, textureX, textureY); // TL.MiddleCoverUp

		tailModel[0].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // TL.Dorsal/FlapCapital
		tailModel[0].setRotationPoint(47F, -38F, -1F);

		tailModel[1].addBox(0F, 0F, 0F, 17, 4, 2, 0F); // TL.DorsalFinFront
		tailModel[1].setRotationPoint(43F, -20F, -1F);
		tailModel[1].rotateAngleZ = 1.396263F;

		tailModel[2].addBox(0F, 0F, 0F, 9, 14, 2, 0F); // TL.DorsalFiller1
		tailModel[2].setRotationPoint(47F, -34F, -1F);

		tailModel[3].addBox(0F, 0F, 0F, 5, 2, 24, 0F); // TL.FinAngleLeft
		tailModel[3].setRotationPoint(38F, -21F, 5F);
		tailModel[3].rotateAngleY = -0.3490658F;

		tailModel[4].addBox(0F, 0F, 0F, 7, 2, 24, 0F); // TL.LeftFlapHinge
		tailModel[4].setRotationPoint(46F, -21F, 4F);

		tailModel[5].addBox(0F, 0F, -24F, 5, 2, 24, 0F); // TL.FinAngleRight
		tailModel[5].setRotationPoint(38F, -21F, -5F);
		tailModel[5].rotateAngleY = 0.3490658F;

		tailModel[6].addBox(0F, 0F, 0F, 7, 2, 24, 0F); // TL.RightFlapHinge
		tailModel[6].setRotationPoint(46F, -21F, -28F);

		tailModel[7].addBox(0F, 0F, 0F, 5, 2, 26, 0F); // TL.MiddleCoverUp
		tailModel[7].setRotationPoint(42F, -21F, -13F);



// Left Wing
		leftWingModel = new ModelRendererTurbo[5];
		leftWingModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // LW.LeftWingMain
		leftWingModel[1] = new ModelRendererTurbo(this,  390,  0, textureX, textureY); // LW.LeftWingBackCenter
		leftWingModel[2] = new ModelRendererTurbo(this,  390,  20, textureX, textureY); // LW.LeftWingFlapSupport
		leftWingModel[3] = new ModelRendererTurbo(this,  390,  80, textureX, textureY); // LW.LeftWingOuterTip
		leftWingModel[4] = new ModelRendererTurbo(this,  20,  80, textureX, textureY); // LW.LeftWingForwards

		leftWingModel[0].addBox(0F, -1F, 0F, 20, 2, 68, 0F); // LW.LeftWingMain
		leftWingModel[0].setRotationPoint(-30F, -8F, 8F);
		leftWingModel[0].rotateAngleX = 0.06981317F;
		leftWingModel[0].rotateAngleY = -0.03490658F;

		leftWingModel[1].addBox(20F, -1F, -4F, 10, 2, 10, 0F); // LW.LeftWingBackCenter
		leftWingModel[1].setRotationPoint(-30F, -8F, 8F);
		leftWingModel[1].rotateAngleX = 0.06981317F;
		leftWingModel[1].rotateAngleY = 0.122173F;

		leftWingModel[2].addBox(20F, -1F, 6F, 8, 2, 42, 0F); // LW.LeftWingFlapSupport
		leftWingModel[2].setRotationPoint(-30F, -8F, 8F);
		leftWingModel[2].rotateAngleX = 0.06981317F;
		leftWingModel[2].rotateAngleY = 0.122173F;

		leftWingModel[3].addBox(20F, -1F, 48F, 10, 2, 16, 0F); // LW.LeftWingOuterTip
		leftWingModel[3].setRotationPoint(-30F, -8F, 8F);
		leftWingModel[3].rotateAngleX = 0.06981317F;
		leftWingModel[3].rotateAngleY = 0.122173F;

		leftWingModel[4].addBox(23F, -1F, 0F, 10, 2, 70, 0F); // LW.LeftWingForwards
		leftWingModel[4].setRotationPoint(-60F, -7.6F, 8F);
		leftWingModel[4].rotateAngleX = 0.06981317F;
		leftWingModel[4].rotateAngleY = -0.1396263F;



// Right Wing
		rightWingModel = new ModelRendererTurbo[5];
		rightWingModel[0] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // RW.RightWingMain
		rightWingModel[1] = new ModelRendererTurbo(this,  390,  0, textureX, textureY); // RW.RightWingBackCenter
		rightWingModel[2] = new ModelRendererTurbo(this,  390,  20, textureX, textureY); // RW.RightWingFlapSupport
		rightWingModel[3] = new ModelRendererTurbo(this,  390,  80, textureX, textureY); // RW.RightWingOuterTip
		rightWingModel[4] = new ModelRendererTurbo(this,  20,  80, textureX, textureY); // RW.RightWingForwards

		rightWingModel[0].addBox(0F, -1F, -68F, 20, 2, 68, 0F); // RW.RightWingMain
		rightWingModel[0].setRotationPoint(-30F, -8F, -8F);
		rightWingModel[0].rotateAngleX = -0.06981317F;
		rightWingModel[0].rotateAngleY = 0.03490658F;

		rightWingModel[1].addBox(20F, -1F, -6F, 10, 2, 10, 0F); // RW.RightWingBackCenter
		rightWingModel[1].setRotationPoint(-30F, -8F, -8F);
		rightWingModel[1].rotateAngleX = -0.06981317F;
		rightWingModel[1].rotateAngleY = -0.122173F;

		rightWingModel[2].addBox(20F, -1F, -48F, 8, 2, 42, 0F); // RW.RightWingFlapSupport
		rightWingModel[2].setRotationPoint(-30F, -8F, -8F);
		rightWingModel[2].rotateAngleX = -0.06981317F;
		rightWingModel[2].rotateAngleY = -0.122173F;

		rightWingModel[3].addBox(20F, -1F, -64F, 10, 2, 16, 0F); // RW.RightWingOuterTip
		rightWingModel[3].setRotationPoint(-30F, -8F, -8F);
		rightWingModel[3].rotateAngleX = -0.06981317F;
		rightWingModel[3].rotateAngleY = -0.122173F;

		rightWingModel[4].addBox(23F, -1F, -72F, 10, 2, 70, 0F); // RW.RightWingForwards
		rightWingModel[4].setRotationPoint(-60F, -7.6F, -8F);
		rightWingModel[4].rotateAngleX = -0.06981317F;
		rightWingModel[4].rotateAngleY = 0.1396263F;



// Yaw Flap
		yawFlapModel = new ModelRendererTurbo[4];
		yawFlapModel[0] = new ModelRendererTurbo(this,  420,  420, textureX, textureY); // YF.JoyStick
		yawFlapModel[1] = new ModelRendererTurbo(this,  410,  420, textureX, textureY); // YF.JoyStickGrip
		yawFlapModel[2] = new ModelRendererTurbo(this,  200,  480, textureX, textureY); // YF.TailYawFlap
		yawFlapModel[3] = new ModelRendererTurbo(this,  200,  460, textureX, textureY); // YF.TailYawFlapTop

		yawFlapModel[0].addBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F); // YF.JoyStick
		yawFlapModel[0].setRotationPoint(-18F, -19F, 0F);

		yawFlapModel[1].addBox(-1F, -0.5F, -0.5F, 1, 2, 1, 0F); // YF.JoyStickGrip
		yawFlapModel[1].setRotationPoint(-18F, -19F, 0F);

		yawFlapModel[2].addBox(0F, 0F, -1F, 8, 22, 2, 0F); // YF.TailYawFlap
		yawFlapModel[2].setRotationPoint(56F, -34F, 0F);

		yawFlapModel[3].addBox(-3F, -4F, 0F, 9, 4, 2, 0F); // YF.TailYawFlapTop
		yawFlapModel[3].setRotationPoint(56F, -34F, -1F);



// Pitch Flap Left
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // LF.LeftPedal
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // LF.LeftWingFlap
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this,  200,  430, textureX, textureY); // LF.LeftTailFlap

		pitchFlapLeftModel[0].addBox(0F, 0F, -2F, 2, 1, 4, 0F); // LF.LeftPedal
		pitchFlapLeftModel[0].setRotationPoint(-24F, -11F, -4F);
		pitchFlapLeftModel[0].rotateAngleZ = 0.1745329F;

		pitchFlapLeftModel[1].addBox(0F, -1F, -21F, 2, 1, 42, 0F); // LF.LeftWingFlap
		pitchFlapLeftModel[1].setRotationPoint(-5.5F, -9.5F, 38F);
		pitchFlapLeftModel[1].rotateAngleX = 0.06981317F;
		pitchFlapLeftModel[1].rotateAngleY = 0.122173F;

		pitchFlapLeftModel[2].addBox(0F, -0.5F, 0F, 6, 1, 22, 0F); // LF.LeftTailFlap
		pitchFlapLeftModel[2].setRotationPoint(53F, -20F, 5F);



// Pitch Flap Right
		pitchFlapRightModel = new ModelRendererTurbo[3];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // RF.RightPedal
		pitchFlapRightModel[1] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // RF.RightWingFlap
		pitchFlapRightModel[2] = new ModelRendererTurbo(this,  200,  430, textureX, textureY); // RF.RightTailFlap

		pitchFlapRightModel[0].addBox(0F, 0F, -2F, 2, 1, 4, 0F); // RF.RightPedal
		pitchFlapRightModel[0].setRotationPoint(-24F, -11F, 4F);
		pitchFlapRightModel[0].rotateAngleZ = 0.1745329F;

		pitchFlapRightModel[1].addBox(0F, -1F, -21F, 2, 1, 42, 0F); // RF.RightWingFlap
		pitchFlapRightModel[1].setRotationPoint(-5.5F, -9.5F, -38F);
		pitchFlapRightModel[1].rotateAngleX = -0.06981317F;
		pitchFlapRightModel[1].rotateAngleY = -0.122173F;

		pitchFlapRightModel[2].addBox(0F, -0.5F, 0F, 6, 1, 22, 0F); // RF.RightTailFlap
		pitchFlapRightModel[2].setRotationPoint(53F, -20F, -27F);



// Tail Wheel
		tailWheelModel = new ModelRendererTurbo[1];
		tailWheelModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // LGT.BackWheel

		tailWheelModel[0].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // LGT.BackWheel
		tailWheelModel[0].setRotationPoint(50F, -8F, -1F);



// Left Wing Wheel
		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // LGLW.Stick
		leftWingWheelModel[1] = new ModelRendererTurbo(this,  0,  345, textureX, textureY); // LGLW.Wheel

		leftWingWheelModel[0].addBox(0F, 0F, -1F, 3, 12, 2, 0F); // LGLW.Stick
		leftWingWheelModel[0].setRotationPoint(-27F, -8F, 22F);
		leftWingWheelModel[0].rotateAngleX = 0.03490658F;
		leftWingWheelModel[0].rotateAngleZ = -0.2617994F;

		leftWingWheelModel[1].addBox(-3F, 0F, -1.5F, 6, 6, 3, 0F); // LGLW.Wheel
		leftWingWheelModel[1].setRotationPoint(-28.5F, 4F, 22.5F);
		leftWingWheelModel[1].rotateAngleX = 0.03490658F;
		leftWingWheelModel[1].rotateAngleZ = -0.03490658F;



// Right Wing Wheel
		rightWingWheelModel = new ModelRendererTurbo[2];
		rightWingWheelModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // LGRW.Stick
		rightWingWheelModel[1] = new ModelRendererTurbo(this,  0,  345, textureX, textureY); // LGRW.Wheel

		rightWingWheelModel[0].addBox(0F, 0F, -1F, 3, 12, 2, 0F); // LGRW.Stick
		rightWingWheelModel[0].setRotationPoint(-27F, -8F, -22F);
		rightWingWheelModel[0].rotateAngleX = -0.03490658F;
		rightWingWheelModel[0].rotateAngleZ = -0.2617994F;

		rightWingWheelModel[1].addBox(-3F, 0F, -1.5F, 6, 6, 3, 0F); // LGRW.Wheel
		rightWingWheelModel[1].setRotationPoint(-28.5F, 4F, -22.5F);
		rightWingWheelModel[1].rotateAngleX = -0.03490658F;
		rightWingWheelModel[1].rotateAngleZ = -0.03490658F;

		
		

		translateAll(4, 10, 0);


		flipAll();
	}

	// Replace with your propeller function
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	
	}
}