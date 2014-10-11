package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelWinchesterModel70 extends ModelGun 
{
	public ModelWinchesterModel70()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[2];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(1F, 1.5F, -0.5F, 16, 1, 1);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY);
		gunModel[1].addShapeBox(-1F, 0F, -1F, 13, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		
		//Scope
		defaultScopeModel = new ModelRendererTurbo[5];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		defaultScopeModel[0].addBox(-1F, 3F, -1F, 2, 2, 2);
		
		defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		defaultScopeModel[1].addBox(1F, 3.5F, -0.5F, 5, 1, 1);
		
		defaultScopeModel[2] = new ModelRendererTurbo(this, 8, 10, textureX, textureY);
		defaultScopeModel[2].addBox(6F, 3F, -1F, 3, 2, 2);
		
		defaultScopeModel[3] = new ModelRendererTurbo(this, 12, 14, textureX, textureY);
		defaultScopeModel[3].addBox(1.5F, 2.5F, -0.5F, 1, 1, 1);
		
		defaultScopeModel[4] = new ModelRendererTurbo(this, 16, 14, textureX, textureY);
		defaultScopeModel[4].addBox(4.5F, 2.5F, -0.5F, 1, 1, 1);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(17F / 16F, 4.5F / 16F, 0F);
		
		//Stock
		defaultStockModel = new ModelRendererTurbo[2];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		defaultStockModel[0].addBox(-4F, -0.5F, -1F, 3, 2, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 16, 6, textureX, textureY);
		defaultStockModel[1].addShapeBox(-9F, -2F, -1F, 5, 4, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1.5F, 0F, /* 2 */ 0F, -1.5F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		stockAttachPoint = new Vector3f(-1F / 16F, 1F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 34, 0, textureX, textureY);
		ammoModel[0].addBox(1F, 0.5F, -0.5F, 3, 1, 1);
	
		
		translateAll(0, 2.5F, 0);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.RIFLE;
		
		numBulletsInReloadAnimation = 5;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.558F;
		untiltGunTime = 0.163F;
	}
}
