package flansmod.client;

import flansmod.common.CollisionBox;
import net.minecraft.src.ModelRendererTurbo;

public class ModelBF109 extends ModelPlane
{
    public ModelBF109()
    {
		int textureX = 256; //The x-size of the texture
		int textureY = 128;	//The y-size of the texture
		//Initializing Model
	
        bodyModel = new ModelRendererTurbo[8];	//number of blocks in your model (0 is a block so its highest number block + 1)
	
		//Creates each block with texture co-ordinates starting at the first two values. Second 2 values are the overall size of the texture
		//I am using GaryCXJk's TurboModel thingy but you dont have to. 
		//It is recommended however as the base mod requires it so you will have it anyway and it allows you to use textures larger than 64 square. 
		//(Dont forget the crazy shapes you can make with it)
			
        bodyModel[0] = new ModelRendererTurbo(this, 0, 38, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 104, textureX, textureY);
        bodyModel[2] = new ModelRendererTurbo(this, 60, 76, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 60, 76, textureX, textureY);
        bodyModel[4] = new ModelRendererTurbo(this, 172, 12, textureX, textureY);
		bodyModel[5] = new ModelRendererTurbo(this, 116, 48, textureX, textureY);
		bodyModel[6] = new ModelRendererTurbo(this, 116, 48, textureX, textureY);
		bodyModel[7] = new ModelRendererTurbo(this, 0, 76, textureX, textureY);

		//Front block
		bodyModel[0].addTrapezoid(-51F, -16F, -10F, 48, 18, 20, 0.0F, -3.0F, ModelRendererTurbo.MR_RIGHT);
		bodyModel[0].setPosition(0F, 5F, 0F);
		
		//Cockpit Bottom
		bodyModel[1].addBox(-3F, 0F, -31F, 20, 2, 20);
		bodyModel[1].setPosition(0F, 5F, 21F);
		
		//Cockpit sides
		bodyModel[2].addBox(-3F, -16F, -10F, 20, 16, 2);
		bodyModel[2].setPosition(0F, 5F, 0F);
		
		bodyModel[3].addBox(-17F, -16F, -10F, 20, 16, 2);
		bodyModel[3].rotateAngleY = 3.14159265358979F;
		bodyModel[3].setPosition(0F, 5F, 0F);
		
		//Propeller Centre
        bodyModel[4].addBox(0F, -2F , 0F, 4, 4, 4, 0.0F);
		bodyModel[4].setPosition(-55F, 0F, -2F);

		//Wheels
        bodyModel[5].addBox(4F, 6F, 5F, 6, 6, 4, 0.0F);
		bodyModel[6].addBox(4F, 6F, -8F, 6, 6, 4, 0.0F);

		//Cockpit
		bodyModel[7].addTrapezoid(-3F, -19F, -10F, 20, 8, 20, 0.0F, -3.0F, ModelRendererTurbo.MR_TOP);
		

		
		tailModel = new ModelRendererTurbo[3];
		tailModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		tailModel[1] = new ModelRendererTurbo(this, 116, 48, textureX, textureY);	
		tailModel[2] = new ModelRendererTurbo(this, 200, 12, textureX, textureY);
				
		tailModel[0].addTrapezoid(17F, -16F, -10F, 76, 18, 20, 0.0F, -3.0F, ModelRendererTurbo.MR_LEFT);
		tailModel[0].setPosition(0F, 5F, 0F);
		tailModel[1].addBox(79F, 6F, -2F, 6, 6, 4, 0.0F);
		tailModel[2].addBox(81F, 0F, -1F, 2, 8, 2, 0.0F);		
		
		leftWingModel = new ModelRendererTurbo[2];
	    leftWingModel[0] = new ModelRendererTurbo(this, 58, 48, textureX, textureY);
		leftWingModel[1] = new ModelRendererTurbo(this, 172, 0, textureX, textureY);	
		
		leftWingModel[0].addBox(-25F, -2F, 0F, 32, 2, 78, 0.0F);	//Wing
		leftWingModel[0].setPosition(0F, 5F, 0F);
        leftWingModel[1].addTrapezoid(-25F, 3F , 78F, 32, 2, 10, 0.0F, -1.0F, ModelRendererTurbo.MR_BACK);	//Wingtip	
		
		rightWingModel = new ModelRendererTurbo[2];
		rightWingModel[0] = new ModelRendererTurbo(this, 58, 48, textureX, textureY);
		rightWingModel[1] = new ModelRendererTurbo(this, 172, 0, textureX, textureY);	
				
		rightWingModel[0].addBox(-32F, -2F, -78F, 32, 2, 78); //Wing
		rightWingModel[0].rotateAngleY = 3.14159265358979F;
		rightWingModel[0].setPosition(-25F, 5F, -78F);
        rightWingModel[1].addTrapezoid(-32F, 3F , -88F, 32, 2, 10, 0.0F, -1.0F, ModelRendererTurbo.MR_BACK);	//Wingtip
		rightWingModel[1].rotateAngleY = 3.14159265258979F;
		rightWingModel[1].setPosition(-25F,0F,-166F);

		propellerModels = new ModelRendererTurbo[1][3]; //1 propeller in 3 parts
        propellerModels[0][0] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); //Propeller 0 - Blade 0 : 192, 12 is the texture origin
        propellerModels[0][1] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); //Propeller 0 - Blade 1
        propellerModels[0][2] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); //Propeller 0 - Blade 2		
        propellerModels[0][0].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);		//Propeller Blades
        propellerModels[0][1].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);		//They will all be the same
        propellerModels[0][2].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);		
        propellerModels[0][0].setRotationPoint(-54, 0, 0);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(-54, 0, 0);	
        propellerModels[0][2].setRotationPoint(-54, 0, 0);	
		
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
		
		//These three must still be initialized even when not used to avoid errors.
		topWingModel = new ModelRendererTurbo[0];
		pitchFlapLeftWingModel = new ModelRendererTurbo[0];
		pitchFlapRightWingModel = new ModelRendererTurbo[0];

		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
		
		collisionBoxes = new CollisionBox[7]; //Add collision boxes
		collisionBoxes[0] = new CollisionBox(0, 0, -32, 3); //Tail
		collisionBoxes[1] = new CollisionBox(0, 0, -80, 3); //Tail 
		collisionBoxes[2] = new CollisionBox(40, 0, 10, 2);	//Left Wing
		collisionBoxes[3] = new CollisionBox(70, 0, 10, 2);	//Left Wing
		collisionBoxes[4] = new CollisionBox(-40, 0, 10, 1); //Right Wing
		collisionBoxes[5] = new CollisionBox(-70, 0, 10, 1); //Right Wing
		collisionBoxes[6] = new CollisionBox(0, 0, 40, 0); //Front Block
    }
}		
 