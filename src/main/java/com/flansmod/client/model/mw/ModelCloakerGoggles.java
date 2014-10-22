package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCloakerGoggles extends ModelCustomArmour
{
	public ModelCloakerGoggles()
	{
		int textureX = 64;
		int textureY = 32;
		
		headModel = new ModelRendererTurbo[4];
		
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(-4.5F, -9F, -4.5F, 9, 9, 9);
		
		headModel[1] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		headModel[1].addBox(-3F, -6.5F, -7.5F, 2, 2, 3);
		
		headModel[2] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		headModel[2].addBox(1F, -6.5F, -7.5F, 2, 2, 3);

		headModel[3] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		headModel[3].addBox(-2F, -3.5F, -6.5F, 4, 4, 2);
	}
}
