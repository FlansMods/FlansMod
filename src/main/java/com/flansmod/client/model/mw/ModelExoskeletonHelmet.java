package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelExoskeletonHelmet extends ModelCustomArmour 
{
	public ModelExoskeletonHelmet()
	{
		int textureX = 512;
		int textureY = 512;
		
		headModel = new ModelRendererTurbo[10];
		
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		headModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 7
		headModel[3] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 8
		headModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 9
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		headModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 12
		headModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		headModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 15
		
		float y = 64F;

		headModel[0].addShapeBox(-15F, -106F + y, -15.9F, 30, 2, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-17F, -104F + y, -16.9F, 34, 2, 34, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F); // Box 6
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-18F, -102F + y, -18F, 36, 3, 37, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F,1F, 0F, 1F); // Box 7
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-19F, -99F + y, -15F, 38, 4, 35, 0F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 8
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-19F, -95F + y, -9F, 38, 6, 30, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 9
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-18F, -89F + y, -9F, 2, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 10
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(17F, -89F + y, -9F, 2, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-18F, -74F + y, -12F, 37, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 12
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(16F, -90F + y, 5F, 4, 7, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 14
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-20F, -90F + y, 5F, 4, 7, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 15
		headModel[9].setRotationPoint(0F, 0F, 0F);
		
	}
}
