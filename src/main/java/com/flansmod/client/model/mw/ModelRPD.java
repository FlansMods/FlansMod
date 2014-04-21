package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRPD extends ModelGun 
{
	public ModelRPD()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[8];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, 3F, -1F, 8, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		gunModel[1].addShapeBox(7F, 3F, -1F, 2, 2, 2, 0F, /* 0 */ 0F, 0.2F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0.2F, 0F, /* 4 */ 0F, 0.2F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0.2F, 0F);

		gunModel[2] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
		gunModel[2].addShapeBox(9F, 3F, -1F, 2, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0.2F, 0F, /* 2 */ 0F, 0.2F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0.2F, 0F, /* 6 */ 0F, 0.2F, 0F, /* 7 */ 0F, 0F, 0F);

		gunModel[3] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[3].addBox(11F, 4.1F, -0.4F, 8, 0.8F, 0.8F);

		gunModel[4] = new ModelRendererTurbo(this, 18, 4, textureX, textureY);
		gunModel[4].addBox(11F, 3.1F, -0.4F, 3, 0.8F, 0.8F);
		
		gunModel[5] = new ModelRendererTurbo(this, 36, 0, textureX, textureY);
		gunModel[5].addBox(12.5F, 3F, -0.5F, 1, 2, 1);

		gunModel[6] = new ModelRendererTurbo(this, 40, 0, textureX, textureY);
		gunModel[6].addBox(17.5F, 4F, -0.5F, 1, 2, 1);

		gunModel[7] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[7].addBox(-1F, -4F, -0.75F, 2, 5, 1.5F);
		gunModel[7].setRotationPoint(1F, 3F, 0F);
		gunModel[7].rotateAngleZ = -0.5F;
				
		//Ammo
		ammoModel = new ModelRendererTurbo[3];
		
		ammoModel[0] = new ModelRendererTurbo(this, 8, 6, textureX, textureY);
		ammoModel[0].addBox(4F, -1F, -1F, 2, 5, 2);		
		
		ammoModel[1] = new ModelRendererTurbo(this, 24, 6, textureX, textureY);
		ammoModel[1].addShapeBox(4F, -1F, -3F, 2, 5, 2, 0F, /* 0 */ 0F, -1.5F, -0.5F, /* 1 */ 0F, -1.5F, -0.5F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -1.5F, -0.5F, /* 5 */ 0F, -1.5F, -0.5F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);		

		ammoModel[2] = new ModelRendererTurbo(this, 16, 6, textureX, textureY);
		ammoModel[2].addShapeBox(4F, -1F, 1F, 2, 5, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, -1.5F, -0.5F, /* 3 */ 0F, -1.5F, -0.5F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, -1.5F, -0.5F, /* 7 */ 0F, -1.5F, -0.5F);	

		//Stock
		stockAttachPoint = new Vector3f(-1F / 16F, 4F / 16F, 0F);
		
		defaultStockModel = new ModelRendererTurbo[3];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 32, 4, textureX, textureY);
		defaultStockModel[0].addShapeBox(-2F, 3F, -1F, 1, 2, 2, 0F, /* 0 */ 0F, 1F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 1F, 0F, /* 4 */ 0F, -1F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -1F, 0F);	
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 42, 12, textureX, textureY);
		defaultStockModel[1].addShapeBox(-5F, 2F, -1F, 3, 2, 2, 0F, /* 0 */ 0F, 1F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 1F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
				
		defaultStockModel[2] = new ModelRendererTurbo(this, 32, 8, textureX, textureY);
		defaultStockModel[2].addBox(-8F, 1F, -1F, 3, 3, 2);

		//Barrel - Nope.
		barrelAttachPoint = new Vector3f(11.75F / 16F, 3.5F / 16F, 0F);
				
		//Scope
		scopeAttachPoint = new Vector3f(2F / 16F, 5F / 16F, 0F);
				
		//Grip
		gripAttachPoint = new Vector3f(7.5F / 16F, 2F / 16F, 0F);
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		tiltGunTime = 0.1F;
		unloadClipTime = 0.2F;
		loadClipTime = 0.2F;
		untiltGunTime = 0.5F;
	}
}
