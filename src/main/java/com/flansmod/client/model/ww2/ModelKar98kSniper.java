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

public class ModelKar98kSniper extends ModelGun
{
	int textureX = 64;
	int textureY = 64;

	public ModelKar98kSniper()
	{
		gunModel = new ModelRendererTurbo[25];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Body
		gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Underbody
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Barrelguard
		gunModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Endbarrel
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Sightback
		gunModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Pump
		gunModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Stock
		gunModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Stock
		gunModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Stock
		gunModel[9] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Trigger
		gunModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Roundguard
		gunModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Bullet
		gunModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Scope
		gunModel[13] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Shape1
		gunModel[14] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 1
		gunModel[15] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 2
		gunModel[16] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 3
		gunModel[17] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 5
		gunModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		gunModel[19] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 0
		gunModel[20] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 1
		gunModel[21] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 2
		gunModel[22] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 3
		gunModel[23] = new ModelRendererTurbo(this, 10, 56, textureX, textureY); // Import Sightfront
		gunModel[24] = new ModelRendererTurbo(this, 10, 56, textureX, textureY); // Box 15

		gunModel[0].addShapeBox(0F, -1F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Body
		gunModel[0].setRotationPoint(7F, -5F, -1.5F);

		gunModel[1].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Import Underbody
		gunModel[1].setRotationPoint(0F, -5F, -1.5F);

		gunModel[2].addShapeBox(0F, -1F, 0F, 2, 3, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Barrelguard
		gunModel[2].setRotationPoint(25F, -6F, -1F);

		gunModel[3].addBox(0F, -1F, 0F, 14, 1, 1, 0F); // Import Endbarrel
		gunModel[3].setRotationPoint(21F, -5.5F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import Sightback
		gunModel[4].setRotationPoint(0F, -7F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Import Pump
		gunModel[5].setRotationPoint(0F, -6F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Import Stock
		gunModel[6].setRotationPoint(-1F, -6F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Stock
		gunModel[7].setRotationPoint(-6F, -6F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Import Stock
		gunModel[8].setRotationPoint(-15F, -4.5F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Trigger
		gunModel[9].setRotationPoint(0F, -3F, -0.5F);
		gunModel[9].rotateAngleZ = 0.15707963F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Roundguard
		gunModel[10].setRotationPoint(1F, -7F, -1F);

		gunModel[11].addBox(3F, 0F, -0.5F, 3, 3, 1, 0F); // Import Bullet
		gunModel[11].setRotationPoint(0F, -6F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Scope
		gunModel[12].setRotationPoint(0F, -10F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		gunModel[13].setRotationPoint(6F, -8F, -0.5F);

		gunModel[14].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 1
		gunModel[14].setRotationPoint(27F, -4.5F, -0.5F);

		gunModel[15].addShapeBox(0F, -1F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 2
		gunModel[15].setRotationPoint(27F, -4.25F, -0.5F);

		gunModel[16].addShapeBox(0F, -1F, 0F, 8, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[16].setRotationPoint(13F, -6F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[17].setRotationPoint(-8F, -5.5F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[18].setRotationPoint(-15F, -5.5F, -1.5F);

		gunModel[19].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		gunModel[19].setRotationPoint(-2F, -10F, -1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 1
		gunModel[20].setRotationPoint(9F, -10F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[21].setRotationPoint(1F, -8F, -0.5F);

		gunModel[22].addBox(0F, -0.5F, 0F, 3, 2, 1, 0F); // Box 3
		gunModel[22].setRotationPoint(-1F, -3F, -0.5F);

		gunModel[23].addShapeBox(0F, -2F, 0F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Sightfront
		gunModel[23].setRotationPoint(33.5F, -5.75F, -0.5F);

		gunModel[24].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F,0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 15
		gunModel[24].setRotationPoint(32.5F, -4.75F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 26, 56, textureX, textureY); // Box 0

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		ammoModel[0].setRotationPoint(2.5F, -6.5F, -0.5F);


		pumpModel = new ModelRendererTurbo[3];
		pumpModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Pump
		pumpModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import BoltAction
		pumpModel[2] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 0

		pumpModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.1F, -0.1F, 2F, -0.1F, -0.1F, 2F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 2F, -0.1F, -0.1F, 2F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Pump
		pumpModel[0].setRotationPoint(-2F, -7F, -0.5F);

		pumpModel[1].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import BoltAction
		pumpModel[1].setRotationPoint(-1F, -6.6F, -2F);
		pumpModel[1].rotateAngleX = 0.12217305F;

		pumpModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		pumpModel[2].setRotationPoint(-1F, -4.7F, -3F);
		pumpModel[2].rotateAngleX = 1.02974426F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);




		gunSlideDistance = 0.1F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.4F;

		flipAll();
		translateAll(0F, 3F, 0F);
	}
}