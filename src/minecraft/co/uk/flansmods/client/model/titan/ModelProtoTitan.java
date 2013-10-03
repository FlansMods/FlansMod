package co.uk.flansmods.client.model.titan;

import co.uk.flansmods.client.model.ModelMecha;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelProtoTitan extends ModelMecha 
{
	public ModelProtoTitan()
	{
		int textureX = 16;
		int textureY = 16;
		
		bodyModel = new ModelRendererTurbo[1];
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(-10, -10, -10, 20, 20, 20);
		
		leftLegModel = new ModelRendererTurbo[1];
		
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		leftLegModel[0].addBox(-2, -10, -2, 4, 10, 4);
		leftLegModel[0].setPosition(-5, -10, 0);
	}
}