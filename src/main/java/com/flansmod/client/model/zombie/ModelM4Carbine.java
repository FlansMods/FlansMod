package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM4Carbine extends ModelGun 
{
	public ModelM4Carbine()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[6];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, 2F, -1F, 7, 3, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 32, 4, textureX, textureY);
		gunModel[1].addBox(0F, -1F, -1F, 1, 3, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		gunModel[2].addBox(1F, 1F, -1F, 1, 1, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		gunModel[3].addBox(6F, 3F, -1F, 5, 2, 2);
		
		gunModel[4] = new ModelRendererTurbo(this, 12, 14, textureX, textureY);
		gunModel[4].addBox(12F, 4.5F, -0.5F, 1, 1, 1);
		
		gunModel[5] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		gunModel[5].addBox(6F, 3.5F, -0.5F, 10, 1, 1);
		
		//Scope
		scopeAttachPoint = new Vector3f(3.5F / 16F, 5F / 16F, 0F);
		
		//Stock
		defaultStockModel = new ModelRendererTurbo[3];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 20, 3, textureX, textureY);
		defaultStockModel[0].addBox(-8F, 1F, -1F, 2, 4, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
		defaultStockModel[1].addBox(-6F, 2F, -1F, 2, 3, 2);
		
		defaultStockModel[2] = new ModelRendererTurbo(this, 10, 11, textureX, textureY);
		defaultStockModel[2].addBox(-4F, 3.5F, -0.5F, 3, 1, 1);
		
		stockAttachPoint = new Vector3f(1F / 16F, 4F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(16F / 16F, 4F / 16F, 0F);
		
		//Grip
		gripAttachPoint = new Vector3f(10F / 16F, 3F / 16F, 0F);
		
		defaultGripModel = new ModelRendererTurbo[2];
		
		defaultGripModel[0] = new ModelRendererTurbo(this, 30, 0, textureX, textureY);
		defaultGripModel[0].addBox(7.5F, 2F, -1F, 2, 1, 2);
		
		defaultGripModel[1] = new ModelRendererTurbo(this, 38, 0, textureX, textureY);
		defaultGripModel[1].addBox(8F, 0F, -0.5F, 1, 2, 1);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[2];
		
		ammoModel[0] = new ModelRendererTurbo(this, 20, 11, textureX, textureY);
		ammoModel[0].addBox(3F, 0F, -1F, 3, 2, 2);
		
		ammoModel[1] = new ModelRendererTurbo(this, 30, 11, textureX, textureY);
		ammoModel[1].addBox(4F, -2F, -1F, 3, 2, 2);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
