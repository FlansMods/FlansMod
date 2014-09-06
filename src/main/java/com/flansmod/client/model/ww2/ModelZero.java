package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelZero extends ModelPlane
{
    public ModelZero()
    {
		int textureX = 512; //The x-size of the texture
		int textureY = 512;	//The y-size of the texture
		//Initializing Model
	
		//Creates each block with texture co-ordinates starting at the first two values. Second 2 values are the overall size of the texture
		//(Dont forget the crazy shapes you can make with it)
		
		//Body
		bodyModel = new ModelRendererTurbo[25];
		bodyModel[0] = new ModelRendererTurbo(this,  450,  470, textureX, textureY); // CR.CoreFront
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
		bodyModel[18] = new ModelRendererTurbo(this,  400,  490, textureX, textureY); // CR.GunBackRight
		bodyModel[19] = new ModelRendererTurbo(this,  400,  490, textureX, textureY); // CR.GunBackLeft
		bodyModel[20] = new ModelRendererTurbo(this,  390,  500, textureX, textureY); // CR.UnderJoystick
		bodyModel[21] = new ModelRendererTurbo(this,  410,  370, textureX, textureY); // CR.ChairBottom
		bodyModel[22] = new ModelRendererTurbo(this,  420,  390, textureX, textureY); // CR.ChairTop
		bodyModel[23] = new ModelRendererTurbo(this,  460,  310, textureX, textureY); // CR.CoreWallRight
		bodyModel[24] = new ModelRendererTurbo(this,  430,  420, textureX, textureY); // CR.Antenna

		bodyModel[0].addBox(0F, 0F, 0F, 12, 17, 16, 0F); // CR.CoreFront
		bodyModel[0].setRotationPoint(-36F, -23.5F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 13, 4, 6, 0F); // CR.Intake
		bodyModel[1].setRotationPoint(-36F, -7F, -3F);
		bodyModel[1].rotateAngleZ = 0.2617994F;

		bodyModel[2].addBox(0F, 0F, 0F, 12, 12, 12, 0F); // CR.ControlPanel
		bodyModel[2].setRotationPoint(-35F, -23F, -6F);
		bodyModel[2].rotateAngleZ = 0.1745329F;

		bodyModel[3].addBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F); // CR.FrontLeftSideTube
		bodyModel[3].setRotationPoint(-18.5F, -31F, 3.8F);
		bodyModel[3].rotateAngleX = 0.2443461F;

		bodyModel[4].addBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F); // CR.FrontRightSideTube
		bodyModel[4].setRotationPoint(-18.5F, -31F, -3.8F);
		bodyModel[4].rotateAngleX = -0.2443461F;

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // CR.FrontTopTube
		bodyModel[5].setRotationPoint(-18F, -31.3F, -4F);
		bodyModel[5].rotateAngleZ = -1.396263F;

		bodyModel[6].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // CR.FrontLeftTube
		bodyModel[6].setRotationPoint(-18.5F, -30.7F, 3F);
		bodyModel[6].rotateAngleZ = -0.8377581F;

		bodyModel[7].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // CR.FrontRightTube
		bodyModel[7].setRotationPoint(-18.5F, -30.7F, -3F);
		bodyModel[7].rotateAngleZ = -0.8377581F;

		bodyModel[8].addBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F); // CR.BackRightSideTube
		bodyModel[8].setRotationPoint(-9F, -30.7F, -3.8F);
		bodyModel[8].rotateAngleX = -0.2443461F;

		bodyModel[9].addBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F); // CR.BackLeftSideTube
		bodyModel[9].setRotationPoint(-9F, -31F, 3.8F);
		bodyModel[9].rotateAngleX = 0.2443461F;

		bodyModel[10].addBox(-0.5F, -0.5F, -0.5F, 10, 1, 1, 0F); // CR.RightTopSideTube
		bodyModel[10].setRotationPoint(-18F, -30.4F, -3.8F);
		bodyModel[10].rotateAngleX = -0.6632251F;

		bodyModel[11].addBox(-0.5F, -0.5F, -0.5F, 10, 1, 1, 0F); // CR.LeftSideTube
		bodyModel[11].setRotationPoint(-18F, -30.4F, 3.9F);
		bodyModel[11].rotateAngleX = 0.6632251F;

		bodyModel[12].addBox(-0.5F, -0.5F, -0.5F, 14, 1, 1, 0F); // CR.BackRightTube
		bodyModel[12].setRotationPoint(-9F, -30.2F, -3.8F);
		bodyModel[12].rotateAngleY = 0.1745329F;
		bodyModel[12].rotateAngleZ = -0.6108652F;

		bodyModel[13].addBox(-0.5F, -0.5F, -0.5F, 14, 1, 1, 0F); // CR.BackLeftTube
		bodyModel[13].setRotationPoint(-9F, -30.2F, 3.8F);
		bodyModel[13].rotateAngleY = -0.1745329F;
		bodyModel[13].rotateAngleZ = -0.6108652F;

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // CR.BackTopTube
		bodyModel[14].setRotationPoint(-9.5F, -30.2F, -4F);
		bodyModel[14].rotateAngleZ = 1.396263F;

		bodyModel[15].addBox(0F, 0F, 0F, 10, 17, 16, 0F); // CR.CoreBack
		bodyModel[15].setRotationPoint(-6F, -23.5F, -8F);

		bodyModel[16].addBox(0F, 0F, 0F, 18, 1, 16, 0F); // CR.CoreFloor
		bodyModel[16].setRotationPoint(-24F, -7.5F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 18, 17, 2, 0F); // CR.CoreWallLeft
		bodyModel[17].setRotationPoint(-24F, -23.5F, 6F);

		bodyModel[18].addBox(0F, 0F, -1F, 8, 3, 2, 0F); // CR.GunBackRight
		bodyModel[18].setRotationPoint(-29F, -24F, -3.5F);

		bodyModel[19].addBox(0F, 0F, -1F, 8, 3, 2, 0F); // CR.GunBackLeft
		bodyModel[19].setRotationPoint(-29F, -24F, 3.5F);

		bodyModel[20].addBox(0F, 0F, -0.5F, 13, 1, 1, 0F); // CR.UnderJoystick
		bodyModel[20].setRotationPoint(-18.5F, -9F, 0F);

		bodyModel[21].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // CR.ChairBottom
		bodyModel[21].setRotationPoint(-16F, -12F, -4F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 12, 8, 0F); // CR.ChairTop
		bodyModel[22].setRotationPoint(-8.5F, -25F, -4F);
		bodyModel[22].rotateAngleZ = -0.06981317F;

		bodyModel[23].addBox(0F, 0F, 0F, 18, 17, 2, 0F); // CR.CoreWallRight
		bodyModel[23].setRotationPoint(-24F, -23.5F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // CR.Antenna
		bodyModel[24].setRotationPoint(0F, -37F, -0.5F);
		

			
		//Nose
		noseModel = new ModelRendererTurbo[2];
		noseModel[0] = new ModelRendererTurbo(this,  35,  461, textureX, textureY); // NS.Nose

		noseModel[0].addBox(0F, 0F, 0F, 14, 15, 15, 0F); // NS.Nose
		noseModel[0].setRotationPoint(-50F, -22.5F, -7.5F);
		noseModel[1] = new ModelRendererTurbo(this,  0,  480, textureX, textureY); // NS.Nosecone

		noseModel[1].addBox(-2F, -3.5F, -3.5F, 5, 7, 7, 0F); // NS.Nosecone
		noseModel[1].setRotationPoint(-53F, -15F, 0F);
		
		
		
		//Bay
		bayModel = new ModelRendererTurbo[5];
		bayModel[0] = new ModelRendererTurbo(this,  300,  150, textureX, textureY); // BY.BayRight
		bayModel[1] = new ModelRendererTurbo(this,  300,  180, textureX, textureY); // BY.BayLeft
		bayModel[2] = new ModelRendererTurbo(this,  300,  210, textureX, textureY); // BY.Core/Bayconnector
		bayModel[3] = new ModelRendererTurbo(this,  340,  210, textureX, textureY); // BY.BayBottom
		bayModel[4] = new ModelRendererTurbo(this,  425,  200, textureX, textureY); // BY.WheelHolder

		bayModel[0].addBox(0F, 0F, -4F, 50, 12, 8, 0F); // BY.BayRight
		bayModel[0].setRotationPoint(2F, -22F, -4F);
		bayModel[0].rotateAngleY = 0.07853982F;

		bayModel[1].addBox(0F, 0F, -4F, 50, 12, 8, 0F); // BY.BayLeft
		bayModel[1].setRotationPoint(2F, -22F, 4F);
		bayModel[1].rotateAngleY = -0.07853982F;

		bayModel[2].addBox(0F, 0F, 0F, 9, 3, 6, 0F); // BY.Core/Bayconnector
		bayModel[2].setRotationPoint(1F, -24.5F, -3F);
		bayModel[2].rotateAngleZ = -0.2974289F;

		bayModel[3].addBox(0F, 0F, 0F, 48, 4, 8, 0F); // BY.BayBottom
		bayModel[3].setRotationPoint(3.5F, -10.4F, -4F);
		bayModel[3].rotateAngleZ = 0.07679449F;

		bayModel[4].addBox(-3F, -1F, 0F, 12, 3, 1, 0F); // BY.WheelHolder
		bayModel[4].setRotationPoint(44F, -11F, -0.5F);
		bayModel[4].rotateAngleZ = -0.4370552F;

		 
		//Tail wheel
		tailModel = new ModelRendererTurbo[11];
		tailModel[0] = new ModelRendererTurbo(this,  180,  200, textureX, textureY); // TL.EndOfBay
		tailModel[1] = new ModelRendererTurbo(this,  180,  220, textureX, textureY); // TL.Cover-up
		tailModel[2] = new ModelRendererTurbo(this,  180,  235, textureX, textureY); // TL.Dorsal/FlapCapital
		tailModel[3] = new ModelRendererTurbo(this,  180,  250, textureX, textureY); // TL.DorsalFinFront
		tailModel[4] = new ModelRendererTurbo(this,  180,  265, textureX, textureY); // TL.DorsalFiller1
		tailModel[5] = new ModelRendererTurbo(this,  210,  265, textureX, textureY); // TL.DorsalFiller2
		tailModel[6] = new ModelRendererTurbo(this,  180,  300, textureX, textureY); // TL.FinAngleLeft
		tailModel[7] = new ModelRendererTurbo(this,  180,  340, textureX, textureY); // TL.LeftFlapHinge
		tailModel[8] = new ModelRendererTurbo(this,  180,  300, textureX, textureY); // TL.FinAngleRight
		tailModel[9] = new ModelRendererTurbo(this,  180,  340, textureX, textureY); // TL.RightFlapHinge
		tailModel[10] = new ModelRendererTurbo(this,  180,  375, textureX, textureY); // TL.MiddleCoverUp

		tailModel[0].addBox(0F, 0F, 0F, 8, 10, 4, 0F); // TL.EndOfBay
		tailModel[0].setRotationPoint(50F, -20F, -2F);
		tailModel[0].rotateAngleZ = 0.1745329F;

		tailModel[1].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // TL.Cover-up
		tailModel[1].setRotationPoint(52F, -22F, -1.5F);

		tailModel[2].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // TL.Dorsal/FlapCapital
		tailModel[2].setRotationPoint(43F, -40F, -1F);

		tailModel[3].addBox(0F, 0F, 0F, 20, 5, 2, 0F); // TL.DorsalFinFront
		tailModel[3].setRotationPoint(35F, -21F, -1F);
		tailModel[3].rotateAngleZ = 1.169371F;

		tailModel[4].addBox(0F, 0F, 0F, 9, 16, 2, 0F); // TL.DorsalFiller1
		tailModel[4].setRotationPoint(43F, -36F, -1F);

		tailModel[5].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // TL.DorsalFiller2
		tailModel[5].setRotationPoint(40F, -29F, -1F);

		tailModel[6].addBox(0F, 0F, 0F, 5, 2, 24, 0F); // TL.FinAngleLeft
		tailModel[6].setRotationPoint(33F, -18F, 5F);
		tailModel[6].rotateAngleY = -0.3490658F;

		tailModel[7].addBox(0F, 0F, 0F, 6, 2, 24, 0F); // TL.LeftFlapHinge
		tailModel[7].setRotationPoint(41F, -18F, 4F);

		tailModel[8].addBox(0F, 0F, -24F, 5, 2, 24, 0F); // TL.FinAngleRight
		tailModel[8].setRotationPoint(33F, -18F, -5F);
		tailModel[8].rotateAngleY = 0.3490658F;

		tailModel[9].addBox(0F, 0F, 0F, 6, 2, 24, 0F); // TL.RightFlapHinge
		tailModel[9].setRotationPoint(41F, -18F, -28F);

		tailModel[10].addBox(0F, 0F, 0F, 5, 2, 26, 0F); // TL.MiddleCoverUp
		tailModel[10].setRotationPoint(37F, -18F, -13F);


		tailWheelModel = new ModelRendererTurbo[1];
		tailWheelModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // LGT.BackWheel

		tailWheelModel[0].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // LGT.BackWheel
		tailWheelModel[0].setRotationPoint(50F, -8F, -1F);

		
		//Right wing
		rightWingModel = new ModelRendererTurbo[5];
		rightWingModel[0] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // RW.RightWingMain
		rightWingModel[1] = new ModelRendererTurbo(this,  390,  0, textureX, textureY); // RW.RightWingBackCenter
		rightWingModel[2] = new ModelRendererTurbo(this,  390,  20, textureX, textureY); // RW.RightWingFlapSupport
		rightWingModel[3] = new ModelRendererTurbo(this,  390,  80, textureX, textureY); // RW.RightWingOuterTip
		rightWingModel[4] = new ModelRendererTurbo(this,  350,  80, textureX, textureY); // RW.Cannon

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

		rightWingModel[4].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // RW.Cannon
		rightWingModel[4].setRotationPoint(-31F, -9.5F, -23F);
		rightWingModel[4].rotateAngleX = 0.06981317F;

		
        //Left wing
		leftWingModel = new ModelRendererTurbo[5];
		leftWingModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // LW.LeftWingMain
		leftWingModel[1] = new ModelRendererTurbo(this,  390,  0, textureX, textureY); // LW.LeftWingBackCenter
		leftWingModel[2] = new ModelRendererTurbo(this,  390,  20, textureX, textureY); // LW.LeftWingFlapSupport
		leftWingModel[3] = new ModelRendererTurbo(this,  390,  80, textureX, textureY); // LW.LeftWingOuterTip
		leftWingModel[4] = new ModelRendererTurbo(this,  350,  80, textureX, textureY); // LW.Cannon

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

		leftWingModel[4].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // LW.Cannon
		leftWingModel[4].setRotationPoint(-31F, -9.5F, 22F);
		leftWingModel[4].rotateAngleX = 0.06981317F;


		//Propellers
		propellerModels = new ModelRendererTurbo[1][3]; //1 propeller in 3 parts
        propellerModels[0][0] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); //Propeller 0 - Blade 0 : 192, 12 is the texture origin
        propellerModels[0][1] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); //Propeller 0 - Blade 1
        propellerModels[0][2] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); //Propeller 0 - Blade 2		
        propellerModels[0][0].addBox(0F, 0F, -1F, 1, 18, 2, 0F);		//Propeller Blades
        propellerModels[0][1].addBox(0F, 0F, -1F, 1, 18, 2, 0F);		//They will all be the same
        propellerModels[0][2].addBox(0F, 0F, -1F, 1, 18, 2, 0F);		
        propellerModels[0][0].setRotationPoint(-53F, -15F, 0F);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(-53F, -15F, 0F);	
        propellerModels[0][2].setRotationPoint(-53F, -15F, 0F);	
		
        yawFlapModel = new ModelRendererTurbo[4];
		yawFlapModel[0] = new ModelRendererTurbo(this,  420,  420, textureX, textureY); // YF.JoyStick
		yawFlapModel[1] = new ModelRendererTurbo(this,  410,  420, textureX, textureY); // YF.JoyStickGrip
		yawFlapModel[2] = new ModelRendererTurbo(this,  200,  480, textureX, textureY); // YF.TailYawFlap
		yawFlapModel[3] = new ModelRendererTurbo(this,  200,  460, textureX, textureY); // YF.TailYawFlapTop

		yawFlapModel[0].addBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F); // YF.JoyStick
		yawFlapModel[0].setRotationPoint(-18F, -19F, 0F);

		yawFlapModel[1].addBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F); // YF.JoyStickGrip
		yawFlapModel[1].setRotationPoint(-18F, -19F, 0F);

		yawFlapModel[2].addBox(0F, 0F, -1F, 5, 14, 2, 0F); // YF.TailYawFlap
		yawFlapModel[2].setRotationPoint(52F, -36F, 0F);

		yawFlapModel[3].addBox(-3F, -4F, 0F, 6, 4, 2, 0F); // YF.TailYawFlapTop
		yawFlapModel[3].setRotationPoint(52F, -36F, -1F);
		
		
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // LF.LeftPedal
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this,  200,  430, textureX, textureY); // LF.LeftTailFlap

		pitchFlapLeftModel[0].addBox(0F, 0F, -2F, 1, 3, 4, 0F); // LF.LeftPedal
		pitchFlapLeftModel[0].setRotationPoint(-22F, -13F, -4F);
		pitchFlapLeftModel[0].rotateAngleZ = 0.1745329F;

		pitchFlapLeftModel[1].addBox(0F, -0.5F, 0F, 4, 1, 22, 0F); // LF.LeftTailFlap
		pitchFlapLeftModel[1].setRotationPoint(47F, -17F, 5F);
		
		
		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // RF.RightPedal
		pitchFlapRightModel[1] = new ModelRendererTurbo(this,  200,  430, textureX, textureY); // RF.RightTailFlap

		pitchFlapRightModel[0].addBox(0F, 0F, -2F, 1, 3, 4, 0F); // RF.RightPedal
		pitchFlapRightModel[0].setRotationPoint(-22F, -13F, 4F);
		pitchFlapRightModel[0].rotateAngleZ = 0.1745329F;

		pitchFlapRightModel[1].addBox(0F, -0.5F, 0F, 4, 1, 22, 0F); // RF.RightTailFlap
		pitchFlapRightModel[1].setRotationPoint(47F, -17F, -27F);
		
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // LF.LeftWingFlap

		pitchFlapLeftWingModel[0].addBox(0F, -1F, -21F, 2, 1, 42, 0F); // LF.LeftWingFlap
		pitchFlapLeftWingModel[0].setRotationPoint(-5.5F, -9.5F, 38F);
		pitchFlapLeftWingModel[0].rotateAngleX = 0.06981317F;
		pitchFlapLeftWingModel[0].rotateAngleY = 0.122173F;



