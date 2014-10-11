package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelL96 extends ModelGun 
{
	public ModelL96()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[3];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-0.75F, 1.5F, -0.5F, 20, 1, 1);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY);
		gunModel[1].addBox(-1F, 0F, -1F, 13, 2, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[2].addBox(10F, -1F, -1F, 4, 1, 2);
		
		//Scope
		defaultScopeModel = new ModelRendererTurbo[4];
		
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 31, 3, textureX, textureY);
		defaultScopeModel[0].addBox(-2F, 4.5F, -0.5F, 6, 1, 1);
		
		defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
		defaultScopeModel[1].addTrapezoid(4F, 4F, -1F, 4, 2, 2, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT);
		
		defaultScopeModel[2] = new ModelRendererTurbo(this, 8, 13, textureX, textureY);
		defaultScopeModel[2].addBox(1F, 2.5F, -0.5F, 1, 2, 1);
		
		defaultScopeModel[3] = new ModelRendererTurbo(this, 12, 13, textureX, textureY);
		defaultScopeModel[3].addBox(3F, 2.5F, -0.5F, 1, 2, 1);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(17F / 16F, 4.5F / 16F, 0F);
		
		//Stock
		defaultStockModel = new ModelRendererTurbo[5];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 27, 10, textureX, textureY);
		defaultStockModel[0].addBox(-2F, -2F, -1F, 1, 4, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 34, 13, textureX, textureY);
		defaultStockModel[1].addBox(-5F, -2F, -1F, 3, 1, 2);
		
		defaultStockModel[2] = new ModelRendererTurbo(this, 34, 10, textureX, textureY);
		defaultStockModel[2].addBox(-4F, 1F, -1F, 2, 1, 2);
		
		defaultStockModel[3] = new ModelRendererTurbo(this, 30, 5, textureX, textureY);
		defaultStockModel[3].addBox(-7F, -1F, -1F, 3, 3, 2);
		
		defaultStockModel[4] = new ModelRendererTurbo(this, 18, 10, textureX, textureY);
		defaultStockModel[4].addBox(-9F, -2F, -1F, 2, 4, 2);
		
		stockAttachPoint = new Vector3f(-1F / 16F, 1F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 41, 7, textureX, textureY);
		ammoModel[0].addShapeBox(3F, -2F, -1F, 3, 2, 2, 0F, /* 0 */ 0F, 1F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 1F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		translateAll(0, 2.5F, 0);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

	}
}
