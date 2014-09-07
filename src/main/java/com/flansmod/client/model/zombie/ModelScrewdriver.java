package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelScrewdriver extends ModelGun 
{
	public ModelScrewdriver()
	{
		int textureX = 16;
		int textureY = 8;
		
		gunModel = new ModelRendererTurbo[2];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-4F, -1F, -1F, 4, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[1].addBox(0F, -0.5F, -0.5F, 4, 1, 1);
		
		for(int i = 0; i < 2; i++)
			gunModel[i].setRotationPoint(0F, 12F, 0F);
		
		thirdPersonOffset = new Vector3f(4F / 16F, -12F / 16F, 0F);
	}
}
