package com.flansmod.apocalypse.client.model;

import net.minecraft.client.model.ModelBase;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelNukeDrop extends ModelBase
{
	private ModelRendererTurbo[] nukeModel;
	private ModelRendererTurbo[] mushroomCloudModel;
	private ModelRendererTurbo[] ballModel;
	
	public ModelNukeDrop()
	{
		int textureX = 64, textureY = 64;
		
		nukeModel = new ModelRendererTurbo[5];
		
		nukeModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		nukeModel[0].addBox(-2, -4, -2, 4, 8, 4);
		
		nukeModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		nukeModel[1].addTrapezoid(-2, -6, -2, 4, 2, 4, 0F, -1F, ModelRendererTurbo.MR_BOTTOM);
		
		nukeModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		nukeModel[2].addTrapezoid(-2, 4, -2, 4, 2, 4, 0F, -1F, ModelRendererTurbo.MR_TOP);
		
		nukeModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		nukeModel[3].addTrapezoid(-2, 6, -2, 4, 2, 4, 0F, -1F, ModelRendererTurbo.MR_BOTTOM);
		
		nukeModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		nukeModel[4].addBox(-2, 8, -2, 4, 2, 4);
		
		ballModel = new ModelRendererTurbo[2];
		
		ballModel[0] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
		ballModel[0].addSphere(0, 0, 0, 16, 16, 16, 32, 32);
		
		ballModel[1] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
		ballModel[1].flip = true;
		ballModel[1].addSphere(0, 0, 0, 16, 16, 16, 32, 32);
	}
	
	public void renderNuke(float scale)
	{
		for(ModelRendererTurbo aNukeModel : nukeModel) aNukeModel.render(scale);
	}
	
	public void renderMushroomCloud(float scale)
	{
		
	}
	
	public void renderBall(float scale)
	{
		for(ModelRendererTurbo aBallModel : ballModel) aBallModel.render(scale);
	}
}
