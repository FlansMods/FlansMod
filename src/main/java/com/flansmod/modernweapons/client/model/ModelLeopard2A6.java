//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.modernweapons.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeopard2A6 extends ModelVehicle //Same as Filename
{
	int textureX = 4096;
	int textureY = 4096;
	
	public ModelLeopard2A6() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[174];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 162, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 223, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 223, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 224, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 295, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 295, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 299, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 417, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 0, 417, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 0, 453, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 0, 453, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 0, 497, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 0, 625, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 0, 625, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 0, 601, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 0, 682, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 0, 782, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 0, 882, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 0, 895, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 0, 908, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 0, 882, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 0, 895, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 0, 908, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 0, 883, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Shape 45
		bodyModel[46] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Shape 46
		bodyModel[47] = new ModelRendererTurbo(this, 0, 998, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 0, 998, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1019, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1024, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1019, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1024, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1029, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1036, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1061, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1149, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1162, textureX, textureY); // Box 67
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 68
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 69
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 71
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 0, 1177, textureX, textureY); // Box 73
		bodyModel[72] = new ModelRendererTurbo(this, 0, 1188, textureX, textureY); // Box 74
		bodyModel[73] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Box 75
		bodyModel[74] = new ModelRendererTurbo(this, 0, 1331, textureX, textureY); // Box 76
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1402, textureX, textureY); // Box 77
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1472, textureX, textureY); // Box 78
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1494, textureX, textureY); // Box 79
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1494, textureX, textureY); // Box 80
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1501, textureX, textureY); // Box 81
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1501, textureX, textureY); // Box 82
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1506, textureX, textureY); // Box 83
		bodyModel[82] = new ModelRendererTurbo(this, 0, 1472, textureX, textureY); // Box 84
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1494, textureX, textureY); // Box 85
		bodyModel[84] = new ModelRendererTurbo(this, 0, 1494, textureX, textureY); // Box 86
		bodyModel[85] = new ModelRendererTurbo(this, 0, 1501, textureX, textureY); // Box 87
		bodyModel[86] = new ModelRendererTurbo(this, 0, 1501, textureX, textureY); // Box 88
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1506, textureX, textureY); // Box 89
		bodyModel[88] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Box 90
		bodyModel[89] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Box 91
		bodyModel[90] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Box 92
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Box 93
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1509, textureX, textureY); // Box 94
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Box 95
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Box 97
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1509, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 100
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 101
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 102
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1536, textureX, textureY); // Box 103
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1536, textureX, textureY); // Box 104
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1536, textureX, textureY); // Box 105
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1541, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1541, textureX, textureY); // Box 107
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1541, textureX, textureY); // Box 108
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1536, textureX, textureY); // Box 109
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1536, textureX, textureY); // Box 110
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1536, textureX, textureY); // Box 111
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1541, textureX, textureY); // Box 112
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1541, textureX, textureY); // Box 113
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1541, textureX, textureY); // Box 114
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 115
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 116
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 117
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1546, textureX, textureY); // Box 118
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1546, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1556, textureX, textureY); // Box 423
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1568, textureX, textureY); // Box 425
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1571, textureX, textureY); // Box 426
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1571, textureX, textureY); // Box 427
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1577, textureX, textureY); // Box 428
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1577, textureX, textureY); // Box 429
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1571, textureX, textureY); // Box 430
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1577, textureX, textureY); // Box 431
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1577, textureX, textureY); // Box 432
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1556, textureX, textureY); // Box 433
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1571, textureX, textureY); // Box 434
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1571, textureX, textureY); // Box 435
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1577, textureX, textureY); // Box 436
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1577, textureX, textureY); // Box 437
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1571, textureX, textureY); // Box 438
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1577, textureX, textureY); // Box 439
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1577, textureX, textureY); // Box 440
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1584, textureX, textureY); // Box 441
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 442
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 443
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 444
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 445
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 446
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1598, textureX, textureY); // Box 447
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1598, textureX, textureY); // Box 448
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1584, textureX, textureY); // Box 451
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 452
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 453
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 454
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 455
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 456
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1598, textureX, textureY); // Box 457
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1598, textureX, textureY); // Box 458
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1605, textureX, textureY); // Box 459
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1610, textureX, textureY); // Box 460
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1620, textureX, textureY); // Box 461
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1650, textureX, textureY); // Box 462
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1656, textureX, textureY); // Box 463
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1667, textureX, textureY); // Box 464
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1673, textureX, textureY); // Box 465
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1682, textureX, textureY); // Box 466
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1691, textureX, textureY); // Box 467
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Box 468
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1715, textureX, textureY); // Box 469
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1726, textureX, textureY); // Box 470
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1737, textureX, textureY); // Box 471
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1691, textureX, textureY); // Box 472
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Box 473
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1715, textureX, textureY); // Box 474
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1726, textureX, textureY); // Box 475
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1737, textureX, textureY); // Box 476
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1743, textureX, textureY); // Box 523
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1743, textureX, textureY); // Box 524
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1694, textureX, textureY); // Box 525
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1753, textureX, textureY); // Box 526
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1568, textureX, textureY); // Box 534
		
		bodyModel[0].addShapeBox(0F, 0F, 0F, 7, 7, 53, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(83F, -19F, -26.5F);
		
		bodyModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 53, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(83F, -12F, -26.5F);
		
		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F, 0F, -1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[2].setRotationPoint(83F, -19F, -42.5F);
		
		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(83F, -19F, -34.5F);
		
		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[4].setRotationPoint(83F, -19F, 34.5F);
		
		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[5].setRotationPoint(83F, -19F, 26.5F);
		
		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 69, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(72F, -21F, -34.5F);
		
		bodyModel[7].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, 0F, -1F, 0F, -11F, -1F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(72F, -21F, -42.5F);
		
		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 9
		bodyModel[8].setRotationPoint(72F, -21F, 34.5F);
		
		bodyModel[9].addShapeBox(0F, 0F, 0F, 35, 6, 69, 0F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(38F, -27F, -34.5F);
		
		bodyModel[10].addShapeBox(0F, 0F, 0F, 35, 6, 8, 0F, 0F, -1F, 0F, -34F, -1F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(38F, -27F, -42.5F);
		
		bodyModel[11].addShapeBox(0F, 0F, 0F, 35, 6, 8, 0F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 12
		bodyModel[11].setRotationPoint(38F, -27F, 34.5F);
		
		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(83F, -18F, -46.5F);
		
		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(83F, -14F, -46.5F);
		
		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, 0F, 0F, -11F, 0F, -0.0909F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(72F, -20F, -47.5F);
		
		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -0.0909F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(72F, -11F, -47.5F);
		
		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(72F, -18F, -47.5F);
		
		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(83F, -18F, 42.5F);
		
		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(83F, -14F, 42.5F);
		
		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.0909F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(72F, -20F, 42.5F);
		
		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.0909F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(72F, -11F, 42.5F);
		
		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(72F, -18F, 42.5F);
		
		bodyModel[22].addShapeBox(0F, 0F, 0F, 35, 6, 5, 0F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(38F, -26F, -47.5F);
		
		bodyModel[23].addShapeBox(0F, 0F, 0F, 34, 11, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 23
		bodyModel[23].setRotationPoint(38F, -20F, -47.5F);
		
		bodyModel[24].addShapeBox(0F, 0F, 0F, 67, 18, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-29F, -26F, -47.5F);
		
		bodyModel[25].addShapeBox(0F, 0F, 0F, 35, 6, 5, 0F, 0F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(38F, -26F, 42.5F);
		
		bodyModel[26].addShapeBox(0F, 0F, 0F, 34, 11, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 26
		bodyModel[26].setRotationPoint(38F, -20F, 42.5F);
		
		bodyModel[27].addShapeBox(0F, 0F, 0F, 67, 18, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-29F, -26F, 42.5F);
		
		bodyModel[28].addShapeBox(0F, 0F, 0F, 67, 10, 69, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-29F, -27F, -34.5F);
		
		bodyModel[29].addShapeBox(0F, 0F, 0F, 67, 10, 8, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-29F, -27F, -42.5F);
		
		bodyModel[30].addShapeBox(0F, 0F, 0F, 67, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-29F, -27F, 34.5F);
		
		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 18, 5, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-34F, -26F, -47.5F);
		
		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 10, 8, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-34F, -27F, -42.5F);
		
		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 18, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-34F, -26F, 42.5F);
		
		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 10, 8, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-34F, -27F, 34.5F);
		
		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 10, 69, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-34F, -27F, -34.5F);
		
		bodyModel[36].addShapeBox(0F, 0F, 0F, 40, 12, 85, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[36].setRotationPoint(-74F, -29F, -42.5F);
		
		bodyModel[37].addShapeBox(0F, 0F, 0F, 25, 12, 85, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-99F, -29F, -42.5F);
		
		bodyModel[38].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-69F, -18F, -43.5F);
		
		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-74F, -18F, -43.5F);
		
		bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(-95F, -18F, -43.5F);
		
		bodyModel[41].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-69F, -18F, 42.5F);
		
		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 42
		bodyModel[42].setRotationPoint(-74F, -18F, 42.5F);
		
		bodyModel[43].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[43].setRotationPoint(-95F, -18F, 42.5F);
		
		bodyModel[44].addShapeBox(0F, 0F, 0F, 47, 3, 83, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(-98F, -30F, -41.5F);
		
		bodyModel[45].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(10, 0, 10, 0), new Coord2D(20, 0, 20, 0), new Coord2D(27, 7, 27, 7), new Coord2D(27, 17, 27, 17), new Coord2D(20, 24, 20, 24), new Coord2D(10, 24, 10, 24), new Coord2D(3, 17, 3, 17), new Coord2D(3, 7, 3, 7)}), 1, 27, 24, 80, 1, ModelRendererTurbo.MR_FRONT, new float[]{10, 10, 10, 10, 10, 10, 10, 10}); // Shape 45
		bodyModel[45].setRotationPoint(-64F, -31F, -2F);
		bodyModel[45].rotateAngleX = 1.57079633F;
		
		bodyModel[46].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(10, 0, 10, 0), new Coord2D(20, 0, 20, 0), new Coord2D(27, 7, 27, 7), new Coord2D(27, 17, 27, 17), new Coord2D(20, 24, 20, 24), new Coord2D(10, 24, 10, 24), new Coord2D(3, 17, 3, 17), new Coord2D(3, 7, 3, 7)}), 1, 27, 24, 80, 1, ModelRendererTurbo.MR_FRONT, new float[]{10, 10, 10, 10, 10, 10, 10, 10}); // Shape 46
		bodyModel[46].setRotationPoint(-64F, -31F, 26F);
		bodyModel[46].rotateAngleX = 1.57079633F;
		
		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(-51F, -29F, -36.5F);
		
		bodyModel[48].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(-48F, -29F, -20.5F);
		
		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[49].setRotationPoint(-48F, -29F, -24.5F);
		
		bodyModel[50].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 51
		bodyModel[50].setRotationPoint(-48F, -29F, -16.5F);
		
		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[51].setRotationPoint(-51F, -29F, 29.5F);
		
		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[52].setRotationPoint(-48F, -29F, 16.5F);
		
		bodyModel[53].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 54
		bodyModel[53].setRotationPoint(-48F, -29F, 20.5F);
		
		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[54].setRotationPoint(-48F, -29F, 12.5F);
		
		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[55].setRotationPoint(-98F, -31F, -38.5F);
		
		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[56].setRotationPoint(-99F, -31F, -38.5F);
		
		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[57].setRotationPoint(-98F, -31F, 37.5F);
		
		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[58].setRotationPoint(-99F, -31F, 37.5F);
		
		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[59].setRotationPoint(-98F, -31F, -2F);
		
		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[60].setRotationPoint(-99F, -31F, -2F);
		
		bodyModel[61].addShapeBox(0F, 0F, 0F, 16, 6, 53, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[61].setRotationPoint(68F, -6F, -26.5F);
		
		bodyModel[62].addShapeBox(0F, 0F, 0F, 135, 17, 55, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[62].setRotationPoint(-67F, -17F, -27.5F);
		
		bodyModel[63].addShapeBox(-28F, 0F, -5F, 56, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[63].setRotationPoint(9F, -28F, 0F);
		
		bodyModel[64].addShapeBox(-28F, 0F, -5F, 56, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[64].setRotationPoint(9F, -28F, 0F);
		bodyModel[64].rotateAngleY = -0.34906585F;
		
		bodyModel[65].addShapeBox(-28F, 0F, -5F, 56, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[65].setRotationPoint(9F, -28F, 0F);
		bodyModel[65].rotateAngleY = -0.6981317F;
		
		bodyModel[66].addShapeBox(-28F, 0F, -5F, 56, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[66].setRotationPoint(9F, -28F, 0F);
		bodyModel[66].rotateAngleY = -1.04719755F;
		
		bodyModel[67].addShapeBox(-28F, 0F, -5F, 56, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[67].setRotationPoint(9F, -28F, 0F);
		bodyModel[67].rotateAngleY = -1.3962634F;
		
		bodyModel[68].addShapeBox(-28F, 0F, -5F, 56, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[68].setRotationPoint(9F, -28F, 0F);
		bodyModel[68].rotateAngleY = -1.74532925F;
		
		bodyModel[69].addShapeBox(-28F, 0F, -5F, 56, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[69].setRotationPoint(9F, -28F, 0F);
		bodyModel[69].rotateAngleY = -2.0943951F;
		
		bodyModel[70].addShapeBox(-28F, 0F, -5F, 56, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[70].setRotationPoint(9F, -28F, 0F);
		bodyModel[70].rotateAngleY = -2.44346095F;
		
		bodyModel[71].addShapeBox(-28F, 0F, -5F, 56, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[71].setRotationPoint(9F, -28F, 0F);
		bodyModel[71].rotateAngleY = -2.7925268F;
		
		bodyModel[72].addShapeBox(0F, 0F, 0F, 15, 13, 53, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[72].setRotationPoint(68F, -19F, -26.5F);
		
		bodyModel[73].addShapeBox(0F, 0F, 0F, 30, 4, 69, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[73].setRotationPoint(38F, -21F, -34.5F);
		
		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 17, 51, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 76
		bodyModel[74].setRotationPoint(-90F, -17F, -25.5F);
		
		bodyModel[75].addShapeBox(0F, 0F, 0F, 19, 17, 51, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[75].setRotationPoint(-86F, -17F, -25.5F);
		
		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 5, 16, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[76].setRotationPoint(-95F, -18F, -41.5F);
		
		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[77].setRotationPoint(-96F, -16F, -40.5F);
		
		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 80
		bodyModel[78].setRotationPoint(-96F, -15F, -40.5F);
		
		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 81
		bodyModel[79].setRotationPoint(-96F, -16F, -35F);
		
		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 82
		bodyModel[80].setRotationPoint(-96F, -15F, -35F);
		
		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[81].setRotationPoint(-96F, -15.5F, -31F);
		
		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 5, 16, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[82].setRotationPoint(-95F, -18F, 25.5F);
		
		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[83].setRotationPoint(-96F, -16F, 35.5F);
		
		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 86
		bodyModel[84].setRotationPoint(-96F, -15F, 35.5F);
		
		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 87
		bodyModel[85].setRotationPoint(-96F, -16F, 32F);
		
		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		bodyModel[86].setRotationPoint(-96F, -15F, 32F);
		
		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[87].setRotationPoint(-96F, -15.5F, 30F);
		
		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[88].setRotationPoint(-92F, -16F, -23.5F);
		
		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[89].setRotationPoint(-92F, -13F, -23.5F);
		
		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 92
		bodyModel[90].setRotationPoint(-92F, -13F, -20.5F);
		
		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[91].setRotationPoint(-92F, -16F, -20.5F);
		
		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[92].setRotationPoint(-92F, -16F, -15.5F);
		
		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[93].setRotationPoint(-92F, -16F, 20.5F);
		
		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 96
		bodyModel[94].setRotationPoint(-92F, -13F, 20.5F);
		
		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[95].setRotationPoint(-92F, -13F, 17.5F);
		
		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[96].setRotationPoint(-92F, -16F, 17.5F);
		
		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[97].setRotationPoint(-92F, -16F, 3.5F);
		
		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[98].setRotationPoint(-91F, -6F, -18.5F);
		
		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[99].setRotationPoint(-91F, -5F, -18.5F);
		
		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
		bodyModel[100].setRotationPoint(-91F, -4F, -18.5F);
		
		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[101].setRotationPoint(-93F, -7F, -22.5F);
		
		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[102].setRotationPoint(-93F, -8F, -22.5F);
		
		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 105
		bodyModel[103].setRotationPoint(-93F, -6F, -22.5F);
		
		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[104].setRotationPoint(-92F, -5F, -22F);
		
		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 107
		bodyModel[105].setRotationPoint(-94F, -4F, -22F);
		
		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[106].setRotationPoint(-94F, -6F, -22F);
		
		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[107].setRotationPoint(-93F, -7F, 20.5F);
		
		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[108].setRotationPoint(-93F, -8F, 20.5F);
		
		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 111
		bodyModel[109].setRotationPoint(-93F, -6F, 20.5F);
		
		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[110].setRotationPoint(-92F, -5F, 21F);
		
		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[111].setRotationPoint(-94F, -4F, 21F);
		
		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[112].setRotationPoint(-94F, -6F, 21F);
		
		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[113].setRotationPoint(-91F, -6F, 15.5F);
		
		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[114].setRotationPoint(-91F, -5F, 15.5F);
		
		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 117
		bodyModel[115].setRotationPoint(-91F, -4F, 15.5F);
		
		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[116].setRotationPoint(-91F, -8F, -3F);
		
		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 119
		bodyModel[117].setRotationPoint(-91F, -6F, -3F);
		
		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[118].setRotationPoint(-30F, -29F, -46.5F);
		
		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[119].setRotationPoint(-30F, -27F, -38.5F);
		
		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[120].setRotationPoint(-23F, -26.5F, -42.5F);
		
		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[121].setRotationPoint(-13F, -26.5F, -45.5F);
		
		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[122].setRotationPoint(-1F, -27F, -43.5F);
		
		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[123].setRotationPoint(5F, -27F, -43.5F);
		
		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[124].setRotationPoint(14F, -26.5F, -45.5F);
		
		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[125].setRotationPoint(27F, -26.5F, -44.5F);
		
		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[126].setRotationPoint(33F, -26.5F, -44.5F);
		
		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[127].setRotationPoint(-30F, -29F, 38.5F);
		
		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[128].setRotationPoint(-23F, -26.5F, 40.5F);
		
		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[129].setRotationPoint(-13F, -26.5F, 43.5F);
		
		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[130].setRotationPoint(-1F, -27F, 39.5F);
		
		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[131].setRotationPoint(5F, -27F, 39.5F);
		
		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[132].setRotationPoint(14F, -26.5F, 43.5F);
		
		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[133].setRotationPoint(27F, -26.5F, 40.5F);
		
		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[134].setRotationPoint(33F, -26.5F, 40.5F);
		
		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[135].setRotationPoint(37F, -27F, -45.5F);
		
		bodyModel[136].addShapeBox(4F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[136].setRotationPoint(39F, -27F, -44.5F);
		bodyModel[136].rotateAngleZ = -0.17453293F;
		
		bodyModel[137].addShapeBox(8F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[137].setRotationPoint(39F, -27F, -44.5F);
		bodyModel[137].rotateAngleZ = -0.17453293F;
		
		bodyModel[138].addShapeBox(18F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[138].setRotationPoint(39F, -27F, -44.5F);
		bodyModel[138].rotateAngleZ = -0.17453293F;
		
		bodyModel[139].addShapeBox(22F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[139].setRotationPoint(39F, -27F, -44.5F);
		bodyModel[139].rotateAngleZ = -0.17453293F;
		
		bodyModel[140].addShapeBox(31F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[140].setRotationPoint(39F, -27F, -44.5F);
		bodyModel[140].rotateAngleZ = -0.17453293F;
		
		bodyModel[141].addShapeBox(26F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[141].setRotationPoint(39F, -27F, -45.5F);
		bodyModel[141].rotateAngleZ = -0.17453293F;
		
		bodyModel[142].addShapeBox(12F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[142].setRotationPoint(39F, -27F, -45.5F);
		bodyModel[142].rotateAngleZ = -0.17453293F;
		
		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[143].setRotationPoint(37F, -27F, 42.5F);
		
		bodyModel[144].addShapeBox(4F, 0F, 0F, 2, 2, 4, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[144].setRotationPoint(39F, -27F, 40.5F);
		bodyModel[144].rotateAngleZ = -0.17453293F;
		
		bodyModel[145].addShapeBox(8F, 0F, 0F, 2, 2, 4, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[145].setRotationPoint(39F, -27F, 40.5F);
		bodyModel[145].rotateAngleZ = -0.17453293F;
		
		bodyModel[146].addShapeBox(18F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[146].setRotationPoint(39F, -27F, 40.5F);
		bodyModel[146].rotateAngleZ = -0.17453293F;
		
		bodyModel[147].addShapeBox(22F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[147].setRotationPoint(39F, -27F, 40.5F);
		bodyModel[147].rotateAngleZ = -0.17453293F;
		
		bodyModel[148].addShapeBox(31F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[148].setRotationPoint(39F, -27F, 40.5F);
		bodyModel[148].rotateAngleZ = -0.17453293F;
		
		bodyModel[149].addShapeBox(26F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[149].setRotationPoint(39F, -27F, 42.5F);
		bodyModel[149].rotateAngleZ = -0.17453293F;
		
		bodyModel[150].addShapeBox(12F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[150].setRotationPoint(39F, -27F, 42.5F);
		bodyModel[150].rotateAngleZ = -0.17453293F;
		
		bodyModel[151].addShapeBox(8F, -1F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[151].setRotationPoint(39F, -27F, -40.5F);
		bodyModel[151].rotateAngleZ = -0.17453293F;
		
		bodyModel[152].addShapeBox(8F, -1F, 0F, 7, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[152].setRotationPoint(39F, -27F, -38.5F);
		bodyModel[152].rotateAngleZ = -0.17453293F;
		
		bodyModel[153].addShapeBox(8F, -1F, 0F, 2, 2, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[153].setRotationPoint(39F, -27F, -33.5F);
		bodyModel[153].rotateAngleZ = -0.17453293F;
		
		bodyModel[154].addShapeBox(8F, -2F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[154].setRotationPoint(39F, -27F, -8.5F);
		bodyModel[154].rotateAngleZ = -0.17453293F;
		
		bodyModel[155].addShapeBox(8F, -2F, 0F, 7, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[155].setRotationPoint(39F, -27F, -5.5F);
		bodyModel[155].rotateAngleZ = -0.17453293F;
		
		bodyModel[156].addShapeBox(8F, -2F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 464
		bodyModel[156].setRotationPoint(39F, -27F, 1.5F);
		bodyModel[156].rotateAngleZ = -0.17453293F;
		
		bodyModel[157].addShapeBox(15F, -2F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 465
		bodyModel[157].setRotationPoint(39F, -27F, -2.5F);
		bodyModel[157].rotateAngleZ = -0.17453293F;
		
		bodyModel[158].addShapeBox(23F, -3F, 0F, 8, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[158].setRotationPoint(39F, -27F, -2.5F);
		bodyModel[158].rotateAngleZ = -0.17453293F;
		
		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[159].setRotationPoint(83F, -19F, -25.5F);
		
		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[160].setRotationPoint(83F, -19F, -24.5F);
		
		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[161].setRotationPoint(86F, -18F, -23.5F);
		
		bodyModel[162].addTrapezoid(0F, 0F, 0F, 1, 4, 5, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 470
		bodyModel[162].setRotationPoint(90F, -18F, -23.5F);
		
		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[163].setRotationPoint(86F, -17F, -17.5F);
		
		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[164].setRotationPoint(83F, -19F, 24.5F);
		
		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[165].setRotationPoint(83F, -19F, 12.5F);
		
		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[166].setRotationPoint(86F, -18F, 18.5F);
		
		bodyModel[167].addTrapezoid(0F, 0F, 0F, 1, 4, 5, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 475
		bodyModel[167].setRotationPoint(90F, -18F, 18.5F);
		
		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[168].setRotationPoint(86F, -17F, 15.5F);
		
		bodyModel[169].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[169].setRotationPoint(-94F, -31F, -28.5F);
		
		bodyModel[170].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[170].setRotationPoint(-94F, -31F, 27.5F);
		
		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 55, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[171].setRotationPoint(-94F, -31F, -27.5F);
		
		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[172].setRotationPoint(-90F, -31F, -5F);
		
		bodyModel[173].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[173].setRotationPoint(-30F, -27F, 37.5F);
		
		
		turretModel = new ModelRendererTurbo[77];
		turretModel[0] = new ModelRendererTurbo(this, 0, 1755, textureX, textureY); // Box 477
		turretModel[1] = new ModelRendererTurbo(this, 0, 1840, textureX, textureY); // Box 479
		turretModel[2] = new ModelRendererTurbo(this, 0, 1865, textureX, textureY); // Box 481
		turretModel[3] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Box 482
		turretModel[4] = new ModelRendererTurbo(this, 0, 1972, textureX, textureY); // Box 484
		turretModel[5] = new ModelRendererTurbo(this, 0, 2007, textureX, textureY); // Box 485
		turretModel[6] = new ModelRendererTurbo(this, 0, 2026, textureX, textureY); // Box 486
		turretModel[7] = new ModelRendererTurbo(this, 0, 2044, textureX, textureY); // Box 487
		turretModel[8] = new ModelRendererTurbo(this, 0, 2078, textureX, textureY); // Box 488
		turretModel[9] = new ModelRendererTurbo(this, 0, 2102, textureX, textureY); // Box 490
		turretModel[10] = new ModelRendererTurbo(this, 0, 2112, textureX, textureY); // Box 491
		turretModel[11] = new ModelRendererTurbo(this, 0, 2126, textureX, textureY); // Box 492
		turretModel[12] = new ModelRendererTurbo(this, 0, 1972, textureX, textureY); // Box 494
		turretModel[13] = new ModelRendererTurbo(this, 0, 2007, textureX, textureY); // Box 495
		turretModel[14] = new ModelRendererTurbo(this, 0, 2044, textureX, textureY); // Box 496
		turretModel[15] = new ModelRendererTurbo(this, 0, 2078, textureX, textureY); // Box 497
		turretModel[16] = new ModelRendererTurbo(this, 0, 2102, textureX, textureY); // Box 498
		turretModel[17] = new ModelRendererTurbo(this, 0, 2079, textureX, textureY); // Box 501
		turretModel[18] = new ModelRendererTurbo(this, 0, 2165, textureX, textureY); // Box 502
		turretModel[19] = new ModelRendererTurbo(this, 0, 2250, textureX, textureY); // Box 507
		turretModel[20] = new ModelRendererTurbo(this, 0, 2333, textureX, textureY); // Box 510
		turretModel[21] = new ModelRendererTurbo(this, 0, 2403, textureX, textureY); // Box 511
		turretModel[22] = new ModelRendererTurbo(this, 0, 2429, textureX, textureY); // Box 512
		turretModel[23] = new ModelRendererTurbo(this, 0, 2455, textureX, textureY); // Box 513
		turretModel[24] = new ModelRendererTurbo(this, 0, 2478, textureX, textureY); // Box 514
		turretModel[25] = new ModelRendererTurbo(this, 0, 2500, textureX, textureY); // Box 515
		turretModel[26] = new ModelRendererTurbo(this, 0, 2523, textureX, textureY); // Box 516
		turretModel[27] = new ModelRendererTurbo(this, 0, 2548, textureX, textureY); // Box 517
		turretModel[28] = new ModelRendererTurbo(this, 0, 2574, textureX, textureY); // Box 518
		turretModel[29] = new ModelRendererTurbo(this, 0, 2590, textureX, textureY); // Box 519
		turretModel[30] = new ModelRendererTurbo(this, 0, 2590, textureX, textureY); // Box 520
		turretModel[31] = new ModelRendererTurbo(this, 0, 2590, textureX, textureY); // Box 521
		turretModel[32] = new ModelRendererTurbo(this, 0, 2609, textureX, textureY); // Box 522
		turretModel[33] = new ModelRendererTurbo(this, 0, 2618, textureX, textureY); // Box 523
		turretModel[34] = new ModelRendererTurbo(this, 0, 2637, textureX, textureY); // Box 524
		turretModel[35] = new ModelRendererTurbo(this, 0, 2655, textureX, textureY); // Box 525
		turretModel[36] = new ModelRendererTurbo(this, 0, 2675, textureX, textureY); // Box 526
		turretModel[37] = new ModelRendererTurbo(this, 0, 2675, textureX, textureY); // Box 527
		turretModel[38] = new ModelRendererTurbo(this, 0, 2682, textureX, textureY); // Box 528
		turretModel[39] = new ModelRendererTurbo(this, 0, 2692, textureX, textureY); // Box 529
		turretModel[40] = new ModelRendererTurbo(this, 0, 2695, textureX, textureY); // Box 530
		turretModel[41] = new ModelRendererTurbo(this, 0, 2700, textureX, textureY); // Box 531
		turretModel[42] = new ModelRendererTurbo(this, 0, 2700, textureX, textureY); // Box 532
		turretModel[43] = new ModelRendererTurbo(this, 0, 2705, textureX, textureY); // Box 533
		turretModel[44] = new ModelRendererTurbo(this, 0, 2700, textureX, textureY); // Box 534
		turretModel[45] = new ModelRendererTurbo(this, 0, 2700, textureX, textureY); // Box 535
		turretModel[46] = new ModelRendererTurbo(this, 0, 2705, textureX, textureY); // Box 536
		turretModel[47] = new ModelRendererTurbo(this, 0, 2026, textureX, textureY); // Box 553
		turretModel[48] = new ModelRendererTurbo(this, 0, 2753, textureX, textureY); // Box 493
		turretModel[49] = new ModelRendererTurbo(this, 0, 2753, textureX, textureY); // Box 494
		turretModel[50] = new ModelRendererTurbo(this, 0, 2762, textureX, textureY); // Box 495
		turretModel[51] = new ModelRendererTurbo(this, 0, 1840, textureX, textureY); // Box 496
		turretModel[52] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Box 497
		turretModel[53] = new ModelRendererTurbo(this, 0, 2112, textureX, textureY); // Box 498
		turretModel[54] = new ModelRendererTurbo(this, 0, 2126, textureX, textureY); // Box 499
		turretModel[55] = new ModelRendererTurbo(this, 0, 2762, textureX, textureY); // Box 500
		turretModel[56] = new ModelRendererTurbo(this, 0, 2786, textureX, textureY); // Box 501
		turretModel[57] = new ModelRendererTurbo(this, 0, 2786, textureX, textureY); // Box 502
		turretModel[58] = new ModelRendererTurbo(this, 0, 2795, textureX, textureY); // Box 504
		turretModel[59] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 505
		turretModel[60] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 506
		turretModel[61] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 507
		turretModel[62] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 508
		turretModel[63] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 509
		turretModel[64] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 510
		turretModel[65] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 511
		turretModel[66] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 512
		turretModel[67] = new ModelRendererTurbo(this, 0, 2795, textureX, textureY); // Box 513
		turretModel[68] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 514
		turretModel[69] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 515
		turretModel[70] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 516
		turretModel[71] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 517
		turretModel[72] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 518
		turretModel[73] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 519
		turretModel[74] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 520
		turretModel[75] = new ModelRendererTurbo(this, 0, 2802, textureX, textureY); // Box 521
		turretModel[76] = new ModelRendererTurbo(this, 2, 3542, textureX, textureY); // Box 533
		
		turretModel[0].addShapeBox(0F, 0F, 0F, 30, 18, 65, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		turretModel[0].setRotationPoint(-6F, -46F, -32.5F);
		
		turretModel[1].addShapeBox(0F, 0F, 0F, 30, 18, 4, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		turretModel[1].setRotationPoint(-6F, -46F, -36.5F);
		
		turretModel[2].addShapeBox(0F, 0F, 0F, 13, 16, 65, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 481
		turretModel[2].setRotationPoint(24F, -44F, -32.5F);
		
		turretModel[3].addShapeBox(0F, 0F, 0F, 13, 16, 4, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 482
		turretModel[3].setRotationPoint(24F, -44F, -36.5F);
		
		turretModel[4].addShapeBox(0F, 0F, 0F, 15, 8, 25, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		turretModel[4].setRotationPoint(37F, -43F, -30.5F);
		
		turretModel[5].addShapeBox(0F, 0F, 0F, 10, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		turretModel[5].setRotationPoint(37F, -35F, -15.5F);
		
		turretModel[6].addShapeBox(0F, 0F, 0F, 21, 7, 9, 0F, 0F, 0F, 0F, -6.2609F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 486
		turretModel[6].setRotationPoint(47F, -35F, -15.5F);
		
		turretModel[7].addShapeBox(0F, 0F, 0F, 16, 8, 24, 0F, 0F, -7F, 0F, 0F, -7F, -23F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		turretModel[7].setRotationPoint(52F, -43F, -29.5F);
		
		turretModel[8].addShapeBox(0F, 0F, 0F, 15, 7, 15, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 9.7391F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 488
		turretModel[8].setRotationPoint(37F, -35F, -30.5F);
		
		turretModel[9].addShapeBox(0F, 0F, 0F, 21, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 490
		turretModel[9].setRotationPoint(47F, -35F, -6.5F);
		
		turretModel[10].addShapeBox(0F, 0F, 0F, 15, 8, 4, 0F, 0F, -6F, 0F, -1F, -7.5F, -4F, 0F, -7F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 491
		turretModel[10].setRotationPoint(37F, -43F, -34.5F);
		
		turretModel[11].addShapeBox(0F, 0F, 0F, 15, 7, 4, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, -14F, -6F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 492
		turretModel[11].setRotationPoint(37F, -35F, -34.5F);
		
		turretModel[12].addShapeBox(0F, 0F, 0F, 15, 8, 25, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 494
		turretModel[12].setRotationPoint(37F, -43F, 5.5F);
		
		turretModel[13].addShapeBox(0F, 0F, 0F, 10, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		turretModel[13].setRotationPoint(37F, -35F, 5.5F);
		
		turretModel[14].addShapeBox(0F, 0F, 0F, 16, 8, 24, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, -23F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F); // Box 496
		turretModel[14].setRotationPoint(52F, -43F, 5.5F);
		
		turretModel[15].addShapeBox(0F, 0F, 0F, 15, 7, 15, 0F, 0F, 0F, 0F, 9.7391F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 497
		turretModel[15].setRotationPoint(37F, -35F, 15.5F);
		
		turretModel[16].addShapeBox(0F, 0F, 0F, 21, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 498
		turretModel[16].setRotationPoint(47F, -35F, 5.5F);
		
		turretModel[17].addShapeBox(0F, 0F, 0F, 22, 18, 65, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		turretModel[17].setRotationPoint(-28F, -46F, -32.5F);
		
		turretModel[18].addShapeBox(0F, 0F, 0F, 10, 18, 65, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 502
		turretModel[18].setRotationPoint(-38F, -46F, -32.5F);
		
		turretModel[19].addShapeBox(0F, 0F, 0F, 25, 15, 65, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 507
		turretModel[19].setRotationPoint(-63F, -46F, -32.5F);
		
		turretModel[20].addShapeBox(0F, 0F, 0F, 14, 15, 53, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 510
		turretModel[20].setRotationPoint(-77F, -46F, -26.5F);
		
		turretModel[21].addShapeBox(0F, 0F, 0F, 2, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		turretModel[21].setRotationPoint(-79F, -42F, 2.5F);
		
		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 9, 15, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		turretModel[22].setRotationPoint(-80F, -42F, 2.5F);
		
		turretModel[23].addShapeBox(0F, 0F, 0F, 6, 3, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		turretModel[23].setRotationPoint(-11F, -48F, -24.5F);
		
		turretModel[24].addShapeBox(0F, 0F, 0F, 6, 3, 18, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 514
		turretModel[24].setRotationPoint(-5F, -48F, -24.5F);
		
		turretModel[25].addShapeBox(0F, 0F, 0F, 6, 3, 18, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 515
		turretModel[25].setRotationPoint(-17F, -48F, -24.5F);
		
		turretModel[26].addShapeBox(0F, 0F, 0F, 7, 3, 19, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 516
		turretModel[26].setRotationPoint(-15F, -48F, 5.5F);
		
		turretModel[27].addShapeBox(0F, 0F, 0F, 9, 4, 19, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 517
		turretModel[27].setRotationPoint(-8F, -48F, 5.5F);
		
		turretModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 518
		turretModel[28].setRotationPoint(-17F, -48F, 6.5F);
		
		turretModel[29].addShapeBox(0F, 0F, 0F, 3, 8, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		turretModel[29].setRotationPoint(-21F, -53F, 3F);
		
		turretModel[30].addShapeBox(0F, 0F, 0F, 3, 8, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 520
		turretModel[30].setRotationPoint(-18F, -53F, 3F);
		
		turretModel[31].addShapeBox(0F, 0F, 0F, 3, 8, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 521
		turretModel[31].setRotationPoint(-24F, -53F, 3F);
		
		turretModel[32].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		turretModel[32].setRotationPoint(-23F, -56F, 6F);
		
		turretModel[33].addShapeBox(0F, 0F, 0F, 8, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		turretModel[33].setRotationPoint(1F, -48F, 9.5F);
		
		turretModel[34].addShapeBox(0F, 0F, 0F, 16, 5, 11, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 524
		turretModel[34].setRotationPoint(9F, -48F, 10.5F);
		
		turretModel[35].addShapeBox(0F, 0F, 0F, 11, 6, 12, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		turretModel[35].setRotationPoint(22F, -47F, 11.5F);
		
		turretModel[36].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		turretModel[36].setRotationPoint(22F, -47F, 7.5F);
		
		turretModel[37].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		turretModel[37].setRotationPoint(22F, -47F, -8.5F);
		
		turretModel[38].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		turretModel[38].setRotationPoint(-33F, -48F, 4F);
		
		turretModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		turretModel[39].setRotationPoint(-35F, -47F, 0F);
		
		turretModel[40].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		turretModel[40].setRotationPoint(-35F, -49F, 0F);
		
		turretModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		turretModel[41].setRotationPoint(-56F, -47F, 22F);
		
		turretModel[42].addTrapezoid(0F, 0F, 0F, 2, 1, 2, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Box 532
		turretModel[42].setRotationPoint(-56F, -48F, 22F);
		
		turretModel[43].addTrapezoid(0F, 0F, 0F, 1, 44, 1, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Box 533
		turretModel[43].setRotationPoint(-55.5F, -92F, 22.5F);
		
		turretModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		turretModel[44].setRotationPoint(-56F, -47F, -24F);
		
		turretModel[45].addTrapezoid(0F, 0F, 0F, 2, 1, 2, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Box 535
		turretModel[45].setRotationPoint(-56F, -48F, -24F);
		
		turretModel[46].addTrapezoid(0F, 0F, 0F, 1, 44, 1, 0F, -0.50F, ModelRendererTurbo.MR_TOP); // Box 536
		turretModel[46].setRotationPoint(-55.5F, -92F, -23.5F);
		
		turretModel[47].addShapeBox(0F, 0F, 0F, 21, 7, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.2609F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 553
		turretModel[47].setRotationPoint(47F, -35F, 6.5F);
		
		turretModel[48].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		turretModel[48].setRotationPoint(33F, -47F, 11.5F);
		
		turretModel[49].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		turretModel[49].setRotationPoint(33F, -47F, 22.5F);
		
		turretModel[50].addShapeBox(0F, 0F, 0F, 14, 18, 4, 0F, 0F, 0F, -3.99F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		turretModel[50].setRotationPoint(-20F, -46F, -36.5F);
		
		turretModel[51].addShapeBox(0F, 0F, 0F, 30, 18, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 496
		turretModel[51].setRotationPoint(-6F, -46F, 32.5F);
		
		turretModel[52].addShapeBox(0F, 0F, 0F, 13, 16, 4, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, -2F, 0F, -6F, 0F); // Box 497
		turretModel[52].setRotationPoint(24F, -44F, 32.5F);
		
		turretModel[53].addShapeBox(0F, 0F, 0F, 15, 8, 4, 0F, 0F, 0F, 0F, 0F, -7F, 1F, -1F, -7.5F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -4F, 0F, 0F, 0F); // Box 498
		turretModel[53].setRotationPoint(37F, -43F, 30.5F);
		
		turretModel[54].addShapeBox(0F, 0F, 0F, 15, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, -6F, 0F, 0F, -6F, 0F); // Box 499
		turretModel[54].setRotationPoint(37F, -35F, 30.5F);
		
		turretModel[55].addShapeBox(0F, 0F, 0F, 14, 18, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -3.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -3.99F); // Box 500
		turretModel[55].setRotationPoint(-20F, -46F, 32.5F);
		
		turretModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		turretModel[56].setRotationPoint(32.5F, -46F, 18.5F);
		
		turretModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		turretModel[57].setRotationPoint(32.5F, -46F, 13.5F);
		
		turretModel[58].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		turretModel[58].setRotationPoint(-48F, -42F, -34.5F);
		
		turretModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		turretModel[59].setRotationPoint(-46.8F, -44.8F, -34F);
		turretModel[59].rotateAngleZ = -0.34906585F;
		
		turretModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		turretModel[60].setRotationPoint(-43.8F, -44.8F, -34F);
		turretModel[60].rotateAngleZ = -0.34906585F;
		
		turretModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		turretModel[61].setRotationPoint(-40.8F, -44.8F, -34F);
		turretModel[61].rotateAngleZ = -0.34906585F;
		
		turretModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		turretModel[62].setRotationPoint(-37.8F, -44.8F, -34F);
		turretModel[62].rotateAngleZ = -0.34906585F;
		
		turretModel[63].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		turretModel[63].setRotationPoint(-34.8F, -44.8F, -34F);
		turretModel[63].rotateAngleZ = -0.34906585F;
		
		turretModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		turretModel[64].setRotationPoint(-47.5F, -41.7F, -34F);
		turretModel[64].rotateAngleZ = -0.34906585F;
		
		turretModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		turretModel[65].setRotationPoint(-44.5F, -41.7F, -34F);
		turretModel[65].rotateAngleZ = -0.34906585F;
		
		turretModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		turretModel[66].setRotationPoint(-41.5F, -41.7F, -34F);
		turretModel[66].rotateAngleZ = -0.34906585F;
		
		turretModel[67].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		turretModel[67].setRotationPoint(-48F, -42F, 31.5F);
		
		turretModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		turretModel[68].setRotationPoint(-46.8F, -44.8F, 32F);
		turretModel[68].rotateAngleZ = -0.34906585F;
		
		turretModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		turretModel[69].setRotationPoint(-43.8F, -44.8F, 32F);
		turretModel[69].rotateAngleZ = -0.34906585F;
		
		turretModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		turretModel[70].setRotationPoint(-40.8F, -44.8F, 32F);
		turretModel[70].rotateAngleZ = -0.34906585F;
		
		turretModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		turretModel[71].setRotationPoint(-37.8F, -44.8F, 32F);
		turretModel[71].rotateAngleZ = -0.34906585F;
		
		turretModel[72].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		turretModel[72].setRotationPoint(-34.8F, -44.8F, 32F);
		turretModel[72].rotateAngleZ = -0.34906585F;
		
		turretModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		turretModel[73].setRotationPoint(-47.5F, -41.7F, 32F);
		turretModel[73].rotateAngleZ = -0.34906585F;
		
		turretModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		turretModel[74].setRotationPoint(-44.5F, -41.7F, 32F);
		turretModel[74].rotateAngleZ = -0.34906585F;
		
		turretModel[75].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		turretModel[75].setRotationPoint(-41.5F, -41.7F, 32F);
		turretModel[75].rotateAngleZ = -0.34906585F;
		
		turretModel[76].addShapeBox(0F, 0F, 0F, 13, 13, 65, 0F, -3F, -3F, -0.99F, -3F, -3F, -0.99F, -3F, -3F, 2.01F, -3F, -3F, 2.01F, -3F, -3F, -0.99F, -3F, -3F, -0.99F, -3F, -3F, 2.01F, -3F, -3F, 2.01F); // Box 533
		turretModel[76].setRotationPoint(-33F, -44F, -33.5F);
		
		
		barrelModel = new ModelRendererTurbo[18];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 2804, textureX, textureY); // Box 537
		barrelModel[1] = new ModelRendererTurbo(this, 0, 2825, textureX, textureY); // Box 538
		barrelModel[2] = new ModelRendererTurbo(this, 0, 2846, textureX, textureY); // Box 539
		barrelModel[3] = new ModelRendererTurbo(this, 0, 2866, textureX, textureY); // Box 540
		barrelModel[4] = new ModelRendererTurbo(this, 0, 2872, textureX, textureY); // Box 541
		barrelModel[5] = new ModelRendererTurbo(this, 0, 2880, textureX, textureY); // Box 542
		barrelModel[6] = new ModelRendererTurbo(this, 0, 2892, textureX, textureY); // Box 543
		barrelModel[7] = new ModelRendererTurbo(this, 0, 2905, textureX, textureY); // Box 544
		barrelModel[8] = new ModelRendererTurbo(this, 0, 2922, textureX, textureY); // Box 545
		barrelModel[9] = new ModelRendererTurbo(this, 0, 2934, textureX, textureY); // Box 546
		barrelModel[10] = new ModelRendererTurbo(this, 0, 2946, textureX, textureY); // Box 547
		barrelModel[11] = new ModelRendererTurbo(this, 0, 2958, textureX, textureY); // Box 548
		barrelModel[12] = new ModelRendererTurbo(this, 0, 2968, textureX, textureY); // Box 549
		barrelModel[13] = new ModelRendererTurbo(this, 0, 2974, textureX, textureY); // Box 550
		barrelModel[14] = new ModelRendererTurbo(this, 0, 2980, textureX, textureY); // Box 551
		barrelModel[15] = new ModelRendererTurbo(this, 0, 2984, textureX, textureY); // Box 552
		barrelModel[16] = new ModelRendererTurbo(this, 0, 2988, textureX, textureY); // Box 503
		barrelModel[17] = new ModelRendererTurbo(this, 0, 2993, textureX, textureY); // Box 522
		
		barrelModel[0].addShapeBox(0F, -8F, -5.5F, 15, 8, 11, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		barrelModel[0].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[1].addShapeBox(0F, -1F, -5.5F, 31, 8, 11, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 538
		barrelModel[1].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[2].addShapeBox(15F, -7F, -5.5F, 16, 7, 11, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		barrelModel[2].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[3].addShapeBox(3F, -9F, -1F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		barrelModel[3].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[4].addShapeBox(8F, -9.5F, -1.5F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		barrelModel[4].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[5].addShapeBox(24F, -2.5F, -1.5F, 12, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		barrelModel[5].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[6].addShapeBox(36F, -2.5F, -1.5F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 543
		barrelModel[6].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[7].addShapeBox(38F, -4.5F, -2.5F, 11, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		barrelModel[7].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[8].addShapeBox(49F, -2.5F, -1.5F, 2, 5, 5, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 545
		barrelModel[8].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[9].addShapeBox(51F, -2.5F, -1.5F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		barrelModel[9].setRotationPoint(37F, -35F, 0F);
		
		barrelModel[10].addTrapezoid(51F, -2.5F, -1.5F, 1, 5, 5, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 547
		barrelModel[10].setRotationPoint(39F, -35F, 0F);
		
		barrelModel[11].addTrapezoid(52F, -2F, -1F, 39, 4, 4, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 548
		barrelModel[11].setRotationPoint(39F, -35F, 0F);
		
		barrelModel[12].addShapeBox(91F, -1.5F, -0.5F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		barrelModel[12].setRotationPoint(39F, -35F, 0F);
		
		barrelModel[13].addShapeBox(91F, 0.5F, -0.5F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		barrelModel[13].setRotationPoint(39F, -35F, 0F);
		
		barrelModel[14].addTrapezoid(91F, -0.5F, -0.5F, 7, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 551
		barrelModel[14].setRotationPoint(39F, -35F, 0F);
		
		barrelModel[15].addTrapezoid(91F, -0.5F, 1.5F, 7, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 552
		barrelModel[15].setRotationPoint(39F, -35F, 0F);
		
		barrelModel[16].addBox(93F, -0.5F, -1.5F, 4, 1, 1, 0F); // Box 503
		barrelModel[16].setRotationPoint(39F, -35F, 0F);
		
		barrelModel[17].addShapeBox(24F, -2.5F, -3.5F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		barrelModel[17].setRotationPoint(37F, -35F, 0F);
		
		
		leftTrackWheelModels = new ModelRendererTurbo[115];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 2998, textureX, textureY); // Box 118
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 3015, textureX, textureY); // Box 122
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 3030, textureX, textureY); // Box 123
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 3044, textureX, textureY); // Box 124
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 3058, textureX, textureY); // Box 125
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 126
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 127
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 128
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 129
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 130
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 131
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 171
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 172
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 173
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 174
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 175
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 176
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 177
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 178
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 179
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 195
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 196
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 197
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 198
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 199
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 200
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 201
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 202
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 203
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 204
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 205
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 206
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 207
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 208
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 209
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 210
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 211
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 212
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 213
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 214
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 215
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 216
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 217
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 218
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 219
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 220
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 221
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 222
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 223
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 224
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 225
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 226
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 227
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 228
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 229
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 230
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 231
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 232
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 233
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 234
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 235
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 236
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 237
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 238
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 239
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 240
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 241
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 242
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 243
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 244
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 245
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 246
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 247
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 248
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 249
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 250
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 251
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 252
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 253
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 254
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 255
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 256
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 257
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 258
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 259
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 260
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 261
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 262
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 263
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 264
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 265
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 266
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 267
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 268
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 269
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 270
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 271
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 272
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 273
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 274
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 275
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 276
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 277
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 278
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 279
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 280
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 281
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 282
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 283
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 284
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 0, 3155, textureX, textureY); // Box 285
		leftTrackWheelModels[111] = new ModelRendererTurbo(this, 0, 3168, textureX, textureY); // Box 286
		leftTrackWheelModels[112] = new ModelRendererTurbo(this, 0, 3183, textureX, textureY); // Box 287
		leftTrackWheelModels[113] = new ModelRendererTurbo(this, 0, 3200, textureX, textureY); // Box 288
		leftTrackWheelModels[114] = new ModelRendererTurbo(this, 0, 3215, textureX, textureY); // Box 289
		
		leftTrackWheelModels[0].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftTrackWheelModels[0].setRotationPoint(75.5F, -7.5F, -38.5F);
		
		leftTrackWheelModels[1].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		leftTrackWheelModels[1].setRotationPoint(75.5F, -7.5F, -38.5F);
		
		leftTrackWheelModels[2].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 123
		leftTrackWheelModels[2].setRotationPoint(75.5F, -7.5F, -38.5F);
		
		leftTrackWheelModels[3].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		leftTrackWheelModels[3].setRotationPoint(75.5F, -7.5F, -38.5F);
		
		leftTrackWheelModels[4].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 9, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftTrackWheelModels[4].setRotationPoint(75.5F, -7.5F, -38.5F);
		
		leftTrackWheelModels[5].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftTrackWheelModels[5].setRotationPoint(54F, 3F, -35.5F);
		
		leftTrackWheelModels[6].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftTrackWheelModels[6].setRotationPoint(54F, 3F, -35.5F);
		
		leftTrackWheelModels[7].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftTrackWheelModels[7].setRotationPoint(54F, 3F, -35.5F);
		
		leftTrackWheelModels[8].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 129
		leftTrackWheelModels[8].setRotationPoint(54F, 3F, -35.5F);
		
		leftTrackWheelModels[9].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 130
		leftTrackWheelModels[9].setRotationPoint(54F, 3F, -35.5F);
		
		leftTrackWheelModels[10].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 131
		leftTrackWheelModels[10].setRotationPoint(54F, 3F, -39.5F);
		
		leftTrackWheelModels[11].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		leftTrackWheelModels[11].setRotationPoint(54F, 3F, -39.5F);
		
		leftTrackWheelModels[12].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 172
		leftTrackWheelModels[12].setRotationPoint(54F, 3F, -39.5F);
		
		leftTrackWheelModels[13].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 173
		leftTrackWheelModels[13].setRotationPoint(54F, 3F, -39.5F);
		
		leftTrackWheelModels[14].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 174
		leftTrackWheelModels[14].setRotationPoint(54F, 3F, -39.5F);
		
		leftTrackWheelModels[15].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 175
		leftTrackWheelModels[15].setRotationPoint(54F, 3F, -32.5F);
		
		leftTrackWheelModels[16].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 176
		leftTrackWheelModels[16].setRotationPoint(54F, 3F, -32.5F);
		
		leftTrackWheelModels[17].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		leftTrackWheelModels[17].setRotationPoint(54F, 3F, -32.5F);
		
		leftTrackWheelModels[18].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 178
		leftTrackWheelModels[18].setRotationPoint(54F, 3F, -32.5F);
		
		leftTrackWheelModels[19].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 179
		leftTrackWheelModels[19].setRotationPoint(54F, 3F, -32.5F);
		
		leftTrackWheelModels[20].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 195
		leftTrackWheelModels[20].setRotationPoint(33F, 3F, -32.5F);
		
		leftTrackWheelModels[21].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		leftTrackWheelModels[21].setRotationPoint(33F, 3F, -35.5F);
		
		leftTrackWheelModels[22].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 197
		leftTrackWheelModels[22].setRotationPoint(33F, 3F, -39.5F);
		
		leftTrackWheelModels[23].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		leftTrackWheelModels[23].setRotationPoint(33F, 3F, -39.5F);
		
		leftTrackWheelModels[24].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		leftTrackWheelModels[24].setRotationPoint(33F, 3F, -35.5F);
		
		leftTrackWheelModels[25].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftTrackWheelModels[25].setRotationPoint(33F, 3F, -32.5F);
		
		leftTrackWheelModels[26].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 201
		leftTrackWheelModels[26].setRotationPoint(33F, 3F, -32.5F);
		
		leftTrackWheelModels[27].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 202
		leftTrackWheelModels[27].setRotationPoint(33F, 3F, -35.5F);
		
		leftTrackWheelModels[28].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 203
		leftTrackWheelModels[28].setRotationPoint(33F, 3F, -39.5F);
		
		leftTrackWheelModels[29].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 204
		leftTrackWheelModels[29].setRotationPoint(33F, 3F, -39.5F);
		
		leftTrackWheelModels[30].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 205
		leftTrackWheelModels[30].setRotationPoint(33F, 3F, -35.5F);
		
		leftTrackWheelModels[31].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 206
		leftTrackWheelModels[31].setRotationPoint(33F, 3F, -32.5F);
		
		leftTrackWheelModels[32].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 207
		leftTrackWheelModels[32].setRotationPoint(33F, 3F, -32.5F);
		
		leftTrackWheelModels[33].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		leftTrackWheelModels[33].setRotationPoint(33F, 3F, -35.5F);
		
		leftTrackWheelModels[34].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 209
		leftTrackWheelModels[34].setRotationPoint(33F, 3F, -39.5F);
		
		leftTrackWheelModels[35].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 210
		leftTrackWheelModels[35].setRotationPoint(14.5F, 3F, -32.5F);
		
		leftTrackWheelModels[36].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftTrackWheelModels[36].setRotationPoint(14.5F, 3F, -35.5F);
		
		leftTrackWheelModels[37].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 212
		leftTrackWheelModels[37].setRotationPoint(14.5F, 3F, -39.5F);
		
		leftTrackWheelModels[38].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		leftTrackWheelModels[38].setRotationPoint(14.5F, 3F, -39.5F);
		
		leftTrackWheelModels[39].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		leftTrackWheelModels[39].setRotationPoint(14.5F, 3F, -35.5F);
		
		leftTrackWheelModels[40].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		leftTrackWheelModels[40].setRotationPoint(14.5F, 3F, -32.5F);
		
		leftTrackWheelModels[41].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 216
		leftTrackWheelModels[41].setRotationPoint(14.5F, 3F, -32.5F);
		
		leftTrackWheelModels[42].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 217
		leftTrackWheelModels[42].setRotationPoint(14.5F, 3F, -35.5F);
		
		leftTrackWheelModels[43].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 218
		leftTrackWheelModels[43].setRotationPoint(14.5F, 3F, -39.5F);
		
		leftTrackWheelModels[44].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 219
		leftTrackWheelModels[44].setRotationPoint(14.5F, 3F, -39.5F);
		
		leftTrackWheelModels[45].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 220
		leftTrackWheelModels[45].setRotationPoint(14.5F, 3F, -35.5F);
		
		leftTrackWheelModels[46].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 221
		leftTrackWheelModels[46].setRotationPoint(14.5F, 3F, -32.5F);
		
		leftTrackWheelModels[47].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 222
		leftTrackWheelModels[47].setRotationPoint(14.5F, 3F, -32.5F);
		
		leftTrackWheelModels[48].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		leftTrackWheelModels[48].setRotationPoint(14.5F, 3F, -35.5F);
		
		leftTrackWheelModels[49].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 224
		leftTrackWheelModels[49].setRotationPoint(14.5F, 3F, -39.5F);
		
		leftTrackWheelModels[50].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 225
		leftTrackWheelModels[50].setRotationPoint(-4F, 3F, -32.5F);
		
		leftTrackWheelModels[51].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		leftTrackWheelModels[51].setRotationPoint(-4F, 3F, -35.5F);
		
		leftTrackWheelModels[52].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 227
		leftTrackWheelModels[52].setRotationPoint(-4F, 3F, -39.5F);
		
		leftTrackWheelModels[53].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		leftTrackWheelModels[53].setRotationPoint(-4F, 3F, -39.5F);
		
		leftTrackWheelModels[54].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		leftTrackWheelModels[54].setRotationPoint(-4F, 3F, -35.5F);
		
		leftTrackWheelModels[55].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		leftTrackWheelModels[55].setRotationPoint(-4F, 3F, -32.5F);
		
		leftTrackWheelModels[56].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 231
		leftTrackWheelModels[56].setRotationPoint(-4F, 3F, -32.5F);
		
		leftTrackWheelModels[57].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 232
		leftTrackWheelModels[57].setRotationPoint(-4F, 3F, -35.5F);
		
		leftTrackWheelModels[58].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 233
		leftTrackWheelModels[58].setRotationPoint(-4F, 3F, -39.5F);
		
		leftTrackWheelModels[59].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 234
		leftTrackWheelModels[59].setRotationPoint(-4F, 3F, -39.5F);
		
		leftTrackWheelModels[60].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 235
		leftTrackWheelModels[60].setRotationPoint(-4F, 3F, -35.5F);
		
		leftTrackWheelModels[61].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 236
		leftTrackWheelModels[61].setRotationPoint(-4F, 3F, -32.5F);
		
		leftTrackWheelModels[62].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 237
		leftTrackWheelModels[62].setRotationPoint(-4F, 3F, -32.5F);
		
		leftTrackWheelModels[63].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		leftTrackWheelModels[63].setRotationPoint(-4F, 3F, -35.5F);
		
		leftTrackWheelModels[64].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 239
		leftTrackWheelModels[64].setRotationPoint(-4F, 3F, -39.5F);
		
		leftTrackWheelModels[65].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 240
		leftTrackWheelModels[65].setRotationPoint(-24.5F, 3F, -32.5F);
		
		leftTrackWheelModels[66].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		leftTrackWheelModels[66].setRotationPoint(-24.5F, 3F, -35.5F);
		
		leftTrackWheelModels[67].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 242
		leftTrackWheelModels[67].setRotationPoint(-24.5F, 3F, -39.5F);
		
		leftTrackWheelModels[68].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftTrackWheelModels[68].setRotationPoint(-24.5F, 3F, -39.5F);
		
		leftTrackWheelModels[69].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		leftTrackWheelModels[69].setRotationPoint(-24.5F, 3F, -35.5F);
		
		leftTrackWheelModels[70].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		leftTrackWheelModels[70].setRotationPoint(-24.5F, 3F, -32.5F);
		
		leftTrackWheelModels[71].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 246
		leftTrackWheelModels[71].setRotationPoint(-24.5F, 3F, -32.5F);
		
		leftTrackWheelModels[72].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 247
		leftTrackWheelModels[72].setRotationPoint(-24.5F, 3F, -35.5F);
		
		leftTrackWheelModels[73].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 248
		leftTrackWheelModels[73].setRotationPoint(-24.5F, 3F, -39.5F);
		
		leftTrackWheelModels[74].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 249
		leftTrackWheelModels[74].setRotationPoint(-24.5F, 3F, -39.5F);
		
		leftTrackWheelModels[75].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 250
		leftTrackWheelModels[75].setRotationPoint(-24.5F, 3F, -35.5F);
		
		leftTrackWheelModels[76].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 251
		leftTrackWheelModels[76].setRotationPoint(-24.5F, 3F, -32.5F);
		
		leftTrackWheelModels[77].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 252
		leftTrackWheelModels[77].setRotationPoint(-24.5F, 3F, -32.5F);
		
		leftTrackWheelModels[78].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		leftTrackWheelModels[78].setRotationPoint(-24.5F, 3F, -35.5F);
		
		leftTrackWheelModels[79].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 254
		leftTrackWheelModels[79].setRotationPoint(-24.5F, 3F, -39.5F);
		
		leftTrackWheelModels[80].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 255
		leftTrackWheelModels[80].setRotationPoint(-45F, 3F, -32.5F);
		
		leftTrackWheelModels[81].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		leftTrackWheelModels[81].setRotationPoint(-45F, 3F, -35.5F);
		
		leftTrackWheelModels[82].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 257
		leftTrackWheelModels[82].setRotationPoint(-45F, 3F, -39.5F);
		
		leftTrackWheelModels[83].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		leftTrackWheelModels[83].setRotationPoint(-45F, 3F, -39.5F);
		
		leftTrackWheelModels[84].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		leftTrackWheelModels[84].setRotationPoint(-45F, 3F, -35.5F);
		
		leftTrackWheelModels[85].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		leftTrackWheelModels[85].setRotationPoint(-45F, 3F, -32.5F);
		
		leftTrackWheelModels[86].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 261
		leftTrackWheelModels[86].setRotationPoint(-45F, 3F, -32.5F);
		
		leftTrackWheelModels[87].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 262
		leftTrackWheelModels[87].setRotationPoint(-45F, 3F, -35.5F);
		
		leftTrackWheelModels[88].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 263
		leftTrackWheelModels[88].setRotationPoint(-45F, 3F, -39.5F);
		
		leftTrackWheelModels[89].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 264
		leftTrackWheelModels[89].setRotationPoint(-45F, 3F, -39.5F);
		
		leftTrackWheelModels[90].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 265
		leftTrackWheelModels[90].setRotationPoint(-45F, 3F, -35.5F);
		
		leftTrackWheelModels[91].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 266
		leftTrackWheelModels[91].setRotationPoint(-45F, 3F, -32.5F);
		
		leftTrackWheelModels[92].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 267
		leftTrackWheelModels[92].setRotationPoint(-45F, 3F, -32.5F);
		
		leftTrackWheelModels[93].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		leftTrackWheelModels[93].setRotationPoint(-45F, 3F, -35.5F);
		
		leftTrackWheelModels[94].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 269
		leftTrackWheelModels[94].setRotationPoint(-45F, 3F, -39.5F);
		
		leftTrackWheelModels[95].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 270
		leftTrackWheelModels[95].setRotationPoint(-66F, 3F, -32.5F);
		
		leftTrackWheelModels[96].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftTrackWheelModels[96].setRotationPoint(-66F, 3F, -35.5F);
		
		leftTrackWheelModels[97].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 272
		leftTrackWheelModels[97].setRotationPoint(-66F, 3F, -39.5F);
		
		leftTrackWheelModels[98].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftTrackWheelModels[98].setRotationPoint(-66F, 3F, -39.5F);
		
		leftTrackWheelModels[99].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		leftTrackWheelModels[99].setRotationPoint(-66F, 3F, -35.5F);
		
		leftTrackWheelModels[100].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		leftTrackWheelModels[100].setRotationPoint(-66F, 3F, -32.5F);
		
		leftTrackWheelModels[101].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 276
		leftTrackWheelModels[101].setRotationPoint(-66F, 3F, -32.5F);
		
		leftTrackWheelModels[102].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 277
		leftTrackWheelModels[102].setRotationPoint(-66F, 3F, -35.5F);
		
		leftTrackWheelModels[103].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 278
		leftTrackWheelModels[103].setRotationPoint(-66F, 3F, -39.5F);
		
		leftTrackWheelModels[104].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 279
		leftTrackWheelModels[104].setRotationPoint(-66F, 3F, -39.5F);
		
		leftTrackWheelModels[105].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 280
		leftTrackWheelModels[105].setRotationPoint(-66F, 3F, -35.5F);
		
		leftTrackWheelModels[106].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 281
		leftTrackWheelModels[106].setRotationPoint(-66F, 3F, -32.5F);
		
		leftTrackWheelModels[107].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 282
		leftTrackWheelModels[107].setRotationPoint(-66F, 3F, -32.5F);
		
		leftTrackWheelModels[108].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		leftTrackWheelModels[108].setRotationPoint(-66F, 3F, -35.5F);
		
		leftTrackWheelModels[109].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 284
		leftTrackWheelModels[109].setRotationPoint(-66F, 3F, -39.5F);
		
		leftTrackWheelModels[110].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 285
		leftTrackWheelModels[110].setRotationPoint(-81.5F, -7.5F, -38.5F);
		
		leftTrackWheelModels[111].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 286
		leftTrackWheelModels[111].setRotationPoint(-81.5F, -7.5F, -38.5F);
		
		leftTrackWheelModels[112].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		leftTrackWheelModels[112].setRotationPoint(-81.5F, -7.5F, -38.5F);
		
		leftTrackWheelModels[113].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 9, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		leftTrackWheelModels[113].setRotationPoint(-81.5F, -7.5F, -38.5F);
		
		leftTrackWheelModels[114].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		leftTrackWheelModels[114].setRotationPoint(-81.5F, -7.5F, -38.5F);
		
		
		rightTrackWheelModels = new ModelRendererTurbo[115];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 2998, textureX, textureY); // Box 290
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 3015, textureX, textureY); // Box 291
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 3030, textureX, textureY); // Box 292
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 3044, textureX, textureY); // Box 293
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 3058, textureX, textureY); // Box 294
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 295
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 296
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 297
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 298
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 299
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 300
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 301
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 302
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 303
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 304
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 305
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 306
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 307
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 308
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 309
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 310
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 311
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 312
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 313
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 314
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 315
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 316
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 317
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 318
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 319
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 320
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 321
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 322
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 323
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 324
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 325
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 326
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 327
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 328
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 329
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 3155, textureX, textureY); // Box 330
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 3168, textureX, textureY); // Box 331
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 3183, textureX, textureY); // Box 332
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 3200, textureX, textureY); // Box 333
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 3215, textureX, textureY); // Box 334
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 335
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 336
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 337
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 338
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 339
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 340
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 341
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 342
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 343
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 344
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 345
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 346
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 347
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 348
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 349
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 350
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 351
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 352
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 353
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 354
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 355
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 356
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 357
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 358
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 359
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 360
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 361
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 362
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 363
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 364
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 3086, textureX, textureY); // Box 365
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 366
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 3080, textureX, textureY); // Box 367
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 368
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 3072, textureX, textureY); // Box 369
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 370
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 371
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 372
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 373
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 374
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 375
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 376
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 377
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 378
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 379
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 380
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 381
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 382
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 383
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 384
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 385
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 386
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 387
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 388
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 389
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 390
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 391
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 392
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 393
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 394
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 395
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 396
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 397
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 398
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 399
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 0, 3100, textureX, textureY); // Box 400
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 401
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 0, 3135, textureX, textureY); // Box 402
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 0, 3145, textureX, textureY); // Box 403
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 0, 3125, textureX, textureY); // Box 404
		
		rightTrackWheelModels[0].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackWheelModels[0].setRotationPoint(75.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[1].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 291
		rightTrackWheelModels[1].setRotationPoint(75.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[2].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 292
		rightTrackWheelModels[2].setRotationPoint(75.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[3].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightTrackWheelModels[3].setRotationPoint(75.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[4].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 9, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackWheelModels[4].setRotationPoint(75.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[5].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 295
		rightTrackWheelModels[5].setRotationPoint(54F, 3F, 28.5F);
		
		rightTrackWheelModels[6].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 296
		rightTrackWheelModels[6].setRotationPoint(54F, 3F, 28.5F);
		
		rightTrackWheelModels[7].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightTrackWheelModels[7].setRotationPoint(54F, 3F, 28.5F);
		
		rightTrackWheelModels[8].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 298
		rightTrackWheelModels[8].setRotationPoint(54F, 3F, 28.5F);
		
		rightTrackWheelModels[9].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 299
		rightTrackWheelModels[9].setRotationPoint(54F, 3F, 28.5F);
		
		rightTrackWheelModels[10].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 300
		rightTrackWheelModels[10].setRotationPoint(33F, 3F, 28.5F);
		
		rightTrackWheelModels[11].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightTrackWheelModels[11].setRotationPoint(33F, 3F, 28.5F);
		
		rightTrackWheelModels[12].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 302
		rightTrackWheelModels[12].setRotationPoint(33F, 3F, 28.5F);
		
		rightTrackWheelModels[13].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 303
		rightTrackWheelModels[13].setRotationPoint(33F, 3F, 28.5F);
		
		rightTrackWheelModels[14].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 304
		rightTrackWheelModels[14].setRotationPoint(33F, 3F, 28.5F);
		
		rightTrackWheelModels[15].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 305
		rightTrackWheelModels[15].setRotationPoint(14.5F, 3F, 28.5F);
		
		rightTrackWheelModels[16].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightTrackWheelModels[16].setRotationPoint(14.5F, 3F, 28.5F);
		
		rightTrackWheelModels[17].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 307
		rightTrackWheelModels[17].setRotationPoint(14.5F, 3F, 28.5F);
		
		rightTrackWheelModels[18].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 308
		rightTrackWheelModels[18].setRotationPoint(14.5F, 3F, 28.5F);
		
		rightTrackWheelModels[19].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 309
		rightTrackWheelModels[19].setRotationPoint(14.5F, 3F, 28.5F);
		
		rightTrackWheelModels[20].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 310
		rightTrackWheelModels[20].setRotationPoint(-4F, 3F, 28.5F);
		
		rightTrackWheelModels[21].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		rightTrackWheelModels[21].setRotationPoint(-4F, 3F, 28.5F);
		
		rightTrackWheelModels[22].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 312
		rightTrackWheelModels[22].setRotationPoint(-4F, 3F, 28.5F);
		
		rightTrackWheelModels[23].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 313
		rightTrackWheelModels[23].setRotationPoint(-4F, 3F, 28.5F);
		
		rightTrackWheelModels[24].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 314
		rightTrackWheelModels[24].setRotationPoint(-4F, 3F, 28.5F);
		
		rightTrackWheelModels[25].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 315
		rightTrackWheelModels[25].setRotationPoint(-24.5F, 3F, 28.5F);
		
		rightTrackWheelModels[26].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightTrackWheelModels[26].setRotationPoint(-24.5F, 3F, 28.5F);
		
		rightTrackWheelModels[27].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 317
		rightTrackWheelModels[27].setRotationPoint(-24.5F, 3F, 28.5F);
		
		rightTrackWheelModels[28].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 318
		rightTrackWheelModels[28].setRotationPoint(-24.5F, 3F, 28.5F);
		
		rightTrackWheelModels[29].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 319
		rightTrackWheelModels[29].setRotationPoint(-24.5F, 3F, 28.5F);
		
		rightTrackWheelModels[30].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 320
		rightTrackWheelModels[30].setRotationPoint(-45F, 3F, 28.5F);
		
		rightTrackWheelModels[31].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		rightTrackWheelModels[31].setRotationPoint(-45F, 3F, 28.5F);
		
		rightTrackWheelModels[32].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 322
		rightTrackWheelModels[32].setRotationPoint(-45F, 3F, 28.5F);
		
		rightTrackWheelModels[33].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 323
		rightTrackWheelModels[33].setRotationPoint(-45F, 3F, 28.5F);
		
		rightTrackWheelModels[34].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 324
		rightTrackWheelModels[34].setRotationPoint(-45F, 3F, 28.5F);
		
		rightTrackWheelModels[35].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 325
		rightTrackWheelModels[35].setRotationPoint(-66F, 3F, 28.5F);
		
		rightTrackWheelModels[36].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		rightTrackWheelModels[36].setRotationPoint(-66F, 3F, 28.5F);
		
		rightTrackWheelModels[37].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 327
		rightTrackWheelModels[37].setRotationPoint(-66F, 3F, 28.5F);
		
		rightTrackWheelModels[38].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 328
		rightTrackWheelModels[38].setRotationPoint(-66F, 3F, 28.5F);
		
		rightTrackWheelModels[39].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 329
		rightTrackWheelModels[39].setRotationPoint(-66F, 3F, 28.5F);
		
		rightTrackWheelModels[40].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 330
		rightTrackWheelModels[40].setRotationPoint(-81.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[41].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 331
		rightTrackWheelModels[41].setRotationPoint(-81.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[42].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		rightTrackWheelModels[42].setRotationPoint(-81.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[43].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 9, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		rightTrackWheelModels[43].setRotationPoint(-81.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[44].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 9, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		rightTrackWheelModels[44].setRotationPoint(-81.5F, -7.5F, 29.5F);
		
		rightTrackWheelModels[45].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		rightTrackWheelModels[45].setRotationPoint(54F, 3F, 32.5F);
		
		rightTrackWheelModels[46].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		rightTrackWheelModels[46].setRotationPoint(54F, 3F, 32.5F);
		
		rightTrackWheelModels[47].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightTrackWheelModels[47].setRotationPoint(54F, 3F, 32.5F);
		
		rightTrackWheelModels[48].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 338
		rightTrackWheelModels[48].setRotationPoint(54F, 3F, 32.5F);
		
		rightTrackWheelModels[49].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 339
		rightTrackWheelModels[49].setRotationPoint(54F, 3F, 32.5F);
		
		rightTrackWheelModels[50].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		rightTrackWheelModels[50].setRotationPoint(33F, 3F, 32.5F);
		
		rightTrackWheelModels[51].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		rightTrackWheelModels[51].setRotationPoint(33F, 3F, 32.5F);
		
		rightTrackWheelModels[52].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 342
		rightTrackWheelModels[52].setRotationPoint(33F, 3F, 32.5F);
		
		rightTrackWheelModels[53].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 343
		rightTrackWheelModels[53].setRotationPoint(33F, 3F, 32.5F);
		
		rightTrackWheelModels[54].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		rightTrackWheelModels[54].setRotationPoint(33F, 3F, 32.5F);
		
		rightTrackWheelModels[55].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		rightTrackWheelModels[55].setRotationPoint(14.5F, 3F, 32.5F);
		
		rightTrackWheelModels[56].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		rightTrackWheelModels[56].setRotationPoint(14.5F, 3F, 32.5F);
		
		rightTrackWheelModels[57].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 347
		rightTrackWheelModels[57].setRotationPoint(14.5F, 3F, 32.5F);
		
		rightTrackWheelModels[58].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 348
		rightTrackWheelModels[58].setRotationPoint(14.5F, 3F, 32.5F);
		
		rightTrackWheelModels[59].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		rightTrackWheelModels[59].setRotationPoint(14.5F, 3F, 32.5F);
		
		rightTrackWheelModels[60].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		rightTrackWheelModels[60].setRotationPoint(-4F, 3F, 32.5F);
		
		rightTrackWheelModels[61].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		rightTrackWheelModels[61].setRotationPoint(-4F, 3F, 32.5F);
		
		rightTrackWheelModels[62].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 352
		rightTrackWheelModels[62].setRotationPoint(-4F, 3F, 32.5F);
		
		rightTrackWheelModels[63].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 353
		rightTrackWheelModels[63].setRotationPoint(-4F, 3F, 32.5F);
		
		rightTrackWheelModels[64].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		rightTrackWheelModels[64].setRotationPoint(-4F, 3F, 32.5F);
		
		rightTrackWheelModels[65].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		rightTrackWheelModels[65].setRotationPoint(-24.5F, 3F, 32.5F);
		
		rightTrackWheelModels[66].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		rightTrackWheelModels[66].setRotationPoint(-24.5F, 3F, 32.5F);
		
		rightTrackWheelModels[67].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 357
		rightTrackWheelModels[67].setRotationPoint(-24.5F, 3F, 32.5F);
		
		rightTrackWheelModels[68].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 358
		rightTrackWheelModels[68].setRotationPoint(-24.5F, 3F, 32.5F);
		
		rightTrackWheelModels[69].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		rightTrackWheelModels[69].setRotationPoint(-24.5F, 3F, 32.5F);
		
		rightTrackWheelModels[70].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		rightTrackWheelModels[70].setRotationPoint(-45F, 3F, 32.5F);
		
		rightTrackWheelModels[71].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		rightTrackWheelModels[71].setRotationPoint(-45F, 3F, 32.5F);
		
		rightTrackWheelModels[72].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 362
		rightTrackWheelModels[72].setRotationPoint(-45F, 3F, 32.5F);
		
		rightTrackWheelModels[73].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 363
		rightTrackWheelModels[73].setRotationPoint(-45F, 3F, 32.5F);
		
		rightTrackWheelModels[74].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		rightTrackWheelModels[74].setRotationPoint(-45F, 3F, 32.5F);
		
		rightTrackWheelModels[75].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		rightTrackWheelModels[75].setRotationPoint(-66F, 3F, 32.5F);
		
		rightTrackWheelModels[76].addShapeBox(-7.5F, -5.5F, 0F, 15, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		rightTrackWheelModels[76].setRotationPoint(-66F, 3F, 32.5F);
		
		rightTrackWheelModels[77].addShapeBox(-7.5F, 2.5F, 0F, 15, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 367
		rightTrackWheelModels[77].setRotationPoint(-66F, 3F, 32.5F);
		
		rightTrackWheelModels[78].addShapeBox(-5.5F, 5.5F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 368
		rightTrackWheelModels[78].setRotationPoint(-66F, 3F, 32.5F);
		
		rightTrackWheelModels[79].addShapeBox(-5.5F, -7.5F, 0F, 11, 2, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		rightTrackWheelModels[79].setRotationPoint(-66F, 3F, 32.5F);
		
		rightTrackWheelModels[80].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 370
		rightTrackWheelModels[80].setRotationPoint(54F, 3F, 35.5F);
		
		rightTrackWheelModels[81].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		rightTrackWheelModels[81].setRotationPoint(54F, 3F, 35.5F);
		
		rightTrackWheelModels[82].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 372
		rightTrackWheelModels[82].setRotationPoint(54F, 3F, 35.5F);
		
		rightTrackWheelModels[83].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 373
		rightTrackWheelModels[83].setRotationPoint(54F, 3F, 35.5F);
		
		rightTrackWheelModels[84].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 374
		rightTrackWheelModels[84].setRotationPoint(54F, 3F, 35.5F);
		
		rightTrackWheelModels[85].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 375
		rightTrackWheelModels[85].setRotationPoint(33F, 3F, 35.5F);
		
		rightTrackWheelModels[86].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		rightTrackWheelModels[86].setRotationPoint(33F, 3F, 35.5F);
		
		rightTrackWheelModels[87].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 377
		rightTrackWheelModels[87].setRotationPoint(33F, 3F, 35.5F);
		
		rightTrackWheelModels[88].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 378
		rightTrackWheelModels[88].setRotationPoint(33F, 3F, 35.5F);
		
		rightTrackWheelModels[89].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 379
		rightTrackWheelModels[89].setRotationPoint(33F, 3F, 35.5F);
		
		rightTrackWheelModels[90].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 380
		rightTrackWheelModels[90].setRotationPoint(14.5F, 3F, 35.5F);
		
		rightTrackWheelModels[91].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		rightTrackWheelModels[91].setRotationPoint(14.5F, 3F, 35.5F);
		
		rightTrackWheelModels[92].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 382
		rightTrackWheelModels[92].setRotationPoint(14.5F, 3F, 35.5F);
		
		rightTrackWheelModels[93].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 383
		rightTrackWheelModels[93].setRotationPoint(14.5F, 3F, 35.5F);
		
		rightTrackWheelModels[94].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 384
		rightTrackWheelModels[94].setRotationPoint(14.5F, 3F, 35.5F);
		
		rightTrackWheelModels[95].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 385
		rightTrackWheelModels[95].setRotationPoint(-4F, 3F, 35.5F);
		
		rightTrackWheelModels[96].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		rightTrackWheelModels[96].setRotationPoint(-4F, 3F, 35.5F);
		
		rightTrackWheelModels[97].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 387
		rightTrackWheelModels[97].setRotationPoint(-4F, 3F, 35.5F);
		
		rightTrackWheelModels[98].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 388
		rightTrackWheelModels[98].setRotationPoint(-4F, 3F, 35.5F);
		
		rightTrackWheelModels[99].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 389
		rightTrackWheelModels[99].setRotationPoint(-4F, 3F, 35.5F);
		
		rightTrackWheelModels[100].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 390
		rightTrackWheelModels[100].setRotationPoint(-24.5F, 3F, 35.5F);
		
		rightTrackWheelModels[101].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		rightTrackWheelModels[101].setRotationPoint(-24.5F, 3F, 35.5F);
		
		rightTrackWheelModels[102].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 392
		rightTrackWheelModels[102].setRotationPoint(-24.5F, 3F, 35.5F);
		
		rightTrackWheelModels[103].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 393
		rightTrackWheelModels[103].setRotationPoint(-24.5F, 3F, 35.5F);
		
		rightTrackWheelModels[104].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 394
		rightTrackWheelModels[104].setRotationPoint(-24.5F, 3F, 35.5F);
		
		rightTrackWheelModels[105].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 395
		rightTrackWheelModels[105].setRotationPoint(-45F, 3F, 35.5F);
		
		rightTrackWheelModels[106].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		rightTrackWheelModels[106].setRotationPoint(-45F, 3F, 35.5F);
		
		rightTrackWheelModels[107].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 397
		rightTrackWheelModels[107].setRotationPoint(-45F, 3F, 35.5F);
		
		rightTrackWheelModels[108].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 398
		rightTrackWheelModels[108].setRotationPoint(-45F, 3F, 35.5F);
		
		rightTrackWheelModels[109].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 399
		rightTrackWheelModels[109].setRotationPoint(-45F, 3F, 35.5F);
		
		rightTrackWheelModels[110].addShapeBox(-8F, -2.5F, 0F, 16, 5, 4, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 400
		rightTrackWheelModels[110].setRotationPoint(-66F, 3F, 35.5F);
		
		rightTrackWheelModels[111].addShapeBox(-8F, -5.65F, 0F, 16, 3, 4, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		rightTrackWheelModels[111].setRotationPoint(-66F, 3F, 35.5F);
		
		rightTrackWheelModels[112].addShapeBox(-8F, 2.65F, 0F, 16, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F, -1.77F, 0.5F, 0F); // Box 402
		rightTrackWheelModels[112].setRotationPoint(-66F, 3F, 35.5F);
		
		rightTrackWheelModels[113].addShapeBox(-8F, 6.15F, 0F, 16, 2, 4, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F); // Box 403
		rightTrackWheelModels[113].setRotationPoint(-66F, 3F, 35.5F);
		
		rightTrackWheelModels[114].addShapeBox(-8F, -8.15F, 0F, 16, 2, 4, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -5.33F, -0.22F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F, -1.77F, 0F, 0F); // Box 404
		rightTrackWheelModels[114].setRotationPoint(-66F, 3F, 35.5F);
		
		
		leftAnimTrackModel = new ModelRendererTurbo[3][];
		rightAnimTrackModel = new ModelRendererTurbo[3][];
		
		//Track Animation frame 1
		leftAnimTrackModel[0] = new ModelRendererTurbo[9];
		leftAnimTrackModel[0][0] = new ModelRendererTurbo(this, 0, 3230, textureX, textureY); // Import Box405
		leftAnimTrackModel[0][1] = new ModelRendererTurbo(this, 0, 3250, textureX, textureY); // Import Box406
		leftAnimTrackModel[0][2] = new ModelRendererTurbo(this, 0, 3270, textureX, textureY); // Import Box407
		leftAnimTrackModel[0][3] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box408
		leftAnimTrackModel[0][4] = new ModelRendererTurbo(this, 0, 3310, textureX, textureY); // Import Box409
		leftAnimTrackModel[0][5] = new ModelRendererTurbo(this, 0, 3330, textureX, textureY); // Import Box410
		leftAnimTrackModel[0][6] = new ModelRendererTurbo(this, 0, 3352, textureX, textureY); // Import Box411
		leftAnimTrackModel[0][7] = new ModelRendererTurbo(this, 0, 3370, textureX, textureY); // Import Box412
		leftAnimTrackModel[0][8] = new ModelRendererTurbo(this, 0, 3390, textureX, textureY); // Import Box413
		
		leftAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box405
		leftAnimTrackModel[0][0].setRotationPoint(79.5F, -15.5F, -41.5F);
		leftAnimTrackModel[0][0].rotateAngleZ = -0.6981317F;
		
		leftAnimTrackModel[0][1].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box406
		leftAnimTrackModel[0][1].setRotationPoint(84.9F, -11F, -41.5F);
		leftAnimTrackModel[0][1].rotateAngleZ = -1.57079633F;
		
		leftAnimTrackModel[0][2].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box407
		leftAnimTrackModel[0][2].setRotationPoint(84.9F, -5F, -41.5F);
		leftAnimTrackModel[0][2].rotateAngleZ = -2.12930169F;
		
		leftAnimTrackModel[0][3].addShapeBox(0F, 0F, 0F, 27, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box408
		leftAnimTrackModel[0][3].setRotationPoint(81.8F, 0.1F, -41.5F);
		leftAnimTrackModel[0][3].rotateAngleZ = -2.64417382F;
		
		leftAnimTrackModel[0][4].addShapeBox(0F, 0F, 0F, 129, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box409
		leftAnimTrackModel[0][4].setRotationPoint(58.1F, 13F, -41.5F);
		leftAnimTrackModel[0][4].rotateAngleZ = -3.14159265F;
		
		leftAnimTrackModel[0][5].addShapeBox(0F, 0F, 0F, 24, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box410
		leftAnimTrackModel[0][5].setRotationPoint(-70.9F, 13F, -41.5F);
		leftAnimTrackModel[0][5].rotateAngleZ = -3.80481777F;
		
		leftAnimTrackModel[0][6].addShapeBox(0F, 0F, 0F, 9, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box411
		leftAnimTrackModel[0][6].setRotationPoint(-89.8F, -1.7F, -41.5F);
		leftAnimTrackModel[0][6].rotateAngleZ = -4.71238898F;
		
		leftAnimTrackModel[0][7].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box412
		leftAnimTrackModel[0][7].setRotationPoint(-89.8F, -10.7F, -41.5F);
		leftAnimTrackModel[0][7].rotateAngleZ = -5.30580093F;
		
		leftAnimTrackModel[0][8].addShapeBox(0F, 0F, 0F, 163, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box413
		leftAnimTrackModel[0][8].setRotationPoint(-85.8F, -16.7F, -41.5F);
		
		
		rightAnimTrackModel[0] = new ModelRendererTurbo[9];
		rightAnimTrackModel[0][0] = new ModelRendererTurbo(this, 0, 3230, textureX, textureY); // Import Box414
		rightAnimTrackModel[0][1] = new ModelRendererTurbo(this, 0, 3250, textureX, textureY); // Import Box415
		rightAnimTrackModel[0][2] = new ModelRendererTurbo(this, 0, 3270, textureX, textureY); // Import Box416
		rightAnimTrackModel[0][3] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box417
		rightAnimTrackModel[0][4] = new ModelRendererTurbo(this, 0, 3310, textureX, textureY); // Import Box418
		rightAnimTrackModel[0][5] = new ModelRendererTurbo(this, 0, 3330, textureX, textureY); // Import Box419
		rightAnimTrackModel[0][6] = new ModelRendererTurbo(this, 0, 3352, textureX, textureY); // Import Box420
		rightAnimTrackModel[0][7] = new ModelRendererTurbo(this, 0, 3370, textureX, textureY); // Import Box421
		rightAnimTrackModel[0][8] = new ModelRendererTurbo(this, 0, 3390, textureX, textureY); // Import Box422
		
		rightAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box414
		rightAnimTrackModel[0][0].setRotationPoint(79.5F, -15.5F, 26.5F);
		rightAnimTrackModel[0][0].rotateAngleZ = -0.6981317F;
		
		rightAnimTrackModel[0][1].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box415
		rightAnimTrackModel[0][1].setRotationPoint(84.9F, -11F, 26.5F);
		rightAnimTrackModel[0][1].rotateAngleZ = -1.57079633F;
		
		rightAnimTrackModel[0][2].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box416
		rightAnimTrackModel[0][2].setRotationPoint(84.9F, -5F, 26.5F);
		rightAnimTrackModel[0][2].rotateAngleZ = -2.12930169F;
		
		rightAnimTrackModel[0][3].addShapeBox(0F, 0F, 0F, 27, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box417
		rightAnimTrackModel[0][3].setRotationPoint(81.8F, 0.1F, 26.5F);
		rightAnimTrackModel[0][3].rotateAngleZ = -2.64417382F;
		
		rightAnimTrackModel[0][4].addShapeBox(0F, 0F, 0F, 129, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
		rightAnimTrackModel[0][4].setRotationPoint(58.1F, 13F, 26.5F);
		rightAnimTrackModel[0][4].rotateAngleZ = -3.14159265F;
		
		rightAnimTrackModel[0][5].addShapeBox(0F, 0F, 0F, 24, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box419
		rightAnimTrackModel[0][5].setRotationPoint(-70.9F, 13F, 26.5F);
		rightAnimTrackModel[0][5].rotateAngleZ = -3.80481777F;
		
		rightAnimTrackModel[0][6].addShapeBox(0F, 0F, 0F, 9, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box420
		rightAnimTrackModel[0][6].setRotationPoint(-89.8F, -1.7F, 26.5F);
		rightAnimTrackModel[0][6].rotateAngleZ = -4.71238898F;
		
		rightAnimTrackModel[0][7].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		rightAnimTrackModel[0][7].setRotationPoint(-89.8F, -10.7F, 26.5F);
		rightAnimTrackModel[0][7].rotateAngleZ = -5.30580093F;
		
		rightAnimTrackModel[0][8].addShapeBox(0F, 0F, 0F, 163, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		rightAnimTrackModel[0][8].setRotationPoint(-85.8F, -16.7F, 26.5F);
		
		
		//Animation frame 2
		leftAnimTrackModel[1] = new ModelRendererTurbo[9];
		leftAnimTrackModel[1][0] = new ModelRendererTurbo(this, 420, 3230, textureX, textureY); // Import Box405
		leftAnimTrackModel[1][1] = new ModelRendererTurbo(this, 420, 3250, textureX, textureY); // Import Box406
		leftAnimTrackModel[1][2] = new ModelRendererTurbo(this, 420, 3270, textureX, textureY); // Import Box407
		leftAnimTrackModel[1][3] = new ModelRendererTurbo(this, 420, 3290, textureX, textureY); // Import Box408
		leftAnimTrackModel[1][4] = new ModelRendererTurbo(this, 420, 3310, textureX, textureY); // Import Box409
		leftAnimTrackModel[1][5] = new ModelRendererTurbo(this, 420, 3330, textureX, textureY); // Import Box410
		leftAnimTrackModel[1][6] = new ModelRendererTurbo(this, 420, 3352, textureX, textureY); // Import Box411
		leftAnimTrackModel[1][7] = new ModelRendererTurbo(this, 420, 3370, textureX, textureY); // Import Box412
		leftAnimTrackModel[1][8] = new ModelRendererTurbo(this, 420, 3390, textureX, textureY); // Import Box413
		
		leftAnimTrackModel[1][0].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box405
		leftAnimTrackModel[1][0].setRotationPoint(79.5F, -15.5F, -41.5F);
		leftAnimTrackModel[1][0].rotateAngleZ = -0.6981317F;
		
		leftAnimTrackModel[1][1].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box406
		leftAnimTrackModel[1][1].setRotationPoint(84.9F, -11F, -41.5F);
		leftAnimTrackModel[1][1].rotateAngleZ = -1.57079633F;
		
		leftAnimTrackModel[1][2].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box407
		leftAnimTrackModel[1][2].setRotationPoint(84.9F, -5F, -41.5F);
		leftAnimTrackModel[1][2].rotateAngleZ = -2.12930169F;
		
		leftAnimTrackModel[1][3].addShapeBox(0F, 0F, 0F, 27, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box408
		leftAnimTrackModel[1][3].setRotationPoint(81.8F, 0.1F, -41.5F);
		leftAnimTrackModel[1][3].rotateAngleZ = -2.64417382F;
		
		leftAnimTrackModel[1][4].addShapeBox(0F, 0F, 0F, 129, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box409
		leftAnimTrackModel[1][4].setRotationPoint(58.1F, 13F, -41.5F);
		leftAnimTrackModel[1][4].rotateAngleZ = -3.14159265F;
		
		leftAnimTrackModel[1][5].addShapeBox(0F, 0F, 0F, 24, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box410
		leftAnimTrackModel[1][5].setRotationPoint(-70.9F, 13F, -41.5F);
		leftAnimTrackModel[1][5].rotateAngleZ = -3.80481777F;
		
		leftAnimTrackModel[1][6].addShapeBox(0F, 0F, 0F, 9, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box411
		leftAnimTrackModel[1][6].setRotationPoint(-89.8F, -1.7F, -41.5F);
		leftAnimTrackModel[1][6].rotateAngleZ = -4.71238898F;
		
		leftAnimTrackModel[1][7].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box412
		leftAnimTrackModel[1][7].setRotationPoint(-89.8F, -10.7F, -41.5F);
		leftAnimTrackModel[1][7].rotateAngleZ = -5.30580093F;
		
		leftAnimTrackModel[1][8].addShapeBox(0F, 0F, 0F, 163, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box413
		leftAnimTrackModel[1][8].setRotationPoint(-85.8F, -16.7F, -41.5F);
		
		
		rightAnimTrackModel[1] = new ModelRendererTurbo[9];
		rightAnimTrackModel[1][0] = new ModelRendererTurbo(this, 420, 3230, textureX, textureY); // Import Box414
		rightAnimTrackModel[1][1] = new ModelRendererTurbo(this, 420, 3250, textureX, textureY); // Import Box415
		rightAnimTrackModel[1][2] = new ModelRendererTurbo(this, 420, 3270, textureX, textureY); // Import Box416
		rightAnimTrackModel[1][3] = new ModelRendererTurbo(this, 420, 3290, textureX, textureY); // Import Box417
		rightAnimTrackModel[1][4] = new ModelRendererTurbo(this, 420, 3310, textureX, textureY); // Import Box418
		rightAnimTrackModel[1][5] = new ModelRendererTurbo(this, 420, 3330, textureX, textureY); // Import Box419
		rightAnimTrackModel[1][6] = new ModelRendererTurbo(this, 420, 3352, textureX, textureY); // Import Box420
		rightAnimTrackModel[1][7] = new ModelRendererTurbo(this, 420, 3370, textureX, textureY); // Import Box421
		rightAnimTrackModel[1][8] = new ModelRendererTurbo(this, 420, 3390, textureX, textureY); // Import Box422
		
		rightAnimTrackModel[1][0].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box414
		rightAnimTrackModel[1][0].setRotationPoint(79.5F, -15.5F, 26.5F);
		rightAnimTrackModel[1][0].rotateAngleZ = -0.6981317F;
		
		rightAnimTrackModel[1][1].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box415
		rightAnimTrackModel[1][1].setRotationPoint(84.9F, -11F, 26.5F);
		rightAnimTrackModel[1][1].rotateAngleZ = -1.57079633F;
		
		rightAnimTrackModel[1][2].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box416
		rightAnimTrackModel[1][2].setRotationPoint(84.9F, -5F, 26.5F);
		rightAnimTrackModel[1][2].rotateAngleZ = -2.12930169F;
		
		rightAnimTrackModel[1][3].addShapeBox(0F, 0F, 0F, 27, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box417
		rightAnimTrackModel[1][3].setRotationPoint(81.8F, 0.1F, 26.5F);
		rightAnimTrackModel[1][3].rotateAngleZ = -2.64417382F;
		
		rightAnimTrackModel[1][4].addShapeBox(0F, 0F, 0F, 129, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
		rightAnimTrackModel[1][4].setRotationPoint(58.1F, 13F, 26.5F);
		rightAnimTrackModel[1][4].rotateAngleZ = -3.14159265F;
		
		rightAnimTrackModel[1][5].addShapeBox(0F, 0F, 0F, 24, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box419
		rightAnimTrackModel[1][5].setRotationPoint(-70.9F, 13F, 26.5F);
		rightAnimTrackModel[1][5].rotateAngleZ = -3.80481777F;
		
		rightAnimTrackModel[1][6].addShapeBox(0F, 0F, 0F, 9, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box420
		rightAnimTrackModel[1][6].setRotationPoint(-89.8F, -1.7F, 26.5F);
		rightAnimTrackModel[1][6].rotateAngleZ = -4.71238898F;
		
		rightAnimTrackModel[1][7].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		rightAnimTrackModel[1][7].setRotationPoint(-89.8F, -10.7F, 26.5F);
		rightAnimTrackModel[1][7].rotateAngleZ = -5.30580093F;
		
		rightAnimTrackModel[1][8].addShapeBox(0F, 0F, 0F, 163, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		rightAnimTrackModel[1][8].setRotationPoint(-85.8F, -16.7F, 26.5F);
		
		//Animation frame 3
		
		leftAnimTrackModel[2] = new ModelRendererTurbo[9];
		leftAnimTrackModel[2][0] = new ModelRendererTurbo(this, 820, 3230, textureX, textureY); // Import Box405
		leftAnimTrackModel[2][1] = new ModelRendererTurbo(this, 820, 3250, textureX, textureY); // Import Box406
		leftAnimTrackModel[2][2] = new ModelRendererTurbo(this, 820, 3270, textureX, textureY); // Import Box407
		leftAnimTrackModel[2][3] = new ModelRendererTurbo(this, 820, 3290, textureX, textureY); // Import Box408
		leftAnimTrackModel[2][4] = new ModelRendererTurbo(this, 820, 3310, textureX, textureY); // Import Box409
		leftAnimTrackModel[2][5] = new ModelRendererTurbo(this, 820, 3330, textureX, textureY); // Import Box410
		leftAnimTrackModel[2][6] = new ModelRendererTurbo(this, 820, 3352, textureX, textureY); // Import Box411
		leftAnimTrackModel[2][7] = new ModelRendererTurbo(this, 820, 3370, textureX, textureY); // Import Box412
		leftAnimTrackModel[2][8] = new ModelRendererTurbo(this, 820, 3390, textureX, textureY); // Import Box413
		
		leftAnimTrackModel[2][0].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box405
		leftAnimTrackModel[2][0].setRotationPoint(79.5F, -15.5F, -41.5F);
		leftAnimTrackModel[2][0].rotateAngleZ = -0.6981317F;
		
		leftAnimTrackModel[2][1].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box406
		leftAnimTrackModel[2][1].setRotationPoint(84.9F, -11F, -41.5F);
		leftAnimTrackModel[2][1].rotateAngleZ = -1.57079633F;
		
		leftAnimTrackModel[2][2].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box407
		leftAnimTrackModel[2][2].setRotationPoint(84.9F, -5F, -41.5F);
		leftAnimTrackModel[2][2].rotateAngleZ = -2.12930169F;
		
		leftAnimTrackModel[2][3].addShapeBox(0F, 0F, 0F, 27, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box408
		leftAnimTrackModel[2][3].setRotationPoint(81.8F, 0.1F, -41.5F);
		leftAnimTrackModel[2][3].rotateAngleZ = -2.64417382F;
		
		leftAnimTrackModel[2][4].addShapeBox(0F, 0F, 0F, 129, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box409
		leftAnimTrackModel[2][4].setRotationPoint(58.1F, 13F, -41.5F);
		leftAnimTrackModel[2][4].rotateAngleZ = -3.14159265F;
		
		leftAnimTrackModel[2][5].addShapeBox(0F, 0F, 0F, 24, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box410
		leftAnimTrackModel[2][5].setRotationPoint(-70.9F, 13F, -41.5F);
		leftAnimTrackModel[2][5].rotateAngleZ = -3.80481777F;
		
		leftAnimTrackModel[2][6].addShapeBox(0F, 0F, 0F, 9, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box411
		leftAnimTrackModel[2][6].setRotationPoint(-89.8F, -1.7F, -41.5F);
		leftAnimTrackModel[2][6].rotateAngleZ = -4.71238898F;
		
		leftAnimTrackModel[2][7].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box412
		leftAnimTrackModel[2][7].setRotationPoint(-89.8F, -10.7F, -41.5F);
		leftAnimTrackModel[2][7].rotateAngleZ = -5.30580093F;
		
		leftAnimTrackModel[2][8].addShapeBox(0F, 0F, 0F, 163, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box413
		leftAnimTrackModel[2][8].setRotationPoint(-85.8F, -16.7F, -41.5F);
		
		
		rightAnimTrackModel[2] = new ModelRendererTurbo[9];
		rightAnimTrackModel[2][0] = new ModelRendererTurbo(this, 820, 3230, textureX, textureY); // Import Box414
		rightAnimTrackModel[2][1] = new ModelRendererTurbo(this, 820, 3250, textureX, textureY); // Import Box415
		rightAnimTrackModel[2][2] = new ModelRendererTurbo(this, 820, 3270, textureX, textureY); // Import Box416
		rightAnimTrackModel[2][3] = new ModelRendererTurbo(this, 820, 3290, textureX, textureY); // Import Box417
		rightAnimTrackModel[2][4] = new ModelRendererTurbo(this, 820, 3310, textureX, textureY); // Import Box418
		rightAnimTrackModel[2][5] = new ModelRendererTurbo(this, 820, 3330, textureX, textureY); // Import Box419
		rightAnimTrackModel[2][6] = new ModelRendererTurbo(this, 820, 3352, textureX, textureY); // Import Box420
		rightAnimTrackModel[2][7] = new ModelRendererTurbo(this, 820, 3370, textureX, textureY); // Import Box421
		rightAnimTrackModel[2][8] = new ModelRendererTurbo(this, 820, 3390, textureX, textureY); // Import Box422
		
		rightAnimTrackModel[2][0].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box414
		rightAnimTrackModel[2][0].setRotationPoint(79.5F, -15.5F, 26.5F);
		rightAnimTrackModel[2][0].rotateAngleZ = -0.6981317F;
		
		rightAnimTrackModel[2][1].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box415
		rightAnimTrackModel[2][1].setRotationPoint(84.9F, -11F, 26.5F);
		rightAnimTrackModel[2][1].rotateAngleZ = -1.57079633F;
		
		rightAnimTrackModel[2][2].addShapeBox(0F, 0F, 0F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box416
		rightAnimTrackModel[2][2].setRotationPoint(84.9F, -5F, 26.5F);
		rightAnimTrackModel[2][2].rotateAngleZ = -2.12930169F;
		
		rightAnimTrackModel[2][3].addShapeBox(0F, 0F, 0F, 27, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box417
		rightAnimTrackModel[2][3].setRotationPoint(81.8F, 0.1F, 26.5F);
		rightAnimTrackModel[2][3].rotateAngleZ = -2.64417382F;
		
		rightAnimTrackModel[2][4].addShapeBox(0F, 0F, 0F, 129, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
		rightAnimTrackModel[2][4].setRotationPoint(58.1F, 13F, 26.5F);
		rightAnimTrackModel[2][4].rotateAngleZ = -3.14159265F;
		
		rightAnimTrackModel[2][5].addShapeBox(0F, 0F, 0F, 24, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box419
		rightAnimTrackModel[2][5].setRotationPoint(-70.9F, 13F, 26.5F);
		rightAnimTrackModel[2][5].rotateAngleZ = -3.80481777F;
		
		rightAnimTrackModel[2][6].addShapeBox(0F, 0F, 0F, 9, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box420
		rightAnimTrackModel[2][6].setRotationPoint(-89.8F, -1.7F, 26.5F);
		rightAnimTrackModel[2][6].rotateAngleZ = -4.71238898F;
		
		rightAnimTrackModel[2][7].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		rightAnimTrackModel[2][7].setRotationPoint(-89.8F, -10.7F, 26.5F);
		rightAnimTrackModel[2][7].rotateAngleZ = -5.30580093F;
		
		rightAnimTrackModel[2][8].addShapeBox(0F, 0F, 0F, 163, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		rightAnimTrackModel[2][8].setRotationPoint(-85.8F, -16.7F, 26.5F);
		
		//Copy This part into your model
		
		ModelRendererTurbo[][] noseGunModel = new ModelRendererTurbo[3][];
		
		noseGunModel[0] = new ModelRendererTurbo[11];
		noseGunModel[0][0] = new ModelRendererTurbo(this, 0, 3453, textureX, textureY); // Box 517
		noseGunModel[0][1] = new ModelRendererTurbo(this, 0, 3453, textureX, textureY); // Box 518
		noseGunModel[0][2] = new ModelRendererTurbo(this, 0, 3453, textureX, textureY); // Box 519
		noseGunModel[0][3] = new ModelRendererTurbo(this, 0, 3460, textureX, textureY); // Box 520
		noseGunModel[0][4] = new ModelRendererTurbo(this, 0, 3470, textureX, textureY); // Box 521
		noseGunModel[0][5] = new ModelRendererTurbo(this, 0, 3487, textureX, textureY); // Box 522
		noseGunModel[0][6] = new ModelRendererTurbo(this, 0, 3487, textureX, textureY); // Box 523
		noseGunModel[0][7] = new ModelRendererTurbo(this, 0, 3497, textureX, textureY); // Box 524
		noseGunModel[0][8] = new ModelRendererTurbo(this, 0, 3504, textureX, textureY); // Box 525
		noseGunModel[0][9] = new ModelRendererTurbo(this, 0, 3515, textureX, textureY); // Box 526
		noseGunModel[0][10] = new ModelRendererTurbo(this, 0, 3526, textureX, textureY); // Box 533
		
		noseGunModel[0][0].addShapeBox(-3F, 0F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		
		
		noseGunModel[0][1].addShapeBox(-3F, 0F, -3F, 6, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		
		
		noseGunModel[0][2].addShapeBox(-3F, 0F, 1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 519
		
		
		noseGunModel[0][3].addShapeBox(-2F, -3F, -2F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		
		
		noseGunModel[0][4].addShapeBox(-5F, -5F, -6F, 10, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		
		
		noseGunModel[0][5].addShapeBox(-4F, -11F, -3F, 6, 6, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 522
		
		
		noseGunModel[0][6].addShapeBox(-4F, -11F, 3F, 6, 6, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 523
		
		
		noseGunModel[0][7].addShapeBox(-6F, -12F, 4F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		
		
		noseGunModel[0][8].addShapeBox(-7F, -10F, 6F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 525
		
		
		noseGunModel[0][9].addShapeBox(-7F, -13F, 6F, 7, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		
		
		noseGunModel[0][10].addShapeBox(-11F, -5F, -4F, 6, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 533
		
		
		for(ModelRendererTurbo noseGunPart : noseGunModel[0])
			noseGunPart.setRotationPoint(-27F, -47F, -15F);
		
		noseGunModel[1] = new ModelRendererTurbo[0];
		
		
		noseGunModel[2] = new ModelRendererTurbo[6];
		noseGunModel[2][0] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 527
		noseGunModel[2][1] = new ModelRendererTurbo(this, 0, 3418, textureX, textureY); // Box 528
		noseGunModel[2][2] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 529
		noseGunModel[2][3] = new ModelRendererTurbo(this, 0, 3430, textureX, textureY); // Box 530
		noseGunModel[2][4] = new ModelRendererTurbo(this, 0, 3433, textureX, textureY); // Box 531
		noseGunModel[2][5] = new ModelRendererTurbo(this, 0, 3440, textureX, textureY); // Box 532
		
		noseGunModel[2][0].addShapeBox(-10F, -2F, -1.5F, 13, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		
		
		noseGunModel[2][1].addShapeBox(3F, -1.5F, -1F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		
		
		noseGunModel[2][2].addTrapezoid(8F, -1.5F, -1F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 529
		
		
		noseGunModel[2][3].addTrapezoid(9F, -1F, -0.5F, 11, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 530
		
		
		noseGunModel[2][4].addShapeBox(0F, -2.5F, -3F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		
		
		noseGunModel[2][5].addShapeBox(0F, -2.5F, -9F, 2, 5, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		
		
		for(ModelRendererTurbo noseGunPart : noseGunModel[2])
			noseGunPart.setRotationPoint(-27F, -54F, -15F);
		
		registerGunModel("MG3", noseGunModel);
		
		
		translateAll(0F, 0F, 0F);
		
		
		flipAll();
	}
}
