package com.flansmod.client.model.mw;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelM1911 extends ModelM9
{
	public ModelM1911()
	{
		int textureX = 32;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[4];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, 0F, -1F, 3, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		gunModel[1].addBox(-2F, -2F, -1F, 3, 2, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[2].addBox(-1F, 2F, -1F, 8, 1, 2);

		gunModel[3] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		gunModel[3].addBox(-0.5F, 3.5F, -0.5F, 8, 1, 1);
		
		ammoModel[0] = new ModelRendererTurbo(this, 14, 0, textureX, textureY);
		ammoModel[0].addBox(-1F, -1.8F, -0.5F, 2, 4, 1);
	}
}
