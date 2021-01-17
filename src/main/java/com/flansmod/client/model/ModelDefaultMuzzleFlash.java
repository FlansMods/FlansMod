package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelDefaultMuzzleFlash extends ModelMuzzleFlash
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "skins/muzzleflash.png");
	
	public ModelDefaultMuzzleFlash()
	{
		mfModel = new ModelRendererTurbo[3];
		
		mfModel[0] = new ModelRendererTurbo(this, 0, 0, 16, 16);
		mfModel[1] = new ModelRendererTurbo(this, 0, 0, 16, 16);
		
		mfModel[2] = new ModelRendererTurbo(this, 0, 8, 16, 16);
		
		mfModel[0].addBox(0f, -2f, -2f, 0, 4, 4);
		mfModel[1].addBox(0f, 0f, -2f, 4, 0, 4);
		mfModel[2].addBox(0f, -2f, 0f, 4, 4, 0);
	}

	@Override
	public void renderMuzzleFlash(float f5)
	{
		for(ModelRendererTurbo mr : mfModel)
		{
			mr.render(f5);
		}
	}
	
	@Override
	public ResourceLocation GetTexture()
	{
		return texture;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo mfModel[];
}