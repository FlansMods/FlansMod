package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSuperHeavyChest extends ModelCustomArmour 
{
	public ModelSuperHeavyChest()
	{
		int textureX = 128;
		int textureY = 64;
		
		bodyModel = new ModelRendererTurbo[6];
		
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(-4.5F, -0.5F, -3F, 9, 13, 6);

		bodyModel[1] = new ModelRendererTurbo(this, 30, 0, textureX, textureY);
		bodyModel[1].addBox(-3F, 2F, -4F, 6, 12, 1);

		bodyModel[2] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);
		bodyModel[2].addBox(-5.5F, 8F, -2F, 1, 3, 4);
		
		bodyModel[3] = new ModelRendererTurbo(this, 10, 19, textureX, textureY);
		bodyModel[3].addBox(4.5F, 8F, -2F, 1, 3, 4);

		//Neckguard
		//bodyModel[4] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		//bodyModel[4].addBox(4.5F, -4F, -2F, 1, 4, 4);
		
		//bodyModel[5] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		//bodyModel[5].addBox(-5.5F, -4F, -2F, 1, 4, 4);

		//bodyModel[6] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		//bodyModel[6].addBox(-4.5F, -4F, 4F, 9, 4, 1);

		//Shoulderpads
		bodyModel[4] = new ModelRendererTurbo(this, 44, 0, textureX, textureY);
		bodyModel[4].addBox(4.5F, -2F, -3F, 4, 4, 6);

		bodyModel[5] = new ModelRendererTurbo(this, 44, 10, textureX, textureY);
		bodyModel[5].addBox(-8.5F, -2F, -3F, 4, 4, 6);
		
		
		
		leftArmModel = new ModelRendererTurbo[2];
		
		leftArmModel[0] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		leftArmModel[0].addBox(-1.25F, -2F, -2.25F, 4.5F, 13, 4.5F);

		leftArmModel[1] = new ModelRendererTurbo(this, 20, 19, textureX, textureY);
		leftArmModel[1].addBox(2.75F, 2F, -1.5F, 1, 4, 3);

		rightArmModel = new ModelRendererTurbo[2];
		
		rightArmModel[0] = new ModelRendererTurbo(this, 0, 44, textureX, textureY);
		rightArmModel[0].addBox(-3.25F, -2F, -2.25F, 4.5F, 13, 4.5F);
		
		rightArmModel[1] = new ModelRendererTurbo(this, 20, 26, textureX, textureY);
		rightArmModel[1].addBox(-3.75F, 2F, -1.5F, 1, 4, 3);

	}
}
