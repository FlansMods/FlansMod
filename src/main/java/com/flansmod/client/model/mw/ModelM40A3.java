package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM40A3 extends ModelGun 
{
	public ModelM40A3()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[3];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(1F, 1.5F, -0.5F, 16, 1, 1);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY);
		gunModel[1].addBox(-1F, 0F, -1F, 13, 2, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[2].addBox(10F, -1F, -1F, 4, 1, 2);
		
		//Scope
		defaultScopeModel = new ModelRendererTurbo[5];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		defaultScopeModel[0].addBox(-1F, 4F, -1F, 2, 2, 2);
		
		defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		defaultScopeModel[1].addBox(1F, 4.5F, -0.5F, 3, 1, 1);
		
		defaultScopeModel[2] = new ModelRendererTurbo(this, 8, 9, textureX, textureY);
		defaultScopeModel[2].addBox(4F, 4F, -1F, 3, 2, 2);
		
		defaultScopeModel[3] = new ModelRendererTurbo(this, 8, 13, textureX, textureY);
		defaultScopeModel[3].addBox(1F, 2.5F, -0.5F, 1, 2, 1);
		
		defaultScopeModel[4] = new ModelRendererTurbo(this, 12, 13, textureX, textureY);
		defaultScopeModel[4].addBox(3F, 2.5F, -0.5F, 1, 2, 1);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(17F / 16F, 4.5F / 16F, 0F);
		
		//Stock
		defaultStockModel = new ModelRendererTurbo[2];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 16, 6, textureX, textureY);
		defaultStockModel[0].addBox(-3F, -2F, -1F, 3, 2, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 18, 10, textureX, textureY);
		defaultStockModel[1].addBox(-9F, -2F, -1F, 6, 4, 2);
		
		stockAttachPoint = new Vector3f(-1F / 16F, 1F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 26, 6, textureX, textureY);
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
