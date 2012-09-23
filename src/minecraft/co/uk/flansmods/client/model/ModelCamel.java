package co.uk.flansmods.client.model;

import com.overminddl1.minecraft.libs.NMT.NMTModelRenderer;

public class ModelCamel extends ModelPlane
{
    public ModelCamel()
    {	
		int textureX = 128; //The x-size of the texture
		int textureY = 64;	//The y-size of the texture
	
		propellerModels = new NMTModelRenderer[1][3]; //1 propeller in 3 parts
        propellerModels[0][0] = new NMTModelRenderer(this, 56, 8, textureX, textureY); //Propeller 0 - Blade 0 : 56, 8 is the texture origin
        propellerModels[0][1] = new NMTModelRenderer(this, 56, 8, textureX, textureY); //Propeller 0 - Blade 1
        propellerModels[0][2] = new NMTModelRenderer(this, 56, 8, textureX, textureY); //Propeller 0 - Blade 2	
        propellerModels[0][0].addBox(0F, -7F, -1F, 2, 5, 2, 0.0F);	//Model the propeller blade by adding a box
        propellerModels[0][1].addBox(0F, -7F, -1F, 2, 5, 2, 0.0F);  //First come the origin coordinates and then the size
        propellerModels[0][2].addBox(0F, -7F, -1F, 2, 5, 2, 0.0F);	
		propellerModels[0][0].setRotationPoint(-27, 0, 0);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(-27, 0, 0);	
        propellerModels[0][2].setRotationPoint(-27, 0, 0);	
		
		yawFlapModel = new NMTModelRenderer[1]; //Only one part to the yaw flap
		yawFlapModel[0] = new NMTModelRenderer(this, 104, 0, textureX, textureY);
        yawFlapModel[0].addBox(0F, 0F , 0F, 10, 10, 2, 0.0F);	
		yawFlapModel[0].setRotationPoint(40F, -12F, -1F);			

		pitchFlapLeftModel = new NMTModelRenderer[1]; //Only one part to the left pitch flap
		pitchFlapLeftModel[0] = new NMTModelRenderer(this, 104, 0, textureX, textureY);
		pitchFlapLeftModel[0].addBox(0F, 0F , 0F, 10, 15, 2, 0.0F);
        pitchFlapLeftModel[0].rotateAngleX = 1.570796F;
		pitchFlapLeftModel[0].setRotationPoint(40F, 3F, -15F);
		
		pitchFlapRightModel = new NMTModelRenderer[1]; //Only one part to the right pitch flap
		pitchFlapRightModel[0] = new NMTModelRenderer(this, 104, 0, textureX, textureY);
		pitchFlapRightModel[0].addBox(0F, 0F , 0F, 10, 15, 2, 0.0F);
        pitchFlapRightModel[0].rotateAngleX = 1.570796F;
		pitchFlapRightModel[0].setRotationPoint(40F, 3F, 0F);
				
        bodyModel = new NMTModelRenderer[16]; //Defining lots of texture origins for the body model
        bodyModel[0] = new NMTModelRenderer(this, 0, 8, textureX, textureY);
        bodyModel[1] = new NMTModelRenderer(this, 0, 0, textureX, textureY);
        bodyModel[2] = new NMTModelRenderer(this, 0, 0, textureX, textureY);
        bodyModel[3] = new NMTModelRenderer(this, 0, 0, textureX, textureY);
        bodyModel[4] = new NMTModelRenderer(this, 0, 0, textureX, textureY);
        bodyModel[5] = new NMTModelRenderer(this, 44, 0, textureX, textureY);
		bodyModel[6] = new NMTModelRenderer(this, 0, 32, textureX, textureY);
		bodyModel[7] = new NMTModelRenderer(this, 0, 32, textureX, textureY);
		bodyModel[8] = new NMTModelRenderer(this, 90, 46, textureX, textureY);		
		bodyModel[9] = new NMTModelRenderer(this, 90, 46, textureX, textureY);
		bodyModel[10] = new NMTModelRenderer(this, 90, 46, textureX, textureY);
		bodyModel[11] = new NMTModelRenderer(this, 90, 46, textureX, textureY);
		bodyModel[12] = new NMTModelRenderer(this, 90, 46, textureX, textureY);
		bodyModel[13] = new NMTModelRenderer(this, 90, 46, textureX, textureY);
		bodyModel[14] = new NMTModelRenderer(this, 12, 32, textureX, textureY);
		bodyModel[15] = new NMTModelRenderer(this, 12, 32, textureX, textureY);
		
        byte length = 24;
        byte sidePieceHeight = 6;
        byte width = 20;
        byte boatDepth = 4;
        bodyModel[0].addBox(-length / 2, -width / 2 + 2, -3F, length, width - 4, 4, 0.0F);
        bodyModel[0].setRotationPoint(0.0F, 0 + boatDepth, 0.0F);

        bodyModel[1].addBox(-length / 2 + 2, -sidePieceHeight - 1, -1F, length - 4, sidePieceHeight, 2, 0.0F);
        bodyModel[1].setRotationPoint(-length / 2 + 1, 0 + boatDepth, 0.0F);

        bodyModel[2].addBox(-length / 2 + 2, -sidePieceHeight - 1, -1F, length - 4, sidePieceHeight, 2, 0.0F);
        bodyModel[2].setRotationPoint(length / 2 - 1, 0 + boatDepth, 0.0F);

        bodyModel[3].addBox(-length / 2 + 2, -sidePieceHeight - 1, -1F, length - 4, sidePieceHeight, 2, 0.0F);
        bodyModel[3].setRotationPoint(0.0F, 0 + boatDepth, -width / 2 + 1);

        bodyModel[4].addBox(-length / 2 + 2, -sidePieceHeight - 1, -1F, length - 4, sidePieceHeight, 2, 0.0F);
        bodyModel[4].setRotationPoint(0.0F, 0 + boatDepth, width / 2 - 1);
		
		bodyModel[5].addBox(0F, 0F , 0F, 4, 4, 4, 0.0F);		//Propeller Centre
		bodyModel[5].setRotationPoint(-28F, -2F, -2F);

        bodyModel[6].addBox(-3F, 6F, 5F, 4, 4, 2, 0.0F);		//wheel
		bodyModel[7].addBox(-3F, 6F, -7F, 4, 4, 2, 0.0F);		//wheel

        bodyModel[0].rotateAngleX = 1.570796F;
        bodyModel[1].rotateAngleY = 4.712389F;
        bodyModel[2].rotateAngleY = 1.570796F;
        bodyModel[3].rotateAngleY = 3.141593F;
		
		//This block is so bad... meh.
		bodyModel[8].addBox(0F, 0F , 0F, 12, 10, 3, 0.0F);		//front block segment 2
		bodyModel[8].setRotationPoint(-24F, -3F, -9F);
		bodyModel[9].addBox(0F, 0F , 0F, 12, 10, 3, 0.0F);		//front block segment 2
		bodyModel[9].setRotationPoint(-24F, -3F, -6F);
		bodyModel[10].addBox(0F, 0F , 0F, 12, 10, 3, 0.0F);		//front block segment 3
		bodyModel[10].setRotationPoint(-24F, -3F, -3F);
		bodyModel[11].addBox(0F, 0F , 0F, 12, 10, 3, 0.0F);		//front block segment 4
		bodyModel[11].setRotationPoint(-24F, -3F, 0F);
		bodyModel[12].addBox(0F, 0F , 0F, 12, 10, 3, 0.0F);		//front block segment 5
		bodyModel[12].setRotationPoint(-24F, -3F, 3F);
		bodyModel[13].addBox(0F, 0F , 0F, 12, 10, 3, 0.0F);		//front block segment 6
		bodyModel[13].setRotationPoint(-24F, -3F, 6F);
	
		bodyModel[14].addBox(-24F, -5F, 2F, 14, 2, 2, 0.0F);		//gun
		bodyModel[15].addBox(-24F, -5F, -4F, 14, 2, 2, 0.0F);		//gun

		rightWingModel = new NMTModelRenderer[2];	
		rightWingModel[0] = new NMTModelRenderer(this, 64 , 0, textureX, textureY);
	    rightWingModel[1] = new NMTModelRenderer(this, 56, 15, textureX, textureY);

        rightWingModel[0].addBox(0F, 0F, 0F, 18, 41, 2, 0.0F);		//Right Wing
		rightWingModel[0].rotateAngleX = -1.570796F;
		rightWingModel[0].setRotationPoint(-9F, 0F, -9F);
		rightWingModel[1].addBox(-1F, -18F , -40F, 2, 18, 2, 0.0F);	//Right Strut

		
		leftWingModel = new NMTModelRenderer[2];
        leftWingModel[0] = new NMTModelRenderer(this, 64, 0, textureX, textureY);
	    leftWingModel[1] = new NMTModelRenderer(this, 56, 15, textureX, textureY);
			
        leftWingModel[0].addBox(0F, 0F , 0F, 18, 41, 2	, 0.0F);	//Left Wing
		leftWingModel[0].rotateAngleX = -1.570796F;
		leftWingModel[0].setRotationPoint(-9F, 0F, 50F);
		leftWingModel[1].addBox(-1F, -18F , 38F, 2, 18, 2, 0.0F);	//Left Strut

		topWingModel = new NMTModelRenderer[3];
		topWingModel[0] = new NMTModelRenderer(this, 64, 0, textureX, textureY);
		topWingModel[1] = new NMTModelRenderer(this, 64, 0, textureX, textureY);
        topWingModel[2] = new NMTModelRenderer(this, 64, 0, textureX, textureY);
		
        topWingModel[0].addBox(0F, 0F, 0F, 18, 18, 2, 0.0F);		//Top Middle Wing
		topWingModel[0].rotateAngleX = -1.570796F;
		topWingModel[0].setRotationPoint(-9F, -20F, 9F);
		
        topWingModel[1].addBox(0F, 0F , 0F, 18, 41, 2, 0.0F);		//Top Left Wing
		topWingModel[1].rotateAngleX = -1.570796F;
		topWingModel[1].setRotationPoint(-9F, -20F, 50F);
		
        topWingModel[2].addBox(0F, 0F, 0F, 18, 41, 2, 0.0F);		//Top Right Wing
		topWingModel[2].rotateAngleX = -1.570796F;
		topWingModel[2].setRotationPoint(-9F, -20F, -9F);

		tailModel = new NMTModelRenderer[2];
		tailModel[0] = new NMTModelRenderer(this, 0, 43, textureX, textureY);
		tailModel[1] = new NMTModelRenderer(this, 0, 32, textureX, textureY);
		
        tailModel[0].addBox(11F, -2F , -5F, 40, 8, 10, 0.0F);		//Tail
		tailModel[1].addBox(44F, 6F, -1F, 4, 4, 2, 0.0F);			//Tail Wheel
		
		//These two must still be initialized even when not used to avoid errors.
		pitchFlapLeftWingModel = new NMTModelRenderer[0];
		pitchFlapRightWingModel = new NMTModelRenderer[0];

		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
    }
}
