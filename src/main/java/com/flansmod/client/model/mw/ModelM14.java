package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM14 extends ModelGun 
{
	public ModelM14()
	{
		int textureX = 64;
		int textureY = 32;
		
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this,  12,  0, textureX, textureY); // gun1
		gunModel[1] = new ModelRendererTurbo(this,  0,  6, textureX, textureY); // gun2
		gunModel[2] = new ModelRendererTurbo(this,  0,  9, textureX, textureY); // gun3
		gunModel[3] = new ModelRendererTurbo(this,  0,  14, textureX, textureY); // gun4
		gunModel[4] = new ModelRendererTurbo(this,  0,  16, textureX, textureY); // gun5
		gunModel[5] = new ModelRendererTurbo(this,  0,  18, textureX, textureY); // gun6
		gunModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // gun7
		
		gunModel[8] = new ModelRendererTurbo(this,  6,  16, textureX, textureY); // gun9
		gunModel[9] = new ModelRendererTurbo(this,  20,  24, textureX, textureY); // gun10
		gunModel[7] = new ModelRendererTurbo(this,  22,  21, textureX, textureY); // gun10

		gunModel[0].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // gun1
		gunModel[0].setRotationPoint(0F, -7F, -1F);

		gunModel[1].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // gun2
		gunModel[1].setRotationPoint(0F, -4F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 14, 3, 2, 0F); // gun3
		gunModel[2].setRotationPoint(7F, -3F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // gun4
		gunModel[3].setRotationPoint(20F, -1.5F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // gun5
		gunModel[4].setRotationPoint(21F, -2.8F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // gun6
		gunModel[5].setRotationPoint(-2F, -3F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // gun7
		gunModel[6].setRotationPoint(-2F, -1F, -1F);



		gunModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // gun9
		gunModel[8].setRotationPoint(18.5F, 0F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // gun10
		gunModel[9].setRotationPoint(9F, -3.2F, 0.2F);

		gunModel[7].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // gun10
		gunModel[7].setRotationPoint(9F, -3.2F, -1.2F);		
		
		//Scope
		scopeAttachPoint = new Vector3f(0F / 16F, 6.25F / 16F, 0F);
		
		defaultScopeModel = new ModelRendererTurbo[1];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  30, textureX, textureY); // gun8
		defaultScopeModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // gun8
		defaultScopeModel[0].setRotationPoint(-1.5F, 0F, -0.5F);

		//defaultStock
		defaultStockModel = new ModelRendererTurbo[2];
		defaultStockModel[0] = new ModelRendererTurbo(this,  8,  28, textureX, textureY); // gun2SHAPE
		defaultStockModel[1] = new ModelRendererTurbo(this,  20,  27, textureX, textureY); // gun2SHAPE

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); //Test
		defaultStockModel[0].setRotationPoint(-6F, -3F, -1F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultStockModel[1].setRotationPoint(-11F, -5F, -1F);		
		
		stockAttachPoint = new Vector3f(1F / 16F, 4F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(25F / 16F, 5.25F / 16F, 0F);
		
		//Grip
		gripAttachPoint = new Vector3f(10F / 16F, 3F / 16F, 0F);

		//Bolt
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  0,  22, textureX, textureY); // bolt

		slideModel[0].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // bolt
		slideModel[0].setRotationPoint(2F, -1.1F, -0.5F);	
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  24, textureX, textureY); // Ammo

		ammoModel[0].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Ammo
		ammoModel[0].setRotationPoint(5F, -7F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.06981317F;	

		
		gunSlideDistance = 0.2F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		translateAll(0, 6.25F, 0);
	}
}

