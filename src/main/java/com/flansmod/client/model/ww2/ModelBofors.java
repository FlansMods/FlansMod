package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBofors extends ModelVehicle
{
    public ModelBofors()
    {
        bodyModel = new ModelRendererTurbo[5];
        bodyModel[0] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        bodyModel[2] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        bodyModel[3] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        bodyModel[4] = new ModelRendererTurbo(this, 0, 0, 128, 64);

        bodyModel[0].addBox(-16F, -4F , -8F, 32, 2, 16, 0.0F);	//Base piece
		bodyModel[1].addBox(-18F, -6F , -10F, 6, 6, 2, 0.0F);	//Wheel
		bodyModel[2].addBox(-18F, -6F , 8F, 6, 6, 2, 0.0F);	//Wheel
		bodyModel[3].addBox(12F, -6F , -10F, 6, 6, 2, 0.0F);	//Wheel
		bodyModel[4].addBox(12F, -6F , 8F, 6, 6, 2, 0.0F);	//Wheel
		
		turretModel = new ModelRendererTurbo[2];
		turretModel[0] = new ModelRendererTurbo(this, 0, 18, 128, 64);
		turretModel[1] = new ModelRendererTurbo(this, 0, 36, 128, 64);

		turretModel[0].addBox(-6F, -18F , -2F, 12, 14, 4, 0.0F);	//swivelling turret piece
        turretModel[1].addBox(-6F, -8F , 2F, 12, 2, 12, 0.0F);	//seat
		
        barrelModel = new ModelRendererTurbo[2];
        barrelModel[0] = new ModelRendererTurbo(this, 0, 50, 128, 64);
        barrelModel[0].addBox(0F, 0F , 0F, 30, 4, 4, 0.0F);
        barrelModel[0].setRotationPoint(-6F, -12F, -6F);
		
		barrelModel[1] = new ModelRendererTurbo(this, 0, 58, 128, 64);	
		barrelModel[1].addBox(30F, 1F , 1F, 20, 2, 2, 0.0F);
        barrelModel[1].setRotationPoint(-6F, -12F, -6F);
		
		//Even though I can't be bothered to add ammo models, this definition is still needed
		ammoModel = new ModelRendererTurbo[0][0];

		translateAll(0F, 8F, 0F);
		
		flipAll(); //Used to fix old models
    }
}
