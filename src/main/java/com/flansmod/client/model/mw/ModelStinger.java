package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelStinger extends ModelGun 
{
	public ModelStinger()
	{
		int textureX = 64;
		int textureY = 32;
		
		gunModel = new ModelRendererTurbo[5];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-15F, 2.5F, -1F, 25, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addBox(-16F, 2F, -1.5F, 1, 3, 3);
		
		gunModel[2] = new ModelRendererTurbo(this, 8, 4, textureX, textureY);
		gunModel[2].addBox(10F, 2F, -1.5F, 2, 3, 3);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		gunModel[3].addBox(0F, -0.5F, -0.5F, 1, 3, 1);
		
		gunModel[4] = new ModelRendererTurbo(this, 4, 10, textureX, textureY);
		gunModel[4].addBox(3F, -0.5F, -1F, 6, 3, 2);
		
		for(int i = 0; i < 5; i++)
		{
			gunModel[i].setRotationPoint(0F, 0F, 2F);
		}
		
		//Scope
		scopeAttachPoint = new Vector3f(1.5F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		//Stock		
		stockAttachPoint = new Vector3f(-1F / 16F, 1F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[3];
		
		ammoModel[0] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
		ammoModel[0].addBox(-0.5F, -10F, -0.5F, 1, 20, 1);
		
		ammoModel[1] = new ModelRendererTurbo(this, 55, 0, textureX, textureY);
		ammoModel[1].addBox(-1F, -10F, 0F, 2, 1, 0);
		
		ammoModel[2] = new ModelRendererTurbo(this, 55, 2, textureX, textureY);
		ammoModel[2].addBox(0F, -10F, -1F, 0, 1, 2);

		
		for(int i = 0; i < 3; i++)
		{
			ammoModel[i].setRotationPoint(0F, 3.5F, 2F);
			ammoModel[i].rotateAngleZ = -(float)Math.PI / 2F;
		}
			
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.END_LOADED;
		
		endLoadedAmmoDistance = 3F;
		
		tiltGunTime = 0.25F;
		unloadClipTime = 0.25F;
		loadClipTime = 0.25F;
		untiltGunTime = 0.25F;
		
		thirdPersonOffset = new Vector3f(0F, 0F, -0.1F);
		itemFrameOffset = new Vector3f(4F / 16F, 0F / 16F, 0F);
	}
}
