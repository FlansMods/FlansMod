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
	}
}