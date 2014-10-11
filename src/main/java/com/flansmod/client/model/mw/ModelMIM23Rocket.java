package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMIM23Rocket extends ModelBullet 
{
public ModelRendererTurbo[] bulletModel;
	
	public ModelMIM23Rocket()
	{
		int textureX = 256;
		int textureY = 256;
		
		bulletModel = new ModelRendererTurbo[4];
		
		bulletModel = new ModelRendererTurbo[4];
		
		bulletModel[0] = new ModelRendererTurbo(this, 72, 212, textureX, textureY);
		bulletModel[0].addBox(-20F, -3F, -3F, 40, 6, 6);
		
		bulletModel[1] = new ModelRendererTurbo(this, 72, 226, textureX, textureY);
		bulletModel[1].addTrapezoid(20F, -3F, -3F, 8, 6, 6, 0F, -3F, ModelRendererTurbo.MR_LEFT);
		
		bulletModel[2] = new ModelRendererTurbo(this, 102, 226, textureX, textureY);
		bulletModel[2].addShapeBox(-20F, -7F, 0F, 20, 14, 0, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -4F, 0F, /* 2 */ 0F, -4F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, -4F, 0F, /* 6 */ 0F, -4F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		bulletModel[3] = new ModelRendererTurbo(this, 88, 242, textureX, textureY);
		bulletModel[3].addShapeBox(-20F, 0F, -7F, 20, 0, 14, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, -4F, /* 2 */ 0F, 0F, -4F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, -4F, /* 6 */ 0F, 0F, -4F, /* 7 */ 0F, 0F, 0F);	

		for(int i = 0; i < 4; i++)
			bulletModel[i].rotateAngleZ = (float)Math.PI / 2F;
		
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		//GL11.glScalef(0.5F, 0.5F, 0.5F);
		for(ModelRendererTurbo mrt : bulletModel)
			mrt.render(f5);
	}
}
