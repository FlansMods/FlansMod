package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRPG extends ModelGun 
{
	public ModelRPG()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[5];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-14F, 2.5F, -1F, 22, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addBox(-15F, 2F, -1.5F, 1, 3, 3);
		
		gunModel[2] = new ModelRendererTurbo(this, 8, 4, textureX, textureY);
		gunModel[2].addBox(-5F, 2F, -1.5F, 8, 3, 3);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		gunModel[3].addBox(0F, 0F, -0.5F, 1, 2, 1);
		
		gunModel[4] = new ModelRendererTurbo(this, 4, 11, textureX, textureY);
		gunModel[4].addBox(4F, -1F, -0.5F, 1, 4, 1);
		
		//Scope
		scopeAttachPoint = new Vector3f(1.5F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		//Stock		
		stockAttachPoint = new Vector3f(-1F / 16F, 1F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[4];
		
		ammoModel[0] = new ModelRendererTurbo(this, 14, 12, textureX, textureY);
		ammoModel[0].addBox(-1.5F, 0F, -1.5F, 3, 1, 3);
		
		ammoModel[1] = new ModelRendererTurbo(this, 26, 9, textureX, textureY);
		ammoModel[1].addTrapezoid(-2F, 1F, -2F, 4, 3, 4, 0F, -1F, ModelRendererTurbo.MR_TOP);
		
		ammoModel[2] = new ModelRendererTurbo(this, 38, 6, textureX, textureY);
		ammoModel[2].addTrapezoid(-2F, 4F, -2F, 4, 3, 4, 0F, -1F, ModelRendererTurbo.MR_BOTTOM);
		
		ammoModel[3] = new ModelRendererTurbo(this, 38, 5, textureX, textureY);
		ammoModel[3].addBox(-0.5F, -4F, -0.5F, 1, 4, 1);

		
		for(int i = 0; i < 4; i++)
		{
			ammoModel[i].setRotationPoint(8F, 3.5F, 0F);
			ammoModel[i].rotateAngleZ = -(float)Math.PI / 2F;
		}
			
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.END_LOADED;
		
		tiltGunTime = 0.4F;
		unloadClipTime = 0.1F;
		loadClipTime = 0.1F;
		untiltGunTime = 0.4F;
		
		itemFrameOffset = new Vector3f(4F / 16F, 0F / 16F, 0F);
	}
}
