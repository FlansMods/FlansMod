//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.7
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMp44 extends ModelGun
{
	int textureX = 64;
	int textureY = 64;

	public ModelMp44()
	{
		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Body
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import UnderBody
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Grip
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Barrel
		gunModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Stock
		gunModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import Stock
		gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Stock
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import SightF
		gunModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import SightR
		gunModel[9] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 0
		gunModel[10] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 2
		gunModel[12] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 3
		gunModel[13] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 4
		gunModel[14] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 5
		gunModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 20
		gunModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		gunModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		gunModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		gunModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4

		gunModel[0].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Body
		gunModel[0].setRotationPoint(0F, -4F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import UnderBody
		gunModel[1].setRotationPoint(0F, -2.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Grip
		gunModel[2].setRotationPoint(0F, -2F, -0.5F);
		gunModel[2].rotateAngleZ = -0.29670597F;

		gunModel[3].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Barrel
		gunModel[3].setRotationPoint(7F, -2.8F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, 0F, 0F); // Import Stock
		gunModel[4].setRotationPoint(-2.9F, -3.45F, -0.5F);
		gunModel[4].rotateAngleZ = 0.17453293F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.8F, 0F, 0F); // Import Stock
		gunModel[5].setRotationPoint(0F, -2F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Stock
		gunModel[6].setRotationPoint(-1F, -4F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Import SightF
		gunModel[7].setRotationPoint(14.5F, -4.7F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import SightR
		gunModel[8].setRotationPoint(4.5F, -5F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 0
		gunModel[9].setRotationPoint(0F, -3.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 0
		gunModel[10].setRotationPoint(11F, -3.5F, -0.5F);

		gunModel[11].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 2
		gunModel[11].setRotationPoint(7F, -3.8F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 3
		gunModel[12].setRotationPoint(0.4F, -1F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0.6F, -0.5F, -0.2F, 0.6F, -0.5F, -0.2F, 0F, -0.3F, -0.2F); // Box 4
		gunModel[13].setRotationPoint(1.8F, -1F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,3F, 0.3F, 0F, -0.95F, -0.3F, 0F, -0.95F, -0.3F, 0F, 3F, 0.3F, 0F, 3F, 0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 3F, 0.5F, 0F); // Box 5
		gunModel[14].setRotationPoint(-4.9F, -3.1F, -0.5F);
		gunModel[14].rotateAngleZ = 0.17453293F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F); // Box 20
		gunModel[15].setRotationPoint(-0.5F, -2.5F, -0.5F);

		gunModel[16].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 2
		gunModel[16].setRotationPoint(14.5F, -3.75F, 1.5F);
		gunModel[16].rotateAngleX = 1.57079633F;

		gunModel[17].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 10
		gunModel[17].setRotationPoint(14.5F, -3.1F, -0.77F);

		gunModel[18].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 11
		gunModel[18].setRotationPoint(14.5F, -4.5F, 1.5F);
		gunModel[18].rotateAngleX = 1.57079633F;

		gunModel[19].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 4
		gunModel[19].setRotationPoint(14.5F, -3.1F, -0.23F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Magazine
		ammoModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Magazine
		ammoModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Magazine

		ammoModel[0].addShapeBox(3F, 4.7F, -0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Magazine
		ammoModel[0].setRotationPoint(-0.48F, -3.15F, 0F);
		ammoModel[0].rotateAngleZ = 0.20943951F;

		ammoModel[1].addShapeBox(3F, 2F, -0.5F, 2, 3, 1, 0F,0F, -0.66F, 0F, 0F, -0.77F, 0F, 0F, -0.77F, 0F, 0F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Magazine
		ammoModel[1].setRotationPoint(0.18F, -4F, 0F);
		ammoModel[1].rotateAngleZ = 0.05235988F;

		ammoModel[2].addShapeBox(2.87F, 4.45F, -0.5F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Magazine
		ammoModel[2].setRotationPoint(0F, 0F, 0F);
		ammoModel[2].rotateAngleZ = 0.27925268F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import bolt

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import bolt
		slideModel[0].setRotationPoint(5F, -3.8F, -1F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F / 16F, 5F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, -2F, 0F);

		flipAll();
	}
}