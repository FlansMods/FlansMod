//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: -
// Last changed on: -

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelType14 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	public ModelType14() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import GN,HandleRight
		gunModel[1] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import GN,HandleLeft
		gunModel[2] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import GN,HandleRightForwards
		gunModel[3] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import GN,HandleLeftForwards
		gunModel[4] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Import AM,Clip
		gunModel[5] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Import GN,Mainbodybottomleft
		gunModel[6] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Import GN,Trigger
		gunModel[7] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Import GN,Barrel
		gunModel[8] = new ModelRendererTurbo(this, 0, 295, textureX, textureY); // Import SL,Slide
		gunModel[9] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Import GN,MainbodyTopRight
		gunModel[10] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Import GN,Backdetail
		gunModel[11] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Import GN,Ironsight
		gunModel[12] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Import GN,MainbodyTopRight
		gunModel[13] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Import GN,Mainbodybottomright
		
		gunModel[0].addBox(0F, 0F, -0.3F, 1, 5, 1, 0F); // Import GN,HandleRight
		gunModel[0].setRotationPoint(0F, -3F, 0F);
		gunModel[0].rotateAngleZ = -0.26179939F;
		
		gunModel[1].addBox(0F, 0F, -0.7F, 1, 5, 1, 0F); // Import GN,HandleLeft
		gunModel[1].setRotationPoint(0F, -3F, 0F);
		gunModel[1].rotateAngleZ = -0.26179939F;
		
		gunModel[2].addBox(0.3F, 0F, -0.3F, 1, 5, 1, 0F); // Import GN,HandleRightForwards
		gunModel[2].setRotationPoint(0F, -3F, 0F);
		gunModel[2].rotateAngleZ = -0.26179939F;
		
		gunModel[3].addBox(0.3F, 0F, -0.7F, 1, 5, 1, 0F); // Import GN,HandleLeftForwards
		gunModel[3].setRotationPoint(0F, -3F, 0F);
		gunModel[3].rotateAngleZ = -0.26179939F;
		
		gunModel[4].addBox(0.2F, 0.5F, -0.5F, 1, 4, 1, 0F); // Import AM,Clip
		gunModel[4].setRotationPoint(0F, -3F, 0F);
		gunModel[4].rotateAngleZ = -0.26179939F;
		
		gunModel[5].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import GN,Mainbodybottomleft
		gunModel[5].setRotationPoint(-1.2F, -3F, -0.6F);
		
		gunModel[6].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import GN,Trigger
		gunModel[6].setRotationPoint(0.3F, -2F, -0.5F);
		
		gunModel[7].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import GN,Barrel
		gunModel[7].setRotationPoint(0.5F, -3.3F, -0.5F);
		
		gunModel[8].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import SL,Slide
		gunModel[8].setRotationPoint(-1.5F, -3.3F, -0.5F);
		
		gunModel[9].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import GN,MainbodyTopRight
		gunModel[9].setRotationPoint(-1.2F, -3.5F, -0.4F);
		
		gunModel[10].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import GN,Backdetail
		gunModel[10].setRotationPoint(-1F, -2.5F, -0.5F);
		
		gunModel[11].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Import GN,Ironsight
		gunModel[11].setRotationPoint(4.2F, -3.6F, 0F);
		
		gunModel[12].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import GN,MainbodyTopRight
		gunModel[12].setRotationPoint(-1.2F, -3.5F, -0.6F);
		
		gunModel[13].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import GN,Mainbodybottomright
		gunModel[13].setRotationPoint(-1.2F, -3F, -0.4F);
		
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
