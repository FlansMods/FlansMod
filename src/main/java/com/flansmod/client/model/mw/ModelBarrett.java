package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBarrett extends ModelGun 
{
	public ModelBarrett()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[3];
		
		//Main Barrel
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-4F, 2F, -1F, 16, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 26, 4, textureX, textureY);
		gunModel[1].addBox(12F, 2.5F, -0.5F, 8, 1, 1);
		
		//Trigger Handle
		gunModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[2].addBox(-1F, -2F, -1F, 3, 4, 2);
		
		//Bolt
		slideModel = new ModelRendererTurbo[2];
		
		slideModel[0] = new ModelRendererTurbo(this, 34, 6, textureX, textureY);
		slideModel[0].addTrapezoid(3F, 2.5F, 0.5F, 1, 1, 2, 0F, -0.5F, ModelRendererTurbo.MR_FRONT);
		slideModel[0].doMirror(false, false, true);
		slideModel[1] = new ModelRendererTurbo(this, 34, 6, textureX, textureY);
		slideModel[1].addTrapezoid(3F, 2.5F, 0.5F, 1, 1, 2, 0F, -0.5F, ModelRendererTurbo.MR_FRONT);
		
		//Scope
		defaultScopeModel = new ModelRendererTurbo[3];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		defaultScopeModel[0].addTrapezoid(-1F, 4.25F, -1F, 4, 2, 2, 0F, -0.5F, ModelRendererTurbo.MR_LEFT);
		
		defaultScopeModel[1] = new ModelRendererTurbo(this, 12, 10, textureX, textureY);
		defaultScopeModel[1].addTrapezoid(3F, 4.25F, -1F, 4, 2, 2, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT);
		
		defaultScopeModel[2] = new ModelRendererTurbo(this, 10, 7, textureX, textureY);
		defaultScopeModel[2].addBox(1.5F, 3.5F, -0.5F, 3, 2, 1);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		//Barrel
		defaultBarrelModel = new ModelRendererTurbo[1];
		
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 18, 4, textureX, textureY);
		defaultBarrelModel[0].addBox(18.5F, 2F, -1F, 2, 2, 2);
		
		barrelAttachPoint = new Vector3f(20F / 16F, 4F / 16F, 0F);
		
		//Stock
		defaultStockModel = new ModelRendererTurbo[1];
		defaultStockModel[0] = new ModelRendererTurbo(this, 36, 9, textureX, textureY);
		defaultStockModel[0].addBox(-8F, 0F, -1F, 4, 3, 2);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 1F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 24, 8, textureX, textureY);
		ammoModel[0].addBox(2.5F, -3F, -1F, 4, 5, 2);
		
		translateAll(0, 1, 0);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
