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
		bodyModel[0].addBox(-10, 0, -10, 20, 20, 20);
		
		hipsModel = new ModelRendererTurbo[1];
		
		hipsModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		hipsModel[0].addBox(-10, -10, -10, 20, 10, 20);
		
		leftLegModel = new ModelRendererTurbo[1];
		
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		leftLegModel[0].addBox(-4, -20, -4, 8, 20, 8);
		leftLegModel[0].setPosition(0, -10, -5);
		
		rightLegModel = new ModelRendererTurbo[1];
		
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		rightLegModel[0].addBox(-4, -20, -4, 8, 20, 8);
		rightLegModel[0].setPosition(0, -10, 5);
	}
}