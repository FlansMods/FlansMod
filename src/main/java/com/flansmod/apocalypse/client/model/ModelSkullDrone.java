//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.apocalypse.client.model;

import com.flansmod.client.model.ModelItemHolder;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.client.model.ModelBase;

public class ModelSkullDrone extends ModelBase
{
	int textureX = 64;
	int textureY = 32;
	
	private ModelRendererTurbo[] baseModel, propellerModel; 
	public Vector3f itemOrigin = new Vector3f(0f, -0.5f, 0f);
	public int numPropellers = 4;
	public Vector3f[] propellerOrigins = new Vector3f[] {
			new Vector3f(1.1f, 0.55f, 1.1f),
			new Vector3f(1.1f, 0.55f, -1.1f),
			new Vector3f(-1.1f, 0.55f, -1.1f),
			new Vector3f(-1.1f, 0.55f, 1.1f)
	};

	public ModelSkullDrone()
	{
		baseModel = new ModelRendererTurbo[6];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Head
		baseModel[1] = new ModelRendererTurbo(this, 32, 0, textureX, textureY); // Jaw
		baseModel[2] = new ModelRendererTurbo(this, 56, 0, textureX, textureY); // Arm 1
		baseModel[3] = new ModelRendererTurbo(this, 56, 0, textureX, textureY); // Arm 2
		baseModel[4] = new ModelRendererTurbo(this, 56, 0, textureX, textureY); // Arm 3
		baseModel[5] = new ModelRendererTurbo(this, 56, 0, textureX, textureY); // Arm 4

		baseModel[0].addBox(-4, 0, -4, 8, 8, 8); // Head
		baseModel[1].addBox(-3, -4, -3, 6, 4, 6); // Jaw

		for(int i = 0; i < 4; i++)
		{
			baseModel[i + 2].addBox(-1F, 0F, -1F, 2, 24, 2, 0F); // Arm 1
			baseModel[i + 2].setRotationPoint(propellerOrigins[i].x * 4f, 0F, propellerOrigins[i].z * 4f);
			baseModel[i + 2].rotateAngleX = -(float)Math.PI * 0.375f;
			baseModel[i + 2].rotateAngleY = (float)Math.PI * (1.25f + i * 0.5f);
		}
		
		propellerModel = new ModelRendererTurbo[2];
		propellerModel[0] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 1
		propellerModel[1] = new ModelRendererTurbo(this, 0, 18, textureX, textureY); // Box 2
		
		propellerModel[0].addBox(-6F, -0.5F, -0.5F, 12, 1, 1, 0F); // Box 1
		propellerModel[1].addBox(-0.5F, -0.5F, -6F, 1, 1, 12, 0F); // Box 2
	}
	
	public void renderBase(float scale)
	{
		for(ModelRendererTurbo mr : baseModel)
			mr.render(scale);
	}
	
	public void renderPropeller(float scale)
	{
		for(ModelRendererTurbo mr : propellerModel)
			mr.render(scale);
	}
}
