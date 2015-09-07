package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSentryGun extends ModelAAGun 
{
	public ModelSentryGun()
    {
		int textureX = 64;
		int textureY = 64;
		
        baseModel = new ModelRendererTurbo[5];
        baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        baseModel[0].addBox(-4F, 16F , -4F, 8, 2, 8, 0.0F);	//Base piece
        
        baseModel[1] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
		baseModel[1].addShapeBox(-4F, 0F, -4F, 2, 16, 2, 0F, /* 0 */ 4F, 0F, 4F, /* 1 */ -4F, 0F, 4F, /* 2 */ -4F, 0F, -4F, /* 3 */ 4F, 0F, -4F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
        baseModel[2] = new ModelRendererTurbo(this, 40, 0, textureX, textureY);
		baseModel[2].addShapeBox(2F, 0F, -4F, 2, 16, 2, 0F, /* 0 */ -4F, 0F, 4F, /* 1 */ 4F, 0F, 4F, /* 2 */ 4F, 0F, -4F, /* 3 */ -4F, 0F, -4F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
 
        baseModel[3] = new ModelRendererTurbo(this, 48, 0, textureX, textureY);
		baseModel[3].addShapeBox(2F, 0F, 2F, 2, 16, 2, 0F, /* 0 */ -4F, 0F, -4F, /* 1 */ 4F, 0F, -4F, /* 2 */ 4F, 0F, 4F, /* 3 */ -4F, 0F, 4F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	

        baseModel[4] = new ModelRendererTurbo(this, 56, 0, textureX, textureY);
		baseModel[4].addShapeBox(-4F, 0F, 2F, 2, 16, 2, 0F, /* 0 */ 4F, 0F, -4F, /* 1 */ -4F, 0F, -4F, /* 2 */ -4F, 0F, 4F, /* 3 */ 4F, 0F, 4F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	

		//"Seat" model
		seatModel = new ModelRendererTurbo[5];
		
		seatModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);	//Base	
		seatModel[0].addBox(-4F, 18F , -4F, 8, 1, 8, 0.0F);	
		
		seatModel[1] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);	//Side bit	
		seatModel[1].addBox(-2F, 19F , -4F, 4, 7, 1, 0.0F);	
		
		seatModel[2] = new ModelRendererTurbo(this, 16, 19, textureX, textureY);	//Side bit	
		seatModel[2].addBox(-2F, 19F , 3F, 4, 7, 1, 0.0F);	
		
		seatModel[3] = new ModelRendererTurbo(this, 0, 27, textureX, textureY);	//Ammo box	
		seatModel[3].addBox(-3F, 18F , 4F, 6, 6, 2, 0.0F);	
		
		seatModel[4] = new ModelRendererTurbo(this, 17, 27, textureX, textureY);	//Camera
		seatModel[4].addBox(-3F, 19F , -9F, 6, 5, 5, 0.0F);	
			
		//Gun model
		gunModel = new ModelRendererTurbo[4];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 37, textureX, textureY);
		gunModel[0].addBox(-4F, -3F, -3F, 8, 6, 6, 0.0F);		//Gun Block
		       
		gunModel[1] = new ModelRendererTurbo(this, 0, 49, textureX, textureY);
		gunModel[1].addBox(4F, -1F, -2F, 2, 4, 4, 0.0F);		//Gun Block

		gunModel[2] = new ModelRendererTurbo(this, 12, 49, textureX, textureY);
		gunModel[2].addBox(8F, -1F, -2F, 2, 4, 4, 0.0F);		//Barrel Connecty piece
		
		gunModel[3] = new ModelRendererTurbo(this, 24, 49, textureX, textureY);
		gunModel[3].addBox(14F, -1F, -2F, 4, 4, 4, 0.0F);		//Barrel Connecty piece
		
		barrelModel = new ModelRendererTurbo[4][1];
		
		barrelModel[0][0] = new ModelRendererTurbo(this, 34, 18, textureX, textureY);
		barrelModel[0][0].addBox(6F, 1.5F, 0.5F, 14, 1, 1, 0.0F);
		
		barrelModel[1][0] = new ModelRendererTurbo(this, 34, 20, textureX, textureY);
		barrelModel[1][0].addBox(6F, 1.5F, -1.5F, 14, 1, 1, 0.0F);
		
		barrelModel[2][0] = new ModelRendererTurbo(this, 34, 22, textureX, textureY);
		barrelModel[2][0].addBox(6F, -0.5F, -1.5F, 14, 1, 1, 0.0F);
		
		barrelModel[3][0] = new ModelRendererTurbo(this, 34, 24, textureX, textureY);
		barrelModel[3][0].addBox(6F, -0.5F, 0.5F, 14, 1, 1, 0.0F);

		
		//Even though I can't be bothered to add ammo models, this definition is still needed
		ammoModel = new ModelRendererTurbo[0][0];

		barrelX = 0;
		barrelY = 24;
		barrelZ = 0;
		
		//flipAll(); //Used to fix old models
    }
}
