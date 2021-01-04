//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Modelvickersk extends ModelMG //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	public Modelvickersk() //Same as Filename
	{
		bipodModel = new ModelRendererTurbo[1];
		bipodModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 0
		
		bipodModel[0].addShapeBox(-0.5F, -2.3F, -0.5F, 1, 2, 1, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 0
		bipodModel[0].setRotationPoint(0F, 0F, 0F);
		
		
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Barrel
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import FiringMechanism
		gunModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Underbarrelhandle2
		gunModel[3] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import UnderBarrel
		gunModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Trigger
		gunModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import RearSight
		gunModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import FrontSight
		gunModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Pump
		gunModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 0
		gunModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		gunModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		gunModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 4
		gunModel[12] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 5
		gunModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 6
		gunModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 10
		
		gunModel[0].addBox(-0.5F, -2.2F, -9.5F, 1, 1, 22, 0F); // Import Barrel
		gunModel[0].setRotationPoint(0F, -3F, 0F);
		
		gunModel[1].addBox(-1F, -2.5F, -7.5F, 2, 2, 9, 0F); // Import FiringMechanism
		gunModel[1].setRotationPoint(0F, -3F, 0F);
		
		gunModel[2].addShapeBox(-1F, -2.5F, 7.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Underbarrelhandle2
		gunModel[2].setRotationPoint(0F, -3F, 0F);
		
		gunModel[3].addBox(-0.5F, -1.1F, -1.5F, 1, 1, 10, 0F); // Import UnderBarrel
		gunModel[3].setRotationPoint(0F, -3F, 0F);
		
		gunModel[4].addBox(-0.5F, 0F, -9.7F, 1, 1, 4, 0F); // Import Trigger
		gunModel[4].setRotationPoint(0F, -3F, 0F);
		
		gunModel[5].addBox(-0.5F, -3.2F, -6.5F, 1, 1, 1, 0F); // Import RearSight
		gunModel[5].setRotationPoint(0F, -3F, 0F);
		
		gunModel[6].addBox(-0.5F, -3F, 9.5F, 1, 1, 1, 0F); // Import FrontSight
		gunModel[6].setRotationPoint(0F, -3F, 0F);
		
		gunModel[7].addBox(-1.5F, -2F, -1.5F, 1, 1, 1, 0F); // Import Pump
		gunModel[7].setRotationPoint(0F, -3F, 0F);
		
		gunModel[8].addBox(-0.5F, -4F, 1.5F, 1, 2, 1, 0F); // Box 0
		gunModel[8].setRotationPoint(0F, -3F, 0F);
		
		gunModel[9].addBox(-1F, -0.5F, -7.5F, 2, 1, 8, 0F); // Box 2
		gunModel[9].setRotationPoint(0F, -3F, 0F);
		
		gunModel[10].addBox(-0.5F, -2.2F, -10.5F, 1, 4, 1, 0F); // Box 3
		gunModel[10].setRotationPoint(0F, -3F, 0F);
		
		gunModel[11].addBox(-0.5F, -2.2F, -14.5F, 1, 1, 4, 0F); // Box 4
		gunModel[11].setRotationPoint(0F, -3F, 0F);
		
		gunModel[12].addBox(-0.5F, -1.2F, -14.5F, 1, 2, 2, 0F); // Box 5
		gunModel[12].setRotationPoint(0F, -3F, 0F);
		
		gunModel[13].addBox(-0.5F, 0.8F, -14.5F, 1, 1, 4, 0F); // Box 6
		gunModel[13].setRotationPoint(0F, -3F, 0F);
		
		gunModel[14].addBox(-0.5F, 0F, -6.7F, 1, 2, 2, 0F); // Box 10
		gunModel[14].setRotationPoint(0F, -3F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 7
		ammoModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 8
		ammoModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 9
		
		ammoModel[0].addBox(-1F, -3.5F, -5F, 2, 1, 6, 0F); // Box 7
		ammoModel[0].setRotationPoint(0F, -3F, 0F);
		
		ammoModel[1].addShapeBox(1F, -3.5F, -5F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 8
		ammoModel[1].setRotationPoint(0F, -3F, 0F);
		
		ammoModel[2].addShapeBox(-3F, -3.5F, -5F, 2, 1, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 9
		ammoModel[2].setRotationPoint(0F, -3F, 0F);
		
		
		flipAll();
	}
}
