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

public class ModelAbrams extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelAbrams()
	{

// Body
		bodyModel = new ModelRendererTurbo[48];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body1
		bodyModel[1] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // Body2
		bodyModel[2] = new ModelRendererTurbo(this,  0,  151, textureX, textureY); // Body3
		bodyModel[3] = new ModelRendererTurbo(this,  0,  236, textureX, textureY); // Body4
		bodyModel[4] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body5
		bodyModel[5] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body6
		bodyModel[6] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // Body7
		bodyModel[7] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // Body8
		bodyModel[8] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // Body9
		bodyModel[9] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Body10
		bodyModel[10] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Body11
		bodyModel[11] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body12
		bodyModel[12] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body13
		bodyModel[13] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Body14
		bodyModel[14] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // Body15
		bodyModel[15] = new ModelRendererTurbo(this,  0,  510, textureX, textureY); // Body16
		bodyModel[16] = new ModelRendererTurbo(this,  0,  530, textureX, textureY); // Body17
		bodyModel[17] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // Body18
		bodyModel[18] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // Body19
		bodyModel[19] = new ModelRendererTurbo(this,  0,  590, textureX, textureY); // Body20
		bodyModel[20] = new ModelRendererTurbo(this,  0,  610, textureX, textureY); // Body21
		bodyModel[21] = new ModelRendererTurbo(this,  0,  630, textureX, textureY); // Body22
		bodyModel[22] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // Body23
		bodyModel[23] = new ModelRendererTurbo(this,  0,  675, textureX, textureY); // Body24
		bodyModel[24] = new ModelRendererTurbo(this,  0,  675, textureX, textureY); // Body25
		bodyModel[25] = new ModelRendererTurbo(this,  0,  690, textureX, textureY); // Body26
		bodyModel[26] = new ModelRendererTurbo(this,  0,  710, textureX, textureY); // Body27
		bodyModel[27] = new ModelRendererTurbo(this,  0,  730, textureX, textureY); // Body28
		bodyModel[28] = new ModelRendererTurbo(this,  0,  750, textureX, textureY); // Body29
		bodyModel[29] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // Body30
		bodyModel[30] = new ModelRendererTurbo(this,  0,  510, textureX, textureY); // Body31
		bodyModel[31] = new ModelRendererTurbo(this,  0,  530, textureX, textureY); // Body32
		bodyModel[32] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // Body33
		bodyModel[33] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // Body34
		bodyModel[34] = new ModelRendererTurbo(this,  0,  590, textureX, textureY); // Body35
		bodyModel[35] = new ModelRendererTurbo(this,  0,  610, textureX, textureY); // Body36
		bodyModel[36] = new ModelRendererTurbo(this,  0,  630, textureX, textureY); // Body37
		bodyModel[37] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // Body38
		bodyModel[38] = new ModelRendererTurbo(this,  0,  675, textureX, textureY); // Body39
		bodyModel[39] = new ModelRendererTurbo(this,  0,  675, textureX, textureY); // Body40
		bodyModel[40] = new ModelRendererTurbo(this,  0,  690, textureX, textureY); // Body41
		bodyModel[41] = new ModelRendererTurbo(this,  0,  710, textureX, textureY); // Body42
		bodyModel[42] = new ModelRendererTurbo(this,  0,  710, textureX, textureY); // Body43
		bodyModel[43] = new ModelRendererTurbo(this,  0,  730, textureX, textureY); // Body44
		bodyModel[44] = new ModelRendererTurbo(this,  0,  750, textureX, textureY); // Body45
		bodyModel[45] = new ModelRendererTurbo(this,  0,  770, textureX, textureY); // Body46
		bodyModel[46] = new ModelRendererTurbo(this,  0,  840, textureX, textureY); // Body47
		bodyModel[47] = new ModelRendererTurbo(this,  0,  890, textureX, textureY); // Body48

		bodyModel[0].addShapeBox(0F, 0F, 0F, 39, 7, 42, 0F, 0F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[0].setRotationPoint(20F, -20F, -21F);

		bodyModel[1].addBox(0F, 0F, 0F, 98, 7, 42, 0F); // Body2
		bodyModel[1].setRotationPoint(-78F, -20F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 51, 12, 70, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[2].setRotationPoint(-79F, -25F, -35F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 13, 44, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[3].setRotationPoint(-84F, -25F, -22F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 8, 12, 0F); // Body5
		bodyModel[4].setRotationPoint(-85F, -19F, -18F);

		bodyModel[5].addBox(0F, 0F, 0F, 5, 8, 12, 0F); // Body6
		bodyModel[5].setRotationPoint(-85F, -19F, 6F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 9, 10, 0F); // Body7
		bodyModel[6].setRotationPoint(-85F, -20F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Body8
		bodyModel[7].setRotationPoint(-86F, -20F, -5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Body9
		bodyModel[8].setRotationPoint(-86F, -13F, -5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Body10
		bodyModel[9].setRotationPoint(-86F, -18F, -5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Body11
		bodyModel[10].setRotationPoint(-86F, -18F, 3F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Body12
		bodyModel[11].setRotationPoint(-86F, -17F, -3F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Body13
		bodyModel[12].setRotationPoint(-86F, -15F, -3F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 4, 70, 0F); // Body14
		bodyModel[13].setRotationPoint(-79F, -13F, -35F);

		bodyModel[14].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Body15
		bodyModel[14].setRotationPoint(-78F, -13F, -35.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); //Test
		bodyModel[15].setRotationPoint(-63F, -13F, -35.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 44, 12, 1, 0F); // Body17
		bodyModel[16].setRotationPoint(-58F, -13F, -35F);

		bodyModel[17].addBox(0F, 0F, 0F, 28, 13, 1, 0F); // Body18
		bodyModel[17].setRotationPoint(-57F, -13F, -35.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 13, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[18].setRotationPoint(-28.5F, -13F, -35.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Body20
		bodyModel[19].setRotationPoint(-14F, -15F, -35.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 19, 15, 1, 0F); // Body21
		bodyModel[20].setRotationPoint(-2.5F, -15F, -35.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 32, 15, 1, 0F); // Body22
		bodyModel[21].setRotationPoint(17F, -15F, -35.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 4, 15, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[22].setRotationPoint(49F, -15F, -35.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[23].setRotationPoint(49F, -11F, -35.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[24].setRotationPoint(49F, -11F, -22.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 1, 14, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[25].setRotationPoint(-28F, -14F, -35F);

		bodyModel[26].addBox(0F, 0F, 0F, 63, 3, 14, 0F); // Body27
		bodyModel[26].setRotationPoint(-14F, -16F, -35F);

		bodyModel[27].addBox(0F, 0F, 0F, 63, 14, 1, 0F); // Body28
		bodyModel[27].setRotationPoint(-14F, -15F, -35F);

		bodyModel[28].addBox(0F, 0F, 0F, 127, 13, 2, 0F); // Body29
		bodyModel[28].setRotationPoint(-78.5F, -13F, -22.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Body30
		bodyModel[29].setRotationPoint(-78F, -13F, 34.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); //Test
		bodyModel[30].setRotationPoint(-63F, -13F, 34.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 44, 12, 1, 0F); // Body32
		bodyModel[31].setRotationPoint(-58F, -13F, 34F);

		bodyModel[32].addBox(0F, 0F, 0F, 28, 13, 1, 0F); // Body33
		bodyModel[32].setRotationPoint(-57F, -13F, 34.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 14, 13, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[33].setRotationPoint(-28.5F, -13F, 34.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Body35
		bodyModel[34].setRotationPoint(-14F, -15F, 34.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 19, 15, 1, 0F); // Body36
		bodyModel[35].setRotationPoint(-2.5F, -15F, 34.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 32, 15, 1, 0F); // Body37
		bodyModel[36].setRotationPoint(17F, -15F, 34.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 4, 15, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[37].setRotationPoint(49F, -15F, 20.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[38].setRotationPoint(49F, -11F, 33.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[39].setRotationPoint(49F, -11F, 20.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 14, 1, 14, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[40].setRotationPoint(-28F, -14F, 21F);

		bodyModel[41].addBox(0F, 0F, 0F, 63, 3, 14, 0F); // Body42
		bodyModel[41].setRotationPoint(-14F, -16F, -35F);

		bodyModel[42].addBox(0F, 0F, 0F, 63, 3, 14, 0F); // Body43
		bodyModel[42].setRotationPoint(-14F, -16F, 21F);

		bodyModel[43].addBox(0F, 0F, 0F, 63, 14, 1, 0F); // Body44
		bodyModel[43].setRotationPoint(-14F, -15F, 34F);

		bodyModel[44].addBox(0F, 0F, 0F, 127, 13, 2, 0F); // Body45
		bodyModel[44].setRotationPoint(-78.5F, -13F, 20.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 137, 13, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[45].setRotationPoint(-78F, -13F, -21F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 126, 5, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F); //Test
		bodyModel[46].setRotationPoint(-78F, 0F, -21F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 7, 33, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); //Test
		bodyModel[47].setRotationPoint(20F, -20F, -16.5F);



// Turret
		turretModel = new ModelRendererTurbo[34];
		turretModel[0] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // Turret1
		turretModel[1] = new ModelRendererTurbo(this,  300,  100, textureX, textureY); // Turret2
		turretModel[2] = new ModelRendererTurbo(this,  300,  100, textureX, textureY); // Turret3
		turretModel[3] = new ModelRendererTurbo(this,  250,  150, textureX, textureY); // Turret4
		turretModel[4] = new ModelRendererTurbo(this,  250,  200, textureX, textureY); // Turret5
		turretModel[5] = new ModelRendererTurbo(this,  200,  250, textureX, textureY); // Turret6
		turretModel[6] = new ModelRendererTurbo(this,  200,  330, textureX, textureY); // Turret7
		turretModel[7] = new ModelRendererTurbo(this,  200,  410, textureX, textureY); // Turret8
		turretModel[8] = new ModelRendererTurbo(this,  200,  480, textureX, textureY); // Turret9
		turretModel[9] = new ModelRendererTurbo(this,  200,  480, textureX, textureY); // Turret10
		turretModel[10] = new ModelRendererTurbo(this,  200,  485, textureX, textureY); // Turret11
		turretModel[11] = new ModelRendererTurbo(this,  200,  485, textureX, textureY); // Turret12
		turretModel[12] = new ModelRendererTurbo(this,  200,  500, textureX, textureY); // Turret13
		turretModel[13] = new ModelRendererTurbo(this,  200,  500, textureX, textureY); // Turret14
		turretModel[14] = new ModelRendererTurbo(this,  200,  550, textureX, textureY); // Turret15
		turretModel[15] = new ModelRendererTurbo(this,  200,  550, textureX, textureY); // Turret16
		turretModel[16] = new ModelRendererTurbo(this,  200,  500, textureX, textureY); // Turret17
		turretModel[17] = new ModelRendererTurbo(this,  200,  500, textureX, textureY); // Turret18
		turretModel[18] = new ModelRendererTurbo(this,  200,  550, textureX, textureY); // Turret19
		turretModel[19] = new ModelRendererTurbo(this,  200,  550, textureX, textureY); // Turret20
		turretModel[20] = new ModelRendererTurbo(this,  200,  560, textureX, textureY); // Turret21
		turretModel[21] = new ModelRendererTurbo(this,  220,  600, textureX, textureY); // Turret22
		turretModel[22] = new ModelRendererTurbo(this,  200,  600, textureX, textureY); // Turret23
		turretModel[23] = new ModelRendererTurbo(this,  200,  250, textureX, textureY); // Turret24
		turretModel[24] = new ModelRendererTurbo(this,  200,  620, textureX, textureY); // Turret25
		turretModel[25] = new ModelRendererTurbo(this,  200,  620, textureX, textureY); // Turret26
		turretModel[26] = new ModelRendererTurbo(this,  200,  620, textureX, textureY); // Turret27
		turretModel[27] = new ModelRendererTurbo(this,  200,  640, textureX, textureY); // Turret28
		turretModel[28] = new ModelRendererTurbo(this,  200,  660, textureX, textureY); // Turret29
		turretModel[29] = new ModelRendererTurbo(this,  200,  660, textureX, textureY); // Turret30
		turretModel[30] = new ModelRendererTurbo(this,  200,  680, textureX, textureY); // Turret31
		turretModel[31] = new ModelRendererTurbo(this,  200,  250, textureX, textureY); // Turret32
		turretModel[32] = new ModelRendererTurbo(this,  200,  250, textureX, textureY); // Turret33
		turretModel[33] = new ModelRendererTurbo(this,  200,  250, textureX, textureY); // Turret34

		turretModel[0].addShapeBox(0F, 0F, 0F, 29, 16, 64, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		turretModel[0].setRotationPoint(-15F, -36F, -32F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 25, 0F, 0F, 0F, -8F, -16F, 0F, -8F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		turretModel[1].setRotationPoint(14F, -36F, -32F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 16, 16, 25, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -16F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F); //Test
		turretModel[2].setRotationPoint(14F, -36F, 7F);

		turretModel[3].addBox(0F, 0F, 0F, 5, 5, 30, 0F); // Turret4
		turretModel[3].setRotationPoint(-20F, -25F, -15F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 10, 5, 30, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); //Test
		turretModel[4].setRotationPoint(-30F, -25F, -15F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 35, 11, 60, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 0F, 0F); //Test
		turretModel[5].setRotationPoint(-50F, -36F, -30F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 5, 11, 60, 0F, 0F, -5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, -6F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -6F); //Test
		turretModel[6].setRotationPoint(-55F, -36F, -30F);

		turretModel[7].addBox(0F, 0F, 0F, 9, 2, 62, 0F); // Turret8
		turretModel[7].setRotationPoint(-65F, -30F, -31F);

		turretModel[8].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Turret9
		turretModel[8].setRotationPoint(-65F, -37F, -31F);

		turretModel[9].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Turret10
		turretModel[9].setRotationPoint(-65F, -37F, 29F);

		turretModel[10].addBox(0F, 0F, 0F, 1, 1, 58, 0F); // Turret11
		turretModel[10].setRotationPoint(-64F, -36F, -29F);

		turretModel[11].addBox(0F, 0F, 0F, 1, 1, 58, 0F); // Turret12
		turretModel[11].setRotationPoint(-64F, -33F, -29F);

		turretModel[12].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Turret13
		turretModel[12].setRotationPoint(-63F, -33F, -30F);

		turretModel[13].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Turret14
		turretModel[13].setRotationPoint(-63F, -36F, -30F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); //Test
		turretModel[14].setRotationPoint(-56F, -33F, -30F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); //Test
		turretModel[15].setRotationPoint(-56F, -36F, -30F);

		turretModel[16].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Turret17
		turretModel[16].setRotationPoint(-63F, -36F, 29F);

		turretModel[17].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Turret18
		turretModel[17].setRotationPoint(-63F, -33F, 29F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); //Test
		turretModel[18].setRotationPoint(-56F, -36F, 29F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); //Test
		turretModel[19].setRotationPoint(-56F, -33F, 29F);

		turretModel[20].addBox(0F, 0F, 0F, 6, 11, 20, 0F); // Turret21
		turretModel[20].setRotationPoint(-56F, -36F, -10F);

		turretModel[21].addBox(0F, 0F, 0F, 3, 5, 3, 0F); // Turret22
		turretModel[21].setRotationPoint(-55F, -41F, -1.5F);

		turretModel[22].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Turret23
		turretModel[22].setRotationPoint(-54.5F, -50F, -1F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		turretModel[23].setRotationPoint(-28F, -37F, -10F);

		turretModel[24].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Turret25
		turretModel[24].setRotationPoint(-28F, -37F, -10F);

		turretModel[25].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Turret26
		turretModel[25].setRotationPoint(-28F, -37F, -14F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		turretModel[26].setRotationPoint(-28F, -37F, -18F);

		turretModel[27].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Turret28
		turretModel[27].setRotationPoint(-24F, -39F, -18F);

		turretModel[28].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Turret29
		turretModel[28].setRotationPoint(-24F, -44F, -18F);

		turretModel[29].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Turret30
		turretModel[29].setRotationPoint(-24F, -44F, -8F);

		turretModel[30].addBox(0F, 0F, 0F, 12, 4, 4, 0F); // Turret31
		turretModel[30].setRotationPoint(-27F, -42F, -14F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		turretModel[31].setRotationPoint(-28F, -37F, 2F);

		turretModel[32].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Turret33
		turretModel[32].setRotationPoint(-28F, -37F, 6F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		turretModel[33].setRotationPoint(-28F, -37F, 10F);



// Barrel
		barrelModel = new ModelRendererTurbo[10];
		barrelModel[0] = new ModelRendererTurbo(this,  200,  700, textureX, textureY); // Barrel1
		barrelModel[1] = new ModelRendererTurbo(this,  270,  700, textureX, textureY); // Barrel2
		barrelModel[2] = new ModelRendererTurbo(this,  200,  730, textureX, textureY); // Barrel3
		barrelModel[3] = new ModelRendererTurbo(this,  270,  750, textureX, textureY); // Barrel4
		barrelModel[4] = new ModelRendererTurbo(this,  320,  750, textureX, textureY); // Barrel5
		barrelModel[5] = new ModelRendererTurbo(this,  400,  0, textureX, textureY); // BarrelTwo1
		barrelModel[6] = new ModelRendererTurbo(this,  400,  30, textureX, textureY); // BarrelTwo2
		barrelModel[7] = new ModelRendererTurbo(this,  400,  45, textureX, textureY); // BarrelTwo3
		barrelModel[8] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // BarrelTwo4
		barrelModel[9] = new ModelRendererTurbo(this,  400,  70, textureX, textureY); // BarrelTwo5

		barrelModel[0].addShapeBox(0F, -8F, -7F, 19, 10, 14, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		barrelModel[0].setRotationPoint(14F, -28F, 0F);

		barrelModel[1].addShapeBox(0F, 2F, -7F, 19, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); //Test
		barrelModel[1].setRotationPoint(14F, -28F, 0F);

		barrelModel[2].addShapeBox(6F, -6F, -2.5F, 74, 5, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); //Test
		barrelModel[2].setRotationPoint(14F, -27F, 0F);

		barrelModel[3].addBox(33F, -6.5F, -3F, 11, 6, 6, 0F); // Barrel4
		barrelModel[3].setRotationPoint(14F, -27F, 0F);

		barrelModel[4].addBox(80F, -5F, -1.5F, 5, 3, 3, 0F); // Barrel5
		barrelModel[4].setRotationPoint(14F, -27F, 0F);

		barrelModel[5].addBox(-2F, 0F, -4F, 4, 1, 8, 0F); // BarrelTwo1
		barrelModel[5].setRotationPoint(-22F, -43F, -12F);

		barrelModel[6].addBox(-2F, -4F, -2F, 13, 4, 4, 0F); // BarrelTwo2
		barrelModel[6].setRotationPoint(-24F, -43F, -12F);

		barrelModel[7].addBox(11F, -3.5F, -1.5F, 7, 3, 3, 0F); // BarrelTwo3
		barrelModel[7].setRotationPoint(-24F, -43F, -12F);

		barrelModel[8].addBox(18F, -3F, -1F, 11, 2, 2, 0F); // BarrelTwo4
		barrelModel[8].setRotationPoint(-24F, -43F, -12F);

		barrelModel[9].addBox(-2F, -4F, -2F, 5, 6, 7, 0F); // BarrelTwo5
		barrelModel[9].setRotationPoint(-17F, -41F, -8F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[30];
		leftTrackModel[0] = new ModelRendererTurbo(this,  400,  150, textureX, textureY); // LeftTrack1
		leftTrackModel[1] = new ModelRendererTurbo(this,  400,  180, textureX, textureY); // LeftTrack2
		leftTrackModel[2] = new ModelRendererTurbo(this,  350,  220, textureX, textureY); // LeftTrack3
		leftTrackModel[3] = new ModelRendererTurbo(this,  400,  150, textureX, textureY); // LeftTrack4
		leftTrackModel[4] = new ModelRendererTurbo(this,  400,  250, textureX, textureY); // LeftTrack5
		leftTrackModel[5] = new ModelRendererTurbo(this,  400,  290, textureX, textureY); // LeftTrack6
		leftTrackModel[6] = new ModelRendererTurbo(this,  400,  310, textureX, textureY); // LeftTrack7
		leftTrackModel[7] = new ModelRendererTurbo(this,  400,  330, textureX, textureY); // LeftTrack8
		leftTrackModel[8] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // LeftTrack9
		leftTrackModel[9] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack10
		leftTrackModel[10] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack11
		leftTrackModel[11] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // LeftTrack12
		leftTrackModel[12] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // LeftTrack13
		leftTrackModel[13] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // LeftTrack14
		leftTrackModel[14] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // LeftTrack15
		leftTrackModel[15] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // LeftTrack16
		leftTrackModel[16] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // LeftTrack17
		leftTrackModel[17] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack18
		leftTrackModel[18] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack19
		leftTrackModel[19] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack20
		leftTrackModel[20] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack21
		leftTrackModel[21] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack22
		leftTrackModel[22] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // LeftTrack23
		leftTrackModel[23] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack24
		leftTrackModel[24] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack25
		leftTrackModel[25] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack26
		leftTrackModel[26] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack27
		leftTrackModel[27] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack28
		leftTrackModel[28] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // LeftTrack29
		leftTrackModel[29] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // LeftTrack30

		leftTrackModel[0].addBox(0F, 0F, 0F, 2, 11, 13, 0F); // LeftTrack1
		leftTrackModel[0].setRotationPoint(53F, -11F, 21.5F);

		leftTrackModel[1].addBox(-2F, 0F, 0F, 2, 24, 13, 0F); // LeftTrack2
		leftTrackModel[1].setRotationPoint(55F, 0F, 21.4F);
		leftTrackModel[1].rotateAngleZ = -0.9424778F;

		leftTrackModel[2].addBox(-96F, 0F, 0F, 96, 2, 13, 0F); // LeftTrack3
		leftTrackModel[2].setRotationPoint(36F, 12F, 21.5F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 2, 11, 13, 0F); // LeftTrack4
		leftTrackModel[3].setRotationPoint(-78F, -11F, 21.5F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 2, 23, 13, 0F); // LeftTrack5
		leftTrackModel[4].setRotationPoint(-78F, 0F, 21.4F);
		leftTrackModel[4].rotateAngleZ = 0.9250245F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 9, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[5].setRotationPoint(-75F, -13F, 23.5F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 15, 5, 9, 0F); // LeftTrack7
		leftTrackModel[6].setRotationPoint(-75F, -8F, 23.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		leftTrackModel[7].setRotationPoint(-75F, -3F, 23.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[8].setRotationPoint(-60F, 0F, 23.5F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // LeftTrack10
		leftTrackModel[9].setRotationPoint(-60F, 4F, 23.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[10].setRotationPoint(-60F, 8F, 23.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[11].setRotationPoint(-45F, 0F, 23.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[12].setRotationPoint(-30F, 0F, 23.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[13].setRotationPoint(-15F, 0F, 23.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[14].setRotationPoint(0F, 0F, 23.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[15].setRotationPoint(15F, 0F, 23.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftTrackModel[16].setRotationPoint(30F, -2F, 23.5F);

		leftTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // LeftTrack18
		leftTrackModel[17].setRotationPoint(-45F, 4F, 23.5F);

		leftTrackModel[18].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // LeftTrack19
		leftTrackModel[18].setRotationPoint(-30F, 4F, 23.5F);

		leftTrackModel[19].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // LeftTrack20
		leftTrackModel[19].setRotationPoint(-15F, 4F, 23.5F);

		leftTrackModel[20].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // LeftTrack21
		leftTrackModel[20].setRotationPoint(0F, 4F, 23.5F);

		leftTrackModel[21].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // LeftTrack22
		leftTrackModel[21].setRotationPoint(15F, 4F, 23.5F);

		leftTrackModel[22].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // LeftTrack23
		leftTrackModel[22].setRotationPoint(30F, 2F, 23.5F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[23].setRotationPoint(-45F, 8F, 23.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[24].setRotationPoint(-30F, 8F, 23.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[25].setRotationPoint(-15F, 8F, 23.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[26].setRotationPoint(0F, 8F, 23.5F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[27].setRotationPoint(15F, 8F, 23.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		leftTrackModel[28].setRotationPoint(30F, 6F, 23.5F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 116, 17, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); //Test
		leftTrackModel[29].setRotationPoint(-68F, -11F, 25.5F);



// Right Track
		rightTrackModel = new ModelRendererTurbo[30];
		rightTrackModel[0] = new ModelRendererTurbo(this,  400,  150, textureX, textureY); // RightTrack1
		rightTrackModel[1] = new ModelRendererTurbo(this,  400,  180, textureX, textureY); // RightTrack2
		rightTrackModel[2] = new ModelRendererTurbo(this,  350,  220, textureX, textureY); // RightTrack3
		rightTrackModel[3] = new ModelRendererTurbo(this,  400,  150, textureX, textureY); // RightTrack4
		rightTrackModel[4] = new ModelRendererTurbo(this,  400,  250, textureX, textureY); // RightTrack5
		rightTrackModel[5] = new ModelRendererTurbo(this,  400,  290, textureX, textureY); // RightTrack6
		rightTrackModel[6] = new ModelRendererTurbo(this,  400,  310, textureX, textureY); // RightTrack7
		rightTrackModel[7] = new ModelRendererTurbo(this,  400,  330, textureX, textureY); // RightTrack8
		rightTrackModel[8] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // RightTrack9
		rightTrackModel[9] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack10
		rightTrackModel[10] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack11
		rightTrackModel[11] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // RightTrack12
		rightTrackModel[12] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // RightTrack13
		rightTrackModel[13] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // RightTrack14
		rightTrackModel[14] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // RightTrack15
		rightTrackModel[15] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // RightTrack16
		rightTrackModel[16] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // RightTrack17
		rightTrackModel[17] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack18
		rightTrackModel[18] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack19
		rightTrackModel[19] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack20
		rightTrackModel[20] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack21
		rightTrackModel[21] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack22
		rightTrackModel[22] = new ModelRendererTurbo(this,  400,  380, textureX, textureY); // RightTrack23
		rightTrackModel[23] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack24
		rightTrackModel[24] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack25
		rightTrackModel[25] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack26
		rightTrackModel[26] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack27
		rightTrackModel[27] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack28
		rightTrackModel[28] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // RightTrack29
		rightTrackModel[29] = new ModelRendererTurbo(this,  400,  420, textureX, textureY); // RightTrack30

		rightTrackModel[0].addBox(0F, 0F, 0F, 2, 11, 13, 0F); // RightTrack1
		rightTrackModel[0].setRotationPoint(53F, -11F, -34.5F);

		rightTrackModel[1].addBox(-2F, 0F, 0F, 2, 24, 13, 0F); // RightTrack2
		rightTrackModel[1].setRotationPoint(55F, 0F, -34.4F);
		rightTrackModel[1].rotateAngleZ = -0.9424778F;

		rightTrackModel[2].addBox(-96F, 0F, 0F, 96, 2, 13, 0F); // RightTrack3
		rightTrackModel[2].setRotationPoint(36F, 12F, -34.5F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 2, 11, 13, 0F); // RightTrack4
		rightTrackModel[3].setRotationPoint(-78F, -11F, -34.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 2, 23, 13, 0F); // RightTrack5
		rightTrackModel[4].setRotationPoint(-78F, 0F, -34.5F);
		rightTrackModel[4].rotateAngleZ = 0.9250245F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 9, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[5].setRotationPoint(-75F, -13F, -32.5F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 15, 5, 9, 0F); // RightTrack7
		rightTrackModel[6].setRotationPoint(-75F, -8F, -32.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); //Test
		rightTrackModel[7].setRotationPoint(-75F, -3F, -32.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[8].setRotationPoint(-60F, 0F, -32.5F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // RightTrack10
		rightTrackModel[9].setRotationPoint(-60F, 4F, -32.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[10].setRotationPoint(-60F, 8F, -32.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[11].setRotationPoint(-45F, 0F, -32.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[12].setRotationPoint(-30F, 0F, -32.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[13].setRotationPoint(-15F, 0F, -32.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[14].setRotationPoint(0F, 0F, -32.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[15].setRotationPoint(15F, 0F, -32.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightTrackModel[16].setRotationPoint(30F, -2F, -32.5F);

		rightTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // RightTrack18
		rightTrackModel[17].setRotationPoint(-45F, 4F, -32.5F);

		rightTrackModel[18].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // RightTrack19
		rightTrackModel[18].setRotationPoint(-30F, 4F, -32.5F);

		rightTrackModel[19].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // RightTrack20
		rightTrackModel[19].setRotationPoint(-15F, 4F, -32.5F);

		rightTrackModel[20].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // RightTrack21
		rightTrackModel[20].setRotationPoint(0F, 4F, -32.5F);

		rightTrackModel[21].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // RightTrack22
		rightTrackModel[21].setRotationPoint(15F, 4F, -32.5F);

		rightTrackModel[22].addBox(0F, 0F, 0F, 12, 4, 9, 0F); // RightTrack23
		rightTrackModel[22].setRotationPoint(30F, 2F, -32.5F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[23].setRotationPoint(-45F, 8F, -32.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[24].setRotationPoint(-30F, 8F, -32.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[25].setRotationPoint(-15F, 8F, -32.5F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[26].setRotationPoint(0F, 8F, -32.5F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[27].setRotationPoint(15F, 8F, -32.5F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		rightTrackModel[28].setRotationPoint(30F, 6F, -32.5F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 116, 17, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); //Test
		rightTrackModel[29].setRotationPoint(-68F, -11F, -30.5F);


		translateAll(15F, -4F, 0);


		flipAll();
	}
}