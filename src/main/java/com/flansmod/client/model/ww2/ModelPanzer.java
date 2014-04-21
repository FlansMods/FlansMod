package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPanzer extends ModelVehicle
{
    public ModelPanzer()
    {
		int textureX = 256;
		int textureY = 256;
	
        bodyModel = new ModelRendererTurbo[4];	
	    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 68, textureX, textureY);
	    bodyModel[2] = new ModelRendererTurbo(this, 0, 184, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 0, 184, textureX, textureY);
	
		bodyModel[0].addBox(-40F, -20F, -24F, 80, 20, 48, 0.0F);		//Tank Body
        bodyModel[1].addTrapezoid(-40F, -32F, -24F, 72, 12, 48, 0.0F, -2.0F, ModelRendererTurbo.MR_TOP);		//Sloped body
		bodyModel[2].addBox(-36F, -32F, -26F, 72, 20, 2, 0.0F);		//Left Panel
		bodyModel[3].addBox(-36F, -32F, -26F, 72, 20, 2, 0.0F);		//Right Panel
		bodyModel[3].rotateAngleY = 3.1415926535F;
		
		turretModel = new ModelRendererTurbo[2];
		turretModel[0] = new ModelRendererTurbo(this, 0, 132, textureX, textureY);
		turretModel[1] = new ModelRendererTurbo(this, 128, 132, textureX, textureY);
		turretModel[0].addTrapezoid(-16F, -6F, -16F, 32, 12, 32, 0.0F, -2.0F, ModelRendererTurbo.MR_TOP);	
		turretModel[1].flip = true;
		turretModel[1].addTrapezoid(-15.5F, -6F, -15.5F, 31, 9, 31, 0.0F, -1.5F, ModelRendererTurbo.MR_TOP);	
		
		turretModel[0].setRotationPoint(0F, -38F, 0F);	
		turretModel[1].setRotationPoint(0F, -38F, 0F);	
		
		barrelModel = new ModelRendererTurbo[1];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 176, textureX, textureY);
		barrelModel[0].addBox(-2F, -2F, -2F, 60, 4, 4, 0.0F);
		barrelModel[0].setRotationPoint(15F, -38F, 0F);	

		//Gun model stolen from the browning
		ModelRendererTurbo[][] mg42Model = new ModelRendererTurbo[3][];
		
		//Yaw only part
		mg42Model[0] = new ModelRendererTurbo[0];
		
		//The main gun part
		mg42Model[1] = new ModelRendererTurbo[4];
		mg42Model[1][0] = new ModelRendererTurbo(this, 0, 28, textureX, textureY);
		mg42Model[1][1] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		mg42Model[1][2] = new ModelRendererTurbo(this, 8, 26, textureX, textureY);
		mg42Model[1][3] = new ModelRendererTurbo(this, 18, 19, textureX, textureY);
		
		mg42Model[1][0].addBox(0F, 3F, -1F, 16, 2, 2);
		mg42Model[1][1].addBox(4F, 5F, -1F, 2, 3, 2);	
		mg42Model[1][2].addBox(16F, 3.5F, -0.5F, 4, 1, 1);		
		mg42Model[1][3].addBox(8F, 3F, -6F, 2, 4, 5);
		
		//Set the origin
		for(ModelRendererTurbo gunPart : mg42Model[1])
			gunPart.setRotationPoint(0F, -52F, 0F);
		
		//No recoil part
				mg42Model[2] = new ModelRendererTurbo[0];
				
		registerGunModel("MG42", mg42Model);
		
		flipAll(); //For old models
		translateAll(0, -8, 0);
    }
}
