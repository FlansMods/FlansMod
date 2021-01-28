package com.flansmod.modernweapons.client.model;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelDesertEagle extends ModelGun
{
	public ModelDesertEagle()
	{
		int textureX = 32;
		int textureY = 64;
		
		gunModel = new ModelRendererTurbo[20];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-3F, 1F, -1F, 7, 1, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		gunModel[1].addBox(-2F, -3F, -1F, 3, 4, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		gunModel[2].addBox(-1F, 2.1F, -0.5F, 11, 1, 1);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		gunModel[3].addBox(2F, 3F, -1F, 8, 2, 2);
		
		gunModel[4] = new ModelRendererTurbo(this, 10, 3, textureX, textureY);
		gunModel[4].addBox(10F, 2F, -1F, 2, 3, 2);
		
		gunModel[5] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		gunModel[5].addBox(10.5F, 4.2F, -0.5F, 1, 1, 1);
		
		// Legendary pieces. Blank on most paintjobs
		gunModel[6] = new ModelRendererTurbo(this, 0, 41, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 2
		gunModel[8] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 3
		gunModel[9] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 4
		gunModel[10] = new ModelRendererTurbo(this, 0, 41, textureX, textureY); // Box 5
		gunModel[11] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 6
		gunModel[12] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 7
		gunModel[13] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 8
		gunModel[14] = new ModelRendererTurbo(this, 5, 41, textureX, textureY); // Box 11
		gunModel[15] = new ModelRendererTurbo(this, 0, 53, textureX, textureY); // Box 12
		gunModel[16] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Box 13
		gunModel[17] = new ModelRendererTurbo(this, 5, 41, textureX, textureY); // Box 14
		gunModel[18] = new ModelRendererTurbo(this, 0, 53, textureX, textureY); // Box 15
		gunModel[19] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Box 16
		
		gunModel[6].addBox(-0.5F, 0F, -0.5F, 1, 7, 1, 0F); // Box 0
		gunModel[6].setRotationPoint(0F, 4F, 0.5F);
		gunModel[6].rotateAngleX = 0.52359878F;
		gunModel[6].rotateAngleZ = 0.62831853F;
		
		gunModel[7].addBox(-2.5F, 1F, -0.5F, 2, 2, 1, 0F); // Box 2
		gunModel[7].setRotationPoint(0F, 4F, 0.5F);
		gunModel[7].rotateAngleX = 0.52359878F;
		gunModel[7].rotateAngleZ = 0.55850536F;
		
		gunModel[8].addBox(-3.5F, 3F, -0.5F, 3, 2, 1, 0F); // Box 3
		gunModel[8].setRotationPoint(0F, 4F, 0.5F);
		gunModel[8].rotateAngleX = 0.52359878F;
		gunModel[8].rotateAngleZ = 0.59341195F;
		
		gunModel[9].addBox(-5.5F, 5F, -0.5F, 5, 2, 1, 0F); // Box 4
		gunModel[9].setRotationPoint(0F, 4F, 0.5F);
		gunModel[9].rotateAngleX = 0.52359878F;
		gunModel[9].rotateAngleZ = 0.62831853F;
		
		gunModel[10].addBox(-0.5F, 0F, -0.5F, 1, 7, 1, 0F); // Box 5
		gunModel[10].setRotationPoint(0F, 4F, -0.5F);
		gunModel[10].rotateAngleX = -0.52359878F;
		gunModel[10].rotateAngleZ = 0.62831853F;
		
		gunModel[11].addBox(-2.5F, 1F, -0.5F, 2, 2, 1, 0F); // Box 6
		gunModel[11].setRotationPoint(0F, 4F, -0.5F);
		gunModel[11].rotateAngleX = -0.52359878F;
		gunModel[11].rotateAngleZ = 0.55850536F;
		
		gunModel[12].addBox(-3.5F, 3F, -0.5F, 3, 2, 1, 0F); // Box 7
		gunModel[12].setRotationPoint(0F, 4F, -0.5F);
		gunModel[12].rotateAngleX = -0.52359878F;
		gunModel[12].rotateAngleZ = 0.59341195F;
		
		gunModel[13].addBox(-5.5F, 5F, -0.5F, 5, 2, 1, 0F); // Box 8
		gunModel[13].setRotationPoint(0F, 4F, -0.5F);
		gunModel[13].rotateAngleX = -0.52359878F;
		gunModel[13].rotateAngleZ = 0.62831853F;
		
		gunModel[14].addBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F); // Box 11
		gunModel[14].setRotationPoint(2F, 2F, -0.5F);
		gunModel[14].rotateAngleX = -0.87266463F;
		gunModel[14].rotateAngleZ = 0.62831853F;
		
		gunModel[15].addBox(-2.5F, 2F, -0.5F, 2, 1, 1, 0F); // Box 12
		gunModel[15].setRotationPoint(2F, 2F, -0.5F);
		gunModel[15].rotateAngleX = -0.87266463F;
		gunModel[15].rotateAngleZ = 0.55850536F;
		
		gunModel[16].addBox(-3.5F, 3F, -0.5F, 3, 1, 1, 0F); // Box 13
		gunModel[16].setRotationPoint(2F, 2F, -0.5F);
		gunModel[16].rotateAngleX = -0.87266463F;
		gunModel[16].rotateAngleZ = 0.55850536F;
		
		gunModel[17].addBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F); // Box 14
		gunModel[17].setRotationPoint(2F, 2F, 0.5F);
		gunModel[17].rotateAngleX = 0.87266463F;
		gunModel[17].rotateAngleZ = 0.62831853F;
		
		gunModel[18].addBox(-2.5F, 2F, -0.5F, 2, 1, 1, 0F); // Box 15
		gunModel[18].setRotationPoint(2F, 2F, 0.5F);
		gunModel[18].rotateAngleX = 0.87266463F;
		gunModel[18].rotateAngleZ = 0.55850536F;
		
		gunModel[19].addBox(-3.5F, 3F, -0.5F, 3, 1, 1, 0F); // Box 16
		gunModel[19].setRotationPoint(2F, 2F, 0.5F);
		gunModel[19].rotateAngleX = 0.87266463F;
		gunModel[19].rotateAngleZ = 0.55850536F;
		
		slideModel = new ModelRendererTurbo[4];
		
		slideModel[0] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		slideModel[0].addBox(-2F, 2F, -1F, 4, 3, 2);
		
		slideModel[1] = new ModelRendererTurbo(this, 0, 20, textureX, textureY);
		slideModel[1].addBox(2F, 2F, -1F, 8, 1, 2);
		
		slideModel[2] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		slideModel[2].addBox(-3F, 3F, -0.5F, 1, 1, 1);
		
		slideModel[3] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		slideModel[3].addBox(-1.5F, 4.2F, -0.5F, 1, 1, 1);
		
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
		ammoModel[0].addBox(-1.5F, -2.8F, -0.5F, 2, 4, 1);
		
		
		translateAll(0F, 1F, 0F);
		
		barrelAttachPoint = new Vector3f(12F / 16F, 4.5F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(5F / 16F, 6F / 16F, 0F);
		scopeIsOnSlide = false;
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;
	}
}
