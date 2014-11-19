package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelACR extends ModelGun 
{
	public ModelACR()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[6];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(0F, 3F, -1F, 8, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addShapeBox(0F, 0F, -1F, 2, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0.5F, 0F, /* 2 */ 0F, 0.5F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 1F, 0F, 0F, /* 6 */ 1F, 0F, 0F, /* 7 */ -1F, 0F, 0F);	
		
		gunModel[2] = new ModelRendererTurbo(this, 8, 4, textureX, textureY);
		gunModel[2].addBox(5F, 2F, -1F, 3, 1, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		gunModel[3].addBox(8F, 3F, -1F, 6, 2, 2);
		
		gunModel[4] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		gunModel[4].addBox(14F, 3.1F, -0.4F, 4, 0.8F, 0.8F);
				
		gunModel[5] = new ModelRendererTurbo(this, 10, 13, textureX, textureY);
		gunModel[5].addBox(14F, 4.1F, -0.4F, 1, 0.8F, 0.8F);
		
		//Scope
		scopeAttachPoint = new Vector3f(3.5F / 16F, 5F / 16F, 0F);

		//Stock
		defaultStockModel = new ModelRendererTurbo[3];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		defaultStockModel[0].addBox(-8F, 1F, -1F, 1, 3.5F, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 26, 0, textureX, textureY);
		defaultStockModel[1].addShapeBox(-7F, 1F, -1F, 2, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ -1F, 0F, 0F, /* 2 */ -1F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		defaultStockModel[2] = new ModelRendererTurbo(this, 18, 6, textureX, textureY);
		defaultStockModel[2].addShapeBox(-7F, 3F, -1F, 7, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -0.5F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -0.5F, 0F);	
		
		stockAttachPoint = new Vector3f(1F / 16F, 4F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 3.5F / 16F, 0F);
		
		//Grip
		gripAttachPoint = new Vector3f(11F / 16F, 3F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 16, 10, textureX, textureY);
		ammoModel[0].addShapeBox(5.5F, -2F, -1F, 2, 4, 2, 0F, /* 0 */ -0.25F, 0.25F, -0.25F, /* 1 */ 0.5F, 0F, -0.25F, /* 2 */ 0.5F, 0F, -0.25F, /* 3 */ -0.25F, 0.25F, -0.25F, /* 4 */ 0F, 0F, -0.25F, /* 5 */ 0F, 0F, -0.25F, /* 6 */ 0F, 0F, -0.25F, /* 7 */ 0F, 0F, -0.25F);	
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
