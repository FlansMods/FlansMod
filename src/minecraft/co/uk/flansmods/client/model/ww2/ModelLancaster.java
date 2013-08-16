package co.uk.flansmods.client.model.ww2;

import co.uk.flansmods.client.model.ModelPlane;
import co.uk.flansmods.client.tmt.Coord2D;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.client.tmt.Shape2D;

public class ModelLancaster extends ModelPlane
{
	/*
	Lancaster diagram
				_
			___|9|___
		   |___ 8 ___|
			   |7|
			   |6|					   
	 __________|5|__________	   
	|	        4           |
	|__________ 3 __________|
			   |2|
			   |1|
			   \0/
		
	*/
	
	private int textureX = 512; //The x-size of the texture
	private int textureY = 512;	//The y-size of the texture

    public ModelLancaster()
    {
		//Initializing Model
	
        bodyModel = new ModelRendererTurbo[19];	//number of blocks in your model (0 is a block so its highest number block + 1)
	
		//Creates each block with texture co-ordinates starting at the first two values. Second 2 values are the overall size of the texture
		//I am using GaryCXJk's TurboModel thingy but you dont have to. 
		//It is recommended however as the base mod requires it so you will have it anyway and it allows you to use textures larger than 64 square. 
		//(Dont forget the crazy shapes you can make with it)
		
		//Section 0
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addTrapezoid(-160, -80, -16, 16, 32, 32, 0.0F, -4.0F, ModelRendererTurbo.MR_RIGHT); //Front gunner window outside
		bodyModel[18] = new ModelRendererTurbo(this,0, 0, textureX, textureY);
		bodyModel[18].flip = true;
		bodyModel[18].addTrapezoid(-160, -80, -16, 16, 32, 32, 0.0F, -4.0F, ModelRendererTurbo.MR_RIGHT); //Front gunner window inside
		bodyModel[1] = new ModelRendererTurbo(this,64, 0, textureX, textureY);
		bodyModel[1].addBox(-144, -80, -15, 16, 1, 30, 0.0F); //Top panel
		
		//Section 1 / 2 / 3
		bodyModel[2] = new ModelRendererTurbo(this,127, 1, textureX, textureY);
		bodyModel[2].addBox(-144, -49, -15, 112, 1, 30, 0.0F); //Floor Upper Level
		bodyModel[3] = new ModelRendererTurbo(this,64, 32, textureX, textureY);
		bodyModel[3].addTrapezoid(-128, -96, -16, 64, 16, 32, 0.0F, -8.0F, ModelRendererTurbo.MR_TOP); //Pilot window outside
		bodyModel[16] = new ModelRendererTurbo(this,64, 32, textureX, textureY);
		bodyModel[16].flip = true;
		bodyModel[16].addTrapezoid(-128, -96, -16, 64, 16, 32, 0.0F, -8.0F, ModelRendererTurbo.MR_TOP); //Pilot window inside
		bodyModel[4] = new ModelRendererTurbo(this,0, 80, textureX, textureY);
		bodyModel[4].addBox(-144, -80, -16, 112, 32, 1, 0.0F); //Left Wall
		bodyModel[5] = new ModelRendererTurbo(this,0, 80, textureX, textureY);
		bodyModel[5].addBox(-144, -80, -16, 112, 32, 1, 0.0F); //Right Wall
		bodyModel[5].setRotationPoint(-176, 0, 0);
		bodyModel[5].rotateAngleY = (float)Math.PI;
		
		//Wings (4 / 5)

		bodyModel[6] = new ModelRendererTurbo(this,226, 80, textureX, textureY);
		bodyModel[6].addBox(-71, -96, -15, 103, 1, 30, 0.0F); //Main Body Top Panel
		bodyModel[7] = new ModelRendererTurbo(this,432, 24, textureX, textureY);
		bodyModel[7].addBox(-72, -96, -16, 1, 16, 32, 0.0F); //Main Body Front Panel by Cockpit
		
		//Section 5 / 6 / 7
		
		bodyModel[8] = new ModelRendererTurbo(this,0, 245, textureX, textureY);
		bodyModel[8].addBox(0, 0, -16, 199, 16, 1, 0.0F); //Main Body Top Right Panel
		bodyModel[8].setRotationPoint(-71, -96, 0);
		
		bodyModel[9] = new ModelRendererTurbo(this,0, 245, textureX, textureY);
		bodyModel[9].addBox(0, 0, -16, 199, 16, 1, 0.0F); //Main Body Top Left Panel
		bodyModel[9].setRotationPoint(-71, -96, 0);
		bodyModel[9].doMirror(false, false, true);
		
		bodyModel[10] = new ModelRendererTurbo(this,38, 262, textureX, textureY);
		bodyModel[10].addBox(0, 0, -16, 160, 16, 1, 0.0F); //Main Body Bottom Right Panel
		bodyModel[10].setRotationPoint(-32, -80, 0);
		
		bodyModel[11] = new ModelRendererTurbo(this,38, 262, textureX, textureY);
		bodyModel[11].addBox(0, 0, -16, 160, 16, 1, 0.0F); //Main Body Bottom Left Panel
		bodyModel[11].setRotationPoint(-32, -80, 0);
		bodyModel[11].doMirror(false, false, true);
			
		bodyModel[12] = new ModelRendererTurbo(this,144, 279, textureX, textureY);
		bodyModel[12].addTrapezoid(32, -112, -16, 32, 16, 32, 0.0F, -8.0F, ModelRendererTurbo.MR_TOP); //Gunner Window Outside
		
		bodyModel[17] = new ModelRendererTurbo(this,144, 279, textureX, textureY);
		bodyModel[17].flip = true;
		bodyModel[17].addTrapezoid(32, -112, -16, 32, 16, 32, 0.0F, -8.0F, ModelRendererTurbo.MR_TOP); //Gunner Window Inside
		
		ModelRendererTurbo[][] dorsalModel = new ModelRendererTurbo[3][];
		//No yaw only part
		dorsalModel[0] = new ModelRendererTurbo[0];
		//A single no recoil part
		dorsalModel[1] = new ModelRendererTurbo[1];
		dorsalModel[1][0] = new ModelRendererTurbo(this, 174, 123, textureX, textureY);
		dorsalModel[1][0].addBox(8, -1, -1, 24, 2, 2, 0F); 
		dorsalModel[1][0].setRotationPoint(48, -104, 0);
		//No recoil part just yet
		dorsalModel[2] = new ModelRendererTurbo[0];
		
		registerGunModel("dorsal", dorsalModel);
			
		//Underside
		bodyModel[13] = new ModelRendererTurbo(this,52, 362, textureX, textureY);
		bodyModel[13].addShape3D(128, -65, -15, 
		new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(160, 16, 160, 0), new Coord2D(160, 17, 160, 1), new Coord2D(0, 1, 0, 1) } ), 30, 160, 1, 322, 30, ModelRendererTurbo.MR_FRONT, new float[] { 1, 160, 1, 160 });
		//bodyModel[13].setPosition(0F, -52F, 0F);
		bodyModel[13].rotateAngleX = (float)Math.PI;
		
		bodyModel[14] = new ModelRendererTurbo(this,52, 345, textureX, textureY);
		bodyModel[14].addShape3D(128, -64, -16, 
		new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(160, 0, 160, 0), new Coord2D(160, 16, 160, 16) } ), 1, 160, 16, 336, 1, ModelRendererTurbo.MR_FRONT, new float[] { 160, 16, 160 });
		//bodyModel[14].setPosition(0F, -52F, 0F);
		bodyModel[14].rotateAngleX = (float)Math.PI;

		bodyModel[15] = new ModelRendererTurbo(this,52, 394, textureX, textureY);
		bodyModel[15].addShape3D(128, -64, 15, 
		new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(160, 0, 160, 0), new Coord2D(160, 16, 160, 16) } ), 1, 160, 16, 336, 1, ModelRendererTurbo.MR_FRONT, new float[] { 160, 16, 160 });
		//bodyModel[15].setPosition(0F, -52F, 0F);
		bodyModel[15].rotateAngleX = (float)Math.PI;
		
		//Tail (8 / 9)
		tailModel = new ModelRendererTurbo[7];
		tailModel[0] = new ModelRendererTurbo(this,0, 279, textureX, textureY);
		tailModel[0].addBox(96, 16, -82, 16, 64, 2, 0.0F); //Right Tail Flat
		tailModel[0].rotateAngleX = -(float)Math.PI / 2;
		tailModel[1] = new ModelRendererTurbo(this,0, 279, textureX, textureY);	
		tailModel[1].addBox(96, 16, -82, 16, 64, 2, 0.0F); //Left Tail Flat
		tailModel[1].doMirror(false, true, false);
		tailModel[1].rotateAngleX = -(float)Math.PI / 2;	
		tailModel[2] = new ModelRendererTurbo(this,72, 279, textureX, textureY);
		tailModel[2].addBox(96, -128, 80, 16, 64, 2, 0.0F); //Right Tail Vertical Part
		tailModel[3] = new ModelRendererTurbo(this,72, 279, textureX, textureY);
		tailModel[3].addBox(96, -128, -82, 16, 64, 2, 0.0F); //Left Tail Vertical Part	
		tailModel[4] = new ModelRendererTurbo(this,240, 279, textureX, textureY);
		tailModel[4].addBox(64, -96, -15, 64, 1, 30, 0.0F); //Top Panel
		tailModel[5] = new ModelRendererTurbo(this,304, 111, textureX, textureY);
		tailModel[5].addTrapezoid(128, -96, -16, 16, 32, 32, 0.0F, -6.0F, ModelRendererTurbo.MR_LEFT); //Rear Gunner Window Outside
		tailModel[6] = new ModelRendererTurbo(this,304, 111, textureX, textureY);
		tailModel[6].flip = true;
		tailModel[6].addTrapezoid(128, -96, -16, 16, 32, 32, 0.0F, -6.0F, ModelRendererTurbo.MR_LEFT); //Rear Gunner Window Inside
		
		rightWingModel = new ModelRendererTurbo[6];
		rightWingModel[0] = new ModelRendererTurbo(this,0, 113, textureX, textureY);
		rightWingModel[0].addBox(-64, 16, -82, 64, 96, 4, 0.0F); //Right Wing Inner
		rightWingModel[0].rotateAngleX = -(float)Math.PI / 2;		
		rightWingModel[1] = new ModelRendererTurbo(this,136, 113, textureX, textureY);
		rightWingModel[1].addTrapezoid(-64, 112, -82, 80, 128, 4, 0.0F, -2.0F, ModelRendererTurbo.MR_BOTTOM); //Right Wing Outer
		rightWingModel[1].rotateAngleX = -(float)Math.PI / 2;		
		rightWingModel[2] = new ModelRendererTurbo(this,256, 32, textureX, textureY);
		rightWingModel[2].addTrapezoid(-112, -80, -64, 64, 24, 24, 0.0F, -2.0F, ModelRendererTurbo.MR_BOTTOM); //Right Inner Engine
		rightWingModel[3] = new ModelRendererTurbo(this,256, 32, textureX, textureY);
		rightWingModel[3].addTrapezoid(-96, -80, -128, 64, 24, 24, 0.0F, -2.0F, ModelRendererTurbo.MR_BOTTOM); //Right Outer Engine
		rightWingModel[4] = new ModelRendererTurbo(this,408, 24, textureX, textureY);
		rightWingModel[4].addBox(-115, -76, -60, 6, 16, 16, 0.0F); //Right Inner Engine Propeller Centre
		rightWingModel[5] = new ModelRendererTurbo(this,408, 24, textureX, textureY);
		rightWingModel[5].addBox(-99, -76, -124, 6, 16, 16, 0.0F); //Right Outer Engine Propeller Centre
		
		leftWingModel = new ModelRendererTurbo[6];
		leftWingModel[0] = new ModelRendererTurbo(this,0, 113, textureX, textureY);	
		leftWingModel[0].addBox(-64, 16, -82, 64, 96, 4, 0.0F); //Left Wing Inner
		leftWingModel[0].doMirror(false, true, false);
		leftWingModel[0].rotateAngleX = -(float)Math.PI / 2;		
		leftWingModel[1] = new ModelRendererTurbo(this,136, 113, textureX, textureY);
		leftWingModel[1].addTrapezoid(-64, 112, -82, 80, 128, 4, 0.0F, -2.0F, ModelRendererTurbo.MR_BOTTOM); //Left Wing Outer
		leftWingModel[1].doMirror(false, true, false);
		leftWingModel[1].rotateAngleX = -(float)Math.PI / 2;
		leftWingModel[2] = new ModelRendererTurbo(this,256, 32, textureX, textureY);
		leftWingModel[2].addTrapezoid(-112, -80, 40, 64, 24, 24, 0.0F, -2.0F, ModelRendererTurbo.MR_BOTTOM); //Left Inner Engine
		leftWingModel[3] = new ModelRendererTurbo(this,256, 32, textureX, textureY);
		leftWingModel[3].addTrapezoid(-96, -80, 104, 64, 24, 24, 0.0F, -2.0F, ModelRendererTurbo.MR_BOTTOM); //Left Outer Engine		
		leftWingModel[4] = new ModelRendererTurbo(this,408, 24, textureX, textureY);
		leftWingModel[4].addBox(-115, -76, 44, 6, 16, 16, 0.0F); //Left Inner Engine Propeller Centre
		leftWingModel[5] = new ModelRendererTurbo(this,408, 24, textureX, textureY);
		leftWingModel[5].addBox(-99, -76, 108, 6, 16, 16, 0.0F); //Left Outer Engine Propeller Centre		

		propellerModels = new ModelRendererTurbo[4][3]; //4 propellers
		propellerModels[1] = makeProp(-114, -68, 52);
		propellerModels[0] = makeProp(-114, -68, -52);
		propellerModels[3] = makeProp(-98, -68, 116);
		propellerModels[2] = makeProp(-98, -68, -116);

		yawFlapModel = new ModelRendererTurbo[2]; //Two yaw flaps
		yawFlapModel[0] = new ModelRendererTurbo(this,108, 279, textureX, textureY);
		yawFlapModel[0].addBox(0F, -48F , -1F, 16, 64, 2, 0.0F);
		yawFlapModel[0].setPosition(112F, -80F, 81F);
		
		yawFlapModel[1] = new ModelRendererTurbo(this,108, 279, textureX, textureY);
		yawFlapModel[1].addBox(0F, -48F , -1F, 16, 64, 2, 0.0F);
		yawFlapModel[1].setPosition(112F, -80F, -81F);			
	
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this,0, 345, textureX, textureY);
		pitchFlapRightWingModel[0].addBox(0F, -48F , -2F, 16, 96, 4, 0.0F);
        pitchFlapRightWingModel[0].rotateAngleX = 1.570796F;
		pitchFlapRightWingModel[0].setPosition(0F, -80F, -64F);
		
		pitchFlapLeftModel = new ModelRendererTurbo[1];		
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this,36, 279, textureX, textureY);
		pitchFlapLeftModel[0].addBox(0, -32, -1, 16, 64, 2, 0.0F);
	    pitchFlapLeftModel[0].rotateAngleX = 1.570796F;
		pitchFlapLeftModel[0].setPosition(112F, -81F, 48F);	
		
		pitchFlapLeftWingModel = new ModelRendererTurbo[1]; //Two right pitch flaps
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this,0, 345, textureX, textureY);
		pitchFlapLeftWingModel[0].addBox(0F, -48F , -2F, 16, 96, 4, 0.0F);
		pitchFlapLeftWingModel[0].doMirror(false, true, false);
        pitchFlapLeftWingModel[0].rotateAngleX = 1.570796F;
		pitchFlapLeftWingModel[0].setPosition(0F, -80F, 64F);
		
		pitchFlapRightModel = new ModelRendererTurbo[1];		
		pitchFlapRightModel[0] = new ModelRendererTurbo(this,36, 279, textureX, textureY);
		pitchFlapRightModel[0].addBox(0, -32, -1, 16, 64, 2, 0.0F);
	    pitchFlapRightModel[0].rotateAngleX = 1.570796F;
		pitchFlapRightModel[0].setPosition(112F, -81F, -48F);

		topWingModel = new ModelRendererTurbo[0];
		
		bodyGearDownModel = new ModelRendererTurbo[0];
		tailGearDownModel = new ModelRendererTurbo[0];
		rightWingGearDownModel = new ModelRendererTurbo[0];
		leftWingGearDownModel = new ModelRendererTurbo[0];

		bodyDoorOpenModel = new ModelRendererTurbo[0];
		bodyDoorCloseModel = new ModelRendererTurbo[0];
		tailDoorOpenModel = new ModelRendererTurbo[0];
		tailDoorCloseModel = new ModelRendererTurbo[0];

		rightWingPos1Model = new ModelRendererTurbo[0];
		rightWingPos2Model = new ModelRendererTurbo[0];
		leftWingPos1Model = new ModelRendererTurbo[0];
		leftWingPos2Model = new ModelRendererTurbo[0];
		
		translateAll(52);
		
		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
    }
	
	private void translateAll(int y)
	{
		for(ModelRendererTurbo mod : bodyModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : leftWingModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : rightWingModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : yawFlapModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : pitchFlapRightWingModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : pitchFlapLeftWingModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : pitchFlapLeftModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : pitchFlapRightModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : tailModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo[] mods : propellerModels)
		{
			for(ModelRendererTurbo mod : mods)
			{
				mod.rotationPointY += y;
			}
		}
		for(ModelRendererTurbo[][] modsOfMods : gunModels.values())
		{
			for(ModelRendererTurbo[] mods : modsOfMods)
			{
				for(ModelRendererTurbo mod : mods)
				{
					mod.rotationPointY += y;
				}
			}
		}
	}
	
	//Return a propeller at the specified position
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this,40, 345, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this,40, 345, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this,40, 345, textureX, textureY);
	    prop[0].addBox(-0F, -32F, -2F, 2, 32, 4, 0.0F);	
		prop[0].setRotationPoint(i, j, k);
        prop[1].addBox(-0F, -32F, -2F, 2, 32, 4, 0.0F);	
		prop[1].setRotationPoint(i, j, k);
		prop[2].addBox(-0F, -32F, -2F, 2, 32, 4, 0.0F);		
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}		
 