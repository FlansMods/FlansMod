package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSuperHeavyHelmet extends ModelCustomArmour 
{
	public ModelSuperHeavyHelmet()
	{
		int textureX = 64;
		int textureY = 64;
		
		headModel = new ModelRendererTurbo[7];
		
		headModel[0] = new ModelRendererTurbo(this, 28, 20, textureX, textureY);
		headModel[0].addBox(-4.5F, -9F, -4.5F, 9, 9, 9);
		
		headModel[1] = new ModelRendererTurbo(this, 20, 38, textureX, textureY);
		headModel[1].addBox(-3F, -10F, -3F, 6, 1, 6);
		
		headModel[2] = new ModelRendererTurbo(this, 38, 38, textureX, textureY);
		headModel[2].addBox(-2F, -11F, -2F, 4, 1, 4);
		
		//Side panels
		headModel[3] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		headModel[3].addShapeBox(-5.5F, -7F, -4.5F, 1, 7, 9, 0F, /* 0 */ 1F, 0F, 0F, /* 1 */ -1F, 0F, 0F, /* 2 */ -1F, 0F, 1F, /* 3 */ 1F, 0F, 2F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 1F);	
		
		headModel[4] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		headModel[4].addShapeBox(4.5F, -7F, -4.5F, 1, 7, 9, 0F, /* 0 */ -1F, 0F, 0F, /* 1 */ 1F, 0F, 0F, /* 2 */ 1F, 0F, 2F, /* 3 */ -1F, 0F, 1F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 1F, /* 7 */ 0F, 0F, 0F);	
		
		headModel[5] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		headModel[5].addShapeBox(-4.5F, -7F, 4.5F, 9, 7, 1, 0F, /* 0 */ 1F, 0F, -1F, /* 1 */ 1F, 0F, -1F, /* 2 */ 2F, 0F, 1F, /* 3 */ 2F, 0F, 1F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 1F, 0F, 0F, /* 7 */ 1F, 0F, 0F);	

		//Faceplate
		headModel[6] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		headModel[6].addBox(-3F, -8F, -5.5F, 6, 7, 1);
	}
}
