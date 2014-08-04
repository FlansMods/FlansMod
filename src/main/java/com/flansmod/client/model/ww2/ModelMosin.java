package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMosin extends ModelGun 
{
	public ModelMosin()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[8];
		
		//Stock
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY);
		gunModel[0].addShapeBox(-8F, -2F, -1F, 4, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		
		gunModel[1] = new ModelRendererTurbo(this,  0,  5, textureX, textureY);
		gunModel[1].addShapeBox(-4F, -1F, -1F, 1, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, -0.5F, 0F, /* 6 */ 0F, -0.5F, 0F, /* 7 */ 0F, 0F, 0F);
		
		gunModel[2] = new ModelRendererTurbo(this,  0,  9, textureX, textureY);
		gunModel[2].addShapeBox(-3F, -1F, -1F, 3, 1, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0.5F, 0F, /* 5 */ 0F, 2F, 0F, /* 6 */ 0F, 2F, 0F, /* 7 */ 0F, 0.5F, 0F);
		
		//Main wood bit
		gunModel[3] = new ModelRendererTurbo(this,  0,  12, textureX, textureY); 
		gunModel[3].addBox(0F, 0F, -1F, 8, 2, 2, 0F);
		
		//Trigger piece
		gunModel[4] = new ModelRendererTurbo(this,  12,  0, textureX, textureY); 
		gunModel[4].addShapeBox(0F, -1F, -1F, 4, 1, 2, 0F, /* 0 */ -0.5F, 0F, 0F, /* 1 */ -1.5F, 0F, 0F, /* 2 */ -1.5F, 0F, 0F, /* 3 */ -0.5F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		
		//Barrel
		gunModel[5] = new ModelRendererTurbo(this,  12,  3, textureX, textureY); 
		gunModel[5].addBox(1F, 1.5F, -0.5F, 18, 1, 1, 0F);
		
		//Iron sight
		gunModel[6] = new ModelRendererTurbo(this,  24,  0, textureX, textureY); 
		gunModel[6].addBox(16F, 2.5F, -0.5F, 1, 1, 1, 0F);

		
		//Front wood bit
		gunModel[7] = new ModelRendererTurbo(this,  9,  6, textureX, textureY); 
		gunModel[7].addBox(8F, 1F, -1F, 5, 1, 2, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 23, 12, textureX, textureY);
		ammoModel[0].addBox(1F, -1F, -0.5F, 3, 3, 1);
		
		translateAll(0, 2.5F, 0);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.558F;
		untiltGunTime = 0.163F;
	}
}
