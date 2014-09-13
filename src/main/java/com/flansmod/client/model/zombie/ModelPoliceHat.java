package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPoliceHat extends ModelCustomArmour 
{
	int textureX = 64;
	int textureY = 32;

	public ModelPoliceHat()
	{
		headModel = new ModelRendererTurbo[9];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[1] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		headModel[2] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);
		headModel[3] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		headModel[4] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
		headModel[5] = new ModelRendererTurbo(this, 32, 7, textureX, textureY);
		headModel[6] = new ModelRendererTurbo(this, 31, 3, textureX, textureY);
		headModel[7] = new ModelRendererTurbo(this, 40, 3, textureX, textureY);
		headModel[8] = new ModelRendererTurbo(this, 30, 17, textureX, textureY);

		headModel[0].addBox(-4.5F, -8F, -4.5F, 9, 2, 9, 0F); // Box 0

		headModel[1].addShapeBox(-5.5F, -9F, -0.5F, 11, 1, 5, 0F,0F, 0.5F, -0.5F,0F, 0.5F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, 0F,-0.5F, 0F, 0F); // Box 1

		headModel[2].addShapeBox(-4.5F, -7F, -6.5F, 9, 1, 2, 0F,0F, -0.3F, 0F,0F, -0.3F, 0F,0F, -0.2F, 0F,0F, -0.2F, 0F,0F, -0F, 0F,0F, -0F, 0F,0F, -0F, 0F,0F, -0F, 0F); // Box 2

		headModel[3].addShapeBox(-4.5F, -7F, -7.5F, 9, 1, 1, 0F,-1F, -0.4F, 0F,-1F, -0.4F, 0F,0F, -0.3F, 0F,0F, -0.3F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 3

		headModel[4].addShapeBox(-5.5F, -9F, 4.5F, 11, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F,-1.5F, 0F, -0.5F,-1.5F, 0F, -0.5F); // Box 4

		headModel[5].addShapeBox(-5.5F, -11F, -5F, 11, 3, 5, 0F,0F, 0F, 0.5F,0F, 0F, 0.5F,0F, -1.5F, 0F,0F, -1.5F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F); // Box 5

		headModel[6].addShapeBox(-1F, -10F, -5.5F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, 0F, 0F,0F, 0F, 0F); // Box 6

		headModel[7].addShapeBox(-1F, -8F, -5.5F, 2, 1, 1, 0F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, 0F, 0F,0F, 0F, 0F,-0.25F, 0F, -0.4F,-0.25F, 0F, -0.4F,-0.25F, 0F, 0F,-0.25F, 0F, 0F); // Box 7

		headModel[8].addShapeBox(-5F, -8F, -5F, 10, 1, 5, 0F,-0.4F, -0.6F, -0.4F,-0.4F, -0.6F, -0.4F,-0.4F, -0.6F, -0.4F,-0.4F, -0.6F, -0.4F,-0.4F, 0F, -0.4F,-0.4F, 0F, -0.4F,-0.4F, 0F, -0.4F,-0.4F, 0F, -0.4F); // Box 8
	}
}
