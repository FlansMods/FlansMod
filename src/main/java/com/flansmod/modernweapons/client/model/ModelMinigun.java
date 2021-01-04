package com.flansmod.modernweapons.client.model;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.client.renderer.GlStateManager;

public class ModelMinigun extends ModelGun
{
	private ModelRendererTurbo[] spinnerModel;
	private Vector3f spinnerOrigin;
	
	public ModelMinigun()
	{
		int textureX = 64;
		int textureY = 64;
		
		gunModel = new ModelRendererTurbo[7];
		
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		gunModel[0].addBox(0F, -4F, -3F, 8, 6, 6);
		
		gunModel[1] = new ModelRendererTurbo(this, 22, 0, textureX, textureY);
		gunModel[1].addBox(1F, -4F, 3F, 6, 3, 3);
		
		gunModel[2] = new ModelRendererTurbo(this, 28, 6, textureX, textureY);
		gunModel[2].addBox(7F, 2F, -3F, 1, 3, 1);
		
		gunModel[3] = new ModelRendererTurbo(this, 32, 6, textureX, textureY);
		gunModel[3].addBox(7F, 2F, 2F, 1, 3, 1);
		
		gunModel[4] = new ModelRendererTurbo(this, 36, 6, textureX, textureY);
		gunModel[4].addBox(7F, 5F, -2F, 1, 1, 4);
		
		// Steampunk bits
		gunModel[5] = new ModelRendererTurbo(this, 40, 28, textureX, textureY); // Box 27
		gunModel[6] = new ModelRendererTurbo(this, 40, 31, textureX, textureY); // Box 28
		
		gunModel[5].addBox(0.5F, 1.5F, -2.5F, 2, 1, 2, 0F); // Box 27
		gunModel[5].setRotationPoint(0F, 0F, 0F);
		
		gunModel[6].addBox(4.5F, 1.5F, -2.5F, 2, 1, 2, 0F); // Box 28
		gunModel[6].setRotationPoint(0F, 0F, 0F);
		// ----------------
		
		ammoModel = new ModelRendererTurbo[6];
		
		ammoModel[0] = new ModelRendererTurbo(this, 0, 46, textureX, textureY);
		ammoModel[0].addBox(1F, -3F, -7F, 6, 4, 4);
		
		// Steampunk bits
		ammoModel[1] = new ModelRendererTurbo(this, 20, 46, textureX, textureY); // Box 20
		ammoModel[2] = new ModelRendererTurbo(this, 40, 46, textureX, textureY); // Box 23
		ammoModel[3] = new ModelRendererTurbo(this, 50, 46, textureX, textureY); // Box 24
		ammoModel[4] = new ModelRendererTurbo(this, 30, 46, textureX, textureY); // Box 25
		ammoModel[5] = new ModelRendererTurbo(this, 0, 54, textureX, textureY); // Box 26
		
		ammoModel[1].addBox(0.5F, -3F, -7F, 1, 4, 4, 0F); // Box 20
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[2].addBox(5F, -3.5F, -7.5F, 1, 5, 5, 0F); // Box 23
		ammoModel[2].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[3].addBox(2F, -3.5F, -7.5F, 1, 5, 5, 0F); // Box 24
		ammoModel[3].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[4].addBox(6.5F, -3F, -7F, 1, 4, 4, 0F); // Box 25
		ammoModel[4].setRotationPoint(0F, 0F, 0F);
		
		ammoModel[5].addBox(1F, -2.5F, -6.5F, 6, 3, 3, 0F); // Box 26
		ammoModel[5].setRotationPoint(0F, 0F, 0F);
		// ------------------------
		
		minigunBarrelModel = new ModelRendererTurbo[24];
		
		//Barrels		
		minigunBarrelModel[0] = new ModelRendererTurbo(this, 0, 16, textureX, textureY);
		minigunBarrelModel[0].addBox(12F, 1F, -0.5F, 28, 1, 1);
		minigunBarrelModel[0].rotateAngleX = 0.0F;
		minigunBarrelModel[0].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[1] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
		minigunBarrelModel[1].addBox(12F, 1F, -0.5F, 28, 1, 1);
		minigunBarrelModel[1].rotateAngleX = 1.047F;
		minigunBarrelModel[1].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[2] = new ModelRendererTurbo(this, 0, 20, textureX, textureY);
		minigunBarrelModel[2].addBox(12F, 1F, -0.5F, 28, 1, 1);
		minigunBarrelModel[2].rotateAngleX = 2.094F;
		minigunBarrelModel[2].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[3] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
		minigunBarrelModel[3].addBox(12F, 1F, -0.5F, 28, 1, 1);
		minigunBarrelModel[3].rotateAngleX = 3.146F;
		minigunBarrelModel[3].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[4] = new ModelRendererTurbo(this, 0, 24, textureX, textureY);
		minigunBarrelModel[4].addBox(12F, 1F, -0.5F, 28, 1, 1);
		minigunBarrelModel[4].rotateAngleX = 4.189F;
		minigunBarrelModel[4].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[5] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		minigunBarrelModel[5].addBox(12F, 1F, -0.5F, 28, 1, 1);
		minigunBarrelModel[5].rotateAngleX = 5.236F;
		minigunBarrelModel[5].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[6] = new ModelRendererTurbo(this, 0, 28, textureX, textureY);
		minigunBarrelModel[6].addShapeBox(8F, 0F, -3F, 4, 3, 6, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -0.5F, -1.5F, /* 5 */ 0F, -0.5F, -1.5F, /* 6 */ 0F, -0.5F, -1.5F, /* 7 */ 0F, -0.5F, -1.5F);
		minigunBarrelModel[6].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[7] = new ModelRendererTurbo(this, 20, 28, textureX, textureY);
		minigunBarrelModel[7].addShapeBox(8F, -3F, -3F, 4, 3, 6, 0F, /* 0 */ 0F, -0.5F, -1.5F, /* 1 */ 0F, -0.5F, -1.5F, /* 2 */ 0F, -0.5F, -1.5F, /* 3 */ 0F, -0.5F, -1.5F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		minigunBarrelModel[7].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[8] = new ModelRendererTurbo(this, 0, 37, textureX, textureY);
		minigunBarrelModel[8].addShapeBox(28F, 0F, -3F, 2, 3, 6, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -0.5F, -1.5F, /* 5 */ 0F, -0.5F, -1.5F, /* 6 */ 0F, -0.5F, -1.5F, /* 7 */ 0F, -0.5F, -1.5F);
		minigunBarrelModel[8].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[9] = new ModelRendererTurbo(this, 16, 37, textureX, textureY);
		minigunBarrelModel[9].addShapeBox(28F, -3F, -3F, 2, 3, 6, 0F, /* 0 */ 0F, -0.5F, -1.5F, /* 1 */ 0F, -0.5F, -1.5F, /* 2 */ 0F, -0.5F, -1.5F, /* 3 */ 0F, -0.5F, -1.5F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		minigunBarrelModel[9].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[10] = new ModelRendererTurbo(this, 32, 37, textureX, textureY);
		minigunBarrelModel[10].addShapeBox(36F, 0F, -3F, 2, 3, 6, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, -0.5F, -1.5F, /* 5 */ 0F, -0.5F, -1.5F, /* 6 */ 0F, -0.5F, -1.5F, /* 7 */ 0F, -0.5F, -1.5F);
		minigunBarrelModel[10].setRotationPoint(0F, -1F, 0F);
		
		minigunBarrelModel[11] = new ModelRendererTurbo(this, 48, 37, textureX, textureY);
		minigunBarrelModel[11].addShapeBox(36F, -3F, -3F, 2, 3, 6, 0F, /* 0 */ 0F, -0.5F, -1.5F, /* 1 */ 0F, -0.5F, -1.5F, /* 2 */ 0F, -0.5F, -1.5F, /* 3 */ 0F, -0.5F, -1.5F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);
		minigunBarrelModel[11].setRotationPoint(0F, -1F, 0F);
		
		// Steampunk cogs
		
		minigunBarrelModel[12] = new ModelRendererTurbo(this, 34, 28, textureX, textureY); // Box 0
		minigunBarrelModel[13] = new ModelRendererTurbo(this, 14, 28, textureX, textureY); // Box 1
		minigunBarrelModel[14] = new ModelRendererTurbo(this, 20, 28, textureX, textureY); // Box 2
		minigunBarrelModel[15] = new ModelRendererTurbo(this, 34, 28, textureX, textureY); // Box 3
		minigunBarrelModel[16] = new ModelRendererTurbo(this, 14, 28, textureX, textureY); // Box 4
		minigunBarrelModel[17] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 5
		minigunBarrelModel[18] = new ModelRendererTurbo(this, 20, 28, textureX, textureY); // Box 14
		minigunBarrelModel[19] = new ModelRendererTurbo(this, 14, 28, textureX, textureY); // Box 15
		minigunBarrelModel[20] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 16
		minigunBarrelModel[21] = new ModelRendererTurbo(this, 14, 28, textureX, textureY); // Box 17
		minigunBarrelModel[22] = new ModelRendererTurbo(this, 34, 28, textureX, textureY); // Box 18
		minigunBarrelModel[23] = new ModelRendererTurbo(this, 20, 28, textureX, textureY); // Box 19
		
		minigunBarrelModel[12].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 0
		minigunBarrelModel[12].setRotationPoint(8F, -1F, 0F);
		
		minigunBarrelModel[13].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 1
		minigunBarrelModel[13].setRotationPoint(8F, -1F, 0F);
		minigunBarrelModel[13].rotateAngleX = 1.04719755F;
		
		minigunBarrelModel[14].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 2
		minigunBarrelModel[14].setRotationPoint(8F, -1F, 0F);
		minigunBarrelModel[14].rotateAngleX = 2.0943951F;
		
		minigunBarrelModel[15].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 3
		minigunBarrelModel[15].setRotationPoint(8F, -1F, 0F);
		minigunBarrelModel[15].rotateAngleX = 3.14159265F;
		
		minigunBarrelModel[16].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 4
		minigunBarrelModel[16].setRotationPoint(8F, -1F, 0F);
		minigunBarrelModel[16].rotateAngleX = 4.1887902F;
		
		minigunBarrelModel[17].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 5
		minigunBarrelModel[17].setRotationPoint(8F, -1F, 0F);
		minigunBarrelModel[17].rotateAngleX = 5.23598776F;
		
		minigunBarrelModel[18].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 14
		minigunBarrelModel[18].setRotationPoint(36.5F, -1F, 0F);
		
		minigunBarrelModel[19].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 15
		minigunBarrelModel[19].setRotationPoint(36.5F, -1F, 0F);
		minigunBarrelModel[19].rotateAngleX = 5.23598776F;
		
		minigunBarrelModel[20].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 16
		minigunBarrelModel[20].setRotationPoint(36.5F, -1F, 0F);
		minigunBarrelModel[20].rotateAngleX = 4.1887902F;
		
		minigunBarrelModel[21].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 17
		minigunBarrelModel[21].setRotationPoint(36.5F, -1F, 0F);
		minigunBarrelModel[21].rotateAngleX = 3.14159265F;
		
		minigunBarrelModel[22].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 18
		minigunBarrelModel[22].setRotationPoint(36.5F, -1F, 0F);
		minigunBarrelModel[22].rotateAngleX = 2.0943951F;
		
		minigunBarrelModel[23].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 19
		minigunBarrelModel[23].setRotationPoint(36.5F, -1F, 0F);
		minigunBarrelModel[23].rotateAngleX = 1.04719755F;
		// -------------------------
		
		// Custom extra minigun spinner on the side for the Steampunk skin
		spinnerModel = new ModelRendererTurbo[8];
		spinnerModel[0] = new ModelRendererTurbo(this, 18, 55, textureX, textureY); // Box 6
		spinnerModel[1] = new ModelRendererTurbo(this, 44, 28, textureX, textureY); // Box 7
		spinnerModel[2] = new ModelRendererTurbo(this, 34, 28, textureX, textureY); // Box 8
		spinnerModel[3] = new ModelRendererTurbo(this, 20, 28, textureX, textureY); // Box 9
		spinnerModel[4] = new ModelRendererTurbo(this, 14, 28, textureX, textureY); // Box 10
		spinnerModel[5] = new ModelRendererTurbo(this, 34, 28, textureX, textureY); // Box 11
		spinnerModel[6] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 12
		spinnerModel[7] = new ModelRendererTurbo(this, 20, 28, textureX, textureY); // Box 13
		
		spinnerModel[0].addShapeBox(0F, -3F, -3F, 4, 3, 6, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		spinnerModel[0].setRotationPoint(5F, -1F, 6F);
		spinnerModel[0].rotateAngleX = 0.52359878F;
		spinnerModel[0].rotateAngleY = 1.57079633F;
		
		spinnerModel[1].addShapeBox(0F, 0F, -3F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 7
		spinnerModel[1].setRotationPoint(5F, -1F, 6F);
		spinnerModel[1].rotateAngleX = 0.52359878F;
		spinnerModel[1].rotateAngleY = 1.57079633F;
		
		spinnerModel[2].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 8
		spinnerModel[2].setRotationPoint(5F, -1F, 4F);
		spinnerModel[2].rotateAngleX = 0.52359878F;
		spinnerModel[2].rotateAngleY = 1.57079633F;
		
		spinnerModel[3].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 9
		spinnerModel[3].setRotationPoint(5F, -1F, 4F);
		spinnerModel[3].rotateAngleX = 1.57079633F;
		spinnerModel[3].rotateAngleY = 1.57079633F;
		
		spinnerModel[4].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 10
		spinnerModel[4].setRotationPoint(5F, -1F, 4F);
		spinnerModel[4].rotateAngleX = 2.61799388F;
		spinnerModel[4].rotateAngleY = 1.57079633F;
		
		spinnerModel[5].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 11
		spinnerModel[5].setRotationPoint(5F, -1F, 4F);
		spinnerModel[5].rotateAngleX = 3.66519143F;
		spinnerModel[5].rotateAngleY = 1.57079633F;
		
		spinnerModel[6].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 12
		spinnerModel[6].setRotationPoint(5F, -1F, 4F);
		spinnerModel[6].rotateAngleX = 4.71238898F;
		spinnerModel[6].rotateAngleY = 1.57079633F;
		
		spinnerModel[7].addBox(0F, 2F, -1F, 1, 2, 2, 0F); // Box 13
		spinnerModel[7].setRotationPoint(5F, -1F, 4F);
		spinnerModel[7].rotateAngleX = 5.75958653F;
		spinnerModel[7].rotateAngleY = 1.57079633F;
		// -------------------------------------------------
		
		minigunBarrelOrigin = new Vector3f(8F / 16F, -1F / 16F, 0F);
		
		spinnerOrigin = new Vector3f(5F / 16F, -1F / 16F, 3F / 16F);
		
		animationType = EnumAnimationType.SIDE_CLIP;
		
		thirdPersonOffset = new Vector3f(-0.5F, -0.25F, 0.0125F);
		
		itemFrameOffset = new Vector3f(-16F / 16F, 3F / 16F, 0F);
	}
	
	@Override
	public void renderCustom(float f, GunAnimations anims)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate(spinnerOrigin.x, spinnerOrigin.y, spinnerOrigin.z);
		GlStateManager.rotate(anims.minigunBarrelRotation, 0F, 0F, 1F);
		GlStateManager.translate(-spinnerOrigin.x, -spinnerOrigin.y, -spinnerOrigin.z);
		render(spinnerModel, f);
		GlStateManager.popMatrix();
	}
}
