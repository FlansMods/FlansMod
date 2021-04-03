//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: G3
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

public class ModelG3 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 64;

	public ModelG3() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[23];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 777, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box0

		gunModel[0].addBox(0F, -17F, 0F, 7, 8, 3, 0F); // Import Box0
		gunModel[0].setRotationPoint(-4F, 12F, -1.5F);
		gunModel[0].rotateAngleZ = -0.15707963F;

		gunModel[1].addBox(0F, -17F, 0F, 9, 22, 4, 0F); // Import Box0
		gunModel[1].setRotationPoint(-1F, 1F, -2F);
		gunModel[1].rotateAngleZ = -0.15707963F;

		gunModel[2].addBox(0F, -17F, 0F, 6, 4, 2, 0F); // Import Box0
		gunModel[2].setRotationPoint(-3F, 9F, -1F);
		gunModel[2].rotateAngleZ = -0.15707963F;

		gunModel[3].addBox(0F, -17F, 0F, 48, 6, 7, 0F); // Import Box0
		gunModel[3].setRotationPoint(0F, -1F, -3.5F);

		gunModel[4].addBox(0F, -17F, 0F, 5, 6, 2, 0F); // Import Box0
		gunModel[4].setRotationPoint(-5F, 16F, -1F);
		gunModel[4].rotateAngleZ = -0.15707963F;

		gunModel[5].addBox(0F, -17F, 0F, 4, 8, 4, 0F); // Import Box0
		gunModel[5].setRotationPoint(18F, 4F, -2F);

		gunModel[6].addBox(0F, -17F, 0F, 54, 11, 7, 0F); // Import Box0
		gunModel[6].setRotationPoint(-6F, -12F, -3.5F);

		gunModel[7].addBox(0F, -17F, 0F, 47, 11, 4, 0F); // Import Box0
		gunModel[7].setRotationPoint(-54F, -10F, -2F);

		gunModel[8].addBox(0F, -17F, 0F, 74, 4, 4, 0F); // Import Box0
		gunModel[8].setRotationPoint(46F, -6F, -2F);

		gunModel[9].addBox(0F, -17F, 0F, 50, 5, 2, 0F); // Import Box0
		gunModel[9].setRotationPoint(48F, -6.5F, 3F);

		gunModel[10].addBox(0F, -17F, 0F, 50, 5, 2, 0F); // Import Box0
		gunModel[10].setRotationPoint(48F, -6.5F, -5F);

		gunModel[11].addBox(0F, -17F, 0F, 50, 7, 4, 0F); // Import Box0
		gunModel[11].setRotationPoint(48F, -14.5F, 13F);
		gunModel[11].rotateAngleX = 1.57079633F;

		gunModel[12].addBox(0F, -17F, 0F, 18, 6, 5, 0F); // Import Box0
		gunModel[12].setRotationPoint(-40F, -13F, -2.5F);

		gunModel[13].addBox(0F, -17F, 0F, 12, 2, 3, 0F); // Import Box0
		gunModel[13].setRotationPoint(9F, 10.25F, -1.5F);

		gunModel[14].addBox(0F, -17F, 0F, 56, 8, 6, 0F); // Import Box0
		gunModel[14].setRotationPoint(-52F, 2F, -3F);
		gunModel[14].rotateAngleZ = 0.17453293F;

		gunModel[15].addBox(0F, -17F, 0F, 8, 22, 7, 0F); // Import Box0
		gunModel[15].setRotationPoint(-58F, -11F, -3.5F);

		gunModel[16].addBox(0F, -17F, 0F, 60, 2, 2, 0F); // Import Box0
		gunModel[16].setRotationPoint(46F, -4.5F, -1F);

		gunModel[17].addBox(0F, -17F, 0F, 38, 3, 2, 0F); // Import Box0
		gunModel[17].setRotationPoint(48F, -9.5F, 3F);

		gunModel[18].addBox(0F, -17F, 0F, 38, 3, 2, 0F); // Import Box0
		gunModel[18].setRotationPoint(48F, -9.5F, -5F);

		gunModel[19].addBox(0F, -17F, 0F, 49, 7, 6, 0F); // Import Box0
		gunModel[19].setRotationPoint(48F, -23F, 13F);
		gunModel[19].rotateAngleX = 1.57079633F;

		gunModel[20].addBox(0F, -17F, 0F, 2, 9, 5, 0F); // Import Box0
		gunModel[20].setRotationPoint(98F, -10.5F, -2.5F);

		gunModel[21].addBox(0F, -17F, 0F, 1, 14, 5, 0F); // Import Box0
		gunModel[21].setRotationPoint(97F, -14.5F, -2.5F);

		gunModel[22].addBox(0F, -17F, 0F, 80, 4, 3, 0F); // Import Box0
		gunModel[22].setRotationPoint(2F, -13.5F, -1.5F);


		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0

		defaultScopeModel[0].addBox(0F, -17F, 0F, 5, 2, 3, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(113F, -28.5F, -1.5F);
		defaultScopeModel[0].rotateAngleZ = 1.57079633F;

		defaultScopeModel[1].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(113.5F, -32.5F, 0.75F);
		defaultScopeModel[1].rotateAngleZ = 1.57079633F;

		defaultScopeModel[2].addBox(0F, -17F, 0F, 3, 1, 1, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(113.5F, -32.5F, -1.75F);
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
		ammoModel[0] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Import Box0

		ammoModel[0].addBox(0F, -17F, 0F, 13, 17, 4, 0F); // Import Box0
		ammoModel[0].setRotationPoint(27.5F, 4F, -2F);

		ammoModel[1].addBox(0F, -17F, 0F, 11, 1, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(27.5F, 21F, -2F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0

		slideModel[0].addBox(0F, -17F, 0F, 22, 5, 7, 0F); // Import Box0
		slideModel[0].setRotationPoint(14F, -8F, -4.5F);

		slideModel[1].addBox(0F, -17F, 0F, 1, 2, 5, 0F); // Import Box0
		slideModel[1].setRotationPoint(15F, -7F, -7.5F);
		slideModel[1].rotateAngleX = 0.03490659F;



		barrelAttachPoint = new Vector3f(116F /16F, 21F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(29F /16F, 19F /16F, 3F /16F);

		scopeAttachPoint = new Vector3f(0F /16F, 30F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(84 /16F, 15F /16F, 0F /16F);


		gunSlideDistance = 0.45F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}