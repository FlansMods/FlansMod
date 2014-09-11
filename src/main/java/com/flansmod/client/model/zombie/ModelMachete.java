package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMachete extends ModelGun 
{
	public ModelMachete()
	{
		int textureX = 16;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[2];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(-1F, -2F, 0F, 2, 16, 0, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 1F, -2F, 0F, /* 6 */ 1F, -2F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		gunModel[1] = new ModelRendererTurbo(this, 4, 0, textureX, textureY);
		gunModel[1].addBox(-1F, -8F, -0.5F, 2, 6, 1);
		
		for(int i = 0; i < 2; i++)
			gunModel[i].setRotationPoint(0F, 8F, 0F);
		
		thirdPersonOffset = new Vector3f(0F, 0F, 0F);
	}
}
