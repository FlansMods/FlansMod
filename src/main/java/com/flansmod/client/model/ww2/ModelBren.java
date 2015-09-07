package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBren extends ModelMG
{
    public ModelBren()
    {
		bipodModel = new ModelRendererTurbo[2];
		bipodModel[0] = new ModelRendererTurbo(this, 0, 0);
		bipodModel[0].addBox(0F, 0F, 0F, 1, 8, 1);
		bipodModel[0].rotateAngleZ = 3.14159265F / 4F;
		bipodModel[0].setRotationPoint(5.66F, 0F, 0F);
		bipodModel[1] = new ModelRendererTurbo(this, 0, 0);
		bipodModel[1].addBox(-1F, 0F, 0F, 1, 8, 1);
		bipodModel[1].rotateAngleZ = -3.14159265F / 4F;
		bipodModel[1].setRotationPoint(-5.66F, 0F, 0F);
		
		gunModel = new ModelRendererTurbo[3];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0);
		gunModel[0].addBox(-1F, -1F, -2F, 2, 2, 16);
		gunModel[0].setRotationPoint(0F, 6F, 0F);
		gunModel[1] = new ModelRendererTurbo(this, 4, 0);
		gunModel[1].addBox(-1F, -4F, 8F, 2, 3, 2);
		gunModel[1].setRotationPoint(0F, 6F, 0F);		
		gunModel[2] = new ModelRendererTurbo(this, 0, 18);
		gunModel[2].addBox(-0.5F, -0.5F, -8F, 1, 1, 6);
		gunModel[2].setRotationPoint(0F, 6F, 0F);
		
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 4, 5);
		ammoModel[0].addBox(0F, 1F, 5F, 1, 3, 2);
		ammoModel[0].setRotationPoint(0F, 6F, 0F);	
		ammoModel[1] = new ModelRendererTurbo(this, 4, 5);
		ammoModel[1].addBox(0F, 4F, 4.5F, 1, 2, 2);
		ammoModel[1].setRotationPoint(0F, 6F, 0F);	
    }
}
