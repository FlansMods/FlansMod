package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBaseballBat extends ModelGun 
{
	public ModelBaseballBat()
	{
		int textureX = 16;
		int textureY = 32;
		
		gunModel = new ModelRendererTurbo[2];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(-1F, -2F, -1F, 2, 24, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0.5F, 0F, 0.5F, /* 5 */ 0.5F, 0F, 0.5F, /* 6 */ 0.5F, 0F, 0.5F, /* 7 */ 0.5F, 0F, 0.5F);	
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 27, textureX, textureY);
		gunModel[1].addBox(-1.5F, -4F, -1.5F, 3, 2, 3);
		
		for(int i = 0; i < 2; i++)
			gunModel[i].setRotationPoint(0F, 0F, 0F);
		
		thirdPersonOffset = new Vector3f(0F, 0F, 0F);
	}
}
