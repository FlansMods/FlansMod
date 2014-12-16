package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRocketPack extends ModelMechaTool 
{
	public ModelRocketPack()
	{
		int textureX = 64;
		int textureY = 64;
		
		baseModel = new ModelRendererTurbo[5];
		baseModel[0] = new ModelRendererTurbo(this, 0, 27, textureX, textureY);
		baseModel[0].addBox(-1, -10, -8, 1, 20, 16);
		baseModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[1].addBox(-7, -11, -7, 6, 21, 6);
		baseModel[2] = new ModelRendererTurbo(this, 24, 6, textureX, textureY);
		baseModel[2].addBox(-7, -11, 1, 6, 21, 6);
		baseModel[3] = new ModelRendererTurbo(this, 0, 27, textureX, textureY);
		baseModel[3].addBox(-6, -15, -6, 4, 4, 4);
		baseModel[4] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
		baseModel[4].addBox(-6, -15, 2, 4, 4, 4);
	}
}