package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSuperHeavyBoots extends ModelCustomArmour 
{
	public ModelSuperHeavyBoots()
	{
		int textureX = 128;
		int textureY = 64;
		
		leftLegModel = new ModelRendererTurbo[1];
		
		leftLegModel[0] = new ModelRendererTurbo(this, 84, 0, textureX, textureY);
		leftLegModel[0].addBox(-2.1F, 9F, -3F, 5, 3, 6);


		rightLegModel = new ModelRendererTurbo[1];
		
		rightLegModel[0] = new ModelRendererTurbo(this, 84, 9, textureX, textureY);
		rightLegModel[0].addBox(-2.9F, 9F, -3F, 5, 3, 6);

	}
}
