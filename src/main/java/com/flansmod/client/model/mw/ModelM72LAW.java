package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM72LAW extends ModelGun
{
	public ModelM72LAW()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[4];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		gunModel[0].addBox(-12F, 1F, -1.5F, 26, 3, 3);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		gunModel[1].addBox(-12F, 4F, -1F, 3, 1, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[2].addBox(0F, 4F, -1F, 14, 1, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		gunModel[3].addBox(0F, 5F, -0.5F, 1, 2, 1);
		
		//Scope
		scopeAttachPoint = new Vector3f(1.5F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		//Stock		
		stockAttachPoint = new Vector3f(-1F / 16F, 1F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[0];
			
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.END_LOADED;
		
		tiltGunTime = 0.4F;
		unloadClipTime = 0.1F;
		loadClipTime = 0.1F;
		untiltGunTime = 0.4F;
	}
}