// Pitch Flap Right Wing
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // RF.RightWingFlap

		pitchFlapRightWingModel[0].addBox(0F, -1F, -21F, 2, 1, 42, 0F); // RF.RightWingFlap
		pitchFlapRightWingModel[0].setRotationPoint(-5.5F, -9.5F, -38F);
		pitchFlapRightWingModel[0].rotateAngleX = -0.06981317F;
		pitchFlapRightWingModel[0].rotateAngleY = -0.122173F;
		
		
		leftWingWheelModel = new ModelRendererTurbo[3];
		leftWingWheelModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // LGLW.Stick
		leftWingWheelModel[1] = new ModelRendererTurbo(this,  0,  345, textureX, textureY); // LGLW.Wheel
		leftWingWheelModel[2] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // LGLWWheelCover

		leftWingWheelModel[0].addBox(0F, 0F, -1F, 3, 12, 2, 0F); // LGLW.Stick
		leftWingWheelModel[0].setRotationPoint(-27F, -8F, 22F);
		leftWingWheelModel[0].rotateAngleX = 0.03490658F;

		leftWingWheelModel[1].addBox(-3F, 0F, -1.5F, 6, 6, 3, 0F); // LGLW.Wheel
		leftWingWheelModel[1].setRotationPoint(-25.5F, 4F, 22.5F);
		leftWingWheelModel[1].rotateAngleX = 0.03490658F;

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 7, 4, 0, 0F); // LGLWWheelCover
		leftWingWheelModel[2].setRotationPoint(-29F, 3.5F, 24F);
		leftWingWheelModel[2].rotateAngleX = 0.1396263F;



