package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSurgicalAxe extends ModelGun 
{
	public ModelSurgicalAxe()
	{
		int textureX = 16;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[4];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, -6F, -1F, 2, 6, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 8, 0, textureX, textureY);
		gunModel[1].addBox(-1F, 0F, -0.5F, 2, 6, 1);

		gunModel[2] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[2].addShapeBox(1F, 2F, -0.5F, 4, 4, 1, 0F, /* 0 */ 0F, -3F, 0F, /* 1 */ 0F, 0F, -0.5F, /* 2 */ 0F, 0F, -0.5F, /* 3 */ 0F, -3F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, -0.5F, /* 6 */ 0F, 0F, -0.5F, /* 7 */ 0F, 0F, 0F);	

		gunModel[3] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		gunModel[3].addShapeBox(-4F, 4F, -0.5F, 3, 2, 1, 0F, /* 0 */ 0F, 0F, -0.5F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, -0.5F, /* 4 */ 0F, 0F, -0.5F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, -0.5F);	

		for(int i = 0; i < 4; i++)
			gunModel[i].setRotationPoint(0F, 6F, 0F);
		
		thirdPersonOffset = new Vector3f(0F / 16F, -0F / 16F, 0F);
	}
}
