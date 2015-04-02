//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelT34 extends ModelVehicle
{
	int textureX = 512;
	int textureY = 1024;

	public ModelT34()
	{
		bodyModel = new ModelRendererTurbo[21];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // UnderBody
		bodyModel[1] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // UnderBase
		bodyModel[2] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Trackguards
		bodyModel[3] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Shape3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Box 3
		bodyModel[13] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 4
		bodyModel[14] = new ModelRendererTurbo(this, 0, 540, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 1
		bodyModel[17] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 3
		bodyModel[19] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Box 10
		bodyModel[20] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Box 66

		bodyModel[0].addShapeBox(0F, 0F, -1F, 108, 14, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F); // UnderBody
		bodyModel[0].setRotationPoint(-73F, -11F, -18F);

		bodyModel[1].addBox(0F, 0F, 0F, 89, 4, 37, 0F); // UnderBase
		bodyModel[1].setRotationPoint(-62F, -1.5F, -19F);

		bodyModel[2].addBox(0F, 0F, 0F, 93, 3, 54, 0F); // Trackguards
		bodyModel[2].setRotationPoint(-65F, -14F, -27F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F); // Shape3
		bodyModel[3].setRotationPoint(-78F, -14F, 18F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 41, 14, 24, 0F,35F, -2F, 7F, 0F, -2F, 7F, 0F, -2F, 7F, 35F, -2F, 7F, 50F, 0F, 15F, 15F, 0F, 15F, 15F, 0F, 15F, 50F, 0F, 15F); // Box 6
		bodyModel[4].setRotationPoint(-20.3F, -25F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 9, 37, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 10F, 0F, 15F, -3F, 0F, 15F, -3F, 0F, -6F, 10F, 0F); // Box 7
		bodyModel[5].setRotationPoint(25F, -17F, -19F);
		bodyModel[5].rotateAngleZ = -0.15707963F;

		bodyModel[6].addBox(0F, 0F, -3F, 17, 8, 3, 0F); // Box 17
		bodyModel[6].setRotationPoint(-56F, -22F, -20F);
		bodyModel[6].rotateAngleX = -0.17453293F;

		bodyModel[7].addBox(0F, 0F, 0F, 17, 8, 3, 0F); // Box 18
		bodyModel[7].setRotationPoint(-56F, -22F, 19F);
		bodyModel[7].rotateAngleX = 0.17453293F;

		bodyModel[8].addBox(0F, 0F, -3F, 17, 8, 3, 0F); // Box 19
		bodyModel[8].setRotationPoint(-37F, -22F, -20F);
		bodyModel[8].rotateAngleX = -0.17453293F;

		bodyModel[9].addBox(0F, 0F, 0F, 17, 8, 3, 0F); // Box 20
		bodyModel[9].setRotationPoint(-37F, -22F, 19F);
		bodyModel[9].rotateAngleX = 0.17453293F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[10].setRotationPoint(28F, -14F, 18F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 19, 3, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(28F, -14F, -27F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 3
		bodyModel[12].setRotationPoint(25F, -19F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 9, 14, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 4
		bodyModel[13].setRotationPoint(27F, -18F, 0F);
		bodyModel[13].rotateAngleZ = 0.87266463F;

		bodyModel[14].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 20
		bodyModel[14].setRotationPoint(31F, -16.5F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 3F, 17, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-37F, -22F, 19F);
		bodyModel[15].rotateAngleX = 0.17453293F;

		bodyModel[16].addShapeBox(0F, 0F, 3F, 17, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[16].setRotationPoint(-56F, -22F, 19F);
		bodyModel[16].rotateAngleX = 0.17453293F;

		bodyModel[17].addShapeBox(0F, 0F, -6F, 17, 8, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[17].setRotationPoint(-37F, -22F, -20F);
		bodyModel[17].rotateAngleX = -0.17453293F;

		bodyModel[18].addShapeBox(0F, 0F, -6F, 17, 8, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[18].setRotationPoint(-56F, -22F, -20F);
		bodyModel[18].rotateAngleX = -0.17453293F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F); // Box 10
		bodyModel[19].setRotationPoint(-78F, -14F, -27F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 35, 1, 7, 0F,0F, 0F, 29F, 0F, 0F, 29F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 30F, 1F, 0F, 30F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 66
		bodyModel[20].setRotationPoint(-54.3F, -24F, 11F);


		turretModel = new ModelRendererTurbo[14];
		turretModel[0] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Box 2
		turretModel[1] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Box 3
		turretModel[2] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Box 5
		turretModel[3] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 7
		turretModel[4] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Box 8
		turretModel[5] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Box 9
		turretModel[6] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Box 10
		turretModel[7] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Box 11
		turretModel[8] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 12
		turretModel[9] = new ModelRendererTurbo(this, 200, 350, textureX, textureY); // Box 16
		turretModel[10] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Box 5
		turretModel[11] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Box 8
		turretModel[12] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Box 9
		turretModel[13] = new ModelRendererTurbo(this, 200, 440, textureX, textureY); // Box 67

		turretModel[0].addShapeBox(-1F, -25F, -12F, 18, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 2
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addShapeBox(-6F, -25F, -12F, 5, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addShapeBox(-18F, -25F, -12F, 12, 2, 24, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 5
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addShapeBox(-1F, -26F, -13F, 19, 1, 26, 0F,0F, 0F, 3F, 2F, 0F, -3F, 2F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 7
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addShapeBox(-6F, -26F, -13F, 3, 1, 26, 0F,0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addShapeBox(-20F, -26F, -13F, 12, 1, 26, 0F,1F, 0F, -3F, 2F, 0F, 3F, 2F, 0F, 3F, 1F, 0F, -3F, 0F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -5F); // Box 9
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addShapeBox(-1F, -38F, -13F, 18, 12, 26, 0F,0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 3F); // Box 10
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addShapeBox(-6F, -38F, -13F, 3, 12, 26, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 3F, 0F, 0F, 3F); // Box 11
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addShapeBox(-18F, -38F, -13F, 12, 12, 26, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 3F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 3F, 0F, -3F); // Box 12
		turretModel[8].setRotationPoint(0F, 0F, 0F);

		turretModel[9].addBox(15F, -36F, -6F, 4, 9, 12, 0F); // Box 16
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addBox(-9.5F, -40F, -5.5F, 11, 2, 15, 0F); // Box 5
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addShapeBox(-11.5F, -40F, -5.5F, 2, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 8
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addShapeBox(1.5F, -40F, -5.5F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 9
		turretModel[12].setRotationPoint(0F, 0F, 0F);

		turretModel[13].addShapeBox(19F, -36F, -6F, 2, 9, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 67
		turretModel[13].setRotationPoint(0F, 0F, 0F);


		barrelModel = new ModelRendererTurbo[2];
		barrelModel[0] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Box 14
		barrelModel[1] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Box 15

		barrelModel[0].addShapeBox(8F, -2F, -1F, 35, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 14
		barrelModel[0].setRotationPoint(20F, -31.5F, 0F);

		barrelModel[1].addShapeBox(0F, -3F, -2F, 8, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[1].setRotationPoint(20F, -31.5F, 0F);


		leftTrackModel = new ModelRendererTurbo[27];
		leftTrackModel[0] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // TrackTop
		leftTrackModel[1] = new ModelRendererTurbo(this, 200, 530, textureX, textureY); //  TrackRearLeft
		leftTrackModel[2] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // TrackFrontLeft
		leftTrackModel[3] = new ModelRendererTurbo(this, 200, 590, textureX, textureY); // TrackBottomLeft
		leftTrackModel[4] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // TrackFrontAngledLeft
		leftTrackModel[5] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // TrackRearAngledLeft
		leftTrackModel[6] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 6
		leftTrackModel[7] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 14
		leftTrackModel[8] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 15
		leftTrackModel[9] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 16
		leftTrackModel[10] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 17
		leftTrackModel[11] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 18
		leftTrackModel[12] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Box 19
		leftTrackModel[13] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Box 4
		leftTrackModel[14] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Box 5
		leftTrackModel[15] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 6
		leftTrackModel[16] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 7
		leftTrackModel[17] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 11
		leftTrackModel[18] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 12
		leftTrackModel[19] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 13
		leftTrackModel[20] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 14
		leftTrackModel[21] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 15
		leftTrackModel[22] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 16
		leftTrackModel[23] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 17
		leftTrackModel[24] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 18
		leftTrackModel[25] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 19
		leftTrackModel[26] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Box 20

		leftTrackModel[0].addBox(0F, 0F, 0F, 109, 1, 8, 0F); // TrackTop
		leftTrackModel[0].setRotationPoint(-73F, -9F, 18F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 1, 9, 8, 0F); //  TrackRearLeft
		leftTrackModel[1].setRotationPoint(-73F, -8F, 18F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackFrontLeft
		leftTrackModel[2].setRotationPoint(35F, -8F, 18F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 85, 1, 8, 0F); // TrackBottomLeft
		leftTrackModel[3].setRotationPoint(-62F, 9F, 18F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // TrackFrontAngledLeft
		leftTrackModel[4].setRotationPoint(36F, -1F, 26.01F);
		leftTrackModel[4].rotateAngleY = -3.14159265F;
		leftTrackModel[4].rotateAngleZ = 0.85521133F;

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // TrackRearAngledLeft
		leftTrackModel[5].setRotationPoint(-73F, 1F, 18.01F);
		leftTrackModel[5].rotateAngleZ = 0.89011792F;

		leftTrackModel[6].addBox(0F, 2F, 0F, 8, 4, 7, 0F); // Box 6
		leftTrackModel[6].setRotationPoint(27F, -8F, 18F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 13, 9, 7, 0F); // Box 14
		leftTrackModel[7].setRotationPoint(10F, -2F, 19F);

		leftTrackModel[8].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Box 15
		leftTrackModel[8].setRotationPoint(-8F, -4F, 19F);

		leftTrackModel[9].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Box 16
		leftTrackModel[9].setRotationPoint(-26F, -4F, 19F);

		leftTrackModel[10].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Box 17
		leftTrackModel[10].setRotationPoint(-44F, -4F, 19F);

		leftTrackModel[11].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Box 18
		leftTrackModel[11].setRotationPoint(-62F, -4F, 18F);

		leftTrackModel[12].addBox(0F, 2F, 0F, 9, 5, 7, 0F); // Box 19
		leftTrackModel[12].setRotationPoint(-72F, -8F, 19F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 4
		leftTrackModel[13].setRotationPoint(27F, -2F, 18F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftTrackModel[14].setRotationPoint(27F, -8F, 18F);

		leftTrackModel[15].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[15].setRotationPoint(10F, -2F, 19F);

		leftTrackModel[16].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 7
		leftTrackModel[16].setRotationPoint(10F, -2F, 19F);

		leftTrackModel[17].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftTrackModel[17].setRotationPoint(-8F, -2F, 19F);

		leftTrackModel[18].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[18].setRotationPoint(-26F, -2F, 19F);

		leftTrackModel[19].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[19].setRotationPoint(-44F, -2F, 19F);

		leftTrackModel[20].addShapeBox(0F, -2F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackModel[20].setRotationPoint(-62F, -2F, 18F);

		leftTrackModel[21].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 15
		leftTrackModel[21].setRotationPoint(-8F, -2F, 19F);

		leftTrackModel[22].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 16
		leftTrackModel[22].setRotationPoint(-26F, -2F, 19F);

		leftTrackModel[23].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 17
		leftTrackModel[23].setRotationPoint(-44F, -2F, 19F);

		leftTrackModel[24].addShapeBox(0F, 9F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 18
		leftTrackModel[24].setRotationPoint(-62F, -2F, 18F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		leftTrackModel[25].setRotationPoint(-72F, -8F, 19F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 20
		leftTrackModel[26].setRotationPoint(-72F, -1F, 19F);


		rightTrackModel = new ModelRendererTurbo[27];
		rightTrackModel[0] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // TrackTop
		rightTrackModel[1] = new ModelRendererTurbo(this, 200, 530, textureX, textureY); // TrackRearRight
		rightTrackModel[2] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // TrackFrontRight
		rightTrackModel[3] = new ModelRendererTurbo(this, 200, 590, textureX, textureY); // TrackBottomRight
		rightTrackModel[4] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // TrackFrontAngledRight
		rightTrackModel[5] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // TrackRearAngledRight
		rightTrackModel[6] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 7
		rightTrackModel[7] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 8
		rightTrackModel[8] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 9
		rightTrackModel[9] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 10
		rightTrackModel[10] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 11
		rightTrackModel[11] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 12
		rightTrackModel[12] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Box 13
		rightTrackModel[13] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Box 21
		rightTrackModel[14] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Box 22
		rightTrackModel[15] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 23
		rightTrackModel[16] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 24
		rightTrackModel[17] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 25
		rightTrackModel[18] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 26
		rightTrackModel[19] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 27
		rightTrackModel[20] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 28
		rightTrackModel[21] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 29
		rightTrackModel[22] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 30
		rightTrackModel[23] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 31
		rightTrackModel[24] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Box 32
		rightTrackModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		rightTrackModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34

		rightTrackModel[0].addBox(0F, 0F, 0F, 109, 1, 8, 0F); // TrackTop
		rightTrackModel[0].setRotationPoint(-73F, -9F, -27F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 1, 9, 8, 0F); // TrackRearRight
		rightTrackModel[1].setRotationPoint(-73F, -8F, -27F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // TrackFrontRight
		rightTrackModel[2].setRotationPoint(35F, -8F, -27F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 85, 1, 8, 0F); // TrackBottomRight
		rightTrackModel[3].setRotationPoint(-62F, 9F, -27F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // TrackFrontAngledRight
		rightTrackModel[4].setRotationPoint(36F, -1F, -19.01F);
		rightTrackModel[4].rotateAngleY = -3.14159265F;
		rightTrackModel[4].rotateAngleZ = 0.87266463F;

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // TrackRearAngledRight
		rightTrackModel[5].setRotationPoint(-73F, 1F, -27.01F);
		rightTrackModel[5].rotateAngleZ = 0.89011792F;

		rightTrackModel[6].addBox(0F, 2F, 0F, 8, 4, 7, 0F); // Box 7
		rightTrackModel[6].setRotationPoint(27F, -8F, -26F);

		rightTrackModel[7].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Box 8
		rightTrackModel[7].setRotationPoint(10F, -4F, -26F);

		rightTrackModel[8].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Box 9
		rightTrackModel[8].setRotationPoint(-8F, -4F, -26F);

		rightTrackModel[9].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Box 10
		rightTrackModel[9].setRotationPoint(-26F, -4F, -26F);

		rightTrackModel[10].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Box 11
		rightTrackModel[10].setRotationPoint(-44F, -4F, -26F);

		rightTrackModel[11].addBox(0F, 2F, 0F, 13, 9, 7, 0F); // Box 12
		rightTrackModel[11].setRotationPoint(-62F, -4F, -26F);

		rightTrackModel[12].addBox(0F, 2F, 0F, 9, 5, 7, 0F); // Box 13
		rightTrackModel[12].setRotationPoint(-72F, -8F, -26F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		rightTrackModel[13].setRotationPoint(27F, -8F, -26F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 22
		rightTrackModel[14].setRotationPoint(27F, -2F, -26F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightTrackModel[15].setRotationPoint(10F, -4F, -26F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 24
		rightTrackModel[16].setRotationPoint(10F, 7F, -26F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightTrackModel[17].setRotationPoint(-8F, -4F, -26F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		rightTrackModel[18].setRotationPoint(-26F, -4F, -26F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightTrackModel[19].setRotationPoint(-44F, -4F, -26F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		rightTrackModel[20].setRotationPoint(-62F, -4F, -26F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 29
		rightTrackModel[21].setRotationPoint(-8F, 7F, -26F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 30
		rightTrackModel[22].setRotationPoint(-26F, 7F, -26F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 31
		rightTrackModel[23].setRotationPoint(-44F, 7F, -26F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 32
		rightTrackModel[24].setRotationPoint(-62F, 7F, -26F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightTrackModel[25].setRotationPoint(-72F, -8F, -26F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		rightTrackModel[26].setRotationPoint(-72F, -1F, -26F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}