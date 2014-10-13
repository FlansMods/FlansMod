package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelRocketPack extends ModelMechaTool 
{
	public ModelRocketPack()
	{
		int textureX = 32;
		int textureY = 32;
		
		baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[0].addBox(-10, -30, -60, 15, 45, 90);
	}
}