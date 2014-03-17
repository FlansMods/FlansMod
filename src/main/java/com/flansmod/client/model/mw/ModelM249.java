package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM249 extends ModelGun 
{
	public ModelM249()
	{
		int textureX = 64;
		int textureY = 32;
		
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
		gunModel[1] = new ModelRendererTurbo(this,  0,  9, textureX, textureY); // slidemain2
		gunModel[2] = new ModelRendererTurbo(this,  0,  14, textureX, textureY); // slidemain3
		gunModel[3] = new ModelRendererTurbo(this,  0,  17, textureX, textureY); // slidemain4

		gunModel[8] = new ModelRendererTurbo(this,  4,  27, textureX, textureY); // slidemain5
		gunModel[9] = new ModelRendererTurbo(this,  4,  25, textureX, textureY); // slidemain6
		gunModel[10] = new ModelRendererTurbo(this,  4,  23, textureX, textureY); // slidemain5
		gunModel[11] = new ModelRendererTurbo(this,  12,  24, textureX, textureY); // slideblock1
		gunModel[12] = new ModelRendererTurbo(this,  0,  7, textureX, textureY); // trigger1
		gunModel[13] = new ModelRendererTurbo(this,  6,  6, textureX, textureY); // trigger2
		gunModel[14] = new ModelRendererTurbo(this,  12,  22, textureX, textureY); // Chamber1
		gunModel[4] = new ModelRendererTurbo(this,  22,  18, textureX, textureY); // slidewhatever
		gunModel[5] = new ModelRendererTurbo(this,  10,  7, textureX, textureY); // slideblock2
		gunModel[6] = new ModelRendererTurbo(this,  20,  14, textureX, textureY); // slideblock3
		gunModel[7] = new ModelRendererTurbo(this,  20,  16, textureX, textureY); // slideblock4

		gunModel[0].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // barrel1
		gunModel[0].setRotationPoint(6F, 3.8F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // slidemain2
		gunModel[1].setRotationPoint(6F, 3F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // slidemain3
		gunModel[2].setRotationPoint(6F, 2.5F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // slidemain4
		gunModel[3].setRotationPoint(4.9F, 4.2F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // slidemain5
		gunModel[8].setRotationPoint(9.2F, 4.3F, -0.2F);

		gunModel[9].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // slidemain6
		gunModel[9].setRotationPoint(9.2F, 4.3F, -0.8F);

		gunModel[10].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // slidemain5
		gunModel[10].setRotationPoint(9.7F, 4.4F, -0.5F);

		gunModel[11].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // slideblock1
		gunModel[11].setRotationPoint(3F, 2.5F, -1F);

		gunModel[12].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // trigger1
		gunModel[12].setRotationPoint(3.5F, 2.2F, -0.5F);

		gunModel[13].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // trigger2
		gunModel[13].setRotationPoint(3.5F, 0.2F, -0.5F);

		gunModel[14].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Chamber1
		gunModel[14].setRotationPoint(5.8F, 3.5F, -1.1F);

		gunModel[4].addBox(0F, 0F, -1F, 2, 2, 1, 0F); // slidewhatever
		gunModel[4].setRotationPoint(6.8F, 2.9F, 1.2F);

		gunModel[5].addBox(0F, -0.6666667F, 0F, 3, 1, 1, 0F); // slideblock2
		gunModel[5].setRotationPoint(5F, 5F, -0.9F);

		gunModel[6].addBox(0F, -0.6666667F, 0F, 3, 1, 1, 0F); // slideblock3
		gunModel[6].setRotationPoint(5F, 5F, -0.1F);

		gunModel[7].addBox(0F, -0.6666667F, 0F, 3, 1, 1, 0F); // slideblock4
		gunModel[7].setRotationPoint(5.1F, 5.1F, -0.5F);	
		
		//Scope
		scopeAttachPoint = new Vector3f(2F / 16F, 3.333F / 16F, 0F);

		//defaultStock
		defaultStockModel = new ModelRendererTurbo[4];
		defaultStockModel[0] = new ModelRendererTurbo(this,  20,  11, textureX, textureY); // defaultstock1
		defaultStockModel[1] = new ModelRendererTurbo(this,  24,  11, textureX, textureY); // defaultstock2
		defaultStockModel[2] = new ModelRendererTurbo(this,  0,  5, textureX, textureY); // defaultstock3
		defaultStockModel[3] = new ModelRendererTurbo(this,  20,  7, textureX, textureY); // defaultstock4

		defaultStockModel[0].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // defaultstock1
		defaultStockModel[0].setRotationPoint(2F, 3.3F, -0.8F);

		defaultStockModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // defaultstock2
		defaultStockModel[1].setRotationPoint(2F, 3.3F, -0.2F);

		defaultStockModel[2].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // defaultstock3
		defaultStockModel[2].setRotationPoint(1F, 4.4F, -0.5F);

		defaultStockModel[3].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // defaultstock4
		defaultStockModel[3].setRotationPoint(0F, 2.4F, -0.5F);	
		
		stockAttachPoint = new Vector3f(1F / 16F, 4F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		//Grip
		gripAttachPoint = new Vector3f(8F / 16F, 0.5F / 16F, 0F);
		
		defaultGripModel = new ModelRendererTurbo[4];
		
		defaultGripModel[0] = new ModelRendererTurbo(this,  0,  20, textureX, textureY); // Foregrip1
		defaultGripModel[1] = new ModelRendererTurbo(this,  0,  24, textureX, textureY); // Foregrip2
		defaultGripModel[2] = new ModelRendererTurbo(this,  0,  29, textureX, textureY); // Foregrip3
		defaultGripModel[3] = new ModelRendererTurbo(this,  4,  29, textureX, textureY); // Foregrip4
		
		defaultGripModel[0].addBox(0F, -1F, 0F, 4, 1, 2, 0F); // Foregrip1
		defaultGripModel[0].setRotationPoint(8.5F, 3F, -1F);

		defaultGripModel[1].addBox(0F, -3F, 0F, 1, 3, 1, 0F); // Foregrip2
		defaultGripModel[1].setRotationPoint(10.5F, 2.5F, -0.5F);
		defaultGripModel[1].rotateAngleZ = -0.3141593F;

		defaultGripModel[2].addBox(0F, -1F, 0F, 1, 1, 1, 0F); // Foregrip3
		defaultGripModel[2].setRotationPoint(10.4F, 3.4F, 0.1F);

		defaultGripModel[3].addBox(0F, -1F, 0F, 1, 1, 1, 0F); // Foregrip4
		defaultGripModel[3].setRotationPoint(10.4F, 3.4F, -1.1F);
		
		//Bolt
		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this,  18,  20, textureX, textureY); // bolt2
		slideModel[1] = new ModelRendererTurbo(this,  22,  21, textureX, textureY); // bolt1

		slideModel[0].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // bolt2
		slideModel[0].setRotationPoint(10.8F, 3.5F, 1.2F);

		slideModel[1].addBox(0F, 0F, -1F, 4, 1, 1, 0F); // bolt1
		slideModel[1].setRotationPoint(7.8F, 3.5F, 1.1F);	
		
		//Ammo
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this,  22,  23, textureX, textureY); // Ammobox1
		ammoModel[1] = new ModelRendererTurbo(this,  12,  19, textureX, textureY); // Ammobox2

		ammoModel[0].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Ammobox1
		ammoModel[0].setRotationPoint(5.8F, 0F, -2.4F);

		ammoModel[1].addBox(0F, 2.5F, -1.5F, 2, 2, 1, 0F); // Ammobox2
		ammoModel[1].setRotationPoint(6.266667F, 0F, -2.5F);
		ammoModel[1].rotateAngleX = 0.6806784F;
		ammoModel[1].rotateAngleY = 0.01745329F;	

		translateAll(-3, -2.2F, 0);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
		
		tiltGunTime = 0.1F;
		unloadClipTime = 0.2F;
		loadClipTime = 0.2F;
		untiltGunTime = 0.5F;

	}
}

