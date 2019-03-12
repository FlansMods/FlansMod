//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFMG extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	public ModelFMG() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[17];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		gunModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		gunModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 4
		gunModel[8] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 5
		gunModel[9] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 7
		gunModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 8
		gunModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
		gunModel[12] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import 
		gunModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import 
		gunModel[14] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import 
		gunModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import 
		gunModel[16] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 5
		
		gunModel[0].addShapeBox(0F, 4F, 0F, 3, 3, 2, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[0].setRotationPoint(-0.4F, -6F, -1F);
		
		gunModel[1].addBox(3F, 3F, 0F, 2, 1, 2, 0F); // Box 4
		gunModel[1].setRotationPoint(-0.4F, -6F, -1F);
		
		gunModel[2].addShapeBox(7.75F, 2F, 0.5F, 1, 3, 1, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 8
		gunModel[2].setRotationPoint(-0.4F, -6F, -1F);
		
		gunModel[3].addShapeBox(1F, 3F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 10
		gunModel[3].setRotationPoint(-0.4F, -6F, -1F);
		
		gunModel[4].addBox(3F, 0F, 0F, 11, 3, 2, 0F); // Box 0
		gunModel[4].setRotationPoint(-3.4F, -6F, -1F);
		
		gunModel[5].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		gunModel[5].setRotationPoint(6.6F, -3F, -1F);
		
		gunModel[6].addBox(3F, 0F, 0F, 9, 3, 2, 0F); // Box 3
		gunModel[6].setRotationPoint(-12.4F, -6F, -1F);
		
		gunModel[7].addShapeBox(3F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[7].setRotationPoint(-12.4F, -3F, -1F);
		
		gunModel[8].addShapeBox(0F, -6F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[8].setRotationPoint(6F, -2F, -0.5F);
		
		gunModel[9].addShapeBox(0F, -6F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[9].setRotationPoint(3F, -2F, -0.5F);
		
		gunModel[10].addShapeBox(0F, -6F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[10].setRotationPoint(1F, -2F, -0.5F);
		
		gunModel[11].addShapeBox(0F, -6F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[11].setRotationPoint(7.75F, 1F, -0.5F);
		
		gunModel[12].addShapeBox(10F, 0.75F, 0.25F, 7, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Import 
		gunModel[12].setRotationPoint(-8F, -9F, 0F);
		
		gunModel[13].addShapeBox(8F, -0.5F, -0.5F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import 
		gunModel[13].setRotationPoint(0F, -7F, 0F);
		
		gunModel[14].addShapeBox(8F, -0.5F, -1F, 2, 1, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Import 
		gunModel[14].setRotationPoint(0F, -7F, 0F);
		
		gunModel[15].addShapeBox(8F, -0.5F, -1F, 2, 1, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import 
		gunModel[15].setRotationPoint(0F, -7F, 0F);
		
		gunModel[16].addShapeBox(10F, 0.75F, -0.5F, 7, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 5
		gunModel[16].setRotationPoint(-8F, -9F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		
		ammoModel[0].addShapeBox(0F, 1F, 0F, 3, 3, 1, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1
		ammoModel[0].setRotationPoint(-1F, 0F, -0.5F);
		
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
