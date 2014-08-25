package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMIM23 extends ModelVehicle 
{
	public ModelMIM23()
	{
		int textureX = 256;
		int textureY = 256;
		
		bodyModel = new ModelRendererTurbo[4];
		
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);	//Centrepiece
		bodyModel[0].addBox(-24F, -4F, -8F, 48, 9, 16);
		
		bodyModel[1] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);	//Track cover piece
		bodyModel[1].addBox(-24F, 5F, -16F, 48, 1, 32);
		
		bodyModel[2] = new ModelRendererTurbo(this, 0, 58, textureX, textureY);	//Front mudflap
		bodyModel[2].addBox(0F, -1F, -16F, 6, 1, 32);
		bodyModel[2].setRotationPoint(24F, 6F, 0F);
		bodyModel[2].rotateAngleZ = -(float)Math.PI / 4F;
		
		bodyModel[3] = new ModelRendererTurbo(this, 0, 58, textureX, textureY);	//Rear mudflap
		bodyModel[3].addBox(0F, -1F, -16F, 6, 1, 32);
		bodyModel[3].setRotationPoint(-24F, 6F, 0F);
		bodyModel[3].rotateAngleZ = -(float)Math.PI / 4F;
		bodyModel[3].rotateAngleY = (float)Math.PI;

		leftTrackModel = new ModelRendererTurbo[8];
		
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);	//Left track bottom
		leftTrackModel[0].addBox(-23F, -8F, -16F, 46, 1, 8);
		
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 104, textureX, textureY);	//Left track top
		leftTrackModel[1].addBox(-23F, 3F, -16F, 46, 1, 8);
		
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 114, textureX, textureY);	//Left track back
		leftTrackModel[2].addBox(-23F, -7F, -16F, 1, 10, 8);
		
		leftTrackModel[3] = new ModelRendererTurbo(this, 20, 114, textureX, textureY);	//Left track front
		leftTrackModel[3].addBox(22F, -7F, -16F, 1, 10, 8);
		
		leftTrackModel[4] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);	//Left track wheel 1
		leftTrackModel[4].addBox(-21.5F, -6.5F, -16F, 9, 9, 4);
		
		leftTrackModel[5] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);	//Left track wheel 2
		leftTrackModel[5].addBox(-10.5F, -6.5F, -16F, 9, 9, 4);

		leftTrackModel[6] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);	//Left track wheel 3
		leftTrackModel[6].addBox(1.5F, -6.5F, -16F, 9, 9, 4);

		leftTrackModel[7] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);	//Left track wheel 4
		leftTrackModel[7].addBox(12.5F, -6.5F, -16F, 9, 9, 4);

		rightTrackModel = new ModelRendererTurbo[8];
		
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);	//Right track bottom
		rightTrackModel[0].addBox(-23F, -8F, -16F, 46, 1, 8);
		rightTrackModel[0].rotateAngleY = (float)Math.PI;
		
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 104, textureX, textureY);	//Right track top
		rightTrackModel[1].addBox(-23F, 3F, -16F, 46, 1, 8);
		rightTrackModel[1].rotateAngleY = (float)Math.PI;
		
		rightTrackModel[2] = new ModelRendererTurbo(this, 0, 114, textureX, textureY);	//Right track back
		rightTrackModel[2].addBox(-23F, -7F, -16F, 1, 10, 8);
		rightTrackModel[2].rotateAngleY = (float)Math.PI;
		
		rightTrackModel[3] = new ModelRendererTurbo(this, 20, 114, textureX, textureY);	//Right track front
		rightTrackModel[3].addBox(22F, -7F, -16F, 1, 10, 8);
		rightTrackModel[3].rotateAngleY = (float)Math.PI;
		
		rightTrackModel[4] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);	//Right track wheel 1
		rightTrackModel[4].addBox(-21.5F, -6.5F, -16F, 9, 9, 4);
		rightTrackModel[4].rotateAngleY = (float)Math.PI;
		
		rightTrackModel[5] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);	//Right track wheel 2
		rightTrackModel[5].addBox(-10.5F, -6.5F, -16F, 9, 9, 4);
		rightTrackModel[5].rotateAngleY = (float)Math.PI;
		
		rightTrackModel[6] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);	//Right track wheel 3
		rightTrackModel[6].addBox(1.5F, -6.5F, -16F, 9, 9, 4);
		rightTrackModel[6].rotateAngleY = (float)Math.PI;
		
		rightTrackModel[7] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);	//Right track wheel 4
		rightTrackModel[7].addBox(12.5F, -6.5F, -16F, 9, 9, 4);
		rightTrackModel[7].rotateAngleY = (float)Math.PI;
		
		turretModel = new ModelRendererTurbo[7];
		
		turretModel[0] = new ModelRendererTurbo(this, 0, 134, textureX, textureY);	//Turret base
		turretModel[0].addBox(-12F, 6F, -12F, 24, 2, 24);
		
		turretModel[1] = new ModelRendererTurbo(this, 0, 162, textureX, textureY);	//Seat back
		turretModel[1].addBox(4F, 8F, -6F, 1, 16, 12);
		
		turretModel[2] = new ModelRendererTurbo(this, 28, 162, textureX, textureY);	//Seat footrest
		turretModel[2].addBox(12F, 6F, -6F, 4, 2, 12);
		
		turretModel[3] = new ModelRendererTurbo(this, 0, 192, textureX, textureY);	//Supports for missile stand
		turretModel[3].addShapeBox(-12F, 8F, -6F, 16, 16, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -8F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -8F, 0F, 0F);	
		
		turretModel[4] = new ModelRendererTurbo(this, 0, 212, textureX, textureY);	//Supports for missile stand
		turretModel[4].addBox(-4F, 24F, -6F, 8, 8, 2);
		
		turretModel[5] = new ModelRendererTurbo(this, 38, 192, textureX, textureY);	//Supports for missile stand
		turretModel[5].addShapeBox(-12F, 8F, 4F, 16, 16, 2, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ -8F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ -8F, 0F, 0F);	
		
		turretModel[6] = new ModelRendererTurbo(this, 38, 212, textureX, textureY);	//Supports for missile stand
		turretModel[6].addBox(-4F, 24F, 4F, 8, 8, 2);
		
		barrelModel = new ModelRendererTurbo[4];
		
		barrelModel[0] = new ModelRendererTurbo(this, 0, 224, textureX, textureY);	//Missile centre piece
		barrelModel[0].addBox(-12F, -4F, -4F, 24, 8, 8);
		barrelModel[0].setRotationPoint(0F, 32F, 0F);
		
		barrelModel[1] = new ModelRendererTurbo(this, 0, 242, textureX, textureY);	//Missile attachment rail
		barrelModel[1].addBox(-6F, 4F, -1F, 12, 8, 2);
		barrelModel[1].setRotationPoint(0F, 32F, 0F);
		
		barrelModel[2] = new ModelRendererTurbo(this, 30, 242, textureX, textureY);	//Missile attachment rail
		barrelModel[2].addBox(-6F, -1F, -12F, 12, 2, 8);
		barrelModel[2].setRotationPoint(0F, 32F, 0F);
		
		barrelModel[3] = new ModelRendererTurbo(this, 30, 242, textureX, textureY);	//Missile attachment rail
		barrelModel[3].addBox(-6F, -1F, 4F, 12, 2, 8);
		barrelModel[3].setRotationPoint(0F, 32F, 0F);
		
		ammoModel = new ModelRendererTurbo[3][4];
		
		for(int i = 0; i < 3; i++)
		{
			float yOffset = i == 1 ? 12F : 0F;
			
			ammoModel[i] = new ModelRendererTurbo[4];
			
			ammoModel[i][0] = new ModelRendererTurbo(this, 72, 212, textureX, textureY);
			ammoModel[i][0].addBox(-20F, -3F + yOffset, -3F + i * 12F - 12F, 40, 6, 6);
			
			ammoModel[i][1] = new ModelRendererTurbo(this, 72, 226, textureX, textureY);
			ammoModel[i][1].addTrapezoid(20F, -3F + yOffset, -3F + i * 12F - 12F, 8, 6, 6, 0F, -3F, ModelRendererTurbo.MR_LEFT);
			
			ammoModel[i][2] = new ModelRendererTurbo(this, 102, 226, textureX, textureY);
			ammoModel[i][2].addShapeBox(-20F, -7F + yOffset, 0F + i * 12F - 12F, 20, 14, 0, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, -4F, 0F, /* 2 */ 0F, -4F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, -4F, 0F, /* 6 */ 0F, -4F, 0F, /* 7 */ 0F, 0F, 0F);	
			
			ammoModel[i][3] = new ModelRendererTurbo(this, 88, 242, textureX, textureY);
			ammoModel[i][3].addShapeBox(-20F, 0F + yOffset, -7F + i * 12F - 12F, 20, 0, 14, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, -4F, /* 2 */ 0F, 0F, -4F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, -4F, /* 6 */ 0F, 0F, -4F, /* 7 */ 0F, 0F, 0F);	

			for(int j = 0; j < 4; j++)
			{
				ammoModel[i][j].setRotationPoint(0F, 32F, 0F);
			}
		}
	}
}
