package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelP90 extends ModelGun 
{
	public ModelP90()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[8];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-2F, 1F, -1F, 12, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addBox(-8F, -1F, -1F, 6, 5, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
		gunModel[2].addBox(-2F, -2F, -1F, 3, 3, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 10, 13, textureX, textureY);
		gunModel[3].addBox(1F, -2F, -1F, 8, 1, 2);
		
		gunModel[4] = new ModelRendererTurbo(this, 14, 9, textureX, textureY);
		gunModel[4].addBox(5F, -1F, -1F, 1, 2, 2);
		
		gunModel[5] = new ModelRendererTurbo(this, 18, 7, textureX, textureY);
		gunModel[5].addBox(8F, -1F, -1F, 1, 2, 2);
		
		gunModel[6] = new ModelRendererTurbo(this, 16, 4, textureX, textureY);
		gunModel[6].addBox(9F, 0F, -1F, 1, 1, 2);
		
		gunModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY);
		gunModel[7].addBox(4.9F, 2F, -1.5F, 5, 3, 3);
				
		//Scope
		scopeAttachPoint = new Vector3f(7.5F / 16F, 5F / 16F, 0F);
		
		//Barrel
		defaultBarrelModel = new ModelRendererTurbo[1];
				
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 21, 11, textureX, textureY);
		defaultBarrelModel[0].addBox(10F, 1.5F, -0.5F, 1, 1, 1);
		
		barrelAttachPoint = new Vector3f(10F / 16F, 2F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 28, 13, textureX, textureY);
		ammoModel[0].addBox(-2F, 3F, -1F, 11, 1, 2);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.P90;
	}
}
