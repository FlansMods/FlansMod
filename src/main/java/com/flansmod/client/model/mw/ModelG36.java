package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelG36 extends ModelGun 
{
	public ModelG36()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[7];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-1F, 2F, -1F, 15, 2, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addBox(1F, 4F, -1F, 5, 0.5F, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		gunModel[2].addBox(2F, 4.5F, -1F, 9, 0.5F, 2);
		
		gunModel[3] = new ModelRendererTurbo(this, 14, 4, textureX, textureY);
		gunModel[3].addBox(10F, 4F, -1F, 2, 0.5F, 2);
		
		gunModel[4] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
		gunModel[4].addBox(14F, 2.5F, -0.5F, 1, 1, 1);
		
		gunModel[5] = new ModelRendererTurbo(this, 22, 4, textureX, textureY);
		gunModel[5].addBox(1F, 1F, -1F, 6, 1, 2);

		gunModel[6] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		gunModel[6].addBox(-0.5F, -2F, -0.5F, 1, 3, 1);
		gunModel[6].setRotationPoint(2F, 1F, 0F);
		gunModel[6].rotateAngleZ = -0.5F;

		//Scope
		scopeAttachPoint = new Vector3f(4F / 16F, 5F / 16F, 0F);

		//Stock
		defaultStockModel = new ModelRendererTurbo[5];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 4, 10, textureX, textureY);
		defaultStockModel[0].addBox(-7F, 1F, -0.5F, 1, 3, 1);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		defaultStockModel[1].addBox(-6F, 1.5F, -0.5F, 2, 0.5F, 1);
		
		defaultStockModel[2] = new ModelRendererTurbo(this, 6, 14, textureX, textureY);
		defaultStockModel[2].addBox(-4F, 2F, -0.5F, 3, 0.5F, 1);
		
		defaultStockModel[3] = new ModelRendererTurbo(this, 14, 14, textureX, textureY);
		defaultStockModel[3].addBox(-6F, 3.5F, -0.5F, 5, 0.5F, 1);

		defaultStockModel[4] = new ModelRendererTurbo(this, 26, 14, textureX, textureY);
		defaultStockModel[4].addBox(-3F, 2.5F, -0.5F, 1, 1, 1);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 3.5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(15F / 16F, 3F / 16F, 0F);
		
		//Grip
		defaultGripModel = new ModelRendererTurbo[2];
		
		defaultGripModel[0] = new ModelRendererTurbo(this, 8, 10, textureX, textureY);
		defaultGripModel[0].addBox(11F, 1F, -1F, 2, 1, 2);
		
		defaultGripModel[1] = new ModelRendererTurbo(this, 16, 10, textureX, textureY);
		defaultGripModel[1].addBox(11.5F, -1F, -0.5F, 1, 2, 1);
		
		gripAttachPoint = new Vector3f(10F / 16F, 3F / 16F, 0F);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 22, 7, textureX, textureY);
		ammoModel[0].addBox(-1F, -4F, -0.5F, 2, 5, 1);
		ammoModel[0].setRotationPoint(6F, 1F, 0F);
		ammoModel[0].rotateAngleZ = 0.25F;
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
