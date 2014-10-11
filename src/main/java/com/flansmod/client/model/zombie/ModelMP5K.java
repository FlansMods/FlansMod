package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMP5K extends ModelGun 
{
	public ModelMP5K()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[6];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-0.5F, 4F, -0.75F, 9, 1, 1.5F);

		gunModel[1] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		gunModel[1].addBox(-0.5F, 3F, -1F, 9, 1, 2);

		gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[2].addBox(-0.5F, 2F, -1F, 6, 1, 2);

		gunModel[3] = new ModelRendererTurbo(this, 26, 0, textureX, textureY);
		gunModel[3].addBox(8.5F, 3F, -0.5F, 1, 1, 1);
		
		gunModel[5] = new ModelRendererTurbo(this, 26, 0, textureX, textureY);
		gunModel[5].addBox(7F, 5F, -0.5F, 1, 1, 1);

		gunModel[4] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		gunModel[4].addBox(-0.75F, -3F, -0.75F, 1.5F, 4, 1.5F);
		gunModel[4].setRotationPoint(1F, 2F, 0F);
		gunModel[4].rotateAngleZ = -0.5F;
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 8, 9, textureX, textureY);
		ammoModel[0].addShapeBox(3F, -1F, -0.5F, 2, 4, 1, 0F, /* 0 */ -1F, 0F, 0F, /* 1 */ 0.8F, -0.2F, 0F, /* 2 */ 0.8F, -0.2F, 0F, /* 3 */ -1F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		
		//ammoModel[1] = new ModelRendererTurbo(this, 12, 9, textureX, textureY);
		//ammoModel[1].addShapeBox(3.5F, -3F, -0.5F, 1, 3, 1, 0F, /* 0 */ -2.5F, -1F, 0F, /* 1 */ 2F, -1.5F, 0F, /* 2 */ 2F, -1.5F, 0F, /* 3 */ -2.5F, -1F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 0.8F, 0.2F, 0F, /* 6 */ 0.8F, 0.2F, 0F, /* 7 */ -1F, 0F, 0F);

		//Stock
		stockAttachPoint = new Vector3f(-1F / 16F, 3.5F / 16F, 0F);
		
		defaultGripModel = new ModelRendererTurbo[1];
		
		defaultGripModel[0] = new ModelRendererTurbo(this, 21, 9, textureX, textureY);
		defaultGripModel[0].addBox(7F, 1F, -0.5F, 1, 2, 1);
		
		//Barrel
		barrelAttachPoint = new Vector3f(9F / 16F, 3.5F / 16F, 0F);
		
		//Scope
		scopeAttachPoint = new Vector3f(2F / 16F, 5F / 16F, 0F);
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.PISTOL_CLIP;
	}
}
