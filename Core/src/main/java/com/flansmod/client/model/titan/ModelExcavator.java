package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelExcavator extends ModelMechaTool
{
	public ModelExcavator()
	{
		int textureX = 32;
		int textureY = 32;
		
		baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[0].addBox(0, -3.5F, -3.5F, 3, 7, 7);
		
		drillModel = new ModelRendererTurbo[9];
		drillModel[0] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		drillModel[0].addBox(3, -0.5F, -0.5F, 1, 1, 1);
		drillModel[1] = new ModelRendererTurbo(this, 13, 2, textureX, textureY);
		drillModel[1].addBox(4, -1F, -0.5F, 1, 1, 1);
		drillModel[2] = new ModelRendererTurbo(this, 13, 4, textureX, textureY);
		drillModel[2].addBox(5, -1.5F, -0.5F, 1, 1, 1);
		drillModel[3] = new ModelRendererTurbo(this, 17, 0, textureX, textureY);
		drillModel[3].addBox(6, -2F, -0.5F, 2, 1, 1);
		drillModel[4] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		drillModel[4].addBox(8, -2.5F, -1F, 7, 1, 2);
		drillModel[5] = new ModelRendererTurbo(this, 17, 2, textureX, textureY);
		drillModel[5].addBox(8, -1.5F, -4F, 5, 1, 1);
		drillModel[6] = new ModelRendererTurbo(this, 17, 4, textureX, textureY);
		drillModel[6].addBox(8, -1.5F, 3F, 5, 1, 1);
		drillModel[7] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
		drillModel[7].addBox(8, -2F, -3F, 6, 1, 2);
		drillModel[8] = new ModelRendererTurbo(this, 0, 20, textureX, textureY);
		drillModel[8].addBox(8, -2F, 1F, 6, 1, 2);
	}
}
