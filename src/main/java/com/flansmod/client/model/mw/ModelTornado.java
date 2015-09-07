//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTornado extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public ModelTornado()
	{

// Nose
		noseModel = new ModelRendererTurbo[2];
		noseModel[0] = new ModelRendererTurbo(this,  0,  45, textureX, textureY); // Nose1
		noseModel[1] = new ModelRendererTurbo(this,  0,  85, textureX, textureY); // Nose2

		noseModel[0].addShapeBox(0F, 0F, 0F, 35, 18, 18, 0F, 0F, -8.5F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, -8.5F, 0F, -8.5F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, -8.5F); //Test
		noseModel[0].setRotationPoint(-81F, -28F, -9F);

		noseModel[1].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Nose2
		noseModel[1].setRotationPoint(-91F, -19.5F, -0.5F);



// Body
		bodyModel = new ModelRendererTurbo[41];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  90, textureX, textureY); // Body1
		bodyModel[1] = new ModelRendererTurbo(this,  0,  135, textureX, textureY); // Body2
		bodyModel[2] = new ModelRendererTurbo(this,  0,  165, textureX, textureY); // Body3
		bodyModel[3] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // Body4
		bodyModel[4] = new ModelRendererTurbo(this,  0,  205, textureX, textureY); // Body5
		bodyModel[5] = new ModelRendererTurbo(this,  0,  205, textureX, textureY); // Body6
		bodyModel[6] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body7
		bodyModel[7] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body8
		bodyModel[8] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body9
		bodyModel[9] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // Body10
		bodyModel[10] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body11
		bodyModel[11] = new ModelRendererTurbo(this,  0,  335, textureX, textureY); // Body12HUD
		bodyModel[12] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // Body13
		bodyModel[13] = new ModelRendererTurbo(this,  20,  350, textureX, textureY); // Body14
		bodyModel[14] = new ModelRendererTurbo(this,  20,  350, textureX, textureY); // Body15
		bodyModel[15] = new ModelRendererTurbo(this,  35,  350, textureX, textureY); // Body16
		bodyModel[16] = new ModelRendererTurbo(this,  50,  350, textureX, textureY); // Body17
		bodyModel[17] = new ModelRendererTurbo(this,  0,  365, textureX, textureY); // Body18
		bodyModel[18] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Body19
		bodyModel[19] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Body20
		bodyModel[20] = new ModelRendererTurbo(this,  30,  410, textureX, textureY); // Body21
		bodyModel[21] = new ModelRendererTurbo(this,  30,  410, textureX, textureY); // Body22
		bodyModel[22] = new ModelRendererTurbo(this,  0,  425, textureX, textureY); // Body23
		bodyModel[23] = new ModelRendererTurbo(this,  0,  450, textureX, textureY); // Body24
		bodyModel[24] = new ModelRendererTurbo(this,  120,  0, textureX, textureY); // Body25
		bodyModel[25] = new ModelRendererTurbo(this,  120,  30, textureX, textureY); // Body26
		bodyModel[26] = new ModelRendererTurbo(this,  120,  50, textureX, textureY); // Body27
		bodyModel[27] = new ModelRendererTurbo(this,  120,  65, textureX, textureY); // Body28
		bodyModel[28] = new ModelRendererTurbo(this,  120,  50, textureX, textureY); // Body28
		bodyModel[29] = new ModelRendererTurbo(this,  120,  30, textureX, textureY); // Body29
		bodyModel[30] = new ModelRendererTurbo(this,  120,  50, textureX, textureY); // Body30
		bodyModel[31] = new ModelRendererTurbo(this,  120,  50, textureX, textureY); // Body31
		bodyModel[32] = new ModelRendererTurbo(this,  120,  65, textureX, textureY); // Body32
		bodyModel[33] = new ModelRendererTurbo(this,  120,  160, textureX, textureY); // Body33
		bodyModel[34] = new ModelRendererTurbo(this,  120,  210, textureX, textureY); // Body34
		bodyModel[35] = new ModelRendererTurbo(this,  120,  270, textureX, textureY); // Body35
		bodyModel[36] = new ModelRendererTurbo(this,  120,  300, textureX, textureY); // Body36
		bodyModel[37] = new ModelRendererTurbo(this,  120,  120, textureX, textureY); // Body37
		bodyModel[38] = new ModelRendererTurbo(this,  120,  140, textureX, textureY); // Body38
		bodyModel[39] = new ModelRendererTurbo(this,  120,  120, textureX, textureY); // Body39
		bodyModel[40] = new ModelRendererTurbo(this,  120,  140, textureX, textureY); // Body40

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 20, 22, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); //Test
		bodyModel[0].setRotationPoint(-46F, -30F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 10, 12, 0F, 0F, -8F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); //Test
		bodyModel[1].setRotationPoint(-36F, -38F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[2].setRotationPoint(-24F, -39F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 10, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[3].setRotationPoint(-24F, -38F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[4].setRotationPoint(-24F, -38F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[5].setRotationPoint(-24F, -38F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 34, 20, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); //Test
		bodyModel[6].setRotationPoint(-22F, -30F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 10, 14, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); //Test
		bodyModel[7].setRotationPoint(-22F, -40F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 34, 20, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[8].setRotationPoint(-22F, -30F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 34, 4, 14, 0F); // Body10
		bodyModel[9].setRotationPoint(-22F, -14F, -7F);

		bodyModel[10].addBox(-4F, 0F, 0F, 4, 20, 14, 0F); // Body11
		bodyModel[10].setRotationPoint(-21F, -30F, -7F);
		bodyModel[10].rotateAngleZ = 0.5235988F;

		bodyModel[11].addBox(0F, -3F, -3F, 0, 6, 6, 0F); // Body12HUD
		bodyModel[11].setRotationPoint(-15F, -34F, 0F);

		bodyModel[12].addBox(0F, 2F, 0F, 2, 6, 6, 0F); // Body13
		bodyModel[12].setRotationPoint(-21F, -30F, -3F);
		bodyModel[12].rotateAngleZ = 0.5235988F;

		bodyModel[13].addBox(0F, 8F, 5F, 1, 4, 4, 0F); // Body14
		bodyModel[13].setRotationPoint(-21F, -30F, -3F);
		bodyModel[13].rotateAngleZ = 0.5235988F;

		bodyModel[14].addBox(0F, 8F, -3F, 1, 4, 4, 0F); // Body15
		bodyModel[14].setRotationPoint(-21F, -30F, -3F);
		bodyModel[14].rotateAngleZ = 0.5235988F;

		bodyModel[15].addBox(0F, 0F, 0F, 4, 6, 3, 0F); // Body16
		bodyModel[15].setRotationPoint(-15F, -21F, -1.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Body17
		bodyModel[16].setRotationPoint(-14.5F, -26F, -0.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 10, 2, 10, 0F); // Body18
		bodyModel[17].setRotationPoint(-4F, -16F, -5F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 18, 10, 0F); // Body19
		bodyModel[18].setRotationPoint(6F, -32F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[19].setRotationPoint(-5F, -41F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[20].setRotationPoint(-5F, -40F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[21].setRotationPoint(-5F, -40F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 15, 9, 14, 0F, 0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[22].setRotationPoint(-3F, -39F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 25, 14, 46, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); //Test
		bodyModel[23].setRotationPoint(24F, -30F, -23F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 10, 15, 0F, 0F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); //Test
		bodyModel[24].setRotationPoint(12F, -40F, -7.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 22, 4, 12, 0F); // Body26
		bodyModel[25].setRotationPoint(2F, -30F, -23F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 22, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); //Test
		bodyModel[26].setRotationPoint(2F, -26F, -13F);

		bodyModel[27].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Body28
		bodyModel[27].setRotationPoint(14F, -18F, -23F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 22, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); //Test
		bodyModel[28].setRotationPoint(2F, -26F, -23F);

		bodyModel[29].addBox(0F, 0F, 0F, 22, 4, 12, 0F); // Body29
		bodyModel[29].setRotationPoint(2F, -30F, 11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 22, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); //Test
		bodyModel[30].setRotationPoint(2F, -26F, 11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 22, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); //Test
		bodyModel[31].setRotationPoint(2F, -26F, 21F);

		bodyModel[32].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Body32
		bodyModel[32].setRotationPoint(14F, -18F, 11F);

		bodyModel[33].addBox(0F, 0F, 0F, 12, 20, 22, 0F); // Body33
		bodyModel[33].setRotationPoint(12F, -30F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 44, 14, 36, 0F); // Body34
		bodyModel[34].setRotationPoint(49F, -30F, -18F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 69, 9, 14, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[35].setRotationPoint(24F, -39F, -7F);

		bodyModel[36].addBox(0F, 0F, 0F, 69, 6, 22, 0F); // Body36
		bodyModel[36].setRotationPoint(24F, -16F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 28, 6, 11, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[37].setRotationPoint(39F, -29F, -29F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 20, 6, 11, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[38].setRotationPoint(19F, -29F, -29F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 28, 6, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[39].setRotationPoint(39F, -29F, 18F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 20, 6, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); //Test
		bodyModel[40].setRotationPoint(19F, -29F, 18F);



// Tail
		tailModel = new ModelRendererTurbo[10];
		tailModel[0] = new ModelRendererTurbo(this,  120,  330, textureX, textureY); // Tail1
		tailModel[1] = new ModelRendererTurbo(this,  120,  380, textureX, textureY); // Tail2
		tailModel[2] = new ModelRendererTurbo(this,  120,  400, textureX, textureY); // Tail3
		tailModel[3] = new ModelRendererTurbo(this,  200,  450, textureX, textureY); // Tail4
		tailModel[4] = new ModelRendererTurbo(this,  200,  450, textureX, textureY); // Tail5
		tailModel[5] = new ModelRendererTurbo(this,  240,  0, textureX, textureY); // Tail6
		tailModel[6] = new ModelRendererTurbo(this,  240,  20, textureX, textureY); // Tail7
		tailModel[7] = new ModelRendererTurbo(this,  240,  40, textureX, textureY); // Tail8
		tailModel[8] = new ModelRendererTurbo(this,  240,  140, textureX, textureY); // Tail10
		tailModel[9] = new ModelRendererTurbo(this,  240,  140, textureX, textureY); // Tail12


		tailModel[0].addShapeBox(0F, 0F, 0F, 41, 14, 32, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); //Test
		tailModel[0].setRotationPoint(93F, -30F, -16F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 41, 6, 10, 0F, 0F, 3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); //Test
		tailModel[1].setRotationPoint(93F, -36F, -5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 41, 6, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); //Test
		tailModel[2].setRotationPoint(93F, -16F, -11F);

		tailModel[3].addBox(0F, 0F, 0F, 14, 12, 12, 0F); // Tail4
		tailModel[3].setRotationPoint(134F, -29F, -15F);

		tailModel[4].addBox(0F, 0F, 0F, 14, 12, 12, 0F); // Tail5
		tailModel[4].setRotationPoint(134F, -29F, 3F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 52, 8, 6, 0F, -18F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[5].setRotationPoint(61F, -44F, -3F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); //Test
		tailModel[6].setRotationPoint(79F, -50F, -3F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 47, 43, 2, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[7].setRotationPoint(87F, -79F, -1F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 47, 2, 34, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[8].setRotationPoint(93F, -22F, -50F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 47, 2, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F); //Test
		tailModel[9].setRotationPoint(93F, -22F, 16F);




		// Yaw Flap
				yawFlapModel = new ModelRendererTurbo[1];
				yawFlapModel[0] = new ModelRendererTurbo(this,  240,  90, textureX, textureY); // Tail9

				yawFlapModel[0].addShapeBox(0F, 0F, -1F, 27, 43, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F); //Test
				yawFlapModel[0].setRotationPoint(134F, -79F, 0F);



		// Pitch Flap Left
				pitchFlapLeftModel = new ModelRendererTurbo[1];
				pitchFlapLeftModel[0] = new ModelRendererTurbo(this,  300,  200, textureX, textureY); // Tail11

				pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 16, 2, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); //Test
				pitchFlapLeftModel[0].setRotationPoint(140F, -21F, -50F);



		// Pitch Flap Right
				pitchFlapRightModel = new ModelRendererTurbo[1];
				pitchFlapRightModel[0] = new ModelRendererTurbo(this,  300,  200, textureX, textureY); // Tail13

				pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 16, 2, 34, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				pitchFlapRightModel[0].setRotationPoint(140F, -21F, 16F);



		
		
// Right Wing
				rightWingPos2Model = new ModelRendererTurbo[1];
				rightWingPos2Model[0] = new ModelRendererTurbo(this,  240,  300, textureX, textureY); // LeftWing2

				rightWingPos2Model[0].addShapeBox(0F, 0F, -83F, 40, 3, 83, 0F, -27F, 0F, -4F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -4F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				rightWingPos2Model[0].setRotationPoint(38F, -28F, -18F);



		// Left Wing Position 1
				leftWingPos1Model = new ModelRendererTurbo[1];
				leftWingPos1Model[0] = new ModelRendererTurbo(this,  240,  300, textureX, textureY); // LeftWing1

				leftWingPos1Model[0].addShapeBox(0F, 0F, 0F, 40, 3, 83, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -27F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -27F, 0F, -4F); //Test
				leftWingPos1Model[0].setRotationPoint(34F, -28F, 20F);
				leftWingPos1Model[0].rotateAngleY = -0.76794487F;
				
				
				// Right Wing
				rightWingPos1Model = new ModelRendererTurbo[1];
				rightWingPos1Model[0] = new ModelRendererTurbo(this,  240,  300, textureX, textureY); // LeftWing2

				rightWingPos1Model[0].addShapeBox(0F, 0F, -83F, 40, 3, 83, 0F, -27F, 0F, -4F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -4F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				rightWingPos1Model[0].setRotationPoint(34F, -28F, -20F);
				rightWingPos1Model[0].rotateAngleY = 0.76794487F;
				
				

				// Body Wheel
						bodyWheelModel = new ModelRendererTurbo[8];
						bodyWheelModel[0] = new ModelRendererTurbo(this,  400,  0, textureX, textureY); // CoreWheel1
						bodyWheelModel[1] = new ModelRendererTurbo(this,  400,  20, textureX, textureY); // CoreWheel2
						bodyWheelModel[2] = new ModelRendererTurbo(this,  400,  45, textureX, textureY); // CoreWheel3
						bodyWheelModel[3] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // CoreWheel4
						bodyWheelModel[4] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // CoreWheel5
						bodyWheelModel[5] = new ModelRendererTurbo(this,  400,  45, textureX, textureY); // CoreWheel6
						bodyWheelModel[6] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // CoreWheel7
						bodyWheelModel[7] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // CoreWheel8

						bodyWheelModel[0].addBox(0F, 0F, 0F, 10, 6, 6, 0F); // CoreWheel1
						bodyWheelModel[0].setRotationPoint(-17F, -10F, -3F);

						bodyWheelModel[1].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // CoreWheel2
						bodyWheelModel[1].setRotationPoint(-15F, -4F, -1F);

						bodyWheelModel[2].addBox(0F, 0F, 0F, 10, 6, 2, 0F); // CoreWheel3
						bodyWheelModel[2].setRotationPoint(-17F, 2F, -3F);

						bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test// CoreWheel4
						bodyWheelModel[3].setRotationPoint(-17F, 0F, -3F);

						bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); //Test// CoreWheel5
						bodyWheelModel[4].setRotationPoint(-17F, 8F, -3F);

						bodyWheelModel[5].addBox(0F, 0F, 0F, 10, 6, 2, 0F); // CoreWheel6
						bodyWheelModel[5].setRotationPoint(-17F, 2F, 1F);

						bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test// CoreWheel7
						bodyWheelModel[6].setRotationPoint(-17F, 0F, 1F);

						bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); //Test // CoreWheel8
						bodyWheelModel[7].setRotationPoint(-17F, 8F, 1F);



				// Left Wing Wheel
						leftWingWheelModel = new ModelRendererTurbo[5];
						leftWingWheelModel[0] = new ModelRendererTurbo(this,  400,  80, textureX, textureY); // LeftWingWheel1
						leftWingWheelModel[1] = new ModelRendererTurbo(this,  400,  20, textureX, textureY); // LeftWingWheel2
						leftWingWheelModel[2] = new ModelRendererTurbo(this,  400,  45, textureX, textureY); // LeftWingWheel3
						leftWingWheelModel[3] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // LeftWingWheel4
						leftWingWheelModel[4] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // LeftWingWheel5

						leftWingWheelModel[0].addBox(0F, 0F, 0F, 10, 12, 6, 0F); // LeftWingWheel1
						leftWingWheelModel[0].setRotationPoint(73F, -16F, -18F);

						leftWingWheelModel[1].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // LeftWingWheel2
						leftWingWheelModel[1].setRotationPoint(75F, -4F, -16F);

						leftWingWheelModel[2].addBox(0F, 0F, 0F, 10, 6, 2, 0F); // LeftWingWheel3
						leftWingWheelModel[2].setRotationPoint(73F, 2F, -18F);

						leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test // LeftWingWheel4
						leftWingWheelModel[3].setRotationPoint(73F, 0F, -18F);

						leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); //Test // LeftWingWheel5
						leftWingWheelModel[4].setRotationPoint(73F, 8F, -18F);



				// Right Wing Wheel
						rightWingWheelModel = new ModelRendererTurbo[5];
						rightWingWheelModel[0] = new ModelRendererTurbo(this,  400,  80, textureX, textureY); // RightWingWheel1
						rightWingWheelModel[1] = new ModelRendererTurbo(this,  400,  20, textureX, textureY); // RightWingWheel2
						rightWingWheelModel[2] = new ModelRendererTurbo(this,  400,  45, textureX, textureY); // RightWingWheel3
						rightWingWheelModel[3] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // RightWingWheel4
						rightWingWheelModel[4] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // RightWingWheel5

						rightWingWheelModel[0].addBox(0F, 0F, 0F, 10, 12, 6, 0F); // RightWingWheel1
						rightWingWheelModel[0].setRotationPoint(73F, -16F, 12F);

						rightWingWheelModel[1].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // RightWingWheel2
						rightWingWheelModel[1].setRotationPoint(75F, -4F, 14F);

						rightWingWheelModel[2].addBox(0F, 0F, 0F, 10, 6, 2, 0F); // RightWingWheel3
						rightWingWheelModel[2].setRotationPoint(73F, 2F, 16F);

						rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test // RightWingWheel4
						rightWingWheelModel[3].setRotationPoint(73F, 0F, 16F);

						rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); //Test // RightWingWheel5
						rightWingWheelModel[4].setRotationPoint(73F, 8F, 16F);



		// Left Wing Position 1
				leftWingPos2Model = new ModelRendererTurbo[1];
				leftWingPos2Model[0] = new ModelRendererTurbo(this,  240,  300, textureX, textureY); // LeftWing1

				leftWingPos2Model[0].addShapeBox(0F, 0F, 0F, 40, 3, 83, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -27F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -27F, 0F, -4F); //Test
				leftWingPos2Model[0].setRotationPoint(38F, -28F, 18F);


		
		

		translateAll(0, 0, 0);


		// Propeller
				propellerModels = new ModelRendererTurbo[1][1];
		        propellerModels[0][0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY);
		        propellerModels[0][0].addBox(0F, 0F, 0F, 10, 2, 2, 0F);
		        propellerModels[0][0].setRotationPoint(65F, -23F, -1F);
				
				
				flipAll();
			}

			// Replace with your propeller function
			private ModelRendererTurbo[] makeProp(int i, int j, int k)
			{
				ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
				return prop;
			}
}