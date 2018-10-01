//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSIGP232 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;
	
	public ModelSIGP232() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[6];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		
		gunModel[0].addShapeBox(0F, 2F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		gunModel[0].setRotationPoint(-0.4F, -6F, -1F);
		
		gunModel[1].addShapeBox(0F, 4F, 0F, 3, 3, 2, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[1].setRotationPoint(-0.4F, -6F, -1F);
		
		gunModel[2].addBox(3F, 3F, 0F, 2, 1, 2, 0F); // Box 4
		gunModel[2].setRotationPoint(-0.4F, -6F, -1F);
		
		gunModel[3].addShapeBox(5F, 2F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[3].setRotationPoint(-0.4F, -6F, -1F);
		
		gunModel[4].addShapeBox(5F, 3F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[4].setRotationPoint(-0.4F, -6F, -1F);
		
		gunModel[5].addShapeBox(1F, 3F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 10
		gunModel[5].setRotationPoint(-0.4F, -6F, -1F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		
		ammoModel[0].addShapeBox(0.5F, 0F, -0.5F, 2, 1, 2, 0F, 0.3F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, -1F, 0.3F, 2F, -1F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0.3F, 0F, -1F); // Box 0
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = -0.12217305F;
		
		
		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 1
		slideModel[1] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Box 8
		slideModel[2] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Box 9
		
		slideModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		slideModel[0].setRotationPoint(-0.4F, -6F, -1F);
		
		slideModel[1].addShapeBox(7F, -0.5F, 0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		slideModel[1].setRotationPoint(-0.4F, -6F, -1F);
		
		slideModel[2].addShapeBox(1F, 0.5F, 0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		slideModel[2].setRotationPoint(-0.4F, -6F, -1F);
		slideModel[2].rotateAngleZ = 0.45378561F;
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;
		
		barrelAttachPoint = new Vector3f(9.0F / 16F, 5F / 16F, 0F / 16F);
		stockAttachPoint = new Vector3f(0F / 16F, 0F / 16F, 0F / 16F);
		scopeAttachPoint = new Vector3f(0F / 16F, 0F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(0 / 16F, 0F / 16F, 0F / 16F);
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
