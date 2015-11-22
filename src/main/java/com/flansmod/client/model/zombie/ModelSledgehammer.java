package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSledgehammer extends ModelGun 
{
	public ModelSledgehammer()
	{
		int textureX = 64;
		int textureY = 32;
		
		gunModel = new ModelRendererTurbo[2];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, -1F, -12F, 2, 2, 24);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[1].addBox(-4F, -2F, 12F, 8, 4, 4);
		
		for(int i = 0; i < 2; i++)
			gunModel[i].setRotationPoint(4F, 0F, 0F);
		
		thirdPersonOffset = new Vector3f(-2F / 16F, 0F, 0F);
	}
}
