package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGL1 extends ModelGun 
{
	public ModelGL1()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[4];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(-8F, 2F, -1F, 4, 3, 2, 0F, /* 0 */ 0F, 0.5F, 0F, /* 1 */ 0F, 0.5F, 0F, /* 2 */ 0F, 0.5F, 0F, /* 3 */ 0F, 0.5F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, -2F, 0F, /* 6 */ 0F, -2F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		gunModel[1] = new ModelRendererTurbo(this, 12, 0, textureX, textureY);
		gunModel[1].addShapeBox(-4F, 2F, -1F, 4, 2, 2, 0F, /* 0 */ 0F, 1F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 1F, 0F, /* 4 */ 0F, -1F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -1F, 0F);	

		gunModel[2] = new ModelRendererTurbo(this, 24, 0, textureX, textureY);
		gunModel[2].addShapeBox(0F, 2F, -1F, 3, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -1F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, -1F, 0F);	
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		gunModel[3].addBox(3F, 2F, -1F, 5, 1, 2);	
		
		breakActionModel = new ModelRendererTurbo[5];
		
		breakActionModel[0] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		breakActionModel[0].addBox(3F, 3F, -1F, 13, 2, 2);
		
		breakActionModel[1] = new ModelRendererTurbo(this, 14, 5, textureX, textureY);
		breakActionModel[1].addBox(15F, 5F, -0.5F, 1, 1, 1);
		
		breakActionModel[2] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		breakActionModel[2].addBox(8F, 2F, -1F, 4, 1, 2);

		breakActionModel[3] = new ModelRendererTurbo(this, 12, 14, textureX, textureY);
		breakActionModel[3].addBox(3F, 4.5F, -0.5F, 3, 1, 1);
		
		breakActionModel[4] = new ModelRendererTurbo(this, 34, -1, textureX, textureY);
		breakActionModel[4].addShapeBox(11F, 5.0001F, -3.5F, 1, 10, 7, 0F, /* 0 */ 0F, 0F, -2.5F, /* 1 */ 0F, 0F, -2.5F, /* 2 */ 0F, 0F, -2.5F, /* 3 */ 0F, 0F, -2.5F, /* 4 */ 0F, -6F, -2.5F, /* 5 */ 0F, -6F, -2.5F, /* 6 */ 0F, -6F, -2.5F, /* 7 */ 0F, -6F, -2.5F);	
		
		breakAngle = 60F;

		barrelBreakPoint = new Vector3f(4F / 16F, 2F / 16F, 0F);
		
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 20, 12, textureX, textureY);
		ammoModel[0].addBox(2.9F, 3.25F, -0.75F, 3, 1.5F, 1.5F);
		
		barrelAttachPoint = new Vector3f(7.5F / 16F, 4F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		scopeIsOnSlide = true;
		
		translateAll(-4, 0, 0);
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.BREAK_ACTION;
		
		tiltGunTime = 0.2F;
		unloadClipTime = 0.2F;
		loadClipTime = 0.2F;
		untiltGunTime = 0.4F;
	}
}
