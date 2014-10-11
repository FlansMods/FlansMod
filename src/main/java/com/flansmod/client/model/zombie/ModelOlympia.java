package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelOlympia extends ModelGun 
{
	public ModelOlympia()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[6];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(-5F, 2F, -1F, 2, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0.8F, 0F, 0F, /* 6 */ 0.8F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		gunModel[1] = new ModelRendererTurbo(this, 8, 0, textureX, textureY);
		gunModel[1].addShapeBox(-3F, 2F, -1F, 4, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, -0.5F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -1F, -0.5F, 0F);	

		gunModel[2] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		gunModel[2].addBox(1F, 2F, -1F, 2, 1, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 10, 5, textureX, textureY);
		gunModel[3].addBox(1F, 3F, -1F, 1, 2, 2);	
		
		gunModel[4] = new ModelRendererTurbo(this, 30, 0, textureX, textureY);
		gunModel[4].addBox(-1.5F, 4F, -0.5F, 1, 1, 1);	
		
		gunModel[5] = new ModelRendererTurbo(this, 20, 2, textureX, textureY);
		gunModel[5].addShapeBox(-9F, 1F, -1F, 4, 3, 2, 0F, /* 0 */ 0F, 1F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 1F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	

		breakActionModel = new ModelRendererTurbo[4];
		
		breakActionModel[0] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		breakActionModel[0].addBox(3F, 2F, -1F, 8, 2, 2);
		
		breakActionModel[1] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		breakActionModel[1].addBox(2F, 4F, -0.5F, 15, 1, 1);

		breakActionModel[2] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		breakActionModel[2].addBox(2F, 2.9F, -0.5F, 15, 1, 1);
		
		breakActionModel[3] = new ModelRendererTurbo(this, 20, 13, textureX, textureY);
		breakActionModel[3].addBox(2.25F, 3.5F, -0.25F, 14.5F, 2, 0.5F);
		
		breakAngle = 60F;

		barrelBreakPoint = new Vector3f(3F / 16F, 2F / 16F, 0F);
		
		ammoModel = new ModelRendererTurbo[2];
		
		ammoModel[0] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		ammoModel[0].addBox(1.9F, 3F, -0.4F, 3, 0.8F, 0.8F);
		
		ammoModel[1] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		ammoModel[1].addBox(1.9F, 4.1F, -0.4F, 3, 0.8F, 0.8F);
		
		barrelAttachPoint = new Vector3f(7.5F / 16F, 4F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		scopeIsOnSlide = true;
		
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.BREAK_ACTION;
	}
}
