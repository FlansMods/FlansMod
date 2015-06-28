package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMinigun extends ModelGun
{
	public ModelMinigun()
	{
		int textureX = 64;
		int textureY = 64;
		
		gunModel = new ModelRendererTurbo[5];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(0F, -4F, -3F, 8, 6, 6);
		
		gunModel[1] = new ModelRendererTurbo(this, 22, 0, textureX, textureY);
		gunModel[1].addBox(1F, -4F, 3F, 6, 3, 3);
		
		gunModel[2] = new ModelRendererTurbo(this, 28, 6, textureX, textureY);
		gunModel[2].addBox(7F, 2F, -3F, 1, 3, 1);
		
		gunModel[3] = new ModelRendererTurbo(this, 32, 6, textureX, textureY);
		gunModel[3].addBox(7F, 2F, 2F, 1, 3, 1);
		
		gunModel[4] = new ModelRendererTurbo(this, 36, 6, textureX, textureY);
		gunModel[4].addBox(7F, 5F, -2F, 1, 1, 4);
		
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 0, 46, textureX, textureY);
		ammoModel[0].addBox(1F, -3F, -7F, 6, 4, 4);
		
		minigunBarrelModel = new ModelRendererTurbo[12];
		
		//Barrels
		for(int i = 0; i < 6; i++)
		{
			minigunBarrelModel[i] = new ModelRendererTurbo(this, 0, 16 + 2 * i, textureX, textureY);
			minigunBarrelModel[i].addBox(12F, 1F, -0.5F, 28, 1, 1);
			minigunBarrelModel[i].rotateAngleX = i * (float)Math.PI / 3F;
			minigunBarrelModel[i].setRotationPoint(0F, -1F, 0F);
		}
		
		minigunBarrelModel[6] = new ModelRendererTurbo(this, 0, 28, textureX, textureY);
		minigunBarrelModel[6].addShapeBox(8F, 0F, -3F, 4, 3, 6, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -0.5F, -1.5F, /* 5 */ 0F, -0.5F, -1.5F, /* 6 */ 0F, -0.5F, -1.5F, /* 7 */ 0F, -0.5F, -1.5F);
		minigunBarrelModel[6].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[7] = new ModelRendererTurbo(this, 20, 28, textureX, textureY);
		minigunBarrelModel[7].addShapeBox(8F, -3F, -3F, 4, 3, 6, 0F, /* 0 */ 0F, -0.5F, -1.5F, /* 1 */ 0F, -0.5F, -1.5F, /* 2 */ 0F, -0.5F, -1.5F, /* 3 */ 0F, -0.5F, -1.5F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		minigunBarrelModel[7].setRotationPoint(0F, -1F, 0F);
			
		minigunBarrelModel[8] = new ModelRendererTurbo(this, 0, 37, textureX, textureY);
		minigunBarrelModel[8].addShapeBox(28F, 0F, -3F, 2, 3, 6, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -0.5F, -1.5F, /* 5 */ 0F, -0.5F, -1.5F, /* 6 */ 0F, -0.5F, -1.5F, /* 7 */ 0F, -0.5F, -1.5F);
		minigunBarrelModel[8].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[9] = new ModelRendererTurbo(this, 16, 37, textureX, textureY);
		minigunBarrelModel[9].addShapeBox(28F, -3F, -3F, 2, 3, 6, 0F, /* 0 */ 0F, -0.5F, -1.5F, /* 1 */ 0F, -0.5F, -1.5F, /* 2 */ 0F, -0.5F, -1.5F, /* 3 */ 0F, -0.5F, -1.5F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		minigunBarrelModel[9].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[10] = new ModelRendererTurbo(this, 32, 37, textureX, textureY);
		minigunBarrelModel[10].addShapeBox(36F, 0F, -3F, 2, 3, 6, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -0.5F, -1.5F, /* 5 */ 0F, -0.5F, -1.5F, /* 6 */ 0F, -0.5F, -1.5F, /* 7 */ 0F, -0.5F, -1.5F);
		minigunBarrelModel[10].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[11] = new ModelRendererTurbo(this, 48, 37, textureX, textureY);
		minigunBarrelModel[11].addShapeBox(36F, -3F, -3F, 2, 3, 6, 0F, /* 0 */ 0F, -0.5F, -1.5F, /* 1 */ 0F, -0.5F, -1.5F, /* 2 */ 0F, -0.5F, -1.5F, /* 3 */ 0F, -0.5F, -1.5F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		minigunBarrelModel[11].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelOrigin = new Vector3f(8F / 16F, -1F / 16F, 0F);
		
		animationType = EnumAnimationType.SIDE_CLIP;
		
		thirdPersonOffset = new Vector3f(0F, -0.15F, 0F);
		
		itemFrameOffset = new Vector3f(-16F / 16F, 3F / 16F, 0F);
	}
}
