//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelType14 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelType14()	
	{


// Gun
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // GN.HandleRight
		gunModel[1] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // GN.HandleLeft
		gunModel[2] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // GN.HandleRightForwards
		gunModel[3] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // GN.HandleLeftForwards
		gunModel[4] = new ModelRendererTurbo(this,  0,  73, textureX, textureY); // 
		gunModel[5] = new ModelRendererTurbo(this,  0,  83, textureX, textureY); // GN.Trigger
		gunModel[6] = new ModelRendererTurbo(this,  0,  285, textureX, textureY); // GN.Barrel
		gunModel[7] = new ModelRendererTurbo(this,  0,  73, textureX, textureY); // 
		gunModel[8] = new ModelRendererTurbo(this,  0,  285, textureX, textureY); // GN.Backdetail
		gunModel[9] = new ModelRendererTurbo(this,  0,  305, textureX, textureY); // GN.Ironsight
		gunModel[10] = new ModelRendererTurbo(this,  0,  73, textureX, textureY); // GN.MainbodyTopRight
		gunModel[11] = new ModelRendererTurbo(this,  0,  73, textureX, textureY); // GN.Mainbodybottomright

		gunModel[0].addBox(0F, 0F, -0.3F, 1, 5, 1, 0F); // GN.HandleRight
		gunModel[0].setRotationPoint(0F, -3F, 0F);
		gunModel[0].rotateAngleZ = -0.2617994F;

		gunModel[1].addBox(0F, 0F, -0.7F, 1, 5, 1, 0F); // GN.HandleLeft
		gunModel[1].setRotationPoint(0F, -3F, 0F);
		gunModel[1].rotateAngleZ = -0.2617994F;

		gunModel[2].addBox(0.3F, 0F, -0.3F, 1, 5, 1, 0F); // GN.HandleRightForwards
		gunModel[2].setRotationPoint(0F, -3F, 0F);
		gunModel[2].rotateAngleZ = -0.2617994F;

		gunModel[3].addBox(0.3F, 0F, -0.7F, 1, 5, 1, 0F); // GN.HandleLeftForwards
		gunModel[3].setRotationPoint(0F, -3F, 0F);
		gunModel[3].rotateAngleZ = -0.2617994F;

		gunModel[4].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // GN.Mainbodybottomleft
		gunModel[4].setRotationPoint(-1.2F, -3F, -0.6F);

		gunModel[5].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // GN.Trigger
		gunModel[5].setRotationPoint(0.3F, -2F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // GN.Barrel
		gunModel[6].setRotationPoint(0.5F, -3.3F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // GN.MainbodyTopRight
		gunModel[7].setRotationPoint(-1.2F, -3.5F, -0.4F);

		gunModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // GN.Backdetail
		gunModel[8].setRotationPoint(-1F, -2.5F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // GN.Ironsight
		gunModel[9].setRotationPoint(4.2F, -3.6F, 0F);

		gunModel[10].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // GN.MainbodyTopRight
		gunModel[10].setRotationPoint(-1.2F, -3.5F, -0.6F);

		gunModel[11].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // GN.Mainbodybottomright
		gunModel[11].setRotationPoint(-1.2F, -3F, -0.4F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  306, textureX, textureY); // AM.Clip

		ammoModel[0].addBox(0.2F, 0.5F, -0.5F, 1, 4, 1, 0F); // AM.Clip
		ammoModel[0].setRotationPoint(0F, -3F, 0F);
		ammoModel[0].rotateAngleZ = -0.2617994F;



// Slide
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  0,  295, textureX, textureY); // SL.Slide

		slideModel[0].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // SL.Slide
		slideModel[0].setRotationPoint(-1.5F, -3.3F, -0.5F);

		


		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.PISTOL_CLIP;

		flipAll();
	}
}