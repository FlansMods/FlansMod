//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelBofors extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBofors() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[45];
		bodyModel[0] = new ModelRendererTurbo(this, 3, 93, textureX, textureY); // Shape 4
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 3, 93, textureX, textureY); // Shape 5
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 79, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 153, 93, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 168, 18, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 210, 73, textureX, textureY); // Box 32
		bodyModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 33
		bodyModel[9] = new ModelRendererTurbo(this, 189, 91, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 3, 93, textureX, textureY); // Shape 16
		bodyModel[14] = new ModelRendererTurbo(this, 3, 93, textureX, textureY); // Shape 17
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 1
		bodyModel[27] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 49, 13, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 65, 13, textureX, textureY); // Box 5
		bodyModel[30] = new ModelRendererTurbo(this, 169, 13, textureX, textureY); // Box 6
		bodyModel[31] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 169, 13, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 65, 13, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 49, 13, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 65

		bodyModel[0].addShape3D(6F, -6F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 13, 13, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 4
		bodyModel[0].setRotationPoint(24.5F, 3F, 16F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F); // Box 4
		bodyModel[1].setRotationPoint(24F, 2.5F, -15F);

		bodyModel[2].addShape3D(6F, -6F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 13, 13, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 5
		bodyModel[2].setRotationPoint(24.5F, 3F, -16F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F); // Box 6
		bodyModel[3].setRotationPoint(24F, 2.5F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F); // Box 7
		bodyModel[4].setRotationPoint(24F, 2.5F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(6.5F, 1.5F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(26.5F, 1.5F, -1.5F);

		bodyModel[7].addShapeBox(-5.5F, 0F, -5.5F, 3, 3, 13, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 32
		bodyModel[7].setRotationPoint(-1F, 1.5F, -1F);

		bodyModel[8].addBox(-2.5F, 0F, -5.5F, 7, 3, 13, 0F); // Box 33
		bodyModel[8].setRotationPoint(-1F, 1.5F, -1F);

		bodyModel[9].addShapeBox(2.5F, 0F, -5.5F, 3, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 34
		bodyModel[9].setRotationPoint(1F, 1.5F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 25, 3, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(-31.5F, 1.5F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 3F); // Box 14
		bodyModel[11].setRotationPoint(-30F, 2.5F, -15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F); // Box 15
		bodyModel[12].setRotationPoint(-30F, 2.5F, -14F);

		bodyModel[13].addShape3D(6F, -6F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 13, 13, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 16
		bodyModel[13].setRotationPoint(-29.5F, 3F, 16F);

		bodyModel[14].addShape3D(6F, -6F, -1.5F, new Shape2D(new Coord2D[]{new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3)}), 3, 13, 13, 44, 3, ModelRendererTurbo.MR_FRONT, new float[]{5, 6, 5, 6, 5, 6, 5, 6}); // Shape 17
		bodyModel[14].setRotationPoint(-29.5F, 3F, -16F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F, 0F, -0.3F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1F); // Box 18
		bodyModel[15].setRotationPoint(-37.5F, 1.5F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-1.5F, 1.5F, -30.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[17].setRotationPoint(-1.5F, 1.5F, 6.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F); // Box 22
		bodyModel[18].setRotationPoint(-1.5F, 1.5F, 26.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[19].setRotationPoint(-1.5F, 1.5F, -14.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[20].setRotationPoint(-1.5F, 1.5F, 18.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-1.5F, 1.5F, -26.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-1F, 1.5F, 14.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-1F, 3.5F, 14.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 28
		bodyModel[24].setRotationPoint(-1F, 1.5F, -18.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 29
		bodyModel[25].setRotationPoint(-1F, 3.5F, -18.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 1
		bodyModel[26].setRotationPoint(-0.5F, 0F, -30F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 2
		bodyModel[27].setRotationPoint(-0.5F, 0F, -32F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[28].setRotationPoint(-2.5F, 8F, -31.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 5
		bodyModel[29].setRotationPoint(-2.5F, 8F, -30F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 6
		bodyModel[30].setRotationPoint(-2.5F, 8F, -28.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 35
		bodyModel[31].setRotationPoint(-0.5F, 0F, 27F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 36
		bodyModel[32].setRotationPoint(-0.5F, 0F, 29F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[33].setRotationPoint(-2.5F, 8F, 27.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 38
		bodyModel[34].setRotationPoint(-2.5F, 8F, 29F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 39
		bodyModel[35].setRotationPoint(-2.5F, 8F, 30.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-33.5F, 8F, -2.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(-35F, 8F, -2.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F); // Box 42
		bodyModel[38].setRotationPoint(-36.5F, 8F, -2.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 43
		bodyModel[39].setRotationPoint(-35F, 0F, -0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F); // Box 44
		bodyModel[40].setRotationPoint(18.5F, 8F, -2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 45
		bodyModel[41].setRotationPoint(20F, 8F, -2.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 46
		bodyModel[42].setRotationPoint(21.5F, 8F, -2.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 47
		bodyModel[43].setRotationPoint(20F, 0F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F); // Box 65
		bodyModel[44].setRotationPoint(-30F, 2.5F, 10F);


		turretModel = new ModelRendererTurbo[36];
		turretModel[0] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 48
		turretModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		turretModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 29
		turretModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 31
		turretModel[4] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 52
		turretModel[5] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 53
		turretModel[6] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 54
		turretModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 55
		turretModel[8] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 56
		turretModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 57
		turretModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 58
		turretModel[11] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 59
		turretModel[12] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 60
		turretModel[13] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 61
		turretModel[14] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 62
		turretModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 63
		turretModel[16] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 47
		turretModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 48
		turretModel[18] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 49
		turretModel[19] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 72
		turretModel[20] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 73
		turretModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
		turretModel[22] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 75
		turretModel[23] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 91
		turretModel[24] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 93
		turretModel[25] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 94
		turretModel[26] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 95
		turretModel[27] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 96
		turretModel[28] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 97
		turretModel[29] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 136
		turretModel[30] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 138
		turretModel[31] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 139
		turretModel[32] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 140
		turretModel[33] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 141
		turretModel[34] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 142
		turretModel[35] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 143

		turretModel[0].addBox(-15F, -2F, -13F, 11, 1, 26, 0F); // Box 48
		turretModel[0].setRotationPoint(0F, 1F, 0F);

		turretModel[1].addBox(-1.5F, -1.5F, -4.5F, 3, 2, 9, 0F); // Box 28
		turretModel[1].setRotationPoint(0F, 1F, 0F);

		turretModel[2].addShapeBox(-4.5F, -1.5F, -4.5F, 3, 2, 9, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 29
		turretModel[2].setRotationPoint(0F, 1F, 0F);

		turretModel[3].addShapeBox(1.5F, -1.5F, -4.5F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 31
		turretModel[3].setRotationPoint(0F, 1F, 0F);

		turretModel[4].addBox(-4F, -2F, -13F, 2, 1, 8, 0F); // Box 52
		turretModel[4].setRotationPoint(0F, 1F, 0F);

		turretModel[5].addBox(-4F, -2F, 5F, 2, 1, 8, 0F); // Box 53
		turretModel[5].setRotationPoint(0F, 1F, 0F);

		turretModel[6].addShapeBox(-16F, -2F, -13F, 1, 1, 26, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 54
		turretModel[6].setRotationPoint(0F, 1F, 0F);

		turretModel[7].addShapeBox(-16F, -8F, -1.5F, 1, 6, 1, 0F, -0.3F, 0F, -1F, -0.3F, -0.8F, -1F, -0.3F, -0.8F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 55
		turretModel[7].setRotationPoint(0F, 1F, 0F);

		turretModel[8].addShapeBox(-16F, -8F, 0.5F, 1, 6, 1, 0F, -0.3F, 0F, 1F, -0.3F, -0.8F, 1F, -0.3F, -0.8F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F); // Box 56
		turretModel[8].setRotationPoint(0F, 1F, 0F);

		turretModel[9].addShapeBox(-16F, -9.5F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 57
		turretModel[9].setRotationPoint(0F, 1F, 0F);

		turretModel[10].addShapeBox(-15F, -6.5F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 58
		turretModel[10].setRotationPoint(0F, 1F, 0F);

		turretModel[11].addShapeBox(-13F, -3.5F, -1F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 59
		turretModel[11].setRotationPoint(0F, 1F, 0F);

		turretModel[12].addShapeBox(-10F, -2.5F, -1F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 60
		turretModel[12].setRotationPoint(0F, 1F, 0F);

		turretModel[13].addShapeBox(-4F, -5F, -4F, 7, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		turretModel[13].setRotationPoint(0F, 1F, 0F);

		turretModel[14].addShapeBox(-4F, -5F, 3F, 7, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		turretModel[14].setRotationPoint(0F, 1F, 0F);

		turretModel[15].addShapeBox(-2F, -7F, -4F, 7, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		turretModel[15].setRotationPoint(0F, 1F, 0F);

		turretModel[16].addShapeBox(0F, -2.75F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 47
		turretModel[16].setRotationPoint(0F, -3F, 0F);

		turretModel[17].addShapeBox(0F, -2F, -2.5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		turretModel[17].setRotationPoint(0F, -3F, 0F);

		turretModel[18].addShapeBox(0F, -1.25F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 49
		turretModel[18].setRotationPoint(0F, -3F, 0F);

		turretModel[19].addShapeBox(0F, -2.75F, 0.5F, 8, 1, 2, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 72
		turretModel[19].setRotationPoint(0F, -3F, 0F);

		turretModel[20].addShapeBox(0F, -1.25F, 0.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 73
		turretModel[20].setRotationPoint(0F, -3F, 0F);

		turretModel[21].addShapeBox(0F, -2F, 0.5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		turretModel[21].setRotationPoint(0F, -3F, 0F);

		turretModel[22].addShapeBox(1F, -4.5F, -3F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		turretModel[22].setRotationPoint(0F, 1F, 0F);

		turretModel[23].addShapeBox(-3F, -10F, -4F, 6, 3, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 91
		turretModel[23].setRotationPoint(0F, 1F, 0F);

		turretModel[24].addShapeBox(-3F, -10F, 3F, 6, 3, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 93
		turretModel[24].setRotationPoint(0F, 1F, 0F);

		turretModel[25].addShapeBox(-2F, -7F, 3F, 7, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 94
		turretModel[25].setRotationPoint(0F, 1F, 0F);

		turretModel[26].addShapeBox(-3F, -11F, -4F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		turretModel[26].setRotationPoint(0F, 1F, 0F);

		turretModel[27].addShapeBox(-2F, -11F, -3F, 2, 2, 6, 0F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, 1.2F, -0.2F, -0.2F, 1.2F); // Box 96
		turretModel[27].setRotationPoint(0F, 1F, 0F);

		turretModel[28].addShapeBox(-3F, -11F, 3F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		turretModel[28].setRotationPoint(0F, 1F, 0F);

		turretModel[29].addShapeBox(-4F, -2F, -4F, 11, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 136
		turretModel[29].setRotationPoint(0F, 1F, 0F);

		turretModel[30].addBox(-4F, -4F, -12F, 1, 2, 1, 0F); // Box 138
		turretModel[30].setRotationPoint(0F, 1F, 0F);

		turretModel[31].addBox(-6F, -5F, -16.5F, 7, 1, 9, 0F); // Box 139
		turretModel[31].setRotationPoint(0F, 1F, 0F);

		turretModel[32].addShapeBox(-7F, -10F, -16.5F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 140
		turretModel[32].setRotationPoint(0F, 1F, 0F);

		turretModel[33].addBox(-4F, -4F, 11F, 1, 2, 1, 0F); // Box 141
		turretModel[33].setRotationPoint(0F, 1F, 0F);

		turretModel[34].addBox(-6F, -5F, 6.5F, 7, 1, 9, 0F); // Box 142
		turretModel[34].setRotationPoint(0F, 1F, 0F);

		turretModel[35].addShapeBox(-7F, -10F, 6.5F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 143
		turretModel[35].setRotationPoint(0F, 1F, 0F);


		barrelModel = new ModelRendererTurbo[42];
		barrelModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 77
		barrelModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 78
		barrelModel[2] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 79
		barrelModel[3] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 81
		barrelModel[4] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 82
		barrelModel[5] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 84
		barrelModel[6] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 87
		barrelModel[7] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 88
		barrelModel[8] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 90
		barrelModel[9] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 99
		barrelModel[10] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 100
		barrelModel[11] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 101
		barrelModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 102
		barrelModel[13] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 73
		barrelModel[14] = new ModelRendererTurbo(this, 89, 63, textureX, textureY); // Box 74
		barrelModel[15] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 76
		barrelModel[16] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 80
		barrelModel[17] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 81
		barrelModel[18] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 83
		barrelModel[19] = new ModelRendererTurbo(this, 57, 71, textureX, textureY); // Box 78
		barrelModel[20] = new ModelRendererTurbo(this, 63, 56, textureX, textureY); // Box 110
		barrelModel[21] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 111
		barrelModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 115
		barrelModel[23] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 116
		barrelModel[24] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 117
		barrelModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 118
		barrelModel[26] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 119
		barrelModel[27] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 120
		barrelModel[28] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 127
		barrelModel[29] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 128
		barrelModel[30] = new ModelRendererTurbo(this, 31, 66, textureX, textureY); // Box 129
		barrelModel[31] = new ModelRendererTurbo(this, 95, 57, textureX, textureY); // Box 130
		barrelModel[32] = new ModelRendererTurbo(this, 95, 57, textureX, textureY); // Box 131
		barrelModel[33] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 132
		barrelModel[34] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 133
		barrelModel[35] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 134
		barrelModel[36] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 137
		barrelModel[37] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 0
		barrelModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		barrelModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		barrelModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		barrelModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3

		barrelModel[0].addShapeBox(-4F, 2.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F); // Box 77
		barrelModel[0].setRotationPoint(-1F, -8F, 0F);

		barrelModel[1].addShapeBox(-1F, 2.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F); // Box 78
		barrelModel[1].setRotationPoint(-1F, -8F, 0F);

		barrelModel[2].addShapeBox(-3F, 0.5F, -0.5F, 2, 4, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 79
		barrelModel[2].setRotationPoint(-1F, -8F, 0F);

		barrelModel[3].addShapeBox(-4F, 1.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 81
		barrelModel[3].setRotationPoint(-1F, -8F, 0F);

		barrelModel[4].addShapeBox(-1F, 1.5F, -0.5F, 1, 1, 1, 0F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 82
		barrelModel[4].setRotationPoint(-1F, -8F, 0F);

		barrelModel[5].addShapeBox(-1F, -3F, -0.5F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		barrelModel[5].setRotationPoint(0F, -4.5F, 0F);

		barrelModel[6].addShapeBox(-11F, -2F, -1F, 2, 1, 2, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 87
		barrelModel[6].setRotationPoint(-1F, -8F, 0F);

		barrelModel[7].addShapeBox(-12F, -1F, -1F, 1, 1, 2, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 88
		barrelModel[7].setRotationPoint(-1F, -8F, 0F);

		barrelModel[8].addShapeBox(-5F, -7F, -2.5F, 8, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		barrelModel[8].setRotationPoint(-1F, -8F, 0F);

		barrelModel[9].addShapeBox(3F, -7F, -2.5F, 7, 8, 5, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 99
		barrelModel[9].setRotationPoint(-1F, -8F, 0F);

		barrelModel[10].addShapeBox(10F, -2F, -1F, 8, 1, 2, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 100
		barrelModel[10].setRotationPoint(-1F, -8F, 0F);

		barrelModel[11].addShapeBox(10F, -0.5F, -1F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 101
		barrelModel[11].setRotationPoint(-1F, -8F, 0F);

		barrelModel[12].addShapeBox(10F, -1.25F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		barrelModel[12].setRotationPoint(-1F, -8F, 0F);

		barrelModel[13].addShapeBox(10F, -5.5F, -2F, 8, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		barrelModel[13].setRotationPoint(-1F, -8F, 0F);

		barrelModel[14].addShapeBox(10F, -6.5F, -2F, 8, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		barrelModel[14].setRotationPoint(-1F, -8F, 0F);

		barrelModel[15].addShapeBox(10F, -3.5F, -2F, 8, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 76
		barrelModel[15].setRotationPoint(-1F, -8F, 0F);

		barrelModel[16].addShapeBox(18F, -6.5F, -2F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0F, 0F); // Box 80
		barrelModel[16].setRotationPoint(-1F, -8F, 0F);

		barrelModel[17].addShapeBox(18F, -5.5F, -2F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 81
		barrelModel[17].setRotationPoint(-1F, -8F, 0F);

		barrelModel[18].addShapeBox(18F, -3.5F, -2F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 83
		barrelModel[18].setRotationPoint(-1F, -8F, 0F);

		barrelModel[19].addShapeBox(20F, -6F, -1.5F, 20, 3, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.5F, -0.5F); // Box 78
		barrelModel[19].setRotationPoint(-1F, -8F, 0F);

		barrelModel[20].addShapeBox(40F, -6F, -1.5F, 2, 3, 3, 0F, 0F, -0.8F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, -0.8F); // Box 110
		barrelModel[20].setRotationPoint(-1F, -8F, 0F);

		barrelModel[21].addShapeBox(42F, -6F, -1.5F, 1, 3, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 111
		barrelModel[21].setRotationPoint(-1F, -8F, 0F);

		barrelModel[22].addShapeBox(-5F, -9F, -1.5F, 2, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 115
		barrelModel[22].setRotationPoint(-1F, -8F, 0F);

		barrelModel[23].addShapeBox(-5F, -9F, 0.5F, 2, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 116
		barrelModel[23].setRotationPoint(-1F, -8F, 0F);

		barrelModel[24].addShapeBox(-5F, -11F, 0.5F, 2, 2, 1, 0F, -1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 117
		barrelModel[24].setRotationPoint(-1F, -8F, 0F);

		barrelModel[25].addShapeBox(-5F, -11F, -1.5F, 2, 2, 1, 0F, -1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 118
		barrelModel[25].setRotationPoint(-1F, -8F, 0F);

		barrelModel[26].addShapeBox(-4F, -12F, -1.5F, 2, 1, 1, 0F, -1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 119
		barrelModel[26].setRotationPoint(-1F, -8F, 0F);

		barrelModel[27].addShapeBox(-4F, -12F, 0.5F, 2, 1, 1, 0F, -1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 120
		barrelModel[27].setRotationPoint(-1F, -8F, 0F);

		barrelModel[28].addShapeBox(0F, -9F, -1.5F, 2, 2, 1, 0F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 127
		barrelModel[28].setRotationPoint(-1F, -8F, 0F);

		barrelModel[29].addShapeBox(0F, -9F, 0.5F, 2, 2, 1, 0F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 128
		barrelModel[29].setRotationPoint(-1F, -8F, 0F);

		barrelModel[30].addShapeBox(10F, -6.5F, -10F, 1, 1, 20, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 129
		barrelModel[30].setRotationPoint(-1F, -8F, 0F);

		barrelModel[31].addShapeBox(10F, -7.5F, -12F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		barrelModel[31].setRotationPoint(-1F, -8F, 0F);

		barrelModel[32].addShapeBox(10F, -7.5F, 10F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		barrelModel[32].setRotationPoint(-1F, -8F, 0F);

		barrelModel[33].addShapeBox(11F, -12.5F, -13F, 1, 25, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, -21F, -21F); // Box 132
		barrelModel[33].setRotationPoint(-1F, -8F, 0F);

		barrelModel[34].addShapeBox(11F, -8.45F, -11.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 133
		barrelModel[34].setRotationPoint(-1F, -8F, 0F);

		barrelModel[35].addShapeBox(11F, -8.45F, 10.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 134
		barrelModel[35].setRotationPoint(-1F, -8F, 0F);

		barrelModel[36].addShapeBox(-9F, -7F, -2.5F, 4, 8, 5, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 137
		barrelModel[36].setRotationPoint(-1F, -8F, 0F);

		barrelModel[37].addShapeBox(11F, -12.5F, 9F, 1, 25, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, -21F, -21F); // Box 0
		barrelModel[37].setRotationPoint(-1F, -8F, 0F);

		barrelModel[38].addBox(-5.75F, -7.5F, -0.5F, 7, 1, 1, 0F); // Box 0
		barrelModel[38].setRotationPoint(-1F, -8F, 0F);
		barrelModel[38].rotateAngleZ = -0.10471976F;

		barrelModel[39].addBox(-5.75F, -8.55F, -0.5F, 7, 1, 1, 0F); // Box 1
		barrelModel[39].setRotationPoint(-1F, -8F, 0F);
		barrelModel[39].rotateAngleZ = -0.10471976F;

		barrelModel[40].addBox(-5.75F, -9.65F, -0.5F, 7, 1, 1, 0F); // Box 2
		barrelModel[40].setRotationPoint(-1F, -8F, 0F);
		barrelModel[40].rotateAngleZ = -0.10471976F;

		barrelModel[41].addBox(-5.75F, -10.75F, -0.5F, 7, 1, 1, 0F); // Box 3
		barrelModel[41].setRotationPoint(-1F, -8F, 0F);
		barrelModel[41].rotateAngleZ = -0.10471976F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
