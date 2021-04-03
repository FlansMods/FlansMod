//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AK74
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

public class ModelAK74 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelAK74() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[22];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-5F, 12F, -2F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-2F, 1F, -1.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-4F, 9F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 37, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, 1F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 2, 0F); // Import Box0
		gunModel[4].setRotationPoint(-6F, 16F, -1F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 6, 9, 0F); // Import Box0
		gunModel[5].setRotationPoint(16F, 7F, -4.5F);

		gunModel[6].addBox(0F, -17F, 0F, 44, 11, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-6F, -10F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 48, 4, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(-47F, -4F, -3F);
		gunModel[7].rotateAngleZ = 0.10471976F;

		gunModel[8].addBox(0F, -17F, 0F, 84, 4, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(32F, -6.5F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 38, 6, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(34F, -7.5F, 3F);

		gunModel[10].addBox(0F, -17F, 0F, 38, 6, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(34F, -7.5F, -5F);

		gunModel[11].addBox(0F, -17F, 0F, 38, 8, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(34F, -14.5F, 13F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 50, 5, 5, 0F); // Import Box0
		gunModel[12].setRotationPoint(-5F, -12F, -2.5F);

		gunModel[13].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(8F, 10F, -1.5F);

		gunModel[14].addBox(0F, -17F, 0F, 50, 4, 4, 0F); // Import Box0
		gunModel[14].setRotationPoint(-46F, 11F, -2F);
		gunModel[14].rotateAngleZ = 0.31415927F;

		gunModel[15].addBox(0F, -17F, 0F, 4, 20, 7, 0F); // Import Box0
		gunModel[15].setRotationPoint(-52F, -4F, -3.5F);

		gunModel[16].addBox(0F, -17F, 0F, 48, 2, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(40F, -9.5F, -1F);

		gunModel[17].addBox(0F, -17F, 0F, 10, 8, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(34F, -9.5F, 13F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 17, 4, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(45F, -11.5F, 3F);

		gunModel[19].addBox(0F, -17F, 0F, 17, 4, 2, 0F); // Import Box0
		gunModel[19].setRotationPoint(45F, -11.5F, -5F);

		gunModel[20].addBox(0F, -17F, 0F, 27, 8, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(45F, -24F, 13F);
		gunModel[20].rotateAngleX = 1.57079633F;

		gunModel[21].addBox(0F, -17F, 0F, 5, 9, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(80F, -10.5F, -2.5F);


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 15, 2, 1, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(106F, -9.5F, -0.5F);
		defaultScopeModel[0].rotateAngleZ = 0.85521133F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 10, 2, 2, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(120F, -21.5F, -1F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(119F, -28.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(119.5F, -32.5F, 0.75F);
		defaultScopeModel[3].rotateAngleZ = 1.57079633F;

		defaultScopeModel[4].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(119.5F, -32.5F, -1.75F);
		defaultScopeModel[4].rotateAngleZ = 1.57079633F;

		defaultScopeModel[5].addBox(0F, -17F, 0F, 4, 5, 4, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(15F, -28.5F, -2F);
		defaultScopeModel[5].rotateAngleZ = 1.57079633F;

		defaultScopeModel[6].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(15.5F, -28.5F, 1.75F);
		defaultScopeModel[6].rotateAngleZ = 1.57079633F;

		defaultScopeModel[7].addBox(0F, -17F, 0F, 6, 3, 1, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(15.5F, -28.5F, -2.75F);
		defaultScopeModel[7].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 13, 14, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(23.5F, 6F, -2F);
		ammoModel[0].rotateAngleZ = 0.26179939F;

		ammoModel[1].addBox(0F, -17F, 0F, 13, 17, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(28.5F, 19F, -2F);
		ammoModel[1].rotateAngleZ = 0.34906585F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 5, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(4F, -7F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(5F, -6F, -7.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(113F /16F, 21F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(59 /16F, 15F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}