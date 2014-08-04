package com.flansmod.client.model.ww2;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMosinSniper extends ModelMosin 
{
	public ModelMosinSniper()
	{
		super();
		
		int textureX = 64;
		int textureY = 16;
		
		//Scope
		defaultScopeModel = new ModelRendererTurbo[2];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 24, 7, textureX, textureY);
		defaultScopeModel[0].addBox(1.5F, 5F, -0.5F, 1, 1, 1);
		
		defaultScopeModel[1] = new ModelRendererTurbo(this, 29, 7, textureX, textureY);
		defaultScopeModel[1].addBox(-1F, 6F, -0.5F, 4, 1, 1);
	}
}
