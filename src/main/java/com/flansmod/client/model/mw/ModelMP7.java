//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMP7 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public ModelMP7() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[9];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 0
		gunModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 1
		
		gunModel[0].addBox(-3F, 5F, -1F, 10, 2, 2, 0F); // Box 0
		gunModel[0].setRotationPoint(2F, -10F, 0F);
		
		gunModel[1].addShapeBox(-4F, 4F, -1F, 5, 1, 2, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[1].setRotationPoint(8F, -10F, 0F);
		
		gunModel[2].addShapeBox(-0.5F, 7F, -1F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[2].setRotationPoint(2F, -10F, 0F);
		
		gunModel[3].addShapeBox(-1.5F, 7F, -1F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[3].setRotationPoint(2F, -10F, 0F);
		
		gunModel[4].addShapeBox(1.75F, 5.25F, -1.5F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		gunModel[4].setRotationPoint(2F, -10F, 0F);
		
		gunModel[5].addShapeBox(1.75F, 5.25F, 1.5F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		gunModel[5].setRotationPoint(2F, -10F, -1F);
		
		gunModel[6].addShapeBox(-1F, 5.5F, -1.25F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		gunModel[6].setRotationPoint(2F, -10F, 0F);
		
		gunModel[7].addShapeBox(-3F, 4F, -1F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[7].setRotationPoint(2F, -10F, 0F);
		
		gunModel[8].addShapeBox(4.5F, 7F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[8].setRotationPoint(2F, -10F, 0F);
		
		
		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0
		
		defaultBarrelModel[0].addBox(7F, 5.5F, -0.5F, 1, 1, 1, 0F); // Box 0
		defaultBarrelModel[0].setRotationPoint(2F, -10F, 0F);
		
		
		defaultStockModel = new ModelRendererTurbo[3];
		defaultStockModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 0
		defaultStockModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 0
		defaultStockModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		
		defaultStockModel[0].addBox(-10F, 4F, -1F, 2, 2, 2, 0F); // Box 0
		defaultStockModel[0].setRotationPoint(7F, -10F, 0F);
		
		defaultStockModel[1].addShapeBox(-10F, 5F, -1F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		defaultStockModel[1].setRotationPoint(7F, -9F, 0F);
		
		defaultStockModel[2].addShapeBox(-2.5F, 3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		defaultStockModel[2].setRotationPoint(2F, -10F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		
		ammoModel[0].addShapeBox(0.75F, 0F, -0.5F, 1, 2, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
