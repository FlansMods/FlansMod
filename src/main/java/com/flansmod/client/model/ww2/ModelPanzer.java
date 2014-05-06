package com.flansmod.client.model.ww2;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.EntityVehicle;

public class ModelPanzer extends ModelVehicle
{
    public ModelPanzer()
    {
    	/*
		int textureX = 512;
		int textureY = 256;
		
		bodyModel = new ModelRendererTurbo[58];
		
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(0F, 0F, 0F, 48, 2, 77, 0F);
		bodyModel[0].setRotationPoint(-27F, 6F, -30F);

		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[1].addBox(0F, 0F, 0F, 10, 2, 11, 0F);
		bodyModel[1].setRotationPoint(-27F, 12.1F, -39F);
		bodyModel[1].rotateAngleX = 0.5934119F;

		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[2].addBox(0F, 0F, 0F, 10, 2, 11, 0F);
		bodyModel[2].setRotationPoint(11F, 12.1F, -39F);
		bodyModel[2].rotateAngleX = 0.5934119F;

		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[3].addBox(0F, 0F, 0F, 10, 2, 9, 0F);
		bodyModel[3].setRotationPoint(11F, 6F, 47F);
		bodyModel[3].rotateAngleX = -0.5934119F;

		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[4].addBox(0F, 0F, 0F, 10, 2, 9, 0F);
		bodyModel[4].setRotationPoint(-27F, 6F, 47F);
		bodyModel[4].rotateAngleX = -0.5934119F;

		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[5].addBox(0F, 0F, 0F, 28, 1, 9, 0F);
		bodyModel[5].setRotationPoint(-17F, 12F, -37F);
		bodyModel[5].rotateAngleX = 0.5934119F;

		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[6].addBox(0F, 0F, 0F, 35, 7, 1, 0F);
		bodyModel[6].setRotationPoint(-20.5F, -1F, -21F);
		bodyModel[6].rotateAngleX = -0.06981317F;

		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[7].addBox(0F, 0F, 0F, 35, 7, 61, 0F);
		bodyModel[7].setRotationPoint(-20.5F, -1F, -20.5F);

		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[8].addBox(0F, 0F, 0F, 5, 5, 2, 0F);
		bodyModel[8].setRotationPoint(-16F, 0F, -22.5F);

		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[9].addBox(0F, 10F, 0F, 38, 10, 71, 0F);
		bodyModel[9].setRotationPoint(-22F, -2F, -31F);

		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[10].addBox(0F, 0F, 0F, 38, 7, 7, 0F);
		bodyModel[10].setRotationPoint(-22F, 11F, -35F);
		bodyModel[10].rotateAngleX = 0.5934119F;

		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[11].addBox(0F, 0F, 0F, 38, 9, 7, 0F);
		bodyModel[11].setRotationPoint(-22F, 6F, 39F);
		bodyModel[11].rotateAngleX = -0.5934119F;

		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[12].addBox(0F, 0F, 0F, 38, 2, 4, 0F);
		bodyModel[12].setRotationPoint(-22F, 8F, 41F);

		bodyModel[13] = new ModelRendererTurbo(this, 263, 0, textureX, textureY);
		bodyModel[13].addBox(0F, 0F, 0F, 6, 1, 77, 0F);
		bodyModel[13].setRotationPoint(16F, 9F, -30F);

		bodyModel[14] = new ModelRendererTurbo(this, 263, 1, textureX, textureY);
		bodyModel[14].addBox(0F, 0F, 0F, 6, 1, 76, 0F);
		bodyModel[14].setRotationPoint(-28F, 9F, -29F);

		bodyModel[15] = new ModelRendererTurbo(this, 268, 6, textureX, textureY);
		bodyModel[15].addBox(0F, 0F, 0F, 6, 1, 71, 0F);
		bodyModel[15].setRotationPoint(16F, 21F, -26.7F);

		bodyModel[16] = new ModelRendererTurbo(this, 268, 6, textureX, textureY);
		bodyModel[16].addBox(0F, 0F, 0F, 6, 1, 71, 0F);
		bodyModel[16].setRotationPoint(-28F, 21F, -26.7F);

		bodyModel[17] = new ModelRendererTurbo(this, 256, 0, textureX, textureY);
		bodyModel[17].addBox(0F, 0F, 0F, 6, 6, 1, 0F);
		bodyModel[17].setRotationPoint(-28F, 16.6F, -29F);
		bodyModel[17].rotateAngleX = 0.3665192F;

		bodyModel[18] = new ModelRendererTurbo(this, 256, 0, textureX, textureY);
		bodyModel[18].addBox(0F, 0F, 0F, 6, 6, 1, 0F);
		bodyModel[18].setRotationPoint(-28F, 16.2F, 45.6F);
		bodyModel[18].rotateAngleX = -0.3665192F;

		bodyModel[19] = new ModelRendererTurbo(this, 256, 0, textureX, textureY);
		bodyModel[19].addBox(0F, 0F, 0F, 6, 7, 1, 0F);
		bodyModel[19].setRotationPoint(-28F, 9.5F, 46F);
		bodyModel[19].rotateAngleX = -0.06981317F;

		bodyModel[20] = new ModelRendererTurbo(this, 256, 0, textureX, textureY);
		bodyModel[20].addBox(0F, 0F, 0F, 6, 8, 1, 0F);
		bodyModel[20].setRotationPoint(-28F, 9.1F, -30F);
		bodyModel[20].rotateAngleX = 0.1396263F;

		bodyModel[21] = new ModelRendererTurbo(this, 256, 0, textureX, textureY);
		bodyModel[21].addBox(0F, 0F, 0F, 6, 6, 1, 0F);
		bodyModel[21].setRotationPoint(16F, 16.4F, -29F);
		bodyModel[21].rotateAngleX = 0.3665192F;

		bodyModel[22] = new ModelRendererTurbo(this, 256, 0, textureX, textureY);
		bodyModel[22].addBox(0F, 0F, 0F, 6, 8, 1, 0F);
		bodyModel[22].setRotationPoint(16F, 9.1F, -30F);
		bodyModel[22].rotateAngleX = 0.1396263F;

		bodyModel[23] = new ModelRendererTurbo(this, 256, 0, textureX, textureY);
		bodyModel[23].addBox(0F, 0F, 0F, 6, 7, 1, 0F);
		bodyModel[23].setRotationPoint(16F, 9.2F, 46F);
		bodyModel[23].rotateAngleX = -0.06981317F;

		bodyModel[24] = new ModelRendererTurbo(this, 256, 0, textureX, textureY);
		bodyModel[24].addBox(0F, 0F, 0F, 6, 6, 1, 0F);
		bodyModel[24].setRotationPoint(16F, 15.9F, 45.5F);
		bodyModel[24].rotateAngleX = -0.3665192F;

		bodyModel[25] = new ModelRendererTurbo(this, 256, 80, textureX, textureY);
		bodyModel[25].addBox(0F, 0F, 0F, 5, 6, 6, 0F);
		bodyModel[25].setRotationPoint(15.5F, 10F, -28.1F);

		bodyModel[26] = new ModelRendererTurbo(this, 256, 80, textureX, textureY);
		bodyModel[26].addBox(0F, 0F, 0F, 5, 6, 6, 0F);
		bodyModel[26].setRotationPoint(-26.5F, 10F, -28.1F);

		bodyModel[27] = new ModelRendererTurbo(this, 256, 80, textureX, textureY);
		bodyModel[27].addBox(0F, 0F, 0F, 5, 6, 6, 0F);
		bodyModel[27].setRotationPoint(-26.5F, 10F, 39.5F);

		bodyModel[28] = new ModelRendererTurbo(this, 256, 80, textureX, textureY);
		bodyModel[28].addBox(0F, 0F, 0F, 5, 6, 6, 0F);
		bodyModel[28].setRotationPoint(15.5F, 10F, 39.5F);
		
		//Wheels in the tracks
		for(int i = 0; i < 10; i++)
		{
			//Left wheel
			bodyModel[29 + i] = new ModelRendererTurbo(this, 256, 80, textureX, textureY);
			bodyModel[29 + i].addBox(0F, 0F, 0F, 3, 4, 4, 0F);
			bodyModel[29 + i].setRotationPoint(16F, 17F, -20F + 6 * i);
			
			//Right wheel
			bodyModel[39 + i] = new ModelRendererTurbo(this, 256, 80, textureX, textureY);
			bodyModel[39 + i].addBox(0F, 0F, 0F, 3, 4, 4, 0F);
			bodyModel[39 + i].setRotationPoint(-25F, 17F, -20F + 6 * i);
		}
	

		bodyModel[49] = new ModelRendererTurbo(this, 0, 87, textureX, textureY);
		bodyModel[49].addBox(0F, 0F, 0F, 1, 20, 61, 0F);
		bodyModel[49].setRotationPoint(23F, -2F, -22F);

		bodyModel[50] = new ModelRendererTurbo(this, 0, 87, textureX, textureY);
		bodyModel[50].addBox(0F, 0F, 0F, 1, 20, 61, 0F);
		bodyModel[50].setRotationPoint(-30F, -2F, -22F);

		bodyModel[51] = new ModelRendererTurbo(this, 0, 172, textureX, textureY);
		bodyModel[51].addBox(0F, 0F, 0F, 52, 1, 1, 0F);
		bodyModel[51].setRotationPoint(-29F, 5F, 0F);

		bodyModel[52] = new ModelRendererTurbo(this, 0, 172, textureX, textureY);
		bodyModel[52].addBox(0F, 0F, 0F, 52, 1, 1, 0F);
		bodyModel[52].setRotationPoint(-29F, 5F, 24F);

		bodyModel[53] = new ModelRendererTurbo(this, 140, 100, textureX, textureY);
		bodyModel[53].addBox(0F, 0F, 0F, 8, 1, 8, 0F);
		bodyModel[53].setRotationPoint(-19F, -1.5F, -19F);

		bodyModel[54] = new ModelRendererTurbo(this, 140, 100, textureX, textureY);
		bodyModel[54].addBox(0F, 0F, 0F, 8, 1, 8, 0F);
		bodyModel[54].setRotationPoint(5F, -1.5F, -19F);

		bodyModel[55] = new ModelRendererTurbo(this, 295, 0, textureX, textureY);
		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 8, 0F);
		bodyModel[55].setRotationPoint(-14F, 2F, -27F);

		bodyModel[56] = new ModelRendererTurbo(this, 294, 0, textureX, textureY);
		bodyModel[56].addBox(0F, 0F, 0F, 7, 3, 1, 0F);
		bodyModel[56].setRotationPoint(2F, 1F, -21.4F);

		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[57].addBox(0F, 0F, 0F, 7, 2, 1, 0F);
		bodyModel[57].setRotationPoint(2F, 0.9F, -21.9F);
		bodyModel[57].rotateAngleX = -0.08726646F;
		
		
		//Turret
		
		turretModel = new ModelRendererTurbo[27];
		
		turretModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[0].addBox(0F, 0F, 0F, 11, 9, 2, 0F);
		turretModel[0].setRotationPoint(-11F, -10F, -5.9F);
		turretModel[0].rotateAngleX = -0.122173F;

		turretModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[1].addBox(0F, 0F, 0F, 11, 4, 1, 0F);
		turretModel[1].setRotationPoint(4.9F, -5F, -6.5F);
		turretModel[1].rotateAngleX = 0.1745329F;
		turretModel[1].rotateAngleY = -0.8552113F;

		turretModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[2].addBox(0F, 0F, 0F, 11, 4, 1, 0F);
		turretModel[2].setRotationPoint(-18.1F, -5F, 2.3F);
		turretModel[2].rotateAngleX = 0.1745329F;
		turretModel[2].rotateAngleY = 0.8552113F;

		turretModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[3].addBox(0F, 0F, 0F, 10, 5, 1, 0F);
		turretModel[3].setRotationPoint(4.3F, -9.7F, -5.5F);
		turretModel[3].rotateAngleX = -0.2268928F;
		turretModel[3].rotateAngleY = -0.8552113F;

		turretModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[4].addBox(0F, 0F, 0F, 10, 5, 1, 0F);
		turretModel[4].setRotationPoint(-17F, -10F, 2.5F);
		turretModel[4].rotateAngleX = -0.2268928F;
		turretModel[4].rotateAngleY = 0.8552113F;

		turretModel[5] = new ModelRendererTurbo(this, 200, 100, textureX, textureY);
		turretModel[5].addBox(0F, 0F, 0F, 1, 9, 23, 0F);
		turretModel[5].setRotationPoint(9.2F, -9F, 1F);
		turretModel[5].rotateAngleZ = -0.4363323F;

		turretModel[6] = new ModelRendererTurbo(this, 200, 100, textureX, textureY);
		turretModel[6].addBox(0F, 0F, 0F, 1, 9, 22, 0F);
		turretModel[6].setRotationPoint(-16F, -9.5F, 2F);
		turretModel[6].rotateAngleZ = 0.4363323F;

		turretModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[7].addBox(0F, 0F, 0F, 5, 3, 2, 0F);
		turretModel[7].setRotationPoint(0F, -10F, -5.9F);
		turretModel[7].rotateAngleX = -0.122173F;

		turretModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[8].addBox(0F, 0F, 0F, 5, 3, 2, 0F);
		turretModel[8].setRotationPoint(0F, -4F, -6.7F);
		turretModel[8].rotateAngleX = -0.122173F;

		turretModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[9].addBox(0F, 0F, 0F, 1, 4, 2, 0F);
		turretModel[9].setRotationPoint(4F, -8F, -6.1F);
		turretModel[9].rotateAngleX = -0.122173F;

		turretModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[10].addBox(0F, 0F, 0F, 3, 5, 1, 0F);
		turretModel[10].setRotationPoint(8.5F, -4F, 1F);
		turretModel[10].rotateAngleZ = -0.4363323F;

		turretModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[11].addBox(0F, 0F, 0F, 3, 5, 1, 0F);
		turretModel[11].setRotationPoint(-17F, -5F, 2F);
		turretModel[11].rotateAngleZ = 0.4363323F;

		turretModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[12].addBox(0F, 0F, 0F, 2, 8, 26, 0F);
		turretModel[12].setRotationPoint(10F, -9F, 23F);
		turretModel[12].rotateAngleY = -1.570796F;
		//turretModel[12].rotateAngleZ = -0.2268928F;

		turretModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[13].addBox(0F, 0F, 0F, 3, 8, 1, 0F);
		turretModel[13].setRotationPoint(7F, -7F, 24F);
		turretModel[13].rotateAngleX = 0.1047198F;
		turretModel[13].rotateAngleY = 0.296706F;
		turretModel[13].rotateAngleZ = -0.4363323F;

		turretModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[14].addBox(0F, 0F, 0F, 3, 8, 1, 0F);
		turretModel[14].setRotationPoint(-15F, -8F, 23.1F);
		turretModel[14].rotateAngleX = 0.1047198F;
		turretModel[14].rotateAngleY = -0.296706F;
		turretModel[14].rotateAngleZ = 0.4363323F;

		turretModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[15].addBox(0F, 0F, 0F, 26, 1, 12, 0F);
		turretModel[15].setRotationPoint(-16F, -10F, 1.5F);

		turretModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[16].addBox(0F, 0F, 0F, 16, 1, 7, 0F);
		turretModel[16].setRotationPoint(-11F, -10F, -5F);

		turretModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[17].addBox(0F, 0F, 0F, 8, 1, 12, 0F);
		turretModel[17].setRotationPoint(2F, -10F, 13F);

		turretModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[18].addBox(0F, 0F, 0F, 8, 1, 12, 0F);
		turretModel[18].setRotationPoint(-16F, -10F, 13F);

		turretModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[19].addBox(0F, 0F, 0F, 10, 1, 3, 0F);
		turretModel[19].setRotationPoint(-8F, -10F, 22F);

		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[20].addBox(0F, 0F, 0F, 4, 1, 8, 0F);
		turretModel[20].setRotationPoint(2F, -10F, -2F);
		turretModel[20].rotateAngleY = 0.715585F;

		turretModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[21].addBox(0F, 0F, 0F, 4, 1, 8, 0F);
		turretModel[21].setRotationPoint(-11F, -10F, -4F);
		turretModel[21].rotateAngleY = -0.715585F;
		
		turretModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[22].addBox(0F, 0F, 0F, 20, 8, 12, 0F);
		turretModel[22].setRotationPoint(-13F, -10F, 25F);
		turretModel[22].rotateAngleX = 0.03490658F;

		turretModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[23].addBox(0F, 0F, 0F, 10, 2, 2, 0F);
		turretModel[23].setRotationPoint(-8F, -12F, 11F);

		turretModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[24].addBox(0F, 0F, 0F, 10, 2, 2, 0F);
		turretModel[24].setRotationPoint(-8F, -12F, 22F);

		turretModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[25].addBox(0F, 0F, 0F, 2, 2, 9, 0F);
		turretModel[25].setRotationPoint(-10F, -12F, 13F);

		turretModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		turretModel[26].addBox(0F, 0F, 0F, 2, 2, 9, 0F);
		turretModel[26].setRotationPoint(2F, -12F, 13F);
		
		barrelModel = new ModelRendererTurbo[2];
				
		barrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		barrelModel[0].addBox(-2.5F, -2.5F, -4F, 5, 5, 8, 0F);
		barrelModel[0].setRotationPoint(-4.5F, -5.5F, -6F);

		barrelModel[1] = new ModelRendererTurbo(this, 126, 130, textureX, textureY);
		barrelModel[1].addBox(-1F, -1F, -36F, 2, 2, 32, 0F);
		barrelModel[1].setRotationPoint(-4.5F, -5.5F, -6F);
		
		//Gun model stolen from the browning
		ModelRendererTurbo[][] mg42Model = new ModelRendererTurbo[3][];
		
		//Yaw only part
		mg42Model[0] = new ModelRendererTurbo[0];
		
		//The main gun part
		mg42Model[1] = new ModelRendererTurbo[4];
		mg42Model[1][0] = new ModelRendererTurbo(this, 0, 28, textureX, textureY);
		mg42Model[1][1] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		mg42Model[1][2] = new ModelRendererTurbo(this, 8, 26, textureX, textureY);
		mg42Model[1][3] = new ModelRendererTurbo(this, 18, 19, textureX, textureY);
		
		mg42Model[1][0].addBox(0F, 3F, -1F, 16, 2, 2);
		mg42Model[1][1].addBox(4F, 5F, -1F, 2, 3, 2);	
		mg42Model[1][2].addBox(16F, 3.5F, -0.5F, 4, 1, 1);		
		mg42Model[1][3].addBox(8F, 3F, -6F, 2, 4, 5);
		
		//Set the origin
		for(ModelRendererTurbo gunPart : mg42Model[1])
			gunPart.setRotationPoint(0F, -24F, 4F);
		
		//No recoil part
				mg42Model[2] = new ModelRendererTurbo[0];
				
		registerGunModel("MG42", mg42Model);
		*/
		
    	
		//Old model follows
    	
    	int textureX = 256;
    	int textureY = 256;
	
        bodyModel = new ModelRendererTurbo[4];	
	    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 68, textureX, textureY);
	    bodyModel[2] = new ModelRendererTurbo(this, 0, 184, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 0, 184, textureX, textureY);
	
