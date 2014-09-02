//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelT90 extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelT90()
	{

// Body
		bodyModel = new ModelRendererTurbo[59];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  55, textureX, textureY); // Body1
		bodyModel[1] = new ModelRendererTurbo(this,  0,  108, textureX, textureY); // Body2
		bodyModel[2] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body4
		bodyModel[3] = new ModelRendererTurbo(this,  0,  190, textureX, textureY); // Body5
		bodyModel[4] = new ModelRendererTurbo(this,  0,  190, textureX, textureY); // Body6
		bodyModel[5] = new ModelRendererTurbo(this,  0,  190, textureX, textureY); // Body7
		bodyModel[6] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body8
		bodyModel[7] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body9
		bodyModel[8] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // Body10
		bodyModel[9] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // Body11
		bodyModel[10] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // Body12
		bodyModel[11] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // Body13
		bodyModel[12] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // Body14
		bodyModel[13] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Body15
		bodyModel[14] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body16
		bodyModel[15] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body17
		bodyModel[16] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body18
		bodyModel[17] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body19
		bodyModel[18] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body20
		bodyModel[19] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body21
		bodyModel[20] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body22
		bodyModel[21] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body23
		bodyModel[22] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // Body24
		bodyModel[23] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Body25
		bodyModel[24] = new ModelRendererTurbo(this,  0,  490, textureX, textureY); // Body26
		bodyModel[25] = new ModelRendererTurbo(this,  0,  520, textureX, textureY); // Body27
		bodyModel[26] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // Body28
		bodyModel[27] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body29
		bodyModel[28] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body30
		bodyModel[29] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // Body31
		bodyModel[30] = new ModelRendererTurbo(this,  0,  590, textureX, textureY); // Body32
		bodyModel[31] = new ModelRendererTurbo(this,  0,  610, textureX, textureY); // Body33
		bodyModel[32] = new ModelRendererTurbo(this,  0,  630, textureX, textureY); // Body34
		bodyModel[33] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // Body35
		bodyModel[34] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // Body36
		bodyModel[35] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // Body37
		bodyModel[36] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // Body38
		bodyModel[37] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Body39
		bodyModel[38] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body40
		bodyModel[39] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body41
		bodyModel[40] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body42
		bodyModel[41] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body43
		bodyModel[42] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body44
		bodyModel[43] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body45
		bodyModel[44] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body46
		bodyModel[45] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body47
		bodyModel[46] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // Body48
		bodyModel[47] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Body49
		bodyModel[48] = new ModelRendererTurbo(this,  0,  490, textureX, textureY); // Body50
		bodyModel[49] = new ModelRendererTurbo(this,  0,  520, textureX, textureY); // Body51
		bodyModel[50] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // Body52
		bodyModel[51] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body53
		bodyModel[52] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body54
		bodyModel[53] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // Body55
		bodyModel[54] = new ModelRendererTurbo(this,  0,  590, textureX, textureY); // Body56
		bodyModel[55] = new ModelRendererTurbo(this,  0,  610, textureX, textureY); // Body57
		bodyModel[56] = new ModelRendererTurbo(this,  0,  630, textureX, textureY); // Body58
		bodyModel[57] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // Body59
		bodyModel[58] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // Body60

		bodyModel[0].addShapeBox(0F, 0F, 0F, 27, 10, 40, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[0].setRotationPoint(46F, -19F, -20F);

		bodyModel[1].addBox(0F, 0F, 0F, 101, 10, 40, 0F); // Body2
		bodyModel[1].setRotationPoint(-55F, -19F, -20F);

		bodyModel[2].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Body4
		bodyModel[2].setRotationPoint(-65F, -19F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //0
		bodyModel[3].setRotationPoint(-67F, -16F, -19F);

		bodyModel[4].addBox(0F, 0F, 0F, 12, 4, 38, 0F); // Body6
		bodyModel[4].setRotationPoint(-67F, -20F, -19F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 38, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[5].setRotationPoint(-67F, -24F, -19F);

		bodyModel[6].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Body8
		bodyModel[6].setRotationPoint(-65F, -19F, 19F);

		bodyModel[7].addBox(0F, 0F, 0F, 20, 2, 40, 0F); // Body9
		bodyModel[7].setRotationPoint(-52F, -21F, -20F);

		bodyModel[8].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Body10
		bodyModel[8].setRotationPoint(-47F, -22F, -15F);

		bodyModel[9].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Body11
		bodyModel[9].setRotationPoint(-47F, -22F, 5F);

		bodyModel[10].addBox(0F, 0F, 0F, 93, 2, 14, 0F); // Body12
		bodyModel[10].setRotationPoint(-55F, -19F, -34F);

		bodyModel[11].addBox(0F, 0F, 0F, 93, 8, 2, 0F); // Body13
		bodyModel[11].setRotationPoint(-55F, -17F, -34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); //Test
		bodyModel[12].setRotationPoint(-35F, -18F, -34.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 18, 9, 1, 0F); // Body15
		bodyModel[13].setRotationPoint(-54F, -18F, -34.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Body16
		bodyModel[14].setRotationPoint(-13F, -18F, -34.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Body17
		bodyModel[15].setRotationPoint(0F, -18F, -34.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Body18
		bodyModel[16].setRotationPoint(13F, -18F, -34.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Body19
		bodyModel[17].setRotationPoint(26F, -18F, -34.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[18].setRotationPoint(-13F, -1F, -34.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[19].setRotationPoint(0F, -1F, -34.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[20].setRotationPoint(13F, -1F, -34.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[21].setRotationPoint(26F, -1F, -34.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 78, 8, 2, 0F); // Body24
		bodyModel[22].setRotationPoint(-14F, -9F, -34F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 36, 6, 14, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[23].setRotationPoint(38F, -19F, -34F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 40, 4, 14, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[24].setRotationPoint(38F, -13F, -34F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[25].setRotationPoint(39F, -17F, -34.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[26].setRotationPoint(52F, -16F, -34.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[27].setRotationPoint(39F, -1F, -34.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[28].setRotationPoint(52F, -1F, -34.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[29].setRotationPoint(64F, -9F, -34F);

		bodyModel[30].addBox(0F, 0F, 0F, 19, 1, 12, 0F); // Body32
		bodyModel[30].setRotationPoint(-54F, -19.5F, -33F);

		bodyModel[31].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Body33
		bodyModel[31].setRotationPoint(-32F, -19.5F, -33F);

		bodyModel[32].addBox(0F, 0F, 0F, 51, 1, 12, 0F); // Body34
		bodyModel[32].setRotationPoint(-16F, -19.5F, -33F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 119, 16, 1, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[33].setRotationPoint(-55F, -17F, -21F);

		bodyModel[34].addBox(0F, 0F, 0F, 93, 2, 14, 0F); // Body36
		bodyModel[34].setRotationPoint(-55F, -19F, 20F);

		bodyModel[35].addBox(0F, 0F, 0F, 93, 8, 2, 0F); // Body37
		bodyModel[35].setRotationPoint(-55F, -17F, 32F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 21, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); //Test
		bodyModel[36].setRotationPoint(-35F, -18F, 33.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 18, 9, 1, 0F); // Body39
		bodyModel[37].setRotationPoint(-54F, -18F, 33.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Body40
		bodyModel[38].setRotationPoint(-13F, -18F, 33.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Body41
		bodyModel[39].setRotationPoint(0F, -18F, 33.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Body42
		bodyModel[40].setRotationPoint(13F, -18F, 33.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Body43
		bodyModel[41].setRotationPoint(26F, -18F, 33.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[42].setRotationPoint(-13F, -1F, 33.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[43].setRotationPoint(0F, -1F, 33.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[44].setRotationPoint(13F, -1F, 33.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[45].setRotationPoint(26F, -1F, 33.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 78, 8, 2, 0F); // Body48
		bodyModel[46].setRotationPoint(-14F, -9F, 32F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 36, 6, 14, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[47].setRotationPoint(38F, -19F, 20F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 40, 4, 14, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[48].setRotationPoint(38F, -13F, 20F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[49].setRotationPoint(39F, -17F, 33.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[50].setRotationPoint(52F, -16F, 33.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[51].setRotationPoint(39F, -1F, 33.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[52].setRotationPoint(52F, -1F, 33.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 14, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[53].setRotationPoint(64F, -9F, 20F);

		bodyModel[54].addBox(0F, 0F, 0F, 19, 1, 12, 0F); // Body56
		bodyModel[54].setRotationPoint(-54F, -19.5F, 21F);

		bodyModel[55].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Body57
		bodyModel[55].setRotationPoint(-32F, -19.5F, 21F);

		bodyModel[56].addBox(0F, 0F, 0F, 51, 1, 12, 0F); // Body58
		bodyModel[56].setRotationPoint(-16F, -19.5F, 21F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 119, 16, 1, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		bodyModel[57].setRotationPoint(-55F, -17F, 20F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 128, 8, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F); //Test
		bodyModel[58].setRotationPoint(-55F, -9F, -20F);



// Turret
		turretModel = new ModelRendererTurbo[21];
		turretModel[0] = new ModelRendererTurbo(this,  0,  735, textureX, textureY); // Turret1
		turretModel[1] = new ModelRendererTurbo(this,  0,  820, textureX, textureY); // Turret2
		turretModel[2] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // Turret3
		turretModel[3] = new ModelRendererTurbo(this,  140,  900, textureX, textureY); // Turret4
		turretModel[4] = new ModelRendererTurbo(this,  200,  170, textureX, textureY); // Turret5
		turretModel[5] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Turret6
		turretModel[6] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // Turret7
		turretModel[7] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // Turret7
		turretModel[8] = new ModelRendererTurbo(this,  200,  220, textureX, textureY); // Turret8
		turretModel[9] = new ModelRendererTurbo(this,  200,  270, textureX, textureY); // Turret10
		turretModel[10] = new ModelRendererTurbo(this,  200,  270, textureX, textureY); // Turret11
		turretModel[11] = new ModelRendererTurbo(this,  200,  270, textureX, textureY); // Turret12
		turretModel[12] = new ModelRendererTurbo(this,  200,  290, textureX, textureY); // Turret13
		turretModel[13] = new ModelRendererTurbo(this,  200,  340, textureX, textureY); // Turret14
		turretModel[14] = new ModelRendererTurbo(this,  200,  350, textureX, textureY); // Turret15
		turretModel[15] = new ModelRendererTurbo(this,  200,  370, textureX, textureY); // Turret16
		turretModel[16] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Turret17
		turretModel[17] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Turret18
		turretModel[18] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Turret19
		turretModel[19] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Turret20
		turretModel[20] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Turret21

		turretModel[0].addShapeBox(0F, 0F, 0F, 64, 9, 68, 0F, 0F, 0F, -20F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -20F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F); //Test
		turretModel[0].setRotationPoint(-42F, -35F, -34F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 64, 4, 68, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -20F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -20F); //0
		turretModel[1].setRotationPoint(-42F, -26F, -34F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 17, 9, 50, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F); //0
		turretModel[2].setRotationPoint(22F, -35F, -25F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 17, 4, 50, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); //0
		turretModel[3].setRotationPoint(22F, -26F, -25F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		turretModel[4].setRotationPoint(39F, -26F, -25F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F); //0
		turretModel[5].setRotationPoint(39F, -26F, 12F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 7F); //Test
		turretModel[6].setRotationPoint(39F, -30F, 12F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F, 0F, 5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 7F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		turretModel[7].setRotationPoint(39F, -30F, -18F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 9, 7, 34, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); //0
		turretModel[8].setRotationPoint(-51F, -35F, -17F);

		turretModel[9].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Turret10
		turretModel[9].setRotationPoint(0F, -35.81333F, 10F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //0
		turretModel[10].setRotationPoint(0F, -35.81333F, 14F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //0
		turretModel[11].setRotationPoint(0F, -35.81333F, 6F);

		turretModel[12].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Turret13
		turretModel[12].setRotationPoint(-14F, -37.81333F, 0F);

		turretModel[13].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Turret14
		turretModel[13].setRotationPoint(-12F, -40.81333F, 2F);

		turretModel[14].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Turret15
		turretModel[14].setRotationPoint(-11F, -52.81333F, 3F);

		turretModel[15].addBox(0F, 0F, 0F, 8, 3, 11, 0F); // Turret16
		turretModel[15].setRotationPoint(-22F, -37.81333F, -14F);

		turretModel[16].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Turret17
		turretModel[16].setRotationPoint(-20F, -44.81333F, -14F);

		turretModel[17].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Turret18
		turretModel[17].setRotationPoint(-20F, -44.81333F, -5F);

		turretModel[18].addBox(0F, 0F, 0F, 15, 3, 45, 0F); // Turret19
		turretModel[18].setRotationPoint(-7.5F, -22F, -22.5F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 15, 3, 45, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); //Test
		turretModel[19].setRotationPoint(7.5F, -22F, -22.5F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 15, 3, 45, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); //Test
		turretModel[20].setRotationPoint(-22.5F, -22F, -22.5F);



// Barrel
		barrelModel = new ModelRendererTurbo[10];
		barrelModel[0] = new ModelRendererTurbo(this,  200,  450, textureX, textureY); // Barrel1
		barrelModel[1] = new ModelRendererTurbo(this,  200,  490, textureX, textureY); // Barrel2
		barrelModel[2] = new ModelRendererTurbo(this,  200,  520, textureX, textureY); // Barrel3
		barrelModel[3] = new ModelRendererTurbo(this,  200,  550, textureX, textureY); // Barrel4
		barrelModel[4] = new ModelRendererTurbo(this,  200,  570, textureX, textureY); // Barrel5
		barrelModel[5] = new ModelRendererTurbo(this,  200,  585, textureX, textureY); // Barrel6
		barrelModel[6] = new ModelRendererTurbo(this,  200,  600, textureX, textureY); // Barrel7
		barrelModel[7] = new ModelRendererTurbo(this,  200,  620, textureX, textureY); // Barrel8
		barrelModel[8] = new ModelRendererTurbo(this,  200,  630, textureX, textureY); // Barrel9
		barrelModel[9] = new ModelRendererTurbo(this,  230,  630, textureX, textureY); // Barrel10

		barrelModel[0].addShapeBox(0F, 0F, 0F, 8, 6, 22, 0F, 0F, 7F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 7F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); //Test
		barrelModel[0].setRotationPoint(39F, -28F, -11F);

		barrelModel[1].addShapeBox(-7F, -6F, -6F, 18, 6, 12, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		barrelModel[1].setRotationPoint(39F, -28F, 0F);

		barrelModel[2].addShapeBox(-7F, 0F, -6F, 18, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); //Test
		barrelModel[2].setRotationPoint(39F, -28F, 0F);

		barrelModel[3].addBox(3F, -5F, -2.5F, 94, 5, 5, 0F); // Barrel4
		barrelModel[3].setRotationPoint(39F, -28F, 0F);

		barrelModel[4].addBox(52F, -5.5F, -3F, 16, 6, 6, 0F); // Barrel5
		barrelModel[4].setRotationPoint(39F, -28F, 0F);

		barrelModel[5].addBox(0F, -1.5F, 0F, 4, 3, 7, 0F); // Barrel6
		barrelModel[5].setRotationPoint(-20F, -42.81333F, -12F);

		barrelModel[6].addBox(-4F, -3F, 2F, 13, 4, 4, 0F); // Barrel7
		barrelModel[6].setRotationPoint(-20F, -42.81333F, -12F);

		barrelModel[7].addBox(9F, -2.5F, 2.5F, 7, 3, 3, 0F); // Barrel8
		barrelModel[7].setRotationPoint(-20F, -42.81333F, -12F);

		barrelModel[8].addBox(16F, -2F, 3F, 7, 2, 2, 0F); // Barrel9
		barrelModel[8].setRotationPoint(-20F, -42.81333F, -12F);

		barrelModel[9].addBox(-4F, -3F, 6F, 4, 7, 8, 0F); // Barrel10
		barrelModel[9].setRotationPoint(-20F, -42.81333F, -12F);

		
		
		// Left Track
				leftTrackModel = new ModelRendererTurbo[27];
				leftTrackModel[0] = new ModelRendererTurbo(this,  400,  150, textureX, textureY); // LeftTrack1
				leftTrackModel[1] = new ModelRendererTurbo(this,  400,  200, textureX, textureY); // LeftTrack2
				leftTrackModel[2] = new ModelRendererTurbo(this,  400,  240, textureX, textureY); // LeftTrack3
				leftTrackModel[3] = new ModelRendererTurbo(this,  400,  260, textureX, textureY); // LeftTrack4
				leftTrackModel[4] = new ModelRendererTurbo(this,  400,  300, textureX, textureY); // LeftTrack5
				leftTrackModel[5] = new ModelRendererTurbo(this,  400,  340, textureX, textureY); // LeftTrack6
				leftTrackModel[6] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // LeftTrack7
				leftTrackModel[7] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack8
				leftTrackModel[8] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack9
				leftTrackModel[9] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack11
				leftTrackModel[10] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack13
				leftTrackModel[11] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack14
				leftTrackModel[12] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack15
				leftTrackModel[13] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack16
				leftTrackModel[14] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack17
				leftTrackModel[15] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack18
				leftTrackModel[16] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack19
				leftTrackModel[17] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack20
				leftTrackModel[18] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack21
				leftTrackModel[19] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack22
				leftTrackModel[20] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // LeftTrack23
				leftTrackModel[21] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // LeftTrack24
				leftTrackModel[22] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // LeftTrack25
				leftTrackModel[23] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // LeftTrack26
				leftTrackModel[24] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // LeftTrack27
				leftTrackModel[25] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // LeftTrack28
				leftTrackModel[26] = new ModelRendererTurbo(this,  400,  440, textureX, textureY); // LeftTrack29

				leftTrackModel[0].addBox(0F, 0F, 0F, 2, 10, 11, 0F); // LeftTrack1
				leftTrackModel[0].setRotationPoint(73F, -9F, 21F);

				leftTrackModel[1].addBox(-2F, 0F, 0F, 2, 16, 11, 0F); // LeftTrack2
				leftTrackModel[1].setRotationPoint(75F, 1F, 21.1F);
				leftTrackModel[1].rotateAngleZ = -0.9599311F;

				leftTrackModel[2].addBox(-90F, 0F, 0F, 90, 2, 11, 0F); // LeftTrack3
				leftTrackModel[2].setRotationPoint(62F, 8F, 21F);

				leftTrackModel[3].addBox(0F, 0F, 0F, 2, 16, 11, 0F); // LeftTrack4
				leftTrackModel[3].setRotationPoint(-49F, -17F, 21F);

				leftTrackModel[4].addBox(0F, 0F, 0F, 2, 24, 11, 0F); // LeftTrack5
				leftTrackModel[4].setRotationPoint(-49F, -1F, 21.1F);
				leftTrackModel[4].rotateAngleZ = 1.099557F;

				leftTrackModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				leftTrackModel[5].setRotationPoint(-45F, -11F, 23F);

				leftTrackModel[6].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // LeftTrack7
				leftTrackModel[6].setRotationPoint(-45F, -7F, 23F);

				leftTrackModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				leftTrackModel[7].setRotationPoint(-45F, -3F, 23F);

				leftTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				leftTrackModel[8].setRotationPoint(-30F, 4F, 23F);

				leftTrackModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				leftTrackModel[9].setRotationPoint(-14F, 4F, 23F);

				leftTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				leftTrackModel[10].setRotationPoint(2F, 4F, 23F);

				leftTrackModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				leftTrackModel[11].setRotationPoint(34F, 4F, 23F);

				leftTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				leftTrackModel[12].setRotationPoint(18F, 4F, 23F);

				leftTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				leftTrackModel[13].setRotationPoint(52F, 4F, 23F);

				leftTrackModel[14].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // LeftTrack17
				leftTrackModel[14].setRotationPoint(-30F, 0F, 23F);

				leftTrackModel[15].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // LeftTrack18
				leftTrackModel[15].setRotationPoint(-14F, 0F, 23F);

				leftTrackModel[16].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // LeftTrack19
				leftTrackModel[16].setRotationPoint(2F, 0F, 23F);

				leftTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // LeftTrack20
				leftTrackModel[17].setRotationPoint(18F, 0F, 23F);

				leftTrackModel[18].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // LeftTrack21
				leftTrackModel[18].setRotationPoint(34F, 0F, 23F);

				leftTrackModel[19].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // LeftTrack22
				leftTrackModel[19].setRotationPoint(52F, 0F, 23F);

				leftTrackModel[20].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				leftTrackModel[20].setRotationPoint(-30F, -4F, 23F);

				leftTrackModel[21].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				leftTrackModel[21].setRotationPoint(-14F, -4F, 23F);

				leftTrackModel[22].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				leftTrackModel[22].setRotationPoint(2F, -4F, 23F);

				leftTrackModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				leftTrackModel[23].setRotationPoint(18F, -4F, 23F);

				leftTrackModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				leftTrackModel[24].setRotationPoint(34F, -4F, 23F);

				leftTrackModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				leftTrackModel[25].setRotationPoint(52F, -4F, 23F);

				leftTrackModel[26].addShapeBox(0F, 0F, 0F, 101, 21, 3, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
				leftTrackModel[26].setRotationPoint(-35F, -17F, 25F);



		// Right Track
				rightTrackModel = new ModelRendererTurbo[27];
				rightTrackModel[0] = new ModelRendererTurbo(this,  400,  150, textureX, textureY); // RightTrack1
				rightTrackModel[1] = new ModelRendererTurbo(this,  400,  200, textureX, textureY); // RightTrack2
				rightTrackModel[2] = new ModelRendererTurbo(this,  400,  240, textureX, textureY); // RightTrack3
				rightTrackModel[3] = new ModelRendererTurbo(this,  400,  260, textureX, textureY); // RightTrack4
				rightTrackModel[4] = new ModelRendererTurbo(this,  400,  300, textureX, textureY); // RightTrack5
				rightTrackModel[5] = new ModelRendererTurbo(this,  400,  340, textureX, textureY); // RightTrack6
				rightTrackModel[6] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // RightTrack7
				rightTrackModel[7] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack8
				rightTrackModel[8] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack9
				rightTrackModel[9] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack11
				rightTrackModel[10] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack13
				rightTrackModel[11] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack14
				rightTrackModel[12] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack15
				rightTrackModel[13] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack16
				rightTrackModel[14] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack17
				rightTrackModel[15] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack18
				rightTrackModel[16] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack19
				rightTrackModel[17] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack20
				rightTrackModel[18] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack21
				rightTrackModel[19] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack22
				rightTrackModel[20] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // RightTrack23
				rightTrackModel[21] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // RightTrack24
				rightTrackModel[22] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // RightTrack25
				rightTrackModel[23] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // RightTrack26
				rightTrackModel[24] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // RightTrack27
				rightTrackModel[25] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // RightTrack28
				rightTrackModel[26] = new ModelRendererTurbo(this,  400,  440, textureX, textureY); // RightTrack29

				rightTrackModel[0].addBox(0F, 0F, 0F, 2, 10, 11, 0F); // RightTrack1
				rightTrackModel[0].setRotationPoint(73F, -9F, -32F);

				rightTrackModel[1].addBox(-2F, 0F, 0F, 2, 16, 11, 0F); // RightTrack2
				rightTrackModel[1].setRotationPoint(75F, 1F, -32.1F);
				rightTrackModel[1].rotateAngleZ = -0.9599311F;

				rightTrackModel[2].addBox(-90F, 0F, 0F, 90, 2, 11, 0F); // RightTrack3
				rightTrackModel[2].setRotationPoint(62F, 8F, -32F);

				rightTrackModel[3].addBox(0F, 0F, 0F, 2, 16, 11, 0F); // RightTrack4
				rightTrackModel[3].setRotationPoint(-49F, -17F, -32F);

				rightTrackModel[4].addBox(0F, 0F, 0F, 2, 24, 11, 0F); // RightTrack5
				rightTrackModel[4].setRotationPoint(-49F, -1F, -32.1F);
				rightTrackModel[4].rotateAngleZ = 1.099557F;

				rightTrackModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				rightTrackModel[5].setRotationPoint(-45F, -11F, -30F);

				rightTrackModel[6].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // RightTrack7
				rightTrackModel[6].setRotationPoint(-45F, -7F, -30F);

				rightTrackModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				rightTrackModel[7].setRotationPoint(-45F, -3F, -30F);

				rightTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				rightTrackModel[8].setRotationPoint(-30F, 4F, -30F);

				rightTrackModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				rightTrackModel[9].setRotationPoint(-14F, 4F, -30F);

				rightTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				rightTrackModel[10].setRotationPoint(2F, 4F, -30F);

				rightTrackModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test				
				rightTrackModel[11].setRotationPoint(34F, 4F, -30F);

				rightTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				rightTrackModel[12].setRotationPoint(18F, 4F, -30F);

				rightTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
				rightTrackModel[13].setRotationPoint(52F, 4F, -30F);

				rightTrackModel[14].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // RightTrack17
				rightTrackModel[14].setRotationPoint(-30F, 0F, -30F);

				rightTrackModel[15].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // RightTrack18
				rightTrackModel[15].setRotationPoint(-14F, 0F, -30F);

				rightTrackModel[16].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // RightTrack19
				rightTrackModel[16].setRotationPoint(2F, 0F, -30F);

				rightTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // RightTrack20
				rightTrackModel[17].setRotationPoint(18F, 0F, -30F);

				rightTrackModel[18].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // RightTrack21
				rightTrackModel[18].setRotationPoint(34F, 0F, -30F);

				rightTrackModel[19].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // RightTrack22
				rightTrackModel[19].setRotationPoint(52F, 0F, -30F);

				rightTrackModel[20].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				rightTrackModel[20].setRotationPoint(-30F, -4F, -30F);

				rightTrackModel[21].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				rightTrackModel[21].setRotationPoint(-14F, -4F, -30F);

				rightTrackModel[22].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				rightTrackModel[22].setRotationPoint(2F, -4F, -30F);

				rightTrackModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				rightTrackModel[23].setRotationPoint(18F, -4F, -30F);

				rightTrackModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				rightTrackModel[24].setRotationPoint(34F, -4F, -30F);

				rightTrackModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				rightTrackModel[25].setRotationPoint(52F, -4F, -30F);

				rightTrackModel[26].addShapeBox(0F, 0F, 0F, 101, 21, 3, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
				rightTrackModel[26].setRotationPoint(-35F, -17F, -28F);

		translateAll(0, 0, 0);


		flipAll();
	}
}