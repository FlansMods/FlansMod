package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPanzerfaust extends ModelGun 
{
	public ModelPanzerfaust()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[4];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-10F, 2F, -0.5F, 20, 1, 1);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[1].addBox(7F, 3F, -0.5F, 1, 3, 1);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[2].addTrapezoid(10F, 1F, -1.5F, 3, 3, 3, 0F, -1F, ModelRendererTurbo.MR_RIGHT);
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[3].addTrapezoid(13F, 1F, -1.5F, 1, 3, 3, 0F, -0.5F,  ModelRendererTurbo.MR_LEFT);
	}
}
