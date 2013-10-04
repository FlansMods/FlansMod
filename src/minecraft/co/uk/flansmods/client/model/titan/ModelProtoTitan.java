package co.uk.flansmods.client.model.titan;

import co.uk.flansmods.client.model.ModelMecha;
import co.uk.flansmods.client.tmt.Coord2D;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.client.tmt.Shape2D;

public class ModelProtoTitan extends ModelMecha 
{
	public ModelProtoTitan()
	{
		int textureX = 256;
		int textureY = 256;
		
		//Body
		bodyModel = new ModelRendererTurbo[4];
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(-12, 24, -12, 16, 24, 24);
		
		bodyModel[1] = new ModelRendererTurbo(this, 0, 48, textureX, textureY);
		bodyModel[1].addShape3D(0, 24, 12, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 0, 0), new Coord2D(12, 0, 8, 0), new Coord2D(12, 12, 8, 12), new Coord2D(4, 24, 0, 12) }), 24, 24, 12, 58, 24, ModelRendererTurbo.MR_BACK, new float[] { 24, 14, 12, 8 });

		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[2].flip = true;
		bodyModel[2].addBox(-12, 24, -12, 16, 24, 24);
		
		bodyModel[3] = new ModelRendererTurbo(this, 0, 48, textureX, textureY);
		bodyModel[3].flip = true;
		bodyModel[3].addShape3D(0, 24, 12, new Shape2D(new Coord2D[] { new Coord2D(4, 0), new Coord2D(12, 0), new Coord2D(12, 12), new Coord2D(4, 24) }), 24, 24, 12, 66, 24, ModelRendererTurbo.MR_BACK, new float[] { 8, 12, 14, 24 });

		//Left Arm
		leftArmModel = new ModelRendererTurbo[1];
		
		leftArmModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		leftArmModel[0].addBox(-4, -20, -4, 8, 20, 8);
		leftArmModel[0].setPosition(0, 0, 0);
		
		
		//Right Arm
		rightArmModel = new ModelRendererTurbo[1];
		
		rightArmModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		rightArmModel[0].addBox(-4, -20, -4, 8, 20, 8);
		rightArmModel[0].setPosition(0, 40, -16);
		
		//Hips
		hipsModel = new ModelRendererTurbo[1];
		
		hipsModel[0] = new ModelRendererTurbo(this, 0, 84, textureX, textureY);
		hipsModel[0].addBox(-10, 16, -10, 20, 8, 20);
		
		//Left Leg
		leftLegModel = new ModelRendererTurbo[1];
		
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 112, textureX, textureY);
		leftLegModel[0].addBox(-4, -16, -4, 8, 20, 8);
		leftLegModel[0].setPosition(0, 16, -5);
		
		//Right Leg
		rightLegModel = new ModelRendererTurbo[1];
		
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 112, textureX, textureY);
		rightLegModel[0].addBox(-4, -16, -4, 8, 20, 8);
		rightLegModel[0].setPosition(0, 16, 5);
	}
}