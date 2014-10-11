package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMakarov extends ModelGun 
{
	public ModelMakarov()
	{
		int textureX = 32;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[3];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, -1F, -1F, 2, 3, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		gunModel[1].addShapeBox(-2F, 2F, -1F, 5, 1, 2, 0F, /* 0 */ -1F, 0F, 0F, /* 1 */ -2F, 0F, 0F, /* 2 */ -2F, 0F, 0F, /* 3 */ -1F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	

		gunModel[2] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[2].addBox(0.5F, 3F, -0.5F, 6, 1, 1);

		slideModel = new ModelRendererTurbo[3];
		
		slideModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		slideModel[0].addShapeBox(-2F, 3F, -1F, 8, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -1F, 0F, 0F);	
		
		slideModel[1] = new ModelRendererTurbo(this, 2, 5, textureX, textureY);
		slideModel[1].addBox(-0.5F, 4.25F, -0.5F, 1, 1, 1);	
		
		slideModel[2] = new ModelRendererTurbo(this, 2, 5, textureX, textureY);
		slideModel[2].addBox(4.75F, 4.25F, -0.5F, 1, 1, 1);	

		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		ammoModel[0].addBox(-0.9F, -0.75F, -0.5F, 1.8F, 4, 1);
		
		barrelAttachPoint = new Vector3f(6.5F / 16F, 4F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		scopeIsOnSlide = true;
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;
	}
}
