//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelHK416 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public ModelHK416() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this, 0, 11, textureX, textureY); // Import 
		gunModel[1] = new ModelRendererTurbo(this, 64, 11, textureX, textureY); // Import 
		gunModel[2] = new ModelRendererTurbo(this, 49, 11, textureX, textureY); // Import 
		gunModel[3] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Import 
		gunModel[4] = new ModelRendererTurbo(this, 37, 11, textureX, textureY); // Import 
		gunModel[5] = new ModelRendererTurbo(this, 24, 22, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 56, 11, textureX, textureY); // Box 1
		gunModel[7] = new ModelRendererTurbo(this, 18, 11, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 78, 11, textureX, textureY); // Box 3
		gunModel[9] = new ModelRendererTurbo(this, 72, 11, textureX, textureY); // Box 4
		gunModel[10] = new ModelRendererTurbo(this, 54, 22, textureX, textureY); // Box 7
		gunModel[11] = new ModelRendererTurbo(this, 32, 22, textureX, textureY); // Box 22
		gunModel[12] = new ModelRendererTurbo(this, 32, 22, textureX, textureY); // Box 23
		gunModel[13] = new ModelRendererTurbo(this, 54, 22, textureX, textureY); // Box 27
		gunModel[14] = new ModelRendererTurbo(this, 54, 22, textureX, textureY); // Box 28
		
		gunModel[0].addBox(-1F, 3F, -1F, 6, 2, 2, 0F); // Import 
		gunModel[0].setRotationPoint(0F, -8F, 0F);
		
		gunModel[1].addShapeBox(-2F, 6F, -0.5F, 2, 7, 1, 0F, 0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3.5F, 0F, -1F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -3F, 0F); // Import 
		gunModel[1].setRotationPoint(0F, -8F, 0F);
		
		gunModel[2].addBox(0F, 6F, -0.5F, 1, 1, 1, 0F); // Import 
		gunModel[2].setRotationPoint(0F, -8F, 0F);
		
		gunModel[3].addShapeBox(5F, 3F, -1F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import 
		gunModel[3].setRotationPoint(0F, -8F, 0F);
		
		gunModel[4].addBox(2F, 6F, -1F, 3, 2, 2, 0F); // Import 
		gunModel[4].setRotationPoint(0F, -8F, 0F);
		
		gunModel[5].addShapeBox(14F, 3F, -1F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[5].setRotationPoint(0F, -8F, 0F);
		
		gunModel[6].addBox(0F, 7F, -0.5F, 2, 1, 1, 0F); // Box 1
		gunModel[6].setRotationPoint(0F, -8F, 0F);
		
		gunModel[7].addShapeBox(-1F, 5F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(0F, -8F, 0F);
		
		gunModel[8].addShapeBox(-1F, 4F, -2F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[8].setRotationPoint(0F, -8F, 0F);
		
		gunModel[9].addShapeBox(2F, 3F, -2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[9].setRotationPoint(0F, -8F, 0F);
		
		gunModel[10].addShapeBox(14.5F, 3F, -0.5F, 1, 2, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 7
		gunModel[10].setRotationPoint(0F, -8F, 0F);
		
		gunModel[11].addShapeBox(5F, 3.5F, 0.5F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[11].setRotationPoint(0F, -8F, 0F);
		
		gunModel[12].addShapeBox(5F, 3.5F, -1.5F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[12].setRotationPoint(0F, -8F, 0F);
		
		gunModel[13].addShapeBox(14.5F, 2.5F, -0.5F, 1, 1, 1, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 27
		gunModel[13].setRotationPoint(0F, -8F, 0F);
		
		gunModel[14].addShapeBox(14.5F, 2.5F, -1.25F, 1, 1, 1, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 28
		gunModel[14].setRotationPoint(0F, -8F, 0F);
		
		
		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 20, 71, textureX, textureY); // Import 
		
		defaultBarrelModel[0].addBox(5F, 4.5F, -0.5F, 12, 1, 1, 0F); // Import 
		defaultBarrelModel[0].setRotationPoint(0F, -8F, 0F);
		
		
		defaultStockModel = new ModelRendererTurbo[6];
		defaultStockModel[0] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Import 
		defaultStockModel[1] = new ModelRendererTurbo(this, 28, 4, textureX, textureY); // Import 
		defaultStockModel[2] = new ModelRendererTurbo(this, 60, 4, textureX, textureY); // Import 
		defaultStockModel[3] = new ModelRendererTurbo(this, 38, 4, textureX, textureY); // Box 2
		defaultStockModel[4] = new ModelRendererTurbo(this, 48, 4, textureX, textureY); // Box 3
		defaultStockModel[5] = new ModelRendererTurbo(this, 10, 4, textureX, textureY); // Box 4
		
		defaultStockModel[0].addBox(-9F, 4F, -1F, 2, 3, 2, 0F); // Import 
		defaultStockModel[0].setRotationPoint(0F, -8F, 0F);
		
		defaultStockModel[1].addBox(-5F, 4F, -1F, 2, 1, 2, 0F); // Import 
		defaultStockModel[1].setRotationPoint(0F, -8F, 0F);
		
		defaultStockModel[2].addBox(-3F, 3.5F, -0.5F, 3, 1, 1, 0F); // Import 
		defaultStockModel[2].setRotationPoint(0F, -8F, 0F);
		
		defaultStockModel[3].addShapeBox(-5F, 5F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		defaultStockModel[3].setRotationPoint(0F, -8F, 0F);
		
		defaultStockModel[4].addShapeBox(-7F, 5F, -1F, 2, 2, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 3
		defaultStockModel[4].setRotationPoint(0F, -8F, 0F);
		
		defaultStockModel[5].addShapeBox(-9F, 3F, -1F, 6, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		defaultStockModel[5].setRotationPoint(0F, -8F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Import 
		
		ammoModel[0].addShapeBox(2.5F, 0F, -1F, 3, 4, 2, 0F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 1F, -0.2F); // Import 
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
