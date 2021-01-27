//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ApacheAH64
// Model Creator: 
// Created on: 16.07.2020 - 17:02:25
// Last changed on: 16.07.2020 - 17:02:25

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelApacheAH64 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelApacheAH64() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[175];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import Box3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Import Box4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import Box5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import Box6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import Box7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import Box8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import Box9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Import Box13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Box14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box16
		bodyModel[17] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box17
		bodyModel[18] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import Box18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 295, textureX, textureY); // Import Box19
		bodyModel[20] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Import Box20
		bodyModel[21] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Import Box21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Import Box23
		bodyModel[23] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Import Box24
		bodyModel[24] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Box25
		bodyModel[25] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box26
		bodyModel[26] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box27
		bodyModel[27] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Box28
		bodyModel[28] = new ModelRendererTurbo(this, 0, 545, textureX, textureY); // Import Box29
		bodyModel[29] = new ModelRendererTurbo(this, 0, 575, textureX, textureY); // Import Box30
		bodyModel[30] = new ModelRendererTurbo(this, 0, 602, textureX, textureY); // Import Box31
		bodyModel[31] = new ModelRendererTurbo(this, 0, 602, textureX, textureY); // Import Box32
		bodyModel[32] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box33
		bodyModel[33] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import Box34
		bodyModel[34] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import Box35
		bodyModel[35] = new ModelRendererTurbo(this, 0, 635, textureX, textureY); // Import Box36
		bodyModel[36] = new ModelRendererTurbo(this, 0, 635, textureX, textureY); // Import Box37
		bodyModel[37] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box38
		bodyModel[38] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Import Box39
		bodyModel[39] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Import Box40
		bodyModel[40] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Import Box41
		bodyModel[41] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Import Box42
		bodyModel[42] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Import Box43
		bodyModel[43] = new ModelRendererTurbo(this, 0, 835, textureX, textureY); // Import Box44
		bodyModel[44] = new ModelRendererTurbo(this, 0, 855, textureX, textureY); // Import Box45
		bodyModel[45] = new ModelRendererTurbo(this, 0, 855, textureX, textureY); // Import Box46
		bodyModel[46] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Import Box47
		bodyModel[47] = new ModelRendererTurbo(this, 0, 905, textureX, textureY); // Import Box48
		bodyModel[48] = new ModelRendererTurbo(this, 0, 905, textureX, textureY); // Import Box49
		bodyModel[49] = new ModelRendererTurbo(this, 0, 915, textureX, textureY); // Import Box50
		bodyModel[50] = new ModelRendererTurbo(this, 0, 915, textureX, textureY); // Import Box51
		bodyModel[51] = new ModelRendererTurbo(this, 0, 925, textureX, textureY); // Import Box52
		bodyModel[52] = new ModelRendererTurbo(this, 0, 935, textureX, textureY); // Import Box53
		bodyModel[53] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box54
		bodyModel[54] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box55
		bodyModel[55] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box56
		bodyModel[56] = new ModelRendererTurbo(this, 0, 925, textureX, textureY); // Import Box57
		bodyModel[57] = new ModelRendererTurbo(this, 0, 935, textureX, textureY); // Import Box58
		bodyModel[58] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Import Box59
		bodyModel[59] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Import Box60
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1002, textureX, textureY); // Import Box61
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1040, textureX, textureY); // Import Box62
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1085, textureX, textureY); // Import Box63
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import Box64
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Box65
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1183, textureX, textureY); // Import Box66
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1205, textureX, textureY); // Import Box67
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1205, textureX, textureY); // Import Box69
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Box70
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1260, textureX, textureY); // Import Box71
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1280, textureX, textureY); // Import Box72
		bodyModel[71] = new ModelRendererTurbo(this, 0, 1295, textureX, textureY); // Import Box73
		bodyModel[72] = new ModelRendererTurbo(this, 0, 1310, textureX, textureY); // Import Box74
		bodyModel[73] = new ModelRendererTurbo(this, 0, 1335, textureX, textureY); // Import Box75
		bodyModel[74] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box76
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1367, textureX, textureY); // Import Box77
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1390, textureX, textureY); // Import Box78
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1415, textureX, textureY); // Import Box79
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Import Box80
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1367, textureX, textureY); // Import Box81
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Import Box82
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1390, textureX, textureY); // Import Box83
		bodyModel[82] = new ModelRendererTurbo(this, 0, 1415, textureX, textureY); // Import Box84
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1472, textureX, textureY); // Import Box85
		bodyModel[84] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Import Box86
		bodyModel[85] = new ModelRendererTurbo(this, 0, 1586, textureX, textureY); // Import Box87
		bodyModel[86] = new ModelRendererTurbo(this, 0, 1586, textureX, textureY); // Import Box88
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1625, textureX, textureY); // Import Box89
		bodyModel[88] = new ModelRendererTurbo(this, 0, 1645, textureX, textureY); // Import Box90
		bodyModel[89] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box91
		bodyModel[90] = new ModelRendererTurbo(this, 0, 1735, textureX, textureY); // Import Box92
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Import Box93
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import Box94
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Import Box95
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import Box96
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1835, textureX, textureY); // Import Box97
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Import Box98
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1925, textureX, textureY); // Import Box99
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1960, textureX, textureY); // Import Box100
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1960, textureX, textureY); // Import Box101
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1985, textureX, textureY); // Import Box102
		bodyModel[101] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box103
		bodyModel[102] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box104
		bodyModel[103] = new ModelRendererTurbo(this, 0, 2012, textureX, textureY); // Import Box105
		bodyModel[104] = new ModelRendererTurbo(this, 0, 2012, textureX, textureY); // Import Box106
		bodyModel[105] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Import Box107
		bodyModel[106] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Import Box108
		bodyModel[107] = new ModelRendererTurbo(this, 0, 2012, textureX, textureY); // Import Box109
		bodyModel[108] = new ModelRendererTurbo(this, 0, 2012, textureX, textureY); // Import Box110
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1960, textureX, textureY); // Import Box111
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1925, textureX, textureY); // Import Box112
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1960, textureX, textureY); // Import Box113
		bodyModel[112] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box114
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1985, textureX, textureY); // Import Box115
		bodyModel[114] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box116
		bodyModel[115] = new ModelRendererTurbo(this, 0, 2012, textureX, textureY); // Import Box117
		bodyModel[116] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Import Box118
		bodyModel[117] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Import Box119
		bodyModel[118] = new ModelRendererTurbo(this, 0, 2012, textureX, textureY); // Import Box120
		bodyModel[119] = new ModelRendererTurbo(this, 0, 2012, textureX, textureY); // Import Box121
		bodyModel[120] = new ModelRendererTurbo(this, 0, 2012, textureX, textureY); // Import Box122
		bodyModel[121] = new ModelRendererTurbo(this, 200, 85, textureX, textureY); // Import Box123
		bodyModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box124
		bodyModel[123] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Import Box125
		bodyModel[124] = new ModelRendererTurbo(this, 200, 167, textureX, textureY); // Import Box126
		bodyModel[125] = new ModelRendererTurbo(this, 200, 190, textureX, textureY); // Import Box127
		bodyModel[126] = new ModelRendererTurbo(this, 200, 190, textureX, textureY); // Import Box128
		bodyModel[127] = new ModelRendererTurbo(this, 200, 212, textureX, textureY); // Import Box129
		bodyModel[128] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Import Box130
		bodyModel[129] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Import Box131
		bodyModel[130] = new ModelRendererTurbo(this, 200, 255, textureX, textureY); // Import Box132
		bodyModel[131] = new ModelRendererTurbo(this, 200, 275, textureX, textureY); // Import Box133
		bodyModel[132] = new ModelRendererTurbo(this, 200, 275, textureX, textureY); // Import Box134
		bodyModel[133] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import Box135
		bodyModel[134] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import Box136
		bodyModel[135] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import Box137
		bodyModel[136] = new ModelRendererTurbo(this, 200, 315, textureX, textureY); // Import Box159
		bodyModel[137] = new ModelRendererTurbo(this, 200, 330, textureX, textureY); // Import Box160
		bodyModel[138] = new ModelRendererTurbo(this, 200, 347, textureX, textureY); // Import Box161
		bodyModel[139] = new ModelRendererTurbo(this, 200, 1290, textureX, textureY); // Import Box138
		bodyModel[140] = new ModelRendererTurbo(this, 200, 1290, textureX, textureY); // Import Box139
		bodyModel[141] = new ModelRendererTurbo(this, 200, 1297, textureX, textureY); // Import Box140
		bodyModel[142] = new ModelRendererTurbo(this, 200, 1297, textureX, textureY); // Import Box141
		bodyModel[143] = new ModelRendererTurbo(this, 200, 1297, textureX, textureY); // Import Box142
		bodyModel[144] = new ModelRendererTurbo(this, 200, 1297, textureX, textureY); // Import Box143
		bodyModel[145] = new ModelRendererTurbo(this, 200, 1310, textureX, textureY); // Import Box144
		bodyModel[146] = new ModelRendererTurbo(this, 200, 1325, textureX, textureY); // Import Box145
		bodyModel[147] = new ModelRendererTurbo(this, 200, 1325, textureX, textureY); // Import Box146
		bodyModel[148] = new ModelRendererTurbo(this, 200, 1310, textureX, textureY); // Import Box147
		bodyModel[149] = new ModelRendererTurbo(this, 200, 1325, textureX, textureY); // Import Box148
		bodyModel[150] = new ModelRendererTurbo(this, 200, 1310, textureX, textureY); // Import Box149
		bodyModel[151] = new ModelRendererTurbo(this, 200, 1325, textureX, textureY); // Import Box150
		bodyModel[152] = new ModelRendererTurbo(this, 200, 1310, textureX, textureY); // Import Box151
		bodyModel[153] = new ModelRendererTurbo(this, 200, 1335, textureX, textureY); // Import Box152
		bodyModel[154] = new ModelRendererTurbo(this, 200, 1335, textureX, textureY); // Import Box153
		bodyModel[155] = new ModelRendererTurbo(this, 200, 1335, textureX, textureY); // Import Box154
		bodyModel[156] = new ModelRendererTurbo(this, 200, 1335, textureX, textureY); // Import Box155
		bodyModel[157] = new ModelRendererTurbo(this, 200, 1210, textureX, textureY); // Import Box172
		bodyModel[158] = new ModelRendererTurbo(this, 200, 1230, textureX, textureY); // Import Box173
		bodyModel[159] = new ModelRendererTurbo(this, 200, 1245, textureX, textureY); // Import Box174
		bodyModel[160] = new ModelRendererTurbo(this, 200, 1230, textureX, textureY); // Import Box175
		bodyModel[161] = new ModelRendererTurbo(this, 200, 1245, textureX, textureY); // Import Box176
		bodyModel[162] = new ModelRendererTurbo(this, 200, 1275, textureX, textureY); // Import Box177
		bodyModel[163] = new ModelRendererTurbo(this, 200, 1280, textureX, textureY); // Import Box178
		bodyModel[164] = new ModelRendererTurbo(this, 200, 1275, textureX, textureY); // Import Box179
		bodyModel[165] = new ModelRendererTurbo(this, 200, 1280, textureX, textureY); // Import Box180
		bodyModel[166] = new ModelRendererTurbo(this, 200, 1345, textureX, textureY); // Import Box287
		bodyModel[167] = new ModelRendererTurbo(this, 200, 1360, textureX, textureY); // Import Box288
		bodyModel[168] = new ModelRendererTurbo(this, 200, 1360, textureX, textureY); // Import Box289
		bodyModel[169] = new ModelRendererTurbo(this, 200, 1375, textureX, textureY); // Import Box295
		bodyModel[170] = new ModelRendererTurbo(this, 200, 1390, textureX, textureY); // Import Box290
		bodyModel[171] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Import Box291
		bodyModel[172] = new ModelRendererTurbo(this, 200, 1420, textureX, textureY); // Import Box292
		bodyModel[173] = new ModelRendererTurbo(this, 200, 1435, textureX, textureY); // Import Box293
		bodyModel[174] = new ModelRendererTurbo(this, 200, 1442, textureX, textureY); // Import Box294

		bodyModel[0].addShapeBox(0F, -35F, 0F, 2, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box0
		bodyModel[0].setRotationPoint(-123F, -2F, -5.5F);

		bodyModel[1].addShapeBox(0F, -35F, 0F, 3, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box1
		bodyModel[1].setRotationPoint(-126F, -2F, -7.5F);

		bodyModel[2].addBox(0F, -35F, 0F, 5, 4, 15, 0F); // Import Box2
		bodyModel[2].setRotationPoint(-131F, -2F, -7.5F);

		bodyModel[3].addShapeBox(0F, -35F, 0F, 2, 4, 11, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box3
		bodyModel[3].setRotationPoint(-136F, -2F, -5.5F);

		bodyModel[4].addShapeBox(0F, -35F, 0F, 3, 4, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box4
		bodyModel[4].setRotationPoint(-134F, -2F, -7.5F);

		bodyModel[5].addShapeBox(0F, -35F, 0F, 4, 2, 15, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F); // Import Box5
		bodyModel[5].setRotationPoint(-126F, 2F, -7.5F);

		bodyModel[6].addShapeBox(0F, -35F, 0F, 3, 2, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box6
		bodyModel[6].setRotationPoint(-135F, 2F, -7.5F);

		bodyModel[7].addShapeBox(0F, -35F, 0F, 2, 2, 11, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box7
		bodyModel[7].setRotationPoint(-137F, 2F, -5.5F);

		bodyModel[8].addBox(-1F, -35F, 0F, 6, 2, 15, 0F); // Import Box8
		bodyModel[8].setRotationPoint(-131F, 2F, -7.5F);

		bodyModel[9].addBox(0F, -33F, 0F, 17, 8, 4, 0F); // Import Box9
		bodyModel[9].setRotationPoint(-137F, 2F, -2F);

		bodyModel[10].addShapeBox(0F, -33F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[10].setRotationPoint(-135F, 2F, -9F);

		bodyModel[11].addBox(0F, -33F, 0F, 12, 4, 7, 0F); // Import Box11
		bodyModel[11].setRotationPoint(-135F, 6F, -9F);

		bodyModel[12].addShapeBox(0F, -33F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box12
		bodyModel[12].setRotationPoint(-135F, 10F, -9F);

		bodyModel[13].addShapeBox(0F, -33F, 0F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box13
		bodyModel[13].setRotationPoint(-137F, 10F, -2F);

		bodyModel[14].addBox(0F, -33F, 0F, 3, 6, 3, 0F); // Import Box14
		bodyModel[14].setRotationPoint(-135.5F, 5F, -7F);

		bodyModel[15].addShapeBox(0F, -33F, 0F, 12, 4, 7, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[15].setRotationPoint(-135F, 2F, 2F);

		bodyModel[16].addShapeBox(0F, -33F, 0F, 12, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box16
		bodyModel[16].setRotationPoint(-135F, 10F, 2F);

		bodyModel[17].addBox(0F, -33F, 0F, 12, 4, 7, 0F); // Import Box17
		bodyModel[17].setRotationPoint(-135F, 6F, 2F);

		bodyModel[18].addBox(0F, -33F, 0F, 3, 6, 4, 0F); // Import Box18
		bodyModel[18].setRotationPoint(-135.5F, 5F, 2F);

		bodyModel[19].addShapeBox(0F, -33F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box19
		bodyModel[19].setRotationPoint(-135.5F, 5F, 6F);

		bodyModel[20].addShapeBox(0F, -35F, 0F, 5, 8, 25, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box20
		bodyModel[20].setRotationPoint(-122F, -2F, -12.5F);

		bodyModel[21].addShapeBox(0F, -27F, 0F, 5, 13, 25, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.6F); // Import Box21
		bodyModel[21].setRotationPoint(-122F, -2F, -12.5F);

		bodyModel[22].addShapeBox(0F, -38F, 0F, 10, 25, 28, 0F, 0F, -2.143F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.143F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[22].setRotationPoint(-113F, -2F, -14F);

		bodyModel[23].addShapeBox(0F, -38F, 0F, 4, 25, 28, 0F, 0F, -3F, -1.5F, 0F, -2.143F, 0F, 0F, -2.143F, 0F, 0F, -3F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F); // Import Box24
		bodyModel[23].setRotationPoint(-117F, -2F, -14F);

		bodyModel[24].addBox(0F, -38F, 0F, 60, 16, 2, 0F); // Import Box25
		bodyModel[24].setRotationPoint(-103F, 7F, -14F);

		bodyModel[25].addShapeBox(0F, -38F, 0F, 27, 9, 2, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[25].setRotationPoint(-96F, -2F, -14F);

		bodyModel[26].addShapeBox(0F, -38F, 0F, 27, 9, 2, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[26].setRotationPoint(-96F, -2F, 12F);

		bodyModel[27].addBox(0F, -38F, 0F, 60, 16, 2, 0F); // Import Box28
		bodyModel[27].setRotationPoint(-103F, 7F, 12F);

		bodyModel[28].addBox(0F, -38F, 0F, 60, 2, 24, 0F); // Import Box29
		bodyModel[28].setRotationPoint(-103F, 21F, -12F);

		bodyModel[29].addShapeBox(0F, -38F, 0F, 2, 2, 21, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[29].setRotationPoint(-100F, -9F, -10.5F);

		bodyModel[30].addShapeBox(0F, -38F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0.43F, 3.5F, -5F, 0F, 3.5F, -5F, 0F, -3.5F, 5F, 0.43F, -3.5F); // Import Box31
		bodyModel[30].setRotationPoint(-100F, -7F, -10.5F);

		bodyModel[31].addShapeBox(0F, -38F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0.43F, -3.5F, -5F, 0F, -3.5F, -5F, 0F, 3.5F, 5F, 0.43F, 3.5F); // Import Box32
		bodyModel[31].setRotationPoint(-100F, -7F, 8.5F);

		bodyModel[32].addBox(0F, -38F, 0F, 2, 2, 16, 0F); // Import Box33
		bodyModel[32].setRotationPoint(-73F, -21F, -8F);

		bodyModel[33].addShapeBox(0F, -38F, 0F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 12F, -2.5F, 0F, 12F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2.5F, 0F, -12F, 2.5F, 0F, 0F, 0F); // Import Box34
		bodyModel[33].setRotationPoint(-98F, -9F, -10.5F);

		bodyModel[34].addShapeBox(0F, -38F, 0F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 12F, 2.5F, 0F, 12F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 2.5F, 0F, -12F, -2.5F, 0F, 0F, 0F); // Import Box35
		bodyModel[34].setRotationPoint(-98F, -9F, 8.5F);

		bodyModel[35].addShapeBox(0F, -38F, 0F, 2, 17, 2, 0F, 2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 6F, 2F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		bodyModel[35].setRotationPoint(-71F, -19F, -14F);

		bodyModel[36].addShapeBox(0F, -38F, 0F, 2, 17, 2, 0F, 2F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, -6F, 2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[36].setRotationPoint(-71F, -19F, 12F);

		bodyModel[37].addBox(0F, -38F, 0F, 8, 23, 24, 0F); // Import Box38
		bodyModel[37].setRotationPoint(-77F, -2F, -12F);

		bodyModel[38].addShapeBox(0F, -38F, 0F, 8, 8, 24, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[38].setRotationPoint(-77F, -10F, -12F);

		bodyModel[39].addShapeBox(0F, -38F, 0F, 8, 23, 4, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[39].setRotationPoint(-85F, -2F, -12F);

		bodyModel[40].addShapeBox(0F, -38F, 0F, 8, 23, 4, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		bodyModel[40].setRotationPoint(-85F, -2F, 8F);

		bodyModel[41].addBox(0F, -38F, 0F, 2, 23, 14, 0F); // Import Box42
		bodyModel[41].setRotationPoint(-79F, -2F, -7F);

		bodyModel[42].addBox(0F, -38F, 0F, 2, 6, 14, 0F); // Import Box43
		bodyModel[42].setRotationPoint(-79F, -10F, -7F);

		bodyModel[43].addBox(0F, -38F, 0F, 13, 4, 14, 0F); // Import Box44
		bodyModel[43].setRotationPoint(-92F, 15F, -7F);

		bodyModel[44].addShapeBox(0F, -38F, 0F, 10, 18, 4, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[44].setRotationPoint(-103F, 3F, -12F);

		bodyModel[45].addShapeBox(0F, -38F, 0F, 10, 18, 4, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[45].setRotationPoint(-103F, 3F, 8F);

		bodyModel[46].addBox(0F, -38F, 0F, 2, 10, 10, 0F); // Import Box47
		bodyModel[46].setRotationPoint(-103F, -2F, -5F);

		bodyModel[47].addBox(0F, -38F, 0F, 2, 4, 4, 0F); // Import Box48
		bodyModel[47].setRotationPoint(-103F, -1F, -11F);

		bodyModel[48].addBox(0F, -38F, 0F, 2, 4, 4, 0F); // Import Box49
		bodyModel[48].setRotationPoint(-103F, -1F, 7F);

		bodyModel[49].addShapeBox(0F, -38F, 0F, 6, 4, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[49].setRotationPoint(-110F, 5F, -16F);

		bodyModel[50].addShapeBox(0F, -38F, 0F, 6, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box51
		bodyModel[50].setRotationPoint(-110F, 5F, 14F);

		bodyModel[51].addShapeBox(0F, -38F, 0F, 17, 5, 2, 0F, 0F, 2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[51].setRotationPoint(-69F, 2F, -14F);

		bodyModel[52].addBox(0F, -38F, 0F, 9, 11, 2, 0F); // Import Box53
		bodyModel[52].setRotationPoint(-52F, -4F, -14F);

		bodyModel[53].addShapeBox(0F, -38F, 0F, 9, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0.54F); // Import Box54
		bodyModel[53].setRotationPoint(-52F, -26F, -8F);

		bodyModel[54].addShapeBox(0F, -38F, 0F, 9, 20, 2, 0F, -7F, 0F, -5.45F, 0F, 0F, -5.45F, 0F, 0F, 5.45F, -7F, 0F, 5.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[54].setRotationPoint(-52F, -24F, -14F);

		bodyModel[55].addShapeBox(0F, -38F, 0F, 9, 20, 2, 0F, -7F, 0F, 5.45F, 0F, 0F, 5.45F, 0F, 0F, -5.45F, -7F, 0F, -5.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[55].setRotationPoint(-52F, -24F, 12F);

		bodyModel[56].addShapeBox(0F, -38F, 0F, 17, 5, 2, 0F, 0F, 2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[56].setRotationPoint(-69F, 2F, 12F);

		bodyModel[57].addBox(0F, -38F, 0F, 9, 11, 2, 0F); // Import Box58
		bodyModel[57].setRotationPoint(-52F, -4F, 12F);

		bodyModel[58].addShapeBox(0F, -38F, 0F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[58].setRotationPoint(-71F, -21F, -8F);

		bodyModel[59].addShapeBox(0F, -38F, 0F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box60
		bodyModel[59].setRotationPoint(-71F, -21F, 6F);

		bodyModel[60].addBox(0F, -38F, 0F, 26, 8, 24, 0F); // Import Box61
		bodyModel[60].setRotationPoint(-69F, 13F, -12F);

		bodyModel[61].addBox(0F, -38F, 0F, 2, 17, 24, 0F); // Import Box62
		bodyModel[61].setRotationPoint(-69F, -4F, -12F);

		bodyModel[62].addShapeBox(0F, -38F, 0F, 2, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box63
		bodyModel[62].setRotationPoint(-69F, -8F, -7F);

		bodyModel[63].addBox(0F, -38F, 0F, 4, 23, 20, 0F); // Import Box64
		bodyModel[63].setRotationPoint(-47F, -10F, -10F);

		bodyModel[64].addBox(0F, -38F, 0F, 4, 8, 12, 0F); // Import Box65
		bodyModel[64].setRotationPoint(-50F, -16F, -6F);

		bodyModel[65].addShapeBox(0F, -38F, 0F, 2, 8, 12, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		bodyModel[65].setRotationPoint(-46F, -16F, -6F);

		bodyModel[66].addShapeBox(0F, -38F, 0F, 4, 23, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		bodyModel[66].setRotationPoint(-51F, -10F, -10F);

		bodyModel[67].addShapeBox(0F, -38F, 0F, 4, 23, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[67].setRotationPoint(-51F, -10F, 6F);

		bodyModel[68].addBox(0F, -38F, 0F, 1, 12, 10, 0F); // Import Box70
		bodyModel[68].setRotationPoint(-48F, -6F, -5F);

		bodyModel[69].addBox(0F, -38F, 0F, 12, 4, 10, 0F); // Import Box71
		bodyModel[69].setRotationPoint(-59F, 7F, -5F);

		bodyModel[70].addBox(0F, -38F, 0F, 1, 6, 6, 0F); // Import Box72
		bodyModel[70].setRotationPoint(-67F, -7F, -7F);

		bodyModel[71].addBox(0F, -38F, 0F, 1, 6, 6, 0F); // Import Box73
		bodyModel[71].setRotationPoint(-67F, -7F, 1F);

		bodyModel[72].addShapeBox(0F, -38F, 0F, 4, 14, 6, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[72].setRotationPoint(-67F, -1F, -3F);

		bodyModel[73].addBox(0F, -38F, 0F, 4, 8, 4, 0F); // Import Box75
		bodyModel[73].setRotationPoint(-67F, 5F, -2F);

		bodyModel[74].addBox(-6F, -38F, 0F, 2, 13, 2, 0F); // Import Box76
		bodyModel[74].setRotationPoint(-64F, -1F, -1F);
		bodyModel[74].rotateAngleZ = -0.19198622F;

		bodyModel[75].addShapeBox(0F, -38F, 0F, 23, 14, 8, 0F, 0F, 0F, 0F, 0F, 4F, 3F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[75].setRotationPoint(-103F, 9F, -22F);

		bodyModel[76].addShapeBox(0F, -38F, 0F, 8, 14, 8, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		bodyModel[76].setRotationPoint(-111F, 9F, -22F);

		bodyModel[77].addShapeBox(0F, -38F, 0F, 4, 12, 6, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box79
		bodyModel[77].setRotationPoint(-115F, 11F, -20F);

		bodyModel[78].addShapeBox(0F, -38F, 0F, 34, 18, 11, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		bodyModel[78].setRotationPoint(-80F, 5F, -25F);

		bodyModel[79].addShapeBox(0F, -38F, 0F, 23, 14, 8, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F); // Import Box81
		bodyModel[79].setRotationPoint(-103F, 9F, 14F);

		bodyModel[80].addShapeBox(0F, -38F, 0F, 34, 18, 11, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		bodyModel[80].setRotationPoint(-80F, 5F, 14F);

		bodyModel[81].addShapeBox(0F, -38F, 0F, 8, 14, 8, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box83
		bodyModel[81].setRotationPoint(-111F, 9F, 14F);

		bodyModel[82].addShapeBox(0F, -38F, 0F, 4, 12, 6, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Import Box84
		bodyModel[82].setRotationPoint(-115F, 11F, 14F);

		bodyModel[83].addBox(0F, -38F, 0F, 74, 27, 28, 0F); // Import Box85
		bodyModel[83].setRotationPoint(-43F, -4F, -14F);

		bodyModel[84].addShapeBox(0F, -38F, 0F, 8, 22, 28, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		bodyModel[84].setRotationPoint(-43F, -26F, -14F);

		bodyModel[85].addBox(0F, -38F, 0F, 35, 22, 11, 0F); // Import Box87
		bodyModel[85].setRotationPoint(-46F, 1F, -25F);

		bodyModel[86].addBox(0F, -38F, 0F, 35, 22, 11, 0F); // Import Box88
		bodyModel[86].setRotationPoint(-46F, 1F, 14F);

		bodyModel[87].addShapeBox(0F, -38F, 0F, 5, 6, 8, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box89
		bodyModel[87].setRotationPoint(-50F, -32F, -4F);

		bodyModel[88].addShapeBox(0F, -38F, 0F, 12, 6, 26, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Import Box90
		bodyModel[88].setRotationPoint(-45F, -32F, -13F);

		bodyModel[89].addBox(0F, -38F, 0F, 36, 22, 28, 0F); // Import Box91
		bodyModel[89].setRotationPoint(-35F, -26F, -14F);

		bodyModel[90].addBox(0F, -38F, 0F, 34, 6, 26, 0F); // Import Box92
		bodyModel[90].setRotationPoint(-33F, -32F, -13F);

		bodyModel[91].addShapeBox(0F, -38F, 0F, 17, 18, 11, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box93
		bodyModel[91].setRotationPoint(-11F, 4F, 14F);

		bodyModel[92].addShapeBox(0F, -38F, 0F, 17, 18, 11, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box94
		bodyModel[92].setRotationPoint(6F, 4F, 14F);

		bodyModel[93].addShapeBox(0F, -38F, 0F, 17, 18, 11, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box95
		bodyModel[93].setRotationPoint(-11F, 4F, -25F);

		bodyModel[94].addShapeBox(0F, -38F, 0F, 17, 18, 11, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box96
		bodyModel[94].setRotationPoint(6F, 4F, -25F);

		bodyModel[95].addShapeBox(0F, -38F, 0F, 30, 22, 28, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		bodyModel[95].setRotationPoint(1F, -26F, -14F);

		bodyModel[96].addShapeBox(0F, -38F, 0F, 30, 6, 26, 0F, 0F, 0F, 0F, 0F, -8F, -5F, 0F, -8F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -5F, 0F, 5F, -5F, 0F, 0F, 0F); // Import Box98
		bodyModel[96].setRotationPoint(1F, -32F, -13F);

		bodyModel[97].addBox(0F, -38F, 0F, 42, 15, 19, 0F); // Import Box99
		bodyModel[97].setRotationPoint(-6F, -22F, -33F);

		bodyModel[98].addShapeBox(0F, -38F, 0F, 42, 2, 19, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		bodyModel[98].setRotationPoint(-6F, -24F, -33F);

		bodyModel[99].addShapeBox(0F, -38F, 0F, 42, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box101
		bodyModel[99].setRotationPoint(-6F, -7F, -33F);

		bodyModel[100].addBox(0F, -38F, 0F, 9, 4, 8, 0F); // Import Box102
		bodyModel[100].setRotationPoint(-15F, -16.5F, -27.5F);

		bodyModel[101].addShapeBox(0F, -38F, 0F, 9, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		bodyModel[101].setRotationPoint(-15F, -18.5F, -27.5F);

		bodyModel[102].addShapeBox(0F, -38F, 0F, 9, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box104
		bodyModel[102].setRotationPoint(-15F, -12.5F, -27.5F);

		bodyModel[103].addShapeBox(0F, -38F, 0F, 15, 15, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box105
		bodyModel[103].setRotationPoint(36F, -22F, -33F);

		bodyModel[104].addShapeBox(0F, -38F, 0F, 15, 15, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[104].setRotationPoint(36F, -22F, -16F);

		bodyModel[105].addShapeBox(0F, -38F, 0F, 15, 2, 19, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box107
		bodyModel[105].setRotationPoint(36F, -24F, -33F);

		bodyModel[106].addShapeBox(0F, -38F, 0F, 15, 2, 19, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box108
		bodyModel[106].setRotationPoint(36F, -7F, -33F);

		bodyModel[107].addShapeBox(0F, -38F, 0F, 15, 15, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box109
		bodyModel[107].setRotationPoint(36F, -22F, -22F);

		bodyModel[108].addShapeBox(0F, -38F, 0F, 15, 15, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box110
		bodyModel[108].setRotationPoint(36F, -22F, -27F);

		bodyModel[109].addShapeBox(0F, -38F, 0F, 42, 2, 19, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		bodyModel[109].setRotationPoint(-6F, -24F, 14F);

		bodyModel[110].addBox(0F, -38F, 0F, 42, 15, 19, 0F); // Import Box112
		bodyModel[110].setRotationPoint(-6F, -22F, 14F);

		bodyModel[111].addShapeBox(0F, -38F, 0F, 42, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box113
		bodyModel[111].setRotationPoint(-6F, -7F, 14F);

		bodyModel[112].addShapeBox(0F, -38F, 0F, 9, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box114
		bodyModel[112].setRotationPoint(-15F, -12.5F, 19.5F);

		bodyModel[113].addBox(0F, -38F, 0F, 9, 4, 8, 0F); // Import Box115
		bodyModel[113].setRotationPoint(-15F, -16.5F, 19.5F);

		bodyModel[114].addShapeBox(0F, -38F, 0F, 9, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		bodyModel[114].setRotationPoint(-15F, -18.5F, 19.5F);

		bodyModel[115].addShapeBox(0F, -38F, 0F, 15, 15, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box117
		bodyModel[115].setRotationPoint(36F, -22F, 31F);

		bodyModel[116].addShapeBox(0F, -38F, 0F, 15, 2, 19, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box118
		bodyModel[116].setRotationPoint(36F, -24F, 14F);

		bodyModel[117].addShapeBox(0F, -38F, 0F, 15, 2, 19, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box119
		bodyModel[117].setRotationPoint(36F, -7F, 14F);

		bodyModel[118].addShapeBox(0F, -38F, 0F, 15, 15, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box120
		bodyModel[118].setRotationPoint(36F, -22F, 14F);

		bodyModel[119].addShapeBox(0F, -38F, 0F, 15, 15, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box121
		bodyModel[119].setRotationPoint(36F, -22F, 20F);

		bodyModel[120].addShapeBox(0F, -38F, 0F, 15, 15, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box122
		bodyModel[120].setRotationPoint(36F, -22F, 25F);

		bodyModel[121].addShapeBox(0F, -38F, 0F, 58, 21, 28, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Import Box123
		bodyModel[121].setRotationPoint(31F, 2F, -14F);

		bodyModel[122].addShapeBox(0F, -38F, 0F, 58, 17, 28, 0F, 0F, 0F, 0F, 0F, -22F, -2F, 0F, -22F, -2F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 6F, 0F); // Import Box124
		bodyModel[122].setRotationPoint(31F, -21F, -14F);

		bodyModel[123].addShapeBox(0F, -38F, 0F, 30, 6, 16, 0F, 0F, 0F, 0F, 0F, -12F, -5F, 0F, -12F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -5F, 0F, 10F, -5F, 0F, 0F, 0F); // Import Box125
		bodyModel[123].setRotationPoint(31F, -24F, -8F);

		bodyModel[124].addBox(0F, -38F, 0F, 9, 6, 13, 0F); // Import Box126
		bodyModel[124].setRotationPoint(-4.5F, -36F, -6.5F);

		bodyModel[125].addShapeBox(0F, -38F, 0F, 2, 6, 13, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box127
		bodyModel[125].setRotationPoint(-6.5F, -36F, -6.5F);

		bodyModel[126].addShapeBox(0F, -38F, 0F, 2, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box128
		bodyModel[126].setRotationPoint(4.5F, -36F, -6.5F);

		bodyModel[127].addBox(0F, -38F, 0F, 4, 17, 2, 0F); // Import Box129
		bodyModel[127].setRotationPoint(-2F, -53F, -1F);

		bodyModel[128].addShapeBox(0F, -38F, 0F, 4, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box130
		bodyModel[128].setRotationPoint(-2F, -53F, 1F);

		bodyModel[129].addShapeBox(0F, -38F, 0F, 4, 17, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		bodyModel[129].setRotationPoint(-2F, -53F, -2F);

		bodyModel[130].addBox(0F, -38F, 0F, 7, 10, 3, 0F); // Import Box132
		bodyModel[130].setRotationPoint(-3.5F, -63F, -1.5F);

		bodyModel[131].addShapeBox(0F, -38F, 0F, 7, 10, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[131].setRotationPoint(-3.5F, -63F, -3.5F);

		bodyModel[132].addShapeBox(0F, -38F, 0F, 7, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box134
		bodyModel[132].setRotationPoint(-3.5F, -63F, 1.5F);

		bodyModel[133].addBox(0F, -38F, 0F, 33, 11, 11, 0F); // Import Box135
		bodyModel[133].setRotationPoint(-16.5F, -74F, -5.5F);

		bodyModel[134].addShapeBox(0F, -38F, 0F, 33, 11, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F); // Import Box136
		bodyModel[134].setRotationPoint(-16.5F, -74F, 5.5F);

		bodyModel[135].addShapeBox(0F, -38F, 0F, 33, 11, 11, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		bodyModel[135].setRotationPoint(-16.5F, -74F, -16.5F);

		bodyModel[136].addShapeBox(0F, -38F, 0F, 4, 8, 2, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		bodyModel[136].setRotationPoint(38F, 22F, -1F);

		bodyModel[137].addShapeBox(0F, -38F, 0F, 28, 4, 10, 0F, 5F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		bodyModel[137].setRotationPoint(47F, 20F, -5F);

		bodyModel[138].addShapeBox(0F, -38F, 0F, 20, 4, 10, 0F, 0F, 0F, 4F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box161
		bodyModel[138].setRotationPoint(75F, 20F, -5F);

		bodyModel[139].addBox(-10F, 0F, -1F, 20, 1, 2, 0F); // Import Box138
		bodyModel[139].setRotationPoint(0F, -77F, 0F);

		bodyModel[140].addBox(-10F, 0F, -1F, 20, 1, 2, 0F); // Import Box139
		bodyModel[140].setRotationPoint(0F, -77F, 0F);
		bodyModel[140].rotateAngleY = -1.57079633F;

		bodyModel[141].addBox(-10F, -7F, -1F, 1, 7, 2, 0F); // Import Box140
		bodyModel[141].setRotationPoint(0F, -77F, 0F);
		bodyModel[141].rotateAngleY = -1.57079633F;

		bodyModel[142].addBox(9F, -7F, -1F, 1, 7, 2, 0F); // Import Box141
		bodyModel[142].setRotationPoint(0F, -77F, 0F);
		bodyModel[142].rotateAngleY = -1.57079633F;

		bodyModel[143].addBox(9F, -7F, -1F, 1, 7, 2, 0F); // Import Box142
		bodyModel[143].setRotationPoint(0F, -77F, 0F);

		bodyModel[144].addBox(-10F, -7F, -1F, 1, 7, 2, 0F); // Import Box143
		bodyModel[144].setRotationPoint(0F, -77F, 0F);

		bodyModel[145].addShapeBox(1F, -13F, -4F, 16, 6, 8, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box144
		bodyModel[145].setRotationPoint(0F, -77F, 0F);

		bodyModel[146].addShapeBox(17F, -9F, -3F, 130, 2, 6, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		bodyModel[146].setRotationPoint(0F, -77F, 0F);

		bodyModel[147].addShapeBox(17F, -9F, -3F, 130, 2, 6, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[147].setRotationPoint(0F, -77F, 0F);
		bodyModel[147].rotateAngleY = -1.57079633F;

		bodyModel[148].addShapeBox(1F, -13F, -4F, 16, 6, 8, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box147
		bodyModel[148].setRotationPoint(0F, -77F, 0F);
		bodyModel[148].rotateAngleY = -1.57079633F;

		bodyModel[149].addShapeBox(17F, -9F, -3F, 130, 2, 6, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		bodyModel[149].setRotationPoint(0F, -77F, 0F);
		bodyModel[149].rotateAngleY = -3.14159265F;

		bodyModel[150].addShapeBox(1F, -13F, -4F, 16, 6, 8, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box149
		bodyModel[150].setRotationPoint(0F, -77F, 0F);
		bodyModel[150].rotateAngleY = -3.14159265F;

		bodyModel[151].addShapeBox(17F, -9F, -3F, 130, 2, 6, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		bodyModel[151].setRotationPoint(0F, -77F, 0F);
		bodyModel[151].rotateAngleY = 1.57079633F;

		bodyModel[152].addShapeBox(1F, -13F, -4F, 16, 6, 8, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box151
		bodyModel[152].setRotationPoint(0F, -77F, 0F);
		bodyModel[152].rotateAngleY = 1.57079633F;

		bodyModel[153].addShapeBox(17F, -9F, -9F, 124, 2, 6, 0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		bodyModel[153].setRotationPoint(0F, -77F, 0F);
		bodyModel[153].rotateAngleY = -3.14159265F;

		bodyModel[154].addShapeBox(17F, -9F, -9F, 124, 2, 6, 0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box153
		bodyModel[154].setRotationPoint(0F, -77F, 0F);
		bodyModel[154].rotateAngleY = -1.57079633F;

		bodyModel[155].addShapeBox(17F, -9F, -9F, 124, 2, 6, 0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		bodyModel[155].setRotationPoint(0F, -77F, 0F);

		bodyModel[156].addShapeBox(17F, -9F, -9F, 124, 2, 6, 0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box155
		bodyModel[156].setRotationPoint(0F, -77F, 0F);
		bodyModel[156].rotateAngleY = 1.57079633F;

		bodyModel[157].addBox(-2F, -2F, -12F, 4, 4, 16, 0F); // Import Box172
		bodyModel[157].setRotationPoint(195F, -89F, -13F);

		bodyModel[158].addBox(-1F, -10F, -12F, 2, 8, 2, 0F); // Import Box173
		bodyModel[158].setRotationPoint(195F, -89F, -13F);

		bodyModel[159].addBox(-1F, -35F, -12F, 4, 25, 2, 0F); // Import Box174
		bodyModel[159].setRotationPoint(195F, -89F, -13F);

		bodyModel[160].addBox(-1F, 2F, -12F, 2, 8, 2, 0F); // Import Box175
		bodyModel[160].setRotationPoint(195F, -89F, -13F);

		bodyModel[161].addBox(-1F, 10F, -12F, 4, 25, 2, 0F); // Import Box176
		bodyModel[161].setRotationPoint(195F, -89F, -13F);

		bodyModel[162].addBox(2F, -1F, -8F, 8, 2, 2, 0F); // Import Box177
		bodyModel[162].setRotationPoint(195F, -89F, -13F);

		bodyModel[163].addBox(10F, -1F, -8F, 25, 4, 2, 0F); // Import Box178
		bodyModel[163].setRotationPoint(195F, -89F, -13F);

		bodyModel[164].addBox(-10F, -1F, -8F, 8, 2, 2, 0F); // Import Box179
		bodyModel[164].setRotationPoint(195F, -89F, -13F);

		bodyModel[165].addBox(-35F, -3F, -8F, 25, 4, 2, 0F); // Import Box180
		bodyModel[165].setRotationPoint(195F, -89F, -13F);

		bodyModel[166].addBox(-5F, 0F, -5F, 10, 2, 10, 0F); // Import Box287
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addShapeBox(-1F, 2F, -5F, 5, 10, 2, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box288
		bodyModel[167].setRotationPoint(0F, 0F, 0F);

		bodyModel[168].addShapeBox(-1F, 2F, 3F, 5, 10, 2, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F); // Import Box289
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(-5F, 2F, -2F, 10, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box295
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addBox(-3F, -3F, -3F, 5, 6, 6, 0F); // Import Box290
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(-6F, -3F, -3F, 3, 6, 6, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box291
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(2F, -3F, -3F, 10, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Import Box292
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(12F, 0F, -1F, 15, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box293
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addBox(27F, 0F, -1F, 5, 2, 2, 0F); // Import Box294
		bodyModel[174].setRotationPoint(0F, 0F, 0F);


		tailModel = new ModelRendererTurbo[15];
		tailModel[0] = new ModelRendererTurbo(this, 200, 365, textureX, textureY); // Import Box156
		tailModel[1] = new ModelRendererTurbo(this, 200, 435, textureX, textureY); // Import Box157
		tailModel[2] = new ModelRendererTurbo(this, 200, 460, textureX, textureY); // Import Box158
		tailModel[3] = new ModelRendererTurbo(this, 200, 475, textureX, textureY); // Import Box162
		tailModel[4] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Box163
		tailModel[5] = new ModelRendererTurbo(this, 200, 550, textureX, textureY); // Import Box164
		tailModel[6] = new ModelRendererTurbo(this, 200, 580, textureX, textureY); // Import Box165
		tailModel[7] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Import Box166
		tailModel[8] = new ModelRendererTurbo(this, 200, 675, textureX, textureY); // Import Box167
		tailModel[9] = new ModelRendererTurbo(this, 200, 712, textureX, textureY); // Import Box168
		tailModel[10] = new ModelRendererTurbo(this, 200, 712, textureX, textureY); // Import Box169
		tailModel[11] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Import Box170
		tailModel[12] = new ModelRendererTurbo(this, 200, 675, textureX, textureY); // Import Box171
		tailModel[13] = new ModelRendererTurbo(this, 200, 405, textureX, textureY); // Import Box263
		tailModel[14] = new ModelRendererTurbo(this, 200, 405, textureX, textureY); // Import Box264

		tailModel[0].addShapeBox(0F, -38F, 0F, 108, 14, 24, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, 0F); // Import Box156
		tailModel[0].setRotationPoint(89F, 3F, -12F);

		tailModel[1].addShapeBox(0F, -38F, 0F, 109, 6, 12, 0F, 0F, 4F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box157
		tailModel[1].setRotationPoint(63F, -5F, -6F);

		tailModel[2].addShapeBox(0F, -38F, 0F, 25, 6, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		tailModel[2].setRotationPoint(172F, -5F, -3F);

		tailModel[3].addShapeBox(0F, -38F, 0F, 25, 63, 2, 0F, -15F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		tailModel[3].setRotationPoint(172F, -68F, -1F);

		tailModel[4].addBox(0F, -38F, 0F, 11, 15, 9, 0F); // Import Box163
		tailModel[4].setRotationPoint(189F, -60F, -9F);

		tailModel[5].addShapeBox(0F, -38F, 0F, 8, 15, 9, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Box164
		tailModel[5].setRotationPoint(181F, -60F, -9F);

		tailModel[6].addShapeBox(0F, -38F, 0F, 8, 15, 9, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box165
		tailModel[6].setRotationPoint(200F, -60F, -9F);

		tailModel[7].addBox(0F, -38F, 0F, 15, 3, 32, 0F); // Import Box166
		tailModel[7].setRotationPoint(190F, -8F, 1F);

		tailModel[8].addShapeBox(0F, -38F, 0F, 6, 3, 32, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		tailModel[8].setRotationPoint(205F, -8F, 1F);

		tailModel[9].addShapeBox(0F, -38F, 0F, 2, 3, 32, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box168
		tailModel[9].setRotationPoint(188F, -8F, 1F);

		tailModel[10].addShapeBox(0F, -38F, 0F, 2, 3, 32, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F); // Import Box169
		tailModel[10].setRotationPoint(188F, -8F, -33F);

		tailModel[11].addBox(0F, -38F, 0F, 15, 3, 32, 0F); // Import Box170
		tailModel[11].setRotationPoint(190F, -8F, -33F);

		tailModel[12].addShapeBox(0F, -38F, 0F, 6, 3, 32, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		tailModel[12].setRotationPoint(205F, -8F, -33F);

		tailModel[13].addShapeBox(0F, -38F, 0F, 108, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Import Box263
		tailModel[13].setRotationPoint(89F, 1F, -12F);

		tailModel[14].addShapeBox(0F, -38F, 0F, 108, 2, 24, 0F, 0F, 0F, 0F, 0F, 5F, -7F, 0F, 5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -9F, 0F, -5F, -9F, 0F, 0F, 0F); // Import Box264
		tailModel[14].setRotationPoint(89F, 17F, -12F);


		leftWingModel = new ModelRendererTurbo[41];
		leftWingModel[0] = new ModelRendererTurbo(this, 200, 750, textureX, textureY); // Import ImportBox181
		leftWingModel[1] = new ModelRendererTurbo(this, 200, 805, textureX, textureY); // Import ImportBox182
		leftWingModel[2] = new ModelRendererTurbo(this, 200, 860, textureX, textureY); // Import ImportBox183
		leftWingModel[3] = new ModelRendererTurbo(this, 200, 915, textureX, textureY); // Import ImportBox184
		leftWingModel[4] = new ModelRendererTurbo(this, 200, 935, textureX, textureY); // Import ImportBox185
		leftWingModel[5] = new ModelRendererTurbo(this, 200, 935, textureX, textureY); // Import ImportBox186
		leftWingModel[6] = new ModelRendererTurbo(this, 200, 935, textureX, textureY); // Import ImportBox187
		leftWingModel[7] = new ModelRendererTurbo(this, 200, 915, textureX, textureY); // Import ImportBox188
		leftWingModel[8] = new ModelRendererTurbo(this, 200, 935, textureX, textureY); // Import ImportBox189
		leftWingModel[9] = new ModelRendererTurbo(this, 200, 950, textureX, textureY); // Import ImportBox190
		leftWingModel[10] = new ModelRendererTurbo(this, 200, 970, textureX, textureY); // Import ImportBox191
		leftWingModel[11] = new ModelRendererTurbo(this, 200, 970, textureX, textureY); // Import ImportBox192
		leftWingModel[12] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import ImportBox193
		leftWingModel[13] = new ModelRendererTurbo(this, 200, 995, textureX, textureY); // Import ImportBox194
		leftWingModel[14] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox195
		leftWingModel[15] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox196
		leftWingModel[16] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox197
		leftWingModel[17] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox198
		leftWingModel[18] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox199
		leftWingModel[19] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox200
		leftWingModel[20] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox201
		leftWingModel[21] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox202
		leftWingModel[22] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import ImportBox203
		leftWingModel[23] = new ModelRendererTurbo(this, 200, 995, textureX, textureY); // Import ImportBox204
		leftWingModel[24] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox205
		leftWingModel[25] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox206
		leftWingModel[26] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox207
		leftWingModel[27] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox208
		leftWingModel[28] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import ImportBox209
		leftWingModel[29] = new ModelRendererTurbo(this, 200, 995, textureX, textureY); // Import ImportBox210
		leftWingModel[30] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import ImportBox211
		leftWingModel[31] = new ModelRendererTurbo(this, 200, 995, textureX, textureY); // Import ImportBox212
		leftWingModel[32] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox213
		leftWingModel[33] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox214
		leftWingModel[34] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox215
		leftWingModel[35] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import ImportBox216
		leftWingModel[36] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import ImportBox217
		leftWingModel[37] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import ImportBox218
		leftWingModel[38] = new ModelRendererTurbo(this, 200, 1035, textureX, textureY); // Import ImportBox219
		leftWingModel[39] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import ImportBox220
		leftWingModel[40] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import ImportBox221

		leftWingModel[0].addShapeBox(0F, -38F, 0F, 21, 5, 45, 0F, -1F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox181
		leftWingModel[0].setRotationPoint(-33F, -4F, -59F);

		leftWingModel[1].addShapeBox(0F, -38F, 0F, 2, 5, 45, 0F, -1F, -3F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox182
		leftWingModel[1].setRotationPoint(-35F, -4F, -59F);

		leftWingModel[2].addShapeBox(0F, -38F, 0F, 11, 5, 45, 0F, 2F, -2F, 0F, -11F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox183
		leftWingModel[2].setRotationPoint(-12F, -4F, -59F);

		leftWingModel[3].addBox(0F, -38F, 0F, 13, 10, 4, 0F); // Import ImportBox184
		leftWingModel[3].setRotationPoint(-30F, 1F, -37F);

		leftWingModel[4].addShapeBox(0F, -38F, 0F, 1, 10, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox185
		leftWingModel[4].setRotationPoint(-31F, 1F, -37F);

		leftWingModel[5].addShapeBox(0F, -38F, 0F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox186
		leftWingModel[5].setRotationPoint(-17F, 1F, -37F);

		leftWingModel[6].addShapeBox(0F, -38F, 0F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox187
		leftWingModel[6].setRotationPoint(-17F, 1F, -57F);

		leftWingModel[7].addBox(0F, -38F, 0F, 13, 10, 4, 0F); // Import ImportBox188
		leftWingModel[7].setRotationPoint(-30F, 1F, -57F);

		leftWingModel[8].addShapeBox(0F, -38F, 0F, 1, 10, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox189
		leftWingModel[8].setRotationPoint(-31F, 1F, -57F);

		leftWingModel[9].addBox(0F, -38F, 0F, 13, 14, 2, 0F); // Import ImportBox190
		leftWingModel[9].setRotationPoint(-30F, 11F, -56F);

		leftWingModel[10].addShapeBox(0F, -38F, 0F, 11, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox191
		leftWingModel[10].setRotationPoint(-29F, 11F, -60F);

		leftWingModel[11].addShapeBox(0F, -38F, 0F, 11, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox192
		leftWingModel[11].setRotationPoint(-29F, 23.1F, -60F);

		leftWingModel[12].addBox(0F, -38F, 0F, 31, 4, 4, 0F); // Import ImportBox193
		leftWingModel[12].setRotationPoint(-38F, 13F, -61F);

		leftWingModel[13].addTrapezoid(0F, -38F, 0F, 5, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import ImportBox194
		leftWingModel[13].setRotationPoint(-43F, 13F, -61F);

		leftWingModel[14].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox195
		leftWingModel[14].setRotationPoint(-7F, -23F, -59F);
		leftWingModel[14].rotateAngleX = 0.78539816F;

		leftWingModel[15].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox196
		leftWingModel[15].setRotationPoint(-7F, -23F, -59F);
		leftWingModel[15].rotateAngleX = 2.35619449F;

		leftWingModel[16].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox197
		leftWingModel[16].setRotationPoint(-7F, -23F, -59F);
		leftWingModel[16].rotateAngleX = -2.35619449F;

		leftWingModel[17].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox198
		leftWingModel[17].setRotationPoint(-7F, -23F, -59F);
		leftWingModel[17].rotateAngleX = -0.78539816F;

		leftWingModel[18].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox199
		leftWingModel[18].setRotationPoint(-7F, -23F, -51F);
		leftWingModel[18].rotateAngleX = -0.78539816F;

		leftWingModel[19].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox200
		leftWingModel[19].setRotationPoint(-7F, -23F, -51F);
		leftWingModel[19].rotateAngleX = 2.35619449F;

		leftWingModel[20].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox201
		leftWingModel[20].setRotationPoint(-7F, -23F, -51F);
		leftWingModel[20].rotateAngleX = -2.35619449F;

		leftWingModel[21].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox202
		leftWingModel[21].setRotationPoint(-7F, -23F, -51F);
		leftWingModel[21].rotateAngleX = 0.78539816F;

		leftWingModel[22].addBox(0F, -38F, 0F, 31, 4, 4, 0F); // Import ImportBox203
		leftWingModel[22].setRotationPoint(-38F, 13F, -53F);

		leftWingModel[23].addTrapezoid(0F, -38F, 0F, 5, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import ImportBox204
		leftWingModel[23].setRotationPoint(-43F, 13F, -53F);

		leftWingModel[24].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox205
		leftWingModel[24].setRotationPoint(-7F, -11F, -51F);
		leftWingModel[24].rotateAngleX = -0.78539816F;

		leftWingModel[25].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox206
		leftWingModel[25].setRotationPoint(-7F, -11F, -51F);
		leftWingModel[25].rotateAngleX = 2.35619449F;

		leftWingModel[26].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox207
		leftWingModel[26].setRotationPoint(-7F, -11F, -51F);
		leftWingModel[26].rotateAngleX = -2.35619449F;

		leftWingModel[27].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox208
		leftWingModel[27].setRotationPoint(-7F, -11F, -51F);
		leftWingModel[27].rotateAngleX = 0.78539816F;

		leftWingModel[28].addBox(0F, -38F, 0F, 31, 4, 4, 0F); // Import ImportBox209
		leftWingModel[28].setRotationPoint(-38F, 25F, -53F);

		leftWingModel[29].addTrapezoid(0F, -38F, 0F, 5, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import ImportBox210
		leftWingModel[29].setRotationPoint(-43F, 25F, -53F);

		leftWingModel[30].addBox(0F, -38F, 0F, 31, 4, 4, 0F); // Import ImportBox211
		leftWingModel[30].setRotationPoint(-38F, 25F, -61F);

		leftWingModel[31].addTrapezoid(0F, -38F, 0F, 5, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import ImportBox212
		leftWingModel[31].setRotationPoint(-43F, 25F, -61F);

		leftWingModel[32].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox213
		leftWingModel[32].setRotationPoint(-7F, -11F, -59F);
		leftWingModel[32].rotateAngleX = 0.78539816F;

		leftWingModel[33].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox214
		leftWingModel[33].setRotationPoint(-7F, -11F, -59F);
		leftWingModel[33].rotateAngleX = -2.35619449F;

		leftWingModel[34].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox215
		leftWingModel[34].setRotationPoint(-7F, -11F, -59F);
		leftWingModel[34].rotateAngleX = 2.35619449F;

		leftWingModel[35].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox216
		leftWingModel[35].setRotationPoint(-7F, -11F, -59F);
		leftWingModel[35].rotateAngleX = -0.78539816F;

		leftWingModel[36].addShapeBox(0F, -38F, 0F, 35, 1, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox217
		leftWingModel[36].setRotationPoint(-40F, 11F, -38.5F);

		leftWingModel[37].addShapeBox(0F, -38F, 0F, 35, 2, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox218
		leftWingModel[37].setRotationPoint(-40F, 12F, -39.5F);

		leftWingModel[38].addBox(0F, -38F, 0F, 35, 3, 9, 0F); // Import ImportBox219
		leftWingModel[38].setRotationPoint(-40F, 14F, -39.5F);

		leftWingModel[39].addShapeBox(0F, -38F, 0F, 35, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox220
		leftWingModel[39].setRotationPoint(-40F, 17F, -39.5F);

		leftWingModel[40].addShapeBox(0F, -38F, 0F, 35, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox221
		leftWingModel[40].setRotationPoint(-40F, 19F, -38.5F);


		rightWingModel = new ModelRendererTurbo[41];
		rightWingModel[0] = new ModelRendererTurbo(this, 200, 915, textureX, textureY); // Import Box0
		rightWingModel[1] = new ModelRendererTurbo(this, 200, 935, textureX, textureY); // Import Box1
		rightWingModel[2] = new ModelRendererTurbo(this, 200, 935, textureX, textureY); // Import Box2
		rightWingModel[3] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box3
		rightWingModel[4] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box4
		rightWingModel[5] = new ModelRendererTurbo(this, 200, 1035, textureX, textureY); // Import Box5
		rightWingModel[6] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box6
		rightWingModel[7] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box7
		rightWingModel[8] = new ModelRendererTurbo(this, 200, 750, textureX, textureY); // Import Box8
		rightWingModel[9] = new ModelRendererTurbo(this, 200, 805, textureX, textureY); // Import Box9
		rightWingModel[10] = new ModelRendererTurbo(this, 200, 860, textureX, textureY); // Import Box10
		rightWingModel[11] = new ModelRendererTurbo(this, 200, 935, textureX, textureY); // Import Box11
		rightWingModel[12] = new ModelRendererTurbo(this, 200, 915, textureX, textureY); // Import Box12
		rightWingModel[13] = new ModelRendererTurbo(this, 200, 935, textureX, textureY); // Import Box13
		rightWingModel[14] = new ModelRendererTurbo(this, 200, 950, textureX, textureY); // Import Box14
		rightWingModel[15] = new ModelRendererTurbo(this, 200, 970, textureX, textureY); // Import Box15
		rightWingModel[16] = new ModelRendererTurbo(this, 200, 970, textureX, textureY); // Import Box16
		rightWingModel[17] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import Box17
		rightWingModel[18] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box18
		rightWingModel[19] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box19
		rightWingModel[20] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box20
		rightWingModel[21] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box21
		rightWingModel[22] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box22
		rightWingModel[23] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import Box23
		rightWingModel[24] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box24
		rightWingModel[25] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box25
		rightWingModel[26] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box26
		rightWingModel[27] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box27
		rightWingModel[28] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box28
		rightWingModel[29] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box29
		rightWingModel[30] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box30
		rightWingModel[31] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import Box31
		rightWingModel[32] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box32
		rightWingModel[33] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box33
		rightWingModel[34] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box34
		rightWingModel[35] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import Box35
		rightWingModel[36] = new ModelRendererTurbo(this, 200, 1005, textureX, textureY); // Import Box36
		rightWingModel[37] = new ModelRendererTurbo(this, 200, 995, textureX, textureY); // Import Box37
		rightWingModel[38] = new ModelRendererTurbo(this, 200, 995, textureX, textureY); // Import Box38
		rightWingModel[39] = new ModelRendererTurbo(this, 200, 995, textureX, textureY); // Import Box39
		rightWingModel[40] = new ModelRendererTurbo(this, 200, 995, textureX, textureY); // Import Box40

		rightWingModel[0].addBox(0F, -38F, 0F, 13, 10, 4, 0F); // Import Box0
		rightWingModel[0].setRotationPoint(-30F, 1F, 33F);

		rightWingModel[1].addShapeBox(0F, -38F, 0F, 1, 10, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box1
		rightWingModel[1].setRotationPoint(-31F, 1F, 33F);

		rightWingModel[2].addShapeBox(0F, -38F, 0F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box2
		rightWingModel[2].setRotationPoint(-17F, 1F, 33F);

		rightWingModel[3].addShapeBox(0F, -38F, 0F, 35, 1, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		rightWingModel[3].setRotationPoint(-40F, 11F, 31.5F);

		rightWingModel[4].addShapeBox(0F, -38F, 0F, 35, 2, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		rightWingModel[4].setRotationPoint(-40F, 12F, 30.5F);

		rightWingModel[5].addBox(0F, -38F, 0F, 35, 3, 9, 0F); // Import Box5
		rightWingModel[5].setRotationPoint(-40F, 14F, 30.5F);

		rightWingModel[6].addShapeBox(0F, -38F, 0F, 35, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box6
		rightWingModel[6].setRotationPoint(-40F, 17F, 30.5F);

		rightWingModel[7].addShapeBox(0F, -38F, 0F, 35, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box7
		rightWingModel[7].setRotationPoint(-40F, 19F, 31.5F);

		rightWingModel[8].addShapeBox(0F, -38F, 0F, 21, 5, 45, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import Box8
		rightWingModel[8].setRotationPoint(-33F, -4F, 14F);

		rightWingModel[9].addShapeBox(0F, -38F, 0F, 2, 5, 45, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F); // Import Box9
		rightWingModel[9].setRotationPoint(-35F, -4F, 14F);

		rightWingModel[10].addShapeBox(0F, -38F, 0F, 11, 5, 45, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -11F, -4F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 2F, 0F, 0F); // Import Box10
		rightWingModel[10].setRotationPoint(-12F, -4F, 14F);

		rightWingModel[11].addShapeBox(0F, -38F, 0F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box11
		rightWingModel[11].setRotationPoint(-17F, 1F, 53F);

		rightWingModel[12].addBox(0F, -38F, 0F, 13, 10, 4, 0F); // Import Box12
		rightWingModel[12].setRotationPoint(-30F, 1F, 53F);

		rightWingModel[13].addShapeBox(0F, -38F, 0F, 1, 10, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box13
		rightWingModel[13].setRotationPoint(-31F, 1F, 53F);

		rightWingModel[14].addBox(0F, -38F, 0F, 13, 14, 2, 0F); // Import Box14
		rightWingModel[14].setRotationPoint(-30F, 11F, 54F);

		rightWingModel[15].addShapeBox(0F, -38F, 0F, 11, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		rightWingModel[15].setRotationPoint(-29F, 11F, 50F);

		rightWingModel[16].addShapeBox(0F, -38F, 0F, 11, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		rightWingModel[16].setRotationPoint(-29F, 23.1F, 50F);

		rightWingModel[17].addBox(0F, -38F, 0F, 31, 4, 4, 0F); // Import Box17
		rightWingModel[17].setRotationPoint(-38F, 13F, 49F);

		rightWingModel[18].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		rightWingModel[18].setRotationPoint(-7F, -23F, 51F);
		rightWingModel[18].rotateAngleX = -2.35619449F;

		rightWingModel[19].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box19
		rightWingModel[19].setRotationPoint(-7F, -23F, 51F);
		rightWingModel[19].rotateAngleX = 2.35619449F;

		rightWingModel[20].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box20
		rightWingModel[20].setRotationPoint(-7F, -23F, 51F);
		rightWingModel[20].rotateAngleX = 0.78539816F;

		rightWingModel[21].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box21
		rightWingModel[21].setRotationPoint(-7F, -23F, 51F);
		rightWingModel[21].rotateAngleX = -0.78539816F;

		rightWingModel[22].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box22
		rightWingModel[22].setRotationPoint(-7F, -23F, 59F);
		rightWingModel[22].rotateAngleX = -2.35619449F;

		rightWingModel[23].addBox(0F, -38F, 0F, 31, 4, 4, 0F); // Import Box23
		rightWingModel[23].setRotationPoint(-38F, 13F, 57F);

		rightWingModel[24].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box24
		rightWingModel[24].setRotationPoint(-7F, -23F, 59F);
		rightWingModel[24].rotateAngleX = -0.78539816F;

		rightWingModel[25].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box25
		rightWingModel[25].setRotationPoint(-7F, -23F, 59F);
		rightWingModel[25].rotateAngleX = 0.78539816F;

		rightWingModel[26].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box26
		rightWingModel[26].setRotationPoint(-7F, -23F, 59F);
		rightWingModel[26].rotateAngleX = 2.35619449F;

		rightWingModel[27].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box27
		rightWingModel[27].setRotationPoint(-7F, -11F, 59F);
		rightWingModel[27].rotateAngleX = 2.35619449F;

		rightWingModel[28].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box28
		rightWingModel[28].setRotationPoint(-7F, -11F, 59F);
		rightWingModel[28].rotateAngleX = 0.78539816F;

		rightWingModel[29].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box29
		rightWingModel[29].setRotationPoint(-7F, -11F, 59F);
		rightWingModel[29].rotateAngleX = -0.78539816F;

		rightWingModel[30].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box30
		rightWingModel[30].setRotationPoint(-7F, -11F, 59F);
		rightWingModel[30].rotateAngleX = -2.35619449F;

		rightWingModel[31].addBox(0F, -38F, 0F, 31, 4, 4, 0F); // Import Box31
		rightWingModel[31].setRotationPoint(-38F, 25F, 57F);

		rightWingModel[32].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box32
		rightWingModel[32].setRotationPoint(-7F, -11F, 51F);
		rightWingModel[32].rotateAngleX = -0.78539816F;

		rightWingModel[33].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box33
		rightWingModel[33].setRotationPoint(-7F, -11F, 51F);
		rightWingModel[33].rotateAngleX = 0.78539816F;

		rightWingModel[34].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box34
		rightWingModel[34].setRotationPoint(-7F, -11F, 51F);
		rightWingModel[34].rotateAngleX = 2.35619449F;

		rightWingModel[35].addBox(0F, -38F, 0F, 31, 4, 4, 0F); // Import Box35
		rightWingModel[35].setRotationPoint(-38F, 25F, 49F);

		rightWingModel[36].addShapeBox(-6F, -0.5F, 2F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box36
		rightWingModel[36].setRotationPoint(-7F, -11F, 51F);
		rightWingModel[36].rotateAngleX = -2.35619449F;

		rightWingModel[37].addTrapezoid(0F, -38F, 0F, 5, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box37
		rightWingModel[37].setRotationPoint(-43F, 25F, 49F);

		rightWingModel[38].addTrapezoid(0F, -38F, 0F, 5, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box38
		rightWingModel[38].setRotationPoint(-43F, 25F, 57F);

		rightWingModel[39].addTrapezoid(0F, -38F, 0F, 5, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box39
		rightWingModel[39].setRotationPoint(-43F, 13F, 57F);

		rightWingModel[40].addTrapezoid(0F, -38F, 0F, 5, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box40
		rightWingModel[40].setRotationPoint(-43F, 13F, 49F);


		tailWheelModel = new ModelRendererTurbo[6];
		tailWheelModel[0] = new ModelRendererTurbo(this, 200, 1050, textureX, textureY); // Import Box280
		tailWheelModel[1] = new ModelRendererTurbo(this, 200, 1065, textureX, textureY); // Import Box281
		tailWheelModel[2] = new ModelRendererTurbo(this, 200, 1060, textureX, textureY); // Import Box282
		tailWheelModel[3] = new ModelRendererTurbo(this, 200, 1080, textureX, textureY); // Import Box283
		tailWheelModel[4] = new ModelRendererTurbo(this, 200, 1090, textureX, textureY); // Import Box284
		tailWheelModel[5] = new ModelRendererTurbo(this, 200, 1100, textureX, textureY); // Import Box285

		tailWheelModel[0].addBox(0F, -38F, 0F, 15, 4, 4, 0F); // Import Box280
		tailWheelModel[0].setRotationPoint(197F, 8F, -2F);

		tailWheelModel[1].addBox(0F, -38F, 0F, 2, 7, 2, 0F); // Import Box281
		tailWheelModel[1].setRotationPoint(210F, 12F, -1F);

		tailWheelModel[2].addShapeBox(0F, -38F, 0F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Import Box282
		tailWheelModel[2].setRotationPoint(197F, 12F, -1F);

		tailWheelModel[3].addBox(0F, -38F, 0F, 9, 3, 4, 0F); // Import Box283
		tailWheelModel[3].setRotationPoint(207F, 20F, -2F);

		tailWheelModel[4].addShapeBox(0F, -38F, 0F, 9, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box284
		tailWheelModel[4].setRotationPoint(207F, 17F, -2F);

		tailWheelModel[5].addShapeBox(0F, -38F, 0F, 9, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box285
		tailWheelModel[5].setRotationPoint(207F, 23F, -2F);


		leftWingWheelModel = new ModelRendererTurbo[8];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1110, textureX, textureY); // Import Box265
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1200, textureX, textureY); // Import Box266
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1140, textureX, textureY); // Import Box267
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1155, textureX, textureY); // Import Box268
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Import Box269
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1155, textureX, textureY); // Import Box270
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Import Box271
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 200, 1175, textureX, textureY); // Import Box272

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 25, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box265
		leftWingWheelModel[0].setRotationPoint(-70F, -15F, -20F);
		leftWingWheelModel[0].rotateAngleZ = 0.83775804F;

		leftWingWheelModel[1].addBox(0F, 25F, 0F, 4, 4, 4, 0F); // Import Box266
		leftWingWheelModel[1].setRotationPoint(-70F, -15F, -24F);
		leftWingWheelModel[1].rotateAngleZ = 0.83775804F;

		leftWingWheelModel[2].addBox(0F, 25F, 0F, 15, 5, 5, 0F); // Import Box267
		leftWingWheelModel[2].setRotationPoint(-56F, -25F, -29F);

		leftWingWheelModel[3].addShapeBox(0F, 25F, 0F, 15, 3, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box268
		leftWingWheelModel[3].setRotationPoint(-56F, -28F, -29F);

		leftWingWheelModel[4].addShapeBox(0F, 25F, 0F, 11, 2, 5, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box269
		leftWingWheelModel[4].setRotationPoint(-54F, -30F, -29F);

		leftWingWheelModel[5].addShapeBox(0F, 25F, 0F, 15, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box270
		leftWingWheelModel[5].setRotationPoint(-56F, -20F, -29F);

		leftWingWheelModel[6].addShapeBox(0F, 25F, 0F, 11, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box271
		leftWingWheelModel[6].setRotationPoint(-54F, -17F, -29F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box272
		leftWingWheelModel[7].setRotationPoint(-58F, -15F, -19F);
		leftWingWheelModel[7].rotateAngleZ = 0.48869219F;


		rightWingWheelModel = new ModelRendererTurbo[8];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1175, textureX, textureY); // Import Box273
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1110, textureX, textureY); // Import Box274
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Import Box275
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1155, textureX, textureY); // Import Box276
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1140, textureX, textureY); // Import Box277
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1155, textureX, textureY); // Import Box278
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Import Box279
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 200, 1200, textureX, textureY); // Import Box286

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import Box273
		rightWingWheelModel[0].setRotationPoint(-58F, -15F, 17F);
		rightWingWheelModel[0].rotateAngleZ = 0.48869219F;

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 4, 25, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import Box274
		rightWingWheelModel[1].setRotationPoint(-70F, -15F, 16F);
		rightWingWheelModel[1].rotateAngleZ = 0.83775804F;

		rightWingWheelModel[2].addShapeBox(0F, 25F, 0F, 11, 2, 5, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box275
		rightWingWheelModel[2].setRotationPoint(-54F, -30F, 24F);

		rightWingWheelModel[3].addShapeBox(0F, 25F, 0F, 15, 3, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box276
		rightWingWheelModel[3].setRotationPoint(-56F, -28F, 24F);

		rightWingWheelModel[4].addBox(0F, 25F, 0F, 15, 5, 5, 0F); // Import Box277
		rightWingWheelModel[4].setRotationPoint(-56F, -25F, 24F);

		rightWingWheelModel[5].addShapeBox(0F, 25F, 0F, 15, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box278
		rightWingWheelModel[5].setRotationPoint(-56F, -20F, 24F);

		rightWingWheelModel[6].addShapeBox(0F, 25F, 0F, 11, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box279
		rightWingWheelModel[6].setRotationPoint(-54F, -17F, 24F);

		rightWingWheelModel[7].addBox(0F, 25F, 0F, 4, 4, 4, 0F); // Import Box286
		rightWingWheelModel[7].setRotationPoint(-70F, -15F, 20F);
		rightWingWheelModel[7].rotateAngleZ = 0.83775804F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}