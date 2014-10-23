package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSuperHeavyHelmet extends ModelCustomArmour 
{
	public ModelSuperHeavyHelmet()
	{
		int textureX = 128;
		int textureY = 64;
		
		headModel = new ModelRendererTurbo[10];
		
		headModel[0] = new ModelRendererTurbo(this, 28, 20, textureX, textureY);
		headModel[0].addBox(-4.5F, -9F, -4.5F, 9, 9, 9);
		
		headModel[1] = new ModelRendererTurbo(this, 20, 38, textureX, textureY);
		headModel[1].addBox(-3F, -10F, -3F, 6, 1, 6);
		
		headModel[2] = new ModelRendererTurbo(this, 38, 38, textureX, textureY);
		headModel[2].addBox(-2F, -11F, -2F, 4, 1, 4);
		
		//Side panels
		headModel[3] = new ModelRendererTurbo(this, 20, 45, textureX, textureY);
		headModel[3].addShapeBox(-5.5F, -7F, -4.5F, 1, 7, 9, 0F, /* 0 */ 1F, 0F, 0F, /* 1 */ -1F, 0F, 0F, /* 2 */ -1F, 0F, 1F, /* 3 */ 1F, 0F, 2F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		headModel[4] = new ModelRendererTurbo(this, 40, 45, textureX, textureY);
		headModel[4].addShapeBox(4.5F, -7F, -4.5F, 1, 7, 9, 0F, /* 0 */ -1F, 0F, 0F, /* 1 */ 1F, 0F, 0F, /* 2 */ 1F, 0F, 2F, /* 3 */ -1F, 0F, 1F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 1F, /* 7 */ 0F, 0F, 0F);	
		
		headModel[5] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
		headModel[5].addShapeBox(-4.5F, -7F, 4.5F, 9, 7, 1, 0F, /* 0 */ 1F, 0F, -1F, /* 1 */ 1F, 0F, -1F, /* 2 */ 2F, 0F, 1F, /* 3 */ 2F, 0F, 1F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 1F, 0F, 0F, /* 7 */ 1F, 0F, 0F);	

		//Faceplate
		headModel[6] = new ModelRendererTurbo(this, 64, 8, textureX, textureY);
		headModel[6].addShapeBox(-4F, -7F, -5.5F, 8, 7, 1, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 1F, 0F, 0F, /* 3 */ 1F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 1F, 0F, 0F, /* 7 */ 1F, 0F, 0F);	

		headModel[7] = new ModelRendererTurbo(this, 65, 17, textureX, textureY);
		headModel[7].addBox(-3F, 0F, -5.5F, 6, 1, 1);
		
		headModel[8] = new ModelRendererTurbo(this, 66, 19, textureX, textureY);
		headModel[8].addBox(-2F, 1F, -5.5F, 4, 1, 1);
		
		headModel[9] = new ModelRendererTurbo(this, 65, 17, textureX, textureY);
		headModel[9].addBox(-3F, -8F, -5.5F, 6, 1, 1);

	}
}
