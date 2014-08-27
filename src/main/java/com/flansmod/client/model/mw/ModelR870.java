package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelR870 extends ModelGun 
{
	public ModelR870()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[5];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(2F, 3F, -1F, 4, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 12, 0, textureX, textureY);
		gunModel[1].addBox(3F, 4.5F, -0.5F, 15, 1, 1);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[2].addShapeBox(-2F, 3F, -1F, 4, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -1F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -1F, 0F);	
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[3].addShapeBox(-2F, 1F, -1F, 2, 2, 2, 0F, /* 0 */ 0F, -1F, 0F, /* 1 */ -0.5F, 0F, 0F, /* 2 */ -0.5F, 0F, 0F, /* 3 */ 0F, -1F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
				
		gunModel[4] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		gunModel[4].addShapeBox(1F, 2F, -1F, 3, 1, 2, 0F, /* 0 */ -1F, 0F, 0F, /* 1 */ -1F, 0F, 0F, /* 2 */ -1F, 0F, 0F, /* 3 */ -1F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		//Shotgun Handle
		pumpModel = new ModelRendererTurbo[2];
		
		pumpModel[0] = new ModelRendererTurbo(this, 12, 2, textureX, textureY);
		pumpModel[0].addBox(2F, 3.25F, -0.5F, 10, 1, 1);
		
		pumpModel[1] = new ModelRendererTurbo(this, 12, 4, textureX, textureY);
		pumpModel[1].addBox(7F, 2.75F, -1F, 4, 2, 2);
		
		//Scope
		scopeAttachPoint = new Vector3f(5F / 16F, 5F / 16F, 0F);

		//Stock
		defaultStockModel = new ModelRendererTurbo[2];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 10, 8, textureX, textureY);
		defaultStockModel[0].addBox(-8F, 1F, -1F, 1, 3, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 16, 8, textureX, textureY);
		defaultStockModel[1].addShapeBox(-7F, 1F, -1F, 5, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		stockAttachPoint = new Vector3f(1F / 16F, 4F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		//Grip
		gripAttachPoint = new Vector3f(9F / 16F, 2.25F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 14, 14, textureX, textureY);
		ammoModel[0].addBox(4F, 3.5F, -0.5F, 2, 1, 1);
		
		translateAll(0F, -0.5F, 0F);
			
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.SHOTGUN;
		pumpDelayAfterReload = 115;
		pumpDelay = 6;
		pumpTime = 9;
		gripIsOnPump = true;
		pumpHandleDistance = -0.25F;
		
		numBulletsInReloadAnimation = 7;
		tiltGunTime = 0.159F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.708F;
		untiltGunTime = 0.133F;
	}
}
