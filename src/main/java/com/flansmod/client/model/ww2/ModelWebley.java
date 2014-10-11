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

public class ModelWebley extends ModelGun
{
	int textureX = 256;
	int textureY = 128;

	public ModelWebley()	
	{


// Gun
		gunModel = new ModelRendererTurbo[9];
		gunModel[0] = new ModelRendererTurbo(this,  0,  11, textureX, textureY); // Gun1
		gunModel[1] = new ModelRendererTurbo(this,  0,  26, textureX, textureY); // Gun2
		gunModel[2] = new ModelRendererTurbo(this,  0,  37, textureX, textureY); // Gun3
		
		gunModel[3] = new ModelRendererTurbo(this,  0,  83, textureX, textureY); // Gun7
		gunModel[4] = new ModelRendererTurbo(this,  0,  91, textureX, textureY); // Gun8
		gunModel[5] = new ModelRendererTurbo(this,  0,  97, textureX, textureY); // Gun9
		gunModel[6] = new ModelRendererTurbo(this,  0,  102, textureX, textureY); // Gun10
		gunModel[7] = new ModelRendererTurbo(this,  20,  19, textureX, textureY); // Gun11
		gunModel[8] = new ModelRendererTurbo(this,  20,  27, textureX, textureY); // Gun12

		gunModel[0].addBox(0F, 0F, 0F, 5, 9, 4, 0F); // Gun1
		gunModel[0].setRotationPoint(0F, 2F, -2F);

		gunModel[1].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Gun2
		gunModel[1].setRotationPoint(2F, -2F, -2F);

		gunModel[2].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Gun3
		gunModel[2].setRotationPoint(4F, -3F, -1.5F);



		gunModel[3].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Gun7
		gunModel[3].setRotationPoint(4F, -6F, -1.5F);

		gunModel[4].addBox(-3F, 0F, 0F, 2, 1, 1, 0F); // Gun8
		gunModel[4].setRotationPoint(7F, -6F, -0.5F);
		gunModel[4].rotateAngleZ = -0.1745329F;

		gunModel[5].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Gun9
		gunModel[5].setRotationPoint(7F, 1F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Gun10
		gunModel[6].setRotationPoint(14F, -3F, -1.5F);

		gunModel[7].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Gun11
		gunModel[7].setRotationPoint(16F, -6F, -1.5F);

		gunModel[8].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Gun12
		gunModel[8].setRotationPoint(25F, -7F, -0.5F);
		
		revolverBarrelModel = new ModelRendererTurbo[3];
		
		revolverBarrelModel[0] = new ModelRendererTurbo(this,  0,  47, textureX, textureY); // Gun4
		revolverBarrelModel[1] = new ModelRendererTurbo(this,  0,  59, textureX, textureY); // Gun5
		revolverBarrelModel[2] = new ModelRendererTurbo(this,  0,  72, textureX, textureY); // Gun6

		revolverBarrelModel[0].addBox(0F, 0F, 0F, 6, 6, 2, 0F); // Gun4
		revolverBarrelModel[0].setRotationPoint(8F, -5F, -1F);

		revolverBarrelModel[1].addBox(0F, 0F, 0F, 6, 6, 2, 0F); // Gun5
		revolverBarrelModel[1].setRotationPoint(8F, -5F, 1F);

		revolverBarrelModel[2].addBox(0F, 0F, 0F, 6, 6, 2, 0F); // Gun6
		revolverBarrelModel[2].setRotationPoint(8F, -5F, -3F);

// Ammo
		ammoModel = new ModelRendererTurbo[8];
		ammoModel[0] = new ModelRendererTurbo(this,  19,  32, textureX, textureY); // Ammo1
		ammoModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Ammo2
		ammoModel[2] = new ModelRendererTurbo(this,  19,  32, textureX, textureY); // Ammo1
		ammoModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Ammo2
		ammoModel[4] = new ModelRendererTurbo(this,  19,  32, textureX, textureY); // Ammo1
		ammoModel[5] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Ammo2
		ammoModel[6] = new ModelRendererTurbo(this,  19,  32, textureX, textureY); // Ammo1
		ammoModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Ammo2

		ammoModel[0].addBox(0F, 0F, 0.1F, 4, 2, 2, 0F); // Ammo1
		ammoModel[0].setRotationPoint(8.1F, -4F, -3F);

		ammoModel[1].addBox(0F, 0F, 0.1F, 2, 2, 2, 0F); // Ammo2
		ammoModel[1].setRotationPoint(11.9F, -4F, -3F);
		
		ammoModel[2].addBox(0F, 0F, 0.1F, 4, 2, 2, 0F); // Ammo1
		ammoModel[2].setRotationPoint(8.1F, -1.5F, -3F);

		ammoModel[3].addBox(0F, 0F, 0.1F, 2, 2, 2, 0F); // Ammo2
		ammoModel[3].setRotationPoint(11.9F, -1.5F, -3F);
		
		ammoModel[4].addBox(0F, 0F, 0.1F, 4, 2, 2, 0F); // Ammo1
		ammoModel[4].setRotationPoint(8.1F, -4F, 0.5F);

		ammoModel[5].addBox(0F, 0F, 0.1F, 2, 2, 2, 0F); // Ammo2
		ammoModel[5].setRotationPoint(11.9F, -4F, 0.5F);
		
		ammoModel[6].addBox(0F, 0F, 0.1F, 4, 2, 2, 0F); // Ammo1
		ammoModel[6].setRotationPoint(8.1F, -1.5F, 0.5F);

		ammoModel[7].addBox(0F, 0F, 0.1F, 2, 2, 2, 0F); // Ammo2
		ammoModel[7].setRotationPoint(11.9F, -1.5F, 0.5F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.REVOLVER;
		
		
		flipAll();
		translateAll(0F, 13F, 0F);
		thirdPersonOffset = new Vector3f(-0.05F, -0.05F, 0F);
	}
}