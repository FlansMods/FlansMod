package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelFlareGun extends ModelGun 
{
	public ModelFlareGun()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[3];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(-1F, -2F, -0.5F, 2, 4, 1, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 1F, 0F, 0F, /* 6 */ 1F, 0F, 0F, /* 7 */ -1F, 0F, 0F);	
		
		gunModel[1] = new ModelRendererTurbo(this, 6, 0, textureX, textureY);
		gunModel[1].addShapeBox(1F, 0F, -0.5F, 5, 2, 1, 0F, /* 0 */ -0.5F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ -0.5F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -1F, 0F, 0F);	

		gunModel[2] = new ModelRendererTurbo(this, 18, 0, textureX, textureY);
		gunModel[2].addShapeBox(0F, 2F, -0.5F, 2, 2, 1, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -1F, 0F, 0F);	
		
		breakActionModel = new ModelRendererTurbo[1];
		
		breakActionModel[0] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		breakActionModel[0].addBox(2F, 2F, -1F, 6, 2, 2);

		barrelBreakPoint = new Vector3f(6F / 16F, 2F / 16F, 0F);
		
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		ammoModel[0].addBox(2.5F, 2.5F, -0.5F, 5, 1, 1);
		
		barrelAttachPoint = new Vector3f(7.5F / 16F, 4F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(4F / 16F, 5F / 16F, 0F);
		scopeIsOnBreakAction = true;
		
		translateAll(0F, 1F, 0F);
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.BREAK_ACTION;
	}
}
