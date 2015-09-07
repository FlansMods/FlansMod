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

public class ModelFlamethrower extends ModelGun
{
	int textureX = 64;
	int textureY = 16;

	public ModelFlamethrower()	
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 14, 0, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 9
		gunModel[4] = new ModelRendererTurbo(this, 28, 0, textureX, textureY); // Box 13
		gunModel[5] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 20
		gunModel[6] = new ModelRendererTurbo(this, 36, 0, textureX, textureY); // Box 21
		gunModel[7] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Box 22
		gunModel[8] = new ModelRendererTurbo(this, 8, 6, textureX, textureY); // Box 23
		gunModel[9] = new ModelRendererTurbo(this, 30, 3, textureX, textureY); // Box 24
		gunModel[10] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 25

		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -4F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.5F, -0.25F,0F, 0.5F, -0.25F,0F, 0.5F, -0.25F,0F, 0.5F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(3.25F, -2F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0.5F, -0.25F,-0.25F, 0.5F, -0.25F,-0.25F, 0.5F, -0.25F,-0.25F, 0.5F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(0F, -2F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 9
		gunModel[3].setRotationPoint(-10F, -3.5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.8F, -0.25F,-0.25F, -0.8F, -0.25F,-0.25F, -0.8F, -0.25F,-0.25F, -0.8F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F); // Box 13
		gunModel[4].setRotationPoint(1.5F, -1.5F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,0F, 0.5F, -0.25F,-0.5F, 0.5F, -0.25F,-0.5F, 0.5F, -0.25F,0F, 0.5F, -0.25F); // Box 20
		gunModel[5].setRotationPoint(0F, -0.5F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, 0F, -0.25F,-0.25F, -0.5F, -0.25F,-0.25F, -0.5F, -0.25F,-0.25F, -0.5F, -0.25F,-0.25F, -0.5F, -0.25F); // Box 21
		gunModel[6].setRotationPoint(1.5F, -2F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 22
		gunModel[7].setRotationPoint(5F, -4.5F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F,0F, -0.25F, -0.25F,0F, -0.25F, -0.25F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.25F, -0.25F,0F, -0.25F, -0.25F,0F, 0F, 0F); // Box 23
		gunModel[8].setRotationPoint(8F, -4F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F,0F, -0.25F, -0.25F,0F, -0.25F, -0.25F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.25F, -0.25F,0F, -0.25F, -0.25F,0F, 0F, 0F); // Box 24
		gunModel[9].setRotationPoint(6F, -4.5F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 25
		gunModel[10].setRotationPoint(-13F, -4F, -1F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}