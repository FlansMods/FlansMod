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
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFlamethrower extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelFlamethrower()	
	{


// Gun
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape1
		gunModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape2
		gunModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape4
		gunModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape4
		gunModel[4] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape5
		gunModel[5] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape6
		gunModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape7
		gunModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape8
		gunModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape9
		gunModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape10

		gunModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Shape1
		gunModel[0].setRotationPoint(0F, -3.5F, -0.5F);
		gunModel[0].rotateAngleZ = -0.1396263F;

		gunModel[1].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Shape2
		gunModel[1].setRotationPoint(-3F, -4F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Shape4
		gunModel[2].setRotationPoint(-12F, -1F, 3F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Shape4
		gunModel[3].setRotationPoint(-12F, -1F, 8F);

		gunModel[4].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Shape5
		gunModel[4].setRotationPoint(13F, -4.5F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Shape6
		gunModel[5].setRotationPoint(8F, -4F, -0.5F);
		gunModel[5].rotateAngleZ = -0.1570796F;

		gunModel[6].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Shape7
		gunModel[6].setRotationPoint(-10F, -2.7F, -0.5F);
		gunModel[6].rotateAngleZ = 0.05235988F;

		gunModel[7].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Shape8
		gunModel[7].setRotationPoint(-15F, -1F, 1.5F);
		gunModel[7].rotateAngleY = -0.3665192F;
		gunModel[7].rotateAngleZ = 0.3141593F;

		gunModel[8].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Shape9
		gunModel[8].setRotationPoint(-4F, -3F, -1F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Shape10
		gunModel[9].setRotationPoint(-15F, -1F, 1.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Tank

		ammoModel[0].addBox(-17.5F, -2F, 3F, 6, 12, 6, 0F); // Tank
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
	}
}