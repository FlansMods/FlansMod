//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelThompson extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 64;
	
	public ModelThompson() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[17];
		gunModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
		gunModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 7
		gunModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		gunModel[15] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 1
		
		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 2
		gunModel[0].setRotationPoint(1F, -7F, -2F);
		
		gunModel[1].addBox(0F, 0F, 0F, 20, 4, 5, 0F); // Box 3
		gunModel[1].setRotationPoint(-8F, -13F, -2.5F);
		
		gunModel[2].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 4
		gunModel[2].setRotationPoint(12F, -13F, -2F);
		
		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 6
		gunModel[3].setRotationPoint(17F, -13F, -1.5F);
		
		gunModel[4].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 7
		gunModel[4].setRotationPoint(21F, -13F, -1F);
		
		gunModel[5].addBox(0F, 0F, 0F, 16, 4, 3, 0F); // Box 8
		gunModel[5].setRotationPoint(21F, -12F, -1.5F);
		
		gunModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 9
		gunModel[6].setRotationPoint(41F, -13.5F, -1.5F);
		
		gunModel[7].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 10
		gunModel[7].setRotationPoint(-5F, -14.7F, 1F);
		gunModel[7].rotateAngleZ = -0.78539816F;
		
		gunModel[8].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 11
		gunModel[8].setRotationPoint(-5F, -14.7F, -2F);
		gunModel[8].rotateAngleZ = -0.78539816F;
		
		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 12
		gunModel[9].setRotationPoint(42F, -15F, -1F);
		
		gunModel[10].addBox(0F, 0F, 0F, 16, 1, 4, 0F); // Box 13
		gunModel[10].setRotationPoint(-4F, -9F, -2F);
		
		gunModel[11].addBox(0F, 0F, 0F, 10, 1, 4, 0F); // Box 14
		gunModel[11].setRotationPoint(-4F, -8F, -2F);
		
		gunModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 15
		gunModel[12].setRotationPoint(4.5F, -4F, -2.5F);
		
		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 16
		gunModel[13].setRotationPoint(10.5F, -3F, -2.5F);
		gunModel[13].rotateAngleZ = 1.57079633F;
		
		gunModel[14].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 18
		gunModel[14].setRotationPoint(7F, -8F, -0.5F);
		gunModel[14].rotateAngleZ = 0.08726646F;
		
		gunModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 0
		gunModel[15].setRotationPoint(4.5F, -11.5F, -4.1F);
		
		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.45F, 0F, -0.75F, -0.45F, 0F, -0.75F, -0.45F, 0F, -0.75F, -0.45F, 0F, -0.75F, -0.45F, 0F, -0.75F, -0.45F, 0F, -0.75F, -0.45F, 0F, -0.75F, -0.45F, 0F, -0.75F); // Box 1
		gunModel[16].setRotationPoint(-5.5F, -14.4F, -1.5F);
		
		
		defaultStockModel = new ModelRendererTurbo[3];
		defaultStockModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		defaultStockModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		defaultStockModel[2] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 17
		
		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 17, 8, 5, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 0
		defaultStockModel[0].setRotationPoint(-27F, -7F, -2.5F);
		defaultStockModel[0].rotateAngleZ = 0.06981317F;
		
		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 11, 3, 5, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F); // Box 1
		defaultStockModel[1].setRotationPoint(-18F, -4F, -2.5F);
		defaultStockModel[1].rotateAngleZ = 0.43633231F;
		
		defaultStockModel[2].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 17
		defaultStockModel[2].setRotationPoint(-7.5F, -9F, -2.5F);
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 5
		
		ammoModel[0].addBox(12F, -11F, -2F, 4, 16, 4, 0F); // Box 5
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		
		
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 19
		
		slideModel[0].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 19
		slideModel[0].setRotationPoint(9.5F, -11.5F, -4F);
		
		gunSlideDistance = 0.6F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		translateAll(0F, -6.2F, 0.3F);
		thirdPersonOffset = new Vector3f(-0.2F, -0.1F, 0.02F);
		flipAll();
	}
}
