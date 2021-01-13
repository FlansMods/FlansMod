package com.flansmod.apocalypse.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;

public class ModelSkullBoss extends ModelBase
{
	private ModelRendererTurbo head;
	private ModelRendererTurbo jaw;
	
	public ModelSkullBoss()
	{
		int textureX = 64, textureY = 32;
				
		head = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		head.addBox(-4, 0, -4, 8, 8, 8);
		
		jaw = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
		jaw.addBox(-3, -4, -3, 6, 4, 6);
	}
	
	public void renderHead(float scale)
	{
		head.render(scale);
	}
	
	public void renderJaw(float scale)
	{
		jaw.render(scale);
	}
}