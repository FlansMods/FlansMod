package co.uk.flansmods.client.model.mw;

import co.uk.flansmods.client.model.EnumAnimationType;
import co.uk.flansmods.client.model.ModelGun;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;

public class ModelBarrett extends ModelGun 
{
	public ModelBarrett()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[2];
		
		//Main Barrel
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-8F, 2F, -1F, 20, 2, 2);
		
		//Trigger Handle
		gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		gunModel[1].addBox(-1F, -2F, -1F, 3, 4, 2);
		
		//Bolt
		slideModel = new ModelRendererTurbo[2];
		
		slideModel[0] = new ModelRendererTurbo(this, 34, 6, textureX, textureY);
		slideModel[0].addTrapezoid(3F, 2.5F, 0.5F, 1, 1, 2, 0F, -0.5F, ModelRendererTurbo.MR_FRONT);
		slideModel[0].doMirror(false, false, true);
		slideModel[1] = new ModelRendererTurbo(this, 34, 6, textureX, textureY);
		slideModel[1].addTrapezoid(3F, 2.5F, 0.5F, 1, 1, 2, 0F, -0.5F, ModelRendererTurbo.MR_FRONT);
		
		//Scope
		defaultScopeModel = new ModelRendererTurbo[3];
		
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		defaultScopeModel[0].addTrapezoid(-1F, 4.25F, -1F, 4, 2, 2, 0F, -0.5F, ModelRendererTurbo.MR_LEFT);
		
		defaultScopeModel[1] = new ModelRendererTurbo(this, 12, 10, textureX, textureY);
		defaultScopeModel[1].addTrapezoid(3F, 4.25F, -1F, 4, 2, 2, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT);
		
		defaultScopeModel[2] = new ModelRendererTurbo(this, 10, 7, textureX, textureY);
		defaultScopeModel[2].addBox(1.5F, 3.5F, -0.5F, 3, 2, 1);
		
		//Barrel
		defaultBarrelModel = new ModelRendererTurbo[2];
		
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 26, 4, textureX, textureY);
		defaultBarrelModel[0].addBox(12F, 2.5F, -0.5F, 8, 1, 1);
		
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 18, 4, textureX, textureY);
		defaultBarrelModel[1].addBox(18.5F, 2F, -1F, 2, 2, 2);
		
		//Ammo
		ammoModel = new ModelRendererTurbo[1];
		
		ammoModel[0] = new ModelRendererTurbo(this, 24, 8, textureX, textureY);
		ammoModel[0].addBox(2.5F, -3F, -1F, 4, 5, 2);
		
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}
