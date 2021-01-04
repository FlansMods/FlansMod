//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBrowning extends ModelMG //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	public ModelBrowning() //Same as Filename
	{
		bipodModel = new ModelRendererTurbo[3];
		bipodModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bipodModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 14
		bipodModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		
		bipodModel[0].addShapeBox(-0.5F, -4F, -2F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 6F, 6F, 0F, 6F, 6F, 0F, -6F, -6F, 0F, -6F); // Box 12
		bipodModel[0].setRotationPoint(0F, 0F, 0F);
		
		bipodModel[1].addShapeBox(-0.5F, -4F, -2F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, -6F, 6F, 0F, -6F); // Box 14
		bipodModel[1].setRotationPoint(0F, 0F, 0F);
		
		bipodModel[2].addShapeBox(-0.5F, -4F, -2F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 15
		bipodModel[2].setRotationPoint(0F, 0F, 0F);
		
		
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 8
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 10
		gunModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		gunModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 13
		gunModel[8] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 14
		gunModel[9] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 15
		gunModel[10] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 16
		
		gunModel[0].addShapeBox(-1F, -3.3F, -6.25F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 4
		gunModel[0].setRotationPoint(0F, -4F, -1.5F);
		
		gunModel[1].addShapeBox(-1.5F, -1.8F, -0.45F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		gunModel[1].setRotationPoint(0F, -4F, -1.5F);
		
		gunModel[2].addShapeBox(-0.5F, -2.8F, 0.25F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[2].setRotationPoint(0F, -4F, -1.5F);
		
		gunModel[3].addShapeBox(-0.5F, -2.8F, 0.75F, 1, 1, 10, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 8
		gunModel[3].setRotationPoint(0F, -4F, -1.5F);
		
		gunModel[4].addShapeBox(-0.5F, -2.3F, -7.75F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[4].setRotationPoint(0F, -4F, -1.5F);
		
		gunModel[5].addShapeBox(-0.5F, -2.3F, -7.75F, 1, 3, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F); // Box 10
		gunModel[5].setRotationPoint(0F, -4F, -1.5F);
		
		gunModel[6].addShapeBox(-0.5F, -4F, -0.35F, 1, 1, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[6].setRotationPoint(0F, -4F, -1.5F);
		
		gunModel[7].addShapeBox(-0.5F, -3.3F, -5.75F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[7].setRotationPoint(0F, -4.5F, -1.5F);
		
		gunModel[8].addShapeBox(-0.5F, -3.3F, -5.75F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Box 14
		gunModel[8].setRotationPoint(0F, -5.2F, -1.5F);
		
		gunModel[9].addShapeBox(0.5F, -1.8F, -0.45F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		gunModel[9].setRotationPoint(0F, -4F, -1.5F);
		
		gunModel[10].addShapeBox(-0.5F, -0.5F, -0.45F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		gunModel[10].setRotationPoint(0F, -4F, -1.5F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 299
		
		ammoModel[0].addShapeBox(-4F, -2.7F, -4.75F, 3, 2, 4, 0F, 0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F); // Box 299
		ammoModel[0].setRotationPoint(0F, -4F, -1.5F);
		
		
		flipAll();
	}
}
