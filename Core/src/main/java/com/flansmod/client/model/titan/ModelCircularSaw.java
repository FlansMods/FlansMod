package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCircularSaw extends ModelMechaTool
{
	public ModelCircularSaw()
	{
		int textureX = 32;
		int textureY = 32;
		
		baseModel = new ModelRendererTurbo[2];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[0].addBox(0, -3.5F, -3.5F, 3, 7, 7);
		baseModel[1] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		baseModel[1].addBox(3, -1F, -1F, 7, 2, 2);

		sawModel = new ModelRendererTurbo[2];
		sawModel[0] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		sawModel[0].addBox(-4F, -0.4F, -4F, 8, 1, 8);
		sawModel[0].setRotationPoint(9F, 0F, 0F);
		sawModel[1] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		sawModel[1].addBox(-4F, -0.6F, -4F, 8, 1, 8);
		sawModel[1].rotateAngleY = 45F * (float)Math.PI / 180F;
		sawModel[1].setRotationPoint(9F, 0F, 0F);

	}
}
