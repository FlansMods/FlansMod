//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: L86
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

public class ModelL86 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelL86() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 4, 0F); // Import Box0
		gunModel[0].setRotationPoint(13F, 12F, -2F);
		gunModel[0].rotateAngleZ = -0.05235988F;

		gunModel[1].addBox(0F, -17F, 0F, 7, 22, 3, 0F); // Import Box0
		gunModel[1].setRotationPoint(16F, 0F, -1.5F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, -17F, 0F, 5, 12, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(13F, 5F, -1F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(0F, -17F, 0F, 11, 6, 5, 0F); // Import Box0
		gunModel[3].setRotationPoint(10F, 16F, -2.5F);
		gunModel[3].rotateAngleZ = -0.19198622F;

		gunModel[4].addBox(0F, -17F, 0F, 4, 4, 3, 0F); // Import Box0
		gunModel[4].setRotationPoint(13F, 4F, -1.5F);
		gunModel[4].rotateAngleZ = -0.05235988F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 6, 9, 0F); // Import Box0
		gunModel[5].setRotationPoint(31F, 5F, -4.5F);

		gunModel[6].addBox(0F, -17F, 0F, 46, 13, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-11F, -8F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 26, 13, 6, 0F); // Import Box0
		gunModel[7].setRotationPoint(-37F, -8F, -3F);

		gunModel[8].addBox(0F, -17F, 0F, 16, 6, 7, 0F); // Import Box0
		gunModel[8].setRotationPoint(-26F, -9F, -3.5F);
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addBox(0F, -17F, 0F, 66, 5, 5, 0F); // Import Box0
		gunModel[9].setRotationPoint(50F, -7.5F, -2.5F);

		gunModel[10].addBox(0F, -17F, 0F, 27, 9, 6, 0F); // Import Box0
		gunModel[10].setRotationPoint(33F, -11.5F, 12.5F);
		gunModel[10].rotateAngleX = 1.57079633F;

		gunModel[11].addBox(0F, -17F, 0F, 8, 1, 3, 0F); // Import Box0
		gunModel[11].setRotationPoint(24F, 10F, -1.5F);

		gunModel[12].addBox(0F, -17F, 0F, 3, 11, 6, 0F); // Import Box0
		gunModel[12].setRotationPoint(78F, -8.5F, -3F);

		gunModel[13].addBox(0F, -17F, 0F, 78, 3, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(6F, -1.5F, -1.5F);

		gunModel[14].addBox(0F, -17F, 0F, 18, 6, 7, 0F); // Import Box0
		gunModel[14].setRotationPoint(-32F, -7.5F, -3.5F);
		gunModel[14].rotateAngleZ = 1.57079633F;

		gunModel[15].addBox(0F, -17F, 0F, 27, 9, 6, 0F); // Import Box0
		gunModel[15].setRotationPoint(33F, -19.5F, 12.5F);
		gunModel[15].rotateAngleX = 1.57079633F;

		gunModel[16].addBox(0F, -17F, 0F, 24, 8, 7, 0F); // Import Box0
		gunModel[16].setRotationPoint(34F, -7F, -3.5F);

		gunModel[17].addBox(0F, -17F, 0F, 24, 9, 6, 0F); // Import Box0
		gunModel[17].setRotationPoint(-29F, -10.5F, 12.5F);
		gunModel[17].rotateAngleX = 1.57079633F;

		gunModel[18].addBox(0F, -17F, 0F, 16, 9, 6, 0F); // Import Box0
		gunModel[18].setRotationPoint(-38F, -20.5F, 12.5F);
		gunModel[18].rotateAngleX = 1.57079633F;


		defaultScopeModel = new ModelRendererTurbo[7];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 14, 6, 5, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(1F, -21F, -2.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 20, 2, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(78F, -20.5F, -0.5F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 11, 2, 3, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(76F, -20.5F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = 1.57079633F;

		defaultScopeModel[3].addBox(0F, -17F, 0F, 10, 4, 1, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(-14F, -21F, -1.5F);

		defaultScopeModel[4].addBox(0F, -17F, 0F, 10, 4, 1, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(-14F, -21F, 0.5F);

		defaultScopeModel[5].addBox(0F, -17F, 0F, 24, 2, 5, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(-10F, -18F, -2.5F);

		defaultScopeModel[6].addBox(0F, -17F, 0F, 21, 2, 5, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(-1F, -39F, -2.5F);
		defaultScopeModel[6].rotateAngleZ = -1.85004901F;


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 14, 24, 24, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-23.5F, 12F, -12F);
		ammoModel[0].rotateAngleZ = 0.10471976F;

		ammoModel[1].addBox(0F, -17F, 0F, 10, 20, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-21.5F, 14F, -15F);
		ammoModel[1].rotateAngleZ = 0.10471976F;

		ammoModel[2].addBox(0F, -17F, 0F, 10, 20, 4, 0F); // Import Box0
		ammoModel[2].setRotationPoint(-21.5F, 14F, 11F);
		ammoModel[2].rotateAngleZ = 0.10471976F;

		ammoModel[3].addBox(0F, -17F, 0F, 10, 20, 4, 0F); // Import Box0
		ammoModel[3].setRotationPoint(-22.5F, -4F, 7F);
		ammoModel[3].rotateAngleX = 1.57079633F;
		ammoModel[3].rotateAngleZ = 0.10471976F;

		ammoModel[4].addBox(0F, -17F, 0F, 10, 20, 4, 0F); // Import Box0
		ammoModel[4].setRotationPoint(-21.5F, 22F, 7F);
		ammoModel[4].rotateAngleX = 1.57079633F;
		ammoModel[4].rotateAngleZ = 0.10471976F;

		ammoModel[5].addBox(0F, -17F, 0F, 11, 20, 4, 0F); // Import Box0
		ammoModel[5].setRotationPoint(-23F, 0F, -2F);
		ammoModel[5].rotateAngleZ = 0.10471976F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 4, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(-22F, -6F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 2, 3, 8, 0F); // Import Box0
		slideModel[1].setRotationPoint(-23F, -5F, -8.5F);



		barrelAttachPoint = new Vector3f(112F /16F, 22F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(24F /16F, 20F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(3F /16F, 24F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(48 /16F, 13F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}