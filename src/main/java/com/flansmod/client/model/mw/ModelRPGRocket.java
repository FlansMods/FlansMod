package com.flansmod.client.model.mw;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRPGRocket extends ModelBase 
{
	public ModelRendererTurbo[] bulletModel;

	public ModelRPGRocket()
	{
		int textureX = 64;
		int textureY = 32;
		
		bulletModel = new ModelRendererTurbo[3];
		
		bulletModel[0] = new ModelRendererTurbo(this, 14, 12, textureX, textureY);
		bulletModel[0].addBox(-1.5F, 0F, -1.5F, 3, 1, 3);
		
		bulletModel[1] = new ModelRendererTurbo(this, 26, 9, textureX, textureY);
		bulletModel[1].addTrapezoid(-2F, 1F, -2F, 4, 3, 4, 0F, -1F, ModelRendererTurbo.MR_TOP);
		
		bulletModel[2] = new ModelRendererTurbo(this, 38, 6, textureX, textureY);
		bulletModel[2].addTrapezoid(-2F, 4F, -2F, 4, 3, 4, 0F, -1F, ModelRendererTurbo.MR_BOTTOM);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		for(ModelRendererTurbo mrt : bulletModel)
			mrt.render(f5);
	}
}
