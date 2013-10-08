package co.uk.flansmods.client.model.titan;

import co.uk.flansmods.client.model.ModelMechaTool;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelDrill extends ModelMechaTool 
{
	public ModelDrill()
	{
		int textureX = 8;
		int textureY = 8;
		
		baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[0].addBox(0, -4, -4, 4, 8, 8);
		
		drillModel = new ModelRendererTurbo[4];
		drillModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		drillModel[0].addBox(4, -3.5F, -3.5F, 2, 7, 7);
		drillModel[0].rotateAngleX = -10F * (float)Math.PI / 180F;
		drillModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		drillModel[1].addBox(6, -2.5F, -2.5F, 2, 5, 5);
		drillModel[1].rotateAngleX = -30F * (float)Math.PI / 180F;
		drillModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		drillModel[2].addBox(8, -1.5F, -1.5F, 2, 3, 3);
		drillModel[2].rotateAngleX = -50F * (float)Math.PI / 180F;
		drillModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		drillModel[3].addBox(10, -0.5F, -0.5F, 2, 1, 1);
		drillModel[3].rotateAngleX = -70F * (float)Math.PI / 180F;
	}
}
