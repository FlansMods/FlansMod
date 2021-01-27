//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Predator37mm
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

public class ModelPredator37mm extends ModelGun //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelPredator37mm() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 1033, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 1177, 89, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 1297, 193, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 1297, 297, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 1809, 289, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 1017, 417, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 129, 433, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 337, 433, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 513, 449, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 1449, 449, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 1985, 153, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 1513, 449, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 673, 233, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 500, 12, 12, 0F); // Import Box0
		gunModel[0].setRotationPoint(142F, -8F, -24F);

		gunModel[1].addBox(0F, -17F, 0F, 10, 60, 6, 0F); // Import Box0
		gunModel[1].setRotationPoint(168F, -108.5F, -29F);

		gunModel[2].addBox(0F, -17F, 0F, 4, 54, 10, 0F); // Import Box0
		gunModel[2].setRotationPoint(178F, -125.5F, -10F);
		gunModel[2].rotateAngleX = 1.57079633F;
		gunModel[2].rotateAngleZ = 1.57079633F;

		gunModel[3].addBox(0F, -17F, 0F, 8, 52, 52, 0F); // Import Box0
		gunModel[3].setRotationPoint(466F, -10F, -26F);

		gunModel[4].addBox(0F, -17F, 0F, 38, 24, 24, 0F); // Import Box0
		gunModel[4].setRotationPoint(429F, -76F, -12F);

		gunModel[5].addBox(0F, -17F, 0F, 310, 20, 64, 0F); // Import Box0
		gunModel[5].setRotationPoint(130F, -62.5F, -32F);

		gunModel[6].addBox(0F, -17F, 0F, 340, 12, 32, 0F); // Import Box0
		gunModel[6].setRotationPoint(54F, 70F, -16F);

		gunModel[7].addBox(0F, -17F, 0F, 90, 12, 12, 0F); // Import Box0
		gunModel[7].setRotationPoint(294F, 58.5F, -6F);

		gunModel[8].addBox(0F, -17F, 0F, 90, 12, 24, 0F); // Import Box0
		gunModel[8].setRotationPoint(324F, -74F, -12F);

		gunModel[9].addBox(0F, -17F, 0F, 160, 18, 18, 0F); // Import Box0
		gunModel[9].setRotationPoint(54F, 7F, -9F);

		gunModel[10].addBox(0F, -17F, 0F, 248, 46, 56, 0F); // Import Box0
		gunModel[10].setRotationPoint(-45F, -42F, -28F);

		gunModel[11].addBox(0F, -17F, 0F, 248, 30, 46, 0F); // Import Box0
		gunModel[11].setRotationPoint(-51F, 40F, -23F);

		gunModel[12].addBox(0F, -17F, 0F, 189, 42, 42, 0F); // Import Box0
		gunModel[12].setRotationPoint(-46F, 2F, -21F);

		gunModel[13].addBox(0F, -17F, 0F, 200, 30, 12, 0F); // Import Box0
		gunModel[13].setRotationPoint(190F, -50F, -6F);

		gunModel[14].addBox(0F, -17F, 0F, 180, 46, 52, 0F); // Import Box0
		gunModel[14].setRotationPoint(-74F, 71F, -26F);

		gunModel[15].addBox(0F, -17F, 0F, 130, 30, 42, 0F); // Import Box0
		gunModel[15].setRotationPoint(-36F, -70F, -21F);

		gunModel[16].addBox(0F, -17F, 0F, 200, 50, 52, 0F); // Import Box0
		gunModel[16].setRotationPoint(-229F, -18F, -26F);

		gunModel[17].addBox(0F, -17F, 0F, 176, 12, 36, 0F); // Import Box0
		gunModel[17].setRotationPoint(-240F, 102F, -18F);

		gunModel[18].addBox(0F, -17F, 0F, 30, 12, 32, 0F); // Import Box0
		gunModel[18].setRotationPoint(-258F, 80F, -16F);
		gunModel[18].rotateAngleZ = -0.6981317F;

		gunModel[19].addBox(0F, -17F, 0F, 80, 20, 38, 0F); // Import Box0
		gunModel[19].setRotationPoint(-239F, 76F, -19F);
		gunModel[19].rotateAngleZ = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 40, 46, 64, 0F); // Import Box0
		gunModel[20].setRotationPoint(-266F, 4F, -32F);

		gunModel[21].addBox(0F, -17F, 0F, 500, 12, 12, 0F); // Import Box0
		gunModel[21].setRotationPoint(142F, -8F, 12F);

		gunModel[22].addBox(0F, -17F, 0F, 500, 12, 12, 0F); // Import Box0
		gunModel[22].setRotationPoint(142F, 28F, -24F);

		gunModel[23].addBox(0F, -17F, 0F, 500, 12, 12, 0F); // Import Box0
		gunModel[23].setRotationPoint(142F, 28F, 12F);

		gunModel[24].addBox(0F, -17F, 0F, 8, 52, 52, 0F); // Import Box0
		gunModel[24].setRotationPoint(490F, -10F, -26F);

		gunModel[25].addBox(0F, -17F, 0F, 50, 52, 52, 0F); // Import Box0
		gunModel[25].setRotationPoint(137F, -10F, -26F);

		gunModel[26].addBox(0F, -17F, 0F, 20, 20, 64, 0F); // Import Box0
		gunModel[26].setRotationPoint(410F, -82.5F, -32F);

		gunModel[27].addBox(0F, -17F, 0F, 400, 20, 64, 0F); // Import Box0
		gunModel[27].setRotationPoint(100F, 76.5F, -32F);

		gunModel[28].addBox(0F, -17F, 0F, 20, 20, 56, 0F); // Import Box0
		gunModel[28].setRotationPoint(488F, 62.5F, -29F);

		gunModel[29].addBox(0F, -17F, 0F, 12, 134, 12, 0F); // Import Box0
		gunModel[29].setRotationPoint(420F, -48.5F, 32F);
		gunModel[29].rotateAngleZ = 0.52359878F;

		gunModel[30].addBox(0F, -17F, 0F, 12, 134, 12, 0F); // Import Box0
		gunModel[30].setRotationPoint(420F, -48.5F, -44F);
		gunModel[30].rotateAngleZ = 0.52359878F;

		gunModel[31].addBox(0F, -17F, 0F, 20, 20, 92, 0F); // Import Box0
		gunModel[31].setRotationPoint(464F, 62.5F, -46F);

		gunModel[32].addBox(0F, -17F, 0F, 10, 60, 6, 0F); // Import Box0
		gunModel[32].setRotationPoint(168F, -108.5F, 23F);

		gunModel[33].addBox(0F, -17F, 0F, 14, 42, 14, 0F); // Import Box0
		gunModel[33].setRotationPoint(180F, -120.5F, -4F);
		gunModel[33].rotateAngleX = 1.57079633F;
		gunModel[33].rotateAngleZ = 1.57079633F;


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 1793, 89, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 1769, 209, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 1033, 361, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 120, 100, 140, 0F); // Import Box0
		ammoModel[0].setRotationPoint(16F, 53F, 26F);

		ammoModel[1].addBox(0F, -17F, 0F, 80, 100, 12, 0F); // Import Box0
		ammoModel[1].setRotationPoint(40F, -18F, 40F);
		ammoModel[1].rotateAngleX = 1.04719755F;

		ammoModel[2].addBox(0F, -17F, 0F, 80, 66, 12, 0F); // Import Box0
		ammoModel[2].setRotationPoint(40F, 36F, 123F);
		ammoModel[2].rotateAngleX = 0.45378561F;

		ammoModel[3].addBox(0F, -17F, 0F, 88, 24, 24, 0F); // Import Box0
		ammoModel[3].setRotationPoint(36F, 18F, 103F);

		ammoModel[4].addBox(0F, -17F, 0F, 88, 24, 24, 0F); // Import Box0
		ammoModel[4].setRotationPoint(36F, -25F, 8F);



		barrelAttachPoint = new Vector3f(107F /16F, 19F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(51F /16F, 15F /16F, 8F /16F);

		scopeAttachPoint = new Vector3f(18F /16F, 26F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(26 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 14F;


		animationType = EnumAnimationType.SIDE_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}