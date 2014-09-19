package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM1014 extends ModelGun 
{
	public ModelM1014()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[6];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, 3F, -1F, 7, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addBox(6F, 3F, -0.5F, 12, 2, 1);
		
		gunModel[2] = new ModelRendererTurbo(this, 16, 0, textureX, textureY);
		gunModel[2].addBox(15F, 5F, -0.5F, 1, 1, 1);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		gunModel[3].addBox(-1F, 0F, -1F, 2, 3, 2);
		
		gunModel[4] = new ModelRendererTurbo(this, 18, 0, textureX, textureY);
		gunModel[4].addBox(1F, 2F, -1F, 1, 1, 2);
		
		gunModel[5] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
		gunModel[5].addBox(1F, 2.5F, -2F, 4, 3, 1);		
		
		//Shotgun Handle
		pumpModel = new ModelRendererTurbo[1];
		
		pumpModel[0] = new ModelRendererTurbo(this, 8, 7, textureX, textureY);
		pumpModel[0].addBox(10F, 2.8F, -1F, 4, 1, 2);
		
		//Scope
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);

		//Stock
		defaultStockModel = new ModelRendererTurbo[3];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 8, 10, textureX, textureY);
		defaultStockModel[0].addBox(-8F, 0F, -1F, 3, 3, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		defaultStockModel[1].addBox(-5F, 1F, -1F, 2, 2, 2);
		
		defaultStockModel[2] = new ModelRendererTurbo(this, 18, 12, textureX, textureY);
		defaultStockModel[2].addBox(-3F, 2F, -1F, 2, 2, 2);
		
		stockAttachPoint = new Vector3f(1F / 16F, 4F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		//Grip
		gripAttachPoint = new Vector3f(12F / 16F, 3F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 22, 0, textureX, textureY);
		ammoModel[0].addBox(4F, 3.5F, -0.5F, 2, 1, 1);
			
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.SHOTGUN;
		pumpDelayAfterReload = 65;
		pumpDelay = 6;
		pumpTime = 9;
		gripIsOnPump = true;
		
		numBulletsInReloadAnimation = 4;
		tiltGunTime = 0.204F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.625F;
		untiltGunTime = 0.171F;
	}
}
