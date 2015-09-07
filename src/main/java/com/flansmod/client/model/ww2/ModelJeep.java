package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelJeep extends ModelVehicle
{
    public ModelJeep()
    {
	
		int textureX = 128;
		int textureY = 128;
	
        bodyModel = new ModelRendererTurbo[11];	
		
	    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);
        bodyModel[2] = new ModelRendererTurbo(this, 0, 40, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 0, 40, textureX, textureY);
		bodyModel[4] = new ModelRendererTurbo(this, 60, 12, textureX, textureY);
        bodyModel[5] = new ModelRendererTurbo(this, 0, 43, textureX, textureY);
		bodyModel[6] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
        bodyModel[7] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
		bodyModel[8] = new ModelRendererTurbo(this, 32, 49, textureX, textureY);
        bodyModel[9] = new ModelRendererTurbo(this, 90, 28, textureX, textureY);
        bodyModel[10] = new ModelRendererTurbo(this, 66, 49, textureX, textureY);

	
		bodyModel[0].addBox(8F, -10F , -14F, 16, 12, 28, 0.0F);		//Bonnet
        bodyModel[1].addBox(-24F, 0F, -16F, 32, 2, 32, 0.0F);		//Floor
		bodyModel[2].addBox(8F, -4F, -16F, 16, 1, 2, 0.0F);			//Wheel cover
		bodyModel[3].addBox(8F, -4F, 14F, 16, 1, 2, 0.0F);			//Wheel cover
		bodyModel[4].addBox(-6F, -8F, -14F, 1, 8, 28, 0.0F);		//Mid seat
		bodyModel[5].addBox(-24F, -10F, -14F, 4, 10, 28, 0.0F);		//Back seat
		bodyModel[6].addBox(-24F, -10F, -16F, 32, 10, 2, 0.0F);		//Door
		bodyModel[7].addBox(-24F, -10F, -16F, 32, 10, 2, 0.0F);		//Door
		bodyModel[7].doMirror(false, false, true);
		bodyModel[8].addBox(8F, -18F, -16F, 1, 8, 32, 0.0F);		//Windshield
		bodyModel[9].addBox(-4F, -4F, -1F, 8, 8, 2, 0.0F);			//Spare Wheel
		bodyModel[9].rotateAngleY = 3.14159265F / 2F;
		bodyModel[9].setRotationPoint(-25F, -6F, 0F);
		bodyModel[10].addBox(-6F, -22F, -0.5F, 1, 14, 1, 0.0F);		//Gun pole
		
		leftBackWheelModel = new ModelRendererTurbo[1];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 90, 22, textureX, textureY);
		leftBackWheelModel[0].addBox(-20F, 2F, -15F, 8, 4, 2, 0.0F);
		
		rightBackWheelModel = new ModelRendererTurbo[1];		
        rightBackWheelModel[0] = new ModelRendererTurbo(this, 90, 22, textureX, textureY);		
		rightBackWheelModel[0].addBox(-20F, 2F, 13F, 8, 4, 2, 0.0F);
		
		leftFrontWheelModel = new ModelRendererTurbo[1];			
	    leftFrontWheelModel[0] = new ModelRendererTurbo(this, 90, 28, textureX, textureY);
		leftFrontWheelModel[0].addBox(-4F, -4F, -1F, 8, 8, 2, 0.0F);
		leftFrontWheelModel[0].setRotationPoint(16F, 2F, 15F);		
		
		rightFrontWheelModel = new ModelRendererTurbo[1];	
        rightFrontWheelModel[0] = new ModelRendererTurbo(this, 90, 28, textureX, textureY);		
        rightFrontWheelModel[0].addBox(-4F, -4F, -1F, 8, 8, 2, 0.0F);
		rightFrontWheelModel[0].setRotationPoint(16F, 2F, -15F);		
		
		//Gun model stolen from the browning
		ModelRendererTurbo[][] browningModel = new ModelRendererTurbo[3][];
		
		//No yaw only part
		browningModel[0] = new ModelRendererTurbo[0];
		
		//The main gun part
		browningModel[1] = new ModelRendererTurbo[4];
		browningModel[1][0] = new ModelRendererTurbo(this, 66, 73, textureX, textureY);
		browningModel[1][1] = new ModelRendererTurbo(this, 66, 79, textureX, textureY);
		browningModel[1][2] = new ModelRendererTurbo(this, 80, 68, textureX, textureY);
		browningModel[1][3] = new ModelRendererTurbo(this, 66, 64, textureX, textureY);	//Ammo box
		
		browningModel[1][0].addBox(-7F, -1.5F, -1.5F, 12, 3, 3);
		browningModel[1][1].addBox(5F, -0.5F, -0.5F, 10, 1, 1);
		browningModel[1][2].addBox(-9F, 0F, -1F, 2, 3, 2);		
		browningModel[1][3].addBox(1F, -1F, -6F, 2, 4, 5);
		
		//Set the origin
		for(ModelRendererTurbo gunPart : browningModel[1])
			gunPart.setRotationPoint(-6F, -22F, 0F);
		
		//No recoil part
		browningModel[2] = new ModelRendererTurbo[0];
				
		registerGunModel("Browning", browningModel);
		
		flipAll(); //For old models
		translateAll(0, -4, 0);
    }
}
