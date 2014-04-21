package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM60E4 extends ModelGun 
{
	public ModelM60E4()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[10];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-5F, 2F, -1F, 13, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addShapeBox(-8F, 1F, -1F, 3, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		gunModel[2].addBox(-3F, 4F, -1F, 7, 1, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		gunModel[3].addBox(-1F, 1F, -1F, 3, 1, 2);
		
		gunModel[4] = new ModelRendererTurbo(this, 30, 0, textureX, textureY);
		gunModel[4].addBox(-0.75F, -3F, -0.75F, 1.5F, 4, 1.5F);
		gunModel[4].setRotationPoint(0F, 1F, 0F);
		gunModel[4].rotateAngleZ = -0.5F;
		
		gunModel[5] = new ModelRendererTurbo(this, 10, 4, textureX, textureY);
		gunModel[5].addBox(5F, 1.5F, -1.25F, 5, 1.5F, 2.5F);

		gunModel[6] = new ModelRendererTurbo(this, 10, 14, textureX, textureY);
		gunModel[6].addBox(8F, 2.1F, -0.4F, 7, 0.8F, 0.8F);

		gunModel[7] = new ModelRendererTurbo(this, 8, 12, textureX, textureY);
		gunModel[7].addBox(8F, 3.2F, -0.3F, 8, 0.6F, 0.6F);

		gunModel[8] = new ModelRendererTurbo(this, 18, 10, textureX, textureY);
		gunModel[8].addBox(12F, 2.9F, -0.4F, 1, 1, 0.8F);

		gunModel[9] = new ModelRendererTurbo(this, 22, 9, textureX, textureY);
		gunModel[9].addBox(14F, 3.1F, -0.4F, 1, 2, 0.8F);

		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 26, 6, textureX, textureY);
		ammoModel[0].addBox(1F, -1F, -7F, 3, 4, 6);		
		
		//Stock - Nope.
		stockAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		//Barrel - Nope.
		barrelAttachPoint = new Vector3f(11.75F / 16F, 3.5F / 16F, 0F);
				
		//Scope
		scopeAttachPoint = new Vector3f(0F, 5F / 16F, 0F);
		
		defaultScopeModel = new ModelRendererTurbo[1];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 26, 10, textureX, textureY);
		defaultScopeModel[0].addBox(3.8F, 5F, -0.2F, 0.2F, 1, 0.4F);
		
		//Grip
		gripAttachPoint = new Vector3f(7.5F / 16F, 2F / 16F, 0F);
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		tiltGunTime = 0.1F;
		unloadClipTime = 0.2F;
		loadClipTime = 0.2F;
		untiltGunTime = 0.5F;
	}
}
