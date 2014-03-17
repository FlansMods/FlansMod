package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDrill extends ModelMechaTool 
{
	public ModelDrill()
	{
		int textureX = 32;
		int textureY = 32;
		
		baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[0].addBox(0, -3.5F, -3.5F, 3, 7, 7);

		drillModel = new ModelRendererTurbo[4];
		drillModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		drillModel[0].addBox(3, -2.5F, -2.5F, 2, 5, 5);
		drillModel[0].rotateAngleX = -20F * (float)Math.PI / 180F;
		drillModel[1] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		drillModel[1].addBox(5, -1.5F, -1.5F, 2, 3, 3);
		drillModel[1].rotateAngleX = -40F * (float)Math.PI / 180F;
		drillModel[2] = new ModelRendererTurbo(this, 9, 14, textureX, textureY);
		drillModel[2].addBox(7, -0.5F, -0.5F, 2, 1, 1);
		drillModel[2].rotateAngleX = -60F * (float)Math.PI / 180F;
		drillModel[3] = new ModelRendererTurbo(this, 9, 14, textureX, textureY);
	}
}
