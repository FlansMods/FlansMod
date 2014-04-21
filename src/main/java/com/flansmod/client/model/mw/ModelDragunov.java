package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelDragunov extends ModelGun 
{
	public ModelDragunov()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[5];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(13F, 3.5F, -0.5F, 5, 1, 1);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY);
		gunModel[1].addBox(-1F, 3F, -1F, 13, 2, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[2].addBox(12F, 3F, -0.5F, 1, 2, 1);
		
		gunModel[3] = new ModelRendererTurbo(this, 4, 6, textureX, textureY);
		gunModel[3].addBox(16F, 4.5F, -0.5F, 1, 1, 1);
		
		gunModel[4] = new ModelRendererTurbo(this, 6, 6, textureX, textureY);
		gunModel[4].addBox(-1F, 0F, -1F, 1, 3, 2);
		
		//Scope
		defaultScopeModel = new ModelRendererTurbo[4];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		defaultScopeModel[0].addBox(-2F, 5.5F, -1F, 3, 2, 2);
		
		defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		defaultScopeModel[1].addBox(1F, 6F, -0.5F, 1, 1, 1);
		
		defaultScopeModel[2] = new ModelRendererTurbo(this, 10, 12, textureX, textureY);
		defaultScopeModel[2].addBox(2F, 5.5F, -1F, 4, 2, 2);
				
		defaultScopeModel[3] = new ModelRendererTurbo(this, 11, 10, textureX, textureY);
		defaultScopeModel[3].addBox(1F, 4.5F, -0.5F, 5, 1, 1);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		//Stock
		defaultStockModel = new ModelRendererTurbo[3];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 12, 6, textureX, textureY);
		defaultStockModel[0].addBox(-5F, 3F, -1F, 4, 1, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 24, 6, textureX, textureY);
		defaultStockModel[1].addBox(-5F, 0F, -1F, 4, 1, 2);
		
		defaultStockModel[2] = new ModelRendererTurbo(this, 23, 9, textureX, textureY);
		defaultStockModel[2].addBox(-8F, 0F, -1F, 3, 4, 2);
		
		stockAttachPoint = new Vector3f(-1F / 16F, 1F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 33, 9, textureX, textureY);
		ammoModel[0].addBox(2F, -1F, -1F, 3, 4, 2);
			
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
