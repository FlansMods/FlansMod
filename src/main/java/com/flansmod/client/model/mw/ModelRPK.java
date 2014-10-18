package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRPK extends ModelGun 
{
	public ModelRPK()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[4];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-4F, 2F, -1F, 12, 3, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		gunModel[1].addBox(-0F, -2F, -1F, 2, 4, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 8, 5, textureX, textureY);
		gunModel[2].addBox(6.9F, 4.2F, -0.5F, 1, 1, 1);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		gunModel[3].addBox(8F, 2.25F, -1F, 6, 2, 2);
		
		//Scope
		scopeAttachPoint = new Vector3f(4F / 16F, 5F / 16F, 0F);

		//Stock
		defaultStockModel = new ModelRendererTurbo[2];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 8, 7, textureX, textureY);
		defaultStockModel[0].addBox(-7F, 2F, -1F, 3, 2, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 18, 6, textureX, textureY);
		defaultStockModel[1].addBox(-11F, 0F, -1F, 4, 4, 2);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 3.5F / 16F, 0F);
		
		//Barrel
		defaultBarrelModel = new ModelRendererTurbo[4];
				
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 30, 14, textureX, textureY);
		defaultBarrelModel[0].addBox(14F, 2.5F, -0.5F, 8, 1, 1);
		
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 16, 12, textureX, textureY);
		defaultBarrelModel[1].addBox(22F, 2.5F, -0.5F, 1, 2, 1);
		
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 38, 0, textureX, textureY);
		defaultBarrelModel[2].addShapeBox(20F, -2.5F, -1F, 1, 5, 1, 0F, /* 0 */ 0F, 0F, 3F, /* 1 */ 0F, 0F, 3F, /* 2 */ 0F, 0F, -3F, /* 3 */ 0F, 0F, -3F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 38, 0, textureX, textureY);
		defaultBarrelModel[3].addShapeBox(20F, -2.5F, 0F, 1, 5, 1, 0F, /* 0 */ 0F, 0F, -3F, /* 1 */ 0F, 0F, -3F, /* 2 */ 0F, 0F, 3F, /* 3 */ 0F, 0F, 3F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		barrelAttachPoint = new Vector3f(14F / 16F, 3.25F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[3];
		
		ammoModel[0] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
		ammoModel[0].addBox(4F, -1F, -1F, 3, 3, 2);
		
		ammoModel[1] = new ModelRendererTurbo(this, 20, 12, textureX, textureY);
		ammoModel[1].addBox(5F, -3F, -1F, 3, 2, 2);
		
		ammoModel[2] = new ModelRendererTurbo(this, 30, 7, textureX, textureY);
		ammoModel[2].addBox(6F, -5F, -1F, 3, 2, 2);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
