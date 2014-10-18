package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model1887 extends ModelGun 
{
	public Model1887()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[5];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(0F, 3F, -1F, 3, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -1F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -1F, 0F);
		
		gunModel[1] = new ModelRendererTurbo(this, 10, 0, textureX, textureY);
		gunModel[1].addShapeBox(0F, 2F, -1F, 2, 1, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ -1F, 0F, 0F, /* 2 */ -1F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[2].addBox(3F, 3.05F, -0.45F, 7, 0.9F, 0.9F);

		gunModel[3] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[3].addBox(3F, 4.05F, -0.45F, 10, 0.9F, 0.9F);

		gunModel[4] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[4].addBox(3F, 3.25F, -0.75F, 5, 1.5F, 1.5F);
		
		//Shotgun Handle
		//leverActionModel = new ModelRendererTurbo[2];
		
		//leverActionModel[0] = new ModelRendererTurbo(this, 12, 2, textureX, textureY);
		//leverActionModel[0].addBox(2F, 3.25F, -0.5F, 10, 1, 1);
		//
		//leverActionModel[1] = new ModelRendererTurbo(this, 12, 4, textureX, textureY);
		//leverActionModel[1].addBox(7F, 2.75F, -1F, 4, 2, 2);
		
		//Scope
		scopeAttachPoint = new Vector3f(5F / 16F, 5F / 16F, 0F);

		//Stock
		defaultStockModel = new ModelRendererTurbo[2];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 18, 0, textureX, textureY);
		defaultStockModel[0].addShapeBox(-2F, 1F, -1F, 2, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 1F, 0F, /* 6 */ 0F, 1F, 0F, /* 7 */ 0F, 0F, 0F);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
		defaultStockModel[1].addShapeBox(-8F, 0F, -1F, 6, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		stockAttachPoint = new Vector3f(0F / 16F, 3F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		//Grip
		gripAttachPoint = new Vector3f(9F / 16F, 2.25F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		ammoModel[0].addBox(1F, 3F, -0.5F, 2, 1, 1);
		
		translateAll(0F, -0.5F, 0F);
			
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.RIFLE_TOP;
		pumpDelayAfterReload = 86;
		pumpDelay = 7;
		pumpTime = 12;
		gripIsOnPump = true;
		pumpHandleDistance = -0.25F;
		
		spinningCocking = true;
		spinPoint = new Vector3f(1F / 16F, 2F / 16F, 0F);
		
		numBulletsInReloadAnimation = 5;
		tiltGunTime = 0.159F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.708F;
		untiltGunTime = 0.133F;
	}
}