		bodyModel[0].addBox(-40F, -20F, -24F, 80, 20, 48, 0.0F);		//Tank Body
        bodyModel[1].addTrapezoid(-40F, -32F, -24F, 72, 12, 48, 0.0F, -2.0F, ModelRendererTurbo.MR_TOP);		//Sloped body
		bodyModel[2].addBox(-36F, -32F, -26F, 72, 20, 2, 0.0F);		//Left Panel
		bodyModel[3].addBox(-36F, -32F, -26F, 72, 20, 2, 0.0F);		//Right Panel
		bodyModel[3].rotateAngleY = 3.1415926535F;
		
		turretModel = new ModelRendererTurbo[2];
		turretModel[0] = new ModelRendererTurbo(this, 0, 132, textureX, textureY);
		turretModel[1] = new ModelRendererTurbo(this, 128, 132, textureX, textureY);
		turretModel[0].addTrapezoid(-16F, -6F, -16F, 32, 12, 32, 0.0F, -2.0F, ModelRendererTurbo.MR_TOP);	
		turretModel[1].flip = true;
		turretModel[1].addTrapezoid(-15.5F, -6F, -15.5F, 31, 9, 31, 0.0F, -1.5F, ModelRendererTurbo.MR_TOP);	
		
		turretModel[0].setRotationPoint(0F, -38F, 0F);	
		turretModel[1].setRotationPoint(0F, -38F, 0F);	
		
