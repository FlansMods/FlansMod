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

public class ModelPanzerfaust3 extends ModelGun
{
	int textureX = 256;
	int textureY = 16;

	public ModelPanzerfaust3()	
	{
// Gun
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // Grip
		gunModel[1] = new ModelRendererTurbo(this,  9,  1, textureX, textureY); // Grip
		gunModel[2] = new ModelRendererTurbo(this,  17,  1, textureX, textureY); // MainBody
		gunModel[3] = new ModelRendererTurbo(this,  57,  1, textureX, textureY); // BodyCasement
		gunModel[4] = new ModelRendererTurbo(this,  81,  1, textureX, textureY); // RingF
		gunModel[5] = new ModelRendererTurbo(this,  73,  1, textureX, textureY); // Scope
		gunModel[6] = new ModelRendererTurbo(this,  97,  1, textureX, textureY); // ScopeStand
		gunModel[7] = new ModelRendererTurbo(this,  105,  1, textureX, textureY); // RearLoader
		gunModel[8] = new ModelRendererTurbo(this,  121,  1, textureX, textureY); // RearGrip
		gunModel[9] = new ModelRendererTurbo(this,  89,  1, textureX, textureY); // RearGrip
		gunModel[10] = new ModelRendererTurbo(this,  73,  1, textureX, textureY); // 
		gunModel[11] = new ModelRendererTurbo(this,  73,  1, textureX, textureY); // Scope
		gunModel[12] = new ModelRendererTurbo(this,  73,  1, textureX, textureY); // Scope

		gunModel[0].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Grip
		gunModel[0].setRotationPoint(-1F, -3.23F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Grip
		gunModel[1].setRotationPoint(-2F, -4.5F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 17, 2, 2, 0F); // MainBody
		gunModel[2].setRotationPoint(-18F, -6F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // BodyCasement
		gunModel[3].setRotationPoint(-12F, -6.5F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // RingF
		gunModel[4].setRotationPoint(-1F, -6.5F, -1.5F);

		gunModel[5].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Scope
		gunModel[5].setRotationPoint(-2F, -6F, 2.3F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // ScopeStand
		gunModel[6].setRotationPoint(-1F, -6F, 0.3F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // RearLoader
		gunModel[7].setRotationPoint(-19F, -6.5F, -1.5F);

		gunModel[8].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // RearGrip
		gunModel[8].setRotationPoint(-13F, -4F, 0F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // RearGrip
		gunModel[9].setRotationPoint(-13F, -2F, 0F);

		gunModel[10].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Scope
		gunModel[10].setRotationPoint(-2F, -7F, 1.3F);

		gunModel[11].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Scope
		gunModel[11].setRotationPoint(-2F, -8F, 2.3F);

		gunModel[12].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Scope
		gunModel[12].setRotationPoint(-2F, -7F, 3.3F);



// Ammo
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this,  129,  1, textureX, textureY); // RocketMiddle
		ammoModel[1] = new ModelRendererTurbo(this,  153,  1, textureX, textureY); // RocketBody

		ammoModel[0].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // RocketMiddle
		ammoModel[0].setRotationPoint(0F, -5.5F, -0.5F);

		ammoModel[1].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // RocketBody
		ammoModel[1].setRotationPoint(2F, -6F, -1F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
		translateAll(0F, 0F, 3F);
		thirdPersonOffset = new Vector3f(0F, -0.05F, -0.2F);
		
		itemFrameOffset = new Vector3f(8F / 16F, 0F / 16F, 0F);
	}
}