package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMTAR extends ModelGun
{
	int textureX = 32;
	int textureY = 32;

	public ModelMTAR()
	{
		gunModel = new ModelRendererTurbo[8];
		gunModel[0] = new ModelRendererTurbo(this, 1, 6, textureX, textureY);
		gunModel[1] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		gunModel[2] = new ModelRendererTurbo(this, 7, 7, textureX, textureY);
		gunModel[3] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		gunModel[4] = new ModelRendererTurbo(this, 7, 4, textureX, textureY);
		gunModel[5] = new ModelRendererTurbo(this, 3, 3, textureX, textureY);
		gunModel[6] = new ModelRendererTurbo(this, 8, 1, textureX, textureY);
		gunModel[7] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);

		gunModel[0].addShapeBox(-0.25F, -1.8F, -0.5F, 2, 3, 1, 0F,-0.25F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-0.25F, 0F, 0F,-0.25F, 0F, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F,-0.25F, 0F, 0F); // Box 14
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		gunModel[0].rotateAngleZ = -0.13962634F;

		gunModel[1].addBox(-1.5F, -4.5F, -1F, 6, 2, 2, 0F); // Box 15
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(4.5F, -3.25F, -1F, 2, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, 0F, -0.3F); // Box 16
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-5.5F, -4.5F, -1F, 4, 3, 2, 0F,0.25F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.25F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 17
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(4.5F, -4.25F, -1F, 2, 1, 2, 0F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, 0F, -0.3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 18
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addBox(6F, -3.75F, -0.5F, 2, 1, 1, 0F); // Box 20
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(0.2F, -2.5F, -1F, 3, 1, 2, 0F); // Box 21
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addBox(0F, -5F, -0.5F, 6, 1, 1, 0F); // Box 22
		gunModel[7].setRotationPoint(0F, 0F, 0F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 21, textureX, textureY);

		ammoModel[0].addShapeBox(-3.8F, -3F, -0.5F, 2, 5, 1, 0F,0.25F, 0F, 0.2F,-0.25F, 0F, 0.2F,-0.25F, 0F, 0.2F,0.25F, 0F, 0.2F,0F, 0F, 0.2F,0F, -0.5F, 0.2F,0F, -0.5F, 0.2F,0F, 0F, 0.2F); // Box 19
		ammoModel[0].setRotationPoint(0F, 0F, 0F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 6, 21, textureX, textureY);

		slideModel[0].addShapeBox(2.5F, -4F, -1F, 1, 1, 2, 0F,0F, 0F, 0.25F,0F, 0F, 0.25F,0F, 0F, 0.25F,0F, 0F, 0.25F,0F, 0F, 0.25F,0F, 0F, 0.25F,0F, 0F, 0.25F,0F, 0F, 0.25F); // Box 23
		slideModel[0].setRotationPoint(0F, 0F, 0F);



		barrelAttachPoint = new Vector3f(9F / 16F, 3.25F / 16F, 0F);
		stockAttachPoint = new Vector3f(0F, 0F, 0F);
		scopeAttachPoint = new Vector3f(4F / 16F, 5F / 16F, 0F);
		gripAttachPoint = new Vector3f(0F, 0F, 0F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(1F, 0F, 0F);


		flipAll();
	}
}
