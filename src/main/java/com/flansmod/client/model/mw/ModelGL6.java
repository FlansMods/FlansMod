package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGL6 extends ModelGun 
{
	public ModelGL6()
	{
		int textureX = 64;
		int textureY = 16;
		
		gunModel = new ModelRendererTurbo[13];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addShapeBox(-12F, 1F, -1F, 9, 3, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -1F, 0F, /* 2 */ 0F, -1F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		gunModel[1] = new ModelRendererTurbo(this, 22, 0, textureX, textureY);
		gunModel[1].addBox(-3F, 1F, -1F, 3, 3, 2);
		
		gunModel[2] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
		gunModel[2].addShapeBox(-3F, -2F, -1F, 2, 3, 2, 0F, /* 0 */ 1F, 0F, 0F, /* 1 */ -1F, 0F, 0F, /* 2 */ -1F, 0F, 0F, /* 3 */ 1F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		gunModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		gunModel[3].addBox(-2F, 4F, -1F, 10, 1, 2);	
		
		//Round bit before drum
		gunModel[4] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[4].addBox(0F, -2F, -1F, 1, 6, 2);
		
		gunModel[5] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[5].addShapeBox(0F, -2F, 1F, 1, 6, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, -1.5F, 0F, /* 3 */ 0F, -1.5F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, -1.5F, 0F, /* 7 */ 0F, -1.5F, 0F);	

		gunModel[6] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[6].addShapeBox(0F, -2F, -3F, 1, 6, 2, 0F, /* 0 */ 0F, -1.5F, 0F, /* 1 */ 0F, -1.5F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -1.5F, 0F, /* 5 */ 0F, -1.5F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
		
		//Round bit after drum
		gunModel[7] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[7].addBox(7F, -2F, -1F, 1, 6, 2);
		
		gunModel[8] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[8].addShapeBox(7F, -2F, 1F, 1, 6, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, -1.5F, 0F, /* 3 */ 0F, -1.5F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, -1.5F, 0F, /* 7 */ 0F, -1.5F, 0F);	

		gunModel[9] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		gunModel[9].addShapeBox(7F, -2F, -3F, 1, 6, 2, 0F, /* 0 */ 0F, -1.5F, 0F, /* 1 */ 0F, -1.5F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -1.5F, 0F, /* 5 */ 0F, -1.5F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
	
		//Bit under drum
		gunModel[10] = new ModelRendererTurbo(this, 22, 13, textureX, textureY);
		gunModel[10].addBox(0F, -3F, -1F, 8, 1, 2);
		
		//Barrel
		gunModel[11] = new ModelRendererTurbo(this, 22, 9, textureX, textureY);
		gunModel[11].addBox(8F, 1.5F, -1F, 8, 2, 2);
		
		gunModel[12] = new ModelRendererTurbo(this, 40, 0, textureX, textureY);
		gunModel[12].addBox(8F, 1F, -1.5F, 4, 3, 3);
		
		revolverBarrelModel = new ModelRendererTurbo[3];
		
		revolverBarrelModel[0] = new ModelRendererTurbo(this, 6, 8, textureX, textureY);
		revolverBarrelModel[0].addBox(1F, -2F, -1F, 6, 6, 2);
		
		revolverBarrelModel[1] = new ModelRendererTurbo(this, 6, 8, textureX, textureY);
		revolverBarrelModel[1].addShapeBox(1F, -2F, 1F, 6, 6, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, -1.5F, 0F, /* 3 */ 0F, -1.5F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, -1.5F, 0F, /* 7 */ 0F, -1.5F, 0F);	

		revolverBarrelModel[2] = new ModelRendererTurbo(this, 6, 8, textureX, textureY);
		revolverBarrelModel[2].addShapeBox(1F, -2F, -3F, 6, 6, 2, 0F, /* 0 */ 0F, -1.5F, 0F, /* 1 */ 0F, -1.5F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -1.5F, 0F, /* 5 */ 0F, -1.5F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	

		revolverFlipAngle = -90F;
		
		revolverFlipPoint = new Vector3f(0F, -2.5F / 16F, 0F);
		
		ammoModel = new ModelRendererTurbo[6];
		
		for(int i = 0; i < 6; i++)
		{
			ammoModel[i] = new ModelRendererTurbo(this, 42, 12, textureX, textureY);
			ammoModel[i].addBox(0.9F, -2.75F, -0.75F, 4, 1.5F, 1.5F);
			ammoModel[i].setRotationPoint(0F, 1F, 0F);
			ammoModel[i].rotateAngleX = (float)Math.PI / 3F * i;
		}

		barrelAttachPoint = new Vector3f(7.5F / 16F, 4F / 16F, 0F);
		
		scopeAttachPoint = new Vector3f(6F / 16F, 5F / 16F, 0F);
		
		translateAll(6, 0, 0);
		
		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.REVOLVER;
		
		tiltGunTime = 0.2F;
		unloadClipTime = 0.2F;
		loadClipTime = 0.4F;
		untiltGunTime = 0.2F;
		
		itemFrameOffset = new Vector3f(-2F / 16F, 0F / 16F, 0F);
	}
}
