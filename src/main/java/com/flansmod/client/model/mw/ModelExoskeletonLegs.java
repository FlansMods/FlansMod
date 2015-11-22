package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelExoskeletonLegs extends ModelCustomArmour 
{
	public ModelExoskeletonLegs()
	{
		int textureX = 512;
		int textureY = 512;
		
		rightLegModel = new ModelRendererTurbo[19];
		
		rightLegModel[0] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 63
		rightLegModel[1] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 64
		rightLegModel[2] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 65
		rightLegModel[3] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 66
		rightLegModel[4] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 67
		rightLegModel[5] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 68
		rightLegModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 69
		rightLegModel[7] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 71
		rightLegModel[8] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 81
		rightLegModel[9] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 83
		rightLegModel[10] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 90
		rightLegModel[11] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 91
		rightLegModel[12] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 94
		rightLegModel[13] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 96
		rightLegModel[14] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 98
		//leftLegModel[15] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 100
		//leftLegModel[16] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 102
		//leftLegModel[17] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 104
		rightLegModel[15] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 108
		rightLegModel[16] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 112
		rightLegModel[17] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 113
		rightLegModel[18] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 117
		
		float x = 8.5F;
		float y = 24F;
		float z = 1F;
	
		rightLegModel[0].addBox(-20F + x, -25F + y, -7F, 3, 20, 4, 0F); // Box 63
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[1].addBox(-20F + x, -25F + y, 2F, 3, 20, 4, 0F); // Box 64
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[2].addBox(-20F + x, 0F + y, -7F, 3, 18, 4, 0F); // Box 65
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[3].addBox(-20F + x, 0F + y, 2F, 3, 16, 4, 0F); // Box 66
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[4].addBox(-21F + x, -5F + y, 1.5F, 5, 5, 5, 0F); // Box 67
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[5].addBox(-21F + x, -5F + y, -7.5F, 5, 5, 5, 0F); // Box 68
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[6].addBox(-20F + x, -3F + y, -3F, 3, 1, 5, 0F); // Box 69
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[7].addBox(-11F + x, -11F + y, 8F, 3, 14, 3, 0F); // Box 71
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[8].addBox(-8F + x, -10F + y, 8F, 3, 12, 2, 0F); // Box 81
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[9].addBox(-14F + x, -10F + y, 8F, 3, 12, 2, 0F); // Box 83
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[10].addBox(-15F + x, -9F + y, -10F, 6, 12, 2, 0F); // Box 90
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[11].addBox(-8F + x, -9F + y, -10F, 6, 12, 2, 0F); // Box 91
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[12].addBox(-11F + x, -12F + y, -11F, 5, 20, 3, 0F); // Box 94
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[13].addBox(-11F + x, -6F + y, -11F, 5, 8, 3, 0F); // Box 96
		rightLegModel[13].setRotationPoint(0F, 0F, -1F);
	
		rightLegModel[14].addBox(-20F + x, -21F + y, -3F, 3, 1, 5, 0F); // Box 98
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[15].addBox(-10F + x, -27F + y, -9F, 3, 15, 3, 0F); // Box 108
		rightLegModel[15].setRotationPoint(0F, 0F, 0F);
	
		rightLegModel[16].addBox(-17.5F + x, -27F + y, -8F, 17, 3, 19, 0F); // Box 112
		rightLegModel[16].setRotationPoint(0F, 0F, -1F);
	
		rightLegModel[17].addBox(-20F + x, -5F + y, 6F, 6, 3, 2, 0F); // Box 113
		rightLegModel[17].setRotationPoint(0F, 0F, 2F);
	
		rightLegModel[18].addBox(-20F + x, -5F + y, 4F, 3, 3, 2, 0F); // Box 117
		rightLegModel[18].setRotationPoint(0F, 0F, 2F);
	
	
		leftLegModel = new ModelRendererTurbo[19];
		
		leftLegModel[0] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 72
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 73
		leftLegModel[2] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 74
		leftLegModel[3] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 75
		leftLegModel[4] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 76
		leftLegModel[5] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 77
		leftLegModel[6] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 78
		leftLegModel[7] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 79
		leftLegModel[8] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 80
		leftLegModel[9] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 82
		leftLegModel[10] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 84
		leftLegModel[11] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 92
		leftLegModel[12] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 93
		leftLegModel[13] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 95
		leftLegModel[14] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 97
		leftLegModel[15] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 99
		//leftLegModel[16] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 101
		//leftLegModel[17] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 103
		//leftLegModel[18] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 105
		leftLegModel[16] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 109
		leftLegModel[17] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 111
		leftLegModel[18] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 118
	
		leftLegModel[0].addBox(8F - x, -11F + y, 8F, 3, 14, 3, 0F); // Box 72
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[1].addBox(17F - x, -3F + y, -3F, 3, 1, 5, 0F); // Box 73
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[2].addBox(16F - x, -5F + y, 1.5F, 5, 5, 5, 0F); // Box 74
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[3].addBox(17F - x, -25F + y, 2F, 3, 20, 4, 0F); // Box 75
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[4].addBox(17F - x, -25F + y, -7F, 3, 20, 4, 0F); // Box 76
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[5].addBox(16F - x, -5F + y, -7.5F, 5, 5, 5, 0F); // Box 77
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[6].addBox(17F - x, 0F + y, -7F, 3, 18, 4, 0F); // Box 78
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[7].addBox(17F - x, 0F + y, 2F, 3, 16, 4, 0F); // Box 79
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[8].addBox(5F - x, -10F + y, 8F, 3, 12, 2, 0F); // Box 80
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[9].addBox(11F - x, -10F + y, 8F, 3, 12, 2, 0F); // Box 82
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[10].addBox(14F - x, -5F + y, 6F, 6, 3, 2, 0F); // Box 84
		leftLegModel[10].setRotationPoint(0F, 0F, 2F);
	
		leftLegModel[11].addBox(9F - x, -9F + y, -10F, 6, 12, 2, 0F); // Box 92
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[12].addBox(2F - x, -9F + y, -10F, 6, 12, 2, 0F); // Box 93
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[13].addBox(6F - x, -12F + y, -11F, 5, 20, 3, 0F); // Box 95
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[14].addBox(6F - x, -6F + y, -11F, 5, 8, 3, 0F); // Box 97
		leftLegModel[14].setRotationPoint(0F, 0F, -1F);
	
		leftLegModel[15].addBox(17F - x, -21F + y, -3F, 3, 1, 5, 0F); // Box 99
		leftLegModel[15].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[16].addBox(7F - x, -27F + y, -9F, 3, 15, 3, 0F); // Box 109
		leftLegModel[16].setRotationPoint(0F, 0F, 0F);
	
		leftLegModel[17].addBox(-0.5F - x, -27F + y, -8F, 17, 3, 19, 0F); // Box 111
		leftLegModel[17].setRotationPoint(0F, 0F, -1F);
	
		leftLegModel[18].addBox(17F - x, -5F + y, 4F, 3, 3, 2, 0F); // Box 118
		leftLegModel[18].setRotationPoint(0F, 0F, 2F);
	}
}
