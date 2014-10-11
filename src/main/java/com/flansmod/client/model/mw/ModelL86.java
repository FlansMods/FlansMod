package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelL86 extends ModelGun
{
	public ModelL86()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[8];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(-8F, 1F, -1F, 1, 4, 2);
		
		gunModel[1] = new ModelRendererTurbo(this, 6, 0, textureX, textureY);
		gunModel[1].addShapeBox(-7F, 2F, -1F, 8, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		gunModel[2] = new ModelRendererTurbo(this, 26, 0, textureX, textureY);
		gunModel[2].addShapeBox(-4F, 1F, -1F, 2, 2, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -0.625F, 0F, /* 5 */ 0F, -0.375F, 0F, /* 6 */ 0F, -0.375F, 0F, /* 7 */ 0F, -0.625F, 0F);

		gunModel[3] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		gunModel[3].addBox(1F, 3F, -1F, 8, 2, 2);

		gunModel[4] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		gunModel[4].addBox(9F, 3.5F, -0.5F, 8, 1, 1);
		
		gunModel[5] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		gunModel[5].addBox(9F, 3F, -1F, 6, 1, 2);

		gunModel[6] = new ModelRendererTurbo(this, 18, 5, textureX, textureY);
		gunModel[6].addBox(7.5F, 4.5F, -0.5F, 1, 1, 1);

		gunModel[7] = new ModelRendererTurbo(this, 17, 11, textureX, textureY);
		gunModel[7].addShapeBox(3F, 0F, -1F, 2, 3, 2, 0F, /* 0 */ 1F, 0F, 0F, /* 1 */ -1F, 0F, 0F, /* 2 */ -1F, 0F, 0F, /* 3 */ 1F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	

		//Ammo
		ammoModel = new ModelRendererTurbo[3];
		
		ammoModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY);
		ammoModel[0].addBox(-4F, -4F, -1F, 2, 5, 2);		
		
		ammoModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY);
		ammoModel[1].addShapeBox(-4F, -4F, -3F, 2, 5, 2, 0F, /* 0 */ 0F, -1.5F, -0.5F, /* 1 */ 0F, -1.5F, -0.5F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -1.5F, -0.5F, /* 5 */ 0F, -1.5F, -0.5F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);		

		ammoModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY);
		ammoModel[2].addShapeBox(-4F, -4F, 1F, 2, 5, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, -1.5F, -0.5F, /* 3 */ 0F, -1.5F, -0.5F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, -1.5F, -0.5F, /* 7 */ 0F, -1.5F, -0.5F);	

		//Stock
		stockAttachPoint = new Vector3f(-1F / 16F, 4F / 16F, 0F);		
		
		//Barrel - Nope.
		barrelAttachPoint = new Vector3f(11.75F / 16F, 3.5F / 16F, 0F);
				
		//Scope
		scopeAttachPoint = new Vector3f(2F / 16F, 5F / 16F, 0F);
				
		//Grip
		gripAttachPoint = new Vector3f(14F / 16F, 3F / 16F, 0F);
		
		defaultGripModel = new ModelRendererTurbo[3];
		
		//Bipod
		defaultGripModel[0] = new ModelRendererTurbo(this, 34, 0, textureX, textureY);
		defaultGripModel[0].addBox(15F, 2F, -1F, 1, 1, 2);
		
		defaultGripModel[1] = new ModelRendererTurbo(this, 44, 0, textureX, textureY);
		defaultGripModel[1].addShapeBox(15F, -3F, -1F, 1, 5, 1, 0F, /* 0 */ 0F, 0F, 3F, /* 1 */ 0F, 0F, 3F, /* 2 */ 0F, 0F, -3F, /* 3 */ 0F, 0F, -3F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
	
		defaultGripModel[2] = new ModelRendererTurbo(this, 40, 0, textureX, textureY);
		defaultGripModel[2].addShapeBox(15F, -3F, 0F, 1, 5, 1, 0F, /* 0 */ 0F, 0F, -3F, /* 1 */ 0F, 0F, -3F, /* 2 */ 0F, 0F, 3F, /* 3 */ 0F, 0F, 3F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	

		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.BULLPUP;
		
		tiltGunTime = 0.1F;
		unloadClipTime = 0.2F;
		loadClipTime = 0.2F;
		untiltGunTime = 0.5F;
	}
}
