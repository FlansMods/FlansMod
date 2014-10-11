package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelFNSCAR extends ModelGun 
{
	public ModelFNSCAR()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[8];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(0F, 2F, -1F, 8, 3, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		gunModel[1].addShapeBox(1F, -1F, -1F, 1, 3, 2, 0F, /* 0 */ 0.5F, 0F, 0F, /* 1 */ -0.5F, 0F, 0F, /* 2 */ -0.5F, 0F, 0F, /* 3 */ 0.5F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		gunModel[2] = new ModelRendererTurbo(this, 6, 5, textureX, textureY);
		gunModel[2].addBox(4F, 1F, -1F, 3, 1, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		gunModel[3].addBox(8F, 3F, -1F, 5, 2, 2);
		
		gunModel[4] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		gunModel[4].addBox(7.5F, 2.5F, -0.5F, 5, 1, 1);
		
		gunModel[5] = new ModelRendererTurbo(this, 6, 8, textureX, textureY);
		gunModel[5].addBox(13F, 4.5F, -0.5F, 1, 1, 1);
		
		gunModel[6] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		gunModel[6].addBox(13F, 3.25F, -0.5F, 4, 1, 1);
		
		gunModel[7] = new ModelRendererTurbo(this, 10, 8, textureX, textureY);
		gunModel[7].addBox(0.5F, 4.5F, -0.5F, 1, 1, 1);
		
		//Scope
		scopeAttachPoint = new Vector3f(3.5F / 16F, 5F / 16F, 0F);

		//Stock
		defaultStockModel = new ModelRendererTurbo[2];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 16, 5, textureX, textureY);
		defaultStockModel[0].addShapeBox(-6F, 0F, -1F, 2, 4, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -2F, 0F, /* 2 */ 0F, -2F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 24, 5, textureX, textureY);
		defaultStockModel[1].addShapeBox(-4F, 2F, -1F, 4, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -1F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -1F, 0F);	
		
		stockAttachPoint = new Vector3f(1F / 16F, 4F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(17F / 16F, 3.75F / 16F, 0F);
		
		//Grip
		gripAttachPoint = new Vector3f(10F / 16F, 3F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 12, 11, textureX, textureY);
		ammoModel[0].addShapeBox(4.5F, -2F, -0.5F, 2, 4, 1, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
