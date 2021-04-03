//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MTAR
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

public class ModelMTAR extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelMTAR() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 4, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-6F, 6F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 4, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-3F, -6F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-6F, -1F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 8, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(-10F, 10F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-6F, -2F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 14, 6, 8, 0F); // Import Box0
		gunModel[5].setRotationPoint(15F, -1F, -4F);

		gunModel[6].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-12F, -12F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 22, 17, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(-34F, -12F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 22, 8, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-25F, -7F, -3.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 66, 5, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(14F, -8.5F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 36, 9, 12, 0F); // Import Box0
		gunModel[10].setRotationPoint(20F, -11.5F, 12.5F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 24, 4, 7, 0F); // Import Box0
		gunModel[11].setRotationPoint(-29F, -5.5F, -3.5F);
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 18, 8, 7, 0F); // Import Box0
		gunModel[12].setRotationPoint(34F, -12F, -3.5F);

		gunModel[13].addBox(0F, -17F, 0F, 25, 9, 13, 0F); // Import Box0
		gunModel[13].setRotationPoint(-36F, -9.5F, 12.5F);
		gunModel[13].rotateAngleX = 1.57079633F;

		gunModel[14].addBox(0F, -17F, 0F, 18, 2, 5, 0F); // Import Box0
		gunModel[14].setRotationPoint(-10F, 16F, -2.5F);
		gunModel[14].rotateAngleZ = -0.19198622F;

		gunModel[15].addBox(0F, -17F, 0F, 18, 2, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(25F, 10F, -3F);
		gunModel[15].rotateAngleZ = 1.18682389F;


		defaultScopeModel = new ModelRendererTurbo[7];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 7, 2, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(66F, -23.5F, -1.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(68F, -28.5F, -1.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(68.5F, -32.5F, 0.75F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(68.5F, -32.5F, -1.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(15F, -28.5F, -2F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(15.5F, -28.5F, 1.75F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(15.5F, -28.5F, -2.75F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 16, 6, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-28F, 7F, -3F);
		ammoModel[0].rotateAngleZ = 0.10471976F;

		ammoModel[1].addBox(0F, -17F, 0F, 14, 8, 6, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-25F, 23F, -3F);
		ammoModel[1].rotateAngleZ = 0.19198622F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 14, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(-22F, -10F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 3, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(-23F, -9.5F, -6F);



		barrelAttachPoint = new Vector3f(77F /16F, 23F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(36 /16F, 14F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.RIFLE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}