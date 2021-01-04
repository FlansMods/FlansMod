//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelM45Quad extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelM45Quad() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[18];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 17

		bodyModel[0].addBox(0F, 0F, 0F, 9, 5, 3, 0F); // Box 1
		bodyModel[0].setRotationPoint(-8.5F, 3F, -16.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-8.5F, 1F, -16.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-8.5F, 8F, -16.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 9, 5, 3, 0F); // Box 5
		bodyModel[3].setRotationPoint(-8.5F, 3F, 13.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-8.5F, 1F, 13.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-8.5F, 8F, 13.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 34, 0F); // Box 8
		bodyModel[6].setRotationPoint(-5F, 4.5F, -17F);

		bodyModel[7].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 9
		bodyModel[7].setRotationPoint(12F, 4F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(18F, 4F, -2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[9].setRotationPoint(22F, 2F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 12
		bodyModel[10].setRotationPoint(23F, 2.5F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 13
		bodyModel[11].setRotationPoint(15F, 9F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 14
		bodyModel[12].setRotationPoint(16F, 6F, -1F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 25, 0F); // Box 13
		bodyModel[13].setRotationPoint(-12.5F, 3F, -12.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 3, 25, 0F); // Box 14
		bodyModel[14].setRotationPoint(11.5F, 3F, -12.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 23, 3, 1, 0F); // Box 15
		bodyModel[15].setRotationPoint(-11.5F, 3F, -12.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 23, 3, 1, 0F); // Box 16
		bodyModel[16].setRotationPoint(-11.5F, 3F, 11.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 25, 1, 25, 0F); // Box 17
		bodyModel[17].setRotationPoint(-12.5F, 2F, -12.5F);


		turretModel = new ModelRendererTurbo[30];
		turretModel[0] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 15
		turretModel[1] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 16
		turretModel[2] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 17
		turretModel[3] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 18
		turretModel[4] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 19
		turretModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 20
		turretModel[6] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 21
		turretModel[7] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 22
		turretModel[8] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 23
		turretModel[9] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 32
		turretModel[10] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 33
		turretModel[11] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 27
		turretModel[12] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 28
		turretModel[13] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 29
		turretModel[14] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 30
		turretModel[15] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 31
		turretModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 32
		turretModel[17] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 33
		turretModel[18] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 34
		turretModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 35
		turretModel[20] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 4
		turretModel[21] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 5
		turretModel[22] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 6
		turretModel[23] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 7
		turretModel[24] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 8
		turretModel[25] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 9
		turretModel[26] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 10
		turretModel[27] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 11
		turretModel[28] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 12
		turretModel[29] = new ModelRendererTurbo(this, 2, 146, textureX, textureY); // Box 2

		turretModel[0].addBox(-5.5F, 0F, -11.5F, 11, 1, 22, 0F); // Box 15
		turretModel[0].setRotationPoint(0F, 1F, 0F);

		turretModel[1].addShapeBox(5.5F, 0F, -11.5F, 6, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 16
		turretModel[1].setRotationPoint(0F, 1F, 0F);

		turretModel[2].addShapeBox(-11.5F, 0F, -11.5F, 6, 1, 22, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 17
		turretModel[2].setRotationPoint(0F, 1F, 0F);

		turretModel[3].addBox(-5.5F, -2F, -12.5F, 11, 2, 24, 0F); // Box 18
		turretModel[3].setRotationPoint(0F, 1F, 0F);

		turretModel[4].addShapeBox(-12.5F, -2F, -12.5F, 7, 2, 24, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 19
		turretModel[4].setRotationPoint(0F, 1F, 0F);

		turretModel[5].addShapeBox(5.5F, -2F, -12.5F, 7, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 20
		turretModel[5].setRotationPoint(0F, 1F, 0F);

		turretModel[6].addShapeBox(7.5F, -20F, -11.5F, 7, 18, 22, 0F, 0F, 0F, -0.5F, -1F, -4F, -7F, -1F, -4F, -7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 3F, -3F, -6F, 3F, -3F, -6F, 0F, 0F, 0F); // Box 21
		turretModel[6].setRotationPoint(0F, 1F, 0F);

		turretModel[7].addShapeBox(-8.5F, -20F, -11F, 16, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[7].setRotationPoint(0F, 1F, 0F);

		turretModel[8].addShapeBox(-8.5F, -20F, 9F, 16, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 23
		turretModel[8].setRotationPoint(0F, 1F, 0F);

		turretModel[9].addShapeBox(6.5F, -25F, -9.5F, 1, 5, 5, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[9].setRotationPoint(0F, 1F, 0F);

		turretModel[10].addShapeBox(6.5F, -25F, 0.5F, 1, 5, 8, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[10].setRotationPoint(0F, 1F, 0F);

		turretModel[11].addBox(-8.5F, -4F, -8.5F, 14, 1, 13, 0F); // Box 27
		turretModel[11].setRotationPoint(0F, 1F, 0F);

		turretModel[12].addShapeBox(-8.2F, -16.6F, -8.5F, 1, 12, 13, 0F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F); // Box 28
		turretModel[12].setRotationPoint(0F, 1F, 0F);
		turretModel[12].rotateAngleZ = 0.20943951F;

		turretModel[13].addBox(-9.2F, -20.6F, -7.5F, 1, 3, 11, 0F); // Box 29
		turretModel[13].setRotationPoint(0F, 1F, 0F);
		turretModel[13].rotateAngleZ = 0.20943951F;

		turretModel[14].addShapeBox(-8.2F, -17.6F, -6.5F, 1, 1, 2, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[14].setRotationPoint(0F, 1F, 0F);
		turretModel[14].rotateAngleZ = 0.20943951F;

		turretModel[15].addShapeBox(-8.2F, -17.6F, 0.5F, 1, 1, 2, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[15].setRotationPoint(0F, 1F, 0F);
		turretModel[15].rotateAngleZ = 0.20943951F;

		turretModel[16].addBox(-9F, -3F, -8.5F, 1, 1, 1, 0F); // Box 32
		turretModel[16].setRotationPoint(0F, 1F, 0F);

		turretModel[17].addBox(-9F, -3F, 3.5F, 1, 1, 1, 0F); // Box 33
		turretModel[17].setRotationPoint(0F, 1F, 0F);

		turretModel[18].addBox(2.5F, -3F, 3.5F, 1, 1, 1, 0F); // Box 34
		turretModel[18].setRotationPoint(0F, 1F, 0F);

		turretModel[19].addBox(2.5F, -3F, -8.5F, 1, 1, 1, 0F); // Box 35
		turretModel[19].setRotationPoint(0F, 1F, 0F);

		turretModel[20].addShapeBox(6.5F, -20F, -9.5F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		turretModel[20].setRotationPoint(0F, 1F, 0F);

		turretModel[21].addShapeBox(7.5F, -2F, -11.5F, 7, 1, 22, 0F, 0F, 0F, 0F, 3F, 3F, -6F, 3F, 3F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -7F, -1F, -1F, -7F, 0F, -1F, 0F); // Box 5
		turretModel[21].setRotationPoint(0F, 1F, 0F);

		turretModel[22].addBox(3F, -19F, -2F, 3, 4, 4, 0F); // Box 6
		turretModel[22].setRotationPoint(0F, 1F, 0F);
		turretModel[22].rotateAngleZ = -0.15707963F;

		turretModel[23].addBox(3F, -18.5F, -4F, 1, 1, 2, 0F); // Box 7
		turretModel[23].setRotationPoint(0F, 1F, 0F);
		turretModel[23].rotateAngleZ = -0.15707963F;

		turretModel[24].addBox(3F, -18.5F, 2F, 1, 1, 2, 0F); // Box 8
		turretModel[24].setRotationPoint(0F, 1F, 0F);
		turretModel[24].rotateAngleZ = -0.15707963F;

		turretModel[25].addBox(3F, -17.5F, 3F, 1, 2, 1, 0F); // Box 9
		turretModel[25].setRotationPoint(0F, 1F, 0F);
		turretModel[25].rotateAngleZ = -0.15707963F;

		turretModel[26].addBox(3F, -17.5F, -4F, 1, 2, 1, 0F); // Box 10
		turretModel[26].setRotationPoint(0F, 1F, 0F);
		turretModel[26].rotateAngleZ = -0.15707963F;

		turretModel[27].addShapeBox(3F, -15F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 11
		turretModel[27].setRotationPoint(0F, 1F, 0F);
		turretModel[27].rotateAngleZ = -0.15707963F;

		turretModel[28].addShapeBox(2.5F, -18F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 12
		turretModel[28].setRotationPoint(0F, 1F, 0F);
		turretModel[28].rotateAngleZ = -0.15707963F;

		turretModel[29].addShapeBox(-4.5F, -18.5F, 1F, 59, 1, 59, 0F, 0F, 0F, 0F, -51F, 0F, 0F, -51F, 0F, -51F, 0F, 0F, -51F, 0F, 0F, 0F, -51F, 0F, 0F, -51F, 0F, -51F, 0F, 0F, -51F); // Box 2
		turretModel[29].setRotationPoint(0F, 1F, 0F);
		turretModel[29].rotateAngleX = 1.20427718F;
		turretModel[29].rotateAngleY = 1.57079633F;


		barrelModel = new ModelRendererTurbo[58];
		barrelModel[0] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 27
		barrelModel[1] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 28
		barrelModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		barrelModel[3] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 34
		barrelModel[4] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 35
		barrelModel[5] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 36
		barrelModel[6] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 43
		barrelModel[7] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 44
		barrelModel[8] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 299
		barrelModel[9] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 299
		barrelModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 299
		barrelModel[11] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 299
		barrelModel[12] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 299
		barrelModel[13] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 81
		barrelModel[14] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 83
		barrelModel[15] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 84
		barrelModel[16] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 85
		barrelModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 86
		barrelModel[18] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 87
		barrelModel[19] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 88
		barrelModel[20] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 89
		barrelModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 90
		barrelModel[22] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 91
		barrelModel[23] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 92
		barrelModel[24] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 93
		barrelModel[25] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 4
		barrelModel[26] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 5
		barrelModel[27] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 6
		barrelModel[28] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 7
		barrelModel[29] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 8
		barrelModel[30] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 13
		barrelModel[31] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 14
		barrelModel[32] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 15
		barrelModel[33] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 16
		barrelModel[34] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 17
		barrelModel[35] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 22
		barrelModel[36] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 23
		barrelModel[37] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 24
		barrelModel[38] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 25
		barrelModel[39] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 26
		barrelModel[40] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 36
		barrelModel[41] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 37
		barrelModel[42] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 38
		barrelModel[43] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 39
		barrelModel[44] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 40
		barrelModel[45] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 41
		barrelModel[46] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 42
		barrelModel[47] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 43
		barrelModel[48] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		barrelModel[49] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 1
		barrelModel[50] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 2
		barrelModel[51] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 3
		barrelModel[52] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 18
		barrelModel[53] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 19
		barrelModel[54] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 20
		barrelModel[55] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 21
		barrelModel[56] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 22
		barrelModel[57] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 23

		barrelModel[0].addShapeBox(-10.5F, -9F, 10F, 17, 4, 2, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		barrelModel[0].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[1].addBox(-10.5F, -5F, 10F, 17, 9, 2, 0F); // Box 28
		barrelModel[1].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[2].addShapeBox(-10.5F, 4F, 10F, 17, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 29
		barrelModel[2].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[3].addShapeBox(-10.5F, 4F, -12F, 17, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 34
		barrelModel[3].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[4].addBox(-10.5F, -5F, -12F, 17, 9, 2, 0F); // Box 35
		barrelModel[4].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[5].addShapeBox(-10.5F, -9F, -12F, 17, 4, 2, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		barrelModel[5].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[6].addShapeBox(-9.5F, -5F, -12.5F, 15, 9, 4, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 43
		barrelModel[6].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[7].addShapeBox(-9.5F, -5F, 8.5F, 15, 9, 4, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 44
		barrelModel[7].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[8].addShapeBox(5F, -4F, 12.5F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 299
		barrelModel[8].setRotationPoint(0F, -13F, 0F);

		barrelModel[9].addShapeBox(7F, -4.7F, 13.5F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 299
		barrelModel[9].setRotationPoint(0F, -13F, 0F);

		barrelModel[10].addShapeBox(2F, -4.7F, 13.5F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 299
		barrelModel[10].setRotationPoint(0F, -13F, 0F);

		barrelModel[11].addShapeBox(-7F, -5.2F, 13F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		barrelModel[11].setRotationPoint(0F, -13F, 0F);

		barrelModel[12].addShapeBox(-11F, -5.2F, 13F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 299
		barrelModel[12].setRotationPoint(0F, -13F, 0F);

		barrelModel[13].addShapeBox(3.5F, -12.7F, -13.5F, 1, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		barrelModel[13].setRotationPoint(0F, -13F, 0F);

		barrelModel[14].addShapeBox(-8.5F, -12.7F, 11.5F, 12, 1, 1, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 83
		barrelModel[14].setRotationPoint(0F, -13F, 0F);

		barrelModel[15].addShapeBox(-8.5F, -12.7F, -13.5F, 12, 1, 1, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 84
		barrelModel[15].setRotationPoint(0F, -13F, 0F);

		barrelModel[16].addShapeBox(4.5F, -11.7F, -4F, 1, 11, 11, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -7F, 1F, 0F, -7F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -7F, 0F, -7F, -7F); // Box 85
		barrelModel[16].setRotationPoint(0F, -13F, 0F);

		barrelModel[17].addShapeBox(-3F, -5.2F, -21F, 3, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		barrelModel[17].setRotationPoint(0F, -13F, -1F);

		barrelModel[18].addShapeBox(-3F, -7.2F, -21F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		barrelModel[18].setRotationPoint(0F, -13F, -1F);

		barrelModel[19].addShapeBox(-7F, -0.2F, -23F, 3, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		barrelModel[19].setRotationPoint(0F, -13F, -1F);

		barrelModel[20].addShapeBox(-7F, -2.2F, -23F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		barrelModel[20].setRotationPoint(0F, -13F, -1F);

		barrelModel[21].addShapeBox(-7F, -2.2F, 17F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		barrelModel[21].setRotationPoint(0F, -13F, 0F);

		barrelModel[22].addShapeBox(-7F, -0.2F, 17F, 3, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		barrelModel[22].setRotationPoint(0F, -13F, 0F);

		barrelModel[23].addShapeBox(-3F, -5.2F, 15F, 3, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		barrelModel[23].setRotationPoint(0F, -13F, 0F);

		barrelModel[24].addShapeBox(-3F, -7.2F, 15F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		barrelModel[24].setRotationPoint(0F, -13F, 0F);

		barrelModel[25].addShapeBox(-15F, -0.2F, 15F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 4
		barrelModel[25].setRotationPoint(0F, -13F, 0F);

		barrelModel[26].addShapeBox(-11F, -0.2F, 15F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		barrelModel[26].setRotationPoint(0F, -13F, 0F);

		barrelModel[27].addShapeBox(-2F, 0.3F, 15.5F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 6
		barrelModel[27].setRotationPoint(0F, -13F, 0F);

		barrelModel[28].addShapeBox(3F, 0.3F, 15.5F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 7
		barrelModel[28].setRotationPoint(0F, -13F, 0F);

		barrelModel[29].addShapeBox(1F, 1F, 14.5F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 8
		barrelModel[29].setRotationPoint(0F, -13F, 0F);

		barrelModel[30].addShapeBox(-11F, -5.2F, -16F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 13
		barrelModel[30].setRotationPoint(0F, -13F, 0F);

		barrelModel[31].addShapeBox(-7F, -5.2F, -16F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[31].setRotationPoint(0F, -13F, 0F);

		barrelModel[32].addShapeBox(2F, -4.7F, -15.5F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 15
		barrelModel[32].setRotationPoint(0F, -13F, 0F);

		barrelModel[33].addShapeBox(5F, -4F, -16.5F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 16
		barrelModel[33].setRotationPoint(0F, -13F, 0F);

		barrelModel[34].addShapeBox(7F, -4.7F, -15.5F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 17
		barrelModel[34].setRotationPoint(0F, -13F, 0F);

		barrelModel[35].addShapeBox(-15F, -0.2F, -18F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 22
		barrelModel[35].setRotationPoint(0F, -13F, 0F);

		barrelModel[36].addShapeBox(-11F, -0.2F, -18F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		barrelModel[36].setRotationPoint(0F, -13F, 0F);

		barrelModel[37].addShapeBox(-2F, 0.3F, -17.5F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 24
		barrelModel[37].setRotationPoint(0F, -13F, 0F);

		barrelModel[38].addShapeBox(1F, 1F, -18.5F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 25
		barrelModel[38].setRotationPoint(0F, -13F, 0F);

		barrelModel[39].addShapeBox(3F, 0.3F, -17.5F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 26
		barrelModel[39].setRotationPoint(0F, -13F, 0F);

		barrelModel[40].addShapeBox(-9.5F, -5.7F, -13.5F, 1, 10, 1, 0F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F); // Box 36
		barrelModel[40].setRotationPoint(0F, -13F, 0F);

		barrelModel[41].addShapeBox(-9.5F, -5.7F, 11.5F, 1, 10, 1, 0F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F, 0.001F, 0F, 0.001F); // Box 37
		barrelModel[41].setRotationPoint(0F, -13F, 0F);

		barrelModel[42].addShapeBox(-9.5F, 0.3F, 12.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		barrelModel[42].setRotationPoint(0F, -13F, 0F);

		barrelModel[43].addShapeBox(-9.5F, 0.3F, -16.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		barrelModel[43].setRotationPoint(0F, -13F, 0F);

		barrelModel[44].addShapeBox(-1.5F, 0.3F, -16.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		barrelModel[44].setRotationPoint(0F, -13F, 0F);

		barrelModel[45].addShapeBox(-1.5F, 0.3F, 11.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		barrelModel[45].setRotationPoint(0F, -13F, 0F);

		barrelModel[46].addShapeBox(0.5F, -4.7F, 11.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		barrelModel[46].setRotationPoint(0F, -13F, 0F);

		barrelModel[47].addShapeBox(0.5F, -4.7F, -15.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		barrelModel[47].setRotationPoint(0F, -13F, 0F);

		barrelModel[48].addShapeBox(-16.5F, 0.3F, 15.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 0
		barrelModel[48].setRotationPoint(0F, -13F, 0F);

		barrelModel[49].addShapeBox(-12.5F, -4.7F, 13.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 1
		barrelModel[49].setRotationPoint(0F, -13F, 0F);

		barrelModel[50].addShapeBox(-16.5F, 0.3F, -17.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 2
		barrelModel[50].setRotationPoint(0F, -13F, 0F);

		barrelModel[51].addShapeBox(-12.5F, -4.7F, -15.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 3
		barrelModel[51].setRotationPoint(0F, -13F, 0F);

		barrelModel[52].addShapeBox(-10.5F, 4F, -9F, 17, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 18
		barrelModel[52].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[53].addBox(-10.5F, -5F, -9F, 17, 9, 1, 0F); // Box 19
		barrelModel[53].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[54].addShapeBox(-10.5F, -9F, -9F, 17, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		barrelModel[54].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[55].addShapeBox(-10.5F, -9F, 8F, 17, 4, 1, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		barrelModel[55].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[56].addBox(-10.5F, -5F, 8F, 17, 9, 1, 0F); // Box 22
		barrelModel[56].setRotationPoint(0F, -13F, -0.5F);

		barrelModel[57].addShapeBox(-10.5F, 4F, 8F, 17, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 23
		barrelModel[57].setRotationPoint(0F, -13F, -0.5F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
