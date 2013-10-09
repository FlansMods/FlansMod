package co.uk.flansmods.client.model.titan;

import co.uk.flansmods.client.model.ModelMechaTool;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelExcavator extends ModelMechaTool
{
	public ModelExcavator()
	{
		int textureX = 32;
		int textureY = 32;
		
		baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[0].addBox(0, -3.5F, -3.5F, 3, 7, 7);
		
		drillModel = new ModelRendererTurbo[5];
		drillModel[0] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		drillModel[0].addBox(3, -0.5F, -0.5F, 2, 1, 1);
		drillModel[1] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		drillModel[1].addBox(5, -1F, -0.5F, 1, 1, 1);
		drillModel[2] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		drillModel[2].addBox(6, -2F, -1.5F, 6, 1, 3);
		drillModel[3] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		drillModel[3].addBox(6, -1.5F, -2.5F, 6, 1, 1);
		drillModel[4] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		drillModel[4].addBox(6, -1.5F, 1.5F, 6, 1, 1);
	}
}
