package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCamel extends ModelPlane
{
    public ModelCamel()
    {	
		int textureX = 128; //The x-size of the texture
		int textureY = 128;	//The y-size of the texture
	
		propellerModels = new ModelRendererTurbo[1][3]; //1 propeller in 3 parts
        propellerModels[0][0] = new ModelRendererTurbo(this, 56, 8, textureX, textureY); //Propeller 0 - Blade 0 : 56, 8 is the texture origin
        propellerModels[0][1] = new ModelRendererTurbo(this, 56, 8, textureX, textureY); //Propeller 0 - Blade 1
        propellerModels[0][2] = new ModelRendererTurbo(this, 56, 8, textureX, textureY); //Propeller 0 - Blade 2	
        propellerModels[0][0].addBox(0F, -7F, -1F, 2, 5, 2, 0.0F);	//Model the propeller blade by adding a box
        propellerModels[0][1].addBox(0F, -7F, -1F, 2, 5, 2, 0.0F);  //First come the origin coordinates and then the size
        propellerModels[0][2].addBox(0F, -7F, -1F, 2, 5, 2, 0.0F);	
		propellerModels[0][0].setRotationPoint(-27, 0, 0);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(-27, 0, 0);	
        propellerModels[0][2].setRotationPoint(-27, 0, 0);	
		
		yawFlapModel = new ModelRendererTurbo[1]; //Only one part to the yaw flap
		yawFlapModel[0] = new ModelRendererTurbo(this, 104, 0, textureX, textureY);
        yawFlapModel[0].addBox(0F, 0F , 0F, 10, 10, 2, 0.0F);	
		yawFlapModel[0].setPosition(40F, -12F, -1F);			

		pitchFlapLeftModel = new ModelRendererTurbo[1]; //Only one part to the left pitch flap
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 104, 0, textureX, textureY);
		pitchFlapLeftModel[0].addBox(0F, 0F , 0F, 10, 15, 2, 0.0F);
        pitchFlapLeftModel[0].rotateAngleX = 1.570796F;
		pitchFlapLeftModel[0].setPosition(40F, 3F, -15F);
		
		pitchFlapRightModel = new ModelRendererTurbo[1]; //Only one part to the right pitch flap
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 104, 0, textureX, textureY);
		pitchFlapRightModel[0].addBox(0F, 0F , 0F, 10, 15, 2, 0.0F);
        pitchFlapRightModel[0].rotateAngleX = 1.570796F;
		pitchFlapRightModel[0].setPosition(40F, 3F, 0F);
				
		//Body
        bodyModel = new ModelRendererTurbo[5]; //Defining lots of texture origins for the body model
        bodyModel[0] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);

        byte length = 24;
        byte sidePieceHeight = 6;
        byte width = 20;
        byte boatDepth = 4;
        bodyModel[0].addBox(-length / 2, -width / 2 + 2, -3F, length, width - 4, 4, 0.0F);
        bodyModel[0].setPosition(0.0F, boatDepth, 0.0F);

        bodyModel[1].addBox(-length / 2 + 2, -sidePieceHeight - 1, -1F, length - 4, sidePieceHeight, 2, 0.0F);
        bodyModel[1].setPosition(-length / 2 + 1, boatDepth, 0.0F);

        bodyModel[2].addBox(-length / 2 + 2, -sidePieceHeight - 1, -1F, length - 4, sidePieceHeight, 2, 0.0F);
        bodyModel[2].setPosition(length / 2 - 1, boatDepth, 0.0F);

        bodyModel[3].addBox(-length / 2 + 2, -sidePieceHeight - 1, -1F, length - 4, sidePieceHeight, 2, 0.0F);
        bodyModel[3].setPosition(0.0F, boatDepth, -width / 2 + 1);

        bodyModel[4].addBox(-length / 2 + 2, -sidePieceHeight - 1, -1F, length - 4, sidePieceHeight, 2, 0.0F);
        bodyModel[4].setPosition(0.0F, boatDepth, width / 2 - 1);
        
        bodyModel[0].rotateAngleX = 1.570796F;
        bodyModel[1].rotateAngleY = 4.712389F;
        bodyModel[2].rotateAngleY = 1.570796F;
        bodyModel[3].rotateAngleY = 3.141593F;
		
        //Nose
        noseModel = new ModelRendererTurbo[4];   
        noseModel[0] = new ModelRendererTurbo(this, 44, 0, textureX, textureY);
        noseModel[1] = new ModelRendererTurbo(this, 0, 64, textureX, textureY);		
        noseModel[2] = new ModelRendererTurbo(this, 12, 32, textureX, textureY);
        noseModel[3] = new ModelRendererTurbo(this, 12, 32, textureX, textureY);
        
        noseModel[0].addBox(0F, 0F , 0F, 4, 4, 4, 0.0F);		//Propeller Centre
        noseModel[0].setPosition(-28F, -2F, -2F);
        noseModel[1].addBox(0F, 0F , 0F, 12, 10, 18, 0.0F);		//Front block
        noseModel[1].setPosition(-24F, -3F, -9F);
        noseModel[2].addBox(-24F, -5F, 2F, 14, 2, 2, 0.0F);		//gun
        noseModel[3].addBox(-24F, -5F, -4F, 14, 2, 2, 0.0F);	//gun
		
		//Front wheels with struts
		bodyWheelModel = new ModelRendererTurbo[4];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 0, 32, textureX, textureY);
		bodyWheelModel[1] = new ModelRendererTurbo(this, 0, 32, textureX, textureY);
	    bodyWheelModel[2] = new ModelRendererTurbo(this, 56, 15, textureX, textureY);
	    bodyWheelModel[3] = new ModelRendererTurbo(this, 56, 15, textureX, textureY);

        bodyWheelModel[0].addBox(-4F, 11F, 5F, 4, 4, 2, 0.0F);		//Left wheel
		bodyWheelModel[1].addBox(-4F, 11F, -7F, 4, 4, 2, 0.0F);		//Right wheel
		bodyWheelModel[2].addBox(-3F, 6F , 5F, 2, 5, 2, 0.0F);		//Left Strut		
		bodyWheelModel[3].addBox(-3F, 6F , -7F, 2, 5, 2, 0.0F);		//Right Strut

		rightWingModel = new ModelRendererTurbo[2];	
		rightWingModel[0] = new ModelRendererTurbo(this, 64 , 0, textureX, textureY);
	    rightWingModel[1] = new ModelRendererTurbo(this, 56, 15, textureX, textureY);

        rightWingModel[0].addBox(0F, 0F, 0F, 18, 41, 2, 0.0F);		//Right Wing
		rightWingModel[0].rotateAngleX = -1.570796F;
		rightWingModel[0].setPosition(-9F, 0F, -9F);
		rightWingModel[1].addBox(-1F, -18F , -40F, 2, 18, 2, 0.0F);	//Right Strut

		
		leftWingModel = new ModelRendererTurbo[2];
        leftWingModel[0] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
	    leftWingModel[1] = new ModelRendererTurbo(this, 56, 15, textureX, textureY);
			
        leftWingModel[0].addBox(0F, 0F , 0F, 18, 41, 2	, 0.0F);	//Left Wing
		leftWingModel[0].rotateAngleX = -1.570796F;
		leftWingModel[0].setPosition(-9F, 0F, 50F);
		leftWingModel[1].addBox(-1F, -18F , 38F, 2, 18, 2, 0.0F);	//Left Strut

		topWingModel = new ModelRendererTurbo[3];
		topWingModel[0] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
		topWingModel[1] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
        topWingModel[2] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
		
        topWingModel[0].addBox(0F, 0F, 0F, 18, 18, 2, 0.0F);		//Top Middle Wing
		topWingModel[0].rotateAngleX = -1.570796F;
		topWingModel[0].setPosition(-9F, -20F, 9F);
		
        topWingModel[1].addBox(0F, 0F , 0F, 18, 41, 2, 0.0F);		//Top Left Wing
		topWingModel[1].rotateAngleX = -1.570796F;
		topWingModel[1].setPosition(-9F, -20F, 50F);
		
        topWingModel[2].addBox(0F, 0F, 0F, 18, 41, 2, 0.0F);		//Top Right Wing
		topWingModel[2].rotateAngleX = -1.570796F;
		topWingModel[2].setPosition(-9F, -20F, -9F);

		tailModel = new ModelRendererTurbo[1];
		tailModel[0] = new ModelRendererTurbo(this, 0, 43, textureX, textureY);
        tailModel[0].addBox(11F, -2F , -5F, 40, 8, 10, 0.0F);		//Tail
        
        tailWheelModel = new ModelRendererTurbo[1];
		tailWheelModel[0] = new ModelRendererTurbo(this, 0, 32, textureX, textureY);
		tailWheelModel[0].addBox(44F, 6F, -1F, 4, 4, 2, 0.0F);			//Tail Wheel

		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
    }
}
