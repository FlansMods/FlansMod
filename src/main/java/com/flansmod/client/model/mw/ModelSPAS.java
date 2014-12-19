package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSPAS extends ModelGun
{
	int textureX = 64;
	int textureY = 32;

	public ModelSPAS()
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		gunModel[1] = new ModelRendererTurbo(this, 8, 7, textureX, textureY);
		gunModel[2] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
		gunModel[3] = new ModelRendererTurbo(this, 8, 11, textureX, textureY);
		gunModel[4] = new ModelRendererTurbo(this, 8, 16, textureX, textureY);
		gunModel[5] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);
		gunModel[6] = new ModelRendererTurbo(this, 12, 0, textureX, textureY);
		gunModel[7] = new ModelRendererTurbo(this, 15, 2, textureX, textureY);
		gunModel[8] = new ModelRendererTurbo(this, 16, 19, textureX, textureY);
		gunModel[9] = new ModelRendererTurbo(this, 1, 22, textureX, textureY);
		gunModel[10] = new ModelRendererTurbo(this, 12, 0, textureX, textureY);

		gunModel[0].addShapeBox(0F, -2.3F, -1F, 2, 3, 2, 0F,0F, 0F, -0.2F,0F, 0F, -0.2F,0F, 0F, -0.2F,0F, 0F, -0.2F,1F, -0.5F, -0.2F,-1F, 0F, -0.2F,-1F, 0F, -0.2F,1F, -0.5F, -0.2F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(-0.5F, -4.3F, -1F, 5, 2, 2, 0F,-0.5F, 0F, -0.1F,-0.5F, 0F, -0.1F,-0.5F, 0F, -0.1F,-0.5F, 0F, -0.1F,0F, 0F, -0.1F,-0.5F, 0F, -0.1F,-0.5F, 0F, -0.1F,0F, 0F, -0.1F); // Box 1
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addBox(4F, -5F, -1F, 2, 3, 2, 0F); // Box 2
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(6F, -5F, -1F, 6, 3, 2, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, 0F, 0F,0F, -0.15F, 0F,0F, -0.15F, 0F,0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addBox(6F, -3.2F, -0.5F, 8, 1, 1, 0F); // Box 5
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addBox(7F, -4.4F, -0.5F, 8, 1, 1, 0F); // Box 6
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(12F, -5.4F, -0.5F, 1, 1, 1, 0F); // Box 8
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(-2F, -3.1F, -1.5F, 3, 1, 3, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F); // Box 9
		gunModel[7].setRotationPoint(0F, 0F, 0F);
		gunModel[7].rotateAngleZ = 0.29670597F;

		gunModel[8].addShapeBox(-4F, -3.1F, -1.5F, 2, 1, 3, 0F,-0.5F, 0.4F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,-0.5F, 0.4F, -0.5F,-0.2F, -0.5F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,-0.2F, -0.5F, -0.5F); // Box 10
		gunModel[8].setRotationPoint(0F, 0F, 0F);
		gunModel[8].rotateAngleZ = 0.29670597F;

		gunModel[9].addBox(-5.3F, -2.5F, -1F, 1, 3, 2, 0F); // Box 11
		gunModel[9].setRotationPoint(0F, 0F, 0F);
		gunModel[9].rotateAngleZ = -0.05235988F;

		gunModel[10].addBox(6F, -4.4F, -0.5F, 1, 1, 1, 0F); // Box 13
		gunModel[10].setRotationPoint(0F, 0F, 0F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);

		ammoModel[0].addBox(2F, -3.5F, -0.5F, 2, 1, 1, 0F); // Box 7
		ammoModel[0].setRotationPoint(0F, 0F, 0F);


		pumpModel = new ModelRendererTurbo[1];
		pumpModel[0] = new ModelRendererTurbo(this, 23, 6, textureX, textureY);

		pumpModel[0].addShapeBox(6.75F, -4.25F, -1.5F, 4, 3, 3, 0F,0F, -0.5F, -0.25F,0F, -0.5F, -0.25F,0F, -0.5F, -0.25F,0F, -0.5F, -0.25F,0F, -0.5F, -0.25F,0F, -0.5F, -0.25F,0F, -0.5F, -0.25F,0F, -0.5F, -0.25F); // Box 4
		pumpModel[0].setRotationPoint(0F, 0F, 0F);



		barrelAttachPoint = new Vector3f(0F, 0F, 0F);
		stockAttachPoint = new Vector3f(0F, 0F, 0F);
		
		scopeAttachPoint = new Vector3f(5F / 16F, 5F / 16F, 0F);
		gripAttachPoint = new Vector3f(8.75F / 16F, 2F / 16F, 0F);

		pumpDelayAfterReload = 115;
		pumpDelay = 6;
		pumpTime = 9;
		gripIsOnPump = true;
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.SHOTGUN;

		numBulletsInReloadAnimation = 7;
		tiltGunTime = 0.159F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.708F;
		untiltGunTime = 0.133F;

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
