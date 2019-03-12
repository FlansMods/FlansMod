package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM21 extends ModelGun
{
	public ModelM21()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[3];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(2F, 3.5F, -0.5F, 16, 1, 1);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY);
		gunModel[1].addBox(-1F, 2F, -1F, 8, 3, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		gunModel[2].addBox(7F, 3F, -1F, 6, 2, 2);
		
		//Scope
		defaultScopeModel = new ModelRendererTurbo[6];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
		defaultScopeModel[0].addBox(-1F, 6F, -1F, 2, 2, 2);
		
		defaultScopeModel[1] = new ModelRendererTurbo(this, 34, 0, textureX, textureY);
		defaultScopeModel[1].addBox(1F, 6.5F, -0.5F, 4, 1, 1);
		
		defaultScopeModel[2] = new ModelRendererTurbo(this, 8, 11, textureX, textureY);
		defaultScopeModel[2].addBox(5F, 6F, -1F, 2, 2, 2);
		
		defaultScopeModel[3] = new ModelRendererTurbo(this, 6, 11, textureX, textureY);
		defaultScopeModel[3].addBox(1.5F, 5.5F, -0.5F, 1, 1, 1);
		
		defaultScopeModel[4] = new ModelRendererTurbo(this, 6, 11, textureX, textureY);
		defaultScopeModel[4].addBox(3.5F, 5.5F, -0.5F, 1, 1, 1);
		
		defaultScopeModel[5] = new ModelRendererTurbo(this, 14, 11, textureX, textureY);
		defaultScopeModel[5].addBox(0F, 4.5F, -0.5F, 6, 1, 1);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		//Stock
		defaultStockModel = new ModelRendererTurbo[2];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 20, 2, textureX, textureY);
		defaultStockModel[0].addBox(-2F, 2F, -1F, 1, 2, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 19, 6, textureX, textureY);
		defaultStockModel[1].addBox(-8F, 1F, -1F, 6, 3, 2);
		
		stockAttachPoint = new Vector3f(-1F / 16F, 3F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 35, 8, textureX, textureY);
		ammoModel[0].addBox(3F, -4F, -1F, 3, 6, 2);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
