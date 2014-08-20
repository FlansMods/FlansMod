package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCobra extends ModelPlane 
{
	public ModelCobra()
    {
		int textureX = 256; //The x-size of the texture
		int textureY = 128;	//The y-size of the texture
	
        bodyModel = new ModelRendererTurbo[8];
        
        bodyModel[0] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Main body section
		bodyModel[0].addBox(-24F, 8F, -10F, 48, 32, 20);		
		
		bodyModel[1] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Front body section
		bodyModel[1].addBox(-64F, 8F, -10F, 40, 16, 20);	
		
		bodyModel[2] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Cockpit back
		bodyModel[2].addShapeBox(-40F, 24F, -10F, 16, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, -2F, /* 5 */ 0F, 0F, -2F, /* 6 */ 0F, 0F, -2F, /* 7 */ 0F, 0F, -2F);
		
		bodyModel[3] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Cockpit front
		bodyModel[3].addShapeBox(-64F, 24F, -10F, 24, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -6F, -6F, -2F, /* 5 */ 0F, 0F, -2F, /* 6 */ 0F, 0F, -2F, /* 7 */ -6F, -6F, -2F);
				
		bodyModel[4] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Top blade base
		bodyModel[4].addTrapezoid(-24F, 40F, -10F, 48, 8, 20, 0F, -4F, ModelRendererTurbo.MR_BOTTOM);	
		
        bodyModel[5] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Rear jet
		bodyModel[5].addBox(24F, 26F, -6F, 8, 12, 12);		
		
		bodyModel[6] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Side jet
		bodyModel[6].addBox(0F, 26F, 10F, 24, 12, 4);		

		bodyModel[7] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Side jet
		bodyModel[7].addBox(0F, 26F, -14F, 24, 12, 4);		

		
		
		//Skids
		skidsModel = new ModelRendererTurbo[6];
		
		skidsModel[0] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Skid
		skidsModel[0].addBox(-48F, -4F, -24F, 72, 2, 4);		
		
		skidsModel[1] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Skid
		skidsModel[1].addBox(-48F, -4F, 20F, 72, 2, 4);				
		
		skidsModel[2] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Strut
		skidsModel[2].addShapeBox(-24F, -2F, 8F, 2, 10, 2, 0F, /* 0 */ 0F, 0F, -12F, /* 1 */ 0F, 0F, -12F, /* 2 */ 0F, 0F, 12F, /* 3 */ 0F, 0F, 12F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);				

		skidsModel[3] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Strut
		skidsModel[3].addShapeBox(16F, -2F, 8F, 2, 10, 2, 0F, /* 0 */ 0F, 0F, -12F, /* 1 */ 0F, 0F, -12F, /* 2 */ 0F, 0F, 12F, /* 3 */ 0F, 0F, 12F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);				
		
		skidsModel[4] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Strut
		skidsModel[4].addShapeBox(-24F, -2F, -10F, 2, 10, 2, 0F, /* 0 */ 0F, 0F, 12F, /* 1 */ 0F, 0F, 12F, /* 2 */ 0F, 0F, -12F, /* 3 */ 0F, 0F, -12F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);				

		skidsModel[5] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); //Strut
		skidsModel[5].addShapeBox(16F, -2F, -10F, 2, 10, 2, 0F, /* 0 */ 0F, 0F, 12F, /* 1 */ 0F, 0F, 12F, /* 2 */ 0F, 0F, -12F, /* 3 */ 0F, 0F, -12F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);				
		
		
			
		tailModel = new ModelRendererTurbo[2];
		
		tailModel[0] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Tail
		tailModel[0].addShapeBox(24F, 8F, -10F, 80, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -8F, -8F, /* 2 */ 0F, -8F, -8F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, -8F, /* 6 */ 0F, 0F, -8F, /* 7 */ 0F, 0F, 0F);

		tailModel[1] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Tail fin
		tailModel[1].addShapeBox(88F, 24F, -2F, 16, 24, 4, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -20F, 0F, -1F, /* 5 */ 16F, 0F, -1F, /* 6 */ 16F, 0F, -1F, /* 7 */ -20F, 0F, -1F);

		
		//Main helicopter rotors
		heliMainRotorModels = new ModelRendererTurbo[1][4];
		
		heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Stalk bit
		heliMainRotorModels[0][0].addBox(-1F, 48F, -1F, 2, 8, 2);	
		
		heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Bit between the blades
		heliMainRotorModels[0][1].addBox(-4F, 56F, -2F, 8, 1, 4);	
		
		heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Blade
		heliMainRotorModels[0][2].addBox(4F, 56F, -2F, 72, 1, 8);	
		
		heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Blade
		heliMainRotorModels[0][3].addBox(-76F, 56F, -6F, 72, 1, 8);	
		
		//The helicopter rotor origins for rendering. Better than the old propeller rotation point code
		heliMainRotorOrigins = new Vector3f[] { new Vector3f(0F, 48F / 16F, 0F) }; 
		
		
		//Tail helicopter rotors
		heliTailRotorModels = new ModelRendererTurbo[1][4];
		
		heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Stalk bit
		heliTailRotorModels[0][0].addBox(111.5F, 43.5F, 1F, 1, 1, 4);	
		
		heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Bit between the blades
		heliTailRotorModels[0][1].addBox(110F, 43.5F, 5F, 4, 1, 1);	
		
		heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Blade
		heliTailRotorModels[0][2].addBox(114F, 43F, 5F, 8, 2, 1);	
		
		heliTailRotorModels[0][3] = new ModelRendererTurbo(this, 60, 76, textureX, textureY); //Blade
		heliTailRotorModels[0][3].addBox(102F, 43F, 5F, 8, 2, 1);	

		//The helicopter rotor origins for rendering. Better than the old propeller rotation point code
		heliTailRotorOrigins = new Vector3f[] { new Vector3f(112F / 16F, 44F / 16F, 1F / 16F) }; 

		
		
		translateAll(0F, -20F, 0F);
		
		//Shapebox template
		//bodyModel[2].addShapeBox(24F, 24F, -10F, 16, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
    }
}
