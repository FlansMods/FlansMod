//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelGothaGV extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelGothaGV()
	{

// Body
		bodyModel = new ModelRendererTurbo[43];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // WingRB
		bodyModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // WingRT
		bodyModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // WindLB
		bodyModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // WingLT
		bodyModel[4] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CockpitSideL
		bodyModel[5] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CockpitSideR
		bodyModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CockpitFront
		bodyModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // WingRFIStake
		bodyModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // WingRBIStake
		bodyModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // WingLFIStake
		bodyModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // WingLBIStake
		bodyModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape1
		bodyModel[12] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape2
		bodyModel[13] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape2
		bodyModel[14] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape3
		bodyModel[15] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape3
		bodyModel[16] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape3
		bodyModel[17] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape3
		bodyModel[18] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape4
		bodyModel[19] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape4
		bodyModel[20] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape5
		bodyModel[21] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape5
		bodyModel[22] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape6
		bodyModel[23] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape7
		bodyModel[24] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape8
		bodyModel[25] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape9
		bodyModel[26] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape10
		bodyModel[27] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape11
		bodyModel[28] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape12
		bodyModel[29] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape12
		bodyModel[30] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape12
		bodyModel[31] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape12
		bodyModel[32] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape13
		bodyModel[33] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape13
		bodyModel[34] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape14
		bodyModel[35] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape15
		bodyModel[36] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape16
		bodyModel[37] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape17
		bodyModel[38] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape18
		bodyModel[39] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape19
		bodyModel[40] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape19
		bodyModel[41] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape18
		bodyModel[42] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape20

		bodyModel[0].addBox(0F, 0F, 0F, 75, 2, 225, 0F); // WingRB
		bodyModel[0].setRotationPoint(22F, -24F, -223F);
		bodyModel[0].rotateAngleY = 0.1570796F;

		bodyModel[1].addBox(0F, 0F, 0F, 75, 2, 225, 0F); // WingRT
		bodyModel[1].setRotationPoint(14F, -65F, -223F);
		bodyModel[1].rotateAngleY = 0.1570796F;

		bodyModel[2].addBox(0F, 0F, 0F, 75, 2, 225, 0F); // WindLB
		bodyModel[2].setRotationPoint(-13F, -24F, -2F);
		bodyModel[2].rotateAngleY = -0.1570796F;

		bodyModel[3].addBox(0F, 0F, 0F, 75, 2, 225, 0F); // WingLT
		bodyModel[3].setRotationPoint(-21F, -65F, -2F);
		bodyModel[3].rotateAngleY = -0.1570796F;

		bodyModel[4].addBox(0F, 0F, 0F, 150, 19, 2, 0F); // CockpitSideL
		bodyModel[4].setRotationPoint(-43F, -42F, 15F);

		bodyModel[5].addBox(0F, 0F, 0F, 150, 19, 2, 0F); // CockpitSideR
		bodyModel[5].setRotationPoint(-43F, -42F, -17F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 19, 20, 0F); // CockpitFront
		bodyModel[6].setRotationPoint(-54F, -42F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 39, 2, 0F); // WingRFIStake
		bodyModel[7].setRotationPoint(-16F, -63F, -21F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 39, 2, 0F); // WingRBIStake
		bodyModel[8].setRotationPoint(47F, -63F, -21F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 39, 2, 0F); // WingLFIStake
		bodyModel[9].setRotationPoint(-16F, -63F, 19F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 39, 2, 0F); // WingLBIStake
		bodyModel[10].setRotationPoint(47F, -63F, 19F);

		bodyModel[11].addBox(0F, 0F, 0F, 152, 1, 30, 0F); // Shape1
		bodyModel[11].setRotationPoint(-45F, -25F, -15F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 2, 194, 0F); // Shape2
		bodyModel[12].setRotationPoint(96F, -24F, -210F);
		bodyModel[12].rotateAngleY = 0.1570796F;

		bodyModel[13].addBox(0F, 0F, 0F, 5, 2, 192, 0F); // Shape2
		bodyModel[13].setRotationPoint(65F, -24F, 18F);
		bodyModel[13].rotateAngleY = -0.1570796F;

		bodyModel[14].addBox(0F, 0F, 0F, 2, 17, 3, 0F); // Shape3
		bodyModel[14].setRotationPoint(58F, -62F, 64F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 17, 3, 0F); // Shape3
		bodyModel[15].setRotationPoint(58F, -62F, -66F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 17, 3, 0F); // Shape3
		bodyModel[16].setRotationPoint(58F, -42F, -66F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 17, 3, 0F); // Shape3
		bodyModel[17].setRotationPoint(58F, -42F, 64F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Shape4
		bodyModel[18].setRotationPoint(58.5F, -44F, -65F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Shape4
		bodyModel[19].setRotationPoint(58.5F, -44F, 65F);

		bodyModel[20].addBox(0F, 0F, 0F, 100, 19, 2, 0F); // Shape5
		bodyModel[20].setRotationPoint(107F, -42F, -17F);
		bodyModel[20].rotateAngleY = 0.06981317F;
		bodyModel[20].rotateAngleZ = 0.05235988F;

		bodyModel[21].addBox(0F, 0F, 0F, 100, 19, 2, 0F); // Shape5
		bodyModel[21].setRotationPoint(107F, -42F, 15F);
		bodyModel[21].rotateAngleY = -0.06981317F;
		bodyModel[21].rotateAngleZ = 0.05235988F;

		bodyModel[22].addBox(0F, 0F, 0F, 4, 17, 20, 0F); // Shape6
		bodyModel[22].setRotationPoint(-2F, -42F, -15F);

		bodyModel[23].addBox(0F, 0F, 0F, 25, 2, 30, 0F); // Shape7
		bodyModel[23].setRotationPoint(107F, -25F, -15F);
		bodyModel[23].rotateAngleZ = 0.06981317F;

		bodyModel[24].addBox(0F, 0F, 0F, 37, 2, 27, 0F); // Shape8
		bodyModel[24].setRotationPoint(131.9F, -26.8F, -13.5F);
		bodyModel[24].rotateAngleZ = 0.06981317F;

		bodyModel[25].addBox(0F, 0F, 0F, 2, 19, 34, 0F); // Shape9
		bodyModel[25].setRotationPoint(107F, -42F, -17F);

		bodyModel[26].addBox(0F, 0F, 0F, 37, 2, 22, 0F); // Shape10
		bodyModel[26].setRotationPoint(168.8F, -29.4F, -11F);
		bodyModel[26].rotateAngleZ = 0.06981317F;

		bodyModel[27].addBox(0F, 0F, 0F, 50, 2, 200, 0F); // Shape11
		bodyModel[27].setRotationPoint(157F, -43.9F, -100F);
		bodyModel[27].rotateAngleZ = 0.06981317F;

		bodyModel[28].addBox(0F, 0F, 0F, 5, 26, 5, 0F); // Shape12
		bodyModel[28].setRotationPoint(-5F, -22F, 25F);
		bodyModel[28].rotateAngleZ = 0.3490658F;

		bodyModel[29].addBox(0F, 0F, 0F, 5, 26, 5, 0F); // Shape12
		bodyModel[29].setRotationPoint(-5F, -22F, -30F);
		bodyModel[29].rotateAngleZ = 0.3490658F;

		bodyModel[30].addBox(0F, 0F, 0F, 5, 26, 5, 0F); // Shape12
		bodyModel[30].setRotationPoint(-5F, -22F, -45F);
		bodyModel[30].rotateAngleZ = 0.3490658F;

		bodyModel[31].addBox(0F, 0F, 0F, 5, 26, 5, 0F); // Shape12
		bodyModel[31].setRotationPoint(-5F, -22F, 40F);
		bodyModel[31].rotateAngleZ = 0.3490658F;

		bodyModel[32].addBox(0F, 0F, 0F, 13, 19, 2, 0F); // Shape13
		bodyModel[32].setRotationPoint(-52F, -42F, 7.5F);
		bodyModel[32].rotateAngleY = 0.6632251F;

		bodyModel[33].addBox(0F, 0F, 0F, 13, 19, 2, 0F); // Shape13
		bodyModel[33].setRotationPoint(-53.3F, -42F, -9F);
		bodyModel[33].rotateAngleY = -0.6632251F;

		bodyModel[34].addBox(0F, 0F, 0F, 3, 1, 26, 0F); // Shape14
		bodyModel[34].setRotationPoint(-48F, -25F, -13F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Shape15
		bodyModel[35].setRotationPoint(-51F, -25F, -10.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 28, 1, 30, 0F); // Shape16
		bodyModel[36].setRotationPoint(107F, -41F, -15F);
		bodyModel[36].rotateAngleZ = 0.06981317F;

		bodyModel[37].addBox(0F, 0F, 0F, 72, 1, 28, 0F); // Shape17
		bodyModel[37].setRotationPoint(134.9F, -43F, -14F);
		bodyModel[37].rotateAngleZ = 0.05235988F;

		bodyModel[38].addBox(0F, 0F, 0F, 20, 20, 10, 0F); // Shape18
		bodyModel[38].setRotationPoint(-3F, -10F, -55F);

		bodyModel[39].addBox(0F, 0F, 0F, 20, 20, 10, 0F); // Shape19
		bodyModel[39].setRotationPoint(-3F, -10F, 45F);

		bodyModel[40].addBox(0F, 0F, 0F, 20, 20, 10, 0F); // Shape19
		bodyModel[40].setRotationPoint(-3F, -10F, 15F);

		bodyModel[41].addBox(0F, 0F, 0F, 20, 20, 10, 0F); // Shape18
		bodyModel[41].setRotationPoint(-3F, -10F, -25F);

		bodyModel[42].addBox(0F, 0F, 0F, 10, 2, 10, 0F); // Shape20
		bodyModel[42].setRotationPoint(5F, -35F, -11F);
		
		ModelRendererTurbo[][] MGBModel = new ModelRendererTurbo[3][];		
		MGBModel[0] = new ModelRendererTurbo[0];
		
		MGBModel[1] = new ModelRendererTurbo[0];


		MGBModel[2] = new ModelRendererTurbo[1];
		MGBModel[2][0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // MGB

		MGBModel[2][0].addBox(101F, -45F, 0F, 18, 1, 1, 0F); // MGB
		MGBModel[2][0].setRotationPoint(-100F,29F,0F);		
		
		for(ModelRendererTurbo MGBPart : MGBModel[2])
			MGBPart.setRotationPoint(0F, 0F, 0F);
		
		registerGunModel("MGB", MGBModel);

// Propeller
		propellerModels = new ModelRendererTurbo[1][3]; //1 propeller in 3 parts
        propellerModels[0][0] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); //Propeller 0 - Blade 0 : 192, 12 is the texture origin
        propellerModels[0][1] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); //Propeller 0 - Blade 1
        propellerModels[0][2] = new ModelRendererTurbo(this, 192, 12, textureX, textureY); //Propeller 0 - Blade 2		
        propellerModels[0][0].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);		//Propeller Blades
        propellerModels[0][1].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);		//They will all be the same
        propellerModels[0][2].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);		
        propellerModels[0][0].setRotationPoint(-54, -2, 0);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(-54, -2, 0);	
        propellerModels[0][2].setRotationPoint(-54, -2, 0);	
		
		

		translateAll(0, 0, 0);


		flipAll();
	}

	// Replace with your propeller function
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}