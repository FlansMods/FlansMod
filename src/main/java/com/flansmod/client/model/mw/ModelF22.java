package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelF22 extends ModelPlane 
{
	public ModelF22()
    {
		int textureX = 512; //The x-size of the texture
		int textureY = 512;	//The y-size of the texture
	
        bodyModel = new ModelRendererTurbo[3];
        
        bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); //Main body
		bodyModel[0].addBox(-48F, 8F, -32F, 128, 16, 64);	
		
        bodyModel[1] = new ModelRendererTurbo(this, 0, 80, textureX, textureY);
		bodyModel[1].addBox(80F, 10F, -24F, 8, 12, 16);	
		
        bodyModel[2] = new ModelRendererTurbo(this, 48, 80, textureX, textureY); 
		bodyModel[2].addBox(80F, 10F, 8F, 8, 12, 16);	
		
		
		noseModel = new ModelRendererTurbo[6];
		
		noseModel[0] = new ModelRendererTurbo(this, 0, 108, textureX, textureY);
		noseModel[0].addShapeBox(-80F, 8F, -32F, 32, 16, 64, 0F, /* 0 */ 0F, 0F, -16F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, -16F, /* 4 */ 0F, 0F, -16F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, -16F);		
				
		noseModel[1] = new ModelRendererTurbo(this, 0, 188, textureX, textureY); 
		noseModel[1].addShapeBox(-80F, 24F, -12F, 64, 16, 24, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, -16F, 0F, /* 6 */ 0F, -16F, 0F, /* 7 */ 0F, 0F, 0F);		

		noseModel[2] = new ModelRendererTurbo(this, 0, 228, textureX, textureY);
		noseModel[2].addShapeBox(-112F, 8F, -12F, 32, 32, 24, 0F, /* 0 */ 0F, 0F, -4F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, -4F, /* 4 */ 0F, -16F, -4F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -16F, -4F);		
		
		noseModel[3] = new ModelRendererTurbo(this, 0, 284, textureX, textureY);
		noseModel[3].addShapeBox(-144F, 8F, -8F, 32, 16, 16, 0F, /* 0 */ 0F, -4F, -8F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, -4F, -8F, /* 4 */ 0F, -12F, -8F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -12F, -8F);		
		
		noseModel[4] = new ModelRendererTurbo(this, 0, 356, textureX, textureY);
		noseModel[4].flip = true;
		noseModel[4].addShapeBox(-112F, 8F, -12F, 32, 32, 24, 0F, /* 0 */ 0F, 0F, -4F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, -4F, /* 4 */ 0F, -16F, -4F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -16F, -4F);		
		
		noseModel[5] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); 
		noseModel[5].flip = true;
		noseModel[5].addShapeBox(-80F, 24F, -12F, 24, 16, 24, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, -6F, 0F, /* 6 */ 0F, -6F, 0F, /* 7 */ 0F, 0F, 0F);		

		
		//Left wing
		
		leftWingModel = new ModelRendererTurbo[1];
		
		leftWingModel[0] = new ModelRendererTurbo(this, 192, 80, textureX, textureY);
		leftWingModel[0].addShapeBox(-16F, 12F, 32F, 64, 4, 64, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 32F, 0F, 0F, /* 2 */ 16F, 0F, 0F, /* 3 */ -48F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 32F, 0F, 0F, /* 6 */ 16F, 0F, 0F, /* 7 */ -48F, 0F, 0F);	
		
		//Right wing
		
		rightWingModel = new ModelRendererTurbo[1];
		
		rightWingModel[0] = new ModelRendererTurbo(this, 192, 150, textureX, textureY);
		rightWingModel[0].addShapeBox(-16F, 12F, -96F, 64, 4, 64, 0F, /* 0 */ -48F, 0F, 0F, /* 1 */ 16F, 0F, 0F, /* 2 */ 32F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -48F, 0F, 0F, /* 5 */ 16F, 0F, 0F, /* 6 */ 32F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		//Tail
		tailModel = new ModelRendererTurbo[4];
		
		tailModel[0] = new ModelRendererTurbo(this, 192, 220, textureX, textureY); //Tail
		tailModel[0].addShapeBox(64F, 15.99F, -64F, 40, 4, 32, 0F, /* 0 */ -16F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -16F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);

		tailModel[1] = new ModelRendererTurbo(this, 192, 256, textureX, textureY); //Tail fin
		tailModel[1].addShapeBox(64F, 15.99F, 32F, 40, 4, 32, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ -16F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -16F, 0F, 0F);
					
		tailModel[2] = new ModelRendererTurbo(this, 192, 300, textureX, textureY); //Tail
		tailModel[2].addShapeBox(48F, 16F, -36F, 48, 48, 4, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -16F, 0F, 16F, /* 5 */ 0F, 0F, 16F, /* 6 */ 0F, 0F, -16F, /* 7 */ -16F, 0F, -16F);
		
		tailModel[3] = new ModelRendererTurbo(this, 296, 300, textureX, textureY); //Tail
		tailModel[3].addShapeBox(48F, 16F, 32F, 48, 48, 4, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -16F, 0F, -16F, /* 5 */ 0F, 0F, -16F, /* 6 */ 0F, 0F, 16F, /* 7 */ -16F, 0F, 16F);
		
		bodyWheelModel = new ModelRendererTurbo[2];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 416, 0, textureX, textureY);
		bodyWheelModel[0].addBox(-58F, 0F, -3, 4, 8, 6);
		bodyWheelModel[1] = new ModelRendererTurbo(this, 384, 0, textureX, textureY);
		bodyWheelModel[1].addBox(-62F, -10F, -2, 12, 12, 4);
		
		tailWheelModel = new ModelRendererTurbo[4];
		
		for(int i = 0; i < 2; i++)
		{
			tailWheelModel[2*i] = new ModelRendererTurbo(this, 416, 0, textureX, textureY);
			tailWheelModel[2*i].addBox(58F, 0F, -27F + i * 48F, 4, 8, 6);
			tailWheelModel[2*i + 1] = new ModelRendererTurbo(this, 384, 0, textureX, textureY);
			tailWheelModel[2*i + 1].addBox(54F, -10F, -26F + i * 48F, 12, 12, 4);
		}
		
		translateAll(0F, 0F, 0F);
		
		//Shapebox template
		//bodyModel[2].addShapeBox(24F, 24F, -10F, 16, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
    }
}
