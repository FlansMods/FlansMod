package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMiniUzi extends ModelGun
{
	public ModelMiniUzi()
	{
		int textureX = 32;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[7];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, 3F, -1F, 8, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addShapeBox(0F, 2F, -1F, 6, 1, 2, 0F, /* 0 */ -1F, 0F, 0F, /* 1 */ -1F, 0F, 0F, /* 2 */ -1F, 0F, 0F, /* 3 */ -1F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);

		gunModel[2] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		gunModel[2].addBox(1F, -1F, -1F, 2, 3, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		gunModel[3].addBox(0F, 5F, -0.5F, 1, 0.5F, 1);
		
		gunModel[4] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		gunModel[4].addBox(6F, 5F, -0.5F, 1, 0.5F, 1);
		
		gunModel[5] = new ModelRendererTurbo(this, 4, 12, textureX, textureY);
		gunModel[5].addBox(6.5F, 3.25F, -0.5F, 1, 1, 1);

		gunModel[6] = new ModelRendererTurbo(this, 4, 14, textureX, textureY);
		gunModel[6].addBox(7F, 3.5F, -0.25F, 2, 0.5F, 0.5F);

		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 10, 7, textureX, textureY);
		ammoModel[0].addBox(1.25F, -4F, -0.75F, 1.5F, 6, 1.5F);
		
		barrelAttachPoint = new Vector3f(7.5F / 16F, 3.75F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;
	}
}
