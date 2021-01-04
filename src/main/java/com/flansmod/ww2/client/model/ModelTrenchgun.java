//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelTrenchgun extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;
	
	public ModelTrenchgun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[25];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17
		gunModel[3] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 17
		gunModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 19
		gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 20
		gunModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		gunModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 22
		gunModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 23
		gunModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 24
		gunModel[10] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 1
		gunModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 2
		gunModel[13] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 3
		gunModel[14] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 4
		gunModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 5
		gunModel[16] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		gunModel[17] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 7
		gunModel[18] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 9
		gunModel[19] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 30
		gunModel[20] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 31
		gunModel[21] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 33
		gunModel[22] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 8
		gunModel[23] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 27
		
		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, -0.6F, -2F, 0F, -0.6F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 2
		gunModel[0].setRotationPoint(1F, -9F, -2.5F);
		gunModel[0].rotateAngleZ = -1.04719755F;
		
		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[1].setRotationPoint(1F, -10F, -2.5F);
		
		gunModel[2].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[2].setRotationPoint(17F, -11F, -1F);
		
		gunModel[3].addShapeBox(0F, 0F, 0F, 11, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[3].setRotationPoint(5F, -8.5F, -2.5F);
		
		gunModel[4].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 19
		gunModel[4].setRotationPoint(5F, -5.5F, -2.5F);
		
		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[5].setRotationPoint(5F, -11F, -2.5F);
		
		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[6].setRotationPoint(-1.5F, -4.5F, -0.5F);
		
		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[7].setRotationPoint(3.5F, -5.5F, -0.5F);
		
		gunModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[8].setRotationPoint(-1F, -2.5F, -0.5F);
		
		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[9].setRotationPoint(1F, -5.5F, -0.5F);
		
		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[10].setRotationPoint(16F, -10F, -2.5F);
		
		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		gunModel[11].setRotationPoint(16F, -5.5F, -2.5F);
		
		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[12].setRotationPoint(16F, -6.5F, -2.5F);
		
		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[13].setRotationPoint(5F, -10F, -2.5F);
		
		gunModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[14].setRotationPoint(10F, -10F, 1.5F);
		
		gunModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[15].setRotationPoint(10F, -11F, -0.5F);
		
		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[16].setRotationPoint(15F, -11F, -2.5F);
		
		gunModel[17].addShapeBox(0F, 0F, 0F, 28, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[17].setRotationPoint(17F, -8F, -1F);
		
		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 9
		gunModel[18].setRotationPoint(43F, -9F, -1F);
		
		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[19].setRotationPoint(15F, -10F, -2.5F);
		
		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[20].setRotationPoint(10F, -9F, -2.5F);
		
		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 33
		gunModel[21].setRotationPoint(53F, -12.5F, -0.5F);
		
		gunModel[22].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[22].setRotationPoint(23F, -10.5F, -2F);
		
		gunModel[23].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[23].setRotationPoint(23F, -11.5F, -2F);
		
		gunModel[24].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 27
		gunModel[24].setRotationPoint(23F, -9.5F, -2F);
		
		
		defaultStockModel = new ModelRendererTurbo[2];
		defaultStockModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		defaultStockModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 54
		
		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 4
		defaultStockModel[0].setRotationPoint(-22F, -1F, -2F);
		
		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 1F, 0F, 0F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 54
		defaultStockModel[1].setRotationPoint(-22F, -5F, -2F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 32
		
		ammoModel[0].addShapeBox(8F, -7F, -1F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		
		pumpModel = new ModelRendererTurbo[4];
		pumpModel[0] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 10
		pumpModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 23
		pumpModel[2] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 29
		pumpModel[3] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 0
		
		pumpModel[0].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		pumpModel[0].setRotationPoint(29F, -7F, -2F);
		
		pumpModel[1].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 23
		pumpModel[1].setRotationPoint(29F, -6F, -2F);
		
		pumpModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		pumpModel[2].setRotationPoint(10F, -10.5F, -2F);
		
		pumpModel[3].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		pumpModel[3].setRotationPoint(29F, -8.5F, -2F);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.SHOTGUN;
		pumpDelayAfterReload = 125;
		pumpDelay = 6;
		pumpTime = 5;
		gripIsOnPump = true;
		translateAll(0F, -6F, 0.3F);
		thirdPersonOffset = new Vector3f(-0.05F, -0.14F, 0.01F);
		
		numBulletsInReloadAnimation = 8;
		tiltGunTime = 0.204F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.600F;
		untiltGunTime = 0.171F;
		flipAll();
	}
}
