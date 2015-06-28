package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelExoskeletonBoots extends ModelCustomArmour 
{
	public ModelExoskeletonBoots()
	{
		int textureX = 512;
		int textureY = 512;
		
		rightLegModel = new ModelRendererTurbo[3];
		
		rightLegModel[0] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 100
		rightLegModel[1] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 102
		rightLegModel[2] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 104

		
		float x = 8.5F;
		float y = 24F;
		float z = 1F;
	
	
		rightLegModel[0].addBox(-17F + x, 16F + y, -9F, 17, 8, 18, 0F); // Box 100
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[1].addBox(-17F + x, 19F + y, -10F, 16, 5, 6, 0F); // Box 102
		rightLegModel[1].setRotationPoint(0F, 0F, -5F);
	
		rightLegModel[2].addBox(-17F + x, 11F + y, -10F, 16, 5, 19, 0F); // Box 104
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	
	
		leftLegModel = new ModelRendererTurbo[3];

		leftLegModel[0] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 101
		leftLegModel[1] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 103
		leftLegModel[2] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 105
	

	
		leftLegModel[0].addBox(0F - x, 16F + y, -9F, 17, 8, 18, 0F); // Box 101
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[1].addBox(1F - x, 19F + y, -10F, 16, 5, 6, 0F); // Box 103
		leftLegModel[1].setRotationPoint(0F, 0F, -5F);
	
		leftLegModel[2].addBox(1F - x, 11F + y, -10F, 16, 5, 19, 0F); // Box 105
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	
	}
}
