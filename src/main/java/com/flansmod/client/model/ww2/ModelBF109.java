package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBF109 extends ModelPlane
{
    public ModelBF109()
    {
		int textureX = 256; //The x-size of the texture
		int textureY = 128;	//The y-size of the texture
		//Initializing Model
	
		//Creates each block with texture co-ordinates starting at the first two values. Second 2 values are the overall size of the texture
		//(Dont forget the crazy shapes you can make with it)
		
		//Body
        bodyModel = new ModelRendererTurbo[4];
        bodyModel[0] = new ModelRendererTurbo(this, 0, 104, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 60, 76, textureX, textureY);
        bodyModel[2] = new ModelRendererTurbo(this, 60, 76, textureX, textureY);
		bodyModel[3] = new ModelRendererTurbo(this, 0, 76, textureX, textureY);

		//Cockpit Bottom
		bodyModel[0].addBox(-3F, 5F, -10F, 20, 2, 20);
		
		//Cockpit sides
		bodyModel[1].addBox(-3F, -11F, -10F, 20, 16, 2);
		bodyModel[2].addBox(-17F, -16F, -10F, 20, 16, 2);
		bodyModel[2].rotateAngleY = 3.14159265358979F;
		bodyModel[2].setPosition(0F, 5F, 0F);

		//Cockpit top
		bodyModel[3].addTrapezoid(-3F, -19F, -10F, 20, 8, 20, 0.0F, -3.0F, ModelRendererTurbo.MR_TOP);
		
		//Wheels
		bodyWheelModel = new ModelRendererTurbo[4];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 116, 48, textureX, textureY);
		bodyWheelModel[1] = new ModelRendererTurbo(this, 116, 48, textureX, textureY);
		bodyWheelModel[2] = new ModelRendererTurbo(this, 200, 12, textureX, textureY);
		bodyWheelModel[3] = new ModelRendererTurbo(this, 200, 12, textureX, textureY);
		
		bodyWheelModel[0].addBox(-6F, 14F, 4F, 6, 6, 4, 0.0F);
		bodyWheelModel[1].addBox(-6F, 14F, -8F, 6, 6, 4, 0.0F);
		bodyWheelModel[2].addBox(-4F, 6F, 5F, 2, 8, 2, 0.0F);	
		bodyWheelModel[3].addBox(-4F, 6F, -7F, 2, 8, 2, 0.0F);	
			
		//Nose
		noseModel = new ModelRendererTurbo[2];
		//Nose fuselage
		noseModel[0] = new ModelRendererTurbo(this, 0, 38, textureX, textureY);
		noseModel[0].addTrapezoid(-51F, -16F, -10F, 48, 18, 20, 0.0F, -3.0F, ModelRendererTurbo.MR_RIGHT);
		noseModel[0].setPosition(0F, 5F, 0F);
		//Propeller centre
		noseModel[1] = new ModelRendererTurbo(this, 172, 12, textureX, textureY);
		noseModel[1].addBox(0F, -2F , 0F, 4, 4, 4, 0.0F);
		noseModel[1].setPosition(-55F, -2F, -2F);
		
		
		//Bay
		bayModel = new ModelRendererTurbo[1];
		bayModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bayModel[0].addTrapezoid(17F, -16F, -10F, 76, 18, 20, 0.0F, -3.0F, ModelRendererTurbo.MR_LEFT);
		bayModel[0].setPosition(0F, 5F, 0F);
		 
		//Tail wheel
		tailWheelModel = new ModelRendererTurbo[2];
		tailWheelModel[0] = new ModelRendererTurbo(this, 116, 48, textureX, textureY);	
		tailWheelModel[1] = new ModelRendererTurbo(this, 200, 12, textureX, textureY);

		tailWheelModel[0].addBox(79F, 6F, -2F, 6, 6, 4, 0.0F);
		tailWheelModel[1].addBox(81F, 0F, -1F, 2, 8, 2, 0.0F);	

		
		
		//Right wing
		rightWingModel = new ModelRendererTurbo[2];
		rightWingModel[0] = new ModelRendererTurbo(this, 58, 48, textureX, textureY);
		rightWingModel[1] = new ModelRendererTurbo(this, 172, 0, textureX, textureY);	
		
		rightWingModel[0].addBox(-25F, 3F, 0F, 32, 2, 78, 0.0F);	//Wing
		rightWingModel[1].addTrapezoid(-25F, 3F , 78F, 32, 2, 10, 0.0F, -1.0F, ModelRendererTurbo.MR_BACK);	//Wingtip	
		
        //Left wing
        leftWingModel = new ModelRendererTurbo[2];
        leftWingModel[0] = new ModelRendererTurbo(this, 58, 48, textureX, textureY);
        leftWingModel[1] = new ModelRendererTurbo(this, 172, 0, textureX, textureY);	
				
        leftWingModel[0].addBox(-32F, -2F, -78F, 32, 2, 78); //Wing
        leftWingModel[0].rotateAngleY = 3.14159265358979F;
        leftWingModel[0].setPosition(-25F, 5F, -78F);
        leftWingModel[1].addTrapezoid(-32F, 3F , -88F, 32, 2, 10, 0.0F, -1.0F, ModelRendererTurbo.MR_BACK);	//Wingtip
        leftWingModel[1].rotateAngleY = 3.14159265258979F;
        leftWingModel[1].setPosition(-25F,0F,-166F);

		//Propellers
		propellerModels = new ModelRendererTurbo[1][3]; //1 propeller in 3 parts
        propellerModels[0][0] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); //Propeller 0 - Blade 0 : 192, 12 is the texture origin
        propellerModels[0][1] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); //Propeller 0 - Blade 1
        propellerModels[0][2] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); //Propeller 0 - Blade 2		
        propellerModels[0][0].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);		//Propeller Blades
        propellerModels[0][1].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);		//They will all be the same
        propellerModels[0][2].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);		
        propellerModels[0][0].setRotationPoint(-54, -2, 0);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(-54, -2, 0);	
        propellerModels[0][2].setRotationPoint(-54, -2, 0);	
		
		yawFlapModel = new ModelRendererTurbo[1]; //Only one part to the yaw flap
		yawFlapModel[0] = new ModelRendererTurbo(this, 220, 12, textureX, textureY);
		yawFlapModel[0].addBox(0F, 0F , 0F, 16, 20, 2, 0.0F);
		yawFlapModel[0].setPosition(76F, -22F, -1F);			
		
		pitchFlapLeftModel = new ModelRendererTurbo[1]; //Only one part to the left pitch flap
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 220, 12, textureX, textureY);
		pitchFlapLeftModel[0].addBox(0F, 0F , 0F, 16, 22, 2, 0.0F);
        pitchFlapLeftModel[0].rotateAngleX = 1.570796F;
		pitchFlapLeftModel[0].setPosition(76F, 1F, -22F);
		
		pitchFlapRightModel = new ModelRendererTurbo[1]; //Only one part to the right pitch flap
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 220, 12, textureX, textureY);
		pitchFlapRightModel[0].addBox(0F, 0F , 0F, 16, 22, 2, 0.0F);
        pitchFlapRightModel[0].rotateAngleX = 1.570796F;
		pitchFlapRightModel[0].setPosition(76F, 1F, 0F);

		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
    }
}		
 