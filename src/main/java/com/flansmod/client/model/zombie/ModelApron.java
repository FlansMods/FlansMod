package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelApron extends ModelCustomArmour 
{
	public ModelApron()
	{
		int textureX = 64;
		int textureY = 32;
		
		bodyModel = new ModelRendererTurbo[1];
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(-5F, 0F, -3F, 10, 12, 6);
		
		skirtFrontModel = new ModelRendererTurbo[1];
		
		skirtFrontModel[0] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
		skirtFrontModel[0].addBox(-5F, 0F, -3F, 10, 12, 6);
	}
}
