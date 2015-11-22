package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCombatKnife extends ModelGun 
{
	public ModelCombatKnife()
	{
		int textureX = 16;
		int textureY = 8;
		
		gunModel = new ModelRendererTurbo[3];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-4F, -1F, -0.7F, 3, 2, 1.4F);
		
		gunModel[1] = new ModelRendererTurbo(this, 10, 0, textureX, textureY);
		gunModel[1].addBox(-1F, -1.5F, -1F, 1, 3, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		gunModel[2].addShapeBox(0F, -1F, -0.5F, 5, 2, 1, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ -1F, 0F, 0F, /* 2 */ -1F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		for(int i = 0; i < 3; i++)
			gunModel[i].setRotationPoint(4F, 0F, 0F);
		
	}
}
