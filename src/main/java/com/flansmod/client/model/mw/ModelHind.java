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
import com.flansmod.common.vector.Vector3f;

public class ModelHind extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelHind()
	{

// Nose
		noseModel = new ModelRendererTurbo[21];
		noseModel[0] = new ModelRendererTurbo(this,  0,  96, textureX, textureY); // Body1
		noseModel[1] = new ModelRendererTurbo(this,  0,  141, textureX, textureY); // Body2
		noseModel[2] = new ModelRendererTurbo(this,  0,  141, textureX, textureY); // Body3
		noseModel[3] = new ModelRendererTurbo(this,  0,  141, textureX, textureY); // Body4
		noseModel[4] = new ModelRendererTurbo(this,  0,  141, textureX, textureY); // Body5
		noseModel[5] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body6
		noseModel[6] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body7
		noseModel[7] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // Body8
		noseModel[8] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // Body9
		noseModel[9] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body14
		noseModel[10] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body15
		noseModel[11] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // Body16
		noseModel[12] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // Body17
		noseModel[13] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // Body18
		noseModel[14] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Body19
		noseModel[15] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Body20
		noseModel[16] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Body21
		noseModel[17] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body22
		noseModel[18] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body23
		noseModel[19] = new ModelRendererTurbo(this,  0,  450, textureX, textureY); // Body24
		noseModel[20] = new ModelRendererTurbo(this,  0,  450, textureX, textureY); // Body25

		noseModel[0].addShapeBox(0F, 0F, 0F, 36, 13, 30, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); //Test
		noseModel[0].setRotationPoint(-120F, -5F, -15F);

		noseModel[1].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Body2
		noseModel[1].setRotationPoint(-120F, -7F, -10F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		noseModel[2].setRotationPoint(-114F, -22F, -10F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); //Test
		noseModel[3].setRotationPoint(-114F, -20F, -10F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); //Test
		noseModel[4].setRotationPoint(-114F, -20F, 7F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); //Test
		noseModel[5].setRotationPoint(-112F, -26F, -10F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); //Test
		noseModel[6].setRotationPoint(-112F, -26F, 7F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); //Test
		noseModel[7].setRotationPoint(-100F, -26F, -10F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); //Test
		noseModel[8].setRotationPoint(-100F, -26F, 7F);

		noseModel[9].addBox(0F, 0F, 0F, 33, 20, 30, 0F); // Body14
		noseModel[9].setRotationPoint(-84F, -12F, -15F);

		noseModel[10].addBox(0F, 0F, 0F, 4, 14, 22, 0F); // Body15
		noseModel[10].setRotationPoint(-84F, -26F, -11F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 33, 14, 4, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		noseModel[11].setRotationPoint(-84F, -26F, -15F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 33, 14, 4, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		noseModel[12].setRotationPoint(-84F, -26F, 11F);

		noseModel[13].addBox(0F, 0F, 0F, 11, 2, 14, 0F); // Body18
		noseModel[13].setRotationPoint(-69F, -19F, -7F);

		noseModel[14].addBox(0F, 0F, 0F, 2, 14, 14, 0F); // Body19
		noseModel[14].setRotationPoint(-60F, -33F, -7F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		noseModel[15].setRotationPoint(-84F, -38F, -10F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		noseModel[16].setRotationPoint(-84F, -38F, 7F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F, -4F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		noseModel[17].setRotationPoint(-77F, -40F, 7F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F, -4F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		noseModel[18].setRotationPoint(-77F, -40F, -10F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 36, 21, 5, 0F, 0F, -19F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -19F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		noseModel[19].setRotationPoint(-120F, -26F, -15F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 36, 21, 5, 0F, 0F, -19F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -19F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); //Test
		noseModel[20].setRotationPoint(-120F, -26F, 10F);
		
		// Body
				bodyModel = new ModelRendererTurbo[16];
				bodyModel[0] = new ModelRendererTurbo(this,  0,  480, textureX, textureY); // Core1
				bodyModel[1] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // Core2
				bodyModel[2] = new ModelRendererTurbo(this,  0,  630, textureX, textureY); // Core3
				bodyModel[3] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // Core4
				bodyModel[4] = new ModelRendererTurbo(this,  0,  730, textureX, textureY); // Core5
				bodyModel[5] = new ModelRendererTurbo(this,  0,  780, textureX, textureY); // Core8
				bodyModel[6] = new ModelRendererTurbo(this,  0,  850, textureX, textureY); // Core9
				bodyModel[7] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // Core10
				bodyModel[8] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // Core11
				bodyModel[9] = new ModelRendererTurbo(this,  0,  930, textureX, textureY); // Core12
				bodyModel[10] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // Core13
				bodyModel[11] = new ModelRendererTurbo(this,  200,  160, textureX, textureY); // Core14
				bodyModel[12] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // Core15
				bodyModel[13] = new ModelRendererTurbo(this,  200,  260, textureX, textureY); // Core16
				bodyModel[14] = new ModelRendererTurbo(this,  200,  300, textureX, textureY); // Core17
				bodyModel[15] = new ModelRendererTurbo(this,  200,  330, textureX, textureY); // Core18

				bodyModel[0].addShapeBox(0F, 0F, 0F, 22, 52, 36, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); //Test
				bodyModel[0].setRotationPoint(-51F, -44F, -18F);

				bodyModel[1].addBox(0F, 0F, 0F, 50, 9, 36, 0F); // Core2
				bodyModel[1].setRotationPoint(-29F, -1F, -18F);

				bodyModel[2].addBox(0F, 0F, 0F, 62, 40, 2, 0F); // Core3
				bodyModel[2].setRotationPoint(-1F, -41F, -18F);

				bodyModel[3].addBox(0F, 0F, 0F, 62, 40, 2, 0F); // Core4
				bodyModel[3].setRotationPoint(-1F, -41F, 16F);

				bodyModel[4].addBox(0F, 0F, 0F, 40, 9, 36, 0F); // Core5
				bodyModel[4].setRotationPoint(21F, -1F, -18F);

				bodyModel[5].addShapeBox(0F, 0F, 0F, 32, 43, 24, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 9F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 6F); //Test
				bodyModel[5].setRotationPoint(61F, -44F, -12F);

				bodyModel[6].addBox(0F, 0F, 0F, 90, 3, 36, 0F); // Core9
				bodyModel[6].setRotationPoint(-29F, -44F, -18F);

				bodyModel[7].addBox(0F, 0F, 0F, 25, 12, 12, 0F); // Core10
				bodyModel[7].setRotationPoint(-51F, -56F, -14F);

				bodyModel[8].addBox(0F, 0F, 0F, 25, 12, 12, 0F); // Core11
				bodyModel[8].setRotationPoint(-51F, -56F, 2F);

				bodyModel[9].addShapeBox(0F, 0F, 0F, 60, 14, 36, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				bodyModel[9].setRotationPoint(-26F, -58F, -18F);

				bodyModel[10].addShapeBox(0F, 0F, 0F, 27, 14, 36, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				bodyModel[10].setRotationPoint(34F, -58F, -18F);

				bodyModel[11].addShapeBox(0F, 0F, 0F, 32, 4, 24, 0F, 0F, 6F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 6F, 2F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); //Test
				bodyModel[11].setRotationPoint(61F, -48F, -12F);

				bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 12, 37, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				bodyModel[12].setRotationPoint(-18F, -57F, -18.5F);

				bodyModel[13].addBox(0F, 0F, 0F, 38, 4, 20, 0F); // Core16
				bodyModel[13].setRotationPoint(23F, -5F, -10F);

				bodyModel[14].addBox(0F, 0F, 0F, 38, 22, 4, 0F); // Core17
				bodyModel[14].setRotationPoint(23F, -27F, -2F);

				bodyModel[15].addShapeBox(0F, 0F, 0F, 40, 4, 20, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); //Test
				bodyModel[15].setRotationPoint(-16F, -62F, -10F);
				bodyModel[15].rotateAngleZ = -0.03490658F;



				// Tail
				tailModel = new ModelRendererTurbo[7];
				tailModel[0] = new ModelRendererTurbo(this,  200,  360, textureX, textureY); // Tail1
				tailModel[1] = new ModelRendererTurbo(this,  200,  400, textureX, textureY); // Tail2
				tailModel[2] = new ModelRendererTurbo(this,  200,  420, textureX, textureY); // Tail3
				tailModel[3] = new ModelRendererTurbo(this,  200,  500, textureX, textureY); // Tail4
				tailModel[4] = new ModelRendererTurbo(this,  200,  580, textureX, textureY); // Tail5
				tailModel[5] = new ModelRendererTurbo(this,  200,  610, textureX, textureY); // Tail6
				tailModel[6] = new ModelRendererTurbo(this,  200,  610, textureX, textureY); // Tail7

				tailModel[0].addShapeBox(0F, 0F, 0F, 114, 12, 8, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 23F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 6F); //Test
				tailModel[0].setRotationPoint(108F, -44F, -4F);

				tailModel[1].addShapeBox(0F, 0F, 0F, 114, 4, 8, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); //Test
				tailModel[1].setRotationPoint(108F, -48F, -4F);

				tailModel[2].addShapeBox(0F, 0F, 0F, 50, 35, 4, 0F, -31F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -31F, 0F, -1F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); //Test
				tailModel[2].setRotationPoint(191F, -82F, -2F);

				tailModel[3].addShapeBox(0F, 0F, 0F, 15, 35, 20, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 2F); //Test
				tailModel[3].setRotationPoint(93F, -44F, -10F);

				tailModel[4].addShapeBox(0F, 0F, 0F, 15, 4, 20, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); //Test
				tailModel[4].setRotationPoint(93F, -48F, -10F);
				
				tailModel[5].addShapeBox(0F, 0F, 0F, 15, 4, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); //Test
				tailModel[5].setRotationPoint(196F, -44F, 4F);

				tailModel[6].addShapeBox(0F, 0F, 0F, 15, 4, 30, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				tailModel[6].setRotationPoint(196F, -44F, -34F);
				
				
				// Left Wing
				leftWingModel = new ModelRendererTurbo[26];
				leftWingModel[0] = new ModelRendererTurbo(this,  200,  650, textureX, textureY); // LeftWing1
				leftWingModel[1] = new ModelRendererTurbo(this,  200,  730, textureX, textureY); // LeftWing2
				leftWingModel[2] = new ModelRendererTurbo(this,  200,  750, textureX, textureY); // LeftWing3
				leftWingModel[3] = new ModelRendererTurbo(this,  200,  765, textureX, textureY); // LeftWing4
				leftWingModel[4] = new ModelRendererTurbo(this,  200,  765, textureX, textureY); // LeftWing5
				leftWingModel[5] = new ModelRendererTurbo(this,  200,  780, textureX, textureY); // LeftWing6
				leftWingModel[6] = new ModelRendererTurbo(this,  200,  780, textureX, textureY); // LeftWing7
				leftWingModel[7] = new ModelRendererTurbo(this,  200,  800, textureX, textureY); // LeftWing8
				leftWingModel[8] = new ModelRendererTurbo(this,  200,  815, textureX, textureY); // LeftWing9
				leftWingModel[9] = new ModelRendererTurbo(this,  200,  830, textureX, textureY); // LeftWing10
				leftWingModel[10] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing11
				leftWingModel[11] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing12
				leftWingModel[12] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing14
				leftWingModel[13] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing15
				leftWingModel[14] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing16
				leftWingModel[15] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing17
				leftWingModel[16] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing18
				leftWingModel[17] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing19
				leftWingModel[18] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing20
				leftWingModel[19] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing21
				leftWingModel[20] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing22
				leftWingModel[21] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing23
				leftWingModel[22] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing24
				leftWingModel[23] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing25
				leftWingModel[24] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing26
				leftWingModel[25] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // LeftWing27

				leftWingModel[0].addShapeBox(0F, 0F, -65F, 25, 6, 65, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, -3F, 0F, -7.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
				leftWingModel[0].setRotationPoint(14F, -35F, -18F);
				leftWingModel[0].rotateAngleX = 0.2617994F;

				leftWingModel[1].addBox(0F, 0F, 0F, 10, 12, 2, 0F); // LeftWing2
				leftWingModel[1].setRotationPoint(21.5F, -18.3F, -81F);

				leftWingModel[2].addBox(0F, 0F, 0F, 10, 2, 8, 0F); // LeftWing3
				leftWingModel[2].setRotationPoint(21.5F, -6.3F, -84F);

				leftWingModel[3].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // LeftWing4
				leftWingModel[3].setRotationPoint(11.5F, -6.8F, -87F);

				leftWingModel[4].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // LeftWing5
				leftWingModel[4].setRotationPoint(11.5F, -6.8F, -76F);

				leftWingModel[5].addBox(0F, 0F, 0F, 10, 14, 3, 0F); // LeftWing6
				leftWingModel[5].setRotationPoint(21.5F, -29F, -37F);

				leftWingModel[6].addBox(0F, 0F, 0F, 10, 14, 3, 0F); // LeftWing7
				leftWingModel[6].setRotationPoint(21.5F, -24.3F, -55F);

				leftWingModel[7].addBox(0F, 0F, 0F, 30, 4, 4, 0F); // LeftWing8
				leftWingModel[7].setRotationPoint(14.5F, -16F, -37.5F);

				leftWingModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F); //Test
				leftWingModel[8].setRotationPoint(10.5F, -16F, -37.5F);

				leftWingModel[9].addBox(0F, 0F, 0F, 25, 9, 9, 0F); // LeftWing10
				leftWingModel[9].setRotationPoint(16.5F, -10.3F, -58F);

				leftWingModel[10].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing11
				leftWingModel[10].setRotationPoint(13.5F, -9.3F, -57F);

				leftWingModel[11].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing12
				leftWingModel[11].setRotationPoint(13.5F, -9.3F, -55F);

				leftWingModel[12].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing14
				leftWingModel[12].setRotationPoint(13.5F, -9.3F, -53F);

				leftWingModel[13].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing15
				leftWingModel[13].setRotationPoint(13.5F, -9.3F, -51F);

				leftWingModel[14].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing16
				leftWingModel[14].setRotationPoint(13.5F, -7.3F, -57F);

				leftWingModel[15].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing17
				leftWingModel[15].setRotationPoint(13.5F, -7.3F, -55F);

				leftWingModel[16].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing18
				leftWingModel[16].setRotationPoint(13.5F, -7.3F, -53F);

				leftWingModel[17].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing19
				leftWingModel[17].setRotationPoint(13.5F, -7.3F, -51F);

				leftWingModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing20
				leftWingModel[18].setRotationPoint(13.5F, -5.3F, -51F);

				leftWingModel[19].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing21
				leftWingModel[19].setRotationPoint(13.5F, -5.3F, -53F);

				leftWingModel[20].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing22
				leftWingModel[20].setRotationPoint(13.5F, -5.3F, -55F);

				leftWingModel[21].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing23
				leftWingModel[21].setRotationPoint(13.5F, -5.3F, -57F);

				leftWingModel[22].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing24
				leftWingModel[22].setRotationPoint(13.5F, -3.3F, -57F);

				leftWingModel[23].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing25
				leftWingModel[23].setRotationPoint(13.5F, -3.3F, -55F);

				leftWingModel[24].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing26
				leftWingModel[24].setRotationPoint(13.5F, -3.3F, -53F);

				leftWingModel[25].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // LeftWing27
				leftWingModel[25].setRotationPoint(13.5F, -3.3F, -51F);



		// Right Wing
				rightWingModel = new ModelRendererTurbo[26];
				rightWingModel[0] = new ModelRendererTurbo(this,  200,  650, textureX, textureY); // RightWing1
				rightWingModel[1] = new ModelRendererTurbo(this,  200,  730, textureX, textureY); // RightWing2
				rightWingModel[2] = new ModelRendererTurbo(this,  200,  750, textureX, textureY); // RightWing3
				rightWingModel[3] = new ModelRendererTurbo(this,  200,  765, textureX, textureY); // RightWing4
				rightWingModel[4] = new ModelRendererTurbo(this,  200,  765, textureX, textureY); // RightWing5
				rightWingModel[5] = new ModelRendererTurbo(this,  200,  780, textureX, textureY); // RightWing6
				rightWingModel[6] = new ModelRendererTurbo(this,  200,  780, textureX, textureY); // RightWing7
				rightWingModel[7] = new ModelRendererTurbo(this,  200,  800, textureX, textureY); // RightWing8
				rightWingModel[8] = new ModelRendererTurbo(this,  200,  815, textureX, textureY); // RightWing9
				rightWingModel[9] = new ModelRendererTurbo(this,  200,  830, textureX, textureY); // RightWing10
				rightWingModel[10] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing11
				rightWingModel[11] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing12
				rightWingModel[12] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing13
				rightWingModel[13] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing14
				rightWingModel[14] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing15
				rightWingModel[15] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing16
				rightWingModel[16] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing17
				rightWingModel[17] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing19
				rightWingModel[18] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing20
				rightWingModel[19] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing21
				rightWingModel[20] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing22
				rightWingModel[21] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing23
				rightWingModel[22] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing24
				rightWingModel[23] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing25
				rightWingModel[24] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing26
				rightWingModel[25] = new ModelRendererTurbo(this,  300,  830, textureX, textureY); // RightWing27

				rightWingModel[0].addShapeBox(0F, 0F, 0F, 25, 6, 65, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, -3F, 0F, -7.5F, -3F, 0F); //Test
				rightWingModel[0].setRotationPoint(14F, -35F, 18F);
				rightWingModel[0].rotateAngleX = -0.2617994F;

				rightWingModel[1].addBox(0F, 0F, 0F, 10, 12, 2, 0F); // RightWing2
				rightWingModel[1].setRotationPoint(21.5F, -18.3F, 79F);

				rightWingModel[2].addBox(0F, 0F, 0F, 10, 2, 8, 0F); // RightWing3
				rightWingModel[2].setRotationPoint(21.5F, -6.3F, 76F);

				rightWingModel[3].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // RightWing4
				rightWingModel[3].setRotationPoint(11.5F, -6.8F, 84F);

				rightWingModel[4].addBox(0F, 0F, 0F, 30, 3, 3, 0F); // RightWing5
				rightWingModel[4].setRotationPoint(11.5F, -6.8F, 73F);

				rightWingModel[5].addBox(0F, 0F, 0F, 10, 14, 3, 0F); // RightWing6
				rightWingModel[5].setRotationPoint(21.5F, -29F, 34F);

				rightWingModel[6].addBox(0F, 0F, 0F, 10, 14, 3, 0F); // RightWing7
				rightWingModel[6].setRotationPoint(21.5F, -24.3F, 52F);

				rightWingModel[7].addBox(0F, 0F, 0F, 30, 4, 4, 0F); // RightWing8
				rightWingModel[7].setRotationPoint(14.5F, -16F, 33.5F);

				rightWingModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F); //Test
				rightWingModel[8].setRotationPoint(10.5F, -16F, 33.5F);

				rightWingModel[9].addBox(0F, 0F, 0F, 25, 9, 9, 0F); // RightWing10
				rightWingModel[9].setRotationPoint(16.5F, -10.3F, 49F);

				rightWingModel[10].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing11
				rightWingModel[10].setRotationPoint(13.5F, -9.3F, 56F);

				rightWingModel[11].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing12
				rightWingModel[11].setRotationPoint(13.5F, -9.3F, 54F);

				rightWingModel[12].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing13
				rightWingModel[12].setRotationPoint(13.5F, -9.3F, 52F);

				rightWingModel[13].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing14
				rightWingModel[13].setRotationPoint(13.5F, -9.3F, 50F);

				rightWingModel[14].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing15
				rightWingModel[14].setRotationPoint(13.5F, -7.3F, 56F);

				rightWingModel[15].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing16
				rightWingModel[15].setRotationPoint(13.5F, -7.3F, 54F);

				rightWingModel[16].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing17
				rightWingModel[16].setRotationPoint(13.5F, -7.3F, 52F);

				rightWingModel[17].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing19
				rightWingModel[17].setRotationPoint(13.5F, -7.3F, 50F);

				rightWingModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing20
				rightWingModel[18].setRotationPoint(13.5F, -5.3F, 56F);

				rightWingModel[19].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing21
				rightWingModel[19].setRotationPoint(13.5F, -5.3F, 54F);

				rightWingModel[20].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing22
				rightWingModel[20].setRotationPoint(13.5F, -5.3F, 52F);

				rightWingModel[21].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing23
				rightWingModel[21].setRotationPoint(13.5F, -5.3F, 50F);

				rightWingModel[22].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing24
				rightWingModel[22].setRotationPoint(13.5F, -3.3F, 56F);

				rightWingModel[23].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing25
				rightWingModel[23].setRotationPoint(13.5F, -3.3F, 54F);

				rightWingModel[24].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing26
				rightWingModel[24].setRotationPoint(13.5F, -3.3F, 52F);

				rightWingModel[25].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // RightWing27
				rightWingModel[25].setRotationPoint(13.5F, -3.3F, 50F);
				
				
				//Main helicopter rotors
				heliMainRotorModels = new ModelRendererTurbo[1][7];
				heliMainRotorModels[0][0] = new ModelRendererTurbo(this,  200,  960, textureX, textureY); // Mrotor1
				heliMainRotorModels[0][1] = new ModelRendererTurbo(this,  200,  980, textureX, textureY); // Mrotor2
				heliMainRotorModels[0][2] = new ModelRendererTurbo(this,  200,  1000, textureX, textureY); // Mrotor3
				heliMainRotorModels[0][3] = new ModelRendererTurbo(this,  200,  1000, textureX, textureY); // Mrotor4
				heliMainRotorModels[0][4] = new ModelRendererTurbo(this,  200,  1000, textureX, textureY); // Mrotor5
				heliMainRotorModels[0][5] = new ModelRendererTurbo(this,  200,  1000, textureX, textureY); // Mrotor6
				heliMainRotorModels[0][6] = new ModelRendererTurbo(this,  200,  1000, textureX, textureY); // Mrotor7
				

				heliMainRotorModels[0][0].addBox(-3F, -66F, -3F, 6, 5, 6, 0F); // Mrotor1
				

				heliMainRotorModels[0][1].addBox(-4F, -71F, -4F, 8, 5, 8, 0F); // Mrotor2
				

				heliMainRotorModels[0][2].addBox(0F, -70F, -3F, 160, 2, 6, 0F); // Mrotor3
				

				heliMainRotorModels[0][3].addBox(0F, -70F, -3F, 160, 2, 6, 0F); // Mrotor4
				heliMainRotorModels[0][3].rotateAngleY = 1.25663706F;
				
				heliMainRotorModels[0][4].addBox(0F, -70F, -3F, 160, 2, 6, 0F); // Mrotor5
				heliMainRotorModels[0][4].rotateAngleY = -1.25663706F;
				
				heliMainRotorModels[0][5].addBox(0F, -70F, -3F, 160, 2, 6, 0F); // Mrotor6
				heliMainRotorModels[0][5].rotateAngleY = 2.51327412F;
				
				heliMainRotorModels[0][6].addBox(0F, -70F, -3F, 160, 2, 6, 0F); // Mrotor6
				heliMainRotorModels[0][6].rotateAngleY = -2.51327412F;
				
						
				//The helicopter rotor origins for rendering. Better than the old propeller rotation point code
				heliMainRotorOrigins = new Vector3f[] { new Vector3f(0F, 48F / 16F, 0F) }; 
				
				
				//Tail helicopter rotors
				heliTailRotorModels = new ModelRendererTurbo[1][3];
				heliTailRotorModels[0][0] = new ModelRendererTurbo(this,  200,  900, textureX, textureY); // Trotor1
				heliTailRotorModels[0][1] = new ModelRendererTurbo(this,  200,  920, textureX, textureY); // Trotor2
				heliTailRotorModels[0][2] = new ModelRendererTurbo(this,  200,  920, textureX, textureY); // Trotor3
				
				heliTailRotorModels[0][0].addBox(222F, -80F, -6F, 4, 4, 6, 0F); // Trotor1
				
				heliTailRotorModels[0][1].addBox(221F, -108F, -4F, 4, 30, 2, 0F); // Trotor2
				
				heliTailRotorModels[0][2].addBox(221F, -78F, -4F, 4, 30, 2, 0F); // Trotor4

				//The helicopter rotor origins for rendering. Better than the old propeller rotation point code
				heliTailRotorOrigins = new Vector3f[] { new Vector3f(224F / 16F, 78F / 16F, -8F / 16F) }; 
				
				heliRotorSpeeds = new float[] { 1F };
				
				

				// Body Wheel
						bodyWheelModel = new ModelRendererTurbo[3];
						bodyWheelModel[0] = new ModelRendererTurbo(this,  400,  100, textureX, textureY); // Corewheel1
						bodyWheelModel[1] = new ModelRendererTurbo(this,  400,  200, textureX, textureY); // Corewheel2
						bodyWheelModel[2] = new ModelRendererTurbo(this,  400,  200, textureX, textureY); // Corewheel3

						bodyWheelModel[0].addBox(0F, 0F, 0F, 4, 14, 4, 0F); // Corewheel1
						bodyWheelModel[0].setRotationPoint(-77F, 8F, -2F);

						bodyWheelModel[1].addBox(0F, 0F, 0F, 10, 10, 3, 0F); // Corewheel2
						bodyWheelModel[1].setRotationPoint(-80F, 17F, 2F);

						bodyWheelModel[2].addBox(0F, 0F, 0F, 10, 10, 3, 0F); // Corewheel3
						bodyWheelModel[2].setRotationPoint(-80F, 17F, -5F);



				// Left Wing Wheel
						leftWingWheelModel = new ModelRendererTurbo[3];
						leftWingWheelModel[0] = new ModelRendererTurbo(this,  400,  240, textureX, textureY); // LWWheel1
						leftWingWheelModel[1] = new ModelRendererTurbo(this,  400,  265, textureX, textureY); // LWWheel2
						leftWingWheelModel[2] = new ModelRendererTurbo(this,  400,  300, textureX, textureY); // LWWheel3

						leftWingWheelModel[0].addBox(0F, 0F, 0F, 14, 14, 6, 0F); // LWWheel1
						leftWingWheelModel[0].setRotationPoint(19F, 13F, -35F);

						leftWingWheelModel[1].addBox(0F, -3F, -1F, 4, 4, 23, 0F); // LWWheel2
						leftWingWheelModel[1].setRotationPoint(24F, 19F, -29F);
						leftWingWheelModel[1].rotateAngleX = 0.8901179F;

						leftWingWheelModel[2].addBox(0F, -3F, -1F, 2, 2, 23, 0F); // LWWheel3
						leftWingWheelModel[2].setRotationPoint(25F, 21F, -29F);
						leftWingWheelModel[2].rotateAngleX = 0.6027204F;



				// Right Wing Wheel
						rightWingWheelModel = new ModelRendererTurbo[3];
						rightWingWheelModel[0] = new ModelRendererTurbo(this,  400,  240, textureX, textureY); // RWWheel1
						rightWingWheelModel[1] = new ModelRendererTurbo(this,  400,  265, textureX, textureY); // RWWheel2
						rightWingWheelModel[2] = new ModelRendererTurbo(this,  400,  300, textureX, textureY); // RWWheel3

						rightWingWheelModel[0].addBox(0F, 0F, 0F, 14, 14, 6, 0F); // RWWheel1
						rightWingWheelModel[0].setRotationPoint(19F, 13F, 29F);

						rightWingWheelModel[1].addBox(0F, -3F, -21F, 4, 4, 23, 0F); // RWWheel2
						rightWingWheelModel[1].setRotationPoint(24F, 19F, 29F);
						rightWingWheelModel[1].rotateAngleX = -0.8901179F;

						rightWingWheelModel[2].addBox(0F, -3F, -23F, 2, 2, 23, 0F); // RWWheel3
						rightWingWheelModel[2].setRotationPoint(25F, 21F, 29F);
						rightWingWheelModel[2].rotateAngleX = -0.6027145F;



				// Body Door Open
						bodyDoorOpenModel = new ModelRendererTurbo[12];
						bodyDoorOpenModel[0] = new ModelRendererTurbo(this,  400,  440, textureX, textureY); // DoorOpen1
						bodyDoorOpenModel[1] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorOpen2
						bodyDoorOpenModel[2] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorOpen3
						bodyDoorOpenModel[3] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorOpen4
						bodyDoorOpenModel[4] = new ModelRendererTurbo(this,  400,  480, textureX, textureY); // DoorOpen5
						bodyDoorOpenModel[5] = new ModelRendererTurbo(this,  400,  500, textureX, textureY); // DoorOpen6
						bodyDoorOpenModel[6] = new ModelRendererTurbo(this,  400,  440, textureX, textureY); // DoorOpen7
						bodyDoorOpenModel[7] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorOpen8
						bodyDoorOpenModel[8] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorOpen9
						bodyDoorOpenModel[9] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorOpen10
						bodyDoorOpenModel[10] = new ModelRendererTurbo(this,  400,  480, textureX, textureY); // DoorOpen11
						bodyDoorOpenModel[11] = new ModelRendererTurbo(this,  400,  500, textureX, textureY); // DoorOpen12

						bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 28, 7, 2, 0F); // DoorOpen1
						bodyDoorOpenModel[0].setRotationPoint(-29F, -41F, -18F);
						bodyDoorOpenModel[0].rotateAngleX = -1.396263F;

						bodyDoorOpenModel[1].addBox(0F, 7F, 0F, 5, 9, 2, 0F); // DoorOpen2
						bodyDoorOpenModel[1].setRotationPoint(-29F, -41F, -18F);
						bodyDoorOpenModel[1].rotateAngleX = -1.396263F;

						bodyDoorOpenModel[2].addBox(23F, 7F, 0F, 5, 9, 2, 0F); // DoorOpen3
						bodyDoorOpenModel[2].setRotationPoint(-29F, -41F, -18F);
						bodyDoorOpenModel[2].rotateAngleX = -1.396263F;

						bodyDoorOpenModel[3].addBox(13F, 7F, 0F, 2, 9, 2, 0F); // DoorOpen4
						bodyDoorOpenModel[3].setRotationPoint(-29F, -41F, -18F);
						bodyDoorOpenModel[3].rotateAngleX = -1.396263F;

						bodyDoorOpenModel[4].addBox(0F, 16F, 0F, 28, 2, 2, 0F); // DoorOpen5
						bodyDoorOpenModel[4].setRotationPoint(-29F, -41F, -18F);
						bodyDoorOpenModel[4].rotateAngleX = -1.396263F;

						bodyDoorOpenModel[5].addBox(0F, -22F, -2F, 28, 22, 2, 0F); // DoorOpen6
						bodyDoorOpenModel[5].setRotationPoint(-29F, -1F, -18F);
						bodyDoorOpenModel[5].rotateAngleX = 2.443461F;

						bodyDoorOpenModel[6].addBox(0F, 0F, -2F, 28, 7, 2, 0F); // DoorOpen7
						bodyDoorOpenModel[6].setRotationPoint(-29F, -41F, 18F);
						bodyDoorOpenModel[6].rotateAngleX = 1.396263F;

						bodyDoorOpenModel[7].addBox(0F, 7F, -2F, 5, 9, 2, 0F); // DoorOpen8
						bodyDoorOpenModel[7].setRotationPoint(-29F, -41F, 18F);
						bodyDoorOpenModel[7].rotateAngleX = 1.396263F;

						bodyDoorOpenModel[8].addBox(23F, 7F, -2F, 5, 9, 2, 0F); // DoorOpen9
						bodyDoorOpenModel[8].setRotationPoint(-29F, -41F, 18F);
						bodyDoorOpenModel[8].rotateAngleX = 1.396263F;

						bodyDoorOpenModel[9].addBox(13F, 7F, -2F, 2, 9, 2, 0F); // DoorOpen10
						bodyDoorOpenModel[9].setRotationPoint(-29F, -41F, 18F);
						bodyDoorOpenModel[9].rotateAngleX = 1.396263F;

						bodyDoorOpenModel[10].addBox(0F, 16F, -2F, 28, 2, 2, 0F); // DoorOpen11
						bodyDoorOpenModel[10].setRotationPoint(-29F, -41F, 18F);
						bodyDoorOpenModel[10].rotateAngleX = 1.396263F;

						bodyDoorOpenModel[11].addBox(0F, -22F, 0F, 28, 22, 2, 0F); // DoorOpen12
						bodyDoorOpenModel[11].setRotationPoint(-29F, -1F, 18F);
						bodyDoorOpenModel[11].rotateAngleX = -2.443461F;



				// Body Door Close
						bodyDoorCloseModel = new ModelRendererTurbo[12];
						bodyDoorCloseModel[0] = new ModelRendererTurbo(this,  400,  440, textureX, textureY); // DoorClosed1
						bodyDoorCloseModel[1] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorClosed2
						bodyDoorCloseModel[2] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorClosed3
						bodyDoorCloseModel[3] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorClosed4
						bodyDoorCloseModel[4] = new ModelRendererTurbo(this,  400,  480, textureX, textureY); // DoorClosed5
						bodyDoorCloseModel[5] = new ModelRendererTurbo(this,  400,  500, textureX, textureY); // DoorClosed6
						bodyDoorCloseModel[6] = new ModelRendererTurbo(this,  400,  440, textureX, textureY); // DoorClosed7
						bodyDoorCloseModel[7] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorClosed8
						bodyDoorCloseModel[8] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorClosed9
						bodyDoorCloseModel[9] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // DoorClosed10
						bodyDoorCloseModel[10] = new ModelRendererTurbo(this,  400,  480, textureX, textureY); // DoorClosed11
						bodyDoorCloseModel[11] = new ModelRendererTurbo(this,  400,  500, textureX, textureY); // DoorClosed12

						bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 28, 7, 2, 0F); // DoorClosed1
						bodyDoorCloseModel[0].setRotationPoint(-29F, -41F, -18F);

						bodyDoorCloseModel[1].addBox(0F, 7F, 0F, 5, 9, 2, 0F); // DoorClosed2
						bodyDoorCloseModel[1].setRotationPoint(-29F, -41F, -18F);

						bodyDoorCloseModel[2].addBox(23F, 7F, 0F, 5, 9, 2, 0F); // DoorClosed3
						bodyDoorCloseModel[2].setRotationPoint(-29F, -41F, -18F);

						bodyDoorCloseModel[3].addBox(13F, 7F, 0F, 2, 9, 2, 0F); // DoorClosed4
						bodyDoorCloseModel[3].setRotationPoint(-29F, -41F, -18F);

						bodyDoorCloseModel[4].addBox(0F, 16F, 0F, 28, 2, 2, 0F); // DoorClosed5
						bodyDoorCloseModel[4].setRotationPoint(-29F, -41F, -18F);

						bodyDoorCloseModel[5].addBox(0F, -22F, 0F, 28, 22, 2, 0F); // DoorClosed6
						bodyDoorCloseModel[5].setRotationPoint(-29F, -1F, -18F);

						bodyDoorCloseModel[6].addBox(0F, 0F, -2F, 28, 7, 2, 0F); // DoorClosed7
						bodyDoorCloseModel[6].setRotationPoint(-29F, -41F, 18F);

						bodyDoorCloseModel[7].addBox(0F, 7F, -2F, 5, 9, 2, 0F); // DoorClosed8
						bodyDoorCloseModel[7].setRotationPoint(-29F, -41F, 18F);

						bodyDoorCloseModel[8].addBox(23F, 7F, -2F, 5, 9, 2, 0F); // DoorClosed9
						bodyDoorCloseModel[8].setRotationPoint(-29F, -41F, 18F);

						bodyDoorCloseModel[9].addBox(13F, 7F, -2F, 2, 9, 2, 0F); // DoorClosed10
						bodyDoorCloseModel[9].setRotationPoint(-29F, -41F, 18F);

						bodyDoorCloseModel[10].addBox(0F, 16F, -2F, 28, 2, 2, 0F); // DoorClosed11
						bodyDoorCloseModel[10].setRotationPoint(-29F, -41F, 18F);

						bodyDoorCloseModel[11].addBox(0F, -22F, -2F, 28, 22, 2, 0F); // DoorClosed12
						bodyDoorCloseModel[11].setRotationPoint(-29F, -1F, 18F);
						
						
						
						//Copy This part into your model
						
						ModelRendererTurbo[][] noseGunModel = new ModelRendererTurbo[3][];

						noseGunModel[0] = new ModelRendererTurbo[4];
						noseGunModel[0][0] = new ModelRendererTurbo(this,  400,  550, textureX, textureY); // Turret1
						noseGunModel[0][1] = new ModelRendererTurbo(this,  400,  600, textureX, textureY); // Turret2
						noseGunModel[0][2] = new ModelRendererTurbo(this,  400,  600, textureX, textureY); // Turret3
						noseGunModel[0][3] = new ModelRendererTurbo(this,  400,  640, textureX, textureY); // Turret4

						noseGunModel[0][0].addBox(-10F, 0F, -10F, 20, 5, 20, 0F); // Turret1

						noseGunModel[0][1].addShapeBox(-10F, 5F, -10F, 20, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
						
						noseGunModel[0][2].addShapeBox(-10F, 5F, 4F, 20, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F); //Test

						noseGunModel[0][3].addShapeBox(-10F, 5F, -4F, 5, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
						
						for(ModelRendererTurbo noseGunPart : noseGunModel[0])
							noseGunPart.setRotationPoint(-102F, 0F, 0F);
						
						noseGunModel[1] = new ModelRendererTurbo[0];


						noseGunModel[2] = new ModelRendererTurbo[5];
						noseGunModel[2][0] = new ModelRendererTurbo(this,  400,  660, textureX, textureY); // TurretBarrel1
						noseGunModel[2][1] = new ModelRendererTurbo(this,  0,  96, textureX, textureY); // TurretBarrel2
						noseGunModel[2][2] = new ModelRendererTurbo(this,  400,  680, textureX, textureY); // TurretBarrel3
						noseGunModel[2][3] = new ModelRendererTurbo(this,  400,  680, textureX, textureY); // TurretBarrel4
						noseGunModel[2][4] = new ModelRendererTurbo(this,  400,  700, textureX, textureY); // TurretBarrel5

						noseGunModel[2][0].addBox(-5F, -2F, -4F, 7, 5, 8, 0F); // TurretBarrel1

						noseGunModel[2][1].addBox(2F, -1F, -2.5F, 7, 3, 5, 0F); // TurretBarrel2

						noseGunModel[2][2].addBox(9F, 0F, -1.5F, 25, 1, 1, 0F); // TurretBarrel3

						noseGunModel[2][3].addBox(9F, 0F, 0.5F, 25, 1, 1, 0F); // TurretBarrel4

						noseGunModel[2][4].addBox(21F, -0.5F, -2F, 4, 2, 4, 0F); // TurretBarrel5	
						
						for(ModelRendererTurbo noseGunPart : noseGunModel[2])
							noseGunPart.setRotationPoint(-102F, 7F, 0F);
						
						registerGunModel("Nose", noseGunModel);

		
		
		flipAll();
	}

	// Replace with your propeller function
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}