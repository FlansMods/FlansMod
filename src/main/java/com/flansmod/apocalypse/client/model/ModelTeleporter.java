package com.flansmod.apocalypse.client.model;

import net.minecraft.client.model.ModelBase;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTeleporter extends ModelBase
{
	private ModelRendererTurbo model;
	
	public ModelTeleporter()
	{
		int textureX = 64, textureY = 64;
		
		model = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		model.addSphere(0, 0, 0, 16, 16, 16, 64, 64);
	}
	
	public void render(float f)
	{
		model.render(f);
	}
}
