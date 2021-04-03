//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2016 - 01:39:40
// Last changed on: 26.06.2016 - 01:39:40

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelM157MM extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelM157MM() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[37];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 10
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 36
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Shape 19
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 43
		bodyModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 44
		bodyModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 45
		bodyModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 46
		bodyModel[9] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 47
		bodyModel[10] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 103
		bodyModel[18] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 106
		bodyModel[19] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 107
		bodyModel[20] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 108
		bodyModel[21] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 110
		bodyModel[22] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 111
		bodyModel[23] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 112
		bodyModel[24] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 78
		bodyModel[25] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 3
		bodyModel[26] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 22
		bodyModel[27] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 24
		bodyModel[28] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 27
		bodyModel[29] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 119
		bodyModel[31] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 120
		bodyModel[32] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 121
		bodyModel[33] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 122
		bodyModel[34] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 123
		bodyModel[35] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 124
		bodyModel[36] = new ModelRendererTurbo(this, 138, 69, textureX, textureY); // Box 0

		bodyModel[0].addShape3D(8F, -7F, -5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 3, 14, 14, 52, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 10
		bodyModel[0].setRotationPoint(7F, 2F, 12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 36
		bodyModel[1].setRotationPoint(6F, 1F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 26, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[2].setRotationPoint(13.5F, 0F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 26, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F); // Box 9
		bodyModel[3].setRotationPoint(13.5F, 4F, -13F);
		bodyModel[3].rotateAngleZ = 1.01229097F;

		bodyModel[4].addShape3D(8F, -7F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 3, 14, 14, 52, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 19
		bodyModel[4].setRotationPoint(7F, 2F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 43
		bodyModel[5].setRotationPoint(6F, 1F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 44
		bodyModel[6].setRotationPoint(7.5F, 1F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 45
		bodyModel[7].setRotationPoint(7.5F, 1F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 46
		bodyModel[8].setRotationPoint(0.5F, 1F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 47
		bodyModel[9].setRotationPoint(0.5F, 1F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 26
		bodyModel[10].setRotationPoint(-2.5F, 1F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 28
		bodyModel[11].setRotationPoint(-1F, 1F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 29
		bodyModel[12].setRotationPoint(-1F, 1F, 6F);

		bodyModel[13].addShapeBox(0F, 0.5F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(-2F, 0F, -10F);

		bodyModel[14].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-1F, 0F, -10F);

		bodyModel[15].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[15].setRotationPoint(-0.5F, -0.5F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 27
		bodyModel[16].setRotationPoint(2.5F, 1F, -7F);

		bodyModel[17].addShapeBox(-1F, -8F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 103
		bodyModel[17].setRotationPoint(14F, 0F, -13F);
		bodyModel[17].rotateAngleZ = 0.17453293F;

		bodyModel[18].addShapeBox(-1F, -13F, -5F, 1, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[18].setRotationPoint(14F, 0F, -13F);
		bodyModel[18].rotateAngleZ = 0.17453293F;

		bodyModel[19].addShapeBox(-1F, -13F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[19].setRotationPoint(14F, 0F, -13F);
		bodyModel[19].rotateAngleZ = 0.17453293F;

		bodyModel[20].addShapeBox(-1F, -8F, 1F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[20].setRotationPoint(14F, 0F, 9F);
		bodyModel[20].rotateAngleZ = 0.17453293F;

		bodyModel[21].addShapeBox(0F, 0.5F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[21].setRotationPoint(-2F, 0F, 7F);

		bodyModel[22].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[22].setRotationPoint(-1F, 0F, 7F);

		bodyModel[23].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[23].setRotationPoint(-0.5F, -0.5F, 8F);

		bodyModel[24].addShapeBox(0F, 0.5F, 0F, 36, 3, 2, 0F, 0F, -5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 10F, 0F, 5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 10F); // Box 78
		bodyModel[24].setRotationPoint(-38F, 0F, 7.5F);

		bodyModel[25].addShapeBox(0F, 0.5F, 0F, 36, 3, 2, 0F, 0F, -5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -10F, 0F, 5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -10F); // Box 3
		bodyModel[25].setRotationPoint(-38F, 0F, -9.5F);

		bodyModel[26].addShapeBox(0F, 0.5F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[26].setRotationPoint(-39F, 5F, -20F);

		bodyModel[27].addShapeBox(0F, 0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 24
		bodyModel[27].setRotationPoint(-42F, 7F, -20F);

		bodyModel[28].addShapeBox(0F, 0.5F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[28].setRotationPoint(-39F, 5F, 17F);

		bodyModel[29].addShapeBox(0F, 0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-42F, 7F, 17F);

		bodyModel[30].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 119
		bodyModel[30].setRotationPoint(-39F, 4F, 18F);

		bodyModel[31].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 120
		bodyModel[31].setRotationPoint(-39F, 4F, -19F);

		bodyModel[32].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[32].setRotationPoint(-41F, 6F, 17F);

		bodyModel[33].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[33].setRotationPoint(-41F, 6F, -20F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[34].setRotationPoint(-41F, 6F, 18F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[35].setRotationPoint(-41F, 6F, -19F);

		bodyModel[36].addShapeBox(-1.5F, -12F, -0.5F, 41, 41, 1, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 0
		bodyModel[36].setRotationPoint(14F, 1F, -13F);
		bodyModel[36].rotateAngleX = 0.17453293F;
		bodyModel[36].rotateAngleY = -1.57079633F;


		turretModel = new ModelRendererTurbo[36];
		turretModel[0] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 50
		turretModel[1] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 51
		turretModel[2] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 52
		turretModel[3] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 53
		turretModel[4] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 54
		turretModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		turretModel[6] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 31
		turretModel[7] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 32
		turretModel[8] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 33
		turretModel[9] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 17
		turretModel[10] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 23
		turretModel[11] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 72
		turretModel[12] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 73
		turretModel[13] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 74
		turretModel[14] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 77
		turretModel[15] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 78
		turretModel[16] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 79
		turretModel[17] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 81
		turretModel[18] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 83
		turretModel[19] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 84
		turretModel[20] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 85
		turretModel[21] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 86
		turretModel[22] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 87
		turretModel[23] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 88
		turretModel[24] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 89
		turretModel[25] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 90
		turretModel[26] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 91
		turretModel[27] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 92
		turretModel[28] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 93
		turretModel[29] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 95
		turretModel[30] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 96
		turretModel[31] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 97
		turretModel[32] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 98
		turretModel[33] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 99
		turretModel[34] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 102
		turretModel[35] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 109

		turretModel[0].addShapeBox(-2F, -0.8F, -5F, 4, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		turretModel[0].setRotationPoint(0F, 1F, 0F);

		turretModel[1].addShapeBox(-4F, -5.8F, -3F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		turretModel[1].setRotationPoint(0F, 1F, 0F);

		turretModel[2].addShapeBox(-4F, -5.8F, 2F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		turretModel[2].setRotationPoint(0F, 1F, 0F);

		turretModel[3].addShapeBox(-4F, -7.8F, 2F, 8, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		turretModel[3].setRotationPoint(0F, 1F, 0F);

		turretModel[4].addShapeBox(-4F, -7.8F, -3F, 8, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		turretModel[4].setRotationPoint(0F, 1F, 0F);

		turretModel[5].addShapeBox(2F, -0.8F, -5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 30
		turretModel[5].setRotationPoint(0F, 1F, 0F);

		turretModel[6].addShapeBox(-4F, -0.8F, -5F, 2, 1, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 31
		turretModel[6].setRotationPoint(0F, 1F, 0F);

		turretModel[7].addShapeBox(0.5F, -5.8F, -2.5F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 32
		turretModel[7].setRotationPoint(0F, 1F, 0F);
		turretModel[7].rotateAngleX = -1.3962634F;

		turretModel[8].addShapeBox(-0.5F, -6.3F, -2.6F, 5, 5, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, -0.5F, 0F, -3F, -0.5F); // Box 33
		turretModel[8].setRotationPoint(0F, 1F, 0F);
		turretModel[8].rotateAngleX = -1.3962634F;

		turretModel[9].addShapeBox(11.3F, -10F, -6.5F, 1, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[9].setRotationPoint(0F, 1F, 0F);
		turretModel[9].rotateAngleZ = 0.26179939F;

		turretModel[10].addShapeBox(-1F, -2F, 2.8F, 3, 3, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 23
		turretModel[10].setRotationPoint(0F, -6F, 0F);

		turretModel[11].addShapeBox(11.3F, -10F, 1.5F, 1, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		turretModel[11].setRotationPoint(0F, 1F, 0F);
		turretModel[11].rotateAngleZ = 0.26179939F;

		turretModel[12].addShapeBox(11.3F, -11F, 6.5F, 1, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 73
		turretModel[12].setRotationPoint(0F, 1F, 0F);
		turretModel[12].rotateAngleZ = 0.26179939F;

		turretModel[13].addShapeBox(7.3F, -11F, 10.5F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 74
		turretModel[13].setRotationPoint(0F, 1F, 0F);
		turretModel[13].rotateAngleZ = 0.26179939F;

		turretModel[14].addShapeBox(11.3F, -11F, -10.5F, 1, 13, 4, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		turretModel[14].setRotationPoint(0F, 1F, 0F);
		turretModel[14].rotateAngleZ = 0.26179939F;

		turretModel[15].addShapeBox(7.3F, -11F, -14.5F, 1, 6, 4, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		turretModel[15].setRotationPoint(0F, 1F, 0F);
		turretModel[15].rotateAngleZ = 0.26179939F;

		turretModel[16].addShapeBox(11.3F, -10F, -1.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		turretModel[16].setRotationPoint(0F, 1F, 0F);
		turretModel[16].rotateAngleZ = 0.26179939F;

		turretModel[17].addShapeBox(11.3F, 1F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		turretModel[17].setRotationPoint(0F, 1F, 0F);
		turretModel[17].rotateAngleZ = 0.26179939F;

		turretModel[18].addShapeBox(11.3F, -11F, -6.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		turretModel[18].setRotationPoint(0F, 1F, 0F);
		turretModel[18].rotateAngleZ = 0.26179939F;

		turretModel[19].addShapeBox(11.3F, -11F, -3.5F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		turretModel[19].setRotationPoint(0F, 1F, 0F);
		turretModel[19].rotateAngleZ = 0.26179939F;

		turretModel[20].addShapeBox(11.3F, -11F, -5.5F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		turretModel[20].setRotationPoint(0F, 1F, 0F);
		turretModel[20].rotateAngleZ = 0.26179939F;

		turretModel[21].addShapeBox(11.3F, -11F, 5.5F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		turretModel[21].setRotationPoint(0F, 1F, 0F);
		turretModel[21].rotateAngleZ = 0.26179939F;

		turretModel[22].addShapeBox(11.3F, -11F, 3.5F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		turretModel[22].setRotationPoint(0F, 1F, 0F);
		turretModel[22].rotateAngleZ = 0.26179939F;

		turretModel[23].addShapeBox(11.3F, -11F, 2.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		turretModel[23].setRotationPoint(0F, 1F, 0F);
		turretModel[23].rotateAngleZ = 0.26179939F;

		turretModel[24].addShapeBox(11.3F, -11F, 1F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		turretModel[24].setRotationPoint(0F, 1F, 0F);
		turretModel[24].rotateAngleZ = 0.26179939F;

		turretModel[25].addShapeBox(11.3F, -11F, -1F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		turretModel[25].setRotationPoint(0F, 1F, 0F);
		turretModel[25].rotateAngleZ = 0.26179939F;

		turretModel[26].addShapeBox(11.3F, -11F, -2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		turretModel[26].setRotationPoint(0F, 1F, 0F);
		turretModel[26].rotateAngleZ = 0.26179939F;

		turretModel[27].addShapeBox(11.3F, -11F, -2.75F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 92
		turretModel[27].setRotationPoint(0F, 1F, 0F);
		turretModel[27].rotateAngleZ = 0.26179939F;

		turretModel[28].addShapeBox(11.3F, -11F, 1.75F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 93
		turretModel[28].setRotationPoint(0F, 1F, 0F);
		turretModel[28].rotateAngleZ = 0.26179939F;

		turretModel[29].addShapeBox(0F, -5.8F, -4.5F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 95
		turretModel[29].setRotationPoint(0F, 1F, 0F);
		turretModel[29].rotateAngleX = -1.3962634F;

		turretModel[30].addShapeBox(-1.5F, 0.2F, 2.8F, 4, 2, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 96
		turretModel[30].setRotationPoint(0F, -6F, 0F);

		turretModel[31].addShapeBox(-4F, -9.8F, -2F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		turretModel[31].setRotationPoint(0F, 1F, 0F);

		turretModel[32].addShapeBox(-4F, -7.8F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 98
		turretModel[32].setRotationPoint(0F, 1F, 0F);

		turretModel[33].addShapeBox(-4F, -8.8F, -2F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		turretModel[33].setRotationPoint(0F, 1F, 0F);

		turretModel[34].addShapeBox(8F, -10.5F, 2F, 3, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		turretModel[34].setRotationPoint(0F, 1F, 0F);

		turretModel[35].addShapeBox(-6.6F, -10.8F, -1.5F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		turretModel[35].setRotationPoint(0F, 1F, 0F);


		barrelModel = new ModelRendererTurbo[29];
		barrelModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 231
		barrelModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 35
		barrelModel[2] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 55
		barrelModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 61
		barrelModel[4] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 12
		barrelModel[5] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 13
		barrelModel[6] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 14
		barrelModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
		barrelModel[8] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 22
		barrelModel[9] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 23
		barrelModel[10] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 25
		barrelModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 1
		barrelModel[12] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 2
		barrelModel[13] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 3
		barrelModel[14] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 4
		barrelModel[15] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 5
		barrelModel[16] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 6
		barrelModel[17] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 9
		barrelModel[18] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 1
		barrelModel[19] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 2
		barrelModel[20] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 3
		barrelModel[21] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 4
		barrelModel[22] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 5
		barrelModel[23] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 26
		barrelModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 94
		barrelModel[25] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 100
		barrelModel[26] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 101
		barrelModel[27] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 125
		barrelModel[28] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 129

		barrelModel[0].addShapeBox(13F, -1F, -1F, 29, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F); // Box 231
		barrelModel[0].setRotationPoint(0F, -6F, 0F);

		barrelModel[1].addShapeBox(0F, -1F, -1F, 19, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 35
		barrelModel[1].setRotationPoint(0F, -6F, 0F);

		barrelModel[2].addShapeBox(-7F, -1F, -1F, 13, 2, 2, 0F, 0F, 0.95F, 0.6F, 0F, 0.95F, 0.6F, 0F, 0.95F, 0.6F, 0F, 0.95F, 0.6F, 0F, 0.95F, 0.6F, 0F, 0.95F, 0.6F, 0F, 0.95F, 0.6F, 0F, 0.95F, 0.6F); // Box 55
		barrelModel[2].setRotationPoint(0F, -6F, 0F);

		barrelModel[3].addShapeBox(-8F, 1F, -1.5F, 1, 1, 3, 0F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 61
		barrelModel[3].setRotationPoint(0F, -6F, 0F);

		barrelModel[4].addShapeBox(0F, -1.9F, 4.6F, 6, 1, 1, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 12
		barrelModel[4].setRotationPoint(0F, -6F, 0F);

		barrelModel[5].addShapeBox(0F, -1.5F, 4.6F, 6, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 13
		barrelModel[5].setRotationPoint(0F, -6F, 0F);

		barrelModel[6].addShapeBox(0F, -1.1F, 4.6F, 6, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 14
		barrelModel[6].setRotationPoint(0F, -6F, 0F);

		barrelModel[7].addShapeBox(0.5F, -1.5F, 3.1F, 1, 1, 3, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 16
		barrelModel[7].setRotationPoint(0F, -6F, 0F);

		barrelModel[8].addShapeBox(-9F, 2.5F, -1.5F, 1, 2, 3, 0F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F); // Box 22
		barrelModel[8].setRotationPoint(0F, -6F, 0F);

		barrelModel[9].addShapeBox(-12F, 0F, 3.8F, 8, 2, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, -0.9F, 0F, -1.5F, -0.9F); // Box 23
		barrelModel[9].setRotationPoint(0F, -6F, 0F);

		barrelModel[10].addShapeBox(-4F, 0F, 3.8F, 3, 2, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 1.1F, 0F, 0.3F, -1.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 1.1F, 0F, -1.5F, -1.9F, 0F, -1.5F, -0.9F); // Box 25
		barrelModel[10].setRotationPoint(0F, -6F, 0F);

		barrelModel[11].addShapeBox(-6F, 2F, -1.5F, 26, 2, 3, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 1
		barrelModel[11].setRotationPoint(0F, -6.2F, 0F);

		barrelModel[12].addShapeBox(20F, 2F, -1.5F, 2, 2, 3, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 2
		barrelModel[12].setRotationPoint(0F, -6.2F, 0F);

		barrelModel[13].addShapeBox(-8F, 2F, -1.5F, 2, 2, 3, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 3
		barrelModel[13].setRotationPoint(0F, -6.2F, 0F);

		barrelModel[14].addShapeBox(19.8F, -1F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 4
		barrelModel[14].setRotationPoint(0F, -6.2F, 0F);

		barrelModel[15].addShapeBox(19.8F, -0.7F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F); // Box 5
		barrelModel[15].setRotationPoint(0F, -6F, 0F);

		barrelModel[16].addShapeBox(-10F, 1F, -1.5F, 2, 1, 3, 0F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F); // Box 6
		barrelModel[16].setRotationPoint(0F, -6F, 0F);

		barrelModel[17].addShapeBox(-10F, -1.6F, 0.6F, 3, 2, 1, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F); // Box 9
		barrelModel[17].setRotationPoint(0F, -6F, 0F);

		barrelModel[18].addShapeBox(-4F, 0.8F, 3.8F, 3, 2, 1, 0F, 0F, -1.5F, 0.1F, 0F, -1.5F, 1.1F, 0F, -1.5F, -1.9F, 0F, -1.5F, -0.9F, 0F, 0.3F, 0.1F, 0F, 0.3F, 1.1F, 0F, 0.3F, -1.9F, 0F, 0.3F, -0.9F); // Box 1
		barrelModel[18].setRotationPoint(0F, -6F, 0F);

		barrelModel[19].addShapeBox(-12F, 2.6F, 3.8F, 8, 2, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, -0.9F, 0F, -1.5F, -0.9F); // Box 2
		barrelModel[19].setRotationPoint(0F, -6F, 0F);

		barrelModel[20].addShapeBox(-11F, 0.8F, 3.3F, 7, 3, 1, 0F, 0F, 0.3F, -0.45F, -1F, 0.3F, -0.45F, -1F, 0.3F, -0.45F, 0F, 0.3F, -0.45F, 0F, -1.5F, -0.45F, -1F, -1.5F, -0.45F, -1F, -1.5F, -0.45F, 0F, -1.5F, -0.45F); // Box 3
		barrelModel[20].setRotationPoint(0F, -6F, 0F);

		barrelModel[21].addShapeBox(-12F, 0.8F, 3.8F, 1, 3, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, -0.9F, 0F, -1.5F, -0.9F); // Box 4
		barrelModel[21].setRotationPoint(0F, -6F, 0F);

		barrelModel[22].addShapeBox(-5F, 0.8F, 3.8F, 1, 3, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, -0.9F, 0F, -1.5F, -0.9F); // Box 5
		barrelModel[22].setRotationPoint(0F, -6F, 0F);

		barrelModel[23].addShapeBox(19.8F, 0.4F, -1.5F, 2, 2, 3, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		barrelModel[23].setRotationPoint(0F, -6.2F, 0F);

		barrelModel[24].addShapeBox(-10F, -1.6F, -2.2F, 3, 2, 1, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F); // Box 94
		barrelModel[24].setRotationPoint(0F, -6F, 0F);

		barrelModel[25].addShapeBox(42.5F, -1F, -1F, 2, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 100
		barrelModel[25].setRotationPoint(0F, -6F, 0F);

		barrelModel[26].addShapeBox(41.5F, -1F, -1F, 1, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 101
		barrelModel[26].setRotationPoint(0F, -6F, 0F);

		barrelModel[27].addShapeBox(19F, -1F, -1F, 1, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 125
		barrelModel[27].setRotationPoint(0F, -6F, 0F);

		barrelModel[28].addShapeBox(21.5F, 2.5F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		barrelModel[28].setRotationPoint(0F, -6.2F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
