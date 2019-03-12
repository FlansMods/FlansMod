package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBarrett extends ModelGun
{
	public ModelBarrett()
	{
		int textureX = 64;
		int textureY = 32;
		
		gunModel = new ModelRendererTurbo[13];
		
		//Main Barrel
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-4F, 2F, -1F, 16, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 26, 4, textureX, textureY);
		gunModel[1].addBox(12F, 2.5F, -0.5F, 8, 1, 1);
		
		//Trigger Handle
		gunModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[2].addBox(-1F, -2F, -1F, 3, 4, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 32, 20, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 8, 19, textureX, textureY); // Box 1
		gunModel[5] = new ModelRendererTurbo(this, 8, 19, textureX, textureY); // Box 2
		gunModel[6] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 3
		gunModel[7] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 4
		gunModel[8] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 5
		gunModel[9] = new ModelRendererTurbo(this, 44, 16, textureX, textureY); // Box 6
		gunModel[10] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Box 9
		gunModel[11] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 24, 16, textureX, textureY); // Box 15
		
		gunModel[3].addBox(12F, 1F, -1F, 6, 3, 2, 0F); // Box 0
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		
		gunModel[4].addBox(8F, -0.5F, -1.5F, 1, 5, 3, 0F); // Box 1
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		
		gunModel[5].addBox(10F, -0.5F, -1.5F, 1, 5, 3, 0F); // Box 2
		gunModel[5].setRotationPoint(0F, 0F, 0F);
		
		gunModel[6].addBox(12F, 0.5F, -1.5F, 1, 4, 3, 0F); // Box 3
		gunModel[6].setRotationPoint(0F, 0F, 0F);
		
		gunModel[7].addBox(14F, 0.5F, -1.5F, 1, 4, 3, 0F); // Box 4
		gunModel[7].setRotationPoint(0F, 0F, 0F);
		
		gunModel[8].addBox(16F, 0.5F, -1.5F, 1, 4, 3, 0F); // Box 5
		gunModel[8].setRotationPoint(0F, 0F, 0F);
		
		gunModel[9].addShapeBox(6F, 0F, -1F, 6, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 6
		gunModel[9].setRotationPoint(0F, 0F, 0F);
		
		gunModel[10].addBox(6F, 1.5F, -1.5F, 1, 3, 3, 0F); // Box 9
		gunModel[10].setRotationPoint(0F, 0F, 0F);
		
		gunModel[11].addBox(-2F, 1.5F, -1.5F, 1, 3, 3, 0F); // Box 13
		gunModel[11].setRotationPoint(0F, 0F, 0F);
		
		gunModel[12].addBox(-1F, 2.5F, -1.5F, 7, 1, 3, 0F); // Box 15
		gunModel[12].setRotationPoint(0F, 0F, 0F);
		
		
		//Bolt
		slideModel = new ModelRendererTurbo[2];
		
		slideModel[0] = new ModelRendererTurbo(this, 34, 6, textureX, textureY);
		slideModel[0].addTrapezoid(3F, 2.5F, 0.5F, 1, 1, 2, 0F, -0.5F, ModelRendererTurbo.MR_FRONT);
		slideModel[0].doMirror(false, false, true);
		slideModel[1] = new ModelRendererTurbo(this, 34, 6, textureX, textureY);
		slideModel[1].addTrapezoid(3F, 2.5F, 0.5F, 1, 1, 2, 0F, -0.5F, ModelRendererTurbo.MR_FRONT);
		
		//Scope
		defaultScopeModel = new ModelRendererTurbo[4];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		defaultScopeModel[0].addTrapezoid(-1F, 4.25F, -1F, 4, 2, 2, 0F, -0.5F, ModelRendererTurbo.MR_LEFT);
		
		defaultScopeModel[1] = new ModelRendererTurbo(this, 12, 10, textureX, textureY);
		defaultScopeModel[1].addTrapezoid(3F, 4.25F, -1F, 4, 2, 2, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT);
		
		defaultScopeModel[2] = new ModelRendererTurbo(this, 10, 7, textureX, textureY);
		defaultScopeModel[2].addBox(1.5F, 3.5F, -0.5F, 3, 2, 1);
		
		defaultScopeModel[3] = new ModelRendererTurbo(this, 16, 20, textureX, textureY); // Box 16
		defaultScopeModel[3].addBox(0.5F, 3.5F, -1.5F, 5, 3, 3, 0F); // Box 16
		defaultScopeModel[3].setRotationPoint(0F, 0F, 0F);
		
		scopeAttachPoint = new Vector3f(3F / 16F, 6F / 16F, 0F);
		
		//Barrel
		defaultBarrelModel = new ModelRendererTurbo[1];
		
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 18, 4, textureX, textureY);
		defaultBarrelModel[0].addBox(18.5F, 2F, -1F, 2, 2, 2);
		
		barrelAttachPoint = new Vector3f(20F / 16F, 5F / 16F, 0F);
		
		//Stock
		defaultStockModel = new ModelRendererTurbo[1];
		defaultStockModel[0] = new ModelRendererTurbo(this, 36, 9, textureX, textureY);
		defaultStockModel[0].addBox(-8F, 0F, -1F, 4, 3, 2);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 1F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 24, 8, textureX, textureY);
		ammoModel[0].addBox(2.5F, -3F, -1F, 4, 5, 2);
		
		translateAll(0, 1, 0);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
