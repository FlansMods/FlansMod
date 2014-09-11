package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRiotShield extends ModelGun 
{
	public ModelRiotShield()
	{
		int textureX = 64;
		int textureY = 64;
		
		gunModel = new ModelRendererTurbo[1];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(4F, -20F, -8F, 1, 32, 16);
		
	}
}

