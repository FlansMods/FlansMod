//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Galil
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

public class ModelGalil extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelGalil() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[29];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 3, 8, 1, 0F); // Import Box0
		gunModel[0].setRotationPoint(-4F, 14F, -0.5F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, -17F, 0F, 8, 20, 4, 0F); // Import Box0
		gunModel[1].setRotationPoint(-2F, 2F, -2F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-4.5F, 18F, -1F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(0F, -17F, 0F, 37, 6, 8, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, 0F, -4F);

		gunModel[4].addBox(0F, -17F, 0F, 8, 5, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(-2.25F, 17.25F, -1.5F);
		gunModel[4].rotateAngleZ = -0.08726646F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 10, 5, 0F); // Import Box0
		gunModel[5].setRotationPoint(16F, 6F, -2.5F);
		gunModel[5].rotateAngleZ = -0.06981317F;

		gunModel[6].addBox(0F, -17F, 0F, 42, 14, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-4F, -10F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 46, 3, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(-47F, -8F, -2F);

		gunModel[8].addBox(0F, -17F, 0F, 84, 4, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(32F, -7.5F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 30, 10, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(37F, -8.5F, 3F);

		gunModel[10].addBox(0F, -17F, 0F, 30, 10, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(37F, -8.5F, -5F);

		gunModel[11].addBox(0F, -17F, 0F, 38, 2, 5, 0F); // Import Box0
		gunModel[11].setRotationPoint(-2F, -12F, -2.5F);

		gunModel[12].addBox(0F, -17F, 0F, 10, 1, 3, 0F); // Import Box0
		gunModel[12].setRotationPoint(7F, 11F, -1.5F);

		gunModel[13].addBox(0F, -17F, 0F, 26, 3, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(-40F, 8.5F, -1.5F);
		gunModel[13].rotateAngleZ = 0.52359878F;

		gunModel[14].addBox(0F, -17F, 0F, 4, 21, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(-50F, -7.5F, -3.5F);

		gunModel[15].addBox(0F, -17F, 0F, 60, 2, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(36F, -10.5F, -1F);

		gunModel[16].addBox(0F, -17F, 0F, 28, 8, 1, 0F); // Import Box0
		gunModel[16].setRotationPoint(38F, -25F, 13F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addBox(0F, -17F, 0F, 2, 14, 5, 0F); // Import Box0
		gunModel[17].setRotationPoint(80F, -11.5F, -2.5F);

		gunModel[18].addBox(0F, -17F, 0F, 30, 3, 4, 0F); // Import Box0
		gunModel[18].setRotationPoint(-27F, -2.5F, -2F);

		gunModel[19].addBox(0F, -17F, 0F, 4, 12, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(-8F, -9F, -2.5F);

		gunModel[20].addBox(0F, -17F, 0F, 3, 5, 2, 0F); // Import Box0
		gunModel[20].setRotationPoint(-24F, -7F, -1F);

		gunModel[21].addBox(0F, -17F, 0F, 28, 8, 1, 0F); // Import Box0
		gunModel[21].setRotationPoint(38F, -15F, 13F);
		gunModel[21].rotateAngleX = 1.57079633F;

		gunModel[22].addBox(0F, -17F, 0F, 28, 6, 1, 0F); // Import Box0
		gunModel[22].setRotationPoint(38F, -14F, 14F);
		gunModel[22].rotateAngleX = 1.57079633F;

		gunModel[23].addBox(0F, -17F, 0F, 60, 2, 2, 0F); // Import Box0
		gunModel[23].setRotationPoint(30F, -1.5F, -1F);

		gunModel[24].addBox(0F, -17F, 0F, 1, 1, 5, 0F); // Import Box0
		gunModel[24].setRotationPoint(36F, -8F, 1.5F);
		gunModel[24].rotateAngleX = 0.55850536F;

		gunModel[25].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[25].setRotationPoint(36.02F, -5.75F, -7.5F);

		gunModel[26].addBox(0F, -17F, 0F, 1, 5, 1, 0F); // Import Box0
		gunModel[26].setRotationPoint(42.02F, -4.75F, -7.5F);

		gunModel[27].addBox(0F, -17F, 0F, 10, 2, 2, 0F); // Import Box0
		gunModel[27].setRotationPoint(31.02F, -1.25F, -8F);

		gunModel[28].addBox(0F, -17F, 0F, 7, 1, 1, 0F); // Import Box0
		gunModel[28].setRotationPoint(36.02F, -0.75F, -7.5F);


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(97F, -28.5F, -1.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(97.5F, -32.5F, 0.75F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(97.5F, -32.5F, -1.75F);
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


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 16, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(21.5F, 4F, -2F);
		ammoModel[0].rotateAngleZ = 0.2268928F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 22, 3, 0F); // Import Box0
		ammoModel[1].setRotationPoint(26.5F, 18F, -1.5F);
		ammoModel[1].rotateAngleZ = 0.31415927F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(12F, -8F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(13F, -7F, -7.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(110F /16F, 22F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(49 /16F, 15F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}