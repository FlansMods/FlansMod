//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelSU25 extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSU25()
	{
		bodyModel = new ModelRendererTurbo[49];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 130, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 0, 370, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[9] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 5
		bodyModel[10] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Box 7
		bodyModel[12] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Box 8
		bodyModel[13] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Box 9
		bodyModel[14] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 1
		bodyModel[16] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 3
		bodyModel[18] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Box 5
		bodyModel[20] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Box 6
		bodyModel[21] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Box 7
		bodyModel[22] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Box 8
		bodyModel[23] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Box 9
		bodyModel[24] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Box 10
		bodyModel[25] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Box 11
		bodyModel[26] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Box 12
		bodyModel[27] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Box 13
		bodyModel[28] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 15
		bodyModel[29] = new ModelRendererTurbo(this, 200, 70, textureX, textureY); // Box 16
		bodyModel[30] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 19
		bodyModel[31] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 20
		bodyModel[32] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Box 21
		bodyModel[33] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 22
		bodyModel[34] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 23
		bodyModel[35] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Box 24
		bodyModel[36] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Box 25
		bodyModel[37] = new ModelRendererTurbo(this, 200, 430, textureX, textureY); // Box 26
		bodyModel[38] = new ModelRendererTurbo(this, 200, 480, textureX, textureY); // Box 27
		bodyModel[39] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 28
		bodyModel[40] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Box 29
		bodyModel[41] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 30
		bodyModel[42] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 31
		bodyModel[43] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 32
		bodyModel[44] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Box 33
		bodyModel[45] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Box 34
		bodyModel[46] = new ModelRendererTurbo(this, 200, 430, textureX, textureY); // Box 35
		bodyModel[47] = new ModelRendererTurbo(this, 200, 480, textureX, textureY); // Box 36
		bodyModel[48] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Box 23

		bodyModel[0].addShapeBox(0F, 0F, 0F, 21, 12, 10, 0F, 0F, 0F, 0F, 0F, 7F, 5F, 0F, 7F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-145F, -29F, -5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 23, 20, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-124F, -38F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 8, 23, 22, 0F); // Box 4
		bodyModel[2].setRotationPoint(-115F, -38F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 5, 17, 0F, 0F, -5F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F); // Box 5
		bodyModel[3].setRotationPoint(-115F, -43F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 39, 29, 2, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-107F, -44F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 39, 29, 2, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[5].setRotationPoint(-107F, -44F, 9F);

		bodyModel[6].addBox(0F, 0F, 0F, 79, 2, 18, 0F); // Box 2
		bodyModel[6].setRotationPoint(-107F, -17F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 11, 12, 12, 0F); // Box 3
		bodyModel[7].setRotationPoint(-71F, -53F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 12, 12, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 4
		bodyModel[8].setRotationPoint(-74F, -53F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 11, 23, 14, 0F); // Box 5
		bodyModel[9].setRotationPoint(-71F, -41F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 14, 6, 14, 0F); // Box 6
		bodyModel[10].setRotationPoint(-85F, -24F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 23, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F); // Box 7
		bodyModel[11].setRotationPoint(-107F, -38F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 3, 17, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[12].setRotationPoint(-107F, -41F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 40, 42, 2, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[13].setRotationPoint(-68F, -57F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 40, 42, 2, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-68F, -57F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 30, 32, 18, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[15].setRotationPoint(-58F, -49F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 46, 42, 22, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[16].setRotationPoint(-28F, -57F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 24, 42, 20, 0F); // Box 3
		bodyModel[17].setRotationPoint(-52F, -60F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 4
		bodyModel[18].setRotationPoint(-68F, -60F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 5
		bodyModel[19].setRotationPoint(-68F, -60F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 6
		bodyModel[20].setRotationPoint(-72F, -58F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 2, 18, 0F); // Box 7
		bodyModel[21].setRotationPoint(-72F, -58F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[22].setRotationPoint(-72F, -58F, 9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 1F, 0F, -0.1F); // Box 9
		bodyModel[23].setRotationPoint(-73F, -54F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 10
		bodyModel[24].setRotationPoint(-73F, -54F, 9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 28, 2, 2, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F); // Box 11
		bodyModel[25].setRotationPoint(-100F, -58F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 28, 2, 2, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F); // Box 12
		bodyModel[26].setRotationPoint(-100F, -58F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 9, 20, 0F, 0F, -4F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 13
		bodyModel[27].setRotationPoint(-107F, -47F, -10F);

		bodyModel[28].addBox(0F, 0F, 0F, 13, 42, 22, 0F); // Box 15
		bodyModel[28].setRotationPoint(18F, -57F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 23, 42, 22, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[29].setRotationPoint(31F, -57F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 25, 7, 17, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[30].setRotationPoint(-52F, -46F, -28F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 23, 16, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[31].setRotationPoint(-50F, -39F, -28F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 23, 16, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[32].setRotationPoint(-50F, -39F, -13F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 23, 7, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 22
		bodyModel[33].setRotationPoint(-50F, -23F, -28F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 26, 32, 17, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[34].setRotationPoint(-27F, -48F, -28F);

		bodyModel[35].addBox(0F, 0F, 0F, 21, 32, 17, 0F); // Box 24
		bodyModel[35].setRotationPoint(-1F, -48F, -28F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 13, 29, 17, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 25
		bodyModel[36].setRotationPoint(20F, -46F, -28F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 23, 24, 19, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 26
		bodyModel[37].setRotationPoint(33F, -42F, -28F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 23, 18, 20, 0F, 0F, 6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -4F, -7F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[38].setRotationPoint(56F, -36F, -28F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 25, 7, 17, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[39].setRotationPoint(-52F, -46F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 23, 16, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[40].setRotationPoint(-50F, -39F, 26F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 23, 7, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 30
		bodyModel[41].setRotationPoint(-50F, -23F, 11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 23, 16, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[42].setRotationPoint(-50F, -39F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 26, 32, 17, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[43].setRotationPoint(-27F, -48F, 11F);

		bodyModel[44].addBox(0F, 0F, 0F, 21, 32, 17, 0F); // Box 33
		bodyModel[44].setRotationPoint(-1F, -48F, 11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 29, 17, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 34
		bodyModel[45].setRotationPoint(20F, -46F, 11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 23, 24, 19, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 35
		bodyModel[46].setRotationPoint(33F, -42F, 9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 23, 18, 20, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -7F, 0F, 0F, 0F); // Box 36
		bodyModel[47].setRotationPoint(56F, -36F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 12, 10, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, -6F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1.5F, -2F); // Box 23
		bodyModel[48].setRotationPoint(-155F, -29F, -5F);


		tailModel = new ModelRendererTurbo[8];
		tailModel[0] = new ModelRendererTurbo(this, 200, 530, textureX, textureY); // Box 17
		tailModel[1] = new ModelRendererTurbo(this, 200, 590, textureX, textureY); // Box 18
		tailModel[2] = new ModelRendererTurbo(this, 200, 630, textureX, textureY); // Box 37
		tailModel[3] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Box 38
		tailModel[4] = new ModelRendererTurbo(this, 200, 730, textureX, textureY); // Box 39
		tailModel[5] = new ModelRendererTurbo(this, 200, 730, textureX, textureY); // Box 41
		tailModel[6] = new ModelRendererTurbo(this, 200, 790, textureX, textureY); // Box 42
		tailModel[7] = new ModelRendererTurbo(this, 200, 730, textureX, textureY); // Box 45

		tailModel[0].addShapeBox(0F, 0F, 0F, 31, 35, 22, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -4F, 0F, -11F, -4F, 0F, 0F, 0F); // Box 17
		tailModel[0].setRotationPoint(54F, -56F, -11F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 44, 23, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[1].setRotationPoint(85F, -55F, -7F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 51, 54, 4, 0F, -37F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -37F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		tailModel[2].setRotationPoint(66F, -109F, -2F);

		tailModel[3].addBox(0F, 0F, 0F, 31, 17, 4, 0F); // Box 38
		tailModel[3].setRotationPoint(117F, -72F, -2F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 11, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.55F, 0F, 0F, 1.55F, 0F, 0F, 0F, 0F, 0F); // Box 39
		tailModel[4].setRotationPoint(117F, -109F, -2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 29, 4, 46, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		tailModel[5].setRotationPoint(95F, -53F, -53F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 23, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F); // Box 42
		tailModel[6].setRotationPoint(129F, -55F, -7F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 29, 4, 46, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Box 45
		tailModel[7].setRotationPoint(95F, -53F, 7F);


		leftWingModel = new ModelRendererTurbo[13];
		leftWingModel[0] = new ModelRendererTurbo(this, 220, 850, textureX, textureY); // Box 46
		leftWingModel[1] = new ModelRendererTurbo(this, 200, 890, textureX, textureY); // Box 47
		leftWingModel[2] = new ModelRendererTurbo(this, 200, 920, textureX, textureY); // Box 48
		leftWingModel[3] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 49
		leftWingModel[4] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Box 50
		leftWingModel[5] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Box 58
		leftWingModel[6] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Box 59
		leftWingModel[7] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Box 60
		leftWingModel[8] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Box 61
		leftWingModel[9] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Box 24
		leftWingModel[10] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 25
		leftWingModel[11] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 26
		leftWingModel[12] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Box 27

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 57, 6, 121, 0F, -48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -44F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftWingModel[0].setRotationPoint(-27F, -46F, -149F);

		leftWingModel[1].addBox(0F, 0F, 0F, 37, 8, 11, 0F); // Box 47
		leftWingModel[1].setRotationPoint(11F, -47F, -160F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 6, 8, 11, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 48
		leftWingModel[2].setRotationPoint(5F, -47F, -160F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 11, 6, 52, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftWingModel[3].setRotationPoint(30F, -46F, -149F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 50
		leftWingModel[4].setRotationPoint(48F, -47F, -160F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 40, 7, 3, 0F, -16F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[5].setRotationPoint(-35F, -40F, -47F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 40, 7, 3, 0F, -16F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftWingModel[6].setRotationPoint(-29F, -40F, -66F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 40, 7, 3, 0F, -16F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		leftWingModel[7].setRotationPoint(-15F, -40F, -104F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 40, 7, 3, 0F, -16F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftWingModel[8].setRotationPoint(-21F, -40F, -85F);

		leftWingModel[9].addBox(0F, 0F, 0F, 50, 9, 9, 0F); // Box 24
		leftWingModel[9].setRotationPoint(-35F, -33F, -49F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // Box 25
		leftWingModel[10].setRotationPoint(-44F, -33F, -49F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // Box 26
		leftWingModel[11].setRotationPoint(-38F, -33F, -69F);

		leftWingModel[12].addBox(0F, 0F, 0F, 50, 9, 9, 0F); // Box 27
		leftWingModel[12].setRotationPoint(-29F, -33F, -69F);


		rightWingModel = new ModelRendererTurbo[13];
		rightWingModel[0] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Box 62
		rightWingModel[1] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Box 63
		rightWingModel[2] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Box 64
		rightWingModel[3] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Box 65
		rightWingModel[4] = new ModelRendererTurbo(this, 220, 850, textureX, textureY); // Box 66
		rightWingModel[5] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 68
		rightWingModel[6] = new ModelRendererTurbo(this, 200, 890, textureX, textureY); // Box 69
		rightWingModel[7] = new ModelRendererTurbo(this, 200, 920, textureX, textureY); // Box 70
		rightWingModel[8] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Box 71
		rightWingModel[9] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Box 29
		rightWingModel[10] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 30
		rightWingModel[11] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 31
		rightWingModel[12] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Box 32

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 40, 7, 3, 0F, -16F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightWingModel[0].setRotationPoint(-35F, -40F, 44F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 40, 7, 3, 0F, -16F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		rightWingModel[1].setRotationPoint(-29F, -40F, 63F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 40, 7, 3, 0F, -16F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		rightWingModel[2].setRotationPoint(-21F, -40F, 82F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 40, 7, 3, 0F, -16F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightWingModel[3].setRotationPoint(-15F, -40F, 101F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 57, 6, 121, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -44F, 0F, 0F); // Box 66
		rightWingModel[4].setRotationPoint(-27F, -46F, 28F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 11, 6, 52, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		rightWingModel[5].setRotationPoint(30F, -46F, 97F);

		rightWingModel[6].addBox(0F, 0F, 0F, 37, 8, 11, 0F); // Box 69
		rightWingModel[6].setRotationPoint(11F, -47F, 149F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 6, 8, 11, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 70
		rightWingModel[7].setRotationPoint(5F, -47F, 149F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 71
		rightWingModel[8].setRotationPoint(48F, -47F, 149F);

		rightWingModel[9].addBox(0F, 0F, 0F, 50, 9, 9, 0F); // Box 29
		rightWingModel[9].setRotationPoint(-29F, -33F, 60F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // Box 30
		rightWingModel[10].setRotationPoint(-38F, -33F, 60F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // Box 31
		rightWingModel[11].setRotationPoint(-44F, -33F, 40F);

		rightWingModel[12].addBox(0F, 0F, 0F, 50, 9, 9, 0F); // Box 32
		rightWingModel[12].setRotationPoint(-35F, -33F, 40F);


		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Box 40

		yawFlapModel[0].addShapeBox(0F, 0F, -2F, 11, 29, 4, 0F, 0F, 0F, 0F, 1.55F, 0F, 0F, 1.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.35F, 0F, 0F, 7.35F, 0F, 0F, 0F, 0F, 0F); // Box 40
		yawFlapModel[0].setRotationPoint(117F, -101F, 0F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 43

		pitchFlapLeftModel[0].addShapeBox(0F, -2F, 0F, 12, 4, 48, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		pitchFlapLeftModel[0].setRotationPoint(124F, -51F, -53F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 44

		pitchFlapRightModel[0].addShapeBox(0F, -2F, 0F, 12, 4, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 44
		pitchFlapRightModel[0].setRotationPoint(124F, -51F, 5F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 400, 90, textureX, textureY); // Box 51

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 11, 6, 70, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		pitchFlapLeftWingModel[0].setRotationPoint(30F, -46F, -97F);


		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 400, 90, textureX, textureY); // Box 67

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 11, 6, 70, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		pitchFlapRightWingModel[0].setRotationPoint(30F, -46F, 27F);


		bodyWheelModel = new ModelRendererTurbo[8];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 400, 220, textureX, textureY); // Box 0
		bodyWheelModel[1] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Box 1
		bodyWheelModel[2] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Box 2
		bodyWheelModel[3] = new ModelRendererTurbo(this, 400, 270, textureX, textureY); // Box 3
		bodyWheelModel[4] = new ModelRendererTurbo(this, 400, 290, textureX, textureY); // Box 6
		bodyWheelModel[5] = new ModelRendererTurbo(this, 400, 290, textureX, textureY); // Box 7
		bodyWheelModel[6] = new ModelRendererTurbo(this, 400, 320, textureX, textureY); // Box 10
		bodyWheelModel[7] = new ModelRendererTurbo(this, 400, 320, textureX, textureY); // Box 11

		bodyWheelModel[0].addBox(0F, 0F, 0F, 8, 18, 8, 0F); // Box 0
		bodyWheelModel[0].setRotationPoint(-67F, -23F, -4F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 8, 8, 1, 0F); // Box 1
		bodyWheelModel[1].setRotationPoint(-67F, -5F, -4F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 8, 8, 1, 0F); // Box 2
		bodyWheelModel[2].setRotationPoint(-67F, -5F, 3F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 14, 8, 6, 0F); // Box 3
		bodyWheelModel[3].setRotationPoint(-70F, -2F, -3F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Box 6
		bodyWheelModel[4].setRotationPoint(-68F, -23F, -5F);
		bodyWheelModel[4].rotateAngleX = -0.13962634F;

		bodyWheelModel[5].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Box 7
		bodyWheelModel[5].setRotationPoint(-68F, -23F, 4F);
		bodyWheelModel[5].rotateAngleX = 0.13962634F;

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyWheelModel[6].setRotationPoint(-70F, -5F, -3F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyWheelModel[7].setRotationPoint(-70F, 6F, -3F);


		leftWingWheelModel = new ModelRendererTurbo[10];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 400, 320, textureX, textureY); // Box 4
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 400, 320, textureX, textureY); // Box 5
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Box 8
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 400, 270, textureX, textureY); // Box 9
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Box 12
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Box 18
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Box 19
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 400, 270, textureX, textureY); // Box 20
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 400, 320, textureX, textureY); // Box 21
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 400, 320, textureX, textureY); // Box 22

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftWingWheelModel[0].setRotationPoint(17F, -5F, -21F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 5
		leftWingWheelModel[1].setRotationPoint(17F, 6F, -21F);

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 8, 32, 4, 0F); // Box 8
		leftWingWheelModel[2].setRotationPoint(20F, -30F, -15F);

		leftWingWheelModel[3].addBox(0F, 0F, 0F, 14, 8, 6, 0F); // Box 9
		leftWingWheelModel[3].setRotationPoint(17F, -2F, -21F);

		leftWingWheelModel[4].addBox(0F, 0F, 0F, 14, 32, 2, 0F); // Box 12
		leftWingWheelModel[4].setRotationPoint(17F, -30F, -10F);
		leftWingWheelModel[4].rotateAngleX = 0.08726646F;

		leftWingWheelModel[5].addBox(0F, 0F, 0F, 14, 32, 2, 0F); // Box 18
		leftWingWheelModel[5].setRotationPoint(17F, -30F, 8F);
		leftWingWheelModel[5].rotateAngleX = -0.08726646F;

		leftWingWheelModel[6].addBox(0F, 0F, 0F, 8, 32, 4, 0F); // Box 19
		leftWingWheelModel[6].setRotationPoint(20F, -30F, 11F);

		leftWingWheelModel[7].addBox(0F, 0F, 0F, 14, 8, 6, 0F); // Box 20
		leftWingWheelModel[7].setRotationPoint(17F, -2F, 15F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftWingWheelModel[8].setRotationPoint(17F, -5F, 15F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 14, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 22
		leftWingWheelModel[9].setRotationPoint(17F, 6F, 15F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
