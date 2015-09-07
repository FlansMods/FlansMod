package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCobra extends ModelPlane 
{
	public ModelCobra()
    {
		int textureX = 512; //The x-size of the texture
		int textureY = 256;	//The y-size of the texture
	
        bodyModel = new ModelRendererTurbo[12];
        
        bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); //Main body section
		bodyModel[0].addBox(-24F, 8F, -10F, 48, 32, 20);		
		
		bodyModel[1] = new ModelRendererTurbo(this, 0, 54, textureX, textureY); //Front body section
		bodyModel[1].addBox(-64F, 8F, -10F, 40, 16, 20);	
		
		bodyModel[2] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); //Cockpit back
		bodyModel[2].addShapeBox(-40F, 24F, -10F, 16, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, -2F, /* 5 */ 0F, 0F, -2F, /* 6 */ 0F, 0F, -2F, /* 7 */ 0F, 0F, -2F);
		
		bodyModel[3] = new ModelRendererTurbo(this, 74, 92, textureX, textureY); //Cockpit front
		bodyModel[3].addShapeBox(-64F, 24F, -10F, 24, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -6F, -6F, -2F, /* 5 */ 0F, 0F, -2F, /* 6 */ 0F, 0F, -2F, /* 7 */ -6F, -6F, -2F);
		
		bodyModel[4] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); //Cockpit back inside
		bodyModel[4].flip = true;
		bodyModel[4].addShapeBox(-40F, 24F, -10F, 16, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, -2F, /* 5 */ 0F, 0F, -2F, /* 6 */ 0F, 0F, -2F, /* 7 */ 0F, 0F, -2F);
		
		bodyModel[5] = new ModelRendererTurbo(this, 74, 92, textureX, textureY); //Cockpit front inside
		bodyModel[5].flip = true;
		bodyModel[5].addShapeBox(-64F, 24F, -10F, 24, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -6F, -6F, -2F, /* 5 */ 0F, 0F, -2F, /* 6 */ 0F, 0F, -2F, /* 7 */ -6F, -6F, -2F);
				
		bodyModel[6] = new ModelRendererTurbo(this, 0, 130, textureX, textureY); //Top blade base
		bodyModel[6].addTrapezoid(-24F, 40F, -10F, 48, 8, 20, 0F, -4F, ModelRendererTurbo.MR_BOTTOM);	
		
        bodyModel[7] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); //Rear jet
		bodyModel[7].addBox(24F, 26F, -6F, 8, 12, 12);		
		
		bodyModel[8] = new ModelRendererTurbo(this, 42, 160, textureX, textureY); //Side jet
		bodyModel[8].addBox(0F, 26F, 10F, 24, 12, 4);		

		bodyModel[9] = new ModelRendererTurbo(this, 42, 178, textureX, textureY); //Side jet
		bodyModel[9].addBox(0F, 26F, -14F, 24, 12, 4);		
		
		bodyModel[10] = new ModelRendererTurbo(this, 162, 114, textureX, textureY); //Front body section insides
		bodyModel[10].flip = true;
		bodyModel[10].addBox(-64F, 8F, -10F, 40, 16, 20);	

		bodyModel[11] = new ModelRendererTurbo(this, 162, 176, textureX, textureY); //Nose piece
		bodyModel[11].addTrapezoid(-72F, 16F, -10F, 8, 8, 20, 0F, -3F, ModelRendererTurbo.MR_RIGHT);	

		//Right wing
		rightWingModel = new ModelRendererTurbo[4];
		    
		rightWingModel[0] = new ModelRendererTurbo(this, 162, 52, textureX, textureY); //Main piece
		rightWingModel[0].addShapeBox(-12F, 21F, -38F, 24, 2, 28, 0F, /* 0 */ -8F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -8F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);			
        
		rightWingModel[1] = new ModelRendererTurbo(this, 162, 84, textureX, textureY); //Tip
		rightWingModel[1].addBox(-8F, 20F, -42F, 24, 4, 4);	
		
		rightWingModel[2] = new ModelRendererTurbo(this, 162, 94, textureX, textureY); //Missile launcher connecting piece
		rightWingModel[2].addBox(-4F, 19F, -30F, 16, 2, 2);	
		
		rightWingModel[3] = new ModelRendererTurbo(this, 162, 100, textureX, textureY); //Missile launcher box
		rightWingModel[3].addBox(-8F, 13F, -32F, 24, 6, 6);	
		
		//Left wing
		leftWingModel = new ModelRendererTurbo[4];
		    
		leftWingModel[0] = new ModelRendererTurbo(this, 268, 52, textureX, textureY); //Main piece
		leftWingModel[0].addShapeBox(-12F, 21F, 10F, 24, 2, 28, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ -8F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -8F, 0F, 0F);			
        
		leftWingModel[1] = new ModelRendererTurbo(this, 268, 84, textureX, textureY); //Tip
		leftWingModel[1].addBox(-8F, 20F, 38F, 24, 4, 4);	
		
		leftWingModel[2] = new ModelRendererTurbo(this, 268, 94, textureX, textureY); //Missile launcher connecting piece
		leftWingModel[2].addBox(-4F, 19F, 28F, 16, 2, 2);	
		
		leftWingModel[3] = new ModelRendererTurbo(this, 268, 100, textureX, textureY); //Missile launcher box
		leftWingModel[3].addBox(-8F, 13F, 26F, 24, 6, 6);	
		
		//Skids
		skidsModel = new ModelRendererTurbo[6];
		
		skidsModel[0] = new ModelRendererTurbo(this, 0, 196, textureX, textureY); //Skid
		skidsModel[0].addBox(-48F, -4F, -24F, 72, 2, 4);		
		
		skidsModel[1] = new ModelRendererTurbo(this, 0, 204, textureX, textureY); //Skid
		skidsModel[1].addBox(-48F, -4F, 20F, 72, 2, 4);				
		
		skidsModel[2] = new ModelRendererTurbo(this, 100, 160, textureX, textureY); //Strut
		skidsModel[2].addShapeBox(-24F, -2F, 8F, 2, 10, 2, 0F, /* 0 */ 0F, 0F, -12F, /* 1 */ 0F, 0F, -12F, /* 2 */ 0F, 0F, 12F, /* 3 */ 0F, 0F, 12F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);				

		skidsModel[3] = new ModelRendererTurbo(this, 110, 160, textureX, textureY); //Strut
		skidsModel[3].addShapeBox(16F, -2F, 8F, 2, 10, 2, 0F, /* 0 */ 0F, 0F, -12F, /* 1 */ 0F, 0F, -12F, /* 2 */ 0F, 0F, 12F, /* 3 */ 0F, 0F, 12F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);				
		
		skidsModel[4] = new ModelRendererTurbo(this, 120, 160, textureX, textureY); //Strut
		skidsModel[4].addShapeBox(-24F, -2F, -10F, 2, 10, 2, 0F, /* 0 */ 0F, 0F, 12F, /* 1 */ 0F, 0F, 12F, /* 2 */ 0F, 0F, -12F, /* 3 */ 0F, 0F, -12F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);				

		skidsModel[5] = new ModelRendererTurbo(this, 130, 160, textureX, textureY); //Strut
		skidsModel[5].addShapeBox(16F, -2F, -10F, 2, 10, 2, 0F, /* 0 */ 0F, 0F, 12F, /* 1 */ 0F, 0F, 12F, /* 2 */ 0F, 0F, -12F, /* 3 */ 0F, 0F, -12F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);				
		
		
			
		tailModel = new ModelRendererTurbo[2];
		
		tailModel[0] = new ModelRendererTurbo(this, 138, 0, textureX, textureY); //Tail
		tailModel[0].addShapeBox(24F, 8F, -10F, 80, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -8F, -8F, /* 2 */ 0F, -8F, -8F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, -8F, /* 6 */ 0F, 0F, -8F, /* 7 */ 0F, 0F, 0F);

		tailModel[1] = new ModelRendererTurbo(this, 340, 0, textureX, textureY); //Tail fin
		tailModel[1].addShapeBox(88F, 24F, -2F, 16, 24, 4, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -20F, 0F, -1F, /* 5 */ 16F, 0F, -1F, /* 6 */ 16F, 0F, -1F, /* 7 */ -20F, 0F, -1F);

		
		//Main helicopter rotors
		heliMainRotorModels = new ModelRendererTurbo[1][4];
		
		heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 100, 184, textureX, textureY); //Stalk bit
		heliMainRotorModels[0][0].addBox(-1F, 48F, -1F, 2, 8, 2);	
		
		heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 110, 184, textureX, textureY); //Bit between the blades
		heliMainRotorModels[0][1].addBox(-4F, 56F, -2F, 8, 1, 4);	
		
		heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 0, 212, textureX, textureY); //Blade
		heliMainRotorModels[0][2].addBox(4F, 56F, -2F, 72, 1, 8);	
		
		heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 0, 223, textureX, textureY); //Blade
		heliMainRotorModels[0][3].addBox(4F, 56F, -2F, 72, 1, 8);	
		heliMainRotorModels[0][3].rotateAngleY = (float)Math.PI;
				
		//The helicopter rotor origins for rendering. Better than the old propeller rotation point code
		heliMainRotorOrigins = new Vector3f[] { new Vector3f(0F, 48F / 16F, 0F) }; 
		
		
		//Tail helicopter rotors
		heliTailRotorModels = new ModelRendererTurbo[1][4];
		
		heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 138, 38, textureX, textureY); //Stalk bit
		heliTailRotorModels[0][0].addBox(111.5F, 43.5F, 1F, 1, 1, 4);	
		
		heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 150, 38, textureX, textureY); //Bit between the blades
		heliTailRotorModels[0][1].addBox(110F, 43.5F, 5F, 4, 1, 1);	
		
		heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 150, 42, textureX, textureY); //Blade
		heliTailRotorModels[0][2].addBox(114F, 43F, 5F, 8, 2, 1);	
		
		heliTailRotorModels[0][3] = new ModelRendererTurbo(this, 150, 46, textureX, textureY); //Blade
		heliTailRotorModels[0][3].addBox(102F, 43F, 5F, 8, 2, 1);	

		//The helicopter rotor origins for rendering. Better than the old propeller rotation point code
		heliTailRotorOrigins = new Vector3f[] { new Vector3f(112F / 16F, 44F / 16F, 1F / 16F) }; 
		
		heliRotorSpeeds = new float[] { 1F };

		ModelRendererTurbo[][] noseGun = new ModelRendererTurbo[4][];
		//A swivel chair for the dorsal gunner with some gun supports
		noseGun[0] = new ModelRendererTurbo[0];

		//A single barrel with no recoil effects
		noseGun[1] = new ModelRendererTurbo[1];
		noseGun[1][0] = new ModelRendererTurbo(this, 198, 206, textureX, textureY);
		noseGun[1][0].addBox(-4, -3, -3, 8, 6, 6); 	
		
		//No recoil part just yet
		noseGun[2] = new ModelRendererTurbo[0];
		
		//A single barrel with no recoil effects
		noseGun[3] = new ModelRendererTurbo[6];
		noseGun[3][0] = new ModelRendererTurbo(this, 162, 206, textureX, textureY);
		noseGun[3][0].addBox(4, -3, -3, 2, 6, 6); 
		
		noseGun[3][1] = new ModelRendererTurbo(this, 162, 220, textureX, textureY);
		noseGun[3][1].addBox(6, -2, -2, 16, 1, 1); 
		
		noseGun[3][2] = new ModelRendererTurbo(this, 162, 224, textureX, textureY);
		noseGun[3][2].addBox(6, -2, 1, 16, 1, 1); 
		
		noseGun[3][3] = new ModelRendererTurbo(this, 162, 228, textureX, textureY);
		noseGun[3][3].addBox(6, 1, -2, 16, 1, 1); 
		
		noseGun[3][4] = new ModelRendererTurbo(this, 162, 232, textureX, textureY);
		noseGun[3][4].addBox(6, 1, 1, 16, 1, 1); 
	
		noseGun[3][5] = new ModelRendererTurbo(this, 180, 206, textureX, textureY);
		noseGun[3][5].addBox(18, -3, -3, 2, 6, 6); 
		
		for(ModelRendererTurbo[] dorsalGunParts : noseGun)
			for(ModelRendererTurbo dorsalGunPart : dorsalGunParts)
				dorsalGunPart.setRotationPoint(-64, 12, 0);
		
		registerGunModel("Nose", noseGun);
		
		translateAll(0F, -20F, 0F);
		
		//Shapebox template
		//bodyModel[2].addShapeBox(24F, 24F, -10F, 16, 16, 20, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
    }
}
