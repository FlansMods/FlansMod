package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelTT33 extends ModelGun 
{
	public ModelTT33()
	{
		int textureX = 32;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[3];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, -2F, -1F, 3, 4, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[1].addBox(-1F, 2F, -1F, 8, 1, 2);

		gunModel[2] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		gunModel[2].addBox(-0.5F, 3.5F, -0.5F, 8, 1, 1);

		slideModel = new ModelRendererTurbo[3];
		
		slideModel[0] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		slideModel[0].addBox(-1F, 3F, -1F, 8, 2, 2);
		
		slideModel[1] = new ModelRendererTurbo(this, 10, 2, textureX, textureY);
		slideModel[1].addBox(5.95F, 4.5F, -0.5F, 1, 1, 1);
		
		slideModel[2] = new ModelRendererTurbo(this, 8, 0, textureX, textureY);
		slideModel[2].addBox(-0.8F, 4.5F, -0.5F, 1, 1, 1);

		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 14, 0, textureX, textureY);
		ammoModel[0].addBox(-0.5F, -1.8F, -0.5F, 2, 4, 1);
		
		barrelAttachPoint = new Vector3f(7.5F / 16F, 4F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		scopeIsOnSlide = true;
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;
	}
}
