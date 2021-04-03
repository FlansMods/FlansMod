//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ACR
// Model Creator: 
// Created on: 02.03.2020 - 22:50:09
// Last changed on: 02.03.2020 - 22:50:09

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelACR extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelACR() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-6F, 5F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-3F, -7F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-6F, -2F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-9F, 9F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-6F, -3F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 14, 6, 8, 0F); // Import Box0
		gunModel[5].setRotationPoint(15F, -2F, -4F);

		gunModel[6].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-12F, -13F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 22, 12, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(-34F, -13F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 16, 6, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-23F, -14F, -3.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 66, 5, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(6F, -9.5F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 27, 9, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(33F, -17.5F, 12.5F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 18, 6, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(-29F, -12.5F, -3.5F);
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 24, 8, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(34F, -13F, -3.5F);

		gunModel[13].addBox(0F, -17F, 0F, 20, 9, 8, 0F); // Import Box0
		gunModel[13].setRotationPoint(-31F, -17.5F, 12.5F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 18, 2, 5, 0F); // Import Box0
		gunModel[14].setRotationPoint(-10F, 15F, -2.5F);
		gunModel[14].rotateAngleZ = -0.19198622F;

		gunModel[15].addBox(0F, -17F, 0F, 18, 2, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(25F, 9F, -3F);
		gunModel[15].rotateAngleZ = 1.18682389F;


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(70F, -28.5F, -1.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(70.5F, -32.5F, 0.75F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(70.5F, -32.5F, -1.75F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(15F, -28.5F, -2F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(15.5F, -28.5F, 1.75F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(15.5F, -28.5F, -2.75F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 24, 6, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-27F, -1F, -3F);
		ammoModel[0].rotateAngleZ = 0.10471976F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 14, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(-22F, -11F, -5.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 3, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(-23F, -10.5F, -7F);



		barrelAttachPoint = new Vector3f(71F /16F, 24F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 30F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(44 /16F, 18F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.RIFLE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}