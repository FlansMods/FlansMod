package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCoat extends ModelCustomArmour 
{
	public ModelCoat()
	{
		int textureX = 64;
		int textureY = 64;
		
		bodyModel = new ModelRendererTurbo[1];
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(-5F, -0.5F, -3F, 10, 13, 6);
		
		skirtFrontModel = new ModelRendererTurbo[1];
		
		skirtFrontModel[0] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
		skirtFrontModel[0].addBox(-5F, 0F, -3F, 10, 12, 6);
		
		skirtRearModel = new ModelRendererTurbo[1];
		
		skirtRearModel[0] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);
		skirtRearModel[0].addBox(-5F, 0F, -3F, 10, 12, 6);

		leftArmModel = new ModelRendererTurbo[1];
		
		leftArmModel[0] = new ModelRendererTurbo(this, 32, 19, textureX, textureY);
		leftArmModel[0].addBox(-1.5F, -2.5F, -2.5F, 5, 13, 5);

		rightArmModel = new ModelRendererTurbo[1];
		
		rightArmModel[0] = new ModelRendererTurbo(this, 32, 41, textureX, textureY);
		rightArmModel[0].addBox(-3.5F, -2.5F, -2.5F, 5, 13, 5);

	}
}
