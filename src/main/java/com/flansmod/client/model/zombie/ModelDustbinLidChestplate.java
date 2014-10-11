package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDustbinLidChestplate extends ModelCustomArmour 
{
	public ModelDustbinLidChestplate()
	{
		int textureX = 32;
		int textureY = 64;
		
		bodyModel = new ModelRendererTurbo[9];
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(-4F, 0F, -3F, 8, 12, 1);
		
		bodyModel[1] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		bodyModel[1].addBox(-6F, 2F, -3F, 2, 8, 1);

		bodyModel[2] = new ModelRendererTurbo(this, 6, 13, textureX, textureY);
		bodyModel[2].addBox(4F, 2F, -3F, 2, 8, 1);
		
		bodyModel[3] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		bodyModel[3].addBox(-4F, 2F, -4F, 8, 8, 1);

		//Handle
		bodyModel[4] = new ModelRendererTurbo(this, 0, 31, textureX, textureY);
		bodyModel[4].addBox(-2F, 5.5F, -6F, 4, 1, 1);
		
		bodyModel[5] = new ModelRendererTurbo(this, 10, 31, textureX, textureY);
		bodyModel[5].addBox(-2F, 5.5F, -5F, 1, 1, 1);
		
		bodyModel[6] = new ModelRendererTurbo(this, 14, 31, textureX, textureY);
		bodyModel[6].addBox(1F, 5.5F, -5F, 1, 1, 1);
		
		//Straps
		bodyModel[7] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[7].addBox(-4F, -0.5F, -2.5F, 1, 13, 5);

		bodyModel[8] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[8].addBox(3F, -0.5F, -2.5F, 1, 13, 5);
	}
}
