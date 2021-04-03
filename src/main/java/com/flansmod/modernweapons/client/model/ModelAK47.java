//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAK47 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;
	
	public ModelAK47() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 29, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 11, 17, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 11, 22, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 11, 26, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 11, 30, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 16, 0, textureX, textureY); // Box 14
		gunModel[10] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Box 16
		gunModel[11] = new ModelRendererTurbo(this, 19, 13, textureX, textureY); // Box 17
		gunModel[12] = new ModelRendererTurbo(this, 19, 13, textureX, textureY); // Box 18
		gunModel[13] = new ModelRendererTurbo(this, 18, 10, textureX, textureY); // Box 19
		gunModel[14] = new ModelRendererTurbo(this, 19, 7, textureX, textureY); // Box 20
		gunModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		
		gunModel[0].addShapeBox(-0.5F, -4.2F, -1F, 7, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunModel[1].addShapeBox(0F, -5F, -1F, 6, 1, 2, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 1
		gunModel[1].setRotationPoint(0F, 0F, 0F);
		
		gunModel[2].addShapeBox(6F, -5F, -1F, 2, 1, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 4
		gunModel[2].setRotationPoint(0F, 0F, 0F);
		
		gunModel[3].addShapeBox(7.5F, -3.8F, -0.5F, 7, 1, 1, 0F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F); // Box 5
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		
		gunModel[4].addShapeBox(6.5F, -4F, -1F, 4, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.25F, -0.25F); // Box 6
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		
		gunModel[5].addShapeBox(6.75F, -4.8F, -0.5F, 6, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 7
		gunModel[5].setRotationPoint(0F, 0F, 0F);
		
		gunModel[6].addShapeBox(8F, -5F, -1F, 3, 1, 2, 0F, 0F, -0.15F, -0.55F, -0.5F, -0.15F, -0.55F, -0.5F, -0.15F, -0.55F, 0F, -0.15F, -0.55F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 8
		gunModel[6].setRotationPoint(0F, 0F, 0F);
		
		gunModel[7].addShapeBox(12F, -5F, -0.5F, 1, 2, 1, 0F, -0.75F, -1.05F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.75F, -1.05F, -0.15F, -0.9F, -0.65F, -0.15F, 0.4F, -0.65F, -0.15F, 0.4F, -0.65F, -0.15F, -0.9F, -0.65F, -0.15F); // Box 9
		gunModel[7].setRotationPoint(0F, 0F, 0F);
		
		gunModel[8].addShapeBox(14.5F, -3.8F, -0.5F, 2, 1, 1, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 10
		gunModel[8].setRotationPoint(0F, 0F, 0F);
		
		gunModel[9].addShapeBox(-1.2F, -3F, -1F, 2, 4, 2, 0F, -0.3F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.2F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.3F, -0.2F, -0.4F); // Box 14
		gunModel[9].setRotationPoint(0F, 0F, 0F);
		gunModel[9].rotateAngleZ = -0.26179939F;
		
		gunModel[10].addBox(0.65F, -2.4F, -0.5F, 2, 1, 1, 0F); // Box 16
		gunModel[10].setRotationPoint(0F, 0F, 0F);
		
		gunModel[11].addShapeBox(5.6F, -5.75F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 17
		gunModel[11].setRotationPoint(0F, 0F, 0F);
		
		gunModel[12].addShapeBox(5.6F, -5.75F, -1F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F); // Box 18
		gunModel[12].setRotationPoint(0F, 0F, 0F);
		
		gunModel[13].addShapeBox(6F, -5.25F, -0.5F, 2, 1, 1, 0F, -0.1F, 0F, -0.25F, -0.1F, -0.15F, -0.25F, -0.1F, -0.15F, -0.25F, -0.1F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 19
		gunModel[13].setRotationPoint(0F, 0F, 0F);
		
		gunModel[14].addShapeBox(14.5F, -5.5F, -0.5F, 1, 2, 1, 0F, -0.5F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, -0.5F, -0.1F, -0.35F, -0.2F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.2F, 0F, -0.35F); // Box 20
		gunModel[14].setRotationPoint(0F, 0F, 0F);
		
		gunModel[15].addShapeBox(2.2F, -2.2F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F); // Box 22
		gunModel[15].setRotationPoint(0F, 0F, 0F);
		gunModel[15].rotateAngleZ = 0.08726646F;
		
		
		defaultStockModel = new ModelRendererTurbo[3];
		defaultStockModel[0] = new ModelRendererTurbo(this, 17, 26, textureX, textureY); // Box 12
		defaultStockModel[1] = new ModelRendererTurbo(this, 0, 33, textureX, textureY); // Box 13
		defaultStockModel[2] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 15
		
		defaultStockModel[0].addShapeBox(-2.5F, -4F, -1F, 2, 2, 2, 0F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.2F, -0.25F); // Box 12
		defaultStockModel[0].setRotationPoint(0F, 0F, 0F);
		
		defaultStockModel[1].addShapeBox(-7.5F, -4F, -1F, 5, 3, 2, 0F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, -0.2F, 0.1F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, -0.2F, 0.1F, -0.25F); // Box 13
		defaultStockModel[1].setRotationPoint(0F, 0F, 0F);
		
		defaultStockModel[2].addShapeBox(-7.5F, -4.25F, -1F, 5, 1, 2, 0F, 0.1F, -0.2F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, 0.1F, -0.2F, -0.35F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F); // Box 15
		defaultStockModel[2].setRotationPoint(0F, 0F, 0F);
		
		
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 2
		ammoModel[1] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 3
		
		ammoModel[0].addShapeBox(2.5F, -2.2F, -1F, 3, 3, 2, 0F, -0.45F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.75F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, -0.75F, -0.5F, -0.4F); // Box 2
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = 0.06981317F;
		
		ammoModel[1].addShapeBox(2.8F, 0.3F, -1F, 3, 3, 2, 0F, -0.45F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.45F, 0F, -0.4F, -1.2F, -0.3F, -0.4F, 0.45F, -0.7F, -0.4F, 0.45F, -0.7F, -0.4F, -1.2F, -0.3F, -0.4F); // Box 3
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		ammoModel[1].rotateAngleZ = 0.06981317F;
		
		
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 4, 0, textureX, textureY); // Box 21
		
		slideModel[0].addShapeBox(5.3F, -4.25F, -1.6F, 1, 1, 1, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F); // Box 21
		slideModel[0].setRotationPoint(0F, 0F, 0F);
		
		gunSlideDistance = 0.075F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		barrelAttachPoint = new Vector3f(15.5F / 16F, 3.25F / 16F, 0F / 16F);
		
		stockAttachPoint = new Vector3f(-0.5F / 16F, 3F / 16F, 0F / 16F);
		
		scopeAttachPoint = new Vector3f(4F / 16F, 4.75F / 16F, 0F / 16F);
		
		gripAttachPoint = new Vector3f(9 / 16F, 2.75F / 16F, 0F / 16F);
		
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
