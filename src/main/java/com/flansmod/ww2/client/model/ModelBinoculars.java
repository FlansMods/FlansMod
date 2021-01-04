//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBinoculars extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;
	
	public ModelBinoculars() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 11
		
		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		gunModel[0].setRotationPoint(-1.5F, -3.25F, -2F);
		
		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 3
		gunModel[1].setRotationPoint(-1.5F, -3F, -2F);
		
		gunModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 4
		gunModel[2].setRotationPoint(-1.5F, -2.75F, -2F);
		
		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		gunModel[3].setRotationPoint(-1.5F, -3.25F, 1F);
		
		gunModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 6
		gunModel[4].setRotationPoint(-1.5F, -3F, 1F);
		
		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 7
		gunModel[5].setRotationPoint(-1.5F, -2.75F, 1F);
		
		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 8
		gunModel[6].setRotationPoint(0F, -3F, -1F);
		
		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 9
		gunModel[7].setRotationPoint(0F, -3F, 0F);
		
		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 10
		gunModel[8].setRotationPoint(0F, -3.35F, -0.5F);
		
		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F); // Box 11
		gunModel[9].setRotationPoint(0F, -3.1F, -0.5F);
		
		
		translateAll(0F, -4.5F, 0F);
		
		
		flipAll();
	}
}
