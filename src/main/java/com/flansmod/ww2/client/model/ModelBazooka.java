//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBazooka extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBazooka() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[36];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 21
		gunModel[13] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 22
		gunModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		gunModel[15] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 24
		gunModel[16] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 25
		gunModel[17] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 26
		gunModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 27
		gunModel[19] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 28
		gunModel[20] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 29
		gunModel[21] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 30
		gunModel[22] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 31
		gunModel[23] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 32
		gunModel[24] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 31
		gunModel[25] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 32
		gunModel[26] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 33
		gunModel[27] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 34
		gunModel[28] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 35
		gunModel[29] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 36
		gunModel[30] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 37
		gunModel[31] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 38
		gunModel[32] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 39
		gunModel[33] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 40
		gunModel[34] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 41
		gunModel[35] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 42

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 11, 5, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 0
		gunModel[0].setRotationPoint(-3F, -6F, -2.5F);
		gunModel[0].rotateAngleZ = -0.19198622F;

		gunModel[1].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 1
		gunModel[1].setRotationPoint(1F, -6F, -1.5F);

		gunModel[2].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 2
		gunModel[2].setRotationPoint(0F, 0F, -1.5F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 7, 3, 0F); // Box 3
		gunModel[3].setRotationPoint(6F, -6F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 4
		gunModel[4].setRotationPoint(-0.5F, -4F, -1.5F);
		gunModel[4].rotateAngleZ = 0.08726646F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-24F, -6F, -2.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 10, 12, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[6].setRotationPoint(-34F, -6F, -2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 100, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		gunModel[7].setRotationPoint(-58F, -8F, -4F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 4, 10, 5, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 10
		gunModel[8].setRotationPoint(20F, -6F, -2.5F);
		gunModel[8].rotateAngleZ = -0.19198622F;

		gunModel[9].addShapeBox(0F, 0F, 0F, 100, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[9].setRotationPoint(-58F, -12F, -4F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 100, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[10].setRotationPoint(-58F, -12F, 2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 100, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[11].setRotationPoint(-58F, -14F, -4F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[12].setRotationPoint(-61F, -15F, -4.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 22
		gunModel[13].setRotationPoint(-61F, -6F, -4.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[14].setRotationPoint(-61F, -14F, -5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[15].setRotationPoint(-61F, -14F, 4F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[16].setRotationPoint(-60F, -14F, -5F);
		gunModel[16].rotateAngleY = 0.48869219F;

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[17].setRotationPoint(-60.5F, -14F, 4F);
		gunModel[17].rotateAngleY = -0.48869219F;

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[18].setRotationPoint(-60F, -10.5F, -5F);
		gunModel[18].rotateAngleY = 0.48869219F;

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[19].setRotationPoint(-60F, -7F, -5F);
		gunModel[19].rotateAngleY = 0.48869219F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[20].setRotationPoint(-60.5F, -10F, 4F);
		gunModel[20].rotateAngleY = -0.48869219F;

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[21].setRotationPoint(-60.5F, -7F, 4F);
		gunModel[21].rotateAngleY = -0.48869219F;

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[22].setRotationPoint(-60.5F, -6F, -0.5F);
		gunModel[22].rotateAngleZ = 0.31415927F;

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[23].setRotationPoint(-60.5F, -15F, -0.5F);
		gunModel[23].rotateAngleZ = -0.31415927F;

		gunModel[24].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[24].setRotationPoint(-42F, -17F, 2F);
		gunModel[24].rotateAngleX = -0.26179939F;

		gunModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[25].setRotationPoint(-59F, -15F, -1.5F);
		gunModel[25].rotateAngleZ = 0.08726646F;

		gunModel[26].addShapeBox(0F, 0F, 0F, 20, 6, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 33
		gunModel[26].setRotationPoint(-28F, -15F, -5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[27].setRotationPoint(39F, -14F, 8F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[28].setRotationPoint(39F, -4F, 5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[29].setRotationPoint(39F, -14F, 4F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[30].setRotationPoint(39F, -7F, 3.5F);
		gunModel[30].rotateAngleX = -0.95993109F;

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[31].setRotationPoint(39F, -13.5F, 5F);
		gunModel[31].rotateAngleX = -2.04203522F;

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[32].setRotationPoint(39F, -11.5F, 4F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[33].setRotationPoint(39F, -8.5F, 4F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 20, 6, 10, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F); // Box 41
		gunModel[34].setRotationPoint(-28F, -11F, -5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, -0.6F, 1F); // Box 42
		gunModel[35].setRotationPoint(-8F, -16F, -1.5F);


		ammoModel = new ModelRendererTurbo[7];
		ammoModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 14
		ammoModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		ammoModel[2] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 16
		ammoModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 17
		ammoModel[4] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 18
		ammoModel[5] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 19
		ammoModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 20

		ammoModel[0].addShapeBox(-9F, 0F, 6.5F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 14
		ammoModel[0].setRotationPoint(-27F, -12F, -8.5F);

		ammoModel[1].addShapeBox(-9F, 0F, 6.5F, 6, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 15
		ammoModel[1].setRotationPoint(-33F, -12F, -8.5F);

		ammoModel[2].addShapeBox(-9F, 0F, 6.5F, 15, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		ammoModel[2].setRotationPoint(-47F, -11F, -7.5F);

		ammoModel[3].addShapeBox(-9F, 0F, 6.5F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		ammoModel[3].setRotationPoint(-51F, -12F, -7F);

		ammoModel[4].addShapeBox(-9F, 0F, 6.5F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		ammoModel[4].setRotationPoint(-51F, -9F, -7F);

		ammoModel[5].addShapeBox(-9F, 0F, 6.5F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		ammoModel[5].setRotationPoint(-51F, -10.5F, -8F);

		ammoModel[6].addShapeBox(-9F, 0F, 6.5F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		ammoModel[6].setRotationPoint(-51F, -10.5F, -6F);

		animationType = EnumAnimationType.RIFLE;

		translateAll(-4F, 0F, -10F);
		thirdPersonOffset = new Vector3f(-0.06F, 0F, -0.2F);


		flipAll();
	}
}
