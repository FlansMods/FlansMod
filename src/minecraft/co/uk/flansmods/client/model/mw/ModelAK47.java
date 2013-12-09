package co.uk.flansmods.client.model.mw;

import co.uk.flansmods.client.model.EnumAnimationType;
import co.uk.flansmods.client.model.ModelGun;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelAK47 extends ModelGun 
{
	public ModelAK47()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[3];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-4F, 2F, -1F, 12, 3, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		gunModel[1].addBox(-0F, -2F, -1F, 2, 4, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 8, 5, textureX, textureY);
		gunModel[2].addBox(6.9F, 4.2F, -0.5F, 1, 1, 1);

		//Stock
		defaultStockModel = new ModelRendererTurbo[2];
		
		defaultStockModel[0] = new ModelRendererTurbo(this, 8, 7, textureX, textureY);
		defaultStockModel[0].addBox(-7F, 1F, -1F, 3, 3, 2);
		
		defaultStockModel[1] = new ModelRendererTurbo(this, 18, 7, textureX, textureY);
		defaultStockModel[1].addBox(-10F, 0F, -1F, 3, 3, 2);
		
		//Barrel
		defaultBarrelModel = new ModelRendererTurbo[3];
		
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		defaultBarrelModel[0].addBox(8F, 2.25F, -1F, 3, 2, 2);
		
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 10, 12, textureX, textureY);
		defaultBarrelModel[1].addBox(11F, 2.5F, -0.5F, 2, 1, 1);
		
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 16, 12, textureX, textureY);
		defaultBarrelModel[2].addBox(13F, 2.5F, -0.5F, 1, 2, 1);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[3];
		
		ammoModel[0] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
		ammoModel[0].addBox(4F, -2F, -1F, 3, 4, 2);
		
		ammoModel[1] = new ModelRendererTurbo(this, 20, 12, textureX, textureY);
		ammoModel[1].addBox(5F, -4F, -1F, 3, 2, 2);
		
		ammoModel[2] = new ModelRendererTurbo(this, 28, 7, textureX, textureY);
		ammoModel[2].addBox(6F, -5F, -1F, 2, 1, 2);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
