package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAK74 extends ModelGun 
{
	public ModelAK74()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[7];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, 3F, -1F, 9, 1, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		gunModel[1].addShapeBox(-1F, 4F, -1F, 12, 1, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -1F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -1F, 0F, 0F);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[2].addShapeBox(8F, 3F, -1F, 3, 1, 2, 0F, /* 0 */ 0F, 0.25F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0.25F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);

		gunModel[3] = new ModelRendererTurbo(this, 10, 6, textureX, textureY);
		gunModel[3].addBox(-1F, 2F, -1F, 2, 1, 2);
		
		gunModel[4] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
		gunModel[4].addBox(-0.75F, -3F, -0.75F, 1.5F, 4, 1.5F);
		gunModel[4].setRotationPoint(-0.2F, 2F, 0F);
		gunModel[4].rotateAngleZ = -0.5F;
		
		gunModel[5] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		gunModel[5].addBox(11F, 3.75F, -0.25F, 0.5F, 2, 0.5F);

		gunModel[6] = new ModelRendererTurbo(this, 4, 14, textureX, textureY);
		gunModel[6].addBox(11F, 3.25F, -0.25F, 3, 0.5F, 0.5F);

		//Ammo
		ammoModel = new ModelRendererTurbo[2];
		
		ammoModel[0] = new ModelRendererTurbo(this, 12, 12, textureX, textureY);
		ammoModel[0].addShapeBox(4F, 1F, -1F, 2, 2, 2, 0F, /* 0 */ -0.5F, 0.5F, 0F, /* 1 */ 0.5F, 0F, 0F, /* 2 */ 0.5F, 0F, 0F, /* 3 */ -0.5F, 0.5F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		
		ammoModel[1] = new ModelRendererTurbo(this, 20, 12, textureX, textureY);
		ammoModel[1].addShapeBox(4F, -1F, -1F, 2, 2, 2, 0F, /* 0 */ -2F, 0F, 0F, /* 1 */ 1.25F, -1.25F, 0F, /* 2 */ 1.25F, -1.25F, 0F, /* 3 */ -2F, 0F, 0F, /* 4 */ -0.5F, -0.5F, 0F, /* 5 */ 0.5F, 0F, 0F, /* 6 */ 0.5F, 0F, 0F, /* 7 */ -0.5F, -0.5F, 0F);

		//Stock
		stockAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		defaultStockModel = new ModelRendererTurbo[4];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 12, 10, textureX, textureY);
		defaultStockModel[0].addBox(-2F, 3F, -0.5F, 1, 1, 1);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 16, 10, textureX, textureY);
		defaultStockModel[1].addShapeBox(-7F, 1F, -0.5F, 5, 1, 1, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -2F, 0F, /* 2 */ 0F, -2F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -0.5F, 0F, /* 5 */ 0F, 1.5F, 0F, /* 6 */ 0F, 1.5F, 0F, /* 7 */ 0F, -0.5F, 0F);

		defaultStockModel[2] = new ModelRendererTurbo(this, 18, 8, textureX, textureY);
		defaultStockModel[2].addBox(-7F, 3.5F, -0.5F, 5, 0.5F, 1);

		defaultStockModel[3] = new ModelRendererTurbo(this, 28, 12, textureX, textureY);
		defaultStockModel[3].addBox(-8F, 1F, -0.5F, 1, 3, 1);

		//Barrel
		barrelAttachPoint = new Vector3f(11.75F / 16F, 3.5F / 16F, 0F);
		
		defaultBarrelModel = new ModelRendererTurbo[1];
		
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 32, 14, textureX, textureY);
		defaultBarrelModel[0].addBox(11.5F, 3F, -0.5F, 2, 1, 1);
		
		//Scope
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		defaultScopeModel = new ModelRendererTurbo[1];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 38, 14, textureX, textureY);
		defaultScopeModel[0].addBox(4F, 5F, -0.5F, 1, 1, 1);
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
