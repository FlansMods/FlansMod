package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSIGP226 extends ModelGun 
{
	public ModelSIGP226()
	{
		int textureX = 32;
		int textureY = 16;	
		
		gunModel = new ModelRendererTurbo[3];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, 3F, -1F, 7, 1, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		gunModel[1].addShapeBox(-1F, -1F, -1F, 2, 4, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 1F, 0F, 0F, /* 6 */ 1F, 0F, 0F, /* 7 */ -1F, 0F, 0F);	
		
		gunModel[2] = new ModelRendererTurbo(this, 8, 3, textureX, textureY);
		gunModel[2].addBox(0.5F, 3.5F, -0.5F, 6, 1, 1);
		
		slideModel = new ModelRendererTurbo[2];
		
		slideModel[0] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		slideModel[0].addShapeBox(-1F, 4F, -1F, 7, 1, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -1F, 0F, 0F);	
		
		slideModel[1] = new ModelRendererTurbo(this, 8, 5, textureX, textureY);
		slideModel[1].addBox(0F, 4.5F, -0.5F, 1, 1, 1);

		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 16, 5, textureX, textureY);
		ammoModel[0].addShapeBox(0F, -0.9F, -0.5F, 2, 4, 1, 0F, /* 0 */ 0.9F, 0F, 0F, /* 1 */ -1.1F, 0F, 0F, /* 2 */ -1.1F, 0F, 0F, /* 3 */ 0.9F, 0F, 0F, /* 4 */ -0.1F, 0F, 0F, /* 5 */ -0.1F, 0F, 0F, /* 6 */ -0.1F, 0F, 0F, /* 7 */ -0.1F, 0F, 0F);	
		
		translateAll(0F, 0F, 0F);
		
		barrelAttachPoint = new Vector3f(6.5F / 16F, 4F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		scopeIsOnSlide = true;
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;
	}
}
