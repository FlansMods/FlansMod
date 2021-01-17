package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public abstract class ModelMuzzleFlash extends ModelBase
{
		public ModelMuzzleFlash()
		{
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
		{
			renderMuzzleFlash(f5);
		}
		
		public abstract ResourceLocation GetTexture();

		public abstract void renderMuzzleFlash(float f5);
		
		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
		{
		}
	}
