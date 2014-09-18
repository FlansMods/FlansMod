//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMP9 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelMP9()	
	{


// Gun
		gunModel = new ModelRendererTurbo[8];
		gunModel[0] = new ModelRendererTurbo(this,  0,  37, textureX, textureY); // Import_Shape1
		gunModel[1] = new ModelRendererTurbo(this,  46,  0, textureX, textureY); // Import_Shape1
		gunModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Import_Shape1
		gunModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Import_Shape1
		gunModel[4] = new ModelRendererTurbo(this,  0,  22, textureX, textureY); // 
		gunModel[5] = new ModelRendererTurbo(this,  0,  13, textureX, textureY); // Import_Shape1
		gunModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Import_Shape1
		gunModel[7] = new ModelRendererTurbo(this,  0,  22, textureX, textureY); // Box_0

		gunModel[0].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import_Shape1
		gunModel[0].setRotationPoint(4F, -3F, 0F);
		gunModel[0].rotateAngleZ = -0.2443461F;

		gunModel[1].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import_Shape1
		gunModel[1].setRotationPoint(7F, -5F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import_Shape1
		gunModel[2].setRotationPoint(4F, -5.5F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import_Shape1
		gunModel[3].setRotationPoint(6F, -4.5F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import_Shape1
		gunModel[4].setRotationPoint(0F, -3F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import_Shape1
		gunModel[5].setRotationPoint(-2F, -5F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import_Shape1
		gunModel[6].setRotationPoint(-1F, -5.5F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box_0
		gunModel[7].setRotationPoint(2F, -3F, -1F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  33,  0, textureX, textureY); // Import_AMMO

		ammoModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Import_AMMO
		ammoModel[0].setRotationPoint(0.7F, 0F, -0.5F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.PISTOL_CLIP;

		flipAll();
	}
}
