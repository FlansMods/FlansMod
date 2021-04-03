package com.flansmod.modernweapons.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRocket extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelRocket()
	{
		rocketModel = new ModelRendererTurbo[3];
		rocketModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		rocketModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import 
		rocketModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import 

		rocketModel[0].addBox(-0.5F, -10F, -0.5F, 1, 20, 1, 0F); // Import 
		rocketModel[0].setRotationPoint(0F, -2F, 0F);

		rocketModel[1].addBox(-1F, -10F, 0F, 4, 1, 0, 0F); // Import 
		rocketModel[1].setRotationPoint(-1F, 0F, 0F);

		rocketModel[2].addBox(0F, -10F, -1F, 0, 1, 4, 0F); // Import 
		rocketModel[2].setRotationPoint(0F, 0F, -1F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 3; i++)
		{
			rocketModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo rocketModel[];
}