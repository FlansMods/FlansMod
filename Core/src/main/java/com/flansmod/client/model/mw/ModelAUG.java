package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAUG extends ModelGun
{
	int textureX = 32;
	int textureY = 32;
	
	public ModelAUG()
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[2] = new ModelRendererTurbo(this, 13, 2, textureX, textureY);
		gunModel[3] = new ModelRendererTurbo(this, 21, 7, textureX, textureY);
		gunModel[4] = new ModelRendererTurbo(this, 8, 12, textureX, textureY);
		gunModel[5] = new ModelRendererTurbo(this, 24, 1, textureX, textureY);
		gunModel[6] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		gunModel[7] = new ModelRendererTurbo(this, 27, 4, textureX, textureY);
		gunModel[8] = new ModelRendererTurbo(this, 23, 13, textureX, textureY);
		gunModel[9] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		gunModel[10] = new ModelRendererTurbo(this, 5, 22, textureX, textureY);
		
		gunModel[0].addBox(-6F, -3.25F, -3.25F, 8, 2, 2, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		gunModel[0].rotateAngleX = -0.78539816F;
		
		gunModel[1].addShapeBox(-7F, -3F, -1F, 4, 4, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(0F, 0F, 0F);
		
		gunModel[2].addShapeBox(-3F, -3.5F, -1F, 4, 2, 2, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(0F, 0F, 0F);
		
		gunModel[3].addShapeBox(-0.4F, -3F, -0.5F, 2, 4, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 4
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		gunModel[3].rotateAngleZ = -0.13962634F;
		
		gunModel[4].addShapeBox(2F, -3F, -3F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 6
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		gunModel[4].rotateAngleX = -0.78539816F;
		
		gunModel[5].addShapeBox(7F, -3.4F, -0.5F, 2, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 8
		gunModel[5].setRotationPoint(0F, 0F, 0F);
		
		gunModel[6].addBox(-1.5F, -5F, -0.5F, 8, 2, 1, 0F); // Box 9
		gunModel[6].setRotationPoint(0F, 0F, 0F);
		
		gunModel[7].addShapeBox(6.5F, -5F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[7].setRotationPoint(0F, 0F, 0F);
		
		gunModel[8].addBox(4.5F, -2.6F, -0.5F, 3, 1, 1, 0F); // Box 13
		gunModel[8].setRotationPoint(0F, 0F, 0F);
		
		gunModel[9].addShapeBox(-2.5F, -5F, -0.5F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[9].setRotationPoint(0F, 0F, 0F);
		
		gunModel[10].addShapeBox(-7F, -3.25F, -3.25F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 15
		gunModel[10].setRotationPoint(0F, 0F, 0F);
		gunModel[10].rotateAngleX = -0.78539816F;
		
		
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 12, textureX, textureY);
		
		ammoModel[0].addBox(-4F, -2.7F, -0.5F, 2, 4, 1, 0F); // Box 5
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = 0.15707963F;
		
		
		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 19, 17, textureX, textureY);
		slideModel[1] = new ModelRendererTurbo(this, 19, 17, textureX, textureY);
		
		slideModel[0].addShapeBox(3F, -4.1F, 0.4F, 1, 1, 1, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 11
		slideModel[0].setRotationPoint(0F, 0F, 0F);
		
		slideModel[1].addShapeBox(3F, -4.1F, -1.4F, 1, 1, 1, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 20
		slideModel[1].setRotationPoint(0F, 0F, 0F);
		
		
		barrelAttachPoint = new Vector3f(9F / 16F, 2.75F / 16F, 0F);
		stockAttachPoint = new Vector3f(0F, 0F, 0F);
		scopeAttachPoint = new Vector3f(4F / 16F, 5F / 16F, 0F);
		gripAttachPoint = new Vector3f(0F, 0F, 0F);
		
		gunSlideDistance = 0F;
		animationType = EnumAnimationType.PISTOL_CLIP;
		
		
		translateAll(1F, 0F, 0F);
		
		
		flipAll();
	}
}
