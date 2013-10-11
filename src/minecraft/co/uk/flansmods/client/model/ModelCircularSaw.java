package co.uk.flansmods.client.model;

import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelCircularSaw extends ModelMechaTool
{
	public ModelCircularSaw()
	{
		int textureX = 32;
		int textureY = 32;
		
		baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[0].addBox(0, -3.5F, -3.5F, 3, 7, 7);
		baseModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[1].addBox(3, -1F, -1F, 7, 2, 2);

		sawModel = new ModelRendererTurbo[2];
		sawModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		sawModel[0].addBox(3, -2.5F, -2.5F, 2, 5, 5);
		sawModel[0].rotateAngleX = -20F * (float)Math.PI / 180F;
		sawModel[1] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		sawModel[1].addBox(5, -1.5F, -1.5F, 2, 3, 3);
		sawModel[1].rotateAngleX = -40F * (float)Math.PI / 180F;
	}
}
