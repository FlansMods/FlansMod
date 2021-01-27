//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: G36
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

public class ModelG36 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelG36() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[29];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(-14F, 16F, -2F);
		gunModel[0].rotateAngleZ = -0.20943951F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(-10F, 5F, -1.5F);
		gunModel[1].rotateAngleZ = -0.20943951F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-13F, 13F, -1F);
		gunModel[2].rotateAngleZ = -0.20943951F;

		gunModel[3].addBox(0F, -17F, 0F, 28, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(-12F, 4F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 2, 0F); // Import Box0
		gunModel[4].setRotationPoint(-16F, 20F, -1F);
		gunModel[4].rotateAngleZ = -0.20943951F;

		gunModel[5].addBox(0F, -17F, 0F, 2, 6, 2, 0F); // Import Box0
		gunModel[5].setRotationPoint(7F, 10F, -1F);

		gunModel[6].addBox(0F, -17F, 0F, 34, 10, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-10F, -5F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 50, 2, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(-50F, -3F, -2F);

		gunModel[8].addBox(0F, -17F, 0F, 30, 4, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(42F, 0F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 34, 5, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(24F, 0.5F, 3F);

		gunModel[10].addBox(0F, -17F, 0F, 34, 5, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(24F, 0.5F, -5F);

		gunModel[11].addBox(0F, -17F, 0F, 34, 7, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(24F, -8.5F, 13F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 8, 2, 1, 0F); // Import Box0
		gunModel[12].setRotationPoint(0F, 14F, -0.5F);

		gunModel[13].addBox(0F, -17F, 0F, 50, 3, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(-48F, 10F, -1.5F);
		gunModel[13].rotateAngleZ = 0.10471976F;

		gunModel[14].addBox(0F, -17F, 0F, 3, 26, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(-51F, -4F, -3.5F);

		gunModel[15].addBox(0F, -17F, 0F, 12, 2, 2, 0F); // Import Box0
		gunModel[15].setRotationPoint(49F, -3.5F, -1F);

		gunModel[16].addBox(0F, -17F, 0F, 20, 5, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(36F, -4.5F, 3F);

		gunModel[17].addBox(0F, -17F, 0F, 20, 5, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(36F, -4.5F, -5F);

		gunModel[18].addBox(0F, -17F, 0F, 33, 7, 6, 0F); // Import Box0
		gunModel[18].setRotationPoint(24F, -16F, 13F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addBox(0F, -19F, 0F, 2, 13, 5, 0F); // Import Box0
		gunModel[19].setRotationPoint(57F, -2.5F, -2.5F);

		gunModel[20].addBox(0F, -19F, 0F, 2, 7, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(55F, 5.5F, -2.5F);

		gunModel[21].addBox(0F, -17F, 0F, 18, 14, 8, 0F); // Import Box0
		gunModel[21].setRotationPoint(9F, 2F, -4F);

		gunModel[22].addBox(0F, -17F, 0F, 2, 24, 5, 0F); // Import Box0
		gunModel[22].setRotationPoint(-48F, -4F, -2.5F);

		gunModel[23].addBox(0F, -17F, 0F, 4, 10, 1, 0F); // Import Box0
		gunModel[23].setRotationPoint(-21F, -2F, -0.5F);

		gunModel[24].addBox(0F, -17F, 0F, 5, 10, 6, 0F); // Import Box0
		gunModel[24].setRotationPoint(-4.5F, -10F, 2.5F);
		gunModel[24].rotateAngleY = -1.57079633F;

		gunModel[25].addBox(0F, -17F, 0F, 6, 10, 12, 0F); // Import Box0
		gunModel[25].setRotationPoint(1.5F, -10.5F, 3F);
		gunModel[25].rotateAngleY = -1.57079633F;

		gunModel[26].addBox(0F, -17F, 0F, 5, 2, 43, 0F); // Import Box0
		gunModel[26].setRotationPoint(-1.5F, -12F, 2.5F);
		gunModel[26].rotateAngleY = -1.57079633F;

		gunModel[27].addBox(0F, -17F, 0F, 7, 7, 6, 0F); // Import Box0
		gunModel[27].setRotationPoint(35.5F, -10.5F, 3.5F);
		gunModel[27].rotateAngleY = -1.57079633F;

		gunModel[28].addBox(0F, -17F, 0F, 7, 4, 13, 0F); // Import Box0
		gunModel[28].setRotationPoint(41.5F, -8.5F, 3.5F);
		gunModel[28].rotateAngleY = -1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(56F, -28.5F, -1.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(56.5F, -32.5F, 0.75F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(56.5F, -32.5F, -1.75F);
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
		ammoModel[0] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 12, 10, 5, 0F); // Import Box0
		ammoModel[0].setRotationPoint(13.5F, 14F, -2.5F);
		ammoModel[0].rotateAngleZ = 0.10471976F;

		ammoModel[1].addBox(0F, -17F, 0F, 11, 14, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(16.5F, 23F, -2F);
		ammoModel[1].rotateAngleZ = 0.20943951F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 18, 5, 4, 0F); // Import Box0
		slideModel[0].setRotationPoint(4F, -4F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(5F, -3F, -7.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(68F /16F, 15F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 29F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(45 /16F, 9F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}