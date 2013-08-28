package co.uk.flansmods.client.model.ww2;

import co.uk.flansmods.client.model.ModelVehicle;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelSherman extends ModelVehicle
{
    public ModelSherman()
    {
		int textureX = 256;
		int textureY = 256;
	
        bodyModel = new ModelRendererTurbo[2];	
	    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 68, textureX, textureY);

		bodyModel[0].addBox(-40F, -16F, -24F, 80, 20, 48, 0.0F);		//Tank Body
        bodyModel[1].addTrapezoid(-40F, -32F, -24F, 80, 16, 48, 0.0F, -4.0F, ModelRendererTurbo.MR_TOP);		//Sloped body
		
		turretModel = new ModelRendererTurbo[2];
		turretModel[0] = new ModelRendererTurbo(this, 0, 132, textureX, textureY);
		turretModel[1] = new ModelRendererTurbo(this, 128, 132, textureX, textureY);
		
		turretModel[0].addTrapezoid(-16F, -44F, -16F, 32, 12, 32, 0.0F, -2.0F, ModelRendererTurbo.MR_TOP);	
		turretModel[1].flip = true;
		turretModel[1].addTrapezoid(-15.5F, -44F, -15.5F, 31, 9, 31, 0.0F, -1.5F, ModelRendererTurbo.MR_TOP);	

	
		barrelModel = new ModelRendererTurbo[1];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 176, textureX, textureY);
		
		barrelModel[0].addBox(-2F, -2F, -2F, 60, 4, 4, 0.0F);
		barrelModel[0].setRotationPoint(15F, -38F, 0F);	
		
		flipAll(); //For old models
		translateAll(-4);
    }
}
