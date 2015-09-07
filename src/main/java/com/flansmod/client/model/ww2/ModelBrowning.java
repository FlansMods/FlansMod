package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBrowning extends ModelMG
{
    public ModelBrowning()
    {
		bipodModel = new ModelRendererTurbo[3];
		bipodModel[0] = new ModelRendererTurbo(this, 0, 0);
		bipodModel[0].addBox(0F, 0F, 0F, 1, 10, 1);
		bipodModel[0].rotateAngleZ = 3.14159265F / 4F + 0.2F;
		bipodModel[0].rotateAngleX = - 3.14159265F / 4F;
		bipodModel[0].setRotationPoint(5.66F, 0F, 8F);
		bipodModel[1] = new ModelRendererTurbo(this, 0, 0);
		bipodModel[1].addBox(-1F, 0F, 0F, 1, 10, 1);
		bipodModel[1].rotateAngleZ = -3.14159265F / 4F - 0.2F;
		bipodModel[1].rotateAngleX = - 3.14159265F / 4F;
		bipodModel[1].setRotationPoint(-5.66F, 0F, 8F);	
		bipodModel[2] = new ModelRendererTurbo(this, 0, 0);
		bipodModel[2].addBox(-1F, 0F, 0F, 1, 10, 1);
		bipodModel[2].rotateAngleX = 3.14159265F / 3F;
		bipodModel[2].setRotationPoint(0F, 0F, -8F);
		
		gunModel = new ModelRendererTurbo[3];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0);
		gunModel[0].addBox(-1.5F, -1.5F, -4F, 3, 3, 12);
		gunModel[0].setRotationPoint(0F, 6F, 0F);
		gunModel[1] = new ModelRendererTurbo(this, 0, 15);
		gunModel[1].addBox(-0.5F, -0.5F, -12F, 1, 1, 10);
		gunModel[1].setRotationPoint(0F, 6F, 0F);
		gunModel[2] = new ModelRendererTurbo(this, 4, 0);
		gunModel[2].addBox(-1F, -3F, 8F, 2, 3, 2);
		gunModel[2].setRotationPoint(0F, 6F, 0F);		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 18, 0);
		ammoModel[0].addBox(-6F, -3F, -2F, 5, 4, 2);
		ammoModel[0].setRotationPoint(0F, 6F, 0F);	
    }
}