		barrelModel = new ModelRendererTurbo[1];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 176, textureX, textureY);
		barrelModel[0].addBox(-2F, -2F, -2F, 60, 4, 4, 0.0F);
		barrelModel[0].setRotationPoint(15F, -38F, 0F);	

		//Gun model stolen from the browning
		ModelRendererTurbo[][] mg42Model = new ModelRendererTurbo[3][];
		
		//Yaw only part
		mg42Model[0] = new ModelRendererTurbo[0];
		
		//The main gun part
		mg42Model[1] = new ModelRendererTurbo[4];
		mg42Model[1][0] = new ModelRendererTurbo(this, 0, 28, textureX, textureY);
		mg42Model[1][1] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
		mg42Model[1][2] = new ModelRendererTurbo(this, 8, 26, textureX, textureY);
		mg42Model[1][3] = new ModelRendererTurbo(this, 18, 19, textureX, textureY);
		
		mg42Model[1][0].addBox(0F, 3F, -1F, 16, 2, 2);
		mg42Model[1][1].addBox(4F, 5F, -1F, 2, 3, 2);	
		mg42Model[1][2].addBox(16F, 3.5F, -0.5F, 4, 1, 1);		
		mg42Model[1][3].addBox(8F, 3F, -6F, 2, 4, 5);
		
		//Set the origin
		for(ModelRendererTurbo gunPart : mg42Model[1])
			gunPart.setRotationPoint(0F, -52F, 0F);
		
		//No recoil part
				mg42Model[2] = new ModelRendererTurbo[0];
				
		registerGunModel("MG42", mg42Model);
		
		flipAll(); //For old models
		translateAll(0, -8, 0);
    }
}
