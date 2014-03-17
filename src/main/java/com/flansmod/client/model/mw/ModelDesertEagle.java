package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelDesertEagle extends ModelGun 
{
	public ModelDesertEagle()
	{
		int textureX = 32;
		int textureY = 32;	
		
		gunModel = new ModelRendererTurbo[6];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-3F, 1F, -1F, 7, 1, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		gunModel[1].addBox(-2F, -3F, -1F, 3, 4, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		gunModel[2].addBox(-1F, 2.1F, -0.5F, 11, 1, 1);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		gunModel[3].addBox(2F, 3F, -1F, 8, 2, 2);

		gunModel[4] = new ModelRendererTurbo(this, 10, 3, textureX, textureY);
		gunModel[4].addBox(10F, 2F, -1F, 2, 3, 2);
		
		gunModel[5] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		gunModel[5].addBox(10.5F, 4.2F, -0.5F, 1, 1, 1);
		
		slideModel = new ModelRendererTurbo[4];
		
		slideModel[0] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		slideModel[0].addBox(-2F, 2F, -1F, 4, 3, 2);
		
		slideModel[1] = new ModelRendererTurbo(this, 0, 20, textureX, textureY);
		slideModel[1].addBox(2F, 2F, -1F, 8, 1, 2);
		
		slideModel[2] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		slideModel[2].addBox(-3F, 3F, -0.5F, 1, 1, 1);
		
		slideModel[3] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		slideModel[3].addBox(-1.5F, 4.2F, -0.5F, 1, 1, 1);

		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
		ammoModel[0].addBox(-1.5F, -2.8F, -0.5F, 2, 4, 1);
		
		translateAll(0F, 1F, 0F);
		
		barrelAttachPoint = new Vector3f(12F / 16F, 4.5F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(5F / 16F, 6F / 16F, 0F);
		scopeIsOnSlide = false;
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;
	}
}
