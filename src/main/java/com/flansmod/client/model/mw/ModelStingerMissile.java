package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelStingerMissile extends ModelBullet 
{
	public ModelRendererTurbo[] bulletModel;
	
	public ModelStingerMissile()
	{
		int textureX = 64;
		int textureY = 32;
		
		bulletModel = new ModelRendererTurbo[3];
		
		bulletModel[0] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
		bulletModel[0].addBox(-0.5F, -10F, -0.5F, 1, 20, 1);
		
		bulletModel[1] = new ModelRendererTurbo(this, 55, 0, textureX, textureY);
		bulletModel[1].addBox(-1F, -10F, 0F, 2, 1, 0);
		
		bulletModel[2] = new ModelRendererTurbo(this, 55, 2, textureX, textureY);
		bulletModel[2].addBox(0F, -10F, -1F, 0, 1, 2);
		
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		//GL11.glScalef(0.5F, 0.5F, 0.5F);
		for(ModelRendererTurbo mrt : bulletModel)
			mrt.render(f5);
	}
}
