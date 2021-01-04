//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.12.2015 - 17:17:36
// Last changed on: 20.12.2015 - 17:17:36

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelM10 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM10() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[478];
		turretModel = new ModelRendererTurbo[103];
		barrelModel = new ModelRendererTurbo[31];
		leftTrackWheelModels = new ModelRendererTurbo[21];
		rightTrackWheelModels = new ModelRendererTurbo[21];
		leftTrackModel = new ModelRendererTurbo[11];
		rightTrackModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 1
		bodyModel[18] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 5
		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 7
		bodyModel[24] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 8
		bodyModel[25] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 9
		bodyModel[26] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 10
		bodyModel[27] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 11
		bodyModel[28] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		bodyModel[29] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 13
		bodyModel[30] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 14
		bodyModel[31] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 15
		bodyModel[32] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 16
		bodyModel[33] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 8
		bodyModel[34] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 9
		bodyModel[35] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 12
		bodyModel[36] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 14
		bodyModel[37] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 10
		bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 15
		bodyModel[39] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 16
		bodyModel[40] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 17
		bodyModel[41] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 18
		bodyModel[42] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 19
		bodyModel[43] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 20
		bodyModel[44] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 21
		bodyModel[45] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 664
		bodyModel[47] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 666
		bodyModel[48] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 667
		bodyModel[49] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 668
		bodyModel[50] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 632
		bodyModel[51] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 633
		bodyModel[52] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 634
		bodyModel[53] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 635
		bodyModel[54] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 636
		bodyModel[55] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 675
		bodyModel[56] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 676
		bodyModel[57] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 677
		bodyModel[58] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 678
		bodyModel[59] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 679
		bodyModel[60] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 680
		bodyModel[61] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 683
		bodyModel[62] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 684
		bodyModel[63] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 685
		bodyModel[64] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 686
		bodyModel[65] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 687
		bodyModel[66] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 688
		bodyModel[67] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 689
		bodyModel[68] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 690
		bodyModel[69] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 691
		bodyModel[70] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 692
		bodyModel[71] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 693
		bodyModel[72] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 694
		bodyModel[73] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 695
		bodyModel[74] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 696
		bodyModel[75] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 697
		bodyModel[76] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 698
		bodyModel[77] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 699
		bodyModel[78] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 700
		bodyModel[79] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 701
		bodyModel[80] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 702
		bodyModel[81] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 703
		bodyModel[82] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 704
		bodyModel[83] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 705
		bodyModel[84] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 706
		bodyModel[85] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 707
		bodyModel[86] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 708
		bodyModel[87] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 709
		bodyModel[88] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 710
		bodyModel[89] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 711
		bodyModel[90] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 712
		bodyModel[91] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 713
		bodyModel[92] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 714
		bodyModel[93] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 715
		bodyModel[94] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 716
		bodyModel[95] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 717
		bodyModel[96] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 718
		bodyModel[97] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 719
		bodyModel[98] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 720
		bodyModel[99] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 721
		bodyModel[100] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 722
		bodyModel[101] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 723
		bodyModel[102] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 724
		bodyModel[103] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 579
		bodyModel[104] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 580
		bodyModel[105] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 581
		bodyModel[106] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 734
		bodyModel[107] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 735
		bodyModel[108] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 736
		bodyModel[109] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 740
		bodyModel[110] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 741
		bodyModel[111] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 742
		bodyModel[112] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 743
		bodyModel[113] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 744
		bodyModel[114] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 745
		bodyModel[115] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 746
		bodyModel[116] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 747
		bodyModel[117] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 748
		bodyModel[118] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 749
		bodyModel[119] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 750
		bodyModel[120] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 751
		bodyModel[121] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 752
		bodyModel[122] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 753
		bodyModel[123] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 754
		bodyModel[124] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 755
		bodyModel[125] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 756
		bodyModel[126] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 585
		bodyModel[127] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 586
		bodyModel[128] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 587
		bodyModel[129] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 390
		bodyModel[130] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 392
		bodyModel[131] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 393
		bodyModel[132] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 394
		bodyModel[133] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 395
		bodyModel[134] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 396
		bodyModel[135] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 397
		bodyModel[136] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 398
		bodyModel[137] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 399
		bodyModel[138] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 400
		bodyModel[139] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 401
		bodyModel[140] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 402
		bodyModel[141] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 404
		bodyModel[142] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 405
		bodyModel[143] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 406
		bodyModel[144] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 407
		bodyModel[145] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 408
		bodyModel[146] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 409
		bodyModel[147] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 410
		bodyModel[148] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 411
		bodyModel[149] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 412
		bodyModel[150] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 413
		bodyModel[151] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 414
		bodyModel[152] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 415
		bodyModel[153] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 416
		bodyModel[154] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 417
		bodyModel[155] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 203
		bodyModel[156] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 204
		bodyModel[157] = new ModelRendererTurbo(this, 185, 360, textureX, textureY); // Box 425
		bodyModel[158] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 426
		bodyModel[159] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 427
		bodyModel[160] = new ModelRendererTurbo(this, 185, 360, textureX, textureY); // Box 430
		bodyModel[161] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 431
		bodyModel[162] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 432
		bodyModel[163] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 433
		bodyModel[164] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 434
		bodyModel[165] = new ModelRendererTurbo(this, 185, 360, textureX, textureY); // Box 435
		bodyModel[166] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 436
		bodyModel[167] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 437
		bodyModel[168] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 438
		bodyModel[169] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 439
		bodyModel[170] = new ModelRendererTurbo(this, 185, 360, textureX, textureY); // Box 440
		bodyModel[171] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 441
		bodyModel[172] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 442
		bodyModel[173] = new ModelRendererTurbo(this, 185, 360, textureX, textureY); // Box 443
		bodyModel[174] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 444
		bodyModel[175] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 445
		bodyModel[176] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 446
		bodyModel[177] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 447
		bodyModel[178] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 448
		bodyModel[179] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 449
		bodyModel[180] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 450
		bodyModel[181] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 451
		bodyModel[182] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 452
		bodyModel[183] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 453
		bodyModel[184] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 454
		bodyModel[185] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 455
		bodyModel[186] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 456
		bodyModel[187] = new ModelRendererTurbo(this, 160, 350, textureX, textureY); // Box 457
		bodyModel[188] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 461
		bodyModel[189] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 462
		bodyModel[190] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 463
		bodyModel[191] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 464
		bodyModel[192] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 465
		bodyModel[193] = new ModelRendererTurbo(this, 185, 360, textureX, textureY); // Box 466
		bodyModel[194] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 467
		bodyModel[195] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 468
		bodyModel[196] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 469
		bodyModel[197] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 470
		bodyModel[198] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 471
		bodyModel[199] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 472
		bodyModel[200] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 473
		bodyModel[201] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 474
		bodyModel[202] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 475
		bodyModel[203] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 476
		bodyModel[204] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 477
		bodyModel[205] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 478
		bodyModel[206] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 479
		bodyModel[207] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 481
		bodyModel[208] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 483
		bodyModel[209] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 484
		bodyModel[210] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 485
		bodyModel[211] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 486
		bodyModel[212] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 488
		bodyModel[213] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 489
		bodyModel[214] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 490
		bodyModel[215] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 491
		bodyModel[216] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 492
		bodyModel[217] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 493
		bodyModel[218] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 494
		bodyModel[219] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 495
		bodyModel[220] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 496
		bodyModel[221] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 497
		bodyModel[222] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 498
		bodyModel[223] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 499
		bodyModel[224] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 500
		bodyModel[225] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 501
		bodyModel[226] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 502
		bodyModel[227] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 503
		bodyModel[228] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 508
		bodyModel[229] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 509
		bodyModel[230] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 510
		bodyModel[231] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 511
		bodyModel[232] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 512
		bodyModel[233] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 513
		bodyModel[234] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 514
		bodyModel[235] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 515
		bodyModel[236] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 493
		bodyModel[237] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 494
		bodyModel[238] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 495
		bodyModel[239] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 496
		bodyModel[240] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 479
		bodyModel[241] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 480
		bodyModel[242] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 481
		bodyModel[243] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 482
		bodyModel[244] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 484
		bodyModel[245] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 485
		bodyModel[246] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 486
		bodyModel[247] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 487
		bodyModel[248] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 488
		bodyModel[249] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 489
		bodyModel[250] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 490
		bodyModel[251] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 491
		bodyModel[252] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 68
		bodyModel[253] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 495
		bodyModel[254] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 496
		bodyModel[255] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 497
		bodyModel[256] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 498
		bodyModel[257] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 499
		bodyModel[258] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 500
		bodyModel[259] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 502
		bodyModel[260] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 503
		bodyModel[261] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 504
		bodyModel[262] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 505
		bodyModel[263] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 506
		bodyModel[264] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 507
		bodyModel[265] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 509
		bodyModel[266] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 510
		bodyModel[267] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 511
		bodyModel[268] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 512
		bodyModel[269] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 513
		bodyModel[270] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 514
		bodyModel[271] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 515
		bodyModel[272] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 516
		bodyModel[273] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 517
		bodyModel[274] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 518
		bodyModel[275] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 519
		bodyModel[276] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 520
		bodyModel[277] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 521
		bodyModel[278] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 522
		bodyModel[279] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 523
		bodyModel[280] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 524
		bodyModel[281] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 525
		bodyModel[282] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 526
		bodyModel[283] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 527
		bodyModel[284] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 528
		bodyModel[285] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 529
		bodyModel[286] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 530
		bodyModel[287] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 531
		bodyModel[288] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 532
		bodyModel[289] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 533
		bodyModel[290] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 534
		bodyModel[291] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 535
		bodyModel[292] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 537
		bodyModel[293] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 539
		bodyModel[294] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 541
		bodyModel[295] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 542
		bodyModel[296] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Box 543
		bodyModel[297] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 544
		bodyModel[298] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 545
		bodyModel[299] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 546
		bodyModel[300] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 547
		bodyModel[301] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 548
		bodyModel[302] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 549
		bodyModel[303] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 550
		bodyModel[304] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 551
		bodyModel[305] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 552
		bodyModel[306] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 553
		bodyModel[307] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 554
		bodyModel[308] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 555
		bodyModel[309] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 556
		bodyModel[310] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 557
		bodyModel[311] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 558
		bodyModel[312] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 559
		bodyModel[313] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 560
		bodyModel[314] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 561
		bodyModel[315] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 562
		bodyModel[316] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 563
		bodyModel[317] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Box 564
		bodyModel[318] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 565
		bodyModel[319] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 566
		bodyModel[320] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 568
		bodyModel[321] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 570
		bodyModel[322] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 572
		bodyModel[323] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 573
		bodyModel[324] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 574
		bodyModel[325] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 575
		bodyModel[326] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 576
		bodyModel[327] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 577
		bodyModel[328] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 588
		bodyModel[329] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 591
		bodyModel[330] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 592
		bodyModel[331] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 595
		bodyModel[332] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 598
		bodyModel[333] = new ModelRendererTurbo(this, 2, 410, textureX, textureY); // Shape 601
		bodyModel[334] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 607
		bodyModel[335] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 608
		bodyModel[336] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 609
		bodyModel[337] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 610
		bodyModel[338] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 611
		bodyModel[339] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 612
		bodyModel[340] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 613
		bodyModel[341] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 614
		bodyModel[342] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 615
		bodyModel[343] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 616
		bodyModel[344] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 617
		bodyModel[345] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 618
		bodyModel[346] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 619
		bodyModel[347] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 620
		bodyModel[348] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 621
		bodyModel[349] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 622
		bodyModel[350] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Box 623
		bodyModel[351] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Box 624
		bodyModel[352] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Box 625
		bodyModel[353] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 626
		bodyModel[354] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Box 627
		bodyModel[355] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 628
		bodyModel[356] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 629
		bodyModel[357] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 630
		bodyModel[358] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 631
		bodyModel[359] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Box 632
		bodyModel[360] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 633
		bodyModel[361] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 634
		bodyModel[362] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 635
		bodyModel[363] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); // Box 636
		bodyModel[364] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // Box 637
		bodyModel[365] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 638
		bodyModel[366] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Box 639
		bodyModel[367] = new ModelRendererTurbo(this, 97, 257, textureX, textureY); // Box 640
		bodyModel[368] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Box 641
		bodyModel[369] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // Box 642
		bodyModel[370] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 643
		bodyModel[371] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Box 644
		bodyModel[372] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 645
		bodyModel[373] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 646
		bodyModel[374] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 647
		bodyModel[375] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 648
		bodyModel[376] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Box 649
		bodyModel[377] = new ModelRendererTurbo(this, 265, 257, textureX, textureY); // Box 650
		bodyModel[378] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 651
		bodyModel[379] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 652
		bodyModel[380] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Box 653
		bodyModel[381] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 654
		bodyModel[382] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 655
		bodyModel[383] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 656
		bodyModel[384] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 657
		bodyModel[385] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 658
		bodyModel[386] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Box 659
		bodyModel[387] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 660
		bodyModel[388] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 661
		bodyModel[389] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 662
		bodyModel[390] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 663
		bodyModel[391] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 664
		bodyModel[392] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Box 665
		bodyModel[393] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Box 666
		bodyModel[394] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 667
		bodyModel[395] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Box 668
		bodyModel[396] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 669
		bodyModel[397] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Box 670
		bodyModel[398] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 671
		bodyModel[399] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 672
		bodyModel[400] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 673
		bodyModel[401] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 674
		bodyModel[402] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 675
		bodyModel[403] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 676
		bodyModel[404] = new ModelRendererTurbo(this, 265, 265, textureX, textureY); // Box 677
		bodyModel[405] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 678
		bodyModel[406] = new ModelRendererTurbo(this, 313, 265, textureX, textureY); // Box 679
		bodyModel[407] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 680
		bodyModel[408] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 681
		bodyModel[409] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 682
		bodyModel[410] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 683
		bodyModel[411] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Box 684
		bodyModel[412] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 553
		bodyModel[413] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 554
		bodyModel[414] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 557
		bodyModel[415] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 558
		bodyModel[416] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 559
		bodyModel[417] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Box 560
		bodyModel[418] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 561
		bodyModel[419] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 562
		bodyModel[420] = new ModelRendererTurbo(this, 17, 273, textureX, textureY); // Box 563
		bodyModel[421] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 564
		bodyModel[422] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Box 565
		bodyModel[423] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 566
		bodyModel[424] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Box 567
		bodyModel[425] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 568
		bodyModel[426] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 569
		bodyModel[427] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Box 570
		bodyModel[428] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Box 571
		bodyModel[429] = new ModelRendererTurbo(this, 119, 330, textureX, textureY); // Box 239
		bodyModel[430] = new ModelRendererTurbo(this, 85, 331, textureX, textureY); // Box 240
		bodyModel[431] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 241
		bodyModel[432] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 242
		bodyModel[433] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 243
		bodyModel[434] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 236
		bodyModel[435] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 237
		bodyModel[436] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 238
		bodyModel[437] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 660
		bodyModel[438] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 661
		bodyModel[439] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 662
		bodyModel[440] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 663
		bodyModel[441] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 664
		bodyModel[442] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 665
		bodyModel[443] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 666
		bodyModel[444] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 667
		bodyModel[445] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 668
		bodyModel[446] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 669
		bodyModel[447] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 670
		bodyModel[448] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 671
		bodyModel[449] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 672
		bodyModel[450] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 673
		bodyModel[451] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 674
		bodyModel[452] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 675
		bodyModel[453] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 676
		bodyModel[454] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 677
		bodyModel[455] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 678
		bodyModel[456] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 679
		bodyModel[457] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 680
		bodyModel[458] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 681
		bodyModel[459] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 682
		bodyModel[460] = new ModelRendererTurbo(this, 173, 350, textureX, textureY); // Box 683
		bodyModel[461] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 684
		bodyModel[462] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 685
		bodyModel[463] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 686
		bodyModel[464] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 687
		bodyModel[465] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 688
		bodyModel[466] = new ModelRendererTurbo(this, 185, 392, textureX, textureY); // Box 689
		bodyModel[467] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 671
		bodyModel[468] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 672
		bodyModel[469] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 673
		bodyModel[470] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 674
		bodyModel[471] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 675
		bodyModel[472] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 676
		bodyModel[473] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Box 677
		bodyModel[474] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Box 678
		bodyModel[475] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Box 679
		bodyModel[476] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Box 680
		bodyModel[477] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 681

		bodyModel[0].addShapeBox(0F, 0F, 0F, 35, 8, 50, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-49F, -22F, -25F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 93, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(-49F, -14F, -25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 88, 11, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 8
		bodyModel[2].setRotationPoint(-43F, -11F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 11, 12, 0F, 0F, 0F, 0.05F, 0F, -3F, 0.05F, 0F, -3F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -1F, -3F, 0.05F, -1F, -3F, 0.05F, 0F, 0F, 0.05F); // Box 9
		bodyModel[3].setRotationPoint(45F, -11F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 0F, 0F); // Box 10
		bodyModel[4].setRotationPoint(49F, -8F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 2F, 0F, 1F); // Box 12
		bodyModel[5].setRotationPoint(49F, -8F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[6].setRotationPoint(44F, -14F, -19F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 1F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.45F, 0F, 1F, -0.45F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[7].setRotationPoint(44F, -11.8F, -14.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 93, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F); // Box 20
		bodyModel[8].setRotationPoint(-49F, -14F, 14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[9].setRotationPoint(44F, -14F, 15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, -2F); // Box 22
		bodyModel[10].setRotationPoint(44F, -14F, 19F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.45F, 0F, 1F, -0.45F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.45F, 0F, 0F, -0.45F); // Box 23
		bodyModel[11].setRotationPoint(44F, -11.8F, 13.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 0F, 0F); // Box 24
		bodyModel[12].setRotationPoint(49F, -8F, 8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 1F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, -0.5F, -2F, 0F, 0F, -2F, 0F, 2F, 0F, 0F); // Box 25
		bodyModel[13].setRotationPoint(49F, -8F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F, 0F, 0F, 0.05F, 0F, -3F, 0.05F, 0F, -3F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -2F, 0F, 0.05F, -2F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 26
		bodyModel[14].setRotationPoint(45F, -11F, -14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F, 0F, 0F, 0.05F, 0F, -3F, 0.05F, 0F, -3F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -2F, 0F, 0.05F, -2F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 27
		bodyModel[15].setRotationPoint(45F, -11F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(19F, -22.5F, -16F);
		bodyModel[16].rotateAngleY = -0.17453293F;

		bodyModel[17].addShapeBox(-1F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		bodyModel[17].setRotationPoint(19F, -22.5F, -16F);
		bodyModel[17].rotateAngleY = -0.17453293F;

		bodyModel[18].addShapeBox(5F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(19F, -22.5F, -16F);
		bodyModel[18].rotateAngleY = -0.17453293F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[19].setRotationPoint(21F, -22.5F, 4F);
		bodyModel[19].rotateAngleY = 0.17453293F;

		bodyModel[20].addShapeBox(-1F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 4
		bodyModel[20].setRotationPoint(21F, -22.5F, 4F);
		bodyModel[20].rotateAngleY = 0.17453293F;

		bodyModel[21].addShapeBox(5F, 0F, 0F, 1, 1, 12, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[21].setRotationPoint(21F, -22.5F, 4F);
		bodyModel[21].rotateAngleY = 0.17453293F;

		bodyModel[22].addShapeBox(2F, 0F, -2F, 2, 1, 3, 0F, -0.4F, -0.6F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 6
		bodyModel[22].setRotationPoint(19F, -23F, -16F);
		bodyModel[22].rotateAngleY = -0.17453293F;

		bodyModel[23].addShapeBox(2F, 0F, 11F, 2, 1, 3, 0F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 7
		bodyModel[23].setRotationPoint(21F, -23F, 4F);
		bodyModel[23].rotateAngleY = 0.17453293F;

		bodyModel[24].addShapeBox(1.6F, 0F, -2F, 1, 1, 3, 0F, -0.4F, -0.6F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 8
		bodyModel[24].setRotationPoint(19F, -23F, -16F);
		bodyModel[24].rotateAngleY = -0.17453293F;

		bodyModel[25].addShapeBox(1.6F, 0F, 11F, 1, 1, 3, 0F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 9
		bodyModel[25].setRotationPoint(21F, -23F, 4F);
		bodyModel[25].rotateAngleY = 0.17453293F;

		bodyModel[26].addShapeBox(3.4F, 0F, 11F, 1, 1, 3, 0F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 10
		bodyModel[26].setRotationPoint(21F, -23F, 4F);
		bodyModel[26].rotateAngleY = 0.17453293F;

		bodyModel[27].addShapeBox(3.4F, 0F, -2F, 1, 1, 3, 0F, -0.4F, -0.6F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 11
		bodyModel[27].setRotationPoint(19F, -23F, -16F);
		bodyModel[27].rotateAngleY = -0.17453293F;

		bodyModel[28].addShapeBox(1.5F, 0F, -2F, 3, 1, 1, 0F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 12
		bodyModel[28].setRotationPoint(19F, -23F, -16F);
		bodyModel[28].rotateAngleY = -0.17453293F;

		bodyModel[29].addShapeBox(1.5F, 0F, 13F, 3, 1, 1, 0F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, -0.6F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 13
		bodyModel[29].setRotationPoint(21F, -23F, 4F);
		bodyModel[29].rotateAngleY = 0.17453293F;

		bodyModel[30].addShapeBox(3F, 0F, 6F, 1, 1, 4, 0F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[30].setRotationPoint(19F, -23.5F, -16F);
		bodyModel[30].rotateAngleY = -0.17453293F;

		bodyModel[31].addShapeBox(3F, 0F, 2F, 1, 1, 4, 0F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[31].setRotationPoint(21F, -23.5F, 4F);
		bodyModel[31].rotateAngleY = 0.17453293F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 18, 11, 30, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[32].setRotationPoint(27F, -22F, -15F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 8
		bodyModel[33].setRotationPoint(40F, -19F, -17F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 9
		bodyModel[34].setRotationPoint(40F, -19F, -20F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 12
		bodyModel[35].setRotationPoint(40F, -16.5F, -19F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		bodyModel[36].setRotationPoint(40F, -20F, -20F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F); // Box 10
		bodyModel[37].setRotationPoint(38F, -18.5F, -19F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 15
		bodyModel[38].setRotationPoint(37F, -18.5F, -19F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 16
		bodyModel[39].setRotationPoint(40F, -19F, 16F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 17
		bodyModel[40].setRotationPoint(40F, -19F, 19F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 18
		bodyModel[41].setRotationPoint(40F, -16.5F, 17F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 19
		bodyModel[42].setRotationPoint(40F, -20F, 16F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.2F, -0.2F); // Box 20
		bodyModel[43].setRotationPoint(38F, -18.5F, 17F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 21
		bodyModel[44].setRotationPoint(37F, -18.5F, 17F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[45].setRotationPoint(-45F, -11F, -14F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 28, 0F, 0F, 2F, -13.5F, 0F, 2F, -13.5F, 0F, 2F, -13.5F, 0F, 2F, -13.5F, 0F, 3F, -13.5F, 0F, 3F, -13.5F, 0F, 2F, -13.5F, 0F, 2F, -13.5F); // Box 664
		bodyModel[46].setRotationPoint(-42.5F, -6F, -3.5F);
		bodyModel[46].rotateAngleZ = 0.17453293F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 28, 0F, 0F, 2F, -13.5F, 0F, 2F, -13.5F, 0F, 2F, -13.5F, 0F, 2F, -13.5F, 0F, 2F, -13.5F, 0F, 2F, -13.5F, 0F, 3F, -13.5F, 0F, 3F, -13.5F); // Box 666
		bodyModel[47].setRotationPoint(-42.5F, -6F, -24.5F);
		bodyModel[47].rotateAngleZ = 0.17453293F;

		bodyModel[48].addShapeBox(0F, -2.5F, 0F, 3, 2, 28, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 667
		bodyModel[48].setRotationPoint(-42.5F, -6F, -14F);
		bodyModel[48].rotateAngleZ = 0.17453293F;

		bodyModel[49].addShapeBox(0F, 3.5F, 0F, 3, 2, 28, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 668
		bodyModel[49].setRotationPoint(-42.5F, -6F, -14F);
		bodyModel[49].rotateAngleZ = 0.17453293F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 15, 8, 10, 0F, 0F, 0F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 632
		bodyModel[50].setRotationPoint(27F, -22F, 15F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 3, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 633
		bodyModel[51].setRotationPoint(-49F, -14F, -14F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, -1F); // Box 634
		bodyModel[52].setRotationPoint(49F, -12F, 15F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 635
		bodyModel[53].setRotationPoint(44F, -14F, -25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[54].setRotationPoint(49F, -12F, -22F);

		bodyModel[55].addShapeBox(-1.5F, -0.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 675
		bodyModel[55].setRotationPoint(23F, -22F, -22F);
		bodyModel[55].rotateAngleX = -0.45378561F;

		bodyModel[56].addShapeBox(-1F, 0F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 676
		bodyModel[56].setRotationPoint(23F, -22F, -22F);
		bodyModel[56].rotateAngleX = -0.45378561F;

		bodyModel[57].addShapeBox(-1F, 0F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 677
		bodyModel[57].setRotationPoint(9F, -22F, -22F);
		bodyModel[57].rotateAngleX = -0.45378561F;

		bodyModel[58].addShapeBox(-1.5F, -0.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 678
		bodyModel[58].setRotationPoint(9F, -22F, -22F);
		bodyModel[58].rotateAngleX = -0.45378561F;

		bodyModel[59].addShapeBox(-1F, 0F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 679
		bodyModel[59].setRotationPoint(-25F, -22F, -22F);
		bodyModel[59].rotateAngleX = -0.45378561F;

		bodyModel[60].addShapeBox(-1.5F, -0.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 680
		bodyModel[60].setRotationPoint(-25F, -22F, -22F);
		bodyModel[60].rotateAngleX = -0.45378561F;

		bodyModel[61].addShapeBox(-1F, 0F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 683
		bodyModel[61].setRotationPoint(-15F, -22F, -22F);
		bodyModel[61].rotateAngleX = -0.45378561F;

		bodyModel[62].addShapeBox(-1.5F, -0.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 684
		bodyModel[62].setRotationPoint(-15F, -22F, -22F);
		bodyModel[62].rotateAngleX = -0.45378561F;

		bodyModel[63].addShapeBox(-1.5F, -0.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 685
		bodyModel[63].setRotationPoint(-1F, -22F, -22F);
		bodyModel[63].rotateAngleX = -0.45378561F;

		bodyModel[64].addShapeBox(-1F, 0F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 686
		bodyModel[64].setRotationPoint(-1F, -22F, -22F);
		bodyModel[64].rotateAngleX = -0.45378561F;

		bodyModel[65].addShapeBox(-1.5F, -0.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 687
		bodyModel[65].setRotationPoint(-39F, -22F, -22F);
		bodyModel[65].rotateAngleX = -0.45378561F;

		bodyModel[66].addShapeBox(-1F, 0F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 688
		bodyModel[66].setRotationPoint(-39F, -22F, -22F);
		bodyModel[66].rotateAngleX = -0.45378561F;

		bodyModel[67].addShapeBox(-1.5F, 5.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 689
		bodyModel[67].setRotationPoint(-39F, -22F, -22F);
		bodyModel[67].rotateAngleX = -0.45378561F;

		bodyModel[68].addShapeBox(-1F, 6F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 690
		bodyModel[68].setRotationPoint(-39F, -22F, -22F);
		bodyModel[68].rotateAngleX = -0.45378561F;

		bodyModel[69].addShapeBox(-1F, 6F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 691
		bodyModel[69].setRotationPoint(-25F, -22F, -22F);
		bodyModel[69].rotateAngleX = -0.45378561F;

		bodyModel[70].addShapeBox(-1.5F, 5.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 692
		bodyModel[70].setRotationPoint(-25F, -22F, -22F);
		bodyModel[70].rotateAngleX = -0.45378561F;

		bodyModel[71].addShapeBox(-1.5F, 5.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 693
		bodyModel[71].setRotationPoint(-15F, -22F, -22F);
		bodyModel[71].rotateAngleX = -0.45378561F;

		bodyModel[72].addShapeBox(-1F, 6F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 694
		bodyModel[72].setRotationPoint(-15F, -22F, -22F);
		bodyModel[72].rotateAngleX = -0.45378561F;

		bodyModel[73].addShapeBox(-1.5F, 5.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 695
		bodyModel[73].setRotationPoint(-1F, -22F, -22F);
		bodyModel[73].rotateAngleX = -0.45378561F;

		bodyModel[74].addShapeBox(-1F, 6F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 696
		bodyModel[74].setRotationPoint(-1F, -22F, -22F);
		bodyModel[74].rotateAngleX = -0.45378561F;

		bodyModel[75].addShapeBox(-1.5F, 5.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 697
		bodyModel[75].setRotationPoint(9F, -22F, -22F);
		bodyModel[75].rotateAngleX = -0.45378561F;

		bodyModel[76].addShapeBox(-1F, 6F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 698
		bodyModel[76].setRotationPoint(9F, -22F, -22F);
		bodyModel[76].rotateAngleX = -0.45378561F;

		bodyModel[77].addShapeBox(-1.5F, 5.5F, 0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 699
		bodyModel[77].setRotationPoint(23F, -22F, -22F);
		bodyModel[77].rotateAngleX = -0.45378561F;

		bodyModel[78].addShapeBox(-1F, 6F, -0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 700
		bodyModel[78].setRotationPoint(23F, -22F, -22F);
		bodyModel[78].rotateAngleX = -0.45378561F;

		bodyModel[79].addShapeBox(-1.5F, 5.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 701
		bodyModel[79].setRotationPoint(-39F, -22F, 22F);
		bodyModel[79].rotateAngleX = 0.45378561F;

		bodyModel[80].addShapeBox(-1F, 6F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 702
		bodyModel[80].setRotationPoint(-39F, -22F, 22F);
		bodyModel[80].rotateAngleX = 0.45378561F;

		bodyModel[81].addShapeBox(-1F, 6F, 0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 703
		bodyModel[81].setRotationPoint(-25F, -22F, 22F);
		bodyModel[81].rotateAngleX = 0.31415927F;

		bodyModel[82].addShapeBox(-1.5F, 5.5F, -0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 704
		bodyModel[82].setRotationPoint(-25F, -22F, 22F);
		bodyModel[82].rotateAngleX = 0.31415927F;

		bodyModel[83].addShapeBox(-1.5F, 5.5F, -0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 705
		bodyModel[83].setRotationPoint(-15F, -22F, 22F);
		bodyModel[83].rotateAngleX = 0.31415927F;

		bodyModel[84].addShapeBox(-1F, 6F, 0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 706
		bodyModel[84].setRotationPoint(-15F, -22F, 22F);
		bodyModel[84].rotateAngleX = 0.31415927F;

		bodyModel[85].addShapeBox(-1.5F, 5.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 707
		bodyModel[85].setRotationPoint(-1F, -22F, 22F);
		bodyModel[85].rotateAngleX = 0.45378561F;

		bodyModel[86].addShapeBox(-1F, 6F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 708
		bodyModel[86].setRotationPoint(-1F, -22F, 22F);
		bodyModel[86].rotateAngleX = 0.45378561F;

		bodyModel[87].addShapeBox(-1.5F, 5.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 709
		bodyModel[87].setRotationPoint(9F, -22F, 22F);
		bodyModel[87].rotateAngleX = 0.45378561F;

		bodyModel[88].addShapeBox(-1F, 6F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 710
		bodyModel[88].setRotationPoint(9F, -22F, 22F);
		bodyModel[88].rotateAngleX = 0.45378561F;

		bodyModel[89].addShapeBox(-1.5F, 5.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 711
		bodyModel[89].setRotationPoint(23F, -22F, 22F);
		bodyModel[89].rotateAngleX = 0.45378561F;

		bodyModel[90].addShapeBox(-1F, 6F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 712
		bodyModel[90].setRotationPoint(23F, -22F, 22F);
		bodyModel[90].rotateAngleX = 0.45378561F;

		bodyModel[91].addShapeBox(-1F, 0F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 713
		bodyModel[91].setRotationPoint(-39F, -22F, 22F);
		bodyModel[91].rotateAngleX = 0.45378561F;

		bodyModel[92].addShapeBox(-1.5F, -0.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 714
		bodyModel[92].setRotationPoint(-39F, -22F, 22F);
		bodyModel[92].rotateAngleX = 0.45378561F;

		bodyModel[93].addShapeBox(-1F, 0F, 0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 715
		bodyModel[93].setRotationPoint(-25F, -22F, 22F);
		bodyModel[93].rotateAngleX = 0.31415927F;

		bodyModel[94].addShapeBox(-1.5F, -0.5F, -0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 716
		bodyModel[94].setRotationPoint(-25F, -22F, 22F);
		bodyModel[94].rotateAngleX = 0.31415927F;

		bodyModel[95].addShapeBox(-1F, 0F, 0.3F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 717
		bodyModel[95].setRotationPoint(-15F, -22F, 22F);
		bodyModel[95].rotateAngleX = 0.31415927F;

		bodyModel[96].addShapeBox(-1.5F, -0.5F, -0.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 718
		bodyModel[96].setRotationPoint(-15F, -22F, 22F);
		bodyModel[96].rotateAngleX = 0.31415927F;

		bodyModel[97].addShapeBox(-1F, 0F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 719
		bodyModel[97].setRotationPoint(-1F, -22F, 22F);
		bodyModel[97].rotateAngleX = 0.45378561F;

		bodyModel[98].addShapeBox(-1.5F, -0.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 720
		bodyModel[98].setRotationPoint(-1F, -22F, 22F);
		bodyModel[98].rotateAngleX = 0.45378561F;

		bodyModel[99].addShapeBox(-1F, 0F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 721
		bodyModel[99].setRotationPoint(9F, -22F, 22F);
		bodyModel[99].rotateAngleX = 0.45378561F;

		bodyModel[100].addShapeBox(-1.5F, -0.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 722
		bodyModel[100].setRotationPoint(9F, -22F, 22F);
		bodyModel[100].rotateAngleX = 0.45378561F;

		bodyModel[101].addShapeBox(-1F, 0F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 723
		bodyModel[101].setRotationPoint(23F, -22F, 22F);
		bodyModel[101].rotateAngleX = 0.45378561F;

		bodyModel[102].addShapeBox(-1.5F, -0.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 724
		bodyModel[102].setRotationPoint(23F, -22F, 22F);
		bodyModel[102].rotateAngleX = 0.45378561F;

		bodyModel[103].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 579
		bodyModel[103].setRotationPoint(-43F, -25.5F, 10.5F);

		bodyModel[104].addShapeBox(0F, -0.3F, 0F, 4, 1, 8, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 580
		bodyModel[104].setRotationPoint(-43F, -25.5F, 10.5F);

		bodyModel[105].addShapeBox(0.5F, -0.2F, -0.2F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 581
		bodyModel[105].setRotationPoint(-44F, -25.5F, 14.5F);

		bodyModel[106].addShapeBox(0.5F, -0.2F, -0.2F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 734
		bodyModel[106].setRotationPoint(-35F, -25.5F, 14.5F);

		bodyModel[107].addShapeBox(0F, -0.3F, 0F, 4, 1, 8, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 735
		bodyModel[107].setRotationPoint(-38F, -25.5F, 10.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 736
		bodyModel[108].setRotationPoint(-38F, -25.5F, 10.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 740
		bodyModel[109].setRotationPoint(-43F, -25.5F, 1.5F);

		bodyModel[110].addShapeBox(0F, -0.3F, 0F, 4, 1, 8, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 741
		bodyModel[110].setRotationPoint(-43F, -25.5F, 1.5F);

		bodyModel[111].addShapeBox(0.5F, -0.2F, -0.2F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 742
		bodyModel[111].setRotationPoint(-44F, -25.5F, 5.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 743
		bodyModel[112].setRotationPoint(-33F, -26F, -12.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		bodyModel[113].setRotationPoint(-33F, -27F, -12.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		bodyModel[114].setRotationPoint(-33F, -27F, -14.75F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 746
		bodyModel[115].setRotationPoint(-33F, -26F, -14.75F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 747
		bodyModel[116].setRotationPoint(-33F, -26F, -17F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[117].setRotationPoint(-33F, -27F, -17F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 749
		bodyModel[118].setRotationPoint(-33F, -26F, -19.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[119].setRotationPoint(-33F, -27F, -19.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F); // Box 751
		bodyModel[120].setRotationPoint(-33.5F, -25F, -19.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 752
		bodyModel[121].setRotationPoint(-36F, -26F, -19.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[122].setRotationPoint(-36F, -27F, -17.25F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 754
		bodyModel[123].setRotationPoint(-38.25F, -26F, -19.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		bodyModel[124].setRotationPoint(-38.25F, -27F, -17.25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 756
		bodyModel[125].setRotationPoint(-38.6F, -25F, -19.5F);

		bodyModel[126].addShapeBox(0.5F, -15.3F, -0.7F, 11, 3, 5, 0F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 585
		bodyModel[126].setRotationPoint(-43F, -13F, -7F);
		bodyModel[126].rotateAngleY = -1.57079633F;

		bodyModel[127].addShapeBox(5.5F, -13.3F, -1.1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[127].setRotationPoint(-43F, -13F, -7F);
		bodyModel[127].rotateAngleY = -1.57079633F;

		bodyModel[128].addShapeBox(0.5F, -14F, -0.7F, 11, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[128].setRotationPoint(-43F, -13F, -7F);
		bodyModel[128].rotateAngleY = -1.57079633F;

		bodyModel[129].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 390
		bodyModel[129].setRotationPoint(-47.5F, -21F, -15F);
		bodyModel[129].rotateAngleZ = 1.22173048F;

		bodyModel[130].addShapeBox(-2.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 392
		bodyModel[130].setRotationPoint(-47.5F, -21F, -15F);
		bodyModel[130].rotateAngleZ = 1.22173048F;

		bodyModel[131].addShapeBox(-2.5F, -1F, -0.5F, 3, 1, 1, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 393
		bodyModel[131].setRotationPoint(-47.5F, -21F, -15F);
		bodyModel[131].rotateAngleZ = 1.22173048F;

		bodyModel[132].addShapeBox(-2.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 394
		bodyModel[132].setRotationPoint(-47.5F, -21F, 15F);
		bodyModel[132].rotateAngleZ = 1.22173048F;

		bodyModel[133].addShapeBox(-2.5F, -1F, -0.5F, 3, 1, 1, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 395
		bodyModel[133].setRotationPoint(-47.5F, -21F, 15F);
		bodyModel[133].rotateAngleZ = 1.22173048F;

		bodyModel[134].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 396
		bodyModel[134].setRotationPoint(-47.5F, -21F, 15F);
		bodyModel[134].rotateAngleZ = 1.22173048F;

		bodyModel[135].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 397
		bodyModel[135].setRotationPoint(-48.5F, -21F, 20F);

		bodyModel[136].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 398
		bodyModel[136].setRotationPoint(-48.5F, -21F, 18F);

		bodyModel[137].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.6F, -0.6F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.6F, -0.6F, -0.2F); // Box 399
		bodyModel[137].setRotationPoint(-48.5F, -20F, 18F);

		bodyModel[138].addShapeBox(-0.5F, 1F, -0.5F, 1, 1, 1, 0F, -0.6F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -2F, 1F, -0.2F, 1.7F, 1F, -0.2F, 1.7F, 1F, -0.2F, -2F, 1F, -0.2F); // Box 400
		bodyModel[138].setRotationPoint(-48.5F, -20F, 18F);

		bodyModel[139].addShapeBox(-0.5F, 1F, -0.5F, 1, 1, 1, 0F, -0.6F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -2F, 1F, -0.2F, 1.7F, 1F, -0.2F, 1.7F, 1F, -0.2F, -2F, 1F, -0.2F); // Box 401
		bodyModel[139].setRotationPoint(-48.5F, -20F, 20F);

		bodyModel[140].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.6F, -0.6F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.6F, -0.6F, -0.2F); // Box 402
		bodyModel[140].setRotationPoint(-48.5F, -20F, 20F);

		bodyModel[141].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 3, 0F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 404
		bodyModel[141].setRotationPoint(-48.5F, -21F, 18F);

		bodyModel[142].addShapeBox(-0.5F, -1F, -2.5F, 1, 1, 3, 0F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 405
		bodyModel[142].setRotationPoint(-48.5F, -21F, -18F);

		bodyModel[143].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 406
		bodyModel[143].setRotationPoint(-48.5F, -21F, -18F);

		bodyModel[144].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.6F, -0.6F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.6F, -0.6F, -0.2F); // Box 407
		bodyModel[144].setRotationPoint(-48.5F, -20F, -18F);

		bodyModel[145].addShapeBox(-0.5F, 1F, -0.5F, 1, 1, 1, 0F, -0.6F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -2F, 1F, -0.2F, 1.7F, 1F, -0.2F, 1.7F, 1F, -0.2F, -2F, 1F, -0.2F); // Box 408
		bodyModel[145].setRotationPoint(-48.5F, -20F, -18F);

		bodyModel[146].addShapeBox(-0.5F, 1F, -0.5F, 1, 1, 1, 0F, -0.6F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -2F, 1F, -0.2F, 1.7F, 1F, -0.2F, 1.7F, 1F, -0.2F, -2F, 1F, -0.2F); // Box 409
		bodyModel[146].setRotationPoint(-48.5F, -20F, -20F);

		bodyModel[147].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.6F, -0.6F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.6F, -0.6F, -0.2F); // Box 410
		bodyModel[147].setRotationPoint(-48.5F, -20F, -20F);

		bodyModel[148].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 411
		bodyModel[148].setRotationPoint(-48.5F, -21F, -20F);

		bodyModel[149].addShapeBox(0.5F, 0F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[149].setRotationPoint(-48.5F, -21F, 19F);

		bodyModel[150].addShapeBox(1.5F, 0F, -0.5F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 413
		bodyModel[150].setRotationPoint(-48.5F, -21F, 19F);

		bodyModel[151].addShapeBox(0.5F, 0F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[151].setRotationPoint(-48.5F, -21F, -19F);

		bodyModel[152].addShapeBox(1.5F, 0F, -0.5F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[152].setRotationPoint(-48.5F, -21F, -19F);

		bodyModel[153].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 6, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 416
		bodyModel[153].setRotationPoint(-46F, -23F, 8F);
		bodyModel[153].rotateAngleZ = 1.22173048F;

		bodyModel[154].addShapeBox(-0.5F, 0F, -5.5F, 1, 1, 6, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 417
		bodyModel[154].setRotationPoint(-46F, -23F, -8F);
		bodyModel[154].rotateAngleZ = 1.22173048F;

		bodyModel[155].addShapeBox(-2F, -3F, -3F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[155].setRotationPoint(-18F, -19.9F, -25.6F);
		bodyModel[155].rotateAngleX = 2.04203522F;
		bodyModel[155].rotateAngleY = -3.14159265F;

		bodyModel[156].addShapeBox(-2F, -3F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 204
		bodyModel[156].setRotationPoint(-18F, -19.9F, -25.6F);
		bodyModel[156].rotateAngleX = 2.04203522F;
		bodyModel[156].rotateAngleY = -3.14159265F;

		bodyModel[157].addShapeBox(-1F, -3F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[157].setRotationPoint(-8F, -19.9F, -25.4F);
		bodyModel[157].rotateAngleX = 2.04203522F;
		bodyModel[157].rotateAngleY = -3.14159265F;

		bodyModel[158].addShapeBox(1F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 426
		bodyModel[158].setRotationPoint(-8F, -19.9F, -25.4F);
		bodyModel[158].rotateAngleX = 2.04203522F;
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addShapeBox(-2F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 427
		bodyModel[159].setRotationPoint(-8F, -19.9F, -25.4F);
		bodyModel[159].rotateAngleX = 2.04203522F;
		bodyModel[159].rotateAngleY = -3.14159265F;

		bodyModel[160].addShapeBox(-1F, -3F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[160].setRotationPoint(-4F, -19.9F, -25.4F);
		bodyModel[160].rotateAngleX = 2.04203522F;
		bodyModel[160].rotateAngleY = -3.14159265F;

		bodyModel[161].addShapeBox(1F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 431
		bodyModel[161].setRotationPoint(-4F, -19.9F, -25.4F);
		bodyModel[161].rotateAngleX = 2.04203522F;
		bodyModel[161].rotateAngleY = -3.14159265F;

		bodyModel[162].addShapeBox(-2F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 432
		bodyModel[162].setRotationPoint(-4F, -19.9F, -25.4F);
		bodyModel[162].rotateAngleX = 2.04203522F;
		bodyModel[162].rotateAngleY = -3.14159265F;

		bodyModel[163].addShapeBox(-1.5F, -2F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 433
		bodyModel[163].setRotationPoint(-28F, -19.9F, -25.2F);
		bodyModel[163].rotateAngleX = 2.02458193F;
		bodyModel[163].rotateAngleY = -3.14159265F;

		bodyModel[164].addShapeBox(-1.5F, -2F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 434
		bodyModel[164].setRotationPoint(-28F, -19.9F, -25.2F);
		bodyModel[164].rotateAngleX = 2.02458193F;
		bodyModel[164].rotateAngleY = -3.14159265F;

		bodyModel[165].addShapeBox(-1F, -3F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[165].setRotationPoint(-28F, -19.9F, -25.2F);
		bodyModel[165].rotateAngleX = 2.02458193F;
		bodyModel[165].rotateAngleY = -3.14159265F;

		bodyModel[166].addShapeBox(1F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 436
		bodyModel[166].setRotationPoint(-28F, -19.9F, -25.2F);
		bodyModel[166].rotateAngleX = 2.02458193F;
		bodyModel[166].rotateAngleY = -3.14159265F;

		bodyModel[167].addShapeBox(-2F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 437
		bodyModel[167].setRotationPoint(-28F, -19.9F, -25.2F);
		bodyModel[167].rotateAngleX = 2.02458193F;
		bodyModel[167].rotateAngleY = -3.14159265F;

		bodyModel[168].addShapeBox(-2.5F, -2F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 438
		bodyModel[168].setRotationPoint(-32F, -19.9F, -25.2F);
		bodyModel[168].rotateAngleX = 2.02458193F;
		bodyModel[168].rotateAngleY = -3.14159265F;

		bodyModel[169].addShapeBox(-2.5F, -2F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 439
		bodyModel[169].setRotationPoint(-32F, -19.9F, -25.2F);
		bodyModel[169].rotateAngleX = 2.02458193F;
		bodyModel[169].rotateAngleY = -3.14159265F;

		bodyModel[170].addShapeBox(-1F, -3F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[170].setRotationPoint(-32F, -19.9F, -25.2F);
		bodyModel[170].rotateAngleX = 2.02458193F;
		bodyModel[170].rotateAngleY = -3.14159265F;

		bodyModel[171].addShapeBox(1F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 441
		bodyModel[171].setRotationPoint(-32F, -19.9F, -25.2F);
		bodyModel[171].rotateAngleX = 2.02458193F;
		bodyModel[171].rotateAngleY = -3.14159265F;

		bodyModel[172].addShapeBox(-2F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 442
		bodyModel[172].setRotationPoint(-32F, -19.9F, -25.2F);
		bodyModel[172].rotateAngleX = 2.02458193F;
		bodyModel[172].rotateAngleY = -3.14159265F;

		bodyModel[173].addShapeBox(-1F, -3F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[173].setRotationPoint(-36F, -19.9F, -25.2F);
		bodyModel[173].rotateAngleX = 2.02458193F;
		bodyModel[173].rotateAngleY = -3.14159265F;

		bodyModel[174].addShapeBox(-2F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 444
		bodyModel[174].setRotationPoint(-36F, -19.9F, -25.2F);
		bodyModel[174].rotateAngleX = 2.02458193F;
		bodyModel[174].rotateAngleY = -3.14159265F;

		bodyModel[175].addShapeBox(1F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 445
		bodyModel[175].setRotationPoint(-36F, -19.9F, -25.2F);
		bodyModel[175].rotateAngleX = 2.02458193F;
		bodyModel[175].rotateAngleY = -3.14159265F;

		bodyModel[176].addShapeBox(0.5F, -2F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 446
		bodyModel[176].setRotationPoint(-32F, -19.9F, -25.2F);
		bodyModel[176].rotateAngleX = 2.02458193F;
		bodyModel[176].rotateAngleY = -3.14159265F;

		bodyModel[177].addShapeBox(0.5F, -2F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 447
		bodyModel[177].setRotationPoint(-32F, -19.9F, -25.2F);
		bodyModel[177].rotateAngleX = 2.02458193F;
		bodyModel[177].rotateAngleY = -3.14159265F;

		bodyModel[178].addShapeBox(3.5F, -2F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 448
		bodyModel[178].setRotationPoint(-32F, -19.9F, -25.2F);
		bodyModel[178].rotateAngleX = 2.02458193F;
		bodyModel[178].rotateAngleY = -3.14159265F;

		bodyModel[179].addShapeBox(3.5F, -2F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 449
		bodyModel[179].setRotationPoint(-32F, -19.9F, -25.2F);
		bodyModel[179].rotateAngleX = 2.02458193F;
		bodyModel[179].rotateAngleY = -3.14159265F;

		bodyModel[180].addShapeBox(3.5F, -2F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 450
		bodyModel[180].setRotationPoint(-8F, -19.9F, -25.4F);
		bodyModel[180].rotateAngleX = 2.04203522F;
		bodyModel[180].rotateAngleY = -3.14159265F;

		bodyModel[181].addShapeBox(3.5F, -2F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 451
		bodyModel[181].setRotationPoint(-8F, -19.9F, -25.4F);
		bodyModel[181].rotateAngleX = 2.04203522F;
		bodyModel[181].rotateAngleY = -3.14159265F;

		bodyModel[182].addShapeBox(0.5F, -2F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 452
		bodyModel[182].setRotationPoint(-8F, -19.9F, -25.4F);
		bodyModel[182].rotateAngleX = 2.04203522F;
		bodyModel[182].rotateAngleY = -3.14159265F;

		bodyModel[183].addShapeBox(0.5F, -2F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 453
		bodyModel[183].setRotationPoint(-8F, -19.9F, -25.4F);
		bodyModel[183].rotateAngleX = 2.04203522F;
		bodyModel[183].rotateAngleY = -3.14159265F;

		bodyModel[184].addShapeBox(-2.5F, -2F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 454
		bodyModel[184].setRotationPoint(-8F, -19.9F, -25.4F);
		bodyModel[184].rotateAngleX = 2.04203522F;
		bodyModel[184].rotateAngleY = -3.14159265F;

		bodyModel[185].addShapeBox(-2.5F, -2F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 455
		bodyModel[185].setRotationPoint(-8F, -19.9F, -25.4F);
		bodyModel[185].rotateAngleX = 2.04203522F;
		bodyModel[185].rotateAngleY = -3.14159265F;

		bodyModel[186].addShapeBox(-1.5F, -2F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 456
		bodyModel[186].setRotationPoint(-4F, -19.9F, -25.4F);
		bodyModel[186].rotateAngleX = 2.04203522F;
		bodyModel[186].rotateAngleY = -3.14159265F;

		bodyModel[187].addShapeBox(-1.5F, -2F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 457
		bodyModel[187].setRotationPoint(-4F, -19.9F, -25.4F);
		bodyModel[187].rotateAngleX = 2.04203522F;
		bodyModel[187].rotateAngleY = -3.14159265F;

		bodyModel[188].addShapeBox(-2F, -3F, -4F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[188].setRotationPoint(-18F, -19.9F, -25.6F);
		bodyModel[188].rotateAngleX = 2.04203522F;
		bodyModel[188].rotateAngleY = -3.14159265F;

		bodyModel[189].addShapeBox(-2F, -3F, 0F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[189].setRotationPoint(-18F, -19.9F, -25.6F);
		bodyModel[189].rotateAngleX = 2.04203522F;
		bodyModel[189].rotateAngleY = -3.14159265F;

		bodyModel[190].addShapeBox(-2F, -3F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[190].setRotationPoint(-18F, -19.9F, -25.6F);
		bodyModel[190].rotateAngleX = 2.04203522F;
		bodyModel[190].rotateAngleY = -3.14159265F;

		bodyModel[191].addShapeBox(-2F, -3F, 3F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 464
		bodyModel[191].setRotationPoint(-18F, -19.9F, -25.6F);
		bodyModel[191].rotateAngleX = 2.04203522F;
		bodyModel[191].rotateAngleY = -3.14159265F;

		bodyModel[192].addShapeBox(1F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 465
		bodyModel[192].setRotationPoint(-12F, -19.9F, -25.4F);
		bodyModel[192].rotateAngleX = 2.04203522F;
		bodyModel[192].rotateAngleY = -3.14159265F;

		bodyModel[193].addShapeBox(-1F, -3F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[193].setRotationPoint(-12F, -19.9F, -25.4F);
		bodyModel[193].rotateAngleX = 2.04203522F;
		bodyModel[193].rotateAngleY = -3.14159265F;

		bodyModel[194].addShapeBox(-2F, -3F, -4F, 1, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 467
		bodyModel[194].setRotationPoint(-12F, -19.9F, -25.4F);
		bodyModel[194].rotateAngleX = 2.04203522F;
		bodyModel[194].rotateAngleY = -3.14159265F;

		bodyModel[195].addShapeBox(1F, -2F, 0.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 468
		bodyModel[195].setRotationPoint(-20F, -19.9F, -25.6F);
		bodyModel[195].rotateAngleX = 2.04203522F;
		bodyModel[195].rotateAngleY = -3.14159265F;

		bodyModel[196].addShapeBox(1F, -2F, -2.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 469
		bodyModel[196].setRotationPoint(-20F, -19.9F, -25.6F);
		bodyModel[196].rotateAngleX = 2.04203522F;
		bodyModel[196].rotateAngleY = -3.14159265F;

		bodyModel[197].addShapeBox(-2F, -2F, -2.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 470
		bodyModel[197].setRotationPoint(-20F, -19.9F, -25.6F);
		bodyModel[197].rotateAngleX = 2.04203522F;
		bodyModel[197].rotateAngleY = -3.14159265F;

		bodyModel[198].addShapeBox(-2F, -2F, 0.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 471
		bodyModel[198].setRotationPoint(-20F, -19.9F, -25.6F);
		bodyModel[198].rotateAngleX = 2.04203522F;
		bodyModel[198].rotateAngleY = -3.14159265F;

		bodyModel[199].addShapeBox(-1.5F, -0.3F, -8.5F, 1, 1, 10, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 472
		bodyModel[199].setRotationPoint(-46F, -21F, 5F);
		bodyModel[199].rotateAngleZ = 1.10828408F;

		bodyModel[200].addShapeBox(-2.5F, -0.3F, -9.9F, 3, 1, 2, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Box 473
		bodyModel[200].setRotationPoint(-46F, -21F, 5F);
		bodyModel[200].rotateAngleZ = 1.10828408F;

		bodyModel[201].addShapeBox(-1.5F, -0.3F, -1.5F, 1, 1, 1, 0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 474
		bodyModel[201].setRotationPoint(-46F, -21F, 5F);
		bodyModel[201].rotateAngleZ = 1.10828408F;

		bodyModel[202].addShapeBox(-1.5F, -0.3F, -6.5F, 1, 1, 1, 0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 475
		bodyModel[202].setRotationPoint(-46F, -21F, 5F);
		bodyModel[202].rotateAngleZ = 1.10828408F;

		bodyModel[203].addShapeBox(-5.5F, -0.3F, -1.5F, 1, 1, 1, 0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 476
		bodyModel[203].setRotationPoint(-46F, -21F, 5F);
		bodyModel[203].rotateAngleZ = 1.10828408F;

		bodyModel[204].addShapeBox(-5.5F, -0.3F, -7.5F, 1, 1, 8, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 477
		bodyModel[204].setRotationPoint(-46F, -21F, 5F);
		bodyModel[204].rotateAngleZ = 1.10828408F;

		bodyModel[205].addShapeBox(-5.5F, -0.3F, -6.5F, 1, 1, 1, 0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 478
		bodyModel[205].setRotationPoint(-46F, -21F, 5F);
		bodyModel[205].rotateAngleZ = 1.10828408F;

		bodyModel[206].addShapeBox(-4.9F, -0.3F, -9.9F, 1, 1, 3, 0F, -0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -0.4F); // Box 479
		bodyModel[206].setRotationPoint(-46F, -21F, 5F);
		bodyModel[206].rotateAngleZ = 1.10828408F;

		bodyModel[207].addShapeBox(-6.1F, -0.3F, -9.9F, 1, 1, 3, 0F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -1.2F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -1.2F); // Box 481
		bodyModel[207].setRotationPoint(-46F, -21F, 5F);
		bodyModel[207].rotateAngleZ = 1.10828408F;

		bodyModel[208].addShapeBox(-6.5F, -0.3F, -10.3F, 3, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 483
		bodyModel[208].setRotationPoint(-46F, -21F, 5F);
		bodyModel[208].rotateAngleZ = 1.10828408F;

		bodyModel[209].addShapeBox(-6.5F, -0.3F, 0.1F, 3, 1, 3, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Box 484
		bodyModel[209].setRotationPoint(-46F, -21F, 5F);
		bodyModel[209].rotateAngleZ = 1.10828408F;

		bodyModel[210].addShapeBox(-6F, -0.3F, 2.7F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Box 485
		bodyModel[210].setRotationPoint(-46F, -21F, 5F);
		bodyModel[210].rotateAngleZ = 1.10828408F;

		bodyModel[211].addShapeBox(0F, 1F, -1F, 29, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 486
		bodyModel[211].setRotationPoint(-33F, -24F, 22F);
		bodyModel[211].rotateAngleX = 0.40142573F;

		bodyModel[212].addShapeBox(0F, 8F, -1F, 29, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 488
		bodyModel[212].setRotationPoint(-33F, -24F, 22F);
		bodyModel[212].rotateAngleX = 0.40142573F;

		bodyModel[213].addShapeBox(0F, 2F, -1F, 1, 7, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 489
		bodyModel[213].setRotationPoint(-33F, -24F, 22F);
		bodyModel[213].rotateAngleX = 0.40142573F;

		bodyModel[214].addShapeBox(9F, 2F, -1F, 1, 7, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 490
		bodyModel[214].setRotationPoint(-33F, -24F, 22F);
		bodyModel[214].rotateAngleX = 0.40142573F;

		bodyModel[215].addShapeBox(28F, 2F, -1F, 1, 7, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 491
		bodyModel[215].setRotationPoint(-33F, -24F, 22F);
		bodyModel[215].rotateAngleX = 0.40142573F;

		bodyModel[216].addShapeBox(19F, 2F, -1F, 1, 7, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[216].setRotationPoint(-33F, -24F, 22F);
		bodyModel[216].rotateAngleX = 0.40142573F;

		bodyModel[217].addShapeBox(0F, 1F, -2F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 493
		bodyModel[217].setRotationPoint(-33F, -24F, 22F);
		bodyModel[217].rotateAngleX = 0.40142573F;

		bodyModel[218].addShapeBox(0F, 8F, -2F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 494
		bodyModel[218].setRotationPoint(-33F, -24F, 22F);
		bodyModel[218].rotateAngleX = 0.40142573F;

		bodyModel[219].addShapeBox(9F, 8F, -2F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 495
		bodyModel[219].setRotationPoint(-33F, -24F, 22F);
		bodyModel[219].rotateAngleX = 0.40142573F;

		bodyModel[220].addShapeBox(9F, 1F, -2F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 496
		bodyModel[220].setRotationPoint(-33F, -24F, 22F);
		bodyModel[220].rotateAngleX = 0.40142573F;

		bodyModel[221].addShapeBox(19F, 8F, -2F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 497
		bodyModel[221].setRotationPoint(-33F, -24F, 22F);
		bodyModel[221].rotateAngleX = 0.40142573F;

		bodyModel[222].addShapeBox(19F, 1F, -2F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 498
		bodyModel[222].setRotationPoint(-33F, -24F, 22F);
		bodyModel[222].rotateAngleX = 0.40142573F;

		bodyModel[223].addShapeBox(28F, 8F, -2F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 499
		bodyModel[223].setRotationPoint(-33F, -24F, 22F);
		bodyModel[223].rotateAngleX = 0.40142573F;

		bodyModel[224].addShapeBox(28F, 1F, -2F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 500
		bodyModel[224].setRotationPoint(-33F, -24F, 22F);
		bodyModel[224].rotateAngleX = 0.40142573F;

		bodyModel[225].addBox(0F, 0F, 2.5F, 8, 4, 3, 0F); // Box 501
		bodyModel[225].setRotationPoint(0F, -19.5F, 20F);
		bodyModel[225].rotateAngleX = 0.38397244F;

		bodyModel[226].addShapeBox(3.5F, -0.1F, 4.6F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 502
		bodyModel[226].setRotationPoint(0F, -19.5F, 20F);
		bodyModel[226].rotateAngleX = 0.38397244F;

		bodyModel[227].addShapeBox(0F, -0.3F, 2.5F, 8, 1, 3, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 503
		bodyModel[227].setRotationPoint(0F, -19.5F, 20F);
		bodyModel[227].rotateAngleX = 0.38397244F;

		bodyModel[228].addShapeBox(-10F, -0.5F, -0.5F, 10, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 508
		bodyModel[228].setRotationPoint(21F, -19F, 22.9F);
		bodyModel[228].rotateAngleX = 0.45378561F;
		bodyModel[228].rotateAngleY = 0.08726646F;
		bodyModel[228].rotateAngleZ = -0.17453293F;

		bodyModel[229].addShapeBox(-3F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 509
		bodyModel[229].setRotationPoint(21F, -19F, 22.9F);
		bodyModel[229].rotateAngleX = 0.45378561F;
		bodyModel[229].rotateAngleY = 0.08726646F;
		bodyModel[229].rotateAngleZ = -0.17453293F;

		bodyModel[230].addShapeBox(-8F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 510
		bodyModel[230].setRotationPoint(21F, -19F, 22.9F);
		bodyModel[230].rotateAngleX = 0.45378561F;
		bodyModel[230].rotateAngleY = 0.08726646F;
		bodyModel[230].rotateAngleZ = -0.17453293F;

		bodyModel[231].addShapeBox(-0.4F, 0F, -0.5F, 3, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -1.45F, 0F, -0.2F, -1.45F, 0F, -0.2F, -0.2F, -0.25F, -0.2F); // Box 511
		bodyModel[231].setRotationPoint(21F, -19F, 22.9F);
		bodyModel[231].rotateAngleX = 0.45378561F;

		bodyModel[232].addShapeBox(-0.4F, -1F, -0.5F, 3, 1, 1, 0F, -0.2F, -0.25F, -0.2F, -1.45F, 0F, -0.2F, -1.45F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F); // Box 512
		bodyModel[232].setRotationPoint(21F, -19F, 22.9F);
		bodyModel[232].rotateAngleX = 0.45378561F;

		bodyModel[233].addShapeBox(-10F, -0.5F, -0.5F, 10, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 513
		bodyModel[233].setRotationPoint(21F, -19F, 22.9F);
		bodyModel[233].rotateAngleX = 0.45378561F;
		bodyModel[233].rotateAngleY = -0.08726646F;
		bodyModel[233].rotateAngleZ = 0.17453293F;

		bodyModel[234].addShapeBox(-3F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 514
		bodyModel[234].setRotationPoint(21F, -19F, 22.9F);
		bodyModel[234].rotateAngleX = 0.45378561F;
		bodyModel[234].rotateAngleY = -0.08726646F;
		bodyModel[234].rotateAngleZ = 0.17453293F;

		bodyModel[235].addShapeBox(-8F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 515
		bodyModel[235].setRotationPoint(21F, -19F, 22.9F);
		bodyModel[235].rotateAngleX = 0.45378561F;
		bodyModel[235].rotateAngleY = -0.08726646F;
		bodyModel[235].rotateAngleZ = 0.17453293F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, -1F); // Box 493
		bodyModel[236].setRotationPoint(49F, -12F, -15F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 494
		bodyModel[237].setRotationPoint(44F, -14F, -15F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[238].setRotationPoint(49F, -12F, 13F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[239].setRotationPoint(44F, -14F, 13F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[240].setRotationPoint(25F, -7.5F, 15F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 480
		bodyModel[241].setRotationPoint(23F, -3.5F, 14F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F); // Box 481
		bodyModel[242].setRotationPoint(23.5F, -3.5F, 20F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[243].setRotationPoint(23.5F, -7.5F, 20F);

		bodyModel[244].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 484
		bodyModel[244].setRotationPoint(29F, -1.5F, 19F);
		bodyModel[244].rotateAngleZ = -0.52359878F;

		bodyModel[245].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 485
		bodyModel[245].setRotationPoint(27F, -1.25F, 19F);
		bodyModel[245].rotateAngleZ = 0.52359878F;

		bodyModel[246].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 486
		bodyModel[246].setRotationPoint(29F, -1.5F, 15F);
		bodyModel[246].rotateAngleZ = -0.52359878F;

		bodyModel[247].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 487
		bodyModel[247].setRotationPoint(27F, -1.25F, 15F);
		bodyModel[247].rotateAngleZ = 0.52359878F;

		bodyModel[248].addShapeBox(-1F, -0.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 488
		bodyModel[248].setRotationPoint(29F, -1.5F, 19F);
		bodyModel[248].rotateAngleZ = -0.52359878F;

		bodyModel[249].addShapeBox(-9F, -2.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 489
		bodyModel[249].setRotationPoint(27F, -1.25F, 19F);
		bodyModel[249].rotateAngleZ = 0.52359878F;

		bodyModel[250].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 490
		bodyModel[250].setRotationPoint(28F, 1.5F, 19F);
		bodyModel[250].rotateAngleZ = -0.15707963F;

		bodyModel[251].addShapeBox(-1F, 1F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 491
		bodyModel[251].setRotationPoint(21F, 1.15F, 19F);
		bodyModel[251].rotateAngleZ = 0.15707963F;

		bodyModel[252].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 68
		bodyModel[252].setRotationPoint(33F, 2.5F, 19.5F);
		bodyModel[252].rotateAngleZ = 3.14159265F;

		bodyModel[253].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 495
		bodyModel[253].setRotationPoint(20F, 2.5F, 19.5F);
		bodyModel[253].rotateAngleZ = 3.14159265F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F); // Box 496
		bodyModel[254].setRotationPoint(23.5F, -3.5F, 20F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 497
		bodyModel[255].setRotationPoint(24.5F, -7.3F, 20.4F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 498
		bodyModel[256].setRotationPoint(27.5F, -7.3F, 20.4F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 499
		bodyModel[257].setRotationPoint(26F, -7.3F, 20.4F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[258].setRotationPoint(30F, -7.5F, 14F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 502
		bodyModel[259].setRotationPoint(20F, -7.5F, 14F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 503
		bodyModel[260].setRotationPoint(20F, -7.5F, 19F);

		bodyModel[261].addShapeBox(-1F, 0.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 504
		bodyModel[261].setRotationPoint(29F, -1.5F, 19F);
		bodyModel[261].rotateAngleZ = -0.52359878F;

		bodyModel[262].addShapeBox(-8F, -1.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 505
		bodyModel[262].setRotationPoint(27F, -1.25F, 19F);
		bodyModel[262].rotateAngleZ = 0.52359878F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 506
		bodyModel[263].setRotationPoint(27F, 2F, 20F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 507
		bodyModel[264].setRotationPoint(25F, 2F, 20F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 509
		bodyModel[265].setRotationPoint(27F, -0.5F, 20.2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 510
		bodyModel[266].setRotationPoint(25F, -0.5F, 20.2F);

		bodyModel[267].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 511
		bodyModel[267].setRotationPoint(21.5F, -6.2F, 13.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F); // Box 512
		bodyModel[268].setRotationPoint(-1.5F, -3.5F, 20F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 513
		bodyModel[269].setRotationPoint(-2F, -3.5F, 14F);

		bodyModel[270].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 514
		bodyModel[270].setRotationPoint(3F, 1.5F, 19F);
		bodyModel[270].rotateAngleZ = -0.15707963F;

		bodyModel[271].addShapeBox(-1F, 1F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 515
		bodyModel[271].setRotationPoint(-4F, 1.15F, 19F);
		bodyModel[271].rotateAngleZ = 0.15707963F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 516
		bodyModel[272].setRotationPoint(2F, 2F, 20F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 517
		bodyModel[273].setRotationPoint(0F, 2F, 20F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 518
		bodyModel[274].setRotationPoint(2F, -0.5F, 20.2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 519
		bodyModel[275].setRotationPoint(0F, -0.5F, 20.2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F); // Box 520
		bodyModel[276].setRotationPoint(-1.5F, -3.5F, 20F);

		bodyModel[277].addShapeBox(-1F, 0.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 521
		bodyModel[277].setRotationPoint(4F, -1.5F, 19F);
		bodyModel[277].rotateAngleZ = -0.52359878F;

		bodyModel[278].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 522
		bodyModel[278].setRotationPoint(4F, -1.5F, 19F);
		bodyModel[278].rotateAngleZ = -0.52359878F;

		bodyModel[279].addShapeBox(-1F, -0.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 523
		bodyModel[279].setRotationPoint(4F, -1.5F, 19F);
		bodyModel[279].rotateAngleZ = -0.52359878F;

		bodyModel[280].addShapeBox(-8F, -1.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 524
		bodyModel[280].setRotationPoint(2F, -1.25F, 19F);
		bodyModel[280].rotateAngleZ = 0.52359878F;

		bodyModel[281].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 525
		bodyModel[281].setRotationPoint(2F, -1.25F, 19F);
		bodyModel[281].rotateAngleZ = 0.52359878F;

		bodyModel[282].addShapeBox(-9F, -2.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 526
		bodyModel[282].setRotationPoint(2F, -1.25F, 19F);
		bodyModel[282].rotateAngleZ = 0.52359878F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 527
		bodyModel[283].setRotationPoint(1F, -7.3F, 20.4F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 528
		bodyModel[284].setRotationPoint(2.5F, -7.3F, 20.4F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 529
		bodyModel[285].setRotationPoint(-0.5F, -7.3F, 20.4F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[286].setRotationPoint(-1.5F, -7.5F, 20F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 531
		bodyModel[287].setRotationPoint(-5F, -7.5F, 19F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[288].setRotationPoint(5F, -7.5F, 14F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[289].setRotationPoint(0F, -7.5F, 15F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 534
		bodyModel[290].setRotationPoint(-5F, -7.5F, 14F);

		bodyModel[291].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 535
		bodyModel[291].setRotationPoint(-3.5F, -6.2F, 13.5F);

		bodyModel[292].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 537
		bodyModel[292].setRotationPoint(8F, 2.5F, 19.5F);
		bodyModel[292].rotateAngleZ = 3.14159265F;

		bodyModel[293].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 539
		bodyModel[293].setRotationPoint(-5F, 2.5F, 19.5F);
		bodyModel[293].rotateAngleZ = 3.14159265F;

		bodyModel[294].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 541
		bodyModel[294].setRotationPoint(2F, -1.25F, 15F);
		bodyModel[294].rotateAngleZ = 0.52359878F;

		bodyModel[295].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 542
		bodyModel[295].setRotationPoint(4F, -1.5F, 15F);
		bodyModel[295].rotateAngleZ = -0.52359878F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F); // Box 543
		bodyModel[296].setRotationPoint(-26.5F, -3.5F, 20F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 544
		bodyModel[297].setRotationPoint(-27F, -3.5F, 14F);

		bodyModel[298].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 545
		bodyModel[298].setRotationPoint(-22F, 1.5F, 19F);
		bodyModel[298].rotateAngleZ = -0.15707963F;

		bodyModel[299].addShapeBox(-1F, 1F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 546
		bodyModel[299].setRotationPoint(-29F, 1.15F, 19F);
		bodyModel[299].rotateAngleZ = 0.15707963F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 547
		bodyModel[300].setRotationPoint(-23F, 2F, 20F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 548
		bodyModel[301].setRotationPoint(-25F, 2F, 20F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 549
		bodyModel[302].setRotationPoint(-23F, -0.5F, 20.2F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 550
		bodyModel[303].setRotationPoint(-25F, -0.5F, 20.2F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F); // Box 551
		bodyModel[304].setRotationPoint(-26.5F, -3.5F, 20F);

		bodyModel[305].addShapeBox(-1F, 0.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 552
		bodyModel[305].setRotationPoint(-21F, -1.5F, 19F);
		bodyModel[305].rotateAngleZ = -0.52359878F;

		bodyModel[306].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 553
		bodyModel[306].setRotationPoint(-21F, -1.5F, 19F);
		bodyModel[306].rotateAngleZ = -0.52359878F;

		bodyModel[307].addShapeBox(-1F, -0.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 554
		bodyModel[307].setRotationPoint(-21F, -1.5F, 19F);
		bodyModel[307].rotateAngleZ = -0.52359878F;

		bodyModel[308].addShapeBox(-8F, -1.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 555
		bodyModel[308].setRotationPoint(-23F, -1.25F, 19F);
		bodyModel[308].rotateAngleZ = 0.52359878F;

		bodyModel[309].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 556
		bodyModel[309].setRotationPoint(-23F, -1.25F, 19F);
		bodyModel[309].rotateAngleZ = 0.52359878F;

		bodyModel[310].addShapeBox(-9F, -2.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 557
		bodyModel[310].setRotationPoint(-23F, -1.25F, 19F);
		bodyModel[310].rotateAngleZ = 0.52359878F;

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 558
		bodyModel[311].setRotationPoint(-24F, -7.3F, 20.4F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 559
		bodyModel[312].setRotationPoint(-22.5F, -7.3F, 20.4F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 560
		bodyModel[313].setRotationPoint(-25.5F, -7.3F, 20.4F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[314].setRotationPoint(-26.5F, -7.5F, 20F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 562
		bodyModel[315].setRotationPoint(-30F, -7.5F, 19F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[316].setRotationPoint(-20F, -7.5F, 14F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[317].setRotationPoint(-25F, -7.5F, 15F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 565
		bodyModel[318].setRotationPoint(-30F, -7.5F, 14F);

		bodyModel[319].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 566
		bodyModel[319].setRotationPoint(-28.5F, -6.2F, 13.5F);

		bodyModel[320].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 568
		bodyModel[320].setRotationPoint(-17F, 2.5F, 19.5F);
		bodyModel[320].rotateAngleZ = 3.14159265F;

		bodyModel[321].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 570
		bodyModel[321].setRotationPoint(-30F, 2.5F, 19.5F);
		bodyModel[321].rotateAngleZ = 3.14159265F;

		bodyModel[322].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 572
		bodyModel[322].setRotationPoint(-23F, -1.25F, 15F);
		bodyModel[322].rotateAngleZ = 0.52359878F;

		bodyModel[323].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 573
		bodyModel[323].setRotationPoint(-21F, -1.5F, 15F);
		bodyModel[323].rotateAngleZ = -0.52359878F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 41, 8, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[324].setRotationPoint(-14F, -22F, -25F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 41, 8, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[325].setRotationPoint(-14F, -22F, 13F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 16, 8, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[326].setRotationPoint(11F, -22F, -13F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 5, 8, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[327].setRotationPoint(-14F, -22F, -13F);

		bodyModel[328].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 588
		bodyModel[328].setRotationPoint(33F, 2.5F, -16.5F);
		bodyModel[328].rotateAngleZ = 3.14159265F;

		bodyModel[329].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 591
		bodyModel[329].setRotationPoint(20F, 2.5F, -16.5F);
		bodyModel[329].rotateAngleZ = 3.14159265F;

		bodyModel[330].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 592
		bodyModel[330].setRotationPoint(8F, 2.5F, -16.5F);
		bodyModel[330].rotateAngleZ = 3.14159265F;

		bodyModel[331].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 595
		bodyModel[331].setRotationPoint(-5F, 2.5F, -16.5F);
		bodyModel[331].rotateAngleZ = 3.14159265F;

		bodyModel[332].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 598
		bodyModel[332].setRotationPoint(-17F, 2.5F, -16.5F);
		bodyModel[332].rotateAngleZ = 3.14159265F;

		bodyModel[333].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1)}), 7, 4, 4, 16, 7, ModelRendererTurbo.MR_FRONT, new float[]{2, 2, 2, 2, 2, 2, 2, 2}); // Shape 601
		bodyModel[333].setRotationPoint(-30F, 2.5F, -16.5F);
		bodyModel[333].rotateAngleZ = 3.14159265F;

		bodyModel[334].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[334].setRotationPoint(25F, -7.5F, -19F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 608
		bodyModel[335].setRotationPoint(23F, -3.5F, -20F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F); // Box 609
		bodyModel[336].setRotationPoint(23.5F, -3.5F, -21F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[337].setRotationPoint(23.5F, -7.5F, -21F);

		bodyModel[338].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 611
		bodyModel[338].setRotationPoint(29F, -1.5F, -21F);
		bodyModel[338].rotateAngleZ = -0.52359878F;

		bodyModel[339].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 612
		bodyModel[339].setRotationPoint(27F, -1.25F, -21F);
		bodyModel[339].rotateAngleZ = 0.52359878F;

		bodyModel[340].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 613
		bodyModel[340].setRotationPoint(29F, -1.5F, -17F);
		bodyModel[340].rotateAngleZ = -0.52359878F;

		bodyModel[341].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 614
		bodyModel[341].setRotationPoint(27F, -1.25F, -17F);
		bodyModel[341].rotateAngleZ = 0.52359878F;

		bodyModel[342].addShapeBox(-1F, -0.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 615
		bodyModel[342].setRotationPoint(29F, -1.5F, -21F);
		bodyModel[342].rotateAngleZ = -0.52359878F;

		bodyModel[343].addShapeBox(-9F, -2.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 616
		bodyModel[343].setRotationPoint(27F, -1.25F, -21F);
		bodyModel[343].rotateAngleZ = 0.52359878F;

		bodyModel[344].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 617
		bodyModel[344].setRotationPoint(28F, 1.5F, -21F);
		bodyModel[344].rotateAngleZ = -0.15707963F;

		bodyModel[345].addShapeBox(-1F, 1F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 618
		bodyModel[345].setRotationPoint(21F, 1.15F, -21F);
		bodyModel[345].rotateAngleZ = 0.15707963F;

		bodyModel[346].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F); // Box 619
		bodyModel[346].setRotationPoint(23.5F, -3.5F, -21F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[347].setRotationPoint(24.5F, -7.3F, -21.4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[348].setRotationPoint(27.5F, -7.3F, -21.4F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[349].setRotationPoint(26F, -7.3F, -21.4F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[350].setRotationPoint(30F, -7.5F, -20F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 624
		bodyModel[351].setRotationPoint(20F, -7.5F, -15F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 625
		bodyModel[352].setRotationPoint(20F, -7.5F, -20F);

		bodyModel[353].addShapeBox(-1F, 0.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 626
		bodyModel[353].setRotationPoint(29F, -1.5F, -21F);
		bodyModel[353].rotateAngleZ = -0.52359878F;

		bodyModel[354].addShapeBox(-8F, -1.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 627
		bodyModel[354].setRotationPoint(27F, -1.25F, -21F);
		bodyModel[354].rotateAngleZ = 0.52359878F;

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 628
		bodyModel[355].setRotationPoint(27F, 2F, -21F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 629
		bodyModel[356].setRotationPoint(25F, 2F, -21F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 630
		bodyModel[357].setRotationPoint(27F, -0.5F, -21.2F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 631
		bodyModel[358].setRotationPoint(25F, -0.5F, -21.2F);

		bodyModel[359].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 632
		bodyModel[359].setRotationPoint(21.5F, -6.2F, -20.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		bodyModel[360].setRotationPoint(0F, -7.5F, -19F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 634
		bodyModel[361].setRotationPoint(-2F, -3.5F, -20F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F); // Box 635
		bodyModel[362].setRotationPoint(-1.5F, -3.5F, -21F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[363].setRotationPoint(-1.5F, -7.5F, -21F);

		bodyModel[364].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 637
		bodyModel[364].setRotationPoint(4F, -1.5F, -21F);
		bodyModel[364].rotateAngleZ = -0.52359878F;

		bodyModel[365].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 638
		bodyModel[365].setRotationPoint(2F, -1.25F, -21F);
		bodyModel[365].rotateAngleZ = 0.52359878F;

		bodyModel[366].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 639
		bodyModel[366].setRotationPoint(4F, -1.5F, -17F);
		bodyModel[366].rotateAngleZ = -0.52359878F;

		bodyModel[367].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 640
		bodyModel[367].setRotationPoint(2F, -1.25F, -17F);
		bodyModel[367].rotateAngleZ = 0.52359878F;

		bodyModel[368].addShapeBox(-1F, -0.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 641
		bodyModel[368].setRotationPoint(4F, -1.5F, -21F);
		bodyModel[368].rotateAngleZ = -0.52359878F;

		bodyModel[369].addShapeBox(-9F, -2.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 642
		bodyModel[369].setRotationPoint(2F, -1.25F, -21F);
		bodyModel[369].rotateAngleZ = 0.52359878F;

		bodyModel[370].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 643
		bodyModel[370].setRotationPoint(3F, 1.5F, -21F);
		bodyModel[370].rotateAngleZ = -0.15707963F;

		bodyModel[371].addShapeBox(-1F, 1F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 644
		bodyModel[371].setRotationPoint(-4F, 1.15F, -21F);
		bodyModel[371].rotateAngleZ = 0.15707963F;

		bodyModel[372].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F); // Box 645
		bodyModel[372].setRotationPoint(-1.5F, -3.5F, -21F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		bodyModel[373].setRotationPoint(-0.5F, -7.3F, -21.4F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		bodyModel[374].setRotationPoint(2.5F, -7.3F, -21.4F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		bodyModel[375].setRotationPoint(1F, -7.3F, -21.4F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 649
		bodyModel[376].setRotationPoint(5F, -7.5F, -20F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 650
		bodyModel[377].setRotationPoint(-5F, -7.5F, -15F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 651
		bodyModel[378].setRotationPoint(-5F, -7.5F, -20F);

		bodyModel[379].addShapeBox(-1F, 0.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 652
		bodyModel[379].setRotationPoint(4F, -1.5F, -21F);
		bodyModel[379].rotateAngleZ = -0.52359878F;

		bodyModel[380].addShapeBox(-8F, -1.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 653
		bodyModel[380].setRotationPoint(2F, -1.25F, -21F);
		bodyModel[380].rotateAngleZ = 0.52359878F;

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 654
		bodyModel[381].setRotationPoint(2F, 2F, -21F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 655
		bodyModel[382].setRotationPoint(0F, 2F, -21F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 656
		bodyModel[383].setRotationPoint(2F, -0.5F, -21.2F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 657
		bodyModel[384].setRotationPoint(0F, -0.5F, -21.2F);

		bodyModel[385].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 658
		bodyModel[385].setRotationPoint(-3.5F, -6.2F, -20.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[386].setRotationPoint(-25F, -7.5F, -19F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 660
		bodyModel[387].setRotationPoint(-27F, -3.5F, -20F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F); // Box 661
		bodyModel[388].setRotationPoint(-26.5F, -3.5F, -21F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[389].setRotationPoint(-26.5F, -7.5F, -21F);

		bodyModel[390].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 663
		bodyModel[390].setRotationPoint(-21F, -1.5F, -21F);
		bodyModel[390].rotateAngleZ = -0.52359878F;

		bodyModel[391].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 664
		bodyModel[391].setRotationPoint(-23F, -1.25F, -21F);
		bodyModel[391].rotateAngleZ = 0.52359878F;

		bodyModel[392].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 665
		bodyModel[392].setRotationPoint(-21F, -1.5F, -17F);
		bodyModel[392].rotateAngleZ = -0.52359878F;

		bodyModel[393].addShapeBox(-8F, -2F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 666
		bodyModel[393].setRotationPoint(-23F, -1.25F, -17F);
		bodyModel[393].rotateAngleZ = 0.52359878F;

		bodyModel[394].addShapeBox(-1F, -0.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 667
		bodyModel[394].setRotationPoint(-21F, -1.5F, -21F);
		bodyModel[394].rotateAngleZ = -0.52359878F;

		bodyModel[395].addShapeBox(-9F, -2.5F, 0F, 7, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 668
		bodyModel[395].setRotationPoint(-23F, -1.25F, -21F);
		bodyModel[395].rotateAngleZ = 0.52359878F;

		bodyModel[396].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 669
		bodyModel[396].setRotationPoint(-22F, 1.5F, -21F);
		bodyModel[396].rotateAngleZ = -0.15707963F;

		bodyModel[397].addShapeBox(-1F, 1F, 0F, 6, 2, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 670
		bodyModel[397].setRotationPoint(-29F, 1.15F, -21F);
		bodyModel[397].rotateAngleZ = 0.15707963F;

		bodyModel[398].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F, -1.7F, 0.3F, -0.1F); // Box 671
		bodyModel[398].setRotationPoint(-26.5F, -3.5F, -21F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		bodyModel[399].setRotationPoint(-25.5F, -7.3F, -21.4F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 673
		bodyModel[400].setRotationPoint(-22.5F, -7.3F, -21.4F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		bodyModel[401].setRotationPoint(-24F, -7.3F, -21.4F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 675
		bodyModel[402].setRotationPoint(-20F, -7.5F, -20F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 676
		bodyModel[403].setRotationPoint(-30F, -7.5F, -15F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 677
		bodyModel[404].setRotationPoint(-30F, -7.5F, -20F);

		bodyModel[405].addShapeBox(-1F, 0.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 678
		bodyModel[405].setRotationPoint(-21F, -1.5F, -21F);
		bodyModel[405].rotateAngleZ = -0.52359878F;

		bodyModel[406].addShapeBox(-8F, -1.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 679
		bodyModel[406].setRotationPoint(-23F, -1.25F, -21F);
		bodyModel[406].rotateAngleZ = 0.52359878F;

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 680
		bodyModel[407].setRotationPoint(-23F, 2F, -21F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 681
		bodyModel[408].setRotationPoint(-25F, 2F, -21F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 682
		bodyModel[409].setRotationPoint(-23F, -0.5F, -21.2F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 683
		bodyModel[410].setRotationPoint(-25F, -0.5F, -21.2F);

		bodyModel[411].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 7, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 684
		bodyModel[411].setRotationPoint(-28.5F, -6.2F, -20.5F);

		bodyModel[412].addShapeBox(0F, -1F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 553
		bodyModel[412].setRotationPoint(29F, -22F, 20F);
		bodyModel[412].rotateAngleX = 1.01229097F;
		bodyModel[412].rotateAngleY = -1.57079633F;

		bodyModel[413].addShapeBox(-0.5F, -1.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 554
		bodyModel[413].setRotationPoint(29F, -22F, 20F);
		bodyModel[413].rotateAngleX = 1.01229097F;
		bodyModel[413].rotateAngleY = -1.57079633F;

		bodyModel[414].addShapeBox(37.5F, -1.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 557
		bodyModel[414].setRotationPoint(29F, -22F, 20F);
		bodyModel[414].rotateAngleX = 1.01229097F;
		bodyModel[414].rotateAngleY = -1.57079633F;

		bodyModel[415].addShapeBox(38F, -1F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 558
		bodyModel[415].setRotationPoint(29F, -22F, 20F);
		bodyModel[415].rotateAngleX = 1.01229097F;
		bodyModel[415].rotateAngleY = -1.57079633F;

		bodyModel[416].addShapeBox(4.5F, 11.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 559
		bodyModel[416].setRotationPoint(29F, -22F, 20F);
		bodyModel[416].rotateAngleX = 1.01229097F;
		bodyModel[416].rotateAngleY = -1.57079633F;

		bodyModel[417].addShapeBox(5F, 12F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 560
		bodyModel[417].setRotationPoint(29F, -22F, 20F);
		bodyModel[417].rotateAngleX = 1.01229097F;
		bodyModel[417].rotateAngleY = -1.57079633F;

		bodyModel[418].addShapeBox(32.5F, 11.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 561
		bodyModel[418].setRotationPoint(29F, -22F, 20F);
		bodyModel[418].rotateAngleX = 1.01229097F;
		bodyModel[418].rotateAngleY = -1.57079633F;

		bodyModel[419].addShapeBox(33F, 12F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 562
		bodyModel[419].setRotationPoint(29F, -22F, 20F);
		bodyModel[419].rotateAngleX = 1.01229097F;
		bodyModel[419].rotateAngleY = -1.57079633F;

		bodyModel[420].addShapeBox(24.5F, -1.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 563
		bodyModel[420].setRotationPoint(29F, -22F, 20F);
		bodyModel[420].rotateAngleX = 1.01229097F;
		bodyModel[420].rotateAngleY = -1.57079633F;

		bodyModel[421].addShapeBox(25F, -1F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 564
		bodyModel[421].setRotationPoint(29F, -22F, 20F);
		bodyModel[421].rotateAngleX = 1.01229097F;
		bodyModel[421].rotateAngleY = -1.57079633F;

		bodyModel[422].addShapeBox(12.5F, -1.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 565
		bodyModel[422].setRotationPoint(29F, -22F, 20F);
		bodyModel[422].rotateAngleX = 1.01229097F;
		bodyModel[422].rotateAngleY = -1.57079633F;

		bodyModel[423].addShapeBox(13F, -1F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 566
		bodyModel[423].setRotationPoint(29F, -22F, 20F);
		bodyModel[423].rotateAngleX = 1.01229097F;
		bodyModel[423].rotateAngleY = -1.57079633F;

		bodyModel[424].addShapeBox(21F, 12F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 567
		bodyModel[424].setRotationPoint(29F, -22F, 20F);
		bodyModel[424].rotateAngleX = 1.01229097F;
		bodyModel[424].rotateAngleY = -1.57079633F;

		bodyModel[425].addShapeBox(20.5F, 11.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 568
		bodyModel[425].setRotationPoint(29F, -22F, 20F);
		bodyModel[425].rotateAngleX = 1.01229097F;
		bodyModel[425].rotateAngleY = -1.57079633F;

		bodyModel[426].addShapeBox(17F, 12F, -0.7F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 569
		bodyModel[426].setRotationPoint(29F, -22F, 20F);
		bodyModel[426].rotateAngleX = 1.01229097F;
		bodyModel[426].rotateAngleY = -1.57079633F;

		bodyModel[427].addShapeBox(16.5F, 11.5F, -1.7F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 570
		bodyModel[427].setRotationPoint(29F, -22F, 20F);
		bodyModel[427].rotateAngleX = 1.01229097F;
		bodyModel[427].rotateAngleY = -1.57079633F;

		bodyModel[428].addShapeBox(0F, 0F, 0F, 15, 8, 10, 0F, 0F, 0F, -4F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[428].setRotationPoint(27F, -22F, -25F);

		bodyModel[429].addShapeBox(2F, 0F, 0F, 5, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[429].setRotationPoint(39F, -16F, -12F);
		bodyModel[429].rotateAngleX = 0.13962634F;
		bodyModel[429].rotateAngleY = -0.27925268F;
		bodyModel[429].rotateAngleZ = -0.54105207F;

		bodyModel[430].addShapeBox(2F, 0F, 0F, 5, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[430].setRotationPoint(39F, -16F, -1F);
		bodyModel[430].rotateAngleX = 0.05235988F;
		bodyModel[430].rotateAngleY = -0.08726646F;
		bodyModel[430].rotateAngleZ = -0.45378561F;

		bodyModel[431].addShapeBox(2F, 0F, 0F, 5, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[431].setRotationPoint(39F, -16F, 9F);
		bodyModel[431].rotateAngleX = -0.01745329F;
		bodyModel[431].rotateAngleZ = -0.4712389F;

		bodyModel[432].addShapeBox(2F, 0F, 0F, 5, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[432].setRotationPoint(36F, -17F, -8F);
		bodyModel[432].rotateAngleX = 0.13962634F;
		bodyModel[432].rotateAngleY = -0.17453293F;
		bodyModel[432].rotateAngleZ = -0.36651914F;

		bodyModel[433].addShapeBox(2F, 0F, 0F, 5, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[433].setRotationPoint(36F, -16F, 5F);
		bodyModel[433].rotateAngleX = 0.10471976F;
		bodyModel[433].rotateAngleY = -0.26179939F;
		bodyModel[433].rotateAngleZ = -0.08726646F;

		bodyModel[434].addShapeBox(0F, 0F, 0F, 4, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[434].setRotationPoint(45F, -11F, -13F);
		bodyModel[434].rotateAngleZ = 0.50614548F;

		bodyModel[435].addShapeBox(2F, -1F, 1F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[435].setRotationPoint(45F, -10F, -13F);
		bodyModel[435].rotateAngleZ = 0.15707963F;

		bodyModel[436].addShapeBox(2F, -1F, 1F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[436].setRotationPoint(45F, -10F, 10F);
		bodyModel[436].rotateAngleZ = 0.15707963F;

		bodyModel[437].addShapeBox(-2F, -3F, 6F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 660
		bodyModel[437].setRotationPoint(36F, -19.9F, -10.6F);
		bodyModel[437].rotateAngleX = 2.58308729F;
		bodyModel[437].rotateAngleY = -1.57079633F;

		bodyModel[438].addShapeBox(-2F, -3F, 4F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		bodyModel[438].setRotationPoint(36F, -19.9F, -10.6F);
		bodyModel[438].rotateAngleX = 2.58308729F;
		bodyModel[438].rotateAngleY = -1.57079633F;

		bodyModel[439].addShapeBox(-2F, -3F, 3F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[439].setRotationPoint(36F, -19.9F, -10.6F);
		bodyModel[439].rotateAngleX = 2.58308729F;
		bodyModel[439].rotateAngleY = -1.57079633F;

		bodyModel[440].addShapeBox(-2F, -3F, 2F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 663
		bodyModel[440].setRotationPoint(36F, -19.9F, -10.6F);
		bodyModel[440].rotateAngleX = 2.58308729F;
		bodyModel[440].rotateAngleY = -1.57079633F;

		bodyModel[441].addShapeBox(-2F, -3F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		bodyModel[441].setRotationPoint(36F, -19.9F, -10.6F);
		bodyModel[441].rotateAngleX = 2.58308729F;
		bodyModel[441].rotateAngleY = -1.57079633F;

		bodyModel[442].addShapeBox(-2F, -3F, -1F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[442].setRotationPoint(36F, -19.9F, -10.6F);
		bodyModel[442].rotateAngleX = 2.58308729F;
		bodyModel[442].rotateAngleY = -1.57079633F;

		bodyModel[443].addShapeBox(1F, -2F, 0.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 666
		bodyModel[443].setRotationPoint(36F, -19.9F, -12.6F);
		bodyModel[443].rotateAngleX = 2.58308729F;
		bodyModel[443].rotateAngleY = -1.57079633F;

		bodyModel[444].addShapeBox(1F, -2F, 3.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 667
		bodyModel[444].setRotationPoint(36F, -19.9F, -12.6F);
		bodyModel[444].rotateAngleX = 2.58308729F;
		bodyModel[444].rotateAngleY = -1.57079633F;

		bodyModel[445].addShapeBox(-2F, -2F, 3.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 668
		bodyModel[445].setRotationPoint(36F, -19.9F, -12.6F);
		bodyModel[445].rotateAngleX = 2.58308729F;
		bodyModel[445].rotateAngleY = -1.57079633F;

		bodyModel[446].addShapeBox(-2F, -2F, 0.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 669
		bodyModel[446].setRotationPoint(36F, -19.9F, -12.6F);
		bodyModel[446].rotateAngleX = 2.58308729F;
		bodyModel[446].rotateAngleY = -1.57079633F;

		bodyModel[447].addShapeBox(1F, -2F, -1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 670
		bodyModel[447].setRotationPoint(36F, -19.9F, 0.4F);
		bodyModel[447].rotateAngleX = 2.58308729F;
		bodyModel[447].rotateAngleY = -1.57079633F;

		bodyModel[448].addShapeBox(1F, -2F, 1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 671
		bodyModel[448].setRotationPoint(36F, -19.9F, 0.4F);
		bodyModel[448].rotateAngleX = 2.58308729F;
		bodyModel[448].rotateAngleY = -1.57079633F;

		bodyModel[449].addShapeBox(-2F, -2F, 1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 672
		bodyModel[449].setRotationPoint(36F, -19.9F, 0.4F);
		bodyModel[449].rotateAngleX = 2.58308729F;
		bodyModel[449].rotateAngleY = -1.57079633F;

		bodyModel[450].addShapeBox(-2F, -2F, -1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 673
		bodyModel[450].setRotationPoint(36F, -19.9F, 0.4F);
		bodyModel[450].rotateAngleX = 2.58308729F;
		bodyModel[450].rotateAngleY = -1.57079633F;

		bodyModel[451].addShapeBox(-2F, -3F, -3F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		bodyModel[451].setRotationPoint(36F, -19.9F, 2.4F);
		bodyModel[451].rotateAngleX = 2.58308729F;
		bodyModel[451].rotateAngleY = -1.57079633F;

		bodyModel[452].addShapeBox(-2F, -3F, -2F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		bodyModel[452].setRotationPoint(36F, -19.9F, 2.4F);
		bodyModel[452].rotateAngleX = 2.58308729F;
		bodyModel[452].rotateAngleY = -1.57079633F;

		bodyModel[453].addShapeBox(-2F, -3F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 676
		bodyModel[453].setRotationPoint(36F, -19.9F, 2.4F);
		bodyModel[453].rotateAngleX = 2.58308729F;
		bodyModel[453].rotateAngleY = -1.57079633F;

		bodyModel[454].addShapeBox(-2F, -3F, 1F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		bodyModel[454].setRotationPoint(36F, -19.9F, 2.4F);
		bodyModel[454].rotateAngleX = 2.58308729F;
		bodyModel[454].rotateAngleY = -1.57079633F;

		bodyModel[455].addShapeBox(-2F, -3F, 2F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[455].setRotationPoint(36F, -19.9F, 2.4F);
		bodyModel[455].rotateAngleX = 2.58308729F;
		bodyModel[455].rotateAngleY = -1.57079633F;

		bodyModel[456].addShapeBox(-2F, -3F, 4F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 679
		bodyModel[456].setRotationPoint(36F, -19.9F, 2.4F);
		bodyModel[456].rotateAngleX = 2.58308729F;
		bodyModel[456].rotateAngleY = -1.57079633F;

		bodyModel[457].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 680
		bodyModel[457].setRotationPoint(36F, -19.9F, 13.4F);
		bodyModel[457].rotateAngleX = 2.58308729F;
		bodyModel[457].rotateAngleY = -1.57079633F;

		bodyModel[458].addShapeBox(1F, -2F, 3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 681
		bodyModel[458].setRotationPoint(36F, -19.9F, 13.4F);
		bodyModel[458].rotateAngleX = 2.58308729F;
		bodyModel[458].rotateAngleY = -1.57079633F;

		bodyModel[459].addShapeBox(-2F, -2F, 3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 682
		bodyModel[459].setRotationPoint(36F, -19.9F, 13.4F);
		bodyModel[459].rotateAngleX = 2.58308729F;
		bodyModel[459].rotateAngleY = -1.57079633F;

		bodyModel[460].addShapeBox(-2F, -2F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 683
		bodyModel[460].setRotationPoint(36F, -19.9F, 13.4F);
		bodyModel[460].rotateAngleX = 2.58308729F;
		bodyModel[460].rotateAngleY = -1.57079633F;

		bodyModel[461].addShapeBox(-2F, -3F, -1.5F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 684
		bodyModel[461].setRotationPoint(36F, -19.9F, 15.4F);
		bodyModel[461].rotateAngleX = 2.58308729F;
		bodyModel[461].rotateAngleY = -1.57079633F;

		bodyModel[462].addShapeBox(-2F, -3F, -0.5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		bodyModel[462].setRotationPoint(36F, -19.9F, 15.4F);
		bodyModel[462].rotateAngleX = 2.58308729F;
		bodyModel[462].rotateAngleY = -1.57079633F;

		bodyModel[463].addShapeBox(-2F, -3F, 1.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 686
		bodyModel[463].setRotationPoint(36F, -19.9F, 15.4F);
		bodyModel[463].rotateAngleX = 2.58308729F;
		bodyModel[463].rotateAngleY = -1.57079633F;

		bodyModel[464].addShapeBox(-2F, -3F, 2.5F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
		bodyModel[464].setRotationPoint(36F, -19.9F, 15.4F);
		bodyModel[464].rotateAngleX = 2.58308729F;
		bodyModel[464].rotateAngleY = -1.57079633F;

		bodyModel[465].addShapeBox(-2F, -3F, 3.5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		bodyModel[465].setRotationPoint(36F, -19.9F, 15.4F);
		bodyModel[465].rotateAngleX = 2.58308729F;
		bodyModel[465].rotateAngleY = -1.57079633F;

		bodyModel[466].addShapeBox(-2F, -3F, 5.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 689
		bodyModel[466].setRotationPoint(36F, -19.9F, 15.4F);
		bodyModel[466].rotateAngleX = 2.58308729F;
		bodyModel[466].rotateAngleY = -1.57079633F;

		bodyModel[467].addShapeBox(-1F, 0.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 671
		bodyModel[467].setRotationPoint(29F, -1.5F, -21.2F);
		bodyModel[467].rotateAngleZ = -0.52359878F;

		bodyModel[468].addShapeBox(-8F, -1.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 672
		bodyModel[468].setRotationPoint(27F, -1.25F, -21.2F);
		bodyModel[468].rotateAngleZ = 0.52359878F;

		bodyModel[469].addShapeBox(-1F, 0.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 673
		bodyModel[469].setRotationPoint(4F, -1.5F, -21.2F);
		bodyModel[469].rotateAngleZ = -0.52359878F;

		bodyModel[470].addShapeBox(-8F, -1.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 674
		bodyModel[470].setRotationPoint(2F, -1.25F, -21.2F);
		bodyModel[470].rotateAngleZ = 0.52359878F;

		bodyModel[471].addShapeBox(-1F, 0.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 675
		bodyModel[471].setRotationPoint(-21F, -1.5F, -21.2F);
		bodyModel[471].rotateAngleZ = -0.52359878F;

		bodyModel[472].addShapeBox(-8F, -1.5F, 0.05F, 6, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 676
		bodyModel[472].setRotationPoint(-23F, -1.25F, -21.2F);
		bodyModel[472].rotateAngleZ = 0.52359878F;

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		bodyModel[473].setRotationPoint(-38F, -25F, 0F);
		bodyModel[473].rotateAngleY = -0.43633231F;

		bodyModel[474].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[474].setRotationPoint(-30F, -25F, 0F);
		bodyModel[474].rotateAngleY = -2.18166156F;

		bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		bodyModel[475].setRotationPoint(-30F, -25F, 14F);
		bodyModel[475].rotateAngleY = -1.15191731F;

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		bodyModel[476].setRotationPoint(-32F, -25F, 4F);
		bodyModel[476].rotateAngleY = 1.08210414F;

		bodyModel[477].addShapeBox(2F, 0F, 0F, 5, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		bodyModel[477].setRotationPoint(-44F, -25F, -7.5F);
		bodyModel[477].rotateAngleY = 0.12217305F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 299
		turretModel[1] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 33
		turretModel[2] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 640
		turretModel[3] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 642
		turretModel[4] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 645
		turretModel[5] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 651
		turretModel[6] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 655
		turretModel[7] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 657
		turretModel[8] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 658
		turretModel[9] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 660
		turretModel[10] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 666
		turretModel[11] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 669
		turretModel[12] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 670
		turretModel[13] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 480
		turretModel[14] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 481
		turretModel[15] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 484
		turretModel[16] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 486
		turretModel[17] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 487
		turretModel[18] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 491
		turretModel[19] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 497
		turretModel[20] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 578
		turretModel[21] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 579
		turretModel[22] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 580
		turretModel[23] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 581
		turretModel[24] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 582
		turretModel[25] = new ModelRendererTurbo(this, 273, 233, textureX, textureY); // Box 583
		turretModel[26] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Box 584
		turretModel[27] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 585
		turretModel[28] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 685
		turretModel[29] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 686
		turretModel[30] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 687
		turretModel[31] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 688
		turretModel[32] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 689
		turretModel[33] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Box 690
		turretModel[34] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 691
		turretModel[35] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 692
		turretModel[36] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 695
		turretModel[37] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 696
		turretModel[38] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 697
		turretModel[39] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 698
		turretModel[40] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 699
		turretModel[41] = new ModelRendererTurbo(this, 385, 265, textureX, textureY); // Box 700
		turretModel[42] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 701
		turretModel[43] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 702
		turretModel[44] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Box 572
		turretModel[45] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Box 574
		turretModel[46] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Box 575
		turretModel[47] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 576
		turretModel[48] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 577
		turretModel[49] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Box 578
		turretModel[50] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Box 579
		turretModel[51] = new ModelRendererTurbo(this, 385, 273, textureX, textureY); // Box 580
		turretModel[52] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 581
		turretModel[53] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 582
		turretModel[54] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 583
		turretModel[55] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Box 584
		turretModel[56] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 585
		turretModel[57] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Box 586
		turretModel[58] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 580
		turretModel[59] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 581
		turretModel[60] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Box 582
		turretModel[61] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 583
		turretModel[62] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Box 585
		turretModel[63] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 586
		turretModel[64] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 587
		turretModel[65] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 588
		turretModel[66] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 589
		turretModel[67] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 590
		turretModel[68] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 599
		turretModel[69] = new ModelRendererTurbo(this, 73, 257, textureX, textureY); // Box 600
		turretModel[70] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Box 601
		turretModel[71] = new ModelRendererTurbo(this, 73, 281, textureX, textureY); // Box 602
		turretModel[72] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Box 603
		turretModel[73] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 604
		turretModel[74] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 623
		turretModel[75] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Box 625
		turretModel[76] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Box 627
		turretModel[77] = new ModelRendererTurbo(this, 132, 324, textureX, textureY); // Box 628
		turretModel[78] = new ModelRendererTurbo(this, 497, 289, textureX, textureY); // Box 629
		turretModel[79] = new ModelRendererTurbo(this, 171, 326, textureX, textureY); // Box 630
		turretModel[80] = new ModelRendererTurbo(this, 148, 332, textureX, textureY); // Box 632
		turretModel[81] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 633
		turretModel[82] = new ModelRendererTurbo(this, 121, 297, textureX, textureY); // Box 634
		turretModel[83] = new ModelRendererTurbo(this, 153, 297, textureX, textureY); // Box 636
		turretModel[84] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 637
		turretModel[85] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 639
		turretModel[86] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 641
		turretModel[87] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 638
		turretModel[88] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 639
		turretModel[89] = new ModelRendererTurbo(this, 201, 297, textureX, textureY); // Box 640
		turretModel[90] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Box 641
		turretModel[91] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Box 642
		turretModel[92] = new ModelRendererTurbo(this, 40, 290, textureX, textureY); // Box 288
		turretModel[93] = new ModelRendererTurbo(this, 42, 298, textureX, textureY); // Box 289
		turretModel[94] = new ModelRendererTurbo(this, 0, 301, textureX, textureY); // Box 290
		turretModel[95] = new ModelRendererTurbo(this, 0, 301, textureX, textureY); // Box 291
		turretModel[96] = new ModelRendererTurbo(this, 26, 300, textureX, textureY); // Box 292
		turretModel[97] = new ModelRendererTurbo(this, 17, 312, textureX, textureY); // Box 293
		turretModel[98] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Box 294
		turretModel[99] = new ModelRendererTurbo(this, 24, 290, textureX, textureY); // Box 295
		turretModel[100] = new ModelRendererTurbo(this, 24, 290, textureX, textureY); // Box 296
		turretModel[101] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Box 297
		turretModel[102] = new ModelRendererTurbo(this, 0, 295, textureX, textureY); // Box 299

		turretModel[0].addShapeBox(-25.5F, -16F, -0.5F, 1, 5, 1, 0F, -0.2F, 2.5F, -0.2F, -0.2F, 2.5F, -0.2F, -0.2F, 2.5F, -0.2F, -0.2F, 2.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[0].setRotationPoint(-3F, -23F, 0F);

		turretModel[1].addShapeBox(-8F, 0F, -19F, 24, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F); // Box 33
		turretModel[1].setRotationPoint(-3F, -24F, 0F);

		turretModel[2].addShapeBox(16F, -10F, -13F, 10, 5, 3, 0F, 0F, 0F, -2F, -6F, 0F, -3F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -2F); // Box 640
		turretModel[2].setRotationPoint(-3F, -24F, 0F);

		turretModel[3].addShapeBox(16F, -10F, -12F, 10, 6, 24, 0F, 0F, 0F, -2F, -6F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 642
		turretModel[3].setRotationPoint(-3F, -24F, 0F);

		turretModel[4].addShapeBox(16F, -4F, -9F, 10, 4, 18, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 5F); // Box 645
		turretModel[4].setRotationPoint(-3F, -24F, 0F);

		turretModel[5].addShapeBox(16F, 0F, -15F, 5, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, -6F, -1.3F, 0F, -6F, 0F, 0F, 0F); // Box 651
		turretModel[5].setRotationPoint(-3F, -24F, 0F);

		turretModel[6].addShapeBox(-27F, -10F, -10F, 3, 2, 20, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 655
		turretModel[6].setRotationPoint(-3F, -24F, 0F);

		turretModel[7].addShapeBox(-29F, -10F, -8F, 2, 1, 16, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -4F); // Box 657
		turretModel[7].setRotationPoint(-3F, -24F, 0F);

		turretModel[8].addShapeBox(-24F, -10F, -11F, 1, 3, 22, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 658
		turretModel[8].setRotationPoint(-3F, -24F, 0F);

		turretModel[9].addShapeBox(16F, -4F, -13F, 12, 4, 4, 0F, -10F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 4F, -7F, 0F, -4F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 660
		turretModel[9].setRotationPoint(-3F, -24F, 0F);

		turretModel[10].addShapeBox(-22F, -5F, -19F, 7, 5, 38, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, -14F, 7F, 0F, 2F, 7F, 0F, 2F, -2F, 0F, -14F); // Box 666
		turretModel[10].setRotationPoint(-3F, -24F, 0F);

		turretModel[11].addShapeBox(-24F, -8F, -11F, 1, 3, 22, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -3F); // Box 669
		turretModel[11].setRotationPoint(-3F, -24F, 0F);

		turretModel[12].addShapeBox(-27F, -9F, -10F, 3, 2, 20, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 670
		turretModel[12].setRotationPoint(-3F, -24F, 0F);

		turretModel[13].addShapeBox(-12F, -5F, -19F, 28, 5, 3, 0F, 3F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4F, 3F, 0F, -2F, -4F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, -4F, 0F, -2F); // Box 480
		turretModel[13].setRotationPoint(-3F, -24F, 0F);

		turretModel[14].addShapeBox(-15F, -10F, -17F, 31, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -4F); // Box 481
		turretModel[14].setRotationPoint(-3F, -24F, 0F);

		turretModel[15].addShapeBox(16F, -4F, -15F, 10, 4, 3, 0F, 0F, 1F, -0.5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 0F, 2F, -10F, 0F, 2F, -10F, 0F, -1F, 0F, 0F, -2F); // Box 484
		turretModel[15].setRotationPoint(-3F, -24F, 0F);

		turretModel[16].addShapeBox(-12F, -5F, 16F, 28, 5, 3, 0F, 3F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, -4.5F, 3F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, -4F, 0F, 2F); // Box 486
		turretModel[16].setRotationPoint(-3F, -24F, 0F);

		turretModel[17].addShapeBox(-15F, -10F, 14F, 31, 5, 3, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 2F); // Box 487
		turretModel[17].setRotationPoint(-3F, -24F, 0F);

		turretModel[18].addShapeBox(-18F, 10F, -15F, 10, 1, 30, 0F, 0F, 0F, -10F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F); // Box 491
		turretModel[18].setRotationPoint(-3F, -34F, 0F);

		turretModel[19].addShapeBox(-8F, 0F, 10F, 24, 1, 9, 0F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 497
		turretModel[19].setRotationPoint(-3F, -24F, 0F);

		turretModel[20].addShapeBox(16F, -4F, 9F, 12, 4, 4, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -10F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, 0F, 0F, 4F); // Box 578
		turretModel[20].setRotationPoint(-3F, -24F, 0F);

		turretModel[21].addShapeBox(16F, -4F, 12F, 10, 4, 3, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 1F, -0.5F, 0F, 0F, -2F, -10F, 0F, -1F, -10F, 0F, 2F, 0F, 0F, 2F); // Box 579
		turretModel[21].setRotationPoint(-3F, -24F, 0F);

		turretModel[22].addShapeBox(16F, -10F, 10F, 10, 5, 3, 0F, 0F, 0F, 0F, -6F, 0F, 1F, -6F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1.5F); // Box 580
		turretModel[22].setRotationPoint(-3F, -24F, 0F);

		turretModel[23].addShapeBox(-6F, 2F, -18F, 20, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		turretModel[23].setRotationPoint(-3F, -25F, 0F);

		turretModel[24].addShapeBox(-9F, 2F, -18F, 3, 1, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		turretModel[24].setRotationPoint(-3F, -25F, 0F);

		turretModel[25].addShapeBox(14F, 2F, -15F, 5, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 583
		turretModel[25].setRotationPoint(-3F, -25F, 0F);

		turretModel[26].addShapeBox(-6F, 2F, 13F, 20, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 584
		turretModel[26].setRotationPoint(-3F, -25F, 0F);

		turretModel[27].addShapeBox(-11F, -2F, -16F, 4, 1, 32, 0F, 0F, 0F, 2F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F); // Box 585
		turretModel[27].setRotationPoint(-3F, -24F, 0F);

		turretModel[28].addShapeBox(-16F, -3F, -18.45F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 685
		turretModel[28].setRotationPoint(-3F, -24F, 0F);
		turretModel[28].rotateAngleX = -0.40142573F;
		turretModel[28].rotateAngleY = 0.17453293F;

		turretModel[29].addShapeBox(-16.5F, -3.5F, -17.45F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 686
		turretModel[29].setRotationPoint(-3F, -24F, 0F);
		turretModel[29].rotateAngleX = -0.40142573F;
		turretModel[29].rotateAngleY = 0.17453293F;

		turretModel[30].addShapeBox(10F, 0F, -18.2F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 687
		turretModel[30].setRotationPoint(-3F, -24F, 0F);
		turretModel[30].rotateAngleX = -0.55850536F;
		turretModel[30].rotateAngleY = 0.15707963F;

		turretModel[31].addShapeBox(9.5F, -0.5F, -17.2F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 688
		turretModel[31].setRotationPoint(-3F, -24F, 0F);
		turretModel[31].rotateAngleX = -0.55850536F;
		turretModel[31].rotateAngleY = 0.15707963F;

		turretModel[32].addShapeBox(10F, 6F, -18.6F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 689
		turretModel[32].setRotationPoint(-3F, -24F, 0F);
		turretModel[32].rotateAngleX = -0.45378561F;
		turretModel[32].rotateAngleY = 0.15707963F;

		turretModel[33].addShapeBox(9.5F, 5.5F, -17.6F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 690
		turretModel[33].setRotationPoint(-3F, -24F, 0F);
		turretModel[33].rotateAngleX = -0.45378561F;
		turretModel[33].rotateAngleY = 0.15707963F;

		turretModel[34].addShapeBox(-11F, 8F, -17.6F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 691
		turretModel[34].setRotationPoint(-3F, -24F, 0F);
		turretModel[34].rotateAngleX = -0.57595865F;
		turretModel[34].rotateAngleY = 0.15707963F;

		turretModel[35].addShapeBox(-11.5F, 7.5F, -16.6F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 692
		turretModel[35].setRotationPoint(-3F, -24F, 0F);
		turretModel[35].rotateAngleX = -0.57595865F;
		turretModel[35].rotateAngleY = 0.15707963F;

		turretModel[36].addShapeBox(15F, -3F, -17.8F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 695
		turretModel[36].setRotationPoint(-3F, -24F, 0F);
		turretModel[36].rotateAngleX = -0.36651914F;
		turretModel[36].rotateAngleY = 2.94960644F;

		turretModel[37].addShapeBox(14.5F, -3.5F, -16.8F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 696
		turretModel[37].setRotationPoint(-3F, -24F, 0F);
		turretModel[37].rotateAngleX = -0.36651914F;
		turretModel[37].rotateAngleY = 2.94960644F;

		turretModel[38].addShapeBox(-12.5F, -0.5F, -17.4F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 697
		turretModel[38].setRotationPoint(-3F, -24F, 0F);
		turretModel[38].rotateAngleX = -0.57595865F;
		turretModel[38].rotateAngleY = 2.93215314F;

		turretModel[39].addShapeBox(-12F, 0F, -18.4F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 698
		turretModel[39].setRotationPoint(-3F, -24F, 0F);
		turretModel[39].rotateAngleX = -0.57595865F;
		turretModel[39].rotateAngleY = 2.93215314F;

		turretModel[40].addShapeBox(-11F, 6F, -19.1F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 699
		turretModel[40].setRotationPoint(-3F, -24F, 0F);
		turretModel[40].rotateAngleX = -0.45378561F;
		turretModel[40].rotateAngleY = 2.93215314F;

		turretModel[41].addShapeBox(-11.5F, 5.5F, -18.1F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 700
		turretModel[41].setRotationPoint(-3F, -24F, 0F);
		turretModel[41].rotateAngleX = -0.45378561F;
		turretModel[41].rotateAngleY = 2.93215314F;

		turretModel[42].addShapeBox(9F, 7F, -18.6F, 2, 2, 1, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 701
		turretModel[42].setRotationPoint(-3F, -24F, 0F);
		turretModel[42].rotateAngleX = -0.50614548F;
		turretModel[42].rotateAngleY = 3.01941961F;

		turretModel[43].addShapeBox(8.5F, 6.5F, -17.6F, 3, 3, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 702
		turretModel[43].setRotationPoint(-3F, -24F, 0F);
		turretModel[43].rotateAngleX = -0.50614548F;
		turretModel[43].rotateAngleY = 3.01941961F;

		turretModel[44].addShapeBox(-23F, -10F, -11F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -3F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 7.2F, -7F, 0F, 7F, 0F, 0F, 7F); // Box 572
		turretModel[44].setRotationPoint(-3F, -24F, 0F);

		turretModel[45].addShapeBox(-22F, -10F, 14F, 7, 5, 3, 0F, -4F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, -4F, 0F, -13F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 2F, 0F, 0F, -8.5F); // Box 574
		turretModel[45].setRotationPoint(-3F, -24F, 0F);

		turretModel[46].addShapeBox(-22F, -10F, -17F, 7, 5, 3, 0F, -4F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 10F, -4F, 0F, 10F, 0F, 0F, -8.5F, 0F, 0F, 2F, 0F, 0F, 10F, 0F, 0F, 10F); // Box 575
		turretModel[46].setRotationPoint(-3F, -24F, 0F);

		turretModel[47].addShapeBox(-22F, -10F, -4F, 7, 5, 8, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		turretModel[47].setRotationPoint(-3F, -24F, 0F);

		turretModel[48].addShapeBox(-23F, -10F, 10F, 7, 3, 1, 0F, 0F, 0F, 7F, -3F, 0F, 7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 7F, -7F, 0F, 7F, 0F, 0F, 7.2F, 0F, 0F, 0F); // Box 577
		turretModel[48].setRotationPoint(-3F, -24F, 0F);

		turretModel[49].addShapeBox(-23F, -10F, -3F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 578
		turretModel[49].setRotationPoint(-3F, -24F, 0F);

		turretModel[50].addShapeBox(-23F, -7F, -11F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -7F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -2F, -1F, 0F, 5.2F, -7F, 0F, 7F, 0F, 0F, 7F); // Box 579
		turretModel[50].setRotationPoint(-3F, -24F, 0F);

		turretModel[51].addShapeBox(-23F, -7F, 10F, 7, 2, 1, 0F, 0F, 0F, 7F, -7F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 7F, -7F, 0F, 7F, -1F, 0F, 5.2F, 0F, 0F, -2F); // Box 580
		turretModel[51].setRotationPoint(-3F, -24F, 0F);

		turretModel[52].addShapeBox(-18F, -9F, 15F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		turretModel[52].setRotationPoint(-2F, -24.5F, 0F);

		turretModel[53].addShapeBox(-18F, -9F, 15F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		turretModel[53].setRotationPoint(-2F, -21.5F, 0F);

		turretModel[54].addShapeBox(-18F, -9F, -16F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		turretModel[54].setRotationPoint(-2F, -24.5F, 0F);

		turretModel[55].addShapeBox(-18F, -9F, -16F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		turretModel[55].setRotationPoint(-2F, -21.5F, 0F);

		turretModel[56].addShapeBox(-19.5F, -10.2F, -8F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		turretModel[56].setRotationPoint(-3F, -24F, 0F);

		turretModel[57].addShapeBox(-19.5F, -10.2F, 7F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		turretModel[57].setRotationPoint(-3F, -24F, 0F);

		turretModel[58].addShapeBox(-19.5F, -10.2F, -8F, 1, 1, 1, 0F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F); // Box 580
		turretModel[58].setRotationPoint(-3F, -24F, 0F);

		turretModel[59].addShapeBox(-16.5F, -10.2F, -8F, 1, 1, 1, 0F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F); // Box 581
		turretModel[59].setRotationPoint(-3F, -24F, 0F);

		turretModel[60].addShapeBox(-16.5F, -10.2F, 7F, 1, 1, 1, 0F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F); // Box 582
		turretModel[60].setRotationPoint(-3F, -24F, 0F);

		turretModel[61].addShapeBox(-19.5F, -10.2F, 7F, 1, 1, 1, 0F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F); // Box 583
		turretModel[61].setRotationPoint(-3F, -24F, 0F);

		turretModel[62].addBox(-11F, -1F, 16.55F, 8, 4, 3, 0F); // Box 585
		turretModel[62].setRotationPoint(0F, -24F, 0F);
		turretModel[62].rotateAngleX = 0.52359878F;
		turretModel[62].rotateAngleY = -0.17453293F;

		turretModel[63].addShapeBox(-11F, -1.3F, 16.55F, 8, 1, 3, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 586
		turretModel[63].setRotationPoint(0F, -24F, 0F);
		turretModel[63].rotateAngleX = 0.52359878F;
		turretModel[63].rotateAngleY = -0.17453293F;

		turretModel[64].addShapeBox(-7.5F, -1.1F, 18.65F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 587
		turretModel[64].setRotationPoint(0F, -24F, 0F);
		turretModel[64].rotateAngleX = 0.52359878F;
		turretModel[64].rotateAngleY = -0.17453293F;

		turretModel[65].addBox(-9F, 4.5F, 16.55F, 8, 4, 3, 0F); // Box 588
		turretModel[65].setRotationPoint(0F, -24F, 0F);
		turretModel[65].rotateAngleX = 0.52359878F;
		turretModel[65].rotateAngleY = -0.17453293F;
		turretModel[65].rotateAngleZ = 0.05235988F;

		turretModel[66].addShapeBox(-9F, 4.2F, 16.55F, 8, 1, 3, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 589
		turretModel[66].setRotationPoint(0F, -24F, 0F);
		turretModel[66].rotateAngleX = 0.52359878F;
		turretModel[66].rotateAngleY = -0.17453293F;
		turretModel[66].rotateAngleZ = 0.05235988F;

		turretModel[67].addShapeBox(-5.5F, 4.4F, 18.65F, 1, 1, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 590
		turretModel[67].setRotationPoint(0F, -24F, 0F);
		turretModel[67].rotateAngleX = 0.52359878F;
		turretModel[67].rotateAngleY = -0.17453293F;
		turretModel[67].rotateAngleZ = 0.05235988F;

		turretModel[68].addShapeBox(27.5F, -34F, 5.5F, 3, 1, 1, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 599
		turretModel[68].setRotationPoint(-21F, -28F, 0F);
		turretModel[68].rotateAngleZ = -0.73303829F;

		turretModel[69].addShapeBox(29.5F, -33F, 5.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 600
		turretModel[69].setRotationPoint(-21F, -28F, 0F);
		turretModel[69].rotateAngleZ = -0.73303829F;

		turretModel[70].addShapeBox(27.5F, -33F, 5.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 601
		turretModel[70].setRotationPoint(-21F, -28F, 0F);
		turretModel[70].rotateAngleZ = -0.73303829F;

		turretModel[71].addShapeBox(27.5F, -34F, -6.5F, 3, 1, 1, 0F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 602
		turretModel[71].setRotationPoint(-21F, -28F, 0F);
		turretModel[71].rotateAngleZ = -0.73303829F;

		turretModel[72].addShapeBox(29.5F, -33F, -6.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 603
		turretModel[72].setRotationPoint(-21F, -28F, 0F);
		turretModel[72].rotateAngleZ = -0.73303829F;

		turretModel[73].addShapeBox(27.5F, -33F, -6.5F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 604
		turretModel[73].setRotationPoint(-21F, -28F, 0F);
		turretModel[73].rotateAngleZ = -0.73303829F;

		turretModel[74].addShapeBox(11F, -10F, -10F, 5, 1, 20, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 623
		turretModel[74].setRotationPoint(-3F, -24F, 0F);

		turretModel[75].addShapeBox(11F, -13F, -10F, 1, 3, 20, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 625
		turretModel[75].setRotationPoint(-3F, -24F, 0F);

		turretModel[76].addShapeBox(-3F, -13F, 11F, 14, 3, 1, 0F, 0F, 0F, -1F, -1F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, 1F, 1F, 0F, -3F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F); // Box 627
		turretModel[76].setRotationPoint(-3F, -24F, 0F);

		turretModel[77].addShapeBox(-3F, -13F, -12F, 14, 3, 1, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, -1F, 1F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -3F); // Box 628
		turretModel[77].setRotationPoint(-3F, -24F, 0F);

		turretModel[78].addShapeBox(-17F, -13F, -5F, 5, 3, 1, 0F, -1F, 0F, -2F, 0F, 0F, 8F, 0F, 0F, -8F, -2F, 0F, 1F, 1F, 0F, -1F, -3F, 0F, 12F, -2F, 0F, -12F, 0F, 0F, 0F); // Box 629
		turretModel[78].setRotationPoint(-3F, -24F, 0F);

		turretModel[79].addShapeBox(-18F, -13F, -3F, 1, 3, 6, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 630
		turretModel[79].setRotationPoint(-3F, -24F, 0F);

		turretModel[80].addShapeBox(-17F, -13F, 4F, 5, 3, 1, 0F, -2F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, 8F, -1F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -12F, -3F, 0F, 12F, 1F, 0F, -1F); // Box 632
		turretModel[80].setRotationPoint(-3F, -24F, 0F);

		turretModel[81].addShapeBox(-3F, -13F, -10F, 12, 1, 20, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 633
		turretModel[81].setRotationPoint(-3F, -24F, 0F);

		turretModel[82].addShapeBox(-16F, -13F, -10F, 4, 1, 20, 0F, 0F, 0F, -7F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -7F, 0F, 0F, -7F, -1F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, -7F); // Box 634
		turretModel[82].setRotationPoint(-3F, -24F, 0F);

		turretModel[83].addShapeBox(-9.5F, 13F, -13F, 9, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 636
		turretModel[83].setRotationPoint(-3F, -24F, 0F);
		turretModel[83].rotateAngleZ = -2.87979327F;

		turretModel[84].addShapeBox(-8.5F, 12.5F, -8F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 637
		turretModel[84].setRotationPoint(-3F, -24F, 0F);
		turretModel[84].rotateAngleZ = -2.87979327F;

		turretModel[85].addShapeBox(-1.5F, 12.5F, -11F, 2, 2, 1, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F); // Box 639
		turretModel[85].setRotationPoint(-3F, -24F, 0F);
		turretModel[85].rotateAngleZ = -2.87979327F;

		turretModel[86].addShapeBox(-1.5F, 12.5F, -3F, 2, 2, 1, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F); // Box 641
		turretModel[86].setRotationPoint(-3F, -24F, 0F);
		turretModel[86].rotateAngleZ = -2.87979327F;

		turretModel[87].addShapeBox(2F, 12.5F, 10F, 2, 2, 1, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F); // Box 638
		turretModel[87].setRotationPoint(-3F, -24F, 0F);
		turretModel[87].rotateAngleZ = -3.14159265F;

		turretModel[88].addShapeBox(2F, 12.5F, 2F, 2, 2, 1, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F); // Box 639
		turretModel[88].setRotationPoint(-3F, -24F, 0F);
		turretModel[88].rotateAngleZ = -3.14159265F;

		turretModel[89].addShapeBox(-6F, 13F, 0F, 9, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 640
		turretModel[89].setRotationPoint(-3F, -24F, 0F);
		turretModel[89].rotateAngleZ = -3.14159265F;

		turretModel[90].addShapeBox(-5F, 12.5F, 5F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 641
		turretModel[90].setRotationPoint(-3F, -24F, 0F);
		turretModel[90].rotateAngleZ = -3.14159265F;

		turretModel[91].addShapeBox(2.5F, -16F, 7.5F, 1, 3, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 642
		turretModel[91].setRotationPoint(-3F, -24F, 0F);
		turretModel[91].rotateAngleZ = -0.10471976F;

		turretModel[92].addShapeBox(-21F, -2F, 9.5F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		turretModel[92].setRotationPoint(-11F, -43F, 0F);
		turretModel[92].rotateAngleY = 0.66322512F;
		turretModel[92].rotateAngleZ = 0.13962634F;

		turretModel[93].addShapeBox(-25F, -2F, 9.5F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 289
		turretModel[93].setRotationPoint(-11F, -43F, 0F);
		turretModel[93].rotateAngleY = 0.66322512F;
		turretModel[93].rotateAngleZ = 0.13962634F;

		turretModel[94].addShapeBox(-27F, -2.5F, 8.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		turretModel[94].setRotationPoint(-11F, -43F, 0F);
		turretModel[94].rotateAngleY = 0.66322512F;
		turretModel[94].rotateAngleZ = 0.13962634F;

		turretModel[95].addShapeBox(-27F, -2.5F, 11.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		turretModel[95].setRotationPoint(-11F, -43F, 0F);
		turretModel[95].rotateAngleY = 0.66322512F;
		turretModel[95].rotateAngleZ = 0.13962634F;

		turretModel[96].addShapeBox(-12F, -1.5F, 10F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 292
		turretModel[96].setRotationPoint(-11F, -43F, 0F);
		turretModel[96].rotateAngleY = 0.66322512F;
		turretModel[96].rotateAngleZ = 0.13962634F;

		turretModel[97].addShapeBox(-7F, -1.5F, 10F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 293
		turretModel[97].setRotationPoint(-11F, -43F, 0F);
		turretModel[97].rotateAngleY = 0.66322512F;
		turretModel[97].rotateAngleZ = 0.13962634F;

		turretModel[98].addShapeBox(-18F, -1.8F, 8F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		turretModel[98].setRotationPoint(-11F, -43F, 0F);
		turretModel[98].rotateAngleY = 0.66322512F;
		turretModel[98].rotateAngleZ = 0.13962634F;

		turretModel[99].addShapeBox(-26F, -2F, 9.5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		turretModel[99].setRotationPoint(-11F, -43F, 0F);
		turretModel[99].rotateAngleY = 0.66322512F;
		turretModel[99].rotateAngleZ = 0.13962634F;

		turretModel[100].addShapeBox(-26F, -2F, 11.5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		turretModel[100].setRotationPoint(-11F, -43F, 0F);
		turretModel[100].rotateAngleY = 0.66322512F;
		turretModel[100].rotateAngleZ = 0.13962634F;

		turretModel[101].addShapeBox(-18F, -1.5F, 11.5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		turretModel[101].setRotationPoint(-11F, -43F, 0F);
		turretModel[101].rotateAngleY = 0.66322512F;
		turretModel[101].rotateAngleZ = 0.13962634F;

		turretModel[102].addShapeBox(-9F, -0.799999999999997F, 9F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[102].setRotationPoint(-11F, -43F, 0F);
		turretModel[102].rotateAngleY = 0.66322512F;
		turretModel[102].rotateAngleZ = 0.13962634F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		barrelModel[1] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 3
		barrelModel[2] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 8
		barrelModel[3] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 10
		barrelModel[4] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 11
		barrelModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 12
		barrelModel[6] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 665
		barrelModel[7] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 725
		barrelModel[8] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 726
		barrelModel[9] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 727
		barrelModel[10] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Box 584
		barrelModel[11] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 603
		barrelModel[12] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 604
		barrelModel[13] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 605
		barrelModel[14] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 606
		barrelModel[15] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Box 607
		barrelModel[16] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 608
		barrelModel[17] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 609
		barrelModel[18] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 610
		barrelModel[19] = new ModelRendererTurbo(this, 111, 325, textureX, textureY); // Box 611
		barrelModel[20] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 612
		barrelModel[21] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 613
		barrelModel[22] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 614
		barrelModel[23] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Box 615
		barrelModel[24] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Box 616
		barrelModel[25] = new ModelRendererTurbo(this, 297, 289, textureX, textureY); // Box 617
		barrelModel[26] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 618
		barrelModel[27] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Box 619
		barrelModel[28] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Box 620
		barrelModel[29] = new ModelRendererTurbo(this, 345, 289, textureX, textureY); // Box 621
		barrelModel[30] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 690

		barrelModel[0].addShapeBox(2.5F, -1.5F, -9F, 3, 1, 18, 0F, 3.5F, 0.5F, 2F, -3F, 1.5F, 0F, -3F, 1.5F, 0F, 3.5F, 0.5F, 2F, 1.5F, 0.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 1.5F); // Box 0
		barrelModel[0].setRotationPoint(21F, -28F, 0F);

		barrelModel[1].addShapeBox(-1.5F, -6F, -9F, 4, 4, 18, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 2F); // Box 3
		barrelModel[1].setRotationPoint(21F, -28F, 0F);

		barrelModel[2].addShapeBox(-1.5F, 2F, -9F, 4, 2, 18, 0F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 8
		barrelModel[2].setRotationPoint(21F, -28F, 0F);

		barrelModel[3].addShapeBox(2.5F, -2F, -2F, 6, 4, 4, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F); // Box 10
		barrelModel[3].setRotationPoint(21F, -28F, 0F);

		barrelModel[4].addShapeBox(5.5F, -1.5F, -1.5F, 34, 3, 3, 0F, 0F, -0.4F, -0.4F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.4F, -0.4F); // Box 11
		barrelModel[4].setRotationPoint(21F, -28F, 0F);

		barrelModel[5].addShapeBox(-5.5F, -3F, -6F, 6, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[5].setRotationPoint(21F, -28F, 0F);

		barrelModel[6].addShapeBox(2.5F, 0.5F, -9F, 3, 1, 18, 0F, 1.5F, 0.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 1.5F, 3.5F, 0.5F, 2F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 3.5F, 0.5F, 2F); // Box 665
		barrelModel[6].setRotationPoint(21F, -28F, 0F);

		barrelModel[7].addShapeBox(-13.5F, -1.5F, -1.5F, 16, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		barrelModel[7].setRotationPoint(21F, -28F, 0F);

		barrelModel[8].addShapeBox(-13.5F, -4.5F, -1.5F, 10, 3, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 726
		barrelModel[8].setRotationPoint(21F, -28F, 0F);

		barrelModel[9].addShapeBox(-11.5F, -4.5F, -1.5F, 1, 3, 3, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 727
		barrelModel[9].setRotationPoint(21F, -28F, 0F);

		barrelModel[10].addShapeBox(13.5F, -1.5F, -1.5F, 7, 3, 3, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 584
		barrelModel[10].setRotationPoint(21F, -28F, 0F);

		barrelModel[11].addShapeBox(-14.5F, -4.5F, -3.5F, 3, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		barrelModel[11].setRotationPoint(21F, -28F, 0F);

		barrelModel[12].addShapeBox(-18.5F, -4F, -3F, 4, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		barrelModel[12].setRotationPoint(21F, -28F, 0F);

		barrelModel[13].addShapeBox(-16.5F, -4.5F, -3.5F, 1, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		barrelModel[13].setRotationPoint(21F, -28F, 0F);

		barrelModel[14].addShapeBox(-11.5F, -3.5F, 1.5F, 10, 3, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 606
		barrelModel[14].setRotationPoint(21F, -28F, 0F);

		barrelModel[15].addShapeBox(-11.5F, -3.5F, -4.5F, 10, 3, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 607
		barrelModel[15].setRotationPoint(21F, -28F, 0F);

		barrelModel[16].addShapeBox(-14.5F, -4.5F, 3.5F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		barrelModel[16].setRotationPoint(21F, -28F, 0F);

		barrelModel[17].addShapeBox(-14.5F, -1.5F, 3.5F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 609
		barrelModel[17].setRotationPoint(21F, -28F, 0F);

		barrelModel[18].addShapeBox(-14.5F, -4.5F, -6.5F, 3, 3, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		barrelModel[18].setRotationPoint(21F, -28F, 0F);

		barrelModel[19].addShapeBox(-14.5F, -1.5F, -6.5F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		barrelModel[19].setRotationPoint(21F, -28F, 0F);

		barrelModel[20].addShapeBox(-16.5F, -4.5F, 3.5F, 1, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		barrelModel[20].setRotationPoint(21F, -28F, 0F);

		barrelModel[21].addShapeBox(-16.5F, -4.5F, -6.5F, 1, 6, 3, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		barrelModel[21].setRotationPoint(21F, -28F, 0F);

		barrelModel[22].addShapeBox(-24F, -1.5F, 4F, 8, 3, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 614
		barrelModel[22].setRotationPoint(21F, -28F, 0.5F);

		barrelModel[23].addShapeBox(-24F, -1.5F, -6F, 8, 3, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 615
		barrelModel[23].setRotationPoint(21F, -28F, 0.5F);

		barrelModel[24].addShapeBox(-22.5F, -4F, -3F, 4, 5, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 616
		barrelModel[24].setRotationPoint(21F, -28F, 0F);

		barrelModel[25].addShapeBox(-22.5F, -4F, 2F, 4, 5, 1, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		barrelModel[25].setRotationPoint(21F, -28F, 0F);

		barrelModel[26].addShapeBox(-22.5F, 0F, -2F, 4, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 618
		barrelModel[26].setRotationPoint(21F, -28F, 0F);

		barrelModel[27].addShapeBox(-21F, -2F, -1F, 3, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 619
		barrelModel[27].setRotationPoint(21F, -28F, 0F);

		barrelModel[28].addShapeBox(-21F, -2F, 0F, 3, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 620
		barrelModel[28].setRotationPoint(21F, -28F, 0F);

		barrelModel[29].addShapeBox(-21F, -2F, -2F, 3, 2, 2, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 621
		barrelModel[29].setRotationPoint(21F, -28F, 0F);

		barrelModel[30].addShapeBox(8.5F, -1.5F, -1.5F, 1, 3, 3, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 690
		barrelModel[30].setRotationPoint(21F, -28F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Shape 122
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Shape 3
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 334, textureX, textureY); // Shape 128
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Shape 76
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 44, 333, textureX, textureY); // Shape 78
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Shape 79
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 473
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 474
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 475
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 476
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 477
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 478
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 9
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 493
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 47, 365, textureX, textureY); // Shape 8
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 47, 365, textureX, textureY); // Shape 536
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 538
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 540
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 47, 365, textureX, textureY); // Shape 567
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 569
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 571

		leftTrackWheelModels[0].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 122
		leftTrackWheelModels[0].setRotationPoint(42.7F, -3.7F, 22.5F);

		leftTrackWheelModels[1].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 3
		leftTrackWheelModels[1].setRotationPoint(42.7F, -3.7F, 17.5F);

		leftTrackWheelModels[2].addShape3D(5.5F, -3.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 5, 9, 5), new Coord2D(7, 7, 7, 7), new Coord2D(4, 7, 4, 7), new Coord2D(2, 5, 2, 5), new Coord2D(2, 2, 2, 2)}), 3, 9, 7, 24, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 128
		leftTrackWheelModels[2].setRotationPoint(42.7F, -3.7F, 20F);

		leftTrackWheelModels[3].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 2, 12, 12, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 76
		leftTrackWheelModels[3].setRotationPoint(-40F, -3.5F, 22.5F);

		leftTrackWheelModels[4].addShape3D(5.5F, -3.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 5, 9, 5), new Coord2D(7, 7, 7, 7), new Coord2D(4, 7, 4, 7), new Coord2D(2, 5, 2, 5), new Coord2D(2, 2, 2, 2)}), 9, 9, 9, 24, 9, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 78
		leftTrackWheelModels[4].setRotationPoint(-40F, -3.5F, 23F);

		leftTrackWheelModels[5].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 2, 12, 12, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 79
		leftTrackWheelModels[5].setRotationPoint(-40F, -3.5F, 17.5F);

		leftTrackWheelModels[6].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 473
		leftTrackWheelModels[6].setRotationPoint(33F, 2.5F, 21F);

		leftTrackWheelModels[7].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 474
		leftTrackWheelModels[7].setRotationPoint(20F, 2.5F, 21F);

		leftTrackWheelModels[8].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 475
		leftTrackWheelModels[8].setRotationPoint(-17F, 2.5F, 21F);

		leftTrackWheelModels[9].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 476
		leftTrackWheelModels[9].setRotationPoint(-30F, 2.5F, 21F);

		leftTrackWheelModels[10].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 477
		leftTrackWheelModels[10].setRotationPoint(-5F, 2.5F, 21F);

		leftTrackWheelModels[11].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 478
		leftTrackWheelModels[11].setRotationPoint(8F, 2.5F, 21F);

		leftTrackWheelModels[12].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 9
		leftTrackWheelModels[12].setRotationPoint(33F, 2.5F, 21F);

		leftTrackWheelModels[13].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 493
		leftTrackWheelModels[13].setRotationPoint(20F, 2.5F, 21F);

		leftTrackWheelModels[14].addShape3D(5F, -3F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 8
		leftTrackWheelModels[14].setRotationPoint(21.5F, -6.2F, 19F);

		leftTrackWheelModels[15].addShape3D(5F, -3F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 536
		leftTrackWheelModels[15].setRotationPoint(-3.5F, -6.2F, 19F);

		leftTrackWheelModels[16].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 538
		leftTrackWheelModels[16].setRotationPoint(8F, 2.5F, 21F);

		leftTrackWheelModels[17].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 540
		leftTrackWheelModels[17].setRotationPoint(-5F, 2.5F, 21F);

		leftTrackWheelModels[18].addShape3D(5F, -3F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 567
		leftTrackWheelModels[18].setRotationPoint(-28.5F, -6.2F, 19F);

		leftTrackWheelModels[19].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 569
		leftTrackWheelModels[19].setRotationPoint(-17F, 2.5F, 21F);

		leftTrackWheelModels[20].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 571
		leftTrackWheelModels[20].setRotationPoint(-30F, 2.5F, 21F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Shape 82
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Shape 83
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Shape 84
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Shape 99
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 44, 333, textureX, textureY); // Shape 100
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Shape 101
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 586
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 587
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 589
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 590
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 593
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 594
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 596
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 597
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 599
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 600
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Shape 602
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 31, 382, textureX, textureY); // Shape 603
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 47, 365, textureX, textureY); // Shape 604
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 47, 365, textureX, textureY); // Shape 605
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 47, 365, textureX, textureY); // Shape 606

		rightTrackWheelModels[0].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 82
		rightTrackWheelModels[0].setRotationPoint(42.7F, -3.7F, -13.5F);

		rightTrackWheelModels[1].addShape3D(6.5F, -5.5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 8, 12, 8), new Coord2D(9, 11, 9, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8), new Coord2D(1, 3, 1, 3)}), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 5, 5, 5, 5, 5, 5, 5}); // Shape 83
		rightTrackWheelModels[1].setRotationPoint(42.7F, -3.7F, -18.5F);

		rightTrackWheelModels[2].addShape3D(5.5F, -3.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 5, 9, 5), new Coord2D(7, 7, 7, 7), new Coord2D(4, 7, 4, 7), new Coord2D(2, 5, 2, 5), new Coord2D(2, 2, 2, 2)}), 3, 9, 7, 24, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 84
		rightTrackWheelModels[2].setRotationPoint(42.7F, -3.7F, -16F);

		rightTrackWheelModels[3].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 2, 12, 12, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 99
		rightTrackWheelModels[3].setRotationPoint(-40F, -3.5F, -13.5F);

		rightTrackWheelModels[4].addShape3D(5.5F, -3.5F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 5, 9, 5), new Coord2D(7, 7, 7, 7), new Coord2D(4, 7, 4, 7), new Coord2D(2, 5, 2, 5), new Coord2D(2, 2, 2, 2)}), 9, 9, 9, 24, 9, ModelRendererTurbo.MR_FRONT, new float[]{3, 3, 3, 3, 3, 3, 3, 3}); // Shape 100
		rightTrackWheelModels[4].setRotationPoint(-40F, -3.5F, -13F);

		rightTrackWheelModels[5].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 2, 12, 12, 36, 2, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 101
		rightTrackWheelModels[5].setRotationPoint(-40F, -3.5F, -18.5F);

		rightTrackWheelModels[6].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 586
		rightTrackWheelModels[6].setRotationPoint(33F, 2.5F, -15F);

		rightTrackWheelModels[7].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 587
		rightTrackWheelModels[7].setRotationPoint(33F, 2.5F, -15F);

		rightTrackWheelModels[8].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 589
		rightTrackWheelModels[8].setRotationPoint(20F, 2.5F, -15F);

		rightTrackWheelModels[9].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 590
		rightTrackWheelModels[9].setRotationPoint(20F, 2.5F, -15F);

		rightTrackWheelModels[10].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 593
		rightTrackWheelModels[10].setRotationPoint(8F, 2.5F, -15F);

		rightTrackWheelModels[11].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 594
		rightTrackWheelModels[11].setRotationPoint(8F, 2.5F, -15F);

		rightTrackWheelModels[12].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 596
		rightTrackWheelModels[12].setRotationPoint(-5F, 2.5F, -15F);

		rightTrackWheelModels[13].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 597
		rightTrackWheelModels[13].setRotationPoint(-5F, 2.5F, -15F);

		rightTrackWheelModels[14].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 599
		rightTrackWheelModels[14].setRotationPoint(-17F, 2.5F, -15F);

		rightTrackWheelModels[15].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 600
		rightTrackWheelModels[15].setRotationPoint(-17F, 2.5F, -15F);

		rightTrackWheelModels[16].addShape3D(6F, -4F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 6, 10, 6), new Coord2D(8, 8, 8, 8), new Coord2D(4, 8, 4, 8), new Coord2D(2, 6, 2, 6), new Coord2D(2, 2, 2, 2)}), 5, 10, 10, 28, 5, ModelRendererTurbo.MR_FRONT, new float[]{3, 4, 3, 4, 3, 4, 3, 4}); // Shape 602
		rightTrackWheelModels[16].setRotationPoint(-30F, 2.5F, -15F);

		rightTrackWheelModels[17].addShape3D(6F, -5F, 1F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 7, 11, 7), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(1, 7, 1, 7), new Coord2D(1, 3, 1, 3)}), 4, 12, 12, 36, 4, ModelRendererTurbo.MR_FRONT, new float[]{5, 4, 5, 4, 5, 4, 5, 4}); // Shape 603
		rightTrackWheelModels[17].setRotationPoint(-30F, 2.5F, -15F);

		rightTrackWheelModels[18].addShape3D(5F, -3F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 604
		rightTrackWheelModels[18].setRotationPoint(-28.5F, -6.2F, -15F);

		rightTrackWheelModels[19].addShape3D(5F, -3F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 605
		rightTrackWheelModels[19].setRotationPoint(-3.5F, -6.2F, -15F);

		rightTrackWheelModels[20].addShape3D(5F, -3F, 0.5F, new Shape2D(new Coord2D[]{new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2)}), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[]{3, 2, 3, 2, 3, 2, 3, 2}); // Shape 606
		rightTrackWheelModels[20].setRotationPoint(21.5F, -6.2F, -15F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 0
		leftTrackModel[1] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 1
		leftTrackModel[2] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 2
		leftTrackModel[3] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 3
		leftTrackModel[4] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 4
		leftTrackModel[5] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 5
		leftTrackModel[6] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 6
		leftTrackModel[7] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 7
		leftTrackModel[8] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 8
		leftTrackModel[9] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 9
		leftTrackModel[10] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 10

		leftTrackModel[0].addBox(0F, 0F, 0F, 71, 1, 8, 0F); // Box 0
		leftTrackModel[0].setRotationPoint(-34F, 7.5F, 14F);

		leftTrackModel[1].addShapeBox(0F, -1F, 0F, 9, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0F, 0F, 0F); // Box 1
		leftTrackModel[1].setRotationPoint(37F, 8.5F, 14F);
		leftTrackModel[1].rotateAngleZ = 0.41887902F;

		leftTrackModel[2].addBox(0F, -1F, 0F, 7, 1, 8, 0F); // Box 2
		leftTrackModel[2].setRotationPoint(45.5F, 4.55F, 14F);
		leftTrackModel[2].rotateAngleZ = 1.04719755F;

		leftTrackModel[3].addBox(0F, -1F, 0F, 5, 1, 8, 0F); // Box 3
		leftTrackModel[3].setRotationPoint(49F, -1.5F, 14F);
		leftTrackModel[3].rotateAngleZ = 1.57079633F;

		leftTrackModel[4].addBox(0F, -1F, 0F, 5, 1, 8, 0F); // Box 4
		leftTrackModel[4].setRotationPoint(49F, -6.5F, 14F);
		leftTrackModel[4].rotateAngleZ = 2.30383461F;

		leftTrackModel[5].addShapeBox(0F, -1F, 0F, 82, 1, 8, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 5
		leftTrackModel[5].setRotationPoint(45.9F, -10.2F, 14F);
		leftTrackModel[5].rotateAngleZ = 3.14159265F;

		leftTrackModel[6].addBox(0F, -1F, 0F, 7, 1, 8, 0F); // Box 6
		leftTrackModel[6].setRotationPoint(-36.1F, -10.2F, 14F);
		leftTrackModel[6].rotateAngleZ = 3.33357887F;

		leftTrackModel[7].addBox(0F, -1F, 0F, 4, 1, 8, 0F); // Box 7
		leftTrackModel[7].setRotationPoint(-43F, -8.9F, 14F);
		leftTrackModel[7].rotateAngleZ = 4.01425728F;

		leftTrackModel[8].addBox(0F, -1F, 0F, 5, 1, 8, 0F); // Box 8
		leftTrackModel[8].setRotationPoint(-45.6F, -5.8F, 14F);
		leftTrackModel[8].rotateAngleZ = 4.71238898F;

		leftTrackModel[9].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 9
		leftTrackModel[9].setRotationPoint(-45.6F, -0.8F, 14F);
		leftTrackModel[9].rotateAngleZ = 5.3756141F;

		leftTrackModel[10].addShapeBox(0F, -1F, 0F, 9, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F); // Box 10
		leftTrackModel[10].setRotationPoint(-41.9F, 3.9F, 14F);
		leftTrackModel[10].rotateAngleZ = 5.75958653F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 102
		rightTrackModel[1] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 103
		rightTrackModel[2] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 104
		rightTrackModel[3] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 105
		rightTrackModel[4] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 106
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 107
		rightTrackModel[6] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 108
		rightTrackModel[7] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 109
		rightTrackModel[8] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 110
		rightTrackModel[9] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 111
		rightTrackModel[10] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 112

		rightTrackModel[0].addBox(0F, 0F, 0F, 71, 1, 8, 0F); // Box 102
		rightTrackModel[0].setRotationPoint(-34F, 7.5F, -22F);

		rightTrackModel[1].addShapeBox(0F, -1F, 0F, 9, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0F, 0F, 0F); // Box 103
		rightTrackModel[1].setRotationPoint(37F, 8.5F, -22F);
		rightTrackModel[1].rotateAngleZ = 0.41887902F;

		rightTrackModel[2].addBox(0F, -1F, 0F, 7, 1, 8, 0F); // Box 104
		rightTrackModel[2].setRotationPoint(45.5F, 4.55F, -22F);
		rightTrackModel[2].rotateAngleZ = 1.04719755F;

		rightTrackModel[3].addBox(0F, -1F, 0F, 5, 1, 8, 0F); // Box 105
		rightTrackModel[3].setRotationPoint(49F, -1.5F, -22F);
		rightTrackModel[3].rotateAngleZ = 1.57079633F;

		rightTrackModel[4].addBox(0F, -1F, 0F, 5, 1, 8, 0F); // Box 106
		rightTrackModel[4].setRotationPoint(49F, -6.5F, -22F);
		rightTrackModel[4].rotateAngleZ = 2.30383461F;

		rightTrackModel[5].addShapeBox(0F, -1F, 0F, 82, 1, 8, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 107
		rightTrackModel[5].setRotationPoint(45.9F, -10.2F, -22F);
		rightTrackModel[5].rotateAngleZ = 3.14159265F;

		rightTrackModel[6].addBox(0F, -1F, 0F, 7, 1, 8, 0F); // Box 108
		rightTrackModel[6].setRotationPoint(-36.1F, -10.2F, -22F);
		rightTrackModel[6].rotateAngleZ = 3.33357887F;

		rightTrackModel[7].addBox(0F, -1F, 0F, 4, 1, 8, 0F); // Box 109
		rightTrackModel[7].setRotationPoint(-43F, -8.9F, -22F);
		rightTrackModel[7].rotateAngleZ = 4.01425728F;

		rightTrackModel[8].addBox(0F, -1F, 0F, 5, 1, 8, 0F); // Box 110
		rightTrackModel[8].setRotationPoint(-45.6F, -5.8F, -22F);
		rightTrackModel[8].rotateAngleZ = 4.71238898F;

		rightTrackModel[9].addBox(0F, -1F, 0F, 6, 1, 8, 0F); // Box 111
		rightTrackModel[9].setRotationPoint(-45.6F, -0.8F, -22F);
		rightTrackModel[9].rotateAngleZ = 5.3756141F;

		rightTrackModel[10].addShapeBox(0F, -1F, 0F, 9, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F); // Box 112
		rightTrackModel[10].setRotationPoint(-41.9F, 3.9F, -22F);
		rightTrackModel[10].rotateAngleZ = 5.75958653F;
	}

	private void initGuns()
	{
	}

	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[34];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 271, 328, textureX, textureY); // Box 88
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 249, 328, textureX, textureY); // Box 3
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 271, 333, textureX, textureY); // Box 4
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 295, 328, textureX, textureY); // Box 5
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 311, 328, textureX, textureY); // Box 6
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 335, 328, textureX, textureY); // Box 7
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 287, 328, textureX, textureY); // Box 8
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 343, 328, textureX, textureY); // Box 10
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 351, 328, textureX, textureY); // Box 11
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 231, 387, textureX, textureY); // Box 13
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 239, 387, textureX, textureY); // Box 14
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 253, 361, textureX, textureY); // Box 15
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 260, 336, textureX, textureY); // Box 16
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 271, 336, textureX, textureY); // Box 17
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 271, 336, textureX, textureY); // Box 18
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 295, 336, textureX, textureY); // Box 19
		gun_1_Model[1][16] = new ModelRendererTurbo(this, 303, 336, textureX, textureY); // Box 20
		gun_1_Model[1][17] = new ModelRendererTurbo(this, 343, 336, textureX, textureY); // Box 21
		gun_1_Model[1][18] = new ModelRendererTurbo(this, 231, 344, textureX, textureY); // Box 22
		gun_1_Model[1][19] = new ModelRendererTurbo(this, 239, 344, textureX, textureY); // Box 23
		gun_1_Model[1][20] = new ModelRendererTurbo(this, 295, 344, textureX, textureY); // Box 24
		gun_1_Model[1][21] = new ModelRendererTurbo(this, 327, 344, textureX, textureY); // Box 25
		gun_1_Model[1][22] = new ModelRendererTurbo(this, 263, 352, textureX, textureY); // Box 27
		gun_1_Model[1][23] = new ModelRendererTurbo(this, 231, 360, textureX, textureY); // Box 28
		gun_1_Model[1][24] = new ModelRendererTurbo(this, 287, 360, textureX, textureY); // Box 29
		gun_1_Model[1][25] = new ModelRendererTurbo(this, 311, 360, textureX, textureY); // Box 30
		gun_1_Model[1][26] = new ModelRendererTurbo(this, 351, 336, textureX, textureY); // Box 56
		gun_1_Model[1][27] = new ModelRendererTurbo(this, 263, 344, textureX, textureY); // Box 57
		gun_1_Model[1][28] = new ModelRendererTurbo(this, 319, 344, textureX, textureY); // Box 58
		gun_1_Model[1][29] = new ModelRendererTurbo(this, 327, 344, textureX, textureY); // Box 59
		gun_1_Model[1][30] = new ModelRendererTurbo(this, 231, 440, textureX, textureY); // Box 60
		gun_1_Model[1][31] = new ModelRendererTurbo(this, 351, 344, textureX, textureY); // Box 61
		gun_1_Model[1][32] = new ModelRendererTurbo(this, 231, 352, textureX, textureY); // Box 62
		gun_1_Model[1][33] = new ModelRendererTurbo(this, 231, 344, textureX, textureY); // Box 65

		gun_1_Model[1][0].addShapeBox(1.5F, -2.4F, -0.5F, 8, 1, 1, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.252F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 88

		gun_1_Model[1][1].addShapeBox(-5F, -3.3F, -1.5F, 7, 4, 3, 0F, -0.5F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, -0.5F, -0.8F, -0.75F); // Box 3

		gun_1_Model[1][2].addShapeBox(1.5F, -1.7F, -0.5F, 8, 1, 1, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F); // Box 4

		gun_1_Model[1][3].addShapeBox(1.5F, -2.05F, -0.5F, 8, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 5

		gun_1_Model[1][4].addShapeBox(-4F, -3.5F, -3.5F, 6, 2, 7, 0F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F); // Box 6

		gun_1_Model[1][5].addShapeBox(9.5F, -2.05F, -0.5F, 1, 1, 1, 0F, 0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 7

		gun_1_Model[1][6].addShapeBox(-4.5F, -3.5F, -1.5F, 2, 2, 3, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F); // Box 8

		gun_1_Model[1][7].addShapeBox(0.4F, -2.75F, -0.5F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 10

		gun_1_Model[1][8].addShapeBox(0.4F, -3.25F, -0.5F, 1, 1, 1, 0F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F); // Box 11

		gun_1_Model[1][9].addShapeBox(0.4F, -2.2F, -1.2F, 1, 1, 1, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 13

		gun_1_Model[1][10].addShapeBox(0.4F, -2.2F, -1.7F, 1, 1, 1, 0F, -0.37F, -0.37F, -0.4F, -0.37F, -0.37F, -0.4F, -0.32F, -0.32F, -0.4F, -0.32F, -0.32F, -0.4F, -0.37F, -0.37F, -0.4F, -0.37F, -0.37F, -0.4F, -0.32F, -0.32F, -0.4F, -0.32F, -0.32F, -0.4F); // Box 14

		gun_1_Model[1][11].addShapeBox(1.5F, -3.1F, -0.5F, 1, 2, 1, 0F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F); // Box 15

		gun_1_Model[1][12].addShapeBox(-6.8F, -1.8F, -0.5F, 3, 1, 1, 0F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F); // Box 16

		gun_1_Model[1][13].addShapeBox(-7.2F, -1.2F, -0.5F, 2, 3, 1, 0F, -1F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -0.2F, -0.85F, -0.2F, -1F, -0.65F, -0.2F, -1F, -0.65F, -0.2F, -0.2F, -0.85F, -0.2F); // Box 17

		gun_1_Model[1][14].addShapeBox(-0.85F, -3.4F, -0.25F, 6, 5, 8, 0F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 18

		gun_1_Model[1][15].addShapeBox(-4F, -3.6F, -0.5F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F); // Box 19

		gun_1_Model[1][16].addShapeBox(-4F, -3.9F, -0.67F, 1, 2, 1, 0F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F); // Box 20

		gun_1_Model[1][17].addShapeBox(-4F, -3.9F, -0.33F, 1, 2, 1, 0F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F); // Box 21

		gun_1_Model[1][18].addShapeBox(-1.6F, -2.2F, -1.2F, 3, 1, 1, 0F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Box 22

		gun_1_Model[1][19].addShapeBox(-2.15F, -3.4F, -1.85F, 6, 5, 8, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 23

		gun_1_Model[1][20].addShapeBox(-3.75F, -3.4F, -1.85F, 6, 5, 8, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 24

		gun_1_Model[1][21].addShapeBox(-0.85F, -3.4F, -3.25F, 6, 5, 8, 0F, 0F, -2F, -3.9F, -4.2F, -2F, -3.9F, -4.2F, -2F, -3.9F, 0F, -2F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 25

		gun_1_Model[1][22].addShapeBox(-0.85F, -3.4F, -1.75F, 6, 5, 8, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 27

		gun_1_Model[1][23].addShapeBox(-2.15F, -2.5F, -2.5F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 28

		gun_1_Model[1][24].addShapeBox(-3.75F, -2.5F, -2.5F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 29

		gun_1_Model[1][25].addShapeBox(-0.85F, -4.8F, -1.7F, 6, 5, 8, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 30

		gun_1_Model[1][26].addShapeBox(-0.5F, -3F, 0F, 1, 2, 2, 0F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F); // Box 56

		gun_1_Model[1][27].addShapeBox(-5.8F, -0.2F, -0.5F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F); // Box 57

		gun_1_Model[1][28].addShapeBox(-7.2F, -1.8F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F); // Box 58

		gun_1_Model[1][29].addShapeBox(-3.7F, -3.7F, -1F, 1, 2, 2, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F); // Box 59

		gun_1_Model[1][30].addShapeBox(-1.5F, -3.5F, -3.5F, 2, 2, 7, 0F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F); // Box 60

		gun_1_Model[1][31].addShapeBox(1.5F, -3.8F, -0.5F, 1, 1, 1, 0F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F); // Box 61

		gun_1_Model[1][32].addShapeBox(-4F, -4.45F, -0.5F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.41F, -0.45F, -0.35F, -0.41F, -0.45F, -0.35F, -0.41F, -0.45F, -0.35F, -0.41F, -0.45F, -0.47F, -0.41F, -0.45F, -0.47F, -0.41F, -0.45F, -0.47F, -0.41F, -0.45F, -0.47F, -0.41F); // Box 62

		gun_1_Model[1][33].addShapeBox(-1.6F, -2.7F, 0.2F, 3, 1, 1, 0F, -1F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -1F, -0.3F, -0.4F); // Box 65

		//Gun Origin
		for(ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(1F, -39F, 8F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}
