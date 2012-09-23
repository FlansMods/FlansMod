package co.uk.flansmods.client.model;

import net.minecraft.src.NMTGlobal;
import net.minecraft.src.NMTModelRenderer;

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
	
        bodyModel = new NMTModelRenderer[19];	//number of blocks in your model (0 is a block so its highest number block + 1)
	
		//Creates each block with texture co-ordinates starting at the first two values. Second 2 values are the overall size of the texture
		//I am using GaryCXJk's TurboModel thingy but you dont have to. 
		//It is recommended however as the base mod requires it so you will have it anyway and it allows you to use textures larger than 64 square. 
		//(Dont forget the crazy shapes you can make with it)
		
		//Section 0
		bodyModel[0] = new NMTModelRenderer(this,0, 0, textureX, textureY);
		bodyModel[0].addTrapezoid(-160, -80, -16, 16, 32, 32, 0.0F, -4.0F, NMTGlobal.NMT_DIR_RIGHT); //Front gunner window outside
		bodyModel[18] = new NMTModelRenderer(this,0, 0, textureX, textureY);
		bodyModel[18].addTrapezoid(-160, -80, -16, 16, 32, 32, 0.0F, -4.0F, NMTGlobal.NMT_DIR_RIGHT); //Front gunner window inside
		bodyModel[18].flipFaces();
		bodyModel[1] = new NMTModelRenderer(this,64, 0, textureX, textureY);
		bodyModel[1].addBox(-144, -80, -15, 16, 1, 30, 0.0F); //Top panel
		
		//Section 1 / 2 / 3
		bodyModel[2] = new NMTModelRenderer(this,127, 1, textureX, textureY);
		bodyModel[2].addBox(-144, -49, -15, 112, 1, 30, 0.0F); //Floor Upper Level
		bodyModel[3] = new NMTModelRenderer(this,64, 32, textureX, textureY);
		bodyModel[3].addTrapezoid(-128, -96, -16, 64, 16, 32, 0.0F, -8.0F, NMTGlobal.NMT_DIR_TOP); //Pilot window outside
		bodyModel[16] = new NMTModelRenderer(this,64, 32, textureX, textureY);
		bodyModel[16].addTrapezoid(-128, -96, -16, 64, 16, 32, 0.0F, -8.0F, NMTGlobal.NMT_DIR_TOP); //Pilot window inside
		bodyModel[16].flipFaces();
		bodyModel[4] = new NMTModelRenderer(this,0, 80, textureX, textureY);
		bodyModel[4].addBox(-144, -80, -16, 112, 32, 1, 0.0F); //Left Wall
		bodyModel[5] = new NMTModelRenderer(this,0, 80, textureX, textureY);
		bodyModel[5].addBox(-144, -80, -16, 112, 32, 1, 0.0F); //Right Wall
		bodyModel[5].setRotationPoint(-176, 0, 0);
		bodyModel[5].rotateAngleY = (float)Math.PI;
		
		//Wings (4 / 5)

		bodyModel[6] = new NMTModelRenderer(this,226, 80, textureX, textureY);
		bodyModel[6].addBox(-71, -96, -15, 103, 1, 30, 0.0F); //Main Body Top Panel
		bodyModel[7] = new NMTModelRenderer(this,432, 24, textureX, textureY);
		bodyModel[7].addBox(-72, -96, -16, 1, 16, 32, 0.0F); //Main Body Front Panel by Cockpit
		
		//Section 5 / 6 / 7
		
		bodyModel[8] = new NMTModelRenderer(this,0, 245, textureX, textureY);
		bodyModel[8].addBox(0, 0, -16, 199, 16, 1, 0.0F); //Main Body Top Right Panel
		bodyModel[8].setRotationPoint(-71, -96, 0);
		
		bodyModel[9] = new NMTModelRenderer(this,0, 245, textureX, textureY);
		bodyModel[9].addBox(0, 0, -16, 199, 16, 1, 0.0F); //Main Body Top Left Panel
		bodyModel[9].setRotationPoint(-71, -96, 0);
		bodyModel[9].doMirror(false, false, true);
		
		bodyModel[10] = new NMTModelRenderer(this,38, 262, textureX, textureY);
		bodyModel[10].addBox(0, 0, -16, 160, 16, 1, 0.0F); //Main Body Bottom Right Panel
		bodyModel[10].setRotationPoint(-32, -80, 0);
		
		bodyModel[11] = new NMTModelRenderer(this,38, 262, textureX, textureY);
		bodyModel[11].addBox(0, 0, -16, 160, 16, 1, 0.0F); //Main Body Bottom Left Panel
		bodyModel[11].setRotationPoint(-32, -80, 0);
		bodyModel[11].doMirror(false, false, true);
			
		bodyModel[12] = new NMTModelRenderer(this,144, 279, textureX, textureY);
		bodyModel[12].addTrapezoid(32, -112, -16, 32, 16, 32, 0.0F, -8.0F, NMTGlobal.NMT_DIR_TOP); //Gunner Window Outside
		
		bodyModel[17] = new NMTModelRenderer(this,144, 279, textureX, textureY);
		bodyModel[17].addTrapezoid(32, -112, -16, 32, 16, 32, 0.0F, -8.0F, NMTGlobal.NMT_DIR_TOP); //Gunner Window Inside
		bodyModel[17].flipFaces();
		
		//TEMPORARY CODE
		//This is just to stop NPEs on rendering model parts 13 to 15 while I try to work out how to do prisms in NMT
		//TODO : Sort out the prisms
		
		bodyModel[13] = new NMTModelRenderer(this,144, 279, textureX, textureY);
		bodyModel[13].addTrapezoid(32, -112, -16, 32, 16, 32, 0.0F, -8.0F, NMTGlobal.NMT_DIR_TOP); //Gunner Window Outside

		bodyModel[14] = new NMTModelRenderer(this,144, 279, textureX, textureY);
		bodyModel[14].addTrapezoid(32, -112, -16, 32, 16, 32, 0.0F, -8.0F, NMTGlobal.NMT_DIR_TOP); //Gunner Window Outside

		bodyModel[15] = new NMTModelRenderer(this,144, 279, textureX, textureY);
		bodyModel[15].addTrapezoid(32, -112, -16, 32, 16, 32, 0.0F, -8.0F, NMTGlobal.NMT_DIR_TOP); //Gunner Window Outside

		//----------------------------------------------------------------------------------------------------------------
		
		//Underside
		/*
		bodyModel[13] = new NMTModelRenderer(this,52, 362, textureX, textureY);
		bodyModel[13].addShape3D(128, -65, -15, 
		new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(160, 16, 160, 0), new Coord2D(160, 17, 160, 1), new Coord2D(0, 1, 0, 1) } ), 30, 160, 1, 322, 30, NMTGlobal.NMT_DIR_FRONT, new float[] { 1, 160, 1, 160 });
		//bodyModel[13].setRotationPoint(0F, -52F, 0F);
		bodyModel[13].rotateAngleX = (float)Math.PI;
		
		bodyModel[14] = new NMTModelRenderer(this,52, 345, textureX, textureY);
		bodyModel[14].addShape3D(128, -64, -16, 
		new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(160, 0, 160, 0), new Coord2D(160, 16, 160, 16) } ), 1, 160, 16, 336, 1, NMTGlobal.NMT_DIR_FRONT, new float[] { 160, 16, 160 });
		//bodyModel[14].setRotationPoint(0F, -52F, 0F);
		bodyModel[14].rotateAngleX = (float)Math.PI;

		bodyModel[15] = new NMTModelRenderer(this,52, 394, textureX, textureY);
		bodyModel[15].addShape3D(128, -64, 15, 
		new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(160, 0, 160, 0), new Coord2D(160, 16, 160, 16) } ), 1, 160, 16, 336, 1, NMTGlobal.NMT_DIR_FRONT, new float[] { 160, 16, 160 });
		//bodyModel[15].setRotationPoint(0F, -52F, 0F);
		bodyModel[15].rotateAngleX = (float)Math.PI;
		*/
		
		//Tail (8 / 9)
		tailModel = new NMTModelRenderer[6];
		tailModel[0] = new NMTModelRenderer(this,0, 279, textureX, textureY);
		tailModel[0].addBox(96, 16, -82, 16, 64, 2, 0.0F); //Right Tail Flat
		tailModel[0].rotateAngleX = -(float)Math.PI / 2;
		tailModel[1] = new NMTModelRenderer(this,0, 279, textureX, textureY);	
		tailModel[1].addBox(96, 16, -82, 16, 64, 2, 0.0F); //Left Tail Flat
		tailModel[1].doMirror(false, true, false);
		tailModel[1].rotateAngleX = -(float)Math.PI / 2;	
		tailModel[2] = new NMTModelRenderer(this,72, 279, textureX, textureY);
		tailModel[2].addBox(96, -128, 80, 16, 64, 2, 0.0F); //Right Tail Vertical Part
		tailModel[3] = new NMTModelRenderer(this,72, 279, textureX, textureY);
		tailModel[3].addBox(96, -128, -82, 16, 64, 2, 0.0F); //Left Tail Vertical Part	
		tailModel[4] = new NMTModelRenderer(this,240, 279, textureX, textureY);
		tailModel[4].addBox(64, -96, -15, 64, 1, 30, 0.0F); //Top Panel
		tailModel[5] = new NMTModelRenderer(this,304, 111, textureX, textureY);
		tailModel[5].addTrapezoid(128, -96, -16, 16, 32, 32, 0.0F, -6.0F, NMTGlobal.NMT_DIR_LEFT); //Rear Gunner Window
		
		rightWingModel = new NMTModelRenderer[6];
		rightWingModel[0] = new NMTModelRenderer(this,0, 113, textureX, textureY);
		rightWingModel[0].addBox(-64, 16, -82, 64, 96, 4, 0.0F); //Right Wing Inner
		rightWingModel[0].rotateAngleX = -(float)Math.PI / 2;		
		rightWingModel[1] = new NMTModelRenderer(this,136, 113, textureX, textureY);
		rightWingModel[1].addTrapezoid(-64, 112, -82, 80, 128, 4, 0.0F, -2.0F, NMTGlobal.NMT_DIR_BOTTOM); //Right Wing Outer
		rightWingModel[1].rotateAngleX = -(float)Math.PI / 2;		
		rightWingModel[2] = new NMTModelRenderer(this,256, 32, textureX, textureY);
		rightWingModel[2].addTrapezoid(-112, -80, -64, 64, 24, 24, 0.0F, -2.0F, NMTGlobal.NMT_DIR_BOTTOM); //Right Inner Engine
		rightWingModel[3] = new NMTModelRenderer(this,256, 32, textureX, textureY);
		rightWingModel[3].addTrapezoid(-96, -80, -128, 64, 24, 24, 0.0F, -2.0F, NMTGlobal.NMT_DIR_BOTTOM); //Right Outer Engine
		rightWingModel[4] = new NMTModelRenderer(this,408, 24, textureX, textureY);
		rightWingModel[4].addBox(-115, -76, -60, 6, 16, 16, 0.0F); //Right Inner Engine Propeller Centre
		rightWingModel[5] = new NMTModelRenderer(this,408, 24, textureX, textureY);
		rightWingModel[5].addBox(-99, -76, -124, 6, 16, 16, 0.0F); //Right Outer Engine Propeller Centre
		
		leftWingModel = new NMTModelRenderer[6];
		leftWingModel[0] = new NMTModelRenderer(this,0, 113, textureX, textureY);	
		leftWingModel[0].addBox(-64, 16, -82, 64, 96, 4, 0.0F); //Left Wing Inner
		leftWingModel[0].doMirror(false, true, false);
		leftWingModel[0].rotateAngleX = -(float)Math.PI / 2;		
		leftWingModel[1] = new NMTModelRenderer(this,136, 113, textureX, textureY);
		leftWingModel[1].addTrapezoid(-64, 112, -82, 80, 128, 4, 0.0F, -2.0F, NMTGlobal.NMT_DIR_BOTTOM); //Left Wing Outer
		leftWingModel[1].doMirror(false, true, false);
		leftWingModel[1].rotateAngleX = -(float)Math.PI / 2;
		leftWingModel[2] = new NMTModelRenderer(this,256, 32, textureX, textureY);
		leftWingModel[2].addTrapezoid(-112, -80, 40, 64, 24, 24, 0.0F, -2.0F, NMTGlobal.NMT_DIR_BOTTOM); //Left Inner Engine
		leftWingModel[3] = new NMTModelRenderer(this,256, 32, textureX, textureY);
		leftWingModel[3].addTrapezoid(-96, -80, 104, 64, 24, 24, 0.0F, -2.0F, NMTGlobal.NMT_DIR_BOTTOM); //Left Outer Engine		
		leftWingModel[4] = new NMTModelRenderer(this,408, 24, textureX, textureY);
		leftWingModel[4].addBox(-115, -76, 44, 6, 16, 16, 0.0F); //Left Inner Engine Propeller Centre
		leftWingModel[5] = new NMTModelRenderer(this,408, 24, textureX, textureY);
		leftWingModel[5].addBox(-99, -76, 108, 6, 16, 16, 0.0F); //Left Outer Engine Propeller Centre		

		propellerModels = new NMTModelRenderer[4][3]; //4 propellers
		propellerModels[1] = makeProp(-114, -68, 52);
		propellerModels[0] = makeProp(-114, -68, -52);
		propellerModels[3] = makeProp(-98, -68, 116);
		propellerModels[2] = makeProp(-98, -68, -116);

		yawFlapModel = new NMTModelRenderer[2]; //Two yaw flaps
		yawFlapModel[0] = new NMTModelRenderer(this,108, 279, textureX, textureY);
		yawFlapModel[0].addBox(0F, -48F , -1F, 16, 64, 2, 0.0F);
		yawFlapModel[0].setRotationPoint(112F, -80F, 81F);
		
		yawFlapModel[1] = new NMTModelRenderer(this,108, 279, textureX, textureY);
		yawFlapModel[1].addBox(0F, -48F , -1F, 16, 64, 2, 0.0F);
		yawFlapModel[1].setRotationPoint(112F, -80F, -81F);			
	
		pitchFlapRightWingModel = new NMTModelRenderer[1];
		pitchFlapRightWingModel[0] = new NMTModelRenderer(this,0, 345, textureX, textureY);
		pitchFlapRightWingModel[0].addBox(0F, -48F , -2F, 16, 96, 4, 0.0F);
        pitchFlapRightWingModel[0].rotateAngleX = 1.570796F;
		pitchFlapRightWingModel[0].setRotationPoint(0F, -80F, -64F);
		
		pitchFlapLeftModel = new NMTModelRenderer[1];		
		pitchFlapLeftModel[0] = new NMTModelRenderer(this,36, 279, textureX, textureY);
		pitchFlapLeftModel[0].addBox(0, -32, -1, 16, 64, 2, 0.0F);
	    pitchFlapLeftModel[0].rotateAngleX = 1.570796F;
		pitchFlapLeftModel[0].setRotationPoint(112F, -81F, 48F);	
		
		pitchFlapLeftWingModel = new NMTModelRenderer[1]; //Two right pitch flaps
		pitchFlapLeftWingModel[0] = new NMTModelRenderer(this,0, 345, textureX, textureY);
		pitchFlapLeftWingModel[0].addBox(0F, -48F , -2F, 16, 96, 4, 0.0F);
		pitchFlapLeftWingModel[0].doMirror(false, true, false);
        pitchFlapLeftWingModel[0].rotateAngleX = 1.570796F;
		pitchFlapLeftWingModel[0].setRotationPoint(0F, -80F, 64F);
		
		pitchFlapRightModel = new NMTModelRenderer[1];		
		pitchFlapRightModel[0] = new NMTModelRenderer(this,36, 279, textureX, textureY);
		pitchFlapRightModel[0].addBox(0, -32, -1, 16, 64, 2, 0.0F);
	    pitchFlapRightModel[0].rotateAngleX = 1.570796F;
		pitchFlapRightModel[0].setRotationPoint(112F, -81F, -48F);

		topWingModel = new NMTModelRenderer[0];
		
		translateAll(52);
		
		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
		
    }
	
	private void translateAll(int y)
	{
		for(NMTModelRenderer mod : bodyModel)
		{
			mod.rotationPointY += y;
		}
		for(NMTModelRenderer mod : leftWingModel)
		{
			mod.rotationPointY += y;
		}
		for(NMTModelRenderer mod : rightWingModel)
		{
			mod.rotationPointY += y;
		}
		for(NMTModelRenderer mod : yawFlapModel)
		{
			mod.rotationPointY += y;
		}
		for(NMTModelRenderer mod : pitchFlapRightWingModel)
		{
			mod.rotationPointY += y;
		}
		for(NMTModelRenderer mod : pitchFlapLeftWingModel)
		{
			mod.rotationPointY += y;
		}
		for(NMTModelRenderer mod : pitchFlapLeftModel)
		{
			mod.rotationPointY += y;
		}
		for(NMTModelRenderer mod : pitchFlapRightModel)
		{
			mod.rotationPointY += y;
		}
		for(NMTModelRenderer mod : tailModel)
		{
			mod.rotationPointY += y;
		}
		for(NMTModelRenderer[] mods : propellerModels)
		{
			for(NMTModelRenderer mod : mods)
			{
				mod.rotationPointY += y;
			}
		}
	}
	
	//Return a propeller at the specified position
	private NMTModelRenderer[] makeProp(int i, int j, int k)
	{
		NMTModelRenderer[] prop = new NMTModelRenderer[3];
		prop[0] = new NMTModelRenderer(this,40, 345, textureX, textureY);
		prop[1] = new NMTModelRenderer(this,40, 345, textureX, textureY);
		prop[2] = new NMTModelRenderer(this,40, 345, textureX, textureY);
	    prop[0].addBox(-0F, -32F, -2F, 2, 32, 4, 0.0F);	
		prop[0].setRotationPoint(i, j, k);
        prop[1].addBox(-0F, -32F, -2F, 2, 32, 4, 0.0F);	
		prop[1].setRotationPoint(i, j, k);
		prop[2].addBox(-0F, -32F, -2F, 2, 32, 4, 0.0F);		
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}		
 