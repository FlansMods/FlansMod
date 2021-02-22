//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MP5
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

public class ModelMP5 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelMP5() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[32];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 6, 0F); // Import Box0
		gunModel[0].setRotationPoint(-24.25F, 18F, -3F);
		gunModel[0].rotateAngleZ = -0.19198622F;

		gunModel[1].addBox(0F, -17F, 0F, 10, 22, 5, 0F); // Import Box0
		gunModel[1].setRotationPoint(-20F, 4F, -2.5F);
		gunModel[1].rotateAngleZ = -0.12217305F;

		gunModel[2].addBox(0F, -17F, 0F, 4, 4, 4, 0F); // Import Box0
		gunModel[2].setRotationPoint(-23.25F, 16F, -2F);
		gunModel[2].rotateAngleZ = -0.19198622F;

		gunModel[3].addBox(0F, -17F, 0F, 15, 2, 3, 0F); // Import Box0
		gunModel[3].setRotationPoint(-12F, 14F, -1.5F);

		gunModel[4].addBox(0F, -17F, 0F, 4, 46, 6, 0F); // Import Box0
		gunModel[4].setRotationPoint(0F, -13F, -3F);
		gunModel[4].rotateAngleZ = -1.57079633F;

		gunModel[5].addBox(0F, -17F, 0F, 8, 2, 3, 0F); // Import Box0
		gunModel[5].setRotationPoint(18F, -3F, -1.5F);
		gunModel[5].rotateAngleZ = 1.57079633F;

		gunModel[6].addBox(0F, -17F, 0F, 8, 38, 6, 0F); // Import Box0
		gunModel[6].setRotationPoint(28F, -18F, -3F);
		gunModel[6].rotateAngleZ = -1.57079633F;

		gunModel[7].addBox(0F, -17F, 0F, 4, 30, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(40F, -16F, -2F);
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addBox(0F, -17F, 0F, 9, 38, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-8F, -22F, -3.5F);
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 4, 36, 7, 0F); // Import Box0
		gunModel[9].setRotationPoint(28F, -22F, -3.5F);
		gunModel[9].rotateAngleZ = -1.57079633F;

		gunModel[10].addBox(0F, -17F, 0F, 3, 60, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(26F, -24.25F, -3F);
		gunModel[10].rotateAngleZ = -1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 18, 4, 8, 0F); // Import Box0
		gunModel[11].setRotationPoint(-56F, -22.25F, -4F);
		gunModel[11].rotateAngleZ = -1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 22, 6, 8, 0F); // Import Box0
		gunModel[12].setRotationPoint(-60F, -22.25F, -4F);
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(0F, -17F, 0F, 8, 30, 8, 0F); // Import Box0
		gunModel[13].setRotationPoint(26F, -16F, -4F);
		gunModel[13].rotateAngleZ = -1.50098316F;

		gunModel[14].addBox(0F, -17F, 0F, 7, 30, 5, 0F); // Import Box0
		gunModel[14].setRotationPoint(-32F, -20F, -2.5F);
		gunModel[14].rotateAngleZ = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[3];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		defaultScopeModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 34
		defaultScopeModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 34

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[0].setRotationPoint(-12F, -27.25F, 1F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 34
		defaultScopeModel[1].setRotationPoint(-12F, -27.25F, -2F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		defaultScopeModel[2].setRotationPoint(40F, -28.25F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 7, 22, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(7.5F, 5F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.13962634F;

		ammoModel[1].addBox(0F, -17F, 0F, 6, 16, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(13F, 26F, -2F);
		ammoModel[1].rotateAngleZ = 0.27925268F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 5, 18, 5, 0F); // Import Box0
		slideModel[0].setRotationPoint(-10F, -20F, -4.5F);
		slideModel[0].rotateAngleZ = -1.57079633F;

		// Legendary Lion Head
		gunModel[15] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 21
		gunModel[16] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 22
		gunModel[17] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 25
		gunModel[20] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 26
		gunModel[21] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 27
		gunModel[22] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 28
		gunModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 29
		gunModel[24] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 30
		gunModel[25] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 31
		gunModel[26] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 32
		gunModel[27] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 33
		gunModel[28] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 34
		gunModel[29] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 35
		gunModel[30] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 36
		gunModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 37

		gunModel[15].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F); // Box 21
		gunModel[15].setRotationPoint(6F, -21F, 1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 22
		gunModel[16].setRotationPoint(5F, -25F, -5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F); // Box 23
		gunModel[17].setRotationPoint(13F, -23F, 1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[18].setRotationPoint(13F, -18F, 1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 1F, 0F); // Box 25
		gunModel[19].setRotationPoint(13F, -12F, 1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F, 2F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 26
		gunModel[20].setRotationPoint(2F, -27F, 3F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 9, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 2F, 0F, 0F); // Box 27
		gunModel[21].setRotationPoint(1F, -21F, 1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 1F); // Box 28
		gunModel[22].setRotationPoint(3F, -12F, 1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F); // Box 29
		gunModel[23].setRotationPoint(9F, -24.5F, 2.5F);
		gunModel[23].rotateAngleZ = 0.43633231F;

		gunModel[24].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[24].setRotationPoint(13F, -22F, -4F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[25].setRotationPoint(13F, -17F, -5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 1F, 0F); // Box 32
		gunModel[26].setRotationPoint(13F, -12F, -5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 33
		gunModel[27].setRotationPoint(3F, -12F, -5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 5, 9, 4, 0F, -1F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 34
		gunModel[28].setRotationPoint(1F, -21F, -5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 7, 9, 4, 0F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[29].setRotationPoint(6F, -21F, -5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F, 2F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[30].setRotationPoint(2F, -27F, -7F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 1F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 37
		gunModel[31].setRotationPoint(9F, -24.5F, -5.5F);
		gunModel[31].rotateAngleZ = 0.43633231F;



		barrelAttachPoint = new Vector3f(55F /16F, 14F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 24F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(30 /16F, 10F /16F, 0F /16F);


		gunSlideDistance = 1F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}