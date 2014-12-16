package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelChinook extends ModelPlane 
{
	public ModelChinook()
    {
		int textureX = 1024; //The x-size of the texture
		int textureY = 512;	//The y-size of the texture
	
        bodyModel = new ModelRendererTurbo[9];
        
        bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); //Main body floor
		bodyModel[0].addBox(-96F, 8F, -32F, 192, 2, 64);	
		
        bodyModel[1] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); //Main body side
		bodyModel[1].addBox(-96F, 10F, -32F, 192, 64, 2);	
		
		bodyModel[2] = new ModelRendererTurbo(this, 0, 198, textureX, textureY); //Main body side
		bodyModel[2].addBox(-96F, 10F, 30F, 192, 64, 2);		

		bodyModel[3] = new ModelRendererTurbo(this, 0, 66, textureX, textureY); //Main body floor
		bodyModel[3].addBox(-96F, 74F, -32F, 192, 2, 64);
		
        bodyModel[4] = new ModelRendererTurbo(this, 0, 264, textureX, textureY); //Main body side bulge
		bodyModel[4].addShapeBox(-96F, 10F, -48F, 192, 32, 16, 0F, /* 0 */ -8F, -8F, 0F, /* 1 */ -8F, -8F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -8F, -8F, 0F, /* 5 */ -8F, -8F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);		
		
		bodyModel[5] = new ModelRendererTurbo(this, 0, 312, textureX, textureY); //Main body side bulge
		bodyModel[5].addShapeBox(-96F, 10F, 32F, 192, 32, 16, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ -8F, -8F, 0F, /* 3 */ -8F, -8F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ -8F, -8F, 0F, /* 7 */ -8F, -8F, 0F);	
		
        bodyModel[6] = new ModelRendererTurbo(this, 512, 314, textureX, textureY); //Seats
		bodyModel[6].addBox(-92F, 32F, -30F, 184, 2, 16);	
		
        bodyModel[7] = new ModelRendererTurbo(this, 512, 332, textureX, textureY); //Seats
		bodyModel[7].addBox(-92F, 32F, 14F, 184, 2, 16);	
		
        bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); //Inside floor piece
		bodyModel[8].addBox(-96F, 24F, -32F, 192, 2, 64);	
		
		bodyWheelModel = new ModelRendererTurbo[12];
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				bodyWheelModel[(3 * i + 6 * j)] = new ModelRendererTurbo(this, 624, 32, textureX, textureY); // Wheel connector
				bodyWheelModel[(3 * i + 6 * j)].addBox(0F, -8F, -2F, 4, 16, 4);
				bodyWheelModel[(3 * i + 6 * j)].setRotationPoint(-80F * (i == 0 ? 1 : -1), 0F, -24F * (j == 0 ? 1 : -1));
		
				bodyWheelModel[1 + 3 * i + 6 * j] = new ModelRendererTurbo(this, 640, 12, textureX, textureY); // Wheel
				bodyWheelModel[1 + 3 * i + 6 * j].addBox(-6F, -14F, -4F, 16, 16, 3);	
				bodyWheelModel[1 + 3 * i + 6 * j].setRotationPoint(-80F * (i == 0 ? 1 : -1), 0F, -24F * (j == 0 ? 1 : -1));
				
				bodyWheelModel[2 + 3 * i + 6 * j] = new ModelRendererTurbo(this, 640, 12, textureX, textureY); // Wheel
				bodyWheelModel[2 + 3 * i + 6 * j].addBox(-6F, -14F, 1F, 16, 16, 3);	
				bodyWheelModel[2 + 3 * i + 6 * j].setRotationPoint(-80F * (i == 0 ? 1 : -1), 0F, -24F * (j == 0 ? 1 : -1));
			}
		}

		
		noseModel = new ModelRendererTurbo[17];
		
		noseModel[0] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); //Cockpit floor 1
		noseModel[0].addShapeBox(-128F, 8F, -32F, 32, 2, 64, 0F, /* 0 */ 0F, -4F, -8F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, -4F, -8F, /* 4 */ 0F, 4F, -8F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 4F, -8F);	
		
		noseModel[1] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); //Cockpit wall 1
		noseModel[1].addShapeBox(-128F, 10F, -32F, 32, 64, 2, 0F, /* 0 */ 0F, -4F, -8F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, -4F, 8F, /* 4 */ -8F, -4F, -8F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -8F, -4F, 8F);	

		noseModel[2] = new ModelRendererTurbo(this, 68, 426, textureX, textureY); //Cockpit wall 2
		noseModel[2].addShapeBox(-128F, 10F, 30F, 32, 64, 2, 0F, /* 0 */ 0F, -4F, 8F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, -4F, -8F, /* 4 */ -8F, -4F, 8F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -8F, -4F, -8F);	

		noseModel[3] = new ModelRendererTurbo(this, 192, 360, textureX, textureY); //Cockpit ceiling 1
		noseModel[3].addShapeBox(-128F, 74F, -32F, 32, 2, 64, 0F, /* 0 */ -8F, 4F, -8F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ -8F, 4F, -8F, /* 4 */ -8F, -4F, -8F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -8F, -4F, -8F);	
		
		noseModel[4] = new ModelRendererTurbo(this, 136, 426, textureX, textureY); //Cockpit upper front panel
		noseModel[4].addShapeBox(-125.75F, 44F, -24F, 2, 28, 48, 0F, /* 0 */ 0F, 0.25F, -1F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0.25F, -1F, /* 4 */ -4F, 0F, 0F, /* 5 */ 4F, 0F, 0F, /* 6 */ 4F, 0F, 0F, /* 7 */ -4F, 0F, 0F);	
		
		noseModel[5] = new ModelRendererTurbo(this, 236, 426, textureX, textureY); //Cockpit floor 2
		noseModel[5].addShapeBox(-152F, 12F, -24F, 24, 2, 48, 0F, /* 0 */ 0F, -4F, -8F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, -4F, -8F, /* 4 */ 0F, 4F, -8F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 4F, -8F);	
		
		noseModel[6] = new ModelRendererTurbo(this, 128, 360, textureX, textureY); //Cockpit wall 3
		noseModel[6].addShapeBox(-152F, 14F, -24F, 24, 28, 2, 0F, /* 0 */ 0F, -4F, -8F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, -4F, 8F, /* 4 */ 0F, -4F, -8F, /* 5 */ 4F, 0F, 0F, /* 6 */ 4F, 0F, 0F, /* 7 */ 0F, -4F, 8F);	

		noseModel[7] = new ModelRendererTurbo(this, 128, 390, textureX, textureY); //Cockpit wall 4
		noseModel[7].addShapeBox(-152F, 14F, 22F, 24, 28, 2, 0F, /* 0 */ 0F, -4F, 8F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, -4F, -8F, /* 4 */ 0F, -4F, 8F, /* 5 */ 4F, 0F, 0F, /* 6 */ 4F, 0F, 0F, /* 7 */ 0F, -4F, -8F);	
		
		noseModel[8] = new ModelRendererTurbo(this, 320, 360, textureX, textureY); //Cockpit ceiling 2
		noseModel[8].addShapeBox(-152F, 42F, -24F, 24, 2, 48, 0F, /* 0 */ 0F, 4F, -8F, /* 1 */ 4F, 0F, 0F, /* 2 */ 4F, 0F, 0F, /* 3 */ 0F, 4F, -8F, /* 4 */ 0F, -4F, -8F, /* 5 */ 4.25F, 0F, 0F, /* 6 */ 4.25F, 0F, 0F, /* 7 */ 0F, -4F, -8F);	

		noseModel[9] = new ModelRendererTurbo(this, 448, 0, textureX, textureY); //Cockpit lower front panel
		noseModel[9].addShapeBox(-152F, 18F, -14F, 2, 20, 28, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		noseModel[10] = new ModelRendererTurbo(this, 512, 0, textureX, textureY); //Nose fin
		noseModel[10].addShapeBox(-96F, 76F, -4F, 48, 24, 8, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ -16F, 0F, 0F, /* 6 */ -16F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		
		noseModel[11] = new ModelRendererTurbo(this, 512, 32, textureX, textureY); //Nose fin
		noseModel[11].addShapeBox(-120F, 76F, -4F, 24, 24, 8, 0F, /* 0 */ 0F, 4F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 4F, 0F, /* 4 */ -16F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -16F, 0F, 0F);
			
		noseModel[12] = new ModelRendererTurbo(this, 512, 252, textureX, textureY); //Drivers seat base
		noseModel[12].addShapeBox(-124F, 24F, -30F, 28, 2, 60, 0F, /* 0 */ 0F, 0F, -8F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, -8F, /* 4 */ 0F, 0F, -8F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, -8F);

		noseModel[13] = new ModelRendererTurbo(this, 688, 196, textureX, textureY); //Drivers seat base 1
		noseModel[13].addBox(-112F, 26F, 8F, 16, 2, 16);	
		
		noseModel[14] = new ModelRendererTurbo(this, 688, 196, textureX, textureY); //Drivers seat base 2
		noseModel[14].addBox(-112F, 26F, -24F, 16, 2, 16);	
		
		noseModel[15] = new ModelRendererTurbo(this, 688, 214, textureX, textureY); //Drivers seat back 1
		noseModel[15].addBox(-96F, 26F, 8F, 2, 24, 16);	
		
		noseModel[16] = new ModelRendererTurbo(this, 688, 214, textureX, textureY); //Drivers seat back 2
		noseModel[16].addBox(-96F, 26F, -24F, 2, 24, 16);			
		
		//Tail
		tailModel = new ModelRendererTurbo[2];
		
		tailModel[0] = new ModelRendererTurbo(this, 512, 64, textureX, textureY); //Tail
		tailModel[0].addShapeBox(96F, 8F, -32F, 64, 68, 64, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -48F, -24F, /* 2 */ 0F, -48F, -24F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, -24F, /* 6 */ 0F, 0F, -24F, /* 7 */ 0F, 0F, 0F);

		tailModel[1] = new ModelRendererTurbo(this, 512, 196, textureX, textureY); //Tail fin
		tailModel[1].addShapeBox(80F, 76F, -4F, 80, 48, 8, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -16F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -16F, 0F, 0F);
			
		//Main helicopter rotors
		heliMainRotorModels = new ModelRendererTurbo[2][7];
		
		for(int j = 0; j < 2; j++)
		{
			heliMainRotorModels[j][0] = new ModelRendererTurbo(this, 624, 0, textureX, textureY); //Stalk bit
			heliMainRotorModels[j][0].addBox(-2F, 124F, -2F, 4, 8, 4);	
			
			for(int i = 0; i < 3; i++)
			{
				heliMainRotorModels[j][i * 2 + 1] = new ModelRendererTurbo(this, 640, 0, textureX, textureY); //Blade connecting bit
				heliMainRotorModels[j][i * 2 + 1].addBox(0F, 132F, -2F, 8, 1, 4);	
				heliMainRotorModels[j][i * 2 + 1].rotateAngleY = (float)Math.PI / 3F * i * 2F;
				
				heliMainRotorModels[j][i * 2 + 2] = new ModelRendererTurbo(this, 664, 0, textureX, textureY); //Blade
				heliMainRotorModels[j][i * 2 + 2].addBox(8F, 132F, -2F, 128, 1, 8);	
				heliMainRotorModels[j][i * 2 + 2].rotateAngleY = (float)Math.PI / 3F * i * 2F;
			}		
		}
		
		for(int i = 0; i < 7; i++)
			heliMainRotorModels[0][i].setRotationPoint(-84F, -24F, 0F);
		
		for(int i = 0; i < 7; i++)
			heliMainRotorModels[1][i].setRotationPoint(128F, 0F, 0F);
		
		//The helicopter rotor origins for rendering. Better than the old propeller rotation point code
		heliMainRotorOrigins = new Vector3f[] { new Vector3f(-84F / 16F, 48F / 16F, 0F), new Vector3f(128F / 16F, 48F / 16F, 0F) }; 
				
		heliRotorSpeeds = new float[] { 1F, 1F };
		
		translateAll(0F, -15F, 0F);
		
		//Shapebox template
		//bodyModel[2].addShapeBox(24F, 24F, -10F, 16, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
    }
}
