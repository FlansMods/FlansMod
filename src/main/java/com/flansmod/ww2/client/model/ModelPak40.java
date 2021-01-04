//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelPak40 extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelPak40() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[42];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 10
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 36
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Shape 19
		bodyModel[5] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 43
		bodyModel[6] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 44
		bodyModel[7] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 45
		bodyModel[8] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 46
		bodyModel[9] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 47
		bodyModel[10] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 48
		bodyModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 78
		bodyModel[12] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 26
		bodyModel[13] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 29
		bodyModel[16] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 5
		bodyModel[22] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 15
		bodyModel[23] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 16
		bodyModel[24] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 18
		bodyModel[26] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 22
		bodyModel[27] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 23
		bodyModel[28] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 24
		bodyModel[29] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 25
		bodyModel[30] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 26
		bodyModel[31] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 27
		bodyModel[32] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 28
		bodyModel[33] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 29
		bodyModel[34] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 30
		bodyModel[35] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 31
		bodyModel[36] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 21
		bodyModel[37] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 22
		bodyModel[38] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 27
		bodyModel[39] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 28
		bodyModel[40] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 29
		bodyModel[41] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 30

		bodyModel[0].addShape3D(8F, -7F, -5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 3, 14, 14, 52, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 10
		bodyModel[0].setRotationPoint(8F, 2F, 13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 36
		bodyModel[1].setRotationPoint(7F, 1F, -19F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 28, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[2].setRotationPoint(13.5F, 1F, -14F);

		bodyModel[3].addShapeBox(-1F, 0F, 0F, 1, 4, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 9
		bodyModel[3].setRotationPoint(14.5F, 4F, -14F);
		bodyModel[3].rotateAngleZ = -0.38397244F;

		bodyModel[4].addShape3D(8F, -7F, 0F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(15, 3, 15, 3), new Coord2D(15, 11, 15, 11), new Coord2D(12, 14, 12, 14), new Coord2D(4, 14, 4, 14), new Coord2D(1, 11, 1, 11), new Coord2D(1, 3, 1, 3)}), 3, 14, 14, 52, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 8, 5, 8, 5, 8, 5, 8}); // Shape 19
		bodyModel[4].setRotationPoint(8F, 2F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 43
		bodyModel[5].setRotationPoint(7F, 1F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 44
		bodyModel[6].setRotationPoint(8.5F, 1F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 45
		bodyModel[7].setRotationPoint(8.5F, 1F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 46
		bodyModel[8].setRotationPoint(0.5F, 1F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 47
		bodyModel[9].setRotationPoint(0.5F, 1F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 48
		bodyModel[10].setRotationPoint(-1F, 1F, -7F);

		bodyModel[11].addShapeBox(0F, 0.5F, 0F, 36, 1, 3, 0F, 0F, -5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 10F, 0F, 5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 10F); // Box 78
		bodyModel[11].setRotationPoint(-38.5F, 1F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[12].setRotationPoint(-2.5F, 1F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 27
		bodyModel[13].setRotationPoint(0F, 1F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 28
		bodyModel[14].setRotationPoint(-1F, 1F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 29
		bodyModel[15].setRotationPoint(-1F, 1F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 33
		bodyModel[16].setRotationPoint(-5.5F, 1F, -7F);

		bodyModel[17].addShapeBox(0F, 0.5F, 0F, 36, 1, 3, 0F, 0F, -5F, -11F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, 9F, 0F, 5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 10F); // Box 0
		bodyModel[17].setRotationPoint(-38.5F, 0F, 7F);

		bodyModel[18].addShapeBox(0F, 0.5F, 0F, 36, 1, 3, 0F, 0F, -5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 10F, 0F, 5F, -11F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, 9F); // Box 2
		bodyModel[18].setRotationPoint(-38.5F, 2F, 7F);

		bodyModel[19].addShapeBox(0F, 0.5F, 0F, 36, 1, 3, 0F, 0F, -5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -10F, 0F, 5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -10F); // Box 3
		bodyModel[19].setRotationPoint(-38.5F, 1F, -10F);

		bodyModel[20].addShapeBox(0F, 0.5F, 0F, 36, 1, 3, 0F, 0F, -5F, 9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -11F, 0F, 5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -10F); // Box 4
		bodyModel[20].setRotationPoint(-38.5F, 0F, -10F);

		bodyModel[21].addShapeBox(0F, 0.5F, 0F, 36, 1, 3, 0F, 0F, -5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -10F, 0F, 5F, 9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, -11F); // Box 5
		bodyModel[21].setRotationPoint(-38.5F, 2F, -10F);

		bodyModel[22].addShapeBox(0F, 0.5F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[22].setRotationPoint(-2.5F, 0F, 7F);

		bodyModel[23].addShapeBox(0F, 0.5F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[23].setRotationPoint(-2.5F, 0F, -10F);

		bodyModel[24].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[24].setRotationPoint(-1.5F, 0F, -10F);

		bodyModel[25].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[25].setRotationPoint(-1.5F, 0F, 7F);

		bodyModel[26].addShapeBox(0F, 0.5F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[26].setRotationPoint(-39.5F, 5F, -20F);

		bodyModel[27].addShapeBox(0F, 0.5F, 0F, 4, 1, 3, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Box 23
		bodyModel[27].setRotationPoint(-43.5F, 5F, -20F);

		bodyModel[28].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 24
		bodyModel[28].setRotationPoint(-41.5F, 7F, -20F);

		bodyModel[29].addShapeBox(0F, 0.5F, 0F, 1, 1, 3, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Box 25
		bodyModel[29].setRotationPoint(-40.5F, 5F, -20F);

		bodyModel[30].addShapeBox(0F, 0.5F, 0F, 5, 1, 1, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 26
		bodyModel[30].setRotationPoint(-44.5F, 5F, -19F);

		bodyModel[31].addShapeBox(0F, 0.5F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[31].setRotationPoint(-39.5F, 5F, 17F);

		bodyModel[32].addShapeBox(0F, 0.5F, 0F, 4, 1, 3, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Box 28
		bodyModel[32].setRotationPoint(-43.5F, 5F, 17F);

		bodyModel[33].addShapeBox(0F, 0.5F, 0F, 2, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 29
		bodyModel[33].setRotationPoint(-41.5F, 7F, 17F);

		bodyModel[34].addShapeBox(0F, 0.5F, 0F, 1, 1, 3, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Box 30
		bodyModel[34].setRotationPoint(-40.5F, 5F, 17F);

		bodyModel[35].addShapeBox(0F, 0.5F, 0F, 5, 1, 1, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[35].setRotationPoint(-44.5F, 5F, 18F);

		bodyModel[36].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[36].setRotationPoint(-1F, -0.5F, -9F);

		bodyModel[37].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[37].setRotationPoint(-1F, -0.5F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 27
		bodyModel[38].setRotationPoint(2.5F, 1F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 28
		bodyModel[39].setRotationPoint(2.5F, 0F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 29
		bodyModel[40].setRotationPoint(2.5F, 0F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 30
		bodyModel[41].setRotationPoint(5.5F, 0F, -4F);


		turretModel = new ModelRendererTurbo[23];
		turretModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 15
		turretModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 16
		turretModel[2] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 50
		turretModel[3] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 51
		turretModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 52
		turretModel[5] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		turretModel[6] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 54
		turretModel[7] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 66
		turretModel[8] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 30
		turretModel[9] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 31
		turretModel[10] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 34
		turretModel[11] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 32
		turretModel[12] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 33
		turretModel[13] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 36
		turretModel[14] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 37
		turretModel[15] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 17
		turretModel[16] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 18
		turretModel[17] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 19
		turretModel[18] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 20
		turretModel[19] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 23
		turretModel[20] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 24
		turretModel[21] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 0
		turretModel[22] = new ModelRendererTurbo(this, 100, 100, textureX, textureY); // Box 0

		turretModel[0].addShapeBox(6.3F, -12F, -1.5F, 1, 2, 3, 0F, -0.6F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.6F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 15
		turretModel[0].setRotationPoint(0F, 1F, 0F);

		turretModel[1].addShapeBox(11.8F, -2F, -1.5F, 1, 2, 3, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.1F, 0F, 0F); // Box 16
		turretModel[1].setRotationPoint(0F, 1F, 0F);

		turretModel[2].addShapeBox(-2F, -0.8F, -5F, 4, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		turretModel[2].setRotationPoint(0F, 1F, 0F);

		turretModel[3].addShapeBox(-4F, -5.8F, -3F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		turretModel[3].setRotationPoint(0F, 1F, 0F);

		turretModel[4].addShapeBox(-4F, -5.8F, 2F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		turretModel[4].setRotationPoint(0F, 1F, 0F);

		turretModel[5].addShapeBox(-4F, -7.8F, 2F, 8, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		turretModel[5].setRotationPoint(0F, 1F, 0F);

		turretModel[6].addShapeBox(-4F, -7.8F, -3F, 8, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		turretModel[6].setRotationPoint(0F, 1F, 0F);

		turretModel[7].addShapeBox(-1F, -7.8F, -2.5F, 2, 2, 5, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 66
		turretModel[7].setRotationPoint(0F, 1F, 0F);

		turretModel[8].addShapeBox(2F, -0.8F, -5F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 30
		turretModel[8].setRotationPoint(0F, 1F, 0F);

		turretModel[9].addShapeBox(-4F, -0.8F, -5F, 2, 1, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 31
		turretModel[9].setRotationPoint(0F, 1F, 0F);

		turretModel[10].addShapeBox(2F, -7.8F, 3F, 8, 2, 1, 0F, 0F, -2F, 1F, -2.4F, 2F, -0.3F, -2.9F, 2F, 0F, 0F, -2F, -1F, -1.5F, 0F, 0F, -2F, -3F, -0.3F, -2.1F, -3F, 0F, -1.5F, 0F, -0.7F); // Box 34
		turretModel[10].setRotationPoint(0F, 1F, 0F);

		turretModel[11].addShapeBox(0F, -3.8F, 3F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 32
		turretModel[11].setRotationPoint(0F, 1F, 0F);

		turretModel[12].addShapeBox(-0.5F, -4.3F, 4.4F, 5, 5, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, -0.5F, 0F, -3F, -0.5F); // Box 33
		turretModel[12].setRotationPoint(0F, 1F, 0F);

		turretModel[13].addShapeBox(-0.5F, -3F, 3F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 36
		turretModel[13].setRotationPoint(0F, 1F, 0F);
		turretModel[13].rotateAngleY = 0.45378561F;

		turretModel[14].addShapeBox(-1F, -3.5F, 4.4F, 5, 5, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, -0.5F, 0F, -3F, -0.5F); // Box 37
		turretModel[14].setRotationPoint(0F, 1F, 0F);
		turretModel[14].rotateAngleY = 0.45378561F;

		turretModel[15].addShapeBox(7.3F, -12F, 1.5F, 1, 12, 12, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, 4.1F, -1F, 0F, -5.9F, 0F, 0F, 5F, 0F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 17
		turretModel[15].setRotationPoint(0F, 1F, 0F);

		turretModel[16].addShapeBox(7.3F, -12F, -13.5F, 1, 12, 12, 0F, 4.1F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 5F, 0F, 0F, -5.9F, 0F, 0F); // Box 18
		turretModel[16].setRotationPoint(0F, 1F, 0F);

		turretModel[17].addShapeBox(7F, -12F, 1.5F, 1, 12, 12, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, 4.1F, -1F, 0F, -5.9F, 0F, 0F, 5F, 0F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 19
		turretModel[17].setRotationPoint(0F, 1F, 0F);

		turretModel[18].addShapeBox(7F, -12F, -13.5F, 1, 12, 12, 0F, 4.1F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 5F, 0F, 0F, -5.9F, 0F, 0F); // Box 20
		turretModel[18].setRotationPoint(0F, 1F, 0F);

		turretModel[19].addShapeBox(-1.5F, -0.8F, 2.8F, 3, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 23
		turretModel[19].setRotationPoint(0F, -6F, 0F);

		turretModel[20].addShapeBox(0.5F, -0.2F, 2.8F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 24
		turretModel[20].setRotationPoint(0F, -6F, 0F);

		turretModel[21].addShapeBox(2F, -7.8F, -4F, 8, 2, 1, 0F, 0F, -2F, -1F, -2.9F, 2F, 0F, -2.4F, 2F, -0.3F, 0F, -2F, 1F, -1.5F, 0F, -0.7F, -2.1F, -3F, 0F, -2F, -3F, -0.3F, -1.5F, 0F, 0F); // Box 0
		turretModel[21].setRotationPoint(0F, 1F, 0F);

		turretModel[22].addShapeBox(2F, -12F, -6F, 35, 1, 35, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -30F, 0F, 0F, -30F); // Box 0
		turretModel[22].setRotationPoint(0F, 1F, 0F);
		turretModel[22].rotateAngleX = -1.13446401F;
		turretModel[22].rotateAngleY = -1.88495559F;
		turretModel[22].rotateAngleZ = -0.10471976F;


		barrelModel = new ModelRendererTurbo[56];
		barrelModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 231
		barrelModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 239
		barrelModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 242
		barrelModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 243
		barrelModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 244
		barrelModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 245
		barrelModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 246
		barrelModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 247
		barrelModel[8] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 248
		barrelModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 249
		barrelModel[10] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 68
		barrelModel[11] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 237
		barrelModel[12] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 238
		barrelModel[13] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 34
		barrelModel[14] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 35
		barrelModel[15] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 55
		barrelModel[16] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 59
		barrelModel[17] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 60
		barrelModel[18] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 61
		barrelModel[19] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 0
		barrelModel[20] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 1
		barrelModel[21] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 2
		barrelModel[22] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 3
		barrelModel[23] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 4
		barrelModel[24] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 5
		barrelModel[25] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 12
		barrelModel[26] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 13
		barrelModel[27] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 14
		barrelModel[28] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 15
		barrelModel[29] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 16
		barrelModel[30] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 18
		barrelModel[31] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 20
		barrelModel[32] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 21
		barrelModel[33] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 22
		barrelModel[34] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 23
		barrelModel[35] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 25
		barrelModel[36] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1
		barrelModel[37] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 2
		barrelModel[38] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 3
		barrelModel[39] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 4
		barrelModel[40] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 5
		barrelModel[41] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 7
		barrelModel[42] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 8
		barrelModel[43] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 6
		barrelModel[44] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 7
		barrelModel[45] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 8
		barrelModel[46] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 9
		barrelModel[47] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 10
		barrelModel[48] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 12
		barrelModel[49] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 14
		barrelModel[50] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 1
		barrelModel[51] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 2
		barrelModel[52] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 3
		barrelModel[53] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 4
		barrelModel[54] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 5
		barrelModel[55] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 26

		barrelModel[0].addShapeBox(13F, -1F, -1F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		barrelModel[0].setRotationPoint(0F, -6F, 0F);

		barrelModel[1].addShapeBox(43F, -2F, -2F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		barrelModel[1].setRotationPoint(0F, -6F, 0F);

		barrelModel[2].addShapeBox(43F, -1F, 1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		barrelModel[2].setRotationPoint(0F, -6F, 0F);

		barrelModel[3].addShapeBox(43F, -1F, -2F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		barrelModel[3].setRotationPoint(0F, -6F, 0F);

		barrelModel[4].addShapeBox(43F, 1F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 244
		barrelModel[4].setRotationPoint(0F, -6F, 0F);

		barrelModel[5].addShapeBox(46F, -2F, -2F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		barrelModel[5].setRotationPoint(0F, -6F, 0F);

		barrelModel[6].addShapeBox(46F, 1F, -2F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 246
		barrelModel[6].setRotationPoint(0F, -6F, 0F);

		barrelModel[7].addShapeBox(46F, -1F, 1F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		barrelModel[7].setRotationPoint(0F, -6F, 0F);

		barrelModel[8].addShapeBox(46F, -1F, -2F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		barrelModel[8].setRotationPoint(0F, -6F, 0F);

		barrelModel[9].addShapeBox(44F, -2F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		barrelModel[9].setRotationPoint(0F, -6F, 0F);

		barrelModel[10].addShapeBox(38F, -1F, -1F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 68
		barrelModel[10].setRotationPoint(0F, -6F, 0F);

		barrelModel[11].addShapeBox(40F, -1.5F, -1F, 3, 1, 2, 0F, 0F, -0.3F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F); // Box 237
		barrelModel[11].setRotationPoint(0F, -6F, 0F);

		barrelModel[12].addShapeBox(40F, 0.5F, -1F, 3, 1, 2, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0.2F); // Box 238
		barrelModel[12].setRotationPoint(0F, -6F, 0F);

		barrelModel[13].addShapeBox(44F, 1F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		barrelModel[13].setRotationPoint(0F, -6F, 0F);

		barrelModel[14].addShapeBox(0F, -1F, -1F, 14, 2, 2, 0F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 35
		barrelModel[14].setRotationPoint(0F, -6F, 0F);

		barrelModel[15].addShapeBox(-7F, 0F, -1F, 7, 1, 2, 0F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F); // Box 55
		barrelModel[15].setRotationPoint(0F, -6F, 0F);

		barrelModel[16].addShapeBox(-8F, -0.6F, 0.6F, 1, 1, 1, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 59
		barrelModel[16].setRotationPoint(0F, -6F, 0F);

		barrelModel[17].addShapeBox(-7F, -1.6F, -0.5F, 7, 1, 2, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F); // Box 60
		barrelModel[17].setRotationPoint(0F, -6F, 0F);

		barrelModel[18].addShapeBox(-8F, 1F, -1.5F, 1, 1, 3, 0F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 61
		barrelModel[18].setRotationPoint(0F, -6F, 0F);

		barrelModel[19].addShapeBox(-9F, -1.6F, -0.7F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, -0.2F, 1.1F, 0F, -0.2F, 1.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F); // Box 0
		barrelModel[19].setRotationPoint(0F, -6F, 0F);

		barrelModel[20].addShapeBox(-8F, -1.6F, -0.5F, 1, 1, 2, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F); // Box 1
		barrelModel[20].setRotationPoint(0F, -6F, 0F);

		barrelModel[21].addShapeBox(-8F, -1.6F, -0.7F, 8, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F); // Box 2
		barrelModel[21].setRotationPoint(0F, -6F, 0F);

		barrelModel[22].addShapeBox(-10F, -1.8F, 1.6F, 5, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 3
		barrelModel[22].setRotationPoint(0F, -6F, 0F);

		barrelModel[23].addShapeBox(-10F, -2.2F, 1.6F, 5, 1, 1, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 4
		barrelModel[23].setRotationPoint(0F, -6F, 0F);

		barrelModel[24].addShapeBox(-10F, -1.4F, 1.6F, 5, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 5
		barrelModel[24].setRotationPoint(0F, -6F, 0F);

		barrelModel[25].addShapeBox(0F, -0.4F, 5.6F, 9, 1, 1, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 12
		barrelModel[25].setRotationPoint(0F, -6F, 0F);

		barrelModel[26].addShapeBox(0F, -5.55111512312578E-17F, 5.6F, 9, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 13
		barrelModel[26].setRotationPoint(0F, -6F, 0F);

		barrelModel[27].addShapeBox(0F, 0.4F, 5.6F, 9, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 14
		barrelModel[27].setRotationPoint(0F, -6F, 0F);

		barrelModel[28].addShapeBox(0.5F, 0F, 4F, 1, 1, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 15
		barrelModel[28].setRotationPoint(0F, -6F, 0F);

		barrelModel[29].addShapeBox(0.5F, 0F, 4.6F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 16
		barrelModel[29].setRotationPoint(0F, -6F, 0F);

		barrelModel[30].addShapeBox(-19F, 1.5F, -1.5F, 10, 2, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 18
		barrelModel[30].setRotationPoint(0F, -5F, 0F);

		barrelModel[31].addShapeBox(-19F, 1.5F, 1.5F, 10, 2, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 20
		barrelModel[31].setRotationPoint(0F, -5F, 0F);

		barrelModel[32].addShapeBox(-19F, 2.5F, -1.5F, 10, 1, 3, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 21
		barrelModel[32].setRotationPoint(0F, -5F, 0F);

		barrelModel[33].addShapeBox(-9F, 2.5F, -1.5F, 1, 2, 3, 0F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F); // Box 22
		barrelModel[33].setRotationPoint(0F, -6F, 0F);

		barrelModel[34].addShapeBox(-12F, 0F, 3.8F, 8, 2, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, -0.9F, 0F, -1.5F, -0.9F); // Box 23
		barrelModel[34].setRotationPoint(0F, -6F, 0F);

		barrelModel[35].addShapeBox(-4F, 0F, 3.8F, 3, 2, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 1.1F, 0F, 0.3F, -1.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 1.1F, 0F, -1.5F, -1.9F, 0F, -1.5F, -0.9F); // Box 25
		barrelModel[35].setRotationPoint(0F, -6F, 0F);

		barrelModel[36].addShapeBox(-6F, 2F, -1.5F, 20, 2, 3, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 1
		barrelModel[36].setRotationPoint(0F, -6.2F, 0F);

		barrelModel[37].addShapeBox(14F, 2F, -1.5F, 2, 2, 3, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 2
		barrelModel[37].setRotationPoint(0F, -6.2F, 0F);

		barrelModel[38].addShapeBox(-8F, 2F, -1.5F, 2, 2, 3, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 3
		barrelModel[38].setRotationPoint(0F, -6.2F, 0F);

		barrelModel[39].addShapeBox(14F, -1F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 4
		barrelModel[39].setRotationPoint(0F, -6.2F, 0F);

		barrelModel[40].addShapeBox(14F, -0.7F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F); // Box 5
		barrelModel[40].setRotationPoint(0F, -6F, 0F);

		barrelModel[41].addShapeBox(-19F, 1.1F, -2F, 10, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 7
		barrelModel[41].setRotationPoint(0F, -5F, 0F);

		barrelModel[42].addShapeBox(-19F, 1.1F, 1F, 10, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 8
		barrelModel[42].setRotationPoint(0F, -5F, 0F);

		barrelModel[43].addShapeBox(-9F, 1F, -1.5F, 1, 1, 3, 0F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F); // Box 6
		barrelModel[43].setRotationPoint(0F, -6F, 0F);

		barrelModel[44].addShapeBox(-9F, 0.5F, -1.5F, 1, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F); // Box 7
		barrelModel[44].setRotationPoint(0F, -6F, 0F);

		barrelModel[45].addShapeBox(-9F, -0.5F, -1.5F, 1, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F); // Box 8
		barrelModel[45].setRotationPoint(0F, -6F, 0F);

		barrelModel[46].addShapeBox(-9F, -0.6F, 0.6F, 1, 1, 1, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F); // Box 9
		barrelModel[46].setRotationPoint(0F, -6F, 0F);

		barrelModel[47].addShapeBox(-9F, -1.6F, -0.5F, 1, 1, 2, 0F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F); // Box 10
		barrelModel[47].setRotationPoint(0F, -6F, 0F);

		barrelModel[48].addShapeBox(-8F, -0.5F, -1.5F, 1, 1, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F); // Box 12
		barrelModel[48].setRotationPoint(0F, -6F, 0F);

		barrelModel[49].addShapeBox(-8F, 0.5F, -1.5F, 1, 1, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F); // Box 14
		barrelModel[49].setRotationPoint(0F, -6F, 0F);

		barrelModel[50].addShapeBox(-4F, 0.8F, 3.8F, 3, 2, 1, 0F, 0F, -1.5F, 0.1F, 0F, -1.5F, 1.1F, 0F, -1.5F, -1.9F, 0F, -1.5F, -0.9F, 0F, 0.3F, 0.1F, 0F, 0.3F, 1.1F, 0F, 0.3F, -1.9F, 0F, 0.3F, -0.9F); // Box 1
		barrelModel[50].setRotationPoint(0F, -6F, 0F);

		barrelModel[51].addShapeBox(-12F, 2.6F, 3.8F, 8, 2, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, -0.9F, 0F, -1.5F, -0.9F); // Box 2
		barrelModel[51].setRotationPoint(0F, -6F, 0F);

		barrelModel[52].addShapeBox(-11F, 0.8F, 3.3F, 7, 3, 1, 0F, 0F, 0.3F, -0.45F, -1F, 0.3F, -0.45F, -1F, 0.3F, -0.45F, 0F, 0.3F, -0.45F, 0F, -1.5F, -0.45F, -1F, -1.5F, -0.45F, -1F, -1.5F, -0.45F, 0F, -1.5F, -0.45F); // Box 3
		barrelModel[52].setRotationPoint(0F, -6F, 0F);

		barrelModel[53].addShapeBox(-12F, 0.8F, 3.8F, 1, 3, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, -0.9F, 0F, -1.5F, -0.9F); // Box 4
		barrelModel[53].setRotationPoint(0F, -6F, 0F);

		barrelModel[54].addShapeBox(-5F, 0.8F, 3.8F, 1, 3, 1, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, -0.9F, 0F, -1.5F, -0.9F); // Box 5
		barrelModel[54].setRotationPoint(0F, -6F, 0F);

		barrelModel[55].addShapeBox(14F, 0.4F, -1.5F, 2, 2, 3, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		barrelModel[55].setRotationPoint(0F, -6.2F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
