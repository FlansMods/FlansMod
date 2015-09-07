package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFlakvierling extends ModelAAGun
{
    public ModelFlakvierling()
    {
        baseModel = new ModelRendererTurbo[4];
        baseModel[0] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        baseModel[1] = new ModelRendererTurbo(this, 0, 18, 128, 64);
        baseModel[2] = new ModelRendererTurbo(this, 0, 18, 128, 64);
        baseModel[3] = new ModelRendererTurbo(this, 0, 18, 128, 64);

        baseModel[0].addBox(-4F, 8F , -4F, 8, 2, 8, 0.0F);	//Base piece
		baseModel[1].addBox(-20F, -4F , -4F, 8, 4, 8, 0.0F);	//Support
		baseModel[2].addBox(4F, -4F , 8F, 8, 4, 8, 0.0F);		//Support
		baseModel[3].addBox(4F, -4F , -16F, 8, 4, 8, 0.0F);		//Support
		
		seatModel = new ModelRendererTurbo[5];
        seatModel[0] = new ModelRendererTurbo(this, 0, 30, 128, 64);	
		seatModel[1] = new ModelRendererTurbo(this, 96, 0, 128, 64);	
		seatModel[2] = new ModelRendererTurbo(this, 96, 0, 128, 64);	
		seatModel[3] = new ModelRendererTurbo(this, 0, 48, 128, 64);	
		seatModel[4] = new ModelRendererTurbo(this, 0, 48, 128, 64);	

        seatModel[0].addBox(-8F, -6F , -8F, 16, 2, 16, 0.0F);	//Base
		seatModel[1].addBox(6F, -26F , -20F, 2, 20, 14, 0.0F);	//Left armour
		seatModel[2].addBox(6F, -26F , 6F, 2, 20, 14, 0.0F);	//Right armour
		seatModel[3].addBox(-12F, -10F , 4F, 12, 1, 12, 0.0F);	//Seat
		seatModel[4].addBox(-8F, -9F , 5F, 2, 3, 2, 0.0F);		//Seat stick
		
		gunModel = new ModelRendererTurbo[1];
        gunModel[0] = new ModelRendererTurbo(this, 48, 18, 128, 64);
        gunModel[0].addBox(0F, 0F , 0F, 12, 12, 12, 0.0F);		//Gun Block

		barrelModel = new ModelRendererTurbo[4][1];
		barrelModel[0][0] = new ModelRendererTurbo(this, 64, 0, 128, 64);
		barrelModel[1][0] = new ModelRendererTurbo(this, 64, 0, 128, 64);
		barrelModel[2][0] = new ModelRendererTurbo(this, 64, 0, 128, 64);
		barrelModel[3][0] = new ModelRendererTurbo(this, 64, 0, 128, 64);	
		
		barrelModel[0][0].addBox(12F, 1F, 1F, 20, 2, 2, 0.0F);		//Gun
		barrelModel[1][0].addBox(12F, 9F, 1F, 20, 2, 2, 0.0F);		//Gun
		barrelModel[2][0].addBox(12F, 1F, 9F, 20, 2, 2, 0.0F);		//Gun
		barrelModel[3][0].addBox(12F, 9F, 9F, 20, 2, 2, 0.0F);		//Gun
		
		//Even though I can't be bothered to add ammo models, this definition is still needed
		ammoModel = new ModelRendererTurbo[0][0];

		barrelX = 0;
		barrelY = 16;
		barrelZ = 6;
		
		flipAll(); //Used to fix old models
    }
}
