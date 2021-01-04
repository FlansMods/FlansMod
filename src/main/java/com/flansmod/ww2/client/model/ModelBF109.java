//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.ww2.client.model; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelBF109 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBF109() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[42];
		bodyModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box3
		bodyModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box5
		bodyModel[2] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box6
		bodyModel[3] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Box11
		bodyModel[4] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import Box12
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box13
		bodyModel[6] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import Box17
		bodyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box19
		bodyModel[8] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box47
		bodyModel[9] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box64
		bodyModel[10] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import Box69
		bodyModel[11] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box70
		bodyModel[12] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box71
		bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box72
		bodyModel[14] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import Box88
		bodyModel[15] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box90
		bodyModel[16] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Import Box82
		bodyModel[17] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box91
		bodyModel[18] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import Box94
		bodyModel[19] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Import Box95
		bodyModel[20] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Import Box96
		bodyModel[21] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Import Box103
		bodyModel[22] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import Box84
		bodyModel[23] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import Box86
		bodyModel[24] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Import Box102
		bodyModel[25] = new ModelRendererTurbo(this, 25, 285, textureX, textureY); // Import Box103
		bodyModel[26] = new ModelRendererTurbo(this, 5, 320, textureX, textureY); // Import Box26
		bodyModel[27] = new ModelRendererTurbo(this, 10, 300, textureX, textureY); // Import Box26
		bodyModel[28] = new ModelRendererTurbo(this, 20, 300, textureX, textureY); // Import Box26
		bodyModel[29] = new ModelRendererTurbo(this, 36, 300, textureX, textureY); // Import Box26
		bodyModel[30] = new ModelRendererTurbo(this, 20, 300, textureX, textureY); // Import Box26
		bodyModel[31] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box26
		bodyModel[32] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box26
		bodyModel[33] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box26
		bodyModel[34] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box26
		bodyModel[35] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box26
		bodyModel[36] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box15
		bodyModel[37] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box16
		bodyModel[38] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box17
		bodyModel[39] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box18
		bodyModel[40] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box0
		bodyModel[41] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Import Box1

		bodyModel[0].addShapeBox(0F, 0F, 0F, 43, 3, 20, 0F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box3
		bodyModel[0].setRotationPoint(-70F, -40F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 55, 9, 20, 0F, 0F, 0F, -6F, 0F, -6F, -7F, 0F, -6F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box5
		bodyModel[1].setRotationPoint(14F, -46F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 55, 20, 20, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F); // Import Box6
		bodyModel[2].setRotationPoint(14F, -37F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 43, 20, 3, 0F); // Import Box11
		bodyModel[3].setRotationPoint(-29F, -37F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 43, 20, 3, 0F); // Import Box12
		bodyModel[4].setRotationPoint(-29F, -37F, 7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F, 0F, 0F, -4F, 0F, -2F, -1.7F, 0F, -2F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box13
		bodyModel[5].setRotationPoint(-27F, -40F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 41, 14, 20, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box17
		bodyModel[6].setRotationPoint(-70F, -37F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 27, 7, 20, 0F, 0F, 0F, -1F, 0F, 0F, -0.34146341F, 0F, 0F, -0.34146341F, 0F, 0F, -1F, 0F, -3F, -4F, 0F, 0F, -3.34146341F, 0F, 0F, -3.34146341F, 0F, -3F, -4F); // Import Box19
		bodyModel[7].setRotationPoint(-70F, -23F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 57, 9, 20, 0F, 0F, 0F, -0.34146341F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34146341F, 0F, -2F, -3.34146341F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -2F, -3.34146341F); // Import Box47
		bodyModel[8].setRotationPoint(-43F, -23F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Box64
		bodyModel[9].setRotationPoint(-21F, -46F, -4F);
		bodyModel[9].rotateAngleX = 0.01745329F;
		bodyModel[9].rotateAngleZ = -0.03490659F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 19, 5, 3, 0F, 0F, -4F, 0.6F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -4F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[10].setRotationPoint(-19F, -42F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import Box70
		bodyModel[11].setRotationPoint(-21F, -46F, -8F);
		bodyModel[11].rotateAngleX = 0.01745329F;
		bodyModel[11].rotateAngleZ = -0.03490659F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import Box71
		bodyModel[12].setRotationPoint(-21F, -46F, 7F);
		bodyModel[12].rotateAngleX = 0.01745329F;
		bodyModel[12].rotateAngleZ = -0.03490659F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Import Box72
		bodyModel[13].setRotationPoint(-26F, -46F, 3F);
		bodyModel[13].rotateAngleX = 0.01745329F;
		bodyModel[13].rotateAngleZ = -0.03490659F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F, 0F, 0F, 2F, 0F, -2F, -1.5F, 0F, -2F, -1.7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		bodyModel[14].setRotationPoint(-27F, -40F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Import Box90
		bodyModel[15].setRotationPoint(-26F, -46F, -4F);
		bodyModel[15].rotateAngleX = 0.01745329F;
		bodyModel[15].rotateAngleZ = -0.03490659F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 19, 5, 3, 0F, 0F, -4F, -1.6F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -4F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		bodyModel[16].setRotationPoint(-19F, -42F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 7, 8, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 4.7F, 0F, 0F, 4.7F, 0F, 0F, 5F); // Import Box91
		bodyModel[17].setRotationPoint(0F, -46F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 5, 3, 0F, 0F, -3F, -1F, 0F, -3F, -1.3F, 0F, -3F, 0F, 0F, -3F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		bodyModel[18].setRotationPoint(0F, -42F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 5, 3, 0F, 0F, -3F, 0.6F, 0F, -3F, 0F, 0F, -3F, -1.3F, 0F, -3F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		bodyModel[19].setRotationPoint(0F, -42F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 14, 16, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		bodyModel[20].setRotationPoint(0F, -39F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 16, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		bodyModel[21].setRotationPoint(-4F, -39F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 26, 7, 1, 0F); // Import Box84
		bodyModel[22].setRotationPoint(21F, -36F, -9.6F);
		bodyModel[22].rotateAngleY = 0.05235988F;

		bodyModel[23].addBox(0F, 0F, 0F, 26, 7, 1, 0F); // Import Box86
		bodyModel[23].setRotationPoint(21F, -36F, 8.7F);
		bodyModel[23].rotateAngleY = -0.05235988F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		bodyModel[24].setRotationPoint(-58F, -36F, -15F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		bodyModel[25].setRotationPoint(-53F, -36F, -15F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Import Box26
		bodyModel[26].setRotationPoint(-22F, -24F, -1.5F);

		bodyModel[27].addBox(-1F, 0F, -1F, 2, 4, 2, 0F); // Import Box26
		bodyModel[27].setRotationPoint(-26.5F, -40.3F, 0.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.8F, -0.8F, 0F, -6.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.8F, -0.8F, 0F, -6.8F); // Import Box26
		bodyModel[28].setRotationPoint(-27F, -42.3F, -0.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, -0.8F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -0.8F, -7F, 0F, -0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, -0.8F, 0F); // Import Box26
		bodyModel[29].setRotationPoint(-27F, -49.5F, -0.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F, -0.8F, 0F, -6.8F, 0F, 0F, -6.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -6.8F, 0F, 0F, -6.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Import Box26
		bodyModel[30].setRotationPoint(-27F, -42.3F, -5.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F); // Import Box26
		bodyModel[31].setRotationPoint(-27F, -41.8F, 0.2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F); // Import Box26
		bodyModel[32].setRotationPoint(-27F, -41.8F, 0.3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Import Box26
		bodyModel[33].setRotationPoint(-27F, -41.3F, 0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Import Box26
		bodyModel[34].setRotationPoint(-27F, -42F, 0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, -0.8F, -0.9F, -0.9F); // Import Box26
		bodyModel[35].setRotationPoint(-27F, -41.6F, 0.7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Import Box15
		bodyModel[36].setRotationPoint(-27F, -42.2F, 0.35F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Import Box16
		bodyModel[37].setRotationPoint(-27F, -41.1F, 0.35F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Import Box17
		bodyModel[38].setRotationPoint(-27F, -41.7F, -0.2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F); // Import Box18
		bodyModel[39].setRotationPoint(-27F, -41.7F, 0.9F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 9, 14, 0F); // Import Box0
		bodyModel[40].setRotationPoint(-29F, -36F, -7F);
		bodyModel[40].rotateAngleZ = 0.13962634F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 16, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[41].setRotationPoint(-2F, -24F, -7F);
		bodyModel[41].rotateAngleZ = -1.57079633F;


		noseModel = new ModelRendererTurbo[5];
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		noseModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box4
		noseModel[2] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box18
		noseModel[3] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Import Box9
		noseModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box1

		noseModel[0].addTrapezoid(0F, 0F, 0F, 9, 14, 14, 0F, -5.50F, ModelRendererTurbo.MR_RIGHT); // Import Box0
		noseModel[0].setRotationPoint(-94F, -37F, -7F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 16, 4, 18, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -3F); // Import Box4
		noseModel[1].setRotationPoint(-86F, -23F, -9F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 15, 1, 18, 0F, -2F, 0F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, -2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box18
		noseModel[2].setRotationPoint(-85F, -38F, -9F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 15, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F); // Import Box9
		noseModel[3].setRotationPoint(-81F, -22F, -6F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 15, 14, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box1
		noseModel[4].setRotationPoint(-85F, -37F, -9F);


		tailModel = new ModelRendererTurbo[8];
		tailModel[0] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import Box0
		tailModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box0
		tailModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box2
		tailModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box3
		tailModel[4] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import Box4
		tailModel[5] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box13
		tailModel[6] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import Box17
		tailModel[7] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box83

		tailModel[0].addShapeBox(0F, 0F, 0F, 40, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -1F); // Import Box0
		tailModel[0].setRotationPoint(69F, -37F, -7F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 40, 14, 2, 0F, -26F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, -0.5F, -18F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, -0.5F); // Import Box0
		tailModel[1].setRotationPoint(69F, -51F, -1F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box2
		tailModel[2].setRotationPoint(95F, -62F, -1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -3F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box3
		tailModel[3].setRotationPoint(100F, -65F, -1F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 16, 2, 37, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F); // Import Box4
		tailModel[4].setRotationPoint(91F, -39F, 1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box13
		tailModel[5].setRotationPoint(76F, -37F, -2F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 16, 2, 37, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box17
		tailModel[6].setRotationPoint(91F, -39F, -38F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 17, 5, 20, 0F, 0F, -2F, -7F, -2F, -4F, -7F, -2F, -4F, -7F, 0F, -2F, -7F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F); // Import Box83
		tailModel[7].setRotationPoint(69F, -42F, -10F);


		rightWingModel = new ModelRendererTurbo[4];
		rightWingModel[0] = new ModelRendererTurbo(this, 199, 348, textureX, textureY); // Import Import
		rightWingModel[1] = new ModelRendererTurbo(this, 316, 410, textureX, textureY); // Import Shape4
		rightWingModel[2] = new ModelRendererTurbo(this, 315, 373, textureX, textureY); // Import Shape5
		rightWingModel[3] = new ModelRendererTurbo(this, 75, 363, textureX, textureY); // Import Shape8

		rightWingModel[0].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(50, 0, 50, 0), new Coord2D(28, 95, 28, 95), new Coord2D(21, 99, 21, 99), new Coord2D(10, 99, 10, 99), new Coord2D(7, 95, 7, 95)}), 3, 50, 99, 268, 3, ModelRendererTurbo.MR_FRONT, new float[]{96, 5, 11, 9, 98, 49}); // Import Import
		rightWingModel[0].setRotationPoint(-47.5F, -22F, -31.5F);
		rightWingModel[0].rotateAngleX = -1.48352986F;
		rightWingModel[0].rotateAngleY = 3.15904595F;
		rightWingModel[0].rotateAngleZ = 0.05235988F;

		rightWingModel[1].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(0, 0, 0, 0), new Coord2D(54, 0, 54, 0), new Coord2D(50, 24, 50, 24), new Coord2D(50, 24, 50, 24), new Coord2D(13, 24, 13, 24), new Coord2D(1, 24, 1, 24)}), 3, 54, 24, 153, 3, ModelRendererTurbo.MR_FRONT, new float[]{25, 12, 37, 0, 25, 54}); // Import Shape4
		rightWingModel[1].setRotationPoint(-48F, -20F, -8F);
		rightWingModel[1].rotateAngleX = -1.48352986F;
		rightWingModel[1].rotateAngleY = 3.15904595F;
		rightWingModel[1].rotateAngleZ = 0.05235988F;

		rightWingModel[2].addShape3D(0F, 0F, -2F, new Shape2D(new Coord2D[]{new Coord2D(0, 0, 0, 0), new Coord2D(54, 0, 54, 0), new Coord2D(50, 24, 50, 24), new Coord2D(50, 24, 50, 24), new Coord2D(13, 24, 13, 24), new Coord2D(1, 24, 1, 24)}), 3, 54, 24, 153, 3, ModelRendererTurbo.MR_FRONT, new float[]{25, 12, 37, 0, 25, 54}); // Import Shape5
		rightWingModel[2].setRotationPoint(-48F, -21F, 7F);
		rightWingModel[2].rotateAngleX = 1.48352986F;
		rightWingModel[2].rotateAngleY = 3.14159265F;
		rightWingModel[2].rotateAngleZ = 0.05235988F;

		rightWingModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[]{new Coord2D(1, 0, 1, 0), new Coord2D(50, 0, 50, 0), new Coord2D(28, 95, 28, 95), new Coord2D(21, 99, 21, 99), new Coord2D(10, 99, 10, 99), new Coord2D(7, 95, 7, 95)}), 3, 50, 99, 268, 3, ModelRendererTurbo.MR_FRONT, new float[]{96, 5, 11, 9, 98, 49}); // Import Shape8
		rightWingModel[3].setRotationPoint(-47.7F, -25F, 30.5F);
		rightWingModel[3].rotateAngleX = 1.48352986F;
		rightWingModel[3].rotateAngleY = 3.14159265F;
		rightWingModel[3].rotateAngleZ = 0.05235988F;


		yawFlapModel = new ModelRendererTurbo[9];
		yawFlapModel[0] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box8
		yawFlapModel[1] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import Box9
		yawFlapModel[2] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import Box10
		yawFlapModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box12
		yawFlapModel[4] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import Box26
		yawFlapModel[5] = new ModelRendererTurbo(this, 10, 330, textureX, textureY); // Import Box26
		yawFlapModel[6] = new ModelRendererTurbo(this, 10, 330, textureX, textureY); // Import Box26
		yawFlapModel[7] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import Box26
		yawFlapModel[8] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Import Box26

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 6, 3, 2, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box8
		yawFlapModel[0].setRotationPoint(109F, -65F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -1F, 12, 25, 2, 0F, 0F, 0F, 0F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box9
		yawFlapModel[1].setRotationPoint(109F, -62F, 0F);

		yawFlapModel[2].addShapeBox(0F, -2F, -1F, 12, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 3F, 0F); // Import Box10
		yawFlapModel[2].setRotationPoint(109F, -35F, 0F);

		yawFlapModel[3].addBox(0F, 0F, -1F, 2, 1, 2, 0F); // Import Box12
		yawFlapModel[3].setRotationPoint(119.5F, -38F, 0F);

		yawFlapModel[4].addBox(0F, 0F, -5F, 1, 3, 2, 0F); // Import Box26
		yawFlapModel[4].setRotationPoint(-23F, -26F, 0F);
		yawFlapModel[4].rotateAngleZ = 0.45378561F;

		yawFlapModel[5].addBox(-5F, 1F, -4.5F, 5, 1, 1, 0F); // Import Box26
		yawFlapModel[5].setRotationPoint(-23F, -26F, 0F);
		yawFlapModel[5].rotateAngleZ = 0.45378561F;

		yawFlapModel[6].addBox(-5F, 1F, 3.5F, 5, 1, 1, 0F); // Import Box26
		yawFlapModel[6].setRotationPoint(-23F, -26F, 0F);
		yawFlapModel[6].rotateAngleZ = 0.45378561F;

		yawFlapModel[7].addBox(0F, 0F, 3F, 1, 3, 2, 0F); // Import Box26
		yawFlapModel[7].setRotationPoint(-23F, -26F, 0F);
		yawFlapModel[7].rotateAngleZ = 0.45378561F;

		yawFlapModel[8].addShapeBox(0F, -13F, -0.5F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Import Box26
		yawFlapModel[8].setRotationPoint(-20.5F, -23.5F, 0F);
		yawFlapModel[8].rotateAngleZ = 0.15707963F;


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Import Box14

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 9, 2, 36, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F); // Import Box14
		pitchFlapLeftModel[0].setRotationPoint(107F, -38F, -38F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import Box6

		pitchFlapRightModel[0].addShapeBox(0F, -1F, -36F, 9, 2, 36, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, -3.5F, -0.5F, 0F, 0F, 0F, 0F); // Import Box6
		pitchFlapRightModel[0].setRotationPoint(107F, -38F, 38F);


		tailWheelModel = new ModelRendererTurbo[6];
		tailWheelModel[0] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Import Box80
		tailWheelModel[1] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box81
		tailWheelModel[2] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box82
		tailWheelModel[3] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box83
		tailWheelModel[4] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box84
		tailWheelModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box85

		tailWheelModel[0].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import Box80
		tailWheelModel[0].setRotationPoint(91F, -21F, -0.5F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Import Box81
		tailWheelModel[1].setRotationPoint(90F, -24F, -1F);

		tailWheelModel[2].addShapeBox(0F, -4F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box82
		tailWheelModel[2].setRotationPoint(90F, -24F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		tailWheelModel[3].setRotationPoint(91F, -22F, -0.5F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box84
		tailWheelModel[4].setRotationPoint(91F, -18F, -0.5F);

		tailWheelModel[5].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import Box85
		tailWheelModel[5].setRotationPoint(84F, -21.5F, -2F);
		tailWheelModel[5].rotateAngleZ = 0.13962634F;


		leftWingWheelModel = new ModelRendererTurbo[8];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box100
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Import Box101
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import Box102
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box103
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import Box104
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box108
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box0
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import Box3

		leftWingWheelModel[0].addShapeBox(-49F, 23F, -38F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box100
		leftWingWheelModel[0].setRotationPoint(0F, -11F, 23F);
		leftWingWheelModel[0].rotateAngleX = -0.15707963F;

		leftWingWheelModel[1].addBox(-49F, 17F, -38F, 14, 6, 4, 0F); // Import Box101
		leftWingWheelModel[1].setRotationPoint(0F, -11F, 23F);
		leftWingWheelModel[1].rotateAngleX = -0.15707963F;

		leftWingWheelModel[2].addShapeBox(-49F, 13F, -38F, 14, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		leftWingWheelModel[2].setRotationPoint(0F, -11F, 23F);
		leftWingWheelModel[2].rotateAngleX = -0.15707963F;

		leftWingWheelModel[3].addBox(-43F, 19F, -38.5F, 2, 2, 5, 0F); // Import Box103
		leftWingWheelModel[3].setRotationPoint(0F, -11F, 23F);
		leftWingWheelModel[3].rotateAngleX = -0.15707963F;

		leftWingWheelModel[4].addShapeBox(-43F, 10F, -34F, 2, 8, 1, 0F, -1.66666667F, 1F, 0F, 1.66666667F, 1F, 0F, 1.66666667F, 1F, 0F, -1.66666667F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box104
		leftWingWheelModel[4].setRotationPoint(0F, -11F, 23F);
		leftWingWheelModel[4].rotateAngleX = -0.15707963F;

		leftWingWheelModel[5].addShapeBox(-40.5F, 6F, -38.3F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box108
		leftWingWheelModel[5].setRotationPoint(0F, -11F, 23F);
		leftWingWheelModel[5].rotateAngleX = -0.15707963F;

		leftWingWheelModel[6].addShapeBox(-43F, -5F, -37F, 2, 14, 2, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -2.08333333F, 1F, -1F, 2.08333333F, 1F, -1F, 2.08333333F, 1F, 1F, -2.08333333F, 1F, 1F); // Import Box0
		leftWingWheelModel[6].setRotationPoint(0F, -11F, 23F);
		leftWingWheelModel[6].rotateAngleX = -0.15707963F;

		leftWingWheelModel[7].addShapeBox(-45F, -5F, -33.5F, 4, 22, 1, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -1F, -2F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, -2F, 0F); // Import Box3
		leftWingWheelModel[7].setRotationPoint(0F, -14F, 23F);
		leftWingWheelModel[7].rotateAngleX = -0.01745329F;


		rightWingWheelModel = new ModelRendererTurbo[8];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box86
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box87
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import Box88
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box89
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Box91
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import Box92
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box105
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import Box106

		rightWingWheelModel[0].addBox(-49F, 18F, 11F, 14, 6, 4, 0F); // Import Box86
		rightWingWheelModel[0].setRotationPoint(0F, -16F, 0F);
		rightWingWheelModel[0].rotateAngleX = 0.12217305F;

		rightWingWheelModel[1].addShapeBox(-43F, -4F, 12F, 2, 14, 2, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -2.08333333F, 1F, 1F, 2.08333333F, 1F, 1F, 2.08333333F, 1F, -1F, -2.08333333F, 1F, -1F); // Import Box87
		rightWingWheelModel[1].setRotationPoint(0F, -16F, 0F);
		rightWingWheelModel[1].rotateAngleX = 0.12217305F;

		rightWingWheelModel[2].addBox(-43F, 20F, 10.5F, 2, 2, 5, 0F); // Import Box88
		rightWingWheelModel[2].setRotationPoint(0F, -16F, 0F);
		rightWingWheelModel[2].rotateAngleX = 0.12217305F;

		rightWingWheelModel[3].addShapeBox(-43F, 11F, 10F, 2, 8, 1, 0F, -1.66666667F, 1F, 0F, 1.66666667F, 1F, 0F, 1.66666667F, 1F, 0F, -1.66666667F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box89
		rightWingWheelModel[3].setRotationPoint(0F, -16F, 0F);
		rightWingWheelModel[3].rotateAngleX = 0.12217305F;

		rightWingWheelModel[4].addShapeBox(-49F, 14F, 11F, 14, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		rightWingWheelModel[4].setRotationPoint(0F, -16F, 0F);
		rightWingWheelModel[4].rotateAngleX = 0.12217305F;

		rightWingWheelModel[5].addShapeBox(-49F, 24F, 11F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box92
		rightWingWheelModel[5].setRotationPoint(0F, -16F, 0F);
		rightWingWheelModel[5].rotateAngleX = 0.12217305F;

		rightWingWheelModel[6].addShapeBox(-40.5F, 7F, 9.3F, 3, 1, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		rightWingWheelModel[6].setRotationPoint(0F, -16F, 0F);
		rightWingWheelModel[6].rotateAngleX = 0.12217305F;

		rightWingWheelModel[7].addShapeBox(-45F, -4F, 9.5F, 4, 22, 1, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -1F, -2F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, -2F, 0F); // Import Box106
		rightWingWheelModel[7].setRotationPoint(0F, -16F, 0F);
		rightWingWheelModel[7].rotateAngleX = -0.01745329F;


		bodyDoorOpenModel = new ModelRendererTurbo[10];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box2
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box3
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box4
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box6
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import Box8
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box9
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box10
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Import Box11
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import Box12
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box15

		bodyDoorOpenModel[0].addBox(-21F, -10F, -51F, 1, 1, 8, 0F); // Import Box2
		bodyDoorOpenModel[0].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[0].rotateAngleX = -1.71042267F;

		bodyDoorOpenModel[1].addShapeBox(-21F, -10F, -55F, 1, 8, 1, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import Box3
		bodyDoorOpenModel[1].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[1].rotateAngleX = -1.71042267F;

		bodyDoorOpenModel[2].addShapeBox(-21F, -10F, -40F, 1, 8, 1, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import Box4
		bodyDoorOpenModel[2].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[2].rotateAngleX = -1.71042267F;

		bodyDoorOpenModel[3].addShapeBox(-20F, -10F, -51F, 26, 1, 1, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		bodyDoorOpenModel[3].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[3].rotateAngleX = -1.71042267F;

		bodyDoorOpenModel[4].addBox(-17F, -10F, -50F, 1, 1, 6, 0F); // Import Box8
		bodyDoorOpenModel[4].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[4].rotateAngleX = -1.71042267F;

		bodyDoorOpenModel[5].addShapeBox(0F, -10F, -51F, 5, 1, 1, 0F, 1.5F, -7F, 5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, -7F, -5F, 0F, 6F, 5F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 6F, -5F); // Import Box9
		bodyDoorOpenModel[5].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[5].rotateAngleX = -1.71042267F;

		bodyDoorOpenModel[6].addShapeBox(0F, -10F, -44F, 5, 1, 1, 0F, 1.5F, -7F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, -7F, 5F, 0F, 6F, -5F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 6F, 5F); // Import Box10
		bodyDoorOpenModel[6].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[6].rotateAngleX = -1.71042267F;

		bodyDoorOpenModel[7].addShapeBox(-20F, -10F, -44F, 26, 1, 1, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyDoorOpenModel[7].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[7].rotateAngleX = -1.71042267F;

		bodyDoorOpenModel[8].addShapeBox(-17F, -10F, -50F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box12
		bodyDoorOpenModel[8].setRotationPoint(22F, 0F, 0F);
		bodyDoorOpenModel[8].rotateAngleX = -1.71042267F;

		bodyDoorOpenModel[9].addShapeBox(-17F, -3F, -56F, 26, 1, 1, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyDoorOpenModel[9].setRotationPoint(0F, 0F, 0F);
		bodyDoorOpenModel[9].rotateAngleX = -1.71042267F;
		bodyDoorOpenModel[9].rotateAngleZ = 0.05235988F;


		bodyDoorCloseModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box75
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import Box85
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box99
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box100
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Import Box101
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import Box13

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		bodyDoorCloseModel[0].setRotationPoint(-20F, -46F, -4F);
		bodyDoorCloseModel[0].rotateAngleX = 0.01745329F;
		bodyDoorCloseModel[0].rotateAngleZ = -0.03490659F;

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Import Box85
		bodyDoorCloseModel[1].setRotationPoint(-17F, -46F, -3F);
		bodyDoorCloseModel[1].rotateAngleX = 0.01745329F;
		bodyDoorCloseModel[1].rotateAngleZ = -0.03490659F;

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1.5F, -7F, 5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, -7F, -5F, 0F, 6F, 5F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 6F, -5F); // Import Box99
		bodyDoorCloseModel[2].setRotationPoint(0F, -46F, -4F);
		bodyDoorCloseModel[2].rotateAngleX = 0.01745329F;
		bodyDoorCloseModel[2].rotateAngleZ = -0.03490659F;

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1.5F, -7F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, -7F, 5F, 0F, 6F, -5F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 6F, 5F); // Import Box100
		bodyDoorCloseModel[3].setRotationPoint(0F, -46F, 3F);
		bodyDoorCloseModel[3].rotateAngleX = 0.01745329F;
		bodyDoorCloseModel[3].rotateAngleZ = -0.03490659F;

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		bodyDoorCloseModel[4].setRotationPoint(-20F, -46F, 3F);
		bodyDoorCloseModel[4].rotateAngleX = 0.01745329F;
		bodyDoorCloseModel[4].rotateAngleZ = -0.03490659F;

		bodyDoorCloseModel[5].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Import Box13
		bodyDoorCloseModel[5].setRotationPoint(5F, -46F, -3F);
		bodyDoorCloseModel[5].rotateAngleX = 0.01745329F;
		bodyDoorCloseModel[5].rotateAngleZ = -0.03490659F;


		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-87F, -31F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 197, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 197, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 197, textureX, textureY);
		prop[0].addBox(-0.5F, -33F, -2F, 1, 33, 4, 0.0F);
		prop[1].addBox(-0.5F, -33F, -2F, 1, 33, 4, 0.0F);
		prop[2].addBox(-0.5F, -33F, -2F, 1, 33, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}
