package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBizon extends ModelGun 
{
	public ModelBizon()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[5];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(-2F, 3F, -1F, 15, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -1F, 0F, 0F);	
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addBox(-2F, 2F, -1F, 5, 1, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		gunModel[2].addShapeBox(-2F, -1F, -1F, 2, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 1F, 0F, 0F, /* 6 */ 1F, 0F, 0F, /* 7 */ -1F, 0F, 0F);	
		
		gunModel[3] = new ModelRendererTurbo(this, 8, 7, textureX, textureY);
		gunModel[3].addBox(13F, 3.5F, -0.5F, 2, 1, 1);
		
		gunModel[4] = new ModelRendererTurbo(this, 8, 9, textureX, textureY);
		gunModel[4].addBox(13F, 4.5F, -0.5F, 1, 1, 1);
				
		//Scope
		scopeAttachPoint = new Vector3f(7.5F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(10F / 16F, 2F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		ammoModel[0].addBox(3F, 1.2F, -0.9F, 10, 1.8F, 1.8F);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		
	}
}
