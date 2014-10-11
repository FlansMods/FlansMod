package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelColtPython extends ModelGun 
{
	public ModelColtPython()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[6];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(-1F, -1F, -0.5F, 2, 3, 1, 0F, /* 0 */ -0.5F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ -0.5F, 0F, 0F, /* 4 */ -0.5F, -1F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -0.5F, -1F, 0F);	
		
		gunModel[1] = new ModelRendererTurbo(this, 6, 0, textureX, textureY);
		gunModel[1].addShapeBox(1F, 1F, -0.5F, 1, 2, 1, 0F, /* 0 */ 0F, 0.5F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0.5F, 0F, /* 4 */ 0F, -1F, 0F, /* 5 */ 0F, 0.5F, 0F, /* 6 */ 0F, 0.5F, 0F, /* 7 */ 0F, -1F, 0F);	

		gunModel[2] = new ModelRendererTurbo(this, 10, 0, textureX, textureY);
		gunModel[2].addBox(2F, 1F, -0.5F, 3, 0.25F, 1);
		
		gunModel[3] = new ModelRendererTurbo(this, 10, 2, textureX, textureY);
		gunModel[3].addBox(2F, 3.25F, -0.5F, 3, 0.25F, 1);

		gunModel[4] = new ModelRendererTurbo(this, 18, 0, textureX, textureY);
		gunModel[4].addBox(5F, 1F, -0.5F, 0.5F, 2.5F, 1);

		gunModel[5] = new ModelRendererTurbo(this, 22, 0, textureX, textureY);
		gunModel[5].addBox(5.5F, 2F, -0.5F, 6, 1.5F, 1);

		revolverBarrelModel = new ModelRendererTurbo[1];
		
		revolverBarrelModel[0] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		revolverBarrelModel[0].addBox(2F, 1.25F, -1F, 3, 2, 2);

		revolverFlipAngle = 30F;
		
		ammoModel = new ModelRendererTurbo[6];
		
		for(int i = 0; i < 6; i++)
		{
			ammoModel[i] = new ModelRendererTurbo(this, 10, 4, textureX, textureY);
			ammoModel[i].addBox(0F, 0.35F, -0.5F, 2, 0.5F, 0.5F);
			ammoModel[i].setRotationPoint(2.5F, 2.25F, 0F);
			ammoModel[i].rotateAngleX = (float)Math.PI / 3F * i;
		}

		barrelAttachPoint = new Vector3f(11F / 16F, 4.5F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(4F / 16F, 5F / 16F, 0F);		
		
		translateAll(0F, 1.5F, 0F);
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.REVOLVER;
	}
}