// Right Wing Wheel
		rightWingWheelModel = new ModelRendererTurbo[3];
		rightWingWheelModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // LGRW.Stick
		rightWingWheelModel[1] = new ModelRendererTurbo(this,  0,  345, textureX, textureY); // LGRW.Wheel
		rightWingWheelModel[2] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // LGRW.WheelCover

		rightWingWheelModel[0].addBox(0F, 0F, -1F, 3, 12, 2, 0F); // LGRW.Stick
		rightWingWheelModel[0].setRotationPoint(-27F, -8F, -22F);
		rightWingWheelModel[0].rotateAngleX = -0.03490658F;

		rightWingWheelModel[1].addBox(-3F, 0F, -1.5F, 6, 6, 3, 0F); // LGRW.Wheel
		rightWingWheelModel[1].setRotationPoint(-25.5F, 4F, -22.5F);
		rightWingWheelModel[1].rotateAngleX = -0.03490658F;

		rightWingWheelModel[2].addBox(0F, 0F, 0F, 7, 4, 0, 0F); // LGRW.WheelCover
		rightWingWheelModel[2].setRotationPoint(-29F, 3.5F, -24F);
		rightWingWheelModel[2].rotateAngleX = -0.1396263F;


		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
		translateAll(4, -12, 0);
    }
}		
 
