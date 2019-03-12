package com.flansmod.client.model.nerf;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelVulcan extends ModelMG
{
	public ModelVulcan()
	{
		bipodModel = new ModelRendererTurbo[3];
		bipodModel[0] = new ModelRendererTurbo(this, 0, 0);
		bipodModel[0].addBox(0F, 0F, 0F, 1, 5, 1);
		bipodModel[0].rotateAngleZ = 3.14159265F / 4F + 0.2F;
		bipodModel[0].rotateAngleX = -3.14159265F / 4F;
		bipodModel[0].setRotationPoint(2.66F, 0F, 4F);
		bipodModel[1] = new ModelRendererTurbo(this, 0, 0);
		bipodModel[1].addBox(-1F, 0F, 0F, 1, 5, 1);
		bipodModel[1].rotateAngleZ = -3.14159265F / 4F - 0.2F;
		bipodModel[1].rotateAngleX = -3.14159265F / 4F;
		bipodModel[1].setRotationPoint(-2.66F, 0F, 4F);
		bipodModel[2] = new ModelRendererTurbo(this, 0, 0);
		bipodModel[2].addBox(-1F, 0F, 0F, 1, 5, 1);
		bipodModel[2].rotateAngleX = 3.14159265F / 3F;
		bipodModel[2].setRotationPoint(0F, 0F, -4F);

		gunModel = new ModelRendererTurbo[4];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0);
		gunModel[0].addBox(-2F, -1F, -4F, 4, 5, 12);
		gunModel[0].setRotationPoint(0F, 4F, 0F);
		gunModel[1] = new ModelRendererTurbo(this, 0, 17);
		gunModel[1].addBox(-1F, -1F, -12F, 2, 3, 10);
		gunModel[1].setRotationPoint(0F, 6F, 0F);
		gunModel[2] = new ModelRendererTurbo(this, 0, 6);
		gunModel[2].addBox(-1F, -0F, 8F, 2, 2, 4);
		gunModel[2].setRotationPoint(0F, 6F, 0F);
		gunModel[3] = new ModelRendererTurbo(this, 4, 0);
		gunModel[3].addBox(-1F, -2F, 12F, 2, 4, 2);
		gunModel[3].setRotationPoint(0F, 6F, 0F);

		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 20, 0);
		ammoModel[0].addBox(-7F, -2F, -2F, 5, 4, 4);
		ammoModel[0].setRotationPoint(0F, 6F, 0F);
	}
}
