package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSamuraiSword extends ModelGun 
{
	public ModelSamuraiSword()
	{
		int textureX = 8;
		int textureY = 32;
		
		gunModel = new ModelRendererTurbo[4];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(-1F, -2F, 0F, 2, 12, 0, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	

		gunModel[1] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		gunModel[1].addShapeBox(-1F, 10F, 0F, 2, 12, 0, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 1F, 0F, 0F, /* 5 */ -1.5F, -2F, 0F, /* 6 */ -1.5F, -2F, 0F, /* 7 */ 1F, 0F, 0F);	

		gunModel[2] = new ModelRendererTurbo(this, 0, 29, textureX, textureY);
		gunModel[2].addBox(-1F, -3F, -1F, 2, 1, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 4, 0, textureX, textureY);
		gunModel[3].addBox(-0.5F, -11F, -0.5F, 1, 8, 1);
		
		for(int i = 0; i < 4; i++)
			gunModel[i].setRotationPoint(0F, 8F, 0F);
		
		thirdPersonOffset = new Vector3f(0F, -2F / 16F, 0F);
	}
}
