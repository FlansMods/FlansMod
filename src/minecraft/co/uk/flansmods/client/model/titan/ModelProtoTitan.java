package co.uk.flansmods.client.model.titan;

import co.uk.flansmods.client.model.ModelMecha;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelProtoTitan extends ModelMecha 
{
	public ModelProtoTitan()
	{
		int textureX = 16;
		int textureY = 16;
		
		//Body
		bodyModel = new ModelRendererTurbo[1];
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(-10, 24, -10, 20, 24, 20);
		
		//Left Arm
		leftArmModel = new ModelRendererTurbo[1];
		
		leftArmModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		leftArmModel[0].addBox(-4, -20, -4, 8, 20, 8);
		leftArmModel[0].setPosition(0, 40, 12);
		
		//Right Arm
		rightArmModel = new ModelRendererTurbo[1];
		
		rightArmModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		rightArmModel[0].addBox(-4, -20, -4, 8, 20, 8);
		rightArmModel[0].setPosition(0, 40, -12);
		
		//Hips
		hipsModel = new ModelRendererTurbo[1];
		
		hipsModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		hipsModel[0].addBox(-10, 16, -10, 20, 8, 20);
		
		//Left Leg
		leftLegModel = new ModelRendererTurbo[1];
		
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		leftLegModel[0].addBox(-4, -16, -4, 8, 20, 8);
		leftLegModel[0].setPosition(0, 16, -5);
		
		//Right Leg
		rightLegModel = new ModelRendererTurbo[1];
		
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		rightLegModel[0].addBox(-4, -16, -4, 8, 20, 8);
		rightLegModel[0].setPosition(0, 16, 5);
	}
}