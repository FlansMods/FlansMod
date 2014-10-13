package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelRocketPack extends ModelMechaTool 
{
	public ModelRocketPack()
	{
		int textureX = 2;
		int textureY = 2;
		
		baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		baseModel[0].addBox(-8, -10, -8, 8, 20, 16);
	}
}