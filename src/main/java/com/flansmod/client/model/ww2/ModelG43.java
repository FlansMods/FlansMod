//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG43 extends ModelGun
{
	int textureX = 64;
	int textureY = 64;

	public ModelG43()
	{
		gunModel = new ModelRendererTurbo[27];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Body
		gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Underbody
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Barrelguard
		gunModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Endbarrel
		gunModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Sightfront
		gunModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Roundguard
		gunModel[6] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 3
		gunModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		gunModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		gunModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 6
		gunModel[10] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 9
		gunModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 10
		gunModel[12] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 11
		gunModel[13] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 12
		gunModel[14] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import Stock
		gunModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Stock
		gunModel[18] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import Stock
		gunModel[19] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import Stock
		gunModel[20] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Stock
		gunModel[21] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		gunModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 2
		gunModel[23] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Import Trigger
		gunModel[24] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 3
		gunModel[25] = new ModelRendererTurbo(this, 24, 12, textureX, textureY); // Box 0
		gunModel[26] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 0

		gunModel[0].addShapeBox(0F, -1F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Body
		gunModel[0].setRotationPoint(8F, -4F, -1.5F);

		gunModel[1].addBox(0F, -4F, 0F, 8, 3, 3, 0F); // Import Underbody
		gunModel[1].setRotationPoint(0F, -1F, -1.5F);

		gunModel[2].addShapeBox(0F, -1F, 0F, 2, 3, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Barrelguard
		gunModel[2].setRotationPoint(26F, -5F, -1F);

		gunModel[3].addBox(0F, -1F, 0F, 8, 1, 1, 0F); // Import Endbarrel
		gunModel[3].setRotationPoint(28F, -4F, -0.5F);

		gunModel[4].addShapeBox(0F, -2F, 0F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Sightfront
		gunModel[4].setRotationPoint(34.5F, -4.75F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Roundguard
		gunModel[5].setRotationPoint(0F, -6F, -1F);

		gunModel[6].addShapeBox(0F, -1F, 0F, 12, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[6].setRotationPoint(14F, -5F, -1.5F);

		gunModel[7].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 2
		gunModel[7].setRotationPoint(34.5F, -5.75F, 1.5F);
		gunModel[7].rotateAngleX = 1.57079633F;

		gunModel[8].addShapeBox(0F, -1F, 0F, 3, 1, 3, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.22F, 0F, -0.1F, -0.22F, 0F, -0.1F, -0.22F, 0F, -0.1F, -0.22F); // Box 4
		gunModel[8].setRotationPoint(11F, -5F, -1.5F);

		gunModel[9].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 6
		gunModel[9].setRotationPoint(-0.25F, -4F, -0.5F);

		gunModel[10].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 9
		gunModel[10].setRotationPoint(34.5F, -5.2F, -0.13F);

		gunModel[11].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 10
		gunModel[11].setRotationPoint(34.5F, -5.2F, -0.87F);

		gunModel[12].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 11
		gunModel[12].setRotationPoint(34.5F, -6.7F, 1.5F);
		gunModel[12].rotateAngleX = 1.57079633F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F); // Box 12
		gunModel[13].setRotationPoint(11F, -6.5F, -1F);
		gunModel[13].rotateAngleZ = -0.05235988F;

		gunModel[14].addShapeBox(0F, -1F, 0F, 1, 3, 2, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[14].setRotationPoint(28F, -5F, -1F);

		gunModel[15].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 15
		gunModel[15].setRotationPoint(33.5F, -3.75F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Stock
		gunModel[16].setRotationPoint(-6F, -5F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Import Stock
		gunModel[17].setRotationPoint(-15F, -3.5F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Stock
		gunModel[18].setRotationPoint(-8F, -4.5F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Stock
		gunModel[19].setRotationPoint(-15F, -4.5F, -1.5F);

		gunModel[20].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Import Stock
		gunModel[20].setRotationPoint(-1F, -5F, -1.5F);

		gunModel[21].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 1
		gunModel[21].setRotationPoint(10.63F, -5.5F, -0.7F);

		gunModel[22].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 2
		gunModel[22].setRotationPoint(10.63F, -5.5F, -0.3F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Trigger
		gunModel[23].setRotationPoint(0F, -2F, -0.5F);
		gunModel[23].rotateAngleZ = 0.15707963F;

		gunModel[24].addBox(0F, 2.5F, 0F, 3, 2, 1, 0F); // Box 3
		gunModel[24].setRotationPoint(-1F, -5F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 0
		gunModel[25].setRotationPoint(9F, -5.5F, -1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -1F, 0F, -1.3F, -1F); // Box 0
		gunModel[26].setRotationPoint(0F, -5.5F, -1.7F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Bullet

		ammoModel[0].addBox(8F, -2F, -0.5F, 5, 4, 1, 0F); // Import Bullet
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = 0.13962634F;


		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 3
		slideModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 5
		slideModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 7
		slideModel[3] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 8

		slideModel[0].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		slideModel[0].setRotationPoint(8F, -5F, -1.5F);

		slideModel[1].addShapeBox(0F, -1F, 0F, 2, 1, 3, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 5
		slideModel[1].setRotationPoint(9F, -5F, -1.5F);

		slideModel[2].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F); // Box 7
		slideModel[2].setRotationPoint(8F, -5F, 1.25F);
		slideModel[2].rotateAngleX = 0.78539816F;
		slideModel[2].rotateAngleY = 0.01745329F;

		slideModel[3].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 8
		slideModel[3].setRotationPoint(8F, -5.75F, 2F);
		slideModel[3].rotateAngleX = 0.78539816F;
		slideModel[3].rotateAngleY = 0.01745329F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(3F / 16F, 8F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, -4F, 0F);


		flipAll();
	}
}