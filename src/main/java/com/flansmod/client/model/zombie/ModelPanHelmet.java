package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPanHelmet extends ModelCustomArmour 
{
	public ModelPanHelmet()
	{
		int textureX = 64;
		int textureY = 16;
		
		headModel = new ModelRendererTurbo[3];
		
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(-4.5F, -9F, -4.5F, 9, 4, 9);
		
		headModel[1] = new ModelRendererTurbo(this, 2, 2, textureX, textureY);
		headModel[1].addBox(-3.5F, -10F, -3.5F, 7, 1, 7);
		
		headModel[2] = new ModelRendererTurbo(this, 27, 0, textureX, textureY);
		headModel[2].addBox(-9.5F, -7F, -1F, 5, 2, 2);
	}
}
