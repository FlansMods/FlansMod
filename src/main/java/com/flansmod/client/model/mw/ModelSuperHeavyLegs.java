package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSuperHeavyLegs extends ModelCustomArmour 
{
	public ModelSuperHeavyLegs()
	{
		int textureX = 64;
		int textureY = 32;
		
		leftLegModel = new ModelRendererTurbo[2];
		
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		leftLegModel[0].addBox(-2.1F, -1F, -2.5F, 5, 10, 5);

		leftLegModel[1] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		leftLegModel[1].addBox(-1F, 3F, -3.5F, 3, 4, 1);

		rightLegModel = new ModelRendererTurbo[2];
		
		rightLegModel[0] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		rightLegModel[0].addBox(-2.9F, -1F, -2.5F, 5, 10, 5);

		rightLegModel[1] = new ModelRendererTurbo(this, 8, 15, textureX, textureY);
		rightLegModel[1].addBox(-2F, 3F, -3.5F, 3, 4, 1);

	}
}
