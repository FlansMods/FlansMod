package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelG3 extends ModelGun 
{
	public ModelG3()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[8];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, 3F, -1F, 8, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addBox(0F, 2F, -1F, 6, 1, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		gunModel[2].addBox(7F, 3F, -1F, 8, 1.5F, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
		gunModel[3].addBox(7F, 4.5F, -0.5F, 8, 0.5F, 1);
		
		gunModel[4] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		gunModel[4].addBox(15F, 3.375F, -0.375F, 2, 0.75F, 0.75F);
		
		gunModel[5] = new ModelRendererTurbo(this, 6, 13, textureX, textureY);
		gunModel[5].addBox(17F, 3.25F, -0.5F, 1, 1, 1);

		gunModel[6] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		gunModel[6].addBox(-0.75F, -3F, -0.75F, 1.5F, 4, 1.5F);
		gunModel[6].setRotationPoint(1F, 2F, 0F);
		gunModel[6].rotateAngleZ = -0.5F;
		
		gunModel[7] = new ModelRendererTurbo(this, 16, 5, textureX, textureY);
		gunModel[7].addBox(14F, 5F, -0.5F, 1, 1, 1);

		//Scope
		scopeAttachPoint = new Vector3f(4F / 16F, 5F / 16F, 0F);

		//Stock
		defaultStockModel = new ModelRendererTurbo[3];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 10, 13, textureX, textureY);
		defaultStockModel[0].addBox(-8F, 2F, -0.5F, 1, 2, 1);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 20, 6, textureX, textureY);
		defaultStockModel[1].addShapeBox(-7F, 2F, -0.5F, 5, 2, 1, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);

		defaultStockModel[2] = new ModelRendererTurbo(this, 20, 9, textureX, textureY);
		defaultStockModel[2].addShapeBox(-2F, 3F, -1F, 1, 2, 2, 0F, /* 0 */ 0F, 0F, -0.5F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, -0.5F, /* 4 */ 0F, -1F, -0.5F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -1F, -0.5F);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 3.5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 3.75F / 16F, 0F);
		
		//Grip
		
		gripAttachPoint = new Vector3f(10F / 16F, 3F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 26, 9, textureX, textureY);
		ammoModel[0].addBox(3.5F, -1F, -0.75F, 2, 4, 1.5F);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
